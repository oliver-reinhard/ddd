/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dmx.ui.outline;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DContext;
import com.mimacom.ddd.dm.base.base.DExpression;
import com.mimacom.ddd.dm.base.base.DMultiplicity;
import com.mimacom.ddd.dm.base.base.DNamedElement;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.dmx.DmxAssignment;
import com.mimacom.ddd.dm.dmx.DmxContextReference;
import com.mimacom.ddd.dm.dmx.DmxCorrelationVariable;
import com.mimacom.ddd.dm.dmx.DmxFilter;
import com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor;
import com.mimacom.ddd.dm.dmx.DmxMemberNavigation;
import com.mimacom.ddd.dm.dmx.DmxPackage;
import com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable;
import com.mimacom.ddd.dm.dmx.DmxUtil;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.xtext.ui.editor.outline.impl.EStructuralFeatureNode;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IntegerRange;

/**
 * Customization of the default outline structure.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#outline
 */
@SuppressWarnings("all")
public class DmxOutlineTreeProvider extends DefaultOutlineTreeProvider {
  @Inject
  @Extension
  private DmxUtil _dmxUtil;
  
  private static final DmxPackage DMX = DmxPackage.eINSTANCE;
  
  private static final ImageDescriptor NULL_IMAGE = ((ImageDescriptor) null);
  
  private static final ImageDescriptor FEATURE_IMAGE = DmxOutlineTreeProvider.NULL_IMAGE;
  
  public EObjectNode _createNode(final IOutlineNode parentNode, final DContext context) {
    EObjectNode _xblockexpression = null;
    {
      String _xifexpression = null;
      DType _type = context.getType();
      boolean _tripleNotEquals = (_type != null);
      if (_tripleNotEquals) {
        String _name = context.getType().getName();
        String _plus = (" : " + _name);
        String _xifexpression_1 = null;
        DMultiplicity _multiplicity = context.getMultiplicity();
        boolean _tripleNotEquals_1 = (_multiplicity != null);
        if (_tripleNotEquals_1) {
          int _minOccurs = context.getMultiplicity().getMinOccurs();
          String _plus_1 = ("(" + Integer.valueOf(_minOccurs));
          String _plus_2 = (_plus_1 + " .. ");
          int _maxOccurs = context.getMultiplicity().getMaxOccurs();
          String _plus_3 = (_plus_2 + Integer.valueOf(_maxOccurs));
          _xifexpression_1 = (_plus_3 + ")");
        } else {
          _xifexpression_1 = "";
        }
        _xifexpression = (_plus + _xifexpression_1);
      } else {
        _xifexpression = " : (no type)";
      }
      final String type = _xifexpression;
      Image _invoke = this.imageDispatcher.invoke(context);
      Object _invoke_1 = this.textDispatcher.invoke(context);
      String _plus_4 = (_invoke_1 + type);
      _xblockexpression = this.createEObjectNode(parentNode, context, _invoke, _plus_4, (this.isLeafDispatcher.invoke(context)).booleanValue());
    }
    return _xblockexpression;
  }
  
  public EStructuralFeatureNode _createNode(final IOutlineNode parentNode, final DmxFilter filter) {
    EStructuralFeatureNode _xblockexpression = null;
    {
      final EObjectNode node = this.createEObjectNode(parentNode, filter, this.imageDispatcher.invoke(filter), this.textDispatcher.invoke(filter), (this.isLeafDispatcher.invoke(filter)).booleanValue());
      EReference _dmxFilter_TypeDesc = DmxOutlineTreeProvider.DMX.getDmxFilter_TypeDesc();
      String _name = DmxOutlineTreeProvider.DMX.getDmxFilter_TypeDesc().getName();
      String _plus = (_name + " ");
      String _resultTypes = this.getResultTypes(filter);
      String _plus_1 = (_plus + _resultTypes);
      String _xifexpression = null;
      DmxFilterTypeDescriptor _typeDesc = null;
      if (filter!=null) {
        _typeDesc=filter.getTypeDesc();
      }
      boolean _isCollection = _typeDesc.isCollection();
      if (_isCollection) {
        _xifexpression = "*";
      } else {
        _xifexpression = "";
      }
      String _plus_2 = (_plus_1 + _xifexpression);
      _xblockexpression = this.createEStructuralFeatureNode(node, filter, _dmxFilter_TypeDesc, DmxOutlineTreeProvider.FEATURE_IMAGE, _plus_2, true);
    }
    return _xblockexpression;
  }
  
