package com.mimacom.ddd.im.generator.documentation;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DRichText;
import com.mimacom.ddd.dm.base.base.DTextSegment;
import com.mimacom.ddd.dm.base.base.IRichTextSegment;
import com.mimacom.ddd.im.generator.generator.ExceptionMapping;
import com.mimacom.ddd.sm.asm.SException;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.documentation.impl.MultiLineCommentDocumentationProvider;

@SuppressWarnings("all")
public class GeneratorDocumentationProvider implements IEObjectDocumentationProvider {
  private MultiLineCommentDocumentationProvider delegate;
  
  @Inject
  public GeneratorDocumentationProvider(final MultiLineCommentDocumentationProvider delegate) {
    this.delegate = delegate;
  }
  
  @Override
  public String getDocumentation(final EObject o) {
    return this.doGetDocumentation(o);
  }
  
  protected String _doGetDocumentation(final EObject o) {
    return this.delegate.getDocumentation(o);
  }
  
  protected String _doGetDocumentation(final ExceptionMapping o) {
    SException _type = null;
    if (o!=null) {
      _type=o.getType();
    }
    DRichText _description = null;
    if (_type!=null) {
      _description=_type.getDescription();
    }
    DRichText description = _description;
    if ((description != null)) {
      final Predicate<IRichTextSegment> _function = (IRichTextSegment it) -> {
        return (it instanceof DTextSegment);
      };
      final Function<IRichTextSegment, DTextSegment> _function_1 = (IRichTextSegment it) -> {
        return ((DTextSegment) it);
      };
      final Function<DTextSegment, String> _function_2 = (DTextSegment it) -> {
        return it.getValue();
      };
      return description.getSegments().stream().filter(_function).<DTextSegment>map(_function_1).<String>map(_function_2).collect(Collectors.joining(", "));
    }
    return this.delegate.getDocumentation(o);
  }
  
  public String doGetDocumentation(final EObject o) {
    if (o instanceof ExceptionMapping) {
      return _doGetDocumentation((ExceptionMapping)o);
    } else if (o != null) {
      return _doGetDocumentation(o);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(o).toString());
    }
  }
}
