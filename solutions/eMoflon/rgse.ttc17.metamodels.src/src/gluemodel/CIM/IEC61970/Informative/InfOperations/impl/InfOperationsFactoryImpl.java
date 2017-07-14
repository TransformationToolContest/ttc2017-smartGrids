/**
 */
package gluemodel.CIM.IEC61970.Informative.InfOperations.impl;

import gluemodel.CIM.IEC61970.Informative.InfOperations.*;

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
public class InfOperationsFactoryImpl extends EFactoryImpl implements InfOperationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfOperationsFactory init() {
		try {
			InfOperationsFactory theInfOperationsFactory = (InfOperationsFactory)EPackage.Registry.INSTANCE.getEFactory(InfOperationsPackage.eNS_URI);
			if (theInfOperationsFactory != null) {
				return theInfOperationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfOperationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfOperationsFactoryImpl() {
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
			case InfOperationsPackage.SWITCHING_STEP: return createSwitchingStep();
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE: return createErpPersonScheduleStepRole();
			case InfOperationsPackage.CHANGE_ITEM: return createChangeItem();
			case InfOperationsPackage.CIRCUIT: return createCircuit();
			case InfOperationsPackage.COMPLIANCE_EVENT: return createComplianceEvent();
			case InfOperationsPackage.CHANGE_SET: return createChangeSet();
			case InfOperationsPackage.CALL_BACK: return createCallBack();
			case InfOperationsPackage.SWITCHING_SCHEDULE: return createSwitchingSchedule();
			case InfOperationsPackage.PLANNED_OUTAGE: return createPlannedOutage();
			case InfOperationsPackage.TROUBLE_TICKET: return createTroubleTicket();
			case InfOperationsPackage.SAFETY_DOCUMENT: return createSafetyDocument();
			case InfOperationsPackage.INCIDENT_RECORD: return createIncidentRecord();
			case InfOperationsPackage.LAND_BASE: return createLandBase();
			case InfOperationsPackage.OUTAGE_CODE: return createOutageCode();
			case InfOperationsPackage.PSR_EVENT: return createPSREvent();
			case InfOperationsPackage.ORG_PSR_ROLE: return createOrgPsrRole();
			case InfOperationsPackage.OUTAGE_NOTIFICATION: return createOutageNotification();
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE: return createOutageStepPsrRole();
			case InfOperationsPackage.OUTAGE_STEP: return createOutageStep();
			case InfOperationsPackage.OUTAGE_REPORT: return createOutageReport();
			case InfOperationsPackage.OUTAGE_RECORD: return createOutageRecord();
			case InfOperationsPackage.OPERATIONAL_RESTRICTION: return createOperationalRestriction();
			case InfOperationsPackage.NETWORK_DATA_SET: return createNetworkDataSet();
			case InfOperationsPackage.INCIDENT_CODE: return createIncidentCode();
			case InfOperationsPackage.CIRCUIT_SECTION: return createCircuitSection();
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
			case InfOperationsPackage.OUTAGE_KIND:
				return createOutageKindFromString(eDataType, initialValue);
			case InfOperationsPackage.CHANGE_ITEM_KIND:
				return createChangeItemKindFromString(eDataType, initialValue);
			case InfOperationsPackage.TROUBLE_REPORTING_KIND:
				return createTroubleReportingKindFromString(eDataType, initialValue);
			case InfOperationsPackage.SWITCHING_STEP_STATUS_KIND:
				return createSwitchingStepStatusKindFromString(eDataType, initialValue);
			case InfOperationsPackage.PSR_EVENT_KIND:
				return createPSREventKindFromString(eDataType, initialValue);
			case InfOperationsPackage.CIRCUIT_CONNECTION_KIND:
				return createCircuitConnectionKindFromString(eDataType, initialValue);
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
			case InfOperationsPackage.OUTAGE_KIND:
				return convertOutageKindToString(eDataType, instanceValue);
			case InfOperationsPackage.CHANGE_ITEM_KIND:
				return convertChangeItemKindToString(eDataType, instanceValue);
			case InfOperationsPackage.TROUBLE_REPORTING_KIND:
				return convertTroubleReportingKindToString(eDataType, instanceValue);
			case InfOperationsPackage.SWITCHING_STEP_STATUS_KIND:
				return convertSwitchingStepStatusKindToString(eDataType, instanceValue);
			case InfOperationsPackage.PSR_EVENT_KIND:
				return convertPSREventKindToString(eDataType, instanceValue);
			case InfOperationsPackage.CIRCUIT_CONNECTION_KIND:
				return convertCircuitConnectionKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchingStep createSwitchingStep() {
		SwitchingStepImpl switchingStep = new SwitchingStepImpl();
		return switchingStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPersonScheduleStepRole createErpPersonScheduleStepRole() {
		ErpPersonScheduleStepRoleImpl erpPersonScheduleStepRole = new ErpPersonScheduleStepRoleImpl();
		return erpPersonScheduleStepRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeItem createChangeItem() {
		ChangeItemImpl changeItem = new ChangeItemImpl();
		return changeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Circuit createCircuit() {
		CircuitImpl circuit = new CircuitImpl();
		return circuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplianceEvent createComplianceEvent() {
		ComplianceEventImpl complianceEvent = new ComplianceEventImpl();
		return complianceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeSet createChangeSet() {
		ChangeSetImpl changeSet = new ChangeSetImpl();
		return changeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallBack createCallBack() {
		CallBackImpl callBack = new CallBackImpl();
		return callBack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchingSchedule createSwitchingSchedule() {
		SwitchingScheduleImpl switchingSchedule = new SwitchingScheduleImpl();
		return switchingSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedOutage createPlannedOutage() {
		PlannedOutageImpl plannedOutage = new PlannedOutageImpl();
		return plannedOutage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TroubleTicket createTroubleTicket() {
		TroubleTicketImpl troubleTicket = new TroubleTicketImpl();
		return troubleTicket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyDocument createSafetyDocument() {
		SafetyDocumentImpl safetyDocument = new SafetyDocumentImpl();
		return safetyDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncidentRecord createIncidentRecord() {
		IncidentRecordImpl incidentRecord = new IncidentRecordImpl();
		return incidentRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LandBase createLandBase() {
		LandBaseImpl landBase = new LandBaseImpl();
		return landBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageCode createOutageCode() {
		OutageCodeImpl outageCode = new OutageCodeImpl();
		return outageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSREvent createPSREvent() {
		PSREventImpl psrEvent = new PSREventImpl();
		return psrEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgPsrRole createOrgPsrRole() {
		OrgPsrRoleImpl orgPsrRole = new OrgPsrRoleImpl();
		return orgPsrRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageNotification createOutageNotification() {
		OutageNotificationImpl outageNotification = new OutageNotificationImpl();
		return outageNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageStepPsrRole createOutageStepPsrRole() {
		OutageStepPsrRoleImpl outageStepPsrRole = new OutageStepPsrRoleImpl();
		return outageStepPsrRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageStep createOutageStep() {
		OutageStepImpl outageStep = new OutageStepImpl();
		return outageStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageReport createOutageReport() {
		OutageReportImpl outageReport = new OutageReportImpl();
		return outageReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageRecord createOutageRecord() {
		OutageRecordImpl outageRecord = new OutageRecordImpl();
		return outageRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalRestriction createOperationalRestriction() {
		OperationalRestrictionImpl operationalRestriction = new OperationalRestrictionImpl();
		return operationalRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkDataSet createNetworkDataSet() {
		NetworkDataSetImpl networkDataSet = new NetworkDataSetImpl();
		return networkDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncidentCode createIncidentCode() {
		IncidentCodeImpl incidentCode = new IncidentCodeImpl();
		return incidentCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitSection createCircuitSection() {
		CircuitSectionImpl circuitSection = new CircuitSectionImpl();
		return circuitSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageKind createOutageKindFromString(EDataType eDataType, String initialValue) {
		OutageKind result = OutageKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutageKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeItemKind createChangeItemKindFromString(EDataType eDataType, String initialValue) {
		ChangeItemKind result = ChangeItemKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChangeItemKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TroubleReportingKind createTroubleReportingKindFromString(EDataType eDataType, String initialValue) {
		TroubleReportingKind result = TroubleReportingKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTroubleReportingKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchingStepStatusKind createSwitchingStepStatusKindFromString(EDataType eDataType, String initialValue) {
		SwitchingStepStatusKind result = SwitchingStepStatusKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSwitchingStepStatusKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSREventKind createPSREventKindFromString(EDataType eDataType, String initialValue) {
		PSREventKind result = PSREventKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPSREventKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitConnectionKind createCircuitConnectionKindFromString(EDataType eDataType, String initialValue) {
		CircuitConnectionKind result = CircuitConnectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCircuitConnectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfOperationsPackage getInfOperationsPackage() {
		return (InfOperationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfOperationsPackage getPackage() {
		return InfOperationsPackage.eINSTANCE;
	}

} //InfOperationsFactoryImpl
