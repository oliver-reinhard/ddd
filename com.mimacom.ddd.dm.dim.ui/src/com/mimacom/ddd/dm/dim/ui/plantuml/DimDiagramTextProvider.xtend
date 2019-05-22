package com.mimacom.ddd.dm.dim.ui.plantuml

import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.DAssociation
import com.mimacom.ddd.dm.base.DAttribute
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DDetailType
import com.mimacom.ddd.dm.base.DDomain
import com.mimacom.ddd.dm.base.DEnumeration
import com.mimacom.ddd.dm.base.DPrimitive
import com.mimacom.ddd.dm.base.DQuery
import com.mimacom.ddd.dm.base.DRelationship
import com.mimacom.ddd.dm.base.DEntityType
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.dim.ui.internal.DimActivator
import java.util.Map
import net.sourceforge.plantuml.text.AbstractDiagramTextProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.IEditorInput
import org.eclipse.ui.IEditorPart
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.XtextDocument

class DimDiagramTextProvider extends AbstractDiagramTextProvider {
	
	// @Inject extension DmsUtil // TODO injector not working, bundle setup seems ok => ?
	
	def DmsDiagramTextProvider() {
        editorType = typeof(XtextEditor)
    }
    
	override supportsEditor(IEditorPart editorPart) {
		super.supportsEditor(editorPart) && (editorPart as XtextEditor).languageName.equals(DimActivator.COM_MIMACOM_DDD_DM_DIM_DIM)
	}
	
	override supportsSelection(ISelection sel) {
		return false;
	}
				
	override protected getDiagramText(IEditorPart editorPart, IEditorInput editorInput, ISelection sel, Map<String, Object> obj) {
        // Retrieve the "semantic" EMF from XtextEditor
        val document = (editorPart as XtextEditor).getDocumentProvider().getDocument(editorInput) as XtextDocument;
        val DDomain domain = document.readOnly[
            return if (contents.head instanceof DDomain) contents.head as DDomain else null
        ]
        
        if (domain !== null && ! domain.aggregates.empty) {
        	return domainTypes(domain)
        } else {
        	return '''note "No structures to show." as N1'''
        }
	}
	
	def domainTypes(DDomain domain) {
        val allAggregates = EcoreUtil2.eAllOfType(domain, DAggregate)
        val allAssociations = EcoreUtil2.eAllOfType(domain, DAssociation).filter[type instanceof DEntityType]
        val allReferencedAggregatesInsideDomain = allAssociations.filter[targetType.domainName == domain.name && targetType.eContainer instanceof DAggregate].map[targetType.eContainer]
        val allReferencedEntitiesInsideDomain = allAssociations.filter[targetType.domainName == domain.name].map[targetType]
        val allReferencedOtherDomains = allAssociations.filter[targetType.domainName != domain.name].map[targetType.domainName]
        val allDetailAttributes = EcoreUtil2.eAllOfType(domain, DAttribute).filter[type instanceof DDetailType]
        val allSubtypes = EcoreUtil2.eAllOfType(domain, DComplexType).filter[superType !== null]
        
       val result = '''
       		hide empty members
       		       		
       		skinparam package {
       			BorderColor FireBrick
       			FontColor FireBrick
       		}
           	«FOR a:allAggregates»package «a.aggregateName» <<Rectangle>> {
	    				«FOR t:a.types»«t.generateType»«ENDFOR»
           		}
           		«FOR ra:allReferencedAggregatesInsideDomain»package «ra.aggregateName» <<Rectangle>> {
           		}
           		«ENDFOR»
	           	«FOR re:allReferencedEntitiesInsideDomain»«re.generateType»«ENDFOR»
	           	«FOR rd:allReferencedOtherDomains»package «rd» <<Frame>> { 
	           	}
	        	«ENDFOR»
    		«ENDFOR»
            «FOR a:allAssociations»«a.generateAssociation»
            «ENDFOR»
            «FOR a:allDetailAttributes»«a.generateLink»
            «ENDFOR»
            «FOR s:allSubtypes»«s.aggregateName».«s.name» --|> «s.superType.aggregateName»«IF s.aggregateName === s.superType.aggregateName».«s.superType.name»«ENDIF»
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
			return if (a !== null) a.derivedName else "undefined" 
	}
	
	def dispatch  generateType(DComplexType c) '''	
		«IF c.abstract»abstract «ENDIF»class «c.aggregateName».«c.name» «c.getSpot» {
			«FOR f:c.features»«f.generateFeature»«ENDFOR»
		}
	'''
	
	def dispatch  generateType(DPrimitive p) '''	
		class «p.name» «p.getSpot»
	'''
	
	def dispatch  generateType(DEnumeration e)  '''
		enum «e.name» «e.getSpot» {
			«FOR f:e.literals»
				«f.name»
			«ENDFOR»
		}
	'''
	
	def dispatch generateType(DType t)  '''
	'''
	
	def getSpot(DType t) {
		// Returns the "Spot Letter" to use next to the class name.
		return switch t {
		DEntityType : if (t.root) "<< (R,#FB3333) >>" else "<< (E,#F78100) >>"
		DDetailType : "<< (D,#FAE55F) >>"
		DRelationship:  "<< (R,#FA78C8) >>"
		DEnumeration: "<< (e,#66B371) >>"
		DPrimitive:  "<< (p,#9AF78F) >>"
		default:""
		}
	}
	
	
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
		«source.aggregateName».«source.name» «sourceArrowhead»--«targetArrowhead» «getTargetName(source,target)» : «targetRole»
	'''
	
	def String getTargetName(DType source, DType target) {
		if (source.domainName == target.domainName) {
			if (source.aggregateName == target.aggregateName) return target.aggregateName + "." + target.name
			return  target.aggregateName
		}
		return target.domainName
	}
}