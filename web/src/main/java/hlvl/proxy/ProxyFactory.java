package hlvl.proxy;
import hlvl.proxy.PairProxy;
import hlvl.And;
import hlvl.AttributeRef;
import hlvl.BoolConstant;
import hlvl.BoolVal;
import hlvl.Comparison;
import hlvl.ComplexImplies;
import hlvl.ConstantDecl;
import hlvl.Core;
import hlvl.Declaration;
import hlvl.Decomposition;
import hlvl.ElmDeclaration;
import hlvl.Enumeration;
import hlvl.Equality;
import hlvl.Expression;
import hlvl.Function;
import hlvl.Group;
import hlvl.Hierarchy;
import hlvl.HlvlFactory;
import hlvl.Iff;
import hlvl.Implies;
import hlvl.IntConstant;
import hlvl.Interval;
import hlvl.ListOfIDs;
import hlvl.ListOfListValues;
import hlvl.ListOfRelRefs;
import hlvl.ListOfValuation;
import hlvl.ListOfValues;
import hlvl.Minus;
import hlvl.Model;
import hlvl.MulOrDiv;
import hlvl.MultInstantiation;
import hlvl.Names;
import hlvl.Negation;
import hlvl.Operation;
import hlvl.Operations;
import hlvl.OptionsDeclaration;
import hlvl.Or;
import hlvl.Order;
import hlvl.Pair;
import hlvl.Plus;
import hlvl.QImplies;
import hlvl.Range;
import hlvl.RelDeclaration;
import hlvl.Relation;
import hlvl.Relational;
import hlvl.SingleInstruction;
import hlvl.StringConstant;
import hlvl.Symbol;
import hlvl.Unary;
import hlvl.ValidConf;
import hlvl.Valuation;
import hlvl.Value;
import hlvl.VarList;
import hlvl.VariableDecl;
import hlvl.VariableRef;
import hlvl.Visibility;
import hlvl.*;
import hlvl.Number;
import javax.xml.bind.annotation.XmlRootElement;

public class ProxyFactory {

	public static ModelProxy createModelProxy(String name) {
		if (name.equals("Model"))
			return new ModelProxy();
		return null;
	}

