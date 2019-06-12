package webmapi.service;

import java.util.List;
import java.util.Objects;

import hlvl.Model;
import hlvl.ElmDeclaration;
import hlvl.Declaration;
import hlvl.ConstantDecl;
import hlvl.VariableDecl;
import hlvl.OptionsDeclaration;
import hlvl.Interval;
import hlvl.Enumeration;
import hlvl.RelDeclaration;
import hlvl.Relation;
import hlvl.Core;
import hlvl.MultInstantiation;
import hlvl.Pair;
import hlvl.ComplexImplies;
import hlvl.QImplies;
import hlvl.VarList;
import hlvl.Hierarchy;
import hlvl.Decomposition;
import hlvl.Group;
import hlvl.Range;
import hlvl.Visibility;
import hlvl.Order;
import hlvl.Expression;
import hlvl.Relational;
import hlvl.Operations;
import hlvl.Operation;
import hlvl.BoolVal;
import hlvl.Number;
import hlvl.Symbol;
import hlvl.Value;
import hlvl.ListOfValues;
import hlvl.ListOfIDs;
import hlvl.ListOfRelRefs;
import hlvl.Names;
import hlvl.Valuation;
import hlvl.ListOfValuation;
import hlvl.ListOfListValues;
import hlvl.Iff;
import hlvl.Implies;
import hlvl.Or;
import hlvl.And;
import hlvl.Equality;
import hlvl.Comparison;
import hlvl.Plus;
import hlvl.Minus;
import hlvl.MulOrDiv;
import hlvl.Negation;
import hlvl.Unary;
import hlvl.Function;
import hlvl.BoolConstant;
import hlvl.VariableRef;
import hlvl.AttributeRef;
import hlvl.StringConstant;
import hlvl.IntConstant;
import hlvl.SingleInstruction;
import hlvl.ValidConf;

public class IdentificationResolver {

	public static String getModelId(Model model) {
		if (model == null)
			return null;
		return model.getName().toString();
	}

	public static String getElmDeclarationId(ElmDeclaration elmDeclaration) {
		if (elmDeclaration == null)
			return null;
		return elmDeclaration.getName().toString();
	}

	public static String getDeclarationId(Declaration declaration) {
		if (declaration == null)
			return null;
		return "";
	}

	public static String getConstantDeclId(ConstantDecl constantDecl) {
		if (constantDecl == null)
			return null;
		return "";
	}

	public static String getVariableDeclId(VariableDecl variableDecl) {
		if (variableDecl == null)
			return null;
		return "";
	}

	public static String getOptionsDeclarationId(OptionsDeclaration optionsDeclaration) {
		if (optionsDeclaration == null)
			return null;
		return "";
	}

	public static String getIntervalId(Interval interval) {
		if (interval == null)
			return null;
		return ""+interval.getEnd();
	}

	public static String getEnumerationId(Enumeration enumeration) {
		if (enumeration == null)
			return null;
		return "";
	}

	public static String getRelDeclarationId(RelDeclaration relDeclaration) {
		if (relDeclaration == null)
			return null;
		return relDeclaration.getName().toString();
	}

	public static String getRelationId(Relation relation) {
		if (relation == null)
			return null;
		return "";
	}

	public static String getCoreId(Core core) {
		if (core == null)
			return null;
		return "";
	}

	public static String getMultInstantiationId(MultInstantiation multInstantiation) {
		if (multInstantiation == null)
			return null;
		return "";
	}

	public static String getPairId(Pair pair) {
		if (pair == null)
			return null;
		return pair.getOperator().toString();
	}

	public static String getComplexImpliesId(ComplexImplies complexImplies) {
		if (complexImplies == null)
			return null;
		return "";
	}

	public static String getQImpliesId(QImplies qImplies) {
		if (qImplies == null)
			return null;
		return ""+qImplies.getMaxb();
	}

	public static String getVarListId(VarList varList) {
		if (varList == null)
			return null;
		return varList.getOperator().toString();
	}

	public static String getHierarchyId(Hierarchy hierarchy) {
		if (hierarchy == null)
			return null;
		return "";
	}

	public static String getDecompositionId(Decomposition decomposition) {
		if (decomposition == null)
			return null;
		return ""+decomposition.getCardinality();
	}

	public static String getGroupId(Group group) {
		if (group == null)
			return null;
		return ""+group.getMin();
	}

	public static String getRangeId(Range range) {
		if (range == null)
			return null;
		return range.getValue().toString();
	}

