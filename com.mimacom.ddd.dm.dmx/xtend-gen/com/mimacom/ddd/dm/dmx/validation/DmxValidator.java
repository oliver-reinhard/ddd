/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dmx.validation;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.dmx.DmxAssignment;
import com.mimacom.ddd.dm.dmx.DmxContextReference;
import com.mimacom.ddd.dm.dmx.DmxFilter;
import com.mimacom.ddd.dm.dmx.DmxFilterParameter;
import com.mimacom.ddd.dm.dmx.DmxListExpression;
import com.mimacom.ddd.dm.dmx.DmxMemberNavigation;
import com.mimacom.ddd.dm.dmx.DmxRichTextUtil;
import com.mimacom.ddd.dm.dmx.DmxUrlLiteral;
import com.mimacom.ddd.dm.dmx.DmxUtil;
import com.mimacom.ddd.dm.dmx.validation.DmxTypeCheckingValidator;
import com.mimacom.ddd.dm.styledText.DStyledTextSpan;
import com.mimacom.ddd.dm.styledText.parser.ErrorMessageAcceptor;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class DmxValidator extends DmxTypeCheckingValidator implements ErrorMessageAcceptor {
  @Inject
  @Extension
  private DmxUtil _dmxUtil;
  
  @Inject
  @Extension
  private DmxRichTextUtil _dmxRichTextUtil;
  
  @Check
  public void checkAssignmentTarget(final DmxAssignment a) {
    DExpression _precedingNavigationSegment = a.getPrecedingNavigationSegment();
    boolean _tripleEquals = (_precedingNavigationSegment == null);
    if (_tripleEquals) {
      this.error("Assignment target must be an attribute of a complex type.", a, DmxTypeCheckingValidator.DMX.getDmxAssignment_AssignToMember());
    } else {
      DNavigableMember _assignToMember = a.getAssignToMember();
      if ((_assignToMember instanceof DQuery)) {
        this.error("Cannot assign a value to a query.", a, DmxTypeCheckingValidator.DMX.getDmxAssignment_AssignToMember());
      }
    }
  }
  
  @Check
  public void checkFilterParameters(final DmxFilter f) {
    if ((f.getTypeDesc().isMultiTyped() && (!IterableExtensions.<DmxFilterParameter>exists(f.getParameters(), ((Function1<DmxFilterParameter, Boolean>) (DmxFilterParameter t) -> {
      return Boolean.valueOf(((t.getTypeDesc() != null) && t.getTypeDesc().isMultiTyped()));
    }))))) {
      this.error("For a multi-typed return type, there must be a parameter supporting the same types.", f, DmxTypeCheckingValidator.BASE.getDNamedElement_Name(), 0);
    }
  }
  
  @Check
  public void checkUseOfAllQualifier(final DmxContextReference ref) {
    if ((ref.isAll() && (!(ref.getTarget() instanceof DComplexType)))) {
      this.error("\'all\' qualifier is only supported after a static type reference.", ref, DmxTypeCheckingValidator.DMX.getDmxContextReference_All());
    }
  }
  
  @Check
  public void checkNavigationOfStaticTypeReference(final DmxMemberNavigation nav) {
    DNavigableMember _member = nav.getMember();
    if ((_member instanceof DFeature)) {
      final DExpression preceding = nav.getPrecedingNavigationSegment();
      if (((preceding instanceof DmxContextReference) && (((DmxContextReference) preceding).getTarget() instanceof DComplexType))) {
        this.error("Cannot navigate a feature from a static type reference. Use [[Type#feature]] syntax inside RichStrings.", nav, DmxTypeCheckingValidator.DMX.getDmxMemberNavigation_Member());
      }
    }
  }
  
  @Check
  public void checkNoStateFeature(final DEntityType e) {
    final Set<DComplexType> superTypes = this._dmxUtil.typeHierarchy(e);
    if (((!e.getStates().isEmpty()) || IterableExtensions.<DComplexType>exists(superTypes, ((Function1<DComplexType, Boolean>) (DComplexType t) -> {
      return Boolean.valueOf(((t instanceof DEntityType) && (!((DEntityType) t).getStates().isEmpty())));
    })))) {
      EList<DFeature> _features = e.getFeatures();
      for (final DFeature f : _features) {
        String _name = f.getName();
        boolean _equals = Objects.equal(_name, DmxUtil.ENTITY_TYPE_STATE_FILTER_NAME);
        if (_equals) {
          this.error("Cannot declare a \'state\' feature while states are declared for this type or for one of its super types.", f, DmxTypeCheckingValidator.BASE.getDNamedElement_Name());
        }
      }
      if (((e.getSuperType() != null) && IterableExtensions.<DFeature>exists(this._dmxUtil.allFeatures(e.getSuperType()), ((Function1<DFeature, Boolean>) (DFeature it) -> {
        String _name_1 = it.getName();
        return Boolean.valueOf(Objects.equal(_name_1, DmxUtil.ENTITY_TYPE_STATE_FILTER_NAME));
      })))) {
        this.error("Cannot have an inherited \'state\' feature while states are declared for this type.", e, DmxTypeCheckingValidator.BASE.getDNamedElement_Name());
      }
    }
  }
  
  @Check
  public void checkNestedLists(final DmxListExpression expr) {
    EList<DExpression> _elements = expr.getElements();
    for (final DExpression e : _elements) {
      if ((e instanceof DmxListExpression)) {
        this.error("Cannot nest lists", expr, DmxTypeCheckingValidator.DMX.getDmxListExpression_Elements());
      }
    }
  }
  
  @Check
  public DStyledTextSpan checkRichTextFormatting(final DRichText rt) {
    return this._dmxRichTextUtil.parse(rt, this);
  }
  
  @Override
  public void acceptError(final String message, final int offset, final int length) {
    final EObject current = this.getCurrentObject();
    this.getMessageAcceptor().acceptError(message, current, offset, length, null);
  }
  
  @Check
  public void urlFormat(final DmxUrlLiteral url) {
    if (((url.getValue() != null) && (!url.getValue().isEmpty()))) {
      try {
        String _value = url.getValue();
        new URL(_value);
      } catch (final Throwable _t) {
        if (_t instanceof MalformedURLException) {
          final MalformedURLException ex = (MalformedURLException)_t;
          String _message = ex.getMessage();
          String _plus = ("Malformed URL: " + _message);
          this.error(_plus, DmxTypeCheckingValidator.DMX.getDmxUrlLiteral_Value());
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    if (((url.getValue() != null) && url.getValue().isEmpty())) {
      this.error("Display value cannot be empty when specified", DmxTypeCheckingValidator.DMX.getDmxUrlLiteral_Display());
    }
  }
}
