package com.mimacom.ddd.system.tests;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import com.mimacom.ddd.dm.base.DDomain;
import com.mimacom.ddd.dm.dmx.tests.DmxInjectorProvider;
import com.mimacom.ddd.system.tests.SystemTestInjectorProvider;
import java.net.URL;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * Provides integration tests for system test files.
 */
@ExtendWith(InjectionExtension.class)
@InjectWith(SystemTestInjectorProvider.class)
@SuppressWarnings("all")
public class ParsingTest {
  private static final String PATH_PREFIX = "platform:/plugin/com.mimacom.ddd.system/src/com/mimacom/ddd/system/";
  
  private static final URI ASSIGNMENTS_URI = new Function0<URI>() {
    @Override
    public URI apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(ParsingTest.PATH_PREFIX);
      _builder.append("/Assignments.dmx");
      URI _createURI = URI.createURI(_builder.toString());
      return _createURI;
    }
  }.apply();
  
  private static final URI BASE_TYPES_URI = new Function0<URI>() {
    @Override
    public URI apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(ParsingTest.PATH_PREFIX);
      _builder.append("/BaseTypes.dim");
      URI _createURI = URI.createURI(_builder.toString());
      return _createURI;
    }
  }.apply();
  
  private static final URI CUSTOM_TYPES_URI = new Function0<URI>() {
    @Override
    public URI apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(ParsingTest.PATH_PREFIX);
      _builder.append("/CustomTypes.dim");
      URI _createURI = URI.createURI(_builder.toString());
      return _createURI;
    }
  }.apply();
  
  private static final URI MATH_FUNCTIONS_URI = new Function0<URI>() {
    @Override
    public URI apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(ParsingTest.PATH_PREFIX);
      _builder.append("/MathFunctions.dmx");
      URI _createURI = URI.createURI(_builder.toString());
      return _createURI;
    }
  }.apply();
  
  private static final URI SYSTEM_FUNCTIONS_URI = new Function0<URI>() {
    @Override
    public URI apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(ParsingTest.PATH_PREFIX);
      _builder.append("/SystemFunctions.dmx");
      URI _createURI = URI.createURI(_builder.toString());
      return _createURI;
    }
  }.apply();
  
  private static final URI SYSTEM_TYPES_URI = new Function0<URI>() {
    @Override
    public URI apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(ParsingTest.PATH_PREFIX);
      _builder.append("/SystemTypes.dmx");
      URI _createURI = URI.createURI(_builder.toString());
      return _createURI;
    }
  }.apply();
  
  @Inject
  private ParseHelper<DDomain> dimParseHelper;
  
  private XtextResourceSet resourceSet = null;
  
  @Inject
  private Provider<XtextResourceSet> resourceSetProvider;
  
  @BeforeEach
  public void init() {
    this.resourceSet = this.resourceSetProvider.get();
  }
  
  @Test
  public void parseBaseTypes() {
    try {
      String _string = ParsingTest.BASE_TYPES_URI.toString();
      final DDomain content = this.dimParseHelper.parse(new URL(_string).openStream(), ParsingTest.BASE_TYPES_URI, null, this.resourceSet);
      Assertions.assertNotNull(content);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseSystemFunctions() {
    try {
      final Injector injector = new DmxInjectorProvider().getInjector();
      final ParseHelper dmxParseHelper = injector.<ParseHelper>getInstance(ParseHelper.class);
      String _string = ParsingTest.SYSTEM_FUNCTIONS_URI.toString();
      final EObject content = dmxParseHelper.parse(new URL(_string).openStream(), ParsingTest.SYSTEM_FUNCTIONS_URI, null, 
        this.resourceSet);
      Assertions.assertNotNull(content);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseAssignments() {
    try {
      final Injector injector = new DmxInjectorProvider().getInjector();
      final ParseHelper dmxParseHelper = injector.<ParseHelper>getInstance(ParseHelper.class);
      String _string = ParsingTest.ASSIGNMENTS_URI.toString();
      final EObject content = dmxParseHelper.parse(new URL(_string).openStream(), ParsingTest.ASSIGNMENTS_URI, null, 
        this.resourceSet);
      Assertions.assertNotNull(content);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseCustomTypes() {
    try {
      String _string = ParsingTest.CUSTOM_TYPES_URI.toString();
      final DDomain content = this.dimParseHelper.parse(new URL(_string).openStream(), ParsingTest.CUSTOM_TYPES_URI, null, 
        this.resourceSet);
      Assertions.assertNotNull(content);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseMathFunctions() {
    try {
      final Injector injector = new DmxInjectorProvider().getInjector();
      final ParseHelper dmxParseHelper = injector.<ParseHelper>getInstance(ParseHelper.class);
      String _string = ParsingTest.MATH_FUNCTIONS_URI.toString();
      final EObject content = dmxParseHelper.parse(new URL(_string).openStream(), ParsingTest.MATH_FUNCTIONS_URI, null, 
        this.resourceSet);
      Assertions.assertNotNull(content);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseSystemTypes() {
    try {
      final Injector injector = new DmxInjectorProvider().getInjector();
      final ParseHelper dmxParseHelper = injector.<ParseHelper>getInstance(ParseHelper.class);
      String _string = ParsingTest.SYSTEM_TYPES_URI.toString();
      final EObject content = dmxParseHelper.parse(new URL(_string).openStream(), ParsingTest.SYSTEM_TYPES_URI, null, 
        this.resourceSet);
      Assertions.assertNotNull(content);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