	public static String getVisibilityId(Visibility visibility) {
		if (visibility == null)
			return null;
		return "";
	}

	public static String getOrderId(Order order) {
		if (order == null)
			return null;
		return order.getOperator().toString();
	}

	public static String getExpressionId(Expression expression) {
		if (expression == null)
			return null;
		return "";
	}

	public static String getRelationalId(Relational relational) {
		if (relational == null)
			return null;
		return "";
	}

	public static String getOperationsId(Operations operations) {
		if (operations == null)
			return null;
		return "";
	}

	public static String getOperationId(Operation operation) {
		if (operation == null)
			return null;
		return "";
	}

	public static String getBoolValId(BoolVal boolVal) {
		if (boolVal == null)
			return null;
		return boolVal.getValue().toString();
	}

	public static String getNumberId(Number number) {
		if (number == null)
			return null;
		return ""+number.getValue();
	}

	public static String getSymbolId(Symbol symbol) {
		if (symbol == null)
			return null;
		return symbol.getValue().toString();
	}

	public static String getValueId(Value value) {
		if (value == null)
			return null;
		return "";
	}

	public static String getListOfValuesId(ListOfValues listOfValues) {
		if (listOfValues == null)
			return null;
		return "";
	}

	public static String getListOfIDsId(ListOfIDs listOfIDs) {
		if (listOfIDs == null)
			return null;
		return "";
	}

	public static String getListOfRelRefsId(ListOfRelRefs listOfRelRefs) {
		if (listOfRelRefs == null)
			return null;
		return "";
	}

	public static String getNamesId(Names names) {
		if (names == null)
			return null;
		return names.getIds().toString();
	}

	public static String getValuationId(Valuation valuation) {
		if (valuation == null)
			return null;
		return "";
	}

	public static String getListOfValuationId(ListOfValuation listOfValuation) {
		if (listOfValuation == null)
			return null;
		return "";
	}

	public static String getListOfListValuesId(ListOfListValues listOfListValues) {
		if (listOfListValues == null)
			return null;
		return "";
	}

	public static String getIffId(Iff iff) {
		if (iff == null)
			return null;
		return "";
	}

	public static String getImpliesId(Implies implies) {
		if (implies == null)
			return null;
		return "";
	}

	public static String getOrId(Or or) {
		if (or == null)
			return null;
		return "";
	}

	public static String getAndId(And and) {
		if (and == null)
			return null;
		return "";
	}

	public static String getEqualityId(Equality equality) {
		if (equality == null)
			return null;
		return equality.getOp().toString();
	}

	public static String getComparisonId(Comparison comparison) {
		if (comparison == null)
			return null;
		return comparison.getOp().toString();
	}

	public static String getPlusId(Plus plus) {
		if (plus == null)
			return null;
		return "";
	}

	public static String getMinusId(Minus minus) {
		if (minus == null)
			return null;
		return "";
	}

	public static String getMulOrDivId(MulOrDiv mulOrDiv) {
		if (mulOrDiv == null)
			return null;
		return mulOrDiv.getOp().toString();
	}

	public static String getNegationId(Negation negation) {
		if (negation == null)
			return null;
		return "";
	}

	public static String getUnaryId(Unary unary) {
		if (unary == null)
			return null;
		return unary.getOp().toString();
	}

	public static String getFunctionId(Function function) {
		if (function == null)
			return null;
		return function.getOp().toString();
	}

	public static String getBoolConstantId(BoolConstant boolConstant) {
		if (boolConstant == null)
			return null;
		return boolConstant.getValue().toString();
	}

	public static String getVariableRefId(VariableRef variableRef) {
		if (variableRef == null)
			return null;
		return "";
	}

	public static String getAttributeRefId(AttributeRef attributeRef) {
		if (attributeRef == null)
			return null;
		return attributeRef.getAttribute().toString();
	}

	public static String getStringConstantId(StringConstant stringConstant) {
		if (stringConstant == null)
			return null;
		return stringConstant.getValue().toString();
	}

	public static String getIntConstantId(IntConstant intConstant) {
		if (intConstant == null)
			return null;
		return ""+intConstant.getValue();
	}

	public static String getSingleInstructionId(SingleInstruction singleInstruction) {
		if (singleInstruction == null)
			return null;
		return singleInstruction.getName().toString();
	}

	public static String getValidConfId(ValidConf validConf) {
		if (validConf == null)
			return null;
		return "";
	}

