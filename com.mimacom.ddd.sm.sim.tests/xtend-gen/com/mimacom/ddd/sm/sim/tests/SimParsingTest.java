/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim.tests;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.mimacom.ddd.dm.base.DDomain;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.tests.SimInjectorProvider;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(SimInjectorProvider.class)
@SuppressWarnings("all")
public class SimParsingTest {
  @Inject
  private ParseHelper<DDomain> dmParseHelper;
  
  @Inject
  private ParseHelper<SInformationModel> smParseHelper;
  
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  @Test
  public void grabArchetype() {
    try {
      final ResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("domain DM");
      _builder.newLine();
      _builder.append("archetype DT { }");
      _builder.newLine();
      final DDomain dm = this.dmParseHelper.parse(_builder, resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("base information model SM");
      _builder_1.newLine();
      _builder_1.append("grab primitive DM.DT as ST ");
      _builder_1.newLine();
      final SInformationModel sm = this.smParseHelper.parse(_builder_1, resourceSet);
      Assertions.assertNotNull(dm);
      final EList<Resource.Diagnostic> dmErrors = dm.eResource().getErrors();
      boolean _isEmpty = dmErrors.isEmpty();
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("Unexpected errors in dm: ");
      String _join = IterableExtensions.join(dmErrors, ", ");
      _builder_2.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_2.toString());
      Assertions.assertNotNull(sm);
      final EList<Resource.Diagnostic> smErrors = sm.eResource().getErrors();
      boolean _isEmpty_1 = smErrors.isEmpty();
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("Unexpected errors in sm: ");
      String _join_1 = IterableExtensions.join(smErrors, ", ");
      _builder_3.append(_join_1);
      Assertions.assertTrue(_isEmpty_1, _builder_3.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
