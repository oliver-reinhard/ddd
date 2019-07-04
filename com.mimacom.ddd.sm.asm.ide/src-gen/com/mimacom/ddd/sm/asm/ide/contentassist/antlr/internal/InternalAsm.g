/*
 * generated by Xtext 2.17.1
 */
grammar InternalAsm;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package com.mimacom.ddd.sm.asm.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package com.mimacom.ddd.sm.asm.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.mimacom.ddd.sm.asm.services.AsmGrammarAccess;

}
@parser::members {
	private AsmGrammarAccess grammarAccess;

	public void setGrammarAccess(AsmGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getAlternatives()); }
		(rule__Model__Alternatives)
		{ after(grammarAccess.getModelAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSApplication
entryRuleSApplication
:
{ before(grammarAccess.getSApplicationRule()); }
	 ruleSApplication
{ after(grammarAccess.getSApplicationRule()); } 
	 EOF 
;

// Rule SApplication
ruleSApplication 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSApplicationAccess().getGroup()); }
		(rule__SApplication__Group__0)
		{ after(grammarAccess.getSApplicationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSServiceInterface
entryRuleSServiceInterface
:
{ before(grammarAccess.getSServiceInterfaceRule()); }
	 ruleSServiceInterface
{ after(grammarAccess.getSServiceInterfaceRule()); } 
	 EOF 
;

// Rule SServiceInterface
ruleSServiceInterface 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSServiceInterfaceAccess().getGroup()); }
		(rule__SServiceInterface__Group__0)
		{ after(grammarAccess.getSServiceInterfaceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSImport
entryRuleSImport
:
{ before(grammarAccess.getSImportRule()); }
	 ruleSImport
{ after(grammarAccess.getSImportRule()); } 
	 EOF 
;

// Rule SImport
ruleSImport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSImportAccess().getGroup()); }
		(rule__SImport__Group__0)
		{ after(grammarAccess.getSImportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSActor
entryRuleSActor
:
{ before(grammarAccess.getSActorRule()); }
	 ruleSActor
{ after(grammarAccess.getSActorRule()); } 
	 EOF 
;

// Rule SActor
ruleSActor 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSActorAccess().getAlternatives()); }
		(rule__SActor__Alternatives)
		{ after(grammarAccess.getSActorAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSWatchdog
entryRuleSWatchdog
:
{ before(grammarAccess.getSWatchdogRule()); }
	 ruleSWatchdog
{ after(grammarAccess.getSWatchdogRule()); } 
	 EOF 
;

// Rule SWatchdog
ruleSWatchdog 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSWatchdogAccess().getGroup()); }
		(rule__SWatchdog__Group__0)
		{ after(grammarAccess.getSWatchdogAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSHuman
entryRuleSHuman
:
{ before(grammarAccess.getSHumanRule()); }
	 ruleSHuman
{ after(grammarAccess.getSHumanRule()); } 
	 EOF 
;

// Rule SHuman
ruleSHuman 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSHumanAccess().getGroup()); }
		(rule__SHuman__Group__0)
		{ after(grammarAccess.getSHumanAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSServiceOperation
entryRuleSServiceOperation
:
{ before(grammarAccess.getSServiceOperationRule()); }
	 ruleSServiceOperation
{ after(grammarAccess.getSServiceOperationRule()); } 
	 EOF 
;

// Rule SServiceOperation
ruleSServiceOperation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSServiceOperationAccess().getGroup()); }
		(rule__SServiceOperation__Group__0)
		{ after(grammarAccess.getSServiceOperationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSOperationParameter
entryRuleSOperationParameter
:
{ before(grammarAccess.getSOperationParameterRule()); }
	 ruleSOperationParameter
{ after(grammarAccess.getSOperationParameterRule()); } 
	 EOF 
;

// Rule SOperationParameter
ruleSOperationParameter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSOperationParameterAccess().getNameAssignment()); }
		(rule__SOperationParameter__NameAssignment)
		{ after(grammarAccess.getSOperationParameterAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSException
entryRuleSException
:
{ before(grammarAccess.getSExceptionRule()); }
	 ruleSException
{ after(grammarAccess.getSExceptionRule()); } 
	 EOF 
;

// Rule SException
ruleSException 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSExceptionAccess().getNameAssignment()); }
		(rule__SException__NameAssignment)
		{ after(grammarAccess.getSExceptionAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSQualifiedNameWithWildcard
entryRuleSQualifiedNameWithWildcard
:
{ before(grammarAccess.getSQualifiedNameWithWildcardRule()); }
	 ruleSQualifiedNameWithWildcard
{ after(grammarAccess.getSQualifiedNameWithWildcardRule()); } 
	 EOF 
;

// Rule SQualifiedNameWithWildcard
ruleSQualifiedNameWithWildcard 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSQualifiedNameWithWildcardAccess().getGroup()); }
		(rule__SQualifiedNameWithWildcard__Group__0)
		{ after(grammarAccess.getSQualifiedNameWithWildcardAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSQualifiedName
entryRuleSQualifiedName
:
{ before(grammarAccess.getSQualifiedNameRule()); }
	 ruleSQualifiedName
{ after(grammarAccess.getSQualifiedNameRule()); } 
	 EOF 
;

// Rule SQualifiedName
ruleSQualifiedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSQualifiedNameAccess().getGroup()); }
		(rule__SQualifiedName__Group__0)
		{ after(grammarAccess.getSQualifiedNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getSApplicationParserRuleCall_0()); }
		ruleSApplication
		{ after(grammarAccess.getModelAccess().getSApplicationParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getModelAccess().getSServiceInterfaceParserRuleCall_1()); }
		ruleSServiceInterface
		{ after(grammarAccess.getModelAccess().getSServiceInterfaceParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SActor__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSActorAccess().getSWatchdogParserRuleCall_0()); }
		ruleSWatchdog
		{ after(grammarAccess.getSActorAccess().getSWatchdogParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSActorAccess().getSHumanParserRuleCall_1()); }
		ruleSHuman
		{ after(grammarAccess.getSActorAccess().getSHumanParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SApplication__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SApplication__Group__0__Impl
	rule__SApplication__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SApplication__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSApplicationAccess().getApplicationKeyword_0()); }
	'application'
	{ after(grammarAccess.getSApplicationAccess().getApplicationKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SApplication__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SApplication__Group__1__Impl
	rule__SApplication__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SApplication__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSApplicationAccess().getNameAssignment_1()); }
	(rule__SApplication__NameAssignment_1)
	{ after(grammarAccess.getSApplicationAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SApplication__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SApplication__Group__2__Impl
	rule__SApplication__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SApplication__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSApplicationAccess().getImportsAssignment_2()); }
	(rule__SApplication__ImportsAssignment_2)*
	{ after(grammarAccess.getSApplicationAccess().getImportsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SApplication__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SApplication__Group__3__Impl
	rule__SApplication__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SApplication__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSApplicationAccess().getInformationKeyword_3()); }
	'information'
	{ after(grammarAccess.getSApplicationAccess().getInformationKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SApplication__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SApplication__Group__4__Impl
	rule__SApplication__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SApplication__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSApplicationAccess().getModelKeyword_4()); }
	'model'
	{ after(grammarAccess.getSApplicationAccess().getModelKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SApplication__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SApplication__Group__5__Impl
	rule__SApplication__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__SApplication__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSApplicationAccess().getModelAssignment_5()); }
	(rule__SApplication__ModelAssignment_5)
	{ after(grammarAccess.getSApplicationAccess().getModelAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SApplication__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SApplication__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SApplication__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSApplicationAccess().getActorsAssignment_6()); }
	(rule__SApplication__ActorsAssignment_6)*
	{ after(grammarAccess.getSApplicationAccess().getActorsAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SServiceInterface__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SServiceInterface__Group__0__Impl
	rule__SServiceInterface__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceInterface__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSServiceInterfaceAccess().getServiceKeyword_0()); }
	'service'
	{ after(grammarAccess.getSServiceInterfaceAccess().getServiceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceInterface__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SServiceInterface__Group__1__Impl
	rule__SServiceInterface__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceInterface__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSServiceInterfaceAccess().getInterfaceKeyword_1()); }
	'interface'
	{ after(grammarAccess.getSServiceInterfaceAccess().getInterfaceKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceInterface__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SServiceInterface__Group__2__Impl
	rule__SServiceInterface__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceInterface__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSServiceInterfaceAccess().getNameAssignment_2()); }
	(rule__SServiceInterface__NameAssignment_2)
	{ after(grammarAccess.getSServiceInterfaceAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceInterface__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SServiceInterface__Group__3__Impl
	rule__SServiceInterface__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceInterface__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSServiceInterfaceAccess().getImportsAssignment_3()); }
	(rule__SServiceInterface__ImportsAssignment_3)*
	{ after(grammarAccess.getSServiceInterfaceAccess().getImportsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceInterface__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SServiceInterface__Group__4__Impl
	rule__SServiceInterface__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceInterface__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSServiceInterfaceAccess().getInformationKeyword_4()); }
	'information'
	{ after(grammarAccess.getSServiceInterfaceAccess().getInformationKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceInterface__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SServiceInterface__Group__5__Impl
	rule__SServiceInterface__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceInterface__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSServiceInterfaceAccess().getModelKeyword_5()); }
	'model'
	{ after(grammarAccess.getSServiceInterfaceAccess().getModelKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceInterface__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SServiceInterface__Group__6__Impl
	rule__SServiceInterface__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceInterface__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSServiceInterfaceAccess().getModelAssignment_6()); }
	(rule__SServiceInterface__ModelAssignment_6)
	{ after(grammarAccess.getSServiceInterfaceAccess().getModelAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceInterface__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SServiceInterface__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceInterface__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSServiceInterfaceAccess().getOperationsAssignment_7()); }
	(rule__SServiceInterface__OperationsAssignment_7)
	{ after(grammarAccess.getSServiceInterfaceAccess().getOperationsAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SImport__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SImport__Group__0__Impl
	rule__SImport__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SImport__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSImportAccess().getImportKeyword_0()); }
	'import'
	{ after(grammarAccess.getSImportAccess().getImportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SImport__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SImport__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SImport__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSImportAccess().getImportedNamespaceAssignment_1()); }
	(rule__SImport__ImportedNamespaceAssignment_1)
	{ after(grammarAccess.getSImportAccess().getImportedNamespaceAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SWatchdog__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SWatchdog__Group__0__Impl
	rule__SWatchdog__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SWatchdog__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSWatchdogAccess().getWatchdogKeyword_0()); }
	'watchdog'
	{ after(grammarAccess.getSWatchdogAccess().getWatchdogKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SWatchdog__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SWatchdog__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SWatchdog__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSWatchdogAccess().getNameAssignment_1()); }
	(rule__SWatchdog__NameAssignment_1)
	{ after(grammarAccess.getSWatchdogAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SHuman__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SHuman__Group__0__Impl
	rule__SHuman__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SHuman__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSHumanAccess().getHumanKeyword_0()); }
	'human'
	{ after(grammarAccess.getSHumanAccess().getHumanKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SHuman__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SHuman__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SHuman__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSHumanAccess().getNameAssignment_1()); }
	(rule__SHuman__NameAssignment_1)
	{ after(grammarAccess.getSHumanAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SServiceOperation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SServiceOperation__Group__0__Impl
	rule__SServiceOperation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceOperation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSServiceOperationAccess().getOperationKeyword_0()); }
	'operation'
	{ after(grammarAccess.getSServiceOperationAccess().getOperationKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceOperation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SServiceOperation__Group__1__Impl
	rule__SServiceOperation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceOperation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSServiceOperationAccess().getNameAssignment_1()); }
	(rule__SServiceOperation__NameAssignment_1)
	{ after(grammarAccess.getSServiceOperationAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceOperation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SServiceOperation__Group__2__Impl
	rule__SServiceOperation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceOperation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSServiceOperationAccess().getLeftParenthesisKeyword_2()); }
	'('
	{ after(grammarAccess.getSServiceOperationAccess().getLeftParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceOperation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SServiceOperation__Group__3__Impl
	rule__SServiceOperation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceOperation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSServiceOperationAccess().getParametersAssignment_3()); }
	(rule__SServiceOperation__ParametersAssignment_3)*
	{ after(grammarAccess.getSServiceOperationAccess().getParametersAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceOperation__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SServiceOperation__Group__4__Impl
	rule__SServiceOperation__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceOperation__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSServiceOperationAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getSServiceOperationAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceOperation__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SServiceOperation__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceOperation__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSServiceOperationAccess().getGroup_5()); }
	(rule__SServiceOperation__Group_5__0)?
	{ after(grammarAccess.getSServiceOperationAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SServiceOperation__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SServiceOperation__Group_5__0__Impl
	rule__SServiceOperation__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceOperation__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSServiceOperationAccess().getRaisesKeyword_5_0()); }
	'raises'
	{ after(grammarAccess.getSServiceOperationAccess().getRaisesKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceOperation__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SServiceOperation__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceOperation__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSServiceOperationAccess().getExceptionsAssignment_5_1()); }
		(rule__SServiceOperation__ExceptionsAssignment_5_1)
		{ after(grammarAccess.getSServiceOperationAccess().getExceptionsAssignment_5_1()); }
	)
	(
		{ before(grammarAccess.getSServiceOperationAccess().getExceptionsAssignment_5_1()); }
		(rule__SServiceOperation__ExceptionsAssignment_5_1)*
		{ after(grammarAccess.getSServiceOperationAccess().getExceptionsAssignment_5_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SQualifiedNameWithWildcard__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SQualifiedNameWithWildcard__Group__0__Impl
	rule__SQualifiedNameWithWildcard__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SQualifiedNameWithWildcard__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSQualifiedNameWithWildcardAccess().getSQualifiedNameParserRuleCall_0()); }
	ruleSQualifiedName
	{ after(grammarAccess.getSQualifiedNameWithWildcardAccess().getSQualifiedNameParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SQualifiedNameWithWildcard__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SQualifiedNameWithWildcard__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SQualifiedNameWithWildcard__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); }
	('.*')?
	{ after(grammarAccess.getSQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SQualifiedName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SQualifiedName__Group__0__Impl
	rule__SQualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SQualifiedName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getSQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SQualifiedName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SQualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SQualifiedName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSQualifiedNameAccess().getGroup_1()); }
	(rule__SQualifiedName__Group_1__0)*
	{ after(grammarAccess.getSQualifiedNameAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SQualifiedName__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SQualifiedName__Group_1__0__Impl
	rule__SQualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SQualifiedName__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSQualifiedNameAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getSQualifiedNameAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SQualifiedName__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SQualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SQualifiedName__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getSQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SApplication__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSApplicationAccess().getNameSQualifiedNameParserRuleCall_1_0()); }
		ruleSQualifiedName
		{ after(grammarAccess.getSApplicationAccess().getNameSQualifiedNameParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SApplication__ImportsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSApplicationAccess().getImportsSImportParserRuleCall_2_0()); }
		ruleSImport
		{ after(grammarAccess.getSApplicationAccess().getImportsSImportParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SApplication__ModelAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSApplicationAccess().getModelSInformationModelCrossReference_5_0()); }
		(
			{ before(grammarAccess.getSApplicationAccess().getModelSInformationModelIDTerminalRuleCall_5_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSApplicationAccess().getModelSInformationModelIDTerminalRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getSApplicationAccess().getModelSInformationModelCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SApplication__ActorsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSApplicationAccess().getActorsSActorParserRuleCall_6_0()); }
		ruleSActor
		{ after(grammarAccess.getSApplicationAccess().getActorsSActorParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceInterface__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSServiceInterfaceAccess().getNameSQualifiedNameParserRuleCall_2_0()); }
		ruleSQualifiedName
		{ after(grammarAccess.getSServiceInterfaceAccess().getNameSQualifiedNameParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceInterface__ImportsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSServiceInterfaceAccess().getImportsSImportParserRuleCall_3_0()); }
		ruleSImport
		{ after(grammarAccess.getSServiceInterfaceAccess().getImportsSImportParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceInterface__ModelAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSServiceInterfaceAccess().getModelSInformationModelCrossReference_6_0()); }
		(
			{ before(grammarAccess.getSServiceInterfaceAccess().getModelSInformationModelIDTerminalRuleCall_6_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSServiceInterfaceAccess().getModelSInformationModelIDTerminalRuleCall_6_0_1()); }
		)
		{ after(grammarAccess.getSServiceInterfaceAccess().getModelSInformationModelCrossReference_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceInterface__OperationsAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSServiceInterfaceAccess().getOperationsSServiceOperationParserRuleCall_7_0()); }
		ruleSServiceOperation
		{ after(grammarAccess.getSServiceInterfaceAccess().getOperationsSServiceOperationParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SImport__ImportedNamespaceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSImportAccess().getImportedNamespaceSQualifiedNameWithWildcardParserRuleCall_1_0()); }
		ruleSQualifiedNameWithWildcard
		{ after(grammarAccess.getSImportAccess().getImportedNamespaceSQualifiedNameWithWildcardParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SWatchdog__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSWatchdogAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getSWatchdogAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SHuman__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSHumanAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getSHumanAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceOperation__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSServiceOperationAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getSServiceOperationAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceOperation__ParametersAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSServiceOperationAccess().getParametersSOperationParameterParserRuleCall_3_0()); }
		ruleSOperationParameter
		{ after(grammarAccess.getSServiceOperationAccess().getParametersSOperationParameterParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SServiceOperation__ExceptionsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSServiceOperationAccess().getExceptionsSExceptionParserRuleCall_5_1_0()); }
		ruleSException
		{ after(grammarAccess.getSServiceOperationAccess().getExceptionsSExceptionParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SOperationParameter__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSOperationParameterAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getSOperationParameterAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SException__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSExceptionAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getSExceptionAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
