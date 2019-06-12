/**
 */
package hlvl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mult Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hlvl.MultInstantiation#getName <em>Name</em>}</li>
 *   <li>{@link hlvl.MultInstantiation#getMin <em>Min</em>}</li>
 *   <li>{@link hlvl.MultInstantiation#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see hlvl.HlvlPackage#getMultInstantiation()
 * @model
 * @generated
 */
public interface MultInstantiation extends Relation {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(ElmDeclaration)
	 * @see hlvl.HlvlPackage#getMultInstantiation_Name()
	 * @model
	 * @generated
	 */
	ElmDeclaration getName();

	/**
	 * Sets the value of the '{@link hlvl.MultInstantiation#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(ElmDeclaration value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' containment reference.
	 * @see #setMin(hlvl.Number)
	 * @see hlvl.HlvlPackage#getMultInstantiation_Min()
	 * @model containment="true"
	 * @generated
	 */
	hlvl.Number getMin();

	/**
	 * Sets the value of the '{@link hlvl.MultInstantiation#getMin <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' containment reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(hlvl.Number value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' containment reference.
	 * @see #setMax(hlvl.Number)
	 * @see hlvl.HlvlPackage#getMultInstantiation_Max()
	 * @model containment="true"
	 * @generated
	 */
	hlvl.Number getMax();

	/**
	 * Sets the value of the '{@link hlvl.MultInstantiation#getMax <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' containment reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(hlvl.Number value);

} // MultInstantiation