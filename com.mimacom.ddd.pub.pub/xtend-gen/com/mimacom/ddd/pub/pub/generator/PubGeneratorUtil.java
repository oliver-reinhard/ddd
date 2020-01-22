package com.mimacom.ddd.pub.pub.generator;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.base.richText.AbstractRichTextToPlainTextRenderer;
import com.mimacom.ddd.dm.dmx.DmxContextReference;
import com.mimacom.ddd.dm.dmx.DmxStaticReference;
import com.mimacom.ddd.dm.dmx.RichTextUtil;
import com.mimacom.ddd.pub.proto.ProtoDocumentSegment;
import com.mimacom.ddd.pub.pub.Abbreviation;
import com.mimacom.ddd.pub.pub.Abbreviations;
import com.mimacom.ddd.pub.pub.Bibliography;
import com.mimacom.ddd.pub.pub.BibliographyEntry;
import com.mimacom.ddd.pub.pub.ChangeDescription;
import com.mimacom.ddd.pub.pub.ChangeHistory;
import com.mimacom.ddd.pub.pub.Division;
import com.mimacom.ddd.pub.pub.DocumentSegment;
import com.mimacom.ddd.pub.pub.Figure;
import com.mimacom.ddd.pub.pub.Glossary;
import com.mimacom.ddd.pub.pub.GlossaryEntry;
import com.mimacom.ddd.pub.pub.ListOfFigures;
import com.mimacom.ddd.pub.pub.ListOfTables;
import com.mimacom.ddd.pub.pub.NumberedElement;
import com.mimacom.ddd.pub.pub.PubFactory;
import com.mimacom.ddd.pub.pub.PubUtil;
import com.mimacom.ddd.pub.pub.Reference;
import com.mimacom.ddd.pub.pub.ReferenceTarget;
import com.mimacom.ddd.pub.pub.TOC;
import com.mimacom.ddd.pub.pub.Table;
import com.mimacom.ddd.pub.pub.TitledBlock;
import com.mimacom.ddd.pub.pub.generator.PubElementNames;
<<<<<<< HEAD
import com.mimacom.ddd.pub.pub.generator.PubNumberingUtil;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class PubGeneratorUtil {
  @Inject
  @Extension
  private RichTextUtil _richTextUtil;
  
  @Inject
  @Extension
  private PubUtil _pubUtil;
  
  @Inject
  @Extension
  private PubNumberingUtil _pubNumberingUtil;
  
  @Inject
  @Extension
  private PubElementNames _pubElementNames;
  
  private static final PubFactory PUB = PubFactory.eINSTANCE;
  
  public String guard(final String subject, final String alternative) {
    if (((subject != null) && (!subject.isEmpty()))) {
      return subject;
    }
    if ((alternative != null)) {
      return alternative;
    }
    return "";
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
    return this._pubElementNames.displayName(segment);
  }
  
  public String referenceDisplayText(final ReferenceTarget t) {
    String _xifexpression = null;
    if ((t instanceof NumberedElement)) {
      String _displayName = this._pubElementNames.displayName(t);
      String _plus = (_displayName + " ");
      String _tieredNumber = this._pubNumberingUtil.tieredNumber(((NumberedElement)t));
      _xifexpression = (_plus + _tieredNumber);
    } else {
      _xifexpression = this._pubElementNames.displayName(t);
    }
    return _xifexpression;
  }
  
  protected String toPlainText(final DRichText text) {
    String _xblockexpression = null;
    {
      boolean _not = (!((text.eContainer() instanceof TitledBlock) || (text.eContainer() instanceof Division)));
      if (_not) {
        throw new IllegalArgumentException("Text is not the title of a TitledBlock or a Division");
      }
      final AbstractRichTextToPlainTextRenderer renderer = new AbstractRichTextToPlainTextRenderer() {
        @Override
        protected String getSourceText(final DExpression expr) {
          return PubGeneratorUtil.this._richTextUtil.getSourceTextFromXtextResource(expr);
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
              _switchResult = super.renderStyleExpression(expr, PubGeneratorUtil.this.plainlinkText(((DmxStaticReference)expr)));
            }
          }
          if (!_matched) {
            String _name = expr.getClass().getName();
            String _plus = ("Unsupported content-block type: " + _name);
            throw new IllegalArgumentException(_plus);
          }
          return _switchResult;
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
  
  public Table toTable(final ChangeHistory ch) {
    final Table t = this._pubUtil.createTableWithHeader(new String[] { "Version", "Date", "Author", "What has changed" });
    EList<ChangeDescription> _entries = ch.getEntries();
    for (final ChangeDescription e : _entries) {
      String _version = e.getVersion();
      String _date = e.getDate();
      String _author = e.getAuthor();
      String _description = e.getDescription();
      this._pubUtil.addSimpleRow(t, new String[] { _version, _date, _author, _description });
    }
    return t;
  }
  
  public Table toTable(final TOC toc, final List<Division> allDivisionsInSequence) {
    final Table t = this._pubUtil.createTableWithHeader(new String[] { "Section", "Title", "Reference/Page" });
    t.setHideGrid(true);
    for (final Division div : allDivisionsInSequence) {
      {
        final Reference ref = PubGeneratorUtil.PUB.createReference();
        ref.setTarget(div);
        String _labelAndNumber = this._pubNumberingUtil.labelAndNumber(div);
        String _plainText = this.toPlainText(div.getTitle());
        this._pubUtil.addRowWithReference(t, new String[] { _labelAndNumber, _plainText }, ref);
      }
    }
    return t;
  }
  
  public Table toTable(final Abbreviations seg) {
    final Table t = this._pubUtil.createTableWithHeader(new String[] { "Abbreviation", "Stands for" });
    EList<Abbreviation> _entries = seg.getEntries();
    for (final Abbreviation e : _entries) {
      String _name = e.getName();
      String _longForm = e.getLongForm();
      this._pubUtil.addSimpleRow(t, new String[] { _name, _longForm });
    }
    return t;
  }
  
  public Table toTable(final ListOfTables seg, final List<Table> allTablesInSequence) {
    final Table lot = this._pubUtil.createTableWithHeader(new String[] { "Table", "Title", "Reference/Page" });
    lot.setHideGrid(true);
    for (final Table t : allTablesInSequence) {
      {
        final Reference ref = PubGeneratorUtil.PUB.createReference();
        ref.setTarget(t);
        String _labelAndNumber = this._pubNumberingUtil.labelAndNumber(t);
        String _plainText = this.toPlainText(t.getTitle());
        this._pubUtil.addRowWithReference(lot, new String[] { _labelAndNumber, _plainText }, ref);
      }
    }
    return lot;
  }
  
  public Table toTable(final ListOfFigures seg, final List<Figure> allFiguresInSequence) {
    final Table lof = this._pubUtil.createTableWithHeader(new String[] { "Figure", "Title", "Reference/Page" });
    lof.setHideGrid(true);
    for (final Figure f : allFiguresInSequence) {
      {
        final Reference ref = PubGeneratorUtil.PUB.createReference();
        ref.setTarget(f);
        String _labelAndNumber = this._pubNumberingUtil.labelAndNumber(f);
        String _plainText = this.toPlainText(f.getTitle());
        this._pubUtil.addRowWithReference(lof, new String[] { _labelAndNumber, _plainText }, ref);
      }
    }
    return lof;
  }
  
  public Table toTable(final Bibliography seg) {
    final Table t = this._pubUtil.createTableWithHeader(new String[] { "Name", "Authors", "Title", "Publisher", "Publication Date", "Comment" });
    EList<BibliographyEntry> _entries = seg.getEntries();
    for (final BibliographyEntry e : _entries) {
      String _name = e.getName();
      String _authors = e.getAuthors();
      String _title = e.getTitle();
      String _publisher = e.getPublisher();
      String _date = e.getDate();
      String _comment = e.getComment();
      this._pubUtil.addSimpleRow(t, new String[] { _name, _authors, _title, _publisher, _date, _comment });
    }
    return t;
  }
  
  public Table toTable(final Glossary seg) {
    final Table t = this._pubUtil.createTableWithHeader(new String[] { "Name", "Description", "Comment" });
    EList<GlossaryEntry> _entries = seg.getEntries();
    for (final GlossaryEntry e : _entries) {
      String _name = e.getName();
      String _text = e.getText();
      String _comment = e.getComment();
      this._pubUtil.addSimpleRow(t, new String[] { _name, _text, _comment });
    }
    return t;
=======
<<<<<<< HEAD
import com.mimacom.ddd.pub.pub.generator.PubNumberingUtil;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class PubGeneratorUtil {
  @Inject
  @Extension
  private RichTextUtil _richTextUtil;
  
  @Inject
  @Extension
  private PubUtil _pubUtil;
  
  @Inject
  @Extension
  private PubNumberingUtil _pubNumberingUtil;
  
  @Inject
  @Extension
  private PubElementNames _pubElementNames;
  
  private static final PubFactory PUB = PubFactory.eINSTANCE;
  
  public String guard(final String subject, final String alternative) {
    if (((subject != null) && (!subject.isEmpty()))) {
      return subject;
    }
    if ((alternative != null)) {
      return alternative;
    }
    return "";
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
    return this._pubElementNames.displayName(segment);
  }
  
  public String referenceDisplayText(final ReferenceTarget t) {
    String _xifexpression = null;
    if ((t instanceof NumberedElement)) {
      String _displayName = this._pubElementNames.displayName(t);
      String _plus = (_displayName + " ");
      String _tieredNumber = this._pubNumberingUtil.tieredNumber(((NumberedElement)t));
      _xifexpression = (_plus + _tieredNumber);
    } else {
      _xifexpression = this._pubElementNames.displayName(t);
    }
    return _xifexpression;
  }
  
  protected String toPlainText(final DRichText text) {
    String _xblockexpression = null;
    {
      boolean _not = (!((text.eContainer() instanceof TitledBlock) || (text.eContainer() instanceof Division)));
      if (_not) {
        throw new IllegalArgumentException("Text is not the title of a TitledBlock or a Division");
      }
      final AbstractRichTextToPlainTextRenderer renderer = new AbstractRichTextToPlainTextRenderer() {
        @Override
        protected String getSourceText(final DExpression expr) {
          return PubGeneratorUtil.this._richTextUtil.getSourceTextFromXtextResource(expr);
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
              _switchResult = super.renderStyleExpression(expr, PubGeneratorUtil.this.plainlinkText(((DmxStaticReference)expr)));
            }
          }
          if (!_matched) {
            String _name = expr.getClass().getName();
            String _plus = ("Unsupported content-block type: " + _name);
            throw new IllegalArgumentException(_plus);
          }
          return _switchResult;
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
  
  public Table toTable(final ChangeHistory ch) {
    final Table t = this._pubUtil.createTableWithHeader(new String[] { "Version", "Date", "Author", "What has changed" });
    EList<ChangeDescription> _entries = ch.getEntries();
    for (final ChangeDescription e : _entries) {
      String _version = e.getVersion();
      String _date = e.getDate();
      String _author = e.getAuthor();
      String _description = e.getDescription();
      this._pubUtil.addSimpleRow(t, new String[] { _version, _date, _author, _description });
    }
    return t;
  }
  
  public Table toTable(final TOC toc, final List<Division> allDivisionsInSequence) {
    final Table t = this._pubUtil.createTableWithHeader(new String[] { "Section", "Title", "Reference/Page" });
    t.setHideGrid(true);
    for (final Division div : allDivisionsInSequence) {
      {
        final Reference ref = PubGeneratorUtil.PUB.createReference();
        ref.setTarget(div);
        String _labelAndNumber = this._pubNumberingUtil.labelAndNumber(div);
        String _plainText = this.toPlainText(div.getTitle());
        this._pubUtil.addRowWithReference(t, new String[] { _labelAndNumber, _plainText }, ref);
      }
    }
    return t;
  }
  
  public Table toTable(final Abbreviations seg) {
    final Table t = this._pubUtil.createTableWithHeader(new String[] { "Abbreviation", "Stands for" });
    EList<Abbreviation> _entries = seg.getEntries();
    for (final Abbreviation e : _entries) {
      String _name = e.getName();
      String _longForm = e.getLongForm();
      this._pubUtil.addSimpleRow(t, new String[] { _name, _longForm });
    }
    return t;
  }
  
  public Table toTable(final ListOfTables seg, final List<Table> allTablesInSequence) {
    final Table lot = this._pubUtil.createTableWithHeader(new String[] { "Table", "Title", "Reference/Page" });
    lot.setHideGrid(true);
    for (final Table t : allTablesInSequence) {
      {
        final Reference ref = PubGeneratorUtil.PUB.createReference();
        ref.setTarget(t);
        String _labelAndNumber = this._pubNumberingUtil.labelAndNumber(t);
        String _plainText = this.toPlainText(t.getTitle());
        this._pubUtil.addRowWithReference(lot, new String[] { _labelAndNumber, _plainText }, ref);
      }
    }
    return lot;
  }
  
  public Table toTable(final ListOfFigures seg, final List<Figure> allFiguresInSequence) {
    final Table lof = this._pubUtil.createTableWithHeader(new String[] { "Figure", "Title", "Reference/Page" });
    lof.setHideGrid(true);
    for (final Figure f : allFiguresInSequence) {
      {
        final Reference ref = PubGeneratorUtil.PUB.createReference();
        ref.setTarget(f);
        String _labelAndNumber = this._pubNumberingUtil.labelAndNumber(f);
        String _plainText = this.toPlainText(f.getTitle());
        this._pubUtil.addRowWithReference(lof, new String[] { _labelAndNumber, _plainText }, ref);
      }
    }
    return lof;
  }
  
  public Table toTable(final Bibliography seg) {
    final Table t = this._pubUtil.createTableWithHeader(new String[] { "Name", "Authors", "Title", "Publisher", "Publication Date", "Comment" });
    EList<BibliographyEntry> _entries = seg.getEntries();
    for (final BibliographyEntry e : _entries) {
      String _name = e.getName();
      String _authors = e.getAuthors();
      String _title = e.getTitle();
      String _publisher = e.getPublisher();
      String _date = e.getDate();
      String _comment = e.getComment();
      this._pubUtil.addSimpleRow(t, new String[] { _name, _authors, _title, _publisher, _date, _comment });
    }
    return t;
  }
  
  public Table toTable(final Glossary seg) {
    final Table t = this._pubUtil.createTableWithHeader(new String[] { "Name", "Description", "Comment" });
    EList<GlossaryEntry> _entries = seg.getEntries();
    for (final GlossaryEntry e : _entries) {
      String _name = e.getName();
      String _text = e.getText();
      String _comment = e.getComment();
      this._pubUtil.addSimpleRow(t, new String[] { _name, _text, _comment });
    }
    return t;
=======
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class PubGeneratorUtil {
  @Inject
  @Extension
  private RichTextUtil _richTextUtil;
  
  @Inject
  @Extension
  private PubUtil _pubUtil;
  
  @Inject
  @Extension
  private PubElementNames _pubElementNames;
  
  private static final PubFactory PUB = PubFactory.eINSTANCE;
  
  public String guard(final String subject, final String alternative) {
    if (((subject != null) && (!subject.isEmpty()))) {
      return subject;
    }
    if ((alternative != null)) {
      return alternative;
    }
    return "";
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
    return this._pubElementNames.displayName(segment);
  }
  
  public String referenceDisplayTextFor(final ReferenceTarget t) {
    String _xifexpression = null;
    if ((t instanceof NumberedElement)) {
      String _displayName = this._pubElementNames.displayName(t);
      String _plus = (_displayName + " ");
      String _tieredNumber = this._pubUtil.tieredNumber(((NumberedElement)t));
      _xifexpression = (_plus + _tieredNumber);
    } else {
      _xifexpression = this._pubElementNames.displayName(t);
    }
    return _xifexpression;
  }
  
  public Table toTable(final ChangeHistory ch) {
    final Table t = this._pubUtil.createTableWithHeader(new String[] { "Version", "Date", "Author", "What has changed" });
    EList<ChangeDescription> _entries = ch.getEntries();
    for (final ChangeDescription e : _entries) {
      String _version = e.getVersion();
      String _date = e.getDate();
      String _author = e.getAuthor();
      String _description = e.getDescription();
      this._pubUtil.addSimpleRow(t, new String[] { _version, _date, _author, _description });
    }
    return t;
  }
  
  public Table toTable(final TOC toc, final List<Division> allDivisionsInSequence) {
    final Table t = this._pubUtil.createTableWithHeader(new String[] { "Section", "Title", "Reference/Page" });
    t.setHideGrid(true);
    for (final Division div : allDivisionsInSequence) {
      {
        final Reference ref = PubGeneratorUtil.PUB.createReference();
        ref.setTarget(div);
        String _labelAndNumber = this._pubUtil.labelAndNumber(div);
        String _plainText = this.toPlainText(div.getTitle());
        this._pubUtil.addRowWithReference(t, new String[] { _labelAndNumber, _plainText }, ref);
      }
    }
    return t;
  }
  
  public Table toTable(final Abbreviations seg) {
    final Table t = this._pubUtil.createTableWithHeader(new String[] { "Abbreviation", "Stands for" });
    EList<Abbreviation> _entries = seg.getEntries();
    for (final Abbreviation e : _entries) {
      String _name = e.getName();
      String _longForm = e.getLongForm();
      this._pubUtil.addSimpleRow(t, new String[] { _name, _longForm });
    }
    return t;
  }
  
  public Table toTable(final ListOfTables seg, final List<Table> allTablesInSequence) {
    final Table lot = this._pubUtil.createTableWithHeader(new String[] { "Table", "Title", "Reference/Page" });
    lot.setHideGrid(true);
    for (final Table t : allTablesInSequence) {
      {
        final Reference ref = PubGeneratorUtil.PUB.createReference();
        ref.setTarget(t);
        String _labelAndNumber = this._pubUtil.labelAndNumber(t);
        String _plainText = this.toPlainText(t.getTitle());
        this._pubUtil.addRowWithReference(lot, new String[] { _labelAndNumber, _plainText }, ref);
      }
    }
    return lot;
  }
  
  public Table toTable(final ListOfFigures seg, final List<Figure> allFiguresInSequence) {
    final Table lof = this._pubUtil.createTableWithHeader(new String[] { "Figure", "Title", "Reference/Page" });
    lof.setHideGrid(true);
    for (final Figure f : allFiguresInSequence) {
      {
        final Reference ref = PubGeneratorUtil.PUB.createReference();
        ref.setTarget(f);
        String _labelAndNumber = this._pubUtil.labelAndNumber(f);
        String _plainText = this.toPlainText(f.getTitle());
        this._pubUtil.addRowWithReference(lof, new String[] { _labelAndNumber, _plainText }, ref);
      }
    }
    return lof;
  }
  
  public Table toTable(final Bibliography seg) {
    final Table t = this._pubUtil.createTableWithHeader(new String[] { "Name", "Authors", "Title", "Publisher", "Publication Date", "Comment" });
    EList<BibliographyEntry> _entries = seg.getEntries();
    for (final BibliographyEntry e : _entries) {
      String _name = e.getName();
      String _authors = e.getAuthors();
      String _title = e.getTitle();
      String _publisher = e.getPublisher();
      String _date = e.getDate();
      String _comment = e.getComment();
      this._pubUtil.addSimpleRow(t, new String[] { _name, _authors, _title, _publisher, _date, _comment });
    }
    return t;
  }
  
  public Table toTable(final Glossary seg) {
    final Table t = this._pubUtil.createTableWithHeader(new String[] { "Name", "Description", "Comment" });
    EList<GlossaryEntry> _entries = seg.getEntries();
    for (final GlossaryEntry e : _entries) {
      String _name = e.getName();
      String _text = e.getText();
      String _comment = e.getComment();
      this._pubUtil.addSimpleRow(t, new String[] { _name, _text, _comment });
    }
    return t;
  }
  
  protected String toPlainText(final DRichText text) {
    String _xblockexpression = null;
    {
      boolean _not = (!((text.eContainer() instanceof TitledBlock) || (text.eContainer() instanceof Division)));
      if (_not) {
        throw new IllegalArgumentException("Text is not the title of a TitledBlock or a Division");
      }
      final AbstractRichTextToPlainTextRenderer renderer = new AbstractRichTextToPlainTextRenderer() {
        @Override
        protected String getSourceText(final DExpression expr) {
          return PubGeneratorUtil.this._richTextUtil.getSourceTextFromXtextResource(expr);
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
              _switchResult = super.renderStyleExpression(expr, PubGeneratorUtil.this.plainlinkText(((DmxStaticReference)expr)));
            }
          }
          if (!_matched) {
            String _name = expr.getClass().getName();
            String _plus = ("Unsupported content-block type: " + _name);
            throw new IllegalArgumentException(_plus);
          }
          return _switchResult;
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
>>>>>>> refs/remotes/origin/master
>>>>>>> refs/heads/master
  }
}
