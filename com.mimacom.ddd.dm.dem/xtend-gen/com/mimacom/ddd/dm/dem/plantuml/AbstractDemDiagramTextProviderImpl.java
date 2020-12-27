package com.mimacom.ddd.dm.dem.plantuml;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DNamedElement;
import com.mimacom.ddd.dm.base.base.DNamedPredicate;
import com.mimacom.ddd.dm.base.plantuml.PlantUmlTextProviderUtil;
import com.mimacom.ddd.dm.dem.DemActor;
import com.mimacom.ddd.dm.dem.DemCaseConjunction;
import com.mimacom.ddd.dm.dem.DemDomainEvent;
import com.mimacom.ddd.dm.dem.DemNotification;
import com.mimacom.ddd.dm.dem.DemTrigger;
import com.mimacom.ddd.util.plantuml.SkinparamActor;
import com.mimacom.ddd.util.plantuml.SkinparamArrow;
import com.mimacom.ddd.util.plantuml.SkinparamGlobal;
import com.mimacom.ddd.util.plantuml.SkinparamNote;
import com.mimacom.ddd.util.plantuml.SkinparamUseCase;
import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.mwe2.language.scoping.QualifiedNameProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public abstract class AbstractDemDiagramTextProviderImpl {
  @Inject
  @Extension
  private PlantUmlTextProviderUtil _plantUmlTextProviderUtil;
  
  @Inject
  private QualifiedNameProvider qualifiedNameProvider;
  
  @Inject
  private SkinparamGlobal skinparamGlobal;
  
  @Inject
  private SkinparamUseCase skinparamUseCase;
  
  @Inject
  private SkinparamActor skinparamActor;
  
  @Inject
  private SkinparamArrow skinparamArrow;
  
  @Inject
  private SkinparamNote skinparamNote;
  
  public CharSequence generateSkinParameters() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(this.skinparamGlobal);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(this.skinparamUseCase);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(this.skinparamActor);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(this.skinparamArrow);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(this.skinparamNote);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public void collectActors(final DemDomainEvent event, final Map<QualifiedName, DemActor> acceptor) {
    final Function1<DemTrigger, Boolean> _function = (DemTrigger it) -> {
      DemActor _actor = it.getActor();
      return Boolean.valueOf((_actor != null));
    };
    Iterable<DemTrigger> _filter = IterableExtensions.<DemTrigger>filter(event.getTriggers(), _function);
    for (final DemTrigger trigger : _filter) {
      acceptor.put(this.qualifiedNameProvider.getFullyQualifiedName(trigger.getActor()), trigger.getActor());
    }
    final Function1<DemNotification, Boolean> _function_1 = (DemNotification it) -> {
      DemActor _notified = it.getNotified();
      return Boolean.valueOf((_notified != null));
    };
    Iterable<DemNotification> _filter_1 = IterableExtensions.<DemNotification>filter(event.getNotifications(), _function_1);
    for (final DemNotification notification : _filter_1) {
      {
        final DemActor actor = notification.getNotified();
        acceptor.put(this.qualifiedNameProvider.getFullyQualifiedName(actor), actor);
      }
    }
  }
  
  public String eventText(final DemDomainEvent event) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("usecase ");
    String _name = event.getName();
    _builder.append(_name);
    _builder.append(" as \"<b><size:");
    int _fontSize = this.skinparamUseCase.fontSize();
    int _plus = (_fontSize + 2);
    _builder.append(_plus);
    _builder.append(">");
    String _name_1 = event.getName();
    _builder.append(_name_1);
    _builder.append("</size></b>");
    _builder.newLineIfNotEmpty();
    {
      boolean _isEmpty = event.getPreconditionsCNF().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLine();
        _builder.append(".. Preconditions ..");
        _builder.newLine();
        _builder.newLine();
        {
          EList<DNamedPredicate> _preconditionsCNF = event.getPreconditionsCNF();
          for(final DNamedPredicate pre : _preconditionsCNF) {
            _builder.append("* ");
            String _name_2 = pre.getName();
            _builder.append(_name_2);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      boolean _isEmpty_1 = event.getPostconditionsDNF().isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.newLine();
        _builder.append(".. Postconditions ..");
        _builder.newLine();
        {
          EList<DNamedElement> _postconditionsDNF = event.getPostconditionsDNF();
          for(final DNamedElement post : _postconditionsDNF) {
            {
              if ((post instanceof DemCaseConjunction)) {
                _builder.newLine();
                _builder.append("<b>Case ");
                String _name_3 = ((DemCaseConjunction)post).getName();
                _builder.append(_name_3);
                _builder.append("</b>:");
                _builder.newLineIfNotEmpty();
                {
                  EList<DNamedPredicate> _predicates = ((DemCaseConjunction)post).getPredicates();
                  for(final DNamedPredicate pred : _predicates) {
                    _builder.append("* ");
                    String _name_4 = pred.getName();
                    _builder.append(_name_4);
                    _builder.newLineIfNotEmpty();
                  }
                }
              } else {
                {
                  DNamedElement _head = IterableExtensions.<DNamedElement>head(event.getPostconditionsDNF());
                  boolean _tripleEquals = (post == _head);
                  if (_tripleEquals) {
                    _builder.newLine();
                  }
                }
                _builder.append("* ");
                String _name_5 = post.getName();
                _builder.append(_name_5);
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.append("\"");
    _builder.newLine();
    CharSequence _generateNotesWithIds = this._plantUmlTextProviderUtil.generateNotesWithIds(event, event.getName());
    _builder.append(_generateNotesWithIds);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String allActorsText(final Collection<DemActor> actors) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final DemActor actor : actors) {
        _builder.append("actor :");
        String _name = actor.getName();
        _builder.append(_name);
        _builder.append(":");
        _builder.newLineIfNotEmpty();
        CharSequence _generateNotesWithIds = this._plantUmlTextProviderUtil.generateNotesWithIds(actor, actor.getName());
        _builder.append(_generateNotesWithIds);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  public String allFlowsText(final DemDomainEvent event) {
    StringConcatenation _builder = new StringConcatenation();
    {
      final Function1<DemTrigger, Boolean> _function = (DemTrigger it) -> {
        DemActor _actor = it.getActor();
        return Boolean.valueOf((_actor != null));
      };
      Iterable<DemTrigger> _filter = IterableExtensions.<DemTrigger>filter(event.getTriggers(), _function);
      for(final DemTrigger trigger : _filter) {
        String _name = trigger.getActor().getName();
        _builder.append(_name);
        _builder.append(" --> (");
        String _name_1 = event.getName();
        _builder.append(_name_1);
        _builder.append(") : triggers");
        _builder.newLineIfNotEmpty();
        CharSequence _generateLinkNotes = this._plantUmlTextProviderUtil.generateLinkNotes(trigger);
        _builder.append(_generateLinkNotes);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      final Function1<DemNotification, Boolean> _function_1 = (DemNotification it) -> {
        DemActor _notified = it.getNotified();
        return Boolean.valueOf((_notified != null));
      };
      Iterable<DemNotification> _filter_1 = IterableExtensions.<DemNotification>filter(event.getNotifications(), _function_1);
      for(final DemNotification notification : _filter_1) {
        String _name_2 = notification.getNotified().getName();
        _builder.append(_name_2);
        _builder.append(" <-- (");
        String _name_3 = event.getName();
        _builder.append(_name_3);
        _builder.append(") : ");
        String _name_4 = notification.getName();
        _builder.append(_name_4);
        _builder.newLineIfNotEmpty();
        CharSequence _generateLinkNotes_1 = this._plantUmlTextProviderUtil.generateLinkNotes(notification);
        _builder.append(_generateLinkNotes_1);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
}
