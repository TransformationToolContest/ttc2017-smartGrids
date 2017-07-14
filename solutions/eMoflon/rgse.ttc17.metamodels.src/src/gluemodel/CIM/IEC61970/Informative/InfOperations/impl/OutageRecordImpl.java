/**
 */
package gluemodel.CIM.IEC61970.Informative.InfOperations.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.InfOperations.OutageCode;
import gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord;
import gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport;
import gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outage Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageRecordImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageRecordImpl#getOutageReport <em>Outage Report</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageRecordImpl#getActionTaken <em>Action Taken</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageRecordImpl#getEndDateTime <em>End Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageRecordImpl#getOutageSteps <em>Outage Steps</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageRecordImpl#getOutageCodes <em>Outage Codes</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageRecordImpl#getDamageCode <em>Damage Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageRecordImpl#isIsPlanned <em>Is Planned</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutageRecordImpl extends DocumentImpl implements OutageRecord {
	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final String MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected String mode = MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutageReport() <em>Outage Report</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageReport()
	 * @generated
	 * @ordered
	 */
	protected OutageReport outageReport;

	/**
	 * The default value of the '{@link #getActionTaken() <em>Action Taken</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionTaken()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_TAKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionTaken() <em>Action Taken</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionTaken()
	 * @generated
	 * @ordered
	 */
	protected String actionTaken = ACTION_TAKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDateTime() <em>End Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDateTime() <em>End Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date endDateTime = END_DATE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutageSteps() <em>Outage Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<OutageStep> outageSteps;

	/**
	 * The cached value of the '{@link #getOutageCodes() <em>Outage Codes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<OutageCode> outageCodes;

	/**
	 * The default value of the '{@link #getDamageCode() <em>Damage Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamageCode()
	 * @generated
	 * @ordered
	 */
	protected static final String DAMAGE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDamageCode() <em>Damage Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamageCode()
	 * @generated
	 * @ordered
	 */
	protected String damageCode = DAMAGE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPlanned() <em>Is Planned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPlanned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PLANNED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPlanned() <em>Is Planned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPlanned()
	 * @generated
	 * @ordered
	 */
	protected boolean isPlanned = IS_PLANNED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutageRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.OUTAGE_RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(String newMode) {
		String oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_RECORD__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageReport getOutageReport() {
		if (outageReport != null && outageReport.eIsProxy()) {
			InternalEObject oldOutageReport = (InternalEObject)outageReport;
			outageReport = (OutageReport)eResolveProxy(oldOutageReport);
			if (outageReport != oldOutageReport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.OUTAGE_RECORD__OUTAGE_REPORT, oldOutageReport, outageReport));
			}
		}
		return outageReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageReport basicGetOutageReport() {
		return outageReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutageReport(OutageReport newOutageReport, NotificationChain msgs) {
		OutageReport oldOutageReport = outageReport;
		outageReport = newOutageReport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_RECORD__OUTAGE_REPORT, oldOutageReport, newOutageReport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutageReport(OutageReport newOutageReport) {
		if (newOutageReport != outageReport) {
			NotificationChain msgs = null;
			if (outageReport != null)
				msgs = ((InternalEObject)outageReport).eInverseRemove(this, InfOperationsPackage.OUTAGE_REPORT__OUTAGE_RECORD, OutageReport.class, msgs);
			if (newOutageReport != null)
				msgs = ((InternalEObject)newOutageReport).eInverseAdd(this, InfOperationsPackage.OUTAGE_REPORT__OUTAGE_RECORD, OutageReport.class, msgs);
			msgs = basicSetOutageReport(newOutageReport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_RECORD__OUTAGE_REPORT, newOutageReport, newOutageReport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionTaken() {
		return actionTaken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionTaken(String newActionTaken) {
		String oldActionTaken = actionTaken;
		actionTaken = newActionTaken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_RECORD__ACTION_TAKEN, oldActionTaken, actionTaken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDateTime() {
		return endDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDateTime(Date newEndDateTime) {
		Date oldEndDateTime = endDateTime;
		endDateTime = newEndDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_RECORD__END_DATE_TIME, oldEndDateTime, endDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutageStep> getOutageSteps() {
		if (outageSteps == null) {
			outageSteps = new EObjectWithInverseResolvingEList<OutageStep>(OutageStep.class, this, InfOperationsPackage.OUTAGE_RECORD__OUTAGE_STEPS, InfOperationsPackage.OUTAGE_STEP__OUTAGE_RECORD);
		}
		return outageSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutageCode> getOutageCodes() {
		if (outageCodes == null) {
			outageCodes = new EObjectWithInverseResolvingEList.ManyInverse<OutageCode>(OutageCode.class, this, InfOperationsPackage.OUTAGE_RECORD__OUTAGE_CODES, InfOperationsPackage.OUTAGE_CODE__OUTAGE_RECORDS);
		}
		return outageCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDamageCode() {
		return damageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDamageCode(String newDamageCode) {
		String oldDamageCode = damageCode;
		damageCode = newDamageCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_RECORD__DAMAGE_CODE, oldDamageCode, damageCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPlanned() {
		return isPlanned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPlanned(boolean newIsPlanned) {
		boolean oldIsPlanned = isPlanned;
		isPlanned = newIsPlanned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_RECORD__IS_PLANNED, oldIsPlanned, isPlanned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_REPORT:
				if (outageReport != null)
					msgs = ((InternalEObject)outageReport).eInverseRemove(this, InfOperationsPackage.OUTAGE_REPORT__OUTAGE_RECORD, OutageReport.class, msgs);
				return basicSetOutageReport((OutageReport)otherEnd, msgs);
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutageSteps()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_CODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutageCodes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_REPORT:
				return basicSetOutageReport(null, msgs);
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_STEPS:
				return ((InternalEList<?>)getOutageSteps()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_CODES:
				return ((InternalEList<?>)getOutageCodes()).basicRemove(otherEnd, msgs);
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
			case InfOperationsPackage.OUTAGE_RECORD__MODE:
				return getMode();
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_REPORT:
				if (resolve) return getOutageReport();
				return basicGetOutageReport();
			case InfOperationsPackage.OUTAGE_RECORD__ACTION_TAKEN:
				return getActionTaken();
			case InfOperationsPackage.OUTAGE_RECORD__END_DATE_TIME:
				return getEndDateTime();
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_STEPS:
				return getOutageSteps();
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_CODES:
				return getOutageCodes();
			case InfOperationsPackage.OUTAGE_RECORD__DAMAGE_CODE:
				return getDamageCode();
			case InfOperationsPackage.OUTAGE_RECORD__IS_PLANNED:
				return isIsPlanned();
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
			case InfOperationsPackage.OUTAGE_RECORD__MODE:
				setMode((String)newValue);
				return;
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_REPORT:
				setOutageReport((OutageReport)newValue);
				return;
			case InfOperationsPackage.OUTAGE_RECORD__ACTION_TAKEN:
				setActionTaken((String)newValue);
				return;
			case InfOperationsPackage.OUTAGE_RECORD__END_DATE_TIME:
				setEndDateTime((Date)newValue);
				return;
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_STEPS:
				getOutageSteps().clear();
				getOutageSteps().addAll((Collection<? extends OutageStep>)newValue);
				return;
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_CODES:
				getOutageCodes().clear();
				getOutageCodes().addAll((Collection<? extends OutageCode>)newValue);
				return;
			case InfOperationsPackage.OUTAGE_RECORD__DAMAGE_CODE:
				setDamageCode((String)newValue);
				return;
			case InfOperationsPackage.OUTAGE_RECORD__IS_PLANNED:
				setIsPlanned((Boolean)newValue);
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
			case InfOperationsPackage.OUTAGE_RECORD__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_REPORT:
				setOutageReport((OutageReport)null);
				return;
			case InfOperationsPackage.OUTAGE_RECORD__ACTION_TAKEN:
				setActionTaken(ACTION_TAKEN_EDEFAULT);
				return;
			case InfOperationsPackage.OUTAGE_RECORD__END_DATE_TIME:
				setEndDateTime(END_DATE_TIME_EDEFAULT);
				return;
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_STEPS:
				getOutageSteps().clear();
				return;
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_CODES:
				getOutageCodes().clear();
				return;
			case InfOperationsPackage.OUTAGE_RECORD__DAMAGE_CODE:
				setDamageCode(DAMAGE_CODE_EDEFAULT);
				return;
			case InfOperationsPackage.OUTAGE_RECORD__IS_PLANNED:
				setIsPlanned(IS_PLANNED_EDEFAULT);
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
			case InfOperationsPackage.OUTAGE_RECORD__MODE:
				return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_REPORT:
				return outageReport != null;
			case InfOperationsPackage.OUTAGE_RECORD__ACTION_TAKEN:
				return ACTION_TAKEN_EDEFAULT == null ? actionTaken != null : !ACTION_TAKEN_EDEFAULT.equals(actionTaken);
			case InfOperationsPackage.OUTAGE_RECORD__END_DATE_TIME:
				return END_DATE_TIME_EDEFAULT == null ? endDateTime != null : !END_DATE_TIME_EDEFAULT.equals(endDateTime);
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_STEPS:
				return outageSteps != null && !outageSteps.isEmpty();
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_CODES:
				return outageCodes != null && !outageCodes.isEmpty();
			case InfOperationsPackage.OUTAGE_RECORD__DAMAGE_CODE:
				return DAMAGE_CODE_EDEFAULT == null ? damageCode != null : !DAMAGE_CODE_EDEFAULT.equals(damageCode);
			case InfOperationsPackage.OUTAGE_RECORD__IS_PLANNED:
				return isPlanned != IS_PLANNED_EDEFAULT;
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
		result.append(" (mode: ");
		result.append(mode);
		result.append(", actionTaken: ");
		result.append(actionTaken);
		result.append(", endDateTime: ");
		result.append(endDateTime);
		result.append(", damageCode: ");
		result.append(damageCode);
		result.append(", isPlanned: ");
		result.append(isPlanned);
		result.append(')');
		return result.toString();
	}

} //OutageRecordImpl
