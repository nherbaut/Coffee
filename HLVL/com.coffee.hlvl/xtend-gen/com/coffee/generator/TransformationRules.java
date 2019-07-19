package com.coffee.generator;

import java.util.List;
import java.util.Map;

/**
 * Interface to define the methods a codeFactory for the PLEC language
 * should implement, all Factories implement this interface
 * implemented by (THLCLFactory, XCSP3Factory, DIMASFactory)
 * @author Angela Villota
 * @version PLEC V3
 * August 2018
 */
@SuppressWarnings("all")
public abstract class TransformationRules {
  public abstract CharSequence getConstant(final /* ElmDeclaration */Object element);
  
  public abstract CharSequence getElement(final /* ElmDeclaration */Object element);
  
  public abstract CharSequence getCore(final /* Core */Object core);
  
  public abstract CharSequence getCoreSingle(final /* ElmDeclaration */Object element);
  
  public abstract CharSequence getDecomposition(final /* Decomposition */Object rel, final /* Map<String, ElmDeclaration> */Object parents);
  
  public abstract CharSequence getGroup(final /* Group */Object rel, final /* Map<String, ElmDeclaration> */Object parents);
  
  public abstract CharSequence getImpliesPair(final /* ElmDeclaration */Object left, final /* ElmDeclaration */Object right);
  
  public abstract CharSequence getMutexPair(final /* ElmDeclaration */Object left, final /* ElmDeclaration */Object right);
  
  public abstract CharSequence getImpliesList(final /* VarList */Object rel);
  
  public abstract CharSequence getMutexList(final /* VarList */Object rel);
  
  public abstract CharSequence getExpression(final /* Relational */Object rel);
  
  public abstract CharSequence getVisibility(final /* Visibility */Object rel, final List<CharSequence> relations);
}
