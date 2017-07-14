/**
 */
package gluemodel.CIM.IEC61970.Informative.InfCommon.impl;

import gluemodel.CIM.IEC61968.Common.CommonPackage;
import gluemodel.CIM.IEC61968.Common.DateTimeInterval;
import gluemodel.CIM.IEC61968.Common.Document;
import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage;
import gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduleParameterInfo;
import gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent;

import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import gluemodel.CIM.IEC61970.Informative.InfWork.InspectionDataSet;

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
 * An implementation of the model object '<em><b>Schedule Parameter Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.impl.ScheduleParameterInfoImpl#getScheduledEvents <em>Scheduled Events</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.impl.ScheduleParameterInfoImpl#getRequestedWindow <em>Requested Window</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.impl.ScheduleParameterInfoImpl#getForInspectionDataSet <em>For Inspection Data Set</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.impl.ScheduleParameterInfoImpl#getEstimatedWindow <em>Estimated Window</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.impl.ScheduleParameterInfoImpl#getDocuments <em>Documents</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.impl.ScheduleParameterInfoImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduleParameterInfoImpl extends IdentifiedObjectImpl implements ScheduleParameterInfo {
	/**
	 * The cached value of the '{@link #getScheduledEvents() <em>Scheduled Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<ScheduledEvent> scheduledEvents;

	/**
	 * The cached value of the '{@link #getRequestedWindow() <em>Requested Window</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedWindow()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval requestedWindow;

	/**
	 * The cached value of the '{@link #getForInspectionDataSet() <em>For Inspection Data Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForInspectionDataSet()
	 * @generated
	 * @ordered
	 */
	protected InspectionDataSet forInspectionDataSet;

	/**
	 * The cached value of the '{@link #getEstimatedWindow() <em>Estimated Window</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedWindow()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval estimatedWindow;

	/**
	 * The cached value of the '{@link #getDocuments() <em>Documents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<Document> documents;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleParameterInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCommonPackage.Literals.SCHEDULE_PARAMETER_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScheduledEvent> getScheduledEvents() {
		if (scheduledEvents == null) {
			scheduledEvents = new EObjectWithInverseResolvingEList<ScheduledEvent>(ScheduledEvent.class, this, InfCommonPackage.SCHEDULE_PARAMETER_INFO__SCHEDULED_EVENTS, InfCommonPackage.SCHEDULED_EVENT__SCHEDULE_PARAMETER_INFO);
		}
		return scheduledEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval getRequestedWindow() {
		if (requestedWindow != null && requestedWindow.eIsProxy()) {
			InternalEObject oldRequestedWindow = (InternalEObject)requestedWindow;
			requestedWindow = (DateTimeInterval)eResolveProxy(oldRequestedWindow);
			if (requestedWindow != oldRequestedWindow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfCommonPackage.SCHEDULE_PARAMETER_INFO__REQUESTED_WINDOW, oldRequestedWindow, requestedWindow));
			}
		}
		return requestedWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval basicGetRequestedWindow() {
		return requestedWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestedWindow(DateTimeInterval newRequestedWindow) {
		DateTimeInterval oldRequestedWindow = requestedWindow;
		requestedWindow = newRequestedWindow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.SCHEDULE_PARAMETER_INFO__REQUESTED_WINDOW, oldRequestedWindow, requestedWindow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InspectionDataSet getForInspectionDataSet() {
		if (forInspectionDataSet != null && forInspectionDataSet.eIsProxy()) {
			InternalEObject oldForInspectionDataSet = (InternalEObject)forInspectionDataSet;
			forInspectionDataSet = (InspectionDataSet)eResolveProxy(oldForInspectionDataSet);
			if (forInspectionDataSet != oldForInspectionDataSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfCommonPackage.SCHEDULE_PARAMETER_INFO__FOR_INSPECTION_DATA_SET, oldForInspectionDataSet, forInspectionDataSet));
			}
		}
		return forInspectionDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InspectionDataSet basicGetForInspectionDataSet() {
		return forInspectionDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForInspectionDataSet(InspectionDataSet newForInspectionDataSet, NotificationChain msgs) {
		InspectionDataSet oldForInspectionDataSet = forInspectionDataSet;
		forInspectionDataSet = newForInspectionDataSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfCommonPackage.SCHEDULE_PARAMETER_INFO__FOR_INSPECTION_DATA_SET, oldForInspectionDataSet, newForInspectionDataSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForInspectionDataSet(InspectionDataSet newForInspectionDataSet) {
		if (newForInspectionDataSet != forInspectionDataSet) {
			NotificationChain msgs = null;
			if (forInspectionDataSet != null)
				msgs = ((InternalEObject)forInspectionDataSet).eInverseRemove(this, InfWorkPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES, InspectionDataSet.class, msgs);
			if (newForInspectionDataSet != null)
				msgs = ((InternalEObject)newForInspectionDataSet).eInverseAdd(this, InfWorkPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES, InspectionDataSet.class, msgs);
			msgs = basicSetForInspectionDataSet(newForInspectionDataSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.SCHEDULE_PARAMETER_INFO__FOR_INSPECTION_DATA_SET, newForInspectionDataSet, newForInspectionDataSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval getEstimatedWindow() {
		if (estimatedWindow != null && estimatedWindow.eIsProxy()) {
			InternalEObject oldEstimatedWindow = (InternalEObject)estimatedWindow;
			estimatedWindow = (DateTimeInterval)eResolveProxy(oldEstimatedWindow);
			if (estimatedWindow != oldEstimatedWindow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfCommonPackage.SCHEDULE_PARAMETER_INFO__ESTIMATED_WINDOW, oldEstimatedWindow, estimatedWindow));
			}
		}
		return estimatedWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval basicGetEstimatedWindow() {
		return estimatedWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatedWindow(DateTimeInterval newEstimatedWindow) {
		DateTimeInterval oldEstimatedWindow = estimatedWindow;
		estimatedWindow = newEstimatedWindow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.SCHEDULE_PARAMETER_INFO__ESTIMATED_WINDOW, oldEstimatedWindow, estimatedWindow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Document> getDocuments() {
		if (documents == null) {
			documents = new EObjectWithInverseResolvingEList.ManyInverse<Document>(Document.class, this, InfCommonPackage.SCHEDULE_PARAMETER_INFO__DOCUMENTS, CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS);
		}
		return documents;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfCommonPackage.SCHEDULE_PARAMETER_INFO__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.SCHEDULE_PARAMETER_INFO__STATUS, oldStatus, status));
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
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__SCHEDULED_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScheduledEvents()).basicAdd(otherEnd, msgs);
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__FOR_INSPECTION_DATA_SET:
				if (forInspectionDataSet != null)
					msgs = ((InternalEObject)forInspectionDataSet).eInverseRemove(this, InfWorkPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES, InspectionDataSet.class, msgs);
				return basicSetForInspectionDataSet((InspectionDataSet)otherEnd, msgs);
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__DOCUMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocuments()).basicAdd(otherEnd, msgs);
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
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__SCHEDULED_EVENTS:
				return ((InternalEList<?>)getScheduledEvents()).basicRemove(otherEnd, msgs);
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__FOR_INSPECTION_DATA_SET:
				return basicSetForInspectionDataSet(null, msgs);
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__DOCUMENTS:
				return ((InternalEList<?>)getDocuments()).basicRemove(otherEnd, msgs);
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
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__SCHEDULED_EVENTS:
				return getScheduledEvents();
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__REQUESTED_WINDOW:
				if (resolve) return getRequestedWindow();
				return basicGetRequestedWindow();
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__FOR_INSPECTION_DATA_SET:
				if (resolve) return getForInspectionDataSet();
				return basicGetForInspectionDataSet();
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__ESTIMATED_WINDOW:
				if (resolve) return getEstimatedWindow();
				return basicGetEstimatedWindow();
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__DOCUMENTS:
				return getDocuments();
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
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
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__SCHEDULED_EVENTS:
				getScheduledEvents().clear();
				getScheduledEvents().addAll((Collection<? extends ScheduledEvent>)newValue);
				return;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__REQUESTED_WINDOW:
				setRequestedWindow((DateTimeInterval)newValue);
				return;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__FOR_INSPECTION_DATA_SET:
				setForInspectionDataSet((InspectionDataSet)newValue);
				return;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__ESTIMATED_WINDOW:
				setEstimatedWindow((DateTimeInterval)newValue);
				return;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__DOCUMENTS:
				getDocuments().clear();
				getDocuments().addAll((Collection<? extends Document>)newValue);
				return;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__STATUS:
				setStatus((Status)newValue);
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
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__SCHEDULED_EVENTS:
				getScheduledEvents().clear();
				return;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__REQUESTED_WINDOW:
				setRequestedWindow((DateTimeInterval)null);
				return;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__FOR_INSPECTION_DATA_SET:
				setForInspectionDataSet((InspectionDataSet)null);
				return;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__ESTIMATED_WINDOW:
				setEstimatedWindow((DateTimeInterval)null);
				return;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__DOCUMENTS:
				getDocuments().clear();
				return;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__STATUS:
				setStatus((Status)null);
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
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__SCHEDULED_EVENTS:
				return scheduledEvents != null && !scheduledEvents.isEmpty();
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__REQUESTED_WINDOW:
				return requestedWindow != null;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__FOR_INSPECTION_DATA_SET:
				return forInspectionDataSet != null;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__ESTIMATED_WINDOW:
				return estimatedWindow != null;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__DOCUMENTS:
				return documents != null && !documents.isEmpty();
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__STATUS:
				return status != null;
		}
		return super.eIsSet(featureID);
	}

} //ScheduleParameterInfoImpl
