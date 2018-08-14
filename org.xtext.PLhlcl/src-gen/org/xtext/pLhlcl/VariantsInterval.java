/**
 * generated by Xtext 2.12.0
 */
package org.xtext.pLhlcl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variants Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.pLhlcl.VariantsInterval#getStart <em>Start</em>}</li>
 *   <li>{@link org.xtext.pLhlcl.VariantsInterval#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see org.xtext.pLhlcl.PLhlclPackage#getVariantsInterval()
 * @model
 * @generated
 */
public interface VariantsInterval extends VariantDeclaration
{
  /**
   * Returns the value of the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' containment reference.
   * @see #setStart(org.xtext.pLhlcl.Number)
   * @see org.xtext.pLhlcl.PLhlclPackage#getVariantsInterval_Start()
   * @model containment="true"
   * @generated
   */
  org.xtext.pLhlcl.Number getStart();

  /**
   * Sets the value of the '{@link org.xtext.pLhlcl.VariantsInterval#getStart <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' containment reference.
   * @see #getStart()
   * @generated
   */
  void setStart(org.xtext.pLhlcl.Number value);

  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(org.xtext.pLhlcl.Number)
   * @see org.xtext.pLhlcl.PLhlclPackage#getVariantsInterval_End()
   * @model containment="true"
   * @generated
   */
  org.xtext.pLhlcl.Number getEnd();

  /**
   * Sets the value of the '{@link org.xtext.pLhlcl.VariantsInterval#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(org.xtext.pLhlcl.Number value);

} // VariantsInterval