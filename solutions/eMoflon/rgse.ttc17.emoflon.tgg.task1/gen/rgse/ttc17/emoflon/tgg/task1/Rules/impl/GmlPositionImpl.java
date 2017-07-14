/**
 */
package rgse.ttc17.emoflon.tgg.task1.Rules.impl;

import gluemodel.CIM.IEC61968.Assets.Asset;

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

import outageDetectionJointarget.OutageDetectionJointargetFactory;
import outageDetectionJointarget.PositionPoint;

import rgse.ttc17.emoflon.tgg.task1.LocationToLocation;
import rgse.ttc17.emoflon.tgg.task1.PositionPointToPositionPoint;

import rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition;
import rgse.ttc17.emoflon.tgg.task1.Rules.RulesPackage;

import rgse.ttc17.emoflon.tgg.task1.Task1Factory;
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
 * An implementation of the model object '<em><b>Gml Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GmlPositionImpl extends AbstractRuleImpl implements GmlPosition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlPositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getGmlPosition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, Location srcLocation,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		// initial bindings
		Object[] result1_black = GmlPositionImpl.pattern_GmlPosition_0_1_initialbindings_blackBBBBBB(this, match,
				positionPoint, srcLocation, asset, pair);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[positionPoint] = " + positionPoint
					+ ", " + "[srcLocation] = " + srcLocation + ", " + "[asset] = " + asset + ", " + "[pair] = " + pair
					+ ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = GmlPositionImpl.pattern_GmlPosition_0_2_SolveCSP_bindingAndBlackFBBBBBB(this,
				match, positionPoint, srcLocation, asset, pair);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[positionPoint] = " + positionPoint + ", "
					+ "[srcLocation] = " + srcLocation + ", " + "[asset] = " + asset + ", " + "[pair] = " + pair + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (GmlPositionImpl.pattern_GmlPosition_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = GmlPositionImpl.pattern_GmlPosition_0_4_collectelementstobetranslated_blackBBBBB(
					match, positionPoint, srcLocation, asset, pair);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[positionPoint] = " + positionPoint + ", "
						+ "[srcLocation] = " + srcLocation + ", " + "[asset] = " + asset + ", " + "[pair] = " + pair
						+ ".");
			}
			GmlPositionImpl.pattern_GmlPosition_0_4_collectelementstobetranslated_greenBBBF(match, positionPoint,
					srcLocation);
			// EMoflonEdge srcLocation__positionPoint____Position = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = GmlPositionImpl.pattern_GmlPosition_0_5_collectcontextelements_blackBBBBB(match,
					positionPoint, srcLocation, asset, pair);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[positionPoint] = " + positionPoint + ", " + "[srcLocation] = "
								+ srcLocation + ", " + "[asset] = " + asset + ", " + "[pair] = " + pair + ".");
			}
			GmlPositionImpl.pattern_GmlPosition_0_5_collectcontextelements_greenBBBBFFF(match, srcLocation, asset,
					pair);
			// EMoflonEdge asset__srcLocation____Location = (EMoflonEdge) result5_green[4];
			// EMoflonEdge srcLocation__asset____Assets = (EMoflonEdge) result5_green[5];
			// EMoflonEdge pair__asset____a = (EMoflonEdge) result5_green[6];

			// register objects to match
			GmlPositionImpl.pattern_GmlPosition_0_6_registerobjectstomatch_expressionBBBBBB(this, match, positionPoint,
					srcLocation, asset, pair);
			return GmlPositionImpl.pattern_GmlPosition_0_7_expressionF();
		} else {
			return GmlPositionImpl.pattern_GmlPosition_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = GmlPositionImpl
				.pattern_GmlPosition_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint = (gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) result1_bindingAndBlack[0];
		LocationToLocation locationToLocation = (LocationToLocation) result1_bindingAndBlack[1];
		outageDetectionJointarget.Location trgLocation = (outageDetectionJointarget.Location) result1_bindingAndBlack[2];
		Location srcLocation = (Location) result1_bindingAndBlack[3];
		MeterAsset asset = (MeterAsset) result1_bindingAndBlack[4];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = GmlPositionImpl.pattern_GmlPosition_1_1_performtransformation_greenBFBFB(positionPoint,
				trgLocation, csp);
		PositionPointToPositionPoint positionCorr = (PositionPointToPositionPoint) result1_green[1];
		PositionPoint trgPositionPoint = (PositionPoint) result1_green[3];

		// collect translated elements
		Object[] result2_black = GmlPositionImpl.pattern_GmlPosition_1_2_collecttranslatedelements_blackBBB(
				positionPoint, positionCorr, trgPositionPoint);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[positionPoint] = " + positionPoint + ", " + "[positionCorr] = " + positionCorr + ", "
					+ "[trgPositionPoint] = " + trgPositionPoint + ".");
		}
		Object[] result2_green = GmlPositionImpl.pattern_GmlPosition_1_2_collecttranslatedelements_greenFBBB(
				positionPoint, positionCorr, trgPositionPoint);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = GmlPositionImpl.pattern_GmlPosition_1_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult,
				positionPoint, locationToLocation, positionCorr, trgLocation, srcLocation, asset, trgPositionPoint,
				pair);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[positionPoint] = " + positionPoint + ", "
					+ "[locationToLocation] = " + locationToLocation + ", " + "[positionCorr] = " + positionCorr + ", "
					+ "[trgLocation] = " + trgLocation + ", " + "[srcLocation] = " + srcLocation + ", " + "[asset] = "
					+ asset + ", " + "[trgPositionPoint] = " + trgPositionPoint + ", " + "[pair] = " + pair + ".");
		}
		GmlPositionImpl.pattern_GmlPosition_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, positionPoint,
				positionCorr, trgLocation, srcLocation, trgPositionPoint);
		// EMoflonEdge srcLocation__positionPoint____Position = (EMoflonEdge) result3_green[6];
		// EMoflonEdge trgLocation__trgPositionPoint____Position = (EMoflonEdge) result3_green[7];
		// EMoflonEdge positionCorr__trgPositionPoint____target = (EMoflonEdge) result3_green[8];
		// EMoflonEdge positionCorr__positionPoint____source = (EMoflonEdge) result3_green[9];

		// perform postprocessing story node is empty
		// register objects
		GmlPositionImpl.pattern_GmlPosition_1_5_registerobjects_expressionBBBBBBBBBB(this, ruleresult, positionPoint,
				locationToLocation, positionCorr, trgLocation, srcLocation, asset, trgPositionPoint, pair);
		return GmlPositionImpl.pattern_GmlPosition_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = GmlPositionImpl
				.pattern_GmlPosition_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = GmlPositionImpl.pattern_GmlPosition_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = GmlPositionImpl.pattern_GmlPosition_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint = (gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) result2_binding[0];
		Location srcLocation = (Location) result2_binding[1];
		MeterAsset asset = (MeterAsset) result2_binding[2];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_binding[3];
		for (Object[] result2_black : GmlPositionImpl.pattern_GmlPosition_2_2_corematch_blackBFFBBBB(positionPoint,
				srcLocation, asset, pair, match)) {
			LocationToLocation locationToLocation = (LocationToLocation) result2_black[1];
			outageDetectionJointarget.Location trgLocation = (outageDetectionJointarget.Location) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : GmlPositionImpl.pattern_GmlPosition_2_3_findcontext_blackBBBBBB(positionPoint,
					locationToLocation, trgLocation, srcLocation, asset, pair)) {
				Object[] result3_green = GmlPositionImpl.pattern_GmlPosition_2_3_findcontext_greenBBBBBBFFFFFFF(
						positionPoint, locationToLocation, trgLocation, srcLocation, asset, pair);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge locationToLocation__trgLocation____target = (EMoflonEdge) result3_green[7];
				// EMoflonEdge asset__srcLocation____Location = (EMoflonEdge) result3_green[8];
				// EMoflonEdge srcLocation__asset____Assets = (EMoflonEdge) result3_green[9];
				// EMoflonEdge locationToLocation__srcLocation____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge srcLocation__positionPoint____Position = (EMoflonEdge) result3_green[11];
				// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[12];

				// solve CSP
				Object[] result4_bindingAndBlack = GmlPositionImpl
						.pattern_GmlPosition_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								positionPoint, locationToLocation, trgLocation, srcLocation, asset, pair);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[positionPoint] = " + positionPoint + ", " + "[locationToLocation] = "
							+ locationToLocation + ", " + "[trgLocation] = " + trgLocation + ", " + "[srcLocation] = "
							+ srcLocation + ", " + "[asset] = " + asset + ", " + "[pair] = " + pair + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (GmlPositionImpl.pattern_GmlPosition_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = GmlPositionImpl
							.pattern_GmlPosition_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					GmlPositionImpl.pattern_GmlPosition_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return GmlPositionImpl.pattern_GmlPosition_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, Location srcLocation,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		match.registerObject("positionPoint", positionPoint);
		match.registerObject("srcLocation", srcLocation);
		match.registerObject("asset", asset);
		match.registerObject("pair", pair);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, Location srcLocation,
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
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint,
			LocationToLocation locationToLocation, outageDetectionJointarget.Location trgLocation, Location srcLocation,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_positionPoint_yPosition = CSPFactoryHelper.eINSTANCE.createVariable("positionPoint.yPosition",
				true, csp);
		var_positionPoint_yPosition.setValue(positionPoint.getYPosition());
		var_positionPoint_yPosition.setType("String");
		Variable var_positionPoint_xPosition = CSPFactoryHelper.eINSTANCE.createVariable("positionPoint.xPosition",
				true, csp);
		var_positionPoint_xPosition.setValue(positionPoint.getXPosition());
		var_positionPoint_xPosition.setType("String");
		Variable var_positionPoint_zPosition = CSPFactoryHelper.eINSTANCE.createVariable("positionPoint.zPosition",
				true, csp);
		var_positionPoint_zPosition.setValue(positionPoint.getZPosition());
		var_positionPoint_zPosition.setType("String");

		// Create unbound variables
		Variable var_trgPositionPoint_yPosition = CSPFactoryHelper.eINSTANCE
				.createVariable("trgPositionPoint.yPosition", csp);
		var_trgPositionPoint_yPosition.setType("String");
		Variable var_trgPositionPoint_xPosition = CSPFactoryHelper.eINSTANCE
				.createVariable("trgPositionPoint.xPosition", csp);
		var_trgPositionPoint_xPosition.setType("String");
		Variable var_trgPositionPoint_zPosition = CSPFactoryHelper.eINSTANCE
				.createVariable("trgPositionPoint.zPosition", csp);
		var_trgPositionPoint_zPosition.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		Eq eq_1 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eq_1);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_positionPoint_yPosition, var_trgPositionPoint_yPosition);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_positionPoint_xPosition, var_trgPositionPoint_xPosition);
		eq_1.setRuleName("NoRuleName");
		eq_1.solve(var_positionPoint_zPosition, var_trgPositionPoint_zPosition);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("positionPoint", positionPoint);
		isApplicableMatch.registerObject("locationToLocation", locationToLocation);
		isApplicableMatch.registerObject("trgLocation", trgLocation);
		isApplicableMatch.registerObject("srcLocation", srcLocation);
		isApplicableMatch.registerObject("asset", asset);
		isApplicableMatch.registerObject("pair", pair);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject positionPoint, EObject locationToLocation,
			EObject positionCorr, EObject trgLocation, EObject srcLocation, EObject asset, EObject trgPositionPoint,
			EObject pair) {
		ruleresult.registerObject("positionPoint", positionPoint);
		ruleresult.registerObject("locationToLocation", locationToLocation);
		ruleresult.registerObject("positionCorr", positionCorr);
		ruleresult.registerObject("trgLocation", trgLocation);
		ruleresult.registerObject("srcLocation", srcLocation);
		ruleresult.registerObject("asset", asset);
		ruleresult.registerObject("trgPositionPoint", trgPositionPoint);
		ruleresult.registerObject("pair", pair);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("positionPoint").eClass())
				.equals("gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_14(EMoflonEdge _edge_Position) {
		// prepare return value
		Object[] result1_bindingAndBlack = GmlPositionImpl
				.pattern_GmlPosition_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = GmlPositionImpl.pattern_GmlPosition_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : GmlPositionImpl
				.pattern_GmlPosition_10_2_testcorematchandDECs_blackFFFFB(_edge_Position)) {
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint = (gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) result2_black[0];
			Location srcLocation = (Location) result2_black[1];
			MeterAsset asset = (MeterAsset) result2_black[2];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_black[3];
			Object[] result2_green = GmlPositionImpl.pattern_GmlPosition_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (GmlPositionImpl.pattern_GmlPosition_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
					this, match, positionPoint, srcLocation, asset, pair)) {
				// Ensure that the correct types of elements are matched
				if (GmlPositionImpl
						.pattern_GmlPosition_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = GmlPositionImpl.pattern_GmlPosition_10_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					GmlPositionImpl.pattern_GmlPosition_10_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return GmlPositionImpl.pattern_GmlPosition_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("GmlPosition");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_positionPoint_yPosition = CSPFactoryHelper.eINSTANCE.createVariable("positionPoint", true, csp);
		var_positionPoint_yPosition.setValue(__helper.getValue("positionPoint", "yPosition"));
		var_positionPoint_yPosition.setType("String");

		Variable var_positionPoint_xPosition = CSPFactoryHelper.eINSTANCE.createVariable("positionPoint", true, csp);
		var_positionPoint_xPosition.setValue(__helper.getValue("positionPoint", "xPosition"));
		var_positionPoint_xPosition.setType("String");

		Variable var_trgPositionPoint_yPosition = CSPFactoryHelper.eINSTANCE.createVariable("trgPositionPoint", true,
				csp);
		var_trgPositionPoint_yPosition.setValue(__helper.getValue("trgPositionPoint", "yPosition"));
		var_trgPositionPoint_yPosition.setType("String");

		Variable var_trgPositionPoint_xPosition = CSPFactoryHelper.eINSTANCE.createVariable("trgPositionPoint", true,
				csp);
		var_trgPositionPoint_xPosition.setValue(__helper.getValue("trgPositionPoint", "xPosition"));
		var_trgPositionPoint_xPosition.setType("String");

		Variable var_trgPositionPoint_zPosition = CSPFactoryHelper.eINSTANCE.createVariable("trgPositionPoint", true,
				csp);
		var_trgPositionPoint_zPosition.setValue(__helper.getValue("trgPositionPoint", "zPosition"));
		var_trgPositionPoint_zPosition.setType("String");

		Variable var_positionPoint_zPosition = CSPFactoryHelper.eINSTANCE.createVariable("positionPoint", true, csp);
		var_positionPoint_zPosition.setValue(__helper.getValue("positionPoint", "zPosition"));
		var_positionPoint_zPosition.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		Eq eq2 = new Eq();
		csp.getConstraints().add(eq2);

		eq0.setRuleName("GmlPosition");
		eq0.solve(var_positionPoint_yPosition, var_trgPositionPoint_yPosition);

		eq1.setRuleName("GmlPosition");
		eq1.solve(var_positionPoint_xPosition, var_trgPositionPoint_xPosition);

		eq2.setRuleName("GmlPosition");
		eq2.solve(var_positionPoint_zPosition, var_trgPositionPoint_zPosition);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_trgPositionPoint_yPosition.setBound(false);
			var_trgPositionPoint_xPosition.setBound(false);
			var_trgPositionPoint_zPosition.setBound(false);
			eq0.solve(var_positionPoint_yPosition, var_trgPositionPoint_yPosition);
			eq1.solve(var_positionPoint_xPosition, var_trgPositionPoint_xPosition);
			eq2.solve(var_positionPoint_zPosition, var_trgPositionPoint_zPosition);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("trgPositionPoint", "yPosition", var_trgPositionPoint_yPosition.getValue());
				__helper.setValue("trgPositionPoint", "xPosition", var_trgPositionPoint_xPosition.getValue());
				__helper.setValue("trgPositionPoint", "zPosition", var_trgPositionPoint_zPosition.getValue());
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
	public boolean checkDEC_FWD(gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint,
			Location srcLocation, MeterAsset asset, MeterAssetPhysicalDevicePair pair) {// match tgg pattern
		Object[] result1_black = GmlPositionImpl.pattern_GmlPosition_13_1_matchtggpattern_blackBBBB(positionPoint,
				srcLocation, asset, pair);
		if (result1_black != null) {
			return GmlPositionImpl.pattern_GmlPosition_13_2_expressionF();
		} else {
			return GmlPositionImpl.pattern_GmlPosition_13_3_expressionF();
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
		case RulesPackage.GML_POSITION___IS_APPROPRIATE_FWD__MATCH_GMLPOSITION_LOCATION_METERASSET_METERASSETPHYSICALDEVICEPAIR:
			return isAppropriate_FWD((Match) arguments.get(0),
					(gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) arguments.get(1),
					(Location) arguments.get(2), (MeterAsset) arguments.get(3),
					(MeterAssetPhysicalDevicePair) arguments.get(4));
		case RulesPackage.GML_POSITION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.GML_POSITION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.GML_POSITION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_GMLPOSITION_LOCATION_METERASSET_METERASSETPHYSICALDEVICEPAIR:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) arguments.get(1),
					(Location) arguments.get(2), (MeterAsset) arguments.get(3),
					(MeterAssetPhysicalDevicePair) arguments.get(4));
			return null;
		case RulesPackage.GML_POSITION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_GMLPOSITION_LOCATION_METERASSET_METERASSETPHYSICALDEVICEPAIR:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) arguments.get(1),
					(Location) arguments.get(2), (MeterAsset) arguments.get(3),
					(MeterAssetPhysicalDevicePair) arguments.get(4));
		case RulesPackage.GML_POSITION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.GML_POSITION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_GMLPOSITION_LOCATIONTOLOCATION_LOCATION_LOCATION_METERASSET_METERASSETPHYSICALDEVICEPAIR:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) arguments.get(1),
					(LocationToLocation) arguments.get(2), (outageDetectionJointarget.Location) arguments.get(3),
					(Location) arguments.get(4), (MeterAsset) arguments.get(5),
					(MeterAssetPhysicalDevicePair) arguments.get(6));
		case RulesPackage.GML_POSITION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.GML_POSITION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.GML_POSITION___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.GML_POSITION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_14__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_14((EMoflonEdge) arguments.get(0));
		case RulesPackage.GML_POSITION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.GML_POSITION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.GML_POSITION___CHECK_DEC_FWD__GMLPOSITION_LOCATION_METERASSET_METERASSETPHYSICALDEVICEPAIR:
			return checkDEC_FWD((gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) arguments.get(0),
					(Location) arguments.get(1), (MeterAsset) arguments.get(2),
					(MeterAssetPhysicalDevicePair) arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_GmlPosition_0_1_initialbindings_blackBBBBBB(GmlPosition _this, Match match,
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, Location srcLocation,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		return new Object[] { _this, match, positionPoint, srcLocation, asset, pair };
	}

	public static final Object[] pattern_GmlPosition_0_2_SolveCSP_bindingFBBBBBB(GmlPosition _this, Match match,
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, Location srcLocation,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, positionPoint, srcLocation, asset, pair);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, positionPoint, srcLocation, asset, pair };
		}
		return null;
	}

	public static final Object[] pattern_GmlPosition_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_GmlPosition_0_2_SolveCSP_bindingAndBlackFBBBBBB(GmlPosition _this, Match match,
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, Location srcLocation,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		Object[] result_pattern_GmlPosition_0_2_SolveCSP_binding = pattern_GmlPosition_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, positionPoint, srcLocation, asset, pair);
		if (result_pattern_GmlPosition_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_GmlPosition_0_2_SolveCSP_binding[0];

			Object[] result_pattern_GmlPosition_0_2_SolveCSP_black = pattern_GmlPosition_0_2_SolveCSP_blackB(csp);
			if (result_pattern_GmlPosition_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, positionPoint, srcLocation, asset, pair };
			}
		}
		return null;
	}

	public static final boolean pattern_GmlPosition_0_3_CheckCSP_expressionFBB(GmlPosition _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_GmlPosition_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, Location srcLocation,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		return new Object[] { match, positionPoint, srcLocation, asset, pair };
	}

	public static final Object[] pattern_GmlPosition_0_4_collectelementstobetranslated_greenBBBF(Match match,
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, Location srcLocation) {
		EMoflonEdge srcLocation__positionPoint____Position = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(positionPoint);
		String srcLocation__positionPoint____Position_name_prime = "Position";
		srcLocation__positionPoint____Position.setSrc(srcLocation);
		srcLocation__positionPoint____Position.setTrg(positionPoint);
		match.getToBeTranslatedEdges().add(srcLocation__positionPoint____Position);
		srcLocation__positionPoint____Position.setName(srcLocation__positionPoint____Position_name_prime);
		return new Object[] { match, positionPoint, srcLocation, srcLocation__positionPoint____Position };
	}

	public static final Object[] pattern_GmlPosition_0_5_collectcontextelements_blackBBBBB(Match match,
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, Location srcLocation,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		return new Object[] { match, positionPoint, srcLocation, asset, pair };
	}

	public static final Object[] pattern_GmlPosition_0_5_collectcontextelements_greenBBBBFFF(Match match,
			Location srcLocation, MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		EMoflonEdge asset__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__asset____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(srcLocation);
		match.getContextNodes().add(asset);
		match.getContextNodes().add(pair);
		String asset__srcLocation____Location_name_prime = "Location";
		String srcLocation__asset____Assets_name_prime = "Assets";
		String pair__asset____a_name_prime = "a";
		asset__srcLocation____Location.setSrc(asset);
		asset__srcLocation____Location.setTrg(srcLocation);
		match.getContextEdges().add(asset__srcLocation____Location);
		srcLocation__asset____Assets.setSrc(srcLocation);
		srcLocation__asset____Assets.setTrg(asset);
		match.getContextEdges().add(srcLocation__asset____Assets);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		match.getContextEdges().add(pair__asset____a);
		asset__srcLocation____Location.setName(asset__srcLocation____Location_name_prime);
		srcLocation__asset____Assets.setName(srcLocation__asset____Assets_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		return new Object[] { match, srcLocation, asset, pair, asset__srcLocation____Location,
				srcLocation__asset____Assets, pair__asset____a };
	}

	public static final void pattern_GmlPosition_0_6_registerobjectstomatch_expressionBBBBBB(GmlPosition _this,
			Match match, gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint,
			Location srcLocation, MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		_this.registerObjectsToMatch_FWD(match, positionPoint, srcLocation, asset, pair);

	}

	public static final boolean pattern_GmlPosition_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_GmlPosition_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_GmlPosition_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("positionPoint");
		EObject _localVariable_1 = isApplicableMatch.getObject("locationToLocation");
		EObject _localVariable_2 = isApplicableMatch.getObject("trgLocation");
		EObject _localVariable_3 = isApplicableMatch.getObject("srcLocation");
		EObject _localVariable_4 = isApplicableMatch.getObject("asset");
		EObject _localVariable_5 = isApplicableMatch.getObject("pair");
		EObject tmpPositionPoint = _localVariable_0;
		EObject tmpLocationToLocation = _localVariable_1;
		EObject tmpTrgLocation = _localVariable_2;
		EObject tmpSrcLocation = _localVariable_3;
		EObject tmpAsset = _localVariable_4;
		EObject tmpPair = _localVariable_5;
		if (tmpPositionPoint instanceof gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) {
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint = (gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) tmpPositionPoint;
			if (tmpLocationToLocation instanceof LocationToLocation) {
				LocationToLocation locationToLocation = (LocationToLocation) tmpLocationToLocation;
				if (tmpTrgLocation instanceof outageDetectionJointarget.Location) {
					outageDetectionJointarget.Location trgLocation = (outageDetectionJointarget.Location) tmpTrgLocation;
					if (tmpSrcLocation instanceof Location) {
						Location srcLocation = (Location) tmpSrcLocation;
						if (tmpAsset instanceof MeterAsset) {
							MeterAsset asset = (MeterAsset) tmpAsset;
							if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
								MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
								return new Object[] { positionPoint, locationToLocation, trgLocation, srcLocation,
										asset, pair, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_GmlPosition_1_1_performtransformation_blackBBBBBBFBB(
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint,
			LocationToLocation locationToLocation, outageDetectionJointarget.Location trgLocation, Location srcLocation,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, GmlPosition _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { positionPoint, locationToLocation, trgLocation, srcLocation, asset, pair, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_GmlPosition_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			GmlPosition _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_GmlPosition_1_1_performtransformation_binding = pattern_GmlPosition_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_GmlPosition_1_1_performtransformation_binding != null) {
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint = (gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) result_pattern_GmlPosition_1_1_performtransformation_binding[0];
			LocationToLocation locationToLocation = (LocationToLocation) result_pattern_GmlPosition_1_1_performtransformation_binding[1];
			outageDetectionJointarget.Location trgLocation = (outageDetectionJointarget.Location) result_pattern_GmlPosition_1_1_performtransformation_binding[2];
			Location srcLocation = (Location) result_pattern_GmlPosition_1_1_performtransformation_binding[3];
			MeterAsset asset = (MeterAsset) result_pattern_GmlPosition_1_1_performtransformation_binding[4];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result_pattern_GmlPosition_1_1_performtransformation_binding[5];

			Object[] result_pattern_GmlPosition_1_1_performtransformation_black = pattern_GmlPosition_1_1_performtransformation_blackBBBBBBFBB(
					positionPoint, locationToLocation, trgLocation, srcLocation, asset, pair, _this, isApplicableMatch);
			if (result_pattern_GmlPosition_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_GmlPosition_1_1_performtransformation_black[6];

				return new Object[] { positionPoint, locationToLocation, trgLocation, srcLocation, asset, pair, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_GmlPosition_1_1_performtransformation_greenBFBFB(
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint,
			outageDetectionJointarget.Location trgLocation, CSP csp) {
		PositionPointToPositionPoint positionCorr = Task1Factory.eINSTANCE.createPositionPointToPositionPoint();
		PositionPoint trgPositionPoint = OutageDetectionJointargetFactory.eINSTANCE.createPositionPoint();
		Object _localVariable_0 = csp.getValue("trgPositionPoint", "yPosition");
		Object _localVariable_1 = csp.getValue("trgPositionPoint", "xPosition");
		Object _localVariable_2 = csp.getValue("trgPositionPoint", "zPosition");
		positionCorr.setSource(positionPoint);
		trgLocation.setPosition(trgPositionPoint);
		positionCorr.setTarget(trgPositionPoint);
		String trgPositionPoint_yPosition_prime = (String) _localVariable_0;
		String trgPositionPoint_xPosition_prime = (String) _localVariable_1;
		String trgPositionPoint_zPosition_prime = (String) _localVariable_2;
		trgPositionPoint.setYPosition(trgPositionPoint_yPosition_prime);
		trgPositionPoint.setXPosition(trgPositionPoint_xPosition_prime);
		trgPositionPoint.setZPosition(trgPositionPoint_zPosition_prime);
		return new Object[] { positionPoint, positionCorr, trgLocation, trgPositionPoint, csp };
	}

	public static final Object[] pattern_GmlPosition_1_2_collecttranslatedelements_blackBBB(
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint,
			PositionPointToPositionPoint positionCorr, PositionPoint trgPositionPoint) {
		return new Object[] { positionPoint, positionCorr, trgPositionPoint };
	}

	public static final Object[] pattern_GmlPosition_1_2_collecttranslatedelements_greenFBBB(
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint,
			PositionPointToPositionPoint positionCorr, PositionPoint trgPositionPoint) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(positionPoint);
		ruleresult.getCreatedLinkElements().add(positionCorr);
		ruleresult.getCreatedElements().add(trgPositionPoint);
		return new Object[] { ruleresult, positionPoint, positionCorr, trgPositionPoint };
	}

	public static final Object[] pattern_GmlPosition_1_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject positionPoint, EObject locationToLocation, EObject positionCorr,
			EObject trgLocation, EObject srcLocation, EObject asset, EObject trgPositionPoint, EObject pair) {
		if (!positionPoint.equals(trgLocation)) {
			if (!positionPoint.equals(srcLocation)) {
				if (!positionPoint.equals(trgPositionPoint)) {
					if (!locationToLocation.equals(positionPoint)) {
						if (!locationToLocation.equals(positionCorr)) {
							if (!locationToLocation.equals(trgLocation)) {
								if (!locationToLocation.equals(srcLocation)) {
									if (!locationToLocation.equals(trgPositionPoint)) {
										if (!locationToLocation.equals(pair)) {
											if (!positionCorr.equals(positionPoint)) {
												if (!positionCorr.equals(trgLocation)) {
													if (!positionCorr.equals(srcLocation)) {
														if (!positionCorr.equals(trgPositionPoint)) {
															if (!trgLocation.equals(trgPositionPoint)) {
																if (!srcLocation.equals(trgLocation)) {
																	if (!srcLocation.equals(trgPositionPoint)) {
																		if (!asset.equals(positionPoint)) {
																			if (!asset.equals(locationToLocation)) {
																				if (!asset.equals(positionCorr)) {
																					if (!asset.equals(trgLocation)) {
																						if (!asset
																								.equals(srcLocation)) {
																							if (!asset.equals(
																									trgPositionPoint)) {
																								if (!asset
																										.equals(pair)) {
																									if (!pair.equals(
																											positionPoint)) {
																										if (!pair
																												.equals(positionCorr)) {
																											if (!pair
																													.equals(trgLocation)) {
																												if (!pair
																														.equals(srcLocation)) {
																													if (!pair
																															.equals(trgPositionPoint)) {
																														return new Object[] {
																																ruleresult,
																																positionPoint,
																																locationToLocation,
																																positionCorr,
																																trgLocation,
																																srcLocation,
																																asset,
																																trgPositionPoint,
																																pair };
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

	public static final Object[] pattern_GmlPosition_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject positionPoint, EObject positionCorr, EObject trgLocation,
			EObject srcLocation, EObject trgPositionPoint) {
		EMoflonEdge srcLocation__positionPoint____Position = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgLocation__trgPositionPoint____Position = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge positionCorr__trgPositionPoint____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge positionCorr__positionPoint____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "GmlPosition";
		String srcLocation__positionPoint____Position_name_prime = "Position";
		String trgLocation__trgPositionPoint____Position_name_prime = "Position";
		String positionCorr__trgPositionPoint____target_name_prime = "target";
		String positionCorr__positionPoint____source_name_prime = "source";
		srcLocation__positionPoint____Position.setSrc(srcLocation);
		srcLocation__positionPoint____Position.setTrg(positionPoint);
		ruleresult.getTranslatedEdges().add(srcLocation__positionPoint____Position);
		trgLocation__trgPositionPoint____Position.setSrc(trgLocation);
		trgLocation__trgPositionPoint____Position.setTrg(trgPositionPoint);
		ruleresult.getCreatedEdges().add(trgLocation__trgPositionPoint____Position);
		positionCorr__trgPositionPoint____target.setSrc(positionCorr);
		positionCorr__trgPositionPoint____target.setTrg(trgPositionPoint);
		ruleresult.getCreatedEdges().add(positionCorr__trgPositionPoint____target);
		positionCorr__positionPoint____source.setSrc(positionCorr);
		positionCorr__positionPoint____source.setTrg(positionPoint);
		ruleresult.getCreatedEdges().add(positionCorr__positionPoint____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		srcLocation__positionPoint____Position.setName(srcLocation__positionPoint____Position_name_prime);
		trgLocation__trgPositionPoint____Position.setName(trgLocation__trgPositionPoint____Position_name_prime);
		positionCorr__trgPositionPoint____target.setName(positionCorr__trgPositionPoint____target_name_prime);
		positionCorr__positionPoint____source.setName(positionCorr__positionPoint____source_name_prime);
		return new Object[] { ruleresult, positionPoint, positionCorr, trgLocation, srcLocation, trgPositionPoint,
				srcLocation__positionPoint____Position, trgLocation__trgPositionPoint____Position,
				positionCorr__trgPositionPoint____target, positionCorr__positionPoint____source };
	}

	public static final void pattern_GmlPosition_1_5_registerobjects_expressionBBBBBBBBBB(GmlPosition _this,
			PerformRuleResult ruleresult, EObject positionPoint, EObject locationToLocation, EObject positionCorr,
			EObject trgLocation, EObject srcLocation, EObject asset, EObject trgPositionPoint, EObject pair) {
		_this.registerObjects_FWD(ruleresult, positionPoint, locationToLocation, positionCorr, trgLocation, srcLocation,
				asset, trgPositionPoint, pair);

	}

	public static final PerformRuleResult pattern_GmlPosition_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_GmlPosition_2_1_preparereturnvalue_bindingFB(GmlPosition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_GmlPosition_2_1_preparereturnvalue_blackFBB(EClass eClass, GmlPosition _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_GmlPosition_2_1_preparereturnvalue_bindingAndBlackFFB(GmlPosition _this) {
		Object[] result_pattern_GmlPosition_2_1_preparereturnvalue_binding = pattern_GmlPosition_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_GmlPosition_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_GmlPosition_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_GmlPosition_2_1_preparereturnvalue_black = pattern_GmlPosition_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_GmlPosition_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_GmlPosition_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_GmlPosition_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "GmlPosition";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_GmlPosition_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("positionPoint");
		EObject _localVariable_1 = match.getObject("srcLocation");
		EObject _localVariable_2 = match.getObject("asset");
		EObject _localVariable_3 = match.getObject("pair");
		EObject tmpPositionPoint = _localVariable_0;
		EObject tmpSrcLocation = _localVariable_1;
		EObject tmpAsset = _localVariable_2;
		EObject tmpPair = _localVariable_3;
		if (tmpPositionPoint instanceof gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) {
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint = (gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) tmpPositionPoint;
			if (tmpSrcLocation instanceof Location) {
				Location srcLocation = (Location) tmpSrcLocation;
				if (tmpAsset instanceof MeterAsset) {
					MeterAsset asset = (MeterAsset) tmpAsset;
					if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
						MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
						return new Object[] { positionPoint, srcLocation, asset, pair, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_GmlPosition_2_2_corematch_blackBFFBBBB(
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, Location srcLocation,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (LocationToLocation locationToLocation : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcLocation, LocationToLocation.class, "source")) {
			outageDetectionJointarget.Location trgLocation = locationToLocation.getTarget();
			if (trgLocation != null) {
				_result.add(new Object[] { positionPoint, locationToLocation, trgLocation, srcLocation, asset, pair,
						match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_GmlPosition_2_3_findcontext_blackBBBBBB(
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint,
			LocationToLocation locationToLocation, outageDetectionJointarget.Location trgLocation, Location srcLocation,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (trgLocation.equals(locationToLocation.getTarget())) {
			if (srcLocation.equals(asset.getLocation())) {
				if (srcLocation.equals(locationToLocation.getSource())) {
					if (positionPoint.equals(srcLocation.getPosition())) {
						if (asset.equals(pair.getA())) {
							_result.add(new Object[] { positionPoint, locationToLocation, trgLocation, srcLocation,
									asset, pair });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_GmlPosition_2_3_findcontext_greenBBBBBBFFFFFFF(
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint,
			LocationToLocation locationToLocation, outageDetectionJointarget.Location trgLocation, Location srcLocation,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge locationToLocation__trgLocation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__asset____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge locationToLocation__srcLocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__positionPoint____Position = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String locationToLocation__trgLocation____target_name_prime = "target";
		String asset__srcLocation____Location_name_prime = "Location";
		String srcLocation__asset____Assets_name_prime = "Assets";
		String locationToLocation__srcLocation____source_name_prime = "source";
		String srcLocation__positionPoint____Position_name_prime = "Position";
		String pair__asset____a_name_prime = "a";
		isApplicableMatch.getAllContextElements().add(positionPoint);
		isApplicableMatch.getAllContextElements().add(locationToLocation);
		isApplicableMatch.getAllContextElements().add(trgLocation);
		isApplicableMatch.getAllContextElements().add(srcLocation);
		isApplicableMatch.getAllContextElements().add(asset);
		isApplicableMatch.getAllContextElements().add(pair);
		locationToLocation__trgLocation____target.setSrc(locationToLocation);
		locationToLocation__trgLocation____target.setTrg(trgLocation);
		isApplicableMatch.getAllContextElements().add(locationToLocation__trgLocation____target);
		asset__srcLocation____Location.setSrc(asset);
		asset__srcLocation____Location.setTrg(srcLocation);
		isApplicableMatch.getAllContextElements().add(asset__srcLocation____Location);
		srcLocation__asset____Assets.setSrc(srcLocation);
		srcLocation__asset____Assets.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(srcLocation__asset____Assets);
		locationToLocation__srcLocation____source.setSrc(locationToLocation);
		locationToLocation__srcLocation____source.setTrg(srcLocation);
		isApplicableMatch.getAllContextElements().add(locationToLocation__srcLocation____source);
		srcLocation__positionPoint____Position.setSrc(srcLocation);
		srcLocation__positionPoint____Position.setTrg(positionPoint);
		isApplicableMatch.getAllContextElements().add(srcLocation__positionPoint____Position);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(pair__asset____a);
		locationToLocation__trgLocation____target.setName(locationToLocation__trgLocation____target_name_prime);
		asset__srcLocation____Location.setName(asset__srcLocation____Location_name_prime);
		srcLocation__asset____Assets.setName(srcLocation__asset____Assets_name_prime);
		locationToLocation__srcLocation____source.setName(locationToLocation__srcLocation____source_name_prime);
		srcLocation__positionPoint____Position.setName(srcLocation__positionPoint____Position_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		return new Object[] { positionPoint, locationToLocation, trgLocation, srcLocation, asset, pair,
				isApplicableMatch, locationToLocation__trgLocation____target, asset__srcLocation____Location,
				srcLocation__asset____Assets, locationToLocation__srcLocation____source,
				srcLocation__positionPoint____Position, pair__asset____a };
	}

	public static final Object[] pattern_GmlPosition_2_4_solveCSP_bindingFBBBBBBBB(GmlPosition _this,
			IsApplicableMatch isApplicableMatch,
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint,
			LocationToLocation locationToLocation, outageDetectionJointarget.Location trgLocation, Location srcLocation,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, positionPoint, locationToLocation,
				trgLocation, srcLocation, asset, pair);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, positionPoint, locationToLocation, trgLocation,
					srcLocation, asset, pair };
		}
		return null;
	}

	public static final Object[] pattern_GmlPosition_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_GmlPosition_2_4_solveCSP_bindingAndBlackFBBBBBBBB(GmlPosition _this,
			IsApplicableMatch isApplicableMatch,
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint,
			LocationToLocation locationToLocation, outageDetectionJointarget.Location trgLocation, Location srcLocation,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		Object[] result_pattern_GmlPosition_2_4_solveCSP_binding = pattern_GmlPosition_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, positionPoint, locationToLocation, trgLocation, srcLocation, asset, pair);
		if (result_pattern_GmlPosition_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_GmlPosition_2_4_solveCSP_binding[0];

			Object[] result_pattern_GmlPosition_2_4_solveCSP_black = pattern_GmlPosition_2_4_solveCSP_blackB(csp);
			if (result_pattern_GmlPosition_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, positionPoint, locationToLocation, trgLocation,
						srcLocation, asset, pair };
			}
		}
		return null;
	}

	public static final boolean pattern_GmlPosition_2_5_checkCSP_expressionFBB(GmlPosition _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_GmlPosition_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_GmlPosition_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "GmlPosition";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_GmlPosition_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_GmlPosition_10_1_preparereturnvalue_bindingFB(GmlPosition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_GmlPosition_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			GmlPosition _this) {
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

	public static final Object[] pattern_GmlPosition_10_1_preparereturnvalue_bindingAndBlackFFBF(GmlPosition _this) {
		Object[] result_pattern_GmlPosition_10_1_preparereturnvalue_binding = pattern_GmlPosition_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_GmlPosition_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_GmlPosition_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_GmlPosition_10_1_preparereturnvalue_black = pattern_GmlPosition_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_GmlPosition_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_GmlPosition_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_GmlPosition_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_GmlPosition_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_GmlPosition_10_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_Position) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcLocation = _edge_Position.getSrc();
		if (tmpSrcLocation instanceof Location) {
			Location srcLocation = (Location) tmpSrcLocation;
			EObject tmpPositionPoint = _edge_Position.getTrg();
			if (tmpPositionPoint instanceof gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) {
				gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint = (gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) tmpPositionPoint;
				if (positionPoint.equals(srcLocation.getPosition())) {
					for (Asset tmpAsset : srcLocation.getAssets()) {
						if (tmpAsset instanceof MeterAsset) {
							MeterAsset asset = (MeterAsset) tmpAsset;
							for (MeterAssetPhysicalDevicePair pair : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(asset, MeterAssetPhysicalDevicePair.class, "a")) {
								_result.add(new Object[] { positionPoint, srcLocation, asset, pair, _edge_Position });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_GmlPosition_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_GmlPosition_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			GmlPosition _this, Match match, gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint,
			Location srcLocation, MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, positionPoint, srcLocation, asset, pair);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_GmlPosition_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			GmlPosition _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_GmlPosition_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_GmlPosition_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_GmlPosition_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_GmlPosition_13_1_matchtggpattern_blackBBBB(
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, Location srcLocation,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		if (srcLocation.equals(asset.getLocation())) {
			if (positionPoint.equals(srcLocation.getPosition())) {
				if (asset.equals(pair.getA())) {
					return new Object[] { positionPoint, srcLocation, asset, pair };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_GmlPosition_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_GmlPosition_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //GmlPositionImpl
