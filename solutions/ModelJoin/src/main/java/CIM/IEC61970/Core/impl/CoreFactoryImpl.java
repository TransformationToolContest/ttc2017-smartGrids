/**
 */
package CIM.IEC61970.Core.impl;

import CIM.IEC61970.Core.*;

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
public class CoreFactoryImpl extends EFactoryImpl implements CoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoreFactory init() {
		try {
			CoreFactory theCoreFactory = (CoreFactory)EPackage.Registry.INSTANCE.getEFactory(CorePackage.eNS_URI);
			if (theCoreFactory != null) {
				return theCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactoryImpl() {
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
			case CorePackage.BAY: return createBay();
			case CorePackage.TERMINAL: return createTerminal();
			case CorePackage.REPORTING_GROUP: return createReportingGroup();
			case CorePackage.BASE_POWER: return createBasePower();
			case CorePackage.REGULAR_INTERVAL_SCHEDULE: return createRegularIntervalSchedule();
			case CorePackage.CURVE: return createCurve();
			case CorePackage.BASE_VOLTAGE: return createBaseVoltage();
			case CorePackage.OPERATING_SHARE: return createOperatingShare();
			case CorePackage.CONNECTIVITY_NODE_CONTAINER: return createConnectivityNodeContainer();
			case CorePackage.IRREGULAR_TIME_POINT: return createIrregularTimePoint();
			case CorePackage.EQUIPMENT: return createEquipment();
			case CorePackage.SUB_GEOGRAPHICAL_REGION: return createSubGeographicalRegion();
			case CorePackage.UNIT: return createUnit();
			case CorePackage.REPORTING_SUPER_GROUP: return createReportingSuperGroup();
			case CorePackage.REGULAR_TIME_POINT: return createRegularTimePoint();
			case CorePackage.PSR_LIST: return createPsrList();
			case CorePackage.BASIC_INTERVAL_SCHEDULE: return createBasicIntervalSchedule();
			case CorePackage.IRREGULAR_INTERVAL_SCHEDULE: return createIrregularIntervalSchedule();
			case CorePackage.PSR_TYPE: return createPSRType();
			case CorePackage.OPERATING_PARTICIPANT: return createOperatingParticipant();
			case CorePackage.CURVE_DATA: return createCurveData();
			case CorePackage.EQUIPMENT_CONTAINER: return createEquipmentContainer();
			case CorePackage.POWER_SYSTEM_RESOURCE: return createPowerSystemResource();
			case CorePackage.SUBSTATION: return createSubstation();
			case CorePackage.GEOGRAPHICAL_REGION: return createGeographicalRegion();
			case CorePackage.IDENTIFIED_OBJECT: return createIdentifiedObject();
			case CorePackage.VOLTAGE_LEVEL: return createVoltageLevel();
			case CorePackage.CONNECTIVITY_NODE: return createConnectivityNode();
			case CorePackage.CONDUCTING_EQUIPMENT: return createConductingEquipment();
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
			case CorePackage.BREAKER_CONFIGURATION:
				return createBreakerConfigurationFromString(eDataType, initialValue);
			case CorePackage.BUSBAR_CONFIGURATION:
				return createBusbarConfigurationFromString(eDataType, initialValue);
			case CorePackage.COMPANY_TYPE:
				return createCompanyTypeFromString(eDataType, initialValue);
			case CorePackage.CURVE_STYLE:
				return createCurveStyleFromString(eDataType, initialValue);
			case CorePackage.PHASE_CODE:
				return createPhaseCodeFromString(eDataType, initialValue);
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
			case CorePackage.BREAKER_CONFIGURATION:
				return convertBreakerConfigurationToString(eDataType, instanceValue);
			case CorePackage.BUSBAR_CONFIGURATION:
				return convertBusbarConfigurationToString(eDataType, instanceValue);
			case CorePackage.COMPANY_TYPE:
				return convertCompanyTypeToString(eDataType, instanceValue);
			case CorePackage.CURVE_STYLE:
				return convertCurveStyleToString(eDataType, instanceValue);
			case CorePackage.PHASE_CODE:
				return convertPhaseCodeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bay createBay() {
		BayImpl bay = new BayImpl();
		return bay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal createTerminal() {
		TerminalImpl terminal = new TerminalImpl();
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingGroup createReportingGroup() {
		ReportingGroupImpl reportingGroup = new ReportingGroupImpl();
		return reportingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasePower createBasePower() {
		BasePowerImpl basePower = new BasePowerImpl();
		return basePower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularIntervalSchedule createRegularIntervalSchedule() {
		RegularIntervalScheduleImpl regularIntervalSchedule = new RegularIntervalScheduleImpl();
		return regularIntervalSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Curve createCurve() {
		CurveImpl curve = new CurveImpl();
		return curve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseVoltage createBaseVoltage() {
		BaseVoltageImpl baseVoltage = new BaseVoltageImpl();
		return baseVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingShare createOperatingShare() {
		OperatingShareImpl operatingShare = new OperatingShareImpl();
		return operatingShare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectivityNodeContainer createConnectivityNodeContainer() {
		ConnectivityNodeContainerImpl connectivityNodeContainer = new ConnectivityNodeContainerImpl();
		return connectivityNodeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IrregularTimePoint createIrregularTimePoint() {
		IrregularTimePointImpl irregularTimePoint = new IrregularTimePointImpl();
		return irregularTimePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipment createEquipment() {
		EquipmentImpl equipment = new EquipmentImpl();
		return equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubGeographicalRegion createSubGeographicalRegion() {
		SubGeographicalRegionImpl subGeographicalRegion = new SubGeographicalRegionImpl();
		return subGeographicalRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingSuperGroup createReportingSuperGroup() {
		ReportingSuperGroupImpl reportingSuperGroup = new ReportingSuperGroupImpl();
		return reportingSuperGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularTimePoint createRegularTimePoint() {
		RegularTimePointImpl regularTimePoint = new RegularTimePointImpl();
		return regularTimePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsrList createPsrList() {
		PsrListImpl psrList = new PsrListImpl();
		return psrList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicIntervalSchedule createBasicIntervalSchedule() {
		BasicIntervalScheduleImpl basicIntervalSchedule = new BasicIntervalScheduleImpl();
		return basicIntervalSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IrregularIntervalSchedule createIrregularIntervalSchedule() {
		IrregularIntervalScheduleImpl irregularIntervalSchedule = new IrregularIntervalScheduleImpl();
		return irregularIntervalSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSRType createPSRType() {
		PSRTypeImpl psrType = new PSRTypeImpl();
		return psrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingParticipant createOperatingParticipant() {
		OperatingParticipantImpl operatingParticipant = new OperatingParticipantImpl();
		return operatingParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveData createCurveData() {
		CurveDataImpl curveData = new CurveDataImpl();
		return curveData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquipmentContainer createEquipmentContainer() {
		EquipmentContainerImpl equipmentContainer = new EquipmentContainerImpl();
		return equipmentContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSystemResource createPowerSystemResource() {
		PowerSystemResourceImpl powerSystemResource = new PowerSystemResourceImpl();
		return powerSystemResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substation createSubstation() {
		SubstationImpl substation = new SubstationImpl();
		return substation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographicalRegion createGeographicalRegion() {
		GeographicalRegionImpl geographicalRegion = new GeographicalRegionImpl();
		return geographicalRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiedObject createIdentifiedObject() {
		IdentifiedObjectImpl identifiedObject = new IdentifiedObjectImpl();
		return identifiedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageLevel createVoltageLevel() {
		VoltageLevelImpl voltageLevel = new VoltageLevelImpl();
		return voltageLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectivityNode createConnectivityNode() {
		ConnectivityNodeImpl connectivityNode = new ConnectivityNodeImpl();
		return connectivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductingEquipment createConductingEquipment() {
		ConductingEquipmentImpl conductingEquipment = new ConductingEquipmentImpl();
		return conductingEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakerConfiguration createBreakerConfigurationFromString(EDataType eDataType, String initialValue) {
		BreakerConfiguration result = BreakerConfiguration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBreakerConfigurationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusbarConfiguration createBusbarConfigurationFromString(EDataType eDataType, String initialValue) {
		BusbarConfiguration result = BusbarConfiguration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBusbarConfigurationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompanyType createCompanyTypeFromString(EDataType eDataType, String initialValue) {
		CompanyType result = CompanyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompanyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveStyle createCurveStyleFromString(EDataType eDataType, String initialValue) {
		CurveStyle result = CurveStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCurveStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseCode createPhaseCodeFromString(EDataType eDataType, String initialValue) {
		PhaseCode result = PhaseCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhaseCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorePackage getCorePackage() {
		return (CorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorePackage getPackage() {
		return CorePackage.eINSTANCE;
	}

} //CoreFactoryImpl
