/**
 * generated by Xtext 2.12.0
 */
package com.coffee.pLEC;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.pLEC.Structural#getParent <em>Parent</em>}</li>
 *   <li>{@link com.coffee.pLEC.Structural#getGroup <em>Group</em>}</li>
 *   <li>{@link com.coffee.pLEC.Structural#getMin <em>Min</em>}</li>
 *   <li>{@link com.coffee.pLEC.Structural#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see com.coffee.pLEC.PLECPackage#getStructural()
 * @model
 * @generated
 */
public interface Structural extends ConsExpression
{
  /**
   * Returns the value of the '<em><b>Parent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' attribute.
   * @see #setParent(String)
   * @see com.coffee.pLEC.PLECPackage#getStructural_Parent()
   * @model
   * @generated
   */
  String getParent();

  /**
   * Sets the value of the '{@link com.coffee.pLEC.Structural#getParent <em>Parent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' attribute.
   * @see #getParent()
   * @generated
   */
  void setParent(String value);

  /**
   * Returns the value of the '<em><b>Group</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' containment reference.
   * @see #setGroup(ListOfIDs)
   * @see com.coffee.pLEC.PLECPackage#getStructural_Group()
   * @model containment="true"
   * @generated
   */
  ListOfIDs getGroup();

  /**
   * Sets the value of the '{@link com.coffee.pLEC.Structural#getGroup <em>Group</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group</em>' containment reference.
   * @see #getGroup()
   * @generated
   */
  void setGroup(ListOfIDs value);

  /**
   * Returns the value of the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' containment reference.
   * @see #setMin(com.coffee.pLEC.Number)
   * @see com.coffee.pLEC.PLECPackage#getStructural_Min()
   * @model containment="true"
   * @generated
   */
  com.coffee.pLEC.Number getMin();

  /**
   * Sets the value of the '{@link com.coffee.pLEC.Structural#getMin <em>Min</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' containment reference.
   * @see #getMin()
   * @generated
   */
  void setMin(com.coffee.pLEC.Number value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' containment reference.
   * @see #setMax(com.coffee.pLEC.Number)
   * @see com.coffee.pLEC.PLECPackage#getStructural_Max()
   * @model containment="true"
   * @generated
   */
  com.coffee.pLEC.Number getMax();

  /**
   * Sets the value of the '{@link com.coffee.pLEC.Structural#getMax <em>Max</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' containment reference.
   * @see #getMax()
   * @generated
   */
  void setMax(com.coffee.pLEC.Number value);

} // Structural