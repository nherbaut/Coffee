package com.coffee.generator;

import com.coffee.generator.Dialect;
import com.coffee.generator.TransformationRules;
import java.util.Map;

/**
 * Interface to define the methods a code generator for the PLEC language
 * should implement, all generators implementation implement this interface
 * implemented by (THLCLGenerator, XCSP3Generator)
 * @author Angela Villota
 * @version PLEC V3
 * August 2018
 */
@SuppressWarnings("all")
public interface IGenerator {
  public abstract CharSequence parseModel(final /* Model */Object model);
  
  public abstract CharSequence parseElements(final /* Model */Object model);
  
  public abstract CharSequence parseRelations(final /* Model */Object model);
  
  public abstract CharSequence parseRelation(final /* Relation */Object exp);
  
  public abstract String getModelName();
  
  public abstract Dialect getDialect();
  
  public abstract void addParents(final /* Decomposition */Object exp);
  
  public abstract /* Map<String, ElmDeclaration> */Object getParents();
  
  public abstract void setFactory(final TransformationRules factory);
  
  public abstract String getOperations(final long time);
}
