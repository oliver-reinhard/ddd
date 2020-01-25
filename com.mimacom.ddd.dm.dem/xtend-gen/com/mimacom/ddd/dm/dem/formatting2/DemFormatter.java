/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dem.formatting2;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DContext;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DNamedPredicate;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.dem.DCaseConjunction;
import com.mimacom.ddd.dm.dem.DDomainEvent;
import com.mimacom.ddd.dm.dem.DNotification;
import com.mimacom.ddd.dm.dem.services.DemGrammarAccess;
import com.mimacom.ddd.dm.dmx.DmxNamespace;
import com.mimacom.ddd.dm.dmx.formatting2.DmxFormatter;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class DemFormatter extends DmxFormatter {
  @Inject
  @Extension
  private DemGrammarAccess _demGrammarAccess;
  
  protected void _format(final DDomainEvent event, @Extension final IFormattableDocument document) {
    final ISemanticRegion open = this.textRegionExtensions.regionFor(event).keyword(this._demGrammarAccess.getDDomainEventAccess().getLeftCurlyBracketKeyword_7());
    final ISemanticRegion close = this.textRegionExtensions.regionFor(event).keyword(this._demGrammarAccess.getDDomainEventAccess().getRightCurlyBracketKeyword_14());
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.append(open, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(open, close, _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(this.textRegionExtensions.regionFor(event).keyword(this._demGrammarAccess.getDDomainEventAccess().getContextKeyword_8()), _function_2);
    EList<DContext> _context = event.getContext();
    for (final DContext context : _context) {
      {
        final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
          it.oneSpace();
        };
        document.surround(this.textRegionExtensions.regionFor(context).keyword(this._demGrammarAccess.getDContextAccess().getColonKeyword_2()), _function_3);
        final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
          it.indent();
        };
        document.<DContext>surround(context, _function_4);
        final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
          DContext _last = IterableExtensions.<DContext>last(event.getContext());
          boolean _equals = Objects.equal(context, _last);
          if (_equals) {
            it.setNewLines(2);
          } else {
            it.newLine();
          }
        };
        document.<DContext>append(context, _function_5);
      }
    }
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.prepend(this.textRegionExtensions.regionFor(event).keyword(this._demGrammarAccess.getDDomainEventAccess().getTriggeredKeyword_10_0()), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(this.textRegionExtensions.regionFor(event).keyword(this._demGrammarAccess.getDDomainEventAccess().getByKeyword_10_1()), _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.append(document.surround(this.textRegionExtensions.regionFor(event).assignment(this._demGrammarAccess.getDDomainEventAccess().getTriggerAssignment_10_2()), _function_5), _function_6);
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(this.textRegionExtensions.regionFor(event).keyword(this._demGrammarAccess.getDDomainEventAccess().getNotificationsKeyword_11_0()), _function_7);
    EList<DNotification> _notifications = event.getNotifications();
    for (final DNotification n : _notifications) {
      {
        final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
          it.oneSpace();
        };
        document.surround(this.textRegionExtensions.regionFor(n).keyword(this._demGrammarAccess.getDNotificationAccess().getColonKeyword_2()), _function_8);
        final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
          it.indent();
        };
        document.<DNotification>surround(n, _function_9);
        final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
          DNotification _last = IterableExtensions.<DNotification>last(event.getNotifications());
          boolean _equals = Objects.equal(n, _last);
          if (_equals) {
            it.setNewLines(2);
          } else {
            it.newLine();
          }
        };
        document.<DNotification>append(n, _function_10);
      }
    }
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(this.textRegionExtensions.regionFor(event).keyword(this._demGrammarAccess.getDDomainEventAccess().getPreconditionsKeyword_12_0()), _function_8);
    this.format(event.getPreconditionsCNF(), document);
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(this.textRegionExtensions.regionFor(event).keyword(this._demGrammarAccess.getDDomainEventAccess().getPostconditionsKeyword_13_0()), _function_9);
    this.format(event.getPostconditionsDNF(), document);
  }
  
  protected void _format(final List<DNamedElement> elements, @Extension final IFormattableDocument document) {
    for (final DNamedElement e : elements) {
      {
        final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
          it.indent();
        };
        document.<DNamedElement>surround(e, _function);
        this.format(e, document);
        final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
          it.setNewLines(2);
        };
        document.<DNamedElement>append(e, _function_1);
      }
    }
  }
  
  protected void _format(final DNamedPredicate p, @Extension final IFormattableDocument document) {
    final ISemanticRegion colon = this.textRegionExtensions.regionFor(p).keyword(this._demGrammarAccess.getDNamedPredicateAccess().getColonKeyword_2());
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(colon, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(colon, _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<DExpression>surround(p.getPredicate(), _function_2);
  }
  
  protected void _format(final DCaseConjunction c, @Extension final IFormattableDocument document) {
    boolean _isOtherwise = c.isOtherwise();
    boolean _not = (!_isOtherwise);
    if (_not) {
      final ISemanticRegion when = this.textRegionExtensions.regionFor(c).keyword(this._demGrammarAccess.getDCaseConjunctionAccess().getWhenKeyword_3_0_0());
      final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
        it.newLine();
      };
      document.prepend(when, _function);
    } else {
      final ISemanticRegion otherwise = this.textRegionExtensions.regionFor(c).keyword(this._demGrammarAccess.getDCaseConjunctionAccess().getOtherwiseOtherwiseKeyword_3_1_0());
      final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
        it.newLine();
      };
      document.prepend(otherwise, _function_1);
    }
    final ISemanticRegion colon = this.textRegionExtensions.regionFor(c).keyword(this._demGrammarAccess.getDCaseConjunctionAccess().getColonKeyword_4());
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(colon, _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.append(colon, _function_3);
    this.format(c.getPredicates(), document);
  }
  
  protected void _format(final DContext context, @Extension final IFormattableDocument document) {
  }
  
  public void format(final Object event, final IFormattableDocument document) {
    if (event instanceof DDomainEvent) {
      _format((DDomainEvent)event, document);
      return;
    } else if (event instanceof DContext) {
      _format((DContext)event, document);
      return;
    } else if (event instanceof DRichText) {
      _format((DRichText)event, document);
      return;
    } else if (event instanceof DmxNamespace) {
      _format((DmxNamespace)event, document);
      return;
    } else if (event instanceof XtextResource) {
      _format((XtextResource)event, document);
      return;
    } else if (event instanceof DExpression) {
      _format((DExpression)event, document);
      return;
    } else if (event instanceof DNamedPredicate) {
      _format((DNamedPredicate)event, document);
      return;
    } else if (event instanceof DCaseConjunction) {
      _format((DCaseConjunction)event, document);
      return;
    } else if (event instanceof List) {
      _format((List<DNamedElement>)event, document);
      return;
    } else if (event instanceof EObject) {
      _format((EObject)event, document);
      return;
    } else if (event == null) {
      _format((Void)null, document);
      return;
    } else if (event != null) {
      _format(event, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(event, document).toString());
    }
  }
}
