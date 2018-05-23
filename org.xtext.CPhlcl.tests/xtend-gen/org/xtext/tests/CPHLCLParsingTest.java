/**
 * generated by Xtext 2.12.0
 */
package org.xtext.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.cPHLCL.And;
import org.xtext.cPHLCL.BoolConstant;
import org.xtext.cPHLCL.CPHLCLPackage;
import org.xtext.cPHLCL.Comparison;
import org.xtext.cPHLCL.Constraint;
import org.xtext.cPHLCL.Equality;
import org.xtext.cPHLCL.Expression;
import org.xtext.cPHLCL.IntConstant;
import org.xtext.cPHLCL.Minus;
import org.xtext.cPHLCL.Model;
import org.xtext.cPHLCL.MulOrDiv;
import org.xtext.cPHLCL.Negation;
import org.xtext.cPHLCL.Or;
import org.xtext.cPHLCL.Plus;
import org.xtext.cPHLCL.Relational;
import org.xtext.cPHLCL.Unary;
import org.xtext.cPHLCL.VariableRef;
import org.xtext.tests.CPHLCLInjectorProvider;
import org.xtext.validation.CPHLCLValidator;

@RunWith(XtextRunner.class)
@InjectWith(CPHLCLInjectorProvider.class)
@SuppressWarnings("all")
public class CPHLCLParsingTest {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  @Inject
  @Extension
  private ParseHelper _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  /**
   * Methods to test the parser
   */
  @Test
  public void emptyModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model empty");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("variables:");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("constraints: ");
      final String model = _builder.toString();
      final Model vacio = this.parseHelper.parse(model);
      Assert.assertNotNull(vacio);
      Assert.assertTrue(vacio.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void integerVarsEnum() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model m1");
      _builder.newLine();
      _builder.append("variables:");
      _builder.newLine();
      _builder.append("integer A domain: [10, 20, 30, 40]");
      _builder.newLine();
      _builder.append("constraints: ");
      _builder.newLine();
      final String model = _builder.toString();
      final Model vacio = this.parseHelper.parse(model);
      Assert.assertNotNull(vacio);
      Assert.assertTrue(vacio.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void integerVarsInterval() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model m1");
      _builder.newLine();
      _builder.append("variables:");
      _builder.newLine();
      _builder.append("integer A domain: 1..20");
      _builder.newLine();
      _builder.append("constraints: ");
      _builder.newLine();
      final String model = _builder.toString();
      final Model vacio = this.parseHelper.parse(model);
      Assert.assertNotNull(vacio);
      Assert.assertTrue(vacio.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void boolVarDeclaration() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model m1");
      _builder.newLine();
      _builder.append("variables:");
      _builder.newLine();
      _builder.append("boolean A ");
      _builder.newLine();
      _builder.append("constraints: ");
      _builder.newLine();
      final String model = _builder.toString();
      final Model vacio = this.parseHelper.parse(model);
      Assert.assertNotNull(vacio);
      Assert.assertTrue(vacio.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Testing numeric expressions
   */
  @Test
  public void relationalOperatorsVars() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model m1");
      _builder.newLine();
      _builder.append("variables:");
      _builder.newLine();
      _builder.append("integer A domain: 1..10");
      _builder.newLine();
      _builder.append("integer B domain: 1..20");
      _builder.newLine();
      _builder.append("integer C domain: 40..50");
      _builder.newLine();
      _builder.append("constraints: ");
      _builder.newLine();
      _builder.append("c1: A=B");
      _builder.newLine();
      _builder.append("c2: A!=C");
      _builder.newLine();
      _builder.append("c3: B > C");
      _builder.newLine();
      _builder.append("c4: B >= C");
      _builder.newLine();
      _builder.append("c5: A < C");
      _builder.newLine();
      _builder.append("C6: F <= C");
      _builder.newLine();
      final String model = _builder.toString();
      final Model vacio = this.parseHelper.parse(model);
      Assert.assertNotNull(vacio);
      this.printErrors(vacio);
      Assert.assertTrue(vacio.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void referencingVars() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model m1");
      _builder.newLine();
      _builder.append("variables:");
      _builder.newLine();
      _builder.append("integer A domain: 1..10");
      _builder.newLine();
      _builder.append("constraints: ");
      _builder.newLine();
      _builder.append("c1: A=1");
      _builder.newLine();
      final String model = _builder.toString();
      final Model m1 = this.parseHelper.parse(model);
      Assert.assertNotNull(m1);
      Assert.assertTrue(m1.eResource().getErrors().isEmpty());
      this.printErrors(m1);
      Constraint _get = m1.getConstraints().get(0);
      Expression _exp = ((Constraint) _get).getExp();
      Relational _left = ((Equality) _exp).getLeft();
      Assert.assertSame(((VariableRef) _left).getVariable(), m1.getVariables().get(0));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void relationalOperatorsNums() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model m1");
      _builder.newLine();
      _builder.append("variables:");
      _builder.newLine();
      _builder.append("integer A domain: 1..10");
      _builder.newLine();
      _builder.append("integer B domain: 1..20");
      _builder.newLine();
      _builder.append("integer C domain: 40..50");
      _builder.newLine();
      _builder.append("constraints: ");
      _builder.newLine();
      _builder.append("c1: 1=1");
      _builder.newLine();
      _builder.append("c2: 2!=1");
      _builder.newLine();
      _builder.append("c3: 10 > 2");
      _builder.newLine();
      _builder.append("c4: 10 >= 2");
      _builder.newLine();
      _builder.append("c5: 1 < 5");
      _builder.newLine();
      _builder.append("C6: 1 <= 5");
      _builder.newLine();
      final String model = _builder.toString();
      final Model vacio = this.parseHelper.parse(model);
      Assert.assertNotNull(vacio);
      this.printErrors(vacio);
      Assert.assertTrue(vacio.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void arithmeticOperatorsUnary() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model m1");
      _builder.newLine();
      _builder.append("variables:");
      _builder.newLine();
      _builder.append("integer A domain: 1..10");
      _builder.newLine();
      _builder.append("integer B domain: 1..20");
      _builder.newLine();
      _builder.append("integer C domain: 40..50");
      _builder.newLine();
      _builder.append("constraints: ");
      _builder.newLine();
      _builder.append("c1: abs(1) =1");
      _builder.newLine();
      _builder.append("c2: abs(A) = 1");
      _builder.newLine();
      _builder.append("c3: sqrt(4) = 2");
      _builder.newLine();
      _builder.append("c4: sqrt(B) = 2");
      _builder.newLine();
      _builder.append("c5: abs(1) = abs(A)");
      _builder.newLine();
      _builder.append("c6: sqrt(4) = sqrt(B)");
      _builder.newLine();
      final String model = _builder.toString();
      final Model vacio = this.parseHelper.parse(model);
      Assert.assertNotNull(vacio);
      this.printErrors(vacio);
      Assert.assertTrue(vacio.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void functionOperators() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model m1");
      _builder.newLine();
      _builder.append("variables:");
      _builder.newLine();
      _builder.append("integer A domain: 1..10");
      _builder.newLine();
      _builder.append("integer B domain: 1..20");
      _builder.newLine();
      _builder.append("integer C domain: 40..50");
      _builder.newLine();
      _builder.append("constraints: ");
      _builder.newLine();
      _builder.append("c1: max(A, B)");
      _builder.newLine();
      _builder.append("c2: min(A, 10)");
      _builder.newLine();
      _builder.append("c3: pow(C,2)");
      _builder.newLine();
      _builder.append("c4: dist(max(A, C), min(B,C) )");
      _builder.newLine();
      final String model = _builder.toString();
      final Model vacio = this.parseHelper.parse(model);
      Assert.assertNotNull(vacio);
      this.printErrors(vacio);
      Assert.assertTrue(vacio.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void LogicOperators() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model m1");
      _builder.newLine();
      _builder.append("variables:");
      _builder.newLine();
      _builder.append("boolean A ");
      _builder.newLine();
      _builder.append("boolean B ");
      _builder.newLine();
      _builder.append("boolean C ");
      _builder.newLine();
      _builder.append("constraints: ");
      _builder.newLine();
      _builder.append("c1: true AND true");
      _builder.newLine();
      _builder.append("c2: ~A");
      _builder.newLine();
      _builder.append("c3: A=>B");
      _builder.newLine();
      _builder.append("c4: A<=>C");
      _builder.newLine();
      _builder.append("c5: A AND B AND C");
      _builder.newLine();
      _builder.append("C6: A AND B AND C OR A => C");
      _builder.newLine();
      final String model = _builder.toString();
      final Model vacio = this.parseHelper.parse(model);
      Assert.assertNotNull(vacio);
      this.printErrors(vacio);
      Assert.assertTrue(vacio.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Method to test that the parsing is left-rigth
   */
  @Test
  public void testPlus() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("model m1");
    _builder.newLine();
    _builder.append("variables:");
    _builder.newLine();
    _builder.append("integer A domain: 1..10");
    _builder.newLine();
    _builder.append("constraints: ");
    _builder.newLine();
    _builder.append("c1: 10 + 5 + 1 + 2");
    _builder.newLine();
    this.assertRepr(_builder, "(((10 + 5) + 1) + 2)");
  }
  
  /**
   * Method for testing the  arithmetic expressions are correctly parenthesized
   */
  @Test
  public void testPlusWithParenthesis() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("model m1");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("variables:");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("integer A domain: 1..10");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("constraints: ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("c1: ( 10 + 5 ) + ( 1 + 2 )");
    this.assertRepr(_builder, "((10 + 5) + (1 + 2))");
  }
  
  /**
   * Method to test the precedence of the arithmetic operators
   */
  @Test
  public void testPlusMulPrecedence() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("model m1");
    _builder.newLine();
    _builder.append("variables:");
    _builder.newLine();
    _builder.append("integer A domain: 1..10");
    _builder.newLine();
    _builder.append("constraints: ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("c1: 10 + 5 * 2 - 5 / 1");
    this.assertRepr(_builder, "((10 + (5 * 2)) - (5 / 1))");
  }
  
  @Test
  public void testPrecedences() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("model m1");
    _builder.newLine();
    _builder.append("variables:");
    _builder.newLine();
    _builder.append("integer A domain: 1..10");
    _builder.newLine();
    _builder.append("constraints: ");
    _builder.newLine();
    _builder.append("c1: ~true OR false AND 1>(1/3+5*2)");
    this.assertRepr(_builder, "((~true) OR (false AND (1 > ((1 / 3) + (5 * 2)))))");
  }
  
  /**
   * Testing errors and validations
   */
  @Test
  public void integerNoDomainError() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model m1");
      _builder.newLine();
      _builder.append("variables:");
      _builder.newLine();
      _builder.append("integer A ");
      _builder.newLine();
      _builder.append("constraints: ");
      _builder.newLine();
      final EObject model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertError(model, CPHLCLPackage.eINSTANCE.getVariable(), 
        null, 
        "A domain declaration is required for variable \'A\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void stringNoDomainError() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model m1");
      _builder.newLine();
      _builder.append("variables:");
      _builder.newLine();
      _builder.append("symbolic A ");
      _builder.newLine();
      _builder.append("constraints: ");
      _builder.newLine();
      final EObject model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertError(model, CPHLCLPackage.eINSTANCE.getVariable(), 
        null, 
        "A domain declaration is required for variable \'A\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void nonDeclaredVariableError() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model m1");
      _builder.newLine();
      _builder.append("variables:");
      _builder.newLine();
      _builder.append("boolean A");
      _builder.newLine();
      _builder.append("boolean B");
      _builder.newLine();
      _builder.append("constraints:");
      _builder.newLine();
      _builder.append("c1: A + B");
      _builder.newLine();
      _builder.append("c2: A + C ");
      _builder.newLine();
      final EObject model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertError(model, CPHLCLPackage.eINSTANCE.getVariable(), 
        CPHLCLValidator.FORWARD_REFERENCE, 
        "Variables should be declared before being used: \'C\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Method to obtain the textual representation of a expression
   */
  public String stringRepr(final Relational e) {
    String _switchResult = null;
    boolean _matched = false;
    if (e instanceof Plus) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(");
      Object _stringRepr = this.stringRepr(((Plus)e).getLeft());
      _builder.append(_stringRepr);
      _builder.append(" + ");
      Object _stringRepr_1 = this.stringRepr(((Plus)e).getRight());
      _builder.append(_stringRepr_1);
      _builder.append(")");
      _switchResult = _builder.toString();
    }
    if (!_matched) {
      if (e instanceof Minus) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Object _stringRepr = this.stringRepr(((Minus)e).getLeft());
        _builder.append(_stringRepr);
        _builder.append(" - ");
        Object _stringRepr_1 = this.stringRepr(((Minus)e).getRight());
        _builder.append(_stringRepr_1);
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof MulOrDiv) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Object _stringRepr = this.stringRepr(((MulOrDiv)e).getLeft());
        _builder.append(_stringRepr);
        _builder.append(" ");
        String _op = ((MulOrDiv)e).getOp();
        _builder.append(_op);
        _builder.append(" ");
        Object _stringRepr_1 = this.stringRepr(((MulOrDiv)e).getRight());
        _builder.append(_stringRepr_1);
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Comparison) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Object _stringRepr = this.stringRepr(((Comparison)e).getLeft());
        _builder.append(_stringRepr);
        _builder.append(" ");
        String _op = ((Comparison)e).getOp();
        _builder.append(_op);
        _builder.append(" ");
        Object _stringRepr_1 = this.stringRepr(((Comparison)e).getRight());
        _builder.append(_stringRepr_1);
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Equality) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Object _stringRepr = this.stringRepr(((Equality)e).getLeft());
        _builder.append(_stringRepr);
        _builder.append(" ");
        String _op = ((Equality)e).getOp();
        _builder.append(_op);
        _builder.append(" ");
        Object _stringRepr_1 = this.stringRepr(((Equality)e).getRight());
        _builder.append(_stringRepr_1);
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof And) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Object _stringRepr = this.stringRepr(((And)e).getLeft());
        _builder.append(_stringRepr);
        _builder.append(" AND ");
        Object _stringRepr_1 = this.stringRepr(((And)e).getRight());
        _builder.append(_stringRepr_1);
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Or) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Object _stringRepr = this.stringRepr(((Or)e).getLeft());
        _builder.append(_stringRepr);
        _builder.append(" OR ");
        Object _stringRepr_1 = this.stringRepr(((Or)e).getRight());
        _builder.append(_stringRepr_1);
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Negation) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(~");
        Object _stringRepr = this.stringRepr(((Negation)e).getExpression());
        _builder.append(_stringRepr);
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Unary) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        String _op = ((Unary)e).getOp();
        _builder.append(_op);
        Object _stringRepr = this.stringRepr(((Unary)e).getExpression());
        _builder.append(_stringRepr);
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof IntConstant) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        int _value = ((IntConstant)e).getValue();
        _builder.append(_value);
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _value = ((BoolConstant)e).getValue();
        _builder.append(_value);
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof VariableRef) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _name = ((VariableRef)e).getVariable().getName();
        _builder.append(_name);
        _switchResult = _builder.toString();
      }
    }
    return _switchResult.toString();
  }
  
  /**
   * Method to compare the representation of an expression and a string with the expecting values
   * USeful to test the correct parenthesizing and asociation of the arithmetic expressions
   */
  public void assertRepr(final CharSequence input, final CharSequence expected) {
    try {
      final Model model = this.parseHelper.parse(input);
      Assert.assertNotNull(model);
      Assert.assertTrue(model.eResource().getErrors().isEmpty());
      this.printErrors(model);
      Constraint _get = model.getConstraints().get(0);
      Expression _exp = ((Constraint) _get).getExp();
      Assert.assertEquals(this.stringRepr(((Relational) _exp)), expected);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * to print the parsing errors
   */
  public void printErrors(final Model model) {
    boolean _isEmpty = model.eResource().getErrors().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<Resource.Diagnostic> _errors = model.eResource().getErrors();
      for (final Resource.Diagnostic element : _errors) {
        InputOutput.<String>println(element.getMessage());
      }
    }
  }
}
