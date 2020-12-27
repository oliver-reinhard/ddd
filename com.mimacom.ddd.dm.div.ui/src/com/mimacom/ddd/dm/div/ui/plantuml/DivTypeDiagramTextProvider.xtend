package com.mimacom.ddd.dm.div.ui.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DNamespace
import com.mimacom.ddd.dm.div.DomainInformationView
import com.mimacom.ddd.dm.div.plantuml.DivTypeDiagramTextProviderImpl
import com.mimacom.ddd.dm.div.ui.internal.DivActivator
import java.util.Map
import net.sourceforge.plantuml.text.AbstractDiagramTextProvider
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.IEditorInput
import org.eclipse.ui.IEditorPart
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.XtextDocument

class DivTypeDiagramTextProvider extends AbstractDiagramTextProvider {

	@Inject DivTypeDiagramTextProviderImpl actualProvider

	new() {
		editorType = typeof(XtextEditor)
	}

	override supportsEditor(IEditorPart editorPart) {
		super.supportsEditor(editorPart) && (editorPart as XtextEditor).languageName.equals(DivActivator.COM_MIMACOM_DDD_DM_DIV_DIV)
	}

	override supportsSelection(ISelection sel) {
		return false;
	}

	override protected String getDiagramText(IEditorPart editorPart, IEditorInput editorInput, ISelection sel, Map<String, Object> obj) {
		// Retrieve  "semantic" EMF model from XtextEditor
		val document = (editorPart as XtextEditor).getDocumentProvider().getDocument(editorInput) as XtextDocument;
		val namespace = document.readOnly [
			return if (contents.head instanceof DNamespace) contents.head as DNamespace else null
		]
		
		val model = namespace?.model
		if (model instanceof DomainInformationView) {
			val validationErrors = Diagnostician.INSTANCE.validate(EcoreUtil.getRootContainer(model)).children
			if (! validationErrors.empty) {
				return "note \"Information view has validation errors.\" as N1"
			}
			if (actualProvider.canProvide(model)) {
				return actualProvider.diagramText(model)
			}
		}
		return '''note "No structures to show." as N1'''
	}
}