	public static Model findModelById(List<Model> models, String id) {
		for (Model model : models) {
			if (Objects.equals(getModelId(model), id))
				return model;
		}
		return null;
	}

	public static ElmDeclaration findElmDeclarationById(List<ElmDeclaration> elmDeclarations, String id) {
		for (ElmDeclaration elmDeclaration : elmDeclarations) {
			if (Objects.equals(getElmDeclarationId(elmDeclaration), id))
				return elmDeclaration;
		}
		return null;
	}

	public static Declaration findDeclarationById(List<Declaration> declarations, String id) {
		for (Declaration declaration : declarations) {
			if (Objects.equals(getDeclarationId(declaration), id))
				return declaration;
		}
		return null;
	}

	public static ConstantDecl findConstantDeclById(List<ConstantDecl> constantDecls, String id) {
		for (ConstantDecl constantDecl : constantDecls) {
			if (Objects.equals(getConstantDeclId(constantDecl), id))
				return constantDecl;
		}
		return null;
	}

	public static VariableDecl findVariableDeclById(List<VariableDecl> variableDecls, String id) {
		for (VariableDecl variableDecl : variableDecls) {
			if (Objects.equals(getVariableDeclId(variableDecl), id))
				return variableDecl;
		}
		return null;
	}

	public static OptionsDeclaration findOptionsDeclarationById(List<OptionsDeclaration> optionsDeclarations, String id) {
		for (OptionsDeclaration optionsDeclaration : optionsDeclarations) {
			if (Objects.equals(getOptionsDeclarationId(optionsDeclaration), id))
				return optionsDeclaration;
		}
		return null;
	}

	public static Interval findIntervalById(List<Interval> intervals, String id) {
		for (Interval interval : intervals) {
			if (Objects.equals(getIntervalId(interval), id))
				return interval;
		}
		return null;
	}

	public static Enumeration findEnumerationById(List<Enumeration> enumerations, String id) {
		for (Enumeration enumeration : enumerations) {
			if (Objects.equals(getEnumerationId(enumeration), id))
				return enumeration;
		}
		return null;
	}

	public static RelDeclaration findRelDeclarationById(List<RelDeclaration> relDeclarations, String id) {
		for (RelDeclaration relDeclaration : relDeclarations) {
			if (Objects.equals(getRelDeclarationId(relDeclaration), id))
				return relDeclaration;
		}
		return null;
	}

	public static Relation findRelationById(List<Relation> relations, String id) {
		for (Relation relation : relations) {
			if (Objects.equals(getRelationId(relation), id))
				return relation;
		}
		return null;
	}

	public static Core findCoreById(List<Core> cores, String id) {
		for (Core core : cores) {
			if (Objects.equals(getCoreId(core), id))
				return core;
		}
		return null;
	}

	public static MultInstantiation findMultInstantiationById(List<MultInstantiation> multInstantiations, String id) {
		for (MultInstantiation multInstantiation : multInstantiations) {
			if (Objects.equals(getMultInstantiationId(multInstantiation), id))
				return multInstantiation;
		}
		return null;
	}

	public static Pair findPairById(List<Pair> pairs, String id) {
		for (Pair pair : pairs) {
			if (Objects.equals(getPairId(pair), id))
				return pair;
		}
		return null;
	}

	public static ComplexImplies findComplexImpliesById(List<ComplexImplies> complexImpliess, String id) {
		for (ComplexImplies complexImplies : complexImpliess) {
			if (Objects.equals(getComplexImpliesId(complexImplies), id))
				return complexImplies;
		}
		return null;
	}

	public static QImplies findQImpliesById(List<QImplies> qImpliess, String id) {
		for (QImplies qImplies : qImpliess) {
			if (Objects.equals(getQImpliesId(qImplies), id))
				return qImplies;
		}
		return null;
	}

	public static VarList findVarListById(List<VarList> varLists, String id) {
		for (VarList varList : varLists) {
			if (Objects.equals(getVarListId(varList), id))
				return varList;
		}
		return null;
	}

	public static Hierarchy findHierarchyById(List<Hierarchy> hierarchys, String id) {
		for (Hierarchy hierarchy : hierarchys) {
			if (Objects.equals(getHierarchyId(hierarchy), id))
				return hierarchy;
		}
		return null;
	}

	public static Decomposition findDecompositionById(List<Decomposition> decompositions, String id) {
		for (Decomposition decomposition : decompositions) {
			if (Objects.equals(getDecompositionId(decomposition), id))
				return decomposition;
		}
		return null;
	}

