package com.mimacom.ddd.pub.pub.generator;

import com.google.inject.Inject;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramProviderRegistry;

@SuppressWarnings("all")
public class PubDiagramRenderer {
  @Inject
  private final DiagramProviderRegistry renderers = null;
  
  public void render() {
    this.renderers.getDiagramProviders();
  }
}
