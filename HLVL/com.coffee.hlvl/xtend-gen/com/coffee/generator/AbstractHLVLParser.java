package com.coffee.generator;

import com.coffee.generator.Dialect;
import com.coffee.generator.IHLVLParser;
import com.coffee.generator.TransformationRules;
import java.util.Map;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * Abstract Generator, this is the class that process the model and traverses the
 * syntax tree regardless the type of notation and problem
 * @author Angela Villota
 * @version HLVL 1
 * August 2018
 * adpated to the HLVl grammar on January 2019
 */
@SuppressWarnings("all")
public abstract class AbstractHLVLParser implements IHLVLParser {
  /**
   * Name of the PL model
   */
  private String modelName;
  
  private Dialect dialect;
  
  /**
   * object to obtain the program sentences regarding the type of the problem
   */
  private TransformationRules rules;
  
  /**
   * Map with the parent of each variable, for decomposition relations
   */
  private /* Map<String, ElmDeclaration> */Object parents;
  
  /**
   * Map with the parent of each element, for decomposition relations
   */
  private /* Map<String, Relation> */Object relations;
  
  private /* Map<String, ElmDeclaration> */Object attributes;
  
  private StringBuilder operations;
  
  /**
   * Constructor method
   * @param the name of the model
   * @param type of the problem
   */
  public AbstractHLVLParser(final String name, final Dialect dialect) {
    throw new Error("Unresolved compilation problems:"
      + "\nElmDeclaration cannot be resolved to a type."
      + "\nElmDeclaration cannot be resolved to a type."
      + "\nRelation cannot be resolved to a type."
      + "\nThe field AbstractHLVLParser.parents refers to the missing type ElmDeclaration"
      + "\nThe field AbstractHLVLParser.attributes refers to the missing type ElmDeclaration"
      + "\nThe field AbstractHLVLParser.relations refers to the missing type Relation");
  }
  
