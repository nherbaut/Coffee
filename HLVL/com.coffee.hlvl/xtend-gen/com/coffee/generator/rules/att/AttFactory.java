package com.coffee.generator.rules.att;

import com.coffee.generator.common.ExpressionsParser;
import com.coffee.generator.rules.att.IAttributesFactory;
import com.coffee.generator.rules.bools.BoolFactory;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class AttFactory extends BoolFactory implements IAttributesFactory {
  private Map<String, Integer> symbolsTable;
  
  private Map<String, String> mapsTable;
  
  private ExpressionsParser expressionsParser;
  
  public AttFactory() {
    HashMap<String, Integer> _hashMap = new HashMap<String, Integer>();
    this.symbolsTable = _hashMap;
    HashMap<String, String> _hashMap_1 = new HashMap<String, String>();
    this.mapsTable = _hashMap_1;
    ExpressionsParser _expressionsParser = new ExpressionsParser(this.symbolsTable);
    this.expressionsParser = _expressionsParser;
  }
  
  @Override
  public CharSequence getConstant(final /* ElmDeclaration */Object element) {
    throw new Error("Unresolved compilation problems:"
      + "\nConstantDecl cannot be resolved to a type."
      + "\nThe method parseValue(Value) from the type AttFactory refers to the missing type Value"
      + "\nname cannot be resolved"
      + "\ndeclaration cannot be resolved"
      + "\nvalue cannot be resolved");
  }
  
  @Override
  public CharSequence getElement(final /* ElmDeclaration */Object element) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getDomain(ElmDeclaration) from the type AttFactory refers to the missing type ElmDeclaration"
      + "\nThe method getDomain(ElmDeclaration) from the type AttFactory refers to the missing type ElmDeclaration"
      + "\ndataType cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  public CharSequence parseValue(final /* Value */Object aValue) {
    throw new Error("Unresolved compilation problems:"
      + "\nBoolVal cannot be resolved to a type."
      + "\nSymbol cannot be resolved to a type."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nvalue cannot be resolved"
      + "\n== cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nvalue cannot be resolved");
  }
  
  @Override
  public CharSequence getCoreSingle(final /* ElmDeclaration */Object element) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  @Override
  public CharSequence getDecomposition(final /* Decomposition */Object rel, final /* Map<String, ElmDeclaration> */Object parents) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getDecompositionAtt(ElmDeclaration, ElmDeclaration) from the type AttFactory refers to the missing type ElmDeclaration"
      + "\nchildren cannot be resolved"
      + "\nvalues cannot be resolved"
      + "\nname cannot be resolved"
      + "\nparent cannot be resolved"
      + "\natt cannot be resolved"
      + "\n=== cannot be resolved"
      + "\n! cannot be resolved"
      + "\n&& cannot be resolved"
      + "\natt cannot be resolved"
      + "\n== cannot be resolved"
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
      + "\nchildren cannot be resolved"
      + "\nvalues cannot be resolved"
      + "\nname cannot be resolved"
      + "\nmin cannot be resolved"
      + "\nmax cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\n== cannot be resolved"
      + "\nchildren cannot be resolved"
      + "\nvalues cannot be resolved"
      + "\nsize cannot be resolved"
      + "\nmax cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\n== cannot be resolved"
      + "\nparent cannot be resolved"
      + "\nname cannot be resolved"
      + "\n== cannot be resolved"
      + "\nparent cannot be resolved"
      + "\nname cannot be resolved"
      + "\nparent cannot be resolved"
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
  
  public CharSequence getDomain(final /* ElmDeclaration */Object element) {
    throw new Error("Unresolved compilation problems:"
      + "\nVariableDecl cannot be resolved to a type."
      + "\nInterval cannot be resolved to a type."
      + "\nInterval cannot be resolved to a type."
      + "\nInterval cannot be resolved to a type."
      + "\nEnumeration cannot be resolved to a type."
      + "\nEnumeration cannot be resolved to a type."
      + "\nEnumeration cannot be resolved to a type."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nThe method parseValue(Value) from the type AttFactory refers to the missing type Value"
      + "\nThe method parseValue(Value) from the type AttFactory refers to the missing type Value"
      + "\ndeclaration cannot be resolved"
      + "\ndataType cannot be resolved"
      + "\nvariants cannot be resolved"
      + "\nvariants cannot be resolved"
      + "\nstart cannot be resolved"
      + "\nvariants cannot be resolved"
      + "\nend cannot be resolved"
      + "\nvariants cannot be resolved"
      + "\nlist cannot be resolved"
      + "\nvalues cannot be resolved"
      + "\nvariants cannot be resolved"
      + "\nlist cannot be resolved"
      + "\nvalues cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  @Override
  public CharSequence getExpression(final /* Relational */Object exp) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method parse(Relational, Dialect) from the type ExpressionsParser refers to the missing type Relational");
  }
  
  /**
   * ++  Methods from AttributeFactory
   */
  @Override
  public CharSequence getDecompositionAtt(final /* ElmDeclaration */Object parent, final /* ElmDeclaration */Object attribute) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getDomain(ElmDeclaration) from the type AttFactory refers to the missing type ElmDeclaration"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved");
  }
}
