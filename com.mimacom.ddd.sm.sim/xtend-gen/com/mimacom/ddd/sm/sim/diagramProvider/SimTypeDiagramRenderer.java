package com.mimacom.ddd.sm.sim.diagramProvider;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.IDiagramRoot;
import com.mimacom.ddd.pub.pub.diagramProvider.IDiagramRenderer;
import com.mimacom.ddd.sm.sim.SystemInformationModel;
import com.mimacom.ddd.sm.sim.plantuml.SimTypeDiagramTextProviderImpl;
import com.mimacom.ddd.util.plantuml.PlantUmlDiagramRendererUtil;
import com.mimacom.ddd.util.plantuml.PlantUmlFileFormat;
import java.io.InputStream;
import org.apache.log4j.Logger;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class SimTypeDiagramRenderer implements IDiagramRenderer {
  private static final Logger LOGGER = Logger.getLogger(SimTypeDiagramRenderer.class);
  
  @Inject
  private SimTypeDiagramTextProviderImpl actualProvider;
  
  @Inject
  private PlantUmlDiagramRendererUtil plantUmlDiagramRenderer;
  
  private final PlantUmlFileFormat outputFormat;
  
  public SimTypeDiagramRenderer(final PlantUmlFileFormat outputFormat) {
    this.outputFormat = outputFormat;
  }
  
  @Override
  public boolean canRender(final IDiagramRoot root) {
    return ((root instanceof SystemInformationModel) && this.actualProvider.canProvide(((SystemInformationModel) root)));
  }
  
  @Override
  public InputStream render(final IDiagramRoot root) {
    try {
      String _name = SimTypeDiagramRenderer.class.getName();
      String _plus = (_name + " for ");
      String _plus_1 = (_plus + root);
      SimTypeDiagramRenderer.LOGGER.info(_plus_1);
      String plantUmlText = this.actualProvider.diagramText(((SystemInformationModel) root));
      if ((plantUmlText == null)) {
        plantUmlText = "";
      }
      return this.plantUmlDiagramRenderer.render(plantUmlText, this.outputFormat);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
