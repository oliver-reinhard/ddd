package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.base.BasePackage;
import com.mimacom.ddd.dm.base.base.DExpression;
import com.mimacom.ddd.dm.base.base.DRichText;
import com.mimacom.ddd.dm.base.richText.AbstractRichTextRenderer;
import com.mimacom.ddd.dm.base.richText.AbstractRichTextToPlainTextRenderer;
import com.mimacom.ddd.dm.base.styledText.DStyledTextSpan;
import com.mimacom.ddd.dm.base.styledText.parser.ErrorMessageAcceptor;
import com.mimacom.ddd.dm.base.styledText.parser.StyledTextParser;
import com.mimacom.ddd.dm.dmx.DmxContextReference;
import com.mimacom.ddd.dm.dmx.DmxStaticReference;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DmxRichTextUtil {
  protected static final BasePackage BASE = BasePackage.eINSTANCE;
  
  private static final int START_OFFSET = 1;
  
  private static final int END_OFFSET = 1;
  
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
   * Preconditions: rt is part of an XtextResource and the syntax the resource's text is valid
   */
  public DStyledTextSpan parse(final DRichText rt, final ErrorMessageAcceptor acceptor) {
    final List<INode> nodes = NodeModelUtils.findNodesForFeature(rt, DmxRichTextUtil.BASE.getDRichText_Segments());
    boolean _isEmpty = nodes.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      final INode root = IterableExtensions.<INode>head(nodes).getRootNode();
      final int startIndex = IterableExtensions.<INode>head(nodes).getOffset();
      int _endOffset = IterableExtensions.<INode>last(nodes).getEndOffset();
      final int endIndex = (_endOffset - 1);
      if (((endIndex - DmxRichTextUtil.END_OFFSET) >= (startIndex + DmxRichTextUtil.START_OFFSET))) {
        String _text = root.getText();
        final StyledTextParser parser = new StyledTextParser(_text, (startIndex + DmxRichTextUtil.START_OFFSET), (endIndex - DmxRichTextUtil.END_OFFSET), acceptor);
        return parser.parse();
      }
    }
    return null;
  }
  
  public String toPlainText(final DRichText text) {
    String _xblockexpression = null;
    {
      final AbstractRichTextToPlainTextRenderer renderer = new AbstractRichTextToPlainTextRenderer() {
        @Override
        protected String getSourceText(final DExpression expr) {
          return AbstractRichTextRenderer.getSourceTextFromXtextResource(expr);
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
              _switchResult = super.renderStyleExpression(expr, DmxRichTextUtil.this.plainlinkText(((DmxStaticReference)expr)));
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
        protected String encode(final String plainText) {
          return plainText;
        }
      };
      CharSequence _render = renderer.render(text);
      _xblockexpression = ((String) _render);
    }
    return _xblockexpression;
  }
  
  public String plainlinkText(final DmxStaticReference ref) {
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
  
  /**
   * Preconditions: xtextObject is part of an XtextResource and the syntax the resource's text is valid.<p>
   * 
   * @return {@code null} if no corresponding node was be found in the syntax tree.
   */
  public String getSourceCodeFromXtextResource(final EObject xtextObject) {
    final ICompositeNode node = NodeModelUtils.findActualNodeFor(xtextObject);
    String _xifexpression = null;
    if ((node != null)) {
      _xifexpression = node.getText();
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
}
