package com.mimacom.ddd.dm.esm.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DState
import com.mimacom.ddd.dm.base.DStateEvent
import com.mimacom.ddd.dm.esm.EsmCompositeState
import com.mimacom.ddd.dm.esm.EsmConcurrentState
import com.mimacom.ddd.dm.esm.EsmEntityStateModel
import com.mimacom.ddd.dm.esm.EsmStateKind
import com.mimacom.ddd.dm.esm.EsmTransition
import com.mimacom.ddd.dm.esm.IEsmState
import com.mimacom.ddd.dm.esm.IEsmStateModel
import com.mimacom.ddd.util.plantuml.IPlantUmlDiagramTextProvider
import org.eclipse.xtext.serializer.ISerializer

class EsmStateDiagramTextProviderImpl implements IPlantUmlDiagramTextProvider<EsmEntityStateModel> {
	@Inject ISerializer serializer;

	static val NAME_UNDEFINED = "NO_NAME";
	static val STATE_INITIAL_FINAL = "[*]"
	static val MAX_EXPR_LENGTH = 30
	
	override canProvide(EsmEntityStateModel model) {
		model !== null && ! (model.states.empty)
	}
	
	override String diagramText(EsmEntityStateModel model) {
		model.genStateModel
	}
	

	def String genStateModel(IEsmStateModel model) '''
		@startuml
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
		@enduml
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