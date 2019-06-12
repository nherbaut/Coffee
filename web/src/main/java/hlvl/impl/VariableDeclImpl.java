/**
 */
package hlvl.impl;

import hlvl.HlvlPackage;
import hlvl.OptionsDeclaration;
import hlvl.VariableDecl;

import hlvl.proxy.OptionsDeclarationAdapter;
import hlvl.proxy.VariableDeclProxy;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import webmapi.service.configuration.Wrapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hlvl.impl.VariableDeclImpl#getVariants <em>Variants</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlRootElement(name = "variabledecl")
@XmlSeeAlso({ VariableDeclProxy.class, Wrapper.class, OptionsDeclarationImpl.class })
public class VariableDeclImpl extends DeclarationImpl implements VariableDecl {
	/**
	 * The cached value of the '{@link #getVariants() <em>Variants</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariants()
	 * @generated
	 * @ordered
	 */
	protected OptionsDeclaration variants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlvlPackage.Literals.VARIABLE_DECL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlAnyElement(lax = true)
	@XmlJavaTypeAdapter(value = OptionsDeclarationAdapter.class)
	public OptionsDeclaration getVariants() {
		return variants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariants(OptionsDeclaration newVariants, NotificationChain msgs) {
		OptionsDeclaration oldVariants = variants;
		variants = newVariants;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HlvlPackage.VARIABLE_DECL__VARIANTS, oldVariants, newVariants);
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
	public void setVariants(OptionsDeclaration newVariants) {
		if (newVariants != variants) {
			NotificationChain msgs = null;
			if (variants != null)
				msgs = ((InternalEObject) variants).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - HlvlPackage.VARIABLE_DECL__VARIANTS, null, msgs);
			if (newVariants != null)
				msgs = ((InternalEObject) newVariants).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - HlvlPackage.VARIABLE_DECL__VARIANTS, null, msgs);
			msgs = basicSetVariants(newVariants, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.VARIABLE_DECL__VARIANTS, newVariants,
					newVariants));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HlvlPackage.VARIABLE_DECL__VARIANTS:
			return basicSetVariants(null, msgs);
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
		case HlvlPackage.VARIABLE_DECL__VARIANTS:
			return getVariants();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HlvlPackage.VARIABLE_DECL__VARIANTS:
			setVariants((OptionsDeclaration) newValue);
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
		case HlvlPackage.VARIABLE_DECL__VARIANTS:
			setVariants((OptionsDeclaration) null);
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
		case HlvlPackage.VARIABLE_DECL__VARIANTS:
			return variants != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableDeclImpl