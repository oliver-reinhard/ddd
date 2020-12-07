package com.mimacom.ddd.dm.base.plantuml

import com.mimacom.ddd.dm.base.base.DAggregate
import com.mimacom.ddd.dm.base.base.DAssociation
import com.mimacom.ddd.dm.base.base.DAttribute
import com.mimacom.ddd.dm.base.base.DComplexType
import com.mimacom.ddd.dm.base.base.DEntityType
import java.util.Collections

class TypeDiagramTextProviderData {
	
	public var Iterable<DAggregate> allAggregates = Collections.EMPTY_LIST
	public var Iterable<DAssociation> allAssociations = Collections.EMPTY_LIST
	public var Iterable<DEntityType> allEntitiesReferencedWithinModel = Collections.EMPTY_LIST
	public var Iterable<DAggregate> allAggregatesReferencedWithinModel = Collections.EMPTY_LIST
	public var Iterable<DEntityType> allEntitiesReferencedOutsideModel = Collections.EMPTY_LIST
	public var Iterable<String> allReferencedModels = Collections.EMPTY_LIST
	public var Iterable<DAttribute> allDetailAttributes = Collections.EMPTY_LIST
	public var Iterable<DComplexType> allSubtypes = Collections.EMPTY_LIST
}