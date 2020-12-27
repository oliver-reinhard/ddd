package com.mimacom.ddd.dm.dem.ui.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DNamespace
import com.mimacom.ddd.dm.dem.DemActorModel
import com.mimacom.ddd.dm.dem.DemDomainEvent
import com.mimacom.ddd.dm.dem.DemEventsOverviewModel
import com.mimacom.ddd.dm.dem.plantuml.DemActorsOverviewDiagramTextProviderImpl
import com.mimacom.ddd.dm.dem.plantuml.DemEventDiagramTextProviderImpl
import com.mimacom.ddd.dm.dem.plantuml.DemEventsOverviewDiagramTextProviderImpl
import com.mimacom.ddd.dm.dem.ui.internal.DemActivator
import java.util.Map
import net.sourceforge.plantuml.text.AbstractDiagramTextProvider
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.IEditorInput
import org.eclipse.ui.IEditorPart
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.XtextDocument

class DemDiagramTextProvider extends AbstractDiagramTextProvider {

	@Inject DemEventDiagramTextProviderImpl eventDiagramProvider
	@Inject DemActorsOverviewDiagramTextProviderImpl actorsOverviewDiagramProvider
	@Inject DemEventsOverviewDiagramTextProviderImpl eventsOverviewDiagramProvider

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
		val model = namespace?.model
		if (model !== null) {
			val validationErrors = Diagnostician.INSTANCE.validate(EcoreUtil.getRootContainer(model)).children
			if (! validationErrors.empty) {
				return "note \"Model has validation errors.\" as N1"
			}
			return model.diagram
		} 
		
		'''note "Nothing show." as N1'''

	}
	
	def dispatch String diagram(DemDomainEvent model) {
		if (eventDiagramProvider.canProvide(model)) {
			return eventDiagramProvider.diagramText(model)
		}
		return '''note "No domain event to show." as N1'''
	}
	
	def dispatch String diagram(DemActorModel model) {
		if (actorsOverviewDiagramProvider.canProvide(model)) {
			return actorsOverviewDiagramProvider.diagramText(model)
		}
		return '''note "No actors to show." as N1'''
	}
	
	def dispatch String diagram(DemEventsOverviewModel model) {
		if (eventsOverviewDiagramProvider.canProvide(model)) {
			return eventsOverviewDiagramProvider.diagramText(model)
		}
		return '''note "No events to show." as N1'''
	}
}
