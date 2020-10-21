/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim.tests

import com.google.inject.Inject
import com.google.inject.Provider
import com.mimacom.ddd.dm.base.base.DAttribute
import com.mimacom.ddd.dm.base.base.DEntityType
import com.mimacom.ddd.dm.base.base.DEnumeration
import com.mimacom.ddd.dm.base.base.DInformationModel
import com.mimacom.ddd.dm.base.base.DNamespace
import com.mimacom.ddd.dm.base.base.DPrimitive
import com.mimacom.ddd.dm.base.base.DQuery
import com.mimacom.ddd.dm.base.base.DQueryParameter
import com.mimacom.ddd.dm.base.synthetic.TSyntheticAggregate
import com.mimacom.ddd.dm.base.synthetic.TSyntheticAttribute
import com.mimacom.ddd.dm.base.synthetic.TSyntheticEntityType
import com.mimacom.ddd.dm.base.synthetic.TSyntheticEnumeration
import com.mimacom.ddd.dm.base.synthetic.TSyntheticLiteral
import com.mimacom.ddd.dm.base.synthetic.TSyntheticPrimitive
import com.mimacom.ddd.dm.base.synthetic.TSyntheticQuery
import com.mimacom.ddd.dm.base.synthetic.TSyntheticQueryParameter
import com.mimacom.ddd.dm.base.transpose.ISyntheticElement
import com.mimacom.ddd.dm.base.transpose.TAggregateTransposition
import com.mimacom.ddd.dm.base.transpose.TEntityTypeTransposition
import com.mimacom.ddd.dm.base.transpose.TEnumerationTransposition
import com.mimacom.ddd.dm.base.transpose.TFeatureTransposition
import com.mimacom.ddd.dm.base.transpose.TGrabAggregateRule
import com.mimacom.ddd.dm.base.transpose.TGrabRule
import com.mimacom.ddd.dm.base.transpose.TImplicitTransposition
import com.mimacom.ddd.dm.base.transpose.TLiteralTransposition
import com.mimacom.ddd.dm.base.transpose.TPrimitiveTransposition
import com.mimacom.ddd.dm.base.transpose.TQueryParameterTransposition
import com.mimacom.ddd.dm.base.transpose.TQueryTransposition
import com.mimacom.ddd.dm.base.transpose.TransposeIndex
import com.mimacom.ddd.dm.base.transpose.TranspositionUtil
import com.mimacom.ddd.dm.dim.DimAttribute
import com.mimacom.ddd.dm.dim.DimEntityType
import com.mimacom.ddd.dm.dim.DimEnumeration
import com.mimacom.ddd.dm.dim.DimPrimitive
import com.mimacom.ddd.dm.dim.DimQuery
import com.mimacom.ddd.dm.dim.DimQueryParameter
import com.mimacom.ddd.dm.dim.DimStandaloneSetup
import com.mimacom.ddd.dm.dim.DomainInformationModel
import com.mimacom.ddd.dm.dmx.DmxArchetype
import com.mimacom.ddd.dm.dmx.DmxModel
import com.mimacom.ddd.dm.dmx.DmxStandaloneSetup
import com.mimacom.ddd.sm.sim.SystemInformationModel
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static org.junit.jupiter.api.Assertions.*

@ExtendWith(InjectionExtension)
@InjectWith(SimInjectorProvider)
class SimTranspositionTest {
	
	static val DM_TYPES_AT = QualifiedName.create("dm", "types", "AT")
	
	static val DM_DT = QualifiedName.create("DM", "DT")
	static val DM_EN = QualifiedName.create("DM", "En")
	
	static val SM_SM1_ST = QualifiedName.create("SM", "SM1", "ST")
	
	@Inject
	ParseHelper<DNamespace> simParseHelper

	final ParseHelper<DNamespace> dmxParseHelper
	final ParseHelper<DNamespace> dimParseHelper

	@Inject
	Provider<ResourceSet> resourceSetProvider
	@Inject TransposeIndex index

