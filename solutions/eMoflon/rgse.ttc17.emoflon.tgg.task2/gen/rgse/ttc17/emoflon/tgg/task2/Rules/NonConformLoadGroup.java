/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61970.LoadModel.NonConformLoad;

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

import rgse.ttc17.emoflon.tgg.task2.EnergyConsumerToEnergyConsumer;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Conform Load Group</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see rgse.ttc17.emoflon.tgg.task2.Rules.RulesPackage#getNonConformLoadGroup()
 * @model
 * @generated
 */
public interface NonConformLoadGroup extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, MeterAsset asset,
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, NonConformLoad srcConsumer);

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
	void registerObjectsToMatch_FWD(Match match, MeterAsset asset,
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, NonConformLoad srcConsumer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, MeterAsset asset,
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, NonConformLoad srcConsumer);

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
	CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MeterAsset asset,
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, outagePreventionJointarget.NonConformLoad trgConsumer,
			NonConformLoad srcConsumer, EnergyConsumerToEnergyConsumer consumerToConsumer);

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
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject asset, EObject srcGroup, EObject pair,
			EObject srcDeliver, EObject trgConsumer, EObject groupToGroup, EObject srcConsumer,
			EObject consumerToConsumer, EObject trgGroup);

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
	EObjectContainer isAppropriate_FWD_EMoflonEdge_30(EMoflonEdge _edge_LoadGroup);

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
	boolean checkDEC_FWD(MeterAsset asset, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup,
			MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver, NonConformLoad srcConsumer);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // NonConformLoadGroup
