package com.mimacom.ddd.dm.dem.plantuml;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.dem.DemActor;
import com.mimacom.ddd.dm.dem.DemDomainEvent;
import com.mimacom.ddd.dm.dem.DemNotification;
import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.mwe2.language.scoping.QualifiedNameProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public abstract class AbstractDemDiagramTextProviderImpl {
  @Inject
  private QualifiedNameProvider qualifiedNameProvider;
  
  public void collectActors(final DemDomainEvent event, final Map<QualifiedName, DemActor> acceptor) {
    EList<DemActor> _triggers = event.getTriggers();
    for (final DemActor actor : _triggers) {
      acceptor.put(this.qualifiedNameProvider.getFullyQualifiedName(actor), actor);
    }
    final Function1<DemNotification, Boolean> _function = (DemNotification it) -> {
      DemActor _notified = it.getNotified();
      return Boolean.valueOf((_notified != null));
    };
    Iterable<DemNotification> _filter = IterableExtensions.<DemNotification>filter(event.getNotifications(), _function);
    for (final DemNotification notification : _filter) {
      {
        final DemActor actor_1 = notification.getNotified();
        acceptor.put(this.qualifiedNameProvider.getFullyQualifiedName(actor_1), actor_1);
      }
    }
  }
  
  public String eventText(final DemDomainEvent event) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("usecase (");
    String _name = event.getName();
    _builder.append(_name);
    _builder.append(")");
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
      }
    }
    return _builder.toString();
  }
  
  public String allFlowsText(final DemDomainEvent event) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<DemActor> _triggers = event.getTriggers();
      for(final DemActor actor : _triggers) {
        String _name = actor.getName();
        _builder.append(_name);
        _builder.append(" --> (");
        String _name_1 = event.getName();
        _builder.append(_name_1);
        _builder.append(") : triggers");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      final Function1<DemNotification, Boolean> _function = (DemNotification it) -> {
        DemActor _notified = it.getNotified();
        return Boolean.valueOf((_notified != null));
      };
      Iterable<DemNotification> _filter = IterableExtensions.<DemNotification>filter(event.getNotifications(), _function);
      for(final DemNotification n : _filter) {
        String _name_2 = n.getNotified().getName();
        _builder.append(_name_2);
        _builder.append(" <-- (");
        String _name_3 = event.getName();
        _builder.append(_name_3);
        _builder.append(") : ");
        String _name_4 = n.getName();
        _builder.append(_name_4);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
}
