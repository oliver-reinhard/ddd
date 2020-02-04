package com.mimacom.ddd.dm.dim.diagramProvider;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DInformationModel;
import com.mimacom.ddd.dm.base.IDiagramRoot;
import com.mimacom.ddd.dm.dim.plantuml.DimTypeDiagramTextProviderImpl;
import com.mimacom.ddd.pub.pub.diagramProvider.IDiagramRenderer;
import com.mimacom.ddd.util.plantuml.PlantUmlDiagramRendererUtil;
import com.mimacom.ddd.util.plantuml.PlantUmlFileFormat;
import java.io.InputStream;
import org.apache.log4j.Logger;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class DimTypeDiagramRendererPNG implements IDiagramRenderer {
  @Inject
  private DimTypeDiagramTextProviderImpl actualProvider;
  
  @Inject
  private PlantUmlDiagramRendererUtil plantUmlDiagramRenderer;
  
  private static final Logger LOGGER = Logger.getLogger(DimTypeDiagramRendererPNG.class);
  
  @Override
  public boolean canRender(final IDiagramRoot root) {
    return ((root instanceof DInformationModel) && this.actualProvider.canProvide(((DInformationModel) root)));
  }
  
  @Override
  public InputStream render(final IDiagramRoot root) {
    try {
      String _name = DimTypeDiagramRendererPNG.class.getName();
      String _plus = (_name + " for ");
      String _plus_1 = (_plus + root);
      DimTypeDiagramRendererPNG.LOGGER.info(_plus_1);
      String plantUmlText = this.actualProvider.diagramText(((DInformationModel) root));
      if ((plantUmlText == null)) {
        plantUmlText = "";
      }
      return this.plantUmlDiagramRenderer.render(plantUmlText, PlantUmlFileFormat.PNG);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
