package com.mimacom.ddd.pub.pub.indexing;

import com.mimacom.ddd.pub.pub.Component;
import com.mimacom.ddd.pub.pub.ReferenceTarget;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

@SuppressWarnings("all")
public class PubQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
  /**
   * Qualified name of objects implementing ReferenceTarget = {Component.name, obj.name} instead of fully qualified by containment hierarchy.
   */
  @Override
  public QualifiedName getFullyQualifiedName(final EObject obj) {
    if ((obj instanceof ReferenceTarget)) {
      if (((((ReferenceTarget)obj).getName() != null) && (((ReferenceTarget)obj).getName().length() > 0))) {
        final Component compo = EcoreUtil2.<Component>getContainerOfType(obj, Component.class);
        if (((compo != null) && (((ReferenceTarget)obj).getName() != null))) {
          final QualifiedName compoQN = this.computeFullyQualifiedName(compo);
          if ((obj instanceof Component)) {
            return compoQN;
<<<<<<< HEAD
          } else {
            if ((compoQN != null)) {
              final QualifiedName rootQN = compoQN.append(((ReferenceTarget)obj).getName());
              return rootQN;
            }
          }
          return null;
=======
          }
          final QualifiedName rootQN = compoQN.append(((ReferenceTarget)obj).getName());
          return rootQN;
>>>>>>> refs/remotes/origin/master
        }
      }
    }
    return super.getFullyQualifiedName(obj);
  }
}
