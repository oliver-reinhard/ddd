package com.mimacom.ddd.dm.dom.ui.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DAssociation
import com.mimacom.ddd.dm.base.base.DAttribute
import com.mimacom.ddd.dm.base.base.DExpression
import com.mimacom.ddd.dm.base.base.DNamespace
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
import com.mimacom.ddd.dm.dom.ui.internal.DomActivator
import java.util.List
import java.util.Map
import net.sourceforge.plantuml.text.AbstractDiagramTextProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.emf.ecore.util.EcoreUtil
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
	@Inject extension DomExpressionEvaluator
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
		val DNamespace ns = document.readOnly [
			return if (contents.head instanceof DNamespace) contents.head as DNamespace else null
		]
		val model = ns.model as DomModel
		val result = Diagnostician.INSTANCE.validate(EcoreUtil.getRootContainer(model)).children
		if (model !== null && ! result.empty) {
			return "note \"Object model has validation errors.\" as N1"
		} else if (model !== null && ! (model.snapshots.empty)) {
			return snapshots(model)
		} else {
			return "note \"No objects to show.\" as N1"
		}
	}

	def snapshots(DomModel model) {

		val result = '''
			@startuml
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
			@enduml
		    '''
		return result
	}

	def generateSnapshot(DomSnapshot s) {
//		val allNonComplexObjects = EcoreUtil2.eAllOfType(s, DomObject).filter[! (it instanceof DomNamedComplexObject)]
		val allComplexObjects = EcoreUtil2.eAllOfType(s, DmxComplexObject)
		val allDetailContainments = EcoreUtil2.eAllOfType(s, DmxField).filter[feature instanceof DAttribute && (feature as DAttribute).detail]
		val allAssociations = EcoreUtil2.eAllOfType(s, DmxField).filter[feature instanceof DAssociation]
		val result = '''	
			' snapshot «s.name»
			frame «s.name» <<Snapshot>> {
			«FOR obj : allComplexObjects»«obj.generate»«ENDFOR»
			«FOR detail : allDetailContainments»«detail.generateAssociation(detail.value.valueFor)»«ENDFOR»
			«FOR ref : allAssociations»«ref.generateAssociation(ref.value.valueFor)»«ENDFOR»
			}
		'''
		return result
	}

	def String generate(DmxComplexObject o) '''	
		class «o.title» as «o.id» «o.getSpot» {
			«FOR f : o.fields»«IF f.feature !== null && f.feature instanceof DAttribute && ! (f.feature as DAttribute).detail»«f.generateField(f.value)»«ENDIF»
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

	def dispatch String generateAssociation(DmxField f, DmxEntity entity) '''
		«(f.eContainer as DmxComplexObject).id» --> «entity.id»
	'''
	def dispatch String generateAssociation(DmxField f, DmxDetail detail) '''
		«(f.eContainer as DmxComplexObject).id» --> «detail.id»
	'''

	def dispatch String generateAssociation(DmxField f, List<?> list) '''
		«FOR obj : list»«f.generateAssociation(obj)»
		«ENDFOR»
	'''

	def getSpot(EObject obj) {
		// Returns the "Spot Letter" to use next to the class name.
		return switch obj {
			DmxEntity: if (obj.root) "<< (R,#FB3333) >>" else "<< (E,#F78100) >>"
			DmxDetail: "<< (D,#FAE55F) >>"
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
