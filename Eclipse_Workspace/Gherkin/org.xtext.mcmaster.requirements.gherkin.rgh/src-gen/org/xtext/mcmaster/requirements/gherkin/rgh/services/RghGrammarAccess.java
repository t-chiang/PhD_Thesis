/*
 * generated by Xtext 2.32.0
 */
package org.xtext.mcmaster.requirements.gherkin.rgh.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class RghGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.Model");
		private final Assignment cRequirementAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cRequirementStepsParserRuleCall_0 = (RuleCall)cRequirementAssignment.eContents().get(0);
		
		//Model:
		//    (requirement+=Steps)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(requirement+=Steps)*
		public Assignment getRequirementAssignment() { return cRequirementAssignment; }
		
		//Steps
		public RuleCall getRequirementStepsParserRuleCall_0() { return cRequirementStepsParserRuleCall_0; }
	}
	public class StepsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.Steps");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cContextParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGivenParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cWhenParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cThenParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Steps:
		//    Context | Given | When | Then;
		@Override public ParserRule getRule() { return rule; }
		
		//Context | Given | When | Then
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Context
		public RuleCall getContextParserRuleCall_0() { return cContextParserRuleCall_0; }
		
		//Given
		public RuleCall getGivenParserRuleCall_1() { return cGivenParserRuleCall_1; }
		
		//When
		public RuleCall getWhenParserRuleCall_2() { return cWhenParserRuleCall_2; }
		
		//Then
		public RuleCall getThenParserRuleCall_3() { return cThenParserRuleCall_3; }
	}
	public class ContextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.Context");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cModuleParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cOperationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Context:
		//    Module | Operation
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Module | Operation
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Module
		public RuleCall getModuleParserRuleCall_0() { return cModuleParserRuleCall_0; }
		
		//Operation
		public RuleCall getOperationParserRuleCall_1() { return cOperationParserRuleCall_1; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//    ID('.' ID)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ID('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class ModuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.Module");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cModuleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Module:
		//    'Module' name=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Module' name=ID
		public Group getGroup() { return cGroup; }
		
		//'Module'
		public Keyword getModuleKeyword_0() { return cModuleKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class OperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.Operation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOperationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Operation:
		//    'Operation' name=QualifiedName
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Operation' name=QualifiedName
		public Group getGroup() { return cGroup; }
		
		//'Operation'
		public Keyword getOperationKeyword_0() { return cOperationKeyword_0; }
		
		//name=QualifiedName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_1_0() { return cNameQualifiedNameParserRuleCall_1_0; }
	}
	public class GivenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.Given");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGivenAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGivenKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPreconditionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPreconditionsPreconditionParserRuleCall_3_0 = (RuleCall)cPreconditionsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Given:
		//    {Given} 'Given' '{' (preconditions+=Precondition)* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Given} 'Given' '{' (preconditions+=Precondition)* '}'
		public Group getGroup() { return cGroup; }
		
		//{Given}
		public Action getGivenAction_0() { return cGivenAction_0; }
		
		//'Given'
		public Keyword getGivenKeyword_1() { return cGivenKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//(preconditions+=Precondition)*
		public Assignment getPreconditionsAssignment_3() { return cPreconditionsAssignment_3; }
		
		//Precondition
		public RuleCall getPreconditionsPreconditionParserRuleCall_3_0() { return cPreconditionsPreconditionParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class WhenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.When");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cWhenAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cWhenKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cEventsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cEventsEventParserRuleCall_3_0 = (RuleCall)cEventsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//When:
		//    {When} 'When' '{' (events+=Event)* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{When} 'When' '{' (events+=Event)* '}'
		public Group getGroup() { return cGroup; }
		
		//{When}
		public Action getWhenAction_0() { return cWhenAction_0; }
		
		//'When'
		public Keyword getWhenKeyword_1() { return cWhenKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//(events+=Event)*
		public Assignment getEventsAssignment_3() { return cEventsAssignment_3; }
		
		//Event
		public RuleCall getEventsEventParserRuleCall_3_0() { return cEventsEventParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class ThenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.Then");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cThenAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cThenKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPostconditionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPostconditionsPostconditionParserRuleCall_3_0 = (RuleCall)cPostconditionsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Then:
		//    {Then} 'Then' '{' (postconditions+=Postcondition)* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Then} 'Then' '{' (postconditions+=Postcondition)* '}'
		public Group getGroup() { return cGroup; }
		
		//{Then}
		public Action getThenAction_0() { return cThenAction_0; }
		
		//'Then'
		public Keyword getThenKeyword_1() { return cThenKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//(postconditions+=Postcondition)*
		public Assignment getPostconditionsAssignment_3() { return cPostconditionsAssignment_3; }
		
		//Postcondition
		public RuleCall getPostconditionsPostconditionParserRuleCall_3_0() { return cPostconditionsPostconditionParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class PreconditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.Precondition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPrecondKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDescriptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDescriptionDescriptionParserRuleCall_3_0 = (RuleCall)cDescriptionAssignment_3.eContents().get(0);
		
		////And:
		////    Then | When name = ID'{' (description = Description) '}';
		//Precondition:
		//    'Precond' name = ID ':' description = Description
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Precond' name = ID ':' description = Description
		public Group getGroup() { return cGroup; }
		
		//'Precond'
		public Keyword getPrecondKeyword_0() { return cPrecondKeyword_0; }
		
		//name = ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//description = Description
		public Assignment getDescriptionAssignment_3() { return cDescriptionAssignment_3; }
		
		//Description
		public RuleCall getDescriptionDescriptionParserRuleCall_3_0() { return cDescriptionDescriptionParserRuleCall_3_0; }
	}
	public class EventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.Event");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEventKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDescriptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDescriptionDescriptionParserRuleCall_3_0 = (RuleCall)cDescriptionAssignment_3.eContents().get(0);
		
		//Event:
		//    'Event' name=ID ':' description = Description
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Event' name=ID ':' description = Description
		public Group getGroup() { return cGroup; }
		
		//'Event'
		public Keyword getEventKeyword_0() { return cEventKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//description = Description
		public Assignment getDescriptionAssignment_3() { return cDescriptionAssignment_3; }
		
		//Description
		public RuleCall getDescriptionDescriptionParserRuleCall_3_0() { return cDescriptionDescriptionParserRuleCall_3_0; }
	}
	public class PostconditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.Postcondition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPostcondKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDescriptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDescriptionDescriptionParserRuleCall_3_0 = (RuleCall)cDescriptionAssignment_3.eContents().get(0);
		
		//Postcondition:
		//    'Postcond' name=ID ':' description=Description
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Postcond' name=ID ':' description=Description
		public Group getGroup() { return cGroup; }
		
		//'Postcond'
		public Keyword getPostcondKeyword_0() { return cPostcondKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//description=Description
		public Assignment getDescriptionAssignment_3() { return cDescriptionAssignment_3; }
		
		//Description
		public RuleCall getDescriptionDescriptionParserRuleCall_3_0() { return cDescriptionDescriptionParserRuleCall_3_0; }
	}
	public class DescriptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.Description");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//Description returns Description:
		//    value = STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//value = STRING
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_0() { return cValueSTRINGTerminalRuleCall_0; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.EString");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//EString returns ecore::EString:
		//    STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	
	
	private final ModelElements pModel;
	private final StepsElements pSteps;
	private final ContextElements pContext;
	private final QualifiedNameElements pQualifiedName;
	private final ModuleElements pModule;
	private final OperationElements pOperation;
	private final GivenElements pGiven;
	private final WhenElements pWhen;
	private final ThenElements pThen;
	private final PreconditionElements pPrecondition;
	private final EventElements pEvent;
	private final PostconditionElements pPostcondition;
	private final DescriptionElements pDescription;
	private final EStringElements pEString;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public RghGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pSteps = new StepsElements();
		this.pContext = new ContextElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pModule = new ModuleElements();
		this.pOperation = new OperationElements();
		this.pGiven = new GivenElements();
		this.pWhen = new WhenElements();
		this.pThen = new ThenElements();
		this.pPrecondition = new PreconditionElements();
		this.pEvent = new EventElements();
		this.pPostcondition = new PostconditionElements();
		this.pDescription = new DescriptionElements();
		this.pEString = new EStringElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.mcmaster.requirements.gherkin.rgh.Rgh".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//    (requirement+=Steps)*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Steps:
	//    Context | Given | When | Then;
	public StepsElements getStepsAccess() {
		return pSteps;
	}
	
	public ParserRule getStepsRule() {
		return getStepsAccess().getRule();
	}
	
	//Context:
	//    Module | Operation
	//;
	public ContextElements getContextAccess() {
		return pContext;
	}
	
	public ParserRule getContextRule() {
		return getContextAccess().getRule();
	}
	
	//QualifiedName:
	//    ID('.' ID)*
	//;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//Module:
	//    'Module' name=ID
	//;
	public ModuleElements getModuleAccess() {
		return pModule;
	}
	
	public ParserRule getModuleRule() {
		return getModuleAccess().getRule();
	}
	
	//Operation:
	//    'Operation' name=QualifiedName
	//;
	public OperationElements getOperationAccess() {
		return pOperation;
	}
	
	public ParserRule getOperationRule() {
		return getOperationAccess().getRule();
	}
	
	//Given:
	//    {Given} 'Given' '{' (preconditions+=Precondition)* '}';
	public GivenElements getGivenAccess() {
		return pGiven;
	}
	
	public ParserRule getGivenRule() {
		return getGivenAccess().getRule();
	}
	
	//When:
	//    {When} 'When' '{' (events+=Event)* '}';
	public WhenElements getWhenAccess() {
		return pWhen;
	}
	
	public ParserRule getWhenRule() {
		return getWhenAccess().getRule();
	}
	
	//Then:
	//    {Then} 'Then' '{' (postconditions+=Postcondition)* '}';
	public ThenElements getThenAccess() {
		return pThen;
	}
	
	public ParserRule getThenRule() {
		return getThenAccess().getRule();
	}
	
	////And:
	////    Then | When name = ID'{' (description = Description) '}';
	//Precondition:
	//    'Precond' name = ID ':' description = Description
	//;
	public PreconditionElements getPreconditionAccess() {
		return pPrecondition;
	}
	
	public ParserRule getPreconditionRule() {
		return getPreconditionAccess().getRule();
	}
	
	//Event:
	//    'Event' name=ID ':' description = Description
	//;
	public EventElements getEventAccess() {
		return pEvent;
	}
	
	public ParserRule getEventRule() {
		return getEventAccess().getRule();
	}
	
	//Postcondition:
	//    'Postcond' name=ID ':' description=Description
	//;
	public PostconditionElements getPostconditionAccess() {
		return pPostcondition;
	}
	
	public ParserRule getPostconditionRule() {
		return getPostconditionAccess().getRule();
	}
	
	//Description returns Description:
	//    value = STRING;
	public DescriptionElements getDescriptionAccess() {
		return pDescription;
	}
	
	public ParserRule getDescriptionRule() {
		return getDescriptionAccess().getRule();
	}
	
	//EString returns ecore::EString:
	//    STRING;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
