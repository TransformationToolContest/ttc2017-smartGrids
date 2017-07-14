/**
 */
package gluemodel.CIM.IEC61970.Core.impl;

import gluemodel.CIM.IEC61968.Assets.Asset;
import gluemodel.CIM.IEC61968.Assets.AssetsPackage;

import gluemodel.CIM.IEC61968.Common.CommonPackage;
import gluemodel.CIM.IEC61968.Common.Location;

import gluemodel.CIM.IEC61970.Core.CorePackage;
import gluemodel.CIM.IEC61970.Core.OperatingShare;
import gluemodel.CIM.IEC61970.Core.PSRType;
import gluemodel.CIM.IEC61970.Core.PowerSystemResource;
import gluemodel.CIM.IEC61970.Core.PsrList;
import gluemodel.CIM.IEC61970.Core.ReportingGroup;

import gluemodel.CIM.IEC61970.Informative.InfCommon.DocPsrRole;
import gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage;

import gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem;
import gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitSection;
import gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet;
import gluemodel.CIM.IEC61970.Informative.InfOperations.OrgPsrRole;
import gluemodel.CIM.IEC61970.Informative.InfOperations.PSREvent;
import gluemodel.CIM.IEC61970.Informative.InfOperations.SafetyDocument;
import gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep;

import gluemodel.CIM.IEC61970.Meas.MeasPackage;
import gluemodel.CIM.IEC61970.Meas.Measurement;

