/**
 */
package gluemodel.CIM.IEC61970.Informative.InfOperations.impl;

import gluemodel.CIM.IEC61968.Common.DateTimeInterval;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61968.Customers.Customer;
import gluemodel.CIM.IEC61968.Customers.CustomersPackage;

import gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack;
import gluemodel.CIM.IEC61970.Informative.InfOperations.IncidentRecord;
import gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleReportingKind;
import gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket;

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
 * An implementation of the model object '<em><b>Trouble Ticket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.TroubleTicketImpl#getFirstCallDateTime <em>First Call Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.TroubleTicketImpl#getCallBacks <em>Call Backs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.TroubleTicketImpl#isCallBack <em>Call Back</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.TroubleTicketImpl#getIncidentRecord <em>Incident Record</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.TroubleTicketImpl#getEstimatedRestoreDateTime <em>Estimated Restore Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.TroubleTicketImpl#getReportingKind <em>Reporting Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.TroubleTicketImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.TroubleTicketImpl#getCustomerData <em>Customer Data</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.TroubleTicketImpl#isInformBeforeRestored <em>Inform Before Restored</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.TroubleTicketImpl#getAdvice <em>Advice</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.TroubleTicketImpl#isInformAfterRestored <em>Inform After Restored</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.TroubleTicketImpl#getHazardCode <em>Hazard Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.TroubleTicketImpl#getTroublePeriod <em>Trouble Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TroubleTicketImpl extends DocumentImpl implements TroubleTicket {
	/**
	 * The default value of the '{@link #getFirstCallDateTime() <em>First Call Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstCallDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date FIRST_CALL_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstCallDateTime() <em>First Call Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstCallDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date firstCallDateTime = FIRST_CALL_DATE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCallBacks() <em>Call Backs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallBacks()
	 * @generated
	 * @ordered
	 */
	protected EList<CallBack> callBacks;

	/**
	 * The default value of the '{@link #isCallBack() <em>Call Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallBack()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALL_BACK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCallBack() <em>Call Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallBack()
	 * @generated
	 * @ordered
	 */
	protected boolean callBack = CALL_BACK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncidentRecord() <em>Incident Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidentRecord()
	 * @generated
	 * @ordered
	 */
	protected IncidentRecord incidentRecord;

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
	 * The default value of the '{@link #getReportingKind() <em>Reporting Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportingKind()
	 * @generated
	 * @ordered
	 */
	protected static final TroubleReportingKind REPORTING_KIND_EDEFAULT = TroubleReportingKind.LETTER;

	/**
	 * The cached value of the '{@link #getReportingKind() <em>Reporting Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportingKind()
	 * @generated
	 * @ordered
	 */
	protected TroubleReportingKind reportingKind = REPORTING_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected String priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomerData() <em>Customer Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerData()
	 * @generated
	 * @ordered
	 */
	protected Customer customerData;

	/**
	 * The default value of the '{@link #isInformBeforeRestored() <em>Inform Before Restored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInformBeforeRestored()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INFORM_BEFORE_RESTORED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInformBeforeRestored() <em>Inform Before Restored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInformBeforeRestored()
	 * @generated
	 * @ordered
	 */
	protected boolean informBeforeRestored = INFORM_BEFORE_RESTORED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdvice() <em>Advice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvice()
	 * @generated
	 * @ordered
	 */
	protected static final String ADVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdvice() <em>Advice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvice()
	 * @generated
	 * @ordered
	 */
	protected String advice = ADVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #isInformAfterRestored() <em>Inform After Restored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInformAfterRestored()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INFORM_AFTER_RESTORED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInformAfterRestored() <em>Inform After Restored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInformAfterRestored()
	 * @generated
	 * @ordered
	 */
	protected boolean informAfterRestored = INFORM_AFTER_RESTORED_EDEFAULT;

	/**
	 * The default value of the '{@link #getHazardCode() <em>Hazard Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardCode()
	 * @generated
	 * @ordered
	 */
	protected static final String HAZARD_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHazardCode() <em>Hazard Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardCode()
	 * @generated
	 * @ordered
	 */
	protected String hazardCode = HAZARD_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTroublePeriod() <em>Trouble Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTroublePeriod()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval troublePeriod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TroubleTicketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.TROUBLE_TICKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFirstCallDateTime() {
		return firstCallDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstCallDateTime(Date newFirstCallDateTime) {
		Date oldFirstCallDateTime = firstCallDateTime;
		firstCallDateTime = newFirstCallDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.TROUBLE_TICKET__FIRST_CALL_DATE_TIME, oldFirstCallDateTime, firstCallDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallBack> getCallBacks() {
		if (callBacks == null) {
			callBacks = new EObjectWithInverseResolvingEList.ManyInverse<CallBack>(CallBack.class, this, InfOperationsPackage.TROUBLE_TICKET__CALL_BACKS, InfOperationsPackage.CALL_BACK__TROUBLE_TICKETS);
		}
		return callBacks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCallBack() {
		return callBack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallBack(boolean newCallBack) {
		boolean oldCallBack = callBack;
		callBack = newCallBack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.TROUBLE_TICKET__CALL_BACK, oldCallBack, callBack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncidentRecord getIncidentRecord() {
		if (incidentRecord != null && incidentRecord.eIsProxy()) {
			InternalEObject oldIncidentRecord = (InternalEObject)incidentRecord;
			incidentRecord = (IncidentRecord)eResolveProxy(oldIncidentRecord);
			if (incidentRecord != oldIncidentRecord) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.TROUBLE_TICKET__INCIDENT_RECORD, oldIncidentRecord, incidentRecord));
			}
		}
		return incidentRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncidentRecord basicGetIncidentRecord() {
		return incidentRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncidentRecord(IncidentRecord newIncidentRecord, NotificationChain msgs) {
		IncidentRecord oldIncidentRecord = incidentRecord;
		incidentRecord = newIncidentRecord;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfOperationsPackage.TROUBLE_TICKET__INCIDENT_RECORD, oldIncidentRecord, newIncidentRecord);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidentRecord(IncidentRecord newIncidentRecord) {
		if (newIncidentRecord != incidentRecord) {
			NotificationChain msgs = null;
			if (incidentRecord != null)
				msgs = ((InternalEObject)incidentRecord).eInverseRemove(this, InfOperationsPackage.INCIDENT_RECORD__TROUBLE_TICKETS, IncidentRecord.class, msgs);
			if (newIncidentRecord != null)
				msgs = ((InternalEObject)newIncidentRecord).eInverseAdd(this, InfOperationsPackage.INCIDENT_RECORD__TROUBLE_TICKETS, IncidentRecord.class, msgs);
			msgs = basicSetIncidentRecord(newIncidentRecord, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.TROUBLE_TICKET__INCIDENT_RECORD, newIncidentRecord, newIncidentRecord));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.TROUBLE_TICKET__ESTIMATED_RESTORE_DATE_TIME, oldEstimatedRestoreDateTime, estimatedRestoreDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TroubleReportingKind getReportingKind() {
		return reportingKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportingKind(TroubleReportingKind newReportingKind) {
		TroubleReportingKind oldReportingKind = reportingKind;
		reportingKind = newReportingKind == null ? REPORTING_KIND_EDEFAULT : newReportingKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.TROUBLE_TICKET__REPORTING_KIND, oldReportingKind, reportingKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(String newPriority) {
		String oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.TROUBLE_TICKET__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomerData() {
		if (customerData != null && customerData.eIsProxy()) {
			InternalEObject oldCustomerData = (InternalEObject)customerData;
			customerData = (Customer)eResolveProxy(oldCustomerData);
			if (customerData != oldCustomerData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.TROUBLE_TICKET__CUSTOMER_DATA, oldCustomerData, customerData));
			}
		}
		return customerData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomerData() {
		return customerData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerData(Customer newCustomerData, NotificationChain msgs) {
		Customer oldCustomerData = customerData;
		customerData = newCustomerData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfOperationsPackage.TROUBLE_TICKET__CUSTOMER_DATA, oldCustomerData, newCustomerData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerData(Customer newCustomerData) {
		if (newCustomerData != customerData) {
			NotificationChain msgs = null;
			if (customerData != null)
				msgs = ((InternalEObject)customerData).eInverseRemove(this, CustomersPackage.CUSTOMER__TROUBLE_TICKETS, Customer.class, msgs);
			if (newCustomerData != null)
				msgs = ((InternalEObject)newCustomerData).eInverseAdd(this, CustomersPackage.CUSTOMER__TROUBLE_TICKETS, Customer.class, msgs);
			msgs = basicSetCustomerData(newCustomerData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.TROUBLE_TICKET__CUSTOMER_DATA, newCustomerData, newCustomerData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInformBeforeRestored() {
		return informBeforeRestored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformBeforeRestored(boolean newInformBeforeRestored) {
		boolean oldInformBeforeRestored = informBeforeRestored;
		informBeforeRestored = newInformBeforeRestored;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.TROUBLE_TICKET__INFORM_BEFORE_RESTORED, oldInformBeforeRestored, informBeforeRestored));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdvice() {
		return advice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdvice(String newAdvice) {
		String oldAdvice = advice;
		advice = newAdvice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.TROUBLE_TICKET__ADVICE, oldAdvice, advice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInformAfterRestored() {
		return informAfterRestored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformAfterRestored(boolean newInformAfterRestored) {
		boolean oldInformAfterRestored = informAfterRestored;
		informAfterRestored = newInformAfterRestored;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.TROUBLE_TICKET__INFORM_AFTER_RESTORED, oldInformAfterRestored, informAfterRestored));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHazardCode() {
		return hazardCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHazardCode(String newHazardCode) {
		String oldHazardCode = hazardCode;
		hazardCode = newHazardCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.TROUBLE_TICKET__HAZARD_CODE, oldHazardCode, hazardCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval getTroublePeriod() {
		if (troublePeriod != null && troublePeriod.eIsProxy()) {
			InternalEObject oldTroublePeriod = (InternalEObject)troublePeriod;
			troublePeriod = (DateTimeInterval)eResolveProxy(oldTroublePeriod);
			if (troublePeriod != oldTroublePeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.TROUBLE_TICKET__TROUBLE_PERIOD, oldTroublePeriod, troublePeriod));
			}
		}
		return troublePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval basicGetTroublePeriod() {
		return troublePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTroublePeriod(DateTimeInterval newTroublePeriod) {
		DateTimeInterval oldTroublePeriod = troublePeriod;
		troublePeriod = newTroublePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.TROUBLE_TICKET__TROUBLE_PERIOD, oldTroublePeriod, troublePeriod));
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
			case InfOperationsPackage.TROUBLE_TICKET__CALL_BACKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCallBacks()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.TROUBLE_TICKET__INCIDENT_RECORD:
				if (incidentRecord != null)
					msgs = ((InternalEObject)incidentRecord).eInverseRemove(this, InfOperationsPackage.INCIDENT_RECORD__TROUBLE_TICKETS, IncidentRecord.class, msgs);
				return basicSetIncidentRecord((IncidentRecord)otherEnd, msgs);
			case InfOperationsPackage.TROUBLE_TICKET__CUSTOMER_DATA:
				if (customerData != null)
					msgs = ((InternalEObject)customerData).eInverseRemove(this, CustomersPackage.CUSTOMER__TROUBLE_TICKETS, Customer.class, msgs);
				return basicSetCustomerData((Customer)otherEnd, msgs);
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
			case InfOperationsPackage.TROUBLE_TICKET__CALL_BACKS:
				return ((InternalEList<?>)getCallBacks()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.TROUBLE_TICKET__INCIDENT_RECORD:
				return basicSetIncidentRecord(null, msgs);
			case InfOperationsPackage.TROUBLE_TICKET__CUSTOMER_DATA:
				return basicSetCustomerData(null, msgs);
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
			case InfOperationsPackage.TROUBLE_TICKET__FIRST_CALL_DATE_TIME:
				return getFirstCallDateTime();
			case InfOperationsPackage.TROUBLE_TICKET__CALL_BACKS:
				return getCallBacks();
			case InfOperationsPackage.TROUBLE_TICKET__CALL_BACK:
				return isCallBack();
			case InfOperationsPackage.TROUBLE_TICKET__INCIDENT_RECORD:
				if (resolve) return getIncidentRecord();
				return basicGetIncidentRecord();
			case InfOperationsPackage.TROUBLE_TICKET__ESTIMATED_RESTORE_DATE_TIME:
				return getEstimatedRestoreDateTime();
			case InfOperationsPackage.TROUBLE_TICKET__REPORTING_KIND:
				return getReportingKind();
			case InfOperationsPackage.TROUBLE_TICKET__PRIORITY:
				return getPriority();
			case InfOperationsPackage.TROUBLE_TICKET__CUSTOMER_DATA:
				if (resolve) return getCustomerData();
				return basicGetCustomerData();
			case InfOperationsPackage.TROUBLE_TICKET__INFORM_BEFORE_RESTORED:
				return isInformBeforeRestored();
			case InfOperationsPackage.TROUBLE_TICKET__ADVICE:
				return getAdvice();
			case InfOperationsPackage.TROUBLE_TICKET__INFORM_AFTER_RESTORED:
				return isInformAfterRestored();
			case InfOperationsPackage.TROUBLE_TICKET__HAZARD_CODE:
				return getHazardCode();
			case InfOperationsPackage.TROUBLE_TICKET__TROUBLE_PERIOD:
				if (resolve) return getTroublePeriod();
				return basicGetTroublePeriod();
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
			case InfOperationsPackage.TROUBLE_TICKET__FIRST_CALL_DATE_TIME:
				setFirstCallDateTime((Date)newValue);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__CALL_BACKS:
				getCallBacks().clear();
				getCallBacks().addAll((Collection<? extends CallBack>)newValue);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__CALL_BACK:
				setCallBack((Boolean)newValue);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__INCIDENT_RECORD:
				setIncidentRecord((IncidentRecord)newValue);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__ESTIMATED_RESTORE_DATE_TIME:
				setEstimatedRestoreDateTime((Date)newValue);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__REPORTING_KIND:
				setReportingKind((TroubleReportingKind)newValue);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__PRIORITY:
				setPriority((String)newValue);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__CUSTOMER_DATA:
				setCustomerData((Customer)newValue);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__INFORM_BEFORE_RESTORED:
				setInformBeforeRestored((Boolean)newValue);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__ADVICE:
				setAdvice((String)newValue);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__INFORM_AFTER_RESTORED:
				setInformAfterRestored((Boolean)newValue);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__HAZARD_CODE:
				setHazardCode((String)newValue);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__TROUBLE_PERIOD:
				setTroublePeriod((DateTimeInterval)newValue);
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
			case InfOperationsPackage.TROUBLE_TICKET__FIRST_CALL_DATE_TIME:
				setFirstCallDateTime(FIRST_CALL_DATE_TIME_EDEFAULT);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__CALL_BACKS:
				getCallBacks().clear();
				return;
			case InfOperationsPackage.TROUBLE_TICKET__CALL_BACK:
				setCallBack(CALL_BACK_EDEFAULT);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__INCIDENT_RECORD:
				setIncidentRecord((IncidentRecord)null);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__ESTIMATED_RESTORE_DATE_TIME:
				setEstimatedRestoreDateTime(ESTIMATED_RESTORE_DATE_TIME_EDEFAULT);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__REPORTING_KIND:
				setReportingKind(REPORTING_KIND_EDEFAULT);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__CUSTOMER_DATA:
				setCustomerData((Customer)null);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__INFORM_BEFORE_RESTORED:
				setInformBeforeRestored(INFORM_BEFORE_RESTORED_EDEFAULT);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__ADVICE:
				setAdvice(ADVICE_EDEFAULT);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__INFORM_AFTER_RESTORED:
				setInformAfterRestored(INFORM_AFTER_RESTORED_EDEFAULT);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__HAZARD_CODE:
				setHazardCode(HAZARD_CODE_EDEFAULT);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__TROUBLE_PERIOD:
				setTroublePeriod((DateTimeInterval)null);
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
			case InfOperationsPackage.TROUBLE_TICKET__FIRST_CALL_DATE_TIME:
				return FIRST_CALL_DATE_TIME_EDEFAULT == null ? firstCallDateTime != null : !FIRST_CALL_DATE_TIME_EDEFAULT.equals(firstCallDateTime);
			case InfOperationsPackage.TROUBLE_TICKET__CALL_BACKS:
				return callBacks != null && !callBacks.isEmpty();
			case InfOperationsPackage.TROUBLE_TICKET__CALL_BACK:
				return callBack != CALL_BACK_EDEFAULT;
			case InfOperationsPackage.TROUBLE_TICKET__INCIDENT_RECORD:
				return incidentRecord != null;
			case InfOperationsPackage.TROUBLE_TICKET__ESTIMATED_RESTORE_DATE_TIME:
				return ESTIMATED_RESTORE_DATE_TIME_EDEFAULT == null ? estimatedRestoreDateTime != null : !ESTIMATED_RESTORE_DATE_TIME_EDEFAULT.equals(estimatedRestoreDateTime);
			case InfOperationsPackage.TROUBLE_TICKET__REPORTING_KIND:
				return reportingKind != REPORTING_KIND_EDEFAULT;
			case InfOperationsPackage.TROUBLE_TICKET__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case InfOperationsPackage.TROUBLE_TICKET__CUSTOMER_DATA:
				return customerData != null;
			case InfOperationsPackage.TROUBLE_TICKET__INFORM_BEFORE_RESTORED:
				return informBeforeRestored != INFORM_BEFORE_RESTORED_EDEFAULT;
			case InfOperationsPackage.TROUBLE_TICKET__ADVICE:
				return ADVICE_EDEFAULT == null ? advice != null : !ADVICE_EDEFAULT.equals(advice);
			case InfOperationsPackage.TROUBLE_TICKET__INFORM_AFTER_RESTORED:
				return informAfterRestored != INFORM_AFTER_RESTORED_EDEFAULT;
			case InfOperationsPackage.TROUBLE_TICKET__HAZARD_CODE:
				return HAZARD_CODE_EDEFAULT == null ? hazardCode != null : !HAZARD_CODE_EDEFAULT.equals(hazardCode);
			case InfOperationsPackage.TROUBLE_TICKET__TROUBLE_PERIOD:
				return troublePeriod != null;
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
		result.append(" (firstCallDateTime: ");
		result.append(firstCallDateTime);
		result.append(", callBack: ");
		result.append(callBack);
		result.append(", estimatedRestoreDateTime: ");
		result.append(estimatedRestoreDateTime);
		result.append(", reportingKind: ");
		result.append(reportingKind);
		result.append(", priority: ");
		result.append(priority);
		result.append(", informBeforeRestored: ");
		result.append(informBeforeRestored);
		result.append(", advice: ");
		result.append(advice);
		result.append(", informAfterRestored: ");
		result.append(informAfterRestored);
		result.append(", hazardCode: ");
		result.append(hazardCode);
		result.append(')');
		return result.toString();
	}

} //TroubleTicketImpl
