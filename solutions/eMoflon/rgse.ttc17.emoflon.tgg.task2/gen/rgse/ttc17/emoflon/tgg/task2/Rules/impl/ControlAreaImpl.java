/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules.impl;

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

import rgse.ttc17.emoflon.tgg.task2.ControlAreaToControlSrea;

import rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea;
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
 * An implementation of the model object '<em><b>Control Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ControlAreaImpl extends AbstractRuleImpl implements ControlArea {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getControlArea();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea) {
		// initial bindings
		Object[] result1_black = ControlAreaImpl.pattern_ControlArea_0_1_initialbindings_blackBBB(this, match,
				srcControlArea);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[srcControlArea] = " + srcControlArea + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ControlAreaImpl.pattern_ControlArea_0_2_SolveCSP_bindingAndBlackFBBB(this,
				match, srcControlArea);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[srcControlArea] = " + srcControlArea + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ControlAreaImpl.pattern_ControlArea_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ControlAreaImpl
					.pattern_ControlArea_0_4_collectelementstobetranslated_blackBB(match, srcControlArea);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[srcControlArea] = " + srcControlArea + ".");
			}
			ControlAreaImpl.pattern_ControlArea_0_4_collectelementstobetranslated_greenBB(match, srcControlArea);

			// collect context elements
			Object[] result5_black = ControlAreaImpl.pattern_ControlArea_0_5_collectcontextelements_blackBB(match,
					srcControlArea);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[srcControlArea] = " + srcControlArea + ".");
			}
			// register objects to match
			ControlAreaImpl.pattern_ControlArea_0_6_registerobjectstomatch_expressionBBB(this, match, srcControlArea);
			return ControlAreaImpl.pattern_ControlArea_0_7_expressionF();
		} else {
			return ControlAreaImpl.pattern_ControlArea_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ControlAreaImpl
				.pattern_ControlArea_1_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea = (gluemodel.CIM.IEC61970.ControlArea.ControlArea) result1_bindingAndBlack[0];
		CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = ControlAreaImpl.pattern_ControlArea_1_1_performtransformation_greenBFFB(srcControlArea,
				csp);
		ControlAreaToControlSrea controlAreaToControlArea = (ControlAreaToControlSrea) result1_green[1];
		outagePreventionJointarget.ControlArea trgControlArea = (outagePreventionJointarget.ControlArea) result1_green[2];

		// collect translated elements
		Object[] result2_black = ControlAreaImpl.pattern_ControlArea_1_2_collecttranslatedelements_blackBBB(
				srcControlArea, controlAreaToControlArea, trgControlArea);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[srcControlArea] = " + srcControlArea + ", " + "[controlAreaToControlArea] = "
					+ controlAreaToControlArea + ", " + "[trgControlArea] = " + trgControlArea + ".");
		}
		Object[] result2_green = ControlAreaImpl.pattern_ControlArea_1_2_collecttranslatedelements_greenFBBB(
				srcControlArea, controlAreaToControlArea, trgControlArea);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ControlAreaImpl.pattern_ControlArea_1_3_bookkeepingforedges_blackBBBB(ruleresult,
				srcControlArea, controlAreaToControlArea, trgControlArea);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[srcControlArea] = " + srcControlArea + ", "
					+ "[controlAreaToControlArea] = " + controlAreaToControlArea + ", " + "[trgControlArea] = "
					+ trgControlArea + ".");
		}
		ControlAreaImpl.pattern_ControlArea_1_3_bookkeepingforedges_greenBBBBFF(ruleresult, srcControlArea,
				controlAreaToControlArea, trgControlArea);
		// EMoflonEdge controlAreaToControlArea__srcControlArea____source = (EMoflonEdge) result3_green[4];
		// EMoflonEdge controlAreaToControlArea__trgControlArea____target = (EMoflonEdge) result3_green[5];

		// perform postprocessing story node is empty
		// register objects
		ControlAreaImpl.pattern_ControlArea_1_5_registerobjects_expressionBBBBB(this, ruleresult, srcControlArea,
				controlAreaToControlArea, trgControlArea);
		return ControlAreaImpl.pattern_ControlArea_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ControlAreaImpl
				.pattern_ControlArea_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ControlAreaImpl.pattern_ControlArea_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ControlAreaImpl.pattern_ControlArea_2_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea = (gluemodel.CIM.IEC61970.ControlArea.ControlArea) result2_binding[0];
		for (Object[] result2_black : ControlAreaImpl.pattern_ControlArea_2_2_corematch_blackBB(srcControlArea,
				match)) {
			// ForEach find context
			for (Object[] result3_black : ControlAreaImpl.pattern_ControlArea_2_3_findcontext_blackB(srcControlArea)) {
				Object[] result3_green = ControlAreaImpl.pattern_ControlArea_2_3_findcontext_greenBF(srcControlArea);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				// solve CSP
				Object[] result4_bindingAndBlack = ControlAreaImpl
						.pattern_ControlArea_2_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, srcControlArea);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[srcControlArea] = " + srcControlArea + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ControlAreaImpl.pattern_ControlArea_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ControlAreaImpl
							.pattern_ControlArea_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ControlAreaImpl.pattern_ControlArea_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ControlAreaImpl.pattern_ControlArea_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea) {
		match.registerObject("srcControlArea", srcControlArea);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea) {// Create CSP
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
			gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_srcControlArea_mRID = CSPFactoryHelper.eINSTANCE.createVariable("srcControlArea.mRID", true, csp);
		var_srcControlArea_mRID.setValue(srcControlArea.getMRID());
		var_srcControlArea_mRID.setType("String");

		// Create unbound variables
		Variable var_trgControlArea_mRID = CSPFactoryHelper.eINSTANCE.createVariable("trgControlArea.mRID", csp);
		var_trgControlArea_mRID.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_srcControlArea_mRID, var_trgControlArea_mRID);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("srcControlArea", srcControlArea);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject srcControlArea,
			EObject controlAreaToControlArea, EObject trgControlArea) {
		ruleresult.registerObject("srcControlArea", srcControlArea);
		ruleresult.registerObject("controlAreaToControlArea", controlAreaToControlArea);
		ruleresult.registerObject("trgControlArea", trgControlArea);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("srcControlArea").eClass())
				.equals("gluemodel.CIM.IEC61970.ControlArea.ControlArea.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_ControlArea_0(
			gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea) {
		// prepare return value
		Object[] result1_bindingAndBlack = ControlAreaImpl
				.pattern_ControlArea_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ControlAreaImpl.pattern_ControlArea_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ControlAreaImpl
				.pattern_ControlArea_10_2_testcorematchandDECs_blackB(srcControlArea)) {
			Object[] result2_green = ControlAreaImpl.pattern_ControlArea_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ControlAreaImpl.pattern_ControlArea_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this,
					match, srcControlArea)) {
				// Ensure that the correct types of elements are matched
				if (ControlAreaImpl
						.pattern_ControlArea_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ControlAreaImpl.pattern_ControlArea_10_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					ControlAreaImpl.pattern_ControlArea_10_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ControlAreaImpl.pattern_ControlArea_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ControlArea");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_srcControlArea_mRID = CSPFactoryHelper.eINSTANCE.createVariable("srcControlArea", true, csp);
		var_srcControlArea_mRID.setValue(__helper.getValue("srcControlArea", "mRID"));
		var_srcControlArea_mRID.setType("String");

		Variable var_trgControlArea_mRID = CSPFactoryHelper.eINSTANCE.createVariable("trgControlArea", true, csp);
		var_trgControlArea_mRID.setValue(__helper.getValue("trgControlArea", "mRID"));
		var_trgControlArea_mRID.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("ControlArea");
		eq0.solve(var_srcControlArea_mRID, var_trgControlArea_mRID);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_trgControlArea_mRID.setBound(false);
			eq0.solve(var_srcControlArea_mRID, var_trgControlArea_mRID);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("trgControlArea", "mRID", var_trgControlArea_mRID.getValue());
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
	public boolean checkDEC_FWD(gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea) {// match tgg pattern
		Object[] result1_black = ControlAreaImpl.pattern_ControlArea_13_1_matchtggpattern_blackB(srcControlArea);
		if (result1_black != null) {
			return ControlAreaImpl.pattern_ControlArea_13_2_expressionF();
		} else {
			return ControlAreaImpl.pattern_ControlArea_13_3_expressionF();
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
		case RulesPackage.CONTROL_AREA___IS_APPROPRIATE_FWD__MATCH_CONTROLAREA:
			return isAppropriate_FWD((Match) arguments.get(0),
					(gluemodel.CIM.IEC61970.ControlArea.ControlArea) arguments.get(1));
		case RulesPackage.CONTROL_AREA___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CONTROL_AREA___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CONTROL_AREA___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CONTROLAREA:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(gluemodel.CIM.IEC61970.ControlArea.ControlArea) arguments.get(1));
			return null;
		case RulesPackage.CONTROL_AREA___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CONTROLAREA:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(gluemodel.CIM.IEC61970.ControlArea.ControlArea) arguments.get(1));
		case RulesPackage.CONTROL_AREA___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CONTROL_AREA___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONTROLAREA:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(gluemodel.CIM.IEC61970.ControlArea.ControlArea) arguments.get(1));
		case RulesPackage.CONTROL_AREA___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CONTROL_AREA___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3));
			return null;
		case RulesPackage.CONTROL_AREA___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CONTROL_AREA___IS_APPROPRIATE_FWD_CONTROL_AREA_0__CONTROLAREA:
			return isAppropriate_FWD_ControlArea_0((gluemodel.CIM.IEC61970.ControlArea.ControlArea) arguments.get(0));
		case RulesPackage.CONTROL_AREA___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CONTROL_AREA___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.CONTROL_AREA___CHECK_DEC_FWD__CONTROLAREA:
			return checkDEC_FWD((gluemodel.CIM.IEC61970.ControlArea.ControlArea) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ControlArea_0_1_initialbindings_blackBBB(ControlArea _this, Match match,
			gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea) {
		return new Object[] { _this, match, srcControlArea };
	}

	public static final Object[] pattern_ControlArea_0_2_SolveCSP_bindingFBBB(ControlArea _this, Match match,
			gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcControlArea);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcControlArea };
		}
		return null;
	}

	public static final Object[] pattern_ControlArea_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ControlArea_0_2_SolveCSP_bindingAndBlackFBBB(ControlArea _this, Match match,
			gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea) {
		Object[] result_pattern_ControlArea_0_2_SolveCSP_binding = pattern_ControlArea_0_2_SolveCSP_bindingFBBB(_this,
				match, srcControlArea);
		if (result_pattern_ControlArea_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ControlArea_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ControlArea_0_2_SolveCSP_black = pattern_ControlArea_0_2_SolveCSP_blackB(csp);
			if (result_pattern_ControlArea_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcControlArea };
			}
		}
		return null;
	}

	public static final boolean pattern_ControlArea_0_3_CheckCSP_expressionFBB(ControlArea _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ControlArea_0_4_collectelementstobetranslated_blackBB(Match match,
			gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea) {
		return new Object[] { match, srcControlArea };
	}

	public static final Object[] pattern_ControlArea_0_4_collectelementstobetranslated_greenBB(Match match,
			gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea) {
		match.getToBeTranslatedNodes().add(srcControlArea);
		return new Object[] { match, srcControlArea };
	}

	public static final Object[] pattern_ControlArea_0_5_collectcontextelements_blackBB(Match match,
			gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea) {
		return new Object[] { match, srcControlArea };
	}

	public static final void pattern_ControlArea_0_6_registerobjectstomatch_expressionBBB(ControlArea _this,
			Match match, gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea) {
		_this.registerObjectsToMatch_FWD(match, srcControlArea);

	}

	public static final boolean pattern_ControlArea_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ControlArea_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ControlArea_1_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("srcControlArea");
		EObject tmpSrcControlArea = _localVariable_0;
		if (tmpSrcControlArea instanceof gluemodel.CIM.IEC61970.ControlArea.ControlArea) {
			gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea = (gluemodel.CIM.IEC61970.ControlArea.ControlArea) tmpSrcControlArea;
			return new Object[] { srcControlArea, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_ControlArea_1_1_performtransformation_blackBFBB(
			gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea, ControlArea _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { srcControlArea, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ControlArea_1_1_performtransformation_bindingAndBlackFFBB(ControlArea _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ControlArea_1_1_performtransformation_binding = pattern_ControlArea_1_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_ControlArea_1_1_performtransformation_binding != null) {
			gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea = (gluemodel.CIM.IEC61970.ControlArea.ControlArea) result_pattern_ControlArea_1_1_performtransformation_binding[0];

			Object[] result_pattern_ControlArea_1_1_performtransformation_black = pattern_ControlArea_1_1_performtransformation_blackBFBB(
					srcControlArea, _this, isApplicableMatch);
			if (result_pattern_ControlArea_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ControlArea_1_1_performtransformation_black[1];

				return new Object[] { srcControlArea, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ControlArea_1_1_performtransformation_greenBFFB(
			gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea, CSP csp) {
		ControlAreaToControlSrea controlAreaToControlArea = Task2Factory.eINSTANCE.createControlAreaToControlSrea();
		outagePreventionJointarget.ControlArea trgControlArea = OutagePreventionJointargetFactory.eINSTANCE
				.createControlArea();
		Object _localVariable_0 = csp.getValue("trgControlArea", "mRID");
		controlAreaToControlArea.setSource(srcControlArea);
		controlAreaToControlArea.setTarget(trgControlArea);
		String trgControlArea_mRID_prime = (String) _localVariable_0;
		trgControlArea.setMRID(trgControlArea_mRID_prime);
		return new Object[] { srcControlArea, controlAreaToControlArea, trgControlArea, csp };
	}

	public static final Object[] pattern_ControlArea_1_2_collecttranslatedelements_blackBBB(
			gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea,
			ControlAreaToControlSrea controlAreaToControlArea, outagePreventionJointarget.ControlArea trgControlArea) {
		return new Object[] { srcControlArea, controlAreaToControlArea, trgControlArea };
	}

	public static final Object[] pattern_ControlArea_1_2_collecttranslatedelements_greenFBBB(
			gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea,
			ControlAreaToControlSrea controlAreaToControlArea, outagePreventionJointarget.ControlArea trgControlArea) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(srcControlArea);
		ruleresult.getCreatedLinkElements().add(controlAreaToControlArea);
		ruleresult.getCreatedElements().add(trgControlArea);
		return new Object[] { ruleresult, srcControlArea, controlAreaToControlArea, trgControlArea };
	}

	public static final Object[] pattern_ControlArea_1_3_bookkeepingforedges_blackBBBB(PerformRuleResult ruleresult,
			EObject srcControlArea, EObject controlAreaToControlArea, EObject trgControlArea) {
		if (!srcControlArea.equals(trgControlArea)) {
			if (!controlAreaToControlArea.equals(srcControlArea)) {
				if (!controlAreaToControlArea.equals(trgControlArea)) {
					return new Object[] { ruleresult, srcControlArea, controlAreaToControlArea, trgControlArea };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ControlArea_1_3_bookkeepingforedges_greenBBBBFF(PerformRuleResult ruleresult,
			EObject srcControlArea, EObject controlAreaToControlArea, EObject trgControlArea) {
		EMoflonEdge controlAreaToControlArea__srcControlArea____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge controlAreaToControlArea__trgControlArea____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ControlArea";
		String controlAreaToControlArea__srcControlArea____source_name_prime = "source";
		String controlAreaToControlArea__trgControlArea____target_name_prime = "target";
		controlAreaToControlArea__srcControlArea____source.setSrc(controlAreaToControlArea);
		controlAreaToControlArea__srcControlArea____source.setTrg(srcControlArea);
		ruleresult.getCreatedEdges().add(controlAreaToControlArea__srcControlArea____source);
		controlAreaToControlArea__trgControlArea____target.setSrc(controlAreaToControlArea);
		controlAreaToControlArea__trgControlArea____target.setTrg(trgControlArea);
		ruleresult.getCreatedEdges().add(controlAreaToControlArea__trgControlArea____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		controlAreaToControlArea__srcControlArea____source
				.setName(controlAreaToControlArea__srcControlArea____source_name_prime);
		controlAreaToControlArea__trgControlArea____target
				.setName(controlAreaToControlArea__trgControlArea____target_name_prime);
		return new Object[] { ruleresult, srcControlArea, controlAreaToControlArea, trgControlArea,
				controlAreaToControlArea__srcControlArea____source,
				controlAreaToControlArea__trgControlArea____target };
	}

	public static final void pattern_ControlArea_1_5_registerobjects_expressionBBBBB(ControlArea _this,
			PerformRuleResult ruleresult, EObject srcControlArea, EObject controlAreaToControlArea,
			EObject trgControlArea) {
		_this.registerObjects_FWD(ruleresult, srcControlArea, controlAreaToControlArea, trgControlArea);

	}

	public static final PerformRuleResult pattern_ControlArea_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ControlArea_2_1_preparereturnvalue_bindingFB(ControlArea _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ControlArea_2_1_preparereturnvalue_blackFBB(EClass eClass, ControlArea _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ControlArea_2_1_preparereturnvalue_bindingAndBlackFFB(ControlArea _this) {
		Object[] result_pattern_ControlArea_2_1_preparereturnvalue_binding = pattern_ControlArea_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ControlArea_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ControlArea_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ControlArea_2_1_preparereturnvalue_black = pattern_ControlArea_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ControlArea_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ControlArea_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ControlArea_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ControlArea";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ControlArea_2_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("srcControlArea");
		EObject tmpSrcControlArea = _localVariable_0;
		if (tmpSrcControlArea instanceof gluemodel.CIM.IEC61970.ControlArea.ControlArea) {
			gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea = (gluemodel.CIM.IEC61970.ControlArea.ControlArea) tmpSrcControlArea;
			return new Object[] { srcControlArea, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ControlArea_2_2_corematch_blackBB(
			gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { srcControlArea, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_ControlArea_2_3_findcontext_blackB(
			gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { srcControlArea });
		return _result;
	}

	public static final Object[] pattern_ControlArea_2_3_findcontext_greenBF(
			gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(srcControlArea);
		return new Object[] { srcControlArea, isApplicableMatch };
	}

	public static final Object[] pattern_ControlArea_2_4_solveCSP_bindingFBBB(ControlArea _this,
			IsApplicableMatch isApplicableMatch, gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, srcControlArea);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, srcControlArea };
		}
		return null;
	}

	public static final Object[] pattern_ControlArea_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ControlArea_2_4_solveCSP_bindingAndBlackFBBB(ControlArea _this,
			IsApplicableMatch isApplicableMatch, gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea) {
		Object[] result_pattern_ControlArea_2_4_solveCSP_binding = pattern_ControlArea_2_4_solveCSP_bindingFBBB(_this,
				isApplicableMatch, srcControlArea);
		if (result_pattern_ControlArea_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ControlArea_2_4_solveCSP_binding[0];

			Object[] result_pattern_ControlArea_2_4_solveCSP_black = pattern_ControlArea_2_4_solveCSP_blackB(csp);
			if (result_pattern_ControlArea_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, srcControlArea };
			}
		}
		return null;
	}

	public static final boolean pattern_ControlArea_2_5_checkCSP_expressionFBB(ControlArea _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ControlArea_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ControlArea_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ControlArea";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ControlArea_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ControlArea_10_1_preparereturnvalue_bindingFB(ControlArea _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ControlArea_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ControlArea _this) {
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

	public static final Object[] pattern_ControlArea_10_1_preparereturnvalue_bindingAndBlackFFBF(ControlArea _this) {
		Object[] result_pattern_ControlArea_10_1_preparereturnvalue_binding = pattern_ControlArea_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ControlArea_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ControlArea_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ControlArea_10_1_preparereturnvalue_black = pattern_ControlArea_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ControlArea_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ControlArea_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ControlArea_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ControlArea_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ControlArea_10_2_testcorematchandDECs_blackB(
			gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { srcControlArea });
		return _result;
	}

	public static final Object[] pattern_ControlArea_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ControlArea_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			ControlArea _this, Match match, gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcControlArea);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ControlArea_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ControlArea _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ControlArea_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ControlArea_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ControlArea_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ControlArea_13_1_matchtggpattern_blackB(
			gluemodel.CIM.IEC61970.ControlArea.ControlArea srcControlArea) {
		return new Object[] { srcControlArea };
	}

	public static final boolean pattern_ControlArea_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ControlArea_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ControlAreaImpl
