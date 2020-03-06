package com.mimacom.ddd.pub.pub.generator;

import com.mimacom.ddd.pub.pub.diagramProvider.DiagramFileFormat;
import com.mimacom.ddd.pub.pub.generator.IDiagramFileFormatPreference;
import java.util.Collections;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class PubLaTeXDiagramFileFormatPreference implements IDiagramFileFormatPreference {
  @Override
  public List<DiagramFileFormat> raster() {
    return Collections.<DiagramFileFormat>unmodifiableList(CollectionLiterals.<DiagramFileFormat>newArrayList(DiagramFileFormat.PNG));
  }
  
  @Override
  public List<DiagramFileFormat> vector() {
    return Collections.<DiagramFileFormat>unmodifiableList(CollectionLiterals.<DiagramFileFormat>newArrayList(DiagramFileFormat.EPS));
  }
}
