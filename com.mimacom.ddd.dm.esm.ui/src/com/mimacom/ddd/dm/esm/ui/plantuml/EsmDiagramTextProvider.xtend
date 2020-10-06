package com.mimacom.ddd.dm.esm.ui.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DNamespace
import com.mimacom.ddd.dm.esm.EsmEntityStateModel
import com.mimacom.ddd.dm.esm.plantuml.EsmStateDiagramTextProviderImpl
import com.mimacom.ddd.dm.esm.ui.internal.EsmActivator
import java.util.Map
import net.sourceforge.plantuml.text.AbstractDiagramTextProvider
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.IEditorInput
import org.eclipse.ui.IEditorPart
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.XtextDocument

class EsmDiagramTextProvider extends AbstractDiagramTextProvider {

	@Inject EsmStateDiagramTextProviderImpl actualProvider

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
		val DNamespace namespace = document.readOnly [
			return if (contents.head instanceof DNamespace) contents.head as DNamespace else null
		]

		val model = namespace.model instanceof EsmEntityStateModel ? namespace.model as EsmEntityStateModel : null
		
		if (actualProvider.canProvide(model)) {
			return actualProvider.diagramText(model)
		}

		return '''note "No state model to show." as N1'''
	}
}
