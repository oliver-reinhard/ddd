package com.mimacom.ddd.dm.base.plantuml;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.TypesUtil;
import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.base.base.DType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class TypeDiagramTextProviderUtil {
  @Inject
  @Extension
  private TypesUtil _typesUtil;
  
  public CharSequence typeName(final DType t) {
    StringConcatenation _builder = new StringConcatenation();
    String _xifexpression = null;
    EObject _eContainer = t.eContainer();
    if ((_eContainer instanceof DAggregate)) {
      _xifexpression = this._typesUtil.aggregateName(t);
    }
    _builder.append(_xifexpression);
    _builder.append(".");
    String _name = t.getName();
    _builder.append(_name);
    return _builder;
  }
  
  public CharSequence targetName(final DType source, final DType target) {
    String _modelName = this._typesUtil.modelName(source);
    String _modelName_1 = this._typesUtil.modelName(target);
    boolean _equals = Objects.equal(_modelName, _modelName_1);
    if (_equals) {
      String _aggregateName = this._typesUtil.aggregateName(source);
      String _aggregateName_1 = this._typesUtil.aggregateName(target);
      boolean _equals_1 = Objects.equal(_aggregateName, _aggregateName_1);
      if (_equals_1) {
        return this.typeName(target);
      }
      return this._typesUtil.aggregateName(target);
    }
    return this._typesUtil.modelName(target);
  }
}
