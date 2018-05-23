/**
 * generated by Xtext 2.12.0
 */
package org.xtext.cPHLCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.cPHLCL.Interval#getStart <em>Start</em>}</li>
 *   <li>{@link org.xtext.cPHLCL.Interval#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see org.xtext.cPHLCL.CPHLCLPackage#getInterval()
 * @model
 * @generated
 */
public interface Interval extends DomainDeclaration
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
   * @see #setStart(org.xtext.cPHLCL.Number)
   * @see org.xtext.cPHLCL.CPHLCLPackage#getInterval_Start()
   * @model containment="true"
   * @generated
   */
  org.xtext.cPHLCL.Number getStart();

  /**
   * Sets the value of the '{@link org.xtext.cPHLCL.Interval#getStart <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' containment reference.
   * @see #getStart()
   * @generated
   */
  void setStart(org.xtext.cPHLCL.Number value);

  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(org.xtext.cPHLCL.Number)
   * @see org.xtext.cPHLCL.CPHLCLPackage#getInterval_End()
   * @model containment="true"
   * @generated
   */
  org.xtext.cPHLCL.Number getEnd();

  /**
   * Sets the value of the '{@link org.xtext.cPHLCL.Interval#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(org.xtext.cPHLCL.Number value);

} // Interval
