package com.mimacom.ddd.pub.pub.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.mimacom.ddd.pub.proto.ProtoDivision;
import com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle;
import com.mimacom.ddd.pub.pub.Chapter;
import com.mimacom.ddd.pub.pub.Component;
import com.mimacom.ddd.pub.pub.ContentBlock;
import com.mimacom.ddd.pub.pub.Division;
import com.mimacom.ddd.pub.pub.ListItem;
import com.mimacom.ddd.pub.pub.NumberedElement;
import com.mimacom.ddd.pub.pub.Part;
import com.mimacom.ddd.pub.pub.PubUtil;
import com.mimacom.ddd.pub.pub.PublicationBody;
import com.mimacom.ddd.pub.pub.TitledBlock;
import com.mimacom.ddd.pub.pub.TitledFigure;
import com.mimacom.ddd.pub.pub.TitledTable;
import com.mimacom.ddd.pub.pub.generator.PubElementNames;
import com.mimacom.ddd.pub.pub.impl.PubConstants;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class PubNumberingUtil {
  @Inject
  @Extension
  private PubUtil _pubUtil;
  
  @Inject
  @Extension
  private PubElementNames _pubElementNames;
  
  public String labelAndNumber(final Division div) {
    String _switchResult = null;
    boolean _matched = false;
    if (div instanceof Part) {
      _matched=true;
      String _displayName = this._pubElementNames.displayName(div);
      String _plus = (_displayName + " ");
      String _formattedSingleNumber = this.formattedSingleNumber(div);
      _switchResult = (_plus + _formattedSingleNumber);
    }
    if (!_matched) {
      _switchResult = this.tieredNumber(div);
    }
    return _switchResult;
  }
  
  public String labelAndNumber(final TitledBlock b) {
    String _displayName = this._pubElementNames.displayName(b);
    String _plus = (_displayName + " ");
    String _tieredNumber = this.tieredNumber(b);
    return (_plus + _tieredNumber);
  }
  
  protected String _tieredNumber(final Division div) {
    if ((div instanceof Part)) {
      return this.formattedSingleNumber(div);
    } else {
      if ((div instanceof Chapter)) {
        String _formattedSingleNumber = this.formattedSingleNumber(div);
        return (_formattedSingleNumber + ".");
      }
    }
    final String parentNumber = this.tieredNumber(div.parent());
    int _length = parentNumber.length();
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      final String formatted = this.formattedSingleNumber(div);
      int _length_1 = formatted.length();
      boolean _greaterThan_1 = (_length_1 > 0);
      if (_greaterThan_1) {
        boolean _endsWith = parentNumber.endsWith(".");
        if (_endsWith) {
          String _formattedSingleNumber_1 = this.formattedSingleNumber(div);
          return (parentNumber + _formattedSingleNumber_1);
        } else {
          String _formattedSingleNumber_2 = this.formattedSingleNumber(div);
          return ((parentNumber + ".") + _formattedSingleNumber_2);
        }
      }
    }
    return "";
  }
  
  protected String _tieredNumber(final TitledBlock b) {
    Division _parent = b.parent();
    if ((_parent instanceof Chapter)) {
      final String parentNumber = this.formattedSingleNumber(b.parent());
      int _length = parentNumber.length();
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        int _sequenceNumberInChapter = b.getSequenceNumberInChapter();
        boolean _notEquals = (_sequenceNumberInChapter != PubConstants.TITLED_BLOCK_UNDEFINED_SEQUENCE_NUMBER_IN_CHAPTER);
        if (_notEquals) {
          int _sequenceNumberInChapter_1 = b.getSequenceNumberInChapter();
          int _plus = (_sequenceNumberInChapter_1 + 1);
          String _string = Integer.toString(_plus);
          return ((parentNumber + ".") + _string);
        }
      }
    }
    int _sequenceNumber = b.getSequenceNumber();
    boolean _notEquals_1 = (_sequenceNumber != PubConstants.TITLED_BLOCK_UNDEFINED_SEQUENCE_NUMBER);
    if (_notEquals_1) {
      int _sequenceNumber_1 = b.getSequenceNumber();
      int _plus_1 = (_sequenceNumber_1 + 1);
      return Integer.toString(_plus_1);
    }
    return "";
  }
  
  protected String _tieredNumber(final NumberedElement e) {
    String _name = e.getClass().getName();
    String _plus = ("Unsupported object type: " + _name);
    throw new IllegalArgumentException(_plus);
  }
  
  public String formattedSingleNumber(final Division div) {
    final int seq = div.getSequenceNumber();
    if ((seq != PubConstants.UNDEFINED_SEQUENCE_NUMBER)) {
      final int start = this.startNumber(div);
      int _xifexpression = (int) 0;
      if ((start != PubConstants.UNDEFINED_SEQUENCE_NUMBER)) {
        _xifexpression = (seq + start);
      } else {
        _xifexpression = seq;
      }
      final int n = _xifexpression;
      final ProtoDivision prototype = this._pubUtil.prototype(div);
      ProtoSequenceNumberStyle _xifexpression_1 = null;
      if ((prototype != null)) {
        _xifexpression_1 = prototype.getNumberingStyle();
      } else {
        _xifexpression_1 = ProtoSequenceNumberStyle.ARABIC;
      }
      final ProtoSequenceNumberStyle numberingStyle = _xifexpression_1;
      final String formatted = this.formatNumbering(numberingStyle, n);
      return formatted;
    }
    return "";
  }
  
  public String formattedSingleNumber(final ListItem item) {
    int _sequenceNumber = item.getSequenceNumber();
    final int n = (_sequenceNumber + 1);
    final String formatted = this.formatNumbering(item.getList().getNumberingStyle(), n);
    return formatted;
  }
  
  protected String formatNumbering(final ProtoSequenceNumberStyle numberingStyle, final int n) {
    String _switchResult = null;
    if (numberingStyle != null) {
      switch (numberingStyle) {
        case ARABIC:
          _switchResult = Integer.valueOf(n).toString();
          break;
        case CAPITAL_LETTER:
          _switchResult = this.toLetter(n);
          break;
        case SMALL_LETTER:
          _switchResult = this.toLetter(n).toLowerCase();
          break;
        case CAPITAL_ROMAN:
          _switchResult = this.toRoman(n);
          break;
        case SMALL_ROMAN:
          _switchResult = this.toRoman(n).toLowerCase();
          break;
        case NONE:
          _switchResult = "";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  protected int startNumber(final Division div) {
    final EObject parent = div.eContainer();
    if ((parent instanceof PublicationBody)) {
      boolean _isEmpty = ((PublicationBody)parent).getDivisions().isEmpty();
      if (_isEmpty) {
        return PubConstants.UNDEFINED_SEQUENCE_NUMBER;
      }
      return IterableExtensions.<Division>head(((PublicationBody)parent).getDivisions()).getStartNumberingAt();
    } else {
      if ((parent instanceof Division)) {
        boolean _isEmpty_1 = ((Division)parent).getDivisions().isEmpty();
        if (_isEmpty_1) {
          return PubConstants.UNDEFINED_SEQUENCE_NUMBER;
        }
        return IterableExtensions.<Division>head(((Division)parent).getDivisions()).getStartNumberingAt();
      }
    }
    return PubConstants.UNDEFINED_SEQUENCE_NUMBER;
  }
  
  public String toRoman(final int value) {
    if ((value <= 0)) {
      return "--";
    }
    final StringBuilder b = new StringBuilder();
    final int x = (value % 100);
    final int _switchValue = (x / 10);
    switch (_switchValue) {
      case 1:
        b.append("X");
        break;
      case 2:
        b.append("XX");
        break;
      case 3:
        b.append("XXX");
        break;
      case 4:
        b.append("XL");
        break;
      case 5:
        b.append("L");
        break;
      case 6:
        b.append("LX");
        break;
      case 7:
        b.append("LXX");
        break;
      case 8:
        b.append("LXXX");
        break;
      case 9:
        b.append("XC");
        break;
      default:
        break;
    }
    final int _switchValue_1 = (x % 10);
    switch (_switchValue_1) {
      case 1:
        b.append("I");
        break;
      case 2:
        b.append("II");
        break;
      case 3:
        b.append("III");
        break;
      case 4:
        b.append("IL");
        break;
      case 5:
        b.append("V");
        break;
      case 6:
        b.append("VI");
        break;
      case 7:
        b.append("VII");
        break;
      case 8:
        b.append("VIII");
        break;
      case 9:
        b.append("IX");
        break;
      default:
        break;
    }
    return b.toString();
  }
  
  public String toLetter(final int value) {
    if ((value <= 0)) {
      return "--";
    }
    final StringBuilder b = new StringBuilder();
    final int LETTERS = 26;
    final char a = 'A';
    final int x = ((value - 1) % ((LETTERS + 1) * LETTERS));
    if ((x >= LETTERS)) {
      final int n = ((((int) a) + (x / LETTERS)) - 1);
      b.append(((char) n));
    }
    final int n_1 = (((int) a) + (x % LETTERS));
    b.append(((char) n_1));
    return b.toString();
  }
  
  public List<Division> gatherAllDivisionsAndSetSequenceNumbers(final Component compo) {
    final List<Division> acceptor = Lists.<Division>newArrayList();
    final Iterable<PublicationBody> bodySegments = Iterables.<PublicationBody>filter(compo.getSegments(), PublicationBody.class);
    boolean _isEmpty = IterableExtensions.isEmpty(bodySegments);
    boolean _not = (!_isEmpty);
    if (_not) {
      final PublicationBody body = IterableExtensions.<PublicationBody>head(bodySegments);
      this.gatherAllDivisionsImpl(body.getDivisions(), null, acceptor, PubConstants.TOP_LEVEL);
    }
    return acceptor;
  }
  
  protected void gatherAllDivisionsImpl(final List<Division> divisions, final Division logicalContainer, final List<Division> acceptor, final int level) {
    int sequenceNumber = PubConstants.FIRST_IN_SEQUENCE_NUMBER;
    for (final Division div : divisions) {
      {
        div.setLevel(level);
        if ((div instanceof Chapter)) {
          final int chapterIndex = IterableExtensions.size(Iterables.<Chapter>filter(acceptor, Chapter.class));
          ((Chapter)div).setSequenceNumber(chapterIndex);
        } else {
          int _plusPlus = sequenceNumber++;
          div.setSequenceNumber(_plusPlus);
        }
        div.setLogicalContainer(logicalContainer);
        acceptor.add(div);
        Division _include = div.getInclude();
        boolean _tripleNotEquals = (_include != null);
        if (_tripleNotEquals) {
          this.gatherAllDivisionsImpl(div.getInclude().getDivisions(), div, acceptor, (level + 1));
        } else {
          this.gatherAllDivisionsImpl(div.getDivisions(), div, acceptor, (level + 1));
        }
      }
    }
  }
  
  public List<TitledTable> gatherAllTablesInSequenceAndSetSequenceNumbers(final Component compo) {
    final List<TitledTable> acceptor = Lists.<TitledTable>newArrayList();
    this.<TitledTable>gatherAllElementsInSequenceAndSetSequenceNumbers(compo, TitledTable.class, acceptor);
    return acceptor;
  }
  
  public List<TitledFigure> gatherAllFiguresInSequenceAndSetSequenceNumbers(final Component compo) {
    final List<TitledFigure> acceptor = Lists.<TitledFigure>newArrayList();
    this.<TitledFigure>gatherAllElementsInSequenceAndSetSequenceNumbers(compo, TitledFigure.class, acceptor);
    return acceptor;
  }
  
  protected <T extends TitledBlock> void gatherAllElementsInSequenceAndSetSequenceNumbers(final Component compo, final Class<T> clazz, final List<T> acceptor) {
    final Iterable<PublicationBody> bodySegment = Iterables.<PublicationBody>filter(compo.getSegments(), PublicationBody.class);
    boolean _isEmpty = IterableExtensions.isEmpty(bodySegment);
    boolean _not = (!_isEmpty);
    if (_not) {
      this.<T>gatherAllElementsInSequenceAndSetSequenceNumbers(IterableExtensions.<PublicationBody>head(bodySegment).getDivisions(), clazz, acceptor, null, null);
    }
  }
  
  protected <T extends TitledBlock> void gatherAllElementsInSequenceAndSetSequenceNumbers(final List<Division> divisions, final Class<T> clazz, final List<T> globalAcceptor, final Chapter logicalContainer, final List<T> acceptorInChapter) {
    for (final Division div : divisions) {
      {
        Chapter _xifexpression = null;
        if (((div instanceof Chapter) && (logicalContainer == null))) {
          _xifexpression = ((Chapter) div);
        } else {
          _xifexpression = logicalContainer;
        }
        Chapter chapter = _xifexpression;
        Division _include = div.getInclude();
        boolean _tripleNotEquals = (_include != null);
        if (_tripleNotEquals) {
          this.<T>gatherAllElementsInSequenceAndSetSequenceNumbers(Lists.<Division>newArrayList(div.getInclude()), clazz, globalAcceptor, chapter, acceptorInChapter);
        } else {
          List<T> _xifexpression_1 = null;
          boolean _equals = Objects.equal(div, chapter);
          if (_equals) {
            _xifexpression_1 = Lists.<T>newArrayList();
          } else {
            _xifexpression_1 = acceptorInChapter;
          }
          final List<T> localAcceptor = _xifexpression_1;
          EList<ContentBlock> _contents = div.getContents();
          for (final ContentBlock block : _contents) {
            {
              final List<T> allInContents = EcoreUtil2.<T>eAllOfType(block, clazz);
              for (final T element : allInContents) {
                {
                  element.setSequenceNumber(globalAcceptor.size());
                  globalAcceptor.add(element);
                  if ((localAcceptor != null)) {
                    element.setSequenceNumberInChapter(localAcceptor.size());
                    element.setLogicalContainer(chapter);
                    localAcceptor.add(element);
                  }
                }
              }
            }
          }
          this.<T>gatherAllElementsInSequenceAndSetSequenceNumbers(div.getDivisions(), clazz, globalAcceptor, chapter, localAcceptor);
        }
      }
    }
  }
  
  public String tieredNumber(final NumberedElement div) {
    if (div instanceof Division) {
      return _tieredNumber((Division)div);
    } else if (div instanceof TitledBlock) {
      return _tieredNumber((TitledBlock)div);
    } else if (div != null) {
      return _tieredNumber(div);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(div).toString());
    }
  }
}
