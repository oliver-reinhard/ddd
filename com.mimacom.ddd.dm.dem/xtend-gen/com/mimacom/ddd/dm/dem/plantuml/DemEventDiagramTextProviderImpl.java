package com.mimacom.ddd.dm.dem.plantuml;

import com.mimacom.ddd.dm.dem.DemActor;
import com.mimacom.ddd.dm.dem.DemDomainEvent;
import com.mimacom.ddd.dm.dem.DemNotification;
import com.mimacom.ddd.util.plantuml.IPlantUmlDiagramTextProvider;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DemEventDiagramTextProviderImpl implements IPlantUmlDiagramTextProvider<DemDomainEvent> {
  @Override
  public boolean canProvide(final DemDomainEvent event) {
    return ((event != null) && (!event.getTriggers().isEmpty()));
  }
  
  @Override
  public String diagramText(final DemDomainEvent event) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@startuml");
    _builder.newLine();
    _builder.append("(");
    String _name = event.getName();
    _builder.append(_name);
    _builder.append(") as (event)");
    _builder.newLineIfNotEmpty();
    {
      EList<DemActor> _triggers = event.getTriggers();
      for(final DemActor t : _triggers) {
        _builder.append("actor ");
        String _name_1 = t.getName();
        _builder.append(_name_1);
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
        _builder.append("actor ");
        String _name_2 = n.getNotified().getName();
        _builder.append(_name_2);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<DemActor> _triggers_1 = event.getTriggers();
      for(final DemActor t_1 : _triggers_1) {
        _builder.append(" \t\t");
        String _name_3 = t_1.getName();
        _builder.append(_name_3, " \t\t");
        _builder.append(" --> (event) : triggers");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      final Function1<DemNotification, Boolean> _function_1 = (DemNotification it) -> {
        DemActor _notified = it.getNotified();
        return Boolean.valueOf((_notified != null));
      };
      Iterable<DemNotification> _filter_1 = IterableExtensions.<DemNotification>filter(event.getNotifications(), _function_1);
      for(final DemNotification n_1 : _filter_1) {
        _builder.append(" \t\t");
        String _name_4 = n_1.getNotified().getName();
        _builder.append(_name_4, " \t\t");
        _builder.append(" <-- (event) : ");
        String _name_5 = n_1.getName();
        _builder.append(_name_5, " \t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("@enduml");
    _builder.newLine();
    final String result = _builder.toString();
    return result;
  }
}
