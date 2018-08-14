/**
 * generated by Xtext 2.12.0
 */
package org.xtext.hLCLSpecificationLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.hLCLSpecificationLanguage.Model#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hLCLSpecificationLanguage.Model#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.hLCLSpecificationLanguage.Model#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see org.xtext.hLCLSpecificationLanguage.HLCLSpecificationLanguagePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.hLCLSpecificationLanguage.HLCLSpecificationLanguagePackage#getModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hLCLSpecificationLanguage.Model#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hLCLSpecificationLanguage.VarDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference list.
   * @see org.xtext.hLCLSpecificationLanguage.HLCLSpecificationLanguagePackage#getModel_Vars()
   * @model containment="true"
   * @generated
   */
  EList<VarDeclaration> getVars();

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.hLCLSpecificationLanguage.Constraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see org.xtext.hLCLSpecificationLanguage.HLCLSpecificationLanguagePackage#getModel_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getConstraints();

} // Model