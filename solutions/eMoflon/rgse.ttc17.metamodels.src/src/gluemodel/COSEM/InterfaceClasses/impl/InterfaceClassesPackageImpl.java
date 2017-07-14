/**
 */
package gluemodel.COSEM.InterfaceClasses.impl;

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

import gluemodel.COSEM.InterfaceClasses.InterfaceClassesFactory;
import gluemodel.COSEM.InterfaceClasses.InterfaceClassesPackage;

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
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfaceClassesPackageImpl extends EPackageImpl implements InterfaceClassesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s_FSK_PHY_MACsetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s_FSKActiveinitiatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s_FSKMACsynctimeoutsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s_FSKMACcountersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iec61334_4_32LLCsetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s_FSKReportingsystemlistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t61334_32_LLC_SSCS_setupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primE_NB_OFDM_PLC_Phy_layer_countersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primE_NB_OFDM_PLC_MACsetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primE_NB_OFDM_PLC_MAC_countersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primE_NB_OFDM_PLC_MAC_functionalparamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primE_NB_OFDM_PLC_MACnetworkadmindataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primE_NB_OFDM_PLC_Application_identificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g3_PLC_MAC_layer_countersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g3_PLC_MAC_setupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g3_PLC_6LoWPANEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zigBee_SAS_startupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zigBee_SAS_joinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zigBee_SAS_APS_fragmentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zigBeenetworkcontrolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zigBeetunnelsetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcP_UDPsetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPv4setupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPv6setupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maCaddresssetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ppPsetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smtPsetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modemconfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auto_answerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auto_connectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gprS_modem_setupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsM_DiagnosticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ieC_twisted_pair_setupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m_Bus_slave_port_setupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m_Bus_clientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wireless_Mode_Q_ChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m_Bus_master_port_setupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dlmS_COSEM_Server_M_Bus_port_setupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m_Bus_diagnosticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scripttableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specialdaystableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitycalendarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registermonitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleactionscheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametermonitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensormanagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arbitratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disconnectControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass limiterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creditEClass = null;

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
	private EClass tokengatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ieC_local_port_setupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ieC_HDLC_setupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ieC_8802_2_LLC_Type_1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ieC_8802_2_LLC_G3_NBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iec8802_2LLCType3EClass = null;

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
	private EClass sapAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationLNEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedRegisterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass demandRegisterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profilegenericEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utilitytablesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registertableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compactdataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusmappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationSNEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagetransferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataprotectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushsetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securitysetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationAssociationEClass = null;

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
	 * @see gluemodel.COSEM.InterfaceClasses.InterfaceClassesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InterfaceClassesPackageImpl() {
		super(eNS_URI, InterfaceClassesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InterfaceClassesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static InterfaceClassesPackage init() {
		if (isInited) return (InterfaceClassesPackage)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI);

		// Obtain or create and register package
		InterfaceClassesPackageImpl theInterfaceClassesPackage = (InterfaceClassesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InterfaceClassesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InterfaceClassesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GluemodelPackageImpl theGluemodelPackage = (GluemodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GluemodelPackage.eNS_URI) instanceof GluemodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GluemodelPackage.eNS_URI) : GluemodelPackage.eINSTANCE);
		COSEMPackageImpl theCOSEMPackage = (COSEMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(COSEMPackage.eNS_URI) instanceof COSEMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(COSEMPackage.eNS_URI) : COSEMPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);
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
		theInterfaceClassesPackage.fixPackageContents();
		theGluemodelPackage.fixPackageContents();
		theCOSEMPackage.fixPackageContents();
		theDatatypesPackage.fixPackageContents();
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
		theInterfaceClassesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InterfaceClassesPackage.eNS_URI, theInterfaceClassesPackage);
		return theInterfaceClassesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS_FSK_PHY_MACsetup() {
		if (s_FSK_PHY_MACsetupEClass == null) {
			s_FSK_PHY_MACsetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(0);
		}
		return s_FSK_PHY_MACsetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS_FSKActiveinitiator() {
		if (s_FSKActiveinitiatorEClass == null) {
			s_FSKActiveinitiatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(1);
		}
		return s_FSKActiveinitiatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS_FSKMACsynctimeouts() {
		if (s_FSKMACsynctimeoutsEClass == null) {
			s_FSKMACsynctimeoutsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(2);
		}
		return s_FSKMACsynctimeoutsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS_FSKMACcounters() {
		if (s_FSKMACcountersEClass == null) {
			s_FSKMACcountersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(3);
		}
		return s_FSKMACcountersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEC61334_4_32LLCsetup() {
		if (iec61334_4_32LLCsetupEClass == null) {
			iec61334_4_32LLCsetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(4);
		}
		return iec61334_4_32LLCsetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS_FSKReportingsystemlist() {
		if (s_FSKReportingsystemlistEClass == null) {
			s_FSKReportingsystemlistEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(5);
		}
		return s_FSKReportingsystemlistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gett61334_32_LLC_SSCS_setup() {
		if (t61334_32_LLC_SSCS_setupEClass == null) {
			t61334_32_LLC_SSCS_setupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(6);
		}
		return t61334_32_LLC_SSCS_setupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRIME_NB_OFDM_PLC_Phy_layer_counters() {
		if (primE_NB_OFDM_PLC_Phy_layer_countersEClass == null) {
			primE_NB_OFDM_PLC_Phy_layer_countersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(7);
		}
		return primE_NB_OFDM_PLC_Phy_layer_countersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRIME_NB_OFDM_PLC_MACsetup() {
		if (primE_NB_OFDM_PLC_MACsetupEClass == null) {
			primE_NB_OFDM_PLC_MACsetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(8);
		}
		return primE_NB_OFDM_PLC_MACsetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRIME_NB_OFDM_PLC_MAC_counters() {
		if (primE_NB_OFDM_PLC_MAC_countersEClass == null) {
			primE_NB_OFDM_PLC_MAC_countersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(9);
		}
		return primE_NB_OFDM_PLC_MAC_countersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRIME_NB_OFDM_PLC_MAC_functionalparams() {
		if (primE_NB_OFDM_PLC_MAC_functionalparamsEClass == null) {
			primE_NB_OFDM_PLC_MAC_functionalparamsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(10);
		}
		return primE_NB_OFDM_PLC_MAC_functionalparamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRIME_NB_OFDM_PLC_MACnetworkadmindata() {
		if (primE_NB_OFDM_PLC_MACnetworkadmindataEClass == null) {
			primE_NB_OFDM_PLC_MACnetworkadmindataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(11);
		}
		return primE_NB_OFDM_PLC_MACnetworkadmindataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRIME_NB_OFDM_PLC_Application_identification() {
		if (primE_NB_OFDM_PLC_Application_identificationEClass == null) {
			primE_NB_OFDM_PLC_Application_identificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(12);
		}
		return primE_NB_OFDM_PLC_Application_identificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG3_PLC_MAC_layer_counters() {
		if (g3_PLC_MAC_layer_countersEClass == null) {
			g3_PLC_MAC_layer_countersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(13);
		}
		return g3_PLC_MAC_layer_countersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG3_PLC_MAC_setup() {
		if (g3_PLC_MAC_setupEClass == null) {
			g3_PLC_MAC_setupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(14);
		}
		return g3_PLC_MAC_setupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG3_PLC_6LoWPAN() {
		if (g3_PLC_6LoWPANEClass == null) {
			g3_PLC_6LoWPANEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(15);
		}
		return g3_PLC_6LoWPANEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZigBee_SAS_startup() {
		if (zigBee_SAS_startupEClass == null) {
			zigBee_SAS_startupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(16);
		}
		return zigBee_SAS_startupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZigBee_SAS_join() {
		if (zigBee_SAS_joinEClass == null) {
			zigBee_SAS_joinEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(17);
		}
		return zigBee_SAS_joinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZigBee_SAS_APS_fragmentation() {
		if (zigBee_SAS_APS_fragmentationEClass == null) {
			zigBee_SAS_APS_fragmentationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(18);
		}
		return zigBee_SAS_APS_fragmentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZigBeenetworkcontrol() {
		if (zigBeenetworkcontrolEClass == null) {
			zigBeenetworkcontrolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(19);
		}
		return zigBeenetworkcontrolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZigBeetunnelsetup() {
		if (zigBeetunnelsetupEClass == null) {
			zigBeetunnelsetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(20);
		}
		return zigBeetunnelsetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCP_UDPsetup() {
		if (tcP_UDPsetupEClass == null) {
			tcP_UDPsetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(21);
		}
		return tcP_UDPsetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPv4setup() {
		if (iPv4setupEClass == null) {
			iPv4setupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(22);
		}
		return iPv4setupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPv6setup() {
		if (iPv6setupEClass == null) {
			iPv6setupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(23);
		}
		return iPv6setupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMACaddresssetup() {
		if (maCaddresssetupEClass == null) {
			maCaddresssetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(24);
		}
		return maCaddresssetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPPPsetup() {
		if (ppPsetupEClass == null) {
			ppPsetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(25);
		}
		return ppPsetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSMTPsetup() {
		if (smtPsetupEClass == null) {
			smtPsetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(26);
		}
		return smtPsetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModemconfiguration() {
		if (modemconfigurationEClass == null) {
			modemconfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(27);
		}
		return modemconfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuto_answer() {
		if (auto_answerEClass == null) {
			auto_answerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(28);
		}
		return auto_answerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuto_connect() {
		if (auto_connectEClass == null) {
			auto_connectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(29);
		}
		return auto_connectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPRS_modem_setup() {
		if (gprS_modem_setupEClass == null) {
			gprS_modem_setupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(30);
		}
		return gprS_modem_setupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSM_Diagnostic() {
		if (gsM_DiagnosticEClass == null) {
			gsM_DiagnosticEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(31);
		}
		return gsM_DiagnosticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEC_twisted_pair_setup() {
		if (ieC_twisted_pair_setupEClass == null) {
			ieC_twisted_pair_setupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(32);
		}
		return ieC_twisted_pair_setupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM_Bus_slave_port_setup() {
		if (m_Bus_slave_port_setupEClass == null) {
			m_Bus_slave_port_setupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(33);
		}
		return m_Bus_slave_port_setupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM_Bus_client() {
		if (m_Bus_clientEClass == null) {
			m_Bus_clientEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(34);
		}
		return m_Bus_clientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWireless_Mode_Q_Channel() {
		if (wireless_Mode_Q_ChannelEClass == null) {
			wireless_Mode_Q_ChannelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(35);
		}
		return wireless_Mode_Q_ChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM_Bus_master_port_setup() {
		if (m_Bus_master_port_setupEClass == null) {
			m_Bus_master_port_setupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(36);
		}
		return m_Bus_master_port_setupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDLMS_COSEM_Server_M_Bus_port_setup() {
		if (dlmS_COSEM_Server_M_Bus_port_setupEClass == null) {
			dlmS_COSEM_Server_M_Bus_port_setupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(37);
		}
		return dlmS_COSEM_Server_M_Bus_port_setupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM_Bus_diagnostic() {
		if (m_Bus_diagnosticEClass == null) {
			m_Bus_diagnosticEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(38);
		}
		return m_Bus_diagnosticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScripttable() {
		if (scripttableEClass == null) {
			scripttableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(39);
		}
		return scripttableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScripttable_Includes() {
        return (EReference)getScripttable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScripttable__Execute() {
        return getScripttable().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScript() {
		if (scriptEClass == null) {
			scriptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(40);
		}
		return scriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedule() {
		if (scheduleEClass == null) {
			scheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(41);
		}
		return scheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecialdaystable() {
		if (specialdaystableEClass == null) {
			specialdaystableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(42);
		}
		return specialdaystableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitycalendar() {
		if (activitycalendarEClass == null) {
			activitycalendarEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(43);
		}
		return activitycalendarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistermonitor() {
		if (registermonitorEClass == null) {
			registermonitorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(44);
		}
		return registermonitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleactionschedule() {
		if (singleactionscheduleEClass == null) {
			singleactionscheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(45);
		}
		return singleactionscheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametermonitor() {
		if (parametermonitorEClass == null) {
			parametermonitorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(46);
		}
		return parametermonitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensormanager() {
		if (sensormanagerEClass == null) {
			sensormanagerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(47);
		}
		return sensormanagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArbitrator() {
		if (arbitratorEClass == null) {
			arbitratorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(48);
		}
		return arbitratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisconnectControl() {
		if (disconnectControlEClass == null) {
			disconnectControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(49);
		}
		return disconnectControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisconnectControl_State() {
        return (EAttribute)getDisconnectControl().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisconnectControl_Transition() {
        return (EAttribute)getDisconnectControl().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLimiter() {
		if (limiterEClass == null) {
			limiterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(50);
		}
		return limiterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccount() {
		if (accountEClass == null) {
			accountEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(51);
		}
		return accountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCredit() {
		if (creditEClass == null) {
			creditEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(52);
		}
		return creditEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharge() {
		if (chargeEClass == null) {
			chargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(53);
		}
		return chargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokengateway() {
		if (tokengatewayEClass == null) {
			tokengatewayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(54);
		}
		return tokengatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEC_local_port_setup() {
		if (ieC_local_port_setupEClass == null) {
			ieC_local_port_setupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(55);
		}
		return ieC_local_port_setupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEC_HDLC_setup() {
		if (ieC_HDLC_setupEClass == null) {
			ieC_HDLC_setupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(56);
		}
		return ieC_HDLC_setupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEC_8802_2_LLC_Type_1() {
		if (ieC_8802_2_LLC_Type_1EClass == null) {
			ieC_8802_2_LLC_Type_1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(57);
		}
		return ieC_8802_2_LLC_Type_1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEC_8802_2_LLC_G3_NB() {
		if (ieC_8802_2_LLC_G3_NBEClass == null) {
			ieC_8802_2_LLC_G3_NBEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(58);
		}
		return ieC_8802_2_LLC_G3_NBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEC8802_2LLCType3() {
		if (iec8802_2LLCType3EClass == null) {
			iec8802_2LLCType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(59);
		}
		return iec8802_2LLCType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegister() {
		if (registerEClass == null) {
			registerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(60);
		}
		return registerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegister_Value() {
        return (EAttribute)getRegister().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegister_Scaler_unit() {
        return (EReference)getRegister().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegister__Reset() {
        return getRegister().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSAPAssignment() {
		if (sapAssignmentEClass == null) {
			sapAssignmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(61);
		}
		return sapAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSAPAssignment_Ldnname() {
        return (EReference)getSAPAssignment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationLN() {
		if (associationLNEClass == null) {
			associationLNEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(62);
		}
		return associationLNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationLN_AA() {
        return (EReference)getAssociationLN().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		if (dataEClass == null) {
			dataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(63);
		}
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedRegister() {
		if (extendedRegisterEClass == null) {
			extendedRegisterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(64);
		}
		return extendedRegisterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDemandRegister() {
		if (demandRegisterEClass == null) {
			demandRegisterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(65);
		}
		return demandRegisterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDemandRegister_Number_of_periods() {
        return (EAttribute)getDemandRegister().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDemandRegister_Period() {
        return (EAttribute)getDemandRegister().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDemandRegister_Current_average_value() {
        return (EAttribute)getDemandRegister().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDemandRegister__Calculate_current_average_value() {
        return getDemandRegister().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDemandRegister__Calculate_last_average_value() {
        return getDemandRegister().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisterActivation() {
		if (registerActivationEClass == null) {
			registerActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(66);
		}
		return registerActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfilegeneric() {
		if (profilegenericEClass == null) {
			profilegenericEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(67);
		}
		return profilegenericEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBase() {
		if (baseEClass == null) {
			baseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(68);
		}
		return baseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBase_Logical_name() {
        return (EAttribute)getBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBase_OBIScode() {
        return (EAttribute)getBase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUtilitytables() {
		if (utilitytablesEClass == null) {
			utilitytablesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(69);
		}
		return utilitytablesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistertable() {
		if (registertableEClass == null) {
			registertableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(70);
		}
		return registertableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompactdata() {
		if (compactdataEClass == null) {
			compactdataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(71);
		}
		return compactdataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompactdata_Compact_buffer() {
        return (EAttribute)getCompactdata().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompactdata_Template_id() {
        return (EAttribute)getCompactdata().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompactdata_Template_description() {
        return (EAttribute)getCompactdata().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusmapping() {
		if (statusmappingEClass == null) {
			statusmappingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(72);
		}
		return statusmappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationSN() {
		if (associationSNEClass == null) {
			associationSNEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(73);
		}
		return associationSNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagetransfer() {
		if (imagetransferEClass == null) {
			imagetransferEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(74);
		}
		return imagetransferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataprotection() {
		if (dataprotectionEClass == null) {
			dataprotectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(75);
		}
		return dataprotectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPushsetup() {
		if (pushsetupEClass == null) {
			pushsetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(76);
		}
		return pushsetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecuritysetup() {
		if (securitysetupEClass == null) {
			securitysetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(77);
		}
		return securitysetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClock() {
		if (clockEClass == null) {
			clockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(78);
		}
		return clockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClock_Time() {
        return (EAttribute)getClock().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClock_Time_zone() {
        return (EAttribute)getClock().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClock_Status() {
        return (EAttribute)getClock().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClock_Daylight_savings_begin() {
        return (EAttribute)getClock().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClock_Daylight_savings_end() {
        return (EAttribute)getClock().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClock_Daylight_savings_deviation() {
        return (EAttribute)getClock().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClock_Daylight_savings_enabled() {
        return (EAttribute)getClock().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClock__Adjust_to_quarter() {
        return getClock().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClock__Adjust_to_measuring_period() {
        return getClock().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClock__Adjust_to_minute() {
        return getClock().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClock__Adjust_to_present_time() {
        return getClock().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClock__Present_adjusting_time() {
        return getClock().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClock__Shift_time() {
        return getClock().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationAssociation() {
		if (applicationAssociationEClass == null) {
			applicationAssociationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(79);
		}
		return applicationAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceClassesFactory getInterfaceClassesFactory() {
		return (InterfaceClassesFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("gluemodel.COSEM.InterfaceClasses." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //InterfaceClassesPackageImpl
