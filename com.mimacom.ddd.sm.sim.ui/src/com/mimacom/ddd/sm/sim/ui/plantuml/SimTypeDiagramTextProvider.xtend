package com.mimacom.ddd.sm.sim.ui.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DNamespace
import com.mimacom.ddd.sm.sim.SInformationModel
import com.mimacom.ddd.sm.sim.plantuml.SimTypeDiagramTextProviderImpl
import com.mimacom.ddd.sm.sim.ui.internal.SimActivator
import java.util.Map
import net.sourceforge.plantuml.text.AbstractDiagramTextProvider
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.IEditorInput
import org.eclipse.ui.IEditorPart
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.XtextDocument

class SimTypeDiagramTextProvider extends AbstractDiagramTextProvider {

	@Inject SimTypeDiagramTextProviderImpl actualProvider

	new () {
        editorType = typeof(XtextEditor)
    }
    
	override supportsEditor(IEditorPart editorPart) {
		super.supportsEditor(editorPart) && (editorPart as XtextEditor).languageName.equals(SimActivator.COM_MIMACOM_DDD_SM_SIM_SIM)
	}
	
	override supportsSelection(ISelection sel) {
		return false;
	}
				
	override protected getDiagramText(IEditorPart editorPart, IEditorInput editorInput, ISelection sel, Map<String, Object> obj) {
        // Retrieve "semantic" EMF model from XtextEditor
        val document = (editorPart as XtextEditor).getDocumentProvider().getDocument(editorInput) as XtextDocument;
        val namespace = document.readOnly[
            return if (contents.head instanceof DNamespace) contents.head as DNamespace else null
        ]
        
        if (namespace !== null) {        	
	        val model = namespace.model as SInformationModel
	        if (actualProvider.canProvide(model)) {
	        	return actualProvider.diagramText(model)
        	}
        }
        return '''note "No structures to show." as N1'''
	}
}