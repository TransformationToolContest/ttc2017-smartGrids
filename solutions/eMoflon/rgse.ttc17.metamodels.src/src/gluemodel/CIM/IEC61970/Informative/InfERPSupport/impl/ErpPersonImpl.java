/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl;

import gluemodel.CIM.IEC61968.Common.ActivityRecord;
import gluemodel.CIM.IEC61968.Common.CommonPackage;
import gluemodel.CIM.IEC61968.Common.ElectronicAddress;
import gluemodel.CIM.IEC61968.Common.Status;
import gluemodel.CIM.IEC61968.Common.TelephoneNumber;

import gluemodel.CIM.IEC61968.Customers.Customer;
import gluemodel.CIM.IEC61968.Customers.CustomersPackage;
import gluemodel.CIM.IEC61968.Customers.ServiceLocation;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfCommon.Craft;
import gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage;
import gluemodel.CIM.IEC61970.Informative.InfCommon.Skill;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.DocErpPersonRole;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpCompetency;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPersonnel;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgErpPersonRole;

import gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage;
import gluemodel.CIM.IEC61970.Informative.InfLocations.PersonPropertyRole;

import gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack;
import gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem;
import gluemodel.CIM.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole;
import gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;

import gluemodel.CIM.IEC61970.Informative.InfWork.Appointment;
import gluemodel.CIM.IEC61970.Informative.InfWork.Crew;
import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import gluemodel.CIM.IEC61970.Informative.InfWork.LaborItem;

