/*
 * generated by Xtext 2.12.0
 */
package org.xtext.validation

import com.google.inject.Inject
import org.xtext.cPHLCL.Variable
import org.eclipse.xtext.validation.Check
import org.xtext.cPHLCL.CPHLCLPackage
import org.xtext.cPHLCL.Constraint
import org.xtext.cPHLCL.VariableRef
import  org.xtext.util.CPHlclUtil
import org.xtext.typing.TypeProvider
import org.xtext.typing.ExpressionsType
import org.xtext.cPHLCL.Expression
import org.eclipse.emf.ecore.EReference
import org.xtext.cPHLCL.Negation
import org.xtext.cPHLCL.And
import org.xtext.cPHLCL.Or
import org.xtext.cPHLCL.Implies
import org.xtext.cPHLCL.Iff

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class CPHLCLValidator extends AbstractCPHLCLValidator {
	public static val FORWARD_REFERENCE = "org.example.expressions.ForwardReference";
	public static val WRONG_TYPE ="org.example.expressions.WrongType";
	@Inject extension TypeProvider
	static val packageInstance = CPHLCLPackage.eINSTANCE

	/**
	 * Method for checking that non boolean domains are correctly declarated 
	 */
	@Check
	def checkTypeForNonBooleanDomain(Variable decl){
		if (decl.type=="boolean"){
			return
		}else{
			if (decl.domain === null){
				error("A domain declaration is required for variable '"+decl.name+"'",
					CPHLCLPackage::eINSTANCE.variable_Domain)
				return
			}
		}
	}
		/**
	 * Method for checking that a variable is already declarated 
	 */
	@Check
	def checkVarDeclaration(VariableRef varRef){
		val variable = varRef.getVariable()
		if (variable !== null 
			&& !CPHlclUtil.variableIsDefinedBefore(variable)
			) 
			error("Variables should be declared before being used: '" + variable.name + "'", 
				CPHLCLPackage::eINSTANCE.variableRef_Variable, FORWARD_REFERENCE, variable.name
			)

		}
	/*
	 * ******************************************************************************************************
	 * To verify types in the language
	 */
	def private checkExpectedType(Expression exp, ExpressionsType expectedType, EReference reference) {
		val actualType = getTypeAndCheckNotNull(exp, reference) 
		if (actualType != expectedType) 
			error("expected " + expectedType + " type, but was " + actualType, reference, WRONG_TYPE)
	}
	def private ExpressionsType getTypeAndCheckNotNull( Expression exp, EReference reference) {
		var type = exp?.typeFor 
		if (type === null)
			error("null type", reference, WRONG_TYPE) 
		return type; 
	}
	def private checkExpectedBoolean(Expression exp,EReference reference) {
		checkExpectedType(exp, TypeProvider::boolType, reference)
	} 
	def private checkExpectedInt(Expression exp, EReference reference) {
		checkExpectedType(exp, TypeProvider::intType, reference)
	}
	/**
	 * Checking the type of logic expressions
	 */
	 
	@Check def checkType(Negation not) { 
		checkExpectedBoolean(not.expression, packageInstance.negation_Expression)
	}
	
 	@Check def checkType(And and) {
 		checkExpectedBoolean(and.left, packageInstance.and_Left)
 		checkExpectedBoolean(and.right, packageInstance.and_Right)
 	} 
	
	@Check def checkType(Or or) {
 		checkExpectedBoolean(or.left, packageInstance.or_Left)
 		checkExpectedBoolean(or.right, packageInstance.or_Right)
 	}
 	@Check def checkType(Implies imp) {
 		checkExpectedBoolean(imp.left, packageInstance.implies_Left)
 		checkExpectedBoolean(imp.right, packageInstance.implies_Right)
 	}
	@Check def checkType(Iff iff) {
 		checkExpectedBoolean(iff.left, packageInstance.iff_Left)
 		checkExpectedBoolean(iff.right, packageInstance.iff_Right)
 	}
 	
 	@Check def checkType(Constraint cons) {
 		checkExpectedBoolean(cons.exp, packageInstance.constraint_Exp)
 	}
	
}