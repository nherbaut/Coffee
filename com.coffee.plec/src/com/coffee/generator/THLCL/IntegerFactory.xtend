package com.coffee.generator.THLCL

import com.coffee.pLEC.VarDeclaration
import java.util.ArrayList
import com.coffee.pLEC.VariantDeclaration
import com.coffee.pLEC.VariantsInterval
import com.coffee.pLEC.VariantsEnumeration
import org.eclipse.emf.common.util.EList
import com.coffee.pLEC.Value
import com.coffee.pLEC.Number
import com.coffee.pLEC.Structural
import java.util.Map
import com.coffee.generator.FODAFactory
import com.coffee.generator.AttributesFactory
import com.coffee.pLEC.Attributes

class IntegerFactory extends THLCLFactory implements  FODAFactory, AttributesFactory{
	/**
	 * List with the constraints autogenerated for dealing with feature instances
	 */
	private ArrayList <String> clonConstraints;
	new(){
		//initializing the list of autogenerated constraints
		clonConstraints= new ArrayList<String>;	
	}
	
	//TODO quitar lo relacionado con cardinalidades
	override getVariable(VarDeclaration variable)'''
		«variable.type» «variable.name» «getValuesDeclaration(variable, variable.variants)»
		«IF  (!(variable.min===null && variable.max===null)) »
			«getClonVariables(variable)»	
		«ENDIF»
	'''

	/**
	 * Method for declare variants
	 */
	override getValuesDeclaration(VarDeclaration variable, VariantDeclaration variant) '''
		«IF variable.type=="boolean"»
		«ELSE»	
			«IF variant instanceof VariantsInterval»
				domain: «variant.start.value»..«variant.end.value»
			«ELSE»
				«IF variant instanceof VariantsEnumeration»
					domain: [«getList(variant.list.values)»]
				«ENDIF»	
			«ENDIF»
		«ENDIF»
	'''
	def  getList(EList<Value> l){
		var out= (l.get(0) as Number).value +"";
		for(var i=1; i<l.size(); i= i+1 ){
			out += ", "+ (l.get(i) as Number).value ;
		}
		return out;
	}
	
	/*===================================================================
	 * Methods from the FODAFactory interface
	 */
	/**
	 * 
	 */
	override getGroupCardinality(Structural exp, Map <String, VarDeclaration> parents){
		var idsSum=""
		var implies =""
		for (child : exp.group.ids) {
			implies += '''(«child.name» => «exp.parent.name») AND '''
			idsSum+= '''«child.name» + '''
			parents.put(child.name, exp.parent)
		}
		var sumLesThan = '''(«idsSum.substring(0, idsSum.length() - 2)» <= «exp.min.value» )'''
		var sumGreaterThan = '''(«idsSum.substring(0, idsSum.length() - 2)» >= «exp.max.value»)''' 
		var output= '''«implies»(«exp.parent.name» >= 1) => («sumLesThan» AND «sumGreaterThan»)'''
		output
	 }
	 
	override getMandatory(VarDeclaration parent, VarDeclaration child) {
		return parent.name + " = " + child.name
	}
	
	override getOptional(VarDeclaration parent, VarDeclaration child) {
		return parent.name + " >= " + child.name
	}
	
	override getRequires(VarDeclaration left, VarDeclaration right) {
	'''
		«IF left.min===null && left.max===null»
				«left.name»  => («right.name» > 1) 
		«ELSE»
			«var String declaration="("+left.name+"1"+" => " + right.name + ")"»
			«for ( var i=2; i<= left.max.value; i= i+1)  {
			declaration+=" AND ("+ left.name+i +" => " + right.name + ")"
			}»
			«declaration»
		«ENDIF»
		'''
	}
	
	override getExcludes (VarDeclaration left, VarDeclaration right){
		'''
		«IF left.min===null && left.max===null»
			«left.name» + «right.name»<= 1 
		«ELSE»
			«var String declaration="("+left.name+"1"+" + " + right.name + "<= 1)"»
			«for ( var i=2; i<= left.max.value; i= i+1)  {
					declaration+=" AND ("+ left.name+i +" + " + right.name + "<= 1)"
			}»
			«declaration»
		«ENDIF»	
		'''
	}
	/*================================================================
	 * Methods from the AttributesFactory Interface
	 * 
	 */
	
	/**
	 * For each attribute in the expression exp a constraint of the
	 * type element <=> («attribute» > 0) is generated
	 * @param exp is an expression of Type Attributes
	 * Falta considerar el caso cuando hay más de un atributo, 
	 * es decir cuando la lista tiene más de un elemento
	 */
	override getAttributes(Attributes exp) {
		'''
		«val left= exp.var1.name»
		«FOR att : exp.att.ids»
			«left» <=> («att.name» > 0)
		«ENDFOR»
		'''
	}
	
	/*================================================================
	 * Methods from the cardinalityFactory Interface
	 * 
	 */
	override getClonVariables(VarDeclaration variable) {
		var String declaration=""
		var String left= "(" + variable.min.value + "<="
		var String right= "(" + variable.max.value + ">="
		var String sum= ""
		for ( var i=1; i<= variable.max.value; i= i+1) {
			declaration+="boolean " +variable.name+i +"\n"
			sum+= variable.name+i + " +"
			var  implies=  variable.name+i + " =>" + variable.name
			clonConstraints.add(implies)
		}
		left += sum.substring(0, sum.length() - 1) + ") "
		right += sum.substring(0, sum.length() - 1) + ") "
		var String constraint= variable.name+" => (" + left + "AND" + right +")"
		clonConstraints.add(constraint)
		declaration
	}
	
	override getClonConstraints() {
		var out =""
		if (clonConstraints===null){
			out=""
		}
		else{
			var int id = 1
			for( constraint : clonConstraints){
			 	out += 
			 	'''cl«id»: «constraint.toString»
			 	'''
			 	id++
			}
		}
		out
	}
	


					
	
	
}