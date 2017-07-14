/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork.impl;

import gluemodel.CIM.CIMPackage;

import gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage;

import gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl;

import gluemodel.CIM.IEC61968.Assets.AssetsPackage;

import gluemodel.CIM.IEC61968.Assets.impl.AssetsPackageImpl;

import gluemodel.CIM.IEC61968.Common.CommonPackage;

import gluemodel.CIM.IEC61968.Common.impl.CommonPackageImpl;

import gluemodel.CIM.IEC61968.Customers.CustomersPackage;

import gluemodel.CIM.IEC61968.Customers.impl.CustomersPackageImpl;

import gluemodel.CIM.IEC61968.IEC61968Package;

import gluemodel.CIM.IEC61968.LoadControl.LoadControlPackage;

import gluemodel.CIM.IEC61968.LoadControl.impl.LoadControlPackageImpl;

import gluemodel.CIM.IEC61968.Metering.MeteringPackage;

import gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl;

import gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;

import gluemodel.CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl;

import gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage;

import gluemodel.CIM.IEC61968.WiresExt.impl.WiresExtPackageImpl;

import gluemodel.CIM.IEC61968.Work.WorkPackage;

import gluemodel.CIM.IEC61968.Work.impl.WorkPackageImpl;

import gluemodel.CIM.IEC61968.impl.IEC61968PackageImpl;

import gluemodel.CIM.IEC61970.Contingency.ContingencyPackage;

import gluemodel.CIM.IEC61970.Contingency.impl.ContingencyPackageImpl;

import gluemodel.CIM.IEC61970.ControlArea.ControlAreaPackage;

import gluemodel.CIM.IEC61970.ControlArea.impl.ControlAreaPackageImpl;

import gluemodel.CIM.IEC61970.Core.CorePackage;

import gluemodel.CIM.IEC61970.Core.impl.CorePackageImpl;

import gluemodel.CIM.IEC61970.Domain.DomainPackage;

import gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl;

import gluemodel.CIM.IEC61970.Equivalents.EquivalentsPackage;

import gluemodel.CIM.IEC61970.Equivalents.impl.EquivalentsPackageImpl;

import gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage;

import gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl;

import gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage;

import gluemodel.CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl;

import gluemodel.CIM.IEC61970.IEC61970Package;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl;

import gluemodel.CIM.IEC61970.Informative.Financial.FinancialPackage;

import gluemodel.CIM.IEC61970.Informative.Financial.impl.FinancialPackageImpl;

import gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage;

import gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl;

import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

import gluemodel.CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl;

import gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage;

import gluemodel.CIM.IEC61970.Informative.InfCommon.impl.InfCommonPackageImpl;

import gluemodel.CIM.IEC61970.Informative.InfCore.InfCorePackage;

import gluemodel.CIM.IEC61970.Informative.InfCore.impl.InfCorePackageImpl;

import gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage;

import gluemodel.CIM.IEC61970.Informative.InfCustomers.impl.InfCustomersPackageImpl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl;

import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage;

import gluemodel.CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl;

import gluemodel.CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage;

import gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.InfLoadControlPackageImpl;

import gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage;

import gluemodel.CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl;

import gluemodel.CIM.IEC61970.Informative.InfMetering.InfMeteringPackage;

import gluemodel.CIM.IEC61970.Informative.InfMetering.impl.InfMeteringPackageImpl;

import gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;

import gluemodel.CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl;

import gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage;

import gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.impl.InfPaymentMeteringPackageImpl;

import gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage;

import gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.InfTypeAssetPackageImpl;

import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkFactory;
import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl;

import gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage;

import gluemodel.CIM.IEC61970.Informative.Reservation.impl.ReservationPackageImpl;

import gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage;

import gluemodel.CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl;

import gluemodel.CIM.IEC61970.Meas.MeasPackage;

import gluemodel.CIM.IEC61970.Meas.impl.MeasPackageImpl;

import gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage;

import gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitsPackageImpl;

import gluemodel.CIM.IEC61970.Outage.OutagePackage;

import gluemodel.CIM.IEC61970.Outage.impl.OutagePackageImpl;

import gluemodel.CIM.IEC61970.Protection.ProtectionPackage;

import gluemodel.CIM.IEC61970.Protection.impl.ProtectionPackageImpl;

import gluemodel.CIM.IEC61970.SCADA.SCADAPackage;

import gluemodel.CIM.IEC61970.SCADA.impl.SCADAPackageImpl;

import gluemodel.CIM.IEC61970.StateVariables.StateVariablesPackage;

import gluemodel.CIM.IEC61970.StateVariables.impl.StateVariablesPackageImpl;

import gluemodel.CIM.IEC61970.Topology.TopologyPackage;

import gluemodel.CIM.IEC61970.Topology.impl.TopologyPackageImpl;

import gluemodel.CIM.IEC61970.Wires.WiresPackage;

import gluemodel.CIM.IEC61970.Wires.impl.WiresPackageImpl;

import gluemodel.CIM.IEC61970.impl.IEC61970PackageImpl;

import gluemodel.CIM.PackageDependencies.PackageDependenciesPackage;

import gluemodel.CIM.PackageDependencies.impl.PackageDependenciesPackageImpl;

import gluemodel.CIM.impl.CIMPackageImpl;

import gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage;

import gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl;

import gluemodel.COSEM.COSEMPackage;

import gluemodel.COSEM.Datatypes.DatatypesPackage;

import gluemodel.COSEM.Datatypes.impl.DatatypesPackageImpl;

import gluemodel.COSEM.InterfaceClasses.InterfaceClassesPackage;

import gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl;

import gluemodel.COSEM.impl.COSEMPackageImpl;

import gluemodel.GluemodelPackage;

import gluemodel.impl.GluemodelPackageImpl;

