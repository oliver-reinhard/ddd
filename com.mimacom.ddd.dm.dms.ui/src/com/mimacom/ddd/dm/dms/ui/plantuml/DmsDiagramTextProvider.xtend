package com.mimacom.ddd.dm.dms.ui.plantuml

import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.DAssociation
import com.mimacom.ddd.dm.base.DAttribute
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DDetailType
import com.mimacom.ddd.dm.base.DDomain
import com.mimacom.ddd.dm.base.DEnumeration
import com.mimacom.ddd.dm.base.DModel
import com.mimacom.ddd.dm.base.DQuery
import com.mimacom.ddd.dm.base.DRelationship
import com.mimacom.ddd.dm.base.DRootType
import com.mimacom.ddd.dm.base.DType
import java.util.Map
import net.sourceforge.plantuml.text.AbstractDiagramTextProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.IEditorInput
import org.eclipse.ui.IEditorPart
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.XtextDocument
import com.mimacom.ddd.dm.base.DAssociationKind

class DmsDiagramTextProvider extends AbstractDiagramTextProvider {
	
	// @Inject extension DmsUtil // TODO injector not working, bundle setup seems ok => ?
	
	def DmsDiagramTextProvider() {
        //fileExtensions = "mydsl";
        editorType = typeof(XtextEditor)
    }
	
	override supportsSelection(ISelection sel) {
		return true;
	}
				
	override protected getDiagramText(IEditorPart editorPart, IEditorInput editorInput, ISelection sel, Map<String, Object> obj) {
        // Retrieve the "semantic" EMF from XtextEditor
        val document = (editorPart as XtextEditor).getDocumentProvider().getDocument(editorInput) as XtextDocument;
        val DModel model = document.readOnly[
            return contents.head as DModel
        ]
         
        val domain = model.domain
        if (domain === null) {
        	return ""
        }
        val allAggregates = EcoreUtil2.eAllOfType(domain, DAggregate)
        val allAssociations = EcoreUtil2.eAllOfType(domain, DAssociation).filter[type instanceof DRootType]
        val allReferencedDomains = allAssociations.filter[targetType.domainName != domain.name].map[targetType.domainName]
        val allDetailAttributes = EcoreUtil2.eAllOfType(domain, DAttribute).filter[type instanceof DDetailType]
        val allSubtypes = EcoreUtil2.eAllOfType(domain, DComplexType).filter[superType !== null]
        
       val result = '''
           	«FOR a:allAggregates»package «a.aggregateName» <<Rectangle>> {
    				«FOR t:a.types»«t.generateType»«ENDFOR»
           	}
           	«FOR d:allReferencedDomains»package «d» <<Frame>> { 
           	}
           	«ENDFOR»
    		«ENDFOR»
            «FOR a:allAssociations»«a.generateAssociation»
            «ENDFOR»
            «FOR a:allDetailAttributes»«a.generateLink»
            «ENDFOR»
            «FOR s:allSubtypes»«s.aggregateName».«s.name» --|> «s.superType.aggregateName»
            «ENDFOR»
        '''
       return result
	}
	
	def String domainName(EObject obj) {
			val d = EcoreUtil2.getContainerOfType(obj, DDomain) // global types are not owned by a domain => null
			return if (d !== null) d.name else "undefined" 
	}
	
	def String aggregateName(EObject obj) {
			val a = EcoreUtil2.getContainerOfType(obj, DAggregate)// global types are not owned by a domain => null
			return if (a !== null) a.rootName else "undefined" 
	}
	
	def dispatch  generateType(DComplexType c) '''	
		«IF c.abstract»abstract «ENDIF»class «c.aggregateName».«c.name» «c.getSpot» {
			«FOR f:c.features»«f.generateFeature»«ENDFOR»
		}
	'''
	
	def getSpot(DType t) {
		// Returns the "Spot Letter" to use next to the class name.
		switch t {
		DRootType : "<< (R,crimson) >>"
		DDetailType : "<< (D,grey) >>"
		DRelationship:  "<< (R,navy) >>"
		default:""
		}
	}
	
	def dispatch  generateType(DEnumeration e)  '''
		enum «e.name» << (E,green) >> {
			«FOR f:e.literals»
				«f.name»
			«ENDFOR»
		}
	'''
	
	def dispatch generateType(DType t)  '''
	'''
	
	
	def dispatch generateFeature(DAttribute a) '''
	  	«IF ! (a?.type instanceof DDetailType)» «a.name» : «a.type.name»«ENDIF»
	  '''

	def dispatch generateFeature(DQuery q) '''
	   «IF q.type !== null»
	   		«q.name»() : «q.type.name» 
	   	«ENDIF»
	 '''
	
	def dispatch generateFeature(DAssociation a)  '''
	'''
	
	def generateAssociation(DAssociation a ) {
		return switch a.kind {
			case REFERENCE: generateLink('', a.eContainer as DType, a.type, a.name, '>')
			case COMPOSITE:  generateLink('*', a.eContainer as DType, a.type, a.name, '>')
			case INVERSE_COMPOSITE: generateLink('}', a.eContainer as DType, a.type, a.name, '*')
		}
	}
	
	def generateLink(DAttribute a) {
		return generateLink('*', a.eContainer as DType, a.type, a.name, "")
	}
	
	def generateLink(String sourceArrowhead, DType source, DType target, String targetRole, String targetArrowhead) '''
		«source.aggregateName».«source.name» «sourceArrowhead»--«targetArrowhead» «IF source.domainName == target.domainName»«target.aggregateName»«ELSE»«target.domainName»«ENDIF»«IF target instanceof DDetailType».«target.name»«ENDIF» : «targetRole»
	'''
}