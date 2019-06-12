/**
 */
package hlvl.impl;

import hlvl.ElmDeclaration;
import hlvl.HlvlPackage;
import hlvl.Model;
import hlvl.Operations;
import hlvl.RelDeclaration;

import hlvl.proxy.ElmDeclarationAdapter;
import hlvl.proxy.ModelProxy;
import hlvl.proxy.OperationsAdapter;
import hlvl.proxy.RelDeclarationAdapter;

import java.util.Collection;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import webmapi.service.configuration.Wrapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hlvl.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link hlvl.impl.ModelImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link hlvl.impl.ModelImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link hlvl.impl.ModelImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlRootElement(name = "model")
@XmlSeeAlso({ ModelProxy.class, Wrapper.class, ElmDeclarationImpl.class, RelDeclarationImpl.class,
		OperationsImpl.class })
public class ModelImpl extends EObjectImpl implements Model {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ElmDeclaration> elements;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<RelDeclaration> relations;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected Operations operations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlvlPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElementWrapper(name = "elements")
	@XmlAnyElement(lax = true)
	@XmlJavaTypeAdapter(value = ElmDeclarationAdapter.class)
	public EList<ElmDeclaration> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<ElmDeclaration>(ElmDeclaration.class, this,
					HlvlPackage.MODEL__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElementWrapper(name = "relations")
	@XmlAnyElement(lax = true)
	@XmlJavaTypeAdapter(value = RelDeclarationAdapter.class)
	public EList<RelDeclaration> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<RelDeclaration>(RelDeclaration.class, this,
					HlvlPackage.MODEL__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlAnyElement(lax = true)
	@XmlJavaTypeAdapter(value = OperationsAdapter.class)
	public Operations getOperations() {
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperations(Operations newOperations, NotificationChain msgs) {
		Operations oldOperations = operations;
		operations = newOperations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HlvlPackage.MODEL__OPERATIONS, oldOperations, newOperations);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperations(Operations newOperations) {
		if (newOperations != operations) {
			NotificationChain msgs = null;
			if (operations != null)
				msgs = ((InternalEObject) operations).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - HlvlPackage.MODEL__OPERATIONS, null, msgs);
			if (newOperations != null)
				msgs = ((InternalEObject) newOperations).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - HlvlPackage.MODEL__OPERATIONS, null, msgs);
			msgs = basicSetOperations(newOperations, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.MODEL__OPERATIONS, newOperations,
					newOperations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HlvlPackage.MODEL__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
		case HlvlPackage.MODEL__RELATIONS:
			return ((InternalEList<?>) getRelations()).basicRemove(otherEnd, msgs);
		case HlvlPackage.MODEL__OPERATIONS:
			return basicSetOperations(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HlvlPackage.MODEL__NAME:
			return getName();
		case HlvlPackage.MODEL__ELEMENTS:
			return getElements();
		case HlvlPackage.MODEL__RELATIONS:
			return getRelations();
		case HlvlPackage.MODEL__OPERATIONS:
			return getOperations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HlvlPackage.MODEL__NAME:
			setName((String) newValue);
			return;
		case HlvlPackage.MODEL__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends ElmDeclaration>) newValue);
			return;
		case HlvlPackage.MODEL__RELATIONS:
			getRelations().clear();
			getRelations().addAll((Collection<? extends RelDeclaration>) newValue);
			return;
		case HlvlPackage.MODEL__OPERATIONS:
			setOperations((Operations) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case HlvlPackage.MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case HlvlPackage.MODEL__ELEMENTS:
			getElements().clear();
			return;
		case HlvlPackage.MODEL__RELATIONS:
			getRelations().clear();
			return;
		case HlvlPackage.MODEL__OPERATIONS:
			setOperations((Operations) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case HlvlPackage.MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case HlvlPackage.MODEL__ELEMENTS:
			return elements != null && !elements.isEmpty();
		case HlvlPackage.MODEL__RELATIONS:
			return relations != null && !relations.isEmpty();
		case HlvlPackage.MODEL__OPERATIONS:
			return operations != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ModelImpl