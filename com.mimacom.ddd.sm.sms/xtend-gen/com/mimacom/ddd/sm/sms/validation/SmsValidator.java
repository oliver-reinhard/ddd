/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sms.validation;

import com.google.common.base.Objects;
import com.mimacom.ddd.sm.sms.SComplexType;
import com.mimacom.ddd.sm.sms.SDitchTransform;
import com.mimacom.ddd.sm.sms.SElementNature;
import com.mimacom.ddd.sm.sms.SFeature;
import com.mimacom.ddd.sm.sms.SSpoofTransform;
import com.mimacom.ddd.sm.sms.STransform;
import com.mimacom.ddd.sm.sms.SmsPackage;
import com.mimacom.ddd.sm.sms.validation.AbstractSmsValidator;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class SmsValidator extends AbstractSmsValidator {
  @Check
  public void checkDeducedFeatures(final SComplexType type) {
    SElementNature _nature = type.getNature();
    boolean _equals = Objects.equal(_nature, SElementNature.DEDUCTION_RULE);
    if (_equals) {
      STransform _transform = type.getDeductionRule().getTransform();
      if ((_transform instanceof SSpoofTransform)) {
        final Function1<SFeature, Boolean> _function = (SFeature it) -> {
          return Boolean.valueOf((Objects.equal(it.getNature(), SElementNature.DEDUCTION_RULE) && (it.getDeductionRule().getTransform() instanceof SDitchTransform)));
        };
        final boolean hasDitchElements = IterableExtensions.<SFeature>exists(type.getFeatures(), _function);
        final Function1<SFeature, Boolean> _function_1 = (SFeature it) -> {
          return Boolean.valueOf((Objects.equal(it.getNature(), SElementNature.DEDUCTION_RULE) && (it.getDeductionRule().getTransform() instanceof SDitchTransform)));
        };
        final boolean hasOtherElements = IterableExtensions.<SFeature>exists(type.getFeatures(), _function_1);
        if ((hasDitchElements && hasOtherElements)) {
          this.error("Cannot declare \"ditch\" transformations with other kinds of transformations", SmsPackage.Literals.SNAMED_ELEMENT__NAME);
        }
      }
    }
  }
}