	new() {
		val dimInjector = new DimStandaloneSetup().createInjectorAndDoEMFRegistration()
		dimParseHelper = dimInjector.getInstance(ParseHelper)
		val dmxInjector = new DmxStandaloneSetup().createInjectorAndDoEMFRegistration()
		dmxParseHelper = dmxInjector.getInstance(ParseHelper)
	}

	protected def DmxModel loadDmx(ResourceSet rs) {
		val dmxNS = dmxParseHelper.parse('''
			namespace dm.types
			archetype AT is NUMBER
		''', rs)
		assertNoParseErrors(dmxNS, "dmx")
		val dmx = dmxNS.model as DmxModel
		assertNotNull(dmx)
		assertEquals(1, dmx.types.size)
		val at = dmx.types.head
		assertTrue(at instanceof DmxArchetype)
		
		// Check the index:
		val descs = index.getExportedDTypeDescriptions(at).toList
		assertEquals(1, descs.size)
		assertEquals(SimTranspositionTest.DM_TYPES_AT, descs.head.qualifiedName)
		val visibleDescs = index.getVisibleDTypeDescriptions(at).toList
		assertEquals(1, visibleDescs.size)
		assertEquals(SimTranspositionTest.DM_TYPES_AT, visibleDescs.head.qualifiedName)
		return dmx
	}

	protected def DomainInformationModel loadSimpleDim(ResourceSet rs, DmxArchetype at) {
		val dmNS = dimParseHelper.parse('''
			domain DM
			information model DIM {
				primitive DT redefines AT
				enumeration En { L1, L2 }
			}
		''', rs)
		assertNoParseErrors(dmNS, "dm")
		val dim = dmNS.model as DomainInformationModel
		assertNotNull(dim)
		//
		assertEquals(2, dim.types.size)
		val dt = dim.types.get(0) as DimPrimitive
		assertFalse(dt instanceof ISyntheticElement)
		assertEquals("DT", dt.name)
		assertEquals(at, dt.redefines)
		//
		val en = dim.types.get(1) as DimEnumeration
		assertFalse(dt instanceof ISyntheticElement)
		assertEquals("En", en.name)
		assertEquals(2, en.literals.size)
		assertEquals("L1", en.literals.get(0).name)
		assertEquals("L2", en.literals.get(1).name)
		
		// Check the index:
		val descs = index.getExportedDTypeDescriptions(dt).toList
		assertEquals(2, descs.size)
		assertEquals(DM_DT, descs.get(0).qualifiedName)
		assertEquals(DM_EN, descs.get(1).qualifiedName)
		val visibleDescs = index.getVisibleDTypeDescriptions(dt).toList
		assertEquals(3, visibleDescs.size)
		assertEquals(DM_TYPES_AT, visibleDescs.get(0).qualifiedName)
		assertEquals(DM_DT, visibleDescs.get(1).qualifiedName)
		assertEquals(DM_EN, visibleDescs.get(2).qualifiedName)
		return dim
	}

	protected def DInformationModel loadComponentDim(ResourceSet rs, DmxArchetype at) {
		val dimNS = dimParseHelper.parse('''
			domain DM
			information model DIM {
				component AComp {
					query q(p1 : AT) : AT
					main entity A {
						x : AT
					}
				}
			}
		''', rs)
		assertNoParseErrors(dimNS, "dm")
		val dim = dimNS.model as DomainInformationModel
		assertNotNull(dim)
		//
		assertEquals(1, dim.aggregates.size)
		val acomp = dim.aggregates.get(0)
		assertFalse(acomp instanceof ISyntheticElement)
		assertEquals("AComp", acomp.name)
		//
		assertEquals(1, acomp.features.size)
		val q = acomp.features.get(0) as DimQuery
		assertFalse(q instanceof ISyntheticElement)
		assertEquals("q", q.name)
		assertEquals(at, q.type)
		{
			assertEquals(1, q.parameters.size)
			val p1 = q.parameters.get(0) as DimQueryParameter
			assertFalse(p1 instanceof ISyntheticElement)
			assertEquals("p1", p1.name)
			assertEquals(at, p1.type)
		}
		//
		assertEquals(1, acomp.types.size)
		val a = acomp.types.get(0) as DimEntityType
		assertFalse(a instanceof ISyntheticElement)
		assertEquals("A", a.name)
		{
			assertEquals(1, a.features.size)
			val x = a.features.get(0) as DimAttribute
			assertFalse(x instanceof ISyntheticElement)
			assertEquals("x", x.name)
			assertEquals(at, x.type)
		}

		return dim
	}

