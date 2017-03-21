/**
 */
package CIM.IEC61968.Common;

import CIM.CIMPackage;

import CIM.IEC61970.Core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CIM.IEC61968.Common.CommonFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This package contains the information classes that support distribution management in general.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This package contains the information classes that support distribution management in general.'"
 * @generated
 */
public interface CommonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#Common";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimCommon";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonPackage eINSTANCE = CIM.IEC61968.Common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Common.impl.DateTimeIntervalImpl <em>Date Time Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Common.impl.DateTimeIntervalImpl
	 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getDateTimeInterval()
	 * @generated
	 */
	int DATE_TIME_INTERVAL = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_INTERVAL__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_INTERVAL__START = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_INTERVAL__END = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Date Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_INTERVAL_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Date Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_INTERVAL_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Common.impl.PostalAddressImpl <em>Postal Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Common.impl.PostalAddressImpl
	 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getPostalAddress()
	 * @generated
	 */
	int POSTAL_ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Town Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__TOWN_DETAIL = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Street Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__STREET_DETAIL = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__POSTAL_CODE = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Po Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__PO_BOX = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Postal Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Postal Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Common.impl.OrganisationImpl <em>Organisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Common.impl.OrganisationImpl
	 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getOrganisation()
	 * @generated
	 */
	int ORGANISATION = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Street Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__STREET_ADDRESS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__ELECTRONIC_ADDRESS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Postal Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__POSTAL_ADDRESS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Phone1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__PHONE1 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Phone2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__PHONE2 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Market Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__MARKET_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Business Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__BUSINESS_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Common.impl.TelephoneNumberImpl <em>Telephone Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Common.impl.TelephoneNumberImpl
	 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getTelephoneNumber()
	 * @generated
	 */
	int TELEPHONE_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER__COUNTRY_CODE = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>City Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER__CITY_CODE = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Local Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER__LOCAL_NUMBER = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Area Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER__AREA_CODE = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER__EXTENSION = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Telephone Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Telephone Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Common.impl.StreetAddressImpl <em>Street Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Common.impl.StreetAddressImpl
	 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getStreetAddress()
	 * @generated
	 */
	int STREET_ADDRESS = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_ADDRESS__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Street Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_ADDRESS__STREET_DETAIL = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_ADDRESS__STATUS = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Town Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_ADDRESS__TOWN_DETAIL = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Street Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_ADDRESS_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Street Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_ADDRESS_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Common.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Common.impl.DocumentImpl
	 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__SUBJECT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__SCHEDULED_EVENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ERP_ORGANISATION_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CREATED_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TO_DOCUMENT_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ASSET_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ERP_PERSON_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__REVISION_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ELECTRONIC_ADDRESS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NETWORK_DATA_SETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CATEGORY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ACTIVITY_RECORDS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__MEASUREMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__FROM_DOCUMENT_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__LAST_MODIFIED_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CHANGE_SETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOC_STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CHANGE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__SCHEDULE_PARAMETER_INFOS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TITLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 22;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Common.impl.TimeScheduleImpl <em>Time Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Common.impl.TimeScheduleImpl
	 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getTimeSchedule()
	 * @generated
	 */
	int TIME_SCHEDULE = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__UUID = DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__MRID = DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__NAME = DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__DESCRIPTION = DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__PATH_NAME = DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__MODELING_AUTHORITY_SET = DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__LOCAL_NAME = DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__ALIAS_NAME = DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__SUBJECT = DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__SCHEDULED_EVENTS = DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__ERP_ORGANISATION_ROLES = DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__CREATED_DATE_TIME = DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__TO_DOCUMENT_ROLES = DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__ASSET_ROLES = DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__ERP_PERSON_ROLES = DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__REVISION_NUMBER = DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__ELECTRONIC_ADDRESS = DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__STATUS = DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__NETWORK_DATA_SETS = DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__POWER_SYSTEM_RESOURCE_ROLES = DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__CATEGORY = DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__ACTIVITY_RECORDS = DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__MEASUREMENTS = DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__FROM_DOCUMENT_ROLES = DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__LAST_MODIFIED_DATE_TIME = DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__CHANGE_SETS = DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__DOC_STATUS = DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__CHANGE_ITEMS = DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__SCHEDULE_PARAMETER_INFOS = DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__TITLE = DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Recurrence Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__RECURRENCE_PATTERN = DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schedule Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__SCHEDULE_INTERVAL = DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__DISABLED = DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Recurrence Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__RECURRENCE_PERIOD = DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__TIME_POINTS = DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE__OFFSET = DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Time Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_FEATURE_COUNT = DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Time Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_OPERATION_COUNT = DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Common.impl.PositionPointImpl <em>Position Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Common.impl.PositionPointImpl
	 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getPositionPoint()
	 * @generated
	 */
	int POSITION_POINT = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Coordinate System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT__COORDINATE_SYSTEM = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT__SEQUENCE_NUMBER = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT__XPOSITION = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT__YPOSITION = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>ZPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT__ZPOSITION = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT__LOCATION = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Position Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Position Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Common.impl.CoordinateSystemImpl <em>Coordinate System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Common.impl.CoordinateSystemImpl
	 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getCoordinateSystem()
	 * @generated
	 */
	int COORDINATE_SYSTEM = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Gml Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM__GML_DIAGRAM_OBJECTS = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM__DIAGRAMS = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM__LOCATION = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Position Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM__POSITION_POINTS = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM__NAME = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Coordinate System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Coordinate System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Common.impl.UserAttributeImpl <em>User Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Common.impl.UserAttributeImpl
	 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getUserAttribute()
	 * @generated
	 */
	int USER_ATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Property Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE__PROPERTY_SPECIFICATION = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pass Through Bills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE__PASS_THROUGH_BILLS = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE__TRANSACTION = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE__SEQUENCE_NUMBER = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rating Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE__RATING_ASSETS = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Erp Ledger Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE__ERP_LEDGER_ENTRIES = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Property Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE__PROPERTY_ASSETS = CIMPackage.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Erp Statement Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE__ERP_STATEMENT_LINE_ITEMS = CIMPackage.ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Erp Invoice Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE__ERP_INVOICE_LINE_ITEMS = CIMPackage.ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE__PROCEDURE_DATA_SETS = CIMPackage.ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE__NAME = CIMPackage.ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Rating Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE__RATING_SPECIFICATION = CIMPackage.ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE__PROCEDURE = CIMPackage.ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Bill Determinants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE__BILL_DETERMINANTS = CIMPackage.ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE__VALUE = CIMPackage.ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>User Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>User Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Common.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Common.impl.LocationImpl
	 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Secondary Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__SECONDARY_ADDRESS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__MEASUREMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Directions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DIRECTIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__POWER_SYSTEM_RESOURCES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Phone2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__PHONE2 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Phone1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__PHONE1 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Land Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LAND_PROPERTIES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Geo Info Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__GEO_INFO_REFERENCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DIMENSIONS_INFO = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CHANGE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Erp Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ERP_ORGANISATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Coordinate Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__COORDINATE_SYSTEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ASSETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ROUTES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Hazards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__HAZARDS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CATEGORY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Main Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__MAIN_ADDRESS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ELECTRONIC_ADDRESS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CORPORATE_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Red Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__RED_LINES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DIRECTION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CREWS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__POSITION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 24;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Common.impl.StreetDetailImpl <em>Street Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Common.impl.StreetDetailImpl
	 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getStreetDetail()
	 * @generated
	 */
	int STREET_DETAIL = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_DETAIL__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_DETAIL__NAME = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_DETAIL__PREFIX = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Building Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_DETAIL__BUILDING_NAME = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Suite Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_DETAIL__SUITE_NUMBER = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Within Town Limits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_DETAIL__WITHIN_TOWN_LIMITS = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Address General</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_DETAIL__ADDRESS_GENERAL = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_DETAIL__NUMBER = CIMPackage.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_DETAIL__SUFFIX = CIMPackage.ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_DETAIL__TYPE = CIMPackage.ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_DETAIL__CODE = CIMPackage.ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Street Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_DETAIL_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Street Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_DETAIL_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Common.impl.AgreementImpl <em>Agreement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Common.impl.AgreementImpl
	 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getAgreement()
	 * @generated
	 */
	int AGREEMENT = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__UUID = DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__MRID = DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__NAME = DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__DESCRIPTION = DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__PATH_NAME = DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__MODELING_AUTHORITY_SET = DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__LOCAL_NAME = DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__ALIAS_NAME = DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__SUBJECT = DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__SCHEDULED_EVENTS = DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__ERP_ORGANISATION_ROLES = DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__CREATED_DATE_TIME = DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__TO_DOCUMENT_ROLES = DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__ASSET_ROLES = DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__ERP_PERSON_ROLES = DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__REVISION_NUMBER = DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__ELECTRONIC_ADDRESS = DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__STATUS = DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__NETWORK_DATA_SETS = DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__POWER_SYSTEM_RESOURCE_ROLES = DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__CATEGORY = DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__ACTIVITY_RECORDS = DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__MEASUREMENTS = DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__FROM_DOCUMENT_ROLES = DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__LAST_MODIFIED_DATE_TIME = DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__CHANGE_SETS = DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__DOC_STATUS = DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__CHANGE_ITEMS = DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__SCHEDULE_PARAMETER_INFOS = DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__TITLE = DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Sign Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__SIGN_DATE = DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Validity Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__VALIDITY_INTERVAL = DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_FEATURE_COUNT = DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_OPERATION_COUNT = DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Common.impl.ActivityRecordImpl <em>Activity Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Common.impl.ActivityRecordImpl
	 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getActivityRecord()
	 * @generated
	 */
	int ACTIVITY_RECORD = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RECORD__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RECORD__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RECORD__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RECORD__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RECORD__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RECORD__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RECORD__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RECORD__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Market Factors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RECORD__MARKET_FACTORS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RECORD__ASSETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RECORD__SEVERITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scheduled Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RECORD__SCHEDULED_EVENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RECORD__CATEGORY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RECORD__REASON = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RECORD__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RECORD__DOCUMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RECORD__ORGANISATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RECORD__CREATED_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Erp Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RECORD__ERP_PERSONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Activity Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RECORD_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Activity Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RECORD_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Common.impl.ElectronicAddressImpl <em>Electronic Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Common.impl.ElectronicAddressImpl
	 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getElectronicAddress()
	 * @generated
	 */
	int ELECTRONIC_ADDRESS = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_ADDRESS__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Lan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_ADDRESS__LAN = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_ADDRESS__EMAIL = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_ADDRESS__USER_ID = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_ADDRESS__STATUS = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Web</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_ADDRESS__WEB = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_ADDRESS__PASSWORD = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Radio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_ADDRESS__RADIO = CIMPackage.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Electronic Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_ADDRESS_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Electronic Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_ADDRESS_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Common.impl.StatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Common.impl.StatusImpl
	 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__REASON = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__VALUE = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__REMARK = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__DATE_TIME = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Common.impl.TownDetailImpl <em>Town Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Common.impl.TownDetailImpl
	 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getTownDetail()
	 * @generated
	 */
	int TOWN_DETAIL = 16;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN_DETAIL__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN_DETAIL__COUNTRY = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN_DETAIL__CODE = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN_DETAIL__NAME = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN_DETAIL__SECTION = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>State Or Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN_DETAIL__STATE_OR_PROVINCE = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Town Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN_DETAIL_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Town Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN_DETAIL_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.Common.impl.TimePointImpl <em>Time Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.Common.impl.TimePointImpl
	 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getTimePoint()
	 * @generated
	 */
	int TIME_POINT = 17;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT__SEQUENCE_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT__SCHEDULED_EVENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Relative Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT__RELATIVE_TIME_INTERVAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT__WINDOW = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT__DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Time Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT__TIME_SCHEDULE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Time Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Time Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.Common.DateTimeInterval <em>Date Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Interval</em>'.
	 * @see CIM.IEC61968.Common.DateTimeInterval
	 * @generated
	 */
	EClass getDateTimeInterval();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.DateTimeInterval#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see CIM.IEC61968.Common.DateTimeInterval#getStart()
	 * @see #getDateTimeInterval()
	 * @generated
	 */
	EAttribute getDateTimeInterval_Start();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.DateTimeInterval#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see CIM.IEC61968.Common.DateTimeInterval#getEnd()
	 * @see #getDateTimeInterval()
	 * @generated
	 */
	EAttribute getDateTimeInterval_End();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.Common.PostalAddress <em>Postal Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Address</em>'.
	 * @see CIM.IEC61968.Common.PostalAddress
	 * @generated
	 */
	EClass getPostalAddress();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.PostalAddress#getTownDetail <em>Town Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Town Detail</em>'.
	 * @see CIM.IEC61968.Common.PostalAddress#getTownDetail()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EReference getPostalAddress_TownDetail();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.PostalAddress#getStreetDetail <em>Street Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Street Detail</em>'.
	 * @see CIM.IEC61968.Common.PostalAddress#getStreetDetail()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EReference getPostalAddress_StreetDetail();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.PostalAddress#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see CIM.IEC61968.Common.PostalAddress#getPostalCode()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.PostalAddress#getPoBox <em>Po Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Po Box</em>'.
	 * @see CIM.IEC61968.Common.PostalAddress#getPoBox()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_PoBox();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.Common.Organisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisation</em>'.
	 * @see CIM.IEC61968.Common.Organisation
	 * @generated
	 */
	EClass getOrganisation();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.Organisation#getStreetAddress <em>Street Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Street Address</em>'.
	 * @see CIM.IEC61968.Common.Organisation#getStreetAddress()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_StreetAddress();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.Organisation#getElectronicAddress <em>Electronic Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Electronic Address</em>'.
	 * @see CIM.IEC61968.Common.Organisation#getElectronicAddress()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_ElectronicAddress();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.Organisation#getPostalAddress <em>Postal Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Postal Address</em>'.
	 * @see CIM.IEC61968.Common.Organisation#getPostalAddress()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_PostalAddress();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.Organisation#getPhone1 <em>Phone1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phone1</em>'.
	 * @see CIM.IEC61968.Common.Organisation#getPhone1()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_Phone1();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.Organisation#getPhone2 <em>Phone2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phone2</em>'.
	 * @see CIM.IEC61968.Common.Organisation#getPhone2()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_Phone2();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Organisation#getMarketRoles <em>Market Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Market Roles</em>'.
	 * @see CIM.IEC61968.Common.Organisation#getMarketRoles()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_MarketRoles();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Organisation#getBusinessRoles <em>Business Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Business Roles</em>'.
	 * @see CIM.IEC61968.Common.Organisation#getBusinessRoles()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_BusinessRoles();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.Common.TelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Telephone Number</em>'.
	 * @see CIM.IEC61968.Common.TelephoneNumber
	 * @generated
	 */
	EClass getTelephoneNumber();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.TelephoneNumber#getCountryCode <em>Country Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Code</em>'.
	 * @see CIM.IEC61968.Common.TelephoneNumber#getCountryCode()
	 * @see #getTelephoneNumber()
	 * @generated
	 */
	EAttribute getTelephoneNumber_CountryCode();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.TelephoneNumber#getCityCode <em>City Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City Code</em>'.
	 * @see CIM.IEC61968.Common.TelephoneNumber#getCityCode()
	 * @see #getTelephoneNumber()
	 * @generated
	 */
	EAttribute getTelephoneNumber_CityCode();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.TelephoneNumber#getLocalNumber <em>Local Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Number</em>'.
	 * @see CIM.IEC61968.Common.TelephoneNumber#getLocalNumber()
	 * @see #getTelephoneNumber()
	 * @generated
	 */
	EAttribute getTelephoneNumber_LocalNumber();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.TelephoneNumber#getAreaCode <em>Area Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area Code</em>'.
	 * @see CIM.IEC61968.Common.TelephoneNumber#getAreaCode()
	 * @see #getTelephoneNumber()
	 * @generated
	 */
	EAttribute getTelephoneNumber_AreaCode();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.TelephoneNumber#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see CIM.IEC61968.Common.TelephoneNumber#getExtension()
	 * @see #getTelephoneNumber()
	 * @generated
	 */
	EAttribute getTelephoneNumber_Extension();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.Common.StreetAddress <em>Street Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Street Address</em>'.
	 * @see CIM.IEC61968.Common.StreetAddress
	 * @generated
	 */
	EClass getStreetAddress();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.StreetAddress#getStreetDetail <em>Street Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Street Detail</em>'.
	 * @see CIM.IEC61968.Common.StreetAddress#getStreetDetail()
	 * @see #getStreetAddress()
	 * @generated
	 */
	EReference getStreetAddress_StreetDetail();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.StreetAddress#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61968.Common.StreetAddress#getStatus()
	 * @see #getStreetAddress()
	 * @generated
	 */
	EReference getStreetAddress_Status();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.StreetAddress#getTownDetail <em>Town Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Town Detail</em>'.
	 * @see CIM.IEC61968.Common.StreetAddress#getTownDetail()
	 * @see #getStreetAddress()
	 * @generated
	 */
	EReference getStreetAddress_TownDetail();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.Common.TimeSchedule <em>Time Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Schedule</em>'.
	 * @see CIM.IEC61968.Common.TimeSchedule
	 * @generated
	 */
	EClass getTimeSchedule();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.TimeSchedule#getRecurrencePattern <em>Recurrence Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurrence Pattern</em>'.
	 * @see CIM.IEC61968.Common.TimeSchedule#getRecurrencePattern()
	 * @see #getTimeSchedule()
	 * @generated
	 */
	EAttribute getTimeSchedule_RecurrencePattern();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.TimeSchedule#getScheduleInterval <em>Schedule Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schedule Interval</em>'.
	 * @see CIM.IEC61968.Common.TimeSchedule#getScheduleInterval()
	 * @see #getTimeSchedule()
	 * @generated
	 */
	EReference getTimeSchedule_ScheduleInterval();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.TimeSchedule#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see CIM.IEC61968.Common.TimeSchedule#isDisabled()
	 * @see #getTimeSchedule()
	 * @generated
	 */
	EAttribute getTimeSchedule_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.TimeSchedule#getRecurrencePeriod <em>Recurrence Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurrence Period</em>'.
	 * @see CIM.IEC61968.Common.TimeSchedule#getRecurrencePeriod()
	 * @see #getTimeSchedule()
	 * @generated
	 */
	EAttribute getTimeSchedule_RecurrencePeriod();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.TimeSchedule#getTimePoints <em>Time Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Points</em>'.
	 * @see CIM.IEC61968.Common.TimeSchedule#getTimePoints()
	 * @see #getTimeSchedule()
	 * @generated
	 */
	EReference getTimeSchedule_TimePoints();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.TimeSchedule#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see CIM.IEC61968.Common.TimeSchedule#getOffset()
	 * @see #getTimeSchedule()
	 * @generated
	 */
	EAttribute getTimeSchedule_Offset();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.Common.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see CIM.IEC61968.Common.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.Document#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see CIM.IEC61968.Common.Document#getSubject()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Subject();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Document#getScheduledEvents <em>Scheduled Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scheduled Events</em>'.
	 * @see CIM.IEC61968.Common.Document#getScheduledEvents()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_ScheduledEvents();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Document#getErpOrganisationRoles <em>Erp Organisation Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Organisation Roles</em>'.
	 * @see CIM.IEC61968.Common.Document#getErpOrganisationRoles()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_ErpOrganisationRoles();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.Document#getCreatedDateTime <em>Created Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date Time</em>'.
	 * @see CIM.IEC61968.Common.Document#getCreatedDateTime()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_CreatedDateTime();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Document#getToDocumentRoles <em>To Document Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Document Roles</em>'.
	 * @see CIM.IEC61968.Common.Document#getToDocumentRoles()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_ToDocumentRoles();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Document#getAssetRoles <em>Asset Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asset Roles</em>'.
	 * @see CIM.IEC61968.Common.Document#getAssetRoles()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_AssetRoles();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Document#getErpPersonRoles <em>Erp Person Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Person Roles</em>'.
	 * @see CIM.IEC61968.Common.Document#getErpPersonRoles()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_ErpPersonRoles();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.Document#getRevisionNumber <em>Revision Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Number</em>'.
	 * @see CIM.IEC61968.Common.Document#getRevisionNumber()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_RevisionNumber();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.Document#getElectronicAddress <em>Electronic Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Electronic Address</em>'.
	 * @see CIM.IEC61968.Common.Document#getElectronicAddress()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_ElectronicAddress();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.Document#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61968.Common.Document#getStatus()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Status();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Document#getNetworkDataSets <em>Network Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Network Data Sets</em>'.
	 * @see CIM.IEC61968.Common.Document#getNetworkDataSets()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_NetworkDataSets();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Document#getPowerSystemResourceRoles <em>Power System Resource Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power System Resource Roles</em>'.
	 * @see CIM.IEC61968.Common.Document#getPowerSystemResourceRoles()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_PowerSystemResourceRoles();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.Document#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see CIM.IEC61968.Common.Document#getCategory()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Category();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Document#getActivityRecords <em>Activity Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Records</em>'.
	 * @see CIM.IEC61968.Common.Document#getActivityRecords()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_ActivityRecords();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Document#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurements</em>'.
	 * @see CIM.IEC61968.Common.Document#getMeasurements()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Measurements();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Document#getFromDocumentRoles <em>From Document Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Document Roles</em>'.
	 * @see CIM.IEC61968.Common.Document#getFromDocumentRoles()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_FromDocumentRoles();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.Document#getLastModifiedDateTime <em>Last Modified Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date Time</em>'.
	 * @see CIM.IEC61968.Common.Document#getLastModifiedDateTime()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_LastModifiedDateTime();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Document#getChangeSets <em>Change Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Change Sets</em>'.
	 * @see CIM.IEC61968.Common.Document#getChangeSets()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_ChangeSets();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.Document#getDocStatus <em>Doc Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Doc Status</em>'.
	 * @see CIM.IEC61968.Common.Document#getDocStatus()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_DocStatus();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Document#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Change Items</em>'.
	 * @see CIM.IEC61968.Common.Document#getChangeItems()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_ChangeItems();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Document#getScheduleParameterInfos <em>Schedule Parameter Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Schedule Parameter Infos</em>'.
	 * @see CIM.IEC61968.Common.Document#getScheduleParameterInfos()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_ScheduleParameterInfos();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.Document#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see CIM.IEC61968.Common.Document#getTitle()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Title();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.Common.PositionPoint <em>Position Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Point</em>'.
	 * @see CIM.IEC61968.Common.PositionPoint
	 * @generated
	 */
	EClass getPositionPoint();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.PositionPoint#getCoordinateSystem <em>Coordinate System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordinate System</em>'.
	 * @see CIM.IEC61968.Common.PositionPoint#getCoordinateSystem()
	 * @see #getPositionPoint()
	 * @generated
	 */
	EReference getPositionPoint_CoordinateSystem();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.PositionPoint#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see CIM.IEC61968.Common.PositionPoint#getSequenceNumber()
	 * @see #getPositionPoint()
	 * @generated
	 */
	EAttribute getPositionPoint_SequenceNumber();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.PositionPoint#getXPosition <em>XPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPosition</em>'.
	 * @see CIM.IEC61968.Common.PositionPoint#getXPosition()
	 * @see #getPositionPoint()
	 * @generated
	 */
	EAttribute getPositionPoint_XPosition();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.PositionPoint#getYPosition <em>YPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPosition</em>'.
	 * @see CIM.IEC61968.Common.PositionPoint#getYPosition()
	 * @see #getPositionPoint()
	 * @generated
	 */
	EAttribute getPositionPoint_YPosition();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.PositionPoint#getZPosition <em>ZPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZPosition</em>'.
	 * @see CIM.IEC61968.Common.PositionPoint#getZPosition()
	 * @see #getPositionPoint()
	 * @generated
	 */
	EAttribute getPositionPoint_ZPosition();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.PositionPoint#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see CIM.IEC61968.Common.PositionPoint#getLocation()
	 * @see #getPositionPoint()
	 * @generated
	 */
	EReference getPositionPoint_Location();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.Common.CoordinateSystem <em>Coordinate System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinate System</em>'.
	 * @see CIM.IEC61968.Common.CoordinateSystem
	 * @generated
	 */
	EClass getCoordinateSystem();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.CoordinateSystem#getGmlDiagramObjects <em>Gml Diagram Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Diagram Objects</em>'.
	 * @see CIM.IEC61968.Common.CoordinateSystem#getGmlDiagramObjects()
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	EReference getCoordinateSystem_GmlDiagramObjects();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.CoordinateSystem#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Diagrams</em>'.
	 * @see CIM.IEC61968.Common.CoordinateSystem#getDiagrams()
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	EReference getCoordinateSystem_Diagrams();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.CoordinateSystem#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see CIM.IEC61968.Common.CoordinateSystem#getLocation()
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	EReference getCoordinateSystem_Location();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.CoordinateSystem#getPositionPoints <em>Position Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Position Points</em>'.
	 * @see CIM.IEC61968.Common.CoordinateSystem#getPositionPoints()
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	EReference getCoordinateSystem_PositionPoints();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.CoordinateSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CIM.IEC61968.Common.CoordinateSystem#getName()
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	EAttribute getCoordinateSystem_Name();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.Common.UserAttribute <em>User Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Attribute</em>'.
	 * @see CIM.IEC61968.Common.UserAttribute
	 * @generated
	 */
	EClass getUserAttribute();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.UserAttribute#getPropertySpecification <em>Property Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Specification</em>'.
	 * @see CIM.IEC61968.Common.UserAttribute#getPropertySpecification()
	 * @see #getUserAttribute()
	 * @generated
	 */
	EReference getUserAttribute_PropertySpecification();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.UserAttribute#getPassThroughBills <em>Pass Through Bills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pass Through Bills</em>'.
	 * @see CIM.IEC61968.Common.UserAttribute#getPassThroughBills()
	 * @see #getUserAttribute()
	 * @generated
	 */
	EReference getUserAttribute_PassThroughBills();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.UserAttribute#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transaction</em>'.
	 * @see CIM.IEC61968.Common.UserAttribute#getTransaction()
	 * @see #getUserAttribute()
	 * @generated
	 */
	EReference getUserAttribute_Transaction();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.UserAttribute#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see CIM.IEC61968.Common.UserAttribute#getSequenceNumber()
	 * @see #getUserAttribute()
	 * @generated
	 */
	EAttribute getUserAttribute_SequenceNumber();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.UserAttribute#getRatingAssets <em>Rating Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rating Assets</em>'.
	 * @see CIM.IEC61968.Common.UserAttribute#getRatingAssets()
	 * @see #getUserAttribute()
	 * @generated
	 */
	EReference getUserAttribute_RatingAssets();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.UserAttribute#getErpLedgerEntries <em>Erp Ledger Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Ledger Entries</em>'.
	 * @see CIM.IEC61968.Common.UserAttribute#getErpLedgerEntries()
	 * @see #getUserAttribute()
	 * @generated
	 */
	EReference getUserAttribute_ErpLedgerEntries();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.UserAttribute#getPropertyAssets <em>Property Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Property Assets</em>'.
	 * @see CIM.IEC61968.Common.UserAttribute#getPropertyAssets()
	 * @see #getUserAttribute()
	 * @generated
	 */
	EReference getUserAttribute_PropertyAssets();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.UserAttribute#getErpStatementLineItems <em>Erp Statement Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Statement Line Items</em>'.
	 * @see CIM.IEC61968.Common.UserAttribute#getErpStatementLineItems()
	 * @see #getUserAttribute()
	 * @generated
	 */
	EReference getUserAttribute_ErpStatementLineItems();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.UserAttribute#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Invoice Line Items</em>'.
	 * @see CIM.IEC61968.Common.UserAttribute#getErpInvoiceLineItems()
	 * @see #getUserAttribute()
	 * @generated
	 */
	EReference getUserAttribute_ErpInvoiceLineItems();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.UserAttribute#getProcedureDataSets <em>Procedure Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Procedure Data Sets</em>'.
	 * @see CIM.IEC61968.Common.UserAttribute#getProcedureDataSets()
	 * @see #getUserAttribute()
	 * @generated
	 */
	EReference getUserAttribute_ProcedureDataSets();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.UserAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CIM.IEC61968.Common.UserAttribute#getName()
	 * @see #getUserAttribute()
	 * @generated
	 */
	EAttribute getUserAttribute_Name();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.UserAttribute#getRatingSpecification <em>Rating Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rating Specification</em>'.
	 * @see CIM.IEC61968.Common.UserAttribute#getRatingSpecification()
	 * @see #getUserAttribute()
	 * @generated
	 */
	EReference getUserAttribute_RatingSpecification();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.UserAttribute#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Procedure</em>'.
	 * @see CIM.IEC61968.Common.UserAttribute#getProcedure()
	 * @see #getUserAttribute()
	 * @generated
	 */
	EReference getUserAttribute_Procedure();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.UserAttribute#getBillDeterminants <em>Bill Determinants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bill Determinants</em>'.
	 * @see CIM.IEC61968.Common.UserAttribute#getBillDeterminants()
	 * @see #getUserAttribute()
	 * @generated
	 */
	EReference getUserAttribute_BillDeterminants();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.UserAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM.IEC61968.Common.UserAttribute#getValue()
	 * @see #getUserAttribute()
	 * @generated
	 */
	EAttribute getUserAttribute_Value();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.Common.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see CIM.IEC61968.Common.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.Location#getSecondaryAddress <em>Secondary Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Secondary Address</em>'.
	 * @see CIM.IEC61968.Common.Location#getSecondaryAddress()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_SecondaryAddress();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Location#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurements</em>'.
	 * @see CIM.IEC61968.Common.Location#getMeasurements()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Measurements();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Location#getDirections <em>Directions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Directions</em>'.
	 * @see CIM.IEC61968.Common.Location#getDirections()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Directions();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Location#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power System Resources</em>'.
	 * @see CIM.IEC61968.Common.Location#getPowerSystemResources()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_PowerSystemResources();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.Location#getPhone2 <em>Phone2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phone2</em>'.
	 * @see CIM.IEC61968.Common.Location#getPhone2()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Phone2();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.Location#getPhone1 <em>Phone1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phone1</em>'.
	 * @see CIM.IEC61968.Common.Location#getPhone1()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Phone1();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Location#getLandProperties <em>Land Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Land Properties</em>'.
	 * @see CIM.IEC61968.Common.Location#getLandProperties()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_LandProperties();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.Location#getGeoInfoReference <em>Geo Info Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geo Info Reference</em>'.
	 * @see CIM.IEC61968.Common.Location#getGeoInfoReference()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_GeoInfoReference();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.Location#getDimensionsInfo <em>Dimensions Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dimensions Info</em>'.
	 * @see CIM.IEC61968.Common.Location#getDimensionsInfo()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_DimensionsInfo();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Location#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Change Items</em>'.
	 * @see CIM.IEC61968.Common.Location#getChangeItems()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_ChangeItems();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Location#getErpOrganisations <em>Erp Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Organisations</em>'.
	 * @see CIM.IEC61968.Common.Location#getErpOrganisations()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_ErpOrganisations();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Location#getCoordinateSystems <em>Coordinate Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coordinate Systems</em>'.
	 * @see CIM.IEC61968.Common.Location#getCoordinateSystems()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_CoordinateSystems();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Location#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see CIM.IEC61968.Common.Location#getAssets()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Assets();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Location#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Routes</em>'.
	 * @see CIM.IEC61968.Common.Location#getRoutes()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Routes();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Location#getHazards <em>Hazards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hazards</em>'.
	 * @see CIM.IEC61968.Common.Location#getHazards()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Hazards();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.Location#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see CIM.IEC61968.Common.Location#getCategory()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Category();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.Location#getMainAddress <em>Main Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Address</em>'.
	 * @see CIM.IEC61968.Common.Location#getMainAddress()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_MainAddress();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.Location#getElectronicAddress <em>Electronic Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Electronic Address</em>'.
	 * @see CIM.IEC61968.Common.Location#getElectronicAddress()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_ElectronicAddress();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.Location#getCorporateCode <em>Corporate Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corporate Code</em>'.
	 * @see CIM.IEC61968.Common.Location#getCorporateCode()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_CorporateCode();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Location#getRedLines <em>Red Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Red Lines</em>'.
	 * @see CIM.IEC61968.Common.Location#getRedLines()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_RedLines();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.Location#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61968.Common.Location#getStatus()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Status();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.Location#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see CIM.IEC61968.Common.Location#getDirection()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Direction();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.Location#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crews</em>'.
	 * @see CIM.IEC61968.Common.Location#getCrews()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Crews();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.Location#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see CIM.IEC61968.Common.Location#getPosition()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Position();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.Common.StreetDetail <em>Street Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Street Detail</em>'.
	 * @see CIM.IEC61968.Common.StreetDetail
	 * @generated
	 */
	EClass getStreetDetail();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.StreetDetail#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CIM.IEC61968.Common.StreetDetail#getName()
	 * @see #getStreetDetail()
	 * @generated
	 */
	EAttribute getStreetDetail_Name();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.StreetDetail#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see CIM.IEC61968.Common.StreetDetail#getPrefix()
	 * @see #getStreetDetail()
	 * @generated
	 */
	EAttribute getStreetDetail_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.StreetDetail#getBuildingName <em>Building Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Building Name</em>'.
	 * @see CIM.IEC61968.Common.StreetDetail#getBuildingName()
	 * @see #getStreetDetail()
	 * @generated
	 */
	EAttribute getStreetDetail_BuildingName();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.StreetDetail#getSuiteNumber <em>Suite Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suite Number</em>'.
	 * @see CIM.IEC61968.Common.StreetDetail#getSuiteNumber()
	 * @see #getStreetDetail()
	 * @generated
	 */
	EAttribute getStreetDetail_SuiteNumber();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.StreetDetail#isWithinTownLimits <em>Within Town Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Within Town Limits</em>'.
	 * @see CIM.IEC61968.Common.StreetDetail#isWithinTownLimits()
	 * @see #getStreetDetail()
	 * @generated
	 */
	EAttribute getStreetDetail_WithinTownLimits();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.StreetDetail#getAddressGeneral <em>Address General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address General</em>'.
	 * @see CIM.IEC61968.Common.StreetDetail#getAddressGeneral()
	 * @see #getStreetDetail()
	 * @generated
	 */
	EAttribute getStreetDetail_AddressGeneral();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.StreetDetail#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see CIM.IEC61968.Common.StreetDetail#getNumber()
	 * @see #getStreetDetail()
	 * @generated
	 */
	EAttribute getStreetDetail_Number();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.StreetDetail#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suffix</em>'.
	 * @see CIM.IEC61968.Common.StreetDetail#getSuffix()
	 * @see #getStreetDetail()
	 * @generated
	 */
	EAttribute getStreetDetail_Suffix();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.StreetDetail#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CIM.IEC61968.Common.StreetDetail#getType()
	 * @see #getStreetDetail()
	 * @generated
	 */
	EAttribute getStreetDetail_Type();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.StreetDetail#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see CIM.IEC61968.Common.StreetDetail#getCode()
	 * @see #getStreetDetail()
	 * @generated
	 */
	EAttribute getStreetDetail_Code();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.Common.Agreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agreement</em>'.
	 * @see CIM.IEC61968.Common.Agreement
	 * @generated
	 */
	EClass getAgreement();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.Agreement#getSignDate <em>Sign Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sign Date</em>'.
	 * @see CIM.IEC61968.Common.Agreement#getSignDate()
	 * @see #getAgreement()
	 * @generated
	 */
	EAttribute getAgreement_SignDate();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.Agreement#getValidityInterval <em>Validity Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Validity Interval</em>'.
	 * @see CIM.IEC61968.Common.Agreement#getValidityInterval()
	 * @see #getAgreement()
	 * @generated
	 */
	EReference getAgreement_ValidityInterval();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.Common.ActivityRecord <em>Activity Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Record</em>'.
	 * @see CIM.IEC61968.Common.ActivityRecord
	 * @generated
	 */
	EClass getActivityRecord();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.ActivityRecord#getMarketFactors <em>Market Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Market Factors</em>'.
	 * @see CIM.IEC61968.Common.ActivityRecord#getMarketFactors()
	 * @see #getActivityRecord()
	 * @generated
	 */
	EReference getActivityRecord_MarketFactors();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.ActivityRecord#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see CIM.IEC61968.Common.ActivityRecord#getAssets()
	 * @see #getActivityRecord()
	 * @generated
	 */
	EReference getActivityRecord_Assets();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.ActivityRecord#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see CIM.IEC61968.Common.ActivityRecord#getSeverity()
	 * @see #getActivityRecord()
	 * @generated
	 */
	EAttribute getActivityRecord_Severity();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.ActivityRecord#getScheduledEvent <em>Scheduled Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduled Event</em>'.
	 * @see CIM.IEC61968.Common.ActivityRecord#getScheduledEvent()
	 * @see #getActivityRecord()
	 * @generated
	 */
	EReference getActivityRecord_ScheduledEvent();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.ActivityRecord#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see CIM.IEC61968.Common.ActivityRecord#getCategory()
	 * @see #getActivityRecord()
	 * @generated
	 */
	EAttribute getActivityRecord_Category();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.ActivityRecord#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see CIM.IEC61968.Common.ActivityRecord#getReason()
	 * @see #getActivityRecord()
	 * @generated
	 */
	EAttribute getActivityRecord_Reason();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.ActivityRecord#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61968.Common.ActivityRecord#getStatus()
	 * @see #getActivityRecord()
	 * @generated
	 */
	EReference getActivityRecord_Status();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.ActivityRecord#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documents</em>'.
	 * @see CIM.IEC61968.Common.ActivityRecord#getDocuments()
	 * @see #getActivityRecord()
	 * @generated
	 */
	EReference getActivityRecord_Documents();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.ActivityRecord#getOrganisations <em>Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organisations</em>'.
	 * @see CIM.IEC61968.Common.ActivityRecord#getOrganisations()
	 * @see #getActivityRecord()
	 * @generated
	 */
	EReference getActivityRecord_Organisations();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.ActivityRecord#getCreatedDateTime <em>Created Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date Time</em>'.
	 * @see CIM.IEC61968.Common.ActivityRecord#getCreatedDateTime()
	 * @see #getActivityRecord()
	 * @generated
	 */
	EAttribute getActivityRecord_CreatedDateTime();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.ActivityRecord#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Persons</em>'.
	 * @see CIM.IEC61968.Common.ActivityRecord#getErpPersons()
	 * @see #getActivityRecord()
	 * @generated
	 */
	EReference getActivityRecord_ErpPersons();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.Common.ElectronicAddress <em>Electronic Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electronic Address</em>'.
	 * @see CIM.IEC61968.Common.ElectronicAddress
	 * @generated
	 */
	EClass getElectronicAddress();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.ElectronicAddress#getLan <em>Lan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lan</em>'.
	 * @see CIM.IEC61968.Common.ElectronicAddress#getLan()
	 * @see #getElectronicAddress()
	 * @generated
	 */
	EAttribute getElectronicAddress_Lan();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.ElectronicAddress#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see CIM.IEC61968.Common.ElectronicAddress#getEmail()
	 * @see #getElectronicAddress()
	 * @generated
	 */
	EAttribute getElectronicAddress_Email();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.ElectronicAddress#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see CIM.IEC61968.Common.ElectronicAddress#getUserID()
	 * @see #getElectronicAddress()
	 * @generated
	 */
	EAttribute getElectronicAddress_UserID();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.ElectronicAddress#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61968.Common.ElectronicAddress#getStatus()
	 * @see #getElectronicAddress()
	 * @generated
	 */
	EReference getElectronicAddress_Status();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.ElectronicAddress#getWeb <em>Web</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web</em>'.
	 * @see CIM.IEC61968.Common.ElectronicAddress#getWeb()
	 * @see #getElectronicAddress()
	 * @generated
	 */
	EAttribute getElectronicAddress_Web();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.ElectronicAddress#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see CIM.IEC61968.Common.ElectronicAddress#getPassword()
	 * @see #getElectronicAddress()
	 * @generated
	 */
	EAttribute getElectronicAddress_Password();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.ElectronicAddress#getRadio <em>Radio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radio</em>'.
	 * @see CIM.IEC61968.Common.ElectronicAddress#getRadio()
	 * @see #getElectronicAddress()
	 * @generated
	 */
	EAttribute getElectronicAddress_Radio();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.Common.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see CIM.IEC61968.Common.Status
	 * @generated
	 */
	EClass getStatus();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.Status#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see CIM.IEC61968.Common.Status#getReason()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_Reason();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.Status#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM.IEC61968.Common.Status#getValue()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_Value();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.Status#getRemark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remark</em>'.
	 * @see CIM.IEC61968.Common.Status#getRemark()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_Remark();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.Status#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see CIM.IEC61968.Common.Status#getDateTime()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_DateTime();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.Common.TownDetail <em>Town Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Town Detail</em>'.
	 * @see CIM.IEC61968.Common.TownDetail
	 * @generated
	 */
	EClass getTownDetail();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.TownDetail#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see CIM.IEC61968.Common.TownDetail#getCountry()
	 * @see #getTownDetail()
	 * @generated
	 */
	EAttribute getTownDetail_Country();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.TownDetail#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see CIM.IEC61968.Common.TownDetail#getCode()
	 * @see #getTownDetail()
	 * @generated
	 */
	EAttribute getTownDetail_Code();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.TownDetail#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CIM.IEC61968.Common.TownDetail#getName()
	 * @see #getTownDetail()
	 * @generated
	 */
	EAttribute getTownDetail_Name();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.TownDetail#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Section</em>'.
	 * @see CIM.IEC61968.Common.TownDetail#getSection()
	 * @see #getTownDetail()
	 * @generated
	 */
	EAttribute getTownDetail_Section();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.TownDetail#getStateOrProvince <em>State Or Province</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Or Province</em>'.
	 * @see CIM.IEC61968.Common.TownDetail#getStateOrProvince()
	 * @see #getTownDetail()
	 * @generated
	 */
	EAttribute getTownDetail_StateOrProvince();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.Common.TimePoint <em>Time Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Point</em>'.
	 * @see CIM.IEC61968.Common.TimePoint
	 * @generated
	 */
	EClass getTimePoint();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.TimePoint#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see CIM.IEC61968.Common.TimePoint#getSequenceNumber()
	 * @see #getTimePoint()
	 * @generated
	 */
	EAttribute getTimePoint_SequenceNumber();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.TimePoint#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61968.Common.TimePoint#getStatus()
	 * @see #getTimePoint()
	 * @generated
	 */
	EReference getTimePoint_Status();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.Common.TimePoint#getScheduledEvents <em>Scheduled Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scheduled Events</em>'.
	 * @see CIM.IEC61968.Common.TimePoint#getScheduledEvents()
	 * @see #getTimePoint()
	 * @generated
	 */
	EReference getTimePoint_ScheduledEvents();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.TimePoint#getRelativeTimeInterval <em>Relative Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Time Interval</em>'.
	 * @see CIM.IEC61968.Common.TimePoint#getRelativeTimeInterval()
	 * @see #getTimePoint()
	 * @generated
	 */
	EAttribute getTimePoint_RelativeTimeInterval();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.TimePoint#getWindow <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Window</em>'.
	 * @see CIM.IEC61968.Common.TimePoint#getWindow()
	 * @see #getTimePoint()
	 * @generated
	 */
	EReference getTimePoint_Window();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.Common.TimePoint#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see CIM.IEC61968.Common.TimePoint#getDateTime()
	 * @see #getTimePoint()
	 * @generated
	 */
	EAttribute getTimePoint_DateTime();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.Common.TimePoint#getTimeSchedule <em>Time Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Schedule</em>'.
	 * @see CIM.IEC61968.Common.TimePoint#getTimeSchedule()
	 * @see #getTimePoint()
	 * @generated
	 */
	EReference getTimePoint_TimeSchedule();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonFactory getCommonFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CIM.IEC61968.Common.impl.DateTimeIntervalImpl <em>Date Time Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Common.impl.DateTimeIntervalImpl
		 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getDateTimeInterval()
		 * @generated
		 */
		EClass DATE_TIME_INTERVAL = eINSTANCE.getDateTimeInterval();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_INTERVAL__START = eINSTANCE.getDateTimeInterval_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_INTERVAL__END = eINSTANCE.getDateTimeInterval_End();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.Common.impl.PostalAddressImpl <em>Postal Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Common.impl.PostalAddressImpl
		 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getPostalAddress()
		 * @generated
		 */
		EClass POSTAL_ADDRESS = eINSTANCE.getPostalAddress();

		/**
		 * The meta object literal for the '<em><b>Town Detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTAL_ADDRESS__TOWN_DETAIL = eINSTANCE.getPostalAddress_TownDetail();

		/**
		 * The meta object literal for the '<em><b>Street Detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTAL_ADDRESS__STREET_DETAIL = eINSTANCE.getPostalAddress_StreetDetail();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__POSTAL_CODE = eINSTANCE.getPostalAddress_PostalCode();

		/**
		 * The meta object literal for the '<em><b>Po Box</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__PO_BOX = eINSTANCE.getPostalAddress_PoBox();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.Common.impl.OrganisationImpl <em>Organisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Common.impl.OrganisationImpl
		 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getOrganisation()
		 * @generated
		 */
		EClass ORGANISATION = eINSTANCE.getOrganisation();

		/**
		 * The meta object literal for the '<em><b>Street Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__STREET_ADDRESS = eINSTANCE.getOrganisation_StreetAddress();

		/**
		 * The meta object literal for the '<em><b>Electronic Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__ELECTRONIC_ADDRESS = eINSTANCE.getOrganisation_ElectronicAddress();

		/**
		 * The meta object literal for the '<em><b>Postal Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__POSTAL_ADDRESS = eINSTANCE.getOrganisation_PostalAddress();

		/**
		 * The meta object literal for the '<em><b>Phone1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__PHONE1 = eINSTANCE.getOrganisation_Phone1();

		/**
		 * The meta object literal for the '<em><b>Phone2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__PHONE2 = eINSTANCE.getOrganisation_Phone2();

		/**
		 * The meta object literal for the '<em><b>Market Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__MARKET_ROLES = eINSTANCE.getOrganisation_MarketRoles();

		/**
		 * The meta object literal for the '<em><b>Business Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__BUSINESS_ROLES = eINSTANCE.getOrganisation_BusinessRoles();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.Common.impl.TelephoneNumberImpl <em>Telephone Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Common.impl.TelephoneNumberImpl
		 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getTelephoneNumber()
		 * @generated
		 */
		EClass TELEPHONE_NUMBER = eINSTANCE.getTelephoneNumber();

		/**
		 * The meta object literal for the '<em><b>Country Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEPHONE_NUMBER__COUNTRY_CODE = eINSTANCE.getTelephoneNumber_CountryCode();

		/**
		 * The meta object literal for the '<em><b>City Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEPHONE_NUMBER__CITY_CODE = eINSTANCE.getTelephoneNumber_CityCode();

		/**
		 * The meta object literal for the '<em><b>Local Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEPHONE_NUMBER__LOCAL_NUMBER = eINSTANCE.getTelephoneNumber_LocalNumber();

		/**
		 * The meta object literal for the '<em><b>Area Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEPHONE_NUMBER__AREA_CODE = eINSTANCE.getTelephoneNumber_AreaCode();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEPHONE_NUMBER__EXTENSION = eINSTANCE.getTelephoneNumber_Extension();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.Common.impl.StreetAddressImpl <em>Street Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Common.impl.StreetAddressImpl
		 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getStreetAddress()
		 * @generated
		 */
		EClass STREET_ADDRESS = eINSTANCE.getStreetAddress();

		/**
		 * The meta object literal for the '<em><b>Street Detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREET_ADDRESS__STREET_DETAIL = eINSTANCE.getStreetAddress_StreetDetail();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREET_ADDRESS__STATUS = eINSTANCE.getStreetAddress_Status();

		/**
		 * The meta object literal for the '<em><b>Town Detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREET_ADDRESS__TOWN_DETAIL = eINSTANCE.getStreetAddress_TownDetail();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.Common.impl.TimeScheduleImpl <em>Time Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Common.impl.TimeScheduleImpl
		 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getTimeSchedule()
		 * @generated
		 */
		EClass TIME_SCHEDULE = eINSTANCE.getTimeSchedule();

		/**
		 * The meta object literal for the '<em><b>Recurrence Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SCHEDULE__RECURRENCE_PATTERN = eINSTANCE.getTimeSchedule_RecurrencePattern();

		/**
		 * The meta object literal for the '<em><b>Schedule Interval</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SCHEDULE__SCHEDULE_INTERVAL = eINSTANCE.getTimeSchedule_ScheduleInterval();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SCHEDULE__DISABLED = eINSTANCE.getTimeSchedule_Disabled();

		/**
		 * The meta object literal for the '<em><b>Recurrence Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SCHEDULE__RECURRENCE_PERIOD = eINSTANCE.getTimeSchedule_RecurrencePeriod();

		/**
		 * The meta object literal for the '<em><b>Time Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SCHEDULE__TIME_POINTS = eINSTANCE.getTimeSchedule_TimePoints();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SCHEDULE__OFFSET = eINSTANCE.getTimeSchedule_Offset();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.Common.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Common.impl.DocumentImpl
		 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__SUBJECT = eINSTANCE.getDocument_Subject();

		/**
		 * The meta object literal for the '<em><b>Scheduled Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__SCHEDULED_EVENTS = eINSTANCE.getDocument_ScheduledEvents();

		/**
		 * The meta object literal for the '<em><b>Erp Organisation Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__ERP_ORGANISATION_ROLES = eINSTANCE.getDocument_ErpOrganisationRoles();

		/**
		 * The meta object literal for the '<em><b>Created Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__CREATED_DATE_TIME = eINSTANCE.getDocument_CreatedDateTime();

		/**
		 * The meta object literal for the '<em><b>To Document Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__TO_DOCUMENT_ROLES = eINSTANCE.getDocument_ToDocumentRoles();

		/**
		 * The meta object literal for the '<em><b>Asset Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__ASSET_ROLES = eINSTANCE.getDocument_AssetRoles();

		/**
		 * The meta object literal for the '<em><b>Erp Person Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__ERP_PERSON_ROLES = eINSTANCE.getDocument_ErpPersonRoles();

		/**
		 * The meta object literal for the '<em><b>Revision Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__REVISION_NUMBER = eINSTANCE.getDocument_RevisionNumber();

		/**
		 * The meta object literal for the '<em><b>Electronic Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__ELECTRONIC_ADDRESS = eINSTANCE.getDocument_ElectronicAddress();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__STATUS = eINSTANCE.getDocument_Status();

		/**
		 * The meta object literal for the '<em><b>Network Data Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__NETWORK_DATA_SETS = eINSTANCE.getDocument_NetworkDataSets();

		/**
		 * The meta object literal for the '<em><b>Power System Resource Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES = eINSTANCE.getDocument_PowerSystemResourceRoles();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__CATEGORY = eINSTANCE.getDocument_Category();

		/**
		 * The meta object literal for the '<em><b>Activity Records</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__ACTIVITY_RECORDS = eINSTANCE.getDocument_ActivityRecords();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__MEASUREMENTS = eINSTANCE.getDocument_Measurements();

		/**
		 * The meta object literal for the '<em><b>From Document Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__FROM_DOCUMENT_ROLES = eINSTANCE.getDocument_FromDocumentRoles();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__LAST_MODIFIED_DATE_TIME = eINSTANCE.getDocument_LastModifiedDateTime();

		/**
		 * The meta object literal for the '<em><b>Change Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__CHANGE_SETS = eINSTANCE.getDocument_ChangeSets();

		/**
		 * The meta object literal for the '<em><b>Doc Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__DOC_STATUS = eINSTANCE.getDocument_DocStatus();

		/**
		 * The meta object literal for the '<em><b>Change Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__CHANGE_ITEMS = eINSTANCE.getDocument_ChangeItems();

		/**
		 * The meta object literal for the '<em><b>Schedule Parameter Infos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__SCHEDULE_PARAMETER_INFOS = eINSTANCE.getDocument_ScheduleParameterInfos();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__TITLE = eINSTANCE.getDocument_Title();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.Common.impl.PositionPointImpl <em>Position Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Common.impl.PositionPointImpl
		 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getPositionPoint()
		 * @generated
		 */
		EClass POSITION_POINT = eINSTANCE.getPositionPoint();

		/**
		 * The meta object literal for the '<em><b>Coordinate System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION_POINT__COORDINATE_SYSTEM = eINSTANCE.getPositionPoint_CoordinateSystem();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_POINT__SEQUENCE_NUMBER = eINSTANCE.getPositionPoint_SequenceNumber();

		/**
		 * The meta object literal for the '<em><b>XPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_POINT__XPOSITION = eINSTANCE.getPositionPoint_XPosition();

		/**
		 * The meta object literal for the '<em><b>YPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_POINT__YPOSITION = eINSTANCE.getPositionPoint_YPosition();

		/**
		 * The meta object literal for the '<em><b>ZPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_POINT__ZPOSITION = eINSTANCE.getPositionPoint_ZPosition();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION_POINT__LOCATION = eINSTANCE.getPositionPoint_Location();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.Common.impl.CoordinateSystemImpl <em>Coordinate System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Common.impl.CoordinateSystemImpl
		 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getCoordinateSystem()
		 * @generated
		 */
		EClass COORDINATE_SYSTEM = eINSTANCE.getCoordinateSystem();

		/**
		 * The meta object literal for the '<em><b>Gml Diagram Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATE_SYSTEM__GML_DIAGRAM_OBJECTS = eINSTANCE.getCoordinateSystem_GmlDiagramObjects();

		/**
		 * The meta object literal for the '<em><b>Diagrams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATE_SYSTEM__DIAGRAMS = eINSTANCE.getCoordinateSystem_Diagrams();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATE_SYSTEM__LOCATION = eINSTANCE.getCoordinateSystem_Location();

		/**
		 * The meta object literal for the '<em><b>Position Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATE_SYSTEM__POSITION_POINTS = eINSTANCE.getCoordinateSystem_PositionPoints();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE_SYSTEM__NAME = eINSTANCE.getCoordinateSystem_Name();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.Common.impl.UserAttributeImpl <em>User Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Common.impl.UserAttributeImpl
		 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getUserAttribute()
		 * @generated
		 */
		EClass USER_ATTRIBUTE = eINSTANCE.getUserAttribute();

		/**
		 * The meta object literal for the '<em><b>Property Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ATTRIBUTE__PROPERTY_SPECIFICATION = eINSTANCE.getUserAttribute_PropertySpecification();

		/**
		 * The meta object literal for the '<em><b>Pass Through Bills</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ATTRIBUTE__PASS_THROUGH_BILLS = eINSTANCE.getUserAttribute_PassThroughBills();

		/**
		 * The meta object literal for the '<em><b>Transaction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ATTRIBUTE__TRANSACTION = eINSTANCE.getUserAttribute_Transaction();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ATTRIBUTE__SEQUENCE_NUMBER = eINSTANCE.getUserAttribute_SequenceNumber();

		/**
		 * The meta object literal for the '<em><b>Rating Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ATTRIBUTE__RATING_ASSETS = eINSTANCE.getUserAttribute_RatingAssets();

		/**
		 * The meta object literal for the '<em><b>Erp Ledger Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ATTRIBUTE__ERP_LEDGER_ENTRIES = eINSTANCE.getUserAttribute_ErpLedgerEntries();

		/**
		 * The meta object literal for the '<em><b>Property Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ATTRIBUTE__PROPERTY_ASSETS = eINSTANCE.getUserAttribute_PropertyAssets();

		/**
		 * The meta object literal for the '<em><b>Erp Statement Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ATTRIBUTE__ERP_STATEMENT_LINE_ITEMS = eINSTANCE.getUserAttribute_ErpStatementLineItems();

		/**
		 * The meta object literal for the '<em><b>Erp Invoice Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ATTRIBUTE__ERP_INVOICE_LINE_ITEMS = eINSTANCE.getUserAttribute_ErpInvoiceLineItems();

		/**
		 * The meta object literal for the '<em><b>Procedure Data Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ATTRIBUTE__PROCEDURE_DATA_SETS = eINSTANCE.getUserAttribute_ProcedureDataSets();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ATTRIBUTE__NAME = eINSTANCE.getUserAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Rating Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ATTRIBUTE__RATING_SPECIFICATION = eINSTANCE.getUserAttribute_RatingSpecification();

		/**
		 * The meta object literal for the '<em><b>Procedure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ATTRIBUTE__PROCEDURE = eINSTANCE.getUserAttribute_Procedure();

		/**
		 * The meta object literal for the '<em><b>Bill Determinants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ATTRIBUTE__BILL_DETERMINANTS = eINSTANCE.getUserAttribute_BillDeterminants();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ATTRIBUTE__VALUE = eINSTANCE.getUserAttribute_Value();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.Common.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Common.impl.LocationImpl
		 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Secondary Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__SECONDARY_ADDRESS = eINSTANCE.getLocation_SecondaryAddress();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__MEASUREMENTS = eINSTANCE.getLocation_Measurements();

		/**
		 * The meta object literal for the '<em><b>Directions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__DIRECTIONS = eINSTANCE.getLocation_Directions();

		/**
		 * The meta object literal for the '<em><b>Power System Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__POWER_SYSTEM_RESOURCES = eINSTANCE.getLocation_PowerSystemResources();

		/**
		 * The meta object literal for the '<em><b>Phone2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__PHONE2 = eINSTANCE.getLocation_Phone2();

		/**
		 * The meta object literal for the '<em><b>Phone1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__PHONE1 = eINSTANCE.getLocation_Phone1();

		/**
		 * The meta object literal for the '<em><b>Land Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__LAND_PROPERTIES = eINSTANCE.getLocation_LandProperties();

		/**
		 * The meta object literal for the '<em><b>Geo Info Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__GEO_INFO_REFERENCE = eINSTANCE.getLocation_GeoInfoReference();

		/**
		 * The meta object literal for the '<em><b>Dimensions Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__DIMENSIONS_INFO = eINSTANCE.getLocation_DimensionsInfo();

		/**
		 * The meta object literal for the '<em><b>Change Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__CHANGE_ITEMS = eINSTANCE.getLocation_ChangeItems();

		/**
		 * The meta object literal for the '<em><b>Erp Organisations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__ERP_ORGANISATIONS = eINSTANCE.getLocation_ErpOrganisations();

		/**
		 * The meta object literal for the '<em><b>Coordinate Systems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__COORDINATE_SYSTEMS = eINSTANCE.getLocation_CoordinateSystems();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__ASSETS = eINSTANCE.getLocation_Assets();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__ROUTES = eINSTANCE.getLocation_Routes();

		/**
		 * The meta object literal for the '<em><b>Hazards</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__HAZARDS = eINSTANCE.getLocation_Hazards();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__CATEGORY = eINSTANCE.getLocation_Category();

		/**
		 * The meta object literal for the '<em><b>Main Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__MAIN_ADDRESS = eINSTANCE.getLocation_MainAddress();

		/**
		 * The meta object literal for the '<em><b>Electronic Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__ELECTRONIC_ADDRESS = eINSTANCE.getLocation_ElectronicAddress();

		/**
		 * The meta object literal for the '<em><b>Corporate Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__CORPORATE_CODE = eINSTANCE.getLocation_CorporateCode();

		/**
		 * The meta object literal for the '<em><b>Red Lines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__RED_LINES = eINSTANCE.getLocation_RedLines();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__STATUS = eINSTANCE.getLocation_Status();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__DIRECTION = eINSTANCE.getLocation_Direction();

		/**
		 * The meta object literal for the '<em><b>Crews</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__CREWS = eINSTANCE.getLocation_Crews();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__POSITION = eINSTANCE.getLocation_Position();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.Common.impl.StreetDetailImpl <em>Street Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Common.impl.StreetDetailImpl
		 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getStreetDetail()
		 * @generated
		 */
		EClass STREET_DETAIL = eINSTANCE.getStreetDetail();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREET_DETAIL__NAME = eINSTANCE.getStreetDetail_Name();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREET_DETAIL__PREFIX = eINSTANCE.getStreetDetail_Prefix();

		/**
		 * The meta object literal for the '<em><b>Building Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREET_DETAIL__BUILDING_NAME = eINSTANCE.getStreetDetail_BuildingName();

		/**
		 * The meta object literal for the '<em><b>Suite Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREET_DETAIL__SUITE_NUMBER = eINSTANCE.getStreetDetail_SuiteNumber();

		/**
		 * The meta object literal for the '<em><b>Within Town Limits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREET_DETAIL__WITHIN_TOWN_LIMITS = eINSTANCE.getStreetDetail_WithinTownLimits();

		/**
		 * The meta object literal for the '<em><b>Address General</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREET_DETAIL__ADDRESS_GENERAL = eINSTANCE.getStreetDetail_AddressGeneral();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREET_DETAIL__NUMBER = eINSTANCE.getStreetDetail_Number();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREET_DETAIL__SUFFIX = eINSTANCE.getStreetDetail_Suffix();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREET_DETAIL__TYPE = eINSTANCE.getStreetDetail_Type();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREET_DETAIL__CODE = eINSTANCE.getStreetDetail_Code();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.Common.impl.AgreementImpl <em>Agreement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Common.impl.AgreementImpl
		 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getAgreement()
		 * @generated
		 */
		EClass AGREEMENT = eINSTANCE.getAgreement();

		/**
		 * The meta object literal for the '<em><b>Sign Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT__SIGN_DATE = eINSTANCE.getAgreement_SignDate();

		/**
		 * The meta object literal for the '<em><b>Validity Interval</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT__VALIDITY_INTERVAL = eINSTANCE.getAgreement_ValidityInterval();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.Common.impl.ActivityRecordImpl <em>Activity Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Common.impl.ActivityRecordImpl
		 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getActivityRecord()
		 * @generated
		 */
		EClass ACTIVITY_RECORD = eINSTANCE.getActivityRecord();

		/**
		 * The meta object literal for the '<em><b>Market Factors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_RECORD__MARKET_FACTORS = eINSTANCE.getActivityRecord_MarketFactors();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_RECORD__ASSETS = eINSTANCE.getActivityRecord_Assets();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_RECORD__SEVERITY = eINSTANCE.getActivityRecord_Severity();

		/**
		 * The meta object literal for the '<em><b>Scheduled Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_RECORD__SCHEDULED_EVENT = eINSTANCE.getActivityRecord_ScheduledEvent();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_RECORD__CATEGORY = eINSTANCE.getActivityRecord_Category();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_RECORD__REASON = eINSTANCE.getActivityRecord_Reason();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_RECORD__STATUS = eINSTANCE.getActivityRecord_Status();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_RECORD__DOCUMENTS = eINSTANCE.getActivityRecord_Documents();

		/**
		 * The meta object literal for the '<em><b>Organisations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_RECORD__ORGANISATIONS = eINSTANCE.getActivityRecord_Organisations();

		/**
		 * The meta object literal for the '<em><b>Created Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_RECORD__CREATED_DATE_TIME = eINSTANCE.getActivityRecord_CreatedDateTime();

		/**
		 * The meta object literal for the '<em><b>Erp Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_RECORD__ERP_PERSONS = eINSTANCE.getActivityRecord_ErpPersons();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.Common.impl.ElectronicAddressImpl <em>Electronic Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Common.impl.ElectronicAddressImpl
		 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getElectronicAddress()
		 * @generated
		 */
		EClass ELECTRONIC_ADDRESS = eINSTANCE.getElectronicAddress();

		/**
		 * The meta object literal for the '<em><b>Lan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRONIC_ADDRESS__LAN = eINSTANCE.getElectronicAddress_Lan();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRONIC_ADDRESS__EMAIL = eINSTANCE.getElectronicAddress_Email();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRONIC_ADDRESS__USER_ID = eINSTANCE.getElectronicAddress_UserID();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTRONIC_ADDRESS__STATUS = eINSTANCE.getElectronicAddress_Status();

		/**
		 * The meta object literal for the '<em><b>Web</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRONIC_ADDRESS__WEB = eINSTANCE.getElectronicAddress_Web();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRONIC_ADDRESS__PASSWORD = eINSTANCE.getElectronicAddress_Password();

		/**
		 * The meta object literal for the '<em><b>Radio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRONIC_ADDRESS__RADIO = eINSTANCE.getElectronicAddress_Radio();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.Common.impl.StatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Common.impl.StatusImpl
		 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getStatus()
		 * @generated
		 */
		EClass STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS__REASON = eINSTANCE.getStatus_Reason();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS__VALUE = eINSTANCE.getStatus_Value();

		/**
		 * The meta object literal for the '<em><b>Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS__REMARK = eINSTANCE.getStatus_Remark();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS__DATE_TIME = eINSTANCE.getStatus_DateTime();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.Common.impl.TownDetailImpl <em>Town Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Common.impl.TownDetailImpl
		 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getTownDetail()
		 * @generated
		 */
		EClass TOWN_DETAIL = eINSTANCE.getTownDetail();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOWN_DETAIL__COUNTRY = eINSTANCE.getTownDetail_Country();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOWN_DETAIL__CODE = eINSTANCE.getTownDetail_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOWN_DETAIL__NAME = eINSTANCE.getTownDetail_Name();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOWN_DETAIL__SECTION = eINSTANCE.getTownDetail_Section();

		/**
		 * The meta object literal for the '<em><b>State Or Province</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOWN_DETAIL__STATE_OR_PROVINCE = eINSTANCE.getTownDetail_StateOrProvince();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.Common.impl.TimePointImpl <em>Time Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.Common.impl.TimePointImpl
		 * @see CIM.IEC61968.Common.impl.CommonPackageImpl#getTimePoint()
		 * @generated
		 */
		EClass TIME_POINT = eINSTANCE.getTimePoint();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_POINT__SEQUENCE_NUMBER = eINSTANCE.getTimePoint_SequenceNumber();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_POINT__STATUS = eINSTANCE.getTimePoint_Status();

		/**
		 * The meta object literal for the '<em><b>Scheduled Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_POINT__SCHEDULED_EVENTS = eINSTANCE.getTimePoint_ScheduledEvents();

		/**
		 * The meta object literal for the '<em><b>Relative Time Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_POINT__RELATIVE_TIME_INTERVAL = eINSTANCE.getTimePoint_RelativeTimeInterval();

		/**
		 * The meta object literal for the '<em><b>Window</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_POINT__WINDOW = eINSTANCE.getTimePoint_Window();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_POINT__DATE_TIME = eINSTANCE.getTimePoint_DateTime();

		/**
		 * The meta object literal for the '<em><b>Time Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_POINT__TIME_SCHEDULE = eINSTANCE.getTimePoint_TimeSchedule();

	}

} //CommonPackage
