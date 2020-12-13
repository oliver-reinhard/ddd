package com.mimacom.ddd.dm.base.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.TypesUtil
import com.mimacom.ddd.dm.base.base.DAggregate
import com.mimacom.ddd.dm.base.base.DAssociation
import com.mimacom.ddd.dm.base.base.DAttribute
import com.mimacom.ddd.dm.base.base.DDetailType
import com.mimacom.ddd.dm.base.base.DEnumeration
import com.mimacom.ddd.dm.base.base.DFeature
import com.mimacom.ddd.dm.base.base.DInformationModel
import com.mimacom.ddd.dm.base.base.DLiteral
import com.mimacom.ddd.dm.base.base.DNote
import com.mimacom.ddd.dm.base.base.DType
import com.mimacom.ddd.util.plantuml.Color
import org.eclipse.emf.ecore.EObject

class PlantUmlTextProviderUtil {

	@Inject extension TypesUtil
	@Inject RichTextToPlantUmlNoteTextRenderer notesTextRenderer
	
	public static val WHITE_NOTE = new Color(255, 255, 255)
	public static val RED_NOTE = new Color(227, 177, 170)
	public static val ORANGE_NOTE  = new Color(252, 223, 194)
	public static val YELLOW_NOTE  = new Color(252, 239, 194)
	public static val GREEN_NOTE  = new Color(188, 214, 190)
	public static val BLUE_NOTE  = new Color(188, 208, 214)
	public static val PINK_NOTE  = new Color(230, 216, 227)
	public static val GREY_NOTE  = new Color(230, 230, 230)
	
	var noteID=0

	def String aggregateQN(EObject obj) {
		val a = obj.aggregate
		return a !== null ? a.name : ""
	}
	
	def String aggregateQueriesClassName(DAggregate a) {
		return '''«a.name».«a.name»'''
	}

	def String typeQN(DType t) {
		'''«t.aggregateQN».«t.name»'''  // NOTE: always a leading ".", even if no containing aggregate
	}

	def String featureQN(DFeature f) {
		val t = f.containingType
		if (t !== null) return '''«t.typeQN»::«f.name»'''
		val a = f.aggregate
		if (a !== null) return '''«a.aggregateQueriesClassName»::«f.name»'''
		return f.name
	}

	def String literalQN(DLiteral lit) {
		val t = lit.eContainer
		return t instanceof DEnumeration ? '''«t.typeQN»::«lit.name»''' : lit.name
	}

	def String associationTargetQN(DType source, DType target) {
		if (source.modelName == target.modelName) {
			if (source.aggregateName == target.aggregateName) {
				return target.typeQN
			}
			return target.aggregateQN
		}
		return target.modelName
	}
	
	def dispatch generateNotes(DInformationModel m) '''
		«FOR n : m.notes»
			«n.generateNoteForStructuralElement(noteID++, null)»
		«ENDFOR»
	'''
	
	def dispatch generateNotes(DAggregate a) '''
		«FOR n : a.notes»
			«n.generateNoteForStructuralElement(noteID++, a.aggregateQN)»
		«ENDFOR»
	'''
	
	def dispatch generateNotes(DType t) '''
		«FOR n : t.notes»
			«n.generateNoteForStructuralElement(noteID++, t.typeQN)»
		«ENDFOR»
	'''
	
	def dispatch generateNotes(DFeature a) '''
		«FOR n : a.notes»
			«IF a.renderAsLink»
				note bottom on link «n.noteColor»
					«n.generateNoteText»
				end note
			«ELSE»
				«n.generateUmlFeatureNote(a.featureQN)»
			«ENDIF»	 	
		«ENDFOR»
	'''
	
	def dispatch generateNotes(DLiteral lit) '''
		«FOR n : lit.notes»
			«n.generateUmlFeatureNote(lit.literalQN)»
		«ENDFOR»
	'''
	
	def boolean renderAsLink(DFeature f) {
		return f instanceof DAssociation || f instanceof DAttribute && f.type instanceof DDetailType
	}
	
	protected def generateNoteForStructuralElement(DNote n, int id, String targetQN) '''
		note as Note«id» «n.noteColor»
			«n.generateNoteText»
		end note
		«IF targetQN !== null»Note«id» .. «targetQN»«ENDIF»
	'''
	
	protected def generateUmlFeatureNote(DNote n,String targetQN) '''
		note right of «targetQN» «n.noteColor» 
		««« PlantUML BUG: color ignored
			«n.generateNoteText»
		end note
	'''
	
	protected def generateNoteText(DNote n) {
		notesTextRenderer.render(n.text)
	}
	
	protected def String noteColor(DNote n) {
		if (n === null) return ""
		switch (n.color) {
			case DEFAULT: ""
			case WHITE: noteColorWhite.toString
			case RED: noteColorRed.toString
			case ORANGE: noteColorOrange.toString
			case YELLOW: noteColorYellow.toString
			case GREEN: noteColorGreen.toString
			case BLUE: noteColorBlue.toString
			case PINK: noteColorPink.toString
			case GREY: noteColorGrey.toString
		}
	}
	
	protected def Color noteColorWhite() {
		WHITE_NOTE
	}
	
	protected def Color noteColorRed() {
		RED_NOTE
	}
	
	protected def Color noteColorOrange() {
		ORANGE_NOTE
	}
	
	protected def Color noteColorYellow() {
		YELLOW_NOTE
	}
	
	protected def Color noteColorGreen() {
		GREEN_NOTE
	}
	
	protected def Color noteColorBlue() {
		BLUE_NOTE
	}
	
	protected def Color noteColorPink() {
		PINK_NOTE
	}
	
	protected def Color noteColorGrey() {
		GREY_NOTE
	}
	
	protected def Color defaultNoteColor() {
		YELLOW_NOTE
	}
	
//	static val SYNTHETIC = SyntheticFactory.eINSTANCE


//	def boolean hasStateFeature(DComplexType t) {
//		if (t instanceof DEntityType) {
//			return ! t.states.empty
//		}
//		return false
//	}
//	
//	def statesFeatureName(DComplexType t) {
//		return t.name + "State"
//	}
//
//	def DEnumeration statesEnumeration(DComplexType t) {
//		if (t instanceof DEntityType) {
//			val states = SYNTHETIC.createTSyntheticEnumeration
//			states.name = t.statesFeatureName
//			for(s : t.states) {
//				val literal = SYNTHETIC.createTSyntheticLiteral
//				literal.name = s.name
//				states.literals.add(literal)
//			}
//			return states
//		}
//		return null
//	}
}