	@Test
	def void grabPrimitive() {
		val resourceSet = resourceSetProvider.get
		//
		val dmx = loadDmx(resourceSet)
		val at = dmx.types.get(0) as DmxArchetype

		val dim = loadSimpleDim(resourceSet, at)
		val dt = dim.types.get(0) as DPrimitive

		val smNS = simParseHelper.parse('''
			system SM
			base type model SM1 {
				grab primitive DM.DT as ST
			}
		''', resourceSet)
		assertNoParseErrors(smNS, "sm")
		val sm = smNS.model as SystemInformationModel
		assertNotNull(sm)
		//
		assertEquals(2, sm.types.size)
		val stTransposition = sm.types.get(0) as TPrimitiveTransposition
		assertFalse(stTransposition instanceof ISyntheticElement)
		assertTrue(stTransposition.rule instanceof TGrabRule)
		//
		val st = sm.types.get(1) as TSyntheticPrimitive
		assertEquals("ST", st.name)
		assertTrue(st instanceof TSyntheticPrimitive)
		assertEquals(stTransposition, st.recipe)
		assertEquals(dt, st.recipe.rule.source)
		
		// Check the index:
		val descs = index.getExportedDTypeDescriptions(st).toList
		assertEquals(1, descs.size)
		assertEquals(SM_SM1_ST, descs.get(0).qualifiedName)
		val visibleDescs = index.getVisibleDTypeDescriptions(st).toList
		assertEquals(4, visibleDescs.size)
		assertEquals(SM_SM1_ST, visibleDescs.get(3).qualifiedName)
		val visibleMapings = index.getVisibleTTypeMappingDescriptions(st, TranspositionUtil.getTranspositionSourceQNForIndex(DM_DT)).toList
		assertEquals(1, visibleMapings.size)
		assertEquals(SM_SM1_ST, TranspositionUtil.getTranspositionTargetQN(visibleMapings.get(0)))
	}

	@Test
	def void grabEnumeration() {
		val resourceSet = resourceSetProvider.get
		//
		val dmx = loadDmx(resourceSet)
		val at = dmx.types.get(0) as DmxArchetype

		val dim = loadSimpleDim(resourceSet, at)
		val en = dim.types.get(1) as DEnumeration
		val l1 = en.literals.get(0)
		val l2 = en.literals.get(1)

		val smNS = simParseHelper.parse('''
			system SM
			base type model SM1 {
				grab enumeration DM.En as SEn1 { add L3 }
				grab enumeration DM.En as SEn2 { grab L2 as L0 }
			}
		''', resourceSet)
		assertNoParseErrors(smNS, "sm")
		val sm = smNS.model as SystemInformationModel
		assertNotNull(sm)
		//
		assertEquals(4, sm.types.size)
		val sen1Transposition = sm.types.get(0) as TEnumerationTransposition
		assertTrue(sen1Transposition.rule instanceof TGrabRule)
		//
		val sen2Transposition = sm.types.get(1) as TEnumerationTransposition
		assertTrue(sen2Transposition.rule instanceof TGrabRule)
		//
		{
			val sen1 = sm.types.get(2) as TSyntheticEnumeration
			assertEquals("SEn1", sen1.name)
			assertEquals(sen1Transposition, sen1.recipe)
			assertEquals(en, sen1.recipe.rule.source)
			//
			assertEquals(3, sen1.literals.size)
			val sl1 = sen1.literals.get(0) as TSyntheticLiteral
			assertEquals("L1", sl1.name)
			val sl1Transposition = sl1.recipe as TImplicitTransposition
			assertTrue(sl1Transposition.rule instanceof TGrabRule)
			assertEquals(l1, sl1Transposition.rule.source)
			//
			assertEquals("L2", sen1.literals.get(1).name)
			//
			val sl3 = sen1.literals.get(2) as TSyntheticLiteral
			assertEquals("L3", sl3.name)
			assertNull(sl3.recipe) // Note: NULL -- no rule, literal added explicitly
		}

		{
			val sen2 = sm.types.get(3) as TSyntheticEnumeration
			assertEquals("SEn2", sen2.name)
			assertEquals(sen2Transposition, sen2.recipe)
			assertEquals(en, sen2.recipe.rule.source)
			//
			assertEquals(1, sen2.literals.size)
			val sl0 = sen2.literals.get(0) as TSyntheticLiteral
			assertEquals("L0", sl0.name)
			val sl0Transposition = sl0.recipe as TLiteralTransposition
			assertTrue(sl0Transposition.rule instanceof TGrabRule)
			assertEquals(l2, sl0Transposition.rule.source)

		}
	}

