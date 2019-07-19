package com.coffee.generator.integerParser;

import com.coffee.generator.TransformationRules;
import com.coffee.generator.integerParser.IAttributesRules;
import java.util.List;
import java.util.Map;

@SuppressWarnings("all")
public class AttributesTranformationRules extends TransformationRules implements IAttributesRules {
  @Override
  public String getConstant(final /* ElmDeclaration */Object element) {
    return "n.y.i";
  }
  
  @Override
  public String getCore(final /* Common */Object core) {
    return "n.y.i";
  }
  
  @Override
  public String getCoreSingle(final /* ElmDeclaration */Object element) {
    return "n.y.i";
  }
  
  @Override
  public String getDecomposition(final /* Decomposition */Object rel, final /* Map<String, ElmDeclaration> */Object parents) {
    return "n.y.i";
  }
  
  @Override
  public String getElement(final /* ElmDeclaration */Object element) {
    return "n.y.i";
  }
  
  @Override
  public String getExpression(final /* Relational */Object rel) {
    return "n.y.i";
  }
  
  @Override
  public String getGroup(final /* Group */Object rel, final /* Map<String, ElmDeclaration> */Object parents) {
    return "n.y.i";
  }
  
  @Override
  public String getImpliesList(final /* VarList */Object rel) {
    return "n.y.i";
  }
  
  @Override
  public String getImpliesPair(final /* ElmDeclaration */Object left, final /* ElmDeclaration */Object right) {
    return "n.y.i";
  }
  
  @Override
  public String getMutexList(final /* VarList */Object rel) {
    return "n.y.i";
  }
  
  @Override
  public String getMutexPair(final /* ElmDeclaration */Object left, final /* ElmDeclaration */Object right) {
    return "n.y.i";
  }
  
  @Override
  public String getVisibility(final /* Visibility */Object rel, final List<CharSequence> relations) {
    return "n.y.i";
  }
  
  @Override
  public String getDecompositionAtt(final /* ElmDeclaration */Object parent, final /* ElmDeclaration */Object attribute) {
    return "n.y.i";
  }
}
