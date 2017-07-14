/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules.impl;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;

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

import outagePreventionJointarget.OutagePreventionJointargetFactory;
import outagePreventionJointarget.PrivateMeterVoltage;

import rgse.ttc17.emoflon.tgg.task2.MeterAssetToPrivateMeterVoltage;

import rgse.ttc17.emoflon.tgg.task2.Rules.RulesPackage;
import rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint;

import rgse.ttc17.emoflon.tgg.task2.ServiceDeliveryPointToServiceDeliveryPoint;
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
 * An implementation of the model object '<em><b>Service Delivery Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ServiceDeliveryPointImpl extends AbstractRuleImpl implements ServiceDeliveryPoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDeliveryPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getServiceDeliveryPoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		// initial bindings
		Object[] result1_black = ServiceDeliveryPointImpl
				.pattern_ServiceDeliveryPoint_0_1_initialbindings_blackBBBBB(this, match, srcDeliver, asset, pair);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[srcDeliver] = " + srcDeliver + ", "
					+ "[asset] = " + asset + ", " + "[pair] = " + pair + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ServiceDeliveryPointImpl
				.pattern_ServiceDeliveryPoint_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, srcDeliver, asset, pair);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[srcDeliver] = " + srcDeliver + ", " + "[asset] = "
					+ asset + ", " + "[pair] = " + pair + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ServiceDeliveryPointImpl.pattern_ServiceDeliveryPoint_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ServiceDeliveryPointImpl
					.pattern_ServiceDeliveryPoint_0_4_collectelementstobetranslated_blackBBBB(match, srcDeliver, asset,
							pair);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[srcDeliver] = " + srcDeliver + ", "
						+ "[asset] = " + asset + ", " + "[pair] = " + pair + ".");
			}
			ServiceDeliveryPointImpl.pattern_ServiceDeliveryPoint_0_4_collectelementstobetranslated_greenBBBFF(match,
					srcDeliver, asset);
			// EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = (EMoflonEdge) result4_green[3];
			// EMoflonEdge srcDeliver__asset____EndDeviceAssets = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = ServiceDeliveryPointImpl
					.pattern_ServiceDeliveryPoint_0_5_collectcontextelements_blackBBBB(match, srcDeliver, asset, pair);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[srcDeliver] = " + srcDeliver + ", "
						+ "[asset] = " + asset + ", " + "[pair] = " + pair + ".");
			}
			ServiceDeliveryPointImpl.pattern_ServiceDeliveryPoint_0_5_collectcontextelements_greenBBBF(match, asset,
					pair);
			// EMoflonEdge pair__asset____a = (EMoflonEdge) result5_green[3];

			// register objects to match
			ServiceDeliveryPointImpl.pattern_ServiceDeliveryPoint_0_6_registerobjectstomatch_expressionBBBBB(this,
					match, srcDeliver, asset, pair);
			return ServiceDeliveryPointImpl.pattern_ServiceDeliveryPoint_0_7_expressionF();
		} else {
			return ServiceDeliveryPointImpl.pattern_ServiceDeliveryPoint_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ServiceDeliveryPointImpl
				.pattern_ServiceDeliveryPoint_1_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver = (gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) result1_bindingAndBlack[0];
		MeterAssetToPrivateMeterVoltage assetToMeter = (MeterAssetToPrivateMeterVoltage) result1_bindingAndBlack[1];
		MeterAsset asset = (MeterAsset) result1_bindingAndBlack[2];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result1_bindingAndBlack[3];
		PrivateMeterVoltage meter = (PrivateMeterVoltage) result1_bindingAndBlack[4];
		// CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = ServiceDeliveryPointImpl
				.pattern_ServiceDeliveryPoint_1_1_performtransformation_greenFFBB(srcDeliver, meter);
		outagePreventionJointarget.ServiceDeliveryPoint trgDeliver = (outagePreventionJointarget.ServiceDeliveryPoint) result1_green[0];
		ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver = (ServiceDeliveryPointToServiceDeliveryPoint) result1_green[1];

		// collect translated elements
		Object[] result2_black = ServiceDeliveryPointImpl
				.pattern_ServiceDeliveryPoint_1_2_collecttranslatedelements_blackBBB(trgDeliver, deliverToDeliver,
						srcDeliver);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[trgDeliver] = " + trgDeliver + ", " + "[deliverToDeliver] = " + deliverToDeliver + ", "
					+ "[srcDeliver] = " + srcDeliver + ".");
		}
		Object[] result2_green = ServiceDeliveryPointImpl
				.pattern_ServiceDeliveryPoint_1_2_collecttranslatedelements_greenFBBB(trgDeliver, deliverToDeliver,
						srcDeliver);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ServiceDeliveryPointImpl
				.pattern_ServiceDeliveryPoint_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, trgDeliver,
						deliverToDeliver, srcDeliver, assetToMeter, asset, pair, meter);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[trgDeliver] = " + trgDeliver + ", "
					+ "[deliverToDeliver] = " + deliverToDeliver + ", " + "[srcDeliver] = " + srcDeliver + ", "
					+ "[assetToMeter] = " + assetToMeter + ", " + "[asset] = " + asset + ", " + "[pair] = " + pair
					+ ", " + "[meter] = " + meter + ".");
		}
		ServiceDeliveryPointImpl.pattern_ServiceDeliveryPoint_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult,
				trgDeliver, deliverToDeliver, srcDeliver, asset, meter);
		// EMoflonEdge deliverToDeliver__srcDeliver____source = (EMoflonEdge) result3_green[6];
		// EMoflonEdge deliverToDeliver__trgDeliver____target = (EMoflonEdge) result3_green[7];
		// EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = (EMoflonEdge) result3_green[8];
		// EMoflonEdge srcDeliver__asset____EndDeviceAssets = (EMoflonEdge) result3_green[9];
		// EMoflonEdge meter__trgDeliver____ServiceDeliveryPoint = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		ServiceDeliveryPointImpl.pattern_ServiceDeliveryPoint_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult,
				trgDeliver, deliverToDeliver, srcDeliver, assetToMeter, asset, pair, meter);
		return ServiceDeliveryPointImpl.pattern_ServiceDeliveryPoint_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ServiceDeliveryPointImpl
				.pattern_ServiceDeliveryPoint_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ServiceDeliveryPointImpl
				.pattern_ServiceDeliveryPoint_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ServiceDeliveryPointImpl
				.pattern_ServiceDeliveryPoint_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver = (gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) result2_binding[0];
		MeterAsset asset = (MeterAsset) result2_binding[1];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_binding[2];
		for (Object[] result2_black : ServiceDeliveryPointImpl
				.pattern_ServiceDeliveryPoint_2_2_corematch_blackBFBBFB(srcDeliver, asset, pair, match)) {
			MeterAssetToPrivateMeterVoltage assetToMeter = (MeterAssetToPrivateMeterVoltage) result2_black[1];
			PrivateMeterVoltage meter = (PrivateMeterVoltage) result2_black[4];
			// ForEach find context
			for (Object[] result3_black : ServiceDeliveryPointImpl
					.pattern_ServiceDeliveryPoint_2_3_findcontext_blackBBBBB(srcDeliver, assetToMeter, asset, pair,
							meter)) {
				Object[] result3_green = ServiceDeliveryPointImpl
						.pattern_ServiceDeliveryPoint_2_3_findcontext_greenBBBBBFFFFFF(srcDeliver, assetToMeter, asset,
								pair, meter);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = (EMoflonEdge) result3_green[6];
				// EMoflonEdge srcDeliver__asset____EndDeviceAssets = (EMoflonEdge) result3_green[7];
				// EMoflonEdge assetToMeter__meter____target = (EMoflonEdge) result3_green[8];
				// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[9];
				// EMoflonEdge assetToMeter__asset____source = (EMoflonEdge) result3_green[10];

				// solve CSP
				Object[] result4_bindingAndBlack = ServiceDeliveryPointImpl
						.pattern_ServiceDeliveryPoint_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								srcDeliver, assetToMeter, asset, pair, meter);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[srcDeliver] = " + srcDeliver + ", " + "[assetToMeter] = " + assetToMeter + ", "
							+ "[asset] = " + asset + ", " + "[pair] = " + pair + ", " + "[meter] = " + meter + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ServiceDeliveryPointImpl.pattern_ServiceDeliveryPoint_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ServiceDeliveryPointImpl
							.pattern_ServiceDeliveryPoint_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ServiceDeliveryPointImpl.pattern_ServiceDeliveryPoint_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return ServiceDeliveryPointImpl.pattern_ServiceDeliveryPoint_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		match.registerObject("srcDeliver", srcDeliver);
		match.registerObject("asset", asset);
		match.registerObject("pair", pair);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver,
			MeterAssetToPrivateMeterVoltage assetToMeter, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			PrivateMeterVoltage meter) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("srcDeliver", srcDeliver);
		isApplicableMatch.registerObject("assetToMeter", assetToMeter);
		isApplicableMatch.registerObject("asset", asset);
		isApplicableMatch.registerObject("pair", pair);
		isApplicableMatch.registerObject("meter", meter);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject trgDeliver, EObject deliverToDeliver,
			EObject srcDeliver, EObject assetToMeter, EObject asset, EObject pair, EObject meter) {
		ruleresult.registerObject("trgDeliver", trgDeliver);
		ruleresult.registerObject("deliverToDeliver", deliverToDeliver);
		ruleresult.registerObject("srcDeliver", srcDeliver);
		ruleresult.registerObject("assetToMeter", assetToMeter);
		ruleresult.registerObject("asset", asset);
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("meter", meter);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("srcDeliver").eClass())
				.equals("gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_26(EMoflonEdge _edge_ServiceDeliveryPoint) {
		// prepare return value
		Object[] result1_bindingAndBlack = ServiceDeliveryPointImpl
				.pattern_ServiceDeliveryPoint_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ServiceDeliveryPointImpl.pattern_ServiceDeliveryPoint_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ServiceDeliveryPointImpl
				.pattern_ServiceDeliveryPoint_10_2_testcorematchandDECs_blackFFFB(_edge_ServiceDeliveryPoint)) {
			gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver = (gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) result2_black[0];
			MeterAsset asset = (MeterAsset) result2_black[1];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_black[2];
			Object[] result2_green = ServiceDeliveryPointImpl
					.pattern_ServiceDeliveryPoint_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ServiceDeliveryPointImpl
					.pattern_ServiceDeliveryPoint_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, srcDeliver, asset, pair)) {
				// Ensure that the correct types of elements are matched
				if (ServiceDeliveryPointImpl
						.pattern_ServiceDeliveryPoint_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ServiceDeliveryPointImpl
							.pattern_ServiceDeliveryPoint_10_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					ServiceDeliveryPointImpl.pattern_ServiceDeliveryPoint_10_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ServiceDeliveryPointImpl.pattern_ServiceDeliveryPoint_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ServiceDeliveryPoint");
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
	public boolean checkDEC_FWD(gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair) {// match tgg pattern
		Object[] result1_black = ServiceDeliveryPointImpl
				.pattern_ServiceDeliveryPoint_13_1_matchtggpattern_blackBBB(srcDeliver, asset, pair);
		if (result1_black != null) {
			return ServiceDeliveryPointImpl.pattern_ServiceDeliveryPoint_13_2_expressionF();
		} else {
			return ServiceDeliveryPointImpl.pattern_ServiceDeliveryPoint_13_3_expressionF();
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
		case RulesPackage.SERVICE_DELIVERY_POINT___IS_APPROPRIATE_FWD__MATCH_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR:
			return isAppropriate_FWD((Match) arguments.get(0),
					(gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) arguments.get(1),
					(MeterAsset) arguments.get(2), (MeterAssetPhysicalDevicePair) arguments.get(3));
		case RulesPackage.SERVICE_DELIVERY_POINT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SERVICE_DELIVERY_POINT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SERVICE_DELIVERY_POINT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) arguments.get(1),
					(MeterAsset) arguments.get(2), (MeterAssetPhysicalDevicePair) arguments.get(3));
			return null;
		case RulesPackage.SERVICE_DELIVERY_POINT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) arguments.get(1),
					(MeterAsset) arguments.get(2), (MeterAssetPhysicalDevicePair) arguments.get(3));
		case RulesPackage.SERVICE_DELIVERY_POINT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SERVICE_DELIVERY_POINT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SERVICEDELIVERYPOINT_METERASSETTOPRIVATEMETERVOLTAGE_METERASSET_METERASSETPHYSICALDEVICEPAIR_PRIVATEMETERVOLTAGE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) arguments.get(1),
					(MeterAssetToPrivateMeterVoltage) arguments.get(2), (MeterAsset) arguments.get(3),
					(MeterAssetPhysicalDevicePair) arguments.get(4), (PrivateMeterVoltage) arguments.get(5));
		case RulesPackage.SERVICE_DELIVERY_POINT___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SERVICE_DELIVERY_POINT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.SERVICE_DELIVERY_POINT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SERVICE_DELIVERY_POINT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_26__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_26((EMoflonEdge) arguments.get(0));
		case RulesPackage.SERVICE_DELIVERY_POINT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SERVICE_DELIVERY_POINT___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.SERVICE_DELIVERY_POINT___CHECK_DEC_FWD__SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR:
			return checkDEC_FWD((gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) arguments.get(0),
					(MeterAsset) arguments.get(1), (MeterAssetPhysicalDevicePair) arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ServiceDeliveryPoint_0_1_initialbindings_blackBBBBB(ServiceDeliveryPoint _this,
			Match match, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair) {
		return new Object[] { _this, match, srcDeliver, asset, pair };
	}

	public static final Object[] pattern_ServiceDeliveryPoint_0_2_SolveCSP_bindingFBBBBB(ServiceDeliveryPoint _this,
			Match match, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcDeliver, asset, pair);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcDeliver, asset, pair };
		}
		return null;
	}

	public static final Object[] pattern_ServiceDeliveryPoint_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ServiceDeliveryPoint_0_2_SolveCSP_bindingAndBlackFBBBBB(
			ServiceDeliveryPoint _this, Match match, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		Object[] result_pattern_ServiceDeliveryPoint_0_2_SolveCSP_binding = pattern_ServiceDeliveryPoint_0_2_SolveCSP_bindingFBBBBB(
				_this, match, srcDeliver, asset, pair);
		if (result_pattern_ServiceDeliveryPoint_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ServiceDeliveryPoint_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ServiceDeliveryPoint_0_2_SolveCSP_black = pattern_ServiceDeliveryPoint_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ServiceDeliveryPoint_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcDeliver, asset, pair };
			}
		}
		return null;
	}

	public static final boolean pattern_ServiceDeliveryPoint_0_3_CheckCSP_expressionFBB(ServiceDeliveryPoint _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ServiceDeliveryPoint_0_4_collectelementstobetranslated_blackBBBB(Match match,
			gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair) {
		return new Object[] { match, srcDeliver, asset, pair };
	}

	public static final Object[] pattern_ServiceDeliveryPoint_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver, MeterAsset asset) {
		EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(srcDeliver);
		String asset__srcDeliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String srcDeliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		asset__srcDeliver____ServiceDeliveryPoint.setSrc(asset);
		asset__srcDeliver____ServiceDeliveryPoint.setTrg(srcDeliver);
		match.getToBeTranslatedEdges().add(asset__srcDeliver____ServiceDeliveryPoint);
		srcDeliver__asset____EndDeviceAssets.setSrc(srcDeliver);
		srcDeliver__asset____EndDeviceAssets.setTrg(asset);
		match.getToBeTranslatedEdges().add(srcDeliver__asset____EndDeviceAssets);
		asset__srcDeliver____ServiceDeliveryPoint.setName(asset__srcDeliver____ServiceDeliveryPoint_name_prime);
		srcDeliver__asset____EndDeviceAssets.setName(srcDeliver__asset____EndDeviceAssets_name_prime);
		return new Object[] { match, srcDeliver, asset, asset__srcDeliver____ServiceDeliveryPoint,
				srcDeliver__asset____EndDeviceAssets };
	}

	public static final Object[] pattern_ServiceDeliveryPoint_0_5_collectcontextelements_blackBBBB(Match match,
			gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair) {
		return new Object[] { match, srcDeliver, asset, pair };
	}

	public static final Object[] pattern_ServiceDeliveryPoint_0_5_collectcontextelements_greenBBBF(Match match,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(asset);
		match.getContextNodes().add(pair);
		String pair__asset____a_name_prime = "a";
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		match.getContextEdges().add(pair__asset____a);
		pair__asset____a.setName(pair__asset____a_name_prime);
		return new Object[] { match, asset, pair, pair__asset____a };
	}

	public static final void pattern_ServiceDeliveryPoint_0_6_registerobjectstomatch_expressionBBBBB(
			ServiceDeliveryPoint _this, Match match, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		_this.registerObjectsToMatch_FWD(match, srcDeliver, asset, pair);

	}

	public static final boolean pattern_ServiceDeliveryPoint_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ServiceDeliveryPoint_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ServiceDeliveryPoint_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("srcDeliver");
		EObject _localVariable_1 = isApplicableMatch.getObject("assetToMeter");
		EObject _localVariable_2 = isApplicableMatch.getObject("asset");
		EObject _localVariable_3 = isApplicableMatch.getObject("pair");
		EObject _localVariable_4 = isApplicableMatch.getObject("meter");
		EObject tmpSrcDeliver = _localVariable_0;
		EObject tmpAssetToMeter = _localVariable_1;
		EObject tmpAsset = _localVariable_2;
		EObject tmpPair = _localVariable_3;
		EObject tmpMeter = _localVariable_4;
		if (tmpSrcDeliver instanceof gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) {
			gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver = (gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) tmpSrcDeliver;
			if (tmpAssetToMeter instanceof MeterAssetToPrivateMeterVoltage) {
				MeterAssetToPrivateMeterVoltage assetToMeter = (MeterAssetToPrivateMeterVoltage) tmpAssetToMeter;
				if (tmpAsset instanceof MeterAsset) {
					MeterAsset asset = (MeterAsset) tmpAsset;
					if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
						MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
						if (tmpMeter instanceof PrivateMeterVoltage) {
							PrivateMeterVoltage meter = (PrivateMeterVoltage) tmpMeter;
							return new Object[] { srcDeliver, assetToMeter, asset, pair, meter, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ServiceDeliveryPoint_1_1_performtransformation_blackBBBBBFBB(
			gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver,
			MeterAssetToPrivateMeterVoltage assetToMeter, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			PrivateMeterVoltage meter, ServiceDeliveryPoint _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { srcDeliver, assetToMeter, asset, pair, meter, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ServiceDeliveryPoint_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			ServiceDeliveryPoint _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ServiceDeliveryPoint_1_1_performtransformation_binding = pattern_ServiceDeliveryPoint_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_ServiceDeliveryPoint_1_1_performtransformation_binding != null) {
			gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver = (gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) result_pattern_ServiceDeliveryPoint_1_1_performtransformation_binding[0];
			MeterAssetToPrivateMeterVoltage assetToMeter = (MeterAssetToPrivateMeterVoltage) result_pattern_ServiceDeliveryPoint_1_1_performtransformation_binding[1];
			MeterAsset asset = (MeterAsset) result_pattern_ServiceDeliveryPoint_1_1_performtransformation_binding[2];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result_pattern_ServiceDeliveryPoint_1_1_performtransformation_binding[3];
			PrivateMeterVoltage meter = (PrivateMeterVoltage) result_pattern_ServiceDeliveryPoint_1_1_performtransformation_binding[4];

			Object[] result_pattern_ServiceDeliveryPoint_1_1_performtransformation_black = pattern_ServiceDeliveryPoint_1_1_performtransformation_blackBBBBBFBB(
					srcDeliver, assetToMeter, asset, pair, meter, _this, isApplicableMatch);
			if (result_pattern_ServiceDeliveryPoint_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ServiceDeliveryPoint_1_1_performtransformation_black[5];

				return new Object[] { srcDeliver, assetToMeter, asset, pair, meter, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ServiceDeliveryPoint_1_1_performtransformation_greenFFBB(
			gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver, PrivateMeterVoltage meter) {
		outagePreventionJointarget.ServiceDeliveryPoint trgDeliver = OutagePreventionJointargetFactory.eINSTANCE
				.createServiceDeliveryPoint();
		ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver = Task2Factory.eINSTANCE
				.createServiceDeliveryPointToServiceDeliveryPoint();
		meter.setServiceDeliveryPoint(trgDeliver);
		deliverToDeliver.setSource(srcDeliver);
		deliverToDeliver.setTarget(trgDeliver);
		return new Object[] { trgDeliver, deliverToDeliver, srcDeliver, meter };
	}

	public static final Object[] pattern_ServiceDeliveryPoint_1_2_collecttranslatedelements_blackBBB(
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver,
			ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver,
			gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver) {
		return new Object[] { trgDeliver, deliverToDeliver, srcDeliver };
	}

	public static final Object[] pattern_ServiceDeliveryPoint_1_2_collecttranslatedelements_greenFBBB(
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver,
			ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver,
			gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(trgDeliver);
		ruleresult.getCreatedLinkElements().add(deliverToDeliver);
		ruleresult.getTranslatedElements().add(srcDeliver);
		return new Object[] { ruleresult, trgDeliver, deliverToDeliver, srcDeliver };
	}

	public static final Object[] pattern_ServiceDeliveryPoint_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject trgDeliver, EObject deliverToDeliver, EObject srcDeliver,
			EObject assetToMeter, EObject asset, EObject pair, EObject meter) {
		if (!deliverToDeliver.equals(trgDeliver)) {
			if (!deliverToDeliver.equals(srcDeliver)) {
				if (!deliverToDeliver.equals(pair)) {
					if (!deliverToDeliver.equals(meter)) {
						if (!srcDeliver.equals(trgDeliver)) {
							if (!assetToMeter.equals(trgDeliver)) {
								if (!assetToMeter.equals(deliverToDeliver)) {
									if (!assetToMeter.equals(srcDeliver)) {
										if (!assetToMeter.equals(pair)) {
											if (!assetToMeter.equals(meter)) {
												if (!asset.equals(trgDeliver)) {
													if (!asset.equals(deliverToDeliver)) {
														if (!asset.equals(srcDeliver)) {
															if (!asset.equals(assetToMeter)) {
																if (!asset.equals(pair)) {
																	if (!asset.equals(meter)) {
																		if (!pair.equals(trgDeliver)) {
																			if (!pair.equals(srcDeliver)) {
																				if (!meter.equals(trgDeliver)) {
																					if (!meter.equals(srcDeliver)) {
																						if (!meter.equals(pair)) {
																							return new Object[] {
																									ruleresult,
																									trgDeliver,
																									deliverToDeliver,
																									srcDeliver,
																									assetToMeter, asset,
																									pair, meter };
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

	public static final Object[] pattern_ServiceDeliveryPoint_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject trgDeliver, EObject deliverToDeliver, EObject srcDeliver,
			EObject asset, EObject meter) {
		EMoflonEdge deliverToDeliver__srcDeliver____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge deliverToDeliver__trgDeliver____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge meter__trgDeliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ServiceDeliveryPoint";
		String deliverToDeliver__srcDeliver____source_name_prime = "source";
		String deliverToDeliver__trgDeliver____target_name_prime = "target";
		String asset__srcDeliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String srcDeliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		String meter__trgDeliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		deliverToDeliver__srcDeliver____source.setSrc(deliverToDeliver);
		deliverToDeliver__srcDeliver____source.setTrg(srcDeliver);
		ruleresult.getCreatedEdges().add(deliverToDeliver__srcDeliver____source);
		deliverToDeliver__trgDeliver____target.setSrc(deliverToDeliver);
		deliverToDeliver__trgDeliver____target.setTrg(trgDeliver);
		ruleresult.getCreatedEdges().add(deliverToDeliver__trgDeliver____target);
		asset__srcDeliver____ServiceDeliveryPoint.setSrc(asset);
		asset__srcDeliver____ServiceDeliveryPoint.setTrg(srcDeliver);
		ruleresult.getTranslatedEdges().add(asset__srcDeliver____ServiceDeliveryPoint);
		srcDeliver__asset____EndDeviceAssets.setSrc(srcDeliver);
		srcDeliver__asset____EndDeviceAssets.setTrg(asset);
		ruleresult.getTranslatedEdges().add(srcDeliver__asset____EndDeviceAssets);
		meter__trgDeliver____ServiceDeliveryPoint.setSrc(meter);
		meter__trgDeliver____ServiceDeliveryPoint.setTrg(trgDeliver);
		ruleresult.getCreatedEdges().add(meter__trgDeliver____ServiceDeliveryPoint);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		deliverToDeliver__srcDeliver____source.setName(deliverToDeliver__srcDeliver____source_name_prime);
		deliverToDeliver__trgDeliver____target.setName(deliverToDeliver__trgDeliver____target_name_prime);
		asset__srcDeliver____ServiceDeliveryPoint.setName(asset__srcDeliver____ServiceDeliveryPoint_name_prime);
		srcDeliver__asset____EndDeviceAssets.setName(srcDeliver__asset____EndDeviceAssets_name_prime);
		meter__trgDeliver____ServiceDeliveryPoint.setName(meter__trgDeliver____ServiceDeliveryPoint_name_prime);
		return new Object[] { ruleresult, trgDeliver, deliverToDeliver, srcDeliver, asset, meter,
				deliverToDeliver__srcDeliver____source, deliverToDeliver__trgDeliver____target,
				asset__srcDeliver____ServiceDeliveryPoint, srcDeliver__asset____EndDeviceAssets,
				meter__trgDeliver____ServiceDeliveryPoint };
	}

	public static final void pattern_ServiceDeliveryPoint_1_5_registerobjects_expressionBBBBBBBBB(
			ServiceDeliveryPoint _this, PerformRuleResult ruleresult, EObject trgDeliver, EObject deliverToDeliver,
			EObject srcDeliver, EObject assetToMeter, EObject asset, EObject pair, EObject meter) {
		_this.registerObjects_FWD(ruleresult, trgDeliver, deliverToDeliver, srcDeliver, assetToMeter, asset, pair,
				meter);

	}

	public static final PerformRuleResult pattern_ServiceDeliveryPoint_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ServiceDeliveryPoint_2_1_preparereturnvalue_bindingFB(
			ServiceDeliveryPoint _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ServiceDeliveryPoint_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ServiceDeliveryPoint _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ServiceDeliveryPoint_2_1_preparereturnvalue_bindingAndBlackFFB(
			ServiceDeliveryPoint _this) {
		Object[] result_pattern_ServiceDeliveryPoint_2_1_preparereturnvalue_binding = pattern_ServiceDeliveryPoint_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ServiceDeliveryPoint_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ServiceDeliveryPoint_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ServiceDeliveryPoint_2_1_preparereturnvalue_black = pattern_ServiceDeliveryPoint_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ServiceDeliveryPoint_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ServiceDeliveryPoint_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ServiceDeliveryPoint_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ServiceDeliveryPoint";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ServiceDeliveryPoint_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("srcDeliver");
		EObject _localVariable_1 = match.getObject("asset");
		EObject _localVariable_2 = match.getObject("pair");
		EObject tmpSrcDeliver = _localVariable_0;
		EObject tmpAsset = _localVariable_1;
		EObject tmpPair = _localVariable_2;
		if (tmpSrcDeliver instanceof gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) {
			gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver = (gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) tmpSrcDeliver;
			if (tmpAsset instanceof MeterAsset) {
				MeterAsset asset = (MeterAsset) tmpAsset;
				if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
					MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
					return new Object[] { srcDeliver, asset, pair, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ServiceDeliveryPoint_2_2_corematch_blackBFBBFB(
			gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MeterAssetToPrivateMeterVoltage assetToMeter : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(asset, MeterAssetToPrivateMeterVoltage.class, "source")) {
			PrivateMeterVoltage meter = assetToMeter.getTarget();
			if (meter != null) {
				_result.add(new Object[] { srcDeliver, assetToMeter, asset, pair, meter, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ServiceDeliveryPoint_2_3_findcontext_blackBBBBB(
			gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver,
			MeterAssetToPrivateMeterVoltage assetToMeter, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			PrivateMeterVoltage meter) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (srcDeliver.equals(asset.getServiceDeliveryPoint())) {
			if (meter.equals(assetToMeter.getTarget())) {
				if (asset.equals(pair.getA())) {
					if (asset.equals(assetToMeter.getSource())) {
						_result.add(new Object[] { srcDeliver, assetToMeter, asset, pair, meter });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ServiceDeliveryPoint_2_3_findcontext_greenBBBBBFFFFFF(
			gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver,
			MeterAssetToPrivateMeterVoltage assetToMeter, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			PrivateMeterVoltage meter) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge assetToMeter__meter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge assetToMeter__asset____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String asset__srcDeliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String srcDeliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		String assetToMeter__meter____target_name_prime = "target";
		String pair__asset____a_name_prime = "a";
		String assetToMeter__asset____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(srcDeliver);
		isApplicableMatch.getAllContextElements().add(assetToMeter);
		isApplicableMatch.getAllContextElements().add(asset);
		isApplicableMatch.getAllContextElements().add(pair);
		isApplicableMatch.getAllContextElements().add(meter);
		asset__srcDeliver____ServiceDeliveryPoint.setSrc(asset);
		asset__srcDeliver____ServiceDeliveryPoint.setTrg(srcDeliver);
		isApplicableMatch.getAllContextElements().add(asset__srcDeliver____ServiceDeliveryPoint);
		srcDeliver__asset____EndDeviceAssets.setSrc(srcDeliver);
		srcDeliver__asset____EndDeviceAssets.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(srcDeliver__asset____EndDeviceAssets);
		assetToMeter__meter____target.setSrc(assetToMeter);
		assetToMeter__meter____target.setTrg(meter);
		isApplicableMatch.getAllContextElements().add(assetToMeter__meter____target);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(pair__asset____a);
		assetToMeter__asset____source.setSrc(assetToMeter);
		assetToMeter__asset____source.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(assetToMeter__asset____source);
		asset__srcDeliver____ServiceDeliveryPoint.setName(asset__srcDeliver____ServiceDeliveryPoint_name_prime);
		srcDeliver__asset____EndDeviceAssets.setName(srcDeliver__asset____EndDeviceAssets_name_prime);
		assetToMeter__meter____target.setName(assetToMeter__meter____target_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		assetToMeter__asset____source.setName(assetToMeter__asset____source_name_prime);
		return new Object[] { srcDeliver, assetToMeter, asset, pair, meter, isApplicableMatch,
				asset__srcDeliver____ServiceDeliveryPoint, srcDeliver__asset____EndDeviceAssets,
				assetToMeter__meter____target, pair__asset____a, assetToMeter__asset____source };
	}

	public static final Object[] pattern_ServiceDeliveryPoint_2_4_solveCSP_bindingFBBBBBBB(ServiceDeliveryPoint _this,
			IsApplicableMatch isApplicableMatch, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver,
			MeterAssetToPrivateMeterVoltage assetToMeter, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			PrivateMeterVoltage meter) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, srcDeliver, assetToMeter, asset, pair,
				meter);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, srcDeliver, assetToMeter, asset, pair, meter };
		}
		return null;
	}

	public static final Object[] pattern_ServiceDeliveryPoint_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ServiceDeliveryPoint_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			ServiceDeliveryPoint _this, IsApplicableMatch isApplicableMatch,
			gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver,
			MeterAssetToPrivateMeterVoltage assetToMeter, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			PrivateMeterVoltage meter) {
		Object[] result_pattern_ServiceDeliveryPoint_2_4_solveCSP_binding = pattern_ServiceDeliveryPoint_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, srcDeliver, assetToMeter, asset, pair, meter);
		if (result_pattern_ServiceDeliveryPoint_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ServiceDeliveryPoint_2_4_solveCSP_binding[0];

			Object[] result_pattern_ServiceDeliveryPoint_2_4_solveCSP_black = pattern_ServiceDeliveryPoint_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ServiceDeliveryPoint_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, srcDeliver, assetToMeter, asset, pair, meter };
			}
		}
		return null;
	}

	public static final boolean pattern_ServiceDeliveryPoint_2_5_checkCSP_expressionFBB(ServiceDeliveryPoint _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ServiceDeliveryPoint_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ServiceDeliveryPoint_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ServiceDeliveryPoint";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ServiceDeliveryPoint_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ServiceDeliveryPoint_10_1_preparereturnvalue_bindingFB(
			ServiceDeliveryPoint _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ServiceDeliveryPoint_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ServiceDeliveryPoint _this) {
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

	public static final Object[] pattern_ServiceDeliveryPoint_10_1_preparereturnvalue_bindingAndBlackFFBF(
			ServiceDeliveryPoint _this) {
		Object[] result_pattern_ServiceDeliveryPoint_10_1_preparereturnvalue_binding = pattern_ServiceDeliveryPoint_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ServiceDeliveryPoint_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ServiceDeliveryPoint_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ServiceDeliveryPoint_10_1_preparereturnvalue_black = pattern_ServiceDeliveryPoint_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ServiceDeliveryPoint_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ServiceDeliveryPoint_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ServiceDeliveryPoint_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ServiceDeliveryPoint_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ServiceDeliveryPoint_10_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_ServiceDeliveryPoint) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpAsset = _edge_ServiceDeliveryPoint.getSrc();
		if (tmpAsset instanceof MeterAsset) {
			MeterAsset asset = (MeterAsset) tmpAsset;
			EObject tmpSrcDeliver = _edge_ServiceDeliveryPoint.getTrg();
			if (tmpSrcDeliver instanceof gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) {
				gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver = (gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) tmpSrcDeliver;
				if (srcDeliver.equals(asset.getServiceDeliveryPoint())) {
					for (MeterAssetPhysicalDevicePair pair : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(asset, MeterAssetPhysicalDevicePair.class, "a")) {
						_result.add(new Object[] { srcDeliver, asset, pair, _edge_ServiceDeliveryPoint });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ServiceDeliveryPoint_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ServiceDeliveryPoint_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			ServiceDeliveryPoint _this, Match match, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcDeliver, asset, pair);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ServiceDeliveryPoint_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ServiceDeliveryPoint _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ServiceDeliveryPoint_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ServiceDeliveryPoint_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ServiceDeliveryPoint_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ServiceDeliveryPoint_13_1_matchtggpattern_blackBBB(
			gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint srcDeliver, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair) {
		if (srcDeliver.equals(asset.getServiceDeliveryPoint())) {
			if (asset.equals(pair.getA())) {
				return new Object[] { srcDeliver, asset, pair };
			}
		}
		return null;
	}

	public static final boolean pattern_ServiceDeliveryPoint_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ServiceDeliveryPoint_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ServiceDeliveryPointImpl