	@Test
	def void grabEntity() {
		val resourceSet = resourceSetProvider.get
		//
		val dmx = loadDmx(resourceSet)
		val at = dmx.types.get(0) as DmxArchetype

		val dim = loadComponentDim(resourceSet, at)
		val acomp = dim.aggregates.get(0)
		val a = acomp.types.get(0) as DEntityType
		val x = a.features.get(0) as DAttribute

		val smNS = simParseHelper.parse('''
			system SM
			core information model SM1 {
				grab primitive dm.types.AT as ST
				grab root entity DM.A as SMA1 { add y : ST}
				grab root entity DM.A as SMA2 { grab x}
			}
		''', resourceSet)
		assertNoParseErrors(smNS, "sm")
		val sm = smNS.model as SystemInformationModel
		assertNotNull(sm)
		//
		assertEquals(6, sm.types.size)
		val stTransposition = sm.types.get(0) as TPrimitiveTransposition
		assertFalse(stTransposition instanceof ISyntheticElement)
		assertTrue(stTransposition.rule instanceof TGrabRule)
		
		// Check the index:
		val descs2 = index.getExportedDTypeDescriptions(stTransposition).toList
//		assertEquals(1, descs2.size)
//		assertEquals("dm.types.AT", descs2.head.qualifiedName.toString)
		val visibleDTypeDescs2 = index.getVisibleDTypeDescriptions(stTransposition).toList
//		assertEquals(1, visibleDescs2.size)
//		assertEquals("dm.types.AT", visibleDescs2.head.qualifiedName.toString)
		val visibleTranspositionDescs2 = index.getVisibleTTypeMappingDescriptions(stTransposition, DM_TYPES_AT).toList
//		assertEquals(1, visibleDTTranspositionDescs2.size)
//		assertEquals("dm.types.AT", visibleDescs2.head.qualifiedName.toString)
		//
		val sma1Transposition = sm.types.get(1) as TEntityTypeTransposition
		assertFalse(sma1Transposition instanceof ISyntheticElement)
		assertTrue(sma1Transposition.rule instanceof TGrabRule)
		//
		val sma2Transposition = sm.types.get(2) as TEntityTypeTransposition
		assertFalse(sma2Transposition instanceof ISyntheticElement)
		assertTrue(sma2Transposition.rule instanceof TGrabRule)
		//
		val st = sm.types.get(3) as TSyntheticPrimitive
		assertEquals("ST", st.name)
		assertEquals(stTransposition, st.recipe)
		assertEquals(at, st.recipe.rule.source)
		//
		val sma1 = sm.types.get(4) as TSyntheticEntityType
		assertEquals("SMA1", sma1.name)
		assertEquals(sma1Transposition, sma1.recipe)
		assertEquals(a, sma1.recipe.rule.source)
		{
			assertEquals(2, sma1.features.size)
			val smx = sma1.features.get(0) as TSyntheticAttribute
			assertEquals("x", smx.name)
			assertEquals(st, smx.type)
			val smxTransposition = smx.recipe as TImplicitTransposition
			assertTrue(smxTransposition.rule instanceof TGrabRule)
			assertEquals(x, smx.recipe.rule.source)
			//
			val smy = sma1.features.get(1) as TSyntheticAttribute
			assertEquals("y", smy.name)
			assertEquals(st, smy.type)
			assertNull(smy.recipe) // Note: NULL -- no rule, attribute added explicitly
		}
		//
		val sma2 = sm.types.get(5) as TSyntheticEntityType
		assertEquals("SMA2", sma2.name)
		assertTrue(sma2 instanceof ISyntheticElement)
		assertEquals(sma2Transposition, sma2.recipe)
		assertEquals(a, sma2.recipe.rule.source)
		{
			assertEquals(1, sma2.features.size)
			val smx = sma2.features.get(0) as TSyntheticAttribute
			assertEquals("x", smx.name)
			assertEquals(st, smx.type)
			val smxTransposition = smx.recipe as TFeatureTransposition
			assertTrue(smxTransposition.rule instanceof TGrabRule)
			assertEquals(x, smx.recipe.rule.source)
		}
	}