import gluemodel.CIM.IEC61970.Outage.OutagePackage;
import gluemodel.CIM.IEC61970.Outage.OutageSchedule;

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
 * An implementation of the model object '<em><b>Power System Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl#getReportingGroup <em>Reporting Group</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl#getNetworkDataSets <em>Network Data Sets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl#getOutageSchedule <em>Outage Schedule</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl#getPSREvent <em>PSR Event</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl#getSafetyDocuments <em>Safety Documents</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl#getErpOrganisationRoles <em>Erp Organisation Roles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl#getCircuitSections <em>Circuit Sections</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl#getScheduleSteps <em>Schedule Steps</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl#getPSRType <em>PSR Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl#getPsrLists <em>Psr Lists</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl#getOperatingShare <em>Operating Share</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl#getDocumentRoles <em>Document Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerSystemResourceImpl extends IdentifiedObjectImpl implements PowerSystemResource {
	/**
	 * The cached value of the '{@link #getReportingGroup() <em>Reporting Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportingGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ReportingGroup> reportingGroup;

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
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getOutageSchedule() <em>Outage Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageSchedule()
	 * @generated
	 * @ordered
	 */
	protected OutageSchedule outageSchedule;

	/**
	 * The cached value of the '{@link #getPSREvent() <em>PSR Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSREvent()
	 * @generated
	 * @ordered
	 */
	protected EList<PSREvent> psrEvent;

	/**
	 * The cached value of the '{@link #getSafetyDocuments() <em>Safety Documents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafetyDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<SafetyDocument> safetyDocuments;

	/**
	 * The cached value of the '{@link #getErpOrganisationRoles() <em>Erp Organisation Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpOrganisationRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<OrgPsrRole> erpOrganisationRoles;

	/**
	 * The cached value of the '{@link #getCircuitSections() <em>Circuit Sections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuitSections()
	 * @generated
	 * @ordered
	 */
	protected EList<CircuitSection> circuitSections;

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
	 * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> assets;

	/**
	 * The cached value of the '{@link #getScheduleSteps() <em>Schedule Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchingStep> scheduleSteps;

	/**
	 * The cached value of the '{@link #getPSRType() <em>PSR Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSRType()
	 * @generated
	 * @ordered
	 */
	protected PSRType psrType;

	/**
	 * The cached value of the '{@link #getPsrLists() <em>Psr Lists</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPsrLists()
	 * @generated
	 * @ordered
	 */
	protected EList<PsrList> psrLists;

	/**
	 * The cached value of the '{@link #getOperatingShare() <em>Operating Share</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingShare()
	 * @generated
	 * @ordered
	 */
	protected EList<OperatingShare> operatingShare;

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
	 * The cached value of the '{@link #getDocumentRoles() <em>Document Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<DocPsrRole> documentRoles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerSystemResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.POWER_SYSTEM_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReportingGroup> getReportingGroup() {
		if (reportingGroup == null) {
			reportingGroup = new EObjectWithInverseResolvingEList.ManyInverse<ReportingGroup>(ReportingGroup.class, this, CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP, CorePackage.REPORTING_GROUP__POWER_SYSTEM_RESOURCE);
		}
		return reportingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkDataSet> getNetworkDataSets() {
		if (networkDataSets == null) {
			networkDataSets = new EObjectWithInverseResolvingEList.ManyInverse<NetworkDataSet>(NetworkDataSet.class, this, CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS, InfOperationsPackage.NETWORK_DATA_SET__POWER_SYSTEM_RESOURCES);
		}
		return networkDataSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.POWER_SYSTEM_RESOURCE__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.POWER_SYSTEM_RESOURCE__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, CommonPackage.LOCATION__POWER_SYSTEM_RESOURCES, Location.class, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, CommonPackage.LOCATION__POWER_SYSTEM_RESOURCES, Location.class, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.POWER_SYSTEM_RESOURCE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageSchedule getOutageSchedule() {
		if (outageSchedule != null && outageSchedule.eIsProxy()) {
			InternalEObject oldOutageSchedule = (InternalEObject)outageSchedule;
			outageSchedule = (OutageSchedule)eResolveProxy(oldOutageSchedule);
			if (outageSchedule != oldOutageSchedule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE, oldOutageSchedule, outageSchedule));
			}
		}
		return outageSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageSchedule basicGetOutageSchedule() {
		return outageSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutageSchedule(OutageSchedule newOutageSchedule, NotificationChain msgs) {
		OutageSchedule oldOutageSchedule = outageSchedule;
		outageSchedule = newOutageSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE, oldOutageSchedule, newOutageSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutageSchedule(OutageSchedule newOutageSchedule) {
		if (newOutageSchedule != outageSchedule) {
			NotificationChain msgs = null;
			if (outageSchedule != null)
				msgs = ((InternalEObject)outageSchedule).eInverseRemove(this, OutagePackage.OUTAGE_SCHEDULE__POWER_SYSTEM_RESOURCE, OutageSchedule.class, msgs);
			if (newOutageSchedule != null)
				msgs = ((InternalEObject)newOutageSchedule).eInverseAdd(this, OutagePackage.OUTAGE_SCHEDULE__POWER_SYSTEM_RESOURCE, OutageSchedule.class, msgs);
			msgs = basicSetOutageSchedule(newOutageSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE, newOutageSchedule, newOutageSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PSREvent> getPSREvent() {
		if (psrEvent == null) {
			psrEvent = new EObjectWithInverseResolvingEList<PSREvent>(PSREvent.class, this, CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT, InfOperationsPackage.PSR_EVENT__POWER_SYSTEM_RESOURCE);
		}
		return psrEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SafetyDocument> getSafetyDocuments() {
		if (safetyDocuments == null) {
			safetyDocuments = new EObjectWithInverseResolvingEList<SafetyDocument>(SafetyDocument.class, this, CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS, InfOperationsPackage.SAFETY_DOCUMENT__POWER_SYSTEM_RESOURCE);
		}
		return safetyDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrgPsrRole> getErpOrganisationRoles() {
		if (erpOrganisationRoles == null) {
			erpOrganisationRoles = new EObjectWithInverseResolvingEList<OrgPsrRole>(OrgPsrRole.class, this, CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES, InfOperationsPackage.ORG_PSR_ROLE__POWER_SYSTEM_RESOURCE);
		}
		return erpOrganisationRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CircuitSection> getCircuitSections() {
		if (circuitSections == null) {
			circuitSections = new EObjectWithInverseResolvingEList.ManyInverse<CircuitSection>(CircuitSection.class, this, CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS, InfOperationsPackage.CIRCUIT_SECTION__POWER_SYSTEM_RESOURCES);
		}
		return circuitSections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measurement> getMeasurements() {
		if (measurements == null) {
			measurements = new EObjectWithInverseResolvingEList<Measurement>(Measurement.class, this, CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS, MeasPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE);
		}
		return measurements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new EObjectWithInverseResolvingEList.ManyInverse<Asset>(Asset.class, this, CorePackage.POWER_SYSTEM_RESOURCE__ASSETS, AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES);
		}
		return assets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwitchingStep> getScheduleSteps() {
		if (scheduleSteps == null) {
			scheduleSteps = new EObjectWithInverseResolvingEList.ManyInverse<SwitchingStep>(SwitchingStep.class, this, CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS, InfOperationsPackage.SWITCHING_STEP__POWER_SYSTEM_RESOURCES);
		}
		return scheduleSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSRType getPSRType() {
		if (psrType != null && psrType.eIsProxy()) {
			InternalEObject oldPSRType = (InternalEObject)psrType;
			psrType = (PSRType)eResolveProxy(oldPSRType);
			if (psrType != oldPSRType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE, oldPSRType, psrType));
			}
		}
		return psrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSRType basicGetPSRType() {
		return psrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPSRType(PSRType newPSRType, NotificationChain msgs) {
		PSRType oldPSRType = psrType;
		psrType = newPSRType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE, oldPSRType, newPSRType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPSRType(PSRType newPSRType) {
		if (newPSRType != psrType) {
			NotificationChain msgs = null;
			if (psrType != null)
				msgs = ((InternalEObject)psrType).eInverseRemove(this, CorePackage.PSR_TYPE__POWER_SYSTEM_RESOURCES, PSRType.class, msgs);
			if (newPSRType != null)
				msgs = ((InternalEObject)newPSRType).eInverseAdd(this, CorePackage.PSR_TYPE__POWER_SYSTEM_RESOURCES, PSRType.class, msgs);
			msgs = basicSetPSRType(newPSRType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE, newPSRType, newPSRType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PsrList> getPsrLists() {
		if (psrLists == null) {
			psrLists = new EObjectWithInverseResolvingEList.ManyInverse<PsrList>(PsrList.class, this, CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS, CorePackage.PSR_LIST__POWER_SYSTEM_RESOURCES);
		}
		return psrLists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperatingShare> getOperatingShare() {
		if (operatingShare == null) {
			operatingShare = new EObjectWithInverseResolvingEList<OperatingShare>(OperatingShare.class, this, CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE, CorePackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE);
		}
		return operatingShare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeItem> getChangeItems() {
		if (changeItems == null) {
			changeItems = new EObjectWithInverseResolvingEList<ChangeItem>(ChangeItem.class, this, CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS, InfOperationsPackage.CHANGE_ITEM__POWER_SYSTEM_RESOURCE);
		}
		return changeItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocPsrRole> getDocumentRoles() {
		if (documentRoles == null) {
			documentRoles = new EObjectWithInverseResolvingEList<DocPsrRole>(DocPsrRole.class, this, CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES, InfCommonPackage.DOC_PSR_ROLE__POWER_SYSTEM_RESOURCE);
		}
		return documentRoles;
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
			case CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReportingGroup()).basicAdd(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNetworkDataSets()).basicAdd(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__LOCATION:
				if (location != null)
					msgs = ((InternalEObject)location).eInverseRemove(this, CommonPackage.LOCATION__POWER_SYSTEM_RESOURCES, Location.class, msgs);
				return basicSetLocation((Location)otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE:
				if (outageSchedule != null)
					msgs = ((InternalEObject)outageSchedule).eInverseRemove(this, OutagePackage.OUTAGE_SCHEDULE__POWER_SYSTEM_RESOURCE, OutageSchedule.class, msgs);
				return basicSetOutageSchedule((OutageSchedule)otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPSREvent()).basicAdd(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSafetyDocuments()).basicAdd(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpOrganisationRoles()).basicAdd(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCircuitSections()).basicAdd(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurements()).basicAdd(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssets()).basicAdd(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScheduleSteps()).basicAdd(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE:
				if (psrType != null)
					msgs = ((InternalEObject)psrType).eInverseRemove(this, CorePackage.PSR_TYPE__POWER_SYSTEM_RESOURCES, PSRType.class, msgs);
				return basicSetPSRType((PSRType)otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPsrLists()).basicAdd(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperatingShare()).basicAdd(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChangeItems()).basicAdd(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocumentRoles()).basicAdd(otherEnd, msgs);
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
			case CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP:
				return ((InternalEList<?>)getReportingGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS:
				return ((InternalEList<?>)getNetworkDataSets()).basicRemove(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__LOCATION:
				return basicSetLocation(null, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE:
				return basicSetOutageSchedule(null, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT:
				return ((InternalEList<?>)getPSREvent()).basicRemove(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS:
				return ((InternalEList<?>)getSafetyDocuments()).basicRemove(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES:
				return ((InternalEList<?>)getErpOrganisationRoles()).basicRemove(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS:
				return ((InternalEList<?>)getCircuitSections()).basicRemove(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS:
				return ((InternalEList<?>)getMeasurements()).basicRemove(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__ASSETS:
				return ((InternalEList<?>)getAssets()).basicRemove(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS:
				return ((InternalEList<?>)getScheduleSteps()).basicRemove(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE:
				return basicSetPSRType(null, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS:
				return ((InternalEList<?>)getPsrLists()).basicRemove(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE:
				return ((InternalEList<?>)getOperatingShare()).basicRemove(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS:
				return ((InternalEList<?>)getChangeItems()).basicRemove(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES:
				return ((InternalEList<?>)getDocumentRoles()).basicRemove(otherEnd, msgs);
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
			case CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP:
				return getReportingGroup();
			case CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS:
				return getNetworkDataSets();
			case CorePackage.POWER_SYSTEM_RESOURCE__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE:
				if (resolve) return getOutageSchedule();
				return basicGetOutageSchedule();
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT:
				return getPSREvent();
			case CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS:
				return getSafetyDocuments();
			case CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES:
				return getErpOrganisationRoles();
			case CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS:
				return getCircuitSections();
			case CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS:
				return getMeasurements();
			case CorePackage.POWER_SYSTEM_RESOURCE__ASSETS:
				return getAssets();
			case CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS:
				return getScheduleSteps();
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE:
				if (resolve) return getPSRType();
				return basicGetPSRType();
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS:
				return getPsrLists();
			case CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE:
				return getOperatingShare();
			case CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS:
				return getChangeItems();
			case CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES:
				return getDocumentRoles();
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
			case CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP:
				getReportingGroup().clear();
				getReportingGroup().addAll((Collection<? extends ReportingGroup>)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS:
				getNetworkDataSets().clear();
				getNetworkDataSets().addAll((Collection<? extends NetworkDataSet>)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__LOCATION:
				setLocation((Location)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE:
				setOutageSchedule((OutageSchedule)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT:
				getPSREvent().clear();
				getPSREvent().addAll((Collection<? extends PSREvent>)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS:
				getSafetyDocuments().clear();
				getSafetyDocuments().addAll((Collection<? extends SafetyDocument>)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES:
				getErpOrganisationRoles().clear();
				getErpOrganisationRoles().addAll((Collection<? extends OrgPsrRole>)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS:
				getCircuitSections().clear();
				getCircuitSections().addAll((Collection<? extends CircuitSection>)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS:
				getMeasurements().clear();
				getMeasurements().addAll((Collection<? extends Measurement>)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS:
				getScheduleSteps().clear();
				getScheduleSteps().addAll((Collection<? extends SwitchingStep>)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE:
				setPSRType((PSRType)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS:
				getPsrLists().clear();
				getPsrLists().addAll((Collection<? extends PsrList>)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE:
				getOperatingShare().clear();
				getOperatingShare().addAll((Collection<? extends OperatingShare>)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS:
				getChangeItems().clear();
				getChangeItems().addAll((Collection<? extends ChangeItem>)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES:
				getDocumentRoles().clear();
				getDocumentRoles().addAll((Collection<? extends DocPsrRole>)newValue);
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
			case CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP:
				getReportingGroup().clear();
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS:
				getNetworkDataSets().clear();
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__LOCATION:
				setLocation((Location)null);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE:
				setOutageSchedule((OutageSchedule)null);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT:
				getPSREvent().clear();
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS:
				getSafetyDocuments().clear();
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES:
				getErpOrganisationRoles().clear();
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS:
				getCircuitSections().clear();
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS:
				getMeasurements().clear();
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__ASSETS:
				getAssets().clear();
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS:
				getScheduleSteps().clear();
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE:
				setPSRType((PSRType)null);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS:
				getPsrLists().clear();
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE:
				getOperatingShare().clear();
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS:
				getChangeItems().clear();
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES:
				getDocumentRoles().clear();
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
			case CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP:
				return reportingGroup != null && !reportingGroup.isEmpty();
			case CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS:
				return networkDataSets != null && !networkDataSets.isEmpty();
			case CorePackage.POWER_SYSTEM_RESOURCE__LOCATION:
				return location != null;
			case CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE:
				return outageSchedule != null;
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT:
				return psrEvent != null && !psrEvent.isEmpty();
			case CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS:
				return safetyDocuments != null && !safetyDocuments.isEmpty();
			case CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES:
				return erpOrganisationRoles != null && !erpOrganisationRoles.isEmpty();
			case CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS:
				return circuitSections != null && !circuitSections.isEmpty();
			case CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS:
				return measurements != null && !measurements.isEmpty();
			case CorePackage.POWER_SYSTEM_RESOURCE__ASSETS:
				return assets != null && !assets.isEmpty();
			case CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS:
				return scheduleSteps != null && !scheduleSteps.isEmpty();
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE:
				return psrType != null;
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS:
				return psrLists != null && !psrLists.isEmpty();
			case CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE:
				return operatingShare != null && !operatingShare.isEmpty();
			case CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS:
				return changeItems != null && !changeItems.isEmpty();
			case CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES:
				return documentRoles != null && !documentRoles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PowerSystemResourceImpl
