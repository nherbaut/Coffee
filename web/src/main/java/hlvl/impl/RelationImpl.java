/**
 */
package hlvl.impl;

import hlvl.HlvlPackage;
import hlvl.Relation;

import hlvl.proxy.RelationProxy;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import webmapi.service.configuration.Wrapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
@XmlRootElement(name = "relation")
@XmlSeeAlso({ RelationProxy.class, Wrapper.class, CoreImpl.class, MultInstantiationImpl.class, PairImpl.class,
		ComplexImpliesImpl.class, QImpliesImpl.class, VarListImpl.class, HierarchyImpl.class, DecompositionImpl.class,
		GroupImpl.class, VisibilityImpl.class, OrderImpl.class, ExpressionImpl.class })
public class RelationImpl extends EObjectImpl implements Relation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlvlPackage.Literals.RELATION;
	}

} //RelationImpl