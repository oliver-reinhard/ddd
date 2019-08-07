package com.mimacom.ddd.dm.dmx.indexing;

import com.mimacom.ddd.dm.base.DDomain;
import com.mimacom.ddd.dm.base.DEntityType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

@SuppressWarnings("all")
public class DmxQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
  /**
   * Qualified name of root entity types = {Domain.name, type.name} instead of fully qualified by containment hierarchy including Aggregate.
   */
  @Override
  public QualifiedName getFullyQualifiedName(final EObject obj) {
    if ((obj instanceof DEntityType)) {
      boolean _isRoot = ((DEntityType)obj).isRoot();
      if (_isRoot) {
        final DDomain domain = EcoreUtil2.<DDomain>getContainerOfType(obj, DDomain.class);
        if (((domain != null) && (((DEntityType)obj).getName() != null))) {
          final QualifiedName domainQN = this.computeFullyQualifiedName(domain);
          final QualifiedName rootQN = domainQN.append(((DEntityType)obj).getName());
          return rootQN;
        }
      }
    }
    return super.getFullyQualifiedName(obj);
  }
}
