/**
 */
package COSEM.COSEMObjects.impl;

import COSEM.COSEMObjects.COSEMObjectsPackage;
import COSEM.COSEMObjects.ElectricityProgramEntries;

import COSEM.InterfaceClasses.impl.DataImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Electricity Program Entries</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityProgramEntriesImpl#getActivefirmwareidentifier <em>Activefirmwareidentifier</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityProgramEntriesImpl#getParameterrecordnumber <em>Parameterrecordnumber</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityProgramEntriesImpl#getTimeswitchprogramnumber <em>Timeswitchprogramnumber</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityProgramEntriesImpl#getRCRprogramnumber <em>RC Rprogramnumber</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityProgramEntriesImpl#getMeterconnectiondiagramID <em>Meterconnectiondiagram ID</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityProgramEntriesImpl#getPassivecalendarname <em>Passivecalendarname</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityProgramEntriesImpl#getActivefirmwaresignature <em>Activefirmwaresignature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectricityProgramEntriesImpl extends DataImpl implements ElectricityProgramEntries {
	/**
	 * The default value of the '{@link #getActivefirmwareidentifier() <em>Activefirmwareidentifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivefirmwareidentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVEFIRMWAREIDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivefirmwareidentifier() <em>Activefirmwareidentifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivefirmwareidentifier()
	 * @generated
	 * @ordered
	 */
	protected String activefirmwareidentifier = ACTIVEFIRMWAREIDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameterrecordnumber() <em>Parameterrecordnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterrecordnumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PARAMETERRECORDNUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getParameterrecordnumber() <em>Parameterrecordnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterrecordnumber()
	 * @generated
	 * @ordered
	 */
	protected int parameterrecordnumber = PARAMETERRECORDNUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeswitchprogramnumber() <em>Timeswitchprogramnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeswitchprogramnumber()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMESWITCHPROGRAMNUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeswitchprogramnumber() <em>Timeswitchprogramnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeswitchprogramnumber()
	 * @generated
	 * @ordered
	 */
	protected int timeswitchprogramnumber = TIMESWITCHPROGRAMNUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRCRprogramnumber() <em>RC Rprogramnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRCRprogramnumber()
	 * @generated
	 * @ordered
	 */
	protected static final int RC_RPROGRAMNUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRCRprogramnumber() <em>RC Rprogramnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRCRprogramnumber()
	 * @generated
	 * @ordered
	 */
	protected int rcRprogramnumber = RC_RPROGRAMNUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeterconnectiondiagramID() <em>Meterconnectiondiagram ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterconnectiondiagramID()
	 * @generated
	 * @ordered
	 */
	protected static final String METERCONNECTIONDIAGRAM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeterconnectiondiagramID() <em>Meterconnectiondiagram ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterconnectiondiagramID()
	 * @generated
	 * @ordered
	 */
	protected String meterconnectiondiagramID = METERCONNECTIONDIAGRAM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassivecalendarname() <em>Passivecalendarname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassivecalendarname()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSIVECALENDARNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassivecalendarname() <em>Passivecalendarname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassivecalendarname()
	 * @generated
	 * @ordered
	 */
	protected String passivecalendarname = PASSIVECALENDARNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivefirmwaresignature() <em>Activefirmwaresignature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivefirmwaresignature()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVEFIRMWARESIGNATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivefirmwaresignature() <em>Activefirmwaresignature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivefirmwaresignature()
	 * @generated
	 * @ordered
	 */
	protected String activefirmwaresignature = ACTIVEFIRMWARESIGNATURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectricityProgramEntriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getElectricityProgramEntries();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivefirmwareidentifier() {
		return activefirmwareidentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivefirmwareidentifier(String newActivefirmwareidentifier) {
		String oldActivefirmwareidentifier = activefirmwareidentifier;
		activefirmwareidentifier = newActivefirmwareidentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__ACTIVEFIRMWAREIDENTIFIER, oldActivefirmwareidentifier, activefirmwareidentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getParameterrecordnumber() {
		return parameterrecordnumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterrecordnumber(int newParameterrecordnumber) {
		int oldParameterrecordnumber = parameterrecordnumber;
		parameterrecordnumber = newParameterrecordnumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__PARAMETERRECORDNUMBER, oldParameterrecordnumber, parameterrecordnumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeswitchprogramnumber() {
		return timeswitchprogramnumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeswitchprogramnumber(int newTimeswitchprogramnumber) {
		int oldTimeswitchprogramnumber = timeswitchprogramnumber;
		timeswitchprogramnumber = newTimeswitchprogramnumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__TIMESWITCHPROGRAMNUMBER, oldTimeswitchprogramnumber, timeswitchprogramnumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRCRprogramnumber() {
		return rcRprogramnumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRCRprogramnumber(int newRCRprogramnumber) {
		int oldRCRprogramnumber = rcRprogramnumber;
		rcRprogramnumber = newRCRprogramnumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__RC_RPROGRAMNUMBER, oldRCRprogramnumber, rcRprogramnumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeterconnectiondiagramID() {
		return meterconnectiondiagramID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeterconnectiondiagramID(String newMeterconnectiondiagramID) {
		String oldMeterconnectiondiagramID = meterconnectiondiagramID;
		meterconnectiondiagramID = newMeterconnectiondiagramID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__METERCONNECTIONDIAGRAM_ID, oldMeterconnectiondiagramID, meterconnectiondiagramID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassivecalendarname() {
		return passivecalendarname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassivecalendarname(String newPassivecalendarname) {
		String oldPassivecalendarname = passivecalendarname;
		passivecalendarname = newPassivecalendarname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__PASSIVECALENDARNAME, oldPassivecalendarname, passivecalendarname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivefirmwaresignature() {
		return activefirmwaresignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivefirmwaresignature(String newActivefirmwaresignature) {
		String oldActivefirmwaresignature = activefirmwaresignature;
		activefirmwaresignature = newActivefirmwaresignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__ACTIVEFIRMWARESIGNATURE, oldActivefirmwaresignature, activefirmwaresignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__ACTIVEFIRMWAREIDENTIFIER:
				return getActivefirmwareidentifier();
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__PARAMETERRECORDNUMBER:
				return getParameterrecordnumber();
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__TIMESWITCHPROGRAMNUMBER:
				return getTimeswitchprogramnumber();
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__RC_RPROGRAMNUMBER:
				return getRCRprogramnumber();
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__METERCONNECTIONDIAGRAM_ID:
				return getMeterconnectiondiagramID();
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__PASSIVECALENDARNAME:
				return getPassivecalendarname();
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__ACTIVEFIRMWARESIGNATURE:
				return getActivefirmwaresignature();
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
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__ACTIVEFIRMWAREIDENTIFIER:
				setActivefirmwareidentifier((String)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__PARAMETERRECORDNUMBER:
				setParameterrecordnumber((Integer)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__TIMESWITCHPROGRAMNUMBER:
				setTimeswitchprogramnumber((Integer)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__RC_RPROGRAMNUMBER:
				setRCRprogramnumber((Integer)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__METERCONNECTIONDIAGRAM_ID:
				setMeterconnectiondiagramID((String)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__PASSIVECALENDARNAME:
				setPassivecalendarname((String)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__ACTIVEFIRMWARESIGNATURE:
				setActivefirmwaresignature((String)newValue);
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
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__ACTIVEFIRMWAREIDENTIFIER:
				setActivefirmwareidentifier(ACTIVEFIRMWAREIDENTIFIER_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__PARAMETERRECORDNUMBER:
				setParameterrecordnumber(PARAMETERRECORDNUMBER_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__TIMESWITCHPROGRAMNUMBER:
				setTimeswitchprogramnumber(TIMESWITCHPROGRAMNUMBER_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__RC_RPROGRAMNUMBER:
				setRCRprogramnumber(RC_RPROGRAMNUMBER_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__METERCONNECTIONDIAGRAM_ID:
				setMeterconnectiondiagramID(METERCONNECTIONDIAGRAM_ID_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__PASSIVECALENDARNAME:
				setPassivecalendarname(PASSIVECALENDARNAME_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__ACTIVEFIRMWARESIGNATURE:
				setActivefirmwaresignature(ACTIVEFIRMWARESIGNATURE_EDEFAULT);
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
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__ACTIVEFIRMWAREIDENTIFIER:
				return ACTIVEFIRMWAREIDENTIFIER_EDEFAULT == null ? activefirmwareidentifier != null : !ACTIVEFIRMWAREIDENTIFIER_EDEFAULT.equals(activefirmwareidentifier);
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__PARAMETERRECORDNUMBER:
				return parameterrecordnumber != PARAMETERRECORDNUMBER_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__TIMESWITCHPROGRAMNUMBER:
				return timeswitchprogramnumber != TIMESWITCHPROGRAMNUMBER_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__RC_RPROGRAMNUMBER:
				return rcRprogramnumber != RC_RPROGRAMNUMBER_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__METERCONNECTIONDIAGRAM_ID:
				return METERCONNECTIONDIAGRAM_ID_EDEFAULT == null ? meterconnectiondiagramID != null : !METERCONNECTIONDIAGRAM_ID_EDEFAULT.equals(meterconnectiondiagramID);
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__PASSIVECALENDARNAME:
				return PASSIVECALENDARNAME_EDEFAULT == null ? passivecalendarname != null : !PASSIVECALENDARNAME_EDEFAULT.equals(passivecalendarname);
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES__ACTIVEFIRMWARESIGNATURE:
				return ACTIVEFIRMWARESIGNATURE_EDEFAULT == null ? activefirmwaresignature != null : !ACTIVEFIRMWARESIGNATURE_EDEFAULT.equals(activefirmwaresignature);
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
		result.append(" (Activefirmwareidentifier: ");
		result.append(activefirmwareidentifier);
		result.append(", Parameterrecordnumber: ");
		result.append(parameterrecordnumber);
		result.append(", Timeswitchprogramnumber: ");
		result.append(timeswitchprogramnumber);
		result.append(", RCRprogramnumber: ");
		result.append(rcRprogramnumber);
		result.append(", MeterconnectiondiagramID: ");
		result.append(meterconnectiondiagramID);
		result.append(", Passivecalendarname: ");
		result.append(passivecalendarname);
		result.append(", Activefirmwaresignature: ");
		result.append(activefirmwaresignature);
		result.append(')');
		return result.toString();
	}

} //ElectricityProgramEntriesImpl
