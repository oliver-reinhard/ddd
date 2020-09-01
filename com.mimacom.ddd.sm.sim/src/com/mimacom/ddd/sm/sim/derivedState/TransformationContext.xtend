package com.mimacom.ddd.sm.sim.derivedState

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.google.inject.Singleton
import com.mimacom.ddd.dm.base.BaseFactory
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.base.modelDeduction.DeductionHelper
import com.mimacom.ddd.sm.sim.indexing.SimIndex
import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.impl.BasicEObjectImpl
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.nodemodel.ICompositeNode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.resource.IEObjectDescription

@Singleton
class TransformationContext {

	static val LOGGER = Logger.getLogger(TransformationContext);
	static val BASE = BaseFactory.eINSTANCE

	@Inject SimIndex index

	@Inject	IQualifiedNameProvider qualifiedNameProvider;

	new() {
		LOGGER.level = Level.DEBUG
	}
	def DType getSystemTypeProxy(EObject context, DType domainType) {
//		var dType = domainType as EObject
//		if (domainType.eIsProxy) {
//			dType = context.eResource.resourceSet.getEObject((domainType as InternalEObject).eProxyURI, true)
//		}
		val domainTypeQN = qualifiedNameProvider.getFullyQualifiedName(domainType)
		val resourceURI = context.eResource.URI
		val uri = URI.createURI(resourceURI.toString + "#" + DeductionHelper.getDeductionProxyUriFragment(domainTypeQN))
		val systemType = BASE.createDPrimitive()
		(systemType as BasicEObjectImpl).eSetProxyURI(uri)
		if (LOGGER.level.isGreaterOrEqual(Level.DEBUG)) {
			LOGGER.debug("getSystemTypeProxy for " + domainTypeQN + " -> " + uri)
		}
		return systemType
	}

	/*
	 * @return  null if no system type is found for the given domain type.
	 */
	def Iterable<IEObjectDescription> getSystemTypeDescriptions(EObject context, QualifiedName domainTypeQN) {
		if (domainTypeQN === null) {
			throw new NullPointerException("context: " + context.toString)
		}
		val Iterable<IEObjectDescription> typeDeductionDescriptions = index.
			getVisibleSTypeMappingDescriptions(context, domainTypeQN)
		val sTypes = Lists.newArrayList
		for (desc : typeDeductionDescriptions) {
			val systemTypeQN = DeductionHelper.getDeductionTargetQN(desc)
			sTypes.addAll(index.getVisibleDTypeDescriptions(context, systemTypeQN));
		}
		if (LOGGER.level.isGreaterOrEqual(Level.DEBUG)) {
			LOGGER.debug("getSystemTypeDescriptions for " + domainTypeQN + " -> " + sTypes)
		}
		return sTypes
	}
}
