package com.mimacom.ddd.dm.dim.ui.plantuml;

import com.google.common.base.Objects;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DAssociation;
import com.mimacom.ddd.dm.base.DAssociationKind;
import com.mimacom.ddd.dm.base.DAttribute;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DDetailType;
import com.mimacom.ddd.dm.base.DDomain;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DLiteral;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DRelationship;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.dim.ui.internal.DimActivator;
import java.util.Arrays;
import java.util.List;
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
public class DimDiagramTextProvider extends AbstractDiagramTextProvider {
  public void DmsDiagramTextProvider() {
    this.setEditorType(XtextEditor.class);
  }
  
  @Override
  public boolean supportsEditor(final IEditorPart editorPart) {
    return (super.supportsEditor(editorPart) && ((XtextEditor) editorPart).getLanguageName().equals(DimActivator.COM_MIMACOM_DDD_DM_DIM_DIM));
  }
  
  @Override
  public boolean supportsSelection(final ISelection sel) {
    return false;
  }
  
  @Override
  protected String getDiagramText(final IEditorPart editorPart, final IEditorInput editorInput, final ISelection sel, final Map<String, Object> obj) {
    IDocument _document = ((XtextEditor) editorPart).getDocumentProvider().getDocument(editorInput);
    final XtextDocument document = ((XtextDocument) _document);
    final IUnitOfWork<DDomain, XtextResource> _function = (XtextResource it) -> {
      DDomain _xifexpression = null;
      EObject _head = IterableExtensions.<EObject>head(it.getContents());
      if ((_head instanceof DDomain)) {
        EObject _head_1 = IterableExtensions.<EObject>head(it.getContents());
        _xifexpression = ((DDomain) _head_1);
      } else {
        _xifexpression = null;
      }
      return _xifexpression;
    };
    final DDomain domain = document.<DDomain>readOnly(_function);
    if (((domain != null) && (!domain.getAggregates().isEmpty()))) {
      return this.domainTypes(domain);
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("note \"No structures to show.\" as N1");
      return _builder.toString();
    }
  }
  