import gluemodel.CIM.IEC61970.Meas.MeasPackage;
import gluemodel.CIM.IEC61970.Meas.MeasurementValue;

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
 * An implementation of the model object '<em><b>Erp Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getCallBacks <em>Call Backs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getServiceLocation <em>Service Location</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getDocumentRoles <em>Document Roles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getSwitchingStepRoles <em>Switching Step Roles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getMName <em>MName</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getSkills <em>Skills</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getGovernmentID <em>Government ID</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getSpecialNeed <em>Special Need</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getErpOrganisationRoles <em>Erp Organisation Roles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getLaborItems <em>Labor Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getCrafts <em>Crafts</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getMobilePhone <em>Mobile Phone</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getErpCompetency <em>Erp Competency</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getLandPropertyRoles <em>Land Property Roles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getLandlinePhone <em>Landline Phone</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getMeasurementValues <em>Measurement Values</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getActivityRecords <em>Activity Records</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getCrews <em>Crews</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getAppointments <em>Appointments</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getErpPersonnel <em>Erp Personnel</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl#getCustomerData <em>Customer Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpPersonImpl extends IdentifiedObjectImpl implements ErpPerson {
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
	 * The cached value of the '{@link #getServiceLocation() <em>Service Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLocation()
	 * @generated
	 * @ordered
	 */
	protected ServiceLocation serviceLocation;

	/**
	 * The cached value of the '{@link #getDocumentRoles() <em>Document Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<DocErpPersonRole> documentRoles;

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
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSwitchingStepRoles() <em>Switching Step Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchingStepRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpPersonScheduleStepRole> switchingStepRoles;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getMName() <em>MName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMName()
	 * @generated
	 * @ordered
	 */
	protected static final String MNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMName() <em>MName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMName()
	 * @generated
	 * @ordered
	 */
	protected String mName = MNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSkills() <em>Skills</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkills()
	 * @generated
	 * @ordered
	 */
	protected EList<Skill> skills;

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
	 * The default value of the '{@link #getGovernmentID() <em>Government ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGovernmentID()
	 * @generated
	 * @ordered
	 */
	protected static final String GOVERNMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGovernmentID() <em>Government ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGovernmentID()
	 * @generated
	 * @ordered
	 */
	protected String governmentID = GOVERNMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecialNeed() <em>Special Need</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialNeed()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIAL_NEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecialNeed() <em>Special Need</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialNeed()
	 * @generated
	 * @ordered
	 */
	protected String specialNeed = SPECIAL_NEED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErpOrganisationRoles() <em>Erp Organisation Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpOrganisationRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<OrgErpPersonRole> erpOrganisationRoles;

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
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLaborItems() <em>Labor Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaborItems()
	 * @generated
	 * @ordered
	 */
	protected EList<LaborItem> laborItems;

	/**
	 * The cached value of the '{@link #getCrafts() <em>Crafts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrafts()
	 * @generated
	 * @ordered
	 */
	protected EList<Craft> crafts;

	/**
	 * The cached value of the '{@link #getMobilePhone() <em>Mobile Phone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobilePhone()
	 * @generated
	 * @ordered
	 */
	protected TelephoneNumber mobilePhone;

	/**
	 * The cached value of the '{@link #getErpCompetency() <em>Erp Competency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpCompetency()
	 * @generated
	 * @ordered
	 */
	protected ErpCompetency erpCompetency;

	/**
	 * The cached value of the '{@link #getLandPropertyRoles() <em>Land Property Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandPropertyRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonPropertyRole> landPropertyRoles;

	/**
	 * The cached value of the '{@link #getLandlinePhone() <em>Landline Phone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandlinePhone()
	 * @generated
	 * @ordered
	 */
	protected TelephoneNumber landlinePhone;

	/**
	 * The cached value of the '{@link #getMeasurementValues() <em>Measurement Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementValues()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasurementValue> measurementValues;

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
	 * The cached value of the '{@link #getCrews() <em>Crews</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrews()
	 * @generated
	 * @ordered
	 */
	protected EList<Crew> crews;

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
	 * The cached value of the '{@link #getErpPersonnel() <em>Erp Personnel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPersonnel()
	 * @generated
	 * @ordered
	 */
	protected ErpPersonnel erpPersonnel;

	/**
	 * The default value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String SUFFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected String suffix = SUFFIX_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpPersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallBack> getCallBacks() {
		if (callBacks == null) {
			callBacks = new EObjectWithInverseResolvingEList.ManyInverse<CallBack>(CallBack.class, this, InfERPSupportPackage.ERP_PERSON__CALL_BACKS, InfOperationsPackage.CALL_BACK__ERP_PERSONS);
		}
		return callBacks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLocation getServiceLocation() {
		if (serviceLocation != null && serviceLocation.eIsProxy()) {
			InternalEObject oldServiceLocation = (InternalEObject)serviceLocation;
			serviceLocation = (ServiceLocation)eResolveProxy(oldServiceLocation);
			if (serviceLocation != oldServiceLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_PERSON__SERVICE_LOCATION, oldServiceLocation, serviceLocation));
			}
		}
		return serviceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLocation basicGetServiceLocation() {
		return serviceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceLocation(ServiceLocation newServiceLocation, NotificationChain msgs) {
		ServiceLocation oldServiceLocation = serviceLocation;
		serviceLocation = newServiceLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PERSON__SERVICE_LOCATION, oldServiceLocation, newServiceLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceLocation(ServiceLocation newServiceLocation) {
		if (newServiceLocation != serviceLocation) {
			NotificationChain msgs = null;
			if (serviceLocation != null)
				msgs = ((InternalEObject)serviceLocation).eInverseRemove(this, CustomersPackage.SERVICE_LOCATION__ERP_PERSONS, ServiceLocation.class, msgs);
			if (newServiceLocation != null)
				msgs = ((InternalEObject)newServiceLocation).eInverseAdd(this, CustomersPackage.SERVICE_LOCATION__ERP_PERSONS, ServiceLocation.class, msgs);
			msgs = basicSetServiceLocation(newServiceLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PERSON__SERVICE_LOCATION, newServiceLocation, newServiceLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocErpPersonRole> getDocumentRoles() {
		if (documentRoles == null) {
			documentRoles = new EObjectWithInverseResolvingEList<DocErpPersonRole>(DocErpPersonRole.class, this, InfERPSupportPackage.ERP_PERSON__DOCUMENT_ROLES, InfERPSupportPackage.DOC_ERP_PERSON_ROLE__ERP_PERSON);
		}
		return documentRoles;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PERSON__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PERSON__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpPersonScheduleStepRole> getSwitchingStepRoles() {
		if (switchingStepRoles == null) {
			switchingStepRoles = new EObjectWithInverseResolvingEList<ErpPersonScheduleStepRole>(ErpPersonScheduleStepRole.class, this, InfERPSupportPackage.ERP_PERSON__SWITCHING_STEP_ROLES, InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__ERP_PERSON);
		}
		return switchingStepRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PERSON__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeItem> getChangeItems() {
		if (changeItems == null) {
			changeItems = new EObjectWithInverseResolvingEList<ChangeItem>(ChangeItem.class, this, InfERPSupportPackage.ERP_PERSON__CHANGE_ITEMS, InfOperationsPackage.CHANGE_ITEM__ERP_PERSON);
		}
		return changeItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMName() {
		return mName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMName(String newMName) {
		String oldMName = mName;
		mName = newMName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PERSON__MNAME, oldMName, mName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Skill> getSkills() {
		if (skills == null) {
			skills = new EObjectWithInverseResolvingEList<Skill>(Skill.class, this, InfERPSupportPackage.ERP_PERSON__SKILLS, InfCommonPackage.SKILL__ERP_PERSON);
		}
		return skills;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_PERSON__ELECTRONIC_ADDRESS, oldElectronicAddress, electronicAddress));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PERSON__ELECTRONIC_ADDRESS, oldElectronicAddress, electronicAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGovernmentID() {
		return governmentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGovernmentID(String newGovernmentID) {
		String oldGovernmentID = governmentID;
		governmentID = newGovernmentID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PERSON__GOVERNMENT_ID, oldGovernmentID, governmentID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecialNeed() {
		return specialNeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialNeed(String newSpecialNeed) {
		String oldSpecialNeed = specialNeed;
		specialNeed = newSpecialNeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PERSON__SPECIAL_NEED, oldSpecialNeed, specialNeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrgErpPersonRole> getErpOrganisationRoles() {
		if (erpOrganisationRoles == null) {
			erpOrganisationRoles = new EObjectWithInverseResolvingEList<OrgErpPersonRole>(OrgErpPersonRole.class, this, InfERPSupportPackage.ERP_PERSON__ERP_ORGANISATION_ROLES, InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_PERSON);
		}
		return erpOrganisationRoles;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_PERSON__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PERSON__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PERSON__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LaborItem> getLaborItems() {
		if (laborItems == null) {
			laborItems = new EObjectWithInverseResolvingEList.ManyInverse<LaborItem>(LaborItem.class, this, InfERPSupportPackage.ERP_PERSON__LABOR_ITEMS, InfWorkPackage.LABOR_ITEM__ERP_PERSONS);
		}
		return laborItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Craft> getCrafts() {
		if (crafts == null) {
			crafts = new EObjectWithInverseResolvingEList.ManyInverse<Craft>(Craft.class, this, InfERPSupportPackage.ERP_PERSON__CRAFTS, InfCommonPackage.CRAFT__ERP_PERSONS);
		}
		return crafts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumber getMobilePhone() {
		if (mobilePhone != null && mobilePhone.eIsProxy()) {
			InternalEObject oldMobilePhone = (InternalEObject)mobilePhone;
			mobilePhone = (TelephoneNumber)eResolveProxy(oldMobilePhone);
			if (mobilePhone != oldMobilePhone) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_PERSON__MOBILE_PHONE, oldMobilePhone, mobilePhone));
			}
		}
		return mobilePhone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumber basicGetMobilePhone() {
		return mobilePhone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMobilePhone(TelephoneNumber newMobilePhone) {
		TelephoneNumber oldMobilePhone = mobilePhone;
		mobilePhone = newMobilePhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PERSON__MOBILE_PHONE, oldMobilePhone, mobilePhone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpCompetency getErpCompetency() {
		if (erpCompetency != null && erpCompetency.eIsProxy()) {
			InternalEObject oldErpCompetency = (InternalEObject)erpCompetency;
			erpCompetency = (ErpCompetency)eResolveProxy(oldErpCompetency);
			if (erpCompetency != oldErpCompetency) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_PERSON__ERP_COMPETENCY, oldErpCompetency, erpCompetency));
			}
		}
		return erpCompetency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpCompetency basicGetErpCompetency() {
		return erpCompetency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpCompetency(ErpCompetency newErpCompetency, NotificationChain msgs) {
		ErpCompetency oldErpCompetency = erpCompetency;
		erpCompetency = newErpCompetency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PERSON__ERP_COMPETENCY, oldErpCompetency, newErpCompetency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpCompetency(ErpCompetency newErpCompetency) {
		if (newErpCompetency != erpCompetency) {
			NotificationChain msgs = null;
			if (erpCompetency != null)
				msgs = ((InternalEObject)erpCompetency).eInverseRemove(this, InfERPSupportPackage.ERP_COMPETENCY__ERP_PERSONS, ErpCompetency.class, msgs);
			if (newErpCompetency != null)
				msgs = ((InternalEObject)newErpCompetency).eInverseAdd(this, InfERPSupportPackage.ERP_COMPETENCY__ERP_PERSONS, ErpCompetency.class, msgs);
			msgs = basicSetErpCompetency(newErpCompetency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PERSON__ERP_COMPETENCY, newErpCompetency, newErpCompetency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonPropertyRole> getLandPropertyRoles() {
		if (landPropertyRoles == null) {
			landPropertyRoles = new EObjectWithInverseResolvingEList<PersonPropertyRole>(PersonPropertyRole.class, this, InfERPSupportPackage.ERP_PERSON__LAND_PROPERTY_ROLES, InfLocationsPackage.PERSON_PROPERTY_ROLE__ERP_PERSON);
		}
		return landPropertyRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumber getLandlinePhone() {
		if (landlinePhone != null && landlinePhone.eIsProxy()) {
			InternalEObject oldLandlinePhone = (InternalEObject)landlinePhone;
			landlinePhone = (TelephoneNumber)eResolveProxy(oldLandlinePhone);
			if (landlinePhone != oldLandlinePhone) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_PERSON__LANDLINE_PHONE, oldLandlinePhone, landlinePhone));
			}
		}
		return landlinePhone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumber basicGetLandlinePhone() {
		return landlinePhone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLandlinePhone(TelephoneNumber newLandlinePhone) {
		TelephoneNumber oldLandlinePhone = landlinePhone;
		landlinePhone = newLandlinePhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PERSON__LANDLINE_PHONE, oldLandlinePhone, landlinePhone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasurementValue> getMeasurementValues() {
		if (measurementValues == null) {
			measurementValues = new EObjectWithInverseResolvingEList<MeasurementValue>(MeasurementValue.class, this, InfERPSupportPackage.ERP_PERSON__MEASUREMENT_VALUES, MeasPackage.MEASUREMENT_VALUE__ERP_PERSON);
		}
		return measurementValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityRecord> getActivityRecords() {
		if (activityRecords == null) {
			activityRecords = new EObjectWithInverseResolvingEList.ManyInverse<ActivityRecord>(ActivityRecord.class, this, InfERPSupportPackage.ERP_PERSON__ACTIVITY_RECORDS, CommonPackage.ACTIVITY_RECORD__ERP_PERSONS);
		}
		return activityRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Crew> getCrews() {
		if (crews == null) {
			crews = new EObjectWithInverseResolvingEList.ManyInverse<Crew>(Crew.class, this, InfERPSupportPackage.ERP_PERSON__CREWS, InfWorkPackage.CREW__CREW_MEMBERS);
		}
		return crews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Appointment> getAppointments() {
		if (appointments == null) {
			appointments = new EObjectWithInverseResolvingEList.ManyInverse<Appointment>(Appointment.class, this, InfERPSupportPackage.ERP_PERSON__APPOINTMENTS, InfWorkPackage.APPOINTMENT__ERP_PERSONS);
		}
		return appointments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPersonnel getErpPersonnel() {
		if (erpPersonnel != null && erpPersonnel.eIsProxy()) {
			InternalEObject oldErpPersonnel = (InternalEObject)erpPersonnel;
			erpPersonnel = (ErpPersonnel)eResolveProxy(oldErpPersonnel);
			if (erpPersonnel != oldErpPersonnel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_PERSON__ERP_PERSONNEL, oldErpPersonnel, erpPersonnel));
			}
		}
		return erpPersonnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPersonnel basicGetErpPersonnel() {
		return erpPersonnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpPersonnel(ErpPersonnel newErpPersonnel, NotificationChain msgs) {
		ErpPersonnel oldErpPersonnel = erpPersonnel;
		erpPersonnel = newErpPersonnel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PERSON__ERP_PERSONNEL, oldErpPersonnel, newErpPersonnel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpPersonnel(ErpPersonnel newErpPersonnel) {
		if (newErpPersonnel != erpPersonnel) {
			NotificationChain msgs = null;
			if (erpPersonnel != null)
				msgs = ((InternalEObject)erpPersonnel).eInverseRemove(this, InfERPSupportPackage.ERP_PERSONNEL__ERP_PERSONS, ErpPersonnel.class, msgs);
			if (newErpPersonnel != null)
				msgs = ((InternalEObject)newErpPersonnel).eInverseAdd(this, InfERPSupportPackage.ERP_PERSONNEL__ERP_PERSONS, ErpPersonnel.class, msgs);
			msgs = basicSetErpPersonnel(newErpPersonnel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PERSON__ERP_PERSONNEL, newErpPersonnel, newErpPersonnel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuffix() {
		return suffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuffix(String newSuffix) {
		String oldSuffix = suffix;
		suffix = newSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PERSON__SUFFIX, oldSuffix, suffix));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_PERSON__CUSTOMER_DATA, oldCustomerData, customerData));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PERSON__CUSTOMER_DATA, oldCustomerData, newCustomerData);
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
				msgs = ((InternalEObject)customerData).eInverseRemove(this, CustomersPackage.CUSTOMER__ERP_PERSONS, Customer.class, msgs);
			if (newCustomerData != null)
				msgs = ((InternalEObject)newCustomerData).eInverseAdd(this, CustomersPackage.CUSTOMER__ERP_PERSONS, Customer.class, msgs);
			msgs = basicSetCustomerData(newCustomerData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PERSON__CUSTOMER_DATA, newCustomerData, newCustomerData));
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
			case InfERPSupportPackage.ERP_PERSON__CALL_BACKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCallBacks()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__SERVICE_LOCATION:
				if (serviceLocation != null)
					msgs = ((InternalEObject)serviceLocation).eInverseRemove(this, CustomersPackage.SERVICE_LOCATION__ERP_PERSONS, ServiceLocation.class, msgs);
				return basicSetServiceLocation((ServiceLocation)otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__DOCUMENT_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocumentRoles()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__SWITCHING_STEP_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSwitchingStepRoles()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__CHANGE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChangeItems()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__SKILLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSkills()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__ERP_ORGANISATION_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpOrganisationRoles()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__LABOR_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLaborItems()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__CRAFTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCrafts()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__ERP_COMPETENCY:
				if (erpCompetency != null)
					msgs = ((InternalEObject)erpCompetency).eInverseRemove(this, InfERPSupportPackage.ERP_COMPETENCY__ERP_PERSONS, ErpCompetency.class, msgs);
				return basicSetErpCompetency((ErpCompetency)otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__LAND_PROPERTY_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLandPropertyRoles()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__MEASUREMENT_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurementValues()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__ACTIVITY_RECORDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityRecords()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__CREWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCrews()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__APPOINTMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAppointments()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__ERP_PERSONNEL:
				if (erpPersonnel != null)
					msgs = ((InternalEObject)erpPersonnel).eInverseRemove(this, InfERPSupportPackage.ERP_PERSONNEL__ERP_PERSONS, ErpPersonnel.class, msgs);
				return basicSetErpPersonnel((ErpPersonnel)otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__CUSTOMER_DATA:
				if (customerData != null)
					msgs = ((InternalEObject)customerData).eInverseRemove(this, CustomersPackage.CUSTOMER__ERP_PERSONS, Customer.class, msgs);
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
			case InfERPSupportPackage.ERP_PERSON__CALL_BACKS:
				return ((InternalEList<?>)getCallBacks()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__SERVICE_LOCATION:
				return basicSetServiceLocation(null, msgs);
			case InfERPSupportPackage.ERP_PERSON__DOCUMENT_ROLES:
				return ((InternalEList<?>)getDocumentRoles()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__SWITCHING_STEP_ROLES:
				return ((InternalEList<?>)getSwitchingStepRoles()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__CHANGE_ITEMS:
				return ((InternalEList<?>)getChangeItems()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__SKILLS:
				return ((InternalEList<?>)getSkills()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__ERP_ORGANISATION_ROLES:
				return ((InternalEList<?>)getErpOrganisationRoles()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__LABOR_ITEMS:
				return ((InternalEList<?>)getLaborItems()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__CRAFTS:
				return ((InternalEList<?>)getCrafts()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__ERP_COMPETENCY:
				return basicSetErpCompetency(null, msgs);
			case InfERPSupportPackage.ERP_PERSON__LAND_PROPERTY_ROLES:
				return ((InternalEList<?>)getLandPropertyRoles()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__MEASUREMENT_VALUES:
				return ((InternalEList<?>)getMeasurementValues()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__ACTIVITY_RECORDS:
				return ((InternalEList<?>)getActivityRecords()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__CREWS:
				return ((InternalEList<?>)getCrews()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__APPOINTMENTS:
				return ((InternalEList<?>)getAppointments()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__ERP_PERSONNEL:
				return basicSetErpPersonnel(null, msgs);
			case InfERPSupportPackage.ERP_PERSON__CUSTOMER_DATA:
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
			case InfERPSupportPackage.ERP_PERSON__CALL_BACKS:
				return getCallBacks();
			case InfERPSupportPackage.ERP_PERSON__SERVICE_LOCATION:
				if (resolve) return getServiceLocation();
				return basicGetServiceLocation();
			case InfERPSupportPackage.ERP_PERSON__DOCUMENT_ROLES:
				return getDocumentRoles();
			case InfERPSupportPackage.ERP_PERSON__CATEGORY:
				return getCategory();
			case InfERPSupportPackage.ERP_PERSON__FIRST_NAME:
				return getFirstName();
			case InfERPSupportPackage.ERP_PERSON__SWITCHING_STEP_ROLES:
				return getSwitchingStepRoles();
			case InfERPSupportPackage.ERP_PERSON__LAST_NAME:
				return getLastName();
			case InfERPSupportPackage.ERP_PERSON__CHANGE_ITEMS:
				return getChangeItems();
			case InfERPSupportPackage.ERP_PERSON__MNAME:
				return getMName();
			case InfERPSupportPackage.ERP_PERSON__SKILLS:
				return getSkills();
			case InfERPSupportPackage.ERP_PERSON__ELECTRONIC_ADDRESS:
				if (resolve) return getElectronicAddress();
				return basicGetElectronicAddress();
			case InfERPSupportPackage.ERP_PERSON__GOVERNMENT_ID:
				return getGovernmentID();
			case InfERPSupportPackage.ERP_PERSON__SPECIAL_NEED:
				return getSpecialNeed();
			case InfERPSupportPackage.ERP_PERSON__ERP_ORGANISATION_ROLES:
				return getErpOrganisationRoles();
			case InfERPSupportPackage.ERP_PERSON__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfERPSupportPackage.ERP_PERSON__PREFIX:
				return getPrefix();
			case InfERPSupportPackage.ERP_PERSON__LABOR_ITEMS:
				return getLaborItems();
			case InfERPSupportPackage.ERP_PERSON__CRAFTS:
				return getCrafts();
			case InfERPSupportPackage.ERP_PERSON__MOBILE_PHONE:
				if (resolve) return getMobilePhone();
				return basicGetMobilePhone();
			case InfERPSupportPackage.ERP_PERSON__ERP_COMPETENCY:
				if (resolve) return getErpCompetency();
				return basicGetErpCompetency();
			case InfERPSupportPackage.ERP_PERSON__LAND_PROPERTY_ROLES:
				return getLandPropertyRoles();
			case InfERPSupportPackage.ERP_PERSON__LANDLINE_PHONE:
				if (resolve) return getLandlinePhone();
				return basicGetLandlinePhone();
			case InfERPSupportPackage.ERP_PERSON__MEASUREMENT_VALUES:
				return getMeasurementValues();
			case InfERPSupportPackage.ERP_PERSON__ACTIVITY_RECORDS:
				return getActivityRecords();
			case InfERPSupportPackage.ERP_PERSON__CREWS:
				return getCrews();
			case InfERPSupportPackage.ERP_PERSON__APPOINTMENTS:
				return getAppointments();
			case InfERPSupportPackage.ERP_PERSON__ERP_PERSONNEL:
				if (resolve) return getErpPersonnel();
				return basicGetErpPersonnel();
			case InfERPSupportPackage.ERP_PERSON__SUFFIX:
				return getSuffix();
			case InfERPSupportPackage.ERP_PERSON__CUSTOMER_DATA:
				if (resolve) return getCustomerData();
				return basicGetCustomerData();
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
			case InfERPSupportPackage.ERP_PERSON__CALL_BACKS:
				getCallBacks().clear();
				getCallBacks().addAll((Collection<? extends CallBack>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__SERVICE_LOCATION:
				setServiceLocation((ServiceLocation)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__DOCUMENT_ROLES:
				getDocumentRoles().clear();
				getDocumentRoles().addAll((Collection<? extends DocErpPersonRole>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__CATEGORY:
				setCategory((String)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__SWITCHING_STEP_ROLES:
				getSwitchingStepRoles().clear();
				getSwitchingStepRoles().addAll((Collection<? extends ErpPersonScheduleStepRole>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__LAST_NAME:
				setLastName((String)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__CHANGE_ITEMS:
				getChangeItems().clear();
				getChangeItems().addAll((Collection<? extends ChangeItem>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__MNAME:
				setMName((String)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__SKILLS:
				getSkills().clear();
				getSkills().addAll((Collection<? extends Skill>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__ELECTRONIC_ADDRESS:
				setElectronicAddress((ElectronicAddress)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__GOVERNMENT_ID:
				setGovernmentID((String)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__SPECIAL_NEED:
				setSpecialNeed((String)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__ERP_ORGANISATION_ROLES:
				getErpOrganisationRoles().clear();
				getErpOrganisationRoles().addAll((Collection<? extends OrgErpPersonRole>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__STATUS:
				setStatus((Status)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__PREFIX:
				setPrefix((String)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__LABOR_ITEMS:
				getLaborItems().clear();
				getLaborItems().addAll((Collection<? extends LaborItem>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__CRAFTS:
				getCrafts().clear();
				getCrafts().addAll((Collection<? extends Craft>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__MOBILE_PHONE:
				setMobilePhone((TelephoneNumber)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__ERP_COMPETENCY:
				setErpCompetency((ErpCompetency)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__LAND_PROPERTY_ROLES:
				getLandPropertyRoles().clear();
				getLandPropertyRoles().addAll((Collection<? extends PersonPropertyRole>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__LANDLINE_PHONE:
				setLandlinePhone((TelephoneNumber)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__MEASUREMENT_VALUES:
				getMeasurementValues().clear();
				getMeasurementValues().addAll((Collection<? extends MeasurementValue>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__ACTIVITY_RECORDS:
				getActivityRecords().clear();
				getActivityRecords().addAll((Collection<? extends ActivityRecord>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__CREWS:
				getCrews().clear();
				getCrews().addAll((Collection<? extends Crew>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__APPOINTMENTS:
				getAppointments().clear();
				getAppointments().addAll((Collection<? extends Appointment>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__ERP_PERSONNEL:
				setErpPersonnel((ErpPersonnel)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__SUFFIX:
				setSuffix((String)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__CUSTOMER_DATA:
				setCustomerData((Customer)newValue);
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
			case InfERPSupportPackage.ERP_PERSON__CALL_BACKS:
				getCallBacks().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__SERVICE_LOCATION:
				setServiceLocation((ServiceLocation)null);
				return;
			case InfERPSupportPackage.ERP_PERSON__DOCUMENT_ROLES:
				getDocumentRoles().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_PERSON__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_PERSON__SWITCHING_STEP_ROLES:
				getSwitchingStepRoles().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_PERSON__CHANGE_ITEMS:
				getChangeItems().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__MNAME:
				setMName(MNAME_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_PERSON__SKILLS:
				getSkills().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__ELECTRONIC_ADDRESS:
				setElectronicAddress((ElectronicAddress)null);
				return;
			case InfERPSupportPackage.ERP_PERSON__GOVERNMENT_ID:
				setGovernmentID(GOVERNMENT_ID_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_PERSON__SPECIAL_NEED:
				setSpecialNeed(SPECIAL_NEED_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_PERSON__ERP_ORGANISATION_ROLES:
				getErpOrganisationRoles().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__STATUS:
				setStatus((Status)null);
				return;
			case InfERPSupportPackage.ERP_PERSON__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_PERSON__LABOR_ITEMS:
				getLaborItems().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__CRAFTS:
				getCrafts().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__MOBILE_PHONE:
				setMobilePhone((TelephoneNumber)null);
				return;
			case InfERPSupportPackage.ERP_PERSON__ERP_COMPETENCY:
				setErpCompetency((ErpCompetency)null);
				return;
			case InfERPSupportPackage.ERP_PERSON__LAND_PROPERTY_ROLES:
				getLandPropertyRoles().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__LANDLINE_PHONE:
				setLandlinePhone((TelephoneNumber)null);
				return;
			case InfERPSupportPackage.ERP_PERSON__MEASUREMENT_VALUES:
				getMeasurementValues().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__ACTIVITY_RECORDS:
				getActivityRecords().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__CREWS:
				getCrews().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__APPOINTMENTS:
				getAppointments().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__ERP_PERSONNEL:
				setErpPersonnel((ErpPersonnel)null);
				return;
			case InfERPSupportPackage.ERP_PERSON__SUFFIX:
				setSuffix(SUFFIX_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_PERSON__CUSTOMER_DATA:
				setCustomerData((Customer)null);
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
			case InfERPSupportPackage.ERP_PERSON__CALL_BACKS:
				return callBacks != null && !callBacks.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__SERVICE_LOCATION:
				return serviceLocation != null;
			case InfERPSupportPackage.ERP_PERSON__DOCUMENT_ROLES:
				return documentRoles != null && !documentRoles.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case InfERPSupportPackage.ERP_PERSON__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case InfERPSupportPackage.ERP_PERSON__SWITCHING_STEP_ROLES:
				return switchingStepRoles != null && !switchingStepRoles.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case InfERPSupportPackage.ERP_PERSON__CHANGE_ITEMS:
				return changeItems != null && !changeItems.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__MNAME:
				return MNAME_EDEFAULT == null ? mName != null : !MNAME_EDEFAULT.equals(mName);
			case InfERPSupportPackage.ERP_PERSON__SKILLS:
				return skills != null && !skills.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__ELECTRONIC_ADDRESS:
				return electronicAddress != null;
			case InfERPSupportPackage.ERP_PERSON__GOVERNMENT_ID:
				return GOVERNMENT_ID_EDEFAULT == null ? governmentID != null : !GOVERNMENT_ID_EDEFAULT.equals(governmentID);
			case InfERPSupportPackage.ERP_PERSON__SPECIAL_NEED:
				return SPECIAL_NEED_EDEFAULT == null ? specialNeed != null : !SPECIAL_NEED_EDEFAULT.equals(specialNeed);
			case InfERPSupportPackage.ERP_PERSON__ERP_ORGANISATION_ROLES:
				return erpOrganisationRoles != null && !erpOrganisationRoles.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__STATUS:
				return status != null;
			case InfERPSupportPackage.ERP_PERSON__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case InfERPSupportPackage.ERP_PERSON__LABOR_ITEMS:
				return laborItems != null && !laborItems.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__CRAFTS:
				return crafts != null && !crafts.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__MOBILE_PHONE:
				return mobilePhone != null;
			case InfERPSupportPackage.ERP_PERSON__ERP_COMPETENCY:
				return erpCompetency != null;
			case InfERPSupportPackage.ERP_PERSON__LAND_PROPERTY_ROLES:
				return landPropertyRoles != null && !landPropertyRoles.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__LANDLINE_PHONE:
				return landlinePhone != null;
			case InfERPSupportPackage.ERP_PERSON__MEASUREMENT_VALUES:
				return measurementValues != null && !measurementValues.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__ACTIVITY_RECORDS:
				return activityRecords != null && !activityRecords.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__CREWS:
				return crews != null && !crews.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__APPOINTMENTS:
				return appointments != null && !appointments.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__ERP_PERSONNEL:
				return erpPersonnel != null;
			case InfERPSupportPackage.ERP_PERSON__SUFFIX:
				return SUFFIX_EDEFAULT == null ? suffix != null : !SUFFIX_EDEFAULT.equals(suffix);
			case InfERPSupportPackage.ERP_PERSON__CUSTOMER_DATA:
				return customerData != null;
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
		result.append(" (category: ");
		result.append(category);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", mName: ");
		result.append(mName);
		result.append(", governmentID: ");
		result.append(governmentID);
		result.append(", specialNeed: ");
		result.append(specialNeed);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(", suffix: ");
		result.append(suffix);
		result.append(')');
		return result.toString();
	}

} //ErpPersonImpl
