/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules.impl;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;

import gluemodel.COSEM.COSEMObjects.ElectricityValues;

import gluemodel.COSEM.PhysicalDevice;

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

import rgse.ttc17.emoflon.tgg.task2.MeterAssetToPrivateMeterVoltage;
import rgse.ttc17.emoflon.tgg.task2.PhysicalDeviceToPrivateMeterVoltage;

import rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage;
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
 * An implementation of the model object '<em><b>Private Meter Voltage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PrivateMeterVoltageImpl extends AbstractRuleImpl implements PrivateMeterVoltage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivateMeterVoltageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getPrivateMeterVoltage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			ElectricityValues values, PhysicalDevice device) {
		// initial bindings
		Object[] result1_black = PrivateMeterVoltageImpl
				.pattern_PrivateMeterVoltage_0_1_initialbindings_blackBBBBBB(this, match, asset, pair, values, device);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[asset] = " + asset + ", "
					+ "[pair] = " + pair + ", " + "[values] = " + values + ", " + "[device] = " + device + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = PrivateMeterVoltageImpl
				.pattern_PrivateMeterVoltage_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, asset, pair, values,
						device);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[asset] = " + asset + ", " + "[pair] = " + pair
					+ ", " + "[values] = " + values + ", " + "[device] = " + device + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (PrivateMeterVoltageImpl.pattern_PrivateMeterVoltage_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = PrivateMeterVoltageImpl
					.pattern_PrivateMeterVoltage_0_4_collectelementstobetranslated_blackBBBBB(match, asset, pair,
							values, device);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[asset] = " + asset + ", " + "[pair] = "
						+ pair + ", " + "[values] = " + values + ", " + "[device] = " + device + ".");
			}
			PrivateMeterVoltageImpl.pattern_PrivateMeterVoltage_0_4_collectelementstobetranslated_greenBBBBFF(match,
					asset, pair, device);
			// EMoflonEdge pair__asset____a = (EMoflonEdge) result4_green[4];
			// EMoflonEdge pair__device____b = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = PrivateMeterVoltageImpl
					.pattern_PrivateMeterVoltage_0_5_collectcontextelements_blackBBBBB(match, asset, pair, values,
							device);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[asset] = " + asset + ", " + "[pair] = "
						+ pair + ", " + "[values] = " + values + ", " + "[device] = " + device + ".");
			}
			PrivateMeterVoltageImpl.pattern_PrivateMeterVoltage_0_5_collectcontextelements_greenBBBBF(match, asset,
					values, device);
			// EMoflonEdge device__values____ElectricityValues = (EMoflonEdge) result5_green[4];

			// register objects to match
			PrivateMeterVoltageImpl.pattern_PrivateMeterVoltage_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					asset, pair, values, device);
			return PrivateMeterVoltageImpl.pattern_PrivateMeterVoltage_0_7_expressionF();
		} else {
			return PrivateMeterVoltageImpl.pattern_PrivateMeterVoltage_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = PrivateMeterVoltageImpl
				.pattern_PrivateMeterVoltage_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MeterAsset asset = (MeterAsset) result1_bindingAndBlack[0];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result1_bindingAndBlack[1];
		ElectricityValues values = (ElectricityValues) result1_bindingAndBlack[2];
		PhysicalDevice device = (PhysicalDevice) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = PrivateMeterVoltageImpl
				.pattern_PrivateMeterVoltage_1_1_performtransformation_greenBFFFBB(asset, device, csp);
		MeterAssetToPrivateMeterVoltage assetToMeter = (MeterAssetToPrivateMeterVoltage) result1_green[1];
		PhysicalDeviceToPrivateMeterVoltage mmxuToMeter = (PhysicalDeviceToPrivateMeterVoltage) result1_green[2];
		outagePreventionJointarget.PrivateMeterVoltage meter = (outagePreventionJointarget.PrivateMeterVoltage) result1_green[3];

		// collect translated elements
		Object[] result2_black = PrivateMeterVoltageImpl
				.pattern_PrivateMeterVoltage_1_2_collecttranslatedelements_blackBBBB(assetToMeter, mmxuToMeter, pair,
						meter);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[assetToMeter] = " + assetToMeter + ", " + "[mmxuToMeter] = " + mmxuToMeter + ", " + "[pair] = "
					+ pair + ", " + "[meter] = " + meter + ".");
		}
		Object[] result2_green = PrivateMeterVoltageImpl
				.pattern_PrivateMeterVoltage_1_2_collecttranslatedelements_greenFBBBB(assetToMeter, mmxuToMeter, pair,
						meter);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = PrivateMeterVoltageImpl
				.pattern_PrivateMeterVoltage_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, asset, assetToMeter,
						mmxuToMeter, pair, meter, values, device);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[asset] = " + asset + ", " + "[assetToMeter] = "
					+ assetToMeter + ", " + "[mmxuToMeter] = " + mmxuToMeter + ", " + "[pair] = " + pair + ", "
					+ "[meter] = " + meter + ", " + "[values] = " + values + ", " + "[device] = " + device + ".");
		}
		PrivateMeterVoltageImpl.pattern_PrivateMeterVoltage_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(ruleresult,
				asset, assetToMeter, mmxuToMeter, pair, meter, device);
		// EMoflonEdge assetToMeter__asset____source = (EMoflonEdge) result3_green[7];
		// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[8];
		// EMoflonEdge pair__device____b = (EMoflonEdge) result3_green[9];
		// EMoflonEdge assetToMeter__meter____target = (EMoflonEdge) result3_green[10];
		// EMoflonEdge mmxuToMeter__meter____target = (EMoflonEdge) result3_green[11];
		// EMoflonEdge mmxuToMeter__device____source = (EMoflonEdge) result3_green[12];

		// perform postprocessing story node is empty
		// register objects
		PrivateMeterVoltageImpl.pattern_PrivateMeterVoltage_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult,
				asset, assetToMeter, mmxuToMeter, pair, meter, values, device);
		return PrivateMeterVoltageImpl.pattern_PrivateMeterVoltage_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = PrivateMeterVoltageImpl
				.pattern_PrivateMeterVoltage_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PrivateMeterVoltageImpl
				.pattern_PrivateMeterVoltage_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = PrivateMeterVoltageImpl
				.pattern_PrivateMeterVoltage_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MeterAsset asset = (MeterAsset) result2_binding[0];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_binding[1];
		ElectricityValues values = (ElectricityValues) result2_binding[2];
		PhysicalDevice device = (PhysicalDevice) result2_binding[3];
		for (Object[] result2_black : PrivateMeterVoltageImpl
				.pattern_PrivateMeterVoltage_2_2_corematch_blackBBBBB(asset, pair, values, device, match)) {
			// ForEach find context
			for (Object[] result3_black : PrivateMeterVoltageImpl
					.pattern_PrivateMeterVoltage_2_3_findcontext_blackBBBB(asset, pair, values, device)) {
				Object[] result3_green = PrivateMeterVoltageImpl
						.pattern_PrivateMeterVoltage_2_3_findcontext_greenBBBBFFFF(asset, pair, values, device);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[5];
				// EMoflonEdge pair__device____b = (EMoflonEdge) result3_green[6];
				// EMoflonEdge device__values____ElectricityValues = (EMoflonEdge) result3_green[7];

				// solve CSP
				Object[] result4_bindingAndBlack = PrivateMeterVoltageImpl
						.pattern_PrivateMeterVoltage_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, asset,
								pair, values, device);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[asset] = " + asset + ", " + "[pair] = " + pair + ", " + "[values] = " + values + ", "
							+ "[device] = " + device + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (PrivateMeterVoltageImpl.pattern_PrivateMeterVoltage_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = PrivateMeterVoltageImpl
							.pattern_PrivateMeterVoltage_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					PrivateMeterVoltageImpl.pattern_PrivateMeterVoltage_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return PrivateMeterVoltageImpl.pattern_PrivateMeterVoltage_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			ElectricityValues values, PhysicalDevice device) {
		match.registerObject("asset", asset);
		match.registerObject("pair", pair);
		match.registerObject("values", values);
		match.registerObject("device", device);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			ElectricityValues values, PhysicalDevice device) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair, ElectricityValues values, PhysicalDevice device) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_values_VoltageL1 = CSPFactoryHelper.eINSTANCE.createVariable("values.VoltageL1", true, csp);
		var_values_VoltageL1.setValue(values.getVoltageL1());
		var_values_VoltageL1.setType("double");
		Variable var_values_VoltageL3 = CSPFactoryHelper.eINSTANCE.createVariable("values.VoltageL3", true, csp);
		var_values_VoltageL3.setValue(values.getVoltageL3());
		var_values_VoltageL3.setType("double");
		Variable var_values_VoltageL2 = CSPFactoryHelper.eINSTANCE.createVariable("values.VoltageL2", true, csp);
		var_values_VoltageL2.setValue(values.getVoltageL2());
		var_values_VoltageL2.setType("double");
		Variable var_device_ID = CSPFactoryHelper.eINSTANCE.createVariable("device.ID", true, csp);
		var_device_ID.setValue(device.getID());
		var_device_ID.setType("String");

		// Create unbound variables
		Variable var_meter_VoltageA = CSPFactoryHelper.eINSTANCE.createVariable("meter.VoltageA", csp);
		var_meter_VoltageA.setType("double");
		Variable var_meter_VoltageC = CSPFactoryHelper.eINSTANCE.createVariable("meter.VoltageC", csp);
		var_meter_VoltageC.setType("double");
		Variable var_meter_VoltageB = CSPFactoryHelper.eINSTANCE.createVariable("meter.VoltageB", csp);
		var_meter_VoltageB.setType("double");
		Variable var_meter_ID = CSPFactoryHelper.eINSTANCE.createVariable("meter.ID", csp);
		var_meter_ID.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		Eq eq_1 = new Eq();
		Eq eq_2 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eq_1);
		csp.getConstraints().add(eq_2);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_values_VoltageL1, var_meter_VoltageA);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_values_VoltageL3, var_meter_VoltageC);
		eq_1.setRuleName("NoRuleName");
		eq_1.solve(var_values_VoltageL2, var_meter_VoltageB);
		eq_2.setRuleName("NoRuleName");
		eq_2.solve(var_device_ID, var_meter_ID);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("asset", asset);
		isApplicableMatch.registerObject("pair", pair);
		isApplicableMatch.registerObject("values", values);
		isApplicableMatch.registerObject("device", device);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject asset, EObject assetToMeter,
			EObject mmxuToMeter, EObject pair, EObject meter, EObject values, EObject device) {
		ruleresult.registerObject("asset", asset);
		ruleresult.registerObject("assetToMeter", assetToMeter);
		ruleresult.registerObject("mmxuToMeter", mmxuToMeter);
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("meter", meter);
		ruleresult.registerObject("values", values);
		ruleresult.registerObject("device", device);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("pair").eClass())
				.equals("gluemodel.MeterAssetPhysicalDevicePair.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_34(EMoflonEdge _edge_a) {
		// prepare return value
		Object[] result1_bindingAndBlack = PrivateMeterVoltageImpl
				.pattern_PrivateMeterVoltage_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = PrivateMeterVoltageImpl.pattern_PrivateMeterVoltage_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PrivateMeterVoltageImpl
				.pattern_PrivateMeterVoltage_10_2_testcorematchandDECs_blackFFFFB(_edge_a)) {
			MeterAsset asset = (MeterAsset) result2_black[0];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_black[1];
			ElectricityValues values = (ElectricityValues) result2_black[2];
			PhysicalDevice device = (PhysicalDevice) result2_black[3];
			Object[] result2_green = PrivateMeterVoltageImpl
					.pattern_PrivateMeterVoltage_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PrivateMeterVoltageImpl
					.pattern_PrivateMeterVoltage_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, asset, pair, values, device)) {
				// Ensure that the correct types of elements are matched
				if (PrivateMeterVoltageImpl
						.pattern_PrivateMeterVoltage_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = PrivateMeterVoltageImpl
							.pattern_PrivateMeterVoltage_10_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					PrivateMeterVoltageImpl.pattern_PrivateMeterVoltage_10_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return PrivateMeterVoltageImpl.pattern_PrivateMeterVoltage_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("PrivateMeterVoltage");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_meter_VoltageA = CSPFactoryHelper.eINSTANCE.createVariable("meter", true, csp);
		var_meter_VoltageA.setValue(__helper.getValue("meter", "VoltageA"));
		var_meter_VoltageA.setType("double");

		Variable var_values_VoltageL1 = CSPFactoryHelper.eINSTANCE.createVariable("values", true, csp);
		var_values_VoltageL1.setValue(__helper.getValue("values", "VoltageL1"));
		var_values_VoltageL1.setType("double");

		Variable var_values_VoltageL3 = CSPFactoryHelper.eINSTANCE.createVariable("values", true, csp);
		var_values_VoltageL3.setValue(__helper.getValue("values", "VoltageL3"));
		var_values_VoltageL3.setType("double");

		Variable var_meter_VoltageC = CSPFactoryHelper.eINSTANCE.createVariable("meter", true, csp);
		var_meter_VoltageC.setValue(__helper.getValue("meter", "VoltageC"));
		var_meter_VoltageC.setType("double");

		Variable var_values_VoltageL2 = CSPFactoryHelper.eINSTANCE.createVariable("values", true, csp);
		var_values_VoltageL2.setValue(__helper.getValue("values", "VoltageL2"));
		var_values_VoltageL2.setType("double");

		Variable var_meter_ID = CSPFactoryHelper.eINSTANCE.createVariable("meter", true, csp);
		var_meter_ID.setValue(__helper.getValue("meter", "ID"));
		var_meter_ID.setType("String");

		Variable var_meter_VoltageB = CSPFactoryHelper.eINSTANCE.createVariable("meter", true, csp);
		var_meter_VoltageB.setValue(__helper.getValue("meter", "VoltageB"));
		var_meter_VoltageB.setType("double");

		Variable var_device_ID = CSPFactoryHelper.eINSTANCE.createVariable("device", true, csp);
		var_device_ID.setValue(__helper.getValue("device", "ID"));
		var_device_ID.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		Eq eq2 = new Eq();
		csp.getConstraints().add(eq2);

		Eq eq3 = new Eq();
		csp.getConstraints().add(eq3);

		eq0.setRuleName("PrivateMeterVoltage");
		eq0.solve(var_values_VoltageL1, var_meter_VoltageA);

		eq1.setRuleName("PrivateMeterVoltage");
		eq1.solve(var_values_VoltageL3, var_meter_VoltageC);

		eq2.setRuleName("PrivateMeterVoltage");
		eq2.solve(var_values_VoltageL2, var_meter_VoltageB);

		eq3.setRuleName("PrivateMeterVoltage");
		eq3.solve(var_device_ID, var_meter_ID);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_meter_VoltageA.setBound(false);
			var_meter_VoltageC.setBound(false);
			var_meter_VoltageB.setBound(false);
			var_meter_ID.setBound(false);
			eq0.solve(var_values_VoltageL1, var_meter_VoltageA);
			eq1.solve(var_values_VoltageL3, var_meter_VoltageC);
			eq2.solve(var_values_VoltageL2, var_meter_VoltageB);
			eq3.solve(var_device_ID, var_meter_ID);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("meter", "VoltageA", var_meter_VoltageA.getValue());
				__helper.setValue("meter", "VoltageC", var_meter_VoltageC.getValue());
				__helper.setValue("meter", "VoltageB", var_meter_VoltageB.getValue());
				__helper.setValue("meter", "ID", var_meter_ID.getValue());
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
	public boolean checkDEC_FWD(MeterAsset asset, MeterAssetPhysicalDevicePair pair, ElectricityValues values,
			PhysicalDevice device) {// match tgg pattern
		Object[] result1_black = PrivateMeterVoltageImpl
				.pattern_PrivateMeterVoltage_13_1_matchtggpattern_blackBBBB(asset, pair, values, device);
		if (result1_black != null) {
			return PrivateMeterVoltageImpl.pattern_PrivateMeterVoltage_13_2_expressionF();
		} else {
			return PrivateMeterVoltageImpl.pattern_PrivateMeterVoltage_13_3_expressionF();
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
		case RulesPackage.PRIVATE_METER_VOLTAGE___IS_APPROPRIATE_FWD__MATCH_METERASSET_METERASSETPHYSICALDEVICEPAIR_ELECTRICITYVALUES_PHYSICALDEVICE:
			return isAppropriate_FWD((Match) arguments.get(0), (MeterAsset) arguments.get(1),
					(MeterAssetPhysicalDevicePair) arguments.get(2), (ElectricityValues) arguments.get(3),
					(PhysicalDevice) arguments.get(4));
		case RulesPackage.PRIVATE_METER_VOLTAGE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PRIVATE_METER_VOLTAGE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PRIVATE_METER_VOLTAGE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSET_METERASSETPHYSICALDEVICEPAIR_ELECTRICITYVALUES_PHYSICALDEVICE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MeterAsset) arguments.get(1),
					(MeterAssetPhysicalDevicePair) arguments.get(2), (ElectricityValues) arguments.get(3),
					(PhysicalDevice) arguments.get(4));
			return null;
		case RulesPackage.PRIVATE_METER_VOLTAGE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSET_METERASSETPHYSICALDEVICEPAIR_ELECTRICITYVALUES_PHYSICALDEVICE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MeterAsset) arguments.get(1),
					(MeterAssetPhysicalDevicePair) arguments.get(2), (ElectricityValues) arguments.get(3),
					(PhysicalDevice) arguments.get(4));
		case RulesPackage.PRIVATE_METER_VOLTAGE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PRIVATE_METER_VOLTAGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METERASSET_METERASSETPHYSICALDEVICEPAIR_ELECTRICITYVALUES_PHYSICALDEVICE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MeterAsset) arguments.get(1),
					(MeterAssetPhysicalDevicePair) arguments.get(2), (ElectricityValues) arguments.get(3),
					(PhysicalDevice) arguments.get(4));
		case RulesPackage.PRIVATE_METER_VOLTAGE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PRIVATE_METER_VOLTAGE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.PRIVATE_METER_VOLTAGE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PRIVATE_METER_VOLTAGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_34__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_34((EMoflonEdge) arguments.get(0));
		case RulesPackage.PRIVATE_METER_VOLTAGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PRIVATE_METER_VOLTAGE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.PRIVATE_METER_VOLTAGE___CHECK_DEC_FWD__METERASSET_METERASSETPHYSICALDEVICEPAIR_ELECTRICITYVALUES_PHYSICALDEVICE:
			return checkDEC_FWD((MeterAsset) arguments.get(0), (MeterAssetPhysicalDevicePair) arguments.get(1),
					(ElectricityValues) arguments.get(2), (PhysicalDevice) arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_PrivateMeterVoltage_0_1_initialbindings_blackBBBBBB(PrivateMeterVoltage _this,
			Match match, MeterAsset asset, MeterAssetPhysicalDevicePair pair, ElectricityValues values,
			PhysicalDevice device) {
		return new Object[] { _this, match, asset, pair, values, device };
	}

	public static final Object[] pattern_PrivateMeterVoltage_0_2_SolveCSP_bindingFBBBBBB(PrivateMeterVoltage _this,
			Match match, MeterAsset asset, MeterAssetPhysicalDevicePair pair, ElectricityValues values,
			PhysicalDevice device) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, asset, pair, values, device);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, asset, pair, values, device };
		}
		return null;
	}

	public static final Object[] pattern_PrivateMeterVoltage_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrivateMeterVoltage_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			PrivateMeterVoltage _this, Match match, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			ElectricityValues values, PhysicalDevice device) {
		Object[] result_pattern_PrivateMeterVoltage_0_2_SolveCSP_binding = pattern_PrivateMeterVoltage_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, asset, pair, values, device);
		if (result_pattern_PrivateMeterVoltage_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PrivateMeterVoltage_0_2_SolveCSP_binding[0];

			Object[] result_pattern_PrivateMeterVoltage_0_2_SolveCSP_black = pattern_PrivateMeterVoltage_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_PrivateMeterVoltage_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, asset, pair, values, device };
			}
		}
		return null;
	}

	public static final boolean pattern_PrivateMeterVoltage_0_3_CheckCSP_expressionFBB(PrivateMeterVoltage _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrivateMeterVoltage_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, ElectricityValues values, PhysicalDevice device) {
		return new Object[] { match, asset, pair, values, device };
	}

	public static final Object[] pattern_PrivateMeterVoltage_0_4_collectelementstobetranslated_greenBBBBFF(Match match,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, PhysicalDevice device) {
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__device____b = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(pair);
		String pair__asset____a_name_prime = "a";
		String pair__device____b_name_prime = "b";
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		match.getToBeTranslatedEdges().add(pair__asset____a);
		pair__device____b.setSrc(pair);
		pair__device____b.setTrg(device);
		match.getToBeTranslatedEdges().add(pair__device____b);
		pair__asset____a.setName(pair__asset____a_name_prime);
		pair__device____b.setName(pair__device____b_name_prime);
		return new Object[] { match, asset, pair, device, pair__asset____a, pair__device____b };
	}

	public static final Object[] pattern_PrivateMeterVoltage_0_5_collectcontextelements_blackBBBBB(Match match,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, ElectricityValues values, PhysicalDevice device) {
		return new Object[] { match, asset, pair, values, device };
	}

	public static final Object[] pattern_PrivateMeterVoltage_0_5_collectcontextelements_greenBBBBF(Match match,
			MeterAsset asset, ElectricityValues values, PhysicalDevice device) {
		EMoflonEdge device__values____ElectricityValues = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(asset);
		match.getContextNodes().add(values);
		match.getContextNodes().add(device);
		String device__values____ElectricityValues_name_prime = "ElectricityValues";
		device__values____ElectricityValues.setSrc(device);
		device__values____ElectricityValues.setTrg(values);
		match.getContextEdges().add(device__values____ElectricityValues);
		device__values____ElectricityValues.setName(device__values____ElectricityValues_name_prime);
		return new Object[] { match, asset, values, device, device__values____ElectricityValues };
	}

	public static final void pattern_PrivateMeterVoltage_0_6_registerobjectstomatch_expressionBBBBBB(
			PrivateMeterVoltage _this, Match match, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			ElectricityValues values, PhysicalDevice device) {
		_this.registerObjectsToMatch_FWD(match, asset, pair, values, device);

	}

	public static final boolean pattern_PrivateMeterVoltage_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PrivateMeterVoltage_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PrivateMeterVoltage_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("asset");
		EObject _localVariable_1 = isApplicableMatch.getObject("pair");
		EObject _localVariable_2 = isApplicableMatch.getObject("values");
		EObject _localVariable_3 = isApplicableMatch.getObject("device");
		EObject tmpAsset = _localVariable_0;
		EObject tmpPair = _localVariable_1;
		EObject tmpValues = _localVariable_2;
		EObject tmpDevice = _localVariable_3;
		if (tmpAsset instanceof MeterAsset) {
			MeterAsset asset = (MeterAsset) tmpAsset;
			if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
				MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
				if (tmpValues instanceof ElectricityValues) {
					ElectricityValues values = (ElectricityValues) tmpValues;
					if (tmpDevice instanceof PhysicalDevice) {
						PhysicalDevice device = (PhysicalDevice) tmpDevice;
						return new Object[] { asset, pair, values, device, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PrivateMeterVoltage_1_1_performtransformation_blackBBBBFBB(MeterAsset asset,
			MeterAssetPhysicalDevicePair pair, ElectricityValues values, PhysicalDevice device,
			PrivateMeterVoltage _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { asset, pair, values, device, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrivateMeterVoltage_1_1_performtransformation_bindingAndBlackFFFFFBB(
			PrivateMeterVoltage _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PrivateMeterVoltage_1_1_performtransformation_binding = pattern_PrivateMeterVoltage_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_PrivateMeterVoltage_1_1_performtransformation_binding != null) {
			MeterAsset asset = (MeterAsset) result_pattern_PrivateMeterVoltage_1_1_performtransformation_binding[0];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result_pattern_PrivateMeterVoltage_1_1_performtransformation_binding[1];
			ElectricityValues values = (ElectricityValues) result_pattern_PrivateMeterVoltage_1_1_performtransformation_binding[2];
			PhysicalDevice device = (PhysicalDevice) result_pattern_PrivateMeterVoltage_1_1_performtransformation_binding[3];

			Object[] result_pattern_PrivateMeterVoltage_1_1_performtransformation_black = pattern_PrivateMeterVoltage_1_1_performtransformation_blackBBBBFBB(
					asset, pair, values, device, _this, isApplicableMatch);
			if (result_pattern_PrivateMeterVoltage_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_PrivateMeterVoltage_1_1_performtransformation_black[4];

				return new Object[] { asset, pair, values, device, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrivateMeterVoltage_1_1_performtransformation_greenBFFFBB(MeterAsset asset,
			PhysicalDevice device, CSP csp) {
		MeterAssetToPrivateMeterVoltage assetToMeter = Task2Factory.eINSTANCE.createMeterAssetToPrivateMeterVoltage();
		PhysicalDeviceToPrivateMeterVoltage mmxuToMeter = Task2Factory.eINSTANCE
				.createPhysicalDeviceToPrivateMeterVoltage();
		outagePreventionJointarget.PrivateMeterVoltage meter = OutagePreventionJointargetFactory.eINSTANCE
				.createPrivateMeterVoltage();
		Object _localVariable_0 = csp.getValue("meter", "VoltageA");
		Object _localVariable_1 = csp.getValue("meter", "VoltageC");
		Object _localVariable_2 = csp.getValue("meter", "VoltageB");
		Object _localVariable_3 = csp.getValue("meter", "ID");
		assetToMeter.setSource(asset);
		mmxuToMeter.setSource(device);
		assetToMeter.setTarget(meter);
		mmxuToMeter.setTarget(meter);
		double meter_VoltageA_prime = (double) _localVariable_0;
		double meter_VoltageC_prime = (double) _localVariable_1;
		double meter_VoltageB_prime = (double) _localVariable_2;
		String meter_ID_prime = (String) _localVariable_3;
		meter.setVoltageA(Double.valueOf(meter_VoltageA_prime));
		meter.setVoltageC(Double.valueOf(meter_VoltageC_prime));
		meter.setVoltageB(Double.valueOf(meter_VoltageB_prime));
		meter.setID(meter_ID_prime);
		return new Object[] { asset, assetToMeter, mmxuToMeter, meter, device, csp };
	}

	public static final Object[] pattern_PrivateMeterVoltage_1_2_collecttranslatedelements_blackBBBB(
			MeterAssetToPrivateMeterVoltage assetToMeter, PhysicalDeviceToPrivateMeterVoltage mmxuToMeter,
			MeterAssetPhysicalDevicePair pair, outagePreventionJointarget.PrivateMeterVoltage meter) {
		return new Object[] { assetToMeter, mmxuToMeter, pair, meter };
	}

	public static final Object[] pattern_PrivateMeterVoltage_1_2_collecttranslatedelements_greenFBBBB(
			MeterAssetToPrivateMeterVoltage assetToMeter, PhysicalDeviceToPrivateMeterVoltage mmxuToMeter,
			MeterAssetPhysicalDevicePair pair, outagePreventionJointarget.PrivateMeterVoltage meter) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(assetToMeter);
		ruleresult.getCreatedLinkElements().add(mmxuToMeter);
		ruleresult.getTranslatedElements().add(pair);
		ruleresult.getCreatedElements().add(meter);
		return new Object[] { ruleresult, assetToMeter, mmxuToMeter, pair, meter };
	}

	public static final Object[] pattern_PrivateMeterVoltage_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject asset, EObject assetToMeter, EObject mmxuToMeter, EObject pair,
			EObject meter, EObject values, EObject device) {
		if (!asset.equals(assetToMeter)) {
			if (!asset.equals(mmxuToMeter)) {
				if (!asset.equals(pair)) {
					if (!asset.equals(meter)) {
						if (!asset.equals(values)) {
							if (!asset.equals(device)) {
								if (!assetToMeter.equals(mmxuToMeter)) {
									if (!assetToMeter.equals(pair)) {
										if (!assetToMeter.equals(meter)) {
											if (!assetToMeter.equals(values)) {
												if (!assetToMeter.equals(device)) {
													if (!mmxuToMeter.equals(pair)) {
														if (!mmxuToMeter.equals(values)) {
															if (!pair.equals(values)) {
																if (!meter.equals(mmxuToMeter)) {
																	if (!meter.equals(pair)) {
																		if (!meter.equals(values)) {
																			if (!device.equals(mmxuToMeter)) {
																				if (!device.equals(pair)) {
																					if (!device.equals(meter)) {
																						if (!device.equals(values)) {
																							return new Object[] {
																									ruleresult, asset,
																									assetToMeter,
																									mmxuToMeter, pair,
																									meter, values,
																									device };
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

	public static final Object[] pattern_PrivateMeterVoltage_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject asset, EObject assetToMeter, EObject mmxuToMeter, EObject pair,
			EObject meter, EObject device) {
		EMoflonEdge assetToMeter__asset____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__device____b = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge assetToMeter__meter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mmxuToMeter__meter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mmxuToMeter__device____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PrivateMeterVoltage";
		String assetToMeter__asset____source_name_prime = "source";
		String pair__asset____a_name_prime = "a";
		String pair__device____b_name_prime = "b";
		String assetToMeter__meter____target_name_prime = "target";
		String mmxuToMeter__meter____target_name_prime = "target";
		String mmxuToMeter__device____source_name_prime = "source";
		assetToMeter__asset____source.setSrc(assetToMeter);
		assetToMeter__asset____source.setTrg(asset);
		ruleresult.getCreatedEdges().add(assetToMeter__asset____source);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		ruleresult.getTranslatedEdges().add(pair__asset____a);
		pair__device____b.setSrc(pair);
		pair__device____b.setTrg(device);
		ruleresult.getTranslatedEdges().add(pair__device____b);
		assetToMeter__meter____target.setSrc(assetToMeter);
		assetToMeter__meter____target.setTrg(meter);
		ruleresult.getCreatedEdges().add(assetToMeter__meter____target);
		mmxuToMeter__meter____target.setSrc(mmxuToMeter);
		mmxuToMeter__meter____target.setTrg(meter);
		ruleresult.getCreatedEdges().add(mmxuToMeter__meter____target);
		mmxuToMeter__device____source.setSrc(mmxuToMeter);
		mmxuToMeter__device____source.setTrg(device);
		ruleresult.getCreatedEdges().add(mmxuToMeter__device____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		assetToMeter__asset____source.setName(assetToMeter__asset____source_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		pair__device____b.setName(pair__device____b_name_prime);
		assetToMeter__meter____target.setName(assetToMeter__meter____target_name_prime);
		mmxuToMeter__meter____target.setName(mmxuToMeter__meter____target_name_prime);
		mmxuToMeter__device____source.setName(mmxuToMeter__device____source_name_prime);
		return new Object[] { ruleresult, asset, assetToMeter, mmxuToMeter, pair, meter, device,
				assetToMeter__asset____source, pair__asset____a, pair__device____b, assetToMeter__meter____target,
				mmxuToMeter__meter____target, mmxuToMeter__device____source };
	}

	public static final void pattern_PrivateMeterVoltage_1_5_registerobjects_expressionBBBBBBBBB(
			PrivateMeterVoltage _this, PerformRuleResult ruleresult, EObject asset, EObject assetToMeter,
			EObject mmxuToMeter, EObject pair, EObject meter, EObject values, EObject device) {
		_this.registerObjects_FWD(ruleresult, asset, assetToMeter, mmxuToMeter, pair, meter, values, device);

	}

	public static final PerformRuleResult pattern_PrivateMeterVoltage_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PrivateMeterVoltage_2_1_preparereturnvalue_bindingFB(
			PrivateMeterVoltage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PrivateMeterVoltage_2_1_preparereturnvalue_blackFBB(EClass eClass,
			PrivateMeterVoltage _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PrivateMeterVoltage_2_1_preparereturnvalue_bindingAndBlackFFB(
			PrivateMeterVoltage _this) {
		Object[] result_pattern_PrivateMeterVoltage_2_1_preparereturnvalue_binding = pattern_PrivateMeterVoltage_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PrivateMeterVoltage_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_PrivateMeterVoltage_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PrivateMeterVoltage_2_1_preparereturnvalue_black = pattern_PrivateMeterVoltage_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_PrivateMeterVoltage_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PrivateMeterVoltage_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrivateMeterVoltage_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "PrivateMeterVoltage";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PrivateMeterVoltage_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("asset");
		EObject _localVariable_1 = match.getObject("pair");
		EObject _localVariable_2 = match.getObject("values");
		EObject _localVariable_3 = match.getObject("device");
		EObject tmpAsset = _localVariable_0;
		EObject tmpPair = _localVariable_1;
		EObject tmpValues = _localVariable_2;
		EObject tmpDevice = _localVariable_3;
		if (tmpAsset instanceof MeterAsset) {
			MeterAsset asset = (MeterAsset) tmpAsset;
			if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
				MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
				if (tmpValues instanceof ElectricityValues) {
					ElectricityValues values = (ElectricityValues) tmpValues;
					if (tmpDevice instanceof PhysicalDevice) {
						PhysicalDevice device = (PhysicalDevice) tmpDevice;
						return new Object[] { asset, pair, values, device, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PrivateMeterVoltage_2_2_corematch_blackBBBBB(MeterAsset asset,
			MeterAssetPhysicalDevicePair pair, ElectricityValues values, PhysicalDevice device, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { asset, pair, values, device, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_PrivateMeterVoltage_2_3_findcontext_blackBBBB(MeterAsset asset,
			MeterAssetPhysicalDevicePair pair, ElectricityValues values, PhysicalDevice device) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (asset.equals(pair.getA())) {
			if (device.equals(pair.getB())) {
				if (values.equals(device.getElectricityValues())) {
					_result.add(new Object[] { asset, pair, values, device });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_PrivateMeterVoltage_2_3_findcontext_greenBBBBFFFF(MeterAsset asset,
			MeterAssetPhysicalDevicePair pair, ElectricityValues values, PhysicalDevice device) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__device____b = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device__values____ElectricityValues = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pair__asset____a_name_prime = "a";
		String pair__device____b_name_prime = "b";
		String device__values____ElectricityValues_name_prime = "ElectricityValues";
		isApplicableMatch.getAllContextElements().add(asset);
		isApplicableMatch.getAllContextElements().add(pair);
		isApplicableMatch.getAllContextElements().add(values);
		isApplicableMatch.getAllContextElements().add(device);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(pair__asset____a);
		pair__device____b.setSrc(pair);
		pair__device____b.setTrg(device);
		isApplicableMatch.getAllContextElements().add(pair__device____b);
		device__values____ElectricityValues.setSrc(device);
		device__values____ElectricityValues.setTrg(values);
		isApplicableMatch.getAllContextElements().add(device__values____ElectricityValues);
		pair__asset____a.setName(pair__asset____a_name_prime);
		pair__device____b.setName(pair__device____b_name_prime);
		device__values____ElectricityValues.setName(device__values____ElectricityValues_name_prime);
		return new Object[] { asset, pair, values, device, isApplicableMatch, pair__asset____a, pair__device____b,
				device__values____ElectricityValues };
	}

	public static final Object[] pattern_PrivateMeterVoltage_2_4_solveCSP_bindingFBBBBBB(PrivateMeterVoltage _this,
			IsApplicableMatch isApplicableMatch, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			ElectricityValues values, PhysicalDevice device) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, asset, pair, values, device);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, asset, pair, values, device };
		}
		return null;
	}

	public static final Object[] pattern_PrivateMeterVoltage_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrivateMeterVoltage_2_4_solveCSP_bindingAndBlackFBBBBBB(
			PrivateMeterVoltage _this, IsApplicableMatch isApplicableMatch, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair, ElectricityValues values, PhysicalDevice device) {
		Object[] result_pattern_PrivateMeterVoltage_2_4_solveCSP_binding = pattern_PrivateMeterVoltage_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, asset, pair, values, device);
		if (result_pattern_PrivateMeterVoltage_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PrivateMeterVoltage_2_4_solveCSP_binding[0];

			Object[] result_pattern_PrivateMeterVoltage_2_4_solveCSP_black = pattern_PrivateMeterVoltage_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_PrivateMeterVoltage_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, asset, pair, values, device };
			}
		}
		return null;
	}

	public static final boolean pattern_PrivateMeterVoltage_2_5_checkCSP_expressionFBB(PrivateMeterVoltage _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrivateMeterVoltage_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PrivateMeterVoltage_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PrivateMeterVoltage";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PrivateMeterVoltage_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PrivateMeterVoltage_10_1_preparereturnvalue_bindingFB(
			PrivateMeterVoltage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PrivateMeterVoltage_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			PrivateMeterVoltage _this) {
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

	public static final Object[] pattern_PrivateMeterVoltage_10_1_preparereturnvalue_bindingAndBlackFFBF(
			PrivateMeterVoltage _this) {
		Object[] result_pattern_PrivateMeterVoltage_10_1_preparereturnvalue_binding = pattern_PrivateMeterVoltage_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PrivateMeterVoltage_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_PrivateMeterVoltage_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PrivateMeterVoltage_10_1_preparereturnvalue_black = pattern_PrivateMeterVoltage_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_PrivateMeterVoltage_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PrivateMeterVoltage_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_PrivateMeterVoltage_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrivateMeterVoltage_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_PrivateMeterVoltage_10_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_a) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPair = _edge_a.getSrc();
		if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
			EObject tmpAsset = _edge_a.getTrg();
			if (tmpAsset instanceof MeterAsset) {
				MeterAsset asset = (MeterAsset) tmpAsset;
				if (asset.equals(pair.getA())) {
					PhysicalDevice device = pair.getB();
					if (device != null) {
						ElectricityValues values = device.getElectricityValues();
						if (values != null) {
							_result.add(new Object[] { asset, pair, values, device, _edge_a });
						}

					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_PrivateMeterVoltage_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PrivateMeterVoltage_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			PrivateMeterVoltage _this, Match match, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			ElectricityValues values, PhysicalDevice device) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, asset, pair, values, device);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PrivateMeterVoltage_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			PrivateMeterVoltage _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrivateMeterVoltage_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_PrivateMeterVoltage_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_PrivateMeterVoltage_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PrivateMeterVoltage_13_1_matchtggpattern_blackBBBB(MeterAsset asset,
			MeterAssetPhysicalDevicePair pair, ElectricityValues values, PhysicalDevice device) {
		if (asset.equals(pair.getA())) {
			if (device.equals(pair.getB())) {
				if (values.equals(device.getElectricityValues())) {
					return new Object[] { asset, pair, values, device };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_PrivateMeterVoltage_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PrivateMeterVoltage_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //PrivateMeterVoltageImpl
