/**
 */
package hlvl.impl;

import hlvl.Declaration;
import hlvl.HlvlPackage;

import hlvl.proxy.DeclarationProxy;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import webmapi.service.configuration.Wrapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
@XmlRootElement(name = "declaration")
@XmlSeeAlso({ DeclarationProxy.class, Wrapper.class, ConstantDeclImpl.class, VariableDeclImpl.class })
public class DeclarationImpl extends EObjectImpl implements Declaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlvlPackage.Literals.DECLARATION;
	}

} //DeclarationImpl