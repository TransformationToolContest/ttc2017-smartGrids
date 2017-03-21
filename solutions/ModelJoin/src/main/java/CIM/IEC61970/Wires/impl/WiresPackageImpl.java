/**
 */
package CIM.IEC61970.Wires.impl;

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

import CIM.IEC61970.Wires.WiresFactory;
import CIM.IEC61970.Wires.WiresPackage;

import CIM.IEC61970.impl.IEC61970PackageImpl;

import CIM.PackageDependencies.PackageDependenciesPackage;

import CIM.PackageDependencies.impl.PackageDependenciesPackageImpl;

import CIM.impl.CIMPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
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
public class WiresPackageImpl extends EPackageImpl implements WiresPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seriesCompensatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerTransformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jumperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energySourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frequencyConverterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadBreakSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impedanceVariationCurveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tapScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mutualCouplingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcLineSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acLineSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaseTapChangerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energyConsumerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regulatingCondEqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass heatExchangerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticVarCompensatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaseVariationCurveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tapChangerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windingTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fuseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regulatingControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busbarSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resistorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ratioVariationCurveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectifierInverterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformerWindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groundDisconnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voltageControlZoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protectedSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shuntCompensatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conductorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disconnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronousMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass junctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regulationScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactiveCapabilityCurveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ratioTapChangerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum svcControlModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum phaseTapChangerKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum windingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum synchronousMachineTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coolantTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transformerControlModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum synchronousMachineOperatingModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum windingConnectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tapChangerKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum regulatingControlModeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType operatingModeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType compositeSwitchTypeEDataType = null;

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
	 * @see CIM.IEC61970.Wires.WiresPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WiresPackageImpl() {
		super(eNS_URI, WiresFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WiresPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static WiresPackage init() {
		if (isInited) return (WiresPackage)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI);

		// Obtain or create and register package
		WiresPackageImpl theWiresPackage = (WiresPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WiresPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WiresPackageImpl());

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

		// Load packages
		theCIMPackage.loadPackage();

		// Fix loaded packages
		theWiresPackage.fixPackageContents();
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

		// Mark meta-data to indicate it can't be changed
		theWiresPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WiresPackage.eNS_URI, theWiresPackage);
		return theWiresPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeriesCompensator() {
		if (seriesCompensatorEClass == null) {
			seriesCompensatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(0);
		}
		return seriesCompensatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeriesCompensator_R() {
        return (EAttribute)getSeriesCompensator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeriesCompensator_X() {
        return (EAttribute)getSeriesCompensator().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerTransformer() {
		if (powerTransformerEClass == null) {
			powerTransformerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(1);
		}
		return powerTransformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerTransformer_Flowgates() {
        return (EReference)getPowerTransformer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerTransformer_HeatExchanger() {
        return (EReference)getPowerTransformer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerTransformer_TransformerWindings() {
        return (EReference)getPowerTransformer().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerTransformer_MagBaseU() {
        return (EAttribute)getPowerTransformer().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerTransformer_MagSatFlux() {
        return (EAttribute)getPowerTransformer().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerTransformer_BmagSat() {
        return (EAttribute)getPowerTransformer().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitch() {
		if (switchEClass == null) {
			switchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(2);
		}
		return switchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitch_Retained() {
        return (EAttribute)getSwitch().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitch_SwitchOnDate() {
        return (EAttribute)getSwitch().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitch_LoadMgmtFunctions() {
        return (EReference)getSwitch().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitch_ConnectDisconnectFunctions() {
        return (EReference)getSwitch().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitch_NormalOpen() {
        return (EAttribute)getSwitch().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitch_SwitchingOperations() {
        return (EReference)getSwitch().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitch_SwitchSchedules() {
        return (EReference)getSwitch().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitch_SwitchOnCount() {
        return (EAttribute)getSwitch().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitch_CompositeSwitch() {
        return (EReference)getSwitch().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJumper() {
		if (jumperEClass == null) {
			jumperEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(3);
		}
		return jumperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlant() {
		if (plantEClass == null) {
			plantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(5);
		}
		return plantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLine() {
		if (lineEClass == null) {
			lineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(6);
		}
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_TransmissionRightOfWay() {
        return (EReference)getLine().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_Flowgates() {
        return (EReference)getLine().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_Region() {
        return (EReference)getLine().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnergySource() {
		if (energySourceEClass == null) {
			energySourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(9);
		}
		return energySourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergySource_ActivePower() {
        return (EAttribute)getEnergySource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergySource_R() {
        return (EAttribute)getEnergySource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergySource_X() {
        return (EAttribute)getEnergySource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergySource_Rn() {
        return (EAttribute)getEnergySource().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergySource_VoltageMagnitude() {
        return (EAttribute)getEnergySource().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergySource_R0() {
        return (EAttribute)getEnergySource().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergySource_VoltageAngle() {
        return (EAttribute)getEnergySource().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergySource_Xn() {
        return (EAttribute)getEnergySource().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergySource_NominalVoltage() {
        return (EAttribute)getEnergySource().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergySource_X0() {
        return (EAttribute)getEnergySource().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrequencyConverter() {
		if (frequencyConverterEClass == null) {
			frequencyConverterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(10);
		}
		return frequencyConverterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrequencyConverter_OperatingMode() {
        return (EAttribute)getFrequencyConverter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrequencyConverter_Frequency() {
        return (EAttribute)getFrequencyConverter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrequencyConverter_MaxP() {
        return (EAttribute)getFrequencyConverter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrequencyConverter_MaxU() {
        return (EAttribute)getFrequencyConverter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrequencyConverter_MinU() {
        return (EAttribute)getFrequencyConverter().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrequencyConverter_MinP() {
        return (EAttribute)getFrequencyConverter().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		if (connectorEClass == null) {
			connectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(11);
		}
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGround() {
		if (groundEClass == null) {
			groundEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(12);
		}
		return groundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGround_WindingInsulations() {
        return (EReference)getGround().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadBreakSwitch() {
		if (loadBreakSwitchEClass == null) {
			loadBreakSwitchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(13);
		}
		return loadBreakSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadBreakSwitch_RatedCurrent() {
        return (EAttribute)getLoadBreakSwitch().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImpedanceVariationCurve() {
		if (impedanceVariationCurveEClass == null) {
			impedanceVariationCurveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(14);
		}
		return impedanceVariationCurveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpedanceVariationCurve_TapChanger() {
        return (EReference)getImpedanceVariationCurve().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTapSchedule() {
		if (tapScheduleEClass == null) {
			tapScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(15);
		}
		return tapScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTapSchedule_LineDropCompensation() {
        return (EAttribute)getTapSchedule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTapSchedule_TapChanger() {
        return (EReference)getTapSchedule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTapSchedule_LineDropX() {
        return (EAttribute)getTapSchedule().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTapSchedule_LineDropR() {
        return (EAttribute)getTapSchedule().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMutualCoupling() {
		if (mutualCouplingEClass == null) {
			mutualCouplingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(16);
		}
		return mutualCouplingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMutualCoupling_Distance11() {
        return (EAttribute)getMutualCoupling().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMutualCoupling_Distance12() {
        return (EAttribute)getMutualCoupling().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMutualCoupling_B0ch() {
        return (EAttribute)getMutualCoupling().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMutualCoupling_G0ch() {
        return (EAttribute)getMutualCoupling().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMutualCoupling_X0() {
        return (EAttribute)getMutualCoupling().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMutualCoupling_Second_Terminal() {
        return (EReference)getMutualCoupling().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMutualCoupling_R0() {
        return (EAttribute)getMutualCoupling().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMutualCoupling_First_Terminal() {
        return (EReference)getMutualCoupling().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMutualCoupling_Distance22() {
        return (EAttribute)getMutualCoupling().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMutualCoupling_Distance21() {
        return (EAttribute)getMutualCoupling().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDCLineSegment() {
		if (dcLineSegmentEClass == null) {
			dcLineSegmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(17);
		}
		return dcLineSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCLineSegment_DcSegmentResistance() {
        return (EAttribute)getDCLineSegment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCLineSegment_DcSegmentInductance() {
        return (EAttribute)getDCLineSegment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchSchedule() {
		if (switchScheduleEClass == null) {
			switchScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(18);
		}
		return switchScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchSchedule_Switch() {
        return (EReference)getSwitchSchedule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeSwitch() {
		if (compositeSwitchEClass == null) {
			compositeSwitchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(19);
		}
		return compositeSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeSwitch_CompositeSwitchType() {
        return (EAttribute)getCompositeSwitch().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeSwitch_Switches() {
        return (EReference)getCompositeSwitch().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getACLineSegment() {
		if (acLineSegmentEClass == null) {
			acLineSegmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(20);
		}
		return acLineSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACLineSegment_G0ch() {
        return (EAttribute)getACLineSegment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACLineSegment_X() {
        return (EAttribute)getACLineSegment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACLineSegment_Gch() {
        return (EAttribute)getACLineSegment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACLineSegment_R() {
        return (EAttribute)getACLineSegment().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACLineSegment_X0() {
        return (EAttribute)getACLineSegment().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACLineSegment_Bch() {
        return (EAttribute)getACLineSegment().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACLineSegment_R0() {
        return (EAttribute)getACLineSegment().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACLineSegment_B0ch() {
        return (EAttribute)getACLineSegment().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhaseTapChanger() {
		if (phaseTapChangerEClass == null) {
			phaseTapChangerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(21);
		}
		return phaseTapChangerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhaseTapChanger_TransformerWinding() {
        return (EReference)getPhaseTapChanger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhaseTapChanger_WindingConnectionAngle() {
        return (EAttribute)getPhaseTapChanger().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhaseTapChanger_Winding() {
        return (EReference)getPhaseTapChanger().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhaseTapChanger_PhaseTapChangerType() {
        return (EAttribute)getPhaseTapChanger().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhaseTapChanger_StepPhaseShiftIncrement() {
        return (EAttribute)getPhaseTapChanger().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhaseTapChanger_PhaseVariationCurve() {
        return (EReference)getPhaseTapChanger().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhaseTapChanger_VoltageStepIncrementOutOfPhase() {
        return (EAttribute)getPhaseTapChanger().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhaseTapChanger_NominalVoltageOutOfPhase() {
        return (EAttribute)getPhaseTapChanger().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhaseTapChanger_XStepMax() {
        return (EAttribute)getPhaseTapChanger().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhaseTapChanger_XStepMin() {
        return (EAttribute)getPhaseTapChanger().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnergyConsumer() {
		if (energyConsumerEClass == null) {
			energyConsumerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(22);
		}
		return energyConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnergyConsumer_ServiceDeliveryPoints() {
        return (EReference)getEnergyConsumer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnergyConsumer_PowerCutZone() {
        return (EReference)getEnergyConsumer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergyConsumer_Pfixed() {
        return (EAttribute)getEnergyConsumer().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergyConsumer_QfixedPct() {
        return (EAttribute)getEnergyConsumer().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergyConsumer_CustomerCount() {
        return (EAttribute)getEnergyConsumer().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnergyConsumer_LoadResponse() {
        return (EReference)getEnergyConsumer().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergyConsumer_PfixedPct() {
        return (EAttribute)getEnergyConsumer().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergyConsumer_Qfixed() {
        return (EAttribute)getEnergyConsumer().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegulatingCondEq() {
		if (regulatingCondEqEClass == null) {
			regulatingCondEqEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(23);
		}
		return regulatingCondEqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegulatingCondEq_Controls() {
        return (EReference)getRegulatingCondEq().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegulatingCondEq_RegulatingControl() {
        return (EReference)getRegulatingCondEq().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeatExchanger() {
		if (heatExchangerEClass == null) {
			heatExchangerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(24);
		}
		return heatExchangerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeatExchanger_PowerTransformer() {
        return (EReference)getHeatExchanger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticVarCompensator() {
		if (staticVarCompensatorEClass == null) {
			staticVarCompensatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(25);
		}
		return staticVarCompensatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticVarCompensator_SVCControlMode() {
        return (EAttribute)getStaticVarCompensator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticVarCompensator_InductiveRating() {
        return (EAttribute)getStaticVarCompensator().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticVarCompensator_CapacitiveRating() {
        return (EAttribute)getStaticVarCompensator().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticVarCompensator_VoltageSetPoint() {
        return (EAttribute)getStaticVarCompensator().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticVarCompensator_Slope() {
        return (EAttribute)getStaticVarCompensator().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhaseVariationCurve() {
		if (phaseVariationCurveEClass == null) {
			phaseVariationCurveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(26);
		}
		return phaseVariationCurveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhaseVariationCurve_PhaseTapChanger() {
        return (EReference)getPhaseVariationCurve().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTapChanger() {
		if (tapChangerEClass == null) {
			tapChangerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(27);
		}
		return tapChangerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTapChanger_InitialDelay() {
        return (EAttribute)getTapChanger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTapChanger_SubsequentDelay() {
        return (EAttribute)getTapChanger().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTapChanger_TapSchedules() {
        return (EReference)getTapChanger().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTapChanger_LtcFlag() {
        return (EAttribute)getTapChanger().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTapChanger_RegulationStatus() {
        return (EAttribute)getTapChanger().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTapChanger_RegulatingControl() {
        return (EReference)getTapChanger().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTapChanger_NeutralStep() {
        return (EAttribute)getTapChanger().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTapChanger_NeutralU() {
        return (EAttribute)getTapChanger().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTapChanger_LowStep() {
        return (EAttribute)getTapChanger().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTapChanger_HighStep() {
        return (EAttribute)getTapChanger().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTapChanger_StepVoltageIncrement() {
        return (EAttribute)getTapChanger().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTapChanger_ImpedanceVariationCurve() {
        return (EReference)getTapChanger().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTapChanger_SvTapStep() {
        return (EReference)getTapChanger().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTapChanger_NormalStep() {
        return (EAttribute)getTapChanger().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWindingTest() {
		if (windingTestEClass == null) {
			windingTestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(29);
		}
		return windingTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindingTest_FromTapStep() {
        return (EAttribute)getWindingTest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWindingTest_From_TransformerWinding() {
        return (EReference)getWindingTest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindingTest_LeakageImpedance() {
        return (EAttribute)getWindingTest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindingTest_NoLoadLoss() {
        return (EAttribute)getWindingTest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindingTest_PhaseShift() {
        return (EAttribute)getWindingTest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWindingTest_To_TransformerWinding() {
        return (EReference)getWindingTest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindingTest_LoadLoss() {
        return (EAttribute)getWindingTest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindingTest_ToTapStep() {
        return (EAttribute)getWindingTest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindingTest_Voltage() {
        return (EAttribute)getWindingTest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindingTest_ExcitingCurrent() {
        return (EAttribute)getWindingTest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuse() {
		if (fuseEClass == null) {
			fuseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(30);
		}
		return fuseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuse_RatingCurrent() {
        return (EAttribute)getFuse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegulatingControl() {
		if (regulatingControlEClass == null) {
			regulatingControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(31);
		}
		return regulatingControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegulatingControl_Mode() {
        return (EAttribute)getRegulatingControl().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegulatingControl_TapChanger() {
        return (EReference)getRegulatingControl().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegulatingControl_Terminal() {
        return (EReference)getRegulatingControl().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegulatingControl_RegulatingCondEq() {
        return (EReference)getRegulatingControl().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegulatingControl_TargetRange() {
        return (EAttribute)getRegulatingControl().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegulatingControl_TargetValue() {
        return (EAttribute)getRegulatingControl().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegulatingControl_RegulationSchedule() {
        return (EReference)getRegulatingControl().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegulatingControl_Discrete() {
        return (EAttribute)getRegulatingControl().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusbarSection() {
		if (busbarSectionEClass == null) {
			busbarSectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(33);
		}
		return busbarSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusbarSection_VoltageControlZone() {
        return (EReference)getBusbarSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResistor() {
		if (resistorEClass == null) {
			resistorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(35);
		}
		return resistorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRatioVariationCurve() {
		if (ratioVariationCurveEClass == null) {
			ratioVariationCurveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(36);
		}
		return ratioVariationCurveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRatioVariationCurve_RatioTapChanger() {
        return (EReference)getRatioVariationCurve().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectifierInverter() {
		if (rectifierInverterEClass == null) {
			rectifierInverterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(38);
		}
		return rectifierInverterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectifierInverter_MinCompoundVoltage() {
        return (EAttribute)getRectifierInverter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectifierInverter_MinP() {
        return (EAttribute)getRectifierInverter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectifierInverter_MaxU() {
        return (EAttribute)getRectifierInverter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectifierInverter_OperatingMode() {
        return (EAttribute)getRectifierInverter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectifierInverter_Frequency() {
        return (EAttribute)getRectifierInverter().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectifierInverter_MaxP() {
        return (EAttribute)getRectifierInverter().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectifierInverter_CommutatingReactance() {
        return (EAttribute)getRectifierInverter().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectifierInverter_CommutatingResistance() {
        return (EAttribute)getRectifierInverter().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectifierInverter_RatedU() {
        return (EAttribute)getRectifierInverter().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectifierInverter_MinU() {
        return (EAttribute)getRectifierInverter().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectifierInverter_Bridges() {
        return (EAttribute)getRectifierInverter().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectifierInverter_CompoundResistance() {
        return (EAttribute)getRectifierInverter().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreaker() {
		if (breakerEClass == null) {
			breakerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(39);
		}
		return breakerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreaker_RatedCurrent() {
        return (EAttribute)getBreaker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreaker_InTransitTime() {
        return (EAttribute)getBreaker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformerWinding() {
		if (transformerWindingEClass == null) {
			transformerWindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(40);
		}
		return transformerWindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerWinding_G0() {
        return (EAttribute)getTransformerWinding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformerWinding_To_WindingTest() {
        return (EReference)getTransformerWinding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerWinding_Rground() {
        return (EAttribute)getTransformerWinding().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerWinding_Grounded() {
        return (EAttribute)getTransformerWinding().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerWinding_ShortTermS() {
        return (EAttribute)getTransformerWinding().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerWinding_G() {
        return (EAttribute)getTransformerWinding().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerWinding_B() {
        return (EAttribute)getTransformerWinding().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerWinding_X() {
        return (EAttribute)getTransformerWinding().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformerWinding_PhaseTapChanger() {
        return (EReference)getTransformerWinding().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerWinding_R() {
        return (EAttribute)getTransformerWinding().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerWinding_R0() {
        return (EAttribute)getTransformerWinding().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerWinding_B0() {
        return (EAttribute)getTransformerWinding().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformerWinding_PowerTransformer() {
        return (EReference)getTransformerWinding().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerWinding_WindingType() {
        return (EAttribute)getTransformerWinding().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerWinding_X0() {
        return (EAttribute)getTransformerWinding().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerWinding_RatedS() {
        return (EAttribute)getTransformerWinding().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerWinding_RatedU() {
        return (EAttribute)getTransformerWinding().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformerWinding_From_WindingTest() {
        return (EReference)getTransformerWinding().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformerWinding_RatioTapChanger() {
        return (EReference)getTransformerWinding().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerWinding_InsulationU() {
        return (EAttribute)getTransformerWinding().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerWinding_EmergencyS() {
        return (EAttribute)getTransformerWinding().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerWinding_ConnectionType() {
        return (EAttribute)getTransformerWinding().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerWinding_Xground() {
        return (EAttribute)getTransformerWinding().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroundDisconnector() {
		if (groundDisconnectorEClass == null) {
			groundDisconnectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(42);
		}
		return groundDisconnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoltageControlZone() {
		if (voltageControlZoneEClass == null) {
			voltageControlZoneEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(43);
		}
		return voltageControlZoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoltageControlZone_RegulationSchedule() {
        return (EReference)getVoltageControlZone().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoltageControlZone_BusbarSection() {
        return (EReference)getVoltageControlZone().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtectedSwitch() {
		if (protectedSwitchEClass == null) {
			protectedSwitchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(44);
		}
		return protectedSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtectedSwitch_RecloseSequences() {
        return (EReference)getProtectedSwitch().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShuntCompensator() {
		if (shuntCompensatorEClass == null) {
			shuntCompensatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(45);
		}
		return shuntCompensatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShuntCompensator_NormalSections() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShuntCompensator_MinU() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShuntCompensator_B0PerSection() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShuntCompensator_NomQ() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShuntCompensator_NomU() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShuntCompensator_MaximumSections() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShuntCompensator_SwitchOnCount() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShuntCompensator_MaxU() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShuntCompensator_BPerSection() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShuntCompensator_GPerSection() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShuntCompensator_SvShuntCompensatorSections() {
        return (EReference)getShuntCompensator().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShuntCompensator_SwitchOnDate() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShuntCompensator_AVRDelay() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShuntCompensator_VoltageSensitivity() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShuntCompensator_G0PerSection() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShuntCompensator_ReactivePerSection() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConductor() {
		if (conductorEClass == null) {
			conductorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(46);
		}
		return conductorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConductor_Length() {
        return (EAttribute)getConductor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisconnector() {
		if (disconnectorEClass == null) {
			disconnectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(47);
		}
		return disconnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronousMachine() {
		if (synchronousMachineEClass == null) {
			synchronousMachineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(48);
		}
		return synchronousMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_XDirectSync() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_XQuadTrans() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_CoolantCondition() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronousMachine_ReactiveCapabilityCurves() {
        return (EReference)getSynchronousMachine().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_XQuadSubtrans() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_CoolantType() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_CondenserP() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_AVRToManualLag() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_MinQ() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_AVRToManualLead() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_MaxU() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_Damping() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronousMachine_GeneratingUnit() {
        return (EReference)getSynchronousMachine().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_MaxQ() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_R0() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_Type() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_R2() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_ReferencePriority() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_X0() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_X2() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_R() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronousMachine_InitialReactiveCapabilityCurve() {
        return (EReference)getSynchronousMachine().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_XDirectSubtrans() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_X() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_QPercent() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_XQuadSync() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_RatedS() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_ManualToAVR() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_Inertia() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronousMachine_HydroPump() {
        return (EReference)getSynchronousMachine().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_MinU() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_XDirectTrans() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_BaseQ() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_OperatingMode() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronousMachine_PrimeMovers() {
        return (EReference)getSynchronousMachine().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJunction() {
		if (junctionEClass == null) {
			junctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(50);
		}
		return junctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegulationSchedule() {
		if (regulationScheduleEClass == null) {
			regulationScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(51);
		}
		return regulationScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegulationSchedule_LineDropR() {
        return (EAttribute)getRegulationSchedule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegulationSchedule_LineDropX() {
        return (EAttribute)getRegulationSchedule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegulationSchedule_LineDropCompensation() {
        return (EAttribute)getRegulationSchedule().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegulationSchedule_RegulatingControl() {
        return (EReference)getRegulationSchedule().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegulationSchedule_VoltageControlZones() {
        return (EReference)getRegulationSchedule().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReactiveCapabilityCurve() {
		if (reactiveCapabilityCurveEClass == null) {
			reactiveCapabilityCurveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(52);
		}
		return reactiveCapabilityCurveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReactiveCapabilityCurve_InitiallyUsedBySynchronousMachines() {
        return (EReference)getReactiveCapabilityCurve().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReactiveCapabilityCurve_HydrogenPressure() {
        return (EAttribute)getReactiveCapabilityCurve().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReactiveCapabilityCurve_SynchronousMachines() {
        return (EReference)getReactiveCapabilityCurve().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReactiveCapabilityCurve_CoolantTemperature() {
        return (EAttribute)getReactiveCapabilityCurve().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRatioTapChanger() {
		if (ratioTapChangerEClass == null) {
			ratioTapChangerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(54);
		}
		return ratioTapChangerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRatioTapChanger_RatioVariationCurve() {
        return (EReference)getRatioTapChanger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRatioTapChanger_TransformerWinding() {
        return (EReference)getRatioTapChanger().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRatioTapChanger_Winding() {
        return (EReference)getRatioTapChanger().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRatioTapChanger_TculControlMode() {
        return (EAttribute)getRatioTapChanger().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSVCControlMode() {
		if (svcControlModeEEnum == null) {
			svcControlModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(4);
		}
		return svcControlModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPhaseTapChangerKind() {
		if (phaseTapChangerKindEEnum == null) {
			phaseTapChangerKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(7);
		}
		return phaseTapChangerKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWindingType() {
		if (windingTypeEEnum == null) {
			windingTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(8);
		}
		return windingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSynchronousMachineType() {
		if (synchronousMachineTypeEEnum == null) {
			synchronousMachineTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(28);
		}
		return synchronousMachineTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCoolantType() {
		if (coolantTypeEEnum == null) {
			coolantTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(32);
		}
		return coolantTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransformerControlMode() {
		if (transformerControlModeEEnum == null) {
			transformerControlModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(34);
		}
		return transformerControlModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSynchronousMachineOperatingMode() {
		if (synchronousMachineOperatingModeEEnum == null) {
			synchronousMachineOperatingModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(37);
		}
		return synchronousMachineOperatingModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWindingConnection() {
		if (windingConnectionEEnum == null) {
			windingConnectionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(41);
		}
		return windingConnectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTapChangerKind() {
		if (tapChangerKindEEnum == null) {
			tapChangerKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(49);
		}
		return tapChangerKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRegulatingControlModeKind() {
		if (regulatingControlModeKindEEnum == null) {
			regulatingControlModeKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(53);
		}
		return regulatingControlModeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOperatingMode() {
		if (operatingModeEDataType == null) {
			operatingModeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(55);
		}
		return operatingModeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCompositeSwitchType() {
		if (compositeSwitchTypeEDataType == null) {
			compositeSwitchTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(56);
		}
		return compositeSwitchTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiresFactory getWiresFactory() {
		return (WiresFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM.IEC61970.Wires." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //WiresPackageImpl
