/**
 * generated by Xtext 2.12.0
 */
package org.xtext.hLCLSpecificationLanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.hLCLSpecificationLanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HLCLSpecificationLanguageFactoryImpl extends EFactoryImpl implements HLCLSpecificationLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HLCLSpecificationLanguageFactory init()
  {
    try
    {
      HLCLSpecificationLanguageFactory theHLCLSpecificationLanguageFactory = (HLCLSpecificationLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(HLCLSpecificationLanguagePackage.eNS_URI);
      if (theHLCLSpecificationLanguageFactory != null)
      {
        return theHLCLSpecificationLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new HLCLSpecificationLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HLCLSpecificationLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case HLCLSpecificationLanguagePackage.MODEL: return createModel();
      case HLCLSpecificationLanguagePackage.VAR_DECLARATION: return createVarDeclaration();
      case HLCLSpecificationLanguagePackage.VARIANT_DECLARATION: return createVariantDeclaration();
      case HLCLSpecificationLanguagePackage.VARIANTS_INTERVAL: return createvariantsInterval();
      case HLCLSpecificationLanguagePackage.VARIANTS_ENUMERATION: return createvariantsEnumeration();
      case HLCLSpecificationLanguagePackage.ENUMERATION: return createEnumeration();
      case HLCLSpecificationLanguagePackage.CONSTRAINT: return createConstraint();
      case HLCLSpecificationLanguagePackage.CONS_EXPRESSION: return createConsExpression();
      case HLCLSpecificationLanguagePackage.EXPRESSION: return createExpression();
      case HLCLSpecificationLanguagePackage.ID_CONS: return createIDCons();
      case HLCLSpecificationLanguagePackage.REFINEMENT: return createRefinement();
      case HLCLSpecificationLanguagePackage.ASSIGNMENT: return createAssignment();
      case HLCLSpecificationLanguagePackage.VAR_REFINEMENT: return createVarRefinement();
      case HLCLSpecificationLanguagePackage.SET_REFINEMENT: return createSetRefinement();
      case HLCLSpecificationLanguagePackage.RULE: return createRule();
      case HLCLSpecificationLanguagePackage.FODA_UN: return createFodaUN();
      case HLCLSpecificationLanguagePackage.FODA_BIN: return createFodaBin();
      case HLCLSpecificationLanguagePackage.FODA_NARY: return createFodaNary();
      case HLCLSpecificationLanguagePackage.LIST_OF_VALUES: return createListOfValues();
      case HLCLSpecificationLanguagePackage.LIST_OF_IDS: return createListOfIDs();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDeclaration createVarDeclaration()
  {
    VarDeclarationImpl varDeclaration = new VarDeclarationImpl();
    return varDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariantDeclaration createVariantDeclaration()
  {
    VariantDeclarationImpl variantDeclaration = new VariantDeclarationImpl();
    return variantDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variantsInterval createvariantsInterval()
  {
    variantsIntervalImpl variantsInterval = new variantsIntervalImpl();
    return variantsInterval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variantsEnumeration createvariantsEnumeration()
  {
    variantsEnumerationImpl variantsEnumeration = new variantsEnumerationImpl();
    return variantsEnumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enumeration createEnumeration()
  {
    EnumerationImpl enumeration = new EnumerationImpl();
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConsExpression createConsExpression()
  {
    ConsExpressionImpl consExpression = new ConsExpressionImpl();
    return consExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IDCons createIDCons()
  {
    IDConsImpl idCons = new IDConsImpl();
    return idCons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Refinement createRefinement()
  {
    RefinementImpl refinement = new RefinementImpl();
    return refinement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarRefinement createVarRefinement()
  {
    VarRefinementImpl varRefinement = new VarRefinementImpl();
    return varRefinement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetRefinement createSetRefinement()
  {
    SetRefinementImpl setRefinement = new SetRefinementImpl();
    return setRefinement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FodaUN createFodaUN()
  {
    FodaUNImpl fodaUN = new FodaUNImpl();
    return fodaUN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FodaBin createFodaBin()
  {
    FodaBinImpl fodaBin = new FodaBinImpl();
    return fodaBin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FodaNary createFodaNary()
  {
    FodaNaryImpl fodaNary = new FodaNaryImpl();
    return fodaNary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListOfValues createListOfValues()
  {
    ListOfValuesImpl listOfValues = new ListOfValuesImpl();
    return listOfValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListOfIDs createListOfIDs()
  {
    ListOfIDsImpl listOfIDs = new ListOfIDsImpl();
    return listOfIDs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HLCLSpecificationLanguagePackage getHLCLSpecificationLanguagePackage()
  {
    return (HLCLSpecificationLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static HLCLSpecificationLanguagePackage getPackage()
  {
    return HLCLSpecificationLanguagePackage.eINSTANCE;
  }

} //HLCLSpecificationLanguageFactoryImpl