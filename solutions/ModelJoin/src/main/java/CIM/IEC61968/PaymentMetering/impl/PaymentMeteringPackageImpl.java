/**
 */
package CIM.IEC61968.PaymentMetering.impl;

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

import CIM.IEC61968.Metering.MeteringPackage;

import CIM.IEC61968.Metering.impl.MeteringPackageImpl;

import CIM.IEC61968.PaymentMetering.PaymentMeteringFactory;
import CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;

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
public class PaymentMeteringPackageImpl extends EPackageImpl implements PaymentMeteringPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cashierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tariffProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass merchantAgreementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vendorShiftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chequeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auxiliaryAgreementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shiftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consumptionTariffIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bankAccountDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceSupplierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountMovementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointOfSaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auxiliaryAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountingUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeTariffIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cashierShiftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass merchantAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tenderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vendorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transactionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supplierKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum chargeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tenderKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum creditKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum chequeKindEEnum = null;

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
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PaymentMeteringPackageImpl() {
		super(eNS_URI, PaymentMeteringFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PaymentMeteringPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static PaymentMeteringPackage init() {
		if (isInited) return (PaymentMeteringPackage)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI);

		// Obtain or create and register package
		PaymentMeteringPackageImpl thePaymentMeteringPackage = (PaymentMeteringPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PaymentMeteringPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PaymentMeteringPackageImpl());

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
		AssetModelsPackageImpl theAssetModelsPackage = (AssetModelsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI) instanceof AssetModelsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI) : AssetModelsPackage.eINSTANCE);
		CustomersPackageImpl theCustomersPackage = (CustomersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) instanceof CustomersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) : CustomersPackage.eINSTANCE);
		LoadControlPackageImpl theLoadControlPackage = (LoadControlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LoadControlPackage.eNS_URI) instanceof LoadControlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LoadControlPackage.eNS_URI) : LoadControlPackage.eINSTANCE);
		AssetsPackageImpl theAssetsPackage = (AssetsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI) instanceof AssetsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI) : AssetsPackage.eINSTANCE);
		WorkPackageImpl theWorkPackage = (WorkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkPackage.eNS_URI) instanceof WorkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkPackage.eNS_URI) : WorkPackage.eINSTANCE);

		// Load packages
		theCIMPackage.loadPackage();

		// Fix loaded packages
		thePaymentMeteringPackage.fixPackageContents();
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
		theAssetModelsPackage.fixPackageContents();
		theCustomersPackage.fixPackageContents();
		theLoadControlPackage.fixPackageContents();
		theAssetsPackage.fixPackageContents();
		theWorkPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		thePaymentMeteringPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PaymentMeteringPackage.eNS_URI, thePaymentMeteringPackage);
		return thePaymentMeteringPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCashier() {
		if (cashierEClass == null) {
			cashierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(0);
		}
		return cashierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCashier_CashierShifts() {
        return (EReference)getCashier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCashier_ElectronicAddress() {
        return (EReference)getCashier().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCashier_Vendor() {
        return (EReference)getCashier().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransactor() {
		if (transactorEClass == null) {
			transactorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(1);
		}
		return transactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransactor_MerchantAccounts() {
        return (EReference)getTransactor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTariffProfile() {
		if (tariffProfileEClass == null) {
			tariffProfileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(2);
		}
		return tariffProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTariffProfile_TariffCycle() {
        return (EAttribute)getTariffProfile().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTariffProfile_TimeTariffIntervals() {
        return (EReference)getTariffProfile().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTariffProfile_Tariffs() {
        return (EReference)getTariffProfile().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTariffProfile_ConsumptionTariffIntervals() {
        return (EReference)getTariffProfile().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMerchantAgreement() {
		if (merchantAgreementEClass == null) {
			merchantAgreementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(4);
		}
		return merchantAgreementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMerchantAgreement_MerchantAccounts() {
        return (EReference)getMerchantAgreement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVendorShift() {
		if (vendorShiftEClass == null) {
			vendorShiftEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(7);
		}
		return vendorShiftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVendorShift_Receipts() {
        return (EReference)getVendorShift().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendorShift_MerchantDebitAmount() {
        return (EAttribute)getVendorShift().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVendorShift_Vendor() {
        return (EReference)getVendorShift().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVendorShift_Transactions() {
        return (EReference)getVendorShift().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVendorShift_MerchantAccount() {
        return (EReference)getVendorShift().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendorShift_Posted() {
        return (EAttribute)getVendorShift().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransaction() {
		if (transactionEClass == null) {
			transactionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(8);
		}
		return transactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_Kind() {
        return (EAttribute)getTransaction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_UserAttributes() {
        return (EReference)getTransaction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_ServiceUnitsError() {
        return (EAttribute)getTransaction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_ReversedId() {
        return (EAttribute)getTransaction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_MeterAsset() {
        return (EReference)getTransaction().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_Line() {
        return (EReference)getTransaction().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_ReceiverReference() {
        return (EAttribute)getTransaction().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_DonorReference() {
        return (EAttribute)getTransaction().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_VendorShift() {
        return (EReference)getTransaction().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_CashierShift() {
        return (EReference)getTransaction().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_AuxiliaryAccount() {
        return (EReference)getTransaction().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_PricingStructure() {
        return (EReference)getTransaction().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_ServiceUnitsEnergy() {
        return (EAttribute)getTransaction().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_CustomerAccount() {
        return (EReference)getTransaction().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_Receipt() {
        return (EReference)getTransaction().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_DiverseReference() {
        return (EAttribute)getTransaction().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheque() {
		if (chequeEClass == null) {
			chequeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(9);
		}
		return chequeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheque_MicrNumber() {
        return (EAttribute)getCheque().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheque_Date() {
        return (EAttribute)getCheque().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheque_ChequeNumber() {
        return (EAttribute)getCheque().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheque_Kind() {
        return (EAttribute)getCheque().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheque_BankAccountDetail() {
        return (EReference)getCheque().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheque_Tender() {
        return (EReference)getCheque().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuxiliaryAgreement() {
		if (auxiliaryAgreementEClass == null) {
			auxiliaryAgreementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(10);
		}
		return auxiliaryAgreementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuxiliaryAgreement_CustomerAgreement() {
        return (EReference)getAuxiliaryAgreement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuxiliaryAgreement_AuxCycle() {
        return (EAttribute)getAuxiliaryAgreement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuxiliaryAgreement_AuxRef() {
        return (EAttribute)getAuxiliaryAgreement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuxiliaryAgreement_SubCategory() {
        return (EAttribute)getAuxiliaryAgreement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuxiliaryAgreement_MinAmount() {
        return (EAttribute)getAuxiliaryAgreement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuxiliaryAgreement_VendPortion() {
        return (EAttribute)getAuxiliaryAgreement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuxiliaryAgreement_AuxPriorityCode() {
        return (EAttribute)getAuxiliaryAgreement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuxiliaryAgreement_ArrearsInterest() {
        return (EAttribute)getAuxiliaryAgreement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuxiliaryAgreement_FixedAmount() {
        return (EAttribute)getAuxiliaryAgreement().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuxiliaryAgreement_PayCycle() {
        return (EAttribute)getAuxiliaryAgreement().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuxiliaryAgreement_AuxiliaryAccounts() {
        return (EReference)getAuxiliaryAgreement().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuxiliaryAgreement_VendPortionArrear() {
        return (EAttribute)getAuxiliaryAgreement().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShift() {
		if (shiftEClass == null) {
			shiftEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(12);
		}
		return shiftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShift_TransactionsGrandTotal() {
        return (EAttribute)getShift().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShift_ActivityInterval() {
        return (EReference)getShift().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShift_TransactionSummaries() {
        return (EReference)getShift().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShift_ReceiptsGrandTotalRounding() {
        return (EAttribute)getShift().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShift_TransactionsGrandTotalRounding() {
        return (EAttribute)getShift().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShift_ReceiptsGrandTotalNonBankable() {
        return (EAttribute)getShift().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShift_ReceiptsGrandTotalBankable() {
        return (EAttribute)getShift().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShift_ReceiptSummaries() {
        return (EReference)getShift().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsumptionTariffInterval() {
		if (consumptionTariffIntervalEClass == null) {
			consumptionTariffIntervalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(13);
		}
		return consumptionTariffIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsumptionTariffInterval_TariffProfiles() {
        return (EReference)getConsumptionTariffInterval().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsumptionTariffInterval_SequenceNumber() {
        return (EAttribute)getConsumptionTariffInterval().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsumptionTariffInterval_Charges() {
        return (EReference)getConsumptionTariffInterval().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsumptionTariffInterval_StartValue() {
        return (EAttribute)getConsumptionTariffInterval().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceipt() {
		if (receiptEClass == null) {
			receiptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(14);
		}
		return receiptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceipt_Transactions() {
        return (EReference)getReceipt().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceipt_CashierShift() {
        return (EReference)getReceipt().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceipt_Tenders() {
        return (EReference)getReceipt().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceipt_VendorShift() {
        return (EReference)getReceipt().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReceipt_IsBankable() {
        return (EAttribute)getReceipt().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceipt_Line() {
        return (EReference)getReceipt().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDue() {
		if (dueEClass == null) {
			dueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(15);
		}
		return dueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDue_Interest() {
        return (EAttribute)getDue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDue_Principle() {
        return (EAttribute)getDue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDue_Current() {
        return (EAttribute)getDue().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDue_Arrears() {
        return (EAttribute)getDue().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDue_Charges() {
        return (EAttribute)getDue().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBankAccountDetail() {
		if (bankAccountDetailEClass == null) {
			bankAccountDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(16);
		}
		return bankAccountDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBankAccountDetail_BankName() {
        return (EAttribute)getBankAccountDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBankAccountDetail_AccountNumber() {
        return (EAttribute)getBankAccountDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBankAccountDetail_HolderID() {
        return (EAttribute)getBankAccountDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBankAccountDetail_BranchCode() {
        return (EAttribute)getBankAccountDetail().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBankAccountDetail_HolderName() {
        return (EAttribute)getBankAccountDetail().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineDetail() {
		if (lineDetailEClass == null) {
			lineDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(18);
		}
		return lineDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineDetail_Rounding() {
        return (EAttribute)getLineDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineDetail_Amount() {
        return (EAttribute)getLineDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineDetail_DateTime() {
        return (EAttribute)getLineDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineDetail_Note() {
        return (EAttribute)getLineDetail().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceSupplier() {
		if (serviceSupplierEClass == null) {
			serviceSupplierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(19);
		}
		return serviceSupplierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceSupplier_ServiceDeliveryPoints() {
        return (EReference)getServiceSupplier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceSupplier_BankAccounts() {
        return (EReference)getServiceSupplier().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceSupplier_IssuerIdentificationNumber() {
        return (EAttribute)getServiceSupplier().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceSupplier_Kind() {
        return (EAttribute)getServiceSupplier().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceSupplier_CustomerAgreements() {
        return (EReference)getServiceSupplier().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccountMovement() {
		if (accountMovementEClass == null) {
			accountMovementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(20);
		}
		return accountMovementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountMovement_Reason() {
        return (EAttribute)getAccountMovement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountMovement_Amount() {
        return (EAttribute)getAccountMovement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountMovement_DateTime() {
        return (EAttribute)getAccountMovement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointOfSale() {
		if (pointOfSaleEClass == null) {
			pointOfSaleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(21);
		}
		return pointOfSaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointOfSale_Tokens() {
        return (EReference)getPointOfSale().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointOfSale_Location() {
        return (EAttribute)getPointOfSale().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointOfSale_CashierShifts() {
        return (EReference)getPointOfSale().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointOfSale_Vendor() {
        return (EReference)getPointOfSale().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuxiliaryAccount() {
		if (auxiliaryAccountEClass == null) {
			auxiliaryAccountEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(22);
		}
		return auxiliaryAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuxiliaryAccount_PaymentTransactions() {
        return (EReference)getAuxiliaryAccount().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuxiliaryAccount_Due() {
        return (EReference)getAuxiliaryAccount().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuxiliaryAccount_LastCredit() {
        return (EReference)getAuxiliaryAccount().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuxiliaryAccount_PrincipleAmount() {
        return (EAttribute)getAuxiliaryAccount().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuxiliaryAccount_AuxiliaryAgreement() {
        return (EReference)getAuxiliaryAccount().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuxiliaryAccount_Charges() {
        return (EReference)getAuxiliaryAccount().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuxiliaryAccount_LastDebit() {
        return (EReference)getAuxiliaryAccount().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuxiliaryAccount_Balance() {
        return (EAttribute)getAuxiliaryAccount().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharge() {
		if (chargeEClass == null) {
			chargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(23);
		}
		return chargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharge_AuxiliaryAccounts() {
        return (EReference)getCharge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharge_ParentCharge() {
        return (EReference)getCharge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharge_ConsumptionTariffIntervals() {
        return (EReference)getCharge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharge_ChildCharges() {
        return (EReference)getCharge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharge_Kind() {
        return (EAttribute)getCharge().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharge_TimeTariffIntervals() {
        return (EReference)getCharge().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharge_VariablePortion() {
        return (EAttribute)getCharge().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharge_FixedPortion() {
        return (EReference)getCharge().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccountingUnit() {
		if (accountingUnitEClass == null) {
			accountingUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(24);
		}
		return accountingUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountingUnit_MonetaryUnit() {
        return (EAttribute)getAccountingUnit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountingUnit_EnergyUnit() {
        return (EAttribute)getAccountingUnit().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountingUnit_Value() {
        return (EAttribute)getAccountingUnit().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountingUnit_Multiplier() {
        return (EAttribute)getAccountingUnit().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeTariffInterval() {
		if (timeTariffIntervalEClass == null) {
			timeTariffIntervalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(25);
		}
		return timeTariffIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTariffInterval_StartDateTime() {
        return (EAttribute)getTimeTariffInterval().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTariffInterval_SequenceNumber() {
        return (EAttribute)getTimeTariffInterval().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeTariffInterval_TariffProfiles() {
        return (EReference)getTimeTariffInterval().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeTariffInterval_Charges() {
        return (EReference)getTimeTariffInterval().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCashierShift() {
		if (cashierShiftEClass == null) {
			cashierShiftEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(26);
		}
		return cashierShiftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCashierShift_Cashier() {
        return (EReference)getCashierShift().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCashierShift_PointOfSale() {
        return (EReference)getCashierShift().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCashierShift_Receipts() {
        return (EReference)getCashierShift().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCashierShift_CashFloat() {
        return (EAttribute)getCashierShift().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCashierShift_Transactions() {
        return (EReference)getCashierShift().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMerchantAccount() {
		if (merchantAccountEClass == null) {
			merchantAccountEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(28);
		}
		return merchantAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMerchantAccount_BankStatements() {
        return (EReference)getMerchantAccount().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMerchantAccount_MerchantAgreement() {
        return (EReference)getMerchantAccount().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMerchantAccount_Transactors() {
        return (EReference)getMerchantAccount().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMerchantAccount_ProvisionalBalance() {
        return (EAttribute)getMerchantAccount().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMerchantAccount_CurrentBalance() {
        return (EAttribute)getMerchantAccount().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMerchantAccount_Vendors() {
        return (EReference)getMerchantAccount().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMerchantAccount_VendorShifts() {
        return (EReference)getMerchantAccount().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTender() {
		if (tenderEClass == null) {
			tenderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(29);
		}
		return tenderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTender_Amount() {
        return (EAttribute)getTender().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTender_Change() {
        return (EAttribute)getTender().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTender_Kind() {
        return (EAttribute)getTender().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTender_Receipt() {
        return (EReference)getTender().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTender_Cheque() {
        return (EReference)getTender().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTender_Card() {
        return (EReference)getTender().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVendor() {
		if (vendorEClass == null) {
			vendorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(30);
		}
		return vendorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVendor_PointOfSales() {
        return (EReference)getVendor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVendor_Cashiers() {
        return (EReference)getVendor().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVendor_MerchantAccount() {
        return (EReference)getVendor().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVendor_BankStatements() {
        return (EReference)getVendor().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVendor_VendorShifts() {
        return (EReference)getVendor().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCard() {
		if (cardEClass == null) {
			cardEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(31);
		}
		return cardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_CvNumber() {
        return (EAttribute)getCard().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_ExpiryDate() {
        return (EAttribute)getCard().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Pan() {
        return (EAttribute)getCard().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_AccountHolderName() {
        return (EAttribute)getCard().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_Tender() {
        return (EReference)getCard().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransactionKind() {
		if (transactionKindEEnum == null) {
			transactionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(3);
		}
		return transactionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSupplierKind() {
		if (supplierKindEEnum == null) {
			supplierKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(5);
		}
		return supplierKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChargeKind() {
		if (chargeKindEEnum == null) {
			chargeKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(6);
		}
		return chargeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTenderKind() {
		if (tenderKindEEnum == null) {
			tenderKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(11);
		}
		return tenderKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCreditKind() {
		if (creditKindEEnum == null) {
			creditKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(17);
		}
		return creditKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChequeKind() {
		if (chequeKindEEnum == null) {
			chequeKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(27);
		}
		return chequeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMeteringFactory getPaymentMeteringFactory() {
		return (PaymentMeteringFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM.IEC61968.PaymentMetering." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //PaymentMeteringPackageImpl
