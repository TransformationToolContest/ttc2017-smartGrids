/**
 */
package CIM.IEC61970.Informative.InfOperations.impl;

import CIM.IEC61968.Common.DateTimeInterval;
import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import CIM.IEC61970.Informative.InfOperations.OutageCode;
import CIM.IEC61970.Informative.InfOperations.OutageRecord;
import CIM.IEC61970.Informative.InfOperations.OutageStep;
import CIM.IEC61970.Informative.InfOperations.OutageStepPsrRole;

import CIM.IEC61970.Informative.InfWork.Crew;
import CIM.IEC61970.Informative.InfWork.InfWorkPackage;

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
 * An implementation of the model object '<em><b>Outage Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.OutageStepImpl#isInjury <em>Injury</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.OutageStepImpl#getOutageCodes <em>Outage Codes</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.OutageStepImpl#getCrews <em>Crews</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.OutageStepImpl#getSpecialCustomerCount <em>Special Customer Count</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.OutageStepImpl#getEstimatedRestoreDateTime <em>Estimated Restore Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.OutageStepImpl#isFatality <em>Fatality</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.OutageStepImpl#getCallerCount <em>Caller Count</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.OutageStepImpl#isDamage <em>Damage</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.OutageStepImpl#getJobPriority <em>Job Priority</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.OutageStepImpl#isShockReported <em>Shock Reported</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.OutageStepImpl#getAverageCml <em>Average Cml</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.OutageStepImpl#getTotalCml <em>Total Cml</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.OutageStepImpl#getTotalCustomerCount <em>Total Customer Count</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.OutageStepImpl#getCriticalCustomerCount <em>Critical Customer Count</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.OutageStepImpl#getNoPowerInterval <em>No Power Interval</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.OutageStepImpl#getConductingEquipmentRoles <em>Conducting Equipment Roles</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.OutageStepImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.OutageStepImpl#getOutageRecord <em>Outage Record</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutageStepImpl extends IdentifiedObjectImpl implements OutageStep {
	/**
	 * The default value of the '{@link #isInjury() <em>Injury</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInjury()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INJURY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInjury() <em>Injury</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInjury()
	 * @generated
	 * @ordered
	 */
	protected boolean injury = INJURY_EDEFAULT;

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
	 * The cached value of the '{@link #getCrews() <em>Crews</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrews()
	 * @generated
	 * @ordered
	 */
	protected EList<Crew> crews;

	/**
	 * The default value of the '{@link #getSpecialCustomerCount() <em>Special Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialCustomerCount()
	 * @generated
	 * @ordered
	 */
	protected static final int SPECIAL_CUSTOMER_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSpecialCustomerCount() <em>Special Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialCustomerCount()
	 * @generated
	 * @ordered
	 */
	protected int specialCustomerCount = SPECIAL_CUSTOMER_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedRestoreDateTime() <em>Estimated Restore Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedRestoreDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date ESTIMATED_RESTORE_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedRestoreDateTime() <em>Estimated Restore Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedRestoreDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date estimatedRestoreDateTime = ESTIMATED_RESTORE_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #isFatality() <em>Fatality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFatality()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FATALITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFatality() <em>Fatality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFatality()
	 * @generated
	 * @ordered
	 */
	protected boolean fatality = FATALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCallerCount() <em>Caller Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallerCount()
	 * @generated
	 * @ordered
	 */
	protected static final int CALLER_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCallerCount() <em>Caller Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallerCount()
	 * @generated
	 * @ordered
	 */
	protected int callerCount = CALLER_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #isDamage() <em>Damage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDamage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DAMAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDamage() <em>Damage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDamage()
	 * @generated
	 * @ordered
	 */
	protected boolean damage = DAMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobPriority() <em>Job Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobPriority() <em>Job Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobPriority()
	 * @generated
	 * @ordered
	 */
	protected String jobPriority = JOB_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isShockReported() <em>Shock Reported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShockReported()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOCK_REPORTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShockReported() <em>Shock Reported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShockReported()
	 * @generated
	 * @ordered
	 */
	protected boolean shockReported = SHOCK_REPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverageCml() <em>Average Cml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageCml()
	 * @generated
	 * @ordered
	 */
	protected static final float AVERAGE_CML_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAverageCml() <em>Average Cml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageCml()
	 * @generated
	 * @ordered
	 */
	protected float averageCml = AVERAGE_CML_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalCml() <em>Total Cml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCml()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_CML_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTotalCml() <em>Total Cml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCml()
	 * @generated
	 * @ordered
	 */
	protected float totalCml = TOTAL_CML_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalCustomerCount() <em>Total Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCustomerCount()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_CUSTOMER_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalCustomerCount() <em>Total Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCustomerCount()
	 * @generated
	 * @ordered
	 */
	protected int totalCustomerCount = TOTAL_CUSTOMER_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCriticalCustomerCount() <em>Critical Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalCustomerCount()
	 * @generated
	 * @ordered
	 */
	protected static final int CRITICAL_CUSTOMER_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCriticalCustomerCount() <em>Critical Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalCustomerCount()
	 * @generated
	 * @ordered
	 */
	protected int criticalCustomerCount = CRITICAL_CUSTOMER_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNoPowerInterval() <em>No Power Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoPowerInterval()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval noPowerInterval;

	/**
	 * The cached value of the '{@link #getConductingEquipmentRoles() <em>Conducting Equipment Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductingEquipmentRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<OutageStepPsrRole> conductingEquipmentRoles;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The cached value of the '{@link #getOutageRecord() <em>Outage Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageRecord()
	 * @generated
	 * @ordered
	 */
	protected OutageRecord outageRecord;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutageStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.OUTAGE_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInjury() {
		return injury;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInjury(boolean newInjury) {
		boolean oldInjury = injury;
		injury = newInjury;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_STEP__INJURY, oldInjury, injury));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutageCode> getOutageCodes() {
		if (outageCodes == null) {
			outageCodes = new EObjectWithInverseResolvingEList.ManyInverse<OutageCode>(OutageCode.class, this, InfOperationsPackage.OUTAGE_STEP__OUTAGE_CODES, InfOperationsPackage.OUTAGE_CODE__OUTAGE_STEPS);
		}
		return outageCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Crew> getCrews() {
		if (crews == null) {
			crews = new EObjectWithInverseResolvingEList.ManyInverse<Crew>(Crew.class, this, InfOperationsPackage.OUTAGE_STEP__CREWS, InfWorkPackage.CREW__OUTAGE_STEPS);
		}
		return crews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSpecialCustomerCount() {
		return specialCustomerCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialCustomerCount(int newSpecialCustomerCount) {
		int oldSpecialCustomerCount = specialCustomerCount;
		specialCustomerCount = newSpecialCustomerCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_STEP__SPECIAL_CUSTOMER_COUNT, oldSpecialCustomerCount, specialCustomerCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEstimatedRestoreDateTime() {
		return estimatedRestoreDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatedRestoreDateTime(Date newEstimatedRestoreDateTime) {
		Date oldEstimatedRestoreDateTime = estimatedRestoreDateTime;
		estimatedRestoreDateTime = newEstimatedRestoreDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_STEP__ESTIMATED_RESTORE_DATE_TIME, oldEstimatedRestoreDateTime, estimatedRestoreDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFatality() {
		return fatality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFatality(boolean newFatality) {
		boolean oldFatality = fatality;
		fatality = newFatality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_STEP__FATALITY, oldFatality, fatality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCallerCount() {
		return callerCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallerCount(int newCallerCount) {
		int oldCallerCount = callerCount;
		callerCount = newCallerCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_STEP__CALLER_COUNT, oldCallerCount, callerCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDamage() {
		return damage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDamage(boolean newDamage) {
		boolean oldDamage = damage;
		damage = newDamage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_STEP__DAMAGE, oldDamage, damage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJobPriority() {
		return jobPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobPriority(String newJobPriority) {
		String oldJobPriority = jobPriority;
		jobPriority = newJobPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_STEP__JOB_PRIORITY, oldJobPriority, jobPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShockReported() {
		return shockReported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShockReported(boolean newShockReported) {
		boolean oldShockReported = shockReported;
		shockReported = newShockReported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_STEP__SHOCK_REPORTED, oldShockReported, shockReported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAverageCml() {
		return averageCml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAverageCml(float newAverageCml) {
		float oldAverageCml = averageCml;
		averageCml = newAverageCml;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_STEP__AVERAGE_CML, oldAverageCml, averageCml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTotalCml() {
		return totalCml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCml(float newTotalCml) {
		float oldTotalCml = totalCml;
		totalCml = newTotalCml;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_STEP__TOTAL_CML, oldTotalCml, totalCml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalCustomerCount() {
		return totalCustomerCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCustomerCount(int newTotalCustomerCount) {
		int oldTotalCustomerCount = totalCustomerCount;
		totalCustomerCount = newTotalCustomerCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_STEP__TOTAL_CUSTOMER_COUNT, oldTotalCustomerCount, totalCustomerCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCriticalCustomerCount() {
		return criticalCustomerCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriticalCustomerCount(int newCriticalCustomerCount) {
		int oldCriticalCustomerCount = criticalCustomerCount;
		criticalCustomerCount = newCriticalCustomerCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_STEP__CRITICAL_CUSTOMER_COUNT, oldCriticalCustomerCount, criticalCustomerCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval getNoPowerInterval() {
		if (noPowerInterval != null && noPowerInterval.eIsProxy()) {
			InternalEObject oldNoPowerInterval = (InternalEObject)noPowerInterval;
			noPowerInterval = (DateTimeInterval)eResolveProxy(oldNoPowerInterval);
			if (noPowerInterval != oldNoPowerInterval) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.OUTAGE_STEP__NO_POWER_INTERVAL, oldNoPowerInterval, noPowerInterval));
			}
		}
		return noPowerInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval basicGetNoPowerInterval() {
		return noPowerInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoPowerInterval(DateTimeInterval newNoPowerInterval) {
		DateTimeInterval oldNoPowerInterval = noPowerInterval;
		noPowerInterval = newNoPowerInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_STEP__NO_POWER_INTERVAL, oldNoPowerInterval, noPowerInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutageStepPsrRole> getConductingEquipmentRoles() {
		if (conductingEquipmentRoles == null) {
			conductingEquipmentRoles = new EObjectWithInverseResolvingEList<OutageStepPsrRole>(OutageStepPsrRole.class, this, InfOperationsPackage.OUTAGE_STEP__CONDUCTING_EQUIPMENT_ROLES, InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__OUTAGE_STEP);
		}
		return conductingEquipmentRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Status)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.OUTAGE_STEP__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_STEP__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageRecord getOutageRecord() {
		if (outageRecord != null && outageRecord.eIsProxy()) {
			InternalEObject oldOutageRecord = (InternalEObject)outageRecord;
			outageRecord = (OutageRecord)eResolveProxy(oldOutageRecord);
			if (outageRecord != oldOutageRecord) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.OUTAGE_STEP__OUTAGE_RECORD, oldOutageRecord, outageRecord));
			}
		}
		return outageRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageRecord basicGetOutageRecord() {
		return outageRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutageRecord(OutageRecord newOutageRecord, NotificationChain msgs) {
		OutageRecord oldOutageRecord = outageRecord;
		outageRecord = newOutageRecord;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_STEP__OUTAGE_RECORD, oldOutageRecord, newOutageRecord);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutageRecord(OutageRecord newOutageRecord) {
		if (newOutageRecord != outageRecord) {
			NotificationChain msgs = null;
			if (outageRecord != null)
				msgs = ((InternalEObject)outageRecord).eInverseRemove(this, InfOperationsPackage.OUTAGE_RECORD__OUTAGE_STEPS, OutageRecord.class, msgs);
			if (newOutageRecord != null)
				msgs = ((InternalEObject)newOutageRecord).eInverseAdd(this, InfOperationsPackage.OUTAGE_RECORD__OUTAGE_STEPS, OutageRecord.class, msgs);
			msgs = basicSetOutageRecord(newOutageRecord, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_STEP__OUTAGE_RECORD, newOutageRecord, newOutageRecord));
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
			case InfOperationsPackage.OUTAGE_STEP__OUTAGE_CODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutageCodes()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.OUTAGE_STEP__CREWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCrews()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.OUTAGE_STEP__CONDUCTING_EQUIPMENT_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConductingEquipmentRoles()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.OUTAGE_STEP__OUTAGE_RECORD:
				if (outageRecord != null)
					msgs = ((InternalEObject)outageRecord).eInverseRemove(this, InfOperationsPackage.OUTAGE_RECORD__OUTAGE_STEPS, OutageRecord.class, msgs);
				return basicSetOutageRecord((OutageRecord)otherEnd, msgs);
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
			case InfOperationsPackage.OUTAGE_STEP__OUTAGE_CODES:
				return ((InternalEList<?>)getOutageCodes()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.OUTAGE_STEP__CREWS:
				return ((InternalEList<?>)getCrews()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.OUTAGE_STEP__CONDUCTING_EQUIPMENT_ROLES:
				return ((InternalEList<?>)getConductingEquipmentRoles()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.OUTAGE_STEP__OUTAGE_RECORD:
				return basicSetOutageRecord(null, msgs);
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
			case InfOperationsPackage.OUTAGE_STEP__INJURY:
				return isInjury();
			case InfOperationsPackage.OUTAGE_STEP__OUTAGE_CODES:
				return getOutageCodes();
			case InfOperationsPackage.OUTAGE_STEP__CREWS:
				return getCrews();
			case InfOperationsPackage.OUTAGE_STEP__SPECIAL_CUSTOMER_COUNT:
				return getSpecialCustomerCount();
			case InfOperationsPackage.OUTAGE_STEP__ESTIMATED_RESTORE_DATE_TIME:
				return getEstimatedRestoreDateTime();
			case InfOperationsPackage.OUTAGE_STEP__FATALITY:
				return isFatality();
			case InfOperationsPackage.OUTAGE_STEP__CALLER_COUNT:
				return getCallerCount();
			case InfOperationsPackage.OUTAGE_STEP__DAMAGE:
				return isDamage();
			case InfOperationsPackage.OUTAGE_STEP__JOB_PRIORITY:
				return getJobPriority();
			case InfOperationsPackage.OUTAGE_STEP__SHOCK_REPORTED:
				return isShockReported();
			case InfOperationsPackage.OUTAGE_STEP__AVERAGE_CML:
				return getAverageCml();
			case InfOperationsPackage.OUTAGE_STEP__TOTAL_CML:
				return getTotalCml();
			case InfOperationsPackage.OUTAGE_STEP__TOTAL_CUSTOMER_COUNT:
				return getTotalCustomerCount();
			case InfOperationsPackage.OUTAGE_STEP__CRITICAL_CUSTOMER_COUNT:
				return getCriticalCustomerCount();
			case InfOperationsPackage.OUTAGE_STEP__NO_POWER_INTERVAL:
				if (resolve) return getNoPowerInterval();
				return basicGetNoPowerInterval();
			case InfOperationsPackage.OUTAGE_STEP__CONDUCTING_EQUIPMENT_ROLES:
				return getConductingEquipmentRoles();
			case InfOperationsPackage.OUTAGE_STEP__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfOperationsPackage.OUTAGE_STEP__OUTAGE_RECORD:
				if (resolve) return getOutageRecord();
				return basicGetOutageRecord();
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
			case InfOperationsPackage.OUTAGE_STEP__INJURY:
				setInjury((Boolean)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__OUTAGE_CODES:
				getOutageCodes().clear();
				getOutageCodes().addAll((Collection<? extends OutageCode>)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__CREWS:
				getCrews().clear();
				getCrews().addAll((Collection<? extends Crew>)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__SPECIAL_CUSTOMER_COUNT:
				setSpecialCustomerCount((Integer)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__ESTIMATED_RESTORE_DATE_TIME:
				setEstimatedRestoreDateTime((Date)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__FATALITY:
				setFatality((Boolean)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__CALLER_COUNT:
				setCallerCount((Integer)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__DAMAGE:
				setDamage((Boolean)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__JOB_PRIORITY:
				setJobPriority((String)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__SHOCK_REPORTED:
				setShockReported((Boolean)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__AVERAGE_CML:
				setAverageCml((Float)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__TOTAL_CML:
				setTotalCml((Float)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__TOTAL_CUSTOMER_COUNT:
				setTotalCustomerCount((Integer)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__CRITICAL_CUSTOMER_COUNT:
				setCriticalCustomerCount((Integer)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__NO_POWER_INTERVAL:
				setNoPowerInterval((DateTimeInterval)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__CONDUCTING_EQUIPMENT_ROLES:
				getConductingEquipmentRoles().clear();
				getConductingEquipmentRoles().addAll((Collection<? extends OutageStepPsrRole>)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__STATUS:
				setStatus((Status)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__OUTAGE_RECORD:
				setOutageRecord((OutageRecord)newValue);
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
			case InfOperationsPackage.OUTAGE_STEP__INJURY:
				setInjury(INJURY_EDEFAULT);
				return;
			case InfOperationsPackage.OUTAGE_STEP__OUTAGE_CODES:
				getOutageCodes().clear();
				return;
			case InfOperationsPackage.OUTAGE_STEP__CREWS:
				getCrews().clear();
				return;
			case InfOperationsPackage.OUTAGE_STEP__SPECIAL_CUSTOMER_COUNT:
				setSpecialCustomerCount(SPECIAL_CUSTOMER_COUNT_EDEFAULT);
				return;
			case InfOperationsPackage.OUTAGE_STEP__ESTIMATED_RESTORE_DATE_TIME:
				setEstimatedRestoreDateTime(ESTIMATED_RESTORE_DATE_TIME_EDEFAULT);
				return;
			case InfOperationsPackage.OUTAGE_STEP__FATALITY:
				setFatality(FATALITY_EDEFAULT);
				return;
			case InfOperationsPackage.OUTAGE_STEP__CALLER_COUNT:
				setCallerCount(CALLER_COUNT_EDEFAULT);
				return;
			case InfOperationsPackage.OUTAGE_STEP__DAMAGE:
				setDamage(DAMAGE_EDEFAULT);
				return;
			case InfOperationsPackage.OUTAGE_STEP__JOB_PRIORITY:
				setJobPriority(JOB_PRIORITY_EDEFAULT);
				return;
			case InfOperationsPackage.OUTAGE_STEP__SHOCK_REPORTED:
				setShockReported(SHOCK_REPORTED_EDEFAULT);
				return;
			case InfOperationsPackage.OUTAGE_STEP__AVERAGE_CML:
				setAverageCml(AVERAGE_CML_EDEFAULT);
				return;
			case InfOperationsPackage.OUTAGE_STEP__TOTAL_CML:
				setTotalCml(TOTAL_CML_EDEFAULT);
				return;
			case InfOperationsPackage.OUTAGE_STEP__TOTAL_CUSTOMER_COUNT:
				setTotalCustomerCount(TOTAL_CUSTOMER_COUNT_EDEFAULT);
				return;
			case InfOperationsPackage.OUTAGE_STEP__CRITICAL_CUSTOMER_COUNT:
				setCriticalCustomerCount(CRITICAL_CUSTOMER_COUNT_EDEFAULT);
				return;
			case InfOperationsPackage.OUTAGE_STEP__NO_POWER_INTERVAL:
				setNoPowerInterval((DateTimeInterval)null);
				return;
			case InfOperationsPackage.OUTAGE_STEP__CONDUCTING_EQUIPMENT_ROLES:
				getConductingEquipmentRoles().clear();
				return;
			case InfOperationsPackage.OUTAGE_STEP__STATUS:
				setStatus((Status)null);
				return;
			case InfOperationsPackage.OUTAGE_STEP__OUTAGE_RECORD:
				setOutageRecord((OutageRecord)null);
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
			case InfOperationsPackage.OUTAGE_STEP__INJURY:
				return injury != INJURY_EDEFAULT;
			case InfOperationsPackage.OUTAGE_STEP__OUTAGE_CODES:
				return outageCodes != null && !outageCodes.isEmpty();
			case InfOperationsPackage.OUTAGE_STEP__CREWS:
				return crews != null && !crews.isEmpty();
			case InfOperationsPackage.OUTAGE_STEP__SPECIAL_CUSTOMER_COUNT:
				return specialCustomerCount != SPECIAL_CUSTOMER_COUNT_EDEFAULT;
			case InfOperationsPackage.OUTAGE_STEP__ESTIMATED_RESTORE_DATE_TIME:
				return ESTIMATED_RESTORE_DATE_TIME_EDEFAULT == null ? estimatedRestoreDateTime != null : !ESTIMATED_RESTORE_DATE_TIME_EDEFAULT.equals(estimatedRestoreDateTime);
			case InfOperationsPackage.OUTAGE_STEP__FATALITY:
				return fatality != FATALITY_EDEFAULT;
			case InfOperationsPackage.OUTAGE_STEP__CALLER_COUNT:
				return callerCount != CALLER_COUNT_EDEFAULT;
			case InfOperationsPackage.OUTAGE_STEP__DAMAGE:
				return damage != DAMAGE_EDEFAULT;
			case InfOperationsPackage.OUTAGE_STEP__JOB_PRIORITY:
				return JOB_PRIORITY_EDEFAULT == null ? jobPriority != null : !JOB_PRIORITY_EDEFAULT.equals(jobPriority);
			case InfOperationsPackage.OUTAGE_STEP__SHOCK_REPORTED:
				return shockReported != SHOCK_REPORTED_EDEFAULT;
			case InfOperationsPackage.OUTAGE_STEP__AVERAGE_CML:
				return averageCml != AVERAGE_CML_EDEFAULT;
			case InfOperationsPackage.OUTAGE_STEP__TOTAL_CML:
				return totalCml != TOTAL_CML_EDEFAULT;
			case InfOperationsPackage.OUTAGE_STEP__TOTAL_CUSTOMER_COUNT:
				return totalCustomerCount != TOTAL_CUSTOMER_COUNT_EDEFAULT;
			case InfOperationsPackage.OUTAGE_STEP__CRITICAL_CUSTOMER_COUNT:
				return criticalCustomerCount != CRITICAL_CUSTOMER_COUNT_EDEFAULT;
			case InfOperationsPackage.OUTAGE_STEP__NO_POWER_INTERVAL:
				return noPowerInterval != null;
			case InfOperationsPackage.OUTAGE_STEP__CONDUCTING_EQUIPMENT_ROLES:
				return conductingEquipmentRoles != null && !conductingEquipmentRoles.isEmpty();
			case InfOperationsPackage.OUTAGE_STEP__STATUS:
				return status != null;
			case InfOperationsPackage.OUTAGE_STEP__OUTAGE_RECORD:
				return outageRecord != null;
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
		result.append(" (injury: ");
		result.append(injury);
		result.append(", specialCustomerCount: ");
		result.append(specialCustomerCount);
		result.append(", estimatedRestoreDateTime: ");
		result.append(estimatedRestoreDateTime);
		result.append(", fatality: ");
		result.append(fatality);
		result.append(", callerCount: ");
		result.append(callerCount);
		result.append(", damage: ");
		result.append(damage);
		result.append(", jobPriority: ");
		result.append(jobPriority);
		result.append(", shockReported: ");
		result.append(shockReported);
		result.append(", averageCml: ");
		result.append(averageCml);
		result.append(", totalCml: ");
		result.append(totalCml);
		result.append(", totalCustomerCount: ");
		result.append(totalCustomerCount);
		result.append(", criticalCustomerCount: ");
		result.append(criticalCustomerCount);
		result.append(')');
		return result.toString();
	}

} //OutageStepImpl