	public static Model createModel(ModelProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("model"))
			return factory.createModel();
		return null;
	}

	public static ElmDeclarationProxy createElmDeclarationProxy(String name) {
		if (name.equals("ElmDeclaration"))
			return new ElmDeclarationProxy();
		return null;
	}

	public static ElmDeclaration createElmDeclaration(ElmDeclarationProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("elmdeclaration"))
			return factory.createElmDeclaration();
		return null;
	}

	public static DeclarationProxy createDeclarationProxy(String name) {
		if (name.equals("Declaration"))
			return new DeclarationProxy();
		if (name.equals("ConstantDecl"))
			return new ConstantDeclProxy();
		if (name.equals("VariableDecl"))
			return new VariableDeclProxy();
		return null;
	}

	public static Declaration createDeclaration(DeclarationProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("declaration"))
			return factory.createDeclaration();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("constantdecl"))
			return factory.createConstantDecl();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("variabledecl"))
			return factory.createVariableDecl();
		return null;
	}

	public static ConstantDeclProxy createConstantDeclProxy(String name) {
		if (name.equals("ConstantDecl"))
			return new ConstantDeclProxy();
		return null;
	}

	public static ConstantDecl createConstantDecl(ConstantDeclProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("constantdecl"))
			return factory.createConstantDecl();
		return null;
	}

	public static VariableDeclProxy createVariableDeclProxy(String name) {
		if (name.equals("VariableDecl"))
			return new VariableDeclProxy();
		return null;
	}

	public static VariableDecl createVariableDecl(VariableDeclProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("variabledecl"))
			return factory.createVariableDecl();
		return null;
	}

	public static OptionsDeclarationProxy createOptionsDeclarationProxy(String name) {
		if (name.equals("OptionsDeclaration"))
			return new OptionsDeclarationProxy();
		if (name.equals("Interval"))
			return new IntervalProxy();
		if (name.equals("Enumeration"))
			return new EnumerationProxy();
		return null;
	}

	public static OptionsDeclaration createOptionsDeclaration(OptionsDeclarationProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("optionsdeclaration"))
			return factory.createOptionsDeclaration();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("interval"))
			return factory.createInterval();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("enumeration"))
			return factory.createEnumeration();
		return null;
	}

	public static IntervalProxy createIntervalProxy(String name) {
		if (name.equals("Interval"))
			return new IntervalProxy();
		return null;
	}

	public static Interval createInterval(IntervalProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("interval"))
			return factory.createInterval();
		return null;
	}

	public static EnumerationProxy createEnumerationProxy(String name) {
		if (name.equals("Enumeration"))
			return new EnumerationProxy();
		return null;
	}

	public static Enumeration createEnumeration(EnumerationProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("enumeration"))
			return factory.createEnumeration();
		return null;
	}

	public static RelDeclarationProxy createRelDeclarationProxy(String name) {
		if (name.equals("RelDeclaration"))
			return new RelDeclarationProxy();
		return null;
	}

	public static RelDeclaration createRelDeclaration(RelDeclarationProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("reldeclaration"))
			return factory.createRelDeclaration();
		return null;
	}

	public static RelationProxy createRelationProxy(String name) {
		if (name.equals("Relation"))
			return new RelationProxy();
		if (name.equals("Core"))
			return new CoreProxy();
		if (name.equals("MultInstantiation"))
			return new MultInstantiationProxy();
		if (name.equals("Pair"))
			return new PairProxy();
		if (name.equals("ComplexImplies"))
			return new ComplexImpliesProxy();
		if (name.equals("QImplies"))
			return new QImpliesProxy();
		if (name.equals("VarList"))
			return new VarListProxy();
		if (name.equals("Hierarchy"))
			return new HierarchyProxy();
		if (name.equals("Decomposition"))
			return new DecompositionProxy();
		if (name.equals("Group"))
			return new GroupProxy();
		if (name.equals("Visibility"))
			return new VisibilityProxy();
		if (name.equals("Order"))
			return new OrderProxy();
		if (name.equals("Expression"))
			return new ExpressionProxy();
		return null;
	}

	public static Relation createRelation(RelationProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("relation"))
			return factory.createRelation();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("core"))
			return factory.createCore();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("multinstantiation"))
			return factory.createMultInstantiation();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("pair"))
			return factory.createPair();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("compleximplies"))
			return factory.createComplexImplies();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("qimplies"))
			return factory.createQImplies();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("varlist"))
			return factory.createVarList();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("hierarchy"))
			return factory.createHierarchy();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("decomposition"))
			return factory.createDecomposition();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("group"))
			return factory.createGroup();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("visibility"))
			return factory.createVisibility();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("order"))
			return factory.createOrder();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("expression"))
			return factory.createExpression();
		return null;
	}

	public static CoreProxy createCoreProxy(String name) {
		if (name.equals("Core"))
			return new CoreProxy();
		return null;
	}

	public static Core createCore(CoreProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("core"))
			return factory.createCore();
		return null;
	}

	public static MultInstantiationProxy createMultInstantiationProxy(String name) {
		if (name.equals("MultInstantiation"))
			return new MultInstantiationProxy();
		return null;
	}

	public static MultInstantiation createMultInstantiation(MultInstantiationProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("multinstantiation"))
			return factory.createMultInstantiation();
		return null;
	}

	public static PairProxy createPairProxy(String name) {
		if (name.equals("Pair"))
			return new PairProxy();
		return null;
	}

	public static Pair createPair(PairProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("pair"))
			return factory.createPair();
		return null;
	}

	public static ComplexImpliesProxy createComplexImpliesProxy(String name) {
		if (name.equals("ComplexImplies"))
			return new ComplexImpliesProxy();
		return null;
	}

	public static ComplexImplies createComplexImplies(ComplexImpliesProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("compleximplies"))
			return factory.createComplexImplies();
		return null;
	}

	public static QImpliesProxy createQImpliesProxy(String name) {
		if (name.equals("QImplies"))
			return new QImpliesProxy();
		return null;
	}

	public static QImplies createQImplies(QImpliesProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("qimplies"))
			return factory.createQImplies();
		return null;
	}

	public static VarListProxy createVarListProxy(String name) {
		if (name.equals("VarList"))
			return new VarListProxy();
		return null;
	}

	public static VarList createVarList(VarListProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("varlist"))
			return factory.createVarList();
		return null;
	}

	public static HierarchyProxy createHierarchyProxy(String name) {
		if (name.equals("Hierarchy"))
			return new HierarchyProxy();
		if (name.equals("Decomposition"))
			return new DecompositionProxy();
		if (name.equals("Group"))
			return new GroupProxy();
		return null;
	}

	public static Hierarchy createHierarchy(HierarchyProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("hierarchy"))
			return factory.createHierarchy();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("decomposition"))
			return factory.createDecomposition();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("group"))
			return factory.createGroup();
		return null;
	}

	public static DecompositionProxy createDecompositionProxy(String name) {
		if (name.equals("Decomposition"))
			return new DecompositionProxy();
		return null;
	}

	public static Decomposition createDecomposition(DecompositionProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("decomposition"))
			return factory.createDecomposition();
		return null;
	}

	public static GroupProxy createGroupProxy(String name) {
		if (name.equals("Group"))
			return new GroupProxy();
		return null;
	}

	public static Group createGroup(GroupProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("group"))
			return factory.createGroup();
		return null;
	}

	public static RangeProxy createRangeProxy(String name) {
		if (name.equals("Range"))
			return new RangeProxy();
		return null;
	}

	public static Range createRange(RangeProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("range"))
			return factory.createRange();
		return null;
	}

	public static VisibilityProxy createVisibilityProxy(String name) {
		if (name.equals("Visibility"))
			return new VisibilityProxy();
		return null;
	}

	public static Visibility createVisibility(VisibilityProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("visibility"))
			return factory.createVisibility();
		return null;
	}

	public static OrderProxy createOrderProxy(String name) {
		if (name.equals("Order"))
			return new OrderProxy();
		return null;
	}

	public static Order createOrder(OrderProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("order"))
			return factory.createOrder();
		return null;
	}

	public static ExpressionProxy createExpressionProxy(String name) {
		if (name.equals("Expression"))
			return new ExpressionProxy();
		return null;
	}

	public static Expression createExpression(ExpressionProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("expression"))
			return factory.createExpression();
		return null;
	}

	public static RelationalProxy createRelationalProxy(String name) {
		if (name.equals("Relational"))
			return new RelationalProxy();
		if (name.equals("Iff"))
			return new IffProxy();
		if (name.equals("Implies"))
			return new ImpliesProxy();
		if (name.equals("Or"))
			return new OrProxy();
		if (name.equals("And"))
			return new AndProxy();
		if (name.equals("Equality"))
			return new EqualityProxy();
		if (name.equals("Comparison"))
			return new ComparisonProxy();
		if (name.equals("Plus"))
			return new PlusProxy();
		if (name.equals("Minus"))
			return new MinusProxy();
		if (name.equals("MulOrDiv"))
			return new MulOrDivProxy();
		if (name.equals("Negation"))
			return new NegationProxy();
		if (name.equals("Unary"))
			return new UnaryProxy();
		if (name.equals("Function"))
			return new FunctionProxy();
		if (name.equals("BoolConstant"))
			return new BoolConstantProxy();
		if (name.equals("VariableRef"))
			return new VariableRefProxy();
		if (name.equals("AttributeRef"))
			return new AttributeRefProxy();
		if (name.equals("StringConstant"))
			return new StringConstantProxy();
		if (name.equals("IntConstant"))
			return new IntConstantProxy();
		return null;
	}

	public static Relational createRelational(RelationalProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("relational"))
			return factory.createRelational();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("iff"))
			return factory.createIff();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("implies"))
			return factory.createImplies();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("or"))
			return factory.createOr();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("and"))
			return factory.createAnd();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("equality"))
			return factory.createEquality();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("comparison"))
			return factory.createComparison();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("plus"))
			return factory.createPlus();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("minus"))
			return factory.createMinus();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("mulordiv"))
			return factory.createMulOrDiv();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("negation"))
			return factory.createNegation();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("unary"))
			return factory.createUnary();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("function"))
			return factory.createFunction();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("boolconstant"))
			return factory.createBoolConstant();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("variableref"))
			return factory.createVariableRef();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("attributeref"))
			return factory.createAttributeRef();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("stringconstant"))
			return factory.createStringConstant();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("intconstant"))
			return factory.createIntConstant();
		return null;
	}

	public static OperationsProxy createOperationsProxy(String name) {
		if (name.equals("Operations"))
			return new OperationsProxy();
		return null;
	}

	public static Operations createOperations(OperationsProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("operations"))
			return factory.createOperations();
		return null;
	}

	public static OperationProxy createOperationProxy(String name) {
		if (name.equals("Operation"))
			return new OperationProxy();
		if (name.equals("SingleInstruction"))
			return new SingleInstructionProxy();
		if (name.equals("ValidConf"))
			return new ValidConfProxy();
		return null;
	}

	public static Operation createOperation(OperationProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("operation"))
			return factory.createOperation();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("singleinstruction"))
			return factory.createSingleInstruction();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("validconf"))
			return factory.createValidConf();
		return null;
	}

	public static BoolValProxy createBoolValProxy(String name) {
		if (name.equals("BoolVal"))
			return new BoolValProxy();
		return null;
	}

	public static BoolVal createBoolVal(BoolValProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("boolval"))
			return factory.createBoolVal();
		return null;
	}

	public static NumberProxy createNumberProxy(String name) {
		if (name.equals("Number"))
			return new NumberProxy();
		return null;
	}

	public static Number createNumber(NumberProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("number"))
			return factory.createNumber();
		return null;
	}

	public static SymbolProxy createSymbolProxy(String name) {
		if (name.equals("Symbol"))
			return new SymbolProxy();
		return null;
	}

	public static Symbol createSymbol(SymbolProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("symbol"))
			return factory.createSymbol();
		return null;
	}

	public static ValueProxy createValueProxy(String name) {
		if (name.equals("BoolVal"))
			return new BoolValProxy();
		if (name.equals("Number"))
			return new NumberProxy();
		if (name.equals("Symbol"))
			return new SymbolProxy();
		if (name.equals("Value"))
			return new ValueProxy();
		return null;
	}

	public static Value createValue(ValueProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("boolval"))
			return factory.createBoolVal();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("number"))
			return factory.createNumber();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("symbol"))
			return factory.createSymbol();
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("value"))
			return factory.createValue();
		return null;
	}

	public static ListOfValuesProxy createListOfValuesProxy(String name) {
		if (name.equals("ListOfValues"))
			return new ListOfValuesProxy();
		return null;
	}

	public static ListOfValues createListOfValues(ListOfValuesProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("listofvalues"))
			return factory.createListOfValues();
		return null;
	}

	public static ListOfIDsProxy createListOfIDsProxy(String name) {
		if (name.equals("ListOfIDs"))
			return new ListOfIDsProxy();
		return null;
	}

	public static ListOfIDs createListOfIDs(ListOfIDsProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("listofids"))
			return factory.createListOfIDs();
		return null;
	}

	public static ListOfRelRefsProxy createListOfRelRefsProxy(String name) {
		if (name.equals("ListOfRelRefs"))
			return new ListOfRelRefsProxy();
		return null;
	}

	public static ListOfRelRefs createListOfRelRefs(ListOfRelRefsProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("listofrelrefs"))
			return factory.createListOfRelRefs();
		return null;
	}

	public static NamesProxy createNamesProxy(String name) {
		if (name.equals("Names"))
			return new NamesProxy();
		return null;
	}

	public static Names createNames(NamesProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("names"))
			return factory.createNames();
		return null;
	}

	public static ValuationProxy createValuationProxy(String name) {
		if (name.equals("Valuation"))
			return new ValuationProxy();
		return null;
	}

	public static Valuation createValuation(ValuationProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("valuation"))
			return factory.createValuation();
		return null;
	}

	public static ListOfValuationProxy createListOfValuationProxy(String name) {
		if (name.equals("ListOfValuation"))
			return new ListOfValuationProxy();
		return null;
	}

	public static ListOfValuation createListOfValuation(ListOfValuationProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("listofvaluation"))
			return factory.createListOfValuation();
		return null;
	}

	public static ListOfListValuesProxy createListOfListValuesProxy(String name) {
		if (name.equals("ListOfListValues"))
			return new ListOfListValuesProxy();
		return null;
	}

	public static ListOfListValues createListOfListValues(ListOfListValuesProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("listoflistvalues"))
			return factory.createListOfListValues();
		return null;
	}

	public static IffProxy createIffProxy(String name) {
		if (name.equals("Iff"))
			return new IffProxy();
		return null;
	}

	public static Iff createIff(IffProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("iff"))
			return factory.createIff();
		return null;
	}

	public static ImpliesProxy createImpliesProxy(String name) {
		if (name.equals("Implies"))
			return new ImpliesProxy();
		return null;
	}

	public static Implies createImplies(ImpliesProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("implies"))
			return factory.createImplies();
		return null;
	}

	public static OrProxy createOrProxy(String name) {
		if (name.equals("Or"))
			return new OrProxy();
		return null;
	}

	public static Or createOr(OrProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("or"))
			return factory.createOr();
		return null;
	}

	public static AndProxy createAndProxy(String name) {
		if (name.equals("And"))
			return new AndProxy();
		return null;
	}

	public static And createAnd(AndProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("and"))
			return factory.createAnd();
		return null;
	}

	public static EqualityProxy createEqualityProxy(String name) {
		if (name.equals("Equality"))
			return new EqualityProxy();
		return null;
	}

	public static Equality createEquality(EqualityProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("equality"))
			return factory.createEquality();
		return null;
	}

	public static ComparisonProxy createComparisonProxy(String name) {
		if (name.equals("Comparison"))
			return new ComparisonProxy();
		return null;
	}

	public static Comparison createComparison(ComparisonProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("comparison"))
			return factory.createComparison();
		return null;
	}

	public static PlusProxy createPlusProxy(String name) {
		if (name.equals("Plus"))
			return new PlusProxy();
		return null;
	}

	public static Plus createPlus(PlusProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("plus"))
			return factory.createPlus();
		return null;
	}

	public static MinusProxy createMinusProxy(String name) {
		if (name.equals("Minus"))
			return new MinusProxy();
		return null;
	}

	public static Minus createMinus(MinusProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("minus"))
			return factory.createMinus();
		return null;
	}

	public static MulOrDivProxy createMulOrDivProxy(String name) {
		if (name.equals("MulOrDiv"))
			return new MulOrDivProxy();
		return null;
	}

	public static MulOrDiv createMulOrDiv(MulOrDivProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("mulordiv"))
			return factory.createMulOrDiv();
		return null;
	}

	public static NegationProxy createNegationProxy(String name) {
		if (name.equals("Negation"))
			return new NegationProxy();
		return null;
	}

	public static Negation createNegation(NegationProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("negation"))
			return factory.createNegation();
		return null;
	}

	public static UnaryProxy createUnaryProxy(String name) {
		if (name.equals("Unary"))
			return new UnaryProxy();
		return null;
	}

	public static Unary createUnary(UnaryProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("unary"))
			return factory.createUnary();
		return null;
	}

	public static FunctionProxy createFunctionProxy(String name) {
		if (name.equals("Function"))
			return new FunctionProxy();
		return null;
	}

	public static Function createFunction(FunctionProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("function"))
			return factory.createFunction();
		return null;
	}

	public static BoolConstantProxy createBoolConstantProxy(String name) {
		if (name.equals("BoolConstant"))
			return new BoolConstantProxy();
		return null;
	}

	public static BoolConstant createBoolConstant(BoolConstantProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("boolconstant"))
			return factory.createBoolConstant();
		return null;
	}

	public static VariableRefProxy createVariableRefProxy(String name) {
		if (name.equals("VariableRef"))
			return new VariableRefProxy();
		return null;
	}

	public static VariableRef createVariableRef(VariableRefProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("variableref"))
			return factory.createVariableRef();
		return null;
	}

	public static AttributeRefProxy createAttributeRefProxy(String name) {
		if (name.equals("AttributeRef"))
			return new AttributeRefProxy();
		return null;
	}

	public static AttributeRef createAttributeRef(AttributeRefProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("attributeref"))
			return factory.createAttributeRef();
		return null;
	}

	public static StringConstantProxy createStringConstantProxy(String name) {
		if (name.equals("StringConstant"))
			return new StringConstantProxy();
		return null;
	}

	public static StringConstant createStringConstant(StringConstantProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("stringconstant"))
			return factory.createStringConstant();
		return null;
	}

	public static IntConstantProxy createIntConstantProxy(String name) {
		if (name.equals("IntConstant"))
			return new IntConstantProxy();
		return null;
	}

	public static IntConstant createIntConstant(IntConstantProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("intconstant"))
			return factory.createIntConstant();
		return null;
	}

	public static SingleInstructionProxy createSingleInstructionProxy(String name) {
		if (name.equals("SingleInstruction"))
			return new SingleInstructionProxy();
		return null;
	}

	public static SingleInstruction createSingleInstruction(SingleInstructionProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("singleinstruction"))
			return factory.createSingleInstruction();
		return null;
	}

	public static ValidConfProxy createValidConfProxy(String name) {
		if (name.equals("ValidConf"))
			return new ValidConfProxy();
		return null;
	}

	public static ValidConf createValidConf(ValidConfProxy type) {
		HlvlFactory factory = HlvlFactory.eINSTANCE;
		if (type.getClass().getAnnotation(XmlRootElement.class).equals("validconf"))
			return factory.createValidConf();
		return null;
	}

}