	@Test
	def void grabQuery() {
		val resourceSet = resourceSetProvider.get
		//
		val dmx = loadDmx(resourceSet)
		val at = dmx.types.get(0) as DmxArchetype

		val dim = loadComponentDim(resourceSet, at)
		val acomp = dim.aggregates.get(0)
		val q = acomp.features.get(0) as DimQuery
		val p1 = q.parameters.get(0) as DimQueryParameter

		val smNS = simParseHelper.parse('''
			system SM
			core information model SM1 {
				grab primitive dm.types.AT as ST
				grab aggregate DM.AComp as SAggr {
					grab query q as sq1 (add p2 : ST)
					grab query q as sq2 (grab p1 as p0)
				}
			}
		''', resourceSet)
		assertNoParseErrors(smNS, "sm")
		val sm = smNS.model as SystemInformationModel
		assertNotNull(sm)
		//
		assertEquals(2, sm.types.size)
		val stTransposition = sm.types.get(0) as TPrimitiveTransposition
		assertFalse(stTransposition instanceof ISyntheticElement)
		assertTrue(stTransposition.rule instanceof TGrabRule)
		//
		val st = sm.types.get(1) as TSyntheticPrimitive
		assertEquals("ST", st.name)
		assertEquals(stTransposition, st.recipe)
		assertEquals(at, st.recipe.rule.source)
		//
		assertEquals(2, sm.aggregates.size)
		val sAggrTransposition = sm.aggregates.get(0) as TAggregateTransposition
		assertFalse(sAggrTransposition instanceof ISyntheticElement)
		assertTrue(sAggrTransposition.rule instanceof TGrabAggregateRule)
		assertEquals(2, sAggrTransposition.features.size)
		val sq1Transposition = sAggrTransposition.features.get(0) as TQueryTransposition
		val sq2Transposition = sAggrTransposition.features.get(1) as TQueryTransposition
		//
		val sAggr = sm.aggregates.get(1) as TSyntheticAggregate
		assertEquals(sAggrTransposition, sAggr.recipe)
		assertEquals(acomp, sAggr.recipe.rule.source)
		//
		assertEquals(2, sAggr.features.size)
		val sq1 = sAggr.features.get(0) as TSyntheticQuery
		assertEquals("sq1", sq1.name)
		assertEquals(sq1Transposition, sq1.recipe)
		assertEquals(q, sq1.recipe.rule.source)
		{
			assertEquals(2, sq1.parameters.size)
			val sp1 = sq1.parameters.get(0) as TSyntheticQueryParameter
			assertEquals("p1", sp1.name)
			assertEquals(st, sp1.type)
			val sp1Transposition = sp1.recipe as TImplicitTransposition
			assertTrue(sp1Transposition.rule instanceof TGrabRule)
			assertEquals(p1, sp1.recipe.rule.source)
			//
			val sp2 = sq1.parameters.get(1) as TSyntheticQueryParameter
			assertEquals("p2", sp2.name)
			assertEquals(st, sp2.type)
			assertNull(sp2.recipe) // Note: NULL -- no rule, parameter added explicitly
		}
		//
		val sq2 = sAggr.features.get(1) as TSyntheticQuery
		assertEquals("sq2", sq2.name)
		assertEquals(sq2Transposition, sq2.recipe)
		assertEquals(q, sq2.recipe.rule.source)
		{
			assertEquals(1, sq2.parameters.size)
			val sp0 = sq2.parameters.get(0) as TSyntheticQueryParameter
			assertEquals("p0", sp0.name)
			assertEquals(st, sp0.type)
			val sp0Transposition = sp0.recipe as TQueryParameterTransposition
			assertTrue(sp0Transposition.rule instanceof TGrabRule)
			assertEquals(p1, sp0.recipe.rule.source)
		}
	}

