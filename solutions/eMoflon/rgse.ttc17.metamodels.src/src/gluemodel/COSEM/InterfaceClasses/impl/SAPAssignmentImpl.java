/**
 */
package gluemodel.COSEM.InterfaceClasses.impl;

import gluemodel.COSEM.InterfaceClasses.InterfaceClassesPackage;
import gluemodel.COSEM.InterfaceClasses.SAPAssignment;

import gluemodel.COSEM.LogicalDeviceName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SAP Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.InterfaceClasses.impl.SAPAssignmentImpl#getLdnname <em>Ldnname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SAPAssignmentImpl extends BaseImpl implements SAPAssignment {
	/**
	 * The cached value of the '{@link #getLdnname() <em>Ldnname</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLdnname()
	 * @generated
	 * @ordered
	 */
	protected LogicalDeviceName ldnname;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SAPAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterfaceClassesPackage.Literals.SAP_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalDeviceName getLdnname() {
		if (ldnname != null && ldnname.eIsProxy()) {
			InternalEObject oldLdnname = (InternalEObject)ldnname;
			ldnname = (LogicalDeviceName)eResolveProxy(oldLdnname);
			if (ldnname != oldLdnname) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InterfaceClassesPackage.SAP_ASSIGNMENT__LDNNAME, oldLdnname, ldnname));
			}
		}
		return ldnname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalDeviceName basicGetLdnname() {
		return ldnname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLdnname(LogicalDeviceName newLdnname) {
		LogicalDeviceName oldLdnname = ldnname;
		ldnname = newLdnname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfaceClassesPackage.SAP_ASSIGNMENT__LDNNAME, oldLdnname, ldnname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InterfaceClassesPackage.SAP_ASSIGNMENT__LDNNAME:
				if (resolve) return getLdnname();
				return basicGetLdnname();
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
			case InterfaceClassesPackage.SAP_ASSIGNMENT__LDNNAME:
				setLdnname((LogicalDeviceName)newValue);
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
			case InterfaceClassesPackage.SAP_ASSIGNMENT__LDNNAME:
				setLdnname((LogicalDeviceName)null);
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
			case InterfaceClassesPackage.SAP_ASSIGNMENT__LDNNAME:
				return ldnname != null;
		}
		return super.eIsSet(featureID);
	}

} //SAPAssignmentImpl
