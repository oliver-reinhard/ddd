package com.mimacom.ddd.sm.sim.generator;

import com.google.common.collect.Iterators;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.sm.sim.SAggregateDeduction;
import com.mimacom.ddd.sm.sim.SInformationModel;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class SimJavaGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final SInformationModel model = IteratorExtensions.<SInformationModel>head(Iterators.<SInformationModel>filter(resource.getAllContents(), SInformationModel.class));
    if ((model != null)) {
      final Function1<DAggregate, Boolean> _function = (DAggregate it) -> {
        return Boolean.valueOf((!(it instanceof SAggregateDeduction)));
      };
      final List<DAggregate> aggregates = IterableExtensions.<DAggregate>toList(IterableExtensions.<DAggregate>filter(EcoreUtil2.<DAggregate>getAllContentsOfType(model, DAggregate.class), _function));
      final Consumer<DAggregate> _function_1 = (DAggregate it) -> {
        this.generateForAggregate(it, fsa);
      };
      aggregates.forEach(_function_1);
    }
  }
  
  private void generateForAggregate(final DAggregate aggregate, final IFileSystemAccess2 fsa) {
    String _name = aggregate.getName();
    String _plus = (_name + ".java");
    fsa.generateFile(_plus, aggregate.getName());
  }
}
