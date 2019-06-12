/**
 */
package hlvl.impl;

import hlvl.HlvlPackage;
import hlvl.Value;

import hlvl.proxy.ValueProxy;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import webmapi.service.configuration.Wrapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
@XmlRootElement(name = "value")
@XmlSeeAlso({ ValueProxy.class, Wrapper.class, BoolValImpl.class, NumberImpl.class, SymbolImpl.class })
public class ValueImpl extends EObjectImpl implements Value {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlvlPackage.Literals.VALUE;
	}

} //ValueImpl