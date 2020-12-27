package com.mimacom.ddd.dm.dim.ui.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DNamespace
import com.mimacom.ddd.dm.dim.DomainInformationModel
import com.mimacom.ddd.dm.dim.plantuml.DimTypeDiagramTextProviderImpl
import com.mimacom.ddd.dm.dim.ui.internal.DimActivator
import java.util.Map
import net.sourceforge.plantuml.text.AbstractDiagramTextProvider
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.IEditorInput
import org.eclipse.ui.IEditorPart
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.XtextDocument

class DimTypeDiagramTextProvider extends AbstractDiagramTextProvider {

	@Inject DimTypeDiagramTextProviderImpl actualProvider

	new() {
		editorType = typeof(XtextEditor)
	}

	override supportsEditor(IEditorPart editorPart) {
		super.supportsEditor(editorPart) && (editorPart as XtextEditor).languageName.equals(DimActivator.COM_MIMACOM_DDD_DM_DIM_DIM)
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
		if (model instanceof DomainInformationModel) {
			val validationErrors = Diagnostician.INSTANCE.validate(EcoreUtil.getRootContainer(model)).children
			if (! validationErrors.empty) {
				return "note \"Information model has validation errors.\" as N1"
			}
			if (actualProvider.canProvide(model)) {
				return actualProvider.diagramText(model)
			}
		}
		return '''note "No structures to show." as N1'''
	}
}
