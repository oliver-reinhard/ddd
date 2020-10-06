package com.mimacom.ddd.dm.dem.index;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mimacom.ddd.dm.base.base.DNamespace;
import com.mimacom.ddd.dm.dem.DemDomainEvent;
import com.mimacom.ddd.dm.dem.DemEventsOverviewModel;
import com.mimacom.ddd.dm.dem.DemPackage;
import com.mimacom.ddd.util.indexing.AbstractXtextIndex;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@Singleton
@SuppressWarnings("all")
public class DemIndex extends AbstractXtextIndex {
  @Inject
  private IQualifiedNameProvider qualifiedNameProvider;
  
  private final DemPackage DEM = DemPackage.eINSTANCE;
  
  protected Iterable<IEObjectDescription> getVisibleDomainEventDescriptions(final EObject context, final QualifiedName domainName) {
    final Function1<IEObjectDescription, Boolean> _function = (IEObjectDescription it) -> {
      return Boolean.valueOf(it.getName().startsWith(domainName));
    };
    return IterableExtensions.<IEObjectDescription>filter(this.getVisibleEObjectDescriptions(context, this.DEM.getDemDomainEvent()), _function);
  }
  
  /**
   * Returns the DemDomainEvents of the given domain. Considers include and exclude lists.
   */
  public List<DemDomainEvent> eventsOfDomain(final DemEventsOverviewModel model) {
    boolean _isEmpty = model.getInclude().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      return model.getInclude();
    }
    final DNamespace container = EcoreUtil2.<DNamespace>getContainerOfType(model, DNamespace.class);
    final QualifiedName qualifiedDomainName = this.qualifiedNameProvider.getFullyQualifiedName(container);
    final Iterable<IEObjectDescription> allEventDescriptions = this.getVisibleDomainEventDescriptions(model, qualifiedDomainName);
    final ArrayList<DemDomainEvent> events = Lists.<DemDomainEvent>newArrayList();
    for (final IEObjectDescription desc : allEventDescriptions) {
      {
        DemDomainEvent event = this.<DemDomainEvent>resolveEObjectDescription(model, desc, DemDomainEvent.class);
        if ((event != null)) {
          events.add(event);
        }
      }
    }
    boolean _isEmpty_1 = model.getExclude().isEmpty();
    boolean _not_1 = (!_isEmpty_1);
    if (_not_1) {
      events.removeAll(model.getExclude());
    }
    return events;
  }
}