import gluemodel.substationStandard.Dataclasses.DataclassesPackage;
import gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl;
import gluemodel.substationStandard.Enumerations.EnumerationsPackage;
import gluemodel.substationStandard.Enumerations.impl.EnumerationsPackageImpl;
import gluemodel.substationStandard.LNNodes.DomainLNs.DomainLNsPackage;
import gluemodel.substationStandard.LNNodes.DomainLNs.impl.DomainLNsPackageImpl;
import gluemodel.substationStandard.LNNodes.LNGroupA.LNGroupAPackage;
import gluemodel.substationStandard.LNNodes.LNGroupA.impl.LNGroupAPackageImpl;
import gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage;
import gluemodel.substationStandard.LNNodes.LNGroupC.impl.LNGroupCPackageImpl;
import gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage;
import gluemodel.substationStandard.LNNodes.LNGroupM.impl.LNGroupMPackageImpl;
import gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage;
import gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl;
import gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage;
import gluemodel.substationStandard.LNNodes.LNGroupR.impl.LNGroupRPackageImpl;
import gluemodel.substationStandard.LNNodes.LNGroupT.LNGroupTPackage;
import gluemodel.substationStandard.LNNodes.LNGroupT.impl.LNGroupTPackageImpl;
import gluemodel.substationStandard.LNNodes.LNGroupX.LNGroupXPackage;
import gluemodel.substationStandard.LNNodes.LNGroupX.impl.LNGroupXPackageImpl;
import gluemodel.substationStandard.LNNodes.LNGroupY.LNGroupYPackage;
import gluemodel.substationStandard.LNNodes.LNGroupY.impl.LNGroupYPackageImpl;
import gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage;
import gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl;
import gluemodel.substationStandard.SubstationStandardPackage;
import gluemodel.substationStandard.impl.SubstationStandardPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfWorkPackageImpl extends EPackageImpl implements InfWorkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workFlowStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workCostDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workCostSummaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass miscCostItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cuAllowableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass costTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cuMaterialItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equipmentItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneCallRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass laborItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessPermitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inspectionDataSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shiftPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonStandardItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designLocationCUEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cuLaborCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cuWorkEquipmentItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualificationRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cuContractorItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compatibleUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeMaterialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cuAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractorItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infoQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workStatusEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appointmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maintenanceDataSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cuGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overheadCostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosisDataSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cuLaborItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum designKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionFactorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workActionKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InfWorkPackageImpl() {
		super(eNS_URI, InfWorkFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link InfWorkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static InfWorkPackage init() {
		if (isInited) return (InfWorkPackage)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI);

		// Obtain or create and register package
		InfWorkPackageImpl theInfWorkPackage = (InfWorkPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InfWorkPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InfWorkPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GluemodelPackageImpl theGluemodelPackage = (GluemodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GluemodelPackage.eNS_URI) instanceof GluemodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GluemodelPackage.eNS_URI) : GluemodelPackage.eINSTANCE);
		COSEMPackageImpl theCOSEMPackage = (COSEMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(COSEMPackage.eNS_URI) instanceof COSEMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(COSEMPackage.eNS_URI) : COSEMPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);
		InterfaceClassesPackageImpl theInterfaceClassesPackage = (InterfaceClassesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI) instanceof InterfaceClassesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI) : InterfaceClassesPackage.eINSTANCE);
		COSEMObjectsPackageImpl theCOSEMObjectsPackage = (COSEMObjectsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI) instanceof COSEMObjectsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI) : COSEMObjectsPackage.eINSTANCE);
		CIMPackageImpl theCIMPackage = (CIMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CIMPackage.eNS_URI) instanceof CIMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CIMPackage.eNS_URI) : CIMPackage.eINSTANCE);
		IEC61970PackageImpl theIEC61970Package = (IEC61970PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IEC61970Package.eNS_URI) instanceof IEC61970PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IEC61970Package.eNS_URI) : IEC61970Package.eINSTANCE);
		OperationalLimitsPackageImpl theOperationalLimitsPackage = (OperationalLimitsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI) instanceof OperationalLimitsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI) : OperationalLimitsPackage.eINSTANCE);
		EnergySchedulingPackageImpl theEnergySchedulingPackage = (EnergySchedulingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnergySchedulingPackage.eNS_URI) instanceof EnergySchedulingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnergySchedulingPackage.eNS_URI) : EnergySchedulingPackage.eINSTANCE);
		InfERPSupportPackageImpl theInfERPSupportPackage = (InfERPSupportPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI) instanceof InfERPSupportPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI) : InfERPSupportPackage.eINSTANCE);
		InfAssetModelsPackageImpl theInfAssetModelsPackage = (InfAssetModelsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfAssetModelsPackage.eNS_URI) instanceof InfAssetModelsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfAssetModelsPackage.eNS_URI) : InfAssetModelsPackage.eINSTANCE);
		InfAssetsPackageImpl theInfAssetsPackage = (InfAssetsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI) instanceof InfAssetsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI) : InfAssetsPackage.eINSTANCE);
		InfGMLSupportPackageImpl theInfGMLSupportPackage = (InfGMLSupportPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI) instanceof InfGMLSupportPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI) : InfGMLSupportPackage.eINSTANCE);
		InfCorePackageImpl theInfCorePackage = (InfCorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfCorePackage.eNS_URI) instanceof InfCorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfCorePackage.eNS_URI) : InfCorePackage.eINSTANCE);
		MarketOperationsPackageImpl theMarketOperationsPackage = (MarketOperationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MarketOperationsPackage.eNS_URI) instanceof MarketOperationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MarketOperationsPackage.eNS_URI) : MarketOperationsPackage.eINSTANCE);
		InfOperationsPackageImpl theInfOperationsPackage = (InfOperationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI) instanceof InfOperationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI) : InfOperationsPackage.eINSTANCE);
		InfPaymentMeteringPackageImpl theInfPaymentMeteringPackage = (InfPaymentMeteringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfPaymentMeteringPackage.eNS_URI) instanceof InfPaymentMeteringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfPaymentMeteringPackage.eNS_URI) : InfPaymentMeteringPackage.eINSTANCE);
		InfCommonPackageImpl theInfCommonPackage = (InfCommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfCommonPackage.eNS_URI) instanceof InfCommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfCommonPackage.eNS_URI) : InfCommonPackage.eINSTANCE);
		InfLocationsPackageImpl theInfLocationsPackage = (InfLocationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfLocationsPackage.eNS_URI) instanceof InfLocationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfLocationsPackage.eNS_URI) : InfLocationsPackage.eINSTANCE);
		FinancialPackageImpl theFinancialPackage = (FinancialPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FinancialPackage.eNS_URI) instanceof FinancialPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FinancialPackage.eNS_URI) : FinancialPackage.eINSTANCE);
		ReservationPackageImpl theReservationPackage = (ReservationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReservationPackage.eNS_URI) instanceof ReservationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReservationPackage.eNS_URI) : ReservationPackage.eINSTANCE);
		InfMeteringPackageImpl theInfMeteringPackage = (InfMeteringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfMeteringPackage.eNS_URI) instanceof InfMeteringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfMeteringPackage.eNS_URI) : InfMeteringPackage.eINSTANCE);
		InfCustomersPackageImpl theInfCustomersPackage = (InfCustomersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfCustomersPackage.eNS_URI) instanceof InfCustomersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfCustomersPackage.eNS_URI) : InfCustomersPackage.eINSTANCE);
		InfLoadControlPackageImpl theInfLoadControlPackage = (InfLoadControlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfLoadControlPackage.eNS_URI) instanceof InfLoadControlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfLoadControlPackage.eNS_URI) : InfLoadControlPackage.eINSTANCE);
		InfTypeAssetPackageImpl theInfTypeAssetPackage = (InfTypeAssetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfTypeAssetPackage.eNS_URI) instanceof InfTypeAssetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfTypeAssetPackage.eNS_URI) : InfTypeAssetPackage.eINSTANCE);
		MeasPackageImpl theMeasPackage = (MeasPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI) instanceof MeasPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI) : MeasPackage.eINSTANCE);
		GenerationDynamicsPackageImpl theGenerationDynamicsPackage = (GenerationDynamicsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GenerationDynamicsPackage.eNS_URI) instanceof GenerationDynamicsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GenerationDynamicsPackage.eNS_URI) : GenerationDynamicsPackage.eINSTANCE);
		ProductionPackageImpl theProductionPackage = (ProductionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) instanceof ProductionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) : ProductionPackage.eINSTANCE);
		SCADAPackageImpl theSCADAPackage = (SCADAPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SCADAPackage.eNS_URI) instanceof SCADAPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SCADAPackage.eNS_URI) : SCADAPackage.eINSTANCE);
		WiresPackageImpl theWiresPackage = (WiresPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI) instanceof WiresPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI) : WiresPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		StateVariablesPackageImpl theStateVariablesPackage = (StateVariablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StateVariablesPackage.eNS_URI) instanceof StateVariablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StateVariablesPackage.eNS_URI) : StateVariablesPackage.eINSTANCE);
		EquivalentsPackageImpl theEquivalentsPackage = (EquivalentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EquivalentsPackage.eNS_URI) instanceof EquivalentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EquivalentsPackage.eNS_URI) : EquivalentsPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		LoadModelPackageImpl theLoadModelPackage = (LoadModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI) instanceof LoadModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI) : LoadModelPackage.eINSTANCE);
		ProtectionPackageImpl theProtectionPackage = (ProtectionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProtectionPackage.eNS_URI) instanceof ProtectionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProtectionPackage.eNS_URI) : ProtectionPackage.eINSTANCE);
		OutagePackageImpl theOutagePackage = (OutagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OutagePackage.eNS_URI) instanceof OutagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OutagePackage.eNS_URI) : OutagePackage.eINSTANCE);
		ControlAreaPackageImpl theControlAreaPackage = (ControlAreaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI) instanceof ControlAreaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI) : ControlAreaPackage.eINSTANCE);
		ContingencyPackageImpl theContingencyPackage = (ContingencyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContingencyPackage.eNS_URI) instanceof ContingencyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContingencyPackage.eNS_URI) : ContingencyPackage.eINSTANCE);
		TopologyPackageImpl theTopologyPackage = (TopologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) instanceof TopologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) : TopologyPackage.eINSTANCE);
		PackageDependenciesPackageImpl thePackageDependenciesPackage = (PackageDependenciesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PackageDependenciesPackage.eNS_URI) instanceof PackageDependenciesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PackageDependenciesPackage.eNS_URI) : PackageDependenciesPackage.eINSTANCE);
		IEC61968PackageImpl theIEC61968Package = (IEC61968PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IEC61968Package.eNS_URI) instanceof IEC61968PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IEC61968Package.eNS_URI) : IEC61968Package.eINSTANCE);
		MeteringPackageImpl theMeteringPackage = (MeteringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI) instanceof MeteringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI) : MeteringPackage.eINSTANCE);
		WiresExtPackageImpl theWiresExtPackage = (WiresExtPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WiresExtPackage.eNS_URI) instanceof WiresExtPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WiresExtPackage.eNS_URI) : WiresExtPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		AssetModelsPackageImpl theAssetModelsPackage = (AssetModelsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI) instanceof AssetModelsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI) : AssetModelsPackage.eINSTANCE);
		PaymentMeteringPackageImpl thePaymentMeteringPackage = (PaymentMeteringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI) instanceof PaymentMeteringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI) : PaymentMeteringPackage.eINSTANCE);
		CustomersPackageImpl theCustomersPackage = (CustomersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) instanceof CustomersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) : CustomersPackage.eINSTANCE);
		LoadControlPackageImpl theLoadControlPackage = (LoadControlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LoadControlPackage.eNS_URI) instanceof LoadControlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LoadControlPackage.eNS_URI) : LoadControlPackage.eINSTANCE);
		AssetsPackageImpl theAssetsPackage = (AssetsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI) instanceof AssetsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI) : AssetsPackage.eINSTANCE);
		WorkPackageImpl theWorkPackage = (WorkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkPackage.eNS_URI) instanceof WorkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkPackage.eNS_URI) : WorkPackage.eINSTANCE);
		SubstationStandardPackageImpl theSubstationStandardPackage = (SubstationStandardPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SubstationStandardPackage.eNS_URI) instanceof SubstationStandardPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SubstationStandardPackage.eNS_URI) : SubstationStandardPackage.eINSTANCE);
		DomainLNsPackageImpl theDomainLNsPackage = (DomainLNsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainLNsPackage.eNS_URI) instanceof DomainLNsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainLNsPackage.eNS_URI) : DomainLNsPackage.eINSTANCE);
		LNGroupPPackageImpl theLNGroupPPackage = (LNGroupPPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupPPackage.eNS_URI) instanceof LNGroupPPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupPPackage.eNS_URI) : LNGroupPPackage.eINSTANCE);
		LNGroupRPackageImpl theLNGroupRPackage = (LNGroupRPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupRPackage.eNS_URI) instanceof LNGroupRPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupRPackage.eNS_URI) : LNGroupRPackage.eINSTANCE);
		LNGroupCPackageImpl theLNGroupCPackage = (LNGroupCPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupCPackage.eNS_URI) instanceof LNGroupCPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupCPackage.eNS_URI) : LNGroupCPackage.eINSTANCE);
		LNGroupAPackageImpl theLNGroupAPackage = (LNGroupAPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupAPackage.eNS_URI) instanceof LNGroupAPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupAPackage.eNS_URI) : LNGroupAPackage.eINSTANCE);
		LNGroupMPackageImpl theLNGroupMPackage = (LNGroupMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupMPackage.eNS_URI) instanceof LNGroupMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupMPackage.eNS_URI) : LNGroupMPackage.eINSTANCE);
		LNGroupXPackageImpl theLNGroupXPackage = (LNGroupXPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupXPackage.eNS_URI) instanceof LNGroupXPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupXPackage.eNS_URI) : LNGroupXPackage.eINSTANCE);
		LNGroupTPackageImpl theLNGroupTPackage = (LNGroupTPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupTPackage.eNS_URI) instanceof LNGroupTPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupTPackage.eNS_URI) : LNGroupTPackage.eINSTANCE);
		LNGroupYPackageImpl theLNGroupYPackage = (LNGroupYPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupYPackage.eNS_URI) instanceof LNGroupYPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupYPackage.eNS_URI) : LNGroupYPackage.eINSTANCE);
		LNGroupZPackageImpl theLNGroupZPackage = (LNGroupZPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupZPackage.eNS_URI) instanceof LNGroupZPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupZPackage.eNS_URI) : LNGroupZPackage.eINSTANCE);
		DataclassesPackageImpl theDataclassesPackage = (DataclassesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataclassesPackage.eNS_URI) instanceof DataclassesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataclassesPackage.eNS_URI) : DataclassesPackage.eINSTANCE);
		EnumerationsPackageImpl theEnumerationsPackage = (EnumerationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI) instanceof EnumerationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI) : EnumerationsPackage.eINSTANCE);

		// Load packages
		theGluemodelPackage.loadPackage();

		// Fix loaded packages
		theInfWorkPackage.fixPackageContents();
		theGluemodelPackage.fixPackageContents();
		theCOSEMPackage.fixPackageContents();
		theDatatypesPackage.fixPackageContents();
		theInterfaceClassesPackage.fixPackageContents();
		theCOSEMObjectsPackage.fixPackageContents();
		theCIMPackage.fixPackageContents();
		theIEC61970Package.fixPackageContents();
		theOperationalLimitsPackage.fixPackageContents();
		theEnergySchedulingPackage.fixPackageContents();
		theInfERPSupportPackage.fixPackageContents();
		theInfAssetModelsPackage.fixPackageContents();
		theInfAssetsPackage.fixPackageContents();
		theInfGMLSupportPackage.fixPackageContents();
		theInfCorePackage.fixPackageContents();
		theMarketOperationsPackage.fixPackageContents();
		theInfOperationsPackage.fixPackageContents();
		theInfPaymentMeteringPackage.fixPackageContents();
		theInfCommonPackage.fixPackageContents();
		theInfLocationsPackage.fixPackageContents();
		theFinancialPackage.fixPackageContents();
		theReservationPackage.fixPackageContents();
		theInfMeteringPackage.fixPackageContents();
		theInfCustomersPackage.fixPackageContents();
		theInfLoadControlPackage.fixPackageContents();
		theInfTypeAssetPackage.fixPackageContents();
		theMeasPackage.fixPackageContents();
		theGenerationDynamicsPackage.fixPackageContents();
		theProductionPackage.fixPackageContents();
		theSCADAPackage.fixPackageContents();
		theWiresPackage.fixPackageContents();
		theCorePackage.fixPackageContents();
		theStateVariablesPackage.fixPackageContents();
		theEquivalentsPackage.fixPackageContents();
		theDomainPackage.fixPackageContents();
		theLoadModelPackage.fixPackageContents();
		theProtectionPackage.fixPackageContents();
		theOutagePackage.fixPackageContents();
		theControlAreaPackage.fixPackageContents();
		theContingencyPackage.fixPackageContents();
		theTopologyPackage.fixPackageContents();
		thePackageDependenciesPackage.fixPackageContents();
		theIEC61968Package.fixPackageContents();
		theMeteringPackage.fixPackageContents();
		theWiresExtPackage.fixPackageContents();
		theCommonPackage.fixPackageContents();
		theAssetModelsPackage.fixPackageContents();
		thePaymentMeteringPackage.fixPackageContents();
		theCustomersPackage.fixPackageContents();
		theLoadControlPackage.fixPackageContents();
		theAssetsPackage.fixPackageContents();
		theWorkPackage.fixPackageContents();
		theSubstationStandardPackage.fixPackageContents();
		theDomainLNsPackage.fixPackageContents();
		theLNGroupPPackage.fixPackageContents();
		theLNGroupRPackage.fixPackageContents();
		theLNGroupCPackage.fixPackageContents();
		theLNGroupAPackage.fixPackageContents();
		theLNGroupMPackage.fixPackageContents();
		theLNGroupXPackage.fixPackageContents();
		theLNGroupTPackage.fixPackageContents();
		theLNGroupYPackage.fixPackageContents();
		theLNGroupZPackage.fixPackageContents();
		theDataclassesPackage.fixPackageContents();
		theEnumerationsPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theInfWorkPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InfWorkPackage.eNS_URI, theInfWorkPackage);
		return theInfWorkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkFlowStep() {
		if (workFlowStepEClass == null) {
			workFlowStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(0);
		}
		return workFlowStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkFlowStep_SequenceNumber() {
        return (EAttribute)getWorkFlowStep().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkFlowStep_WorkTasks() {
        return (EReference)getWorkFlowStep().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkFlowStep_Status() {
        return (EReference)getWorkFlowStep().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkFlowStep_Work() {
        return (EReference)getWorkFlowStep().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkCostDetail() {
		if (workCostDetailEClass == null) {
			workCostDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(1);
		}
		return workCostDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkCostDetail_CostType() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkCostDetail_ContractorItems() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkCostDetail_MaterialItems() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkCostDetail_TransactionDateTime() {
        return (EAttribute)getWorkCostDetail().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkCostDetail_EquipmentItems() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkCostDetail_PropertyUnits() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkCostDetail_Amount() {
        return (EAttribute)getWorkCostDetail().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkCostDetail_Design() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkCostDetail_MiscCostItems() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkCostDetail_WorkCostSummary() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkCostDetail_WorkTask() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkCostDetail_IsDebit() {
        return (EAttribute)getWorkCostDetail().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkCostDetail_Type() {
        return (EAttribute)getWorkCostDetail().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkCostDetail_OverheadCost() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkCostDetail_Works() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkCostDetail_LaborItems() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkCostDetail_ErpProjectAccounting() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsage() {
		if (usageEClass == null) {
			usageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(2);
		}
		return usageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsage_WorkEquipmentAsset() {
        return (EReference)getUsage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsage_WorkTask() {
        return (EReference)getUsage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsage_MaterialItem() {
        return (EReference)getUsage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsage_Status() {
        return (EReference)getUsage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkCostSummary() {
		if (workCostSummaryEClass == null) {
			workCostSummaryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(3);
		}
		return workCostSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkCostSummary_WorkCostDetail() {
        return (EReference)getWorkCostSummary().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMiscCostItem() {
		if (miscCostItemEClass == null) {
			miscCostItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(4);
		}
		return miscCostItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiscCostItem_Status() {
        return (EReference)getMiscCostItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiscCostItem_DesignLocation() {
        return (EReference)getMiscCostItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiscCostItem_WorkTask() {
        return (EReference)getMiscCostItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiscCostItem_CostPerUnit() {
        return (EAttribute)getMiscCostItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiscCostItem_WorkCostDetail() {
        return (EReference)getMiscCostItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiscCostItem_Quantity() {
        return (EAttribute)getMiscCostItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiscCostItem_Account() {
        return (EAttribute)getMiscCostItem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiscCostItem_ExternalRefID() {
        return (EAttribute)getMiscCostItem().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiscCostItem_CostType() {
        return (EAttribute)getMiscCostItem().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCUAllowableAction() {
		if (cuAllowableActionEClass == null) {
			cuAllowableActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(5);
		}
		return cuAllowableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUAllowableAction_CompatibleUnits() {
        return (EReference)getCUAllowableAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUAllowableAction_Status() {
        return (EReference)getCUAllowableAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCostType() {
		if (costTypeEClass == null) {
			costTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(6);
		}
		return costTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCostType_Level() {
        return (EAttribute)getCostType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCostType_ErpJournalEntries() {
        return (EReference)getCostType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCostType_WorkCostDetails() {
        return (EReference)getCostType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCostType_ParentCostType() {
        return (EReference)getCostType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCostType_CompatibleUnits() {
        return (EReference)getCostType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCostType_Status() {
        return (EReference)getCostType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCostType_ChildCostTypes() {
        return (EReference)getCostType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCostType_AmountAssignmentFlag() {
        return (EAttribute)getCostType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCostType_Code() {
        return (EAttribute)getCostType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCostType_Stage() {
        return (EAttribute)getCostType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCUMaterialItem() {
		if (cuMaterialItemEClass == null) {
			cuMaterialItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(7);
		}
		return cuMaterialItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUMaterialItem_CompatibleUnits() {
        return (EReference)getCUMaterialItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUMaterialItem_Status() {
        return (EReference)getCUMaterialItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUMaterialItem_TypeMaterial() {
        return (EReference)getCUMaterialItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCUMaterialItem_Quantity() {
        return (EAttribute)getCUMaterialItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUMaterialItem_PropertyUnits() {
        return (EReference)getCUMaterialItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCUMaterialItem_CorporateCode() {
        return (EAttribute)getCUMaterialItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		if (assignmentEClass == null) {
			assignmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(8);
		}
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_Crews() {
        return (EReference)getAssignment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_EffectivePeriod() {
        return (EReference)getAssignment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesign() {
		if (designEClass == null) {
			designEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(10);
		}
		return designEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesign_CostEstimate() {
        return (EAttribute)getDesign().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesign_DesignLocations() {
        return (EReference)getDesign().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesign_DesignLocationsCUs() {
        return (EReference)getDesign().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesign_Work() {
        return (EReference)getDesign().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesign_WorkCostDetails() {
        return (EReference)getDesign().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesign_ErpBOMs() {
        return (EReference)getDesign().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesign_ErpQuoteLineItem() {
        return (EReference)getDesign().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesign_ConditionFactors() {
        return (EReference)getDesign().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesign_Kind() {
        return (EAttribute)getDesign().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesign_Price() {
        return (EAttribute)getDesign().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesign_WorkTasks() {
        return (EReference)getDesign().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessCase() {
		if (businessCaseEClass == null) {
			businessCaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(12);
		}
		return businessCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessCase_CorporateCode() {
        return (EAttribute)getBusinessCase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessCase_Works() {
        return (EReference)getBusinessCase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessCase_Projects() {
        return (EReference)getBusinessCase().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquipmentItem() {
		if (equipmentItemEClass == null) {
			equipmentItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(13);
		}
		return equipmentItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEquipmentItem_Code() {
        return (EAttribute)getEquipmentItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEquipmentItem_Cost() {
        return (EAttribute)getEquipmentItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquipmentItem_Status() {
        return (EReference)getEquipmentItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquipmentItem_WorkCostDetail() {
        return (EReference)getEquipmentItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquipmentItem_WorkTask() {
        return (EReference)getEquipmentItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneCallRequest() {
		if (oneCallRequestEClass == null) {
			oneCallRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(14);
		}
		return oneCallRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneCallRequest_MarkingInstruction() {
        return (EAttribute)getOneCallRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneCallRequest_ExplosivesUsed() {
        return (EAttribute)getOneCallRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneCallRequest_WorkLocations() {
        return (EReference)getOneCallRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneCallRequest_MarkedIndicator() {
        return (EAttribute)getOneCallRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLaborItem() {
		if (laborItemEClass == null) {
			laborItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(15);
		}
		return laborItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLaborItem_WorkTask() {
        return (EReference)getLaborItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLaborItem_ActivityCode() {
        return (EAttribute)getLaborItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLaborItem_Cost() {
        return (EAttribute)getLaborItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLaborItem_ErpPersons() {
        return (EReference)getLaborItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLaborItem_LaborDuration() {
        return (EAttribute)getLaborItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLaborItem_LaborRate() {
        return (EAttribute)getLaborItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLaborItem_WorkCostDetail() {
        return (EReference)getLaborItem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLaborItem_Status() {
        return (EReference)getLaborItem().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		if (projectEClass == null) {
			projectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(16);
		}
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Budget() {
        return (EAttribute)getProject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_ErpProjectAccounting() {
        return (EReference)getProject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Works() {
        return (EReference)getProject().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Requests() {
        return (EReference)getProject().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_BusinessCase() {
        return (EReference)getProject().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_SubProjects() {
        return (EReference)getProject().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_ParentProject() {
        return (EReference)getProject().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessPermit() {
		if (accessPermitEClass == null) {
			accessPermitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(17);
		}
		return accessPermitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessPermit_ExpirationDate() {
        return (EAttribute)getAccessPermit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessPermit_ApplicationNumber() {
        return (EAttribute)getAccessPermit().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessPermit_EffectiveDate() {
        return (EAttribute)getAccessPermit().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessPermit_PermitID() {
        return (EAttribute)getAccessPermit().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessPermit_Payment() {
        return (EAttribute)getAccessPermit().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInspectionDataSet() {
		if (inspectionDataSetEClass == null) {
			inspectionDataSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(18);
		}
		return inspectionDataSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInspectionDataSet_LocationCondition() {
        return (EAttribute)getInspectionDataSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInspectionDataSet_AccordingToSchedules() {
        return (EReference)getInspectionDataSet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegulation() {
		if (regulationEClass == null) {
			regulationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(19);
		}
		return regulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegulation_ReferenceNumber() {
        return (EAttribute)getRegulation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShiftPattern() {
		if (shiftPatternEClass == null) {
			shiftPatternEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(20);
		}
		return shiftPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShiftPattern_AssignmentType() {
        return (EAttribute)getShiftPattern().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShiftPattern_Crews() {
        return (EReference)getShiftPattern().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShiftPattern_Status() {
        return (EReference)getShiftPattern().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShiftPattern_CycleCount() {
        return (EAttribute)getShiftPattern().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShiftPattern_ValidityInterval() {
        return (EReference)getShiftPattern().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonStandardItem() {
		if (nonStandardItemEClass == null) {
			nonStandardItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(21);
		}
		return nonStandardItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonStandardItem_Code() {
        return (EAttribute)getNonStandardItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonStandardItem_Amount() {
        return (EAttribute)getNonStandardItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkLocation() {
		if (workLocationEClass == null) {
			workLocationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(23);
		}
		return workLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkLocation_Subdivision() {
        return (EAttribute)getWorkLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkLocation_Block() {
        return (EAttribute)getWorkLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkLocation_DesignLocations() {
        return (EReference)getWorkLocation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkLocation_OneCallRequest() {
        return (EReference)getWorkLocation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkLocation_Lot() {
        return (EAttribute)getWorkLocation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkLocation_NearestIntersection() {
        return (EAttribute)getWorkLocation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesignLocationCU() {
		if (designLocationCUEClass == null) {
			designLocationCUEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(24);
		}
		return designLocationCUEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignLocationCU_Designs() {
        return (EReference)getDesignLocationCU().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignLocationCU_RemovalDate() {
        return (EAttribute)getDesignLocationCU().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignLocationCU_ConditionFactors() {
        return (EReference)getDesignLocationCU().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignLocationCU_CompatibleUnits() {
        return (EReference)getDesignLocationCU().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignLocationCU_CuQuantity() {
        return (EAttribute)getDesignLocationCU().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignLocationCU_CuAccount() {
        return (EAttribute)getDesignLocationCU().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignLocationCU_WorkTasks() {
        return (EReference)getDesignLocationCU().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignLocationCU_DesignLocation() {
        return (EReference)getDesignLocationCU().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignLocationCU_Status() {
        return (EReference)getDesignLocationCU().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignLocationCU_CuAction() {
        return (EAttribute)getDesignLocationCU().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignLocationCU_EnergizationFlag() {
        return (EAttribute)getDesignLocationCU().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignLocationCU_CUGroups() {
        return (EReference)getDesignLocationCU().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignLocationCU_CuUsage() {
        return (EAttribute)getDesignLocationCU().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesignLocation() {
		if (designLocationEClass == null) {
			designLocationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(25);
		}
		return designLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignLocation_SpanLength() {
        return (EAttribute)getDesignLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignLocation_ConditionFactors() {
        return (EReference)getDesignLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignLocation_MaterialItems() {
        return (EReference)getDesignLocation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignLocation_Status() {
        return (EReference)getDesignLocation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignLocation_Diagrams() {
        return (EReference)getDesignLocation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignLocation_WorkLocations() {
        return (EReference)getDesignLocation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignLocation_DesignLocationCUs() {
        return (EReference)getDesignLocation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignLocation_Designs() {
        return (EReference)getDesignLocation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignLocation_ErpBomItemDatas() {
        return (EReference)getDesignLocation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignLocation_MiscCostItems() {
        return (EReference)getDesignLocation().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCULaborCode() {
		if (cuLaborCodeEClass == null) {
			cuLaborCodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(26);
		}
		return cuLaborCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCULaborCode_Code() {
        return (EAttribute)getCULaborCode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCULaborCode_Status() {
        return (EReference)getCULaborCode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCULaborCode_CULaborItems() {
        return (EReference)getCULaborCode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionFactor() {
		if (conditionFactorEClass == null) {
			conditionFactorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(27);
		}
		return conditionFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionFactor_CfValue() {
        return (EAttribute)getConditionFactor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionFactor_DesignLocations() {
        return (EReference)getConditionFactor().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionFactor_DesignLocationCUs() {
        return (EReference)getConditionFactor().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionFactor_Kind() {
        return (EAttribute)getConditionFactor().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionFactor_Designs() {
        return (EReference)getConditionFactor().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionFactor_Status() {
        return (EReference)getConditionFactor().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCUWorkEquipmentItem() {
		if (cuWorkEquipmentItemEClass == null) {
			cuWorkEquipmentItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(28);
		}
		return cuWorkEquipmentItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCUWorkEquipmentItem_EquipCode() {
        return (EAttribute)getCUWorkEquipmentItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCUWorkEquipmentItem_Rate() {
        return (EAttribute)getCUWorkEquipmentItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUWorkEquipmentItem_TypeAsset() {
        return (EReference)getCUWorkEquipmentItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUWorkEquipmentItem_CompatibleUnits() {
        return (EReference)getCUWorkEquipmentItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUWorkEquipmentItem_Status() {
        return (EReference)getCUWorkEquipmentItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualificationRequirement() {
		if (qualificationRequirementEClass == null) {
			qualificationRequirementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(29);
		}
		return qualificationRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualificationRequirement_Specifications() {
        return (EReference)getQualificationRequirement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualificationRequirement_WorkTasks() {
        return (EReference)getQualificationRequirement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualificationRequirement_CULaborItems() {
        return (EReference)getQualificationRequirement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualificationRequirement_Skills() {
        return (EReference)getQualificationRequirement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualificationRequirement_QualificationID() {
        return (EAttribute)getQualificationRequirement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCUContractorItem() {
		if (cuContractorItemEClass == null) {
			cuContractorItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(30);
		}
		return cuContractorItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCUContractorItem_ActivityCode() {
        return (EAttribute)getCUContractorItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUContractorItem_Status() {
        return (EReference)getCUContractorItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCUContractorItem_BidAmount() {
        return (EAttribute)getCUContractorItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUContractorItem_CompatibleUnits() {
        return (EReference)getCUContractorItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaterialItem() {
		if (materialItemEClass == null) {
			materialItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(31);
		}
		return materialItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterialItem_ErpPOLineItems() {
        return (EReference)getMaterialItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterialItem_TypeMaterial() {
        return (EReference)getMaterialItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterialItem_ErpInventoryCounts() {
        return (EReference)getMaterialItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterialItem_Usages() {
        return (EReference)getMaterialItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterialItem_WorkCostDetail() {
        return (EReference)getMaterialItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterialItem_WorkTask() {
        return (EReference)getMaterialItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialItem_Account() {
        return (EAttribute)getMaterialItem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialItem_CostDescription() {
        return (EAttribute)getMaterialItem().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialItem_Quantity() {
        return (EAttribute)getMaterialItem().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialItem_CostType() {
        return (EAttribute)getMaterialItem().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialItem_ExternalRefID() {
        return (EAttribute)getMaterialItem().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterialItem_Status() {
        return (EReference)getMaterialItem().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterialItem_ErpRecDelvLineItems() {
        return (EReference)getMaterialItem().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterialItem_DesignLocation() {
        return (EReference)getMaterialItem().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialItem_ActualCost() {
        return (EAttribute)getMaterialItem().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialItem_MaterialCode() {
        return (EAttribute)getMaterialItem().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyUnit() {
		if (propertyUnitEClass == null) {
			propertyUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(32);
		}
		return propertyUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyUnit_WorkCostDetails() {
        return (EReference)getPropertyUnit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyUnit_Status() {
        return (EReference)getPropertyUnit().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyUnit_CompatibleUnits() {
        return (EReference)getPropertyUnit().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyUnit_PropertyAccount() {
        return (EAttribute)getPropertyUnit().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyUnit_CUMaterialItems() {
        return (EReference)getPropertyUnit().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyUnit_AccountingUsage() {
        return (EAttribute)getPropertyUnit().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyUnit_ActivityCode() {
        return (EAttribute)getPropertyUnit().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompatibleUnit() {
		if (compatibleUnitEClass == null) {
			compatibleUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(33);
		}
		return compatibleUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompatibleUnit_DesignLocationCUs() {
        return (EReference)getCompatibleUnit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompatibleUnit_EstCost() {
        return (EAttribute)getCompatibleUnit().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompatibleUnit_PropertyUnit() {
        return (EReference)getCompatibleUnit().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompatibleUnit_CULaborItems() {
        return (EReference)getCompatibleUnit().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompatibleUnit_CUMaterialItems() {
        return (EReference)getCompatibleUnit().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompatibleUnit_CUGroup() {
        return (EReference)getCompatibleUnit().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompatibleUnit_CUWorkEquipmentItems() {
        return (EReference)getCompatibleUnit().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompatibleUnit_CostType() {
        return (EReference)getCompatibleUnit().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompatibleUnit_Quantity() {
        return (EAttribute)getCompatibleUnit().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompatibleUnit_Procedures() {
        return (EReference)getCompatibleUnit().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompatibleUnit_CUAssets() {
        return (EReference)getCompatibleUnit().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompatibleUnit_CUAllowableAction() {
        return (EReference)getCompatibleUnit().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompatibleUnit_CUContractorItems() {
        return (EReference)getCompatibleUnit().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkTask() {
		if (workTaskEClass == null) {
			workTaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(34);
		}
		return workTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkTask_Crews() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkTask_SwitchingSchedules() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkTask_MiscCostItems() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkTask_LaborItems() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkTask_Priority() {
        return (EAttribute)getWorkTask().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkTask_WorkFlowStep() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkTask_Assets() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkTask_Capabilities() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkTask_SchedOverride() {
        return (EAttribute)getWorkTask().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkTask_Work() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkTask_DesignLocationCUs() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkTask_ContractorItems() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkTask_Design() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkTask_EquipmentItems() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkTask_MaterialItems() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkTask_WorkCostDetails() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkTask_QualificationRequirements() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkTask_Usages() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkTask_OverheadCost() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeMaterial() {
		if (typeMaterialEClass == null) {
			typeMaterialEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(35);
		}
		return typeMaterialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeMaterial_ErpIssueInventories() {
        return (EReference)getTypeMaterial().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeMaterial_StockItem() {
        return (EAttribute)getTypeMaterial().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeMaterial_Quantity() {
        return (EAttribute)getTypeMaterial().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeMaterial_ErpReqLineItems() {
        return (EReference)getTypeMaterial().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeMaterial_MaterialItems() {
        return (EReference)getTypeMaterial().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeMaterial_CostType() {
        return (EAttribute)getTypeMaterial().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeMaterial_EstUnitCost() {
        return (EAttribute)getTypeMaterial().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeMaterial_CUMaterialItems() {
        return (EReference)getTypeMaterial().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapability() {
		if (capabilityEClass == null) {
			capabilityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(36);
		}
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapability_Category() {
        return (EAttribute)getCapability().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_WorkTasks() {
        return (EReference)getCapability().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_ValidityInterval() {
        return (EReference)getCapability().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_Crew() {
        return (EReference)getCapability().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_Crafts() {
        return (EReference)getCapability().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_Status() {
        return (EReference)getCapability().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapability_PerformanceFactor() {
        return (EAttribute)getCapability().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCUAsset() {
		if (cuAssetEClass == null) {
			cuAssetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(37);
		}
		return cuAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCUAsset_TypeAssetCode() {
        return (EAttribute)getCUAsset().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUAsset_Status() {
        return (EReference)getCUAsset().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUAsset_TypeAsset() {
        return (EReference)getCUAsset().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCUAsset_Quantity() {
        return (EAttribute)getCUAsset().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUAsset_CompatibleUnits() {
        return (EReference)getCUAsset().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractorItem() {
		if (contractorItemEClass == null) {
			contractorItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(38);
		}
		return contractorItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractorItem_Status() {
        return (EReference)getContractorItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContractorItem_Cost() {
        return (EAttribute)getContractorItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContractorItem_ActivityCode() {
        return (EAttribute)getContractorItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractorItem_ErpPayables() {
        return (EReference)getContractorItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractorItem_WorkCostDetail() {
        return (EReference)getContractorItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractorItem_WorkTask() {
        return (EReference)getContractorItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContractorItem_BidAmount() {
        return (EAttribute)getContractorItem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfoQuestion() {
		if (infoQuestionEClass == null) {
			infoQuestionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(39);
		}
		return infoQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfoQuestion_Answer() {
        return (EAttribute)getInfoQuestion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfoQuestion_QuestionText() {
        return (EAttribute)getInfoQuestion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfoQuestion_AnswerDateTime() {
        return (EAttribute)getInfoQuestion().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfoQuestion_QuestionCategory() {
        return (EAttribute)getInfoQuestion().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfoQuestion_AnswerRemark() {
        return (EAttribute)getInfoQuestion().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfoQuestion_QuestionRemark() {
        return (EAttribute)getInfoQuestion().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfoQuestion_QuestionCode() {
        return (EAttribute)getInfoQuestion().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkStatusEntry() {
		if (workStatusEntryEClass == null) {
			workStatusEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(40);
		}
		return workStatusEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkStatusEntry_PercentComplete() {
        return (EAttribute)getWorkStatusEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppointment() {
		if (appointmentEClass == null) {
			appointmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(41);
		}
		return appointmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppointment_Remark() {
        return (EAttribute)getAppointment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Address() {
        return (EReference)getAppointment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_CallBack() {
        return (EReference)getAppointment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_MeetingInterval() {
        return (EReference)getAppointment().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_ErpPersons() {
        return (EReference)getAppointment().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppointment_CallAhead() {
        return (EAttribute)getAppointment().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaintenanceDataSet() {
		if (maintenanceDataSetEClass == null) {
			maintenanceDataSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(42);
		}
		return maintenanceDataSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaintenanceDataSet_MaintCode() {
        return (EAttribute)getMaintenanceDataSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaintenanceDataSet_ConditionBefore() {
        return (EAttribute)getMaintenanceDataSet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaintenanceDataSet_ConditionAfter() {
        return (EAttribute)getMaintenanceDataSet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCUGroup() {
		if (cuGroupEClass == null) {
			cuGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(43);
		}
		return cuGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUGroup_ChildCUGroups() {
        return (EReference)getCUGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUGroup_ParentCUGroups() {
        return (EReference)getCUGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUGroup_DesignLocationCUs() {
        return (EReference)getCUGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUGroup_CompatibleUnits() {
        return (EReference)getCUGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUGroup_Status() {
        return (EReference)getCUGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrew() {
		if (crewEClass == null) {
			crewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(44);
		}
		return crewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrew_WorkTasks() {
        return (EReference)getCrew().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrew_Assignments() {
        return (EReference)getCrew().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrew_ShiftPatterns() {
        return (EReference)getCrew().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrew_Route() {
        return (EReference)getCrew().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrew_Tools() {
        return (EReference)getCrew().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrew_Vehicles() {
        return (EReference)getCrew().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrew_Category() {
        return (EAttribute)getCrew().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrew_CrewMembers() {
        return (EReference)getCrew().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrew_WorkEquipmentAssets() {
        return (EReference)getCrew().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrew_Locations() {
        return (EReference)getCrew().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrew_Organisations() {
        return (EReference)getCrew().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrew_SwitchingSchedules() {
        return (EReference)getCrew().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrew_Capabilities() {
        return (EReference)getCrew().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrew_OutageSteps() {
        return (EReference)getCrew().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequest() {
		if (requestEClass == null) {
			requestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(45);
		}
		return requestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_Priority() {
        return (EAttribute)getRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequest_Organisation() {
        return (EReference)getRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_CorporateCode() {
        return (EAttribute)getRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequest_Works() {
        return (EReference)getRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequest_ErpQuoteLineItem() {
        return (EReference)getRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequest_Projects() {
        return (EReference)getRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_ActionNeeded() {
        return (EAttribute)getRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverheadCost() {
		if (overheadCostEClass == null) {
			overheadCostEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(46);
		}
		return overheadCostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverheadCost_Code() {
        return (EAttribute)getOverheadCost().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverheadCost_Cost() {
        return (EAttribute)getOverheadCost().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOverheadCost_WorkTasks() {
        return (EReference)getOverheadCost().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOverheadCost_Status() {
        return (EReference)getOverheadCost().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOverheadCost_WorkCostDetails() {
        return (EReference)getOverheadCost().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosisDataSet() {
		if (diagnosisDataSetEClass == null) {
			diagnosisDataSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(47);
		}
		return diagnosisDataSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_PhaseCode() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_FinalCode() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_Effect() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_FailureMode() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_RootOrigin() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_FinalCause() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_RootRemark() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_RootCause() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_PreliminaryRemark() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_PreliminaryCode() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_PreliminaryDateTime() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_FinalRemark() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_FinalOrigin() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCULaborItem() {
		if (cuLaborItemEClass == null) {
			cuLaborItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(48);
		}
		return cuLaborItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCULaborItem_QualificationRequirements() {
        return (EReference)getCULaborItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCULaborItem_CULaborCode() {
        return (EReference)getCULaborItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCULaborItem_ActivityCode() {
        return (EAttribute)getCULaborItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCULaborItem_LaborDuration() {
        return (EAttribute)getCULaborItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCULaborItem_Status() {
        return (EReference)getCULaborItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCULaborItem_CompatibleUnits() {
        return (EReference)getCULaborItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCULaborItem_LaborRate() {
        return (EAttribute)getCULaborItem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDesignKind() {
		if (designKindEEnum == null) {
			designKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(9);
		}
		return designKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionFactorKind() {
		if (conditionFactorKindEEnum == null) {
			conditionFactorKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(11);
		}
		return conditionFactorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWorkActionKind() {
		if (workActionKindEEnum == null) {
			workActionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(22);
		}
		return workActionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfWorkFactory getInfWorkFactory() {
		return (InfWorkFactory)getEFactoryInstance();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("gluemodel.CIM.IEC61970.Informative.InfWork." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //InfWorkPackageImpl
