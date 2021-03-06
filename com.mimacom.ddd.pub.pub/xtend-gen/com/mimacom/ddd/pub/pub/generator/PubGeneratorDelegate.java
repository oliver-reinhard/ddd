/**
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.pub.pub.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DRichText;
import com.mimacom.ddd.pub.pub.AbstractFigure;
import com.mimacom.ddd.pub.pub.AbstractTable;
import com.mimacom.ddd.pub.pub.Admonition;
import com.mimacom.ddd.pub.pub.ChangeHistory;
import com.mimacom.ddd.pub.pub.Chapter;
import com.mimacom.ddd.pub.pub.Component;
import com.mimacom.ddd.pub.pub.ContentBlock;
import com.mimacom.ddd.pub.pub.Division;
import com.mimacom.ddd.pub.pub.Document;
import com.mimacom.ddd.pub.pub.DocumentSegment;
import com.mimacom.ddd.pub.pub.Equation;
import com.mimacom.ddd.pub.pub.Footnote;
import com.mimacom.ddd.pub.pub.IncludedFigure;
import com.mimacom.ddd.pub.pub.Index;
import com.mimacom.ddd.pub.pub.List2;
import com.mimacom.ddd.pub.pub.ListItem;
import com.mimacom.ddd.pub.pub.ListOfFigures;
import com.mimacom.ddd.pub.pub.ListOfTables;
import com.mimacom.ddd.pub.pub.ListStyle;
import com.mimacom.ddd.pub.pub.ParagraphStyle;
import com.mimacom.ddd.pub.pub.Part;
import com.mimacom.ddd.pub.pub.ProvidedFigure;
import com.mimacom.ddd.pub.pub.ProvidedTable;
import com.mimacom.ddd.pub.pub.PubModel;
import com.mimacom.ddd.pub.pub.PubPlatformUtil;
import com.mimacom.ddd.pub.pub.PubUtil;
import com.mimacom.ddd.pub.pub.Publication;
import com.mimacom.ddd.pub.pub.PublicationBody;
import com.mimacom.ddd.pub.pub.RichTextParagraph;
import com.mimacom.ddd.pub.pub.RichTextReferencingParagraph;
import com.mimacom.ddd.pub.pub.SegmentWithText;
import com.mimacom.ddd.pub.pub.TOC;
import com.mimacom.ddd.pub.pub.Table;
import com.mimacom.ddd.pub.pub.TitledBlock;
import com.mimacom.ddd.pub.pub.TitledCodeListing;
import com.mimacom.ddd.pub.pub.TitledFigure;
import com.mimacom.ddd.pub.pub.TitledTable;
import com.mimacom.ddd.pub.pub.UnformattedParagraph;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramRendererProxy;
import com.mimacom.ddd.pub.pub.generator.AbstractPubRenderer;
import com.mimacom.ddd.pub.pub.generator.CodeListingFormatter;
import com.mimacom.ddd.pub.pub.generator.NestedContentBlockGenerator;
import com.mimacom.ddd.pub.pub.generator.NestedElementsRenderer;
import com.mimacom.ddd.pub.pub.generator.PubGeneratorUtil;
import com.mimacom.ddd.pub.pub.generator.PubNumberingUtil;
import com.mimacom.ddd.pub.pub.tableProvider.TableProviderRegistry;
import com.mimacom.ddd.pub.pub.tableProvider.TableRendererProxy;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class PubGeneratorDelegate {
  @Extension
  private AbstractPubRenderer renderer;
  
  @Inject
  @Extension
  private PubUtil _pubUtil;
  
  @Inject
  @Extension
  private PubPlatformUtil _pubPlatformUtil;
  
  @Inject
  @Extension
  private PubNumberingUtil _pubNumberingUtil;
  
  @Inject
  @Extension
  private PubGeneratorUtil _pubGeneratorUtil;
  
  @Inject
  @Extension
  private CodeListingFormatter _codeListingFormatter;
  
  @Inject
  private TableProviderRegistry tableProviderRegistry;
  
  private static final Logger LOGGER = Logger.getLogger(PubGeneratorDelegate.class);
  
  private static final String FIGURES_GEN_DIRECTORY = "figures";
  
  private Resource resource;
  
  private IFileSystemAccess2 fileSystemAccess;
  
  private Document doc;
  
  private String genDirectory;
  
  private List<Division> allDivisionsInSequenceOfOccurrenceCache;
  
  private List<TitledTable> allTablesInSequenceOfOccurrenceCache;
  
  private List<TitledFigure> allFiguresInSequenceOfOccurrenceCache;
  
  private final NestedContentBlockGenerator nestedContentBlockGenerator = new NestedContentBlockGenerator() {
    @Override
    public CharSequence generate(final ContentBlock b) {
      return PubGeneratorDelegate.this.genBlock(b);
    }
  };
  
  /**
   * Execute once.
   */
  public void init(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.resource = resource;
    this.fileSystemAccess = fsa;
    EObject _get = this.resource.getContents().get(0);
    final PubModel model = ((PubModel) _get);
    this.doc = model.getDocument();
    if ((this.doc != null)) {
      if ((this.doc instanceof Component)) {
        this.initialiseNumberingCaches(((Component)this.doc));
      }
    }
  }
  
  protected void initialiseNumberingCaches(final Component compo) {
    this.allDivisionsInSequenceOfOccurrenceCache = this._pubNumberingUtil.gatherAllDivisionsAndSetSequenceNumbers(compo);
    this.allTablesInSequenceOfOccurrenceCache = this._pubNumberingUtil.gatherAllTablesInSequenceAndSetSequenceNumbers(compo);
    this.allFiguresInSequenceOfOccurrenceCache = this._pubNumberingUtil.gatherAllFiguresInSequenceAndSetSequenceNumbers(compo);
    this._pubNumberingUtil.gatherAllCodeListingsInSequenceAndSetSequenceNumbers(compo);
    this._pubNumberingUtil.gatherAllFootnotesInSequenceAndSetSequenceNumbers(compo);
  }
  
  /**
   * Execute once per target.
   */
  public void generate(final AbstractPubRenderer renderer) {
    if ((this.doc != null)) {
      this.renderer = renderer;
      this.genDirectory = this.renderer.fileSuffix(this.doc);
      this.renderer.prepare(this.doc, this.fileSystemAccess);
      final CharSequence text = this.genDocument(this.doc);
      String _fileName = this.renderer.fileName(this.doc);
      String _plus = ((this.genDirectory + "/") + _fileName);
      this.fileSystemAccess.generateFile(_plus, text);
      this.renderer.finish(this.doc, this.fileSystemAccess);
    }
  }
  
  protected CharSequence _genDocument(final Publication pub) {
    return null;
  }
  
  protected CharSequence _genDocument(final Component comp) {
    CharSequence _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      {
        EList<DocumentSegment> _segments = comp.getSegments();
        for(final DocumentSegment seg : _segments) {
          CharSequence _genSegment = this.genSegment(seg);
          _builder.append(_genSegment);
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
        }
      }
      final String segmentIterator = _builder.toString();
      final NestedElementsRenderer _function = () -> {
        return segmentIterator;
      };
      _xblockexpression = this.renderer.renderDocument(comp, _function);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _genSegment(final SegmentWithText seg) {
    CharSequence _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      {
        EList<ContentBlock> _contents = seg.getContents();
        for(final ContentBlock block : _contents) {
          CharSequence _genBlock = this.genBlock(block);
          _builder.append(_genBlock);
          _builder.newLineIfNotEmpty();
        }
      }
      final String blockIterator = _builder.toString();
      final NestedElementsRenderer _function = () -> {
        return blockIterator;
      };
      _xblockexpression = this.renderer.renderSegment(seg, _function);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _genSegment(final PublicationBody body) {
    CharSequence _xblockexpression = null;
    {
      final Division topLevelDivision = IterableExtensions.<Division>head(body.getDivisions());
      final boolean hasChapters = ((topLevelDivision instanceof Part) || (topLevelDivision instanceof Chapter));
      StringConcatenation _builder = new StringConcatenation();
      {
        EList<Division> _divisions = body.getDivisions();
        for(final Division div : _divisions) {
          _builder.newLine();
          CharSequence _genDivision = this.genDivision(div);
          _builder.append(_genDivision);
          _builder.newLineIfNotEmpty();
        }
      }
      {
        if ((!hasChapters)) {
          CharSequence _genFootnotes = this.genFootnotes(body, true);
          _builder.append(_genFootnotes);
        }
      }
      _builder.newLineIfNotEmpty();
      final String divisionIterator = _builder.toString();
      final NestedElementsRenderer _function = () -> {
        return divisionIterator;
      };
      _xblockexpression = this.renderer.renderSegment(body, _function);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _genSegment(final TOC toc) {
    CharSequence _xblockexpression = null;
    {
      final Table t = this._pubGeneratorUtil.toTable(toc, this.allDivisionsInSequenceOfOccurrenceCache);
      _xblockexpression = this.renderer.renderSegment(toc, t, this.nestedContentBlockGenerator);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _genSegment(final ListOfTables lot) {
    CharSequence _xblockexpression = null;
    {
      final Table t = this._pubGeneratorUtil.toTable(lot, this.allTablesInSequenceOfOccurrenceCache);
      _xblockexpression = this.renderer.renderSegment(lot, t, this.nestedContentBlockGenerator);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _genSegment(final ListOfFigures lof) {
    CharSequence _xblockexpression = null;
    {
      final Table t = this._pubGeneratorUtil.toTable(lof, this.allFiguresInSequenceOfOccurrenceCache);
      _xblockexpression = this.renderer.renderSegment(lof, t, this.nestedContentBlockGenerator);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _genSegment(final ChangeHistory hist) {
    CharSequence _xblockexpression = null;
    {
      final Table t = this._pubGeneratorUtil.toTable(hist);
      _xblockexpression = this.renderer.renderSegment(hist, t, this.nestedContentBlockGenerator);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _genSegment(final Index index) {
    return this.renderer.renderSegment(index);
  }
  
  protected CharSequence _genSegment(final DocumentSegment seg) {
    String _name = seg.getClass().getName();
    String _plus = ("Unsupported segment type: " + _name);
    throw new IllegalArgumentException(_plus);
  }
  
  public CharSequence genDivision(final Division div) {
    CharSequence _xblockexpression = null;
    {
      Division divTitle = div;
      Division divContents = div;
      Division _include = div.getInclude();
      boolean _tripleNotEquals = (_include != null);
      if (_tripleNotEquals) {
        divContents = div.getInclude();
        DRichText _title = div.getTitle();
        boolean _tripleEquals = (_title == null);
        if (_tripleEquals) {
          divTitle = div.getInclude();
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _renderTitle = this.renderer.renderTitle(divTitle);
      _builder.append(_renderTitle);
      _builder.newLineIfNotEmpty();
      {
        EList<ContentBlock> _contents = divContents.getContents();
        for(final ContentBlock block : _contents) {
          CharSequence _genBlock = this.genBlock(block);
          _builder.append(_genBlock);
          _builder.newLineIfNotEmpty();
        }
      }
      {
        if ((((div instanceof Part) && (!divContents.getDivisions().isEmpty())) && (IterableExtensions.<Division>last(((PublicationBody) div.eContainer()).getDivisions()) != div))) {
          CharSequence _genFootnotes = this.genFootnotes(div, false);
          _builder.append(_genFootnotes);
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        EList<Division> _divisions = divContents.getDivisions();
        for(final Division subdiv : _divisions) {
          _builder.newLine();
          _builder.append("\t");
          CharSequence _genDivision = this.genDivision(subdiv);
          _builder.append(_genDivision, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        if ((div instanceof Chapter)) {
          CharSequence _genFootnotes_1 = this.genFootnotes(div, true);
          _builder.append(_genFootnotes_1);
        }
      }
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _genBlock(final Admonition a) {
    return this.renderer.renderAdmonition(a);
  }
  
  protected CharSequence _genBlock(final List2 list) {
    CharSequence _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      {
        EList<ListItem> _items = list.getItems();
        for(final ListItem item : _items) {
          CharSequence _genListItem = this.genListItem(item);
          _builder.append(_genListItem);
          _builder.newLineIfNotEmpty();
        }
      }
      final String itemIterator = _builder.toString();
      CharSequence _switchResult = null;
      ListStyle _style = list.getStyle();
      if (_style != null) {
        switch (_style) {
          case BULLET:
            final NestedElementsRenderer _function = () -> {
              return itemIterator;
            };
            _switchResult = this.renderer.renderBulletList(list, _function);
            break;
          case SEQUENCE:
            final NestedElementsRenderer _function_1 = () -> {
              return itemIterator;
            };
            _switchResult = this.renderer.renderNumberedList(list, _function_1);
            break;
          case TITLE:
            final NestedElementsRenderer _function_2 = () -> {
              return itemIterator;
            };
            _switchResult = this.renderer.renderTitledList(list, _function_2);
            break;
          default:
            break;
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public CharSequence genListItem(final ListItem item) {
    CharSequence _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      {
        EList<ContentBlock> _contents = item.getContents();
        for(final ContentBlock block : _contents) {
          CharSequence _genBlock = this.genBlock(block);
          _builder.append(_genBlock);
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
        }
      }
      final String blockIterator = _builder.toString();
      CharSequence _switchResult = null;
      ListStyle _style = item.getList().getStyle();
      if (_style != null) {
        switch (_style) {
          case BULLET:
          case SEQUENCE:
            final NestedElementsRenderer _function = () -> {
              return blockIterator;
            };
            _switchResult = this.renderer.renderListItem(item, _function);
            break;
          case TITLE:
            final NestedElementsRenderer _function_1 = () -> {
              return blockIterator;
            };
            _switchResult = this.renderer.renderTitledListItem(item, _function_1);
            break;
          default:
            break;
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _genBlock(final TitledBlock b) {
    CharSequence _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _genTitledBlock = this.genTitledBlock(b);
      _builder.append(_genTitledBlock);
      _builder.newLineIfNotEmpty();
      CharSequence _renderTitledBlockTitle = this.renderer.renderTitledBlockTitle(b);
      _builder.append(_renderTitledBlockTitle);
      _builder.newLineIfNotEmpty();
      final String blockBodyDispatcher = _builder.toString();
      final NestedElementsRenderer _function = () -> {
        return blockBodyDispatcher;
      };
      _xblockexpression = this.renderer.renderTitledBlock(b, _function);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _genTitledBlock(final TitledTable t) {
    return this.genTable(t.getTable());
  }
  
  protected CharSequence _genTable(final Table t) {
    return this.renderer.renderTable(t, this.nestedContentBlockGenerator);
  }
  
  protected CharSequence _genTable(final ProvidedTable t) {
    CharSequence _xblockexpression = null;
    {
      final TableRendererProxy provider = this.tableProviderRegistry.getTableRenderer(t.getTableType().getName());
      CharSequence _xifexpression = null;
      if ((provider != null)) {
        CharSequence _xblockexpression_1 = null;
        {
          final Table table = provider.render(t.getDiagramRoot());
          table.setWidthPercent(t.getWidthPercent());
          table.setGridlines(t.getGridlines());
          _xblockexpression_1 = this.renderer.renderTable(table, this.nestedContentBlockGenerator);
        }
        _xifexpression = _xblockexpression_1;
      } else {
        String _name = t.getTableType().getName();
        String _plus = ("Table renderer \'" + _name);
        final String msg = (_plus + "\' not found.");
        PubGeneratorDelegate.LOGGER.error(msg);
        return ("ERROR: " + msg);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _genTitledBlock(final TitledFigure f) {
    return this.genFigure(f.getFigure());
  }
  
  protected CharSequence _genFigure(final IncludedFigure f) {
    try {
      CharSequence _xblockexpression = null;
      {
        final URI fileUri = URI.createURI(f.getFileUri());
        final IFile file = this._pubPlatformUtil.resourceFile(f.eResource(), fileUri);
        String _last = IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(fileUri.segments())));
        final String outputFileName = ((PubGeneratorDelegate.FIGURES_GEN_DIRECTORY + "/") + _last);
        this.fileSystemAccess.generateFile(((this.genDirectory + "/") + outputFileName), file.getContents());
        _xblockexpression = this.renderer.renderFigure(f, outputFileName);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected CharSequence _genFigure(final ProvidedFigure f) {
    CharSequence _xblockexpression = null;
    {
      final DiagramRendererProxy rendererProxy = this._pubGeneratorUtil.preferredDiagramRenderer(f, this.renderer.diagramFileFormatPreference());
      CharSequence _xifexpression = null;
      if ((rendererProxy != null)) {
        CharSequence _xblockexpression_1 = null;
        {
          EObject _eContainer = f.eContainer();
          String _tieredNumber = this._pubNumberingUtil.tieredNumber(((TitledFigure) _eContainer));
          final String fileName = ((PubGeneratorDelegate.FIGURES_GEN_DIRECTORY + "/figure-") + _tieredNumber);
          final String fileExtension = rendererProxy.format.name().toLowerCase();
          final InputStream inputStream = rendererProxy.render(f.getDiagramRoot());
          final String file = ((fileName + ".") + fileExtension);
          this.fileSystemAccess.generateFile(((this.genDirectory + "/") + file), inputStream);
          _xblockexpression_1 = this.renderer.renderFigure(f, file);
        }
        _xifexpression = _xblockexpression_1;
      } else {
        String _name = f.getDiagramType().getName();
        String _plus = ("Figure renderer \'" + _name);
        final String msg = (_plus + "\' not found.");
        PubGeneratorDelegate.LOGGER.error(msg);
        return ("ERROR: " + msg);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _genTitledBlock(final Equation e) {
    return this.renderer.renderEquation(e);
  }
  
  protected CharSequence _genTitledBlock(final TitledCodeListing cl) {
    CharSequence _xblockexpression = null;
    {
      String _xifexpression = null;
      EObject _include = cl.getInclude();
      boolean _tripleNotEquals = (_include != null);
      if (_tripleNotEquals) {
        String _xblockexpression_1 = null;
        {
          final String sourceCode = this._pubUtil.getSourceCodeFromXtextResource(cl.getInclude());
          _xblockexpression_1 = this._codeListingFormatter.trimBlankLines(sourceCode);
        }
        _xifexpression = _xblockexpression_1;
      } else {
        _xifexpression = this._codeListingFormatter.trimBlankLines(((String[])Conversions.unwrapArray(cl.getCodeLines(), String.class)));
      }
      String formattedCode = _xifexpression;
      formattedCode = this._codeListingFormatter.outdent(formattedCode, PubGeneratorUtil.TAB_SIZE);
      _xblockexpression = this.renderer.renderCodeListing(cl, formattedCode);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _genBlock(final RichTextParagraph para) {
    ParagraphStyle _style = para.getStyle();
    boolean _equals = Objects.equal(_style, ParagraphStyle.QUOTE);
    if (_equals) {
      return this.renderer.renderQuotedParagraph(para);
    } else {
      return this.renderer.renderPlainParagraph(para);
    }
  }
  
  protected CharSequence _genBlock(final UnformattedParagraph para) {
    return this.renderer.renderUnformattedParagraph(para);
  }
  
  protected CharSequence _genBlock(final RichTextReferencingParagraph para) {
    return this.renderer.renderRichTextReferencingParagraph(para);
  }
  
  protected CharSequence _genBlock(final Footnote f) {
    return this.renderer.renderFootnoteInPlace(f);
  }
  
  protected CharSequence _genBlock(final ContentBlock block) {
    String _name = block.getClass().getName();
    String _plus = ("Unsupported content-block type: " + _name);
    throw new IllegalArgumentException(_plus);
  }
  
  public CharSequence genFootnotes(final EObject container, final boolean allContents) {
    CharSequence _xblockexpression = null;
    {
      Iterable<Footnote> _xifexpression = null;
      if (allContents) {
        _xifexpression = EcoreUtil2.<Footnote>eAllOfType(container, Footnote.class);
      } else {
        _xifexpression = Iterables.<Footnote>filter(container.eContents(), Footnote.class);
      }
      final Iterable<Footnote> footnotes = _xifexpression;
      StringConcatenation _builder = new StringConcatenation();
      {
        boolean _isEmpty = IterableExtensions.isEmpty(footnotes);
        boolean _not = (!_isEmpty);
        if (_not) {
          CharSequence _renderFootnotes = this.renderer.renderFootnotes(footnotes);
          _builder.append(_renderFootnotes);
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence genDocument(final Document comp) {
    if (comp instanceof Component) {
      return _genDocument((Component)comp);
    } else if (comp instanceof Publication) {
      return _genDocument((Publication)comp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(comp).toString());
    }
  }
  
  public CharSequence genSegment(final DocumentSegment hist) {
    if (hist instanceof ChangeHistory) {
      return _genSegment((ChangeHistory)hist);
    } else if (hist instanceof ListOfFigures) {
      return _genSegment((ListOfFigures)hist);
    } else if (hist instanceof ListOfTables) {
      return _genSegment((ListOfTables)hist);
    } else if (hist instanceof TOC) {
      return _genSegment((TOC)hist);
    } else if (hist instanceof Index) {
      return _genSegment((Index)hist);
    } else if (hist instanceof PublicationBody) {
      return _genSegment((PublicationBody)hist);
    } else if (hist instanceof SegmentWithText) {
      return _genSegment((SegmentWithText)hist);
    } else if (hist != null) {
      return _genSegment(hist);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(hist).toString());
    }
  }
  
  public CharSequence genBlock(final ContentBlock f) {
    if (f instanceof Footnote) {
      return _genBlock((Footnote)f);
    } else if (f instanceof RichTextParagraph) {
      return _genBlock((RichTextParagraph)f);
    } else if (f instanceof TitledBlock) {
      return _genBlock((TitledBlock)f);
    } else if (f instanceof UnformattedParagraph) {
      return _genBlock((UnformattedParagraph)f);
    } else if (f instanceof Admonition) {
      return _genBlock((Admonition)f);
    } else if (f instanceof List2) {
      return _genBlock((List2)f);
    } else if (f instanceof RichTextReferencingParagraph) {
      return _genBlock((RichTextReferencingParagraph)f);
    } else if (f != null) {
      return _genBlock(f);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(f).toString());
    }
  }
  
  public CharSequence genTitledBlock(final TitledBlock e) {
    if (e instanceof Equation) {
      return _genTitledBlock((Equation)e);
    } else if (e instanceof TitledCodeListing) {
      return _genTitledBlock((TitledCodeListing)e);
    } else if (e instanceof TitledFigure) {
      return _genTitledBlock((TitledFigure)e);
    } else if (e instanceof TitledTable) {
      return _genTitledBlock((TitledTable)e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
  
  public CharSequence genTable(final AbstractTable t) {
    if (t instanceof ProvidedTable) {
      return _genTable((ProvidedTable)t);
    } else if (t instanceof Table) {
      return _genTable((Table)t);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(t).toString());
    }
  }
  
  public CharSequence genFigure(final AbstractFigure f) {
    if (f instanceof IncludedFigure) {
      return _genFigure((IncludedFigure)f);
    } else if (f instanceof ProvidedFigure) {
      return _genFigure((ProvidedFigure)f);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(f).toString());
    }
  }
}
