package com.mimacom.ddd.pub.pub.generator;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.IDiagramRoot;
import com.mimacom.ddd.pub.proto.ProtoDocumentSegment;
import com.mimacom.ddd.pub.pub.Abbreviation;
import com.mimacom.ddd.pub.pub.Abbreviations;
import com.mimacom.ddd.pub.pub.Bibliography;
import com.mimacom.ddd.pub.pub.BibliographyEntry;
import com.mimacom.ddd.pub.pub.ChangeDescription;
import com.mimacom.ddd.pub.pub.ChangeHistory;
import com.mimacom.ddd.pub.pub.Division;
import com.mimacom.ddd.pub.pub.DocumentSegment;
import com.mimacom.ddd.pub.pub.Glossary;
import com.mimacom.ddd.pub.pub.GlossaryEntry;
import com.mimacom.ddd.pub.pub.ListOfFigures;
import com.mimacom.ddd.pub.pub.ListOfTables;
import com.mimacom.ddd.pub.pub.Numbered;
import com.mimacom.ddd.pub.pub.ProvidedFigure;
import com.mimacom.ddd.pub.pub.PubFactory;
import com.mimacom.ddd.pub.pub.PubTableUtil;
import com.mimacom.ddd.pub.pub.PubUtil;
import com.mimacom.ddd.pub.pub.Reference;
import com.mimacom.ddd.pub.pub.ReferenceTarget;
import com.mimacom.ddd.pub.pub.TOC;
import com.mimacom.ddd.pub.pub.Table;
import com.mimacom.ddd.pub.pub.TitledFigure;
import com.mimacom.ddd.pub.pub.TitledTable;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramFileFormat;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramProviderRegistry;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramRendererProxy;
import com.mimacom.ddd.pub.pub.generator.IDiagramFileFormatPreference;
import com.mimacom.ddd.pub.pub.generator.PubNumberingUtil;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class PubGeneratorUtil {
  @Inject
  @Extension
  private PubUtil _pubUtil;
  
  @Inject
  @Extension
  private PubTableUtil _pubTableUtil;
  
  @Inject
  @Extension
  private PubNumberingUtil _pubNumberingUtil;
  
  @Inject
  private DiagramProviderRegistry diagramProviderRegistry;
  
  public static final int TAB_SIZE = 2;
  
  private static final PubFactory PUB = PubFactory.eINSTANCE;
  
  public boolean empty(final String s) {
    return ((s == null) || s.isEmpty());
  }
  
  public String nonEmptyTitle(final DocumentSegment segment) {
    final ProtoDocumentSegment protoSegment = this._pubUtil.prototype(segment);
    String _title = null;
    if (protoSegment!=null) {
      _title=protoSegment.getTitle();
    }
    boolean _tripleNotEquals = (_title != null);
    if (_tripleNotEquals) {
      return protoSegment.getTitle();
    }
    return this._pubUtil.displayName(segment);
  }
  
  public String referenceDisplayText(final ReferenceTarget t) {
    String _xifexpression = null;
    if ((t instanceof Numbered)) {
      String _displayName = this._pubUtil.displayName(t);
      String _plus = (_displayName + " ");
      String _tieredNumber = this._pubNumberingUtil.tieredNumber(t);
      _xifexpression = (_plus + _tieredNumber);
    } else {
      _xifexpression = this._pubUtil.displayName(t);
    }
    return _xifexpression;
  }
  
  public DiagramRendererProxy preferredDiagramRenderer(final ProvidedFigure f, final IDiagramFileFormatPreference format) {
    final boolean preferRasterDiagram = f.isPreferRasterDiagram();
    List<DiagramFileFormat> _xifexpression = null;
    if (preferRasterDiagram) {
      _xifexpression = format.raster();
    } else {
      _xifexpression = format.vector();
    }
    final List<DiagramFileFormat> preferredFileFormats = _xifexpression;
    final DiagramRendererProxy renderer = this.findDiagramRenderer(preferredFileFormats, f.getDiagramRoot().getClass(), f.getDiagramType().getName());
    if ((renderer != null)) {
      return renderer;
    }
    List<DiagramFileFormat> _xifexpression_1 = null;
    if (preferRasterDiagram) {
      _xifexpression_1 = format.vector();
    } else {
      _xifexpression_1 = format.raster();
    }
    final List<DiagramFileFormat> otherFileFormats = _xifexpression_1;
    return this.findDiagramRenderer(otherFileFormats, f.getDiagramRoot().getClass(), f.getDiagramType().getName());
  }
  
  protected DiagramRendererProxy findDiagramRenderer(final List<DiagramFileFormat> preferredFileFormats, final Class<? extends IDiagramRoot> diagramRootClass, final String diagramTypeID) {
    for (final DiagramFileFormat format : preferredFileFormats) {
      {
        final DiagramRendererProxy renderer = this.diagramProviderRegistry.getDiagramRenderer(diagramRootClass, diagramTypeID, format);
        if ((renderer != null)) {
          return renderer;
        }
      }
    }
    return null;
  }
  
  public Table toTable(final ChangeHistory ch) {
    final Table t = this._pubTableUtil.createTableWithHeader(new String[] { "Version", "Date", "Author", "What has changed" });
    EList<ChangeDescription> _entries = ch.getEntries();
    for (final ChangeDescription e : _entries) {
      String _version = e.getVersion();
      String _date = e.getDate();
      String _author = e.getAuthor();
      String _description = e.getDescription();
      this._pubTableUtil.addPlainTextRow(t, new String[] { _version, _date, _author, _description });
    }
    return t;
  }
  
  public Table toTable(final TOC toc, final List<Division> allDivisionsInSequence) {
    final Table t = this._pubTableUtil.createTableWithHeader(new String[] { "Section", "Title", "Page" });
    for (final Division div : allDivisionsInSequence) {
      {
        final Reference ref = PubGeneratorUtil.PUB.createReference();
        ref.setTarget(div);
        ref.setPageReference(true);
        String _labelAndNumber = this._pubNumberingUtil.labelAndNumber(div);
        String _plainText = this._pubUtil.toPlainText(div.getTitle());
        this._pubTableUtil.addRowWithReference(t, new String[] { _labelAndNumber, _plainText }, ref);
      }
    }
    return t;
  }
  
  public Table toTable(final Abbreviations seg) {
    final Table t = this._pubTableUtil.createTableWithHeader(new String[] { "Abbreviation", "Stands for" });
    EList<Abbreviation> _entries = seg.getEntries();
    for (final Abbreviation e : _entries) {
      String _name = e.getName();
      String _longForm = e.getLongForm();
      this._pubTableUtil.addPlainTextRow(t, new String[] { _name, _longForm });
    }
    return t;
  }
  
  public Table toTable(final ListOfTables seg, final List<TitledTable> allTablesInSequence) {
    final Table lot = this._pubTableUtil.createTableWithHeader(new String[] { "Table", "Title", "Page" });
    for (final TitledTable t : allTablesInSequence) {
      {
        final Reference ref = PubGeneratorUtil.PUB.createReference();
        ref.setTarget(t);
        ref.setPageReference(true);
        String _labelAndNumber = this._pubNumberingUtil.labelAndNumber(t);
        String _plainText = this._pubUtil.toPlainText(t.getTitle());
        this._pubTableUtil.addRowWithReference(lot, new String[] { _labelAndNumber, _plainText }, ref);
      }
    }
    return lot;
  }
  
  public Table toTable(final ListOfFigures seg, final List<TitledFigure> allFiguresInSequence) {
    final Table lof = this._pubTableUtil.createTableWithHeader(new String[] { "Figure", "Title", "Page" });
    for (final TitledFigure f : allFiguresInSequence) {
      {
        final Reference ref = PubGeneratorUtil.PUB.createReference();
        ref.setTarget(f);
        ref.setPageReference(true);
        String _labelAndNumber = this._pubNumberingUtil.labelAndNumber(f);
        String _plainText = this._pubUtil.toPlainText(f.getTitle());
        this._pubTableUtil.addRowWithReference(lof, new String[] { _labelAndNumber, _plainText }, ref);
      }
    }
    return lof;
  }
  
  public Table toTable(final Bibliography seg) {
    final Table t = this._pubTableUtil.createTableWithHeader(new String[] { "Name", "Authors", "Title", "Publisher", "Publication Date", "Comment" });
    EList<BibliographyEntry> _entries = seg.getEntries();
    for (final BibliographyEntry e : _entries) {
      String _name = e.getName();
      String _authors = e.getAuthors();
      String _title = e.getTitle();
      String _publisher = e.getPublisher();
      String _date = e.getDate();
      String _comment = e.getComment();
      this._pubTableUtil.addPlainTextRow(t, new String[] { _name, _authors, _title, _publisher, _date, _comment });
    }
    return t;
  }
  
  public Table toTable(final Glossary seg) {
    final Table t = this._pubTableUtil.createTableWithHeader(new String[] { "Name", "Description", "Comment" });
    EList<GlossaryEntry> _entries = seg.getEntries();
    for (final GlossaryEntry e : _entries) {
      String _name = e.getName();
      String _text = e.getText();
      String _comment = e.getComment();
      this._pubTableUtil.addPlainTextRow(t, new String[] { _name, _text, _comment });
    }
    return t;
  }
}
