/**
 */
package rgse.ttc17.emoflon.tgg.task1.Rules;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61970.ControlArea.ControlArea;

import gluemodel.CIM.IEC61970.LoadModel.NonConformLoad;
import gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup;
import gluemodel.CIM.IEC61970.LoadModel.SubLoadArea;

import gluemodel.COSEM.COSEMObjects.AutoConnectObject;
import gluemodel.COSEM.COSEMObjects.ElectricityValues;

import gluemodel.COSEM.PhysicalDevice;

import gluemodel.MeterAssetPhysicalDevicePair;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.runtime.AbstractRule;
import org.moflon.tgg.runtime.AttributeConstraintsRuleResult;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.EObjectContainer;
import org.moflon.tgg.runtime.IsApplicableMatch;
import org.moflon.tgg.runtime.IsApplicableRuleResult;
import org.moflon.tgg.runtime.Match;
import org.moflon.tgg.runtime.PerformRuleResult;
import org.moflon.tgg.runtime.TripleMatch;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energy Consumer With ID Non Conf Load</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see rgse.ttc17.emoflon.tgg.task1.Rules.RulesPackage#getEnergyConsumerWithIDNonConfLoad()
 * @model
 * @generated
 */
public interface EnergyConsumerWithIDNonConfLoad extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, SubLoadArea area, ElectricityValues electric, ServiceDeliveryPoint deliver,
			ControlArea control, MeterAssetPhysicalDevicePair pair, MeterAsset asset, PhysicalDevice device,
			NonConformLoad consumer, AutoConnectObject connect, NonConformLoadGroup group);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjectsToMatch_FWD(Match match, SubLoadArea area, ElectricityValues electric,
			ServiceDeliveryPoint deliver, ControlArea control, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			PhysicalDevice device, NonConformLoad consumer, AutoConnectObject connect, NonConformLoadGroup group);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, SubLoadArea area, ElectricityValues electric,
			ServiceDeliveryPoint deliver, ControlArea control, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			PhysicalDevice device, NonConformLoad consumer, AutoConnectObject connect, NonConformLoadGroup group);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_checkCsp_FWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, SubLoadArea area, ElectricityValues electric,
			ServiceDeliveryPoint deliver, ControlArea control, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			PhysicalDevice device, NonConformLoad consumer, AutoConnectObject connect, NonConformLoadGroup group);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isApplicable_checkCsp_FWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject area, EObject assetCorr, EObject electric,
			EObject deliver, EObject control, EObject deviceCorr, EObject pair, EObject asset, EObject device,
			EObject consumer, EObject connect, EObject trgConsumer, EObject group);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkTypes_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_22(EMoflonEdge _edge_a);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkDEC_FWD(SubLoadArea area, ElectricityValues electric, ServiceDeliveryPoint deliver,
			ControlArea control, MeterAssetPhysicalDevicePair pair, MeterAsset asset, PhysicalDevice device,
			NonConformLoad consumer, AutoConnectObject connect, NonConformLoadGroup group);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // EnergyConsumerWithIDNonConfLoad
