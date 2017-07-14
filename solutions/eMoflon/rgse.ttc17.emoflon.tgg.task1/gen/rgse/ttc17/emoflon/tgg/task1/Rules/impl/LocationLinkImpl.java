/**
 */
package rgse.ttc17.emoflon.tgg.task1.Rules.impl;

import gluemodel.CIM.IEC61968.Common.Location;

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

import outageDetectionJointarget.EnergyConsumer;

import rgse.ttc17.emoflon.tgg.task1.LocationToLocation;
import rgse.ttc17.emoflon.tgg.task1.MeterAssetToEnergyConsumer;

import rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink;
import rgse.ttc17.emoflon.tgg.task1.Rules.RulesPackage;
// <-- [user defined imports]
import org.moflon.tgg.csp.*;
import rgse.ttc17.emoflon.tgg.task1.csp.constraints.*;
import org.moflon.tgg.csp.constraints.*;
import org.moflon.tgg.language.csp.*;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LocationLinkImpl extends AbstractRuleImpl implements LocationLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getLocationLink();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MeterAsset asset, Location location,
			MeterAssetPhysicalDevicePair pair) {
		// initial bindings
		Object[] result1_black = LocationLinkImpl.pattern_LocationLink_0_1_initialbindings_blackBBBBB(this, match,
				asset, location, pair);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[asset] = " + asset + ", "
					+ "[location] = " + location + ", " + "[pair] = " + pair + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = LocationLinkImpl
				.pattern_LocationLink_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, asset, location, pair);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[asset] = " + asset + ", " + "[location] = "
					+ location + ", " + "[pair] = " + pair + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (LocationLinkImpl.pattern_LocationLink_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = LocationLinkImpl
					.pattern_LocationLink_0_4_collectelementstobetranslated_blackBBBB(match, asset, location, pair);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[asset] = " + asset + ", " + "[location] = "
						+ location + ", " + "[pair] = " + pair + ".");
			}
			LocationLinkImpl.pattern_LocationLink_0_4_collectelementstobetranslated_greenBBBFF(match, asset, location);
			// EMoflonEdge asset__location____Location = (EMoflonEdge) result4_green[3];
			// EMoflonEdge location__asset____Assets = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = LocationLinkImpl.pattern_LocationLink_0_5_collectcontextelements_blackBBBB(match,
					asset, location, pair);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[asset] = " + asset + ", " + "[location] = "
						+ location + ", " + "[pair] = " + pair + ".");
			}
			LocationLinkImpl.pattern_LocationLink_0_5_collectcontextelements_greenBBBBF(match, asset, location, pair);
			// EMoflonEdge pair__asset____a = (EMoflonEdge) result5_green[4];

			// register objects to match
			LocationLinkImpl.pattern_LocationLink_0_6_registerobjectstomatch_expressionBBBBB(this, match, asset,
					location, pair);
			return LocationLinkImpl.pattern_LocationLink_0_7_expressionF();
		} else {
			return LocationLinkImpl.pattern_LocationLink_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = LocationLinkImpl
				.pattern_LocationLink_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		EnergyConsumer consumer = (EnergyConsumer) result1_bindingAndBlack[0];
		MeterAsset asset = (MeterAsset) result1_bindingAndBlack[1];
		Location location = (Location) result1_bindingAndBlack[2];
		MeterAssetToEnergyConsumer assetToConumer = (MeterAssetToEnergyConsumer) result1_bindingAndBlack[3];
		outageDetectionJointarget.Location trgLocation = (outageDetectionJointarget.Location) result1_bindingAndBlack[4];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result1_bindingAndBlack[5];
		LocationToLocation locationCorr = (LocationToLocation) result1_bindingAndBlack[6];
		// CSP csp = (CSP) result1_bindingAndBlack[7];
		LocationLinkImpl.pattern_LocationLink_1_1_performtransformation_greenBB(consumer, trgLocation);

		// collect translated elements
		Object[] result2_green = LocationLinkImpl.pattern_LocationLink_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = LocationLinkImpl.pattern_LocationLink_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult,
				consumer, asset, location, assetToConumer, trgLocation, pair, locationCorr);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[consumer] = " + consumer + ", " + "[asset] = " + asset
					+ ", " + "[location] = " + location + ", " + "[assetToConumer] = " + assetToConumer + ", "
					+ "[trgLocation] = " + trgLocation + ", " + "[pair] = " + pair + ", " + "[locationCorr] = "
					+ locationCorr + ".");
		}
		LocationLinkImpl.pattern_LocationLink_1_3_bookkeepingforedges_greenBBBBBFFF(ruleresult, consumer, asset,
				location, trgLocation);
		// EMoflonEdge consumer__trgLocation____Location = (EMoflonEdge) result3_green[5];
		// EMoflonEdge asset__location____Location = (EMoflonEdge) result3_green[6];
		// EMoflonEdge location__asset____Assets = (EMoflonEdge) result3_green[7];

		// perform postprocessing story node is empty
		// register objects
		LocationLinkImpl.pattern_LocationLink_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult, consumer, asset,
				location, assetToConumer, trgLocation, pair, locationCorr);
		return LocationLinkImpl.pattern_LocationLink_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = LocationLinkImpl
				.pattern_LocationLink_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LocationLinkImpl.pattern_LocationLink_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = LocationLinkImpl.pattern_LocationLink_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MeterAsset asset = (MeterAsset) result2_binding[0];
		Location location = (Location) result2_binding[1];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_binding[2];
		for (Object[] result2_black : LocationLinkImpl.pattern_LocationLink_2_2_corematch_blackFBBFFBFB(asset, location,
				pair, match)) {
			EnergyConsumer consumer = (EnergyConsumer) result2_black[0];
			MeterAssetToEnergyConsumer assetToConumer = (MeterAssetToEnergyConsumer) result2_black[3];
			outageDetectionJointarget.Location trgLocation = (outageDetectionJointarget.Location) result2_black[4];
			LocationToLocation locationCorr = (LocationToLocation) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : LocationLinkImpl.pattern_LocationLink_2_3_findcontext_blackBBBBBBB(consumer,
					asset, location, assetToConumer, trgLocation, pair, locationCorr)) {
				Object[] result3_green = LocationLinkImpl.pattern_LocationLink_2_3_findcontext_greenBBBBBBBFFFFFFFF(
						consumer, asset, location, assetToConumer, trgLocation, pair, locationCorr);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge assetToConumer__asset____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge assetToConumer__consumer____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge asset__location____Location = (EMoflonEdge) result3_green[10];
				// EMoflonEdge location__asset____Assets = (EMoflonEdge) result3_green[11];
				// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[12];
				// EMoflonEdge locationCorr__location____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge locationCorr__trgLocation____target = (EMoflonEdge) result3_green[14];

				// solve CSP
				Object[] result4_bindingAndBlack = LocationLinkImpl
						.pattern_LocationLink_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, consumer,
								asset, location, assetToConumer, trgLocation, pair, locationCorr);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = " + this + ", "
									+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[consumer] = " + consumer
									+ ", " + "[asset] = " + asset + ", " + "[location] = " + location + ", "
									+ "[assetToConumer] = " + assetToConumer + ", " + "[trgLocation] = " + trgLocation
									+ ", " + "[pair] = " + pair + ", " + "[locationCorr] = " + locationCorr + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (LocationLinkImpl.pattern_LocationLink_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = LocationLinkImpl
							.pattern_LocationLink_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					LocationLinkImpl.pattern_LocationLink_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return LocationLinkImpl.pattern_LocationLink_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MeterAsset asset, Location location,
			MeterAssetPhysicalDevicePair pair) {
		match.registerObject("asset", asset);
		match.registerObject("location", location);
		match.registerObject("pair", pair);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MeterAsset asset, Location location,
			MeterAssetPhysicalDevicePair pair) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, EnergyConsumer consumer, MeterAsset asset,
			Location location, MeterAssetToEnergyConsumer assetToConumer,
			outageDetectionJointarget.Location trgLocation, MeterAssetPhysicalDevicePair pair,
			LocationToLocation locationCorr) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("consumer", consumer);
		isApplicableMatch.registerObject("asset", asset);
		isApplicableMatch.registerObject("location", location);
		isApplicableMatch.registerObject("assetToConumer", assetToConumer);
		isApplicableMatch.registerObject("trgLocation", trgLocation);
		isApplicableMatch.registerObject("pair", pair);
		isApplicableMatch.registerObject("locationCorr", locationCorr);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject consumer, EObject asset, EObject location,
			EObject assetToConumer, EObject trgLocation, EObject pair, EObject locationCorr) {
		ruleresult.registerObject("consumer", consumer);
		ruleresult.registerObject("asset", asset);
		ruleresult.registerObject("location", location);
		ruleresult.registerObject("assetToConumer", assetToConumer);
		ruleresult.registerObject("trgLocation", trgLocation);
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("locationCorr", locationCorr);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_23(EMoflonEdge _edge_Location) {
		// prepare return value
		Object[] result1_bindingAndBlack = LocationLinkImpl
				.pattern_LocationLink_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = LocationLinkImpl.pattern_LocationLink_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LocationLinkImpl
				.pattern_LocationLink_10_2_testcorematchandDECs_blackFFFB(_edge_Location)) {
			MeterAsset asset = (MeterAsset) result2_black[0];
			Location location = (Location) result2_black[1];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_black[2];
			Object[] result2_green = LocationLinkImpl.pattern_LocationLink_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LocationLinkImpl.pattern_LocationLink_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
					this, match, asset, location, pair)) {
				// Ensure that the correct types of elements are matched
				if (LocationLinkImpl
						.pattern_LocationLink_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = LocationLinkImpl.pattern_LocationLink_10_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					LocationLinkImpl.pattern_LocationLink_10_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return LocationLinkImpl.pattern_LocationLink_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("LocationLink");
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
	public boolean checkDEC_FWD(MeterAsset asset, Location location, MeterAssetPhysicalDevicePair pair) {// match tgg pattern
		Object[] result1_black = LocationLinkImpl.pattern_LocationLink_13_1_matchtggpattern_blackBBB(asset, location,
				pair);
		if (result1_black != null) {
			return LocationLinkImpl.pattern_LocationLink_13_2_expressionF();
		} else {
			return LocationLinkImpl.pattern_LocationLink_13_3_expressionF();
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
		case RulesPackage.LOCATION_LINK___IS_APPROPRIATE_FWD__MATCH_METERASSET_LOCATION_METERASSETPHYSICALDEVICEPAIR:
			return isAppropriate_FWD((Match) arguments.get(0), (MeterAsset) arguments.get(1),
					(Location) arguments.get(2), (MeterAssetPhysicalDevicePair) arguments.get(3));
		case RulesPackage.LOCATION_LINK___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LOCATION_LINK___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.LOCATION_LINK___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSET_LOCATION_METERASSETPHYSICALDEVICEPAIR:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MeterAsset) arguments.get(1),
					(Location) arguments.get(2), (MeterAssetPhysicalDevicePair) arguments.get(3));
			return null;
		case RulesPackage.LOCATION_LINK___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSET_LOCATION_METERASSETPHYSICALDEVICEPAIR:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MeterAsset) arguments.get(1),
					(Location) arguments.get(2), (MeterAssetPhysicalDevicePair) arguments.get(3));
		case RulesPackage.LOCATION_LINK___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LOCATION_LINK___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ENERGYCONSUMER_METERASSET_LOCATION_METERASSETTOENERGYCONSUMER_LOCATION_METERASSETPHYSICALDEVICEPAIR_LOCATIONTOLOCATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (EnergyConsumer) arguments.get(1),
					(MeterAsset) arguments.get(2), (Location) arguments.get(3),
					(MeterAssetToEnergyConsumer) arguments.get(4),
					(outageDetectionJointarget.Location) arguments.get(5),
					(MeterAssetPhysicalDevicePair) arguments.get(6), (LocationToLocation) arguments.get(7));
		case RulesPackage.LOCATION_LINK___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LOCATION_LINK___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.LOCATION_LINK___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.LOCATION_LINK___IS_APPROPRIATE_FWD_EMOFLON_EDGE_23__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_23((EMoflonEdge) arguments.get(0));
		case RulesPackage.LOCATION_LINK___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.LOCATION_LINK___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.LOCATION_LINK___CHECK_DEC_FWD__METERASSET_LOCATION_METERASSETPHYSICALDEVICEPAIR:
			return checkDEC_FWD((MeterAsset) arguments.get(0), (Location) arguments.get(1),
					(MeterAssetPhysicalDevicePair) arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_LocationLink_0_1_initialbindings_blackBBBBB(LocationLink _this, Match match,
			MeterAsset asset, Location location, MeterAssetPhysicalDevicePair pair) {
		return new Object[] { _this, match, asset, location, pair };
	}

	public static final Object[] pattern_LocationLink_0_2_SolveCSP_bindingFBBBBB(LocationLink _this, Match match,
			MeterAsset asset, Location location, MeterAssetPhysicalDevicePair pair) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, asset, location, pair);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, asset, location, pair };
		}
		return null;
	}

	public static final Object[] pattern_LocationLink_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LocationLink_0_2_SolveCSP_bindingAndBlackFBBBBB(LocationLink _this,
			Match match, MeterAsset asset, Location location, MeterAssetPhysicalDevicePair pair) {
		Object[] result_pattern_LocationLink_0_2_SolveCSP_binding = pattern_LocationLink_0_2_SolveCSP_bindingFBBBBB(
				_this, match, asset, location, pair);
		if (result_pattern_LocationLink_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LocationLink_0_2_SolveCSP_binding[0];

			Object[] result_pattern_LocationLink_0_2_SolveCSP_black = pattern_LocationLink_0_2_SolveCSP_blackB(csp);
			if (result_pattern_LocationLink_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, asset, location, pair };
			}
		}
		return null;
	}

	public static final boolean pattern_LocationLink_0_3_CheckCSP_expressionFBB(LocationLink _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LocationLink_0_4_collectelementstobetranslated_blackBBBB(Match match,
			MeterAsset asset, Location location, MeterAssetPhysicalDevicePair pair) {
		return new Object[] { match, asset, location, pair };
	}

	public static final Object[] pattern_LocationLink_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			MeterAsset asset, Location location) {
		EMoflonEdge asset__location____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge location__asset____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String asset__location____Location_name_prime = "Location";
		String location__asset____Assets_name_prime = "Assets";
		asset__location____Location.setSrc(asset);
		asset__location____Location.setTrg(location);
		match.getToBeTranslatedEdges().add(asset__location____Location);
		location__asset____Assets.setSrc(location);
		location__asset____Assets.setTrg(asset);
		match.getToBeTranslatedEdges().add(location__asset____Assets);
		asset__location____Location.setName(asset__location____Location_name_prime);
		location__asset____Assets.setName(location__asset____Assets_name_prime);
		return new Object[] { match, asset, location, asset__location____Location, location__asset____Assets };
	}

	public static final Object[] pattern_LocationLink_0_5_collectcontextelements_blackBBBB(Match match,
			MeterAsset asset, Location location, MeterAssetPhysicalDevicePair pair) {
		return new Object[] { match, asset, location, pair };
	}

	public static final Object[] pattern_LocationLink_0_5_collectcontextelements_greenBBBBF(Match match,
			MeterAsset asset, Location location, MeterAssetPhysicalDevicePair pair) {
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(asset);
		match.getContextNodes().add(location);
		match.getContextNodes().add(pair);
		String pair__asset____a_name_prime = "a";
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		match.getContextEdges().add(pair__asset____a);
		pair__asset____a.setName(pair__asset____a_name_prime);
		return new Object[] { match, asset, location, pair, pair__asset____a };
	}

	public static final void pattern_LocationLink_0_6_registerobjectstomatch_expressionBBBBB(LocationLink _this,
			Match match, MeterAsset asset, Location location, MeterAssetPhysicalDevicePair pair) {
		_this.registerObjectsToMatch_FWD(match, asset, location, pair);

	}

	public static final boolean pattern_LocationLink_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LocationLink_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LocationLink_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("consumer");
		EObject _localVariable_1 = isApplicableMatch.getObject("asset");
		EObject _localVariable_2 = isApplicableMatch.getObject("location");
		EObject _localVariable_3 = isApplicableMatch.getObject("assetToConumer");
		EObject _localVariable_4 = isApplicableMatch.getObject("trgLocation");
		EObject _localVariable_5 = isApplicableMatch.getObject("pair");
		EObject _localVariable_6 = isApplicableMatch.getObject("locationCorr");
		EObject tmpConsumer = _localVariable_0;
		EObject tmpAsset = _localVariable_1;
		EObject tmpLocation = _localVariable_2;
		EObject tmpAssetToConumer = _localVariable_3;
		EObject tmpTrgLocation = _localVariable_4;
		EObject tmpPair = _localVariable_5;
		EObject tmpLocationCorr = _localVariable_6;
		if (tmpConsumer instanceof EnergyConsumer) {
			EnergyConsumer consumer = (EnergyConsumer) tmpConsumer;
			if (tmpAsset instanceof MeterAsset) {
				MeterAsset asset = (MeterAsset) tmpAsset;
				if (tmpLocation instanceof Location) {
					Location location = (Location) tmpLocation;
					if (tmpAssetToConumer instanceof MeterAssetToEnergyConsumer) {
						MeterAssetToEnergyConsumer assetToConumer = (MeterAssetToEnergyConsumer) tmpAssetToConumer;
						if (tmpTrgLocation instanceof outageDetectionJointarget.Location) {
							outageDetectionJointarget.Location trgLocation = (outageDetectionJointarget.Location) tmpTrgLocation;
							if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
								MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
								if (tmpLocationCorr instanceof LocationToLocation) {
									LocationToLocation locationCorr = (LocationToLocation) tmpLocationCorr;
									return new Object[] { consumer, asset, location, assetToConumer, trgLocation, pair,
											locationCorr, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LocationLink_1_1_performtransformation_blackBBBBBBBFBB(EnergyConsumer consumer,
			MeterAsset asset, Location location, MeterAssetToEnergyConsumer assetToConumer,
			outageDetectionJointarget.Location trgLocation, MeterAssetPhysicalDevicePair pair,
			LocationToLocation locationCorr, LocationLink _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { consumer, asset, location, assetToConumer, trgLocation, pair, locationCorr, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LocationLink_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			LocationLink _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LocationLink_1_1_performtransformation_binding = pattern_LocationLink_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LocationLink_1_1_performtransformation_binding != null) {
			EnergyConsumer consumer = (EnergyConsumer) result_pattern_LocationLink_1_1_performtransformation_binding[0];
			MeterAsset asset = (MeterAsset) result_pattern_LocationLink_1_1_performtransformation_binding[1];
			Location location = (Location) result_pattern_LocationLink_1_1_performtransformation_binding[2];
			MeterAssetToEnergyConsumer assetToConumer = (MeterAssetToEnergyConsumer) result_pattern_LocationLink_1_1_performtransformation_binding[3];
			outageDetectionJointarget.Location trgLocation = (outageDetectionJointarget.Location) result_pattern_LocationLink_1_1_performtransformation_binding[4];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result_pattern_LocationLink_1_1_performtransformation_binding[5];
			LocationToLocation locationCorr = (LocationToLocation) result_pattern_LocationLink_1_1_performtransformation_binding[6];

			Object[] result_pattern_LocationLink_1_1_performtransformation_black = pattern_LocationLink_1_1_performtransformation_blackBBBBBBBFBB(
					consumer, asset, location, assetToConumer, trgLocation, pair, locationCorr, _this,
					isApplicableMatch);
			if (result_pattern_LocationLink_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_LocationLink_1_1_performtransformation_black[7];

				return new Object[] { consumer, asset, location, assetToConumer, trgLocation, pair, locationCorr, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LocationLink_1_1_performtransformation_greenBB(EnergyConsumer consumer,
			outageDetectionJointarget.Location trgLocation) {
		consumer.setLocation(trgLocation);
		return new Object[] { consumer, trgLocation };
	}

	public static final Object[] pattern_LocationLink_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_LocationLink_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject consumer, EObject asset, EObject location, EObject assetToConumer,
			EObject trgLocation, EObject pair, EObject locationCorr) {
		if (!consumer.equals(location)) {
			if (!consumer.equals(trgLocation)) {
				if (!consumer.equals(pair)) {
					if (!consumer.equals(locationCorr)) {
						if (!asset.equals(consumer)) {
							if (!asset.equals(location)) {
								if (!asset.equals(assetToConumer)) {
									if (!asset.equals(trgLocation)) {
										if (!asset.equals(pair)) {
											if (!asset.equals(locationCorr)) {
												if (!location.equals(trgLocation)) {
													if (!location.equals(pair)) {
														if (!location.equals(locationCorr)) {
															if (!assetToConumer.equals(consumer)) {
																if (!assetToConumer.equals(location)) {
																	if (!assetToConumer.equals(trgLocation)) {
																		if (!assetToConumer.equals(pair)) {
																			if (!assetToConumer.equals(locationCorr)) {
																				if (!pair.equals(trgLocation)) {
																					if (!locationCorr
																							.equals(trgLocation)) {
																						if (!locationCorr
																								.equals(pair)) {
																							return new Object[] {
																									ruleresult,
																									consumer, asset,
																									location,
																									assetToConumer,
																									trgLocation, pair,
																									locationCorr };
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

	public static final Object[] pattern_LocationLink_1_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject consumer, EObject asset, EObject location, EObject trgLocation) {
		EMoflonEdge consumer__trgLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__location____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge location__asset____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LocationLink";
		String consumer__trgLocation____Location_name_prime = "Location";
		String asset__location____Location_name_prime = "Location";
		String location__asset____Assets_name_prime = "Assets";
		consumer__trgLocation____Location.setSrc(consumer);
		consumer__trgLocation____Location.setTrg(trgLocation);
		ruleresult.getCreatedEdges().add(consumer__trgLocation____Location);
		asset__location____Location.setSrc(asset);
		asset__location____Location.setTrg(location);
		ruleresult.getTranslatedEdges().add(asset__location____Location);
		location__asset____Assets.setSrc(location);
		location__asset____Assets.setTrg(asset);
		ruleresult.getTranslatedEdges().add(location__asset____Assets);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		consumer__trgLocation____Location.setName(consumer__trgLocation____Location_name_prime);
		asset__location____Location.setName(asset__location____Location_name_prime);
		location__asset____Assets.setName(location__asset____Assets_name_prime);
		return new Object[] { ruleresult, consumer, asset, location, trgLocation, consumer__trgLocation____Location,
				asset__location____Location, location__asset____Assets };
	}

	public static final void pattern_LocationLink_1_5_registerobjects_expressionBBBBBBBBB(LocationLink _this,
			PerformRuleResult ruleresult, EObject consumer, EObject asset, EObject location, EObject assetToConumer,
			EObject trgLocation, EObject pair, EObject locationCorr) {
		_this.registerObjects_FWD(ruleresult, consumer, asset, location, assetToConumer, trgLocation, pair,
				locationCorr);

	}

	public static final PerformRuleResult pattern_LocationLink_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LocationLink_2_1_preparereturnvalue_bindingFB(LocationLink _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LocationLink_2_1_preparereturnvalue_blackFBB(EClass eClass,
			LocationLink _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LocationLink_2_1_preparereturnvalue_bindingAndBlackFFB(LocationLink _this) {
		Object[] result_pattern_LocationLink_2_1_preparereturnvalue_binding = pattern_LocationLink_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LocationLink_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_LocationLink_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LocationLink_2_1_preparereturnvalue_black = pattern_LocationLink_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_LocationLink_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LocationLink_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LocationLink_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "LocationLink";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LocationLink_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("asset");
		EObject _localVariable_1 = match.getObject("location");
		EObject _localVariable_2 = match.getObject("pair");
		EObject tmpAsset = _localVariable_0;
		EObject tmpLocation = _localVariable_1;
		EObject tmpPair = _localVariable_2;
		if (tmpAsset instanceof MeterAsset) {
			MeterAsset asset = (MeterAsset) tmpAsset;
			if (tmpLocation instanceof Location) {
				Location location = (Location) tmpLocation;
				if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
					MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
					return new Object[] { asset, location, pair, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LocationLink_2_2_corematch_blackFBBFFBFB(MeterAsset asset,
			Location location, MeterAssetPhysicalDevicePair pair, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MeterAssetToEnergyConsumer assetToConumer : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(asset, MeterAssetToEnergyConsumer.class, "source")) {
			EnergyConsumer consumer = assetToConumer.getTarget();
			if (consumer != null) {
				for (LocationToLocation locationCorr : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(location, LocationToLocation.class, "source")) {
					outageDetectionJointarget.Location trgLocation = locationCorr.getTarget();
					if (trgLocation != null) {
						_result.add(new Object[] { consumer, asset, location, assetToConumer, trgLocation, pair,
								locationCorr, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_LocationLink_2_3_findcontext_blackBBBBBBB(EnergyConsumer consumer,
			MeterAsset asset, Location location, MeterAssetToEnergyConsumer assetToConumer,
			outageDetectionJointarget.Location trgLocation, MeterAssetPhysicalDevicePair pair,
			LocationToLocation locationCorr) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (asset.equals(assetToConumer.getSource())) {
			if (consumer.equals(assetToConumer.getTarget())) {
				if (location.equals(asset.getLocation())) {
					if (asset.equals(pair.getA())) {
						if (location.equals(locationCorr.getSource())) {
							if (trgLocation.equals(locationCorr.getTarget())) {
								_result.add(new Object[] { consumer, asset, location, assetToConumer, trgLocation, pair,
										locationCorr });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_LocationLink_2_3_findcontext_greenBBBBBBBFFFFFFFF(EnergyConsumer consumer,
			MeterAsset asset, Location location, MeterAssetToEnergyConsumer assetToConumer,
			outageDetectionJointarget.Location trgLocation, MeterAssetPhysicalDevicePair pair,
			LocationToLocation locationCorr) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge assetToConumer__asset____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge assetToConumer__consumer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__location____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge location__asset____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge locationCorr__location____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge locationCorr__trgLocation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String assetToConumer__asset____source_name_prime = "source";
		String assetToConumer__consumer____target_name_prime = "target";
		String asset__location____Location_name_prime = "Location";
		String location__asset____Assets_name_prime = "Assets";
		String pair__asset____a_name_prime = "a";
		String locationCorr__location____source_name_prime = "source";
		String locationCorr__trgLocation____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(consumer);
		isApplicableMatch.getAllContextElements().add(asset);
		isApplicableMatch.getAllContextElements().add(location);
		isApplicableMatch.getAllContextElements().add(assetToConumer);
		isApplicableMatch.getAllContextElements().add(trgLocation);
		isApplicableMatch.getAllContextElements().add(pair);
		isApplicableMatch.getAllContextElements().add(locationCorr);
		assetToConumer__asset____source.setSrc(assetToConumer);
		assetToConumer__asset____source.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(assetToConumer__asset____source);
		assetToConumer__consumer____target.setSrc(assetToConumer);
		assetToConumer__consumer____target.setTrg(consumer);
		isApplicableMatch.getAllContextElements().add(assetToConumer__consumer____target);
		asset__location____Location.setSrc(asset);
		asset__location____Location.setTrg(location);
		isApplicableMatch.getAllContextElements().add(asset__location____Location);
		location__asset____Assets.setSrc(location);
		location__asset____Assets.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(location__asset____Assets);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(pair__asset____a);
		locationCorr__location____source.setSrc(locationCorr);
		locationCorr__location____source.setTrg(location);
		isApplicableMatch.getAllContextElements().add(locationCorr__location____source);
		locationCorr__trgLocation____target.setSrc(locationCorr);
		locationCorr__trgLocation____target.setTrg(trgLocation);
		isApplicableMatch.getAllContextElements().add(locationCorr__trgLocation____target);
		assetToConumer__asset____source.setName(assetToConumer__asset____source_name_prime);
		assetToConumer__consumer____target.setName(assetToConumer__consumer____target_name_prime);
		asset__location____Location.setName(asset__location____Location_name_prime);
		location__asset____Assets.setName(location__asset____Assets_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		locationCorr__location____source.setName(locationCorr__location____source_name_prime);
		locationCorr__trgLocation____target.setName(locationCorr__trgLocation____target_name_prime);
		return new Object[] { consumer, asset, location, assetToConumer, trgLocation, pair, locationCorr,
				isApplicableMatch, assetToConumer__asset____source, assetToConumer__consumer____target,
				asset__location____Location, location__asset____Assets, pair__asset____a,
				locationCorr__location____source, locationCorr__trgLocation____target };
	}

	public static final Object[] pattern_LocationLink_2_4_solveCSP_bindingFBBBBBBBBB(LocationLink _this,
			IsApplicableMatch isApplicableMatch, EnergyConsumer consumer, MeterAsset asset, Location location,
			MeterAssetToEnergyConsumer assetToConumer, outageDetectionJointarget.Location trgLocation,
			MeterAssetPhysicalDevicePair pair, LocationToLocation locationCorr) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, consumer, asset, location,
				assetToConumer, trgLocation, pair, locationCorr);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, consumer, asset, location, assetToConumer, trgLocation,
					pair, locationCorr };
		}
		return null;
	}

	public static final Object[] pattern_LocationLink_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LocationLink_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(LocationLink _this,
			IsApplicableMatch isApplicableMatch, EnergyConsumer consumer, MeterAsset asset, Location location,
			MeterAssetToEnergyConsumer assetToConumer, outageDetectionJointarget.Location trgLocation,
			MeterAssetPhysicalDevicePair pair, LocationToLocation locationCorr) {
		Object[] result_pattern_LocationLink_2_4_solveCSP_binding = pattern_LocationLink_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, consumer, asset, location, assetToConumer, trgLocation, pair, locationCorr);
		if (result_pattern_LocationLink_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LocationLink_2_4_solveCSP_binding[0];

			Object[] result_pattern_LocationLink_2_4_solveCSP_black = pattern_LocationLink_2_4_solveCSP_blackB(csp);
			if (result_pattern_LocationLink_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, consumer, asset, location, assetToConumer,
						trgLocation, pair, locationCorr };
			}
		}
		return null;
	}

	public static final boolean pattern_LocationLink_2_5_checkCSP_expressionFBB(LocationLink _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LocationLink_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LocationLink_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LocationLink";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LocationLink_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LocationLink_10_1_preparereturnvalue_bindingFB(LocationLink _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LocationLink_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			LocationLink _this) {
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

	public static final Object[] pattern_LocationLink_10_1_preparereturnvalue_bindingAndBlackFFBF(LocationLink _this) {
		Object[] result_pattern_LocationLink_10_1_preparereturnvalue_binding = pattern_LocationLink_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LocationLink_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_LocationLink_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LocationLink_10_1_preparereturnvalue_black = pattern_LocationLink_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_LocationLink_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LocationLink_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_LocationLink_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_LocationLink_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_LocationLink_10_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_Location) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpAsset = _edge_Location.getSrc();
		if (tmpAsset instanceof MeterAsset) {
			MeterAsset asset = (MeterAsset) tmpAsset;
			EObject tmpLocation = _edge_Location.getTrg();
			if (tmpLocation instanceof Location) {
				Location location = (Location) tmpLocation;
				if (location.equals(asset.getLocation())) {
					for (MeterAssetPhysicalDevicePair pair : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(asset, MeterAssetPhysicalDevicePair.class, "a")) {
						_result.add(new Object[] { asset, location, pair, _edge_Location });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_LocationLink_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LocationLink_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			LocationLink _this, Match match, MeterAsset asset, Location location, MeterAssetPhysicalDevicePair pair) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, asset, location, pair);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LocationLink_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			LocationLink _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LocationLink_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_LocationLink_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_LocationLink_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LocationLink_13_1_matchtggpattern_blackBBB(MeterAsset asset, Location location,
			MeterAssetPhysicalDevicePair pair) {
		if (location.equals(asset.getLocation())) {
			if (asset.equals(pair.getA())) {
				return new Object[] { asset, location, pair };
			}
		}
		return null;
	}

	public static final boolean pattern_LocationLink_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LocationLink_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LocationLinkImpl
