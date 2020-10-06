package com.mimacom.ddd.dm.dom.ui.hover

import com.mimacom.ddd.dm.base.base.DExpression
import com.mimacom.ddd.dm.dom.evaluator.DomExpressionEvaluator
import com.mimacom.ddd.dm.dom.typecomputer.DomTypeComputer
import javax.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider

class DomEObjectHoverProvider extends DefaultEObjectHoverProvider {
	@Inject extension DomTypeComputer
	@Inject extension DomExpressionEvaluator

	override String getHoverInfoAsHtml(EObject obj) {
		println("Hover for: " + obj)
		if (obj instanceof DExpression && obj.expressionHasNoErrors) {
			val expr = obj as DExpression
			val type = expr.typeFor
			val value = expr.valueFor
			return '''
			<p>
			type   : <b>«type.displayName»</b> <br>
			value : <b>«value.toString»</b>
			</p>
			'''
		} else {
			return super.getHoverInfoAsHtml(obj)
		}
	}
	
	def expressionHasNoErrors(EObject obj) {
		Diagnostician.INSTANCE.validate(obj).children.empty
	}
}