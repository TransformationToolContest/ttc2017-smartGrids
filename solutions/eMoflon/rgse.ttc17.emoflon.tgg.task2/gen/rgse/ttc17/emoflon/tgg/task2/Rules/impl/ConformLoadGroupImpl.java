/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules.impl;

import gluemodel.CIM.IEC61968.Metering.EndDeviceAsset;
import gluemodel.CIM.IEC61968.Metering.MeterAsset;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61970.LoadModel.ConformLoad;

import gluemodel.MeterAssetPhysicalDevicePair;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.runtime.AttributeConstraintsRuleResult;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.EObjectContainer;
import org.moflon.tgg.runtime.IsApplicableMatch;
import org.moflon.tgg.runtime.IsApplicableRuleResult;
import org.moflon.tgg.runtime.Match;
import org.moflon.tgg.runtime.PerformRuleResult;
import org.moflon.tgg.runtime.RuntimeFactory;
import org.moflon.tgg.runtime.TripleMatch;

import org.moflon.tgg.runtime.impl.AbstractRuleImpl;

import outagePreventionJointarget.EnergyConsumer;
import outagePreventionJointarget.OutagePreventionJointargetFactory;

import rgse.ttc17.emoflon.tgg.task2.ConformLoadGroupToConformLoadGroup;
import rgse.ttc17.emoflon.tgg.task2.EnergyConsumerToEnergyConsumer;

import rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup;
import rgse.ttc17.emoflon.tgg.task2.Rules.RulesPackage;