  public String domainTypes(final DDomain domain) {
    final List<DAggregate> allAggregates = EcoreUtil2.<DAggregate>eAllOfType(domain, DAggregate.class);
    final Function1<DAssociation, Boolean> _function = (DAssociation it) -> {
      DType _type = it.getType();
      return Boolean.valueOf((_type instanceof DEntityType));
    };
    final Iterable<DAssociation> allAssociations = IterableExtensions.<DAssociation>filter(EcoreUtil2.<DAssociation>eAllOfType(domain, DAssociation.class), _function);
    final Function1<DAssociation, Boolean> _function_1 = (DAssociation it) -> {
      return Boolean.valueOf((Objects.equal(this.domainName(it.getTargetType()), domain.getName()) && (it.getTargetType().eContainer() instanceof DAggregate)));
    };
    final Function1<DAssociation, EObject> _function_2 = (DAssociation it) -> {
      return it.getTargetType().eContainer();
    };
    final Iterable<EObject> allReferencedAggregatesInsideDomain = IterableExtensions.<DAssociation, EObject>map(IterableExtensions.<DAssociation>filter(allAssociations, _function_1), _function_2);
    final Function1<DAssociation, Boolean> _function_3 = (DAssociation it) -> {
      String _domainName = this.domainName(it.getTargetType());
      String _name = domain.getName();
      return Boolean.valueOf(Objects.equal(_domainName, _name));
    };
    final Function1<DAssociation, DEntityType> _function_4 = (DAssociation it) -> {
      return it.getTargetType();
    };
    final Iterable<DEntityType> allReferencedEntitiesInsideDomain = IterableExtensions.<DAssociation, DEntityType>map(IterableExtensions.<DAssociation>filter(allAssociations, _function_3), _function_4);
    final Function1<DAssociation, Boolean> _function_5 = (DAssociation it) -> {
      String _domainName = this.domainName(it.getTargetType());
      String _name = domain.getName();
      return Boolean.valueOf((!Objects.equal(_domainName, _name)));
    };
    final Function1<DAssociation, String> _function_6 = (DAssociation it) -> {
      return this.domainName(it.getTargetType());
    };
    final Iterable<String> allReferencedOtherDomains = IterableExtensions.<DAssociation, String>map(IterableExtensions.<DAssociation>filter(allAssociations, _function_5), _function_6);
    final Function1<DAttribute, Boolean> _function_7 = (DAttribute it) -> {
      DType _type = it.getType();
      return Boolean.valueOf((_type instanceof DDetailType));
    };
    final Iterable<DAttribute> allDetailAttributes = IterableExtensions.<DAttribute>filter(EcoreUtil2.<DAttribute>eAllOfType(domain, DAttribute.class), _function_7);
    final Function1<DComplexType, Boolean> _function_8 = (DComplexType it) -> {
      DComplexType _superType = it.getSuperType();
      return Boolean.valueOf((_superType != null));
    };
    final Iterable<DComplexType> allSubtypes = IterableExtensions.<DComplexType>filter(EcoreUtil2.<DComplexType>eAllOfType(domain, DComplexType.class), _function_8);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("hide empty members");
    _builder.newLine();
    _builder.append("       \t\t");
    _builder.newLine();
    _builder.append("skinparam package {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("BorderColor FireBrick");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FontColor FireBrick");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("           \t");
    {
      for(final DAggregate a : allAggregates) {
        _builder.append("package ");
        String _aggregateName = this.aggregateName(a);
        _builder.append(_aggregateName, "           \t");
        _builder.append(" <<Rectangle>> {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t    \t\t\t\t");
        {
          EList<DType> _types = a.getTypes();
          for(final DType t : _types) {
            CharSequence _generateType = this.generateType(t);
            _builder.append(_generateType, "\t    \t\t\t\t");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("           \t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("           \t");
        _builder.append("\t");
        {
          for(final EObject ra : allReferencedAggregatesInsideDomain) {
            _builder.append("package ");
            String _aggregateName_1 = this.aggregateName(ra);
            _builder.append(_aggregateName_1, "           \t\t");
            _builder.append(" <<Rectangle>> {");
            _builder.newLineIfNotEmpty();
            _builder.append("           \t");
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("\t           \t");
        {
          for(final DEntityType re : allReferencedEntitiesInsideDomain) {
            CharSequence _generateType_1 = this.generateType(re);
            _builder.append(_generateType_1, "\t           \t");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t           \t");
        {
          for(final String rd : allReferencedOtherDomains) {
            _builder.append("package ");
            _builder.append(rd, "\t           \t");
            _builder.append(" <<Frame>> { ");
            _builder.newLineIfNotEmpty();
            _builder.append("\t           \t");
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
      for(final DAttribute a_2 : allDetailAttributes) {
        CharSequence _generateLink = this.generateLink(a_2);
        _builder.append(_generateLink, "            ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("            ");
    {
      for(final DComplexType s : allSubtypes) {
        String _aggregateName_2 = this.aggregateName(s);
        _builder.append(_aggregateName_2, "            ");
        _builder.append(".");
        String _name = s.getName();
        _builder.append(_name, "            ");
        _builder.append(" --|> ");
        String _aggregateName_3 = this.aggregateName(s.getSuperType());
        _builder.append(_aggregateName_3, "            ");
        {
          String _aggregateName_4 = this.aggregateName(s);
          String _aggregateName_5 = this.aggregateName(s.getSuperType());
          boolean _tripleEquals = (_aggregateName_4 == _aggregateName_5);
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
  
  public String domainName(final EObject obj) {
    final DDomain d = EcoreUtil2.<DDomain>getContainerOfType(obj, DDomain.class);
    String _xifexpression = null;
    if ((d != null)) {
      _xifexpression = d.getName();
    } else {
      _xifexpression = "undefined";
    }
    return _xifexpression;
  }
  
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
      EList<DFeature> _features = c.getFeatures();
      for(final DFeature f : _features) {
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
      if (t instanceof DRelationship) {
        _matched=true;
        _switchResult = "<< (R,#FA78C8) >>";
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
        _builder.append(" ");
        String _name = a.getName();
        _builder.append(_name);
        _builder.append(" : ");
        String _name_1 = a.getType().getName();
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
        _builder.append("() : ");
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
    return this.generateLink("*", ((DType) _eContainer), a.getType(), a.getName(), "");
  }
  
  public CharSequence generateLink(final String sourceArrowhead, final DType source, final DType target, final String targetRole, final String targetArrowhead) {
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
  
  public String getTargetName(final DType source, final DType target) {
    String _domainName = this.domainName(source);
    String _domainName_1 = this.domainName(target);
    boolean _equals = Objects.equal(_domainName, _domainName_1);
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
    return this.domainName(target);
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
