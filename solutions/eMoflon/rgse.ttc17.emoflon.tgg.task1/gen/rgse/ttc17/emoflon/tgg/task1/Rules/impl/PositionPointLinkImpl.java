/**
 */
package rgse.ttc17.emoflon.tgg.task1.Rules.impl;

import gluemodel.CIM.IEC61968.Assets.Asset;

import gluemodel.CIM.IEC61968.Common.Location;
import gluemodel.CIM.IEC61968.Common.PositionPoint;

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

import rgse.ttc17.emoflon.tgg.task1.LocationToLocation;
import rgse.ttc17.emoflon.tgg.task1.PositionPointToPositionPoint;

import rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink;
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
 * An implementation of the model object '<em><b>Position Point Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PositionPointLinkImpl extends AbstractRuleImpl implements PositionPointLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionPointLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getPositionPointLink();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Location srcLocation, PositionPoint positionPoint,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset) {
		// initial bindings
		Object[] result1_black = PositionPointLinkImpl.pattern_PositionPointLink_0_1_initialbindings_blackBBBBBB(this,
				match, srcLocation, positionPoint, pair, asset);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[srcLocation] = " + srcLocation + ", "
					+ "[positionPoint] = " + positionPoint + ", " + "[pair] = " + pair + ", " + "[asset] = " + asset
					+ ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = PositionPointLinkImpl
				.pattern_PositionPointLink_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, srcLocation, positionPoint,
						pair, asset);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[srcLocation] = " + srcLocation + ", "
					+ "[positionPoint] = " + positionPoint + ", " + "[pair] = " + pair + ", " + "[asset] = " + asset
					+ ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (PositionPointLinkImpl.pattern_PositionPointLink_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = PositionPointLinkImpl
					.pattern_PositionPointLink_0_4_collectelementstobetranslated_blackBBBBB(match, srcLocation,
							positionPoint, pair, asset);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[srcLocation] = " + srcLocation + ", "
						+ "[positionPoint] = " + positionPoint + ", " + "[pair] = " + pair + ", " + "[asset] = " + asset
						+ ".");
			}
			PositionPointLinkImpl.pattern_PositionPointLink_0_4_collectelementstobetranslated_greenBBBF(match,
					srcLocation, positionPoint);
			// EMoflonEdge srcLocation__positionPoint____Position = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = PositionPointLinkImpl
					.pattern_PositionPointLink_0_5_collectcontextelements_blackBBBBB(match, srcLocation, positionPoint,
							pair, asset);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[srcLocation] = " + srcLocation + ", " + "[positionPoint] = "
								+ positionPoint + ", " + "[pair] = " + pair + ", " + "[asset] = " + asset + ".");
			}
			PositionPointLinkImpl.pattern_PositionPointLink_0_5_collectcontextelements_greenBBBBBFFF(match, srcLocation,
					positionPoint, pair, asset);
			// EMoflonEdge pair__asset____a = (EMoflonEdge) result5_green[5];
			// EMoflonEdge asset__srcLocation____Location = (EMoflonEdge) result5_green[6];
			// EMoflonEdge srcLocation__asset____Assets = (EMoflonEdge) result5_green[7];

			// register objects to match
			PositionPointLinkImpl.pattern_PositionPointLink_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					srcLocation, positionPoint, pair, asset);
			return PositionPointLinkImpl.pattern_PositionPointLink_0_7_expressionF();
		} else {
			return PositionPointLinkImpl.pattern_PositionPointLink_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = PositionPointLinkImpl
				.pattern_PositionPointLink_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Location srcLocation = (Location) result1_bindingAndBlack[0];
		LocationToLocation locationToLocation = (LocationToLocation) result1_bindingAndBlack[1];
		PositionPoint positionPoint = (PositionPoint) result1_bindingAndBlack[2];
		outageDetectionJointarget.PositionPoint trgPositionPoint = (outageDetectionJointarget.PositionPoint) result1_bindingAndBlack[3];
		outageDetectionJointarget.Location trgLocation = (outageDetectionJointarget.Location) result1_bindingAndBlack[4];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result1_bindingAndBlack[5];
		MeterAsset asset = (MeterAsset) result1_bindingAndBlack[6];
		PositionPointToPositionPoint positionCorr = (PositionPointToPositionPoint) result1_bindingAndBlack[7];
		// CSP csp = (CSP) result1_bindingAndBlack[8];
		PositionPointLinkImpl.pattern_PositionPointLink_1_1_performtransformation_greenBB(trgPositionPoint,
				trgLocation);

		// collect translated elements
		Object[] result2_green = PositionPointLinkImpl.pattern_PositionPointLink_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = PositionPointLinkImpl.pattern_PositionPointLink_1_3_bookkeepingforedges_blackBBBBBBBBB(
				ruleresult, srcLocation, locationToLocation, positionPoint, trgPositionPoint, trgLocation, pair, asset,
				positionCorr);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[srcLocation] = " + srcLocation + ", "
					+ "[locationToLocation] = " + locationToLocation + ", " + "[positionPoint] = " + positionPoint
					+ ", " + "[trgPositionPoint] = " + trgPositionPoint + ", " + "[trgLocation] = " + trgLocation + ", "
					+ "[pair] = " + pair + ", " + "[asset] = " + asset + ", " + "[positionCorr] = " + positionCorr
					+ ".");
		}
		PositionPointLinkImpl.pattern_PositionPointLink_1_3_bookkeepingforedges_greenBBBBBFF(ruleresult, srcLocation,
				positionPoint, trgPositionPoint, trgLocation);
		// EMoflonEdge trgLocation__trgPositionPoint____Position = (EMoflonEdge) result3_green[5];
		// EMoflonEdge srcLocation__positionPoint____Position = (EMoflonEdge) result3_green[6];

		// perform postprocessing story node is empty
		// register objects
		PositionPointLinkImpl.pattern_PositionPointLink_1_5_registerobjects_expressionBBBBBBBBBB(this, ruleresult,
				srcLocation, locationToLocation, positionPoint, trgPositionPoint, trgLocation, pair, asset,
				positionCorr);
		return PositionPointLinkImpl.pattern_PositionPointLink_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = PositionPointLinkImpl
				.pattern_PositionPointLink_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PositionPointLinkImpl
				.pattern_PositionPointLink_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = PositionPointLinkImpl.pattern_PositionPointLink_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Location srcLocation = (Location) result2_binding[0];
		PositionPoint positionPoint = (PositionPoint) result2_binding[1];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_binding[2];
		MeterAsset asset = (MeterAsset) result2_binding[3];
		for (Object[] result2_black : PositionPointLinkImpl.pattern_PositionPointLink_2_2_corematch_blackBFBFFBBFB(
				srcLocation, positionPoint, pair, asset, match)) {
			LocationToLocation locationToLocation = (LocationToLocation) result2_black[1];
			outageDetectionJointarget.PositionPoint trgPositionPoint = (outageDetectionJointarget.PositionPoint) result2_black[3];
			outageDetectionJointarget.Location trgLocation = (outageDetectionJointarget.Location) result2_black[4];
			PositionPointToPositionPoint positionCorr = (PositionPointToPositionPoint) result2_black[7];
			// ForEach find context
			for (Object[] result3_black : PositionPointLinkImpl.pattern_PositionPointLink_2_3_findcontext_blackBBBBBBBB(
					srcLocation, locationToLocation, positionPoint, trgPositionPoint, trgLocation, pair, asset,
					positionCorr)) {
				Object[] result3_green = PositionPointLinkImpl
						.pattern_PositionPointLink_2_3_findcontext_greenBBBBBBBBFFFFFFFFF(srcLocation,
								locationToLocation, positionPoint, trgPositionPoint, trgLocation, pair, asset,
								positionCorr);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge locationToLocation__trgLocation____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[10];
				// EMoflonEdge locationToLocation__srcLocation____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge asset__srcLocation____Location = (EMoflonEdge) result3_green[12];
				// EMoflonEdge srcLocation__asset____Assets = (EMoflonEdge) result3_green[13];
				// EMoflonEdge srcLocation__positionPoint____Position = (EMoflonEdge) result3_green[14];
				// EMoflonEdge positionCorr__trgPositionPoint____target = (EMoflonEdge) result3_green[15];
				// EMoflonEdge positionCorr__positionPoint____source = (EMoflonEdge) result3_green[16];

				// solve CSP
				Object[] result4_bindingAndBlack = PositionPointLinkImpl
						.pattern_PositionPointLink_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
								srcLocation, locationToLocation, positionPoint, trgPositionPoint, trgLocation, pair,
								asset, positionCorr);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[srcLocation] = " + srcLocation + ", " + "[locationToLocation] = " + locationToLocation
							+ ", " + "[positionPoint] = " + positionPoint + ", " + "[trgPositionPoint] = "
							+ trgPositionPoint + ", " + "[trgLocation] = " + trgLocation + ", " + "[pair] = " + pair
							+ ", " + "[asset] = " + asset + ", " + "[positionCorr] = " + positionCorr + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (PositionPointLinkImpl.pattern_PositionPointLink_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = PositionPointLinkImpl
							.pattern_PositionPointLink_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					PositionPointLinkImpl.pattern_PositionPointLink_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return PositionPointLinkImpl.pattern_PositionPointLink_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Location srcLocation, PositionPoint positionPoint,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset) {
		match.registerObject("srcLocation", srcLocation);
		match.registerObject("positionPoint", positionPoint);
		match.registerObject("pair", pair);
		match.registerObject("asset", asset);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Location srcLocation, PositionPoint positionPoint,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Location srcLocation,
			LocationToLocation locationToLocation, PositionPoint positionPoint,
			outageDetectionJointarget.PositionPoint trgPositionPoint, outageDetectionJointarget.Location trgLocation,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset, PositionPointToPositionPoint positionCorr) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("srcLocation", srcLocation);
		isApplicableMatch.registerObject("locationToLocation", locationToLocation);
		isApplicableMatch.registerObject("positionPoint", positionPoint);
		isApplicableMatch.registerObject("trgPositionPoint", trgPositionPoint);
		isApplicableMatch.registerObject("trgLocation", trgLocation);
		isApplicableMatch.registerObject("pair", pair);
		isApplicableMatch.registerObject("asset", asset);
		isApplicableMatch.registerObject("positionCorr", positionCorr);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject srcLocation, EObject locationToLocation,
			EObject positionPoint, EObject trgPositionPoint, EObject trgLocation, EObject pair, EObject asset,
			EObject positionCorr) {
		ruleresult.registerObject("srcLocation", srcLocation);
		ruleresult.registerObject("locationToLocation", locationToLocation);
		ruleresult.registerObject("positionPoint", positionPoint);
		ruleresult.registerObject("trgPositionPoint", trgPositionPoint);
		ruleresult.registerObject("trgLocation", trgLocation);
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("asset", asset);
		ruleresult.registerObject("positionCorr", positionCorr);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_18(EMoflonEdge _edge_Position) {
		// prepare return value
		Object[] result1_bindingAndBlack = PositionPointLinkImpl
				.pattern_PositionPointLink_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = PositionPointLinkImpl.pattern_PositionPointLink_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PositionPointLinkImpl
				.pattern_PositionPointLink_10_2_testcorematchandDECs_blackFFFFB(_edge_Position)) {
			Location srcLocation = (Location) result2_black[0];
			PositionPoint positionPoint = (PositionPoint) result2_black[1];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_black[2];
			MeterAsset asset = (MeterAsset) result2_black[3];
			Object[] result2_green = PositionPointLinkImpl
					.pattern_PositionPointLink_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PositionPointLinkImpl
					.pattern_PositionPointLink_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, srcLocation, positionPoint, pair, asset)) {
				// Ensure that the correct types of elements are matched
				if (PositionPointLinkImpl
						.pattern_PositionPointLink_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = PositionPointLinkImpl
							.pattern_PositionPointLink_10_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					PositionPointLinkImpl.pattern_PositionPointLink_10_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return PositionPointLinkImpl.pattern_PositionPointLink_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("PositionPointLink");
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
	public boolean checkDEC_FWD(Location srcLocation, PositionPoint positionPoint, MeterAssetPhysicalDevicePair pair,
			MeterAsset asset) {// match tgg pattern
		Object[] result1_black = PositionPointLinkImpl
				.pattern_PositionPointLink_13_1_matchtggpattern_blackBBBB(srcLocation, positionPoint, pair, asset);
		if (result1_black != null) {
			return PositionPointLinkImpl.pattern_PositionPointLink_13_2_expressionF();
		} else {
			return PositionPointLinkImpl.pattern_PositionPointLink_13_3_expressionF();
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
		case RulesPackage.POSITION_POINT_LINK___IS_APPROPRIATE_FWD__MATCH_LOCATION_POSITIONPOINT_METERASSETPHYSICALDEVICEPAIR_METERASSET:
			return isAppropriate_FWD((Match) arguments.get(0), (Location) arguments.get(1),
					(PositionPoint) arguments.get(2), (MeterAssetPhysicalDevicePair) arguments.get(3),
					(MeterAsset) arguments.get(4));
		case RulesPackage.POSITION_POINT_LINK___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.POSITION_POINT_LINK___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.POSITION_POINT_LINK___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_LOCATION_POSITIONPOINT_METERASSETPHYSICALDEVICEPAIR_METERASSET:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Location) arguments.get(1),
					(PositionPoint) arguments.get(2), (MeterAssetPhysicalDevicePair) arguments.get(3),
					(MeterAsset) arguments.get(4));
			return null;
		case RulesPackage.POSITION_POINT_LINK___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_LOCATION_POSITIONPOINT_METERASSETPHYSICALDEVICEPAIR_METERASSET:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Location) arguments.get(1),
					(PositionPoint) arguments.get(2), (MeterAssetPhysicalDevicePair) arguments.get(3),
					(MeterAsset) arguments.get(4));
		case RulesPackage.POSITION_POINT_LINK___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.POSITION_POINT_LINK___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_LOCATION_LOCATIONTOLOCATION_POSITIONPOINT_POSITIONPOINT_LOCATION_METERASSETPHYSICALDEVICEPAIR_METERASSET_POSITIONPOINTTOPOSITIONPOINT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Location) arguments.get(1),
					(LocationToLocation) arguments.get(2), (PositionPoint) arguments.get(3),
					(outageDetectionJointarget.PositionPoint) arguments.get(4),
					(outageDetectionJointarget.Location) arguments.get(5),
					(MeterAssetPhysicalDevicePair) arguments.get(6), (MeterAsset) arguments.get(7),
					(PositionPointToPositionPoint) arguments.get(8));
		case RulesPackage.POSITION_POINT_LINK___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.POSITION_POINT_LINK___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.POSITION_POINT_LINK___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.POSITION_POINT_LINK___IS_APPROPRIATE_FWD_EMOFLON_EDGE_18__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_18((EMoflonEdge) arguments.get(0));
		case RulesPackage.POSITION_POINT_LINK___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.POSITION_POINT_LINK___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.POSITION_POINT_LINK___CHECK_DEC_FWD__LOCATION_POSITIONPOINT_METERASSETPHYSICALDEVICEPAIR_METERASSET:
			return checkDEC_FWD((Location) arguments.get(0), (PositionPoint) arguments.get(1),
					(MeterAssetPhysicalDevicePair) arguments.get(2), (MeterAsset) arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_PositionPointLink_0_1_initialbindings_blackBBBBBB(PositionPointLink _this,
			Match match, Location srcLocation, PositionPoint positionPoint, MeterAssetPhysicalDevicePair pair,
			MeterAsset asset) {
		return new Object[] { _this, match, srcLocation, positionPoint, pair, asset };
	}

	public static final Object[] pattern_PositionPointLink_0_2_SolveCSP_bindingFBBBBBB(PositionPointLink _this,
			Match match, Location srcLocation, PositionPoint positionPoint, MeterAssetPhysicalDevicePair pair,
			MeterAsset asset) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcLocation, positionPoint, pair, asset);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcLocation, positionPoint, pair, asset };
		}
		return null;
	}

	public static final Object[] pattern_PositionPointLink_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PositionPointLink_0_2_SolveCSP_bindingAndBlackFBBBBBB(PositionPointLink _this,
			Match match, Location srcLocation, PositionPoint positionPoint, MeterAssetPhysicalDevicePair pair,
			MeterAsset asset) {
		Object[] result_pattern_PositionPointLink_0_2_SolveCSP_binding = pattern_PositionPointLink_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, srcLocation, positionPoint, pair, asset);
		if (result_pattern_PositionPointLink_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PositionPointLink_0_2_SolveCSP_binding[0];

			Object[] result_pattern_PositionPointLink_0_2_SolveCSP_black = pattern_PositionPointLink_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_PositionPointLink_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcLocation, positionPoint, pair, asset };
			}
		}
		return null;
	}

	public static final boolean pattern_PositionPointLink_0_3_CheckCSP_expressionFBB(PositionPointLink _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PositionPointLink_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			Location srcLocation, PositionPoint positionPoint, MeterAssetPhysicalDevicePair pair, MeterAsset asset) {
		return new Object[] { match, srcLocation, positionPoint, pair, asset };
	}

	public static final Object[] pattern_PositionPointLink_0_4_collectelementstobetranslated_greenBBBF(Match match,
			Location srcLocation, PositionPoint positionPoint) {
		EMoflonEdge srcLocation__positionPoint____Position = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcLocation__positionPoint____Position_name_prime = "Position";
		srcLocation__positionPoint____Position.setSrc(srcLocation);
		srcLocation__positionPoint____Position.setTrg(positionPoint);
		match.getToBeTranslatedEdges().add(srcLocation__positionPoint____Position);
		srcLocation__positionPoint____Position.setName(srcLocation__positionPoint____Position_name_prime);
		return new Object[] { match, srcLocation, positionPoint, srcLocation__positionPoint____Position };
	}

	public static final Object[] pattern_PositionPointLink_0_5_collectcontextelements_blackBBBBB(Match match,
			Location srcLocation, PositionPoint positionPoint, MeterAssetPhysicalDevicePair pair, MeterAsset asset) {
		return new Object[] { match, srcLocation, positionPoint, pair, asset };
	}

	public static final Object[] pattern_PositionPointLink_0_5_collectcontextelements_greenBBBBBFFF(Match match,
			Location srcLocation, PositionPoint positionPoint, MeterAssetPhysicalDevicePair pair, MeterAsset asset) {
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__asset____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(srcLocation);
		match.getContextNodes().add(positionPoint);
		match.getContextNodes().add(pair);
		match.getContextNodes().add(asset);
		String pair__asset____a_name_prime = "a";
		String asset__srcLocation____Location_name_prime = "Location";
		String srcLocation__asset____Assets_name_prime = "Assets";
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		match.getContextEdges().add(pair__asset____a);
		asset__srcLocation____Location.setSrc(asset);
		asset__srcLocation____Location.setTrg(srcLocation);
		match.getContextEdges().add(asset__srcLocation____Location);
		srcLocation__asset____Assets.setSrc(srcLocation);
		srcLocation__asset____Assets.setTrg(asset);
		match.getContextEdges().add(srcLocation__asset____Assets);
		pair__asset____a.setName(pair__asset____a_name_prime);
		asset__srcLocation____Location.setName(asset__srcLocation____Location_name_prime);
		srcLocation__asset____Assets.setName(srcLocation__asset____Assets_name_prime);
		return new Object[] { match, srcLocation, positionPoint, pair, asset, pair__asset____a,
				asset__srcLocation____Location, srcLocation__asset____Assets };
	}

	public static final void pattern_PositionPointLink_0_6_registerobjectstomatch_expressionBBBBBB(
			PositionPointLink _this, Match match, Location srcLocation, PositionPoint positionPoint,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset) {
		_this.registerObjectsToMatch_FWD(match, srcLocation, positionPoint, pair, asset);

	}

	public static final boolean pattern_PositionPointLink_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PositionPointLink_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PositionPointLink_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("srcLocation");
		EObject _localVariable_1 = isApplicableMatch.getObject("locationToLocation");
		EObject _localVariable_2 = isApplicableMatch.getObject("positionPoint");
		EObject _localVariable_3 = isApplicableMatch.getObject("trgPositionPoint");
		EObject _localVariable_4 = isApplicableMatch.getObject("trgLocation");
		EObject _localVariable_5 = isApplicableMatch.getObject("pair");
		EObject _localVariable_6 = isApplicableMatch.getObject("asset");
		EObject _localVariable_7 = isApplicableMatch.getObject("positionCorr");
		EObject tmpSrcLocation = _localVariable_0;
		EObject tmpLocationToLocation = _localVariable_1;
		EObject tmpPositionPoint = _localVariable_2;
		EObject tmpTrgPositionPoint = _localVariable_3;
		EObject tmpTrgLocation = _localVariable_4;
		EObject tmpPair = _localVariable_5;
		EObject tmpAsset = _localVariable_6;
		EObject tmpPositionCorr = _localVariable_7;
		if (tmpSrcLocation instanceof Location) {
			Location srcLocation = (Location) tmpSrcLocation;
			if (tmpLocationToLocation instanceof LocationToLocation) {
				LocationToLocation locationToLocation = (LocationToLocation) tmpLocationToLocation;
				if (tmpPositionPoint instanceof PositionPoint) {
					PositionPoint positionPoint = (PositionPoint) tmpPositionPoint;
					if (tmpTrgPositionPoint instanceof outageDetectionJointarget.PositionPoint) {
						outageDetectionJointarget.PositionPoint trgPositionPoint = (outageDetectionJointarget.PositionPoint) tmpTrgPositionPoint;
						if (tmpTrgLocation instanceof outageDetectionJointarget.Location) {
							outageDetectionJointarget.Location trgLocation = (outageDetectionJointarget.Location) tmpTrgLocation;
							if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
								MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
								if (tmpAsset instanceof MeterAsset) {
									MeterAsset asset = (MeterAsset) tmpAsset;
									if (tmpPositionCorr instanceof PositionPointToPositionPoint) {
										PositionPointToPositionPoint positionCorr = (PositionPointToPositionPoint) tmpPositionCorr;
										return new Object[] { srcLocation, locationToLocation, positionPoint,
												trgPositionPoint, trgLocation, pair, asset, positionCorr,
												isApplicableMatch };
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

	public static final Object[] pattern_PositionPointLink_1_1_performtransformation_blackBBBBBBBBFBB(
			Location srcLocation, LocationToLocation locationToLocation, PositionPoint positionPoint,
			outageDetectionJointarget.PositionPoint trgPositionPoint, outageDetectionJointarget.Location trgLocation,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset, PositionPointToPositionPoint positionCorr,
			PositionPointLink _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { srcLocation, locationToLocation, positionPoint, trgPositionPoint, trgLocation,
						pair, asset, positionCorr, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PositionPointLink_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			PositionPointLink _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PositionPointLink_1_1_performtransformation_binding = pattern_PositionPointLink_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_PositionPointLink_1_1_performtransformation_binding != null) {
			Location srcLocation = (Location) result_pattern_PositionPointLink_1_1_performtransformation_binding[0];
			LocationToLocation locationToLocation = (LocationToLocation) result_pattern_PositionPointLink_1_1_performtransformation_binding[1];
			PositionPoint positionPoint = (PositionPoint) result_pattern_PositionPointLink_1_1_performtransformation_binding[2];
			outageDetectionJointarget.PositionPoint trgPositionPoint = (outageDetectionJointarget.PositionPoint) result_pattern_PositionPointLink_1_1_performtransformation_binding[3];
			outageDetectionJointarget.Location trgLocation = (outageDetectionJointarget.Location) result_pattern_PositionPointLink_1_1_performtransformation_binding[4];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result_pattern_PositionPointLink_1_1_performtransformation_binding[5];
			MeterAsset asset = (MeterAsset) result_pattern_PositionPointLink_1_1_performtransformation_binding[6];
			PositionPointToPositionPoint positionCorr = (PositionPointToPositionPoint) result_pattern_PositionPointLink_1_1_performtransformation_binding[7];

			Object[] result_pattern_PositionPointLink_1_1_performtransformation_black = pattern_PositionPointLink_1_1_performtransformation_blackBBBBBBBBFBB(
					srcLocation, locationToLocation, positionPoint, trgPositionPoint, trgLocation, pair, asset,
					positionCorr, _this, isApplicableMatch);
			if (result_pattern_PositionPointLink_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_PositionPointLink_1_1_performtransformation_black[8];

				return new Object[] { srcLocation, locationToLocation, positionPoint, trgPositionPoint, trgLocation,
						pair, asset, positionCorr, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PositionPointLink_1_1_performtransformation_greenBB(
			outageDetectionJointarget.PositionPoint trgPositionPoint, outageDetectionJointarget.Location trgLocation) {
		trgLocation.setPosition(trgPositionPoint);
		return new Object[] { trgPositionPoint, trgLocation };
	}

	public static final Object[] pattern_PositionPointLink_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_PositionPointLink_1_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject srcLocation, EObject locationToLocation, EObject positionPoint,
			EObject trgPositionPoint, EObject trgLocation, EObject pair, EObject asset, EObject positionCorr) {
		if (!srcLocation.equals(trgPositionPoint)) {
			if (!srcLocation.equals(trgLocation)) {
				if (!locationToLocation.equals(srcLocation)) {
					if (!locationToLocation.equals(positionPoint)) {
						if (!locationToLocation.equals(trgPositionPoint)) {
							if (!locationToLocation.equals(trgLocation)) {
								if (!locationToLocation.equals(pair)) {
									if (!locationToLocation.equals(positionCorr)) {
										if (!positionPoint.equals(srcLocation)) {
											if (!positionPoint.equals(trgPositionPoint)) {
												if (!positionPoint.equals(trgLocation)) {
													if (!trgLocation.equals(trgPositionPoint)) {
														if (!pair.equals(srcLocation)) {
															if (!pair.equals(positionPoint)) {
																if (!pair.equals(trgPositionPoint)) {
																	if (!pair.equals(trgLocation)) {
																		if (!pair.equals(positionCorr)) {
																			if (!asset.equals(srcLocation)) {
																				if (!asset.equals(locationToLocation)) {
																					if (!asset.equals(positionPoint)) {
																						if (!asset.equals(
																								trgPositionPoint)) {
																							if (!asset.equals(
																									trgLocation)) {
																								if (!asset
																										.equals(pair)) {
																									if (!asset.equals(
																											positionCorr)) {
																										if (!positionCorr
																												.equals(srcLocation)) {
																											if (!positionCorr
																													.equals(positionPoint)) {
																												if (!positionCorr
																														.equals(trgPositionPoint)) {
																													if (!positionCorr
																															.equals(trgLocation)) {
																														return new Object[] {
																																ruleresult,
																																srcLocation,
																																locationToLocation,
																																positionPoint,
																																trgPositionPoint,
																																trgLocation,
																																pair,
																																asset,
																																positionCorr };
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

	public static final Object[] pattern_PositionPointLink_1_3_bookkeepingforedges_greenBBBBBFF(
			PerformRuleResult ruleresult, EObject srcLocation, EObject positionPoint, EObject trgPositionPoint,
			EObject trgLocation) {
		EMoflonEdge trgLocation__trgPositionPoint____Position = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__positionPoint____Position = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PositionPointLink";
		String trgLocation__trgPositionPoint____Position_name_prime = "Position";
		String srcLocation__positionPoint____Position_name_prime = "Position";
		trgLocation__trgPositionPoint____Position.setSrc(trgLocation);
		trgLocation__trgPositionPoint____Position.setTrg(trgPositionPoint);
		ruleresult.getCreatedEdges().add(trgLocation__trgPositionPoint____Position);
		srcLocation__positionPoint____Position.setSrc(srcLocation);
		srcLocation__positionPoint____Position.setTrg(positionPoint);
		ruleresult.getTranslatedEdges().add(srcLocation__positionPoint____Position);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		trgLocation__trgPositionPoint____Position.setName(trgLocation__trgPositionPoint____Position_name_prime);
		srcLocation__positionPoint____Position.setName(srcLocation__positionPoint____Position_name_prime);
		return new Object[] { ruleresult, srcLocation, positionPoint, trgPositionPoint, trgLocation,
				trgLocation__trgPositionPoint____Position, srcLocation__positionPoint____Position };
	}

	public static final void pattern_PositionPointLink_1_5_registerobjects_expressionBBBBBBBBBB(PositionPointLink _this,
			PerformRuleResult ruleresult, EObject srcLocation, EObject locationToLocation, EObject positionPoint,
			EObject trgPositionPoint, EObject trgLocation, EObject pair, EObject asset, EObject positionCorr) {
		_this.registerObjects_FWD(ruleresult, srcLocation, locationToLocation, positionPoint, trgPositionPoint,
				trgLocation, pair, asset, positionCorr);

	}

	public static final PerformRuleResult pattern_PositionPointLink_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PositionPointLink_2_1_preparereturnvalue_bindingFB(PositionPointLink _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PositionPointLink_2_1_preparereturnvalue_blackFBB(EClass eClass,
			PositionPointLink _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PositionPointLink_2_1_preparereturnvalue_bindingAndBlackFFB(
			PositionPointLink _this) {
		Object[] result_pattern_PositionPointLink_2_1_preparereturnvalue_binding = pattern_PositionPointLink_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PositionPointLink_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_PositionPointLink_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PositionPointLink_2_1_preparereturnvalue_black = pattern_PositionPointLink_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_PositionPointLink_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PositionPointLink_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PositionPointLink_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "PositionPointLink";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PositionPointLink_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("srcLocation");
		EObject _localVariable_1 = match.getObject("positionPoint");
		EObject _localVariable_2 = match.getObject("pair");
		EObject _localVariable_3 = match.getObject("asset");
		EObject tmpSrcLocation = _localVariable_0;
		EObject tmpPositionPoint = _localVariable_1;
		EObject tmpPair = _localVariable_2;
		EObject tmpAsset = _localVariable_3;
		if (tmpSrcLocation instanceof Location) {
			Location srcLocation = (Location) tmpSrcLocation;
			if (tmpPositionPoint instanceof PositionPoint) {
				PositionPoint positionPoint = (PositionPoint) tmpPositionPoint;
				if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
					MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
					if (tmpAsset instanceof MeterAsset) {
						MeterAsset asset = (MeterAsset) tmpAsset;
						return new Object[] { srcLocation, positionPoint, pair, asset, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PositionPointLink_2_2_corematch_blackBFBFFBBFB(Location srcLocation,
			PositionPoint positionPoint, MeterAssetPhysicalDevicePair pair, MeterAsset asset, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (LocationToLocation locationToLocation : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcLocation, LocationToLocation.class, "source")) {
			outageDetectionJointarget.Location trgLocation = locationToLocation.getTarget();
			if (trgLocation != null) {
				for (PositionPointToPositionPoint positionCorr : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(positionPoint, PositionPointToPositionPoint.class, "source")) {
					outageDetectionJointarget.PositionPoint trgPositionPoint = positionCorr.getTarget();
					if (trgPositionPoint != null) {
						_result.add(new Object[] { srcLocation, locationToLocation, positionPoint, trgPositionPoint,
								trgLocation, pair, asset, positionCorr, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_PositionPointLink_2_3_findcontext_blackBBBBBBBB(Location srcLocation,
			LocationToLocation locationToLocation, PositionPoint positionPoint,
			outageDetectionJointarget.PositionPoint trgPositionPoint, outageDetectionJointarget.Location trgLocation,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset, PositionPointToPositionPoint positionCorr) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (trgLocation.equals(locationToLocation.getTarget())) {
			if (asset.equals(pair.getA())) {
				if (srcLocation.equals(locationToLocation.getSource())) {
					if (srcLocation.equals(asset.getLocation())) {
						if (positionPoint.equals(srcLocation.getPosition())) {
							if (trgPositionPoint.equals(positionCorr.getTarget())) {
								if (positionPoint.equals(positionCorr.getSource())) {
									_result.add(new Object[] { srcLocation, locationToLocation, positionPoint,
											trgPositionPoint, trgLocation, pair, asset, positionCorr });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_PositionPointLink_2_3_findcontext_greenBBBBBBBBFFFFFFFFF(Location srcLocation,
			LocationToLocation locationToLocation, PositionPoint positionPoint,
			outageDetectionJointarget.PositionPoint trgPositionPoint, outageDetectionJointarget.Location trgLocation,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset, PositionPointToPositionPoint positionCorr) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge locationToLocation__trgLocation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge locationToLocation__srcLocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__asset____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__positionPoint____Position = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge positionCorr__trgPositionPoint____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge positionCorr__positionPoint____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String locationToLocation__trgLocation____target_name_prime = "target";
		String pair__asset____a_name_prime = "a";
		String locationToLocation__srcLocation____source_name_prime = "source";
		String asset__srcLocation____Location_name_prime = "Location";
		String srcLocation__asset____Assets_name_prime = "Assets";
		String srcLocation__positionPoint____Position_name_prime = "Position";
		String positionCorr__trgPositionPoint____target_name_prime = "target";
		String positionCorr__positionPoint____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(srcLocation);
		isApplicableMatch.getAllContextElements().add(locationToLocation);
		isApplicableMatch.getAllContextElements().add(positionPoint);
		isApplicableMatch.getAllContextElements().add(trgPositionPoint);
		isApplicableMatch.getAllContextElements().add(trgLocation);
		isApplicableMatch.getAllContextElements().add(pair);
		isApplicableMatch.getAllContextElements().add(asset);
		isApplicableMatch.getAllContextElements().add(positionCorr);
		locationToLocation__trgLocation____target.setSrc(locationToLocation);
		locationToLocation__trgLocation____target.setTrg(trgLocation);
		isApplicableMatch.getAllContextElements().add(locationToLocation__trgLocation____target);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(pair__asset____a);
		locationToLocation__srcLocation____source.setSrc(locationToLocation);
		locationToLocation__srcLocation____source.setTrg(srcLocation);
		isApplicableMatch.getAllContextElements().add(locationToLocation__srcLocation____source);
		asset__srcLocation____Location.setSrc(asset);
		asset__srcLocation____Location.setTrg(srcLocation);
		isApplicableMatch.getAllContextElements().add(asset__srcLocation____Location);
		srcLocation__asset____Assets.setSrc(srcLocation);
		srcLocation__asset____Assets.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(srcLocation__asset____Assets);
		srcLocation__positionPoint____Position.setSrc(srcLocation);
		srcLocation__positionPoint____Position.setTrg(positionPoint);
		isApplicableMatch.getAllContextElements().add(srcLocation__positionPoint____Position);
		positionCorr__trgPositionPoint____target.setSrc(positionCorr);
		positionCorr__trgPositionPoint____target.setTrg(trgPositionPoint);
		isApplicableMatch.getAllContextElements().add(positionCorr__trgPositionPoint____target);
		positionCorr__positionPoint____source.setSrc(positionCorr);
		positionCorr__positionPoint____source.setTrg(positionPoint);
		isApplicableMatch.getAllContextElements().add(positionCorr__positionPoint____source);
		locationToLocation__trgLocation____target.setName(locationToLocation__trgLocation____target_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		locationToLocation__srcLocation____source.setName(locationToLocation__srcLocation____source_name_prime);
		asset__srcLocation____Location.setName(asset__srcLocation____Location_name_prime);
		srcLocation__asset____Assets.setName(srcLocation__asset____Assets_name_prime);
		srcLocation__positionPoint____Position.setName(srcLocation__positionPoint____Position_name_prime);
		positionCorr__trgPositionPoint____target.setName(positionCorr__trgPositionPoint____target_name_prime);
		positionCorr__positionPoint____source.setName(positionCorr__positionPoint____source_name_prime);
		return new Object[] { srcLocation, locationToLocation, positionPoint, trgPositionPoint, trgLocation, pair,
				asset, positionCorr, isApplicableMatch, locationToLocation__trgLocation____target, pair__asset____a,
				locationToLocation__srcLocation____source, asset__srcLocation____Location, srcLocation__asset____Assets,
				srcLocation__positionPoint____Position, positionCorr__trgPositionPoint____target,
				positionCorr__positionPoint____source };
	}

	public static final Object[] pattern_PositionPointLink_2_4_solveCSP_bindingFBBBBBBBBBB(PositionPointLink _this,
			IsApplicableMatch isApplicableMatch, Location srcLocation, LocationToLocation locationToLocation,
			PositionPoint positionPoint, outageDetectionJointarget.PositionPoint trgPositionPoint,
			outageDetectionJointarget.Location trgLocation, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			PositionPointToPositionPoint positionCorr) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, srcLocation, locationToLocation,
				positionPoint, trgPositionPoint, trgLocation, pair, asset, positionCorr);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, srcLocation, locationToLocation, positionPoint,
					trgPositionPoint, trgLocation, pair, asset, positionCorr };
		}
		return null;
	}

	public static final Object[] pattern_PositionPointLink_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PositionPointLink_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			PositionPointLink _this, IsApplicableMatch isApplicableMatch, Location srcLocation,
			LocationToLocation locationToLocation, PositionPoint positionPoint,
			outageDetectionJointarget.PositionPoint trgPositionPoint, outageDetectionJointarget.Location trgLocation,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset, PositionPointToPositionPoint positionCorr) {
		Object[] result_pattern_PositionPointLink_2_4_solveCSP_binding = pattern_PositionPointLink_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, srcLocation, locationToLocation, positionPoint, trgPositionPoint, trgLocation,
				pair, asset, positionCorr);
		if (result_pattern_PositionPointLink_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PositionPointLink_2_4_solveCSP_binding[0];

			Object[] result_pattern_PositionPointLink_2_4_solveCSP_black = pattern_PositionPointLink_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_PositionPointLink_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, srcLocation, locationToLocation, positionPoint,
						trgPositionPoint, trgLocation, pair, asset, positionCorr };
			}
		}
		return null;
	}

	public static final boolean pattern_PositionPointLink_2_5_checkCSP_expressionFBB(PositionPointLink _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PositionPointLink_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PositionPointLink_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PositionPointLink";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PositionPointLink_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PositionPointLink_10_1_preparereturnvalue_bindingFB(PositionPointLink _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PositionPointLink_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			PositionPointLink _this) {
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

	public static final Object[] pattern_PositionPointLink_10_1_preparereturnvalue_bindingAndBlackFFBF(
			PositionPointLink _this) {
		Object[] result_pattern_PositionPointLink_10_1_preparereturnvalue_binding = pattern_PositionPointLink_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PositionPointLink_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_PositionPointLink_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PositionPointLink_10_1_preparereturnvalue_black = pattern_PositionPointLink_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_PositionPointLink_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PositionPointLink_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_PositionPointLink_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_PositionPointLink_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_PositionPointLink_10_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_Position) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcLocation = _edge_Position.getSrc();
		if (tmpSrcLocation instanceof Location) {
			Location srcLocation = (Location) tmpSrcLocation;
			EObject tmpPositionPoint = _edge_Position.getTrg();
			if (tmpPositionPoint instanceof PositionPoint) {
				PositionPoint positionPoint = (PositionPoint) tmpPositionPoint;
				if (positionPoint.equals(srcLocation.getPosition())) {
					for (Asset tmpAsset : srcLocation.getAssets()) {
						if (tmpAsset instanceof MeterAsset) {
							MeterAsset asset = (MeterAsset) tmpAsset;
							for (MeterAssetPhysicalDevicePair pair : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(asset, MeterAssetPhysicalDevicePair.class, "a")) {
								_result.add(new Object[] { srcLocation, positionPoint, pair, asset, _edge_Position });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_PositionPointLink_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PositionPointLink_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			PositionPointLink _this, Match match, Location srcLocation, PositionPoint positionPoint,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcLocation, positionPoint, pair, asset);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PositionPointLink_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			PositionPointLink _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PositionPointLink_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_PositionPointLink_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_PositionPointLink_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PositionPointLink_13_1_matchtggpattern_blackBBBB(Location srcLocation,
			PositionPoint positionPoint, MeterAssetPhysicalDevicePair pair, MeterAsset asset) {
		if (asset.equals(pair.getA())) {
			if (srcLocation.equals(asset.getLocation())) {
				if (positionPoint.equals(srcLocation.getPosition())) {
					return new Object[] { srcLocation, positionPoint, pair, asset };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_PositionPointLink_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PositionPointLink_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //PositionPointLinkImpl
