/**
 */
package CIM.IEC61970.Informative.InfLoadControl.impl;

import CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage;
import CIM.IEC61970.Informative.InfLoadControl.LoadShedFunction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Shed Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfLoadControl.impl.LoadShedFunctionImpl#getSwitchedLoad <em>Switched Load</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadShedFunctionImpl extends LoadMgmtFunctionImpl implements LoadShedFunction {
	/**
	 * The default value of the '{@link #getSwitchedLoad() <em>Switched Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchedLoad()
	 * @generated
	 * @ordered
	 */
	protected static final float SWITCHED_LOAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSwitchedLoad() <em>Switched Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchedLoad()
	 * @generated
	 * @ordered
	 */
	protected float switchedLoad = SWITCHED_LOAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadShedFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfLoadControlPackage.Literals.LOAD_SHED_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSwitchedLoad() {
		return switchedLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchedLoad(float newSwitchedLoad) {
		float oldSwitchedLoad = switchedLoad;
		switchedLoad = newSwitchedLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfLoadControlPackage.LOAD_SHED_FUNCTION__SWITCHED_LOAD, oldSwitchedLoad, switchedLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfLoadControlPackage.LOAD_SHED_FUNCTION__SWITCHED_LOAD:
				return getSwitchedLoad();
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
			case InfLoadControlPackage.LOAD_SHED_FUNCTION__SWITCHED_LOAD:
				setSwitchedLoad((Float)newValue);
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
			case InfLoadControlPackage.LOAD_SHED_FUNCTION__SWITCHED_LOAD:
				setSwitchedLoad(SWITCHED_LOAD_EDEFAULT);
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
			case InfLoadControlPackage.LOAD_SHED_FUNCTION__SWITCHED_LOAD:
				return switchedLoad != SWITCHED_LOAD_EDEFAULT;
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
		result.append(" (switchedLoad: ");
		result.append(switchedLoad);
		result.append(')');
		return result.toString();
	}

} //LoadShedFunctionImpl
