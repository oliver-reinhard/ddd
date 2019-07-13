package com.mimacom.ddd.sm.sim.ui.plantuml;

import com.google.common.base.Objects;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DAssociation;
import com.mimacom.ddd.dm.base.DAssociationKind;
import com.mimacom.ddd.dm.base.DAttribute;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DDetailType;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DLiteral;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DQueryParameter;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IDeductionDefinition;
import com.mimacom.ddd.sm.sim.SAggregateDeduction;
import com.mimacom.ddd.sm.sim.SAssociationDeduction;
import com.mimacom.ddd.sm.sim.SAttributeDeduction;
import com.mimacom.ddd.sm.sim.SComplexTypeDeduction;
import com.mimacom.ddd.sm.sim.SFeatureDeduction;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.STypeDeduction;
import com.mimacom.ddd.sm.sim.ui.internal.SimActivator;
import java.util.Arrays;
import java.util.Map;
import net.sourceforge.plantuml.text.AbstractDiagramTextProvider;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SimDiagramTextProvider extends AbstractDiagramTextProvider {
  public void DmsDiagramTextProvider() {
    this.setEditorType(XtextEditor.class);
  }
  
  @Override
  public boolean supportsEditor(final IEditorPart editorPart) {
    return (super.supportsEditor(editorPart) && ((XtextEditor) editorPart).getLanguageName().equals(SimActivator.COM_MIMACOM_DDD_SM_SIM_SIM));
  }
  
  @Override
  public boolean supportsSelection(final ISelection sel) {
    return false;
  }
  
  @Override
  protected String getDiagramText(final IEditorPart editorPart, final IEditorInput editorInput, final ISelection sel, final Map<String, Object> obj) {
    IDocument _document = ((XtextEditor) editorPart).getDocumentProvider().getDocument(editorInput);
    final XtextDocument document = ((XtextDocument) _document);
    final IUnitOfWork<SInformationModel, XtextResource> _function = (XtextResource it) -> {
      SInformationModel _xifexpression = null;
      EObject _head = IterableExtensions.<EObject>head(it.getContents());
      if ((_head instanceof SInformationModel)) {
        EObject _head_1 = IterableExtensions.<EObject>head(it.getContents());
        _xifexpression = ((SInformationModel) _head_1);
      } else {
        _xifexpression = null;
      }
      return _xifexpression;
    };
    final SInformationModel model = document.<SInformationModel>readOnly(_function);
    if (((model == null) || (IterableExtensions.isEmpty(IterableExtensions.<DType>filter(model.getTypes(), ((Function1<DType, Boolean>) (DType it) -> {
      return Boolean.valueOf((!(it instanceof IDeductionDefinition)));
    }))) && IterableExtensions.isEmpty(IterableExtensions.<DAggregate>filter(model.getAggregates(), ((Function1<DAggregate, Boolean>) (DAggregate it) -> {
      return Boolean.valueOf((!(it instanceof IDeductionDefinition)));
    })))))) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("note \"No structures to show.\" as N1");
      return _builder.toString();
    }
    return this.modelTypes(model);
  }
  
  public String modelTypes(final SInformationModel model) {
    final Function1<DAggregate, Boolean> _function = (DAggregate it) -> {
      return Boolean.valueOf((!(it instanceof SAggregateDeduction)));
    };
    final Iterable<DAggregate> allAggregates = IterableExtensions.<DAggregate>filter(EcoreUtil2.<DAggregate>eAllOfType(model, DAggregate.class), _function);
    final Function1<DAssociation, Boolean> _function_1 = (DAssociation it) -> {
      return Boolean.valueOf((!(it instanceof SAssociationDeduction)));
    };
    final Iterable<DAssociation> allAssociations = IterableExtensions.<DAssociation>filter(EcoreUtil2.<DAssociation>eAllOfType(model, DAssociation.class), _function_1);
    final Function1<DAssociation, Boolean> _function_2 = (DAssociation it) -> {
      String _modelName = this.modelName(it.getTargetType());
      String _name = model.getName();
      return Boolean.valueOf((!Objects.equal(_modelName, _name)));
    };
    final Function1<DAssociation, String> _function_3 = (DAssociation it) -> {
      return this.modelName(it.getTargetType());
    };
    final Iterable<String> allReferencedDomains = IterableExtensions.<DAssociation, String>map(IterableExtensions.<DAssociation>filter(allAssociations, _function_2), _function_3);
    final Function1<DAttribute, Boolean> _function_4 = (DAttribute it) -> {
      return Boolean.valueOf(((!(it instanceof SAttributeDeduction)) && (!(it.eContainer() instanceof SComplexTypeDeduction))));
    };
    final Iterable<DAttribute> allComplexAttributes = IterableExtensions.<DAttribute>filter(EcoreUtil2.<DAttribute>eAllOfType(model, DAttribute.class), _function_4);
    final Function1<DComplexType, Boolean> _function_5 = (DComplexType it) -> {
      DComplexType _superType = it.getSuperType();
      return Boolean.valueOf((_superType != null));
    };
    final Iterable<DComplexType> allSubtypes = IterableExtensions.<DComplexType>filter(EcoreUtil2.<DComplexType>eAllOfType(model, DComplexType.class), _function_5);
    StringConcatenation _builder = new StringConcatenation();
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
      final Function1<DType, Boolean> _function_6 = (DType it) -> {
        return Boolean.valueOf((!(it instanceof STypeDeduction)));
      };
      Iterable<DType> _filter = IterableExtensions.<DType>filter(model.getTypes(), _function_6);
      for(final DType t : _filter) {
        CharSequence _generateType = this.generateType(t);
        _builder.append(_generateType);
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      for(final DAggregate a : allAggregates) {
        _builder.append("package ");
        String _aggregateName = this.aggregateName(a);
        _builder.append(_aggregateName);
        _builder.append(" <<Rectangle>> {");
        _builder.newLineIfNotEmpty();
        {
          final Function1<DType, Boolean> _function_7 = (DType it) -> {
            return Boolean.valueOf((!(it instanceof STypeDeduction)));
          };
          Iterable<DType> _filter_1 = IterableExtensions.<DType>filter(a.getTypes(), _function_7);
          for(final DType t_1 : _filter_1) {
            CharSequence _generateType_1 = this.generateType(t_1);
            _builder.append(_generateType_1);
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        {
          for(final String d : allReferencedDomains) {
            _builder.append("package ");
            _builder.append(d);
            _builder.append(" <<Frame>> { ");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("            ");
    {
      for(final DAssociation a_1 : allAssociations) {
        CharSequence _generateAssociation = this.generateAssociation(a_1);
        _builder.append(_generateAssociation, "            ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("            ");
    {
      final Function1<DAttribute, Boolean> _function_8 = (DAttribute it) -> {
        DType _type = it.getType();
        return Boolean.valueOf((_type instanceof DDetailType));
      };
      Iterable<DAttribute> _filter_2 = IterableExtensions.<DAttribute>filter(allComplexAttributes, _function_8);
      for(final DAttribute a_2 : _filter_2) {
        CharSequence _generateLink = this.generateLink(a_2);
        _builder.append(_generateLink, "            ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("            ");
    {
      for(final DComplexType s : allSubtypes) {
        String _aggregateName_1 = this.aggregateName(s);
        _builder.append(_aggregateName_1, "            ");
        _builder.append(".");
        String _name = s.getName();
        _builder.append(_name, "            ");
        _builder.append(" --|> ");
        String _aggregateName_2 = this.aggregateName(s.getSuperType());
        _builder.append(_aggregateName_2, "            ");
        {
          String _aggregateName_3 = this.aggregateName(s);
          String _aggregateName_4 = this.aggregateName(s.getSuperType());
          boolean _tripleEquals = (_aggregateName_3 == _aggregateName_4);
          if (_tripleEquals) {
            _builder.append(".");
            String _name_1 = s.getSuperType().getName();
            _builder.append(_name_1, "            ");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    final String result = _builder.toString();
    return result;
  }
  
  public String modelName(final EObject obj) {
    final SInformationModel d = EcoreUtil2.<SInformationModel>getContainerOfType(obj, SInformationModel.class);
    String _xifexpression = null;
    if ((d != null)) {
      _xifexpression = d.getName();
    } else {
      _xifexpression = "undefined";
    }
    return _xifexpression;
  }
  
  /**
   * Copied from DimUtil due to flawed extension injection. TODO
   */
  public String aggregateName(final EObject obj) {
    final DAggregate a = EcoreUtil2.<DAggregate>getContainerOfType(obj, DAggregate.class);
    String _xifexpression = null;
    if ((a != null)) {
      _xifexpression = a.getDerivedName();
    } else {
      _xifexpression = "undefined";
    }
    return _xifexpression;
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
    CharSequence _qualifiedlName = this.qualifiedlName(c);
    _builder.append(_qualifiedlName);
    _builder.append(" ");
    String _spot = this.getSpot(c);
    _builder.append(_spot);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      final Function1<DFeature, Boolean> _function = (DFeature it) -> {
        return Boolean.valueOf((!(it instanceof SFeatureDeduction)));
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
    String _name = p.getName();
    _builder.append(_name);
    _builder.append(" ");
    String _spot = this.getSpot(p);
    _builder.append(_spot);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateType(final DEnumeration e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("enum ");
    String _name = e.getName();
    _builder.append(_name);
    _builder.append(" ");
    String _spot = this.getSpot(e);
    _builder.append(_spot);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<DLiteral> _literals = e.getLiterals();
      for(final DLiteral f : _literals) {
        _builder.append("\t");
        String _name_1 = f.getName();
        _builder.append(_name_1, "\t");
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
  
  public String getSpot(final DType t) {
    String _switchResult = null;
    boolean _matched = false;
    if (t instanceof DEntityType) {
      _matched=true;
      String _xifexpression = null;
      boolean _isRoot = ((DEntityType)t).isRoot();
      if (_isRoot) {
        _xifexpression = "<< (R,#FB3333) >>";
      } else {
        _xifexpression = "<< (E,#F78100) >>";
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
  
  protected CharSequence _generateFeature(final DAttribute a) {
    StringConcatenation _builder = new StringConcatenation();
    {
      DType _type = null;
      if (a!=null) {
        _type=a.getType();
      }
      boolean _not = (!(_type instanceof DDetailType));
      if (_not) {
        String _name = a.getName();
        _builder.append(_name);
        _builder.append(" : ");
        DType _type_1 = a.getType();
        String _name_1 = null;
        if (_type_1!=null) {
          _name_1=_type_1.getName();
        }
        _builder.append(_name_1);
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
      }
    }
    return _builder;
  }
  
  public CharSequence generateAssociation(final DAssociation a) {
    CharSequence _switchResult = null;
    DAssociationKind _kind = a.getKind();
    if (_kind != null) {
      switch (_kind) {
        case REFERENCE:
          EObject _eContainer = a.eContainer();
          _switchResult = this.generateLink("", ((DType) _eContainer), a.getType(), a.getName(), ">");
          break;
        case COMPOSITE:
          EObject _eContainer_1 = a.eContainer();
          _switchResult = this.generateLink("*", ((DType) _eContainer_1), a.getType(), a.getName(), ">");
          break;
        case INVERSE_COMPOSITE:
          EObject _eContainer_2 = a.eContainer();
          _switchResult = this.generateLink("}", ((DType) _eContainer_2), a.getType(), a.getName(), "*");
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  public CharSequence generateLink(final DAttribute a) {
    EObject _eContainer = a.eContainer();
    return this.generateLink("+", ((DType) _eContainer), a.getType(), a.getName(), "");
  }
  
  public CharSequence generateLink(final String sourceArrowhead, final DType source, final DType target, final String targetRole, final String targetArrowhead) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _qualifiedlName = this.qualifiedlName(source);
    _builder.append(_qualifiedlName);
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
  
  public CharSequence qualifiedlName(final DType t) {
    StringConcatenation _builder = new StringConcatenation();
    String _xifexpression = null;
    EObject _eContainer = t.eContainer();
    if ((_eContainer instanceof DAggregate)) {
      _xifexpression = this.aggregateName(t);
    }
    _builder.append(_xifexpression);
    _builder.append(".");
    String _name = t.getName();
    _builder.append(_name);
    return _builder;
  }
  
  public CharSequence targetName(final DType source, final DType target) {
    String _modelName = this.modelName(source);
    String _modelName_1 = this.modelName(target);
    boolean _equals = Objects.equal(_modelName, _modelName_1);
    if (_equals) {
      String _aggregateName = this.aggregateName(source);
      String _aggregateName_1 = this.aggregateName(target);
      boolean _equals_1 = Objects.equal(_aggregateName, _aggregateName_1);
      if (_equals_1) {
        return this.qualifiedlName(target);
      }
      return this.aggregateName(target);
    }
    return this.modelName(target);
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