import rgse.ttc17.emoflon.tgg.task2.Task2Factory;
// <-- [user defined imports]
import org.moflon.tgg.csp.*;
import rgse.ttc17.emoflon.tgg.task2.csp.constraints.*;
import org.moflon.tgg.csp.constraints.*;
import org.moflon.tgg.language.csp.*;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conform Load Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConformLoadGroupImpl extends AbstractRuleImpl implements ConformLoadGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformLoadGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getConformLoadGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MeterAsset asset, ConformLoad srcConsumer,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver) {
		// initial bindings
		Object[] result1_black = ConformLoadGroupImpl.pattern_ConformLoadGroup_0_1_initialbindings_blackBBBBBBB(this,
				match, asset, srcConsumer, srcGroup, pair, srcDeliver);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[asset] = " + asset + ", "
					+ "[srcConsumer] = " + srcConsumer + ", " + "[srcGroup] = " + srcGroup + ", " + "[pair] = " + pair
					+ ", " + "[srcDeliver] = " + srcDeliver + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ConformLoadGroupImpl
				.pattern_ConformLoadGroup_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, asset, srcConsumer,
						srcGroup, pair, srcDeliver);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[asset] = " + asset + ", " + "[srcConsumer] = "
					+ srcConsumer + ", " + "[srcGroup] = " + srcGroup + ", " + "[pair] = " + pair + ", "
					+ "[srcDeliver] = " + srcDeliver + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ConformLoadGroupImpl.pattern_ConformLoadGroup_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ConformLoadGroupImpl
					.pattern_ConformLoadGroup_0_4_collectelementstobetranslated_blackBBBBBB(match, asset, srcConsumer,
							srcGroup, pair, srcDeliver);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[asset] = " + asset + ", "
						+ "[srcConsumer] = " + srcConsumer + ", " + "[srcGroup] = " + srcGroup + ", " + "[pair] = "
						+ pair + ", " + "[srcDeliver] = " + srcDeliver + ".");
			}
			ConformLoadGroupImpl.pattern_ConformLoadGroup_0_4_collectelementstobetranslated_greenBBBFF(match,
					srcConsumer, srcGroup);
			// EMoflonEdge srcConsumer__srcGroup____LoadGroup = (EMoflonEdge) result4_green[3];
			// EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = ConformLoadGroupImpl
					.pattern_ConformLoadGroup_0_5_collectcontextelements_blackBBBBBB(match, asset, srcConsumer,
							srcGroup, pair, srcDeliver);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[asset] = " + asset + ", "
						+ "[srcConsumer] = " + srcConsumer + ", " + "[srcGroup] = " + srcGroup + ", " + "[pair] = "
						+ pair + ", " + "[srcDeliver] = " + srcDeliver + ".");
			}
			ConformLoadGroupImpl.pattern_ConformLoadGroup_0_5_collectcontextelements_greenBBBBBFFFFF(match, asset,
					srcConsumer, pair, srcDeliver);
			// EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = (EMoflonEdge) result5_green[5];
			// EMoflonEdge srcDeliver__asset____EndDeviceAssets = (EMoflonEdge) result5_green[6];
			// EMoflonEdge pair__asset____a = (EMoflonEdge) result5_green[7];
			// EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = (EMoflonEdge) result5_green[8];
			// EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = (EMoflonEdge) result5_green[9];

			// register objects to match
			ConformLoadGroupImpl.pattern_ConformLoadGroup_0_6_registerobjectstomatch_expressionBBBBBBB(this, match,
					asset, srcConsumer, srcGroup, pair, srcDeliver);
			return ConformLoadGroupImpl.pattern_ConformLoadGroup_0_7_expressionF();
		} else {
			return ConformLoadGroupImpl.pattern_ConformLoadGroup_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ConformLoadGroupImpl
				.pattern_ConformLoadGroup_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MeterAsset asset = (MeterAsset) result1_bindingAndBlack[0];
		ConformLoad srcConsumer = (ConformLoad) result1_bindingAndBlack[1];
		gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup = (gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) result1_bindingAndBlack[2];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result1_bindingAndBlack[3];
		ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result1_bindingAndBlack[4];
		EnergyConsumerToEnergyConsumer consumerToConsumer = (EnergyConsumerToEnergyConsumer) result1_bindingAndBlack[5];
		outagePreventionJointarget.ConformLoad trgConsumer = (outagePreventionJointarget.ConformLoad) result1_bindingAndBlack[6];
		// CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = ConformLoadGroupImpl
				.pattern_ConformLoadGroup_1_1_performtransformation_greenBFBF(srcGroup, trgConsumer);
		ConformLoadGroupToConformLoadGroup groupToGroup = (ConformLoadGroupToConformLoadGroup) result1_green[1];
		outagePreventionJointarget.ConformLoadGroup trgGroup = (outagePreventionJointarget.ConformLoadGroup) result1_green[3];

		// collect translated elements
		Object[] result2_black = ConformLoadGroupImpl
				.pattern_ConformLoadGroup_1_2_collecttranslatedelements_blackBBB(srcGroup, groupToGroup, trgGroup);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[srcGroup] = " + srcGroup + ", " + "[groupToGroup] = " + groupToGroup + ", " + "[trgGroup] = "
					+ trgGroup + ".");
		}
		Object[] result2_green = ConformLoadGroupImpl
				.pattern_ConformLoadGroup_1_2_collecttranslatedelements_greenFBBB(srcGroup, groupToGroup, trgGroup);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ConformLoadGroupImpl.pattern_ConformLoadGroup_1_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, asset, srcConsumer, srcGroup, pair, groupToGroup, srcDeliver, consumerToConsumer,
				trgConsumer, trgGroup);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[asset] = " + asset + ", " + "[srcConsumer] = "
					+ srcConsumer + ", " + "[srcGroup] = " + srcGroup + ", " + "[pair] = " + pair + ", "
					+ "[groupToGroup] = " + groupToGroup + ", " + "[srcDeliver] = " + srcDeliver + ", "
					+ "[consumerToConsumer] = " + consumerToConsumer + ", " + "[trgConsumer] = " + trgConsumer + ", "
					+ "[trgGroup] = " + trgGroup + ".");
		}
		ConformLoadGroupImpl.pattern_ConformLoadGroup_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, srcConsumer,
				srcGroup, groupToGroup, trgConsumer, trgGroup);
		// EMoflonEdge srcConsumer__srcGroup____LoadGroup = (EMoflonEdge) result3_green[6];
		// EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = (EMoflonEdge) result3_green[7];
		// EMoflonEdge groupToGroup__srcGroup____source = (EMoflonEdge) result3_green[8];
		// EMoflonEdge trgConsumer__trgGroup____LoadGroup = (EMoflonEdge) result3_green[9];
		// EMoflonEdge groupToGroup__trgGroup____target = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		ConformLoadGroupImpl.pattern_ConformLoadGroup_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, asset,
				srcConsumer, srcGroup, pair, groupToGroup, srcDeliver, consumerToConsumer, trgConsumer, trgGroup);
		return ConformLoadGroupImpl.pattern_ConformLoadGroup_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ConformLoadGroupImpl
				.pattern_ConformLoadGroup_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ConformLoadGroupImpl
				.pattern_ConformLoadGroup_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ConformLoadGroupImpl.pattern_ConformLoadGroup_2_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MeterAsset asset = (MeterAsset) result2_binding[0];
		ConformLoad srcConsumer = (ConformLoad) result2_binding[1];
		gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup = (gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) result2_binding[2];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_binding[3];
		ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result2_binding[4];
		for (Object[] result2_black : ConformLoadGroupImpl.pattern_ConformLoadGroup_2_2_corematch_blackBBBBBFFB(asset,
				srcConsumer, srcGroup, pair, srcDeliver, match)) {
			EnergyConsumerToEnergyConsumer consumerToConsumer = (EnergyConsumerToEnergyConsumer) result2_black[5];
			outagePreventionJointarget.ConformLoad trgConsumer = (outagePreventionJointarget.ConformLoad) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : ConformLoadGroupImpl.pattern_ConformLoadGroup_2_3_findcontext_blackBBBBBBB(
					asset, srcConsumer, srcGroup, pair, srcDeliver, consumerToConsumer, trgConsumer)) {
				Object[] result3_green = ConformLoadGroupImpl
						.pattern_ConformLoadGroup_2_3_findcontext_greenBBBBBBBFFFFFFFFFF(asset, srcConsumer, srcGroup,
								pair, srcDeliver, consumerToConsumer, trgConsumer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge srcConsumer__srcGroup____LoadGroup = (EMoflonEdge) result3_green[8];
				// EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = (EMoflonEdge) result3_green[9];
				// EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = (EMoflonEdge) result3_green[10];
				// EMoflonEdge srcDeliver__asset____EndDeviceAssets = (EMoflonEdge) result3_green[11];
				// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[12];
				// EMoflonEdge consumerToConsumer__srcConsumer____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge consumerToConsumer__trgConsumer____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = (EMoflonEdge) result3_green[15];
				// EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = (EMoflonEdge) result3_green[16];

				// solve CSP
				Object[] result4_bindingAndBlack = ConformLoadGroupImpl
						.pattern_ConformLoadGroup_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, asset,
								srcConsumer, srcGroup, pair, srcDeliver, consumerToConsumer, trgConsumer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[asset] = " + asset + ", " + "[srcConsumer] = " + srcConsumer + ", " + "[srcGroup] = "
							+ srcGroup + ", " + "[pair] = " + pair + ", " + "[srcDeliver] = " + srcDeliver + ", "
							+ "[consumerToConsumer] = " + consumerToConsumer + ", " + "[trgConsumer] = " + trgConsumer
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ConformLoadGroupImpl.pattern_ConformLoadGroup_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ConformLoadGroupImpl
							.pattern_ConformLoadGroup_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ConformLoadGroupImpl.pattern_ConformLoadGroup_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return ConformLoadGroupImpl.pattern_ConformLoadGroup_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MeterAsset asset, ConformLoad srcConsumer,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver) {
		match.registerObject("asset", asset);
		match.registerObject("srcConsumer", srcConsumer);
		match.registerObject("srcGroup", srcGroup);
		match.registerObject("pair", pair);
		match.registerObject("srcDeliver", srcDeliver);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MeterAsset asset, ConformLoad srcConsumer,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MeterAsset asset, ConformLoad srcConsumer,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, EnergyConsumerToEnergyConsumer consumerToConsumer,
			outagePreventionJointarget.ConformLoad trgConsumer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("asset", asset);
		isApplicableMatch.registerObject("srcConsumer", srcConsumer);
		isApplicableMatch.registerObject("srcGroup", srcGroup);
		isApplicableMatch.registerObject("pair", pair);
		isApplicableMatch.registerObject("srcDeliver", srcDeliver);
		isApplicableMatch.registerObject("consumerToConsumer", consumerToConsumer);
		isApplicableMatch.registerObject("trgConsumer", trgConsumer);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject asset, EObject srcConsumer, EObject srcGroup,
			EObject pair, EObject groupToGroup, EObject srcDeliver, EObject consumerToConsumer, EObject trgConsumer,
			EObject trgGroup) {
		ruleresult.registerObject("asset", asset);
		ruleresult.registerObject("srcConsumer", srcConsumer);
		ruleresult.registerObject("srcGroup", srcGroup);
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("groupToGroup", groupToGroup);
		ruleresult.registerObject("srcDeliver", srcDeliver);
		ruleresult.registerObject("consumerToConsumer", consumerToConsumer);
		ruleresult.registerObject("trgConsumer", trgConsumer);
		ruleresult.registerObject("trgGroup", trgGroup);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("srcGroup").eClass())
				.equals("gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_23(EMoflonEdge _edge_LoadGroup) {
		// prepare return value
		Object[] result1_bindingAndBlack = ConformLoadGroupImpl
				.pattern_ConformLoadGroup_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ConformLoadGroupImpl.pattern_ConformLoadGroup_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ConformLoadGroupImpl
				.pattern_ConformLoadGroup_10_2_testcorematchandDECs_blackFFFFFB(_edge_LoadGroup)) {
			MeterAsset asset = (MeterAsset) result2_black[0];
			ConformLoad srcConsumer = (ConformLoad) result2_black[1];
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup = (gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) result2_black[2];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_black[3];
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result2_black[4];
			Object[] result2_green = ConformLoadGroupImpl
					.pattern_ConformLoadGroup_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ConformLoadGroupImpl
					.pattern_ConformLoadGroup_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, asset, srcConsumer, srcGroup, pair, srcDeliver)) {
				// Ensure that the correct types of elements are matched
				if (ConformLoadGroupImpl
						.pattern_ConformLoadGroup_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ConformLoadGroupImpl
							.pattern_ConformLoadGroup_10_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					ConformLoadGroupImpl.pattern_ConformLoadGroup_10_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ConformLoadGroupImpl.pattern_ConformLoadGroup_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ConformLoadGroup");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_FWD(MeterAsset asset, ConformLoad srcConsumer,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver) {// match tgg pattern
		Object[] result1_black = ConformLoadGroupImpl.pattern_ConformLoadGroup_13_1_matchtggpattern_blackBBBBB(asset,
				srcConsumer, srcGroup, pair, srcDeliver);
		if (result1_black != null) {
			return ConformLoadGroupImpl.pattern_ConformLoadGroup_13_2_expressionF();
		} else {
			return ConformLoadGroupImpl.pattern_ConformLoadGroup_13_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.CONFORM_LOAD_GROUP___IS_APPROPRIATE_FWD__MATCH_METERASSET_CONFORMLOAD_CONFORMLOADGROUP_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT:
			return isAppropriate_FWD((Match) arguments.get(0), (MeterAsset) arguments.get(1),
					(ConformLoad) arguments.get(2),
					(gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) arguments.get(3),
					(MeterAssetPhysicalDevicePair) arguments.get(4), (ServiceDeliveryPoint) arguments.get(5));
		case RulesPackage.CONFORM_LOAD_GROUP___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CONFORM_LOAD_GROUP___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CONFORM_LOAD_GROUP___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSET_CONFORMLOAD_CONFORMLOADGROUP_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MeterAsset) arguments.get(1),
					(ConformLoad) arguments.get(2),
					(gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) arguments.get(3),
					(MeterAssetPhysicalDevicePair) arguments.get(4), (ServiceDeliveryPoint) arguments.get(5));
			return null;
		case RulesPackage.CONFORM_LOAD_GROUP___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSET_CONFORMLOAD_CONFORMLOADGROUP_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MeterAsset) arguments.get(1),
					(ConformLoad) arguments.get(2),
					(gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) arguments.get(3),
					(MeterAssetPhysicalDevicePair) arguments.get(4), (ServiceDeliveryPoint) arguments.get(5));
		case RulesPackage.CONFORM_LOAD_GROUP___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CONFORM_LOAD_GROUP___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METERASSET_CONFORMLOAD_CONFORMLOADGROUP_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT_ENERGYCONSUMERTOENERGYCONSUMER_CONFORMLOAD:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MeterAsset) arguments.get(1),
					(ConformLoad) arguments.get(2),
					(gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) arguments.get(3),
					(MeterAssetPhysicalDevicePair) arguments.get(4), (ServiceDeliveryPoint) arguments.get(5),
					(EnergyConsumerToEnergyConsumer) arguments.get(6),
					(outagePreventionJointarget.ConformLoad) arguments.get(7));
		case RulesPackage.CONFORM_LOAD_GROUP___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CONFORM_LOAD_GROUP___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.CONFORM_LOAD_GROUP___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CONFORM_LOAD_GROUP___IS_APPROPRIATE_FWD_EMOFLON_EDGE_23__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_23((EMoflonEdge) arguments.get(0));
		case RulesPackage.CONFORM_LOAD_GROUP___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CONFORM_LOAD_GROUP___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.CONFORM_LOAD_GROUP___CHECK_DEC_FWD__METERASSET_CONFORMLOAD_CONFORMLOADGROUP_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT:
			return checkDEC_FWD((MeterAsset) arguments.get(0), (ConformLoad) arguments.get(1),
					(gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) arguments.get(2),
					(MeterAssetPhysicalDevicePair) arguments.get(3), (ServiceDeliveryPoint) arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ConformLoadGroup_0_1_initialbindings_blackBBBBBBB(ConformLoadGroup _this,
			Match match, MeterAsset asset, ConformLoad srcConsumer,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver) {
		return new Object[] { _this, match, asset, srcConsumer, srcGroup, pair, srcDeliver };
	}

	public static final Object[] pattern_ConformLoadGroup_0_2_SolveCSP_bindingFBBBBBBB(ConformLoadGroup _this,
			Match match, MeterAsset asset, ConformLoad srcConsumer,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, asset, srcConsumer, srcGroup, pair, srcDeliver);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, asset, srcConsumer, srcGroup, pair, srcDeliver };
		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConformLoadGroup_0_2_SolveCSP_bindingAndBlackFBBBBBBB(ConformLoadGroup _this,
			Match match, MeterAsset asset, ConformLoad srcConsumer,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver) {
		Object[] result_pattern_ConformLoadGroup_0_2_SolveCSP_binding = pattern_ConformLoadGroup_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, asset, srcConsumer, srcGroup, pair, srcDeliver);
		if (result_pattern_ConformLoadGroup_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConformLoadGroup_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ConformLoadGroup_0_2_SolveCSP_black = pattern_ConformLoadGroup_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ConformLoadGroup_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, asset, srcConsumer, srcGroup, pair, srcDeliver };
			}
		}
		return null;
	}

	public static final boolean pattern_ConformLoadGroup_0_3_CheckCSP_expressionFBB(ConformLoadGroup _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConformLoadGroup_0_4_collectelementstobetranslated_blackBBBBBB(Match match,
			MeterAsset asset, ConformLoad srcConsumer, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup,
			MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver) {
		return new Object[] { match, asset, srcConsumer, srcGroup, pair, srcDeliver };
	}

	public static final Object[] pattern_ConformLoadGroup_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			ConformLoad srcConsumer, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup) {
		EMoflonEdge srcConsumer__srcGroup____LoadGroup = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(srcGroup);
		String srcConsumer__srcGroup____LoadGroup_name_prime = "LoadGroup";
		String srcGroup__srcConsumer____EnergyConsumers_name_prime = "EnergyConsumers";
		srcConsumer__srcGroup____LoadGroup.setSrc(srcConsumer);
		srcConsumer__srcGroup____LoadGroup.setTrg(srcGroup);
		match.getToBeTranslatedEdges().add(srcConsumer__srcGroup____LoadGroup);
		srcGroup__srcConsumer____EnergyConsumers.setSrc(srcGroup);
		srcGroup__srcConsumer____EnergyConsumers.setTrg(srcConsumer);
		match.getToBeTranslatedEdges().add(srcGroup__srcConsumer____EnergyConsumers);
		srcConsumer__srcGroup____LoadGroup.setName(srcConsumer__srcGroup____LoadGroup_name_prime);
		srcGroup__srcConsumer____EnergyConsumers.setName(srcGroup__srcConsumer____EnergyConsumers_name_prime);
		return new Object[] { match, srcConsumer, srcGroup, srcConsumer__srcGroup____LoadGroup,
				srcGroup__srcConsumer____EnergyConsumers };
	}

	public static final Object[] pattern_ConformLoadGroup_0_5_collectcontextelements_blackBBBBBB(Match match,
			MeterAsset asset, ConformLoad srcConsumer, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup,
			MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver) {
		return new Object[] { match, asset, srcConsumer, srcGroup, pair, srcDeliver };
	}

	public static final Object[] pattern_ConformLoadGroup_0_5_collectcontextelements_greenBBBBBFFFFF(Match match,
			MeterAsset asset, ConformLoad srcConsumer, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver) {
		EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(asset);
		match.getContextNodes().add(srcConsumer);
		match.getContextNodes().add(pair);
		match.getContextNodes().add(srcDeliver);
		String asset__srcDeliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String srcDeliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		String pair__asset____a_name_prime = "a";
		String srcDeliver__srcConsumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime = "ServiceDeliveryPoints";
		asset__srcDeliver____ServiceDeliveryPoint.setSrc(asset);
		asset__srcDeliver____ServiceDeliveryPoint.setTrg(srcDeliver);
		match.getContextEdges().add(asset__srcDeliver____ServiceDeliveryPoint);
		srcDeliver__asset____EndDeviceAssets.setSrc(srcDeliver);
		srcDeliver__asset____EndDeviceAssets.setTrg(asset);
		match.getContextEdges().add(srcDeliver__asset____EndDeviceAssets);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		match.getContextEdges().add(pair__asset____a);
		srcDeliver__srcConsumer____EnergyConsumer.setSrc(srcDeliver);
		srcDeliver__srcConsumer____EnergyConsumer.setTrg(srcConsumer);
		match.getContextEdges().add(srcDeliver__srcConsumer____EnergyConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setSrc(srcConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setTrg(srcDeliver);
		match.getContextEdges().add(srcConsumer__srcDeliver____ServiceDeliveryPoints);
		asset__srcDeliver____ServiceDeliveryPoint.setName(asset__srcDeliver____ServiceDeliveryPoint_name_prime);
		srcDeliver__asset____EndDeviceAssets.setName(srcDeliver__asset____EndDeviceAssets_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		srcDeliver__srcConsumer____EnergyConsumer.setName(srcDeliver__srcConsumer____EnergyConsumer_name_prime);
		srcConsumer__srcDeliver____ServiceDeliveryPoints
				.setName(srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime);
		return new Object[] { match, asset, srcConsumer, pair, srcDeliver, asset__srcDeliver____ServiceDeliveryPoint,
				srcDeliver__asset____EndDeviceAssets, pair__asset____a, srcDeliver__srcConsumer____EnergyConsumer,
				srcConsumer__srcDeliver____ServiceDeliveryPoints };
	}

	public static final void pattern_ConformLoadGroup_0_6_registerobjectstomatch_expressionBBBBBBB(
			ConformLoadGroup _this, Match match, MeterAsset asset, ConformLoad srcConsumer,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver) {
		_this.registerObjectsToMatch_FWD(match, asset, srcConsumer, srcGroup, pair, srcDeliver);

	}

	public static final boolean pattern_ConformLoadGroup_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ConformLoadGroup_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ConformLoadGroup_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("asset");
		EObject _localVariable_1 = isApplicableMatch.getObject("srcConsumer");
		EObject _localVariable_2 = isApplicableMatch.getObject("srcGroup");
		EObject _localVariable_3 = isApplicableMatch.getObject("pair");
		EObject _localVariable_4 = isApplicableMatch.getObject("srcDeliver");
		EObject _localVariable_5 = isApplicableMatch.getObject("consumerToConsumer");
		EObject _localVariable_6 = isApplicableMatch.getObject("trgConsumer");
		EObject tmpAsset = _localVariable_0;
		EObject tmpSrcConsumer = _localVariable_1;
		EObject tmpSrcGroup = _localVariable_2;
		EObject tmpPair = _localVariable_3;
		EObject tmpSrcDeliver = _localVariable_4;
		EObject tmpConsumerToConsumer = _localVariable_5;
		EObject tmpTrgConsumer = _localVariable_6;
		if (tmpAsset instanceof MeterAsset) {
			MeterAsset asset = (MeterAsset) tmpAsset;
			if (tmpSrcConsumer instanceof ConformLoad) {
				ConformLoad srcConsumer = (ConformLoad) tmpSrcConsumer;
				if (tmpSrcGroup instanceof gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) {
					gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup = (gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) tmpSrcGroup;
					if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
						MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
						if (tmpSrcDeliver instanceof ServiceDeliveryPoint) {
							ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) tmpSrcDeliver;
							if (tmpConsumerToConsumer instanceof EnergyConsumerToEnergyConsumer) {
								EnergyConsumerToEnergyConsumer consumerToConsumer = (EnergyConsumerToEnergyConsumer) tmpConsumerToConsumer;
								if (tmpTrgConsumer instanceof outagePreventionJointarget.ConformLoad) {
									outagePreventionJointarget.ConformLoad trgConsumer = (outagePreventionJointarget.ConformLoad) tmpTrgConsumer;
									return new Object[] { asset, srcConsumer, srcGroup, pair, srcDeliver,
											consumerToConsumer, trgConsumer, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_1_1_performtransformation_blackBBBBBBBFBB(MeterAsset asset,
			ConformLoad srcConsumer, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup,
			MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver,
			EnergyConsumerToEnergyConsumer consumerToConsumer, outagePreventionJointarget.ConformLoad trgConsumer,
			ConformLoadGroup _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { asset, srcConsumer, srcGroup, pair, srcDeliver, consumerToConsumer, trgConsumer,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			ConformLoadGroup _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ConformLoadGroup_1_1_performtransformation_binding = pattern_ConformLoadGroup_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ConformLoadGroup_1_1_performtransformation_binding != null) {
			MeterAsset asset = (MeterAsset) result_pattern_ConformLoadGroup_1_1_performtransformation_binding[0];
			ConformLoad srcConsumer = (ConformLoad) result_pattern_ConformLoadGroup_1_1_performtransformation_binding[1];
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup = (gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) result_pattern_ConformLoadGroup_1_1_performtransformation_binding[2];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result_pattern_ConformLoadGroup_1_1_performtransformation_binding[3];
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result_pattern_ConformLoadGroup_1_1_performtransformation_binding[4];
			EnergyConsumerToEnergyConsumer consumerToConsumer = (EnergyConsumerToEnergyConsumer) result_pattern_ConformLoadGroup_1_1_performtransformation_binding[5];
			outagePreventionJointarget.ConformLoad trgConsumer = (outagePreventionJointarget.ConformLoad) result_pattern_ConformLoadGroup_1_1_performtransformation_binding[6];

			Object[] result_pattern_ConformLoadGroup_1_1_performtransformation_black = pattern_ConformLoadGroup_1_1_performtransformation_blackBBBBBBBFBB(
					asset, srcConsumer, srcGroup, pair, srcDeliver, consumerToConsumer, trgConsumer, _this,
					isApplicableMatch);
			if (result_pattern_ConformLoadGroup_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ConformLoadGroup_1_1_performtransformation_black[7];

				return new Object[] { asset, srcConsumer, srcGroup, pair, srcDeliver, consumerToConsumer, trgConsumer,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_1_1_performtransformation_greenBFBF(
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup,
			outagePreventionJointarget.ConformLoad trgConsumer) {
		ConformLoadGroupToConformLoadGroup groupToGroup = Task2Factory.eINSTANCE
				.createConformLoadGroupToConformLoadGroup();
		outagePreventionJointarget.ConformLoadGroup trgGroup = OutagePreventionJointargetFactory.eINSTANCE
				.createConformLoadGroup();
		groupToGroup.setSource(srcGroup);
		trgConsumer.setLoadGroup(trgGroup);
		groupToGroup.setTarget(trgGroup);
		return new Object[] { srcGroup, groupToGroup, trgConsumer, trgGroup };
	}

	public static final Object[] pattern_ConformLoadGroup_1_2_collecttranslatedelements_blackBBB(
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoadGroupToConformLoadGroup groupToGroup,
			outagePreventionJointarget.ConformLoadGroup trgGroup) {
		return new Object[] { srcGroup, groupToGroup, trgGroup };
	}

	public static final Object[] pattern_ConformLoadGroup_1_2_collecttranslatedelements_greenFBBB(
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoadGroupToConformLoadGroup groupToGroup,
			outagePreventionJointarget.ConformLoadGroup trgGroup) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(srcGroup);
		ruleresult.getCreatedLinkElements().add(groupToGroup);
		ruleresult.getCreatedElements().add(trgGroup);
		return new Object[] { ruleresult, srcGroup, groupToGroup, trgGroup };
	}

	public static final Object[] pattern_ConformLoadGroup_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject asset, EObject srcConsumer, EObject srcGroup, EObject pair,
			EObject groupToGroup, EObject srcDeliver, EObject consumerToConsumer, EObject trgConsumer,
			EObject trgGroup) {
		if (!asset.equals(srcConsumer)) {
			if (!asset.equals(srcGroup)) {
				if (!asset.equals(pair)) {
					if (!asset.equals(groupToGroup)) {
						if (!asset.equals(srcDeliver)) {
							if (!asset.equals(consumerToConsumer)) {
								if (!asset.equals(trgConsumer)) {
									if (!asset.equals(trgGroup)) {
										if (!srcConsumer.equals(srcGroup)) {
											if (!srcConsumer.equals(srcDeliver)) {
												if (!srcConsumer.equals(trgConsumer)) {
													if (!srcConsumer.equals(trgGroup)) {
														if (!srcGroup.equals(trgConsumer)) {
															if (!srcGroup.equals(trgGroup)) {
																if (!pair.equals(srcConsumer)) {
																	if (!pair.equals(srcGroup)) {
																		if (!pair.equals(srcDeliver)) {
																			if (!pair.equals(trgConsumer)) {
																				if (!pair.equals(trgGroup)) {
																					if (!groupToGroup
																							.equals(srcConsumer)) {
																						if (!groupToGroup
																								.equals(srcGroup)) {
																							if (!groupToGroup
																									.equals(pair)) {
																								if (!groupToGroup
																										.equals(srcDeliver)) {
																									if (!groupToGroup
																											.equals(trgConsumer)) {
																										if (!groupToGroup
																												.equals(trgGroup)) {
																											if (!srcDeliver
																													.equals(srcGroup)) {
																												if (!srcDeliver
																														.equals(trgConsumer)) {
																													if (!srcDeliver
																															.equals(trgGroup)) {
																														if (!consumerToConsumer
																																.equals(srcConsumer)) {
																															if (!consumerToConsumer
																																	.equals(srcGroup)) {
																																if (!consumerToConsumer
																																		.equals(pair)) {
																																	if (!consumerToConsumer
																																			.equals(groupToGroup)) {
																																		if (!consumerToConsumer
																																				.equals(srcDeliver)) {
																																			if (!consumerToConsumer
																																					.equals(trgConsumer)) {
																																				if (!consumerToConsumer
																																						.equals(trgGroup)) {
																																					if (!trgConsumer
																																							.equals(trgGroup)) {
																																						return new Object[] {
																																								ruleresult,
																																								asset,
																																								srcConsumer,
																																								srcGroup,
																																								pair,
																																								groupToGroup,
																																								srcDeliver,
																																								consumerToConsumer,
																																								trgConsumer,
																																								trgGroup };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject srcConsumer, EObject srcGroup, EObject groupToGroup,
			EObject trgConsumer, EObject trgGroup) {
		EMoflonEdge srcConsumer__srcGroup____LoadGroup = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge groupToGroup__srcGroup____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgConsumer__trgGroup____LoadGroup = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge groupToGroup__trgGroup____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ConformLoadGroup";
		String srcConsumer__srcGroup____LoadGroup_name_prime = "LoadGroup";
		String srcGroup__srcConsumer____EnergyConsumers_name_prime = "EnergyConsumers";
		String groupToGroup__srcGroup____source_name_prime = "source";
		String trgConsumer__trgGroup____LoadGroup_name_prime = "LoadGroup";
		String groupToGroup__trgGroup____target_name_prime = "target";
		srcConsumer__srcGroup____LoadGroup.setSrc(srcConsumer);
		srcConsumer__srcGroup____LoadGroup.setTrg(srcGroup);
		ruleresult.getTranslatedEdges().add(srcConsumer__srcGroup____LoadGroup);
		srcGroup__srcConsumer____EnergyConsumers.setSrc(srcGroup);
		srcGroup__srcConsumer____EnergyConsumers.setTrg(srcConsumer);
		ruleresult.getTranslatedEdges().add(srcGroup__srcConsumer____EnergyConsumers);
		groupToGroup__srcGroup____source.setSrc(groupToGroup);
		groupToGroup__srcGroup____source.setTrg(srcGroup);
		ruleresult.getCreatedEdges().add(groupToGroup__srcGroup____source);
		trgConsumer__trgGroup____LoadGroup.setSrc(trgConsumer);
		trgConsumer__trgGroup____LoadGroup.setTrg(trgGroup);
		ruleresult.getCreatedEdges().add(trgConsumer__trgGroup____LoadGroup);
		groupToGroup__trgGroup____target.setSrc(groupToGroup);
		groupToGroup__trgGroup____target.setTrg(trgGroup);
		ruleresult.getCreatedEdges().add(groupToGroup__trgGroup____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		srcConsumer__srcGroup____LoadGroup.setName(srcConsumer__srcGroup____LoadGroup_name_prime);
		srcGroup__srcConsumer____EnergyConsumers.setName(srcGroup__srcConsumer____EnergyConsumers_name_prime);
		groupToGroup__srcGroup____source.setName(groupToGroup__srcGroup____source_name_prime);
		trgConsumer__trgGroup____LoadGroup.setName(trgConsumer__trgGroup____LoadGroup_name_prime);
		groupToGroup__trgGroup____target.setName(groupToGroup__trgGroup____target_name_prime);
		return new Object[] { ruleresult, srcConsumer, srcGroup, groupToGroup, trgConsumer, trgGroup,
				srcConsumer__srcGroup____LoadGroup, srcGroup__srcConsumer____EnergyConsumers,
				groupToGroup__srcGroup____source, trgConsumer__trgGroup____LoadGroup,
				groupToGroup__trgGroup____target };
	}

	public static final void pattern_ConformLoadGroup_1_5_registerobjects_expressionBBBBBBBBBBB(ConformLoadGroup _this,
			PerformRuleResult ruleresult, EObject asset, EObject srcConsumer, EObject srcGroup, EObject pair,
			EObject groupToGroup, EObject srcDeliver, EObject consumerToConsumer, EObject trgConsumer,
			EObject trgGroup) {
		_this.registerObjects_FWD(ruleresult, asset, srcConsumer, srcGroup, pair, groupToGroup, srcDeliver,
				consumerToConsumer, trgConsumer, trgGroup);

	}

	public static final PerformRuleResult pattern_ConformLoadGroup_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ConformLoadGroup_2_1_preparereturnvalue_bindingFB(ConformLoadGroup _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ConformLoadGroup _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_2_1_preparereturnvalue_bindingAndBlackFFB(
			ConformLoadGroup _this) {
		Object[] result_pattern_ConformLoadGroup_2_1_preparereturnvalue_binding = pattern_ConformLoadGroup_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ConformLoadGroup_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ConformLoadGroup_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ConformLoadGroup_2_1_preparereturnvalue_black = pattern_ConformLoadGroup_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ConformLoadGroup_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ConformLoadGroup_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ConformLoadGroup";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ConformLoadGroup_2_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("asset");
		EObject _localVariable_1 = match.getObject("srcConsumer");
		EObject _localVariable_2 = match.getObject("srcGroup");
		EObject _localVariable_3 = match.getObject("pair");
		EObject _localVariable_4 = match.getObject("srcDeliver");
		EObject tmpAsset = _localVariable_0;
		EObject tmpSrcConsumer = _localVariable_1;
		EObject tmpSrcGroup = _localVariable_2;
		EObject tmpPair = _localVariable_3;
		EObject tmpSrcDeliver = _localVariable_4;
		if (tmpAsset instanceof MeterAsset) {
			MeterAsset asset = (MeterAsset) tmpAsset;
			if (tmpSrcConsumer instanceof ConformLoad) {
				ConformLoad srcConsumer = (ConformLoad) tmpSrcConsumer;
				if (tmpSrcGroup instanceof gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) {
					gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup = (gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) tmpSrcGroup;
					if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
						MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
						if (tmpSrcDeliver instanceof ServiceDeliveryPoint) {
							ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) tmpSrcDeliver;
							return new Object[] { asset, srcConsumer, srcGroup, pair, srcDeliver, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ConformLoadGroup_2_2_corematch_blackBBBBBFFB(MeterAsset asset,
			ConformLoad srcConsumer, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup,
			MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (EnergyConsumerToEnergyConsumer consumerToConsumer : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcConsumer, EnergyConsumerToEnergyConsumer.class, "source")) {
			EnergyConsumer tmpTrgConsumer = consumerToConsumer.getTarget();
			if (tmpTrgConsumer instanceof outagePreventionJointarget.ConformLoad) {
				outagePreventionJointarget.ConformLoad trgConsumer = (outagePreventionJointarget.ConformLoad) tmpTrgConsumer;
				_result.add(new Object[] { asset, srcConsumer, srcGroup, pair, srcDeliver, consumerToConsumer,
						trgConsumer, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ConformLoadGroup_2_3_findcontext_blackBBBBBBB(MeterAsset asset,
			ConformLoad srcConsumer, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup,
			MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver,
			EnergyConsumerToEnergyConsumer consumerToConsumer, outagePreventionJointarget.ConformLoad trgConsumer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (srcGroup.equals(srcConsumer.getLoadGroup())) {
			if (srcDeliver.equals(asset.getServiceDeliveryPoint())) {
				if (asset.equals(pair.getA())) {
					if (srcConsumer.equals(consumerToConsumer.getSource())) {
						if (trgConsumer.equals(consumerToConsumer.getTarget())) {
							if (srcConsumer.equals(srcDeliver.getEnergyConsumer())) {
								_result.add(new Object[] { asset, srcConsumer, srcGroup, pair, srcDeliver,
										consumerToConsumer, trgConsumer });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ConformLoadGroup_2_3_findcontext_greenBBBBBBBFFFFFFFFFF(MeterAsset asset,
			ConformLoad srcConsumer, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup,
			MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver,
			EnergyConsumerToEnergyConsumer consumerToConsumer, outagePreventionJointarget.ConformLoad trgConsumer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge srcConsumer__srcGroup____LoadGroup = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge consumerToConsumer__srcConsumer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge consumerToConsumer__trgConsumer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcConsumer__srcGroup____LoadGroup_name_prime = "LoadGroup";
		String srcGroup__srcConsumer____EnergyConsumers_name_prime = "EnergyConsumers";
		String asset__srcDeliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String srcDeliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		String pair__asset____a_name_prime = "a";
		String consumerToConsumer__srcConsumer____source_name_prime = "source";
		String consumerToConsumer__trgConsumer____target_name_prime = "target";
		String srcDeliver__srcConsumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime = "ServiceDeliveryPoints";
		isApplicableMatch.getAllContextElements().add(asset);
		isApplicableMatch.getAllContextElements().add(srcConsumer);
		isApplicableMatch.getAllContextElements().add(srcGroup);
		isApplicableMatch.getAllContextElements().add(pair);
		isApplicableMatch.getAllContextElements().add(srcDeliver);
		isApplicableMatch.getAllContextElements().add(consumerToConsumer);
		isApplicableMatch.getAllContextElements().add(trgConsumer);
		srcConsumer__srcGroup____LoadGroup.setSrc(srcConsumer);
		srcConsumer__srcGroup____LoadGroup.setTrg(srcGroup);
		isApplicableMatch.getAllContextElements().add(srcConsumer__srcGroup____LoadGroup);
		srcGroup__srcConsumer____EnergyConsumers.setSrc(srcGroup);
		srcGroup__srcConsumer____EnergyConsumers.setTrg(srcConsumer);
		isApplicableMatch.getAllContextElements().add(srcGroup__srcConsumer____EnergyConsumers);
		asset__srcDeliver____ServiceDeliveryPoint.setSrc(asset);
		asset__srcDeliver____ServiceDeliveryPoint.setTrg(srcDeliver);
		isApplicableMatch.getAllContextElements().add(asset__srcDeliver____ServiceDeliveryPoint);
		srcDeliver__asset____EndDeviceAssets.setSrc(srcDeliver);
		srcDeliver__asset____EndDeviceAssets.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(srcDeliver__asset____EndDeviceAssets);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(pair__asset____a);
		consumerToConsumer__srcConsumer____source.setSrc(consumerToConsumer);
		consumerToConsumer__srcConsumer____source.setTrg(srcConsumer);
		isApplicableMatch.getAllContextElements().add(consumerToConsumer__srcConsumer____source);
		consumerToConsumer__trgConsumer____target.setSrc(consumerToConsumer);
		consumerToConsumer__trgConsumer____target.setTrg(trgConsumer);
		isApplicableMatch.getAllContextElements().add(consumerToConsumer__trgConsumer____target);
		srcDeliver__srcConsumer____EnergyConsumer.setSrc(srcDeliver);
		srcDeliver__srcConsumer____EnergyConsumer.setTrg(srcConsumer);
		isApplicableMatch.getAllContextElements().add(srcDeliver__srcConsumer____EnergyConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setSrc(srcConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setTrg(srcDeliver);
		isApplicableMatch.getAllContextElements().add(srcConsumer__srcDeliver____ServiceDeliveryPoints);
		srcConsumer__srcGroup____LoadGroup.setName(srcConsumer__srcGroup____LoadGroup_name_prime);
		srcGroup__srcConsumer____EnergyConsumers.setName(srcGroup__srcConsumer____EnergyConsumers_name_prime);
		asset__srcDeliver____ServiceDeliveryPoint.setName(asset__srcDeliver____ServiceDeliveryPoint_name_prime);
		srcDeliver__asset____EndDeviceAssets.setName(srcDeliver__asset____EndDeviceAssets_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		consumerToConsumer__srcConsumer____source.setName(consumerToConsumer__srcConsumer____source_name_prime);
		consumerToConsumer__trgConsumer____target.setName(consumerToConsumer__trgConsumer____target_name_prime);
		srcDeliver__srcConsumer____EnergyConsumer.setName(srcDeliver__srcConsumer____EnergyConsumer_name_prime);
		srcConsumer__srcDeliver____ServiceDeliveryPoints
				.setName(srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime);
		return new Object[] { asset, srcConsumer, srcGroup, pair, srcDeliver, consumerToConsumer, trgConsumer,
				isApplicableMatch, srcConsumer__srcGroup____LoadGroup, srcGroup__srcConsumer____EnergyConsumers,
				asset__srcDeliver____ServiceDeliveryPoint, srcDeliver__asset____EndDeviceAssets, pair__asset____a,
				consumerToConsumer__srcConsumer____source, consumerToConsumer__trgConsumer____target,
				srcDeliver__srcConsumer____EnergyConsumer, srcConsumer__srcDeliver____ServiceDeliveryPoints };
	}

	public static final Object[] pattern_ConformLoadGroup_2_4_solveCSP_bindingFBBBBBBBBB(ConformLoadGroup _this,
			IsApplicableMatch isApplicableMatch, MeterAsset asset, ConformLoad srcConsumer,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, EnergyConsumerToEnergyConsumer consumerToConsumer,
			outagePreventionJointarget.ConformLoad trgConsumer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, asset, srcConsumer, srcGroup, pair,
				srcDeliver, consumerToConsumer, trgConsumer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, asset, srcConsumer, srcGroup, pair, srcDeliver,
					consumerToConsumer, trgConsumer };
		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConformLoadGroup_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(ConformLoadGroup _this,
			IsApplicableMatch isApplicableMatch, MeterAsset asset, ConformLoad srcConsumer,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, EnergyConsumerToEnergyConsumer consumerToConsumer,
			outagePreventionJointarget.ConformLoad trgConsumer) {
		Object[] result_pattern_ConformLoadGroup_2_4_solveCSP_binding = pattern_ConformLoadGroup_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, asset, srcConsumer, srcGroup, pair, srcDeliver, consumerToConsumer,
				trgConsumer);
		if (result_pattern_ConformLoadGroup_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConformLoadGroup_2_4_solveCSP_binding[0];

			Object[] result_pattern_ConformLoadGroup_2_4_solveCSP_black = pattern_ConformLoadGroup_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ConformLoadGroup_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, asset, srcConsumer, srcGroup, pair, srcDeliver,
						consumerToConsumer, trgConsumer };
			}
		}
		return null;
	}

	public static final boolean pattern_ConformLoadGroup_2_5_checkCSP_expressionFBB(ConformLoadGroup _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConformLoadGroup_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ConformLoadGroup_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ConformLoadGroup";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ConformLoadGroup_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ConformLoadGroup_10_1_preparereturnvalue_bindingFB(ConformLoadGroup _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ConformLoadGroup _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_FWD")) {
				for (EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						String isApplicableCC_name = isApplicableCC.getName();
						if (isApplicableCC_name.equals("isApplicable_CC")) {
							return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_10_1_preparereturnvalue_bindingAndBlackFFBF(
			ConformLoadGroup _this) {
		Object[] result_pattern_ConformLoadGroup_10_1_preparereturnvalue_binding = pattern_ConformLoadGroup_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ConformLoadGroup_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ConformLoadGroup_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ConformLoadGroup_10_1_preparereturnvalue_black = pattern_ConformLoadGroup_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ConformLoadGroup_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ConformLoadGroup_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ConformLoadGroup_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ConformLoadGroup_10_2_testcorematchandDECs_black_nac_0BB(
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		for (ConformLoad __DEC_srcGroup_LoadGroup_190525 : srcGroup.getEnergyConsumers()) {
			if (!srcConsumer.equals(__DEC_srcGroup_LoadGroup_190525)) {
				return new Object[] { srcGroup, srcConsumer };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ConformLoadGroup_10_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_LoadGroup) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcConsumer = _edge_LoadGroup.getSrc();
		if (tmpSrcConsumer instanceof ConformLoad) {
			ConformLoad srcConsumer = (ConformLoad) tmpSrcConsumer;
			EObject tmpSrcGroup = _edge_LoadGroup.getTrg();
			if (tmpSrcGroup instanceof gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) {
				gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup = (gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) tmpSrcGroup;
				if (srcGroup.equals(srcConsumer.getLoadGroup())) {
					if (pattern_ConformLoadGroup_10_2_testcorematchandDECs_black_nac_0BB(srcGroup,
							srcConsumer) == null) {
						for (ServiceDeliveryPoint srcDeliver : srcConsumer.getServiceDeliveryPoints()) {
							for (EndDeviceAsset tmpAsset : srcDeliver.getEndDeviceAssets()) {
								if (tmpAsset instanceof MeterAsset) {
									MeterAsset asset = (MeterAsset) tmpAsset;
									for (MeterAssetPhysicalDevicePair pair : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(asset, MeterAssetPhysicalDevicePair.class,
													"a")) {
										_result.add(new Object[] { asset, srcConsumer, srcGroup, pair, srcDeliver,
												_edge_LoadGroup });
									}
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ConformLoadGroup_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ConformLoadGroup_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			ConformLoadGroup _this, Match match, MeterAsset asset, ConformLoad srcConsumer,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, asset, srcConsumer, srcGroup, pair, srcDeliver);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ConformLoadGroup_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ConformLoadGroup _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConformLoadGroup_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ConformLoadGroup_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ConformLoadGroup_13_1_matchtggpattern_black_nac_0BB(
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		for (ConformLoad __DEC_srcGroup_LoadGroup_646517 : srcGroup.getEnergyConsumers()) {
			if (!srcConsumer.equals(__DEC_srcGroup_LoadGroup_646517)) {
				return new Object[] { srcGroup, srcConsumer };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_13_1_matchtggpattern_blackBBBBB(MeterAsset asset,
			ConformLoad srcConsumer, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup,
			MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver) {
		if (srcGroup.equals(srcConsumer.getLoadGroup())) {
			if (srcDeliver.equals(asset.getServiceDeliveryPoint())) {
				if (asset.equals(pair.getA())) {
					if (srcConsumer.equals(srcDeliver.getEnergyConsumer())) {
						if (pattern_ConformLoadGroup_13_1_matchtggpattern_black_nac_0BB(srcGroup,
								srcConsumer) == null) {
							return new Object[] { asset, srcConsumer, srcGroup, pair, srcDeliver };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_ConformLoadGroup_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ConformLoadGroup_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ConformLoadGroupImpl
