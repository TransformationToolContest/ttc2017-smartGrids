/**
 */
package gluemodel.CIM.IEC61970.Informative.InfOperations.impl;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack;
import gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket;

import gluemodel.CIM.IEC61970.Informative.InfWork.Appointment;
import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;

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
 * An implementation of the model object '<em><b>Call Back</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.CallBackImpl#getAdvice <em>Advice</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.CallBackImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.CallBackImpl#getErpPersons <em>Erp Persons</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.CallBackImpl#getProblemInfo <em>Problem Info</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.CallBackImpl#getContactDetail <em>Contact Detail</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.CallBackImpl#getAppointments <em>Appointments</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.CallBackImpl#getTroubleTickets <em>Trouble Tickets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.CallBackImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.CallBackImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallBackImpl extends IdentifiedObjectImpl implements CallBack {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The cached value of the '{@link #getErpPersons() <em>Erp Persons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpPerson> erpPersons;

	/**
	 * The default value of the '{@link #getProblemInfo() <em>Problem Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String PROBLEM_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProblemInfo() <em>Problem Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemInfo()
	 * @generated
	 * @ordered
	 */
	protected String problemInfo = PROBLEM_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactDetail() <em>Contact Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactDetail()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_DETAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactDetail() <em>Contact Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactDetail()
	 * @generated
	 * @ordered
	 */
	protected String contactDetail = CONTACT_DETAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAppointments() <em>Appointments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointments()
	 * @generated
	 * @ordered
	 */
	protected EList<Appointment> appointments;

	/**
	 * The cached value of the '{@link #getTroubleTickets() <em>Trouble Tickets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTroubleTickets()
	 * @generated
	 * @ordered
	 */
	protected EList<TroubleTicket> troubleTickets;

	/**
	 * The default value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date dateTime = DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallBackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.CALL_BACK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.CALL_BACK__ADVICE, oldAdvice, advice));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.CALL_BACK__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.CALL_BACK__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpPerson> getErpPersons() {
		if (erpPersons == null) {
			erpPersons = new EObjectWithInverseResolvingEList.ManyInverse<ErpPerson>(ErpPerson.class, this, InfOperationsPackage.CALL_BACK__ERP_PERSONS, InfERPSupportPackage.ERP_PERSON__CALL_BACKS);
		}
		return erpPersons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProblemInfo() {
		return problemInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblemInfo(String newProblemInfo) {
		String oldProblemInfo = problemInfo;
		problemInfo = newProblemInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.CALL_BACK__PROBLEM_INFO, oldProblemInfo, problemInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContactDetail() {
		return contactDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactDetail(String newContactDetail) {
		String oldContactDetail = contactDetail;
		contactDetail = newContactDetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.CALL_BACK__CONTACT_DETAIL, oldContactDetail, contactDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Appointment> getAppointments() {
		if (appointments == null) {
			appointments = new EObjectWithInverseResolvingEList<Appointment>(Appointment.class, this, InfOperationsPackage.CALL_BACK__APPOINTMENTS, InfWorkPackage.APPOINTMENT__CALL_BACK);
		}
		return appointments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TroubleTicket> getTroubleTickets() {
		if (troubleTickets == null) {
			troubleTickets = new EObjectWithInverseResolvingEList.ManyInverse<TroubleTicket>(TroubleTicket.class, this, InfOperationsPackage.CALL_BACK__TROUBLE_TICKETS, InfOperationsPackage.TROUBLE_TICKET__CALL_BACKS);
		}
		return troubleTickets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(Date newDateTime) {
		Date oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.CALL_BACK__DATE_TIME, oldDateTime, dateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.CALL_BACK__COMMENT, oldComment, comment));
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
			case InfOperationsPackage.CALL_BACK__ERP_PERSONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPersons()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.CALL_BACK__APPOINTMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAppointments()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.CALL_BACK__TROUBLE_TICKETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTroubleTickets()).basicAdd(otherEnd, msgs);
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
			case InfOperationsPackage.CALL_BACK__ERP_PERSONS:
				return ((InternalEList<?>)getErpPersons()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.CALL_BACK__APPOINTMENTS:
				return ((InternalEList<?>)getAppointments()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.CALL_BACK__TROUBLE_TICKETS:
				return ((InternalEList<?>)getTroubleTickets()).basicRemove(otherEnd, msgs);
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
			case InfOperationsPackage.CALL_BACK__ADVICE:
				return getAdvice();
			case InfOperationsPackage.CALL_BACK__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfOperationsPackage.CALL_BACK__ERP_PERSONS:
				return getErpPersons();
			case InfOperationsPackage.CALL_BACK__PROBLEM_INFO:
				return getProblemInfo();
			case InfOperationsPackage.CALL_BACK__CONTACT_DETAIL:
				return getContactDetail();
			case InfOperationsPackage.CALL_BACK__APPOINTMENTS:
				return getAppointments();
			case InfOperationsPackage.CALL_BACK__TROUBLE_TICKETS:
				return getTroubleTickets();
			case InfOperationsPackage.CALL_BACK__DATE_TIME:
				return getDateTime();
			case InfOperationsPackage.CALL_BACK__COMMENT:
				return getComment();
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
			case InfOperationsPackage.CALL_BACK__ADVICE:
				setAdvice((String)newValue);
				return;
			case InfOperationsPackage.CALL_BACK__STATUS:
				setStatus((Status)newValue);
				return;
			case InfOperationsPackage.CALL_BACK__ERP_PERSONS:
				getErpPersons().clear();
				getErpPersons().addAll((Collection<? extends ErpPerson>)newValue);
				return;
			case InfOperationsPackage.CALL_BACK__PROBLEM_INFO:
				setProblemInfo((String)newValue);
				return;
			case InfOperationsPackage.CALL_BACK__CONTACT_DETAIL:
				setContactDetail((String)newValue);
				return;
			case InfOperationsPackage.CALL_BACK__APPOINTMENTS:
				getAppointments().clear();
				getAppointments().addAll((Collection<? extends Appointment>)newValue);
				return;
			case InfOperationsPackage.CALL_BACK__TROUBLE_TICKETS:
				getTroubleTickets().clear();
				getTroubleTickets().addAll((Collection<? extends TroubleTicket>)newValue);
				return;
			case InfOperationsPackage.CALL_BACK__DATE_TIME:
				setDateTime((Date)newValue);
				return;
			case InfOperationsPackage.CALL_BACK__COMMENT:
				setComment((String)newValue);
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
			case InfOperationsPackage.CALL_BACK__ADVICE:
				setAdvice(ADVICE_EDEFAULT);
				return;
			case InfOperationsPackage.CALL_BACK__STATUS:
				setStatus((Status)null);
				return;
			case InfOperationsPackage.CALL_BACK__ERP_PERSONS:
				getErpPersons().clear();
				return;
			case InfOperationsPackage.CALL_BACK__PROBLEM_INFO:
				setProblemInfo(PROBLEM_INFO_EDEFAULT);
				return;
			case InfOperationsPackage.CALL_BACK__CONTACT_DETAIL:
				setContactDetail(CONTACT_DETAIL_EDEFAULT);
				return;
			case InfOperationsPackage.CALL_BACK__APPOINTMENTS:
				getAppointments().clear();
				return;
			case InfOperationsPackage.CALL_BACK__TROUBLE_TICKETS:
				getTroubleTickets().clear();
				return;
			case InfOperationsPackage.CALL_BACK__DATE_TIME:
				setDateTime(DATE_TIME_EDEFAULT);
				return;
			case InfOperationsPackage.CALL_BACK__COMMENT:
				setComment(COMMENT_EDEFAULT);
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
			case InfOperationsPackage.CALL_BACK__ADVICE:
				return ADVICE_EDEFAULT == null ? advice != null : !ADVICE_EDEFAULT.equals(advice);
			case InfOperationsPackage.CALL_BACK__STATUS:
				return status != null;
			case InfOperationsPackage.CALL_BACK__ERP_PERSONS:
				return erpPersons != null && !erpPersons.isEmpty();
			case InfOperationsPackage.CALL_BACK__PROBLEM_INFO:
				return PROBLEM_INFO_EDEFAULT == null ? problemInfo != null : !PROBLEM_INFO_EDEFAULT.equals(problemInfo);
			case InfOperationsPackage.CALL_BACK__CONTACT_DETAIL:
				return CONTACT_DETAIL_EDEFAULT == null ? contactDetail != null : !CONTACT_DETAIL_EDEFAULT.equals(contactDetail);
			case InfOperationsPackage.CALL_BACK__APPOINTMENTS:
				return appointments != null && !appointments.isEmpty();
			case InfOperationsPackage.CALL_BACK__TROUBLE_TICKETS:
				return troubleTickets != null && !troubleTickets.isEmpty();
			case InfOperationsPackage.CALL_BACK__DATE_TIME:
				return DATE_TIME_EDEFAULT == null ? dateTime != null : !DATE_TIME_EDEFAULT.equals(dateTime);
			case InfOperationsPackage.CALL_BACK__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
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
		result.append(" (advice: ");
		result.append(advice);
		result.append(", problemInfo: ");
		result.append(problemInfo);
		result.append(", contactDetail: ");
		result.append(contactDetail);
		result.append(", dateTime: ");
		result.append(dateTime);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //CallBackImpl
