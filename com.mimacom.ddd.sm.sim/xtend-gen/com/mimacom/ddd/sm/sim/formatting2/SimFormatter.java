/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim.formatting2;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DImport;
import com.mimacom.ddd.dm.base.DLiteral;
import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.DNamedPredicate;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.sm.sim.SAggregateDeduction;
import com.mimacom.ddd.sm.sim.SComplexTypeDeduction;
import com.mimacom.ddd.sm.sim.SEnumerationDeduction;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SMorphRule;
import com.mimacom.ddd.sm.sim.STypeDeduction;
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
  
  protected void _format(final SInformationModel model, @Extension final IFormattableDocument document) {
    EList<DImport> _imports = model.getImports();
    for (final DImport i : _imports) {
      final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
        DImport _last = IterableExtensions.<DImport>last(model.getImports());
        boolean _equals = Objects.equal(i, _last);
        if (_equals) {
          it.setNewLines(2);
        } else {
          it.newLine();
        }
      };
      document.<DImport>append(i, _function);
    }
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.append(this.textRegionExtensions.regionFor(model).assignment(this._simGrammarAccess.getSInformationModelAccess().getNameAssignment_4()), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.<DImport>append(IterableExtensions.<DImport>last(model.getImports()), _function_2);
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
  
  protected void _format(final SMorphRule sMorphRule, @Extension final IFormattableDocument document) {
    document.<DMultiplicity>format(sMorphRule.getRemultiplyTo());
  }
  
  protected void _format(final SAggregateDeduction aggregate, @Extension final IFormattableDocument document) {
    final ISemanticRegion open = this.textRegionExtensions.regionFor(aggregate).keyword(this._simGrammarAccess.getSAggregateDeductionAccess().getLeftCurlyBracketKeyword_5());
    final ISemanticRegion close = this.textRegionExtensions.regionFor(aggregate).keyword(this._simGrammarAccess.getSAggregateDeductionAccess().getRightCurlyBracketKeyword_7());
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
  
  protected void _format(final SEnumerationDeduction en, @Extension final IFormattableDocument document) {
    int _size = en.getLiterals().size();
    boolean _greaterThan = (_size > 3);
    if (_greaterThan) {
      final ISemanticRegion open = this.textRegionExtensions.regionFor(en).keyword(this._simGrammarAccess.getSEnumerationDeductionAccess().getLeftCurlyBracketKeyword_3());
      final ISemanticRegion close = this.textRegionExtensions.regionFor(en).keyword(this._simGrammarAccess.getSEnumerationDeductionAccess().getRightCurlyBracketKeyword_6());
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
        document.surround(this.textRegionExtensions.regionFor(literal).assignment(this._simGrammarAccess.getSEnumerationDeductionAccess().getLiteralsAssignment_4_0()), _function_2);
      }
      List<ISemanticRegion> _keywords = this.textRegionExtensions.regionFor(en).keywords(this._simGrammarAccess.getSEnumerationDeductionAccess().getCommaKeyword_4_1_0());
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
    document.<SEnumerationDeduction>append(en, _function_5);
  }
  
  protected void _format(final SComplexTypeDeduction type, @Extension final IFormattableDocument document) {
    final ISemanticRegion open = this.textRegionExtensions.regionFor(type).keyword(this._simGrammarAccess.getSComplexTypeFeaturesAccess().getLeftCurlyBracketKeyword_0());
    final ISemanticRegion close = this.textRegionExtensions.regionFor(type).keyword(this._simGrammarAccess.getSComplexTypeFeaturesAccess().getRightCurlyBracketKeyword_2());
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
  
  protected void _format(final STypeDeduction type, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.<STypeDeduction>append(type, _function);
  }
  
  public void format(final Object en, final IFormattableDocument document) {
    if (en instanceof SEnumerationDeduction) {
      _format((SEnumerationDeduction)en, document);
      return;
    } else if (en instanceof SAggregateDeduction) {
      _format((SAggregateDeduction)en, document);
      return;
    } else if (en instanceof SMorphRule) {
      _format((SMorphRule)en, document);
      return;
    } else if (en instanceof SComplexTypeDeduction) {
      _format((SComplexTypeDeduction)en, document);
      return;
    } else if (en instanceof SInformationModel) {
      _format((SInformationModel)en, document);
      return;
    } else if (en instanceof XtextResource) {
      _format((XtextResource)en, document);
      return;
    } else if (en instanceof STypeDeduction) {
      _format((STypeDeduction)en, document);
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
