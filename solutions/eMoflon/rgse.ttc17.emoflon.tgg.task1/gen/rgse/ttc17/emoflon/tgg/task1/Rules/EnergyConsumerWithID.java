/**
 */
package rgse.ttc17.emoflon.tgg.task1.Rules;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61970.Wires.EnergyConsumer;

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
 * A representation of the model object '<em><b>Energy Consumer With ID</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see rgse.ttc17.emoflon.tgg.task1.Rules.RulesPackage#getEnergyConsumerWithID()
 * @model
 * @generated
 */
public interface EnergyConsumerWithID extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, ElectricityValues electric, ServiceDeliveryPoint deliver, MeterAsset asset,
			PhysicalDevice device, EnergyConsumer consumer, AutoConnectObject connect,
			MeterAssetPhysicalDevicePair pair);

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
	void registerObjectsToMatch_FWD(Match match, ElectricityValues electric, ServiceDeliveryPoint deliver,
			MeterAsset asset, PhysicalDevice device, EnergyConsumer consumer, AutoConnectObject connect,
			MeterAssetPhysicalDevicePair pair);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, ElectricityValues electric, ServiceDeliveryPoint deliver,
			MeterAsset asset, PhysicalDevice device, EnergyConsumer consumer, AutoConnectObject connect,
			MeterAssetPhysicalDevicePair pair);

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
	CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ElectricityValues electric,
			ServiceDeliveryPoint deliver, MeterAsset asset, PhysicalDevice device, EnergyConsumer consumer,
			AutoConnectObject connect, MeterAssetPhysicalDevicePair pair);

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
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject assetCorr, EObject electric, EObject deliver,
			EObject deviceCorr, EObject asset, EObject device, EObject consumer, EObject connect, EObject pair,
			EObject trgConsumer);

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
	EObjectContainer isAppropriate_FWD_EMoflonEdge_21(EMoflonEdge _edge_b);

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
	boolean checkDEC_FWD(ElectricityValues electric, ServiceDeliveryPoint deliver, MeterAsset asset,
			PhysicalDevice device, EnergyConsumer consumer, AutoConnectObject connect,
			MeterAssetPhysicalDevicePair pair);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // EnergyConsumerWithID
