package com.mimacom.ddd.dm.dom.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DAssociation
import com.mimacom.ddd.dm.base.base.DAttribute
import com.mimacom.ddd.dm.base.base.DExpression
import com.mimacom.ddd.dm.base.plantuml.PlantUmlTextProviderUtil
import com.mimacom.ddd.dm.dmx.DmxComplexObject
import com.mimacom.ddd.dm.dmx.DmxDetail
import com.mimacom.ddd.dm.dmx.DmxEntity
import com.mimacom.ddd.dm.dmx.DmxField
import com.mimacom.ddd.dm.dmx.DmxListExpression
import com.mimacom.ddd.dm.dmx.typecomputer.DmxComplexTypeDescriptor
import com.mimacom.ddd.dm.dom.DomModel
import com.mimacom.ddd.dm.dom.DomNamedComplexObject
import com.mimacom.ddd.dm.dom.DomSnapshot
import com.mimacom.ddd.dm.dom.DomUtil
import com.mimacom.ddd.dm.dom.evaluator.DomExpressionEvaluator
import com.mimacom.ddd.dm.dom.typecomputer.DomTypeComputer
import com.mimacom.ddd.util.plantuml.IPlantUmlDiagramTextProvider
import com.mimacom.ddd.util.plantuml.SkinparamArrow
import com.mimacom.ddd.util.plantuml.SkinparamClass
import com.mimacom.ddd.util.plantuml.SkinparamGlobal
import com.mimacom.ddd.util.plantuml.SkinparamNote
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.serializer.ISerializer

class DomObjectDiagramTextProviderImpl implements IPlantUmlDiagramTextProvider<DomModel> {
	
	@Inject extension DomUtil
	@Inject extension DomTypeComputer
	@Inject extension DomExpressionEvaluator
	@Inject extension PlantUmlTextProviderUtil

	static val MAX_EXPR_LENGTH = 30
	
	@Inject ISerializer serializer;
	
	@Inject SkinparamGlobal skinparamGlobal
	// Use PlantUML CLASS to represent objects for its capability to provide spots for the object kind.
	@Inject SkinparamClass skinparamClass
	@Inject SkinparamArrow skinparamArrow
	@Inject SkinparamNote skinparamNote
	
	override canProvide(DomModel model) {
		model !== null && ! (model.snapshots.empty)
	}

	override String diagramText(DomModel model) '''
		@startuml
		
		«generateSkinParameters()»
		
		«FOR s : model.snapshots»
			«s.generateSnapshot»
		«ENDFOR»
		
		@enduml
	'''
	
	def generateSkinParameters() '''
		«skinparamGlobal»
		
		«skinparamClass»
		
		«skinparamArrow»
		
		«skinparamNote»
	'''
	

	def generateSnapshot(DomSnapshot s) {
		val allComplexObjects = EcoreUtil2.eAllOfType(s, DmxComplexObject)
		val allLinks = EcoreUtil2.eAllOfType(s, DmxField).filter[renderAsLink]
		val result = '''	
			' snapshot «s.name»
			frame «s.name» <<Snapshot>> {
				«FOR obj : allComplexObjects»«obj.generate»«ENDFOR»
				«FOR link : allLinks»«link.generateLink(link.value.valueFor)»«ENDFOR»
			}
			«s.generateNotesWithIds(s.name)»
			
		'''
		return result
	}

	def String generate(DmxComplexObject o) '''	
		class «o.title» as «o.id» «o.getSpot» {
			«FOR f : o.fields.filter[! renderAsLink]»
				«f.generateField(f.value)»
			«ENDFOR»
		}
		«o.generateNotes»
		«FOR f : o.fields.filter[! renderAsLink]»
			«f.generateNotes»
		«ENDFOR»
		
	'''

	def String title(DmxComplexObject o) {
		val className = if (o.type !== null) o.type.name else "?"
		val instanceName = o.eContainer.name
		return "\"" + instanceName + " : " + className + "\""
	}

	def String name(EObject o) {
		switch o {
			DomNamedComplexObject: o.name
			DmxField: if (o.feature !== null) o.feature.name else ""
			DmxListExpression: o.eContainer.name
			default: ""
		}
	}

	def dispatch generateField(DmxField f, DmxListExpression expr) {
		if (! (expr.typeFor instanceof DmxComplexTypeDescriptor)) {
			generateFieldImpl(f, expr)
		}
	}

	def dispatch generateField(DmxField f, DExpression value) {
		generateFieldImpl(f, value)
	}

	def String generateFieldImpl(DmxField f, DExpression value) '''
		«f.feature.name» = «f.fieldValueExpression»
	'''

	def dispatch String generateLink(DmxField f, DmxEntity entity) '''
		«(f.eContainer as DmxComplexObject).id» --> «entity.id»
		«f.generateLinkNotes»
	'''
	
	def dispatch String generateLink(DmxField f, DmxDetail detail) '''
		«(f.eContainer as DmxComplexObject).id» --> «detail.id»
		«f.generateLinkNotes»
	'''

	def dispatch String generateLink(DmxField f, List<?> list) '''
		«FOR obj : list»
			«f.generateLink(obj)»
		«ENDFOR»
	'''

	def getSpot(EObject obj) {
		// Returns the "Spot Letter" to use next to the class name.
		val spot = switch obj {
			DmxEntity: if (obj.root) PlantUmlTextProviderUtil::ROOT_ENTITY_SPOT else PlantUmlTextProviderUtil::ENTITY_SPOT
			DmxDetail: PlantUmlTextProviderUtil::DETAIL_SPOT
			default: null
		}
		return spot !== null ? spot : ""
	}

	protected def String fieldValueExpression(DmxField f) {
		try {
			if (f.value !== null) {
				var expr = serializer.serialize(f.value) // throws RuntimeException
				expr = expr.replaceAll("^ |[\t\n\r]", "").replaceAll("[ ]+", " ");
				if (expr.length > MAX_EXPR_LENGTH) {
					expr = expr.substring(0, MAX_EXPR_LENGTH) + "..."
				}
				return expr
			}
		} catch (RuntimeException ex) {
			// ignore – the expresion is temporarily inconsistent and cannot be serialised
		}
		return ""
	}

	protected def String id(DmxComplexObject o) {
		"Obj" + o.hashCode
	}
	
	def boolean renderAsLink(DmxField f) {
		val feature = f.feature
		return feature !== null && (feature instanceof DAssociation || feature instanceof DAttribute && (feature as DAttribute).detail)
	}
	
	protected def generateNotes(DmxComplexObject obj) {
		val namedComplexObject =  EcoreUtil2.getContainerOfType(obj, DomNamedComplexObject)
		if (namedComplexObject !== null) {
			return namedComplexObject.generateNotesWithIds(obj.id)
		}
		return ""
	}
	
	protected def generateNotes(DmxField f) {
		val complexObject =  EcoreUtil2.getContainerOfType(f, DmxComplexObject)
		if (complexObject !== null) {
			return f.generateNotesOnRight('''«complexObject.id»::«f.name»''')
		}
		return ""
	}
}
