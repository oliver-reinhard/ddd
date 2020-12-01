/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim.formatting2;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.base.base.DComplexType;
import com.mimacom.ddd.dm.base.base.DFeature;
import com.mimacom.ddd.dm.base.base.DImport;
import com.mimacom.ddd.dm.base.base.DLiteral;
import com.mimacom.ddd.dm.base.base.DMultiplicity;
import com.mimacom.ddd.dm.base.base.DNamedPredicate;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.transpose.TAggregateTransposition;
import com.mimacom.ddd.dm.base.transpose.TComplexTypeTransposition;
import com.mimacom.ddd.dm.base.transpose.TEnumerationTransposition;
import com.mimacom.ddd.dm.base.transpose.TMorphRule;
import com.mimacom.ddd.dm.base.transpose.TTypeTransposition;
import com.mimacom.ddd.sm.sim.SystemInformationModel;
import com.mimacom.ddd.sm.sim.services.SimGrammarAccess;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class SimFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private SimGrammarAccess _simGrammarAccess;
  
  protected void _format(final SystemInformationModel model, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.append(this.textRegionExtensions.regionFor(model).assignment(this._simGrammarAccess.getSystemInformationModelAccess().getNameAssignment_1()), _function);
    EList<DType> _types = model.getTypes();
    for (final DType type : _types) {
      document.<DType>format(type);
    }
    EList<DAggregate> _aggregates = model.getAggregates();
    for (final DAggregate aggregate : _aggregates) {
      document.<DAggregate>format(aggregate);
    }
  }
  
  protected void _format(final DImport imp, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.<DImport>append(imp, _function);
  }
  
  protected void _format(final TMorphRule sMorphRule, @Extension final IFormattableDocument document) {
    document.<DMultiplicity>format(sMorphRule.getRemultiplyTo());
  }
  
  protected void _format(final TAggregateTransposition aggregate, @Extension final IFormattableDocument document) {
    final ISemanticRegion open = this.textRegionExtensions.regionFor(aggregate).keyword(this._simGrammarAccess.getSimAggregateTranspositionAccess().getLeftCurlyBracketKeyword_5_0());
    final ISemanticRegion close = this.textRegionExtensions.regionFor(aggregate).keyword(this._simGrammarAccess.getSimAggregateTranspositionAccess().getRightCurlyBracketKeyword_5_3());
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.append(open, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(open, close, _function_1);
    EList<DType> _types = aggregate.getTypes();
    for (final DType type : _types) {
      document.<DType>format(type);
    }
  }
  
  protected void _format(final TEnumerationTransposition en, @Extension final IFormattableDocument document) {
    int _size = en.getLiterals().size();
    boolean _greaterThan = (_size > 3);
    if (_greaterThan) {
      final ISemanticRegion open = this.textRegionExtensions.regionFor(en).keyword(this._simGrammarAccess.getSimEnumerationTranspositionAccess().getLeftCurlyBracketKeyword_4_0());
      final ISemanticRegion close = this.textRegionExtensions.regionFor(en).keyword(this._simGrammarAccess.getSimEnumerationTranspositionAccess().getRightCurlyBracketKeyword_4_3());
      final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
        it.newLine();
      };
      document.append(open, _function);
      final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
        it.indent();
      };
      document.<ISemanticRegion, ISemanticRegion>interior(open, close, _function_1);
      EList<DLiteral> _literals = en.getLiterals();
      for (final DLiteral literal : _literals) {
        final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
          it.noSpace();
        };
        document.surround(this.textRegionExtensions.regionFor(literal).assignment(this._simGrammarAccess.getSimEnumerationTranspositionAccess().getLiteralsAssignment_4_1_0()), _function_2);
      }
      List<ISemanticRegion> _keywords = this.textRegionExtensions.regionFor(en).keywords(this._simGrammarAccess.getSimEnumerationTranspositionAccess().getCommaKeyword_4_1_1_0());
      for (final ISemanticRegion comma : _keywords) {
        final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.append(comma, _function_3);
      }
      final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
        it.newLine();
      };
      document.<DLiteral>append(IterableExtensions.<DLiteral>last(en.getLiterals()), _function_4);
    }
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.<TEnumerationTransposition>append(en, _function_5);
  }
  
  protected void _format(final TComplexTypeTransposition type, @Extension final IFormattableDocument document) {
    final ISemanticRegion open = this.textRegionExtensions.regionFor(type).keyword(this._simGrammarAccess.getTComplexTypeFeaturesAccess().getLeftCurlyBracketKeyword_0());
    final ISemanticRegion close = this.textRegionExtensions.regionFor(type).keyword(this._simGrammarAccess.getTComplexTypeFeaturesAccess().getRightCurlyBracketKeyword_2());
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(open, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(open, close, _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.append(close, _function_2);
    final DComplexType dType = ((DComplexType) type);
    EList<DFeature> _features = dType.getFeatures();
    for (final DFeature feature : _features) {
      final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
        it.newLine();
      };
      document.<DFeature>append(feature, _function_3);
    }
    EList<DNamedPredicate> _constraints = dType.getConstraints();
    for (final DNamedPredicate constraint : _constraints) {
      final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
        it.newLine();
      };
      document.<DNamedPredicate>append(constraint, _function_4);
    }
  }
  
  protected void _format(final TTypeTransposition type, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.<TTypeTransposition>append(type, _function);
  }
  
  public void format(final Object en, final IFormattableDocument document) {
    if (en instanceof TEnumerationTransposition) {
      _format((TEnumerationTransposition)en, document);
      return;
    } else if (en instanceof TComplexTypeTransposition) {
      _format((TComplexTypeTransposition)en, document);
      return;
    } else if (en instanceof SystemInformationModel) {
      _format((SystemInformationModel)en, document);
      return;
    } else if (en instanceof TAggregateTransposition) {
      _format((TAggregateTransposition)en, document);
      return;
    } else if (en instanceof TMorphRule) {
      _format((TMorphRule)en, document);
      return;
    } else if (en instanceof TTypeTransposition) {
      _format((TTypeTransposition)en, document);
      return;
    } else if (en instanceof XtextResource) {
      _format((XtextResource)en, document);
      return;
    } else if (en instanceof DImport) {
      _format((DImport)en, document);
      return;
    } else if (en instanceof EObject) {
      _format((EObject)en, document);
      return;
    } else if (en == null) {
      _format((Void)null, document);
      return;
    } else if (en != null) {
      _format(en, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(en, document).toString());
    }
  }
}
