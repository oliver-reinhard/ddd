package com.mimacom.ddd.dm.dem.ui.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DNamespace
import com.mimacom.ddd.dm.dem.DemDomainEvent
import com.mimacom.ddd.dm.dem.plantuml.DemEventDiagramTextProviderImpl
import com.mimacom.ddd.dm.dem.ui.internal.DemActivator
import java.util.Map
import net.sourceforge.plantuml.text.AbstractDiagramTextProvider
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.IEditorInput
import org.eclipse.ui.IEditorPart
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.XtextDocument

class DemDiagramTextProvider extends AbstractDiagramTextProvider {

	@Inject DemEventDiagramTextProviderImpl actualProvider

	new() {
		editorType = typeof(XtextEditor)
	}

	override supportsEditor(IEditorPart editorPart) {
		super.supportsEditor(editorPart) &&
			(editorPart as XtextEditor).languageName.equals(DemActivator.COM_MIMACOM_DDD_DM_DEM_DEM)
	}

	override supportsSelection(ISelection sel) {
		return false;
	}

	override protected getDiagramText(IEditorPart editorPart, IEditorInput editorInput, ISelection sel,
		Map<String, Object> obj) {
		// Retrieve the "semantic" EMF from XtextEditor
		val document = (editorPart as XtextEditor).getDocumentProvider().getDocument(editorInput) as XtextDocument;
		val namespace = document.readOnly [
			return if (contents.head instanceof DNamespace) contents.head as DNamespace else null
		]
		val event = namespace.model instanceof DemDomainEvent ? namespace.model as DemDomainEvent : null

		if (actualProvider.canProvide(event)) {
			return actualProvider.diagramText(event)
		}
		return '''note "No domain event to show." as N1'''

	}
}
