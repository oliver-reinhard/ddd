/**
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.pub.pub.generator;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.base.richText.AbstractRichTextRenderer;
import com.mimacom.ddd.dm.base.richText.AbstractRichTextToHtmlRenderer;
import com.mimacom.ddd.dm.base.richText.RichTextUtil;
import com.mimacom.ddd.dm.dmx.DmxContextReference;
import com.mimacom.ddd.dm.dmx.DmxRichTextUtil;
import com.mimacom.ddd.dm.dmx.DmxStaticReference;
import com.mimacom.ddd.dm.dmx.DmxUrlLiteral;
import com.mimacom.ddd.dm.styledText.parser.ErrorMessageAcceptor;
import com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle;
import com.mimacom.ddd.pub.proto.ProtoSymbolReference;
import com.mimacom.ddd.pub.pub.AbstractFigure;
import com.mimacom.ddd.pub.pub.Admonition;
import com.mimacom.ddd.pub.pub.ContentBlock;
import com.mimacom.ddd.pub.pub.Division;
import com.mimacom.ddd.pub.pub.Document;
import com.mimacom.ddd.pub.pub.DocumentSegment;
import com.mimacom.ddd.pub.pub.Equation;
import com.mimacom.ddd.pub.pub.Footnote;
import com.mimacom.ddd.pub.pub.GridLines;
import com.mimacom.ddd.pub.pub.Index;
import com.mimacom.ddd.pub.pub.List;
import com.mimacom.ddd.pub.pub.ListItem;
import com.mimacom.ddd.pub.pub.PubUtil;
import com.mimacom.ddd.pub.pub.PublicationBody;
import com.mimacom.ddd.pub.pub.Reference;
import com.mimacom.ddd.pub.pub.ReferenceTarget;
import com.mimacom.ddd.pub.pub.RichTextParagraph;
import com.mimacom.ddd.pub.pub.RichTextReferencingParagraph;
import com.mimacom.ddd.pub.pub.SegmentWithTable;
import com.mimacom.ddd.pub.pub.SegmentWithText;
import com.mimacom.ddd.pub.pub.Symbol;
import com.mimacom.ddd.pub.pub.Table;
import com.mimacom.ddd.pub.pub.TableCell;
import com.mimacom.ddd.pub.pub.TableRow;
import com.mimacom.ddd.pub.pub.TitledBlock;
import com.mimacom.ddd.pub.pub.TitledCodeListing;
import com.mimacom.ddd.pub.pub.TitledFigure;
import com.mimacom.ddd.pub.pub.UnformattedParagraph;
import com.mimacom.ddd.pub.pub.generator.AbstractPubRenderer;
import com.mimacom.ddd.pub.pub.generator.IDiagramFileFormatPreference;
import com.mimacom.ddd.pub.pub.generator.NestedContentBlockGenerator;
import com.mimacom.ddd.pub.pub.generator.NestedElementsRenderer;
import com.mimacom.ddd.pub.pub.generator.PubGeneratorTarget;
import com.mimacom.ddd.pub.pub.generator.PubGeneratorUtil;
import com.mimacom.ddd.pub.pub.generator.PubHtmlDiagramFileFormatPreference;
import com.mimacom.ddd.pub.pub.generator.PubNumberingUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class PubHtmlRenderer extends AbstractPubRenderer {
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
  private PubNumberingUtil _pubNumberingUtil;
  
  @Inject
  @Extension
  private PubGeneratorUtil _pubGeneratorUtil;
  
  public static final String DOCUMENT_SUFFIX = "html";
  
  public static final String CSS_FILENAME = "pubstyles.css";
  
  @Inject
  private PubHtmlDiagramFileFormatPreference diagramFileFormatPreference;
  
  @Override
  public String fileSuffix(final Document doc) {
    return PubHtmlRenderer.DOCUMENT_SUFFIX;
  }
  
  @Override
  public PubGeneratorTarget target() {
    return PubGeneratorTarget.HTML;
  }
  
  @Override
  public void prepare(final Document doc, final IFileSystemAccess2 fsa) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("table, th {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("border-top: 1px solid black;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("border-bottom: 1px solid black;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("border-left: 0.5px solid black;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("border-right: 0.5px solid black;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("border-collapse: collapse;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("td {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("border-bottom: 0.5px solid black;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("border-left: 0.5px solid black;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("border-right: 0.5px solid black;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("border-collapse: collapse;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("th {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("text-align: left;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("th, td {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("height: 10px");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("padding-left: 5px;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("pre {tab-size: ");
    _builder.append(PubGeneratorUtil.TAB_SIZE);
    _builder.append(";}");
    _builder.newLineIfNotEmpty();
    final String css = _builder.toString();
    String _fileSuffix = this.fileSuffix(doc);
    String _plus = (_fileSuffix + "/");
    String _plus_1 = (_plus + PubHtmlRenderer.CSS_FILENAME);
    fsa.generateFile(_plus_1, css);
  }
  
  @Override
  public void finish(final Document doc, final IFileSystemAccess2 fsa) {
  }
  
  @Override
  public CharSequence renderDocument(final Document doc, final NestedElementsRenderer p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html lang=\"en-US\">");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<meta charset=\"UTF-8\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<title>");
    String _title = doc.getTitle();
    _builder.append(_title, "  ");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("<link rel=\"stylesheet\" href=\"");
    _builder.append(PubHtmlRenderer.CSS_FILENAME, "  ");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("</head>");
    _builder.newLine();
    _builder.newLine();
    CharSequence _renderPreamble = this.renderPreamble(doc);
    _builder.append(_renderPreamble);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("<!-- Document class: ");
    String _name = doc.getPublicationClass().getName();
    _builder.append(_name);
    _builder.append(" -->");
    _builder.newLineIfNotEmpty();
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("<h1>");
    String _title_1 = doc.getTitle();
    _builder.append(_title_1);
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    CharSequence _render = p.render();
    _builder.append(_render);
    _builder.newLineIfNotEmpty();
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence renderPreamble(final Document doc) {
    final DRichText preamble = doc.getPublicationClass().getHtmlPreamble();
    if ((preamble != null)) {
      final AbstractRichTextToHtmlRenderer renderer = new AbstractRichTextToHtmlRenderer() {
        @Override
        protected String getSourceText(final DExpression expr) {
          return PubHtmlRenderer.this._dmxRichTextUtil.getSourceTextFromXtextResource(expr);
        }
        
        @Override
        protected CharSequence renderStyleExpression(final DExpression expr, final String parsedText) {
          if ((expr instanceof ProtoSymbolReference)) {
            final Symbol docSymbol = doc.getSymbol(((ProtoSymbolReference)expr).getTarget().getName());
            if ((docSymbol != null)) {
              return PubHtmlRenderer.this.renderRichText(docSymbol.getValue());
            }
            String _name = ((ProtoSymbolReference)expr).getTarget().getName();
            String _plus = ("No value for symbol \'" + _name);
            String _plus_1 = (_plus + "\'");
            throw new NullPointerException(_plus_1);
          }
          return super.renderStyleExpression(expr, parsedText);
        }
        
        @Override
        public String encode(final String plainText) {
          return plainText;
        }
      };
      return renderer.render(preamble);
    }
    return "";
  }
  
  @Override
  public CharSequence renderSegment(final SegmentWithText seg, final NestedElementsRenderer blocks) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div>");
    _builder.newLine();
    CharSequence _renderTitle = this.renderTitle(seg);
    _builder.append(_renderTitle);
    _builder.newLineIfNotEmpty();
    CharSequence _render = blocks.render();
    _builder.append(_render);
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence renderSegment(final PublicationBody seg, final NestedElementsRenderer divisions) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div>");
    _builder.newLine();
    CharSequence _render = divisions.render();
    _builder.append(_render);
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence renderSegment(final SegmentWithTable seg, final Table t, final NestedContentBlockGenerator g) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div>");
    _builder.newLine();
    CharSequence _renderTitle = this.renderTitle(seg);
    _builder.append(_renderTitle);
    _builder.newLineIfNotEmpty();
    CharSequence _renderTable = this.renderTable(t, g);
    _builder.append(_renderTable);
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence renderSegment(final Index seg) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div>");
    _builder.newLine();
    CharSequence _renderTitle = this.renderTitle(seg);
    _builder.append(_renderTitle);
    _builder.newLineIfNotEmpty();
    _builder.append("-- index");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence renderTitle(final DocumentSegment seg) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<h2>");
    CharSequence _renderAnchor = this.renderAnchor(seg);
    _builder.append(_renderAnchor);
    CharSequence _encode = this.encode(this._pubGeneratorUtil.nonEmptyTitle(seg));
    _builder.append(_encode);
    _builder.append("</h2>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence renderTitle(final Division div) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<h");
    int _level = div.getLevel();
    int _plus = (_level + 2);
    _builder.append(_plus);
    _builder.append(">");
    CharSequence _renderAnchor = this.renderAnchor(div);
    _builder.append(_renderAnchor);
    String _tieredNumber = this._pubNumberingUtil.tieredNumber(div);
    _builder.append(_tieredNumber);
    _builder.append(" ");
    CharSequence _renderRichText = this.renderRichText(div.getTitle());
    _builder.append(_renderRichText);
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence renderAnchor(final ReferenceTarget target) {
    final String id = target.getId();
    if (((id != null) && (!target.getId().isEmpty()))) {
      return (("<a id=\"" + id) + "\"></a>");
    }
    return "";
  }
  
  @Override
  public CharSequence renderAdmonition(final Admonition a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("-- admonition");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence renderBulletList(final List list, final NestedElementsRenderer p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul>");
    CharSequence _renderAnchor = this.renderAnchor(list);
    _builder.append(_renderAnchor);
    CharSequence _render = p.render();
    _builder.append(_render);
    _builder.append("</ul>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence renderNumberedList(final List list, final NestedElementsRenderer p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ol type=");
    String _htmlNumberingAttribute = this.htmlNumberingAttribute(list.getNumberingStyle());
    _builder.append(_htmlNumberingAttribute);
    _builder.append("\">");
    CharSequence _renderAnchor = this.renderAnchor(list);
    _builder.append(_renderAnchor);
    CharSequence _render = p.render();
    _builder.append(_render);
    _builder.append("</ol>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected String htmlNumberingAttribute(final ProtoSequenceNumberStyle style) {
    String _switchResult = null;
    if (style != null) {
      switch (style) {
        case ARABIC:
          _switchResult = "1";
          break;
        case CAPITAL_ROMAN:
          _switchResult = "I";
          break;
        case SMALL_ROMAN:
          _switchResult = "i";
          break;
        case CAPITAL_LETTER:
          _switchResult = "A";
          break;
        case SMALL_LETTER:
          _switchResult = "a";
          break;
        case NONE:
          _switchResult = "1";
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
    _builder.append("<ul style=\"list-style-type:none;\">");
    CharSequence _renderAnchor = this.renderAnchor(list);
    _builder.append(_renderAnchor);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _render = p.render();
    _builder.append(_render, "\t");
    _builder.append("</ul>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence renderListItem(final ListItem item, final NestedElementsRenderer p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li>");
    CharSequence _renderAnchor = this.renderAnchor(item);
    _builder.append(_renderAnchor);
    CharSequence _render = p.render();
    _builder.append(_render);
    _builder.append("</li>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence renderTitledListItem(final ListItem item, final NestedElementsRenderer p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li>");
    CharSequence _renderAnchor = this.renderAnchor(item);
    _builder.append(_renderAnchor);
    _builder.append("<p><b>");
    CharSequence _renderRichText = this.renderRichText(item.getTitle());
    _builder.append(_renderRichText);
    _builder.append("</b></p>");
    _builder.newLineIfNotEmpty();
    CharSequence _render = p.render();
    _builder.append(_render);
    _builder.newLineIfNotEmpty();
    _builder.append("</li>");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence renderTitledBlock(final TitledBlock b, final NestedElementsRenderer p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div>");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _renderAnchor = this.renderAnchor(b);
    _builder.append(_renderAnchor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _render = p.render();
    _builder.append(_render, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    return _builder;
  }
  
  @Override
  public CharSequence renderTitledBlockTitle(final TitledBlock b) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<h5>");
    String _labelAndNumber = this._pubNumberingUtil.labelAndNumber(b);
    _builder.append(_labelAndNumber);
    _builder.append(": ");
    CharSequence _renderRichText = this.renderRichText(b.getTitle());
    _builder.append(_renderRichText);
    _builder.append("</h5>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence renderTable(final Table t, final NestedContentBlockGenerator g) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<table style=\"width:");
    int _widthPercent = t.getWidthPercent();
    _builder.append(_widthPercent);
    _builder.append("%; ");
    String _tableBorders = this.tableBorders(t.getGridlines());
    _builder.append(_tableBorders);
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    {
      EList<TableRow> _rows = t.getRows();
      for(final TableRow row : _rows) {
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<tr>\t");
        _builder.newLine();
        {
          EList<TableCell> _cells = row.getCells();
          for(final TableCell cell : _cells) {
            _builder.append("\t");
            _builder.append("\t\t");
            String _startTag = this.startTag(cell);
            _builder.append(_startTag, "\t\t\t");
            {
              EList<ContentBlock> _contents = cell.getContents();
              for(final ContentBlock block : _contents) {
                CharSequence _generate = g.generate(block);
                _builder.append(_generate, "\t\t\t");
              }
            }
            String _xifexpression = null;
            boolean _isIsHeading = row.isIsHeading();
            if (_isIsHeading) {
              _xifexpression = "</th>";
            } else {
              _xifexpression = "</td>";
            }
            _builder.append(_xifexpression, "\t\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("</tr>");
        _builder.newLine();
      }
    }
    _builder.append("</table>");
    _builder.newLine();
    return _builder;
  }
  
  protected String tableBorders(final GridLines gl) {
    String _switchResult = null;
    if (gl != null) {
      switch (gl) {
        case HORIZONTAL:
          _switchResult = "border-left:0; border-right:0;";
          break;
        case VERTICAL:
          _switchResult = "border-top:0; border-bottom:0;";
          break;
        case BOTH:
          _switchResult = "";
          break;
        case NONE:
          _switchResult = "border:0;";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  protected String startTag(final TableCell cell) {
    final StringBuilder b = new StringBuilder();
    String _xifexpression = null;
    boolean _isIsHeading = cell.getRow().isIsHeading();
    if (_isIsHeading) {
      _xifexpression = "<th";
    } else {
      _xifexpression = "<td";
    }
    b.append(_xifexpression);
    final String gridLines = this.tableBorders(cell.getRow().getTable().getGridlines());
    boolean _isEmpty = gridLines.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      b.append(" style=\"");
      b.append(gridLines);
      b.append("\"");
    }
    int _width = cell.getWidth();
    boolean _greaterThan = (_width > 1);
    if (_greaterThan) {
      b.append(" colspan=\"");
      b.append(cell.getWidth());
      b.append("\"");
    }
    int _height = cell.getHeight();
    boolean _greaterThan_1 = (_height > 1);
    if (_greaterThan_1) {
      b.append(" rowspan=\"");
      b.append(cell.getHeight());
      b.append("\"");
    }
    b.append(">");
    return b.toString();
  }
  
  @Override
  public CharSequence renderFigure(final AbstractFigure f, final String fileUri) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<img src=\"");
    CharSequence _encode = this.encode(fileUri);
    _builder.append(_encode);
    _builder.append("\" alt=\"");
    EObject _eContainer = f.eContainer();
    CharSequence _renderRichText = this.renderRichText(((TitledFigure) _eContainer).getTitle());
    _builder.append(_renderRichText);
    _builder.append("\">");
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
    _builder.append("-- equation (TODO)");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence renderCodeListing(final TitledCodeListing cl, final java.util.List<String> codeLines) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<pre>");
    _builder.newLine();
    {
      for(final String line : codeLines) {
        CharSequence _encode = this.encode(line);
        _builder.append(_encode);
      }
    }
    _builder.append("</pre>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence renderPlainParagraph(final RichTextParagraph para) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isOnlyContentBlockOfTableCell = this.isOnlyContentBlockOfTableCell(para);
      if (_isOnlyContentBlockOfTableCell) {
        CharSequence _renderRichText = this.renderRichText(para.getText());
        _builder.append(_renderRichText);
      } else {
        _builder.append("<p>");
        CharSequence _renderRichText_1 = this.renderRichText(para.getText());
        _builder.append(_renderRichText_1);
        _builder.append("</p>");
      }
    }
    return _builder;
  }
  
  protected boolean isOnlyContentBlockOfTableCell(final ContentBlock para) {
    return ((para.eContainer() instanceof TableCell) && (((Object[])Conversions.unwrapArray(((TableCell) para.eContainer()).getContents(), Object.class)).length == 1));
  }
  
  @Override
  public CharSequence renderQuotedParagraph(final RichTextParagraph para) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p><blockquote>");
    CharSequence _renderRichText = this.renderRichText(para.getText());
    _builder.append(_renderRichText);
    _builder.append("</blockquote></p>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence renderUnformattedParagraph(final UnformattedParagraph para) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isOnlyContentBlockOfTableCell = this.isOnlyContentBlockOfTableCell(para);
      if (_isOnlyContentBlockOfTableCell) {
        CharSequence _encode = this.encode(para.getText());
        _builder.append(_encode);
      } else {
        _builder.append("<p>");
        CharSequence _encode_1 = this.encode(para.getText());
        _builder.append(_encode_1);
        _builder.append("</p>");
      }
    }
    return _builder;
  }
  
  @Override
  public CharSequence renderRichTextReferencingParagraph(final RichTextReferencingParagraph para) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isOnlyContentBlockOfTableCell = this.isOnlyContentBlockOfTableCell(para);
      if (_isOnlyContentBlockOfTableCell) {
        CharSequence _renderRichText = this.renderRichText(para.getText());
        _builder.append(_renderRichText);
      } else {
        _builder.append("<p>");
        CharSequence _renderRichText_1 = this.renderRichText(para.getText());
        _builder.append(_renderRichText_1);
        _builder.append("</p>");
      }
    }
    return _builder;
  }
  
  @Override
  public AbstractRichTextRenderer createRichTextRenderer(final ErrorMessageAcceptor acceptor) {
    return new AbstractRichTextToHtmlRenderer() {
      @Override
      protected String getSourceText(final DExpression expr) {
        return PubHtmlRenderer.this._dmxRichTextUtil.getSourceTextFromXtextResource(expr);
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
            _xifexpression = PubHtmlRenderer.this.renderRichText(((Symbol) _target_1).getValue());
          } else {
            _xifexpression = super.renderStyleExpression(expr, ((DmxContextReference)expr).getTarget().getName());
          }
          _switchResult = _xifexpression;
        }
        if (!_matched) {
          if (expr instanceof DmxStaticReference) {
            _matched=true;
            _switchResult = super.renderStyleExpression(expr, PubHtmlRenderer.this.staticReferenceLinkText(((DmxStaticReference)expr)));
          }
        }
        if (!_matched) {
          if (expr instanceof DmxUrlLiteral) {
            _matched=true;
            String _value = ((DmxUrlLiteral)expr).getValue();
            String _xifexpression = null;
            String _display = ((DmxUrlLiteral)expr).getDisplay();
            boolean _tripleNotEquals = (_display != null);
            if (_tripleNotEquals) {
              _xifexpression = ((DmxUrlLiteral)expr).getDisplay();
            } else {
              _xifexpression = ((DmxUrlLiteral)expr).getValue();
            }
            _switchResult = PubHtmlRenderer.this.hyperlink(_value, _xifexpression);
          }
        }
        if (!_matched) {
          if (expr instanceof Reference) {
            _matched=true;
            CharSequence _xifexpression = null;
            ReferenceTarget _target = ((Reference)expr).getTarget();
            if ((_target instanceof Footnote)) {
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("<sup>[");
              ReferenceTarget _target_1 = ((Reference)expr).getTarget();
              String _hyperlink = PubHtmlRenderer.this.hyperlink(PubHtmlRenderer.this.htmlReferenceLinkTargetId(((Reference)expr)), PubHtmlRenderer.this._pubNumberingUtil.formattedSingleNumber(((Footnote) _target_1)));
              _builder.append(_hyperlink);
              _builder.append("]</sup>");
              _xifexpression = _builder;
            } else {
              _xifexpression = PubHtmlRenderer.this.hyperlink(PubHtmlRenderer.this.htmlReferenceLinkTargetId(((Reference)expr)), PubHtmlRenderer.this._pubGeneratorUtil.referenceDisplayText(((Reference)expr).getTarget()));
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
    _builder.append("<a href=\"");
    _builder.append(url);
    _builder.append("\">");
    _builder.append(displayText);
    _builder.append("</a>");
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
  
  protected String htmlReferenceLinkTargetId(final Reference ref) {
    String _id = ref.getTarget().getId();
    String result = ("#" + _id);
    final Document refContainer = EcoreUtil2.<Document>getContainerOfType(ref, Document.class);
    final Document targetContainer = EcoreUtil2.<Document>getContainerOfType(ref.getTarget(), Document.class);
    if (((refContainer != null) && (targetContainer != refContainer))) {
      String _fileName = this.fileName(targetContainer);
      return (_fileName + result);
    }
    return result;
  }
  
  @Override
  public CharSequence renderFootnoteInPlace(final Footnote f) {
    return null;
  }
  
  @Override
  public CharSequence renderFootnotes(final Iterable<Footnote> footnotes) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<br><div style=\"border:0.5px solid grey; width: 200px;\"></div><br>");
    _builder.newLine();
    {
      for(final Footnote f : footnotes) {
        CharSequence _renderAnchor = this.renderAnchor(f);
        _builder.append(_renderAnchor);
        _builder.append(" <sup>");
        String _formattedSingleNumber = this._pubNumberingUtil.formattedSingleNumber(f);
        _builder.append(_formattedSingleNumber);
        _builder.append("</sup> <small>");
        CharSequence _renderRichText = this.renderRichText(f.getText());
        _builder.append(_renderRichText);
        _builder.append("</small>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  @Override
  protected CharSequence encode(final CharSequence plainText) {
    return this._richTextUtil.escapeHtml(((String) plainText));
  }
}
