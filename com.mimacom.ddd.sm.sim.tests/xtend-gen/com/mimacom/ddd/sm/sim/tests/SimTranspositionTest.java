/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim.tests;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.base.base.DAttribute;
import com.mimacom.ddd.dm.base.base.DEntityType;
import com.mimacom.ddd.dm.base.base.DEnumeration;
import com.mimacom.ddd.dm.base.base.DFeature;
import com.mimacom.ddd.dm.base.base.DInformationModel;
import com.mimacom.ddd.dm.base.base.DLiteral;
import com.mimacom.ddd.dm.base.base.DModel;
import com.mimacom.ddd.dm.base.base.DNamespace;
import com.mimacom.ddd.dm.base.base.DPrimitive;
import com.mimacom.ddd.dm.base.base.DQueryParameter;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticAggregate;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticAttribute;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticEntityType;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticEnumeration;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticLiteral;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticPrimitive;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticQuery;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticQueryParameter;
import com.mimacom.ddd.dm.base.transpose.ISyntheticElement;
import com.mimacom.ddd.dm.base.transpose.ITransposition;
import com.mimacom.ddd.dm.base.transpose.TAggregateTransposition;
import com.mimacom.ddd.dm.base.transpose.TEntityTypeTransposition;
import com.mimacom.ddd.dm.base.transpose.TEnumerationTransposition;
import com.mimacom.ddd.dm.base.transpose.TFeatureTransposition;
import com.mimacom.ddd.dm.base.transpose.TGrabAggregateRule;
import com.mimacom.ddd.dm.base.transpose.TGrabRule;
import com.mimacom.ddd.dm.base.transpose.TImplicitTransposition;
import com.mimacom.ddd.dm.base.transpose.TLiteralTransposition;
import com.mimacom.ddd.dm.base.transpose.TPrimitiveTransposition;
import com.mimacom.ddd.dm.base.transpose.TQueryParameterTransposition;
import com.mimacom.ddd.dm.base.transpose.TQueryTransposition;
import com.mimacom.ddd.dm.base.transpose.TTranspositionRule;
import com.mimacom.ddd.dm.base.transpose.TransposeIndex;
import com.mimacom.ddd.dm.base.transpose.TranspositionUtil;
import com.mimacom.ddd.dm.dim.DimAttribute;
import com.mimacom.ddd.dm.dim.DimEntityType;
import com.mimacom.ddd.dm.dim.DimEnumeration;
import com.mimacom.ddd.dm.dim.DimPrimitive;
import com.mimacom.ddd.dm.dim.DimQuery;
import com.mimacom.ddd.dm.dim.DimQueryParameter;
import com.mimacom.ddd.dm.dim.DimStandaloneSetup;
import com.mimacom.ddd.dm.dim.DomainInformationModel;
import com.mimacom.ddd.dm.dmx.DmxArchetype;
import com.mimacom.ddd.dm.dmx.DmxModel;
import com.mimacom.ddd.dm.dmx.DmxStandaloneSetup;
import com.mimacom.ddd.sm.sim.SystemInformationModel;
import com.mimacom.ddd.sm.sim.tests.SimInjectorProvider;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(SimInjectorProvider.class)
@SuppressWarnings("all")
public class SimTranspositionTest {
  private static final QualifiedName DM_TYPES_AT = QualifiedName.create("dm", "types", "AT");
  
  private static final QualifiedName DM_DT = QualifiedName.create("DM", "DT");
  
  private static final QualifiedName DM_EN = QualifiedName.create("DM", "En");
  
  private static final QualifiedName SM_SM1_ST = QualifiedName.create("SM", "SM1", "ST");
  
  @Inject
  private ParseHelper<DNamespace> simParseHelper;
  
  private final ParseHelper<DNamespace> dmxParseHelper;
  
  private final ParseHelper<DNamespace> dimParseHelper;
  
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  @Inject
  private TransposeIndex index;
  
  public SimTranspositionTest() {
    final Injector dimInjector = new DimStandaloneSetup().createInjectorAndDoEMFRegistration();
    this.dimParseHelper = dimInjector.<ParseHelper>getInstance(ParseHelper.class);
    final Injector dmxInjector = new DmxStandaloneSetup().createInjectorAndDoEMFRegistration();
    this.dmxParseHelper = dmxInjector.<ParseHelper>getInstance(ParseHelper.class);
  }
  
