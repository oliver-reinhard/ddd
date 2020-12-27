package com.mimacom.ddd.dm.dom.ui.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DNamespace
import com.mimacom.ddd.dm.dom.DomModel
import com.mimacom.ddd.dm.dom.plantuml.DomObjectDiagramTextProviderImpl
import com.mimacom.ddd.dm.dom.ui.internal.DomActivator
import java.util.Map
import net.sourceforge.plantuml.text.AbstractDiagramTextProvider
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.IEditorInput
import org.eclipse.ui.IEditorPart
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.XtextDocument

class DomObjectDiagramTextProvider extends AbstractDiagramTextProvider {

	@Inject DomObjectDiagramTextProviderImpl actualProvider

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
		val DNamespace namespace = document.readOnly [
			return if (contents.head instanceof DNamespace) contents.head as DNamespace else null
		]
		val model = namespace?.model
		if (model instanceof DomModel) {
			val validationErrors = Diagnostician.INSTANCE.validate(EcoreUtil.getRootContainer(model)).children
			if (! validationErrors.empty) {
				return "note \"Object model has validation errors.\" as N1"
			}
			if (actualProvider.canProvide(model)) {
				return actualProvider.diagramText(model)
			}
		}

		return "note \"No objects to show.\" as N1"
	}
}
