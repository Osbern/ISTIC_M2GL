/*
* generated by Xtext
*/

package fr.istic.m2.idm.xtext.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class TopanlGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class GeometryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Geometry");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGeometryKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cNDimKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cNDimAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cNDimIntegerParserRuleCall_2_2_0 = (RuleCall)cNDimAssignment_2_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cIsCircularKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cEqualsSignKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cIsCircularAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cIsCircularBoolParserRuleCall_3_2_0 = (RuleCall)cIsCircularAssignment_3_2.eContents().get(0);
		private final Keyword cDimensionsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cEqualsSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cLeftParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cDimensionsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cDimensionsDimensionCrossReference_7_0 = (CrossReference)cDimensionsAssignment_7.eContents().get(0);
		private final RuleCall cDimensionsDimensionIDTerminalRuleCall_7_0_1 = (RuleCall)cDimensionsDimensionCrossReference_7_0.eContents().get(1);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cCommaKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cDimensionsAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final CrossReference cDimensionsDimensionCrossReference_8_1_0 = (CrossReference)cDimensionsAssignment_8_1.eContents().get(0);
		private final RuleCall cDimensionsDimensionIDTerminalRuleCall_8_1_0_1 = (RuleCall)cDimensionsDimensionCrossReference_8_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cNeighborsKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Keyword cEqualsSignKeyword_10_1 = (Keyword)cGroup_10.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_10_2 = (Keyword)cGroup_10.eContents().get(2);
		private final Assignment cNeighborsAssignment_10_3 = (Assignment)cGroup_10.eContents().get(3);
		private final CrossReference cNeighborsNeighborCrossReference_10_3_0 = (CrossReference)cNeighborsAssignment_10_3.eContents().get(0);
		private final RuleCall cNeighborsNeighborIDTerminalRuleCall_10_3_0_1 = (RuleCall)cNeighborsNeighborCrossReference_10_3_0.eContents().get(1);
		private final Group cGroup_10_4 = (Group)cGroup_10.eContents().get(4);
		private final Keyword cCommaKeyword_10_4_0 = (Keyword)cGroup_10_4.eContents().get(0);
		private final Assignment cNeighborsAssignment_10_4_1 = (Assignment)cGroup_10_4.eContents().get(1);
		private final CrossReference cNeighborsNeighborCrossReference_10_4_1_0 = (CrossReference)cNeighborsAssignment_10_4_1.eContents().get(0);
		private final RuleCall cNeighborsNeighborIDTerminalRuleCall_10_4_1_0_1 = (RuleCall)cNeighborsNeighborCrossReference_10_4_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_10_5 = (Keyword)cGroup_10.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//Geometry:
		//
		//	"Geometry" "{" ("nDim" "=" nDim=Integer)? ("isCircular" "=" isCircular=Bool)? "dimensions" "=" "("
		//
		//	dimensions+=[Dimension] ("," dimensions+=[Dimension])* ")" ("neighbors" "=" "(" neighbors+=[Neighbor] (","
		//
		//	neighbors+=[Neighbor])* ")")? "}";
		public ParserRule getRule() { return rule; }

		//"Geometry" "{" ("nDim" "=" nDim=Integer)? ("isCircular" "=" isCircular=Bool)? "dimensions" "=" "("
		//
		//dimensions+=[Dimension] ("," dimensions+=[Dimension])* ")" ("neighbors" "=" "(" neighbors+=[Neighbor] (","
		//
		//neighbors+=[Neighbor])* ")")? "}"
		public Group getGroup() { return cGroup; }

		//"Geometry"
		public Keyword getGeometryKeyword_0() { return cGeometryKeyword_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//("nDim" "=" nDim=Integer)?
		public Group getGroup_2() { return cGroup_2; }

		//"nDim"
		public Keyword getNDimKeyword_2_0() { return cNDimKeyword_2_0; }

		//"="
		public Keyword getEqualsSignKeyword_2_1() { return cEqualsSignKeyword_2_1; }

		//nDim=Integer
		public Assignment getNDimAssignment_2_2() { return cNDimAssignment_2_2; }

		//Integer
		public RuleCall getNDimIntegerParserRuleCall_2_2_0() { return cNDimIntegerParserRuleCall_2_2_0; }

		//("isCircular" "=" isCircular=Bool)?
		public Group getGroup_3() { return cGroup_3; }

		//"isCircular"
		public Keyword getIsCircularKeyword_3_0() { return cIsCircularKeyword_3_0; }

		//"="
		public Keyword getEqualsSignKeyword_3_1() { return cEqualsSignKeyword_3_1; }

		//isCircular=Bool
		public Assignment getIsCircularAssignment_3_2() { return cIsCircularAssignment_3_2; }

		//Bool
		public RuleCall getIsCircularBoolParserRuleCall_3_2_0() { return cIsCircularBoolParserRuleCall_3_2_0; }

		//"dimensions"
		public Keyword getDimensionsKeyword_4() { return cDimensionsKeyword_4; }

		//"="
		public Keyword getEqualsSignKeyword_5() { return cEqualsSignKeyword_5; }

		//"("
		public Keyword getLeftParenthesisKeyword_6() { return cLeftParenthesisKeyword_6; }

		//dimensions+=[Dimension]
		public Assignment getDimensionsAssignment_7() { return cDimensionsAssignment_7; }

		//[Dimension]
		public CrossReference getDimensionsDimensionCrossReference_7_0() { return cDimensionsDimensionCrossReference_7_0; }

		//ID
		public RuleCall getDimensionsDimensionIDTerminalRuleCall_7_0_1() { return cDimensionsDimensionIDTerminalRuleCall_7_0_1; }

		//("," dimensions+=[Dimension])*
		public Group getGroup_8() { return cGroup_8; }

		//","
		public Keyword getCommaKeyword_8_0() { return cCommaKeyword_8_0; }

		//dimensions+=[Dimension]
		public Assignment getDimensionsAssignment_8_1() { return cDimensionsAssignment_8_1; }

		//[Dimension]
		public CrossReference getDimensionsDimensionCrossReference_8_1_0() { return cDimensionsDimensionCrossReference_8_1_0; }

		//ID
		public RuleCall getDimensionsDimensionIDTerminalRuleCall_8_1_0_1() { return cDimensionsDimensionIDTerminalRuleCall_8_1_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_9() { return cRightParenthesisKeyword_9; }

		//("neighbors" "=" "(" neighbors+=[Neighbor] ("," neighbors+=[Neighbor])* ")")?
		public Group getGroup_10() { return cGroup_10; }

		//"neighbors"
		public Keyword getNeighborsKeyword_10_0() { return cNeighborsKeyword_10_0; }

		//"="
		public Keyword getEqualsSignKeyword_10_1() { return cEqualsSignKeyword_10_1; }

		//"("
		public Keyword getLeftParenthesisKeyword_10_2() { return cLeftParenthesisKeyword_10_2; }

		//neighbors+=[Neighbor]
		public Assignment getNeighborsAssignment_10_3() { return cNeighborsAssignment_10_3; }

		//[Neighbor]
		public CrossReference getNeighborsNeighborCrossReference_10_3_0() { return cNeighborsNeighborCrossReference_10_3_0; }

		//ID
		public RuleCall getNeighborsNeighborIDTerminalRuleCall_10_3_0_1() { return cNeighborsNeighborIDTerminalRuleCall_10_3_0_1; }

		//("," neighbors+=[Neighbor])*
		public Group getGroup_10_4() { return cGroup_10_4; }

		//","
		public Keyword getCommaKeyword_10_4_0() { return cCommaKeyword_10_4_0; }

		//neighbors+=[Neighbor]
		public Assignment getNeighborsAssignment_10_4_1() { return cNeighborsAssignment_10_4_1; }

		//[Neighbor]
		public CrossReference getNeighborsNeighborCrossReference_10_4_1_0() { return cNeighborsNeighborCrossReference_10_4_1_0; }

		//ID
		public RuleCall getNeighborsNeighborIDTerminalRuleCall_10_4_1_0_1() { return cNeighborsNeighborIDTerminalRuleCall_10_4_1_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_10_5() { return cRightParenthesisKeyword_10_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
	}

	public class DimensionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Dimension");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDimensionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDimensionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cSizeKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cEqualsSignKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cSizeAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cSizeIntegerParserRuleCall_3_2_0 = (RuleCall)cSizeAssignment_3_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Dimension:
		//
		//	{Dimension} "Dimension" "{" ("size" "=" size=Integer)? "}";
		public ParserRule getRule() { return rule; }

		//{Dimension} "Dimension" "{" ("size" "=" size=Integer)? "}"
		public Group getGroup() { return cGroup; }

		//{Dimension}
		public Action getDimensionAction_0() { return cDimensionAction_0; }

		//"Dimension"
		public Keyword getDimensionKeyword_1() { return cDimensionKeyword_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//("size" "=" size=Integer)?
		public Group getGroup_3() { return cGroup_3; }

		//"size"
		public Keyword getSizeKeyword_3_0() { return cSizeKeyword_3_0; }

		//"="
		public Keyword getEqualsSignKeyword_3_1() { return cEqualsSignKeyword_3_1; }

		//size=Integer
		public Assignment getSizeAssignment_3_2() { return cSizeAssignment_3_2; }

		//Integer
		public RuleCall getSizeIntegerParserRuleCall_3_2_0() { return cSizeIntegerParserRuleCall_3_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class NeighborElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Neighbor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNeighborAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cNeighborKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCoordKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cEqualsSignKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Assignment cCoordAssignment_3_3 = (Assignment)cGroup_3.eContents().get(3);
		private final RuleCall cCoordIntegerParserRuleCall_3_3_0 = (RuleCall)cCoordAssignment_3_3.eContents().get(0);
		private final Group cGroup_3_4 = (Group)cGroup_3.eContents().get(4);
		private final Keyword cCommaKeyword_3_4_0 = (Keyword)cGroup_3_4.eContents().get(0);
		private final Assignment cCoordAssignment_3_4_1 = (Assignment)cGroup_3_4.eContents().get(1);
		private final RuleCall cCoordIntegerParserRuleCall_3_4_1_0 = (RuleCall)cCoordAssignment_3_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_5 = (Keyword)cGroup_3.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Neighbor:
		//
		//	{Neighbor} "Neighbor" "{" ("coord" "=" "{" coord+=Integer ("," coord+=Integer)* "}")? "}";
		public ParserRule getRule() { return rule; }

		//{Neighbor} "Neighbor" "{" ("coord" "=" "{" coord+=Integer ("," coord+=Integer)* "}")? "}"
		public Group getGroup() { return cGroup; }

		//{Neighbor}
		public Action getNeighborAction_0() { return cNeighborAction_0; }

		//"Neighbor"
		public Keyword getNeighborKeyword_1() { return cNeighborKeyword_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//("coord" "=" "{" coord+=Integer ("," coord+=Integer)* "}")?
		public Group getGroup_3() { return cGroup_3; }

		//"coord"
		public Keyword getCoordKeyword_3_0() { return cCoordKeyword_3_0; }

		//"="
		public Keyword getEqualsSignKeyword_3_1() { return cEqualsSignKeyword_3_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3_2() { return cLeftCurlyBracketKeyword_3_2; }

		//coord+=Integer
		public Assignment getCoordAssignment_3_3() { return cCoordAssignment_3_3; }

		//Integer
		public RuleCall getCoordIntegerParserRuleCall_3_3_0() { return cCoordIntegerParserRuleCall_3_3_0; }

		//("," coord+=Integer)*
		public Group getGroup_3_4() { return cGroup_3_4; }

		//","
		public Keyword getCommaKeyword_3_4_0() { return cCommaKeyword_3_4_0; }

		//coord+=Integer
		public Assignment getCoordAssignment_3_4_1() { return cCoordAssignment_3_4_1; }

		//Integer
		public RuleCall getCoordIntegerParserRuleCall_3_4_1_0() { return cCoordIntegerParserRuleCall_3_4_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3_5() { return cRightCurlyBracketKeyword_3_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class IntegerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Integer");
		private final Keyword cIntegerKeyword = (Keyword)rule.eContents().get(1);
		
		////DataType::Integer:
		//
		/// * TODO: implement this rule and an appropriate IValueConverter * / Integer returns ecore::EInt:
		//
		//	"Integer";
		public ParserRule getRule() { return rule; }

		//"Integer"
		public Keyword getIntegerKeyword() { return cIntegerKeyword; }
	}

	public class BoolElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Bool");
		private final Keyword cBoolKeyword = (Keyword)rule.eContents().get(1);
		
		////DataType::Bool:
		//
		/// * TODO: implement this rule and an appropriate IValueConverter * / Bool returns ecore::EBoolean:
		//
		//	"Bool";
		public ParserRule getRule() { return rule; }

		//"Bool"
		public Keyword getBoolKeyword() { return cBoolKeyword; }
	}
	
	
	private GeometryElements pGeometry;
	private DimensionElements pDimension;
	private NeighborElements pNeighbor;
	private IntegerElements pInteger;
	private BoolElements pBool;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public TopanlGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.istic.m2.idm.xtext.Topanl".equals(grammar.getName())) {
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

	
	//Geometry:
	//
	//	"Geometry" "{" ("nDim" "=" nDim=Integer)? ("isCircular" "=" isCircular=Bool)? "dimensions" "=" "("
	//
	//	dimensions+=[Dimension] ("," dimensions+=[Dimension])* ")" ("neighbors" "=" "(" neighbors+=[Neighbor] (","
	//
	//	neighbors+=[Neighbor])* ")")? "}";
	public GeometryElements getGeometryAccess() {
		return (pGeometry != null) ? pGeometry : (pGeometry = new GeometryElements());
	}
	
	public ParserRule getGeometryRule() {
		return getGeometryAccess().getRule();
	}

	//Dimension:
	//
	//	{Dimension} "Dimension" "{" ("size" "=" size=Integer)? "}";
	public DimensionElements getDimensionAccess() {
		return (pDimension != null) ? pDimension : (pDimension = new DimensionElements());
	}
	
	public ParserRule getDimensionRule() {
		return getDimensionAccess().getRule();
	}

	//Neighbor:
	//
	//	{Neighbor} "Neighbor" "{" ("coord" "=" "{" coord+=Integer ("," coord+=Integer)* "}")? "}";
	public NeighborElements getNeighborAccess() {
		return (pNeighbor != null) ? pNeighbor : (pNeighbor = new NeighborElements());
	}
	
	public ParserRule getNeighborRule() {
		return getNeighborAccess().getRule();
	}

	////DataType::Integer:
	//
	/// * TODO: implement this rule and an appropriate IValueConverter * / Integer returns ecore::EInt:
	//
	//	"Integer";
	public IntegerElements getIntegerAccess() {
		return (pInteger != null) ? pInteger : (pInteger = new IntegerElements());
	}
	
	public ParserRule getIntegerRule() {
		return getIntegerAccess().getRule();
	}

	////DataType::Bool:
	//
	/// * TODO: implement this rule and an appropriate IValueConverter * / Bool returns ecore::EBoolean:
	//
	//	"Bool";
	public BoolElements getBoolAccess() {
		return (pBool != null) ? pBool : (pBool = new BoolElements());
	}
	
	public ParserRule getBoolRule() {
		return getBoolAccess().getRule();
	}

	//terminal ID:
	//
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
