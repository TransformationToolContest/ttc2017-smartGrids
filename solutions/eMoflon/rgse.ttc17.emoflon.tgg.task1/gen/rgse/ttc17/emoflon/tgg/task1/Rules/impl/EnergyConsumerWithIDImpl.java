/**
 */
package rgse.ttc17.emoflon.tgg.task1.Rules.impl;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61970.Wires.EnergyConsumer;

import gluemodel.COSEM.COSEMObjects.AutoConnectObject;
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

import outageDetectionJointarget.OutageDetectionJointargetFactory;

import rgse.ttc17.emoflon.tgg.task1.MeterAssetToEnergyConsumer;
import rgse.ttc17.emoflon.tgg.task1.PhysicalDeviceToEnergyConsumer;

import rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID;
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
 * An implementation of the model object '<em><b>Energy Consumer With ID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EnergyConsumerWithIDImpl extends AbstractRuleImpl implements EnergyConsumerWithID {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnergyConsumerWithIDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getEnergyConsumerWithID();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ElectricityValues electric, ServiceDeliveryPoint deliver,
			MeterAsset asset, PhysicalDevice device, EnergyConsumer consumer, AutoConnectObject connect,
			MeterAssetPhysicalDevicePair pair) {
		// initial bindings
		Object[] result1_black = EnergyConsumerWithIDImpl
				.pattern_EnergyConsumerWithID_0_1_initialbindings_blackBBBBBBBBB(this, match, electric, deliver, asset,
						device, consumer, connect, pair);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[electric] = " + electric + ", "
					+ "[deliver] = " + deliver + ", " + "[asset] = " + asset + ", " + "[device] = " + device + ", "
					+ "[consumer] = " + consumer + ", " + "[connect] = " + connect + ", " + "[pair] = " + pair + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = EnergyConsumerWithIDImpl
				.pattern_EnergyConsumerWithID_0_2_SolveCSP_bindingAndBlackFBBBBBBBBB(this, match, electric, deliver,
						asset, device, consumer, connect, pair);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[electric] = " + electric + ", " + "[deliver] = "
					+ deliver + ", " + "[asset] = " + asset + ", " + "[device] = " + device + ", " + "[consumer] = "
					+ consumer + ", " + "[connect] = " + connect + ", " + "[pair] = " + pair + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (EnergyConsumerWithIDImpl.pattern_EnergyConsumerWithID_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = EnergyConsumerWithIDImpl
					.pattern_EnergyConsumerWithID_0_4_collectelementstobetranslated_blackBBBBBBBB(match, electric,
							deliver, asset, device, consumer, connect, pair);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[electric] = " + electric + ", "
						+ "[deliver] = " + deliver + ", " + "[asset] = " + asset + ", " + "[device] = " + device + ", "
						+ "[consumer] = " + consumer + ", " + "[connect] = " + connect + ", " + "[pair] = " + pair
						+ ".");
			}
			EnergyConsumerWithIDImpl.pattern_EnergyConsumerWithID_0_4_collectelementstobetranslated_greenBBBBFF(match,
					asset, device, pair);
			// EMoflonEdge pair__device____b = (EMoflonEdge) result4_green[4];
			// EMoflonEdge pair__asset____a = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = EnergyConsumerWithIDImpl
					.pattern_EnergyConsumerWithID_0_5_collectcontextelements_blackBBBBBBBB(match, electric, deliver,
							asset, device, consumer, connect, pair);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[electric] = " + electric + ", " + "[deliver] = " + deliver + ", "
								+ "[asset] = " + asset + ", " + "[device] = " + device + ", " + "[consumer] = "
								+ consumer + ", " + "[connect] = " + connect + ", " + "[pair] = " + pair + ".");
			}
			EnergyConsumerWithIDImpl.pattern_EnergyConsumerWithID_0_5_collectcontextelements_greenBBBBBBBFFFFFF(match,
					electric, deliver, asset, device, consumer, connect);
			// EMoflonEdge deliver__consumer____EnergyConsumer = (EMoflonEdge) result5_green[7];
			// EMoflonEdge consumer__deliver____ServiceDeliveryPoints = (EMoflonEdge) result5_green[8];
			// EMoflonEdge device__connect____AutoConnect = (EMoflonEdge) result5_green[9];
			// EMoflonEdge device__electric____ElectricityValues = (EMoflonEdge) result5_green[10];
			// EMoflonEdge asset__deliver____ServiceDeliveryPoint = (EMoflonEdge) result5_green[11];
			// EMoflonEdge deliver__asset____EndDeviceAssets = (EMoflonEdge) result5_green[12];

			// register objects to match
			EnergyConsumerWithIDImpl.pattern_EnergyConsumerWithID_0_6_registerobjectstomatch_expressionBBBBBBBBB(this,
					match, electric, deliver, asset, device, consumer, connect, pair);
			return EnergyConsumerWithIDImpl.pattern_EnergyConsumerWithID_0_7_expressionF();
		} else {
			return EnergyConsumerWithIDImpl.pattern_EnergyConsumerWithID_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = EnergyConsumerWithIDImpl
				.pattern_EnergyConsumerWithID_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ElectricityValues electric = (ElectricityValues) result1_bindingAndBlack[0];
		ServiceDeliveryPoint deliver = (ServiceDeliveryPoint) result1_bindingAndBlack[1];
		MeterAsset asset = (MeterAsset) result1_bindingAndBlack[2];
		PhysicalDevice device = (PhysicalDevice) result1_bindingAndBlack[3];
		EnergyConsumer consumer = (EnergyConsumer) result1_bindingAndBlack[4];
		AutoConnectObject connect = (AutoConnectObject) result1_bindingAndBlack[5];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = EnergyConsumerWithIDImpl
				.pattern_EnergyConsumerWithID_1_1_performtransformation_greenFFBBFB(asset, device, csp);
		MeterAssetToEnergyConsumer assetCorr = (MeterAssetToEnergyConsumer) result1_green[0];
		PhysicalDeviceToEnergyConsumer deviceCorr = (PhysicalDeviceToEnergyConsumer) result1_green[1];
		outageDetectionJointarget.EnergyConsumer trgConsumer = (outageDetectionJointarget.EnergyConsumer) result1_green[4];

		// collect translated elements
		Object[] result2_black = EnergyConsumerWithIDImpl
				.pattern_EnergyConsumerWithID_1_2_collecttranslatedelements_blackBBBB(assetCorr, deviceCorr, pair,
						trgConsumer);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[assetCorr] = " + assetCorr + ", " + "[deviceCorr] = " + deviceCorr + ", " + "[pair] = " + pair
					+ ", " + "[trgConsumer] = " + trgConsumer + ".");
		}
		Object[] result2_green = EnergyConsumerWithIDImpl
				.pattern_EnergyConsumerWithID_1_2_collecttranslatedelements_greenFBBBB(assetCorr, deviceCorr, pair,
						trgConsumer);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = EnergyConsumerWithIDImpl
				.pattern_EnergyConsumerWithID_1_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, assetCorr, electric,
						deliver, deviceCorr, asset, device, consumer, connect, pair, trgConsumer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[assetCorr] = " + assetCorr + ", " + "[electric] = "
					+ electric + ", " + "[deliver] = " + deliver + ", " + "[deviceCorr] = " + deviceCorr + ", "
					+ "[asset] = " + asset + ", " + "[device] = " + device + ", " + "[consumer] = " + consumer + ", "
					+ "[connect] = " + connect + ", " + "[pair] = " + pair + ", " + "[trgConsumer] = " + trgConsumer
					+ ".");
		}
		EnergyConsumerWithIDImpl.pattern_EnergyConsumerWithID_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(ruleresult,
				assetCorr, deviceCorr, asset, device, pair, trgConsumer);
		// EMoflonEdge deviceCorr__device____source = (EMoflonEdge) result3_green[7];
		// EMoflonEdge assetCorr__trgConsumer____target = (EMoflonEdge) result3_green[8];
		// EMoflonEdge assetCorr__asset____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge deviceCorr__trgConsumer____target = (EMoflonEdge) result3_green[10];
		// EMoflonEdge pair__device____b = (EMoflonEdge) result3_green[11];
		// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[12];

		// perform postprocessing story node is empty
		// register objects
		EnergyConsumerWithIDImpl.pattern_EnergyConsumerWithID_1_5_registerobjects_expressionBBBBBBBBBBBB(this,
				ruleresult, assetCorr, electric, deliver, deviceCorr, asset, device, consumer, connect, pair,
				trgConsumer);
		return EnergyConsumerWithIDImpl.pattern_EnergyConsumerWithID_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = EnergyConsumerWithIDImpl
				.pattern_EnergyConsumerWithID_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EnergyConsumerWithIDImpl
				.pattern_EnergyConsumerWithID_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = EnergyConsumerWithIDImpl
				.pattern_EnergyConsumerWithID_2_2_corematch_bindingFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ElectricityValues electric = (ElectricityValues) result2_binding[0];
		ServiceDeliveryPoint deliver = (ServiceDeliveryPoint) result2_binding[1];
		MeterAsset asset = (MeterAsset) result2_binding[2];
		PhysicalDevice device = (PhysicalDevice) result2_binding[3];
		EnergyConsumer consumer = (EnergyConsumer) result2_binding[4];
		AutoConnectObject connect = (AutoConnectObject) result2_binding[5];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_binding[6];
		for (Object[] result2_black : EnergyConsumerWithIDImpl.pattern_EnergyConsumerWithID_2_2_corematch_blackBBBBBBBB(
				electric, deliver, asset, device, consumer, connect, pair, match)) {
			// ForEach find context
			for (Object[] result3_black : EnergyConsumerWithIDImpl
					.pattern_EnergyConsumerWithID_2_3_findcontext_blackBBBBBBB(electric, deliver, asset, device,
							consumer, connect, pair)) {
				Object[] result3_green = EnergyConsumerWithIDImpl
						.pattern_EnergyConsumerWithID_2_3_findcontext_greenBBBBBBBFFFFFFFFF(electric, deliver, asset,
								device, consumer, connect, pair);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge deliver__consumer____EnergyConsumer = (EMoflonEdge) result3_green[8];
				// EMoflonEdge consumer__deliver____ServiceDeliveryPoints = (EMoflonEdge) result3_green[9];
				// EMoflonEdge device__connect____AutoConnect = (EMoflonEdge) result3_green[10];
				// EMoflonEdge device__electric____ElectricityValues = (EMoflonEdge) result3_green[11];
				// EMoflonEdge pair__device____b = (EMoflonEdge) result3_green[12];
				// EMoflonEdge asset__deliver____ServiceDeliveryPoint = (EMoflonEdge) result3_green[13];
				// EMoflonEdge deliver__asset____EndDeviceAssets = (EMoflonEdge) result3_green[14];
				// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[15];

				// solve CSP
				Object[] result4_bindingAndBlack = EnergyConsumerWithIDImpl
						.pattern_EnergyConsumerWithID_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								electric, deliver, asset, device, consumer, connect, pair);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[electric] = " + electric + ", " + "[deliver] = " + deliver + ", " + "[asset] = " + asset
							+ ", " + "[device] = " + device + ", " + "[consumer] = " + consumer + ", " + "[connect] = "
							+ connect + ", " + "[pair] = " + pair + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (EnergyConsumerWithIDImpl.pattern_EnergyConsumerWithID_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = EnergyConsumerWithIDImpl
							.pattern_EnergyConsumerWithID_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					EnergyConsumerWithIDImpl.pattern_EnergyConsumerWithID_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return EnergyConsumerWithIDImpl.pattern_EnergyConsumerWithID_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ElectricityValues electric, ServiceDeliveryPoint deliver,
			MeterAsset asset, PhysicalDevice device, EnergyConsumer consumer, AutoConnectObject connect,
			MeterAssetPhysicalDevicePair pair) {
		match.registerObject("electric", electric);
		match.registerObject("deliver", deliver);
		match.registerObject("asset", asset);
		match.registerObject("device", device);
		match.registerObject("consumer", consumer);
		match.registerObject("connect", connect);
		match.registerObject("pair", pair);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ElectricityValues electric, ServiceDeliveryPoint deliver,
			MeterAsset asset, PhysicalDevice device, EnergyConsumer consumer, AutoConnectObject connect,
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ElectricityValues electric,
			ServiceDeliveryPoint deliver, MeterAsset asset, PhysicalDevice device, EnergyConsumer consumer,
			AutoConnectObject connect, MeterAssetPhysicalDevicePair pair) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_consumer_mRID = CSPFactoryHelper.eINSTANCE.createVariable("consumer.mRID", true, csp);
		var_consumer_mRID.setValue(consumer.getMRID());
		var_consumer_mRID.setType("String");
		Variable var_electric_ApparentPowermL1 = CSPFactoryHelper.eINSTANCE.createVariable("electric.ApparentPowermL1",
				true, csp);
		var_electric_ApparentPowermL1.setValue(electric.getApparentPowermL1());
		var_electric_ApparentPowermL1.setType("double");
		Variable var_connect_Connection = CSPFactoryHelper.eINSTANCE.createVariable("connect.Connection", true, csp);
		var_connect_Connection.setValue(connect.isConnection());
		var_connect_Connection.setType("Boolean");

		// Create unbound variables
		Variable var_trgConsumer_ID = CSPFactoryHelper.eINSTANCE.createVariable("trgConsumer.ID", csp);
		var_trgConsumer_ID.setType("String");
		Variable var_trgConsumer_PowerA = CSPFactoryHelper.eINSTANCE.createVariable("trgConsumer.PowerA", csp);
		var_trgConsumer_PowerA.setType("double");
		Variable var_trgConsumer_Reachability = CSPFactoryHelper.eINSTANCE.createVariable("trgConsumer.Reachability",
				csp);
		var_trgConsumer_Reachability.setType("int");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		CastBooleanToInteger castBooleanToInteger = new CastBooleanToInteger();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(castBooleanToInteger);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_consumer_mRID, var_trgConsumer_ID);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_electric_ApparentPowermL1, var_trgConsumer_PowerA);
		castBooleanToInteger.setRuleName("NoRuleName");
		castBooleanToInteger.solve(var_connect_Connection, var_trgConsumer_Reachability);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("electric", electric);
		isApplicableMatch.registerObject("deliver", deliver);
		isApplicableMatch.registerObject("asset", asset);
		isApplicableMatch.registerObject("device", device);
		isApplicableMatch.registerObject("consumer", consumer);
		isApplicableMatch.registerObject("connect", connect);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject assetCorr, EObject electric, EObject deliver,
			EObject deviceCorr, EObject asset, EObject device, EObject consumer, EObject connect, EObject pair,
			EObject trgConsumer) {
		ruleresult.registerObject("assetCorr", assetCorr);
		ruleresult.registerObject("electric", electric);
		ruleresult.registerObject("deliver", deliver);
		ruleresult.registerObject("deviceCorr", deviceCorr);
		ruleresult.registerObject("asset", asset);
		ruleresult.registerObject("device", device);
		ruleresult.registerObject("consumer", consumer);
		ruleresult.registerObject("connect", connect);
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("trgConsumer", trgConsumer);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_21(EMoflonEdge _edge_b) {
		// prepare return value
		Object[] result1_bindingAndBlack = EnergyConsumerWithIDImpl
				.pattern_EnergyConsumerWithID_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = EnergyConsumerWithIDImpl.pattern_EnergyConsumerWithID_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EnergyConsumerWithIDImpl
				.pattern_EnergyConsumerWithID_10_2_testcorematchandDECs_blackFFFFFFFB(_edge_b)) {
			ElectricityValues electric = (ElectricityValues) result2_black[0];
			ServiceDeliveryPoint deliver = (ServiceDeliveryPoint) result2_black[1];
			MeterAsset asset = (MeterAsset) result2_black[2];
			PhysicalDevice device = (PhysicalDevice) result2_black[3];
			EnergyConsumer consumer = (EnergyConsumer) result2_black[4];
			AutoConnectObject connect = (AutoConnectObject) result2_black[5];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_black[6];
			Object[] result2_green = EnergyConsumerWithIDImpl
					.pattern_EnergyConsumerWithID_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EnergyConsumerWithIDImpl
					.pattern_EnergyConsumerWithID_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBBB(
							this, match, electric, deliver, asset, device, consumer, connect, pair)) {
				// Ensure that the correct types of elements are matched
				if (EnergyConsumerWithIDImpl
						.pattern_EnergyConsumerWithID_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = EnergyConsumerWithIDImpl
							.pattern_EnergyConsumerWithID_10_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					EnergyConsumerWithIDImpl.pattern_EnergyConsumerWithID_10_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return EnergyConsumerWithIDImpl.pattern_EnergyConsumerWithID_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("EnergyConsumerWithID");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_trgConsumer_ID = CSPFactoryHelper.eINSTANCE.createVariable("trgConsumer", true, csp);
		var_trgConsumer_ID.setValue(__helper.getValue("trgConsumer", "ID"));
		var_trgConsumer_ID.setType("String");

		Variable var_consumer_mRID = CSPFactoryHelper.eINSTANCE.createVariable("consumer", true, csp);
		var_consumer_mRID.setValue(__helper.getValue("consumer", "mRID"));
		var_consumer_mRID.setType("String");

		Variable var_electric_ApparentPowermL1 = CSPFactoryHelper.eINSTANCE.createVariable("electric", true, csp);
		var_electric_ApparentPowermL1.setValue(__helper.getValue("electric", "ApparentPowermL1"));
		var_electric_ApparentPowermL1.setType("double");

		Variable var_trgConsumer_PowerA = CSPFactoryHelper.eINSTANCE.createVariable("trgConsumer", true, csp);
		var_trgConsumer_PowerA.setValue(__helper.getValue("trgConsumer", "PowerA"));
		var_trgConsumer_PowerA.setType("double");

		Variable var_trgConsumer_Reachability = CSPFactoryHelper.eINSTANCE.createVariable("trgConsumer", true, csp);
		var_trgConsumer_Reachability.setValue(__helper.getValue("trgConsumer", "Reachability"));
		var_trgConsumer_Reachability.setType("int");

		Variable var_connect_Connection = CSPFactoryHelper.eINSTANCE.createVariable("connect", true, csp);
		var_connect_Connection.setValue(__helper.getValue("connect", "Connection"));
		var_connect_Connection.setType("boolean");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		CastBooleanToInteger castBooleanToInteger2 = new CastBooleanToInteger();
		csp.getConstraints().add(castBooleanToInteger2);

		eq0.setRuleName("EnergyConsumerWithID");
		eq0.solve(var_consumer_mRID, var_trgConsumer_ID);

		eq1.setRuleName("EnergyConsumerWithID");
		eq1.solve(var_electric_ApparentPowermL1, var_trgConsumer_PowerA);

		castBooleanToInteger2.setRuleName("EnergyConsumerWithID");
		castBooleanToInteger2.solve(var_connect_Connection, var_trgConsumer_Reachability);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_trgConsumer_ID.setBound(false);
			var_trgConsumer_PowerA.setBound(false);
			var_trgConsumer_Reachability.setBound(false);
			eq0.solve(var_consumer_mRID, var_trgConsumer_ID);
			eq1.solve(var_electric_ApparentPowermL1, var_trgConsumer_PowerA);
			castBooleanToInteger2.solve(var_connect_Connection, var_trgConsumer_Reachability);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("trgConsumer", "ID", var_trgConsumer_ID.getValue());
				__helper.setValue("trgConsumer", "PowerA", var_trgConsumer_PowerA.getValue());
				__helper.setValue("trgConsumer", "Reachability", var_trgConsumer_Reachability.getValue());
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
	public boolean checkDEC_FWD(ElectricityValues electric, ServiceDeliveryPoint deliver, MeterAsset asset,
			PhysicalDevice device, EnergyConsumer consumer, AutoConnectObject connect,
			MeterAssetPhysicalDevicePair pair) {// match tgg pattern
		Object[] result1_black = EnergyConsumerWithIDImpl
				.pattern_EnergyConsumerWithID_13_1_matchtggpattern_blackBBBBBBB(electric, deliver, asset, device,
						consumer, connect, pair);
		if (result1_black != null) {
			return EnergyConsumerWithIDImpl.pattern_EnergyConsumerWithID_13_2_expressionF();
		} else {
			return EnergyConsumerWithIDImpl.pattern_EnergyConsumerWithID_13_3_expressionF();
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
		case RulesPackage.ENERGY_CONSUMER_WITH_ID___IS_APPROPRIATE_FWD__MATCH_ELECTRICITYVALUES_SERVICEDELIVERYPOINT_METERASSET_PHYSICALDEVICE_ENERGYCONSUMER_AUTOCONNECTOBJECT_METERASSETPHYSICALDEVICEPAIR:
			return isAppropriate_FWD((Match) arguments.get(0), (ElectricityValues) arguments.get(1),
					(ServiceDeliveryPoint) arguments.get(2), (MeterAsset) arguments.get(3),
					(PhysicalDevice) arguments.get(4), (EnergyConsumer) arguments.get(5),
					(AutoConnectObject) arguments.get(6), (MeterAssetPhysicalDevicePair) arguments.get(7));
		case RulesPackage.ENERGY_CONSUMER_WITH_ID___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER_WITH_ID___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER_WITH_ID___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ELECTRICITYVALUES_SERVICEDELIVERYPOINT_METERASSET_PHYSICALDEVICE_ENERGYCONSUMER_AUTOCONNECTOBJECT_METERASSETPHYSICALDEVICEPAIR:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ElectricityValues) arguments.get(1),
					(ServiceDeliveryPoint) arguments.get(2), (MeterAsset) arguments.get(3),
					(PhysicalDevice) arguments.get(4), (EnergyConsumer) arguments.get(5),
					(AutoConnectObject) arguments.get(6), (MeterAssetPhysicalDevicePair) arguments.get(7));
			return null;
		case RulesPackage.ENERGY_CONSUMER_WITH_ID___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ELECTRICITYVALUES_SERVICEDELIVERYPOINT_METERASSET_PHYSICALDEVICE_ENERGYCONSUMER_AUTOCONNECTOBJECT_METERASSETPHYSICALDEVICEPAIR:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ElectricityValues) arguments.get(1),
					(ServiceDeliveryPoint) arguments.get(2), (MeterAsset) arguments.get(3),
					(PhysicalDevice) arguments.get(4), (EnergyConsumer) arguments.get(5),
					(AutoConnectObject) arguments.get(6), (MeterAssetPhysicalDevicePair) arguments.get(7));
		case RulesPackage.ENERGY_CONSUMER_WITH_ID___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER_WITH_ID___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ELECTRICITYVALUES_SERVICEDELIVERYPOINT_METERASSET_PHYSICALDEVICE_ENERGYCONSUMER_AUTOCONNECTOBJECT_METERASSETPHYSICALDEVICEPAIR:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ElectricityValues) arguments.get(1),
					(ServiceDeliveryPoint) arguments.get(2), (MeterAsset) arguments.get(3),
					(PhysicalDevice) arguments.get(4), (EnergyConsumer) arguments.get(5),
					(AutoConnectObject) arguments.get(6), (MeterAssetPhysicalDevicePair) arguments.get(7));
		case RulesPackage.ENERGY_CONSUMER_WITH_ID___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER_WITH_ID___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.ENERGY_CONSUMER_WITH_ID___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER_WITH_ID___IS_APPROPRIATE_FWD_EMOFLON_EDGE_21__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_21((EMoflonEdge) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER_WITH_ID___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER_WITH_ID___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ENERGY_CONSUMER_WITH_ID___CHECK_DEC_FWD__ELECTRICITYVALUES_SERVICEDELIVERYPOINT_METERASSET_PHYSICALDEVICE_ENERGYCONSUMER_AUTOCONNECTOBJECT_METERASSETPHYSICALDEVICEPAIR:
			return checkDEC_FWD((ElectricityValues) arguments.get(0), (ServiceDeliveryPoint) arguments.get(1),
					(MeterAsset) arguments.get(2), (PhysicalDevice) arguments.get(3), (EnergyConsumer) arguments.get(4),
					(AutoConnectObject) arguments.get(5), (MeterAssetPhysicalDevicePair) arguments.get(6));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_EnergyConsumerWithID_0_1_initialbindings_blackBBBBBBBBB(
			EnergyConsumerWithID _this, Match match, ElectricityValues electric, ServiceDeliveryPoint deliver,
			MeterAsset asset, PhysicalDevice device, EnergyConsumer consumer, AutoConnectObject connect,
			MeterAssetPhysicalDevicePair pair) {
		return new Object[] { _this, match, electric, deliver, asset, device, consumer, connect, pair };
	}

	public static final Object[] pattern_EnergyConsumerWithID_0_2_SolveCSP_bindingFBBBBBBBBB(EnergyConsumerWithID _this,
			Match match, ElectricityValues electric, ServiceDeliveryPoint deliver, MeterAsset asset,
			PhysicalDevice device, EnergyConsumer consumer, AutoConnectObject connect,
			MeterAssetPhysicalDevicePair pair) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, electric, deliver, asset, device, consumer,
				connect, pair);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, electric, deliver, asset, device, consumer, connect, pair };
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerWithID_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnergyConsumerWithID_0_2_SolveCSP_bindingAndBlackFBBBBBBBBB(
			EnergyConsumerWithID _this, Match match, ElectricityValues electric, ServiceDeliveryPoint deliver,
			MeterAsset asset, PhysicalDevice device, EnergyConsumer consumer, AutoConnectObject connect,
			MeterAssetPhysicalDevicePair pair) {
		Object[] result_pattern_EnergyConsumerWithID_0_2_SolveCSP_binding = pattern_EnergyConsumerWithID_0_2_SolveCSP_bindingFBBBBBBBBB(
				_this, match, electric, deliver, asset, device, consumer, connect, pair);
		if (result_pattern_EnergyConsumerWithID_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnergyConsumerWithID_0_2_SolveCSP_binding[0];

			Object[] result_pattern_EnergyConsumerWithID_0_2_SolveCSP_black = pattern_EnergyConsumerWithID_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_EnergyConsumerWithID_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, electric, deliver, asset, device, consumer, connect, pair };
			}
		}
		return null;
	}

	public static final boolean pattern_EnergyConsumerWithID_0_3_CheckCSP_expressionFBB(EnergyConsumerWithID _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnergyConsumerWithID_0_4_collectelementstobetranslated_blackBBBBBBBB(
			Match match, ElectricityValues electric, ServiceDeliveryPoint deliver, MeterAsset asset,
			PhysicalDevice device, EnergyConsumer consumer, AutoConnectObject connect,
			MeterAssetPhysicalDevicePair pair) {
		return new Object[] { match, electric, deliver, asset, device, consumer, connect, pair };
	}

	public static final Object[] pattern_EnergyConsumerWithID_0_4_collectelementstobetranslated_greenBBBBFF(Match match,
			MeterAsset asset, PhysicalDevice device, MeterAssetPhysicalDevicePair pair) {
		EMoflonEdge pair__device____b = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(pair);
		String pair__device____b_name_prime = "b";
		String pair__asset____a_name_prime = "a";
		pair__device____b.setSrc(pair);
		pair__device____b.setTrg(device);
		match.getToBeTranslatedEdges().add(pair__device____b);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		match.getToBeTranslatedEdges().add(pair__asset____a);
		pair__device____b.setName(pair__device____b_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		return new Object[] { match, asset, device, pair, pair__device____b, pair__asset____a };
	}

	public static final Object[] pattern_EnergyConsumerWithID_0_5_collectcontextelements_blackBBBBBBBB(Match match,
			ElectricityValues electric, ServiceDeliveryPoint deliver, MeterAsset asset, PhysicalDevice device,
			EnergyConsumer consumer, AutoConnectObject connect, MeterAssetPhysicalDevicePair pair) {
		return new Object[] { match, electric, deliver, asset, device, consumer, connect, pair };
	}

	public static final Object[] pattern_EnergyConsumerWithID_0_5_collectcontextelements_greenBBBBBBBFFFFFF(Match match,
			ElectricityValues electric, ServiceDeliveryPoint deliver, MeterAsset asset, PhysicalDevice device,
			EnergyConsumer consumer, AutoConnectObject connect) {
		EMoflonEdge deliver__consumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge consumer__deliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device__connect____AutoConnect = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device__electric____ElectricityValues = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__deliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge deliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(electric);
		match.getContextNodes().add(deliver);
		match.getContextNodes().add(asset);
		match.getContextNodes().add(device);
		match.getContextNodes().add(consumer);
		match.getContextNodes().add(connect);
		String deliver__consumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String consumer__deliver____ServiceDeliveryPoints_name_prime = "ServiceDeliveryPoints";
		String device__connect____AutoConnect_name_prime = "AutoConnect";
		String device__electric____ElectricityValues_name_prime = "ElectricityValues";
		String asset__deliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String deliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		deliver__consumer____EnergyConsumer.setSrc(deliver);
		deliver__consumer____EnergyConsumer.setTrg(consumer);
		match.getContextEdges().add(deliver__consumer____EnergyConsumer);
		consumer__deliver____ServiceDeliveryPoints.setSrc(consumer);
		consumer__deliver____ServiceDeliveryPoints.setTrg(deliver);
		match.getContextEdges().add(consumer__deliver____ServiceDeliveryPoints);
		device__connect____AutoConnect.setSrc(device);
		device__connect____AutoConnect.setTrg(connect);
		match.getContextEdges().add(device__connect____AutoConnect);
		device__electric____ElectricityValues.setSrc(device);
		device__electric____ElectricityValues.setTrg(electric);
		match.getContextEdges().add(device__electric____ElectricityValues);
		asset__deliver____ServiceDeliveryPoint.setSrc(asset);
		asset__deliver____ServiceDeliveryPoint.setTrg(deliver);
		match.getContextEdges().add(asset__deliver____ServiceDeliveryPoint);
		deliver__asset____EndDeviceAssets.setSrc(deliver);
		deliver__asset____EndDeviceAssets.setTrg(asset);
		match.getContextEdges().add(deliver__asset____EndDeviceAssets);
		deliver__consumer____EnergyConsumer.setName(deliver__consumer____EnergyConsumer_name_prime);
		consumer__deliver____ServiceDeliveryPoints.setName(consumer__deliver____ServiceDeliveryPoints_name_prime);
		device__connect____AutoConnect.setName(device__connect____AutoConnect_name_prime);
		device__electric____ElectricityValues.setName(device__electric____ElectricityValues_name_prime);
		asset__deliver____ServiceDeliveryPoint.setName(asset__deliver____ServiceDeliveryPoint_name_prime);
		deliver__asset____EndDeviceAssets.setName(deliver__asset____EndDeviceAssets_name_prime);
		return new Object[] { match, electric, deliver, asset, device, consumer, connect,
				deliver__consumer____EnergyConsumer, consumer__deliver____ServiceDeliveryPoints,
				device__connect____AutoConnect, device__electric____ElectricityValues,
				asset__deliver____ServiceDeliveryPoint, deliver__asset____EndDeviceAssets };
	}

	public static final void pattern_EnergyConsumerWithID_0_6_registerobjectstomatch_expressionBBBBBBBBB(
			EnergyConsumerWithID _this, Match match, ElectricityValues electric, ServiceDeliveryPoint deliver,
			MeterAsset asset, PhysicalDevice device, EnergyConsumer consumer, AutoConnectObject connect,
			MeterAssetPhysicalDevicePair pair) {
		_this.registerObjectsToMatch_FWD(match, electric, deliver, asset, device, consumer, connect, pair);

	}

	public static final boolean pattern_EnergyConsumerWithID_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EnergyConsumerWithID_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_EnergyConsumerWithID_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("electric");
		EObject _localVariable_1 = isApplicableMatch.getObject("deliver");
		EObject _localVariable_2 = isApplicableMatch.getObject("asset");
		EObject _localVariable_3 = isApplicableMatch.getObject("device");
		EObject _localVariable_4 = isApplicableMatch.getObject("consumer");
		EObject _localVariable_5 = isApplicableMatch.getObject("connect");
		EObject _localVariable_6 = isApplicableMatch.getObject("pair");
		EObject tmpElectric = _localVariable_0;
		EObject tmpDeliver = _localVariable_1;
		EObject tmpAsset = _localVariable_2;
		EObject tmpDevice = _localVariable_3;
		EObject tmpConsumer = _localVariable_4;
		EObject tmpConnect = _localVariable_5;
		EObject tmpPair = _localVariable_6;
		if (tmpElectric instanceof ElectricityValues) {
			ElectricityValues electric = (ElectricityValues) tmpElectric;
			if (tmpDeliver instanceof ServiceDeliveryPoint) {
				ServiceDeliveryPoint deliver = (ServiceDeliveryPoint) tmpDeliver;
				if (tmpAsset instanceof MeterAsset) {
					MeterAsset asset = (MeterAsset) tmpAsset;
					if (tmpDevice instanceof PhysicalDevice) {
						PhysicalDevice device = (PhysicalDevice) tmpDevice;
						if (tmpConsumer instanceof EnergyConsumer) {
							EnergyConsumer consumer = (EnergyConsumer) tmpConsumer;
							if (tmpConnect instanceof AutoConnectObject) {
								AutoConnectObject connect = (AutoConnectObject) tmpConnect;
								if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
									MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
									return new Object[] { electric, deliver, asset, device, consumer, connect, pair,
											isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerWithID_1_1_performtransformation_blackBBBBBBBFBB(
			ElectricityValues electric, ServiceDeliveryPoint deliver, MeterAsset asset, PhysicalDevice device,
			EnergyConsumer consumer, AutoConnectObject connect, MeterAssetPhysicalDevicePair pair,
			EnergyConsumerWithID _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { electric, deliver, asset, device, consumer, connect, pair, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerWithID_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			EnergyConsumerWithID _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EnergyConsumerWithID_1_1_performtransformation_binding = pattern_EnergyConsumerWithID_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_EnergyConsumerWithID_1_1_performtransformation_binding != null) {
			ElectricityValues electric = (ElectricityValues) result_pattern_EnergyConsumerWithID_1_1_performtransformation_binding[0];
			ServiceDeliveryPoint deliver = (ServiceDeliveryPoint) result_pattern_EnergyConsumerWithID_1_1_performtransformation_binding[1];
			MeterAsset asset = (MeterAsset) result_pattern_EnergyConsumerWithID_1_1_performtransformation_binding[2];
			PhysicalDevice device = (PhysicalDevice) result_pattern_EnergyConsumerWithID_1_1_performtransformation_binding[3];
			EnergyConsumer consumer = (EnergyConsumer) result_pattern_EnergyConsumerWithID_1_1_performtransformation_binding[4];
			AutoConnectObject connect = (AutoConnectObject) result_pattern_EnergyConsumerWithID_1_1_performtransformation_binding[5];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result_pattern_EnergyConsumerWithID_1_1_performtransformation_binding[6];

			Object[] result_pattern_EnergyConsumerWithID_1_1_performtransformation_black = pattern_EnergyConsumerWithID_1_1_performtransformation_blackBBBBBBBFBB(
					electric, deliver, asset, device, consumer, connect, pair, _this, isApplicableMatch);
			if (result_pattern_EnergyConsumerWithID_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_EnergyConsumerWithID_1_1_performtransformation_black[7];

				return new Object[] { electric, deliver, asset, device, consumer, connect, pair, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerWithID_1_1_performtransformation_greenFFBBFB(MeterAsset asset,
			PhysicalDevice device, CSP csp) {
		MeterAssetToEnergyConsumer assetCorr = Task1Factory.eINSTANCE.createMeterAssetToEnergyConsumer();
		PhysicalDeviceToEnergyConsumer deviceCorr = Task1Factory.eINSTANCE.createPhysicalDeviceToEnergyConsumer();
		outageDetectionJointarget.EnergyConsumer trgConsumer = OutageDetectionJointargetFactory.eINSTANCE
				.createEnergyConsumer();
		Object _localVariable_0 = csp.getValue("trgConsumer", "ID");
		Object _localVariable_1 = csp.getValue("trgConsumer", "PowerA");
		Object _localVariable_2 = csp.getValue("trgConsumer", "Reachability");
		assetCorr.setSource(asset);
		deviceCorr.setSource(device);
		assetCorr.setTarget(trgConsumer);
		deviceCorr.setTarget(trgConsumer);
		String trgConsumer_ID_prime = (String) _localVariable_0;
		double trgConsumer_PowerA_prime = (double) _localVariable_1;
		int trgConsumer_Reachability_prime = (int) _localVariable_2;
		trgConsumer.setID(trgConsumer_ID_prime);
		trgConsumer.setPowerA(Double.valueOf(trgConsumer_PowerA_prime));
		trgConsumer.setReachability(Integer.valueOf(trgConsumer_Reachability_prime));
		return new Object[] { assetCorr, deviceCorr, asset, device, trgConsumer, csp };
	}

	public static final Object[] pattern_EnergyConsumerWithID_1_2_collecttranslatedelements_blackBBBB(
			MeterAssetToEnergyConsumer assetCorr, PhysicalDeviceToEnergyConsumer deviceCorr,
			MeterAssetPhysicalDevicePair pair, outageDetectionJointarget.EnergyConsumer trgConsumer) {
		return new Object[] { assetCorr, deviceCorr, pair, trgConsumer };
	}

	public static final Object[] pattern_EnergyConsumerWithID_1_2_collecttranslatedelements_greenFBBBB(
			MeterAssetToEnergyConsumer assetCorr, PhysicalDeviceToEnergyConsumer deviceCorr,
			MeterAssetPhysicalDevicePair pair, outageDetectionJointarget.EnergyConsumer trgConsumer) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(assetCorr);
		ruleresult.getCreatedLinkElements().add(deviceCorr);
		ruleresult.getTranslatedElements().add(pair);
		ruleresult.getCreatedElements().add(trgConsumer);
		return new Object[] { ruleresult, assetCorr, deviceCorr, pair, trgConsumer };
	}

	public static final Object[] pattern_EnergyConsumerWithID_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject assetCorr, EObject electric, EObject deliver, EObject deviceCorr,
			EObject asset, EObject device, EObject consumer, EObject connect, EObject pair, EObject trgConsumer) {
		if (!assetCorr.equals(electric)) {
			if (!assetCorr.equals(deliver)) {
				if (!assetCorr.equals(deviceCorr)) {
					if (!assetCorr.equals(device)) {
						if (!assetCorr.equals(consumer)) {
							if (!assetCorr.equals(connect)) {
								if (!assetCorr.equals(pair)) {
									if (!assetCorr.equals(trgConsumer)) {
										if (!electric.equals(pair)) {
											if (!electric.equals(trgConsumer)) {
												if (!deliver.equals(electric)) {
													if (!deliver.equals(deviceCorr)) {
														if (!deliver.equals(device)) {
															if (!deliver.equals(pair)) {
																if (!deliver.equals(trgConsumer)) {
																	if (!deviceCorr.equals(electric)) {
																		if (!deviceCorr.equals(pair)) {
																			if (!deviceCorr.equals(trgConsumer)) {
																				if (!asset.equals(assetCorr)) {
																					if (!asset.equals(electric)) {
																						if (!asset.equals(deliver)) {
																							if (!asset.equals(
																									deviceCorr)) {
																								if (!asset.equals(
																										device)) {
																									if (!asset.equals(
																											consumer)) {
																										if (!asset
																												.equals(connect)) {
																											if (!asset
																													.equals(pair)) {
																												if (!asset
																														.equals(trgConsumer)) {
																													if (!device
																															.equals(electric)) {
																														if (!device
																																.equals(deviceCorr)) {
																															if (!device
																																	.equals(pair)) {
																																if (!device
																																		.equals(trgConsumer)) {
																																	if (!consumer
																																			.equals(electric)) {
																																		if (!consumer
																																				.equals(deliver)) {
																																			if (!consumer
																																					.equals(deviceCorr)) {
																																				if (!consumer
																																						.equals(device)) {
																																					if (!consumer
																																							.equals(pair)) {
																																						if (!consumer
																																								.equals(trgConsumer)) {
																																							if (!connect
																																									.equals(electric)) {
																																								if (!connect
																																										.equals(deliver)) {
																																									if (!connect
																																											.equals(deviceCorr)) {
																																										if (!connect
																																												.equals(device)) {
																																											if (!connect
																																													.equals(consumer)) {
																																												if (!connect
																																														.equals(pair)) {
																																													if (!connect
																																															.equals(trgConsumer)) {
																																														if (!pair
																																																.equals(trgConsumer)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	assetCorr,
																																																	electric,
																																																	deliver,
																																																	deviceCorr,
																																																	asset,
																																																	device,
																																																	consumer,
																																																	connect,
																																																	pair,
																																																	trgConsumer };
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

	public static final Object[] pattern_EnergyConsumerWithID_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject assetCorr, EObject deviceCorr, EObject asset, EObject device,
			EObject pair, EObject trgConsumer) {
		EMoflonEdge deviceCorr__device____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge assetCorr__trgConsumer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge assetCorr__asset____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge deviceCorr__trgConsumer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__device____b = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EnergyConsumerWithID";
		String deviceCorr__device____source_name_prime = "source";
		String assetCorr__trgConsumer____target_name_prime = "target";
		String assetCorr__asset____source_name_prime = "source";
		String deviceCorr__trgConsumer____target_name_prime = "target";
		String pair__device____b_name_prime = "b";
		String pair__asset____a_name_prime = "a";
		deviceCorr__device____source.setSrc(deviceCorr);
		deviceCorr__device____source.setTrg(device);
		ruleresult.getCreatedEdges().add(deviceCorr__device____source);
		assetCorr__trgConsumer____target.setSrc(assetCorr);
		assetCorr__trgConsumer____target.setTrg(trgConsumer);
		ruleresult.getCreatedEdges().add(assetCorr__trgConsumer____target);
		assetCorr__asset____source.setSrc(assetCorr);
		assetCorr__asset____source.setTrg(asset);
		ruleresult.getCreatedEdges().add(assetCorr__asset____source);
		deviceCorr__trgConsumer____target.setSrc(deviceCorr);
		deviceCorr__trgConsumer____target.setTrg(trgConsumer);
		ruleresult.getCreatedEdges().add(deviceCorr__trgConsumer____target);
		pair__device____b.setSrc(pair);
		pair__device____b.setTrg(device);
		ruleresult.getTranslatedEdges().add(pair__device____b);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		ruleresult.getTranslatedEdges().add(pair__asset____a);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		deviceCorr__device____source.setName(deviceCorr__device____source_name_prime);
		assetCorr__trgConsumer____target.setName(assetCorr__trgConsumer____target_name_prime);
		assetCorr__asset____source.setName(assetCorr__asset____source_name_prime);
		deviceCorr__trgConsumer____target.setName(deviceCorr__trgConsumer____target_name_prime);
		pair__device____b.setName(pair__device____b_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		return new Object[] { ruleresult, assetCorr, deviceCorr, asset, device, pair, trgConsumer,
				deviceCorr__device____source, assetCorr__trgConsumer____target, assetCorr__asset____source,
				deviceCorr__trgConsumer____target, pair__device____b, pair__asset____a };
	}

	public static final void pattern_EnergyConsumerWithID_1_5_registerobjects_expressionBBBBBBBBBBBB(
			EnergyConsumerWithID _this, PerformRuleResult ruleresult, EObject assetCorr, EObject electric,
			EObject deliver, EObject deviceCorr, EObject asset, EObject device, EObject consumer, EObject connect,
			EObject pair, EObject trgConsumer) {
		_this.registerObjects_FWD(ruleresult, assetCorr, electric, deliver, deviceCorr, asset, device, consumer,
				connect, pair, trgConsumer);

	}

	public static final PerformRuleResult pattern_EnergyConsumerWithID_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EnergyConsumerWithID_2_1_preparereturnvalue_bindingFB(
			EnergyConsumerWithID _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerWithID_2_1_preparereturnvalue_blackFBB(EClass eClass,
			EnergyConsumerWithID _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerWithID_2_1_preparereturnvalue_bindingAndBlackFFB(
			EnergyConsumerWithID _this) {
		Object[] result_pattern_EnergyConsumerWithID_2_1_preparereturnvalue_binding = pattern_EnergyConsumerWithID_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_EnergyConsumerWithID_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_EnergyConsumerWithID_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_EnergyConsumerWithID_2_1_preparereturnvalue_black = pattern_EnergyConsumerWithID_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_EnergyConsumerWithID_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EnergyConsumerWithID_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerWithID_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "EnergyConsumerWithID";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EnergyConsumerWithID_2_2_corematch_bindingFFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("electric");
		EObject _localVariable_1 = match.getObject("deliver");
		EObject _localVariable_2 = match.getObject("asset");
		EObject _localVariable_3 = match.getObject("device");
		EObject _localVariable_4 = match.getObject("consumer");
		EObject _localVariable_5 = match.getObject("connect");
		EObject _localVariable_6 = match.getObject("pair");
		EObject tmpElectric = _localVariable_0;
		EObject tmpDeliver = _localVariable_1;
		EObject tmpAsset = _localVariable_2;
		EObject tmpDevice = _localVariable_3;
		EObject tmpConsumer = _localVariable_4;
		EObject tmpConnect = _localVariable_5;
		EObject tmpPair = _localVariable_6;
		if (tmpElectric instanceof ElectricityValues) {
			ElectricityValues electric = (ElectricityValues) tmpElectric;
			if (tmpDeliver instanceof ServiceDeliveryPoint) {
				ServiceDeliveryPoint deliver = (ServiceDeliveryPoint) tmpDeliver;
				if (tmpAsset instanceof MeterAsset) {
					MeterAsset asset = (MeterAsset) tmpAsset;
					if (tmpDevice instanceof PhysicalDevice) {
						PhysicalDevice device = (PhysicalDevice) tmpDevice;
						if (tmpConsumer instanceof EnergyConsumer) {
							EnergyConsumer consumer = (EnergyConsumer) tmpConsumer;
							if (tmpConnect instanceof AutoConnectObject) {
								AutoConnectObject connect = (AutoConnectObject) tmpConnect;
								if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
									MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
									return new Object[] { electric, deliver, asset, device, consumer, connect, pair,
											match };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EnergyConsumerWithID_2_2_corematch_blackBBBBBBBB(
			ElectricityValues electric, ServiceDeliveryPoint deliver, MeterAsset asset, PhysicalDevice device,
			EnergyConsumer consumer, AutoConnectObject connect, MeterAssetPhysicalDevicePair pair, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { electric, deliver, asset, device, consumer, connect, pair, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_EnergyConsumerWithID_2_3_findcontext_blackBBBBBBB(
			ElectricityValues electric, ServiceDeliveryPoint deliver, MeterAsset asset, PhysicalDevice device,
			EnergyConsumer consumer, AutoConnectObject connect, MeterAssetPhysicalDevicePair pair) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (consumer.equals(deliver.getEnergyConsumer())) {
			if (connect.equals(device.getAutoConnect())) {
				if (electric.equals(device.getElectricityValues())) {
					if (device.equals(pair.getB())) {
						if (deliver.equals(asset.getServiceDeliveryPoint())) {
							if (asset.equals(pair.getA())) {
								_result.add(new Object[] { electric, deliver, asset, device, consumer, connect, pair });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EnergyConsumerWithID_2_3_findcontext_greenBBBBBBBFFFFFFFFF(
			ElectricityValues electric, ServiceDeliveryPoint deliver, MeterAsset asset, PhysicalDevice device,
			EnergyConsumer consumer, AutoConnectObject connect, MeterAssetPhysicalDevicePair pair) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge deliver__consumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge consumer__deliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device__connect____AutoConnect = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device__electric____ElectricityValues = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__device____b = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__deliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge deliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String deliver__consumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String consumer__deliver____ServiceDeliveryPoints_name_prime = "ServiceDeliveryPoints";
		String device__connect____AutoConnect_name_prime = "AutoConnect";
		String device__electric____ElectricityValues_name_prime = "ElectricityValues";
		String pair__device____b_name_prime = "b";
		String asset__deliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String deliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		String pair__asset____a_name_prime = "a";
		isApplicableMatch.getAllContextElements().add(electric);
		isApplicableMatch.getAllContextElements().add(deliver);
		isApplicableMatch.getAllContextElements().add(asset);
		isApplicableMatch.getAllContextElements().add(device);
		isApplicableMatch.getAllContextElements().add(consumer);
		isApplicableMatch.getAllContextElements().add(connect);
		isApplicableMatch.getAllContextElements().add(pair);
		deliver__consumer____EnergyConsumer.setSrc(deliver);
		deliver__consumer____EnergyConsumer.setTrg(consumer);
		isApplicableMatch.getAllContextElements().add(deliver__consumer____EnergyConsumer);
		consumer__deliver____ServiceDeliveryPoints.setSrc(consumer);
		consumer__deliver____ServiceDeliveryPoints.setTrg(deliver);
		isApplicableMatch.getAllContextElements().add(consumer__deliver____ServiceDeliveryPoints);
		device__connect____AutoConnect.setSrc(device);
		device__connect____AutoConnect.setTrg(connect);
		isApplicableMatch.getAllContextElements().add(device__connect____AutoConnect);
		device__electric____ElectricityValues.setSrc(device);
		device__electric____ElectricityValues.setTrg(electric);
		isApplicableMatch.getAllContextElements().add(device__electric____ElectricityValues);
		pair__device____b.setSrc(pair);
		pair__device____b.setTrg(device);
		isApplicableMatch.getAllContextElements().add(pair__device____b);
		asset__deliver____ServiceDeliveryPoint.setSrc(asset);
		asset__deliver____ServiceDeliveryPoint.setTrg(deliver);
		isApplicableMatch.getAllContextElements().add(asset__deliver____ServiceDeliveryPoint);
		deliver__asset____EndDeviceAssets.setSrc(deliver);
		deliver__asset____EndDeviceAssets.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(deliver__asset____EndDeviceAssets);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(pair__asset____a);
		deliver__consumer____EnergyConsumer.setName(deliver__consumer____EnergyConsumer_name_prime);
		consumer__deliver____ServiceDeliveryPoints.setName(consumer__deliver____ServiceDeliveryPoints_name_prime);
		device__connect____AutoConnect.setName(device__connect____AutoConnect_name_prime);
		device__electric____ElectricityValues.setName(device__electric____ElectricityValues_name_prime);
		pair__device____b.setName(pair__device____b_name_prime);
		asset__deliver____ServiceDeliveryPoint.setName(asset__deliver____ServiceDeliveryPoint_name_prime);
		deliver__asset____EndDeviceAssets.setName(deliver__asset____EndDeviceAssets_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		return new Object[] { electric, deliver, asset, device, consumer, connect, pair, isApplicableMatch,
				deliver__consumer____EnergyConsumer, consumer__deliver____ServiceDeliveryPoints,
				device__connect____AutoConnect, device__electric____ElectricityValues, pair__device____b,
				asset__deliver____ServiceDeliveryPoint, deliver__asset____EndDeviceAssets, pair__asset____a };
	}

	public static final Object[] pattern_EnergyConsumerWithID_2_4_solveCSP_bindingFBBBBBBBBB(EnergyConsumerWithID _this,
			IsApplicableMatch isApplicableMatch, ElectricityValues electric, ServiceDeliveryPoint deliver,
			MeterAsset asset, PhysicalDevice device, EnergyConsumer consumer, AutoConnectObject connect,
			MeterAssetPhysicalDevicePair pair) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, electric, deliver, asset, device,
				consumer, connect, pair);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, electric, deliver, asset, device, consumer, connect,
					pair };
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerWithID_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnergyConsumerWithID_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			EnergyConsumerWithID _this, IsApplicableMatch isApplicableMatch, ElectricityValues electric,
			ServiceDeliveryPoint deliver, MeterAsset asset, PhysicalDevice device, EnergyConsumer consumer,
			AutoConnectObject connect, MeterAssetPhysicalDevicePair pair) {
		Object[] result_pattern_EnergyConsumerWithID_2_4_solveCSP_binding = pattern_EnergyConsumerWithID_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, electric, deliver, asset, device, consumer, connect, pair);
		if (result_pattern_EnergyConsumerWithID_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnergyConsumerWithID_2_4_solveCSP_binding[0];

			Object[] result_pattern_EnergyConsumerWithID_2_4_solveCSP_black = pattern_EnergyConsumerWithID_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_EnergyConsumerWithID_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, electric, deliver, asset, device, consumer,
						connect, pair };
			}
		}
		return null;
	}

	public static final boolean pattern_EnergyConsumerWithID_2_5_checkCSP_expressionFBB(EnergyConsumerWithID _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnergyConsumerWithID_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EnergyConsumerWithID_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EnergyConsumerWithID";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EnergyConsumerWithID_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EnergyConsumerWithID_10_1_preparereturnvalue_bindingFB(
			EnergyConsumerWithID _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerWithID_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			EnergyConsumerWithID _this) {
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

	public static final Object[] pattern_EnergyConsumerWithID_10_1_preparereturnvalue_bindingAndBlackFFBF(
			EnergyConsumerWithID _this) {
		Object[] result_pattern_EnergyConsumerWithID_10_1_preparereturnvalue_binding = pattern_EnergyConsumerWithID_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_EnergyConsumerWithID_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_EnergyConsumerWithID_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_EnergyConsumerWithID_10_1_preparereturnvalue_black = pattern_EnergyConsumerWithID_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_EnergyConsumerWithID_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EnergyConsumerWithID_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_EnergyConsumerWithID_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerWithID_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EnergyConsumerWithID_10_2_testcorematchandDECs_blackFFFFFFFB(
			EMoflonEdge _edge_b) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPair = _edge_b.getSrc();
		if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
			EObject tmpDevice = _edge_b.getTrg();
			if (tmpDevice instanceof PhysicalDevice) {
				PhysicalDevice device = (PhysicalDevice) tmpDevice;
				if (device.equals(pair.getB())) {
					MeterAsset asset = pair.getA();
					if (asset != null) {
						AutoConnectObject connect = device.getAutoConnect();
						if (connect != null) {
							ElectricityValues electric = device.getElectricityValues();
							if (electric != null) {
								ServiceDeliveryPoint deliver = asset.getServiceDeliveryPoint();
								if (deliver != null) {
									EnergyConsumer consumer = deliver.getEnergyConsumer();
									if (consumer != null) {
										_result.add(new Object[] { electric, deliver, asset, device, consumer, connect,
												pair, _edge_b });
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

	public static final Object[] pattern_EnergyConsumerWithID_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EnergyConsumerWithID_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBBB(
			EnergyConsumerWithID _this, Match match, ElectricityValues electric, ServiceDeliveryPoint deliver,
			MeterAsset asset, PhysicalDevice device, EnergyConsumer consumer, AutoConnectObject connect,
			MeterAssetPhysicalDevicePair pair) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, electric, deliver, asset, device, consumer, connect,
				pair);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EnergyConsumerWithID_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			EnergyConsumerWithID _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnergyConsumerWithID_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerWithID_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_EnergyConsumerWithID_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EnergyConsumerWithID_13_1_matchtggpattern_blackBBBBBBB(
			ElectricityValues electric, ServiceDeliveryPoint deliver, MeterAsset asset, PhysicalDevice device,
			EnergyConsumer consumer, AutoConnectObject connect, MeterAssetPhysicalDevicePair pair) {
		if (consumer.equals(deliver.getEnergyConsumer())) {
			if (connect.equals(device.getAutoConnect())) {
				if (electric.equals(device.getElectricityValues())) {
					if (device.equals(pair.getB())) {
						if (deliver.equals(asset.getServiceDeliveryPoint())) {
							if (asset.equals(pair.getA())) {
								return new Object[] { electric, deliver, asset, device, consumer, connect, pair };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_EnergyConsumerWithID_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EnergyConsumerWithID_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EnergyConsumerWithIDImpl
