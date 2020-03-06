package com.mimacom.ddd.pub.pub.generator;

import com.mimacom.ddd.pub.pub.diagramProvider.DiagramFileFormat;
import java.util.List;

@SuppressWarnings("all")
public interface IDiagramFileFormatPreference {
  public abstract List<DiagramFileFormat> raster();
  
  public abstract List<DiagramFileFormat> vector();
}
