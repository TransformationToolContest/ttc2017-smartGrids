/**
 */
package gluemodel.COSEM.COSEMObjects.impl;

import gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage;
import gluemodel.COSEM.COSEMObjects.OperatingTime;

import gluemodel.COSEM.InterfaceClasses.impl.DataImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operating Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.OperatingTimeImpl#getTimeofoperation <em>Timeofoperation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatingTimeImpl extends DataImpl implements OperatingTime {
	/**
	 * The default value of the '{@link #getTimeofoperation() <em>Timeofoperation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeofoperation()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOFOPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeofoperation() <em>Timeofoperation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeofoperation()
	 * @generated
	 * @ordered
	 */
	protected String timeofoperation = TIMEOFOPERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatingTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getOperatingTime();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeofoperation() {
		return timeofoperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeofoperation(String newTimeofoperation) {
		String oldTimeofoperation = timeofoperation;
		timeofoperation = newTimeofoperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.OPERATING_TIME__TIMEOFOPERATION, oldTimeofoperation, timeofoperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.OPERATING_TIME__TIMEOFOPERATION:
				return getTimeofoperation();
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
			case COSEMObjectsPackage.OPERATING_TIME__TIMEOFOPERATION:
				setTimeofoperation((String)newValue);
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
			case COSEMObjectsPackage.OPERATING_TIME__TIMEOFOPERATION:
				setTimeofoperation(TIMEOFOPERATION_EDEFAULT);
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
			case COSEMObjectsPackage.OPERATING_TIME__TIMEOFOPERATION:
				return TIMEOFOPERATION_EDEFAULT == null ? timeofoperation != null : !TIMEOFOPERATION_EDEFAULT.equals(timeofoperation);
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
		result.append(" (Timeofoperation: ");
		result.append(timeofoperation);
		result.append(')');
		return result.toString();
	}

} //OperatingTimeImpl
