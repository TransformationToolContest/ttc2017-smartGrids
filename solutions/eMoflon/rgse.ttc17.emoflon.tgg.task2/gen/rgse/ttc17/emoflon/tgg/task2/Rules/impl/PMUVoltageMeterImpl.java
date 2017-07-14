/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules.impl;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;

import gluemodel.MeterAssetMMXUPair;

import gluemodel.substationStandard.LNNodes.LNGroupM.MMXU;

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

import rgse.ttc17.emoflon.tgg.task2.MMXUToPMUVoltageMeter;
import rgse.ttc17.emoflon.tgg.task2.MeterAssetToMMXUToVoltageMeter;
import rgse.ttc17.emoflon.tgg.task2.MeterAssetToPMUVoltageMeter;

import rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter;
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
 * An implementation of the model object '<em><b>PMU Voltage Meter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PMUVoltageMeterImpl extends AbstractRuleImpl implements PMUVoltageMeter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PMUVoltageMeterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getPMUVoltageMeter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MeterAsset asset, MeterAssetMMXUPair pair, MMXU mmxu) {
		// initial bindings
		Object[] result1_black = PMUVoltageMeterImpl.pattern_PMUVoltageMeter_0_1_initialbindings_blackBBBBB(this, match,
				asset, pair, mmxu);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[asset] = " + asset + ", "
					+ "[pair] = " + pair + ", " + "[mmxu] = " + mmxu + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = PMUVoltageMeterImpl
				.pattern_PMUVoltageMeter_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, asset, pair, mmxu);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[asset] = " + asset + ", " + "[pair] = " + pair
					+ ", " + "[mmxu] = " + mmxu + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (PMUVoltageMeterImpl.pattern_PMUVoltageMeter_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = PMUVoltageMeterImpl
					.pattern_PMUVoltageMeter_0_4_collectelementstobetranslated_blackBBBB(match, asset, pair, mmxu);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[asset] = " + asset + ", " + "[pair] = "
						+ pair + ", " + "[mmxu] = " + mmxu + ".");
			}
			PMUVoltageMeterImpl.pattern_PMUVoltageMeter_0_4_collectelementstobetranslated_greenBBBBFF(match, asset,
					pair, mmxu);
			// EMoflonEdge pair__asset____a = (EMoflonEdge) result4_green[4];
			// EMoflonEdge pair__mmxu____b = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = PMUVoltageMeterImpl
					.pattern_PMUVoltageMeter_0_5_collectcontextelements_blackBBBB(match, asset, pair, mmxu);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[asset] = " + asset + ", " + "[pair] = "
						+ pair + ", " + "[mmxu] = " + mmxu + ".");
			}
			PMUVoltageMeterImpl.pattern_PMUVoltageMeter_0_5_collectcontextelements_greenBBB(match, asset, mmxu);

			// register objects to match
			PMUVoltageMeterImpl.pattern_PMUVoltageMeter_0_6_registerobjectstomatch_expressionBBBBB(this, match, asset,
					pair, mmxu);
			return PMUVoltageMeterImpl.pattern_PMUVoltageMeter_0_7_expressionF();
		} else {
			return PMUVoltageMeterImpl.pattern_PMUVoltageMeter_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = PMUVoltageMeterImpl
				.pattern_PMUVoltageMeter_1_1_performtransformation_bindingAndBlackFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MeterAsset asset = (MeterAsset) result1_bindingAndBlack[0];
		MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result1_bindingAndBlack[1];
		MMXU mmxu = (MMXU) result1_bindingAndBlack[2];
		CSP csp = (CSP) result1_bindingAndBlack[3];
		Object[] result1_green = PMUVoltageMeterImpl
				.pattern_PMUVoltageMeter_1_1_performtransformation_greenBFFFFBBB(asset, pair, mmxu, csp);
		MeterAssetToMMXUToVoltageMeter pairToMeter = (MeterAssetToMMXUToVoltageMeter) result1_green[1];
		MMXUToPMUVoltageMeter mmxuToMeter = (MMXUToPMUVoltageMeter) result1_green[2];
		outagePreventionJointarget.PMUVoltageMeter meter = (outagePreventionJointarget.PMUVoltageMeter) result1_green[3];
		MeterAssetToPMUVoltageMeter assetToMeter = (MeterAssetToPMUVoltageMeter) result1_green[4];

		// collect translated elements
		Object[] result2_black = PMUVoltageMeterImpl.pattern_PMUVoltageMeter_1_2_collecttranslatedelements_blackBBBBB(
				pairToMeter, mmxuToMeter, meter, assetToMeter, pair);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[pairToMeter] = " + pairToMeter + ", " + "[mmxuToMeter] = " + mmxuToMeter + ", " + "[meter] = "
					+ meter + ", " + "[assetToMeter] = " + assetToMeter + ", " + "[pair] = " + pair + ".");
		}
		Object[] result2_green = PMUVoltageMeterImpl.pattern_PMUVoltageMeter_1_2_collecttranslatedelements_greenFBBBBB(
				pairToMeter, mmxuToMeter, meter, assetToMeter, pair);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = PMUVoltageMeterImpl.pattern_PMUVoltageMeter_1_3_bookkeepingforedges_blackBBBBBBBB(
				ruleresult, asset, pairToMeter, mmxuToMeter, meter, assetToMeter, pair, mmxu);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[asset] = " + asset + ", " + "[pairToMeter] = "
					+ pairToMeter + ", " + "[mmxuToMeter] = " + mmxuToMeter + ", " + "[meter] = " + meter + ", "
					+ "[assetToMeter] = " + assetToMeter + ", " + "[pair] = " + pair + ", " + "[mmxu] = " + mmxu + ".");
		}
		PMUVoltageMeterImpl.pattern_PMUVoltageMeter_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFF(ruleresult, asset,
				pairToMeter, mmxuToMeter, meter, assetToMeter, pair, mmxu);
		// EMoflonEdge mmxuToMeter__meter____target = (EMoflonEdge) result3_green[8];
		// EMoflonEdge pairToMeter__meter____target = (EMoflonEdge) result3_green[9];
		// EMoflonEdge assetToMeter__meter____target = (EMoflonEdge) result3_green[10];
		// EMoflonEdge assetToMeter__asset____source = (EMoflonEdge) result3_green[11];
		// EMoflonEdge pairToMeter__pair____source = (EMoflonEdge) result3_green[12];
		// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[13];
		// EMoflonEdge mmxuToMeter__mmxu____source = (EMoflonEdge) result3_green[14];
		// EMoflonEdge pair__mmxu____b = (EMoflonEdge) result3_green[15];

		// perform postprocessing story node is empty
		// register objects
		PMUVoltageMeterImpl.pattern_PMUVoltageMeter_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult, asset,
				pairToMeter, mmxuToMeter, meter, assetToMeter, pair, mmxu);
		return PMUVoltageMeterImpl.pattern_PMUVoltageMeter_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = PMUVoltageMeterImpl
				.pattern_PMUVoltageMeter_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PMUVoltageMeterImpl
				.pattern_PMUVoltageMeter_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = PMUVoltageMeterImpl.pattern_PMUVoltageMeter_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MeterAsset asset = (MeterAsset) result2_binding[0];
		MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result2_binding[1];
		MMXU mmxu = (MMXU) result2_binding[2];
		for (Object[] result2_black : PMUVoltageMeterImpl.pattern_PMUVoltageMeter_2_2_corematch_blackBBBB(asset, pair,
				mmxu, match)) {
			// ForEach find context
			for (Object[] result3_black : PMUVoltageMeterImpl.pattern_PMUVoltageMeter_2_3_findcontext_blackBBB(asset,
					pair, mmxu)) {
				Object[] result3_green = PMUVoltageMeterImpl.pattern_PMUVoltageMeter_2_3_findcontext_greenBBBFFF(asset,
						pair, mmxu);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[3];
				// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[4];
				// EMoflonEdge pair__mmxu____b = (EMoflonEdge) result3_green[5];

				// solve CSP
				Object[] result4_bindingAndBlack = PMUVoltageMeterImpl
						.pattern_PMUVoltageMeter_2_4_solveCSP_bindingAndBlackFBBBBB(this, isApplicableMatch, asset,
								pair, mmxu);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[asset] = " + asset + ", " + "[pair] = " + pair + ", " + "[mmxu] = " + mmxu + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (PMUVoltageMeterImpl.pattern_PMUVoltageMeter_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = PMUVoltageMeterImpl
							.pattern_PMUVoltageMeter_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					PMUVoltageMeterImpl.pattern_PMUVoltageMeter_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return PMUVoltageMeterImpl.pattern_PMUVoltageMeter_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MeterAsset asset, MeterAssetMMXUPair pair, MMXU mmxu) {
		match.registerObject("asset", asset);
		match.registerObject("pair", pair);
		match.registerObject("mmxu", mmxu);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MeterAsset asset, MeterAssetMMXUPair pair, MMXU mmxu) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MeterAsset asset, MeterAssetMMXUPair pair,
			MMXU mmxu) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_pair_ResMag = CSPFactoryHelper.eINSTANCE.createVariable("pair.ResMag", true, csp);
		var_pair_ResMag.setValue(pair.getResMag());
		var_pair_ResMag.setType("double");
		Variable var_pair_BAng = CSPFactoryHelper.eINSTANCE.createVariable("pair.BAng", true, csp);
		var_pair_BAng.setValue(pair.getBAng());
		var_pair_BAng.setType("double");
		Variable var_pair_AMag = CSPFactoryHelper.eINSTANCE.createVariable("pair.AMag", true, csp);
		var_pair_AMag.setValue(pair.getAMag());
		var_pair_AMag.setType("double");
		Variable var_pair_AAng = CSPFactoryHelper.eINSTANCE.createVariable("pair.AAng", true, csp);
		var_pair_AAng.setValue(pair.getAAng());
		var_pair_AAng.setType("double");
		Variable var_pair_NetAng = CSPFactoryHelper.eINSTANCE.createVariable("pair.NetAng", true, csp);
		var_pair_NetAng.setValue(pair.getNetAng());
		var_pair_NetAng.setType("double");
		Variable var_pair_ResAng = CSPFactoryHelper.eINSTANCE.createVariable("pair.ResAng", true, csp);
		var_pair_ResAng.setValue(pair.getResAng());
		var_pair_ResAng.setType("double");
		Variable var_pair_NetMag = CSPFactoryHelper.eINSTANCE.createVariable("pair.NetMag", true, csp);
		var_pair_NetMag.setValue(pair.getNetMag());
		var_pair_NetMag.setType("double");
		Variable var_asset_mRID = CSPFactoryHelper.eINSTANCE.createVariable("asset.mRID", true, csp);
		var_asset_mRID.setValue(asset.getMRID());
		var_asset_mRID.setType("String");
		Variable var_pair_CMag = CSPFactoryHelper.eINSTANCE.createVariable("pair.CMag", true, csp);
		var_pair_CMag.setValue(pair.getCMag());
		var_pair_CMag.setType("double");
		Variable var_pair_NeutAng = CSPFactoryHelper.eINSTANCE.createVariable("pair.NeutAng", true, csp);
		var_pair_NeutAng.setValue(pair.getNeutAng());
		var_pair_NeutAng.setType("double");
		Variable var_pair_BMag = CSPFactoryHelper.eINSTANCE.createVariable("pair.BMag", true, csp);
		var_pair_BMag.setValue(pair.getBMag());
		var_pair_BMag.setType("double");
		Variable var_pair_NeutMag = CSPFactoryHelper.eINSTANCE.createVariable("pair.NeutMag", true, csp);
		var_pair_NeutMag.setValue(pair.getNeutMag());
		var_pair_NeutMag.setType("double");
		Variable var_pair_CAng = CSPFactoryHelper.eINSTANCE.createVariable("pair.CAng", true, csp);
		var_pair_CAng.setValue(pair.getCAng());
		var_pair_CAng.setType("double");

		// Create unbound variables
		Variable var_meter_VoltageResMag = CSPFactoryHelper.eINSTANCE.createVariable("meter.VoltageResMag", csp);
		var_meter_VoltageResMag.setType("double");
		Variable var_meter_VoltageBAng = CSPFactoryHelper.eINSTANCE.createVariable("meter.VoltageBAng", csp);
		var_meter_VoltageBAng.setType("double");
		Variable var_meter_VoltageAMag = CSPFactoryHelper.eINSTANCE.createVariable("meter.VoltageAMag", csp);
		var_meter_VoltageAMag.setType("double");
		Variable var_meter_VoltageAAng = CSPFactoryHelper.eINSTANCE.createVariable("meter.VoltageAAng", csp);
		var_meter_VoltageAAng.setType("double");
		Variable var_meter_VoltageNetAng = CSPFactoryHelper.eINSTANCE.createVariable("meter.VoltageNetAng", csp);
		var_meter_VoltageNetAng.setType("double");
		Variable var_meter_VoltageResAng = CSPFactoryHelper.eINSTANCE.createVariable("meter.VoltageResAng", csp);
		var_meter_VoltageResAng.setType("double");
		Variable var_meter_VoltageNetMag = CSPFactoryHelper.eINSTANCE.createVariable("meter.VoltageNetMag", csp);
		var_meter_VoltageNetMag.setType("double");
		Variable var_meter_mRID = CSPFactoryHelper.eINSTANCE.createVariable("meter.mRID", csp);
		var_meter_mRID.setType("String");
		Variable var_meter_VoltageCMag = CSPFactoryHelper.eINSTANCE.createVariable("meter.VoltageCMag", csp);
		var_meter_VoltageCMag.setType("double");
		Variable var_meter_VoltageNeutAng = CSPFactoryHelper.eINSTANCE.createVariable("meter.VoltageNeutAng", csp);
		var_meter_VoltageNeutAng.setType("double");
		Variable var_meter_VoltageBMag = CSPFactoryHelper.eINSTANCE.createVariable("meter.VoltageBMag", csp);
		var_meter_VoltageBMag.setType("double");
		Variable var_meter_VoltageNeutMag = CSPFactoryHelper.eINSTANCE.createVariable("meter.VoltageNeutMag", csp);
		var_meter_VoltageNeutMag.setType("double");
		Variable var_meter_VoltageCAng = CSPFactoryHelper.eINSTANCE.createVariable("meter.VoltageCAng", csp);
		var_meter_VoltageCAng.setType("double");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		Eq eq_1 = new Eq();
		Eq eq_2 = new Eq();
		Eq eq_3 = new Eq();
		Eq eq_4 = new Eq();
		Eq eq_5 = new Eq();
		Eq eq_6 = new Eq();
		Eq eq_7 = new Eq();
		Eq eq_8 = new Eq();
		Eq eq_9 = new Eq();
		Eq eq_10 = new Eq();
		Eq eq_11 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eq_1);
		csp.getConstraints().add(eq_2);
		csp.getConstraints().add(eq_3);
		csp.getConstraints().add(eq_4);
		csp.getConstraints().add(eq_5);
		csp.getConstraints().add(eq_6);
		csp.getConstraints().add(eq_7);
		csp.getConstraints().add(eq_8);
		csp.getConstraints().add(eq_9);
		csp.getConstraints().add(eq_10);
		csp.getConstraints().add(eq_11);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_pair_ResMag, var_meter_VoltageResMag);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_pair_BAng, var_meter_VoltageBAng);
		eq_1.setRuleName("NoRuleName");
		eq_1.solve(var_pair_AMag, var_meter_VoltageAMag);
		eq_2.setRuleName("NoRuleName");
		eq_2.solve(var_pair_AAng, var_meter_VoltageAAng);
		eq_3.setRuleName("NoRuleName");
		eq_3.solve(var_pair_NetAng, var_meter_VoltageNetAng);
		eq_4.setRuleName("NoRuleName");
		eq_4.solve(var_pair_ResAng, var_meter_VoltageResAng);
		eq_5.setRuleName("NoRuleName");
		eq_5.solve(var_pair_NetMag, var_meter_VoltageNetMag);
		eq_6.setRuleName("NoRuleName");
		eq_6.solve(var_asset_mRID, var_meter_mRID);
		eq_7.setRuleName("NoRuleName");
		eq_7.solve(var_pair_CMag, var_meter_VoltageCMag);
		eq_8.setRuleName("NoRuleName");
		eq_8.solve(var_pair_NeutAng, var_meter_VoltageNeutAng);
		eq_9.setRuleName("NoRuleName");
		eq_9.solve(var_pair_BMag, var_meter_VoltageBMag);
		eq_10.setRuleName("NoRuleName");
		eq_10.solve(var_pair_NeutMag, var_meter_VoltageNeutMag);
		eq_11.setRuleName("NoRuleName");
		eq_11.solve(var_pair_CAng, var_meter_VoltageCAng);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("asset", asset);
		isApplicableMatch.registerObject("pair", pair);
		isApplicableMatch.registerObject("mmxu", mmxu);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject asset, EObject pairToMeter,
			EObject mmxuToMeter, EObject meter, EObject assetToMeter, EObject pair, EObject mmxu) {
		ruleresult.registerObject("asset", asset);
		ruleresult.registerObject("pairToMeter", pairToMeter);
		ruleresult.registerObject("mmxuToMeter", mmxuToMeter);
		ruleresult.registerObject("meter", meter);
		ruleresult.registerObject("assetToMeter", assetToMeter);
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("mmxu", mmxu);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("pair").eClass())
				.equals("gluemodel.MeterAssetMMXUPair.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_36(EMoflonEdge _edge_a) {
		// prepare return value
		Object[] result1_bindingAndBlack = PMUVoltageMeterImpl
				.pattern_PMUVoltageMeter_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = PMUVoltageMeterImpl.pattern_PMUVoltageMeter_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PMUVoltageMeterImpl
				.pattern_PMUVoltageMeter_10_2_testcorematchandDECs_blackFFFB(_edge_a)) {
			MeterAsset asset = (MeterAsset) result2_black[0];
			MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result2_black[1];
			MMXU mmxu = (MMXU) result2_black[2];
			Object[] result2_green = PMUVoltageMeterImpl
					.pattern_PMUVoltageMeter_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PMUVoltageMeterImpl
					.pattern_PMUVoltageMeter_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, asset, pair, mmxu)) {
				// Ensure that the correct types of elements are matched
				if (PMUVoltageMeterImpl
						.pattern_PMUVoltageMeter_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = PMUVoltageMeterImpl
							.pattern_PMUVoltageMeter_10_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					PMUVoltageMeterImpl.pattern_PMUVoltageMeter_10_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return PMUVoltageMeterImpl.pattern_PMUVoltageMeter_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("PMUVoltageMeter");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_pair_ResMag = CSPFactoryHelper.eINSTANCE.createVariable("pair", true, csp);
		var_pair_ResMag.setValue(__helper.getValue("pair", "ResMag"));
		var_pair_ResMag.setType("double");

		Variable var_meter_VoltageResMag = CSPFactoryHelper.eINSTANCE.createVariable("meter", true, csp);
		var_meter_VoltageResMag.setValue(__helper.getValue("meter", "VoltageResMag"));
		var_meter_VoltageResMag.setType("double");

		Variable var_meter_VoltageAMag = CSPFactoryHelper.eINSTANCE.createVariable("meter", true, csp);
		var_meter_VoltageAMag.setValue(__helper.getValue("meter", "VoltageAMag"));
		var_meter_VoltageAMag.setType("double");

		Variable var_meter_VoltageBAng = CSPFactoryHelper.eINSTANCE.createVariable("meter", true, csp);
		var_meter_VoltageBAng.setValue(__helper.getValue("meter", "VoltageBAng"));
		var_meter_VoltageBAng.setType("double");

		Variable var_pair_AAng = CSPFactoryHelper.eINSTANCE.createVariable("pair", true, csp);
		var_pair_AAng.setValue(__helper.getValue("pair", "AAng"));
		var_pair_AAng.setType("double");

		Variable var_meter_mRID = CSPFactoryHelper.eINSTANCE.createVariable("meter", true, csp);
		var_meter_mRID.setValue(__helper.getValue("meter", "mRID"));
		var_meter_mRID.setType("String");

		Variable var_meter_VoltageResAng = CSPFactoryHelper.eINSTANCE.createVariable("meter", true, csp);
		var_meter_VoltageResAng.setValue(__helper.getValue("meter", "VoltageResAng"));
		var_meter_VoltageResAng.setType("double");

		Variable var_asset_mRID = CSPFactoryHelper.eINSTANCE.createVariable("asset", true, csp);
		var_asset_mRID.setValue(__helper.getValue("asset", "mRID"));
		var_asset_mRID.setType("String");

		Variable var_meter_VoltageCMag = CSPFactoryHelper.eINSTANCE.createVariable("meter", true, csp);
		var_meter_VoltageCMag.setValue(__helper.getValue("meter", "VoltageCMag"));
		var_meter_VoltageCMag.setType("double");

		Variable var_pair_CMag = CSPFactoryHelper.eINSTANCE.createVariable("pair", true, csp);
		var_pair_CMag.setValue(__helper.getValue("pair", "CMag"));
		var_pair_CMag.setType("double");

		Variable var_pair_AMag = CSPFactoryHelper.eINSTANCE.createVariable("pair", true, csp);
		var_pair_AMag.setValue(__helper.getValue("pair", "AMag"));
		var_pair_AMag.setType("double");

		Variable var_meter_VoltageNetAng = CSPFactoryHelper.eINSTANCE.createVariable("meter", true, csp);
		var_meter_VoltageNetAng.setValue(__helper.getValue("meter", "VoltageNetAng"));
		var_meter_VoltageNetAng.setType("double");

		Variable var_meter_VoltageNeutAng = CSPFactoryHelper.eINSTANCE.createVariable("meter", true, csp);
		var_meter_VoltageNeutAng.setValue(__helper.getValue("meter", "VoltageNeutAng"));
		var_meter_VoltageNeutAng.setType("double");

		Variable var_pair_NeutAng = CSPFactoryHelper.eINSTANCE.createVariable("pair", true, csp);
		var_pair_NeutAng.setValue(__helper.getValue("pair", "NeutAng"));
		var_pair_NeutAng.setType("double");

		Variable var_meter_VoltageAAng = CSPFactoryHelper.eINSTANCE.createVariable("meter", true, csp);
		var_meter_VoltageAAng.setValue(__helper.getValue("meter", "VoltageAAng"));
		var_meter_VoltageAAng.setType("double");

		Variable var_pair_NetMag = CSPFactoryHelper.eINSTANCE.createVariable("pair", true, csp);
		var_pair_NetMag.setValue(__helper.getValue("pair", "NetMag"));
		var_pair_NetMag.setType("double");

		Variable var_pair_ResAng = CSPFactoryHelper.eINSTANCE.createVariable("pair", true, csp);
		var_pair_ResAng.setValue(__helper.getValue("pair", "ResAng"));
		var_pair_ResAng.setType("double");

		Variable var_meter_VoltageNetMag = CSPFactoryHelper.eINSTANCE.createVariable("meter", true, csp);
		var_meter_VoltageNetMag.setValue(__helper.getValue("meter", "VoltageNetMag"));
		var_meter_VoltageNetMag.setType("double");

		Variable var_pair_BAng = CSPFactoryHelper.eINSTANCE.createVariable("pair", true, csp);
		var_pair_BAng.setValue(__helper.getValue("pair", "BAng"));
		var_pair_BAng.setType("double");

		Variable var_pair_NetAng = CSPFactoryHelper.eINSTANCE.createVariable("pair", true, csp);
		var_pair_NetAng.setValue(__helper.getValue("pair", "NetAng"));
		var_pair_NetAng.setType("double");

		Variable var_meter_VoltageNeutMag = CSPFactoryHelper.eINSTANCE.createVariable("meter", true, csp);
		var_meter_VoltageNeutMag.setValue(__helper.getValue("meter", "VoltageNeutMag"));
		var_meter_VoltageNeutMag.setType("double");

		Variable var_meter_VoltageBMag = CSPFactoryHelper.eINSTANCE.createVariable("meter", true, csp);
		var_meter_VoltageBMag.setValue(__helper.getValue("meter", "VoltageBMag"));
		var_meter_VoltageBMag.setType("double");

		Variable var_pair_BMag = CSPFactoryHelper.eINSTANCE.createVariable("pair", true, csp);
		var_pair_BMag.setValue(__helper.getValue("pair", "BMag"));
		var_pair_BMag.setType("double");

		Variable var_pair_NeutMag = CSPFactoryHelper.eINSTANCE.createVariable("pair", true, csp);
		var_pair_NeutMag.setValue(__helper.getValue("pair", "NeutMag"));
		var_pair_NeutMag.setType("double");

		Variable var_pair_CAng = CSPFactoryHelper.eINSTANCE.createVariable("pair", true, csp);
		var_pair_CAng.setValue(__helper.getValue("pair", "CAng"));
		var_pair_CAng.setType("double");

		Variable var_meter_VoltageCAng = CSPFactoryHelper.eINSTANCE.createVariable("meter", true, csp);
		var_meter_VoltageCAng.setValue(__helper.getValue("meter", "VoltageCAng"));
		var_meter_VoltageCAng.setType("double");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		Eq eq2 = new Eq();
		csp.getConstraints().add(eq2);

		Eq eq3 = new Eq();
		csp.getConstraints().add(eq3);

		Eq eq4 = new Eq();
		csp.getConstraints().add(eq4);

		Eq eq5 = new Eq();
		csp.getConstraints().add(eq5);

		Eq eq6 = new Eq();
		csp.getConstraints().add(eq6);

		Eq eq7 = new Eq();
		csp.getConstraints().add(eq7);

		Eq eq8 = new Eq();
		csp.getConstraints().add(eq8);

		Eq eq9 = new Eq();
		csp.getConstraints().add(eq9);

		Eq eq10 = new Eq();
		csp.getConstraints().add(eq10);

		Eq eq11 = new Eq();
		csp.getConstraints().add(eq11);

		Eq eq12 = new Eq();
		csp.getConstraints().add(eq12);

		eq0.setRuleName("PMUVoltageMeter");
		eq0.solve(var_pair_ResMag, var_meter_VoltageResMag);

		eq1.setRuleName("PMUVoltageMeter");
		eq1.solve(var_pair_BAng, var_meter_VoltageBAng);

		eq2.setRuleName("PMUVoltageMeter");
		eq2.solve(var_pair_AMag, var_meter_VoltageAMag);

		eq3.setRuleName("PMUVoltageMeter");
		eq3.solve(var_pair_AAng, var_meter_VoltageAAng);

		eq4.setRuleName("PMUVoltageMeter");
		eq4.solve(var_pair_NetAng, var_meter_VoltageNetAng);

		eq5.setRuleName("PMUVoltageMeter");
		eq5.solve(var_pair_ResAng, var_meter_VoltageResAng);

		eq6.setRuleName("PMUVoltageMeter");
		eq6.solve(var_pair_NetMag, var_meter_VoltageNetMag);

		eq7.setRuleName("PMUVoltageMeter");
		eq7.solve(var_asset_mRID, var_meter_mRID);

		eq8.setRuleName("PMUVoltageMeter");
		eq8.solve(var_pair_CMag, var_meter_VoltageCMag);

		eq9.setRuleName("PMUVoltageMeter");
		eq9.solve(var_pair_NeutAng, var_meter_VoltageNeutAng);

		eq10.setRuleName("PMUVoltageMeter");
		eq10.solve(var_pair_BMag, var_meter_VoltageBMag);

		eq11.setRuleName("PMUVoltageMeter");
		eq11.solve(var_pair_NeutMag, var_meter_VoltageNeutMag);

		eq12.setRuleName("PMUVoltageMeter");
		eq12.solve(var_pair_CAng, var_meter_VoltageCAng);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_meter_VoltageResMag.setBound(false);
			var_meter_VoltageBAng.setBound(false);
			var_meter_VoltageAMag.setBound(false);
			var_meter_VoltageAAng.setBound(false);
			var_meter_VoltageNetAng.setBound(false);
			var_meter_VoltageResAng.setBound(false);
			var_meter_VoltageNetMag.setBound(false);
			var_meter_mRID.setBound(false);
			var_meter_VoltageCMag.setBound(false);
			var_meter_VoltageNeutAng.setBound(false);
			var_meter_VoltageBMag.setBound(false);
			var_meter_VoltageNeutMag.setBound(false);
			var_meter_VoltageCAng.setBound(false);
			eq0.solve(var_pair_ResMag, var_meter_VoltageResMag);
			eq1.solve(var_pair_BAng, var_meter_VoltageBAng);
			eq2.solve(var_pair_AMag, var_meter_VoltageAMag);
			eq3.solve(var_pair_AAng, var_meter_VoltageAAng);
			eq4.solve(var_pair_NetAng, var_meter_VoltageNetAng);
			eq5.solve(var_pair_ResAng, var_meter_VoltageResAng);
			eq6.solve(var_pair_NetMag, var_meter_VoltageNetMag);
			eq7.solve(var_asset_mRID, var_meter_mRID);
			eq8.solve(var_pair_CMag, var_meter_VoltageCMag);
			eq9.solve(var_pair_NeutAng, var_meter_VoltageNeutAng);
			eq10.solve(var_pair_BMag, var_meter_VoltageBMag);
			eq11.solve(var_pair_NeutMag, var_meter_VoltageNeutMag);
			eq12.solve(var_pair_CAng, var_meter_VoltageCAng);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("meter", "VoltageResMag", var_meter_VoltageResMag.getValue());
				__helper.setValue("meter", "VoltageBAng", var_meter_VoltageBAng.getValue());
				__helper.setValue("meter", "VoltageAMag", var_meter_VoltageAMag.getValue());
				__helper.setValue("meter", "VoltageAAng", var_meter_VoltageAAng.getValue());
				__helper.setValue("meter", "VoltageNetAng", var_meter_VoltageNetAng.getValue());
				__helper.setValue("meter", "VoltageResAng", var_meter_VoltageResAng.getValue());
				__helper.setValue("meter", "VoltageNetMag", var_meter_VoltageNetMag.getValue());
				__helper.setValue("meter", "mRID", var_meter_mRID.getValue());
				__helper.setValue("meter", "VoltageCMag", var_meter_VoltageCMag.getValue());
				__helper.setValue("meter", "VoltageNeutAng", var_meter_VoltageNeutAng.getValue());
				__helper.setValue("meter", "VoltageBMag", var_meter_VoltageBMag.getValue());
				__helper.setValue("meter", "VoltageNeutMag", var_meter_VoltageNeutMag.getValue());
				__helper.setValue("meter", "VoltageCAng", var_meter_VoltageCAng.getValue());
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
	public boolean checkDEC_FWD(MeterAsset asset, MeterAssetMMXUPair pair, MMXU mmxu) {// match tgg pattern
		Object[] result1_black = PMUVoltageMeterImpl.pattern_PMUVoltageMeter_13_1_matchtggpattern_blackBBB(asset, pair,
				mmxu);
		if (result1_black != null) {
			return PMUVoltageMeterImpl.pattern_PMUVoltageMeter_13_2_expressionF();
		} else {
			return PMUVoltageMeterImpl.pattern_PMUVoltageMeter_13_3_expressionF();
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
		case RulesPackage.PMU_VOLTAGE_METER___IS_APPROPRIATE_FWD__MATCH_METERASSET_METERASSETMMXUPAIR_MMXU:
			return isAppropriate_FWD((Match) arguments.get(0), (MeterAsset) arguments.get(1),
					(MeterAssetMMXUPair) arguments.get(2), (MMXU) arguments.get(3));
		case RulesPackage.PMU_VOLTAGE_METER___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PMU_VOLTAGE_METER___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PMU_VOLTAGE_METER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSET_METERASSETMMXUPAIR_MMXU:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MeterAsset) arguments.get(1),
					(MeterAssetMMXUPair) arguments.get(2), (MMXU) arguments.get(3));
			return null;
		case RulesPackage.PMU_VOLTAGE_METER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSET_METERASSETMMXUPAIR_MMXU:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MeterAsset) arguments.get(1),
					(MeterAssetMMXUPair) arguments.get(2), (MMXU) arguments.get(3));
		case RulesPackage.PMU_VOLTAGE_METER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PMU_VOLTAGE_METER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METERASSET_METERASSETMMXUPAIR_MMXU:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MeterAsset) arguments.get(1),
					(MeterAssetMMXUPair) arguments.get(2), (MMXU) arguments.get(3));
		case RulesPackage.PMU_VOLTAGE_METER___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PMU_VOLTAGE_METER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.PMU_VOLTAGE_METER___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PMU_VOLTAGE_METER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_36__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_36((EMoflonEdge) arguments.get(0));
		case RulesPackage.PMU_VOLTAGE_METER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PMU_VOLTAGE_METER___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.PMU_VOLTAGE_METER___CHECK_DEC_FWD__METERASSET_METERASSETMMXUPAIR_MMXU:
			return checkDEC_FWD((MeterAsset) arguments.get(0), (MeterAssetMMXUPair) arguments.get(1),
					(MMXU) arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_PMUVoltageMeter_0_1_initialbindings_blackBBBBB(PMUVoltageMeter _this,
			Match match, MeterAsset asset, MeterAssetMMXUPair pair, MMXU mmxu) {
		return new Object[] { _this, match, asset, pair, mmxu };
	}

	public static final Object[] pattern_PMUVoltageMeter_0_2_SolveCSP_bindingFBBBBB(PMUVoltageMeter _this, Match match,
			MeterAsset asset, MeterAssetMMXUPair pair, MMXU mmxu) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, asset, pair, mmxu);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, asset, pair, mmxu };
		}
		return null;
	}

	public static final Object[] pattern_PMUVoltageMeter_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PMUVoltageMeter_0_2_SolveCSP_bindingAndBlackFBBBBB(PMUVoltageMeter _this,
			Match match, MeterAsset asset, MeterAssetMMXUPair pair, MMXU mmxu) {
		Object[] result_pattern_PMUVoltageMeter_0_2_SolveCSP_binding = pattern_PMUVoltageMeter_0_2_SolveCSP_bindingFBBBBB(
				_this, match, asset, pair, mmxu);
		if (result_pattern_PMUVoltageMeter_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PMUVoltageMeter_0_2_SolveCSP_binding[0];

			Object[] result_pattern_PMUVoltageMeter_0_2_SolveCSP_black = pattern_PMUVoltageMeter_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_PMUVoltageMeter_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, asset, pair, mmxu };
			}
		}
		return null;
	}

	public static final boolean pattern_PMUVoltageMeter_0_3_CheckCSP_expressionFBB(PMUVoltageMeter _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PMUVoltageMeter_0_4_collectelementstobetranslated_blackBBBB(Match match,
			MeterAsset asset, MeterAssetMMXUPair pair, MMXU mmxu) {
		return new Object[] { match, asset, pair, mmxu };
	}

	public static final Object[] pattern_PMUVoltageMeter_0_4_collectelementstobetranslated_greenBBBBFF(Match match,
			MeterAsset asset, MeterAssetMMXUPair pair, MMXU mmxu) {
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__mmxu____b = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(pair);
		String pair__asset____a_name_prime = "a";
		String pair__mmxu____b_name_prime = "b";
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		match.getToBeTranslatedEdges().add(pair__asset____a);
		pair__mmxu____b.setSrc(pair);
		pair__mmxu____b.setTrg(mmxu);
		match.getToBeTranslatedEdges().add(pair__mmxu____b);
		pair__asset____a.setName(pair__asset____a_name_prime);
		pair__mmxu____b.setName(pair__mmxu____b_name_prime);
		return new Object[] { match, asset, pair, mmxu, pair__asset____a, pair__mmxu____b };
	}

	public static final Object[] pattern_PMUVoltageMeter_0_5_collectcontextelements_blackBBBB(Match match,
			MeterAsset asset, MeterAssetMMXUPair pair, MMXU mmxu) {
		return new Object[] { match, asset, pair, mmxu };
	}

	public static final Object[] pattern_PMUVoltageMeter_0_5_collectcontextelements_greenBBB(Match match,
			MeterAsset asset, MMXU mmxu) {
		match.getContextNodes().add(asset);
		match.getContextNodes().add(mmxu);
		return new Object[] { match, asset, mmxu };
	}

	public static final void pattern_PMUVoltageMeter_0_6_registerobjectstomatch_expressionBBBBB(PMUVoltageMeter _this,
			Match match, MeterAsset asset, MeterAssetMMXUPair pair, MMXU mmxu) {
		_this.registerObjectsToMatch_FWD(match, asset, pair, mmxu);

	}

	public static final boolean pattern_PMUVoltageMeter_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PMUVoltageMeter_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PMUVoltageMeter_1_1_performtransformation_bindingFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("asset");
		EObject _localVariable_1 = isApplicableMatch.getObject("pair");
		EObject _localVariable_2 = isApplicableMatch.getObject("mmxu");
		EObject tmpAsset = _localVariable_0;
		EObject tmpPair = _localVariable_1;
		EObject tmpMmxu = _localVariable_2;
		if (tmpAsset instanceof MeterAsset) {
			MeterAsset asset = (MeterAsset) tmpAsset;
			if (tmpPair instanceof MeterAssetMMXUPair) {
				MeterAssetMMXUPair pair = (MeterAssetMMXUPair) tmpPair;
				if (tmpMmxu instanceof MMXU) {
					MMXU mmxu = (MMXU) tmpMmxu;
					return new Object[] { asset, pair, mmxu, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PMUVoltageMeter_1_1_performtransformation_blackBBBFBB(MeterAsset asset,
			MeterAssetMMXUPair pair, MMXU mmxu, PMUVoltageMeter _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { asset, pair, mmxu, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PMUVoltageMeter_1_1_performtransformation_bindingAndBlackFFFFBB(
			PMUVoltageMeter _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PMUVoltageMeter_1_1_performtransformation_binding = pattern_PMUVoltageMeter_1_1_performtransformation_bindingFFFB(
				isApplicableMatch);
		if (result_pattern_PMUVoltageMeter_1_1_performtransformation_binding != null) {
			MeterAsset asset = (MeterAsset) result_pattern_PMUVoltageMeter_1_1_performtransformation_binding[0];
			MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result_pattern_PMUVoltageMeter_1_1_performtransformation_binding[1];
			MMXU mmxu = (MMXU) result_pattern_PMUVoltageMeter_1_1_performtransformation_binding[2];

			Object[] result_pattern_PMUVoltageMeter_1_1_performtransformation_black = pattern_PMUVoltageMeter_1_1_performtransformation_blackBBBFBB(
					asset, pair, mmxu, _this, isApplicableMatch);
			if (result_pattern_PMUVoltageMeter_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_PMUVoltageMeter_1_1_performtransformation_black[3];

				return new Object[] { asset, pair, mmxu, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PMUVoltageMeter_1_1_performtransformation_greenBFFFFBBB(MeterAsset asset,
			MeterAssetMMXUPair pair, MMXU mmxu, CSP csp) {
		MeterAssetToMMXUToVoltageMeter pairToMeter = Task2Factory.eINSTANCE.createMeterAssetToMMXUToVoltageMeter();
		MMXUToPMUVoltageMeter mmxuToMeter = Task2Factory.eINSTANCE.createMMXUToPMUVoltageMeter();
		outagePreventionJointarget.PMUVoltageMeter meter = OutagePreventionJointargetFactory.eINSTANCE
				.createPMUVoltageMeter();
		MeterAssetToPMUVoltageMeter assetToMeter = Task2Factory.eINSTANCE.createMeterAssetToPMUVoltageMeter();
		Object _localVariable_0 = csp.getValue("meter", "VoltageResMag");
		Object _localVariable_1 = csp.getValue("meter", "VoltageBAng");
		Object _localVariable_2 = csp.getValue("meter", "VoltageAMag");
		Object _localVariable_3 = csp.getValue("meter", "VoltageAAng");
		Object _localVariable_4 = csp.getValue("meter", "VoltageNetAng");
		Object _localVariable_5 = csp.getValue("meter", "VoltageResAng");
		Object _localVariable_6 = csp.getValue("meter", "VoltageNetMag");
		Object _localVariable_7 = csp.getValue("meter", "mRID");
		Object _localVariable_8 = csp.getValue("meter", "VoltageCMag");
		Object _localVariable_9 = csp.getValue("meter", "VoltageNeutAng");
		Object _localVariable_10 = csp.getValue("meter", "VoltageBMag");
		Object _localVariable_11 = csp.getValue("meter", "VoltageNeutMag");
		Object _localVariable_12 = csp.getValue("meter", "VoltageCAng");
		pairToMeter.setSource(pair);
		mmxuToMeter.setSource(mmxu);
		mmxuToMeter.setTarget(meter);
		pairToMeter.setTarget(meter);
		assetToMeter.setTarget(meter);
		assetToMeter.setSource(asset);
		double meter_VoltageResMag_prime = (double) _localVariable_0;
		double meter_VoltageBAng_prime = (double) _localVariable_1;
		double meter_VoltageAMag_prime = (double) _localVariable_2;
		double meter_VoltageAAng_prime = (double) _localVariable_3;
		double meter_VoltageNetAng_prime = (double) _localVariable_4;
		double meter_VoltageResAng_prime = (double) _localVariable_5;
		double meter_VoltageNetMag_prime = (double) _localVariable_6;
		String meter_mRID_prime = (String) _localVariable_7;
		double meter_VoltageCMag_prime = (double) _localVariable_8;
		double meter_VoltageNeutAng_prime = (double) _localVariable_9;
		double meter_VoltageBMag_prime = (double) _localVariable_10;
		double meter_VoltageNeutMag_prime = (double) _localVariable_11;
		double meter_VoltageCAng_prime = (double) _localVariable_12;
		meter.setVoltageResMag(Double.valueOf(meter_VoltageResMag_prime));
		meter.setVoltageBAng(Double.valueOf(meter_VoltageBAng_prime));
		meter.setVoltageAMag(Double.valueOf(meter_VoltageAMag_prime));
		meter.setVoltageAAng(Double.valueOf(meter_VoltageAAng_prime));
		meter.setVoltageNetAng(Double.valueOf(meter_VoltageNetAng_prime));
		meter.setVoltageResAng(Double.valueOf(meter_VoltageResAng_prime));
		meter.setVoltageNetMag(Double.valueOf(meter_VoltageNetMag_prime));
		meter.setMRID(meter_mRID_prime);
		meter.setVoltageCMag(Double.valueOf(meter_VoltageCMag_prime));
		meter.setVoltageNeutAng(Double.valueOf(meter_VoltageNeutAng_prime));
		meter.setVoltageBMag(Double.valueOf(meter_VoltageBMag_prime));
		meter.setVoltageNeutMag(Double.valueOf(meter_VoltageNeutMag_prime));
		meter.setVoltageCAng(Double.valueOf(meter_VoltageCAng_prime));
		return new Object[] { asset, pairToMeter, mmxuToMeter, meter, assetToMeter, pair, mmxu, csp };
	}

	public static final Object[] pattern_PMUVoltageMeter_1_2_collecttranslatedelements_blackBBBBB(
			MeterAssetToMMXUToVoltageMeter pairToMeter, MMXUToPMUVoltageMeter mmxuToMeter,
			outagePreventionJointarget.PMUVoltageMeter meter, MeterAssetToPMUVoltageMeter assetToMeter,
			MeterAssetMMXUPair pair) {
		return new Object[] { pairToMeter, mmxuToMeter, meter, assetToMeter, pair };
	}

	public static final Object[] pattern_PMUVoltageMeter_1_2_collecttranslatedelements_greenFBBBBB(
			MeterAssetToMMXUToVoltageMeter pairToMeter, MMXUToPMUVoltageMeter mmxuToMeter,
			outagePreventionJointarget.PMUVoltageMeter meter, MeterAssetToPMUVoltageMeter assetToMeter,
			MeterAssetMMXUPair pair) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(pairToMeter);
		ruleresult.getCreatedLinkElements().add(mmxuToMeter);
		ruleresult.getCreatedElements().add(meter);
		ruleresult.getCreatedLinkElements().add(assetToMeter);
		ruleresult.getTranslatedElements().add(pair);
		return new Object[] { ruleresult, pairToMeter, mmxuToMeter, meter, assetToMeter, pair };
	}

	public static final Object[] pattern_PMUVoltageMeter_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject asset, EObject pairToMeter, EObject mmxuToMeter, EObject meter,
			EObject assetToMeter, EObject pair, EObject mmxu) {
		if (!asset.equals(pairToMeter)) {
			if (!asset.equals(mmxuToMeter)) {
				if (!asset.equals(meter)) {
					if (!asset.equals(assetToMeter)) {
						if (!asset.equals(pair)) {
							if (!asset.equals(mmxu)) {
								if (!mmxuToMeter.equals(pairToMeter)) {
									if (!mmxuToMeter.equals(pair)) {
										if (!meter.equals(pairToMeter)) {
											if (!meter.equals(mmxuToMeter)) {
												if (!meter.equals(pair)) {
													if (!meter.equals(mmxu)) {
														if (!assetToMeter.equals(pairToMeter)) {
															if (!assetToMeter.equals(mmxuToMeter)) {
																if (!assetToMeter.equals(meter)) {
																	if (!assetToMeter.equals(pair)) {
																		if (!assetToMeter.equals(mmxu)) {
																			if (!pair.equals(pairToMeter)) {
																				if (!mmxu.equals(pairToMeter)) {
																					if (!mmxu.equals(mmxuToMeter)) {
																						if (!mmxu.equals(pair)) {
																							return new Object[] {
																									ruleresult, asset,
																									pairToMeter,
																									mmxuToMeter, meter,
																									assetToMeter, pair,
																									mmxu };
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

	public static final Object[] pattern_PMUVoltageMeter_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject asset, EObject pairToMeter, EObject mmxuToMeter, EObject meter,
			EObject assetToMeter, EObject pair, EObject mmxu) {
		EMoflonEdge mmxuToMeter__meter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pairToMeter__meter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge assetToMeter__meter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge assetToMeter__asset____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pairToMeter__pair____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mmxuToMeter__mmxu____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__mmxu____b = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PMUVoltageMeter";
		String mmxuToMeter__meter____target_name_prime = "target";
		String pairToMeter__meter____target_name_prime = "target";
		String assetToMeter__meter____target_name_prime = "target";
		String assetToMeter__asset____source_name_prime = "source";
		String pairToMeter__pair____source_name_prime = "source";
		String pair__asset____a_name_prime = "a";
		String mmxuToMeter__mmxu____source_name_prime = "source";
		String pair__mmxu____b_name_prime = "b";
		mmxuToMeter__meter____target.setSrc(mmxuToMeter);
		mmxuToMeter__meter____target.setTrg(meter);
		ruleresult.getCreatedEdges().add(mmxuToMeter__meter____target);
		pairToMeter__meter____target.setSrc(pairToMeter);
		pairToMeter__meter____target.setTrg(meter);
		ruleresult.getCreatedEdges().add(pairToMeter__meter____target);
		assetToMeter__meter____target.setSrc(assetToMeter);
		assetToMeter__meter____target.setTrg(meter);
		ruleresult.getCreatedEdges().add(assetToMeter__meter____target);
		assetToMeter__asset____source.setSrc(assetToMeter);
		assetToMeter__asset____source.setTrg(asset);
		ruleresult.getCreatedEdges().add(assetToMeter__asset____source);
		pairToMeter__pair____source.setSrc(pairToMeter);
		pairToMeter__pair____source.setTrg(pair);
		ruleresult.getCreatedEdges().add(pairToMeter__pair____source);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		ruleresult.getTranslatedEdges().add(pair__asset____a);
		mmxuToMeter__mmxu____source.setSrc(mmxuToMeter);
		mmxuToMeter__mmxu____source.setTrg(mmxu);
		ruleresult.getCreatedEdges().add(mmxuToMeter__mmxu____source);
		pair__mmxu____b.setSrc(pair);
		pair__mmxu____b.setTrg(mmxu);
		ruleresult.getTranslatedEdges().add(pair__mmxu____b);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mmxuToMeter__meter____target.setName(mmxuToMeter__meter____target_name_prime);
		pairToMeter__meter____target.setName(pairToMeter__meter____target_name_prime);
		assetToMeter__meter____target.setName(assetToMeter__meter____target_name_prime);
		assetToMeter__asset____source.setName(assetToMeter__asset____source_name_prime);
		pairToMeter__pair____source.setName(pairToMeter__pair____source_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		mmxuToMeter__mmxu____source.setName(mmxuToMeter__mmxu____source_name_prime);
		pair__mmxu____b.setName(pair__mmxu____b_name_prime);
		return new Object[] { ruleresult, asset, pairToMeter, mmxuToMeter, meter, assetToMeter, pair, mmxu,
				mmxuToMeter__meter____target, pairToMeter__meter____target, assetToMeter__meter____target,
				assetToMeter__asset____source, pairToMeter__pair____source, pair__asset____a,
				mmxuToMeter__mmxu____source, pair__mmxu____b };
	}

	public static final void pattern_PMUVoltageMeter_1_5_registerobjects_expressionBBBBBBBBB(PMUVoltageMeter _this,
			PerformRuleResult ruleresult, EObject asset, EObject pairToMeter, EObject mmxuToMeter, EObject meter,
			EObject assetToMeter, EObject pair, EObject mmxu) {
		_this.registerObjects_FWD(ruleresult, asset, pairToMeter, mmxuToMeter, meter, assetToMeter, pair, mmxu);

	}

	public static final PerformRuleResult pattern_PMUVoltageMeter_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PMUVoltageMeter_2_1_preparereturnvalue_bindingFB(PMUVoltageMeter _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PMUVoltageMeter_2_1_preparereturnvalue_blackFBB(EClass eClass,
			PMUVoltageMeter _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PMUVoltageMeter_2_1_preparereturnvalue_bindingAndBlackFFB(
			PMUVoltageMeter _this) {
		Object[] result_pattern_PMUVoltageMeter_2_1_preparereturnvalue_binding = pattern_PMUVoltageMeter_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PMUVoltageMeter_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_PMUVoltageMeter_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PMUVoltageMeter_2_1_preparereturnvalue_black = pattern_PMUVoltageMeter_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_PMUVoltageMeter_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PMUVoltageMeter_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PMUVoltageMeter_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "PMUVoltageMeter";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PMUVoltageMeter_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("asset");
		EObject _localVariable_1 = match.getObject("pair");
		EObject _localVariable_2 = match.getObject("mmxu");
		EObject tmpAsset = _localVariable_0;
		EObject tmpPair = _localVariable_1;
		EObject tmpMmxu = _localVariable_2;
		if (tmpAsset instanceof MeterAsset) {
			MeterAsset asset = (MeterAsset) tmpAsset;
			if (tmpPair instanceof MeterAssetMMXUPair) {
				MeterAssetMMXUPair pair = (MeterAssetMMXUPair) tmpPair;
				if (tmpMmxu instanceof MMXU) {
					MMXU mmxu = (MMXU) tmpMmxu;
					return new Object[] { asset, pair, mmxu, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PMUVoltageMeter_2_2_corematch_blackBBBB(MeterAsset asset,
			MeterAssetMMXUPair pair, MMXU mmxu, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { asset, pair, mmxu, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_PMUVoltageMeter_2_3_findcontext_blackBBB(MeterAsset asset,
			MeterAssetMMXUPair pair, MMXU mmxu) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (asset.equals(pair.getA())) {
			if (mmxu.equals(pair.getB())) {
				_result.add(new Object[] { asset, pair, mmxu });
			}
		}
		return _result;
	}

	public static final Object[] pattern_PMUVoltageMeter_2_3_findcontext_greenBBBFFF(MeterAsset asset,
			MeterAssetMMXUPair pair, MMXU mmxu) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__mmxu____b = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pair__asset____a_name_prime = "a";
		String pair__mmxu____b_name_prime = "b";
		isApplicableMatch.getAllContextElements().add(asset);
		isApplicableMatch.getAllContextElements().add(pair);
		isApplicableMatch.getAllContextElements().add(mmxu);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(pair__asset____a);
		pair__mmxu____b.setSrc(pair);
		pair__mmxu____b.setTrg(mmxu);
		isApplicableMatch.getAllContextElements().add(pair__mmxu____b);
		pair__asset____a.setName(pair__asset____a_name_prime);
		pair__mmxu____b.setName(pair__mmxu____b_name_prime);
		return new Object[] { asset, pair, mmxu, isApplicableMatch, pair__asset____a, pair__mmxu____b };
	}

	public static final Object[] pattern_PMUVoltageMeter_2_4_solveCSP_bindingFBBBBB(PMUVoltageMeter _this,
			IsApplicableMatch isApplicableMatch, MeterAsset asset, MeterAssetMMXUPair pair, MMXU mmxu) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, asset, pair, mmxu);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, asset, pair, mmxu };
		}
		return null;
	}

	public static final Object[] pattern_PMUVoltageMeter_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PMUVoltageMeter_2_4_solveCSP_bindingAndBlackFBBBBB(PMUVoltageMeter _this,
			IsApplicableMatch isApplicableMatch, MeterAsset asset, MeterAssetMMXUPair pair, MMXU mmxu) {
		Object[] result_pattern_PMUVoltageMeter_2_4_solveCSP_binding = pattern_PMUVoltageMeter_2_4_solveCSP_bindingFBBBBB(
				_this, isApplicableMatch, asset, pair, mmxu);
		if (result_pattern_PMUVoltageMeter_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PMUVoltageMeter_2_4_solveCSP_binding[0];

			Object[] result_pattern_PMUVoltageMeter_2_4_solveCSP_black = pattern_PMUVoltageMeter_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_PMUVoltageMeter_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, asset, pair, mmxu };
			}
		}
		return null;
	}

	public static final boolean pattern_PMUVoltageMeter_2_5_checkCSP_expressionFBB(PMUVoltageMeter _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PMUVoltageMeter_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PMUVoltageMeter_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PMUVoltageMeter";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PMUVoltageMeter_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PMUVoltageMeter_10_1_preparereturnvalue_bindingFB(PMUVoltageMeter _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PMUVoltageMeter_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			PMUVoltageMeter _this) {
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

	public static final Object[] pattern_PMUVoltageMeter_10_1_preparereturnvalue_bindingAndBlackFFBF(
			PMUVoltageMeter _this) {
		Object[] result_pattern_PMUVoltageMeter_10_1_preparereturnvalue_binding = pattern_PMUVoltageMeter_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PMUVoltageMeter_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_PMUVoltageMeter_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PMUVoltageMeter_10_1_preparereturnvalue_black = pattern_PMUVoltageMeter_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_PMUVoltageMeter_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PMUVoltageMeter_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_PMUVoltageMeter_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_PMUVoltageMeter_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_PMUVoltageMeter_10_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_a) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPair = _edge_a.getSrc();
		if (tmpPair instanceof MeterAssetMMXUPair) {
			MeterAssetMMXUPair pair = (MeterAssetMMXUPair) tmpPair;
			EObject tmpAsset = _edge_a.getTrg();
			if (tmpAsset instanceof MeterAsset) {
				MeterAsset asset = (MeterAsset) tmpAsset;
				if (asset.equals(pair.getA())) {
					MMXU mmxu = pair.getB();
					if (mmxu != null) {
						_result.add(new Object[] { asset, pair, mmxu, _edge_a });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_PMUVoltageMeter_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PMUVoltageMeter_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			PMUVoltageMeter _this, Match match, MeterAsset asset, MeterAssetMMXUPair pair, MMXU mmxu) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, asset, pair, mmxu);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PMUVoltageMeter_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			PMUVoltageMeter _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PMUVoltageMeter_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_PMUVoltageMeter_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_PMUVoltageMeter_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PMUVoltageMeter_13_1_matchtggpattern_blackBBB(MeterAsset asset,
			MeterAssetMMXUPair pair, MMXU mmxu) {
		if (asset.equals(pair.getA())) {
			if (mmxu.equals(pair.getB())) {
				return new Object[] { asset, pair, mmxu };
			}
		}
		return null;
	}

	public static final boolean pattern_PMUVoltageMeter_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PMUVoltageMeter_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //PMUVoltageMeterImpl
