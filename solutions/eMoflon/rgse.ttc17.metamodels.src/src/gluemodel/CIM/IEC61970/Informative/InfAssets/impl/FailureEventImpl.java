/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets.impl;

import gluemodel.CIM.IEC61968.Common.impl.ActivityRecordImpl;

import gluemodel.CIM.IEC61970.Informative.InfAssets.FailureEvent;
import gluemodel.CIM.IEC61970.Informative.InfAssets.FailureIsolationMethodKind;
import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.FailureEventImpl#getFailureIsolationMethod <em>Failure Isolation Method</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.FailureEventImpl#getCorporateCode <em>Corporate Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.FailureEventImpl#getFaultLocatingMethod <em>Fault Locating Method</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.FailureEventImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailureEventImpl extends ActivityRecordImpl implements FailureEvent {
	/**
	 * The default value of the '{@link #getFailureIsolationMethod() <em>Failure Isolation Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureIsolationMethod()
	 * @generated
	 * @ordered
	 */
	protected static final FailureIsolationMethodKind FAILURE_ISOLATION_METHOD_EDEFAULT = FailureIsolationMethodKind.BREAKER_OPERATION;

	/**
	 * The cached value of the '{@link #getFailureIsolationMethod() <em>Failure Isolation Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureIsolationMethod()
	 * @generated
	 * @ordered
	 */
	protected FailureIsolationMethodKind failureIsolationMethod = FAILURE_ISOLATION_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCorporateCode() <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorporateCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CORPORATE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorporateCode() <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorporateCode()
	 * @generated
	 * @ordered
	 */
	protected String corporateCode = CORPORATE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFaultLocatingMethod() <em>Fault Locating Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultLocatingMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String FAULT_LOCATING_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFaultLocatingMethod() <em>Fault Locating Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultLocatingMethod()
	 * @generated
	 * @ordered
	 */
	protected String faultLocatingMethod = FAULT_LOCATING_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getFailureEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureIsolationMethodKind getFailureIsolationMethod() {
		return failureIsolationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureIsolationMethod(FailureIsolationMethodKind newFailureIsolationMethod) {
		FailureIsolationMethodKind oldFailureIsolationMethod = failureIsolationMethod;
		failureIsolationMethod = newFailureIsolationMethod == null ? FAILURE_ISOLATION_METHOD_EDEFAULT : newFailureIsolationMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.FAILURE_EVENT__FAILURE_ISOLATION_METHOD, oldFailureIsolationMethod, failureIsolationMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCorporateCode() {
		return corporateCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorporateCode(String newCorporateCode) {
		String oldCorporateCode = corporateCode;
		corporateCode = newCorporateCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.FAILURE_EVENT__CORPORATE_CODE, oldCorporateCode, corporateCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFaultLocatingMethod() {
		return faultLocatingMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaultLocatingMethod(String newFaultLocatingMethod) {
		String oldFaultLocatingMethod = faultLocatingMethod;
		faultLocatingMethod = newFaultLocatingMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.FAILURE_EVENT__FAULT_LOCATING_METHOD, oldFaultLocatingMethod, faultLocatingMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.FAILURE_EVENT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.FAILURE_EVENT__FAILURE_ISOLATION_METHOD:
				return getFailureIsolationMethod();
			case InfAssetsPackage.FAILURE_EVENT__CORPORATE_CODE:
				return getCorporateCode();
			case InfAssetsPackage.FAILURE_EVENT__FAULT_LOCATING_METHOD:
				return getFaultLocatingMethod();
			case InfAssetsPackage.FAILURE_EVENT__LOCATION:
				return getLocation();
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
			case InfAssetsPackage.FAILURE_EVENT__FAILURE_ISOLATION_METHOD:
				setFailureIsolationMethod((FailureIsolationMethodKind)newValue);
				return;
			case InfAssetsPackage.FAILURE_EVENT__CORPORATE_CODE:
				setCorporateCode((String)newValue);
				return;
			case InfAssetsPackage.FAILURE_EVENT__FAULT_LOCATING_METHOD:
				setFaultLocatingMethod((String)newValue);
				return;
			case InfAssetsPackage.FAILURE_EVENT__LOCATION:
				setLocation((String)newValue);
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
			case InfAssetsPackage.FAILURE_EVENT__FAILURE_ISOLATION_METHOD:
				setFailureIsolationMethod(FAILURE_ISOLATION_METHOD_EDEFAULT);
				return;
			case InfAssetsPackage.FAILURE_EVENT__CORPORATE_CODE:
				setCorporateCode(CORPORATE_CODE_EDEFAULT);
				return;
			case InfAssetsPackage.FAILURE_EVENT__FAULT_LOCATING_METHOD:
				setFaultLocatingMethod(FAULT_LOCATING_METHOD_EDEFAULT);
				return;
			case InfAssetsPackage.FAILURE_EVENT__LOCATION:
				setLocation(LOCATION_EDEFAULT);
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
			case InfAssetsPackage.FAILURE_EVENT__FAILURE_ISOLATION_METHOD:
				return failureIsolationMethod != FAILURE_ISOLATION_METHOD_EDEFAULT;
			case InfAssetsPackage.FAILURE_EVENT__CORPORATE_CODE:
				return CORPORATE_CODE_EDEFAULT == null ? corporateCode != null : !CORPORATE_CODE_EDEFAULT.equals(corporateCode);
			case InfAssetsPackage.FAILURE_EVENT__FAULT_LOCATING_METHOD:
				return FAULT_LOCATING_METHOD_EDEFAULT == null ? faultLocatingMethod != null : !FAULT_LOCATING_METHOD_EDEFAULT.equals(faultLocatingMethod);
			case InfAssetsPackage.FAILURE_EVENT__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
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
		result.append(" (failureIsolationMethod: ");
		result.append(failureIsolationMethod);
		result.append(", corporateCode: ");
		result.append(corporateCode);
		result.append(", faultLocatingMethod: ");
		result.append(faultLocatingMethod);
		result.append(", location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //FailureEventImpl
