/**
 */
package CIM.IEC61968.AssetModels.impl;

import CIM.CIMPackage;

import CIM.IEC61968.AssetModels.AssetModelsFactory;
import CIM.IEC61968.AssetModels.AssetModelsPackage;

import CIM.IEC61968.Assets.AssetsPackage;

import CIM.IEC61968.Assets.impl.AssetsPackageImpl;

import CIM.IEC61968.Common.CommonPackage;

import CIM.IEC61968.Common.impl.CommonPackageImpl;

import CIM.IEC61968.Customers.CustomersPackage;

import CIM.IEC61968.Customers.impl.CustomersPackageImpl;

import CIM.IEC61968.IEC61968Package;

import CIM.IEC61968.LoadControl.LoadControlPackage;

import CIM.IEC61968.LoadControl.impl.LoadControlPackageImpl;

import CIM.IEC61968.Metering.MeteringPackage;

import CIM.IEC61968.Metering.impl.MeteringPackageImpl;

import CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;

import CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl;

import CIM.IEC61968.WiresExt.WiresExtPackage;

import CIM.IEC61968.WiresExt.impl.WiresExtPackageImpl;

import CIM.IEC61968.Work.WorkPackage;

import CIM.IEC61968.Work.impl.WorkPackageImpl;

import CIM.IEC61968.impl.IEC61968PackageImpl;

import CIM.IEC61970.Contingency.ContingencyPackage;

import CIM.IEC61970.Contingency.impl.ContingencyPackageImpl;

import CIM.IEC61970.ControlArea.ControlAreaPackage;

import CIM.IEC61970.ControlArea.impl.ControlAreaPackageImpl;

import CIM.IEC61970.Core.CorePackage;

import CIM.IEC61970.Core.impl.CorePackageImpl;

import CIM.IEC61970.Domain.DomainPackage;

import CIM.IEC61970.Domain.impl.DomainPackageImpl;

import CIM.IEC61970.Equivalents.EquivalentsPackage;

import CIM.IEC61970.Equivalents.impl.EquivalentsPackageImpl;

import CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage;

import CIM.IEC61970.Generation.GenerationDynamics.impl.GenerationDynamicsPackageImpl;

import CIM.IEC61970.Generation.Production.ProductionPackage;

import CIM.IEC61970.Generation.Production.impl.ProductionPackageImpl;

import CIM.IEC61970.IEC61970Package;

import CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;

import CIM.IEC61970.Informative.EnergyScheduling.impl.EnergySchedulingPackageImpl;

import CIM.IEC61970.Informative.Financial.FinancialPackage;

import CIM.IEC61970.Informative.Financial.impl.FinancialPackageImpl;

import CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage;

import CIM.IEC61970.Informative.InfAssetModels.impl.InfAssetModelsPackageImpl;

import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

import CIM.IEC61970.Informative.InfAssets.impl.InfAssetsPackageImpl;

import CIM.IEC61970.Informative.InfCommon.InfCommonPackage;

import CIM.IEC61970.Informative.InfCommon.impl.InfCommonPackageImpl;

import CIM.IEC61970.Informative.InfCore.InfCorePackage;

import CIM.IEC61970.Informative.InfCore.impl.InfCorePackageImpl;

import CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage;

import CIM.IEC61970.Informative.InfCustomers.impl.InfCustomersPackageImpl;

import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM.IEC61970.Informative.InfERPSupport.impl.InfERPSupportPackageImpl;

import CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage;

import CIM.IEC61970.Informative.InfGMLSupport.impl.InfGMLSupportPackageImpl;

import CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage;

import CIM.IEC61970.Informative.InfLoadControl.impl.InfLoadControlPackageImpl;

import CIM.IEC61970.Informative.InfLocations.InfLocationsPackage;

import CIM.IEC61970.Informative.InfLocations.impl.InfLocationsPackageImpl;

import CIM.IEC61970.Informative.InfMetering.InfMeteringPackage;

