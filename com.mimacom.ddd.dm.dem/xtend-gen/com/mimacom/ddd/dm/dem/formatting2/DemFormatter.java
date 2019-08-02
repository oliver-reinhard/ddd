/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dem.formatting2;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DActor;
import com.mimacom.ddd.dm.base.DCondition;
import com.mimacom.ddd.dm.base.DContext;
import com.mimacom.ddd.dm.base.DDomain;
import com.mimacom.ddd.dm.base.DDomainEvent;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DImport;
import com.mimacom.ddd.dm.base.DNotification;
import com.mimacom.ddd.dm.base.DRichText;
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
  
  protected void _format(final DDomain domain, @Extension final IFormattableDocument document) {
    document.<DRichText>format(domain.getDescription());
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.append(this.textRegionExtensions.regionFor(domain).assignment(this._demGrammarAccess.getDDomainAccess().getNameAssignment_2()), _function);
    EList<DImport> _imports = domain.getImports();
    for (final DImport i : _imports) {
      final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
        it.newLine();
      };
      document.<DImport>append(i, _function_1);
    }
    EList<DDomainEvent> _events = domain.getEvents();
    for (final DDomainEvent event : _events) {
      document.<DDomainEvent>format(event);
    }
    EList<DActor> _actors = domain.getActors();
    for (final DActor dActor : _actors) {
      document.<DActor>format(dActor);
    }
  }
  
  protected void _format(final DDomainEvent event, @Extension final IFormattableDocument document) {
    final ISemanticRegion open = this.textRegionExtensions.regionFor(event).keyword(this._demGrammarAccess.getDDomainEventAccess().getLeftCurlyBracketKeyword_4());
    final ISemanticRegion close = this.textRegionExtensions.regionFor(event).keyword(this._demGrammarAccess.getDDomainEventAccess().getRightCurlyBracketKeyword_13());
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
    document.append(this.textRegionExtensions.regionFor(event).keyword(this._demGrammarAccess.getDDomainEventAccess().getContextKeyword_5()), _function_2);
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
    document.prepend(this.textRegionExtensions.regionFor(event).keyword(this._demGrammarAccess.getDDomainEventAccess().getTriggeredKeyword_7()), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.append(this.textRegionExtensions.regionFor(event).assignment(this._demGrammarAccess.getDDomainEventAccess().getTriggerAssignment_9()), _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(this.textRegionExtensions.regionFor(event).keyword(this._demGrammarAccess.getDDomainEventAccess().getNotificationsKeyword_10_0()), _function_5);
    EList<DNotification> _notifications = event.getNotifications();
    for (final DNotification n : _notifications) {
      {
        final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
          it.oneSpace();
        };
        document.surround(this.textRegionExtensions.regionFor(n).keyword(this._demGrammarAccess.getDNotificationAccess().getColonKeyword_2()), _function_6);
        final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
          it.indent();
        };
        document.<DNotification>surround(n, _function_7);
        final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
          DNotification _last = IterableExtensions.<DNotification>last(event.getNotifications());
          boolean _equals = Objects.equal(n, _last);
          if (_equals) {
            it.setNewLines(2);
          } else {
            it.newLine();
          }
        };
        document.<DNotification>append(n, _function_8);
      }
    }
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(this.textRegionExtensions.regionFor(event).keyword(this._demGrammarAccess.getDDomainEventAccess().getConditionsKeyword_11_1()), _function_6);
    this.format(event.getBefore(), document);
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(this.textRegionExtensions.regionFor(event).keyword(this._demGrammarAccess.getDDomainEventAccess().getConditionsKeyword_12_1()), _function_7);
    this.format(event.getAfter(), document);
  }
  
  protected void _format(final List<DCondition> conditions, @Extension final IFormattableDocument document) {
    for (final DCondition c : conditions) {
      {
        final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
          it.indent();
        };
        document.<DCondition>surround(c, _function);
        final ISemanticRegion colon = this.textRegionExtensions.regionFor(c).keyword(this._demGrammarAccess.getDConditionAccess().getColonKeyword_2());
        final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
          it.noSpace();
        };
        document.prepend(colon, _function_1);
        final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.append(colon, _function_2);
        final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
          it.indent();
        };
        document.<DExpression>surround(c.getCondition(), _function_3);
        final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
          it.setNewLines(2);
        };
        document.<DCondition>append(c, _function_4);
      }
    }
  }
  
  protected void _format(final DContext context, @Extension final IFormattableDocument document) {
  }
  
  public void format(final Object context, final IFormattableDocument document) {
    if (context instanceof DContext) {
      _format((DContext)context, document);
      return;
    } else if (context instanceof DDomain) {
      _format((DDomain)context, document);
      return;
    } else if (context instanceof DDomainEvent) {
      _format((DDomainEvent)context, document);
      return;
    } else if (context instanceof DRichText) {
      _format((DRichText)context, document);
      return;
    } else if (context instanceof DmxNamespace) {
      _format((DmxNamespace)context, document);
      return;
    } else if (context instanceof XtextResource) {
      _format((XtextResource)context, document);
      return;
    } else if (context instanceof DExpression) {
      _format((DExpression)context, document);
      return;
    } else if (context instanceof List) {
      _format((List<DCondition>)context, document);
      return;
    } else if (context instanceof EObject) {
      _format((EObject)context, document);
      return;
    } else if (context == null) {
      _format((Void)null, document);
      return;
    } else if (context != null) {
      _format(context, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(context, document).toString());
    }
  }
}