	@Test
	def void grabAggregate() {
		val resourceSet = resourceSetProvider.get
		//
		val dmx = loadDmx(resourceSet)
		val at = dmx.types.get(0) as DmxArchetype

		val dim = loadComponentDim(resourceSet, at)
		val acomp = dim.aggregates.get(0)
		val a = acomp.types.get(0) as DEntityType
		val x = a.features.get(0) as DAttribute

		val smNS = simParseHelper.parse('''
			system SM
			core information model SM1 {
				grab primitive dm.types.AT as ST
				grab aggregate DM.AComp as SAggr {}
			}
		''', resourceSet)
		assertNoParseErrors(smNS, "sm")
		val sm = smNS.model as SystemInformationModel
		assertNotNull(sm)
		//
		assertEquals(2, sm.types.size)
		val stTransposition = sm.types.get(0) as TPrimitiveTransposition
		assertTrue(stTransposition.rule instanceof TGrabRule)
		//
		val st = sm.types.get(1) as TSyntheticPrimitive
		assertEquals("ST", st.name)
		assertEquals(stTransposition, st.recipe)
		assertEquals(at, st.recipe.rule.source)
		//
		assertEquals(2, sm.aggregates.size)
		val sAggrTransposition = sm.aggregates.get(0) as TAggregateTransposition
		assertTrue(sAggrTransposition.rule instanceof TGrabAggregateRule)
		//
		val sAggr = sm.aggregates.get(1) as TSyntheticAggregate
		assertEquals(sAggrTransposition, sAggr.recipe)
		assertEquals(acomp, sAggr.recipe.rule.source)
		//
		assertEquals(1, sAggr.types.size)
		val sma = sAggr.types.get(0) as TSyntheticEntityType
		assertEquals("A", sma.name)
		val smaTransposition = sma.recipe as TImplicitTransposition
		assertTrue(smaTransposition.rule instanceof TGrabRule)
		assertEquals(a, sma.recipe.rule.source)
		//
		assertEquals(1, sma.features.size)
		val smx = sma.features.get(0) as TSyntheticAttribute
		assertEquals("x", smx.name)
		assertEquals(st, smx.type)
		val smxTransposition = smx.recipe as TImplicitTransposition
		assertTrue(smxTransposition.rule instanceof TGrabRule)
		assertEquals(x, smx.recipe.rule.source)
	}

	protected def assertNoParseErrors(DNamespace ns, String name) {
		assertNotNull(ns)
		val errors = ns.eResource.errors
		assertTrue(errors.isEmpty, '''Unexpected errors in «name» ': «errors.join(", ")»''')
	}
}
