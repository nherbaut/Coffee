/**
 */
package hlvl.impl;

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
import hlvl.HlvlPackage;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HlvlFactoryImpl extends EFactoryImpl implements HlvlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HlvlFactory init() {
		try {
			HlvlFactory theHlvlFactory = (HlvlFactory) EPackage.Registry.INSTANCE.getEFactory(HlvlPackage.eNS_URI);
			if (theHlvlFactory != null) {
				return theHlvlFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HlvlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HlvlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case HlvlPackage.MODEL:
			return createModel();
		case HlvlPackage.ELM_DECLARATION:
			return createElmDeclaration();
		case HlvlPackage.DECLARATION:
			return createDeclaration();
		case HlvlPackage.CONSTANT_DECL:
			return createConstantDecl();
		case HlvlPackage.VARIABLE_DECL:
			return createVariableDecl();
		case HlvlPackage.OPTIONS_DECLARATION:
			return createOptionsDeclaration();
		case HlvlPackage.INTERVAL:
			return createInterval();
		case HlvlPackage.ENUMERATION:
			return createEnumeration();
		case HlvlPackage.REL_DECLARATION:
			return createRelDeclaration();
		case HlvlPackage.RELATION:
			return createRelation();
		case HlvlPackage.CORE:
			return createCore();
		case HlvlPackage.MULT_INSTANTIATION:
			return createMultInstantiation();
		case HlvlPackage.PAIR:
			return createPair();
		case HlvlPackage.COMPLEX_IMPLIES:
			return createComplexImplies();
		case HlvlPackage.QIMPLIES:
			return createQImplies();
		case HlvlPackage.VAR_LIST:
			return createVarList();
		case HlvlPackage.HIERARCHY:
			return createHierarchy();
		case HlvlPackage.DECOMPOSITION:
			return createDecomposition();
		case HlvlPackage.GROUP:
			return createGroup();
		case HlvlPackage.RANGE:
			return createRange();
		case HlvlPackage.VISIBILITY:
			return createVisibility();
		case HlvlPackage.ORDER:
			return createOrder();
		case HlvlPackage.EXPRESSION:
			return createExpression();
		case HlvlPackage.RELATIONAL:
			return createRelational();
		case HlvlPackage.OPERATIONS:
			return createOperations();
		case HlvlPackage.OPERATION:
			return createOperation();
		case HlvlPackage.BOOL_VAL:
			return createBoolVal();
		case HlvlPackage.NUMBER:
			return createNumber();
		case HlvlPackage.SYMBOL:
			return createSymbol();
		case HlvlPackage.VALUE:
			return createValue();
		case HlvlPackage.LIST_OF_VALUES:
			return createListOfValues();
		case HlvlPackage.LIST_OF_IDS:
			return createListOfIDs();
		case HlvlPackage.LIST_OF_REL_REFS:
			return createListOfRelRefs();
		case HlvlPackage.NAMES:
			return createNames();
		case HlvlPackage.VALUATION:
			return createValuation();
		case HlvlPackage.LIST_OF_VALUATION:
			return createListOfValuation();
		case HlvlPackage.LIST_OF_LIST_VALUES:
			return createListOfListValues();
		case HlvlPackage.IFF:
			return createIff();
		case HlvlPackage.IMPLIES:
			return createImplies();
		case HlvlPackage.OR:
			return createOr();
		case HlvlPackage.AND:
			return createAnd();
		case HlvlPackage.EQUALITY:
			return createEquality();
		case HlvlPackage.COMPARISON:
			return createComparison();
		case HlvlPackage.PLUS:
			return createPlus();
		case HlvlPackage.MINUS:
			return createMinus();
		case HlvlPackage.MUL_OR_DIV:
			return createMulOrDiv();
		case HlvlPackage.NEGATION:
			return createNegation();
		case HlvlPackage.UNARY:
			return createUnary();
		case HlvlPackage.FUNCTION:
			return createFunction();
		case HlvlPackage.BOOL_CONSTANT:
			return createBoolConstant();
		case HlvlPackage.VARIABLE_REF:
			return createVariableRef();
		case HlvlPackage.ATTRIBUTE_REF:
			return createAttributeRef();
		case HlvlPackage.STRING_CONSTANT:
			return createStringConstant();
		case HlvlPackage.INT_CONSTANT:
			return createIntConstant();
		case HlvlPackage.SINGLE_INSTRUCTION:
			return createSingleInstruction();
		case HlvlPackage.VALID_CONF:
			return createValidConf();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElmDeclaration createElmDeclaration() {
		ElmDeclarationImpl elmDeclaration = new ElmDeclarationImpl();
		return elmDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Declaration createDeclaration() {
		DeclarationImpl declaration = new DeclarationImpl();
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantDecl createConstantDecl() {
		ConstantDeclImpl constantDecl = new ConstantDeclImpl();
		return constantDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDecl createVariableDecl() {
		VariableDeclImpl variableDecl = new VariableDeclImpl();
		return variableDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptionsDeclaration createOptionsDeclaration() {
		OptionsDeclarationImpl optionsDeclaration = new OptionsDeclarationImpl();
		return optionsDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interval createInterval() {
		IntervalImpl interval = new IntervalImpl();
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelDeclaration createRelDeclaration() {
		RelDeclarationImpl relDeclaration = new RelDeclarationImpl();
		return relDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Core createCore() {
		CoreImpl core = new CoreImpl();
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultInstantiation createMultInstantiation() {
		MultInstantiationImpl multInstantiation = new MultInstantiationImpl();
		return multInstantiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pair createPair() {
		PairImpl pair = new PairImpl();
		return pair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplexImplies createComplexImplies() {
		ComplexImpliesImpl complexImplies = new ComplexImpliesImpl();
		return complexImplies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QImplies createQImplies() {
		QImpliesImpl qImplies = new QImpliesImpl();
		return qImplies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VarList createVarList() {
		VarListImpl varList = new VarListImpl();
		return varList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hierarchy createHierarchy() {
		HierarchyImpl hierarchy = new HierarchyImpl();
		return hierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decomposition createDecomposition() {
		DecompositionImpl decomposition = new DecompositionImpl();
		return decomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range createRange() {
		RangeImpl range = new RangeImpl();
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Visibility createVisibility() {
		VisibilityImpl visibility = new VisibilityImpl();
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Order createOrder() {
		OrderImpl order = new OrderImpl();
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relational createRelational() {
		RelationalImpl relational = new RelationalImpl();
		return relational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operations createOperations() {
		OperationsImpl operations = new OperationsImpl();
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoolVal createBoolVal() {
		BoolValImpl boolVal = new BoolValImpl();
		return boolVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public hlvl.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Symbol createSymbol() {
		SymbolImpl symbol = new SymbolImpl();
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListOfValues createListOfValues() {
		ListOfValuesImpl listOfValues = new ListOfValuesImpl();
		return listOfValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListOfIDs createListOfIDs() {
		ListOfIDsImpl listOfIDs = new ListOfIDsImpl();
		return listOfIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListOfRelRefs createListOfRelRefs() {
		ListOfRelRefsImpl listOfRelRefs = new ListOfRelRefsImpl();
		return listOfRelRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Names createNames() {
		NamesImpl names = new NamesImpl();
		return names;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Valuation createValuation() {
		ValuationImpl valuation = new ValuationImpl();
		return valuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListOfValuation createListOfValuation() {
		ListOfValuationImpl listOfValuation = new ListOfValuationImpl();
		return listOfValuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListOfListValues createListOfListValues() {
		ListOfListValuesImpl listOfListValues = new ListOfListValuesImpl();
		return listOfListValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Iff createIff() {
		IffImpl iff = new IffImpl();
		return iff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Implies createImplies() {
		ImpliesImpl implies = new ImpliesImpl();
		return implies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Equality createEquality() {
		EqualityImpl equality = new EqualityImpl();
		return equality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comparison createComparison() {
		ComparisonImpl comparison = new ComparisonImpl();
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Plus createPlus() {
		PlusImpl plus = new PlusImpl();
		return plus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Minus createMinus() {
		MinusImpl minus = new MinusImpl();
		return minus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MulOrDiv createMulOrDiv() {
		MulOrDivImpl mulOrDiv = new MulOrDivImpl();
		return mulOrDiv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Negation createNegation() {
		NegationImpl negation = new NegationImpl();
		return negation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unary createUnary() {
		UnaryImpl unary = new UnaryImpl();
		return unary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoolConstant createBoolConstant() {
		BoolConstantImpl boolConstant = new BoolConstantImpl();
		return boolConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableRef createVariableRef() {
		VariableRefImpl variableRef = new VariableRefImpl();
		return variableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeRef createAttributeRef() {
		AttributeRefImpl attributeRef = new AttributeRefImpl();
		return attributeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringConstant createStringConstant() {
		StringConstantImpl stringConstant = new StringConstantImpl();
		return stringConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntConstant createIntConstant() {
		IntConstantImpl intConstant = new IntConstantImpl();
		return intConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleInstruction createSingleInstruction() {
		SingleInstructionImpl singleInstruction = new SingleInstructionImpl();
		return singleInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidConf createValidConf() {
		ValidConfImpl validConf = new ValidConfImpl();
		return validConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HlvlPackage getHlvlPackage() {
		return (HlvlPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HlvlPackage getPackage() {
		return HlvlPackage.eINSTANCE;
	}

} //HlvlFactoryImpl
