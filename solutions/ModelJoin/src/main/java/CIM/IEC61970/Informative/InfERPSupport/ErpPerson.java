/**
 */
package CIM.IEC61970.Informative.InfERPSupport;

import CIM.IEC61968.Common.ActivityRecord;
import CIM.IEC61968.Common.ElectronicAddress;
import CIM.IEC61968.Common.Status;
import CIM.IEC61968.Common.TelephoneNumber;

import CIM.IEC61968.Customers.Customer;
import CIM.IEC61968.Customers.ServiceLocation;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfCommon.Craft;
import CIM.IEC61970.Informative.InfCommon.Skill;

import CIM.IEC61970.Informative.InfLocations.PersonPropertyRole;

import CIM.IEC61970.Informative.InfOperations.CallBack;
import CIM.IEC61970.Informative.InfOperations.ChangeItem;
import CIM.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole;

import CIM.IEC61970.Informative.InfWork.Appointment;
import CIM.IEC61970.Informative.InfWork.Crew;
import CIM.IEC61970.Informative.InfWork.LaborItem;

import CIM.IEC61970.Meas.MeasurementValue;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getCallBacks <em>Call Backs</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getServiceLocation <em>Service Location</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getDocumentRoles <em>Document Roles</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getCategory <em>Category</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getFirstName <em>First Name</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getSwitchingStepRoles <em>Switching Step Roles</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getLastName <em>Last Name</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getMName <em>MName</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getSkills <em>Skills</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getGovernmentID <em>Government ID</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getSpecialNeed <em>Special Need</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getErpOrganisationRoles <em>Erp Organisation Roles</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getLaborItems <em>Labor Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getCrafts <em>Crafts</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getMobilePhone <em>Mobile Phone</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getErpCompetency <em>Erp Competency</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getLandPropertyRoles <em>Land Property Roles</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getLandlinePhone <em>Landline Phone</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getMeasurementValues <em>Measurement Values</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getActivityRecords <em>Activity Records</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getCrews <em>Crews</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getAppointments <em>Appointments</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getErpPersonnel <em>Erp Personnel</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getCustomerData <em>Customer Data</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='General purpose information for name and other information to contact people.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='General purpose information for name and other information to contact people.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='General purpose information for name and other information to contact people.' Profile\040documentation='General purpose information for name and other information to contact people.'"
 * @generated
 */
