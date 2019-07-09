package com.mimacom.ddd.sm.sim.scoping;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.linking.impl.LinkingHelper;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.tokens.CrossReferenceSerializer;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DType;

public class SimCrossReferenceSerializer extends CrossReferenceSerializer {
	
	@Inject
	private LinkingHelper linkingHelper;

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	@Inject
	private IValueConverterService valueConverter;

	protected String getCrossReferenceNameFromScope(EObject semanticObject, CrossReference crossref, EObject target,
			final IScope scope, Acceptor errors) {
		String ruleName = linkingHelper.getRuleNameFrom(crossref);
		boolean foundOne = false;
		List<ISerializationDiagnostic> recordedErrors = null;
//		for (IEObjectDescription desc : scope.getElements(target)) {  ==> getElements(target) always returns 0 descriptions
//		---- BEGIN FIX ----
		Iterable<IEObjectDescription> scopeElements = null;
		if (target instanceof DType) {
			String name = ((DType) target).getName();
			scopeElements = scope.getAllElements();
			scopeElements = Lists.newArrayList(Iterables.filter(scopeElements, new Predicate<IEObjectDescription>() {
				@Override
				public boolean apply(IEObjectDescription input) {
					return name.equals(input.getName().toString());
				}
			}));
		} else {
			scopeElements = scope.getElements(target);
		}
		for (IEObjectDescription desc : scopeElements) {
//		---- END FIX ----
			foundOne = true;
			String unconverted = qualifiedNameConverter.toString(desc.getName());
			try {
				return valueConverter.toString(unconverted, ruleName);
			} catch (ValueConverterException e) {
				if (errors != null) {
					if (recordedErrors == null)
						recordedErrors = Lists.newArrayList();
					recordedErrors.add(diagnostics.getValueConversionExceptionDiagnostic(semanticObject, crossref,
							unconverted, e));
				}
			}
		}
		if (errors != null) {
			if (recordedErrors != null)
				for (ISerializationDiagnostic diag : recordedErrors)
					errors.accept(diag);
			if (!foundOne)
				errors.accept(diagnostics.getNoEObjectDescriptionFoundDiagnostic(semanticObject, crossref, target,
						scope));
		}
		return null;
	}
}
