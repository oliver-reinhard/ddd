package com.mimacom.ddd.dm.base.transpose

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.google.inject.Singleton
import com.mimacom.ddd.dm.base.base.DType
import com.mimacom.ddd.dm.base.synthetic.SyntheticFactory
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
	static val SYNTHETIC = SyntheticFactory.eINSTANCE

	@Inject TransposeIndex index

	@Inject	IQualifiedNameProvider qualifiedNameProvider;

	new() {
		LOGGER.level = Level.DEBUG
	}
	
	/**
	 * Returns a proxy object with a URL that will resolve to the actual system type by ways of the TransposeIndex.
	 * 
	 * @param context used to derive the relevant eResource.
	 * @return null if context is null or domainType has no fully qualified name
	 */
	def DType getTransposedTypeProxy(EObject context, DType sourceType) {
		val sourceTypeQN = qualifiedNameProvider.getFullyQualifiedName(sourceType)
		if (context === null || sourceTypeQN === null) {
			return null
		}
		val resourceURI = context.eResource.URI
		val uri = URI.createURI(resourceURI.toString + "#" + TranspositionUtil.getTransposedTypeProxyUriFragment(sourceTypeQN))
		val proxy = SYNTHETIC.createTSyntheticPrimitive() // any concrete DType will do here
		(proxy as BasicEObjectImpl).eSetProxyURI(uri)
		if (LOGGER.level.isGreaterOrEqual(Level.DEBUG)) {
			LOGGER.debug("getSystemTypeProxy for " + sourceTypeQN + " -> " + uri)
		}
		return proxy
	}

	/**
	 * Returns the descriptions of all visible mapped types for a domain type given by its qualified name.
	 * 
	 * @param context used to derive the relevant eResource.
	 * @param sourceTypeQN cannot be null
	 * @return never null but may be an empty collection.
	 */
	def Iterable<IEObjectDescription> getTransposedTypeDescriptions(EObject context, QualifiedName sourceTypeQN) {
		if (sourceTypeQN === null) {
			throw new NullPointerException("context: " + context.toString)
		}
		val Iterable<IEObjectDescription> transposedTypeDescriptions = index.
			getVisibleTTypeMappingDescriptions(context, sourceTypeQN)
		val typeDescriptions = Lists.newArrayList
		for (desc : transposedTypeDescriptions) {
			val systemTypeQN = TranspositionUtil.getTranspositionTargetQN(desc)
			typeDescriptions.addAll(index.getVisibleDTypeDescriptions(context, systemTypeQN));
		}
		if (LOGGER.level.isGreaterOrEqual(Level.DEBUG)) {
			LOGGER.debug("getSystemTypeDescriptions for " + sourceTypeQN + " -> " + typeDescriptions)
		}
		return typeDescriptions
	}
}