  protected DmxModel loadDmx(final ResourceSet rs) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("namespace dm.types");
      _builder.newLine();
      _builder.append("archetype AT is NUMBER");
      _builder.newLine();
      final DNamespace dmxNS = this.dmxParseHelper.parse(_builder, rs);
      this.assertNoParseErrors(dmxNS, "dmx");
      DModel _model = dmxNS.getModel();
      final DmxModel dmx = ((DmxModel) _model);
      Assertions.assertNotNull(dmx);
      Assertions.assertEquals(1, dmx.getTypes().size());
      final DType at = IterableExtensions.<DType>head(dmx.getTypes());
      Assertions.assertTrue((at instanceof DmxArchetype));
      final List<IEObjectDescription> descs = IterableExtensions.<IEObjectDescription>toList(this.index.getExportedDTypeDescriptions(at));
      Assertions.assertEquals(1, descs.size());
      Assertions.assertEquals(SimTranspositionTest.DM_TYPES_AT, IterableExtensions.<IEObjectDescription>head(descs).getQualifiedName());
      final List<IEObjectDescription> visibleDescs = IterableExtensions.<IEObjectDescription>toList(this.index.getVisibleDTypeDescriptions(at));
      Assertions.assertEquals(1, visibleDescs.size());
      Assertions.assertEquals(SimTranspositionTest.DM_TYPES_AT, IterableExtensions.<IEObjectDescription>head(visibleDescs).getQualifiedName());
      return dmx;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected DomainInformationModel loadSimpleDim(final ResourceSet rs, final DmxArchetype at) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("domain DM");
      _builder.newLine();
      _builder.append("information model DIM {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("primitive DT redefines AT");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("enumeration En { L1, L2 }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final DNamespace dmNS = this.dimParseHelper.parse(_builder, rs);
      this.assertNoParseErrors(dmNS, "dm");
      DModel _model = dmNS.getModel();
      final DomainInformationModel dim = ((DomainInformationModel) _model);
      Assertions.assertNotNull(dim);
      Assertions.assertEquals(2, dim.getTypes().size());
      DType _get = dim.getTypes().get(0);
      final DimPrimitive dt = ((DimPrimitive) _get);
      Assertions.assertFalse((dt instanceof ISyntheticElement));
      Assertions.assertEquals("DT", dt.getName());
      Assertions.assertEquals(at, dt.getRedefines());
      DType _get_1 = dim.getTypes().get(1);
      final DimEnumeration en = ((DimEnumeration) _get_1);
      Assertions.assertFalse((dt instanceof ISyntheticElement));
      Assertions.assertEquals("En", en.getName());
      Assertions.assertEquals(2, en.getLiterals().size());
      Assertions.assertEquals("L1", en.getLiterals().get(0).getName());
      Assertions.assertEquals("L2", en.getLiterals().get(1).getName());
      final List<IEObjectDescription> descs = IterableExtensions.<IEObjectDescription>toList(this.index.getExportedDTypeDescriptions(dt));
      Assertions.assertEquals(2, descs.size());
      Assertions.assertEquals(SimTranspositionTest.DM_DT, descs.get(0).getQualifiedName());
      Assertions.assertEquals(SimTranspositionTest.DM_EN, descs.get(1).getQualifiedName());
      final List<IEObjectDescription> visibleDescs = IterableExtensions.<IEObjectDescription>toList(this.index.getVisibleDTypeDescriptions(dt));
      Assertions.assertEquals(3, visibleDescs.size());
      Assertions.assertEquals(SimTranspositionTest.DM_TYPES_AT, visibleDescs.get(0).getQualifiedName());
      Assertions.assertEquals(SimTranspositionTest.DM_DT, visibleDescs.get(1).getQualifiedName());
      Assertions.assertEquals(SimTranspositionTest.DM_EN, visibleDescs.get(2).getQualifiedName());
      return dim;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected DInformationModel loadComponentDim(final ResourceSet rs, final DmxArchetype at) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("domain DM");
      _builder.newLine();
      _builder.append("information model DIM {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("component AComp {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("query q(p1 : AT) : AT");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("main entity A {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("x : AT");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final DNamespace dimNS = this.dimParseHelper.parse(_builder, rs);
      this.assertNoParseErrors(dimNS, "dm");
      DModel _model = dimNS.getModel();
      final DomainInformationModel dim = ((DomainInformationModel) _model);
      Assertions.assertNotNull(dim);
      Assertions.assertEquals(1, dim.getAggregates().size());
      final DAggregate acomp = dim.getAggregates().get(0);
      Assertions.assertFalse((acomp instanceof ISyntheticElement));
      Assertions.assertEquals("AComp", acomp.getName());
      Assertions.assertEquals(1, acomp.getFeatures().size());
      DFeature _get = acomp.getFeatures().get(0);
      final DimQuery q = ((DimQuery) _get);
      Assertions.assertFalse((q instanceof ISyntheticElement));
      Assertions.assertEquals("q", q.getName());
      Assertions.assertEquals(at, q.getType());
      {
        Assertions.assertEquals(1, q.getParameters().size());
        DQueryParameter _get_1 = q.getParameters().get(0);
        final DimQueryParameter p1 = ((DimQueryParameter) _get_1);
        Assertions.assertFalse((p1 instanceof ISyntheticElement));
        Assertions.assertEquals("p1", p1.getName());
        Assertions.assertEquals(at, p1.getType());
      }
      Assertions.assertEquals(1, acomp.getTypes().size());
      DType _get_1 = acomp.getTypes().get(0);
      final DimEntityType a = ((DimEntityType) _get_1);
      Assertions.assertFalse((a instanceof ISyntheticElement));
      Assertions.assertEquals("A", a.getName());
      {
        Assertions.assertEquals(1, a.getFeatures().size());
        DFeature _get_2 = a.getFeatures().get(0);
        final DimAttribute x = ((DimAttribute) _get_2);
        Assertions.assertFalse((x instanceof ISyntheticElement));
        Assertions.assertEquals("x", x.getName());
        Assertions.assertEquals(at, x.getType());
      }
      return dim;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void grabPrimitive() {
    try {
      final ResourceSet resourceSet = this.resourceSetProvider.get();
      final DmxModel dmx = this.loadDmx(resourceSet);
      DType _get = dmx.getTypes().get(0);
      final DmxArchetype at = ((DmxArchetype) _get);
      final DomainInformationModel dim = this.loadSimpleDim(resourceSet, at);
      DType _get_1 = dim.getTypes().get(0);
      final DPrimitive dt = ((DPrimitive) _get_1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("system SM");
      _builder.newLine();
      _builder.append("base type model SM1 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("grab primitive DM.DT as ST");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final DNamespace smNS = this.simParseHelper.parse(_builder, resourceSet);
      this.assertNoParseErrors(smNS, "sm");
      DModel _model = smNS.getModel();
      final SystemInformationModel sm = ((SystemInformationModel) _model);
      Assertions.assertNotNull(sm);
      Assertions.assertEquals(2, sm.getTypes().size());
      DType _get_2 = sm.getTypes().get(0);
      final TPrimitiveTransposition stTransposition = ((TPrimitiveTransposition) _get_2);
      Assertions.assertFalse((stTransposition instanceof ISyntheticElement));
      TTranspositionRule _rule = stTransposition.getRule();
      Assertions.assertTrue((_rule instanceof TGrabRule));
      DType _get_3 = sm.getTypes().get(1);
      final TSyntheticPrimitive st = ((TSyntheticPrimitive) _get_3);
      Assertions.assertEquals("ST", st.getName());
      Assertions.assertTrue((st instanceof TSyntheticPrimitive));
      Assertions.assertEquals(stTransposition, st.getRecipe());
      Assertions.assertEquals(dt, st.getRecipe().getRule().getSource());
      final List<IEObjectDescription> descs = IterableExtensions.<IEObjectDescription>toList(this.index.getExportedDTypeDescriptions(st));
      Assertions.assertEquals(1, descs.size());
      Assertions.assertEquals(SimTranspositionTest.SM_SM1_ST, descs.get(0).getQualifiedName());
      final List<IEObjectDescription> visibleDescs = IterableExtensions.<IEObjectDescription>toList(this.index.getVisibleDTypeDescriptions(st));
      Assertions.assertEquals(4, visibleDescs.size());
      Assertions.assertEquals(SimTranspositionTest.SM_SM1_ST, visibleDescs.get(3).getQualifiedName());
      final List<IEObjectDescription> visibleMapings = IterableExtensions.<IEObjectDescription>toList(this.index.getVisibleTTypeMappingDescriptions(st, TranspositionUtil.getTranspositionSourceQNForIndex(SimTranspositionTest.DM_DT)));
      Assertions.assertEquals(1, visibleMapings.size());
      Assertions.assertEquals(SimTranspositionTest.SM_SM1_ST, TranspositionUtil.getTranspositionTargetQN(visibleMapings.get(0)));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void grabEnumeration() {
    try {
      final ResourceSet resourceSet = this.resourceSetProvider.get();
      final DmxModel dmx = this.loadDmx(resourceSet);
      DType _get = dmx.getTypes().get(0);
      final DmxArchetype at = ((DmxArchetype) _get);
      final DomainInformationModel dim = this.loadSimpleDim(resourceSet, at);
      DType _get_1 = dim.getTypes().get(1);
      final DEnumeration en = ((DEnumeration) _get_1);
      final DLiteral l1 = en.getLiterals().get(0);
      final DLiteral l2 = en.getLiterals().get(1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("system SM");
      _builder.newLine();
      _builder.append("base type model SM1 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("grab enumeration DM.En as SEn1 { add L3 }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("grab enumeration DM.En as SEn2 { grab L2 as L0 }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final DNamespace smNS = this.simParseHelper.parse(_builder, resourceSet);
      this.assertNoParseErrors(smNS, "sm");
      DModel _model = smNS.getModel();
      final SystemInformationModel sm = ((SystemInformationModel) _model);
      Assertions.assertNotNull(sm);
      Assertions.assertEquals(4, sm.getTypes().size());
      DType _get_2 = sm.getTypes().get(0);
      final TEnumerationTransposition sen1Transposition = ((TEnumerationTransposition) _get_2);
      TTranspositionRule _rule = sen1Transposition.getRule();
      Assertions.assertTrue((_rule instanceof TGrabRule));
      DType _get_3 = sm.getTypes().get(1);
      final TEnumerationTransposition sen2Transposition = ((TEnumerationTransposition) _get_3);
      TTranspositionRule _rule_1 = sen2Transposition.getRule();
      Assertions.assertTrue((_rule_1 instanceof TGrabRule));
      {
        DType _get_4 = sm.getTypes().get(2);
        final TSyntheticEnumeration sen1 = ((TSyntheticEnumeration) _get_4);
        Assertions.assertEquals("SEn1", sen1.getName());
        Assertions.assertEquals(sen1Transposition, sen1.getRecipe());
        Assertions.assertEquals(en, sen1.getRecipe().getRule().getSource());
        Assertions.assertEquals(3, sen1.getLiterals().size());
        DLiteral _get_5 = sen1.getLiterals().get(0);
        final TSyntheticLiteral sl1 = ((TSyntheticLiteral) _get_5);
        Assertions.assertEquals("L1", sl1.getName());
        ITransposition _recipe = sl1.getRecipe();
        final TImplicitTransposition sl1Transposition = ((TImplicitTransposition) _recipe);
        TTranspositionRule _rule_2 = sl1Transposition.getRule();
        Assertions.assertTrue((_rule_2 instanceof TGrabRule));
        Assertions.assertEquals(l1, sl1Transposition.getRule().getSource());
        Assertions.assertEquals("L2", sen1.getLiterals().get(1).getName());
        DLiteral _get_6 = sen1.getLiterals().get(2);
        final TSyntheticLiteral sl3 = ((TSyntheticLiteral) _get_6);
        Assertions.assertEquals("L3", sl3.getName());
        Assertions.assertNull(sl3.getRecipe());
      }
      {
        DType _get_4 = sm.getTypes().get(3);
        final TSyntheticEnumeration sen2 = ((TSyntheticEnumeration) _get_4);
        Assertions.assertEquals("SEn2", sen2.getName());
        Assertions.assertEquals(sen2Transposition, sen2.getRecipe());
        Assertions.assertEquals(en, sen2.getRecipe().getRule().getSource());
        Assertions.assertEquals(1, sen2.getLiterals().size());
        DLiteral _get_5 = sen2.getLiterals().get(0);
        final TSyntheticLiteral sl0 = ((TSyntheticLiteral) _get_5);
        Assertions.assertEquals("L0", sl0.getName());
        ITransposition _recipe = sl0.getRecipe();
        final TLiteralTransposition sl0Transposition = ((TLiteralTransposition) _recipe);
        TTranspositionRule _rule_2 = sl0Transposition.getRule();
        Assertions.assertTrue((_rule_2 instanceof TGrabRule));
        Assertions.assertEquals(l2, sl0Transposition.getRule().getSource());
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void grabEntity() {
    try {
      final ResourceSet resourceSet = this.resourceSetProvider.get();
      final DmxModel dmx = this.loadDmx(resourceSet);
      DType _get = dmx.getTypes().get(0);
      final DmxArchetype at = ((DmxArchetype) _get);
      final DInformationModel dim = this.loadComponentDim(resourceSet, at);
      final DAggregate acomp = dim.getAggregates().get(0);
      DType _get_1 = acomp.getTypes().get(0);
      final DEntityType a = ((DEntityType) _get_1);
      DFeature _get_2 = a.getFeatures().get(0);
      final DAttribute x = ((DAttribute) _get_2);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("system SM");
      _builder.newLine();
      _builder.append("core information model SM1 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("grab primitive dm.types.AT as ST");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("grab root entity DM.A as SMA1 { add y : ST}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("grab root entity DM.A as SMA2 { grab x}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final DNamespace smNS = this.simParseHelper.parse(_builder, resourceSet);
      this.assertNoParseErrors(smNS, "sm");
      DModel _model = smNS.getModel();
      final SystemInformationModel sm = ((SystemInformationModel) _model);
      Assertions.assertNotNull(sm);
      Assertions.assertEquals(6, sm.getTypes().size());
      DType _get_3 = sm.getTypes().get(0);
      final TPrimitiveTransposition stTransposition = ((TPrimitiveTransposition) _get_3);
      Assertions.assertFalse((stTransposition instanceof ISyntheticElement));
      TTranspositionRule _rule = stTransposition.getRule();
      Assertions.assertTrue((_rule instanceof TGrabRule));
      final List<IEObjectDescription> descs2 = IterableExtensions.<IEObjectDescription>toList(this.index.getExportedDTypeDescriptions(stTransposition));
      final List<IEObjectDescription> visibleDTypeDescs2 = IterableExtensions.<IEObjectDescription>toList(this.index.getVisibleDTypeDescriptions(stTransposition));
      final List<IEObjectDescription> visibleTranspositionDescs2 = IterableExtensions.<IEObjectDescription>toList(this.index.getVisibleTTypeMappingDescriptions(stTransposition, SimTranspositionTest.DM_TYPES_AT));
      DType _get_4 = sm.getTypes().get(1);
      final TEntityTypeTransposition sma1Transposition = ((TEntityTypeTransposition) _get_4);
      Assertions.assertFalse((sma1Transposition instanceof ISyntheticElement));
      TTranspositionRule _rule_1 = sma1Transposition.getRule();
      Assertions.assertTrue((_rule_1 instanceof TGrabRule));
      DType _get_5 = sm.getTypes().get(2);
      final TEntityTypeTransposition sma2Transposition = ((TEntityTypeTransposition) _get_5);
      Assertions.assertFalse((sma2Transposition instanceof ISyntheticElement));
      TTranspositionRule _rule_2 = sma2Transposition.getRule();
      Assertions.assertTrue((_rule_2 instanceof TGrabRule));
      DType _get_6 = sm.getTypes().get(3);
      final TSyntheticPrimitive st = ((TSyntheticPrimitive) _get_6);
      Assertions.assertEquals("ST", st.getName());
      Assertions.assertEquals(stTransposition, st.getRecipe());
      Assertions.assertEquals(at, st.getRecipe().getRule().getSource());
      DType _get_7 = sm.getTypes().get(4);
      final TSyntheticEntityType sma1 = ((TSyntheticEntityType) _get_7);
      Assertions.assertEquals("SMA1", sma1.getName());
      Assertions.assertEquals(sma1Transposition, sma1.getRecipe());
      Assertions.assertEquals(a, sma1.getRecipe().getRule().getSource());
      {
        Assertions.assertEquals(2, sma1.getFeatures().size());
        DFeature _get_8 = sma1.getFeatures().get(0);
        final TSyntheticAttribute smx = ((TSyntheticAttribute) _get_8);
        Assertions.assertEquals("x", smx.getName());
        Assertions.assertEquals(st, smx.getType());
        ITransposition _recipe = smx.getRecipe();
        final TImplicitTransposition smxTransposition = ((TImplicitTransposition) _recipe);
        TTranspositionRule _rule_3 = smxTransposition.getRule();
        Assertions.assertTrue((_rule_3 instanceof TGrabRule));
        Assertions.assertEquals(x, smx.getRecipe().getRule().getSource());
        DFeature _get_9 = sma1.getFeatures().get(1);
        final TSyntheticAttribute smy = ((TSyntheticAttribute) _get_9);
        Assertions.assertEquals("y", smy.getName());
        Assertions.assertEquals(st, smy.getType());
        Assertions.assertNull(smy.getRecipe());
      }
      DType _get_8 = sm.getTypes().get(5);
      final TSyntheticEntityType sma2 = ((TSyntheticEntityType) _get_8);
      Assertions.assertEquals("SMA2", sma2.getName());
      Assertions.assertTrue((sma2 instanceof ISyntheticElement));
      Assertions.assertEquals(sma2Transposition, sma2.getRecipe());
      Assertions.assertEquals(a, sma2.getRecipe().getRule().getSource());
      {
        Assertions.assertEquals(1, sma2.getFeatures().size());
        DFeature _get_9 = sma2.getFeatures().get(0);
        final TSyntheticAttribute smx = ((TSyntheticAttribute) _get_9);
        Assertions.assertEquals("x", smx.getName());
        Assertions.assertEquals(st, smx.getType());
        ITransposition _recipe = smx.getRecipe();
        final TFeatureTransposition smxTransposition = ((TFeatureTransposition) _recipe);
        TTranspositionRule _rule_3 = smxTransposition.getRule();
        Assertions.assertTrue((_rule_3 instanceof TGrabRule));
        Assertions.assertEquals(x, smx.getRecipe().getRule().getSource());
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void grabQuery() {
    try {
      final ResourceSet resourceSet = this.resourceSetProvider.get();
      final DmxModel dmx = this.loadDmx(resourceSet);
      DType _get = dmx.getTypes().get(0);
      final DmxArchetype at = ((DmxArchetype) _get);
      final DInformationModel dim = this.loadComponentDim(resourceSet, at);
      final DAggregate acomp = dim.getAggregates().get(0);
      DFeature _get_1 = acomp.getFeatures().get(0);
      final DimQuery q = ((DimQuery) _get_1);
      DQueryParameter _get_2 = q.getParameters().get(0);
      final DimQueryParameter p1 = ((DimQueryParameter) _get_2);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("system SM");
      _builder.newLine();
      _builder.append("core information model SM1 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("grab primitive dm.types.AT as ST");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("grab aggregate DM.AComp as SAggr {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("grab query q as sq1 (add p2 : ST)");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("grab query q as sq2 (grab p1 as p0)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final DNamespace smNS = this.simParseHelper.parse(_builder, resourceSet);
      this.assertNoParseErrors(smNS, "sm");
      DModel _model = smNS.getModel();
      final SystemInformationModel sm = ((SystemInformationModel) _model);
      Assertions.assertNotNull(sm);
      Assertions.assertEquals(2, sm.getTypes().size());
      DType _get_3 = sm.getTypes().get(0);
      final TPrimitiveTransposition stTransposition = ((TPrimitiveTransposition) _get_3);
      Assertions.assertFalse((stTransposition instanceof ISyntheticElement));
      TTranspositionRule _rule = stTransposition.getRule();
      Assertions.assertTrue((_rule instanceof TGrabRule));
      DType _get_4 = sm.getTypes().get(1);
      final TSyntheticPrimitive st = ((TSyntheticPrimitive) _get_4);
      Assertions.assertEquals("ST", st.getName());
      Assertions.assertEquals(stTransposition, st.getRecipe());
      Assertions.assertEquals(at, st.getRecipe().getRule().getSource());
      Assertions.assertEquals(2, sm.getAggregates().size());
      DAggregate _get_5 = sm.getAggregates().get(0);
      final TAggregateTransposition sAggrTransposition = ((TAggregateTransposition) _get_5);
      Assertions.assertFalse((sAggrTransposition instanceof ISyntheticElement));
      TTranspositionRule _rule_1 = sAggrTransposition.getRule();
      Assertions.assertTrue((_rule_1 instanceof TGrabAggregateRule));
      Assertions.assertEquals(2, sAggrTransposition.getFeatures().size());
      DFeature _get_6 = sAggrTransposition.getFeatures().get(0);
      final TQueryTransposition sq1Transposition = ((TQueryTransposition) _get_6);
      DFeature _get_7 = sAggrTransposition.getFeatures().get(1);
      final TQueryTransposition sq2Transposition = ((TQueryTransposition) _get_7);
      DAggregate _get_8 = sm.getAggregates().get(1);
      final TSyntheticAggregate sAggr = ((TSyntheticAggregate) _get_8);
      Assertions.assertEquals(sAggrTransposition, sAggr.getRecipe());
      Assertions.assertEquals(acomp, sAggr.getRecipe().getRule().getSource());
      Assertions.assertEquals(2, sAggr.getFeatures().size());
      DFeature _get_9 = sAggr.getFeatures().get(0);
      final TSyntheticQuery sq1 = ((TSyntheticQuery) _get_9);
      Assertions.assertEquals("sq1", sq1.getName());
      Assertions.assertEquals(sq1Transposition, sq1.getRecipe());
      Assertions.assertEquals(q, sq1.getRecipe().getRule().getSource());
      {
        Assertions.assertEquals(2, sq1.getParameters().size());
        DQueryParameter _get_10 = sq1.getParameters().get(0);
        final TSyntheticQueryParameter sp1 = ((TSyntheticQueryParameter) _get_10);
        Assertions.assertEquals("p1", sp1.getName());
        Assertions.assertEquals(st, sp1.getType());
        ITransposition _recipe = sp1.getRecipe();
        final TImplicitTransposition sp1Transposition = ((TImplicitTransposition) _recipe);
        TTranspositionRule _rule_2 = sp1Transposition.getRule();
        Assertions.assertTrue((_rule_2 instanceof TGrabRule));
        Assertions.assertEquals(p1, sp1.getRecipe().getRule().getSource());
        DQueryParameter _get_11 = sq1.getParameters().get(1);
        final TSyntheticQueryParameter sp2 = ((TSyntheticQueryParameter) _get_11);
        Assertions.assertEquals("p2", sp2.getName());
        Assertions.assertEquals(st, sp2.getType());
        Assertions.assertNull(sp2.getRecipe());
      }
      DFeature _get_10 = sAggr.getFeatures().get(1);
      final TSyntheticQuery sq2 = ((TSyntheticQuery) _get_10);
      Assertions.assertEquals("sq2", sq2.getName());
      Assertions.assertEquals(sq2Transposition, sq2.getRecipe());
      Assertions.assertEquals(q, sq2.getRecipe().getRule().getSource());
      {
        Assertions.assertEquals(1, sq2.getParameters().size());
        DQueryParameter _get_11 = sq2.getParameters().get(0);
        final TSyntheticQueryParameter sp0 = ((TSyntheticQueryParameter) _get_11);
        Assertions.assertEquals("p0", sp0.getName());
        Assertions.assertEquals(st, sp0.getType());
        ITransposition _recipe = sp0.getRecipe();
        final TQueryParameterTransposition sp0Transposition = ((TQueryParameterTransposition) _recipe);
        TTranspositionRule _rule_2 = sp0Transposition.getRule();
        Assertions.assertTrue((_rule_2 instanceof TGrabRule));
        Assertions.assertEquals(p1, sp0.getRecipe().getRule().getSource());
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void grabAggregate() {
    try {
      final ResourceSet resourceSet = this.resourceSetProvider.get();
      final DmxModel dmx = this.loadDmx(resourceSet);
      DType _get = dmx.getTypes().get(0);
      final DmxArchetype at = ((DmxArchetype) _get);
      final DInformationModel dim = this.loadComponentDim(resourceSet, at);
      final DAggregate acomp = dim.getAggregates().get(0);
      DType _get_1 = acomp.getTypes().get(0);
      final DEntityType a = ((DEntityType) _get_1);
      DFeature _get_2 = a.getFeatures().get(0);
      final DAttribute x = ((DAttribute) _get_2);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("system SM");
      _builder.newLine();
      _builder.append("core information model SM1 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("grab primitive dm.types.AT as ST");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("grab aggregate DM.AComp as SAggr {}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final DNamespace smNS = this.simParseHelper.parse(_builder, resourceSet);
      this.assertNoParseErrors(smNS, "sm");
      DModel _model = smNS.getModel();
      final SystemInformationModel sm = ((SystemInformationModel) _model);
      Assertions.assertNotNull(sm);
      Assertions.assertEquals(2, sm.getTypes().size());
      DType _get_3 = sm.getTypes().get(0);
      final TPrimitiveTransposition stTransposition = ((TPrimitiveTransposition) _get_3);
      TTranspositionRule _rule = stTransposition.getRule();
      Assertions.assertTrue((_rule instanceof TGrabRule));
      DType _get_4 = sm.getTypes().get(1);
      final TSyntheticPrimitive st = ((TSyntheticPrimitive) _get_4);
      Assertions.assertEquals("ST", st.getName());
      Assertions.assertEquals(stTransposition, st.getRecipe());
      Assertions.assertEquals(at, st.getRecipe().getRule().getSource());
      Assertions.assertEquals(2, sm.getAggregates().size());
      DAggregate _get_5 = sm.getAggregates().get(0);
      final TAggregateTransposition sAggrTransposition = ((TAggregateTransposition) _get_5);
      TTranspositionRule _rule_1 = sAggrTransposition.getRule();
      Assertions.assertTrue((_rule_1 instanceof TGrabAggregateRule));
      DAggregate _get_6 = sm.getAggregates().get(1);
      final TSyntheticAggregate sAggr = ((TSyntheticAggregate) _get_6);
      Assertions.assertEquals(sAggrTransposition, sAggr.getRecipe());
      Assertions.assertEquals(acomp, sAggr.getRecipe().getRule().getSource());
      Assertions.assertEquals(1, sAggr.getTypes().size());
      DType _get_7 = sAggr.getTypes().get(0);
      final TSyntheticEntityType sma = ((TSyntheticEntityType) _get_7);
      Assertions.assertEquals("A", sma.getName());
      ITransposition _recipe = sma.getRecipe();
      final TImplicitTransposition smaTransposition = ((TImplicitTransposition) _recipe);
      TTranspositionRule _rule_2 = smaTransposition.getRule();
      Assertions.assertTrue((_rule_2 instanceof TGrabRule));
      Assertions.assertEquals(a, sma.getRecipe().getRule().getSource());
      Assertions.assertEquals(1, sma.getFeatures().size());
      DFeature _get_8 = sma.getFeatures().get(0);
      final TSyntheticAttribute smx = ((TSyntheticAttribute) _get_8);
      Assertions.assertEquals("x", smx.getName());
      Assertions.assertEquals(st, smx.getType());
      ITransposition _recipe_1 = smx.getRecipe();
      final TImplicitTransposition smxTransposition = ((TImplicitTransposition) _recipe_1);
      TTranspositionRule _rule_3 = smxTransposition.getRule();
      Assertions.assertTrue((_rule_3 instanceof TGrabRule));
      Assertions.assertEquals(x, smx.getRecipe().getRule().getSource());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected void assertNoParseErrors(final DNamespace ns, final String name) {
    Assertions.assertNotNull(ns);
    final EList<Resource.Diagnostic> errors = ns.eResource().getErrors();
    boolean _isEmpty = errors.isEmpty();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Unexpected errors in ");
    _builder.append(name);
    _builder.append(" \': ");
    String _join = IterableExtensions.join(errors, ", ");
    _builder.append(_join);
    Assertions.assertTrue(_isEmpty, _builder.toString());
  }
}