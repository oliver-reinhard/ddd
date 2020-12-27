package com.mimacom.ddd.dm.base.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.TypesUtil
import com.mimacom.ddd.dm.base.base.BasePackage
import com.mimacom.ddd.dm.base.base.DAggregate
import com.mimacom.ddd.dm.base.base.DAssociation
import com.mimacom.ddd.dm.base.base.DAttribute
import com.mimacom.ddd.dm.base.base.DDetailType
import com.mimacom.ddd.dm.base.base.DEntityNature
import com.mimacom.ddd.dm.base.base.DEntityType
import com.mimacom.ddd.dm.base.base.DEnumeration
import com.mimacom.ddd.dm.base.base.DFeature
import com.mimacom.ddd.dm.base.base.DLiteral
import com.mimacom.ddd.dm.base.base.DModel
import com.mimacom.ddd.dm.base.base.DNote
import com.mimacom.ddd.dm.base.base.DPrimitive
import com.mimacom.ddd.dm.base.base.DType
import com.mimacom.ddd.dm.base.base.INoteContainer
import com.mimacom.ddd.util.plantuml.Color
import org.eclipse.emf.ecore.EObject

class PlantUmlTextProviderUtil {

	@Inject extension TypesUtil
	@Inject RichTextToPlantUmlNoteTextRenderer notesTextRenderer
	
	static val BASE = BasePackage.eINSTANCE
	
	public static val AGGREGATE_SPOT = new Spot(BASE.DAggregate, new Color(255, 204, 0), 'A')
	public static val ENTITY_SPOT = new Spot(BASE.DEntityType, new Color(232, 158, 77), 'E')
	public static val ROOT_ENTITY_SPOT = new Spot(BASE.DEntityType, new Color(209, 127, 121), 'R')
	public static val RELATIONSHIP_SPOT = new Spot(BASE.DEntityType, new Color(140, 128, 186), 'R')
	public static val DETAIL_SPOT = new Spot(BASE.DDetailType, new Color(222, 193, 113), 'D')
	public static val PRIMITIVE_SPOT = new Spot(BASE.DPrimitive, new Color(198, 222, 169), 'p')
	public static val ENUMERATION_SPOT = new Spot(BASE.DEnumeration, new Color(161, 191, 124), 'e')
	
	public static val WHITE_NOTE = new Color(250, 249, 245) // off-white
	public static val RED_NOTE = new Color(227, 177, 170)
	public static val ORANGE_NOTE  = new Color(252, 223, 194)
	public static val YELLOW_NOTE  = new Color(252, 239, 194)
	public static val GREEN_NOTE  = new Color(188, 214, 190)
	public static val BLUE_NOTE  = new Color(188, 208, 214)
	public static val PINK_NOTE  = new Color(230, 216, 227)
	public static val GREY_NOTE  = new Color(230, 230, 230)
	
	/*
	 * Sequential numbering of Notes:
	 */
	var noteID=0
	
	/*
	 * Qualified names for references within PlantUML files
	 */
	 
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

	/*
	 * Spots for type diagrams
	 */
	
	def spot(DAggregate a) {
		return a !== null ? AGGREGATE_SPOT.toString : ""
	}

	def spot(DType t) {
		// Returns the "Spot Letter" to use next to the class name.
		val spot = switch t {
			DEntityType: if (t.root) ROOT_ENTITY_SPOT else if (t.nature == DEntityNature.RELATIONSHIP) RELATIONSHIP_SPOT else ENTITY_SPOT
			DDetailType: DETAIL_SPOT
			DEnumeration: ENUMERATION_SPOT
			DPrimitive: PRIMITIVE_SPOT
			default: null
		}
		return spot !== null ? spot.toString : ""
	}
	
	/*
	 * Generate notes on information structure.
	 */
	
	def generateNotes(DModel m) '''
		«m.generateNotesWithIds(null)»
	'''
	
	def generateNotes(DAggregate a) '''
		«a.generateNotesWithIds(a.aggregateQN)»
	'''
	
	def generateNotes(DType t) '''
		«t.generateNotesWithIds(t.typeQN)»
	'''
	
	def generateNotes(DFeature f) '''
		«IF f.renderAsLink»
			«f.generateLinkNotes»
		«ELSE»
			«f.generateNotesOnRight(f.featureQN)»
		«ENDIF»	 	
	'''
	
	def generateNotes(DLiteral lit) '''
		«FOR n : lit.notes»
			«n.generateGenericNoteOnRight(lit.literalQN)»
		«ENDFOR»
	'''
	
	/*
	 * Generic Notes generators
	 */
	
	def generateNotesWithIds(INoteContainer nc, String targetQN) '''
		«FOR n : nc.notes»
			«n.generateGenericNoteWithId(noteID++, targetQN)»
		«ENDFOR»
	'''
	
	def generateNotesOnRight(INoteContainer nc, String targetQN) '''
		«FOR n : nc.notes»
			«n.generateGenericNoteOnRight(targetQN)»
		«ENDFOR»
	'''
	
	def generateLinkNotes(INoteContainer nc) '''
		«FOR n : nc.notes»
			«n.generateLinkNote»
		«ENDFOR»
	'''
	
	def boolean renderAsLink(DFeature f) {
		return f instanceof DAssociation || f instanceof DAttribute && f.type instanceof DDetailType
	}
	
	/*
	 * Note for PlantUML object known as 'targetQN' (can be empty --> unlinked note on canvas).
	 */
	protected def generateGenericNoteWithId(DNote n, int id, String targetQN) '''
		note as Note«id» «n.noteColor»
		«n.generateNoteText»
		end note
		«IF targetQN !== null»Note«id» .. «targetQN»«ENDIF»
		
	'''
	
	/*
	 * Note for previously declared PlantUML object.
	 */
	protected def generateGenericNoteOnRight(DNote n,String targetQN) '''
		«IF n.eContainer instanceof DFeature && n.noteColor!= ""»' PlantUML BUG: color ignored on class members«ENDIF»
		note right of «targetQN» «n.noteColor» 
		«n.generateNoteText»
		end note
		
	'''
	
	/*
	 * Note for previously declared PlantUML object.
	 */
	protected def generateLinkNote(DNote n) '''
		note bottom on link «n.noteColor»
		«n.generateNoteText»
		end note
		
	'''
	
	protected def generateNoteText(DNote n) {
		return (notesTextRenderer.render(n.text) as String).removeIndent
	}
	
	protected def String removeIndent(String text) {
		val lines = text.split("\n[\\s]*")
		val sb = new StringBuilder
		var first = true
		for (line : lines) {
			if (! first) {
				sb.append("\n")
			}
			sb.append(line)
			first = false
		}
		return sb.toString
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
