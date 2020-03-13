/**
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.pub.pub.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.base.DTextSegment;
import com.mimacom.ddd.dm.base.IRichTextSegment;
import com.mimacom.ddd.dm.base.richText.RichTextUtil;
import com.mimacom.ddd.dm.dmx.DmxContextReference;
import com.mimacom.ddd.dm.dmx.DmxStaticReference;
import com.mimacom.ddd.pub.proto.ProtoDivision;
import com.mimacom.ddd.pub.proto.ProtoDocumentSegment;
import com.mimacom.ddd.pub.proto.ProtoSymbol;
import com.mimacom.ddd.pub.proto.PublicationClass;
import com.mimacom.ddd.pub.proto.derivedState.PubProtoDerivedStateComputer;
import com.mimacom.ddd.pub.pub.Chapter;
import com.mimacom.ddd.pub.pub.Component;
import com.mimacom.ddd.pub.pub.Division;
import com.mimacom.ddd.pub.pub.Document;
import com.mimacom.ddd.pub.pub.DocumentSegment;
import com.mimacom.ddd.pub.pub.IncludedFigure;
import com.mimacom.ddd.pub.pub.ListItem;
import com.mimacom.ddd.pub.pub.ListStyle;
import com.mimacom.ddd.pub.pub.Part;
import com.mimacom.ddd.pub.pub.ProvidedFigure;
import com.mimacom.ddd.pub.pub.ProvidedTable;
import com.mimacom.ddd.pub.pub.PubPackage;
import com.mimacom.ddd.pub.pub.PubPlatformUtil;
import com.mimacom.ddd.pub.pub.PubUtil;
import com.mimacom.ddd.pub.pub.PublicationBody;
import com.mimacom.ddd.pub.pub.Section;
import com.mimacom.ddd.pub.pub.Subsection;
import com.mimacom.ddd.pub.pub.Subsubsection;
import com.mimacom.ddd.pub.pub.Symbol;
import com.mimacom.ddd.pub.pub.Table;
import com.mimacom.ddd.pub.pub.TitledBlock;
import com.mimacom.ddd.pub.pub.TitledCodeListing;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramFileFormat;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramProviderRegistry;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramRendererProxy;
import com.mimacom.ddd.pub.pub.generator.IDiagramFileFormatPreference;
import com.mimacom.ddd.pub.pub.generator.PubGeneratorTarget;
import com.mimacom.ddd.pub.pub.generator.PubGeneratorUtil;
import com.mimacom.ddd.pub.pub.generator.PubHtmlDiagramFileFormatPreference;
import com.mimacom.ddd.pub.pub.generator.PubLaTeXDiagramFileFormatPreference;
import com.mimacom.ddd.pub.pub.generator.PubNumberingUtil;
import com.mimacom.ddd.pub.pub.impl.PubConstants;
import com.mimacom.ddd.pub.pub.tableProvider.TableProviderRegistry;
import com.mimacom.ddd.pub.pub.tableProvider.TableRendererProxy;
import com.mimacom.ddd.pub.pub.validation.AbstractPubValidator;
import com.mimacom.ddd.pub.pub.validation.PubTableValidator;
import java.util.HashSet;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class PubValidator extends AbstractPubValidator {
  private static final BasePackage BASE = BasePackage.eINSTANCE;
  
  private static final PubPackage PUB = PubPackage.eINSTANCE;
  
  @Inject
  @Extension
  private RichTextUtil _richTextUtil;
  
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
  private TableProviderRegistry tableProviderRegistry;
  
  @Inject
  private DiagramProviderRegistry diagramProviderRegistry;
  
  @Inject
  private PubHtmlDiagramFileFormatPreference htmlDiagramFileFormatPreference;
  
  @Inject
  private PubLaTeXDiagramFileFormatPreference laTeXDiagramFileFormatPreference;
  
  private final PubTableValidator tableValidator = new PubTableValidator(this);
  
  @Check
  public void publicationClass(final Document doc) {
    PublicationClass _publicationClass = doc.getPublicationClass();
    boolean _tripleEquals = (_publicationClass == null);
    if (_tripleEquals) {
      this.error("Document has no publication class.", PubValidator.PUB.getDocument_PublicationClass());
    }
  }
  
  @Check
  public void generatorTarget(final Document doc) {
    boolean _not = (!(((doc.isGenerateHtml() || doc.isGenerateLaTeX()) || doc.isGenerateMarkdown()) || doc.isGenerateAsciiDoc()));
    if (_not) {
      this.error("Document must define at least one generator target.", PubValidator.PUB.getDocument_PublicationClass());
    }
  }
  
  @Check
  public void protoSymbols(final Document doc) {
    PublicationClass _publicationClass = doc.getPublicationClass();
    boolean _tripleNotEquals = (_publicationClass != null);
    if (_tripleNotEquals) {
      EList<ProtoSymbol> _symbols = doc.getPublicationClass().getSymbols();
      for (final ProtoSymbol protoSymbol : _symbols) {
        Symbol _symbol = doc.getSymbol(protoSymbol.getName());
        boolean _tripleEquals = (_symbol == null);
        if (_tripleEquals) {
          String _name = protoSymbol.getName();
          String _plus = ("Document must define prototype symbol \'" + _name);
          final String msg = (_plus + "\'");
          boolean _not = (!(doc.getSymbols().isEmpty() || Objects.equal(IterableExtensions.<Symbol>head(doc.getSymbols()).getName(), PubProtoDerivedStateComputer.TITLE_SYMBOL_NAME)));
          if (_not) {
            this.error(msg, IterableExtensions.<Symbol>head(doc.getSymbols()), PubValidator.BASE.getDNamedElement_Name());
          } else {
            this.error(msg, PubValidator.PUB.getReferenceTarget_Name());
          }
        }
      }
    }
  }
  
  @Check
  public void symbolIsUppercase(final Symbol s) {
    boolean _equals = s.getName().equals(s.getName().toUpperCase());
    boolean _not = (!_equals);
    if (_not) {
      this.warning("Symbol name should be ALL UPPPERCASE", s, PubValidator.BASE.getDNamedElement_Name());
    }
  }
  
  @Check
  public void symbolValueIsNotEmpty(final Symbol s) {
    boolean _isEmpty = this._richTextUtil.isEmpty(s.getValue());
    if (_isEmpty) {
      this.error("Symbol value is empty", s, PubValidator.PUB.getSymbol_Value());
    }
  }
  
  @Check(CheckType.NORMAL)
  public void includedDivisionSymbolsAreDefined(final Division div) {
    Division _include = div.getInclude();
    boolean _tripleNotEquals = (_include != null);
    if (_tripleNotEquals) {
      final Document doc = EcoreUtil2.<Document>getContainerOfType(div, Document.class);
      final Document includedDoc = EcoreUtil2.<Document>getContainerOfType(div.getInclude(), Document.class);
      if (((doc != null) && (includedDoc != null))) {
        EList<Symbol> _symbols = includedDoc.getSymbols();
        for (final Symbol includeSymbol : _symbols) {
          Symbol _symbol = doc.getSymbol(includeSymbol.getName());
          boolean _tripleEquals = (_symbol == null);
          if (_tripleEquals) {
            String _name = includeSymbol.getName();
            String _plus = ("This document must define symbol \'" + _name);
            String _plus_1 = (_plus + 
              "\' of included-division document");
            this.error(_plus_1, PubValidator.PUB.getDivision_Include());
          }
        }
      }
    }
  }
  
  @Check
  public void segmentsOfDocumentClass(final DocumentSegment seg) {
    ProtoDocumentSegment _prototype = this._pubUtil.prototype(seg);
    boolean _tripleEquals = (_prototype == null);
    if (_tripleEquals) {
      final ICompositeNode node = NodeModelUtils.findActualNodeFor(seg);
      String _displayName = this._pubUtil.displayName(seg);
      String _plus = (_displayName + 
        " is not a valid segment with respect to the class definition for this document");
      this.acceptError(_plus, seg, node.getOffset(), 
        node.getLength(), null);
    }
  }
  
  @Check
  public void divisionsOfDocumentClass(final Division div) {
    ProtoDivision _prototype = this._pubUtil.prototype(div);
    boolean _tripleEquals = (_prototype == null);
    if (_tripleEquals) {
      String _displayName = this._pubUtil.displayName(div);
      String _plus = (_displayName + " is not a valid division with respect to the class definition for this document");
      this.error(_plus, 
        PubValidator.PUB.getDivision_Title());
    }
  }
  
  @Check
  public void partsXorChaptersXorSections(final PublicationBody body) {
    Iterable<Part> parts = Iterables.<Part>filter(body.getDivisions(), Part.class);
    Iterable<Chapter> chapters = Iterables.<Chapter>filter(body.getDivisions(), Chapter.class);
    Iterable<Section> sections = Iterables.<Section>filter(body.getDivisions(), Section.class);
    if (((((!IterableExtensions.isEmpty(parts)) && (!IterableExtensions.isEmpty(chapters))) || ((!IterableExtensions.isEmpty(parts)) && (!IterableExtensions.isEmpty(sections)))) || 
      ((!IterableExtensions.isEmpty(sections)) && (!IterableExtensions.isEmpty(chapters))))) {
      final String msg = "Cannot only have one type of division (Part, Chapter, Section) at the top level.";
      final Part part = IterableExtensions.<Part>head(parts);
      if ((part != null)) {
        this.error(msg, part, PubValidator.PUB.getDivision_Title());
      }
      final Chapter chapter = IterableExtensions.<Chapter>head(chapters);
      if ((chapter != null)) {
        this.error(msg, chapter, PubValidator.PUB.getDivision_Title());
      }
      final Section section = IterableExtensions.<Section>head(sections);
      if ((section != null)) {
        this.error(msg, section, PubValidator.PUB.getDivision_Title());
      }
    }
  }
  
  @Check
  public void includeIsNotTransitive(final Division div) {
    if (((div.getInclude() != null) && (div.getInclude().getInclude() != null))) {
      this.error("Included division cannot itself include another division. Replace with non-transitive include.", 
        PubValidator.PUB.getDivision_Include());
    }
  }
  
  @Check
  public void divisionStructuralIntegrity(final Division d) {
    Division _include = d.getInclude();
    boolean _tripleNotEquals = (_include != null);
    if (_tripleNotEquals) {
      boolean _isEmpty = d.getDivisions().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        this.error("A division with an include cannot also contain divisions", PubValidator.PUB.getDivisionContainer_Divisions(), 0);
      }
      boolean _isEmpty_1 = d.getContents().isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        this.error("A division with an include cannot also define contents", PubValidator.PUB.getBlockContainer_Contents(), 0);
      }
      Class<? extends Division> _class = d.getClass();
      Class<? extends Division> _class_1 = d.getInclude().getClass();
      boolean _notEquals = (!Objects.equal(_class, _class_1));
      if (_notEquals) {
        String _displayName = this._pubUtil.displayName(d.getInclude());
        String _plus = ("Division include must be of the same type as the including division: " + _displayName);
        this.error(_plus, 
          PubValidator.PUB.getDivision_Include());
      }
    } else {
      boolean _isEmpty_2 = d.getDivisions().isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        final Division head = IterableExtensions.<Division>head(d.getDivisions());
        final Class<? extends Division> clazz = head.getClass();
        boolean _matched = false;
        if (d instanceof Part) {
          _matched=true;
          boolean _isAssignableFrom = clazz.isAssignableFrom(Chapter.class);
          if (_isAssignableFrom) {
            this.error("A Part must contain subdivisions of type Chapter.", head, PubValidator.PUB.getDivision_Title());
          }
        }
        if (!_matched) {
          if (d instanceof Chapter) {
            _matched=true;
            boolean _isAssignableFrom = clazz.isAssignableFrom(Section.class);
            if (_isAssignableFrom) {
              this.error("A Chapter must contain subdivisions of type Section.", head, PubValidator.PUB.getDivision_Title());
            }
          }
        }
        if (!_matched) {
          if (d instanceof Section) {
            _matched=true;
            boolean _isAssignableFrom = clazz.isAssignableFrom(Subsection.class);
            if (_isAssignableFrom) {
              this.error("A Section must contain subdivisions of type Subsection.", head, PubValidator.PUB.getDivision_Title());
            }
          }
        }
        if (!_matched) {
          if (d instanceof Subsection) {
            _matched=true;
            boolean _isAssignableFrom = clazz.isAssignableFrom(Subsubsection.class);
            if (_isAssignableFrom) {
              this.error("A Subsection must contain subdivisions of type Subsubsection.", head, PubValidator.PUB.getDivision_Title());
            }
          }
        }
        if (!_matched) {
          if (d instanceof Subsubsection) {
            _matched=true;
            this.error("A Subsubsection cannot contain subdivisions.", head, PubValidator.PUB.getDivision_Title());
          }
        }
        EList<Division> _divisions = d.getDivisions();
        for (final Division subdiv : _divisions) {
          Class<? extends Division> _class_2 = subdiv.getClass();
          boolean _notEquals_1 = (!Objects.equal(_class_2, clazz));
          if (_notEquals_1) {
            final String msg = "A division can only contain subdivisions of the same type.";
            this.error(msg, head, PubValidator.PUB.getDivision_Title());
            this.error(msg, subdiv, PubValidator.PUB.getDivision_Title());
          }
        }
      }
    }
  }
  
  @Check(CheckType.NORMAL)
  public void divisionIsOnlyIncludedOnce(final Component compo) {
    final List<Division> allDivisionsInSequenceOfOccurrence = this._pubNumberingUtil.gatherAllDivisionsAndSetSequenceNumbers(compo);
    final HashSet<Division> divisionsSet = Sets.<Division>newHashSet();
    final String msg = "A division can only be included once and there can be no overlaps: ";
    for (final Division div : allDivisionsInSequenceOfOccurrence) {
      {
        boolean _add = divisionsSet.add(div);
        boolean _not = (!_add);
        if (_not) {
          this.error(msg, div, PubValidator.PUB.getDivision_Include());
        }
        if (((div.getInclude() != null) && (!divisionsSet.add(div.getInclude())))) {
          this.error(msg, div, PubValidator.PUB.getDivision_Include());
        }
      }
    }
  }
  
  @Check(CheckType.NORMAL)
  public void includedCodeSyntax(final TitledCodeListing cl) {
    EObject _include = cl.getInclude();
    boolean _tripleNotEquals = (_include != null);
    if (_tripleNotEquals) {
      final Resource resource = cl.getInclude().eResource();
      if ((resource instanceof XtextResource)) {
        boolean _hasSyntaxErrors = ((XtextResource)resource).getParseResult().hasSyntaxErrors();
        if (_hasSyntaxErrors) {
          this.error("Code for the included expression has errors.", PubValidator.PUB.getTitledCodeListing_Include());
        } else {
          boolean _empty = this._pubGeneratorUtil.empty(this._pubUtil.getSourceCodeFromXtextResource(cl.getInclude()));
          if (_empty) {
            this.error("Code for the included expression is empty.", PubValidator.PUB.getTitledCodeListing_Include());
          }
        }
      } else {
        this.error("Included expression does not have a textual representation.", PubValidator.PUB.getTitledCodeListing_Include());
      }
    }
  }
  
  @Check
  public void startNumberOnlyAtFirstDivision(final Division div) {
    if (((div.getSequenceNumber() > 0) && (div.getStartNumberingAt() != PubConstants.DIVISION_NUMBERING_DEFAULT_START_VALUE))) {
      this.error("The numbering start can only be defined by the first element at that level.", 
        PubValidator.PUB.getDivision_StartNumberingAt());
    }
  }
  
  @Check
  public void titleForTitledListItems(final ListItem item) {
    final ListStyle style = item.getList().getStyle();
    if ((Objects.equal(style, ListStyle.TITLE) && this._richTextUtil.isEmpty(item.getTitle()))) {
      String _literal = style.getLiteral();
      String _plus = ("Item title must be defined for list style \'" + _literal);
      String _plus_1 = (_plus + "\'.");
      this.error(_plus_1, item.getList(), PubValidator.PUB.getList_Items(), 
        item.getList().getItems().indexOf(item));
    } else {
      if (((!Objects.equal(style, ListStyle.TITLE)) && (!this._richTextUtil.isEmpty(item.getTitle())))) {
        String _literal_1 = style.getLiteral();
        String _plus_2 = ("Item cannot have a title for list style \'" + _literal_1);
        String _plus_3 = (_plus_2 + "\'.");
        this.error(_plus_3, PubValidator.PUB.getListItem_Title());
      }
    }
  }
  
  @Check
  public void titledBlockExpressionIsReference(final DRichText rt) {
    final EObject parent = rt.eContainer();
    if (((parent instanceof TitledBlock) || (parent instanceof Division))) {
      for (int i = 0; (i < ((Object[])Conversions.unwrapArray(rt.getSegments(), Object.class)).length); i++) {
        IRichTextSegment _get = rt.getSegments().get(i);
        boolean _matched = false;
        if (_get instanceof DTextSegment) {
          _matched=true;
        }
        if (!_matched) {
          if (_get instanceof DmxContextReference) {
            _matched=true;
          }
        }
        if (!_matched) {
          if (_get instanceof DmxStaticReference) {
            _matched=true;
          }
        }
        if (!_matched) {
          this.error(
            "Titles can only contain expressions that are a direct reference to an external model element.", rt, PubValidator.BASE.getDRichText_Segments(), i);
        }
      }
    }
  }
  
  @Check
  public void table(final Table t) {
    this.tableValidator.validate(t);
  }
  
  @Check(CheckType.NORMAL)
  public void includedFigureFileExists(final IncludedFigure f) {
    if (((f.getFileUri() == null) || f.getFileUri().isEmpty())) {
      this.error("File URI cannot be empty", f.eContainer(), PubValidator.PUB.getTitledBlock_Title());
      return;
    }
    final URI fileUri = URI.createURI(f.getFileUri());
    final IFile file = this._pubPlatformUtil.resourceFile(f.eResource(), fileUri);
    if (((file == null) || (!file.exists()))) {
      this.error("File does not exist", PubValidator.PUB.getIncludedFigure_FileUri());
    }
  }
  
  @Check(CheckType.NORMAL)
  public void diagramCanRender(final ProvidedFigure f) {
    if ((((f.getDiagramRoot() != null) && (f.getDiagramType() != null)) && (f.getDiagramType().getName() != null))) {
      final DiagramRendererProxy provider = this.diagramProviderRegistry.getDiagramRenderer(f.getDiagramType().getName());
      boolean _canRender = provider.canRender(f.getDiagramRoot());
      boolean _not = (!_canRender);
      if (_not) {
        this.warning("The referenced model does not provide content, the generated diagram will be empty", 
          PubValidator.PUB.getProvidedFigure_DiagramRoot());
      }
    }
  }
  
  @Check(CheckType.NORMAL)
  public void preferredFileFormatSupported(final ProvidedFigure f) {
    if ((this.generateHtml(f) && (this._pubGeneratorUtil.preferredDiagramRenderer(f, this.htmlDiagramFileFormatPreference) == null))) {
      this.preferredFileFormatError(f, PubGeneratorTarget.HTML, this.htmlDiagramFileFormatPreference);
    }
    if ((this.generateLaTeX(f) && (this._pubGeneratorUtil.preferredDiagramRenderer(f, this.laTeXDiagramFileFormatPreference) == null))) {
      this.preferredFileFormatError(f, PubGeneratorTarget.LaTeX, this.laTeXDiagramFileFormatPreference);
    }
  }
  
  protected void preferredFileFormatError(final ProvidedFigure f, final PubGeneratorTarget target, final IDiagramFileFormatPreference prefs) {
    boolean first = true;
    final StringBuilder b = new StringBuilder();
    List<DiagramFileFormat> _vector = prefs.vector();
    for (final DiagramFileFormat p : _vector) {
      {
        if ((!first)) {
          b.append(",");
        }
        b.append(p.name());
        first = false;
      }
    }
    List<DiagramFileFormat> _raster = prefs.raster();
    for (final DiagramFileFormat r : _raster) {
      {
        if ((!first)) {
          b.append(",");
        }
        b.append(r.name());
        first = false;
      }
    }
    String _name = target.name();
    String _plus = ("For " + _name);
    String _plus_1 = (_plus + ", there is no registered renderer to generate any of the preferred file formats: ");
    String _plus_2 = (_plus_1 + b);
    this.error(_plus_2, PubValidator.PUB.getProvidedFigure_DiagramType());
  }
  
  @Check(CheckType.NORMAL)
  public void tableCanRender(final ProvidedTable t) {
    if ((((t.getDiagramRoot() != null) && (t.getTableType() != null)) && (t.getTableType().getName() != null))) {
      final TableRendererProxy provider = this.tableProviderRegistry.getTableRenderer(t.getTableType().getName());
      boolean _canRender = provider.canRender(t.getDiagramRoot());
      boolean _not = (!_canRender);
      if (_not) {
        this.error("The referenced model does not provide content, the generated table will be empty", 
          PubValidator.PUB.getProvidedTable_DiagramRoot());
      }
    }
  }
  
  protected boolean generateHtml(final EObject obj) {
    final Document document = EcoreUtil2.<Document>getContainerOfType(obj, Document.class);
    return ((document != null) && document.isGenerateHtml());
  }
  
  protected boolean generateLaTeX(final EObject obj) {
    final Document document = EcoreUtil2.<Document>getContainerOfType(obj, Document.class);
    return ((document != null) && document.isGenerateLaTeX());
  }
  
  protected boolean generateMarkdown(final EObject obj) {
    final Document document = EcoreUtil2.<Document>getContainerOfType(obj, Document.class);
    return ((document != null) && document.isGenerateMarkdown());
  }
  
  protected boolean generateAsciiDoc(final EObject obj) {
    final Document document = EcoreUtil2.<Document>getContainerOfType(obj, Document.class);
    return ((document != null) && document.isGenerateAsciiDoc());
  }
}
