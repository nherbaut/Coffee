package com.coffee.generator.boolParser;

import com.coffee.generator.Dialect;
import com.coffee.generator.TransformationRules;
import com.coffee.generator.commons.IMiniZincConstants;
import com.coffee.generator.expressionsParser.BooleanExpressionsParser;
import java.util.List;
import java.util.Map;

/**
 * class implementing the boolean transformation rules for in Benavides2010
 * for obtaining the HLCL representation in the MiniZinc language.
 * This class implements TransformationRules
 * @author Angela Villota
 * @version HLVL V1.4
 * August 2018
 * updated on May 2019
 * modified on July 2019 to comply with the modifications in the syntax method: getDecomposition
 * fixed a bug in the group with cardinality [1,1]
 */
@SuppressWarnings("all")
public class BooleanRules extends TransformationRules implements IMiniZincConstants {
  /**
   * integer variable to produce the identifiers for the variables and constraints
   * in visibility relations
   */
  private int visibilityIdCounter;
  
  private BooleanExpressionsParser expressionsParser;
  
  public BooleanRules(final Dialect dialect) {
    BooleanExpressionsParser _booleanExpressionsParser = new BooleanExpressionsParser();
    this.expressionsParser = _booleanExpressionsParser;
    this.expressionsParser.setDialect(dialect);
    this.visibilityIdCounter = 0;
  }
  
  @Override
  public CharSequence getConstant(final /* ElmDeclaration */Object element) {
    throw new Error("Unresolved compilation problems:"
      + "\nConstantDecl cannot be resolved to a type."
      + "\nBoolVal cannot be resolved to a type."
      + "\ndeclaration cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nname cannot be resolved"
      + "\nvalue cannot be resolved");
  }
  
  @Override
  public CharSequence getElement(final /* ElmDeclaration */Object element) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  @Override
  public String getCore(final /* Common */Object core) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getCoreSingle(ElmDeclaration) from the type BooleanRules refers to the missing type ElmDeclaration"
      + "\nelements cannot be resolved"
      + "\nvalues cannot be resolved");
  }
  
  @Override
  public CharSequence getCoreSingle(final /* ElmDeclaration */Object element) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  @Override
  public String getDecomposition(final /* Decomposition */Object rel, final /* Map<String, ElmDeclaration> */Object parents) {
    throw new Error("Unresolved compilation problems:"
      + "\nchildren cannot be resolved"
      + "\nvalues cannot be resolved"
      + "\nname cannot be resolved"
      + "\nparent cannot be resolved"
      + "\nmin cannot be resolved"
      + "\n== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nmax cannot be resolved"
      + "\n== cannot be resolved"
      + "\nparent cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nparent cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  @Override
  public String getGroup(final /* Group */Object rel, final /* Map<String, ElmDeclaration> */Object parents) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getXor(Group, Map<String, ElmDeclaration>) from the type BooleanRules refers to the missing type Group"
      + "\nThe method getOR(Group, Map<String, ElmDeclaration>) from the type BooleanRules refers to the missing type Group"
      + "\nmin cannot be resolved"
      + "\n== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nmax cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  public String getXor(final /* Group */Object rel, final /* Map<String, ElmDeclaration> */Object parents) {
    throw new Error("Unresolved compilation problems:"
      + "\nchildren cannot be resolved"
      + "\nvalues cannot be resolved"
      + "\nname cannot be resolved"
      + "\nparent cannot be resolved"
      + "\nname cannot be resolved"
      + "\nchildren cannot be resolved"
      + "\nvalues cannot be resolved"
      + "\nname cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nparent cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  public String getOR(final /* Group */Object rel, final /* Map<String, ElmDeclaration> */Object parents) {
    throw new Error("Unresolved compilation problems:"
      + "\nparent cannot be resolved"
      + "\nname cannot be resolved"
      + "\nchildren cannot be resolved"
      + "\nvalues cannot be resolved"
      + "\nname cannot be resolved"
      + "\nparent cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  @Override
  public CharSequence getImpliesPair(final /* ElmDeclaration */Object left, final /* ElmDeclaration */Object right) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  @Override
  public CharSequence getMutexPair(final /* ElmDeclaration */Object left, final /* ElmDeclaration */Object right) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  @Override
  public String getImpliesList(final /* VarList */Object rel) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getImpliesPair(ElmDeclaration, ElmDeclaration) from the type BooleanRules refers to the missing type ElmDeclaration"
      + "\nlist cannot be resolved"
      + "\nvalues cannot be resolved"
      + "\nvar1 cannot be resolved");
  }
  
  @Override
  public String getMutexList(final /* VarList */Object rel) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getMutexPair(ElmDeclaration, ElmDeclaration) from the type BooleanRules refers to the missing type ElmDeclaration"
      + "\nlist cannot be resolved"
      + "\nvalues cannot be resolved"
      + "\nvar1 cannot be resolved");
  }
  
  @Override
  public CharSequence getExpression(final /* Relational */Object exp) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method parse(Object) from the type BooleanExpressionsParser refers to the missing type Object");
  }
  
  @Override
  public String getVisibility(final /* Visibility */Object rel, final List<CharSequence> relations) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method parse(Object) from the type BooleanExpressionsParser refers to the missing type Object"
      + "\ncondition cannot be resolved");
  }
}
