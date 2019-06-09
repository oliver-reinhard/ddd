package com.mimacom.ddd.sm.sim.ui.plantuml

import com.mimacom.ddd.sm.sim.SAggregate
import com.mimacom.ddd.sm.sim.SAssociation
import com.mimacom.ddd.sm.sim.SAttribute
import com.mimacom.ddd.sm.sim.SComplexType
import com.mimacom.ddd.sm.sim.SDetailType
import com.mimacom.ddd.sm.sim.SEntityType
import com.mimacom.ddd.sm.sim.SEnumeration
import com.mimacom.ddd.sm.sim.SInformationModel
import com.mimacom.ddd.sm.sim.SPrimitive
import com.mimacom.ddd.sm.sim.SQuery
import com.mimacom.ddd.sm.sim.SType
import com.mimacom.ddd.sm.sim.ui.internal.SimActivator
import java.util.Map
import net.sourceforge.plantuml.text.AbstractDiagramTextProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.IEditorInput
import org.eclipse.ui.IEditorPart
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.XtextDocument

import static com.mimacom.ddd.sm.sim.SElementNature.*

class SimDiagramTextProvider extends AbstractDiagramTextProvider {
	
	// @Inject extension DmsUtil // TODO injector not working, bundle setup seems ok => ?
	
	def DmsDiagramTextProvider() {
        editorType = typeof(XtextEditor)
    }
    
	override supportsEditor(IEditorPart editorPart) {
		super.supportsEditor(editorPart) && (editorPart as XtextEditor).languageName.equals(SimActivator.COM_MIMACOM_DDD_SM_SIM_SIM)
	}
	
	override supportsSelection(ISelection sel) {
		return false;
	}
				
	override protected getDiagramText(IEditorPart editorPart, IEditorInput editorInput, ISelection sel, Map<String, Object> obj) {
        // Retrieve "semantic" EMF model from XtextEditor
        val document = (editorPart as XtextEditor).getDocumentProvider().getDocument(editorInput) as XtextDocument;
        val SInformationModel model = document.readOnly[
            return if (contents.head instanceof SInformationModel) contents.head as SInformationModel else null
        ]
        
        if (model !== null && ! model.aggregates.empty) {
        	return modelTypes(model)
        } else {
        	return '''note "No structures to show." as N1'''
        }
	}
	
	def modelTypes(SInformationModel model) {
        val allAggregates = EcoreUtil2.eAllOfType(model, SAggregate).filter[nature != DEDUCTION_RULE]
        val allAssociations = EcoreUtil2.eAllOfType(model, SAssociation).filter[type instanceof SEntityType && nature != DEDUCTION_RULE]
        val allReferencedDomains = allAssociations.filter[targetType.modelName != model.name].map[targetType.modelName]
        val allDetailAttributes = EcoreUtil2.eAllOfType(model, SAttribute).filter[type instanceof SDetailType && nature != DEDUCTION_RULE]
        val allSubtypes = EcoreUtil2.eAllOfType(model, SComplexType).filter[superType !== null]
        
       val result = '''
       		hide empty members
       		
       		skinparam class {
       			ArrowColor MediumBlue
       			BorderColor MediumBlue
       			BackgroundColor AliceBlue
       		}
       		
       		skinparam package {
       			BorderColor MediumBlue
       			FontColor MediumBlue
       		}
       		
           	«FOR a:allAggregates»package «a.aggregateName» <<Rectangle>> {
	    				«FOR t:a.types.filter[nature != DEDUCTION_RULE]»«t.generateType»«ENDFOR»
           		}
	           	«FOR d:allReferencedDomains»package «d» <<Frame>> { 
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
	
	def String modelName(EObject obj) {
			val d = EcoreUtil2.getContainerOfType(obj, SInformationModel)
			return if (d !== null) d.name else "undefined" 
	}
	
	def String aggregateName(EObject obj) {
			val a = EcoreUtil2.getContainerOfType(obj, SAggregate)// global types are not owned by a domain => null
			return if (a !== null) a.derivedName else "undefined" 
	}
	
	def dispatch  generateType(SComplexType c) '''	
		«IF c.abstract»abstract «ENDIF»class «c.aggregateName».«c.name» «c.getSpot» {
			«FOR f:c.features.filter[nature != DEDUCTION_RULE]»«f.generateFeature»«ENDFOR»
		}
	'''
	
	def dispatch  generateType(SPrimitive p) '''	
		class «p.name» «p.getSpot»
	'''
	
	def dispatch  generateType(SEnumeration e)  '''
		enum «e.name» «e.getSpot» {
			«FOR f:e.literals»
				«f.name»
			«ENDFOR»
		}
	'''
	
	def dispatch generateType(SType t)  '''
	'''
	
	def getSpot(SType t) {
		// Returns the "Spot Letter" to use next to the class name.
		switch t {
		SEntityType : if (t.root) "<< (R,#FB3333) >>" else "<< (E,#F78100) >>"
		SDetailType : "<< (D,#FAE55F) >>"
		SEnumeration: "<< (e,#66B371) >>"
		SPrimitive:  "<< (p,#9AF78F) >>"
		default:""
		}
	}
	
	
	def dispatch generateFeature(SAttribute a) '''
	  	«IF ! (a?.type instanceof SDetailType)»«a.name» : «a.type?.name»«ENDIF»
	  '''

	def dispatch generateFeature(SQuery q) '''
	   «IF q.type !== null»
	   		«q.name»(«q.generateQueryParameters») : «q.type.name» 
	   	«ENDIF»
	 '''
	
	def dispatch generateFeature(SAssociation a)  '''
	'''
	
	def generateQueryParameters(SQuery q) 
	'''«FOR p:q.parameters SEPARATOR ", "»«p.name»:«p.type.name»«ENDFOR»'''
	
	def generateAssociation(SAssociation a ) {
		return switch a.kind {
			case REFERENCE: generateLink('', a.eContainer as SType, a.type, a.name, '>')
			case COMPOSITE:  generateLink('*', a.eContainer as SType, a.type, a.name, '>')
			case INVERSE_COMPOSITE: generateLink('}', a.eContainer as SType, a.type, a.name, '*')
		}
	}
	
	def generateLink(SAttribute a) {
		return generateLink('*', a.eContainer as SType, a.type, a.name, "")
	}
	
	def generateLink(String sourceArrowhead, SType source, SType target, String targetRole, String targetArrowhead) '''
		«source.aggregateName».«source.name» «sourceArrowhead»--«targetArrowhead» «getTargetName(source,target)» : «targetRole»
	'''
	
	def String getTargetName(SType source, SType target) {
		if (source.modelName == target.modelName) {
			if (source.aggregateName == target.aggregateName) return target.aggregateName + "." + target.name
			return  target.aggregateName
		}
		return target.modelName
	}
}