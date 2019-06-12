/**
 */
package hlvl.impl;

import hlvl.HlvlPackage;
import hlvl.Relational;

import hlvl.proxy.RelationalProxy;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import webmapi.service.configuration.Wrapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relational</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
@XmlRootElement(name = "relational")
@XmlSeeAlso({ RelationalProxy.class, Wrapper.class, IffImpl.class, ImpliesImpl.class, OrImpl.class, AndImpl.class,
		EqualityImpl.class, ComparisonImpl.class, PlusImpl.class, MinusImpl.class, MulOrDivImpl.class,
		NegationImpl.class, UnaryImpl.class, FunctionImpl.class, BoolConstantImpl.class, VariableRefImpl.class,
		AttributeRefImpl.class, StringConstantImpl.class, IntConstantImpl.class })
public class RelationalImpl extends EObjectImpl implements Relational {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlvlPackage.Literals.RELATIONAL;
	}

} //RelationalImpl