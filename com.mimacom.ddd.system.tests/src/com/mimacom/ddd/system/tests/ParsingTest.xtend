package com.mimacom.ddd.system.tests

import com.google.inject.Inject
import com.google.inject.Provider
import com.mimacom.ddd.dm.base.DInformationModel
import com.mimacom.ddd.dm.base.DNamespace
import com.mimacom.ddd.dm.dmx.DmxModel
import com.mimacom.ddd.dm.dmx.tests.DmxInjectorProvider
import java.net.URL
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static org.junit.jupiter.api.Assertions.*

/**
 * Provides integration tests for system test files.
 */
@ExtendWith(InjectionExtension)
@InjectWith(SystemTestInjectorProvider)
class ParsingTest {

  static val PATH_PREFIX = "platform:/plugin/com.mimacom.ddd.system/src/com/mimacom/ddd/system/"

  // files of a referenced OSGi bundle are loaded, hence test is executed as a plug-in test
  static val ASSIGNMENTS_URI = URI.createURI('''«PATH_PREFIX»/Assignments.dmx''')
  static val BASE_TYPES_URI = URI.createURI('''«PATH_PREFIX»/BaseTypes.dim''')
  static val CUSTOM_TYPES_URI = URI.createURI('''«PATH_PREFIX»/CustomTypes.dim''')
  static val MATH_FUNCTIONS_URI = URI.createURI('''«PATH_PREFIX»/MathFunctions.dmx''')
  static val SYSTEM_FUNCTIONS_URI = URI.createURI('''«PATH_PREFIX»/SystemFunctions.dmx''')
  static val SYSTEM_TYPES_URI = URI.createURI('''«PATH_PREFIX»/SystemTypes.dmx''')

  // by default the parse helper injected is that of the "primary" injector returned by the injector provider
  @Inject
  ParseHelper<DNamespace> dimParseHelper

  var XtextResourceSet resourceSet = null

  @Inject Provider<XtextResourceSet> resourceSetProvider

  @BeforeEach
  def void init() {
    resourceSet = resourceSetProvider.get
  }

  @Test
  def void parseBaseTypes() {
    val content = dimParseHelper.parse(new URL(BASE_TYPES_URI.toString).openStream, BASE_TYPES_URI, null, resourceSet)
    assertNotNull(content)
    assertTrue(content.model instanceof DInformationModel)
    assertNoErrorsOnResource(content.eResource)
  }

  @Test
  def void parseSystemFunctions() {
    val injector = new DmxInjectorProvider().injector
    val dmxParseHelper = injector.getInstance(ParseHelper)
    val content = dmxParseHelper.parse(new URL(SYSTEM_FUNCTIONS_URI.toString).openStream, SYSTEM_FUNCTIONS_URI, null,
      resourceSet)
    assertNotNull(content)
    assertTrue(content instanceof DNamespace)
    assertTrue((content as DNamespace).model instanceof DmxModel)
    assertNoErrorsOnResource(content.eResource)
  }

  @Test
  def void parseAssignments() {
    val injector = new DmxInjectorProvider().injector
    val dmxParseHelper = injector.getInstance(ParseHelper)
    val content = dmxParseHelper.parse(new URL(ASSIGNMENTS_URI.toString).openStream, ASSIGNMENTS_URI, null,
      resourceSet)
    assertNotNull(content)
    assertTrue(content instanceof DNamespace)
    assertTrue((content as DNamespace).model instanceof DmxModel)
    assertNoErrorsOnResource(content.eResource)
  }

  @Test
  def void parseCustomTypes() {
    val content = dimParseHelper.parse(new URL(CUSTOM_TYPES_URI.toString).openStream, CUSTOM_TYPES_URI, null,
      resourceSet)
    assertNotNull(content)
    assertTrue(content.model instanceof DInformationModel)
    assertNoErrorsOnResource(content.eResource)
  }

  @Test
  def void parseMathFunctions() {
    val injector = new DmxInjectorProvider().injector
    val dmxParseHelper = injector.getInstance(ParseHelper)
    val content = dmxParseHelper.parse(new URL(MATH_FUNCTIONS_URI.toString).openStream, MATH_FUNCTIONS_URI, null,
      resourceSet)
    assertNotNull(content)
    assertTrue(content instanceof DNamespace)
    assertTrue((content as DNamespace).model instanceof DmxModel)
    assertNoErrorsOnResource(content.eResource)
  }

  @Test
  def void parseSystemTypes() {
    val injector = new DmxInjectorProvider().injector
    val dmxParseHelper = injector.getInstance(ParseHelper)
    val content = dmxParseHelper.parse(new URL(SYSTEM_TYPES_URI.toString).openStream, SYSTEM_TYPES_URI, null,
      resourceSet)
    assertNotNull(content)
    assertTrue(content instanceof DNamespace)
    assertTrue((content as DNamespace).model instanceof DmxModel)
    assertNoErrorsOnResource(content.eResource)
  }
  
  def void assertNoErrorsOnResource(Resource resource) {
    val errors = resource.errors
    if (!errors.empty) {
      fail(String.format("%d errors, none expected: %s", errors.size, errors.map[it | it.message].join(", "))) 
    }
  }

}