  private String getResultTypes(final DmxFilter filter) {
    String _xblockexpression = null;
    {
      final DmxFilterTypeDescriptor desc = filter.getTypeDesc();
      if ((desc == null)) {
        return "null";
      }
      String _xifexpression = null;
      boolean _isMultiTyped = desc.isMultiTyped();
      if (_isMultiTyped) {
        String _xblockexpression_1 = null;
        {
          String _literal = filter.getTypeDesc().getMultiple().getMembers().get(0).getLiteral();
          final StringBuilder b = new StringBuilder(_literal);
          int _size = filter.getTypeDesc().getMultiple().getMembers().size();
          int _minus = (_size - 1);
          IntegerRange _upTo = new IntegerRange(1, _minus);
          for (final Integer i : _upTo) {
            {
              b.append(",");
              b.append(filter.getTypeDesc().getMultiple().getMembers().get((i).intValue()));
            }
          }
          _xblockexpression_1 = b.toString();
        }
        _xifexpression = _xblockexpression_1;
      } else {
        _xifexpression = desc.getSingle().getLiteral();
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public EStructuralFeatureNode _createChildren(final IOutlineNode parentNode, final DmxPredicateWithCorrelationVariable pred) {
    EStructuralFeatureNode _xblockexpression = null;
    {
      DmxCorrelationVariable _correlationVariable = pred.getCorrelationVariable();
      boolean _tripleNotEquals = (_correlationVariable != null);
      if (_tripleNotEquals) {
        this.createEStructuralFeatureNode(parentNode, pred, DmxOutlineTreeProvider.DMX.getDmxPredicateWithCorrelationVariable_CorrelationVariable(), DmxOutlineTreeProvider.FEATURE_IMAGE, DmxOutlineTreeProvider.DMX.getDmxPredicateWithCorrelationVariable_CorrelationVariable().getName(), false);
      }
      EStructuralFeatureNode _xifexpression = null;
      DExpression _predicate = pred.getPredicate();
      boolean _tripleNotEquals_1 = (_predicate != null);
      if (_tripleNotEquals_1) {
        _xifexpression = this.createEStructuralFeatureNode(parentNode, pred, DmxOutlineTreeProvider.DMX.getDmxPredicateWithCorrelationVariable_Predicate(), DmxOutlineTreeProvider.FEATURE_IMAGE, DmxOutlineTreeProvider.DMX.getDmxPredicateWithCorrelationVariable_Predicate().getName(), false);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public EStructuralFeatureNode _createChildren(final IOutlineNode parentNode, final DmxMemberNavigation nav) {
    EStructuralFeatureNode _xblockexpression = null;
    {
      if (((nav.getMember() != null) && (!nav.getMember().eIsProxy()))) {
        this.createEStructuralFeatureNode(parentNode, nav, DmxOutlineTreeProvider.DMX.getDmxMemberNavigation_Member(), DmxOutlineTreeProvider.FEATURE_IMAGE, DmxOutlineTreeProvider.DMX.getDmxMemberNavigation_Member().getName(), false);
      }
      DExpression _precedingNavigationSegment = nav.getPrecedingNavigationSegment();
      boolean _tripleNotEquals = (_precedingNavigationSegment != null);
      if (_tripleNotEquals) {
        this.createEStructuralFeatureNode(parentNode, nav, DmxOutlineTreeProvider.DMX.getDmxMemberNavigation_PrecedingNavigationSegment(), DmxOutlineTreeProvider.FEATURE_IMAGE, DmxOutlineTreeProvider.DMX.getDmxMemberNavigation_PrecedingNavigationSegment().getName(), false);
      }
      EStructuralFeatureNode _xifexpression = null;
      int _size = this._dmxUtil.nullSafeCallArguments(nav).size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _xifexpression = this.createEStructuralFeatureNode(parentNode, nav, DmxOutlineTreeProvider.DMX.getDmxMemberNavigation_CallArguments(), DmxOutlineTreeProvider.FEATURE_IMAGE, DmxOutlineTreeProvider.DMX.getDmxMemberNavigation_CallArguments().getName(), false);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public EStructuralFeatureNode _createChildren(final IOutlineNode parentNode, final DmxAssignment assign) {
    EStructuralFeatureNode _xblockexpression = null;
    {
      DExpression _precedingNavigationSegment = assign.getPrecedingNavigationSegment();
      boolean _tripleNotEquals = (_precedingNavigationSegment != null);
      if (_tripleNotEquals) {
        this.createEStructuralFeatureNode(parentNode, assign, DmxOutlineTreeProvider.DMX.getDmxAssignment_PrecedingNavigationSegment(), DmxOutlineTreeProvider.FEATURE_IMAGE, DmxOutlineTreeProvider.DMX.getDmxAssignment_PrecedingNavigationSegment().getName(), false);
      }
      if (((assign.getAssignToMember() != null) && (!assign.getAssignToMember().eIsProxy()))) {
        this.createEStructuralFeatureNode(parentNode, assign, DmxOutlineTreeProvider.DMX.getDmxAssignment_AssignToMember(), DmxOutlineTreeProvider.FEATURE_IMAGE, DmxOutlineTreeProvider.DMX.getDmxAssignment_AssignToMember().getName(), false);
      }
      EStructuralFeatureNode _xifexpression = null;
      if (((assign.getValue() != null) && (!assign.getAssignToMember().eIsProxy()))) {
        _xifexpression = this.createEStructuralFeatureNode(parentNode, assign, DmxOutlineTreeProvider.DMX.getDmxAssignment_Value(), DmxOutlineTreeProvider.FEATURE_IMAGE, DmxOutlineTreeProvider.DMX.getDmxAssignment_Value().getName(), false);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public EStructuralFeatureNode _createNode(final IOutlineNode parentNode, final DmxContextReference ref) {
    EStructuralFeatureNode _xblockexpression = null;
    {
      final EObjectNode node = this.createEObjectNode(parentNode, ref, this.imageDispatcher.invoke(ref), this.textDispatcher.invoke(ref), (this.isLeafDispatcher.invoke(ref)).booleanValue());
      DNamedElement _target = ref.getTarget();
      boolean _tripleNotEquals = (_target != null);
      if (_tripleNotEquals) {
        EReference _dmxContextReference_Target = DmxOutlineTreeProvider.DMX.getDmxContextReference_Target();
        String _name = DmxOutlineTreeProvider.DMX.getDmxContextReference_Target().getName();
        String _plus = (_name + ": ");
        String _name_1 = ref.getTarget().getName();
        String _plus_1 = (_plus + _name_1);
        this.createEStructuralFeatureNode(node, ref, _dmxContextReference_Target, DmxOutlineTreeProvider.FEATURE_IMAGE, _plus_1, false);
      }
      EStructuralFeatureNode _xifexpression = null;
      boolean _isAll = ref.isAll();
      if (_isAll) {
        _xifexpression = this.createEStructuralFeatureNode(node, ref, DmxOutlineTreeProvider.DMX.getDmxContextReference_All(), DmxOutlineTreeProvider.FEATURE_IMAGE, DmxOutlineTreeProvider.DMX.getDmxContextReference_All().getName(), true);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
