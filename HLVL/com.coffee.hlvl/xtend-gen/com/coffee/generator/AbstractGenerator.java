package com.coffee.generator;

import com.coffee.generator.Dialect;
import com.coffee.generator.IGenerator;
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
public abstract class AbstractGenerator implements IGenerator {
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
   * Map with the parent of each variable, for decomposition relations
   */
  private /* Map<String, Relation> */Object relations;
  
  private /* Map<String, ElmDeclaration> */Object attributes;
  
  private StringBuilder operations;
  
  /**
   * Constructor method
   * @param the name of the model
   * @param type of the problem
   */
  public AbstractGenerator(final String name, final Dialect dialect) {
    throw new Error("Unresolved compilation problems:"
      + "\nElmDeclaration cannot be resolved to a type."
      + "\nElmDeclaration cannot be resolved to a type."
      + "\nRelation cannot be resolved to a type."
      + "\nThe field AbstractGenerator.parents refers to the missing type ElmDeclaration"
      + "\nThe field AbstractGenerator.attributes refers to the missing type ElmDeclaration"
      + "\nThe field AbstractGenerator.relations refers to the missing type Relation");
  }
  
  /**
   * Method to obtain a sequence of characters containing the constraint
   * representation of the model regarding the type of the problem and the
   * notation.
   * @param model is an ECORE syntax tree with the program
   * this syntax tree should be traversed.
   */
  @Override
  public CharSequence parseModel(final /* Model */Object model) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method parseElements(Model) from the type AbstractGenerator refers to the missing type Model"
      + "\nThe method parseRelations(Model) from the type AbstractGenerator refers to the missing type Model"
      + "\nThe method parseOperations(Model) from the type AbstractGenerator refers to the missing type Model");
  }
  
  /**
   * This method traverses the list of variables to parse each declaration
   * The declaration is made by the factory
   * @param model
   */
  @Override
  public CharSequence parseElements(final /* Model */Object model) {
    throw new Error("Unresolved compilation problems:"
      + "\nConstantDecl cannot be resolved to a type."
      + "\nConstantDecl cannot be resolved to a type."
      + "\nVariableDecl cannot be resolved to a type."
      + "\nThe field AbstractGenerator.attributes refers to the missing type ElmDeclaration"
      + "\nThe method getElement(ElmDeclaration) from the type TransformationRules refers to the missing type ElmDeclaration"
      + "\nThe method getConstant(ElmDeclaration) from the type TransformationRules refers to the missing type ElmDeclaration"
      + "\nThe method getElement(ElmDeclaration) from the type TransformationRules refers to the missing type ElmDeclaration"
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
   * Method to parse the constraints in a model.
   * The constraints are contained in a collection
   * of constraints
   * @param model
   */
  @Override
  public CharSequence parseRelations(final /* Model */Object model) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field AbstractGenerator.relations refers to the missing type Relation"
      + "\nThe method parseRelation(Relation) from the type AbstractGenerator refers to the missing type Relation"
      + "\nrelations cannot be resolved"
      + "\nname cannot be resolved"
      + "\nexp cannot be resolved"
      + "\nexp cannot be resolved");
  }
  
  /**
   * This method is used to determine he type of an expression and
   * call the method in charge to produce the code.
   * @param exp is a constraint expression
   */
  @Override
  public CharSequence parseRelation(final /* Relation */Object rel) {
    throw new Error("Unresolved compilation problems:"
      + "\nCore cannot be resolved to a type."
      + "\nDecomposition cannot be resolved to a type."
      + "\nGroup cannot be resolved to a type."
      + "\nVarList cannot be resolved to a type."
      + "\nVarList cannot be resolved to a type."
      + "\nExpression cannot be resolved to a type."
      + "\nVisibility cannot be resolved to a type."
      + "\nMultInstantiation cannot be resolved to a type."
      + "\nQImplies cannot be resolved to a type."
      + "\nComplexImplies cannot be resolved to a type."
      + "\nThe method or field operator is undefined for the type Pair"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nThe method getCore(Core) from the type TransformationRules refers to the missing type Core"
      + "\nThe method getDecomposition(Decomposition, Map<String, ElmDeclaration>) from the type TransformationRules refers to the missing type Decomposition"
      + "\nThe field AbstractGenerator.parents refers to the missing type ElmDeclaration"
      + "\nThe method getGroup(Group, Map<String, ElmDeclaration>) from the type TransformationRules refers to the missing type Group"
      + "\nThe field AbstractGenerator.parents refers to the missing type ElmDeclaration"
      + "\nThe method getImpliesPair(ElmDeclaration, ElmDeclaration) from the type TransformationRules refers to the missing type ElmDeclaration"
      + "\nThe method getMutexPair(ElmDeclaration, ElmDeclaration) from the type TransformationRules refers to the missing type ElmDeclaration"
      + "\nThe method getImpliesList(VarList) from the type TransformationRules refers to the missing type VarList"
      + "\nThe method getMutexList(VarList) from the type TransformationRules refers to the missing type VarList"
      + "\nThe method getExpression(Relational) from the type TransformationRules refers to the missing type Relational"
      + "\nThe method parseRelation(Relation) from the type AbstractGenerator refers to the missing type Relation"
      + "\nThe method getVisibility(Visibility, List<CharSequence>) from the type TransformationRules refers to the missing type Visibility"
      + "\n== cannot be resolved"
      + "\nvar1 cannot be resolved"
      + "\nvar2 cannot be resolved"
      + "\nvar1 cannot be resolved"
      + "\nvar2 cannot be resolved"
      + "\noperator cannot be resolved"
      + "\n== cannot be resolved"
      + "\nexp cannot be resolved"
      + "\nchildren cannot be resolved"
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
  @Override
  public String getModelName() {
    return this.modelName;
  }
  
  @Override
  public Dialect getDialect() {
    return this.dialect;
  }
  
  @Override
  public void addParents(final /* Decomposition */Object exp) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field AbstractGenerator.parents refers to the missing type ElmDeclaration"
      + "\nchildren cannot be resolved"
      + "\nvalues cannot be resolved"
      + "\nname cannot be resolved"
      + "\nparent cannot be resolved");
  }
  
  @Override
  public /* Map<String, ElmDeclaration> */Object getParents() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field AbstractGenerator.parents refers to the missing type ElmDeclaration");
  }
  
  @Override
  public void setFactory(final TransformationRules factory) {
    this.rules = factory;
  }
  
  @Override
  public String getOperations(final long time) {
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
