package com.coffee.generator.expressionsParser;

import com.coffee.generator.commons.IMiniZincConstants;
import com.coffee.generator.expressionsParser.IBooleanExpressionsRules;
import com.coffee.generator.expressionsParser.IExpressionsParser;

/**
 * Implementation of boolean rules
 * @author Angela Villota
 * @version HLVL V1.4
 *  May 2019
 */
@SuppressWarnings("all")
public class BooleanExpressionsRules implements IBooleanExpressionsRules, IMiniZincConstants {
  private IExpressionsParser parser;
  
  public BooleanExpressionsRules(final IExpressionsParser parser) {
    this.parser = parser;
  }
  
  @Override
  public CharSequence getAnd(final /* And */Object exp) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method parse(Object) is undefined for the type IExpressionsParser"
      + "\nThe method parse(Object) is undefined for the type IExpressionsParser"
      + "\nleft cannot be resolved"
      + "\nright cannot be resolved");
  }
  
  @Override
  public CharSequence getIff(final /* Iff */Object exp) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method parse(Object) is undefined for the type IExpressionsParser"
      + "\nThe method parse(Object) is undefined for the type IExpressionsParser"
      + "\nleft cannot be resolved"
      + "\nright cannot be resolved");
  }
  
  @Override
  public CharSequence getImplies(final /* Implies */Object exp) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method parse(Object) is undefined for the type IExpressionsParser"
      + "\nThe method parse(Object) is undefined for the type IExpressionsParser"
      + "\nleft cannot be resolved"
      + "\nright cannot be resolved");
  }
  
  @Override
  public CharSequence getNegation(final /* Negation */Object exp) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method parse(Object) is undefined for the type IExpressionsParser"
      + "\nexpression cannot be resolved");
  }
  
  @Override
  public CharSequence getOr(final /* Or */Object exp) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method parse(Object) is undefined for the type IExpressionsParser"
      + "\nThe method parse(Object) is undefined for the type IExpressionsParser"
      + "\nleft cannot be resolved"
      + "\nright cannot be resolved");
  }
  
  @Override
  public Object getVariable(final /* VariableRef */Object exp) {
    throw new Error("Unresolved compilation problems:"
      + "\nvariable cannot be resolved"
      + "\nname cannot be resolved");
  }
}
