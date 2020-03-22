package com.mimacom.ddd.dm.dem.plantuml;

import com.google.common.collect.Maps;
import com.mimacom.ddd.dm.dem.DemActor;
import com.mimacom.ddd.dm.dem.DemDomainEvent;
import com.mimacom.ddd.dm.dem.DemEventsOverviewModel;
import com.mimacom.ddd.dm.dem.plantuml.AbstractDemDiagramTextProviderImpl;
import com.mimacom.ddd.util.plantuml.IPlantUmlDiagramTextProvider;
import java.util.HashMap;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.QualifiedName;

@SuppressWarnings("all")
public class DemEventsOverviewDiagramTextProviderImpl extends AbstractDemDiagramTextProviderImpl implements IPlantUmlDiagramTextProvider<DemEventsOverviewModel> {
  @Override
  public boolean canProvide(final DemEventsOverviewModel model) {
    boolean _xblockexpression = false;
    {
      final List<DemDomainEvent> events = this.computeEvents(model);
      _xblockexpression = ((model != null) && (!events.isEmpty()));
    }
    return _xblockexpression;
  }
  
  public List<DemDomainEvent> computeEvents(final DemEventsOverviewModel model) {
    return model.getInclude();
  }
  
  @Override
  public String diagramText(final DemEventsOverviewModel model) {
    final List<DemDomainEvent> events = this.computeEvents(model);
    final HashMap<QualifiedName, DemActor> actors = Maps.<QualifiedName, DemActor>newHashMap();
    for (final DemDomainEvent event : events) {
      this.collectActors(event, actors);
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@startuml");
    _builder.newLine();
    String _allActorsText = this.allActorsText(actors.values());
    _builder.append(_allActorsText);
    _builder.newLineIfNotEmpty();
    {
      for(final DemDomainEvent event_1 : events) {
        _builder.newLine();
        String _eventText = this.eventText(event_1);
        _builder.append(_eventText);
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _allFlowsText = this.allFlowsText(event_1);
        _builder.append(_allFlowsText, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("@enduml");
    _builder.newLine();
    final String result = _builder.toString();
    return result;
  }
}
