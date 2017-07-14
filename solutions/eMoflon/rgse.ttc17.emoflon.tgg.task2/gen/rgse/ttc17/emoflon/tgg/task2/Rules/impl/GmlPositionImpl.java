/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules.impl;

import gluemodel.CIM.IEC61968.Assets.Asset;

import gluemodel.CIM.IEC61968.Common.Location;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;

import gluemodel.MeterAssetMMXUPair;

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
import outagePreventionJointarget.PositionPoint;

import rgse.ttc17.emoflon.tgg.task2.LocationToLocation;
import rgse.ttc17.emoflon.tgg.task2.PositionPointToPositionPoint;

import rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition;
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
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, MeterAsset meter,
			Location location, MeterAssetMMXUPair pair) {
		// initial bindings
		Object[] result1_black = GmlPositionImpl.pattern_GmlPosition_0_1_initialbindings_blackBBBBBB(this, match,
				positionPoint, meter, location, pair);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[positionPoint] = " + positionPoint + ", " + "[meter] = "
							+ meter + ", " + "[location] = " + location + ", " + "[pair] = " + pair + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = GmlPositionImpl.pattern_GmlPosition_0_2_SolveCSP_bindingAndBlackFBBBBBB(this,
				match, positionPoint, meter, location, pair);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[positionPoint] = " + positionPoint + ", "
					+ "[meter] = " + meter + ", " + "[location] = " + location + ", " + "[pair] = " + pair + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (GmlPositionImpl.pattern_GmlPosition_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = GmlPositionImpl.pattern_GmlPosition_0_4_collectelementstobetranslated_blackBBBBB(
					match, positionPoint, meter, location, pair);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[positionPoint] = " + positionPoint + ", "
						+ "[meter] = " + meter + ", " + "[location] = " + location + ", " + "[pair] = " + pair + ".");
			}
			GmlPositionImpl.pattern_GmlPosition_0_4_collectelementstobetranslated_greenBBBF(match, positionPoint,
					location);
			// EMoflonEdge location__positionPoint____Position = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = GmlPositionImpl.pattern_GmlPosition_0_5_collectcontextelements_blackBBBBB(match,
					positionPoint, meter, location, pair);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[positionPoint] = " + positionPoint + ", "
						+ "[meter] = " + meter + ", " + "[location] = " + location + ", " + "[pair] = " + pair + ".");
			}
			GmlPositionImpl.pattern_GmlPosition_0_5_collectcontextelements_greenBBBBFFF(match, meter, location, pair);
			// EMoflonEdge pair__meter____a = (EMoflonEdge) result5_green[4];
			// EMoflonEdge meter__location____Location = (EMoflonEdge) result5_green[5];
			// EMoflonEdge location__meter____Assets = (EMoflonEdge) result5_green[6];

			// register objects to match
			GmlPositionImpl.pattern_GmlPosition_0_6_registerobjectstomatch_expressionBBBBBB(this, match, positionPoint,
					meter, location, pair);
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
		MeterAsset meter = (MeterAsset) result1_bindingAndBlack[1];
		outagePreventionJointarget.Location trgLocation = (outagePreventionJointarget.Location) result1_bindingAndBlack[2];
		Location location = (Location) result1_bindingAndBlack[3];
		MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result1_bindingAndBlack[4];
		LocationToLocation locationCorr = (LocationToLocation) result1_bindingAndBlack[5];
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
				positionPoint, positionCorr, meter, trgLocation, location, trgPositionPoint, pair, locationCorr);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[positionPoint] = " + positionPoint + ", "
					+ "[positionCorr] = " + positionCorr + ", " + "[meter] = " + meter + ", " + "[trgLocation] = "
					+ trgLocation + ", " + "[location] = " + location + ", " + "[trgPositionPoint] = "
					+ trgPositionPoint + ", " + "[pair] = " + pair + ", " + "[locationCorr] = " + locationCorr + ".");
		}
		GmlPositionImpl.pattern_GmlPosition_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, positionPoint,
				positionCorr, trgLocation, location, trgPositionPoint);
		// EMoflonEdge trgLocation__trgPositionPoint____Position = (EMoflonEdge) result3_green[6];
		// EMoflonEdge positionCorr__trgPositionPoint____target = (EMoflonEdge) result3_green[7];
		// EMoflonEdge location__positionPoint____Position = (EMoflonEdge) result3_green[8];
		// EMoflonEdge positionCorr__positionPoint____source = (EMoflonEdge) result3_green[9];

		// perform postprocessing story node is empty
		// register objects
		GmlPositionImpl.pattern_GmlPosition_1_5_registerobjects_expressionBBBBBBBBBB(this, ruleresult, positionPoint,
				positionCorr, meter, trgLocation, location, trgPositionPoint, pair, locationCorr);
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
		MeterAsset meter = (MeterAsset) result2_binding[1];
		Location location = (Location) result2_binding[2];
		MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result2_binding[3];
		for (Object[] result2_black : GmlPositionImpl.pattern_GmlPosition_2_2_corematch_blackBBFBBFB(positionPoint,
				meter, location, pair, match)) {
			outagePreventionJointarget.Location trgLocation = (outagePreventionJointarget.Location) result2_black[2];
			LocationToLocation locationCorr = (LocationToLocation) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : GmlPositionImpl.pattern_GmlPosition_2_3_findcontext_blackBBBBBB(positionPoint,
					meter, trgLocation, location, pair, locationCorr)) {
				Object[] result3_green = GmlPositionImpl.pattern_GmlPosition_2_3_findcontext_greenBBBBBBFFFFFFF(
						positionPoint, meter, trgLocation, location, pair, locationCorr);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge locationCorr__trgLocation____target = (EMoflonEdge) result3_green[7];
				// EMoflonEdge pair__meter____a = (EMoflonEdge) result3_green[8];
				// EMoflonEdge meter__location____Location = (EMoflonEdge) result3_green[9];
				// EMoflonEdge location__meter____Assets = (EMoflonEdge) result3_green[10];
				// EMoflonEdge location__positionPoint____Position = (EMoflonEdge) result3_green[11];
				// EMoflonEdge locationCorr__location____source = (EMoflonEdge) result3_green[12];

				// solve CSP
				Object[] result4_bindingAndBlack = GmlPositionImpl
						.pattern_GmlPosition_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								positionPoint, meter, trgLocation, location, pair, locationCorr);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[positionPoint] = " + positionPoint + ", " + "[meter] = " + meter + ", "
							+ "[trgLocation] = " + trgLocation + ", " + "[location] = " + location + ", " + "[pair] = "
							+ pair + ", " + "[locationCorr] = " + locationCorr + ".");
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
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, MeterAsset meter,
			Location location, MeterAssetMMXUPair pair) {
		match.registerObject("positionPoint", positionPoint);
		match.registerObject("meter", meter);
		match.registerObject("location", location);
		match.registerObject("pair", pair);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, MeterAsset meter,
			Location location, MeterAssetMMXUPair pair) {// Create CSP
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
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, MeterAsset meter,
			outagePreventionJointarget.Location trgLocation, Location location, MeterAssetMMXUPair pair,
			LocationToLocation locationCorr) {// Create CSP
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
		isApplicableMatch.registerObject("meter", meter);
		isApplicableMatch.registerObject("trgLocation", trgLocation);
		isApplicableMatch.registerObject("location", location);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject positionPoint, EObject positionCorr,
			EObject meter, EObject trgLocation, EObject location, EObject trgPositionPoint, EObject pair,
			EObject locationCorr) {
		ruleresult.registerObject("positionPoint", positionPoint);
		ruleresult.registerObject("positionCorr", positionCorr);
		ruleresult.registerObject("meter", meter);
		ruleresult.registerObject("trgLocation", trgLocation);
		ruleresult.registerObject("location", location);
		ruleresult.registerObject("trgPositionPoint", trgPositionPoint);
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("locationCorr", locationCorr);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_29(EMoflonEdge _edge_Position) {
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
			MeterAsset meter = (MeterAsset) result2_black[1];
			Location location = (Location) result2_black[2];
			MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result2_black[3];
			Object[] result2_green = GmlPositionImpl.pattern_GmlPosition_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (GmlPositionImpl.pattern_GmlPosition_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
					this, match, positionPoint, meter, location, pair)) {
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

		Variable var_trgPositionPoint_yPosition = CSPFactoryHelper.eINSTANCE.createVariable("trgPositionPoint", true,
				csp);
		var_trgPositionPoint_yPosition.setValue(__helper.getValue("trgPositionPoint", "yPosition"));
		var_trgPositionPoint_yPosition.setType("String");

		Variable var_positionPoint_yPosition = CSPFactoryHelper.eINSTANCE.createVariable("positionPoint", true, csp);
		var_positionPoint_yPosition.setValue(__helper.getValue("positionPoint", "yPosition"));
		var_positionPoint_yPosition.setType("String");

		Variable var_trgPositionPoint_xPosition = CSPFactoryHelper.eINSTANCE.createVariable("trgPositionPoint", true,
				csp);
		var_trgPositionPoint_xPosition.setValue(__helper.getValue("trgPositionPoint", "xPosition"));
		var_trgPositionPoint_xPosition.setType("String");

		Variable var_positionPoint_xPosition = CSPFactoryHelper.eINSTANCE.createVariable("positionPoint", true, csp);
		var_positionPoint_xPosition.setValue(__helper.getValue("positionPoint", "xPosition"));
		var_positionPoint_xPosition.setType("String");

		Variable var_positionPoint_zPosition = CSPFactoryHelper.eINSTANCE.createVariable("positionPoint", true, csp);
		var_positionPoint_zPosition.setValue(__helper.getValue("positionPoint", "zPosition"));
		var_positionPoint_zPosition.setType("String");

		Variable var_trgPositionPoint_zPosition = CSPFactoryHelper.eINSTANCE.createVariable("trgPositionPoint", true,
				csp);
		var_trgPositionPoint_zPosition.setValue(__helper.getValue("trgPositionPoint", "zPosition"));
		var_trgPositionPoint_zPosition.setType("String");

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
			MeterAsset meter, Location location, MeterAssetMMXUPair pair) {// match tgg pattern
		Object[] result1_black = GmlPositionImpl.pattern_GmlPosition_13_1_matchtggpattern_blackBBBB(positionPoint,
				meter, location, pair);
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
		case RulesPackage.GML_POSITION___IS_APPROPRIATE_FWD__MATCH_GMLPOSITION_METERASSET_LOCATION_METERASSETMMXUPAIR:
			return isAppropriate_FWD((Match) arguments.get(0),
					(gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) arguments.get(1),
					(MeterAsset) arguments.get(2), (Location) arguments.get(3), (MeterAssetMMXUPair) arguments.get(4));
		case RulesPackage.GML_POSITION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.GML_POSITION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.GML_POSITION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_GMLPOSITION_METERASSET_LOCATION_METERASSETMMXUPAIR:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) arguments.get(1),
					(MeterAsset) arguments.get(2), (Location) arguments.get(3), (MeterAssetMMXUPair) arguments.get(4));
			return null;
		case RulesPackage.GML_POSITION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_GMLPOSITION_METERASSET_LOCATION_METERASSETMMXUPAIR:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) arguments.get(1),
					(MeterAsset) arguments.get(2), (Location) arguments.get(3), (MeterAssetMMXUPair) arguments.get(4));
		case RulesPackage.GML_POSITION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.GML_POSITION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_GMLPOSITION_METERASSET_LOCATION_LOCATION_METERASSETMMXUPAIR_LOCATIONTOLOCATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) arguments.get(1),
					(MeterAsset) arguments.get(2), (outagePreventionJointarget.Location) arguments.get(3),
					(Location) arguments.get(4), (MeterAssetMMXUPair) arguments.get(5),
					(LocationToLocation) arguments.get(6));
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
		case RulesPackage.GML_POSITION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_29__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_29((EMoflonEdge) arguments.get(0));
		case RulesPackage.GML_POSITION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.GML_POSITION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.GML_POSITION___CHECK_DEC_FWD__GMLPOSITION_METERASSET_LOCATION_METERASSETMMXUPAIR:
			return checkDEC_FWD((gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) arguments.get(0),
					(MeterAsset) arguments.get(1), (Location) arguments.get(2), (MeterAssetMMXUPair) arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_GmlPosition_0_1_initialbindings_blackBBBBBB(GmlPosition _this, Match match,
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, MeterAsset meter,
			Location location, MeterAssetMMXUPair pair) {
		return new Object[] { _this, match, positionPoint, meter, location, pair };
	}

	public static final Object[] pattern_GmlPosition_0_2_SolveCSP_bindingFBBBBBB(GmlPosition _this, Match match,
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, MeterAsset meter,
			Location location, MeterAssetMMXUPair pair) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, positionPoint, meter, location, pair);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, positionPoint, meter, location, pair };
		}
		return null;
	}

	public static final Object[] pattern_GmlPosition_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_GmlPosition_0_2_SolveCSP_bindingAndBlackFBBBBBB(GmlPosition _this, Match match,
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, MeterAsset meter,
			Location location, MeterAssetMMXUPair pair) {
		Object[] result_pattern_GmlPosition_0_2_SolveCSP_binding = pattern_GmlPosition_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, positionPoint, meter, location, pair);
		if (result_pattern_GmlPosition_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_GmlPosition_0_2_SolveCSP_binding[0];

			Object[] result_pattern_GmlPosition_0_2_SolveCSP_black = pattern_GmlPosition_0_2_SolveCSP_blackB(csp);
			if (result_pattern_GmlPosition_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, positionPoint, meter, location, pair };
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
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, MeterAsset meter,
			Location location, MeterAssetMMXUPair pair) {
		return new Object[] { match, positionPoint, meter, location, pair };
	}

	public static final Object[] pattern_GmlPosition_0_4_collectelementstobetranslated_greenBBBF(Match match,
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, Location location) {
		EMoflonEdge location__positionPoint____Position = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(positionPoint);
		String location__positionPoint____Position_name_prime = "Position";
		location__positionPoint____Position.setSrc(location);
		location__positionPoint____Position.setTrg(positionPoint);
		match.getToBeTranslatedEdges().add(location__positionPoint____Position);
		location__positionPoint____Position.setName(location__positionPoint____Position_name_prime);
		return new Object[] { match, positionPoint, location, location__positionPoint____Position };
	}

	public static final Object[] pattern_GmlPosition_0_5_collectcontextelements_blackBBBBB(Match match,
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, MeterAsset meter,
			Location location, MeterAssetMMXUPair pair) {
		return new Object[] { match, positionPoint, meter, location, pair };
	}

	public static final Object[] pattern_GmlPosition_0_5_collectcontextelements_greenBBBBFFF(Match match,
			MeterAsset meter, Location location, MeterAssetMMXUPair pair) {
		EMoflonEdge pair__meter____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge meter__location____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge location__meter____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(meter);
		match.getContextNodes().add(location);
		match.getContextNodes().add(pair);
		String pair__meter____a_name_prime = "a";
		String meter__location____Location_name_prime = "Location";
		String location__meter____Assets_name_prime = "Assets";
		pair__meter____a.setSrc(pair);
		pair__meter____a.setTrg(meter);
		match.getContextEdges().add(pair__meter____a);
		meter__location____Location.setSrc(meter);
		meter__location____Location.setTrg(location);
		match.getContextEdges().add(meter__location____Location);
		location__meter____Assets.setSrc(location);
		location__meter____Assets.setTrg(meter);
		match.getContextEdges().add(location__meter____Assets);
		pair__meter____a.setName(pair__meter____a_name_prime);
		meter__location____Location.setName(meter__location____Location_name_prime);
		location__meter____Assets.setName(location__meter____Assets_name_prime);
		return new Object[] { match, meter, location, pair, pair__meter____a, meter__location____Location,
				location__meter____Assets };
	}

	public static final void pattern_GmlPosition_0_6_registerobjectstomatch_expressionBBBBBB(GmlPosition _this,
			Match match, gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, MeterAsset meter,
			Location location, MeterAssetMMXUPair pair) {
		_this.registerObjectsToMatch_FWD(match, positionPoint, meter, location, pair);

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
		EObject _localVariable_1 = isApplicableMatch.getObject("meter");
		EObject _localVariable_2 = isApplicableMatch.getObject("trgLocation");
		EObject _localVariable_3 = isApplicableMatch.getObject("location");
		EObject _localVariable_4 = isApplicableMatch.getObject("pair");
		EObject _localVariable_5 = isApplicableMatch.getObject("locationCorr");
		EObject tmpPositionPoint = _localVariable_0;
		EObject tmpMeter = _localVariable_1;
		EObject tmpTrgLocation = _localVariable_2;
		EObject tmpLocation = _localVariable_3;
		EObject tmpPair = _localVariable_4;
		EObject tmpLocationCorr = _localVariable_5;
		if (tmpPositionPoint instanceof gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) {
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint = (gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) tmpPositionPoint;
			if (tmpMeter instanceof MeterAsset) {
				MeterAsset meter = (MeterAsset) tmpMeter;
				if (tmpTrgLocation instanceof outagePreventionJointarget.Location) {
					outagePreventionJointarget.Location trgLocation = (outagePreventionJointarget.Location) tmpTrgLocation;
					if (tmpLocation instanceof Location) {
						Location location = (Location) tmpLocation;
						if (tmpPair instanceof MeterAssetMMXUPair) {
							MeterAssetMMXUPair pair = (MeterAssetMMXUPair) tmpPair;
							if (tmpLocationCorr instanceof LocationToLocation) {
								LocationToLocation locationCorr = (LocationToLocation) tmpLocationCorr;
								return new Object[] { positionPoint, meter, trgLocation, location, pair, locationCorr,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_GmlPosition_1_1_performtransformation_blackBBBBBBFBB(
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, MeterAsset meter,
			outagePreventionJointarget.Location trgLocation, Location location, MeterAssetMMXUPair pair,
			LocationToLocation locationCorr, GmlPosition _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { positionPoint, meter, trgLocation, location, pair, locationCorr, csp, _this,
						isApplicableMatch };
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
			MeterAsset meter = (MeterAsset) result_pattern_GmlPosition_1_1_performtransformation_binding[1];
			outagePreventionJointarget.Location trgLocation = (outagePreventionJointarget.Location) result_pattern_GmlPosition_1_1_performtransformation_binding[2];
			Location location = (Location) result_pattern_GmlPosition_1_1_performtransformation_binding[3];
			MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result_pattern_GmlPosition_1_1_performtransformation_binding[4];
			LocationToLocation locationCorr = (LocationToLocation) result_pattern_GmlPosition_1_1_performtransformation_binding[5];

			Object[] result_pattern_GmlPosition_1_1_performtransformation_black = pattern_GmlPosition_1_1_performtransformation_blackBBBBBBFBB(
					positionPoint, meter, trgLocation, location, pair, locationCorr, _this, isApplicableMatch);
			if (result_pattern_GmlPosition_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_GmlPosition_1_1_performtransformation_black[6];

				return new Object[] { positionPoint, meter, trgLocation, location, pair, locationCorr, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_GmlPosition_1_1_performtransformation_greenBFBFB(
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint,
			outagePreventionJointarget.Location trgLocation, CSP csp) {
		PositionPointToPositionPoint positionCorr = Task2Factory.eINSTANCE.createPositionPointToPositionPoint();
		PositionPoint trgPositionPoint = OutagePreventionJointargetFactory.eINSTANCE.createPositionPoint();
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
			PerformRuleResult ruleresult, EObject positionPoint, EObject positionCorr, EObject meter,
			EObject trgLocation, EObject location, EObject trgPositionPoint, EObject pair, EObject locationCorr) {
		if (!positionPoint.equals(trgLocation)) {
			if (!positionPoint.equals(trgPositionPoint)) {
				if (!positionCorr.equals(positionPoint)) {
					if (!positionCorr.equals(trgLocation)) {
						if (!positionCorr.equals(trgPositionPoint)) {
							if (!meter.equals(positionPoint)) {
								if (!meter.equals(positionCorr)) {
									if (!meter.equals(trgLocation)) {
										if (!meter.equals(trgPositionPoint)) {
											if (!meter.equals(pair)) {
												if (!trgLocation.equals(trgPositionPoint)) {
													if (!location.equals(positionPoint)) {
														if (!location.equals(positionCorr)) {
															if (!location.equals(meter)) {
																if (!location.equals(trgLocation)) {
																	if (!location.equals(trgPositionPoint)) {
																		if (!location.equals(pair)) {
																			if (!location.equals(locationCorr)) {
																				if (!pair.equals(positionPoint)) {
																					if (!pair.equals(positionCorr)) {
																						if (!pair.equals(trgLocation)) {
																							if (!pair.equals(
																									trgPositionPoint)) {
																								if (!locationCorr
																										.equals(positionPoint)) {
																									if (!locationCorr
																											.equals(positionCorr)) {
																										if (!locationCorr
																												.equals(meter)) {
																											if (!locationCorr
																													.equals(trgLocation)) {
																												if (!locationCorr
																														.equals(trgPositionPoint)) {
																													if (!locationCorr
																															.equals(pair)) {
																														return new Object[] {
																																ruleresult,
																																positionPoint,
																																positionCorr,
																																meter,
																																trgLocation,
																																location,
																																trgPositionPoint,
																																pair,
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
			EObject location, EObject trgPositionPoint) {
		EMoflonEdge trgLocation__trgPositionPoint____Position = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge positionCorr__trgPositionPoint____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge location__positionPoint____Position = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge positionCorr__positionPoint____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "GmlPosition";
		String trgLocation__trgPositionPoint____Position_name_prime = "Position";
		String positionCorr__trgPositionPoint____target_name_prime = "target";
		String location__positionPoint____Position_name_prime = "Position";
		String positionCorr__positionPoint____source_name_prime = "source";
		trgLocation__trgPositionPoint____Position.setSrc(trgLocation);
		trgLocation__trgPositionPoint____Position.setTrg(trgPositionPoint);
		ruleresult.getCreatedEdges().add(trgLocation__trgPositionPoint____Position);
		positionCorr__trgPositionPoint____target.setSrc(positionCorr);
		positionCorr__trgPositionPoint____target.setTrg(trgPositionPoint);
		ruleresult.getCreatedEdges().add(positionCorr__trgPositionPoint____target);
		location__positionPoint____Position.setSrc(location);
		location__positionPoint____Position.setTrg(positionPoint);
		ruleresult.getTranslatedEdges().add(location__positionPoint____Position);
		positionCorr__positionPoint____source.setSrc(positionCorr);
		positionCorr__positionPoint____source.setTrg(positionPoint);
		ruleresult.getCreatedEdges().add(positionCorr__positionPoint____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		trgLocation__trgPositionPoint____Position.setName(trgLocation__trgPositionPoint____Position_name_prime);
		positionCorr__trgPositionPoint____target.setName(positionCorr__trgPositionPoint____target_name_prime);
		location__positionPoint____Position.setName(location__positionPoint____Position_name_prime);
		positionCorr__positionPoint____source.setName(positionCorr__positionPoint____source_name_prime);
		return new Object[] { ruleresult, positionPoint, positionCorr, trgLocation, location, trgPositionPoint,
				trgLocation__trgPositionPoint____Position, positionCorr__trgPositionPoint____target,
				location__positionPoint____Position, positionCorr__positionPoint____source };
	}

	public static final void pattern_GmlPosition_1_5_registerobjects_expressionBBBBBBBBBB(GmlPosition _this,
			PerformRuleResult ruleresult, EObject positionPoint, EObject positionCorr, EObject meter,
			EObject trgLocation, EObject location, EObject trgPositionPoint, EObject pair, EObject locationCorr) {
		_this.registerObjects_FWD(ruleresult, positionPoint, positionCorr, meter, trgLocation, location,
				trgPositionPoint, pair, locationCorr);

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
		EObject _localVariable_1 = match.getObject("meter");
		EObject _localVariable_2 = match.getObject("location");
		EObject _localVariable_3 = match.getObject("pair");
		EObject tmpPositionPoint = _localVariable_0;
		EObject tmpMeter = _localVariable_1;
		EObject tmpLocation = _localVariable_2;
		EObject tmpPair = _localVariable_3;
		if (tmpPositionPoint instanceof gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) {
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint = (gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) tmpPositionPoint;
			if (tmpMeter instanceof MeterAsset) {
				MeterAsset meter = (MeterAsset) tmpMeter;
				if (tmpLocation instanceof Location) {
					Location location = (Location) tmpLocation;
					if (tmpPair instanceof MeterAssetMMXUPair) {
						MeterAssetMMXUPair pair = (MeterAssetMMXUPair) tmpPair;
						return new Object[] { positionPoint, meter, location, pair, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_GmlPosition_2_2_corematch_blackBBFBBFB(
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, MeterAsset meter,
			Location location, MeterAssetMMXUPair pair, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (LocationToLocation locationCorr : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(location, LocationToLocation.class, "source")) {
			outagePreventionJointarget.Location trgLocation = locationCorr.getTarget();
			if (trgLocation != null) {
				_result.add(new Object[] { positionPoint, meter, trgLocation, location, pair, locationCorr, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_GmlPosition_2_3_findcontext_blackBBBBBB(
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, MeterAsset meter,
			outagePreventionJointarget.Location trgLocation, Location location, MeterAssetMMXUPair pair,
			LocationToLocation locationCorr) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (trgLocation.equals(locationCorr.getTarget())) {
			if (meter.equals(pair.getA())) {
				if (location.equals(meter.getLocation())) {
					if (positionPoint.equals(location.getPosition())) {
						if (location.equals(locationCorr.getSource())) {
							_result.add(
									new Object[] { positionPoint, meter, trgLocation, location, pair, locationCorr });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_GmlPosition_2_3_findcontext_greenBBBBBBFFFFFFF(
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, MeterAsset meter,
			outagePreventionJointarget.Location trgLocation, Location location, MeterAssetMMXUPair pair,
			LocationToLocation locationCorr) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge locationCorr__trgLocation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__meter____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge meter__location____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge location__meter____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge location__positionPoint____Position = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge locationCorr__location____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String locationCorr__trgLocation____target_name_prime = "target";
		String pair__meter____a_name_prime = "a";
		String meter__location____Location_name_prime = "Location";
		String location__meter____Assets_name_prime = "Assets";
		String location__positionPoint____Position_name_prime = "Position";
		String locationCorr__location____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(positionPoint);
		isApplicableMatch.getAllContextElements().add(meter);
		isApplicableMatch.getAllContextElements().add(trgLocation);
		isApplicableMatch.getAllContextElements().add(location);
		isApplicableMatch.getAllContextElements().add(pair);
		isApplicableMatch.getAllContextElements().add(locationCorr);
		locationCorr__trgLocation____target.setSrc(locationCorr);
		locationCorr__trgLocation____target.setTrg(trgLocation);
		isApplicableMatch.getAllContextElements().add(locationCorr__trgLocation____target);
		pair__meter____a.setSrc(pair);
		pair__meter____a.setTrg(meter);
		isApplicableMatch.getAllContextElements().add(pair__meter____a);
		meter__location____Location.setSrc(meter);
		meter__location____Location.setTrg(location);
		isApplicableMatch.getAllContextElements().add(meter__location____Location);
		location__meter____Assets.setSrc(location);
		location__meter____Assets.setTrg(meter);
		isApplicableMatch.getAllContextElements().add(location__meter____Assets);
		location__positionPoint____Position.setSrc(location);
		location__positionPoint____Position.setTrg(positionPoint);
		isApplicableMatch.getAllContextElements().add(location__positionPoint____Position);
		locationCorr__location____source.setSrc(locationCorr);
		locationCorr__location____source.setTrg(location);
		isApplicableMatch.getAllContextElements().add(locationCorr__location____source);
		locationCorr__trgLocation____target.setName(locationCorr__trgLocation____target_name_prime);
		pair__meter____a.setName(pair__meter____a_name_prime);
		meter__location____Location.setName(meter__location____Location_name_prime);
		location__meter____Assets.setName(location__meter____Assets_name_prime);
		location__positionPoint____Position.setName(location__positionPoint____Position_name_prime);
		locationCorr__location____source.setName(locationCorr__location____source_name_prime);
		return new Object[] { positionPoint, meter, trgLocation, location, pair, locationCorr, isApplicableMatch,
				locationCorr__trgLocation____target, pair__meter____a, meter__location____Location,
				location__meter____Assets, location__positionPoint____Position, locationCorr__location____source };
	}

	public static final Object[] pattern_GmlPosition_2_4_solveCSP_bindingFBBBBBBBB(GmlPosition _this,
			IsApplicableMatch isApplicableMatch,
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, MeterAsset meter,
			outagePreventionJointarget.Location trgLocation, Location location, MeterAssetMMXUPair pair,
			LocationToLocation locationCorr) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, positionPoint, meter, trgLocation,
				location, pair, locationCorr);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, positionPoint, meter, trgLocation, location, pair,
					locationCorr };
		}
		return null;
	}

	public static final Object[] pattern_GmlPosition_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_GmlPosition_2_4_solveCSP_bindingAndBlackFBBBBBBBB(GmlPosition _this,
			IsApplicableMatch isApplicableMatch,
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, MeterAsset meter,
			outagePreventionJointarget.Location trgLocation, Location location, MeterAssetMMXUPair pair,
			LocationToLocation locationCorr) {
		Object[] result_pattern_GmlPosition_2_4_solveCSP_binding = pattern_GmlPosition_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, positionPoint, meter, trgLocation, location, pair, locationCorr);
		if (result_pattern_GmlPosition_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_GmlPosition_2_4_solveCSP_binding[0];

			Object[] result_pattern_GmlPosition_2_4_solveCSP_black = pattern_GmlPosition_2_4_solveCSP_blackB(csp);
			if (result_pattern_GmlPosition_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, positionPoint, meter, trgLocation, location, pair,
						locationCorr };
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

	public static final Object[] pattern_GmlPosition_10_2_testcorematchandDECs_black_nac_0BB(
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, Location location) {
		for (Location __DEC_positionPoint_Position_62823 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(positionPoint, Location.class, "Position")) {
			if (!location.equals(__DEC_positionPoint_Position_62823)) {
				return new Object[] { positionPoint, location };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_GmlPosition_10_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_Position) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLocation = _edge_Position.getSrc();
		if (tmpLocation instanceof Location) {
			Location location = (Location) tmpLocation;
			EObject tmpPositionPoint = _edge_Position.getTrg();
			if (tmpPositionPoint instanceof gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) {
				gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint = (gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition) tmpPositionPoint;
				if (positionPoint.equals(location.getPosition())) {
					if (pattern_GmlPosition_10_2_testcorematchandDECs_black_nac_0BB(positionPoint, location) == null) {
						for (Asset tmpMeter : location.getAssets()) {
							if (tmpMeter instanceof MeterAsset) {
								MeterAsset meter = (MeterAsset) tmpMeter;
								for (MeterAssetMMXUPair pair : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(meter, MeterAssetMMXUPair.class, "a")) {
									_result.add(new Object[] { positionPoint, meter, location, pair, _edge_Position });
								}
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
			MeterAsset meter, Location location, MeterAssetMMXUPair pair) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, positionPoint, meter, location, pair);
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

	public static final Object[] pattern_GmlPosition_13_1_matchtggpattern_black_nac_0BB(
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, Location location) {
		for (Location __DEC_positionPoint_Position_391861 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(positionPoint, Location.class, "Position")) {
			if (!location.equals(__DEC_positionPoint_Position_391861)) {
				return new Object[] { positionPoint, location };
			}
		}
		return null;
	}

	public static final Object[] pattern_GmlPosition_13_1_matchtggpattern_blackBBBB(
			gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition positionPoint, MeterAsset meter,
			Location location, MeterAssetMMXUPair pair) {
		if (meter.equals(pair.getA())) {
			if (location.equals(meter.getLocation())) {
				if (positionPoint.equals(location.getPosition())) {
					if (pattern_GmlPosition_13_1_matchtggpattern_black_nac_0BB(positionPoint, location) == null) {
						return new Object[] { positionPoint, meter, location, pair };
					}
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
