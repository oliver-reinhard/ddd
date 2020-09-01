package com.mimacom.ddd.dm.base.modelDeduction

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.QualifiedName

interface IDeductionAwareResource {

	def EObject deduceTargetObject(QualifiedName sourceObjectQN, EObject objectContext)
}
