package com.mimacom.ddd.dm.dem.plantuml;

import com.google.common.collect.Maps;
import com.mimacom.ddd.dm.dem.DemActor;
import com.mimacom.ddd.dm.dem.DemDomainEvent;
import com.mimacom.ddd.dm.dem.plantuml.AbstractDemDiagramTextProviderImpl;
import com.mimacom.ddd.util.plantuml.IPlantUmlDiagramTextProvider;
import java.util.HashMap;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.QualifiedName;

@SuppressWarnings("all")
public class DemEventDiagramTextProviderImpl extends AbstractDemDiagramTextProviderImpl implements IPlantUmlDiagramTextProvider<DemDomainEvent> {
  @Override
  public boolean canProvide(final DemDomainEvent event) {
    return ((event != null) && (!event.getTriggers().isEmpty()));
  }
  
  @Override
  public String diagramText(final DemDomainEvent event) {
    final HashMap<QualifiedName, DemActor> actors = Maps.<QualifiedName, DemActor>newHashMap();
    this.collectActors(event, actors);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@startuml");
    _builder.newLine();
    _builder.newLine();
    CharSequence _generateSkinParameters = this.generateSkinParameters();
    _builder.append(_generateSkinParameters);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _eventText = this.eventText(event);
    _builder.append(_eventText);
    _builder.newLineIfNotEmpty();
    String _allActorsText = this.allActorsText(actors.values());
    _builder.append(_allActorsText);
    _builder.newLineIfNotEmpty();
    String _allFlowsText = this.allFlowsText(event);
    _builder.append(_allFlowsText);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@enduml");
    _builder.newLine();
    final String result = _builder.toString();
    return result;
  }
}
