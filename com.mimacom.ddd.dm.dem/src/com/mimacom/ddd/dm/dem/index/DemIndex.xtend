package com.mimacom.ddd.dm.dem.index

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.google.inject.Singleton
import com.mimacom.ddd.dm.base.base.DNamespace
import com.mimacom.ddd.dm.dem.DemDomainEvent
import com.mimacom.ddd.dm.dem.DemEventsOverviewModel
import com.mimacom.ddd.dm.dem.DemPackage
import com.mimacom.ddd.util.indexing.AbstractXtextIndex
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IEObjectDescription

@Singleton
class DemIndex extends AbstractXtextIndex {
	
	@Inject IQualifiedNameProvider qualifiedNameProvider
	
	val DEM = DemPackage.eINSTANCE

	protected def Iterable<IEObjectDescription> getVisibleDomainEventDescriptions(EObject context, QualifiedName domainName) {
		context.getVisibleEObjectDescriptions(DEM.demDomainEvent).filter[it.name.startsWith(domainName)]
	}

	/*
	 * Returns the DemDomainEvents of the given domain. Considers include and exclude lists.
	 */
	def List<DemDomainEvent> eventsOfDomain(DemEventsOverviewModel model) {
		if (! model.include.empty) {
			return model.include
		}	
		
		// Domain name
		val container = EcoreUtil2.getContainerOfType(model, DNamespace)
		val qualifiedDomainName = qualifiedNameProvider.getFullyQualifiedName(container)
		
		val allEventDescriptions =  getVisibleDomainEventDescriptions(model, qualifiedDomainName)
		val events = Lists.newArrayList
		for (desc : allEventDescriptions) {
			var event = model.resolveEObjectDescription(desc, DemDomainEvent)
			if (event !== null) {
				events.add(event)
			}
		}
			
		if (! model.exclude.empty) {
			events.removeAll(model.exclude)
		}
		return events
	}
}