  /**
   * Method to obtain a sequence of characters containing the constraint
   * representation of the model regarding the type of the problem and the
   * notation.
   * @param model is an ECORE syntax tree with the program
   */
  @Override
  public CharSequence parseModel(final /* Model */Object model) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method parseElements(Model) from the type AbstractHLVLParser refers to the missing type Model"
      + "\nThe method parseRelations(Model) from the type AbstractHLVLParser refers to the missing type Model"
      + "\nThe method parseOperations(Model) from the type AbstractHLVLParser refers to the missing type Model");
  }
  
  /**
   * This method traverses the collection of elements to produce a block of code containing the
   * declaration of the elements represented as variables in the minizinc language
   *  The code for translating an element declaration and relation is produced by an object called rule containing the
   * transformation rules.
   * @param model
   */
  @Override
  public String parseElements(final /* Model */Object model) {
    throw new Error("Unresolved compilation problems:"
      + "\nConstantDecl cannot be resolved to a type."
      + "\nConstantDecl cannot be resolved to a type."
      + "\nVariableDecl cannot be resolved to a type."
      + "\nThe method getElement(Object) is undefined for the type TransformationRules"
      + "\nThe method getConstant(Object) is undefined for the type TransformationRules"
      + "\nThe method getElement(Object) is undefined for the type TransformationRules"
      + "\nThe field AbstractHLVLParser.attributes refers to the missing type ElmDeclaration"
      + "\nelements cannot be resolved"
      + "\natt cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\natt cannot be resolved"
      + "\n== cannot be resolved"
      + "\nname cannot be resolved"
      + "\ndeclaration cannot be resolved"
      + "\ndeclaration cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ndataType cannot be resolved"
      + "\n== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\n=== cannot be resolved"
      + "\ndeclaration cannot be resolved");
  }
  
  /**
   * Method to traverse the collection of variability relations and call the
   * method that parses each relation individually
   * @param model
   */
  public String parseRelations(final /* Model */Object model) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field AbstractHLVLParser.relations refers to the missing type Relation"
      + "\nThe method parseRelation(Relation) from the type AbstractHLVLParser refers to the missing type Object"
      + "\nrelations cannot be resolved"
      + "\nname cannot be resolved"
      + "\nexp cannot be resolved"
      + "\nexp cannot be resolved");
  }
  
  /**
   * This method parses a variability relation individually.
   * First, the type of variability relation is determined, then a call to the transfromationRules object
   * is performed to transform each variability relation into a set of constraints considering the type of problem.
   * @param rel is a variability relation
   */
  @Override
  public Object parseRelation(final /* Relation */Object rel) {
    throw new Error("Unresolved compilation problems:"
      + "\nCommon cannot be resolved to a type."
      + "\nDecomposition cannot be resolved to a type."
      + "\nGroup cannot be resolved to a type."
      + "\nVarList cannot be resolved to a type."
      + "\nVarList cannot be resolved to a type."
      + "\nExpression cannot be resolved to a type."
      + "\nVisibility cannot be resolved to a type."
      + "\nThe method getCore(Relation) is undefined for the type TransformationRules"
      + "\nThe method getDecomposition(Relation, Map<String, ElmDeclaration>) is undefined for the type TransformationRules"
      + "\nThe method getGroup(Relation, Map<String, ElmDeclaration>) is undefined for the type TransformationRules"
      + "\nThe method or field operator is undefined for the type Pair"
      + "\nThe method getImpliesPair(Object, Object) is undefined for the type TransformationRules"
      + "\nThe method getMutexPair(Object, Object) is undefined for the type TransformationRules"
      + "\nThe method getImpliesList(Relation) is undefined for the type TransformationRules"
      + "\nThe method getMutexList(Relation) is undefined for the type TransformationRules"
      + "\nThe method getExpression(Object) is undefined for the type TransformationRules"
      + "\nThe method getVisibility(Relation, ArrayList<CharSequence>) is undefined for the type TransformationRules"
      + "\nType mismatch: cannot convert from Object to CharSequence"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nThe field AbstractHLVLParser.parents refers to the missing type ElmDeclaration"
      + "\nThe field AbstractHLVLParser.parents refers to the missing type ElmDeclaration"
      + "\nThe method parseRelation(Relation) from the type AbstractHLVLParser refers to the missing type Object"
      + "\n== cannot be resolved"
      + "\nvar1 cannot be resolved"
      + "\nvar2 cannot be resolved"
      + "\nvar1 cannot be resolved"
      + "\nvar2 cannot be resolved"
      + "\noperator cannot be resolved"
      + "\n== cannot be resolved"
      + "\nexp cannot be resolved"
      + "\nlist cannot be resolved"
      + "\nids cannot be resolved"
      + "\nexp cannot be resolved");
  }
  
  public CharSequence parseOperations(final /* Model */Object model) {
    CharSequence _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("\"problemType\" : \"");
      String _string = this.dialect.toString();
      _builder.append(_string, " ");
      _builder.append("\",");
      _builder.newLineIfNotEmpty();
      this.operations.append(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(" ");
      _xblockexpression = _builder_1;
    }
    return _xblockexpression;
  }
  
  /**
   * ===================================================================
   * ===================================================================
   *  Getters and setters
   */
  public String getModelName() {
    return this.modelName;
  }
  
  public Dialect getDialect() {
    return this.dialect;
  }
  
  public void addParents(final /* Decomposition */Object exp) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field AbstractHLVLParser.parents refers to the missing type ElmDeclaration"
      + "\nchildren cannot be resolved"
      + "\nvalues cannot be resolved"
      + "\nname cannot be resolved"
      + "\nparent cannot be resolved");
  }
  
  public /* Map<String, ElmDeclaration> */Object getParents() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field AbstractHLVLParser.parents refers to the missing type ElmDeclaration");
  }
  
  public void setTransformationRules(final TransformationRules rules) {
    this.rules = rules;
  }
  
  @Override
  public CharSequence getOperations(final long time) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("\"parsingTime\"  : \"");
    _builder.append(time, " ");
    _builder.append("ms\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    this.operations.append(_builder);
    return this.operations.toString();
  }
}
