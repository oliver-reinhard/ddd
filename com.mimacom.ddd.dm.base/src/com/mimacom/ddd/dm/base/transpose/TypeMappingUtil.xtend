package com.mimacom.ddd.dm.base.transpose

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.google.inject.Singleton
import com.mimacom.ddd.dm.base.base.BaseFactory
import com.mimacom.ddd.dm.base.base.DType
import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.impl.BasicEObjectImpl
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IEObjectDescription

@Singleton
class TypeMappingUtil {

	static val LOGGER = Logger.getLogger(TypeMappingUtil);
	static val BASE = BaseFactory.eINSTANCE

	@Inject TransposeIndex index

	@Inject	IQualifiedNameProvider qualifiedNameProvider;

	new() {
		LOGGER.level = Level.DEBUG
	}
	
	/**
	 * Returns a proxy object with a URL that will resolve to the actual system type by ways of the SimIndex.
	 * 
	 * @param context used to derive the relevant eResource.
	 * @return null if context is null or domainType has no fully qualified name
	 */
	def DType getSystemTypeProxy(EObject context, DType domainType) {
		val domainTypeQN = qualifiedNameProvider.getFullyQualifiedName(domainType)
		if (context === null || domainTypeQN === null) {
			return null
		}
		val resourceURI = context.eResource.URI
		val uri = URI.createURI(resourceURI.toString + "#" + TransposeUtil.getDeductionProxyUriFragment(domainTypeQN))
		val systemType = BASE.createDPrimitive() // any concrete DType will do here
		(systemType as BasicEObjectImpl).eSetProxyURI(uri)
		if (LOGGER.level.isGreaterOrEqual(Level.DEBUG)) {
			LOGGER.debug("getSystemTypeProxy for " + domainTypeQN + " -> " + uri)
		}
		return systemType
	}

	/**
	 * Returns the descriptions of all visible mapped types for a domain type given by its qualified name.
	 * 
	 * @param context used to derive the relevant eResource.
	 * @param domainTypeQN cannot be null
	 * @return never null but may be an empty collection.
	 */
	def Iterable<IEObjectDescription> getSystemTypeDescriptions(EObject context, QualifiedName domainTypeQN) {
		if (domainTypeQN === null) {
			throw new NullPointerException("context: " + context.toString)
		}
		val Iterable<IEObjectDescription> typeDeductionDescriptions = index.
			getVisibleTTypeMappingDescriptions(context, domainTypeQN)
		val sTypes = Lists.newArrayList
		for (desc : typeDeductionDescriptions) {
			val systemTypeQN = TransposeUtil.getDeductionTargetQN(desc)
			sTypes.addAll(index.getVisibleDTypeDescriptions(context, systemTypeQN));
		}
		if (LOGGER.level.isGreaterOrEqual(Level.DEBUG)) {
			LOGGER.debug("getSystemTypeDescriptions for " + domainTypeQN + " -> " + sTypes)
		}
		return sTypes
	}
}