	public static Group findGroupById(List<Group> groups, String id) {
		for (Group group : groups) {
			if (Objects.equals(getGroupId(group), id))
				return group;
		}
		return null;
	}

	public static Range findRangeById(List<Range> ranges, String id) {
		for (Range range : ranges) {
			if (Objects.equals(getRangeId(range), id))
				return range;
		}
		return null;
	}

	public static Visibility findVisibilityById(List<Visibility> visibilitys, String id) {
		for (Visibility visibility : visibilitys) {
			if (Objects.equals(getVisibilityId(visibility), id))
				return visibility;
		}
		return null;
	}

	public static Order findOrderById(List<Order> orders, String id) {
		for (Order order : orders) {
			if (Objects.equals(getOrderId(order), id))
				return order;
		}
		return null;
	}

	public static Expression findExpressionById(List<Expression> expressions, String id) {
		for (Expression expression : expressions) {
			if (Objects.equals(getExpressionId(expression), id))
				return expression;
		}
		return null;
	}

	public static Relational findRelationalById(List<Relational> relationals, String id) {
		for (Relational relational : relationals) {
			if (Objects.equals(getRelationalId(relational), id))
				return relational;
		}
		return null;
	}

	public static Operations findOperationsById(List<Operations> operationss, String id) {
		for (Operations operations : operationss) {
			if (Objects.equals(getOperationsId(operations), id))
				return operations;
		}
		return null;
	}

	public static Operation findOperationById(List<Operation> operations, String id) {
		for (Operation operation : operations) {
			if (Objects.equals(getOperationId(operation), id))
				return operation;
		}
		return null;
	}

	public static BoolVal findBoolValById(List<BoolVal> boolVals, String id) {
		for (BoolVal boolVal : boolVals) {
			if (Objects.equals(getBoolValId(boolVal), id))
				return boolVal;
		}
		return null;
	}

	public static Number findNumberById(List<Number> numbers, String id) {
		for (Number number : numbers) {
			if (Objects.equals(getNumberId(number), id))
				return number;
		}
		return null;
	}

	public static Symbol findSymbolById(List<Symbol> symbols, String id) {
		for (Symbol symbol : symbols) {
			if (Objects.equals(getSymbolId(symbol), id))
				return symbol;
		}
		return null;
	}

	public static Value findValueById(List<Value> values, String id) {
		for (Value value : values) {
			if (Objects.equals(getValueId(value), id))
				return value;
		}
		return null;
	}

	public static ListOfValues findListOfValuesById(List<ListOfValues> listOfValuess, String id) {
		for (ListOfValues listOfValues : listOfValuess) {
			if (Objects.equals(getListOfValuesId(listOfValues), id))
				return listOfValues;
		}
		return null;
	}

	public static ListOfIDs findListOfIDsById(List<ListOfIDs> listOfIDss, String id) {
		for (ListOfIDs listOfIDs : listOfIDss) {
			if (Objects.equals(getListOfIDsId(listOfIDs), id))
				return listOfIDs;
		}
		return null;
	}

	public static ListOfRelRefs findListOfRelRefsById(List<ListOfRelRefs> listOfRelRefss, String id) {
		for (ListOfRelRefs listOfRelRefs : listOfRelRefss) {
			if (Objects.equals(getListOfRelRefsId(listOfRelRefs), id))
				return listOfRelRefs;
		}
		return null;
	}

	public static Names findNamesById(List<Names> namess, String id) {
		for (Names names : namess) {
			if (Objects.equals(getNamesId(names), id))
				return names;
		}
		return null;
	}

	public static Valuation findValuationById(List<Valuation> valuations, String id) {
		for (Valuation valuation : valuations) {
			if (Objects.equals(getValuationId(valuation), id))
				return valuation;
		}
		return null;
	}

	public static ListOfValuation findListOfValuationById(List<ListOfValuation> listOfValuations, String id) {
		for (ListOfValuation listOfValuation : listOfValuations) {
			if (Objects.equals(getListOfValuationId(listOfValuation), id))
				return listOfValuation;
		}
		return null;
	}

	public static ListOfListValues findListOfListValuesById(List<ListOfListValues> listOfListValuess, String id) {
		for (ListOfListValues listOfListValues : listOfListValuess) {
			if (Objects.equals(getListOfListValuesId(listOfListValues), id))
				return listOfListValues;
		}
		return null;
	}

