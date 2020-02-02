package com.mimacom.ddd.pub.pub.generator;

import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.base.richText.AbstractRichTextRenderer;
import com.mimacom.ddd.dm.styledText.parser.ErrorMessageAcceptor;
import com.mimacom.ddd.dm.styledText.parser.NullErrorMessageAcceptor;
import com.mimacom.ddd.pub.pub.Admonition;
import com.mimacom.ddd.pub.pub.CodeListing;
import com.mimacom.ddd.pub.pub.Division;
import com.mimacom.ddd.pub.pub.Document;
import com.mimacom.ddd.pub.pub.DocumentSegment;
import com.mimacom.ddd.pub.pub.Equation;
import com.mimacom.ddd.pub.pub.Figure;
import com.mimacom.ddd.pub.pub.Index;
import com.mimacom.ddd.pub.pub.List;
import com.mimacom.ddd.pub.pub.ListItem;
import com.mimacom.ddd.pub.pub.Paragraph;
import com.mimacom.ddd.pub.pub.PublicationBody;
import com.mimacom.ddd.pub.pub.ReferenceTarget;
import com.mimacom.ddd.pub.pub.SegmentWithTable;
import com.mimacom.ddd.pub.pub.SegmentWithText;
import com.mimacom.ddd.pub.pub.Table;
import com.mimacom.ddd.pub.pub.TitledBlock;
import com.mimacom.ddd.pub.pub.UnformattedParagraph;
import com.mimacom.ddd.pub.pub.generator.NestedContentBlockGenerator;
import com.mimacom.ddd.pub.pub.generator.NestedElementsRenderer;
import org.eclipse.xtext.generator.IFileSystemAccess2;

@SuppressWarnings("all")
public abstract class AbstractPubRenderer {
  private static final NullErrorMessageAcceptor NULL_ERROR_MSG_ACCEPTOR = new NullErrorMessageAcceptor();
  
  public String fileName(final Document doc) {
    String _name = doc.getName();
    String _plus = (_name + ".");
    String _fileSuffix = this.fileSuffix(doc);
    return (_plus + _fileSuffix);
  }
  
  /**
   * Returns file-name suffix excluding any leading dot.
   */
  public abstract String fileSuffix(final Document doc);
  
  public abstract void prepare(final Document doc, final IFileSystemAccess2 fsa);
  
  public abstract void finish(final Document doc, final IFileSystemAccess2 fsa);
  
  public abstract CharSequence renderDocument(final Document doc, final NestedElementsRenderer p);
  
  public abstract CharSequence renderSegment(final SegmentWithText seg, final NestedElementsRenderer blocks);
  
  public abstract CharSequence renderSegment(final PublicationBody seg, final NestedElementsRenderer divisions);
  
  public abstract CharSequence renderSegment(final Index seg);
  
  public abstract CharSequence renderSegment(final SegmentWithTable seg, final Table t, final NestedContentBlockGenerator g);
  
  public abstract CharSequence renderTitle(final DocumentSegment seg);
  
  public abstract CharSequence renderTitle(final Division div);
  
  public abstract CharSequence renderAnchor(final ReferenceTarget target);
  
  public abstract CharSequence renderReferenceTo(final ReferenceTarget target, final String linkText);
  
  public abstract CharSequence renderAdmonition(final Admonition a);
  
  public abstract CharSequence renderBulletList(final List list, final NestedElementsRenderer p);
  
  public abstract CharSequence renderNumberedList(final List list, final NestedElementsRenderer p);
  
  public abstract CharSequence renderTitledList(final List list, final NestedElementsRenderer p);
  
  public abstract CharSequence renderListItem(final ListItem item, final NestedElementsRenderer p);
  
  public abstract CharSequence renderTitledListItem(final ListItem item, final NestedElementsRenderer p);
  
  public abstract CharSequence renderTitledBlock(final TitledBlock b, final NestedElementsRenderer p);
  
  public abstract CharSequence renderTitledBlockTitle(final TitledBlock b);
  
  public abstract CharSequence renderTable(final Table t, final NestedContentBlockGenerator g);
  
  public abstract CharSequence renderFigure(final Figure f, final String fileUri);
  
  public abstract CharSequence renderEquation(final Equation e);
  
  public abstract CharSequence renderCodeListing(final CodeListing cl, final java.util.List<String> lines);
  
  public abstract CharSequence renderPlainParagraph(final Paragraph para);
  
  public abstract CharSequence renderQuotedParagraph(final Paragraph para);
  
  public abstract CharSequence renderUnformattedParagraph(final UnformattedParagraph para);
  
  public abstract AbstractRichTextRenderer createRichTextRenderer(final ErrorMessageAcceptor acceptor);
  
  public CharSequence renderRichText(final DRichText text) {
    final AbstractRichTextRenderer renderer = this.createRichTextRenderer(AbstractPubRenderer.NULL_ERROR_MSG_ACCEPTOR);
    final CharSequence result = renderer.render(text);
    return result;
  }
}
