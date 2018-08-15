package com.coffee.generator.THLCL;

import com.coffee.generator.THLCL.BooleanFactory;
import com.coffee.pLEC.Value;
import com.coffee.pLEC.VarDeclaration;
import com.coffee.pLEC.VariantDeclaration;
import com.coffee.pLEC.VariantsEnumeration;
import com.coffee.pLEC.VariantsInterval;
import com.google.common.base.Objects;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class IntegerFactory extends BooleanFactory {
  /**
   * List with the constraints autogenerated for dealing with feature instances
   */
  private ArrayList<String> clonConstraints;
  
  public ArrayList<String> IntegerFactory() {
    ArrayList<String> _arrayList = new ArrayList<String>();
    return this.clonConstraints = _arrayList;
  }
  
  @Override
  public CharSequence getVariable(final VarDeclaration variable) {
    StringConcatenation _builder = new StringConcatenation();
    String _type = variable.getType();
    _builder.append(_type);
    _builder.append(" ");
    String _name = variable.getName();
    _builder.append(_name);
    _builder.append(" ");
    CharSequence _declareVariants = this.declareVariants(variable, variable.getVariants());
    _builder.append(_declareVariants);
    _builder.newLineIfNotEmpty();
    {
      boolean _not = (!((variable.getMin() == null) && (variable.getMax() == null)));
      if (_not) {
        String _parseCloneVariables = this.parseCloneVariables(variable);
        _builder.append(_parseCloneVariables);
        _builder.append("\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public String parseCloneVariables(final VarDeclaration variable) {
    String _xblockexpression = null;
    {
      String declaration = "";
      int _value = variable.getMin().getValue();
      String _plus = ("(" + Integer.valueOf(_value));
      String left = (_plus + "<=");
      int _value_1 = variable.getMax().getValue();
      String _plus_1 = ("(" + Integer.valueOf(_value_1));
      String right = (_plus_1 + ">=");
      String sum = "";
      for (int i = 1; (i <= variable.getMax().getValue()); i = (i + 1)) {
        {
          String _declaration = declaration;
          String _name = variable.getName();
          String _plus_2 = ("boolean " + _name);
          String _plus_3 = (_plus_2 + Integer.valueOf(i));
          String _plus_4 = (_plus_3 + "\n");
          declaration = (_declaration + _plus_4);
          String _sum = sum;
          String _name_1 = variable.getName();
          String _plus_5 = (_name_1 + Integer.valueOf(i));
          String _plus_6 = (_plus_5 + " +");
          sum = (_sum + _plus_6);
          String _name_2 = variable.getName();
          String _plus_7 = (_name_2 + Integer.valueOf(i));
          String _plus_8 = (_plus_7 + " =>");
          String _name_3 = variable.getName();
          String implies = (_plus_8 + _name_3);
          this.clonConstraints.add(implies);
        }
      }
      String _left = left;
      int _length = sum.length();
      int _minus = (_length - 1);
      String _substring = sum.substring(0, _minus);
      String _plus_2 = (_substring + ") ");
      left = (_left + _plus_2);
      String _right = right;
      int _length_1 = sum.length();
      int _minus_1 = (_length_1 - 1);
      String _substring_1 = sum.substring(0, _minus_1);
      String _plus_3 = (_substring_1 + ") ");
      right = (_right + _plus_3);
      String _name = variable.getName();
      String _plus_4 = (_name + " => (");
      String _plus_5 = (_plus_4 + left);
      String _plus_6 = (_plus_5 + "AND");
      String _plus_7 = (_plus_6 + right);
      String constraint = (_plus_7 + ")");
      this.clonConstraints.add(constraint);
      _xblockexpression = declaration;
    }
    return _xblockexpression;
  }
  
  /**
   * Method for declare variants
   */
  public CharSequence declareVariants(final VarDeclaration variable, final VariantDeclaration variant) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _type = variable.getType();
      boolean _equals = Objects.equal(_type, "boolean");
      if (_equals) {
      } else {
        {
          if ((variant instanceof VariantsInterval)) {
            _builder.append("domain: ");
            int _value = ((VariantsInterval)variant).getStart().getValue();
            _builder.append(_value);
            _builder.append("..");
            int _value_1 = ((VariantsInterval)variant).getEnd().getValue();
            _builder.append(_value_1);
            _builder.newLineIfNotEmpty();
          } else {
            {
              if ((variant instanceof VariantsEnumeration)) {
                _builder.append("domain: [");
                String _list = this.getList(((VariantsEnumeration)variant).getList().getValues());
                _builder.append(_list);
                _builder.append("]");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public String getList(final EList<Value> l) {
    Value _get = l.get(0);
    int number = ((com.coffee.pLEC.Number) _get).getValue();
    String out = "";
    for (int i = 1; (i < l.size()); i = (i + 1)) {
      String _plus = (Integer.valueOf(number) + ", ");
      Value _get_1 = l.get(i);
      int _value = ((com.coffee.pLEC.Number) _get_1).getValue();
      String _plus_1 = (_plus + Integer.valueOf(_value));
      out = _plus_1;
    }
    return out;
  }
}