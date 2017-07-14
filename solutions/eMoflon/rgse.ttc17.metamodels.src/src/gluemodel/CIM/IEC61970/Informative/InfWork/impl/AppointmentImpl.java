/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork.impl;

import gluemodel.CIM.IEC61968.Common.DateTimeInterval;
import gluemodel.CIM.IEC61968.Common.StreetAddress;

import gluemodel.CIM.IEC61970.Informative.InfCommon.impl.ScheduledEventImpl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack;
import gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;

import gluemodel.CIM.IEC61970.Informative.InfWork.Appointment;
import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Appointment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.AppointmentImpl#getRemark <em>Remark</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.AppointmentImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.AppointmentImpl#getCallBack <em>Call Back</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.AppointmentImpl#getMeetingInterval <em>Meeting Interval</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.AppointmentImpl#getErpPersons <em>Erp Persons</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.AppointmentImpl#isCallAhead <em>Call Ahead</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppointmentImpl extends ScheduledEventImpl implements Appointment {
	/**
	 * The default value of the '{@link #getRemark() <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemark()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemark() <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemark()
	 * @generated
	 * @ordered
	 */
	protected String remark = REMARK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected StreetAddress address;

	/**
	 * The cached value of the '{@link #getCallBack() <em>Call Back</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallBack()
	 * @generated
	 * @ordered
	 */
	protected CallBack callBack;

	/**
	 * The cached value of the '{@link #getMeetingInterval() <em>Meeting Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeetingInterval()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval meetingInterval;

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
	 * The default value of the '{@link #isCallAhead() <em>Call Ahead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallAhead()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALL_AHEAD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCallAhead() <em>Call Ahead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallAhead()
	 * @generated
	 * @ordered
	 */
	protected boolean callAhead = CALL_AHEAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppointmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.APPOINTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemark(String newRemark) {
		String oldRemark = remark;
		remark = newRemark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.APPOINTMENT__REMARK, oldRemark, remark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreetAddress getAddress() {
		if (address != null && address.eIsProxy()) {
			InternalEObject oldAddress = (InternalEObject)address;
			address = (StreetAddress)eResolveProxy(oldAddress);
			if (address != oldAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.APPOINTMENT__ADDRESS, oldAddress, address));
			}
		}
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreetAddress basicGetAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(StreetAddress newAddress) {
		StreetAddress oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.APPOINTMENT__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallBack getCallBack() {
		if (callBack != null && callBack.eIsProxy()) {
			InternalEObject oldCallBack = (InternalEObject)callBack;
			callBack = (CallBack)eResolveProxy(oldCallBack);
			if (callBack != oldCallBack) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.APPOINTMENT__CALL_BACK, oldCallBack, callBack));
			}
		}
		return callBack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallBack basicGetCallBack() {
		return callBack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallBack(CallBack newCallBack, NotificationChain msgs) {
		CallBack oldCallBack = callBack;
		callBack = newCallBack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.APPOINTMENT__CALL_BACK, oldCallBack, newCallBack);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallBack(CallBack newCallBack) {
		if (newCallBack != callBack) {
			NotificationChain msgs = null;
			if (callBack != null)
				msgs = ((InternalEObject)callBack).eInverseRemove(this, InfOperationsPackage.CALL_BACK__APPOINTMENTS, CallBack.class, msgs);
			if (newCallBack != null)
				msgs = ((InternalEObject)newCallBack).eInverseAdd(this, InfOperationsPackage.CALL_BACK__APPOINTMENTS, CallBack.class, msgs);
			msgs = basicSetCallBack(newCallBack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.APPOINTMENT__CALL_BACK, newCallBack, newCallBack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval getMeetingInterval() {
		if (meetingInterval != null && meetingInterval.eIsProxy()) {
			InternalEObject oldMeetingInterval = (InternalEObject)meetingInterval;
			meetingInterval = (DateTimeInterval)eResolveProxy(oldMeetingInterval);
			if (meetingInterval != oldMeetingInterval) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.APPOINTMENT__MEETING_INTERVAL, oldMeetingInterval, meetingInterval));
			}
		}
		return meetingInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval basicGetMeetingInterval() {
		return meetingInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeetingInterval(DateTimeInterval newMeetingInterval) {
		DateTimeInterval oldMeetingInterval = meetingInterval;
		meetingInterval = newMeetingInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.APPOINTMENT__MEETING_INTERVAL, oldMeetingInterval, meetingInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpPerson> getErpPersons() {
		if (erpPersons == null) {
			erpPersons = new EObjectWithInverseResolvingEList.ManyInverse<ErpPerson>(ErpPerson.class, this, InfWorkPackage.APPOINTMENT__ERP_PERSONS, InfERPSupportPackage.ERP_PERSON__APPOINTMENTS);
		}
		return erpPersons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCallAhead() {
		return callAhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallAhead(boolean newCallAhead) {
		boolean oldCallAhead = callAhead;
		callAhead = newCallAhead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.APPOINTMENT__CALL_AHEAD, oldCallAhead, callAhead));
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
			case InfWorkPackage.APPOINTMENT__CALL_BACK:
				if (callBack != null)
					msgs = ((InternalEObject)callBack).eInverseRemove(this, InfOperationsPackage.CALL_BACK__APPOINTMENTS, CallBack.class, msgs);
				return basicSetCallBack((CallBack)otherEnd, msgs);
			case InfWorkPackage.APPOINTMENT__ERP_PERSONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPersons()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.APPOINTMENT__CALL_BACK:
				return basicSetCallBack(null, msgs);
			case InfWorkPackage.APPOINTMENT__ERP_PERSONS:
				return ((InternalEList<?>)getErpPersons()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.APPOINTMENT__REMARK:
				return getRemark();
			case InfWorkPackage.APPOINTMENT__ADDRESS:
				if (resolve) return getAddress();
				return basicGetAddress();
			case InfWorkPackage.APPOINTMENT__CALL_BACK:
				if (resolve) return getCallBack();
				return basicGetCallBack();
			case InfWorkPackage.APPOINTMENT__MEETING_INTERVAL:
				if (resolve) return getMeetingInterval();
				return basicGetMeetingInterval();
			case InfWorkPackage.APPOINTMENT__ERP_PERSONS:
				return getErpPersons();
			case InfWorkPackage.APPOINTMENT__CALL_AHEAD:
				return isCallAhead();
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
			case InfWorkPackage.APPOINTMENT__REMARK:
				setRemark((String)newValue);
				return;
			case InfWorkPackage.APPOINTMENT__ADDRESS:
				setAddress((StreetAddress)newValue);
				return;
			case InfWorkPackage.APPOINTMENT__CALL_BACK:
				setCallBack((CallBack)newValue);
				return;
			case InfWorkPackage.APPOINTMENT__MEETING_INTERVAL:
				setMeetingInterval((DateTimeInterval)newValue);
				return;
			case InfWorkPackage.APPOINTMENT__ERP_PERSONS:
				getErpPersons().clear();
				getErpPersons().addAll((Collection<? extends ErpPerson>)newValue);
				return;
			case InfWorkPackage.APPOINTMENT__CALL_AHEAD:
				setCallAhead((Boolean)newValue);
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
			case InfWorkPackage.APPOINTMENT__REMARK:
				setRemark(REMARK_EDEFAULT);
				return;
			case InfWorkPackage.APPOINTMENT__ADDRESS:
				setAddress((StreetAddress)null);
				return;
			case InfWorkPackage.APPOINTMENT__CALL_BACK:
				setCallBack((CallBack)null);
				return;
			case InfWorkPackage.APPOINTMENT__MEETING_INTERVAL:
				setMeetingInterval((DateTimeInterval)null);
				return;
			case InfWorkPackage.APPOINTMENT__ERP_PERSONS:
				getErpPersons().clear();
				return;
			case InfWorkPackage.APPOINTMENT__CALL_AHEAD:
				setCallAhead(CALL_AHEAD_EDEFAULT);
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
			case InfWorkPackage.APPOINTMENT__REMARK:
				return REMARK_EDEFAULT == null ? remark != null : !REMARK_EDEFAULT.equals(remark);
			case InfWorkPackage.APPOINTMENT__ADDRESS:
				return address != null;
			case InfWorkPackage.APPOINTMENT__CALL_BACK:
				return callBack != null;
			case InfWorkPackage.APPOINTMENT__MEETING_INTERVAL:
				return meetingInterval != null;
			case InfWorkPackage.APPOINTMENT__ERP_PERSONS:
				return erpPersons != null && !erpPersons.isEmpty();
			case InfWorkPackage.APPOINTMENT__CALL_AHEAD:
				return callAhead != CALL_AHEAD_EDEFAULT;
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
		result.append(" (remark: ");
		result.append(remark);
		result.append(", callAhead: ");
		result.append(callAhead);
		result.append(')');
		return result.toString();
	}

} //AppointmentImpl
