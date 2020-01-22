package com.mimacom.ddd.dm.dim.ui.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.DAssociation
import com.mimacom.ddd.dm.base.DAttribute
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DDetailType
import com.mimacom.ddd.dm.base.DDomain
import com.mimacom.ddd.dm.base.DEntityOrigin
import com.mimacom.ddd.dm.base.DEntityType
import com.mimacom.ddd.dm.base.DEnumeration
import com.mimacom.ddd.dm.base.DNavigableMember
import com.mimacom.ddd.dm.base.DPrimitive
import com.mimacom.ddd.dm.base.DQuery
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.dim.DimUtil
import com.mimacom.ddd.dm.dim.ui.internal.DimActivator
import java.util.Map
import net.sourceforge.plantuml.text.AbstractDiagramTextProvider
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.IEditorInput
import org.eclipse.ui.IEditorPart
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.XtextDocument

class DimDiagramTextProvider extends AbstractDiagramTextProvider {

	@Inject extension DimUtil
	
	new () {
        editorType = typeof(XtextEditor)
    }
    
	override supportsEditor(IEditorPart editorPart) {
		super.supportsEditor(editorPart) && (editorPart as XtextEditor).languageName.equals(DimActivator.COM_MIMACOM_DDD_DM_DIM_DIM)
	}
	
	override supportsSelection(ISelection sel) {
		return false;
	}
				
	override protected getDiagramText(IEditorPart editorPart, IEditorInput editorInput, ISelection sel, Map<String, Object> obj) {
        // Retrieve  "semantic" EMF model from XtextEditor
        val document = (editorPart as XtextEditor).getDocumentProvider().getDocument(editorInput) as XtextDocument;
        val DDomain domain = document.readOnly[
            return if (contents.head instanceof DDomain) contents.head as DDomain else null
        ]
        
        if (domain !== null && ! (domain.types.empty && domain.aggregates.empty)) {
        	return domainTypes(domain)
        } else {
        	return '''note "No structures to show." as N1'''
        }
	}
	
	def domainTypes(DDomain domain) {
		val allAggregates = EcoreUtil2.eAllOfType(domain, DAggregate)
		val allAssociations = EcoreUtil2.eAllOfType(domain, DAssociation).filter[getType instanceof DEntityType]
//		val allEntitiesReferencedWithinAggregate = allAssociations.filter[targetType.eContainer == eContainer.eContainer].map[targetType]
		val allEntitiesReferencedWithinDomain = allAssociations.filter[targetType.eContainer != eContainer.eContainer && targetType.domainName == domain.name].map[targetType]
		val allAggregatesReferencedWithinDomain = allEntitiesReferencedWithinDomain.map[eContainer as DAggregate]
		val allEntitiesReferencedOutsideDomain = allAssociations.filter[targetType.eContainer != eContainer.eContainer && targetType.domainName != domain.name].map[targetType]
		val allDomainsReferencedOutsideDomain = allEntitiesReferencedOutsideDomain.map[domainName]
		val allDetailAttributes = EcoreUtil2.eAllOfType(domain, DAttribute).filter[getType instanceof DDetailType]
		val allSubtypes = EcoreUtil2.eAllOfType(domain, DComplexType).filter[superType !== null]
        
       val result = '''
			 hide empty members
			
			skinparam package {
				BorderColor FireBrick
				FontColor FireBrick
			}
			
			«IF ! domain.types.empty»
				' all domain-level types
				«FOR t:domain.types»
					«t.generateType»
				«ENDFOR»
			«ENDIF»
			
			' all aggregates
			«FOR a:allAggregates»package «a.aggregateName» <<Rectangle>> {
				«IF ! a.features.empty»«a.generateAggregateQueries»«ENDIF»
				«FOR t:a.types»
					«t.generateType»
				«ENDFOR»
			}
			«ENDFOR»
			
			' all aggregates referenced from within current domain
			«FOR awa:allAggregatesReferencedWithinDomain»
				package «awa.aggregateName» <<Rectangle>> {
				}
			«ENDFOR»
			
			' all entities referenced from within current domain
«««			This generates duplicate entries when a type if referenced from another aggregate:
«««			«FOR re:allEntitiesReferencedWithinDomain»
«««				«re.generateType»
«««			«ENDFOR»
			
			' all other referenced domains
			«FOR rd:allDomainsReferencedOutsideDomain»
				package «rd» <<Frame>> { 
				}
			«ENDFOR»
			
			' all associations
			«FOR a:allAssociations»
				«a.generateAssociation»
			«ENDFOR»
			
			' all detail attributes
			«FOR a:allDetailAttributes»
				«a.generateLink»
			«ENDFOR»
			
			' all subtypes
			«FOR s:allSubtypes»
				«s.aggregateName».«s.name» --|> «s.superType.aggregateName»«IF s.aggregateName === s.superType.aggregateName».«s.superType.name»«ENDIF»
			«ENDFOR»
        '''
       return result
	}
	
