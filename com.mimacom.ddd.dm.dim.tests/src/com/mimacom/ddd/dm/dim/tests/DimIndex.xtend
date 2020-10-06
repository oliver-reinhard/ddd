package com.mimacom.ddd.dm.dim.tests

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.BasePackage
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider

class DimIndex {
	@Inject ResourceDescriptionsProvider rdp

  def getResourceDescription(EObject o) {
    val index = rdp.getResourceDescriptions(o.eResource)
    index.getResourceDescription(o.eResource.URI)
  }

  def getExportedEObjectDescriptions(EObject o) {
    o.getResourceDescription.getExportedObjects
  }
  
def getExportedClassesEObjectDescriptions(EObject o) {
    o.getResourceDescription.
      getExportedObjectsByType(BasePackage.eINSTANCE.DComplexType)
  }
}