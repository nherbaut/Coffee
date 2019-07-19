package com.coffee.generator.cnf;

import com.coffee.generator.TransformationRules;
import com.coffee.generator.common.ExpressionsParser;
import com.coffee.generator.minizinc.IConstants;
import java.util.List;
import java.util.Map;

@SuppressWarnings("all")
public class CNFFactory extends TransformationRules implements IConstants {
  private int visibility = 0;
  
  private ExpressionsParser expressionsParser;
  
  public CNFFactory() {
    ExpressionsParser _expressionsParser = new ExpressionsParser();
    this.expressionsParser = _expressionsParser;
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
  public CharSequence getCore(final /* Core */Object core) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getCoreSingle(ElmDeclaration) from the type CNFFactory refers to the missing type ElmDeclaration"
      + "\nelements cannot be resolved"
      + "\nvalues cannot be resolved");
  }
  
  @Override
  public CharSequence getCoreSingle(final /* ElmDeclaration */Object element) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  @Override
  public CharSequence getDecomposition(final /* Decomposition */Object rel, final /* Map<String, ElmDeclaration> */Object parents) {
    throw new Error("Unresolved compilation problems:"
      + "\nchildren cannot be resolved"
      + "\nvalues cannot be resolved"
      + "\nname cannot be resolved"
      + "\nparent cannot be resolved"
      + "\ncardinality cannot be resolved"
      + "\n== cannot be resolved"
      + "\nparent cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nparent cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  @Override
  public CharSequence getGroup(final /* Group */Object rel, final /* Map<String, ElmDeclaration> */Object parents) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getXor(Group, Map<String, ElmDeclaration>) from the type CNFFactory refers to the missing type Group"
      + "\nThe method getOR(Group, Map<String, ElmDeclaration>) from the type CNFFactory refers to the missing type Group"
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
  public CharSequence getImpliesList(final /* VarList */Object rel) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getImpliesPair(ElmDeclaration, ElmDeclaration) from the type CNFFactory refers to the missing type ElmDeclaration"
      + "\nlist cannot be resolved"
      + "\nvalues cannot be resolved"
      + "\nvar1 cannot be resolved");
  }
  
  @Override
  public CharSequence getMutexList(final /* VarList */Object rel) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getMutexPair(ElmDeclaration, ElmDeclaration) from the type CNFFactory refers to the missing type ElmDeclaration"
      + "\nlist cannot be resolved"
      + "\nvalues cannot be resolved"
      + "\nvar1 cannot be resolved");
  }
  
  @Override
  public CharSequence getExpression(final /* Relational */Object exp) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method parse(Relational, Dialect) from the type ExpressionsParser refers to the missing type Relational");
  }
  
  @Override
  public CharSequence getVisibility(final /* Visibility */Object rel, final List<CharSequence> relations) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method parse(Relational, Dialect) from the type ExpressionsParser refers to the missing type Relational"
      + "\ncondition cannot be resolved");
  }
}
