package com.mimacom.ddd.sm.sim.plantuml;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.base.base.DAssociation;
import com.mimacom.ddd.dm.base.base.DAssociationKind;
import com.mimacom.ddd.dm.base.base.DAttribute;
import com.mimacom.ddd.dm.base.base.DComplexType;
import com.mimacom.ddd.dm.base.base.DDetailType;
import com.mimacom.ddd.dm.base.base.DEntityNature;
import com.mimacom.ddd.dm.base.base.DEntityType;
import com.mimacom.ddd.dm.base.base.DEnumeration;
import com.mimacom.ddd.dm.base.base.DFeature;
import com.mimacom.ddd.dm.base.base.DLiteral;
import com.mimacom.ddd.dm.base.base.DPrimitive;
import com.mimacom.ddd.dm.base.base.DQuery;
import com.mimacom.ddd.dm.base.base.DQueryParameter;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.transpose.ITransposition;
import com.mimacom.ddd.dm.base.transpose.TAggregateTransposition;
import com.mimacom.ddd.dm.base.transpose.TAssociationTransposition;
import com.mimacom.ddd.dm.base.transpose.TAttributeTransposition;
import com.mimacom.ddd.dm.base.transpose.TComplexTypeTransposition;
import com.mimacom.ddd.dm.base.transpose.TFeatureTransposition;
import com.mimacom.ddd.dm.base.transpose.TTypeTransposition;
import com.mimacom.ddd.sm.sim.SimUtil;
import com.mimacom.ddd.sm.sim.SystemInformationModel;
import com.mimacom.ddd.util.plantuml.IPlantUmlDiagramTextProvider;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SimTypeDiagramTextProviderImpl implements IPlantUmlDiagramTextProvider<SystemInformationModel> {
  @Inject
  @Extension
  private SimUtil _simUtil;
  
  @Override
  public boolean canProvide(final SystemInformationModel model) {
    return ((model != null) && (!(IterableExtensions.isEmpty(IterableExtensions.<DType>filter(model.getTypes(), ((Function1<DType, Boolean>) (DType it) -> {
      return Boolean.valueOf((!(it instanceof ITransposition)));
    }))) && IterableExtensions.isEmpty(IterableExtensions.<DAggregate>filter(model.getAggregates(), ((Function1<DAggregate, Boolean>) (DAggregate it) -> {
      return Boolean.valueOf((!(it instanceof ITransposition)));
    }))))));
  }
  
  @Override
  public String diagramText(final SystemInformationModel model) {
    final Function1<DAggregate, Boolean> _function = (DAggregate it) -> {
      return Boolean.valueOf((!(it instanceof TAggregateTransposition)));
    };
    final Iterable<DAggregate> allAggregates = IterableExtensions.<DAggregate>filter(EcoreUtil2.<DAggregate>eAllOfType(model, DAggregate.class), _function);
    final Function1<DAssociation, Boolean> _function_1 = (DAssociation it) -> {
      return Boolean.valueOf((!(it instanceof TAssociationTransposition)));
    };
    final Iterable<DAssociation> allAssociations = IterableExtensions.<DAssociation>filter(EcoreUtil2.<DAssociation>eAllOfType(model, DAssociation.class), _function_1);
    final Function1<DAssociation, Boolean> _function_2 = (DAssociation it) -> {
      String _modelName = this._simUtil.modelName(it.getTargetType());
      String _name = model.getName();
      return Boolean.valueOf((!Objects.equal(_modelName, _name)));
    };
    final Function1<DAssociation, String> _function_3 = (DAssociation it) -> {
      return this._simUtil.modelName(it.getTargetType());
    };
    final Iterable<String> allReferencedDomains = IterableExtensions.<DAssociation, String>map(IterableExtensions.<DAssociation>filter(allAssociations, _function_2), _function_3);
    final Function1<DAttribute, Boolean> _function_4 = (DAttribute it) -> {
      return Boolean.valueOf(((!(it instanceof TAttributeTransposition)) && (!(it.eContainer() instanceof TComplexTypeTransposition))));
    };
    final Iterable<DAttribute> allComplexAttributes = IterableExtensions.<DAttribute>filter(EcoreUtil2.<DAttribute>eAllOfType(model, DAttribute.class), _function_4);
    final Function1<DComplexType, Boolean> _function_5 = (DComplexType it) -> {
      DComplexType _superType = it.getSuperType();
      return Boolean.valueOf((_superType != null));
    };
    final Iterable<DComplexType> allSubtypes = IterableExtensions.<DComplexType>filter(EcoreUtil2.<DComplexType>eAllOfType(model, DComplexType.class), _function_5);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@startuml");
    _builder.newLine();
    _builder.append("hide empty members");
    _builder.newLine();
    _builder.newLine();
    _builder.append("skinparam class {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ArrowColor MediumBlue");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("BorderColor MediumBlue");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("BackgroundColor AliceBlue");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("skinparam package {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("BorderColor MediumBlue");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FontColor MediumBlue");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      boolean _isEmpty = model.getTypes().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\' all domain-level types");
        _builder.newLine();
        {
          final Function1<DType, Boolean> _function_6 = (DType it) -> {
            return Boolean.valueOf((!(it instanceof TTypeTransposition)));
          };
          Iterable<DType> _filter = IterableExtensions.<DType>filter(model.getTypes(), _function_6);
          for(final DType t : _filter) {
            CharSequence _generateType = this.generateType(t);
            _builder.append(_generateType);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("\' all aggregates");
    _builder.newLine();
    {
      for(final DAggregate a : allAggregates) {
        _builder.append("package ");
        String _aggregateName = this._simUtil.aggregateName(a);
        _builder.append(_aggregateName);
        _builder.append(" <<Rectangle>> {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          boolean _isEmpty_1 = a.getFeatures().isEmpty();
          boolean _not_1 = (!_isEmpty_1);
          if (_not_1) {
            CharSequence _generateAggregateQueries = this.generateAggregateQueries(a);
            _builder.append(_generateAggregateQueries, "\t");
          }
        }
        _builder.newLineIfNotEmpty();
        {
          final Function1<DType, Boolean> _function_7 = (DType it) -> {
            return Boolean.valueOf((!(it instanceof TTypeTransposition)));
          };
          Iterable<DType> _filter_1 = IterableExtensions.<DType>filter(a.getTypes(), _function_7);
          for(final DType t_1 : _filter_1) {
            _builder.append("\t");
            CharSequence _generateType_1 = this.generateType(t_1);
            _builder.append(_generateType_1, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("\' all referenced domains");
    _builder.newLine();
    {
      for(final String d : allReferencedDomains) {
        _builder.append("package ");
        _builder.append(d);
        _builder.append(" <<Frame>> { ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("\' all associations");
    _builder.newLine();
    {
      for(final DAssociation a_1 : allAssociations) {
        CharSequence _generateAssociation = this.generateAssociation(a_1);
        _builder.append(_generateAssociation);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\' all complex types\' attributes");
    _builder.newLine();
    {
      final Function1<DAttribute, Boolean> _function_8 = (DAttribute it) -> {
        DType _type = it.getType();
        return Boolean.valueOf((_type instanceof DDetailType));
      };
      Iterable<DAttribute> _filter_2 = IterableExtensions.<DAttribute>filter(allComplexAttributes, _function_8);
      for(final DAttribute a_2 : _filter_2) {
        CharSequence _generateLink = this.generateLink(a_2);
        _builder.append(_generateLink);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\' all subtypes");
    _builder.newLine();
    {
      for(final DComplexType s : allSubtypes) {
        String _aggregateName_1 = this._simUtil.aggregateName(s);
        _builder.append(_aggregateName_1);
        _builder.append(".");
        String _name = s.getName();
        _builder.append(_name);
        _builder.append(" --|> ");
        String _aggregateName_2 = this._simUtil.aggregateName(s.getSuperType());
        _builder.append(_aggregateName_2);
        {
          String _aggregateName_3 = this._simUtil.aggregateName(s);
          String _aggregateName_4 = this._simUtil.aggregateName(s.getSuperType());
          boolean _tripleEquals = (_aggregateName_3 == _aggregateName_4);
          if (_tripleEquals) {
            _builder.append(".");
            String _name_1 = s.getSuperType().getName();
            _builder.append(_name_1);
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("@enduml");
    _builder.newLine();
    final String result = _builder.toString();
    return result;
  }
  
  public CharSequence generateAggregateQueries(final DAggregate a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\' aggregate ");
    String _name = a.getName();
    _builder.append(_name);
    _builder.append(" static queries");
    _builder.newLineIfNotEmpty();
    _builder.append("abstract class ");
    String _name_1 = a.getName();
    _builder.append(_name_1);
    _builder.append(".");
    String _name_2 = a.getName();
    _builder.append(_name_2);
    _builder.append(" ");
    String _spot = this.spot(a);
    _builder.append(_spot);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<DFeature> _features = a.getFeatures();
      for(final DFeature q : _features) {
        CharSequence _generateStaticQuery = this.generateStaticQuery(((DQuery) q));
        _builder.append(_generateStaticQuery, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateType(final DComplexType c) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isAbstract = c.isAbstract();
      if (_isAbstract) {
        _builder.append("abstract ");
      }
    }
    _builder.append("class ");
    CharSequence _typeName = this.typeName(c);
    _builder.append(_typeName);
    _builder.append(" ");
    String _spot = this.spot(c);
    _builder.append(_spot);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      final Function1<DFeature, Boolean> _function = (DFeature it) -> {
        return Boolean.valueOf((!(it instanceof TFeatureTransposition)));
      };
      Iterable<DFeature> _filter = IterableExtensions.<DFeature>filter(c.getFeatures(), _function);
      for(final DFeature f : _filter) {
        CharSequence _generateFeature = this.generateFeature(f);
        _builder.append(_generateFeature, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateType(final DPrimitive p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    CharSequence _typeName = this.typeName(p);
    _builder.append(_typeName);
    _builder.append(" ");
    String _spot = this.spot(p);
    _builder.append(_spot);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateType(final DEnumeration e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("enum ");
    CharSequence _typeName = this.typeName(e);
    _builder.append(_typeName);
    _builder.append(" ");
    String _spot = this.spot(e);
    _builder.append(_spot);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<DLiteral> _literals = e.getLiterals();
      for(final DLiteral f : _literals) {
        _builder.append("\t");
        String _name = f.getName();
        _builder.append(_name, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateType(final DType t) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence generateStaticQuery(final DQuery q) {
    StringConcatenation _builder = new StringConcatenation();
    {
      DType _type = q.getType();
      boolean _tripleNotEquals = (_type != null);
      if (_tripleNotEquals) {
        _builder.append("{static} ");
        String _name = q.getName();
        _builder.append(_name);
        _builder.append("(");
        CharSequence _generateQueryParameters = this.generateQueryParameters(q);
        _builder.append(_generateQueryParameters);
        _builder.append(") : ");
        String _name_1 = q.getType().getName();
        _builder.append(_name_1);
        _builder.append(" ");
        String _multiplicityText = this._simUtil.multiplicityText(q, true);
        _builder.append(_multiplicityText);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateFeature(final DAttribute a) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _not = (!((a.getType() == null) || (a.getType() instanceof DDetailType)));
      if (_not) {
        String _name = a.getName();
        _builder.append(_name);
        _builder.append(" : ");
        String _name_1 = a.getType().getName();
        _builder.append(_name_1);
        _builder.append(" ");
        String _multiplicityText = this._simUtil.multiplicityText(a, false);
        _builder.append(_multiplicityText);
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateFeature(final DQuery q) {
    StringConcatenation _builder = new StringConcatenation();
    {
      DType _type = q.getType();
      boolean _tripleNotEquals = (_type != null);
      if (_tripleNotEquals) {
        String _name = q.getName();
        _builder.append(_name);
        _builder.append("(");
        CharSequence _generateQueryParameters = this.generateQueryParameters(q);
        _builder.append(_generateQueryParameters);
        _builder.append(") : ");
        String _name_1 = q.getType().getName();
        _builder.append(_name_1);
        _builder.append(" ");
        String _multiplicityText = this._simUtil.multiplicityText(q, true);
        _builder.append(_multiplicityText);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateFeature(final DAssociation a) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence generateQueryParameters(final DQuery q) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<DQueryParameter> _parameters = q.getParameters();
      boolean _hasElements = false;
      for(final DQueryParameter p : _parameters) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _name = p.getName();
        _builder.append(_name);
        _builder.append(":");
        String _name_1 = p.getType().getName();
        _builder.append(_name_1);
        _builder.append(" ");
        String _multiplicityText = this._simUtil.multiplicityText(p, true);
        _builder.append(_multiplicityText);
      }
    }
    return _builder;
  }
  
  public CharSequence generateAssociation(final DAssociation a) {
    String _name = a.getName();
    String _plus = (_name + " ");
    String _multiplicityText = this._simUtil.multiplicityText(a, false);
    final String targetLabel = (_plus + _multiplicityText);
    CharSequence _switchResult = null;
    DAssociationKind _kind = a.getKind();
    if (_kind != null) {
      switch (_kind) {
        case REFERENCE:
          EObject _eContainer = a.eContainer();
          _switchResult = this.generateLink("", ((DType) _eContainer), a.getType(), targetLabel, ">");
          break;
        case COMPOSITE:
          EObject _eContainer_1 = a.eContainer();
          _switchResult = this.generateLink("*", ((DType) _eContainer_1), a.getType(), targetLabel, ">");
          break;
        case INVERSE_COMPOSITE:
          EObject _eContainer_2 = a.eContainer();
          _switchResult = this.generateLink("}", ((DType) _eContainer_2), a.getType(), targetLabel, "*");
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  public CharSequence generateLink(final DAttribute a) {
    String _name = a.getName();
    String _plus = (_name + " ");
    String _multiplicityText = this._simUtil.multiplicityText(a, false);
    final String label = (_plus + _multiplicityText);
    EObject _eContainer = a.eContainer();
    return this.generateLink("+", ((DType) _eContainer), a.getType(), label, "");
  }
  
  public CharSequence generateLink(final String sourceArrowhead, final DType source, final DType target, final String targetRole, final String targetArrowhead) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _typeName = this.typeName(source);
    _builder.append(_typeName);
    _builder.append(" ");
    _builder.append(sourceArrowhead);
    _builder.append("--");
    _builder.append(targetArrowhead);
    _builder.append(" ");
    CharSequence _targetName = this.targetName(source, target);
    _builder.append(_targetName);
    _builder.append(" : ");
    _builder.append(targetRole);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence typeName(final DType t) {
    StringConcatenation _builder = new StringConcatenation();
    String _xifexpression = null;
    EObject _eContainer = t.eContainer();
    if ((_eContainer instanceof DAggregate)) {
      _xifexpression = this._simUtil.aggregateName(t);
    }
    _builder.append(_xifexpression);
    _builder.append(".");
    String _name = t.getName();
    _builder.append(_name);
    return _builder;
  }
  
  public String spot(final DAggregate a) {
    return "<< (Q,Gold) >>";
  }
  
  public String spot(final DType t) {
    String _switchResult = null;
    boolean _matched = false;
    if (t instanceof DEntityType) {
      _matched=true;
      String _xifexpression = null;
      boolean _isRoot = ((DEntityType)t).isRoot();
      if (_isRoot) {
        _xifexpression = "<< (R,#FB3333) >>";
      } else {
        String _xifexpression_1 = null;
        DEntityNature _nature = ((DEntityType)t).getNature();
        boolean _equals = Objects.equal(_nature, DEntityNature.RELATIONSHIP);
        if (_equals) {
          _xifexpression_1 = "<< (R,#FA78C8) >>";
        } else {
          _xifexpression_1 = "<< (E,#F78100) >>";
        }
        _xifexpression = _xifexpression_1;
      }
      _switchResult = _xifexpression;
    }
    if (!_matched) {
      if (t instanceof DDetailType) {
        _matched=true;
        _switchResult = "<< (D,#FAE55F) >>";
      }
    }
    if (!_matched) {
      if (t instanceof DEnumeration) {
        _matched=true;
        _switchResult = "<< (e,#66B371) >>";
      }
    }
    if (!_matched) {
      if (t instanceof DPrimitive) {
        _matched=true;
        _switchResult = "<< (p,#9AF78F) >>";
      }
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }
  
  public CharSequence targetName(final DType source, final DType target) {
    String _outermostSemanticContainerName = this._simUtil.outermostSemanticContainerName(source);
    String _outermostSemanticContainerName_1 = this._simUtil.outermostSemanticContainerName(target);
    boolean _equals = Objects.equal(_outermostSemanticContainerName, _outermostSemanticContainerName_1);
    if (_equals) {
      String _aggregateName = this._simUtil.aggregateName(source);
      String _aggregateName_1 = this._simUtil.aggregateName(target);
      boolean _equals_1 = Objects.equal(_aggregateName, _aggregateName_1);
      if (_equals_1) {
        return this.typeName(target);
      }
      return this._simUtil.aggregateName(target);
    }
    return this._simUtil.outermostSemanticContainerName(target);
  }
  
  public CharSequence generateType(final DType e) {
    if (e instanceof DEnumeration) {
      return _generateType((DEnumeration)e);
    } else if (e instanceof DPrimitive) {
      return _generateType((DPrimitive)e);
    } else if (e instanceof DComplexType) {
      return _generateType((DComplexType)e);
    } else if (e != null) {
      return _generateType(e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
  
  public CharSequence generateFeature(final DFeature a) {
    if (a instanceof DAssociation) {
      return _generateFeature((DAssociation)a);
    } else if (a instanceof DAttribute) {
      return _generateFeature((DAttribute)a);
    } else if (a instanceof DQuery) {
      return _generateFeature((DQuery)a);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(a).toString());
    }
  }
}
