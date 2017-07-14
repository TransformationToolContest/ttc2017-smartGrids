/**
 */
package rgse.ttc17.emoflon.tgg.task1.Rules.impl;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61970.ControlArea.ControlArea;

import gluemodel.CIM.IEC61970.LoadModel.ConformLoad;
import gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup;
import gluemodel.CIM.IEC61970.LoadModel.SubLoadArea;

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

import outageDetectionJointarget.EnergyConsumer;
import outageDetectionJointarget.OutageDetectionJointargetFactory;

import rgse.ttc17.emoflon.tgg.task1.MeterAssetToEnergyConsumer;
import rgse.ttc17.emoflon.tgg.task1.PhysicalDeviceToEnergyConsumer;

import rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad;
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
 * An implementation of the model object '<em><b>Energy Consumer With ID Conf Load</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EnergyConsumerWithIDConfLoadImpl extends AbstractRuleImpl implements EnergyConsumerWithIDConfLoad {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnergyConsumerWithIDConfLoadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getEnergyConsumerWithIDConfLoad();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SubLoadArea area, ElectricityValues electric,
			ServiceDeliveryPoint deliver, ControlArea control, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			PhysicalDevice device, ConformLoad consumer, AutoConnectObject connect, ConformLoadGroup group) {
		// initial bindings
		Object[] result1_black = EnergyConsumerWithIDConfLoadImpl
				.pattern_EnergyConsumerWithIDConfLoad_0_1_initialbindings_blackBBBBBBBBBBBB(this, match, area, electric,
						deliver, control, pair, asset, device, consumer, connect, group);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[area] = " + area + ", "
					+ "[electric] = " + electric + ", " + "[deliver] = " + deliver + ", " + "[control] = " + control
					+ ", " + "[pair] = " + pair + ", " + "[asset] = " + asset + ", " + "[device] = " + device + ", "
					+ "[consumer] = " + consumer + ", " + "[connect] = " + connect + ", " + "[group] = " + group + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = EnergyConsumerWithIDConfLoadImpl
				.pattern_EnergyConsumerWithIDConfLoad_0_2_SolveCSP_bindingAndBlackFBBBBBBBBBBBB(this, match, area,
						electric, deliver, control, pair, asset, device, consumer, connect, group);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[area] = " + area + ", " + "[electric] = " + electric
					+ ", " + "[deliver] = " + deliver + ", " + "[control] = " + control + ", " + "[pair] = " + pair
					+ ", " + "[asset] = " + asset + ", " + "[device] = " + device + ", " + "[consumer] = " + consumer
					+ ", " + "[connect] = " + connect + ", " + "[group] = " + group + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (EnergyConsumerWithIDConfLoadImpl.pattern_EnergyConsumerWithIDConfLoad_0_3_CheckCSP_expressionFBB(this,
				csp)) {

			// collect elements to be translated
			Object[] result4_black = EnergyConsumerWithIDConfLoadImpl
					.pattern_EnergyConsumerWithIDConfLoad_0_4_collectelementstobetranslated_blackBBBBBBBBBBB(match,
							area, electric, deliver, control, pair, asset, device, consumer, connect, group);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[area] = " + area + ", " + "[electric] = "
						+ electric + ", " + "[deliver] = " + deliver + ", " + "[control] = " + control + ", "
						+ "[pair] = " + pair + ", " + "[asset] = " + asset + ", " + "[device] = " + device + ", "
						+ "[consumer] = " + consumer + ", " + "[connect] = " + connect + ", " + "[group] = " + group
						+ ".");
			}
			EnergyConsumerWithIDConfLoadImpl
					.pattern_EnergyConsumerWithIDConfLoad_0_4_collectelementstobetranslated_greenBBBBFF(match, pair,
							asset, device);
			// EMoflonEdge pair__asset____a = (EMoflonEdge) result4_green[4];
			// EMoflonEdge pair__device____b = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = EnergyConsumerWithIDConfLoadImpl
					.pattern_EnergyConsumerWithIDConfLoad_0_5_collectcontextelements_blackBBBBBBBBBBB(match, area,
							electric, deliver, control, pair, asset, device, consumer, connect, group);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[area] = " + area + ", " + "[electric] = " + electric + ", "
								+ "[deliver] = " + deliver + ", " + "[control] = " + control + ", " + "[pair] = " + pair
								+ ", " + "[asset] = " + asset + ", " + "[device] = " + device + ", " + "[consumer] = "
								+ consumer + ", " + "[connect] = " + connect + ", " + "[group] = " + group + ".");
			}
			EnergyConsumerWithIDConfLoadImpl
					.pattern_EnergyConsumerWithIDConfLoad_0_5_collectcontextelements_greenBBBBBBBBBBFFFFFFFFFFFF(match,
							area, electric, deliver, control, asset, device, consumer, connect, group);
			// EMoflonEdge group__area____SubLoadArea = (EMoflonEdge) result5_green[10];
			// EMoflonEdge area__group____LoadGroups = (EMoflonEdge) result5_green[11];
			// EMoflonEdge deliver__consumer____EnergyConsumer = (EMoflonEdge) result5_green[12];
			// EMoflonEdge consumer__deliver____ServiceDeliveryPoints = (EMoflonEdge) result5_green[13];
			// EMoflonEdge device__connect____AutoConnect = (EMoflonEdge) result5_green[14];
			// EMoflonEdge consumer__group____LoadGroup = (EMoflonEdge) result5_green[15];
			// EMoflonEdge group__consumer____EnergyConsumers = (EMoflonEdge) result5_green[16];
			// EMoflonEdge asset__deliver____ServiceDeliveryPoint = (EMoflonEdge) result5_green[17];
			// EMoflonEdge deliver__asset____EndDeviceAssets = (EMoflonEdge) result5_green[18];
			// EMoflonEdge area__control____ControlArea = (EMoflonEdge) result5_green[19];
			// EMoflonEdge control__area____EnergyArea = (EMoflonEdge) result5_green[20];
			// EMoflonEdge device__electric____ElectricityValues = (EMoflonEdge) result5_green[21];

			// register objects to match
			EnergyConsumerWithIDConfLoadImpl
					.pattern_EnergyConsumerWithIDConfLoad_0_6_registerobjectstomatch_expressionBBBBBBBBBBBB(this, match,
							area, electric, deliver, control, pair, asset, device, consumer, connect, group);
			return EnergyConsumerWithIDConfLoadImpl.pattern_EnergyConsumerWithIDConfLoad_0_7_expressionF();
		} else {
			return EnergyConsumerWithIDConfLoadImpl.pattern_EnergyConsumerWithIDConfLoad_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = EnergyConsumerWithIDConfLoadImpl
				.pattern_EnergyConsumerWithIDConfLoad_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		SubLoadArea area = (SubLoadArea) result1_bindingAndBlack[0];
		ElectricityValues electric = (ElectricityValues) result1_bindingAndBlack[1];
		ServiceDeliveryPoint deliver = (ServiceDeliveryPoint) result1_bindingAndBlack[2];
		ControlArea control = (ControlArea) result1_bindingAndBlack[3];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result1_bindingAndBlack[4];
		MeterAsset asset = (MeterAsset) result1_bindingAndBlack[5];
		PhysicalDevice device = (PhysicalDevice) result1_bindingAndBlack[6];
		ConformLoad consumer = (ConformLoad) result1_bindingAndBlack[7];
		AutoConnectObject connect = (AutoConnectObject) result1_bindingAndBlack[8];
		ConformLoadGroup group = (ConformLoadGroup) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = EnergyConsumerWithIDConfLoadImpl
				.pattern_EnergyConsumerWithIDConfLoad_1_1_performtransformation_greenFFBBFB(asset, device, csp);
		MeterAssetToEnergyConsumer assetCorr = (MeterAssetToEnergyConsumer) result1_green[0];
		PhysicalDeviceToEnergyConsumer deviceCorr = (PhysicalDeviceToEnergyConsumer) result1_green[1];
		EnergyConsumer trgConsumer = (EnergyConsumer) result1_green[4];

		// collect translated elements
		Object[] result2_black = EnergyConsumerWithIDConfLoadImpl
				.pattern_EnergyConsumerWithIDConfLoad_1_2_collecttranslatedelements_blackBBBB(assetCorr, deviceCorr,
						pair, trgConsumer);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[assetCorr] = " + assetCorr + ", " + "[deviceCorr] = " + deviceCorr + ", " + "[pair] = " + pair
					+ ", " + "[trgConsumer] = " + trgConsumer + ".");
		}
		Object[] result2_green = EnergyConsumerWithIDConfLoadImpl
				.pattern_EnergyConsumerWithIDConfLoad_1_2_collecttranslatedelements_greenFBBBB(assetCorr, deviceCorr,
						pair, trgConsumer);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = EnergyConsumerWithIDConfLoadImpl
				.pattern_EnergyConsumerWithIDConfLoad_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(ruleresult, area,
						assetCorr, electric, deliver, control, deviceCorr, pair, asset, device, consumer, connect,
						trgConsumer, group);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[area] = " + area + ", " + "[assetCorr] = " + assetCorr
					+ ", " + "[electric] = " + electric + ", " + "[deliver] = " + deliver + ", " + "[control] = "
					+ control + ", " + "[deviceCorr] = " + deviceCorr + ", " + "[pair] = " + pair + ", " + "[asset] = "
					+ asset + ", " + "[device] = " + device + ", " + "[consumer] = " + consumer + ", " + "[connect] = "
					+ connect + ", " + "[trgConsumer] = " + trgConsumer + ", " + "[group] = " + group + ".");
		}
		EnergyConsumerWithIDConfLoadImpl
				.pattern_EnergyConsumerWithIDConfLoad_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(ruleresult, assetCorr,
						deviceCorr, pair, asset, device, trgConsumer);
		// EMoflonEdge assetCorr__trgConsumer____target = (EMoflonEdge) result3_green[7];
		// EMoflonEdge assetCorr__asset____source = (EMoflonEdge) result3_green[8];
		// EMoflonEdge deviceCorr__trgConsumer____target = (EMoflonEdge) result3_green[9];
		// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[10];
		// EMoflonEdge deviceCorr__device____source = (EMoflonEdge) result3_green[11];
		// EMoflonEdge pair__device____b = (EMoflonEdge) result3_green[12];

		// perform postprocessing story node is empty
		// register objects
		EnergyConsumerWithIDConfLoadImpl
				.pattern_EnergyConsumerWithIDConfLoad_1_5_registerobjects_expressionBBBBBBBBBBBBBBB(this, ruleresult,
						area, assetCorr, electric, deliver, control, deviceCorr, pair, asset, device, consumer, connect,
						trgConsumer, group);
		return EnergyConsumerWithIDConfLoadImpl.pattern_EnergyConsumerWithIDConfLoad_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = EnergyConsumerWithIDConfLoadImpl
				.pattern_EnergyConsumerWithIDConfLoad_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EnergyConsumerWithIDConfLoadImpl
				.pattern_EnergyConsumerWithIDConfLoad_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = EnergyConsumerWithIDConfLoadImpl
				.pattern_EnergyConsumerWithIDConfLoad_2_2_corematch_bindingFFFFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		SubLoadArea area = (SubLoadArea) result2_binding[0];
		ElectricityValues electric = (ElectricityValues) result2_binding[1];
		ServiceDeliveryPoint deliver = (ServiceDeliveryPoint) result2_binding[2];
		ControlArea control = (ControlArea) result2_binding[3];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_binding[4];
		MeterAsset asset = (MeterAsset) result2_binding[5];
		PhysicalDevice device = (PhysicalDevice) result2_binding[6];
		ConformLoad consumer = (ConformLoad) result2_binding[7];
		AutoConnectObject connect = (AutoConnectObject) result2_binding[8];
		ConformLoadGroup group = (ConformLoadGroup) result2_binding[9];
		for (Object[] result2_black : EnergyConsumerWithIDConfLoadImpl
				.pattern_EnergyConsumerWithIDConfLoad_2_2_corematch_blackBBBBBBBBBBB(area, electric, deliver, control,
						pair, asset, device, consumer, connect, group, match)) {
			// ForEach find context
			for (Object[] result3_black : EnergyConsumerWithIDConfLoadImpl
					.pattern_EnergyConsumerWithIDConfLoad_2_3_findcontext_blackBBBBBBBBBB(area, electric, deliver,
							control, pair, asset, device, consumer, connect, group)) {
				Object[] result3_green = EnergyConsumerWithIDConfLoadImpl
						.pattern_EnergyConsumerWithIDConfLoad_2_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFFF(area,
								electric, deliver, control, pair, asset, device, consumer, connect, group);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				// EMoflonEdge group__area____SubLoadArea = (EMoflonEdge) result3_green[11];
				// EMoflonEdge area__group____LoadGroups = (EMoflonEdge) result3_green[12];
				// EMoflonEdge deliver__consumer____EnergyConsumer = (EMoflonEdge) result3_green[13];
				// EMoflonEdge consumer__deliver____ServiceDeliveryPoints = (EMoflonEdge) result3_green[14];
				// EMoflonEdge device__connect____AutoConnect = (EMoflonEdge) result3_green[15];
				// EMoflonEdge consumer__group____LoadGroup = (EMoflonEdge) result3_green[16];
				// EMoflonEdge group__consumer____EnergyConsumers = (EMoflonEdge) result3_green[17];
				// EMoflonEdge asset__deliver____ServiceDeliveryPoint = (EMoflonEdge) result3_green[18];
				// EMoflonEdge deliver__asset____EndDeviceAssets = (EMoflonEdge) result3_green[19];
				// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[20];
				// EMoflonEdge area__control____ControlArea = (EMoflonEdge) result3_green[21];
				// EMoflonEdge control__area____EnergyArea = (EMoflonEdge) result3_green[22];
				// EMoflonEdge device__electric____ElectricityValues = (EMoflonEdge) result3_green[23];
				// EMoflonEdge pair__device____b = (EMoflonEdge) result3_green[24];

				// solve CSP
				Object[] result4_bindingAndBlack = EnergyConsumerWithIDConfLoadImpl
						.pattern_EnergyConsumerWithIDConfLoad_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this,
								isApplicableMatch, area, electric, deliver, control, pair, asset, device, consumer,
								connect, group);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[area] = " + area + ", " + "[electric] = " + electric + ", " + "[deliver] = " + deliver
							+ ", " + "[control] = " + control + ", " + "[pair] = " + pair + ", " + "[asset] = " + asset
							+ ", " + "[device] = " + device + ", " + "[consumer] = " + consumer + ", " + "[connect] = "
							+ connect + ", " + "[group] = " + group + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (EnergyConsumerWithIDConfLoadImpl
						.pattern_EnergyConsumerWithIDConfLoad_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = EnergyConsumerWithIDConfLoadImpl
							.pattern_EnergyConsumerWithIDConfLoad_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					EnergyConsumerWithIDConfLoadImpl
							.pattern_EnergyConsumerWithIDConfLoad_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return EnergyConsumerWithIDConfLoadImpl.pattern_EnergyConsumerWithIDConfLoad_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, SubLoadArea area, ElectricityValues electric,
			ServiceDeliveryPoint deliver, ControlArea control, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			PhysicalDevice device, ConformLoad consumer, AutoConnectObject connect, ConformLoadGroup group) {
		match.registerObject("area", area);
		match.registerObject("electric", electric);
		match.registerObject("deliver", deliver);
		match.registerObject("control", control);
		match.registerObject("pair", pair);
		match.registerObject("asset", asset);
		match.registerObject("device", device);
		match.registerObject("consumer", consumer);
		match.registerObject("connect", connect);
		match.registerObject("group", group);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, SubLoadArea area, ElectricityValues electric,
			ServiceDeliveryPoint deliver, ControlArea control, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			PhysicalDevice device, ConformLoad consumer, AutoConnectObject connect, ConformLoadGroup group) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, SubLoadArea area,
			ElectricityValues electric, ServiceDeliveryPoint deliver, ControlArea control,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset, PhysicalDevice device, ConformLoad consumer,
			AutoConnectObject connect, ConformLoadGroup group) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_control_mRID = CSPFactoryHelper.eINSTANCE.createVariable("control.mRID", true, csp);
		var_control_mRID.setValue(control.getMRID());
		var_control_mRID.setType("String");
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
		Variable var_trgConsumer_ControlAreaID = CSPFactoryHelper.eINSTANCE.createVariable("trgConsumer.ControlAreaID",
				csp);
		var_trgConsumer_ControlAreaID.setType("String");
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
		Eq eq_1 = new Eq();
		CastBooleanToInteger castBooleanToInteger = new CastBooleanToInteger();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eq_1);
		csp.getConstraints().add(castBooleanToInteger);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_control_mRID, var_trgConsumer_ControlAreaID);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_consumer_mRID, var_trgConsumer_ID);
		eq_1.setRuleName("NoRuleName");
		eq_1.solve(var_electric_ApparentPowermL1, var_trgConsumer_PowerA);
		castBooleanToInteger.setRuleName("NoRuleName");
		castBooleanToInteger.solve(var_connect_Connection, var_trgConsumer_Reachability);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("area", area);
		isApplicableMatch.registerObject("electric", electric);
		isApplicableMatch.registerObject("deliver", deliver);
		isApplicableMatch.registerObject("control", control);
		isApplicableMatch.registerObject("pair", pair);
		isApplicableMatch.registerObject("asset", asset);
		isApplicableMatch.registerObject("device", device);
		isApplicableMatch.registerObject("consumer", consumer);
		isApplicableMatch.registerObject("connect", connect);
		isApplicableMatch.registerObject("group", group);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject area, EObject assetCorr, EObject electric,
			EObject deliver, EObject control, EObject deviceCorr, EObject pair, EObject asset, EObject device,
			EObject consumer, EObject connect, EObject trgConsumer, EObject group) {
		ruleresult.registerObject("area", area);
		ruleresult.registerObject("assetCorr", assetCorr);
		ruleresult.registerObject("electric", electric);
		ruleresult.registerObject("deliver", deliver);
		ruleresult.registerObject("control", control);
		ruleresult.registerObject("deviceCorr", deviceCorr);
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("asset", asset);
		ruleresult.registerObject("device", device);
		ruleresult.registerObject("consumer", consumer);
		ruleresult.registerObject("connect", connect);
		ruleresult.registerObject("trgConsumer", trgConsumer);
		ruleresult.registerObject("group", group);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_13(EMoflonEdge _edge_a) {
		// prepare return value
		Object[] result1_bindingAndBlack = EnergyConsumerWithIDConfLoadImpl
				.pattern_EnergyConsumerWithIDConfLoad_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = EnergyConsumerWithIDConfLoadImpl
				.pattern_EnergyConsumerWithIDConfLoad_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EnergyConsumerWithIDConfLoadImpl
				.pattern_EnergyConsumerWithIDConfLoad_10_2_testcorematchandDECs_blackFFFFFFFFFFB(_edge_a)) {
			SubLoadArea area = (SubLoadArea) result2_black[0];
			ElectricityValues electric = (ElectricityValues) result2_black[1];
			ServiceDeliveryPoint deliver = (ServiceDeliveryPoint) result2_black[2];
			ControlArea control = (ControlArea) result2_black[3];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_black[4];
			MeterAsset asset = (MeterAsset) result2_black[5];
			PhysicalDevice device = (PhysicalDevice) result2_black[6];
			ConformLoad consumer = (ConformLoad) result2_black[7];
			AutoConnectObject connect = (AutoConnectObject) result2_black[8];
			ConformLoadGroup group = (ConformLoadGroup) result2_black[9];
			Object[] result2_green = EnergyConsumerWithIDConfLoadImpl
					.pattern_EnergyConsumerWithIDConfLoad_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EnergyConsumerWithIDConfLoadImpl
					.pattern_EnergyConsumerWithIDConfLoad_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBBBBBB(
							this, match, area, electric, deliver, control, pair, asset, device, consumer, connect,
							group)) {
				// Ensure that the correct types of elements are matched
				if (EnergyConsumerWithIDConfLoadImpl
						.pattern_EnergyConsumerWithIDConfLoad_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = EnergyConsumerWithIDConfLoadImpl
							.pattern_EnergyConsumerWithIDConfLoad_10_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					EnergyConsumerWithIDConfLoadImpl
							.pattern_EnergyConsumerWithIDConfLoad_10_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return EnergyConsumerWithIDConfLoadImpl.pattern_EnergyConsumerWithIDConfLoad_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("EnergyConsumerWithIDConfLoad");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_control_mRID = CSPFactoryHelper.eINSTANCE.createVariable("control", true, csp);
		var_control_mRID.setValue(__helper.getValue("control", "mRID"));
		var_control_mRID.setType("String");

		Variable var_trgConsumer_ControlAreaID = CSPFactoryHelper.eINSTANCE.createVariable("trgConsumer", true, csp);
		var_trgConsumer_ControlAreaID.setValue(__helper.getValue("trgConsumer", "ControlAreaID"));
		var_trgConsumer_ControlAreaID.setType("String");

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

		Eq eq2 = new Eq();
		csp.getConstraints().add(eq2);

		CastBooleanToInteger castBooleanToInteger3 = new CastBooleanToInteger();
		csp.getConstraints().add(castBooleanToInteger3);

		eq0.setRuleName("EnergyConsumerWithIDConfLoad");
		eq0.solve(var_control_mRID, var_trgConsumer_ControlAreaID);

		eq1.setRuleName("EnergyConsumerWithIDConfLoad");
		eq1.solve(var_consumer_mRID, var_trgConsumer_ID);

		eq2.setRuleName("EnergyConsumerWithIDConfLoad");
		eq2.solve(var_electric_ApparentPowermL1, var_trgConsumer_PowerA);

		castBooleanToInteger3.setRuleName("EnergyConsumerWithIDConfLoad");
		castBooleanToInteger3.solve(var_connect_Connection, var_trgConsumer_Reachability);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_trgConsumer_ControlAreaID.setBound(false);
			var_trgConsumer_ID.setBound(false);
			var_trgConsumer_PowerA.setBound(false);
			var_trgConsumer_Reachability.setBound(false);
			eq0.solve(var_control_mRID, var_trgConsumer_ControlAreaID);
			eq1.solve(var_consumer_mRID, var_trgConsumer_ID);
			eq2.solve(var_electric_ApparentPowermL1, var_trgConsumer_PowerA);
			castBooleanToInteger3.solve(var_connect_Connection, var_trgConsumer_Reachability);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("trgConsumer", "ControlAreaID", var_trgConsumer_ControlAreaID.getValue());
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
	public boolean checkDEC_FWD(SubLoadArea area, ElectricityValues electric, ServiceDeliveryPoint deliver,
			ControlArea control, MeterAssetPhysicalDevicePair pair, MeterAsset asset, PhysicalDevice device,
			ConformLoad consumer, AutoConnectObject connect, ConformLoadGroup group) {// match tgg pattern
		Object[] result1_black = EnergyConsumerWithIDConfLoadImpl
				.pattern_EnergyConsumerWithIDConfLoad_13_1_matchtggpattern_blackBBBBBBBBBB(area, electric, deliver,
						control, pair, asset, device, consumer, connect, group);
		if (result1_black != null) {
			return EnergyConsumerWithIDConfLoadImpl.pattern_EnergyConsumerWithIDConfLoad_13_2_expressionF();
		} else {
			return EnergyConsumerWithIDConfLoadImpl.pattern_EnergyConsumerWithIDConfLoad_13_3_expressionF();
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
		case RulesPackage.ENERGY_CONSUMER_WITH_ID_CONF_LOAD___IS_APPROPRIATE_FWD__MATCH_SUBLOADAREA_ELECTRICITYVALUES_SERVICEDELIVERYPOINT_CONTROLAREA_METERASSETPHYSICALDEVICEPAIR_METERASSET_PHYSICALDEVICE_CONFORMLOAD_AUTOCONNECTOBJECT_CONFORMLOADGROUP:
			return isAppropriate_FWD((Match) arguments.get(0), (SubLoadArea) arguments.get(1),
					(ElectricityValues) arguments.get(2), (ServiceDeliveryPoint) arguments.get(3),
					(ControlArea) arguments.get(4), (MeterAssetPhysicalDevicePair) arguments.get(5),
					(MeterAsset) arguments.get(6), (PhysicalDevice) arguments.get(7), (ConformLoad) arguments.get(8),
					(AutoConnectObject) arguments.get(9), (ConformLoadGroup) arguments.get(10));
		case RulesPackage.ENERGY_CONSUMER_WITH_ID_CONF_LOAD___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER_WITH_ID_CONF_LOAD___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER_WITH_ID_CONF_LOAD___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SUBLOADAREA_ELECTRICITYVALUES_SERVICEDELIVERYPOINT_CONTROLAREA_METERASSETPHYSICALDEVICEPAIR_METERASSET_PHYSICALDEVICE_CONFORMLOAD_AUTOCONNECTOBJECT_CONFORMLOADGROUP:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (SubLoadArea) arguments.get(1),
					(ElectricityValues) arguments.get(2), (ServiceDeliveryPoint) arguments.get(3),
					(ControlArea) arguments.get(4), (MeterAssetPhysicalDevicePair) arguments.get(5),
					(MeterAsset) arguments.get(6), (PhysicalDevice) arguments.get(7), (ConformLoad) arguments.get(8),
					(AutoConnectObject) arguments.get(9), (ConformLoadGroup) arguments.get(10));
			return null;
		case RulesPackage.ENERGY_CONSUMER_WITH_ID_CONF_LOAD___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SUBLOADAREA_ELECTRICITYVALUES_SERVICEDELIVERYPOINT_CONTROLAREA_METERASSETPHYSICALDEVICEPAIR_METERASSET_PHYSICALDEVICE_CONFORMLOAD_AUTOCONNECTOBJECT_CONFORMLOADGROUP:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (SubLoadArea) arguments.get(1),
					(ElectricityValues) arguments.get(2), (ServiceDeliveryPoint) arguments.get(3),
					(ControlArea) arguments.get(4), (MeterAssetPhysicalDevicePair) arguments.get(5),
					(MeterAsset) arguments.get(6), (PhysicalDevice) arguments.get(7), (ConformLoad) arguments.get(8),
					(AutoConnectObject) arguments.get(9), (ConformLoadGroup) arguments.get(10));
		case RulesPackage.ENERGY_CONSUMER_WITH_ID_CONF_LOAD___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER_WITH_ID_CONF_LOAD___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SUBLOADAREA_ELECTRICITYVALUES_SERVICEDELIVERYPOINT_CONTROLAREA_METERASSETPHYSICALDEVICEPAIR_METERASSET_PHYSICALDEVICE_CONFORMLOAD_AUTOCONNECTOBJECT_CONFORMLOADGROUP:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (SubLoadArea) arguments.get(1),
					(ElectricityValues) arguments.get(2), (ServiceDeliveryPoint) arguments.get(3),
					(ControlArea) arguments.get(4), (MeterAssetPhysicalDevicePair) arguments.get(5),
					(MeterAsset) arguments.get(6), (PhysicalDevice) arguments.get(7), (ConformLoad) arguments.get(8),
					(AutoConnectObject) arguments.get(9), (ConformLoadGroup) arguments.get(10));
		case RulesPackage.ENERGY_CONSUMER_WITH_ID_CONF_LOAD___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER_WITH_ID_CONF_LOAD___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13));
			return null;
		case RulesPackage.ENERGY_CONSUMER_WITH_ID_CONF_LOAD___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER_WITH_ID_CONF_LOAD___IS_APPROPRIATE_FWD_EMOFLON_EDGE_13__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_13((EMoflonEdge) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER_WITH_ID_CONF_LOAD___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER_WITH_ID_CONF_LOAD___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ENERGY_CONSUMER_WITH_ID_CONF_LOAD___CHECK_DEC_FWD__SUBLOADAREA_ELECTRICITYVALUES_SERVICEDELIVERYPOINT_CONTROLAREA_METERASSETPHYSICALDEVICEPAIR_METERASSET_PHYSICALDEVICE_CONFORMLOAD_AUTOCONNECTOBJECT_CONFORMLOADGROUP:
			return checkDEC_FWD((SubLoadArea) arguments.get(0), (ElectricityValues) arguments.get(1),
					(ServiceDeliveryPoint) arguments.get(2), (ControlArea) arguments.get(3),
					(MeterAssetPhysicalDevicePair) arguments.get(4), (MeterAsset) arguments.get(5),
					(PhysicalDevice) arguments.get(6), (ConformLoad) arguments.get(7),
					(AutoConnectObject) arguments.get(8), (ConformLoadGroup) arguments.get(9));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_0_1_initialbindings_blackBBBBBBBBBBBB(
			EnergyConsumerWithIDConfLoad _this, Match match, SubLoadArea area, ElectricityValues electric,
			ServiceDeliveryPoint deliver, ControlArea control, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			PhysicalDevice device, ConformLoad consumer, AutoConnectObject connect, ConformLoadGroup group) {
		return new Object[] { _this, match, area, electric, deliver, control, pair, asset, device, consumer, connect,
				group };
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_0_2_SolveCSP_bindingFBBBBBBBBBBBB(
			EnergyConsumerWithIDConfLoad _this, Match match, SubLoadArea area, ElectricityValues electric,
			ServiceDeliveryPoint deliver, ControlArea control, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			PhysicalDevice device, ConformLoad consumer, AutoConnectObject connect, ConformLoadGroup group) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, area, electric, deliver, control, pair, asset,
				device, consumer, connect, group);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, area, electric, deliver, control, pair, asset, device, consumer,
					connect, group };
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_0_2_SolveCSP_bindingAndBlackFBBBBBBBBBBBB(
			EnergyConsumerWithIDConfLoad _this, Match match, SubLoadArea area, ElectricityValues electric,
			ServiceDeliveryPoint deliver, ControlArea control, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			PhysicalDevice device, ConformLoad consumer, AutoConnectObject connect, ConformLoadGroup group) {
		Object[] result_pattern_EnergyConsumerWithIDConfLoad_0_2_SolveCSP_binding = pattern_EnergyConsumerWithIDConfLoad_0_2_SolveCSP_bindingFBBBBBBBBBBBB(
				_this, match, area, electric, deliver, control, pair, asset, device, consumer, connect, group);
		if (result_pattern_EnergyConsumerWithIDConfLoad_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnergyConsumerWithIDConfLoad_0_2_SolveCSP_binding[0];

			Object[] result_pattern_EnergyConsumerWithIDConfLoad_0_2_SolveCSP_black = pattern_EnergyConsumerWithIDConfLoad_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_EnergyConsumerWithIDConfLoad_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, area, electric, deliver, control, pair, asset, device,
						consumer, connect, group };
			}
		}
		return null;
	}

	public static final boolean pattern_EnergyConsumerWithIDConfLoad_0_3_CheckCSP_expressionFBB(
			EnergyConsumerWithIDConfLoad _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_0_4_collectelementstobetranslated_blackBBBBBBBBBBB(
			Match match, SubLoadArea area, ElectricityValues electric, ServiceDeliveryPoint deliver,
			ControlArea control, MeterAssetPhysicalDevicePair pair, MeterAsset asset, PhysicalDevice device,
			ConformLoad consumer, AutoConnectObject connect, ConformLoadGroup group) {
		return new Object[] { match, area, electric, deliver, control, pair, asset, device, consumer, connect, group };
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_0_4_collectelementstobetranslated_greenBBBBFF(
			Match match, MeterAssetPhysicalDevicePair pair, MeterAsset asset, PhysicalDevice device) {
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
		return new Object[] { match, pair, asset, device, pair__asset____a, pair__device____b };
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_0_5_collectcontextelements_blackBBBBBBBBBBB(
			Match match, SubLoadArea area, ElectricityValues electric, ServiceDeliveryPoint deliver,
			ControlArea control, MeterAssetPhysicalDevicePair pair, MeterAsset asset, PhysicalDevice device,
			ConformLoad consumer, AutoConnectObject connect, ConformLoadGroup group) {
		return new Object[] { match, area, electric, deliver, control, pair, asset, device, consumer, connect, group };
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_0_5_collectcontextelements_greenBBBBBBBBBBFFFFFFFFFFFF(
			Match match, SubLoadArea area, ElectricityValues electric, ServiceDeliveryPoint deliver,
			ControlArea control, MeterAsset asset, PhysicalDevice device, ConformLoad consumer,
			AutoConnectObject connect, ConformLoadGroup group) {
		EMoflonEdge group__area____SubLoadArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge area__group____LoadGroups = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge deliver__consumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge consumer__deliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device__connect____AutoConnect = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge consumer__group____LoadGroup = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge group__consumer____EnergyConsumers = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__deliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge deliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge area__control____ControlArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge control__area____EnergyArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device__electric____ElectricityValues = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(area);
		match.getContextNodes().add(electric);
		match.getContextNodes().add(deliver);
		match.getContextNodes().add(control);
		match.getContextNodes().add(asset);
		match.getContextNodes().add(device);
		match.getContextNodes().add(consumer);
		match.getContextNodes().add(connect);
		match.getContextNodes().add(group);
		String group__area____SubLoadArea_name_prime = "SubLoadArea";
		String area__group____LoadGroups_name_prime = "LoadGroups";
		String deliver__consumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String consumer__deliver____ServiceDeliveryPoints_name_prime = "ServiceDeliveryPoints";
		String device__connect____AutoConnect_name_prime = "AutoConnect";
		String consumer__group____LoadGroup_name_prime = "LoadGroup";
		String group__consumer____EnergyConsumers_name_prime = "EnergyConsumers";
		String asset__deliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String deliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		String area__control____ControlArea_name_prime = "ControlArea";
		String control__area____EnergyArea_name_prime = "EnergyArea";
		String device__electric____ElectricityValues_name_prime = "ElectricityValues";
		group__area____SubLoadArea.setSrc(group);
		group__area____SubLoadArea.setTrg(area);
		match.getContextEdges().add(group__area____SubLoadArea);
		area__group____LoadGroups.setSrc(area);
		area__group____LoadGroups.setTrg(group);
		match.getContextEdges().add(area__group____LoadGroups);
		deliver__consumer____EnergyConsumer.setSrc(deliver);
		deliver__consumer____EnergyConsumer.setTrg(consumer);
		match.getContextEdges().add(deliver__consumer____EnergyConsumer);
		consumer__deliver____ServiceDeliveryPoints.setSrc(consumer);
		consumer__deliver____ServiceDeliveryPoints.setTrg(deliver);
		match.getContextEdges().add(consumer__deliver____ServiceDeliveryPoints);
		device__connect____AutoConnect.setSrc(device);
		device__connect____AutoConnect.setTrg(connect);
		match.getContextEdges().add(device__connect____AutoConnect);
		consumer__group____LoadGroup.setSrc(consumer);
		consumer__group____LoadGroup.setTrg(group);
		match.getContextEdges().add(consumer__group____LoadGroup);
		group__consumer____EnergyConsumers.setSrc(group);
		group__consumer____EnergyConsumers.setTrg(consumer);
		match.getContextEdges().add(group__consumer____EnergyConsumers);
		asset__deliver____ServiceDeliveryPoint.setSrc(asset);
		asset__deliver____ServiceDeliveryPoint.setTrg(deliver);
		match.getContextEdges().add(asset__deliver____ServiceDeliveryPoint);
		deliver__asset____EndDeviceAssets.setSrc(deliver);
		deliver__asset____EndDeviceAssets.setTrg(asset);
		match.getContextEdges().add(deliver__asset____EndDeviceAssets);
		area__control____ControlArea.setSrc(area);
		area__control____ControlArea.setTrg(control);
		match.getContextEdges().add(area__control____ControlArea);
		control__area____EnergyArea.setSrc(control);
		control__area____EnergyArea.setTrg(area);
		match.getContextEdges().add(control__area____EnergyArea);
		device__electric____ElectricityValues.setSrc(device);
		device__electric____ElectricityValues.setTrg(electric);
		match.getContextEdges().add(device__electric____ElectricityValues);
		group__area____SubLoadArea.setName(group__area____SubLoadArea_name_prime);
		area__group____LoadGroups.setName(area__group____LoadGroups_name_prime);
		deliver__consumer____EnergyConsumer.setName(deliver__consumer____EnergyConsumer_name_prime);
		consumer__deliver____ServiceDeliveryPoints.setName(consumer__deliver____ServiceDeliveryPoints_name_prime);
		device__connect____AutoConnect.setName(device__connect____AutoConnect_name_prime);
		consumer__group____LoadGroup.setName(consumer__group____LoadGroup_name_prime);
		group__consumer____EnergyConsumers.setName(group__consumer____EnergyConsumers_name_prime);
		asset__deliver____ServiceDeliveryPoint.setName(asset__deliver____ServiceDeliveryPoint_name_prime);
		deliver__asset____EndDeviceAssets.setName(deliver__asset____EndDeviceAssets_name_prime);
		area__control____ControlArea.setName(area__control____ControlArea_name_prime);
		control__area____EnergyArea.setName(control__area____EnergyArea_name_prime);
		device__electric____ElectricityValues.setName(device__electric____ElectricityValues_name_prime);
		return new Object[] { match, area, electric, deliver, control, asset, device, consumer, connect, group,
				group__area____SubLoadArea, area__group____LoadGroups, deliver__consumer____EnergyConsumer,
				consumer__deliver____ServiceDeliveryPoints, device__connect____AutoConnect,
				consumer__group____LoadGroup, group__consumer____EnergyConsumers,
				asset__deliver____ServiceDeliveryPoint, deliver__asset____EndDeviceAssets, area__control____ControlArea,
				control__area____EnergyArea, device__electric____ElectricityValues };
	}

	public static final void pattern_EnergyConsumerWithIDConfLoad_0_6_registerobjectstomatch_expressionBBBBBBBBBBBB(
			EnergyConsumerWithIDConfLoad _this, Match match, SubLoadArea area, ElectricityValues electric,
			ServiceDeliveryPoint deliver, ControlArea control, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			PhysicalDevice device, ConformLoad consumer, AutoConnectObject connect, ConformLoadGroup group) {
		_this.registerObjectsToMatch_FWD(match, area, electric, deliver, control, pair, asset, device, consumer,
				connect, group);

	}

	public static final boolean pattern_EnergyConsumerWithIDConfLoad_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EnergyConsumerWithIDConfLoad_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_1_1_performtransformation_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("area");
		EObject _localVariable_1 = isApplicableMatch.getObject("electric");
		EObject _localVariable_2 = isApplicableMatch.getObject("deliver");
		EObject _localVariable_3 = isApplicableMatch.getObject("control");
		EObject _localVariable_4 = isApplicableMatch.getObject("pair");
		EObject _localVariable_5 = isApplicableMatch.getObject("asset");
		EObject _localVariable_6 = isApplicableMatch.getObject("device");
		EObject _localVariable_7 = isApplicableMatch.getObject("consumer");
		EObject _localVariable_8 = isApplicableMatch.getObject("connect");
		EObject _localVariable_9 = isApplicableMatch.getObject("group");
		EObject tmpArea = _localVariable_0;
		EObject tmpElectric = _localVariable_1;
		EObject tmpDeliver = _localVariable_2;
		EObject tmpControl = _localVariable_3;
		EObject tmpPair = _localVariable_4;
		EObject tmpAsset = _localVariable_5;
		EObject tmpDevice = _localVariable_6;
		EObject tmpConsumer = _localVariable_7;
		EObject tmpConnect = _localVariable_8;
		EObject tmpGroup = _localVariable_9;
		if (tmpArea instanceof SubLoadArea) {
			SubLoadArea area = (SubLoadArea) tmpArea;
			if (tmpElectric instanceof ElectricityValues) {
				ElectricityValues electric = (ElectricityValues) tmpElectric;
				if (tmpDeliver instanceof ServiceDeliveryPoint) {
					ServiceDeliveryPoint deliver = (ServiceDeliveryPoint) tmpDeliver;
					if (tmpControl instanceof ControlArea) {
						ControlArea control = (ControlArea) tmpControl;
						if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
							MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
							if (tmpAsset instanceof MeterAsset) {
								MeterAsset asset = (MeterAsset) tmpAsset;
								if (tmpDevice instanceof PhysicalDevice) {
									PhysicalDevice device = (PhysicalDevice) tmpDevice;
									if (tmpConsumer instanceof ConformLoad) {
										ConformLoad consumer = (ConformLoad) tmpConsumer;
										if (tmpConnect instanceof AutoConnectObject) {
											AutoConnectObject connect = (AutoConnectObject) tmpConnect;
											if (tmpGroup instanceof ConformLoadGroup) {
												ConformLoadGroup group = (ConformLoadGroup) tmpGroup;
												return new Object[] { area, electric, deliver, control, pair, asset,
														device, consumer, connect, group, isApplicableMatch };
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

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_1_1_performtransformation_blackBBBBBBBBBBFBB(
			SubLoadArea area, ElectricityValues electric, ServiceDeliveryPoint deliver, ControlArea control,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset, PhysicalDevice device, ConformLoad consumer,
			AutoConnectObject connect, ConformLoadGroup group, EnergyConsumerWithIDConfLoad _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { area, electric, deliver, control, pair, asset, device, consumer, connect, group,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(
			EnergyConsumerWithIDConfLoad _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EnergyConsumerWithIDConfLoad_1_1_performtransformation_binding = pattern_EnergyConsumerWithIDConfLoad_1_1_performtransformation_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_EnergyConsumerWithIDConfLoad_1_1_performtransformation_binding != null) {
			SubLoadArea area = (SubLoadArea) result_pattern_EnergyConsumerWithIDConfLoad_1_1_performtransformation_binding[0];
			ElectricityValues electric = (ElectricityValues) result_pattern_EnergyConsumerWithIDConfLoad_1_1_performtransformation_binding[1];
			ServiceDeliveryPoint deliver = (ServiceDeliveryPoint) result_pattern_EnergyConsumerWithIDConfLoad_1_1_performtransformation_binding[2];
			ControlArea control = (ControlArea) result_pattern_EnergyConsumerWithIDConfLoad_1_1_performtransformation_binding[3];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result_pattern_EnergyConsumerWithIDConfLoad_1_1_performtransformation_binding[4];
			MeterAsset asset = (MeterAsset) result_pattern_EnergyConsumerWithIDConfLoad_1_1_performtransformation_binding[5];
			PhysicalDevice device = (PhysicalDevice) result_pattern_EnergyConsumerWithIDConfLoad_1_1_performtransformation_binding[6];
			ConformLoad consumer = (ConformLoad) result_pattern_EnergyConsumerWithIDConfLoad_1_1_performtransformation_binding[7];
			AutoConnectObject connect = (AutoConnectObject) result_pattern_EnergyConsumerWithIDConfLoad_1_1_performtransformation_binding[8];
			ConformLoadGroup group = (ConformLoadGroup) result_pattern_EnergyConsumerWithIDConfLoad_1_1_performtransformation_binding[9];

			Object[] result_pattern_EnergyConsumerWithIDConfLoad_1_1_performtransformation_black = pattern_EnergyConsumerWithIDConfLoad_1_1_performtransformation_blackBBBBBBBBBBFBB(
					area, electric, deliver, control, pair, asset, device, consumer, connect, group, _this,
					isApplicableMatch);
			if (result_pattern_EnergyConsumerWithIDConfLoad_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_EnergyConsumerWithIDConfLoad_1_1_performtransformation_black[10];

				return new Object[] { area, electric, deliver, control, pair, asset, device, consumer, connect, group,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_1_1_performtransformation_greenFFBBFB(
			MeterAsset asset, PhysicalDevice device, CSP csp) {
		MeterAssetToEnergyConsumer assetCorr = Task1Factory.eINSTANCE.createMeterAssetToEnergyConsumer();
		PhysicalDeviceToEnergyConsumer deviceCorr = Task1Factory.eINSTANCE.createPhysicalDeviceToEnergyConsumer();
		EnergyConsumer trgConsumer = OutageDetectionJointargetFactory.eINSTANCE.createEnergyConsumer();
		Object _localVariable_0 = csp.getValue("trgConsumer", "ControlAreaID");
		Object _localVariable_1 = csp.getValue("trgConsumer", "ID");
		Object _localVariable_2 = csp.getValue("trgConsumer", "PowerA");
		Object _localVariable_3 = csp.getValue("trgConsumer", "Reachability");
		assetCorr.setSource(asset);
		deviceCorr.setSource(device);
		assetCorr.setTarget(trgConsumer);
		deviceCorr.setTarget(trgConsumer);
		String trgConsumer_ControlAreaID_prime = (String) _localVariable_0;
		String trgConsumer_ID_prime = (String) _localVariable_1;
		double trgConsumer_PowerA_prime = (double) _localVariable_2;
		int trgConsumer_Reachability_prime = (int) _localVariable_3;
		trgConsumer.setControlAreaID(trgConsumer_ControlAreaID_prime);
		trgConsumer.setID(trgConsumer_ID_prime);
		trgConsumer.setPowerA(Double.valueOf(trgConsumer_PowerA_prime));
		trgConsumer.setReachability(Integer.valueOf(trgConsumer_Reachability_prime));
		return new Object[] { assetCorr, deviceCorr, asset, device, trgConsumer, csp };
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_1_2_collecttranslatedelements_blackBBBB(
			MeterAssetToEnergyConsumer assetCorr, PhysicalDeviceToEnergyConsumer deviceCorr,
			MeterAssetPhysicalDevicePair pair, EnergyConsumer trgConsumer) {
		return new Object[] { assetCorr, deviceCorr, pair, trgConsumer };
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_1_2_collecttranslatedelements_greenFBBBB(
			MeterAssetToEnergyConsumer assetCorr, PhysicalDeviceToEnergyConsumer deviceCorr,
			MeterAssetPhysicalDevicePair pair, EnergyConsumer trgConsumer) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(assetCorr);
		ruleresult.getCreatedLinkElements().add(deviceCorr);
		ruleresult.getTranslatedElements().add(pair);
		ruleresult.getCreatedElements().add(trgConsumer);
		return new Object[] { ruleresult, assetCorr, deviceCorr, pair, trgConsumer };
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject area, EObject assetCorr, EObject electric, EObject deliver,
			EObject control, EObject deviceCorr, EObject pair, EObject asset, EObject device, EObject consumer,
			EObject connect, EObject trgConsumer, EObject group) {
		if (!area.equals(assetCorr)) {
			if (!area.equals(electric)) {
				if (!area.equals(deliver)) {
					if (!area.equals(control)) {
						if (!area.equals(deviceCorr)) {
							if (!area.equals(pair)) {
								if (!area.equals(asset)) {
									if (!area.equals(device)) {
										if (!area.equals(consumer)) {
											if (!area.equals(connect)) {
												if (!area.equals(trgConsumer)) {
													if (!area.equals(group)) {
														if (!assetCorr.equals(electric)) {
															if (!assetCorr.equals(deliver)) {
																if (!assetCorr.equals(control)) {
																	if (!assetCorr.equals(deviceCorr)) {
																		if (!assetCorr.equals(pair)) {
																			if (!assetCorr.equals(device)) {
																				if (!assetCorr.equals(consumer)) {
																					if (!assetCorr.equals(connect)) {
																						if (!assetCorr
																								.equals(trgConsumer)) {
																							if (!assetCorr
																									.equals(group)) {
																								if (!electric
																										.equals(pair)) {
																									if (!electric
																											.equals(trgConsumer)) {
																										if (!electric
																												.equals(group)) {
																											if (!deliver
																													.equals(electric)) {
																												if (!deliver
																														.equals(deviceCorr)) {
																													if (!deliver
																															.equals(pair)) {
																														if (!deliver
																																.equals(device)) {
																															if (!deliver
																																	.equals(trgConsumer)) {
																																if (!deliver
																																		.equals(group)) {
																																	if (!control
																																			.equals(electric)) {
																																		if (!control
																																				.equals(deliver)) {
																																			if (!control
																																					.equals(deviceCorr)) {
																																				if (!control
																																						.equals(pair)) {
																																					if (!control
																																							.equals(device)) {
																																						if (!control
																																								.equals(trgConsumer)) {
																																							if (!control
																																									.equals(group)) {
																																								if (!deviceCorr
																																										.equals(electric)) {
																																									if (!deviceCorr
																																											.equals(pair)) {
																																										if (!deviceCorr
																																												.equals(trgConsumer)) {
																																											if (!deviceCorr
																																													.equals(group)) {
																																												if (!pair
																																														.equals(trgConsumer)) {
																																													if (!asset
																																															.equals(assetCorr)) {
																																														if (!asset
																																																.equals(electric)) {
																																															if (!asset
																																																	.equals(deliver)) {
																																																if (!asset
																																																		.equals(control)) {
																																																	if (!asset
																																																			.equals(deviceCorr)) {
																																																		if (!asset
																																																				.equals(pair)) {
																																																			if (!asset
																																																					.equals(device)) {
																																																				if (!asset
																																																						.equals(consumer)) {
																																																					if (!asset
																																																							.equals(connect)) {
																																																						if (!asset
																																																								.equals(trgConsumer)) {
																																																							if (!asset
																																																									.equals(group)) {
																																																								if (!device
																																																										.equals(electric)) {
																																																									if (!device
																																																											.equals(deviceCorr)) {
																																																										if (!device
																																																												.equals(pair)) {
																																																											if (!device
																																																													.equals(trgConsumer)) {
																																																												if (!device
																																																														.equals(group)) {
																																																													if (!consumer
																																																															.equals(electric)) {
																																																														if (!consumer
																																																																.equals(deliver)) {
																																																															if (!consumer
																																																																	.equals(control)) {
																																																																if (!consumer
																																																																		.equals(deviceCorr)) {
																																																																	if (!consumer
																																																																			.equals(pair)) {
																																																																		if (!consumer
																																																																				.equals(device)) {
																																																																			if (!consumer
																																																																					.equals(trgConsumer)) {
																																																																				if (!consumer
																																																																						.equals(group)) {
																																																																					if (!connect
																																																																							.equals(electric)) {
																																																																						if (!connect
																																																																								.equals(deliver)) {
																																																																							if (!connect
																																																																									.equals(control)) {
																																																																								if (!connect
																																																																										.equals(deviceCorr)) {
																																																																									if (!connect
																																																																											.equals(pair)) {
																																																																										if (!connect
																																																																												.equals(device)) {
																																																																											if (!connect
																																																																													.equals(consumer)) {
																																																																												if (!connect
																																																																														.equals(trgConsumer)) {
																																																																													if (!connect
																																																																															.equals(group)) {
																																																																														if (!group
																																																																																.equals(pair)) {
																																																																															if (!group
																																																																																	.equals(trgConsumer)) {
																																																																																return new Object[] {
																																																																																		ruleresult,
																																																																																		area,
																																																																																		assetCorr,
																																																																																		electric,
																																																																																		deliver,
																																																																																		control,
																																																																																		deviceCorr,
																																																																																		pair,
																																																																																		asset,
																																																																																		device,
																																																																																		consumer,
																																																																																		connect,
																																																																																		trgConsumer,
																																																																																		group };
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

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject assetCorr, EObject deviceCorr, EObject pair, EObject asset,
			EObject device, EObject trgConsumer) {
		EMoflonEdge assetCorr__trgConsumer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge assetCorr__asset____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge deviceCorr__trgConsumer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge deviceCorr__device____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__device____b = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EnergyConsumerWithIDConfLoad";
		String assetCorr__trgConsumer____target_name_prime = "target";
		String assetCorr__asset____source_name_prime = "source";
		String deviceCorr__trgConsumer____target_name_prime = "target";
		String pair__asset____a_name_prime = "a";
		String deviceCorr__device____source_name_prime = "source";
		String pair__device____b_name_prime = "b";
		assetCorr__trgConsumer____target.setSrc(assetCorr);
		assetCorr__trgConsumer____target.setTrg(trgConsumer);
		ruleresult.getCreatedEdges().add(assetCorr__trgConsumer____target);
		assetCorr__asset____source.setSrc(assetCorr);
		assetCorr__asset____source.setTrg(asset);
		ruleresult.getCreatedEdges().add(assetCorr__asset____source);
		deviceCorr__trgConsumer____target.setSrc(deviceCorr);
		deviceCorr__trgConsumer____target.setTrg(trgConsumer);
		ruleresult.getCreatedEdges().add(deviceCorr__trgConsumer____target);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		ruleresult.getTranslatedEdges().add(pair__asset____a);
		deviceCorr__device____source.setSrc(deviceCorr);
		deviceCorr__device____source.setTrg(device);
		ruleresult.getCreatedEdges().add(deviceCorr__device____source);
		pair__device____b.setSrc(pair);
		pair__device____b.setTrg(device);
		ruleresult.getTranslatedEdges().add(pair__device____b);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		assetCorr__trgConsumer____target.setName(assetCorr__trgConsumer____target_name_prime);
		assetCorr__asset____source.setName(assetCorr__asset____source_name_prime);
		deviceCorr__trgConsumer____target.setName(deviceCorr__trgConsumer____target_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		deviceCorr__device____source.setName(deviceCorr__device____source_name_prime);
		pair__device____b.setName(pair__device____b_name_prime);
		return new Object[] { ruleresult, assetCorr, deviceCorr, pair, asset, device, trgConsumer,
				assetCorr__trgConsumer____target, assetCorr__asset____source, deviceCorr__trgConsumer____target,
				pair__asset____a, deviceCorr__device____source, pair__device____b };
	}

	public static final void pattern_EnergyConsumerWithIDConfLoad_1_5_registerobjects_expressionBBBBBBBBBBBBBBB(
			EnergyConsumerWithIDConfLoad _this, PerformRuleResult ruleresult, EObject area, EObject assetCorr,
			EObject electric, EObject deliver, EObject control, EObject deviceCorr, EObject pair, EObject asset,
			EObject device, EObject consumer, EObject connect, EObject trgConsumer, EObject group) {
		_this.registerObjects_FWD(ruleresult, area, assetCorr, electric, deliver, control, deviceCorr, pair, asset,
				device, consumer, connect, trgConsumer, group);

	}

	public static final PerformRuleResult pattern_EnergyConsumerWithIDConfLoad_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_2_1_preparereturnvalue_bindingFB(
			EnergyConsumerWithIDConfLoad _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_2_1_preparereturnvalue_blackFBB(EClass eClass,
			EnergyConsumerWithIDConfLoad _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_2_1_preparereturnvalue_bindingAndBlackFFB(
			EnergyConsumerWithIDConfLoad _this) {
		Object[] result_pattern_EnergyConsumerWithIDConfLoad_2_1_preparereturnvalue_binding = pattern_EnergyConsumerWithIDConfLoad_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_EnergyConsumerWithIDConfLoad_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_EnergyConsumerWithIDConfLoad_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_EnergyConsumerWithIDConfLoad_2_1_preparereturnvalue_black = pattern_EnergyConsumerWithIDConfLoad_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_EnergyConsumerWithIDConfLoad_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EnergyConsumerWithIDConfLoad_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "EnergyConsumerWithIDConfLoad";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_2_2_corematch_bindingFFFFFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("area");
		EObject _localVariable_1 = match.getObject("electric");
		EObject _localVariable_2 = match.getObject("deliver");
		EObject _localVariable_3 = match.getObject("control");
		EObject _localVariable_4 = match.getObject("pair");
		EObject _localVariable_5 = match.getObject("asset");
		EObject _localVariable_6 = match.getObject("device");
		EObject _localVariable_7 = match.getObject("consumer");
		EObject _localVariable_8 = match.getObject("connect");
		EObject _localVariable_9 = match.getObject("group");
		EObject tmpArea = _localVariable_0;
		EObject tmpElectric = _localVariable_1;
		EObject tmpDeliver = _localVariable_2;
		EObject tmpControl = _localVariable_3;
		EObject tmpPair = _localVariable_4;
		EObject tmpAsset = _localVariable_5;
		EObject tmpDevice = _localVariable_6;
		EObject tmpConsumer = _localVariable_7;
		EObject tmpConnect = _localVariable_8;
		EObject tmpGroup = _localVariable_9;
		if (tmpArea instanceof SubLoadArea) {
			SubLoadArea area = (SubLoadArea) tmpArea;
			if (tmpElectric instanceof ElectricityValues) {
				ElectricityValues electric = (ElectricityValues) tmpElectric;
				if (tmpDeliver instanceof ServiceDeliveryPoint) {
					ServiceDeliveryPoint deliver = (ServiceDeliveryPoint) tmpDeliver;
					if (tmpControl instanceof ControlArea) {
						ControlArea control = (ControlArea) tmpControl;
						if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
							MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
							if (tmpAsset instanceof MeterAsset) {
								MeterAsset asset = (MeterAsset) tmpAsset;
								if (tmpDevice instanceof PhysicalDevice) {
									PhysicalDevice device = (PhysicalDevice) tmpDevice;
									if (tmpConsumer instanceof ConformLoad) {
										ConformLoad consumer = (ConformLoad) tmpConsumer;
										if (tmpConnect instanceof AutoConnectObject) {
											AutoConnectObject connect = (AutoConnectObject) tmpConnect;
											if (tmpGroup instanceof ConformLoadGroup) {
												ConformLoadGroup group = (ConformLoadGroup) tmpGroup;
												return new Object[] { area, electric, deliver, control, pair, asset,
														device, consumer, connect, group, match };
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

	public static final Iterable<Object[]> pattern_EnergyConsumerWithIDConfLoad_2_2_corematch_blackBBBBBBBBBBB(
			SubLoadArea area, ElectricityValues electric, ServiceDeliveryPoint deliver, ControlArea control,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset, PhysicalDevice device, ConformLoad consumer,
			AutoConnectObject connect, ConformLoadGroup group, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { area, electric, deliver, control, pair, asset, device, consumer, connect, group,
				match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_EnergyConsumerWithIDConfLoad_2_3_findcontext_blackBBBBBBBBBB(
			SubLoadArea area, ElectricityValues electric, ServiceDeliveryPoint deliver, ControlArea control,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset, PhysicalDevice device, ConformLoad consumer,
			AutoConnectObject connect, ConformLoadGroup group) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (area.equals(group.getSubLoadArea())) {
			if (consumer.equals(deliver.getEnergyConsumer())) {
				if (connect.equals(device.getAutoConnect())) {
					if (group.equals(consumer.getLoadGroup())) {
						if (deliver.equals(asset.getServiceDeliveryPoint())) {
							if (asset.equals(pair.getA())) {
								if (control.equals(area.getControlArea())) {
									if (electric.equals(device.getElectricityValues())) {
										if (device.equals(pair.getB())) {
											_result.add(new Object[] { area, electric, deliver, control, pair, asset,
													device, consumer, connect, group });
										}
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

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_2_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFFF(
			SubLoadArea area, ElectricityValues electric, ServiceDeliveryPoint deliver, ControlArea control,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset, PhysicalDevice device, ConformLoad consumer,
			AutoConnectObject connect, ConformLoadGroup group) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge group__area____SubLoadArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge area__group____LoadGroups = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge deliver__consumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge consumer__deliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device__connect____AutoConnect = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge consumer__group____LoadGroup = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge group__consumer____EnergyConsumers = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__deliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge deliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge area__control____ControlArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge control__area____EnergyArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device__electric____ElectricityValues = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__device____b = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String group__area____SubLoadArea_name_prime = "SubLoadArea";
		String area__group____LoadGroups_name_prime = "LoadGroups";
		String deliver__consumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String consumer__deliver____ServiceDeliveryPoints_name_prime = "ServiceDeliveryPoints";
		String device__connect____AutoConnect_name_prime = "AutoConnect";
		String consumer__group____LoadGroup_name_prime = "LoadGroup";
		String group__consumer____EnergyConsumers_name_prime = "EnergyConsumers";
		String asset__deliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String deliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		String pair__asset____a_name_prime = "a";
		String area__control____ControlArea_name_prime = "ControlArea";
		String control__area____EnergyArea_name_prime = "EnergyArea";
		String device__electric____ElectricityValues_name_prime = "ElectricityValues";
		String pair__device____b_name_prime = "b";
		isApplicableMatch.getAllContextElements().add(area);
		isApplicableMatch.getAllContextElements().add(electric);
		isApplicableMatch.getAllContextElements().add(deliver);
		isApplicableMatch.getAllContextElements().add(control);
		isApplicableMatch.getAllContextElements().add(pair);
		isApplicableMatch.getAllContextElements().add(asset);
		isApplicableMatch.getAllContextElements().add(device);
		isApplicableMatch.getAllContextElements().add(consumer);
		isApplicableMatch.getAllContextElements().add(connect);
		isApplicableMatch.getAllContextElements().add(group);
		group__area____SubLoadArea.setSrc(group);
		group__area____SubLoadArea.setTrg(area);
		isApplicableMatch.getAllContextElements().add(group__area____SubLoadArea);
		area__group____LoadGroups.setSrc(area);
		area__group____LoadGroups.setTrg(group);
		isApplicableMatch.getAllContextElements().add(area__group____LoadGroups);
		deliver__consumer____EnergyConsumer.setSrc(deliver);
		deliver__consumer____EnergyConsumer.setTrg(consumer);
		isApplicableMatch.getAllContextElements().add(deliver__consumer____EnergyConsumer);
		consumer__deliver____ServiceDeliveryPoints.setSrc(consumer);
		consumer__deliver____ServiceDeliveryPoints.setTrg(deliver);
		isApplicableMatch.getAllContextElements().add(consumer__deliver____ServiceDeliveryPoints);
		device__connect____AutoConnect.setSrc(device);
		device__connect____AutoConnect.setTrg(connect);
		isApplicableMatch.getAllContextElements().add(device__connect____AutoConnect);
		consumer__group____LoadGroup.setSrc(consumer);
		consumer__group____LoadGroup.setTrg(group);
		isApplicableMatch.getAllContextElements().add(consumer__group____LoadGroup);
		group__consumer____EnergyConsumers.setSrc(group);
		group__consumer____EnergyConsumers.setTrg(consumer);
		isApplicableMatch.getAllContextElements().add(group__consumer____EnergyConsumers);
		asset__deliver____ServiceDeliveryPoint.setSrc(asset);
		asset__deliver____ServiceDeliveryPoint.setTrg(deliver);
		isApplicableMatch.getAllContextElements().add(asset__deliver____ServiceDeliveryPoint);
		deliver__asset____EndDeviceAssets.setSrc(deliver);
		deliver__asset____EndDeviceAssets.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(deliver__asset____EndDeviceAssets);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(pair__asset____a);
		area__control____ControlArea.setSrc(area);
		area__control____ControlArea.setTrg(control);
		isApplicableMatch.getAllContextElements().add(area__control____ControlArea);
		control__area____EnergyArea.setSrc(control);
		control__area____EnergyArea.setTrg(area);
		isApplicableMatch.getAllContextElements().add(control__area____EnergyArea);
		device__electric____ElectricityValues.setSrc(device);
		device__electric____ElectricityValues.setTrg(electric);
		isApplicableMatch.getAllContextElements().add(device__electric____ElectricityValues);
		pair__device____b.setSrc(pair);
		pair__device____b.setTrg(device);
		isApplicableMatch.getAllContextElements().add(pair__device____b);
		group__area____SubLoadArea.setName(group__area____SubLoadArea_name_prime);
		area__group____LoadGroups.setName(area__group____LoadGroups_name_prime);
		deliver__consumer____EnergyConsumer.setName(deliver__consumer____EnergyConsumer_name_prime);
		consumer__deliver____ServiceDeliveryPoints.setName(consumer__deliver____ServiceDeliveryPoints_name_prime);
		device__connect____AutoConnect.setName(device__connect____AutoConnect_name_prime);
		consumer__group____LoadGroup.setName(consumer__group____LoadGroup_name_prime);
		group__consumer____EnergyConsumers.setName(group__consumer____EnergyConsumers_name_prime);
		asset__deliver____ServiceDeliveryPoint.setName(asset__deliver____ServiceDeliveryPoint_name_prime);
		deliver__asset____EndDeviceAssets.setName(deliver__asset____EndDeviceAssets_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		area__control____ControlArea.setName(area__control____ControlArea_name_prime);
		control__area____EnergyArea.setName(control__area____EnergyArea_name_prime);
		device__electric____ElectricityValues.setName(device__electric____ElectricityValues_name_prime);
		pair__device____b.setName(pair__device____b_name_prime);
		return new Object[] { area, electric, deliver, control, pair, asset, device, consumer, connect, group,
				isApplicableMatch, group__area____SubLoadArea, area__group____LoadGroups,
				deliver__consumer____EnergyConsumer, consumer__deliver____ServiceDeliveryPoints,
				device__connect____AutoConnect, consumer__group____LoadGroup, group__consumer____EnergyConsumers,
				asset__deliver____ServiceDeliveryPoint, deliver__asset____EndDeviceAssets, pair__asset____a,
				area__control____ControlArea, control__area____EnergyArea, device__electric____ElectricityValues,
				pair__device____b };
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_2_4_solveCSP_bindingFBBBBBBBBBBBB(
			EnergyConsumerWithIDConfLoad _this, IsApplicableMatch isApplicableMatch, SubLoadArea area,
			ElectricityValues electric, ServiceDeliveryPoint deliver, ControlArea control,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset, PhysicalDevice device, ConformLoad consumer,
			AutoConnectObject connect, ConformLoadGroup group) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, area, electric, deliver, control,
				pair, asset, device, consumer, connect, group);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, area, electric, deliver, control, pair, asset, device,
					consumer, connect, group };
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			EnergyConsumerWithIDConfLoad _this, IsApplicableMatch isApplicableMatch, SubLoadArea area,
			ElectricityValues electric, ServiceDeliveryPoint deliver, ControlArea control,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset, PhysicalDevice device, ConformLoad consumer,
			AutoConnectObject connect, ConformLoadGroup group) {
		Object[] result_pattern_EnergyConsumerWithIDConfLoad_2_4_solveCSP_binding = pattern_EnergyConsumerWithIDConfLoad_2_4_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, area, electric, deliver, control, pair, asset, device, consumer, connect,
				group);
		if (result_pattern_EnergyConsumerWithIDConfLoad_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnergyConsumerWithIDConfLoad_2_4_solveCSP_binding[0];

			Object[] result_pattern_EnergyConsumerWithIDConfLoad_2_4_solveCSP_black = pattern_EnergyConsumerWithIDConfLoad_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_EnergyConsumerWithIDConfLoad_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, area, electric, deliver, control, pair, asset,
						device, consumer, connect, group };
			}
		}
		return null;
	}

	public static final boolean pattern_EnergyConsumerWithIDConfLoad_2_5_checkCSP_expressionFBB(
			EnergyConsumerWithIDConfLoad _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EnergyConsumerWithIDConfLoad";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EnergyConsumerWithIDConfLoad_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_10_1_preparereturnvalue_bindingFB(
			EnergyConsumerWithIDConfLoad _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			EnergyConsumerWithIDConfLoad _this) {
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

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_10_1_preparereturnvalue_bindingAndBlackFFBF(
			EnergyConsumerWithIDConfLoad _this) {
		Object[] result_pattern_EnergyConsumerWithIDConfLoad_10_1_preparereturnvalue_binding = pattern_EnergyConsumerWithIDConfLoad_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_EnergyConsumerWithIDConfLoad_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_EnergyConsumerWithIDConfLoad_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_EnergyConsumerWithIDConfLoad_10_1_preparereturnvalue_black = pattern_EnergyConsumerWithIDConfLoad_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_EnergyConsumerWithIDConfLoad_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EnergyConsumerWithIDConfLoad_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_EnergyConsumerWithIDConfLoad_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EnergyConsumerWithIDConfLoad_10_2_testcorematchandDECs_blackFFFFFFFFFFB(
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
						ServiceDeliveryPoint deliver = asset.getServiceDeliveryPoint();
						if (deliver != null) {
							AutoConnectObject connect = device.getAutoConnect();
							if (connect != null) {
								ElectricityValues electric = device.getElectricityValues();
								if (electric != null) {
									gluemodel.CIM.IEC61970.Wires.EnergyConsumer tmpConsumer = deliver
											.getEnergyConsumer();
									if (tmpConsumer instanceof ConformLoad) {
										ConformLoad consumer = (ConformLoad) tmpConsumer;
										ConformLoadGroup group = consumer.getLoadGroup();
										if (group != null) {
											SubLoadArea area = group.getSubLoadArea();
											if (area != null) {
												ControlArea control = area.getControlArea();
												if (control != null) {
													_result.add(new Object[] { area, electric, deliver, control, pair,
															asset, device, consumer, connect, group, _edge_a });
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

		return _result;
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_10_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EnergyConsumerWithIDConfLoad_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBBBBBB(
			EnergyConsumerWithIDConfLoad _this, Match match, SubLoadArea area, ElectricityValues electric,
			ServiceDeliveryPoint deliver, ControlArea control, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			PhysicalDevice device, ConformLoad consumer, AutoConnectObject connect, ConformLoadGroup group) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, area, electric, deliver, control, pair, asset, device,
				consumer, connect, group);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EnergyConsumerWithIDConfLoad_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			EnergyConsumerWithIDConfLoad _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_EnergyConsumerWithIDConfLoad_10_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EnergyConsumerWithIDConfLoad_13_1_matchtggpattern_blackBBBBBBBBBB(
			SubLoadArea area, ElectricityValues electric, ServiceDeliveryPoint deliver, ControlArea control,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset, PhysicalDevice device, ConformLoad consumer,
			AutoConnectObject connect, ConformLoadGroup group) {
		if (area.equals(group.getSubLoadArea())) {
			if (consumer.equals(deliver.getEnergyConsumer())) {
				if (connect.equals(device.getAutoConnect())) {
					if (group.equals(consumer.getLoadGroup())) {
						if (deliver.equals(asset.getServiceDeliveryPoint())) {
							if (asset.equals(pair.getA())) {
								if (control.equals(area.getControlArea())) {
									if (electric.equals(device.getElectricityValues())) {
										if (device.equals(pair.getB())) {
											return new Object[] { area, electric, deliver, control, pair, asset, device,
													consumer, connect, group };
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

	public static final boolean pattern_EnergyConsumerWithIDConfLoad_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EnergyConsumerWithIDConfLoad_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EnergyConsumerWithIDConfLoadImpl
