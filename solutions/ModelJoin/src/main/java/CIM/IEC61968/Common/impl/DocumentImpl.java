/**
 */
package CIM.IEC61968.Common.impl;

import CIM.IEC61968.Common.ActivityRecord;
import CIM.IEC61968.Common.CommonPackage;
import CIM.IEC61968.Common.Document;
import CIM.IEC61968.Common.ElectronicAddress;
import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfAssets.DocAssetRole;
import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

import CIM.IEC61970.Informative.InfCommon.DocDocRole;
import CIM.IEC61970.Informative.InfCommon.DocPsrRole;
import CIM.IEC61970.Informative.InfCommon.InfCommonPackage;
import CIM.IEC61970.Informative.InfCommon.ScheduleParameterInfo;
import CIM.IEC61970.Informative.InfCommon.ScheduledEvent;

import CIM.IEC61970.Informative.InfERPSupport.DocErpPersonRole;
import CIM.IEC61970.Informative.InfERPSupport.DocOrgRole;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM.IEC61970.Informative.InfOperations.ChangeItem;
import CIM.IEC61970.Informative.InfOperations.ChangeSet;
import CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import CIM.IEC61970.Informative.InfOperations.NetworkDataSet;

import CIM.IEC61970.Meas.MeasPackage;
import CIM.IEC61970.Meas.Measurement;

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
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Common.impl.DocumentImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.DocumentImpl#getScheduledEvents <em>Scheduled Events</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.DocumentImpl#getErpOrganisationRoles <em>Erp Organisation Roles</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.DocumentImpl#getCreatedDateTime <em>Created Date Time</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.DocumentImpl#getToDocumentRoles <em>To Document Roles</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.DocumentImpl#getAssetRoles <em>Asset Roles</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.DocumentImpl#getErpPersonRoles <em>Erp Person Roles</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.DocumentImpl#getRevisionNumber <em>Revision Number</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.DocumentImpl#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.DocumentImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.DocumentImpl#getNetworkDataSets <em>Network Data Sets</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.DocumentImpl#getPowerSystemResourceRoles <em>Power System Resource Roles</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.DocumentImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.DocumentImpl#getActivityRecords <em>Activity Records</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.DocumentImpl#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.DocumentImpl#getFromDocumentRoles <em>From Document Roles</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.DocumentImpl#getLastModifiedDateTime <em>Last Modified Date Time</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.DocumentImpl#getChangeSets <em>Change Sets</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.DocumentImpl#getDocStatus <em>Doc Status</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.DocumentImpl#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.DocumentImpl#getScheduleParameterInfos <em>Schedule Parameter Infos</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.DocumentImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentImpl extends IdentifiedObjectImpl implements Document {
	/**
	 * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected String subject = SUBJECT_EDEFAULT;

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
	 * The cached value of the '{@link #getErpOrganisationRoles() <em>Erp Organisation Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpOrganisationRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<DocOrgRole> erpOrganisationRoles;

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
	 * The cached value of the '{@link #getToDocumentRoles() <em>To Document Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDocumentRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<DocDocRole> toDocumentRoles;

	/**
	 * The cached value of the '{@link #getAssetRoles() <em>Asset Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<DocAssetRole> assetRoles;

	/**
	 * The cached value of the '{@link #getErpPersonRoles() <em>Erp Person Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPersonRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<DocErpPersonRole> erpPersonRoles;

	/**
	 * The default value of the '{@link #getRevisionNumber() <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevisionNumber() <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected String revisionNumber = REVISION_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElectronicAddress() <em>Electronic Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectronicAddress()
	 * @generated
	 * @ordered
	 */
	protected ElectronicAddress electronicAddress;

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
	 * The cached value of the '{@link #getNetworkDataSets() <em>Network Data Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkDataSets()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkDataSet> networkDataSets;

	/**
	 * The cached value of the '{@link #getPowerSystemResourceRoles() <em>Power System Resource Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSystemResourceRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<DocPsrRole> powerSystemResourceRoles;

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
	 * The cached value of the '{@link #getActivityRecords() <em>Activity Records</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityRecord> activityRecords;

	/**
	 * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurements()
	 * @generated
	 * @ordered
	 */
	protected EList<Measurement> measurements;

	/**
	 * The cached value of the '{@link #getFromDocumentRoles() <em>From Document Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDocumentRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<DocDocRole> fromDocumentRoles;

	/**
	 * The default value of the '{@link #getLastModifiedDateTime() <em>Last Modified Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MODIFIED_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifiedDateTime() <em>Last Modified Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date lastModifiedDateTime = LAST_MODIFIED_DATE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChangeSets() <em>Change Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeSet> changeSets;

	/**
	 * The cached value of the '{@link #getDocStatus() <em>Doc Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocStatus()
	 * @generated
	 * @ordered
	 */
	protected Status docStatus;

	/**
	 * The cached value of the '{@link #getChangeItems() <em>Change Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeItem> changeItems;

	/**
	 * The cached value of the '{@link #getScheduleParameterInfos() <em>Schedule Parameter Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleParameterInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<ScheduleParameterInfo> scheduleParameterInfos;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(String newSubject) {
		String oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.DOCUMENT__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScheduledEvent> getScheduledEvents() {
		if (scheduledEvents == null) {
			scheduledEvents = new EObjectWithInverseResolvingEList<ScheduledEvent>(ScheduledEvent.class, this, CommonPackage.DOCUMENT__SCHEDULED_EVENTS, InfCommonPackage.SCHEDULED_EVENT__DOCUMENT);
		}
		return scheduledEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocOrgRole> getErpOrganisationRoles() {
		if (erpOrganisationRoles == null) {
			erpOrganisationRoles = new EObjectWithInverseResolvingEList<DocOrgRole>(DocOrgRole.class, this, CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES, InfERPSupportPackage.DOC_ORG_ROLE__DOCUMENT);
		}
		return erpOrganisationRoles;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.DOCUMENT__CREATED_DATE_TIME, oldCreatedDateTime, createdDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocDocRole> getToDocumentRoles() {
		if (toDocumentRoles == null) {
			toDocumentRoles = new EObjectWithInverseResolvingEList<DocDocRole>(DocDocRole.class, this, CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES, InfCommonPackage.DOC_DOC_ROLE__FROM_DOCUMENT);
		}
		return toDocumentRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocAssetRole> getAssetRoles() {
		if (assetRoles == null) {
			assetRoles = new EObjectWithInverseResolvingEList<DocAssetRole>(DocAssetRole.class, this, CommonPackage.DOCUMENT__ASSET_ROLES, InfAssetsPackage.DOC_ASSET_ROLE__DOCUMENT);
		}
		return assetRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocErpPersonRole> getErpPersonRoles() {
		if (erpPersonRoles == null) {
			erpPersonRoles = new EObjectWithInverseResolvingEList<DocErpPersonRole>(DocErpPersonRole.class, this, CommonPackage.DOCUMENT__ERP_PERSON_ROLES, InfERPSupportPackage.DOC_ERP_PERSON_ROLE__DOCUMENT);
		}
		return erpPersonRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRevisionNumber() {
		return revisionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisionNumber(String newRevisionNumber) {
		String oldRevisionNumber = revisionNumber;
		revisionNumber = newRevisionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.DOCUMENT__REVISION_NUMBER, oldRevisionNumber, revisionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicAddress getElectronicAddress() {
		if (electronicAddress != null && electronicAddress.eIsProxy()) {
			InternalEObject oldElectronicAddress = (InternalEObject)electronicAddress;
			electronicAddress = (ElectronicAddress)eResolveProxy(oldElectronicAddress);
			if (electronicAddress != oldElectronicAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS, oldElectronicAddress, electronicAddress));
			}
		}
		return electronicAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicAddress basicGetElectronicAddress() {
		return electronicAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElectronicAddress(ElectronicAddress newElectronicAddress) {
		ElectronicAddress oldElectronicAddress = electronicAddress;
		electronicAddress = newElectronicAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS, oldElectronicAddress, electronicAddress));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.DOCUMENT__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.DOCUMENT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkDataSet> getNetworkDataSets() {
		if (networkDataSets == null) {
			networkDataSets = new EObjectWithInverseResolvingEList.ManyInverse<NetworkDataSet>(NetworkDataSet.class, this, CommonPackage.DOCUMENT__NETWORK_DATA_SETS, InfOperationsPackage.NETWORK_DATA_SET__DOCUMENTS);
		}
		return networkDataSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocPsrRole> getPowerSystemResourceRoles() {
		if (powerSystemResourceRoles == null) {
			powerSystemResourceRoles = new EObjectWithInverseResolvingEList<DocPsrRole>(DocPsrRole.class, this, CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES, InfCommonPackage.DOC_PSR_ROLE__DOCUMENT);
		}
		return powerSystemResourceRoles;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.DOCUMENT__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityRecord> getActivityRecords() {
		if (activityRecords == null) {
			activityRecords = new EObjectWithInverseResolvingEList.ManyInverse<ActivityRecord>(ActivityRecord.class, this, CommonPackage.DOCUMENT__ACTIVITY_RECORDS, CommonPackage.ACTIVITY_RECORD__DOCUMENTS);
		}
		return activityRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measurement> getMeasurements() {
		if (measurements == null) {
			measurements = new EObjectWithInverseResolvingEList.ManyInverse<Measurement>(Measurement.class, this, CommonPackage.DOCUMENT__MEASUREMENTS, MeasPackage.MEASUREMENT__DOCUMENTS);
		}
		return measurements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocDocRole> getFromDocumentRoles() {
		if (fromDocumentRoles == null) {
			fromDocumentRoles = new EObjectWithInverseResolvingEList<DocDocRole>(DocDocRole.class, this, CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES, InfCommonPackage.DOC_DOC_ROLE__TO_DOCUMENT);
		}
		return fromDocumentRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastModifiedDateTime() {
		return lastModifiedDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModifiedDateTime(Date newLastModifiedDateTime) {
		Date oldLastModifiedDateTime = lastModifiedDateTime;
		lastModifiedDateTime = newLastModifiedDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME, oldLastModifiedDateTime, lastModifiedDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeSet> getChangeSets() {
		if (changeSets == null) {
			changeSets = new EObjectWithInverseResolvingEList.ManyInverse<ChangeSet>(ChangeSet.class, this, CommonPackage.DOCUMENT__CHANGE_SETS, InfOperationsPackage.CHANGE_SET__DOCUMENTS);
		}
		return changeSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getDocStatus() {
		if (docStatus != null && docStatus.eIsProxy()) {
			InternalEObject oldDocStatus = (InternalEObject)docStatus;
			docStatus = (Status)eResolveProxy(oldDocStatus);
			if (docStatus != oldDocStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.DOCUMENT__DOC_STATUS, oldDocStatus, docStatus));
			}
		}
		return docStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status basicGetDocStatus() {
		return docStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocStatus(Status newDocStatus) {
		Status oldDocStatus = docStatus;
		docStatus = newDocStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.DOCUMENT__DOC_STATUS, oldDocStatus, docStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeItem> getChangeItems() {
		if (changeItems == null) {
			changeItems = new EObjectWithInverseResolvingEList<ChangeItem>(ChangeItem.class, this, CommonPackage.DOCUMENT__CHANGE_ITEMS, InfOperationsPackage.CHANGE_ITEM__DOCUMENT);
		}
		return changeItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScheduleParameterInfo> getScheduleParameterInfos() {
		if (scheduleParameterInfos == null) {
			scheduleParameterInfos = new EObjectWithInverseResolvingEList.ManyInverse<ScheduleParameterInfo>(ScheduleParameterInfo.class, this, CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS, InfCommonPackage.SCHEDULE_PARAMETER_INFO__DOCUMENTS);
		}
		return scheduleParameterInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.DOCUMENT__TITLE, oldTitle, title));
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
			case CommonPackage.DOCUMENT__SCHEDULED_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScheduledEvents()).basicAdd(otherEnd, msgs);
			case CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpOrganisationRoles()).basicAdd(otherEnd, msgs);
			case CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToDocumentRoles()).basicAdd(otherEnd, msgs);
			case CommonPackage.DOCUMENT__ASSET_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssetRoles()).basicAdd(otherEnd, msgs);
			case CommonPackage.DOCUMENT__ERP_PERSON_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPersonRoles()).basicAdd(otherEnd, msgs);
			case CommonPackage.DOCUMENT__NETWORK_DATA_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNetworkDataSets()).basicAdd(otherEnd, msgs);
			case CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerSystemResourceRoles()).basicAdd(otherEnd, msgs);
			case CommonPackage.DOCUMENT__ACTIVITY_RECORDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityRecords()).basicAdd(otherEnd, msgs);
			case CommonPackage.DOCUMENT__MEASUREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurements()).basicAdd(otherEnd, msgs);
			case CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFromDocumentRoles()).basicAdd(otherEnd, msgs);
			case CommonPackage.DOCUMENT__CHANGE_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChangeSets()).basicAdd(otherEnd, msgs);
			case CommonPackage.DOCUMENT__CHANGE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChangeItems()).basicAdd(otherEnd, msgs);
			case CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScheduleParameterInfos()).basicAdd(otherEnd, msgs);
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
			case CommonPackage.DOCUMENT__SCHEDULED_EVENTS:
				return ((InternalEList<?>)getScheduledEvents()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES:
				return ((InternalEList<?>)getErpOrganisationRoles()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES:
				return ((InternalEList<?>)getToDocumentRoles()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT__ASSET_ROLES:
				return ((InternalEList<?>)getAssetRoles()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT__ERP_PERSON_ROLES:
				return ((InternalEList<?>)getErpPersonRoles()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT__NETWORK_DATA_SETS:
				return ((InternalEList<?>)getNetworkDataSets()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES:
				return ((InternalEList<?>)getPowerSystemResourceRoles()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT__ACTIVITY_RECORDS:
				return ((InternalEList<?>)getActivityRecords()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT__MEASUREMENTS:
				return ((InternalEList<?>)getMeasurements()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES:
				return ((InternalEList<?>)getFromDocumentRoles()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT__CHANGE_SETS:
				return ((InternalEList<?>)getChangeSets()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT__CHANGE_ITEMS:
				return ((InternalEList<?>)getChangeItems()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS:
				return ((InternalEList<?>)getScheduleParameterInfos()).basicRemove(otherEnd, msgs);
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
			case CommonPackage.DOCUMENT__SUBJECT:
				return getSubject();
			case CommonPackage.DOCUMENT__SCHEDULED_EVENTS:
				return getScheduledEvents();
			case CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES:
				return getErpOrganisationRoles();
			case CommonPackage.DOCUMENT__CREATED_DATE_TIME:
				return getCreatedDateTime();
			case CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES:
				return getToDocumentRoles();
			case CommonPackage.DOCUMENT__ASSET_ROLES:
				return getAssetRoles();
			case CommonPackage.DOCUMENT__ERP_PERSON_ROLES:
				return getErpPersonRoles();
			case CommonPackage.DOCUMENT__REVISION_NUMBER:
				return getRevisionNumber();
			case CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS:
				if (resolve) return getElectronicAddress();
				return basicGetElectronicAddress();
			case CommonPackage.DOCUMENT__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case CommonPackage.DOCUMENT__NETWORK_DATA_SETS:
				return getNetworkDataSets();
			case CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES:
				return getPowerSystemResourceRoles();
			case CommonPackage.DOCUMENT__CATEGORY:
				return getCategory();
			case CommonPackage.DOCUMENT__ACTIVITY_RECORDS:
				return getActivityRecords();
			case CommonPackage.DOCUMENT__MEASUREMENTS:
				return getMeasurements();
			case CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES:
				return getFromDocumentRoles();
			case CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME:
				return getLastModifiedDateTime();
			case CommonPackage.DOCUMENT__CHANGE_SETS:
				return getChangeSets();
			case CommonPackage.DOCUMENT__DOC_STATUS:
				if (resolve) return getDocStatus();
				return basicGetDocStatus();
			case CommonPackage.DOCUMENT__CHANGE_ITEMS:
				return getChangeItems();
			case CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS:
				return getScheduleParameterInfos();
			case CommonPackage.DOCUMENT__TITLE:
				return getTitle();
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
			case CommonPackage.DOCUMENT__SUBJECT:
				setSubject((String)newValue);
				return;
			case CommonPackage.DOCUMENT__SCHEDULED_EVENTS:
				getScheduledEvents().clear();
				getScheduledEvents().addAll((Collection<? extends ScheduledEvent>)newValue);
				return;
			case CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES:
				getErpOrganisationRoles().clear();
				getErpOrganisationRoles().addAll((Collection<? extends DocOrgRole>)newValue);
				return;
			case CommonPackage.DOCUMENT__CREATED_DATE_TIME:
				setCreatedDateTime((Date)newValue);
				return;
			case CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES:
				getToDocumentRoles().clear();
				getToDocumentRoles().addAll((Collection<? extends DocDocRole>)newValue);
				return;
			case CommonPackage.DOCUMENT__ASSET_ROLES:
				getAssetRoles().clear();
				getAssetRoles().addAll((Collection<? extends DocAssetRole>)newValue);
				return;
			case CommonPackage.DOCUMENT__ERP_PERSON_ROLES:
				getErpPersonRoles().clear();
				getErpPersonRoles().addAll((Collection<? extends DocErpPersonRole>)newValue);
				return;
			case CommonPackage.DOCUMENT__REVISION_NUMBER:
				setRevisionNumber((String)newValue);
				return;
			case CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS:
				setElectronicAddress((ElectronicAddress)newValue);
				return;
			case CommonPackage.DOCUMENT__STATUS:
				setStatus((Status)newValue);
				return;
			case CommonPackage.DOCUMENT__NETWORK_DATA_SETS:
				getNetworkDataSets().clear();
				getNetworkDataSets().addAll((Collection<? extends NetworkDataSet>)newValue);
				return;
			case CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES:
				getPowerSystemResourceRoles().clear();
				getPowerSystemResourceRoles().addAll((Collection<? extends DocPsrRole>)newValue);
				return;
			case CommonPackage.DOCUMENT__CATEGORY:
				setCategory((String)newValue);
				return;
			case CommonPackage.DOCUMENT__ACTIVITY_RECORDS:
				getActivityRecords().clear();
				getActivityRecords().addAll((Collection<? extends ActivityRecord>)newValue);
				return;
			case CommonPackage.DOCUMENT__MEASUREMENTS:
				getMeasurements().clear();
				getMeasurements().addAll((Collection<? extends Measurement>)newValue);
				return;
			case CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES:
				getFromDocumentRoles().clear();
				getFromDocumentRoles().addAll((Collection<? extends DocDocRole>)newValue);
				return;
			case CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME:
				setLastModifiedDateTime((Date)newValue);
				return;
			case CommonPackage.DOCUMENT__CHANGE_SETS:
				getChangeSets().clear();
				getChangeSets().addAll((Collection<? extends ChangeSet>)newValue);
				return;
			case CommonPackage.DOCUMENT__DOC_STATUS:
				setDocStatus((Status)newValue);
				return;
			case CommonPackage.DOCUMENT__CHANGE_ITEMS:
				getChangeItems().clear();
				getChangeItems().addAll((Collection<? extends ChangeItem>)newValue);
				return;
			case CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS:
				getScheduleParameterInfos().clear();
				getScheduleParameterInfos().addAll((Collection<? extends ScheduleParameterInfo>)newValue);
				return;
			case CommonPackage.DOCUMENT__TITLE:
				setTitle((String)newValue);
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
			case CommonPackage.DOCUMENT__SUBJECT:
				setSubject(SUBJECT_EDEFAULT);
				return;
			case CommonPackage.DOCUMENT__SCHEDULED_EVENTS:
				getScheduledEvents().clear();
				return;
			case CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES:
				getErpOrganisationRoles().clear();
				return;
			case CommonPackage.DOCUMENT__CREATED_DATE_TIME:
				setCreatedDateTime(CREATED_DATE_TIME_EDEFAULT);
				return;
			case CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES:
				getToDocumentRoles().clear();
				return;
			case CommonPackage.DOCUMENT__ASSET_ROLES:
				getAssetRoles().clear();
				return;
			case CommonPackage.DOCUMENT__ERP_PERSON_ROLES:
				getErpPersonRoles().clear();
				return;
			case CommonPackage.DOCUMENT__REVISION_NUMBER:
				setRevisionNumber(REVISION_NUMBER_EDEFAULT);
				return;
			case CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS:
				setElectronicAddress((ElectronicAddress)null);
				return;
			case CommonPackage.DOCUMENT__STATUS:
				setStatus((Status)null);
				return;
			case CommonPackage.DOCUMENT__NETWORK_DATA_SETS:
				getNetworkDataSets().clear();
				return;
			case CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES:
				getPowerSystemResourceRoles().clear();
				return;
			case CommonPackage.DOCUMENT__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case CommonPackage.DOCUMENT__ACTIVITY_RECORDS:
				getActivityRecords().clear();
				return;
			case CommonPackage.DOCUMENT__MEASUREMENTS:
				getMeasurements().clear();
				return;
			case CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES:
				getFromDocumentRoles().clear();
				return;
			case CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME:
				setLastModifiedDateTime(LAST_MODIFIED_DATE_TIME_EDEFAULT);
				return;
			case CommonPackage.DOCUMENT__CHANGE_SETS:
				getChangeSets().clear();
				return;
			case CommonPackage.DOCUMENT__DOC_STATUS:
				setDocStatus((Status)null);
				return;
			case CommonPackage.DOCUMENT__CHANGE_ITEMS:
				getChangeItems().clear();
				return;
			case CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS:
				getScheduleParameterInfos().clear();
				return;
			case CommonPackage.DOCUMENT__TITLE:
				setTitle(TITLE_EDEFAULT);
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
			case CommonPackage.DOCUMENT__SUBJECT:
				return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
			case CommonPackage.DOCUMENT__SCHEDULED_EVENTS:
				return scheduledEvents != null && !scheduledEvents.isEmpty();
			case CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES:
				return erpOrganisationRoles != null && !erpOrganisationRoles.isEmpty();
			case CommonPackage.DOCUMENT__CREATED_DATE_TIME:
				return CREATED_DATE_TIME_EDEFAULT == null ? createdDateTime != null : !CREATED_DATE_TIME_EDEFAULT.equals(createdDateTime);
			case CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES:
				return toDocumentRoles != null && !toDocumentRoles.isEmpty();
			case CommonPackage.DOCUMENT__ASSET_ROLES:
				return assetRoles != null && !assetRoles.isEmpty();
			case CommonPackage.DOCUMENT__ERP_PERSON_ROLES:
				return erpPersonRoles != null && !erpPersonRoles.isEmpty();
			case CommonPackage.DOCUMENT__REVISION_NUMBER:
				return REVISION_NUMBER_EDEFAULT == null ? revisionNumber != null : !REVISION_NUMBER_EDEFAULT.equals(revisionNumber);
			case CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS:
				return electronicAddress != null;
			case CommonPackage.DOCUMENT__STATUS:
				return status != null;
			case CommonPackage.DOCUMENT__NETWORK_DATA_SETS:
				return networkDataSets != null && !networkDataSets.isEmpty();
			case CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES:
				return powerSystemResourceRoles != null && !powerSystemResourceRoles.isEmpty();
			case CommonPackage.DOCUMENT__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case CommonPackage.DOCUMENT__ACTIVITY_RECORDS:
				return activityRecords != null && !activityRecords.isEmpty();
			case CommonPackage.DOCUMENT__MEASUREMENTS:
				return measurements != null && !measurements.isEmpty();
			case CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES:
				return fromDocumentRoles != null && !fromDocumentRoles.isEmpty();
			case CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME:
				return LAST_MODIFIED_DATE_TIME_EDEFAULT == null ? lastModifiedDateTime != null : !LAST_MODIFIED_DATE_TIME_EDEFAULT.equals(lastModifiedDateTime);
			case CommonPackage.DOCUMENT__CHANGE_SETS:
				return changeSets != null && !changeSets.isEmpty();
			case CommonPackage.DOCUMENT__DOC_STATUS:
				return docStatus != null;
			case CommonPackage.DOCUMENT__CHANGE_ITEMS:
				return changeItems != null && !changeItems.isEmpty();
			case CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS:
				return scheduleParameterInfos != null && !scheduleParameterInfos.isEmpty();
			case CommonPackage.DOCUMENT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
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
		result.append(" (subject: ");
		result.append(subject);
		result.append(", createdDateTime: ");
		result.append(createdDateTime);
		result.append(", revisionNumber: ");
		result.append(revisionNumber);
		result.append(", category: ");
		result.append(category);
		result.append(", lastModifiedDateTime: ");
		result.append(lastModifiedDateTime);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //DocumentImpl
