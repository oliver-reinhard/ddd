package com.mimacom.ddd.dm.base.plantuml;

import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.base.base.DAssociation;
import com.mimacom.ddd.dm.base.base.DAttribute;
import com.mimacom.ddd.dm.base.base.DComplexType;
import com.mimacom.ddd.dm.base.base.DEntityType;
import java.util.Collections;

@SuppressWarnings("all")
public class TypeDiagramTextProviderData {
  public Iterable<DAggregate> allAggregates = Collections.EMPTY_LIST;
  
  public Iterable<DAssociation> allAssociations = Collections.EMPTY_LIST;
  
  public Iterable<DEntityType> allEntitiesReferencedWithinModel = Collections.EMPTY_LIST;
  
  public Iterable<DAggregate> allAggregatesReferencedWithinModel = Collections.EMPTY_LIST;
  
  public Iterable<DEntityType> allEntitiesReferencedOutsideModel = Collections.EMPTY_LIST;
  
  public Iterable<String> allReferencedModels = Collections.EMPTY_LIST;
  
  public Iterable<DAttribute> allDetailAttributes = Collections.EMPTY_LIST;
  
  public Iterable<DComplexType> allSubtypes = Collections.EMPTY_LIST;
}
