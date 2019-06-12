/**
 */
package hlvl.impl;

import hlvl.HlvlPackage;
import hlvl.ListOfRelRefs;
import hlvl.RelDeclaration;

import hlvl.proxy.ListOfRelRefsProxy;
import hlvl.proxy.RelDeclarationAdapter;

import java.util.Collection;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import webmapi.service.configuration.Wrapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Rel Refs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hlvl.impl.ListOfRelRefsImpl#getIds <em>Ids</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlRootElement(name = "listofrelrefs")
@XmlSeeAlso({ ListOfRelRefsProxy.class, Wrapper.class, RelDeclarationImpl.class })
public class ListOfRelRefsImpl extends EObjectImpl implements ListOfRelRefs {
	/**
	 * The cached value of the '{@link #getIds() <em>Ids</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIds()
	 * @generated
	 * @ordered
	 */
	protected EList<RelDeclaration> ids;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfRelRefsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlvlPackage.Literals.LIST_OF_REL_REFS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElementWrapper(name = "ids")
	@XmlAnyElement(lax = true)
	@XmlJavaTypeAdapter(value = RelDeclarationAdapter.class)
	public EList<RelDeclaration> getIds() {
		if (ids == null) {
			ids = new EObjectResolvingEList<RelDeclaration>(RelDeclaration.class, this,
					HlvlPackage.LIST_OF_REL_REFS__IDS);
		}
		return ids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HlvlPackage.LIST_OF_REL_REFS__IDS:
			return getIds();
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
		case HlvlPackage.LIST_OF_REL_REFS__IDS:
			getIds().clear();
			getIds().addAll((Collection<? extends RelDeclaration>) newValue);
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
		case HlvlPackage.LIST_OF_REL_REFS__IDS:
			getIds().clear();
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
		case HlvlPackage.LIST_OF_REL_REFS__IDS:
			return ids != null && !ids.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfRelRefsImpl