package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.base.DTextSegment;
import com.mimacom.ddd.dm.base.IRichTextSegment;
import com.mimacom.ddd.dm.styledText.DStyledTextSpan;
import com.mimacom.ddd.dm.styledText.parser.ErrorMessageAcceptor;
import com.mimacom.ddd.dm.styledText.parser.StyledTextParser;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class RichTextUtil {
  protected static final BasePackage BASE = BasePackage.eINSTANCE;
  
  private static final int START_OFFSET = 1;
  
  private static final int END_OFFSET = 1;
  
  public boolean empty(final DRichText rt) {
    if ((rt != null)) {
      EList<IRichTextSegment> _segments = rt.getSegments();
      for (final IRichTextSegment seg : _segments) {
        if ((seg instanceof DExpression)) {
          return false;
        } else {
          if ((seg instanceof DTextSegment)) {
            boolean _isEmpty = ((DTextSegment)seg).getValue().trim().isEmpty();
            boolean _not = (!_isEmpty);
            if (_not) {
              return false;
            }
          }
        }
      }
    }
    return true;
  }
  
  /**
   * Preconditions: rt is part of an XtextResource and the syntax the resource's text is valid
   */
  public DStyledTextSpan parse(final DRichText rt, final ErrorMessageAcceptor acceptor) {
    final List<INode> nodes = NodeModelUtils.findNodesForFeature(rt, RichTextUtil.BASE.getDRichText_Segments());
    boolean _isEmpty = nodes.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      final INode root = IterableExtensions.<INode>head(nodes).getRootNode();
      final int startIndex = IterableExtensions.<INode>head(nodes).getOffset();
      int _endOffset = IterableExtensions.<INode>last(nodes).getEndOffset();
      final int endIndex = (_endOffset - 1);
      if (((endIndex - RichTextUtil.END_OFFSET) >= (startIndex + RichTextUtil.START_OFFSET))) {
        String _text = root.getText();
        final StyledTextParser parser = new StyledTextParser(_text, (startIndex + RichTextUtil.START_OFFSET), (endIndex - RichTextUtil.END_OFFSET), acceptor);
        return parser.parse();
      }
    }
    return null;
  }
  
  /**
   * Preconditions: expr is part of an XtextResource and the syntax the resource's text is valid
   */
  public String getSourceTextFromXtextResource(final DExpression expr) {
    final List<INode> nodes = NodeModelUtils.findNodesForFeature(expr, RichTextUtil.BASE.getDRichText_Segments());
    boolean _isEmpty = nodes.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      final INode root = IterableExtensions.<INode>head(nodes).getRootNode();
      final int startIndex = IterableExtensions.<INode>head(nodes).getOffset();
      int _endOffset = IterableExtensions.<INode>last(nodes).getEndOffset();
      final int endIndex = (_endOffset - 1);
      char[] _charArray = root.getText().toCharArray();
      return new String(_charArray, startIndex, (endIndex - startIndex));
    }
    return null;
  }
}