	def  generateAggregateQueries(DAggregate a) '''	
		' aggregate «a.name» static queries
		abstract class «a.name».«a.name» «a.getSpot» {
			«FOR q : a.features»«(q as DQuery).generateStaticQuery»«ENDFOR»
		}
	'''
	
	def dispatch  generateType(DComplexType c) '''	
		«IF c.abstract»abstract «ENDIF»class «c.aggregateName».«c.name» «c.getSpot» {
			«FOR f:c.features»«f.generateFeature»«ENDFOR»
		}
	'''
	
	def dispatch  generateType(DPrimitive p) '''	
		class «p.aggregateName».«p.name» «p.getSpot»
	'''
	
	def dispatch  generateType(DEnumeration e)  '''
		enum «e.aggregateName».«e.name» «e.getSpot» {
			«FOR f:e.literals»
				«f.name»
			«ENDFOR»
		}
	'''
	
	def dispatch generateType(DType t)  '''
	'''
	
	def getSpot(DAggregate a) {
		"<< (Q,Gold) >>"
	}
	
	def getSpot(DType t) {
		// Returns the "Spot Letter" to use next to the class name.
		return switch t {
		DEntityType : if (t.root) "<< (R,#FB3333) >>" else if (t.origin == DEntityOrigin.RELATIONSHIP) "<< (R,#FA78C8) >>" else "<< (E,#F78100) >>"
		DDetailType : "<< (D,#FAE55F) >>"
		DEnumeration: "<< (e,#66B371) >>"
		DPrimitive:  "<< (p,#9AF78F) >>"
		default:""
		}
	}
	
	def generateStaticQuery(DQuery q) '''
	   «IF q.getType !== null»
	   		{static} «q.name»(«q.generateQueryParameters») : «q.getType.name» «q.generateMultiplicity»
	   	«ENDIF»
	 '''
	
	def dispatch generateFeature(DAttribute a) '''
		«IF ! (a?.getType instanceof DDetailType)»«a.name» : «a.getType.name»«ENDIF» «a.generateMultiplicity»
	  '''

	def dispatch generateFeature(DQuery q) '''
	   «IF q.getType !== null»
	   		«q.name»(«q.generateQueryParameters») : «q.getType.name» «q.generateMultiplicity»
	   	«ENDIF»
	 '''
	
	def dispatch generateFeature(DAssociation a)  '''
	'''
	
	def generateQueryParameters(DQuery q) 
	'''«FOR p:q.parameters SEPARATOR ", "»«p.name»:«p.getType.name» «p.generateMultiplicity»«ENDFOR»'''
	
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
		«source.aggregateName».«source.name» «sourceArrowhead»--«targetArrowhead» «getTargetName(source,target)» : «targetRole»
	'''
	
	def String getTargetName(DType source, DType target) {
		if (source.domainName == target.domainName) {
			if (source.aggregateName == target.aggregateName) return target.aggregateName + "." + target.name
			return  target.aggregateName
		}
		return target.domainName
	}
	
	def generateMultiplicity(DNavigableMember member) {
		if (member.multiplicity === null) return ""
		val maxOccurs = if (member.multiplicity.maxOccurs == -1) "*" else member.multiplicity.maxOccurs.toString
		return "("+member.multiplicity.minOccurs+","+maxOccurs+")"
	}
}