	public static Iff findIffById(List<Iff> iffs, String id) {
		for (Iff iff : iffs) {
			if (Objects.equals(getIffId(iff), id))
				return iff;
		}
		return null;
	}

	public static Implies findImpliesById(List<Implies> impliess, String id) {
		for (Implies implies : impliess) {
			if (Objects.equals(getImpliesId(implies), id))
				return implies;
		}
		return null;
	}

	public static Or findOrById(List<Or> ors, String id) {
		for (Or or : ors) {
			if (Objects.equals(getOrId(or), id))
				return or;
		}
		return null;
	}

	public static And findAndById(List<And> ands, String id) {
		for (And and : ands) {
			if (Objects.equals(getAndId(and), id))
				return and;
		}
		return null;
	}

	public static Equality findEqualityById(List<Equality> equalitys, String id) {
		for (Equality equality : equalitys) {
			if (Objects.equals(getEqualityId(equality), id))
				return equality;
		}
		return null;
	}

	public static Comparison findComparisonById(List<Comparison> comparisons, String id) {
		for (Comparison comparison : comparisons) {
			if (Objects.equals(getComparisonId(comparison), id))
				return comparison;
		}
		return null;
	}

	public static Plus findPlusById(List<Plus> pluss, String id) {
		for (Plus plus : pluss) {
			if (Objects.equals(getPlusId(plus), id))
				return plus;
		}
		return null;
	}

	public static Minus findMinusById(List<Minus> minuss, String id) {
		for (Minus minus : minuss) {
			if (Objects.equals(getMinusId(minus), id))
				return minus;
		}
		return null;
	}

	public static MulOrDiv findMulOrDivById(List<MulOrDiv> mulOrDivs, String id) {
		for (MulOrDiv mulOrDiv : mulOrDivs) {
			if (Objects.equals(getMulOrDivId(mulOrDiv), id))
				return mulOrDiv;
		}
		return null;
	}

	public static Negation findNegationById(List<Negation> negations, String id) {
		for (Negation negation : negations) {
			if (Objects.equals(getNegationId(negation), id))
				return negation;
		}
		return null;
	}

	public static Unary findUnaryById(List<Unary> unarys, String id) {
		for (Unary unary : unarys) {
			if (Objects.equals(getUnaryId(unary), id))
				return unary;
		}
		return null;
	}

	public static Function findFunctionById(List<Function> functions, String id) {
		for (Function function : functions) {
			if (Objects.equals(getFunctionId(function), id))
				return function;
		}
		return null;
	}

	public static BoolConstant findBoolConstantById(List<BoolConstant> boolConstants, String id) {
		for (BoolConstant boolConstant : boolConstants) {
			if (Objects.equals(getBoolConstantId(boolConstant), id))
				return boolConstant;
		}
		return null;
	}

	public static VariableRef findVariableRefById(List<VariableRef> variableRefs, String id) {
		for (VariableRef variableRef : variableRefs) {
			if (Objects.equals(getVariableRefId(variableRef), id))
				return variableRef;
		}
		return null;
	}

	public static AttributeRef findAttributeRefById(List<AttributeRef> attributeRefs, String id) {
		for (AttributeRef attributeRef : attributeRefs) {
			if (Objects.equals(getAttributeRefId(attributeRef), id))
				return attributeRef;
		}
		return null;
	}

	public static StringConstant findStringConstantById(List<StringConstant> stringConstants, String id) {
		for (StringConstant stringConstant : stringConstants) {
			if (Objects.equals(getStringConstantId(stringConstant), id))
				return stringConstant;
		}
		return null;
	}

	public static IntConstant findIntConstantById(List<IntConstant> intConstants, String id) {
		for (IntConstant intConstant : intConstants) {
			if (Objects.equals(getIntConstantId(intConstant), id))
				return intConstant;
		}
		return null;
	}

	public static SingleInstruction findSingleInstructionById(List<SingleInstruction> singleInstructions, String id) {
		for (SingleInstruction singleInstruction : singleInstructions) {
			if (Objects.equals(getSingleInstructionId(singleInstruction), id))
				return singleInstruction;
		}
		return null;
	}

	public static ValidConf findValidConfById(List<ValidConf> validConfs, String id) {
		for (ValidConf validConf : validConfs) {
			if (Objects.equals(getValidConfId(validConf), id))
				return validConf;
		}
		return null;
	}

}
