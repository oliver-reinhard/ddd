package com.mimacom.ddd.im.generator.documentation

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DTextSegment
import com.mimacom.ddd.im.generator.generator.ExceptionMapping
import java.util.stream.Collectors
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider
import org.eclipse.xtext.documentation.impl.MultiLineCommentDocumentationProvider

class GeneratorDocumentationProvider implements IEObjectDocumentationProvider {
	MultiLineCommentDocumentationProvider delegate

	@Inject new(MultiLineCommentDocumentationProvider delegate) {
		this.delegate = delegate
	}

	override String getDocumentation(EObject o) {
		o.doGetDocumentation
	}
	
	def dispatch doGetDocumentation(EObject o) {
		delegate.getDocumentation(o)
	}
	
	def dispatch doGetDocumentation(ExceptionMapping o) {
		var description = o?.type?.description
		if (description !== null) {
			return description.segments.stream
				.filter([it instanceof DTextSegment])
				.map([it as DTextSegment])
				.map([value])
				.collect(Collectors::joining(", "))
		}
		return delegate.getDocumentation(o)
	}
}
