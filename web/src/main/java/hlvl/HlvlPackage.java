/**
 */
package hlvl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hlvl.HlvlFactory
 * @model kind="package"
 * @generated
 */
public interface HlvlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hlvl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.coffee.com/Hlvl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hlvl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HlvlPackage eINSTANCE = hlvl.impl.HlvlPackageImpl.init();

	/**
	 * The meta object id for the '{@link hlvl.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.ModelImpl
	 * @see hlvl.impl.HlvlPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__RELATIONS = 2;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OPERATIONS = 3;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link hlvl.impl.ElmDeclarationImpl <em>Elm Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.ElmDeclarationImpl
	 * @see hlvl.impl.HlvlPackageImpl#getElmDeclaration()
	 * @generated
	 */
	int ELM_DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Att</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELM_DECLARATION__ATT = 0;

	/**
	 * The feature id for the '<em><b>Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELM_DECLARATION__INST = 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELM_DECLARATION__DATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELM_DECLARATION__NAME = 3;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELM_DECLARATION__DECLARATION = 4;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELM_DECLARATION__COMMENT = 5;

	/**
	 * The number of structural features of the '<em>Elm Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELM_DECLARATION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link hlvl.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.DeclarationImpl
	 * @see hlvl.impl.HlvlPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 2;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link hlvl.impl.ConstantDeclImpl <em>Constant Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.ConstantDeclImpl
	 * @see hlvl.impl.HlvlPackageImpl#getConstantDecl()
	 * @generated
	 */
	int CONSTANT_DECL = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DECL__VALUE = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DECL_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hlvl.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.VariableDeclImpl
	 * @see hlvl.impl.HlvlPackageImpl#getVariableDecl()
	 * @generated
	 */
	int VARIABLE_DECL = 4;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL__VARIANTS = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hlvl.impl.OptionsDeclarationImpl <em>Options Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.OptionsDeclarationImpl
	 * @see hlvl.impl.HlvlPackageImpl#getOptionsDeclaration()
	 * @generated
	 */
	int OPTIONS_DECLARATION = 5;

	/**
	 * The number of structural features of the '<em>Options Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link hlvl.impl.IntervalImpl <em>Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.IntervalImpl
	 * @see hlvl.impl.HlvlPackageImpl#getInterval()
	 * @generated
	 */
	int INTERVAL = 6;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__START = OPTIONS_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__END = OPTIONS_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_FEATURE_COUNT = OPTIONS_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hlvl.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.EnumerationImpl
	 * @see hlvl.impl.HlvlPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 7;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LIST = OPTIONS_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = OPTIONS_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hlvl.impl.RelDeclarationImpl <em>Rel Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.RelDeclarationImpl
	 * @see hlvl.impl.HlvlPackageImpl#getRelDeclaration()
	 * @generated
	 */
	int REL_DECLARATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_DECLARATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_DECLARATION__EXP = 1;

	/**
	 * The number of structural features of the '<em>Rel Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_DECLARATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hlvl.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.RelationImpl
	 * @see hlvl.impl.HlvlPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 9;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link hlvl.impl.CoreImpl <em>Core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.CoreImpl
	 * @see hlvl.impl.HlvlPackageImpl#getCore()
	 * @generated
	 */
	int CORE = 10;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__ELEMENTS = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hlvl.impl.MultInstantiationImpl <em>Mult Instantiation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.MultInstantiationImpl
	 * @see hlvl.impl.HlvlPackageImpl#getMultInstantiation()
	 * @generated
	 */
	int MULT_INSTANTIATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULT_INSTANTIATION__NAME = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULT_INSTANTIATION__MIN = RELATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULT_INSTANTIATION__MAX = RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mult Instantiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULT_INSTANTIATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hlvl.impl.PairImpl <em>Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.PairImpl
	 * @see hlvl.impl.HlvlPackageImpl#getPair()
	 * @generated
	 */
	int PAIR = 12;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__OPERATOR = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Var1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__VAR1 = RELATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Var2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__VAR2 = RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_FEATURE_COUNT = RELATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hlvl.impl.ComplexImpliesImpl <em>Complex Implies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.ComplexImpliesImpl
	 * @see hlvl.impl.HlvlPackageImpl#getComplexImplies()
	 * @generated
	 */
	int COMPLEX_IMPLIES = 13;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_IMPLIES__EXP = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_IMPLIES__ELEMENTS = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Complex Implies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_IMPLIES_FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hlvl.impl.QImpliesImpl <em>QImplies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.QImpliesImpl
	 * @see hlvl.impl.HlvlPackageImpl#getQImplies()
	 * @generated
	 */
	int QIMPLIES = 14;

	/**
	 * The feature id for the '<em><b>Mina</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QIMPLIES__MINA = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maxa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QIMPLIES__MAXA = RELATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Var1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QIMPLIES__VAR1 = RELATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Minb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QIMPLIES__MINB = RELATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Maxb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QIMPLIES__MAXB = RELATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Var2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QIMPLIES__VAR2 = RELATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>QImplies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QIMPLIES_FEATURE_COUNT = RELATION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link hlvl.impl.VarListImpl <em>Var List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.VarListImpl
	 * @see hlvl.impl.HlvlPackageImpl#getVarList()
	 * @generated
	 */
	int VAR_LIST = 15;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST__OPERATOR = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Var1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST__VAR1 = RELATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST__LIST = RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Var List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST_FEATURE_COUNT = RELATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hlvl.impl.HierarchyImpl <em>Hierarchy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.HierarchyImpl
	 * @see hlvl.impl.HlvlPackageImpl#getHierarchy()
	 * @generated
	 */
	int HIERARCHY = 16;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY__PARENT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY__CHILDREN = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hlvl.impl.DecompositionImpl <em>Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.DecompositionImpl
	 * @see hlvl.impl.HlvlPackageImpl#getDecomposition()
	 * @generated
	 */
	int DECOMPOSITION = 17;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__PARENT = HIERARCHY__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__CHILDREN = HIERARCHY__CHILDREN;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__CARDINALITY = HIERARCHY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_FEATURE_COUNT = HIERARCHY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hlvl.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.GroupImpl
	 * @see hlvl.impl.HlvlPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 18;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PARENT = HIERARCHY__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CHILDREN = HIERARCHY__CHILDREN;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MIN = HIERARCHY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MAX = HIERARCHY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = HIERARCHY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hlvl.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.RangeImpl
	 * @see hlvl.impl.HlvlPackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hlvl.impl.VisibilityImpl <em>Visibility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.VisibilityImpl
	 * @see hlvl.impl.HlvlPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 20;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY__CONDITION = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY__CHILDREN = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Visibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hlvl.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.OrderImpl
	 * @see hlvl.impl.HlvlPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 21;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__OPERATOR = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__LEFT = RELATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__RIGHT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = RELATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hlvl.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.ExpressionImpl
	 * @see hlvl.impl.HlvlPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 22;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXP = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hlvl.impl.RelationalImpl <em>Relational</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.RelationalImpl
	 * @see hlvl.impl.HlvlPackageImpl#getRelational()
	 * @generated
	 */
	int RELATIONAL = 23;

	/**
	 * The number of structural features of the '<em>Relational</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link hlvl.impl.OperationsImpl <em>Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.OperationsImpl
	 * @see hlvl.impl.HlvlPackageImpl#getOperations()
	 * @generated
	 */
	int OPERATIONS = 24;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS__OP = 0;

	/**
	 * The number of structural features of the '<em>Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hlvl.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.OperationImpl
	 * @see hlvl.impl.HlvlPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 25;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link hlvl.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.ValueImpl
	 * @see hlvl.impl.HlvlPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 29;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link hlvl.impl.BoolValImpl <em>Bool Val</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.BoolValImpl
	 * @see hlvl.impl.HlvlPackageImpl#getBoolVal()
	 * @generated
	 */
	int BOOL_VAL = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VAL__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Val</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VAL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hlvl.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.NumberImpl
	 * @see hlvl.impl.HlvlPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 27;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hlvl.impl.SymbolImpl <em>Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.SymbolImpl
	 * @see hlvl.impl.HlvlPackageImpl#getSymbol()
	 * @generated
	 */
	int SYMBOL = 28;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hlvl.impl.ListOfValuesImpl <em>List Of Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.ListOfValuesImpl
	 * @see hlvl.impl.HlvlPackageImpl#getListOfValues()
	 * @generated
	 */
	int LIST_OF_VALUES = 30;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_VALUES__VALUES = 0;

	/**
	 * The number of structural features of the '<em>List Of Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_VALUES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hlvl.impl.ListOfIDsImpl <em>List Of IDs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.ListOfIDsImpl
	 * @see hlvl.impl.HlvlPackageImpl#getListOfIDs()
	 * @generated
	 */
	int LIST_OF_IDS = 31;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_IDS__VALUES = 0;

	/**
	 * The number of structural features of the '<em>List Of IDs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_IDS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hlvl.impl.ListOfRelRefsImpl <em>List Of Rel Refs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.ListOfRelRefsImpl
	 * @see hlvl.impl.HlvlPackageImpl#getListOfRelRefs()
	 * @generated
	 */
	int LIST_OF_REL_REFS = 32;

	/**
	 * The feature id for the '<em><b>Ids</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_REL_REFS__IDS = 0;

	/**
	 * The number of structural features of the '<em>List Of Rel Refs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_REL_REFS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hlvl.impl.NamesImpl <em>Names</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.NamesImpl
	 * @see hlvl.impl.HlvlPackageImpl#getNames()
	 * @generated
	 */
	int NAMES = 33;

	/**
	 * The feature id for the '<em><b>Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMES__IDS = 0;

	/**
	 * The number of structural features of the '<em>Names</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hlvl.impl.ValuationImpl <em>Valuation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.ValuationImpl
	 * @see hlvl.impl.HlvlPackageImpl#getValuation()
	 * @generated
	 */
	int VALUATION = 34;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUATION__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUATION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Valuation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hlvl.impl.ListOfValuationImpl <em>List Of Valuation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.ListOfValuationImpl
	 * @see hlvl.impl.HlvlPackageImpl#getListOfValuation()
	 * @generated
	 */
	int LIST_OF_VALUATION = 35;

	/**
	 * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_VALUATION__PAIRS = 0;

	/**
	 * The number of structural features of the '<em>List Of Valuation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_VALUATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hlvl.impl.ListOfListValuesImpl <em>List Of List Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.ListOfListValuesImpl
	 * @see hlvl.impl.HlvlPackageImpl#getListOfListValues()
	 * @generated
	 */
	int LIST_OF_LIST_VALUES = 36;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_LIST_VALUES__LIST = 0;

	/**
	 * The number of structural features of the '<em>List Of List Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_LIST_VALUES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hlvl.impl.IffImpl <em>Iff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.IffImpl
	 * @see hlvl.impl.HlvlPackageImpl#getIff()
	 * @generated
	 */
	int IFF = 37;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFF__LEFT = RELATIONAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFF__RIGHT = RELATIONAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Iff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFF_FEATURE_COUNT = RELATIONAL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hlvl.impl.ImpliesImpl <em>Implies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.ImpliesImpl
	 * @see hlvl.impl.HlvlPackageImpl#getImplies()
	 * @generated
	 */
	int IMPLIES = 38;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES__LEFT = RELATIONAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES__RIGHT = RELATIONAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Implies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_FEATURE_COUNT = RELATIONAL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hlvl.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.OrImpl
	 * @see hlvl.impl.HlvlPackageImpl#getOr()
	 * @generated
	 */
	int OR = 39;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__LEFT = RELATIONAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__RIGHT = RELATIONAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = RELATIONAL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hlvl.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.AndImpl
	 * @see hlvl.impl.HlvlPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 40;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__LEFT = RELATIONAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__RIGHT = RELATIONAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = RELATIONAL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hlvl.impl.EqualityImpl <em>Equality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.EqualityImpl
	 * @see hlvl.impl.HlvlPackageImpl#getEquality()
	 * @generated
	 */
	int EQUALITY = 41;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__LEFT = RELATIONAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__OP = RELATIONAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__RIGHT = RELATIONAL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_FEATURE_COUNT = RELATIONAL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hlvl.impl.ComparisonImpl <em>Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.ComparisonImpl
	 * @see hlvl.impl.HlvlPackageImpl#getComparison()
	 * @generated
	 */
	int COMPARISON = 42;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__LEFT = RELATIONAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__OP = RELATIONAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__RIGHT = RELATIONAL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_FEATURE_COUNT = RELATIONAL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hlvl.impl.PlusImpl <em>Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.PlusImpl
	 * @see hlvl.impl.HlvlPackageImpl#getPlus()
	 * @generated
	 */
	int PLUS = 43;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__LEFT = RELATIONAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__RIGHT = RELATIONAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_FEATURE_COUNT = RELATIONAL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hlvl.impl.MinusImpl <em>Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.MinusImpl
	 * @see hlvl.impl.HlvlPackageImpl#getMinus()
	 * @generated
	 */
	int MINUS = 44;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__LEFT = RELATIONAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__RIGHT = RELATIONAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_FEATURE_COUNT = RELATIONAL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hlvl.impl.MulOrDivImpl <em>Mul Or Div</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.MulOrDivImpl
	 * @see hlvl.impl.HlvlPackageImpl#getMulOrDiv()
	 * @generated
	 */
	int MUL_OR_DIV = 45;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OR_DIV__LEFT = RELATIONAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OR_DIV__OP = RELATIONAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OR_DIV__RIGHT = RELATIONAL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mul Or Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OR_DIV_FEATURE_COUNT = RELATIONAL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hlvl.impl.NegationImpl <em>Negation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.NegationImpl
	 * @see hlvl.impl.HlvlPackageImpl#getNegation()
	 * @generated
	 */
	int NEGATION = 46;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION__EXPRESSION = RELATIONAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Negation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION_FEATURE_COUNT = RELATIONAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hlvl.impl.UnaryImpl <em>Unary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.UnaryImpl
	 * @see hlvl.impl.HlvlPackageImpl#getUnary()
	 * @generated
	 */
	int UNARY = 47;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY__OP = RELATIONAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY__EXPRESSION = RELATIONAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FEATURE_COUNT = RELATIONAL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hlvl.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.FunctionImpl
	 * @see hlvl.impl.HlvlPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 48;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OP = RELATIONAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__LEFT = RELATIONAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__RIGHT = RELATIONAL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = RELATIONAL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hlvl.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.BoolConstantImpl
	 * @see hlvl.impl.HlvlPackageImpl#getBoolConstant()
	 * @generated
	 */
	int BOOL_CONSTANT = 49;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTANT__VALUE = RELATIONAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTANT_FEATURE_COUNT = RELATIONAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hlvl.impl.VariableRefImpl <em>Variable Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.VariableRefImpl
	 * @see hlvl.impl.HlvlPackageImpl#getVariableRef()
	 * @generated
	 */
	int VARIABLE_REF = 50;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF__VARIABLE = RELATIONAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF_FEATURE_COUNT = RELATIONAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hlvl.impl.AttributeRefImpl <em>Attribute Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.AttributeRefImpl
	 * @see hlvl.impl.HlvlPackageImpl#getAttributeRef()
	 * @generated
	 */
	int ATTRIBUTE_REF = 51;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REF__ATTRIBUTE = RELATIONAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REF_FEATURE_COUNT = RELATIONAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hlvl.impl.StringConstantImpl <em>String Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.StringConstantImpl
	 * @see hlvl.impl.HlvlPackageImpl#getStringConstant()
	 * @generated
	 */
	int STRING_CONSTANT = 52;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT__VALUE = RELATIONAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_FEATURE_COUNT = RELATIONAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hlvl.impl.IntConstantImpl <em>Int Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.IntConstantImpl
	 * @see hlvl.impl.HlvlPackageImpl#getIntConstant()
	 * @generated
	 */
	int INT_CONSTANT = 53;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT__VALUE = RELATIONAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT_FEATURE_COUNT = RELATIONAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hlvl.impl.SingleInstructionImpl <em>Single Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.SingleInstructionImpl
	 * @see hlvl.impl.HlvlPackageImpl#getSingleInstruction()
	 * @generated
	 */
	int SINGLE_INSTRUCTION = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_INSTRUCTION__NAME = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_INSTRUCTION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hlvl.impl.ValidConfImpl <em>Valid Conf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hlvl.impl.ValidConfImpl
	 * @see hlvl.impl.HlvlPackageImpl#getValidConf()
	 * @generated
	 */
	int VALID_CONF = 55;

	/**
	 * The feature id for the '<em><b>Valuations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_CONF__VALUATIONS = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Valid Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_CONF_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link hlvl.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see hlvl.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hlvl.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link hlvl.Model#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see hlvl.Model#getElements()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link hlvl.Model#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see hlvl.Model#getRelations()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Relations();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Model#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operations</em>'.
	 * @see hlvl.Model#getOperations()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Operations();

	/**
	 * Returns the meta object for class '{@link hlvl.ElmDeclaration <em>Elm Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elm Declaration</em>'.
	 * @see hlvl.ElmDeclaration
	 * @generated
	 */
	EClass getElmDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.ElmDeclaration#getAtt <em>Att</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Att</em>'.
	 * @see hlvl.ElmDeclaration#getAtt()
	 * @see #getElmDeclaration()
	 * @generated
	 */
	EAttribute getElmDeclaration_Att();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.ElmDeclaration#getInst <em>Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inst</em>'.
	 * @see hlvl.ElmDeclaration#getInst()
	 * @see #getElmDeclaration()
	 * @generated
	 */
	EAttribute getElmDeclaration_Inst();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.ElmDeclaration#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see hlvl.ElmDeclaration#getDataType()
	 * @see #getElmDeclaration()
	 * @generated
	 */
	EAttribute getElmDeclaration_DataType();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.ElmDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hlvl.ElmDeclaration#getName()
	 * @see #getElmDeclaration()
	 * @generated
	 */
	EAttribute getElmDeclaration_Name();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.ElmDeclaration#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declaration</em>'.
	 * @see hlvl.ElmDeclaration#getDeclaration()
	 * @see #getElmDeclaration()
	 * @generated
	 */
	EReference getElmDeclaration_Declaration();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.ElmDeclaration#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see hlvl.ElmDeclaration#getComment()
	 * @see #getElmDeclaration()
	 * @generated
	 */
	EAttribute getElmDeclaration_Comment();

	/**
	 * Returns the meta object for class '{@link hlvl.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see hlvl.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for class '{@link hlvl.ConstantDecl <em>Constant Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Decl</em>'.
	 * @see hlvl.ConstantDecl
	 * @generated
	 */
	EClass getConstantDecl();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.ConstantDecl#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see hlvl.ConstantDecl#getValue()
	 * @see #getConstantDecl()
	 * @generated
	 */
	EReference getConstantDecl_Value();

	/**
	 * Returns the meta object for class '{@link hlvl.VariableDecl <em>Variable Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Decl</em>'.
	 * @see hlvl.VariableDecl
	 * @generated
	 */
	EClass getVariableDecl();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.VariableDecl#getVariants <em>Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variants</em>'.
	 * @see hlvl.VariableDecl#getVariants()
	 * @see #getVariableDecl()
	 * @generated
	 */
	EReference getVariableDecl_Variants();

	/**
	 * Returns the meta object for class '{@link hlvl.OptionsDeclaration <em>Options Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options Declaration</em>'.
	 * @see hlvl.OptionsDeclaration
	 * @generated
	 */
	EClass getOptionsDeclaration();

	/**
	 * Returns the meta object for class '{@link hlvl.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval</em>'.
	 * @see hlvl.Interval
	 * @generated
	 */
	EClass getInterval();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.Interval#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see hlvl.Interval#getStart()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_Start();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.Interval#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see hlvl.Interval#getEnd()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_End();

	/**
	 * Returns the meta object for class '{@link hlvl.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see hlvl.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Enumeration#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see hlvl.Enumeration#getList()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_List();

	/**
	 * Returns the meta object for class '{@link hlvl.RelDeclaration <em>Rel Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rel Declaration</em>'.
	 * @see hlvl.RelDeclaration
	 * @generated
	 */
	EClass getRelDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.RelDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hlvl.RelDeclaration#getName()
	 * @see #getRelDeclaration()
	 * @generated
	 */
	EAttribute getRelDeclaration_Name();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.RelDeclaration#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see hlvl.RelDeclaration#getExp()
	 * @see #getRelDeclaration()
	 * @generated
	 */
	EReference getRelDeclaration_Exp();

	/**
	 * Returns the meta object for class '{@link hlvl.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see hlvl.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for class '{@link hlvl.Core <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core</em>'.
	 * @see hlvl.Core
	 * @generated
	 */
	EClass getCore();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Core#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elements</em>'.
	 * @see hlvl.Core#getElements()
	 * @see #getCore()
	 * @generated
	 */
	EReference getCore_Elements();

	/**
	 * Returns the meta object for class '{@link hlvl.MultInstantiation <em>Mult Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mult Instantiation</em>'.
	 * @see hlvl.MultInstantiation
	 * @generated
	 */
	EClass getMultInstantiation();

	/**
	 * Returns the meta object for the reference '{@link hlvl.MultInstantiation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see hlvl.MultInstantiation#getName()
	 * @see #getMultInstantiation()
	 * @generated
	 */
	EReference getMultInstantiation_Name();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.MultInstantiation#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min</em>'.
	 * @see hlvl.MultInstantiation#getMin()
	 * @see #getMultInstantiation()
	 * @generated
	 */
	EReference getMultInstantiation_Min();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.MultInstantiation#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max</em>'.
	 * @see hlvl.MultInstantiation#getMax()
	 * @see #getMultInstantiation()
	 * @generated
	 */
	EReference getMultInstantiation_Max();

	/**
	 * Returns the meta object for class '{@link hlvl.Pair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pair</em>'.
	 * @see hlvl.Pair
	 * @generated
	 */
	EClass getPair();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.Pair#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see hlvl.Pair#getOperator()
	 * @see #getPair()
	 * @generated
	 */
	EAttribute getPair_Operator();

	/**
	 * Returns the meta object for the reference '{@link hlvl.Pair#getVar1 <em>Var1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Var1</em>'.
	 * @see hlvl.Pair#getVar1()
	 * @see #getPair()
	 * @generated
	 */
	EReference getPair_Var1();

	/**
	 * Returns the meta object for the reference '{@link hlvl.Pair#getVar2 <em>Var2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Var2</em>'.
	 * @see hlvl.Pair#getVar2()
	 * @see #getPair()
	 * @generated
	 */
	EReference getPair_Var2();

	/**
	 * Returns the meta object for class '{@link hlvl.ComplexImplies <em>Complex Implies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Implies</em>'.
	 * @see hlvl.ComplexImplies
	 * @generated
	 */
	EClass getComplexImplies();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.ComplexImplies#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see hlvl.ComplexImplies#getExp()
	 * @see #getComplexImplies()
	 * @generated
	 */
	EReference getComplexImplies_Exp();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.ComplexImplies#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elements</em>'.
	 * @see hlvl.ComplexImplies#getElements()
	 * @see #getComplexImplies()
	 * @generated
	 */
	EReference getComplexImplies_Elements();

	/**
	 * Returns the meta object for class '{@link hlvl.QImplies <em>QImplies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QImplies</em>'.
	 * @see hlvl.QImplies
	 * @generated
	 */
	EClass getQImplies();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.QImplies#getMina <em>Mina</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mina</em>'.
	 * @see hlvl.QImplies#getMina()
	 * @see #getQImplies()
	 * @generated
	 */
	EAttribute getQImplies_Mina();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.QImplies#getMaxa <em>Maxa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxa</em>'.
	 * @see hlvl.QImplies#getMaxa()
	 * @see #getQImplies()
	 * @generated
	 */
	EAttribute getQImplies_Maxa();

	/**
	 * Returns the meta object for the reference '{@link hlvl.QImplies#getVar1 <em>Var1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Var1</em>'.
	 * @see hlvl.QImplies#getVar1()
	 * @see #getQImplies()
	 * @generated
	 */
	EReference getQImplies_Var1();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.QImplies#getMinb <em>Minb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minb</em>'.
	 * @see hlvl.QImplies#getMinb()
	 * @see #getQImplies()
	 * @generated
	 */
	EAttribute getQImplies_Minb();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.QImplies#getMaxb <em>Maxb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxb</em>'.
	 * @see hlvl.QImplies#getMaxb()
	 * @see #getQImplies()
	 * @generated
	 */
	EAttribute getQImplies_Maxb();

	/**
	 * Returns the meta object for the reference '{@link hlvl.QImplies#getVar2 <em>Var2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Var2</em>'.
	 * @see hlvl.QImplies#getVar2()
	 * @see #getQImplies()
	 * @generated
	 */
	EReference getQImplies_Var2();

	/**
	 * Returns the meta object for class '{@link hlvl.VarList <em>Var List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var List</em>'.
	 * @see hlvl.VarList
	 * @generated
	 */
	EClass getVarList();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.VarList#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see hlvl.VarList#getOperator()
	 * @see #getVarList()
	 * @generated
	 */
	EAttribute getVarList_Operator();

	/**
	 * Returns the meta object for the reference '{@link hlvl.VarList#getVar1 <em>Var1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Var1</em>'.
	 * @see hlvl.VarList#getVar1()
	 * @see #getVarList()
	 * @generated
	 */
	EReference getVarList_Var1();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.VarList#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see hlvl.VarList#getList()
	 * @see #getVarList()
	 * @generated
	 */
	EReference getVarList_List();

	/**
	 * Returns the meta object for class '{@link hlvl.Hierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hierarchy</em>'.
	 * @see hlvl.Hierarchy
	 * @generated
	 */
	EClass getHierarchy();

	/**
	 * Returns the meta object for the reference '{@link hlvl.Hierarchy#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see hlvl.Hierarchy#getParent()
	 * @see #getHierarchy()
	 * @generated
	 */
	EReference getHierarchy_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Hierarchy#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Children</em>'.
	 * @see hlvl.Hierarchy#getChildren()
	 * @see #getHierarchy()
	 * @generated
	 */
	EReference getHierarchy_Children();

	/**
	 * Returns the meta object for class '{@link hlvl.Decomposition <em>Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decomposition</em>'.
	 * @see hlvl.Decomposition
	 * @generated
	 */
	EClass getDecomposition();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.Decomposition#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see hlvl.Decomposition#getCardinality()
	 * @see #getDecomposition()
	 * @generated
	 */
	EAttribute getDecomposition_Cardinality();

	/**
	 * Returns the meta object for class '{@link hlvl.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see hlvl.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.Group#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see hlvl.Group#getMin()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Min();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Group#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max</em>'.
	 * @see hlvl.Group#getMax()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Max();

	/**
	 * Returns the meta object for class '{@link hlvl.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see hlvl.Range
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.Range#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hlvl.Range#getValue()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Value();

	/**
	 * Returns the meta object for class '{@link hlvl.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visibility</em>'.
	 * @see hlvl.Visibility
	 * @generated
	 */
	EClass getVisibility();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Visibility#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see hlvl.Visibility#getCondition()
	 * @see #getVisibility()
	 * @generated
	 */
	EReference getVisibility_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Visibility#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Children</em>'.
	 * @see hlvl.Visibility#getChildren()
	 * @see #getVisibility()
	 * @generated
	 */
	EReference getVisibility_Children();

	/**
	 * Returns the meta object for class '{@link hlvl.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see hlvl.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.Order#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see hlvl.Order#getOperator()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Operator();

	/**
	 * Returns the meta object for the reference '{@link hlvl.Order#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see hlvl.Order#getLeft()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Left();

	/**
	 * Returns the meta object for the containment reference list '{@link hlvl.Order#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Right</em>'.
	 * @see hlvl.Order#getRight()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Right();

	/**
	 * Returns the meta object for class '{@link hlvl.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see hlvl.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Expression#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see hlvl.Expression#getExp()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Exp();

	/**
	 * Returns the meta object for class '{@link hlvl.Relational <em>Relational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational</em>'.
	 * @see hlvl.Relational
	 * @generated
	 */
	EClass getRelational();

	/**
	 * Returns the meta object for class '{@link hlvl.Operations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operations</em>'.
	 * @see hlvl.Operations
	 * @generated
	 */
	EClass getOperations();

	/**
	 * Returns the meta object for the containment reference list '{@link hlvl.Operations#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Op</em>'.
	 * @see hlvl.Operations#getOp()
	 * @see #getOperations()
	 * @generated
	 */
	EReference getOperations_Op();

	/**
	 * Returns the meta object for class '{@link hlvl.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see hlvl.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link hlvl.BoolVal <em>Bool Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Val</em>'.
	 * @see hlvl.BoolVal
	 * @generated
	 */
	EClass getBoolVal();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.BoolVal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hlvl.BoolVal#getValue()
	 * @see #getBoolVal()
	 * @generated
	 */
	EAttribute getBoolVal_Value();

	/**
	 * Returns the meta object for class '{@link hlvl.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see hlvl.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.Number#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hlvl.Number#getValue()
	 * @see #getNumber()
	 * @generated
	 */
	EAttribute getNumber_Value();

	/**
	 * Returns the meta object for class '{@link hlvl.Symbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol</em>'.
	 * @see hlvl.Symbol
	 * @generated
	 */
	EClass getSymbol();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.Symbol#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hlvl.Symbol#getValue()
	 * @see #getSymbol()
	 * @generated
	 */
	EAttribute getSymbol_Value();

	/**
	 * Returns the meta object for class '{@link hlvl.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see hlvl.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link hlvl.ListOfValues <em>List Of Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Of Values</em>'.
	 * @see hlvl.ListOfValues
	 * @generated
	 */
	EClass getListOfValues();

	/**
	 * Returns the meta object for the containment reference list '{@link hlvl.ListOfValues#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see hlvl.ListOfValues#getValues()
	 * @see #getListOfValues()
	 * @generated
	 */
	EReference getListOfValues_Values();

	/**
	 * Returns the meta object for class '{@link hlvl.ListOfIDs <em>List Of IDs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Of IDs</em>'.
	 * @see hlvl.ListOfIDs
	 * @generated
	 */
	EClass getListOfIDs();

	/**
	 * Returns the meta object for the reference list '{@link hlvl.ListOfIDs#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see hlvl.ListOfIDs#getValues()
	 * @see #getListOfIDs()
	 * @generated
	 */
	EReference getListOfIDs_Values();

	/**
	 * Returns the meta object for class '{@link hlvl.ListOfRelRefs <em>List Of Rel Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Of Rel Refs</em>'.
	 * @see hlvl.ListOfRelRefs
	 * @generated
	 */
	EClass getListOfRelRefs();

	/**
	 * Returns the meta object for the reference list '{@link hlvl.ListOfRelRefs#getIds <em>Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ids</em>'.
	 * @see hlvl.ListOfRelRefs#getIds()
	 * @see #getListOfRelRefs()
	 * @generated
	 */
	EReference getListOfRelRefs_Ids();

	/**
	 * Returns the meta object for class '{@link hlvl.Names <em>Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Names</em>'.
	 * @see hlvl.Names
	 * @generated
	 */
	EClass getNames();

	/**
	 * Returns the meta object for the attribute list '{@link hlvl.Names#getIds <em>Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids</em>'.
	 * @see hlvl.Names#getIds()
	 * @see #getNames()
	 * @generated
	 */
	EAttribute getNames_Ids();

	/**
	 * Returns the meta object for class '{@link hlvl.Valuation <em>Valuation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valuation</em>'.
	 * @see hlvl.Valuation
	 * @generated
	 */
	EClass getValuation();

	/**
	 * Returns the meta object for the reference '{@link hlvl.Valuation#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see hlvl.Valuation#getElement()
	 * @see #getValuation()
	 * @generated
	 */
	EReference getValuation_Element();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Valuation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see hlvl.Valuation#getValue()
	 * @see #getValuation()
	 * @generated
	 */
	EReference getValuation_Value();

	/**
	 * Returns the meta object for class '{@link hlvl.ListOfValuation <em>List Of Valuation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Of Valuation</em>'.
	 * @see hlvl.ListOfValuation
	 * @generated
	 */
	EClass getListOfValuation();

	/**
	 * Returns the meta object for the containment reference list '{@link hlvl.ListOfValuation#getPairs <em>Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pairs</em>'.
	 * @see hlvl.ListOfValuation#getPairs()
	 * @see #getListOfValuation()
	 * @generated
	 */
	EReference getListOfValuation_Pairs();

	/**
	 * Returns the meta object for class '{@link hlvl.ListOfListValues <em>List Of List Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Of List Values</em>'.
	 * @see hlvl.ListOfListValues
	 * @generated
	 */
	EClass getListOfListValues();

	/**
	 * Returns the meta object for the containment reference list '{@link hlvl.ListOfListValues#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see hlvl.ListOfListValues#getList()
	 * @see #getListOfListValues()
	 * @generated
	 */
	EReference getListOfListValues_List();

	/**
	 * Returns the meta object for class '{@link hlvl.Iff <em>Iff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iff</em>'.
	 * @see hlvl.Iff
	 * @generated
	 */
	EClass getIff();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Iff#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see hlvl.Iff#getLeft()
	 * @see #getIff()
	 * @generated
	 */
	EReference getIff_Left();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Iff#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see hlvl.Iff#getRight()
	 * @see #getIff()
	 * @generated
	 */
	EReference getIff_Right();

	/**
	 * Returns the meta object for class '{@link hlvl.Implies <em>Implies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implies</em>'.
	 * @see hlvl.Implies
	 * @generated
	 */
	EClass getImplies();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Implies#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see hlvl.Implies#getLeft()
	 * @see #getImplies()
	 * @generated
	 */
	EReference getImplies_Left();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Implies#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see hlvl.Implies#getRight()
	 * @see #getImplies()
	 * @generated
	 */
	EReference getImplies_Right();

	/**
	 * Returns the meta object for class '{@link hlvl.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see hlvl.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Or#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see hlvl.Or#getLeft()
	 * @see #getOr()
	 * @generated
	 */
	EReference getOr_Left();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Or#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see hlvl.Or#getRight()
	 * @see #getOr()
	 * @generated
	 */
	EReference getOr_Right();

	/**
	 * Returns the meta object for class '{@link hlvl.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see hlvl.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.And#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see hlvl.And#getLeft()
	 * @see #getAnd()
	 * @generated
	 */
	EReference getAnd_Left();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.And#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see hlvl.And#getRight()
	 * @see #getAnd()
	 * @generated
	 */
	EReference getAnd_Right();

	/**
	 * Returns the meta object for class '{@link hlvl.Equality <em>Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equality</em>'.
	 * @see hlvl.Equality
	 * @generated
	 */
	EClass getEquality();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Equality#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see hlvl.Equality#getLeft()
	 * @see #getEquality()
	 * @generated
	 */
	EReference getEquality_Left();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.Equality#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see hlvl.Equality#getOp()
	 * @see #getEquality()
	 * @generated
	 */
	EAttribute getEquality_Op();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Equality#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see hlvl.Equality#getRight()
	 * @see #getEquality()
	 * @generated
	 */
	EReference getEquality_Right();

	/**
	 * Returns the meta object for class '{@link hlvl.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison</em>'.
	 * @see hlvl.Comparison
	 * @generated
	 */
	EClass getComparison();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Comparison#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see hlvl.Comparison#getLeft()
	 * @see #getComparison()
	 * @generated
	 */
	EReference getComparison_Left();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.Comparison#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see hlvl.Comparison#getOp()
	 * @see #getComparison()
	 * @generated
	 */
	EAttribute getComparison_Op();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Comparison#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see hlvl.Comparison#getRight()
	 * @see #getComparison()
	 * @generated
	 */
	EReference getComparison_Right();

	/**
	 * Returns the meta object for class '{@link hlvl.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus</em>'.
	 * @see hlvl.Plus
	 * @generated
	 */
	EClass getPlus();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Plus#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see hlvl.Plus#getLeft()
	 * @see #getPlus()
	 * @generated
	 */
	EReference getPlus_Left();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Plus#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see hlvl.Plus#getRight()
	 * @see #getPlus()
	 * @generated
	 */
	EReference getPlus_Right();

	/**
	 * Returns the meta object for class '{@link hlvl.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus</em>'.
	 * @see hlvl.Minus
	 * @generated
	 */
	EClass getMinus();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Minus#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see hlvl.Minus#getLeft()
	 * @see #getMinus()
	 * @generated
	 */
	EReference getMinus_Left();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Minus#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see hlvl.Minus#getRight()
	 * @see #getMinus()
	 * @generated
	 */
	EReference getMinus_Right();

	/**
	 * Returns the meta object for class '{@link hlvl.MulOrDiv <em>Mul Or Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mul Or Div</em>'.
	 * @see hlvl.MulOrDiv
	 * @generated
	 */
	EClass getMulOrDiv();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.MulOrDiv#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see hlvl.MulOrDiv#getLeft()
	 * @see #getMulOrDiv()
	 * @generated
	 */
	EReference getMulOrDiv_Left();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.MulOrDiv#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see hlvl.MulOrDiv#getOp()
	 * @see #getMulOrDiv()
	 * @generated
	 */
	EAttribute getMulOrDiv_Op();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.MulOrDiv#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see hlvl.MulOrDiv#getRight()
	 * @see #getMulOrDiv()
	 * @generated
	 */
	EReference getMulOrDiv_Right();

	/**
	 * Returns the meta object for class '{@link hlvl.Negation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negation</em>'.
	 * @see hlvl.Negation
	 * @generated
	 */
	EClass getNegation();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Negation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see hlvl.Negation#getExpression()
	 * @see #getNegation()
	 * @generated
	 */
	EReference getNegation_Expression();

	/**
	 * Returns the meta object for class '{@link hlvl.Unary <em>Unary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary</em>'.
	 * @see hlvl.Unary
	 * @generated
	 */
	EClass getUnary();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.Unary#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see hlvl.Unary#getOp()
	 * @see #getUnary()
	 * @generated
	 */
	EAttribute getUnary_Op();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Unary#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see hlvl.Unary#getExpression()
	 * @see #getUnary()
	 * @generated
	 */
	EReference getUnary_Expression();

	/**
	 * Returns the meta object for class '{@link hlvl.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see hlvl.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.Function#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see hlvl.Function#getOp()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Op();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Function#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see hlvl.Function#getLeft()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Left();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.Function#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see hlvl.Function#getRight()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Right();

	/**
	 * Returns the meta object for class '{@link hlvl.BoolConstant <em>Bool Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Constant</em>'.
	 * @see hlvl.BoolConstant
	 * @generated
	 */
	EClass getBoolConstant();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.BoolConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hlvl.BoolConstant#getValue()
	 * @see #getBoolConstant()
	 * @generated
	 */
	EAttribute getBoolConstant_Value();

	/**
	 * Returns the meta object for class '{@link hlvl.VariableRef <em>Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Ref</em>'.
	 * @see hlvl.VariableRef
	 * @generated
	 */
	EClass getVariableRef();

	/**
	 * Returns the meta object for the reference '{@link hlvl.VariableRef#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see hlvl.VariableRef#getVariable()
	 * @see #getVariableRef()
	 * @generated
	 */
	EReference getVariableRef_Variable();

	/**
	 * Returns the meta object for class '{@link hlvl.AttributeRef <em>Attribute Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Ref</em>'.
	 * @see hlvl.AttributeRef
	 * @generated
	 */
	EClass getAttributeRef();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.AttributeRef#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see hlvl.AttributeRef#getAttribute()
	 * @see #getAttributeRef()
	 * @generated
	 */
	EAttribute getAttributeRef_Attribute();

	/**
	 * Returns the meta object for class '{@link hlvl.StringConstant <em>String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Constant</em>'.
	 * @see hlvl.StringConstant
	 * @generated
	 */
	EClass getStringConstant();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.StringConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hlvl.StringConstant#getValue()
	 * @see #getStringConstant()
	 * @generated
	 */
	EAttribute getStringConstant_Value();

	/**
	 * Returns the meta object for class '{@link hlvl.IntConstant <em>Int Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Constant</em>'.
	 * @see hlvl.IntConstant
	 * @generated
	 */
	EClass getIntConstant();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.IntConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hlvl.IntConstant#getValue()
	 * @see #getIntConstant()
	 * @generated
	 */
	EAttribute getIntConstant_Value();

	/**
	 * Returns the meta object for class '{@link hlvl.SingleInstruction <em>Single Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Instruction</em>'.
	 * @see hlvl.SingleInstruction
	 * @generated
	 */
	EClass getSingleInstruction();

	/**
	 * Returns the meta object for the attribute '{@link hlvl.SingleInstruction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hlvl.SingleInstruction#getName()
	 * @see #getSingleInstruction()
	 * @generated
	 */
	EAttribute getSingleInstruction_Name();

	/**
	 * Returns the meta object for class '{@link hlvl.ValidConf <em>Valid Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Conf</em>'.
	 * @see hlvl.ValidConf
	 * @generated
	 */
	EClass getValidConf();

	/**
	 * Returns the meta object for the containment reference '{@link hlvl.ValidConf#getValuations <em>Valuations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valuations</em>'.
	 * @see hlvl.ValidConf#getValuations()
	 * @see #getValidConf()
	 * @generated
	 */
	EReference getValidConf_Valuations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HlvlFactory getHlvlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hlvl.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.ModelImpl
		 * @see hlvl.impl.HlvlPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__RELATIONS = eINSTANCE.getModel_Relations();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__OPERATIONS = eINSTANCE.getModel_Operations();

		/**
		 * The meta object literal for the '{@link hlvl.impl.ElmDeclarationImpl <em>Elm Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.ElmDeclarationImpl
		 * @see hlvl.impl.HlvlPackageImpl#getElmDeclaration()
		 * @generated
		 */
		EClass ELM_DECLARATION = eINSTANCE.getElmDeclaration();

		/**
		 * The meta object literal for the '<em><b>Att</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELM_DECLARATION__ATT = eINSTANCE.getElmDeclaration_Att();

		/**
		 * The meta object literal for the '<em><b>Inst</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELM_DECLARATION__INST = eINSTANCE.getElmDeclaration_Inst();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELM_DECLARATION__DATA_TYPE = eINSTANCE.getElmDeclaration_DataType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELM_DECLARATION__NAME = eINSTANCE.getElmDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELM_DECLARATION__DECLARATION = eINSTANCE.getElmDeclaration_Declaration();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELM_DECLARATION__COMMENT = eINSTANCE.getElmDeclaration_Comment();

		/**
		 * The meta object literal for the '{@link hlvl.impl.DeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.DeclarationImpl
		 * @see hlvl.impl.HlvlPackageImpl#getDeclaration()
		 * @generated
		 */
		EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link hlvl.impl.ConstantDeclImpl <em>Constant Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.ConstantDeclImpl
		 * @see hlvl.impl.HlvlPackageImpl#getConstantDecl()
		 * @generated
		 */
		EClass CONSTANT_DECL = eINSTANCE.getConstantDecl();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT_DECL__VALUE = eINSTANCE.getConstantDecl_Value();

		/**
		 * The meta object literal for the '{@link hlvl.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.VariableDeclImpl
		 * @see hlvl.impl.HlvlPackageImpl#getVariableDecl()
		 * @generated
		 */
		EClass VARIABLE_DECL = eINSTANCE.getVariableDecl();

		/**
		 * The meta object literal for the '<em><b>Variants</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECL__VARIANTS = eINSTANCE.getVariableDecl_Variants();

		/**
		 * The meta object literal for the '{@link hlvl.impl.OptionsDeclarationImpl <em>Options Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.OptionsDeclarationImpl
		 * @see hlvl.impl.HlvlPackageImpl#getOptionsDeclaration()
		 * @generated
		 */
		EClass OPTIONS_DECLARATION = eINSTANCE.getOptionsDeclaration();

		/**
		 * The meta object literal for the '{@link hlvl.impl.IntervalImpl <em>Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.IntervalImpl
		 * @see hlvl.impl.HlvlPackageImpl#getInterval()
		 * @generated
		 */
		EClass INTERVAL = eINSTANCE.getInterval();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__START = eINSTANCE.getInterval_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__END = eINSTANCE.getInterval_End();

		/**
		 * The meta object literal for the '{@link hlvl.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.EnumerationImpl
		 * @see hlvl.impl.HlvlPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__LIST = eINSTANCE.getEnumeration_List();

		/**
		 * The meta object literal for the '{@link hlvl.impl.RelDeclarationImpl <em>Rel Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.RelDeclarationImpl
		 * @see hlvl.impl.HlvlPackageImpl#getRelDeclaration()
		 * @generated
		 */
		EClass REL_DECLARATION = eINSTANCE.getRelDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REL_DECLARATION__NAME = eINSTANCE.getRelDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REL_DECLARATION__EXP = eINSTANCE.getRelDeclaration_Exp();

		/**
		 * The meta object literal for the '{@link hlvl.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.RelationImpl
		 * @see hlvl.impl.HlvlPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '{@link hlvl.impl.CoreImpl <em>Core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.CoreImpl
		 * @see hlvl.impl.HlvlPackageImpl#getCore()
		 * @generated
		 */
		EClass CORE = eINSTANCE.getCore();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE__ELEMENTS = eINSTANCE.getCore_Elements();

		/**
		 * The meta object literal for the '{@link hlvl.impl.MultInstantiationImpl <em>Mult Instantiation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.MultInstantiationImpl
		 * @see hlvl.impl.HlvlPackageImpl#getMultInstantiation()
		 * @generated
		 */
		EClass MULT_INSTANTIATION = eINSTANCE.getMultInstantiation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULT_INSTANTIATION__NAME = eINSTANCE.getMultInstantiation_Name();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULT_INSTANTIATION__MIN = eINSTANCE.getMultInstantiation_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULT_INSTANTIATION__MAX = eINSTANCE.getMultInstantiation_Max();

		/**
		 * The meta object literal for the '{@link hlvl.impl.PairImpl <em>Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.PairImpl
		 * @see hlvl.impl.HlvlPackageImpl#getPair()
		 * @generated
		 */
		EClass PAIR = eINSTANCE.getPair();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAIR__OPERATOR = eINSTANCE.getPair_Operator();

		/**
		 * The meta object literal for the '<em><b>Var1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAIR__VAR1 = eINSTANCE.getPair_Var1();

		/**
		 * The meta object literal for the '<em><b>Var2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAIR__VAR2 = eINSTANCE.getPair_Var2();

		/**
		 * The meta object literal for the '{@link hlvl.impl.ComplexImpliesImpl <em>Complex Implies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.ComplexImpliesImpl
		 * @see hlvl.impl.HlvlPackageImpl#getComplexImplies()
		 * @generated
		 */
		EClass COMPLEX_IMPLIES = eINSTANCE.getComplexImplies();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_IMPLIES__EXP = eINSTANCE.getComplexImplies_Exp();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_IMPLIES__ELEMENTS = eINSTANCE.getComplexImplies_Elements();

		/**
		 * The meta object literal for the '{@link hlvl.impl.QImpliesImpl <em>QImplies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.QImpliesImpl
		 * @see hlvl.impl.HlvlPackageImpl#getQImplies()
		 * @generated
		 */
		EClass QIMPLIES = eINSTANCE.getQImplies();

		/**
		 * The meta object literal for the '<em><b>Mina</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QIMPLIES__MINA = eINSTANCE.getQImplies_Mina();

		/**
		 * The meta object literal for the '<em><b>Maxa</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QIMPLIES__MAXA = eINSTANCE.getQImplies_Maxa();

		/**
		 * The meta object literal for the '<em><b>Var1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QIMPLIES__VAR1 = eINSTANCE.getQImplies_Var1();

		/**
		 * The meta object literal for the '<em><b>Minb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QIMPLIES__MINB = eINSTANCE.getQImplies_Minb();

		/**
		 * The meta object literal for the '<em><b>Maxb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QIMPLIES__MAXB = eINSTANCE.getQImplies_Maxb();

		/**
		 * The meta object literal for the '<em><b>Var2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QIMPLIES__VAR2 = eINSTANCE.getQImplies_Var2();

		/**
		 * The meta object literal for the '{@link hlvl.impl.VarListImpl <em>Var List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.VarListImpl
		 * @see hlvl.impl.HlvlPackageImpl#getVarList()
		 * @generated
		 */
		EClass VAR_LIST = eINSTANCE.getVarList();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_LIST__OPERATOR = eINSTANCE.getVarList_Operator();

		/**
		 * The meta object literal for the '<em><b>Var1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_LIST__VAR1 = eINSTANCE.getVarList_Var1();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_LIST__LIST = eINSTANCE.getVarList_List();

		/**
		 * The meta object literal for the '{@link hlvl.impl.HierarchyImpl <em>Hierarchy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.HierarchyImpl
		 * @see hlvl.impl.HlvlPackageImpl#getHierarchy()
		 * @generated
		 */
		EClass HIERARCHY = eINSTANCE.getHierarchy();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHY__PARENT = eINSTANCE.getHierarchy_Parent();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHY__CHILDREN = eINSTANCE.getHierarchy_Children();

		/**
		 * The meta object literal for the '{@link hlvl.impl.DecompositionImpl <em>Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.DecompositionImpl
		 * @see hlvl.impl.HlvlPackageImpl#getDecomposition()
		 * @generated
		 */
		EClass DECOMPOSITION = eINSTANCE.getDecomposition();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECOMPOSITION__CARDINALITY = eINSTANCE.getDecomposition_Cardinality();

		/**
		 * The meta object literal for the '{@link hlvl.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.GroupImpl
		 * @see hlvl.impl.HlvlPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__MIN = eINSTANCE.getGroup_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__MAX = eINSTANCE.getGroup_Max();

		/**
		 * The meta object literal for the '{@link hlvl.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.RangeImpl
		 * @see hlvl.impl.HlvlPackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__VALUE = eINSTANCE.getRange_Value();

		/**
		 * The meta object literal for the '{@link hlvl.impl.VisibilityImpl <em>Visibility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.VisibilityImpl
		 * @see hlvl.impl.HlvlPackageImpl#getVisibility()
		 * @generated
		 */
		EClass VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISIBILITY__CONDITION = eINSTANCE.getVisibility_Condition();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISIBILITY__CHILDREN = eINSTANCE.getVisibility_Children();

		/**
		 * The meta object literal for the '{@link hlvl.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.OrderImpl
		 * @see hlvl.impl.HlvlPackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__OPERATOR = eINSTANCE.getOrder_Operator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__LEFT = eINSTANCE.getOrder_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__RIGHT = eINSTANCE.getOrder_Right();

		/**
		 * The meta object literal for the '{@link hlvl.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.ExpressionImpl
		 * @see hlvl.impl.HlvlPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__EXP = eINSTANCE.getExpression_Exp();

		/**
		 * The meta object literal for the '{@link hlvl.impl.RelationalImpl <em>Relational</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.RelationalImpl
		 * @see hlvl.impl.HlvlPackageImpl#getRelational()
		 * @generated
		 */
		EClass RELATIONAL = eINSTANCE.getRelational();

		/**
		 * The meta object literal for the '{@link hlvl.impl.OperationsImpl <em>Operations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.OperationsImpl
		 * @see hlvl.impl.HlvlPackageImpl#getOperations()
		 * @generated
		 */
		EClass OPERATIONS = eINSTANCE.getOperations();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONS__OP = eINSTANCE.getOperations_Op();

		/**
		 * The meta object literal for the '{@link hlvl.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.OperationImpl
		 * @see hlvl.impl.HlvlPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link hlvl.impl.BoolValImpl <em>Bool Val</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.BoolValImpl
		 * @see hlvl.impl.HlvlPackageImpl#getBoolVal()
		 * @generated
		 */
		EClass BOOL_VAL = eINSTANCE.getBoolVal();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_VAL__VALUE = eINSTANCE.getBoolVal_Value();

		/**
		 * The meta object literal for the '{@link hlvl.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.NumberImpl
		 * @see hlvl.impl.HlvlPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER__VALUE = eINSTANCE.getNumber_Value();

		/**
		 * The meta object literal for the '{@link hlvl.impl.SymbolImpl <em>Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.SymbolImpl
		 * @see hlvl.impl.HlvlPackageImpl#getSymbol()
		 * @generated
		 */
		EClass SYMBOL = eINSTANCE.getSymbol();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL__VALUE = eINSTANCE.getSymbol_Value();

		/**
		 * The meta object literal for the '{@link hlvl.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.ValueImpl
		 * @see hlvl.impl.HlvlPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link hlvl.impl.ListOfValuesImpl <em>List Of Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.ListOfValuesImpl
		 * @see hlvl.impl.HlvlPackageImpl#getListOfValues()
		 * @generated
		 */
		EClass LIST_OF_VALUES = eINSTANCE.getListOfValues();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OF_VALUES__VALUES = eINSTANCE.getListOfValues_Values();

		/**
		 * The meta object literal for the '{@link hlvl.impl.ListOfIDsImpl <em>List Of IDs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.ListOfIDsImpl
		 * @see hlvl.impl.HlvlPackageImpl#getListOfIDs()
		 * @generated
		 */
		EClass LIST_OF_IDS = eINSTANCE.getListOfIDs();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OF_IDS__VALUES = eINSTANCE.getListOfIDs_Values();

		/**
		 * The meta object literal for the '{@link hlvl.impl.ListOfRelRefsImpl <em>List Of Rel Refs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.ListOfRelRefsImpl
		 * @see hlvl.impl.HlvlPackageImpl#getListOfRelRefs()
		 * @generated
		 */
		EClass LIST_OF_REL_REFS = eINSTANCE.getListOfRelRefs();

		/**
		 * The meta object literal for the '<em><b>Ids</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OF_REL_REFS__IDS = eINSTANCE.getListOfRelRefs_Ids();

		/**
		 * The meta object literal for the '{@link hlvl.impl.NamesImpl <em>Names</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.NamesImpl
		 * @see hlvl.impl.HlvlPackageImpl#getNames()
		 * @generated
		 */
		EClass NAMES = eINSTANCE.getNames();

		/**
		 * The meta object literal for the '<em><b>Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMES__IDS = eINSTANCE.getNames_Ids();

		/**
		 * The meta object literal for the '{@link hlvl.impl.ValuationImpl <em>Valuation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.ValuationImpl
		 * @see hlvl.impl.HlvlPackageImpl#getValuation()
		 * @generated
		 */
		EClass VALUATION = eINSTANCE.getValuation();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUATION__ELEMENT = eINSTANCE.getValuation_Element();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUATION__VALUE = eINSTANCE.getValuation_Value();

		/**
		 * The meta object literal for the '{@link hlvl.impl.ListOfValuationImpl <em>List Of Valuation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.ListOfValuationImpl
		 * @see hlvl.impl.HlvlPackageImpl#getListOfValuation()
		 * @generated
		 */
		EClass LIST_OF_VALUATION = eINSTANCE.getListOfValuation();

		/**
		 * The meta object literal for the '<em><b>Pairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OF_VALUATION__PAIRS = eINSTANCE.getListOfValuation_Pairs();

		/**
		 * The meta object literal for the '{@link hlvl.impl.ListOfListValuesImpl <em>List Of List Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.ListOfListValuesImpl
		 * @see hlvl.impl.HlvlPackageImpl#getListOfListValues()
		 * @generated
		 */
		EClass LIST_OF_LIST_VALUES = eINSTANCE.getListOfListValues();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OF_LIST_VALUES__LIST = eINSTANCE.getListOfListValues_List();

		/**
		 * The meta object literal for the '{@link hlvl.impl.IffImpl <em>Iff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.IffImpl
		 * @see hlvl.impl.HlvlPackageImpl#getIff()
		 * @generated
		 */
		EClass IFF = eINSTANCE.getIff();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFF__LEFT = eINSTANCE.getIff_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFF__RIGHT = eINSTANCE.getIff_Right();

		/**
		 * The meta object literal for the '{@link hlvl.impl.ImpliesImpl <em>Implies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.ImpliesImpl
		 * @see hlvl.impl.HlvlPackageImpl#getImplies()
		 * @generated
		 */
		EClass IMPLIES = eINSTANCE.getImplies();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLIES__LEFT = eINSTANCE.getImplies_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLIES__RIGHT = eINSTANCE.getImplies_Right();

		/**
		 * The meta object literal for the '{@link hlvl.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.OrImpl
		 * @see hlvl.impl.HlvlPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR__LEFT = eINSTANCE.getOr_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR__RIGHT = eINSTANCE.getOr_Right();

		/**
		 * The meta object literal for the '{@link hlvl.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.AndImpl
		 * @see hlvl.impl.HlvlPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND__LEFT = eINSTANCE.getAnd_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND__RIGHT = eINSTANCE.getAnd_Right();

		/**
		 * The meta object literal for the '{@link hlvl.impl.EqualityImpl <em>Equality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.EqualityImpl
		 * @see hlvl.impl.HlvlPackageImpl#getEquality()
		 * @generated
		 */
		EClass EQUALITY = eINSTANCE.getEquality();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUALITY__LEFT = eINSTANCE.getEquality_Left();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUALITY__OP = eINSTANCE.getEquality_Op();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUALITY__RIGHT = eINSTANCE.getEquality_Right();

		/**
		 * The meta object literal for the '{@link hlvl.impl.ComparisonImpl <em>Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.ComparisonImpl
		 * @see hlvl.impl.HlvlPackageImpl#getComparison()
		 * @generated
		 */
		EClass COMPARISON = eINSTANCE.getComparison();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON__LEFT = eINSTANCE.getComparison_Left();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON__OP = eINSTANCE.getComparison_Op();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON__RIGHT = eINSTANCE.getComparison_Right();

		/**
		 * The meta object literal for the '{@link hlvl.impl.PlusImpl <em>Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.PlusImpl
		 * @see hlvl.impl.HlvlPackageImpl#getPlus()
		 * @generated
		 */
		EClass PLUS = eINSTANCE.getPlus();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUS__LEFT = eINSTANCE.getPlus_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUS__RIGHT = eINSTANCE.getPlus_Right();

		/**
		 * The meta object literal for the '{@link hlvl.impl.MinusImpl <em>Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.MinusImpl
		 * @see hlvl.impl.HlvlPackageImpl#getMinus()
		 * @generated
		 */
		EClass MINUS = eINSTANCE.getMinus();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINUS__LEFT = eINSTANCE.getMinus_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINUS__RIGHT = eINSTANCE.getMinus_Right();

		/**
		 * The meta object literal for the '{@link hlvl.impl.MulOrDivImpl <em>Mul Or Div</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.MulOrDivImpl
		 * @see hlvl.impl.HlvlPackageImpl#getMulOrDiv()
		 * @generated
		 */
		EClass MUL_OR_DIV = eINSTANCE.getMulOrDiv();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUL_OR_DIV__LEFT = eINSTANCE.getMulOrDiv_Left();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUL_OR_DIV__OP = eINSTANCE.getMulOrDiv_Op();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUL_OR_DIV__RIGHT = eINSTANCE.getMulOrDiv_Right();

		/**
		 * The meta object literal for the '{@link hlvl.impl.NegationImpl <em>Negation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.NegationImpl
		 * @see hlvl.impl.HlvlPackageImpl#getNegation()
		 * @generated
		 */
		EClass NEGATION = eINSTANCE.getNegation();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATION__EXPRESSION = eINSTANCE.getNegation_Expression();

		/**
		 * The meta object literal for the '{@link hlvl.impl.UnaryImpl <em>Unary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.UnaryImpl
		 * @see hlvl.impl.HlvlPackageImpl#getUnary()
		 * @generated
		 */
		EClass UNARY = eINSTANCE.getUnary();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY__OP = eINSTANCE.getUnary_Op();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY__EXPRESSION = eINSTANCE.getUnary_Expression();

		/**
		 * The meta object literal for the '{@link hlvl.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.FunctionImpl
		 * @see hlvl.impl.HlvlPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__OP = eINSTANCE.getFunction_Op();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__LEFT = eINSTANCE.getFunction_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__RIGHT = eINSTANCE.getFunction_Right();

		/**
		 * The meta object literal for the '{@link hlvl.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.BoolConstantImpl
		 * @see hlvl.impl.HlvlPackageImpl#getBoolConstant()
		 * @generated
		 */
		EClass BOOL_CONSTANT = eINSTANCE.getBoolConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_CONSTANT__VALUE = eINSTANCE.getBoolConstant_Value();

		/**
		 * The meta object literal for the '{@link hlvl.impl.VariableRefImpl <em>Variable Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.VariableRefImpl
		 * @see hlvl.impl.HlvlPackageImpl#getVariableRef()
		 * @generated
		 */
		EClass VARIABLE_REF = eINSTANCE.getVariableRef();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_REF__VARIABLE = eINSTANCE.getVariableRef_Variable();

		/**
		 * The meta object literal for the '{@link hlvl.impl.AttributeRefImpl <em>Attribute Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.AttributeRefImpl
		 * @see hlvl.impl.HlvlPackageImpl#getAttributeRef()
		 * @generated
		 */
		EClass ATTRIBUTE_REF = eINSTANCE.getAttributeRef();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_REF__ATTRIBUTE = eINSTANCE.getAttributeRef_Attribute();

		/**
		 * The meta object literal for the '{@link hlvl.impl.StringConstantImpl <em>String Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.StringConstantImpl
		 * @see hlvl.impl.HlvlPackageImpl#getStringConstant()
		 * @generated
		 */
		EClass STRING_CONSTANT = eINSTANCE.getStringConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CONSTANT__VALUE = eINSTANCE.getStringConstant_Value();

		/**
		 * The meta object literal for the '{@link hlvl.impl.IntConstantImpl <em>Int Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.IntConstantImpl
		 * @see hlvl.impl.HlvlPackageImpl#getIntConstant()
		 * @generated
		 */
		EClass INT_CONSTANT = eINSTANCE.getIntConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_CONSTANT__VALUE = eINSTANCE.getIntConstant_Value();

		/**
		 * The meta object literal for the '{@link hlvl.impl.SingleInstructionImpl <em>Single Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.SingleInstructionImpl
		 * @see hlvl.impl.HlvlPackageImpl#getSingleInstruction()
		 * @generated
		 */
		EClass SINGLE_INSTRUCTION = eINSTANCE.getSingleInstruction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_INSTRUCTION__NAME = eINSTANCE.getSingleInstruction_Name();

		/**
		 * The meta object literal for the '{@link hlvl.impl.ValidConfImpl <em>Valid Conf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hlvl.impl.ValidConfImpl
		 * @see hlvl.impl.HlvlPackageImpl#getValidConf()
		 * @generated
		 */
		EClass VALID_CONF = eINSTANCE.getValidConf();

		/**
		 * The meta object literal for the '<em><b>Valuations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALID_CONF__VALUATIONS = eINSTANCE.getValidConf_Valuations();

	}

} //HlvlPackage
