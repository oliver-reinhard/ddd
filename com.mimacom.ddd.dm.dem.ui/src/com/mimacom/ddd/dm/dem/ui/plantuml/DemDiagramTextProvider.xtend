package com.mimacom.ddd.dm.dem.ui.plantuml

import com.mimacom.ddd.dm.base.DNamespace
import com.mimacom.ddd.dm.dem.DemDomainEvent
import com.mimacom.ddd.dm.dem.ui.internal.DemActivator
import java.util.Map
import net.sourceforge.plantuml.text.AbstractDiagramTextProvider
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.IEditorInput
import org.eclipse.ui.IEditorPart
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.XtextDocument

class DemDiagramTextProvider extends AbstractDiagramTextProvider {
	
	new() {
        editorType = typeof(XtextEditor)
    }
    
	override supportsEditor(IEditorPart editorPart) {
		super.supportsEditor(editorPart) && (editorPart as XtextEditor).languageName.equals(DemActivator.COM_MIMACOM_DDD_DM_DEM_DEM)
	}
	
	override supportsSelection(ISelection sel) {
		return false;
	}
				
	override protected getDiagramText(IEditorPart editorPart, IEditorInput editorInput, ISelection sel, Map<String, Object> obj) {
        // Retrieve the "semantic" EMF from XtextEditor
        val document = (editorPart as XtextEditor).getDocumentProvider().getDocument(editorInput) as XtextDocument;
        val namespace = document.readOnly[
            return if (contents.head instanceof DNamespace) contents.head as DNamespace else null
        ]
        val event = namespace.model as DemDomainEvent
        
        if (event === null) {
        	return '''note "No domain event to show." as N1'''
        }
        
       val result = '''
   		(«event.name») as (event)
   		«FOR t : event.triggers»
   		   	actor «t.name»
   		«ENDFOR»
   		«FOR n : event.notifications.filter[getNotified!==null]»
   			actor «n.getNotified.name»
   		«ENDFOR»
   		«FOR t : event.triggers»
   		   	«t.name» --> (event) : triggers
   		«ENDFOR»
   		«FOR n : event.notifications.filter[getNotified!==null]»
   			«n.getNotified.name» <-- (event) : «n.name»
   		«ENDFOR»
       '''
       return result
	}
}