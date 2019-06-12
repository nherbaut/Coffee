/**
 */
package hlvl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hlvl.Hierarchy#getParent <em>Parent</em>}</li>
 *   <li>{@link hlvl.Hierarchy#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see hlvl.HlvlPackage#getHierarchy()
 * @model
 * @generated
 */
public interface Hierarchy extends Relation {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(ElmDeclaration)
	 * @see hlvl.HlvlPackage#getHierarchy_Parent()
	 * @model
	 * @generated
	 */
	ElmDeclaration getParent();

	/**
	 * Sets the value of the '{@link hlvl.Hierarchy#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ElmDeclaration value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference.
	 * @see #setChildren(ListOfIDs)
	 * @see hlvl.HlvlPackage#getHierarchy_Children()
	 * @model containment="true"
	 * @generated
	 */
	ListOfIDs getChildren();

	/**
	 * Sets the value of the '{@link hlvl.Hierarchy#getChildren <em>Children</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Children</em>' containment reference.
	 * @see #getChildren()
	 * @generated
	 */
	void setChildren(ListOfIDs value);

} // Hierarchy