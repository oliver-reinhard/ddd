package com.mimacom.ddd.dm.dom.ui.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DAssociation
import com.mimacom.ddd.dm.base.DExpression
import com.mimacom.ddd.dm.dmx.DmxComplexObject
import com.mimacom.ddd.dm.dmx.DmxContextReference
import com.mimacom.ddd.dm.dmx.DmxField
import com.mimacom.ddd.dm.dmx.DmxListExpression
import com.mimacom.ddd.dm.dmx.typecomputer.DmxComplexTypeDescriptor
import com.mimacom.ddd.dm.dom.DomDetail
import com.mimacom.ddd.dm.dom.DomEntity
import com.mimacom.ddd.dm.dom.DomModel
import com.mimacom.ddd.dm.dom.DomNamedComplexObject
import com.mimacom.ddd.dm.dom.DomSnapshot
import com.mimacom.ddd.dm.dom.DomUtil
import com.mimacom.ddd.dm.dom.typecomputer.DomTypeComputer
import com.mimacom.ddd.dm.dom.ui.internal.DomActivator
import java.util.Map
import net.sourceforge.plantuml.text.AbstractDiagramTextProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.IEditorInput
import org.eclipse.ui.IEditorPart
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.serializer.ISerializer
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.XtextDocument

class DomDiagramTextProvider extends AbstractDiagramTextProvider {

	@Inject extension DomUtil
	@Inject extension DomTypeComputer
	@Inject ISerializer serializer;

	static val MAX_EXPR_LENGTH = 30

	new() {
		editorType = typeof(XtextEditor)
	}

	override supportsEditor(IEditorPart editorPart) {
		super.supportsEditor(editorPart) && (editorPart as XtextEditor).languageName.equals(DomActivator.COM_MIMACOM_DDD_DM_DOM_DOM)
	}

	override supportsSelection(ISelection sel) {
		return false;
	}

	override protected getDiagramText(IEditorPart editorPart, IEditorInput editorInput, ISelection sel, Map<String, Object> obj) {
		// Retrieve  "semantic" EMF model from XtextEditor
		val document = (editorPart as XtextEditor).getDocumentProvider().getDocument(editorInput) as XtextDocument;
		val DomModel model = document.readOnly [
			return if (contents.head instanceof DomModel) contents.head as DomModel else null
		]

		if (model !== null && ! (model.snapshots.empty)) {
			return snapshots(model)
		} else {
			return '''note "No objects to show." as N1'''
		}
	}

	def snapshots(DomModel model) {

		val result = '''
			 hide empty members
			
			skinparam backgroundColor transparent 
			skinparam shadowing false
			
			skinparam CircledCharacterFontName Arial
			skinparam CircledCharacterFontSize 12
			
			skinparam package {
				fontName Arial
				borderColor DimGrey
				borderThickness 0.5
				stereotypeFontName Arial
				stereotypeFontSize 12
			}
			skinparam class {
				fontName Arial
				fontStyle bold
				attributeFontName Arial
				attributeFontStyle normal
				backgroundColor WhiteSmoke
				borderThickness 0.5
				arrowThickness 0.5
			}
			
			«FOR s : model.snapshots»
				«s.generateSnapshot»
			«ENDFOR»
		    '''
		return result
	}

	def generateSnapshot(DomSnapshot s) {
//		val allNonComplexObjects = EcoreUtil2.eAllOfType(s, DomObject).filter[! (it instanceof DomNamedComplexObject)]
		val allComplexObjects = EcoreUtil2.eAllOfType(s, DmxComplexObject)
		val allContainments = EcoreUtil2.eAllOfType(s, DmxField).filter[value instanceof DomDetail || value instanceof DmxListExpression && (value.typeFor instanceof DmxComplexTypeDescriptor)]
		val allReferences = EcoreUtil2.eAllOfType(s, DmxField).filter[value instanceof DmxContextReference && (value.typeFor instanceof DmxComplexTypeDescriptor)]
		val result = '''	
			' snapshot «s.name»
			frame «s.name» <<Snapshot>> {
			«FOR obj : allComplexObjects»«obj.generate»«ENDFOR»
			«FOR ref : allContainments»«ref.generateContainment(ref.value)»«ENDFOR»
			«FOR ref : allReferences»«ref.generateReference(ref.value as DmxContextReference)»«ENDFOR»
			}
		'''
		return result
	}

	def String generate(DmxComplexObject o) '''	
		class «o.title» as «o.id» «o.getSpot» {
			«FOR f : o.fields»«IF f.feature !== null && !(f.feature instanceof DAssociation)»«f.generateField(f.value)»«ENDIF»
			«ENDFOR»
		}
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

	def dispatch generateField(DmxField f, DmxComplexObject detail) {
		// nothing
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

	def dispatch String generateContainment(DmxField f, DomDetail detail) '''
		«(f.eContainer as DmxComplexObject).id» --> «detail.id»
	'''

	def dispatch String generateContainment(DmxField f, DmxListExpression expr) '''
		«FOR detail : expr.elements»«(f.eContainer as DmxComplexObject).id» --> «(detail as DmxComplexObject).id»
		«ENDFOR»
	'''
 
 	// TODO generalise association TARGET
	def  String generateReference(DmxField f, DmxContextReference ref) '''
		«(f.eContainer as DmxComplexObject).id» --> «(ref.target as DomNamedComplexObject).object.id» 
	'''

	def getSpot(EObject obj) {
		// Returns the "Spot Letter" to use next to the class name.
		return switch obj {
			DomEntity: if (obj.root) "<< (R,#FB3333) >>" else "<< (E,#F78100) >>"
			DomDetail: "<< (D,#FAE55F) >>"
			default: ""
		}
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

	def String id(DmxComplexObject o) {
		Integer.toString(o.hashCode)
	}
}
