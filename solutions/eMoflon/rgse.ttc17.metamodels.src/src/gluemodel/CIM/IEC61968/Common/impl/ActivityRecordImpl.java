/**
 */
package gluemodel.CIM.IEC61968.Common.impl;

import gluemodel.CIM.IEC61968.Assets.Asset;
import gluemodel.CIM.IEC61968.Assets.AssetsPackage;

import gluemodel.CIM.IEC61968.Common.ActivityRecord;
import gluemodel.CIM.IEC61968.Common.CommonPackage;
import gluemodel.CIM.IEC61968.Common.Document;
import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage;
import gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketFactors;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.ActivityRecordImpl#getMarketFactors <em>Market Factors</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.ActivityRecordImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.ActivityRecordImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.ActivityRecordImpl#getScheduledEvent <em>Scheduled Event</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.ActivityRecordImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.ActivityRecordImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.ActivityRecordImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.ActivityRecordImpl#getDocuments <em>Documents</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.ActivityRecordImpl#getOrganisations <em>Organisations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.ActivityRecordImpl#getCreatedDateTime <em>Created Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.ActivityRecordImpl#getErpPersons <em>Erp Persons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityRecordImpl extends IdentifiedObjectImpl implements ActivityRecord {
	/**
	 * The cached value of the '{@link #getMarketFactors() <em>Market Factors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketFactors()
	 * @generated
	 * @ordered
	 */
	protected EList<MarketFactors> marketFactors;

	/**
	 * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> assets;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final String SEVERITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected String severity = SEVERITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScheduledEvent() <em>Scheduled Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledEvent()
	 * @generated
	 * @ordered
	 */
	protected ScheduledEvent scheduledEvent;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected String reason = REASON_EDEFAULT;

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
	 * The cached value of the '{@link #getDocuments() <em>Documents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<Document> documents;

	/**
	 * The cached value of the '{@link #getOrganisations() <em>Organisations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisations()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpOrganisation> organisations;

	/**
	 * The default value of the '{@link #getCreatedDateTime() <em>Created Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedDateTime() <em>Created Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date createdDateTime = CREATED_DATE_TIME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.ACTIVITY_RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MarketFactors> getMarketFactors() {
		if (marketFactors == null) {
			marketFactors = new EObjectResolvingEList<MarketFactors>(MarketFactors.class, this, CommonPackage.ACTIVITY_RECORD__MARKET_FACTORS);
		}
		return marketFactors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new EObjectWithInverseResolvingEList.ManyInverse<Asset>(Asset.class, this, CommonPackage.ACTIVITY_RECORD__ASSETS, AssetsPackage.ASSET__ACTIVITY_RECORDS);
		}
		return assets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(String newSeverity) {
		String oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ACTIVITY_RECORD__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduledEvent getScheduledEvent() {
		if (scheduledEvent != null && scheduledEvent.eIsProxy()) {
			InternalEObject oldScheduledEvent = (InternalEObject)scheduledEvent;
			scheduledEvent = (ScheduledEvent)eResolveProxy(oldScheduledEvent);
			if (scheduledEvent != oldScheduledEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT, oldScheduledEvent, scheduledEvent));
			}
		}
		return scheduledEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduledEvent basicGetScheduledEvent() {
		return scheduledEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduledEvent(ScheduledEvent newScheduledEvent, NotificationChain msgs) {
		ScheduledEvent oldScheduledEvent = scheduledEvent;
		scheduledEvent = newScheduledEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT, oldScheduledEvent, newScheduledEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledEvent(ScheduledEvent newScheduledEvent) {
		if (newScheduledEvent != scheduledEvent) {
			NotificationChain msgs = null;
			if (scheduledEvent != null)
				msgs = ((InternalEObject)scheduledEvent).eInverseRemove(this, InfCommonPackage.SCHEDULED_EVENT__ACTIVITY_RECORD, ScheduledEvent.class, msgs);
			if (newScheduledEvent != null)
				msgs = ((InternalEObject)newScheduledEvent).eInverseAdd(this, InfCommonPackage.SCHEDULED_EVENT__ACTIVITY_RECORD, ScheduledEvent.class, msgs);
			msgs = basicSetScheduledEvent(newScheduledEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT, newScheduledEvent, newScheduledEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ACTIVITY_RECORD__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(String newReason) {
		String oldReason = reason;
		reason = newReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ACTIVITY_RECORD__REASON, oldReason, reason));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.ACTIVITY_RECORD__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ACTIVITY_RECORD__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Document> getDocuments() {
		if (documents == null) {
			documents = new EObjectWithInverseResolvingEList.ManyInverse<Document>(Document.class, this, CommonPackage.ACTIVITY_RECORD__DOCUMENTS, CommonPackage.DOCUMENT__ACTIVITY_RECORDS);
		}
		return documents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpOrganisation> getOrganisations() {
		if (organisations == null) {
			organisations = new EObjectWithInverseResolvingEList.ManyInverse<ErpOrganisation>(ErpOrganisation.class, this, CommonPackage.ACTIVITY_RECORD__ORGANISATIONS, InfERPSupportPackage.ERP_ORGANISATION__ACTIVITY_RECORDS);
		}
		return organisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreatedDateTime() {
		return createdDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedDateTime(Date newCreatedDateTime) {
		Date oldCreatedDateTime = createdDateTime;
		createdDateTime = newCreatedDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ACTIVITY_RECORD__CREATED_DATE_TIME, oldCreatedDateTime, createdDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpPerson> getErpPersons() {
		if (erpPersons == null) {
			erpPersons = new EObjectWithInverseResolvingEList.ManyInverse<ErpPerson>(ErpPerson.class, this, CommonPackage.ACTIVITY_RECORD__ERP_PERSONS, InfERPSupportPackage.ERP_PERSON__ACTIVITY_RECORDS);
		}
		return erpPersons;
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
			case CommonPackage.ACTIVITY_RECORD__ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssets()).basicAdd(otherEnd, msgs);
			case CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT:
				if (scheduledEvent != null)
					msgs = ((InternalEObject)scheduledEvent).eInverseRemove(this, InfCommonPackage.SCHEDULED_EVENT__ACTIVITY_RECORD, ScheduledEvent.class, msgs);
				return basicSetScheduledEvent((ScheduledEvent)otherEnd, msgs);
			case CommonPackage.ACTIVITY_RECORD__DOCUMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocuments()).basicAdd(otherEnd, msgs);
			case CommonPackage.ACTIVITY_RECORD__ORGANISATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrganisations()).basicAdd(otherEnd, msgs);
			case CommonPackage.ACTIVITY_RECORD__ERP_PERSONS:
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
			case CommonPackage.ACTIVITY_RECORD__ASSETS:
				return ((InternalEList<?>)getAssets()).basicRemove(otherEnd, msgs);
			case CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT:
				return basicSetScheduledEvent(null, msgs);
			case CommonPackage.ACTIVITY_RECORD__DOCUMENTS:
				return ((InternalEList<?>)getDocuments()).basicRemove(otherEnd, msgs);
			case CommonPackage.ACTIVITY_RECORD__ORGANISATIONS:
				return ((InternalEList<?>)getOrganisations()).basicRemove(otherEnd, msgs);
			case CommonPackage.ACTIVITY_RECORD__ERP_PERSONS:
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
			case CommonPackage.ACTIVITY_RECORD__MARKET_FACTORS:
				return getMarketFactors();
			case CommonPackage.ACTIVITY_RECORD__ASSETS:
				return getAssets();
			case CommonPackage.ACTIVITY_RECORD__SEVERITY:
				return getSeverity();
			case CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT:
				if (resolve) return getScheduledEvent();
				return basicGetScheduledEvent();
			case CommonPackage.ACTIVITY_RECORD__CATEGORY:
				return getCategory();
			case CommonPackage.ACTIVITY_RECORD__REASON:
				return getReason();
			case CommonPackage.ACTIVITY_RECORD__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case CommonPackage.ACTIVITY_RECORD__DOCUMENTS:
				return getDocuments();
			case CommonPackage.ACTIVITY_RECORD__ORGANISATIONS:
				return getOrganisations();
			case CommonPackage.ACTIVITY_RECORD__CREATED_DATE_TIME:
				return getCreatedDateTime();
			case CommonPackage.ACTIVITY_RECORD__ERP_PERSONS:
				return getErpPersons();
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
			case CommonPackage.ACTIVITY_RECORD__MARKET_FACTORS:
				getMarketFactors().clear();
				getMarketFactors().addAll((Collection<? extends MarketFactors>)newValue);
				return;
			case CommonPackage.ACTIVITY_RECORD__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case CommonPackage.ACTIVITY_RECORD__SEVERITY:
				setSeverity((String)newValue);
				return;
			case CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT:
				setScheduledEvent((ScheduledEvent)newValue);
				return;
			case CommonPackage.ACTIVITY_RECORD__CATEGORY:
				setCategory((String)newValue);
				return;
			case CommonPackage.ACTIVITY_RECORD__REASON:
				setReason((String)newValue);
				return;
			case CommonPackage.ACTIVITY_RECORD__STATUS:
				setStatus((Status)newValue);
				return;
			case CommonPackage.ACTIVITY_RECORD__DOCUMENTS:
				getDocuments().clear();
				getDocuments().addAll((Collection<? extends Document>)newValue);
				return;
			case CommonPackage.ACTIVITY_RECORD__ORGANISATIONS:
				getOrganisations().clear();
				getOrganisations().addAll((Collection<? extends ErpOrganisation>)newValue);
				return;
			case CommonPackage.ACTIVITY_RECORD__CREATED_DATE_TIME:
				setCreatedDateTime((Date)newValue);
				return;
			case CommonPackage.ACTIVITY_RECORD__ERP_PERSONS:
				getErpPersons().clear();
				getErpPersons().addAll((Collection<? extends ErpPerson>)newValue);
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
			case CommonPackage.ACTIVITY_RECORD__MARKET_FACTORS:
				getMarketFactors().clear();
				return;
			case CommonPackage.ACTIVITY_RECORD__ASSETS:
				getAssets().clear();
				return;
			case CommonPackage.ACTIVITY_RECORD__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT:
				setScheduledEvent((ScheduledEvent)null);
				return;
			case CommonPackage.ACTIVITY_RECORD__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case CommonPackage.ACTIVITY_RECORD__REASON:
				setReason(REASON_EDEFAULT);
				return;
			case CommonPackage.ACTIVITY_RECORD__STATUS:
				setStatus((Status)null);
				return;
			case CommonPackage.ACTIVITY_RECORD__DOCUMENTS:
				getDocuments().clear();
				return;
			case CommonPackage.ACTIVITY_RECORD__ORGANISATIONS:
				getOrganisations().clear();
				return;
			case CommonPackage.ACTIVITY_RECORD__CREATED_DATE_TIME:
				setCreatedDateTime(CREATED_DATE_TIME_EDEFAULT);
				return;
			case CommonPackage.ACTIVITY_RECORD__ERP_PERSONS:
				getErpPersons().clear();
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
			case CommonPackage.ACTIVITY_RECORD__MARKET_FACTORS:
				return marketFactors != null && !marketFactors.isEmpty();
			case CommonPackage.ACTIVITY_RECORD__ASSETS:
				return assets != null && !assets.isEmpty();
			case CommonPackage.ACTIVITY_RECORD__SEVERITY:
				return SEVERITY_EDEFAULT == null ? severity != null : !SEVERITY_EDEFAULT.equals(severity);
			case CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT:
				return scheduledEvent != null;
			case CommonPackage.ACTIVITY_RECORD__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case CommonPackage.ACTIVITY_RECORD__REASON:
				return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
			case CommonPackage.ACTIVITY_RECORD__STATUS:
				return status != null;
			case CommonPackage.ACTIVITY_RECORD__DOCUMENTS:
				return documents != null && !documents.isEmpty();
			case CommonPackage.ACTIVITY_RECORD__ORGANISATIONS:
				return organisations != null && !organisations.isEmpty();
			case CommonPackage.ACTIVITY_RECORD__CREATED_DATE_TIME:
				return CREATED_DATE_TIME_EDEFAULT == null ? createdDateTime != null : !CREATED_DATE_TIME_EDEFAULT.equals(createdDateTime);
			case CommonPackage.ACTIVITY_RECORD__ERP_PERSONS:
				return erpPersons != null && !erpPersons.isEmpty();
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
		result.append(" (severity: ");
		result.append(severity);
		result.append(", category: ");
		result.append(category);
		result.append(", reason: ");
		result.append(reason);
		result.append(", createdDateTime: ");
		result.append(createdDateTime);
		result.append(')');
		return result.toString();
	}

} //ActivityRecordImpl
