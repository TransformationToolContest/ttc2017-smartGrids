/**
 */
package gluemodel.COSEM.COSEMObjects.impl;

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

import gluemodel.COSEM.COSEMObjects.COSEMObjectsFactory;
import gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage;

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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class COSEMObjectsPackageImpl extends EPackageImpl implements COSEMObjectsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEntriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billingPeriodValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEntriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unixClockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modemConfigurationObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autoConnectObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autoAnswerObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalMeterResetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdiResetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tarifficationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activateTestModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activateNormalModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setOutputSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchOpticalTestOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerQualityMeasurementManagementEClass = null;

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
	private EClass imageActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass broadcastEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specialDaysEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityCalendarObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerActivationObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleActionScheduleObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disconnectControlScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endOfBillingPeriodScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageActivationScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputControlScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerMonitorObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alarmMonitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterMonitorObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass limiterObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creditObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chargeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenGatewayObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxCreditLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxVendLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecOpticalPortSetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecElectricalPortSetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardReadoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardReadoutParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iechdlcSetupObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecTwistedPairSetupObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecTwistedPairMACAddressSetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecTwistedPairFatalErrorRegisterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iec62056_3_1ShortReadoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iec62056_3_1LongReadoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ieC_62056_3_1AlternateReadoutProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m_BusSlavePortSetupObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m_BusClientObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m_BusValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m_BusProfileGenericEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m_BusDisconnectControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m_BusControlLogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m_BusMasterPortSetupObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wirelessModeQChannelObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dlmS_COSEMServerM_BusPortSetupObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m_BusDiagnosticObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcP_UDPSetupObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPv4SetupObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macAddressSetupObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pppSetupObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gprsModemSetupObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smtpSetupObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsmDiagnosticObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPv6SetupObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushSetupObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s_FSKPhy_MACSetupObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s_FSKActiveInitiatorObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s_FSKMACSynchronizationTimeoutsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s_FSKMACCountersObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iec61334_4_32LLCSetupObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s_FSKReportingSystemListObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isO_IEC8802_2LLCType1SetupObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isO_IEC8802_2LLCType2SetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isO_IEC8802_2LLCType3SetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t61334_4_32LLCSSCSsetupobjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primE_NB_OFDM_PLC_Physical_layer_counters_objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primE_NB_OFDM_PLC_MAC_setup_objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primE_NB_OFDM_PLC_MAC_functional_parameters_objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primE_NB_OFDM_PLC_MAC_counters_objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primE_NB_OFDM_PLC_MAC_network_administration_data_objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primE_NB_OFDM_PLC_MAC_address_setupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primE_NB_OFDM_PLC_Application_identification_objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g3_PLC_MAC_layer_counters_objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g3_PLC_MAC_setup_objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g3_PLC_6LoWPAN_adaptation_layer_setup_objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zigBee_SAS_startup_objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zigBee_SAS_join_objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zigBee_SAS_APS_fragmentation_objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zigBee_network_control_objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zigBee_tunnel_setup_objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sapAssignmentCurrentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securitySetupObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invocationCounterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataProtectionObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageTransferObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utilitiesTableObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compactDataObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceIDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meteringPointIDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterChangesObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass i_O_control_signal_objects_contentsmanufacturerspecificEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass i_O_control_signal_objects_contentsmappedtoareferencetableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass i_O_control_signal_objects_globalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioControlSignalsManufacturerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioControlSignalsMappedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioControlSignalsGlobalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disconnectControlObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalPurposeArbitratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalControlManuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalControlMappedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalControlGlobalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalOperatingStatusManuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalOperatingStatusMappedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalOperatingStatusGlobalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusRegisterManuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusRegisterMappedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorRegisterObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorProfileObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorTableObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alarmRegisterObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alarmFilterObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alarmDescriptorObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventLogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electricityIDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electricityProgramEntriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPulseValues_constantsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readingFactorAndCT_VTratioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electricityNominalValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPulseValuesOrConstantsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementPeriod_recordingInterval_billingPeriodDurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electricityTimeEntriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coefficientsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementMethodsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electricityMeteringPointIDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electricityRelatedStatusDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electricityRelatedStatusDataMappedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batteryEntriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerFailureMonitoringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatingTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentRelatedParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusRegisterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationPortLogParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consumerMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentlyActiveTariffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventCounterObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileEntryDigitalSignatureObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meterTemperEventRelatedObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electricityValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electricityHarmonicsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedPhaseAngleMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformerAndLineLossesEClass = null;

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
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private COSEMObjectsPackageImpl() {
		super(eNS_URI, COSEMObjectsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link COSEMObjectsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static COSEMObjectsPackage init() {
		if (isInited) return (COSEMObjectsPackage)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI);

		// Obtain or create and register package
		COSEMObjectsPackageImpl theCOSEMObjectsPackage = (COSEMObjectsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof COSEMObjectsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new COSEMObjectsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GluemodelPackageImpl theGluemodelPackage = (GluemodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GluemodelPackage.eNS_URI) instanceof GluemodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GluemodelPackage.eNS_URI) : GluemodelPackage.eINSTANCE);
		COSEMPackageImpl theCOSEMPackage = (COSEMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(COSEMPackage.eNS_URI) instanceof COSEMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(COSEMPackage.eNS_URI) : COSEMPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);
		InterfaceClassesPackageImpl theInterfaceClassesPackage = (InterfaceClassesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI) instanceof InterfaceClassesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI) : InterfaceClassesPackage.eINSTANCE);
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
		theCOSEMObjectsPackage.fixPackageContents();
		theGluemodelPackage.fixPackageContents();
		theCOSEMPackage.fixPackageContents();
		theDatatypesPackage.fixPackageContents();
		theInterfaceClassesPackage.fixPackageContents();
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
		theCOSEMObjectsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(COSEMObjectsPackage.eNS_URI, theCOSEMObjectsPackage);
		return theCOSEMObjectsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramEntries() {
		if (programEntriesEClass == null) {
			programEntriesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(0);
		}
		return programEntriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramEntries_ActiveFirmwareIdentifier() {
        return (EAttribute)getProgramEntries().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramEntries_ActiveFirmwareVersion() {
        return (EAttribute)getProgramEntries().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramEntries_ActiveFirmwareSignature() {
        return (EAttribute)getProgramEntries().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBillingPeriodValues() {
		if (billingPeriodValuesEClass == null) {
			billingPeriodValuesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(1);
		}
		return billingPeriodValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBillingPeriodValues_BillingPeriodCounter() {
        return (EAttribute)getBillingPeriodValues().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBillingPeriodValues_NumberAvailableBillingPeriods() {
        return (EAttribute)getBillingPeriodValues().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBillingPeriodValues_TimestampRecentBillingPeriod() {
        return (EAttribute)getBillingPeriodValues().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeEntries() {
		if (timeEntriesEClass == null) {
			timeEntriesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(2);
		}
		return timeEntriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeEntries_LocalTime() {
        return (EAttribute)getTimeEntries().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeEntries_LocalDate() {
        return (EAttribute)getTimeEntries().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUNIXClock() {
		if (unixClockEClass == null) {
			unixClockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(3);
		}
		return unixClockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUNIXClock_Value() {
        return (EAttribute)getUNIXClock().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModemConfigurationObject() {
		if (modemConfigurationObjectEClass == null) {
			modemConfigurationObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(4);
		}
		return modemConfigurationObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutoConnectObject() {
		if (autoConnectObjectEClass == null) {
			autoConnectObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(5);
		}
		return autoConnectObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutoConnectObject_Connection() {
        return (EAttribute)getAutoConnectObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutoAnswerObject() {
		if (autoAnswerObjectEClass == null) {
			autoAnswerObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(6);
		}
		return autoAnswerObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutoAnswerObject_Answer() {
        return (EAttribute)getAutoAnswerObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScriptTable() {
		if (scriptTableEClass == null) {
			scriptTableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(7);
		}
		return scriptTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScriptTable_GlobalMeterReset() {
        return (EReference)getScriptTable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScriptTable_MDIReset() {
        return (EReference)getScriptTable().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScriptTable_Tariffication() {
        return (EReference)getScriptTable().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScriptTable_AcitvateTest() {
        return (EReference)getScriptTable().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScriptTable_ActivateNormal() {
        return (EReference)getScriptTable().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScriptTable_SetOutput() {
        return (EReference)getScriptTable().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScriptTable_SwitchOptical() {
        return (EReference)getScriptTable().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScriptTable_PowerQuality() {
        return (EReference)getScriptTable().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScriptTable_Disconnect() {
        return (EReference)getScriptTable().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScriptTable_Image() {
        return (EReference)getScriptTable().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScriptTable_Push() {
        return (EReference)getScriptTable().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScriptTable_Broadcast() {
        return (EReference)getScriptTable().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalMeterReset() {
		if (globalMeterResetEClass == null) {
			globalMeterResetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(8);
		}
		return globalMeterResetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMDIReset() {
		if (mdiResetEClass == null) {
			mdiResetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(9);
		}
		return mdiResetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTariffication() {
		if (tarifficationEClass == null) {
			tarifficationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(10);
		}
		return tarifficationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivateTestMode() {
		if (activateTestModeEClass == null) {
			activateTestModeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(11);
		}
		return activateTestModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivateNormalMode() {
		if (activateNormalModeEClass == null) {
			activateNormalModeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(12);
		}
		return activateNormalModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetOutputSignal() {
		if (setOutputSignalEClass == null) {
			setOutputSignalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(13);
		}
		return setOutputSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchOpticalTestOutput() {
		if (switchOpticalTestOutputEClass == null) {
			switchOpticalTestOutputEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(14);
		}
		return switchOpticalTestOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerQualityMeasurementManagement() {
		if (powerQualityMeasurementManagementEClass == null) {
			powerQualityMeasurementManagementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(15);
		}
		return powerQualityMeasurementManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisconnectControl() {
		if (disconnectControlEClass == null) {
			disconnectControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(16);
		}
		return disconnectControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageActivation() {
		if (imageActivationEClass == null) {
			imageActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(17);
		}
		return imageActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPush() {
		if (pushEClass == null) {
			pushEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(18);
		}
		return pushEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBroadcast() {
		if (broadcastEClass == null) {
			broadcastEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(19);
		}
		return broadcastEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecialDays() {
		if (specialDaysEClass == null) {
			specialDaysEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(20);
		}
		return specialDaysEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheduleObject() {
		if (scheduleObjectEClass == null) {
			scheduleObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(21);
		}
		return scheduleObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityCalendarObject() {
		if (activityCalendarObjectEClass == null) {
			activityCalendarObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(22);
		}
		return activityCalendarObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisterActivationObject() {
		if (registerActivationObjectEClass == null) {
			registerActivationObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(23);
		}
		return registerActivationObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleActionScheduleObject() {
		if (singleActionScheduleObjectEClass == null) {
			singleActionScheduleObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(24);
		}
		return singleActionScheduleObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleActionScheduleObject_Disconnect() {
        return (EReference)getSingleActionScheduleObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleActionScheduleObject_BillingPeriodEnd() {
        return (EReference)getSingleActionScheduleObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleActionScheduleObject_Image() {
        return (EReference)getSingleActionScheduleObject().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleActionScheduleObject_Output() {
        return (EReference)getSingleActionScheduleObject().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleActionScheduleObject_Push() {
        return (EReference)getSingleActionScheduleObject().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisconnectControlSchedule() {
		if (disconnectControlScheduleEClass == null) {
			disconnectControlScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(25);
		}
		return disconnectControlScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndOfBillingPeriodSchedule() {
		if (endOfBillingPeriodScheduleEClass == null) {
			endOfBillingPeriodScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(26);
		}
		return endOfBillingPeriodScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageActivationSchedule() {
		if (imageActivationScheduleEClass == null) {
			imageActivationScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(27);
		}
		return imageActivationScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputControlSchedule() {
		if (outputControlScheduleEClass == null) {
			outputControlScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(28);
		}
		return outputControlScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPushSchedule() {
		if (pushScheduleEClass == null) {
			pushScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(29);
		}
		return pushScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisterMonitorObject() {
		if (registerMonitorObjectEClass == null) {
			registerMonitorObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(30);
		}
		return registerMonitorObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlarmMonitor() {
		if (alarmMonitorEClass == null) {
			alarmMonitorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(31);
		}
		return alarmMonitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterMonitorObject() {
		if (parameterMonitorObjectEClass == null) {
			parameterMonitorObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(32);
		}
		return parameterMonitorObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLimiterObject() {
		if (limiterObjectEClass == null) {
			limiterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(33);
		}
		return limiterObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccountObject() {
		if (accountObjectEClass == null) {
			accountObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(34);
		}
		return accountObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreditObject() {
		if (creditObjectEClass == null) {
			creditObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(35);
		}
		return creditObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChargeObject() {
		if (chargeObjectEClass == null) {
			chargeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(36);
		}
		return chargeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenGatewayObject() {
		if (tokenGatewayObjectEClass == null) {
			tokenGatewayObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(37);
		}
		return tokenGatewayObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxCreditLimit() {
		if (maxCreditLimitEClass == null) {
			maxCreditLimitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(38);
		}
		return maxCreditLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaxCreditLimit_Value() {
        return (EAttribute)getMaxCreditLimit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxVendLimit() {
		if (maxVendLimitEClass == null) {
			maxVendLimitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(39);
		}
		return maxVendLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaxVendLimit_Value() {
        return (EAttribute)getMaxVendLimit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECOpticalPortSetup() {
		if (iecOpticalPortSetupEClass == null) {
			iecOpticalPortSetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(40);
		}
		return iecOpticalPortSetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECElectricalPortSetup() {
		if (iecElectricalPortSetupEClass == null) {
			iecElectricalPortSetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(41);
		}
		return iecElectricalPortSetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardReadout() {
		if (standardReadoutEClass == null) {
			standardReadoutEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(42);
		}
		return standardReadoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardReadout_GeneralLocalPortReadout() {
        return (EAttribute)getStandardReadout().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardReadout_GeneralDisplayReadout() {
        return (EAttribute)getStandardReadout().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardReadout_AlternateDisplayReadout() {
        return (EAttribute)getStandardReadout().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardReadout_ServiceDisplayReadout() {
        return (EAttribute)getStandardReadout().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardReadout_ListConfigMeterData() {
        return (EAttribute)getStandardReadout().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardReadout_AdditionalReadout() {
        return (EAttribute)getStandardReadout().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardReadoutParam() {
		if (standardReadoutParamEClass == null) {
			standardReadoutParamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(43);
		}
		return standardReadoutParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECHDLCSetupObject() {
		if (iechdlcSetupObjectEClass == null) {
			iechdlcSetupObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(44);
		}
		return iechdlcSetupObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECTwistedPairSetupObject() {
		if (iecTwistedPairSetupObjectEClass == null) {
			iecTwistedPairSetupObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(45);
		}
		return iecTwistedPairSetupObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECTwistedPairMACAddressSetup() {
		if (iecTwistedPairMACAddressSetupEClass == null) {
			iecTwistedPairMACAddressSetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(46);
		}
		return iecTwistedPairMACAddressSetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECTwistedPairFatalErrorRegister() {
		if (iecTwistedPairFatalErrorRegisterEClass == null) {
			iecTwistedPairFatalErrorRegisterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(47);
		}
		return iecTwistedPairFatalErrorRegisterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEC62056_3_1ShortReadout() {
		if (iec62056_3_1ShortReadoutEClass == null) {
			iec62056_3_1ShortReadoutEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(48);
		}
		return iec62056_3_1ShortReadoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEC62056_3_1LongReadout() {
		if (iec62056_3_1LongReadoutEClass == null) {
			iec62056_3_1LongReadoutEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(49);
		}
		return iec62056_3_1LongReadoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEC_62056_3_1AlternateReadoutProfile() {
		if (ieC_62056_3_1AlternateReadoutProfileEClass == null) {
			ieC_62056_3_1AlternateReadoutProfileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(50);
		}
		return ieC_62056_3_1AlternateReadoutProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM_BusSlavePortSetupObject() {
		if (m_BusSlavePortSetupObjectEClass == null) {
			m_BusSlavePortSetupObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(51);
		}
		return m_BusSlavePortSetupObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM_BusClientObject() {
		if (m_BusClientObjectEClass == null) {
			m_BusClientObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(52);
		}
		return m_BusClientObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM_BusValue() {
		if (m_BusValueEClass == null) {
			m_BusValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(53);
		}
		return m_BusValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM_BusProfileGeneric() {
		if (m_BusProfileGenericEClass == null) {
			m_BusProfileGenericEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(54);
		}
		return m_BusProfileGenericEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM_BusDisconnectControl() {
		if (m_BusDisconnectControlEClass == null) {
			m_BusDisconnectControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(55);
		}
		return m_BusDisconnectControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM_BusControlLog() {
		if (m_BusControlLogEClass == null) {
			m_BusControlLogEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(56);
		}
		return m_BusControlLogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM_BusMasterPortSetupObject() {
		if (m_BusMasterPortSetupObjectEClass == null) {
			m_BusMasterPortSetupObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(57);
		}
		return m_BusMasterPortSetupObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWirelessModeQChannelObject() {
		if (wirelessModeQChannelObjectEClass == null) {
			wirelessModeQChannelObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(58);
		}
		return wirelessModeQChannelObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDLMS_COSEMServerM_BusPortSetupObject() {
		if (dlmS_COSEMServerM_BusPortSetupObjectEClass == null) {
			dlmS_COSEMServerM_BusPortSetupObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(59);
		}
		return dlmS_COSEMServerM_BusPortSetupObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM_BusDiagnosticObject() {
		if (m_BusDiagnosticObjectEClass == null) {
			m_BusDiagnosticObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(60);
		}
		return m_BusDiagnosticObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCP_UDPSetupObject() {
		if (tcP_UDPSetupObjectEClass == null) {
			tcP_UDPSetupObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(61);
		}
		return tcP_UDPSetupObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPv4SetupObject() {
		if (iPv4SetupObjectEClass == null) {
			iPv4SetupObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(62);
		}
		return iPv4SetupObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMACAddressSetupObject() {
		if (macAddressSetupObjectEClass == null) {
			macAddressSetupObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(63);
		}
		return macAddressSetupObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPPPSetupObject() {
		if (pppSetupObjectEClass == null) {
			pppSetupObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(64);
		}
		return pppSetupObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPRSModemSetupObject() {
		if (gprsModemSetupObjectEClass == null) {
			gprsModemSetupObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(65);
		}
		return gprsModemSetupObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSMTPSetupObject() {
		if (smtpSetupObjectEClass == null) {
			smtpSetupObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(66);
		}
		return smtpSetupObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSMDiagnosticObject() {
		if (gsmDiagnosticObjectEClass == null) {
			gsmDiagnosticObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(67);
		}
		return gsmDiagnosticObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPv6SetupObject() {
		if (iPv6SetupObjectEClass == null) {
			iPv6SetupObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(68);
		}
		return iPv6SetupObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPushSetupObject() {
		if (pushSetupObjectEClass == null) {
			pushSetupObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(69);
		}
		return pushSetupObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS_FSKPhy_MACSetupObject() {
		if (s_FSKPhy_MACSetupObjectEClass == null) {
			s_FSKPhy_MACSetupObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(70);
		}
		return s_FSKPhy_MACSetupObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS_FSKActiveInitiatorObject() {
		if (s_FSKActiveInitiatorObjectEClass == null) {
			s_FSKActiveInitiatorObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(71);
		}
		return s_FSKActiveInitiatorObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS_FSKMACSynchronizationTimeouts() {
		if (s_FSKMACSynchronizationTimeoutsEClass == null) {
			s_FSKMACSynchronizationTimeoutsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(72);
		}
		return s_FSKMACSynchronizationTimeoutsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS_FSKMACCountersObject() {
		if (s_FSKMACCountersObjectEClass == null) {
			s_FSKMACCountersObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(73);
		}
		return s_FSKMACCountersObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEC61334_4_32LLCSetupObject() {
		if (iec61334_4_32LLCSetupObjectEClass == null) {
			iec61334_4_32LLCSetupObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(74);
		}
		return iec61334_4_32LLCSetupObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS_FSKReportingSystemListObject() {
		if (s_FSKReportingSystemListObjectEClass == null) {
			s_FSKReportingSystemListObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(75);
		}
		return s_FSKReportingSystemListObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISO_IEC8802_2LLCType1SetupObject() {
		if (isO_IEC8802_2LLCType1SetupObjectEClass == null) {
			isO_IEC8802_2LLCType1SetupObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(76);
		}
		return isO_IEC8802_2LLCType1SetupObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISO_IEC8802_2LLCType2Setup() {
		if (isO_IEC8802_2LLCType2SetupEClass == null) {
			isO_IEC8802_2LLCType2SetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(77);
		}
		return isO_IEC8802_2LLCType2SetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISO_IEC8802_2LLCType3Setup() {
		if (isO_IEC8802_2LLCType3SetupEClass == null) {
			isO_IEC8802_2LLCType3SetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(78);
		}
		return isO_IEC8802_2LLCType3SetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gett61334_4_32LLCSSCSsetupobject() {
		if (t61334_4_32LLCSSCSsetupobjectEClass == null) {
			t61334_4_32LLCSSCSsetupobjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(79);
		}
		return t61334_4_32LLCSSCSsetupobjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRIME_NB_OFDM_PLC_Physical_layer_counters_object() {
		if (primE_NB_OFDM_PLC_Physical_layer_counters_objectEClass == null) {
			primE_NB_OFDM_PLC_Physical_layer_counters_objectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(80);
		}
		return primE_NB_OFDM_PLC_Physical_layer_counters_objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRIME_NB_OFDM_PLC_MAC_setup_object() {
		if (primE_NB_OFDM_PLC_MAC_setup_objectEClass == null) {
			primE_NB_OFDM_PLC_MAC_setup_objectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(81);
		}
		return primE_NB_OFDM_PLC_MAC_setup_objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRIME_NB_OFDM_PLC_MAC_functional_parameters_object() {
		if (primE_NB_OFDM_PLC_MAC_functional_parameters_objectEClass == null) {
			primE_NB_OFDM_PLC_MAC_functional_parameters_objectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(82);
		}
		return primE_NB_OFDM_PLC_MAC_functional_parameters_objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRIME_NB_OFDM_PLC_MAC_counters_object() {
		if (primE_NB_OFDM_PLC_MAC_counters_objectEClass == null) {
			primE_NB_OFDM_PLC_MAC_counters_objectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(83);
		}
		return primE_NB_OFDM_PLC_MAC_counters_objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRIME_NB_OFDM_PLC_MAC_network_administration_data_object() {
		if (primE_NB_OFDM_PLC_MAC_network_administration_data_objectEClass == null) {
			primE_NB_OFDM_PLC_MAC_network_administration_data_objectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(84);
		}
		return primE_NB_OFDM_PLC_MAC_network_administration_data_objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRIME_NB_OFDM_PLC_MAC_address_setup() {
		if (primE_NB_OFDM_PLC_MAC_address_setupEClass == null) {
			primE_NB_OFDM_PLC_MAC_address_setupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(85);
		}
		return primE_NB_OFDM_PLC_MAC_address_setupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRIME_NB_OFDM_PLC_Application_identification_object() {
		if (primE_NB_OFDM_PLC_Application_identification_objectEClass == null) {
			primE_NB_OFDM_PLC_Application_identification_objectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(86);
		}
		return primE_NB_OFDM_PLC_Application_identification_objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG3_PLC_MAC_layer_counters_object() {
		if (g3_PLC_MAC_layer_counters_objectEClass == null) {
			g3_PLC_MAC_layer_counters_objectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(87);
		}
		return g3_PLC_MAC_layer_counters_objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG3_PLC_MAC_setup_object() {
		if (g3_PLC_MAC_setup_objectEClass == null) {
			g3_PLC_MAC_setup_objectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(88);
		}
		return g3_PLC_MAC_setup_objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG3_PLC_6LoWPAN_adaptation_layer_setup_object() {
		if (g3_PLC_6LoWPAN_adaptation_layer_setup_objectEClass == null) {
			g3_PLC_6LoWPAN_adaptation_layer_setup_objectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(89);
		}
		return g3_PLC_6LoWPAN_adaptation_layer_setup_objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZigBee_SAS_startup_object() {
		if (zigBee_SAS_startup_objectEClass == null) {
			zigBee_SAS_startup_objectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(90);
		}
		return zigBee_SAS_startup_objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZigBee_SAS_join_object() {
		if (zigBee_SAS_join_objectEClass == null) {
			zigBee_SAS_join_objectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(91);
		}
		return zigBee_SAS_join_objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZigBee_SAS_APS_fragmentation_object() {
		if (zigBee_SAS_APS_fragmentation_objectEClass == null) {
			zigBee_SAS_APS_fragmentation_objectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(92);
		}
		return zigBee_SAS_APS_fragmentation_objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZigBee_network_control_object() {
		if (zigBee_network_control_objectEClass == null) {
			zigBee_network_control_objectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(93);
		}
		return zigBee_network_control_objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZigBee_tunnel_setup_object() {
		if (zigBee_tunnel_setup_objectEClass == null) {
			zigBee_tunnel_setup_objectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(94);
		}
		return zigBee_tunnel_setup_objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrentAssociation() {
		if (currentAssociationEClass == null) {
			currentAssociationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(95);
		}
		return currentAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSAPAssignmentCurrent() {
		if (sapAssignmentCurrentEClass == null) {
			sapAssignmentCurrentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(96);
		}
		return sapAssignmentCurrentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecuritySetupObject() {
		if (securitySetupObjectEClass == null) {
			securitySetupObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(97);
		}
		return securitySetupObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvocationCounter() {
		if (invocationCounterEClass == null) {
			invocationCounterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(98);
		}
		return invocationCounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvocationCounter_Value() {
        return (EAttribute)getInvocationCounter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataProtectionObject() {
		if (dataProtectionObjectEClass == null) {
			dataProtectionObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(99);
		}
		return dataProtectionObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageTransferObject() {
		if (imageTransferObjectEClass == null) {
			imageTransferObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(100);
		}
		return imageTransferObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUtilitiesTableObject() {
		if (utilitiesTableObjectEClass == null) {
			utilitiesTableObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(101);
		}
		return utilitiesTableObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtilitiesTableObject_Standard() {
        return (EAttribute)getUtilitiesTableObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtilitiesTableObject_Manufacturer() {
        return (EAttribute)getUtilitiesTableObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtilitiesTableObject_StdPending() {
        return (EAttribute)getUtilitiesTableObject().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtilitiesTableObject_MfgPending() {
        return (EAttribute)getUtilitiesTableObject().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompactDataObject() {
		if (compactDataObjectEClass == null) {
			compactDataObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(102);
		}
		return compactDataObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceID() {
		if (deviceIDEClass == null) {
			deviceIDEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(103);
		}
		return deviceIDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceID_Value() {
        return (EAttribute)getDeviceID().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeteringPointID() {
		if (meteringPointIDEClass == null) {
			meteringPointIDEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(104);
		}
		return meteringPointIDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeteringPointID_Value() {
        return (EAttribute)getMeteringPointID().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterChangesObject() {
		if (parameterChangesObjectEClass == null) {
			parameterChangesObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(105);
		}
		return parameterChangesObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterChangesObject_NumberConfigProgramChanges() {
        return (EAttribute)getParameterChangesObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterChangesObject_DateLastConfigChange() {
        return (EAttribute)getParameterChangesObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterChangesObject_DateLastSwitchChange() {
        return (EAttribute)getParameterChangesObject().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterChangesObject_DateLastRippleControlChange() {
        return (EAttribute)getParameterChangesObject().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterChangesObject_StatusSecuritySwitches() {
        return (EAttribute)getParameterChangesObject().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterChangesObject_DateLastCalibration() {
        return (EAttribute)getParameterChangesObject().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterChangesObject_DateNextConfig() {
        return (EAttribute)getParameterChangesObject().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterChangesObject_DateActivationPassivCalendar() {
        return (EAttribute)getParameterChangesObject().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterChangesObject_NumberProtectedConfigChanges() {
        return (EAttribute)getParameterChangesObject().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterChangesObject_DateLastProtectedConfigChange() {
        return (EAttribute)getParameterChangesObject().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterChangesObject_DateLastClockSynch() {
        return (EAttribute)getParameterChangesObject().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterChangesObject_DateLastFirmwareActivation() {
        return (EAttribute)getParameterChangesObject().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI_O_control_signal_objects_contentsmanufacturerspecific() {
		if (i_O_control_signal_objects_contentsmanufacturerspecificEClass == null) {
			i_O_control_signal_objects_contentsmanufacturerspecificEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(106);
		}
		return i_O_control_signal_objects_contentsmanufacturerspecificEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI_O_control_signal_objects_contentsmanufacturerspecific_Value() {
        return (EAttribute)getI_O_control_signal_objects_contentsmanufacturerspecific().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI_O_control_signal_objects_contentsmappedtoareferencetable() {
		if (i_O_control_signal_objects_contentsmappedtoareferencetableEClass == null) {
			i_O_control_signal_objects_contentsmappedtoareferencetableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(107);
		}
		return i_O_control_signal_objects_contentsmappedtoareferencetableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI_O_control_signal_objects_global() {
		if (i_O_control_signal_objects_globalEClass == null) {
			i_O_control_signal_objects_globalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(108);
		}
		return i_O_control_signal_objects_globalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIOControlSignalsManufacturer() {
		if (ioControlSignalsManufacturerEClass == null) {
			ioControlSignalsManufacturerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(109);
		}
		return ioControlSignalsManufacturerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIOControlSignalsManufacturer_Value() {
        return (EAttribute)getIOControlSignalsManufacturer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIOControlSignalsMapped() {
		if (ioControlSignalsMappedEClass == null) {
			ioControlSignalsMappedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(110);
		}
		return ioControlSignalsMappedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIOControlSignalsGlobal() {
		if (ioControlSignalsGlobalEClass == null) {
			ioControlSignalsGlobalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(111);
		}
		return ioControlSignalsGlobalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisconnectControlObject() {
		if (disconnectControlObjectEClass == null) {
			disconnectControlObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(112);
		}
		return disconnectControlObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralPurposeArbitrator() {
		if (generalPurposeArbitratorEClass == null) {
			generalPurposeArbitratorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(113);
		}
		return generalPurposeArbitratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalControlManu() {
		if (internalControlManuEClass == null) {
			internalControlManuEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(114);
		}
		return internalControlManuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalControlManu_Value() {
        return (EAttribute)getInternalControlManu().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalControlMapped() {
		if (internalControlMappedEClass == null) {
			internalControlMappedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(115);
		}
		return internalControlMappedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalControlGlobal() {
		if (internalControlGlobalEClass == null) {
			internalControlGlobalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(116);
		}
		return internalControlGlobalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalOperatingStatusManu() {
		if (internalOperatingStatusManuEClass == null) {
			internalOperatingStatusManuEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(117);
		}
		return internalOperatingStatusManuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalOperatingStatusMapped() {
		if (internalOperatingStatusMappedEClass == null) {
			internalOperatingStatusMappedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(118);
		}
		return internalOperatingStatusMappedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalOperatingStatusGlobal() {
		if (internalOperatingStatusGlobalEClass == null) {
			internalOperatingStatusGlobalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(119);
		}
		return internalOperatingStatusGlobalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusRegisterManu() {
		if (statusRegisterManuEClass == null) {
			statusRegisterManuEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(120);
		}
		return statusRegisterManuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusRegisterMapped() {
		if (statusRegisterMappedEClass == null) {
			statusRegisterMappedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(121);
		}
		return statusRegisterMappedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorRegisterObject() {
		if (errorRegisterObjectEClass == null) {
			errorRegisterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(122);
		}
		return errorRegisterObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorRegisterObject_Value() {
        return (EAttribute)getErrorRegisterObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorProfileObject() {
		if (errorProfileObjectEClass == null) {
			errorProfileObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(123);
		}
		return errorProfileObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorTableObject() {
		if (errorTableObjectEClass == null) {
			errorTableObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(124);
		}
		return errorTableObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlarmRegisterObject() {
		if (alarmRegisterObjectEClass == null) {
			alarmRegisterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(125);
		}
		return alarmRegisterObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlarmRegisterObject_Value() {
        return (EAttribute)getAlarmRegisterObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlarmFilterObject() {
		if (alarmFilterObjectEClass == null) {
			alarmFilterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(126);
		}
		return alarmFilterObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlarmFilterObject_Value() {
        return (EAttribute)getAlarmFilterObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlarmDescriptorObject() {
		if (alarmDescriptorObjectEClass == null) {
			alarmDescriptorObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(127);
		}
		return alarmDescriptorObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlarmDescriptorObject_Value() {
        return (EAttribute)getAlarmDescriptorObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventLog() {
		if (eventLogEClass == null) {
			eventLogEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(128);
		}
		return eventLogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectricityID() {
		if (electricityIDEClass == null) {
			electricityIDEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(129);
		}
		return electricityIDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityID_Value() {
        return (EAttribute)getElectricityID().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectricityProgramEntries() {
		if (electricityProgramEntriesEClass == null) {
			electricityProgramEntriesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(130);
		}
		return electricityProgramEntriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityProgramEntries_Activefirmwareidentifier() {
        return (EAttribute)getElectricityProgramEntries().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityProgramEntries_Parameterrecordnumber() {
        return (EAttribute)getElectricityProgramEntries().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityProgramEntries_Timeswitchprogramnumber() {
        return (EAttribute)getElectricityProgramEntries().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityProgramEntries_RCRprogramnumber() {
        return (EAttribute)getElectricityProgramEntries().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityProgramEntries_MeterconnectiondiagramID() {
        return (EAttribute)getElectricityProgramEntries().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityProgramEntries_Passivecalendarname() {
        return (EAttribute)getElectricityProgramEntries().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityProgramEntries_Activefirmwaresignature() {
        return (EAttribute)getElectricityProgramEntries().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPulseValues_constants() {
		if (outputPulseValues_constantsEClass == null) {
			outputPulseValues_constantsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(131);
		}
		return outputPulseValues_constantsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputPulseValues_constants_ActiveenergymetrologicalLED() {
        return (EAttribute)getOutputPulseValues_constants().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputPulseValues_constants_ReactiveenergymetrologicalLED() {
        return (EAttribute)getOutputPulseValues_constants().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputPulseValues_constants_ApparentenergymetrologicalLED() {
        return (EAttribute)getOutputPulseValues_constants().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputPulseValues_constants_Activeenergyoutputpulse() {
        return (EAttribute)getOutputPulseValues_constants().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputPulseValues_constants_Reactiveenergyoutputpulse() {
        return (EAttribute)getOutputPulseValues_constants().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputPulseValues_constants_Apparentenergyoutputpulse() {
        return (EAttribute)getOutputPulseValues_constants().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputPulseValues_constants_Volt_squaredhoursmetrologicalLED() {
        return (EAttribute)getOutputPulseValues_constants().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputPulseValues_constants_Ampere_squaredhoursmetrologicalLED() {
        return (EAttribute)getOutputPulseValues_constants().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputPulseValues_constants_Volt_squaredhoursoutputpulse() {
        return (EAttribute)getOutputPulseValues_constants().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputPulseValues_constants_Ampere_squaredhoursoutputpulse() {
        return (EAttribute)getOutputPulseValues_constants().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadingFactorAndCT_VTratio() {
		if (readingFactorAndCT_VTratioEClass == null) {
			readingFactorAndCT_VTratioEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(132);
		}
		return readingFactorAndCT_VTratioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingFactorAndCT_VTratio_Readingfactorforpower() {
        return (EAttribute)getReadingFactorAndCT_VTratio().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingFactorAndCT_VTratio_Readingfactorforenergy() {
        return (EAttribute)getReadingFactorAndCT_VTratio().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingFactorAndCT_VTratio_Transformerratio_currentzaehler() {
        return (EAttribute)getReadingFactorAndCT_VTratio().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingFactorAndCT_VTratio_Transformerratio_voltagezaehler() {
        return (EAttribute)getReadingFactorAndCT_VTratio().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingFactorAndCT_VTratio_Overalltransformerratiozaehler() {
        return (EAttribute)getReadingFactorAndCT_VTratio().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingFactorAndCT_VTratio_Transformerratio_currentnenner() {
        return (EAttribute)getReadingFactorAndCT_VTratio().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingFactorAndCT_VTratio_Transformerratio_voltagenenner() {
        return (EAttribute)getReadingFactorAndCT_VTratio().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingFactorAndCT_VTratio_Overalltransformer_rationenner() {
        return (EAttribute)getReadingFactorAndCT_VTratio().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectricityNominalValues() {
		if (electricityNominalValuesEClass == null) {
			electricityNominalValuesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(133);
		}
		return electricityNominalValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityNominalValues_Voltage() {
        return (EAttribute)getElectricityNominalValues().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityNominalValues_Nominalcurrent() {
        return (EAttribute)getElectricityNominalValues().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityNominalValues_Frequency() {
        return (EAttribute)getElectricityNominalValues().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityNominalValues_Maximumcurrent() {
        return (EAttribute)getElectricityNominalValues().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityNominalValues_Reference_voltage_for_power_quality_measurement() {
        return (EAttribute)getElectricityNominalValues().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityNominalValues_Reference_voltage_for_aux_power_supply() {
        return (EAttribute)getElectricityNominalValues().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPulseValuesOrConstants() {
		if (inputPulseValuesOrConstantsEClass == null) {
			inputPulseValuesOrConstantsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(134);
		}
		return inputPulseValuesOrConstantsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputPulseValuesOrConstants_ActiveEnergy() {
        return (EAttribute)getInputPulseValuesOrConstants().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputPulseValuesOrConstants_Reactive_energy() {
        return (EAttribute)getInputPulseValuesOrConstants().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputPulseValuesOrConstants_Apparent_energy() {
        return (EAttribute)getInputPulseValuesOrConstants().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputPulseValuesOrConstants_Volt_squared_hours() {
        return (EAttribute)getInputPulseValuesOrConstants().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputPulseValuesOrConstants_Ampere_squared_hours() {
        return (EAttribute)getInputPulseValuesOrConstants().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputPulseValuesOrConstants_Unitless_quantities() {
        return (EAttribute)getInputPulseValuesOrConstants().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputPulseValuesOrConstants_Active_energy_export() {
        return (EAttribute)getInputPulseValuesOrConstants().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputPulseValuesOrConstants_Reactive_energy_export() {
        return (EAttribute)getInputPulseValuesOrConstants().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputPulseValuesOrConstants_Apparent_energy_export() {
        return (EAttribute)getInputPulseValuesOrConstants().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementPeriod_recordingInterval_billingPeriodDuration() {
		if (measurementPeriod_recordingInterval_billingPeriodDurationEClass == null) {
			measurementPeriod_recordingInterval_billingPeriodDurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(135);
		}
		return measurementPeriod_recordingInterval_billingPeriodDurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementPeriod_recordingInterval_billingPeriodDuration_Measurement_period_1_for_averaging_scheme_1() {
        return (EAttribute)getMeasurementPeriod_recordingInterval_billingPeriodDuration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementPeriod_recordingInterval_billingPeriodDuration_Measurement_period_2_for_averagingscheme_2() {
        return (EAttribute)getMeasurementPeriod_recordingInterval_billingPeriodDuration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementPeriod_recordingInterval_billingPeriodDuration_Measurement_period_3_for_instantaneous_value() {
        return (EAttribute)getMeasurementPeriod_recordingInterval_billingPeriodDuration().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementPeriod_recordingInterval_billingPeriodDuration_Measurement_period_4_for_test_value() {
        return (EAttribute)getMeasurementPeriod_recordingInterval_billingPeriodDuration().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementPeriod_recordingInterval_billingPeriodDuration_Recording_interval_1_for_loadprofile() {
        return (EAttribute)getMeasurementPeriod_recordingInterval_billingPeriodDuration().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementPeriod_recordingInterval_billingPeriodDuration_Recording_interval_2_for_loadprofile() {
        return (EAttribute)getMeasurementPeriod_recordingInterval_billingPeriodDuration().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementPeriod_recordingInterval_billingPeriodDuration_Billingperiod() {
        return (EAttribute)getMeasurementPeriod_recordingInterval_billingPeriodDuration().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectricityTimeEntries() {
		if (electricityTimeEntriesEClass == null) {
			electricityTimeEntriesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(136);
		}
		return electricityTimeEntriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityTimeEntries_Time_expired_since_last_end_of_billing_period() {
        return (EAttribute)getElectricityTimeEntries().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityTimeEntries_Localtime() {
        return (EAttribute)getElectricityTimeEntries().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityTimeEntries_Localdate() {
        return (EAttribute)getElectricityTimeEntries().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityTimeEntries_Weekday() {
        return (EAttribute)getElectricityTimeEntries().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityTimeEntries_Timeoflastreset() {
        return (EAttribute)getElectricityTimeEntries().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityTimeEntries_Dateoflastreset() {
        return (EAttribute)getElectricityTimeEntries().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityTimeEntries_Outputpulseduration() {
        return (EAttribute)getElectricityTimeEntries().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityTimeEntries_Clocksynchronizationwindow() {
        return (EAttribute)getElectricityTimeEntries().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityTimeEntries_Clock_synchronization_method() {
        return (EAttribute)getElectricityTimeEntries().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityTimeEntries_Clock_time_shift_limit() {
        return (EAttribute)getElectricityTimeEntries().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityTimeEntries_Billing_period_reset_lockout_time() {
        return (EAttribute)getElectricityTimeEntries().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoefficients() {
		if (coefficientsEClass == null) {
			coefficientsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(137);
		}
		return coefficientsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoefficients_Transformer_magnetic_losses() {
        return (EAttribute)getCoefficients().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoefficients_Transformer_iron_losses() {
        return (EAttribute)getCoefficients().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoefficients_Line_resistance_losses() {
        return (EAttribute)getCoefficients().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoefficients_Line_reactance_losses() {
        return (EAttribute)getCoefficients().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementMethods() {
		if (measurementMethodsEClass == null) {
			measurementMethodsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(138);
		}
		return measurementMethodsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementMethods_Algorithm_for_active_power_measurement() {
        return (EAttribute)getMeasurementMethods().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementMethods_Algorithm_for_active_energy_management() {
        return (EAttribute)getMeasurementMethods().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementMethods_Algorithm_for_reactive_power_measurement() {
        return (EAttribute)getMeasurementMethods().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementMethods_Algorithm_for_reactive_energy_measurement() {
        return (EAttribute)getMeasurementMethods().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementMethods_Algorithm_for_apparent_power_measurement() {
        return (EAttribute)getMeasurementMethods().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementMethods_Algorithm_for_apparent_energy_measurement() {
        return (EAttribute)getMeasurementMethods().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementMethods_Algorithm_for_power_factor_calculation() {
        return (EAttribute)getMeasurementMethods().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectricityMeteringPointID() {
		if (electricityMeteringPointIDEClass == null) {
			electricityMeteringPointIDEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(139);
		}
		return electricityMeteringPointIDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityMeteringPointID_Value() {
        return (EAttribute)getElectricityMeteringPointID().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectricityRelatedStatusData() {
		if (electricityRelatedStatusDataEClass == null) {
			electricityRelatedStatusDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(140);
		}
		return electricityRelatedStatusDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityRelatedStatusData_Status_information_missing_voltage() {
        return (EAttribute)getElectricityRelatedStatusData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityRelatedStatusData_Status_information_missing_current() {
        return (EAttribute)getElectricityRelatedStatusData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityRelatedStatusData_Status_information_current_without_voltage() {
        return (EAttribute)getElectricityRelatedStatusData().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityRelatedStatusData_Status_information_auxiliary_power_supply() {
        return (EAttribute)getElectricityRelatedStatusData().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectricityRelatedStatusDataMapped() {
		if (electricityRelatedStatusDataMappedEClass == null) {
			electricityRelatedStatusDataMappedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(141);
		}
		return electricityRelatedStatusDataMappedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBatteryEntries() {
		if (batteryEntriesEClass == null) {
			batteryEntriesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(142);
		}
		return batteryEntriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryEntries_Battery_use_time_counter() {
        return (EAttribute)getBatteryEntries().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryEntries_Battery_charge_display() {
        return (EAttribute)getBatteryEntries().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryEntries_Date_of_next_battery_change() {
        return (EAttribute)getBatteryEntries().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryEntries_Battery_voltage() {
        return (EAttribute)getBatteryEntries().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryEntries_Battery_initial_capacity() {
        return (EAttribute)getBatteryEntries().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryEntries_Battery_installation_date_and_time() {
        return (EAttribute)getBatteryEntries().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryEntries_Battery_estimated_remaining_use_time() {
        return (EAttribute)getBatteryEntries().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryEntries_Aux_supply_use_time_counter() {
        return (EAttribute)getBatteryEntries().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryEntries_Aux_voltage() {
        return (EAttribute)getBatteryEntries().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerFailureMonitoring() {
		if (powerFailureMonitoringEClass == null) {
			powerFailureMonitoringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(143);
		}
		return powerFailureMonitoringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerFailureMonitoring_FailuresAllPhases() {
        return (EAttribute)getPowerFailureMonitoring().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerFailureMonitoring_FailuresL1() {
        return (EAttribute)getPowerFailureMonitoring().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerFailureMonitoring_FailuresL2() {
        return (EAttribute)getPowerFailureMonitoring().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerFailureMonitoring_FailuresL3() {
        return (EAttribute)getPowerFailureMonitoring().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerFailureMonitoring_FailuresAny() {
        return (EAttribute)getPowerFailureMonitoring().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerFailureMonitoring_Auxiliarysupply() {
        return (EAttribute)getPowerFailureMonitoring().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerFailureMonitoring_LongFailsAll() {
        return (EAttribute)getPowerFailureMonitoring().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerFailureMonitoring_LongFailsL1() {
        return (EAttribute)getPowerFailureMonitoring().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerFailureMonitoring_LongFailsL2() {
        return (EAttribute)getPowerFailureMonitoring().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerFailureMonitoring_LongFailsL3() {
        return (EAttribute)getPowerFailureMonitoring().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerFailureMonitoring_LongFailsAny() {
        return (EAttribute)getPowerFailureMonitoring().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerFailureMonitoring_TimeAll() {
        return (EAttribute)getPowerFailureMonitoring().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerFailureMonitoring_TimeL1() {
        return (EAttribute)getPowerFailureMonitoring().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerFailureMonitoring_TimeL2() {
        return (EAttribute)getPowerFailureMonitoring().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerFailureMonitoring_TimeL3() {
        return (EAttribute)getPowerFailureMonitoring().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerFailureMonitoring_TimeAny() {
        return (EAttribute)getPowerFailureMonitoring().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerFailureMonitoring_DurationAll() {
        return (EAttribute)getPowerFailureMonitoring().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerFailureMonitoring_DurationL1() {
        return (EAttribute)getPowerFailureMonitoring().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerFailureMonitoring_DurationL2() {
        return (EAttribute)getPowerFailureMonitoring().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerFailureMonitoring_DurationL3() {
        return (EAttribute)getPowerFailureMonitoring().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerFailureMonitoring_DurationAny() {
        return (EAttribute)getPowerFailureMonitoring().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerFailureMonitoring_Time_threshold_long_powerfailure() {
        return (EAttribute)getPowerFailureMonitoring().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatingTime() {
		if (operatingTimeEClass == null) {
			operatingTimeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(144);
		}
		return operatingTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatingTime_Timeofoperation() {
        return (EAttribute)getOperatingTime().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironmentRelatedParameters() {
		if (environmentRelatedParametersEClass == null) {
			environmentRelatedParametersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(145);
		}
		return environmentRelatedParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentRelatedParameters_Ambient_temperature() {
        return (EAttribute)getEnvironmentRelatedParameters().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentRelatedParameters_Ambient_pressure() {
        return (EAttribute)getEnvironmentRelatedParameters().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentRelatedParameters_Relative_humidity() {
        return (EAttribute)getEnvironmentRelatedParameters().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusRegister() {
		if (statusRegisterEClass == null) {
			statusRegisterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(146);
		}
		return statusRegisterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventCode() {
		if (eventCodeEClass == null) {
			eventCodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(147);
		}
		return eventCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventCode_Event_code_object() {
        return (EAttribute)getEventCode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationPortLogParameters() {
		if (communicationPortLogParametersEClass == null) {
			communicationPortLogParametersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(148);
		}
		return communicationPortLogParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationPortLogParameters_Reserved() {
        return (EAttribute)getCommunicationPortLogParameters().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationPortLogParameters_Number_connections() {
        return (EAttribute)getCommunicationPortLogParameters().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationPortLogParameters_Communication_port_parameter() {
        return (EAttribute)getCommunicationPortLogParameters().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationPortLogParameters_GSM_field_strength() {
        return (EAttribute)getCommunicationPortLogParameters().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationPortLogParameters_Communicationaddress() {
        return (EAttribute)getCommunicationPortLogParameters().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsumerMessage() {
		if (consumerMessageEClass == null) {
			consumerMessageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(149);
		}
		return consumerMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsumerMessage_Consumer_message_via_local_consumer_information_port() {
        return (EAttribute)getConsumerMessage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsumerMessage_Consumer_message_via_meter_display() {
        return (EAttribute)getConsumerMessage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrentlyActiveTariff() {
		if (currentlyActiveTariffEClass == null) {
			currentlyActiveTariffEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(150);
		}
		return currentlyActiveTariffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrentlyActiveTariff_Value() {
        return (EAttribute)getCurrentlyActiveTariff().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventCounterObject() {
		if (eventCounterObjectEClass == null) {
			eventCounterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(151);
		}
		return eventCounterObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventCounterObject_Value() {
        return (EAttribute)getEventCounterObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfileEntryDigitalSignatureObject() {
		if (profileEntryDigitalSignatureObjectEClass == null) {
			profileEntryDigitalSignatureObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(152);
		}
		return profileEntryDigitalSignatureObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfileEntryDigitalSignatureObject_Value() {
        return (EAttribute)getProfileEntryDigitalSignatureObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeterTemperEventRelatedObject() {
		if (meterTemperEventRelatedObjectEClass == null) {
			meterTemperEventRelatedObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(153);
		}
		return meterTemperEventRelatedObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Meter_open_event_counter() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Meter_open_event_timestamp() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Meter_open_event_duration() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Meter_open_event_cumulative_duration() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Terminal_cover_open_event_counter() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Terminal_cover_open_event_time() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Terminal_cover_open_event_duration() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Terminal_cover_open_event_cumulative_duration() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Tilt_event_counter() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Tilt_event_time() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Tilt_event_duration() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Tilt_event_cumulative_duration() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Strong_DC_magnetic_field_event_counter() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Strong_DC_magnetic_field_event_time() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Strong_DC_magnetic_field_event_duration() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Strong_DC_magnetic_field_event_cumulative_duration() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Supply_control_switch_event_counter() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Supply_control_switch_event_time() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Supply_control_switch_event_duration() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Supply_control_switch_event_cumulative_duration() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Metrology_tamper_event_counter() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Metrology_tamper_event_time() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Metrology_tamper_event_duration() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Metrology_tamper_event_cumulative_duration() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Communication_tamper_event_counter() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Communication_tamper_event_time() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Communication_tamper_event_duration() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Communication_tamper_event_cumulative_duration() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterTemperEventRelatedObject_Manufacturer_specific() {
        return (EAttribute)getMeterTemperEventRelatedObject().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectricityValues() {
		if (electricityValuesEClass == null) {
			electricityValuesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(154);
		}
		return electricityValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerpL1() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerpall() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerpL2() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerpL3() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowermL2() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowermL1() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowermL3() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowermall() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ReactivePowerpL1() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ReactivePowerpL2() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ReactivePowerpL3() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ReactivePowerpall() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ReactivePowermL1() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ReactivePowermL2() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ReactivePowermL3() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ReactivePowermall() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ReactivePowerQIL1() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ReactivePowerQIL2() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ReactivePowerQIL3() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ReactivePowerQIall() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ReactivePowerQIIL1() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ReactivePowerQIIL2() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ReactivePowerQIIL3() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ReactivePowerQIIall() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ReactivePowerQIIIL1() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ReactivePowerQIIIL2() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ReactivePowerQIIIL3() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ReactivePowerQIIIall() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ReactivePowerQIVL1() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ReactivePowerQIVL2() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ReactivePowerQIVL3() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ReactivePowerQIVall() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ApparentPowerpL1() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ApparentPowerpL2() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ApparentPowerpL3() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ApparentPowerpAll() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ApparentPowermL1() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ApparentPowermL2() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ApparentPowermL3() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ApparentPowermAll() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_CurrentL1() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_CurrentL2() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_CurrentL3() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_CurrentAll() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_VoltageL1() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_VoltageL2() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_VoltageL3() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_VoltageAll() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_PowerFactorL1() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_PowerFactorL2() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_PowerFactorL3() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_PowerFactorAll() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_SupplyFrequencyL1() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_SupplyFrequencyL2() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_SupplyFrequencyL3() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_SupplyFrequencyAll() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerAbsPL1() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerAbsPL2() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerAbsPL3() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerAbsPAll() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerAbsML1() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerAbsML2() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerAbsML3() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerAbsMAll() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerQIL1() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerQIL2() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerQIL3() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerQIall() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerQIIL1() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerQIIL2() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerQIIL3() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerQIIall() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerQIIIL1() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerQIIIL2() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerQIIIL3() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerQIIIall() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerQIVL1() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerQIVL2() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerQIVL3() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_ActivePowerQIVall() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_Angles() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_Pulses() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_Ampere_squaredHours() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_Volt_squaredHours() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_NeutralCurrent() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityValues_NeutralVoltage() {
        return (EAttribute)getElectricityValues().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementValues() {
		if (measurementValuesEClass == null) {
			measurementValuesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(155);
		}
		return measurementValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Billing_period_average() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Cumulative_minimum() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Cumulative_maximum() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Minimum() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Current_average() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Last_average() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Maximum() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Instantaneous_value() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Time_integral() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Under_limit_threshold() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Under_limit_occurrence_counter() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Under_limit_duration() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Under_limit_magnitude() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Over_limit_threshold() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Over_limit_occurrence_counter() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Over_limit_duration() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Over_limit_magnitude() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Missing_threshold() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Missing_occurrence_counter() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Missing_duration() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Missing_magnitude() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Time_threshold_for_under_limit() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Time_threshold_for_over_limit() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Time_threshold_for_missing_magnitude() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Contracted_value() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Minimum_for_recording_interval() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Maximum_for_recording_interval() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValues_Test_average() {
        return (EAttribute)getMeasurementValues().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementValues_Calculations() {
        return (EReference)getMeasurementValues().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectricityHarmonics() {
		if (electricityHarmonicsEClass == null) {
			electricityHarmonicsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(156);
		}
		return electricityHarmonicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityHarmonics_Total() {
        return (EAttribute)getElectricityHarmonics().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityHarmonics_Fundamental_harmonic() {
        return (EAttribute)getElectricityHarmonics().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityHarmonics_Harmonic() {
        return (EAttribute)getElectricityHarmonics().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityHarmonics_Total_Harmoni_Distortion() {
        return (EAttribute)getElectricityHarmonics().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityHarmonics_Total_Demand_Distortion() {
        return (EAttribute)getElectricityHarmonics().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityHarmonics_All_harmonics() {
        return (EAttribute)getElectricityHarmonics().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricityHarmonics_All_harmonics_to_nominal_value_ratio() {
        return (EAttribute)getElectricityHarmonics().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedPhaseAngleMeasurement() {
		if (extendedPhaseAngleMeasurementEClass == null) {
			extendedPhaseAngleMeasurementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(157);
		}
		return extendedPhaseAngleMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromUL1toUL2() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromUL1toUL3() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromUL1toIL1() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromUL1toIL2() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromUL1toIL3() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromUL1toIL0() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromUL2toUL1() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromUL2toUL3() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromUL2toIL1() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromUL2toIL2() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromUL2toIL3() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromUL2toIL0() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromUL3toUL1() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromUL3toUL2() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromUL3toIL1() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromUL3toIL2() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromUL3toIL3() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromUL3toIL0() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromIL1toUL1() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromIL1toUL2() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromIL1toUL3() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromIL1toIL2() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromIL1toIL3() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromIL1toIL0() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromIL2toUL1() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromIL2toUL2() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromIL2toUL3() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromIL2toIL1() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromIL2toIL3() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromIL2toIL0() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromIL3toUL1() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromIL3toUL2() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromIL3toUL3() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromIL3toIL1() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromIL3toIL2() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromIL3toIL0() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromIL0toUL1() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromIL0toUL2() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromIL0toUL3() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromIL0toIL1() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromIL0toIL2() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPhaseAngleMeasurement_FromIL0toIL3() {
        return (EAttribute)getExtendedPhaseAngleMeasurement().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformerAndLineLosses() {
		if (transformerAndLineLossesEClass == null) {
			transformerAndLineLossesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI).getEClassifiers().get(158);
		}
		return transformerAndLineLossesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Active_line_losses_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Active_line_losses_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Active_line_losses() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Active_transformer_losses_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Active_transformer_losses_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Active_transformer_losses() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Active_losses_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Active_losses_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Active_losses() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Reactive_line_losses_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Reactive_line_losses_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Reactive_line_losses() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Reactive_transformer_losses_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Reactive_transformer_losses_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Reactive_transformer_losses() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Reactive_losses_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Reactive_losses_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Reactive_losses() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Total_normalized_transformer_losses() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Total_normalized_line_losses() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Compensated_active_gross_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Compensated_active_net_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Compensated_active_gross_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Compensated_active_net_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Compensated_reactive_gross_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Compensated_reactive_net_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Compensated_reactive_gross_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_Compensated_reactive_net_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L1active_line_losses() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L1active_line_losses_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L1active_transformer_losses_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L1active_transformer_losses_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L1active_transformer_losses() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L1active_losses_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L1active_losses_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L1active_losses() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L1reactive_line_losses_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L1reactive_line_losses_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L1reactive_line_losses() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L1reactive_transformer_losses_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L1reactive_transformer_losses_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L1reactive_transformer_losses() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L1Reactive_losses_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L1Reactive_losses_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L1Reactive_losses() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L1Ampere_squared_hours() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L1Volt_squared_hours() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L2active_line_losses_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L2active_line_losses_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L2active_transformer_losses_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L2active_transformer_losses_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L2active_transformer_losses() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L2active_losses_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L2active_losses_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L2active_losses() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L2reactive_line_losses_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L2reactive_line_losses_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L2reactive_line_losses() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L2reactive_transformer_losses() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L2reactive_transformer_losses_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L2reactive_transformer_losses_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L2reactive_losses() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L2reactive_losses_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L2reactive_losses_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L2Ampere_squared_hours() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L2Volt_squared_hours() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L3Active_line_losses_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L3Active_line_losses_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L3active_transformer_losses_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L3active_transformer_losses_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L3active_transformer_losses() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L3active_losses_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L3active_losses_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L3active_losses() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L3reactive_line_losses_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L3reactive_line_losses_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L3reactive_line_losses() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L3reactive_transformer_losses_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L3reactive_transformer_losses_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L3reactive_transformer_losses() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L3reactive_losses_P() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L3reactive_losses_M() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L3reactive_losses() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L3Ampere_squared_hours() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAndLineLosses_L3Volt_Squared_hours() {
        return (EAttribute)getTransformerAndLineLosses().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COSEMObjectsFactory getCOSEMObjectsFactory() {
		return (COSEMObjectsFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("gluemodel.COSEM.COSEMObjects." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //COSEMObjectsPackageImpl
