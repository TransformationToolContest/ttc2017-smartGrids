/**
 */
package COSEM.COSEMObjects.impl;

import COSEM.COSEMObjects.COSEMObjectsPackage;
import COSEM.COSEMObjects.TimeEntries;

import COSEM.InterfaceClasses.impl.DataImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Entries</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.impl.TimeEntriesImpl#getLocalTime <em>Local Time</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.TimeEntriesImpl#getLocalDate <em>Local Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeEntriesImpl extends DataImpl implements TimeEntries {
	/**
	 * The default value of the '{@link #getLocalTime() <em>Local Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalTime()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalTime() <em>Local Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalTime()
	 * @generated
	 * @ordered
	 */
	protected String localTime = LOCAL_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalDate() <em>Local Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalDate()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalDate() <em>Local Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalDate()
	 * @generated
	 * @ordered
	 */
	protected String localDate = LOCAL_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeEntriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getTimeEntries();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalTime() {
		return localTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalTime(String newLocalTime) {
		String oldLocalTime = localTime;
		localTime = newLocalTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TIME_ENTRIES__LOCAL_TIME, oldLocalTime, localTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalDate() {
		return localDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalDate(String newLocalDate) {
		String oldLocalDate = localDate;
		localDate = newLocalDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.TIME_ENTRIES__LOCAL_DATE, oldLocalDate, localDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.TIME_ENTRIES__LOCAL_TIME:
				return getLocalTime();
			case COSEMObjectsPackage.TIME_ENTRIES__LOCAL_DATE:
				return getLocalDate();
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
			case COSEMObjectsPackage.TIME_ENTRIES__LOCAL_TIME:
				setLocalTime((String)newValue);
				return;
			case COSEMObjectsPackage.TIME_ENTRIES__LOCAL_DATE:
				setLocalDate((String)newValue);
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
			case COSEMObjectsPackage.TIME_ENTRIES__LOCAL_TIME:
				setLocalTime(LOCAL_TIME_EDEFAULT);
				return;
			case COSEMObjectsPackage.TIME_ENTRIES__LOCAL_DATE:
				setLocalDate(LOCAL_DATE_EDEFAULT);
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
			case COSEMObjectsPackage.TIME_ENTRIES__LOCAL_TIME:
				return LOCAL_TIME_EDEFAULT == null ? localTime != null : !LOCAL_TIME_EDEFAULT.equals(localTime);
			case COSEMObjectsPackage.TIME_ENTRIES__LOCAL_DATE:
				return LOCAL_DATE_EDEFAULT == null ? localDate != null : !LOCAL_DATE_EDEFAULT.equals(localDate);
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
		result.append(" (LocalTime: ");
		result.append(localTime);
		result.append(", LocalDate: ");
		result.append(localDate);
		result.append(')');
		return result.toString();
	}

} //TimeEntriesImpl
