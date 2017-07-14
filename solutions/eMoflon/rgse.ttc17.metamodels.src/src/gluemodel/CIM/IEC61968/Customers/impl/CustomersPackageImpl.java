/**
 */
package gluemodel.CIM.IEC61968.Customers.impl;

import gluemodel.CIM.CIMPackage;

import gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage;

import gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelsPackageImpl;

import gluemodel.CIM.IEC61968.Assets.AssetsPackage;

import gluemodel.CIM.IEC61968.Assets.impl.AssetsPackageImpl;

import gluemodel.CIM.IEC61968.Common.CommonPackage;

import gluemodel.CIM.IEC61968.Common.impl.CommonPackageImpl;

import gluemodel.CIM.IEC61968.Customers.CustomersFactory;
import gluemodel.CIM.IEC61968.Customers.CustomersPackage;

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

import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;

import gluemodel.CIM.IEC61970.Informative.InfWork.impl.InfWorkPackageImpl;

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
public class CustomersPackageImpl extends EPackageImpl implements CustomersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pricingStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerAgreementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tariffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum customerKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum revenueKindEEnum = null;

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
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CustomersPackageImpl() {
		super(eNS_URI, CustomersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CustomersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static CustomersPackage init() {
		if (isInited) return (CustomersPackage)EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI);

		// Obtain or create and register package
		CustomersPackageImpl theCustomersPackage = (CustomersPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CustomersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CustomersPackageImpl());

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
		theCustomersPackage.fixPackageContents();
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
		theCustomersPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CustomersPackage.eNS_URI, theCustomersPackage);
		return theCustomersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomer() {
		if (customerEClass == null) {
			customerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI).getEClassifiers().get(0);
		}
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomer_PlannedOutage() {
        return (EReference)getCustomer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomer_EndDeviceAssets() {
        return (EReference)getCustomer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomer_Status() {
        return (EReference)getCustomer().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Kind() {
        return (EAttribute)getCustomer().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomer_TroubleTickets() {
        return (EReference)getCustomer().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomer_ErpPersons() {
        return (EReference)getCustomer().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomer_OutageNotifications() {
        return (EReference)getCustomer().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_SpecialNeed() {
        return (EAttribute)getCustomer().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_PucNumber() {
        return (EAttribute)getCustomer().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomer_Works() {
        return (EReference)getCustomer().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomer_CustomerAgreements() {
        return (EReference)getCustomer().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Vip() {
        return (EAttribute)getCustomer().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceCategory() {
		if (serviceCategoryEClass == null) {
			serviceCategoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI).getEClassifiers().get(2);
		}
		return serviceCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceCategory_SPAccountingFunctions() {
        return (EReference)getServiceCategory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceCategory_ServiceDeliveryPoints() {
        return (EReference)getServiceCategory().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceCategory_CustomerAgreements() {
        return (EReference)getServiceCategory().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceCategory_Kind() {
        return (EAttribute)getServiceCategory().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceCategory_PricingStructures() {
        return (EReference)getServiceCategory().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPricingStructure() {
		if (pricingStructureEClass == null) {
			pricingStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI).getEClassifiers().get(3);
		}
		return pricingStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPricingStructure_Code() {
        return (EAttribute)getPricingStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPricingStructure_TaxExemption() {
        return (EAttribute)getPricingStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPricingStructure_ServiceCategory() {
        return (EReference)getPricingStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPricingStructure_CustomerAgreements() {
        return (EReference)getPricingStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPricingStructure_DailyFloorUsage() {
        return (EAttribute)getPricingStructure().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPricingStructure_RevenueKind() {
        return (EAttribute)getPricingStructure().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPricingStructure_PowerQualityPricings() {
        return (EReference)getPricingStructure().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPricingStructure_Tariffs() {
        return (EReference)getPricingStructure().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPricingStructure_ServiceDeliveryPoints() {
        return (EReference)getPricingStructure().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPricingStructure_DailyCeilingUsage() {
        return (EAttribute)getPricingStructure().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPricingStructure_SubscribePowerCurve() {
        return (EReference)getPricingStructure().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPricingStructure_DailyEstimatedUsage() {
        return (EAttribute)getPricingStructure().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPricingStructure_Transactions() {
        return (EReference)getPricingStructure().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLocation() {
		if (serviceLocationEClass == null) {
			serviceLocationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI).getEClassifiers().get(4);
		}
		return serviceLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLocation_NeedsInspection() {
        return (EAttribute)getServiceLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLocation_ServiceDeliveryPoints() {
        return (EReference)getServiceLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLocation_ErpPersons() {
        return (EReference)getServiceLocation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLocation_AccessMethod() {
        return (EAttribute)getServiceLocation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLocation_CustomerAgreements() {
        return (EReference)getServiceLocation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLocation_SiteAccessProblem() {
        return (EAttribute)getServiceLocation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLocation_EndDeviceAssets() {
        return (EReference)getServiceLocation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomerAccount() {
		if (customerAccountEClass == null) {
			customerAccountEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI).getEClassifiers().get(6);
		}
		return customerAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerAccount_WorkBillingInfos() {
        return (EReference)getCustomerAccount().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerAccount_PaymentTransactions() {
        return (EReference)getCustomerAccount().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerAccount_CustomerAgreements() {
        return (EReference)getCustomerAccount().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerAccount_ErpInvoicees() {
        return (EReference)getCustomerAccount().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerAccount_CustomerBillingInfos() {
        return (EReference)getCustomerAccount().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomerAgreement() {
		if (customerAgreementEClass == null) {
			customerAgreementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI).getEClassifiers().get(7);
		}
		return customerAgreementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerAgreement_ServiceSupplier() {
        return (EReference)getCustomerAgreement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerAgreement_StandardIndustryCode() {
        return (EReference)getCustomerAgreement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerAgreement_BillingCycle() {
        return (EAttribute)getCustomerAgreement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerAgreement_ServiceDeliveryPoints() {
        return (EReference)getCustomerAgreement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerAgreement_MeterReadings() {
        return (EReference)getCustomerAgreement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerAgreement_ServiceLocations() {
        return (EReference)getCustomerAgreement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerAgreement_PricingStructures() {
        return (EReference)getCustomerAgreement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerAgreement_LoadMgmt() {
        return (EAttribute)getCustomerAgreement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerAgreement_AuxiliaryAgreements() {
        return (EReference)getCustomerAgreement().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerAgreement_EndDeviceControls() {
        return (EReference)getCustomerAgreement().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerAgreement_BudgetBill() {
        return (EAttribute)getCustomerAgreement().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerAgreement_Customer() {
        return (EReference)getCustomerAgreement().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerAgreement_ServiceCategory() {
        return (EReference)getCustomerAgreement().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerAgreement_CustomerAccount() {
        return (EReference)getCustomerAgreement().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerAgreement_DemandResponseProgram() {
        return (EReference)getCustomerAgreement().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerAgreement_Equipments() {
        return (EReference)getCustomerAgreement().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTariff() {
		if (tariffEClass == null) {
			tariffEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI).getEClassifiers().get(8);
		}
		return tariffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTariff_TariffProfiles() {
        return (EReference)getTariff().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTariff_PricingStructures() {
        return (EReference)getTariff().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTariff_EndDate() {
        return (EAttribute)getTariff().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTariff_StartDate() {
        return (EAttribute)getTariff().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCustomerKind() {
		if (customerKindEEnum == null) {
			customerKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI).getEClassifiers().get(1);
		}
		return customerKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServiceKind() {
		if (serviceKindEEnum == null) {
			serviceKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI).getEClassifiers().get(5);
		}
		return serviceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRevenueKind() {
		if (revenueKindEEnum == null) {
			revenueKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI).getEClassifiers().get(9);
		}
		return revenueKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomersFactory getCustomersFactory() {
		return (CustomersFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("gluemodel.CIM.IEC61968.Customers." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //CustomersPackageImpl
