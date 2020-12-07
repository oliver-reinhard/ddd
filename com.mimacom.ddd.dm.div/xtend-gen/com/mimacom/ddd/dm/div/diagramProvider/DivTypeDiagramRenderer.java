package com.mimacom.ddd.dm.div.diagramProvider;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.IDiagramRoot;
import com.mimacom.ddd.dm.dim.DomainInformationModel;
import com.mimacom.ddd.dm.div.DomainInformationView;
import com.mimacom.ddd.dm.div.plantuml.DivTypeDiagramTextProviderImpl;
import com.mimacom.ddd.pub.pub.diagramProvider.IDiagramRenderer;
import com.mimacom.ddd.util.plantuml.PlantUmlDiagramRendererUtil;
import com.mimacom.ddd.util.plantuml.PlantUmlFileFormat;
import java.io.InputStream;
import org.apache.log4j.Logger;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class DivTypeDiagramRenderer implements IDiagramRenderer {
  private static final Logger LOGGER = Logger.getLogger(DivTypeDiagramRenderer.class);
  
  @Inject
  private DivTypeDiagramTextProviderImpl actualProvider;
  
  @Inject
  private PlantUmlDiagramRendererUtil plantUmlDiagramRenderer;
  
  private final PlantUmlFileFormat outputFormat;
  
  public DivTypeDiagramRenderer(final PlantUmlFileFormat outputFormat) {
    this.outputFormat = outputFormat;
  }
  
  @Override
  public boolean canRender(final IDiagramRoot root) {
    return ((root instanceof DomainInformationModel) && this.actualProvider.canProvide(((DomainInformationView) root)));
  }
  
  @Override
  public InputStream render(final IDiagramRoot root) {
    try {
      String _name = DivTypeDiagramRenderer.class.getName();
      String _plus = (_name + " for ");
      String _plus_1 = (_plus + root);
      DivTypeDiagramRenderer.LOGGER.info(_plus_1);
      String plantUmlText = this.actualProvider.diagramText(((DomainInformationView) root));
      if ((plantUmlText == null)) {
        plantUmlText = "";
      }
      return this.plantUmlDiagramRenderer.render(plantUmlText, this.outputFormat);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
