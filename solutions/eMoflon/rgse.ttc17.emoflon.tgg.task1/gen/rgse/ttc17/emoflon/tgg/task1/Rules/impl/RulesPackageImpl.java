/**
 */
package rgse.ttc17.emoflon.tgg.task1.Rules.impl;

import gluemodel.GluemodelPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.tgg.language.LanguagePackage;

import outageDetectionJointarget.OutageDetectionJointargetPackage;

import rgse.ttc17.emoflon.tgg.task1.Rules.RulesFactory;
import rgse.ttc17.emoflon.tgg.task1.Rules.RulesPackage;

import rgse.ttc17.emoflon.tgg.task1.Task1Package;

import rgse.ttc17.emoflon.tgg.task1.impl.Task1PackageImpl;

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
	private EClass energyConsumerWithIDConfLoadEClass = null;

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
	private EClass positionPointEClass = null;

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
	private EClass energyConsumerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionPointLinkEClass = null;

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
	private EClass energyConsumerWithIDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energyConsumerWithIDNonConfLoadEClass = null;

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
	private EClass sdpLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneEClass = null;

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
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.RulesPackage#eNS_URI
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
		OutageDetectionJointargetPackage.eINSTANCE.eClass();
		GluemodelPackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Task1PackageImpl theTask1Package = (Task1PackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(Task1Package.eNS_URI) instanceof Task1PackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(Task1Package.eNS_URI) : Task1Package.eINSTANCE);

		// Load packages
		theTask1Package.loadPackage();

		// Fix loaded packages
		theRulesPackage.fixPackageContents();
		theTask1Package.fixPackageContents();

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
	public EClass getEnergyConsumerWithIDConfLoad() {
		if (energyConsumerWithIDConfLoadEClass == null) {
			energyConsumerWithIDConfLoadEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(0);
		}
		return energyConsumerWithIDConfLoadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDConfLoad__IsAppropriate_FWD__Match_SubLoadArea_ElectricityValues_ServiceDeliveryPoint_ControlArea_MeterAssetPhysicalDevicePair_MeterAsset_PhysicalDevice_ConformLoad_AutoConnectObject_ConformLoadGroup() {
		return getEnergyConsumerWithIDConfLoad().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDConfLoad__Perform_FWD__IsApplicableMatch() {
		return getEnergyConsumerWithIDConfLoad().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDConfLoad__IsApplicable_FWD__Match() {
		return getEnergyConsumerWithIDConfLoad().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDConfLoad__RegisterObjectsToMatch_FWD__Match_SubLoadArea_ElectricityValues_ServiceDeliveryPoint_ControlArea_MeterAssetPhysicalDevicePair_MeterAsset_PhysicalDevice_ConformLoad_AutoConnectObject_ConformLoadGroup() {
		return getEnergyConsumerWithIDConfLoad().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDConfLoad__IsAppropriate_solveCsp_FWD__Match_SubLoadArea_ElectricityValues_ServiceDeliveryPoint_ControlArea_MeterAssetPhysicalDevicePair_MeterAsset_PhysicalDevice_ConformLoad_AutoConnectObject_ConformLoadGroup() {
		return getEnergyConsumerWithIDConfLoad().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDConfLoad__IsAppropriate_checkCsp_FWD__CSP() {
		return getEnergyConsumerWithIDConfLoad().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDConfLoad__IsApplicable_solveCsp_FWD__IsApplicableMatch_SubLoadArea_ElectricityValues_ServiceDeliveryPoint_ControlArea_MeterAssetPhysicalDevicePair_MeterAsset_PhysicalDevice_ConformLoad_AutoConnectObject_ConformLoadGroup() {
		return getEnergyConsumerWithIDConfLoad().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDConfLoad__IsApplicable_checkCsp_FWD__CSP() {
		return getEnergyConsumerWithIDConfLoad().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDConfLoad__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEnergyConsumerWithIDConfLoad().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDConfLoad__CheckTypes_FWD__Match() {
		return getEnergyConsumerWithIDConfLoad().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDConfLoad__IsAppropriate_FWD_EMoflonEdge_13__EMoflonEdge() {
		return getEnergyConsumerWithIDConfLoad().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDConfLoad__CheckAttributes_FWD__TripleMatch() {
		return getEnergyConsumerWithIDConfLoad().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDConfLoad__IsApplicable_CC__Match_Match() {
		return getEnergyConsumerWithIDConfLoad().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDConfLoad__CheckDEC_FWD__SubLoadArea_ElectricityValues_ServiceDeliveryPoint_ControlArea_MeterAssetPhysicalDevicePair_MeterAsset_PhysicalDevice_ConformLoad_AutoConnectObject_ConformLoadGroup() {
		return getEnergyConsumerWithIDConfLoad().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGmlPosition() {
		if (gmlPositionEClass == null) {
			gmlPositionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(1);
		}
		return gmlPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGmlPosition__IsAppropriate_FWD__Match_GmlPosition_Location_MeterAsset_MeterAssetPhysicalDevicePair() {
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
	public EOperation getGmlPosition__RegisterObjectsToMatch_FWD__Match_GmlPosition_Location_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getGmlPosition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGmlPosition__IsAppropriate_solveCsp_FWD__Match_GmlPosition_Location_MeterAsset_MeterAssetPhysicalDevicePair() {
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
	public EOperation getGmlPosition__IsApplicable_solveCsp_FWD__IsApplicableMatch_GmlPosition_LocationToLocation_Location_Location_MeterAsset_MeterAssetPhysicalDevicePair() {
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
	public EOperation getGmlPosition__IsAppropriate_FWD_EMoflonEdge_14__EMoflonEdge() {
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
	public EOperation getGmlPosition__CheckDEC_FWD__GmlPosition_Location_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getGmlPosition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionPoint() {
		if (positionPointEClass == null) {
			positionPointEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(2);
		}
		return positionPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPoint__IsAppropriate_FWD__Match_PositionPoint_MeterAsset_Location_MeterAssetPhysicalDevicePair() {
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
	public EOperation getPositionPoint__RegisterObjectsToMatch_FWD__Match_PositionPoint_MeterAsset_Location_MeterAssetPhysicalDevicePair() {
		return getPositionPoint().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPoint__IsAppropriate_solveCsp_FWD__Match_PositionPoint_MeterAsset_Location_MeterAssetPhysicalDevicePair() {
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
	public EOperation getPositionPoint__IsApplicable_solveCsp_FWD__IsApplicableMatch_LocationToLocation_PositionPoint_MeterAsset_Location_MeterAssetPhysicalDevicePair_Location() {
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
	public EOperation getPositionPoint__IsAppropriate_FWD_EMoflonEdge_15__EMoflonEdge() {
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
	public EOperation getPositionPoint__CheckDEC_FWD__PositionPoint_MeterAsset_Location_MeterAssetPhysicalDevicePair() {
		return getPositionPoint().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkLocation() {
		if (workLocationEClass == null) {
			workLocationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(3);
		}
		return workLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkLocation__IsAppropriate_FWD__Match_WorkLocation_MeterAsset_MeterAssetPhysicalDevicePair() {
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
	public EOperation getWorkLocation__RegisterObjectsToMatch_FWD__Match_WorkLocation_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getWorkLocation().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkLocation__IsAppropriate_solveCsp_FWD__Match_WorkLocation_MeterAsset_MeterAssetPhysicalDevicePair() {
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
	public EOperation getWorkLocation__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAssetToEnergyConsumer_WorkLocation_MeterAsset_EnergyConsumer_MeterAssetPhysicalDevicePair() {
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
	public EOperation getWorkLocation__IsAppropriate_FWD_EMoflonEdge_16__EMoflonEdge() {
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
	public EOperation getWorkLocation__CheckDEC_FWD__WorkLocation_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getWorkLocation().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnergyConsumer() {
		if (energyConsumerEClass == null) {
			energyConsumerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(4);
		}
		return energyConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumer__IsAppropriate_FWD__Match_ServiceDeliveryPoint_MeterAsset_AutoConnectObject_MeterAssetPhysicalDevicePair_ElectricityValues_PhysicalDevice() {
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
	public EOperation getEnergyConsumer__RegisterObjectsToMatch_FWD__Match_ServiceDeliveryPoint_MeterAsset_AutoConnectObject_MeterAssetPhysicalDevicePair_ElectricityValues_PhysicalDevice() {
		return getEnergyConsumer().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumer__IsAppropriate_solveCsp_FWD__Match_ServiceDeliveryPoint_MeterAsset_AutoConnectObject_MeterAssetPhysicalDevicePair_ElectricityValues_PhysicalDevice() {
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
	public EOperation getEnergyConsumer__IsApplicable_solveCsp_FWD__IsApplicableMatch_ServiceDeliveryPoint_MeterAsset_AutoConnectObject_MeterAssetPhysicalDevicePair_ElectricityValues_PhysicalDevice() {
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
	public EOperation getEnergyConsumer__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getEnergyConsumer__IsAppropriate_FWD_EMoflonEdge_17__EMoflonEdge() {
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
	public EOperation getEnergyConsumer__CheckDEC_FWD__ServiceDeliveryPoint_MeterAsset_AutoConnectObject_MeterAssetPhysicalDevicePair_ElectricityValues_PhysicalDevice() {
		return getEnergyConsumer().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionPointLink() {
		if (positionPointLinkEClass == null) {
			positionPointLinkEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(5);
		}
		return positionPointLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPointLink__IsAppropriate_FWD__Match_Location_PositionPoint_MeterAssetPhysicalDevicePair_MeterAsset() {
		return getPositionPointLink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPointLink__Perform_FWD__IsApplicableMatch() {
		return getPositionPointLink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPointLink__IsApplicable_FWD__Match() {
		return getPositionPointLink().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPointLink__RegisterObjectsToMatch_FWD__Match_Location_PositionPoint_MeterAssetPhysicalDevicePair_MeterAsset() {
		return getPositionPointLink().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPointLink__IsAppropriate_solveCsp_FWD__Match_Location_PositionPoint_MeterAssetPhysicalDevicePair_MeterAsset() {
		return getPositionPointLink().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPointLink__IsAppropriate_checkCsp_FWD__CSP() {
		return getPositionPointLink().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPointLink__IsApplicable_solveCsp_FWD__IsApplicableMatch_Location_LocationToLocation_PositionPoint_PositionPoint_Location_MeterAssetPhysicalDevicePair_MeterAsset_PositionPointToPositionPoint() {
		return getPositionPointLink().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPointLink__IsApplicable_checkCsp_FWD__CSP() {
		return getPositionPointLink().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPointLink__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPositionPointLink().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPointLink__CheckTypes_FWD__Match() {
		return getPositionPointLink().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPointLink__IsAppropriate_FWD_EMoflonEdge_18__EMoflonEdge() {
		return getPositionPointLink().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPointLink__CheckAttributes_FWD__TripleMatch() {
		return getPositionPointLink().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPointLink__IsApplicable_CC__Match_Match() {
		return getPositionPointLink().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionPointLink__CheckDEC_FWD__Location_PositionPoint_MeterAssetPhysicalDevicePair_MeterAsset() {
		return getPositionPointLink().getEOperations().get(13);
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
	public EOperation getServiceLocation__IsAppropriate_FWD__Match_ServiceLocation_MeterAsset_MeterAssetPhysicalDevicePair() {
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
	public EOperation getServiceLocation__RegisterObjectsToMatch_FWD__Match_ServiceLocation_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getServiceLocation().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceLocation__IsAppropriate_solveCsp_FWD__Match_ServiceLocation_MeterAsset_MeterAssetPhysicalDevicePair() {
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
	public EOperation getServiceLocation__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAssetToEnergyConsumer_ServiceLocation_MeterAsset_EnergyConsumer_MeterAssetPhysicalDevicePair() {
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
	public EOperation getServiceLocation__CheckDEC_FWD__ServiceLocation_MeterAsset_MeterAssetPhysicalDevicePair() {
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
	public EOperation getLocation__IsAppropriate_FWD__Match_MeterAsset_Location_MeterAssetPhysicalDevicePair() {
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
	public EOperation getLocation__RegisterObjectsToMatch_FWD__Match_MeterAsset_Location_MeterAssetPhysicalDevicePair() {
		return getLocation().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__IsAppropriate_solveCsp_FWD__Match_MeterAsset_Location_MeterAssetPhysicalDevicePair() {
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
	public EOperation getLocation__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAsset_EnergyConsumer_Location_MeterAssetPhysicalDevicePair_MeterAssetToEnergyConsumer() {
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
	public EOperation getLocation__CheckDEC_FWD__MeterAsset_Location_MeterAssetPhysicalDevicePair() {
		return getLocation().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnergyConsumerWithID() {
		if (energyConsumerWithIDEClass == null) {
			energyConsumerWithIDEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(8);
		}
		return energyConsumerWithIDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithID__IsAppropriate_FWD__Match_ElectricityValues_ServiceDeliveryPoint_MeterAsset_PhysicalDevice_EnergyConsumer_AutoConnectObject_MeterAssetPhysicalDevicePair() {
		return getEnergyConsumerWithID().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithID__Perform_FWD__IsApplicableMatch() {
		return getEnergyConsumerWithID().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithID__IsApplicable_FWD__Match() {
		return getEnergyConsumerWithID().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithID__RegisterObjectsToMatch_FWD__Match_ElectricityValues_ServiceDeliveryPoint_MeterAsset_PhysicalDevice_EnergyConsumer_AutoConnectObject_MeterAssetPhysicalDevicePair() {
		return getEnergyConsumerWithID().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithID__IsAppropriate_solveCsp_FWD__Match_ElectricityValues_ServiceDeliveryPoint_MeterAsset_PhysicalDevice_EnergyConsumer_AutoConnectObject_MeterAssetPhysicalDevicePair() {
		return getEnergyConsumerWithID().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithID__IsAppropriate_checkCsp_FWD__CSP() {
		return getEnergyConsumerWithID().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithID__IsApplicable_solveCsp_FWD__IsApplicableMatch_ElectricityValues_ServiceDeliveryPoint_MeterAsset_PhysicalDevice_EnergyConsumer_AutoConnectObject_MeterAssetPhysicalDevicePair() {
		return getEnergyConsumerWithID().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithID__IsApplicable_checkCsp_FWD__CSP() {
		return getEnergyConsumerWithID().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithID__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEnergyConsumerWithID().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithID__CheckTypes_FWD__Match() {
		return getEnergyConsumerWithID().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithID__IsAppropriate_FWD_EMoflonEdge_21__EMoflonEdge() {
		return getEnergyConsumerWithID().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithID__CheckAttributes_FWD__TripleMatch() {
		return getEnergyConsumerWithID().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithID__IsApplicable_CC__Match_Match() {
		return getEnergyConsumerWithID().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithID__CheckDEC_FWD__ElectricityValues_ServiceDeliveryPoint_MeterAsset_PhysicalDevice_EnergyConsumer_AutoConnectObject_MeterAssetPhysicalDevicePair() {
		return getEnergyConsumerWithID().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnergyConsumerWithIDNonConfLoad() {
		if (energyConsumerWithIDNonConfLoadEClass == null) {
			energyConsumerWithIDNonConfLoadEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(9);
		}
		return energyConsumerWithIDNonConfLoadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDNonConfLoad__IsAppropriate_FWD__Match_SubLoadArea_ElectricityValues_ServiceDeliveryPoint_ControlArea_MeterAssetPhysicalDevicePair_MeterAsset_PhysicalDevice_NonConformLoad_AutoConnectObject_NonConformLoadGroup() {
		return getEnergyConsumerWithIDNonConfLoad().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDNonConfLoad__Perform_FWD__IsApplicableMatch() {
		return getEnergyConsumerWithIDNonConfLoad().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDNonConfLoad__IsApplicable_FWD__Match() {
		return getEnergyConsumerWithIDNonConfLoad().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDNonConfLoad__RegisterObjectsToMatch_FWD__Match_SubLoadArea_ElectricityValues_ServiceDeliveryPoint_ControlArea_MeterAssetPhysicalDevicePair_MeterAsset_PhysicalDevice_NonConformLoad_AutoConnectObject_NonConformLoadGroup() {
		return getEnergyConsumerWithIDNonConfLoad().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDNonConfLoad__IsAppropriate_solveCsp_FWD__Match_SubLoadArea_ElectricityValues_ServiceDeliveryPoint_ControlArea_MeterAssetPhysicalDevicePair_MeterAsset_PhysicalDevice_NonConformLoad_AutoConnectObject_NonConformLoadGroup() {
		return getEnergyConsumerWithIDNonConfLoad().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDNonConfLoad__IsAppropriate_checkCsp_FWD__CSP() {
		return getEnergyConsumerWithIDNonConfLoad().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDNonConfLoad__IsApplicable_solveCsp_FWD__IsApplicableMatch_SubLoadArea_ElectricityValues_ServiceDeliveryPoint_ControlArea_MeterAssetPhysicalDevicePair_MeterAsset_PhysicalDevice_NonConformLoad_AutoConnectObject_NonConformLoadGroup() {
		return getEnergyConsumerWithIDNonConfLoad().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDNonConfLoad__IsApplicable_checkCsp_FWD__CSP() {
		return getEnergyConsumerWithIDNonConfLoad().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDNonConfLoad__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEnergyConsumerWithIDNonConfLoad().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDNonConfLoad__CheckTypes_FWD__Match() {
		return getEnergyConsumerWithIDNonConfLoad().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDNonConfLoad__IsAppropriate_FWD_EMoflonEdge_22__EMoflonEdge() {
		return getEnergyConsumerWithIDNonConfLoad().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDNonConfLoad__CheckAttributes_FWD__TripleMatch() {
		return getEnergyConsumerWithIDNonConfLoad().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDNonConfLoad__IsApplicable_CC__Match_Match() {
		return getEnergyConsumerWithIDNonConfLoad().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyConsumerWithIDNonConfLoad__CheckDEC_FWD__SubLoadArea_ElectricityValues_ServiceDeliveryPoint_ControlArea_MeterAssetPhysicalDevicePair_MeterAsset_PhysicalDevice_NonConformLoad_AutoConnectObject_NonConformLoadGroup() {
		return getEnergyConsumerWithIDNonConfLoad().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationLink() {
		if (locationLinkEClass == null) {
			locationLinkEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(10);
		}
		return locationLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocationLink__IsAppropriate_FWD__Match_MeterAsset_Location_MeterAssetPhysicalDevicePair() {
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
	public EOperation getLocationLink__RegisterObjectsToMatch_FWD__Match_MeterAsset_Location_MeterAssetPhysicalDevicePair() {
		return getLocationLink().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocationLink__IsAppropriate_solveCsp_FWD__Match_MeterAsset_Location_MeterAssetPhysicalDevicePair() {
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
	public EOperation getLocationLink__IsApplicable_solveCsp_FWD__IsApplicableMatch_EnergyConsumer_MeterAsset_Location_MeterAssetToEnergyConsumer_Location_MeterAssetPhysicalDevicePair_LocationToLocation() {
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
	public EOperation getLocationLink__IsAppropriate_FWD_EMoflonEdge_23__EMoflonEdge() {
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
	public EOperation getLocationLink__CheckDEC_FWD__MeterAsset_Location_MeterAssetPhysicalDevicePair() {
		return getLocationLink().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSDPLocation() {
		if (sdpLocationEClass == null) {
			sdpLocationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(11);
		}
		return sdpLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSDPLocation__IsAppropriate_FWD__Match_SDPLocation_MeterAsset_MeterAssetPhysicalDevicePair() {
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
	public EOperation getSDPLocation__RegisterObjectsToMatch_FWD__Match_SDPLocation_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getSDPLocation().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSDPLocation__IsAppropriate_solveCsp_FWD__Match_SDPLocation_MeterAsset_MeterAssetPhysicalDevicePair() {
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
	public EOperation getSDPLocation__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAssetToEnergyConsumer_SDPLocation_MeterAsset_EnergyConsumer_MeterAssetPhysicalDevicePair() {
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
	public EOperation getSDPLocation__IsAppropriate_FWD_EMoflonEdge_24__EMoflonEdge() {
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
	public EOperation getSDPLocation__CheckDEC_FWD__SDPLocation_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getSDPLocation().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZone() {
		if (zoneEClass == null) {
			zoneEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(12);
		}
		return zoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZone__IsAppropriate_FWD__Match_Zone_MeterAsset_MeterAssetPhysicalDevicePair() {
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
	public EOperation getZone__RegisterObjectsToMatch_FWD__Match_Zone_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getZone().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZone__IsAppropriate_solveCsp_FWD__Match_Zone_MeterAsset_MeterAssetPhysicalDevicePair() {
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
	public EOperation getZone__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAssetToEnergyConsumer_Zone_MeterAsset_EnergyConsumer_MeterAssetPhysicalDevicePair() {
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
	public EOperation getZone__IsAppropriate_FWD_EMoflonEdge_25__EMoflonEdge() {
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
	public EOperation getZone__CheckDEC_FWD__Zone_MeterAsset_MeterAssetPhysicalDevicePair() {
		return getZone().getEOperations().get(13);
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
			eClassifier.setInstanceClassName("rgse.ttc17.emoflon.tgg.task1.Rules." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //RulesPackageImpl
