/**
 */
package hlvl.impl;

import hlvl.HlvlPackage;
import hlvl.OptionsDeclaration;

import hlvl.proxy.OptionsDeclarationProxy;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import webmapi.service.configuration.Wrapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Options Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
@XmlRootElement(name = "optionsdeclaration")
@XmlSeeAlso({ OptionsDeclarationProxy.class, Wrapper.class, IntervalImpl.class, EnumerationImpl.class })
public class OptionsDeclarationImpl extends EObjectImpl implements OptionsDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionsDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlvlPackage.Literals.OPTIONS_DECLARATION;
	}

} //OptionsDeclarationImpl