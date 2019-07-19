package com.coffee.generator.expressionsParser;

import com.coffee.generator.Dialect;
import com.coffee.generator.expressionsParser.BooleanExpressionsRules;
import com.coffee.generator.expressionsParser.IBooleanExpressionsRules;
import com.coffee.generator.expressionsParser.IExpressionsParser;

/**
 * Parser for boolean expressions
 * @author Angela Villota
 * @version HLVL V1.4
 *  May 2019
 */
@SuppressWarnings("all")
public class BooleanExpressionsParser implements IExpressionsParser {
  /**
   * Tranformation rules
   */
  private IBooleanExpressionsRules rules;
  
  private Dialect dialect;
  
  public BooleanExpressionsParser() {
    BooleanExpressionsRules _booleanExpressionsRules = new BooleanExpressionsRules(this);
    this.rules = _booleanExpressionsRules;
  }
  
  @Override
  public void setDialect(final Dialect dialect) {
    this.dialect = dialect;
  }
  
  @Override
  public Object parse(final /* Relational */Object exp) {
    throw new Error("Unresolved compilation problems:"
      + "\nBoolConstant cannot be resolved to a type."
      + "\nVariableRef cannot be resolved to a type."
      + "\nNegation cannot be resolved to a type."
      + "\nIff cannot be resolved to a type."
      + "\nImplies cannot be resolved to a type."
      + "\nOr cannot be resolved to a type."
      + "\nAnd cannot be resolved to a type."
      + "\nThe method getVariable(Relational) is undefined for the type IBooleanExpressionsRules"
      + "\nThe method getNegation(Relational) is undefined for the type IBooleanExpressionsRules"
      + "\nThe method getIff(Relational) is undefined for the type IBooleanExpressionsRules"
      + "\nThe method getImplies(Relational) is undefined for the type IBooleanExpressionsRules"
      + "\nThe method getOr(Relational) is undefined for the type IBooleanExpressionsRules"
      + "\nThe method getAnd(Relational) is undefined for the type IBooleanExpressionsRules"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nvalue cannot be resolved");
  }
}
