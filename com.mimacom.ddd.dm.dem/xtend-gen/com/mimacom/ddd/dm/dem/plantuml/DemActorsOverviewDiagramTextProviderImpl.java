package com.mimacom.ddd.dm.dem.plantuml;

import com.mimacom.ddd.dm.dem.DemActorModel;
import com.mimacom.ddd.dm.dem.plantuml.AbstractDemDiagramTextProviderImpl;
import com.mimacom.ddd.util.plantuml.IPlantUmlDiagramTextProvider;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class DemActorsOverviewDiagramTextProviderImpl extends AbstractDemDiagramTextProviderImpl implements IPlantUmlDiagramTextProvider<DemActorModel> {
  @Override
  public boolean canProvide(final DemActorModel model) {
    return ((model != null) && (!model.getActors().isEmpty()));
  }
  
  @Override
  public String diagramText(final DemActorModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@startuml");
    _builder.newLine();
    String _allActorsText = this.allActorsText(model.getActors());
    _builder.append(_allActorsText);
    _builder.newLineIfNotEmpty();
    _builder.append("@enduml");
    _builder.newLine();
    final String result = _builder.toString();
    return result;
  }
}
