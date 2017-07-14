/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules.impl;

import gluemodel.CIM.IEC61968.Metering.EndDeviceAsset;
import gluemodel.CIM.IEC61968.Metering.MeterAsset;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61970.LoadModel.ConformLoad;
import gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup;
import gluemodel.CIM.IEC61970.LoadModel.LoadGroup;

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

import rgse.ttc17.emoflon.tgg.task2.ConformLoadGroupToConformLoadGroup;

import rgse.ttc17.emoflon.tgg.task2.Rules.RulesPackage;
import rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea;

import rgse.ttc17.emoflon.tgg.task2.SubLoadAreaToSubLoadArea;
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
 * An implementation of the model object '<em><b>Sub Load Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SubLoadAreaImpl extends AbstractRuleImpl implements SubLoadArea {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubLoadAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSubLoadArea();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MeterAsset asset, ConformLoadGroup srcGroup,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, ConformLoad srcConsumer) {
		// initial bindings
		Object[] result1_black = SubLoadAreaImpl.pattern_SubLoadArea_0_1_initialbindings_blackBBBBBBBB(this, match,
				asset, srcGroup, srcArea, pair, srcDeliver, srcConsumer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[asset] = " + asset + ", "
					+ "[srcGroup] = " + srcGroup + ", " + "[srcArea] = " + srcArea + ", " + "[pair] = " + pair + ", "
					+ "[srcDeliver] = " + srcDeliver + ", " + "[srcConsumer] = " + srcConsumer + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SubLoadAreaImpl.pattern_SubLoadArea_0_2_SolveCSP_bindingAndBlackFBBBBBBBB(
				this, match, asset, srcGroup, srcArea, pair, srcDeliver, srcConsumer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[asset] = " + asset + ", " + "[srcGroup] = "
					+ srcGroup + ", " + "[srcArea] = " + srcArea + ", " + "[pair] = " + pair + ", " + "[srcDeliver] = "
					+ srcDeliver + ", " + "[srcConsumer] = " + srcConsumer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SubLoadAreaImpl.pattern_SubLoadArea_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SubLoadAreaImpl.pattern_SubLoadArea_0_4_collectelementstobetranslated_blackBBBBBBB(
					match, asset, srcGroup, srcArea, pair, srcDeliver, srcConsumer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[asset] = " + asset + ", " + "[srcGroup] = "
						+ srcGroup + ", " + "[srcArea] = " + srcArea + ", " + "[pair] = " + pair + ", "
						+ "[srcDeliver] = " + srcDeliver + ", " + "[srcConsumer] = " + srcConsumer + ".");
			}
			SubLoadAreaImpl.pattern_SubLoadArea_0_4_collectelementstobetranslated_greenBBBFF(match, srcGroup, srcArea);
			// EMoflonEdge srcGroup__srcArea____SubLoadArea = (EMoflonEdge) result4_green[3];
			// EMoflonEdge srcArea__srcGroup____LoadGroups = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = SubLoadAreaImpl.pattern_SubLoadArea_0_5_collectcontextelements_blackBBBBBBB(match,
					asset, srcGroup, srcArea, pair, srcDeliver, srcConsumer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[asset] = " + asset + ", " + "[srcGroup] = "
						+ srcGroup + ", " + "[srcArea] = " + srcArea + ", " + "[pair] = " + pair + ", "
						+ "[srcDeliver] = " + srcDeliver + ", " + "[srcConsumer] = " + srcConsumer + ".");
			}
			SubLoadAreaImpl.pattern_SubLoadArea_0_5_collectcontextelements_greenBBBBBBFFFFFFF(match, asset, srcGroup,
					pair, srcDeliver, srcConsumer);
			// EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = (EMoflonEdge) result5_green[6];
			// EMoflonEdge srcDeliver__asset____EndDeviceAssets = (EMoflonEdge) result5_green[7];
			// EMoflonEdge pair__asset____a = (EMoflonEdge) result5_green[8];
			// EMoflonEdge srcConsumer__srcGroup____LoadGroup = (EMoflonEdge) result5_green[9];
			// EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = (EMoflonEdge) result5_green[10];
			// EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = (EMoflonEdge) result5_green[11];
			// EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = (EMoflonEdge) result5_green[12];

			// register objects to match
			SubLoadAreaImpl.pattern_SubLoadArea_0_6_registerobjectstomatch_expressionBBBBBBBB(this, match, asset,
					srcGroup, srcArea, pair, srcDeliver, srcConsumer);
			return SubLoadAreaImpl.pattern_SubLoadArea_0_7_expressionF();
		} else {
			return SubLoadAreaImpl.pattern_SubLoadArea_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SubLoadAreaImpl
				.pattern_SubLoadArea_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MeterAsset asset = (MeterAsset) result1_bindingAndBlack[0];
		ConformLoadGroup srcGroup = (ConformLoadGroup) result1_bindingAndBlack[1];
		outagePreventionJointarget.ConformLoadGroup trgGroup = (outagePreventionJointarget.ConformLoadGroup) result1_bindingAndBlack[2];
		gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea = (gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) result1_bindingAndBlack[3];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result1_bindingAndBlack[4];
		ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result1_bindingAndBlack[5];
		ConformLoadGroupToConformLoadGroup groupToGroup = (ConformLoadGroupToConformLoadGroup) result1_bindingAndBlack[6];
		ConformLoad srcConsumer = (ConformLoad) result1_bindingAndBlack[7];
		// CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = SubLoadAreaImpl.pattern_SubLoadArea_1_1_performtransformation_greenFBBF(trgGroup,
				srcArea);
		SubLoadAreaToSubLoadArea areaToArea = (SubLoadAreaToSubLoadArea) result1_green[0];
		outagePreventionJointarget.SubLoadArea trgArea = (outagePreventionJointarget.SubLoadArea) result1_green[3];

		// collect translated elements
		Object[] result2_black = SubLoadAreaImpl.pattern_SubLoadArea_1_2_collecttranslatedelements_blackBBB(areaToArea,
				srcArea, trgArea);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[areaToArea] = " + areaToArea + ", " + "[srcArea] = " + srcArea + ", " + "[trgArea] = " + trgArea
					+ ".");
		}
		Object[] result2_green = SubLoadAreaImpl.pattern_SubLoadArea_1_2_collecttranslatedelements_greenFBBB(areaToArea,
				srcArea, trgArea);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SubLoadAreaImpl.pattern_SubLoadArea_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, areaToArea, asset, srcGroup, trgGroup, srcArea, trgArea, pair, srcDeliver, groupToGroup,
				srcConsumer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[areaToArea] = " + areaToArea + ", " + "[asset] = "
					+ asset + ", " + "[srcGroup] = " + srcGroup + ", " + "[trgGroup] = " + trgGroup + ", "
					+ "[srcArea] = " + srcArea + ", " + "[trgArea] = " + trgArea + ", " + "[pair] = " + pair + ", "
					+ "[srcDeliver] = " + srcDeliver + ", " + "[groupToGroup] = " + groupToGroup + ", "
					+ "[srcConsumer] = " + srcConsumer + ".");
		}
		SubLoadAreaImpl.pattern_SubLoadArea_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, areaToArea, srcGroup,
				trgGroup, srcArea, trgArea);
		// EMoflonEdge srcGroup__srcArea____SubLoadArea = (EMoflonEdge) result3_green[6];
		// EMoflonEdge srcArea__srcGroup____LoadGroups = (EMoflonEdge) result3_green[7];
		// EMoflonEdge trgGroup__trgArea____SubLoadArea = (EMoflonEdge) result3_green[8];
		// EMoflonEdge areaToArea__srcArea____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge areaToArea__trgArea____target = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		SubLoadAreaImpl.pattern_SubLoadArea_1_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult, areaToArea,
				asset, srcGroup, trgGroup, srcArea, trgArea, pair, srcDeliver, groupToGroup, srcConsumer);
		return SubLoadAreaImpl.pattern_SubLoadArea_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SubLoadAreaImpl
				.pattern_SubLoadArea_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SubLoadAreaImpl.pattern_SubLoadArea_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SubLoadAreaImpl.pattern_SubLoadArea_2_2_corematch_bindingFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MeterAsset asset = (MeterAsset) result2_binding[0];
		ConformLoadGroup srcGroup = (ConformLoadGroup) result2_binding[1];
		gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea = (gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) result2_binding[2];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_binding[3];
		ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result2_binding[4];
		ConformLoad srcConsumer = (ConformLoad) result2_binding[5];
		for (Object[] result2_black : SubLoadAreaImpl.pattern_SubLoadArea_2_2_corematch_blackBBFBBBFBB(asset, srcGroup,
				srcArea, pair, srcDeliver, srcConsumer, match)) {
			outagePreventionJointarget.ConformLoadGroup trgGroup = (outagePreventionJointarget.ConformLoadGroup) result2_black[2];
			ConformLoadGroupToConformLoadGroup groupToGroup = (ConformLoadGroupToConformLoadGroup) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : SubLoadAreaImpl.pattern_SubLoadArea_2_3_findcontext_blackBBBBBBBB(asset,
					srcGroup, trgGroup, srcArea, pair, srcDeliver, groupToGroup, srcConsumer)) {
				Object[] result3_green = SubLoadAreaImpl.pattern_SubLoadArea_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFFF(
						asset, srcGroup, trgGroup, srcArea, pair, srcDeliver, groupToGroup, srcConsumer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = (EMoflonEdge) result3_green[9];
				// EMoflonEdge srcDeliver__asset____EndDeviceAssets = (EMoflonEdge) result3_green[10];
				// EMoflonEdge srcGroup__srcArea____SubLoadArea = (EMoflonEdge) result3_green[11];
				// EMoflonEdge srcArea__srcGroup____LoadGroups = (EMoflonEdge) result3_green[12];
				// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[13];
				// EMoflonEdge groupToGroup__trgGroup____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge groupToGroup__srcGroup____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge srcConsumer__srcGroup____LoadGroup = (EMoflonEdge) result3_green[16];
				// EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = (EMoflonEdge) result3_green[17];
				// EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = (EMoflonEdge) result3_green[18];
				// EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = (EMoflonEdge) result3_green[19];

				// solve CSP
				Object[] result4_bindingAndBlack = SubLoadAreaImpl
						.pattern_SubLoadArea_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch, asset,
								srcGroup, trgGroup, srcArea, pair, srcDeliver, groupToGroup, srcConsumer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[asset] = " + asset + ", " + "[srcGroup] = " + srcGroup + ", " + "[trgGroup] = "
							+ trgGroup + ", " + "[srcArea] = " + srcArea + ", " + "[pair] = " + pair + ", "
							+ "[srcDeliver] = " + srcDeliver + ", " + "[groupToGroup] = " + groupToGroup + ", "
							+ "[srcConsumer] = " + srcConsumer + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SubLoadAreaImpl.pattern_SubLoadArea_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = SubLoadAreaImpl
							.pattern_SubLoadArea_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					SubLoadAreaImpl.pattern_SubLoadArea_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SubLoadAreaImpl.pattern_SubLoadArea_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MeterAsset asset, ConformLoadGroup srcGroup,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, ConformLoad srcConsumer) {
		match.registerObject("asset", asset);
		match.registerObject("srcGroup", srcGroup);
		match.registerObject("srcArea", srcArea);
		match.registerObject("pair", pair);
		match.registerObject("srcDeliver", srcDeliver);
		match.registerObject("srcConsumer", srcConsumer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MeterAsset asset, ConformLoadGroup srcGroup,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, ConformLoad srcConsumer) {// Create CSP
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
			ConformLoadGroup srcGroup, outagePreventionJointarget.ConformLoadGroup trgGroup,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, ConformLoadGroupToConformLoadGroup groupToGroup, ConformLoad srcConsumer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("asset", asset);
		isApplicableMatch.registerObject("srcGroup", srcGroup);
		isApplicableMatch.registerObject("trgGroup", trgGroup);
		isApplicableMatch.registerObject("srcArea", srcArea);
		isApplicableMatch.registerObject("pair", pair);
		isApplicableMatch.registerObject("srcDeliver", srcDeliver);
		isApplicableMatch.registerObject("groupToGroup", groupToGroup);
		isApplicableMatch.registerObject("srcConsumer", srcConsumer);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject areaToArea, EObject asset, EObject srcGroup,
			EObject trgGroup, EObject srcArea, EObject trgArea, EObject pair, EObject srcDeliver, EObject groupToGroup,
			EObject srcConsumer) {
		ruleresult.registerObject("areaToArea", areaToArea);
		ruleresult.registerObject("asset", asset);
		ruleresult.registerObject("srcGroup", srcGroup);
		ruleresult.registerObject("trgGroup", trgGroup);
		ruleresult.registerObject("srcArea", srcArea);
		ruleresult.registerObject("trgArea", trgArea);
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("srcDeliver", srcDeliver);
		ruleresult.registerObject("groupToGroup", groupToGroup);
		ruleresult.registerObject("srcConsumer", srcConsumer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("srcArea").eClass())
				.equals("gluemodel.CIM.IEC61970.LoadModel.SubLoadArea.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_37(EMoflonEdge _edge_SubLoadArea) {
		// prepare return value
		Object[] result1_bindingAndBlack = SubLoadAreaImpl
				.pattern_SubLoadArea_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SubLoadAreaImpl.pattern_SubLoadArea_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SubLoadAreaImpl
				.pattern_SubLoadArea_10_2_testcorematchandDECs_blackFFFFFFB(_edge_SubLoadArea)) {
			MeterAsset asset = (MeterAsset) result2_black[0];
			ConformLoadGroup srcGroup = (ConformLoadGroup) result2_black[1];
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea = (gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) result2_black[2];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_black[3];
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result2_black[4];
			ConformLoad srcConsumer = (ConformLoad) result2_black[5];
			Object[] result2_green = SubLoadAreaImpl.pattern_SubLoadArea_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SubLoadAreaImpl.pattern_SubLoadArea_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBB(
					this, match, asset, srcGroup, srcArea, pair, srcDeliver, srcConsumer)) {
				// Ensure that the correct types of elements are matched
				if (SubLoadAreaImpl
						.pattern_SubLoadArea_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = SubLoadAreaImpl.pattern_SubLoadArea_10_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					SubLoadAreaImpl.pattern_SubLoadArea_10_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SubLoadAreaImpl.pattern_SubLoadArea_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("SubLoadArea");
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
	public boolean checkDEC_FWD(MeterAsset asset, ConformLoadGroup srcGroup,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, ConformLoad srcConsumer) {// match tgg pattern
		Object[] result1_black = SubLoadAreaImpl.pattern_SubLoadArea_13_1_matchtggpattern_blackBBBBBB(asset, srcGroup,
				srcArea, pair, srcDeliver, srcConsumer);
		if (result1_black != null) {
			return SubLoadAreaImpl.pattern_SubLoadArea_13_2_expressionF();
		} else {
			return SubLoadAreaImpl.pattern_SubLoadArea_13_3_expressionF();
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
		case RulesPackage.SUB_LOAD_AREA___IS_APPROPRIATE_FWD__MATCH_METERASSET_CONFORMLOADGROUP_SUBLOADAREA_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT_CONFORMLOAD:
			return isAppropriate_FWD((Match) arguments.get(0), (MeterAsset) arguments.get(1),
					(ConformLoadGroup) arguments.get(2),
					(gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) arguments.get(3),
					(MeterAssetPhysicalDevicePair) arguments.get(4), (ServiceDeliveryPoint) arguments.get(5),
					(ConformLoad) arguments.get(6));
		case RulesPackage.SUB_LOAD_AREA___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SUB_LOAD_AREA___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SUB_LOAD_AREA___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSET_CONFORMLOADGROUP_SUBLOADAREA_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT_CONFORMLOAD:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MeterAsset) arguments.get(1),
					(ConformLoadGroup) arguments.get(2),
					(gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) arguments.get(3),
					(MeterAssetPhysicalDevicePair) arguments.get(4), (ServiceDeliveryPoint) arguments.get(5),
					(ConformLoad) arguments.get(6));
			return null;
		case RulesPackage.SUB_LOAD_AREA___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSET_CONFORMLOADGROUP_SUBLOADAREA_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT_CONFORMLOAD:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MeterAsset) arguments.get(1),
					(ConformLoadGroup) arguments.get(2),
					(gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) arguments.get(3),
					(MeterAssetPhysicalDevicePair) arguments.get(4), (ServiceDeliveryPoint) arguments.get(5),
					(ConformLoad) arguments.get(6));
		case RulesPackage.SUB_LOAD_AREA___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SUB_LOAD_AREA___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METERASSET_CONFORMLOADGROUP_CONFORMLOADGROUP_SUBLOADAREA_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT_CONFORMLOADGROUPTOCONFORMLOADGROUP_CONFORMLOAD:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MeterAsset) arguments.get(1),
					(ConformLoadGroup) arguments.get(2), (outagePreventionJointarget.ConformLoadGroup) arguments.get(3),
					(gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) arguments.get(4),
					(MeterAssetPhysicalDevicePair) arguments.get(5), (ServiceDeliveryPoint) arguments.get(6),
					(ConformLoadGroupToConformLoadGroup) arguments.get(7), (ConformLoad) arguments.get(8));
		case RulesPackage.SUB_LOAD_AREA___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SUB_LOAD_AREA___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.SUB_LOAD_AREA___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SUB_LOAD_AREA___IS_APPROPRIATE_FWD_EMOFLON_EDGE_37__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_37((EMoflonEdge) arguments.get(0));
		case RulesPackage.SUB_LOAD_AREA___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SUB_LOAD_AREA___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.SUB_LOAD_AREA___CHECK_DEC_FWD__METERASSET_CONFORMLOADGROUP_SUBLOADAREA_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT_CONFORMLOAD:
			return checkDEC_FWD((MeterAsset) arguments.get(0), (ConformLoadGroup) arguments.get(1),
					(gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) arguments.get(2),
					(MeterAssetPhysicalDevicePair) arguments.get(3), (ServiceDeliveryPoint) arguments.get(4),
					(ConformLoad) arguments.get(5));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SubLoadArea_0_1_initialbindings_blackBBBBBBBB(SubLoadArea _this, Match match,
			MeterAsset asset, ConformLoadGroup srcGroup, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea,
			MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver, ConformLoad srcConsumer) {
		return new Object[] { _this, match, asset, srcGroup, srcArea, pair, srcDeliver, srcConsumer };
	}

	public static final Object[] pattern_SubLoadArea_0_2_SolveCSP_bindingFBBBBBBBB(SubLoadArea _this, Match match,
			MeterAsset asset, ConformLoadGroup srcGroup, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea,
			MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver, ConformLoad srcConsumer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, asset, srcGroup, srcArea, pair, srcDeliver,
				srcConsumer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, asset, srcGroup, srcArea, pair, srcDeliver, srcConsumer };
		}
		return null;
	}

	public static final Object[] pattern_SubLoadArea_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SubLoadArea_0_2_SolveCSP_bindingAndBlackFBBBBBBBB(SubLoadArea _this,
			Match match, MeterAsset asset, ConformLoadGroup srcGroup,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, ConformLoad srcConsumer) {
		Object[] result_pattern_SubLoadArea_0_2_SolveCSP_binding = pattern_SubLoadArea_0_2_SolveCSP_bindingFBBBBBBBB(
				_this, match, asset, srcGroup, srcArea, pair, srcDeliver, srcConsumer);
		if (result_pattern_SubLoadArea_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SubLoadArea_0_2_SolveCSP_binding[0];

			Object[] result_pattern_SubLoadArea_0_2_SolveCSP_black = pattern_SubLoadArea_0_2_SolveCSP_blackB(csp);
			if (result_pattern_SubLoadArea_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, asset, srcGroup, srcArea, pair, srcDeliver, srcConsumer };
			}
		}
		return null;
	}

	public static final boolean pattern_SubLoadArea_0_3_CheckCSP_expressionFBB(SubLoadArea _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SubLoadArea_0_4_collectelementstobetranslated_blackBBBBBBB(Match match,
			MeterAsset asset, ConformLoadGroup srcGroup, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea,
			MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver, ConformLoad srcConsumer) {
		return new Object[] { match, asset, srcGroup, srcArea, pair, srcDeliver, srcConsumer };
	}

	public static final Object[] pattern_SubLoadArea_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			ConformLoadGroup srcGroup, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea) {
		EMoflonEdge srcGroup__srcArea____SubLoadArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcArea__srcGroup____LoadGroups = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(srcArea);
		String srcGroup__srcArea____SubLoadArea_name_prime = "SubLoadArea";
		String srcArea__srcGroup____LoadGroups_name_prime = "LoadGroups";
		srcGroup__srcArea____SubLoadArea.setSrc(srcGroup);
		srcGroup__srcArea____SubLoadArea.setTrg(srcArea);
		match.getToBeTranslatedEdges().add(srcGroup__srcArea____SubLoadArea);
		srcArea__srcGroup____LoadGroups.setSrc(srcArea);
		srcArea__srcGroup____LoadGroups.setTrg(srcGroup);
		match.getToBeTranslatedEdges().add(srcArea__srcGroup____LoadGroups);
		srcGroup__srcArea____SubLoadArea.setName(srcGroup__srcArea____SubLoadArea_name_prime);
		srcArea__srcGroup____LoadGroups.setName(srcArea__srcGroup____LoadGroups_name_prime);
		return new Object[] { match, srcGroup, srcArea, srcGroup__srcArea____SubLoadArea,
				srcArea__srcGroup____LoadGroups };
	}

	public static final Object[] pattern_SubLoadArea_0_5_collectcontextelements_blackBBBBBBB(Match match,
			MeterAsset asset, ConformLoadGroup srcGroup, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea,
			MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver, ConformLoad srcConsumer) {
		return new Object[] { match, asset, srcGroup, srcArea, pair, srcDeliver, srcConsumer };
	}

	public static final Object[] pattern_SubLoadArea_0_5_collectcontextelements_greenBBBBBBFFFFFFF(Match match,
			MeterAsset asset, ConformLoadGroup srcGroup, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, ConformLoad srcConsumer) {
		EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcGroup____LoadGroup = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(asset);
		match.getContextNodes().add(srcGroup);
		match.getContextNodes().add(pair);
		match.getContextNodes().add(srcDeliver);
		match.getContextNodes().add(srcConsumer);
		String asset__srcDeliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String srcDeliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		String pair__asset____a_name_prime = "a";
		String srcConsumer__srcGroup____LoadGroup_name_prime = "LoadGroup";
		String srcGroup__srcConsumer____EnergyConsumers_name_prime = "EnergyConsumers";
		String srcDeliver__srcConsumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime = "ServiceDeliveryPoints";
		asset__srcDeliver____ServiceDeliveryPoint.setSrc(asset);
		asset__srcDeliver____ServiceDeliveryPoint.setTrg(srcDeliver);
		match.getContextEdges().add(asset__srcDeliver____ServiceDeliveryPoint);
		srcDeliver__asset____EndDeviceAssets.setSrc(srcDeliver);
		srcDeliver__asset____EndDeviceAssets.setTrg(asset);
		match.getContextEdges().add(srcDeliver__asset____EndDeviceAssets);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		match.getContextEdges().add(pair__asset____a);
		srcConsumer__srcGroup____LoadGroup.setSrc(srcConsumer);
		srcConsumer__srcGroup____LoadGroup.setTrg(srcGroup);
		match.getContextEdges().add(srcConsumer__srcGroup____LoadGroup);
		srcGroup__srcConsumer____EnergyConsumers.setSrc(srcGroup);
		srcGroup__srcConsumer____EnergyConsumers.setTrg(srcConsumer);
		match.getContextEdges().add(srcGroup__srcConsumer____EnergyConsumers);
		srcDeliver__srcConsumer____EnergyConsumer.setSrc(srcDeliver);
		srcDeliver__srcConsumer____EnergyConsumer.setTrg(srcConsumer);
		match.getContextEdges().add(srcDeliver__srcConsumer____EnergyConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setSrc(srcConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setTrg(srcDeliver);
		match.getContextEdges().add(srcConsumer__srcDeliver____ServiceDeliveryPoints);
		asset__srcDeliver____ServiceDeliveryPoint.setName(asset__srcDeliver____ServiceDeliveryPoint_name_prime);
		srcDeliver__asset____EndDeviceAssets.setName(srcDeliver__asset____EndDeviceAssets_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		srcConsumer__srcGroup____LoadGroup.setName(srcConsumer__srcGroup____LoadGroup_name_prime);
		srcGroup__srcConsumer____EnergyConsumers.setName(srcGroup__srcConsumer____EnergyConsumers_name_prime);
		srcDeliver__srcConsumer____EnergyConsumer.setName(srcDeliver__srcConsumer____EnergyConsumer_name_prime);
		srcConsumer__srcDeliver____ServiceDeliveryPoints
				.setName(srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime);
		return new Object[] { match, asset, srcGroup, pair, srcDeliver, srcConsumer,
				asset__srcDeliver____ServiceDeliveryPoint, srcDeliver__asset____EndDeviceAssets, pair__asset____a,
				srcConsumer__srcGroup____LoadGroup, srcGroup__srcConsumer____EnergyConsumers,
				srcDeliver__srcConsumer____EnergyConsumer, srcConsumer__srcDeliver____ServiceDeliveryPoints };
	}

	public static final void pattern_SubLoadArea_0_6_registerobjectstomatch_expressionBBBBBBBB(SubLoadArea _this,
			Match match, MeterAsset asset, ConformLoadGroup srcGroup,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, ConformLoad srcConsumer) {
		_this.registerObjectsToMatch_FWD(match, asset, srcGroup, srcArea, pair, srcDeliver, srcConsumer);

	}

	public static final boolean pattern_SubLoadArea_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SubLoadArea_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SubLoadArea_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("asset");
		EObject _localVariable_1 = isApplicableMatch.getObject("srcGroup");
		EObject _localVariable_2 = isApplicableMatch.getObject("trgGroup");
		EObject _localVariable_3 = isApplicableMatch.getObject("srcArea");
		EObject _localVariable_4 = isApplicableMatch.getObject("pair");
		EObject _localVariable_5 = isApplicableMatch.getObject("srcDeliver");
		EObject _localVariable_6 = isApplicableMatch.getObject("groupToGroup");
		EObject _localVariable_7 = isApplicableMatch.getObject("srcConsumer");
		EObject tmpAsset = _localVariable_0;
		EObject tmpSrcGroup = _localVariable_1;
		EObject tmpTrgGroup = _localVariable_2;
		EObject tmpSrcArea = _localVariable_3;
		EObject tmpPair = _localVariable_4;
		EObject tmpSrcDeliver = _localVariable_5;
		EObject tmpGroupToGroup = _localVariable_6;
		EObject tmpSrcConsumer = _localVariable_7;
		if (tmpAsset instanceof MeterAsset) {
			MeterAsset asset = (MeterAsset) tmpAsset;
			if (tmpSrcGroup instanceof ConformLoadGroup) {
				ConformLoadGroup srcGroup = (ConformLoadGroup) tmpSrcGroup;
				if (tmpTrgGroup instanceof outagePreventionJointarget.ConformLoadGroup) {
					outagePreventionJointarget.ConformLoadGroup trgGroup = (outagePreventionJointarget.ConformLoadGroup) tmpTrgGroup;
					if (tmpSrcArea instanceof gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) {
						gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea = (gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) tmpSrcArea;
						if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
							MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
							if (tmpSrcDeliver instanceof ServiceDeliveryPoint) {
								ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) tmpSrcDeliver;
								if (tmpGroupToGroup instanceof ConformLoadGroupToConformLoadGroup) {
									ConformLoadGroupToConformLoadGroup groupToGroup = (ConformLoadGroupToConformLoadGroup) tmpGroupToGroup;
									if (tmpSrcConsumer instanceof ConformLoad) {
										ConformLoad srcConsumer = (ConformLoad) tmpSrcConsumer;
										return new Object[] { asset, srcGroup, trgGroup, srcArea, pair, srcDeliver,
												groupToGroup, srcConsumer, isApplicableMatch };
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

	public static final Object[] pattern_SubLoadArea_1_1_performtransformation_blackBBBBBBBBFBB(MeterAsset asset,
			ConformLoadGroup srcGroup, outagePreventionJointarget.ConformLoadGroup trgGroup,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, ConformLoadGroupToConformLoadGroup groupToGroup, ConformLoad srcConsumer,
			SubLoadArea _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { asset, srcGroup, trgGroup, srcArea, pair, srcDeliver, groupToGroup, srcConsumer,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubLoadArea_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			SubLoadArea _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SubLoadArea_1_1_performtransformation_binding = pattern_SubLoadArea_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_SubLoadArea_1_1_performtransformation_binding != null) {
			MeterAsset asset = (MeterAsset) result_pattern_SubLoadArea_1_1_performtransformation_binding[0];
			ConformLoadGroup srcGroup = (ConformLoadGroup) result_pattern_SubLoadArea_1_1_performtransformation_binding[1];
			outagePreventionJointarget.ConformLoadGroup trgGroup = (outagePreventionJointarget.ConformLoadGroup) result_pattern_SubLoadArea_1_1_performtransformation_binding[2];
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea = (gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) result_pattern_SubLoadArea_1_1_performtransformation_binding[3];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result_pattern_SubLoadArea_1_1_performtransformation_binding[4];
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result_pattern_SubLoadArea_1_1_performtransformation_binding[5];
			ConformLoadGroupToConformLoadGroup groupToGroup = (ConformLoadGroupToConformLoadGroup) result_pattern_SubLoadArea_1_1_performtransformation_binding[6];
			ConformLoad srcConsumer = (ConformLoad) result_pattern_SubLoadArea_1_1_performtransformation_binding[7];

			Object[] result_pattern_SubLoadArea_1_1_performtransformation_black = pattern_SubLoadArea_1_1_performtransformation_blackBBBBBBBBFBB(
					asset, srcGroup, trgGroup, srcArea, pair, srcDeliver, groupToGroup, srcConsumer, _this,
					isApplicableMatch);
			if (result_pattern_SubLoadArea_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SubLoadArea_1_1_performtransformation_black[8];

				return new Object[] { asset, srcGroup, trgGroup, srcArea, pair, srcDeliver, groupToGroup, srcConsumer,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubLoadArea_1_1_performtransformation_greenFBBF(
			outagePreventionJointarget.ConformLoadGroup trgGroup,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea) {
		SubLoadAreaToSubLoadArea areaToArea = Task2Factory.eINSTANCE.createSubLoadAreaToSubLoadArea();
		outagePreventionJointarget.SubLoadArea trgArea = OutagePreventionJointargetFactory.eINSTANCE
				.createSubLoadArea();
		areaToArea.setSource(srcArea);
		trgGroup.setSubLoadArea(trgArea);
		areaToArea.setTarget(trgArea);
		return new Object[] { areaToArea, trgGroup, srcArea, trgArea };
	}

	public static final Object[] pattern_SubLoadArea_1_2_collecttranslatedelements_blackBBB(
			SubLoadAreaToSubLoadArea areaToArea, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea,
			outagePreventionJointarget.SubLoadArea trgArea) {
		return new Object[] { areaToArea, srcArea, trgArea };
	}

	public static final Object[] pattern_SubLoadArea_1_2_collecttranslatedelements_greenFBBB(
			SubLoadAreaToSubLoadArea areaToArea, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea,
			outagePreventionJointarget.SubLoadArea trgArea) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(areaToArea);
		ruleresult.getTranslatedElements().add(srcArea);
		ruleresult.getCreatedElements().add(trgArea);
		return new Object[] { ruleresult, areaToArea, srcArea, trgArea };
	}

	public static final Object[] pattern_SubLoadArea_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject areaToArea, EObject asset, EObject srcGroup, EObject trgGroup,
			EObject srcArea, EObject trgArea, EObject pair, EObject srcDeliver, EObject groupToGroup,
			EObject srcConsumer) {
		if (!areaToArea.equals(asset)) {
			if (!areaToArea.equals(srcGroup)) {
				if (!areaToArea.equals(trgGroup)) {
					if (!areaToArea.equals(srcArea)) {
						if (!areaToArea.equals(trgArea)) {
							if (!areaToArea.equals(pair)) {
								if (!areaToArea.equals(srcDeliver)) {
									if (!areaToArea.equals(groupToGroup)) {
										if (!areaToArea.equals(srcConsumer)) {
											if (!asset.equals(srcGroup)) {
												if (!asset.equals(trgGroup)) {
													if (!asset.equals(srcArea)) {
														if (!asset.equals(trgArea)) {
															if (!asset.equals(pair)) {
																if (!asset.equals(srcDeliver)) {
																	if (!asset.equals(groupToGroup)) {
																		if (!asset.equals(srcConsumer)) {
																			if (!srcGroup.equals(trgGroup)) {
																				if (!srcGroup.equals(trgArea)) {
																					if (!srcArea.equals(srcGroup)) {
																						if (!srcArea.equals(trgGroup)) {
																							if (!srcArea
																									.equals(trgArea)) {
																								if (!srcArea.equals(
																										srcDeliver)) {
																									if (!srcArea.equals(
																											srcConsumer)) {
																										if (!trgArea
																												.equals(trgGroup)) {
																											if (!pair
																													.equals(srcGroup)) {
																												if (!pair
																														.equals(trgGroup)) {
																													if (!pair
																															.equals(srcArea)) {
																														if (!pair
																																.equals(trgArea)) {
																															if (!pair
																																	.equals(srcDeliver)) {
																																if (!pair
																																		.equals(srcConsumer)) {
																																	if (!srcDeliver
																																			.equals(srcGroup)) {
																																		if (!srcDeliver
																																				.equals(trgGroup)) {
																																			if (!srcDeliver
																																					.equals(trgArea)) {
																																				if (!groupToGroup
																																						.equals(srcGroup)) {
																																					if (!groupToGroup
																																							.equals(trgGroup)) {
																																						if (!groupToGroup
																																								.equals(srcArea)) {
																																							if (!groupToGroup
																																									.equals(trgArea)) {
																																								if (!groupToGroup
																																										.equals(pair)) {
																																									if (!groupToGroup
																																											.equals(srcDeliver)) {
																																										if (!groupToGroup
																																												.equals(srcConsumer)) {
																																											if (!srcConsumer
																																													.equals(srcGroup)) {
																																												if (!srcConsumer
																																														.equals(trgGroup)) {
																																													if (!srcConsumer
																																															.equals(trgArea)) {
																																														if (!srcConsumer
																																																.equals(srcDeliver)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	areaToArea,
																																																	asset,
																																																	srcGroup,
																																																	trgGroup,
																																																	srcArea,
																																																	trgArea,
																																																	pair,
																																																	srcDeliver,
																																																	groupToGroup,
																																																	srcConsumer };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SubLoadArea_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject areaToArea, EObject srcGroup, EObject trgGroup, EObject srcArea,
			EObject trgArea) {
		EMoflonEdge srcGroup__srcArea____SubLoadArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcArea__srcGroup____LoadGroups = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgGroup__trgArea____SubLoadArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge areaToArea__srcArea____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge areaToArea__trgArea____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SubLoadArea";
		String srcGroup__srcArea____SubLoadArea_name_prime = "SubLoadArea";
		String srcArea__srcGroup____LoadGroups_name_prime = "LoadGroups";
		String trgGroup__trgArea____SubLoadArea_name_prime = "SubLoadArea";
		String areaToArea__srcArea____source_name_prime = "source";
		String areaToArea__trgArea____target_name_prime = "target";
		srcGroup__srcArea____SubLoadArea.setSrc(srcGroup);
		srcGroup__srcArea____SubLoadArea.setTrg(srcArea);
		ruleresult.getTranslatedEdges().add(srcGroup__srcArea____SubLoadArea);
		srcArea__srcGroup____LoadGroups.setSrc(srcArea);
		srcArea__srcGroup____LoadGroups.setTrg(srcGroup);
		ruleresult.getTranslatedEdges().add(srcArea__srcGroup____LoadGroups);
		trgGroup__trgArea____SubLoadArea.setSrc(trgGroup);
		trgGroup__trgArea____SubLoadArea.setTrg(trgArea);
		ruleresult.getCreatedEdges().add(trgGroup__trgArea____SubLoadArea);
		areaToArea__srcArea____source.setSrc(areaToArea);
		areaToArea__srcArea____source.setTrg(srcArea);
		ruleresult.getCreatedEdges().add(areaToArea__srcArea____source);
		areaToArea__trgArea____target.setSrc(areaToArea);
		areaToArea__trgArea____target.setTrg(trgArea);
		ruleresult.getCreatedEdges().add(areaToArea__trgArea____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		srcGroup__srcArea____SubLoadArea.setName(srcGroup__srcArea____SubLoadArea_name_prime);
		srcArea__srcGroup____LoadGroups.setName(srcArea__srcGroup____LoadGroups_name_prime);
		trgGroup__trgArea____SubLoadArea.setName(trgGroup__trgArea____SubLoadArea_name_prime);
		areaToArea__srcArea____source.setName(areaToArea__srcArea____source_name_prime);
		areaToArea__trgArea____target.setName(areaToArea__trgArea____target_name_prime);
		return new Object[] { ruleresult, areaToArea, srcGroup, trgGroup, srcArea, trgArea,
				srcGroup__srcArea____SubLoadArea, srcArea__srcGroup____LoadGroups, trgGroup__trgArea____SubLoadArea,
				areaToArea__srcArea____source, areaToArea__trgArea____target };
	}

	public static final void pattern_SubLoadArea_1_5_registerobjects_expressionBBBBBBBBBBBB(SubLoadArea _this,
			PerformRuleResult ruleresult, EObject areaToArea, EObject asset, EObject srcGroup, EObject trgGroup,
			EObject srcArea, EObject trgArea, EObject pair, EObject srcDeliver, EObject groupToGroup,
			EObject srcConsumer) {
		_this.registerObjects_FWD(ruleresult, areaToArea, asset, srcGroup, trgGroup, srcArea, trgArea, pair, srcDeliver,
				groupToGroup, srcConsumer);

	}

	public static final PerformRuleResult pattern_SubLoadArea_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SubLoadArea_2_1_preparereturnvalue_bindingFB(SubLoadArea _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SubLoadArea_2_1_preparereturnvalue_blackFBB(EClass eClass, SubLoadArea _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SubLoadArea_2_1_preparereturnvalue_bindingAndBlackFFB(SubLoadArea _this) {
		Object[] result_pattern_SubLoadArea_2_1_preparereturnvalue_binding = pattern_SubLoadArea_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SubLoadArea_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_SubLoadArea_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SubLoadArea_2_1_preparereturnvalue_black = pattern_SubLoadArea_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_SubLoadArea_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SubLoadArea_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubLoadArea_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "SubLoadArea";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SubLoadArea_2_2_corematch_bindingFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("asset");
		EObject _localVariable_1 = match.getObject("srcGroup");
		EObject _localVariable_2 = match.getObject("srcArea");
		EObject _localVariable_3 = match.getObject("pair");
		EObject _localVariable_4 = match.getObject("srcDeliver");
		EObject _localVariable_5 = match.getObject("srcConsumer");
		EObject tmpAsset = _localVariable_0;
		EObject tmpSrcGroup = _localVariable_1;
		EObject tmpSrcArea = _localVariable_2;
		EObject tmpPair = _localVariable_3;
		EObject tmpSrcDeliver = _localVariable_4;
		EObject tmpSrcConsumer = _localVariable_5;
		if (tmpAsset instanceof MeterAsset) {
			MeterAsset asset = (MeterAsset) tmpAsset;
			if (tmpSrcGroup instanceof ConformLoadGroup) {
				ConformLoadGroup srcGroup = (ConformLoadGroup) tmpSrcGroup;
				if (tmpSrcArea instanceof gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) {
					gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea = (gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) tmpSrcArea;
					if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
						MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
						if (tmpSrcDeliver instanceof ServiceDeliveryPoint) {
							ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) tmpSrcDeliver;
							if (tmpSrcConsumer instanceof ConformLoad) {
								ConformLoad srcConsumer = (ConformLoad) tmpSrcConsumer;
								return new Object[] { asset, srcGroup, srcArea, pair, srcDeliver, srcConsumer, match };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SubLoadArea_2_2_corematch_blackBBFBBBFBB(MeterAsset asset,
			ConformLoadGroup srcGroup, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea,
			MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver, ConformLoad srcConsumer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ConformLoadGroupToConformLoadGroup groupToGroup : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcGroup, ConformLoadGroupToConformLoadGroup.class, "source")) {
			outagePreventionJointarget.ConformLoadGroup trgGroup = groupToGroup.getTarget();
			if (trgGroup != null) {
				_result.add(new Object[] { asset, srcGroup, trgGroup, srcArea, pair, srcDeliver, groupToGroup,
						srcConsumer, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SubLoadArea_2_3_findcontext_blackBBBBBBBB(MeterAsset asset,
			ConformLoadGroup srcGroup, outagePreventionJointarget.ConformLoadGroup trgGroup,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, ConformLoadGroupToConformLoadGroup groupToGroup, ConformLoad srcConsumer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (srcDeliver.equals(asset.getServiceDeliveryPoint())) {
			if (srcArea.equals(srcGroup.getSubLoadArea())) {
				if (asset.equals(pair.getA())) {
					if (trgGroup.equals(groupToGroup.getTarget())) {
						if (srcGroup.equals(groupToGroup.getSource())) {
							if (srcGroup.equals(srcConsumer.getLoadGroup())) {
								if (srcConsumer.equals(srcDeliver.getEnergyConsumer())) {
									_result.add(new Object[] { asset, srcGroup, trgGroup, srcArea, pair, srcDeliver,
											groupToGroup, srcConsumer });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SubLoadArea_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFFF(MeterAsset asset,
			ConformLoadGroup srcGroup, outagePreventionJointarget.ConformLoadGroup trgGroup,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, ConformLoadGroupToConformLoadGroup groupToGroup, ConformLoad srcConsumer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcGroup__srcArea____SubLoadArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcArea__srcGroup____LoadGroups = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge groupToGroup__trgGroup____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge groupToGroup__srcGroup____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcGroup____LoadGroup = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String asset__srcDeliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String srcDeliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		String srcGroup__srcArea____SubLoadArea_name_prime = "SubLoadArea";
		String srcArea__srcGroup____LoadGroups_name_prime = "LoadGroups";
		String pair__asset____a_name_prime = "a";
		String groupToGroup__trgGroup____target_name_prime = "target";
		String groupToGroup__srcGroup____source_name_prime = "source";
		String srcConsumer__srcGroup____LoadGroup_name_prime = "LoadGroup";
		String srcGroup__srcConsumer____EnergyConsumers_name_prime = "EnergyConsumers";
		String srcDeliver__srcConsumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime = "ServiceDeliveryPoints";
		isApplicableMatch.getAllContextElements().add(asset);
		isApplicableMatch.getAllContextElements().add(srcGroup);
		isApplicableMatch.getAllContextElements().add(trgGroup);
		isApplicableMatch.getAllContextElements().add(srcArea);
		isApplicableMatch.getAllContextElements().add(pair);
		isApplicableMatch.getAllContextElements().add(srcDeliver);
		isApplicableMatch.getAllContextElements().add(groupToGroup);
		isApplicableMatch.getAllContextElements().add(srcConsumer);
		asset__srcDeliver____ServiceDeliveryPoint.setSrc(asset);
		asset__srcDeliver____ServiceDeliveryPoint.setTrg(srcDeliver);
		isApplicableMatch.getAllContextElements().add(asset__srcDeliver____ServiceDeliveryPoint);
		srcDeliver__asset____EndDeviceAssets.setSrc(srcDeliver);
		srcDeliver__asset____EndDeviceAssets.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(srcDeliver__asset____EndDeviceAssets);
		srcGroup__srcArea____SubLoadArea.setSrc(srcGroup);
		srcGroup__srcArea____SubLoadArea.setTrg(srcArea);
		isApplicableMatch.getAllContextElements().add(srcGroup__srcArea____SubLoadArea);
		srcArea__srcGroup____LoadGroups.setSrc(srcArea);
		srcArea__srcGroup____LoadGroups.setTrg(srcGroup);
		isApplicableMatch.getAllContextElements().add(srcArea__srcGroup____LoadGroups);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(pair__asset____a);
		groupToGroup__trgGroup____target.setSrc(groupToGroup);
		groupToGroup__trgGroup____target.setTrg(trgGroup);
		isApplicableMatch.getAllContextElements().add(groupToGroup__trgGroup____target);
		groupToGroup__srcGroup____source.setSrc(groupToGroup);
		groupToGroup__srcGroup____source.setTrg(srcGroup);
		isApplicableMatch.getAllContextElements().add(groupToGroup__srcGroup____source);
		srcConsumer__srcGroup____LoadGroup.setSrc(srcConsumer);
		srcConsumer__srcGroup____LoadGroup.setTrg(srcGroup);
		isApplicableMatch.getAllContextElements().add(srcConsumer__srcGroup____LoadGroup);
		srcGroup__srcConsumer____EnergyConsumers.setSrc(srcGroup);
		srcGroup__srcConsumer____EnergyConsumers.setTrg(srcConsumer);
		isApplicableMatch.getAllContextElements().add(srcGroup__srcConsumer____EnergyConsumers);
		srcDeliver__srcConsumer____EnergyConsumer.setSrc(srcDeliver);
		srcDeliver__srcConsumer____EnergyConsumer.setTrg(srcConsumer);
		isApplicableMatch.getAllContextElements().add(srcDeliver__srcConsumer____EnergyConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setSrc(srcConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setTrg(srcDeliver);
		isApplicableMatch.getAllContextElements().add(srcConsumer__srcDeliver____ServiceDeliveryPoints);
		asset__srcDeliver____ServiceDeliveryPoint.setName(asset__srcDeliver____ServiceDeliveryPoint_name_prime);
		srcDeliver__asset____EndDeviceAssets.setName(srcDeliver__asset____EndDeviceAssets_name_prime);
		srcGroup__srcArea____SubLoadArea.setName(srcGroup__srcArea____SubLoadArea_name_prime);
		srcArea__srcGroup____LoadGroups.setName(srcArea__srcGroup____LoadGroups_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		groupToGroup__trgGroup____target.setName(groupToGroup__trgGroup____target_name_prime);
		groupToGroup__srcGroup____source.setName(groupToGroup__srcGroup____source_name_prime);
		srcConsumer__srcGroup____LoadGroup.setName(srcConsumer__srcGroup____LoadGroup_name_prime);
		srcGroup__srcConsumer____EnergyConsumers.setName(srcGroup__srcConsumer____EnergyConsumers_name_prime);
		srcDeliver__srcConsumer____EnergyConsumer.setName(srcDeliver__srcConsumer____EnergyConsumer_name_prime);
		srcConsumer__srcDeliver____ServiceDeliveryPoints
				.setName(srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime);
		return new Object[] { asset, srcGroup, trgGroup, srcArea, pair, srcDeliver, groupToGroup, srcConsumer,
				isApplicableMatch, asset__srcDeliver____ServiceDeliveryPoint, srcDeliver__asset____EndDeviceAssets,
				srcGroup__srcArea____SubLoadArea, srcArea__srcGroup____LoadGroups, pair__asset____a,
				groupToGroup__trgGroup____target, groupToGroup__srcGroup____source, srcConsumer__srcGroup____LoadGroup,
				srcGroup__srcConsumer____EnergyConsumers, srcDeliver__srcConsumer____EnergyConsumer,
				srcConsumer__srcDeliver____ServiceDeliveryPoints };
	}

	public static final Object[] pattern_SubLoadArea_2_4_solveCSP_bindingFBBBBBBBBBB(SubLoadArea _this,
			IsApplicableMatch isApplicableMatch, MeterAsset asset, ConformLoadGroup srcGroup,
			outagePreventionJointarget.ConformLoadGroup trgGroup, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea,
			MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver,
			ConformLoadGroupToConformLoadGroup groupToGroup, ConformLoad srcConsumer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, asset, srcGroup, trgGroup, srcArea,
				pair, srcDeliver, groupToGroup, srcConsumer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, asset, srcGroup, trgGroup, srcArea, pair, srcDeliver,
					groupToGroup, srcConsumer };
		}
		return null;
	}

	public static final Object[] pattern_SubLoadArea_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SubLoadArea_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(SubLoadArea _this,
			IsApplicableMatch isApplicableMatch, MeterAsset asset, ConformLoadGroup srcGroup,
			outagePreventionJointarget.ConformLoadGroup trgGroup, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea,
			MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver,
			ConformLoadGroupToConformLoadGroup groupToGroup, ConformLoad srcConsumer) {
		Object[] result_pattern_SubLoadArea_2_4_solveCSP_binding = pattern_SubLoadArea_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, asset, srcGroup, trgGroup, srcArea, pair, srcDeliver, groupToGroup,
				srcConsumer);
		if (result_pattern_SubLoadArea_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SubLoadArea_2_4_solveCSP_binding[0];

			Object[] result_pattern_SubLoadArea_2_4_solveCSP_black = pattern_SubLoadArea_2_4_solveCSP_blackB(csp);
			if (result_pattern_SubLoadArea_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, asset, srcGroup, trgGroup, srcArea, pair,
						srcDeliver, groupToGroup, srcConsumer };
			}
		}
		return null;
	}

	public static final boolean pattern_SubLoadArea_2_5_checkCSP_expressionFBB(SubLoadArea _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SubLoadArea_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SubLoadArea_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SubLoadArea";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SubLoadArea_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SubLoadArea_10_1_preparereturnvalue_bindingFB(SubLoadArea _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SubLoadArea_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			SubLoadArea _this) {
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

	public static final Object[] pattern_SubLoadArea_10_1_preparereturnvalue_bindingAndBlackFFBF(SubLoadArea _this) {
		Object[] result_pattern_SubLoadArea_10_1_preparereturnvalue_binding = pattern_SubLoadArea_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SubLoadArea_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_SubLoadArea_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SubLoadArea_10_1_preparereturnvalue_black = pattern_SubLoadArea_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_SubLoadArea_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SubLoadArea_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_SubLoadArea_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubLoadArea_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SubLoadArea_10_2_testcorematchandDECs_black_nac_0BB(
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, ConformLoadGroup srcGroup) {
		for (LoadGroup __DEC_srcArea_SubLoadArea_107359 : srcArea.getLoadGroups()) {
			if (!srcGroup.equals(__DEC_srcArea_SubLoadArea_107359)) {
				return new Object[] { srcArea, srcGroup };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SubLoadArea_10_2_testcorematchandDECs_blackFFFFFFB(
			EMoflonEdge _edge_SubLoadArea) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcGroup = _edge_SubLoadArea.getSrc();
		if (tmpSrcGroup instanceof ConformLoadGroup) {
			ConformLoadGroup srcGroup = (ConformLoadGroup) tmpSrcGroup;
			EObject tmpSrcArea = _edge_SubLoadArea.getTrg();
			if (tmpSrcArea instanceof gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) {
				gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea = (gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) tmpSrcArea;
				if (srcArea.equals(srcGroup.getSubLoadArea())) {
					if (pattern_SubLoadArea_10_2_testcorematchandDECs_black_nac_0BB(srcArea, srcGroup) == null) {
						for (ConformLoad srcConsumer : srcGroup.getEnergyConsumers()) {
							for (ServiceDeliveryPoint srcDeliver : srcConsumer.getServiceDeliveryPoints()) {
								for (EndDeviceAsset tmpAsset : srcDeliver.getEndDeviceAssets()) {
									if (tmpAsset instanceof MeterAsset) {
										MeterAsset asset = (MeterAsset) tmpAsset;
										for (MeterAssetPhysicalDevicePair pair : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(asset, MeterAssetPhysicalDevicePair.class,
														"a")) {
											_result.add(new Object[] { asset, srcGroup, srcArea, pair, srcDeliver,
													srcConsumer, _edge_SubLoadArea });
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

	public static final Object[] pattern_SubLoadArea_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SubLoadArea_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBB(
			SubLoadArea _this, Match match, MeterAsset asset, ConformLoadGroup srcGroup,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, ConformLoad srcConsumer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, asset, srcGroup, srcArea, pair, srcDeliver,
				srcConsumer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SubLoadArea_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			SubLoadArea _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SubLoadArea_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_SubLoadArea_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_SubLoadArea_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SubLoadArea_13_1_matchtggpattern_black_nac_0BB(
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, ConformLoadGroup srcGroup) {
		for (LoadGroup __DEC_srcArea_SubLoadArea_125643 : srcArea.getLoadGroups()) {
			if (!srcGroup.equals(__DEC_srcArea_SubLoadArea_125643)) {
				return new Object[] { srcArea, srcGroup };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubLoadArea_13_1_matchtggpattern_blackBBBBBB(MeterAsset asset,
			ConformLoadGroup srcGroup, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea,
			MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver, ConformLoad srcConsumer) {
		if (srcDeliver.equals(asset.getServiceDeliveryPoint())) {
			if (srcArea.equals(srcGroup.getSubLoadArea())) {
				if (asset.equals(pair.getA())) {
					if (srcGroup.equals(srcConsumer.getLoadGroup())) {
						if (srcConsumer.equals(srcDeliver.getEnergyConsumer())) {
							if (pattern_SubLoadArea_13_1_matchtggpattern_black_nac_0BB(srcArea, srcGroup) == null) {
								return new Object[] { asset, srcGroup, srcArea, pair, srcDeliver, srcConsumer };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_SubLoadArea_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SubLoadArea_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SubLoadAreaImpl
