/*
 * generated by Xtext 2.12.0
 */
package org.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.services.CPHLCLGrammarAccess;

@SuppressWarnings("all")
public class CPHLCLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CPHLCLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ListOfValues_CommaKeyword_1_0_p;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_0_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CPHLCLGrammarAccess) access;
		match_ListOfValues_CommaKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0());
		match_Primary_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
		match_Primary_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_ListOfValues_CommaKeyword_1_0_p.equals(syntax))
				emit_ListOfValues_CommaKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ','+
	 *
	 * This ambiguous syntax occurs at:
	 *     values+=Value (ambiguity) values+=Value
	 */
	protected void emit_ListOfValues_CommaKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '~' expression=Primary
	 *     (rule start) (ambiguity) op=FunctionOp
	 *     (rule start) (ambiguity) op=UnaryOp
	 *     (rule start) (ambiguity) value='false'
	 *     (rule start) (ambiguity) value='true'
	 *     (rule start) (ambiguity) value=INT
	 *     (rule start) (ambiguity) variable=[Variable|ID]
	 *     (rule start) (ambiguity) {And.left=}
	 *     (rule start) (ambiguity) {Comparison.left=}
	 *     (rule start) (ambiguity) {Equality.left=}
	 *     (rule start) (ambiguity) {Iff.left=}
	 *     (rule start) (ambiguity) {Implies.left=}
	 *     (rule start) (ambiguity) {Minus.left=}
	 *     (rule start) (ambiguity) {MulOrDiv.left=}
	 *     (rule start) (ambiguity) {Or.left=}
	 *     (rule start) (ambiguity) {Plus.left=}
	 */
	protected void emit_Primary_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {And.left=}
	 *     (rule start) (ambiguity) {Comparison.left=}
	 *     (rule start) (ambiguity) {Equality.left=}
	 *     (rule start) (ambiguity) {Iff.left=}
	 *     (rule start) (ambiguity) {Implies.left=}
	 *     (rule start) (ambiguity) {Minus.left=}
	 *     (rule start) (ambiguity) {MulOrDiv.left=}
	 *     (rule start) (ambiguity) {Or.left=}
	 *     (rule start) (ambiguity) {Plus.left=}
	 */
	protected void emit_Primary_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}