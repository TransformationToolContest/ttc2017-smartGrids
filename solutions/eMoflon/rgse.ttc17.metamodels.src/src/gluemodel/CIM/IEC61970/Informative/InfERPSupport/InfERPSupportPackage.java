/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport;

import gluemodel.CIM.IEC61968.Common.CommonPackage;

import gluemodel.CIM.IEC61970.Core.CorePackage;

import gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The package contains portions of the model defined byEnterprise Resource Planning (ERP) standards like those proposed by the Open Applications Group (OAG). It is provided to facilitate integration among electric utility applications (CIM) and enterprise resource planning (ERP) applications (as defined by OAG). Rather than inventing new CIM classes that accomplish similar functionality as in existing ERP models, the preferred approach is to use and extend ERP classes as appropriate in other packages.\nIf a model other that the OAG standard is used as a basis for ERP integration, the utility classes labeld \"Erp...\" should be associated with the appropriate classes of that standard. In fact, definitions of \"Erp...\" classes are based on OAG Nouns to facilitate this process.\n\nTODO: The following has been copied from a very old version of draft Part 11, so the references are wrong, but we store the knowledge here to reuse later:\n\"The Enterprise Resource Planning (ERP) Support Package contains portions of the model defined by ERP standards like those proposed by the Open Applications Group (OAG). This package is provided to facilitate integration among electric utility applications (CIM) and enterprise resource planning (ERP) applications (OAG). Rather than inventing new CIM classes that accomplish similar functionality as in existing ERP models, the preferred approach is to use and extend ERP classes as appropriate in other packages.\nIf a model other that the OAG standard is used as a basis for ERP integration, the utility classes labeled \"Erp...\" should be associated with the appropriate classes of that standard.\"'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The package contains portions of the model defined byEnterprise Resource Planning (ERP) standards like those proposed by the Open Applications Group (OAG). It is provided to facilitate integration among electric utility applications (CIM) and enterprise resource planning (ERP) applications (as defined by OAG). Rather than inventing new CIM classes that accomplish similar functionality as in existing ERP models, the preferred approach is to use and extend ERP classes as appropriate in other packages.\nIf a model other that the OAG standard is used as a basis for ERP integration, the utility classes labeld \"Erp...\" should be associated with the appropriate classes of that standard. In fact, definitions of \"Erp...\" classes are based on OAG Nouns to facilitate this process.\n\nTODO: The following has been copied from a very old version of draft Part 11, so the references are wrong, but we store the knowledge here to reuse later:\n\"The Enterprise Resource Planning (ERP) Support Package contains portions of the model defined by ERP standards like those proposed by the Open Applications Group (OAG). This package is provided to facilitate integration among electric utility applications (CIM) and enterprise resource planning (ERP) applications (OAG). Rather than inventing new CIM classes that accomplish similar functionality as in existing ERP models, the preferred approach is to use and extend ERP classes as appropriate in other packages.\nIf a model other that the OAG standard is used as a basis for ERP integration, the utility classes labeled \"Erp...\" should be associated with the appropriate classes of that standard.\"'"
 * @generated
 */
