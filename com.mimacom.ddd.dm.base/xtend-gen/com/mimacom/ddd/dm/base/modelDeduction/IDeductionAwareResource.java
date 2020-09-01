package com.mimacom.ddd.dm.base.modelDeduction;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;

@SuppressWarnings("all")
public interface IDeductionAwareResource {
  public abstract EObject deduceTargetObject(final QualifiedName sourceObjectQN, final EObject objectContext);
}
