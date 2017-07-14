/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules.impl;

import gluemodel.CIM.IEC61968.Metering.EndDeviceAsset;
import gluemodel.CIM.IEC61968.Metering.MeterAsset;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61970.ControlArea.ControlArea;

import gluemodel.CIM.IEC61970.LoadModel.ConformLoad;
import gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup;
import gluemodel.CIM.IEC61970.LoadModel.LoadArea;
import gluemodel.CIM.IEC61970.LoadModel.LoadGroup;
import gluemodel.CIM.IEC61970.LoadModel.SubLoadArea;

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

import rgse.ttc17.emoflon.tgg.task2.ControlAreaToControlSrea;
import rgse.ttc17.emoflon.tgg.task2.LoadAreaToLoadArea;

import rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea;
import rgse.ttc17.emoflon.tgg.task2.Rules.RulesPackage;
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
 * An implementation of the model object '<em><b>Load Area Link Control Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LoadAreaLinkControlAreaImpl extends AbstractRuleImpl implements LoadAreaLinkControlArea {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadAreaLinkControlAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getLoadAreaLinkControlArea();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ServiceDeliveryPoint srcDeliver, SubLoadArea srcArea,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, ConformLoad srcConsumer, ControlArea srcControl,
			ConformLoadGroup srcGroup, LoadArea srcLoadArea) {
		// initial bindings
		Object[] result1_black = LoadAreaLinkControlAreaImpl
				.pattern_LoadAreaLinkControlArea_0_1_initialbindings_blackBBBBBBBBBB(this, match, srcDeliver, srcArea,
						asset, pair, srcConsumer, srcControl, srcGroup, srcLoadArea);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[srcDeliver] = " + srcDeliver + ", "
					+ "[srcArea] = " + srcArea + ", " + "[asset] = " + asset + ", " + "[pair] = " + pair + ", "
					+ "[srcConsumer] = " + srcConsumer + ", " + "[srcControl] = " + srcControl + ", " + "[srcGroup] = "
					+ srcGroup + ", " + "[srcLoadArea] = " + srcLoadArea + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = LoadAreaLinkControlAreaImpl
				.pattern_LoadAreaLinkControlArea_0_2_SolveCSP_bindingAndBlackFBBBBBBBBBB(this, match, srcDeliver,
						srcArea, asset, pair, srcConsumer, srcControl, srcGroup, srcLoadArea);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[srcDeliver] = " + srcDeliver + ", " + "[srcArea] = "
					+ srcArea + ", " + "[asset] = " + asset + ", " + "[pair] = " + pair + ", " + "[srcConsumer] = "
					+ srcConsumer + ", " + "[srcControl] = " + srcControl + ", " + "[srcGroup] = " + srcGroup + ", "
					+ "[srcLoadArea] = " + srcLoadArea + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (LoadAreaLinkControlAreaImpl.pattern_LoadAreaLinkControlArea_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = LoadAreaLinkControlAreaImpl
					.pattern_LoadAreaLinkControlArea_0_4_collectelementstobetranslated_blackBBBBBBBBB(match, srcDeliver,
							srcArea, asset, pair, srcConsumer, srcControl, srcGroup, srcLoadArea);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[srcDeliver] = " + srcDeliver + ", "
						+ "[srcArea] = " + srcArea + ", " + "[asset] = " + asset + ", " + "[pair] = " + pair + ", "
						+ "[srcConsumer] = " + srcConsumer + ", " + "[srcControl] = " + srcControl + ", "
						+ "[srcGroup] = " + srcGroup + ", " + "[srcLoadArea] = " + srcLoadArea + ".");
			}
			LoadAreaLinkControlAreaImpl.pattern_LoadAreaLinkControlArea_0_4_collectelementstobetranslated_greenBBBFF(
					match, srcControl, srcLoadArea);
			// EMoflonEdge srcLoadArea__srcControl____ControlArea = (EMoflonEdge) result4_green[3];
			// EMoflonEdge srcControl__srcLoadArea____EnergyArea = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = LoadAreaLinkControlAreaImpl
					.pattern_LoadAreaLinkControlArea_0_5_collectcontextelements_blackBBBBBBBBB(match, srcDeliver,
							srcArea, asset, pair, srcConsumer, srcControl, srcGroup, srcLoadArea);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[srcDeliver] = " + srcDeliver + ", "
						+ "[srcArea] = " + srcArea + ", " + "[asset] = " + asset + ", " + "[pair] = " + pair + ", "
						+ "[srcConsumer] = " + srcConsumer + ", " + "[srcControl] = " + srcControl + ", "
						+ "[srcGroup] = " + srcGroup + ", " + "[srcLoadArea] = " + srcLoadArea + ".");
			}
			LoadAreaLinkControlAreaImpl
					.pattern_LoadAreaLinkControlArea_0_5_collectcontextelements_greenBBBBBBBBBFFFFFFFFFFF(match,
							srcDeliver, srcArea, asset, pair, srcConsumer, srcControl, srcGroup, srcLoadArea);
			// EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = (EMoflonEdge) result5_green[9];
			// EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = (EMoflonEdge) result5_green[10];
			// EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = (EMoflonEdge) result5_green[11];
			// EMoflonEdge srcDeliver__asset____EndDeviceAssets = (EMoflonEdge) result5_green[12];
			// EMoflonEdge pair__asset____a = (EMoflonEdge) result5_green[13];
			// EMoflonEdge srcArea__srcLoadArea____LoadArea = (EMoflonEdge) result5_green[14];
			// EMoflonEdge srcLoadArea__srcArea____SubLoadAreas = (EMoflonEdge) result5_green[15];
			// EMoflonEdge srcConsumer__srcGroup____LoadGroup = (EMoflonEdge) result5_green[16];
			// EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = (EMoflonEdge) result5_green[17];
			// EMoflonEdge srcGroup__srcArea____SubLoadArea = (EMoflonEdge) result5_green[18];
			// EMoflonEdge srcArea__srcGroup____LoadGroups = (EMoflonEdge) result5_green[19];

			// register objects to match
			LoadAreaLinkControlAreaImpl.pattern_LoadAreaLinkControlArea_0_6_registerobjectstomatch_expressionBBBBBBBBBB(
					this, match, srcDeliver, srcArea, asset, pair, srcConsumer, srcControl, srcGroup, srcLoadArea);
			return LoadAreaLinkControlAreaImpl.pattern_LoadAreaLinkControlArea_0_7_expressionF();
		} else {
			return LoadAreaLinkControlAreaImpl.pattern_LoadAreaLinkControlArea_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = LoadAreaLinkControlAreaImpl
				.pattern_LoadAreaLinkControlArea_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result1_bindingAndBlack[0];
		SubLoadArea srcArea = (SubLoadArea) result1_bindingAndBlack[1];
		LoadAreaToLoadArea laodToLoad = (LoadAreaToLoadArea) result1_bindingAndBlack[2];
		outagePreventionJointarget.ControlArea trgControl = (outagePreventionJointarget.ControlArea) result1_bindingAndBlack[3];
		outagePreventionJointarget.LoadArea trgLoadArea = (outagePreventionJointarget.LoadArea) result1_bindingAndBlack[4];
		MeterAsset asset = (MeterAsset) result1_bindingAndBlack[5];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result1_bindingAndBlack[6];
		ConformLoad srcConsumer = (ConformLoad) result1_bindingAndBlack[7];
		ControlArea srcControl = (ControlArea) result1_bindingAndBlack[8];
		ControlAreaToControlSrea controlToControl = (ControlAreaToControlSrea) result1_bindingAndBlack[9];
		ConformLoadGroup srcGroup = (ConformLoadGroup) result1_bindingAndBlack[10];
		LoadArea srcLoadArea = (LoadArea) result1_bindingAndBlack[11];
		// CSP csp = (CSP) result1_bindingAndBlack[12];
		LoadAreaLinkControlAreaImpl.pattern_LoadAreaLinkControlArea_1_1_performtransformation_greenBB(trgControl,
				trgLoadArea);

		// collect translated elements
		Object[] result2_green = LoadAreaLinkControlAreaImpl
				.pattern_LoadAreaLinkControlArea_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = LoadAreaLinkControlAreaImpl
				.pattern_LoadAreaLinkControlArea_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, srcDeliver,
						srcArea, laodToLoad, trgControl, trgLoadArea, asset, pair, srcConsumer, srcControl,
						controlToControl, srcGroup, srcLoadArea);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[srcDeliver] = " + srcDeliver + ", " + "[srcArea] = "
					+ srcArea + ", " + "[laodToLoad] = " + laodToLoad + ", " + "[trgControl] = " + trgControl + ", "
					+ "[trgLoadArea] = " + trgLoadArea + ", " + "[asset] = " + asset + ", " + "[pair] = " + pair + ", "
					+ "[srcConsumer] = " + srcConsumer + ", " + "[srcControl] = " + srcControl + ", "
					+ "[controlToControl] = " + controlToControl + ", " + "[srcGroup] = " + srcGroup + ", "
					+ "[srcLoadArea] = " + srcLoadArea + ".");
		}
		LoadAreaLinkControlAreaImpl.pattern_LoadAreaLinkControlArea_1_3_bookkeepingforedges_greenBBBBBFFF(ruleresult,
				trgControl, trgLoadArea, srcControl, srcLoadArea);
		// EMoflonEdge trgLoadArea__trgControl____ControlArea = (EMoflonEdge) result3_green[5];
		// EMoflonEdge srcLoadArea__srcControl____ControlArea = (EMoflonEdge) result3_green[6];
		// EMoflonEdge srcControl__srcLoadArea____EnergyArea = (EMoflonEdge) result3_green[7];

		// perform postprocessing story node is empty
		// register objects
		LoadAreaLinkControlAreaImpl.pattern_LoadAreaLinkControlArea_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this,
				ruleresult, srcDeliver, srcArea, laodToLoad, trgControl, trgLoadArea, asset, pair, srcConsumer,
				srcControl, controlToControl, srcGroup, srcLoadArea);
		return LoadAreaLinkControlAreaImpl.pattern_LoadAreaLinkControlArea_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = LoadAreaLinkControlAreaImpl
				.pattern_LoadAreaLinkControlArea_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LoadAreaLinkControlAreaImpl
				.pattern_LoadAreaLinkControlArea_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = LoadAreaLinkControlAreaImpl
				.pattern_LoadAreaLinkControlArea_2_2_corematch_bindingFFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result2_binding[0];
		SubLoadArea srcArea = (SubLoadArea) result2_binding[1];
		MeterAsset asset = (MeterAsset) result2_binding[2];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_binding[3];
		ConformLoad srcConsumer = (ConformLoad) result2_binding[4];
		ControlArea srcControl = (ControlArea) result2_binding[5];
		ConformLoadGroup srcGroup = (ConformLoadGroup) result2_binding[6];
		LoadArea srcLoadArea = (LoadArea) result2_binding[7];
		for (Object[] result2_black : LoadAreaLinkControlAreaImpl
				.pattern_LoadAreaLinkControlArea_2_2_corematch_blackBBFFFBBBBFBBB(srcDeliver, srcArea, asset, pair,
						srcConsumer, srcControl, srcGroup, srcLoadArea, match)) {
			LoadAreaToLoadArea laodToLoad = (LoadAreaToLoadArea) result2_black[2];
			outagePreventionJointarget.ControlArea trgControl = (outagePreventionJointarget.ControlArea) result2_black[3];
			outagePreventionJointarget.LoadArea trgLoadArea = (outagePreventionJointarget.LoadArea) result2_black[4];
			ControlAreaToControlSrea controlToControl = (ControlAreaToControlSrea) result2_black[9];
			// ForEach find context
			for (Object[] result3_black : LoadAreaLinkControlAreaImpl
					.pattern_LoadAreaLinkControlArea_2_3_findcontext_blackBBBBBBBBBBBB(srcDeliver, srcArea, laodToLoad,
							trgControl, trgLoadArea, asset, pair, srcConsumer, srcControl, controlToControl, srcGroup,
							srcLoadArea)) {
				Object[] result3_green = LoadAreaLinkControlAreaImpl
						.pattern_LoadAreaLinkControlArea_2_3_findcontext_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(srcDeliver,
								srcArea, laodToLoad, trgControl, trgLoadArea, asset, pair, srcConsumer, srcControl,
								controlToControl, srcGroup, srcLoadArea);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[12];
				// EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = (EMoflonEdge) result3_green[13];
				// EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = (EMoflonEdge) result3_green[14];
				// EMoflonEdge laodToLoad__trgLoadArea____target = (EMoflonEdge) result3_green[15];
				// EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = (EMoflonEdge) result3_green[16];
				// EMoflonEdge srcDeliver__asset____EndDeviceAssets = (EMoflonEdge) result3_green[17];
				// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[18];
				// EMoflonEdge srcArea__srcLoadArea____LoadArea = (EMoflonEdge) result3_green[19];
				// EMoflonEdge srcLoadArea__srcArea____SubLoadAreas = (EMoflonEdge) result3_green[20];
				// EMoflonEdge controlToControl__trgControl____target = (EMoflonEdge) result3_green[21];
				// EMoflonEdge srcConsumer__srcGroup____LoadGroup = (EMoflonEdge) result3_green[22];
				// EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = (EMoflonEdge) result3_green[23];
				// EMoflonEdge srcGroup__srcArea____SubLoadArea = (EMoflonEdge) result3_green[24];
				// EMoflonEdge srcArea__srcGroup____LoadGroups = (EMoflonEdge) result3_green[25];
				// EMoflonEdge laodToLoad__srcLoadArea____source = (EMoflonEdge) result3_green[26];
				// EMoflonEdge srcLoadArea__srcControl____ControlArea = (EMoflonEdge) result3_green[27];
				// EMoflonEdge srcControl__srcLoadArea____EnergyArea = (EMoflonEdge) result3_green[28];
				// EMoflonEdge controlToControl__srcControl____source = (EMoflonEdge) result3_green[29];

				// solve CSP
				Object[] result4_bindingAndBlack = LoadAreaLinkControlAreaImpl
						.pattern_LoadAreaLinkControlArea_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBB(this,
								isApplicableMatch, srcDeliver, srcArea, laodToLoad, trgControl, trgLoadArea, asset,
								pair, srcConsumer, srcControl, controlToControl, srcGroup, srcLoadArea);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[srcDeliver] = " + srcDeliver + ", " + "[srcArea] = " + srcArea + ", "
							+ "[laodToLoad] = " + laodToLoad + ", " + "[trgControl] = " + trgControl + ", "
							+ "[trgLoadArea] = " + trgLoadArea + ", " + "[asset] = " + asset + ", " + "[pair] = " + pair
							+ ", " + "[srcConsumer] = " + srcConsumer + ", " + "[srcControl] = " + srcControl + ", "
							+ "[controlToControl] = " + controlToControl + ", " + "[srcGroup] = " + srcGroup + ", "
							+ "[srcLoadArea] = " + srcLoadArea + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (LoadAreaLinkControlAreaImpl.pattern_LoadAreaLinkControlArea_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = LoadAreaLinkControlAreaImpl
							.pattern_LoadAreaLinkControlArea_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					LoadAreaLinkControlAreaImpl.pattern_LoadAreaLinkControlArea_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return LoadAreaLinkControlAreaImpl.pattern_LoadAreaLinkControlArea_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ServiceDeliveryPoint srcDeliver, SubLoadArea srcArea,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, ConformLoad srcConsumer, ControlArea srcControl,
			ConformLoadGroup srcGroup, LoadArea srcLoadArea) {
		match.registerObject("srcDeliver", srcDeliver);
		match.registerObject("srcArea", srcArea);
		match.registerObject("asset", asset);
		match.registerObject("pair", pair);
		match.registerObject("srcConsumer", srcConsumer);
		match.registerObject("srcControl", srcControl);
		match.registerObject("srcGroup", srcGroup);
		match.registerObject("srcLoadArea", srcLoadArea);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ServiceDeliveryPoint srcDeliver, SubLoadArea srcArea,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, ConformLoad srcConsumer, ControlArea srcControl,
			ConformLoadGroup srcGroup, LoadArea srcLoadArea) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ServiceDeliveryPoint srcDeliver,
			SubLoadArea srcArea, LoadAreaToLoadArea laodToLoad, outagePreventionJointarget.ControlArea trgControl,
			outagePreventionJointarget.LoadArea trgLoadArea, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			ConformLoad srcConsumer, ControlArea srcControl, ControlAreaToControlSrea controlToControl,
			ConformLoadGroup srcGroup, LoadArea srcLoadArea) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("srcDeliver", srcDeliver);
		isApplicableMatch.registerObject("srcArea", srcArea);
		isApplicableMatch.registerObject("laodToLoad", laodToLoad);
		isApplicableMatch.registerObject("trgControl", trgControl);
		isApplicableMatch.registerObject("trgLoadArea", trgLoadArea);
		isApplicableMatch.registerObject("asset", asset);
		isApplicableMatch.registerObject("pair", pair);
		isApplicableMatch.registerObject("srcConsumer", srcConsumer);
		isApplicableMatch.registerObject("srcControl", srcControl);
		isApplicableMatch.registerObject("controlToControl", controlToControl);
		isApplicableMatch.registerObject("srcGroup", srcGroup);
		isApplicableMatch.registerObject("srcLoadArea", srcLoadArea);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject srcDeliver, EObject srcArea,
			EObject laodToLoad, EObject trgControl, EObject trgLoadArea, EObject asset, EObject pair,
			EObject srcConsumer, EObject srcControl, EObject controlToControl, EObject srcGroup, EObject srcLoadArea) {
		ruleresult.registerObject("srcDeliver", srcDeliver);
		ruleresult.registerObject("srcArea", srcArea);
		ruleresult.registerObject("laodToLoad", laodToLoad);
		ruleresult.registerObject("trgControl", trgControl);
		ruleresult.registerObject("trgLoadArea", trgLoadArea);
		ruleresult.registerObject("asset", asset);
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("srcConsumer", srcConsumer);
		ruleresult.registerObject("srcControl", srcControl);
		ruleresult.registerObject("controlToControl", controlToControl);
		ruleresult.registerObject("srcGroup", srcGroup);
		ruleresult.registerObject("srcLoadArea", srcLoadArea);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_28(EMoflonEdge _edge_ControlArea) {
		// prepare return value
		Object[] result1_bindingAndBlack = LoadAreaLinkControlAreaImpl
				.pattern_LoadAreaLinkControlArea_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = LoadAreaLinkControlAreaImpl
				.pattern_LoadAreaLinkControlArea_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LoadAreaLinkControlAreaImpl
				.pattern_LoadAreaLinkControlArea_10_2_testcorematchandDECs_blackFFFFFFFFB(_edge_ControlArea)) {
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result2_black[0];
			SubLoadArea srcArea = (SubLoadArea) result2_black[1];
			MeterAsset asset = (MeterAsset) result2_black[2];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_black[3];
			ConformLoad srcConsumer = (ConformLoad) result2_black[4];
			ControlArea srcControl = (ControlArea) result2_black[5];
			ConformLoadGroup srcGroup = (ConformLoadGroup) result2_black[6];
			LoadArea srcLoadArea = (LoadArea) result2_black[7];
			Object[] result2_green = LoadAreaLinkControlAreaImpl
					.pattern_LoadAreaLinkControlArea_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LoadAreaLinkControlAreaImpl
					.pattern_LoadAreaLinkControlArea_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBBBB(
							this, match, srcDeliver, srcArea, asset, pair, srcConsumer, srcControl, srcGroup,
							srcLoadArea)) {
				// Ensure that the correct types of elements are matched
				if (LoadAreaLinkControlAreaImpl
						.pattern_LoadAreaLinkControlArea_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = LoadAreaLinkControlAreaImpl
							.pattern_LoadAreaLinkControlArea_10_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					LoadAreaLinkControlAreaImpl.pattern_LoadAreaLinkControlArea_10_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return LoadAreaLinkControlAreaImpl.pattern_LoadAreaLinkControlArea_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("LoadAreaLinkControlArea");
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
	public boolean checkDEC_FWD(ServiceDeliveryPoint srcDeliver, SubLoadArea srcArea, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair, ConformLoad srcConsumer, ControlArea srcControl,
			ConformLoadGroup srcGroup, LoadArea srcLoadArea) {// match tgg pattern
		Object[] result1_black = LoadAreaLinkControlAreaImpl
				.pattern_LoadAreaLinkControlArea_13_1_matchtggpattern_blackBBBBBBBB(srcDeliver, srcArea, asset, pair,
						srcConsumer, srcControl, srcGroup, srcLoadArea);
		if (result1_black != null) {
			return LoadAreaLinkControlAreaImpl.pattern_LoadAreaLinkControlArea_13_2_expressionF();
		} else {
			return LoadAreaLinkControlAreaImpl.pattern_LoadAreaLinkControlArea_13_3_expressionF();
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
		case RulesPackage.LOAD_AREA_LINK_CONTROL_AREA___IS_APPROPRIATE_FWD__MATCH_SERVICEDELIVERYPOINT_SUBLOADAREA_METERASSET_METERASSETPHYSICALDEVICEPAIR_CONFORMLOAD_CONTROLAREA_CONFORMLOADGROUP_LOADAREA:
			return isAppropriate_FWD((Match) arguments.get(0), (ServiceDeliveryPoint) arguments.get(1),
					(SubLoadArea) arguments.get(2), (MeterAsset) arguments.get(3),
					(MeterAssetPhysicalDevicePair) arguments.get(4), (ConformLoad) arguments.get(5),
					(ControlArea) arguments.get(6), (ConformLoadGroup) arguments.get(7), (LoadArea) arguments.get(8));
		case RulesPackage.LOAD_AREA_LINK_CONTROL_AREA___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LOAD_AREA_LINK_CONTROL_AREA___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.LOAD_AREA_LINK_CONTROL_AREA___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SERVICEDELIVERYPOINT_SUBLOADAREA_METERASSET_METERASSETPHYSICALDEVICEPAIR_CONFORMLOAD_CONTROLAREA_CONFORMLOADGROUP_LOADAREA:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ServiceDeliveryPoint) arguments.get(1),
					(SubLoadArea) arguments.get(2), (MeterAsset) arguments.get(3),
					(MeterAssetPhysicalDevicePair) arguments.get(4), (ConformLoad) arguments.get(5),
					(ControlArea) arguments.get(6), (ConformLoadGroup) arguments.get(7), (LoadArea) arguments.get(8));
			return null;
		case RulesPackage.LOAD_AREA_LINK_CONTROL_AREA___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SERVICEDELIVERYPOINT_SUBLOADAREA_METERASSET_METERASSETPHYSICALDEVICEPAIR_CONFORMLOAD_CONTROLAREA_CONFORMLOADGROUP_LOADAREA:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ServiceDeliveryPoint) arguments.get(1),
					(SubLoadArea) arguments.get(2), (MeterAsset) arguments.get(3),
					(MeterAssetPhysicalDevicePair) arguments.get(4), (ConformLoad) arguments.get(5),
					(ControlArea) arguments.get(6), (ConformLoadGroup) arguments.get(7), (LoadArea) arguments.get(8));
		case RulesPackage.LOAD_AREA_LINK_CONTROL_AREA___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LOAD_AREA_LINK_CONTROL_AREA___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SERVICEDELIVERYPOINT_SUBLOADAREA_LOADAREATOLOADAREA_CONTROLAREA_LOADAREA_METERASSET_METERASSETPHYSICALDEVICEPAIR_CONFORMLOAD_CONTROLAREA_CONTROLAREATOCONTROLSREA_CONFORMLOADGROUP_LOADAREA:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(ServiceDeliveryPoint) arguments.get(1), (SubLoadArea) arguments.get(2),
					(LoadAreaToLoadArea) arguments.get(3), (outagePreventionJointarget.ControlArea) arguments.get(4),
					(outagePreventionJointarget.LoadArea) arguments.get(5), (MeterAsset) arguments.get(6),
					(MeterAssetPhysicalDevicePair) arguments.get(7), (ConformLoad) arguments.get(8),
					(ControlArea) arguments.get(9), (ControlAreaToControlSrea) arguments.get(10),
					(ConformLoadGroup) arguments.get(11), (LoadArea) arguments.get(12));
		case RulesPackage.LOAD_AREA_LINK_CONTROL_AREA___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LOAD_AREA_LINK_CONTROL_AREA___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.LOAD_AREA_LINK_CONTROL_AREA___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.LOAD_AREA_LINK_CONTROL_AREA___IS_APPROPRIATE_FWD_EMOFLON_EDGE_28__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_28((EMoflonEdge) arguments.get(0));
		case RulesPackage.LOAD_AREA_LINK_CONTROL_AREA___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.LOAD_AREA_LINK_CONTROL_AREA___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.LOAD_AREA_LINK_CONTROL_AREA___CHECK_DEC_FWD__SERVICEDELIVERYPOINT_SUBLOADAREA_METERASSET_METERASSETPHYSICALDEVICEPAIR_CONFORMLOAD_CONTROLAREA_CONFORMLOADGROUP_LOADAREA:
			return checkDEC_FWD((ServiceDeliveryPoint) arguments.get(0), (SubLoadArea) arguments.get(1),
					(MeterAsset) arguments.get(2), (MeterAssetPhysicalDevicePair) arguments.get(3),
					(ConformLoad) arguments.get(4), (ControlArea) arguments.get(5), (ConformLoadGroup) arguments.get(6),
					(LoadArea) arguments.get(7));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_0_1_initialbindings_blackBBBBBBBBBB(
			LoadAreaLinkControlArea _this, Match match, ServiceDeliveryPoint srcDeliver, SubLoadArea srcArea,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, ConformLoad srcConsumer, ControlArea srcControl,
			ConformLoadGroup srcGroup, LoadArea srcLoadArea) {
		return new Object[] { _this, match, srcDeliver, srcArea, asset, pair, srcConsumer, srcControl, srcGroup,
				srcLoadArea };
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_0_2_SolveCSP_bindingFBBBBBBBBBB(
			LoadAreaLinkControlArea _this, Match match, ServiceDeliveryPoint srcDeliver, SubLoadArea srcArea,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, ConformLoad srcConsumer, ControlArea srcControl,
			ConformLoadGroup srcGroup, LoadArea srcLoadArea) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcDeliver, srcArea, asset, pair, srcConsumer,
				srcControl, srcGroup, srcLoadArea);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcDeliver, srcArea, asset, pair, srcConsumer, srcControl,
					srcGroup, srcLoadArea };
		}
		return null;
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_0_2_SolveCSP_bindingAndBlackFBBBBBBBBBB(
			LoadAreaLinkControlArea _this, Match match, ServiceDeliveryPoint srcDeliver, SubLoadArea srcArea,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, ConformLoad srcConsumer, ControlArea srcControl,
			ConformLoadGroup srcGroup, LoadArea srcLoadArea) {
		Object[] result_pattern_LoadAreaLinkControlArea_0_2_SolveCSP_binding = pattern_LoadAreaLinkControlArea_0_2_SolveCSP_bindingFBBBBBBBBBB(
				_this, match, srcDeliver, srcArea, asset, pair, srcConsumer, srcControl, srcGroup, srcLoadArea);
		if (result_pattern_LoadAreaLinkControlArea_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LoadAreaLinkControlArea_0_2_SolveCSP_binding[0];

			Object[] result_pattern_LoadAreaLinkControlArea_0_2_SolveCSP_black = pattern_LoadAreaLinkControlArea_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_LoadAreaLinkControlArea_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcDeliver, srcArea, asset, pair, srcConsumer, srcControl,
						srcGroup, srcLoadArea };
			}
		}
		return null;
	}

	public static final boolean pattern_LoadAreaLinkControlArea_0_3_CheckCSP_expressionFBB(
			LoadAreaLinkControlArea _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_0_4_collectelementstobetranslated_blackBBBBBBBBB(
			Match match, ServiceDeliveryPoint srcDeliver, SubLoadArea srcArea, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair, ConformLoad srcConsumer, ControlArea srcControl,
			ConformLoadGroup srcGroup, LoadArea srcLoadArea) {
		return new Object[] { match, srcDeliver, srcArea, asset, pair, srcConsumer, srcControl, srcGroup, srcLoadArea };
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, ControlArea srcControl, LoadArea srcLoadArea) {
		EMoflonEdge srcLoadArea__srcControl____ControlArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcControl__srcLoadArea____EnergyArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcLoadArea__srcControl____ControlArea_name_prime = "ControlArea";
		String srcControl__srcLoadArea____EnergyArea_name_prime = "EnergyArea";
		srcLoadArea__srcControl____ControlArea.setSrc(srcLoadArea);
		srcLoadArea__srcControl____ControlArea.setTrg(srcControl);
		match.getToBeTranslatedEdges().add(srcLoadArea__srcControl____ControlArea);
		srcControl__srcLoadArea____EnergyArea.setSrc(srcControl);
		srcControl__srcLoadArea____EnergyArea.setTrg(srcLoadArea);
		match.getToBeTranslatedEdges().add(srcControl__srcLoadArea____EnergyArea);
		srcLoadArea__srcControl____ControlArea.setName(srcLoadArea__srcControl____ControlArea_name_prime);
		srcControl__srcLoadArea____EnergyArea.setName(srcControl__srcLoadArea____EnergyArea_name_prime);
		return new Object[] { match, srcControl, srcLoadArea, srcLoadArea__srcControl____ControlArea,
				srcControl__srcLoadArea____EnergyArea };
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_0_5_collectcontextelements_blackBBBBBBBBB(Match match,
			ServiceDeliveryPoint srcDeliver, SubLoadArea srcArea, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			ConformLoad srcConsumer, ControlArea srcControl, ConformLoadGroup srcGroup, LoadArea srcLoadArea) {
		return new Object[] { match, srcDeliver, srcArea, asset, pair, srcConsumer, srcControl, srcGroup, srcLoadArea };
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_0_5_collectcontextelements_greenBBBBBBBBBFFFFFFFFFFF(
			Match match, ServiceDeliveryPoint srcDeliver, SubLoadArea srcArea, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair, ConformLoad srcConsumer, ControlArea srcControl,
			ConformLoadGroup srcGroup, LoadArea srcLoadArea) {
		EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcArea__srcLoadArea____LoadArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLoadArea__srcArea____SubLoadAreas = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcGroup____LoadGroup = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcGroup__srcArea____SubLoadArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcArea__srcGroup____LoadGroups = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(srcDeliver);
		match.getContextNodes().add(srcArea);
		match.getContextNodes().add(asset);
		match.getContextNodes().add(pair);
		match.getContextNodes().add(srcConsumer);
		match.getContextNodes().add(srcControl);
		match.getContextNodes().add(srcGroup);
		match.getContextNodes().add(srcLoadArea);
		String srcDeliver__srcConsumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime = "ServiceDeliveryPoints";
		String asset__srcDeliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String srcDeliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		String pair__asset____a_name_prime = "a";
		String srcArea__srcLoadArea____LoadArea_name_prime = "LoadArea";
		String srcLoadArea__srcArea____SubLoadAreas_name_prime = "SubLoadAreas";
		String srcConsumer__srcGroup____LoadGroup_name_prime = "LoadGroup";
		String srcGroup__srcConsumer____EnergyConsumers_name_prime = "EnergyConsumers";
		String srcGroup__srcArea____SubLoadArea_name_prime = "SubLoadArea";
		String srcArea__srcGroup____LoadGroups_name_prime = "LoadGroups";
		srcDeliver__srcConsumer____EnergyConsumer.setSrc(srcDeliver);
		srcDeliver__srcConsumer____EnergyConsumer.setTrg(srcConsumer);
		match.getContextEdges().add(srcDeliver__srcConsumer____EnergyConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setSrc(srcConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setTrg(srcDeliver);
		match.getContextEdges().add(srcConsumer__srcDeliver____ServiceDeliveryPoints);
		asset__srcDeliver____ServiceDeliveryPoint.setSrc(asset);
		asset__srcDeliver____ServiceDeliveryPoint.setTrg(srcDeliver);
		match.getContextEdges().add(asset__srcDeliver____ServiceDeliveryPoint);
		srcDeliver__asset____EndDeviceAssets.setSrc(srcDeliver);
		srcDeliver__asset____EndDeviceAssets.setTrg(asset);
		match.getContextEdges().add(srcDeliver__asset____EndDeviceAssets);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		match.getContextEdges().add(pair__asset____a);
		srcArea__srcLoadArea____LoadArea.setSrc(srcArea);
		srcArea__srcLoadArea____LoadArea.setTrg(srcLoadArea);
		match.getContextEdges().add(srcArea__srcLoadArea____LoadArea);
		srcLoadArea__srcArea____SubLoadAreas.setSrc(srcLoadArea);
		srcLoadArea__srcArea____SubLoadAreas.setTrg(srcArea);
		match.getContextEdges().add(srcLoadArea__srcArea____SubLoadAreas);
		srcConsumer__srcGroup____LoadGroup.setSrc(srcConsumer);
		srcConsumer__srcGroup____LoadGroup.setTrg(srcGroup);
		match.getContextEdges().add(srcConsumer__srcGroup____LoadGroup);
		srcGroup__srcConsumer____EnergyConsumers.setSrc(srcGroup);
		srcGroup__srcConsumer____EnergyConsumers.setTrg(srcConsumer);
		match.getContextEdges().add(srcGroup__srcConsumer____EnergyConsumers);
		srcGroup__srcArea____SubLoadArea.setSrc(srcGroup);
		srcGroup__srcArea____SubLoadArea.setTrg(srcArea);
		match.getContextEdges().add(srcGroup__srcArea____SubLoadArea);
		srcArea__srcGroup____LoadGroups.setSrc(srcArea);
		srcArea__srcGroup____LoadGroups.setTrg(srcGroup);
		match.getContextEdges().add(srcArea__srcGroup____LoadGroups);
		srcDeliver__srcConsumer____EnergyConsumer.setName(srcDeliver__srcConsumer____EnergyConsumer_name_prime);
		srcConsumer__srcDeliver____ServiceDeliveryPoints
				.setName(srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime);
		asset__srcDeliver____ServiceDeliveryPoint.setName(asset__srcDeliver____ServiceDeliveryPoint_name_prime);
		srcDeliver__asset____EndDeviceAssets.setName(srcDeliver__asset____EndDeviceAssets_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		srcArea__srcLoadArea____LoadArea.setName(srcArea__srcLoadArea____LoadArea_name_prime);
		srcLoadArea__srcArea____SubLoadAreas.setName(srcLoadArea__srcArea____SubLoadAreas_name_prime);
		srcConsumer__srcGroup____LoadGroup.setName(srcConsumer__srcGroup____LoadGroup_name_prime);
		srcGroup__srcConsumer____EnergyConsumers.setName(srcGroup__srcConsumer____EnergyConsumers_name_prime);
		srcGroup__srcArea____SubLoadArea.setName(srcGroup__srcArea____SubLoadArea_name_prime);
		srcArea__srcGroup____LoadGroups.setName(srcArea__srcGroup____LoadGroups_name_prime);
		return new Object[] { match, srcDeliver, srcArea, asset, pair, srcConsumer, srcControl, srcGroup, srcLoadArea,
				srcDeliver__srcConsumer____EnergyConsumer, srcConsumer__srcDeliver____ServiceDeliveryPoints,
				asset__srcDeliver____ServiceDeliveryPoint, srcDeliver__asset____EndDeviceAssets, pair__asset____a,
				srcArea__srcLoadArea____LoadArea, srcLoadArea__srcArea____SubLoadAreas,
				srcConsumer__srcGroup____LoadGroup, srcGroup__srcConsumer____EnergyConsumers,
				srcGroup__srcArea____SubLoadArea, srcArea__srcGroup____LoadGroups };
	}

	public static final void pattern_LoadAreaLinkControlArea_0_6_registerobjectstomatch_expressionBBBBBBBBBB(
			LoadAreaLinkControlArea _this, Match match, ServiceDeliveryPoint srcDeliver, SubLoadArea srcArea,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, ConformLoad srcConsumer, ControlArea srcControl,
			ConformLoadGroup srcGroup, LoadArea srcLoadArea) {
		_this.registerObjectsToMatch_FWD(match, srcDeliver, srcArea, asset, pair, srcConsumer, srcControl, srcGroup,
				srcLoadArea);

	}

	public static final boolean pattern_LoadAreaLinkControlArea_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LoadAreaLinkControlArea_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_1_1_performtransformation_bindingFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("srcDeliver");
		EObject _localVariable_1 = isApplicableMatch.getObject("srcArea");
		EObject _localVariable_2 = isApplicableMatch.getObject("laodToLoad");
		EObject _localVariable_3 = isApplicableMatch.getObject("trgControl");
		EObject _localVariable_4 = isApplicableMatch.getObject("trgLoadArea");
		EObject _localVariable_5 = isApplicableMatch.getObject("asset");
		EObject _localVariable_6 = isApplicableMatch.getObject("pair");
		EObject _localVariable_7 = isApplicableMatch.getObject("srcConsumer");
		EObject _localVariable_8 = isApplicableMatch.getObject("srcControl");
		EObject _localVariable_9 = isApplicableMatch.getObject("controlToControl");
		EObject _localVariable_10 = isApplicableMatch.getObject("srcGroup");
		EObject _localVariable_11 = isApplicableMatch.getObject("srcLoadArea");
		EObject tmpSrcDeliver = _localVariable_0;
		EObject tmpSrcArea = _localVariable_1;
		EObject tmpLaodToLoad = _localVariable_2;
		EObject tmpTrgControl = _localVariable_3;
		EObject tmpTrgLoadArea = _localVariable_4;
		EObject tmpAsset = _localVariable_5;
		EObject tmpPair = _localVariable_6;
		EObject tmpSrcConsumer = _localVariable_7;
		EObject tmpSrcControl = _localVariable_8;
		EObject tmpControlToControl = _localVariable_9;
		EObject tmpSrcGroup = _localVariable_10;
		EObject tmpSrcLoadArea = _localVariable_11;
		if (tmpSrcDeliver instanceof ServiceDeliveryPoint) {
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) tmpSrcDeliver;
			if (tmpSrcArea instanceof SubLoadArea) {
				SubLoadArea srcArea = (SubLoadArea) tmpSrcArea;
				if (tmpLaodToLoad instanceof LoadAreaToLoadArea) {
					LoadAreaToLoadArea laodToLoad = (LoadAreaToLoadArea) tmpLaodToLoad;
					if (tmpTrgControl instanceof outagePreventionJointarget.ControlArea) {
						outagePreventionJointarget.ControlArea trgControl = (outagePreventionJointarget.ControlArea) tmpTrgControl;
						if (tmpTrgLoadArea instanceof outagePreventionJointarget.LoadArea) {
							outagePreventionJointarget.LoadArea trgLoadArea = (outagePreventionJointarget.LoadArea) tmpTrgLoadArea;
							if (tmpAsset instanceof MeterAsset) {
								MeterAsset asset = (MeterAsset) tmpAsset;
								if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
									MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
									if (tmpSrcConsumer instanceof ConformLoad) {
										ConformLoad srcConsumer = (ConformLoad) tmpSrcConsumer;
										if (tmpSrcControl instanceof ControlArea) {
											ControlArea srcControl = (ControlArea) tmpSrcControl;
											if (tmpControlToControl instanceof ControlAreaToControlSrea) {
												ControlAreaToControlSrea controlToControl = (ControlAreaToControlSrea) tmpControlToControl;
												if (tmpSrcGroup instanceof ConformLoadGroup) {
													ConformLoadGroup srcGroup = (ConformLoadGroup) tmpSrcGroup;
													if (tmpSrcLoadArea instanceof LoadArea) {
														LoadArea srcLoadArea = (LoadArea) tmpSrcLoadArea;
														return new Object[] { srcDeliver, srcArea, laodToLoad,
																trgControl, trgLoadArea, asset, pair, srcConsumer,
																srcControl, controlToControl, srcGroup, srcLoadArea,
																isApplicableMatch };
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

	public static final Object[] pattern_LoadAreaLinkControlArea_1_1_performtransformation_blackBBBBBBBBBBBBFBB(
			ServiceDeliveryPoint srcDeliver, SubLoadArea srcArea, LoadAreaToLoadArea laodToLoad,
			outagePreventionJointarget.ControlArea trgControl, outagePreventionJointarget.LoadArea trgLoadArea,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, ConformLoad srcConsumer, ControlArea srcControl,
			ControlAreaToControlSrea controlToControl, ConformLoadGroup srcGroup, LoadArea srcLoadArea,
			LoadAreaLinkControlArea _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { srcDeliver, srcArea, laodToLoad, trgControl, trgLoadArea, asset, pair,
						srcConsumer, srcControl, controlToControl, srcGroup, srcLoadArea, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFFBB(
			LoadAreaLinkControlArea _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LoadAreaLinkControlArea_1_1_performtransformation_binding = pattern_LoadAreaLinkControlArea_1_1_performtransformation_bindingFFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LoadAreaLinkControlArea_1_1_performtransformation_binding != null) {
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result_pattern_LoadAreaLinkControlArea_1_1_performtransformation_binding[0];
			SubLoadArea srcArea = (SubLoadArea) result_pattern_LoadAreaLinkControlArea_1_1_performtransformation_binding[1];
			LoadAreaToLoadArea laodToLoad = (LoadAreaToLoadArea) result_pattern_LoadAreaLinkControlArea_1_1_performtransformation_binding[2];
			outagePreventionJointarget.ControlArea trgControl = (outagePreventionJointarget.ControlArea) result_pattern_LoadAreaLinkControlArea_1_1_performtransformation_binding[3];
			outagePreventionJointarget.LoadArea trgLoadArea = (outagePreventionJointarget.LoadArea) result_pattern_LoadAreaLinkControlArea_1_1_performtransformation_binding[4];
			MeterAsset asset = (MeterAsset) result_pattern_LoadAreaLinkControlArea_1_1_performtransformation_binding[5];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result_pattern_LoadAreaLinkControlArea_1_1_performtransformation_binding[6];
			ConformLoad srcConsumer = (ConformLoad) result_pattern_LoadAreaLinkControlArea_1_1_performtransformation_binding[7];
			ControlArea srcControl = (ControlArea) result_pattern_LoadAreaLinkControlArea_1_1_performtransformation_binding[8];
			ControlAreaToControlSrea controlToControl = (ControlAreaToControlSrea) result_pattern_LoadAreaLinkControlArea_1_1_performtransformation_binding[9];
			ConformLoadGroup srcGroup = (ConformLoadGroup) result_pattern_LoadAreaLinkControlArea_1_1_performtransformation_binding[10];
			LoadArea srcLoadArea = (LoadArea) result_pattern_LoadAreaLinkControlArea_1_1_performtransformation_binding[11];

			Object[] result_pattern_LoadAreaLinkControlArea_1_1_performtransformation_black = pattern_LoadAreaLinkControlArea_1_1_performtransformation_blackBBBBBBBBBBBBFBB(
					srcDeliver, srcArea, laodToLoad, trgControl, trgLoadArea, asset, pair, srcConsumer, srcControl,
					controlToControl, srcGroup, srcLoadArea, _this, isApplicableMatch);
			if (result_pattern_LoadAreaLinkControlArea_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_LoadAreaLinkControlArea_1_1_performtransformation_black[12];

				return new Object[] { srcDeliver, srcArea, laodToLoad, trgControl, trgLoadArea, asset, pair,
						srcConsumer, srcControl, controlToControl, srcGroup, srcLoadArea, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_1_1_performtransformation_greenBB(
			outagePreventionJointarget.ControlArea trgControl, outagePreventionJointarget.LoadArea trgLoadArea) {
		trgLoadArea.setControlArea(trgControl);
		return new Object[] { trgControl, trgLoadArea };
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject srcDeliver, EObject srcArea, EObject laodToLoad, EObject trgControl,
			EObject trgLoadArea, EObject asset, EObject pair, EObject srcConsumer, EObject srcControl,
			EObject controlToControl, EObject srcGroup, EObject srcLoadArea) {
		if (!srcDeliver.equals(trgControl)) {
			if (!srcDeliver.equals(trgLoadArea)) {
				if (!srcDeliver.equals(srcGroup)) {
					if (!srcDeliver.equals(srcLoadArea)) {
						if (!srcArea.equals(srcDeliver)) {
							if (!srcArea.equals(trgControl)) {
								if (!srcArea.equals(trgLoadArea)) {
									if (!srcArea.equals(srcConsumer)) {
										if (!srcArea.equals(srcControl)) {
											if (!srcArea.equals(srcGroup)) {
												if (!srcArea.equals(srcLoadArea)) {
													if (!laodToLoad.equals(srcDeliver)) {
														if (!laodToLoad.equals(srcArea)) {
															if (!laodToLoad.equals(trgControl)) {
																if (!laodToLoad.equals(trgLoadArea)) {
																	if (!laodToLoad.equals(pair)) {
																		if (!laodToLoad.equals(srcConsumer)) {
																			if (!laodToLoad.equals(srcControl)) {
																				if (!laodToLoad.equals(srcGroup)) {
																					if (!laodToLoad
																							.equals(srcLoadArea)) {
																						if (!trgControl
																								.equals(trgLoadArea)) {
																							if (!asset.equals(
																									srcDeliver)) {
																								if (!asset.equals(
																										srcArea)) {
																									if (!asset.equals(
																											laodToLoad)) {
																										if (!asset
																												.equals(trgControl)) {
																											if (!asset
																													.equals(trgLoadArea)) {
																												if (!asset
																														.equals(pair)) {
																													if (!asset
																															.equals(srcConsumer)) {
																														if (!asset
																																.equals(srcControl)) {
																															if (!asset
																																	.equals(controlToControl)) {
																																if (!asset
																																		.equals(srcGroup)) {
																																	if (!asset
																																			.equals(srcLoadArea)) {
																																		if (!pair
																																				.equals(srcDeliver)) {
																																			if (!pair
																																					.equals(srcArea)) {
																																				if (!pair
																																						.equals(trgControl)) {
																																					if (!pair
																																							.equals(trgLoadArea)) {
																																						if (!pair
																																								.equals(srcConsumer)) {
																																							if (!pair
																																									.equals(srcControl)) {
																																								if (!pair
																																										.equals(srcGroup)) {
																																									if (!pair
																																											.equals(srcLoadArea)) {
																																										if (!srcConsumer
																																												.equals(srcDeliver)) {
																																											if (!srcConsumer
																																													.equals(trgControl)) {
																																												if (!srcConsumer
																																														.equals(trgLoadArea)) {
																																													if (!srcConsumer
																																															.equals(srcControl)) {
																																														if (!srcConsumer
																																																.equals(srcGroup)) {
																																															if (!srcConsumer
																																																	.equals(srcLoadArea)) {
																																																if (!srcControl
																																																		.equals(srcDeliver)) {
																																																	if (!srcControl
																																																			.equals(trgControl)) {
																																																		if (!srcControl
																																																				.equals(trgLoadArea)) {
																																																			if (!srcControl
																																																					.equals(srcGroup)) {
																																																				if (!srcControl
																																																						.equals(srcLoadArea)) {
																																																					if (!controlToControl
																																																							.equals(srcDeliver)) {
																																																						if (!controlToControl
																																																								.equals(srcArea)) {
																																																							if (!controlToControl
																																																									.equals(laodToLoad)) {
																																																								if (!controlToControl
																																																										.equals(trgControl)) {
																																																									if (!controlToControl
																																																											.equals(trgLoadArea)) {
																																																										if (!controlToControl
																																																												.equals(pair)) {
																																																											if (!controlToControl
																																																													.equals(srcConsumer)) {
																																																												if (!controlToControl
																																																														.equals(srcControl)) {
																																																													if (!controlToControl
																																																															.equals(srcGroup)) {
																																																														if (!controlToControl
																																																																.equals(srcLoadArea)) {
																																																															if (!srcGroup
																																																																	.equals(trgControl)) {
																																																																if (!srcGroup
																																																																		.equals(trgLoadArea)) {
																																																																	if (!srcGroup
																																																																			.equals(srcLoadArea)) {
																																																																		if (!srcLoadArea
																																																																				.equals(trgControl)) {
																																																																			if (!srcLoadArea
																																																																					.equals(trgLoadArea)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						srcDeliver,
																																																																						srcArea,
																																																																						laodToLoad,
																																																																						trgControl,
																																																																						trgLoadArea,
																																																																						asset,
																																																																						pair,
																																																																						srcConsumer,
																																																																						srcControl,
																																																																						controlToControl,
																																																																						srcGroup,
																																																																						srcLoadArea };
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

	public static final Object[] pattern_LoadAreaLinkControlArea_1_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject trgControl, EObject trgLoadArea, EObject srcControl,
			EObject srcLoadArea) {
		EMoflonEdge trgLoadArea__trgControl____ControlArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLoadArea__srcControl____ControlArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcControl__srcLoadArea____EnergyArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LoadAreaLinkControlArea";
		String trgLoadArea__trgControl____ControlArea_name_prime = "ControlArea";
		String srcLoadArea__srcControl____ControlArea_name_prime = "ControlArea";
		String srcControl__srcLoadArea____EnergyArea_name_prime = "EnergyArea";
		trgLoadArea__trgControl____ControlArea.setSrc(trgLoadArea);
		trgLoadArea__trgControl____ControlArea.setTrg(trgControl);
		ruleresult.getCreatedEdges().add(trgLoadArea__trgControl____ControlArea);
		srcLoadArea__srcControl____ControlArea.setSrc(srcLoadArea);
		srcLoadArea__srcControl____ControlArea.setTrg(srcControl);
		ruleresult.getTranslatedEdges().add(srcLoadArea__srcControl____ControlArea);
		srcControl__srcLoadArea____EnergyArea.setSrc(srcControl);
		srcControl__srcLoadArea____EnergyArea.setTrg(srcLoadArea);
		ruleresult.getTranslatedEdges().add(srcControl__srcLoadArea____EnergyArea);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		trgLoadArea__trgControl____ControlArea.setName(trgLoadArea__trgControl____ControlArea_name_prime);
		srcLoadArea__srcControl____ControlArea.setName(srcLoadArea__srcControl____ControlArea_name_prime);
		srcControl__srcLoadArea____EnergyArea.setName(srcControl__srcLoadArea____EnergyArea_name_prime);
		return new Object[] { ruleresult, trgControl, trgLoadArea, srcControl, srcLoadArea,
				trgLoadArea__trgControl____ControlArea, srcLoadArea__srcControl____ControlArea,
				srcControl__srcLoadArea____EnergyArea };
	}

	public static final void pattern_LoadAreaLinkControlArea_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			LoadAreaLinkControlArea _this, PerformRuleResult ruleresult, EObject srcDeliver, EObject srcArea,
			EObject laodToLoad, EObject trgControl, EObject trgLoadArea, EObject asset, EObject pair,
			EObject srcConsumer, EObject srcControl, EObject controlToControl, EObject srcGroup, EObject srcLoadArea) {
		_this.registerObjects_FWD(ruleresult, srcDeliver, srcArea, laodToLoad, trgControl, trgLoadArea, asset, pair,
				srcConsumer, srcControl, controlToControl, srcGroup, srcLoadArea);

	}

	public static final PerformRuleResult pattern_LoadAreaLinkControlArea_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_2_1_preparereturnvalue_bindingFB(
			LoadAreaLinkControlArea _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_2_1_preparereturnvalue_blackFBB(EClass eClass,
			LoadAreaLinkControlArea _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_2_1_preparereturnvalue_bindingAndBlackFFB(
			LoadAreaLinkControlArea _this) {
		Object[] result_pattern_LoadAreaLinkControlArea_2_1_preparereturnvalue_binding = pattern_LoadAreaLinkControlArea_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LoadAreaLinkControlArea_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_LoadAreaLinkControlArea_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LoadAreaLinkControlArea_2_1_preparereturnvalue_black = pattern_LoadAreaLinkControlArea_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_LoadAreaLinkControlArea_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LoadAreaLinkControlArea_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "LoadAreaLinkControlArea";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_2_2_corematch_bindingFFFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("srcDeliver");
		EObject _localVariable_1 = match.getObject("srcArea");
		EObject _localVariable_2 = match.getObject("asset");
		EObject _localVariable_3 = match.getObject("pair");
		EObject _localVariable_4 = match.getObject("srcConsumer");
		EObject _localVariable_5 = match.getObject("srcControl");
		EObject _localVariable_6 = match.getObject("srcGroup");
		EObject _localVariable_7 = match.getObject("srcLoadArea");
		EObject tmpSrcDeliver = _localVariable_0;
		EObject tmpSrcArea = _localVariable_1;
		EObject tmpAsset = _localVariable_2;
		EObject tmpPair = _localVariable_3;
		EObject tmpSrcConsumer = _localVariable_4;
		EObject tmpSrcControl = _localVariable_5;
		EObject tmpSrcGroup = _localVariable_6;
		EObject tmpSrcLoadArea = _localVariable_7;
		if (tmpSrcDeliver instanceof ServiceDeliveryPoint) {
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) tmpSrcDeliver;
			if (tmpSrcArea instanceof SubLoadArea) {
				SubLoadArea srcArea = (SubLoadArea) tmpSrcArea;
				if (tmpAsset instanceof MeterAsset) {
					MeterAsset asset = (MeterAsset) tmpAsset;
					if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
						MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
						if (tmpSrcConsumer instanceof ConformLoad) {
							ConformLoad srcConsumer = (ConformLoad) tmpSrcConsumer;
							if (tmpSrcControl instanceof ControlArea) {
								ControlArea srcControl = (ControlArea) tmpSrcControl;
								if (tmpSrcGroup instanceof ConformLoadGroup) {
									ConformLoadGroup srcGroup = (ConformLoadGroup) tmpSrcGroup;
									if (tmpSrcLoadArea instanceof LoadArea) {
										LoadArea srcLoadArea = (LoadArea) tmpSrcLoadArea;
										return new Object[] { srcDeliver, srcArea, asset, pair, srcConsumer, srcControl,
												srcGroup, srcLoadArea, match };
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

	public static final Iterable<Object[]> pattern_LoadAreaLinkControlArea_2_2_corematch_blackBBFFFBBBBFBBB(
			ServiceDeliveryPoint srcDeliver, SubLoadArea srcArea, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			ConformLoad srcConsumer, ControlArea srcControl, ConformLoadGroup srcGroup, LoadArea srcLoadArea,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (LoadAreaToLoadArea laodToLoad : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcLoadArea, LoadAreaToLoadArea.class, "source")) {
			outagePreventionJointarget.LoadArea trgLoadArea = laodToLoad.getTarget();
			if (trgLoadArea != null) {
				for (ControlAreaToControlSrea controlToControl : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(srcControl, ControlAreaToControlSrea.class, "source")) {
					outagePreventionJointarget.ControlArea trgControl = controlToControl.getTarget();
					if (trgControl != null) {
						_result.add(new Object[] { srcDeliver, srcArea, laodToLoad, trgControl, trgLoadArea, asset,
								pair, srcConsumer, srcControl, controlToControl, srcGroup, srcLoadArea, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_LoadAreaLinkControlArea_2_3_findcontext_blackBBBBBBBBBBBB(
			ServiceDeliveryPoint srcDeliver, SubLoadArea srcArea, LoadAreaToLoadArea laodToLoad,
			outagePreventionJointarget.ControlArea trgControl, outagePreventionJointarget.LoadArea trgLoadArea,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, ConformLoad srcConsumer, ControlArea srcControl,
			ControlAreaToControlSrea controlToControl, ConformLoadGroup srcGroup, LoadArea srcLoadArea) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (srcConsumer.equals(srcDeliver.getEnergyConsumer())) {
			if (trgLoadArea.equals(laodToLoad.getTarget())) {
				if (srcDeliver.equals(asset.getServiceDeliveryPoint())) {
					if (asset.equals(pair.getA())) {
						if (srcLoadArea.equals(srcArea.getLoadArea())) {
							if (trgControl.equals(controlToControl.getTarget())) {
								if (srcGroup.equals(srcConsumer.getLoadGroup())) {
									if (srcArea.equals(srcGroup.getSubLoadArea())) {
										if (srcLoadArea.equals(laodToLoad.getSource())) {
											if (srcControl.equals(srcLoadArea.getControlArea())) {
												if (srcControl.equals(controlToControl.getSource())) {
													_result.add(new Object[] { srcDeliver, srcArea, laodToLoad,
															trgControl, trgLoadArea, asset, pair, srcConsumer,
															srcControl, controlToControl, srcGroup, srcLoadArea });
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

	public static final Object[] pattern_LoadAreaLinkControlArea_2_3_findcontext_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
			ServiceDeliveryPoint srcDeliver, SubLoadArea srcArea, LoadAreaToLoadArea laodToLoad,
			outagePreventionJointarget.ControlArea trgControl, outagePreventionJointarget.LoadArea trgLoadArea,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, ConformLoad srcConsumer, ControlArea srcControl,
			ControlAreaToControlSrea controlToControl, ConformLoadGroup srcGroup, LoadArea srcLoadArea) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge laodToLoad__trgLoadArea____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcArea__srcLoadArea____LoadArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLoadArea__srcArea____SubLoadAreas = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge controlToControl__trgControl____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcGroup____LoadGroup = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcGroup__srcArea____SubLoadArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcArea__srcGroup____LoadGroups = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge laodToLoad__srcLoadArea____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLoadArea__srcControl____ControlArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcControl__srcLoadArea____EnergyArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge controlToControl__srcControl____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcDeliver__srcConsumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime = "ServiceDeliveryPoints";
		String laodToLoad__trgLoadArea____target_name_prime = "target";
		String asset__srcDeliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String srcDeliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		String pair__asset____a_name_prime = "a";
		String srcArea__srcLoadArea____LoadArea_name_prime = "LoadArea";
		String srcLoadArea__srcArea____SubLoadAreas_name_prime = "SubLoadAreas";
		String controlToControl__trgControl____target_name_prime = "target";
		String srcConsumer__srcGroup____LoadGroup_name_prime = "LoadGroup";
		String srcGroup__srcConsumer____EnergyConsumers_name_prime = "EnergyConsumers";
		String srcGroup__srcArea____SubLoadArea_name_prime = "SubLoadArea";
		String srcArea__srcGroup____LoadGroups_name_prime = "LoadGroups";
		String laodToLoad__srcLoadArea____source_name_prime = "source";
		String srcLoadArea__srcControl____ControlArea_name_prime = "ControlArea";
		String srcControl__srcLoadArea____EnergyArea_name_prime = "EnergyArea";
		String controlToControl__srcControl____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(srcDeliver);
		isApplicableMatch.getAllContextElements().add(srcArea);
		isApplicableMatch.getAllContextElements().add(laodToLoad);
		isApplicableMatch.getAllContextElements().add(trgControl);
		isApplicableMatch.getAllContextElements().add(trgLoadArea);
		isApplicableMatch.getAllContextElements().add(asset);
		isApplicableMatch.getAllContextElements().add(pair);
		isApplicableMatch.getAllContextElements().add(srcConsumer);
		isApplicableMatch.getAllContextElements().add(srcControl);
		isApplicableMatch.getAllContextElements().add(controlToControl);
		isApplicableMatch.getAllContextElements().add(srcGroup);
		isApplicableMatch.getAllContextElements().add(srcLoadArea);
		srcDeliver__srcConsumer____EnergyConsumer.setSrc(srcDeliver);
		srcDeliver__srcConsumer____EnergyConsumer.setTrg(srcConsumer);
		isApplicableMatch.getAllContextElements().add(srcDeliver__srcConsumer____EnergyConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setSrc(srcConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setTrg(srcDeliver);
		isApplicableMatch.getAllContextElements().add(srcConsumer__srcDeliver____ServiceDeliveryPoints);
		laodToLoad__trgLoadArea____target.setSrc(laodToLoad);
		laodToLoad__trgLoadArea____target.setTrg(trgLoadArea);
		isApplicableMatch.getAllContextElements().add(laodToLoad__trgLoadArea____target);
		asset__srcDeliver____ServiceDeliveryPoint.setSrc(asset);
		asset__srcDeliver____ServiceDeliveryPoint.setTrg(srcDeliver);
		isApplicableMatch.getAllContextElements().add(asset__srcDeliver____ServiceDeliveryPoint);
		srcDeliver__asset____EndDeviceAssets.setSrc(srcDeliver);
		srcDeliver__asset____EndDeviceAssets.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(srcDeliver__asset____EndDeviceAssets);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(pair__asset____a);
		srcArea__srcLoadArea____LoadArea.setSrc(srcArea);
		srcArea__srcLoadArea____LoadArea.setTrg(srcLoadArea);
		isApplicableMatch.getAllContextElements().add(srcArea__srcLoadArea____LoadArea);
		srcLoadArea__srcArea____SubLoadAreas.setSrc(srcLoadArea);
		srcLoadArea__srcArea____SubLoadAreas.setTrg(srcArea);
		isApplicableMatch.getAllContextElements().add(srcLoadArea__srcArea____SubLoadAreas);
		controlToControl__trgControl____target.setSrc(controlToControl);
		controlToControl__trgControl____target.setTrg(trgControl);
		isApplicableMatch.getAllContextElements().add(controlToControl__trgControl____target);
		srcConsumer__srcGroup____LoadGroup.setSrc(srcConsumer);
		srcConsumer__srcGroup____LoadGroup.setTrg(srcGroup);
		isApplicableMatch.getAllContextElements().add(srcConsumer__srcGroup____LoadGroup);
		srcGroup__srcConsumer____EnergyConsumers.setSrc(srcGroup);
		srcGroup__srcConsumer____EnergyConsumers.setTrg(srcConsumer);
		isApplicableMatch.getAllContextElements().add(srcGroup__srcConsumer____EnergyConsumers);
		srcGroup__srcArea____SubLoadArea.setSrc(srcGroup);
		srcGroup__srcArea____SubLoadArea.setTrg(srcArea);
		isApplicableMatch.getAllContextElements().add(srcGroup__srcArea____SubLoadArea);
		srcArea__srcGroup____LoadGroups.setSrc(srcArea);
		srcArea__srcGroup____LoadGroups.setTrg(srcGroup);
		isApplicableMatch.getAllContextElements().add(srcArea__srcGroup____LoadGroups);
		laodToLoad__srcLoadArea____source.setSrc(laodToLoad);
		laodToLoad__srcLoadArea____source.setTrg(srcLoadArea);
		isApplicableMatch.getAllContextElements().add(laodToLoad__srcLoadArea____source);
		srcLoadArea__srcControl____ControlArea.setSrc(srcLoadArea);
		srcLoadArea__srcControl____ControlArea.setTrg(srcControl);
		isApplicableMatch.getAllContextElements().add(srcLoadArea__srcControl____ControlArea);
		srcControl__srcLoadArea____EnergyArea.setSrc(srcControl);
		srcControl__srcLoadArea____EnergyArea.setTrg(srcLoadArea);
		isApplicableMatch.getAllContextElements().add(srcControl__srcLoadArea____EnergyArea);
		controlToControl__srcControl____source.setSrc(controlToControl);
		controlToControl__srcControl____source.setTrg(srcControl);
		isApplicableMatch.getAllContextElements().add(controlToControl__srcControl____source);
		srcDeliver__srcConsumer____EnergyConsumer.setName(srcDeliver__srcConsumer____EnergyConsumer_name_prime);
		srcConsumer__srcDeliver____ServiceDeliveryPoints
				.setName(srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime);
		laodToLoad__trgLoadArea____target.setName(laodToLoad__trgLoadArea____target_name_prime);
		asset__srcDeliver____ServiceDeliveryPoint.setName(asset__srcDeliver____ServiceDeliveryPoint_name_prime);
		srcDeliver__asset____EndDeviceAssets.setName(srcDeliver__asset____EndDeviceAssets_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		srcArea__srcLoadArea____LoadArea.setName(srcArea__srcLoadArea____LoadArea_name_prime);
		srcLoadArea__srcArea____SubLoadAreas.setName(srcLoadArea__srcArea____SubLoadAreas_name_prime);
		controlToControl__trgControl____target.setName(controlToControl__trgControl____target_name_prime);
		srcConsumer__srcGroup____LoadGroup.setName(srcConsumer__srcGroup____LoadGroup_name_prime);
		srcGroup__srcConsumer____EnergyConsumers.setName(srcGroup__srcConsumer____EnergyConsumers_name_prime);
		srcGroup__srcArea____SubLoadArea.setName(srcGroup__srcArea____SubLoadArea_name_prime);
		srcArea__srcGroup____LoadGroups.setName(srcArea__srcGroup____LoadGroups_name_prime);
		laodToLoad__srcLoadArea____source.setName(laodToLoad__srcLoadArea____source_name_prime);
		srcLoadArea__srcControl____ControlArea.setName(srcLoadArea__srcControl____ControlArea_name_prime);
		srcControl__srcLoadArea____EnergyArea.setName(srcControl__srcLoadArea____EnergyArea_name_prime);
		controlToControl__srcControl____source.setName(controlToControl__srcControl____source_name_prime);
		return new Object[] { srcDeliver, srcArea, laodToLoad, trgControl, trgLoadArea, asset, pair, srcConsumer,
				srcControl, controlToControl, srcGroup, srcLoadArea, isApplicableMatch,
				srcDeliver__srcConsumer____EnergyConsumer, srcConsumer__srcDeliver____ServiceDeliveryPoints,
				laodToLoad__trgLoadArea____target, asset__srcDeliver____ServiceDeliveryPoint,
				srcDeliver__asset____EndDeviceAssets, pair__asset____a, srcArea__srcLoadArea____LoadArea,
				srcLoadArea__srcArea____SubLoadAreas, controlToControl__trgControl____target,
				srcConsumer__srcGroup____LoadGroup, srcGroup__srcConsumer____EnergyConsumers,
				srcGroup__srcArea____SubLoadArea, srcArea__srcGroup____LoadGroups, laodToLoad__srcLoadArea____source,
				srcLoadArea__srcControl____ControlArea, srcControl__srcLoadArea____EnergyArea,
				controlToControl__srcControl____source };
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_2_4_solveCSP_bindingFBBBBBBBBBBBBBB(
			LoadAreaLinkControlArea _this, IsApplicableMatch isApplicableMatch, ServiceDeliveryPoint srcDeliver,
			SubLoadArea srcArea, LoadAreaToLoadArea laodToLoad, outagePreventionJointarget.ControlArea trgControl,
			outagePreventionJointarget.LoadArea trgLoadArea, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			ConformLoad srcConsumer, ControlArea srcControl, ControlAreaToControlSrea controlToControl,
			ConformLoadGroup srcGroup, LoadArea srcLoadArea) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, srcDeliver, srcArea, laodToLoad,
				trgControl, trgLoadArea, asset, pair, srcConsumer, srcControl, controlToControl, srcGroup, srcLoadArea);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, srcDeliver, srcArea, laodToLoad, trgControl,
					trgLoadArea, asset, pair, srcConsumer, srcControl, controlToControl, srcGroup, srcLoadArea };
		}
		return null;
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBB(
			LoadAreaLinkControlArea _this, IsApplicableMatch isApplicableMatch, ServiceDeliveryPoint srcDeliver,
			SubLoadArea srcArea, LoadAreaToLoadArea laodToLoad, outagePreventionJointarget.ControlArea trgControl,
			outagePreventionJointarget.LoadArea trgLoadArea, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			ConformLoad srcConsumer, ControlArea srcControl, ControlAreaToControlSrea controlToControl,
			ConformLoadGroup srcGroup, LoadArea srcLoadArea) {
		Object[] result_pattern_LoadAreaLinkControlArea_2_4_solveCSP_binding = pattern_LoadAreaLinkControlArea_2_4_solveCSP_bindingFBBBBBBBBBBBBBB(
				_this, isApplicableMatch, srcDeliver, srcArea, laodToLoad, trgControl, trgLoadArea, asset, pair,
				srcConsumer, srcControl, controlToControl, srcGroup, srcLoadArea);
		if (result_pattern_LoadAreaLinkControlArea_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LoadAreaLinkControlArea_2_4_solveCSP_binding[0];

			Object[] result_pattern_LoadAreaLinkControlArea_2_4_solveCSP_black = pattern_LoadAreaLinkControlArea_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_LoadAreaLinkControlArea_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, srcDeliver, srcArea, laodToLoad, trgControl,
						trgLoadArea, asset, pair, srcConsumer, srcControl, controlToControl, srcGroup, srcLoadArea };
			}
		}
		return null;
	}

	public static final boolean pattern_LoadAreaLinkControlArea_2_5_checkCSP_expressionFBB(
			LoadAreaLinkControlArea _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LoadAreaLinkControlArea";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LoadAreaLinkControlArea_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_10_1_preparereturnvalue_bindingFB(
			LoadAreaLinkControlArea _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			LoadAreaLinkControlArea _this) {
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

	public static final Object[] pattern_LoadAreaLinkControlArea_10_1_preparereturnvalue_bindingAndBlackFFBF(
			LoadAreaLinkControlArea _this) {
		Object[] result_pattern_LoadAreaLinkControlArea_10_1_preparereturnvalue_binding = pattern_LoadAreaLinkControlArea_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LoadAreaLinkControlArea_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_LoadAreaLinkControlArea_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LoadAreaLinkControlArea_10_1_preparereturnvalue_black = pattern_LoadAreaLinkControlArea_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_LoadAreaLinkControlArea_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LoadAreaLinkControlArea_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_LoadAreaLinkControlArea_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_LoadAreaLinkControlArea_10_2_testcorematchandDECs_blackFFFFFFFFB(
			EMoflonEdge _edge_ControlArea) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcLoadArea = _edge_ControlArea.getSrc();
		if (tmpSrcLoadArea instanceof LoadArea) {
			LoadArea srcLoadArea = (LoadArea) tmpSrcLoadArea;
			EObject tmpSrcControl = _edge_ControlArea.getTrg();
			if (tmpSrcControl instanceof ControlArea) {
				ControlArea srcControl = (ControlArea) tmpSrcControl;
				if (srcControl.equals(srcLoadArea.getControlArea())) {
					for (SubLoadArea srcArea : srcLoadArea.getSubLoadAreas()) {
						for (LoadGroup tmpSrcGroup : srcArea.getLoadGroups()) {
							if (tmpSrcGroup instanceof ConformLoadGroup) {
								ConformLoadGroup srcGroup = (ConformLoadGroup) tmpSrcGroup;
								for (ConformLoad srcConsumer : srcGroup.getEnergyConsumers()) {
									for (ServiceDeliveryPoint srcDeliver : srcConsumer.getServiceDeliveryPoints()) {
										for (EndDeviceAsset tmpAsset : srcDeliver.getEndDeviceAssets()) {
											if (tmpAsset instanceof MeterAsset) {
												MeterAsset asset = (MeterAsset) tmpAsset;
												for (MeterAssetPhysicalDevicePair pair : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(asset,
																MeterAssetPhysicalDevicePair.class, "a")) {
													_result.add(new Object[] { srcDeliver, srcArea, asset, pair,
															srcConsumer, srcControl, srcGroup, srcLoadArea,
															_edge_ControlArea });
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

	public static final Object[] pattern_LoadAreaLinkControlArea_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LoadAreaLinkControlArea_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBBBB(
			LoadAreaLinkControlArea _this, Match match, ServiceDeliveryPoint srcDeliver, SubLoadArea srcArea,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, ConformLoad srcConsumer, ControlArea srcControl,
			ConformLoadGroup srcGroup, LoadArea srcLoadArea) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcDeliver, srcArea, asset, pair, srcConsumer,
				srcControl, srcGroup, srcLoadArea);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LoadAreaLinkControlArea_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			LoadAreaLinkControlArea _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_LoadAreaLinkControlArea_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LoadAreaLinkControlArea_13_1_matchtggpattern_blackBBBBBBBB(
			ServiceDeliveryPoint srcDeliver, SubLoadArea srcArea, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			ConformLoad srcConsumer, ControlArea srcControl, ConformLoadGroup srcGroup, LoadArea srcLoadArea) {
		if (srcConsumer.equals(srcDeliver.getEnergyConsumer())) {
			if (srcDeliver.equals(asset.getServiceDeliveryPoint())) {
				if (asset.equals(pair.getA())) {
					if (srcLoadArea.equals(srcArea.getLoadArea())) {
						if (srcGroup.equals(srcConsumer.getLoadGroup())) {
							if (srcArea.equals(srcGroup.getSubLoadArea())) {
								if (srcControl.equals(srcLoadArea.getControlArea())) {
									return new Object[] { srcDeliver, srcArea, asset, pair, srcConsumer, srcControl,
											srcGroup, srcLoadArea };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_LoadAreaLinkControlArea_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LoadAreaLinkControlArea_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LoadAreaLinkControlAreaImpl
