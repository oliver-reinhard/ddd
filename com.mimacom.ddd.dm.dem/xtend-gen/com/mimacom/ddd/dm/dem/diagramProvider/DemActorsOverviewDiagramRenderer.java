package com.mimacom.ddd.dm.dem.diagramProvider;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.IDiagramRoot;
import com.mimacom.ddd.dm.dem.DemActorModel;
import com.mimacom.ddd.dm.dem.diagramProvider.DemEventDiagramRenderer;
import com.mimacom.ddd.dm.dem.plantuml.DemActorsOverviewDiagramTextProviderImpl;
import com.mimacom.ddd.pub.pub.diagramProvider.IDiagramRenderer;
import com.mimacom.ddd.util.plantuml.PlantUmlDiagramRendererUtil;
import com.mimacom.ddd.util.plantuml.PlantUmlFileFormat;
import java.io.InputStream;
import org.apache.log4j.Logger;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class DemActorsOverviewDiagramRenderer implements IDiagramRenderer {
  private static final Logger LOGGER = Logger.getLogger(DemActorsOverviewDiagramRenderer.class);
  
  @Inject
  private DemActorsOverviewDiagramTextProviderImpl actualProvider;
  
  @Inject
  private PlantUmlDiagramRendererUtil plantUmlDiagramRenderer;
  
  private final PlantUmlFileFormat outputFormat;
  
  public DemActorsOverviewDiagramRenderer(final PlantUmlFileFormat outputFormat) {
    this.outputFormat = outputFormat;
  }
  
  @Override
  public boolean canRender(final IDiagramRoot root) {
    return ((root instanceof DemActorModel) && this.actualProvider.canProvide(((DemActorModel) root)));
  }
  
  @Override
  public InputStream render(final IDiagramRoot root) {
    try {
      String _name = DemEventDiagramRenderer.class.getName();
      String _plus = (_name + " for ");
      String _plus_1 = (_plus + root);
      DemActorsOverviewDiagramRenderer.LOGGER.info(_plus_1);
      String plantUmlText = this.actualProvider.diagramText(((DemActorModel) root));
      if ((plantUmlText == null)) {
        plantUmlText = "";
      }
      return this.plantUmlDiagramRenderer.render(plantUmlText, this.outputFormat);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
