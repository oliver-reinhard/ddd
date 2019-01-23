package com.mimacom.ddd.dm.dme.ui.plantuml

import com.mimacom.ddd.dm.base.DDomain
import com.mimacom.ddd.dm.dme.ui.internal.DmeActivator
import java.util.Map
import net.sourceforge.plantuml.text.AbstractDiagramTextProvider
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.IEditorInput
import org.eclipse.ui.IEditorPart
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.XtextDocument

class DmeDiagramTextProvider extends AbstractDiagramTextProvider {
	
	// @Inject extension DmsUtil // TODO injector not working, bundle setup seems ok => ?
	
	def DmeDiagramTextProvider() {
        editorType = typeof(XtextEditor)
    }
    
	override supportsEditor(IEditorPart editorPart) {
		super.supportsEditor(editorPart) && (editorPart as XtextEditor).languageName.equals(DmeActivator.COM_MIMACOM_DDD_DM_DME_DME)
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
       		«FOR n : e.notifications»
       			actor «n.notified.name»
       		«ENDFOR»
       		«e.trigger.name» --> (event) : triggers
       		«FOR n : e.notifications»
       			«n.notified.name» <-- (event) : «n.name»
       		«ENDFOR»
       	«ENDFOR»
       '''
       return result
	}
}