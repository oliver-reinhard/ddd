package com.mimacom.ddd.pub.pub.diagramProvider;

import java.io.InputStream;

import com.mimacom.ddd.dm.base.IDiagramRoot;

public interface IDiagramRenderer {
	
	InputStream render(IDiagramRoot root);

}
