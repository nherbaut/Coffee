/*
 * generated by Xtext 2.12.0
 */
package org.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.pLhlcl.Assignment;
import org.xtext.pLhlcl.Constraint;
import org.xtext.pLhlcl.FodaBin;
import org.xtext.pLhlcl.FodaUN;
import org.xtext.pLhlcl.IDCons;
import org.xtext.pLhlcl.ListOfIDs;
import org.xtext.pLhlcl.ListOfValues;
import org.xtext.pLhlcl.Model;
import org.xtext.pLhlcl.PLhlclPackage;
import org.xtext.pLhlcl.Rule;
import org.xtext.pLhlcl.SetRefinement;
import org.xtext.pLhlcl.Structural;
import org.xtext.pLhlcl.VarDeclaration;
import org.xtext.pLhlcl.VarRefinement;
import org.xtext.pLhlcl.VariantsEnumeration;
import org.xtext.pLhlcl.VariantsInterval;
import org.xtext.services.PLhlclGrammarAccess;

@SuppressWarnings("all")
public class PLhlclSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PLhlclGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PLhlclPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PLhlclPackage.ASSIGNMENT:
				sequence_Assignment(context, (Assignment) semanticObject); 
				return; 
			case PLhlclPackage.CONSTRAINT:
				sequence_Constraint(context, (Constraint) semanticObject); 
				return; 
			case PLhlclPackage.FODA_BIN:
				sequence_FodaBin(context, (FodaBin) semanticObject); 
				return; 
			case PLhlclPackage.FODA_UN:
				sequence_FodaUN(context, (FodaUN) semanticObject); 
				return; 
			case PLhlclPackage.ID_CONS:
				sequence_IDCons(context, (IDCons) semanticObject); 
				return; 
			case PLhlclPackage.LIST_OF_IDS:
				sequence_ListOfIDs(context, (ListOfIDs) semanticObject); 
				return; 
			case PLhlclPackage.LIST_OF_VALUES:
				sequence_ListOfValues(context, (ListOfValues) semanticObject); 
				return; 
			case PLhlclPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case PLhlclPackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case PLhlclPackage.SET_REFINEMENT:
				sequence_SetRefinement(context, (SetRefinement) semanticObject); 
				return; 
			case PLhlclPackage.STRUCTURAL:
				sequence_Structural(context, (Structural) semanticObject); 
				return; 
			case PLhlclPackage.VAR_DECLARATION:
				sequence_VarDeclaration(context, (VarDeclaration) semanticObject); 
				return; 
			case PLhlclPackage.VAR_REFINEMENT:
				sequence_VarRefinement(context, (VarRefinement) semanticObject); 
				return; 
			case PLhlclPackage.VARIANTS_ENUMERATION:
				sequence_VariantsEnumeration(context, (VariantsEnumeration) semanticObject); 
				return; 
			case PLhlclPackage.VARIANTS_INTERVAL:
				sequence_VariantsInterval(context, (VariantsInterval) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ConsExpression returns Assignment
	 *     TerminalExp returns Assignment
	 *     Refinement returns Assignment
	 *     Assignment returns Assignment
	 *
	 * Constraint:
	 *     (var=ID value=Value)
	 */
	protected void sequence_Assignment(ISerializationContext context, Assignment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PLhlclPackage.Literals.ASSIGNMENT__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PLhlclPackage.Literals.ASSIGNMENT__VAR));
			if (transientValues.isValueTransient(semanticObject, PLhlclPackage.Literals.ASSIGNMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PLhlclPackage.Literals.ASSIGNMENT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssignmentAccess().getVarIDTerminalRuleCall_0_0(), semanticObject.getVar());
		feeder.accept(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Constraint returns Constraint
	 *
	 * Constraint:
	 *     (name=ID exp=ConsExpression)
	 */
	protected void sequence_Constraint(ISerializationContext context, Constraint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PLhlclPackage.Literals.CONSTRAINT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PLhlclPackage.Literals.CONSTRAINT__NAME));
			if (transientValues.isValueTransient(semanticObject, PLhlclPackage.Literals.CONSTRAINT__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PLhlclPackage.Literals.CONSTRAINT__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConstraintAccess().getExpConsExpressionParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConsExpression returns FodaBin
	 *     TerminalExp returns FodaBin
	 *     FodaBin returns FodaBin
	 *
	 * Constraint:
	 *     (var1=[VarDeclaration|ID] op=BinOp var2=[VarDeclaration|ID])
	 */
	protected void sequence_FodaBin(ISerializationContext context, FodaBin semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PLhlclPackage.Literals.FODA_BIN__VAR1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PLhlclPackage.Literals.FODA_BIN__VAR1));
			if (transientValues.isValueTransient(semanticObject, PLhlclPackage.Literals.FODA_BIN__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PLhlclPackage.Literals.FODA_BIN__OP));
			if (transientValues.isValueTransient(semanticObject, PLhlclPackage.Literals.FODA_BIN__VAR2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PLhlclPackage.Literals.FODA_BIN__VAR2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFodaBinAccess().getVar1VarDeclarationIDTerminalRuleCall_0_0_1(), semanticObject.eGet(PLhlclPackage.Literals.FODA_BIN__VAR1, false));
		feeder.accept(grammarAccess.getFodaBinAccess().getOpBinOpParserRuleCall_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getFodaBinAccess().getVar2VarDeclarationIDTerminalRuleCall_2_0_1(), semanticObject.eGet(PLhlclPackage.Literals.FODA_BIN__VAR2, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConsExpression returns FodaUN
	 *     TerminalExp returns FodaUN
	 *     FodaUN returns FodaUN
	 *
	 * Constraint:
	 *     (var1=[VarDeclaration|ID] op=UnaryOp)
	 */
	protected void sequence_FodaUN(ISerializationContext context, FodaUN semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PLhlclPackage.Literals.FODA_UN__VAR1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PLhlclPackage.Literals.FODA_UN__VAR1));
			if (transientValues.isValueTransient(semanticObject, PLhlclPackage.Literals.FODA_UN__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PLhlclPackage.Literals.FODA_UN__OP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFodaUNAccess().getVar1VarDeclarationIDTerminalRuleCall_0_0_1(), semanticObject.eGet(PLhlclPackage.Literals.FODA_UN__VAR1, false));
		feeder.accept(grammarAccess.getFodaUNAccess().getOpUnaryOpParserRuleCall_2_0(), semanticObject.getOp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConsExpression returns IDCons
	 *     TerminalExp returns IDCons
	 *     IDCons returns IDCons
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_IDCons(ISerializationContext context, IDCons semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PLhlclPackage.Literals.ID_CONS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PLhlclPackage.Literals.ID_CONS__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIDConsAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ListOfIDs returns ListOfIDs
	 *
	 * Constraint:
	 *     (ids+=[VarDeclaration|ID] ids+=[VarDeclaration|ID]*)
	 */
	protected void sequence_ListOfIDs(ISerializationContext context, ListOfIDs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ListOfValues returns ListOfValues
	 *
	 * Constraint:
	 *     (values+=Value values+=Value*)
	 */
	protected void sequence_ListOfValues(ISerializationContext context, ListOfValues semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (name=ID vars+=VarDeclaration+ constraints+=Constraint+)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConsExpression returns Rule
	 *     TerminalExp returns Rule
	 *     Rule returns Rule
	 *
	 * Constraint:
	 *     (condition=TerminalExp consequence=TerminalExp)
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PLhlclPackage.Literals.RULE__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PLhlclPackage.Literals.RULE__CONDITION));
			if (transientValues.isValueTransient(semanticObject, PLhlclPackage.Literals.RULE__CONSEQUENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PLhlclPackage.Literals.RULE__CONSEQUENCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRuleAccess().getConditionTerminalExpParserRuleCall_0_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getRuleAccess().getConsequenceTerminalExpParserRuleCall_2_0(), semanticObject.getConsequence());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConsExpression returns SetRefinement
	 *     TerminalExp returns SetRefinement
	 *     Refinement returns SetRefinement
	 *     SetRefinement returns SetRefinement
	 *
	 * Constraint:
	 *     (vars=ListOfIDs head=ListOfValues tail+=ListOfValues+)
	 */
	protected void sequence_SetRefinement(ISerializationContext context, SetRefinement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConsExpression returns Structural
	 *     TerminalExp returns Structural
	 *     Structural returns Structural
	 *
	 * Constraint:
	 *     (parent=ID group=ListOfIDs min=INT? max=INT?)
	 */
	protected void sequence_Structural(ISerializationContext context, Structural semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VarDeclaration returns VarDeclaration
	 *
	 * Constraint:
	 *     (
	 *         instantiable='instantiable'? 
	 *         min=INT? 
	 *         max=INT? 
	 *         type=VarType 
	 *         name=ID 
	 *         variants=VariantDeclaration
	 *     )
	 */
	protected void sequence_VarDeclaration(ISerializationContext context, VarDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConsExpression returns VarRefinement
	 *     TerminalExp returns VarRefinement
	 *     Refinement returns VarRefinement
	 *     VarRefinement returns VarRefinement
	 *
	 * Constraint:
	 *     (var=ID values=VariantDeclaration)
	 */
	protected void sequence_VarRefinement(ISerializationContext context, VarRefinement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PLhlclPackage.Literals.VAR_REFINEMENT__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PLhlclPackage.Literals.VAR_REFINEMENT__VAR));
			if (transientValues.isValueTransient(semanticObject, PLhlclPackage.Literals.VAR_REFINEMENT__VALUES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PLhlclPackage.Literals.VAR_REFINEMENT__VALUES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarRefinementAccess().getVarIDTerminalRuleCall_0_0(), semanticObject.getVar());
		feeder.accept(grammarAccess.getVarRefinementAccess().getValuesVariantDeclarationParserRuleCall_2_0(), semanticObject.getValues());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VariantDeclaration returns VariantsEnumeration
	 *     VariantsEnumeration returns VariantsEnumeration
	 *
	 * Constraint:
	 *     list=ListOfValues
	 */
	protected void sequence_VariantsEnumeration(ISerializationContext context, VariantsEnumeration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PLhlclPackage.Literals.VARIANTS_ENUMERATION__LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PLhlclPackage.Literals.VARIANTS_ENUMERATION__LIST));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariantsEnumerationAccess().getListListOfValuesParserRuleCall_2_0(), semanticObject.getList());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VariantDeclaration returns VariantsInterval
	 *     VariantsInterval returns VariantsInterval
	 *
	 * Constraint:
	 *     (start=Value end=Value)
	 */
	protected void sequence_VariantsInterval(ISerializationContext context, VariantsInterval semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PLhlclPackage.Literals.VARIANTS_INTERVAL__START) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PLhlclPackage.Literals.VARIANTS_INTERVAL__START));
			if (transientValues.isValueTransient(semanticObject, PLhlclPackage.Literals.VARIANTS_INTERVAL__END) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PLhlclPackage.Literals.VARIANTS_INTERVAL__END));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariantsIntervalAccess().getStartValueParserRuleCall_1_0(), semanticObject.getStart());
		feeder.accept(grammarAccess.getVariantsIntervalAccess().getEndValueParserRuleCall_3_0(), semanticObject.getEnd());
		feeder.finish();
	}
	
	
}
