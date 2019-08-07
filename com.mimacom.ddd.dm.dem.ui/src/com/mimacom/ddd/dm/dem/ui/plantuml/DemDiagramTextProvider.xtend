package com.mimacom.ddd.dm.dem.ui.plantuml

import com.mimacom.ddd.dm.base.DDomain
import com.mimacom.ddd.dm.dem.ui.internal.DemActivator
import java.util.Map
import net.sourceforge.plantuml.text.AbstractDiagramTextProvider
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.IEditorInput
import org.eclipse.ui.IEditorPart
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.XtextDocument

class DemDiagramTextProvider extends AbstractDiagramTextProvider {
	
	// @Inject extension DmsUtil // TODO injector not working, bundle setup seems ok => ?
	
	def DemDiagramTextProvider() {
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
        val DDomain domain = document.readOnly[
            return if (contents.head instanceof DDomain) contents.head as DDomain else null
        ]
        
        val events = domain?.events
        
        if (domain === null || events.empty) {
        	return '''note "No domain events to show." as N1'''
        }
        
       val result = '''
       	«FOR e : events»
       		(«e.name») as (event)
       		actor «e.trigger.name»
       		«FOR n : e.notifications.filter[notified!==null]»
       			actor «n.notified.name»
       		«ENDFOR»
       		«IF e.trigger !== null»«e.trigger.name» --> (event) : triggers«ENDIF»
       		«FOR n : e.notifications.filter[notified!==null]»
       			«n.notified.name» <-- (event) : «n.name»
       		«ENDFOR»
       	«ENDFOR»
       '''
       return result
	}
}