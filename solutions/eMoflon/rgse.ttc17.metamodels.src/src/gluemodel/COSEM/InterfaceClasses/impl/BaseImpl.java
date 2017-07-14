/**
 */
package gluemodel.COSEM.InterfaceClasses.impl;

import gluemodel.COSEM.InterfaceClasses.Base;
import gluemodel.COSEM.InterfaceClasses.InterfaceClassesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.InterfaceClasses.impl.BaseImpl#getLogical_name <em>Logical name</em>}</li>
 *   <li>{@link gluemodel.COSEM.InterfaceClasses.impl.BaseImpl#getOBIScode <em>OBI Scode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaseImpl extends MinimalEObjectImpl.Container implements Base {
	/**
	 * The default value of the '{@link #getLogical_name() <em>Logical name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogical_name()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGICAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogical_name() <em>Logical name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogical_name()
	 * @generated
	 * @ordered
	 */
	protected String logical_name = LOGICAL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOBIScode() <em>OBI Scode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBIScode()
	 * @generated
	 * @ordered
	 */
	protected static final String OBI_SCODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOBIScode() <em>OBI Scode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBIScode()
	 * @generated
	 * @ordered
	 */
	protected String obiScode = OBI_SCODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterfaceClassesPackage.Literals.BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogical_name() {
		return logical_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogical_name(String newLogical_name) {
		String oldLogical_name = logical_name;
		logical_name = newLogical_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfaceClassesPackage.BASE__LOGICAL_NAME, oldLogical_name, logical_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOBIScode() {
		return obiScode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBIScode(String newOBIScode) {
		String oldOBIScode = obiScode;
		obiScode = newOBIScode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfaceClassesPackage.BASE__OBI_SCODE, oldOBIScode, obiScode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InterfaceClassesPackage.BASE__LOGICAL_NAME:
				return getLogical_name();
			case InterfaceClassesPackage.BASE__OBI_SCODE:
				return getOBIScode();
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
			case InterfaceClassesPackage.BASE__LOGICAL_NAME:
				setLogical_name((String)newValue);
				return;
			case InterfaceClassesPackage.BASE__OBI_SCODE:
				setOBIScode((String)newValue);
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
			case InterfaceClassesPackage.BASE__LOGICAL_NAME:
				setLogical_name(LOGICAL_NAME_EDEFAULT);
				return;
			case InterfaceClassesPackage.BASE__OBI_SCODE:
				setOBIScode(OBI_SCODE_EDEFAULT);
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
			case InterfaceClassesPackage.BASE__LOGICAL_NAME:
				return LOGICAL_NAME_EDEFAULT == null ? logical_name != null : !LOGICAL_NAME_EDEFAULT.equals(logical_name);
			case InterfaceClassesPackage.BASE__OBI_SCODE:
				return OBI_SCODE_EDEFAULT == null ? obiScode != null : !OBI_SCODE_EDEFAULT.equals(obiScode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (logical_name: ");
		result.append(logical_name);
		result.append(", OBIScode: ");
		result.append(obiScode);
		result.append(')');
		return result.toString();
	}

} //BaseImpl
