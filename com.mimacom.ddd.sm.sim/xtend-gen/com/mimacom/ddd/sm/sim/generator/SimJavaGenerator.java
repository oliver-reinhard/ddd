package com.mimacom.ddd.sm.sim.generator;

import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.dmx.scoping.DmxQualifiedNameProvider;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SInformationModelKind;
import com.mimacom.ddd.sm.sim.generator.dto.EntityDtoGenerator;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class SimJavaGenerator extends AbstractGenerator {
  @Inject
  private DmxQualifiedNameProvider qualifiedNameProvider;
  
  @Inject
  private EntityDtoGenerator entityDtoGenerator;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final SInformationModel model = IteratorExtensions.<SInformationModel>head(Iterators.<SInformationModel>filter(resource.getAllContents(), SInformationModel.class));
    if ((model != null)) {
      this.generateForCoreInformationModel(model, fsa);
    }
  }
  
  private void generateForCoreInformationModel(final SInformationModel model, final IFileSystemAccess2 fsa) {
    boolean _not = (!((model != null) && (model.getKind() == SInformationModelKind.CORE)));
    if (_not) {
      return;
    }
    final Consumer<DType> _function = (DType it) -> {
      this.generateDtoForType(it, fsa);
    };
    model.getTypes().forEach(_function);
  }
  
  private void _generateDtoForType(final DEntityType entity, final IFileSystemAccess2 fsa) {
    final String packageName = this.<DEntityType>getPackageName(entity).toLowerCase();
    String _xifexpression = null;
    boolean _contains = packageName.contains(".");
    if (_contains) {
      _xifexpression = (packageName + ".");
    } else {
      _xifexpression = "";
    }
    String _firstUpper = StringExtensions.toFirstUpper(entity.getName());
    String _plus = (_xifexpression + _firstUpper);
    final String className = (_plus + "Dto");
    StringConcatenation _builder = new StringConcatenation();
    String _replaceAll = className.replaceAll("\\.", "/");
    _builder.append(_replaceAll);
    _builder.append(".java");
    final String fileName = _builder.toString();
    final CharSequence content = this.entityDtoGenerator.generateBody(entity, className);
    fsa.generateFile(fileName, content);
  }
  
  private void _generateDtoForType(final DType entity, final IFileSystemAccess2 fsa) {
  }
  
  private <T extends EObject> String getPackageName(final T object) {
    final List<String> segments = this.qualifiedNameProvider.getFullyQualifiedName(object).getSegments();
    if ((segments.isEmpty() || (segments.size() == 1))) {
      return "";
    }
    int _size = segments.size();
    int _minus = (_size - 1);
    final String result = IterableExtensions.join(segments.subList(0, _minus), ".");
    return result;
  }
  
  private void generateDtoForType(final DType entity, final IFileSystemAccess2 fsa) {
    if (entity instanceof DEntityType) {
      _generateDtoForType((DEntityType)entity, fsa);
      return;
    } else if (entity != null) {
      _generateDtoForType(entity, fsa);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(entity, fsa).toString());
    }
  }
}
