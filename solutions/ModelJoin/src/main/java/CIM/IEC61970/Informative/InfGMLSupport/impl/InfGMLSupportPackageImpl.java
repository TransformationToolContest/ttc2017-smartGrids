/**
 */
package CIM.IEC61970.Informative.InfGMLSupport.impl;

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

import CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportFactory;
import CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage;

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
public class InfGMLSupportPackageImpl extends EPackageImpl implements InfGMLSupportPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlLabelPlacementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlPolygonGeometryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlColourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlFeatureStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlLineGeometryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlFontEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlPointGeometryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlFillEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlStrokeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlTopologyStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlPolygonSymbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlRasterSymbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlGraphicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlSvgParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlBaseSymbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlPointSymbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlSymbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlMarkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlGeometryStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlTextSymbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlDiagramObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlHaloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlLabelStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlFeatureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlLineSymbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum diagramKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum queryGrammarKindEEnum = null;

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
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InfGMLSupportPackageImpl() {
		super(eNS_URI, InfGMLSupportFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InfGMLSupportPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static InfGMLSupportPackage init() {
		if (isInited) return (InfGMLSupportPackage)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI);

		// Obtain or create and register package
		InfGMLSupportPackageImpl theInfGMLSupportPackage = (InfGMLSupportPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InfGMLSupportPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InfGMLSupportPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CIMPackageImpl theCIMPackage = (CIMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CIMPackage.eNS_URI) instanceof CIMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CIMPackage.eNS_URI) : CIMPackage.eINSTANCE);
		IEC61970PackageImpl theIEC61970Package = (IEC61970PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IEC61970Package.eNS_URI) instanceof IEC61970PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IEC61970Package.eNS_URI) : IEC61970Package.eINSTANCE);
		OperationalLimitsPackageImpl theOperationalLimitsPackage = (OperationalLimitsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI) instanceof OperationalLimitsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI) : OperationalLimitsPackage.eINSTANCE);
		EnergySchedulingPackageImpl theEnergySchedulingPackage = (EnergySchedulingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnergySchedulingPackage.eNS_URI) instanceof EnergySchedulingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnergySchedulingPackage.eNS_URI) : EnergySchedulingPackage.eINSTANCE);
		InfERPSupportPackageImpl theInfERPSupportPackage = (InfERPSupportPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI) instanceof InfERPSupportPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI) : InfERPSupportPackage.eINSTANCE);
		InfAssetModelsPackageImpl theInfAssetModelsPackage = (InfAssetModelsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfAssetModelsPackage.eNS_URI) instanceof InfAssetModelsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfAssetModelsPackage.eNS_URI) : InfAssetModelsPackage.eINSTANCE);
		InfAssetsPackageImpl theInfAssetsPackage = (InfAssetsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI) instanceof InfAssetsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI) : InfAssetsPackage.eINSTANCE);
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
		PaymentMeteringPackageImpl thePaymentMeteringPackage = (PaymentMeteringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI) instanceof PaymentMeteringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI) : PaymentMeteringPackage.eINSTANCE);
		CustomersPackageImpl theCustomersPackage = (CustomersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) instanceof CustomersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) : CustomersPackage.eINSTANCE);
		LoadControlPackageImpl theLoadControlPackage = (LoadControlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LoadControlPackage.eNS_URI) instanceof LoadControlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LoadControlPackage.eNS_URI) : LoadControlPackage.eINSTANCE);
		AssetsPackageImpl theAssetsPackage = (AssetsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI) instanceof AssetsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI) : AssetsPackage.eINSTANCE);
		WorkPackageImpl theWorkPackage = (WorkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkPackage.eNS_URI) instanceof WorkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkPackage.eNS_URI) : WorkPackage.eINSTANCE);

		// Load packages
		theCIMPackage.loadPackage();

		// Fix loaded packages
		theInfGMLSupportPackage.fixPackageContents();
		theCIMPackage.fixPackageContents();
		theIEC61970Package.fixPackageContents();
		theOperationalLimitsPackage.fixPackageContents();
		theEnergySchedulingPackage.fixPackageContents();
		theInfERPSupportPackage.fixPackageContents();
		theInfAssetModelsPackage.fixPackageContents();
		theInfAssetsPackage.fixPackageContents();
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
		thePaymentMeteringPackage.fixPackageContents();
		theCustomersPackage.fixPackageContents();
		theLoadControlPackage.fixPackageContents();
		theAssetsPackage.fixPackageContents();
		theWorkPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theInfGMLSupportPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InfGMLSupportPackage.eNS_URI, theInfGMLSupportPackage);
		return theInfGMLSupportPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlSelector() {
		if (gmlSelectorEClass == null) {
			gmlSelectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(0);
		}
		return gmlSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlSelector_GmlDiagramObjects() {
        return (EReference)getGmlSelector().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlSelector_ChangeItems() {
        return (EReference)getGmlSelector().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlLabelPlacement() {
		if (gmlLabelPlacementEClass == null) {
			gmlLabelPlacementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(1);
		}
		return gmlLabelPlacementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlLabelPlacement_Type() {
        return (EAttribute)getGmlLabelPlacement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlLabelPlacement_Offset() {
        return (EAttribute)getGmlLabelPlacement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlLabelPlacement_AnchorY() {
        return (EAttribute)getGmlLabelPlacement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlLabelPlacement_AnchorX() {
        return (EAttribute)getGmlLabelPlacement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlLabelPlacement_Rotation() {
        return (EAttribute)getGmlLabelPlacement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlLabelPlacement_DisplacementY() {
        return (EAttribute)getGmlLabelPlacement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlLabelPlacement_DisplacementX() {
        return (EAttribute)getGmlLabelPlacement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlLabelPlacement_GmlTextSymbols() {
        return (EReference)getGmlLabelPlacement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlPolygonGeometry() {
		if (gmlPolygonGeometryEClass == null) {
			gmlPolygonGeometryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(2);
		}
		return gmlPolygonGeometryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlColour() {
		if (gmlColourEClass == null) {
			gmlColourEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(3);
		}
		return gmlColourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlColour_Green() {
        return (EAttribute)getGmlColour().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlColour_GmlStrokes() {
        return (EReference)getGmlColour().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlColour_GmlFonts() {
        return (EReference)getGmlColour().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlColour_Red() {
        return (EAttribute)getGmlColour().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlColour_GmlFills() {
        return (EReference)getGmlColour().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlColour_Blue() {
        return (EAttribute)getGmlColour().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlFeatureStyle() {
		if (gmlFeatureStyleEClass == null) {
			gmlFeatureStyleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(4);
		}
		return gmlFeatureStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlFeatureStyle_FeatureConstraint() {
        return (EAttribute)getGmlFeatureStyle().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlFeatureStyle_GmlSymbols() {
        return (EReference)getGmlFeatureStyle().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlFeatureStyle_SemanticTypeIdentifier() {
        return (EAttribute)getGmlFeatureStyle().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlFeatureStyle_GmlLabelStyles() {
        return (EReference)getGmlFeatureStyle().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlFeatureStyle_Version() {
        return (EAttribute)getGmlFeatureStyle().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlFeatureStyle_GmlGeometryStyles() {
        return (EReference)getGmlFeatureStyle().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlFeatureStyle_FeatureTypeName() {
        return (EAttribute)getGmlFeatureStyle().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlFeatureStyle_QueryGrammar() {
        return (EAttribute)getGmlFeatureStyle().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlFeatureStyle_FeatureType() {
        return (EAttribute)getGmlFeatureStyle().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlFeatureStyle_BaseType() {
        return (EAttribute)getGmlFeatureStyle().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlFeatureStyle_GmlFeatureTypes() {
        return (EReference)getGmlFeatureStyle().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlFeatureStyle_GmlTobologyStyles() {
        return (EReference)getGmlFeatureStyle().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlLineGeometry() {
		if (gmlLineGeometryEClass == null) {
			gmlLineGeometryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(5);
		}
		return gmlLineGeometryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlLineGeometry_SourceSide() {
        return (EAttribute)getGmlLineGeometry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlFont() {
		if (gmlFontEClass == null) {
			gmlFontEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(6);
		}
		return gmlFontEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlFont_Weight() {
        return (EAttribute)getGmlFont().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlFont_GmlTextSymbols() {
        return (EReference)getGmlFont().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlFont_Family() {
        return (EAttribute)getGmlFont().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlFont_Style() {
        return (EAttribute)getGmlFont().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlFont_AbsoluteSize() {
        return (EAttribute)getGmlFont().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlFont_GmlColour() {
        return (EReference)getGmlFont().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlFont_Size() {
        return (EAttribute)getGmlFont().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlFont_GmlSvgParameters() {
        return (EReference)getGmlFont().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlPointGeometry() {
		if (gmlPointGeometryEClass == null) {
			gmlPointGeometryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(7);
		}
		return gmlPointGeometryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlFill() {
		if (gmlFillEClass == null) {
			gmlFillEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(8);
		}
		return gmlFillEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlFill_GmlPolygonSymbols() {
        return (EReference)getGmlFill().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlFill_GmlSvgParameters() {
        return (EReference)getGmlFill().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlFill_Opacity() {
        return (EAttribute)getGmlFill().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlFill_GmlTextSymbols() {
        return (EReference)getGmlFill().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlFill_GmlMarks() {
        return (EReference)getGmlFill().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlFill_GmlColour() {
        return (EReference)getGmlFill().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlStroke() {
		if (gmlStrokeEClass == null) {
			gmlStrokeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(10);
		}
		return gmlStrokeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlStroke_LineCap() {
        return (EAttribute)getGmlStroke().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlStroke_GmlColour() {
        return (EReference)getGmlStroke().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlStroke_Opacity() {
        return (EAttribute)getGmlStroke().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlStroke_GmlSvgParameters() {
        return (EReference)getGmlStroke().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlStroke_Width() {
        return (EAttribute)getGmlStroke().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlStroke_GmlPolygonSymbols() {
        return (EReference)getGmlStroke().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlStroke_GmlLineSymbols() {
        return (EReference)getGmlStroke().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlStroke_DashArray() {
        return (EAttribute)getGmlStroke().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlStroke_LineStyle() {
        return (EAttribute)getGmlStroke().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlStroke_DashOffset() {
        return (EAttribute)getGmlStroke().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlStroke_GmlMarks() {
        return (EReference)getGmlStroke().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlStroke_Linejoin() {
        return (EAttribute)getGmlStroke().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagram() {
		if (diagramEClass == null) {
			diagramEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(11);
		}
		return diagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_CoordinateSystem() {
        return (EReference)getDiagram().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Kind() {
        return (EAttribute)getDiagram().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_GmlDiagramObjects() {
        return (EReference)getDiagram().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_DesignLocations() {
        return (EReference)getDiagram().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlTopologyStyle() {
		if (gmlTopologyStyleEClass == null) {
			gmlTopologyStyleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(12);
		}
		return gmlTopologyStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlTopologyStyle_GmlLableStyle() {
        return (EReference)getGmlTopologyStyle().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlTopologyStyle_GmlFeatureStyle() {
        return (EReference)getGmlTopologyStyle().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlPolygonSymbol() {
		if (gmlPolygonSymbolEClass == null) {
			gmlPolygonSymbolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(13);
		}
		return gmlPolygonSymbolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlPolygonSymbol_GmlDiagramObject() {
        return (EReference)getGmlPolygonSymbol().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlPolygonSymbol_GmlStroke() {
        return (EReference)getGmlPolygonSymbol().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlPolygonSymbol_GmlFill() {
        return (EReference)getGmlPolygonSymbol().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlRasterSymbol() {
		if (gmlRasterSymbolEClass == null) {
			gmlRasterSymbolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(14);
		}
		return gmlRasterSymbolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlRasterSymbol_GraySourcename() {
        return (EAttribute)getGmlRasterSymbol().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlRasterSymbol_ReliefFactor() {
        return (EAttribute)getGmlRasterSymbol().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlRasterSymbol_Overlapbehaviour() {
        return (EAttribute)getGmlRasterSymbol().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlRasterSymbol_Opacity() {
        return (EAttribute)getGmlRasterSymbol().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlRasterSymbol_GreenSourceName() {
        return (EAttribute)getGmlRasterSymbol().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlRasterSymbol_BrighnessOnly() {
        return (EAttribute)getGmlRasterSymbol().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlRasterSymbol_BlueSourcename() {
        return (EAttribute)getGmlRasterSymbol().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlRasterSymbol_GmlDiagramObject() {
        return (EReference)getGmlRasterSymbol().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlRasterSymbol_RedSourcename() {
        return (EAttribute)getGmlRasterSymbol().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlValue() {
		if (gmlValueEClass == null) {
			gmlValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(15);
		}
		return gmlValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlValue_GmlObservation() {
        return (EReference)getGmlValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlValue_DateTime() {
        return (EAttribute)getGmlValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlValue_Value() {
        return (EAttribute)getGmlValue().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlValue_TimePeriod() {
        return (EAttribute)getGmlValue().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlValue_MeasurementValue() {
        return (EReference)getGmlValue().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMap() {
		if (mapEClass == null) {
			mapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(16);
		}
		return mapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_MapLocGrid() {
        return (EAttribute)getMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_PageNumber() {
        return (EAttribute)getMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlGraphic() {
		if (gmlGraphicEClass == null) {
			gmlGraphicEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(17);
		}
		return gmlGraphicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlGraphic_Opacity() {
        return (EAttribute)getGmlGraphic().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlGraphic_MinSize() {
        return (EAttribute)getGmlGraphic().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlGraphic_SymbolID() {
        return (EAttribute)getGmlGraphic().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlGraphic_XScale() {
        return (EAttribute)getGmlGraphic().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlGraphic_Size() {
        return (EAttribute)getGmlGraphic().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlGraphic_YScale() {
        return (EAttribute)getGmlGraphic().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlGraphic_GmlMarks() {
        return (EReference)getGmlGraphic().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlGraphic_GmlPointSymbols() {
        return (EReference)getGmlGraphic().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlGraphic_Rotation() {
        return (EAttribute)getGmlGraphic().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlSvgParameter() {
		if (gmlSvgParameterEClass == null) {
			gmlSvgParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(18);
		}
		return gmlSvgParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlSvgParameter_GmlStokes() {
        return (EReference)getGmlSvgParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlSvgParameter_GmlFills() {
        return (EReference)getGmlSvgParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlSvgParameter_Value() {
        return (EAttribute)getGmlSvgParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlSvgParameter_GmlFonts() {
        return (EReference)getGmlSvgParameter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlSvgParameter_Attribute() {
        return (EAttribute)getGmlSvgParameter().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlBaseSymbol() {
		if (gmlBaseSymbolEClass == null) {
			gmlBaseSymbolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(19);
		}
		return gmlBaseSymbolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlBaseSymbol_GmlSymbols() {
        return (EReference)getGmlBaseSymbol().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlPointSymbol() {
		if (gmlPointSymbolEClass == null) {
			gmlPointSymbolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(20);
		}
		return gmlPointSymbolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlPointSymbol_GmlGraphic() {
        return (EReference)getGmlPointSymbol().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlPointSymbol_GmlDiagramObject() {
        return (EReference)getGmlPointSymbol().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlSymbol() {
		if (gmlSymbolEClass == null) {
			gmlSymbolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(21);
		}
		return gmlSymbolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlSymbol_Level() {
        return (EAttribute)getGmlSymbol().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlSymbol_GmlFeatureStyles() {
        return (EReference)getGmlSymbol().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlSymbol_Type() {
        return (EAttribute)getGmlSymbol().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlSymbol_Version() {
        return (EAttribute)getGmlSymbol().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlSymbol_GmlBaseSymbol() {
        return (EReference)getGmlSymbol().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlMark() {
		if (gmlMarkEClass == null) {
			gmlMarkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(22);
		}
		return gmlMarkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlMark_GmlGraphics() {
        return (EReference)getGmlMark().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlMark_GmlFIlls() {
        return (EReference)getGmlMark().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlMark_WellKnownName() {
        return (EAttribute)getGmlMark().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlMark_GmlStrokes() {
        return (EReference)getGmlMark().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlPosition() {
		if (gmlPositionEClass == null) {
			gmlPositionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(23);
		}
		return gmlPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlGeometryStyle() {
		if (gmlGeometryStyleEClass == null) {
			gmlGeometryStyleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(24);
		}
		return gmlGeometryStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlGeometryStyle_GmlLabelStyle() {
        return (EReference)getGmlGeometryStyle().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlGeometryStyle_GmlFeatureStyle() {
        return (EReference)getGmlGeometryStyle().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlGeometryStyle_GeometryType() {
        return (EAttribute)getGmlGeometryStyle().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlGeometryStyle_Symbol() {
        return (EAttribute)getGmlGeometryStyle().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlGeometryStyle_GeometryProperty() {
        return (EAttribute)getGmlGeometryStyle().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlObservation() {
		if (gmlObservationEClass == null) {
			gmlObservationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(25);
		}
		return gmlObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlObservation_GmlDiagramObjects() {
        return (EReference)getGmlObservation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlObservation_Target() {
        return (EAttribute)getGmlObservation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlObservation_DateTime() {
        return (EAttribute)getGmlObservation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlObservation_ChangeItems() {
        return (EReference)getGmlObservation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlObservation_ResultOf() {
        return (EAttribute)getGmlObservation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlObservation_Using() {
        return (EAttribute)getGmlObservation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlObservation_GmlValues() {
        return (EReference)getGmlObservation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlTextSymbol() {
		if (gmlTextSymbolEClass == null) {
			gmlTextSymbolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(26);
		}
		return gmlTextSymbolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlTextSymbol_GmlHalo() {
        return (EReference)getGmlTextSymbol().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlTextSymbol_GmlFont() {
        return (EReference)getGmlTextSymbol().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlTextSymbol_GmlFill() {
        return (EReference)getGmlTextSymbol().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlTextSymbol_Property() {
        return (EAttribute)getGmlTextSymbol().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlTextSymbol_Label() {
        return (EAttribute)getGmlTextSymbol().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlTextSymbol_MinFontSize() {
        return (EAttribute)getGmlTextSymbol().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlTextSymbol_FieldID() {
        return (EAttribute)getGmlTextSymbol().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlTextSymbol_GmlDiagramObject() {
        return (EReference)getGmlTextSymbol().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlTextSymbol_GmlLabelPlacement() {
        return (EReference)getGmlTextSymbol().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlTextSymbol_LabelType() {
        return (EAttribute)getGmlTextSymbol().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlDiagramObject() {
		if (gmlDiagramObjectEClass == null) {
			gmlDiagramObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(27);
		}
		return gmlDiagramObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlDiagramObject_GmlRasterSymbols() {
        return (EReference)getGmlDiagramObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlDiagramObject_Diagrams() {
        return (EReference)getGmlDiagramObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlDiagramObject_GmlPointSymbols() {
        return (EReference)getGmlDiagramObject().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlDiagramObject_GmlPolygonSymbols() {
        return (EReference)getGmlDiagramObject().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlDiagramObject_GmlLineSymbols() {
        return (EReference)getGmlDiagramObject().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlDiagramObject_GmlTextSymbols() {
        return (EReference)getGmlDiagramObject().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlDiagramObject_CoordinateSystems() {
        return (EReference)getGmlDiagramObject().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlDiagramObject_GmlObservatins() {
        return (EReference)getGmlDiagramObject().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlDiagramObject_GmlSelectors() {
        return (EReference)getGmlDiagramObject().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlHalo() {
		if (gmlHaloEClass == null) {
			gmlHaloEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(29);
		}
		return gmlHaloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlHalo_GmlTextSymbols() {
        return (EReference)getGmlHalo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlHalo_Opacity() {
        return (EAttribute)getGmlHalo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlHalo_Radius() {
        return (EAttribute)getGmlHalo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlLabelStyle() {
		if (gmlLabelStyleEClass == null) {
			gmlLabelStyleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(30);
		}
		return gmlLabelStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlLabelStyle_Style() {
        return (EAttribute)getGmlLabelStyle().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlLabelStyle_GmlFeatureStyle() {
        return (EReference)getGmlLabelStyle().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlLabelStyle_Transform() {
        return (EAttribute)getGmlLabelStyle().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlLabelStyle_LabelExpression() {
        return (EAttribute)getGmlLabelStyle().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlLabelStyle_GmlGeometryStyles() {
        return (EReference)getGmlLabelStyle().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlLabelStyle_GmlTopologyStyles() {
        return (EReference)getGmlLabelStyle().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlFeatureType() {
		if (gmlFeatureTypeEClass == null) {
			gmlFeatureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(31);
		}
		return gmlFeatureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlFeatureType_GmlFeatureStyles() {
        return (EReference)getGmlFeatureType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlLineSymbol() {
		if (gmlLineSymbolEClass == null) {
			gmlLineSymbolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(32);
		}
		return gmlLineSymbolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlLineSymbol_GmlDiagramObject() {
        return (EReference)getGmlLineSymbol().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGmlLineSymbol_GmlStroke() {
        return (EReference)getGmlLineSymbol().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGmlLineSymbol_SourceSide() {
        return (EAttribute)getGmlLineSymbol().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiagramKind() {
		if (diagramKindEEnum == null) {
			diagramKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(9);
		}
		return diagramKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQueryGrammarKind() {
		if (queryGrammarKindEEnum == null) {
			queryGrammarKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(28);
		}
		return queryGrammarKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfGMLSupportFactory getInfGMLSupportFactory() {
		return (InfGMLSupportFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM.IEC61970.Informative.InfGMLSupport." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //InfGMLSupportPackageImpl
