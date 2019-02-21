package com.mimacom.ddd.sm.sim.ui.plantuml;

import com.google.common.base.Objects;
import com.mimacom.ddd.sm.sim.SAggregate;
import com.mimacom.ddd.sm.sim.SAssociation;
import com.mimacom.ddd.sm.sim.SAssociationKind;
import com.mimacom.ddd.sm.sim.SAttribute;
import com.mimacom.ddd.sm.sim.SComplexType;
import com.mimacom.ddd.sm.sim.SDetailType;
import com.mimacom.ddd.sm.sim.SElementNature;
import com.mimacom.ddd.sm.sim.SEnumeration;
import com.mimacom.ddd.sm.sim.SFeature;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SLiteral;
import com.mimacom.ddd.sm.sim.SPrimitive;
import com.mimacom.ddd.sm.sim.SQuery;
import com.mimacom.ddd.sm.sim.SRootType;
import com.mimacom.ddd.sm.sim.SType;
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
    if (((model != null) && (!model.getAggregates().isEmpty()))) {
      return this.modelTypes(model);
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("note \"No structures to show.\" as N1");
      return _builder.toString();
    }
  }
  
  public String modelTypes(final SInformationModel model) {
    final Function1<SAggregate, Boolean> _function = (SAggregate it) -> {
      SElementNature _nature = it.getNature();
      return Boolean.valueOf((!Objects.equal(_nature, SElementNature.DEDUCTION_RULE)));
    };
    final Iterable<SAggregate> allAggregates = IterableExtensions.<SAggregate>filter(EcoreUtil2.<SAggregate>eAllOfType(model, SAggregate.class), _function);
    final Function1<SAssociation, Boolean> _function_1 = (SAssociation it) -> {
      return Boolean.valueOf(((it.getType() instanceof SRootType) && (!Objects.equal(it.getNature(), SElementNature.DEDUCTION_RULE))));
    };
    final Iterable<SAssociation> allAssociations = IterableExtensions.<SAssociation>filter(EcoreUtil2.<SAssociation>eAllOfType(model, SAssociation.class), _function_1);
    final Function1<SAssociation, Boolean> _function_2 = (SAssociation it) -> {
      String _modelName = this.modelName(it.getTargetType());
      String _name = model.getName();
      return Boolean.valueOf((!Objects.equal(_modelName, _name)));
    };
    final Function1<SAssociation, String> _function_3 = (SAssociation it) -> {
      return this.modelName(it.getTargetType());
    };
    final Iterable<String> allReferencedDomains = IterableExtensions.<SAssociation, String>map(IterableExtensions.<SAssociation>filter(allAssociations, _function_2), _function_3);
    final Function1<SAttribute, Boolean> _function_4 = (SAttribute it) -> {
      return Boolean.valueOf(((it.getType() instanceof SDetailType) && (!Objects.equal(it.getNature(), SElementNature.DEDUCTION_RULE))));
    };
    final Iterable<SAttribute> allDetailAttributes = IterableExtensions.<SAttribute>filter(EcoreUtil2.<SAttribute>eAllOfType(model, SAttribute.class), _function_4);
    final Function1<SComplexType, Boolean> _function_5 = (SComplexType it) -> {
      SComplexType _superType = it.getSuperType();
      return Boolean.valueOf((_superType != null));
    };
    final Iterable<SComplexType> allSubtypes = IterableExtensions.<SComplexType>filter(EcoreUtil2.<SComplexType>eAllOfType(model, SComplexType.class), _function_5);
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
    _builder.append("           \t");
    {
      for(final SAggregate a : allAggregates) {
        _builder.append("package ");
        String _aggregateName = this.aggregateName(a);
        _builder.append(_aggregateName, "           \t");
        _builder.append(" <<Rectangle>> {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t    \t\t\t\t");
        {
          EList<SType> _types = a.getTypes();
          for(final SType t : _types) {
            CharSequence _generateType = this.generateType(t);
            _builder.append(_generateType, "\t    \t\t\t\t");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("           \t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t           \t");
        {
          for(final String d : allReferencedDomains) {
            _builder.append("package ");
            _builder.append(d, "\t           \t");
            _builder.append(" <<Frame>> { ");
            _builder.newLineIfNotEmpty();
            _builder.append("\t           \t");
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t            ");
    {
      for(final SAssociation a_1 : allAssociations) {
        CharSequence _generateAssociation = this.generateAssociation(a_1);
        _builder.append(_generateAssociation, "\t            ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t            ");
    {
      for(final SAttribute a_2 : allDetailAttributes) {
        CharSequence _generateLink = this.generateLink(a_2);
        _builder.append(_generateLink, "\t            ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t            ");
    {
      for(final SComplexType s : allSubtypes) {
        String _aggregateName_1 = this.aggregateName(s);
        _builder.append(_aggregateName_1, "\t            ");
        _builder.append(".");
        String _name = s.getName();
        _builder.append(_name, "\t            ");
        _builder.append(" --|> ");
        String _aggregateName_2 = this.aggregateName(s.getSuperType());
        _builder.append(_aggregateName_2, "\t            ");
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
  
  public String aggregateName(final EObject obj) {
    final SAggregate a = EcoreUtil2.<SAggregate>getContainerOfType(obj, SAggregate.class);
    String _xifexpression = null;
    if ((a != null)) {
      _xifexpression = a.getRootName();
    } else {
      _xifexpression = "undefined";
    }
    return _xifexpression;
  }
  
  protected CharSequence _generateType(final SComplexType c) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isAbstract = c.isAbstract();
      if (_isAbstract) {
        _builder.append("abstract ");
      }
    }
    _builder.append("class ");
    String _aggregateName = this.aggregateName(c);
    _builder.append(_aggregateName);
    _builder.append(".");
    String _name = c.getName();
    _builder.append(_name);
    _builder.append(" ");
    String _spot = this.getSpot(c);
    _builder.append(_spot);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      final Function1<SFeature, Boolean> _function = (SFeature it) -> {
        SElementNature _nature = it.getNature();
        return Boolean.valueOf((!Objects.equal(_nature, SElementNature.DEDUCTION_RULE)));
      };
      Iterable<SFeature> _filter = IterableExtensions.<SFeature>filter(c.getFeatures(), _function);
      for(final SFeature f : _filter) {
        CharSequence _generateFeature = this.generateFeature(f);
        _builder.append(_generateFeature, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateType(final SPrimitive p) {
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
  
  protected CharSequence _generateType(final SEnumeration e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("enum ");
    String _name = e.getName();
    _builder.append(_name);
    _builder.append(" << (E,green) >> {");
    _builder.newLineIfNotEmpty();
    {
      EList<SLiteral> _literals = e.getLiterals();
      for(final SLiteral f : _literals) {
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
  
  protected CharSequence _generateType(final SType t) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public String getSpot(final SType t) {
    String _switchResult = null;
    boolean _matched = false;
    if (t instanceof SRootType) {
      _matched=true;
      _switchResult = "<< (R,crimson) >>";
    }
    if (!_matched) {
      if (t instanceof SDetailType) {
        _matched=true;
        _switchResult = "<< (D,grey) >>";
      }
    }
    if (!_matched) {
      if (t instanceof SPrimitive) {
        _matched=true;
        _switchResult = "<< (P,teal) >>";
      }
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }
  
  protected CharSequence _generateFeature(final SAttribute a) {
    StringConcatenation _builder = new StringConcatenation();
    {
      SType _type = null;
      if (a!=null) {
        _type=a.getType();
      }
      boolean _not = (!(_type instanceof SDetailType));
      if (_not) {
        _builder.append(" ");
        String _name = a.getName();
        _builder.append(_name);
        _builder.append(" : ");
        SType _type_1 = a.getType();
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
  
  protected CharSequence _generateFeature(final SQuery q) {
    StringConcatenation _builder = new StringConcatenation();
    {
      SType _type = q.getType();
      boolean _tripleNotEquals = (_type != null);
      if (_tripleNotEquals) {
        String _name = q.getName();
        _builder.append(_name);
        _builder.append("() : ");
        String _name_1 = q.getType().getName();
        _builder.append(_name_1);
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateFeature(final SAssociation a) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence generateAssociation(final SAssociation a) {
    CharSequence _switchResult = null;
    SAssociationKind _kind = a.getKind();
    if (_kind != null) {
      switch (_kind) {
        case REFERENCE:
          EObject _eContainer = a.eContainer();
          _switchResult = this.generateLink("", ((SType) _eContainer), a.getType(), a.getName(), ">");
          break;
        case COMPOSITE:
          EObject _eContainer_1 = a.eContainer();
          _switchResult = this.generateLink("*", ((SType) _eContainer_1), a.getType(), a.getName(), ">");
          break;
        case INVERSE_COMPOSITE:
          EObject _eContainer_2 = a.eContainer();
          _switchResult = this.generateLink("}", ((SType) _eContainer_2), a.getType(), a.getName(), "*");
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  public CharSequence generateLink(final SAttribute a) {
    EObject _eContainer = a.eContainer();
    return this.generateLink("*", ((SType) _eContainer), a.getType(), a.getName(), "");
  }
  
  public CharSequence generateLink(final String sourceArrowhead, final SType source, final SType target, final String targetRole, final String targetArrowhead) {
    StringConcatenation _builder = new StringConcatenation();
    String _aggregateName = this.aggregateName(source);
    _builder.append(_aggregateName);
    _builder.append(".");
    String _name = source.getName();
    _builder.append(_name);
    _builder.append(" ");
    _builder.append(sourceArrowhead);
    _builder.append("--");
    _builder.append(targetArrowhead);
    _builder.append(" ");
    String _targetName = this.getTargetName(source, target);
    _builder.append(_targetName);
    _builder.append(" : ");
    _builder.append(targetRole);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String getTargetName(final SType source, final SType target) {
    String _modelName = this.modelName(source);
    String _modelName_1 = this.modelName(target);
    boolean _equals = Objects.equal(_modelName, _modelName_1);
    if (_equals) {
      String _aggregateName = this.aggregateName(source);
      String _aggregateName_1 = this.aggregateName(target);
      boolean _equals_1 = Objects.equal(_aggregateName, _aggregateName_1);
      if (_equals_1) {
        String _aggregateName_2 = this.aggregateName(target);
        String _plus = (_aggregateName_2 + ".");
        String _name = target.getName();
        return (_plus + _name);
      }
      return this.aggregateName(target);
    }
    return this.modelName(target);
  }
  
  public CharSequence generateType(final SType e) {
    if (e instanceof SEnumeration) {
      return _generateType((SEnumeration)e);
    } else if (e instanceof SPrimitive) {
      return _generateType((SPrimitive)e);
    } else if (e instanceof SComplexType) {
      return _generateType((SComplexType)e);
    } else if (e != null) {
      return _generateType(e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
  
  public CharSequence generateFeature(final SFeature a) {
    if (a instanceof SAssociation) {
      return _generateFeature((SAssociation)a);
    } else if (a instanceof SAttribute) {
      return _generateFeature((SAttribute)a);
    } else if (a instanceof SQuery) {
      return _generateFeature((SQuery)a);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(a).toString());
    }
  }
}
