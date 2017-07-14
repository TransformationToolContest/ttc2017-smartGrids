/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules.impl;

import gluemodel.GluemodelPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.tgg.language.LanguagePackage;

import outagePreventionJointarget.OutagePreventionJointargetPackage;

import rgse.ttc17.emoflon.tgg.task2.Rules.RulesFactory;
import rgse.ttc17.emoflon.tgg.task2.Rules.RulesPackage;

import rgse.ttc17.emoflon.tgg.task2.Task2Package;

import rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesPackageImpl extends EPackageImpl implements RulesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tieFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonConformLoadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDeliveryPointLinkMeterAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadAreaEClass = null;

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
	private EClass locationEClass = null;

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
	private EClass conformLoadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformLoadGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationSupplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalEClass = null;

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
	private EClass energyConsumerLinkServiceDeliveryPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadAreaLinkControlAreaEClass = null;

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
	private EClass nonConformLoadGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tieFlowLinkControlAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerSystemResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privateMeterVoltageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pmuVoltageMeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subLoadAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energyConsumerEClass = null;

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
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.RulesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RulesPackageImpl() {
		super(eNS_URI, RulesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RulesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static RulesPackage init() {
		if (isInited)
			return (RulesPackage) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);

		// Obtain or create and register package
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new RulesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OutagePreventionJointargetPackage.eINSTANCE.eClass();
		GluemodelPackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Task2PackageImpl theTask2Package = (Task2PackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(Task2Package.eNS_URI) instanceof Task2PackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(Task2Package.eNS_URI) : Task2Package.eINSTANCE);

		// Load packages
		theTask2Package.loadPackage();

		// Fix loaded packages
		theRulesPackage.fixPackageContents();
		theTask2Package.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theRulesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RulesPackage.eNS_URI, theRulesPackage);
		return theRulesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTieFlow() {
		if (tieFlowEClass == null) {
			tieFlowEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(0);
		}
		return tieFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlow__IsAppropriate_FWD__Match_MeterAssetMMXUPair_ConductingEquipment_MeterAsset_Terminal_TieFlow_Location() {
		return getTieFlow().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlow__Perform_FWD__IsApplicableMatch() {
		return getTieFlow().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlow__IsApplicable_FWD__Match() {
		return getTieFlow().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlow__RegisterObjectsToMatch_FWD__Match_MeterAssetMMXUPair_ConductingEquipment_MeterAsset_Terminal_TieFlow_Location() {
		return getTieFlow().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlow__IsAppropriate_solveCsp_FWD__Match_MeterAssetMMXUPair_ConductingEquipment_MeterAsset_Terminal_TieFlow_Location() {
		return getTieFlow().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlow__IsAppropriate_checkCsp_FWD__CSP() {
		return getTieFlow().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlow__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAssetMMXUPair_TerminalToTerminal_ConductingEquipment_MeterAsset_Terminal_TieFlow_Location_Terminal() {
		return getTieFlow().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlow__IsApplicable_checkCsp_FWD__CSP() {
		return getTieFlow().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlow__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTieFlow().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlow__CheckTypes_FWD__Match() {
		return getTieFlow().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlow__IsAppropriate_FWD_EMoflonEdge_13__EMoflonEdge() {
		return getTieFlow().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlow__CheckAttributes_FWD__TripleMatch() {
		return getTieFlow().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlow__IsApplicable_CC__Match_Match() {
		return getTieFlow().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlow__CheckDEC_FWD__MeterAssetMMXUPair_ConductingEquipment_MeterAsset_Terminal_TieFlow_Location() {
		return getTieFlow().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionPoint() {
		if (positionPointEClass == null) {
			positionPointEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(1);
		}
		return positionPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPoint__IsAppropriate_FWD__Match_MeterAssetMMXUPair_MeterAsset_Location_PositionPoint() {
		return getPositionPoint().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPoint__Perform_FWD__IsApplicableMatch() {
		return getPositionPoint().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPoint__IsApplicable_FWD__Match() {
		return getPositionPoint().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPoint__RegisterObjectsToMatch_FWD__Match_MeterAssetMMXUPair_MeterAsset_Location_PositionPoint() {
		return getPositionPoint().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPoint__IsAppropriate_solveCsp_FWD__Match_MeterAssetMMXUPair_MeterAsset_Location_PositionPoint() {
		return getPositionPoint().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPoint__IsAppropriate_checkCsp_FWD__CSP() {
		return getPositionPoint().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPoint__IsApplicable_solveCsp_FWD__IsApplicableMatch_LocationToLocation_MeterAssetMMXUPair_MeterAsset_Location_PositionPoint_Location() {
		return getPositionPoint().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPoint__IsApplicable_checkCsp_FWD__CSP() {
		return getPositionPoint().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPoint__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPositionPoint().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPoint__CheckTypes_FWD__Match() {
		return getPositionPoint().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPoint__IsAppropriate_FWD_EMoflonEdge_14__EMoflonEdge() {
		return getPositionPoint().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPoint__CheckAttributes_FWD__TripleMatch() {
		return getPositionPoint().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPoint__IsApplicable_CC__Match_Match() {
		return getPositionPoint().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPoint__CheckDEC_FWD__MeterAssetMMXUPair_MeterAsset_Location_PositionPoint() {
		return getPositionPoint().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonConformLoad() {
		if (nonConformLoadEClass == null) {
			nonConformLoadEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(2);
		}
		return nonConformLoadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoad__IsAppropriate_FWD__Match_NonConformLoad_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getNonConformLoad().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoad__Perform_FWD__IsApplicableMatch() {
		return getNonConformLoad().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoad__IsApplicable_FWD__Match() {
		return getNonConformLoad().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoad__RegisterObjectsToMatch_FWD__Match_NonConformLoad_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getNonConformLoad().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoad__IsAppropriate_solveCsp_FWD__Match_NonConformLoad_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getNonConformLoad().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoad__IsAppropriate_checkCsp_FWD__CSP() {
		return getNonConformLoad().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoad__IsApplicable_solveCsp_FWD__IsApplicableMatch_NonConformLoad_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPointToServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getNonConformLoad().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoad__IsApplicable_checkCsp_FWD__CSP() {
		return getNonConformLoad().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoad__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getNonConformLoad().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoad__CheckTypes_FWD__Match() {
		return getNonConformLoad().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoad__IsAppropriate_FWD_EMoflonEdge_15__EMoflonEdge() {
		return getNonConformLoad().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoad__CheckAttributes_FWD__TripleMatch() {
		return getNonConformLoad().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoad__IsApplicable_CC__Match_Match() {
		return getNonConformLoad().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoad__CheckDEC_FWD__NonConformLoad_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getNonConformLoad().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDeliveryPointLinkMeterAsset() {
		if (serviceDeliveryPointLinkMeterAssetEClass == null) {
			serviceDeliveryPointLinkMeterAssetEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(3);
		}
		return serviceDeliveryPointLinkMeterAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPointLinkMeterAsset__IsAppropriate_FWD__Match_MeterAssetPhysicalDevicePair_MeterAsset_ServiceDeliveryPoint() {
		return getServiceDeliveryPointLinkMeterAsset().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPointLinkMeterAsset__Perform_FWD__IsApplicableMatch() {
		return getServiceDeliveryPointLinkMeterAsset().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPointLinkMeterAsset__IsApplicable_FWD__Match() {
		return getServiceDeliveryPointLinkMeterAsset().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPointLinkMeterAsset__RegisterObjectsToMatch_FWD__Match_MeterAssetPhysicalDevicePair_MeterAsset_ServiceDeliveryPoint() {
		return getServiceDeliveryPointLinkMeterAsset().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPointLinkMeterAsset__IsAppropriate_solveCsp_FWD__Match_MeterAssetPhysicalDevicePair_MeterAsset_ServiceDeliveryPoint() {
		return getServiceDeliveryPointLinkMeterAsset().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPointLinkMeterAsset__IsAppropriate_checkCsp_FWD__CSP() {
		return getServiceDeliveryPointLinkMeterAsset().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPointLinkMeterAsset__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_ServiceDeliveryPointToServiceDeliveryPoint_MeterAsset_MeterAssetToPrivateMeterVoltage_PrivateMeterVoltage_ServiceDeliveryPoint() {
		return getServiceDeliveryPointLinkMeterAsset().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPointLinkMeterAsset__IsApplicable_checkCsp_FWD__CSP() {
		return getServiceDeliveryPointLinkMeterAsset().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPointLinkMeterAsset__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getServiceDeliveryPointLinkMeterAsset().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPointLinkMeterAsset__CheckTypes_FWD__Match() {
		return getServiceDeliveryPointLinkMeterAsset().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPointLinkMeterAsset__IsAppropriate_FWD_EMoflonEdge_16__EMoflonEdge() {
		return getServiceDeliveryPointLinkMeterAsset().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPointLinkMeterAsset__CheckAttributes_FWD__TripleMatch() {
		return getServiceDeliveryPointLinkMeterAsset().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPointLinkMeterAsset__IsApplicable_CC__Match_Match() {
		return getServiceDeliveryPointLinkMeterAsset().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPointLinkMeterAsset__CheckDEC_FWD__MeterAssetPhysicalDevicePair_MeterAsset_ServiceDeliveryPoint() {
		return getServiceDeliveryPointLinkMeterAsset().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZone() {
		if (zoneEClass == null) {
			zoneEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(4);
		}
		return zoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZone__IsAppropriate_FWD__Match_Zone_MeterAsset_MeterAssetMMXUPair() {
		return getZone().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZone__Perform_FWD__IsApplicableMatch() {
		return getZone().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZone__IsApplicable_FWD__Match() {
		return getZone().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZone__RegisterObjectsToMatch_FWD__Match_Zone_MeterAsset_MeterAssetMMXUPair() {
		return getZone().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZone__IsAppropriate_solveCsp_FWD__Match_Zone_MeterAsset_MeterAssetMMXUPair() {
		return getZone().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZone__IsAppropriate_checkCsp_FWD__CSP() {
		return getZone().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZone__IsApplicable_solveCsp_FWD__IsApplicableMatch_Zone_MeterAsset_PMUVoltageMeter_MeterAssetToPMUVoltageMeter_MeterAssetMMXUPair() {
		return getZone().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZone__IsApplicable_checkCsp_FWD__CSP() {
		return getZone().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZone__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getZone().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZone__CheckTypes_FWD__Match() {
		return getZone().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZone__IsAppropriate_FWD_EMoflonEdge_17__EMoflonEdge() {
		return getZone().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZone__CheckAttributes_FWD__TripleMatch() {
		return getZone().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZone__IsApplicable_CC__Match_Match() {
		return getZone().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZone__CheckDEC_FWD__Zone_MeterAsset_MeterAssetMMXUPair() {
		return getZone().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadArea() {
		if (loadAreaEClass == null) {
			loadAreaEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(5);
		}
		return loadAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadArea__IsAppropriate_FWD__Match_SubLoadArea_ConformLoadGroup_MeterAsset_MeterAssetPhysicalDevicePair_ConformLoad_LoadArea_ServiceDeliveryPoint() {
		return getLoadArea().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadArea__Perform_FWD__IsApplicableMatch() {
		return getLoadArea().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadArea__IsApplicable_FWD__Match() {
		return getLoadArea().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadArea__RegisterObjectsToMatch_FWD__Match_SubLoadArea_ConformLoadGroup_MeterAsset_MeterAssetPhysicalDevicePair_ConformLoad_LoadArea_ServiceDeliveryPoint() {
		return getLoadArea().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadArea__IsAppropriate_solveCsp_FWD__Match_SubLoadArea_ConformLoadGroup_MeterAsset_MeterAssetPhysicalDevicePair_ConformLoad_LoadArea_ServiceDeliveryPoint() {
		return getLoadArea().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadArea__IsAppropriate_checkCsp_FWD__CSP() {
		return getLoadArea().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadArea__IsApplicable_solveCsp_FWD__IsApplicableMatch_SubLoadArea_ConformLoadGroup_SubLoadArea_MeterAsset_MeterAssetPhysicalDevicePair_ConformLoad_LoadArea_SubLoadAreaToSubLoadArea_ServiceDeliveryPoint() {
		return getLoadArea().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadArea__IsApplicable_checkCsp_FWD__CSP() {
		return getLoadArea().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadArea__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getLoadArea().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadArea__CheckTypes_FWD__Match() {
		return getLoadArea().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadArea__IsAppropriate_FWD_EMoflonEdge_18__EMoflonEdge() {
		return getLoadArea().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadArea__CheckAttributes_FWD__TripleMatch() {
		return getLoadArea().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadArea__IsApplicable_CC__Match_Match() {
		return getLoadArea().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadArea__CheckDEC_FWD__SubLoadArea_ConformLoadGroup_MeterAsset_MeterAssetPhysicalDevicePair_ConformLoad_LoadArea_ServiceDeliveryPoint() {
		return getLoadArea().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLocation() {
		if (serviceLocationEClass == null) {
			serviceLocationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(6);
		}
		return serviceLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceLocation__IsAppropriate_FWD__Match_ServiceLocation_MeterAsset_MeterAssetMMXUPair() {
		return getServiceLocation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceLocation__Perform_FWD__IsApplicableMatch() {
		return getServiceLocation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceLocation__IsApplicable_FWD__Match() {
		return getServiceLocation().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceLocation__RegisterObjectsToMatch_FWD__Match_ServiceLocation_MeterAsset_MeterAssetMMXUPair() {
		return getServiceLocation().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceLocation__IsAppropriate_solveCsp_FWD__Match_ServiceLocation_MeterAsset_MeterAssetMMXUPair() {
		return getServiceLocation().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceLocation__IsAppropriate_checkCsp_FWD__CSP() {
		return getServiceLocation().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceLocation__IsApplicable_solveCsp_FWD__IsApplicableMatch_ServiceLocation_MeterAsset_PMUVoltageMeter_MeterAssetToPMUVoltageMeter_MeterAssetMMXUPair() {
		return getServiceLocation().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceLocation__IsApplicable_checkCsp_FWD__CSP() {
		return getServiceLocation().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceLocation__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getServiceLocation().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceLocation__CheckTypes_FWD__Match() {
		return getServiceLocation().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceLocation__IsAppropriate_FWD_EMoflonEdge_19__EMoflonEdge() {
		return getServiceLocation().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceLocation__CheckAttributes_FWD__TripleMatch() {
		return getServiceLocation().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceLocation__IsApplicable_CC__Match_Match() {
		return getServiceLocation().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceLocation__CheckDEC_FWD__ServiceLocation_MeterAsset_MeterAssetMMXUPair() {
		return getServiceLocation().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		if (locationEClass == null) {
			locationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(7);
		}
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__IsAppropriate_FWD__Match_Location_MeterAsset_MeterAssetMMXUPair() {
		return getLocation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__Perform_FWD__IsApplicableMatch() {
		return getLocation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__IsApplicable_FWD__Match() {
		return getLocation().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__RegisterObjectsToMatch_FWD__Match_Location_MeterAsset_MeterAssetMMXUPair() {
		return getLocation().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__IsAppropriate_solveCsp_FWD__Match_Location_MeterAsset_MeterAssetMMXUPair() {
		return getLocation().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__IsAppropriate_checkCsp_FWD__CSP() {
		return getLocation().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__IsApplicable_solveCsp_FWD__IsApplicableMatch_Location_PMUVoltageMeter_MeterAssetToPMUVoltageMeter_MeterAsset_MeterAssetMMXUPair() {
		return getLocation().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__IsApplicable_checkCsp_FWD__CSP() {
		return getLocation().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getLocation().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__CheckTypes_FWD__Match() {
		return getLocation().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__IsAppropriate_FWD_EMoflonEdge_20__EMoflonEdge() {
		return getLocation().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__CheckAttributes_FWD__TripleMatch() {
		return getLocation().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__IsApplicable_CC__Match_Match() {
		return getLocation().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__CheckDEC_FWD__Location_MeterAsset_MeterAssetMMXUPair() {
		return getLocation().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSDPLocation() {
		if (sdpLocationEClass == null) {
			sdpLocationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(8);
		}
		return sdpLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSDPLocation__IsAppropriate_FWD__Match_SDPLocation_MeterAsset_MeterAssetMMXUPair() {
		return getSDPLocation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSDPLocation__Perform_FWD__IsApplicableMatch() {
		return getSDPLocation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSDPLocation__IsApplicable_FWD__Match() {
		return getSDPLocation().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSDPLocation__RegisterObjectsToMatch_FWD__Match_SDPLocation_MeterAsset_MeterAssetMMXUPair() {
		return getSDPLocation().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSDPLocation__IsAppropriate_solveCsp_FWD__Match_SDPLocation_MeterAsset_MeterAssetMMXUPair() {
		return getSDPLocation().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSDPLocation__IsAppropriate_checkCsp_FWD__CSP() {
		return getSDPLocation().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSDPLocation__IsApplicable_solveCsp_FWD__IsApplicableMatch_SDPLocation_MeterAsset_PMUVoltageMeter_MeterAssetToPMUVoltageMeter_MeterAssetMMXUPair() {
		return getSDPLocation().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSDPLocation__IsApplicable_checkCsp_FWD__CSP() {
		return getSDPLocation().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSDPLocation__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSDPLocation().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSDPLocation__CheckTypes_FWD__Match() {
		return getSDPLocation().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSDPLocation__IsAppropriate_FWD_EMoflonEdge_21__EMoflonEdge() {
		return getSDPLocation().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSDPLocation__CheckAttributes_FWD__TripleMatch() {
		return getSDPLocation().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSDPLocation__IsApplicable_CC__Match_Match() {
		return getSDPLocation().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSDPLocation__CheckDEC_FWD__SDPLocation_MeterAsset_MeterAssetMMXUPair() {
		return getSDPLocation().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformLoad() {
		if (conformLoadEClass == null) {
			conformLoadEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(9);
		}
		return conformLoadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoad__IsAppropriate_FWD__Match_ConformLoad_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getConformLoad().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoad__Perform_FWD__IsApplicableMatch() {
		return getConformLoad().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoad__IsApplicable_FWD__Match() {
		return getConformLoad().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoad__RegisterObjectsToMatch_FWD__Match_ConformLoad_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getConformLoad().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoad__IsAppropriate_solveCsp_FWD__Match_ConformLoad_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getConformLoad().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoad__IsAppropriate_checkCsp_FWD__CSP() {
		return getConformLoad().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoad__IsApplicable_solveCsp_FWD__IsApplicableMatch_ConformLoad_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPointToServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getConformLoad().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoad__IsApplicable_checkCsp_FWD__CSP() {
		return getConformLoad().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoad__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getConformLoad().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoad__CheckTypes_FWD__Match() {
		return getConformLoad().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoad__IsAppropriate_FWD_EMoflonEdge_22__EMoflonEdge() {
		return getConformLoad().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoad__CheckAttributes_FWD__TripleMatch() {
		return getConformLoad().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoad__IsApplicable_CC__Match_Match() {
		return getConformLoad().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoad__CheckDEC_FWD__ConformLoad_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getConformLoad().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlArea() {
		if (controlAreaEClass == null) {
			controlAreaEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(10);
		}
		return controlAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControlArea__IsAppropriate_FWD__Match_ControlArea() {
		return getControlArea().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControlArea__Perform_FWD__IsApplicableMatch() {
		return getControlArea().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControlArea__IsApplicable_FWD__Match() {
		return getControlArea().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControlArea__RegisterObjectsToMatch_FWD__Match_ControlArea() {
		return getControlArea().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControlArea__IsAppropriate_solveCsp_FWD__Match_ControlArea() {
		return getControlArea().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControlArea__IsAppropriate_checkCsp_FWD__CSP() {
		return getControlArea().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControlArea__IsApplicable_solveCsp_FWD__IsApplicableMatch_ControlArea() {
		return getControlArea().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControlArea__IsApplicable_checkCsp_FWD__CSP() {
		return getControlArea().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControlArea__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getControlArea().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControlArea__CheckTypes_FWD__Match() {
		return getControlArea().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControlArea__IsAppropriate_FWD_ControlArea_0__ControlArea() {
		return getControlArea().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControlArea__CheckAttributes_FWD__TripleMatch() {
		return getControlArea().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControlArea__IsApplicable_CC__Match_Match() {
		return getControlArea().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControlArea__CheckDEC_FWD__ControlArea() {
		return getControlArea().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformLoadGroup() {
		if (conformLoadGroupEClass == null) {
			conformLoadGroupEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(11);
		}
		return conformLoadGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoadGroup__IsAppropriate_FWD__Match_MeterAsset_ConformLoad_ConformLoadGroup_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint() {
		return getConformLoadGroup().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoadGroup__Perform_FWD__IsApplicableMatch() {
		return getConformLoadGroup().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoadGroup__IsApplicable_FWD__Match() {
		return getConformLoadGroup().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoadGroup__RegisterObjectsToMatch_FWD__Match_MeterAsset_ConformLoad_ConformLoadGroup_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint() {
		return getConformLoadGroup().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoadGroup__IsAppropriate_solveCsp_FWD__Match_MeterAsset_ConformLoad_ConformLoadGroup_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint() {
		return getConformLoadGroup().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoadGroup__IsAppropriate_checkCsp_FWD__CSP() {
		return getConformLoadGroup().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoadGroup__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAsset_ConformLoad_ConformLoadGroup_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_EnergyConsumerToEnergyConsumer_ConformLoad() {
		return getConformLoadGroup().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoadGroup__IsApplicable_checkCsp_FWD__CSP() {
		return getConformLoadGroup().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoadGroup__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getConformLoadGroup().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoadGroup__CheckTypes_FWD__Match() {
		return getConformLoadGroup().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoadGroup__IsAppropriate_FWD_EMoflonEdge_23__EMoflonEdge() {
		return getConformLoadGroup().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoadGroup__CheckAttributes_FWD__TripleMatch() {
		return getConformLoadGroup().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoadGroup__IsApplicable_CC__Match_Match() {
		return getConformLoadGroup().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConformLoadGroup__CheckDEC_FWD__MeterAsset_ConformLoad_ConformLoadGroup_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint() {
		return getConformLoadGroup().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStationSupply() {
		if (stationSupplyEClass == null) {
			stationSupplyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(12);
		}
		return stationSupplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStationSupply__IsAppropriate_FWD__Match_StationSupply_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getStationSupply().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStationSupply__Perform_FWD__IsApplicableMatch() {
		return getStationSupply().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStationSupply__IsApplicable_FWD__Match() {
		return getStationSupply().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStationSupply__RegisterObjectsToMatch_FWD__Match_StationSupply_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getStationSupply().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStationSupply__IsAppropriate_solveCsp_FWD__Match_StationSupply_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getStationSupply().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStationSupply__IsAppropriate_checkCsp_FWD__CSP() {
		return getStationSupply().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStationSupply__IsApplicable_solveCsp_FWD__IsApplicableMatch_StationSupply_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPointToServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getStationSupply().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStationSupply__IsApplicable_checkCsp_FWD__CSP() {
		return getStationSupply().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStationSupply__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getStationSupply().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStationSupply__CheckTypes_FWD__Match() {
		return getStationSupply().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStationSupply__IsAppropriate_FWD_EMoflonEdge_24__EMoflonEdge() {
		return getStationSupply().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStationSupply__CheckAttributes_FWD__TripleMatch() {
		return getStationSupply().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStationSupply__IsApplicable_CC__Match_Match() {
		return getStationSupply().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStationSupply__CheckDEC_FWD__StationSupply_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getStationSupply().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminal() {
		if (terminalEClass == null) {
			terminalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(13);
		}
		return terminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminal__IsAppropriate_FWD__Match_Terminal_MeterAssetMMXUPair_ConductingEquipment_MeterAsset_Location() {
		return getTerminal().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminal__Perform_FWD__IsApplicableMatch() {
		return getTerminal().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminal__IsApplicable_FWD__Match() {
		return getTerminal().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminal__RegisterObjectsToMatch_FWD__Match_Terminal_MeterAssetMMXUPair_ConductingEquipment_MeterAsset_Location() {
		return getTerminal().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminal__IsAppropriate_solveCsp_FWD__Match_Terminal_MeterAssetMMXUPair_ConductingEquipment_MeterAsset_Location() {
		return getTerminal().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminal__IsAppropriate_checkCsp_FWD__CSP() {
		return getTerminal().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminal__IsApplicable_solveCsp_FWD__IsApplicableMatch_Terminal_PowerSystemResourceToPowerSystemResource_MeterAssetMMXUPair_ConductingEquipment_PowerSystemResource_MeterAsset_Location() {
		return getTerminal().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminal__IsApplicable_checkCsp_FWD__CSP() {
		return getTerminal().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminal__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTerminal().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminal__CheckTypes_FWD__Match() {
		return getTerminal().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminal__IsAppropriate_FWD_EMoflonEdge_25__EMoflonEdge() {
		return getTerminal().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminal__CheckAttributes_FWD__TripleMatch() {
		return getTerminal().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminal__IsApplicable_CC__Match_Match() {
		return getTerminal().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminal__CheckDEC_FWD__Terminal_MeterAssetMMXUPair_ConductingEquipment_MeterAsset_Location() {
		return getTerminal().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDeliveryPoint() {
		if (serviceDeliveryPointEClass == null) {
			serviceDeliveryPointEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(14);
		}
		return serviceDeliveryPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPoint__IsAppropriate_FWD__Match_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getServiceDeliveryPoint().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPoint__Perform_FWD__IsApplicableMatch() {
		return getServiceDeliveryPoint().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPoint__IsApplicable_FWD__Match() {
		return getServiceDeliveryPoint().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPoint__RegisterObjectsToMatch_FWD__Match_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getServiceDeliveryPoint().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPoint__IsAppropriate_solveCsp_FWD__Match_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getServiceDeliveryPoint().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPoint__IsAppropriate_checkCsp_FWD__CSP() {
		return getServiceDeliveryPoint().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPoint__IsApplicable_solveCsp_FWD__IsApplicableMatch_ServiceDeliveryPoint_MeterAssetToPrivateMeterVoltage_MeterAsset_MeterAssetPhysicalDevicePair_PrivateMeterVoltage() {
		return getServiceDeliveryPoint().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPoint__IsApplicable_checkCsp_FWD__CSP() {
		return getServiceDeliveryPoint().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPoint__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getServiceDeliveryPoint().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPoint__CheckTypes_FWD__Match() {
		return getServiceDeliveryPoint().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPoint__IsAppropriate_FWD_EMoflonEdge_26__EMoflonEdge() {
		return getServiceDeliveryPoint().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPoint__CheckAttributes_FWD__TripleMatch() {
		return getServiceDeliveryPoint().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPoint__IsApplicable_CC__Match_Match() {
		return getServiceDeliveryPoint().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceDeliveryPoint__CheckDEC_FWD__ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getServiceDeliveryPoint().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnergyConsumerLinkServiceDeliveryPoint() {
		if (energyConsumerLinkServiceDeliveryPointEClass == null) {
			energyConsumerLinkServiceDeliveryPointEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(15);
		}
		return energyConsumerLinkServiceDeliveryPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerLinkServiceDeliveryPoint__IsAppropriate_FWD__Match_MeterAsset_MeterAssetPhysicalDevicePair_EnergyConsumer_ServiceDeliveryPoint() {
		return getEnergyConsumerLinkServiceDeliveryPoint().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerLinkServiceDeliveryPoint__Perform_FWD__IsApplicableMatch() {
		return getEnergyConsumerLinkServiceDeliveryPoint().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerLinkServiceDeliveryPoint__IsApplicable_FWD__Match() {
		return getEnergyConsumerLinkServiceDeliveryPoint().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerLinkServiceDeliveryPoint__RegisterObjectsToMatch_FWD__Match_MeterAsset_MeterAssetPhysicalDevicePair_EnergyConsumer_ServiceDeliveryPoint() {
		return getEnergyConsumerLinkServiceDeliveryPoint().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerLinkServiceDeliveryPoint__IsAppropriate_solveCsp_FWD__Match_MeterAsset_MeterAssetPhysicalDevicePair_EnergyConsumer_ServiceDeliveryPoint() {
		return getEnergyConsumerLinkServiceDeliveryPoint().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerLinkServiceDeliveryPoint__IsAppropriate_checkCsp_FWD__CSP() {
		return getEnergyConsumerLinkServiceDeliveryPoint().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerLinkServiceDeliveryPoint__IsApplicable_solveCsp_FWD__IsApplicableMatch_EnergyConsumerToEnergyConsumer_MeterAsset_EnergyConsumer_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_EnergyConsumer_ServiceDeliveryPointToServiceDeliveryPoint_ServiceDeliveryPoint() {
		return getEnergyConsumerLinkServiceDeliveryPoint().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerLinkServiceDeliveryPoint__IsApplicable_checkCsp_FWD__CSP() {
		return getEnergyConsumerLinkServiceDeliveryPoint().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerLinkServiceDeliveryPoint__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEnergyConsumerLinkServiceDeliveryPoint().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerLinkServiceDeliveryPoint__CheckTypes_FWD__Match() {
		return getEnergyConsumerLinkServiceDeliveryPoint().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerLinkServiceDeliveryPoint__IsAppropriate_FWD_EMoflonEdge_27__EMoflonEdge() {
		return getEnergyConsumerLinkServiceDeliveryPoint().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerLinkServiceDeliveryPoint__CheckAttributes_FWD__TripleMatch() {
		return getEnergyConsumerLinkServiceDeliveryPoint().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerLinkServiceDeliveryPoint__IsApplicable_CC__Match_Match() {
		return getEnergyConsumerLinkServiceDeliveryPoint().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerLinkServiceDeliveryPoint__CheckDEC_FWD__MeterAsset_MeterAssetPhysicalDevicePair_EnergyConsumer_ServiceDeliveryPoint() {
		return getEnergyConsumerLinkServiceDeliveryPoint().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadAreaLinkControlArea() {
		if (loadAreaLinkControlAreaEClass == null) {
			loadAreaLinkControlAreaEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(16);
		}
		return loadAreaLinkControlAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadAreaLinkControlArea__IsAppropriate_FWD__Match_ServiceDeliveryPoint_SubLoadArea_MeterAsset_MeterAssetPhysicalDevicePair_ConformLoad_ControlArea_ConformLoadGroup_LoadArea() {
		return getLoadAreaLinkControlArea().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadAreaLinkControlArea__Perform_FWD__IsApplicableMatch() {
		return getLoadAreaLinkControlArea().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadAreaLinkControlArea__IsApplicable_FWD__Match() {
		return getLoadAreaLinkControlArea().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadAreaLinkControlArea__RegisterObjectsToMatch_FWD__Match_ServiceDeliveryPoint_SubLoadArea_MeterAsset_MeterAssetPhysicalDevicePair_ConformLoad_ControlArea_ConformLoadGroup_LoadArea() {
		return getLoadAreaLinkControlArea().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadAreaLinkControlArea__IsAppropriate_solveCsp_FWD__Match_ServiceDeliveryPoint_SubLoadArea_MeterAsset_MeterAssetPhysicalDevicePair_ConformLoad_ControlArea_ConformLoadGroup_LoadArea() {
		return getLoadAreaLinkControlArea().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadAreaLinkControlArea__IsAppropriate_checkCsp_FWD__CSP() {
		return getLoadAreaLinkControlArea().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadAreaLinkControlArea__IsApplicable_solveCsp_FWD__IsApplicableMatch_ServiceDeliveryPoint_SubLoadArea_LoadAreaToLoadArea_ControlArea_LoadArea_MeterAsset_MeterAssetPhysicalDevicePair_ConformLoad_ControlArea_ControlAreaToControlSrea_ConformLoadGroup_LoadArea() {
		return getLoadAreaLinkControlArea().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadAreaLinkControlArea__IsApplicable_checkCsp_FWD__CSP() {
		return getLoadAreaLinkControlArea().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadAreaLinkControlArea__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getLoadAreaLinkControlArea().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadAreaLinkControlArea__CheckTypes_FWD__Match() {
		return getLoadAreaLinkControlArea().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadAreaLinkControlArea__IsAppropriate_FWD_EMoflonEdge_28__EMoflonEdge() {
		return getLoadAreaLinkControlArea().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadAreaLinkControlArea__CheckAttributes_FWD__TripleMatch() {
		return getLoadAreaLinkControlArea().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadAreaLinkControlArea__IsApplicable_CC__Match_Match() {
		return getLoadAreaLinkControlArea().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadAreaLinkControlArea__CheckDEC_FWD__ServiceDeliveryPoint_SubLoadArea_MeterAsset_MeterAssetPhysicalDevicePair_ConformLoad_ControlArea_ConformLoadGroup_LoadArea() {
		return getLoadAreaLinkControlArea().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlPosition() {
		if (gmlPositionEClass == null) {
			gmlPositionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(17);
		}
		return gmlPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGmlPosition__IsAppropriate_FWD__Match_GmlPosition_MeterAsset_Location_MeterAssetMMXUPair() {
		return getGmlPosition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGmlPosition__Perform_FWD__IsApplicableMatch() {
		return getGmlPosition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGmlPosition__IsApplicable_FWD__Match() {
		return getGmlPosition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGmlPosition__RegisterObjectsToMatch_FWD__Match_GmlPosition_MeterAsset_Location_MeterAssetMMXUPair() {
		return getGmlPosition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGmlPosition__IsAppropriate_solveCsp_FWD__Match_GmlPosition_MeterAsset_Location_MeterAssetMMXUPair() {
		return getGmlPosition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGmlPosition__IsAppropriate_checkCsp_FWD__CSP() {
		return getGmlPosition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGmlPosition__IsApplicable_solveCsp_FWD__IsApplicableMatch_GmlPosition_MeterAsset_Location_Location_MeterAssetMMXUPair_LocationToLocation() {
		return getGmlPosition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGmlPosition__IsApplicable_checkCsp_FWD__CSP() {
		return getGmlPosition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGmlPosition__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getGmlPosition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGmlPosition__CheckTypes_FWD__Match() {
		return getGmlPosition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGmlPosition__IsAppropriate_FWD_EMoflonEdge_29__EMoflonEdge() {
		return getGmlPosition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGmlPosition__CheckAttributes_FWD__TripleMatch() {
		return getGmlPosition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGmlPosition__IsApplicable_CC__Match_Match() {
		return getGmlPosition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGmlPosition__CheckDEC_FWD__GmlPosition_MeterAsset_Location_MeterAssetMMXUPair() {
		return getGmlPosition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonConformLoadGroup() {
		if (nonConformLoadGroupEClass == null) {
			nonConformLoadGroupEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(18);
		}
		return nonConformLoadGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoadGroup__IsAppropriate_FWD__Match_MeterAsset_NonConformLoadGroup_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_NonConformLoad() {
		return getNonConformLoadGroup().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoadGroup__Perform_FWD__IsApplicableMatch() {
		return getNonConformLoadGroup().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoadGroup__IsApplicable_FWD__Match() {
		return getNonConformLoadGroup().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoadGroup__RegisterObjectsToMatch_FWD__Match_MeterAsset_NonConformLoadGroup_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_NonConformLoad() {
		return getNonConformLoadGroup().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoadGroup__IsAppropriate_solveCsp_FWD__Match_MeterAsset_NonConformLoadGroup_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_NonConformLoad() {
		return getNonConformLoadGroup().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoadGroup__IsAppropriate_checkCsp_FWD__CSP() {
		return getNonConformLoadGroup().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoadGroup__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAsset_NonConformLoadGroup_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_NonConformLoad_NonConformLoad_EnergyConsumerToEnergyConsumer() {
		return getNonConformLoadGroup().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoadGroup__IsApplicable_checkCsp_FWD__CSP() {
		return getNonConformLoadGroup().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoadGroup__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getNonConformLoadGroup().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoadGroup__CheckTypes_FWD__Match() {
		return getNonConformLoadGroup().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoadGroup__IsAppropriate_FWD_EMoflonEdge_30__EMoflonEdge() {
		return getNonConformLoadGroup().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoadGroup__CheckAttributes_FWD__TripleMatch() {
		return getNonConformLoadGroup().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoadGroup__IsApplicable_CC__Match_Match() {
		return getNonConformLoadGroup().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNonConformLoadGroup__CheckDEC_FWD__MeterAsset_NonConformLoadGroup_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_NonConformLoad() {
		return getNonConformLoadGroup().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkLocation() {
		if (workLocationEClass == null) {
			workLocationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(19);
		}
		return workLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkLocation__IsAppropriate_FWD__Match_WorkLocation_MeterAsset_MeterAssetMMXUPair() {
		return getWorkLocation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkLocation__Perform_FWD__IsApplicableMatch() {
		return getWorkLocation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkLocation__IsApplicable_FWD__Match() {
		return getWorkLocation().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkLocation__RegisterObjectsToMatch_FWD__Match_WorkLocation_MeterAsset_MeterAssetMMXUPair() {
		return getWorkLocation().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkLocation__IsAppropriate_solveCsp_FWD__Match_WorkLocation_MeterAsset_MeterAssetMMXUPair() {
		return getWorkLocation().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkLocation__IsAppropriate_checkCsp_FWD__CSP() {
		return getWorkLocation().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkLocation__IsApplicable_solveCsp_FWD__IsApplicableMatch_WorkLocation_MeterAsset_PMUVoltageMeter_MeterAssetToPMUVoltageMeter_MeterAssetMMXUPair() {
		return getWorkLocation().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkLocation__IsApplicable_checkCsp_FWD__CSP() {
		return getWorkLocation().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkLocation__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getWorkLocation().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkLocation__CheckTypes_FWD__Match() {
		return getWorkLocation().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkLocation__IsAppropriate_FWD_EMoflonEdge_31__EMoflonEdge() {
		return getWorkLocation().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkLocation__CheckAttributes_FWD__TripleMatch() {
		return getWorkLocation().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkLocation__IsApplicable_CC__Match_Match() {
		return getWorkLocation().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkLocation__CheckDEC_FWD__WorkLocation_MeterAsset_MeterAssetMMXUPair() {
		return getWorkLocation().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTieFlowLinkControlArea() {
		if (tieFlowLinkControlAreaEClass == null) {
			tieFlowLinkControlAreaEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(20);
		}
		return tieFlowLinkControlAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlowLinkControlArea__IsAppropriate_FWD__Match_MeterAssetMMXUPair_TieFlow_Location_ConductingEquipment_Terminal_MeterAsset_ControlArea() {
		return getTieFlowLinkControlArea().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlowLinkControlArea__Perform_FWD__IsApplicableMatch() {
		return getTieFlowLinkControlArea().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlowLinkControlArea__IsApplicable_FWD__Match() {
		return getTieFlowLinkControlArea().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlowLinkControlArea__RegisterObjectsToMatch_FWD__Match_MeterAssetMMXUPair_TieFlow_Location_ConductingEquipment_Terminal_MeterAsset_ControlArea() {
		return getTieFlowLinkControlArea().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlowLinkControlArea__IsAppropriate_solveCsp_FWD__Match_MeterAssetMMXUPair_TieFlow_Location_ConductingEquipment_Terminal_MeterAsset_ControlArea() {
		return getTieFlowLinkControlArea().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlowLinkControlArea__IsAppropriate_checkCsp_FWD__CSP() {
		return getTieFlowLinkControlArea().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlowLinkControlArea__IsApplicable_solveCsp_FWD__IsApplicableMatch_ControlAreaToControlSrea_MeterAssetMMXUPair_TieFlow_Location_TieFlowToTieFlow_ConductingEquipment_Terminal_ControlArea_MeterAsset_ControlArea_TieFlow() {
		return getTieFlowLinkControlArea().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlowLinkControlArea__IsApplicable_checkCsp_FWD__CSP() {
		return getTieFlowLinkControlArea().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlowLinkControlArea__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTieFlowLinkControlArea().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlowLinkControlArea__CheckTypes_FWD__Match() {
		return getTieFlowLinkControlArea().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlowLinkControlArea__IsAppropriate_FWD_EMoflonEdge_32__EMoflonEdge() {
		return getTieFlowLinkControlArea().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlowLinkControlArea__CheckAttributes_FWD__TripleMatch() {
		return getTieFlowLinkControlArea().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlowLinkControlArea__IsApplicable_CC__Match_Match() {
		return getTieFlowLinkControlArea().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTieFlowLinkControlArea__CheckDEC_FWD__MeterAssetMMXUPair_TieFlow_Location_ConductingEquipment_Terminal_MeterAsset_ControlArea() {
		return getTieFlowLinkControlArea().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerSystemResource() {
		if (powerSystemResourceEClass == null) {
			powerSystemResourceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(21);
		}
		return powerSystemResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPowerSystemResource__IsAppropriate_FWD__Match_PowerSystemResource_MeterAsset_Location_MeterAssetMMXUPair() {
		return getPowerSystemResource().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPowerSystemResource__Perform_FWD__IsApplicableMatch() {
		return getPowerSystemResource().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPowerSystemResource__IsApplicable_FWD__Match() {
		return getPowerSystemResource().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPowerSystemResource__RegisterObjectsToMatch_FWD__Match_PowerSystemResource_MeterAsset_Location_MeterAssetMMXUPair() {
		return getPowerSystemResource().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPowerSystemResource__IsAppropriate_solveCsp_FWD__Match_PowerSystemResource_MeterAsset_Location_MeterAssetMMXUPair() {
		return getPowerSystemResource().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPowerSystemResource__IsAppropriate_checkCsp_FWD__CSP() {
		return getPowerSystemResource().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPowerSystemResource__IsApplicable_solveCsp_FWD__IsApplicableMatch_PowerSystemResource_Location_MeterAsset_Location_LocationToLocation_MeterAssetMMXUPair() {
		return getPowerSystemResource().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPowerSystemResource__IsApplicable_checkCsp_FWD__CSP() {
		return getPowerSystemResource().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPowerSystemResource__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPowerSystemResource().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPowerSystemResource__CheckTypes_FWD__Match() {
		return getPowerSystemResource().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPowerSystemResource__IsAppropriate_FWD_EMoflonEdge_33__EMoflonEdge() {
		return getPowerSystemResource().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPowerSystemResource__CheckAttributes_FWD__TripleMatch() {
		return getPowerSystemResource().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPowerSystemResource__IsApplicable_CC__Match_Match() {
		return getPowerSystemResource().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPowerSystemResource__CheckDEC_FWD__PowerSystemResource_MeterAsset_Location_MeterAssetMMXUPair() {
		return getPowerSystemResource().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrivateMeterVoltage() {
		if (privateMeterVoltageEClass == null) {
			privateMeterVoltageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(22);
		}
		return privateMeterVoltageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivateMeterVoltage__IsAppropriate_FWD__Match_MeterAsset_MeterAssetPhysicalDevicePair_ElectricityValues_PhysicalDevice() {
		return getPrivateMeterVoltage().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivateMeterVoltage__Perform_FWD__IsApplicableMatch() {
		return getPrivateMeterVoltage().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivateMeterVoltage__IsApplicable_FWD__Match() {
		return getPrivateMeterVoltage().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivateMeterVoltage__RegisterObjectsToMatch_FWD__Match_MeterAsset_MeterAssetPhysicalDevicePair_ElectricityValues_PhysicalDevice() {
		return getPrivateMeterVoltage().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivateMeterVoltage__IsAppropriate_solveCsp_FWD__Match_MeterAsset_MeterAssetPhysicalDevicePair_ElectricityValues_PhysicalDevice() {
		return getPrivateMeterVoltage().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivateMeterVoltage__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrivateMeterVoltage().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivateMeterVoltage__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAsset_MeterAssetPhysicalDevicePair_ElectricityValues_PhysicalDevice() {
		return getPrivateMeterVoltage().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivateMeterVoltage__IsApplicable_checkCsp_FWD__CSP() {
		return getPrivateMeterVoltage().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivateMeterVoltage__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrivateMeterVoltage().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivateMeterVoltage__CheckTypes_FWD__Match() {
		return getPrivateMeterVoltage().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivateMeterVoltage__IsAppropriate_FWD_EMoflonEdge_34__EMoflonEdge() {
		return getPrivateMeterVoltage().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivateMeterVoltage__CheckAttributes_FWD__TripleMatch() {
		return getPrivateMeterVoltage().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivateMeterVoltage__IsApplicable_CC__Match_Match() {
		return getPrivateMeterVoltage().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivateMeterVoltage__CheckDEC_FWD__MeterAsset_MeterAssetPhysicalDevicePair_ElectricityValues_PhysicalDevice() {
		return getPrivateMeterVoltage().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationLink() {
		if (locationLinkEClass == null) {
			locationLinkEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(23);
		}
		return locationLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocationLink__IsAppropriate_FWD__Match_MeterAssetMMXUPair_MeterAsset_Location() {
		return getLocationLink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocationLink__Perform_FWD__IsApplicableMatch() {
		return getLocationLink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocationLink__IsApplicable_FWD__Match() {
		return getLocationLink().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocationLink__RegisterObjectsToMatch_FWD__Match_MeterAssetMMXUPair_MeterAsset_Location() {
		return getLocationLink().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocationLink__IsAppropriate_solveCsp_FWD__Match_MeterAssetMMXUPair_MeterAsset_Location() {
		return getLocationLink().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocationLink__IsAppropriate_checkCsp_FWD__CSP() {
		return getLocationLink().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocationLink__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAssetMMXUPair_MeterAsset_LocationToLocation_Location_PMUVoltageMeter_Location_MeterAssetToPMUVoltageMeter() {
		return getLocationLink().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocationLink__IsApplicable_checkCsp_FWD__CSP() {
		return getLocationLink().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocationLink__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getLocationLink().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocationLink__CheckTypes_FWD__Match() {
		return getLocationLink().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocationLink__IsAppropriate_FWD_EMoflonEdge_35__EMoflonEdge() {
		return getLocationLink().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocationLink__CheckAttributes_FWD__TripleMatch() {
		return getLocationLink().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocationLink__IsApplicable_CC__Match_Match() {
		return getLocationLink().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocationLink__CheckDEC_FWD__MeterAssetMMXUPair_MeterAsset_Location() {
		return getLocationLink().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPMUVoltageMeter() {
		if (pmuVoltageMeterEClass == null) {
			pmuVoltageMeterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(24);
		}
		return pmuVoltageMeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPMUVoltageMeter__IsAppropriate_FWD__Match_MeterAsset_MeterAssetMMXUPair_MMXU() {
		return getPMUVoltageMeter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPMUVoltageMeter__Perform_FWD__IsApplicableMatch() {
		return getPMUVoltageMeter().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPMUVoltageMeter__IsApplicable_FWD__Match() {
		return getPMUVoltageMeter().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPMUVoltageMeter__RegisterObjectsToMatch_FWD__Match_MeterAsset_MeterAssetMMXUPair_MMXU() {
		return getPMUVoltageMeter().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPMUVoltageMeter__IsAppropriate_solveCsp_FWD__Match_MeterAsset_MeterAssetMMXUPair_MMXU() {
		return getPMUVoltageMeter().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPMUVoltageMeter__IsAppropriate_checkCsp_FWD__CSP() {
		return getPMUVoltageMeter().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPMUVoltageMeter__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAsset_MeterAssetMMXUPair_MMXU() {
		return getPMUVoltageMeter().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPMUVoltageMeter__IsApplicable_checkCsp_FWD__CSP() {
		return getPMUVoltageMeter().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPMUVoltageMeter__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPMUVoltageMeter().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPMUVoltageMeter__CheckTypes_FWD__Match() {
		return getPMUVoltageMeter().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPMUVoltageMeter__IsAppropriate_FWD_EMoflonEdge_36__EMoflonEdge() {
		return getPMUVoltageMeter().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPMUVoltageMeter__CheckAttributes_FWD__TripleMatch() {
		return getPMUVoltageMeter().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPMUVoltageMeter__IsApplicable_CC__Match_Match() {
		return getPMUVoltageMeter().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPMUVoltageMeter__CheckDEC_FWD__MeterAsset_MeterAssetMMXUPair_MMXU() {
		return getPMUVoltageMeter().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubLoadArea() {
		if (subLoadAreaEClass == null) {
			subLoadAreaEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(25);
		}
		return subLoadAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubLoadArea__IsAppropriate_FWD__Match_MeterAsset_ConformLoadGroup_SubLoadArea_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_ConformLoad() {
		return getSubLoadArea().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubLoadArea__Perform_FWD__IsApplicableMatch() {
		return getSubLoadArea().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubLoadArea__IsApplicable_FWD__Match() {
		return getSubLoadArea().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubLoadArea__RegisterObjectsToMatch_FWD__Match_MeterAsset_ConformLoadGroup_SubLoadArea_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_ConformLoad() {
		return getSubLoadArea().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubLoadArea__IsAppropriate_solveCsp_FWD__Match_MeterAsset_ConformLoadGroup_SubLoadArea_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_ConformLoad() {
		return getSubLoadArea().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubLoadArea__IsAppropriate_checkCsp_FWD__CSP() {
		return getSubLoadArea().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubLoadArea__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAsset_ConformLoadGroup_ConformLoadGroup_SubLoadArea_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_ConformLoadGroupToConformLoadGroup_ConformLoad() {
		return getSubLoadArea().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubLoadArea__IsApplicable_checkCsp_FWD__CSP() {
		return getSubLoadArea().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubLoadArea__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSubLoadArea().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubLoadArea__CheckTypes_FWD__Match() {
		return getSubLoadArea().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubLoadArea__IsAppropriate_FWD_EMoflonEdge_37__EMoflonEdge() {
		return getSubLoadArea().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubLoadArea__CheckAttributes_FWD__TripleMatch() {
		return getSubLoadArea().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubLoadArea__IsApplicable_CC__Match_Match() {
		return getSubLoadArea().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubLoadArea__CheckDEC_FWD__MeterAsset_ConformLoadGroup_SubLoadArea_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_ConformLoad() {
		return getSubLoadArea().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnergyConsumer() {
		if (energyConsumerEClass == null) {
			energyConsumerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(26);
		}
		return energyConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumer__IsAppropriate_FWD__Match_EnergyConsumer_MeterAsset_ServiceDeliveryPoint_MeterAssetPhysicalDevicePair() {
		return getEnergyConsumer().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumer__Perform_FWD__IsApplicableMatch() {
		return getEnergyConsumer().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumer__IsApplicable_FWD__Match() {
		return getEnergyConsumer().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumer__RegisterObjectsToMatch_FWD__Match_EnergyConsumer_MeterAsset_ServiceDeliveryPoint_MeterAssetPhysicalDevicePair() {
		return getEnergyConsumer().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumer__IsAppropriate_solveCsp_FWD__Match_EnergyConsumer_MeterAsset_ServiceDeliveryPoint_MeterAssetPhysicalDevicePair() {
		return getEnergyConsumer().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumer__IsAppropriate_checkCsp_FWD__CSP() {
		return getEnergyConsumer().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumer__IsApplicable_solveCsp_FWD__IsApplicableMatch_EnergyConsumer_MeterAsset_ServiceDeliveryPoint_ServiceDeliveryPoint_MeterAssetPhysicalDevicePair_ServiceDeliveryPointToServiceDeliveryPoint() {
		return getEnergyConsumer().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumer__IsApplicable_checkCsp_FWD__CSP() {
		return getEnergyConsumer().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumer__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEnergyConsumer().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumer__CheckTypes_FWD__Match() {
		return getEnergyConsumer().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumer__IsAppropriate_FWD_EMoflonEdge_38__EMoflonEdge() {
		return getEnergyConsumer().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumer__CheckAttributes_FWD__TripleMatch() {
		return getEnergyConsumer().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumer__IsApplicable_CC__Match_Match() {
		return getEnergyConsumer().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumer__CheckDEC_FWD__EnergyConsumer_MeterAsset_ServiceDeliveryPoint_MeterAssetPhysicalDevicePair() {
		return getEnergyConsumer().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactory getRulesFactory() {
		return (RulesFactory) getEFactoryInstance();
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
		if (isFixed)
			return;
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
			eClassifier.setInstanceClassName("rgse.ttc17.emoflon.tgg.task2.Rules." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //RulesPackageImpl
