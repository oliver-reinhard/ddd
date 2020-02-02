package com.mimacom.ddd.sm.sim.diagramProvider;

import com.mimacom.ddd.dm.base.IDiagramRoot;
import com.mimacom.ddd.pub.pub.diagramProvider.IDiagramRenderer;
import java.io.InputStream;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.util.StringInputStream;

@SuppressWarnings("all")
public class SimDiagramRendererPNG implements IDiagramRenderer {
  @Override
  public InputStream render(final IDiagramRoot root) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = SimDiagramRendererPNG.class.getName();
    _builder.append(_name);
    _builder.append(": EXECUTING");
    System.err.println(_builder);
    String _name_1 = SimDiagramRendererPNG.class.getName();
    return new StringInputStream(_name_1);
  }
}
