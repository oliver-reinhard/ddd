package com.mimacom.ddd.util.plantuml;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewPart;

import com.google.inject.Injector;

import net.sourceforge.plantuml.eclipse.utils.DiagramTextProvider;

public abstract class AbstractInjectingDiagramTextProviderWrapper implements DiagramTextProvider {
	
	// Standard Xtext injector not working because EsmDiagramTextProvider object is created by PlantUML extension point
	// via "new" => need to obtain injector explicitly, then create objects with it (instead of just: e.g. @Inject ISerializer serializer)
	protected Injector injector;
	protected DiagramTextProvider wrapped;
	
	public AbstractInjectingDiagramTextProviderWrapper() {
		injector = getInjector();
		wrapped = injector.getInstance(getDiagramTextProviderClass());
	}
	
	/**
	 * Obtain an instance of the injector and return it, if possible a singleton instance.
	 */
	abstract protected Injector getInjector();
	
	/**
	 * @return the class of the wrapped object.
	 */
	abstract protected Class<? extends DiagramTextProvider> getDiagramTextProviderClass();

	@Override
	public boolean supportsSelection(ISelection selection) {
		return wrapped.supportsSelection(selection);
	}

	@Override
	public String getDiagramText(IEditorPart editorPart, ISelection selection) {
		return wrapped.getDiagramText(editorPart, selection);
	}

	@Override
	public String getDiagramText(IViewPart viewPart, ISelection selection) {
		return wrapped.getDiagramText(viewPart, selection);
	}

	@Override
	public boolean supportsEditor(IEditorPart editorPart) {
		return wrapped.supportsEditor(editorPart);
	}

	@Override
	public boolean supportsView(IViewPart viewPart) {
		return wrapped.supportsView(viewPart);
	}
}
