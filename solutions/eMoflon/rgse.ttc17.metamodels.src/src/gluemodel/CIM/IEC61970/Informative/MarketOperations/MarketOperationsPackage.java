/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations;

import gluemodel.CIM.CIMPackage;

import gluemodel.CIM.IEC61968.Common.CommonPackage;

import gluemodel.CIM.IEC61970.Core.CorePackage;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import gluemodel.CIM.IEC61970.Meas.MeasPackage;

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
 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsFactory
 * @model kind="package"
 * @generated
 */
public interface MarketOperationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MarketOperations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#MarketOperations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimMarketOperations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MarketOperationsPackage eINSTANCE = gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.NotificationTimeCurveImpl <em>Notification Time Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.NotificationTimeCurveImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getNotificationTimeCurve()
	 * @generated
	 */
	int NOTIFICATION_TIME_CURVE = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TIME_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TIME_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TIME_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TIME_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TIME_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TIME_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TIME_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TIME_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TIME_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TIME_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TIME_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TIME_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TIME_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TIME_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TIME_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TIME_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TIME_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TIME_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Generating Bids</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TIME_CURVE__GENERATING_BIDS = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Notification Time Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TIME_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Notification Time Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_TIME_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.EnergyPriceCurveImpl <em>Energy Price Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.EnergyPriceCurveImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getEnergyPriceCurve()
	 * @generated
	 */
	int ENERGY_PRICE_CURVE = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRICE_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRICE_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRICE_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRICE_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRICE_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRICE_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRICE_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRICE_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRICE_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRICE_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRICE_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRICE_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRICE_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRICE_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRICE_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRICE_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRICE_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRICE_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>FT Rs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRICE_CURVE__FT_RS = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Energy Transactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRICE_CURVE__ENERGY_TRANSACTIONS = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Energy Price Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRICE_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Energy Price Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PRICE_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MeterImpl <em>Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MeterImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getMeter()
	 * @generated
	 */
	int METER = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Registered Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__REGISTERED_RESOURCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementImpl <em>Market Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getMarketStatement()
	 * @generated
	 */
	int MARKET_STATEMENT = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Trade Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__TRADE_DATE = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transaction Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__TRANSACTION_DATE = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__REFERENCE_NUMBER = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__END = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Market Statement Line Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__MARKET_STATEMENT_LINE_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT__START = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Market Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Market Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ContingencyConstraintLimitImpl <em>Contingency Constraint Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ContingencyConstraintLimitImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getContingencyConstraintLimit()
	 * @generated
	 */
	int CONTINGENCY_CONSTRAINT_LIMIT = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_CONSTRAINT_LIMIT__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_CONSTRAINT_LIMIT__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_CONSTRAINT_LIMIT__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_CONSTRAINT_LIMIT__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_CONSTRAINT_LIMIT__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_CONSTRAINT_LIMIT__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_CONSTRAINT_LIMIT__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_CONSTRAINT_LIMIT__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_CONSTRAINT_LIMIT__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_CONSTRAINT_LIMIT__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_CONSTRAINT_LIMIT__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_CONSTRAINT_LIMIT__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_CONSTRAINT_LIMIT__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_CONSTRAINT_LIMIT__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_CONSTRAINT_LIMIT__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_CONSTRAINT_LIMIT__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_CONSTRAINT_LIMIT__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_CONSTRAINT_LIMIT__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Security Constraint Sum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MW Limit Schedules</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_CONSTRAINT_LIMIT__MW_LIMIT_SCHEDULES = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contingency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_CONSTRAINT_LIMIT__CONTINGENCY = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Contingency Constraint Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_CONSTRAINT_LIMIT_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Contingency Constraint Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_CONSTRAINT_LIMIT_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RegisteredResourceImpl <em>Registered Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RegisteredResourceImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getRegisteredResource()
	 * @generated
	 */
	int REGISTERED_RESOURCE = 17;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_RESOURCE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_RESOURCE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_RESOURCE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_RESOURCE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_RESOURCE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_RESOURCE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_RESOURCE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_RESOURCE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Markets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_RESOURCE__MARKETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Market Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_RESOURCE__MARKET_PRODUCTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rto ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_RESOURCE__RTO_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Meters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_RESOURCE__METERS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pnode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_RESOURCE__PNODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_RESOURCE__ORGANISATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resource Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_RESOURCE__RESOURCE_GROUPS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Registered Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_RESOURCE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Registered Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_RESOURCE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RegisteredGeneratorImpl <em>Registered Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RegisteredGeneratorImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getRegisteredGenerator()
	 * @generated
	 */
	int REGISTERED_GENERATOR = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__UUID = REGISTERED_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__MRID = REGISTERED_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__NAME = REGISTERED_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__DESCRIPTION = REGISTERED_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__PATH_NAME = REGISTERED_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__MODELING_AUTHORITY_SET = REGISTERED_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__LOCAL_NAME = REGISTERED_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__ALIAS_NAME = REGISTERED_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Markets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__MARKETS = REGISTERED_RESOURCE__MARKETS;

	/**
	 * The feature id for the '<em><b>Market Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__MARKET_PRODUCTS = REGISTERED_RESOURCE__MARKET_PRODUCTS;

	/**
	 * The feature id for the '<em><b>Rto ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__RTO_ID = REGISTERED_RESOURCE__RTO_ID;

	/**
	 * The feature id for the '<em><b>Meters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__METERS = REGISTERED_RESOURCE__METERS;

	/**
	 * The feature id for the '<em><b>Pnode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__PNODE = REGISTERED_RESOURCE__PNODE;

	/**
	 * The feature id for the '<em><b>Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__ORGANISATION = REGISTERED_RESOURCE__ORGANISATION;

	/**
	 * The feature id for the '<em><b>Resource Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__RESOURCE_GROUPS = REGISTERED_RESOURCE__RESOURCE_GROUPS;

	/**
	 * The feature id for the '<em><b>Low Control LImit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__LOW_CONTROL_LIMIT = REGISTERED_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Control Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__LOWER_CONTROL_RATE = REGISTERED_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ramp Rate Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__RAMP_RATE_CURVES = REGISTERED_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit Initial Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__UNIT_INITIAL_CONDITIONS = REGISTERED_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Start Up Cost Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__START_UP_COST_CURVES = REGISTERED_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Raise Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__RAISE_RAMP_RATE = REGISTERED_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Raise Control Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__RAISE_CONTROL_RATE = REGISTERED_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Maximum Allowable Spinning Reserve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__MAXIMUM_ALLOWABLE_SPINNING_RESERVE = REGISTERED_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__GENERATING_UNIT = REGISTERED_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Maximum Operating MW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__MAXIMUM_OPERATING_MW = REGISTERED_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>High Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__HIGH_CONTROL_LIMIT = REGISTERED_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Minimum Operating MW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__MINIMUM_OPERATING_MW = REGISTERED_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Lower Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__LOWER_RAMP_RATE = REGISTERED_RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Generating Bids</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__GENERATING_BIDS = REGISTERED_RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Spin Reserve Ramp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR__SPIN_RESERVE_RAMP = REGISTERED_RESOURCE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Registered Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR_FEATURE_COUNT = REGISTERED_RESOURCE_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Registered Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_GENERATOR_OPERATION_COUNT = REGISTERED_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidImpl <em>Bid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getBid()
	 * @generated
	 */
	int BID = 42;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Stop Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__STOP_TIME = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Market Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__MARKET_TYPE = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product Bids</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__PRODUCT_BIDS = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bid Clearing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__BID_CLEARING = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__START_TIME = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Market</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID__MARKET = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Bid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Bid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.TransactionBidImpl <em>Transaction Bid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.TransactionBidImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getTransactionBid()
	 * @generated
	 */
	int TRANSACTION_BID = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__UUID = BID__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__MRID = BID__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__NAME = BID__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__DESCRIPTION = BID__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__PATH_NAME = BID__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__MODELING_AUTHORITY_SET = BID__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__LOCAL_NAME = BID__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__ALIAS_NAME = BID__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__SUBJECT = BID__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__SCHEDULED_EVENTS = BID__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__ERP_ORGANISATION_ROLES = BID__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__CREATED_DATE_TIME = BID__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__TO_DOCUMENT_ROLES = BID__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__ASSET_ROLES = BID__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__ERP_PERSON_ROLES = BID__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__REVISION_NUMBER = BID__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__ELECTRONIC_ADDRESS = BID__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__STATUS = BID__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__NETWORK_DATA_SETS = BID__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__POWER_SYSTEM_RESOURCE_ROLES = BID__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__CATEGORY = BID__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__ACTIVITY_RECORDS = BID__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__MEASUREMENTS = BID__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__FROM_DOCUMENT_ROLES = BID__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__LAST_MODIFIED_DATE_TIME = BID__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__CHANGE_SETS = BID__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__DOC_STATUS = BID__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__CHANGE_ITEMS = BID__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__SCHEDULE_PARAMETER_INFOS = BID__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__TITLE = BID__TITLE;

	/**
	 * The feature id for the '<em><b>Stop Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__STOP_TIME = BID__STOP_TIME;

	/**
	 * The feature id for the '<em><b>Market Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__MARKET_TYPE = BID__MARKET_TYPE;

	/**
	 * The feature id for the '<em><b>Product Bids</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__PRODUCT_BIDS = BID__PRODUCT_BIDS;

	/**
	 * The feature id for the '<em><b>Bid Clearing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__BID_CLEARING = BID__BID_CLEARING;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__START_TIME = BID__START_TIME;

	/**
	 * The feature id for the '<em><b>Market</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__MARKET = BID__MARKET;

	/**
	 * The feature id for the '<em><b>Energy Trans Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__ENERGY_TRANS_ID = BID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Energy Profiles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__ENERGY_PROFILES = BID_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Delivery Pnode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__DELIVERY_PNODE = BID_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Receipt Pnode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID__RECEIPT_PNODE = BID_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transaction Bid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID_FEATURE_COUNT = BID_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Transaction Bid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_BID_OPERATION_COUNT = BID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SecurityConstraintsImpl <em>Security Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SecurityConstraintsImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getSecurityConstraints()
	 * @generated
	 */
	int SECURITY_CONSTRAINTS = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Min MW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS__MIN_MW = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max MW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS__MAX_MW = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>RTO</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS__RTO = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Actual MW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS__ACTUAL_MW = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Security Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Security Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ViolationLimitImpl <em>Violation Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ViolationLimitImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getViolationLimit()
	 * @generated
	 */
	int VIOLATION_LIMIT = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_LIMIT__UUID = MeasPackage.LIMIT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_LIMIT__MRID = MeasPackage.LIMIT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_LIMIT__NAME = MeasPackage.LIMIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_LIMIT__DESCRIPTION = MeasPackage.LIMIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_LIMIT__PATH_NAME = MeasPackage.LIMIT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_LIMIT__MODELING_AUTHORITY_SET = MeasPackage.LIMIT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_LIMIT__LOCAL_NAME = MeasPackage.LIMIT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_LIMIT__ALIAS_NAME = MeasPackage.LIMIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Procedures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_LIMIT__PROCEDURES = MeasPackage.LIMIT__PROCEDURES;

	/**
	 * The feature id for the '<em><b>Season</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_LIMIT__SEASON = MeasPackage.LIMIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_LIMIT__MEASUREMENT = MeasPackage.LIMIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_LIMIT__ORGANISATIONS = MeasPackage.LIMIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Flowgate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_LIMIT__FLOWGATE = MeasPackage.LIMIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Enforced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_LIMIT__ENFORCED = MeasPackage.LIMIT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Violation Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_LIMIT_FEATURE_COUNT = MeasPackage.LIMIT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Violation Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_LIMIT_OPERATION_COUNT = MeasPackage.LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.StartUpCostCurveImpl <em>Start Up Cost Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.StartUpCostCurveImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getStartUpCostCurve()
	 * @generated
	 */
	int START_UP_COST_CURVE = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_COST_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_COST_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_COST_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_COST_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_COST_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_COST_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_COST_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_COST_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_COST_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_COST_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_COST_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_COST_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_COST_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_COST_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_COST_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_COST_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_COST_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_COST_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Generating Bids</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_COST_CURVE__GENERATING_BIDS = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Registered Generators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_COST_CURVE__REGISTERED_GENERATORS = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Start Up Cost Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_COST_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Start Up Cost Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_COST_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.DefaultConstraintLimitImpl <em>Default Constraint Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.DefaultConstraintLimitImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getDefaultConstraintLimit()
	 * @generated
	 */
	int DEFAULT_CONSTRAINT_LIMIT = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTRAINT_LIMIT__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTRAINT_LIMIT__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTRAINT_LIMIT__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTRAINT_LIMIT__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTRAINT_LIMIT__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTRAINT_LIMIT__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTRAINT_LIMIT__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTRAINT_LIMIT__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTRAINT_LIMIT__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTRAINT_LIMIT__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTRAINT_LIMIT__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTRAINT_LIMIT__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTRAINT_LIMIT__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTRAINT_LIMIT__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTRAINT_LIMIT__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTRAINT_LIMIT__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTRAINT_LIMIT__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTRAINT_LIMIT__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Security Constraint Sum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Default Constraint Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTRAINT_LIMIT_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Default Constraint Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTRAINT_LIMIT_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BillDeterminantImpl <em>Bill Determinant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BillDeterminantImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getBillDeterminant()
	 * @generated
	 */
	int BILL_DETERMINANT = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>User Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__USER_ATTRIBUTES = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Precision Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__PRECISION_LEVEL = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Charge Profile Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__CHARGE_PROFILE_DATA = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit Of Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__UNIT_OF_MEASURE = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Calculation Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__CALCULATION_LEVEL = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Config Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__CONFIG_VERSION = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Charge Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__CHARGE_PROFILE = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Number Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT__NUMBER_INTERVAL = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Bill Determinant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Bill Determinant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DETERMINANT_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LoadReductionPriceCurveImpl <em>Load Reduction Price Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LoadReductionPriceCurveImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getLoadReductionPriceCurve()
	 * @generated
	 */
	int LOAD_REDUCTION_PRICE_CURVE = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_REDUCTION_PRICE_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_REDUCTION_PRICE_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_REDUCTION_PRICE_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_REDUCTION_PRICE_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_REDUCTION_PRICE_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_REDUCTION_PRICE_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_REDUCTION_PRICE_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_REDUCTION_PRICE_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_REDUCTION_PRICE_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_REDUCTION_PRICE_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_REDUCTION_PRICE_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_REDUCTION_PRICE_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_REDUCTION_PRICE_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_REDUCTION_PRICE_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_REDUCTION_PRICE_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_REDUCTION_PRICE_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_REDUCTION_PRICE_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_REDUCTION_PRICE_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Load Bids</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_REDUCTION_PRICE_CURVE__LOAD_BIDS = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Load Reduction Price Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_REDUCTION_PRICE_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Load Reduction Price Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_REDUCTION_PRICE_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ChargeProfileImpl <em>Charge Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ChargeProfileImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getChargeProfile()
	 * @generated
	 */
	int CHARGE_PROFILE = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE__UUID = EnergySchedulingPackage.PROFILE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE__MRID = EnergySchedulingPackage.PROFILE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE__NAME = EnergySchedulingPackage.PROFILE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE__DESCRIPTION = EnergySchedulingPackage.PROFILE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE__PATH_NAME = EnergySchedulingPackage.PROFILE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE__MODELING_AUTHORITY_SET = EnergySchedulingPackage.PROFILE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE__LOCAL_NAME = EnergySchedulingPackage.PROFILE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE__ALIAS_NAME = EnergySchedulingPackage.PROFILE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Profile Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE__PROFILE_DATAS = EnergySchedulingPackage.PROFILE__PROFILE_DATAS;

	/**
	 * The feature id for the '<em><b>Pass Trough Bill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE__PASS_TROUGH_BILL = EnergySchedulingPackage.PROFILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE__TYPE = EnergySchedulingPackage.PROFILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Charge Profile Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE__CHARGE_PROFILE_DATA = EnergySchedulingPackage.PROFILE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit Of Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE__UNIT_OF_MEASURE = EnergySchedulingPackage.PROFILE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bill Determinant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE__BILL_DETERMINANT = EnergySchedulingPackage.PROFILE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE__FREQUENCY = EnergySchedulingPackage.PROFILE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Number Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE__NUMBER_INTERVAL = EnergySchedulingPackage.PROFILE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Charge Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE_FEATURE_COUNT = EnergySchedulingPackage.PROFILE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Charge Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE_OPERATION_COUNT = EnergySchedulingPackage.PROFILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SettlementImpl <em>Settlement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SettlementImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getSettlement()
	 * @generated
	 */
	int SETTLEMENT = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Market</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__MARKET = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trade Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__TRADE_DATE = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Ledger Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__ERP_LEDGER_ENTRIES = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Erp Invoice Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__ERP_INVOICE_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Settlement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Settlement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketImpl <em>Market</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getMarket()
	 * @generated
	 */
	int MARKET = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Market Factors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__MARKET_FACTORS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__START = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Market Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__MARKET_PRODUCTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>RTO</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__RTO = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ramp Interval Non Spin Res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__RAMP_INTERVAL_NON_SPIN_RES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__END = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Time Interval Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__TIME_INTERVAL_LENGTH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Settlements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__SETTLEMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Bids</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__BIDS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Ramp Interval Reg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__RAMP_INTERVAL_REG = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Registered Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__REGISTERED_RESOURCES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Ramp Interval Spin Res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__RAMP_INTERVAL_SPIN_RES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Dst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__DST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Ramp Interval Energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__RAMP_INTERVAL_ENERGY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Local Time Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__LOCAL_TIME_ZONE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Market</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Market</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ResourceGroupReqImpl <em>Resource Group Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ResourceGroupReqImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getResourceGroupReq()
	 * @generated
	 */
	int RESOURCE_GROUP_REQ = 55;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP_REQ__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP_REQ__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP_REQ__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP_REQ__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP_REQ__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP_REQ__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP_REQ__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP_REQ__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Resource Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP_REQ__RESOURCE_GROUP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>RT Os</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP_REQ__RT_OS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Group Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP_REQ_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Resource Group Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP_REQ_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ReserveReqImpl <em>Reserve Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ReserveReqImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getReserveReq()
	 * @generated
	 */
	int RESERVE_REQ = 16;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ__UUID = RESOURCE_GROUP_REQ__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ__MRID = RESOURCE_GROUP_REQ__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ__NAME = RESOURCE_GROUP_REQ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ__DESCRIPTION = RESOURCE_GROUP_REQ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ__PATH_NAME = RESOURCE_GROUP_REQ__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ__MODELING_AUTHORITY_SET = RESOURCE_GROUP_REQ__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ__LOCAL_NAME = RESOURCE_GROUP_REQ__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ__ALIAS_NAME = RESOURCE_GROUP_REQ__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Resource Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ__RESOURCE_GROUP = RESOURCE_GROUP_REQ__RESOURCE_GROUP;

	/**
	 * The feature id for the '<em><b>RT Os</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ__RT_OS = RESOURCE_GROUP_REQ__RT_OS;

	/**
	 * The feature id for the '<em><b>Sensitivity Price Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ__SENSITIVITY_PRICE_CURVE = RESOURCE_GROUP_REQ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reserve Req Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ__RESERVE_REQ_CURVE = RESOURCE_GROUP_REQ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Market Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ__MARKET_PRODUCT = RESOURCE_GROUP_REQ_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reserve Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ_FEATURE_COUNT = RESOURCE_GROUP_REQ_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Reserve Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ_OPERATION_COUNT = RESOURCE_GROUP_REQ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketProductImpl <em>Market Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketProductImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getMarketProduct()
	 * @generated
	 */
	int MARKET_PRODUCT = 18;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PRODUCT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PRODUCT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PRODUCT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PRODUCT__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PRODUCT__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PRODUCT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PRODUCT__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PRODUCT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Product Bids</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PRODUCT__PRODUCT_BIDS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Market</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PRODUCT__MARKET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reserve Reqs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PRODUCT__RESERVE_REQS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Registered Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PRODUCT__REGISTERED_RESOURCES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Market Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PRODUCT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Market Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PRODUCT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ResourceBidImpl <em>Resource Bid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ResourceBidImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getResourceBid()
	 * @generated
	 */
	int RESOURCE_BID = 36;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__UUID = BID__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__MRID = BID__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__NAME = BID__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__DESCRIPTION = BID__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__PATH_NAME = BID__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__MODELING_AUTHORITY_SET = BID__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__LOCAL_NAME = BID__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__ALIAS_NAME = BID__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__SUBJECT = BID__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__SCHEDULED_EVENTS = BID__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__ERP_ORGANISATION_ROLES = BID__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__CREATED_DATE_TIME = BID__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__TO_DOCUMENT_ROLES = BID__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__ASSET_ROLES = BID__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__ERP_PERSON_ROLES = BID__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__REVISION_NUMBER = BID__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__ELECTRONIC_ADDRESS = BID__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__STATUS = BID__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__NETWORK_DATA_SETS = BID__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__POWER_SYSTEM_RESOURCE_ROLES = BID__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__CATEGORY = BID__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__ACTIVITY_RECORDS = BID__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__MEASUREMENTS = BID__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__FROM_DOCUMENT_ROLES = BID__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__LAST_MODIFIED_DATE_TIME = BID__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__CHANGE_SETS = BID__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__DOC_STATUS = BID__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__CHANGE_ITEMS = BID__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__SCHEDULE_PARAMETER_INFOS = BID__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__TITLE = BID__TITLE;

	/**
	 * The feature id for the '<em><b>Stop Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__STOP_TIME = BID__STOP_TIME;

	/**
	 * The feature id for the '<em><b>Market Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__MARKET_TYPE = BID__MARKET_TYPE;

	/**
	 * The feature id for the '<em><b>Product Bids</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__PRODUCT_BIDS = BID__PRODUCT_BIDS;

	/**
	 * The feature id for the '<em><b>Bid Clearing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__BID_CLEARING = BID__BID_CLEARING;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__START_TIME = BID__START_TIME;

	/**
	 * The feature id for the '<em><b>Market</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__MARKET = BID__MARKET;

	/**
	 * The feature id for the '<em><b>Start Ups Max Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__START_UPS_MAX_WEEK = BID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Commodity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__COMMODITY_TYPE = BID_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Energy Max Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__ENERGY_MAX_DAY = BID_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Energy Min Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__ENERGY_MIN_DAY = BID_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__VIRTUAL = BID_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Shut Downs Max Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__SHUT_DOWNS_MAX_WEEK = BID_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Shut Downs Max Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__SHUT_DOWNS_MAX_DAY = BID_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Start Ups Max Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID__START_UPS_MAX_DAY = BID_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Resource Bid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID_FEATURE_COUNT = BID_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Resource Bid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BID_OPERATION_COUNT = BID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.GeneratingBidImpl <em>Generating Bid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.GeneratingBidImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getGeneratingBid()
	 * @generated
	 */
	int GENERATING_BID = 19;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__UUID = RESOURCE_BID__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__MRID = RESOURCE_BID__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__NAME = RESOURCE_BID__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__DESCRIPTION = RESOURCE_BID__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__PATH_NAME = RESOURCE_BID__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__MODELING_AUTHORITY_SET = RESOURCE_BID__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__LOCAL_NAME = RESOURCE_BID__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__ALIAS_NAME = RESOURCE_BID__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__SUBJECT = RESOURCE_BID__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__SCHEDULED_EVENTS = RESOURCE_BID__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__ERP_ORGANISATION_ROLES = RESOURCE_BID__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__CREATED_DATE_TIME = RESOURCE_BID__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__TO_DOCUMENT_ROLES = RESOURCE_BID__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__ASSET_ROLES = RESOURCE_BID__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__ERP_PERSON_ROLES = RESOURCE_BID__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__REVISION_NUMBER = RESOURCE_BID__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__ELECTRONIC_ADDRESS = RESOURCE_BID__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__STATUS = RESOURCE_BID__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__NETWORK_DATA_SETS = RESOURCE_BID__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__POWER_SYSTEM_RESOURCE_ROLES = RESOURCE_BID__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__CATEGORY = RESOURCE_BID__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__ACTIVITY_RECORDS = RESOURCE_BID__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__MEASUREMENTS = RESOURCE_BID__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__FROM_DOCUMENT_ROLES = RESOURCE_BID__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__LAST_MODIFIED_DATE_TIME = RESOURCE_BID__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__CHANGE_SETS = RESOURCE_BID__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__DOC_STATUS = RESOURCE_BID__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__CHANGE_ITEMS = RESOURCE_BID__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__SCHEDULE_PARAMETER_INFOS = RESOURCE_BID__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__TITLE = RESOURCE_BID__TITLE;

	/**
	 * The feature id for the '<em><b>Stop Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__STOP_TIME = RESOURCE_BID__STOP_TIME;

	/**
	 * The feature id for the '<em><b>Market Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__MARKET_TYPE = RESOURCE_BID__MARKET_TYPE;

	/**
	 * The feature id for the '<em><b>Product Bids</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__PRODUCT_BIDS = RESOURCE_BID__PRODUCT_BIDS;

	/**
	 * The feature id for the '<em><b>Bid Clearing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__BID_CLEARING = RESOURCE_BID__BID_CLEARING;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__START_TIME = RESOURCE_BID__START_TIME;

	/**
	 * The feature id for the '<em><b>Market</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__MARKET = RESOURCE_BID__MARKET;

	/**
	 * The feature id for the '<em><b>Start Ups Max Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__START_UPS_MAX_WEEK = RESOURCE_BID__START_UPS_MAX_WEEK;

	/**
	 * The feature id for the '<em><b>Commodity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__COMMODITY_TYPE = RESOURCE_BID__COMMODITY_TYPE;

	/**
	 * The feature id for the '<em><b>Energy Max Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__ENERGY_MAX_DAY = RESOURCE_BID__ENERGY_MAX_DAY;

	/**
	 * The feature id for the '<em><b>Energy Min Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__ENERGY_MIN_DAY = RESOURCE_BID__ENERGY_MIN_DAY;

	/**
	 * The feature id for the '<em><b>Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__VIRTUAL = RESOURCE_BID__VIRTUAL;

	/**
	 * The feature id for the '<em><b>Shut Downs Max Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__SHUT_DOWNS_MAX_WEEK = RESOURCE_BID__SHUT_DOWNS_MAX_WEEK;

	/**
	 * The feature id for the '<em><b>Shut Downs Max Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__SHUT_DOWNS_MAX_DAY = RESOURCE_BID__SHUT_DOWNS_MAX_DAY;

	/**
	 * The feature id for the '<em><b>Start Ups Max Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__START_UPS_MAX_DAY = RESOURCE_BID__START_UPS_MAX_DAY;

	/**
	 * The feature id for the '<em><b>Up Time Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__UP_TIME_MIN = RESOURCE_BID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Registered Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__REGISTERED_GENERATOR = RESOURCE_BID_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maximum Economic MW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__MAXIMUM_ECONOMIC_MW = RESOURCE_BID_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bid Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__BID_SET = RESOURCE_BID_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Start Up Time Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__START_UP_TIME_CURVE = RESOURCE_BID_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Up Time Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__UP_TIME_MAX = RESOURCE_BID_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Start Up Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__START_UP_TYPE = RESOURCE_BID_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Notification Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__NOTIFICATION_TIME = RESOURCE_BID_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Notification Time Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__NOTIFICATION_TIME_CURVE = RESOURCE_BID_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Max Emergency MW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__MAX_EMERGENCY_MW = RESOURCE_BID_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Startup Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__STARTUP_TIME = RESOURCE_BID_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Start Up Cost Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__START_UP_COST_CURVE = RESOURCE_BID_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Minimum Economic MW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__MINIMUM_ECONOMIC_MW = RESOURCE_BID_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Min Emergency MW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__MIN_EMERGENCY_MW = RESOURCE_BID_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>No Load Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__NO_LOAD_COST = RESOURCE_BID_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Minimum Down Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__MINIMUM_DOWN_TIME = RESOURCE_BID_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Down Time Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__DOWN_TIME_MAX = RESOURCE_BID_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Start Up Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__START_UP_RAMP_RATE = RESOURCE_BID_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Operating Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID__OPERATING_MODE = RESOURCE_BID_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Generating Bid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID_FEATURE_COUNT = RESOURCE_BID_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>Generating Bid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_BID_OPERATION_COUNT = RESOURCE_BID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ConstraintTermImpl <em>Constraint Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ConstraintTermImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getConstraintTerm()
	 * @generated
	 */
	int CONSTRAINT_TERM = 22;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TERM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TERM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TERM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TERM__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TERM__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TERM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TERM__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TERM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TERM__FACTOR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Security Constraint Sum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TERM__SECURITY_CONSTRAINT_SUM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TERM__FUNCTION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constraint Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TERM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Constraint Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TERM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.TerminalConstraintTermImpl <em>Terminal Constraint Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.TerminalConstraintTermImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getTerminalConstraintTerm()
	 * @generated
	 */
	int TERMINAL_CONSTRAINT_TERM = 20;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_CONSTRAINT_TERM__UUID = CONSTRAINT_TERM__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_CONSTRAINT_TERM__MRID = CONSTRAINT_TERM__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_CONSTRAINT_TERM__NAME = CONSTRAINT_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_CONSTRAINT_TERM__DESCRIPTION = CONSTRAINT_TERM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_CONSTRAINT_TERM__PATH_NAME = CONSTRAINT_TERM__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_CONSTRAINT_TERM__MODELING_AUTHORITY_SET = CONSTRAINT_TERM__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_CONSTRAINT_TERM__LOCAL_NAME = CONSTRAINT_TERM__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_CONSTRAINT_TERM__ALIAS_NAME = CONSTRAINT_TERM__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_CONSTRAINT_TERM__FACTOR = CONSTRAINT_TERM__FACTOR;

	/**
	 * The feature id for the '<em><b>Security Constraint Sum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_CONSTRAINT_TERM__SECURITY_CONSTRAINT_SUM = CONSTRAINT_TERM__SECURITY_CONSTRAINT_SUM;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_CONSTRAINT_TERM__FUNCTION = CONSTRAINT_TERM__FUNCTION;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_CONSTRAINT_TERM__TERMINAL = CONSTRAINT_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Terminal Constraint Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_CONSTRAINT_TERM_FEATURE_COUNT = CONSTRAINT_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Terminal Constraint Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_CONSTRAINT_TERM_OPERATION_COUNT = CONSTRAINT_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RTOImpl <em>RTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RTOImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getRTO()
	 * @generated
	 */
	int RTO = 21;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__UUID = InfERPSupportPackage.ERP_ORGANISATION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__MRID = InfERPSupportPackage.ERP_ORGANISATION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__NAME = InfERPSupportPackage.ERP_ORGANISATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__DESCRIPTION = InfERPSupportPackage.ERP_ORGANISATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__PATH_NAME = InfERPSupportPackage.ERP_ORGANISATION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__MODELING_AUTHORITY_SET = InfERPSupportPackage.ERP_ORGANISATION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__LOCAL_NAME = InfERPSupportPackage.ERP_ORGANISATION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__ALIAS_NAME = InfERPSupportPackage.ERP_ORGANISATION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Street Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__STREET_ADDRESS = InfERPSupportPackage.ERP_ORGANISATION__STREET_ADDRESS;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__ELECTRONIC_ADDRESS = InfERPSupportPackage.ERP_ORGANISATION__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Postal Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__POSTAL_ADDRESS = InfERPSupportPackage.ERP_ORGANISATION__POSTAL_ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__PHONE1 = InfERPSupportPackage.ERP_ORGANISATION__PHONE1;

	/**
	 * The feature id for the '<em><b>Phone2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__PHONE2 = InfERPSupportPackage.ERP_ORGANISATION__PHONE2;

	/**
	 * The feature id for the '<em><b>Market Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__MARKET_ROLES = InfERPSupportPackage.ERP_ORGANISATION__MARKET_ROLES;

	/**
	 * The feature id for the '<em><b>Business Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__BUSINESS_ROLES = InfERPSupportPackage.ERP_ORGANISATION__BUSINESS_ROLES;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__CREWS = InfERPSupportPackage.ERP_ORGANISATION__CREWS;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__REQUESTS = InfERPSupportPackage.ERP_ORGANISATION__REQUESTS;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__MODE = InfERPSupportPackage.ERP_ORGANISATION__MODE;

	/**
	 * The feature id for the '<em><b>Opt Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__OPT_OUT = InfERPSupportPackage.ERP_ORGANISATION__OPT_OUT;

	/**
	 * The feature id for the '<em><b>Registered Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__REGISTERED_RESOURCES = InfERPSupportPackage.ERP_ORGANISATION__REGISTERED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__POWER_SYSTEM_RESOURCE_ROLES = InfERPSupportPackage.ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Is Profit Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__IS_PROFIT_CENTER = InfERPSupportPackage.ERP_ORGANISATION__IS_PROFIT_CENTER;

	/**
	 * The feature id for the '<em><b>Is Cost Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__IS_COST_CENTER = InfERPSupportPackage.ERP_ORGANISATION__IS_COST_CENTER;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__DOCUMENT_ROLES = InfERPSupportPackage.ERP_ORGANISATION__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__ASSET_ROLES = InfERPSupportPackage.ERP_ORGANISATION__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Violation Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__VIOLATION_LIMITS = InfERPSupportPackage.ERP_ORGANISATION__VIOLATION_LIMITS;

	/**
	 * The feature id for the '<em><b>Parent Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__PARENT_ORGANISATION_ROLES = InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Land Property Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__LAND_PROPERTY_ROLES = InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__ERP_PERSON_ROLES = InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__CODE = InfERPSupportPackage.ERP_ORGANISATION__CODE;

	/**
	 * The feature id for the '<em><b>Child Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__CHILD_ORGANISATION_ROLES = InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Industry ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__INDUSTRY_ID = InfERPSupportPackage.ERP_ORGANISATION__INDUSTRY_ID;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__CHANGE_ITEMS = InfERPSupportPackage.ERP_ORGANISATION__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__CATEGORY = InfERPSupportPackage.ERP_ORGANISATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__LOCATIONS = InfERPSupportPackage.ERP_ORGANISATION__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Int Sched Agreement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__INT_SCHED_AGREEMENT = InfERPSupportPackage.ERP_ORGANISATION__INT_SCHED_AGREEMENT;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__ACTIVITY_RECORDS = InfERPSupportPackage.ERP_ORGANISATION__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Government ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__GOVERNMENT_ID = InfERPSupportPackage.ERP_ORGANISATION__GOVERNMENT_ID;

	/**
	 * The feature id for the '<em><b>Markets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__MARKETS = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__SECURITY_CONSTRAINTS = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Group Reqs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__RESOURCE_GROUP_REQS = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Security Constraints Linear</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__SECURITY_CONSTRAINTS_LINEAR = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pnodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__PNODES = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>RTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO_FEATURE_COUNT = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>RTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO_OPERATION_COUNT = InfERPSupportPackage.ERP_ORGANISATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl <em>Pass Through Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getPassThroughBill()
	 * @generated
	 */
	int PASS_THROUGH_BILL = 23;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Bill End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__BILL_END = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__EFFECTIVE_DATE = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__SERVICE_END = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Profiled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__IS_PROFILED = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Previous End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__PREVIOUS_END = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__AMOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Time Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__TIME_ZONE = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Billed To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__BILLED_TO = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Disputed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__IS_DISPUTED = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Provided By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__PROVIDED_BY = CommonPackage.DOCUMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Market Statement Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__MARKET_STATEMENT_LINE_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Bill Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__BILL_START = CommonPackage.DOCUMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Previous Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__PREVIOUS_START = CommonPackage.DOCUMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Service Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__SERVICE_START = CommonPackage.DOCUMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Product Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__PRODUCT_CODE = CommonPackage.DOCUMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Bill Run Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__BILL_RUN_TYPE = CommonPackage.DOCUMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Transaction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__TRANSACTION_TYPE = CommonPackage.DOCUMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>User Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__USER_ATTRIBUTES = CommonPackage.DOCUMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Charge Profiles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__CHARGE_PROFILES = CommonPackage.DOCUMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Trade Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__TRADE_DATE = CommonPackage.DOCUMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__PRICE = CommonPackage.DOCUMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Tax Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__TAX_AMOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Sold To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__SOLD_TO = CommonPackage.DOCUMENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Transaction Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__TRANSACTION_DATE = CommonPackage.DOCUMENT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Paid To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__PAID_TO = CommonPackage.DOCUMENT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL__QUANTITY = CommonPackage.DOCUMENT_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>Pass Through Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 26;

	/**
	 * The number of operations of the '<em>Pass Through Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_BILL_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PnodeImpl <em>Pnode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PnodeImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getPnode()
	 * @generated
	 */
	int PNODE = 24;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Receipt Transaction Bids</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__RECEIPT_TRANSACTION_BIDS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>RTO</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__RTO = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Registered Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__REGISTERED_RESOURCES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Begin Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__BEGIN_PERIOD = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pnode Clearing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__PNODE_CLEARING = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Delivery Transaction Bids</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__DELIVERY_TRANSACTION_BIDS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__IS_PUBLIC = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Connectivity Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__CONNECTIVITY_NODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>FT Rs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__FT_RS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>End Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__END_PERIOD = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__MEASUREMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__USAGE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Pnode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Pnode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketFactorsImpl <em>Market Factors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketFactorsImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getMarketFactors()
	 * @generated
	 */
	int MARKET_FACTORS = 44;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Erp Invoices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__ERP_INVOICES = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Market</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__MARKET = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interval Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS__INTERVAL_START_TIME = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Market Factors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Market Factors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FACTORS_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PnodeClearingImpl <em>Pnode Clearing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PnodeClearingImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getPnodeClearing()
	 * @generated
	 */
	int PNODE_CLEARING = 25;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__UUID = MARKET_FACTORS__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__MRID = MARKET_FACTORS__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__NAME = MARKET_FACTORS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__DESCRIPTION = MARKET_FACTORS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__PATH_NAME = MARKET_FACTORS__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__MODELING_AUTHORITY_SET = MARKET_FACTORS__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__LOCAL_NAME = MARKET_FACTORS__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__ALIAS_NAME = MARKET_FACTORS__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__SUBJECT = MARKET_FACTORS__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__SCHEDULED_EVENTS = MARKET_FACTORS__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__ERP_ORGANISATION_ROLES = MARKET_FACTORS__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__CREATED_DATE_TIME = MARKET_FACTORS__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__TO_DOCUMENT_ROLES = MARKET_FACTORS__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__ASSET_ROLES = MARKET_FACTORS__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__ERP_PERSON_ROLES = MARKET_FACTORS__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__REVISION_NUMBER = MARKET_FACTORS__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__ELECTRONIC_ADDRESS = MARKET_FACTORS__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__STATUS = MARKET_FACTORS__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__NETWORK_DATA_SETS = MARKET_FACTORS__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__POWER_SYSTEM_RESOURCE_ROLES = MARKET_FACTORS__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__CATEGORY = MARKET_FACTORS__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__ACTIVITY_RECORDS = MARKET_FACTORS__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__MEASUREMENTS = MARKET_FACTORS__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__FROM_DOCUMENT_ROLES = MARKET_FACTORS__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__LAST_MODIFIED_DATE_TIME = MARKET_FACTORS__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__CHANGE_SETS = MARKET_FACTORS__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__DOC_STATUS = MARKET_FACTORS__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__CHANGE_ITEMS = MARKET_FACTORS__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__SCHEDULE_PARAMETER_INFOS = MARKET_FACTORS__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__TITLE = MARKET_FACTORS__TITLE;

	/**
	 * The feature id for the '<em><b>Erp Invoices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__ERP_INVOICES = MARKET_FACTORS__ERP_INVOICES;

	/**
	 * The feature id for the '<em><b>Market</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__MARKET = MARKET_FACTORS__MARKET;

	/**
	 * The feature id for the '<em><b>Interval Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__INTERVAL_START_TIME = MARKET_FACTORS__INTERVAL_START_TIME;

	/**
	 * The feature id for the '<em><b>Congest LMP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__CONGEST_LMP = MARKET_FACTORS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cost LMP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__COST_LMP = MARKET_FACTORS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Loss LMP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__LOSS_LMP = MARKET_FACTORS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pnode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING__PNODE = MARKET_FACTORS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Pnode Clearing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING_FEATURE_COUNT = MARKET_FACTORS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Pnode Clearing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_CLEARING_OPERATION_COUNT = MARKET_FACTORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.StartUpTimeCurveImpl <em>Start Up Time Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.StartUpTimeCurveImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getStartUpTimeCurve()
	 * @generated
	 */
	int START_UP_TIME_CURVE = 26;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_TIME_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_TIME_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_TIME_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_TIME_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_TIME_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_TIME_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_TIME_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_TIME_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_TIME_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_TIME_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_TIME_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_TIME_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_TIME_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_TIME_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_TIME_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_TIME_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_TIME_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_TIME_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Generating Bids</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_TIME_CURVE__GENERATING_BIDS = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start Up Time Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_TIME_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Start Up Time Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_UP_TIME_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SecurityConstraintSumImpl <em>Security Constraint Sum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SecurityConstraintSumImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getSecurityConstraintSum()
	 * @generated
	 */
	int SECURITY_CONSTRAINT_SUM = 27;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__UUID = MARKET_FACTORS__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__MRID = MARKET_FACTORS__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__NAME = MARKET_FACTORS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__DESCRIPTION = MARKET_FACTORS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__PATH_NAME = MARKET_FACTORS__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__MODELING_AUTHORITY_SET = MARKET_FACTORS__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__LOCAL_NAME = MARKET_FACTORS__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__ALIAS_NAME = MARKET_FACTORS__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__SUBJECT = MARKET_FACTORS__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__SCHEDULED_EVENTS = MARKET_FACTORS__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__ERP_ORGANISATION_ROLES = MARKET_FACTORS__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__CREATED_DATE_TIME = MARKET_FACTORS__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__TO_DOCUMENT_ROLES = MARKET_FACTORS__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__ASSET_ROLES = MARKET_FACTORS__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__ERP_PERSON_ROLES = MARKET_FACTORS__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__REVISION_NUMBER = MARKET_FACTORS__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__ELECTRONIC_ADDRESS = MARKET_FACTORS__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__STATUS = MARKET_FACTORS__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__NETWORK_DATA_SETS = MARKET_FACTORS__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__POWER_SYSTEM_RESOURCE_ROLES = MARKET_FACTORS__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__CATEGORY = MARKET_FACTORS__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__ACTIVITY_RECORDS = MARKET_FACTORS__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__MEASUREMENTS = MARKET_FACTORS__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__FROM_DOCUMENT_ROLES = MARKET_FACTORS__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__LAST_MODIFIED_DATE_TIME = MARKET_FACTORS__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__CHANGE_SETS = MARKET_FACTORS__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__DOC_STATUS = MARKET_FACTORS__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__CHANGE_ITEMS = MARKET_FACTORS__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__SCHEDULE_PARAMETER_INFOS = MARKET_FACTORS__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__TITLE = MARKET_FACTORS__TITLE;

	/**
	 * The feature id for the '<em><b>Erp Invoices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__ERP_INVOICES = MARKET_FACTORS__ERP_INVOICES;

	/**
	 * The feature id for the '<em><b>Market</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__MARKET = MARKET_FACTORS__MARKET;

	/**
	 * The feature id for the '<em><b>Interval Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__INTERVAL_START_TIME = MARKET_FACTORS__INTERVAL_START_TIME;

	/**
	 * The feature id for the '<em><b>Contingency Constraint Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__CONTINGENCY_CONSTRAINT_LIMITS = MARKET_FACTORS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Constraint Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__DEFAULT_CONSTRAINT_LIMIT = MARKET_FACTORS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Case Constraint Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__BASE_CASE_CONSTRAINT_LIMIT = MARKET_FACTORS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constraint Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__CONSTRAINT_TERMS = MARKET_FACTORS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>RTO</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM__RTO = MARKET_FACTORS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Security Constraint Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM_FEATURE_COUNT = MARKET_FACTORS_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Security Constraint Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_SUM_OPERATION_COUNT = MARKET_FACTORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BaseCaseConstraintLimitImpl <em>Base Case Constraint Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BaseCaseConstraintLimitImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getBaseCaseConstraintLimit()
	 * @generated
	 */
	int BASE_CASE_CONSTRAINT_LIMIT = 28;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CASE_CONSTRAINT_LIMIT__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CASE_CONSTRAINT_LIMIT__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CASE_CONSTRAINT_LIMIT__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CASE_CONSTRAINT_LIMIT__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CASE_CONSTRAINT_LIMIT__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CASE_CONSTRAINT_LIMIT__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CASE_CONSTRAINT_LIMIT__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CASE_CONSTRAINT_LIMIT__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CASE_CONSTRAINT_LIMIT__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CASE_CONSTRAINT_LIMIT__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CASE_CONSTRAINT_LIMIT__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CASE_CONSTRAINT_LIMIT__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CASE_CONSTRAINT_LIMIT__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CASE_CONSTRAINT_LIMIT__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CASE_CONSTRAINT_LIMIT__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CASE_CONSTRAINT_LIMIT__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CASE_CONSTRAINT_LIMIT__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CASE_CONSTRAINT_LIMIT__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Security Constraint Sum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CASE_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base Case Constraint Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CASE_CONSTRAINT_LIMIT_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Base Case Constraint Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CASE_CONSTRAINT_LIMIT_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ProductBidImpl <em>Product Bid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ProductBidImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getProductBid()
	 * @generated
	 */
	int PRODUCT_BID = 29;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Bid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID__BID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Bid Clearing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID__PRODUCT_BID_CLEARING = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bid Price Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID__BID_PRICE_CURVE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Market Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID__MARKET_PRODUCT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Product Bid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Product Bid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MWLimitScheduleImpl <em>MW Limit Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MWLimitScheduleImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getMWLimitSchedule()
	 * @generated
	 */
	int MW_LIMIT_SCHEDULE = 30;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LIMIT_SCHEDULE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LIMIT_SCHEDULE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LIMIT_SCHEDULE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LIMIT_SCHEDULE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LIMIT_SCHEDULE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LIMIT_SCHEDULE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LIMIT_SCHEDULE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LIMIT_SCHEDULE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LIMIT_SCHEDULE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LIMIT_SCHEDULE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LIMIT_SCHEDULE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LIMIT_SCHEDULE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LIMIT_SCHEDULE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LIMIT_SCHEDULE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LIMIT_SCHEDULE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LIMIT_SCHEDULE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LIMIT_SCHEDULE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LIMIT_SCHEDULE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Security Constraint Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LIMIT_SCHEDULE__SECURITY_CONSTRAINT_LIMIT = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MW Limit Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LIMIT_SCHEDULE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MW Limit Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LIMIT_SCHEDULE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl <em>Market Statement Line Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getMarketStatementLineItem()
	 * @generated
	 */
	int MARKET_STATEMENT_LINE_ITEM = 31;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Current Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__CURRENT_AMOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Previous ISO Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__PREVIOUS_ISO_AMOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quantity UOM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__QUANTITY_UOM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Net ISO Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__NET_ISO_AMOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>User Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__USER_ATTRIBUTES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Current ISO Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__CURRENT_ISO_AMOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Previous Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__PREVIOUS_QUANTITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Component Market Statement Line Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__COMPONENT_MARKET_STATEMENT_LINE_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Previous Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__PREVIOUS_AMOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Net ISO Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__NET_ISO_QUANTITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Net Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__NET_PRICE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Current ISO Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__CURRENT_ISO_QUANTITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Current Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__CURRENT_PRICE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Pass Through Bill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__PASS_THROUGH_BILL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Previsou Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__PREVISOU_PRICE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Market Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__MARKET_STATEMENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Previous ISO Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__PREVIOUS_ISO_QUANTITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Interval Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__INTERVAL_DATE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Net Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__NET_QUANTITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Net Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__NET_AMOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Current Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__CURRENT_QUANTITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Interval Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__INTERVAL_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Container Market Statement Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM__CONTAINER_MARKET_STATEMENT_LINE_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>Market Statement Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 23;

	/**
	 * The number of operations of the '<em>Market Statement Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_STATEMENT_LINE_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.AncillaryServiceClearingImpl <em>Ancillary Service Clearing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.AncillaryServiceClearingImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getAncillaryServiceClearing()
	 * @generated
	 */
	int ANCILLARY_SERVICE_CLEARING = 32;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__UUID = MARKET_FACTORS__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__MRID = MARKET_FACTORS__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__NAME = MARKET_FACTORS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__DESCRIPTION = MARKET_FACTORS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__PATH_NAME = MARKET_FACTORS__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__MODELING_AUTHORITY_SET = MARKET_FACTORS__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__LOCAL_NAME = MARKET_FACTORS__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__ALIAS_NAME = MARKET_FACTORS__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__SUBJECT = MARKET_FACTORS__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__SCHEDULED_EVENTS = MARKET_FACTORS__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__ERP_ORGANISATION_ROLES = MARKET_FACTORS__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__CREATED_DATE_TIME = MARKET_FACTORS__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__TO_DOCUMENT_ROLES = MARKET_FACTORS__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__ASSET_ROLES = MARKET_FACTORS__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__ERP_PERSON_ROLES = MARKET_FACTORS__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__REVISION_NUMBER = MARKET_FACTORS__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__ELECTRONIC_ADDRESS = MARKET_FACTORS__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__STATUS = MARKET_FACTORS__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__NETWORK_DATA_SETS = MARKET_FACTORS__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__POWER_SYSTEM_RESOURCE_ROLES = MARKET_FACTORS__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__CATEGORY = MARKET_FACTORS__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__ACTIVITY_RECORDS = MARKET_FACTORS__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__MEASUREMENTS = MARKET_FACTORS__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__FROM_DOCUMENT_ROLES = MARKET_FACTORS__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__LAST_MODIFIED_DATE_TIME = MARKET_FACTORS__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__CHANGE_SETS = MARKET_FACTORS__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__DOC_STATUS = MARKET_FACTORS__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__CHANGE_ITEMS = MARKET_FACTORS__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__SCHEDULE_PARAMETER_INFOS = MARKET_FACTORS__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__TITLE = MARKET_FACTORS__TITLE;

	/**
	 * The feature id for the '<em><b>Erp Invoices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__ERP_INVOICES = MARKET_FACTORS__ERP_INVOICES;

	/**
	 * The feature id for the '<em><b>Market</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__MARKET = MARKET_FACTORS__MARKET;

	/**
	 * The feature id for the '<em><b>Interval Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__INTERVAL_START_TIME = MARKET_FACTORS__INTERVAL_START_TIME;

	/**
	 * The feature id for the '<em><b>Mcp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__MCP = MARKET_FACTORS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cleared MW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__CLEARED_MW = MARKET_FACTORS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Market Case Clearing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__MARKET_CASE_CLEARING = MARKET_FACTORS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Commodity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING__COMMODITY_TYPE = MARKET_FACTORS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ancillary Service Clearing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING_FEATURE_COUNT = MARKET_FACTORS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ancillary Service Clearing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCILLARY_SERVICE_CLEARING_OPERATION_COUNT = MARKET_FACTORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidSetImpl <em>Bid Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidSetImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getBidSet()
	 * @generated
	 */
	int BID_SET = 33;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_SET__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_SET__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_SET__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_SET__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_SET__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_SET__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_SET__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_SET__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Generating Bids</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_SET__GENERATING_BIDS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bid Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_SET_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bid Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_SET_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SecurityConstraintsClearingImpl <em>Security Constraints Clearing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SecurityConstraintsClearingImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getSecurityConstraintsClearing()
	 * @generated
	 */
	int SECURITY_CONSTRAINTS_CLEARING = 34;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__UUID = MARKET_FACTORS__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__MRID = MARKET_FACTORS__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__NAME = MARKET_FACTORS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__DESCRIPTION = MARKET_FACTORS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__PATH_NAME = MARKET_FACTORS__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__MODELING_AUTHORITY_SET = MARKET_FACTORS__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__LOCAL_NAME = MARKET_FACTORS__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__ALIAS_NAME = MARKET_FACTORS__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__SUBJECT = MARKET_FACTORS__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__SCHEDULED_EVENTS = MARKET_FACTORS__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__ERP_ORGANISATION_ROLES = MARKET_FACTORS__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__CREATED_DATE_TIME = MARKET_FACTORS__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__TO_DOCUMENT_ROLES = MARKET_FACTORS__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__ASSET_ROLES = MARKET_FACTORS__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__ERP_PERSON_ROLES = MARKET_FACTORS__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__REVISION_NUMBER = MARKET_FACTORS__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__ELECTRONIC_ADDRESS = MARKET_FACTORS__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__STATUS = MARKET_FACTORS__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__NETWORK_DATA_SETS = MARKET_FACTORS__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__POWER_SYSTEM_RESOURCE_ROLES = MARKET_FACTORS__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__CATEGORY = MARKET_FACTORS__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__ACTIVITY_RECORDS = MARKET_FACTORS__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__MEASUREMENTS = MARKET_FACTORS__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__FROM_DOCUMENT_ROLES = MARKET_FACTORS__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__LAST_MODIFIED_DATE_TIME = MARKET_FACTORS__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__CHANGE_SETS = MARKET_FACTORS__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__DOC_STATUS = MARKET_FACTORS__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__CHANGE_ITEMS = MARKET_FACTORS__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__SCHEDULE_PARAMETER_INFOS = MARKET_FACTORS__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__TITLE = MARKET_FACTORS__TITLE;

	/**
	 * The feature id for the '<em><b>Erp Invoices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__ERP_INVOICES = MARKET_FACTORS__ERP_INVOICES;

	/**
	 * The feature id for the '<em><b>Market</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__MARKET = MARKET_FACTORS__MARKET;

	/**
	 * The feature id for the '<em><b>Interval Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__INTERVAL_START_TIME = MARKET_FACTORS__INTERVAL_START_TIME;

	/**
	 * The feature id for the '<em><b>Mw Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__MW_LIMIT = MARKET_FACTORS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mw Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__MW_FLOW = MARKET_FACTORS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shadow Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING__SHADOW_PRICE = MARKET_FACTORS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Security Constraints Clearing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING_FEATURE_COUNT = MARKET_FACTORS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Security Constraints Clearing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINTS_CLEARING_OPERATION_COUNT = MARKET_FACTORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ProductBidClearingImpl <em>Product Bid Clearing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ProductBidClearingImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getProductBidClearing()
	 * @generated
	 */
	int PRODUCT_BID_CLEARING = 35;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__UUID = MARKET_FACTORS__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__MRID = MARKET_FACTORS__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__NAME = MARKET_FACTORS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__DESCRIPTION = MARKET_FACTORS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__PATH_NAME = MARKET_FACTORS__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__MODELING_AUTHORITY_SET = MARKET_FACTORS__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__LOCAL_NAME = MARKET_FACTORS__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__ALIAS_NAME = MARKET_FACTORS__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__SUBJECT = MARKET_FACTORS__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__SCHEDULED_EVENTS = MARKET_FACTORS__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__ERP_ORGANISATION_ROLES = MARKET_FACTORS__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__CREATED_DATE_TIME = MARKET_FACTORS__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__TO_DOCUMENT_ROLES = MARKET_FACTORS__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__ASSET_ROLES = MARKET_FACTORS__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__ERP_PERSON_ROLES = MARKET_FACTORS__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__REVISION_NUMBER = MARKET_FACTORS__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__ELECTRONIC_ADDRESS = MARKET_FACTORS__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__STATUS = MARKET_FACTORS__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__NETWORK_DATA_SETS = MARKET_FACTORS__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__POWER_SYSTEM_RESOURCE_ROLES = MARKET_FACTORS__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__CATEGORY = MARKET_FACTORS__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__ACTIVITY_RECORDS = MARKET_FACTORS__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__MEASUREMENTS = MARKET_FACTORS__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__FROM_DOCUMENT_ROLES = MARKET_FACTORS__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__LAST_MODIFIED_DATE_TIME = MARKET_FACTORS__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__CHANGE_SETS = MARKET_FACTORS__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__DOC_STATUS = MARKET_FACTORS__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__CHANGE_ITEMS = MARKET_FACTORS__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__SCHEDULE_PARAMETER_INFOS = MARKET_FACTORS__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__TITLE = MARKET_FACTORS__TITLE;

	/**
	 * The feature id for the '<em><b>Erp Invoices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__ERP_INVOICES = MARKET_FACTORS__ERP_INVOICES;

	/**
	 * The feature id for the '<em><b>Market</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__MARKET = MARKET_FACTORS__MARKET;

	/**
	 * The feature id for the '<em><b>Interval Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__INTERVAL_START_TIME = MARKET_FACTORS__INTERVAL_START_TIME;

	/**
	 * The feature id for the '<em><b>Cleared MW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__CLEARED_MW = MARKET_FACTORS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Bids</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING__PRODUCT_BIDS = MARKET_FACTORS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Product Bid Clearing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING_FEATURE_COUNT = MARKET_FACTORS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Product Bid Clearing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BID_CLEARING_OPERATION_COUNT = MARKET_FACTORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.CapacityBenefitMarginImpl <em>Capacity Benefit Margin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.CapacityBenefitMarginImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getCapacityBenefitMargin()
	 * @generated
	 */
	int CAPACITY_BENEFIT_MARGIN = 37;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_BENEFIT_MARGIN__UUID = EnergySchedulingPackage.PROFILE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_BENEFIT_MARGIN__MRID = EnergySchedulingPackage.PROFILE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_BENEFIT_MARGIN__NAME = EnergySchedulingPackage.PROFILE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_BENEFIT_MARGIN__DESCRIPTION = EnergySchedulingPackage.PROFILE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_BENEFIT_MARGIN__PATH_NAME = EnergySchedulingPackage.PROFILE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_BENEFIT_MARGIN__MODELING_AUTHORITY_SET = EnergySchedulingPackage.PROFILE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_BENEFIT_MARGIN__LOCAL_NAME = EnergySchedulingPackage.PROFILE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_BENEFIT_MARGIN__ALIAS_NAME = EnergySchedulingPackage.PROFILE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Profile Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_BENEFIT_MARGIN__PROFILE_DATAS = EnergySchedulingPackage.PROFILE__PROFILE_DATAS;

	/**
	 * The feature id for the '<em><b>Season</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_BENEFIT_MARGIN__SEASON = EnergySchedulingPackage.PROFILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flowgate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_BENEFIT_MARGIN__FLOWGATE = EnergySchedulingPackage.PROFILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Capacity Benefit Margin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_BENEFIT_MARGIN_FEATURE_COUNT = EnergySchedulingPackage.PROFILE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Capacity Benefit Margin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_BENEFIT_MARGIN_OPERATION_COUNT = EnergySchedulingPackage.PROFILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SchedulingCoordinatorImpl <em>Scheduling Coordinator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SchedulingCoordinatorImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getSchedulingCoordinator()
	 * @generated
	 */
	int SCHEDULING_COORDINATOR = 38;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__UUID = InfERPSupportPackage.ERP_ORGANISATION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__MRID = InfERPSupportPackage.ERP_ORGANISATION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__NAME = InfERPSupportPackage.ERP_ORGANISATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__DESCRIPTION = InfERPSupportPackage.ERP_ORGANISATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__PATH_NAME = InfERPSupportPackage.ERP_ORGANISATION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__MODELING_AUTHORITY_SET = InfERPSupportPackage.ERP_ORGANISATION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__LOCAL_NAME = InfERPSupportPackage.ERP_ORGANISATION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__ALIAS_NAME = InfERPSupportPackage.ERP_ORGANISATION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Street Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__STREET_ADDRESS = InfERPSupportPackage.ERP_ORGANISATION__STREET_ADDRESS;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__ELECTRONIC_ADDRESS = InfERPSupportPackage.ERP_ORGANISATION__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Postal Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__POSTAL_ADDRESS = InfERPSupportPackage.ERP_ORGANISATION__POSTAL_ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__PHONE1 = InfERPSupportPackage.ERP_ORGANISATION__PHONE1;

	/**
	 * The feature id for the '<em><b>Phone2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__PHONE2 = InfERPSupportPackage.ERP_ORGANISATION__PHONE2;

	/**
	 * The feature id for the '<em><b>Market Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__MARKET_ROLES = InfERPSupportPackage.ERP_ORGANISATION__MARKET_ROLES;

	/**
	 * The feature id for the '<em><b>Business Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__BUSINESS_ROLES = InfERPSupportPackage.ERP_ORGANISATION__BUSINESS_ROLES;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__CREWS = InfERPSupportPackage.ERP_ORGANISATION__CREWS;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__REQUESTS = InfERPSupportPackage.ERP_ORGANISATION__REQUESTS;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__MODE = InfERPSupportPackage.ERP_ORGANISATION__MODE;

	/**
	 * The feature id for the '<em><b>Opt Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__OPT_OUT = InfERPSupportPackage.ERP_ORGANISATION__OPT_OUT;

	/**
	 * The feature id for the '<em><b>Registered Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__REGISTERED_RESOURCES = InfERPSupportPackage.ERP_ORGANISATION__REGISTERED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__POWER_SYSTEM_RESOURCE_ROLES = InfERPSupportPackage.ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Is Profit Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__IS_PROFIT_CENTER = InfERPSupportPackage.ERP_ORGANISATION__IS_PROFIT_CENTER;

	/**
	 * The feature id for the '<em><b>Is Cost Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__IS_COST_CENTER = InfERPSupportPackage.ERP_ORGANISATION__IS_COST_CENTER;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__DOCUMENT_ROLES = InfERPSupportPackage.ERP_ORGANISATION__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__ASSET_ROLES = InfERPSupportPackage.ERP_ORGANISATION__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Violation Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__VIOLATION_LIMITS = InfERPSupportPackage.ERP_ORGANISATION__VIOLATION_LIMITS;

	/**
	 * The feature id for the '<em><b>Parent Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__PARENT_ORGANISATION_ROLES = InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Land Property Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__LAND_PROPERTY_ROLES = InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__ERP_PERSON_ROLES = InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__CODE = InfERPSupportPackage.ERP_ORGANISATION__CODE;

	/**
	 * The feature id for the '<em><b>Child Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__CHILD_ORGANISATION_ROLES = InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Industry ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__INDUSTRY_ID = InfERPSupportPackage.ERP_ORGANISATION__INDUSTRY_ID;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__CHANGE_ITEMS = InfERPSupportPackage.ERP_ORGANISATION__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__CATEGORY = InfERPSupportPackage.ERP_ORGANISATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__LOCATIONS = InfERPSupportPackage.ERP_ORGANISATION__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Int Sched Agreement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__INT_SCHED_AGREEMENT = InfERPSupportPackage.ERP_ORGANISATION__INT_SCHED_AGREEMENT;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__ACTIVITY_RECORDS = InfERPSupportPackage.ERP_ORGANISATION__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Government ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR__GOVERNMENT_ID = InfERPSupportPackage.ERP_ORGANISATION__GOVERNMENT_ID;

	/**
	 * The number of structural features of the '<em>Scheduling Coordinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR_FEATURE_COUNT = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scheduling Coordinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_COORDINATOR_OPERATION_COUNT = InfERPSupportPackage.ERP_ORGANISATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RampRateCurveImpl <em>Ramp Rate Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RampRateCurveImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getRampRateCurve()
	 * @generated
	 */
	int RAMP_RATE_CURVE = 39;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_RATE_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_RATE_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_RATE_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_RATE_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_RATE_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_RATE_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_RATE_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_RATE_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_RATE_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_RATE_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_RATE_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_RATE_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_RATE_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_RATE_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_RATE_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_RATE_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_RATE_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_RATE_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Generating Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_RATE_CURVE__GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ramp Rate Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_RATE_CURVE__RAMP_RATE_TYPE = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ramp Rate Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_RATE_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ramp Rate Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_RATE_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidClearingImpl <em>Bid Clearing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidClearingImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getBidClearing()
	 * @generated
	 */
	int BID_CLEARING = 40;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_CLEARING__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Start Up Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_CLEARING__START_UP_COST = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_CLEARING__BID = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>No Load Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_CLEARING__NO_LOAD_COST = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lost Op Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_CLEARING__LOST_OP_COST = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bid Clearing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_CLEARING_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Bid Clearing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_CLEARING_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LoadBidImpl <em>Load Bid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LoadBidImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getLoadBid()
	 * @generated
	 */
	int LOAD_BID = 41;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__UUID = RESOURCE_BID__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__MRID = RESOURCE_BID__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__NAME = RESOURCE_BID__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__DESCRIPTION = RESOURCE_BID__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__PATH_NAME = RESOURCE_BID__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__MODELING_AUTHORITY_SET = RESOURCE_BID__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__LOCAL_NAME = RESOURCE_BID__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__ALIAS_NAME = RESOURCE_BID__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__SUBJECT = RESOURCE_BID__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__SCHEDULED_EVENTS = RESOURCE_BID__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__ERP_ORGANISATION_ROLES = RESOURCE_BID__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__CREATED_DATE_TIME = RESOURCE_BID__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__TO_DOCUMENT_ROLES = RESOURCE_BID__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__ASSET_ROLES = RESOURCE_BID__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__ERP_PERSON_ROLES = RESOURCE_BID__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__REVISION_NUMBER = RESOURCE_BID__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__ELECTRONIC_ADDRESS = RESOURCE_BID__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__STATUS = RESOURCE_BID__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__NETWORK_DATA_SETS = RESOURCE_BID__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__POWER_SYSTEM_RESOURCE_ROLES = RESOURCE_BID__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__CATEGORY = RESOURCE_BID__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__ACTIVITY_RECORDS = RESOURCE_BID__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__MEASUREMENTS = RESOURCE_BID__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__FROM_DOCUMENT_ROLES = RESOURCE_BID__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__LAST_MODIFIED_DATE_TIME = RESOURCE_BID__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__CHANGE_SETS = RESOURCE_BID__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__DOC_STATUS = RESOURCE_BID__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__CHANGE_ITEMS = RESOURCE_BID__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__SCHEDULE_PARAMETER_INFOS = RESOURCE_BID__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__TITLE = RESOURCE_BID__TITLE;

	/**
	 * The feature id for the '<em><b>Stop Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__STOP_TIME = RESOURCE_BID__STOP_TIME;

	/**
	 * The feature id for the '<em><b>Market Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__MARKET_TYPE = RESOURCE_BID__MARKET_TYPE;

	/**
	 * The feature id for the '<em><b>Product Bids</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__PRODUCT_BIDS = RESOURCE_BID__PRODUCT_BIDS;

	/**
	 * The feature id for the '<em><b>Bid Clearing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__BID_CLEARING = RESOURCE_BID__BID_CLEARING;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__START_TIME = RESOURCE_BID__START_TIME;

	/**
	 * The feature id for the '<em><b>Market</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__MARKET = RESOURCE_BID__MARKET;

	/**
	 * The feature id for the '<em><b>Start Ups Max Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__START_UPS_MAX_WEEK = RESOURCE_BID__START_UPS_MAX_WEEK;

	/**
	 * The feature id for the '<em><b>Commodity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__COMMODITY_TYPE = RESOURCE_BID__COMMODITY_TYPE;

	/**
	 * The feature id for the '<em><b>Energy Max Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__ENERGY_MAX_DAY = RESOURCE_BID__ENERGY_MAX_DAY;

	/**
	 * The feature id for the '<em><b>Energy Min Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__ENERGY_MIN_DAY = RESOURCE_BID__ENERGY_MIN_DAY;

	/**
	 * The feature id for the '<em><b>Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__VIRTUAL = RESOURCE_BID__VIRTUAL;

	/**
	 * The feature id for the '<em><b>Shut Downs Max Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__SHUT_DOWNS_MAX_WEEK = RESOURCE_BID__SHUT_DOWNS_MAX_WEEK;

	/**
	 * The feature id for the '<em><b>Shut Downs Max Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__SHUT_DOWNS_MAX_DAY = RESOURCE_BID__SHUT_DOWNS_MAX_DAY;

	/**
	 * The feature id for the '<em><b>Start Ups Max Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__START_UPS_MAX_DAY = RESOURCE_BID__START_UPS_MAX_DAY;

	/**
	 * The feature id for the '<em><b>Min Load Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__MIN_LOAD_REDUCTION = RESOURCE_BID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Drop Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__DROP_RAMP_RATE = RESOURCE_BID_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Load Reduction Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__MIN_LOAD_REDUCTION_INTERVAL = RESOURCE_BID_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Load Reduction Price Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__LOAD_REDUCTION_PRICE_CURVE = RESOURCE_BID_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min Load Reduction Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__MIN_LOAD_REDUCTION_COST = RESOURCE_BID_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pick Up Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__PICK_UP_RAMP_RATE = RESOURCE_BID_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Req Notice Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__REQ_NOTICE_TIME = RESOURCE_BID_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Min Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__MIN_LOAD = RESOURCE_BID_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Registered Load</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__REGISTERED_LOAD = RESOURCE_BID_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Min Time Bet Load Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__MIN_TIME_BET_LOAD_RED = RESOURCE_BID_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Shutdown Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID__SHUTDOWN_COST = RESOURCE_BID_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Load Bid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID_FEATURE_COUNT = RESOURCE_BID_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Load Bid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BID_OPERATION_COUNT = RESOURCE_BID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl <em>Flowgate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getFlowgate()
	 * @generated
	 */
	int FLOWGATE = 43;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__DESCRIPTION = CorePackage.POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__PATH_NAME = CorePackage.POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__LOCAL_NAME = CorePackage.POWER_SYSTEM_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__CIRCUIT_SECTIONS = CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Transmission Reliability Margin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__TRANSMISSION_RELIABILITY_MARGIN = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Afc Use Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__AFC_USE_CODE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Idc Operational Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__IDC_OPERATIONAL_NAME = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In Service Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__IN_SERVICE_DATE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Violation Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__VIOLATION_LIMITS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Out Of Service Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__OUT_OF_SERVICE_DATE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Capacity Benefit Margin</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__CAPACITY_BENEFIT_MARGIN = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Coordinated Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__COORDINATED_FLAG = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Atc Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__ATC_FLAG = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Deletion Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__DELETION_DATE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Reciprocal Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__RECIPROCAL_FLAG = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Idc Assigned Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__IDC_ASSIGNED_ID = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Power Transormers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__POWER_TRANSORMERS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Positive Impact Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__POSITIVE_IMPACT_VALUE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>FT Rs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__FT_RS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__LINES = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Counter Flow Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__COUNTER_FLOW_VALUE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Coordination Study Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__COORDINATION_STUDY_DATE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Sub Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__SUB_CONTROL_AREA = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Idc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__IDC_TYPE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Managing Entity Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__MANAGING_ENTITY_FLAG = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Transmission Provider</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE__TRANSMISSION_PROVIDER = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Flowgate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 22;

	/**
	 * The number of operations of the '<em>Flowgate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWGATE_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.FTRImpl <em>FTR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.FTRImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getFTR()
	 * @generated
	 */
	int FTR = 45;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__UUID = CommonPackage.AGREEMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__MRID = CommonPackage.AGREEMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__NAME = CommonPackage.AGREEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__DESCRIPTION = CommonPackage.AGREEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__PATH_NAME = CommonPackage.AGREEMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__MODELING_AUTHORITY_SET = CommonPackage.AGREEMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__LOCAL_NAME = CommonPackage.AGREEMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__ALIAS_NAME = CommonPackage.AGREEMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__SUBJECT = CommonPackage.AGREEMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__SCHEDULED_EVENTS = CommonPackage.AGREEMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__ERP_ORGANISATION_ROLES = CommonPackage.AGREEMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__CREATED_DATE_TIME = CommonPackage.AGREEMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__TO_DOCUMENT_ROLES = CommonPackage.AGREEMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__ASSET_ROLES = CommonPackage.AGREEMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__ERP_PERSON_ROLES = CommonPackage.AGREEMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__REVISION_NUMBER = CommonPackage.AGREEMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__ELECTRONIC_ADDRESS = CommonPackage.AGREEMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__STATUS = CommonPackage.AGREEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__NETWORK_DATA_SETS = CommonPackage.AGREEMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.AGREEMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__CATEGORY = CommonPackage.AGREEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__ACTIVITY_RECORDS = CommonPackage.AGREEMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__MEASUREMENTS = CommonPackage.AGREEMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__FROM_DOCUMENT_ROLES = CommonPackage.AGREEMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__LAST_MODIFIED_DATE_TIME = CommonPackage.AGREEMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__CHANGE_SETS = CommonPackage.AGREEMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__DOC_STATUS = CommonPackage.AGREEMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__CHANGE_ITEMS = CommonPackage.AGREEMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__SCHEDULE_PARAMETER_INFOS = CommonPackage.AGREEMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__TITLE = CommonPackage.AGREEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Sign Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__SIGN_DATE = CommonPackage.AGREEMENT__SIGN_DATE;

	/**
	 * The feature id for the '<em><b>Validity Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__VALIDITY_INTERVAL = CommonPackage.AGREEMENT__VALIDITY_INTERVAL;

	/**
	 * The feature id for the '<em><b>Base Energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__BASE_ENERGY = CommonPackage.AGREEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__ACTION = CommonPackage.AGREEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Energy Price Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__ENERGY_PRICE_CURVE = CommonPackage.AGREEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Optimized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__OPTIMIZED = CommonPackage.AGREEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__CLASS = CommonPackage.AGREEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pnodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__PNODES = CommonPackage.AGREEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ftr Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__FTR_TYPE = CommonPackage.AGREEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Flowgate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR__FLOWGATE = CommonPackage.AGREEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>FTR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR_FEATURE_COUNT = CommonPackage.AGREEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>FTR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTR_OPERATION_COUNT = CommonPackage.AGREEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LossPenaltyFactorImpl <em>Loss Penalty Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LossPenaltyFactorImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getLossPenaltyFactor()
	 * @generated
	 */
	int LOSS_PENALTY_FACTOR = 46;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__UUID = MARKET_FACTORS__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__MRID = MARKET_FACTORS__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__NAME = MARKET_FACTORS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__DESCRIPTION = MARKET_FACTORS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__PATH_NAME = MARKET_FACTORS__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__MODELING_AUTHORITY_SET = MARKET_FACTORS__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__LOCAL_NAME = MARKET_FACTORS__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__ALIAS_NAME = MARKET_FACTORS__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__SUBJECT = MARKET_FACTORS__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__SCHEDULED_EVENTS = MARKET_FACTORS__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__ERP_ORGANISATION_ROLES = MARKET_FACTORS__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__CREATED_DATE_TIME = MARKET_FACTORS__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__TO_DOCUMENT_ROLES = MARKET_FACTORS__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__ASSET_ROLES = MARKET_FACTORS__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__ERP_PERSON_ROLES = MARKET_FACTORS__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__REVISION_NUMBER = MARKET_FACTORS__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__ELECTRONIC_ADDRESS = MARKET_FACTORS__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__STATUS = MARKET_FACTORS__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__NETWORK_DATA_SETS = MARKET_FACTORS__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__POWER_SYSTEM_RESOURCE_ROLES = MARKET_FACTORS__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__CATEGORY = MARKET_FACTORS__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__ACTIVITY_RECORDS = MARKET_FACTORS__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__MEASUREMENTS = MARKET_FACTORS__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__FROM_DOCUMENT_ROLES = MARKET_FACTORS__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__LAST_MODIFIED_DATE_TIME = MARKET_FACTORS__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__CHANGE_SETS = MARKET_FACTORS__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__DOC_STATUS = MARKET_FACTORS__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__CHANGE_ITEMS = MARKET_FACTORS__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__SCHEDULE_PARAMETER_INFOS = MARKET_FACTORS__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__TITLE = MARKET_FACTORS__TITLE;

	/**
	 * The feature id for the '<em><b>Erp Invoices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__ERP_INVOICES = MARKET_FACTORS__ERP_INVOICES;

	/**
	 * The feature id for the '<em><b>Market</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__MARKET = MARKET_FACTORS__MARKET;

	/**
	 * The feature id for the '<em><b>Interval Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__INTERVAL_START_TIME = MARKET_FACTORS__INTERVAL_START_TIME;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__CONNECTIVITY_NODES = MARKET_FACTORS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loss Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR__LOSS_FACTOR = MARKET_FACTORS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loss Penalty Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR_FEATURE_COUNT = MARKET_FACTORS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Loss Penalty Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_PENALTY_FACTOR_OPERATION_COUNT = MARKET_FACTORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ResourceGroupImpl <em>Resource Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ResourceGroupImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getResourceGroup()
	 * @generated
	 */
	int RESOURCE_GROUP = 47;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Resource Group Reqs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__RESOURCE_GROUP_REQS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Registered Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__REGISTERED_RESOURCES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Resource Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.UnitInitialConditionsImpl <em>Unit Initial Conditions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.UnitInitialConditionsImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getUnitInitialConditions()
	 * @generated
	 */
	int UNIT_INITIAL_CONDITIONS = 48;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_INITIAL_CONDITIONS__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_INITIAL_CONDITIONS__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_INITIAL_CONDITIONS__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_INITIAL_CONDITIONS__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_INITIAL_CONDITIONS__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_INITIAL_CONDITIONS__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_INITIAL_CONDITIONS__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_INITIAL_CONDITIONS__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Resource Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_INITIAL_CONDITIONS__RESOURCE_STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time In Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_INITIAL_CONDITIONS__TIME_IN_STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource MW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_INITIAL_CONDITIONS__RESOURCE_MW = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_INITIAL_CONDITIONS__GENERATING_UNIT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cum Energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_INITIAL_CONDITIONS__CUM_ENERGY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_INITIAL_CONDITIONS__STATUS_DATE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cum Status Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_INITIAL_CONDITIONS__CUM_STATUS_CHANGES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Unit Initial Conditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_INITIAL_CONDITIONS_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Unit Initial Conditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_INITIAL_CONDITIONS_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RegisteredLoadImpl <em>Registered Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RegisteredLoadImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getRegisteredLoad()
	 * @generated
	 */
	int REGISTERED_LOAD = 49;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_LOAD__UUID = REGISTERED_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_LOAD__MRID = REGISTERED_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_LOAD__NAME = REGISTERED_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_LOAD__DESCRIPTION = REGISTERED_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_LOAD__PATH_NAME = REGISTERED_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_LOAD__MODELING_AUTHORITY_SET = REGISTERED_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_LOAD__LOCAL_NAME = REGISTERED_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_LOAD__ALIAS_NAME = REGISTERED_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Markets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_LOAD__MARKETS = REGISTERED_RESOURCE__MARKETS;

	/**
	 * The feature id for the '<em><b>Market Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_LOAD__MARKET_PRODUCTS = REGISTERED_RESOURCE__MARKET_PRODUCTS;

	/**
	 * The feature id for the '<em><b>Rto ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_LOAD__RTO_ID = REGISTERED_RESOURCE__RTO_ID;

	/**
	 * The feature id for the '<em><b>Meters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_LOAD__METERS = REGISTERED_RESOURCE__METERS;

	/**
	 * The feature id for the '<em><b>Pnode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_LOAD__PNODE = REGISTERED_RESOURCE__PNODE;

	/**
	 * The feature id for the '<em><b>Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_LOAD__ORGANISATION = REGISTERED_RESOURCE__ORGANISATION;

	/**
	 * The feature id for the '<em><b>Resource Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_LOAD__RESOURCE_GROUPS = REGISTERED_RESOURCE__RESOURCE_GROUPS;

	/**
	 * The feature id for the '<em><b>Load Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_LOAD__LOAD_AREA = REGISTERED_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Load Bids</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_LOAD__LOAD_BIDS = REGISTERED_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Registered Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_LOAD_FEATURE_COUNT = REGISTERED_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Registered Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_LOAD_OPERATION_COUNT = REGISTERED_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ReserveReqCurveImpl <em>Reserve Req Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ReserveReqCurveImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getReserveReqCurve()
	 * @generated
	 */
	int RESERVE_REQ_CURVE = 50;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ_CURVE__UUID = CorePackage.REGULAR_INTERVAL_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ_CURVE__MRID = CorePackage.REGULAR_INTERVAL_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ_CURVE__NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ_CURVE__DESCRIPTION = CorePackage.REGULAR_INTERVAL_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ_CURVE__PATH_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ_CURVE__MODELING_AUTHORITY_SET = CorePackage.REGULAR_INTERVAL_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ_CURVE__LOCAL_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ_CURVE__ALIAS_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ_CURVE__VALUE2_MULTIPLIER = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ_CURVE__VALUE1_MULTIPLIER = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ_CURVE__START_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ_CURVE__VALUE2_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ_CURVE__VALUE1_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ_CURVE__END_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ_CURVE__TIME_POINTS = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ_CURVE__TIME_STEP = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Reserve Req</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ_CURVE__RESERVE_REQ = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reserve Req Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ_CURVE_FEATURE_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reserve Req Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_REQ_CURVE_OPERATION_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BilateralTransactionImpl <em>Bilateral Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BilateralTransactionImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getBilateralTransaction()
	 * @generated
	 */
	int BILATERAL_TRANSACTION = 51;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILATERAL_TRANSACTION__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Purchase Time Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILATERAL_TRANSACTION__PURCHASE_TIME_MAX = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Purchase Time Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILATERAL_TRANSACTION__PURCHASE_TIME_MIN = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Curtail Time Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILATERAL_TRANSACTION__CURTAIL_TIME_MAX = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Curtail Time Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILATERAL_TRANSACTION__CURTAIL_TIME_MIN = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Total Tran Charge Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILATERAL_TRANSACTION__TOTAL_TRAN_CHARGE_MAX = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transaction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILATERAL_TRANSACTION__TRANSACTION_TYPE = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Market Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILATERAL_TRANSACTION__MARKET_TYPE = CIMPackage.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILATERAL_TRANSACTION__SCOPE = CIMPackage.ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Bilateral Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILATERAL_TRANSACTION_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Bilateral Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILATERAL_TRANSACTION_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SensitivityPriceCurveImpl <em>Sensitivity Price Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SensitivityPriceCurveImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getSensitivityPriceCurve()
	 * @generated
	 */
	int SENSITIVITY_PRICE_CURVE = 52;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_PRICE_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_PRICE_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_PRICE_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_PRICE_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_PRICE_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_PRICE_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_PRICE_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_PRICE_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_PRICE_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_PRICE_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_PRICE_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_PRICE_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_PRICE_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_PRICE_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_PRICE_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_PRICE_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_PRICE_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_PRICE_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Reserve Req</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_PRICE_CURVE__RESERVE_REQ = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensitivity Price Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_PRICE_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sensitivity Price Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_PRICE_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.TransmissionReliabilityMarginImpl <em>Transmission Reliability Margin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.TransmissionReliabilityMarginImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getTransmissionReliabilityMargin()
	 * @generated
	 */
	int TRANSMISSION_RELIABILITY_MARGIN = 53;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RELIABILITY_MARGIN__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RELIABILITY_MARGIN__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RELIABILITY_MARGIN__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RELIABILITY_MARGIN__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RELIABILITY_MARGIN__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RELIABILITY_MARGIN__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RELIABILITY_MARGIN__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RELIABILITY_MARGIN__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Trm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RELIABILITY_MARGIN__TRM_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flowgate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RELIABILITY_MARGIN__FLOWGATE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RELIABILITY_MARGIN__VALUE_UNIT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trm Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RELIABILITY_MARGIN__TRM_VALUE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transmission Reliability Margin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RELIABILITY_MARGIN_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Transmission Reliability Margin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_RELIABILITY_MARGIN_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidPriceCurveImpl <em>Bid Price Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidPriceCurveImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getBidPriceCurve()
	 * @generated
	 */
	int BID_PRICE_CURVE = 54;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_PRICE_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_PRICE_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_PRICE_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_PRICE_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_PRICE_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_PRICE_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_PRICE_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_PRICE_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_PRICE_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_PRICE_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_PRICE_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_PRICE_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_PRICE_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_PRICE_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_PRICE_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_PRICE_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_PRICE_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_PRICE_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Product Bids</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_PRICE_CURVE__PRODUCT_BIDS = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bid Price Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_PRICE_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bid Price Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BID_PRICE_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ChargeProfileDataImpl <em>Charge Profile Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ChargeProfileDataImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getChargeProfileData()
	 * @generated
	 */
	int CHARGE_PROFILE_DATA = 56;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE_DATA__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE_DATA__SEQUENCE = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE_DATA__TIME_STAMP = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Charge Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE_DATA__CHARGE_PROFILE = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE_DATA__VALUE = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bill Determinant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE_DATA__BILL_DETERMINANT = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Charge Profile Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE_DATA_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Charge Profile Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_PROFILE_DATA_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketCaseClearingImpl <em>Market Case Clearing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketCaseClearingImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getMarketCaseClearing()
	 * @generated
	 */
	int MARKET_CASE_CLEARING = 57;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__UUID = MARKET_FACTORS__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__MRID = MARKET_FACTORS__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__NAME = MARKET_FACTORS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__DESCRIPTION = MARKET_FACTORS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__PATH_NAME = MARKET_FACTORS__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__MODELING_AUTHORITY_SET = MARKET_FACTORS__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__LOCAL_NAME = MARKET_FACTORS__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__ALIAS_NAME = MARKET_FACTORS__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__SUBJECT = MARKET_FACTORS__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__SCHEDULED_EVENTS = MARKET_FACTORS__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__ERP_ORGANISATION_ROLES = MARKET_FACTORS__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__CREATED_DATE_TIME = MARKET_FACTORS__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__TO_DOCUMENT_ROLES = MARKET_FACTORS__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__ASSET_ROLES = MARKET_FACTORS__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__ERP_PERSON_ROLES = MARKET_FACTORS__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__REVISION_NUMBER = MARKET_FACTORS__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__ELECTRONIC_ADDRESS = MARKET_FACTORS__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__STATUS = MARKET_FACTORS__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__NETWORK_DATA_SETS = MARKET_FACTORS__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__POWER_SYSTEM_RESOURCE_ROLES = MARKET_FACTORS__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__CATEGORY = MARKET_FACTORS__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__ACTIVITY_RECORDS = MARKET_FACTORS__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__MEASUREMENTS = MARKET_FACTORS__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__FROM_DOCUMENT_ROLES = MARKET_FACTORS__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__LAST_MODIFIED_DATE_TIME = MARKET_FACTORS__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__CHANGE_SETS = MARKET_FACTORS__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__DOC_STATUS = MARKET_FACTORS__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__CHANGE_ITEMS = MARKET_FACTORS__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__SCHEDULE_PARAMETER_INFOS = MARKET_FACTORS__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__TITLE = MARKET_FACTORS__TITLE;

	/**
	 * The feature id for the '<em><b>Erp Invoices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__ERP_INVOICES = MARKET_FACTORS__ERP_INVOICES;

	/**
	 * The feature id for the '<em><b>Market</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__MARKET = MARKET_FACTORS__MARKET;

	/**
	 * The feature id for the '<em><b>Interval Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__INTERVAL_START_TIME = MARKET_FACTORS__INTERVAL_START_TIME;

	/**
	 * The feature id for the '<em><b>Ancillary Service Clearing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__ANCILLARY_SERVICE_CLEARING = MARKET_FACTORS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Posted Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__POSTED_DATE = MARKET_FACTORS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Case Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__CASE_TYPE = MARKET_FACTORS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING__MODIFIED_DATE = MARKET_FACTORS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Market Case Clearing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING_FEATURE_COUNT = MARKET_FACTORS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Market Case Clearing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_CASE_CLEARING_OPERATION_COUNT = MARKET_FACTORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.NodeConstraintTermImpl <em>Node Constraint Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.NodeConstraintTermImpl
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getNodeConstraintTerm()
	 * @generated
	 */
	int NODE_CONSTRAINT_TERM = 58;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONSTRAINT_TERM__UUID = CONSTRAINT_TERM__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONSTRAINT_TERM__MRID = CONSTRAINT_TERM__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONSTRAINT_TERM__NAME = CONSTRAINT_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONSTRAINT_TERM__DESCRIPTION = CONSTRAINT_TERM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONSTRAINT_TERM__PATH_NAME = CONSTRAINT_TERM__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONSTRAINT_TERM__MODELING_AUTHORITY_SET = CONSTRAINT_TERM__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONSTRAINT_TERM__LOCAL_NAME = CONSTRAINT_TERM__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONSTRAINT_TERM__ALIAS_NAME = CONSTRAINT_TERM__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONSTRAINT_TERM__FACTOR = CONSTRAINT_TERM__FACTOR;

	/**
	 * The feature id for the '<em><b>Security Constraint Sum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONSTRAINT_TERM__SECURITY_CONSTRAINT_SUM = CONSTRAINT_TERM__SECURITY_CONSTRAINT_SUM;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONSTRAINT_TERM__FUNCTION = CONSTRAINT_TERM__FUNCTION;

	/**
	 * The feature id for the '<em><b>Connectivity Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONSTRAINT_TERM__CONNECTIVITY_NODE = CONSTRAINT_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Constraint Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONSTRAINT_TERM_FEATURE_COUNT = CONSTRAINT_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Node Constraint Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONSTRAINT_TERM_OPERATION_COUNT = CONSTRAINT_TERM_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.NotificationTimeCurve <em>Notification Time Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification Time Curve</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.NotificationTimeCurve
	 * @generated
	 */
	EClass getNotificationTimeCurve();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.NotificationTimeCurve#getGeneratingBids <em>Generating Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generating Bids</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.NotificationTimeCurve#getGeneratingBids()
	 * @see #getNotificationTimeCurve()
	 * @generated
	 */
	EReference getNotificationTimeCurve_GeneratingBids();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.EnergyPriceCurve <em>Energy Price Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Price Curve</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.EnergyPriceCurve
	 * @generated
	 */
	EClass getEnergyPriceCurve();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.EnergyPriceCurve#getFTRs <em>FT Rs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>FT Rs</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.EnergyPriceCurve#getFTRs()
	 * @see #getEnergyPriceCurve()
	 * @generated
	 */
	EReference getEnergyPriceCurve_FTRs();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.EnergyPriceCurve#getEnergyTransactions <em>Energy Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energy Transactions</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.EnergyPriceCurve#getEnergyTransactions()
	 * @see #getEnergyPriceCurve()
	 * @generated
	 */
	EReference getEnergyPriceCurve_EnergyTransactions();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Meter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Meter
	 * @generated
	 */
	EClass getMeter();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Meter#getRegisteredResource <em>Registered Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Registered Resource</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Meter#getRegisteredResource()
	 * @see #getMeter()
	 * @generated
	 */
	EReference getMeter_RegisteredResource();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatement <em>Market Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Market Statement</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatement
	 * @generated
	 */
	EClass getMarketStatement();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatement#getTradeDate <em>Trade Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trade Date</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatement#getTradeDate()
	 * @see #getMarketStatement()
	 * @generated
	 */
	EAttribute getMarketStatement_TradeDate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatement#getTransactionDate <em>Transaction Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Date</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatement#getTransactionDate()
	 * @see #getMarketStatement()
	 * @generated
	 */
	EAttribute getMarketStatement_TransactionDate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatement#getReferenceNumber <em>Reference Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Number</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatement#getReferenceNumber()
	 * @see #getMarketStatement()
	 * @generated
	 */
	EAttribute getMarketStatement_ReferenceNumber();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatement#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatement#getEnd()
	 * @see #getMarketStatement()
	 * @generated
	 */
	EAttribute getMarketStatement_End();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatement#getMarketStatementLineItem <em>Market Statement Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Market Statement Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatement#getMarketStatementLineItem()
	 * @see #getMarketStatement()
	 * @generated
	 */
	EReference getMarketStatement_MarketStatementLineItem();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatement#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatement#getStart()
	 * @see #getMarketStatement()
	 * @generated
	 */
	EAttribute getMarketStatement_Start();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit <em>Contingency Constraint Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contingency Constraint Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit
	 * @generated
	 */
	EClass getContingencyConstraintLimit();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit#getSecurityConstraintSum <em>Security Constraint Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Constraint Sum</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit#getSecurityConstraintSum()
	 * @see #getContingencyConstraintLimit()
	 * @generated
	 */
	EReference getContingencyConstraintLimit_SecurityConstraintSum();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit#getMWLimitSchedules <em>MW Limit Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MW Limit Schedules</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit#getMWLimitSchedules()
	 * @see #getContingencyConstraintLimit()
	 * @generated
	 */
	EReference getContingencyConstraintLimit_MWLimitSchedules();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit#getContingency <em>Contingency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contingency</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit#getContingency()
	 * @see #getContingencyConstraintLimit()
	 * @generated
	 */
	EReference getContingencyConstraintLimit_Contingency();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator <em>Registered Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registered Generator</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator
	 * @generated
	 */
	EClass getRegisteredGenerator();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getLowControlLImit <em>Low Control LImit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Control LImit</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getLowControlLImit()
	 * @see #getRegisteredGenerator()
	 * @generated
	 */
	EAttribute getRegisteredGenerator_LowControlLImit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getLowerControlRate <em>Lower Control Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Control Rate</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getLowerControlRate()
	 * @see #getRegisteredGenerator()
	 * @generated
	 */
	EAttribute getRegisteredGenerator_LowerControlRate();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getRampRateCurves <em>Ramp Rate Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ramp Rate Curves</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getRampRateCurves()
	 * @see #getRegisteredGenerator()
	 * @generated
	 */
	EReference getRegisteredGenerator_RampRateCurves();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getUnitInitialConditions <em>Unit Initial Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unit Initial Conditions</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getUnitInitialConditions()
	 * @see #getRegisteredGenerator()
	 * @generated
	 */
	EReference getRegisteredGenerator_UnitInitialConditions();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getStartUpCostCurves <em>Start Up Cost Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Start Up Cost Curves</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getStartUpCostCurves()
	 * @see #getRegisteredGenerator()
	 * @generated
	 */
	EReference getRegisteredGenerator_StartUpCostCurves();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getRaiseRampRate <em>Raise Ramp Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raise Ramp Rate</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getRaiseRampRate()
	 * @see #getRegisteredGenerator()
	 * @generated
	 */
	EAttribute getRegisteredGenerator_RaiseRampRate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getRaiseControlRate <em>Raise Control Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raise Control Rate</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getRaiseControlRate()
	 * @see #getRegisteredGenerator()
	 * @generated
	 */
	EAttribute getRegisteredGenerator_RaiseControlRate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getMaximumAllowableSpinningReserve <em>Maximum Allowable Spinning Reserve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Allowable Spinning Reserve</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getMaximumAllowableSpinningReserve()
	 * @see #getRegisteredGenerator()
	 * @generated
	 */
	EAttribute getRegisteredGenerator_MaximumAllowableSpinningReserve();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generating Unit</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getGeneratingUnit()
	 * @see #getRegisteredGenerator()
	 * @generated
	 */
	EReference getRegisteredGenerator_GeneratingUnit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getMaximumOperatingMW <em>Maximum Operating MW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Operating MW</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getMaximumOperatingMW()
	 * @see #getRegisteredGenerator()
	 * @generated
	 */
	EAttribute getRegisteredGenerator_MaximumOperatingMW();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getHighControlLimit <em>High Control Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Control Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getHighControlLimit()
	 * @see #getRegisteredGenerator()
	 * @generated
	 */
	EAttribute getRegisteredGenerator_HighControlLimit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getMinimumOperatingMW <em>Minimum Operating MW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Operating MW</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getMinimumOperatingMW()
	 * @see #getRegisteredGenerator()
	 * @generated
	 */
	EAttribute getRegisteredGenerator_MinimumOperatingMW();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getLowerRampRate <em>Lower Ramp Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Ramp Rate</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getLowerRampRate()
	 * @see #getRegisteredGenerator()
	 * @generated
	 */
	EAttribute getRegisteredGenerator_LowerRampRate();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getGeneratingBids <em>Generating Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generating Bids</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getGeneratingBids()
	 * @see #getRegisteredGenerator()
	 * @generated
	 */
	EReference getRegisteredGenerator_GeneratingBids();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getSpinReserveRamp <em>Spin Reserve Ramp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spin Reserve Ramp</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getSpinReserveRamp()
	 * @see #getRegisteredGenerator()
	 * @generated
	 */
	EAttribute getRegisteredGenerator_SpinReserveRamp();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.TransactionBid <em>Transaction Bid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Bid</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.TransactionBid
	 * @generated
	 */
	EClass getTransactionBid();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.TransactionBid#getEnergyTransId <em>Energy Trans Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Trans Id</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.TransactionBid#getEnergyTransId()
	 * @see #getTransactionBid()
	 * @generated
	 */
	EAttribute getTransactionBid_EnergyTransId();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.TransactionBid#getEnergyProfiles <em>Energy Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energy Profiles</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.TransactionBid#getEnergyProfiles()
	 * @see #getTransactionBid()
	 * @generated
	 */
	EReference getTransactionBid_EnergyProfiles();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.TransactionBid#getDelivery_Pnode <em>Delivery Pnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delivery Pnode</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.TransactionBid#getDelivery_Pnode()
	 * @see #getTransactionBid()
	 * @generated
	 */
	EReference getTransactionBid_Delivery_Pnode();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.TransactionBid#getReceipt_Pnode <em>Receipt Pnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receipt Pnode</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.TransactionBid#getReceipt_Pnode()
	 * @see #getTransactionBid()
	 * @generated
	 */
	EReference getTransactionBid_Receipt_Pnode();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraints <em>Security Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Constraints</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraints
	 * @generated
	 */
	EClass getSecurityConstraints();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraints#getMinMW <em>Min MW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min MW</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraints#getMinMW()
	 * @see #getSecurityConstraints()
	 * @generated
	 */
	EAttribute getSecurityConstraints_MinMW();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraints#getMaxMW <em>Max MW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max MW</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraints#getMaxMW()
	 * @see #getSecurityConstraints()
	 * @generated
	 */
	EAttribute getSecurityConstraints_MaxMW();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraints#getRTO <em>RTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>RTO</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraints#getRTO()
	 * @see #getSecurityConstraints()
	 * @generated
	 */
	EReference getSecurityConstraints_RTO();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraints#getActualMW <em>Actual MW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual MW</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraints#getActualMW()
	 * @see #getSecurityConstraints()
	 * @generated
	 */
	EAttribute getSecurityConstraints_ActualMW();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit <em>Violation Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Violation Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit
	 * @generated
	 */
	EClass getViolationLimit();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Season</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit#getSeason()
	 * @see #getViolationLimit()
	 * @generated
	 */
	EReference getViolationLimit_Season();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit#getMeasurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurement</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit#getMeasurement()
	 * @see #getViolationLimit()
	 * @generated
	 */
	EReference getViolationLimit_Measurement();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit#getOrganisations <em>Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organisations</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit#getOrganisations()
	 * @see #getViolationLimit()
	 * @generated
	 */
	EReference getViolationLimit_Organisations();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit#getFlowgate <em>Flowgate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flowgate</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit#getFlowgate()
	 * @see #getViolationLimit()
	 * @generated
	 */
	EReference getViolationLimit_Flowgate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit#isEnforced <em>Enforced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enforced</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit#isEnforced()
	 * @see #getViolationLimit()
	 * @generated
	 */
	EAttribute getViolationLimit_Enforced();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.StartUpCostCurve <em>Start Up Cost Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Up Cost Curve</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.StartUpCostCurve
	 * @generated
	 */
	EClass getStartUpCostCurve();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.StartUpCostCurve#getGeneratingBids <em>Generating Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generating Bids</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.StartUpCostCurve#getGeneratingBids()
	 * @see #getStartUpCostCurve()
	 * @generated
	 */
	EReference getStartUpCostCurve_GeneratingBids();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.StartUpCostCurve#getRegisteredGenerators <em>Registered Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Registered Generators</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.StartUpCostCurve#getRegisteredGenerators()
	 * @see #getStartUpCostCurve()
	 * @generated
	 */
	EReference getStartUpCostCurve_RegisteredGenerators();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.DefaultConstraintLimit <em>Default Constraint Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Constraint Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.DefaultConstraintLimit
	 * @generated
	 */
	EClass getDefaultConstraintLimit();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.DefaultConstraintLimit#getSecurityConstraintSum <em>Security Constraint Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Constraint Sum</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.DefaultConstraintLimit#getSecurityConstraintSum()
	 * @see #getDefaultConstraintLimit()
	 * @generated
	 */
	EReference getDefaultConstraintLimit_SecurityConstraintSum();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant <em>Bill Determinant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill Determinant</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant
	 * @generated
	 */
	EClass getBillDeterminant();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getUserAttributes <em>User Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User Attributes</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getUserAttributes()
	 * @see #getBillDeterminant()
	 * @generated
	 */
	EReference getBillDeterminant_UserAttributes();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getPrecisionLevel <em>Precision Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision Level</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getPrecisionLevel()
	 * @see #getBillDeterminant()
	 * @generated
	 */
	EAttribute getBillDeterminant_PrecisionLevel();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getChargeProfileData <em>Charge Profile Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Charge Profile Data</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getChargeProfileData()
	 * @see #getBillDeterminant()
	 * @generated
	 */
	EReference getBillDeterminant_ChargeProfileData();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getUnitOfMeasure <em>Unit Of Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Of Measure</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getUnitOfMeasure()
	 * @see #getBillDeterminant()
	 * @generated
	 */
	EAttribute getBillDeterminant_UnitOfMeasure();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getCalculationLevel <em>Calculation Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calculation Level</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getCalculationLevel()
	 * @see #getBillDeterminant()
	 * @generated
	 */
	EAttribute getBillDeterminant_CalculationLevel();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getConfigVersion <em>Config Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Version</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getConfigVersion()
	 * @see #getBillDeterminant()
	 * @generated
	 */
	EAttribute getBillDeterminant_ConfigVersion();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getChargeProfile <em>Charge Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Charge Profile</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getChargeProfile()
	 * @see #getBillDeterminant()
	 * @generated
	 */
	EReference getBillDeterminant_ChargeProfile();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getNumberInterval <em>Number Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Interval</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getNumberInterval()
	 * @see #getBillDeterminant()
	 * @generated
	 */
	EAttribute getBillDeterminant_NumberInterval();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadReductionPriceCurve <em>Load Reduction Price Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Reduction Price Curve</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadReductionPriceCurve
	 * @generated
	 */
	EClass getLoadReductionPriceCurve();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadReductionPriceCurve#getLoadBids <em>Load Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Load Bids</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadReductionPriceCurve#getLoadBids()
	 * @see #getLoadReductionPriceCurve()
	 * @generated
	 */
	EReference getLoadReductionPriceCurve_LoadBids();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile <em>Charge Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Charge Profile</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile
	 * @generated
	 */
	EClass getChargeProfile();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getPassTroughBill <em>Pass Trough Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pass Trough Bill</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getPassTroughBill()
	 * @see #getChargeProfile()
	 * @generated
	 */
	EReference getChargeProfile_PassTroughBill();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getType()
	 * @see #getChargeProfile()
	 * @generated
	 */
	EAttribute getChargeProfile_Type();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getChargeProfileData <em>Charge Profile Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Charge Profile Data</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getChargeProfileData()
	 * @see #getChargeProfile()
	 * @generated
	 */
	EReference getChargeProfile_ChargeProfileData();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getUnitOfMeasure <em>Unit Of Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Of Measure</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getUnitOfMeasure()
	 * @see #getChargeProfile()
	 * @generated
	 */
	EAttribute getChargeProfile_UnitOfMeasure();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getBillDeterminant <em>Bill Determinant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bill Determinant</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getBillDeterminant()
	 * @see #getChargeProfile()
	 * @generated
	 */
	EReference getChargeProfile_BillDeterminant();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getFrequency()
	 * @see #getChargeProfile()
	 * @generated
	 */
	EAttribute getChargeProfile_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getNumberInterval <em>Number Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Interval</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getNumberInterval()
	 * @see #getChargeProfile()
	 * @generated
	 */
	EAttribute getChargeProfile_NumberInterval();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Settlement <em>Settlement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Settlement</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Settlement
	 * @generated
	 */
	EClass getSettlement();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Settlement#getMarket <em>Market</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Market</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Settlement#getMarket()
	 * @see #getSettlement()
	 * @generated
	 */
	EReference getSettlement_Market();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Settlement#getTradeDate <em>Trade Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trade Date</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Settlement#getTradeDate()
	 * @see #getSettlement()
	 * @generated
	 */
	EAttribute getSettlement_TradeDate();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Settlement#getErpLedgerEntries <em>Erp Ledger Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Ledger Entries</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Settlement#getErpLedgerEntries()
	 * @see #getSettlement()
	 * @generated
	 */
	EReference getSettlement_ErpLedgerEntries();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Settlement#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Invoice Line Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Settlement#getErpInvoiceLineItems()
	 * @see #getSettlement()
	 * @generated
	 */
	EReference getSettlement_ErpInvoiceLineItems();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market <em>Market</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Market</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Market
	 * @generated
	 */
	EClass getMarket();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getType()
	 * @see #getMarket()
	 * @generated
	 */
	EAttribute getMarket_Type();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getMarketFactors <em>Market Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Market Factors</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getMarketFactors()
	 * @see #getMarket()
	 * @generated
	 */
	EReference getMarket_MarketFactors();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getStart()
	 * @see #getMarket()
	 * @generated
	 */
	EAttribute getMarket_Start();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getMarketProducts <em>Market Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Market Products</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getMarketProducts()
	 * @see #getMarket()
	 * @generated
	 */
	EReference getMarket_MarketProducts();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getRTO <em>RTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>RTO</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getRTO()
	 * @see #getMarket()
	 * @generated
	 */
	EReference getMarket_RTO();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getRampIntervalNonSpinRes <em>Ramp Interval Non Spin Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ramp Interval Non Spin Res</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getRampIntervalNonSpinRes()
	 * @see #getMarket()
	 * @generated
	 */
	EAttribute getMarket_RampIntervalNonSpinRes();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getEnd()
	 * @see #getMarket()
	 * @generated
	 */
	EAttribute getMarket_End();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getTimeIntervalLength <em>Time Interval Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Interval Length</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getTimeIntervalLength()
	 * @see #getMarket()
	 * @generated
	 */
	EAttribute getMarket_TimeIntervalLength();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getSettlements <em>Settlements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Settlements</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getSettlements()
	 * @see #getMarket()
	 * @generated
	 */
	EReference getMarket_Settlements();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getBids <em>Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bids</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getBids()
	 * @see #getMarket()
	 * @generated
	 */
	EReference getMarket_Bids();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getRampIntervalReg <em>Ramp Interval Reg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ramp Interval Reg</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getRampIntervalReg()
	 * @see #getMarket()
	 * @generated
	 */
	EAttribute getMarket_RampIntervalReg();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getRegisteredResources <em>Registered Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Registered Resources</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getRegisteredResources()
	 * @see #getMarket()
	 * @generated
	 */
	EReference getMarket_RegisteredResources();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getRampIntervalSpinRes <em>Ramp Interval Spin Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ramp Interval Spin Res</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getRampIntervalSpinRes()
	 * @see #getMarket()
	 * @generated
	 */
	EAttribute getMarket_RampIntervalSpinRes();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#isDst <em>Dst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dst</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#isDst()
	 * @see #getMarket()
	 * @generated
	 */
	EAttribute getMarket_Dst();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getRampIntervalEnergy <em>Ramp Interval Energy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ramp Interval Energy</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getRampIntervalEnergy()
	 * @see #getMarket()
	 * @generated
	 */
	EAttribute getMarket_RampIntervalEnergy();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getLocalTimeZone <em>Local Time Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Time Zone</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getLocalTimeZone()
	 * @see #getMarket()
	 * @generated
	 */
	EAttribute getMarket_LocalTimeZone();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ReserveReq <em>Reserve Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reserve Req</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ReserveReq
	 * @generated
	 */
	EClass getReserveReq();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ReserveReq#getSensitivityPriceCurve <em>Sensitivity Price Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensitivity Price Curve</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ReserveReq#getSensitivityPriceCurve()
	 * @see #getReserveReq()
	 * @generated
	 */
	EReference getReserveReq_SensitivityPriceCurve();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ReserveReq#getReserveReqCurve <em>Reserve Req Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reserve Req Curve</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ReserveReq#getReserveReqCurve()
	 * @see #getReserveReq()
	 * @generated
	 */
	EReference getReserveReq_ReserveReqCurve();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ReserveReq#getMarketProduct <em>Market Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Market Product</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ReserveReq#getMarketProduct()
	 * @see #getReserveReq()
	 * @generated
	 */
	EReference getReserveReq_MarketProduct();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource <em>Registered Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registered Resource</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource
	 * @generated
	 */
	EClass getRegisteredResource();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getMarkets <em>Markets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Markets</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getMarkets()
	 * @see #getRegisteredResource()
	 * @generated
	 */
	EReference getRegisteredResource_Markets();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getMarketProducts <em>Market Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Market Products</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getMarketProducts()
	 * @see #getRegisteredResource()
	 * @generated
	 */
	EReference getRegisteredResource_MarketProducts();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getRtoID <em>Rto ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rto ID</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getRtoID()
	 * @see #getRegisteredResource()
	 * @generated
	 */
	EAttribute getRegisteredResource_RtoID();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getMeters <em>Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meters</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getMeters()
	 * @see #getRegisteredResource()
	 * @generated
	 */
	EReference getRegisteredResource_Meters();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getPnode <em>Pnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pnode</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getPnode()
	 * @see #getRegisteredResource()
	 * @generated
	 */
	EReference getRegisteredResource_Pnode();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organisation</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getOrganisation()
	 * @see #getRegisteredResource()
	 * @generated
	 */
	EReference getRegisteredResource_Organisation();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getResourceGroups <em>Resource Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Groups</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getResourceGroups()
	 * @see #getRegisteredResource()
	 * @generated
	 */
	EReference getRegisteredResource_ResourceGroups();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketProduct <em>Market Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Market Product</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketProduct
	 * @generated
	 */
	EClass getMarketProduct();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketProduct#getProductBids <em>Product Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Bids</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketProduct#getProductBids()
	 * @see #getMarketProduct()
	 * @generated
	 */
	EReference getMarketProduct_ProductBids();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketProduct#getMarket <em>Market</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Market</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketProduct#getMarket()
	 * @see #getMarketProduct()
	 * @generated
	 */
	EReference getMarketProduct_Market();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketProduct#getReserveReqs <em>Reserve Reqs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reserve Reqs</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketProduct#getReserveReqs()
	 * @see #getMarketProduct()
	 * @generated
	 */
	EReference getMarketProduct_ReserveReqs();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketProduct#getRegisteredResources <em>Registered Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Registered Resources</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketProduct#getRegisteredResources()
	 * @see #getMarketProduct()
	 * @generated
	 */
	EReference getMarketProduct_RegisteredResources();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid <em>Generating Bid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generating Bid</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid
	 * @generated
	 */
	EClass getGeneratingBid();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getUpTimeMin <em>Up Time Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Up Time Min</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getUpTimeMin()
	 * @see #getGeneratingBid()
	 * @generated
	 */
	EAttribute getGeneratingBid_UpTimeMin();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getRegisteredGenerator <em>Registered Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Registered Generator</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getRegisteredGenerator()
	 * @see #getGeneratingBid()
	 * @generated
	 */
	EReference getGeneratingBid_RegisteredGenerator();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getMaximumEconomicMW <em>Maximum Economic MW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Economic MW</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getMaximumEconomicMW()
	 * @see #getGeneratingBid()
	 * @generated
	 */
	EAttribute getGeneratingBid_MaximumEconomicMW();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getBidSet <em>Bid Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bid Set</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getBidSet()
	 * @see #getGeneratingBid()
	 * @generated
	 */
	EReference getGeneratingBid_BidSet();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getStartUpTimeCurve <em>Start Up Time Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Up Time Curve</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getStartUpTimeCurve()
	 * @see #getGeneratingBid()
	 * @generated
	 */
	EReference getGeneratingBid_StartUpTimeCurve();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getUpTimeMax <em>Up Time Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Up Time Max</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getUpTimeMax()
	 * @see #getGeneratingBid()
	 * @generated
	 */
	EAttribute getGeneratingBid_UpTimeMax();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getStartUpType <em>Start Up Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Up Type</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getStartUpType()
	 * @see #getGeneratingBid()
	 * @generated
	 */
	EAttribute getGeneratingBid_StartUpType();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getNotificationTime <em>Notification Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getNotificationTime()
	 * @see #getGeneratingBid()
	 * @generated
	 */
	EAttribute getGeneratingBid_NotificationTime();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getNotificationTimeCurve <em>Notification Time Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Notification Time Curve</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getNotificationTimeCurve()
	 * @see #getGeneratingBid()
	 * @generated
	 */
	EReference getGeneratingBid_NotificationTimeCurve();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getMaxEmergencyMW <em>Max Emergency MW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Emergency MW</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getMaxEmergencyMW()
	 * @see #getGeneratingBid()
	 * @generated
	 */
	EAttribute getGeneratingBid_MaxEmergencyMW();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getStartupTime <em>Startup Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startup Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getStartupTime()
	 * @see #getGeneratingBid()
	 * @generated
	 */
	EAttribute getGeneratingBid_StartupTime();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getStartUpCostCurve <em>Start Up Cost Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Up Cost Curve</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getStartUpCostCurve()
	 * @see #getGeneratingBid()
	 * @generated
	 */
	EReference getGeneratingBid_StartUpCostCurve();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getMinimumEconomicMW <em>Minimum Economic MW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Economic MW</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getMinimumEconomicMW()
	 * @see #getGeneratingBid()
	 * @generated
	 */
	EAttribute getGeneratingBid_MinimumEconomicMW();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getMinEmergencyMW <em>Min Emergency MW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Emergency MW</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getMinEmergencyMW()
	 * @see #getGeneratingBid()
	 * @generated
	 */
	EAttribute getGeneratingBid_MinEmergencyMW();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getNoLoadCost <em>No Load Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Load Cost</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getNoLoadCost()
	 * @see #getGeneratingBid()
	 * @generated
	 */
	EAttribute getGeneratingBid_NoLoadCost();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getMinimumDownTime <em>Minimum Down Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Down Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getMinimumDownTime()
	 * @see #getGeneratingBid()
	 * @generated
	 */
	EAttribute getGeneratingBid_MinimumDownTime();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getDownTimeMax <em>Down Time Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Down Time Max</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getDownTimeMax()
	 * @see #getGeneratingBid()
	 * @generated
	 */
	EAttribute getGeneratingBid_DownTimeMax();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getStartUpRampRate <em>Start Up Ramp Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Up Ramp Rate</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getStartUpRampRate()
	 * @see #getGeneratingBid()
	 * @generated
	 */
	EAttribute getGeneratingBid_StartUpRampRate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getOperatingMode <em>Operating Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operating Mode</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getOperatingMode()
	 * @see #getGeneratingBid()
	 * @generated
	 */
	EAttribute getGeneratingBid_OperatingMode();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.TerminalConstraintTerm <em>Terminal Constraint Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal Constraint Term</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.TerminalConstraintTerm
	 * @generated
	 */
	EClass getTerminalConstraintTerm();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.TerminalConstraintTerm#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.TerminalConstraintTerm#getTerminal()
	 * @see #getTerminalConstraintTerm()
	 * @generated
	 */
	EReference getTerminalConstraintTerm_Terminal();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RTO <em>RTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTO</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RTO
	 * @generated
	 */
	EClass getRTO();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RTO#getMarkets <em>Markets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Markets</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RTO#getMarkets()
	 * @see #getRTO()
	 * @generated
	 */
	EReference getRTO_Markets();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RTO#getSecurityConstraints <em>Security Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security Constraints</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RTO#getSecurityConstraints()
	 * @see #getRTO()
	 * @generated
	 */
	EReference getRTO_SecurityConstraints();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RTO#getResourceGroupReqs <em>Resource Group Reqs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Group Reqs</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RTO#getResourceGroupReqs()
	 * @see #getRTO()
	 * @generated
	 */
	EReference getRTO_ResourceGroupReqs();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RTO#getSecurityConstraintsLinear <em>Security Constraints Linear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security Constraints Linear</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RTO#getSecurityConstraintsLinear()
	 * @see #getRTO()
	 * @generated
	 */
	EReference getRTO_SecurityConstraintsLinear();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RTO#getPnodes <em>Pnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pnodes</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RTO#getPnodes()
	 * @see #getRTO()
	 * @generated
	 */
	EReference getRTO_Pnodes();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ConstraintTerm <em>Constraint Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Term</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ConstraintTerm
	 * @generated
	 */
	EClass getConstraintTerm();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ConstraintTerm#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ConstraintTerm#getFactor()
	 * @see #getConstraintTerm()
	 * @generated
	 */
	EAttribute getConstraintTerm_Factor();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ConstraintTerm#getSecurityConstraintSum <em>Security Constraint Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Constraint Sum</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ConstraintTerm#getSecurityConstraintSum()
	 * @see #getConstraintTerm()
	 * @generated
	 */
	EReference getConstraintTerm_SecurityConstraintSum();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ConstraintTerm#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ConstraintTerm#getFunction()
	 * @see #getConstraintTerm()
	 * @generated
	 */
	EAttribute getConstraintTerm_Function();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill <em>Pass Through Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pass Through Bill</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill
	 * @generated
	 */
	EClass getPassThroughBill();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getBillEnd <em>Bill End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bill End</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getBillEnd()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EAttribute getPassThroughBill_BillEnd();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getEffectiveDate <em>Effective Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Date</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getEffectiveDate()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EAttribute getPassThroughBill_EffectiveDate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getServiceEnd <em>Service End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service End</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getServiceEnd()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EAttribute getPassThroughBill_ServiceEnd();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#isIsProfiled <em>Is Profiled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Profiled</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#isIsProfiled()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EAttribute getPassThroughBill_IsProfiled();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getPreviousEnd <em>Previous End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous End</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getPreviousEnd()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EAttribute getPassThroughBill_PreviousEnd();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getAmount()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EAttribute getPassThroughBill_Amount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getTimeZone <em>Time Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Zone</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getTimeZone()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EAttribute getPassThroughBill_TimeZone();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getBilledTo <em>Billed To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Billed To</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getBilledTo()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EAttribute getPassThroughBill_BilledTo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#isIsDisputed <em>Is Disputed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Disputed</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#isIsDisputed()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EAttribute getPassThroughBill_IsDisputed();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getProvidedBy <em>Provided By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provided By</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getProvidedBy()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EAttribute getPassThroughBill_ProvidedBy();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getMarketStatementLineItem <em>Market Statement Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Market Statement Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getMarketStatementLineItem()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EReference getPassThroughBill_MarketStatementLineItem();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getBillStart <em>Bill Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bill Start</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getBillStart()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EAttribute getPassThroughBill_BillStart();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getPreviousStart <em>Previous Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Start</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getPreviousStart()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EAttribute getPassThroughBill_PreviousStart();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getServiceStart <em>Service Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Start</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getServiceStart()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EAttribute getPassThroughBill_ServiceStart();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getProductCode <em>Product Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Code</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getProductCode()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EAttribute getPassThroughBill_ProductCode();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getBillRunType <em>Bill Run Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bill Run Type</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getBillRunType()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EAttribute getPassThroughBill_BillRunType();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getTransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Type</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getTransactionType()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EAttribute getPassThroughBill_TransactionType();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getUserAttributes <em>User Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User Attributes</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getUserAttributes()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EReference getPassThroughBill_UserAttributes();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getChargeProfiles <em>Charge Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Charge Profiles</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getChargeProfiles()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EReference getPassThroughBill_ChargeProfiles();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getTradeDate <em>Trade Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trade Date</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getTradeDate()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EAttribute getPassThroughBill_TradeDate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getPrice()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EAttribute getPassThroughBill_Price();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getTaxAmount <em>Tax Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Amount</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getTaxAmount()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EAttribute getPassThroughBill_TaxAmount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getSoldTo <em>Sold To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sold To</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getSoldTo()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EAttribute getPassThroughBill_SoldTo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getTransactionDate <em>Transaction Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Date</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getTransactionDate()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EAttribute getPassThroughBill_TransactionDate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getPaidTo <em>Paid To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paid To</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getPaidTo()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EAttribute getPassThroughBill_PaidTo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getQuantity()
	 * @see #getPassThroughBill()
	 * @generated
	 */
	EAttribute getPassThroughBill_Quantity();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode <em>Pnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pnode</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode
	 * @generated
	 */
	EClass getPnode();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getReceiptTransactionBids <em>Receipt Transaction Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receipt Transaction Bids</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getReceiptTransactionBids()
	 * @see #getPnode()
	 * @generated
	 */
	EReference getPnode_ReceiptTransactionBids();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getRTO <em>RTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>RTO</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getRTO()
	 * @see #getPnode()
	 * @generated
	 */
	EReference getPnode_RTO();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getRegisteredResources <em>Registered Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Registered Resources</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getRegisteredResources()
	 * @see #getPnode()
	 * @generated
	 */
	EReference getPnode_RegisteredResources();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getBeginPeriod <em>Begin Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin Period</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getBeginPeriod()
	 * @see #getPnode()
	 * @generated
	 */
	EAttribute getPnode_BeginPeriod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getPnodeClearing <em>Pnode Clearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pnode Clearing</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getPnodeClearing()
	 * @see #getPnode()
	 * @generated
	 */
	EReference getPnode_PnodeClearing();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getType()
	 * @see #getPnode()
	 * @generated
	 */
	EAttribute getPnode_Type();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getDeliveryTransactionBids <em>Delivery Transaction Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delivery Transaction Bids</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getDeliveryTransactionBids()
	 * @see #getPnode()
	 * @generated
	 */
	EReference getPnode_DeliveryTransactionBids();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#isIsPublic <em>Is Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Public</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#isIsPublic()
	 * @see #getPnode()
	 * @generated
	 */
	EAttribute getPnode_IsPublic();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getConnectivityNode <em>Connectivity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connectivity Node</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getConnectivityNode()
	 * @see #getPnode()
	 * @generated
	 */
	EReference getPnode_ConnectivityNode();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getFTRs <em>FT Rs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>FT Rs</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getFTRs()
	 * @see #getPnode()
	 * @generated
	 */
	EReference getPnode_FTRs();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getEndPeriod <em>End Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Period</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getEndPeriod()
	 * @see #getPnode()
	 * @generated
	 */
	EAttribute getPnode_EndPeriod();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurements</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getMeasurements()
	 * @see #getPnode()
	 * @generated
	 */
	EReference getPnode_Measurements();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getUsage()
	 * @see #getPnode()
	 * @generated
	 */
	EAttribute getPnode_Usage();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PnodeClearing <em>Pnode Clearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pnode Clearing</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PnodeClearing
	 * @generated
	 */
	EClass getPnodeClearing();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PnodeClearing#getCongestLMP <em>Congest LMP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Congest LMP</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PnodeClearing#getCongestLMP()
	 * @see #getPnodeClearing()
	 * @generated
	 */
	EAttribute getPnodeClearing_CongestLMP();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PnodeClearing#getCostLMP <em>Cost LMP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost LMP</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PnodeClearing#getCostLMP()
	 * @see #getPnodeClearing()
	 * @generated
	 */
	EAttribute getPnodeClearing_CostLMP();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PnodeClearing#getLossLMP <em>Loss LMP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loss LMP</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PnodeClearing#getLossLMP()
	 * @see #getPnodeClearing()
	 * @generated
	 */
	EAttribute getPnodeClearing_LossLMP();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PnodeClearing#getPnode <em>Pnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pnode</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PnodeClearing#getPnode()
	 * @see #getPnodeClearing()
	 * @generated
	 */
	EReference getPnodeClearing_Pnode();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.StartUpTimeCurve <em>Start Up Time Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Up Time Curve</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.StartUpTimeCurve
	 * @generated
	 */
	EClass getStartUpTimeCurve();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.StartUpTimeCurve#getGeneratingBids <em>Generating Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generating Bids</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.StartUpTimeCurve#getGeneratingBids()
	 * @see #getStartUpTimeCurve()
	 * @generated
	 */
	EReference getStartUpTimeCurve_GeneratingBids();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum <em>Security Constraint Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Constraint Sum</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum
	 * @generated
	 */
	EClass getSecurityConstraintSum();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getContingencyConstraintLimits <em>Contingency Constraint Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contingency Constraint Limits</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getContingencyConstraintLimits()
	 * @see #getSecurityConstraintSum()
	 * @generated
	 */
	EReference getSecurityConstraintSum_ContingencyConstraintLimits();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getDefaultConstraintLimit <em>Default Constraint Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Constraint Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getDefaultConstraintLimit()
	 * @see #getSecurityConstraintSum()
	 * @generated
	 */
	EReference getSecurityConstraintSum_DefaultConstraintLimit();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getBaseCaseConstraintLimit <em>Base Case Constraint Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Case Constraint Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getBaseCaseConstraintLimit()
	 * @see #getSecurityConstraintSum()
	 * @generated
	 */
	EReference getSecurityConstraintSum_BaseCaseConstraintLimit();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getConstraintTerms <em>Constraint Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraint Terms</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getConstraintTerms()
	 * @see #getSecurityConstraintSum()
	 * @generated
	 */
	EReference getSecurityConstraintSum_ConstraintTerms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getRTO <em>RTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>RTO</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getRTO()
	 * @see #getSecurityConstraintSum()
	 * @generated
	 */
	EReference getSecurityConstraintSum_RTO();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BaseCaseConstraintLimit <em>Base Case Constraint Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Case Constraint Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BaseCaseConstraintLimit
	 * @generated
	 */
	EClass getBaseCaseConstraintLimit();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BaseCaseConstraintLimit#getSecurityConstraintSum <em>Security Constraint Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Constraint Sum</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BaseCaseConstraintLimit#getSecurityConstraintSum()
	 * @see #getBaseCaseConstraintLimit()
	 * @generated
	 */
	EReference getBaseCaseConstraintLimit_SecurityConstraintSum();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ProductBid <em>Product Bid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Bid</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ProductBid
	 * @generated
	 */
	EClass getProductBid();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ProductBid#getBid <em>Bid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bid</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ProductBid#getBid()
	 * @see #getProductBid()
	 * @generated
	 */
	EReference getProductBid_Bid();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ProductBid#getProductBidClearing <em>Product Bid Clearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Bid Clearing</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ProductBid#getProductBidClearing()
	 * @see #getProductBid()
	 * @generated
	 */
	EReference getProductBid_ProductBidClearing();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ProductBid#getBidPriceCurve <em>Bid Price Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bid Price Curve</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ProductBid#getBidPriceCurve()
	 * @see #getProductBid()
	 * @generated
	 */
	EReference getProductBid_BidPriceCurve();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ProductBid#getMarketProduct <em>Market Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Market Product</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ProductBid#getMarketProduct()
	 * @see #getProductBid()
	 * @generated
	 */
	EReference getProductBid_MarketProduct();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MWLimitSchedule <em>MW Limit Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MW Limit Schedule</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MWLimitSchedule
	 * @generated
	 */
	EClass getMWLimitSchedule();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MWLimitSchedule#getSecurityConstraintLimit <em>Security Constraint Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Constraint Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MWLimitSchedule#getSecurityConstraintLimit()
	 * @see #getMWLimitSchedule()
	 * @generated
	 */
	EReference getMWLimitSchedule_SecurityConstraintLimit();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem <em>Market Statement Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Market Statement Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem
	 * @generated
	 */
	EClass getMarketStatementLineItem();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getCurrentAmount <em>Current Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Amount</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getCurrentAmount()
	 * @see #getMarketStatementLineItem()
	 * @generated
	 */
	EAttribute getMarketStatementLineItem_CurrentAmount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPreviousISOAmount <em>Previous ISO Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous ISO Amount</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPreviousISOAmount()
	 * @see #getMarketStatementLineItem()
	 * @generated
	 */
	EAttribute getMarketStatementLineItem_PreviousISOAmount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getQuantityUOM <em>Quantity UOM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity UOM</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getQuantityUOM()
	 * @see #getMarketStatementLineItem()
	 * @generated
	 */
	EAttribute getMarketStatementLineItem_QuantityUOM();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getNetISOAmount <em>Net ISO Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net ISO Amount</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getNetISOAmount()
	 * @see #getMarketStatementLineItem()
	 * @generated
	 */
	EAttribute getMarketStatementLineItem_NetISOAmount();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getUserAttributes <em>User Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User Attributes</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getUserAttributes()
	 * @see #getMarketStatementLineItem()
	 * @generated
	 */
	EReference getMarketStatementLineItem_UserAttributes();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getCurrentISOAmount <em>Current ISO Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current ISO Amount</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getCurrentISOAmount()
	 * @see #getMarketStatementLineItem()
	 * @generated
	 */
	EAttribute getMarketStatementLineItem_CurrentISOAmount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPreviousQuantity <em>Previous Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Quantity</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPreviousQuantity()
	 * @see #getMarketStatementLineItem()
	 * @generated
	 */
	EAttribute getMarketStatementLineItem_PreviousQuantity();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getComponentMarketStatementLineItem <em>Component Market Statement Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component Market Statement Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getComponentMarketStatementLineItem()
	 * @see #getMarketStatementLineItem()
	 * @generated
	 */
	EReference getMarketStatementLineItem_ComponentMarketStatementLineItem();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPreviousAmount <em>Previous Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Amount</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPreviousAmount()
	 * @see #getMarketStatementLineItem()
	 * @generated
	 */
	EAttribute getMarketStatementLineItem_PreviousAmount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getNetISOQuantity <em>Net ISO Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net ISO Quantity</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getNetISOQuantity()
	 * @see #getMarketStatementLineItem()
	 * @generated
	 */
	EAttribute getMarketStatementLineItem_NetISOQuantity();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getNetPrice <em>Net Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net Price</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getNetPrice()
	 * @see #getMarketStatementLineItem()
	 * @generated
	 */
	EAttribute getMarketStatementLineItem_NetPrice();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getCurrentISOQuantity <em>Current ISO Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current ISO Quantity</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getCurrentISOQuantity()
	 * @see #getMarketStatementLineItem()
	 * @generated
	 */
	EAttribute getMarketStatementLineItem_CurrentISOQuantity();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getCurrentPrice <em>Current Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Price</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getCurrentPrice()
	 * @see #getMarketStatementLineItem()
	 * @generated
	 */
	EAttribute getMarketStatementLineItem_CurrentPrice();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPassThroughBill <em>Pass Through Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pass Through Bill</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPassThroughBill()
	 * @see #getMarketStatementLineItem()
	 * @generated
	 */
	EReference getMarketStatementLineItem_PassThroughBill();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPrevisouPrice <em>Previsou Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previsou Price</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPrevisouPrice()
	 * @see #getMarketStatementLineItem()
	 * @generated
	 */
	EAttribute getMarketStatementLineItem_PrevisouPrice();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getMarketStatement <em>Market Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Market Statement</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getMarketStatement()
	 * @see #getMarketStatementLineItem()
	 * @generated
	 */
	EReference getMarketStatementLineItem_MarketStatement();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPreviousISOQuantity <em>Previous ISO Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous ISO Quantity</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPreviousISOQuantity()
	 * @see #getMarketStatementLineItem()
	 * @generated
	 */
	EAttribute getMarketStatementLineItem_PreviousISOQuantity();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getIntervalDate <em>Interval Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval Date</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getIntervalDate()
	 * @see #getMarketStatementLineItem()
	 * @generated
	 */
	EAttribute getMarketStatementLineItem_IntervalDate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getNetQuantity <em>Net Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net Quantity</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getNetQuantity()
	 * @see #getMarketStatementLineItem()
	 * @generated
	 */
	EAttribute getMarketStatementLineItem_NetQuantity();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getNetAmount <em>Net Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net Amount</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getNetAmount()
	 * @see #getMarketStatementLineItem()
	 * @generated
	 */
	EAttribute getMarketStatementLineItem_NetAmount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getCurrentQuantity <em>Current Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Quantity</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getCurrentQuantity()
	 * @see #getMarketStatementLineItem()
	 * @generated
	 */
	EAttribute getMarketStatementLineItem_CurrentQuantity();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getIntervalNumber <em>Interval Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval Number</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getIntervalNumber()
	 * @see #getMarketStatementLineItem()
	 * @generated
	 */
	EAttribute getMarketStatementLineItem_IntervalNumber();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getContainerMarketStatementLineItem <em>Container Market Statement Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container Market Statement Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getContainerMarketStatementLineItem()
	 * @see #getMarketStatementLineItem()
	 * @generated
	 */
	EReference getMarketStatementLineItem_ContainerMarketStatementLineItem();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.AncillaryServiceClearing <em>Ancillary Service Clearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ancillary Service Clearing</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.AncillaryServiceClearing
	 * @generated
	 */
	EClass getAncillaryServiceClearing();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.AncillaryServiceClearing#getMcp <em>Mcp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mcp</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.AncillaryServiceClearing#getMcp()
	 * @see #getAncillaryServiceClearing()
	 * @generated
	 */
	EAttribute getAncillaryServiceClearing_Mcp();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.AncillaryServiceClearing#getClearedMW <em>Cleared MW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cleared MW</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.AncillaryServiceClearing#getClearedMW()
	 * @see #getAncillaryServiceClearing()
	 * @generated
	 */
	EAttribute getAncillaryServiceClearing_ClearedMW();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.AncillaryServiceClearing#getMarketCaseClearing <em>Market Case Clearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Market Case Clearing</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.AncillaryServiceClearing#getMarketCaseClearing()
	 * @see #getAncillaryServiceClearing()
	 * @generated
	 */
	EReference getAncillaryServiceClearing_MarketCaseClearing();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.AncillaryServiceClearing#getCommodityType <em>Commodity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commodity Type</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.AncillaryServiceClearing#getCommodityType()
	 * @see #getAncillaryServiceClearing()
	 * @generated
	 */
	EAttribute getAncillaryServiceClearing_CommodityType();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BidSet <em>Bid Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bid Set</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BidSet
	 * @generated
	 */
	EClass getBidSet();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BidSet#getGeneratingBids <em>Generating Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generating Bids</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BidSet#getGeneratingBids()
	 * @see #getBidSet()
	 * @generated
	 */
	EReference getBidSet_GeneratingBids();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintsClearing <em>Security Constraints Clearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Constraints Clearing</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintsClearing
	 * @generated
	 */
	EClass getSecurityConstraintsClearing();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintsClearing#getMwLimit <em>Mw Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mw Limit</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintsClearing#getMwLimit()
	 * @see #getSecurityConstraintsClearing()
	 * @generated
	 */
	EAttribute getSecurityConstraintsClearing_MwLimit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintsClearing#getMwFlow <em>Mw Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mw Flow</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintsClearing#getMwFlow()
	 * @see #getSecurityConstraintsClearing()
	 * @generated
	 */
	EAttribute getSecurityConstraintsClearing_MwFlow();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintsClearing#getShadowPrice <em>Shadow Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Price</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintsClearing#getShadowPrice()
	 * @see #getSecurityConstraintsClearing()
	 * @generated
	 */
	EAttribute getSecurityConstraintsClearing_ShadowPrice();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ProductBidClearing <em>Product Bid Clearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Bid Clearing</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ProductBidClearing
	 * @generated
	 */
	EClass getProductBidClearing();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ProductBidClearing#getClearedMW <em>Cleared MW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cleared MW</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ProductBidClearing#getClearedMW()
	 * @see #getProductBidClearing()
	 * @generated
	 */
	EAttribute getProductBidClearing_ClearedMW();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ProductBidClearing#getProductBids <em>Product Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Bids</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ProductBidClearing#getProductBids()
	 * @see #getProductBidClearing()
	 * @generated
	 */
	EReference getProductBidClearing_ProductBids();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid <em>Resource Bid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Bid</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid
	 * @generated
	 */
	EClass getResourceBid();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getStartUpsMaxWeek <em>Start Ups Max Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Ups Max Week</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getStartUpsMaxWeek()
	 * @see #getResourceBid()
	 * @generated
	 */
	EAttribute getResourceBid_StartUpsMaxWeek();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getCommodityType <em>Commodity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commodity Type</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getCommodityType()
	 * @see #getResourceBid()
	 * @generated
	 */
	EAttribute getResourceBid_CommodityType();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getEnergyMaxDay <em>Energy Max Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Max Day</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getEnergyMaxDay()
	 * @see #getResourceBid()
	 * @generated
	 */
	EAttribute getResourceBid_EnergyMaxDay();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getEnergyMinDay <em>Energy Min Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Min Day</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getEnergyMinDay()
	 * @see #getResourceBid()
	 * @generated
	 */
	EAttribute getResourceBid_EnergyMinDay();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#isVirtual <em>Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#isVirtual()
	 * @see #getResourceBid()
	 * @generated
	 */
	EAttribute getResourceBid_Virtual();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getShutDownsMaxWeek <em>Shut Downs Max Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shut Downs Max Week</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getShutDownsMaxWeek()
	 * @see #getResourceBid()
	 * @generated
	 */
	EAttribute getResourceBid_ShutDownsMaxWeek();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getShutDownsMaxDay <em>Shut Downs Max Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shut Downs Max Day</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getShutDownsMaxDay()
	 * @see #getResourceBid()
	 * @generated
	 */
	EAttribute getResourceBid_ShutDownsMaxDay();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getStartUpsMaxDay <em>Start Ups Max Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Ups Max Day</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getStartUpsMaxDay()
	 * @see #getResourceBid()
	 * @generated
	 */
	EAttribute getResourceBid_StartUpsMaxDay();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.CapacityBenefitMargin <em>Capacity Benefit Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capacity Benefit Margin</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.CapacityBenefitMargin
	 * @generated
	 */
	EClass getCapacityBenefitMargin();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.CapacityBenefitMargin#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Season</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.CapacityBenefitMargin#getSeason()
	 * @see #getCapacityBenefitMargin()
	 * @generated
	 */
	EReference getCapacityBenefitMargin_Season();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.CapacityBenefitMargin#getFlowgate <em>Flowgate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flowgate</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.CapacityBenefitMargin#getFlowgate()
	 * @see #getCapacityBenefitMargin()
	 * @generated
	 */
	EReference getCapacityBenefitMargin_Flowgate();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SchedulingCoordinator <em>Scheduling Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling Coordinator</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.SchedulingCoordinator
	 * @generated
	 */
	EClass getSchedulingCoordinator();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RampRateCurve <em>Ramp Rate Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ramp Rate Curve</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RampRateCurve
	 * @generated
	 */
	EClass getRampRateCurve();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RampRateCurve#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generating Unit</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RampRateCurve#getGeneratingUnit()
	 * @see #getRampRateCurve()
	 * @generated
	 */
	EReference getRampRateCurve_GeneratingUnit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RampRateCurve#getRampRateType <em>Ramp Rate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ramp Rate Type</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RampRateCurve#getRampRateType()
	 * @see #getRampRateCurve()
	 * @generated
	 */
	EAttribute getRampRateCurve_RampRateType();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BidClearing <em>Bid Clearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bid Clearing</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BidClearing
	 * @generated
	 */
	EClass getBidClearing();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BidClearing#getStartUpCost <em>Start Up Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Up Cost</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BidClearing#getStartUpCost()
	 * @see #getBidClearing()
	 * @generated
	 */
	EAttribute getBidClearing_StartUpCost();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BidClearing#getBid <em>Bid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bid</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BidClearing#getBid()
	 * @see #getBidClearing()
	 * @generated
	 */
	EReference getBidClearing_Bid();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BidClearing#getNoLoadCost <em>No Load Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Load Cost</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BidClearing#getNoLoadCost()
	 * @see #getBidClearing()
	 * @generated
	 */
	EAttribute getBidClearing_NoLoadCost();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BidClearing#getLostOpCost <em>Lost Op Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lost Op Cost</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BidClearing#getLostOpCost()
	 * @see #getBidClearing()
	 * @generated
	 */
	EAttribute getBidClearing_LostOpCost();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid <em>Load Bid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Bid</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid
	 * @generated
	 */
	EClass getLoadBid();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getMinLoadReduction <em>Min Load Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Load Reduction</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getMinLoadReduction()
	 * @see #getLoadBid()
	 * @generated
	 */
	EAttribute getLoadBid_MinLoadReduction();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getDropRampRate <em>Drop Ramp Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drop Ramp Rate</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getDropRampRate()
	 * @see #getLoadBid()
	 * @generated
	 */
	EAttribute getLoadBid_DropRampRate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getMinLoadReductionInterval <em>Min Load Reduction Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Load Reduction Interval</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getMinLoadReductionInterval()
	 * @see #getLoadBid()
	 * @generated
	 */
	EAttribute getLoadBid_MinLoadReductionInterval();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getLoadReductionPriceCurve <em>Load Reduction Price Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Reduction Price Curve</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getLoadReductionPriceCurve()
	 * @see #getLoadBid()
	 * @generated
	 */
	EReference getLoadBid_LoadReductionPriceCurve();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getMinLoadReductionCost <em>Min Load Reduction Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Load Reduction Cost</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getMinLoadReductionCost()
	 * @see #getLoadBid()
	 * @generated
	 */
	EAttribute getLoadBid_MinLoadReductionCost();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getPickUpRampRate <em>Pick Up Ramp Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pick Up Ramp Rate</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getPickUpRampRate()
	 * @see #getLoadBid()
	 * @generated
	 */
	EAttribute getLoadBid_PickUpRampRate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getReqNoticeTime <em>Req Notice Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Req Notice Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getReqNoticeTime()
	 * @see #getLoadBid()
	 * @generated
	 */
	EAttribute getLoadBid_ReqNoticeTime();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getMinLoad <em>Min Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Load</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getMinLoad()
	 * @see #getLoadBid()
	 * @generated
	 */
	EAttribute getLoadBid_MinLoad();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getRegisteredLoad <em>Registered Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Registered Load</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getRegisteredLoad()
	 * @see #getLoadBid()
	 * @generated
	 */
	EReference getLoadBid_RegisteredLoad();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getMinTimeBetLoadRed <em>Min Time Bet Load Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Time Bet Load Red</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getMinTimeBetLoadRed()
	 * @see #getLoadBid()
	 * @generated
	 */
	EAttribute getLoadBid_MinTimeBetLoadRed();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getShutdownCost <em>Shutdown Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shutdown Cost</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getShutdownCost()
	 * @see #getLoadBid()
	 * @generated
	 */
	EAttribute getLoadBid_ShutdownCost();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Bid <em>Bid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bid</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Bid
	 * @generated
	 */
	EClass getBid();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Bid#getStopTime <em>Stop Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Bid#getStopTime()
	 * @see #getBid()
	 * @generated
	 */
	EAttribute getBid_StopTime();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Bid#getMarketType <em>Market Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Market Type</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Bid#getMarketType()
	 * @see #getBid()
	 * @generated
	 */
	EAttribute getBid_MarketType();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Bid#getProductBids <em>Product Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Bids</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Bid#getProductBids()
	 * @see #getBid()
	 * @generated
	 */
	EReference getBid_ProductBids();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Bid#getBidClearing <em>Bid Clearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bid Clearing</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Bid#getBidClearing()
	 * @see #getBid()
	 * @generated
	 */
	EReference getBid_BidClearing();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Bid#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Bid#getStartTime()
	 * @see #getBid()
	 * @generated
	 */
	EAttribute getBid_StartTime();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Bid#getMarket <em>Market</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Market</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Bid#getMarket()
	 * @see #getBid()
	 * @generated
	 */
	EReference getBid_Market();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate <em>Flowgate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flowgate</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate
	 * @generated
	 */
	EClass getFlowgate();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getTransmissionReliabilityMargin <em>Transmission Reliability Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transmission Reliability Margin</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getTransmissionReliabilityMargin()
	 * @see #getFlowgate()
	 * @generated
	 */
	EReference getFlowgate_TransmissionReliabilityMargin();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getAfcUseCode <em>Afc Use Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Afc Use Code</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getAfcUseCode()
	 * @see #getFlowgate()
	 * @generated
	 */
	EAttribute getFlowgate_AfcUseCode();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getIdcOperationalName <em>Idc Operational Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idc Operational Name</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getIdcOperationalName()
	 * @see #getFlowgate()
	 * @generated
	 */
	EAttribute getFlowgate_IdcOperationalName();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getInServiceDate <em>In Service Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Service Date</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getInServiceDate()
	 * @see #getFlowgate()
	 * @generated
	 */
	EAttribute getFlowgate_InServiceDate();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getViolationLimits <em>Violation Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Violation Limits</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getViolationLimits()
	 * @see #getFlowgate()
	 * @generated
	 */
	EReference getFlowgate_ViolationLimits();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getOutOfServiceDate <em>Out Of Service Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out Of Service Date</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getOutOfServiceDate()
	 * @see #getFlowgate()
	 * @generated
	 */
	EAttribute getFlowgate_OutOfServiceDate();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getCapacityBenefitMargin <em>Capacity Benefit Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capacity Benefit Margin</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getCapacityBenefitMargin()
	 * @see #getFlowgate()
	 * @generated
	 */
	EReference getFlowgate_CapacityBenefitMargin();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#isCoordinatedFlag <em>Coordinated Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinated Flag</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#isCoordinatedFlag()
	 * @see #getFlowgate()
	 * @generated
	 */
	EAttribute getFlowgate_CoordinatedFlag();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#isAtcFlag <em>Atc Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Atc Flag</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#isAtcFlag()
	 * @see #getFlowgate()
	 * @generated
	 */
	EAttribute getFlowgate_AtcFlag();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getDeletionDate <em>Deletion Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deletion Date</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getDeletionDate()
	 * @see #getFlowgate()
	 * @generated
	 */
	EAttribute getFlowgate_DeletionDate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#isReciprocalFlag <em>Reciprocal Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reciprocal Flag</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#isReciprocalFlag()
	 * @see #getFlowgate()
	 * @generated
	 */
	EAttribute getFlowgate_ReciprocalFlag();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getIdcAssignedId <em>Idc Assigned Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idc Assigned Id</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getIdcAssignedId()
	 * @see #getFlowgate()
	 * @generated
	 */
	EAttribute getFlowgate_IdcAssignedId();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getPowerTransormers <em>Power Transormers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power Transormers</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getPowerTransormers()
	 * @see #getFlowgate()
	 * @generated
	 */
	EReference getFlowgate_PowerTransormers();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getPositiveImpactValue <em>Positive Impact Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positive Impact Value</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getPositiveImpactValue()
	 * @see #getFlowgate()
	 * @generated
	 */
	EAttribute getFlowgate_PositiveImpactValue();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getFTRs <em>FT Rs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>FT Rs</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getFTRs()
	 * @see #getFlowgate()
	 * @generated
	 */
	EReference getFlowgate_FTRs();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lines</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getLines()
	 * @see #getFlowgate()
	 * @generated
	 */
	EReference getFlowgate_Lines();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getCounterFlowValue <em>Counter Flow Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter Flow Value</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getCounterFlowValue()
	 * @see #getFlowgate()
	 * @generated
	 */
	EAttribute getFlowgate_CounterFlowValue();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getCoordinationStudyDate <em>Coordination Study Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordination Study Date</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getCoordinationStudyDate()
	 * @see #getFlowgate()
	 * @generated
	 */
	EAttribute getFlowgate_CoordinationStudyDate();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getSubControlArea <em>Sub Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Control Area</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getSubControlArea()
	 * @see #getFlowgate()
	 * @generated
	 */
	EReference getFlowgate_SubControlArea();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getIdcType <em>Idc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idc Type</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getIdcType()
	 * @see #getFlowgate()
	 * @generated
	 */
	EAttribute getFlowgate_IdcType();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#isManagingEntityFlag <em>Managing Entity Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Managing Entity Flag</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#isManagingEntityFlag()
	 * @see #getFlowgate()
	 * @generated
	 */
	EAttribute getFlowgate_ManagingEntityFlag();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getTransmissionProvider <em>Transmission Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transmission Provider</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getTransmissionProvider()
	 * @see #getFlowgate()
	 * @generated
	 */
	EReference getFlowgate_TransmissionProvider();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketFactors <em>Market Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Market Factors</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketFactors
	 * @generated
	 */
	EClass getMarketFactors();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketFactors#getErpInvoices <em>Erp Invoices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Invoices</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketFactors#getErpInvoices()
	 * @see #getMarketFactors()
	 * @generated
	 */
	EReference getMarketFactors_ErpInvoices();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketFactors#getMarket <em>Market</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Market</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketFactors#getMarket()
	 * @see #getMarketFactors()
	 * @generated
	 */
	EReference getMarketFactors_Market();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketFactors#getIntervalStartTime <em>Interval Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval Start Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketFactors#getIntervalStartTime()
	 * @see #getMarketFactors()
	 * @generated
	 */
	EAttribute getMarketFactors_IntervalStartTime();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.FTR <em>FTR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FTR</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.FTR
	 * @generated
	 */
	EClass getFTR();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.FTR#getBaseEnergy <em>Base Energy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Energy</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.FTR#getBaseEnergy()
	 * @see #getFTR()
	 * @generated
	 */
	EAttribute getFTR_BaseEnergy();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.FTR#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.FTR#getAction()
	 * @see #getFTR()
	 * @generated
	 */
	EAttribute getFTR_Action();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.FTR#getEnergyPriceCurve <em>Energy Price Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Energy Price Curve</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.FTR#getEnergyPriceCurve()
	 * @see #getFTR()
	 * @generated
	 */
	EReference getFTR_EnergyPriceCurve();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.FTR#getOptimized <em>Optimized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimized</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.FTR#getOptimized()
	 * @see #getFTR()
	 * @generated
	 */
	EAttribute getFTR_Optimized();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.FTR#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.FTR#getClass_()
	 * @see #getFTR()
	 * @generated
	 */
	EAttribute getFTR_Class();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.FTR#getPnodes <em>Pnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pnodes</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.FTR#getPnodes()
	 * @see #getFTR()
	 * @generated
	 */
	EReference getFTR_Pnodes();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.FTR#getFtrType <em>Ftr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ftr Type</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.FTR#getFtrType()
	 * @see #getFTR()
	 * @generated
	 */
	EAttribute getFTR_FtrType();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.FTR#getFlowgate <em>Flowgate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flowgate</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.FTR#getFlowgate()
	 * @see #getFTR()
	 * @generated
	 */
	EReference getFTR_Flowgate();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LossPenaltyFactor <em>Loss Penalty Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loss Penalty Factor</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.LossPenaltyFactor
	 * @generated
	 */
	EClass getLossPenaltyFactor();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LossPenaltyFactor#getConnectivityNodes <em>Connectivity Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connectivity Nodes</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.LossPenaltyFactor#getConnectivityNodes()
	 * @see #getLossPenaltyFactor()
	 * @generated
	 */
	EReference getLossPenaltyFactor_ConnectivityNodes();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LossPenaltyFactor#getLossFactor <em>Loss Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loss Factor</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.LossPenaltyFactor#getLossFactor()
	 * @see #getLossPenaltyFactor()
	 * @generated
	 */
	EAttribute getLossPenaltyFactor_LossFactor();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceGroup <em>Resource Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Group</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceGroup
	 * @generated
	 */
	EClass getResourceGroup();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceGroup#getResourceGroupReqs <em>Resource Group Reqs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Group Reqs</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceGroup#getResourceGroupReqs()
	 * @see #getResourceGroup()
	 * @generated
	 */
	EReference getResourceGroup_ResourceGroupReqs();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceGroup#getRegisteredResources <em>Registered Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Registered Resources</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceGroup#getRegisteredResources()
	 * @see #getResourceGroup()
	 * @generated
	 */
	EReference getResourceGroup_RegisteredResources();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions <em>Unit Initial Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Initial Conditions</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions
	 * @generated
	 */
	EClass getUnitInitialConditions();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getResourceStatus <em>Resource Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getResourceStatus()
	 * @see #getUnitInitialConditions()
	 * @generated
	 */
	EAttribute getUnitInitialConditions_ResourceStatus();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getTimeInStatus <em>Time In Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time In Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getTimeInStatus()
	 * @see #getUnitInitialConditions()
	 * @generated
	 */
	EAttribute getUnitInitialConditions_TimeInStatus();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getResourceMW <em>Resource MW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource MW</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getResourceMW()
	 * @see #getUnitInitialConditions()
	 * @generated
	 */
	EAttribute getUnitInitialConditions_ResourceMW();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generating Unit</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getGeneratingUnit()
	 * @see #getUnitInitialConditions()
	 * @generated
	 */
	EReference getUnitInitialConditions_GeneratingUnit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getCumEnergy <em>Cum Energy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cum Energy</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getCumEnergy()
	 * @see #getUnitInitialConditions()
	 * @generated
	 */
	EAttribute getUnitInitialConditions_CumEnergy();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getStatusDate <em>Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Date</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getStatusDate()
	 * @see #getUnitInitialConditions()
	 * @generated
	 */
	EAttribute getUnitInitialConditions_StatusDate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getCumStatusChanges <em>Cum Status Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cum Status Changes</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getCumStatusChanges()
	 * @see #getUnitInitialConditions()
	 * @generated
	 */
	EAttribute getUnitInitialConditions_CumStatusChanges();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredLoad <em>Registered Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registered Load</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredLoad
	 * @generated
	 */
	EClass getRegisteredLoad();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredLoad#getLoadArea <em>Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Area</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredLoad#getLoadArea()
	 * @see #getRegisteredLoad()
	 * @generated
	 */
	EReference getRegisteredLoad_LoadArea();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredLoad#getLoadBids <em>Load Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Load Bids</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredLoad#getLoadBids()
	 * @see #getRegisteredLoad()
	 * @generated
	 */
	EReference getRegisteredLoad_LoadBids();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ReserveReqCurve <em>Reserve Req Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reserve Req Curve</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ReserveReqCurve
	 * @generated
	 */
	EClass getReserveReqCurve();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ReserveReqCurve#getReserveReq <em>Reserve Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reserve Req</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ReserveReqCurve#getReserveReq()
	 * @see #getReserveReqCurve()
	 * @generated
	 */
	EReference getReserveReqCurve_ReserveReq();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction <em>Bilateral Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bilateral Transaction</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction
	 * @generated
	 */
	EClass getBilateralTransaction();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getPurchaseTimeMax <em>Purchase Time Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purchase Time Max</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getPurchaseTimeMax()
	 * @see #getBilateralTransaction()
	 * @generated
	 */
	EAttribute getBilateralTransaction_PurchaseTimeMax();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getPurchaseTimeMin <em>Purchase Time Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purchase Time Min</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getPurchaseTimeMin()
	 * @see #getBilateralTransaction()
	 * @generated
	 */
	EAttribute getBilateralTransaction_PurchaseTimeMin();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getCurtailTimeMax <em>Curtail Time Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curtail Time Max</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getCurtailTimeMax()
	 * @see #getBilateralTransaction()
	 * @generated
	 */
	EAttribute getBilateralTransaction_CurtailTimeMax();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getCurtailTimeMin <em>Curtail Time Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curtail Time Min</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getCurtailTimeMin()
	 * @see #getBilateralTransaction()
	 * @generated
	 */
	EAttribute getBilateralTransaction_CurtailTimeMin();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getTotalTranChargeMax <em>Total Tran Charge Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Tran Charge Max</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getTotalTranChargeMax()
	 * @see #getBilateralTransaction()
	 * @generated
	 */
	EAttribute getBilateralTransaction_TotalTranChargeMax();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getTransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Type</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getTransactionType()
	 * @see #getBilateralTransaction()
	 * @generated
	 */
	EAttribute getBilateralTransaction_TransactionType();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getMarketType <em>Market Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Market Type</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getMarketType()
	 * @see #getBilateralTransaction()
	 * @generated
	 */
	EAttribute getBilateralTransaction_MarketType();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BilateralTransaction#getScope()
	 * @see #getBilateralTransaction()
	 * @generated
	 */
	EAttribute getBilateralTransaction_Scope();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SensitivityPriceCurve <em>Sensitivity Price Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensitivity Price Curve</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.SensitivityPriceCurve
	 * @generated
	 */
	EClass getSensitivityPriceCurve();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SensitivityPriceCurve#getReserveReq <em>Reserve Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reserve Req</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.SensitivityPriceCurve#getReserveReq()
	 * @see #getSensitivityPriceCurve()
	 * @generated
	 */
	EReference getSensitivityPriceCurve_ReserveReq();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.TransmissionReliabilityMargin <em>Transmission Reliability Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transmission Reliability Margin</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.TransmissionReliabilityMargin
	 * @generated
	 */
	EClass getTransmissionReliabilityMargin();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.TransmissionReliabilityMargin#getTrmType <em>Trm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trm Type</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.TransmissionReliabilityMargin#getTrmType()
	 * @see #getTransmissionReliabilityMargin()
	 * @generated
	 */
	EAttribute getTransmissionReliabilityMargin_TrmType();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.TransmissionReliabilityMargin#getFlowgate <em>Flowgate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flowgate</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.TransmissionReliabilityMargin#getFlowgate()
	 * @see #getTransmissionReliabilityMargin()
	 * @generated
	 */
	EReference getTransmissionReliabilityMargin_Flowgate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.TransmissionReliabilityMargin#getValueUnit <em>Value Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Unit</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.TransmissionReliabilityMargin#getValueUnit()
	 * @see #getTransmissionReliabilityMargin()
	 * @generated
	 */
	EAttribute getTransmissionReliabilityMargin_ValueUnit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.TransmissionReliabilityMargin#getTrmValue <em>Trm Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trm Value</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.TransmissionReliabilityMargin#getTrmValue()
	 * @see #getTransmissionReliabilityMargin()
	 * @generated
	 */
	EAttribute getTransmissionReliabilityMargin_TrmValue();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BidPriceCurve <em>Bid Price Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bid Price Curve</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BidPriceCurve
	 * @generated
	 */
	EClass getBidPriceCurve();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BidPriceCurve#getProductBids <em>Product Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Bids</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BidPriceCurve#getProductBids()
	 * @see #getBidPriceCurve()
	 * @generated
	 */
	EReference getBidPriceCurve_ProductBids();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceGroupReq <em>Resource Group Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Group Req</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceGroupReq
	 * @generated
	 */
	EClass getResourceGroupReq();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceGroupReq#getResourceGroup <em>Resource Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Group</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceGroupReq#getResourceGroup()
	 * @see #getResourceGroupReq()
	 * @generated
	 */
	EReference getResourceGroupReq_ResourceGroup();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceGroupReq#getRTOs <em>RT Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RT Os</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceGroupReq#getRTOs()
	 * @see #getResourceGroupReq()
	 * @generated
	 */
	EReference getResourceGroupReq_RTOs();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfileData <em>Charge Profile Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Charge Profile Data</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfileData
	 * @generated
	 */
	EClass getChargeProfileData();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfileData#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfileData#getSequence()
	 * @see #getChargeProfileData()
	 * @generated
	 */
	EAttribute getChargeProfileData_Sequence();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfileData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfileData#getTimeStamp()
	 * @see #getChargeProfileData()
	 * @generated
	 */
	EAttribute getChargeProfileData_TimeStamp();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfileData#getChargeProfile <em>Charge Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Charge Profile</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfileData#getChargeProfile()
	 * @see #getChargeProfileData()
	 * @generated
	 */
	EReference getChargeProfileData_ChargeProfile();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfileData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfileData#getValue()
	 * @see #getChargeProfileData()
	 * @generated
	 */
	EAttribute getChargeProfileData_Value();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfileData#getBillDeterminant <em>Bill Determinant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bill Determinant</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfileData#getBillDeterminant()
	 * @see #getChargeProfileData()
	 * @generated
	 */
	EReference getChargeProfileData_BillDeterminant();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketCaseClearing <em>Market Case Clearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Market Case Clearing</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketCaseClearing
	 * @generated
	 */
	EClass getMarketCaseClearing();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketCaseClearing#getAncillaryServiceClearing <em>Ancillary Service Clearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ancillary Service Clearing</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketCaseClearing#getAncillaryServiceClearing()
	 * @see #getMarketCaseClearing()
	 * @generated
	 */
	EReference getMarketCaseClearing_AncillaryServiceClearing();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketCaseClearing#getPostedDate <em>Posted Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posted Date</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketCaseClearing#getPostedDate()
	 * @see #getMarketCaseClearing()
	 * @generated
	 */
	EAttribute getMarketCaseClearing_PostedDate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketCaseClearing#getCaseType <em>Case Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Type</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketCaseClearing#getCaseType()
	 * @see #getMarketCaseClearing()
	 * @generated
	 */
	EAttribute getMarketCaseClearing_CaseType();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketCaseClearing#getModifiedDate <em>Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified Date</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketCaseClearing#getModifiedDate()
	 * @see #getMarketCaseClearing()
	 * @generated
	 */
	EAttribute getMarketCaseClearing_ModifiedDate();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.NodeConstraintTerm <em>Node Constraint Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Constraint Term</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.NodeConstraintTerm
	 * @generated
	 */
	EClass getNodeConstraintTerm();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.NodeConstraintTerm#getConnectivityNode <em>Connectivity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connectivity Node</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.NodeConstraintTerm#getConnectivityNode()
	 * @see #getNodeConstraintTerm()
	 * @generated
	 */
	EReference getNodeConstraintTerm_ConnectivityNode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MarketOperationsFactory getMarketOperationsFactory();

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
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.NotificationTimeCurveImpl <em>Notification Time Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.NotificationTimeCurveImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getNotificationTimeCurve()
		 * @generated
		 */
		EClass NOTIFICATION_TIME_CURVE = eINSTANCE.getNotificationTimeCurve();

		/**
		 * The meta object literal for the '<em><b>Generating Bids</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION_TIME_CURVE__GENERATING_BIDS = eINSTANCE.getNotificationTimeCurve_GeneratingBids();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.EnergyPriceCurveImpl <em>Energy Price Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.EnergyPriceCurveImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getEnergyPriceCurve()
		 * @generated
		 */
		EClass ENERGY_PRICE_CURVE = eINSTANCE.getEnergyPriceCurve();

		/**
		 * The meta object literal for the '<em><b>FT Rs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_PRICE_CURVE__FT_RS = eINSTANCE.getEnergyPriceCurve_FTRs();

		/**
		 * The meta object literal for the '<em><b>Energy Transactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_PRICE_CURVE__ENERGY_TRANSACTIONS = eINSTANCE.getEnergyPriceCurve_EnergyTransactions();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MeterImpl <em>Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MeterImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getMeter()
		 * @generated
		 */
		EClass METER = eINSTANCE.getMeter();

		/**
		 * The meta object literal for the '<em><b>Registered Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER__REGISTERED_RESOURCE = eINSTANCE.getMeter_RegisteredResource();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementImpl <em>Market Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getMarketStatement()
		 * @generated
		 */
		EClass MARKET_STATEMENT = eINSTANCE.getMarketStatement();

		/**
		 * The meta object literal for the '<em><b>Trade Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_STATEMENT__TRADE_DATE = eINSTANCE.getMarketStatement_TradeDate();

		/**
		 * The meta object literal for the '<em><b>Transaction Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_STATEMENT__TRANSACTION_DATE = eINSTANCE.getMarketStatement_TransactionDate();

		/**
		 * The meta object literal for the '<em><b>Reference Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_STATEMENT__REFERENCE_NUMBER = eINSTANCE.getMarketStatement_ReferenceNumber();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_STATEMENT__END = eINSTANCE.getMarketStatement_End();

		/**
		 * The meta object literal for the '<em><b>Market Statement Line Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_STATEMENT__MARKET_STATEMENT_LINE_ITEM = eINSTANCE.getMarketStatement_MarketStatementLineItem();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_STATEMENT__START = eINSTANCE.getMarketStatement_Start();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ContingencyConstraintLimitImpl <em>Contingency Constraint Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ContingencyConstraintLimitImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getContingencyConstraintLimit()
		 * @generated
		 */
		EClass CONTINGENCY_CONSTRAINT_LIMIT = eINSTANCE.getContingencyConstraintLimit();

		/**
		 * The meta object literal for the '<em><b>Security Constraint Sum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTINGENCY_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM = eINSTANCE.getContingencyConstraintLimit_SecurityConstraintSum();

		/**
		 * The meta object literal for the '<em><b>MW Limit Schedules</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTINGENCY_CONSTRAINT_LIMIT__MW_LIMIT_SCHEDULES = eINSTANCE.getContingencyConstraintLimit_MWLimitSchedules();

		/**
		 * The meta object literal for the '<em><b>Contingency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTINGENCY_CONSTRAINT_LIMIT__CONTINGENCY = eINSTANCE.getContingencyConstraintLimit_Contingency();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RegisteredGeneratorImpl <em>Registered Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RegisteredGeneratorImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getRegisteredGenerator()
		 * @generated
		 */
		EClass REGISTERED_GENERATOR = eINSTANCE.getRegisteredGenerator();

		/**
		 * The meta object literal for the '<em><b>Low Control LImit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_GENERATOR__LOW_CONTROL_LIMIT = eINSTANCE.getRegisteredGenerator_LowControlLImit();

		/**
		 * The meta object literal for the '<em><b>Lower Control Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_GENERATOR__LOWER_CONTROL_RATE = eINSTANCE.getRegisteredGenerator_LowerControlRate();

		/**
		 * The meta object literal for the '<em><b>Ramp Rate Curves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTERED_GENERATOR__RAMP_RATE_CURVES = eINSTANCE.getRegisteredGenerator_RampRateCurves();

		/**
		 * The meta object literal for the '<em><b>Unit Initial Conditions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTERED_GENERATOR__UNIT_INITIAL_CONDITIONS = eINSTANCE.getRegisteredGenerator_UnitInitialConditions();

		/**
		 * The meta object literal for the '<em><b>Start Up Cost Curves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTERED_GENERATOR__START_UP_COST_CURVES = eINSTANCE.getRegisteredGenerator_StartUpCostCurves();

		/**
		 * The meta object literal for the '<em><b>Raise Ramp Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_GENERATOR__RAISE_RAMP_RATE = eINSTANCE.getRegisteredGenerator_RaiseRampRate();

		/**
		 * The meta object literal for the '<em><b>Raise Control Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_GENERATOR__RAISE_CONTROL_RATE = eINSTANCE.getRegisteredGenerator_RaiseControlRate();

		/**
		 * The meta object literal for the '<em><b>Maximum Allowable Spinning Reserve</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_GENERATOR__MAXIMUM_ALLOWABLE_SPINNING_RESERVE = eINSTANCE.getRegisteredGenerator_MaximumAllowableSpinningReserve();

		/**
		 * The meta object literal for the '<em><b>Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTERED_GENERATOR__GENERATING_UNIT = eINSTANCE.getRegisteredGenerator_GeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Maximum Operating MW</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_GENERATOR__MAXIMUM_OPERATING_MW = eINSTANCE.getRegisteredGenerator_MaximumOperatingMW();

		/**
		 * The meta object literal for the '<em><b>High Control Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_GENERATOR__HIGH_CONTROL_LIMIT = eINSTANCE.getRegisteredGenerator_HighControlLimit();

		/**
		 * The meta object literal for the '<em><b>Minimum Operating MW</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_GENERATOR__MINIMUM_OPERATING_MW = eINSTANCE.getRegisteredGenerator_MinimumOperatingMW();

		/**
		 * The meta object literal for the '<em><b>Lower Ramp Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_GENERATOR__LOWER_RAMP_RATE = eINSTANCE.getRegisteredGenerator_LowerRampRate();

		/**
		 * The meta object literal for the '<em><b>Generating Bids</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTERED_GENERATOR__GENERATING_BIDS = eINSTANCE.getRegisteredGenerator_GeneratingBids();

		/**
		 * The meta object literal for the '<em><b>Spin Reserve Ramp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_GENERATOR__SPIN_RESERVE_RAMP = eINSTANCE.getRegisteredGenerator_SpinReserveRamp();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.TransactionBidImpl <em>Transaction Bid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.TransactionBidImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getTransactionBid()
		 * @generated
		 */
		EClass TRANSACTION_BID = eINSTANCE.getTransactionBid();

		/**
		 * The meta object literal for the '<em><b>Energy Trans Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_BID__ENERGY_TRANS_ID = eINSTANCE.getTransactionBid_EnergyTransId();

		/**
		 * The meta object literal for the '<em><b>Energy Profiles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_BID__ENERGY_PROFILES = eINSTANCE.getTransactionBid_EnergyProfiles();

		/**
		 * The meta object literal for the '<em><b>Delivery Pnode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_BID__DELIVERY_PNODE = eINSTANCE.getTransactionBid_Delivery_Pnode();

		/**
		 * The meta object literal for the '<em><b>Receipt Pnode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_BID__RECEIPT_PNODE = eINSTANCE.getTransactionBid_Receipt_Pnode();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SecurityConstraintsImpl <em>Security Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SecurityConstraintsImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getSecurityConstraints()
		 * @generated
		 */
		EClass SECURITY_CONSTRAINTS = eINSTANCE.getSecurityConstraints();

		/**
		 * The meta object literal for the '<em><b>Min MW</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CONSTRAINTS__MIN_MW = eINSTANCE.getSecurityConstraints_MinMW();

		/**
		 * The meta object literal for the '<em><b>Max MW</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CONSTRAINTS__MAX_MW = eINSTANCE.getSecurityConstraints_MaxMW();

		/**
		 * The meta object literal for the '<em><b>RTO</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONSTRAINTS__RTO = eINSTANCE.getSecurityConstraints_RTO();

		/**
		 * The meta object literal for the '<em><b>Actual MW</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CONSTRAINTS__ACTUAL_MW = eINSTANCE.getSecurityConstraints_ActualMW();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ViolationLimitImpl <em>Violation Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ViolationLimitImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getViolationLimit()
		 * @generated
		 */
		EClass VIOLATION_LIMIT = eINSTANCE.getViolationLimit();

		/**
		 * The meta object literal for the '<em><b>Season</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIOLATION_LIMIT__SEASON = eINSTANCE.getViolationLimit_Season();

		/**
		 * The meta object literal for the '<em><b>Measurement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIOLATION_LIMIT__MEASUREMENT = eINSTANCE.getViolationLimit_Measurement();

		/**
		 * The meta object literal for the '<em><b>Organisations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIOLATION_LIMIT__ORGANISATIONS = eINSTANCE.getViolationLimit_Organisations();

		/**
		 * The meta object literal for the '<em><b>Flowgate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIOLATION_LIMIT__FLOWGATE = eINSTANCE.getViolationLimit_Flowgate();

		/**
		 * The meta object literal for the '<em><b>Enforced</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIOLATION_LIMIT__ENFORCED = eINSTANCE.getViolationLimit_Enforced();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.StartUpCostCurveImpl <em>Start Up Cost Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.StartUpCostCurveImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getStartUpCostCurve()
		 * @generated
		 */
		EClass START_UP_COST_CURVE = eINSTANCE.getStartUpCostCurve();

		/**
		 * The meta object literal for the '<em><b>Generating Bids</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_UP_COST_CURVE__GENERATING_BIDS = eINSTANCE.getStartUpCostCurve_GeneratingBids();

		/**
		 * The meta object literal for the '<em><b>Registered Generators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_UP_COST_CURVE__REGISTERED_GENERATORS = eINSTANCE.getStartUpCostCurve_RegisteredGenerators();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.DefaultConstraintLimitImpl <em>Default Constraint Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.DefaultConstraintLimitImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getDefaultConstraintLimit()
		 * @generated
		 */
		EClass DEFAULT_CONSTRAINT_LIMIT = eINSTANCE.getDefaultConstraintLimit();

		/**
		 * The meta object literal for the '<em><b>Security Constraint Sum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM = eINSTANCE.getDefaultConstraintLimit_SecurityConstraintSum();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BillDeterminantImpl <em>Bill Determinant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BillDeterminantImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getBillDeterminant()
		 * @generated
		 */
		EClass BILL_DETERMINANT = eINSTANCE.getBillDeterminant();

		/**
		 * The meta object literal for the '<em><b>User Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL_DETERMINANT__USER_ATTRIBUTES = eINSTANCE.getBillDeterminant_UserAttributes();

		/**
		 * The meta object literal for the '<em><b>Precision Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL_DETERMINANT__PRECISION_LEVEL = eINSTANCE.getBillDeterminant_PrecisionLevel();

		/**
		 * The meta object literal for the '<em><b>Charge Profile Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL_DETERMINANT__CHARGE_PROFILE_DATA = eINSTANCE.getBillDeterminant_ChargeProfileData();

		/**
		 * The meta object literal for the '<em><b>Unit Of Measure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL_DETERMINANT__UNIT_OF_MEASURE = eINSTANCE.getBillDeterminant_UnitOfMeasure();

		/**
		 * The meta object literal for the '<em><b>Calculation Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL_DETERMINANT__CALCULATION_LEVEL = eINSTANCE.getBillDeterminant_CalculationLevel();

		/**
		 * The meta object literal for the '<em><b>Config Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL_DETERMINANT__CONFIG_VERSION = eINSTANCE.getBillDeterminant_ConfigVersion();

		/**
		 * The meta object literal for the '<em><b>Charge Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL_DETERMINANT__CHARGE_PROFILE = eINSTANCE.getBillDeterminant_ChargeProfile();

		/**
		 * The meta object literal for the '<em><b>Number Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL_DETERMINANT__NUMBER_INTERVAL = eINSTANCE.getBillDeterminant_NumberInterval();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LoadReductionPriceCurveImpl <em>Load Reduction Price Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LoadReductionPriceCurveImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getLoadReductionPriceCurve()
		 * @generated
		 */
		EClass LOAD_REDUCTION_PRICE_CURVE = eINSTANCE.getLoadReductionPriceCurve();

		/**
		 * The meta object literal for the '<em><b>Load Bids</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_REDUCTION_PRICE_CURVE__LOAD_BIDS = eINSTANCE.getLoadReductionPriceCurve_LoadBids();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ChargeProfileImpl <em>Charge Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ChargeProfileImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getChargeProfile()
		 * @generated
		 */
		EClass CHARGE_PROFILE = eINSTANCE.getChargeProfile();

		/**
		 * The meta object literal for the '<em><b>Pass Trough Bill</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARGE_PROFILE__PASS_TROUGH_BILL = eINSTANCE.getChargeProfile_PassTroughBill();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGE_PROFILE__TYPE = eINSTANCE.getChargeProfile_Type();

		/**
		 * The meta object literal for the '<em><b>Charge Profile Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARGE_PROFILE__CHARGE_PROFILE_DATA = eINSTANCE.getChargeProfile_ChargeProfileData();

		/**
		 * The meta object literal for the '<em><b>Unit Of Measure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGE_PROFILE__UNIT_OF_MEASURE = eINSTANCE.getChargeProfile_UnitOfMeasure();

		/**
		 * The meta object literal for the '<em><b>Bill Determinant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARGE_PROFILE__BILL_DETERMINANT = eINSTANCE.getChargeProfile_BillDeterminant();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGE_PROFILE__FREQUENCY = eINSTANCE.getChargeProfile_Frequency();

		/**
		 * The meta object literal for the '<em><b>Number Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGE_PROFILE__NUMBER_INTERVAL = eINSTANCE.getChargeProfile_NumberInterval();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SettlementImpl <em>Settlement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SettlementImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getSettlement()
		 * @generated
		 */
		EClass SETTLEMENT = eINSTANCE.getSettlement();

		/**
		 * The meta object literal for the '<em><b>Market</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTLEMENT__MARKET = eINSTANCE.getSettlement_Market();

		/**
		 * The meta object literal for the '<em><b>Trade Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTLEMENT__TRADE_DATE = eINSTANCE.getSettlement_TradeDate();

		/**
		 * The meta object literal for the '<em><b>Erp Ledger Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTLEMENT__ERP_LEDGER_ENTRIES = eINSTANCE.getSettlement_ErpLedgerEntries();

		/**
		 * The meta object literal for the '<em><b>Erp Invoice Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTLEMENT__ERP_INVOICE_LINE_ITEMS = eINSTANCE.getSettlement_ErpInvoiceLineItems();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketImpl <em>Market</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getMarket()
		 * @generated
		 */
		EClass MARKET = eINSTANCE.getMarket();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET__TYPE = eINSTANCE.getMarket_Type();

		/**
		 * The meta object literal for the '<em><b>Market Factors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET__MARKET_FACTORS = eINSTANCE.getMarket_MarketFactors();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET__START = eINSTANCE.getMarket_Start();

		/**
		 * The meta object literal for the '<em><b>Market Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET__MARKET_PRODUCTS = eINSTANCE.getMarket_MarketProducts();

		/**
		 * The meta object literal for the '<em><b>RTO</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET__RTO = eINSTANCE.getMarket_RTO();

		/**
		 * The meta object literal for the '<em><b>Ramp Interval Non Spin Res</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET__RAMP_INTERVAL_NON_SPIN_RES = eINSTANCE.getMarket_RampIntervalNonSpinRes();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET__END = eINSTANCE.getMarket_End();

		/**
		 * The meta object literal for the '<em><b>Time Interval Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET__TIME_INTERVAL_LENGTH = eINSTANCE.getMarket_TimeIntervalLength();

		/**
		 * The meta object literal for the '<em><b>Settlements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET__SETTLEMENTS = eINSTANCE.getMarket_Settlements();

		/**
		 * The meta object literal for the '<em><b>Bids</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET__BIDS = eINSTANCE.getMarket_Bids();

		/**
		 * The meta object literal for the '<em><b>Ramp Interval Reg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET__RAMP_INTERVAL_REG = eINSTANCE.getMarket_RampIntervalReg();

		/**
		 * The meta object literal for the '<em><b>Registered Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET__REGISTERED_RESOURCES = eINSTANCE.getMarket_RegisteredResources();

		/**
		 * The meta object literal for the '<em><b>Ramp Interval Spin Res</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET__RAMP_INTERVAL_SPIN_RES = eINSTANCE.getMarket_RampIntervalSpinRes();

		/**
		 * The meta object literal for the '<em><b>Dst</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET__DST = eINSTANCE.getMarket_Dst();

		/**
		 * The meta object literal for the '<em><b>Ramp Interval Energy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET__RAMP_INTERVAL_ENERGY = eINSTANCE.getMarket_RampIntervalEnergy();

		/**
		 * The meta object literal for the '<em><b>Local Time Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET__LOCAL_TIME_ZONE = eINSTANCE.getMarket_LocalTimeZone();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ReserveReqImpl <em>Reserve Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ReserveReqImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getReserveReq()
		 * @generated
		 */
		EClass RESERVE_REQ = eINSTANCE.getReserveReq();

		/**
		 * The meta object literal for the '<em><b>Sensitivity Price Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVE_REQ__SENSITIVITY_PRICE_CURVE = eINSTANCE.getReserveReq_SensitivityPriceCurve();

		/**
		 * The meta object literal for the '<em><b>Reserve Req Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVE_REQ__RESERVE_REQ_CURVE = eINSTANCE.getReserveReq_ReserveReqCurve();

		/**
		 * The meta object literal for the '<em><b>Market Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVE_REQ__MARKET_PRODUCT = eINSTANCE.getReserveReq_MarketProduct();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RegisteredResourceImpl <em>Registered Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RegisteredResourceImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getRegisteredResource()
		 * @generated
		 */
		EClass REGISTERED_RESOURCE = eINSTANCE.getRegisteredResource();

		/**
		 * The meta object literal for the '<em><b>Markets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTERED_RESOURCE__MARKETS = eINSTANCE.getRegisteredResource_Markets();

		/**
		 * The meta object literal for the '<em><b>Market Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTERED_RESOURCE__MARKET_PRODUCTS = eINSTANCE.getRegisteredResource_MarketProducts();

		/**
		 * The meta object literal for the '<em><b>Rto ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_RESOURCE__RTO_ID = eINSTANCE.getRegisteredResource_RtoID();

		/**
		 * The meta object literal for the '<em><b>Meters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTERED_RESOURCE__METERS = eINSTANCE.getRegisteredResource_Meters();

		/**
		 * The meta object literal for the '<em><b>Pnode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTERED_RESOURCE__PNODE = eINSTANCE.getRegisteredResource_Pnode();

		/**
		 * The meta object literal for the '<em><b>Organisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTERED_RESOURCE__ORGANISATION = eINSTANCE.getRegisteredResource_Organisation();

		/**
		 * The meta object literal for the '<em><b>Resource Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTERED_RESOURCE__RESOURCE_GROUPS = eINSTANCE.getRegisteredResource_ResourceGroups();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketProductImpl <em>Market Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketProductImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getMarketProduct()
		 * @generated
		 */
		EClass MARKET_PRODUCT = eINSTANCE.getMarketProduct();

		/**
		 * The meta object literal for the '<em><b>Product Bids</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_PRODUCT__PRODUCT_BIDS = eINSTANCE.getMarketProduct_ProductBids();

		/**
		 * The meta object literal for the '<em><b>Market</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_PRODUCT__MARKET = eINSTANCE.getMarketProduct_Market();

		/**
		 * The meta object literal for the '<em><b>Reserve Reqs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_PRODUCT__RESERVE_REQS = eINSTANCE.getMarketProduct_ReserveReqs();

		/**
		 * The meta object literal for the '<em><b>Registered Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_PRODUCT__REGISTERED_RESOURCES = eINSTANCE.getMarketProduct_RegisteredResources();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.GeneratingBidImpl <em>Generating Bid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.GeneratingBidImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getGeneratingBid()
		 * @generated
		 */
		EClass GENERATING_BID = eINSTANCE.getGeneratingBid();

		/**
		 * The meta object literal for the '<em><b>Up Time Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_BID__UP_TIME_MIN = eINSTANCE.getGeneratingBid_UpTimeMin();

		/**
		 * The meta object literal for the '<em><b>Registered Generator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATING_BID__REGISTERED_GENERATOR = eINSTANCE.getGeneratingBid_RegisteredGenerator();

		/**
		 * The meta object literal for the '<em><b>Maximum Economic MW</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_BID__MAXIMUM_ECONOMIC_MW = eINSTANCE.getGeneratingBid_MaximumEconomicMW();

		/**
		 * The meta object literal for the '<em><b>Bid Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATING_BID__BID_SET = eINSTANCE.getGeneratingBid_BidSet();

		/**
		 * The meta object literal for the '<em><b>Start Up Time Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATING_BID__START_UP_TIME_CURVE = eINSTANCE.getGeneratingBid_StartUpTimeCurve();

		/**
		 * The meta object literal for the '<em><b>Up Time Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_BID__UP_TIME_MAX = eINSTANCE.getGeneratingBid_UpTimeMax();

		/**
		 * The meta object literal for the '<em><b>Start Up Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_BID__START_UP_TYPE = eINSTANCE.getGeneratingBid_StartUpType();

		/**
		 * The meta object literal for the '<em><b>Notification Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_BID__NOTIFICATION_TIME = eINSTANCE.getGeneratingBid_NotificationTime();

		/**
		 * The meta object literal for the '<em><b>Notification Time Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATING_BID__NOTIFICATION_TIME_CURVE = eINSTANCE.getGeneratingBid_NotificationTimeCurve();

		/**
		 * The meta object literal for the '<em><b>Max Emergency MW</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_BID__MAX_EMERGENCY_MW = eINSTANCE.getGeneratingBid_MaxEmergencyMW();

		/**
		 * The meta object literal for the '<em><b>Startup Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_BID__STARTUP_TIME = eINSTANCE.getGeneratingBid_StartupTime();

		/**
		 * The meta object literal for the '<em><b>Start Up Cost Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATING_BID__START_UP_COST_CURVE = eINSTANCE.getGeneratingBid_StartUpCostCurve();

		/**
		 * The meta object literal for the '<em><b>Minimum Economic MW</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_BID__MINIMUM_ECONOMIC_MW = eINSTANCE.getGeneratingBid_MinimumEconomicMW();

		/**
		 * The meta object literal for the '<em><b>Min Emergency MW</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_BID__MIN_EMERGENCY_MW = eINSTANCE.getGeneratingBid_MinEmergencyMW();

		/**
		 * The meta object literal for the '<em><b>No Load Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_BID__NO_LOAD_COST = eINSTANCE.getGeneratingBid_NoLoadCost();

		/**
		 * The meta object literal for the '<em><b>Minimum Down Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_BID__MINIMUM_DOWN_TIME = eINSTANCE.getGeneratingBid_MinimumDownTime();

		/**
		 * The meta object literal for the '<em><b>Down Time Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_BID__DOWN_TIME_MAX = eINSTANCE.getGeneratingBid_DownTimeMax();

		/**
		 * The meta object literal for the '<em><b>Start Up Ramp Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_BID__START_UP_RAMP_RATE = eINSTANCE.getGeneratingBid_StartUpRampRate();

		/**
		 * The meta object literal for the '<em><b>Operating Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_BID__OPERATING_MODE = eINSTANCE.getGeneratingBid_OperatingMode();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.TerminalConstraintTermImpl <em>Terminal Constraint Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.TerminalConstraintTermImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getTerminalConstraintTerm()
		 * @generated
		 */
		EClass TERMINAL_CONSTRAINT_TERM = eINSTANCE.getTerminalConstraintTerm();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL_CONSTRAINT_TERM__TERMINAL = eINSTANCE.getTerminalConstraintTerm_Terminal();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RTOImpl <em>RTO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RTOImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getRTO()
		 * @generated
		 */
		EClass RTO = eINSTANCE.getRTO();

		/**
		 * The meta object literal for the '<em><b>Markets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTO__MARKETS = eINSTANCE.getRTO_Markets();

		/**
		 * The meta object literal for the '<em><b>Security Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTO__SECURITY_CONSTRAINTS = eINSTANCE.getRTO_SecurityConstraints();

		/**
		 * The meta object literal for the '<em><b>Resource Group Reqs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTO__RESOURCE_GROUP_REQS = eINSTANCE.getRTO_ResourceGroupReqs();

		/**
		 * The meta object literal for the '<em><b>Security Constraints Linear</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTO__SECURITY_CONSTRAINTS_LINEAR = eINSTANCE.getRTO_SecurityConstraintsLinear();

		/**
		 * The meta object literal for the '<em><b>Pnodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTO__PNODES = eINSTANCE.getRTO_Pnodes();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ConstraintTermImpl <em>Constraint Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ConstraintTermImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getConstraintTerm()
		 * @generated
		 */
		EClass CONSTRAINT_TERM = eINSTANCE.getConstraintTerm();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_TERM__FACTOR = eINSTANCE.getConstraintTerm_Factor();

		/**
		 * The meta object literal for the '<em><b>Security Constraint Sum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_TERM__SECURITY_CONSTRAINT_SUM = eINSTANCE.getConstraintTerm_SecurityConstraintSum();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_TERM__FUNCTION = eINSTANCE.getConstraintTerm_Function();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl <em>Pass Through Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getPassThroughBill()
		 * @generated
		 */
		EClass PASS_THROUGH_BILL = eINSTANCE.getPassThroughBill();

		/**
		 * The meta object literal for the '<em><b>Bill End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASS_THROUGH_BILL__BILL_END = eINSTANCE.getPassThroughBill_BillEnd();

		/**
		 * The meta object literal for the '<em><b>Effective Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASS_THROUGH_BILL__EFFECTIVE_DATE = eINSTANCE.getPassThroughBill_EffectiveDate();

		/**
		 * The meta object literal for the '<em><b>Service End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASS_THROUGH_BILL__SERVICE_END = eINSTANCE.getPassThroughBill_ServiceEnd();

		/**
		 * The meta object literal for the '<em><b>Is Profiled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASS_THROUGH_BILL__IS_PROFILED = eINSTANCE.getPassThroughBill_IsProfiled();

		/**
		 * The meta object literal for the '<em><b>Previous End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASS_THROUGH_BILL__PREVIOUS_END = eINSTANCE.getPassThroughBill_PreviousEnd();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASS_THROUGH_BILL__AMOUNT = eINSTANCE.getPassThroughBill_Amount();

		/**
		 * The meta object literal for the '<em><b>Time Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASS_THROUGH_BILL__TIME_ZONE = eINSTANCE.getPassThroughBill_TimeZone();

		/**
		 * The meta object literal for the '<em><b>Billed To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASS_THROUGH_BILL__BILLED_TO = eINSTANCE.getPassThroughBill_BilledTo();

		/**
		 * The meta object literal for the '<em><b>Is Disputed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASS_THROUGH_BILL__IS_DISPUTED = eINSTANCE.getPassThroughBill_IsDisputed();

		/**
		 * The meta object literal for the '<em><b>Provided By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASS_THROUGH_BILL__PROVIDED_BY = eINSTANCE.getPassThroughBill_ProvidedBy();

		/**
		 * The meta object literal for the '<em><b>Market Statement Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASS_THROUGH_BILL__MARKET_STATEMENT_LINE_ITEM = eINSTANCE.getPassThroughBill_MarketStatementLineItem();

		/**
		 * The meta object literal for the '<em><b>Bill Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASS_THROUGH_BILL__BILL_START = eINSTANCE.getPassThroughBill_BillStart();

		/**
		 * The meta object literal for the '<em><b>Previous Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASS_THROUGH_BILL__PREVIOUS_START = eINSTANCE.getPassThroughBill_PreviousStart();

		/**
		 * The meta object literal for the '<em><b>Service Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASS_THROUGH_BILL__SERVICE_START = eINSTANCE.getPassThroughBill_ServiceStart();

		/**
		 * The meta object literal for the '<em><b>Product Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASS_THROUGH_BILL__PRODUCT_CODE = eINSTANCE.getPassThroughBill_ProductCode();

		/**
		 * The meta object literal for the '<em><b>Bill Run Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASS_THROUGH_BILL__BILL_RUN_TYPE = eINSTANCE.getPassThroughBill_BillRunType();

		/**
		 * The meta object literal for the '<em><b>Transaction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASS_THROUGH_BILL__TRANSACTION_TYPE = eINSTANCE.getPassThroughBill_TransactionType();

		/**
		 * The meta object literal for the '<em><b>User Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASS_THROUGH_BILL__USER_ATTRIBUTES = eINSTANCE.getPassThroughBill_UserAttributes();

		/**
		 * The meta object literal for the '<em><b>Charge Profiles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASS_THROUGH_BILL__CHARGE_PROFILES = eINSTANCE.getPassThroughBill_ChargeProfiles();

		/**
		 * The meta object literal for the '<em><b>Trade Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASS_THROUGH_BILL__TRADE_DATE = eINSTANCE.getPassThroughBill_TradeDate();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASS_THROUGH_BILL__PRICE = eINSTANCE.getPassThroughBill_Price();

		/**
		 * The meta object literal for the '<em><b>Tax Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASS_THROUGH_BILL__TAX_AMOUNT = eINSTANCE.getPassThroughBill_TaxAmount();

		/**
		 * The meta object literal for the '<em><b>Sold To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASS_THROUGH_BILL__SOLD_TO = eINSTANCE.getPassThroughBill_SoldTo();

		/**
		 * The meta object literal for the '<em><b>Transaction Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASS_THROUGH_BILL__TRANSACTION_DATE = eINSTANCE.getPassThroughBill_TransactionDate();

		/**
		 * The meta object literal for the '<em><b>Paid To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASS_THROUGH_BILL__PAID_TO = eINSTANCE.getPassThroughBill_PaidTo();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASS_THROUGH_BILL__QUANTITY = eINSTANCE.getPassThroughBill_Quantity();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PnodeImpl <em>Pnode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PnodeImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getPnode()
		 * @generated
		 */
		EClass PNODE = eINSTANCE.getPnode();

		/**
		 * The meta object literal for the '<em><b>Receipt Transaction Bids</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PNODE__RECEIPT_TRANSACTION_BIDS = eINSTANCE.getPnode_ReceiptTransactionBids();

		/**
		 * The meta object literal for the '<em><b>RTO</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PNODE__RTO = eINSTANCE.getPnode_RTO();

		/**
		 * The meta object literal for the '<em><b>Registered Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PNODE__REGISTERED_RESOURCES = eINSTANCE.getPnode_RegisteredResources();

		/**
		 * The meta object literal for the '<em><b>Begin Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PNODE__BEGIN_PERIOD = eINSTANCE.getPnode_BeginPeriod();

		/**
		 * The meta object literal for the '<em><b>Pnode Clearing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PNODE__PNODE_CLEARING = eINSTANCE.getPnode_PnodeClearing();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PNODE__TYPE = eINSTANCE.getPnode_Type();

		/**
		 * The meta object literal for the '<em><b>Delivery Transaction Bids</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PNODE__DELIVERY_TRANSACTION_BIDS = eINSTANCE.getPnode_DeliveryTransactionBids();

		/**
		 * The meta object literal for the '<em><b>Is Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PNODE__IS_PUBLIC = eINSTANCE.getPnode_IsPublic();

		/**
		 * The meta object literal for the '<em><b>Connectivity Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PNODE__CONNECTIVITY_NODE = eINSTANCE.getPnode_ConnectivityNode();

		/**
		 * The meta object literal for the '<em><b>FT Rs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PNODE__FT_RS = eINSTANCE.getPnode_FTRs();

		/**
		 * The meta object literal for the '<em><b>End Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PNODE__END_PERIOD = eINSTANCE.getPnode_EndPeriod();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PNODE__MEASUREMENTS = eINSTANCE.getPnode_Measurements();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PNODE__USAGE = eINSTANCE.getPnode_Usage();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PnodeClearingImpl <em>Pnode Clearing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PnodeClearingImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getPnodeClearing()
		 * @generated
		 */
		EClass PNODE_CLEARING = eINSTANCE.getPnodeClearing();

		/**
		 * The meta object literal for the '<em><b>Congest LMP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PNODE_CLEARING__CONGEST_LMP = eINSTANCE.getPnodeClearing_CongestLMP();

		/**
		 * The meta object literal for the '<em><b>Cost LMP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PNODE_CLEARING__COST_LMP = eINSTANCE.getPnodeClearing_CostLMP();

		/**
		 * The meta object literal for the '<em><b>Loss LMP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PNODE_CLEARING__LOSS_LMP = eINSTANCE.getPnodeClearing_LossLMP();

		/**
		 * The meta object literal for the '<em><b>Pnode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PNODE_CLEARING__PNODE = eINSTANCE.getPnodeClearing_Pnode();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.StartUpTimeCurveImpl <em>Start Up Time Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.StartUpTimeCurveImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getStartUpTimeCurve()
		 * @generated
		 */
		EClass START_UP_TIME_CURVE = eINSTANCE.getStartUpTimeCurve();

		/**
		 * The meta object literal for the '<em><b>Generating Bids</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_UP_TIME_CURVE__GENERATING_BIDS = eINSTANCE.getStartUpTimeCurve_GeneratingBids();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SecurityConstraintSumImpl <em>Security Constraint Sum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SecurityConstraintSumImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getSecurityConstraintSum()
		 * @generated
		 */
		EClass SECURITY_CONSTRAINT_SUM = eINSTANCE.getSecurityConstraintSum();

		/**
		 * The meta object literal for the '<em><b>Contingency Constraint Limits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONSTRAINT_SUM__CONTINGENCY_CONSTRAINT_LIMITS = eINSTANCE.getSecurityConstraintSum_ContingencyConstraintLimits();

		/**
		 * The meta object literal for the '<em><b>Default Constraint Limit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONSTRAINT_SUM__DEFAULT_CONSTRAINT_LIMIT = eINSTANCE.getSecurityConstraintSum_DefaultConstraintLimit();

		/**
		 * The meta object literal for the '<em><b>Base Case Constraint Limit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONSTRAINT_SUM__BASE_CASE_CONSTRAINT_LIMIT = eINSTANCE.getSecurityConstraintSum_BaseCaseConstraintLimit();

		/**
		 * The meta object literal for the '<em><b>Constraint Terms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONSTRAINT_SUM__CONSTRAINT_TERMS = eINSTANCE.getSecurityConstraintSum_ConstraintTerms();

		/**
		 * The meta object literal for the '<em><b>RTO</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONSTRAINT_SUM__RTO = eINSTANCE.getSecurityConstraintSum_RTO();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BaseCaseConstraintLimitImpl <em>Base Case Constraint Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BaseCaseConstraintLimitImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getBaseCaseConstraintLimit()
		 * @generated
		 */
		EClass BASE_CASE_CONSTRAINT_LIMIT = eINSTANCE.getBaseCaseConstraintLimit();

		/**
		 * The meta object literal for the '<em><b>Security Constraint Sum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_CASE_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM = eINSTANCE.getBaseCaseConstraintLimit_SecurityConstraintSum();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ProductBidImpl <em>Product Bid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ProductBidImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getProductBid()
		 * @generated
		 */
		EClass PRODUCT_BID = eINSTANCE.getProductBid();

		/**
		 * The meta object literal for the '<em><b>Bid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_BID__BID = eINSTANCE.getProductBid_Bid();

		/**
		 * The meta object literal for the '<em><b>Product Bid Clearing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_BID__PRODUCT_BID_CLEARING = eINSTANCE.getProductBid_ProductBidClearing();

		/**
		 * The meta object literal for the '<em><b>Bid Price Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_BID__BID_PRICE_CURVE = eINSTANCE.getProductBid_BidPriceCurve();

		/**
		 * The meta object literal for the '<em><b>Market Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_BID__MARKET_PRODUCT = eINSTANCE.getProductBid_MarketProduct();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MWLimitScheduleImpl <em>MW Limit Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MWLimitScheduleImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getMWLimitSchedule()
		 * @generated
		 */
		EClass MW_LIMIT_SCHEDULE = eINSTANCE.getMWLimitSchedule();

		/**
		 * The meta object literal for the '<em><b>Security Constraint Limit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MW_LIMIT_SCHEDULE__SECURITY_CONSTRAINT_LIMIT = eINSTANCE.getMWLimitSchedule_SecurityConstraintLimit();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl <em>Market Statement Line Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getMarketStatementLineItem()
		 * @generated
		 */
		EClass MARKET_STATEMENT_LINE_ITEM = eINSTANCE.getMarketStatementLineItem();

		/**
		 * The meta object literal for the '<em><b>Current Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_STATEMENT_LINE_ITEM__CURRENT_AMOUNT = eINSTANCE.getMarketStatementLineItem_CurrentAmount();

		/**
		 * The meta object literal for the '<em><b>Previous ISO Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_STATEMENT_LINE_ITEM__PREVIOUS_ISO_AMOUNT = eINSTANCE.getMarketStatementLineItem_PreviousISOAmount();

		/**
		 * The meta object literal for the '<em><b>Quantity UOM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_STATEMENT_LINE_ITEM__QUANTITY_UOM = eINSTANCE.getMarketStatementLineItem_QuantityUOM();

		/**
		 * The meta object literal for the '<em><b>Net ISO Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_STATEMENT_LINE_ITEM__NET_ISO_AMOUNT = eINSTANCE.getMarketStatementLineItem_NetISOAmount();

		/**
		 * The meta object literal for the '<em><b>User Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_STATEMENT_LINE_ITEM__USER_ATTRIBUTES = eINSTANCE.getMarketStatementLineItem_UserAttributes();

		/**
		 * The meta object literal for the '<em><b>Current ISO Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_STATEMENT_LINE_ITEM__CURRENT_ISO_AMOUNT = eINSTANCE.getMarketStatementLineItem_CurrentISOAmount();

		/**
		 * The meta object literal for the '<em><b>Previous Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_STATEMENT_LINE_ITEM__PREVIOUS_QUANTITY = eINSTANCE.getMarketStatementLineItem_PreviousQuantity();

		/**
		 * The meta object literal for the '<em><b>Component Market Statement Line Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_STATEMENT_LINE_ITEM__COMPONENT_MARKET_STATEMENT_LINE_ITEM = eINSTANCE.getMarketStatementLineItem_ComponentMarketStatementLineItem();

		/**
		 * The meta object literal for the '<em><b>Previous Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_STATEMENT_LINE_ITEM__PREVIOUS_AMOUNT = eINSTANCE.getMarketStatementLineItem_PreviousAmount();

		/**
		 * The meta object literal for the '<em><b>Net ISO Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_STATEMENT_LINE_ITEM__NET_ISO_QUANTITY = eINSTANCE.getMarketStatementLineItem_NetISOQuantity();

		/**
		 * The meta object literal for the '<em><b>Net Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_STATEMENT_LINE_ITEM__NET_PRICE = eINSTANCE.getMarketStatementLineItem_NetPrice();

		/**
		 * The meta object literal for the '<em><b>Current ISO Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_STATEMENT_LINE_ITEM__CURRENT_ISO_QUANTITY = eINSTANCE.getMarketStatementLineItem_CurrentISOQuantity();

		/**
		 * The meta object literal for the '<em><b>Current Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_STATEMENT_LINE_ITEM__CURRENT_PRICE = eINSTANCE.getMarketStatementLineItem_CurrentPrice();

		/**
		 * The meta object literal for the '<em><b>Pass Through Bill</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_STATEMENT_LINE_ITEM__PASS_THROUGH_BILL = eINSTANCE.getMarketStatementLineItem_PassThroughBill();

		/**
		 * The meta object literal for the '<em><b>Previsou Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_STATEMENT_LINE_ITEM__PREVISOU_PRICE = eINSTANCE.getMarketStatementLineItem_PrevisouPrice();

		/**
		 * The meta object literal for the '<em><b>Market Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_STATEMENT_LINE_ITEM__MARKET_STATEMENT = eINSTANCE.getMarketStatementLineItem_MarketStatement();

		/**
		 * The meta object literal for the '<em><b>Previous ISO Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_STATEMENT_LINE_ITEM__PREVIOUS_ISO_QUANTITY = eINSTANCE.getMarketStatementLineItem_PreviousISOQuantity();

		/**
		 * The meta object literal for the '<em><b>Interval Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_STATEMENT_LINE_ITEM__INTERVAL_DATE = eINSTANCE.getMarketStatementLineItem_IntervalDate();

		/**
		 * The meta object literal for the '<em><b>Net Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_STATEMENT_LINE_ITEM__NET_QUANTITY = eINSTANCE.getMarketStatementLineItem_NetQuantity();

		/**
		 * The meta object literal for the '<em><b>Net Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_STATEMENT_LINE_ITEM__NET_AMOUNT = eINSTANCE.getMarketStatementLineItem_NetAmount();

		/**
		 * The meta object literal for the '<em><b>Current Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_STATEMENT_LINE_ITEM__CURRENT_QUANTITY = eINSTANCE.getMarketStatementLineItem_CurrentQuantity();

		/**
		 * The meta object literal for the '<em><b>Interval Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_STATEMENT_LINE_ITEM__INTERVAL_NUMBER = eINSTANCE.getMarketStatementLineItem_IntervalNumber();

		/**
		 * The meta object literal for the '<em><b>Container Market Statement Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_STATEMENT_LINE_ITEM__CONTAINER_MARKET_STATEMENT_LINE_ITEM = eINSTANCE.getMarketStatementLineItem_ContainerMarketStatementLineItem();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.AncillaryServiceClearingImpl <em>Ancillary Service Clearing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.AncillaryServiceClearingImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getAncillaryServiceClearing()
		 * @generated
		 */
		EClass ANCILLARY_SERVICE_CLEARING = eINSTANCE.getAncillaryServiceClearing();

		/**
		 * The meta object literal for the '<em><b>Mcp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANCILLARY_SERVICE_CLEARING__MCP = eINSTANCE.getAncillaryServiceClearing_Mcp();

		/**
		 * The meta object literal for the '<em><b>Cleared MW</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANCILLARY_SERVICE_CLEARING__CLEARED_MW = eINSTANCE.getAncillaryServiceClearing_ClearedMW();

		/**
		 * The meta object literal for the '<em><b>Market Case Clearing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANCILLARY_SERVICE_CLEARING__MARKET_CASE_CLEARING = eINSTANCE.getAncillaryServiceClearing_MarketCaseClearing();

		/**
		 * The meta object literal for the '<em><b>Commodity Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANCILLARY_SERVICE_CLEARING__COMMODITY_TYPE = eINSTANCE.getAncillaryServiceClearing_CommodityType();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidSetImpl <em>Bid Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidSetImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getBidSet()
		 * @generated
		 */
		EClass BID_SET = eINSTANCE.getBidSet();

		/**
		 * The meta object literal for the '<em><b>Generating Bids</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BID_SET__GENERATING_BIDS = eINSTANCE.getBidSet_GeneratingBids();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SecurityConstraintsClearingImpl <em>Security Constraints Clearing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SecurityConstraintsClearingImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getSecurityConstraintsClearing()
		 * @generated
		 */
		EClass SECURITY_CONSTRAINTS_CLEARING = eINSTANCE.getSecurityConstraintsClearing();

		/**
		 * The meta object literal for the '<em><b>Mw Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CONSTRAINTS_CLEARING__MW_LIMIT = eINSTANCE.getSecurityConstraintsClearing_MwLimit();

		/**
		 * The meta object literal for the '<em><b>Mw Flow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CONSTRAINTS_CLEARING__MW_FLOW = eINSTANCE.getSecurityConstraintsClearing_MwFlow();

		/**
		 * The meta object literal for the '<em><b>Shadow Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CONSTRAINTS_CLEARING__SHADOW_PRICE = eINSTANCE.getSecurityConstraintsClearing_ShadowPrice();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ProductBidClearingImpl <em>Product Bid Clearing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ProductBidClearingImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getProductBidClearing()
		 * @generated
		 */
		EClass PRODUCT_BID_CLEARING = eINSTANCE.getProductBidClearing();

		/**
		 * The meta object literal for the '<em><b>Cleared MW</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_BID_CLEARING__CLEARED_MW = eINSTANCE.getProductBidClearing_ClearedMW();

		/**
		 * The meta object literal for the '<em><b>Product Bids</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_BID_CLEARING__PRODUCT_BIDS = eINSTANCE.getProductBidClearing_ProductBids();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ResourceBidImpl <em>Resource Bid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ResourceBidImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getResourceBid()
		 * @generated
		 */
		EClass RESOURCE_BID = eINSTANCE.getResourceBid();

		/**
		 * The meta object literal for the '<em><b>Start Ups Max Week</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_BID__START_UPS_MAX_WEEK = eINSTANCE.getResourceBid_StartUpsMaxWeek();

		/**
		 * The meta object literal for the '<em><b>Commodity Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_BID__COMMODITY_TYPE = eINSTANCE.getResourceBid_CommodityType();

		/**
		 * The meta object literal for the '<em><b>Energy Max Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_BID__ENERGY_MAX_DAY = eINSTANCE.getResourceBid_EnergyMaxDay();

		/**
		 * The meta object literal for the '<em><b>Energy Min Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_BID__ENERGY_MIN_DAY = eINSTANCE.getResourceBid_EnergyMinDay();

		/**
		 * The meta object literal for the '<em><b>Virtual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_BID__VIRTUAL = eINSTANCE.getResourceBid_Virtual();

		/**
		 * The meta object literal for the '<em><b>Shut Downs Max Week</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_BID__SHUT_DOWNS_MAX_WEEK = eINSTANCE.getResourceBid_ShutDownsMaxWeek();

		/**
		 * The meta object literal for the '<em><b>Shut Downs Max Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_BID__SHUT_DOWNS_MAX_DAY = eINSTANCE.getResourceBid_ShutDownsMaxDay();

		/**
		 * The meta object literal for the '<em><b>Start Ups Max Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_BID__START_UPS_MAX_DAY = eINSTANCE.getResourceBid_StartUpsMaxDay();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.CapacityBenefitMarginImpl <em>Capacity Benefit Margin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.CapacityBenefitMarginImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getCapacityBenefitMargin()
		 * @generated
		 */
		EClass CAPACITY_BENEFIT_MARGIN = eINSTANCE.getCapacityBenefitMargin();

		/**
		 * The meta object literal for the '<em><b>Season</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPACITY_BENEFIT_MARGIN__SEASON = eINSTANCE.getCapacityBenefitMargin_Season();

		/**
		 * The meta object literal for the '<em><b>Flowgate</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPACITY_BENEFIT_MARGIN__FLOWGATE = eINSTANCE.getCapacityBenefitMargin_Flowgate();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SchedulingCoordinatorImpl <em>Scheduling Coordinator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SchedulingCoordinatorImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getSchedulingCoordinator()
		 * @generated
		 */
		EClass SCHEDULING_COORDINATOR = eINSTANCE.getSchedulingCoordinator();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RampRateCurveImpl <em>Ramp Rate Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RampRateCurveImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getRampRateCurve()
		 * @generated
		 */
		EClass RAMP_RATE_CURVE = eINSTANCE.getRampRateCurve();

		/**
		 * The meta object literal for the '<em><b>Generating Unit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAMP_RATE_CURVE__GENERATING_UNIT = eINSTANCE.getRampRateCurve_GeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Ramp Rate Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAMP_RATE_CURVE__RAMP_RATE_TYPE = eINSTANCE.getRampRateCurve_RampRateType();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidClearingImpl <em>Bid Clearing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidClearingImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getBidClearing()
		 * @generated
		 */
		EClass BID_CLEARING = eINSTANCE.getBidClearing();

		/**
		 * The meta object literal for the '<em><b>Start Up Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BID_CLEARING__START_UP_COST = eINSTANCE.getBidClearing_StartUpCost();

		/**
		 * The meta object literal for the '<em><b>Bid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BID_CLEARING__BID = eINSTANCE.getBidClearing_Bid();

		/**
		 * The meta object literal for the '<em><b>No Load Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BID_CLEARING__NO_LOAD_COST = eINSTANCE.getBidClearing_NoLoadCost();

		/**
		 * The meta object literal for the '<em><b>Lost Op Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BID_CLEARING__LOST_OP_COST = eINSTANCE.getBidClearing_LostOpCost();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LoadBidImpl <em>Load Bid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LoadBidImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getLoadBid()
		 * @generated
		 */
		EClass LOAD_BID = eINSTANCE.getLoadBid();

		/**
		 * The meta object literal for the '<em><b>Min Load Reduction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BID__MIN_LOAD_REDUCTION = eINSTANCE.getLoadBid_MinLoadReduction();

		/**
		 * The meta object literal for the '<em><b>Drop Ramp Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BID__DROP_RAMP_RATE = eINSTANCE.getLoadBid_DropRampRate();

		/**
		 * The meta object literal for the '<em><b>Min Load Reduction Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BID__MIN_LOAD_REDUCTION_INTERVAL = eINSTANCE.getLoadBid_MinLoadReductionInterval();

		/**
		 * The meta object literal for the '<em><b>Load Reduction Price Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_BID__LOAD_REDUCTION_PRICE_CURVE = eINSTANCE.getLoadBid_LoadReductionPriceCurve();

		/**
		 * The meta object literal for the '<em><b>Min Load Reduction Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BID__MIN_LOAD_REDUCTION_COST = eINSTANCE.getLoadBid_MinLoadReductionCost();

		/**
		 * The meta object literal for the '<em><b>Pick Up Ramp Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BID__PICK_UP_RAMP_RATE = eINSTANCE.getLoadBid_PickUpRampRate();

		/**
		 * The meta object literal for the '<em><b>Req Notice Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BID__REQ_NOTICE_TIME = eINSTANCE.getLoadBid_ReqNoticeTime();

		/**
		 * The meta object literal for the '<em><b>Min Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BID__MIN_LOAD = eINSTANCE.getLoadBid_MinLoad();

		/**
		 * The meta object literal for the '<em><b>Registered Load</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_BID__REGISTERED_LOAD = eINSTANCE.getLoadBid_RegisteredLoad();

		/**
		 * The meta object literal for the '<em><b>Min Time Bet Load Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BID__MIN_TIME_BET_LOAD_RED = eINSTANCE.getLoadBid_MinTimeBetLoadRed();

		/**
		 * The meta object literal for the '<em><b>Shutdown Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BID__SHUTDOWN_COST = eINSTANCE.getLoadBid_ShutdownCost();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidImpl <em>Bid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getBid()
		 * @generated
		 */
		EClass BID = eINSTANCE.getBid();

		/**
		 * The meta object literal for the '<em><b>Stop Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BID__STOP_TIME = eINSTANCE.getBid_StopTime();

		/**
		 * The meta object literal for the '<em><b>Market Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BID__MARKET_TYPE = eINSTANCE.getBid_MarketType();

		/**
		 * The meta object literal for the '<em><b>Product Bids</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BID__PRODUCT_BIDS = eINSTANCE.getBid_ProductBids();

		/**
		 * The meta object literal for the '<em><b>Bid Clearing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BID__BID_CLEARING = eINSTANCE.getBid_BidClearing();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BID__START_TIME = eINSTANCE.getBid_StartTime();

		/**
		 * The meta object literal for the '<em><b>Market</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BID__MARKET = eINSTANCE.getBid_Market();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl <em>Flowgate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getFlowgate()
		 * @generated
		 */
		EClass FLOWGATE = eINSTANCE.getFlowgate();

		/**
		 * The meta object literal for the '<em><b>Transmission Reliability Margin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOWGATE__TRANSMISSION_RELIABILITY_MARGIN = eINSTANCE.getFlowgate_TransmissionReliabilityMargin();

		/**
		 * The meta object literal for the '<em><b>Afc Use Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOWGATE__AFC_USE_CODE = eINSTANCE.getFlowgate_AfcUseCode();

		/**
		 * The meta object literal for the '<em><b>Idc Operational Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOWGATE__IDC_OPERATIONAL_NAME = eINSTANCE.getFlowgate_IdcOperationalName();

		/**
		 * The meta object literal for the '<em><b>In Service Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOWGATE__IN_SERVICE_DATE = eINSTANCE.getFlowgate_InServiceDate();

		/**
		 * The meta object literal for the '<em><b>Violation Limits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOWGATE__VIOLATION_LIMITS = eINSTANCE.getFlowgate_ViolationLimits();

		/**
		 * The meta object literal for the '<em><b>Out Of Service Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOWGATE__OUT_OF_SERVICE_DATE = eINSTANCE.getFlowgate_OutOfServiceDate();

		/**
		 * The meta object literal for the '<em><b>Capacity Benefit Margin</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOWGATE__CAPACITY_BENEFIT_MARGIN = eINSTANCE.getFlowgate_CapacityBenefitMargin();

		/**
		 * The meta object literal for the '<em><b>Coordinated Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOWGATE__COORDINATED_FLAG = eINSTANCE.getFlowgate_CoordinatedFlag();

		/**
		 * The meta object literal for the '<em><b>Atc Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOWGATE__ATC_FLAG = eINSTANCE.getFlowgate_AtcFlag();

		/**
		 * The meta object literal for the '<em><b>Deletion Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOWGATE__DELETION_DATE = eINSTANCE.getFlowgate_DeletionDate();

		/**
		 * The meta object literal for the '<em><b>Reciprocal Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOWGATE__RECIPROCAL_FLAG = eINSTANCE.getFlowgate_ReciprocalFlag();

		/**
		 * The meta object literal for the '<em><b>Idc Assigned Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOWGATE__IDC_ASSIGNED_ID = eINSTANCE.getFlowgate_IdcAssignedId();

		/**
		 * The meta object literal for the '<em><b>Power Transormers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOWGATE__POWER_TRANSORMERS = eINSTANCE.getFlowgate_PowerTransormers();

		/**
		 * The meta object literal for the '<em><b>Positive Impact Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOWGATE__POSITIVE_IMPACT_VALUE = eINSTANCE.getFlowgate_PositiveImpactValue();

		/**
		 * The meta object literal for the '<em><b>FT Rs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOWGATE__FT_RS = eINSTANCE.getFlowgate_FTRs();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOWGATE__LINES = eINSTANCE.getFlowgate_Lines();

		/**
		 * The meta object literal for the '<em><b>Counter Flow Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOWGATE__COUNTER_FLOW_VALUE = eINSTANCE.getFlowgate_CounterFlowValue();

		/**
		 * The meta object literal for the '<em><b>Coordination Study Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOWGATE__COORDINATION_STUDY_DATE = eINSTANCE.getFlowgate_CoordinationStudyDate();

		/**
		 * The meta object literal for the '<em><b>Sub Control Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOWGATE__SUB_CONTROL_AREA = eINSTANCE.getFlowgate_SubControlArea();

		/**
		 * The meta object literal for the '<em><b>Idc Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOWGATE__IDC_TYPE = eINSTANCE.getFlowgate_IdcType();

		/**
		 * The meta object literal for the '<em><b>Managing Entity Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOWGATE__MANAGING_ENTITY_FLAG = eINSTANCE.getFlowgate_ManagingEntityFlag();

		/**
		 * The meta object literal for the '<em><b>Transmission Provider</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOWGATE__TRANSMISSION_PROVIDER = eINSTANCE.getFlowgate_TransmissionProvider();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketFactorsImpl <em>Market Factors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketFactorsImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getMarketFactors()
		 * @generated
		 */
		EClass MARKET_FACTORS = eINSTANCE.getMarketFactors();

		/**
		 * The meta object literal for the '<em><b>Erp Invoices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_FACTORS__ERP_INVOICES = eINSTANCE.getMarketFactors_ErpInvoices();

		/**
		 * The meta object literal for the '<em><b>Market</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_FACTORS__MARKET = eINSTANCE.getMarketFactors_Market();

		/**
		 * The meta object literal for the '<em><b>Interval Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_FACTORS__INTERVAL_START_TIME = eINSTANCE.getMarketFactors_IntervalStartTime();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.FTRImpl <em>FTR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.FTRImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getFTR()
		 * @generated
		 */
		EClass FTR = eINSTANCE.getFTR();

		/**
		 * The meta object literal for the '<em><b>Base Energy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FTR__BASE_ENERGY = eINSTANCE.getFTR_BaseEnergy();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FTR__ACTION = eINSTANCE.getFTR_Action();

		/**
		 * The meta object literal for the '<em><b>Energy Price Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FTR__ENERGY_PRICE_CURVE = eINSTANCE.getFTR_EnergyPriceCurve();

		/**
		 * The meta object literal for the '<em><b>Optimized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FTR__OPTIMIZED = eINSTANCE.getFTR_Optimized();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FTR__CLASS = eINSTANCE.getFTR_Class();

		/**
		 * The meta object literal for the '<em><b>Pnodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FTR__PNODES = eINSTANCE.getFTR_Pnodes();

		/**
		 * The meta object literal for the '<em><b>Ftr Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FTR__FTR_TYPE = eINSTANCE.getFTR_FtrType();

		/**
		 * The meta object literal for the '<em><b>Flowgate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FTR__FLOWGATE = eINSTANCE.getFTR_Flowgate();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LossPenaltyFactorImpl <em>Loss Penalty Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LossPenaltyFactorImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getLossPenaltyFactor()
		 * @generated
		 */
		EClass LOSS_PENALTY_FACTOR = eINSTANCE.getLossPenaltyFactor();

		/**
		 * The meta object literal for the '<em><b>Connectivity Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOSS_PENALTY_FACTOR__CONNECTIVITY_NODES = eINSTANCE.getLossPenaltyFactor_ConnectivityNodes();

		/**
		 * The meta object literal for the '<em><b>Loss Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOSS_PENALTY_FACTOR__LOSS_FACTOR = eINSTANCE.getLossPenaltyFactor_LossFactor();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ResourceGroupImpl <em>Resource Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ResourceGroupImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getResourceGroup()
		 * @generated
		 */
		EClass RESOURCE_GROUP = eINSTANCE.getResourceGroup();

		/**
		 * The meta object literal for the '<em><b>Resource Group Reqs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_GROUP__RESOURCE_GROUP_REQS = eINSTANCE.getResourceGroup_ResourceGroupReqs();

		/**
		 * The meta object literal for the '<em><b>Registered Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_GROUP__REGISTERED_RESOURCES = eINSTANCE.getResourceGroup_RegisteredResources();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.UnitInitialConditionsImpl <em>Unit Initial Conditions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.UnitInitialConditionsImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getUnitInitialConditions()
		 * @generated
		 */
		EClass UNIT_INITIAL_CONDITIONS = eINSTANCE.getUnitInitialConditions();

		/**
		 * The meta object literal for the '<em><b>Resource Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_INITIAL_CONDITIONS__RESOURCE_STATUS = eINSTANCE.getUnitInitialConditions_ResourceStatus();

		/**
		 * The meta object literal for the '<em><b>Time In Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_INITIAL_CONDITIONS__TIME_IN_STATUS = eINSTANCE.getUnitInitialConditions_TimeInStatus();

		/**
		 * The meta object literal for the '<em><b>Resource MW</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_INITIAL_CONDITIONS__RESOURCE_MW = eINSTANCE.getUnitInitialConditions_ResourceMW();

		/**
		 * The meta object literal for the '<em><b>Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_INITIAL_CONDITIONS__GENERATING_UNIT = eINSTANCE.getUnitInitialConditions_GeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Cum Energy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_INITIAL_CONDITIONS__CUM_ENERGY = eINSTANCE.getUnitInitialConditions_CumEnergy();

		/**
		 * The meta object literal for the '<em><b>Status Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_INITIAL_CONDITIONS__STATUS_DATE = eINSTANCE.getUnitInitialConditions_StatusDate();

		/**
		 * The meta object literal for the '<em><b>Cum Status Changes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_INITIAL_CONDITIONS__CUM_STATUS_CHANGES = eINSTANCE.getUnitInitialConditions_CumStatusChanges();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RegisteredLoadImpl <em>Registered Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RegisteredLoadImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getRegisteredLoad()
		 * @generated
		 */
		EClass REGISTERED_LOAD = eINSTANCE.getRegisteredLoad();

		/**
		 * The meta object literal for the '<em><b>Load Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTERED_LOAD__LOAD_AREA = eINSTANCE.getRegisteredLoad_LoadArea();

		/**
		 * The meta object literal for the '<em><b>Load Bids</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTERED_LOAD__LOAD_BIDS = eINSTANCE.getRegisteredLoad_LoadBids();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ReserveReqCurveImpl <em>Reserve Req Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ReserveReqCurveImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getReserveReqCurve()
		 * @generated
		 */
		EClass RESERVE_REQ_CURVE = eINSTANCE.getReserveReqCurve();

		/**
		 * The meta object literal for the '<em><b>Reserve Req</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVE_REQ_CURVE__RESERVE_REQ = eINSTANCE.getReserveReqCurve_ReserveReq();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BilateralTransactionImpl <em>Bilateral Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BilateralTransactionImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getBilateralTransaction()
		 * @generated
		 */
		EClass BILATERAL_TRANSACTION = eINSTANCE.getBilateralTransaction();

		/**
		 * The meta object literal for the '<em><b>Purchase Time Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILATERAL_TRANSACTION__PURCHASE_TIME_MAX = eINSTANCE.getBilateralTransaction_PurchaseTimeMax();

		/**
		 * The meta object literal for the '<em><b>Purchase Time Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILATERAL_TRANSACTION__PURCHASE_TIME_MIN = eINSTANCE.getBilateralTransaction_PurchaseTimeMin();

		/**
		 * The meta object literal for the '<em><b>Curtail Time Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILATERAL_TRANSACTION__CURTAIL_TIME_MAX = eINSTANCE.getBilateralTransaction_CurtailTimeMax();

		/**
		 * The meta object literal for the '<em><b>Curtail Time Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILATERAL_TRANSACTION__CURTAIL_TIME_MIN = eINSTANCE.getBilateralTransaction_CurtailTimeMin();

		/**
		 * The meta object literal for the '<em><b>Total Tran Charge Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILATERAL_TRANSACTION__TOTAL_TRAN_CHARGE_MAX = eINSTANCE.getBilateralTransaction_TotalTranChargeMax();

		/**
		 * The meta object literal for the '<em><b>Transaction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILATERAL_TRANSACTION__TRANSACTION_TYPE = eINSTANCE.getBilateralTransaction_TransactionType();

		/**
		 * The meta object literal for the '<em><b>Market Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILATERAL_TRANSACTION__MARKET_TYPE = eINSTANCE.getBilateralTransaction_MarketType();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILATERAL_TRANSACTION__SCOPE = eINSTANCE.getBilateralTransaction_Scope();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SensitivityPriceCurveImpl <em>Sensitivity Price Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SensitivityPriceCurveImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getSensitivityPriceCurve()
		 * @generated
		 */
		EClass SENSITIVITY_PRICE_CURVE = eINSTANCE.getSensitivityPriceCurve();

		/**
		 * The meta object literal for the '<em><b>Reserve Req</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSITIVITY_PRICE_CURVE__RESERVE_REQ = eINSTANCE.getSensitivityPriceCurve_ReserveReq();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.TransmissionReliabilityMarginImpl <em>Transmission Reliability Margin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.TransmissionReliabilityMarginImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getTransmissionReliabilityMargin()
		 * @generated
		 */
		EClass TRANSMISSION_RELIABILITY_MARGIN = eINSTANCE.getTransmissionReliabilityMargin();

		/**
		 * The meta object literal for the '<em><b>Trm Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMISSION_RELIABILITY_MARGIN__TRM_TYPE = eINSTANCE.getTransmissionReliabilityMargin_TrmType();

		/**
		 * The meta object literal for the '<em><b>Flowgate</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_RELIABILITY_MARGIN__FLOWGATE = eINSTANCE.getTransmissionReliabilityMargin_Flowgate();

		/**
		 * The meta object literal for the '<em><b>Value Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMISSION_RELIABILITY_MARGIN__VALUE_UNIT = eINSTANCE.getTransmissionReliabilityMargin_ValueUnit();

		/**
		 * The meta object literal for the '<em><b>Trm Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMISSION_RELIABILITY_MARGIN__TRM_VALUE = eINSTANCE.getTransmissionReliabilityMargin_TrmValue();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidPriceCurveImpl <em>Bid Price Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidPriceCurveImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getBidPriceCurve()
		 * @generated
		 */
		EClass BID_PRICE_CURVE = eINSTANCE.getBidPriceCurve();

		/**
		 * The meta object literal for the '<em><b>Product Bids</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BID_PRICE_CURVE__PRODUCT_BIDS = eINSTANCE.getBidPriceCurve_ProductBids();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ResourceGroupReqImpl <em>Resource Group Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ResourceGroupReqImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getResourceGroupReq()
		 * @generated
		 */
		EClass RESOURCE_GROUP_REQ = eINSTANCE.getResourceGroupReq();

		/**
		 * The meta object literal for the '<em><b>Resource Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_GROUP_REQ__RESOURCE_GROUP = eINSTANCE.getResourceGroupReq_ResourceGroup();

		/**
		 * The meta object literal for the '<em><b>RT Os</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_GROUP_REQ__RT_OS = eINSTANCE.getResourceGroupReq_RTOs();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ChargeProfileDataImpl <em>Charge Profile Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ChargeProfileDataImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getChargeProfileData()
		 * @generated
		 */
		EClass CHARGE_PROFILE_DATA = eINSTANCE.getChargeProfileData();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGE_PROFILE_DATA__SEQUENCE = eINSTANCE.getChargeProfileData_Sequence();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGE_PROFILE_DATA__TIME_STAMP = eINSTANCE.getChargeProfileData_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Charge Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARGE_PROFILE_DATA__CHARGE_PROFILE = eINSTANCE.getChargeProfileData_ChargeProfile();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGE_PROFILE_DATA__VALUE = eINSTANCE.getChargeProfileData_Value();

		/**
		 * The meta object literal for the '<em><b>Bill Determinant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARGE_PROFILE_DATA__BILL_DETERMINANT = eINSTANCE.getChargeProfileData_BillDeterminant();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketCaseClearingImpl <em>Market Case Clearing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketCaseClearingImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getMarketCaseClearing()
		 * @generated
		 */
		EClass MARKET_CASE_CLEARING = eINSTANCE.getMarketCaseClearing();

		/**
		 * The meta object literal for the '<em><b>Ancillary Service Clearing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_CASE_CLEARING__ANCILLARY_SERVICE_CLEARING = eINSTANCE.getMarketCaseClearing_AncillaryServiceClearing();

		/**
		 * The meta object literal for the '<em><b>Posted Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_CASE_CLEARING__POSTED_DATE = eINSTANCE.getMarketCaseClearing_PostedDate();

		/**
		 * The meta object literal for the '<em><b>Case Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_CASE_CLEARING__CASE_TYPE = eINSTANCE.getMarketCaseClearing_CaseType();

		/**
		 * The meta object literal for the '<em><b>Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_CASE_CLEARING__MODIFIED_DATE = eINSTANCE.getMarketCaseClearing_ModifiedDate();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.NodeConstraintTermImpl <em>Node Constraint Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.NodeConstraintTermImpl
		 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl#getNodeConstraintTerm()
		 * @generated
		 */
		EClass NODE_CONSTRAINT_TERM = eINSTANCE.getNodeConstraintTerm();

		/**
		 * The meta object literal for the '<em><b>Connectivity Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_CONSTRAINT_TERM__CONNECTIVITY_NODE = eINSTANCE.getNodeConstraintTerm_ConnectivityNode();

	}

} //MarketOperationsPackage
