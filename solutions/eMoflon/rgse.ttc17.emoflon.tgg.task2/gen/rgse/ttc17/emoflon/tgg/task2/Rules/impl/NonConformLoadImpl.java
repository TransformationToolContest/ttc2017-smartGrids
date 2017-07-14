/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules.impl;

import gluemodel.CIM.IEC61968.Metering.EndDeviceAsset;
import gluemodel.CIM.IEC61968.Metering.MeterAsset;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

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

import rgse.ttc17.emoflon.tgg.task2.EnergyConsumerToEnergyConsumer;

import rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad;
import rgse.ttc17.emoflon.tgg.task2.Rules.RulesPackage;

import rgse.ttc17.emoflon.tgg.task2.ServiceDeliveryPointToServiceDeliveryPoint;
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
 * An implementation of the model object '<em><b>Non Conform Load</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NonConformLoadImpl extends AbstractRuleImpl implements NonConformLoad {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonConformLoadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getNonConformLoad();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer,
			ServiceDeliveryPoint srcDeliver, MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		// initial bindings
		Object[] result1_black = NonConformLoadImpl.pattern_NonConformLoad_0_1_initialbindings_blackBBBBBB(this, match,
				srcConsumer, srcDeliver, asset, pair);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[srcConsumer] = " + srcConsumer + ", "
					+ "[srcDeliver] = " + srcDeliver + ", " + "[asset] = " + asset + ", " + "[pair] = " + pair + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = NonConformLoadImpl
				.pattern_NonConformLoad_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, srcConsumer, srcDeliver, asset,
						pair);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[srcConsumer] = " + srcConsumer + ", "
					+ "[srcDeliver] = " + srcDeliver + ", " + "[asset] = " + asset + ", " + "[pair] = " + pair + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (NonConformLoadImpl.pattern_NonConformLoad_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = NonConformLoadImpl
					.pattern_NonConformLoad_0_4_collectelementstobetranslated_blackBBBBB(match, srcConsumer, srcDeliver,
							asset, pair);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[srcConsumer] = " + srcConsumer + ", "
						+ "[srcDeliver] = " + srcDeliver + ", " + "[asset] = " + asset + ", " + "[pair] = " + pair
						+ ".");
			}
			NonConformLoadImpl.pattern_NonConformLoad_0_4_collectelementstobetranslated_greenBBBFF(match, srcConsumer,
					srcDeliver);
			// EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = (EMoflonEdge) result4_green[3];
			// EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = NonConformLoadImpl.pattern_NonConformLoad_0_5_collectcontextelements_blackBBBBB(
					match, srcConsumer, srcDeliver, asset, pair);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[srcConsumer] = " + srcConsumer + ", " + "[srcDeliver] = "
								+ srcDeliver + ", " + "[asset] = " + asset + ", " + "[pair] = " + pair + ".");
			}
			NonConformLoadImpl.pattern_NonConformLoad_0_5_collectcontextelements_greenBBBBFFF(match, srcDeliver, asset,
					pair);
			// EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = (EMoflonEdge) result5_green[4];
			// EMoflonEdge srcDeliver__asset____EndDeviceAssets = (EMoflonEdge) result5_green[5];
			// EMoflonEdge pair__asset____a = (EMoflonEdge) result5_green[6];

			// register objects to match
			NonConformLoadImpl.pattern_NonConformLoad_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					srcConsumer, srcDeliver, asset, pair);
			return NonConformLoadImpl.pattern_NonConformLoad_0_7_expressionF();
		} else {
			return NonConformLoadImpl.pattern_NonConformLoad_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = NonConformLoadImpl
				.pattern_NonConformLoad_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer = (gluemodel.CIM.IEC61970.LoadModel.NonConformLoad) result1_bindingAndBlack[0];
		ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result1_bindingAndBlack[1];
		outagePreventionJointarget.ServiceDeliveryPoint trgDeliver = (outagePreventionJointarget.ServiceDeliveryPoint) result1_bindingAndBlack[2];
		ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver = (ServiceDeliveryPointToServiceDeliveryPoint) result1_bindingAndBlack[3];
		MeterAsset asset = (MeterAsset) result1_bindingAndBlack[4];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = NonConformLoadImpl
				.pattern_NonConformLoad_1_1_performtransformation_greenBBFFB(srcConsumer, trgDeliver, csp);
		EnergyConsumerToEnergyConsumer consumerToConsumer = (EnergyConsumerToEnergyConsumer) result1_green[2];
		outagePreventionJointarget.NonConformLoad trgConsumer = (outagePreventionJointarget.NonConformLoad) result1_green[3];

		// collect translated elements
		Object[] result2_black = NonConformLoadImpl.pattern_NonConformLoad_1_2_collecttranslatedelements_blackBBB(
				srcConsumer, consumerToConsumer, trgConsumer);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[srcConsumer] = " + srcConsumer + ", " + "[consumerToConsumer] = " + consumerToConsumer + ", "
					+ "[trgConsumer] = " + trgConsumer + ".");
		}
		Object[] result2_green = NonConformLoadImpl.pattern_NonConformLoad_1_2_collecttranslatedelements_greenFBBB(
				srcConsumer, consumerToConsumer, trgConsumer);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = NonConformLoadImpl.pattern_NonConformLoad_1_3_bookkeepingforedges_blackBBBBBBBBB(
				ruleresult, srcConsumer, srcDeliver, trgDeliver, deliverToDeliver, consumerToConsumer, asset, pair,
				trgConsumer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[srcConsumer] = " + srcConsumer + ", "
					+ "[srcDeliver] = " + srcDeliver + ", " + "[trgDeliver] = " + trgDeliver + ", "
					+ "[deliverToDeliver] = " + deliverToDeliver + ", " + "[consumerToConsumer] = " + consumerToConsumer
					+ ", " + "[asset] = " + asset + ", " + "[pair] = " + pair + ", " + "[trgConsumer] = " + trgConsumer
					+ ".");
		}
		NonConformLoadImpl.pattern_NonConformLoad_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, srcConsumer,
				srcDeliver, trgDeliver, consumerToConsumer, trgConsumer);
		// EMoflonEdge consumerToConsumer__srcConsumer____source = (EMoflonEdge) result3_green[6];
		// EMoflonEdge consumerToConsumer__trgConsumer____target = (EMoflonEdge) result3_green[7];
		// EMoflonEdge trgDeliver__trgConsumer____EnergyConsumer = (EMoflonEdge) result3_green[8];
		// EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = (EMoflonEdge) result3_green[9];
		// EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		NonConformLoadImpl.pattern_NonConformLoad_1_5_registerobjects_expressionBBBBBBBBBB(this, ruleresult,
				srcConsumer, srcDeliver, trgDeliver, deliverToDeliver, consumerToConsumer, asset, pair, trgConsumer);
		return NonConformLoadImpl.pattern_NonConformLoad_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = NonConformLoadImpl
				.pattern_NonConformLoad_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = NonConformLoadImpl
				.pattern_NonConformLoad_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = NonConformLoadImpl.pattern_NonConformLoad_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer = (gluemodel.CIM.IEC61970.LoadModel.NonConformLoad) result2_binding[0];
		ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result2_binding[1];
		MeterAsset asset = (MeterAsset) result2_binding[2];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_binding[3];
		for (Object[] result2_black : NonConformLoadImpl.pattern_NonConformLoad_2_2_corematch_blackBBFFBBB(srcConsumer,
				srcDeliver, asset, pair, match)) {
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver = (outagePreventionJointarget.ServiceDeliveryPoint) result2_black[2];
			ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver = (ServiceDeliveryPointToServiceDeliveryPoint) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : NonConformLoadImpl.pattern_NonConformLoad_2_3_findcontext_blackBBBBBB(
					srcConsumer, srcDeliver, trgDeliver, deliverToDeliver, asset, pair)) {
				Object[] result3_green = NonConformLoadImpl.pattern_NonConformLoad_2_3_findcontext_greenBBBBBBFFFFFFFF(
						srcConsumer, srcDeliver, trgDeliver, deliverToDeliver, asset, pair);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge deliverToDeliver__srcDeliver____source = (EMoflonEdge) result3_green[7];
				// EMoflonEdge deliverToDeliver__trgDeliver____target = (EMoflonEdge) result3_green[8];
				// EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = (EMoflonEdge) result3_green[9];
				// EMoflonEdge srcDeliver__asset____EndDeviceAssets = (EMoflonEdge) result3_green[10];
				// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[11];
				// EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = (EMoflonEdge) result3_green[12];
				// EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = (EMoflonEdge) result3_green[13];

				// solve CSP
				Object[] result4_bindingAndBlack = NonConformLoadImpl
						.pattern_NonConformLoad_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								srcConsumer, srcDeliver, trgDeliver, deliverToDeliver, asset, pair);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[srcConsumer] = " + srcConsumer + ", " + "[srcDeliver] = " + srcDeliver + ", "
							+ "[trgDeliver] = " + trgDeliver + ", " + "[deliverToDeliver] = " + deliverToDeliver + ", "
							+ "[asset] = " + asset + ", " + "[pair] = " + pair + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (NonConformLoadImpl.pattern_NonConformLoad_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = NonConformLoadImpl
							.pattern_NonConformLoad_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					NonConformLoadImpl.pattern_NonConformLoad_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return NonConformLoadImpl.pattern_NonConformLoad_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer,
			ServiceDeliveryPoint srcDeliver, MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		match.registerObject("srcConsumer", srcConsumer);
		match.registerObject("srcDeliver", srcDeliver);
		match.registerObject("asset", asset);
		match.registerObject("pair", pair);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer,
			ServiceDeliveryPoint srcDeliver, MeterAsset asset, MeterAssetPhysicalDevicePair pair) {// Create CSP
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
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer, ServiceDeliveryPoint srcDeliver,
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver,
			ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_srcConsumer_mRID = CSPFactoryHelper.eINSTANCE.createVariable("srcConsumer.mRID", true, csp);
		var_srcConsumer_mRID.setValue(srcConsumer.getMRID());
		var_srcConsumer_mRID.setType("String");

		// Create unbound variables
		Variable var_trgConsumer_mRID = CSPFactoryHelper.eINSTANCE.createVariable("trgConsumer.mRID", csp);
		var_trgConsumer_mRID.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_srcConsumer_mRID, var_trgConsumer_mRID);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("srcConsumer", srcConsumer);
		isApplicableMatch.registerObject("srcDeliver", srcDeliver);
		isApplicableMatch.registerObject("trgDeliver", trgDeliver);
		isApplicableMatch.registerObject("deliverToDeliver", deliverToDeliver);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject srcConsumer, EObject srcDeliver,
			EObject trgDeliver, EObject deliverToDeliver, EObject consumerToConsumer, EObject asset, EObject pair,
			EObject trgConsumer) {
		ruleresult.registerObject("srcConsumer", srcConsumer);
		ruleresult.registerObject("srcDeliver", srcDeliver);
		ruleresult.registerObject("trgDeliver", trgDeliver);
		ruleresult.registerObject("deliverToDeliver", deliverToDeliver);
		ruleresult.registerObject("consumerToConsumer", consumerToConsumer);
		ruleresult.registerObject("asset", asset);
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("trgConsumer", trgConsumer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("srcConsumer").eClass())
				.equals("gluemodel.CIM.IEC61970.LoadModel.NonConformLoad.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_15(EMoflonEdge _edge_EnergyConsumer) {
		// prepare return value
		Object[] result1_bindingAndBlack = NonConformLoadImpl
				.pattern_NonConformLoad_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = NonConformLoadImpl.pattern_NonConformLoad_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : NonConformLoadImpl
				.pattern_NonConformLoad_10_2_testcorematchandDECs_blackFFFFB(_edge_EnergyConsumer)) {
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer = (gluemodel.CIM.IEC61970.LoadModel.NonConformLoad) result2_black[0];
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result2_black[1];
			MeterAsset asset = (MeterAsset) result2_black[2];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_black[3];
			Object[] result2_green = NonConformLoadImpl
					.pattern_NonConformLoad_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (NonConformLoadImpl
					.pattern_NonConformLoad_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, srcConsumer, srcDeliver, asset, pair)) {
				// Ensure that the correct types of elements are matched
				if (NonConformLoadImpl
						.pattern_NonConformLoad_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = NonConformLoadImpl
							.pattern_NonConformLoad_10_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					NonConformLoadImpl.pattern_NonConformLoad_10_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return NonConformLoadImpl.pattern_NonConformLoad_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("NonConformLoad");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_srcConsumer_mRID = CSPFactoryHelper.eINSTANCE.createVariable("srcConsumer", true, csp);
		var_srcConsumer_mRID.setValue(__helper.getValue("srcConsumer", "mRID"));
		var_srcConsumer_mRID.setType("String");

		Variable var_trgConsumer_mRID = CSPFactoryHelper.eINSTANCE.createVariable("trgConsumer", true, csp);
		var_trgConsumer_mRID.setValue(__helper.getValue("trgConsumer", "mRID"));
		var_trgConsumer_mRID.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("NonConformLoad");
		eq0.solve(var_srcConsumer_mRID, var_trgConsumer_mRID);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_trgConsumer_mRID.setBound(false);
			eq0.solve(var_srcConsumer_mRID, var_trgConsumer_mRID);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("trgConsumer", "mRID", var_trgConsumer_mRID.getValue());
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
	public boolean checkDEC_FWD(gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer,
			ServiceDeliveryPoint srcDeliver, MeterAsset asset, MeterAssetPhysicalDevicePair pair) {// match tgg pattern
		Object[] result1_black = NonConformLoadImpl.pattern_NonConformLoad_13_1_matchtggpattern_blackBBBB(srcConsumer,
				srcDeliver, asset, pair);
		if (result1_black != null) {
			return NonConformLoadImpl.pattern_NonConformLoad_13_2_expressionF();
		} else {
			return NonConformLoadImpl.pattern_NonConformLoad_13_3_expressionF();
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
		case RulesPackage.NON_CONFORM_LOAD___IS_APPROPRIATE_FWD__MATCH_NONCONFORMLOAD_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR:
			return isAppropriate_FWD((Match) arguments.get(0),
					(gluemodel.CIM.IEC61970.LoadModel.NonConformLoad) arguments.get(1),
					(ServiceDeliveryPoint) arguments.get(2), (MeterAsset) arguments.get(3),
					(MeterAssetPhysicalDevicePair) arguments.get(4));
		case RulesPackage.NON_CONFORM_LOAD___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.NON_CONFORM_LOAD___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.NON_CONFORM_LOAD___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_NONCONFORMLOAD_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(gluemodel.CIM.IEC61970.LoadModel.NonConformLoad) arguments.get(1),
					(ServiceDeliveryPoint) arguments.get(2), (MeterAsset) arguments.get(3),
					(MeterAssetPhysicalDevicePair) arguments.get(4));
			return null;
		case RulesPackage.NON_CONFORM_LOAD___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_NONCONFORMLOAD_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(gluemodel.CIM.IEC61970.LoadModel.NonConformLoad) arguments.get(1),
					(ServiceDeliveryPoint) arguments.get(2), (MeterAsset) arguments.get(3),
					(MeterAssetPhysicalDevicePair) arguments.get(4));
		case RulesPackage.NON_CONFORM_LOAD___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.NON_CONFORM_LOAD___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_NONCONFORMLOAD_SERVICEDELIVERYPOINT_SERVICEDELIVERYPOINT_SERVICEDELIVERYPOINTTOSERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(gluemodel.CIM.IEC61970.LoadModel.NonConformLoad) arguments.get(1),
					(ServiceDeliveryPoint) arguments.get(2),
					(outagePreventionJointarget.ServiceDeliveryPoint) arguments.get(3),
					(ServiceDeliveryPointToServiceDeliveryPoint) arguments.get(4), (MeterAsset) arguments.get(5),
					(MeterAssetPhysicalDevicePair) arguments.get(6));
		case RulesPackage.NON_CONFORM_LOAD___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.NON_CONFORM_LOAD___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.NON_CONFORM_LOAD___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.NON_CONFORM_LOAD___IS_APPROPRIATE_FWD_EMOFLON_EDGE_15__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_15((EMoflonEdge) arguments.get(0));
		case RulesPackage.NON_CONFORM_LOAD___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.NON_CONFORM_LOAD___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.NON_CONFORM_LOAD___CHECK_DEC_FWD__NONCONFORMLOAD_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR:
			return checkDEC_FWD((gluemodel.CIM.IEC61970.LoadModel.NonConformLoad) arguments.get(0),
					(ServiceDeliveryPoint) arguments.get(1), (MeterAsset) arguments.get(2),
					(MeterAssetPhysicalDevicePair) arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_NonConformLoad_0_1_initialbindings_blackBBBBBB(NonConformLoad _this,
			Match match, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer, ServiceDeliveryPoint srcDeliver,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		return new Object[] { _this, match, srcConsumer, srcDeliver, asset, pair };
	}

	public static final Object[] pattern_NonConformLoad_0_2_SolveCSP_bindingFBBBBBB(NonConformLoad _this, Match match,
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer, ServiceDeliveryPoint srcDeliver,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcConsumer, srcDeliver, asset, pair);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcConsumer, srcDeliver, asset, pair };
		}
		return null;
	}

	public static final Object[] pattern_NonConformLoad_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NonConformLoad_0_2_SolveCSP_bindingAndBlackFBBBBBB(NonConformLoad _this,
			Match match, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer, ServiceDeliveryPoint srcDeliver,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		Object[] result_pattern_NonConformLoad_0_2_SolveCSP_binding = pattern_NonConformLoad_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, srcConsumer, srcDeliver, asset, pair);
		if (result_pattern_NonConformLoad_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_NonConformLoad_0_2_SolveCSP_binding[0];

			Object[] result_pattern_NonConformLoad_0_2_SolveCSP_black = pattern_NonConformLoad_0_2_SolveCSP_blackB(csp);
			if (result_pattern_NonConformLoad_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcConsumer, srcDeliver, asset, pair };
			}
		}
		return null;
	}

	public static final boolean pattern_NonConformLoad_0_3_CheckCSP_expressionFBB(NonConformLoad _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NonConformLoad_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer, ServiceDeliveryPoint srcDeliver,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		return new Object[] { match, srcConsumer, srcDeliver, asset, pair };
	}

	public static final Object[] pattern_NonConformLoad_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer, ServiceDeliveryPoint srcDeliver) {
		EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(srcConsumer);
		String srcDeliver__srcConsumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime = "ServiceDeliveryPoints";
		srcDeliver__srcConsumer____EnergyConsumer.setSrc(srcDeliver);
		srcDeliver__srcConsumer____EnergyConsumer.setTrg(srcConsumer);
		match.getToBeTranslatedEdges().add(srcDeliver__srcConsumer____EnergyConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setSrc(srcConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setTrg(srcDeliver);
		match.getToBeTranslatedEdges().add(srcConsumer__srcDeliver____ServiceDeliveryPoints);
		srcDeliver__srcConsumer____EnergyConsumer.setName(srcDeliver__srcConsumer____EnergyConsumer_name_prime);
		srcConsumer__srcDeliver____ServiceDeliveryPoints
				.setName(srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime);
		return new Object[] { match, srcConsumer, srcDeliver, srcDeliver__srcConsumer____EnergyConsumer,
				srcConsumer__srcDeliver____ServiceDeliveryPoints };
	}

	public static final Object[] pattern_NonConformLoad_0_5_collectcontextelements_blackBBBBB(Match match,
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer, ServiceDeliveryPoint srcDeliver,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		return new Object[] { match, srcConsumer, srcDeliver, asset, pair };
	}

	public static final Object[] pattern_NonConformLoad_0_5_collectcontextelements_greenBBBBFFF(Match match,
			ServiceDeliveryPoint srcDeliver, MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(srcDeliver);
		match.getContextNodes().add(asset);
		match.getContextNodes().add(pair);
		String asset__srcDeliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String srcDeliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		String pair__asset____a_name_prime = "a";
		asset__srcDeliver____ServiceDeliveryPoint.setSrc(asset);
		asset__srcDeliver____ServiceDeliveryPoint.setTrg(srcDeliver);
		match.getContextEdges().add(asset__srcDeliver____ServiceDeliveryPoint);
		srcDeliver__asset____EndDeviceAssets.setSrc(srcDeliver);
		srcDeliver__asset____EndDeviceAssets.setTrg(asset);
		match.getContextEdges().add(srcDeliver__asset____EndDeviceAssets);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		match.getContextEdges().add(pair__asset____a);
		asset__srcDeliver____ServiceDeliveryPoint.setName(asset__srcDeliver____ServiceDeliveryPoint_name_prime);
		srcDeliver__asset____EndDeviceAssets.setName(srcDeliver__asset____EndDeviceAssets_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		return new Object[] { match, srcDeliver, asset, pair, asset__srcDeliver____ServiceDeliveryPoint,
				srcDeliver__asset____EndDeviceAssets, pair__asset____a };
	}

	public static final void pattern_NonConformLoad_0_6_registerobjectstomatch_expressionBBBBBB(NonConformLoad _this,
			Match match, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer, ServiceDeliveryPoint srcDeliver,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		_this.registerObjectsToMatch_FWD(match, srcConsumer, srcDeliver, asset, pair);

	}

	public static final boolean pattern_NonConformLoad_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_NonConformLoad_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_NonConformLoad_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("srcConsumer");
		EObject _localVariable_1 = isApplicableMatch.getObject("srcDeliver");
		EObject _localVariable_2 = isApplicableMatch.getObject("trgDeliver");
		EObject _localVariable_3 = isApplicableMatch.getObject("deliverToDeliver");
		EObject _localVariable_4 = isApplicableMatch.getObject("asset");
		EObject _localVariable_5 = isApplicableMatch.getObject("pair");
		EObject tmpSrcConsumer = _localVariable_0;
		EObject tmpSrcDeliver = _localVariable_1;
		EObject tmpTrgDeliver = _localVariable_2;
		EObject tmpDeliverToDeliver = _localVariable_3;
		EObject tmpAsset = _localVariable_4;
		EObject tmpPair = _localVariable_5;
		if (tmpSrcConsumer instanceof gluemodel.CIM.IEC61970.LoadModel.NonConformLoad) {
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer = (gluemodel.CIM.IEC61970.LoadModel.NonConformLoad) tmpSrcConsumer;
			if (tmpSrcDeliver instanceof ServiceDeliveryPoint) {
				ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) tmpSrcDeliver;
				if (tmpTrgDeliver instanceof outagePreventionJointarget.ServiceDeliveryPoint) {
					outagePreventionJointarget.ServiceDeliveryPoint trgDeliver = (outagePreventionJointarget.ServiceDeliveryPoint) tmpTrgDeliver;
					if (tmpDeliverToDeliver instanceof ServiceDeliveryPointToServiceDeliveryPoint) {
						ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver = (ServiceDeliveryPointToServiceDeliveryPoint) tmpDeliverToDeliver;
						if (tmpAsset instanceof MeterAsset) {
							MeterAsset asset = (MeterAsset) tmpAsset;
							if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
								MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
								return new Object[] { srcConsumer, srcDeliver, trgDeliver, deliverToDeliver, asset,
										pair, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_NonConformLoad_1_1_performtransformation_blackBBBBBBFBB(
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer, ServiceDeliveryPoint srcDeliver,
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver,
			ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair, NonConformLoad _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { srcConsumer, srcDeliver, trgDeliver, deliverToDeliver, asset, pair, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_NonConformLoad_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			NonConformLoad _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_NonConformLoad_1_1_performtransformation_binding = pattern_NonConformLoad_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_NonConformLoad_1_1_performtransformation_binding != null) {
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer = (gluemodel.CIM.IEC61970.LoadModel.NonConformLoad) result_pattern_NonConformLoad_1_1_performtransformation_binding[0];
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result_pattern_NonConformLoad_1_1_performtransformation_binding[1];
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver = (outagePreventionJointarget.ServiceDeliveryPoint) result_pattern_NonConformLoad_1_1_performtransformation_binding[2];
			ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver = (ServiceDeliveryPointToServiceDeliveryPoint) result_pattern_NonConformLoad_1_1_performtransformation_binding[3];
			MeterAsset asset = (MeterAsset) result_pattern_NonConformLoad_1_1_performtransformation_binding[4];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result_pattern_NonConformLoad_1_1_performtransformation_binding[5];

			Object[] result_pattern_NonConformLoad_1_1_performtransformation_black = pattern_NonConformLoad_1_1_performtransformation_blackBBBBBBFBB(
					srcConsumer, srcDeliver, trgDeliver, deliverToDeliver, asset, pair, _this, isApplicableMatch);
			if (result_pattern_NonConformLoad_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_NonConformLoad_1_1_performtransformation_black[6];

				return new Object[] { srcConsumer, srcDeliver, trgDeliver, deliverToDeliver, asset, pair, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_NonConformLoad_1_1_performtransformation_greenBBFFB(
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer,
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver, CSP csp) {
		EnergyConsumerToEnergyConsumer consumerToConsumer = Task2Factory.eINSTANCE
				.createEnergyConsumerToEnergyConsumer();
		outagePreventionJointarget.NonConformLoad trgConsumer = OutagePreventionJointargetFactory.eINSTANCE
				.createNonConformLoad();
		Object _localVariable_0 = csp.getValue("trgConsumer", "mRID");
		consumerToConsumer.setSource(srcConsumer);
		consumerToConsumer.setTarget(trgConsumer);
		trgDeliver.setEnergyConsumer(trgConsumer);
		String trgConsumer_mRID_prime = (String) _localVariable_0;
		trgConsumer.setMRID(trgConsumer_mRID_prime);
		return new Object[] { srcConsumer, trgDeliver, consumerToConsumer, trgConsumer, csp };
	}

	public static final Object[] pattern_NonConformLoad_1_2_collecttranslatedelements_blackBBB(
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer,
			EnergyConsumerToEnergyConsumer consumerToConsumer, outagePreventionJointarget.NonConformLoad trgConsumer) {
		return new Object[] { srcConsumer, consumerToConsumer, trgConsumer };
	}

	public static final Object[] pattern_NonConformLoad_1_2_collecttranslatedelements_greenFBBB(
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer,
			EnergyConsumerToEnergyConsumer consumerToConsumer, outagePreventionJointarget.NonConformLoad trgConsumer) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(srcConsumer);
		ruleresult.getCreatedLinkElements().add(consumerToConsumer);
		ruleresult.getCreatedElements().add(trgConsumer);
		return new Object[] { ruleresult, srcConsumer, consumerToConsumer, trgConsumer };
	}

	public static final Object[] pattern_NonConformLoad_1_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject srcConsumer, EObject srcDeliver, EObject trgDeliver,
			EObject deliverToDeliver, EObject consumerToConsumer, EObject asset, EObject pair, EObject trgConsumer) {
		if (!srcConsumer.equals(srcDeliver)) {
			if (!srcConsumer.equals(trgDeliver)) {
				if (!srcConsumer.equals(trgConsumer)) {
					if (!srcDeliver.equals(trgDeliver)) {
						if (!srcDeliver.equals(trgConsumer)) {
							if (!deliverToDeliver.equals(srcConsumer)) {
								if (!deliverToDeliver.equals(srcDeliver)) {
									if (!deliverToDeliver.equals(trgDeliver)) {
										if (!deliverToDeliver.equals(pair)) {
											if (!deliverToDeliver.equals(trgConsumer)) {
												if (!consumerToConsumer.equals(srcConsumer)) {
													if (!consumerToConsumer.equals(srcDeliver)) {
														if (!consumerToConsumer.equals(trgDeliver)) {
															if (!consumerToConsumer.equals(deliverToDeliver)) {
																if (!consumerToConsumer.equals(pair)) {
																	if (!consumerToConsumer.equals(trgConsumer)) {
																		if (!asset.equals(srcConsumer)) {
																			if (!asset.equals(srcDeliver)) {
																				if (!asset.equals(trgDeliver)) {
																					if (!asset
																							.equals(deliverToDeliver)) {
																						if (!asset.equals(
																								consumerToConsumer)) {
																							if (!asset.equals(pair)) {
																								if (!asset.equals(
																										trgConsumer)) {
																									if (!pair.equals(
																											srcConsumer)) {
																										if (!pair
																												.equals(srcDeliver)) {
																											if (!pair
																													.equals(trgDeliver)) {
																												if (!pair
																														.equals(trgConsumer)) {
																													if (!trgConsumer
																															.equals(trgDeliver)) {
																														return new Object[] {
																																ruleresult,
																																srcConsumer,
																																srcDeliver,
																																trgDeliver,
																																deliverToDeliver,
																																consumerToConsumer,
																																asset,
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
		return null;
	}

	public static final Object[] pattern_NonConformLoad_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject srcConsumer, EObject srcDeliver, EObject trgDeliver,
			EObject consumerToConsumer, EObject trgConsumer) {
		EMoflonEdge consumerToConsumer__srcConsumer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge consumerToConsumer__trgConsumer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgDeliver__trgConsumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "NonConformLoad";
		String consumerToConsumer__srcConsumer____source_name_prime = "source";
		String consumerToConsumer__trgConsumer____target_name_prime = "target";
		String trgDeliver__trgConsumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String srcDeliver__srcConsumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime = "ServiceDeliveryPoints";
		consumerToConsumer__srcConsumer____source.setSrc(consumerToConsumer);
		consumerToConsumer__srcConsumer____source.setTrg(srcConsumer);
		ruleresult.getCreatedEdges().add(consumerToConsumer__srcConsumer____source);
		consumerToConsumer__trgConsumer____target.setSrc(consumerToConsumer);
		consumerToConsumer__trgConsumer____target.setTrg(trgConsumer);
		ruleresult.getCreatedEdges().add(consumerToConsumer__trgConsumer____target);
		trgDeliver__trgConsumer____EnergyConsumer.setSrc(trgDeliver);
		trgDeliver__trgConsumer____EnergyConsumer.setTrg(trgConsumer);
		ruleresult.getCreatedEdges().add(trgDeliver__trgConsumer____EnergyConsumer);
		srcDeliver__srcConsumer____EnergyConsumer.setSrc(srcDeliver);
		srcDeliver__srcConsumer____EnergyConsumer.setTrg(srcConsumer);
		ruleresult.getTranslatedEdges().add(srcDeliver__srcConsumer____EnergyConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setSrc(srcConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setTrg(srcDeliver);
		ruleresult.getTranslatedEdges().add(srcConsumer__srcDeliver____ServiceDeliveryPoints);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		consumerToConsumer__srcConsumer____source.setName(consumerToConsumer__srcConsumer____source_name_prime);
		consumerToConsumer__trgConsumer____target.setName(consumerToConsumer__trgConsumer____target_name_prime);
		trgDeliver__trgConsumer____EnergyConsumer.setName(trgDeliver__trgConsumer____EnergyConsumer_name_prime);
		srcDeliver__srcConsumer____EnergyConsumer.setName(srcDeliver__srcConsumer____EnergyConsumer_name_prime);
		srcConsumer__srcDeliver____ServiceDeliveryPoints
				.setName(srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime);
		return new Object[] { ruleresult, srcConsumer, srcDeliver, trgDeliver, consumerToConsumer, trgConsumer,
				consumerToConsumer__srcConsumer____source, consumerToConsumer__trgConsumer____target,
				trgDeliver__trgConsumer____EnergyConsumer, srcDeliver__srcConsumer____EnergyConsumer,
				srcConsumer__srcDeliver____ServiceDeliveryPoints };
	}

	public static final void pattern_NonConformLoad_1_5_registerobjects_expressionBBBBBBBBBB(NonConformLoad _this,
			PerformRuleResult ruleresult, EObject srcConsumer, EObject srcDeliver, EObject trgDeliver,
			EObject deliverToDeliver, EObject consumerToConsumer, EObject asset, EObject pair, EObject trgConsumer) {
		_this.registerObjects_FWD(ruleresult, srcConsumer, srcDeliver, trgDeliver, deliverToDeliver, consumerToConsumer,
				asset, pair, trgConsumer);

	}

	public static final PerformRuleResult pattern_NonConformLoad_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_NonConformLoad_2_1_preparereturnvalue_bindingFB(NonConformLoad _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_NonConformLoad_2_1_preparereturnvalue_blackFBB(EClass eClass,
			NonConformLoad _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_NonConformLoad_2_1_preparereturnvalue_bindingAndBlackFFB(
			NonConformLoad _this) {
		Object[] result_pattern_NonConformLoad_2_1_preparereturnvalue_binding = pattern_NonConformLoad_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_NonConformLoad_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_NonConformLoad_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_NonConformLoad_2_1_preparereturnvalue_black = pattern_NonConformLoad_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_NonConformLoad_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_NonConformLoad_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_NonConformLoad_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "NonConformLoad";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_NonConformLoad_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("srcConsumer");
		EObject _localVariable_1 = match.getObject("srcDeliver");
		EObject _localVariable_2 = match.getObject("asset");
		EObject _localVariable_3 = match.getObject("pair");
		EObject tmpSrcConsumer = _localVariable_0;
		EObject tmpSrcDeliver = _localVariable_1;
		EObject tmpAsset = _localVariable_2;
		EObject tmpPair = _localVariable_3;
		if (tmpSrcConsumer instanceof gluemodel.CIM.IEC61970.LoadModel.NonConformLoad) {
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer = (gluemodel.CIM.IEC61970.LoadModel.NonConformLoad) tmpSrcConsumer;
			if (tmpSrcDeliver instanceof ServiceDeliveryPoint) {
				ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) tmpSrcDeliver;
				if (tmpAsset instanceof MeterAsset) {
					MeterAsset asset = (MeterAsset) tmpAsset;
					if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
						MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
						return new Object[] { srcConsumer, srcDeliver, asset, pair, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_NonConformLoad_2_2_corematch_blackBBFFBBB(
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer, ServiceDeliveryPoint srcDeliver,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcDeliver, ServiceDeliveryPointToServiceDeliveryPoint.class, "source")) {
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver = deliverToDeliver.getTarget();
			if (trgDeliver != null) {
				_result.add(new Object[] { srcConsumer, srcDeliver, trgDeliver, deliverToDeliver, asset, pair, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_NonConformLoad_2_3_findcontext_blackBBBBBB(
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer, ServiceDeliveryPoint srcDeliver,
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver,
			ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (srcDeliver.equals(deliverToDeliver.getSource())) {
			if (trgDeliver.equals(deliverToDeliver.getTarget())) {
				if (srcDeliver.equals(asset.getServiceDeliveryPoint())) {
					if (asset.equals(pair.getA())) {
						if (srcConsumer.equals(srcDeliver.getEnergyConsumer())) {
							_result.add(new Object[] { srcConsumer, srcDeliver, trgDeliver, deliverToDeliver, asset,
									pair });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_NonConformLoad_2_3_findcontext_greenBBBBBBFFFFFFFF(
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer, ServiceDeliveryPoint srcDeliver,
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver,
			ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge deliverToDeliver__srcDeliver____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge deliverToDeliver__trgDeliver____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String deliverToDeliver__srcDeliver____source_name_prime = "source";
		String deliverToDeliver__trgDeliver____target_name_prime = "target";
		String asset__srcDeliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String srcDeliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		String pair__asset____a_name_prime = "a";
		String srcDeliver__srcConsumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime = "ServiceDeliveryPoints";
		isApplicableMatch.getAllContextElements().add(srcConsumer);
		isApplicableMatch.getAllContextElements().add(srcDeliver);
		isApplicableMatch.getAllContextElements().add(trgDeliver);
		isApplicableMatch.getAllContextElements().add(deliverToDeliver);
		isApplicableMatch.getAllContextElements().add(asset);
		isApplicableMatch.getAllContextElements().add(pair);
		deliverToDeliver__srcDeliver____source.setSrc(deliverToDeliver);
		deliverToDeliver__srcDeliver____source.setTrg(srcDeliver);
		isApplicableMatch.getAllContextElements().add(deliverToDeliver__srcDeliver____source);
		deliverToDeliver__trgDeliver____target.setSrc(deliverToDeliver);
		deliverToDeliver__trgDeliver____target.setTrg(trgDeliver);
		isApplicableMatch.getAllContextElements().add(deliverToDeliver__trgDeliver____target);
		asset__srcDeliver____ServiceDeliveryPoint.setSrc(asset);
		asset__srcDeliver____ServiceDeliveryPoint.setTrg(srcDeliver);
		isApplicableMatch.getAllContextElements().add(asset__srcDeliver____ServiceDeliveryPoint);
		srcDeliver__asset____EndDeviceAssets.setSrc(srcDeliver);
		srcDeliver__asset____EndDeviceAssets.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(srcDeliver__asset____EndDeviceAssets);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(pair__asset____a);
		srcDeliver__srcConsumer____EnergyConsumer.setSrc(srcDeliver);
		srcDeliver__srcConsumer____EnergyConsumer.setTrg(srcConsumer);
		isApplicableMatch.getAllContextElements().add(srcDeliver__srcConsumer____EnergyConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setSrc(srcConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setTrg(srcDeliver);
		isApplicableMatch.getAllContextElements().add(srcConsumer__srcDeliver____ServiceDeliveryPoints);
		deliverToDeliver__srcDeliver____source.setName(deliverToDeliver__srcDeliver____source_name_prime);
		deliverToDeliver__trgDeliver____target.setName(deliverToDeliver__trgDeliver____target_name_prime);
		asset__srcDeliver____ServiceDeliveryPoint.setName(asset__srcDeliver____ServiceDeliveryPoint_name_prime);
		srcDeliver__asset____EndDeviceAssets.setName(srcDeliver__asset____EndDeviceAssets_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		srcDeliver__srcConsumer____EnergyConsumer.setName(srcDeliver__srcConsumer____EnergyConsumer_name_prime);
		srcConsumer__srcDeliver____ServiceDeliveryPoints
				.setName(srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime);
		return new Object[] { srcConsumer, srcDeliver, trgDeliver, deliverToDeliver, asset, pair, isApplicableMatch,
				deliverToDeliver__srcDeliver____source, deliverToDeliver__trgDeliver____target,
				asset__srcDeliver____ServiceDeliveryPoint, srcDeliver__asset____EndDeviceAssets, pair__asset____a,
				srcDeliver__srcConsumer____EnergyConsumer, srcConsumer__srcDeliver____ServiceDeliveryPoints };
	}

	public static final Object[] pattern_NonConformLoad_2_4_solveCSP_bindingFBBBBBBBB(NonConformLoad _this,
			IsApplicableMatch isApplicableMatch, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer,
			ServiceDeliveryPoint srcDeliver, outagePreventionJointarget.ServiceDeliveryPoint trgDeliver,
			ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, srcConsumer, srcDeliver, trgDeliver,
				deliverToDeliver, asset, pair);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, srcConsumer, srcDeliver, trgDeliver, deliverToDeliver,
					asset, pair };
		}
		return null;
	}

	public static final Object[] pattern_NonConformLoad_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NonConformLoad_2_4_solveCSP_bindingAndBlackFBBBBBBBB(NonConformLoad _this,
			IsApplicableMatch isApplicableMatch, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer,
			ServiceDeliveryPoint srcDeliver, outagePreventionJointarget.ServiceDeliveryPoint trgDeliver,
			ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair) {
		Object[] result_pattern_NonConformLoad_2_4_solveCSP_binding = pattern_NonConformLoad_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, srcConsumer, srcDeliver, trgDeliver, deliverToDeliver, asset, pair);
		if (result_pattern_NonConformLoad_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_NonConformLoad_2_4_solveCSP_binding[0];

			Object[] result_pattern_NonConformLoad_2_4_solveCSP_black = pattern_NonConformLoad_2_4_solveCSP_blackB(csp);
			if (result_pattern_NonConformLoad_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, srcConsumer, srcDeliver, trgDeliver,
						deliverToDeliver, asset, pair };
			}
		}
		return null;
	}

	public static final boolean pattern_NonConformLoad_2_5_checkCSP_expressionFBB(NonConformLoad _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NonConformLoad_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_NonConformLoad_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "NonConformLoad";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_NonConformLoad_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_NonConformLoad_10_1_preparereturnvalue_bindingFB(NonConformLoad _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_NonConformLoad_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			NonConformLoad _this) {
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

	public static final Object[] pattern_NonConformLoad_10_1_preparereturnvalue_bindingAndBlackFFBF(
			NonConformLoad _this) {
		Object[] result_pattern_NonConformLoad_10_1_preparereturnvalue_binding = pattern_NonConformLoad_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_NonConformLoad_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_NonConformLoad_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_NonConformLoad_10_1_preparereturnvalue_black = pattern_NonConformLoad_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_NonConformLoad_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_NonConformLoad_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_NonConformLoad_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_NonConformLoad_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_NonConformLoad_10_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_EnergyConsumer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcDeliver = _edge_EnergyConsumer.getSrc();
		if (tmpSrcDeliver instanceof ServiceDeliveryPoint) {
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) tmpSrcDeliver;
			EObject tmpSrcConsumer = _edge_EnergyConsumer.getTrg();
			if (tmpSrcConsumer instanceof gluemodel.CIM.IEC61970.LoadModel.NonConformLoad) {
				gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer = (gluemodel.CIM.IEC61970.LoadModel.NonConformLoad) tmpSrcConsumer;
				if (srcConsumer.equals(srcDeliver.getEnergyConsumer())) {
					for (EndDeviceAsset tmpAsset : srcDeliver.getEndDeviceAssets()) {
						if (tmpAsset instanceof MeterAsset) {
							MeterAsset asset = (MeterAsset) tmpAsset;
							for (MeterAssetPhysicalDevicePair pair : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(asset, MeterAssetPhysicalDevicePair.class, "a")) {
								_result.add(
										new Object[] { srcConsumer, srcDeliver, asset, pair, _edge_EnergyConsumer });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_NonConformLoad_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_NonConformLoad_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			NonConformLoad _this, Match match, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer,
			ServiceDeliveryPoint srcDeliver, MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcConsumer, srcDeliver, asset, pair);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_NonConformLoad_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			NonConformLoad _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NonConformLoad_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_NonConformLoad_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_NonConformLoad_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_NonConformLoad_13_1_matchtggpattern_blackBBBB(
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoad srcConsumer, ServiceDeliveryPoint srcDeliver,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair) {
		if (srcDeliver.equals(asset.getServiceDeliveryPoint())) {
			if (asset.equals(pair.getA())) {
				if (srcConsumer.equals(srcDeliver.getEnergyConsumer())) {
					return new Object[] { srcConsumer, srcDeliver, asset, pair };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_NonConformLoad_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_NonConformLoad_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //NonConformLoadImpl
