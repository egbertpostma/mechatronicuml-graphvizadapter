/*
* generated by Xtext
*/
package org.muml.graphviz.plain.xtext.services;

import java.util.List;

import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class GraphvizPlainGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class GraphElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Graph");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGraphKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cScaleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cScaleNumberParserRuleCall_1_0 = (RuleCall)cScaleAssignment_1.eContents().get(0);
		private final Assignment cWidthAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cWidthNumberParserRuleCall_2_0 = (RuleCall)cWidthAssignment_2.eContents().get(0);
		private final Assignment cHeightAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cHeightNumberParserRuleCall_3_0 = (RuleCall)cHeightAssignment_3.eContents().get(0);
		private final Assignment cNodesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNodesNodeParserRuleCall_4_0 = (RuleCall)cNodesAssignment_4.eContents().get(0);
		private final Assignment cEdgesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cEdgesEdgeParserRuleCall_5_0 = (RuleCall)cEdgesAssignment_5.eContents().get(0);
		private final Keyword cStopKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Graph returns plain::PlainGraph:
		//	"graph" scale=Number width=Number height=Number nodes+=Node* edges+=Edge* "stop";
		public ParserRule getRule() { return rule; }

		//"graph" scale=Number width=Number height=Number nodes+=Node* edges+=Edge* "stop"
		public Group getGroup() { return cGroup; }

		//"graph"
		public Keyword getGraphKeyword_0() { return cGraphKeyword_0; }

		//scale=Number
		public Assignment getScaleAssignment_1() { return cScaleAssignment_1; }

		//Number
		public RuleCall getScaleNumberParserRuleCall_1_0() { return cScaleNumberParserRuleCall_1_0; }

		//width=Number
		public Assignment getWidthAssignment_2() { return cWidthAssignment_2; }

		//Number
		public RuleCall getWidthNumberParserRuleCall_2_0() { return cWidthNumberParserRuleCall_2_0; }

		//height=Number
		public Assignment getHeightAssignment_3() { return cHeightAssignment_3; }

		//Number
		public RuleCall getHeightNumberParserRuleCall_3_0() { return cHeightNumberParserRuleCall_3_0; }

		//nodes+=Node*
		public Assignment getNodesAssignment_4() { return cNodesAssignment_4; }

		//Node
		public RuleCall getNodesNodeParserRuleCall_4_0() { return cNodesNodeParserRuleCall_4_0; }

		//edges+=Edge*
		public Assignment getEdgesAssignment_5() { return cEdgesAssignment_5; }

		//Edge
		public RuleCall getEdgesEdgeParserRuleCall_5_0() { return cEdgesEdgeParserRuleCall_5_0; }

		//"stop"
		public Keyword getStopKeyword_6() { return cStopKeyword_6; }
	}

	public class NodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Node");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNodeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIdentifierParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cPositionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPositionPointParserRuleCall_2_0 = (RuleCall)cPositionAssignment_2.eContents().get(0);
		private final Assignment cWidthAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cWidthNumberParserRuleCall_3_0 = (RuleCall)cWidthAssignment_3.eContents().get(0);
		private final Assignment cHeightAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cHeightNumberParserRuleCall_4_0 = (RuleCall)cHeightAssignment_4.eContents().get(0);
		private final RuleCall cIdentifierParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final RuleCall cIDTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final RuleCall cIDTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final RuleCall cIDTerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		private final RuleCall cIDTerminalRuleCall_9 = (RuleCall)cGroup.eContents().get(9);
		
		//Node returns plain::PlainNode:
		//	"node" name=Identifier position=Point width=Number height=Number Identifier ID ID ID ID;
		public ParserRule getRule() { return rule; }

		//"node" name=Identifier position=Point width=Number height=Number Identifier ID ID ID ID
		public Group getGroup() { return cGroup; }

		//"node"
		public Keyword getNodeKeyword_0() { return cNodeKeyword_0; }

		//name=Identifier
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//Identifier
		public RuleCall getNameIdentifierParserRuleCall_1_0() { return cNameIdentifierParserRuleCall_1_0; }

		//position=Point
		public Assignment getPositionAssignment_2() { return cPositionAssignment_2; }

		//Point
		public RuleCall getPositionPointParserRuleCall_2_0() { return cPositionPointParserRuleCall_2_0; }

		//width=Number
		public Assignment getWidthAssignment_3() { return cWidthAssignment_3; }

		//Number
		public RuleCall getWidthNumberParserRuleCall_3_0() { return cWidthNumberParserRuleCall_3_0; }

		//height=Number
		public Assignment getHeightAssignment_4() { return cHeightAssignment_4; }

		//Number
		public RuleCall getHeightNumberParserRuleCall_4_0() { return cHeightNumberParserRuleCall_4_0; }

		//Identifier
		public RuleCall getIdentifierParserRuleCall_5() { return cIdentifierParserRuleCall_5; }

		//ID
		public RuleCall getIDTerminalRuleCall_6() { return cIDTerminalRuleCall_6; }

		//ID
		public RuleCall getIDTerminalRuleCall_7() { return cIDTerminalRuleCall_7; }

		//ID
		public RuleCall getIDTerminalRuleCall_8() { return cIDTerminalRuleCall_8; }

		//ID
		public RuleCall getIDTerminalRuleCall_9() { return cIDTerminalRuleCall_9; }
	}

	public class EdgeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Edge");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEdgeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSourceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cSourcePlainNodeCrossReference_1_0 = (CrossReference)cSourceAssignment_1.eContents().get(0);
		private final RuleCall cSourcePlainNodeIdentifierParserRuleCall_1_0_1 = (RuleCall)cSourcePlainNodeCrossReference_1_0.eContents().get(1);
		private final Assignment cTargetAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTargetPlainNodeCrossReference_2_0 = (CrossReference)cTargetAssignment_2.eContents().get(0);
		private final RuleCall cTargetPlainNodeIdentifierParserRuleCall_2_0_1 = (RuleCall)cTargetPlainNodeCrossReference_2_0.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cSplinePointsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSplinePointsPointParserRuleCall_4_0 = (RuleCall)cSplinePointsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final RuleCall cIdentifierParserRuleCall_5_0 = (RuleCall)cGroup_5.eContents().get(0);
		private final RuleCall cNumberParserRuleCall_5_1 = (RuleCall)cGroup_5.eContents().get(1);
		private final RuleCall cNumberParserRuleCall_5_2 = (RuleCall)cGroup_5.eContents().get(2);
		private final RuleCall cIDTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final RuleCall cIDTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		
		//Edge returns plain::PlainEdge:
		//	"edge" source=[plain::PlainNode|Identifier] target=[plain::PlainNode|Identifier] INT splinePoints+=Point* (Identifier
		//	Number Number)? ID ID;
		public ParserRule getRule() { return rule; }

		//"edge" source=[plain::PlainNode|Identifier] target=[plain::PlainNode|Identifier] INT splinePoints+=Point* (Identifier
		//Number Number)? ID ID
		public Group getGroup() { return cGroup; }

		//"edge"
		public Keyword getEdgeKeyword_0() { return cEdgeKeyword_0; }

		//source=[plain::PlainNode|Identifier]
		public Assignment getSourceAssignment_1() { return cSourceAssignment_1; }

		//[plain::PlainNode|Identifier]
		public CrossReference getSourcePlainNodeCrossReference_1_0() { return cSourcePlainNodeCrossReference_1_0; }

		//Identifier
		public RuleCall getSourcePlainNodeIdentifierParserRuleCall_1_0_1() { return cSourcePlainNodeIdentifierParserRuleCall_1_0_1; }

		//target=[plain::PlainNode|Identifier]
		public Assignment getTargetAssignment_2() { return cTargetAssignment_2; }

		//[plain::PlainNode|Identifier]
		public CrossReference getTargetPlainNodeCrossReference_2_0() { return cTargetPlainNodeCrossReference_2_0; }

		//Identifier
		public RuleCall getTargetPlainNodeIdentifierParserRuleCall_2_0_1() { return cTargetPlainNodeIdentifierParserRuleCall_2_0_1; }

		//INT
		public RuleCall getINTTerminalRuleCall_3() { return cINTTerminalRuleCall_3; }

		//splinePoints+=Point*
		public Assignment getSplinePointsAssignment_4() { return cSplinePointsAssignment_4; }

		//Point
		public RuleCall getSplinePointsPointParserRuleCall_4_0() { return cSplinePointsPointParserRuleCall_4_0; }

		//(Identifier Number Number)?
		public Group getGroup_5() { return cGroup_5; }

		//Identifier
		public RuleCall getIdentifierParserRuleCall_5_0() { return cIdentifierParserRuleCall_5_0; }

		//Number
		public RuleCall getNumberParserRuleCall_5_1() { return cNumberParserRuleCall_5_1; }

		//Number
		public RuleCall getNumberParserRuleCall_5_2() { return cNumberParserRuleCall_5_2; }

		//ID
		public RuleCall getIDTerminalRuleCall_6() { return cIDTerminalRuleCall_6; }

		//ID
		public RuleCall getIDTerminalRuleCall_7() { return cIDTerminalRuleCall_7; }
	}

	public class PointElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Point");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cXAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cXNumberParserRuleCall_0_0 = (RuleCall)cXAssignment_0.eContents().get(0);
		private final Assignment cYAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cYNumberParserRuleCall_1_0 = (RuleCall)cYAssignment_1.eContents().get(0);
		
		//Point returns util::Point:
		//	x=Number y=Number;
		public ParserRule getRule() { return rule; }

		//x=Number y=Number
		public Group getGroup() { return cGroup; }

		//x=Number
		public Assignment getXAssignment_0() { return cXAssignment_0; }

		//Number
		public RuleCall getXNumberParserRuleCall_0_0() { return cXNumberParserRuleCall_0_0; }

		//y=Number
		public Assignment getYAssignment_1() { return cYAssignment_1; }

		//Number
		public RuleCall getYNumberParserRuleCall_1_0() { return cYNumberParserRuleCall_1_0; }
	}

	public class NumberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Number");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final RuleCall cDOUBLETerminalRuleCall_1_0 = (RuleCall)cAlternatives_1.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		
		//Number returns ecore::EDouble:
		//	"-"? (DOUBLE | INT);
		public ParserRule getRule() { return rule; }

		//"-"? (DOUBLE | INT)
		public Group getGroup() { return cGroup; }

		//"-"?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }

		//DOUBLE | INT
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//DOUBLE
		public RuleCall getDOUBLETerminalRuleCall_1_0() { return cDOUBLETerminalRuleCall_1_0; }

		//INT
		public RuleCall getINTTerminalRuleCall_1_1() { return cINTTerminalRuleCall_1_1; }
	}

	public class IdentifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Identifier");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Identifier returns ecore::EString:
		//	ID | STRING;
		public ParserRule getRule() { return rule; }

		//ID | STRING
		public Alternatives getAlternatives() { return cAlternatives; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_1() { return cSTRINGTerminalRuleCall_1; }
	}
	
	
	private GraphElements pGraph;
	private NodeElements pNode;
	private EdgeElements pEdge;
	private PointElements pPoint;
	private NumberElements pNumber;
	private TerminalRule tDOUBLE;
	private IdentifierElements pIdentifier;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public GraphvizPlainGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.muml.graphviz.plain.xtext.GraphvizPlain".equals(grammar.getName())) {
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
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Graph returns plain::PlainGraph:
	//	"graph" scale=Number width=Number height=Number nodes+=Node* edges+=Edge* "stop";
	public GraphElements getGraphAccess() {
		return (pGraph != null) ? pGraph : (pGraph = new GraphElements());
	}
	
	public ParserRule getGraphRule() {
		return getGraphAccess().getRule();
	}

	//Node returns plain::PlainNode:
	//	"node" name=Identifier position=Point width=Number height=Number Identifier ID ID ID ID;
	public NodeElements getNodeAccess() {
		return (pNode != null) ? pNode : (pNode = new NodeElements());
	}
	
	public ParserRule getNodeRule() {
		return getNodeAccess().getRule();
	}

	//Edge returns plain::PlainEdge:
	//	"edge" source=[plain::PlainNode|Identifier] target=[plain::PlainNode|Identifier] INT splinePoints+=Point* (Identifier
	//	Number Number)? ID ID;
	public EdgeElements getEdgeAccess() {
		return (pEdge != null) ? pEdge : (pEdge = new EdgeElements());
	}
	
	public ParserRule getEdgeRule() {
		return getEdgeAccess().getRule();
	}

	//Point returns util::Point:
	//	x=Number y=Number;
	public PointElements getPointAccess() {
		return (pPoint != null) ? pPoint : (pPoint = new PointElements());
	}
	
	public ParserRule getPointRule() {
		return getPointAccess().getRule();
	}

	//Number returns ecore::EDouble:
	//	"-"? (DOUBLE | INT);
	public NumberElements getNumberAccess() {
		return (pNumber != null) ? pNumber : (pNumber = new NumberElements());
	}
	
	public ParserRule getNumberRule() {
		return getNumberAccess().getRule();
	}

	//terminal DOUBLE returns ecore::EDouble:
	//	INT+ "." INT+;
	public TerminalRule getDOUBLERule() {
		return (tDOUBLE != null) ? tDOUBLE : (tDOUBLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "DOUBLE"));
	} 

	//Identifier returns ecore::EString:
	//	ID | STRING;
	public IdentifierElements getIdentifierAccess() {
		return (pIdentifier != null) ? pIdentifier : (pIdentifier = new IdentifierElements());
	}
	
	public ParserRule getIdentifierRule() {
		return getIdentifierAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
