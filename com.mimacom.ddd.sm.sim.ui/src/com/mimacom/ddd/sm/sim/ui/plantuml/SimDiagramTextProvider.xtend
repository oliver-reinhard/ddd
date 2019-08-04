package com.mimacom.ddd.sm.sim.ui.plantuml

import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.DAssociation
import com.mimacom.ddd.dm.base.DAttribute
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DDetailType
import com.mimacom.ddd.dm.base.DEntityType
import com.mimacom.ddd.dm.base.DEnumeration
import com.mimacom.ddd.dm.base.DPrimitive
import com.mimacom.ddd.dm.base.DQuery
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.sm.sim.SAggregateDeduction
import com.mimacom.ddd.sm.sim.SAssociationDeduction
import com.mimacom.ddd.sm.sim.SAttributeDeduction
import com.mimacom.ddd.sm.sim.SComplexTypeDeduction
import com.mimacom.ddd.sm.sim.SFeatureDeduction
import com.mimacom.ddd.sm.sim.SInformationModel
import com.mimacom.ddd.sm.sim.STypeDeduction
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
import com.mimacom.ddd.dm.base.IDeductionDefinition

class SimDiagramTextProvider extends AbstractDiagramTextProvider {
	
	// @Inject extension DimUtil // TODO injector not working, bundle setup seems ok => ?
	
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
        if (model === null || model.types.filter[!(it instanceof IDeductionDefinition)].empty && model.aggregates.filter[!(it instanceof IDeductionDefinition)].empty) {
        	return '''note "No structures to show." as N1'''
        }
        return modelTypes(model)
	}
	
	def modelTypes(SInformationModel model) {
        val allAggregates = EcoreUtil2.eAllOfType(model, DAggregate).filter[!(it instanceof SAggregateDeduction)]
        val allAssociations = EcoreUtil2.eAllOfType(model, DAssociation).filter[!(it instanceof SAssociationDeduction)]
        val allReferencedDomains = allAssociations.filter[targetType.modelName != model.name].map[targetType.modelName]
        val allComplexAttributes = EcoreUtil2.eAllOfType(model, DAttribute).filter[!(it instanceof SAttributeDeduction) && !(eContainer instanceof SComplexTypeDeduction)]
        val allSubtypes = EcoreUtil2.eAllOfType(model, DComplexType).filter[superType !== null]
        
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
			
			«FOR t:model.types.filter[!(it instanceof STypeDeduction)]»«t.generateType»«ENDFOR»
			
			«FOR a:allAggregates»
				package «a.aggregateName» <<Rectangle>> {
				«FOR t:a.types.filter[!(it instanceof STypeDeduction)]»«t.generateType»«ENDFOR»
				}
				«FOR d:allReferencedDomains»package «d» <<Frame>> { 
				}
           	«ENDFOR»
    		«ENDFOR»
            «FOR a:allAssociations»«a.generateAssociation»
            «ENDFOR»
            «FOR a:allComplexAttributes.filter[getType instanceof DDetailType]»«a.generateLink»
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
	
	/* 
	 * Copied from DimUtil due to flawed extension injection. TODO
	 */
	def String aggregateName(EObject obj) {
			val a = EcoreUtil2.getContainerOfType(obj, DAggregate)// global types are not owned by a domain => null
			return if (a !== null) a.name else "undefined" 
	}
	
	def dispatch  generateType(DComplexType c) '''	
		«IF c.abstract»abstract «ENDIF»class «c.qualifiedlName» «c.getSpot» {
			«FOR f:c.features.filter[!(it instanceof SFeatureDeduction)]»«f.generateFeature»«ENDFOR»
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
		switch t {
		DEntityType : if (t.root) "<< (R,#FB3333) >>" else "<< (E,#F78100) >>"
		DDetailType : "<< (D,#FAE55F) >>"
		DEnumeration: "<< (e,#66B371) >>"
		DPrimitive:  "<< (p,#9AF78F) >>"
		default:""
		}
	}
	
	
	def dispatch generateFeature(DAttribute a) '''
	  	«IF ! (a?.getType instanceof DDetailType)»«a.name» : «a.getType?.name»«ENDIF»
	  '''

	def dispatch generateFeature(DQuery q) '''
	   «IF q.getType !== null»
	   		«q.name»(«q.generateQueryParameters») : «q.getType.name» 
	   	«ENDIF»
	 '''
	
	def dispatch generateFeature(DAssociation a)  '''
	'''
	
	def generateQueryParameters(DQuery q) 
	'''«FOR p:q.parameters SEPARATOR ", "»«p.name»:«p.getType.name»«ENDFOR»'''
	
	def generateAssociation(DAssociation a ) {
		return switch a.kind {
			case REFERENCE: generateLink('', a.eContainer as DType, a.getType, a.name, '>')
			case COMPOSITE:  generateLink('*', a.eContainer as DType, a.getType, a.name, '>')
			case INVERSE_COMPOSITE: generateLink('}', a.eContainer as DType, a.getType, a.name, '*')
		}
	}
	
	def generateLink(DAttribute a) {
		return generateLink('+', a.eContainer as DType, a.getType, a.name, "")
	}
	
	def generateLink(String sourceArrowhead, DType source, DType target, String targetRole, String targetArrowhead) '''
		«source.qualifiedlName» «sourceArrowhead»--«targetArrowhead» «targetName(source,target)» : «targetRole»
	'''
	def qualifiedlName(DType t) 
	'''«if (t.eContainer instanceof DAggregate) t.aggregateName».«t.name»'''
	
	def targetName(DType source, DType target) {
		if (source.modelName == target.modelName) {
			if (source.aggregateName == target.aggregateName) {
				return target.qualifiedlName
			}
			return  target.aggregateName
		}
		return target.modelName
	}
}