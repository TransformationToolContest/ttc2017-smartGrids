/**
 */
package gluemodel.COSEM.InterfaceClasses.impl;

import gluemodel.COSEM.InterfaceClasses.ApplicationAssociation;
import gluemodel.COSEM.InterfaceClasses.AssociationLN;
import gluemodel.COSEM.InterfaceClasses.InterfaceClassesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association LN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.InterfaceClasses.impl.AssociationLNImpl#getAA <em>AA</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationLNImpl extends BaseImpl implements AssociationLN {
	/**
	 * The cached value of the '{@link #getAA() <em>AA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAA()
	 * @generated
	 * @ordered
	 */
	protected ApplicationAssociation aa;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationLNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterfaceClassesPackage.Literals.ASSOCIATION_LN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationAssociation getAA() {
		if (aa != null && aa.eIsProxy()) {
			InternalEObject oldAA = (InternalEObject)aa;
			aa = (ApplicationAssociation)eResolveProxy(oldAA);
			if (aa != oldAA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InterfaceClassesPackage.ASSOCIATION_LN__AA, oldAA, aa));
			}
		}
		return aa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationAssociation basicGetAA() {
		return aa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAA(ApplicationAssociation newAA) {
		ApplicationAssociation oldAA = aa;
		aa = newAA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfaceClassesPackage.ASSOCIATION_LN__AA, oldAA, aa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InterfaceClassesPackage.ASSOCIATION_LN__AA:
				if (resolve) return getAA();
				return basicGetAA();
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
			case InterfaceClassesPackage.ASSOCIATION_LN__AA:
				setAA((ApplicationAssociation)newValue);
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
			case InterfaceClassesPackage.ASSOCIATION_LN__AA:
				setAA((ApplicationAssociation)null);
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
			case InterfaceClassesPackage.ASSOCIATION_LN__AA:
				return aa != null;
		}
		return super.eIsSet(featureID);
	}

} //AssociationLNImpl
