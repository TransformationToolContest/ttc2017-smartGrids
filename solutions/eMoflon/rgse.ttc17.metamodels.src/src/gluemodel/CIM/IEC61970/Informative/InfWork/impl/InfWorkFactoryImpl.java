/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork.impl;

import gluemodel.CIM.IEC61970.Informative.InfWork.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfWorkFactoryImpl extends EFactoryImpl implements InfWorkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfWorkFactory init() {
		try {
			InfWorkFactory theInfWorkFactory = (InfWorkFactory)EPackage.Registry.INSTANCE.getEFactory(InfWorkPackage.eNS_URI);
			if (theInfWorkFactory != null) {
				return theInfWorkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfWorkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfWorkFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InfWorkPackage.WORK_FLOW_STEP: return createWorkFlowStep();
			case InfWorkPackage.WORK_COST_DETAIL: return createWorkCostDetail();
			case InfWorkPackage.USAGE: return createUsage();
			case InfWorkPackage.WORK_COST_SUMMARY: return createWorkCostSummary();
			case InfWorkPackage.MISC_COST_ITEM: return createMiscCostItem();
			case InfWorkPackage.CU_ALLOWABLE_ACTION: return createCUAllowableAction();
			case InfWorkPackage.COST_TYPE: return createCostType();
			case InfWorkPackage.CU_MATERIAL_ITEM: return createCUMaterialItem();
			case InfWorkPackage.ASSIGNMENT: return createAssignment();
			case InfWorkPackage.DESIGN: return createDesign();
			case InfWorkPackage.BUSINESS_CASE: return createBusinessCase();
			case InfWorkPackage.EQUIPMENT_ITEM: return createEquipmentItem();
			case InfWorkPackage.ONE_CALL_REQUEST: return createOneCallRequest();
			case InfWorkPackage.LABOR_ITEM: return createLaborItem();
			case InfWorkPackage.PROJECT: return createProject();
			case InfWorkPackage.ACCESS_PERMIT: return createAccessPermit();
			case InfWorkPackage.INSPECTION_DATA_SET: return createInspectionDataSet();
			case InfWorkPackage.REGULATION: return createRegulation();
			case InfWorkPackage.SHIFT_PATTERN: return createShiftPattern();
			case InfWorkPackage.NON_STANDARD_ITEM: return createNonStandardItem();
			case InfWorkPackage.WORK_LOCATION: return createWorkLocation();
			case InfWorkPackage.DESIGN_LOCATION_CU: return createDesignLocationCU();
			case InfWorkPackage.DESIGN_LOCATION: return createDesignLocation();
			case InfWorkPackage.CU_LABOR_CODE: return createCULaborCode();
			case InfWorkPackage.CONDITION_FACTOR: return createConditionFactor();
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM: return createCUWorkEquipmentItem();
			case InfWorkPackage.QUALIFICATION_REQUIREMENT: return createQualificationRequirement();
			case InfWorkPackage.CU_CONTRACTOR_ITEM: return createCUContractorItem();
			case InfWorkPackage.MATERIAL_ITEM: return createMaterialItem();
			case InfWorkPackage.PROPERTY_UNIT: return createPropertyUnit();
			case InfWorkPackage.COMPATIBLE_UNIT: return createCompatibleUnit();
			case InfWorkPackage.WORK_TASK: return createWorkTask();
			case InfWorkPackage.TYPE_MATERIAL: return createTypeMaterial();
			case InfWorkPackage.CAPABILITY: return createCapability();
			case InfWorkPackage.CU_ASSET: return createCUAsset();
			case InfWorkPackage.CONTRACTOR_ITEM: return createContractorItem();
			case InfWorkPackage.INFO_QUESTION: return createInfoQuestion();
			case InfWorkPackage.WORK_STATUS_ENTRY: return createWorkStatusEntry();
			case InfWorkPackage.APPOINTMENT: return createAppointment();
			case InfWorkPackage.MAINTENANCE_DATA_SET: return createMaintenanceDataSet();
			case InfWorkPackage.CU_GROUP: return createCUGroup();
			case InfWorkPackage.CREW: return createCrew();
			case InfWorkPackage.REQUEST: return createRequest();
			case InfWorkPackage.OVERHEAD_COST: return createOverheadCost();
			case InfWorkPackage.DIAGNOSIS_DATA_SET: return createDiagnosisDataSet();
			case InfWorkPackage.CU_LABOR_ITEM: return createCULaborItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case InfWorkPackage.DESIGN_KIND:
				return createDesignKindFromString(eDataType, initialValue);
			case InfWorkPackage.CONDITION_FACTOR_KIND:
				return createConditionFactorKindFromString(eDataType, initialValue);
			case InfWorkPackage.WORK_ACTION_KIND:
				return createWorkActionKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case InfWorkPackage.DESIGN_KIND:
				return convertDesignKindToString(eDataType, instanceValue);
			case InfWorkPackage.CONDITION_FACTOR_KIND:
				return convertConditionFactorKindToString(eDataType, instanceValue);
			case InfWorkPackage.WORK_ACTION_KIND:
				return convertWorkActionKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkFlowStep createWorkFlowStep() {
		WorkFlowStepImpl workFlowStep = new WorkFlowStepImpl();
		return workFlowStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkCostDetail createWorkCostDetail() {
		WorkCostDetailImpl workCostDetail = new WorkCostDetailImpl();
		return workCostDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usage createUsage() {
		UsageImpl usage = new UsageImpl();
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkCostSummary createWorkCostSummary() {
		WorkCostSummaryImpl workCostSummary = new WorkCostSummaryImpl();
		return workCostSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiscCostItem createMiscCostItem() {
		MiscCostItemImpl miscCostItem = new MiscCostItemImpl();
		return miscCostItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUAllowableAction createCUAllowableAction() {
		CUAllowableActionImpl cuAllowableAction = new CUAllowableActionImpl();
		return cuAllowableAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostType createCostType() {
		CostTypeImpl costType = new CostTypeImpl();
		return costType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUMaterialItem createCUMaterialItem() {
		CUMaterialItemImpl cuMaterialItem = new CUMaterialItemImpl();
		return cuMaterialItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Design createDesign() {
		DesignImpl design = new DesignImpl();
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessCase createBusinessCase() {
		BusinessCaseImpl businessCase = new BusinessCaseImpl();
		return businessCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquipmentItem createEquipmentItem() {
		EquipmentItemImpl equipmentItem = new EquipmentItemImpl();
		return equipmentItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneCallRequest createOneCallRequest() {
		OneCallRequestImpl oneCallRequest = new OneCallRequestImpl();
		return oneCallRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaborItem createLaborItem() {
		LaborItemImpl laborItem = new LaborItemImpl();
		return laborItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessPermit createAccessPermit() {
		AccessPermitImpl accessPermit = new AccessPermitImpl();
		return accessPermit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InspectionDataSet createInspectionDataSet() {
		InspectionDataSetImpl inspectionDataSet = new InspectionDataSetImpl();
		return inspectionDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Regulation createRegulation() {
		RegulationImpl regulation = new RegulationImpl();
		return regulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShiftPattern createShiftPattern() {
		ShiftPatternImpl shiftPattern = new ShiftPatternImpl();
		return shiftPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonStandardItem createNonStandardItem() {
		NonStandardItemImpl nonStandardItem = new NonStandardItemImpl();
		return nonStandardItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkLocation createWorkLocation() {
		WorkLocationImpl workLocation = new WorkLocationImpl();
		return workLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignLocationCU createDesignLocationCU() {
		DesignLocationCUImpl designLocationCU = new DesignLocationCUImpl();
		return designLocationCU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignLocation createDesignLocation() {
		DesignLocationImpl designLocation = new DesignLocationImpl();
		return designLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CULaborCode createCULaborCode() {
		CULaborCodeImpl cuLaborCode = new CULaborCodeImpl();
		return cuLaborCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionFactor createConditionFactor() {
		ConditionFactorImpl conditionFactor = new ConditionFactorImpl();
		return conditionFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUWorkEquipmentItem createCUWorkEquipmentItem() {
		CUWorkEquipmentItemImpl cuWorkEquipmentItem = new CUWorkEquipmentItemImpl();
		return cuWorkEquipmentItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualificationRequirement createQualificationRequirement() {
		QualificationRequirementImpl qualificationRequirement = new QualificationRequirementImpl();
		return qualificationRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUContractorItem createCUContractorItem() {
		CUContractorItemImpl cuContractorItem = new CUContractorItemImpl();
		return cuContractorItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialItem createMaterialItem() {
		MaterialItemImpl materialItem = new MaterialItemImpl();
		return materialItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyUnit createPropertyUnit() {
		PropertyUnitImpl propertyUnit = new PropertyUnitImpl();
		return propertyUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompatibleUnit createCompatibleUnit() {
		CompatibleUnitImpl compatibleUnit = new CompatibleUnitImpl();
		return compatibleUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkTask createWorkTask() {
		WorkTaskImpl workTask = new WorkTaskImpl();
		return workTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMaterial createTypeMaterial() {
		TypeMaterialImpl typeMaterial = new TypeMaterialImpl();
		return typeMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUAsset createCUAsset() {
		CUAssetImpl cuAsset = new CUAssetImpl();
		return cuAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractorItem createContractorItem() {
		ContractorItemImpl contractorItem = new ContractorItemImpl();
		return contractorItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfoQuestion createInfoQuestion() {
		InfoQuestionImpl infoQuestion = new InfoQuestionImpl();
		return infoQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkStatusEntry createWorkStatusEntry() {
		WorkStatusEntryImpl workStatusEntry = new WorkStatusEntryImpl();
		return workStatusEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appointment createAppointment() {
		AppointmentImpl appointment = new AppointmentImpl();
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenanceDataSet createMaintenanceDataSet() {
		MaintenanceDataSetImpl maintenanceDataSet = new MaintenanceDataSetImpl();
		return maintenanceDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUGroup createCUGroup() {
		CUGroupImpl cuGroup = new CUGroupImpl();
		return cuGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crew createCrew() {
		CrewImpl crew = new CrewImpl();
		return crew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request createRequest() {
		RequestImpl request = new RequestImpl();
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverheadCost createOverheadCost() {
		OverheadCostImpl overheadCost = new OverheadCostImpl();
		return overheadCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosisDataSet createDiagnosisDataSet() {
		DiagnosisDataSetImpl diagnosisDataSet = new DiagnosisDataSetImpl();
		return diagnosisDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CULaborItem createCULaborItem() {
		CULaborItemImpl cuLaborItem = new CULaborItemImpl();
		return cuLaborItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignKind createDesignKindFromString(EDataType eDataType, String initialValue) {
		DesignKind result = DesignKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDesignKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionFactorKind createConditionFactorKindFromString(EDataType eDataType, String initialValue) {
		ConditionFactorKind result = ConditionFactorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionFactorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkActionKind createWorkActionKindFromString(EDataType eDataType, String initialValue) {
		WorkActionKind result = WorkActionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkActionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfWorkPackage getInfWorkPackage() {
		return (InfWorkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfWorkPackage getPackage() {
		return InfWorkPackage.eINSTANCE;
	}

} //InfWorkFactoryImpl
