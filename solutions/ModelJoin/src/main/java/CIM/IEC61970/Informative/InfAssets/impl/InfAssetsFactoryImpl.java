/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61970.Informative.InfAssets.*;

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
public class InfAssetsFactoryImpl extends EFactoryImpl implements InfAssetsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfAssetsFactory init() {
		try {
			InfAssetsFactory theInfAssetsFactory = (InfAssetsFactory)EPackage.Registry.INSTANCE.getEFactory(InfAssetsPackage.eNS_URI);
			if (theInfAssetsFactory != null) {
				return theInfAssetsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfAssetsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfAssetsFactoryImpl() {
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
			case InfAssetsPackage.ORG_ASSET_ROLE: return createOrgAssetRole();
			case InfAssetsPackage.SHUNT_COMPENSATOR_INFO: return createShuntCompensatorInfo();
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO: return createPotentialTransformerInfo();
			case InfAssetsPackage.DUCT_INFO: return createDuctInfo();
			case InfAssetsPackage.DOC_ASSET_ROLE: return createDocAssetRole();
			case InfAssetsPackage.MOUNTING_POINT: return createMountingPoint();
			case InfAssetsPackage.SVC_INFO: return createSVCInfo();
			case InfAssetsPackage.FINANCIAL_INFO: return createFinancialInfo();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO: return createShuntImpedanceInfo();
			case InfAssetsPackage.CABINET: return createCabinet();
			case InfAssetsPackage.COM_EQUIPMENT_INFO: return createComEquipmentInfo();
			case InfAssetsPackage.BREAKER_INFO: return createBreakerInfo();
			case InfAssetsPackage.GENERATOR_ASSET: return createGeneratorAsset();
			case InfAssetsPackage.ELECTRICAL_INFO: return createElectricalInfo();
			case InfAssetsPackage.WINDING_INSULATION: return createWindingInsulation();
			case InfAssetsPackage.CONDUCTOR_ASSET: return createConductorAsset();
			case InfAssetsPackage.TRANSFORMER_ASSET: return createTransformerAsset();
			case InfAssetsPackage.ASSET_PROPERTY_CURVE: return createAssetPropertyCurve();
			case InfAssetsPackage.POWER_RATING: return createPowerRating();
			case InfAssetsPackage.ASSET_INFO: return createAssetInfo();
			case InfAssetsPackage.JOINT_INFO: return createJointInfo();
			case InfAssetsPackage.MOUNTING_CONNECTION: return createMountingConnection();
			case InfAssetsPackage.SUBSTATION_INFO: return createSubstationInfo();
			case InfAssetsPackage.PROTECTION_EQUIPMENT_INFO: return createProtectionEquipmentInfo();
			case InfAssetsPackage.SURGE_PROTECTOR_INFO: return createSurgeProtectorInfo();
			case InfAssetsPackage.UNDERGROUND_STRUCTURE_INFO: return createUndergroundStructureInfo();
			case InfAssetsPackage.PROCEDURE: return createProcedure();
			case InfAssetsPackage.MEDIUM: return createMedium();
			case InfAssetsPackage.STRUCTURE_INFO: return createStructureInfo();
			case InfAssetsPackage.FACTS_DEVICE_INFO: return createFACTSDeviceInfo();
			case InfAssetsPackage.SWITCH_INFO: return createSwitchInfo();
			case InfAssetsPackage.PROCEDURE_DATA_SET: return createProcedureDataSet();
			case InfAssetsPackage.STREETLIGHT_INFO: return createStreetlightInfo();
			case InfAssetsPackage.DIMENSIONS_INFO: return createDimensionsInfo();
			case InfAssetsPackage.WORK_EQUIPMENT_INFO: return createWorkEquipmentInfo();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO: return createCurrentTransformerInfo();
			case InfAssetsPackage.STRUCTURE_SUPPORT_INFO: return createStructureSupportInfo();
			case InfAssetsPackage.ELECTRICAL_ASSET: return createElectricalAsset();
			case InfAssetsPackage.FAILURE_EVENT: return createFailureEvent();
			case InfAssetsPackage.RECLOSER_INFO: return createRecloserInfo();
			case InfAssetsPackage.TOWER_INFO: return createTowerInfo();
			case InfAssetsPackage.TEST_DATA_SET: return createTestDataSet();
			case InfAssetsPackage.SPECIFICATION: return createSpecification();
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO: return createCompositeSwitchInfo();
			case InfAssetsPackage.FACILITY: return createFacility();
			case InfAssetsPackage.FAULT_INDICATOR_INFO: return createFaultIndicatorInfo();
			case InfAssetsPackage.RELIABILITY_INFO: return createReliabilityInfo();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION: return createTransformerObservation();
			case InfAssetsPackage.TOOL_INFO: return createToolInfo();
			case InfAssetsPackage.DUCT_BANK_INFO: return createDuctBankInfo();
			case InfAssetsPackage.VEHICLE_INFO: return createVehicleInfo();
			case InfAssetsPackage.BUSHING_INSULATION_PF: return createBushingInsulationPF();
			case InfAssetsPackage.BUSHING_INFO: return createBushingInfo();
			case InfAssetsPackage.ASSET_ASSET_ROLE: return createAssetAssetRole();
			case InfAssetsPackage.POLE_INFO: return createPoleInfo();
			case InfAssetsPackage.TAP_CHANGER_ASSET: return createTapChangerAsset();
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
			case InfAssetsPackage.POLE_BASE_KIND:
				return createPoleBaseKindFromString(eDataType, initialValue);
			case InfAssetsPackage.SHUNT_IMPEDANCE_LOCAL_CONTROL_KIND:
				return createShuntImpedanceLocalControlKindFromString(eDataType, initialValue);
			case InfAssetsPackage.JOINT_FILL_KIND:
				return createJointFillKindFromString(eDataType, initialValue);
			case InfAssetsPackage.PROCEDURE_KIND:
				return createProcedureKindFromString(eDataType, initialValue);
			case InfAssetsPackage.STREETLIGHT_LAMP_KIND:
				return createStreetlightLampKindFromString(eDataType, initialValue);
			case InfAssetsPackage.SHUNT_IMPEDANCE_CONTROL_KIND:
				return createShuntImpedanceControlKindFromString(eDataType, initialValue);
			case InfAssetsPackage.FAILURE_ISOLATION_METHOD_KIND:
				return createFailureIsolationMethodKindFromString(eDataType, initialValue);
			case InfAssetsPackage.UNDERGROUND_STRUCTURE_KIND:
				return createUndergroundStructureKindFromString(eDataType, initialValue);
			case InfAssetsPackage.SUBSTATION_FUNCTION_KIND:
				return createSubstationFunctionKindFromString(eDataType, initialValue);
			case InfAssetsPackage.COOLING_KIND:
				return createCoolingKindFromString(eDataType, initialValue);
			case InfAssetsPackage.POLE_PRESERVATIVE_KIND:
				return createPolePreservativeKindFromString(eDataType, initialValue);
			case InfAssetsPackage.POLE_TREATMENT_KIND:
				return createPoleTreatmentKindFromString(eDataType, initialValue);
			case InfAssetsPackage.FAULT_INDICATOR_RESET_KIND:
				return createFaultIndicatorResetKindFromString(eDataType, initialValue);
			case InfAssetsPackage.FACTS_DEVICE_KIND:
				return createFACTSDeviceKindFromString(eDataType, initialValue);
			case InfAssetsPackage.STRUCTURE_SUPPORT_KIND:
				return createStructureSupportKindFromString(eDataType, initialValue);
			case InfAssetsPackage.VEHICLE_USAGE_KIND:
				return createVehicleUsageKindFromString(eDataType, initialValue);
			case InfAssetsPackage.REGULATION_BRANCH_KIND:
				return createRegulationBranchKindFromString(eDataType, initialValue);
			case InfAssetsPackage.TOWER_CONSTRUCTION_KIND:
				return createTowerConstructionKindFromString(eDataType, initialValue);
			case InfAssetsPackage.BUSHING_INSULATION_PF_TEST_KIND:
				return createBushingInsulationPfTestKindFromString(eDataType, initialValue);
			case InfAssetsPackage.BUSHING_INSULATION_KIND:
				return createBushingInsulationKindFromString(eDataType, initialValue);
			case InfAssetsPackage.COMPOSITE_SWITCH_KIND:
				return createCompositeSwitchKindFromString(eDataType, initialValue);
			case InfAssetsPackage.STRUCTURE_MATERIAL_KIND:
				return createStructureMaterialKindFromString(eDataType, initialValue);
			case InfAssetsPackage.MEDIUM_KIND:
				return createMediumKindFromString(eDataType, initialValue);
			case InfAssetsPackage.ANCHOR_KIND:
				return createAnchorKindFromString(eDataType, initialValue);
			case InfAssetsPackage.JOINT_CONFIGURATION_KIND:
				return createJointConfigurationKindFromString(eDataType, initialValue);
			case InfAssetsPackage.FACILITY_KIND:
				return createFacilityKindFromString(eDataType, initialValue);
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
			case InfAssetsPackage.POLE_BASE_KIND:
				return convertPoleBaseKindToString(eDataType, instanceValue);
			case InfAssetsPackage.SHUNT_IMPEDANCE_LOCAL_CONTROL_KIND:
				return convertShuntImpedanceLocalControlKindToString(eDataType, instanceValue);
			case InfAssetsPackage.JOINT_FILL_KIND:
				return convertJointFillKindToString(eDataType, instanceValue);
			case InfAssetsPackage.PROCEDURE_KIND:
				return convertProcedureKindToString(eDataType, instanceValue);
			case InfAssetsPackage.STREETLIGHT_LAMP_KIND:
				return convertStreetlightLampKindToString(eDataType, instanceValue);
			case InfAssetsPackage.SHUNT_IMPEDANCE_CONTROL_KIND:
				return convertShuntImpedanceControlKindToString(eDataType, instanceValue);
			case InfAssetsPackage.FAILURE_ISOLATION_METHOD_KIND:
				return convertFailureIsolationMethodKindToString(eDataType, instanceValue);
			case InfAssetsPackage.UNDERGROUND_STRUCTURE_KIND:
				return convertUndergroundStructureKindToString(eDataType, instanceValue);
			case InfAssetsPackage.SUBSTATION_FUNCTION_KIND:
				return convertSubstationFunctionKindToString(eDataType, instanceValue);
			case InfAssetsPackage.COOLING_KIND:
				return convertCoolingKindToString(eDataType, instanceValue);
			case InfAssetsPackage.POLE_PRESERVATIVE_KIND:
				return convertPolePreservativeKindToString(eDataType, instanceValue);
			case InfAssetsPackage.POLE_TREATMENT_KIND:
				return convertPoleTreatmentKindToString(eDataType, instanceValue);
			case InfAssetsPackage.FAULT_INDICATOR_RESET_KIND:
				return convertFaultIndicatorResetKindToString(eDataType, instanceValue);
			case InfAssetsPackage.FACTS_DEVICE_KIND:
				return convertFACTSDeviceKindToString(eDataType, instanceValue);
			case InfAssetsPackage.STRUCTURE_SUPPORT_KIND:
				return convertStructureSupportKindToString(eDataType, instanceValue);
			case InfAssetsPackage.VEHICLE_USAGE_KIND:
				return convertVehicleUsageKindToString(eDataType, instanceValue);
			case InfAssetsPackage.REGULATION_BRANCH_KIND:
				return convertRegulationBranchKindToString(eDataType, instanceValue);
			case InfAssetsPackage.TOWER_CONSTRUCTION_KIND:
				return convertTowerConstructionKindToString(eDataType, instanceValue);
			case InfAssetsPackage.BUSHING_INSULATION_PF_TEST_KIND:
				return convertBushingInsulationPfTestKindToString(eDataType, instanceValue);
			case InfAssetsPackage.BUSHING_INSULATION_KIND:
				return convertBushingInsulationKindToString(eDataType, instanceValue);
			case InfAssetsPackage.COMPOSITE_SWITCH_KIND:
				return convertCompositeSwitchKindToString(eDataType, instanceValue);
			case InfAssetsPackage.STRUCTURE_MATERIAL_KIND:
				return convertStructureMaterialKindToString(eDataType, instanceValue);
			case InfAssetsPackage.MEDIUM_KIND:
				return convertMediumKindToString(eDataType, instanceValue);
			case InfAssetsPackage.ANCHOR_KIND:
				return convertAnchorKindToString(eDataType, instanceValue);
			case InfAssetsPackage.JOINT_CONFIGURATION_KIND:
				return convertJointConfigurationKindToString(eDataType, instanceValue);
			case InfAssetsPackage.FACILITY_KIND:
				return convertFacilityKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgAssetRole createOrgAssetRole() {
		OrgAssetRoleImpl orgAssetRole = new OrgAssetRoleImpl();
		return orgAssetRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShuntCompensatorInfo createShuntCompensatorInfo() {
		ShuntCompensatorInfoImpl shuntCompensatorInfo = new ShuntCompensatorInfoImpl();
		return shuntCompensatorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PotentialTransformerInfo createPotentialTransformerInfo() {
		PotentialTransformerInfoImpl potentialTransformerInfo = new PotentialTransformerInfoImpl();
		return potentialTransformerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DuctInfo createDuctInfo() {
		DuctInfoImpl ductInfo = new DuctInfoImpl();
		return ductInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocAssetRole createDocAssetRole() {
		DocAssetRoleImpl docAssetRole = new DocAssetRoleImpl();
		return docAssetRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MountingPoint createMountingPoint() {
		MountingPointImpl mountingPoint = new MountingPointImpl();
		return mountingPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SVCInfo createSVCInfo() {
		SVCInfoImpl svcInfo = new SVCInfoImpl();
		return svcInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinancialInfo createFinancialInfo() {
		FinancialInfoImpl financialInfo = new FinancialInfoImpl();
		return financialInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShuntImpedanceInfo createShuntImpedanceInfo() {
		ShuntImpedanceInfoImpl shuntImpedanceInfo = new ShuntImpedanceInfoImpl();
		return shuntImpedanceInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cabinet createCabinet() {
		CabinetImpl cabinet = new CabinetImpl();
		return cabinet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComEquipmentInfo createComEquipmentInfo() {
		ComEquipmentInfoImpl comEquipmentInfo = new ComEquipmentInfoImpl();
		return comEquipmentInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakerInfo createBreakerInfo() {
		BreakerInfoImpl breakerInfo = new BreakerInfoImpl();
		return breakerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorAsset createGeneratorAsset() {
		GeneratorAssetImpl generatorAsset = new GeneratorAssetImpl();
		return generatorAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalInfo createElectricalInfo() {
		ElectricalInfoImpl electricalInfo = new ElectricalInfoImpl();
		return electricalInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindingInsulation createWindingInsulation() {
		WindingInsulationImpl windingInsulation = new WindingInsulationImpl();
		return windingInsulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductorAsset createConductorAsset() {
		ConductorAssetImpl conductorAsset = new ConductorAssetImpl();
		return conductorAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerAsset createTransformerAsset() {
		TransformerAssetImpl transformerAsset = new TransformerAssetImpl();
		return transformerAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetPropertyCurve createAssetPropertyCurve() {
		AssetPropertyCurveImpl assetPropertyCurve = new AssetPropertyCurveImpl();
		return assetPropertyCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerRating createPowerRating() {
		PowerRatingImpl powerRating = new PowerRatingImpl();
		return powerRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetInfo createAssetInfo() {
		AssetInfoImpl assetInfo = new AssetInfoImpl();
		return assetInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointInfo createJointInfo() {
		JointInfoImpl jointInfo = new JointInfoImpl();
		return jointInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MountingConnection createMountingConnection() {
		MountingConnectionImpl mountingConnection = new MountingConnectionImpl();
		return mountingConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstationInfo createSubstationInfo() {
		SubstationInfoImpl substationInfo = new SubstationInfoImpl();
		return substationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectionEquipmentInfo createProtectionEquipmentInfo() {
		ProtectionEquipmentInfoImpl protectionEquipmentInfo = new ProtectionEquipmentInfoImpl();
		return protectionEquipmentInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurgeProtectorInfo createSurgeProtectorInfo() {
		SurgeProtectorInfoImpl surgeProtectorInfo = new SurgeProtectorInfoImpl();
		return surgeProtectorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UndergroundStructureInfo createUndergroundStructureInfo() {
		UndergroundStructureInfoImpl undergroundStructureInfo = new UndergroundStructureInfoImpl();
		return undergroundStructureInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medium createMedium() {
		MediumImpl medium = new MediumImpl();
		return medium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureInfo createStructureInfo() {
		StructureInfoImpl structureInfo = new StructureInfoImpl();
		return structureInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FACTSDeviceInfo createFACTSDeviceInfo() {
		FACTSDeviceInfoImpl factsDeviceInfo = new FACTSDeviceInfoImpl();
		return factsDeviceInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchInfo createSwitchInfo() {
		SwitchInfoImpl switchInfo = new SwitchInfoImpl();
		return switchInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureDataSet createProcedureDataSet() {
		ProcedureDataSetImpl procedureDataSet = new ProcedureDataSetImpl();
		return procedureDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreetlightInfo createStreetlightInfo() {
		StreetlightInfoImpl streetlightInfo = new StreetlightInfoImpl();
		return streetlightInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsInfo createDimensionsInfo() {
		DimensionsInfoImpl dimensionsInfo = new DimensionsInfoImpl();
		return dimensionsInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEquipmentInfo createWorkEquipmentInfo() {
		WorkEquipmentInfoImpl workEquipmentInfo = new WorkEquipmentInfoImpl();
		return workEquipmentInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentTransformerInfo createCurrentTransformerInfo() {
		CurrentTransformerInfoImpl currentTransformerInfo = new CurrentTransformerInfoImpl();
		return currentTransformerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureSupportInfo createStructureSupportInfo() {
		StructureSupportInfoImpl structureSupportInfo = new StructureSupportInfoImpl();
		return structureSupportInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalAsset createElectricalAsset() {
		ElectricalAssetImpl electricalAsset = new ElectricalAssetImpl();
		return electricalAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureEvent createFailureEvent() {
		FailureEventImpl failureEvent = new FailureEventImpl();
		return failureEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecloserInfo createRecloserInfo() {
		RecloserInfoImpl recloserInfo = new RecloserInfoImpl();
		return recloserInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TowerInfo createTowerInfo() {
		TowerInfoImpl towerInfo = new TowerInfoImpl();
		return towerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestDataSet createTestDataSet() {
		TestDataSetImpl testDataSet = new TestDataSetImpl();
		return testDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification createSpecification() {
		SpecificationImpl specification = new SpecificationImpl();
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSwitchInfo createCompositeSwitchInfo() {
		CompositeSwitchInfoImpl compositeSwitchInfo = new CompositeSwitchInfoImpl();
		return compositeSwitchInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facility createFacility() {
		FacilityImpl facility = new FacilityImpl();
		return facility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultIndicatorInfo createFaultIndicatorInfo() {
		FaultIndicatorInfoImpl faultIndicatorInfo = new FaultIndicatorInfoImpl();
		return faultIndicatorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilityInfo createReliabilityInfo() {
		ReliabilityInfoImpl reliabilityInfo = new ReliabilityInfoImpl();
		return reliabilityInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerObservation createTransformerObservation() {
		TransformerObservationImpl transformerObservation = new TransformerObservationImpl();
		return transformerObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolInfo createToolInfo() {
		ToolInfoImpl toolInfo = new ToolInfoImpl();
		return toolInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DuctBankInfo createDuctBankInfo() {
		DuctBankInfoImpl ductBankInfo = new DuctBankInfoImpl();
		return ductBankInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleInfo createVehicleInfo() {
		VehicleInfoImpl vehicleInfo = new VehicleInfoImpl();
		return vehicleInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BushingInsulationPF createBushingInsulationPF() {
		BushingInsulationPFImpl bushingInsulationPF = new BushingInsulationPFImpl();
		return bushingInsulationPF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BushingInfo createBushingInfo() {
		BushingInfoImpl bushingInfo = new BushingInfoImpl();
		return bushingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetAssetRole createAssetAssetRole() {
		AssetAssetRoleImpl assetAssetRole = new AssetAssetRoleImpl();
		return assetAssetRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoleInfo createPoleInfo() {
		PoleInfoImpl poleInfo = new PoleInfoImpl();
		return poleInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapChangerAsset createTapChangerAsset() {
		TapChangerAssetImpl tapChangerAsset = new TapChangerAssetImpl();
		return tapChangerAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoleBaseKind createPoleBaseKindFromString(EDataType eDataType, String initialValue) {
		PoleBaseKind result = PoleBaseKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPoleBaseKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShuntImpedanceLocalControlKind createShuntImpedanceLocalControlKindFromString(EDataType eDataType, String initialValue) {
		ShuntImpedanceLocalControlKind result = ShuntImpedanceLocalControlKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShuntImpedanceLocalControlKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointFillKind createJointFillKindFromString(EDataType eDataType, String initialValue) {
		JointFillKind result = JointFillKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJointFillKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureKind createProcedureKindFromString(EDataType eDataType, String initialValue) {
		ProcedureKind result = ProcedureKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreetlightLampKind createStreetlightLampKindFromString(EDataType eDataType, String initialValue) {
		StreetlightLampKind result = StreetlightLampKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStreetlightLampKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShuntImpedanceControlKind createShuntImpedanceControlKindFromString(EDataType eDataType, String initialValue) {
		ShuntImpedanceControlKind result = ShuntImpedanceControlKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShuntImpedanceControlKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureIsolationMethodKind createFailureIsolationMethodKindFromString(EDataType eDataType, String initialValue) {
		FailureIsolationMethodKind result = FailureIsolationMethodKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFailureIsolationMethodKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UndergroundStructureKind createUndergroundStructureKindFromString(EDataType eDataType, String initialValue) {
		UndergroundStructureKind result = UndergroundStructureKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUndergroundStructureKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstationFunctionKind createSubstationFunctionKindFromString(EDataType eDataType, String initialValue) {
		SubstationFunctionKind result = SubstationFunctionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstationFunctionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoolingKind createCoolingKindFromString(EDataType eDataType, String initialValue) {
		CoolingKind result = CoolingKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoolingKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolePreservativeKind createPolePreservativeKindFromString(EDataType eDataType, String initialValue) {
		PolePreservativeKind result = PolePreservativeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPolePreservativeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoleTreatmentKind createPoleTreatmentKindFromString(EDataType eDataType, String initialValue) {
		PoleTreatmentKind result = PoleTreatmentKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPoleTreatmentKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultIndicatorResetKind createFaultIndicatorResetKindFromString(EDataType eDataType, String initialValue) {
		FaultIndicatorResetKind result = FaultIndicatorResetKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFaultIndicatorResetKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FACTSDeviceKind createFACTSDeviceKindFromString(EDataType eDataType, String initialValue) {
		FACTSDeviceKind result = FACTSDeviceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFACTSDeviceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureSupportKind createStructureSupportKindFromString(EDataType eDataType, String initialValue) {
		StructureSupportKind result = StructureSupportKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureSupportKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleUsageKind createVehicleUsageKindFromString(EDataType eDataType, String initialValue) {
		VehicleUsageKind result = VehicleUsageKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVehicleUsageKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulationBranchKind createRegulationBranchKindFromString(EDataType eDataType, String initialValue) {
		RegulationBranchKind result = RegulationBranchKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegulationBranchKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TowerConstructionKind createTowerConstructionKindFromString(EDataType eDataType, String initialValue) {
		TowerConstructionKind result = TowerConstructionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTowerConstructionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BushingInsulationPfTestKind createBushingInsulationPfTestKindFromString(EDataType eDataType, String initialValue) {
		BushingInsulationPfTestKind result = BushingInsulationPfTestKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBushingInsulationPfTestKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BushingInsulationKind createBushingInsulationKindFromString(EDataType eDataType, String initialValue) {
		BushingInsulationKind result = BushingInsulationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBushingInsulationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSwitchKind createCompositeSwitchKindFromString(EDataType eDataType, String initialValue) {
		CompositeSwitchKind result = CompositeSwitchKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositeSwitchKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMaterialKind createStructureMaterialKindFromString(EDataType eDataType, String initialValue) {
		StructureMaterialKind result = StructureMaterialKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMaterialKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediumKind createMediumKindFromString(EDataType eDataType, String initialValue) {
		MediumKind result = MediumKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediumKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnchorKind createAnchorKindFromString(EDataType eDataType, String initialValue) {
		AnchorKind result = AnchorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnchorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointConfigurationKind createJointConfigurationKindFromString(EDataType eDataType, String initialValue) {
		JointConfigurationKind result = JointConfigurationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJointConfigurationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityKind createFacilityKindFromString(EDataType eDataType, String initialValue) {
		FacilityKind result = FacilityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFacilityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfAssetsPackage getInfAssetsPackage() {
		return (InfAssetsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfAssetsPackage getPackage() {
		return InfAssetsPackage.eINSTANCE;
	}

} //InfAssetsFactoryImpl
