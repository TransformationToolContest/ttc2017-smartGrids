/**
 */
package gluemodel.CIM.IEC61970.Informative.InfOperations.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage;
import gluemodel.CIM.IEC61970.Informative.InfCustomers.OutageHistory;

import gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord;
import gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outage Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageReportImpl#getOutageRecord <em>Outage Record</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageReportImpl#getCustomerCount <em>Customer Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageReportImpl#getOutageHistory <em>Outage History</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageReportImpl#getOutageDuration <em>Outage Duration</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageReportImpl#getAverageCml <em>Average Cml</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageReportImpl#getTotalCml <em>Total Cml</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutageReportImpl extends DocumentImpl implements OutageReport {
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
	 * The default value of the '{@link #getCustomerCount() <em>Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerCount()
	 * @generated
	 * @ordered
	 */
	protected static final int CUSTOMER_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCustomerCount() <em>Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerCount()
	 * @generated
	 * @ordered
	 */
	protected int customerCount = CUSTOMER_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutageHistory() <em>Outage History</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageHistory()
	 * @generated
	 * @ordered
	 */
	protected OutageHistory outageHistory;

	/**
	 * The default value of the '{@link #getOutageDuration() <em>Outage Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageDuration()
	 * @generated
	 * @ordered
	 */
	protected static final float OUTAGE_DURATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOutageDuration() <em>Outage Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageDuration()
	 * @generated
	 * @ordered
	 */
	protected float outageDuration = OUTAGE_DURATION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutageReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.OUTAGE_REPORT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.OUTAGE_REPORT__OUTAGE_RECORD, oldOutageRecord, outageRecord));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_REPORT__OUTAGE_RECORD, oldOutageRecord, newOutageRecord);
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
				msgs = ((InternalEObject)outageRecord).eInverseRemove(this, InfOperationsPackage.OUTAGE_RECORD__OUTAGE_REPORT, OutageRecord.class, msgs);
			if (newOutageRecord != null)
				msgs = ((InternalEObject)newOutageRecord).eInverseAdd(this, InfOperationsPackage.OUTAGE_RECORD__OUTAGE_REPORT, OutageRecord.class, msgs);
			msgs = basicSetOutageRecord(newOutageRecord, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_REPORT__OUTAGE_RECORD, newOutageRecord, newOutageRecord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCustomerCount() {
		return customerCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerCount(int newCustomerCount) {
		int oldCustomerCount = customerCount;
		customerCount = newCustomerCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_REPORT__CUSTOMER_COUNT, oldCustomerCount, customerCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageHistory getOutageHistory() {
		if (outageHistory != null && outageHistory.eIsProxy()) {
			InternalEObject oldOutageHistory = (InternalEObject)outageHistory;
			outageHistory = (OutageHistory)eResolveProxy(oldOutageHistory);
			if (outageHistory != oldOutageHistory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.OUTAGE_REPORT__OUTAGE_HISTORY, oldOutageHistory, outageHistory));
			}
		}
		return outageHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageHistory basicGetOutageHistory() {
		return outageHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutageHistory(OutageHistory newOutageHistory, NotificationChain msgs) {
		OutageHistory oldOutageHistory = outageHistory;
		outageHistory = newOutageHistory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_REPORT__OUTAGE_HISTORY, oldOutageHistory, newOutageHistory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutageHistory(OutageHistory newOutageHistory) {
		if (newOutageHistory != outageHistory) {
			NotificationChain msgs = null;
			if (outageHistory != null)
				msgs = ((InternalEObject)outageHistory).eInverseRemove(this, InfCustomersPackage.OUTAGE_HISTORY__OUTAGE_REPORTS, OutageHistory.class, msgs);
			if (newOutageHistory != null)
				msgs = ((InternalEObject)newOutageHistory).eInverseAdd(this, InfCustomersPackage.OUTAGE_HISTORY__OUTAGE_REPORTS, OutageHistory.class, msgs);
			msgs = basicSetOutageHistory(newOutageHistory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_REPORT__OUTAGE_HISTORY, newOutageHistory, newOutageHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getOutageDuration() {
		return outageDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutageDuration(float newOutageDuration) {
		float oldOutageDuration = outageDuration;
		outageDuration = newOutageDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_REPORT__OUTAGE_DURATION, oldOutageDuration, outageDuration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_REPORT__AVERAGE_CML, oldAverageCml, averageCml));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_REPORT__TOTAL_CML, oldTotalCml, totalCml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_RECORD:
				if (outageRecord != null)
					msgs = ((InternalEObject)outageRecord).eInverseRemove(this, InfOperationsPackage.OUTAGE_RECORD__OUTAGE_REPORT, OutageRecord.class, msgs);
				return basicSetOutageRecord((OutageRecord)otherEnd, msgs);
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_HISTORY:
				if (outageHistory != null)
					msgs = ((InternalEObject)outageHistory).eInverseRemove(this, InfCustomersPackage.OUTAGE_HISTORY__OUTAGE_REPORTS, OutageHistory.class, msgs);
				return basicSetOutageHistory((OutageHistory)otherEnd, msgs);
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
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_RECORD:
				return basicSetOutageRecord(null, msgs);
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_HISTORY:
				return basicSetOutageHistory(null, msgs);
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
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_RECORD:
				if (resolve) return getOutageRecord();
				return basicGetOutageRecord();
			case InfOperationsPackage.OUTAGE_REPORT__CUSTOMER_COUNT:
				return getCustomerCount();
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_HISTORY:
				if (resolve) return getOutageHistory();
				return basicGetOutageHistory();
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_DURATION:
				return getOutageDuration();
			case InfOperationsPackage.OUTAGE_REPORT__AVERAGE_CML:
				return getAverageCml();
			case InfOperationsPackage.OUTAGE_REPORT__TOTAL_CML:
				return getTotalCml();
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
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_RECORD:
				setOutageRecord((OutageRecord)newValue);
				return;
			case InfOperationsPackage.OUTAGE_REPORT__CUSTOMER_COUNT:
				setCustomerCount((Integer)newValue);
				return;
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_HISTORY:
				setOutageHistory((OutageHistory)newValue);
				return;
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_DURATION:
				setOutageDuration((Float)newValue);
				return;
			case InfOperationsPackage.OUTAGE_REPORT__AVERAGE_CML:
				setAverageCml((Float)newValue);
				return;
			case InfOperationsPackage.OUTAGE_REPORT__TOTAL_CML:
				setTotalCml((Float)newValue);
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
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_RECORD:
				setOutageRecord((OutageRecord)null);
				return;
			case InfOperationsPackage.OUTAGE_REPORT__CUSTOMER_COUNT:
				setCustomerCount(CUSTOMER_COUNT_EDEFAULT);
				return;
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_HISTORY:
				setOutageHistory((OutageHistory)null);
				return;
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_DURATION:
				setOutageDuration(OUTAGE_DURATION_EDEFAULT);
				return;
			case InfOperationsPackage.OUTAGE_REPORT__AVERAGE_CML:
				setAverageCml(AVERAGE_CML_EDEFAULT);
				return;
			case InfOperationsPackage.OUTAGE_REPORT__TOTAL_CML:
				setTotalCml(TOTAL_CML_EDEFAULT);
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
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_RECORD:
				return outageRecord != null;
			case InfOperationsPackage.OUTAGE_REPORT__CUSTOMER_COUNT:
				return customerCount != CUSTOMER_COUNT_EDEFAULT;
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_HISTORY:
				return outageHistory != null;
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_DURATION:
				return outageDuration != OUTAGE_DURATION_EDEFAULT;
			case InfOperationsPackage.OUTAGE_REPORT__AVERAGE_CML:
				return averageCml != AVERAGE_CML_EDEFAULT;
			case InfOperationsPackage.OUTAGE_REPORT__TOTAL_CML:
				return totalCml != TOTAL_CML_EDEFAULT;
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
		result.append(" (customerCount: ");
		result.append(customerCount);
		result.append(", outageDuration: ");
		result.append(outageDuration);
		result.append(", averageCml: ");
		result.append(averageCml);
		result.append(", totalCml: ");
		result.append(totalCml);
		result.append(')');
		return result.toString();
	}

} //OutageReportImpl
