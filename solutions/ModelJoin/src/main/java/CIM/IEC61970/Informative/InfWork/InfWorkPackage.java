/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.CommonPackage;

import CIM.IEC61970.Core.CorePackage;

import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

import CIM.IEC61970.Informative.InfCommon.InfCommonPackage;

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
 * @see CIM.IEC61970.Informative.InfWork.InfWorkFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The package covers all types of work, including inspection, maintenance, repair, restoration, and construction. It covers the full life cycle including request, initiate, track and record work. Standardized designs (compatible units) are used where possible.\n\nTODO: The following has been copied from a very old version of draft Part 11, so the references are wrong, but we store the knowledge here to reuse later:\n\"The Work package is used to define classes related to work. There are several different aspects of work.\nThe Work Initiation (Work, Project, Request).\nThe Work Design package is used for managing designs (CompatibleUnit, Design, DesignLocation, WorkTask).\nThe Work Schedule package is used for the scheduling and coordination of work (AccessPermit, MaterialItem, OneCallRequest, Regulation).\nThe Work Closing package is used for tracking costs of work (CostType, LaborItem, WorkCostDetail, VehicleItem).\nThe Work Standards package is used for the definition of compatible units (CULaborItem, CUVehicleItem, CUGroup).\nThis package is used for inspection and maintenance (InspectionDataSet, Procedure).\nThe WorkService package defines Appointment class.\"'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The package covers all types of work, including inspection, maintenance, repair, restoration, and construction. It covers the full life cycle including request, initiate, track and record work. Standardized designs (compatible units) are used where possible.\n\nTODO: The following has been copied from a very old version of draft Part 11, so the references are wrong, but we store the knowledge here to reuse later:\n\"The Work package is used to define classes related to work. There are several different aspects of work.\nThe Work Initiation (Work, Project, Request).\nThe Work Design package is used for managing designs (CompatibleUnit, Design, DesignLocation, WorkTask).\nThe Work Schedule package is used for the scheduling and coordination of work (AccessPermit, MaterialItem, OneCallRequest, Regulation).\nThe Work Closing package is used for tracking costs of work (CostType, LaborItem, WorkCostDetail, VehicleItem).\nThe Work Standards package is used for the definition of compatible units (CULaborItem, CUVehicleItem, CUGroup).\nThis package is used for inspection and maintenance (InspectionDataSet, Procedure).\nThe WorkService package defines Appointment class.\"'"
 * @generated
 */
