package com.mimacom.ddd.sm.sim.diagramProvider;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.IDiagramRoot;
import com.mimacom.ddd.dm.dim.diagramProvider.DimTypeDiagramRendererPNG;
import com.mimacom.ddd.pub.pub.diagramProvider.IDiagramRenderer;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.plantuml.SimTypeDiagramTextProviderImpl;
import com.mimacom.ddd.util.plantuml.PlantUmlDiagramRendererUtil;
import com.mimacom.ddd.util.plantuml.PlantUmlFileFormat;
import java.io.InputStream;
import org.apache.log4j.Logger;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class SimTypeDiagramRendererPNG implements IDiagramRenderer {
  @Inject
  private SimTypeDiagramTextProviderImpl actualProvider;
  
  @Inject
  private PlantUmlDiagramRendererUtil plantUmlDiagramRenderer;
  
  private static final Logger LOGGER = Logger.getLogger(DimTypeDiagramRendererPNG.class);
  
  @Override
  public boolean canRender(final IDiagramRoot root) {
    return ((root instanceof SInformationModel) && this.actualProvider.canProvide(((SInformationModel) root)));
  }
  
  @Override
  public InputStream render(final IDiagramRoot root) {
    try {
      String _name = SimTypeDiagramRendererPNG.class.getName();
      String _plus = (_name + " for ");
      String _plus_1 = (_plus + root);
      SimTypeDiagramRendererPNG.LOGGER.info(_plus_1);
      String plantUmlText = this.actualProvider.diagramText(((SInformationModel) root));
      if ((plantUmlText == null)) {
        plantUmlText = "";
      }
      return this.plantUmlDiagramRenderer.render(plantUmlText, PlantUmlFileFormat.PNG);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
