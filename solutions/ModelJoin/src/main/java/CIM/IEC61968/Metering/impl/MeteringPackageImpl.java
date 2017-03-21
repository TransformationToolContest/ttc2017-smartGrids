/**
 */
package CIM.IEC61968.Metering.impl;

import CIM.CIMPackage;

import CIM.IEC61968.AssetModels.AssetModelsPackage;

import CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl;

import CIM.IEC61968.Assets.AssetsPackage;

import CIM.IEC61968.Assets.impl.AssetsPackageImpl;

import CIM.IEC61968.Common.CommonPackage;

import CIM.IEC61968.Common.impl.CommonPackageImpl;

import CIM.IEC61968.Customers.CustomersPackage;

import CIM.IEC61968.Customers.impl.CustomersPackageImpl;

import CIM.IEC61968.IEC61968Package;

import CIM.IEC61968.LoadControl.LoadControlPackage;

import CIM.IEC61968.LoadControl.impl.LoadControlPackageImpl;

import CIM.IEC61968.Metering.MeteringFactory;
import CIM.IEC61968.Metering.MeteringPackage;

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
public class MeteringPackageImpl extends EPackageImpl implements MeteringPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endDeviceEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meterServiceWorkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endDeviceGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicDemandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalReadingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sdpLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endDeviceAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readingQualityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meterAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meterReadingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass demandResponseProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDeliveryPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endDeviceControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pendingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electricMeteringFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum readingKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum demandKindEEnum = null;

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
	 * @see CIM.IEC61968.Metering.MeteringPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MeteringPackageImpl() {
		super(eNS_URI, MeteringFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MeteringPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static MeteringPackage init() {
		if (isInited) return (MeteringPackage)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI);

		// Obtain or create and register package
		MeteringPackageImpl theMeteringPackage = (MeteringPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MeteringPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MeteringPackageImpl());

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
		WiresExtPackageImpl theWiresExtPackage = (WiresExtPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WiresExtPackage.eNS_URI) instanceof WiresExtPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WiresExtPackage.eNS_URI) : WiresExtPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		AssetModelsPackageImpl theAssetModelsPackage = (AssetModelsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI) instanceof AssetModelsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI) : AssetModelsPackage.eINSTANCE);
		PaymentMeteringPackageImpl thePaymentMeteringPackage = (PaymentMeteringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI) instanceof PaymentMeteringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI) : PaymentMeteringPackage.eINSTANCE);
		CustomersPackageImpl theCustomersPackage = (CustomersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) instanceof CustomersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) : CustomersPackage.eINSTANCE);
		LoadControlPackageImpl theLoadControlPackage = (LoadControlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LoadControlPackage.eNS_URI) instanceof LoadControlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LoadControlPackage.eNS_URI) : LoadControlPackage.eINSTANCE);
		AssetsPackageImpl theAssetsPackage = (AssetsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI) instanceof AssetsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI) : AssetsPackage.eINSTANCE);
		WorkPackageImpl theWorkPackage = (WorkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkPackage.eNS_URI) instanceof WorkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkPackage.eNS_URI) : WorkPackage.eINSTANCE);

		// Load packages
		theCIMPackage.loadPackage();

		// Fix loaded packages
		theMeteringPackage.fixPackageContents();
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
		theWiresExtPackage.fixPackageContents();
		theCommonPackage.fixPackageContents();
		theAssetModelsPackage.fixPackageContents();
		thePaymentMeteringPackage.fixPackageContents();
		theCustomersPackage.fixPackageContents();
		theLoadControlPackage.fixPackageContents();
		theAssetsPackage.fixPackageContents();
		theWorkPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theMeteringPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MeteringPackage.eNS_URI, theMeteringPackage);
		return theMeteringPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndDeviceEvent() {
		if (endDeviceEventEClass == null) {
			endDeviceEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(0);
		}
		return endDeviceEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndDeviceEvent_UserID() {
        return (EAttribute)getEndDeviceEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndDeviceEvent_MeterReading() {
        return (EReference)getEndDeviceEvent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndDeviceEvent_DeviceFunction() {
        return (EReference)getEndDeviceEvent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadingType() {
		if (readingTypeEClass == null) {
			readingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(1);
		}
		return readingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingType_IntervalLength() {
        return (EAttribute)getReadingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadingType_DynamicConfiguration() {
        return (EReference)getReadingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingType_Unit() {
        return (EAttribute)getReadingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingType_DefaultQuality() {
        return (EAttribute)getReadingType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingType_Kind() {
        return (EAttribute)getReadingType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadingType_Register() {
        return (EReference)getReadingType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadingType_IntervalBlocks() {
        return (EReference)getReadingType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadingType_Readings() {
        return (EReference)getReadingType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingType_ChannelNumber() {
        return (EAttribute)getReadingType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingType_Multiplier() {
        return (EAttribute)getReadingType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingType_DefaultValueDataType() {
        return (EAttribute)getReadingType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingType_ReverseChronology() {
        return (EAttribute)getReadingType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadingType_Pending() {
        return (EReference)getReadingType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeterServiceWork() {
		if (meterServiceWorkEClass == null) {
			meterServiceWorkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(2);
		}
		return meterServiceWorkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeterServiceWork_OldMeterAsset() {
        return (EReference)getMeterServiceWork().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeterServiceWork_MeterAsset() {
        return (EReference)getMeterServiceWork().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceFunction() {
		if (deviceFunctionEClass == null) {
			deviceFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(3);
		}
		return deviceFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceFunction_ComEquipmentAsset() {
        return (EReference)getDeviceFunction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceFunction_Disabled() {
        return (EAttribute)getDeviceFunction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceFunction_EndDeviceAsset() {
        return (EReference)getDeviceFunction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceFunction_EndDeviceEvents() {
        return (EReference)getDeviceFunction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceFunction_Registers() {
        return (EReference)getDeviceFunction().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndDeviceGroup() {
		if (endDeviceGroupEClass == null) {
			endDeviceGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(4);
		}
		return endDeviceGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndDeviceGroup_DemandResponseProgram() {
        return (EReference)getEndDeviceGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndDeviceGroup_GroupAddress() {
        return (EAttribute)getEndDeviceGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndDeviceGroup_EndDeviceAssets() {
        return (EReference)getEndDeviceGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndDeviceGroup_EndDeviceControls() {
        return (EReference)getEndDeviceGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicDemand() {
		if (dynamicDemandEClass == null) {
			dynamicDemandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(5);
		}
		return dynamicDemandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicDemand_SubInterval() {
        return (EAttribute)getDynamicDemand().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicDemand_Interval() {
        return (EAttribute)getDynamicDemand().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicDemand_Kind() {
        return (EAttribute)getDynamicDemand().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntervalReading() {
		if (intervalReadingEClass == null) {
			intervalReadingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(6);
		}
		return intervalReadingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntervalReading_Value() {
        return (EAttribute)getIntervalReading().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntervalReading_ReadingQualities() {
        return (EReference)getIntervalReading().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntervalReading_IntervalBlocks() {
        return (EReference)getIntervalReading().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSDPLocation() {
		if (sdpLocationEClass == null) {
			sdpLocationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(7);
		}
		return sdpLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSDPLocation_AccessMethod() {
        return (EAttribute)getSDPLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSDPLocation_Remark() {
        return (EAttribute)getSDPLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSDPLocation_SiteAccessProblem() {
        return (EAttribute)getSDPLocation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSDPLocation_OccupancyDate() {
        return (EAttribute)getSDPLocation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSDPLocation_ServiceDeliveryPoints() {
        return (EReference)getSDPLocation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndDeviceAsset() {
		if (endDeviceAssetEClass == null) {
			endDeviceAssetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(8);
		}
		return endDeviceAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndDeviceAsset_Disconnect() {
        return (EAttribute)getEndDeviceAsset().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndDeviceAsset_RelayCapable() {
        return (EAttribute)getEndDeviceAsset().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndDeviceAsset_Readings() {
        return (EReference)getEndDeviceAsset().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndDeviceAsset_ServiceDeliveryPoint() {
        return (EReference)getEndDeviceAsset().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndDeviceAsset_Metrology() {
        return (EAttribute)getEndDeviceAsset().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndDeviceAsset_RatedVoltage() {
        return (EAttribute)getEndDeviceAsset().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndDeviceAsset_RatedCurrent() {
        return (EAttribute)getEndDeviceAsset().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndDeviceAsset_TimeZoneOffset() {
        return (EAttribute)getEndDeviceAsset().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndDeviceAsset_ServiceLocation() {
        return (EReference)getEndDeviceAsset().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndDeviceAsset_EndDeviceControls() {
        return (EReference)getEndDeviceAsset().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndDeviceAsset_EndDeviceModel() {
        return (EReference)getEndDeviceAsset().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndDeviceAsset_ReadRequest() {
        return (EAttribute)getEndDeviceAsset().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndDeviceAsset_DstEnabled() {
        return (EAttribute)getEndDeviceAsset().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndDeviceAsset_PhaseCount() {
        return (EAttribute)getEndDeviceAsset().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndDeviceAsset_DeviceFunctions() {
        return (EReference)getEndDeviceAsset().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndDeviceAsset_ReverseFlowHandling() {
        return (EAttribute)getEndDeviceAsset().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndDeviceAsset_DemandResponse() {
        return (EAttribute)getEndDeviceAsset().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndDeviceAsset_Customer() {
        return (EReference)getEndDeviceAsset().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndDeviceAsset_AmrSystem() {
        return (EAttribute)getEndDeviceAsset().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndDeviceAsset_LoadControl() {
        return (EAttribute)getEndDeviceAsset().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndDeviceAsset_OutageReport() {
        return (EAttribute)getEndDeviceAsset().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndDeviceAsset_EndDeviceGroups() {
        return (EReference)getEndDeviceAsset().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntervalBlock() {
		if (intervalBlockEClass == null) {
			intervalBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(10);
		}
		return intervalBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntervalBlock_MeterReading() {
        return (EReference)getIntervalBlock().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntervalBlock_IntervalReadings() {
        return (EReference)getIntervalBlock().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntervalBlock_Pending() {
        return (EReference)getIntervalBlock().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntervalBlock_ReadingType() {
        return (EReference)getIntervalBlock().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadingQuality() {
		if (readingQualityEClass == null) {
			readingQualityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(11);
		}
		return readingQualityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadingQuality_IntervalReading() {
        return (EReference)getReadingQuality().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingQuality_Quality() {
        return (EAttribute)getReadingQuality().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadingQuality_Reading() {
        return (EReference)getReadingQuality().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeterAsset() {
		if (meterAssetEClass == null) {
			meterAssetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(12);
		}
		return meterAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeterAsset_MeterAssetModel() {
        return (EReference)getMeterAsset().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeterAsset_VendingTransactions() {
        return (EReference)getMeterAsset().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterAsset_KR() {
        return (EAttribute)getMeterAsset().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeterAsset_MeterServiceWorks() {
        return (EReference)getMeterAsset().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterAsset_KH() {
        return (EAttribute)getMeterAsset().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterAsset_FormNumber() {
        return (EAttribute)getMeterAsset().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeterAsset_MeterReadings() {
        return (EReference)getMeterAsset().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeterAsset_MeterReplacementWorks() {
        return (EReference)getMeterAsset().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeterReading() {
		if (meterReadingEClass == null) {
			meterReadingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(13);
		}
		return meterReadingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeterReading_EndDeviceEvents() {
        return (EReference)getMeterReading().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeterReading_ServiceDeliveryPoint() {
        return (EReference)getMeterReading().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeterReading_CustomerAgreement() {
        return (EReference)getMeterReading().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeterReading_MeterAsset() {
        return (EReference)getMeterReading().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeterReading_ValuesInterval() {
        return (EReference)getMeterReading().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeterReading_Readings() {
        return (EReference)getMeterReading().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeterReading_IntervalBlocks() {
        return (EReference)getMeterReading().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReading() {
		if (readingEClass == null) {
			readingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(14);
		}
		return readingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReading_EndDeviceAsset() {
        return (EReference)getReading().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReading_ReadingQualities() {
        return (EReference)getReading().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReading_MeterReadings() {
        return (EReference)getReading().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReading_Value() {
        return (EAttribute)getReading().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReading_ReadingType() {
        return (EReference)getReading().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDemandResponseProgram() {
		if (demandResponseProgramEClass == null) {
			demandResponseProgramEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(15);
		}
		return demandResponseProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDemandResponseProgram_CustomerAgreements() {
        return (EReference)getDemandResponseProgram().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDemandResponseProgram_ValidityInterval() {
        return (EReference)getDemandResponseProgram().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDemandResponseProgram_EndDeviceGroups() {
        return (EReference)getDemandResponseProgram().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDemandResponseProgram_EndDeviceControls() {
        return (EReference)getDemandResponseProgram().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDemandResponseProgram_Type() {
        return (EAttribute)getDemandResponseProgram().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComFunction() {
		if (comFunctionEClass == null) {
			comFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(16);
		}
		return comFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComFunction_TwoWay() {
        return (EAttribute)getComFunction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComFunction_AmrAddress() {
        return (EAttribute)getComFunction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComFunction_AmrRouter() {
        return (EAttribute)getComFunction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDeliveryPoint() {
		if (serviceDeliveryPointEClass == null) {
			serviceDeliveryPointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(17);
		}
		return serviceDeliveryPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDeliveryPoint_ServiceLocation() {
        return (EReference)getServiceDeliveryPoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDeliveryPoint_PowerQualityPricings() {
        return (EReference)getServiceDeliveryPoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDeliveryPoint_PhaseCode() {
        return (EAttribute)getServiceDeliveryPoint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDeliveryPoint_RatedPower() {
        return (EAttribute)getServiceDeliveryPoint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDeliveryPoint_CustomerAgreement() {
        return (EReference)getServiceDeliveryPoint().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDeliveryPoint_EnergyConsumer() {
        return (EReference)getServiceDeliveryPoint().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDeliveryPoint_ServiceCategory() {
        return (EReference)getServiceDeliveryPoint().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDeliveryPoint_Grounded() {
        return (EAttribute)getServiceDeliveryPoint().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDeliveryPoint_RatedCurrent() {
        return (EAttribute)getServiceDeliveryPoint().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDeliveryPoint_NominalServiceVoltage() {
        return (EAttribute)getServiceDeliveryPoint().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDeliveryPoint_EstimatedLoad() {
        return (EAttribute)getServiceDeliveryPoint().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDeliveryPoint_EndDeviceAssets() {
        return (EReference)getServiceDeliveryPoint().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDeliveryPoint_ServiceSupplier() {
        return (EReference)getServiceDeliveryPoint().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDeliveryPoint_PricingStructures() {
        return (EReference)getServiceDeliveryPoint().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDeliveryPoint_Transformer() {
        return (EReference)getServiceDeliveryPoint().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDeliveryPoint_ServicePriority() {
        return (EAttribute)getServiceDeliveryPoint().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDeliveryPoint_MeterReadings() {
        return (EReference)getServiceDeliveryPoint().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDeliveryPoint_SDPLocations() {
        return (EReference)getServiceDeliveryPoint().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDeliveryPoint_ServiceDeliveryRemark() {
        return (EAttribute)getServiceDeliveryPoint().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDeliveryPoint_CheckBilling() {
        return (EAttribute)getServiceDeliveryPoint().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDeliveryPoint_CtptReference() {
        return (EAttribute)getServiceDeliveryPoint().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegister() {
		if (registerEClass == null) {
			registerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(19);
		}
		return registerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegister_LeftDigitCount() {
        return (EAttribute)getRegister().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegister_ReadingType() {
        return (EReference)getRegister().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegister_DeviceFunction() {
        return (EReference)getRegister().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegister_RightDigitCount() {
        return (EAttribute)getRegister().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndDeviceControl() {
		if (endDeviceControlEClass == null) {
			endDeviceControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(20);
		}
		return endDeviceControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndDeviceControl_ScheduledInterval() {
        return (EReference)getEndDeviceControl().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndDeviceControl_DrProgramMandatory() {
        return (EAttribute)getEndDeviceControl().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndDeviceControl_DrProgramLevel() {
        return (EAttribute)getEndDeviceControl().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndDeviceControl_CustomerAgreement() {
        return (EReference)getEndDeviceControl().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndDeviceControl_EndDeviceAsset() {
        return (EReference)getEndDeviceControl().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndDeviceControl_Type() {
        return (EAttribute)getEndDeviceControl().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndDeviceControl_PriceSignal() {
        return (EAttribute)getEndDeviceControl().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndDeviceControl_EndDeviceGroup() {
        return (EReference)getEndDeviceControl().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndDeviceControl_DemandResponseProgram() {
        return (EReference)getEndDeviceControl().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPending() {
		if (pendingEClass == null) {
			pendingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(21);
		}
		return pendingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPending_Offset() {
        return (EAttribute)getPending().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPending_MultiplyBeforeAdd() {
        return (EAttribute)getPending().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPending_ScalarFloat() {
        return (EAttribute)getPending().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPending_ReadingType() {
        return (EReference)getPending().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPending_ScalarDenominator() {
        return (EAttribute)getPending().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPending_IntervalBlocks() {
        return (EReference)getPending().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPending_ScalarNumerator() {
        return (EAttribute)getPending().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectricMeteringFunction() {
		if (electricMeteringFunctionEClass == null) {
			electricMeteringFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(22);
		}
		return electricMeteringFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricMeteringFunction_DemandMultiplierApplied() {
        return (EAttribute)getElectricMeteringFunction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricMeteringFunction_TransformerCTRatio() {
        return (EAttribute)getElectricMeteringFunction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricMeteringFunction_BillingMultiplier() {
        return (EAttribute)getElectricMeteringFunction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElectricMeteringFunction_MeteringFunctionConfiguration() {
        return (EReference)getElectricMeteringFunction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricMeteringFunction_CurrentRating() {
        return (EAttribute)getElectricMeteringFunction().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricMeteringFunction_TransformerRatiosApplied() {
        return (EAttribute)getElectricMeteringFunction().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricMeteringFunction_KWMultiplier() {
        return (EAttribute)getElectricMeteringFunction().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricMeteringFunction_BillingMultiplierApplied() {
        return (EAttribute)getElectricMeteringFunction().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricMeteringFunction_DemandMultiplier() {
        return (EAttribute)getElectricMeteringFunction().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricMeteringFunction_KWhMultiplier() {
        return (EAttribute)getElectricMeteringFunction().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricMeteringFunction_TransformerVTRatio() {
        return (EAttribute)getElectricMeteringFunction().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricMeteringFunction_VoltageRating() {
        return (EAttribute)getElectricMeteringFunction().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReadingKind() {
		if (readingKindEEnum == null) {
			readingKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(9);
		}
		return readingKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDemandKind() {
		if (demandKindEEnum == null) {
			demandKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(18);
		}
		return demandKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeteringFactory getMeteringFactory() {
		return (MeteringFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM.IEC61968.Metering." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //MeteringPackageImpl