import CIM.IEC61970.Informative.InfMetering.impl.InfMeteringPackageImpl;

import CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;

import CIM.IEC61970.Informative.InfOperations.impl.InfOperationsPackageImpl;

import CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage;

import CIM.IEC61970.Informative.InfPaymentMetering.impl.InfPaymentMeteringPackageImpl;

import CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage;

import CIM.IEC61970.Informative.InfTypeAsset.impl.InfTypeAssetPackageImpl;

import CIM.IEC61970.Informative.InfWork.InfWorkPackage;

import CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl;

import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;

import CIM.IEC61970.Informative.MarketOperations.impl.MarketOperationsPackageImpl;

import CIM.IEC61970.Informative.Reservation.ReservationPackage;

import CIM.IEC61970.Informative.Reservation.impl.ReservationPackageImpl;

import CIM.IEC61970.LoadModel.LoadModelPackage;

import CIM.IEC61970.LoadModel.impl.LoadModelPackageImpl;

import CIM.IEC61970.Meas.MeasPackage;

import CIM.IEC61970.Meas.impl.MeasPackageImpl;

import CIM.IEC61970.OperationalLimits.OperationalLimitsPackage;

import CIM.IEC61970.OperationalLimits.impl.OperationalLimitsPackageImpl;

import CIM.IEC61970.Outage.OutagePackage;

import CIM.IEC61970.Outage.impl.OutagePackageImpl;

import CIM.IEC61970.Protection.ProtectionPackage;

import CIM.IEC61970.Protection.impl.ProtectionPackageImpl;

import CIM.IEC61970.SCADA.SCADAPackage;

import CIM.IEC61970.SCADA.impl.SCADAPackageImpl;

import CIM.IEC61970.StateVariables.StateVariablesPackage;

import CIM.IEC61970.StateVariables.impl.StateVariablesPackageImpl;

import CIM.IEC61970.Topology.TopologyPackage;

import CIM.IEC61970.Topology.impl.TopologyPackageImpl;

import CIM.IEC61970.Wires.WiresPackage;

import CIM.IEC61970.Wires.impl.WiresPackageImpl;

import CIM.IEC61970.impl.IEC61970PackageImpl;

import CIM.PackageDependencies.PackageDependenciesPackage;

import CIM.PackageDependencies.impl.PackageDependenciesPackageImpl;

