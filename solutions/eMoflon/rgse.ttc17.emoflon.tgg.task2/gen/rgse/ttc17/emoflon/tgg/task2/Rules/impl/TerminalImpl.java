/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules.impl;

import gluemodel.CIM.IEC61968.Assets.Asset;

import gluemodel.CIM.IEC61968.Common.Location;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;

import gluemodel.CIM.IEC61970.Core.ConductingEquipment;

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
import outagePreventionJointarget.PowerSystemResource;

import rgse.ttc17.emoflon.tgg.task2.PowerSystemResourceToPowerSystemResource;

import rgse.ttc17.emoflon.tgg.task2.Rules.RulesPackage;
import rgse.ttc17.emoflon.tgg.task2.Rules.Terminal;

import rgse.ttc17.emoflon.tgg.task2.Task2Factory;
import rgse.ttc17.emoflon.tgg.task2.TerminalToTerminal;
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
 * An implementation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TerminalImpl extends AbstractRuleImpl implements Terminal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTerminal();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, gluemodel.CIM.IEC61970.Core.Terminal srcTerminal,
			MeterAssetMMXUPair pair, ConductingEquipment srcResource, MeterAsset meter, Location srcLocation) {
		// initial bindings
		Object[] result1_black = TerminalImpl.pattern_Terminal_0_1_initialbindings_blackBBBBBBB(this, match,
				srcTerminal, pair, srcResource, meter, srcLocation);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[srcTerminal] = " + srcTerminal + ", "
					+ "[pair] = " + pair + ", " + "[srcResource] = " + srcResource + ", " + "[meter] = " + meter + ", "
					+ "[srcLocation] = " + srcLocation + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = TerminalImpl.pattern_Terminal_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this,
				match, srcTerminal, pair, srcResource, meter, srcLocation);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[srcTerminal] = " + srcTerminal + ", " + "[pair] = "
					+ pair + ", " + "[srcResource] = " + srcResource + ", " + "[meter] = " + meter + ", "
					+ "[srcLocation] = " + srcLocation + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (TerminalImpl.pattern_Terminal_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = TerminalImpl.pattern_Terminal_0_4_collectelementstobetranslated_blackBBBBBB(match,
					srcTerminal, pair, srcResource, meter, srcLocation);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[srcTerminal] = " + srcTerminal + ", "
						+ "[pair] = " + pair + ", " + "[srcResource] = " + srcResource + ", " + "[meter] = " + meter
						+ ", " + "[srcLocation] = " + srcLocation + ".");
			}
			TerminalImpl.pattern_Terminal_0_4_collectelementstobetranslated_greenBBBFF(match, srcTerminal, srcResource);
			// EMoflonEdge srcResource__srcTerminal____Terminals = (EMoflonEdge) result4_green[3];
			// EMoflonEdge srcTerminal__srcResource____ConductingEquipment = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = TerminalImpl.pattern_Terminal_0_5_collectcontextelements_blackBBBBBB(match,
					srcTerminal, pair, srcResource, meter, srcLocation);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[srcTerminal] = " + srcTerminal + ", "
						+ "[pair] = " + pair + ", " + "[srcResource] = " + srcResource + ", " + "[meter] = " + meter
						+ ", " + "[srcLocation] = " + srcLocation + ".");
			}
			TerminalImpl.pattern_Terminal_0_5_collectcontextelements_greenBBBBBFFFFF(match, pair, srcResource, meter,
					srcLocation);
			// EMoflonEdge pair__meter____a = (EMoflonEdge) result5_green[5];
			// EMoflonEdge meter__srcLocation____Location = (EMoflonEdge) result5_green[6];
			// EMoflonEdge srcLocation__meter____Assets = (EMoflonEdge) result5_green[7];
			// EMoflonEdge srcLocation__srcResource____PowerSystemResources = (EMoflonEdge) result5_green[8];
			// EMoflonEdge srcResource__srcLocation____Location = (EMoflonEdge) result5_green[9];

			// register objects to match
			TerminalImpl.pattern_Terminal_0_6_registerobjectstomatch_expressionBBBBBBB(this, match, srcTerminal, pair,
					srcResource, meter, srcLocation);
			return TerminalImpl.pattern_Terminal_0_7_expressionF();
		} else {
			return TerminalImpl.pattern_Terminal_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = TerminalImpl
				.pattern_Terminal_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		gluemodel.CIM.IEC61970.Core.Terminal srcTerminal = (gluemodel.CIM.IEC61970.Core.Terminal) result1_bindingAndBlack[0];
		PowerSystemResourceToPowerSystemResource resourceToTResource = (PowerSystemResourceToPowerSystemResource) result1_bindingAndBlack[1];
		MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result1_bindingAndBlack[2];
		ConductingEquipment srcResource = (ConductingEquipment) result1_bindingAndBlack[3];
		PowerSystemResource trgResource = (PowerSystemResource) result1_bindingAndBlack[4];
		MeterAsset meter = (MeterAsset) result1_bindingAndBlack[5];
		Location srcLocation = (Location) result1_bindingAndBlack[6];
		// CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = TerminalImpl.pattern_Terminal_1_1_performtransformation_greenBFF(srcTerminal);
		outagePreventionJointarget.Terminal trgTerminal = (outagePreventionJointarget.Terminal) result1_green[1];
		TerminalToTerminal terminalToTerminal = (TerminalToTerminal) result1_green[2];

		// collect translated elements
		Object[] result2_black = TerminalImpl.pattern_Terminal_1_2_collecttranslatedelements_blackBBB(srcTerminal,
				trgTerminal, terminalToTerminal);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[srcTerminal] = " + srcTerminal + ", " + "[trgTerminal] = " + trgTerminal + ", "
					+ "[terminalToTerminal] = " + terminalToTerminal + ".");
		}
		Object[] result2_green = TerminalImpl.pattern_Terminal_1_2_collecttranslatedelements_greenFBBB(srcTerminal,
				trgTerminal, terminalToTerminal);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = TerminalImpl.pattern_Terminal_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult,
				srcTerminal, resourceToTResource, pair, srcResource, trgResource, meter, srcLocation, trgTerminal,
				terminalToTerminal);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[srcTerminal] = " + srcTerminal + ", "
					+ "[resourceToTResource] = " + resourceToTResource + ", " + "[pair] = " + pair + ", "
					+ "[srcResource] = " + srcResource + ", " + "[trgResource] = " + trgResource + ", " + "[meter] = "
					+ meter + ", " + "[srcLocation] = " + srcLocation + ", " + "[trgTerminal] = " + trgTerminal + ", "
					+ "[terminalToTerminal] = " + terminalToTerminal + ".");
		}
		TerminalImpl.pattern_Terminal_1_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult, srcTerminal, srcResource,
				trgTerminal, terminalToTerminal);
		// EMoflonEdge srcResource__srcTerminal____Terminals = (EMoflonEdge) result3_green[5];
		// EMoflonEdge srcTerminal__srcResource____ConductingEquipment = (EMoflonEdge) result3_green[6];
		// EMoflonEdge terminalToTerminal__trgTerminal____target = (EMoflonEdge) result3_green[7];
		// EMoflonEdge terminalToTerminal__srcTerminal____source = (EMoflonEdge) result3_green[8];

		// perform postprocessing story node is empty
		// register objects
		TerminalImpl.pattern_Terminal_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, srcTerminal,
				resourceToTResource, pair, srcResource, trgResource, meter, srcLocation, trgTerminal,
				terminalToTerminal);
		return TerminalImpl.pattern_Terminal_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = TerminalImpl
				.pattern_Terminal_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TerminalImpl.pattern_Terminal_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = TerminalImpl.pattern_Terminal_2_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		gluemodel.CIM.IEC61970.Core.Terminal srcTerminal = (gluemodel.CIM.IEC61970.Core.Terminal) result2_binding[0];
		MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result2_binding[1];
		ConductingEquipment srcResource = (ConductingEquipment) result2_binding[2];
		MeterAsset meter = (MeterAsset) result2_binding[3];
		Location srcLocation = (Location) result2_binding[4];
		for (Object[] result2_black : TerminalImpl.pattern_Terminal_2_2_corematch_blackBFBBFBBB(srcTerminal, pair,
				srcResource, meter, srcLocation, match)) {
			PowerSystemResourceToPowerSystemResource resourceToTResource = (PowerSystemResourceToPowerSystemResource) result2_black[1];
			PowerSystemResource trgResource = (PowerSystemResource) result2_black[4];
			// ForEach find context
			for (Object[] result3_black : TerminalImpl.pattern_Terminal_2_3_findcontext_blackBBBBBBB(srcTerminal,
					resourceToTResource, pair, srcResource, trgResource, meter, srcLocation)) {
				Object[] result3_green = TerminalImpl.pattern_Terminal_2_3_findcontext_greenBBBBBBBFFFFFFFFFF(
						srcTerminal, resourceToTResource, pair, srcResource, trgResource, meter, srcLocation);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge pair__meter____a = (EMoflonEdge) result3_green[8];
				// EMoflonEdge resourceToTResource__srcResource____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge meter__srcLocation____Location = (EMoflonEdge) result3_green[10];
				// EMoflonEdge srcLocation__meter____Assets = (EMoflonEdge) result3_green[11];
				// EMoflonEdge srcResource__srcTerminal____Terminals = (EMoflonEdge) result3_green[12];
				// EMoflonEdge srcTerminal__srcResource____ConductingEquipment = (EMoflonEdge) result3_green[13];
				// EMoflonEdge resourceToTResource__trgResource____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge srcLocation__srcResource____PowerSystemResources = (EMoflonEdge) result3_green[15];
				// EMoflonEdge srcResource__srcLocation____Location = (EMoflonEdge) result3_green[16];

				// solve CSP
				Object[] result4_bindingAndBlack = TerminalImpl.pattern_Terminal_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
						this, isApplicableMatch, srcTerminal, resourceToTResource, pair, srcResource, trgResource,
						meter, srcLocation);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[srcTerminal] = " + srcTerminal + ", " + "[resourceToTResource] = " + resourceToTResource
							+ ", " + "[pair] = " + pair + ", " + "[srcResource] = " + srcResource + ", "
							+ "[trgResource] = " + trgResource + ", " + "[meter] = " + meter + ", " + "[srcLocation] = "
							+ srcLocation + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (TerminalImpl.pattern_Terminal_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = TerminalImpl.pattern_Terminal_2_6_addmatchtoruleresult_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					TerminalImpl.pattern_Terminal_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return TerminalImpl.pattern_Terminal_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, gluemodel.CIM.IEC61970.Core.Terminal srcTerminal,
			MeterAssetMMXUPair pair, ConductingEquipment srcResource, MeterAsset meter, Location srcLocation) {
		match.registerObject("srcTerminal", srcTerminal);
		match.registerObject("pair", pair);
		match.registerObject("srcResource", srcResource);
		match.registerObject("meter", meter);
		match.registerObject("srcLocation", srcLocation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, gluemodel.CIM.IEC61970.Core.Terminal srcTerminal,
			MeterAssetMMXUPair pair, ConductingEquipment srcResource, MeterAsset meter, Location srcLocation) {// Create CSP
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
			gluemodel.CIM.IEC61970.Core.Terminal srcTerminal,
			PowerSystemResourceToPowerSystemResource resourceToTResource, MeterAssetMMXUPair pair,
			ConductingEquipment srcResource, PowerSystemResource trgResource, MeterAsset meter, Location srcLocation) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("srcTerminal", srcTerminal);
		isApplicableMatch.registerObject("resourceToTResource", resourceToTResource);
		isApplicableMatch.registerObject("pair", pair);
		isApplicableMatch.registerObject("srcResource", srcResource);
		isApplicableMatch.registerObject("trgResource", trgResource);
		isApplicableMatch.registerObject("meter", meter);
		isApplicableMatch.registerObject("srcLocation", srcLocation);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject srcTerminal, EObject resourceToTResource,
			EObject pair, EObject srcResource, EObject trgResource, EObject meter, EObject srcLocation,
			EObject trgTerminal, EObject terminalToTerminal) {
		ruleresult.registerObject("srcTerminal", srcTerminal);
		ruleresult.registerObject("resourceToTResource", resourceToTResource);
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("srcResource", srcResource);
		ruleresult.registerObject("trgResource", trgResource);
		ruleresult.registerObject("meter", meter);
		ruleresult.registerObject("srcLocation", srcLocation);
		ruleresult.registerObject("trgTerminal", trgTerminal);
		ruleresult.registerObject("terminalToTerminal", terminalToTerminal);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("srcTerminal").eClass())
				.equals("gluemodel.CIM.IEC61970.Core.Terminal.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_25(EMoflonEdge _edge_Terminals) {
		// prepare return value
		Object[] result1_bindingAndBlack = TerminalImpl
				.pattern_Terminal_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TerminalImpl.pattern_Terminal_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : TerminalImpl
				.pattern_Terminal_10_2_testcorematchandDECs_blackFFFFFB(_edge_Terminals)) {
			gluemodel.CIM.IEC61970.Core.Terminal srcTerminal = (gluemodel.CIM.IEC61970.Core.Terminal) result2_black[0];
			MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result2_black[1];
			ConductingEquipment srcResource = (ConductingEquipment) result2_black[2];
			MeterAsset meter = (MeterAsset) result2_black[3];
			Location srcLocation = (Location) result2_black[4];
			Object[] result2_green = TerminalImpl.pattern_Terminal_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (TerminalImpl.pattern_Terminal_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
					match, srcTerminal, pair, srcResource, meter, srcLocation)) {
				// Ensure that the correct types of elements are matched
				if (TerminalImpl.pattern_Terminal_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
						match)) {

					// Add match to rule result
					Object[] result5_black = TerminalImpl.pattern_Terminal_10_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					TerminalImpl.pattern_Terminal_10_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TerminalImpl.pattern_Terminal_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Terminal");
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
	public boolean checkDEC_FWD(gluemodel.CIM.IEC61970.Core.Terminal srcTerminal, MeterAssetMMXUPair pair,
			ConductingEquipment srcResource, MeterAsset meter, Location srcLocation) {// match tgg pattern
		Object[] result1_black = TerminalImpl.pattern_Terminal_13_1_matchtggpattern_blackBBBBB(srcTerminal, pair,
				srcResource, meter, srcLocation);
		if (result1_black != null) {
			return TerminalImpl.pattern_Terminal_13_2_expressionF();
		} else {
			return TerminalImpl.pattern_Terminal_13_3_expressionF();
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
		case RulesPackage.TERMINAL___IS_APPROPRIATE_FWD__MATCH_TERMINAL_METERASSETMMXUPAIR_CONDUCTINGEQUIPMENT_METERASSET_LOCATION:
			return isAppropriate_FWD((Match) arguments.get(0), (gluemodel.CIM.IEC61970.Core.Terminal) arguments.get(1),
					(MeterAssetMMXUPair) arguments.get(2), (ConductingEquipment) arguments.get(3),
					(MeterAsset) arguments.get(4), (Location) arguments.get(5));
		case RulesPackage.TERMINAL___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TERMINAL___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TERMINAL___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TERMINAL_METERASSETMMXUPAIR_CONDUCTINGEQUIPMENT_METERASSET_LOCATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(gluemodel.CIM.IEC61970.Core.Terminal) arguments.get(1), (MeterAssetMMXUPair) arguments.get(2),
					(ConductingEquipment) arguments.get(3), (MeterAsset) arguments.get(4), (Location) arguments.get(5));
			return null;
		case RulesPackage.TERMINAL___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TERMINAL_METERASSETMMXUPAIR_CONDUCTINGEQUIPMENT_METERASSET_LOCATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(gluemodel.CIM.IEC61970.Core.Terminal) arguments.get(1), (MeterAssetMMXUPair) arguments.get(2),
					(ConductingEquipment) arguments.get(3), (MeterAsset) arguments.get(4), (Location) arguments.get(5));
		case RulesPackage.TERMINAL___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TERMINAL___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TERMINAL_POWERSYSTEMRESOURCETOPOWERSYSTEMRESOURCE_METERASSETMMXUPAIR_CONDUCTINGEQUIPMENT_POWERSYSTEMRESOURCE_METERASSET_LOCATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(gluemodel.CIM.IEC61970.Core.Terminal) arguments.get(1),
					(PowerSystemResourceToPowerSystemResource) arguments.get(2), (MeterAssetMMXUPair) arguments.get(3),
					(ConductingEquipment) arguments.get(4), (PowerSystemResource) arguments.get(5),
					(MeterAsset) arguments.get(6), (Location) arguments.get(7));
		case RulesPackage.TERMINAL___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TERMINAL___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.TERMINAL___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TERMINAL___IS_APPROPRIATE_FWD_EMOFLON_EDGE_25__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_25((EMoflonEdge) arguments.get(0));
		case RulesPackage.TERMINAL___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TERMINAL___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.TERMINAL___CHECK_DEC_FWD__TERMINAL_METERASSETMMXUPAIR_CONDUCTINGEQUIPMENT_METERASSET_LOCATION:
			return checkDEC_FWD((gluemodel.CIM.IEC61970.Core.Terminal) arguments.get(0),
					(MeterAssetMMXUPair) arguments.get(1), (ConductingEquipment) arguments.get(2),
					(MeterAsset) arguments.get(3), (Location) arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Terminal_0_1_initialbindings_blackBBBBBBB(Terminal _this, Match match,
			gluemodel.CIM.IEC61970.Core.Terminal srcTerminal, MeterAssetMMXUPair pair, ConductingEquipment srcResource,
			MeterAsset meter, Location srcLocation) {
		return new Object[] { _this, match, srcTerminal, pair, srcResource, meter, srcLocation };
	}

	public static final Object[] pattern_Terminal_0_2_SolveCSP_bindingFBBBBBBB(Terminal _this, Match match,
			gluemodel.CIM.IEC61970.Core.Terminal srcTerminal, MeterAssetMMXUPair pair, ConductingEquipment srcResource,
			MeterAsset meter, Location srcLocation) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcTerminal, pair, srcResource, meter,
				srcLocation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcTerminal, pair, srcResource, meter, srcLocation };
		}
		return null;
	}

	public static final Object[] pattern_Terminal_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Terminal_0_2_SolveCSP_bindingAndBlackFBBBBBBB(Terminal _this, Match match,
			gluemodel.CIM.IEC61970.Core.Terminal srcTerminal, MeterAssetMMXUPair pair, ConductingEquipment srcResource,
			MeterAsset meter, Location srcLocation) {
		Object[] result_pattern_Terminal_0_2_SolveCSP_binding = pattern_Terminal_0_2_SolveCSP_bindingFBBBBBBB(_this,
				match, srcTerminal, pair, srcResource, meter, srcLocation);
		if (result_pattern_Terminal_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Terminal_0_2_SolveCSP_binding[0];

			Object[] result_pattern_Terminal_0_2_SolveCSP_black = pattern_Terminal_0_2_SolveCSP_blackB(csp);
			if (result_pattern_Terminal_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcTerminal, pair, srcResource, meter, srcLocation };
			}
		}
		return null;
	}

	public static final boolean pattern_Terminal_0_3_CheckCSP_expressionFBB(Terminal _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Terminal_0_4_collectelementstobetranslated_blackBBBBBB(Match match,
			gluemodel.CIM.IEC61970.Core.Terminal srcTerminal, MeterAssetMMXUPair pair, ConductingEquipment srcResource,
			MeterAsset meter, Location srcLocation) {
		return new Object[] { match, srcTerminal, pair, srcResource, meter, srcLocation };
	}

	public static final Object[] pattern_Terminal_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			gluemodel.CIM.IEC61970.Core.Terminal srcTerminal, ConductingEquipment srcResource) {
		EMoflonEdge srcResource__srcTerminal____Terminals = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcTerminal__srcResource____ConductingEquipment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(srcTerminal);
		String srcResource__srcTerminal____Terminals_name_prime = "Terminals";
		String srcTerminal__srcResource____ConductingEquipment_name_prime = "ConductingEquipment";
		srcResource__srcTerminal____Terminals.setSrc(srcResource);
		srcResource__srcTerminal____Terminals.setTrg(srcTerminal);
		match.getToBeTranslatedEdges().add(srcResource__srcTerminal____Terminals);
		srcTerminal__srcResource____ConductingEquipment.setSrc(srcTerminal);
		srcTerminal__srcResource____ConductingEquipment.setTrg(srcResource);
		match.getToBeTranslatedEdges().add(srcTerminal__srcResource____ConductingEquipment);
		srcResource__srcTerminal____Terminals.setName(srcResource__srcTerminal____Terminals_name_prime);
		srcTerminal__srcResource____ConductingEquipment
				.setName(srcTerminal__srcResource____ConductingEquipment_name_prime);
		return new Object[] { match, srcTerminal, srcResource, srcResource__srcTerminal____Terminals,
				srcTerminal__srcResource____ConductingEquipment };
	}

	public static final Object[] pattern_Terminal_0_5_collectcontextelements_blackBBBBBB(Match match,
			gluemodel.CIM.IEC61970.Core.Terminal srcTerminal, MeterAssetMMXUPair pair, ConductingEquipment srcResource,
			MeterAsset meter, Location srcLocation) {
		return new Object[] { match, srcTerminal, pair, srcResource, meter, srcLocation };
	}

	public static final Object[] pattern_Terminal_0_5_collectcontextelements_greenBBBBBFFFFF(Match match,
			MeterAssetMMXUPair pair, ConductingEquipment srcResource, MeterAsset meter, Location srcLocation) {
		EMoflonEdge pair__meter____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge meter__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__meter____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__srcResource____PowerSystemResources = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcResource__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(pair);
		match.getContextNodes().add(srcResource);
		match.getContextNodes().add(meter);
		match.getContextNodes().add(srcLocation);
		String pair__meter____a_name_prime = "a";
		String meter__srcLocation____Location_name_prime = "Location";
		String srcLocation__meter____Assets_name_prime = "Assets";
		String srcLocation__srcResource____PowerSystemResources_name_prime = "PowerSystemResources";
		String srcResource__srcLocation____Location_name_prime = "Location";
		pair__meter____a.setSrc(pair);
		pair__meter____a.setTrg(meter);
		match.getContextEdges().add(pair__meter____a);
		meter__srcLocation____Location.setSrc(meter);
		meter__srcLocation____Location.setTrg(srcLocation);
		match.getContextEdges().add(meter__srcLocation____Location);
		srcLocation__meter____Assets.setSrc(srcLocation);
		srcLocation__meter____Assets.setTrg(meter);
		match.getContextEdges().add(srcLocation__meter____Assets);
		srcLocation__srcResource____PowerSystemResources.setSrc(srcLocation);
		srcLocation__srcResource____PowerSystemResources.setTrg(srcResource);
		match.getContextEdges().add(srcLocation__srcResource____PowerSystemResources);
		srcResource__srcLocation____Location.setSrc(srcResource);
		srcResource__srcLocation____Location.setTrg(srcLocation);
		match.getContextEdges().add(srcResource__srcLocation____Location);
		pair__meter____a.setName(pair__meter____a_name_prime);
		meter__srcLocation____Location.setName(meter__srcLocation____Location_name_prime);
		srcLocation__meter____Assets.setName(srcLocation__meter____Assets_name_prime);
		srcLocation__srcResource____PowerSystemResources
				.setName(srcLocation__srcResource____PowerSystemResources_name_prime);
		srcResource__srcLocation____Location.setName(srcResource__srcLocation____Location_name_prime);
		return new Object[] { match, pair, srcResource, meter, srcLocation, pair__meter____a,
				meter__srcLocation____Location, srcLocation__meter____Assets,
				srcLocation__srcResource____PowerSystemResources, srcResource__srcLocation____Location };
	}

	public static final void pattern_Terminal_0_6_registerobjectstomatch_expressionBBBBBBB(Terminal _this, Match match,
			gluemodel.CIM.IEC61970.Core.Terminal srcTerminal, MeterAssetMMXUPair pair, ConductingEquipment srcResource,
			MeterAsset meter, Location srcLocation) {
		_this.registerObjectsToMatch_FWD(match, srcTerminal, pair, srcResource, meter, srcLocation);

	}

	public static final boolean pattern_Terminal_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Terminal_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Terminal_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("srcTerminal");
		EObject _localVariable_1 = isApplicableMatch.getObject("resourceToTResource");
		EObject _localVariable_2 = isApplicableMatch.getObject("pair");
		EObject _localVariable_3 = isApplicableMatch.getObject("srcResource");
		EObject _localVariable_4 = isApplicableMatch.getObject("trgResource");
		EObject _localVariable_5 = isApplicableMatch.getObject("meter");
		EObject _localVariable_6 = isApplicableMatch.getObject("srcLocation");
		EObject tmpSrcTerminal = _localVariable_0;
		EObject tmpResourceToTResource = _localVariable_1;
		EObject tmpPair = _localVariable_2;
		EObject tmpSrcResource = _localVariable_3;
		EObject tmpTrgResource = _localVariable_4;
		EObject tmpMeter = _localVariable_5;
		EObject tmpSrcLocation = _localVariable_6;
		if (tmpSrcTerminal instanceof gluemodel.CIM.IEC61970.Core.Terminal) {
			gluemodel.CIM.IEC61970.Core.Terminal srcTerminal = (gluemodel.CIM.IEC61970.Core.Terminal) tmpSrcTerminal;
			if (tmpResourceToTResource instanceof PowerSystemResourceToPowerSystemResource) {
				PowerSystemResourceToPowerSystemResource resourceToTResource = (PowerSystemResourceToPowerSystemResource) tmpResourceToTResource;
				if (tmpPair instanceof MeterAssetMMXUPair) {
					MeterAssetMMXUPair pair = (MeterAssetMMXUPair) tmpPair;
					if (tmpSrcResource instanceof ConductingEquipment) {
						ConductingEquipment srcResource = (ConductingEquipment) tmpSrcResource;
						if (tmpTrgResource instanceof PowerSystemResource) {
							PowerSystemResource trgResource = (PowerSystemResource) tmpTrgResource;
							if (tmpMeter instanceof MeterAsset) {
								MeterAsset meter = (MeterAsset) tmpMeter;
								if (tmpSrcLocation instanceof Location) {
									Location srcLocation = (Location) tmpSrcLocation;
									return new Object[] { srcTerminal, resourceToTResource, pair, srcResource,
											trgResource, meter, srcLocation, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Terminal_1_1_performtransformation_blackBBBBBBBFBB(
			gluemodel.CIM.IEC61970.Core.Terminal srcTerminal,
			PowerSystemResourceToPowerSystemResource resourceToTResource, MeterAssetMMXUPair pair,
			ConductingEquipment srcResource, PowerSystemResource trgResource, MeterAsset meter, Location srcLocation,
			Terminal _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { srcTerminal, resourceToTResource, pair, srcResource, trgResource, meter,
						srcLocation, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Terminal_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(Terminal _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Terminal_1_1_performtransformation_binding = pattern_Terminal_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_Terminal_1_1_performtransformation_binding != null) {
			gluemodel.CIM.IEC61970.Core.Terminal srcTerminal = (gluemodel.CIM.IEC61970.Core.Terminal) result_pattern_Terminal_1_1_performtransformation_binding[0];
			PowerSystemResourceToPowerSystemResource resourceToTResource = (PowerSystemResourceToPowerSystemResource) result_pattern_Terminal_1_1_performtransformation_binding[1];
			MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result_pattern_Terminal_1_1_performtransformation_binding[2];
			ConductingEquipment srcResource = (ConductingEquipment) result_pattern_Terminal_1_1_performtransformation_binding[3];
			PowerSystemResource trgResource = (PowerSystemResource) result_pattern_Terminal_1_1_performtransformation_binding[4];
			MeterAsset meter = (MeterAsset) result_pattern_Terminal_1_1_performtransformation_binding[5];
			Location srcLocation = (Location) result_pattern_Terminal_1_1_performtransformation_binding[6];

			Object[] result_pattern_Terminal_1_1_performtransformation_black = pattern_Terminal_1_1_performtransformation_blackBBBBBBBFBB(
					srcTerminal, resourceToTResource, pair, srcResource, trgResource, meter, srcLocation, _this,
					isApplicableMatch);
			if (result_pattern_Terminal_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Terminal_1_1_performtransformation_black[7];

				return new Object[] { srcTerminal, resourceToTResource, pair, srcResource, trgResource, meter,
						srcLocation, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Terminal_1_1_performtransformation_greenBFF(
			gluemodel.CIM.IEC61970.Core.Terminal srcTerminal) {
		outagePreventionJointarget.Terminal trgTerminal = OutagePreventionJointargetFactory.eINSTANCE.createTerminal();
		TerminalToTerminal terminalToTerminal = Task2Factory.eINSTANCE.createTerminalToTerminal();
		terminalToTerminal.setTarget(trgTerminal);
		terminalToTerminal.setSource(srcTerminal);
		return new Object[] { srcTerminal, trgTerminal, terminalToTerminal };
	}

	public static final Object[] pattern_Terminal_1_2_collecttranslatedelements_blackBBB(
			gluemodel.CIM.IEC61970.Core.Terminal srcTerminal, outagePreventionJointarget.Terminal trgTerminal,
			TerminalToTerminal terminalToTerminal) {
		return new Object[] { srcTerminal, trgTerminal, terminalToTerminal };
	}

	public static final Object[] pattern_Terminal_1_2_collecttranslatedelements_greenFBBB(
			gluemodel.CIM.IEC61970.Core.Terminal srcTerminal, outagePreventionJointarget.Terminal trgTerminal,
			TerminalToTerminal terminalToTerminal) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(srcTerminal);
		ruleresult.getCreatedElements().add(trgTerminal);
		ruleresult.getCreatedLinkElements().add(terminalToTerminal);
		return new Object[] { ruleresult, srcTerminal, trgTerminal, terminalToTerminal };
	}

	public static final Object[] pattern_Terminal_1_3_bookkeepingforedges_blackBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject srcTerminal, EObject resourceToTResource, EObject pair, EObject srcResource, EObject trgResource,
			EObject meter, EObject srcLocation, EObject trgTerminal, EObject terminalToTerminal) {
		if (!srcTerminal.equals(trgResource)) {
			if (!srcTerminal.equals(trgTerminal)) {
				if (!srcTerminal.equals(terminalToTerminal)) {
					if (!resourceToTResource.equals(srcTerminal)) {
						if (!resourceToTResource.equals(srcResource)) {
							if (!resourceToTResource.equals(trgResource)) {
								if (!resourceToTResource.equals(srcLocation)) {
									if (!resourceToTResource.equals(trgTerminal)) {
										if (!resourceToTResource.equals(terminalToTerminal)) {
											if (!pair.equals(srcTerminal)) {
												if (!pair.equals(resourceToTResource)) {
													if (!pair.equals(srcResource)) {
														if (!pair.equals(trgResource)) {
															if (!pair.equals(srcLocation)) {
																if (!pair.equals(trgTerminal)) {
																	if (!pair.equals(terminalToTerminal)) {
																		if (!srcResource.equals(srcTerminal)) {
																			if (!srcResource.equals(trgResource)) {
																				if (!srcResource.equals(trgTerminal)) {
																					if (!srcResource.equals(
																							terminalToTerminal)) {
																						if (!trgResource
																								.equals(trgTerminal)) {
																							if (!meter.equals(
																									srcTerminal)) {
																								if (!meter.equals(
																										resourceToTResource)) {
																									if (!meter.equals(
																											pair)) {
																										if (!meter
																												.equals(srcResource)) {
																											if (!meter
																													.equals(trgResource)) {
																												if (!meter
																														.equals(srcLocation)) {
																													if (!meter
																															.equals(trgTerminal)) {
																														if (!meter
																																.equals(terminalToTerminal)) {
																															if (!srcLocation
																																	.equals(srcTerminal)) {
																																if (!srcLocation
																																		.equals(srcResource)) {
																																	if (!srcLocation
																																			.equals(trgResource)) {
																																		if (!srcLocation
																																				.equals(trgTerminal)) {
																																			if (!srcLocation
																																					.equals(terminalToTerminal)) {
																																				if (!terminalToTerminal
																																						.equals(trgResource)) {
																																					if (!terminalToTerminal
																																							.equals(trgTerminal)) {
																																						return new Object[] {
																																								ruleresult,
																																								srcTerminal,
																																								resourceToTResource,
																																								pair,
																																								srcResource,
																																								trgResource,
																																								meter,
																																								srcLocation,
																																								trgTerminal,
																																								terminalToTerminal };
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

	public static final Object[] pattern_Terminal_1_3_bookkeepingforedges_greenBBBBBFFFF(PerformRuleResult ruleresult,
			EObject srcTerminal, EObject srcResource, EObject trgTerminal, EObject terminalToTerminal) {
		EMoflonEdge srcResource__srcTerminal____Terminals = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcTerminal__srcResource____ConductingEquipment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge terminalToTerminal__trgTerminal____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge terminalToTerminal__srcTerminal____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Terminal";
		String srcResource__srcTerminal____Terminals_name_prime = "Terminals";
		String srcTerminal__srcResource____ConductingEquipment_name_prime = "ConductingEquipment";
		String terminalToTerminal__trgTerminal____target_name_prime = "target";
		String terminalToTerminal__srcTerminal____source_name_prime = "source";
		srcResource__srcTerminal____Terminals.setSrc(srcResource);
		srcResource__srcTerminal____Terminals.setTrg(srcTerminal);
		ruleresult.getTranslatedEdges().add(srcResource__srcTerminal____Terminals);
		srcTerminal__srcResource____ConductingEquipment.setSrc(srcTerminal);
		srcTerminal__srcResource____ConductingEquipment.setTrg(srcResource);
		ruleresult.getTranslatedEdges().add(srcTerminal__srcResource____ConductingEquipment);
		terminalToTerminal__trgTerminal____target.setSrc(terminalToTerminal);
		terminalToTerminal__trgTerminal____target.setTrg(trgTerminal);
		ruleresult.getCreatedEdges().add(terminalToTerminal__trgTerminal____target);
		terminalToTerminal__srcTerminal____source.setSrc(terminalToTerminal);
		terminalToTerminal__srcTerminal____source.setTrg(srcTerminal);
		ruleresult.getCreatedEdges().add(terminalToTerminal__srcTerminal____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		srcResource__srcTerminal____Terminals.setName(srcResource__srcTerminal____Terminals_name_prime);
		srcTerminal__srcResource____ConductingEquipment
				.setName(srcTerminal__srcResource____ConductingEquipment_name_prime);
		terminalToTerminal__trgTerminal____target.setName(terminalToTerminal__trgTerminal____target_name_prime);
		terminalToTerminal__srcTerminal____source.setName(terminalToTerminal__srcTerminal____source_name_prime);
		return new Object[] { ruleresult, srcTerminal, srcResource, trgTerminal, terminalToTerminal,
				srcResource__srcTerminal____Terminals, srcTerminal__srcResource____ConductingEquipment,
				terminalToTerminal__trgTerminal____target, terminalToTerminal__srcTerminal____source };
	}

	public static final void pattern_Terminal_1_5_registerobjects_expressionBBBBBBBBBBB(Terminal _this,
			PerformRuleResult ruleresult, EObject srcTerminal, EObject resourceToTResource, EObject pair,
			EObject srcResource, EObject trgResource, EObject meter, EObject srcLocation, EObject trgTerminal,
			EObject terminalToTerminal) {
		_this.registerObjects_FWD(ruleresult, srcTerminal, resourceToTResource, pair, srcResource, trgResource, meter,
				srcLocation, trgTerminal, terminalToTerminal);

	}

	public static final PerformRuleResult pattern_Terminal_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Terminal_2_1_preparereturnvalue_bindingFB(Terminal _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Terminal_2_1_preparereturnvalue_blackFBB(EClass eClass, Terminal _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Terminal_2_1_preparereturnvalue_bindingAndBlackFFB(Terminal _this) {
		Object[] result_pattern_Terminal_2_1_preparereturnvalue_binding = pattern_Terminal_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Terminal_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_Terminal_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Terminal_2_1_preparereturnvalue_black = pattern_Terminal_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_Terminal_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Terminal_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Terminal_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "Terminal";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Terminal_2_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("srcTerminal");
		EObject _localVariable_1 = match.getObject("pair");
		EObject _localVariable_2 = match.getObject("srcResource");
		EObject _localVariable_3 = match.getObject("meter");
		EObject _localVariable_4 = match.getObject("srcLocation");
		EObject tmpSrcTerminal = _localVariable_0;
		EObject tmpPair = _localVariable_1;
		EObject tmpSrcResource = _localVariable_2;
		EObject tmpMeter = _localVariable_3;
		EObject tmpSrcLocation = _localVariable_4;
		if (tmpSrcTerminal instanceof gluemodel.CIM.IEC61970.Core.Terminal) {
			gluemodel.CIM.IEC61970.Core.Terminal srcTerminal = (gluemodel.CIM.IEC61970.Core.Terminal) tmpSrcTerminal;
			if (tmpPair instanceof MeterAssetMMXUPair) {
				MeterAssetMMXUPair pair = (MeterAssetMMXUPair) tmpPair;
				if (tmpSrcResource instanceof ConductingEquipment) {
					ConductingEquipment srcResource = (ConductingEquipment) tmpSrcResource;
					if (tmpMeter instanceof MeterAsset) {
						MeterAsset meter = (MeterAsset) tmpMeter;
						if (tmpSrcLocation instanceof Location) {
							Location srcLocation = (Location) tmpSrcLocation;
							return new Object[] { srcTerminal, pair, srcResource, meter, srcLocation, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Terminal_2_2_corematch_blackBFBBFBBB(
			gluemodel.CIM.IEC61970.Core.Terminal srcTerminal, MeterAssetMMXUPair pair, ConductingEquipment srcResource,
			MeterAsset meter, Location srcLocation, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (PowerSystemResourceToPowerSystemResource resourceToTResource : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcResource, PowerSystemResourceToPowerSystemResource.class, "source")) {
			PowerSystemResource trgResource = resourceToTResource.getTarget();
			if (trgResource != null) {
				_result.add(new Object[] { srcTerminal, resourceToTResource, pair, srcResource, trgResource, meter,
						srcLocation, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Terminal_2_3_findcontext_blackBBBBBBB(
			gluemodel.CIM.IEC61970.Core.Terminal srcTerminal,
			PowerSystemResourceToPowerSystemResource resourceToTResource, MeterAssetMMXUPair pair,
			ConductingEquipment srcResource, PowerSystemResource trgResource, MeterAsset meter, Location srcLocation) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (meter.equals(pair.getA())) {
			if (srcResource.equals(resourceToTResource.getSource())) {
				if (srcLocation.equals(meter.getLocation())) {
					if (srcResource.getTerminals().contains(srcTerminal)) {
						if (trgResource.equals(resourceToTResource.getTarget())) {
							if (srcLocation.getPowerSystemResources().contains(srcResource)) {
								_result.add(new Object[] { srcTerminal, resourceToTResource, pair, srcResource,
										trgResource, meter, srcLocation });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Terminal_2_3_findcontext_greenBBBBBBBFFFFFFFFFF(
			gluemodel.CIM.IEC61970.Core.Terminal srcTerminal,
			PowerSystemResourceToPowerSystemResource resourceToTResource, MeterAssetMMXUPair pair,
			ConductingEquipment srcResource, PowerSystemResource trgResource, MeterAsset meter, Location srcLocation) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pair__meter____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge resourceToTResource__srcResource____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge meter__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__meter____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcResource__srcTerminal____Terminals = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcTerminal__srcResource____ConductingEquipment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge resourceToTResource__trgResource____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__srcResource____PowerSystemResources = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcResource__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pair__meter____a_name_prime = "a";
		String resourceToTResource__srcResource____source_name_prime = "source";
		String meter__srcLocation____Location_name_prime = "Location";
		String srcLocation__meter____Assets_name_prime = "Assets";
		String srcResource__srcTerminal____Terminals_name_prime = "Terminals";
		String srcTerminal__srcResource____ConductingEquipment_name_prime = "ConductingEquipment";
		String resourceToTResource__trgResource____target_name_prime = "target";
		String srcLocation__srcResource____PowerSystemResources_name_prime = "PowerSystemResources";
		String srcResource__srcLocation____Location_name_prime = "Location";
		isApplicableMatch.getAllContextElements().add(srcTerminal);
		isApplicableMatch.getAllContextElements().add(resourceToTResource);
		isApplicableMatch.getAllContextElements().add(pair);
		isApplicableMatch.getAllContextElements().add(srcResource);
		isApplicableMatch.getAllContextElements().add(trgResource);
		isApplicableMatch.getAllContextElements().add(meter);
		isApplicableMatch.getAllContextElements().add(srcLocation);
		pair__meter____a.setSrc(pair);
		pair__meter____a.setTrg(meter);
		isApplicableMatch.getAllContextElements().add(pair__meter____a);
		resourceToTResource__srcResource____source.setSrc(resourceToTResource);
		resourceToTResource__srcResource____source.setTrg(srcResource);
		isApplicableMatch.getAllContextElements().add(resourceToTResource__srcResource____source);
		meter__srcLocation____Location.setSrc(meter);
		meter__srcLocation____Location.setTrg(srcLocation);
		isApplicableMatch.getAllContextElements().add(meter__srcLocation____Location);
		srcLocation__meter____Assets.setSrc(srcLocation);
		srcLocation__meter____Assets.setTrg(meter);
		isApplicableMatch.getAllContextElements().add(srcLocation__meter____Assets);
		srcResource__srcTerminal____Terminals.setSrc(srcResource);
		srcResource__srcTerminal____Terminals.setTrg(srcTerminal);
		isApplicableMatch.getAllContextElements().add(srcResource__srcTerminal____Terminals);
		srcTerminal__srcResource____ConductingEquipment.setSrc(srcTerminal);
		srcTerminal__srcResource____ConductingEquipment.setTrg(srcResource);
		isApplicableMatch.getAllContextElements().add(srcTerminal__srcResource____ConductingEquipment);
		resourceToTResource__trgResource____target.setSrc(resourceToTResource);
		resourceToTResource__trgResource____target.setTrg(trgResource);
		isApplicableMatch.getAllContextElements().add(resourceToTResource__trgResource____target);
		srcLocation__srcResource____PowerSystemResources.setSrc(srcLocation);
		srcLocation__srcResource____PowerSystemResources.setTrg(srcResource);
		isApplicableMatch.getAllContextElements().add(srcLocation__srcResource____PowerSystemResources);
		srcResource__srcLocation____Location.setSrc(srcResource);
		srcResource__srcLocation____Location.setTrg(srcLocation);
		isApplicableMatch.getAllContextElements().add(srcResource__srcLocation____Location);
		pair__meter____a.setName(pair__meter____a_name_prime);
		resourceToTResource__srcResource____source.setName(resourceToTResource__srcResource____source_name_prime);
		meter__srcLocation____Location.setName(meter__srcLocation____Location_name_prime);
		srcLocation__meter____Assets.setName(srcLocation__meter____Assets_name_prime);
		srcResource__srcTerminal____Terminals.setName(srcResource__srcTerminal____Terminals_name_prime);
		srcTerminal__srcResource____ConductingEquipment
				.setName(srcTerminal__srcResource____ConductingEquipment_name_prime);
		resourceToTResource__trgResource____target.setName(resourceToTResource__trgResource____target_name_prime);
		srcLocation__srcResource____PowerSystemResources
				.setName(srcLocation__srcResource____PowerSystemResources_name_prime);
		srcResource__srcLocation____Location.setName(srcResource__srcLocation____Location_name_prime);
		return new Object[] { srcTerminal, resourceToTResource, pair, srcResource, trgResource, meter, srcLocation,
				isApplicableMatch, pair__meter____a, resourceToTResource__srcResource____source,
				meter__srcLocation____Location, srcLocation__meter____Assets, srcResource__srcTerminal____Terminals,
				srcTerminal__srcResource____ConductingEquipment, resourceToTResource__trgResource____target,
				srcLocation__srcResource____PowerSystemResources, srcResource__srcLocation____Location };
	}

	public static final Object[] pattern_Terminal_2_4_solveCSP_bindingFBBBBBBBBB(Terminal _this,
			IsApplicableMatch isApplicableMatch, gluemodel.CIM.IEC61970.Core.Terminal srcTerminal,
			PowerSystemResourceToPowerSystemResource resourceToTResource, MeterAssetMMXUPair pair,
			ConductingEquipment srcResource, PowerSystemResource trgResource, MeterAsset meter, Location srcLocation) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, srcTerminal, resourceToTResource,
				pair, srcResource, trgResource, meter, srcLocation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, srcTerminal, resourceToTResource, pair, srcResource,
					trgResource, meter, srcLocation };
		}
		return null;
	}

	public static final Object[] pattern_Terminal_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Terminal_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(Terminal _this,
			IsApplicableMatch isApplicableMatch, gluemodel.CIM.IEC61970.Core.Terminal srcTerminal,
			PowerSystemResourceToPowerSystemResource resourceToTResource, MeterAssetMMXUPair pair,
			ConductingEquipment srcResource, PowerSystemResource trgResource, MeterAsset meter, Location srcLocation) {
		Object[] result_pattern_Terminal_2_4_solveCSP_binding = pattern_Terminal_2_4_solveCSP_bindingFBBBBBBBBB(_this,
				isApplicableMatch, srcTerminal, resourceToTResource, pair, srcResource, trgResource, meter,
				srcLocation);
		if (result_pattern_Terminal_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Terminal_2_4_solveCSP_binding[0];

			Object[] result_pattern_Terminal_2_4_solveCSP_black = pattern_Terminal_2_4_solveCSP_blackB(csp);
			if (result_pattern_Terminal_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, srcTerminal, resourceToTResource, pair,
						srcResource, trgResource, meter, srcLocation };
			}
		}
		return null;
	}

	public static final boolean pattern_Terminal_2_5_checkCSP_expressionFBB(Terminal _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Terminal_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Terminal_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Terminal";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Terminal_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Terminal_10_1_preparereturnvalue_bindingFB(Terminal _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Terminal_10_1_preparereturnvalue_blackFBBF(EClass __eClass, Terminal _this) {
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

	public static final Object[] pattern_Terminal_10_1_preparereturnvalue_bindingAndBlackFFBF(Terminal _this) {
		Object[] result_pattern_Terminal_10_1_preparereturnvalue_binding = pattern_Terminal_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Terminal_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_Terminal_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Terminal_10_1_preparereturnvalue_black = pattern_Terminal_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_Terminal_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Terminal_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_Terminal_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_Terminal_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Terminal_10_2_testcorematchandDECs_black_nac_0BB(
			gluemodel.CIM.IEC61970.Core.Terminal srcTerminal, ConductingEquipment srcResource) {
		ConductingEquipment __DEC_srcTerminal_Terminals_45757 = srcTerminal.getConductingEquipment();
		if (__DEC_srcTerminal_Terminals_45757 != null) {
			if (!srcResource.equals(__DEC_srcTerminal_Terminals_45757)) {
				return new Object[] { srcTerminal, srcResource };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_Terminal_10_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_Terminals) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcResource = _edge_Terminals.getSrc();
		if (tmpSrcResource instanceof ConductingEquipment) {
			ConductingEquipment srcResource = (ConductingEquipment) tmpSrcResource;
			EObject tmpSrcTerminal = _edge_Terminals.getTrg();
			if (tmpSrcTerminal instanceof gluemodel.CIM.IEC61970.Core.Terminal) {
				gluemodel.CIM.IEC61970.Core.Terminal srcTerminal = (gluemodel.CIM.IEC61970.Core.Terminal) tmpSrcTerminal;
				if (srcResource.getTerminals().contains(srcTerminal)) {
					Location srcLocation = srcResource.getLocation();
					if (srcLocation != null) {
						if (pattern_Terminal_10_2_testcorematchandDECs_black_nac_0BB(srcTerminal,
								srcResource) == null) {
							for (Asset tmpMeter : srcLocation.getAssets()) {
								if (tmpMeter instanceof MeterAsset) {
									MeterAsset meter = (MeterAsset) tmpMeter;
									for (MeterAssetMMXUPair pair : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(meter, MeterAssetMMXUPair.class, "a")) {
										_result.add(new Object[] { srcTerminal, pair, srcResource, meter, srcLocation,
												_edge_Terminals });
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

	public static final Object[] pattern_Terminal_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Terminal_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			Terminal _this, Match match, gluemodel.CIM.IEC61970.Core.Terminal srcTerminal, MeterAssetMMXUPair pair,
			ConductingEquipment srcResource, MeterAsset meter, Location srcLocation) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcTerminal, pair, srcResource, meter, srcLocation);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Terminal_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			Terminal _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Terminal_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_Terminal_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_Terminal_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Terminal_13_1_matchtggpattern_black_nac_0BB(
			gluemodel.CIM.IEC61970.Core.Terminal srcTerminal, ConductingEquipment srcResource) {
		ConductingEquipment __DEC_srcTerminal_Terminals_882695 = srcTerminal.getConductingEquipment();
		if (__DEC_srcTerminal_Terminals_882695 != null) {
			if (!srcResource.equals(__DEC_srcTerminal_Terminals_882695)) {
				return new Object[] { srcTerminal, srcResource };
			}
		}

		return null;
	}

	public static final Object[] pattern_Terminal_13_1_matchtggpattern_blackBBBBB(
			gluemodel.CIM.IEC61970.Core.Terminal srcTerminal, MeterAssetMMXUPair pair, ConductingEquipment srcResource,
			MeterAsset meter, Location srcLocation) {
		if (meter.equals(pair.getA())) {
			if (srcLocation.equals(meter.getLocation())) {
				if (srcResource.getTerminals().contains(srcTerminal)) {
					if (srcLocation.getPowerSystemResources().contains(srcResource)) {
						if (pattern_Terminal_13_1_matchtggpattern_black_nac_0BB(srcTerminal, srcResource) == null) {
							return new Object[] { srcTerminal, pair, srcResource, meter, srcLocation };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_Terminal_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Terminal_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TerminalImpl
