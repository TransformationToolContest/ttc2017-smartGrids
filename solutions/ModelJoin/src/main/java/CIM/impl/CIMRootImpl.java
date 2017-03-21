/**
 */
package CIM.impl;

import CIM.CIMPackage;
import CIM.CIMRoot;
import CIM.Element;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.impl.CIMRootImpl#getIDobject <em>IDobject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIMRootImpl extends MinimalEObjectImpl.Container implements CIMRoot {
	/**
	 * The cached value of the '{@link #getIDobject() <em>IDobject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDobject()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> iDobject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIMRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CIMPackage.Literals.CIM_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getIDobject() {
		if (iDobject == null) {
			iDobject = new EObjectContainmentEList<Element>(Element.class, this, CIMPackage.CIM_ROOT__IDOBJECT);
		}
		return iDobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CIMPackage.CIM_ROOT__IDOBJECT:
				return ((InternalEList<?>)getIDobject()).basicRemove(otherEnd, msgs);
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
			case CIMPackage.CIM_ROOT__IDOBJECT:
				return getIDobject();
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
			case CIMPackage.CIM_ROOT__IDOBJECT:
				getIDobject().clear();
				getIDobject().addAll((Collection<? extends Element>)newValue);
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
			case CIMPackage.CIM_ROOT__IDOBJECT:
				getIDobject().clear();
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
			case CIMPackage.CIM_ROOT__IDOBJECT:
				return iDobject != null && !iDobject.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CIMRootImpl
