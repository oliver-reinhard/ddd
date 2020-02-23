package com.mimacom.ddd.pub.pub;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.base.richText.AbstractRichTextToPlainTextRenderer;
import com.mimacom.ddd.dm.dmx.DmxContextReference;
import com.mimacom.ddd.dm.dmx.DmxRichTextUtil;
import com.mimacom.ddd.dm.dmx.DmxStaticReference;
import com.mimacom.ddd.pub.proto.ProtoAbbreviations;
import com.mimacom.ddd.pub.proto.ProtoAbstract;
import com.mimacom.ddd.pub.proto.ProtoAppendix;
import com.mimacom.ddd.pub.proto.ProtoBibliography;
import com.mimacom.ddd.pub.proto.ProtoChangeHistory;
import com.mimacom.ddd.pub.proto.ProtoChapter;
import com.mimacom.ddd.pub.proto.ProtoDivision;
import com.mimacom.ddd.pub.proto.ProtoDocumentSegment;
import com.mimacom.ddd.pub.proto.ProtoEpilogue;
import com.mimacom.ddd.pub.proto.ProtoGlossary;
import com.mimacom.ddd.pub.proto.ProtoIndex;
import com.mimacom.ddd.pub.proto.ProtoListOfFigures;
import com.mimacom.ddd.pub.proto.ProtoListOfTables;
import com.mimacom.ddd.pub.proto.ProtoPart;
import com.mimacom.ddd.pub.proto.ProtoPreface;
import com.mimacom.ddd.pub.proto.ProtoPublicationBody;
import com.mimacom.ddd.pub.proto.ProtoSection;
import com.mimacom.ddd.pub.proto.ProtoSubsection;
import com.mimacom.ddd.pub.proto.ProtoSubsubsection;
import com.mimacom.ddd.pub.proto.ProtoTOC;
import com.mimacom.ddd.pub.proto.PublicationClass;
import com.mimacom.ddd.pub.pub.Abbreviations;
import com.mimacom.ddd.pub.pub.Abstract;
import com.mimacom.ddd.pub.pub.Appendix;
import com.mimacom.ddd.pub.pub.Bibliography;
import com.mimacom.ddd.pub.pub.ChangeHistory;
import com.mimacom.ddd.pub.pub.Chapter;
import com.mimacom.ddd.pub.pub.Division;
import com.mimacom.ddd.pub.pub.DocumentSegment;
import com.mimacom.ddd.pub.pub.Epilogue;
import com.mimacom.ddd.pub.pub.Glossary;
import com.mimacom.ddd.pub.pub.Index;
import com.mimacom.ddd.pub.pub.ListOfFigures;
import com.mimacom.ddd.pub.pub.ListOfTables;
import com.mimacom.ddd.pub.pub.Part;
import com.mimacom.ddd.pub.pub.Preface;
import com.mimacom.ddd.pub.pub.PublicationBody;
import com.mimacom.ddd.pub.pub.Section;
import com.mimacom.ddd.pub.pub.Subsection;
import com.mimacom.ddd.pub.pub.Subsubsection;
import com.mimacom.ddd.pub.pub.TOC;
import com.mimacom.ddd.pub.pub.TitledBlock;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class PubUtil {
  @Inject
  @Extension
  private DmxRichTextUtil _dmxRichTextUtil;
  
  protected String _displayName(final EObject obj) {
    return obj.eClass().getName().replace("Titled", "");
  }
  
  protected String _displayName(final Object obj) {
    String _name = obj.getClass().getName();
    String _plus = ("Unsupported object type: " + _name);
    throw new IllegalArgumentException(_plus);
  }
  
  public String guard(final String subject, final String alternative) {
    if (((subject != null) && (!subject.isEmpty()))) {
      return subject;
    }
    if ((alternative != null)) {
      return alternative;
    }
    return "";
  }
  
  /**
   * Returns the prototype segment corresponding to the given segment.
   * 
   * @return null if no corresponding prototype segment was found, or the first one if several prototype segments match
   */
  public ProtoDocumentSegment prototype(final DocumentSegment segment) {
    Class<? extends ProtoDocumentSegment> _switchResult = null;
    boolean _matched = false;
    if (segment instanceof Abstract) {
      _matched=true;
      _switchResult = ProtoAbstract.class;
    }
    if (!_matched) {
      if (segment instanceof Preface) {
        _matched=true;
        _switchResult = ProtoPreface.class;
      }
    }
    if (!_matched) {
      if (segment instanceof Epilogue) {
        _matched=true;
        _switchResult = ProtoEpilogue.class;
      }
    }
    if (!_matched) {
      if (segment instanceof PublicationBody) {
        _matched=true;
        _switchResult = ProtoPublicationBody.class;
      }
    }
    if (!_matched) {
      if (segment instanceof ChangeHistory) {
        _matched=true;
        _switchResult = ProtoChangeHistory.class;
      }
    }
    if (!_matched) {
      if (segment instanceof TOC) {
        _matched=true;
        _switchResult = ProtoTOC.class;
      }
    }
    if (!_matched) {
      if (segment instanceof Abbreviations) {
        _matched=true;
        _switchResult = ProtoAbbreviations.class;
      }
    }
    if (!_matched) {
      if (segment instanceof ListOfTables) {
        _matched=true;
        _switchResult = ProtoListOfTables.class;
      }
    }
    if (!_matched) {
      if (segment instanceof ListOfFigures) {
        _matched=true;
        _switchResult = ProtoListOfFigures.class;
      }
    }
    if (!_matched) {
      if (segment instanceof Bibliography) {
        _matched=true;
        _switchResult = ProtoBibliography.class;
      }
    }
    if (!_matched) {
      if (segment instanceof Glossary) {
        _matched=true;
        _switchResult = ProtoGlossary.class;
      }
    }
    if (!_matched) {
      if (segment instanceof Index) {
        _matched=true;
        _switchResult = ProtoIndex.class;
      }
    }
    if (!_matched) {
      String _string = segment.getClass().toString();
      throw new IllegalArgumentException(_string);
    }
    final Class<? extends ProtoDocumentSegment> prototypeType = _switchResult;
    final PublicationClass pubClass = segment.getParent().getPublicationClass();
    final Iterable<? extends ProtoDocumentSegment> result = Iterables.filter(pubClass.getSegments(), prototypeType);
    boolean _isEmpty = IterableExtensions.isEmpty(result);
    if (_isEmpty) {
      return null;
    }
    return IterableExtensions.head(result);
  }
  
  /**
   * Returns the prototype division corresponding to the given division.
   * 
   * @return null if no corresponding prototype division was found, or the first one if several prototype division match
   */
  public ProtoDivision prototype(final Division div) {
    Class<? extends ProtoDivision> _switchResult = null;
    boolean _matched = false;
    if (div instanceof Appendix) {
      _matched=true;
      _switchResult = ProtoAppendix.class;
    }
    if (!_matched) {
      if (div instanceof Part) {
        _matched=true;
        _switchResult = ProtoPart.class;
      }
    }
    if (!_matched) {
      if (div instanceof Chapter) {
        _matched=true;
        _switchResult = ProtoChapter.class;
      }
    }
    if (!_matched) {
      if (div instanceof Section) {
        _matched=true;
        _switchResult = ProtoSection.class;
      }
    }
    if (!_matched) {
      if (div instanceof Subsection) {
        _matched=true;
        _switchResult = ProtoSubsection.class;
      }
    }
    if (!_matched) {
      if (div instanceof Subsubsection) {
        _matched=true;
        _switchResult = ProtoSubsubsection.class;
      }
    }
    if (!_matched) {
      String _string = div.getClass().toString();
      throw new IllegalArgumentException(_string);
    }
    final Class<? extends ProtoDivision> prototypeType = _switchResult;
    final PublicationClass pubClass = div.getDocument().getPublicationClass();
    final Iterable<? extends ProtoDivision> result = Iterables.filter(pubClass.getDivisions(), prototypeType);
    boolean _isEmpty = IterableExtensions.isEmpty(result);
    if (_isEmpty) {
      return null;
    }
    return IterableExtensions.head(result);
  }
  
  public String toPlainText(final DRichText text) {
    String _xblockexpression = null;
    {
      boolean _not = (!((text.eContainer() instanceof TitledBlock) || (text.eContainer() instanceof Division)));
      if (_not) {
        throw new IllegalArgumentException("Text is not the title of a TitledBlock or a Division");
      }
      final AbstractRichTextToPlainTextRenderer renderer = new AbstractRichTextToPlainTextRenderer() {
        @Override
        protected String getSourceText(final DExpression expr) {
          return PubUtil.this._dmxRichTextUtil.getSourceTextFromXtextResource(expr);
        }
        
        @Override
        protected CharSequence renderStyleExpression(final DExpression expr, final String parsedText) {
          CharSequence _switchResult = null;
          boolean _matched = false;
          if (expr instanceof DmxContextReference) {
            _matched=true;
            _switchResult = super.renderStyleExpression(expr, ((DmxContextReference)expr).getTarget().getName());
          }
          if (!_matched) {
            if (expr instanceof DmxStaticReference) {
              _matched=true;
              _switchResult = super.renderStyleExpression(expr, PubUtil.this.plainlinkText(((DmxStaticReference)expr)));
            }
          }
          if (!_matched) {
            String _name = expr.getClass().getName();
            String _plus = ("Unsupported content-block type: " + _name);
            throw new IllegalArgumentException(_plus);
          }
          return _switchResult;
        }
        
        @Override
        protected String escape(final String plainText) {
          return plainText;
        }
      };
      CharSequence _render = renderer.render(text);
      _xblockexpression = ((String) _render);
    }
    return _xblockexpression;
  }
  
  protected String plainlinkText(final DmxStaticReference ref) {
    boolean _isEmpty = this.guard(ref.getDisplayName(), "").isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      boolean _isPlural = ref.isPlural();
      if (_isPlural) {
        String _displayName = ref.getDisplayName();
        return (_displayName + "s");
      }
      return ref.getDisplayName();
    }
    String _name = ref.getTarget().getName();
    String _plus = (_name + ".");
    String _name_1 = ref.getMember().getName();
    return (_plus + _name_1);
  }
  
  public String displayName(final Object obj) {
    if (obj instanceof EObject) {
      return _displayName((EObject)obj);
    } else if (obj != null) {
      return _displayName(obj);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(obj).toString());
    }
  }
}
