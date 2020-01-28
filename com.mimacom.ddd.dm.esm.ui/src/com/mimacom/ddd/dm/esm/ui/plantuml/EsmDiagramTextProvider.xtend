package com.mimacom.ddd.dm.esm.ui.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DNamespace
import com.mimacom.ddd.dm.base.DState
import com.mimacom.ddd.dm.base.DStateEvent
import com.mimacom.ddd.dm.esm.EsmCompositeState
import com.mimacom.ddd.dm.esm.EsmConcurrentState
import com.mimacom.ddd.dm.esm.EsmStateKind
import com.mimacom.ddd.dm.esm.EsmTransition
import com.mimacom.ddd.dm.esm.IEsmState
import com.mimacom.ddd.dm.esm.IEsmStateModel
import com.mimacom.ddd.dm.esm.ui.internal.EsmActivator
import java.util.Map
import net.sourceforge.plantuml.text.AbstractDiagramTextProvider
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.IEditorInput
import org.eclipse.ui.IEditorPart
import org.eclipse.xtext.serializer.ISerializer
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.XtextDocument
import com.mimacom.ddd.dm.esm.EsmEntityStateModel

class EsmDiagramTextProvider extends AbstractDiagramTextProvider {
	@Inject ISerializer serializer;

	static val NAME_UNDEFINED = "NO_NAME";
	static val STATE_INITIAL_FINAL = "[*]"
	static val MAX_EXPR_LENGTH = 30

	new() {
		editorType = typeof(XtextEditor)
	}

	override supportsEditor(IEditorPart editorPart) {
		super.supportsEditor(editorPart) && (editorPart as XtextEditor).languageName.equals(EsmActivator.COM_MIMACOM_DDD_DM_ESM_ESM)
	}

	override supportsSelection(ISelection sel) {
		return false;
	}

	override protected getDiagramText(IEditorPart editorPart, IEditorInput editorInput, ISelection sel, Map<String, Object> obj) {
		// Retrieve the "semantic" EMF from XtextEditor
		val document = (editorPart as XtextEditor).getDocumentProvider().getDocument(editorInput) as XtextDocument;
		val DNamespace ns = document.readOnly [
			return if (contents.head instanceof DNamespace) contents.head as DNamespace else null
		]

		val stateModel = ns?.model as EsmEntityStateModel

		if (ns === null || stateModel === null) {
			return '''note "No state model to show." as N1'''
		}

		val result = stateModel.genStateModel()
		return result
	}

	def String genStateModel(IEsmStateModel model) '''
		' Additional, synthetic transitions: Initial state --> state:
		«FOR s : model.states.filter[s | s.kind == EsmStateKind.INITIAL && s.state !== null && ! s.state.eIsProxy]»«STATE_INITIAL_FINAL» -«model.direction.literal.toLowerCase»-> «s.stateName»
		«ENDFOR»
		' Regular transitions:
		«FOR t : model.transitions»
			«stateName(t.from)» -«t.direction.literal.toLowerCase»-> «stateName(t.to)»:«eventName(t.event)»«t.guardExpression»
		«ENDFOR»
		' Additional, synthetic transitions: state --> final state:
		«FOR s : model.states.filter[s | s.kind == EsmStateKind.FINAL&& s.state !== null && ! s.state.eIsProxy]»«s.stateName» -«model.direction.literal.toLowerCase»-> «STATE_INITIAL_FINAL»
		«ENDFOR»
		«FOR composite : model.states.filter(EsmCompositeState)»
			' Composite state
			state «stateName(composite.state)» {
				«composite.genStateModel()»
			}
		«ENDFOR»
		«FOR concurrent : model.states.filter(EsmConcurrentState)»
			' Concurrent state
			state «stateName(concurrent.state)» {
				«FOR subState : concurrent.subStates SEPARATOR "\n--"»
					«subState.genStateModel()»
				«ENDFOR»
			}
		«ENDFOR»
	'''

	protected def String stateName(DState state) {
		if (state === null || state.eIsProxy) return NAME_UNDEFINED
		return state.name
	}

	protected def String guardExpression(EsmTransition t) {
		try {
			if (t.guard !== null) {
				var expr = serializer.serialize(t.guard) // throws RuntimeException
				expr = expr.replaceAll("^ |[\t\n\r]", "").replaceAll("[ ]+", " ");
				if (expr.length > MAX_EXPR_LENGTH) {
					expr = expr.substring(0, MAX_EXPR_LENGTH) + "..."
				}
				return " [" + expr + "]"
			}
		} catch (RuntimeException ex) {
			// ignore – the expresion is temporarily inconsistent and cannot be serialised
		}
		return ""
	}

	protected def String eventName(DStateEvent event) {
		if (event === null || event.eIsProxy) return NAME_UNDEFINED
		return event.name.toLowerCase
	}

	protected def String stateName(IEsmState state) {
		if (state.state === null) return NAME_UNDEFINED
		return state.state.name
	}
}