public interface InfWorkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "InfWork";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#InfWork";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimInfWork";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfWorkPackage eINSTANCE = CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl.init();

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.WorkFlowStepImpl <em>Work Flow Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.WorkFlowStepImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getWorkFlowStep()
	 * @generated
	 */
	int WORK_FLOW_STEP = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_STEP__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_STEP__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_STEP__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_STEP__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_STEP__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_STEP__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_STEP__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_STEP__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_STEP__SEQUENCE_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Work Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_STEP__WORK_TASKS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_STEP__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Work</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_STEP__WORK = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Work Flow Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_STEP_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Work Flow Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_STEP_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.WorkCostDetailImpl <em>Work Cost Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.WorkCostDetailImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getWorkCostDetail()
	 * @generated
	 */
	int WORK_COST_DETAIL = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Cost Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__COST_TYPE = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contractor Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__CONTRACTOR_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Material Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__MATERIAL_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transaction Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__TRANSACTION_DATE_TIME = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Equipment Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__EQUIPMENT_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Property Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__PROPERTY_UNITS = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__AMOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Design</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__DESIGN = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Misc Cost Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__MISC_COST_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Work Cost Summary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__WORK_COST_SUMMARY = CommonPackage.DOCUMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__WORK_TASK = CommonPackage.DOCUMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Is Debit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__IS_DEBIT = CommonPackage.DOCUMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__TYPE = CommonPackage.DOCUMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Overhead Cost</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__OVERHEAD_COST = CommonPackage.DOCUMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Works</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__WORKS = CommonPackage.DOCUMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Labor Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__LABOR_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Erp Project Accounting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL__ERP_PROJECT_ACCOUNTING = CommonPackage.DOCUMENT_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Work Cost Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Work Cost Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_DETAIL_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.UsageImpl <em>Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.UsageImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getUsage()
	 * @generated
	 */
	int USAGE = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Work Equipment Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__WORK_EQUIPMENT_ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__WORK_TASK = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Material Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__MATERIAL_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.WorkCostSummaryImpl <em>Work Cost Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.WorkCostSummaryImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getWorkCostSummary()
	 * @generated
	 */
	int WORK_COST_SUMMARY = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Work Cost Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY__WORK_COST_DETAIL = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Work Cost Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Work Cost Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_COST_SUMMARY_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.MiscCostItemImpl <em>Misc Cost Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.MiscCostItemImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getMiscCostItem()
	 * @generated
	 */
	int MISC_COST_ITEM = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_COST_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_COST_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_COST_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_COST_ITEM__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_COST_ITEM__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_COST_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_COST_ITEM__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_COST_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_COST_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Design Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_COST_ITEM__DESIGN_LOCATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_COST_ITEM__WORK_TASK = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cost Per Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_COST_ITEM__COST_PER_UNIT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Work Cost Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_COST_ITEM__WORK_COST_DETAIL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_COST_ITEM__QUANTITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_COST_ITEM__ACCOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>External Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_COST_ITEM__EXTERNAL_REF_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Cost Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_COST_ITEM__COST_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Misc Cost Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_COST_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Misc Cost Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_COST_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.CUAllowableActionImpl <em>CU Allowable Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.CUAllowableActionImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getCUAllowableAction()
	 * @generated
	 */
	int CU_ALLOWABLE_ACTION = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ALLOWABLE_ACTION__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ALLOWABLE_ACTION__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ALLOWABLE_ACTION__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ALLOWABLE_ACTION__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ALLOWABLE_ACTION__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ALLOWABLE_ACTION__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ALLOWABLE_ACTION__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ALLOWABLE_ACTION__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Compatible Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ALLOWABLE_ACTION__COMPATIBLE_UNITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ALLOWABLE_ACTION__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CU Allowable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ALLOWABLE_ACTION_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CU Allowable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ALLOWABLE_ACTION_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.CostTypeImpl <em>Cost Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.CostTypeImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getCostType()
	 * @generated
	 */
	int COST_TYPE = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__LEVEL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Journal Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__ERP_JOURNAL_ENTRIES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Work Cost Details</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__WORK_COST_DETAILS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Cost Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__PARENT_COST_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Compatible Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__COMPATIBLE_UNITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Child Cost Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__CHILD_COST_TYPES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Amount Assignment Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__AMOUNT_ASSIGNMENT_FLAG = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__STAGE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Cost Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Cost Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.CUMaterialItemImpl <em>CU Material Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.CUMaterialItemImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getCUMaterialItem()
	 * @generated
	 */
	int CU_MATERIAL_ITEM = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_MATERIAL_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_MATERIAL_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_MATERIAL_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_MATERIAL_ITEM__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_MATERIAL_ITEM__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_MATERIAL_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_MATERIAL_ITEM__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_MATERIAL_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Compatible Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_MATERIAL_ITEM__COMPATIBLE_UNITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_MATERIAL_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_MATERIAL_ITEM__TYPE_MATERIAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_MATERIAL_ITEM__QUANTITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Property Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_MATERIAL_ITEM__PROPERTY_UNITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_MATERIAL_ITEM__CORPORATE_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>CU Material Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_MATERIAL_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>CU Material Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_MATERIAL_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.AssignmentImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__CREWS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Effective Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__EFFECTIVE_PERIOD = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.DesignImpl <em>Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.DesignImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getDesign()
	 * @generated
	 */
	int DESIGN = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Cost Estimate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__COST_ESTIMATE = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Design Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__DESIGN_LOCATIONS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Design Locations CUs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__DESIGN_LOCATIONS_CUS = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Work</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__WORK = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Work Cost Details</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__WORK_COST_DETAILS = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Erp BO Ms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__ERP_BO_MS = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Erp Quote Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__ERP_QUOTE_LINE_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Condition Factors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__CONDITION_FACTORS = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__KIND = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__PRICE = CommonPackage.DOCUMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Work Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__WORK_TASKS = CommonPackage.DOCUMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.BusinessCaseImpl <em>Business Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.BusinessCaseImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getBusinessCase()
	 * @generated
	 */
	int BUSINESS_CASE = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__CORPORATE_CODE = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Works</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__WORKS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE__PROJECTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Business Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Business Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CASE_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.EquipmentItemImpl <em>Equipment Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.EquipmentItemImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getEquipmentItem()
	 * @generated
	 */
	int EQUIPMENT_ITEM = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_ITEM__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_ITEM__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_ITEM__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_ITEM__CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_ITEM__COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Work Cost Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_ITEM__WORK_COST_DETAIL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_ITEM__WORK_TASK = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Equipment Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Equipment Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.OneCallRequestImpl <em>One Call Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.OneCallRequestImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getOneCallRequest()
	 * @generated
	 */
	int ONE_CALL_REQUEST = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Marking Instruction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__MARKING_INSTRUCTION = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Explosives Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__EXPLOSIVES_USED = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Work Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__WORK_LOCATIONS = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Marked Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST__MARKED_INDICATOR = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>One Call Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>One Call Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CALL_REQUEST_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.LaborItemImpl <em>Labor Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.LaborItemImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getLaborItem()
	 * @generated
	 */
	int LABOR_ITEM = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABOR_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABOR_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABOR_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABOR_ITEM__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABOR_ITEM__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABOR_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABOR_ITEM__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABOR_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABOR_ITEM__WORK_TASK = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activity Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABOR_ITEM__ACTIVITY_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABOR_ITEM__COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Erp Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABOR_ITEM__ERP_PERSONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Labor Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABOR_ITEM__LABOR_DURATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Labor Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABOR_ITEM__LABOR_RATE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Work Cost Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABOR_ITEM__WORK_COST_DETAIL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABOR_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Labor Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABOR_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Labor Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABOR_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.ProjectImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Budget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BUDGET = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Project Accounting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ERP_PROJECT_ACCOUNTING = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Works</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__WORKS = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__REQUESTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Business Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BUSINESS_CASE = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sub Projects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SUB_PROJECTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PARENT_PROJECT = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.AccessPermitImpl <em>Access Permit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.AccessPermitImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getAccessPermit()
	 * @generated
	 */
	int ACCESS_PERMIT = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__EXPIRATION_DATE = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Application Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__APPLICATION_NUMBER = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__EFFECTIVE_DATE = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Permit ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__PERMIT_ID = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Payment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT__PAYMENT = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Access Permit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Access Permit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PERMIT_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.InspectionDataSetImpl <em>Inspection Data Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.InspectionDataSetImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getInspectionDataSet()
	 * @generated
	 */
	int INSPECTION_DATA_SET = 16;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__UUID = InfAssetsPackage.PROCEDURE_DATA_SET__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__MRID = InfAssetsPackage.PROCEDURE_DATA_SET__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__NAME = InfAssetsPackage.PROCEDURE_DATA_SET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__DESCRIPTION = InfAssetsPackage.PROCEDURE_DATA_SET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__PATH_NAME = InfAssetsPackage.PROCEDURE_DATA_SET__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__MODELING_AUTHORITY_SET = InfAssetsPackage.PROCEDURE_DATA_SET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__LOCAL_NAME = InfAssetsPackage.PROCEDURE_DATA_SET__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__ALIAS_NAME = InfAssetsPackage.PROCEDURE_DATA_SET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__SUBJECT = InfAssetsPackage.PROCEDURE_DATA_SET__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__SCHEDULED_EVENTS = InfAssetsPackage.PROCEDURE_DATA_SET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__ERP_ORGANISATION_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__CREATED_DATE_TIME = InfAssetsPackage.PROCEDURE_DATA_SET__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__TO_DOCUMENT_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__ASSET_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__ERP_PERSON_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__REVISION_NUMBER = InfAssetsPackage.PROCEDURE_DATA_SET__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__ELECTRONIC_ADDRESS = InfAssetsPackage.PROCEDURE_DATA_SET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__STATUS = InfAssetsPackage.PROCEDURE_DATA_SET__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__NETWORK_DATA_SETS = InfAssetsPackage.PROCEDURE_DATA_SET__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__POWER_SYSTEM_RESOURCE_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__CATEGORY = InfAssetsPackage.PROCEDURE_DATA_SET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__ACTIVITY_RECORDS = InfAssetsPackage.PROCEDURE_DATA_SET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__MEASUREMENTS = InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__FROM_DOCUMENT_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__LAST_MODIFIED_DATE_TIME = InfAssetsPackage.PROCEDURE_DATA_SET__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__CHANGE_SETS = InfAssetsPackage.PROCEDURE_DATA_SET__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__DOC_STATUS = InfAssetsPackage.PROCEDURE_DATA_SET__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__CHANGE_ITEMS = InfAssetsPackage.PROCEDURE_DATA_SET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__SCHEDULE_PARAMETER_INFOS = InfAssetsPackage.PROCEDURE_DATA_SET__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__TITLE = InfAssetsPackage.PROCEDURE_DATA_SET__TITLE;

	/**
	 * The feature id for the '<em><b>Completed Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__COMPLETED_DATE_TIME = InfAssetsPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurement Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__MEASUREMENT_VALUES = InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES;

	/**
	 * The feature id for the '<em><b>Transformer Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__TRANSFORMER_OBSERVATIONS = InfAssetsPackage.PROCEDURE_DATA_SET__TRANSFORMER_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__PROPERTIES = InfAssetsPackage.PROCEDURE_DATA_SET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__PROCEDURE = InfAssetsPackage.PROCEDURE_DATA_SET__PROCEDURE;

	/**
	 * The feature id for the '<em><b>Location Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__LOCATION_CONDITION = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>According To Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inspection Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET_FEATURE_COUNT = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Inspection Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_DATA_SET_OPERATION_COUNT = InfAssetsPackage.PROCEDURE_DATA_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.RegulationImpl <em>Regulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.RegulationImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getRegulation()
	 * @generated
	 */
	int REGULATION = 17;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__REFERENCE_NUMBER = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Regulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Regulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.ShiftPatternImpl <em>Shift Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.ShiftPatternImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getShiftPattern()
	 * @generated
	 */
	int SHIFT_PATTERN = 18;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_PATTERN__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_PATTERN__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_PATTERN__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_PATTERN__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_PATTERN__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_PATTERN__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_PATTERN__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_PATTERN__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Assignment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_PATTERN__ASSIGNMENT_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_PATTERN__CREWS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_PATTERN__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cycle Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_PATTERN__CYCLE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Validity Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_PATTERN__VALIDITY_INTERVAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Shift Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_PATTERN_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Shift Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_PATTERN_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.NonStandardItemImpl <em>Non Standard Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.NonStandardItemImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getNonStandardItem()
	 * @generated
	 */
	int NON_STANDARD_ITEM = 19;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__CODE = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM__AMOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Non Standard Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Non Standard Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_ITEM_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.WorkLocationImpl <em>Work Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.WorkLocationImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getWorkLocation()
	 * @generated
	 */
	int WORK_LOCATION = 20;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__UUID = CommonPackage.LOCATION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__MRID = CommonPackage.LOCATION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__NAME = CommonPackage.LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__DESCRIPTION = CommonPackage.LOCATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__PATH_NAME = CommonPackage.LOCATION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__MODELING_AUTHORITY_SET = CommonPackage.LOCATION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__LOCAL_NAME = CommonPackage.LOCATION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__ALIAS_NAME = CommonPackage.LOCATION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Secondary Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__SECONDARY_ADDRESS = CommonPackage.LOCATION__SECONDARY_ADDRESS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__MEASUREMENTS = CommonPackage.LOCATION__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Directions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__DIRECTIONS = CommonPackage.LOCATION__DIRECTIONS;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__POWER_SYSTEM_RESOURCES = CommonPackage.LOCATION__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Phone2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__PHONE2 = CommonPackage.LOCATION__PHONE2;

	/**
	 * The feature id for the '<em><b>Phone1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__PHONE1 = CommonPackage.LOCATION__PHONE1;

	/**
	 * The feature id for the '<em><b>Land Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__LAND_PROPERTIES = CommonPackage.LOCATION__LAND_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Geo Info Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__GEO_INFO_REFERENCE = CommonPackage.LOCATION__GEO_INFO_REFERENCE;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__DIMENSIONS_INFO = CommonPackage.LOCATION__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__CHANGE_ITEMS = CommonPackage.LOCATION__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Erp Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__ERP_ORGANISATIONS = CommonPackage.LOCATION__ERP_ORGANISATIONS;

	/**
	 * The feature id for the '<em><b>Coordinate Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__COORDINATE_SYSTEMS = CommonPackage.LOCATION__COORDINATE_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__ASSETS = CommonPackage.LOCATION__ASSETS;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__ROUTES = CommonPackage.LOCATION__ROUTES;

	/**
	 * The feature id for the '<em><b>Hazards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__HAZARDS = CommonPackage.LOCATION__HAZARDS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__CATEGORY = CommonPackage.LOCATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Main Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__MAIN_ADDRESS = CommonPackage.LOCATION__MAIN_ADDRESS;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__ELECTRONIC_ADDRESS = CommonPackage.LOCATION__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__CORPORATE_CODE = CommonPackage.LOCATION__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Red Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__RED_LINES = CommonPackage.LOCATION__RED_LINES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__STATUS = CommonPackage.LOCATION__STATUS;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__DIRECTION = CommonPackage.LOCATION__DIRECTION;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__CREWS = CommonPackage.LOCATION__CREWS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__POSITION = CommonPackage.LOCATION__POSITION;

	/**
	 * The feature id for the '<em><b>Subdivision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__SUBDIVISION = CommonPackage.LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__BLOCK = CommonPackage.LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Design Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__DESIGN_LOCATIONS = CommonPackage.LOCATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>One Call Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__ONE_CALL_REQUEST = CommonPackage.LOCATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__LOT = CommonPackage.LOCATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nearest Intersection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION__NEAREST_INTERSECTION = CommonPackage.LOCATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Work Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION_FEATURE_COUNT = CommonPackage.LOCATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Work Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION_OPERATION_COUNT = CommonPackage.LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.DesignLocationCUImpl <em>Design Location CU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.DesignLocationCUImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getDesignLocationCU()
	 * @generated
	 */
	int DESIGN_LOCATION_CU = 21;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION_CU__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION_CU__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION_CU__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION_CU__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION_CU__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION_CU__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION_CU__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION_CU__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Designs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION_CU__DESIGNS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION_CU__REMOVAL_DATE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition Factors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION_CU__CONDITION_FACTORS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compatible Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION_CU__COMPATIBLE_UNITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cu Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION_CU__CU_QUANTITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cu Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION_CU__CU_ACCOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Work Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION_CU__WORK_TASKS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Design Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION_CU__DESIGN_LOCATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION_CU__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Cu Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION_CU__CU_ACTION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Energization Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION_CU__ENERGIZATION_FLAG = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>CU Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION_CU__CU_GROUPS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Cu Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION_CU__CU_USAGE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Design Location CU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION_CU_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Design Location CU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION_CU_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.DesignLocationImpl <em>Design Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.DesignLocationImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getDesignLocation()
	 * @generated
	 */
	int DESIGN_LOCATION = 22;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Span Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION__SPAN_LENGTH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition Factors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION__CONDITION_FACTORS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Material Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION__MATERIAL_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION__DIAGRAMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Work Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION__WORK_LOCATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Design Location CUs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION__DESIGN_LOCATION_CUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Designs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION__DESIGNS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Erp Bom Item Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION__ERP_BOM_ITEM_DATAS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Misc Cost Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION__MISC_COST_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Design Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Design Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LOCATION_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.CULaborCodeImpl <em>CU Labor Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.CULaborCodeImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getCULaborCode()
	 * @generated
	 */
	int CU_LABOR_CODE = 23;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_CODE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_CODE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_CODE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_CODE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_CODE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_CODE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_CODE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_CODE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_CODE__CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_CODE__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CU Labor Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_CODE__CU_LABOR_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CU Labor Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_CODE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>CU Labor Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_CODE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.ConditionFactorImpl <em>Condition Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.ConditionFactorImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getConditionFactor()
	 * @generated
	 */
	int CONDITION_FACTOR = 24;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FACTOR__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FACTOR__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FACTOR__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FACTOR__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FACTOR__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FACTOR__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FACTOR__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FACTOR__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Cf Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FACTOR__CF_VALUE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Design Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FACTOR__DESIGN_LOCATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Design Location CUs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FACTOR__DESIGN_LOCATION_CUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FACTOR__KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Designs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FACTOR__DESIGNS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FACTOR__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Condition Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FACTOR_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Condition Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FACTOR_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.CUWorkEquipmentItemImpl <em>CU Work Equipment Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.CUWorkEquipmentItemImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getCUWorkEquipmentItem()
	 * @generated
	 */
	int CU_WORK_EQUIPMENT_ITEM = 25;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_WORK_EQUIPMENT_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_WORK_EQUIPMENT_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_WORK_EQUIPMENT_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_WORK_EQUIPMENT_ITEM__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_WORK_EQUIPMENT_ITEM__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_WORK_EQUIPMENT_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_WORK_EQUIPMENT_ITEM__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_WORK_EQUIPMENT_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Equip Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_WORK_EQUIPMENT_ITEM__EQUIP_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_WORK_EQUIPMENT_ITEM__RATE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_WORK_EQUIPMENT_ITEM__TYPE_ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compatible Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_WORK_EQUIPMENT_ITEM__COMPATIBLE_UNITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_WORK_EQUIPMENT_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>CU Work Equipment Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_WORK_EQUIPMENT_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>CU Work Equipment Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_WORK_EQUIPMENT_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.QualificationRequirementImpl <em>Qualification Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.QualificationRequirementImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getQualificationRequirement()
	 * @generated
	 */
	int QUALIFICATION_REQUIREMENT = 26;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_REQUIREMENT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_REQUIREMENT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_REQUIREMENT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_REQUIREMENT__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_REQUIREMENT__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_REQUIREMENT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_REQUIREMENT__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_REQUIREMENT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Specifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_REQUIREMENT__SPECIFICATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Work Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_REQUIREMENT__WORK_TASKS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CU Labor Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_REQUIREMENT__CU_LABOR_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_REQUIREMENT__SKILLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Qualification ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_REQUIREMENT__QUALIFICATION_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Qualification Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_REQUIREMENT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Qualification Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_REQUIREMENT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.CUContractorItemImpl <em>CU Contractor Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.CUContractorItemImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getCUContractorItem()
	 * @generated
	 */
	int CU_CONTRACTOR_ITEM = 27;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_CONTRACTOR_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_CONTRACTOR_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_CONTRACTOR_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_CONTRACTOR_ITEM__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_CONTRACTOR_ITEM__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_CONTRACTOR_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_CONTRACTOR_ITEM__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_CONTRACTOR_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Activity Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_CONTRACTOR_ITEM__ACTIVITY_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_CONTRACTOR_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bid Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_CONTRACTOR_ITEM__BID_AMOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compatible Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_CONTRACTOR_ITEM__COMPATIBLE_UNITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>CU Contractor Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_CONTRACTOR_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>CU Contractor Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_CONTRACTOR_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.MaterialItemImpl <em>Material Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.MaterialItemImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getMaterialItem()
	 * @generated
	 */
	int MATERIAL_ITEM = 28;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Erp PO Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM__ERP_PO_LINE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM__TYPE_MATERIAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Inventory Counts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM__ERP_INVENTORY_COUNTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Usages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM__USAGES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Work Cost Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM__WORK_COST_DETAIL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM__WORK_TASK = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM__ACCOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cost Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM__COST_DESCRIPTION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM__QUANTITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Cost Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM__COST_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>External Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM__EXTERNAL_REF_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Erp Rec Delv Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM__ERP_REC_DELV_LINE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Design Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM__DESIGN_LOCATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Actual Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM__ACTUAL_COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Material Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM__MATERIAL_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Material Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Material Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.PropertyUnitImpl <em>Property Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.PropertyUnitImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getPropertyUnit()
	 * @generated
	 */
	int PROPERTY_UNIT = 29;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_UNIT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_UNIT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_UNIT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_UNIT__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_UNIT__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_UNIT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_UNIT__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_UNIT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Work Cost Details</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_UNIT__WORK_COST_DETAILS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_UNIT__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compatible Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_UNIT__COMPATIBLE_UNITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Property Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_UNIT__PROPERTY_ACCOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CU Material Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_UNIT__CU_MATERIAL_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Accounting Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_UNIT__ACCOUNTING_USAGE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Activity Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_UNIT__ACTIVITY_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Property Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_UNIT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Property Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_UNIT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.CompatibleUnitImpl <em>Compatible Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.CompatibleUnitImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getCompatibleUnit()
	 * @generated
	 */
	int COMPATIBLE_UNIT = 30;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Design Location CUs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__DESIGN_LOCATION_CUS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Est Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__EST_COST = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__PROPERTY_UNIT = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CU Labor Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__CU_LABOR_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CU Material Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__CU_MATERIAL_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CU Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__CU_GROUP = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CU Work Equipment Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__CU_WORK_EQUIPMENT_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cost Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__COST_TYPE = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__QUANTITY = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Procedures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__PROCEDURES = CommonPackage.DOCUMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>CU Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__CU_ASSETS = CommonPackage.DOCUMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>CU Allowable Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__CU_ALLOWABLE_ACTION = CommonPackage.DOCUMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>CU Contractor Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT__CU_CONTRACTOR_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Compatible Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Compatible Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBLE_UNIT_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.WorkTaskImpl <em>Work Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.WorkTaskImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getWorkTask()
	 * @generated
	 */
	int WORK_TASK = 31;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__CREWS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Switching Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__SWITCHING_SCHEDULES = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Misc Cost Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__MISC_COST_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Labor Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__LABOR_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__PRIORITY = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Work Flow Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__WORK_FLOW_STEP = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__ASSETS = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__CAPABILITIES = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sched Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__SCHED_OVERRIDE = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Work</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__WORK = CommonPackage.DOCUMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Design Location CUs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__DESIGN_LOCATION_CUS = CommonPackage.DOCUMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Contractor Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__CONTRACTOR_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Design</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__DESIGN = CommonPackage.DOCUMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Equipment Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__EQUIPMENT_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Material Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__MATERIAL_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Work Cost Details</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__WORK_COST_DETAILS = CommonPackage.DOCUMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Qualification Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__QUALIFICATION_REQUIREMENTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Usages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__USAGES = CommonPackage.DOCUMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Overhead Cost</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK__OVERHEAD_COST = CommonPackage.DOCUMENT_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Work Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>Work Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_TASK_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.TypeMaterialImpl <em>Type Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.TypeMaterialImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getTypeMaterial()
	 * @generated
	 */
	int TYPE_MATERIAL = 32;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Erp Issue Inventories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__ERP_ISSUE_INVENTORIES = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stock Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__STOCK_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__QUANTITY = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Erp Req Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__ERP_REQ_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Material Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__MATERIAL_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cost Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__COST_TYPE = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Est Unit Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__EST_UNIT_COST = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CU Material Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL__CU_MATERIAL_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Type Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Type Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MATERIAL_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.CapabilityImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 33;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__CATEGORY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Work Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__WORK_TASKS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Validity Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__VALIDITY_INTERVAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Crew</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__CREW = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Crafts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__CRAFTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Performance Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__PERFORMANCE_FACTOR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.CUAssetImpl <em>CU Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.CUAssetImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getCUAsset()
	 * @generated
	 */
	int CU_ASSET = 34;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ASSET__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ASSET__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ASSET__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ASSET__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ASSET__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ASSET__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ASSET__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ASSET__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Type Asset Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ASSET__TYPE_ASSET_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ASSET__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ASSET__TYPE_ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ASSET__QUANTITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Compatible Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ASSET__COMPATIBLE_UNITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>CU Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ASSET_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>CU Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_ASSET_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.ContractorItemImpl <em>Contractor Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.ContractorItemImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getContractorItem()
	 * @generated
	 */
	int CONTRACTOR_ITEM = 35;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTOR_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTOR_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTOR_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTOR_ITEM__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTOR_ITEM__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTOR_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTOR_ITEM__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTOR_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTOR_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTOR_ITEM__COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activity Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTOR_ITEM__ACTIVITY_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Erp Payables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTOR_ITEM__ERP_PAYABLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Work Cost Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTOR_ITEM__WORK_COST_DETAIL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTOR_ITEM__WORK_TASK = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bid Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTOR_ITEM__BID_AMOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Contractor Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTOR_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Contractor Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTOR_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.InfoQuestionImpl <em>Info Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfoQuestionImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getInfoQuestion()
	 * @generated
	 */
	int INFO_QUESTION = 36;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__ANSWER = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Question Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__QUESTION_TEXT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Answer Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__ANSWER_DATE_TIME = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Question Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__QUESTION_CATEGORY = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Answer Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__ANSWER_REMARK = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Question Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__QUESTION_REMARK = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Question Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION__QUESTION_CODE = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Info Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Info Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_QUESTION_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.WorkStatusEntryImpl <em>Work Status Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.WorkStatusEntryImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getWorkStatusEntry()
	 * @generated
	 */
	int WORK_STATUS_ENTRY = 37;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATUS_ENTRY__UUID = CommonPackage.ACTIVITY_RECORD__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATUS_ENTRY__MRID = CommonPackage.ACTIVITY_RECORD__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATUS_ENTRY__NAME = CommonPackage.ACTIVITY_RECORD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATUS_ENTRY__DESCRIPTION = CommonPackage.ACTIVITY_RECORD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATUS_ENTRY__PATH_NAME = CommonPackage.ACTIVITY_RECORD__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATUS_ENTRY__MODELING_AUTHORITY_SET = CommonPackage.ACTIVITY_RECORD__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATUS_ENTRY__LOCAL_NAME = CommonPackage.ACTIVITY_RECORD__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATUS_ENTRY__ALIAS_NAME = CommonPackage.ACTIVITY_RECORD__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Market Factors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATUS_ENTRY__MARKET_FACTORS = CommonPackage.ACTIVITY_RECORD__MARKET_FACTORS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATUS_ENTRY__ASSETS = CommonPackage.ACTIVITY_RECORD__ASSETS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATUS_ENTRY__SEVERITY = CommonPackage.ACTIVITY_RECORD__SEVERITY;

	/**
	 * The feature id for the '<em><b>Scheduled Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATUS_ENTRY__SCHEDULED_EVENT = CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATUS_ENTRY__CATEGORY = CommonPackage.ACTIVITY_RECORD__CATEGORY;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATUS_ENTRY__REASON = CommonPackage.ACTIVITY_RECORD__REASON;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATUS_ENTRY__STATUS = CommonPackage.ACTIVITY_RECORD__STATUS;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATUS_ENTRY__DOCUMENTS = CommonPackage.ACTIVITY_RECORD__DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATUS_ENTRY__ORGANISATIONS = CommonPackage.ACTIVITY_RECORD__ORGANISATIONS;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATUS_ENTRY__CREATED_DATE_TIME = CommonPackage.ACTIVITY_RECORD__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Erp Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATUS_ENTRY__ERP_PERSONS = CommonPackage.ACTIVITY_RECORD__ERP_PERSONS;

	/**
	 * The feature id for the '<em><b>Percent Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATUS_ENTRY__PERCENT_COMPLETE = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Work Status Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATUS_ENTRY_FEATURE_COUNT = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Work Status Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATUS_ENTRY_OPERATION_COUNT = CommonPackage.ACTIVITY_RECORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.AppointmentImpl <em>Appointment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.AppointmentImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getAppointment()
	 * @generated
	 */
	int APPOINTMENT = 38;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__UUID = InfCommonPackage.SCHEDULED_EVENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__MRID = InfCommonPackage.SCHEDULED_EVENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__NAME = InfCommonPackage.SCHEDULED_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__DESCRIPTION = InfCommonPackage.SCHEDULED_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__PATH_NAME = InfCommonPackage.SCHEDULED_EVENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__MODELING_AUTHORITY_SET = InfCommonPackage.SCHEDULED_EVENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__LOCAL_NAME = InfCommonPackage.SCHEDULED_EVENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__ALIAS_NAME = InfCommonPackage.SCHEDULED_EVENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__DOCUMENT = InfCommonPackage.SCHEDULED_EVENT__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Time Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__TIME_POINT = InfCommonPackage.SCHEDULED_EVENT__TIME_POINT;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__DURATION = InfCommonPackage.SCHEDULED_EVENT__DURATION;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__SCHEDULE_PARAMETER_INFO = InfCommonPackage.SCHEDULED_EVENT__SCHEDULE_PARAMETER_INFO;

	/**
	 * The feature id for the '<em><b>Activity Record</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__ACTIVITY_RECORD = InfCommonPackage.SCHEDULED_EVENT__ACTIVITY_RECORD;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__CATEGORY = InfCommonPackage.SCHEDULED_EVENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__ASSETS = InfCommonPackage.SCHEDULED_EVENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__STATUS = InfCommonPackage.SCHEDULED_EVENT__STATUS;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__REMARK = InfCommonPackage.SCHEDULED_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__ADDRESS = InfCommonPackage.SCHEDULED_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Call Back</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__CALL_BACK = InfCommonPackage.SCHEDULED_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Meeting Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__MEETING_INTERVAL = InfCommonPackage.SCHEDULED_EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Erp Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__ERP_PERSONS = InfCommonPackage.SCHEDULED_EVENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Call Ahead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__CALL_AHEAD = InfCommonPackage.SCHEDULED_EVENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Appointment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT_FEATURE_COUNT = InfCommonPackage.SCHEDULED_EVENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Appointment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT_OPERATION_COUNT = InfCommonPackage.SCHEDULED_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.MaintenanceDataSetImpl <em>Maintenance Data Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.MaintenanceDataSetImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getMaintenanceDataSet()
	 * @generated
	 */
	int MAINTENANCE_DATA_SET = 39;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__UUID = InfAssetsPackage.PROCEDURE_DATA_SET__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__MRID = InfAssetsPackage.PROCEDURE_DATA_SET__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__NAME = InfAssetsPackage.PROCEDURE_DATA_SET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__DESCRIPTION = InfAssetsPackage.PROCEDURE_DATA_SET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__PATH_NAME = InfAssetsPackage.PROCEDURE_DATA_SET__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__MODELING_AUTHORITY_SET = InfAssetsPackage.PROCEDURE_DATA_SET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__LOCAL_NAME = InfAssetsPackage.PROCEDURE_DATA_SET__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__ALIAS_NAME = InfAssetsPackage.PROCEDURE_DATA_SET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__SUBJECT = InfAssetsPackage.PROCEDURE_DATA_SET__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__SCHEDULED_EVENTS = InfAssetsPackage.PROCEDURE_DATA_SET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__ERP_ORGANISATION_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__CREATED_DATE_TIME = InfAssetsPackage.PROCEDURE_DATA_SET__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__TO_DOCUMENT_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__ASSET_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__ERP_PERSON_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__REVISION_NUMBER = InfAssetsPackage.PROCEDURE_DATA_SET__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__ELECTRONIC_ADDRESS = InfAssetsPackage.PROCEDURE_DATA_SET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__STATUS = InfAssetsPackage.PROCEDURE_DATA_SET__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__NETWORK_DATA_SETS = InfAssetsPackage.PROCEDURE_DATA_SET__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__POWER_SYSTEM_RESOURCE_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__CATEGORY = InfAssetsPackage.PROCEDURE_DATA_SET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__ACTIVITY_RECORDS = InfAssetsPackage.PROCEDURE_DATA_SET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__MEASUREMENTS = InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__FROM_DOCUMENT_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__LAST_MODIFIED_DATE_TIME = InfAssetsPackage.PROCEDURE_DATA_SET__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__CHANGE_SETS = InfAssetsPackage.PROCEDURE_DATA_SET__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__DOC_STATUS = InfAssetsPackage.PROCEDURE_DATA_SET__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__CHANGE_ITEMS = InfAssetsPackage.PROCEDURE_DATA_SET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__SCHEDULE_PARAMETER_INFOS = InfAssetsPackage.PROCEDURE_DATA_SET__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__TITLE = InfAssetsPackage.PROCEDURE_DATA_SET__TITLE;

	/**
	 * The feature id for the '<em><b>Completed Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__COMPLETED_DATE_TIME = InfAssetsPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurement Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__MEASUREMENT_VALUES = InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES;

	/**
	 * The feature id for the '<em><b>Transformer Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__TRANSFORMER_OBSERVATIONS = InfAssetsPackage.PROCEDURE_DATA_SET__TRANSFORMER_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__PROPERTIES = InfAssetsPackage.PROCEDURE_DATA_SET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__PROCEDURE = InfAssetsPackage.PROCEDURE_DATA_SET__PROCEDURE;

	/**
	 * The feature id for the '<em><b>Maint Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__MAINT_CODE = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__CONDITION_BEFORE = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET__CONDITION_AFTER = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Maintenance Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET_FEATURE_COUNT = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Maintenance Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_DATA_SET_OPERATION_COUNT = InfAssetsPackage.PROCEDURE_DATA_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.CUGroupImpl <em>CU Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.CUGroupImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getCUGroup()
	 * @generated
	 */
	int CU_GROUP = 40;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_GROUP__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_GROUP__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_GROUP__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_GROUP__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_GROUP__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_GROUP__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_GROUP__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_GROUP__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Child CU Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_GROUP__CHILD_CU_GROUPS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent CU Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_GROUP__PARENT_CU_GROUPS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Design Location CUs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_GROUP__DESIGN_LOCATION_CUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compatible Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_GROUP__COMPATIBLE_UNITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_GROUP__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>CU Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_GROUP_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>CU Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_GROUP_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.CrewImpl <em>Crew</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.CrewImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getCrew()
	 * @generated
	 */
	int CREW = 41;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Work Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__WORK_TASKS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__ASSIGNMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shift Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__SHIFT_PATTERNS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__ROUTE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__TOOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vehicles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__VEHICLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__CATEGORY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Crew Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__CREW_MEMBERS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Work Equipment Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__WORK_EQUIPMENT_ASSETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__LOCATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__ORGANISATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Switching Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__SWITCHING_SCHEDULES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__CAPABILITIES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Outage Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__OUTAGE_STEPS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Crew</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Crew</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.RequestImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 42;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__PRIORITY = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__ORGANISATION = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__CORPORATE_CODE = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Works</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__WORKS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Erp Quote Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__ERP_QUOTE_LINE_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__PROJECTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action Needed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__ACTION_NEEDED = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.OverheadCostImpl <em>Overhead Cost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.OverheadCostImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getOverheadCost()
	 * @generated
	 */
	int OVERHEAD_COST = 43;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_COST__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_COST__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_COST__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_COST__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_COST__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_COST__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_COST__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_COST__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_COST__CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_COST__COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Work Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_COST__WORK_TASKS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_COST__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Work Cost Details</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_COST__WORK_COST_DETAILS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Overhead Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_COST_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Overhead Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_COST_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.DiagnosisDataSetImpl <em>Diagnosis Data Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.DiagnosisDataSetImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getDiagnosisDataSet()
	 * @generated
	 */
	int DIAGNOSIS_DATA_SET = 44;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__UUID = InfAssetsPackage.PROCEDURE_DATA_SET__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__MRID = InfAssetsPackage.PROCEDURE_DATA_SET__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__NAME = InfAssetsPackage.PROCEDURE_DATA_SET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__DESCRIPTION = InfAssetsPackage.PROCEDURE_DATA_SET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__PATH_NAME = InfAssetsPackage.PROCEDURE_DATA_SET__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__MODELING_AUTHORITY_SET = InfAssetsPackage.PROCEDURE_DATA_SET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__LOCAL_NAME = InfAssetsPackage.PROCEDURE_DATA_SET__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__ALIAS_NAME = InfAssetsPackage.PROCEDURE_DATA_SET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__SUBJECT = InfAssetsPackage.PROCEDURE_DATA_SET__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__SCHEDULED_EVENTS = InfAssetsPackage.PROCEDURE_DATA_SET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__ERP_ORGANISATION_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__CREATED_DATE_TIME = InfAssetsPackage.PROCEDURE_DATA_SET__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__TO_DOCUMENT_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__ASSET_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__ERP_PERSON_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__REVISION_NUMBER = InfAssetsPackage.PROCEDURE_DATA_SET__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__ELECTRONIC_ADDRESS = InfAssetsPackage.PROCEDURE_DATA_SET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__STATUS = InfAssetsPackage.PROCEDURE_DATA_SET__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__NETWORK_DATA_SETS = InfAssetsPackage.PROCEDURE_DATA_SET__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__POWER_SYSTEM_RESOURCE_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__CATEGORY = InfAssetsPackage.PROCEDURE_DATA_SET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__ACTIVITY_RECORDS = InfAssetsPackage.PROCEDURE_DATA_SET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__MEASUREMENTS = InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__FROM_DOCUMENT_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__LAST_MODIFIED_DATE_TIME = InfAssetsPackage.PROCEDURE_DATA_SET__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__CHANGE_SETS = InfAssetsPackage.PROCEDURE_DATA_SET__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__DOC_STATUS = InfAssetsPackage.PROCEDURE_DATA_SET__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__CHANGE_ITEMS = InfAssetsPackage.PROCEDURE_DATA_SET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__SCHEDULE_PARAMETER_INFOS = InfAssetsPackage.PROCEDURE_DATA_SET__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__TITLE = InfAssetsPackage.PROCEDURE_DATA_SET__TITLE;

	/**
	 * The feature id for the '<em><b>Completed Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__COMPLETED_DATE_TIME = InfAssetsPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurement Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__MEASUREMENT_VALUES = InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES;

	/**
	 * The feature id for the '<em><b>Transformer Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__TRANSFORMER_OBSERVATIONS = InfAssetsPackage.PROCEDURE_DATA_SET__TRANSFORMER_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__PROPERTIES = InfAssetsPackage.PROCEDURE_DATA_SET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__PROCEDURE = InfAssetsPackage.PROCEDURE_DATA_SET__PROCEDURE;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__PHASE_CODE = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__FINAL_CODE = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__EFFECT = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Failure Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__FAILURE_MODE = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Root Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__ROOT_ORIGIN = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Final Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__FINAL_CAUSE = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Root Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__ROOT_REMARK = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Root Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__ROOT_CAUSE = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Preliminary Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__PRELIMINARY_REMARK = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Preliminary Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__PRELIMINARY_CODE = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Preliminary Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__PRELIMINARY_DATE_TIME = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Final Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__FINAL_REMARK = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Final Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET__FINAL_ORIGIN = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Diagnosis Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET_FEATURE_COUNT = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Diagnosis Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSIS_DATA_SET_OPERATION_COUNT = InfAssetsPackage.PROCEDURE_DATA_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.impl.CULaborItemImpl <em>CU Labor Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.impl.CULaborItemImpl
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getCULaborItem()
	 * @generated
	 */
	int CU_LABOR_ITEM = 45;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_ITEM__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_ITEM__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_ITEM__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Qualification Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_ITEM__QUALIFICATION_REQUIREMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CU Labor Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_ITEM__CU_LABOR_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activity Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_ITEM__ACTIVITY_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Labor Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_ITEM__LABOR_DURATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Compatible Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_ITEM__COMPATIBLE_UNITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Labor Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_ITEM__LABOR_RATE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>CU Labor Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>CU Labor Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CU_LABOR_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.DesignKind <em>Design Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.DesignKind
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getDesignKind()
	 * @generated
	 */
	int DESIGN_KIND = 46;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.ConditionFactorKind <em>Condition Factor Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.ConditionFactorKind
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getConditionFactorKind()
	 * @generated
	 */
	int CONDITION_FACTOR_KIND = 47;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfWork.WorkActionKind <em>Work Action Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfWork.WorkActionKind
	 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getWorkActionKind()
	 * @generated
	 */
	int WORK_ACTION_KIND = 48;


	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.WorkFlowStep <em>Work Flow Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Flow Step</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkFlowStep
	 * @generated
	 */
	EClass getWorkFlowStep();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.WorkFlowStep#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkFlowStep#getSequenceNumber()
	 * @see #getWorkFlowStep()
	 * @generated
	 */
	EAttribute getWorkFlowStep_SequenceNumber();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.WorkFlowStep#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Tasks</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkFlowStep#getWorkTasks()
	 * @see #getWorkFlowStep()
	 * @generated
	 */
	EReference getWorkFlowStep_WorkTasks();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.WorkFlowStep#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkFlowStep#getStatus()
	 * @see #getWorkFlowStep()
	 * @generated
	 */
	EReference getWorkFlowStep_Status();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.WorkFlowStep#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkFlowStep#getWork()
	 * @see #getWorkFlowStep()
	 * @generated
	 */
	EReference getWorkFlowStep_Work();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Cost Detail</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail
	 * @generated
	 */
	EClass getWorkCostDetail();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#getCostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Type</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#getCostType()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	EReference getWorkCostDetail_CostType();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#getContractorItems <em>Contractor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contractor Items</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#getContractorItems()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	EReference getWorkCostDetail_ContractorItems();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#getMaterialItems <em>Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Material Items</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#getMaterialItems()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	EReference getWorkCostDetail_MaterialItems();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#getTransactionDateTime <em>Transaction Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Date Time</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#getTransactionDateTime()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	EAttribute getWorkCostDetail_TransactionDateTime();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#getEquipmentItems <em>Equipment Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equipment Items</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#getEquipmentItems()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	EReference getWorkCostDetail_EquipmentItems();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#getPropertyUnits <em>Property Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Property Units</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#getPropertyUnits()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	EReference getWorkCostDetail_PropertyUnits();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#getAmount()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	EAttribute getWorkCostDetail_Amount();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Design</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#getDesign()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	EReference getWorkCostDetail_Design();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#getMiscCostItems <em>Misc Cost Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Misc Cost Items</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#getMiscCostItems()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	EReference getWorkCostDetail_MiscCostItems();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#getWorkCostSummary <em>Work Cost Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Cost Summary</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#getWorkCostSummary()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	EReference getWorkCostDetail_WorkCostSummary();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Task</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#getWorkTask()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	EReference getWorkCostDetail_WorkTask();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#isIsDebit <em>Is Debit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Debit</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#isIsDebit()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	EAttribute getWorkCostDetail_IsDebit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#getType()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	EAttribute getWorkCostDetail_Type();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#getOverheadCost <em>Overhead Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Overhead Cost</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#getOverheadCost()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	EReference getWorkCostDetail_OverheadCost();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Works</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#getWorks()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	EReference getWorkCostDetail_Works();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#getLaborItems <em>Labor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Labor Items</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#getLaborItems()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	EReference getWorkCostDetail_LaborItems();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#getErpProjectAccounting <em>Erp Project Accounting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Project Accounting</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#getErpProjectAccounting()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	EReference getWorkCostDetail_ErpProjectAccounting();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.Usage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Usage
	 * @generated
	 */
	EClass getUsage();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.Usage#getWorkEquipmentAsset <em>Work Equipment Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Equipment Asset</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Usage#getWorkEquipmentAsset()
	 * @see #getUsage()
	 * @generated
	 */
	EReference getUsage_WorkEquipmentAsset();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.Usage#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Task</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Usage#getWorkTask()
	 * @see #getUsage()
	 * @generated
	 */
	EReference getUsage_WorkTask();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.Usage#getMaterialItem <em>Material Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Material Item</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Usage#getMaterialItem()
	 * @see #getUsage()
	 * @generated
	 */
	EReference getUsage_MaterialItem();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.Usage#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Usage#getStatus()
	 * @see #getUsage()
	 * @generated
	 */
	EReference getUsage_Status();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.WorkCostSummary <em>Work Cost Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Cost Summary</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostSummary
	 * @generated
	 */
	EClass getWorkCostSummary();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.WorkCostSummary#getWorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Cost Detail</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostSummary#getWorkCostDetail()
	 * @see #getWorkCostSummary()
	 * @generated
	 */
	EReference getWorkCostSummary_WorkCostDetail();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.MiscCostItem <em>Misc Cost Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Misc Cost Item</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MiscCostItem
	 * @generated
	 */
	EClass getMiscCostItem();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.MiscCostItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MiscCostItem#getStatus()
	 * @see #getMiscCostItem()
	 * @generated
	 */
	EReference getMiscCostItem_Status();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.MiscCostItem#getDesignLocation <em>Design Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Design Location</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MiscCostItem#getDesignLocation()
	 * @see #getMiscCostItem()
	 * @generated
	 */
	EReference getMiscCostItem_DesignLocation();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.MiscCostItem#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Task</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MiscCostItem#getWorkTask()
	 * @see #getMiscCostItem()
	 * @generated
	 */
	EReference getMiscCostItem_WorkTask();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.MiscCostItem#getCostPerUnit <em>Cost Per Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Per Unit</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MiscCostItem#getCostPerUnit()
	 * @see #getMiscCostItem()
	 * @generated
	 */
	EAttribute getMiscCostItem_CostPerUnit();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.MiscCostItem#getWorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Cost Detail</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MiscCostItem#getWorkCostDetail()
	 * @see #getMiscCostItem()
	 * @generated
	 */
	EReference getMiscCostItem_WorkCostDetail();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.MiscCostItem#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MiscCostItem#getQuantity()
	 * @see #getMiscCostItem()
	 * @generated
	 */
	EAttribute getMiscCostItem_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.MiscCostItem#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MiscCostItem#getAccount()
	 * @see #getMiscCostItem()
	 * @generated
	 */
	EAttribute getMiscCostItem_Account();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.MiscCostItem#getExternalRefID <em>External Ref ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Ref ID</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MiscCostItem#getExternalRefID()
	 * @see #getMiscCostItem()
	 * @generated
	 */
	EAttribute getMiscCostItem_ExternalRefID();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.MiscCostItem#getCostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Type</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MiscCostItem#getCostType()
	 * @see #getMiscCostItem()
	 * @generated
	 */
	EAttribute getMiscCostItem_CostType();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.CUAllowableAction <em>CU Allowable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CU Allowable Action</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUAllowableAction
	 * @generated
	 */
	EClass getCUAllowableAction();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.CUAllowableAction#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compatible Units</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUAllowableAction#getCompatibleUnits()
	 * @see #getCUAllowableAction()
	 * @generated
	 */
	EReference getCUAllowableAction_CompatibleUnits();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.CUAllowableAction#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUAllowableAction#getStatus()
	 * @see #getCUAllowableAction()
	 * @generated
	 */
	EReference getCUAllowableAction_Status();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.CostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cost Type</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CostType
	 * @generated
	 */
	EClass getCostType();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.CostType#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CostType#getLevel()
	 * @see #getCostType()
	 * @generated
	 */
	EAttribute getCostType_Level();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.CostType#getErpJournalEntries <em>Erp Journal Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Journal Entries</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CostType#getErpJournalEntries()
	 * @see #getCostType()
	 * @generated
	 */
	EReference getCostType_ErpJournalEntries();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.CostType#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Cost Details</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CostType#getWorkCostDetails()
	 * @see #getCostType()
	 * @generated
	 */
	EReference getCostType_WorkCostDetails();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.CostType#getParentCostType <em>Parent Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Cost Type</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CostType#getParentCostType()
	 * @see #getCostType()
	 * @generated
	 */
	EReference getCostType_ParentCostType();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.CostType#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compatible Units</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CostType#getCompatibleUnits()
	 * @see #getCostType()
	 * @generated
	 */
	EReference getCostType_CompatibleUnits();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.CostType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CostType#getStatus()
	 * @see #getCostType()
	 * @generated
	 */
	EReference getCostType_Status();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.CostType#getChildCostTypes <em>Child Cost Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Cost Types</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CostType#getChildCostTypes()
	 * @see #getCostType()
	 * @generated
	 */
	EReference getCostType_ChildCostTypes();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.CostType#isAmountAssignmentFlag <em>Amount Assignment Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Assignment Flag</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CostType#isAmountAssignmentFlag()
	 * @see #getCostType()
	 * @generated
	 */
	EAttribute getCostType_AmountAssignmentFlag();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.CostType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CostType#getCode()
	 * @see #getCostType()
	 * @generated
	 */
	EAttribute getCostType_Code();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.CostType#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stage</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CostType#getStage()
	 * @see #getCostType()
	 * @generated
	 */
	EAttribute getCostType_Stage();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.CUMaterialItem <em>CU Material Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CU Material Item</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUMaterialItem
	 * @generated
	 */
	EClass getCUMaterialItem();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.CUMaterialItem#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compatible Units</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUMaterialItem#getCompatibleUnits()
	 * @see #getCUMaterialItem()
	 * @generated
	 */
	EReference getCUMaterialItem_CompatibleUnits();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.CUMaterialItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUMaterialItem#getStatus()
	 * @see #getCUMaterialItem()
	 * @generated
	 */
	EReference getCUMaterialItem_Status();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.CUMaterialItem#getTypeMaterial <em>Type Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Material</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUMaterialItem#getTypeMaterial()
	 * @see #getCUMaterialItem()
	 * @generated
	 */
	EReference getCUMaterialItem_TypeMaterial();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.CUMaterialItem#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUMaterialItem#getQuantity()
	 * @see #getCUMaterialItem()
	 * @generated
	 */
	EAttribute getCUMaterialItem_Quantity();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.CUMaterialItem#getPropertyUnits <em>Property Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Property Units</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUMaterialItem#getPropertyUnits()
	 * @see #getCUMaterialItem()
	 * @generated
	 */
	EReference getCUMaterialItem_PropertyUnits();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.CUMaterialItem#getCorporateCode <em>Corporate Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corporate Code</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUMaterialItem#getCorporateCode()
	 * @see #getCUMaterialItem()
	 * @generated
	 */
	EAttribute getCUMaterialItem_CorporateCode();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Assignment#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crews</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Assignment#getCrews()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Crews();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.Assignment#getEffectivePeriod <em>Effective Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Effective Period</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Assignment#getEffectivePeriod()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_EffectivePeriod();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.Design <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Design
	 * @generated
	 */
	EClass getDesign();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.Design#getCostEstimate <em>Cost Estimate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Estimate</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Design#getCostEstimate()
	 * @see #getDesign()
	 * @generated
	 */
	EAttribute getDesign_CostEstimate();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Design#getDesignLocations <em>Design Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Design Locations</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Design#getDesignLocations()
	 * @see #getDesign()
	 * @generated
	 */
	EReference getDesign_DesignLocations();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Design#getDesignLocationsCUs <em>Design Locations CUs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Design Locations CUs</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Design#getDesignLocationsCUs()
	 * @see #getDesign()
	 * @generated
	 */
	EReference getDesign_DesignLocationsCUs();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.Design#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Design#getWork()
	 * @see #getDesign()
	 * @generated
	 */
	EReference getDesign_Work();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Design#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Cost Details</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Design#getWorkCostDetails()
	 * @see #getDesign()
	 * @generated
	 */
	EReference getDesign_WorkCostDetails();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Design#getErpBOMs <em>Erp BO Ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp BO Ms</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Design#getErpBOMs()
	 * @see #getDesign()
	 * @generated
	 */
	EReference getDesign_ErpBOMs();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.Design#getErpQuoteLineItem <em>Erp Quote Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Quote Line Item</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Design#getErpQuoteLineItem()
	 * @see #getDesign()
	 * @generated
	 */
	EReference getDesign_ErpQuoteLineItem();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Design#getConditionFactors <em>Condition Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Condition Factors</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Design#getConditionFactors()
	 * @see #getDesign()
	 * @generated
	 */
	EReference getDesign_ConditionFactors();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.Design#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Design#getKind()
	 * @see #getDesign()
	 * @generated
	 */
	EAttribute getDesign_Kind();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.Design#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Design#getPrice()
	 * @see #getDesign()
	 * @generated
	 */
	EAttribute getDesign_Price();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Design#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Tasks</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Design#getWorkTasks()
	 * @see #getDesign()
	 * @generated
	 */
	EReference getDesign_WorkTasks();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.BusinessCase <em>Business Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Case</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.BusinessCase
	 * @generated
	 */
	EClass getBusinessCase();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.BusinessCase#getCorporateCode <em>Corporate Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corporate Code</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.BusinessCase#getCorporateCode()
	 * @see #getBusinessCase()
	 * @generated
	 */
	EAttribute getBusinessCase_CorporateCode();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.BusinessCase#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Works</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.BusinessCase#getWorks()
	 * @see #getBusinessCase()
	 * @generated
	 */
	EReference getBusinessCase_Works();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.BusinessCase#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Projects</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.BusinessCase#getProjects()
	 * @see #getBusinessCase()
	 * @generated
	 */
	EReference getBusinessCase_Projects();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.EquipmentItem <em>Equipment Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipment Item</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.EquipmentItem
	 * @generated
	 */
	EClass getEquipmentItem();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.EquipmentItem#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.EquipmentItem#getCode()
	 * @see #getEquipmentItem()
	 * @generated
	 */
	EAttribute getEquipmentItem_Code();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.EquipmentItem#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.EquipmentItem#getCost()
	 * @see #getEquipmentItem()
	 * @generated
	 */
	EAttribute getEquipmentItem_Cost();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.EquipmentItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.EquipmentItem#getStatus()
	 * @see #getEquipmentItem()
	 * @generated
	 */
	EReference getEquipmentItem_Status();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.EquipmentItem#getWorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Cost Detail</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.EquipmentItem#getWorkCostDetail()
	 * @see #getEquipmentItem()
	 * @generated
	 */
	EReference getEquipmentItem_WorkCostDetail();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.EquipmentItem#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Task</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.EquipmentItem#getWorkTask()
	 * @see #getEquipmentItem()
	 * @generated
	 */
	EReference getEquipmentItem_WorkTask();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.OneCallRequest <em>One Call Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Call Request</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.OneCallRequest
	 * @generated
	 */
	EClass getOneCallRequest();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.OneCallRequest#getMarkingInstruction <em>Marking Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marking Instruction</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.OneCallRequest#getMarkingInstruction()
	 * @see #getOneCallRequest()
	 * @generated
	 */
	EAttribute getOneCallRequest_MarkingInstruction();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.OneCallRequest#isExplosivesUsed <em>Explosives Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explosives Used</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.OneCallRequest#isExplosivesUsed()
	 * @see #getOneCallRequest()
	 * @generated
	 */
	EAttribute getOneCallRequest_ExplosivesUsed();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.OneCallRequest#getWorkLocations <em>Work Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Locations</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.OneCallRequest#getWorkLocations()
	 * @see #getOneCallRequest()
	 * @generated
	 */
	EReference getOneCallRequest_WorkLocations();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.OneCallRequest#isMarkedIndicator <em>Marked Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marked Indicator</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.OneCallRequest#isMarkedIndicator()
	 * @see #getOneCallRequest()
	 * @generated
	 */
	EAttribute getOneCallRequest_MarkedIndicator();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.LaborItem <em>Labor Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labor Item</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.LaborItem
	 * @generated
	 */
	EClass getLaborItem();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.LaborItem#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Task</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.LaborItem#getWorkTask()
	 * @see #getLaborItem()
	 * @generated
	 */
	EReference getLaborItem_WorkTask();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.LaborItem#getActivityCode <em>Activity Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Code</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.LaborItem#getActivityCode()
	 * @see #getLaborItem()
	 * @generated
	 */
	EAttribute getLaborItem_ActivityCode();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.LaborItem#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.LaborItem#getCost()
	 * @see #getLaborItem()
	 * @generated
	 */
	EAttribute getLaborItem_Cost();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.LaborItem#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Persons</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.LaborItem#getErpPersons()
	 * @see #getLaborItem()
	 * @generated
	 */
	EReference getLaborItem_ErpPersons();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.LaborItem#getLaborDuration <em>Labor Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Labor Duration</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.LaborItem#getLaborDuration()
	 * @see #getLaborItem()
	 * @generated
	 */
	EAttribute getLaborItem_LaborDuration();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.LaborItem#getLaborRate <em>Labor Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Labor Rate</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.LaborItem#getLaborRate()
	 * @see #getLaborItem()
	 * @generated
	 */
	EAttribute getLaborItem_LaborRate();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.LaborItem#getWorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Cost Detail</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.LaborItem#getWorkCostDetail()
	 * @see #getLaborItem()
	 * @generated
	 */
	EReference getLaborItem_WorkCostDetail();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.LaborItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.LaborItem#getStatus()
	 * @see #getLaborItem()
	 * @generated
	 */
	EReference getLaborItem_Status();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.Project#getBudget <em>Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Project#getBudget()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Budget();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.Project#getErpProjectAccounting <em>Erp Project Accounting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Project Accounting</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Project#getErpProjectAccounting()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_ErpProjectAccounting();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Project#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Works</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Project#getWorks()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Works();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Project#getRequests <em>Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requests</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Project#getRequests()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Requests();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.Project#getBusinessCase <em>Business Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Business Case</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Project#getBusinessCase()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_BusinessCase();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Project#getSubProjects <em>Sub Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Projects</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Project#getSubProjects()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_SubProjects();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.Project#getParentProject <em>Parent Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Project</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Project#getParentProject()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_ParentProject();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.AccessPermit <em>Access Permit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Permit</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.AccessPermit
	 * @generated
	 */
	EClass getAccessPermit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.AccessPermit#getExpirationDate <em>Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Date</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.AccessPermit#getExpirationDate()
	 * @see #getAccessPermit()
	 * @generated
	 */
	EAttribute getAccessPermit_ExpirationDate();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.AccessPermit#getApplicationNumber <em>Application Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Number</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.AccessPermit#getApplicationNumber()
	 * @see #getAccessPermit()
	 * @generated
	 */
	EAttribute getAccessPermit_ApplicationNumber();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.AccessPermit#getEffectiveDate <em>Effective Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Date</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.AccessPermit#getEffectiveDate()
	 * @see #getAccessPermit()
	 * @generated
	 */
	EAttribute getAccessPermit_EffectiveDate();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.AccessPermit#getPermitID <em>Permit ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permit ID</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.AccessPermit#getPermitID()
	 * @see #getAccessPermit()
	 * @generated
	 */
	EAttribute getAccessPermit_PermitID();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.AccessPermit#getPayment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.AccessPermit#getPayment()
	 * @see #getAccessPermit()
	 * @generated
	 */
	EAttribute getAccessPermit_Payment();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.InspectionDataSet <em>Inspection Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inspection Data Set</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.InspectionDataSet
	 * @generated
	 */
	EClass getInspectionDataSet();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.InspectionDataSet#getLocationCondition <em>Location Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Condition</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.InspectionDataSet#getLocationCondition()
	 * @see #getInspectionDataSet()
	 * @generated
	 */
	EAttribute getInspectionDataSet_LocationCondition();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.InspectionDataSet#getAccordingToSchedules <em>According To Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>According To Schedules</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.InspectionDataSet#getAccordingToSchedules()
	 * @see #getInspectionDataSet()
	 * @generated
	 */
	EReference getInspectionDataSet_AccordingToSchedules();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.Regulation <em>Regulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regulation</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Regulation
	 * @generated
	 */
	EClass getRegulation();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.Regulation#getReferenceNumber <em>Reference Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Number</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Regulation#getReferenceNumber()
	 * @see #getRegulation()
	 * @generated
	 */
	EAttribute getRegulation_ReferenceNumber();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.ShiftPattern <em>Shift Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shift Pattern</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.ShiftPattern
	 * @generated
	 */
	EClass getShiftPattern();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.ShiftPattern#getAssignmentType <em>Assignment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assignment Type</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.ShiftPattern#getAssignmentType()
	 * @see #getShiftPattern()
	 * @generated
	 */
	EAttribute getShiftPattern_AssignmentType();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.ShiftPattern#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crews</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.ShiftPattern#getCrews()
	 * @see #getShiftPattern()
	 * @generated
	 */
	EReference getShiftPattern_Crews();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.ShiftPattern#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.ShiftPattern#getStatus()
	 * @see #getShiftPattern()
	 * @generated
	 */
	EReference getShiftPattern_Status();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.ShiftPattern#getCycleCount <em>Cycle Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cycle Count</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.ShiftPattern#getCycleCount()
	 * @see #getShiftPattern()
	 * @generated
	 */
	EAttribute getShiftPattern_CycleCount();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.ShiftPattern#getValidityInterval <em>Validity Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Validity Interval</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.ShiftPattern#getValidityInterval()
	 * @see #getShiftPattern()
	 * @generated
	 */
	EReference getShiftPattern_ValidityInterval();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.NonStandardItem <em>Non Standard Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Standard Item</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.NonStandardItem
	 * @generated
	 */
	EClass getNonStandardItem();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.NonStandardItem#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.NonStandardItem#getCode()
	 * @see #getNonStandardItem()
	 * @generated
	 */
	EAttribute getNonStandardItem_Code();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.NonStandardItem#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.NonStandardItem#getAmount()
	 * @see #getNonStandardItem()
	 * @generated
	 */
	EAttribute getNonStandardItem_Amount();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.WorkLocation <em>Work Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Location</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkLocation
	 * @generated
	 */
	EClass getWorkLocation();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.WorkLocation#getSubdivision <em>Subdivision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subdivision</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkLocation#getSubdivision()
	 * @see #getWorkLocation()
	 * @generated
	 */
	EAttribute getWorkLocation_Subdivision();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.WorkLocation#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkLocation#getBlock()
	 * @see #getWorkLocation()
	 * @generated
	 */
	EAttribute getWorkLocation_Block();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.WorkLocation#getDesignLocations <em>Design Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Design Locations</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkLocation#getDesignLocations()
	 * @see #getWorkLocation()
	 * @generated
	 */
	EReference getWorkLocation_DesignLocations();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.WorkLocation#getOneCallRequest <em>One Call Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>One Call Request</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkLocation#getOneCallRequest()
	 * @see #getWorkLocation()
	 * @generated
	 */
	EReference getWorkLocation_OneCallRequest();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.WorkLocation#getLot <em>Lot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lot</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkLocation#getLot()
	 * @see #getWorkLocation()
	 * @generated
	 */
	EAttribute getWorkLocation_Lot();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.WorkLocation#getNearestIntersection <em>Nearest Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nearest Intersection</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkLocation#getNearestIntersection()
	 * @see #getWorkLocation()
	 * @generated
	 */
	EAttribute getWorkLocation_NearestIntersection();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU <em>Design Location CU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Location CU</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocationCU
	 * @generated
	 */
	EClass getDesignLocationCU();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getDesigns <em>Designs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Designs</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocationCU#getDesigns()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	EReference getDesignLocationCU_Designs();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getRemovalDate <em>Removal Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Removal Date</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocationCU#getRemovalDate()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	EAttribute getDesignLocationCU_RemovalDate();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getConditionFactors <em>Condition Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Condition Factors</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocationCU#getConditionFactors()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	EReference getDesignLocationCU_ConditionFactors();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compatible Units</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCompatibleUnits()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	EReference getDesignLocationCU_CompatibleUnits();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCuQuantity <em>Cu Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cu Quantity</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCuQuantity()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	EAttribute getDesignLocationCU_CuQuantity();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCuAccount <em>Cu Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cu Account</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCuAccount()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	EAttribute getDesignLocationCU_CuAccount();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Tasks</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocationCU#getWorkTasks()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	EReference getDesignLocationCU_WorkTasks();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getDesignLocation <em>Design Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Design Location</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocationCU#getDesignLocation()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	EReference getDesignLocationCU_DesignLocation();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocationCU#getStatus()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	EReference getDesignLocationCU_Status();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCuAction <em>Cu Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cu Action</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCuAction()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	EAttribute getDesignLocationCU_CuAction();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#isEnergizationFlag <em>Energization Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energization Flag</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocationCU#isEnergizationFlag()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	EAttribute getDesignLocationCU_EnergizationFlag();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCUGroups <em>CU Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CU Groups</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCUGroups()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	EReference getDesignLocationCU_CUGroups();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCuUsage <em>Cu Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cu Usage</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCuUsage()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	EAttribute getDesignLocationCU_CuUsage();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.DesignLocation <em>Design Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Location</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocation
	 * @generated
	 */
	EClass getDesignLocation();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getSpanLength <em>Span Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span Length</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocation#getSpanLength()
	 * @see #getDesignLocation()
	 * @generated
	 */
	EAttribute getDesignLocation_SpanLength();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getConditionFactors <em>Condition Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Condition Factors</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocation#getConditionFactors()
	 * @see #getDesignLocation()
	 * @generated
	 */
	EReference getDesignLocation_ConditionFactors();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getMaterialItems <em>Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Material Items</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocation#getMaterialItems()
	 * @see #getDesignLocation()
	 * @generated
	 */
	EReference getDesignLocation_MaterialItems();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocation#getStatus()
	 * @see #getDesignLocation()
	 * @generated
	 */
	EReference getDesignLocation_Status();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Diagrams</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocation#getDiagrams()
	 * @see #getDesignLocation()
	 * @generated
	 */
	EReference getDesignLocation_Diagrams();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getWorkLocations <em>Work Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Locations</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocation#getWorkLocations()
	 * @see #getDesignLocation()
	 * @generated
	 */
	EReference getDesignLocation_WorkLocations();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getDesignLocationCUs <em>Design Location CUs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Design Location CUs</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocation#getDesignLocationCUs()
	 * @see #getDesignLocation()
	 * @generated
	 */
	EReference getDesignLocation_DesignLocationCUs();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getDesigns <em>Designs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Designs</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocation#getDesigns()
	 * @see #getDesignLocation()
	 * @generated
	 */
	EReference getDesignLocation_Designs();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getErpBomItemDatas <em>Erp Bom Item Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Bom Item Datas</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocation#getErpBomItemDatas()
	 * @see #getDesignLocation()
	 * @generated
	 */
	EReference getDesignLocation_ErpBomItemDatas();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getMiscCostItems <em>Misc Cost Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Misc Cost Items</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocation#getMiscCostItems()
	 * @see #getDesignLocation()
	 * @generated
	 */
	EReference getDesignLocation_MiscCostItems();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.CULaborCode <em>CU Labor Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CU Labor Code</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CULaborCode
	 * @generated
	 */
	EClass getCULaborCode();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.CULaborCode#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CULaborCode#getCode()
	 * @see #getCULaborCode()
	 * @generated
	 */
	EAttribute getCULaborCode_Code();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.CULaborCode#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CULaborCode#getStatus()
	 * @see #getCULaborCode()
	 * @generated
	 */
	EReference getCULaborCode_Status();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.CULaborCode#getCULaborItems <em>CU Labor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CU Labor Items</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CULaborCode#getCULaborItems()
	 * @see #getCULaborCode()
	 * @generated
	 */
	EReference getCULaborCode_CULaborItems();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.ConditionFactor <em>Condition Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Factor</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.ConditionFactor
	 * @generated
	 */
	EClass getConditionFactor();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.ConditionFactor#getCfValue <em>Cf Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cf Value</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.ConditionFactor#getCfValue()
	 * @see #getConditionFactor()
	 * @generated
	 */
	EAttribute getConditionFactor_CfValue();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.ConditionFactor#getDesignLocations <em>Design Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Design Locations</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.ConditionFactor#getDesignLocations()
	 * @see #getConditionFactor()
	 * @generated
	 */
	EReference getConditionFactor_DesignLocations();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.ConditionFactor#getDesignLocationCUs <em>Design Location CUs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Design Location CUs</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.ConditionFactor#getDesignLocationCUs()
	 * @see #getConditionFactor()
	 * @generated
	 */
	EReference getConditionFactor_DesignLocationCUs();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.ConditionFactor#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.ConditionFactor#getKind()
	 * @see #getConditionFactor()
	 * @generated
	 */
	EAttribute getConditionFactor_Kind();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.ConditionFactor#getDesigns <em>Designs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Designs</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.ConditionFactor#getDesigns()
	 * @see #getConditionFactor()
	 * @generated
	 */
	EReference getConditionFactor_Designs();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.ConditionFactor#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.ConditionFactor#getStatus()
	 * @see #getConditionFactor()
	 * @generated
	 */
	EReference getConditionFactor_Status();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem <em>CU Work Equipment Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CU Work Equipment Item</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem
	 * @generated
	 */
	EClass getCUWorkEquipmentItem();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getEquipCode <em>Equip Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Equip Code</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getEquipCode()
	 * @see #getCUWorkEquipmentItem()
	 * @generated
	 */
	EAttribute getCUWorkEquipmentItem_EquipCode();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getRate()
	 * @see #getCUWorkEquipmentItem()
	 * @generated
	 */
	EAttribute getCUWorkEquipmentItem_Rate();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getTypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Asset</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getTypeAsset()
	 * @see #getCUWorkEquipmentItem()
	 * @generated
	 */
	EReference getCUWorkEquipmentItem_TypeAsset();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compatible Units</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getCompatibleUnits()
	 * @see #getCUWorkEquipmentItem()
	 * @generated
	 */
	EReference getCUWorkEquipmentItem_CompatibleUnits();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getStatus()
	 * @see #getCUWorkEquipmentItem()
	 * @generated
	 */
	EReference getCUWorkEquipmentItem_Status();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.QualificationRequirement <em>Qualification Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualification Requirement</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.QualificationRequirement
	 * @generated
	 */
	EClass getQualificationRequirement();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.QualificationRequirement#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specifications</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.QualificationRequirement#getSpecifications()
	 * @see #getQualificationRequirement()
	 * @generated
	 */
	EReference getQualificationRequirement_Specifications();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.QualificationRequirement#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Tasks</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.QualificationRequirement#getWorkTasks()
	 * @see #getQualificationRequirement()
	 * @generated
	 */
	EReference getQualificationRequirement_WorkTasks();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.QualificationRequirement#getCULaborItems <em>CU Labor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CU Labor Items</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.QualificationRequirement#getCULaborItems()
	 * @see #getQualificationRequirement()
	 * @generated
	 */
	EReference getQualificationRequirement_CULaborItems();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.QualificationRequirement#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Skills</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.QualificationRequirement#getSkills()
	 * @see #getQualificationRequirement()
	 * @generated
	 */
	EReference getQualificationRequirement_Skills();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.QualificationRequirement#getQualificationID <em>Qualification ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualification ID</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.QualificationRequirement#getQualificationID()
	 * @see #getQualificationRequirement()
	 * @generated
	 */
	EAttribute getQualificationRequirement_QualificationID();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.CUContractorItem <em>CU Contractor Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CU Contractor Item</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUContractorItem
	 * @generated
	 */
	EClass getCUContractorItem();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.CUContractorItem#getActivityCode <em>Activity Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Code</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUContractorItem#getActivityCode()
	 * @see #getCUContractorItem()
	 * @generated
	 */
	EAttribute getCUContractorItem_ActivityCode();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.CUContractorItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUContractorItem#getStatus()
	 * @see #getCUContractorItem()
	 * @generated
	 */
	EReference getCUContractorItem_Status();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.CUContractorItem#getBidAmount <em>Bid Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bid Amount</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUContractorItem#getBidAmount()
	 * @see #getCUContractorItem()
	 * @generated
	 */
	EAttribute getCUContractorItem_BidAmount();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.CUContractorItem#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compatible Units</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUContractorItem#getCompatibleUnits()
	 * @see #getCUContractorItem()
	 * @generated
	 */
	EReference getCUContractorItem_CompatibleUnits();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.MaterialItem <em>Material Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material Item</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MaterialItem
	 * @generated
	 */
	EClass getMaterialItem();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getErpPOLineItems <em>Erp PO Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp PO Line Items</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MaterialItem#getErpPOLineItems()
	 * @see #getMaterialItem()
	 * @generated
	 */
	EReference getMaterialItem_ErpPOLineItems();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getTypeMaterial <em>Type Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Material</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MaterialItem#getTypeMaterial()
	 * @see #getMaterialItem()
	 * @generated
	 */
	EReference getMaterialItem_TypeMaterial();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getErpInventoryCounts <em>Erp Inventory Counts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Inventory Counts</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MaterialItem#getErpInventoryCounts()
	 * @see #getMaterialItem()
	 * @generated
	 */
	EReference getMaterialItem_ErpInventoryCounts();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getUsages <em>Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usages</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MaterialItem#getUsages()
	 * @see #getMaterialItem()
	 * @generated
	 */
	EReference getMaterialItem_Usages();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getWorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Cost Detail</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MaterialItem#getWorkCostDetail()
	 * @see #getMaterialItem()
	 * @generated
	 */
	EReference getMaterialItem_WorkCostDetail();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Task</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MaterialItem#getWorkTask()
	 * @see #getMaterialItem()
	 * @generated
	 */
	EReference getMaterialItem_WorkTask();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MaterialItem#getAccount()
	 * @see #getMaterialItem()
	 * @generated
	 */
	EAttribute getMaterialItem_Account();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getCostDescription <em>Cost Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Description</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MaterialItem#getCostDescription()
	 * @see #getMaterialItem()
	 * @generated
	 */
	EAttribute getMaterialItem_CostDescription();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MaterialItem#getQuantity()
	 * @see #getMaterialItem()
	 * @generated
	 */
	EAttribute getMaterialItem_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getCostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Type</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MaterialItem#getCostType()
	 * @see #getMaterialItem()
	 * @generated
	 */
	EAttribute getMaterialItem_CostType();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getExternalRefID <em>External Ref ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Ref ID</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MaterialItem#getExternalRefID()
	 * @see #getMaterialItem()
	 * @generated
	 */
	EAttribute getMaterialItem_ExternalRefID();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MaterialItem#getStatus()
	 * @see #getMaterialItem()
	 * @generated
	 */
	EReference getMaterialItem_Status();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getErpRecDelvLineItems <em>Erp Rec Delv Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Rec Delv Line Items</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MaterialItem#getErpRecDelvLineItems()
	 * @see #getMaterialItem()
	 * @generated
	 */
	EReference getMaterialItem_ErpRecDelvLineItems();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getDesignLocation <em>Design Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Design Location</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MaterialItem#getDesignLocation()
	 * @see #getMaterialItem()
	 * @generated
	 */
	EReference getMaterialItem_DesignLocation();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getActualCost <em>Actual Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Cost</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MaterialItem#getActualCost()
	 * @see #getMaterialItem()
	 * @generated
	 */
	EAttribute getMaterialItem_ActualCost();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getMaterialCode <em>Material Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Material Code</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MaterialItem#getMaterialCode()
	 * @see #getMaterialItem()
	 * @generated
	 */
	EAttribute getMaterialItem_MaterialCode();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.PropertyUnit <em>Property Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Unit</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.PropertyUnit
	 * @generated
	 */
	EClass getPropertyUnit();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.PropertyUnit#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Cost Details</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.PropertyUnit#getWorkCostDetails()
	 * @see #getPropertyUnit()
	 * @generated
	 */
	EReference getPropertyUnit_WorkCostDetails();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.PropertyUnit#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.PropertyUnit#getStatus()
	 * @see #getPropertyUnit()
	 * @generated
	 */
	EReference getPropertyUnit_Status();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.PropertyUnit#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compatible Units</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.PropertyUnit#getCompatibleUnits()
	 * @see #getPropertyUnit()
	 * @generated
	 */
	EReference getPropertyUnit_CompatibleUnits();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.PropertyUnit#getPropertyAccount <em>Property Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Account</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.PropertyUnit#getPropertyAccount()
	 * @see #getPropertyUnit()
	 * @generated
	 */
	EAttribute getPropertyUnit_PropertyAccount();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.PropertyUnit#getCUMaterialItems <em>CU Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CU Material Items</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.PropertyUnit#getCUMaterialItems()
	 * @see #getPropertyUnit()
	 * @generated
	 */
	EReference getPropertyUnit_CUMaterialItems();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.PropertyUnit#getAccountingUsage <em>Accounting Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accounting Usage</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.PropertyUnit#getAccountingUsage()
	 * @see #getPropertyUnit()
	 * @generated
	 */
	EAttribute getPropertyUnit_AccountingUsage();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.PropertyUnit#getActivityCode <em>Activity Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Code</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.PropertyUnit#getActivityCode()
	 * @see #getPropertyUnit()
	 * @generated
	 */
	EAttribute getPropertyUnit_ActivityCode();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.CompatibleUnit <em>Compatible Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compatible Unit</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CompatibleUnit
	 * @generated
	 */
	EClass getCompatibleUnit();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.CompatibleUnit#getDesignLocationCUs <em>Design Location CUs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Design Location CUs</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CompatibleUnit#getDesignLocationCUs()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	EReference getCompatibleUnit_DesignLocationCUs();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.CompatibleUnit#getEstCost <em>Est Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Est Cost</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CompatibleUnit#getEstCost()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	EAttribute getCompatibleUnit_EstCost();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.CompatibleUnit#getPropertyUnit <em>Property Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Unit</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CompatibleUnit#getPropertyUnit()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	EReference getCompatibleUnit_PropertyUnit();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCULaborItems <em>CU Labor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CU Labor Items</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCULaborItems()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	EReference getCompatibleUnit_CULaborItems();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUMaterialItems <em>CU Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CU Material Items</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUMaterialItems()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	EReference getCompatibleUnit_CUMaterialItems();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUGroup <em>CU Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CU Group</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUGroup()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	EReference getCompatibleUnit_CUGroup();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUWorkEquipmentItems <em>CU Work Equipment Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CU Work Equipment Items</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUWorkEquipmentItems()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	EReference getCompatibleUnit_CUWorkEquipmentItems();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Type</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCostType()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	EReference getCompatibleUnit_CostType();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.CompatibleUnit#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CompatibleUnit#getQuantity()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	EAttribute getCompatibleUnit_Quantity();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.CompatibleUnit#getProcedures <em>Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Procedures</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CompatibleUnit#getProcedures()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	EReference getCompatibleUnit_Procedures();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUAssets <em>CU Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CU Assets</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUAssets()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	EReference getCompatibleUnit_CUAssets();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUAllowableAction <em>CU Allowable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CU Allowable Action</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUAllowableAction()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	EReference getCompatibleUnit_CUAllowableAction();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUContractorItems <em>CU Contractor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CU Contractor Items</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUContractorItems()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	EReference getCompatibleUnit_CUContractorItems();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.WorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Task</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask
	 * @generated
	 */
	EClass getWorkTask();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crews</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getCrews()
	 * @see #getWorkTask()
	 * @generated
	 */
	EReference getWorkTask_Crews();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getSwitchingSchedules <em>Switching Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switching Schedules</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getSwitchingSchedules()
	 * @see #getWorkTask()
	 * @generated
	 */
	EReference getWorkTask_SwitchingSchedules();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getMiscCostItems <em>Misc Cost Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Misc Cost Items</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getMiscCostItems()
	 * @see #getWorkTask()
	 * @generated
	 */
	EReference getWorkTask_MiscCostItems();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getLaborItems <em>Labor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Labor Items</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getLaborItems()
	 * @see #getWorkTask()
	 * @generated
	 */
	EReference getWorkTask_LaborItems();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getPriority()
	 * @see #getWorkTask()
	 * @generated
	 */
	EAttribute getWorkTask_Priority();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getWorkFlowStep <em>Work Flow Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Flow Step</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getWorkFlowStep()
	 * @see #getWorkTask()
	 * @generated
	 */
	EReference getWorkTask_WorkFlowStep();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getAssets()
	 * @see #getWorkTask()
	 * @generated
	 */
	EReference getWorkTask_Assets();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capabilities</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getCapabilities()
	 * @see #getWorkTask()
	 * @generated
	 */
	EReference getWorkTask_Capabilities();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getSchedOverride <em>Sched Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sched Override</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getSchedOverride()
	 * @see #getWorkTask()
	 * @generated
	 */
	EAttribute getWorkTask_SchedOverride();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getWork()
	 * @see #getWorkTask()
	 * @generated
	 */
	EReference getWorkTask_Work();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getDesignLocationCUs <em>Design Location CUs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Design Location CUs</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getDesignLocationCUs()
	 * @see #getWorkTask()
	 * @generated
	 */
	EReference getWorkTask_DesignLocationCUs();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getContractorItems <em>Contractor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contractor Items</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getContractorItems()
	 * @see #getWorkTask()
	 * @generated
	 */
	EReference getWorkTask_ContractorItems();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Design</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getDesign()
	 * @see #getWorkTask()
	 * @generated
	 */
	EReference getWorkTask_Design();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getEquipmentItems <em>Equipment Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equipment Items</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getEquipmentItems()
	 * @see #getWorkTask()
	 * @generated
	 */
	EReference getWorkTask_EquipmentItems();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getMaterialItems <em>Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Material Items</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getMaterialItems()
	 * @see #getWorkTask()
	 * @generated
	 */
	EReference getWorkTask_MaterialItems();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Cost Details</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getWorkCostDetails()
	 * @see #getWorkTask()
	 * @generated
	 */
	EReference getWorkTask_WorkCostDetails();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getQualificationRequirements <em>Qualification Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Qualification Requirements</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getQualificationRequirements()
	 * @see #getWorkTask()
	 * @generated
	 */
	EReference getWorkTask_QualificationRequirements();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getUsages <em>Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usages</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getUsages()
	 * @see #getWorkTask()
	 * @generated
	 */
	EReference getWorkTask_Usages();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getOverheadCost <em>Overhead Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Overhead Cost</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getOverheadCost()
	 * @see #getWorkTask()
	 * @generated
	 */
	EReference getWorkTask_OverheadCost();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.TypeMaterial <em>Type Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Material</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.TypeMaterial
	 * @generated
	 */
	EClass getTypeMaterial();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.TypeMaterial#getErpIssueInventories <em>Erp Issue Inventories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Issue Inventories</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.TypeMaterial#getErpIssueInventories()
	 * @see #getTypeMaterial()
	 * @generated
	 */
	EReference getTypeMaterial_ErpIssueInventories();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.TypeMaterial#isStockItem <em>Stock Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stock Item</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.TypeMaterial#isStockItem()
	 * @see #getTypeMaterial()
	 * @generated
	 */
	EAttribute getTypeMaterial_StockItem();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.TypeMaterial#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.TypeMaterial#getQuantity()
	 * @see #getTypeMaterial()
	 * @generated
	 */
	EAttribute getTypeMaterial_Quantity();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.TypeMaterial#getErpReqLineItems <em>Erp Req Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Req Line Items</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.TypeMaterial#getErpReqLineItems()
	 * @see #getTypeMaterial()
	 * @generated
	 */
	EReference getTypeMaterial_ErpReqLineItems();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.TypeMaterial#getMaterialItems <em>Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Material Items</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.TypeMaterial#getMaterialItems()
	 * @see #getTypeMaterial()
	 * @generated
	 */
	EReference getTypeMaterial_MaterialItems();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.TypeMaterial#getCostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Type</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.TypeMaterial#getCostType()
	 * @see #getTypeMaterial()
	 * @generated
	 */
	EAttribute getTypeMaterial_CostType();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.TypeMaterial#getEstUnitCost <em>Est Unit Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Est Unit Cost</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.TypeMaterial#getEstUnitCost()
	 * @see #getTypeMaterial()
	 * @generated
	 */
	EAttribute getTypeMaterial_EstUnitCost();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.TypeMaterial#getCUMaterialItems <em>CU Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CU Material Items</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.TypeMaterial#getCUMaterialItems()
	 * @see #getTypeMaterial()
	 * @generated
	 */
	EReference getTypeMaterial_CUMaterialItems();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.Capability#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Capability#getCategory()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_Category();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Capability#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Tasks</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Capability#getWorkTasks()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_WorkTasks();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.Capability#getValidityInterval <em>Validity Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Validity Interval</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Capability#getValidityInterval()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_ValidityInterval();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.Capability#getCrew <em>Crew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Crew</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Capability#getCrew()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Crew();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Capability#getCrafts <em>Crafts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crafts</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Capability#getCrafts()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Crafts();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.Capability#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Capability#getStatus()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Status();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.Capability#getPerformanceFactor <em>Performance Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Performance Factor</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Capability#getPerformanceFactor()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_PerformanceFactor();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.CUAsset <em>CU Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CU Asset</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUAsset
	 * @generated
	 */
	EClass getCUAsset();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.CUAsset#getTypeAssetCode <em>Type Asset Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Asset Code</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUAsset#getTypeAssetCode()
	 * @see #getCUAsset()
	 * @generated
	 */
	EAttribute getCUAsset_TypeAssetCode();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.CUAsset#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUAsset#getStatus()
	 * @see #getCUAsset()
	 * @generated
	 */
	EReference getCUAsset_Status();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.CUAsset#getTypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Asset</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUAsset#getTypeAsset()
	 * @see #getCUAsset()
	 * @generated
	 */
	EReference getCUAsset_TypeAsset();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.CUAsset#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUAsset#getQuantity()
	 * @see #getCUAsset()
	 * @generated
	 */
	EAttribute getCUAsset_Quantity();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.CUAsset#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compatible Units</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUAsset#getCompatibleUnits()
	 * @see #getCUAsset()
	 * @generated
	 */
	EReference getCUAsset_CompatibleUnits();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.ContractorItem <em>Contractor Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contractor Item</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.ContractorItem
	 * @generated
	 */
	EClass getContractorItem();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.ContractorItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.ContractorItem#getStatus()
	 * @see #getContractorItem()
	 * @generated
	 */
	EReference getContractorItem_Status();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.ContractorItem#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.ContractorItem#getCost()
	 * @see #getContractorItem()
	 * @generated
	 */
	EAttribute getContractorItem_Cost();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.ContractorItem#getActivityCode <em>Activity Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Code</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.ContractorItem#getActivityCode()
	 * @see #getContractorItem()
	 * @generated
	 */
	EAttribute getContractorItem_ActivityCode();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.ContractorItem#getErpPayables <em>Erp Payables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Payables</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.ContractorItem#getErpPayables()
	 * @see #getContractorItem()
	 * @generated
	 */
	EReference getContractorItem_ErpPayables();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.ContractorItem#getWorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Cost Detail</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.ContractorItem#getWorkCostDetail()
	 * @see #getContractorItem()
	 * @generated
	 */
	EReference getContractorItem_WorkCostDetail();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.ContractorItem#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Task</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.ContractorItem#getWorkTask()
	 * @see #getContractorItem()
	 * @generated
	 */
	EReference getContractorItem_WorkTask();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.ContractorItem#getBidAmount <em>Bid Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bid Amount</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.ContractorItem#getBidAmount()
	 * @see #getContractorItem()
	 * @generated
	 */
	EAttribute getContractorItem_BidAmount();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.InfoQuestion <em>Info Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info Question</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.InfoQuestion
	 * @generated
	 */
	EClass getInfoQuestion();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.InfoQuestion#getAnswer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Answer</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.InfoQuestion#getAnswer()
	 * @see #getInfoQuestion()
	 * @generated
	 */
	EAttribute getInfoQuestion_Answer();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.InfoQuestion#getQuestionText <em>Question Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question Text</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.InfoQuestion#getQuestionText()
	 * @see #getInfoQuestion()
	 * @generated
	 */
	EAttribute getInfoQuestion_QuestionText();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.InfoQuestion#getAnswerDateTime <em>Answer Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Answer Date Time</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.InfoQuestion#getAnswerDateTime()
	 * @see #getInfoQuestion()
	 * @generated
	 */
	EAttribute getInfoQuestion_AnswerDateTime();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.InfoQuestion#getQuestionCategory <em>Question Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question Category</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.InfoQuestion#getQuestionCategory()
	 * @see #getInfoQuestion()
	 * @generated
	 */
	EAttribute getInfoQuestion_QuestionCategory();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.InfoQuestion#getAnswerRemark <em>Answer Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Answer Remark</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.InfoQuestion#getAnswerRemark()
	 * @see #getInfoQuestion()
	 * @generated
	 */
	EAttribute getInfoQuestion_AnswerRemark();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.InfoQuestion#getQuestionRemark <em>Question Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question Remark</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.InfoQuestion#getQuestionRemark()
	 * @see #getInfoQuestion()
	 * @generated
	 */
	EAttribute getInfoQuestion_QuestionRemark();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.InfoQuestion#getQuestionCode <em>Question Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question Code</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.InfoQuestion#getQuestionCode()
	 * @see #getInfoQuestion()
	 * @generated
	 */
	EAttribute getInfoQuestion_QuestionCode();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.WorkStatusEntry <em>Work Status Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Status Entry</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkStatusEntry
	 * @generated
	 */
	EClass getWorkStatusEntry();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.WorkStatusEntry#getPercentComplete <em>Percent Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent Complete</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkStatusEntry#getPercentComplete()
	 * @see #getWorkStatusEntry()
	 * @generated
	 */
	EAttribute getWorkStatusEntry_PercentComplete();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.Appointment <em>Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appointment</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Appointment
	 * @generated
	 */
	EClass getAppointment();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.Appointment#getRemark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remark</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Appointment#getRemark()
	 * @see #getAppointment()
	 * @generated
	 */
	EAttribute getAppointment_Remark();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.Appointment#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Appointment#getAddress()
	 * @see #getAppointment()
	 * @generated
	 */
	EReference getAppointment_Address();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.Appointment#getCallBack <em>Call Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Call Back</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Appointment#getCallBack()
	 * @see #getAppointment()
	 * @generated
	 */
	EReference getAppointment_CallBack();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.Appointment#getMeetingInterval <em>Meeting Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meeting Interval</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Appointment#getMeetingInterval()
	 * @see #getAppointment()
	 * @generated
	 */
	EReference getAppointment_MeetingInterval();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Appointment#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Persons</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Appointment#getErpPersons()
	 * @see #getAppointment()
	 * @generated
	 */
	EReference getAppointment_ErpPersons();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.Appointment#isCallAhead <em>Call Ahead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call Ahead</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Appointment#isCallAhead()
	 * @see #getAppointment()
	 * @generated
	 */
	EAttribute getAppointment_CallAhead();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.MaintenanceDataSet <em>Maintenance Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maintenance Data Set</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MaintenanceDataSet
	 * @generated
	 */
	EClass getMaintenanceDataSet();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.MaintenanceDataSet#getMaintCode <em>Maint Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maint Code</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MaintenanceDataSet#getMaintCode()
	 * @see #getMaintenanceDataSet()
	 * @generated
	 */
	EAttribute getMaintenanceDataSet_MaintCode();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.MaintenanceDataSet#getConditionBefore <em>Condition Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Before</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MaintenanceDataSet#getConditionBefore()
	 * @see #getMaintenanceDataSet()
	 * @generated
	 */
	EAttribute getMaintenanceDataSet_ConditionBefore();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.MaintenanceDataSet#getConditionAfter <em>Condition After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition After</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.MaintenanceDataSet#getConditionAfter()
	 * @see #getMaintenanceDataSet()
	 * @generated
	 */
	EAttribute getMaintenanceDataSet_ConditionAfter();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.CUGroup <em>CU Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CU Group</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUGroup
	 * @generated
	 */
	EClass getCUGroup();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.CUGroup#getChildCUGroups <em>Child CU Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child CU Groups</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUGroup#getChildCUGroups()
	 * @see #getCUGroup()
	 * @generated
	 */
	EReference getCUGroup_ChildCUGroups();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.CUGroup#getParentCUGroups <em>Parent CU Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent CU Groups</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUGroup#getParentCUGroups()
	 * @see #getCUGroup()
	 * @generated
	 */
	EReference getCUGroup_ParentCUGroups();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.CUGroup#getDesignLocationCUs <em>Design Location CUs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Design Location CUs</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUGroup#getDesignLocationCUs()
	 * @see #getCUGroup()
	 * @generated
	 */
	EReference getCUGroup_DesignLocationCUs();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.CUGroup#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compatible Units</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUGroup#getCompatibleUnits()
	 * @see #getCUGroup()
	 * @generated
	 */
	EReference getCUGroup_CompatibleUnits();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.CUGroup#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CUGroup#getStatus()
	 * @see #getCUGroup()
	 * @generated
	 */
	EReference getCUGroup_Status();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.Crew <em>Crew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crew</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Crew
	 * @generated
	 */
	EClass getCrew();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Crew#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Tasks</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Crew#getWorkTasks()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_WorkTasks();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Crew#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assignments</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Crew#getAssignments()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_Assignments();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Crew#getShiftPatterns <em>Shift Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shift Patterns</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Crew#getShiftPatterns()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_ShiftPatterns();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.Crew#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Crew#getRoute()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_Route();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Crew#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tools</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Crew#getTools()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_Tools();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Crew#getVehicles <em>Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vehicles</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Crew#getVehicles()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_Vehicles();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.Crew#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Crew#getCategory()
	 * @see #getCrew()
	 * @generated
	 */
	EAttribute getCrew_Category();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Crew#getCrewMembers <em>Crew Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crew Members</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Crew#getCrewMembers()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_CrewMembers();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Crew#getWorkEquipmentAssets <em>Work Equipment Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Equipment Assets</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Crew#getWorkEquipmentAssets()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_WorkEquipmentAssets();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Crew#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Crew#getLocations()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_Locations();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Crew#getOrganisations <em>Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organisations</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Crew#getOrganisations()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_Organisations();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Crew#getSwitchingSchedules <em>Switching Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switching Schedules</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Crew#getSwitchingSchedules()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_SwitchingSchedules();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Crew#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capabilities</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Crew#getCapabilities()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_Capabilities();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Crew#getOutageSteps <em>Outage Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outage Steps</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Crew#getOutageSteps()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_OutageSteps();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.Request#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Request#getPriority()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Priority();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.Request#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organisation</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Request#getOrganisation()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Organisation();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.Request#getCorporateCode <em>Corporate Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corporate Code</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Request#getCorporateCode()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_CorporateCode();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Request#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Works</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Request#getWorks()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Works();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.Request#getErpQuoteLineItem <em>Erp Quote Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Quote Line Item</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Request#getErpQuoteLineItem()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_ErpQuoteLineItem();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.Request#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Projects</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Request#getProjects()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Projects();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.Request#getActionNeeded <em>Action Needed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Needed</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.Request#getActionNeeded()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_ActionNeeded();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.OverheadCost <em>Overhead Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overhead Cost</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.OverheadCost
	 * @generated
	 */
	EClass getOverheadCost();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.OverheadCost#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.OverheadCost#getCode()
	 * @see #getOverheadCost()
	 * @generated
	 */
	EAttribute getOverheadCost_Code();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.OverheadCost#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.OverheadCost#getCost()
	 * @see #getOverheadCost()
	 * @generated
	 */
	EAttribute getOverheadCost_Cost();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.OverheadCost#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Tasks</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.OverheadCost#getWorkTasks()
	 * @see #getOverheadCost()
	 * @generated
	 */
	EReference getOverheadCost_WorkTasks();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.OverheadCost#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.OverheadCost#getStatus()
	 * @see #getOverheadCost()
	 * @generated
	 */
	EReference getOverheadCost_Status();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.OverheadCost#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Cost Details</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.OverheadCost#getWorkCostDetails()
	 * @see #getOverheadCost()
	 * @generated
	 */
	EReference getOverheadCost_WorkCostDetails();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet <em>Diagnosis Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagnosis Data Set</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DiagnosisDataSet
	 * @generated
	 */
	EClass getDiagnosisDataSet();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getPhaseCode <em>Phase Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Code</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getPhaseCode()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	EAttribute getDiagnosisDataSet_PhaseCode();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalCode <em>Final Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Code</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalCode()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	EAttribute getDiagnosisDataSet_FinalCode();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getEffect()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	EAttribute getDiagnosisDataSet_Effect();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getFailureMode <em>Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Mode</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getFailureMode()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	EAttribute getDiagnosisDataSet_FailureMode();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootOrigin <em>Root Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Origin</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootOrigin()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	EAttribute getDiagnosisDataSet_RootOrigin();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalCause <em>Final Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Cause</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalCause()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	EAttribute getDiagnosisDataSet_FinalCause();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootRemark <em>Root Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Remark</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootRemark()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	EAttribute getDiagnosisDataSet_RootRemark();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootCause <em>Root Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Cause</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootCause()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	EAttribute getDiagnosisDataSet_RootCause();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryRemark <em>Preliminary Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preliminary Remark</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryRemark()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	EAttribute getDiagnosisDataSet_PreliminaryRemark();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryCode <em>Preliminary Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preliminary Code</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryCode()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	EAttribute getDiagnosisDataSet_PreliminaryCode();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryDateTime <em>Preliminary Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preliminary Date Time</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryDateTime()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	EAttribute getDiagnosisDataSet_PreliminaryDateTime();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalRemark <em>Final Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Remark</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalRemark()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	EAttribute getDiagnosisDataSet_FinalRemark();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalOrigin <em>Final Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Origin</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalOrigin()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	EAttribute getDiagnosisDataSet_FinalOrigin();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfWork.CULaborItem <em>CU Labor Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CU Labor Item</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CULaborItem
	 * @generated
	 */
	EClass getCULaborItem();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.CULaborItem#getQualificationRequirements <em>Qualification Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Qualification Requirements</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CULaborItem#getQualificationRequirements()
	 * @see #getCULaborItem()
	 * @generated
	 */
	EReference getCULaborItem_QualificationRequirements();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.CULaborItem#getCULaborCode <em>CU Labor Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CU Labor Code</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CULaborItem#getCULaborCode()
	 * @see #getCULaborItem()
	 * @generated
	 */
	EReference getCULaborItem_CULaborCode();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.CULaborItem#getActivityCode <em>Activity Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Code</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CULaborItem#getActivityCode()
	 * @see #getCULaborItem()
	 * @generated
	 */
	EAttribute getCULaborItem_ActivityCode();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.CULaborItem#getLaborDuration <em>Labor Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Labor Duration</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CULaborItem#getLaborDuration()
	 * @see #getCULaborItem()
	 * @generated
	 */
	EAttribute getCULaborItem_LaborDuration();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfWork.CULaborItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CULaborItem#getStatus()
	 * @see #getCULaborItem()
	 * @generated
	 */
	EReference getCULaborItem_Status();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfWork.CULaborItem#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compatible Units</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CULaborItem#getCompatibleUnits()
	 * @see #getCULaborItem()
	 * @generated
	 */
	EReference getCULaborItem_CompatibleUnits();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfWork.CULaborItem#getLaborRate <em>Labor Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Labor Rate</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.CULaborItem#getLaborRate()
	 * @see #getCULaborItem()
	 * @generated
	 */
	EAttribute getCULaborItem_LaborRate();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Informative.InfWork.DesignKind <em>Design Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Design Kind</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.DesignKind
	 * @generated
	 */
	EEnum getDesignKind();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Informative.InfWork.ConditionFactorKind <em>Condition Factor Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Factor Kind</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.ConditionFactorKind
	 * @generated
	 */
	EEnum getConditionFactorKind();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Informative.InfWork.WorkActionKind <em>Work Action Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Work Action Kind</em>'.
	 * @see CIM.IEC61970.Informative.InfWork.WorkActionKind
	 * @generated
	 */
	EEnum getWorkActionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InfWorkFactory getInfWorkFactory();

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
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.WorkFlowStepImpl <em>Work Flow Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.WorkFlowStepImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getWorkFlowStep()
		 * @generated
		 */
		EClass WORK_FLOW_STEP = eINSTANCE.getWorkFlowStep();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_FLOW_STEP__SEQUENCE_NUMBER = eINSTANCE.getWorkFlowStep_SequenceNumber();

		/**
		 * The meta object literal for the '<em><b>Work Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_FLOW_STEP__WORK_TASKS = eINSTANCE.getWorkFlowStep_WorkTasks();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_FLOW_STEP__STATUS = eINSTANCE.getWorkFlowStep_Status();

		/**
		 * The meta object literal for the '<em><b>Work</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_FLOW_STEP__WORK = eINSTANCE.getWorkFlowStep_Work();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.WorkCostDetailImpl <em>Work Cost Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.WorkCostDetailImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getWorkCostDetail()
		 * @generated
		 */
		EClass WORK_COST_DETAIL = eINSTANCE.getWorkCostDetail();

		/**
		 * The meta object literal for the '<em><b>Cost Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_COST_DETAIL__COST_TYPE = eINSTANCE.getWorkCostDetail_CostType();

		/**
		 * The meta object literal for the '<em><b>Contractor Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_COST_DETAIL__CONTRACTOR_ITEMS = eINSTANCE.getWorkCostDetail_ContractorItems();

		/**
		 * The meta object literal for the '<em><b>Material Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_COST_DETAIL__MATERIAL_ITEMS = eINSTANCE.getWorkCostDetail_MaterialItems();

		/**
		 * The meta object literal for the '<em><b>Transaction Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_COST_DETAIL__TRANSACTION_DATE_TIME = eINSTANCE.getWorkCostDetail_TransactionDateTime();

		/**
		 * The meta object literal for the '<em><b>Equipment Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_COST_DETAIL__EQUIPMENT_ITEMS = eINSTANCE.getWorkCostDetail_EquipmentItems();

		/**
		 * The meta object literal for the '<em><b>Property Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_COST_DETAIL__PROPERTY_UNITS = eINSTANCE.getWorkCostDetail_PropertyUnits();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_COST_DETAIL__AMOUNT = eINSTANCE.getWorkCostDetail_Amount();

		/**
		 * The meta object literal for the '<em><b>Design</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_COST_DETAIL__DESIGN = eINSTANCE.getWorkCostDetail_Design();

		/**
		 * The meta object literal for the '<em><b>Misc Cost Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_COST_DETAIL__MISC_COST_ITEMS = eINSTANCE.getWorkCostDetail_MiscCostItems();

		/**
		 * The meta object literal for the '<em><b>Work Cost Summary</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_COST_DETAIL__WORK_COST_SUMMARY = eINSTANCE.getWorkCostDetail_WorkCostSummary();

		/**
		 * The meta object literal for the '<em><b>Work Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_COST_DETAIL__WORK_TASK = eINSTANCE.getWorkCostDetail_WorkTask();

		/**
		 * The meta object literal for the '<em><b>Is Debit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_COST_DETAIL__IS_DEBIT = eINSTANCE.getWorkCostDetail_IsDebit();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_COST_DETAIL__TYPE = eINSTANCE.getWorkCostDetail_Type();

		/**
		 * The meta object literal for the '<em><b>Overhead Cost</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_COST_DETAIL__OVERHEAD_COST = eINSTANCE.getWorkCostDetail_OverheadCost();

		/**
		 * The meta object literal for the '<em><b>Works</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_COST_DETAIL__WORKS = eINSTANCE.getWorkCostDetail_Works();

		/**
		 * The meta object literal for the '<em><b>Labor Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_COST_DETAIL__LABOR_ITEMS = eINSTANCE.getWorkCostDetail_LaborItems();

		/**
		 * The meta object literal for the '<em><b>Erp Project Accounting</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_COST_DETAIL__ERP_PROJECT_ACCOUNTING = eINSTANCE.getWorkCostDetail_ErpProjectAccounting();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.UsageImpl <em>Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.UsageImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getUsage()
		 * @generated
		 */
		EClass USAGE = eINSTANCE.getUsage();

		/**
		 * The meta object literal for the '<em><b>Work Equipment Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE__WORK_EQUIPMENT_ASSET = eINSTANCE.getUsage_WorkEquipmentAsset();

		/**
		 * The meta object literal for the '<em><b>Work Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE__WORK_TASK = eINSTANCE.getUsage_WorkTask();

		/**
		 * The meta object literal for the '<em><b>Material Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE__MATERIAL_ITEM = eINSTANCE.getUsage_MaterialItem();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE__STATUS = eINSTANCE.getUsage_Status();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.WorkCostSummaryImpl <em>Work Cost Summary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.WorkCostSummaryImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getWorkCostSummary()
		 * @generated
		 */
		EClass WORK_COST_SUMMARY = eINSTANCE.getWorkCostSummary();

		/**
		 * The meta object literal for the '<em><b>Work Cost Detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_COST_SUMMARY__WORK_COST_DETAIL = eINSTANCE.getWorkCostSummary_WorkCostDetail();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.MiscCostItemImpl <em>Misc Cost Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.MiscCostItemImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getMiscCostItem()
		 * @generated
		 */
		EClass MISC_COST_ITEM = eINSTANCE.getMiscCostItem();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISC_COST_ITEM__STATUS = eINSTANCE.getMiscCostItem_Status();

		/**
		 * The meta object literal for the '<em><b>Design Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISC_COST_ITEM__DESIGN_LOCATION = eINSTANCE.getMiscCostItem_DesignLocation();

		/**
		 * The meta object literal for the '<em><b>Work Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISC_COST_ITEM__WORK_TASK = eINSTANCE.getMiscCostItem_WorkTask();

		/**
		 * The meta object literal for the '<em><b>Cost Per Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISC_COST_ITEM__COST_PER_UNIT = eINSTANCE.getMiscCostItem_CostPerUnit();

		/**
		 * The meta object literal for the '<em><b>Work Cost Detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISC_COST_ITEM__WORK_COST_DETAIL = eINSTANCE.getMiscCostItem_WorkCostDetail();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISC_COST_ITEM__QUANTITY = eINSTANCE.getMiscCostItem_Quantity();

		/**
		 * The meta object literal for the '<em><b>Account</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISC_COST_ITEM__ACCOUNT = eINSTANCE.getMiscCostItem_Account();

		/**
		 * The meta object literal for the '<em><b>External Ref ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISC_COST_ITEM__EXTERNAL_REF_ID = eINSTANCE.getMiscCostItem_ExternalRefID();

		/**
		 * The meta object literal for the '<em><b>Cost Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISC_COST_ITEM__COST_TYPE = eINSTANCE.getMiscCostItem_CostType();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.CUAllowableActionImpl <em>CU Allowable Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.CUAllowableActionImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getCUAllowableAction()
		 * @generated
		 */
		EClass CU_ALLOWABLE_ACTION = eINSTANCE.getCUAllowableAction();

		/**
		 * The meta object literal for the '<em><b>Compatible Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CU_ALLOWABLE_ACTION__COMPATIBLE_UNITS = eINSTANCE.getCUAllowableAction_CompatibleUnits();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CU_ALLOWABLE_ACTION__STATUS = eINSTANCE.getCUAllowableAction_Status();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.CostTypeImpl <em>Cost Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.CostTypeImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getCostType()
		 * @generated
		 */
		EClass COST_TYPE = eINSTANCE.getCostType();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_TYPE__LEVEL = eINSTANCE.getCostType_Level();

		/**
		 * The meta object literal for the '<em><b>Erp Journal Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_TYPE__ERP_JOURNAL_ENTRIES = eINSTANCE.getCostType_ErpJournalEntries();

		/**
		 * The meta object literal for the '<em><b>Work Cost Details</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_TYPE__WORK_COST_DETAILS = eINSTANCE.getCostType_WorkCostDetails();

		/**
		 * The meta object literal for the '<em><b>Parent Cost Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_TYPE__PARENT_COST_TYPE = eINSTANCE.getCostType_ParentCostType();

		/**
		 * The meta object literal for the '<em><b>Compatible Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_TYPE__COMPATIBLE_UNITS = eINSTANCE.getCostType_CompatibleUnits();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_TYPE__STATUS = eINSTANCE.getCostType_Status();

		/**
		 * The meta object literal for the '<em><b>Child Cost Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_TYPE__CHILD_COST_TYPES = eINSTANCE.getCostType_ChildCostTypes();

		/**
		 * The meta object literal for the '<em><b>Amount Assignment Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_TYPE__AMOUNT_ASSIGNMENT_FLAG = eINSTANCE.getCostType_AmountAssignmentFlag();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_TYPE__CODE = eINSTANCE.getCostType_Code();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_TYPE__STAGE = eINSTANCE.getCostType_Stage();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.CUMaterialItemImpl <em>CU Material Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.CUMaterialItemImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getCUMaterialItem()
		 * @generated
		 */
		EClass CU_MATERIAL_ITEM = eINSTANCE.getCUMaterialItem();

		/**
		 * The meta object literal for the '<em><b>Compatible Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CU_MATERIAL_ITEM__COMPATIBLE_UNITS = eINSTANCE.getCUMaterialItem_CompatibleUnits();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CU_MATERIAL_ITEM__STATUS = eINSTANCE.getCUMaterialItem_Status();

		/**
		 * The meta object literal for the '<em><b>Type Material</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CU_MATERIAL_ITEM__TYPE_MATERIAL = eINSTANCE.getCUMaterialItem_TypeMaterial();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CU_MATERIAL_ITEM__QUANTITY = eINSTANCE.getCUMaterialItem_Quantity();

		/**
		 * The meta object literal for the '<em><b>Property Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CU_MATERIAL_ITEM__PROPERTY_UNITS = eINSTANCE.getCUMaterialItem_PropertyUnits();

		/**
		 * The meta object literal for the '<em><b>Corporate Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CU_MATERIAL_ITEM__CORPORATE_CODE = eINSTANCE.getCUMaterialItem_CorporateCode();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.AssignmentImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Crews</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__CREWS = eINSTANCE.getAssignment_Crews();

		/**
		 * The meta object literal for the '<em><b>Effective Period</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__EFFECTIVE_PERIOD = eINSTANCE.getAssignment_EffectivePeriod();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.DesignImpl <em>Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.DesignImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getDesign()
		 * @generated
		 */
		EClass DESIGN = eINSTANCE.getDesign();

		/**
		 * The meta object literal for the '<em><b>Cost Estimate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN__COST_ESTIMATE = eINSTANCE.getDesign_CostEstimate();

		/**
		 * The meta object literal for the '<em><b>Design Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN__DESIGN_LOCATIONS = eINSTANCE.getDesign_DesignLocations();

		/**
		 * The meta object literal for the '<em><b>Design Locations CUs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN__DESIGN_LOCATIONS_CUS = eINSTANCE.getDesign_DesignLocationsCUs();

		/**
		 * The meta object literal for the '<em><b>Work</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN__WORK = eINSTANCE.getDesign_Work();

		/**
		 * The meta object literal for the '<em><b>Work Cost Details</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN__WORK_COST_DETAILS = eINSTANCE.getDesign_WorkCostDetails();

		/**
		 * The meta object literal for the '<em><b>Erp BO Ms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN__ERP_BO_MS = eINSTANCE.getDesign_ErpBOMs();

		/**
		 * The meta object literal for the '<em><b>Erp Quote Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN__ERP_QUOTE_LINE_ITEM = eINSTANCE.getDesign_ErpQuoteLineItem();

		/**
		 * The meta object literal for the '<em><b>Condition Factors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN__CONDITION_FACTORS = eINSTANCE.getDesign_ConditionFactors();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN__KIND = eINSTANCE.getDesign_Kind();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN__PRICE = eINSTANCE.getDesign_Price();

		/**
		 * The meta object literal for the '<em><b>Work Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN__WORK_TASKS = eINSTANCE.getDesign_WorkTasks();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.BusinessCaseImpl <em>Business Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.BusinessCaseImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getBusinessCase()
		 * @generated
		 */
		EClass BUSINESS_CASE = eINSTANCE.getBusinessCase();

		/**
		 * The meta object literal for the '<em><b>Corporate Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_CASE__CORPORATE_CODE = eINSTANCE.getBusinessCase_CorporateCode();

		/**
		 * The meta object literal for the '<em><b>Works</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_CASE__WORKS = eINSTANCE.getBusinessCase_Works();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_CASE__PROJECTS = eINSTANCE.getBusinessCase_Projects();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.EquipmentItemImpl <em>Equipment Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.EquipmentItemImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getEquipmentItem()
		 * @generated
		 */
		EClass EQUIPMENT_ITEM = eINSTANCE.getEquipmentItem();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPMENT_ITEM__CODE = eINSTANCE.getEquipmentItem_Code();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPMENT_ITEM__COST = eINSTANCE.getEquipmentItem_Cost();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPMENT_ITEM__STATUS = eINSTANCE.getEquipmentItem_Status();

		/**
		 * The meta object literal for the '<em><b>Work Cost Detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPMENT_ITEM__WORK_COST_DETAIL = eINSTANCE.getEquipmentItem_WorkCostDetail();

		/**
		 * The meta object literal for the '<em><b>Work Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPMENT_ITEM__WORK_TASK = eINSTANCE.getEquipmentItem_WorkTask();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.OneCallRequestImpl <em>One Call Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.OneCallRequestImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getOneCallRequest()
		 * @generated
		 */
		EClass ONE_CALL_REQUEST = eINSTANCE.getOneCallRequest();

		/**
		 * The meta object literal for the '<em><b>Marking Instruction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_CALL_REQUEST__MARKING_INSTRUCTION = eINSTANCE.getOneCallRequest_MarkingInstruction();

		/**
		 * The meta object literal for the '<em><b>Explosives Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_CALL_REQUEST__EXPLOSIVES_USED = eINSTANCE.getOneCallRequest_ExplosivesUsed();

		/**
		 * The meta object literal for the '<em><b>Work Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_CALL_REQUEST__WORK_LOCATIONS = eINSTANCE.getOneCallRequest_WorkLocations();

		/**
		 * The meta object literal for the '<em><b>Marked Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_CALL_REQUEST__MARKED_INDICATOR = eINSTANCE.getOneCallRequest_MarkedIndicator();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.LaborItemImpl <em>Labor Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.LaborItemImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getLaborItem()
		 * @generated
		 */
		EClass LABOR_ITEM = eINSTANCE.getLaborItem();

		/**
		 * The meta object literal for the '<em><b>Work Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABOR_ITEM__WORK_TASK = eINSTANCE.getLaborItem_WorkTask();

		/**
		 * The meta object literal for the '<em><b>Activity Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABOR_ITEM__ACTIVITY_CODE = eINSTANCE.getLaborItem_ActivityCode();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABOR_ITEM__COST = eINSTANCE.getLaborItem_Cost();

		/**
		 * The meta object literal for the '<em><b>Erp Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABOR_ITEM__ERP_PERSONS = eINSTANCE.getLaborItem_ErpPersons();

		/**
		 * The meta object literal for the '<em><b>Labor Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABOR_ITEM__LABOR_DURATION = eINSTANCE.getLaborItem_LaborDuration();

		/**
		 * The meta object literal for the '<em><b>Labor Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABOR_ITEM__LABOR_RATE = eINSTANCE.getLaborItem_LaborRate();

		/**
		 * The meta object literal for the '<em><b>Work Cost Detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABOR_ITEM__WORK_COST_DETAIL = eINSTANCE.getLaborItem_WorkCostDetail();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABOR_ITEM__STATUS = eINSTANCE.getLaborItem_Status();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.ProjectImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Budget</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__BUDGET = eINSTANCE.getProject_Budget();

		/**
		 * The meta object literal for the '<em><b>Erp Project Accounting</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__ERP_PROJECT_ACCOUNTING = eINSTANCE.getProject_ErpProjectAccounting();

		/**
		 * The meta object literal for the '<em><b>Works</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__WORKS = eINSTANCE.getProject_Works();

		/**
		 * The meta object literal for the '<em><b>Requests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__REQUESTS = eINSTANCE.getProject_Requests();

		/**
		 * The meta object literal for the '<em><b>Business Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__BUSINESS_CASE = eINSTANCE.getProject_BusinessCase();

		/**
		 * The meta object literal for the '<em><b>Sub Projects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__SUB_PROJECTS = eINSTANCE.getProject_SubProjects();

		/**
		 * The meta object literal for the '<em><b>Parent Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PARENT_PROJECT = eINSTANCE.getProject_ParentProject();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.AccessPermitImpl <em>Access Permit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.AccessPermitImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getAccessPermit()
		 * @generated
		 */
		EClass ACCESS_PERMIT = eINSTANCE.getAccessPermit();

		/**
		 * The meta object literal for the '<em><b>Expiration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_PERMIT__EXPIRATION_DATE = eINSTANCE.getAccessPermit_ExpirationDate();

		/**
		 * The meta object literal for the '<em><b>Application Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_PERMIT__APPLICATION_NUMBER = eINSTANCE.getAccessPermit_ApplicationNumber();

		/**
		 * The meta object literal for the '<em><b>Effective Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_PERMIT__EFFECTIVE_DATE = eINSTANCE.getAccessPermit_EffectiveDate();

		/**
		 * The meta object literal for the '<em><b>Permit ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_PERMIT__PERMIT_ID = eINSTANCE.getAccessPermit_PermitID();

		/**
		 * The meta object literal for the '<em><b>Payment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_PERMIT__PAYMENT = eINSTANCE.getAccessPermit_Payment();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.InspectionDataSetImpl <em>Inspection Data Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.InspectionDataSetImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getInspectionDataSet()
		 * @generated
		 */
		EClass INSPECTION_DATA_SET = eINSTANCE.getInspectionDataSet();

		/**
		 * The meta object literal for the '<em><b>Location Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSPECTION_DATA_SET__LOCATION_CONDITION = eINSTANCE.getInspectionDataSet_LocationCondition();

		/**
		 * The meta object literal for the '<em><b>According To Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES = eINSTANCE.getInspectionDataSet_AccordingToSchedules();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.RegulationImpl <em>Regulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.RegulationImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getRegulation()
		 * @generated
		 */
		EClass REGULATION = eINSTANCE.getRegulation();

		/**
		 * The meta object literal for the '<em><b>Reference Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULATION__REFERENCE_NUMBER = eINSTANCE.getRegulation_ReferenceNumber();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.ShiftPatternImpl <em>Shift Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.ShiftPatternImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getShiftPattern()
		 * @generated
		 */
		EClass SHIFT_PATTERN = eINSTANCE.getShiftPattern();

		/**
		 * The meta object literal for the '<em><b>Assignment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIFT_PATTERN__ASSIGNMENT_TYPE = eINSTANCE.getShiftPattern_AssignmentType();

		/**
		 * The meta object literal for the '<em><b>Crews</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIFT_PATTERN__CREWS = eINSTANCE.getShiftPattern_Crews();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIFT_PATTERN__STATUS = eINSTANCE.getShiftPattern_Status();

		/**
		 * The meta object literal for the '<em><b>Cycle Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIFT_PATTERN__CYCLE_COUNT = eINSTANCE.getShiftPattern_CycleCount();

		/**
		 * The meta object literal for the '<em><b>Validity Interval</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIFT_PATTERN__VALIDITY_INTERVAL = eINSTANCE.getShiftPattern_ValidityInterval();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.NonStandardItemImpl <em>Non Standard Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.NonStandardItemImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getNonStandardItem()
		 * @generated
		 */
		EClass NON_STANDARD_ITEM = eINSTANCE.getNonStandardItem();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_STANDARD_ITEM__CODE = eINSTANCE.getNonStandardItem_Code();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_STANDARD_ITEM__AMOUNT = eINSTANCE.getNonStandardItem_Amount();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.WorkLocationImpl <em>Work Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.WorkLocationImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getWorkLocation()
		 * @generated
		 */
		EClass WORK_LOCATION = eINSTANCE.getWorkLocation();

		/**
		 * The meta object literal for the '<em><b>Subdivision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_LOCATION__SUBDIVISION = eINSTANCE.getWorkLocation_Subdivision();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_LOCATION__BLOCK = eINSTANCE.getWorkLocation_Block();

		/**
		 * The meta object literal for the '<em><b>Design Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_LOCATION__DESIGN_LOCATIONS = eINSTANCE.getWorkLocation_DesignLocations();

		/**
		 * The meta object literal for the '<em><b>One Call Request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_LOCATION__ONE_CALL_REQUEST = eINSTANCE.getWorkLocation_OneCallRequest();

		/**
		 * The meta object literal for the '<em><b>Lot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_LOCATION__LOT = eINSTANCE.getWorkLocation_Lot();

		/**
		 * The meta object literal for the '<em><b>Nearest Intersection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_LOCATION__NEAREST_INTERSECTION = eINSTANCE.getWorkLocation_NearestIntersection();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.DesignLocationCUImpl <em>Design Location CU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.DesignLocationCUImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getDesignLocationCU()
		 * @generated
		 */
		EClass DESIGN_LOCATION_CU = eINSTANCE.getDesignLocationCU();

		/**
		 * The meta object literal for the '<em><b>Designs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_LOCATION_CU__DESIGNS = eINSTANCE.getDesignLocationCU_Designs();

		/**
		 * The meta object literal for the '<em><b>Removal Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_LOCATION_CU__REMOVAL_DATE = eINSTANCE.getDesignLocationCU_RemovalDate();

		/**
		 * The meta object literal for the '<em><b>Condition Factors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_LOCATION_CU__CONDITION_FACTORS = eINSTANCE.getDesignLocationCU_ConditionFactors();

		/**
		 * The meta object literal for the '<em><b>Compatible Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_LOCATION_CU__COMPATIBLE_UNITS = eINSTANCE.getDesignLocationCU_CompatibleUnits();

		/**
		 * The meta object literal for the '<em><b>Cu Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_LOCATION_CU__CU_QUANTITY = eINSTANCE.getDesignLocationCU_CuQuantity();

		/**
		 * The meta object literal for the '<em><b>Cu Account</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_LOCATION_CU__CU_ACCOUNT = eINSTANCE.getDesignLocationCU_CuAccount();

		/**
		 * The meta object literal for the '<em><b>Work Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_LOCATION_CU__WORK_TASKS = eINSTANCE.getDesignLocationCU_WorkTasks();

		/**
		 * The meta object literal for the '<em><b>Design Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_LOCATION_CU__DESIGN_LOCATION = eINSTANCE.getDesignLocationCU_DesignLocation();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_LOCATION_CU__STATUS = eINSTANCE.getDesignLocationCU_Status();

		/**
		 * The meta object literal for the '<em><b>Cu Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_LOCATION_CU__CU_ACTION = eINSTANCE.getDesignLocationCU_CuAction();

		/**
		 * The meta object literal for the '<em><b>Energization Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_LOCATION_CU__ENERGIZATION_FLAG = eINSTANCE.getDesignLocationCU_EnergizationFlag();

		/**
		 * The meta object literal for the '<em><b>CU Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_LOCATION_CU__CU_GROUPS = eINSTANCE.getDesignLocationCU_CUGroups();

		/**
		 * The meta object literal for the '<em><b>Cu Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_LOCATION_CU__CU_USAGE = eINSTANCE.getDesignLocationCU_CuUsage();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.DesignLocationImpl <em>Design Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.DesignLocationImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getDesignLocation()
		 * @generated
		 */
		EClass DESIGN_LOCATION = eINSTANCE.getDesignLocation();

		/**
		 * The meta object literal for the '<em><b>Span Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_LOCATION__SPAN_LENGTH = eINSTANCE.getDesignLocation_SpanLength();

		/**
		 * The meta object literal for the '<em><b>Condition Factors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_LOCATION__CONDITION_FACTORS = eINSTANCE.getDesignLocation_ConditionFactors();

		/**
		 * The meta object literal for the '<em><b>Material Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_LOCATION__MATERIAL_ITEMS = eINSTANCE.getDesignLocation_MaterialItems();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_LOCATION__STATUS = eINSTANCE.getDesignLocation_Status();

		/**
		 * The meta object literal for the '<em><b>Diagrams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_LOCATION__DIAGRAMS = eINSTANCE.getDesignLocation_Diagrams();

		/**
		 * The meta object literal for the '<em><b>Work Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_LOCATION__WORK_LOCATIONS = eINSTANCE.getDesignLocation_WorkLocations();

		/**
		 * The meta object literal for the '<em><b>Design Location CUs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_LOCATION__DESIGN_LOCATION_CUS = eINSTANCE.getDesignLocation_DesignLocationCUs();

		/**
		 * The meta object literal for the '<em><b>Designs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_LOCATION__DESIGNS = eINSTANCE.getDesignLocation_Designs();

		/**
		 * The meta object literal for the '<em><b>Erp Bom Item Datas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_LOCATION__ERP_BOM_ITEM_DATAS = eINSTANCE.getDesignLocation_ErpBomItemDatas();

		/**
		 * The meta object literal for the '<em><b>Misc Cost Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_LOCATION__MISC_COST_ITEMS = eINSTANCE.getDesignLocation_MiscCostItems();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.CULaborCodeImpl <em>CU Labor Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.CULaborCodeImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getCULaborCode()
		 * @generated
		 */
		EClass CU_LABOR_CODE = eINSTANCE.getCULaborCode();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CU_LABOR_CODE__CODE = eINSTANCE.getCULaborCode_Code();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CU_LABOR_CODE__STATUS = eINSTANCE.getCULaborCode_Status();

		/**
		 * The meta object literal for the '<em><b>CU Labor Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CU_LABOR_CODE__CU_LABOR_ITEMS = eINSTANCE.getCULaborCode_CULaborItems();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.ConditionFactorImpl <em>Condition Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.ConditionFactorImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getConditionFactor()
		 * @generated
		 */
		EClass CONDITION_FACTOR = eINSTANCE.getConditionFactor();

		/**
		 * The meta object literal for the '<em><b>Cf Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_FACTOR__CF_VALUE = eINSTANCE.getConditionFactor_CfValue();

		/**
		 * The meta object literal for the '<em><b>Design Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_FACTOR__DESIGN_LOCATIONS = eINSTANCE.getConditionFactor_DesignLocations();

		/**
		 * The meta object literal for the '<em><b>Design Location CUs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_FACTOR__DESIGN_LOCATION_CUS = eINSTANCE.getConditionFactor_DesignLocationCUs();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_FACTOR__KIND = eINSTANCE.getConditionFactor_Kind();

		/**
		 * The meta object literal for the '<em><b>Designs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_FACTOR__DESIGNS = eINSTANCE.getConditionFactor_Designs();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_FACTOR__STATUS = eINSTANCE.getConditionFactor_Status();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.CUWorkEquipmentItemImpl <em>CU Work Equipment Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.CUWorkEquipmentItemImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getCUWorkEquipmentItem()
		 * @generated
		 */
		EClass CU_WORK_EQUIPMENT_ITEM = eINSTANCE.getCUWorkEquipmentItem();

		/**
		 * The meta object literal for the '<em><b>Equip Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CU_WORK_EQUIPMENT_ITEM__EQUIP_CODE = eINSTANCE.getCUWorkEquipmentItem_EquipCode();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CU_WORK_EQUIPMENT_ITEM__RATE = eINSTANCE.getCUWorkEquipmentItem_Rate();

		/**
		 * The meta object literal for the '<em><b>Type Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CU_WORK_EQUIPMENT_ITEM__TYPE_ASSET = eINSTANCE.getCUWorkEquipmentItem_TypeAsset();

		/**
		 * The meta object literal for the '<em><b>Compatible Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CU_WORK_EQUIPMENT_ITEM__COMPATIBLE_UNITS = eINSTANCE.getCUWorkEquipmentItem_CompatibleUnits();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CU_WORK_EQUIPMENT_ITEM__STATUS = eINSTANCE.getCUWorkEquipmentItem_Status();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.QualificationRequirementImpl <em>Qualification Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.QualificationRequirementImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getQualificationRequirement()
		 * @generated
		 */
		EClass QUALIFICATION_REQUIREMENT = eINSTANCE.getQualificationRequirement();

		/**
		 * The meta object literal for the '<em><b>Specifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFICATION_REQUIREMENT__SPECIFICATIONS = eINSTANCE.getQualificationRequirement_Specifications();

		/**
		 * The meta object literal for the '<em><b>Work Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFICATION_REQUIREMENT__WORK_TASKS = eINSTANCE.getQualificationRequirement_WorkTasks();

		/**
		 * The meta object literal for the '<em><b>CU Labor Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFICATION_REQUIREMENT__CU_LABOR_ITEMS = eINSTANCE.getQualificationRequirement_CULaborItems();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFICATION_REQUIREMENT__SKILLS = eINSTANCE.getQualificationRequirement_Skills();

		/**
		 * The meta object literal for the '<em><b>Qualification ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFICATION_REQUIREMENT__QUALIFICATION_ID = eINSTANCE.getQualificationRequirement_QualificationID();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.CUContractorItemImpl <em>CU Contractor Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.CUContractorItemImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getCUContractorItem()
		 * @generated
		 */
		EClass CU_CONTRACTOR_ITEM = eINSTANCE.getCUContractorItem();

		/**
		 * The meta object literal for the '<em><b>Activity Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CU_CONTRACTOR_ITEM__ACTIVITY_CODE = eINSTANCE.getCUContractorItem_ActivityCode();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CU_CONTRACTOR_ITEM__STATUS = eINSTANCE.getCUContractorItem_Status();

		/**
		 * The meta object literal for the '<em><b>Bid Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CU_CONTRACTOR_ITEM__BID_AMOUNT = eINSTANCE.getCUContractorItem_BidAmount();

		/**
		 * The meta object literal for the '<em><b>Compatible Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CU_CONTRACTOR_ITEM__COMPATIBLE_UNITS = eINSTANCE.getCUContractorItem_CompatibleUnits();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.MaterialItemImpl <em>Material Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.MaterialItemImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getMaterialItem()
		 * @generated
		 */
		EClass MATERIAL_ITEM = eINSTANCE.getMaterialItem();

		/**
		 * The meta object literal for the '<em><b>Erp PO Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL_ITEM__ERP_PO_LINE_ITEMS = eINSTANCE.getMaterialItem_ErpPOLineItems();

		/**
		 * The meta object literal for the '<em><b>Type Material</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL_ITEM__TYPE_MATERIAL = eINSTANCE.getMaterialItem_TypeMaterial();

		/**
		 * The meta object literal for the '<em><b>Erp Inventory Counts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL_ITEM__ERP_INVENTORY_COUNTS = eINSTANCE.getMaterialItem_ErpInventoryCounts();

		/**
		 * The meta object literal for the '<em><b>Usages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL_ITEM__USAGES = eINSTANCE.getMaterialItem_Usages();

		/**
		 * The meta object literal for the '<em><b>Work Cost Detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL_ITEM__WORK_COST_DETAIL = eINSTANCE.getMaterialItem_WorkCostDetail();

		/**
		 * The meta object literal for the '<em><b>Work Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL_ITEM__WORK_TASK = eINSTANCE.getMaterialItem_WorkTask();

		/**
		 * The meta object literal for the '<em><b>Account</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL_ITEM__ACCOUNT = eINSTANCE.getMaterialItem_Account();

		/**
		 * The meta object literal for the '<em><b>Cost Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL_ITEM__COST_DESCRIPTION = eINSTANCE.getMaterialItem_CostDescription();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL_ITEM__QUANTITY = eINSTANCE.getMaterialItem_Quantity();

		/**
		 * The meta object literal for the '<em><b>Cost Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL_ITEM__COST_TYPE = eINSTANCE.getMaterialItem_CostType();

		/**
		 * The meta object literal for the '<em><b>External Ref ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL_ITEM__EXTERNAL_REF_ID = eINSTANCE.getMaterialItem_ExternalRefID();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL_ITEM__STATUS = eINSTANCE.getMaterialItem_Status();

		/**
		 * The meta object literal for the '<em><b>Erp Rec Delv Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL_ITEM__ERP_REC_DELV_LINE_ITEMS = eINSTANCE.getMaterialItem_ErpRecDelvLineItems();

		/**
		 * The meta object literal for the '<em><b>Design Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL_ITEM__DESIGN_LOCATION = eINSTANCE.getMaterialItem_DesignLocation();

		/**
		 * The meta object literal for the '<em><b>Actual Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL_ITEM__ACTUAL_COST = eINSTANCE.getMaterialItem_ActualCost();

		/**
		 * The meta object literal for the '<em><b>Material Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL_ITEM__MATERIAL_CODE = eINSTANCE.getMaterialItem_MaterialCode();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.PropertyUnitImpl <em>Property Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.PropertyUnitImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getPropertyUnit()
		 * @generated
		 */
		EClass PROPERTY_UNIT = eINSTANCE.getPropertyUnit();

		/**
		 * The meta object literal for the '<em><b>Work Cost Details</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_UNIT__WORK_COST_DETAILS = eINSTANCE.getPropertyUnit_WorkCostDetails();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_UNIT__STATUS = eINSTANCE.getPropertyUnit_Status();

		/**
		 * The meta object literal for the '<em><b>Compatible Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_UNIT__COMPATIBLE_UNITS = eINSTANCE.getPropertyUnit_CompatibleUnits();

		/**
		 * The meta object literal for the '<em><b>Property Account</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_UNIT__PROPERTY_ACCOUNT = eINSTANCE.getPropertyUnit_PropertyAccount();

		/**
		 * The meta object literal for the '<em><b>CU Material Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_UNIT__CU_MATERIAL_ITEMS = eINSTANCE.getPropertyUnit_CUMaterialItems();

		/**
		 * The meta object literal for the '<em><b>Accounting Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_UNIT__ACCOUNTING_USAGE = eINSTANCE.getPropertyUnit_AccountingUsage();

		/**
		 * The meta object literal for the '<em><b>Activity Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_UNIT__ACTIVITY_CODE = eINSTANCE.getPropertyUnit_ActivityCode();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.CompatibleUnitImpl <em>Compatible Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.CompatibleUnitImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getCompatibleUnit()
		 * @generated
		 */
		EClass COMPATIBLE_UNIT = eINSTANCE.getCompatibleUnit();

		/**
		 * The meta object literal for the '<em><b>Design Location CUs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPATIBLE_UNIT__DESIGN_LOCATION_CUS = eINSTANCE.getCompatibleUnit_DesignLocationCUs();

		/**
		 * The meta object literal for the '<em><b>Est Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPATIBLE_UNIT__EST_COST = eINSTANCE.getCompatibleUnit_EstCost();

		/**
		 * The meta object literal for the '<em><b>Property Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPATIBLE_UNIT__PROPERTY_UNIT = eINSTANCE.getCompatibleUnit_PropertyUnit();

		/**
		 * The meta object literal for the '<em><b>CU Labor Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPATIBLE_UNIT__CU_LABOR_ITEMS = eINSTANCE.getCompatibleUnit_CULaborItems();

		/**
		 * The meta object literal for the '<em><b>CU Material Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPATIBLE_UNIT__CU_MATERIAL_ITEMS = eINSTANCE.getCompatibleUnit_CUMaterialItems();

		/**
		 * The meta object literal for the '<em><b>CU Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPATIBLE_UNIT__CU_GROUP = eINSTANCE.getCompatibleUnit_CUGroup();

		/**
		 * The meta object literal for the '<em><b>CU Work Equipment Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPATIBLE_UNIT__CU_WORK_EQUIPMENT_ITEMS = eINSTANCE.getCompatibleUnit_CUWorkEquipmentItems();

		/**
		 * The meta object literal for the '<em><b>Cost Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPATIBLE_UNIT__COST_TYPE = eINSTANCE.getCompatibleUnit_CostType();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPATIBLE_UNIT__QUANTITY = eINSTANCE.getCompatibleUnit_Quantity();

		/**
		 * The meta object literal for the '<em><b>Procedures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPATIBLE_UNIT__PROCEDURES = eINSTANCE.getCompatibleUnit_Procedures();

		/**
		 * The meta object literal for the '<em><b>CU Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPATIBLE_UNIT__CU_ASSETS = eINSTANCE.getCompatibleUnit_CUAssets();

		/**
		 * The meta object literal for the '<em><b>CU Allowable Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPATIBLE_UNIT__CU_ALLOWABLE_ACTION = eINSTANCE.getCompatibleUnit_CUAllowableAction();

		/**
		 * The meta object literal for the '<em><b>CU Contractor Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPATIBLE_UNIT__CU_CONTRACTOR_ITEMS = eINSTANCE.getCompatibleUnit_CUContractorItems();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.WorkTaskImpl <em>Work Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.WorkTaskImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getWorkTask()
		 * @generated
		 */
		EClass WORK_TASK = eINSTANCE.getWorkTask();

		/**
		 * The meta object literal for the '<em><b>Crews</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_TASK__CREWS = eINSTANCE.getWorkTask_Crews();

		/**
		 * The meta object literal for the '<em><b>Switching Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_TASK__SWITCHING_SCHEDULES = eINSTANCE.getWorkTask_SwitchingSchedules();

		/**
		 * The meta object literal for the '<em><b>Misc Cost Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_TASK__MISC_COST_ITEMS = eINSTANCE.getWorkTask_MiscCostItems();

		/**
		 * The meta object literal for the '<em><b>Labor Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_TASK__LABOR_ITEMS = eINSTANCE.getWorkTask_LaborItems();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_TASK__PRIORITY = eINSTANCE.getWorkTask_Priority();

		/**
		 * The meta object literal for the '<em><b>Work Flow Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_TASK__WORK_FLOW_STEP = eINSTANCE.getWorkTask_WorkFlowStep();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_TASK__ASSETS = eINSTANCE.getWorkTask_Assets();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_TASK__CAPABILITIES = eINSTANCE.getWorkTask_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Sched Override</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_TASK__SCHED_OVERRIDE = eINSTANCE.getWorkTask_SchedOverride();

		/**
		 * The meta object literal for the '<em><b>Work</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_TASK__WORK = eINSTANCE.getWorkTask_Work();

		/**
		 * The meta object literal for the '<em><b>Design Location CUs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_TASK__DESIGN_LOCATION_CUS = eINSTANCE.getWorkTask_DesignLocationCUs();

		/**
		 * The meta object literal for the '<em><b>Contractor Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_TASK__CONTRACTOR_ITEMS = eINSTANCE.getWorkTask_ContractorItems();

		/**
		 * The meta object literal for the '<em><b>Design</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_TASK__DESIGN = eINSTANCE.getWorkTask_Design();

		/**
		 * The meta object literal for the '<em><b>Equipment Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_TASK__EQUIPMENT_ITEMS = eINSTANCE.getWorkTask_EquipmentItems();

		/**
		 * The meta object literal for the '<em><b>Material Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_TASK__MATERIAL_ITEMS = eINSTANCE.getWorkTask_MaterialItems();

		/**
		 * The meta object literal for the '<em><b>Work Cost Details</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_TASK__WORK_COST_DETAILS = eINSTANCE.getWorkTask_WorkCostDetails();

		/**
		 * The meta object literal for the '<em><b>Qualification Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_TASK__QUALIFICATION_REQUIREMENTS = eINSTANCE.getWorkTask_QualificationRequirements();

		/**
		 * The meta object literal for the '<em><b>Usages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_TASK__USAGES = eINSTANCE.getWorkTask_Usages();

		/**
		 * The meta object literal for the '<em><b>Overhead Cost</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_TASK__OVERHEAD_COST = eINSTANCE.getWorkTask_OverheadCost();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.TypeMaterialImpl <em>Type Material</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.TypeMaterialImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getTypeMaterial()
		 * @generated
		 */
		EClass TYPE_MATERIAL = eINSTANCE.getTypeMaterial();

		/**
		 * The meta object literal for the '<em><b>Erp Issue Inventories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MATERIAL__ERP_ISSUE_INVENTORIES = eINSTANCE.getTypeMaterial_ErpIssueInventories();

		/**
		 * The meta object literal for the '<em><b>Stock Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_MATERIAL__STOCK_ITEM = eINSTANCE.getTypeMaterial_StockItem();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_MATERIAL__QUANTITY = eINSTANCE.getTypeMaterial_Quantity();

		/**
		 * The meta object literal for the '<em><b>Erp Req Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MATERIAL__ERP_REQ_LINE_ITEMS = eINSTANCE.getTypeMaterial_ErpReqLineItems();

		/**
		 * The meta object literal for the '<em><b>Material Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MATERIAL__MATERIAL_ITEMS = eINSTANCE.getTypeMaterial_MaterialItems();

		/**
		 * The meta object literal for the '<em><b>Cost Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_MATERIAL__COST_TYPE = eINSTANCE.getTypeMaterial_CostType();

		/**
		 * The meta object literal for the '<em><b>Est Unit Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_MATERIAL__EST_UNIT_COST = eINSTANCE.getTypeMaterial_EstUnitCost();

		/**
		 * The meta object literal for the '<em><b>CU Material Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MATERIAL__CU_MATERIAL_ITEMS = eINSTANCE.getTypeMaterial_CUMaterialItems();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.CapabilityImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__CATEGORY = eINSTANCE.getCapability_Category();

		/**
		 * The meta object literal for the '<em><b>Work Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__WORK_TASKS = eINSTANCE.getCapability_WorkTasks();

		/**
		 * The meta object literal for the '<em><b>Validity Interval</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__VALIDITY_INTERVAL = eINSTANCE.getCapability_ValidityInterval();

		/**
		 * The meta object literal for the '<em><b>Crew</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__CREW = eINSTANCE.getCapability_Crew();

		/**
		 * The meta object literal for the '<em><b>Crafts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__CRAFTS = eINSTANCE.getCapability_Crafts();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__STATUS = eINSTANCE.getCapability_Status();

		/**
		 * The meta object literal for the '<em><b>Performance Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__PERFORMANCE_FACTOR = eINSTANCE.getCapability_PerformanceFactor();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.CUAssetImpl <em>CU Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.CUAssetImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getCUAsset()
		 * @generated
		 */
		EClass CU_ASSET = eINSTANCE.getCUAsset();

		/**
		 * The meta object literal for the '<em><b>Type Asset Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CU_ASSET__TYPE_ASSET_CODE = eINSTANCE.getCUAsset_TypeAssetCode();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CU_ASSET__STATUS = eINSTANCE.getCUAsset_Status();

		/**
		 * The meta object literal for the '<em><b>Type Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CU_ASSET__TYPE_ASSET = eINSTANCE.getCUAsset_TypeAsset();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CU_ASSET__QUANTITY = eINSTANCE.getCUAsset_Quantity();

		/**
		 * The meta object literal for the '<em><b>Compatible Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CU_ASSET__COMPATIBLE_UNITS = eINSTANCE.getCUAsset_CompatibleUnits();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.ContractorItemImpl <em>Contractor Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.ContractorItemImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getContractorItem()
		 * @generated
		 */
		EClass CONTRACTOR_ITEM = eINSTANCE.getContractorItem();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACTOR_ITEM__STATUS = eINSTANCE.getContractorItem_Status();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACTOR_ITEM__COST = eINSTANCE.getContractorItem_Cost();

		/**
		 * The meta object literal for the '<em><b>Activity Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACTOR_ITEM__ACTIVITY_CODE = eINSTANCE.getContractorItem_ActivityCode();

		/**
		 * The meta object literal for the '<em><b>Erp Payables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACTOR_ITEM__ERP_PAYABLES = eINSTANCE.getContractorItem_ErpPayables();

		/**
		 * The meta object literal for the '<em><b>Work Cost Detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACTOR_ITEM__WORK_COST_DETAIL = eINSTANCE.getContractorItem_WorkCostDetail();

		/**
		 * The meta object literal for the '<em><b>Work Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACTOR_ITEM__WORK_TASK = eINSTANCE.getContractorItem_WorkTask();

		/**
		 * The meta object literal for the '<em><b>Bid Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACTOR_ITEM__BID_AMOUNT = eINSTANCE.getContractorItem_BidAmount();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.InfoQuestionImpl <em>Info Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfoQuestionImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getInfoQuestion()
		 * @generated
		 */
		EClass INFO_QUESTION = eINSTANCE.getInfoQuestion();

		/**
		 * The meta object literal for the '<em><b>Answer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_QUESTION__ANSWER = eINSTANCE.getInfoQuestion_Answer();

		/**
		 * The meta object literal for the '<em><b>Question Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_QUESTION__QUESTION_TEXT = eINSTANCE.getInfoQuestion_QuestionText();

		/**
		 * The meta object literal for the '<em><b>Answer Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_QUESTION__ANSWER_DATE_TIME = eINSTANCE.getInfoQuestion_AnswerDateTime();

		/**
		 * The meta object literal for the '<em><b>Question Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_QUESTION__QUESTION_CATEGORY = eINSTANCE.getInfoQuestion_QuestionCategory();

		/**
		 * The meta object literal for the '<em><b>Answer Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_QUESTION__ANSWER_REMARK = eINSTANCE.getInfoQuestion_AnswerRemark();

		/**
		 * The meta object literal for the '<em><b>Question Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_QUESTION__QUESTION_REMARK = eINSTANCE.getInfoQuestion_QuestionRemark();

		/**
		 * The meta object literal for the '<em><b>Question Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_QUESTION__QUESTION_CODE = eINSTANCE.getInfoQuestion_QuestionCode();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.WorkStatusEntryImpl <em>Work Status Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.WorkStatusEntryImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getWorkStatusEntry()
		 * @generated
		 */
		EClass WORK_STATUS_ENTRY = eINSTANCE.getWorkStatusEntry();

		/**
		 * The meta object literal for the '<em><b>Percent Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_STATUS_ENTRY__PERCENT_COMPLETE = eINSTANCE.getWorkStatusEntry_PercentComplete();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.AppointmentImpl <em>Appointment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.AppointmentImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getAppointment()
		 * @generated
		 */
		EClass APPOINTMENT = eINSTANCE.getAppointment();

		/**
		 * The meta object literal for the '<em><b>Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPOINTMENT__REMARK = eINSTANCE.getAppointment_Remark();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPOINTMENT__ADDRESS = eINSTANCE.getAppointment_Address();

		/**
		 * The meta object literal for the '<em><b>Call Back</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPOINTMENT__CALL_BACK = eINSTANCE.getAppointment_CallBack();

		/**
		 * The meta object literal for the '<em><b>Meeting Interval</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPOINTMENT__MEETING_INTERVAL = eINSTANCE.getAppointment_MeetingInterval();

		/**
		 * The meta object literal for the '<em><b>Erp Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPOINTMENT__ERP_PERSONS = eINSTANCE.getAppointment_ErpPersons();

		/**
		 * The meta object literal for the '<em><b>Call Ahead</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPOINTMENT__CALL_AHEAD = eINSTANCE.getAppointment_CallAhead();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.MaintenanceDataSetImpl <em>Maintenance Data Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.MaintenanceDataSetImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getMaintenanceDataSet()
		 * @generated
		 */
		EClass MAINTENANCE_DATA_SET = eINSTANCE.getMaintenanceDataSet();

		/**
		 * The meta object literal for the '<em><b>Maint Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTENANCE_DATA_SET__MAINT_CODE = eINSTANCE.getMaintenanceDataSet_MaintCode();

		/**
		 * The meta object literal for the '<em><b>Condition Before</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTENANCE_DATA_SET__CONDITION_BEFORE = eINSTANCE.getMaintenanceDataSet_ConditionBefore();

		/**
		 * The meta object literal for the '<em><b>Condition After</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTENANCE_DATA_SET__CONDITION_AFTER = eINSTANCE.getMaintenanceDataSet_ConditionAfter();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.CUGroupImpl <em>CU Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.CUGroupImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getCUGroup()
		 * @generated
		 */
		EClass CU_GROUP = eINSTANCE.getCUGroup();

		/**
		 * The meta object literal for the '<em><b>Child CU Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CU_GROUP__CHILD_CU_GROUPS = eINSTANCE.getCUGroup_ChildCUGroups();

		/**
		 * The meta object literal for the '<em><b>Parent CU Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CU_GROUP__PARENT_CU_GROUPS = eINSTANCE.getCUGroup_ParentCUGroups();

		/**
		 * The meta object literal for the '<em><b>Design Location CUs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CU_GROUP__DESIGN_LOCATION_CUS = eINSTANCE.getCUGroup_DesignLocationCUs();

		/**
		 * The meta object literal for the '<em><b>Compatible Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CU_GROUP__COMPATIBLE_UNITS = eINSTANCE.getCUGroup_CompatibleUnits();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CU_GROUP__STATUS = eINSTANCE.getCUGroup_Status();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.CrewImpl <em>Crew</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.CrewImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getCrew()
		 * @generated
		 */
		EClass CREW = eINSTANCE.getCrew();

		/**
		 * The meta object literal for the '<em><b>Work Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__WORK_TASKS = eINSTANCE.getCrew_WorkTasks();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__ASSIGNMENTS = eINSTANCE.getCrew_Assignments();

		/**
		 * The meta object literal for the '<em><b>Shift Patterns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__SHIFT_PATTERNS = eINSTANCE.getCrew_ShiftPatterns();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__ROUTE = eINSTANCE.getCrew_Route();

		/**
		 * The meta object literal for the '<em><b>Tools</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__TOOLS = eINSTANCE.getCrew_Tools();

		/**
		 * The meta object literal for the '<em><b>Vehicles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__VEHICLES = eINSTANCE.getCrew_Vehicles();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREW__CATEGORY = eINSTANCE.getCrew_Category();

		/**
		 * The meta object literal for the '<em><b>Crew Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__CREW_MEMBERS = eINSTANCE.getCrew_CrewMembers();

		/**
		 * The meta object literal for the '<em><b>Work Equipment Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__WORK_EQUIPMENT_ASSETS = eINSTANCE.getCrew_WorkEquipmentAssets();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__LOCATIONS = eINSTANCE.getCrew_Locations();

		/**
		 * The meta object literal for the '<em><b>Organisations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__ORGANISATIONS = eINSTANCE.getCrew_Organisations();

		/**
		 * The meta object literal for the '<em><b>Switching Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__SWITCHING_SCHEDULES = eINSTANCE.getCrew_SwitchingSchedules();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__CAPABILITIES = eINSTANCE.getCrew_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Outage Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__OUTAGE_STEPS = eINSTANCE.getCrew_OutageSteps();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.RequestImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__PRIORITY = eINSTANCE.getRequest_Priority();

		/**
		 * The meta object literal for the '<em><b>Organisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__ORGANISATION = eINSTANCE.getRequest_Organisation();

		/**
		 * The meta object literal for the '<em><b>Corporate Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__CORPORATE_CODE = eINSTANCE.getRequest_CorporateCode();

		/**
		 * The meta object literal for the '<em><b>Works</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__WORKS = eINSTANCE.getRequest_Works();

		/**
		 * The meta object literal for the '<em><b>Erp Quote Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__ERP_QUOTE_LINE_ITEM = eINSTANCE.getRequest_ErpQuoteLineItem();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__PROJECTS = eINSTANCE.getRequest_Projects();

		/**
		 * The meta object literal for the '<em><b>Action Needed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__ACTION_NEEDED = eINSTANCE.getRequest_ActionNeeded();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.OverheadCostImpl <em>Overhead Cost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.OverheadCostImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getOverheadCost()
		 * @generated
		 */
		EClass OVERHEAD_COST = eINSTANCE.getOverheadCost();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERHEAD_COST__CODE = eINSTANCE.getOverheadCost_Code();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERHEAD_COST__COST = eINSTANCE.getOverheadCost_Cost();

		/**
		 * The meta object literal for the '<em><b>Work Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERHEAD_COST__WORK_TASKS = eINSTANCE.getOverheadCost_WorkTasks();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERHEAD_COST__STATUS = eINSTANCE.getOverheadCost_Status();

		/**
		 * The meta object literal for the '<em><b>Work Cost Details</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERHEAD_COST__WORK_COST_DETAILS = eINSTANCE.getOverheadCost_WorkCostDetails();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.DiagnosisDataSetImpl <em>Diagnosis Data Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.DiagnosisDataSetImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getDiagnosisDataSet()
		 * @generated
		 */
		EClass DIAGNOSIS_DATA_SET = eINSTANCE.getDiagnosisDataSet();

		/**
		 * The meta object literal for the '<em><b>Phase Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSIS_DATA_SET__PHASE_CODE = eINSTANCE.getDiagnosisDataSet_PhaseCode();

		/**
		 * The meta object literal for the '<em><b>Final Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSIS_DATA_SET__FINAL_CODE = eINSTANCE.getDiagnosisDataSet_FinalCode();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSIS_DATA_SET__EFFECT = eINSTANCE.getDiagnosisDataSet_Effect();

		/**
		 * The meta object literal for the '<em><b>Failure Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSIS_DATA_SET__FAILURE_MODE = eINSTANCE.getDiagnosisDataSet_FailureMode();

		/**
		 * The meta object literal for the '<em><b>Root Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSIS_DATA_SET__ROOT_ORIGIN = eINSTANCE.getDiagnosisDataSet_RootOrigin();

		/**
		 * The meta object literal for the '<em><b>Final Cause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSIS_DATA_SET__FINAL_CAUSE = eINSTANCE.getDiagnosisDataSet_FinalCause();

		/**
		 * The meta object literal for the '<em><b>Root Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSIS_DATA_SET__ROOT_REMARK = eINSTANCE.getDiagnosisDataSet_RootRemark();

		/**
		 * The meta object literal for the '<em><b>Root Cause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSIS_DATA_SET__ROOT_CAUSE = eINSTANCE.getDiagnosisDataSet_RootCause();

		/**
		 * The meta object literal for the '<em><b>Preliminary Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSIS_DATA_SET__PRELIMINARY_REMARK = eINSTANCE.getDiagnosisDataSet_PreliminaryRemark();

		/**
		 * The meta object literal for the '<em><b>Preliminary Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSIS_DATA_SET__PRELIMINARY_CODE = eINSTANCE.getDiagnosisDataSet_PreliminaryCode();

		/**
		 * The meta object literal for the '<em><b>Preliminary Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSIS_DATA_SET__PRELIMINARY_DATE_TIME = eINSTANCE.getDiagnosisDataSet_PreliminaryDateTime();

		/**
		 * The meta object literal for the '<em><b>Final Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSIS_DATA_SET__FINAL_REMARK = eINSTANCE.getDiagnosisDataSet_FinalRemark();

		/**
		 * The meta object literal for the '<em><b>Final Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSIS_DATA_SET__FINAL_ORIGIN = eINSTANCE.getDiagnosisDataSet_FinalOrigin();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.impl.CULaborItemImpl <em>CU Labor Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.impl.CULaborItemImpl
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getCULaborItem()
		 * @generated
		 */
		EClass CU_LABOR_ITEM = eINSTANCE.getCULaborItem();

		/**
		 * The meta object literal for the '<em><b>Qualification Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CU_LABOR_ITEM__QUALIFICATION_REQUIREMENTS = eINSTANCE.getCULaborItem_QualificationRequirements();

		/**
		 * The meta object literal for the '<em><b>CU Labor Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CU_LABOR_ITEM__CU_LABOR_CODE = eINSTANCE.getCULaborItem_CULaborCode();

		/**
		 * The meta object literal for the '<em><b>Activity Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CU_LABOR_ITEM__ACTIVITY_CODE = eINSTANCE.getCULaborItem_ActivityCode();

		/**
		 * The meta object literal for the '<em><b>Labor Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CU_LABOR_ITEM__LABOR_DURATION = eINSTANCE.getCULaborItem_LaborDuration();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CU_LABOR_ITEM__STATUS = eINSTANCE.getCULaborItem_Status();

		/**
		 * The meta object literal for the '<em><b>Compatible Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CU_LABOR_ITEM__COMPATIBLE_UNITS = eINSTANCE.getCULaborItem_CompatibleUnits();

		/**
		 * The meta object literal for the '<em><b>Labor Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CU_LABOR_ITEM__LABOR_RATE = eINSTANCE.getCULaborItem_LaborRate();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.DesignKind <em>Design Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.DesignKind
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getDesignKind()
		 * @generated
		 */
		EEnum DESIGN_KIND = eINSTANCE.getDesignKind();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.ConditionFactorKind <em>Condition Factor Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.ConditionFactorKind
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getConditionFactorKind()
		 * @generated
		 */
		EEnum CONDITION_FACTOR_KIND = eINSTANCE.getConditionFactorKind();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfWork.WorkActionKind <em>Work Action Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfWork.WorkActionKind
		 * @see CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl#getWorkActionKind()
		 * @generated
		 */
		EEnum WORK_ACTION_KIND = eINSTANCE.getWorkActionKind();

	}

} //InfWorkPackage