public interface ErpPerson extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Call Backs</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.CallBack}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.CallBack#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Backs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Backs</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_CallBacks()
	 * @see CIM.IEC61970.Informative.InfOperations.CallBack#getErpPersons
	 * @model opposite="ErpPersons"
	 * @generated
	 */
	EList<CallBack> getCallBacks();

	/**
	 * Returns the value of the '<em><b>Service Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Customers.ServiceLocation#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Location</em>' reference.
	 * @see #setServiceLocation(ServiceLocation)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_ServiceLocation()
	 * @see CIM.IEC61968.Customers.ServiceLocation#getErpPersons
	 * @model opposite="ErpPersons"
	 * @generated
	 */
	ServiceLocation getServiceLocation();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getServiceLocation <em>Service Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Location</em>' reference.
	 * @see #getServiceLocation()
	 * @generated
	 */
	void setServiceLocation(ServiceLocation value);

	/**
	 * Returns the value of the '<em><b>Document Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.DocErpPersonRole}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.DocErpPersonRole#getErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Roles</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_DocumentRoles()
	 * @see CIM.IEC61970.Informative.InfERPSupport.DocErpPersonRole#getErpPerson
	 * @model opposite="ErpPerson"
	 * @generated
	 */
	EList<DocErpPersonRole> getDocumentRoles();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_Category()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Category of this person relative to utility operations, classified according to the utility\'s corporate standards and practices. Examples include employee, contractor, agent, not affiliated, etc.\nNote that this field is not used to indicate whether this person is a customer of the utility. Often an employee or contractor is also a customer. Customer information is gained with relationship to Organisation and CustomerData. In similar fashion, this field does not indicate the various roles this person may fill as part of utility operations.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Category of this person relative to utility operations, classified according to the utility\'s corporate standards and practices. Examples include employee, contractor, agent, not affiliated, etc.\nNote that this field is not used to indicate whether this person is a customer of the utility. Often an employee or contractor is also a customer. Customer information is gained with relationship to Organisation and CustomerData. In similar fashion, this field does not indicate the various roles this person may fill as part of utility operations.'"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_FirstName()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Person\'s first name.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Person\'s first name.'"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Switching Step Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole#getErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switching Step Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switching Step Roles</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_SwitchingStepRoles()
	 * @see CIM.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole#getErpPerson
	 * @model opposite="ErpPerson"
	 * @generated
	 */
	EList<ErpPersonScheduleStepRole> getSwitchingStepRoles();

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_LastName()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Person\'s last (family, sir) name.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Person\'s last (family, sir) name.'"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Change Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.ChangeItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_ChangeItems()
	 * @see CIM.IEC61970.Informative.InfOperations.ChangeItem#getErpPerson
	 * @model opposite="ErpPerson"
	 * @generated
	 */
	EList<ChangeItem> getChangeItems();

	/**
	 * Returns the value of the '<em><b>MName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MName</em>' attribute.
	 * @see #setMName(String)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_MName()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Middle name(s) or initial(s).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Middle name(s) or initial(s).'"
	 * @generated
	 */
	String getMName();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getMName <em>MName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MName</em>' attribute.
	 * @see #getMName()
	 * @generated
	 */
	void setMName(String value);

	/**
	 * Returns the value of the '<em><b>Skills</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfCommon.Skill}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfCommon.Skill#getErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skills</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skills</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_Skills()
	 * @see CIM.IEC61970.Informative.InfCommon.Skill#getErpPerson
	 * @model opposite="ErpPerson"
	 * @generated
	 */
	EList<Skill> getSkills();

	/**
	 * Returns the value of the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electronic Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electronic Address</em>' reference.
	 * @see #setElectronicAddress(ElectronicAddress)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_ElectronicAddress()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Electronic address.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Electronic address.'"
	 * @generated
	 */
	ElectronicAddress getElectronicAddress();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getElectronicAddress <em>Electronic Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electronic Address</em>' reference.
	 * @see #getElectronicAddress()
	 * @generated
	 */
	void setElectronicAddress(ElectronicAddress value);

	/**
	 * Returns the value of the '<em><b>Government ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Government ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Government ID</em>' attribute.
	 * @see #setGovernmentID(String)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_GovernmentID()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Unique identifier for person relative to its governing authority, for example a federal tax identifier (such as a Social Security number in the United States).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Unique identifier for person relative to its governing authority, for example a federal tax identifier (such as a Social Security number in the United States).'"
	 * @generated
	 */
	String getGovernmentID();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getGovernmentID <em>Government ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Government ID</em>' attribute.
	 * @see #getGovernmentID()
	 * @generated
	 */
	void setGovernmentID(String value);

	/**
	 * Returns the value of the '<em><b>Special Need</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Need</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Need</em>' attribute.
	 * @see #setSpecialNeed(String)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_SpecialNeed()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Special service needs for the person (contact) are described; examples include life support, etc.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Special service needs for the person (contact) are described; examples include life support, etc.'"
	 * @generated
	 */
	String getSpecialNeed();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getSpecialNeed <em>Special Need</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Need</em>' attribute.
	 * @see #getSpecialNeed()
	 * @generated
	 */
	void setSpecialNeed(String value);

	/**
	 * Returns the value of the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.OrgErpPersonRole}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Organisation Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Organisation Roles</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_ErpOrganisationRoles()
	 * @see CIM.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getErpPerson
	 * @model opposite="ErpPerson"
	 * @generated
	 */
	EList<OrgErpPersonRole> getErpOrganisationRoles();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Status)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_Prefix()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A prefix or title for the person\'s name, such as Miss, Mister, Doctor, etc.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A prefix or title for the person\'s name, such as Miss, Mister, Doctor, etc.'"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Labor Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.LaborItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.LaborItem#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labor Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labor Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_LaborItems()
	 * @see CIM.IEC61970.Informative.InfWork.LaborItem#getErpPersons
	 * @model opposite="ErpPersons"
	 * @generated
	 */
	EList<LaborItem> getLaborItems();

	/**
	 * Returns the value of the '<em><b>Crafts</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfCommon.Craft}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfCommon.Craft#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crafts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crafts</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_Crafts()
	 * @see CIM.IEC61970.Informative.InfCommon.Craft#getErpPersons
	 * @model opposite="ErpPersons"
	 * @generated
	 */
	EList<Craft> getCrafts();

	/**
	 * Returns the value of the '<em><b>Mobile Phone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mobile Phone</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mobile Phone</em>' reference.
	 * @see #setMobilePhone(TelephoneNumber)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_MobilePhone()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Mobile phone number.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Mobile phone number.'"
	 * @generated
	 */
	TelephoneNumber getMobilePhone();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getMobilePhone <em>Mobile Phone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mobile Phone</em>' reference.
	 * @see #getMobilePhone()
	 * @generated
	 */
	void setMobilePhone(TelephoneNumber value);

	/**
	 * Returns the value of the '<em><b>Erp Competency</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpCompetency#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Competency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Competency</em>' reference.
	 * @see #setErpCompetency(ErpCompetency)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_ErpCompetency()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpCompetency#getErpPersons
	 * @model opposite="ErpPersons"
	 * @generated
	 */
	ErpCompetency getErpCompetency();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getErpCompetency <em>Erp Competency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Competency</em>' reference.
	 * @see #getErpCompetency()
	 * @generated
	 */
	void setErpCompetency(ErpCompetency value);

	/**
	 * Returns the value of the '<em><b>Land Property Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfLocations.PersonPropertyRole}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfLocations.PersonPropertyRole#getErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Land Property Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Land Property Roles</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_LandPropertyRoles()
	 * @see CIM.IEC61970.Informative.InfLocations.PersonPropertyRole#getErpPerson
	 * @model opposite="ErpPerson"
	 * @generated
	 */
	EList<PersonPropertyRole> getLandPropertyRoles();

	/**
	 * Returns the value of the '<em><b>Landline Phone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Landline Phone</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landline Phone</em>' reference.
	 * @see #setLandlinePhone(TelephoneNumber)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_LandlinePhone()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Landline phone number.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Landline phone number.'"
	 * @generated
	 */
	TelephoneNumber getLandlinePhone();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getLandlinePhone <em>Landline Phone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Landline Phone</em>' reference.
	 * @see #getLandlinePhone()
	 * @generated
	 */
	void setLandlinePhone(TelephoneNumber value);

	/**
	 * Returns the value of the '<em><b>Measurement Values</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Meas.MeasurementValue}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.MeasurementValue#getErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Values</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_MeasurementValues()
	 * @see CIM.IEC61970.Meas.MeasurementValue#getErpPerson
	 * @model opposite="ErpPerson"
	 * @generated
	 */
	EList<MeasurementValue> getMeasurementValues();

	/**
	 * Returns the value of the '<em><b>Activity Records</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Common.ActivityRecord}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Common.ActivityRecord#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Records</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Records</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_ActivityRecords()
	 * @see CIM.IEC61968.Common.ActivityRecord#getErpPersons
	 * @model opposite="ErpPersons"
	 * @generated
	 */
	EList<ActivityRecord> getActivityRecords();

	/**
	 * Returns the value of the '<em><b>Crews</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.Crew}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.Crew#getCrewMembers <em>Crew Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crews</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crews</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_Crews()
	 * @see CIM.IEC61970.Informative.InfWork.Crew#getCrewMembers
	 * @model opposite="CrewMembers"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All Crews to which this ErpPerson belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All Crews to which this ErpPerson belongs.'"
	 * @generated
	 */
	EList<Crew> getCrews();

	/**
	 * Returns the value of the '<em><b>Appointments</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.Appointment}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.Appointment#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appointments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appointments</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_Appointments()
	 * @see CIM.IEC61970.Informative.InfWork.Appointment#getErpPersons
	 * @model opposite="ErpPersons"
	 * @generated
	 */
	EList<Appointment> getAppointments();

	/**
	 * Returns the value of the '<em><b>Erp Personnel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPersonnel#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Personnel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Personnel</em>' reference.
	 * @see #setErpPersonnel(ErpPersonnel)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_ErpPersonnel()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpPersonnel#getErpPersons
	 * @model opposite="ErpPersons"
	 * @generated
	 */
	ErpPersonnel getErpPersonnel();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getErpPersonnel <em>Erp Personnel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Personnel</em>' reference.
	 * @see #getErpPersonnel()
	 * @generated
	 */
	void setErpPersonnel(ErpPersonnel value);

	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffix</em>' attribute.
	 * @see #setSuffix(String)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_Suffix()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A suffix for the person\'s name, such as II, III, etc.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A suffix for the person\'s name, such as II, III, etc.'"
	 * @generated
	 */
	String getSuffix();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getSuffix <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suffix</em>' attribute.
	 * @see #getSuffix()
	 * @generated
	 */
	void setSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Customer Data</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Customers.Customer#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Data</em>' reference.
	 * @see #setCustomerData(Customer)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson_CustomerData()
	 * @see CIM.IEC61968.Customers.Customer#getErpPersons
	 * @model opposite="ErpPersons"
	 * @generated
	 */
	Customer getCustomerData();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getCustomerData <em>Customer Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Data</em>' reference.
	 * @see #getCustomerData()
	 * @generated
	 */
	void setCustomerData(Customer value);

} // ErpPerson
