/**
 */
package gluemodel.CIM.IEC61970.Informative.Reservation;

import gluemodel.CIM.CIMPackage;

import gluemodel.CIM.IEC61970.Core.CorePackage;

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
 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This package includes information for Transaction Scheduling for Energy, Generation Capacity, Transmission, and Ancillary Services.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This package includes information for Transaction Scheduling for Energy, Generation Capacity, Transmission, and Ancillary Services.'"
 * @generated
 */
public interface ReservationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Reservation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#Reservation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimReservation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReservationPackage eINSTANCE = gluemodel.CIM.IEC61970.Informative.Reservation.impl.ReservationPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.TransmissionPathImpl <em>Transmission Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.TransmissionPathImpl
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.ReservationPackageImpl#getTransmissionPath()
	 * @generated
	 */
	int TRANSMISSION_PATH = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PATH__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Delivery Point For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PATH__DELIVERY_POINT_FOR = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offered On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PATH__OFFERED_ON = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Point Of Receipt For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PATH__POINT_OF_RECEIPT_FOR = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PATH__FOR = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Avail Transfer Capability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PATH__AVAIL_TRANSFER_CAPABILITY = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parallel Path Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PATH__PARALLEL_PATH_FLAG = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Located On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PATH__LOCATED_ON = CIMPackage.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Total Transfer Capability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PATH__TOTAL_TRANSFER_CAPABILITY = CIMPackage.ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Transmission Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PATH_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Transmission Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PATH_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.TiePointImpl <em>Tie Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.TiePointImpl
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.ReservationPackageImpl#getTiePoint()
	 * @generated
	 */
	int TIE_POINT = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_POINT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_POINT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_POINT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_POINT__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_POINT__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_POINT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_POINT__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_POINT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>By Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_POINT__BY_MEASUREMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declared Service Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_POINT__DECLARED_SERVICE_POINT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tie Point MW Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_POINT__TIE_POINT_MW_RATING = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>For Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_POINT__FOR_MEASUREMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tie Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_POINT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Tie Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_POINT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.ServiceReservationImpl <em>Service Reservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.ServiceReservationImpl
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.ReservationPackageImpl#getServiceReservation()
	 * @generated
	 */
	int SERVICE_RESERVATION = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESERVATION__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Holds</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESERVATION__HOLDS = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reserves Transmission Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESERVATION__RESERVES_TRANSMISSION_SERVICE = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reserves Ancillary Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESERVATION__RESERVES_ANCILLARY_SERVICES = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resells</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESERVATION__RESELLS = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sells</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESERVATION__SELLS = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Service Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESERVATION_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Service Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESERVATION_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.ServicePointImpl <em>Service Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.ServicePointImpl
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.ReservationPackageImpl#getServicePoint()
	 * @generated
	 */
	int SERVICE_POINT = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POINT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POINT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POINT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POINT__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POINT__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POINT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POINT__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POINT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Customer Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POINT__CUSTOMER_CONSUMER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transmission Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POINT__TRANSMISSION_PROVIDER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has APOR </b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POINT__HAS_APOR_ = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generation Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POINT__GENERATION_PROVIDER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Declare Tie Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POINT__DECLARE_TIE_POINT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Has APOD </b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POINT__HAS_APOD_ = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Energy Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POINT__ENERGY_PRODUCTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Member Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POINT__MEMBER_OF = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Service Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POINT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Service Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POINT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.AncillaryServiceImpl <em>Ancillary Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.AncillaryServiceImpl
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.ReservationPackageImpl#getAncillaryService()
	 * @generated
	 */
	int ANCILLARY_SERVICE = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Open Access Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE__OPEN_ACCESS_PRODUCT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transmission Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE__TRANSMISSION_PROVIDERS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reserved By Service Reservation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE__RESERVED_BY_SERVICE_RESERVATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Control Area Operator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE__CONTROL_AREA_OPERATOR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ancillary Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ancillary Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.ReservationVersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.ReservationVersionImpl
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.ReservationPackageImpl#getReservationVersion()
	 * @generated
	 */
	int RESERVATION_VERSION = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_VERSION__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_VERSION__DATE = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_VERSION__VERSION = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_VERSION_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_VERSION_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.TransmissionServiceImpl <em>Transmission Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.TransmissionServiceImpl
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.ReservationPackageImpl#getTransmissionService()
	 * @generated
	 */
	int TRANSMISSION_SERVICE = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_SERVICE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_SERVICE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_SERVICE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_SERVICE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_SERVICE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_SERVICE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_SERVICE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_SERVICE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Offering</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_SERVICE__OFFERING = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offered As</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_SERVICE__OFFERED_AS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scheduled By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_SERVICE__SCHEDULED_BY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reserved By Service Reservation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_SERVICE__RESERVED_BY_SERVICE_RESERVATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Trans Contract For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_SERVICE__TRANS_CONTRACT_FOR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Offers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_SERVICE__OFFERS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Transmission Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_SERVICE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Transmission Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_SERVICE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath <em>Transmission Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transmission Path</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath
	 * @generated
	 */
	EClass getTransmissionPath();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getDeliveryPointFor <em>Delivery Point For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delivery Point For</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getDeliveryPointFor()
	 * @see #getTransmissionPath()
	 * @generated
	 */
	EReference getTransmissionPath_DeliveryPointFor();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getOfferedOn <em>Offered On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offered On</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getOfferedOn()
	 * @see #getTransmissionPath()
	 * @generated
	 */
	EReference getTransmissionPath_OfferedOn();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getPointOfReceiptFor <em>Point Of Receipt For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Point Of Receipt For</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getPointOfReceiptFor()
	 * @see #getTransmissionPath()
	 * @generated
	 */
	EReference getTransmissionPath_PointOfReceiptFor();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getFor()
	 * @see #getTransmissionPath()
	 * @generated
	 */
	EReference getTransmissionPath_For();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getAvailTransferCapability <em>Avail Transfer Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avail Transfer Capability</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getAvailTransferCapability()
	 * @see #getTransmissionPath()
	 * @generated
	 */
	EAttribute getTransmissionPath_AvailTransferCapability();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#isParallelPathFlag <em>Parallel Path Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallel Path Flag</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#isParallelPathFlag()
	 * @see #getTransmissionPath()
	 * @generated
	 */
	EAttribute getTransmissionPath_ParallelPathFlag();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getLocatedOn <em>Located On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Located On</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getLocatedOn()
	 * @see #getTransmissionPath()
	 * @generated
	 */
	EReference getTransmissionPath_LocatedOn();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getTotalTransferCapability <em>Total Transfer Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Transfer Capability</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath#getTotalTransferCapability()
	 * @see #getTransmissionPath()
	 * @generated
	 */
	EAttribute getTransmissionPath_TotalTransferCapability();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint <em>Tie Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tie Point</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint
	 * @generated
	 */
	EClass getTiePoint();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint#getBy_Measurements <em>By Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>By Measurements</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint#getBy_Measurements()
	 * @see #getTiePoint()
	 * @generated
	 */
	EReference getTiePoint_By_Measurements();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint#getDeclared_ServicePoint <em>Declared Service Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declared Service Point</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint#getDeclared_ServicePoint()
	 * @see #getTiePoint()
	 * @generated
	 */
	EReference getTiePoint_Declared_ServicePoint();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint#getTiePointMWRating <em>Tie Point MW Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tie Point MW Rating</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint#getTiePointMWRating()
	 * @see #getTiePoint()
	 * @generated
	 */
	EAttribute getTiePoint_TiePointMWRating();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint#getFor_Measurements <em>For Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>For Measurements</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint#getFor_Measurements()
	 * @see #getTiePoint()
	 * @generated
	 */
	EReference getTiePoint_For_Measurements();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation <em>Service Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Reservation</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation
	 * @generated
	 */
	EClass getServiceReservation();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation#getHolds <em>Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Holds</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation#getHolds()
	 * @see #getServiceReservation()
	 * @generated
	 */
	EReference getServiceReservation_Holds();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation#getReserves_TransmissionService <em>Reserves Transmission Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reserves Transmission Service</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation#getReserves_TransmissionService()
	 * @see #getServiceReservation()
	 * @generated
	 */
	EReference getServiceReservation_Reserves_TransmissionService();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation#getReserves_AncillaryServices <em>Reserves Ancillary Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reserves Ancillary Services</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation#getReserves_AncillaryServices()
	 * @see #getServiceReservation()
	 * @generated
	 */
	EReference getServiceReservation_Reserves_AncillaryServices();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation#getResells <em>Resells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resells</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation#getResells()
	 * @see #getServiceReservation()
	 * @generated
	 */
	EReference getServiceReservation_Resells();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation#getSells <em>Sells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sells</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation#getSells()
	 * @see #getServiceReservation()
	 * @generated
	 */
	EReference getServiceReservation_Sells();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint <em>Service Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Point</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint
	 * @generated
	 */
	EClass getServicePoint();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getCustomerConsumer <em>Customer Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Consumer</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getCustomerConsumer()
	 * @see #getServicePoint()
	 * @generated
	 */
	EReference getServicePoint_CustomerConsumer();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getTransmissionProvider <em>Transmission Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transmission Provider</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getTransmissionProvider()
	 * @see #getServicePoint()
	 * @generated
	 */
	EReference getServicePoint_TransmissionProvider();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getHasAPOR_ <em>Has APOR </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has APOR </em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getHasAPOR_()
	 * @see #getServicePoint()
	 * @generated
	 */
	EReference getServicePoint_HasAPOR_();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getGenerationProvider <em>Generation Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generation Provider</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getGenerationProvider()
	 * @see #getServicePoint()
	 * @generated
	 */
	EReference getServicePoint_GenerationProvider();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getDeclare_TiePoint <em>Declare Tie Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declare Tie Point</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getDeclare_TiePoint()
	 * @see #getServicePoint()
	 * @generated
	 */
	EReference getServicePoint_Declare_TiePoint();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getHasAPOD_ <em>Has APOD </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has APOD </em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getHasAPOD_()
	 * @see #getServicePoint()
	 * @generated
	 */
	EReference getServicePoint_HasAPOD_();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getEnergyProducts <em>Energy Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energy Products</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getEnergyProducts()
	 * @see #getServicePoint()
	 * @generated
	 */
	EReference getServicePoint_EnergyProducts();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getMemberOf <em>Member Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Of</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getMemberOf()
	 * @see #getServicePoint()
	 * @generated
	 */
	EReference getServicePoint_MemberOf();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.Reservation.AncillaryService <em>Ancillary Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ancillary Service</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.AncillaryService
	 * @generated
	 */
	EClass getAncillaryService();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.Reservation.AncillaryService#getOpenAccessProduct <em>Open Access Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Open Access Product</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.AncillaryService#getOpenAccessProduct()
	 * @see #getAncillaryService()
	 * @generated
	 */
	EReference getAncillaryService_OpenAccessProduct();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.Reservation.AncillaryService#getTransmissionProviders <em>Transmission Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transmission Providers</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.AncillaryService#getTransmissionProviders()
	 * @see #getAncillaryService()
	 * @generated
	 */
	EReference getAncillaryService_TransmissionProviders();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.Reservation.AncillaryService#getReservedBy_ServiceReservation <em>Reserved By Service Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reserved By Service Reservation</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.AncillaryService#getReservedBy_ServiceReservation()
	 * @see #getAncillaryService()
	 * @generated
	 */
	EReference getAncillaryService_ReservedBy_ServiceReservation();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.Reservation.AncillaryService#getControlAreaOperator <em>Control Area Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Area Operator</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.AncillaryService#getControlAreaOperator()
	 * @see #getAncillaryService()
	 * @generated
	 */
	EReference getAncillaryService_ControlAreaOperator();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ReservationVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationVersion
	 * @generated
	 */
	EClass getReservationVersion();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ReservationVersion#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationVersion#getDate()
	 * @see #getReservationVersion()
	 * @generated
	 */
	EAttribute getReservationVersion_Date();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ReservationVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationVersion#getVersion()
	 * @see #getReservationVersion()
	 * @generated
	 */
	EAttribute getReservationVersion_Version();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService <em>Transmission Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transmission Service</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService
	 * @generated
	 */
	EClass getTransmissionService();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getOffering <em>Offering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offering</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getOffering()
	 * @see #getTransmissionService()
	 * @generated
	 */
	EReference getTransmissionService_Offering();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getOfferedAs <em>Offered As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offered As</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getOfferedAs()
	 * @see #getTransmissionService()
	 * @generated
	 */
	EReference getTransmissionService_OfferedAs();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getScheduledBy <em>Scheduled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scheduled By</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getScheduledBy()
	 * @see #getTransmissionService()
	 * @generated
	 */
	EReference getTransmissionService_ScheduledBy();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getReservedBy_ServiceReservation <em>Reserved By Service Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reserved By Service Reservation</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getReservedBy_ServiceReservation()
	 * @see #getTransmissionService()
	 * @generated
	 */
	EReference getTransmissionService_ReservedBy_ServiceReservation();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getTransContractFor <em>Trans Contract For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trans Contract For</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getTransContractFor()
	 * @see #getTransmissionService()
	 * @generated
	 */
	EReference getTransmissionService_TransContractFor();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getOffers <em>Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Offers</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getOffers()
	 * @see #getTransmissionService()
	 * @generated
	 */
	EReference getTransmissionService_Offers();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReservationFactory getReservationFactory();

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
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.TransmissionPathImpl <em>Transmission Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.TransmissionPathImpl
		 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.ReservationPackageImpl#getTransmissionPath()
		 * @generated
		 */
		EClass TRANSMISSION_PATH = eINSTANCE.getTransmissionPath();

		/**
		 * The meta object literal for the '<em><b>Delivery Point For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_PATH__DELIVERY_POINT_FOR = eINSTANCE.getTransmissionPath_DeliveryPointFor();

		/**
		 * The meta object literal for the '<em><b>Offered On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_PATH__OFFERED_ON = eINSTANCE.getTransmissionPath_OfferedOn();

		/**
		 * The meta object literal for the '<em><b>Point Of Receipt For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_PATH__POINT_OF_RECEIPT_FOR = eINSTANCE.getTransmissionPath_PointOfReceiptFor();

		/**
		 * The meta object literal for the '<em><b>For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_PATH__FOR = eINSTANCE.getTransmissionPath_For();

		/**
		 * The meta object literal for the '<em><b>Avail Transfer Capability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMISSION_PATH__AVAIL_TRANSFER_CAPABILITY = eINSTANCE.getTransmissionPath_AvailTransferCapability();

		/**
		 * The meta object literal for the '<em><b>Parallel Path Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMISSION_PATH__PARALLEL_PATH_FLAG = eINSTANCE.getTransmissionPath_ParallelPathFlag();

		/**
		 * The meta object literal for the '<em><b>Located On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_PATH__LOCATED_ON = eINSTANCE.getTransmissionPath_LocatedOn();

		/**
		 * The meta object literal for the '<em><b>Total Transfer Capability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMISSION_PATH__TOTAL_TRANSFER_CAPABILITY = eINSTANCE.getTransmissionPath_TotalTransferCapability();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.TiePointImpl <em>Tie Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.TiePointImpl
		 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.ReservationPackageImpl#getTiePoint()
		 * @generated
		 */
		EClass TIE_POINT = eINSTANCE.getTiePoint();

		/**
		 * The meta object literal for the '<em><b>By Measurements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIE_POINT__BY_MEASUREMENTS = eINSTANCE.getTiePoint_By_Measurements();

		/**
		 * The meta object literal for the '<em><b>Declared Service Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIE_POINT__DECLARED_SERVICE_POINT = eINSTANCE.getTiePoint_Declared_ServicePoint();

		/**
		 * The meta object literal for the '<em><b>Tie Point MW Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIE_POINT__TIE_POINT_MW_RATING = eINSTANCE.getTiePoint_TiePointMWRating();

		/**
		 * The meta object literal for the '<em><b>For Measurements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIE_POINT__FOR_MEASUREMENTS = eINSTANCE.getTiePoint_For_Measurements();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.ServiceReservationImpl <em>Service Reservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.ServiceReservationImpl
		 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.ReservationPackageImpl#getServiceReservation()
		 * @generated
		 */
		EClass SERVICE_RESERVATION = eINSTANCE.getServiceReservation();

		/**
		 * The meta object literal for the '<em><b>Holds</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_RESERVATION__HOLDS = eINSTANCE.getServiceReservation_Holds();

		/**
		 * The meta object literal for the '<em><b>Reserves Transmission Service</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_RESERVATION__RESERVES_TRANSMISSION_SERVICE = eINSTANCE.getServiceReservation_Reserves_TransmissionService();

		/**
		 * The meta object literal for the '<em><b>Reserves Ancillary Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_RESERVATION__RESERVES_ANCILLARY_SERVICES = eINSTANCE.getServiceReservation_Reserves_AncillaryServices();

		/**
		 * The meta object literal for the '<em><b>Resells</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_RESERVATION__RESELLS = eINSTANCE.getServiceReservation_Resells();

		/**
		 * The meta object literal for the '<em><b>Sells</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_RESERVATION__SELLS = eINSTANCE.getServiceReservation_Sells();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.ServicePointImpl <em>Service Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.ServicePointImpl
		 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.ReservationPackageImpl#getServicePoint()
		 * @generated
		 */
		EClass SERVICE_POINT = eINSTANCE.getServicePoint();

		/**
		 * The meta object literal for the '<em><b>Customer Consumer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_POINT__CUSTOMER_CONSUMER = eINSTANCE.getServicePoint_CustomerConsumer();

		/**
		 * The meta object literal for the '<em><b>Transmission Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_POINT__TRANSMISSION_PROVIDER = eINSTANCE.getServicePoint_TransmissionProvider();

		/**
		 * The meta object literal for the '<em><b>Has APOR </b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_POINT__HAS_APOR_ = eINSTANCE.getServicePoint_HasAPOR_();

		/**
		 * The meta object literal for the '<em><b>Generation Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_POINT__GENERATION_PROVIDER = eINSTANCE.getServicePoint_GenerationProvider();

		/**
		 * The meta object literal for the '<em><b>Declare Tie Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_POINT__DECLARE_TIE_POINT = eINSTANCE.getServicePoint_Declare_TiePoint();

		/**
		 * The meta object literal for the '<em><b>Has APOD </b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_POINT__HAS_APOD_ = eINSTANCE.getServicePoint_HasAPOD_();

		/**
		 * The meta object literal for the '<em><b>Energy Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_POINT__ENERGY_PRODUCTS = eINSTANCE.getServicePoint_EnergyProducts();

		/**
		 * The meta object literal for the '<em><b>Member Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_POINT__MEMBER_OF = eINSTANCE.getServicePoint_MemberOf();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.AncillaryServiceImpl <em>Ancillary Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.AncillaryServiceImpl
		 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.ReservationPackageImpl#getAncillaryService()
		 * @generated
		 */
		EClass ANCILLARY_SERVICE = eINSTANCE.getAncillaryService();

		/**
		 * The meta object literal for the '<em><b>Open Access Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANCILLARY_SERVICE__OPEN_ACCESS_PRODUCT = eINSTANCE.getAncillaryService_OpenAccessProduct();

		/**
		 * The meta object literal for the '<em><b>Transmission Providers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANCILLARY_SERVICE__TRANSMISSION_PROVIDERS = eINSTANCE.getAncillaryService_TransmissionProviders();

		/**
		 * The meta object literal for the '<em><b>Reserved By Service Reservation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANCILLARY_SERVICE__RESERVED_BY_SERVICE_RESERVATION = eINSTANCE.getAncillaryService_ReservedBy_ServiceReservation();

		/**
		 * The meta object literal for the '<em><b>Control Area Operator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANCILLARY_SERVICE__CONTROL_AREA_OPERATOR = eINSTANCE.getAncillaryService_ControlAreaOperator();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.ReservationVersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.ReservationVersionImpl
		 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.ReservationPackageImpl#getReservationVersion()
		 * @generated
		 */
		EClass RESERVATION_VERSION = eINSTANCE.getReservationVersion();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_VERSION__DATE = eINSTANCE.getReservationVersion_Date();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_VERSION__VERSION = eINSTANCE.getReservationVersion_Version();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.TransmissionServiceImpl <em>Transmission Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.TransmissionServiceImpl
		 * @see gluemodel.CIM.IEC61970.Informative.Reservation.impl.ReservationPackageImpl#getTransmissionService()
		 * @generated
		 */
		EClass TRANSMISSION_SERVICE = eINSTANCE.getTransmissionService();

		/**
		 * The meta object literal for the '<em><b>Offering</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_SERVICE__OFFERING = eINSTANCE.getTransmissionService_Offering();

		/**
		 * The meta object literal for the '<em><b>Offered As</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_SERVICE__OFFERED_AS = eINSTANCE.getTransmissionService_OfferedAs();

		/**
		 * The meta object literal for the '<em><b>Scheduled By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_SERVICE__SCHEDULED_BY = eINSTANCE.getTransmissionService_ScheduledBy();

		/**
		 * The meta object literal for the '<em><b>Reserved By Service Reservation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_SERVICE__RESERVED_BY_SERVICE_RESERVATION = eINSTANCE.getTransmissionService_ReservedBy_ServiceReservation();

		/**
		 * The meta object literal for the '<em><b>Trans Contract For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_SERVICE__TRANS_CONTRACT_FOR = eINSTANCE.getTransmissionService_TransContractFor();

		/**
		 * The meta object literal for the '<em><b>Offers</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_SERVICE__OFFERS = eINSTANCE.getTransmissionService_Offers();

	}

} //ReservationPackage