public interface InfERPSupportPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "InfERPSupport";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#InfERPSupport";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimInfERPSupport";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfERPSupportPackage eINSTANCE = gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpInventoryCountImpl <em>Erp Inventory Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpInventoryCountImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpInventoryCount()
	 * @generated
	 */
	int ERP_INVENTORY_COUNT = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVENTORY_COUNT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVENTORY_COUNT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVENTORY_COUNT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVENTORY_COUNT__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVENTORY_COUNT__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVENTORY_COUNT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVENTORY_COUNT__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVENTORY_COUNT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVENTORY_COUNT__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Material Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVENTORY_COUNT__MATERIAL_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVENTORY_COUNT__ASSET_MODEL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Erp Inventory Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVENTORY_COUNT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Erp Inventory Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVENTORY_COUNT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonnelImpl <em>Erp Personnel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonnelImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpPersonnel()
	 * @generated
	 */
	int ERP_PERSONNEL = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSONNEL__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSONNEL__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSONNEL__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSONNEL__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSONNEL__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSONNEL__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSONNEL__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSONNEL__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSONNEL__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSONNEL__ERP_PERSONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Erp Personnel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSONNEL_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Erp Personnel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSONNEL_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl <em>Erp Invoice Line Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpInvoiceLineItem()
	 * @generated
	 */
	int ERP_INVOICE_LINE_ITEM = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Erp Quote Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__ERP_QUOTE_LINE_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Net Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__NET_AMOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Payable Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__ERP_PAYABLE_LINE_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Line Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__LINE_AMOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Erp Rec Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__ERP_REC_LINE_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Settlements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__SETTLEMENTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Previous Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__PREVIOUS_AMOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Work Billing Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__WORK_BILLING_INFOS = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Market Factors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__MARKET_FACTORS = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Erp Payments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__ERP_PAYMENTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__KIND = CommonPackage.DOCUMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Gl Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__GL_DATE_TIME = CommonPackage.DOCUMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Container Erp Invoice Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__CONTAINER_ERP_INVOICE_LINE_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Erp Rec Delv Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__ERP_REC_DELV_LINE_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Gl Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__GL_ACCOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Bill Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__BILL_PERIOD = CommonPackage.DOCUMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__LINE_NUMBER = CommonPackage.DOCUMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>User Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__USER_ATTRIBUTES = CommonPackage.DOCUMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Line Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__LINE_VERSION = CommonPackage.DOCUMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Erp Invoice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__ERP_INVOICE = CommonPackage.DOCUMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Customer Billing Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__CUSTOMER_BILLING_INFOS = CommonPackage.DOCUMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Component Erp Invoice Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__COMPONENT_ERP_INVOICE_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Erp Journal Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM__ERP_JOURNAL_ENTRIES = CommonPackage.DOCUMENT_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>Erp Invoice Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 23;

	/**
	 * The number of operations of the '<em>Erp Invoice Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_LINE_ITEM_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpChartOfAccountsImpl <em>Erp Chart Of Accounts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpChartOfAccountsImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpChartOfAccounts()
	 * @generated
	 */
	int ERP_CHART_OF_ACCOUNTS = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The number of structural features of the '<em>Erp Chart Of Accounts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Erp Chart Of Accounts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_CHART_OF_ACCOUNTS_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpProjectAccountingImpl <em>Erp Project Accounting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpProjectAccountingImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpProjectAccounting()
	 * @generated
	 */
	int ERP_PROJECT_ACCOUNTING = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__PROJECTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Work Cost Details</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__WORK_COST_DETAILS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Time Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__ERP_TIME_ENTRIES = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Works</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING__WORKS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Erp Project Accounting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Erp Project Accounting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PROJECT_ACCOUNTING_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpReceiveDeliveryImpl <em>Erp Receive Delivery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpReceiveDeliveryImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpReceiveDelivery()
	 * @generated
	 */
	int ERP_RECEIVE_DELIVERY = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Erp Rec Delv Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY__ERP_REC_DELV_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erp Receive Delivery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Erp Receive Delivery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVE_DELIVERY_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpEngChangeOrderImpl <em>Erp Eng Change Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpEngChangeOrderImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpEngChangeOrder()
	 * @generated
	 */
	int ERP_ENG_CHANGE_ORDER = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The number of structural features of the '<em>Erp Eng Change Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Erp Eng Change Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ENG_CHANGE_ORDER_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpJournalImpl <em>Erp Journal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpJournalImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpJournal()
	 * @generated
	 */
	int ERP_JOURNAL = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Erp Journal Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL__ERP_JOURNAL_ENTRIES = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erp Journal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Erp Journal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpReqLineItemImpl <em>Erp Req Line Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpReqLineItemImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpReqLineItem()
	 * @generated
	 */
	int ERP_REQ_LINE_ITEM = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQ_LINE_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQ_LINE_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQ_LINE_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQ_LINE_ITEM__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQ_LINE_ITEM__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQ_LINE_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQ_LINE_ITEM__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQ_LINE_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQ_LINE_ITEM__DELIVERY_DATE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQ_LINE_ITEM__TYPE_MATERIAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Quote Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQ_LINE_ITEM__ERP_QUOTE_LINE_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQ_LINE_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQ_LINE_ITEM__QUANTITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Erp Requisition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQ_LINE_ITEM__ERP_REQUISITION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQ_LINE_ITEM__CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQ_LINE_ITEM__COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQ_LINE_ITEM__TYPE_ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Erp PO Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQ_LINE_ITEM__ERP_PO_LINE_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Erp Req Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQ_LINE_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Erp Req Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQ_LINE_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl <em>Erp Organisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpOrganisation()
	 * @generated
	 */
	int ERP_ORGANISATION = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__UUID = CommonPackage.ORGANISATION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__MRID = CommonPackage.ORGANISATION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__NAME = CommonPackage.ORGANISATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__DESCRIPTION = CommonPackage.ORGANISATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__PATH_NAME = CommonPackage.ORGANISATION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__MODELING_AUTHORITY_SET = CommonPackage.ORGANISATION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__LOCAL_NAME = CommonPackage.ORGANISATION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__ALIAS_NAME = CommonPackage.ORGANISATION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Street Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__STREET_ADDRESS = CommonPackage.ORGANISATION__STREET_ADDRESS;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__ELECTRONIC_ADDRESS = CommonPackage.ORGANISATION__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Postal Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__POSTAL_ADDRESS = CommonPackage.ORGANISATION__POSTAL_ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__PHONE1 = CommonPackage.ORGANISATION__PHONE1;

	/**
	 * The feature id for the '<em><b>Phone2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__PHONE2 = CommonPackage.ORGANISATION__PHONE2;

	/**
	 * The feature id for the '<em><b>Market Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__MARKET_ROLES = CommonPackage.ORGANISATION__MARKET_ROLES;

	/**
	 * The feature id for the '<em><b>Business Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__BUSINESS_ROLES = CommonPackage.ORGANISATION__BUSINESS_ROLES;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__CREWS = CommonPackage.ORGANISATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__REQUESTS = CommonPackage.ORGANISATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__MODE = CommonPackage.ORGANISATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Opt Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__OPT_OUT = CommonPackage.ORGANISATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Registered Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__REGISTERED_RESOURCES = CommonPackage.ORGANISATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.ORGANISATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Profit Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__IS_PROFIT_CENTER = CommonPackage.ORGANISATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Cost Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__IS_COST_CENTER = CommonPackage.ORGANISATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__DOCUMENT_ROLES = CommonPackage.ORGANISATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__ASSET_ROLES = CommonPackage.ORGANISATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Violation Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__VIOLATION_LIMITS = CommonPackage.ORGANISATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Parent Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__PARENT_ORGANISATION_ROLES = CommonPackage.ORGANISATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Land Property Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__LAND_PROPERTY_ROLES = CommonPackage.ORGANISATION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__ERP_PERSON_ROLES = CommonPackage.ORGANISATION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__CODE = CommonPackage.ORGANISATION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Child Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__CHILD_ORGANISATION_ROLES = CommonPackage.ORGANISATION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Industry ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__INDUSTRY_ID = CommonPackage.ORGANISATION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__CHANGE_ITEMS = CommonPackage.ORGANISATION_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__CATEGORY = CommonPackage.ORGANISATION_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__LOCATIONS = CommonPackage.ORGANISATION_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Int Sched Agreement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__INT_SCHED_AGREEMENT = CommonPackage.ORGANISATION_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__ACTIVITY_RECORDS = CommonPackage.ORGANISATION_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Government ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION__GOVERNMENT_ID = CommonPackage.ORGANISATION_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>Erp Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION_FEATURE_COUNT = CommonPackage.ORGANISATION_FEATURE_COUNT + 23;

	/**
	 * The number of operations of the '<em>Erp Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ORGANISATION_OPERATION_COUNT = CommonPackage.ORGANISATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.DocOrgRoleImpl <em>Doc Org Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.DocOrgRoleImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getDocOrgRole()
	 * @generated
	 */
	int DOC_ORG_ROLE = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ORG_ROLE__UUID = InfCommonPackage.ROLE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ORG_ROLE__MRID = InfCommonPackage.ROLE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ORG_ROLE__NAME = InfCommonPackage.ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ORG_ROLE__DESCRIPTION = InfCommonPackage.ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ORG_ROLE__PATH_NAME = InfCommonPackage.ROLE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ORG_ROLE__MODELING_AUTHORITY_SET = InfCommonPackage.ROLE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ORG_ROLE__LOCAL_NAME = InfCommonPackage.ROLE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ORG_ROLE__ALIAS_NAME = InfCommonPackage.ROLE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ORG_ROLE__STATUS = InfCommonPackage.ROLE__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ORG_ROLE__CATEGORY = InfCommonPackage.ROLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ORG_ROLE__DOCUMENT = InfCommonPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ORG_ROLE__ERP_ORGANISATION = InfCommonPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Doc Org Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ORG_ROLE_FEATURE_COUNT = InfCommonPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Doc Org Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ORG_ROLE_OPERATION_COUNT = InfCommonPackage.ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedgerEntryImpl <em>Erp Ledger Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedgerEntryImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpLedgerEntry()
	 * @generated
	 */
	int ERP_LEDGER_ENTRY = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_ENTRY__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_ENTRY__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_ENTRY__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_ENTRY__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_ENTRY__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_ENTRY__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_ENTRY__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_ENTRY__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Transaction Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_ENTRY__TRANSACTION_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_ENTRY__ACCOUNT_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Jounal Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_ENTRY__ERP_JOUNAL_ENTRY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Erp Ledger Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_ENTRY__ERP_LEDGER_ENTRY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_ENTRY__AMOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>User Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_ENTRY__USER_ATTRIBUTES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_ENTRY__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Settlements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_ENTRY__SETTLEMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Posted Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_ENTRY__POSTED_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Account Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_ENTRY__ACCOUNT_KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Erp Ledger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_ENTRY__ERP_LEDGER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Erp Ledger Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_ENTRY_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Erp Ledger Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_ENTRY_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpReceivableImpl <em>Erp Receivable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpReceivableImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpReceivable()
	 * @generated
	 */
	int ERP_RECEIVABLE = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Erp Rec Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE__ERP_REC_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erp Receivable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Erp Receivable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_RECEIVABLE_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl <em>Erp Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpPerson()
	 * @generated
	 */
	int ERP_PERSON = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Call Backs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__CALL_BACKS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__SERVICE_LOCATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__DOCUMENT_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__CATEGORY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__FIRST_NAME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Switching Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__SWITCHING_STEP_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__LAST_NAME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__CHANGE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>MName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__MNAME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__SKILLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__ELECTRONIC_ADDRESS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Government ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__GOVERNMENT_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Special Need</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__SPECIAL_NEED = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__ERP_ORGANISATION_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__PREFIX = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Labor Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__LABOR_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Crafts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__CRAFTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Mobile Phone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__MOBILE_PHONE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Erp Competency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__ERP_COMPETENCY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Land Property Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__LAND_PROPERTY_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Landline Phone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__LANDLINE_PHONE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Measurement Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__MEASUREMENT_VALUES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__ACTIVITY_RECORDS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__CREWS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Appointments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__APPOINTMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Erp Personnel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__ERP_PERSONNEL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__SUFFIX = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Customer Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON__CUSTOMER_DATA = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 28;

	/**
	 * The number of structural features of the '<em>Erp Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 29;

	/**
	 * The number of operations of the '<em>Erp Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PERSON_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.OrgErpPersonRoleImpl <em>Org Erp Person Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.OrgErpPersonRoleImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getOrgErpPersonRole()
	 * @generated
	 */
	int ORG_ERP_PERSON_ROLE = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ERP_PERSON_ROLE__UUID = InfCommonPackage.ROLE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ERP_PERSON_ROLE__MRID = InfCommonPackage.ROLE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ERP_PERSON_ROLE__NAME = InfCommonPackage.ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ERP_PERSON_ROLE__DESCRIPTION = InfCommonPackage.ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ERP_PERSON_ROLE__PATH_NAME = InfCommonPackage.ROLE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ERP_PERSON_ROLE__MODELING_AUTHORITY_SET = InfCommonPackage.ROLE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ERP_PERSON_ROLE__LOCAL_NAME = InfCommonPackage.ROLE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ERP_PERSON_ROLE__ALIAS_NAME = InfCommonPackage.ROLE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ERP_PERSON_ROLE__STATUS = InfCommonPackage.ROLE__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ERP_PERSON_ROLE__CATEGORY = InfCommonPackage.ROLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ERP_PERSON_ROLE__ERP_ORGANISATION = InfCommonPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Client ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ERP_PERSON_ROLE__CLIENT_ID = InfCommonPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ERP_PERSON_ROLE__ERP_PERSON = InfCommonPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Org Erp Person Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ERP_PERSON_ROLE_FEATURE_COUNT = InfCommonPackage.ROLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Org Erp Person Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ERP_PERSON_ROLE_OPERATION_COUNT = InfCommonPackage.ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpCompetencyImpl <em>Erp Competency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpCompetencyImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpCompetency()
	 * @generated
	 */
	int ERP_COMPETENCY = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_COMPETENCY__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_COMPETENCY__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_COMPETENCY__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_COMPETENCY__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_COMPETENCY__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_COMPETENCY__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_COMPETENCY__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_COMPETENCY__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Erp Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_COMPETENCY__ERP_PERSONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erp Competency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_COMPETENCY_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Erp Competency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_COMPETENCY_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedgerImpl <em>Erp Ledger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedgerImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpLedger()
	 * @generated
	 */
	int ERP_LEDGER = 16;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Erp Ledger Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER__ERP_LEDGER_ENTRIES = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erp Ledger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Erp Ledger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpSalesOrderImpl <em>Erp Sales Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpSalesOrderImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpSalesOrder()
	 * @generated
	 */
	int ERP_SALES_ORDER = 17;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The number of structural features of the '<em>Erp Sales Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Erp Sales Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SALES_ORDER_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpQuoteLineItemImpl <em>Erp Quote Line Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpQuoteLineItemImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpQuoteLineItem()
	 * @generated
	 */
	int ERP_QUOTE_LINE_ITEM = 18;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE_LINE_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE_LINE_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE_LINE_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE_LINE_ITEM__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE_LINE_ITEM__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE_LINE_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE_LINE_ITEM__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE_LINE_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE_LINE_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE_LINE_ITEM__REQUEST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Design</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE_LINE_ITEM__DESIGN = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Erp Invoice Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE_LINE_ITEM__ERP_INVOICE_LINE_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Erp Req Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE_LINE_ITEM__ERP_REQ_LINE_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Erp Quote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE_LINE_ITEM__ERP_QUOTE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Asset Model Catalogue Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Erp Quote Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE_LINE_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Erp Quote Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE_LINE_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPurchaseOrderImpl <em>Erp Purchase Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPurchaseOrderImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpPurchaseOrder()
	 * @generated
	 */
	int ERP_PURCHASE_ORDER = 19;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Erp PO Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER__ERP_PO_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erp Purchase Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Erp Purchase Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PURCHASE_ORDER_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPayableLineItemImpl <em>Erp Payable Line Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPayableLineItemImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpPayableLineItem()
	 * @generated
	 */
	int ERP_PAYABLE_LINE_ITEM = 20;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE_LINE_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE_LINE_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE_LINE_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE_LINE_ITEM__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE_LINE_ITEM__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE_LINE_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE_LINE_ITEM__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE_LINE_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Erp Invoice Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE_LINE_ITEM__ERP_INVOICE_LINE_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Payments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE_LINE_ITEM__ERP_PAYMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Payable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE_LINE_ITEM__ERP_PAYABLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Erp Journal Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE_LINE_ITEM__ERP_JOURNAL_ENTRIES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE_LINE_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Erp Payable Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE_LINE_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Erp Payable Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE_LINE_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedgerBudgetImpl <em>Erp Ledger Budget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedgerBudgetImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpLedgerBudget()
	 * @generated
	 */
	int ERP_LEDGER_BUDGET = 21;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Erp Led Bud Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET__ERP_LED_BUD_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erp Ledger Budget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Erp Ledger Budget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LEDGER_BUDGET_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpBomItemDataImpl <em>Erp Bom Item Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpBomItemDataImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpBomItemData()
	 * @generated
	 */
	int ERP_BOM_ITEM_DATA = 22;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM_ITEM_DATA__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM_ITEM_DATA__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM_ITEM_DATA__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM_ITEM_DATA__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM_ITEM_DATA__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM_ITEM_DATA__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM_ITEM_DATA__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM_ITEM_DATA__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Design Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM_ITEM_DATA__DESIGN_LOCATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp BOM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM_ITEM_DATA__ERP_BOM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM_ITEM_DATA__TYPE_ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Erp Bom Item Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM_ITEM_DATA_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Erp Bom Item Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM_ITEM_DATA_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpInventoryImpl <em>Erp Inventory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpInventoryImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpInventory()
	 * @generated
	 */
	int ERP_INVENTORY = 23;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVENTORY__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVENTORY__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVENTORY__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVENTORY__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVENTORY__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVENTORY__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVENTORY__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVENTORY__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVENTORY__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVENTORY__ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Erp Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVENTORY_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Erp Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVENTORY_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.DocErpPersonRoleImpl <em>Doc Erp Person Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.DocErpPersonRoleImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getDocErpPersonRole()
	 * @generated
	 */
	int DOC_ERP_PERSON_ROLE = 24;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ERP_PERSON_ROLE__UUID = InfCommonPackage.ROLE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ERP_PERSON_ROLE__MRID = InfCommonPackage.ROLE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ERP_PERSON_ROLE__NAME = InfCommonPackage.ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ERP_PERSON_ROLE__DESCRIPTION = InfCommonPackage.ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ERP_PERSON_ROLE__PATH_NAME = InfCommonPackage.ROLE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ERP_PERSON_ROLE__MODELING_AUTHORITY_SET = InfCommonPackage.ROLE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ERP_PERSON_ROLE__LOCAL_NAME = InfCommonPackage.ROLE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ERP_PERSON_ROLE__ALIAS_NAME = InfCommonPackage.ROLE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ERP_PERSON_ROLE__STATUS = InfCommonPackage.ROLE__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ERP_PERSON_ROLE__CATEGORY = InfCommonPackage.ROLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ERP_PERSON_ROLE__ERP_PERSON = InfCommonPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ERP_PERSON_ROLE__DOCUMENT = InfCommonPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Doc Erp Person Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ERP_PERSON_ROLE_FEATURE_COUNT = InfCommonPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Doc Erp Person Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ERP_PERSON_ROLE_OPERATION_COUNT = InfCommonPackage.ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpItemMasterImpl <em>Erp Item Master</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpItemMasterImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpItemMaster()
	 * @generated
	 */
	int ERP_ITEM_MASTER = 25;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ITEM_MASTER__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ITEM_MASTER__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ITEM_MASTER__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ITEM_MASTER__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ITEM_MASTER__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ITEM_MASTER__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ITEM_MASTER__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ITEM_MASTER__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ITEM_MASTER__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ITEM_MASTER__ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Erp Item Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ITEM_MASTER_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Erp Item Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ITEM_MASTER_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpBankAccountImpl <em>Erp Bank Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpBankAccountImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpBankAccount()
	 * @generated
	 */
	int ERP_BANK_ACCOUNT = 26;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__UUID = InfCommonPackage.BANK_ACCOUNT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__MRID = InfCommonPackage.BANK_ACCOUNT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__NAME = InfCommonPackage.BANK_ACCOUNT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__DESCRIPTION = InfCommonPackage.BANK_ACCOUNT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__PATH_NAME = InfCommonPackage.BANK_ACCOUNT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__MODELING_AUTHORITY_SET = InfCommonPackage.BANK_ACCOUNT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__LOCAL_NAME = InfCommonPackage.BANK_ACCOUNT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__ALIAS_NAME = InfCommonPackage.BANK_ACCOUNT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__SUBJECT = InfCommonPackage.BANK_ACCOUNT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__SCHEDULED_EVENTS = InfCommonPackage.BANK_ACCOUNT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__ERP_ORGANISATION_ROLES = InfCommonPackage.BANK_ACCOUNT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__CREATED_DATE_TIME = InfCommonPackage.BANK_ACCOUNT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__TO_DOCUMENT_ROLES = InfCommonPackage.BANK_ACCOUNT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__ASSET_ROLES = InfCommonPackage.BANK_ACCOUNT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__ERP_PERSON_ROLES = InfCommonPackage.BANK_ACCOUNT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__REVISION_NUMBER = InfCommonPackage.BANK_ACCOUNT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__ELECTRONIC_ADDRESS = InfCommonPackage.BANK_ACCOUNT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__STATUS = InfCommonPackage.BANK_ACCOUNT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__NETWORK_DATA_SETS = InfCommonPackage.BANK_ACCOUNT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__POWER_SYSTEM_RESOURCE_ROLES = InfCommonPackage.BANK_ACCOUNT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__CATEGORY = InfCommonPackage.BANK_ACCOUNT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__ACTIVITY_RECORDS = InfCommonPackage.BANK_ACCOUNT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__MEASUREMENTS = InfCommonPackage.BANK_ACCOUNT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__FROM_DOCUMENT_ROLES = InfCommonPackage.BANK_ACCOUNT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__LAST_MODIFIED_DATE_TIME = InfCommonPackage.BANK_ACCOUNT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__CHANGE_SETS = InfCommonPackage.BANK_ACCOUNT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__DOC_STATUS = InfCommonPackage.BANK_ACCOUNT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__CHANGE_ITEMS = InfCommonPackage.BANK_ACCOUNT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__SCHEDULE_PARAMETER_INFOS = InfCommonPackage.BANK_ACCOUNT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__TITLE = InfCommonPackage.BANK_ACCOUNT__TITLE;

	/**
	 * The feature id for the '<em><b>Account Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__ACCOUNT_NUMBER = InfCommonPackage.BANK_ACCOUNT__ACCOUNT_NUMBER;

	/**
	 * The feature id for the '<em><b>Bank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__BANK = InfCommonPackage.BANK_ACCOUNT__BANK;

	/**
	 * The feature id for the '<em><b>Service Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__SERVICE_SUPPLIER = InfCommonPackage.BANK_ACCOUNT__SERVICE_SUPPLIER;

	/**
	 * The feature id for the '<em><b>Bank Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__BANK_STATEMENTS = InfCommonPackage.BANK_ACCOUNT__BANK_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Bank ABA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT__BANK_ABA = InfCommonPackage.BANK_ACCOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erp Bank Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT_FEATURE_COUNT = InfCommonPackage.BANK_ACCOUNT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Erp Bank Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BANK_ACCOUNT_OPERATION_COUNT = InfCommonPackage.BANK_ACCOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpRecDelvLineItemImpl <em>Erp Rec Delv Line Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpRecDelvLineItemImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpRecDelvLineItem()
	 * @generated
	 */
	int ERP_REC_DELV_LINE_ITEM = 27;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_DELV_LINE_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_DELV_LINE_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_DELV_LINE_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_DELV_LINE_ITEM__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_DELV_LINE_ITEM__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_DELV_LINE_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_DELV_LINE_ITEM__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_DELV_LINE_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Erp PO Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_DELV_LINE_ITEM__ERP_PO_LINE_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Invoice Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_DELV_LINE_ITEM__ERP_INVOICE_LINE_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_DELV_LINE_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Erp Receive Delivery</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_DELV_LINE_ITEM__ERP_RECEIVE_DELIVERY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Material Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_DELV_LINE_ITEM__MATERIAL_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_DELV_LINE_ITEM__ASSETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Erp Rec Delv Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_DELV_LINE_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Erp Rec Delv Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_DELV_LINE_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.OrgOrgRoleImpl <em>Org Org Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.OrgOrgRoleImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getOrgOrgRole()
	 * @generated
	 */
	int ORG_ORG_ROLE = 28;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ORG_ROLE__UUID = InfCommonPackage.ROLE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ORG_ROLE__MRID = InfCommonPackage.ROLE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ORG_ROLE__NAME = InfCommonPackage.ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ORG_ROLE__DESCRIPTION = InfCommonPackage.ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ORG_ROLE__PATH_NAME = InfCommonPackage.ROLE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ORG_ROLE__MODELING_AUTHORITY_SET = InfCommonPackage.ROLE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ORG_ROLE__LOCAL_NAME = InfCommonPackage.ROLE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ORG_ROLE__ALIAS_NAME = InfCommonPackage.ROLE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ORG_ROLE__STATUS = InfCommonPackage.ROLE__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ORG_ROLE__CATEGORY = InfCommonPackage.ROLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Client ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ORG_ROLE__CLIENT_ID = InfCommonPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ORG_ROLE__CHILD_ORGANISATION = InfCommonPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ORG_ROLE__PARENT_ORGANISATION = InfCommonPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Org Org Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ORG_ROLE_FEATURE_COUNT = InfCommonPackage.ROLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Org Org Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_ORG_ROLE_OPERATION_COUNT = InfCommonPackage.ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpSiteLevelDataImpl <em>Erp Site Level Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpSiteLevelDataImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpSiteLevelData()
	 * @generated
	 */
	int ERP_SITE_LEVEL_DATA = 29;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SITE_LEVEL_DATA__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SITE_LEVEL_DATA__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SITE_LEVEL_DATA__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SITE_LEVEL_DATA__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SITE_LEVEL_DATA__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SITE_LEVEL_DATA__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SITE_LEVEL_DATA__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SITE_LEVEL_DATA__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Land Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SITE_LEVEL_DATA__LAND_PROPERTY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SITE_LEVEL_DATA__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Erp Site Level Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SITE_LEVEL_DATA_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Erp Site Level Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_SITE_LEVEL_DATA_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPOLineItemImpl <em>Erp PO Line Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPOLineItemImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpPOLineItem()
	 * @generated
	 */
	int ERP_PO_LINE_ITEM = 30;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Erp Purchase Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__ERP_PURCHASE_ORDER = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Material Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__MATERIAL_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Req Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__ERP_REQ_LINE_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Asset Model Catalogue Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Erp Rec Del Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM__ERP_REC_DEL_LINE_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Erp PO Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Erp PO Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PO_LINE_ITEM_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpIssueInventoryImpl <em>Erp Issue Inventory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpIssueInventoryImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpIssueInventory()
	 * @generated
	 */
	int ERP_ISSUE_INVENTORY = 31;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ISSUE_INVENTORY__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ISSUE_INVENTORY__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ISSUE_INVENTORY__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ISSUE_INVENTORY__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ISSUE_INVENTORY__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ISSUE_INVENTORY__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ISSUE_INVENTORY__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ISSUE_INVENTORY__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ISSUE_INVENTORY__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ISSUE_INVENTORY__TYPE_MATERIAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ISSUE_INVENTORY__TYPE_ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Erp Issue Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ISSUE_INVENTORY_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Erp Issue Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_ISSUE_INVENTORY_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPaymentImpl <em>Erp Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPaymentImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpPayment()
	 * @generated
	 */
	int ERP_PAYMENT = 32;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Erp Payable Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__ERP_PAYABLE_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Invoice Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__ERP_INVOICE_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Terms Payment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__TERMS_PAYMENT = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Erp Rec Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT__ERP_REC_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Erp Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Erp Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYMENT_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpQuoteImpl <em>Erp Quote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpQuoteImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpQuote()
	 * @generated
	 */
	int ERP_QUOTE = 33;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Erp Quote Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE__ERP_QUOTE_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erp Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Erp Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_QUOTE_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPayableImpl <em>Erp Payable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPayableImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpPayable()
	 * @generated
	 */
	int ERP_PAYABLE = 34;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Contractor Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__CONTRACTOR_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Payable Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE__ERP_PAYABLE_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Erp Payable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Erp Payable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_PAYABLE_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpRequisitionImpl <em>Erp Requisition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpRequisitionImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpRequisition()
	 * @generated
	 */
	int ERP_REQUISITION = 35;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Erp Req Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION__ERP_REQ_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erp Requisition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Erp Requisition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REQUISITION_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedBudLineItemImpl <em>Erp Led Bud Line Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedBudLineItemImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpLedBudLineItem()
	 * @generated
	 */
	int ERP_LED_BUD_LINE_ITEM = 36;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LED_BUD_LINE_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LED_BUD_LINE_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LED_BUD_LINE_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LED_BUD_LINE_ITEM__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LED_BUD_LINE_ITEM__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LED_BUD_LINE_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LED_BUD_LINE_ITEM__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LED_BUD_LINE_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Erp Ledger Budget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LED_BUD_LINE_ITEM__ERP_LEDGER_BUDGET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LED_BUD_LINE_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Led Bud Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LED_BUD_LINE_ITEM__ERP_LED_BUD_LINE_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Erp Led Bud Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LED_BUD_LINE_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Erp Led Bud Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_LED_BUD_LINE_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceImpl <em>Erp Invoice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpInvoice()
	 * @generated
	 */
	int ERP_INVOICE = 37;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__AMOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__KIND = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transaction Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__TRANSACTION_DATE_TIME = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__REFERENCE_NUMBER = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__DUE_DATE = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mailed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__MAILED_DATE = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Transfer Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__TRANSFER_TYPE = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Customer Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__CUSTOMER_ACCOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pro Forma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__PRO_FORMA = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Bill Media Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__BILL_MEDIA_KIND = CommonPackage.DOCUMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Erp Invoice Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE__ERP_INVOICE_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Erp Invoice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Erp Invoice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_INVOICE_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpTimeEntryImpl <em>Erp Time Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpTimeEntryImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpTimeEntry()
	 * @generated
	 */
	int ERP_TIME_ENTRY = 38;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_ENTRY__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_ENTRY__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_ENTRY__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_ENTRY__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_ENTRY__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_ENTRY__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_ENTRY__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_ENTRY__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Erp Project Accounting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_ENTRY__ERP_PROJECT_ACCOUNTING = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_ENTRY__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Time Sheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_ENTRY__ERP_TIME_SHEET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Erp Time Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_ENTRY_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Erp Time Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_ENTRY_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpBOMImpl <em>Erp BOM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpBOMImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpBOM()
	 * @generated
	 */
	int ERP_BOM = 39;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Erp Bom Item Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__ERP_BOM_ITEM_DATAS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Design</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM__DESIGN = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Erp BOM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Erp BOM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_BOM_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpJournalEntryImpl <em>Erp Journal Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpJournalEntryImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpJournalEntry()
	 * @generated
	 */
	int ERP_JOURNAL_ENTRY = 40;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL_ENTRY__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL_ENTRY__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL_ENTRY__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL_ENTRY__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL_ENTRY__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL_ENTRY__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL_ENTRY__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL_ENTRY__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL_ENTRY__ACCOUNT_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Ledger Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL_ENTRY__ERP_LEDGER_ENTRY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Journal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL_ENTRY__ERP_JOURNAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL_ENTRY__AMOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL_ENTRY__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Posting Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL_ENTRY__POSTING_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Transaction Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL_ENTRY__TRANSACTION_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cost Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL_ENTRY__COST_TYPES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Erp Invoice Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL_ENTRY__ERP_INVOICE_LINE_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Erp Payable Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL_ENTRY__ERP_PAYABLE_LINE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Erp Rec Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL_ENTRY__ERP_REC_LINE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL_ENTRY__SOURCE_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Erp Journal Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL_ENTRY_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Erp Journal Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_JOURNAL_ENTRY_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpRecLineItemImpl <em>Erp Rec Line Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpRecLineItemImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpRecLineItem()
	 * @generated
	 */
	int ERP_REC_LINE_ITEM = 41;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_LINE_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_LINE_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_LINE_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_LINE_ITEM__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_LINE_ITEM__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_LINE_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_LINE_ITEM__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_LINE_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_LINE_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Journal Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_LINE_ITEM__ERP_JOURNAL_ENTRIES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Receivable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_LINE_ITEM__ERP_RECEIVABLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Erp Invoice Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_LINE_ITEM__ERP_INVOICE_LINE_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Erp Payments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_LINE_ITEM__ERP_PAYMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Erp Rec Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_LINE_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Erp Rec Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_REC_LINE_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpTimeSheetImpl <em>Erp Time Sheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpTimeSheetImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpTimeSheet()
	 * @generated
	 */
	int ERP_TIME_SHEET = 42;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Erp Time Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET__ERP_TIME_ENTRIES = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erp Time Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Erp Time Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_TIME_SHEET_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItemKind <em>Erp Invoice Line Item Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItemKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpInvoiceLineItemKind()
	 * @generated
	 */
	int ERP_INVOICE_LINE_ITEM_KIND = 43;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpAccountKind <em>Erp Account Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpAccountKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpAccountKind()
	 * @generated
	 */
	int ERP_ACCOUNT_KIND = 44;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceKind <em>Erp Invoice Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpInvoiceKind()
	 * @generated
	 */
	int ERP_INVOICE_KIND = 45;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.BillMediaKind <em>Bill Media Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.BillMediaKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getBillMediaKind()
	 * @generated
	 */
	int BILL_MEDIA_KIND = 46;


	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInventoryCount <em>Erp Inventory Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Inventory Count</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInventoryCount
	 * @generated
	 */
	EClass getErpInventoryCount();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getStatus()
	 * @see #getErpInventoryCount()
	 * @generated
	 */
	EReference getErpInventoryCount_Status();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getMaterialItem <em>Material Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Material Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getMaterialItem()
	 * @see #getErpInventoryCount()
	 * @generated
	 */
	EReference getErpInventoryCount_MaterialItem();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getAssetModel <em>Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset Model</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getAssetModel()
	 * @see #getErpInventoryCount()
	 * @generated
	 */
	EReference getErpInventoryCount_AssetModel();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPersonnel <em>Erp Personnel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Personnel</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPersonnel
	 * @generated
	 */
	EClass getErpPersonnel();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPersonnel#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPersonnel#getStatus()
	 * @see #getErpPersonnel()
	 * @generated
	 */
	EReference getErpPersonnel_Status();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPersonnel#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Persons</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPersonnel#getErpPersons()
	 * @see #getErpPersonnel()
	 * @generated
	 */
	EReference getErpPersonnel_ErpPersons();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem <em>Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Invoice Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem
	 * @generated
	 */
	EClass getErpInvoiceLineItem();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpQuoteLineItem <em>Erp Quote Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Quote Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpQuoteLineItem()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	EReference getErpInvoiceLineItem_ErpQuoteLineItem();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getNetAmount <em>Net Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net Amount</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getNetAmount()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	EAttribute getErpInvoiceLineItem_NetAmount();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpPayableLineItem <em>Erp Payable Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Payable Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpPayableLineItem()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	EReference getErpInvoiceLineItem_ErpPayableLineItem();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineAmount <em>Line Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Amount</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineAmount()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	EAttribute getErpInvoiceLineItem_LineAmount();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpRecLineItem <em>Erp Rec Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Rec Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpRecLineItem()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	EReference getErpInvoiceLineItem_ErpRecLineItem();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getSettlements <em>Settlements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Settlements</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getSettlements()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	EReference getErpInvoiceLineItem_Settlements();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getPreviousAmount <em>Previous Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Amount</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getPreviousAmount()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	EAttribute getErpInvoiceLineItem_PreviousAmount();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getWorkBillingInfos <em>Work Billing Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Billing Infos</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getWorkBillingInfos()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	EReference getErpInvoiceLineItem_WorkBillingInfos();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getMarketFactors <em>Market Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Market Factors</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getMarketFactors()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	EReference getErpInvoiceLineItem_MarketFactors();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpPayments <em>Erp Payments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Payments</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpPayments()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	EReference getErpInvoiceLineItem_ErpPayments();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getKind()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	EAttribute getErpInvoiceLineItem_Kind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getGlDateTime <em>Gl Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gl Date Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getGlDateTime()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	EAttribute getErpInvoiceLineItem_GlDateTime();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getContainerErpInvoiceLineItem <em>Container Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container Erp Invoice Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getContainerErpInvoiceLineItem()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	EReference getErpInvoiceLineItem_ContainerErpInvoiceLineItem();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpRecDelvLineItem <em>Erp Rec Delv Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Rec Delv Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpRecDelvLineItem()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	EReference getErpInvoiceLineItem_ErpRecDelvLineItem();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getGlAccount <em>Gl Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gl Account</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getGlAccount()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	EAttribute getErpInvoiceLineItem_GlAccount();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getBillPeriod <em>Bill Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bill Period</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getBillPeriod()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	EReference getErpInvoiceLineItem_BillPeriod();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineNumber <em>Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Number</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineNumber()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	EAttribute getErpInvoiceLineItem_LineNumber();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getUserAttributes <em>User Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User Attributes</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getUserAttributes()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	EReference getErpInvoiceLineItem_UserAttributes();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineVersion <em>Line Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Version</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineVersion()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	EAttribute getErpInvoiceLineItem_LineVersion();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpInvoice <em>Erp Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Invoice</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpInvoice()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	EReference getErpInvoiceLineItem_ErpInvoice();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getCustomerBillingInfos <em>Customer Billing Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer Billing Infos</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getCustomerBillingInfos()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	EReference getErpInvoiceLineItem_CustomerBillingInfos();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getComponentErpInvoiceLineItems <em>Component Erp Invoice Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component Erp Invoice Line Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getComponentErpInvoiceLineItems()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	EReference getErpInvoiceLineItem_ComponentErpInvoiceLineItems();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpJournalEntries <em>Erp Journal Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Journal Entries</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpJournalEntries()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	EReference getErpInvoiceLineItem_ErpJournalEntries();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpChartOfAccounts <em>Erp Chart Of Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Chart Of Accounts</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpChartOfAccounts
	 * @generated
	 */
	EClass getErpChartOfAccounts();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting <em>Erp Project Accounting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Project Accounting</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting
	 * @generated
	 */
	EClass getErpProjectAccounting();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Projects</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getProjects()
	 * @see #getErpProjectAccounting()
	 * @generated
	 */
	EReference getErpProjectAccounting_Projects();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Cost Details</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getWorkCostDetails()
	 * @see #getErpProjectAccounting()
	 * @generated
	 */
	EReference getErpProjectAccounting_WorkCostDetails();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getErpTimeEntries <em>Erp Time Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Time Entries</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getErpTimeEntries()
	 * @see #getErpProjectAccounting()
	 * @generated
	 */
	EReference getErpProjectAccounting_ErpTimeEntries();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Works</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getWorks()
	 * @see #getErpProjectAccounting()
	 * @generated
	 */
	EReference getErpProjectAccounting_Works();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReceiveDelivery <em>Erp Receive Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Receive Delivery</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReceiveDelivery
	 * @generated
	 */
	EClass getErpReceiveDelivery();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReceiveDelivery#getErpRecDelvLineItems <em>Erp Rec Delv Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Rec Delv Line Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReceiveDelivery#getErpRecDelvLineItems()
	 * @see #getErpReceiveDelivery()
	 * @generated
	 */
	EReference getErpReceiveDelivery_ErpRecDelvLineItems();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpEngChangeOrder <em>Erp Eng Change Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Eng Change Order</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpEngChangeOrder
	 * @generated
	 */
	EClass getErpEngChangeOrder();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournal <em>Erp Journal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Journal</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournal
	 * @generated
	 */
	EClass getErpJournal();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournal#getErpJournalEntries <em>Erp Journal Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Journal Entries</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournal#getErpJournalEntries()
	 * @see #getErpJournal()
	 * @generated
	 */
	EReference getErpJournal_ErpJournalEntries();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem <em>Erp Req Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Req Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem
	 * @generated
	 */
	EClass getErpReqLineItem();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getDeliveryDate <em>Delivery Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Date</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getDeliveryDate()
	 * @see #getErpReqLineItem()
	 * @generated
	 */
	EAttribute getErpReqLineItem_DeliveryDate();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getTypeMaterial <em>Type Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Material</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getTypeMaterial()
	 * @see #getErpReqLineItem()
	 * @generated
	 */
	EReference getErpReqLineItem_TypeMaterial();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpQuoteLineItem <em>Erp Quote Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Quote Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpQuoteLineItem()
	 * @see #getErpReqLineItem()
	 * @generated
	 */
	EReference getErpReqLineItem_ErpQuoteLineItem();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getStatus()
	 * @see #getErpReqLineItem()
	 * @generated
	 */
	EReference getErpReqLineItem_Status();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getQuantity()
	 * @see #getErpReqLineItem()
	 * @generated
	 */
	EAttribute getErpReqLineItem_Quantity();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpRequisition <em>Erp Requisition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Requisition</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpRequisition()
	 * @see #getErpReqLineItem()
	 * @generated
	 */
	EReference getErpReqLineItem_ErpRequisition();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getCode()
	 * @see #getErpReqLineItem()
	 * @generated
	 */
	EAttribute getErpReqLineItem_Code();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getCost()
	 * @see #getErpReqLineItem()
	 * @generated
	 */
	EAttribute getErpReqLineItem_Cost();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getTypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Asset</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getTypeAsset()
	 * @see #getErpReqLineItem()
	 * @generated
	 */
	EReference getErpReqLineItem_TypeAsset();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpPOLineItem <em>Erp PO Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp PO Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpPOLineItem()
	 * @see #getErpReqLineItem()
	 * @generated
	 */
	EReference getErpReqLineItem_ErpPOLineItem();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation <em>Erp Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Organisation</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation
	 * @generated
	 */
	EClass getErpOrganisation();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crews</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCrews()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	EReference getErpOrganisation_Crews();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getRequests <em>Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requests</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getRequests()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	EReference getErpOrganisation_Requests();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getMode()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	EAttribute getErpOrganisation_Mode();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#isOptOut <em>Opt Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opt Out</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#isOptOut()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	EAttribute getErpOrganisation_OptOut();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getRegisteredResources <em>Registered Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Registered Resources</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getRegisteredResources()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	EReference getErpOrganisation_RegisteredResources();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getPowerSystemResourceRoles <em>Power System Resource Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power System Resource Roles</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getPowerSystemResourceRoles()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	EReference getErpOrganisation_PowerSystemResourceRoles();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#isIsProfitCenter <em>Is Profit Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Profit Center</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#isIsProfitCenter()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	EAttribute getErpOrganisation_IsProfitCenter();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#isIsCostCenter <em>Is Cost Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Cost Center</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#isIsCostCenter()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	EAttribute getErpOrganisation_IsCostCenter();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getDocumentRoles <em>Document Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Document Roles</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getDocumentRoles()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	EReference getErpOrganisation_DocumentRoles();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getAssetRoles <em>Asset Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asset Roles</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getAssetRoles()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	EReference getErpOrganisation_AssetRoles();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getViolationLimits <em>Violation Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Violation Limits</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getViolationLimits()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	EReference getErpOrganisation_ViolationLimits();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getParentOrganisationRoles <em>Parent Organisation Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Organisation Roles</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getParentOrganisationRoles()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	EReference getErpOrganisation_ParentOrganisationRoles();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getLandPropertyRoles <em>Land Property Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Land Property Roles</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getLandPropertyRoles()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	EReference getErpOrganisation_LandPropertyRoles();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getErpPersonRoles <em>Erp Person Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Person Roles</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getErpPersonRoles()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	EReference getErpOrganisation_ErpPersonRoles();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCode()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	EAttribute getErpOrganisation_Code();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getChildOrganisationRoles <em>Child Organisation Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Organisation Roles</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getChildOrganisationRoles()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	EReference getErpOrganisation_ChildOrganisationRoles();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getIndustryID <em>Industry ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Industry ID</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getIndustryID()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	EAttribute getErpOrganisation_IndustryID();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Change Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getChangeItems()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	EReference getErpOrganisation_ChangeItems();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCategory()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	EAttribute getErpOrganisation_Category();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getLocations()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	EReference getErpOrganisation_Locations();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getIntSchedAgreement <em>Int Sched Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Int Sched Agreement</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getIntSchedAgreement()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	EReference getErpOrganisation_IntSchedAgreement();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getActivityRecords <em>Activity Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Records</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getActivityRecords()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	EReference getErpOrganisation_ActivityRecords();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getGovernmentID <em>Government ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Government ID</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getGovernmentID()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	EAttribute getErpOrganisation_GovernmentID();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.DocOrgRole <em>Doc Org Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc Org Role</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.DocOrgRole
	 * @generated
	 */
	EClass getDocOrgRole();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.DocOrgRole#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.DocOrgRole#getDocument()
	 * @see #getDocOrgRole()
	 * @generated
	 */
	EReference getDocOrgRole_Document();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.DocOrgRole#getErpOrganisation <em>Erp Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Organisation</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.DocOrgRole#getErpOrganisation()
	 * @see #getDocOrgRole()
	 * @generated
	 */
	EReference getDocOrgRole_ErpOrganisation();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry <em>Erp Ledger Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Ledger Entry</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry
	 * @generated
	 */
	EClass getErpLedgerEntry();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getTransactionDateTime <em>Transaction Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Date Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getTransactionDateTime()
	 * @see #getErpLedgerEntry()
	 * @generated
	 */
	EAttribute getErpLedgerEntry_TransactionDateTime();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAccountID <em>Account ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account ID</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAccountID()
	 * @see #getErpLedgerEntry()
	 * @generated
	 */
	EAttribute getErpLedgerEntry_AccountID();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpJounalEntry <em>Erp Jounal Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Jounal Entry</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpJounalEntry()
	 * @see #getErpLedgerEntry()
	 * @generated
	 */
	EReference getErpLedgerEntry_ErpJounalEntry();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpLedgerEntry <em>Erp Ledger Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Ledger Entry</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpLedgerEntry()
	 * @see #getErpLedgerEntry()
	 * @generated
	 */
	EReference getErpLedgerEntry_ErpLedgerEntry();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAmount()
	 * @see #getErpLedgerEntry()
	 * @generated
	 */
	EAttribute getErpLedgerEntry_Amount();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getUserAttributes <em>User Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User Attributes</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getUserAttributes()
	 * @see #getErpLedgerEntry()
	 * @generated
	 */
	EReference getErpLedgerEntry_UserAttributes();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getStatus()
	 * @see #getErpLedgerEntry()
	 * @generated
	 */
	EReference getErpLedgerEntry_Status();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getSettlements <em>Settlements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Settlements</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getSettlements()
	 * @see #getErpLedgerEntry()
	 * @generated
	 */
	EReference getErpLedgerEntry_Settlements();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getPostedDateTime <em>Posted Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posted Date Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getPostedDateTime()
	 * @see #getErpLedgerEntry()
	 * @generated
	 */
	EAttribute getErpLedgerEntry_PostedDateTime();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAccountKind <em>Account Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAccountKind()
	 * @see #getErpLedgerEntry()
	 * @generated
	 */
	EAttribute getErpLedgerEntry_AccountKind();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpLedger <em>Erp Ledger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Ledger</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpLedger()
	 * @see #getErpLedgerEntry()
	 * @generated
	 */
	EReference getErpLedgerEntry_ErpLedger();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReceivable <em>Erp Receivable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Receivable</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReceivable
	 * @generated
	 */
	EClass getErpReceivable();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReceivable#getErpRecLineItems <em>Erp Rec Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Rec Line Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReceivable#getErpRecLineItems()
	 * @see #getErpReceivable()
	 * @generated
	 */
	EReference getErpReceivable_ErpRecLineItems();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Person</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson
	 * @generated
	 */
	EClass getErpPerson();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getCallBacks <em>Call Backs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Call Backs</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getCallBacks()
	 * @see #getErpPerson()
	 * @generated
	 */
	EReference getErpPerson_CallBacks();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getServiceLocation <em>Service Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Location</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getServiceLocation()
	 * @see #getErpPerson()
	 * @generated
	 */
	EReference getErpPerson_ServiceLocation();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getDocumentRoles <em>Document Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Document Roles</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getDocumentRoles()
	 * @see #getErpPerson()
	 * @generated
	 */
	EReference getErpPerson_DocumentRoles();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getCategory()
	 * @see #getErpPerson()
	 * @generated
	 */
	EAttribute getErpPerson_Category();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getFirstName()
	 * @see #getErpPerson()
	 * @generated
	 */
	EAttribute getErpPerson_FirstName();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getSwitchingStepRoles <em>Switching Step Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switching Step Roles</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getSwitchingStepRoles()
	 * @see #getErpPerson()
	 * @generated
	 */
	EReference getErpPerson_SwitchingStepRoles();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getLastName()
	 * @see #getErpPerson()
	 * @generated
	 */
	EAttribute getErpPerson_LastName();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Change Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getChangeItems()
	 * @see #getErpPerson()
	 * @generated
	 */
	EReference getErpPerson_ChangeItems();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getMName <em>MName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MName</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getMName()
	 * @see #getErpPerson()
	 * @generated
	 */
	EAttribute getErpPerson_MName();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Skills</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getSkills()
	 * @see #getErpPerson()
	 * @generated
	 */
	EReference getErpPerson_Skills();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getElectronicAddress <em>Electronic Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Electronic Address</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getElectronicAddress()
	 * @see #getErpPerson()
	 * @generated
	 */
	EReference getErpPerson_ElectronicAddress();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getGovernmentID <em>Government ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Government ID</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getGovernmentID()
	 * @see #getErpPerson()
	 * @generated
	 */
	EAttribute getErpPerson_GovernmentID();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getSpecialNeed <em>Special Need</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special Need</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getSpecialNeed()
	 * @see #getErpPerson()
	 * @generated
	 */
	EAttribute getErpPerson_SpecialNeed();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getErpOrganisationRoles <em>Erp Organisation Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Organisation Roles</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getErpOrganisationRoles()
	 * @see #getErpPerson()
	 * @generated
	 */
	EReference getErpPerson_ErpOrganisationRoles();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getStatus()
	 * @see #getErpPerson()
	 * @generated
	 */
	EReference getErpPerson_Status();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getPrefix()
	 * @see #getErpPerson()
	 * @generated
	 */
	EAttribute getErpPerson_Prefix();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getLaborItems <em>Labor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Labor Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getLaborItems()
	 * @see #getErpPerson()
	 * @generated
	 */
	EReference getErpPerson_LaborItems();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getCrafts <em>Crafts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crafts</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getCrafts()
	 * @see #getErpPerson()
	 * @generated
	 */
	EReference getErpPerson_Crafts();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getMobilePhone <em>Mobile Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mobile Phone</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getMobilePhone()
	 * @see #getErpPerson()
	 * @generated
	 */
	EReference getErpPerson_MobilePhone();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getErpCompetency <em>Erp Competency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Competency</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getErpCompetency()
	 * @see #getErpPerson()
	 * @generated
	 */
	EReference getErpPerson_ErpCompetency();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getLandPropertyRoles <em>Land Property Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Land Property Roles</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getLandPropertyRoles()
	 * @see #getErpPerson()
	 * @generated
	 */
	EReference getErpPerson_LandPropertyRoles();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getLandlinePhone <em>Landline Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Landline Phone</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getLandlinePhone()
	 * @see #getErpPerson()
	 * @generated
	 */
	EReference getErpPerson_LandlinePhone();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getMeasurementValues <em>Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurement Values</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getMeasurementValues()
	 * @see #getErpPerson()
	 * @generated
	 */
	EReference getErpPerson_MeasurementValues();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getActivityRecords <em>Activity Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Records</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getActivityRecords()
	 * @see #getErpPerson()
	 * @generated
	 */
	EReference getErpPerson_ActivityRecords();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crews</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getCrews()
	 * @see #getErpPerson()
	 * @generated
	 */
	EReference getErpPerson_Crews();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getAppointments <em>Appointments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Appointments</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getAppointments()
	 * @see #getErpPerson()
	 * @generated
	 */
	EReference getErpPerson_Appointments();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getErpPersonnel <em>Erp Personnel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Personnel</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getErpPersonnel()
	 * @see #getErpPerson()
	 * @generated
	 */
	EReference getErpPerson_ErpPersonnel();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suffix</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getSuffix()
	 * @see #getErpPerson()
	 * @generated
	 */
	EAttribute getErpPerson_Suffix();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getCustomerData <em>Customer Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Data</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getCustomerData()
	 * @see #getErpPerson()
	 * @generated
	 */
	EReference getErpPerson_CustomerData();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgErpPersonRole <em>Org Erp Person Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Org Erp Person Role</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgErpPersonRole
	 * @generated
	 */
	EClass getOrgErpPersonRole();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getErpOrganisation <em>Erp Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Organisation</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getErpOrganisation()
	 * @see #getOrgErpPersonRole()
	 * @generated
	 */
	EReference getOrgErpPersonRole_ErpOrganisation();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getClientID <em>Client ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client ID</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getClientID()
	 * @see #getOrgErpPersonRole()
	 * @generated
	 */
	EAttribute getOrgErpPersonRole_ClientID();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Person</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getErpPerson()
	 * @see #getOrgErpPersonRole()
	 * @generated
	 */
	EReference getOrgErpPersonRole_ErpPerson();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpCompetency <em>Erp Competency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Competency</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpCompetency
	 * @generated
	 */
	EClass getErpCompetency();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpCompetency#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Persons</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpCompetency#getErpPersons()
	 * @see #getErpCompetency()
	 * @generated
	 */
	EReference getErpCompetency_ErpPersons();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedger <em>Erp Ledger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Ledger</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedger
	 * @generated
	 */
	EClass getErpLedger();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedger#getErpLedgerEntries <em>Erp Ledger Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Ledger Entries</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedger#getErpLedgerEntries()
	 * @see #getErpLedger()
	 * @generated
	 */
	EReference getErpLedger_ErpLedgerEntries();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpSalesOrder <em>Erp Sales Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Sales Order</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpSalesOrder
	 * @generated
	 */
	EClass getErpSalesOrder();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem <em>Erp Quote Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Quote Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem
	 * @generated
	 */
	EClass getErpQuoteLineItem();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getStatus()
	 * @see #getErpQuoteLineItem()
	 * @generated
	 */
	EReference getErpQuoteLineItem_Status();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Request</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getRequest()
	 * @see #getErpQuoteLineItem()
	 * @generated
	 */
	EReference getErpQuoteLineItem_Request();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Design</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getDesign()
	 * @see #getErpQuoteLineItem()
	 * @generated
	 */
	EReference getErpQuoteLineItem_Design();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Invoice Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpInvoiceLineItem()
	 * @see #getErpQuoteLineItem()
	 * @generated
	 */
	EReference getErpQuoteLineItem_ErpInvoiceLineItem();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpReqLineItem <em>Erp Req Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Req Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpReqLineItem()
	 * @see #getErpQuoteLineItem()
	 * @generated
	 */
	EReference getErpQuoteLineItem_ErpReqLineItem();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpQuote <em>Erp Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Quote</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpQuote()
	 * @see #getErpQuoteLineItem()
	 * @generated
	 */
	EReference getErpQuoteLineItem_ErpQuote();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getAssetModelCatalogueItem <em>Asset Model Catalogue Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset Model Catalogue Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getAssetModelCatalogueItem()
	 * @see #getErpQuoteLineItem()
	 * @generated
	 */
	EReference getErpQuoteLineItem_AssetModelCatalogueItem();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPurchaseOrder <em>Erp Purchase Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Purchase Order</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPurchaseOrder
	 * @generated
	 */
	EClass getErpPurchaseOrder();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPurchaseOrder#getErpPOLineItems <em>Erp PO Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp PO Line Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPurchaseOrder#getErpPOLineItems()
	 * @see #getErpPurchaseOrder()
	 * @generated
	 */
	EReference getErpPurchaseOrder_ErpPOLineItems();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem <em>Erp Payable Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Payable Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem
	 * @generated
	 */
	EClass getErpPayableLineItem();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Invoice Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpInvoiceLineItem()
	 * @see #getErpPayableLineItem()
	 * @generated
	 */
	EReference getErpPayableLineItem_ErpInvoiceLineItem();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpPayments <em>Erp Payments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Payments</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpPayments()
	 * @see #getErpPayableLineItem()
	 * @generated
	 */
	EReference getErpPayableLineItem_ErpPayments();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpPayable <em>Erp Payable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Payable</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpPayable()
	 * @see #getErpPayableLineItem()
	 * @generated
	 */
	EReference getErpPayableLineItem_ErpPayable();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpJournalEntries <em>Erp Journal Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Journal Entries</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpJournalEntries()
	 * @see #getErpPayableLineItem()
	 * @generated
	 */
	EReference getErpPayableLineItem_ErpJournalEntries();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getStatus()
	 * @see #getErpPayableLineItem()
	 * @generated
	 */
	EReference getErpPayableLineItem_Status();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerBudget <em>Erp Ledger Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Ledger Budget</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerBudget
	 * @generated
	 */
	EClass getErpLedgerBudget();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerBudget#getErpLedBudLineItems <em>Erp Led Bud Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Led Bud Line Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerBudget#getErpLedBudLineItems()
	 * @see #getErpLedgerBudget()
	 * @generated
	 */
	EReference getErpLedgerBudget_ErpLedBudLineItems();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData <em>Erp Bom Item Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Bom Item Data</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData
	 * @generated
	 */
	EClass getErpBomItemData();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData#getDesignLocation <em>Design Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Design Location</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData#getDesignLocation()
	 * @see #getErpBomItemData()
	 * @generated
	 */
	EReference getErpBomItemData_DesignLocation();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData#getErpBOM <em>Erp BOM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp BOM</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData#getErpBOM()
	 * @see #getErpBomItemData()
	 * @generated
	 */
	EReference getErpBomItemData_ErpBOM();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData#getTypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Asset</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData#getTypeAsset()
	 * @see #getErpBomItemData()
	 * @generated
	 */
	EReference getErpBomItemData_TypeAsset();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInventory <em>Erp Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Inventory</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInventory
	 * @generated
	 */
	EClass getErpInventory();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInventory#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInventory#getStatus()
	 * @see #getErpInventory()
	 * @generated
	 */
	EReference getErpInventory_Status();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInventory#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInventory#getAsset()
	 * @see #getErpInventory()
	 * @generated
	 */
	EReference getErpInventory_Asset();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.DocErpPersonRole <em>Doc Erp Person Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc Erp Person Role</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.DocErpPersonRole
	 * @generated
	 */
	EClass getDocErpPersonRole();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.DocErpPersonRole#getErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Person</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.DocErpPersonRole#getErpPerson()
	 * @see #getDocErpPersonRole()
	 * @generated
	 */
	EReference getDocErpPersonRole_ErpPerson();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.DocErpPersonRole#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.DocErpPersonRole#getDocument()
	 * @see #getDocErpPersonRole()
	 * @generated
	 */
	EReference getDocErpPersonRole_Document();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpItemMaster <em>Erp Item Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Item Master</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpItemMaster
	 * @generated
	 */
	EClass getErpItemMaster();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpItemMaster#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpItemMaster#getStatus()
	 * @see #getErpItemMaster()
	 * @generated
	 */
	EReference getErpItemMaster_Status();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpItemMaster#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpItemMaster#getAsset()
	 * @see #getErpItemMaster()
	 * @generated
	 */
	EReference getErpItemMaster_Asset();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBankAccount <em>Erp Bank Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Bank Account</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBankAccount
	 * @generated
	 */
	EClass getErpBankAccount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBankAccount#getBankABA <em>Bank ABA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bank ABA</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBankAccount#getBankABA()
	 * @see #getErpBankAccount()
	 * @generated
	 */
	EAttribute getErpBankAccount_BankABA();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem <em>Erp Rec Delv Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Rec Delv Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem
	 * @generated
	 */
	EClass getErpRecDelvLineItem();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpPOLineItem <em>Erp PO Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp PO Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpPOLineItem()
	 * @see #getErpRecDelvLineItem()
	 * @generated
	 */
	EReference getErpRecDelvLineItem_ErpPOLineItem();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Invoice Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpInvoiceLineItem()
	 * @see #getErpRecDelvLineItem()
	 * @generated
	 */
	EReference getErpRecDelvLineItem_ErpInvoiceLineItem();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getStatus()
	 * @see #getErpRecDelvLineItem()
	 * @generated
	 */
	EReference getErpRecDelvLineItem_Status();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpReceiveDelivery <em>Erp Receive Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Receive Delivery</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpReceiveDelivery()
	 * @see #getErpRecDelvLineItem()
	 * @generated
	 */
	EReference getErpRecDelvLineItem_ErpReceiveDelivery();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getMaterialItems <em>Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Material Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getMaterialItems()
	 * @see #getErpRecDelvLineItem()
	 * @generated
	 */
	EReference getErpRecDelvLineItem_MaterialItems();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getAssets()
	 * @see #getErpRecDelvLineItem()
	 * @generated
	 */
	EReference getErpRecDelvLineItem_Assets();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgOrgRole <em>Org Org Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Org Org Role</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgOrgRole
	 * @generated
	 */
	EClass getOrgOrgRole();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgOrgRole#getClientID <em>Client ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client ID</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgOrgRole#getClientID()
	 * @see #getOrgOrgRole()
	 * @generated
	 */
	EAttribute getOrgOrgRole_ClientID();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgOrgRole#getChildOrganisation <em>Child Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child Organisation</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgOrgRole#getChildOrganisation()
	 * @see #getOrgOrgRole()
	 * @generated
	 */
	EReference getOrgOrgRole_ChildOrganisation();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgOrgRole#getParentOrganisation <em>Parent Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Organisation</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.OrgOrgRole#getParentOrganisation()
	 * @see #getOrgOrgRole()
	 * @generated
	 */
	EReference getOrgOrgRole_ParentOrganisation();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpSiteLevelData <em>Erp Site Level Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Site Level Data</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpSiteLevelData
	 * @generated
	 */
	EClass getErpSiteLevelData();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpSiteLevelData#getLandProperty <em>Land Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Land Property</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpSiteLevelData#getLandProperty()
	 * @see #getErpSiteLevelData()
	 * @generated
	 */
	EReference getErpSiteLevelData_LandProperty();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpSiteLevelData#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpSiteLevelData#getStatus()
	 * @see #getErpSiteLevelData()
	 * @generated
	 */
	EReference getErpSiteLevelData_Status();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem <em>Erp PO Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp PO Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem
	 * @generated
	 */
	EClass getErpPOLineItem();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpPurchaseOrder <em>Erp Purchase Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Purchase Order</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpPurchaseOrder()
	 * @see #getErpPOLineItem()
	 * @generated
	 */
	EReference getErpPOLineItem_ErpPurchaseOrder();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getMaterialItem <em>Material Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Material Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getMaterialItem()
	 * @see #getErpPOLineItem()
	 * @generated
	 */
	EReference getErpPOLineItem_MaterialItem();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpReqLineItem <em>Erp Req Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Req Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpReqLineItem()
	 * @see #getErpPOLineItem()
	 * @generated
	 */
	EReference getErpPOLineItem_ErpReqLineItem();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getAssetModelCatalogueItem <em>Asset Model Catalogue Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset Model Catalogue Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getAssetModelCatalogueItem()
	 * @see #getErpPOLineItem()
	 * @generated
	 */
	EReference getErpPOLineItem_AssetModelCatalogueItem();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpRecDelLineItem <em>Erp Rec Del Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Rec Del Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpRecDelLineItem()
	 * @see #getErpPOLineItem()
	 * @generated
	 */
	EReference getErpPOLineItem_ErpRecDelLineItem();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpIssueInventory <em>Erp Issue Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Issue Inventory</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpIssueInventory
	 * @generated
	 */
	EClass getErpIssueInventory();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getStatus()
	 * @see #getErpIssueInventory()
	 * @generated
	 */
	EReference getErpIssueInventory_Status();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getTypeMaterial <em>Type Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Material</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getTypeMaterial()
	 * @see #getErpIssueInventory()
	 * @generated
	 */
	EReference getErpIssueInventory_TypeMaterial();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getTypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Asset</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getTypeAsset()
	 * @see #getErpIssueInventory()
	 * @generated
	 */
	EReference getErpIssueInventory_TypeAsset();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayment <em>Erp Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Payment</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayment
	 * @generated
	 */
	EClass getErpPayment();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayment#getErpPayableLineItems <em>Erp Payable Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Payable Line Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayment#getErpPayableLineItems()
	 * @see #getErpPayment()
	 * @generated
	 */
	EReference getErpPayment_ErpPayableLineItems();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayment#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Invoice Line Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayment#getErpInvoiceLineItems()
	 * @see #getErpPayment()
	 * @generated
	 */
	EReference getErpPayment_ErpInvoiceLineItems();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayment#getTermsPayment <em>Terms Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terms Payment</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayment#getTermsPayment()
	 * @see #getErpPayment()
	 * @generated
	 */
	EAttribute getErpPayment_TermsPayment();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayment#getErpRecLineItems <em>Erp Rec Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Rec Line Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayment#getErpRecLineItems()
	 * @see #getErpPayment()
	 * @generated
	 */
	EReference getErpPayment_ErpRecLineItems();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuote <em>Erp Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Quote</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuote
	 * @generated
	 */
	EClass getErpQuote();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuote#getErpQuoteLineItems <em>Erp Quote Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Quote Line Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuote#getErpQuoteLineItems()
	 * @see #getErpQuote()
	 * @generated
	 */
	EReference getErpQuote_ErpQuoteLineItems();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayable <em>Erp Payable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Payable</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayable
	 * @generated
	 */
	EClass getErpPayable();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayable#getContractorItems <em>Contractor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contractor Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayable#getContractorItems()
	 * @see #getErpPayable()
	 * @generated
	 */
	EReference getErpPayable_ContractorItems();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayable#getErpPayableLineItems <em>Erp Payable Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Payable Line Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayable#getErpPayableLineItems()
	 * @see #getErpPayable()
	 * @generated
	 */
	EReference getErpPayable_ErpPayableLineItems();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRequisition <em>Erp Requisition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Requisition</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRequisition
	 * @generated
	 */
	EClass getErpRequisition();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRequisition#getErpReqLineItems <em>Erp Req Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Req Line Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRequisition#getErpReqLineItems()
	 * @see #getErpRequisition()
	 * @generated
	 */
	EReference getErpRequisition_ErpReqLineItems();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem <em>Erp Led Bud Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Led Bud Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem
	 * @generated
	 */
	EClass getErpLedBudLineItem();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getErpLedgerBudget <em>Erp Ledger Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Ledger Budget</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getErpLedgerBudget()
	 * @see #getErpLedBudLineItem()
	 * @generated
	 */
	EReference getErpLedBudLineItem_ErpLedgerBudget();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getStatus()
	 * @see #getErpLedBudLineItem()
	 * @generated
	 */
	EReference getErpLedBudLineItem_Status();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getErpLedBudLineItem <em>Erp Led Bud Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Led Bud Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getErpLedBudLineItem()
	 * @see #getErpLedBudLineItem()
	 * @generated
	 */
	EReference getErpLedBudLineItem_ErpLedBudLineItem();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice <em>Erp Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Invoice</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice
	 * @generated
	 */
	EClass getErpInvoice();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getAmount()
	 * @see #getErpInvoice()
	 * @generated
	 */
	EAttribute getErpInvoice_Amount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getKind()
	 * @see #getErpInvoice()
	 * @generated
	 */
	EAttribute getErpInvoice_Kind();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getTransactionDateTime <em>Transaction Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Date Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getTransactionDateTime()
	 * @see #getErpInvoice()
	 * @generated
	 */
	EAttribute getErpInvoice_TransactionDateTime();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getReferenceNumber <em>Reference Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Number</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getReferenceNumber()
	 * @see #getErpInvoice()
	 * @generated
	 */
	EAttribute getErpInvoice_ReferenceNumber();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getDueDate()
	 * @see #getErpInvoice()
	 * @generated
	 */
	EAttribute getErpInvoice_DueDate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getMailedDate <em>Mailed Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mailed Date</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getMailedDate()
	 * @see #getErpInvoice()
	 * @generated
	 */
	EAttribute getErpInvoice_MailedDate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getTransferType <em>Transfer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transfer Type</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getTransferType()
	 * @see #getErpInvoice()
	 * @generated
	 */
	EAttribute getErpInvoice_TransferType();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getCustomerAccount <em>Customer Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Account</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getCustomerAccount()
	 * @see #getErpInvoice()
	 * @generated
	 */
	EReference getErpInvoice_CustomerAccount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#isProForma <em>Pro Forma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pro Forma</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#isProForma()
	 * @see #getErpInvoice()
	 * @generated
	 */
	EAttribute getErpInvoice_ProForma();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getBillMediaKind <em>Bill Media Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bill Media Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getBillMediaKind()
	 * @see #getErpInvoice()
	 * @generated
	 */
	EAttribute getErpInvoice_BillMediaKind();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Invoice Line Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getErpInvoiceLineItems()
	 * @see #getErpInvoice()
	 * @generated
	 */
	EReference getErpInvoice_ErpInvoiceLineItems();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeEntry <em>Erp Time Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Time Entry</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeEntry
	 * @generated
	 */
	EClass getErpTimeEntry();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getErpProjectAccounting <em>Erp Project Accounting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Project Accounting</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getErpProjectAccounting()
	 * @see #getErpTimeEntry()
	 * @generated
	 */
	EReference getErpTimeEntry_ErpProjectAccounting();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getStatus()
	 * @see #getErpTimeEntry()
	 * @generated
	 */
	EReference getErpTimeEntry_Status();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getErpTimeSheet <em>Erp Time Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Time Sheet</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getErpTimeSheet()
	 * @see #getErpTimeEntry()
	 * @generated
	 */
	EReference getErpTimeEntry_ErpTimeSheet();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBOM <em>Erp BOM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp BOM</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBOM
	 * @generated
	 */
	EClass getErpBOM();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBOM#getErpBomItemDatas <em>Erp Bom Item Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Bom Item Datas</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBOM#getErpBomItemDatas()
	 * @see #getErpBOM()
	 * @generated
	 */
	EReference getErpBOM_ErpBomItemDatas();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBOM#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Design</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBOM#getDesign()
	 * @see #getErpBOM()
	 * @generated
	 */
	EReference getErpBOM_Design();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry <em>Erp Journal Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Journal Entry</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry
	 * @generated
	 */
	EClass getErpJournalEntry();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getAccountID <em>Account ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account ID</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getAccountID()
	 * @see #getErpJournalEntry()
	 * @generated
	 */
	EAttribute getErpJournalEntry_AccountID();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpLedgerEntry <em>Erp Ledger Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Ledger Entry</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpLedgerEntry()
	 * @see #getErpJournalEntry()
	 * @generated
	 */
	EReference getErpJournalEntry_ErpLedgerEntry();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpJournal <em>Erp Journal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Journal</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpJournal()
	 * @see #getErpJournalEntry()
	 * @generated
	 */
	EReference getErpJournalEntry_ErpJournal();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getAmount()
	 * @see #getErpJournalEntry()
	 * @generated
	 */
	EAttribute getErpJournalEntry_Amount();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getStatus()
	 * @see #getErpJournalEntry()
	 * @generated
	 */
	EReference getErpJournalEntry_Status();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getPostingDateTime <em>Posting Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posting Date Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getPostingDateTime()
	 * @see #getErpJournalEntry()
	 * @generated
	 */
	EAttribute getErpJournalEntry_PostingDateTime();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getTransactionDateTime <em>Transaction Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Date Time</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getTransactionDateTime()
	 * @see #getErpJournalEntry()
	 * @generated
	 */
	EAttribute getErpJournalEntry_TransactionDateTime();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getCostTypes <em>Cost Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cost Types</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getCostTypes()
	 * @see #getErpJournalEntry()
	 * @generated
	 */
	EReference getErpJournalEntry_CostTypes();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Invoice Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpInvoiceLineItem()
	 * @see #getErpJournalEntry()
	 * @generated
	 */
	EReference getErpJournalEntry_ErpInvoiceLineItem();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpPayableLineItems <em>Erp Payable Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Payable Line Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpPayableLineItems()
	 * @see #getErpJournalEntry()
	 * @generated
	 */
	EReference getErpJournalEntry_ErpPayableLineItems();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpRecLineItems <em>Erp Rec Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Rec Line Items</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpRecLineItems()
	 * @see #getErpJournalEntry()
	 * @generated
	 */
	EReference getErpJournalEntry_ErpRecLineItems();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getSourceID <em>Source ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source ID</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getSourceID()
	 * @see #getErpJournalEntry()
	 * @generated
	 */
	EAttribute getErpJournalEntry_SourceID();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem <em>Erp Rec Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Rec Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem
	 * @generated
	 */
	EClass getErpRecLineItem();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getStatus()
	 * @see #getErpRecLineItem()
	 * @generated
	 */
	EReference getErpRecLineItem_Status();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpJournalEntries <em>Erp Journal Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Journal Entries</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpJournalEntries()
	 * @see #getErpRecLineItem()
	 * @generated
	 */
	EReference getErpRecLineItem_ErpJournalEntries();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpReceivable <em>Erp Receivable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Receivable</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpReceivable()
	 * @see #getErpRecLineItem()
	 * @generated
	 */
	EReference getErpRecLineItem_ErpReceivable();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Invoice Line Item</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpInvoiceLineItem()
	 * @see #getErpRecLineItem()
	 * @generated
	 */
	EReference getErpRecLineItem_ErpInvoiceLineItem();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpPayments <em>Erp Payments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Payments</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpPayments()
	 * @see #getErpRecLineItem()
	 * @generated
	 */
	EReference getErpRecLineItem_ErpPayments();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeSheet <em>Erp Time Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Time Sheet</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeSheet
	 * @generated
	 */
	EClass getErpTimeSheet();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeSheet#getErpTimeEntries <em>Erp Time Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Time Entries</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeSheet#getErpTimeEntries()
	 * @see #getErpTimeSheet()
	 * @generated
	 */
	EReference getErpTimeSheet_ErpTimeEntries();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItemKind <em>Erp Invoice Line Item Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Erp Invoice Line Item Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItemKind
	 * @generated
	 */
	EEnum getErpInvoiceLineItemKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpAccountKind <em>Erp Account Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Erp Account Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpAccountKind
	 * @generated
	 */
	EEnum getErpAccountKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceKind <em>Erp Invoice Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Erp Invoice Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceKind
	 * @generated
	 */
	EEnum getErpInvoiceKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.BillMediaKind <em>Bill Media Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bill Media Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.BillMediaKind
	 * @generated
	 */
	EEnum getBillMediaKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InfERPSupportFactory getInfERPSupportFactory();

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
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpInventoryCountImpl <em>Erp Inventory Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpInventoryCountImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpInventoryCount()
		 * @generated
		 */
		EClass ERP_INVENTORY_COUNT = eINSTANCE.getErpInventoryCount();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_INVENTORY_COUNT__STATUS = eINSTANCE.getErpInventoryCount_Status();

		/**
		 * The meta object literal for the '<em><b>Material Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_INVENTORY_COUNT__MATERIAL_ITEM = eINSTANCE.getErpInventoryCount_MaterialItem();

		/**
		 * The meta object literal for the '<em><b>Asset Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_INVENTORY_COUNT__ASSET_MODEL = eINSTANCE.getErpInventoryCount_AssetModel();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonnelImpl <em>Erp Personnel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonnelImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpPersonnel()
		 * @generated
		 */
		EClass ERP_PERSONNEL = eINSTANCE.getErpPersonnel();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PERSONNEL__STATUS = eINSTANCE.getErpPersonnel_Status();

		/**
		 * The meta object literal for the '<em><b>Erp Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PERSONNEL__ERP_PERSONS = eINSTANCE.getErpPersonnel_ErpPersons();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl <em>Erp Invoice Line Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpInvoiceLineItem()
		 * @generated
		 */
		EClass ERP_INVOICE_LINE_ITEM = eINSTANCE.getErpInvoiceLineItem();

		/**
		 * The meta object literal for the '<em><b>Erp Quote Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_INVOICE_LINE_ITEM__ERP_QUOTE_LINE_ITEM = eINSTANCE.getErpInvoiceLineItem_ErpQuoteLineItem();

		/**
		 * The meta object literal for the '<em><b>Net Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_INVOICE_LINE_ITEM__NET_AMOUNT = eINSTANCE.getErpInvoiceLineItem_NetAmount();

		/**
		 * The meta object literal for the '<em><b>Erp Payable Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_INVOICE_LINE_ITEM__ERP_PAYABLE_LINE_ITEM = eINSTANCE.getErpInvoiceLineItem_ErpPayableLineItem();

		/**
		 * The meta object literal for the '<em><b>Line Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_INVOICE_LINE_ITEM__LINE_AMOUNT = eINSTANCE.getErpInvoiceLineItem_LineAmount();

		/**
		 * The meta object literal for the '<em><b>Erp Rec Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_INVOICE_LINE_ITEM__ERP_REC_LINE_ITEM = eINSTANCE.getErpInvoiceLineItem_ErpRecLineItem();

		/**
		 * The meta object literal for the '<em><b>Settlements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_INVOICE_LINE_ITEM__SETTLEMENTS = eINSTANCE.getErpInvoiceLineItem_Settlements();

		/**
		 * The meta object literal for the '<em><b>Previous Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_INVOICE_LINE_ITEM__PREVIOUS_AMOUNT = eINSTANCE.getErpInvoiceLineItem_PreviousAmount();

		/**
		 * The meta object literal for the '<em><b>Work Billing Infos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_INVOICE_LINE_ITEM__WORK_BILLING_INFOS = eINSTANCE.getErpInvoiceLineItem_WorkBillingInfos();

		/**
		 * The meta object literal for the '<em><b>Market Factors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_INVOICE_LINE_ITEM__MARKET_FACTORS = eINSTANCE.getErpInvoiceLineItem_MarketFactors();

		/**
		 * The meta object literal for the '<em><b>Erp Payments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_INVOICE_LINE_ITEM__ERP_PAYMENTS = eINSTANCE.getErpInvoiceLineItem_ErpPayments();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_INVOICE_LINE_ITEM__KIND = eINSTANCE.getErpInvoiceLineItem_Kind();

		/**
		 * The meta object literal for the '<em><b>Gl Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_INVOICE_LINE_ITEM__GL_DATE_TIME = eINSTANCE.getErpInvoiceLineItem_GlDateTime();

		/**
		 * The meta object literal for the '<em><b>Container Erp Invoice Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_INVOICE_LINE_ITEM__CONTAINER_ERP_INVOICE_LINE_ITEM = eINSTANCE.getErpInvoiceLineItem_ContainerErpInvoiceLineItem();

		/**
		 * The meta object literal for the '<em><b>Erp Rec Delv Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_INVOICE_LINE_ITEM__ERP_REC_DELV_LINE_ITEM = eINSTANCE.getErpInvoiceLineItem_ErpRecDelvLineItem();

		/**
		 * The meta object literal for the '<em><b>Gl Account</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_INVOICE_LINE_ITEM__GL_ACCOUNT = eINSTANCE.getErpInvoiceLineItem_GlAccount();

		/**
		 * The meta object literal for the '<em><b>Bill Period</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_INVOICE_LINE_ITEM__BILL_PERIOD = eINSTANCE.getErpInvoiceLineItem_BillPeriod();

		/**
		 * The meta object literal for the '<em><b>Line Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_INVOICE_LINE_ITEM__LINE_NUMBER = eINSTANCE.getErpInvoiceLineItem_LineNumber();

		/**
		 * The meta object literal for the '<em><b>User Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_INVOICE_LINE_ITEM__USER_ATTRIBUTES = eINSTANCE.getErpInvoiceLineItem_UserAttributes();

		/**
		 * The meta object literal for the '<em><b>Line Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_INVOICE_LINE_ITEM__LINE_VERSION = eINSTANCE.getErpInvoiceLineItem_LineVersion();

		/**
		 * The meta object literal for the '<em><b>Erp Invoice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_INVOICE_LINE_ITEM__ERP_INVOICE = eINSTANCE.getErpInvoiceLineItem_ErpInvoice();

		/**
		 * The meta object literal for the '<em><b>Customer Billing Infos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_INVOICE_LINE_ITEM__CUSTOMER_BILLING_INFOS = eINSTANCE.getErpInvoiceLineItem_CustomerBillingInfos();

		/**
		 * The meta object literal for the '<em><b>Component Erp Invoice Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_INVOICE_LINE_ITEM__COMPONENT_ERP_INVOICE_LINE_ITEMS = eINSTANCE.getErpInvoiceLineItem_ComponentErpInvoiceLineItems();

		/**
		 * The meta object literal for the '<em><b>Erp Journal Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_INVOICE_LINE_ITEM__ERP_JOURNAL_ENTRIES = eINSTANCE.getErpInvoiceLineItem_ErpJournalEntries();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpChartOfAccountsImpl <em>Erp Chart Of Accounts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpChartOfAccountsImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpChartOfAccounts()
		 * @generated
		 */
		EClass ERP_CHART_OF_ACCOUNTS = eINSTANCE.getErpChartOfAccounts();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpProjectAccountingImpl <em>Erp Project Accounting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpProjectAccountingImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpProjectAccounting()
		 * @generated
		 */
		EClass ERP_PROJECT_ACCOUNTING = eINSTANCE.getErpProjectAccounting();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PROJECT_ACCOUNTING__PROJECTS = eINSTANCE.getErpProjectAccounting_Projects();

		/**
		 * The meta object literal for the '<em><b>Work Cost Details</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PROJECT_ACCOUNTING__WORK_COST_DETAILS = eINSTANCE.getErpProjectAccounting_WorkCostDetails();

		/**
		 * The meta object literal for the '<em><b>Erp Time Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PROJECT_ACCOUNTING__ERP_TIME_ENTRIES = eINSTANCE.getErpProjectAccounting_ErpTimeEntries();

		/**
		 * The meta object literal for the '<em><b>Works</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PROJECT_ACCOUNTING__WORKS = eINSTANCE.getErpProjectAccounting_Works();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpReceiveDeliveryImpl <em>Erp Receive Delivery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpReceiveDeliveryImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpReceiveDelivery()
		 * @generated
		 */
		EClass ERP_RECEIVE_DELIVERY = eINSTANCE.getErpReceiveDelivery();

		/**
		 * The meta object literal for the '<em><b>Erp Rec Delv Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_RECEIVE_DELIVERY__ERP_REC_DELV_LINE_ITEMS = eINSTANCE.getErpReceiveDelivery_ErpRecDelvLineItems();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpEngChangeOrderImpl <em>Erp Eng Change Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpEngChangeOrderImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpEngChangeOrder()
		 * @generated
		 */
		EClass ERP_ENG_CHANGE_ORDER = eINSTANCE.getErpEngChangeOrder();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpJournalImpl <em>Erp Journal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpJournalImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpJournal()
		 * @generated
		 */
		EClass ERP_JOURNAL = eINSTANCE.getErpJournal();

		/**
		 * The meta object literal for the '<em><b>Erp Journal Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_JOURNAL__ERP_JOURNAL_ENTRIES = eINSTANCE.getErpJournal_ErpJournalEntries();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpReqLineItemImpl <em>Erp Req Line Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpReqLineItemImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpReqLineItem()
		 * @generated
		 */
		EClass ERP_REQ_LINE_ITEM = eINSTANCE.getErpReqLineItem();

		/**
		 * The meta object literal for the '<em><b>Delivery Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_REQ_LINE_ITEM__DELIVERY_DATE = eINSTANCE.getErpReqLineItem_DeliveryDate();

		/**
		 * The meta object literal for the '<em><b>Type Material</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_REQ_LINE_ITEM__TYPE_MATERIAL = eINSTANCE.getErpReqLineItem_TypeMaterial();

		/**
		 * The meta object literal for the '<em><b>Erp Quote Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_REQ_LINE_ITEM__ERP_QUOTE_LINE_ITEM = eINSTANCE.getErpReqLineItem_ErpQuoteLineItem();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_REQ_LINE_ITEM__STATUS = eINSTANCE.getErpReqLineItem_Status();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_REQ_LINE_ITEM__QUANTITY = eINSTANCE.getErpReqLineItem_Quantity();

		/**
		 * The meta object literal for the '<em><b>Erp Requisition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_REQ_LINE_ITEM__ERP_REQUISITION = eINSTANCE.getErpReqLineItem_ErpRequisition();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_REQ_LINE_ITEM__CODE = eINSTANCE.getErpReqLineItem_Code();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_REQ_LINE_ITEM__COST = eINSTANCE.getErpReqLineItem_Cost();

		/**
		 * The meta object literal for the '<em><b>Type Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_REQ_LINE_ITEM__TYPE_ASSET = eINSTANCE.getErpReqLineItem_TypeAsset();

		/**
		 * The meta object literal for the '<em><b>Erp PO Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_REQ_LINE_ITEM__ERP_PO_LINE_ITEM = eINSTANCE.getErpReqLineItem_ErpPOLineItem();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl <em>Erp Organisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpOrganisation()
		 * @generated
		 */
		EClass ERP_ORGANISATION = eINSTANCE.getErpOrganisation();

		/**
		 * The meta object literal for the '<em><b>Crews</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_ORGANISATION__CREWS = eINSTANCE.getErpOrganisation_Crews();

		/**
		 * The meta object literal for the '<em><b>Requests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_ORGANISATION__REQUESTS = eINSTANCE.getErpOrganisation_Requests();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_ORGANISATION__MODE = eINSTANCE.getErpOrganisation_Mode();

		/**
		 * The meta object literal for the '<em><b>Opt Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_ORGANISATION__OPT_OUT = eINSTANCE.getErpOrganisation_OptOut();

		/**
		 * The meta object literal for the '<em><b>Registered Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_ORGANISATION__REGISTERED_RESOURCES = eINSTANCE.getErpOrganisation_RegisteredResources();

		/**
		 * The meta object literal for the '<em><b>Power System Resource Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES = eINSTANCE.getErpOrganisation_PowerSystemResourceRoles();

		/**
		 * The meta object literal for the '<em><b>Is Profit Center</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_ORGANISATION__IS_PROFIT_CENTER = eINSTANCE.getErpOrganisation_IsProfitCenter();

		/**
		 * The meta object literal for the '<em><b>Is Cost Center</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_ORGANISATION__IS_COST_CENTER = eINSTANCE.getErpOrganisation_IsCostCenter();

		/**
		 * The meta object literal for the '<em><b>Document Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_ORGANISATION__DOCUMENT_ROLES = eINSTANCE.getErpOrganisation_DocumentRoles();

		/**
		 * The meta object literal for the '<em><b>Asset Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_ORGANISATION__ASSET_ROLES = eINSTANCE.getErpOrganisation_AssetRoles();

		/**
		 * The meta object literal for the '<em><b>Violation Limits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_ORGANISATION__VIOLATION_LIMITS = eINSTANCE.getErpOrganisation_ViolationLimits();

		/**
		 * The meta object literal for the '<em><b>Parent Organisation Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_ORGANISATION__PARENT_ORGANISATION_ROLES = eINSTANCE.getErpOrganisation_ParentOrganisationRoles();

		/**
		 * The meta object literal for the '<em><b>Land Property Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_ORGANISATION__LAND_PROPERTY_ROLES = eINSTANCE.getErpOrganisation_LandPropertyRoles();

		/**
		 * The meta object literal for the '<em><b>Erp Person Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_ORGANISATION__ERP_PERSON_ROLES = eINSTANCE.getErpOrganisation_ErpPersonRoles();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_ORGANISATION__CODE = eINSTANCE.getErpOrganisation_Code();

		/**
		 * The meta object literal for the '<em><b>Child Organisation Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_ORGANISATION__CHILD_ORGANISATION_ROLES = eINSTANCE.getErpOrganisation_ChildOrganisationRoles();

		/**
		 * The meta object literal for the '<em><b>Industry ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_ORGANISATION__INDUSTRY_ID = eINSTANCE.getErpOrganisation_IndustryID();

		/**
		 * The meta object literal for the '<em><b>Change Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_ORGANISATION__CHANGE_ITEMS = eINSTANCE.getErpOrganisation_ChangeItems();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_ORGANISATION__CATEGORY = eINSTANCE.getErpOrganisation_Category();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_ORGANISATION__LOCATIONS = eINSTANCE.getErpOrganisation_Locations();

		/**
		 * The meta object literal for the '<em><b>Int Sched Agreement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_ORGANISATION__INT_SCHED_AGREEMENT = eINSTANCE.getErpOrganisation_IntSchedAgreement();

		/**
		 * The meta object literal for the '<em><b>Activity Records</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_ORGANISATION__ACTIVITY_RECORDS = eINSTANCE.getErpOrganisation_ActivityRecords();

		/**
		 * The meta object literal for the '<em><b>Government ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_ORGANISATION__GOVERNMENT_ID = eINSTANCE.getErpOrganisation_GovernmentID();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.DocOrgRoleImpl <em>Doc Org Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.DocOrgRoleImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getDocOrgRole()
		 * @generated
		 */
		EClass DOC_ORG_ROLE = eINSTANCE.getDocOrgRole();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_ORG_ROLE__DOCUMENT = eINSTANCE.getDocOrgRole_Document();

		/**
		 * The meta object literal for the '<em><b>Erp Organisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_ORG_ROLE__ERP_ORGANISATION = eINSTANCE.getDocOrgRole_ErpOrganisation();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedgerEntryImpl <em>Erp Ledger Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedgerEntryImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpLedgerEntry()
		 * @generated
		 */
		EClass ERP_LEDGER_ENTRY = eINSTANCE.getErpLedgerEntry();

		/**
		 * The meta object literal for the '<em><b>Transaction Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_LEDGER_ENTRY__TRANSACTION_DATE_TIME = eINSTANCE.getErpLedgerEntry_TransactionDateTime();

		/**
		 * The meta object literal for the '<em><b>Account ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_LEDGER_ENTRY__ACCOUNT_ID = eINSTANCE.getErpLedgerEntry_AccountID();

		/**
		 * The meta object literal for the '<em><b>Erp Jounal Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_LEDGER_ENTRY__ERP_JOUNAL_ENTRY = eINSTANCE.getErpLedgerEntry_ErpJounalEntry();

		/**
		 * The meta object literal for the '<em><b>Erp Ledger Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_LEDGER_ENTRY__ERP_LEDGER_ENTRY = eINSTANCE.getErpLedgerEntry_ErpLedgerEntry();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_LEDGER_ENTRY__AMOUNT = eINSTANCE.getErpLedgerEntry_Amount();

		/**
		 * The meta object literal for the '<em><b>User Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_LEDGER_ENTRY__USER_ATTRIBUTES = eINSTANCE.getErpLedgerEntry_UserAttributes();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_LEDGER_ENTRY__STATUS = eINSTANCE.getErpLedgerEntry_Status();

		/**
		 * The meta object literal for the '<em><b>Settlements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_LEDGER_ENTRY__SETTLEMENTS = eINSTANCE.getErpLedgerEntry_Settlements();

		/**
		 * The meta object literal for the '<em><b>Posted Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_LEDGER_ENTRY__POSTED_DATE_TIME = eINSTANCE.getErpLedgerEntry_PostedDateTime();

		/**
		 * The meta object literal for the '<em><b>Account Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_LEDGER_ENTRY__ACCOUNT_KIND = eINSTANCE.getErpLedgerEntry_AccountKind();

		/**
		 * The meta object literal for the '<em><b>Erp Ledger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_LEDGER_ENTRY__ERP_LEDGER = eINSTANCE.getErpLedgerEntry_ErpLedger();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpReceivableImpl <em>Erp Receivable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpReceivableImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpReceivable()
		 * @generated
		 */
		EClass ERP_RECEIVABLE = eINSTANCE.getErpReceivable();

		/**
		 * The meta object literal for the '<em><b>Erp Rec Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_RECEIVABLE__ERP_REC_LINE_ITEMS = eINSTANCE.getErpReceivable_ErpRecLineItems();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl <em>Erp Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPersonImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpPerson()
		 * @generated
		 */
		EClass ERP_PERSON = eINSTANCE.getErpPerson();

		/**
		 * The meta object literal for the '<em><b>Call Backs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PERSON__CALL_BACKS = eINSTANCE.getErpPerson_CallBacks();

		/**
		 * The meta object literal for the '<em><b>Service Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PERSON__SERVICE_LOCATION = eINSTANCE.getErpPerson_ServiceLocation();

		/**
		 * The meta object literal for the '<em><b>Document Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PERSON__DOCUMENT_ROLES = eINSTANCE.getErpPerson_DocumentRoles();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_PERSON__CATEGORY = eINSTANCE.getErpPerson_Category();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_PERSON__FIRST_NAME = eINSTANCE.getErpPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Switching Step Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PERSON__SWITCHING_STEP_ROLES = eINSTANCE.getErpPerson_SwitchingStepRoles();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_PERSON__LAST_NAME = eINSTANCE.getErpPerson_LastName();

		/**
		 * The meta object literal for the '<em><b>Change Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PERSON__CHANGE_ITEMS = eINSTANCE.getErpPerson_ChangeItems();

		/**
		 * The meta object literal for the '<em><b>MName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_PERSON__MNAME = eINSTANCE.getErpPerson_MName();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PERSON__SKILLS = eINSTANCE.getErpPerson_Skills();

		/**
		 * The meta object literal for the '<em><b>Electronic Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PERSON__ELECTRONIC_ADDRESS = eINSTANCE.getErpPerson_ElectronicAddress();

		/**
		 * The meta object literal for the '<em><b>Government ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_PERSON__GOVERNMENT_ID = eINSTANCE.getErpPerson_GovernmentID();

		/**
		 * The meta object literal for the '<em><b>Special Need</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_PERSON__SPECIAL_NEED = eINSTANCE.getErpPerson_SpecialNeed();

		/**
		 * The meta object literal for the '<em><b>Erp Organisation Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PERSON__ERP_ORGANISATION_ROLES = eINSTANCE.getErpPerson_ErpOrganisationRoles();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PERSON__STATUS = eINSTANCE.getErpPerson_Status();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_PERSON__PREFIX = eINSTANCE.getErpPerson_Prefix();

		/**
		 * The meta object literal for the '<em><b>Labor Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PERSON__LABOR_ITEMS = eINSTANCE.getErpPerson_LaborItems();

		/**
		 * The meta object literal for the '<em><b>Crafts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PERSON__CRAFTS = eINSTANCE.getErpPerson_Crafts();

		/**
		 * The meta object literal for the '<em><b>Mobile Phone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PERSON__MOBILE_PHONE = eINSTANCE.getErpPerson_MobilePhone();

		/**
		 * The meta object literal for the '<em><b>Erp Competency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PERSON__ERP_COMPETENCY = eINSTANCE.getErpPerson_ErpCompetency();

		/**
		 * The meta object literal for the '<em><b>Land Property Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PERSON__LAND_PROPERTY_ROLES = eINSTANCE.getErpPerson_LandPropertyRoles();

		/**
		 * The meta object literal for the '<em><b>Landline Phone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PERSON__LANDLINE_PHONE = eINSTANCE.getErpPerson_LandlinePhone();

		/**
		 * The meta object literal for the '<em><b>Measurement Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PERSON__MEASUREMENT_VALUES = eINSTANCE.getErpPerson_MeasurementValues();

		/**
		 * The meta object literal for the '<em><b>Activity Records</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PERSON__ACTIVITY_RECORDS = eINSTANCE.getErpPerson_ActivityRecords();

		/**
		 * The meta object literal for the '<em><b>Crews</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PERSON__CREWS = eINSTANCE.getErpPerson_Crews();

		/**
		 * The meta object literal for the '<em><b>Appointments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PERSON__APPOINTMENTS = eINSTANCE.getErpPerson_Appointments();

		/**
		 * The meta object literal for the '<em><b>Erp Personnel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PERSON__ERP_PERSONNEL = eINSTANCE.getErpPerson_ErpPersonnel();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_PERSON__SUFFIX = eINSTANCE.getErpPerson_Suffix();

		/**
		 * The meta object literal for the '<em><b>Customer Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PERSON__CUSTOMER_DATA = eINSTANCE.getErpPerson_CustomerData();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.OrgErpPersonRoleImpl <em>Org Erp Person Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.OrgErpPersonRoleImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getOrgErpPersonRole()
		 * @generated
		 */
		EClass ORG_ERP_PERSON_ROLE = eINSTANCE.getOrgErpPersonRole();

		/**
		 * The meta object literal for the '<em><b>Erp Organisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORG_ERP_PERSON_ROLE__ERP_ORGANISATION = eINSTANCE.getOrgErpPersonRole_ErpOrganisation();

		/**
		 * The meta object literal for the '<em><b>Client ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORG_ERP_PERSON_ROLE__CLIENT_ID = eINSTANCE.getOrgErpPersonRole_ClientID();

		/**
		 * The meta object literal for the '<em><b>Erp Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORG_ERP_PERSON_ROLE__ERP_PERSON = eINSTANCE.getOrgErpPersonRole_ErpPerson();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpCompetencyImpl <em>Erp Competency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpCompetencyImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpCompetency()
		 * @generated
		 */
		EClass ERP_COMPETENCY = eINSTANCE.getErpCompetency();

		/**
		 * The meta object literal for the '<em><b>Erp Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_COMPETENCY__ERP_PERSONS = eINSTANCE.getErpCompetency_ErpPersons();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedgerImpl <em>Erp Ledger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedgerImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpLedger()
		 * @generated
		 */
		EClass ERP_LEDGER = eINSTANCE.getErpLedger();

		/**
		 * The meta object literal for the '<em><b>Erp Ledger Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_LEDGER__ERP_LEDGER_ENTRIES = eINSTANCE.getErpLedger_ErpLedgerEntries();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpSalesOrderImpl <em>Erp Sales Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpSalesOrderImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpSalesOrder()
		 * @generated
		 */
		EClass ERP_SALES_ORDER = eINSTANCE.getErpSalesOrder();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpQuoteLineItemImpl <em>Erp Quote Line Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpQuoteLineItemImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpQuoteLineItem()
		 * @generated
		 */
		EClass ERP_QUOTE_LINE_ITEM = eINSTANCE.getErpQuoteLineItem();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_QUOTE_LINE_ITEM__STATUS = eINSTANCE.getErpQuoteLineItem_Status();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_QUOTE_LINE_ITEM__REQUEST = eINSTANCE.getErpQuoteLineItem_Request();

		/**
		 * The meta object literal for the '<em><b>Design</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_QUOTE_LINE_ITEM__DESIGN = eINSTANCE.getErpQuoteLineItem_Design();

		/**
		 * The meta object literal for the '<em><b>Erp Invoice Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_QUOTE_LINE_ITEM__ERP_INVOICE_LINE_ITEM = eINSTANCE.getErpQuoteLineItem_ErpInvoiceLineItem();

		/**
		 * The meta object literal for the '<em><b>Erp Req Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_QUOTE_LINE_ITEM__ERP_REQ_LINE_ITEM = eINSTANCE.getErpQuoteLineItem_ErpReqLineItem();

		/**
		 * The meta object literal for the '<em><b>Erp Quote</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_QUOTE_LINE_ITEM__ERP_QUOTE = eINSTANCE.getErpQuoteLineItem_ErpQuote();

		/**
		 * The meta object literal for the '<em><b>Asset Model Catalogue Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_QUOTE_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM = eINSTANCE.getErpQuoteLineItem_AssetModelCatalogueItem();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPurchaseOrderImpl <em>Erp Purchase Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPurchaseOrderImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpPurchaseOrder()
		 * @generated
		 */
		EClass ERP_PURCHASE_ORDER = eINSTANCE.getErpPurchaseOrder();

		/**
		 * The meta object literal for the '<em><b>Erp PO Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PURCHASE_ORDER__ERP_PO_LINE_ITEMS = eINSTANCE.getErpPurchaseOrder_ErpPOLineItems();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPayableLineItemImpl <em>Erp Payable Line Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPayableLineItemImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpPayableLineItem()
		 * @generated
		 */
		EClass ERP_PAYABLE_LINE_ITEM = eINSTANCE.getErpPayableLineItem();

		/**
		 * The meta object literal for the '<em><b>Erp Invoice Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PAYABLE_LINE_ITEM__ERP_INVOICE_LINE_ITEM = eINSTANCE.getErpPayableLineItem_ErpInvoiceLineItem();

		/**
		 * The meta object literal for the '<em><b>Erp Payments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PAYABLE_LINE_ITEM__ERP_PAYMENTS = eINSTANCE.getErpPayableLineItem_ErpPayments();

		/**
		 * The meta object literal for the '<em><b>Erp Payable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PAYABLE_LINE_ITEM__ERP_PAYABLE = eINSTANCE.getErpPayableLineItem_ErpPayable();

		/**
		 * The meta object literal for the '<em><b>Erp Journal Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PAYABLE_LINE_ITEM__ERP_JOURNAL_ENTRIES = eINSTANCE.getErpPayableLineItem_ErpJournalEntries();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PAYABLE_LINE_ITEM__STATUS = eINSTANCE.getErpPayableLineItem_Status();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedgerBudgetImpl <em>Erp Ledger Budget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedgerBudgetImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpLedgerBudget()
		 * @generated
		 */
		EClass ERP_LEDGER_BUDGET = eINSTANCE.getErpLedgerBudget();

		/**
		 * The meta object literal for the '<em><b>Erp Led Bud Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_LEDGER_BUDGET__ERP_LED_BUD_LINE_ITEMS = eINSTANCE.getErpLedgerBudget_ErpLedBudLineItems();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpBomItemDataImpl <em>Erp Bom Item Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpBomItemDataImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpBomItemData()
		 * @generated
		 */
		EClass ERP_BOM_ITEM_DATA = eINSTANCE.getErpBomItemData();

		/**
		 * The meta object literal for the '<em><b>Design Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_BOM_ITEM_DATA__DESIGN_LOCATION = eINSTANCE.getErpBomItemData_DesignLocation();

		/**
		 * The meta object literal for the '<em><b>Erp BOM</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_BOM_ITEM_DATA__ERP_BOM = eINSTANCE.getErpBomItemData_ErpBOM();

		/**
		 * The meta object literal for the '<em><b>Type Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_BOM_ITEM_DATA__TYPE_ASSET = eINSTANCE.getErpBomItemData_TypeAsset();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpInventoryImpl <em>Erp Inventory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpInventoryImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpInventory()
		 * @generated
		 */
		EClass ERP_INVENTORY = eINSTANCE.getErpInventory();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_INVENTORY__STATUS = eINSTANCE.getErpInventory_Status();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_INVENTORY__ASSET = eINSTANCE.getErpInventory_Asset();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.DocErpPersonRoleImpl <em>Doc Erp Person Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.DocErpPersonRoleImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getDocErpPersonRole()
		 * @generated
		 */
		EClass DOC_ERP_PERSON_ROLE = eINSTANCE.getDocErpPersonRole();

		/**
		 * The meta object literal for the '<em><b>Erp Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_ERP_PERSON_ROLE__ERP_PERSON = eINSTANCE.getDocErpPersonRole_ErpPerson();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_ERP_PERSON_ROLE__DOCUMENT = eINSTANCE.getDocErpPersonRole_Document();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpItemMasterImpl <em>Erp Item Master</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpItemMasterImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpItemMaster()
		 * @generated
		 */
		EClass ERP_ITEM_MASTER = eINSTANCE.getErpItemMaster();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_ITEM_MASTER__STATUS = eINSTANCE.getErpItemMaster_Status();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_ITEM_MASTER__ASSET = eINSTANCE.getErpItemMaster_Asset();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpBankAccountImpl <em>Erp Bank Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpBankAccountImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpBankAccount()
		 * @generated
		 */
		EClass ERP_BANK_ACCOUNT = eINSTANCE.getErpBankAccount();

		/**
		 * The meta object literal for the '<em><b>Bank ABA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_BANK_ACCOUNT__BANK_ABA = eINSTANCE.getErpBankAccount_BankABA();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpRecDelvLineItemImpl <em>Erp Rec Delv Line Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpRecDelvLineItemImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpRecDelvLineItem()
		 * @generated
		 */
		EClass ERP_REC_DELV_LINE_ITEM = eINSTANCE.getErpRecDelvLineItem();

		/**
		 * The meta object literal for the '<em><b>Erp PO Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_REC_DELV_LINE_ITEM__ERP_PO_LINE_ITEM = eINSTANCE.getErpRecDelvLineItem_ErpPOLineItem();

		/**
		 * The meta object literal for the '<em><b>Erp Invoice Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_REC_DELV_LINE_ITEM__ERP_INVOICE_LINE_ITEM = eINSTANCE.getErpRecDelvLineItem_ErpInvoiceLineItem();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_REC_DELV_LINE_ITEM__STATUS = eINSTANCE.getErpRecDelvLineItem_Status();

		/**
		 * The meta object literal for the '<em><b>Erp Receive Delivery</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_REC_DELV_LINE_ITEM__ERP_RECEIVE_DELIVERY = eINSTANCE.getErpRecDelvLineItem_ErpReceiveDelivery();

		/**
		 * The meta object literal for the '<em><b>Material Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_REC_DELV_LINE_ITEM__MATERIAL_ITEMS = eINSTANCE.getErpRecDelvLineItem_MaterialItems();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_REC_DELV_LINE_ITEM__ASSETS = eINSTANCE.getErpRecDelvLineItem_Assets();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.OrgOrgRoleImpl <em>Org Org Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.OrgOrgRoleImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getOrgOrgRole()
		 * @generated
		 */
		EClass ORG_ORG_ROLE = eINSTANCE.getOrgOrgRole();

		/**
		 * The meta object literal for the '<em><b>Client ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORG_ORG_ROLE__CLIENT_ID = eINSTANCE.getOrgOrgRole_ClientID();

		/**
		 * The meta object literal for the '<em><b>Child Organisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORG_ORG_ROLE__CHILD_ORGANISATION = eINSTANCE.getOrgOrgRole_ChildOrganisation();

		/**
		 * The meta object literal for the '<em><b>Parent Organisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORG_ORG_ROLE__PARENT_ORGANISATION = eINSTANCE.getOrgOrgRole_ParentOrganisation();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpSiteLevelDataImpl <em>Erp Site Level Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpSiteLevelDataImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpSiteLevelData()
		 * @generated
		 */
		EClass ERP_SITE_LEVEL_DATA = eINSTANCE.getErpSiteLevelData();

		/**
		 * The meta object literal for the '<em><b>Land Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_SITE_LEVEL_DATA__LAND_PROPERTY = eINSTANCE.getErpSiteLevelData_LandProperty();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_SITE_LEVEL_DATA__STATUS = eINSTANCE.getErpSiteLevelData_Status();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPOLineItemImpl <em>Erp PO Line Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPOLineItemImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpPOLineItem()
		 * @generated
		 */
		EClass ERP_PO_LINE_ITEM = eINSTANCE.getErpPOLineItem();

		/**
		 * The meta object literal for the '<em><b>Erp Purchase Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PO_LINE_ITEM__ERP_PURCHASE_ORDER = eINSTANCE.getErpPOLineItem_ErpPurchaseOrder();

		/**
		 * The meta object literal for the '<em><b>Material Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PO_LINE_ITEM__MATERIAL_ITEM = eINSTANCE.getErpPOLineItem_MaterialItem();

		/**
		 * The meta object literal for the '<em><b>Erp Req Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PO_LINE_ITEM__ERP_REQ_LINE_ITEM = eINSTANCE.getErpPOLineItem_ErpReqLineItem();

		/**
		 * The meta object literal for the '<em><b>Asset Model Catalogue Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PO_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM = eINSTANCE.getErpPOLineItem_AssetModelCatalogueItem();

		/**
		 * The meta object literal for the '<em><b>Erp Rec Del Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PO_LINE_ITEM__ERP_REC_DEL_LINE_ITEM = eINSTANCE.getErpPOLineItem_ErpRecDelLineItem();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpIssueInventoryImpl <em>Erp Issue Inventory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpIssueInventoryImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpIssueInventory()
		 * @generated
		 */
		EClass ERP_ISSUE_INVENTORY = eINSTANCE.getErpIssueInventory();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_ISSUE_INVENTORY__STATUS = eINSTANCE.getErpIssueInventory_Status();

		/**
		 * The meta object literal for the '<em><b>Type Material</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_ISSUE_INVENTORY__TYPE_MATERIAL = eINSTANCE.getErpIssueInventory_TypeMaterial();

		/**
		 * The meta object literal for the '<em><b>Type Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_ISSUE_INVENTORY__TYPE_ASSET = eINSTANCE.getErpIssueInventory_TypeAsset();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPaymentImpl <em>Erp Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPaymentImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpPayment()
		 * @generated
		 */
		EClass ERP_PAYMENT = eINSTANCE.getErpPayment();

		/**
		 * The meta object literal for the '<em><b>Erp Payable Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PAYMENT__ERP_PAYABLE_LINE_ITEMS = eINSTANCE.getErpPayment_ErpPayableLineItems();

		/**
		 * The meta object literal for the '<em><b>Erp Invoice Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PAYMENT__ERP_INVOICE_LINE_ITEMS = eINSTANCE.getErpPayment_ErpInvoiceLineItems();

		/**
		 * The meta object literal for the '<em><b>Terms Payment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_PAYMENT__TERMS_PAYMENT = eINSTANCE.getErpPayment_TermsPayment();

		/**
		 * The meta object literal for the '<em><b>Erp Rec Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PAYMENT__ERP_REC_LINE_ITEMS = eINSTANCE.getErpPayment_ErpRecLineItems();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpQuoteImpl <em>Erp Quote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpQuoteImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpQuote()
		 * @generated
		 */
		EClass ERP_QUOTE = eINSTANCE.getErpQuote();

		/**
		 * The meta object literal for the '<em><b>Erp Quote Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_QUOTE__ERP_QUOTE_LINE_ITEMS = eINSTANCE.getErpQuote_ErpQuoteLineItems();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPayableImpl <em>Erp Payable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPayableImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpPayable()
		 * @generated
		 */
		EClass ERP_PAYABLE = eINSTANCE.getErpPayable();

		/**
		 * The meta object literal for the '<em><b>Contractor Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PAYABLE__CONTRACTOR_ITEMS = eINSTANCE.getErpPayable_ContractorItems();

		/**
		 * The meta object literal for the '<em><b>Erp Payable Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_PAYABLE__ERP_PAYABLE_LINE_ITEMS = eINSTANCE.getErpPayable_ErpPayableLineItems();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpRequisitionImpl <em>Erp Requisition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpRequisitionImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpRequisition()
		 * @generated
		 */
		EClass ERP_REQUISITION = eINSTANCE.getErpRequisition();

		/**
		 * The meta object literal for the '<em><b>Erp Req Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_REQUISITION__ERP_REQ_LINE_ITEMS = eINSTANCE.getErpRequisition_ErpReqLineItems();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedBudLineItemImpl <em>Erp Led Bud Line Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedBudLineItemImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpLedBudLineItem()
		 * @generated
		 */
		EClass ERP_LED_BUD_LINE_ITEM = eINSTANCE.getErpLedBudLineItem();

		/**
		 * The meta object literal for the '<em><b>Erp Ledger Budget</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_LED_BUD_LINE_ITEM__ERP_LEDGER_BUDGET = eINSTANCE.getErpLedBudLineItem_ErpLedgerBudget();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_LED_BUD_LINE_ITEM__STATUS = eINSTANCE.getErpLedBudLineItem_Status();

		/**
		 * The meta object literal for the '<em><b>Erp Led Bud Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_LED_BUD_LINE_ITEM__ERP_LED_BUD_LINE_ITEM = eINSTANCE.getErpLedBudLineItem_ErpLedBudLineItem();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceImpl <em>Erp Invoice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpInvoice()
		 * @generated
		 */
		EClass ERP_INVOICE = eINSTANCE.getErpInvoice();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_INVOICE__AMOUNT = eINSTANCE.getErpInvoice_Amount();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_INVOICE__KIND = eINSTANCE.getErpInvoice_Kind();

		/**
		 * The meta object literal for the '<em><b>Transaction Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_INVOICE__TRANSACTION_DATE_TIME = eINSTANCE.getErpInvoice_TransactionDateTime();

		/**
		 * The meta object literal for the '<em><b>Reference Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_INVOICE__REFERENCE_NUMBER = eINSTANCE.getErpInvoice_ReferenceNumber();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_INVOICE__DUE_DATE = eINSTANCE.getErpInvoice_DueDate();

		/**
		 * The meta object literal for the '<em><b>Mailed Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_INVOICE__MAILED_DATE = eINSTANCE.getErpInvoice_MailedDate();

		/**
		 * The meta object literal for the '<em><b>Transfer Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_INVOICE__TRANSFER_TYPE = eINSTANCE.getErpInvoice_TransferType();

		/**
		 * The meta object literal for the '<em><b>Customer Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_INVOICE__CUSTOMER_ACCOUNT = eINSTANCE.getErpInvoice_CustomerAccount();

		/**
		 * The meta object literal for the '<em><b>Pro Forma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_INVOICE__PRO_FORMA = eINSTANCE.getErpInvoice_ProForma();

		/**
		 * The meta object literal for the '<em><b>Bill Media Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_INVOICE__BILL_MEDIA_KIND = eINSTANCE.getErpInvoice_BillMediaKind();

		/**
		 * The meta object literal for the '<em><b>Erp Invoice Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_INVOICE__ERP_INVOICE_LINE_ITEMS = eINSTANCE.getErpInvoice_ErpInvoiceLineItems();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpTimeEntryImpl <em>Erp Time Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpTimeEntryImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpTimeEntry()
		 * @generated
		 */
		EClass ERP_TIME_ENTRY = eINSTANCE.getErpTimeEntry();

		/**
		 * The meta object literal for the '<em><b>Erp Project Accounting</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_TIME_ENTRY__ERP_PROJECT_ACCOUNTING = eINSTANCE.getErpTimeEntry_ErpProjectAccounting();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_TIME_ENTRY__STATUS = eINSTANCE.getErpTimeEntry_Status();

		/**
		 * The meta object literal for the '<em><b>Erp Time Sheet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_TIME_ENTRY__ERP_TIME_SHEET = eINSTANCE.getErpTimeEntry_ErpTimeSheet();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpBOMImpl <em>Erp BOM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpBOMImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpBOM()
		 * @generated
		 */
		EClass ERP_BOM = eINSTANCE.getErpBOM();

		/**
		 * The meta object literal for the '<em><b>Erp Bom Item Datas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_BOM__ERP_BOM_ITEM_DATAS = eINSTANCE.getErpBOM_ErpBomItemDatas();

		/**
		 * The meta object literal for the '<em><b>Design</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_BOM__DESIGN = eINSTANCE.getErpBOM_Design();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpJournalEntryImpl <em>Erp Journal Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpJournalEntryImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpJournalEntry()
		 * @generated
		 */
		EClass ERP_JOURNAL_ENTRY = eINSTANCE.getErpJournalEntry();

		/**
		 * The meta object literal for the '<em><b>Account ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_JOURNAL_ENTRY__ACCOUNT_ID = eINSTANCE.getErpJournalEntry_AccountID();

		/**
		 * The meta object literal for the '<em><b>Erp Ledger Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_JOURNAL_ENTRY__ERP_LEDGER_ENTRY = eINSTANCE.getErpJournalEntry_ErpLedgerEntry();

		/**
		 * The meta object literal for the '<em><b>Erp Journal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_JOURNAL_ENTRY__ERP_JOURNAL = eINSTANCE.getErpJournalEntry_ErpJournal();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_JOURNAL_ENTRY__AMOUNT = eINSTANCE.getErpJournalEntry_Amount();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_JOURNAL_ENTRY__STATUS = eINSTANCE.getErpJournalEntry_Status();

		/**
		 * The meta object literal for the '<em><b>Posting Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_JOURNAL_ENTRY__POSTING_DATE_TIME = eINSTANCE.getErpJournalEntry_PostingDateTime();

		/**
		 * The meta object literal for the '<em><b>Transaction Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_JOURNAL_ENTRY__TRANSACTION_DATE_TIME = eINSTANCE.getErpJournalEntry_TransactionDateTime();

		/**
		 * The meta object literal for the '<em><b>Cost Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_JOURNAL_ENTRY__COST_TYPES = eINSTANCE.getErpJournalEntry_CostTypes();

		/**
		 * The meta object literal for the '<em><b>Erp Invoice Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_JOURNAL_ENTRY__ERP_INVOICE_LINE_ITEM = eINSTANCE.getErpJournalEntry_ErpInvoiceLineItem();

		/**
		 * The meta object literal for the '<em><b>Erp Payable Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_JOURNAL_ENTRY__ERP_PAYABLE_LINE_ITEMS = eINSTANCE.getErpJournalEntry_ErpPayableLineItems();

		/**
		 * The meta object literal for the '<em><b>Erp Rec Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_JOURNAL_ENTRY__ERP_REC_LINE_ITEMS = eINSTANCE.getErpJournalEntry_ErpRecLineItems();

		/**
		 * The meta object literal for the '<em><b>Source ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERP_JOURNAL_ENTRY__SOURCE_ID = eINSTANCE.getErpJournalEntry_SourceID();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpRecLineItemImpl <em>Erp Rec Line Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpRecLineItemImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpRecLineItem()
		 * @generated
		 */
		EClass ERP_REC_LINE_ITEM = eINSTANCE.getErpRecLineItem();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_REC_LINE_ITEM__STATUS = eINSTANCE.getErpRecLineItem_Status();

		/**
		 * The meta object literal for the '<em><b>Erp Journal Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_REC_LINE_ITEM__ERP_JOURNAL_ENTRIES = eINSTANCE.getErpRecLineItem_ErpJournalEntries();

		/**
		 * The meta object literal for the '<em><b>Erp Receivable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_REC_LINE_ITEM__ERP_RECEIVABLE = eINSTANCE.getErpRecLineItem_ErpReceivable();

		/**
		 * The meta object literal for the '<em><b>Erp Invoice Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_REC_LINE_ITEM__ERP_INVOICE_LINE_ITEM = eINSTANCE.getErpRecLineItem_ErpInvoiceLineItem();

		/**
		 * The meta object literal for the '<em><b>Erp Payments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_REC_LINE_ITEM__ERP_PAYMENTS = eINSTANCE.getErpRecLineItem_ErpPayments();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpTimeSheetImpl <em>Erp Time Sheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpTimeSheetImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpTimeSheet()
		 * @generated
		 */
		EClass ERP_TIME_SHEET = eINSTANCE.getErpTimeSheet();

		/**
		 * The meta object literal for the '<em><b>Erp Time Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP_TIME_SHEET__ERP_TIME_ENTRIES = eINSTANCE.getErpTimeSheet_ErpTimeEntries();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItemKind <em>Erp Invoice Line Item Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItemKind
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpInvoiceLineItemKind()
		 * @generated
		 */
		EEnum ERP_INVOICE_LINE_ITEM_KIND = eINSTANCE.getErpInvoiceLineItemKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpAccountKind <em>Erp Account Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpAccountKind
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpAccountKind()
		 * @generated
		 */
		EEnum ERP_ACCOUNT_KIND = eINSTANCE.getErpAccountKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceKind <em>Erp Invoice Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceKind
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getErpInvoiceKind()
		 * @generated
		 */
		EEnum ERP_INVOICE_KIND = eINSTANCE.getErpInvoiceKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.BillMediaKind <em>Bill Media Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.BillMediaKind
		 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl#getBillMediaKind()
		 * @generated
		 */
		EEnum BILL_MEDIA_KIND = eINSTANCE.getBillMediaKind();

	}

} //InfERPSupportPackage
