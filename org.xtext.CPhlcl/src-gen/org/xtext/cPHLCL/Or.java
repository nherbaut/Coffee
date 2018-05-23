/**
 * generated by Xtext 2.12.0
 */
package org.xtext.cPHLCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.cPHLCL.Or#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.cPHLCL.Or#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.xtext.cPHLCL.CPHLCLPackage#getOr()
 * @model
 * @generated
 */
public interface Or extends Relational
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Relational)
   * @see org.xtext.cPHLCL.CPHLCLPackage#getOr_Left()
   * @model containment="true"
   * @generated
   */
  Relational getLeft();

  /**
   * Sets the value of the '{@link org.xtext.cPHLCL.Or#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Relational value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Relational)
   * @see org.xtext.cPHLCL.CPHLCLPackage#getOr_Right()
   * @model containment="true"
   * @generated
   */
  Relational getRight();

  /**
   * Sets the value of the '{@link org.xtext.cPHLCL.Or#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Relational value);

} // Or
