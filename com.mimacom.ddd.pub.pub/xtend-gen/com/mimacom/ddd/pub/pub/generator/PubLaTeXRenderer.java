/**
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.pub.pub.generator;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DExpression;
import com.mimacom.ddd.dm.base.base.DNamedElement;
import com.mimacom.ddd.dm.base.base.DRichText;
import com.mimacom.ddd.dm.base.richText.AbstractRichTextRenderer;
import com.mimacom.ddd.dm.base.richText.AbstractRichTextToLaTeXRenderer;
import com.mimacom.ddd.dm.base.richText.RichTextUtil;
import com.mimacom.ddd.dm.base.styledText.parser.ErrorMessageAcceptor;
import com.mimacom.ddd.dm.dmx.DmxContextReference;
import com.mimacom.ddd.dm.dmx.DmxRichTextUtil;
import com.mimacom.ddd.dm.dmx.DmxStaticReference;
import com.mimacom.ddd.dm.dmx.DmxUrlLiteral;
import com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle;
import com.mimacom.ddd.pub.proto.ProtoSymbolReference;
import com.mimacom.ddd.pub.pub.Abstract;
import com.mimacom.ddd.pub.pub.AbstractFigure;
import com.mimacom.ddd.pub.pub.Admonition;
import com.mimacom.ddd.pub.pub.Appendix;
import com.mimacom.ddd.pub.pub.ContentBlock;
import com.mimacom.ddd.pub.pub.Division;
import com.mimacom.ddd.pub.pub.Document;
import com.mimacom.ddd.pub.pub.DocumentSegment;
import com.mimacom.ddd.pub.pub.Equation;
import com.mimacom.ddd.pub.pub.Footnote;
import com.mimacom.ddd.pub.pub.Index;
import com.mimacom.ddd.pub.pub.List;
import com.mimacom.ddd.pub.pub.ListItem;
import com.mimacom.ddd.pub.pub.Paragraph;
import com.mimacom.ddd.pub.pub.PubPackage;
import com.mimacom.ddd.pub.pub.PubUtil;
import com.mimacom.ddd.pub.pub.PublicationBody;
import com.mimacom.ddd.pub.pub.Reference;
import com.mimacom.ddd.pub.pub.ReferenceScope;
import com.mimacom.ddd.pub.pub.ReferenceTarget;
import com.mimacom.ddd.pub.pub.RichTextParagraph;
import com.mimacom.ddd.pub.pub.RichTextReferencingParagraph;
import com.mimacom.ddd.pub.pub.SegmentWithTable;
import com.mimacom.ddd.pub.pub.SegmentWithText;
import com.mimacom.ddd.pub.pub.Symbol;
import com.mimacom.ddd.pub.pub.Table;
import com.mimacom.ddd.pub.pub.TableCell;
import com.mimacom.ddd.pub.pub.TitledBlock;
import com.mimacom.ddd.pub.pub.TitledCodeListing;
import com.mimacom.ddd.pub.pub.TitledTable;
import com.mimacom.ddd.pub.pub.UnformattedParagraph;
import com.mimacom.ddd.pub.pub.generator.AbstractPubRenderer;
import com.mimacom.ddd.pub.pub.generator.IDiagramFileFormatPreference;
import com.mimacom.ddd.pub.pub.generator.NestedContentBlockGenerator;
import com.mimacom.ddd.pub.pub.generator.NestedElementsRenderer;
import com.mimacom.ddd.pub.pub.generator.PubGeneratorTarget;
import com.mimacom.ddd.pub.pub.generator.PubGeneratorUtil;
import com.mimacom.ddd.pub.pub.generator.PubLaTeXDiagramFileFormatPreference;
import com.mimacom.ddd.pub.pub.generator.PubLaTeXTableGenerator;
import com.mimacom.ddd.pub.pub.generator.PubNumberingUtil;
import java.util.Arrays;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class PubLaTeXRenderer extends AbstractPubRenderer {
  @Inject
  @Extension
  private RichTextUtil _richTextUtil;
  
  @Inject
  @Extension
  private DmxRichTextUtil _dmxRichTextUtil;
  
  @Inject
  @Extension
  private PubUtil _pubUtil;
  
  @Inject
  @Extension
  private PubGeneratorUtil _pubGeneratorUtil;
  
  @Inject
  @Extension
  private PubNumberingUtil _pubNumberingUtil;
  
  public static final String DOCUMENT_SUFFIX = "tex";
  
  public static final String CSS_FILENAME = "pubstyles.css";
  
  private static final PubPackage PUB = PubPackage.eINSTANCE;
  
  private static final String GUILLEMOT_LEFT = "«";
  
  private static final String GUILLEMOT_RIGHT = "»";
  
  @Inject
  private PubLaTeXDiagramFileFormatPreference diagramFileFormatPreference;
  
  @Override
  public String fileSuffix(final Document doc) {
    return PubLaTeXRenderer.DOCUMENT_SUFFIX;
  }
  
  @Override
  public PubGeneratorTarget target() {
    return PubGeneratorTarget.LaTeX;
  }
  
  @Override
  public void prepare(final Document doc, final IFileSystemAccess2 fsa) {
  }
  
  @Override
  public void finish(final Document doc, final IFileSystemAccess2 fsa) {
  }
  
  @Override
  public CharSequence renderDocument(final Document doc, final NestedElementsRenderer p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("% Generated by ");
    String _name = this.getClass().getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\documentclass[a4paper]{");
    String _laTeXClass = this.laTeXClass(doc);
    _builder.append(_laTeXClass);
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\usepackage{fullpage}      % use narrower page margins");
    _builder.newLine();
    _builder.append("\\usepackage{ulem}          % strikethrough");
    _builder.newLine();
    _builder.append("\\usepackage{etoolbox}      % quotes");
    _builder.newLine();
    _builder.append("\\usepackage{enumitem}      % list numbering");
    _builder.newLine();
    _builder.append("\\usepackage{multirow}      % tables with column span and or rowspan");
    _builder.newLine();
    _builder.append("\\usepackage{pbox}          % paragraphs or line breaks in table cell");
    _builder.newLine();
    _builder.append("\\usepackage{graphicx}      % include graphics files; supports .eps (but not .svg)");
    _builder.newLine();
    _builder.append("\\usepackage{listings}      % code listings, see https://en.wikibooks.org/wiki/LaTeX/Source_Code_Listings");
    _builder.newLine();
    _builder.append("\\usepackage{lstautogobble} % listing-indent control");
    _builder.newLine();
    _builder.append("\\usepackage{hyperref}      % hyperlinks");
    _builder.newLine();
    _builder.append("\\usepackage[T1]{fontenc}   % enables use of \\guillemotleft & -right, see http://detexify.kirelabs.org/symbols.html");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\lstset{captionpos=b, basicstyle=\\footnotesize, numberstyle=\\tiny,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("tabsize=");
    _builder.append(PubGeneratorUtil.TAB_SIZE, "\t");
    _builder.append(", autogobble,");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("breaklines, breakatwhitespace,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("extendedchars, literate={≤}{$\\leq$}1 {≥}{$\\geq$}1 {->}{{$\\rightarrow$}}1 {=>}{{$\\rightarrow$}}1 ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.append(PubLaTeXRenderer.GUILLEMOT_LEFT, "\t");
    _builder.append("}{{\\guillemotleft}}1 {");
    _builder.append(PubLaTeXRenderer.GUILLEMOT_RIGHT, "\t");
    _builder.append("}{{\\guillemotright}}1 % DMX special symbols");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    CharSequence _renderPreamble = this.renderPreamble(doc);
    _builder.append(_renderPreamble);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\begin{document}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\\maketitle");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _render = p.render();
    _builder.append(_render, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\\end{document}");
    _builder.newLine();
    return _builder;
  }
  
  protected String laTeXClass(final Document doc) {
    String _xifexpression = null;
    boolean _empty = this._pubGeneratorUtil.empty(doc.getPublicationClass().getLaTeXClass());
    if (_empty) {
      _xifexpression = doc.getPublicationClass().getName().toLowerCase();
    } else {
      _xifexpression = doc.getPublicationClass().getLaTeXClass();
    }
    return _xifexpression;
  }
  
  protected CharSequence renderPreamble(final Document doc) {
    final DRichText preamble = doc.getPublicationClass().getLaTeXPreamble();
    if ((preamble != null)) {
      final AbstractRichTextToLaTeXRenderer renderer = new AbstractRichTextToLaTeXRenderer() {
        @Override
        protected String getSourceText(final DExpression expr) {
          return PubLaTeXRenderer.this._dmxRichTextUtil.getSourceTextFromXtextResource(expr);
        }
        
        @Override
        protected CharSequence renderStyleExpression(final DExpression expr, final String parsedText) {
          if ((expr instanceof ProtoSymbolReference)) {
            final Symbol docSymbol = doc.getSymbol(((ProtoSymbolReference)expr).getTarget().getName());
            if ((docSymbol != null)) {
              return PubLaTeXRenderer.this.renderRichText(docSymbol.getValue());
            }
            String _name = ((ProtoSymbolReference)expr).getTarget().getName();
            String _plus = ("No value for symbol \'" + _name);
            String _plus_1 = (_plus + "\'");
            throw new NullPointerException(_plus_1);
          }
          return super.renderStyleExpression(expr, parsedText);
        }
        
        @Override
        protected String encode(final String plainText) {
          return plainText;
        }
      };
      return renderer.render(preamble);
    }
    return "";
  }
  
  @Override
  public CharSequence renderSegment(final SegmentWithText seg, final NestedElementsRenderer blocks) {
    return this.renderSegmentWithText(seg, blocks);
  }
  
  protected CharSequence _renderSegmentWithText(final Abstract seg, final NestedElementsRenderer blocks) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{abstract}");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _renderAnchor = this.renderAnchor(seg);
    _builder.append(_renderAnchor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _render = blocks.render();
    _builder.append(_render, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\\end{abstract}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _renderSegmentWithText(final SegmentWithText seg, final NestedElementsRenderer blocks) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _renderTitle = this.renderTitle(seg);
    _builder.append(_renderTitle);
    _builder.newLineIfNotEmpty();
    CharSequence _render = blocks.render();
    _builder.append(_render);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence renderSegment(final PublicationBody seg, final NestedElementsRenderer divisions) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _render = divisions.render();
    _builder.append(_render);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence renderSegment(final SegmentWithTable seg, final Table t, final NestedContentBlockGenerator g) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _renderTitle = this.renderTitle(seg);
    _builder.append(_renderTitle);
    _builder.newLineIfNotEmpty();
    CharSequence _renderTable = this.renderTable(t, g);
    _builder.append(_renderTable);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence renderSegment(final Index seg) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _renderTitle = this.renderTitle(seg);
    _builder.append(_renderTitle);
    _builder.newLineIfNotEmpty();
    _builder.append("-- index TODO");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence renderTitle(final DocumentSegment seg) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\section*{");
    CharSequence _encode = this.encode(this._pubGeneratorUtil.nonEmptyTitle(seg));
    _builder.append(_encode);
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    CharSequence _renderAnchor = this.renderAnchor(seg);
    _builder.append(_renderAnchor);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence renderTitle(final Division div) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((div instanceof Appendix)) {
        _builder.append("\\appendix");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\\");
    CharSequence _divisionName = this.divisionName(div);
    _builder.append(_divisionName);
    _builder.append("{");
    CharSequence _renderRichText = this.renderRichText(div.getTitle());
    _builder.append(_renderRichText);
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    CharSequence _renderAnchor = this.renderAnchor(div);
    _builder.append(_renderAnchor);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence divisionName(final Division div) {
    if ((div instanceof Appendix)) {
      return PubLaTeXRenderer.PUB.getSection().getName().toLowerCase();
    }
    return div.eClass().getName().toLowerCase();
  }
  
  @Override
  public CharSequence renderAnchor(final ReferenceTarget target) {
    final String label = this.labelFor(target);
    boolean _isEmpty = label.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\\label{");
      _builder.append(label);
      _builder.append("}");
      return _builder;
    }
    return "";
  }
  
  public CharSequence renderListingAnchor(final ReferenceTarget target) {
    final String label = this.labelFor(target);
    boolean _isEmpty = label.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(", label={");
      _builder.append(label);
      _builder.append("}");
      return _builder;
    }
    return "";
  }
  
  protected String labelFor(final ReferenceTarget target) {
    final String id = target.getId();
    if (((id != null) && (!target.getId().isEmpty()))) {
      String _lowerCase = this._pubUtil.displayName(target).toLowerCase();
      String _plus = (_lowerCase + "-");
      return (_plus + id);
    }
    return "";
  }
  
  @Override
  public CharSequence renderAdmonition(final Admonition a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("-- admonition TODO");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence renderBulletList(final List list, final NestedElementsRenderer p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{itemize}");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _renderAnchor = this.renderAnchor(list);
    _builder.append(_renderAnchor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _render = p.render();
    _builder.append(_render, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\\end{itemize} ");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence renderNumberedList(final List list, final NestedElementsRenderer p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{enumerate}[label=\\");
    String _latexNumberingAttribute = this.latexNumberingAttribute(list.getNumberingStyle());
    _builder.append(_latexNumberingAttribute);
    _builder.append("\"*]");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _renderAnchor = this.renderAnchor(list);
    _builder.append(_renderAnchor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _render = p.render();
    _builder.append(_render, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\\end{enumerate}");
    _builder.newLine();
    return _builder;
  }
  
  protected String latexNumberingAttribute(final ProtoSequenceNumberStyle style) {
    String _switchResult = null;
    if (style != null) {
      switch (style) {
        case ARABIC:
          _switchResult = "arabic";
          break;
        case CAPITAL_ROMAN:
          _switchResult = "Roman";
          break;
        case SMALL_ROMAN:
          _switchResult = "roman";
          break;
        case CAPITAL_LETTER:
          _switchResult = "Alph";
          break;
        case SMALL_LETTER:
          _switchResult = "alph";
          break;
        case NONE:
          _switchResult = "arabic";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  @Override
  public CharSequence renderTitledList(final List list, final NestedElementsRenderer p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{description}");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _renderAnchor = this.renderAnchor(list);
    _builder.append(_renderAnchor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _render = p.render();
    _builder.append(_render, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\\end{description}");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence renderListItem(final ListItem item, final NestedElementsRenderer p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\item ");
    CharSequence _render = p.render();
    _builder.append(_render);
    _builder.newLineIfNotEmpty();
    CharSequence _renderAnchor = this.renderAnchor(item);
    _builder.append(_renderAnchor);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence renderTitledListItem(final ListItem item, final NestedElementsRenderer p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\item[");
    CharSequence _renderRichText = this.renderRichText(item.getTitle());
    _builder.append(_renderRichText);
    _builder.append("] ");
    CharSequence _render = p.render();
    _builder.append(_render);
    _builder.newLineIfNotEmpty();
    CharSequence _renderAnchor = this.renderAnchor(item);
    _builder.append(_renderAnchor);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence renderTitledBlock(final TitledBlock b, final NestedElementsRenderer p) {
    return this.renderTitledBlockImpl(b, p);
  }
  
  protected CharSequence _renderTitledBlockImpl(final TitledTable b, final NestedElementsRenderer p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{table}[hpt]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\\centering\\small");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _render = p.render();
    _builder.append(_render, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\\end{table}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _renderTitledBlockImpl(final TitledCodeListing cl, final NestedElementsRenderer p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{lstlisting}[xleftmargin=12pt");
    {
      DRichText _title = cl.getTitle();
      boolean _tripleNotEquals = (_title != null);
      if (_tripleNotEquals) {
        _builder.append(", caption={");
        CharSequence _renderRichText = this.renderRichText(cl.getTitle());
        _builder.append(_renderRichText);
        _builder.append("}");
      }
    }
    {
      boolean _isNumbered = cl.isNumbered();
      if (_isNumbered) {
        _builder.append(", numbers=left");
      }
    }
    CharSequence _renderListingAnchor = this.renderListingAnchor(cl);
    _builder.append(_renderListingAnchor);
    _builder.append("]");
    _builder.newLineIfNotEmpty();
    CharSequence _render = p.render();
    _builder.append(_render);
    _builder.newLineIfNotEmpty();
    _builder.append("\\end{lstlisting}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _renderTitledBlockImpl(final TitledBlock b, final NestedElementsRenderer p) {
    StringConcatenation _builder = new StringConcatenation();
    {
      DRichText _title = b.getTitle();
      boolean _tripleNotEquals = (_title != null);
      if (_tripleNotEquals) {
        _builder.append("\\begin{figure}[ht]");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\\centering");
        _builder.newLine();
        _builder.append("\t");
        CharSequence _render = p.render();
        _builder.append(_render, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\\end{figure}");
        _builder.newLine();
      } else {
        CharSequence _render_1 = p.render();
        _builder.append(_render_1);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  @Override
  public CharSequence renderTitledBlockTitle(final TitledBlock b) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if (((b.getTitle() != null) && (!(b instanceof TitledCodeListing)))) {
        _builder.append("\\caption{");
        CharSequence _renderRichText = this.renderRichText(b.getTitle());
        _builder.append(_renderRichText);
        CharSequence _renderAnchor = this.renderAnchor(b);
        _builder.append(_renderAnchor);
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence renderTable(final Table t, final NestedContentBlockGenerator g) {
    CharSequence _xblockexpression = null;
    {
      final PubLaTeXTableGenerator tableGenerator = new PubLaTeXTableGenerator(t, g);
      _xblockexpression = tableGenerator.render();
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence renderFigure(final AbstractFigure f, final String fileUri) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\includegraphics[width=");
    int _widthPercent = f.getWidthPercent();
    double _divide = (_widthPercent / 100.0);
    _builder.append(_divide);
    _builder.append("\\textwidth]{");
    CharSequence _encode = this.encode(fileUri);
    _builder.append(_encode);
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public IDiagramFileFormatPreference diagramFileFormatPreference() {
    return this.diagramFileFormatPreference;
  }
  
  @Override
  public CharSequence renderEquation(final Equation e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("-- equation TODO");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence renderCodeListing(final TitledCodeListing cl, final String outdentedListing) {
    return outdentedListing;
  }
  
  @Override
  public CharSequence renderPlainParagraph(final RichTextParagraph para) {
    CharSequence _renderRichText = this.renderRichText(para.getText());
    String _endParagraph = this.endParagraph(para);
    return (_renderRichText + _endParagraph);
  }
  
  protected boolean isOnlyContentBlockOfTableCell(final ContentBlock para) {
    return ((para.eContainer() instanceof TableCell) && (((Object[])Conversions.unwrapArray(((TableCell) para.eContainer()).getContents(), Object.class)).length == 1));
  }
  
  @Override
  public CharSequence renderQuotedParagraph(final RichTextParagraph para) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\quote{");
    CharSequence _renderRichText = this.renderRichText(para.getText());
    _builder.append(_renderRichText);
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence renderUnformattedParagraph(final UnformattedParagraph para) {
    CharSequence _encode = this.encode(para.getText());
    String _endParagraph = this.endParagraph(para);
    return (_encode + _endParagraph);
  }
  
  @Override
  public CharSequence renderRichTextReferencingParagraph(final RichTextReferencingParagraph para) {
    return this.renderRichText(para.getText());
  }
  
  protected String endParagraph(final Paragraph para) {
    String _xifexpression = null;
    boolean _isInTableCell = this.isInTableCell(para);
    boolean _not = (!_isInTableCell);
    if (_not) {
      _xifexpression = "\\par";
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  protected boolean isInTableCell(final ContentBlock para) {
    return ((para.eContainer() instanceof TableCell) && (((Object[])Conversions.unwrapArray(((TableCell) para.eContainer()).getContents(), Object.class)).length == 1));
  }
  
  @Override
  public AbstractRichTextRenderer createRichTextRenderer(final ErrorMessageAcceptor acceptor) {
    return new AbstractRichTextToLaTeXRenderer() {
      @Override
      protected String getSourceText(final DExpression expr) {
        return PubLaTeXRenderer.this._dmxRichTextUtil.getSourceTextFromXtextResource(expr);
      }
      
      @Override
      protected CharSequence renderStyleExpression(final DExpression expr, final String parsedText) {
        CharSequence _switchResult = null;
        boolean _matched = false;
        if (expr instanceof DmxContextReference) {
          _matched=true;
          CharSequence _xifexpression = null;
          DNamedElement _target = ((DmxContextReference)expr).getTarget();
          if ((_target instanceof Symbol)) {
            DNamedElement _target_1 = ((DmxContextReference)expr).getTarget();
            _xifexpression = PubLaTeXRenderer.this.renderRichText(((Symbol) _target_1).getValue());
          } else {
            _xifexpression = super.renderStyleExpression(expr, ((DmxContextReference)expr).getTarget().getName());
          }
          _switchResult = _xifexpression;
        }
        if (!_matched) {
          if (expr instanceof DmxStaticReference) {
            _matched=true;
            _switchResult = super.renderStyleExpression(expr, PubLaTeXRenderer.this.staticReferenceLinkText(((DmxStaticReference)expr)));
          }
        }
        if (!_matched) {
          if (expr instanceof DmxUrlLiteral) {
            _matched=true;
            _switchResult = PubLaTeXRenderer.this.hyperlink(((DmxUrlLiteral)expr).getValue(), ((DmxUrlLiteral)expr).getDisplay());
          }
        }
        if (!_matched) {
          if (expr instanceof Reference) {
            _matched=true;
            CharSequence _xifexpression = null;
            ReferenceTarget _target = ((Reference)expr).getTarget();
            if ((_target instanceof Footnote)) {
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("\\footnotemark[");
              ReferenceTarget _target_1 = ((Reference)expr).getTarget();
              String _formattedSingleNumber = PubLaTeXRenderer.this._pubNumberingUtil.formattedSingleNumber(((Footnote) _target_1));
              _builder.append(_formattedSingleNumber);
              _builder.append("]");
              _xifexpression = _builder;
            } else {
              _xifexpression = PubLaTeXRenderer.this.refToReferenceTarget(((Reference)expr));
            }
            _switchResult = _xifexpression;
          }
        }
        if (!_matched) {
          _switchResult = super.renderStyleExpression(expr, parsedText);
        }
        return _switchResult;
      }
    };
  }
  
  protected String hyperlink(final String url, final String displayText) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\textsf{");
    {
      boolean _empty = this._pubGeneratorUtil.empty(displayText);
      if (_empty) {
        _builder.append("\\url{");
        _builder.append(url);
        _builder.append("}");
      } else {
        _builder.append("\\href{");
        _builder.append(url);
        _builder.append("}{");
        _builder.append(displayText);
        _builder.append("}");
      }
    }
    _builder.append("}");
    return _builder.toString();
  }
  
  protected String staticReferenceLinkText(final DmxStaticReference ref) {
    boolean _isEmpty = this._pubUtil.guard(ref.getDisplayName(), "").isEmpty();
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
  
  protected String refToReferenceTarget(final Reference ref) {
    String result = this.labelFor(ref.getTarget());
    final Document refContainer = EcoreUtil2.<Document>getContainerOfType(ref, Document.class);
    final Document targetContainer = EcoreUtil2.<Document>getContainerOfType(ref.getTarget(), Document.class);
    if (((refContainer != null) && (targetContainer != refContainer))) {
      String _fileName = this.fileName(targetContainer);
      String _plus = (_fileName + "/");
      String _plus_1 = (_plus + result);
      result = _plus_1;
    }
    String _xifexpression = null;
    boolean _isPageReference = ref.isPageReference();
    if (_isPageReference) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\\pageref{");
      _builder.append(result);
      _builder.append("}");
      _xifexpression = _builder.toString();
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("\\hyperref[");
      _builder_1.append(result);
      _builder_1.append("]{");
      {
        ReferenceScope _scope = ref.getScope();
        boolean _tripleNotEquals = (_scope != null);
        if (_tripleNotEquals) {
          String _displayName = this._pubUtil.displayName(ref.getScope());
          _builder_1.append(_displayName);
          _builder_1.append(" ");
        }
      }
      String _id = ref.getTarget().getId();
      _builder_1.append(_id);
      _builder_1.append("}");
      _xifexpression = _builder_1.toString();
    }
    return _xifexpression;
  }
  
  @Override
  public CharSequence renderFootnoteInPlace(final Footnote f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\footnotetext[");
    String _formattedSingleNumber = this._pubNumberingUtil.formattedSingleNumber(f);
    _builder.append(_formattedSingleNumber);
    _builder.append("]{");
    CharSequence _renderRichText = this.renderRichText(f.getText());
    _builder.append(_renderRichText);
    _builder.append("}");
    return _builder;
  }
  
  @Override
  public CharSequence renderFootnotes(final Iterable<Footnote> footnotes) {
    return null;
  }
  
  @Override
  protected CharSequence encode(final CharSequence plainText) {
    return this._richTextUtil.escapeLaTeX(((String) plainText));
  }
  
  public CharSequence renderSegmentWithText(final SegmentWithText seg, final NestedElementsRenderer blocks) {
    if (seg instanceof Abstract) {
      return _renderSegmentWithText((Abstract)seg, blocks);
    } else if (seg != null) {
      return _renderSegmentWithText(seg, blocks);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(seg, blocks).toString());
    }
  }
  
  protected CharSequence renderTitledBlockImpl(final TitledBlock cl, final NestedElementsRenderer p) {
    if (cl instanceof TitledCodeListing) {
      return _renderTitledBlockImpl((TitledCodeListing)cl, p);
    } else if (cl instanceof TitledTable) {
      return _renderTitledBlockImpl((TitledTable)cl, p);
    } else if (cl != null) {
      return _renderTitledBlockImpl(cl, p);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(cl, p).toString());
    }
  }
}