import CIM.impl.CIMPackageImpl;

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
public class AssetModelsPackageImpl extends EPackageImpl implements AssetModelsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conductorInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wireTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concentricNeutralCableInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windingInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overheadConductorInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toWindingSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cableInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openCircuitTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distributionWindingTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortCircuitTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endDeviceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformerInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wireArrangementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tapeShieldCableInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conductorMaterialKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum corporateStandardKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assetModelUsageKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cableOuterJacketKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conductorUsageKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cableConstructionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conductorInsulationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cableShieldMaterialKindEEnum = null;

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
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AssetModelsPackageImpl() {
		super(eNS_URI, AssetModelsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AssetModelsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static AssetModelsPackage init() {
		if (isInited) return (AssetModelsPackage)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI);

		// Obtain or create and register package
		AssetModelsPackageImpl theAssetModelsPackage = (AssetModelsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AssetModelsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AssetModelsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
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
		InfWorkPackageImpl theInfWorkPackage = (InfWorkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI) instanceof InfWorkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI) : InfWorkPackage.eINSTANCE);
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
		PaymentMeteringPackageImpl thePaymentMeteringPackage = (PaymentMeteringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI) instanceof PaymentMeteringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI) : PaymentMeteringPackage.eINSTANCE);
		CustomersPackageImpl theCustomersPackage = (CustomersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) instanceof CustomersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) : CustomersPackage.eINSTANCE);
		LoadControlPackageImpl theLoadControlPackage = (LoadControlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LoadControlPackage.eNS_URI) instanceof LoadControlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LoadControlPackage.eNS_URI) : LoadControlPackage.eINSTANCE);
		AssetsPackageImpl theAssetsPackage = (AssetsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI) instanceof AssetsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI) : AssetsPackage.eINSTANCE);
		WorkPackageImpl theWorkPackage = (WorkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkPackage.eNS_URI) instanceof WorkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkPackage.eNS_URI) : WorkPackage.eINSTANCE);

		// Load packages
		theCIMPackage.loadPackage();

		// Fix loaded packages
		theAssetModelsPackage.fixPackageContents();
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
		theInfWorkPackage.fixPackageContents();
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
		thePaymentMeteringPackage.fixPackageContents();
		theCustomersPackage.fixPackageContents();
		theLoadControlPackage.fixPackageContents();
		theAssetsPackage.fixPackageContents();
		theWorkPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theAssetModelsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AssetModelsPackage.eNS_URI, theAssetModelsPackage);
		return theAssetModelsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConductorInfo() {
		if (conductorInfoEClass == null) {
			conductorInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(1);
		}
		return conductorInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConductorInfo_ConductorSegments() {
        return (EReference)getConductorInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConductorInfo_PhaseCount() {
        return (EAttribute)getConductorInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConductorInfo_Insulated() {
        return (EAttribute)getConductorInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConductorInfo_InsulationThickness() {
        return (EAttribute)getConductorInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConductorInfo_Usage() {
        return (EAttribute)getConductorInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConductorInfo_WireArrangements() {
        return (EReference)getConductorInfo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConductorInfo_InsulationMaterial() {
        return (EAttribute)getConductorInfo().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWireType() {
		if (wireTypeEClass == null) {
			wireTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(2);
		}
		return wireTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWireType_RAC75() {
        return (EAttribute)getWireType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWireType_RAC50() {
        return (EAttribute)getWireType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWireType_Radius() {
        return (EAttribute)getWireType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWireType_ConcentricNeutralCableInfos() {
        return (EReference)getWireType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWireType_StrandCount() {
        return (EAttribute)getWireType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWireType_CoreRadius() {
        return (EAttribute)getWireType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWireType_RAC25() {
        return (EAttribute)getWireType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWireType_RDC20() {
        return (EAttribute)getWireType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWireType_SizeDescription() {
        return (EAttribute)getWireType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWireType_CoreStrandCount() {
        return (EAttribute)getWireType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWireType_WireArrangements() {
        return (EReference)getWireType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWireType_RatedCurrent() {
        return (EAttribute)getWireType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWireType_Gmr() {
        return (EAttribute)getWireType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWireType_Material() {
        return (EAttribute)getWireType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcentricNeutralCableInfo() {
		if (concentricNeutralCableInfoEClass == null) {
			concentricNeutralCableInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(3);
		}
		return concentricNeutralCableInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcentricNeutralCableInfo_DiameterOverNeutral() {
        return (EAttribute)getConcentricNeutralCableInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcentricNeutralCableInfo_NeutralStrandCount() {
        return (EAttribute)getConcentricNeutralCableInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcentricNeutralCableInfo_WireType() {
        return (EReference)getConcentricNeutralCableInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWindingInfo() {
		if (windingInfoEClass == null) {
			windingInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(4);
		}
		return windingInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindingInfo_EmergencyS() {
        return (EAttribute)getWindingInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindingInfo_PhaseAngle() {
        return (EAttribute)getWindingInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWindingInfo_WindingTests() {
        return (EReference)getWindingInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWindingInfo_Windings() {
        return (EReference)getWindingInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindingInfo_RatedS() {
        return (EAttribute)getWindingInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindingInfo_RatedU() {
        return (EAttribute)getWindingInfo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindingInfo_R() {
        return (EAttribute)getWindingInfo().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindingInfo_SequenceNumber() {
        return (EAttribute)getWindingInfo().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindingInfo_ShortTermS() {
        return (EAttribute)getWindingInfo().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWindingInfo_ToWindingSpecs() {
        return (EReference)getWindingInfo().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindingInfo_ConnectionKind() {
        return (EAttribute)getWindingInfo().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindingInfo_InsulationU() {
        return (EAttribute)getWindingInfo().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWindingInfo_TransformerInfo() {
        return (EReference)getWindingInfo().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverheadConductorInfo() {
		if (overheadConductorInfoEClass == null) {
			overheadConductorInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(5);
		}
		return overheadConductorInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverheadConductorInfo_NeutralInsulationThickness() {
        return (EAttribute)getOverheadConductorInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverheadConductorInfo_PhaseConductorSpacing() {
        return (EAttribute)getOverheadConductorInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverheadConductorInfo_PhaseConductorCount() {
        return (EAttribute)getOverheadConductorInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOverheadConductorInfo_MountingPoint() {
        return (EReference)getOverheadConductorInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToWindingSpec() {
		if (toWindingSpecEClass == null) {
			toWindingSpecEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(6);
		}
		return toWindingSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToWindingSpec_Voltage() {
        return (EAttribute)getToWindingSpec().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToWindingSpec_OpenCircuitTests() {
        return (EReference)getToWindingSpec().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToWindingSpec_ToWinding() {
        return (EReference)getToWindingSpec().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToWindingSpec_ToTapStep() {
        return (EAttribute)getToWindingSpec().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToWindingSpec_PhaseShift() {
        return (EAttribute)getToWindingSpec().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToWindingSpec_ShortCircuitTests() {
        return (EReference)getToWindingSpec().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssetModel() {
		if (assetModelEClass == null) {
			assetModelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(7);
		}
		return assetModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssetModel_ModelVersion() {
        return (EAttribute)getAssetModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssetModel_AssetInfo() {
        return (EReference)getAssetModel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssetModel_ModelNumber() {
        return (EAttribute)getAssetModel().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssetModel_AssetModelCatalogueItems() {
        return (EReference)getAssetModel().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssetModel_TypeAsset() {
        return (EReference)getAssetModel().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssetModel_CorporateStandardKind() {
        return (EAttribute)getAssetModel().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssetModel_ErpInventoryCounts() {
        return (EReference)getAssetModel().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssetModel_UsageKind() {
        return (EAttribute)getAssetModel().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssetModel_WeightTotal() {
        return (EAttribute)getAssetModel().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCableInfo() {
		if (cableInfoEClass == null) {
			cableInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(8);
		}
		return cableInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCableInfo_SheathAsNeutral() {
        return (EAttribute)getCableInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCableInfo_IsStrandFill() {
        return (EAttribute)getCableInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCableInfo_OuterJacketKind() {
        return (EAttribute)getCableInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCableInfo_ConstructionKind() {
        return (EAttribute)getCableInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCableInfo_DiameterOverScreen() {
        return (EAttribute)getCableInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCableInfo_NominalTemperature() {
        return (EAttribute)getCableInfo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCableInfo_DiameterOverJacket() {
        return (EAttribute)getCableInfo().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCableInfo_DiameterOverCore() {
        return (EAttribute)getCableInfo().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCableInfo_DiameterOverInsulation() {
        return (EAttribute)getCableInfo().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCableInfo_ShieldMaterial() {
        return (EAttribute)getCableInfo().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCableInfo_DuctBankInfo() {
        return (EReference)getCableInfo().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenCircuitTest() {
		if (openCircuitTestEClass == null) {
			openCircuitTestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(9);
		}
		return openCircuitTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenCircuitTest_NoLoadLoss() {
        return (EAttribute)getOpenCircuitTest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenCircuitTest_ExcitingCurrent() {
        return (EAttribute)getOpenCircuitTest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenCircuitTest_ExcitingCurrentZero() {
        return (EAttribute)getOpenCircuitTest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenCircuitTest_MeasuredWindingSpecs() {
        return (EReference)getOpenCircuitTest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenCircuitTest_NoLoadLossZero() {
        return (EAttribute)getOpenCircuitTest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistributionWindingTest() {
		if (distributionWindingTestEClass == null) {
			distributionWindingTestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(10);
		}
		return distributionWindingTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistributionWindingTest_FromWinding() {
        return (EReference)getDistributionWindingTest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistributionWindingTest_FromTapStep() {
        return (EAttribute)getDistributionWindingTest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShortCircuitTest() {
		if (shortCircuitTestEClass == null) {
			shortCircuitTestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(11);
		}
		return shortCircuitTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortCircuitTest_LoadLoss() {
        return (EAttribute)getShortCircuitTest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortCircuitTest_LoadLossZero() {
        return (EAttribute)getShortCircuitTest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortCircuitTest_LeakageImpedance() {
        return (EAttribute)getShortCircuitTest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShortCircuitTest_ShortedWindingSpecs() {
        return (EReference)getShortCircuitTest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortCircuitTest_LeakageImpedanceZero() {
        return (EAttribute)getShortCircuitTest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndDeviceModel() {
		if (endDeviceModelEClass == null) {
			endDeviceModelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(12);
		}
		return endDeviceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndDeviceModel_EndDeviceAssets() {
        return (EReference)getEndDeviceModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformerInfo() {
		if (transformerInfoEClass == null) {
			transformerInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(14);
		}
		return transformerInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformerInfo_Transformers() {
        return (EReference)getTransformerInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformerInfo_WindingInfos() {
        return (EReference)getTransformerInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformerInfo_TransformerAssetModels() {
        return (EReference)getTransformerInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformerInfo_TransformerAssets() {
        return (EReference)getTransformerInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWireArrangement() {
		if (wireArrangementEClass == null) {
			wireArrangementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(21);
		}
		return wireArrangementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWireArrangement_WireType() {
        return (EReference)getWireArrangement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWireArrangement_ConductorInfo() {
        return (EReference)getWireArrangement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWireArrangement_MountingPointX() {
        return (EAttribute)getWireArrangement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWireArrangement_MountingPointY() {
        return (EAttribute)getWireArrangement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWireArrangement_Position() {
        return (EAttribute)getWireArrangement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTapeShieldCableInfo() {
		if (tapeShieldCableInfoEClass == null) {
			tapeShieldCableInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(22);
		}
		return tapeShieldCableInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTapeShieldCableInfo_TapeLap() {
        return (EAttribute)getTapeShieldCableInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTapeShieldCableInfo_TapeThickness() {
        return (EAttribute)getTapeShieldCableInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConductorMaterialKind() {
		if (conductorMaterialKindEEnum == null) {
			conductorMaterialKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(0);
		}
		return conductorMaterialKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCorporateStandardKind() {
		if (corporateStandardKindEEnum == null) {
			corporateStandardKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(13);
		}
		return corporateStandardKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssetModelUsageKind() {
		if (assetModelUsageKindEEnum == null) {
			assetModelUsageKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(15);
		}
		return assetModelUsageKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCableOuterJacketKind() {
		if (cableOuterJacketKindEEnum == null) {
			cableOuterJacketKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(16);
		}
		return cableOuterJacketKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConductorUsageKind() {
		if (conductorUsageKindEEnum == null) {
			conductorUsageKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(17);
		}
		return conductorUsageKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCableConstructionKind() {
		if (cableConstructionKindEEnum == null) {
			cableConstructionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(18);
		}
		return cableConstructionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConductorInsulationKind() {
		if (conductorInsulationKindEEnum == null) {
			conductorInsulationKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(19);
		}
		return conductorInsulationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCableShieldMaterialKind() {
		if (cableShieldMaterialKindEEnum == null) {
			cableShieldMaterialKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(20);
		}
		return cableShieldMaterialKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModelsFactory getAssetModelsFactory() {
		return (AssetModelsFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM.IEC61968.AssetModels." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //AssetModelsPackageImpl
