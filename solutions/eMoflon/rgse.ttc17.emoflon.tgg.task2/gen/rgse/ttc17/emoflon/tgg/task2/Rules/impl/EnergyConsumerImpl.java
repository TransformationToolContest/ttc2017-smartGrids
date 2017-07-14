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

import rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer;
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
 * An implementation of the model object '<em><b>Energy Consumer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EnergyConsumerImpl extends AbstractRuleImpl implements EnergyConsumer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnergyConsumerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getEnergyConsumer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer,
			MeterAsset asset, ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair) {
		// initial bindings
		Object[] result1_black = EnergyConsumerImpl.pattern_EnergyConsumer_0_1_initialbindings_blackBBBBBB(this, match,
				srcConsumer, asset, srcDeliver, pair);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[srcConsumer] = " + srcConsumer + ", "
					+ "[asset] = " + asset + ", " + "[srcDeliver] = " + srcDeliver + ", " + "[pair] = " + pair + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = EnergyConsumerImpl
				.pattern_EnergyConsumer_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, srcConsumer, asset, srcDeliver,
						pair);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[srcConsumer] = " + srcConsumer + ", " + "[asset] = "
					+ asset + ", " + "[srcDeliver] = " + srcDeliver + ", " + "[pair] = " + pair + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (EnergyConsumerImpl.pattern_EnergyConsumer_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = EnergyConsumerImpl
					.pattern_EnergyConsumer_0_4_collectelementstobetranslated_blackBBBBB(match, srcConsumer, asset,
							srcDeliver, pair);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed." + " Variables: "
								+ "[match] = " + match + ", " + "[srcConsumer] = " + srcConsumer + ", " + "[asset] = "
								+ asset + ", " + "[srcDeliver] = " + srcDeliver + ", " + "[pair] = " + pair + ".");
			}
			EnergyConsumerImpl.pattern_EnergyConsumer_0_4_collectelementstobetranslated_greenBBBFF(match, srcConsumer,
					srcDeliver);
			// EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = (EMoflonEdge) result4_green[3];
			// EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = EnergyConsumerImpl.pattern_EnergyConsumer_0_5_collectcontextelements_blackBBBBB(
					match, srcConsumer, asset, srcDeliver, pair);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[srcConsumer] = " + srcConsumer + ", " + "[asset] = " + asset + ", "
								+ "[srcDeliver] = " + srcDeliver + ", " + "[pair] = " + pair + ".");
			}
			EnergyConsumerImpl.pattern_EnergyConsumer_0_5_collectcontextelements_greenBBBBFFF(match, asset, srcDeliver,
					pair);
			// EMoflonEdge pair__asset____a = (EMoflonEdge) result5_green[4];
			// EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = (EMoflonEdge) result5_green[5];
			// EMoflonEdge srcDeliver__asset____EndDeviceAssets = (EMoflonEdge) result5_green[6];

			// register objects to match
			EnergyConsumerImpl.pattern_EnergyConsumer_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					srcConsumer, asset, srcDeliver, pair);
			return EnergyConsumerImpl.pattern_EnergyConsumer_0_7_expressionF();
		} else {
			return EnergyConsumerImpl.pattern_EnergyConsumer_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = EnergyConsumerImpl
				.pattern_EnergyConsumer_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer = (gluemodel.CIM.IEC61970.Wires.EnergyConsumer) result1_bindingAndBlack[0];
		MeterAsset asset = (MeterAsset) result1_bindingAndBlack[1];
		outagePreventionJointarget.ServiceDeliveryPoint trgDeliver = (outagePreventionJointarget.ServiceDeliveryPoint) result1_bindingAndBlack[2];
		ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result1_bindingAndBlack[3];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result1_bindingAndBlack[4];
		ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver = (ServiceDeliveryPointToServiceDeliveryPoint) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = EnergyConsumerImpl
				.pattern_EnergyConsumer_1_1_performtransformation_greenBBFFB(srcConsumer, trgDeliver, csp);
		outagePreventionJointarget.EnergyConsumer trgConsumer = (outagePreventionJointarget.EnergyConsumer) result1_green[2];
		EnergyConsumerToEnergyConsumer consumerToConsumer = (EnergyConsumerToEnergyConsumer) result1_green[3];

		// collect translated elements
		Object[] result2_black = EnergyConsumerImpl.pattern_EnergyConsumer_1_2_collecttranslatedelements_blackBBB(
				srcConsumer, trgConsumer, consumerToConsumer);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[srcConsumer] = " + srcConsumer + ", " + "[trgConsumer] = " + trgConsumer + ", "
					+ "[consumerToConsumer] = " + consumerToConsumer + ".");
		}
		Object[] result2_green = EnergyConsumerImpl.pattern_EnergyConsumer_1_2_collecttranslatedelements_greenFBBB(
				srcConsumer, trgConsumer, consumerToConsumer);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = EnergyConsumerImpl.pattern_EnergyConsumer_1_3_bookkeepingforedges_blackBBBBBBBBB(
				ruleresult, srcConsumer, asset, trgDeliver, trgConsumer, srcDeliver, pair, deliverToDeliver,
				consumerToConsumer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[srcConsumer] = " + srcConsumer + ", " + "[asset] = "
					+ asset + ", " + "[trgDeliver] = " + trgDeliver + ", " + "[trgConsumer] = " + trgConsumer + ", "
					+ "[srcDeliver] = " + srcDeliver + ", " + "[pair] = " + pair + ", " + "[deliverToDeliver] = "
					+ deliverToDeliver + ", " + "[consumerToConsumer] = " + consumerToConsumer + ".");
		}
		EnergyConsumerImpl.pattern_EnergyConsumer_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, srcConsumer,
				trgDeliver, trgConsumer, srcDeliver, consumerToConsumer);
		// EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = (EMoflonEdge) result3_green[6];
		// EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = (EMoflonEdge) result3_green[7];
		// EMoflonEdge consumerToConsumer__trgConsumer____target = (EMoflonEdge) result3_green[8];
		// EMoflonEdge consumerToConsumer__srcConsumer____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge trgDeliver__trgConsumer____EnergyConsumer = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		EnergyConsumerImpl.pattern_EnergyConsumer_1_5_registerobjects_expressionBBBBBBBBBB(this, ruleresult,
				srcConsumer, asset, trgDeliver, trgConsumer, srcDeliver, pair, deliverToDeliver, consumerToConsumer);
		return EnergyConsumerImpl.pattern_EnergyConsumer_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = EnergyConsumerImpl
				.pattern_EnergyConsumer_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EnergyConsumerImpl
				.pattern_EnergyConsumer_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = EnergyConsumerImpl.pattern_EnergyConsumer_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer = (gluemodel.CIM.IEC61970.Wires.EnergyConsumer) result2_binding[0];
		MeterAsset asset = (MeterAsset) result2_binding[1];
		ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result2_binding[2];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_binding[3];
		for (Object[] result2_black : EnergyConsumerImpl.pattern_EnergyConsumer_2_2_corematch_blackBBFBBFB(srcConsumer,
				asset, srcDeliver, pair, match)) {
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver = (outagePreventionJointarget.ServiceDeliveryPoint) result2_black[2];
			ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver = (ServiceDeliveryPointToServiceDeliveryPoint) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : EnergyConsumerImpl.pattern_EnergyConsumer_2_3_findcontext_blackBBBBBB(
					srcConsumer, asset, trgDeliver, srcDeliver, pair, deliverToDeliver)) {
				Object[] result3_green = EnergyConsumerImpl.pattern_EnergyConsumer_2_3_findcontext_greenBBBBBBFFFFFFFF(
						srcConsumer, asset, trgDeliver, srcDeliver, pair, deliverToDeliver);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[7];
				// EMoflonEdge deliverToDeliver__trgDeliver____target = (EMoflonEdge) result3_green[8];
				// EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = (EMoflonEdge) result3_green[9];
				// EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = (EMoflonEdge) result3_green[10];
				// EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = (EMoflonEdge) result3_green[11];
				// EMoflonEdge srcDeliver__asset____EndDeviceAssets = (EMoflonEdge) result3_green[12];
				// EMoflonEdge deliverToDeliver__srcDeliver____source = (EMoflonEdge) result3_green[13];

				// solve CSP
				Object[] result4_bindingAndBlack = EnergyConsumerImpl
						.pattern_EnergyConsumer_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								srcConsumer, asset, trgDeliver, srcDeliver, pair, deliverToDeliver);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[srcConsumer] = " + srcConsumer + ", " + "[asset] = " + asset + ", " + "[trgDeliver] = "
							+ trgDeliver + ", " + "[srcDeliver] = " + srcDeliver + ", " + "[pair] = " + pair + ", "
							+ "[deliverToDeliver] = " + deliverToDeliver + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (EnergyConsumerImpl.pattern_EnergyConsumer_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = EnergyConsumerImpl
							.pattern_EnergyConsumer_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					EnergyConsumerImpl.pattern_EnergyConsumer_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return EnergyConsumerImpl.pattern_EnergyConsumer_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer,
			MeterAsset asset, ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair) {
		match.registerObject("srcConsumer", srcConsumer);
		match.registerObject("asset", asset);
		match.registerObject("srcDeliver", srcDeliver);
		match.registerObject("pair", pair);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer,
			MeterAsset asset, ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair) {// Create CSP
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
			gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer, MeterAsset asset,
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver, ServiceDeliveryPoint srcDeliver,
			MeterAssetPhysicalDevicePair pair, ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver) {// Create CSP
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
		isApplicableMatch.registerObject("asset", asset);
		isApplicableMatch.registerObject("trgDeliver", trgDeliver);
		isApplicableMatch.registerObject("srcDeliver", srcDeliver);
		isApplicableMatch.registerObject("pair", pair);
		isApplicableMatch.registerObject("deliverToDeliver", deliverToDeliver);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject srcConsumer, EObject asset,
			EObject trgDeliver, EObject trgConsumer, EObject srcDeliver, EObject pair, EObject deliverToDeliver,
			EObject consumerToConsumer) {
		ruleresult.registerObject("srcConsumer", srcConsumer);
		ruleresult.registerObject("asset", asset);
		ruleresult.registerObject("trgDeliver", trgDeliver);
		ruleresult.registerObject("trgConsumer", trgConsumer);
		ruleresult.registerObject("srcDeliver", srcDeliver);
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("deliverToDeliver", deliverToDeliver);
		ruleresult.registerObject("consumerToConsumer", consumerToConsumer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("srcConsumer").eClass())
				.equals("gluemodel.CIM.IEC61970.Wires.EnergyConsumer.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_38(EMoflonEdge _edge_EnergyConsumer) {
		// prepare return value
		Object[] result1_bindingAndBlack = EnergyConsumerImpl
				.pattern_EnergyConsumer_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = EnergyConsumerImpl.pattern_EnergyConsumer_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EnergyConsumerImpl
				.pattern_EnergyConsumer_10_2_testcorematchandDECs_blackFFFFB(_edge_EnergyConsumer)) {
			gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer = (gluemodel.CIM.IEC61970.Wires.EnergyConsumer) result2_black[0];
			MeterAsset asset = (MeterAsset) result2_black[1];
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result2_black[2];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_black[3];
			Object[] result2_green = EnergyConsumerImpl
					.pattern_EnergyConsumer_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EnergyConsumerImpl
					.pattern_EnergyConsumer_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, srcConsumer, asset, srcDeliver, pair)) {
				// Ensure that the correct types of elements are matched
				if (EnergyConsumerImpl
						.pattern_EnergyConsumer_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = EnergyConsumerImpl
							.pattern_EnergyConsumer_10_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					EnergyConsumerImpl.pattern_EnergyConsumer_10_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return EnergyConsumerImpl.pattern_EnergyConsumer_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("EnergyConsumer");
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

		eq0.setRuleName("EnergyConsumer");
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
	public boolean checkDEC_FWD(gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer, MeterAsset asset,
			ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair) {// match tgg pattern
		Object[] result1_black = EnergyConsumerImpl.pattern_EnergyConsumer_13_1_matchtggpattern_blackBBBB(srcConsumer,
				asset, srcDeliver, pair);
		if (result1_black != null) {
			return EnergyConsumerImpl.pattern_EnergyConsumer_13_2_expressionF();
		} else {
			return EnergyConsumerImpl.pattern_EnergyConsumer_13_3_expressionF();
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
		case RulesPackage.ENERGY_CONSUMER___IS_APPROPRIATE_FWD__MATCH_ENERGYCONSUMER_METERASSET_SERVICEDELIVERYPOINT_METERASSETPHYSICALDEVICEPAIR:
			return isAppropriate_FWD((Match) arguments.get(0),
					(gluemodel.CIM.IEC61970.Wires.EnergyConsumer) arguments.get(1), (MeterAsset) arguments.get(2),
					(ServiceDeliveryPoint) arguments.get(3), (MeterAssetPhysicalDevicePair) arguments.get(4));
		case RulesPackage.ENERGY_CONSUMER___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ENERGYCONSUMER_METERASSET_SERVICEDELIVERYPOINT_METERASSETPHYSICALDEVICEPAIR:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(gluemodel.CIM.IEC61970.Wires.EnergyConsumer) arguments.get(1), (MeterAsset) arguments.get(2),
					(ServiceDeliveryPoint) arguments.get(3), (MeterAssetPhysicalDevicePair) arguments.get(4));
			return null;
		case RulesPackage.ENERGY_CONSUMER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ENERGYCONSUMER_METERASSET_SERVICEDELIVERYPOINT_METERASSETPHYSICALDEVICEPAIR:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(gluemodel.CIM.IEC61970.Wires.EnergyConsumer) arguments.get(1), (MeterAsset) arguments.get(2),
					(ServiceDeliveryPoint) arguments.get(3), (MeterAssetPhysicalDevicePair) arguments.get(4));
		case RulesPackage.ENERGY_CONSUMER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ENERGYCONSUMER_METERASSET_SERVICEDELIVERYPOINT_SERVICEDELIVERYPOINT_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINTTOSERVICEDELIVERYPOINT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(gluemodel.CIM.IEC61970.Wires.EnergyConsumer) arguments.get(1), (MeterAsset) arguments.get(2),
					(outagePreventionJointarget.ServiceDeliveryPoint) arguments.get(3),
					(ServiceDeliveryPoint) arguments.get(4), (MeterAssetPhysicalDevicePair) arguments.get(5),
					(ServiceDeliveryPointToServiceDeliveryPoint) arguments.get(6));
		case RulesPackage.ENERGY_CONSUMER___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.ENERGY_CONSUMER___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_38__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_38((EMoflonEdge) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ENERGY_CONSUMER___CHECK_DEC_FWD__ENERGYCONSUMER_METERASSET_SERVICEDELIVERYPOINT_METERASSETPHYSICALDEVICEPAIR:
			return checkDEC_FWD((gluemodel.CIM.IEC61970.Wires.EnergyConsumer) arguments.get(0),
					(MeterAsset) arguments.get(1), (ServiceDeliveryPoint) arguments.get(2),
					(MeterAssetPhysicalDevicePair) arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_EnergyConsumer_0_1_initialbindings_blackBBBBBB(EnergyConsumer _this,
			Match match, gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer, MeterAsset asset,
			ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair) {
		return new Object[] { _this, match, srcConsumer, asset, srcDeliver, pair };
	}

	public static final Object[] pattern_EnergyConsumer_0_2_SolveCSP_bindingFBBBBBB(EnergyConsumer _this, Match match,
			gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer, MeterAsset asset, ServiceDeliveryPoint srcDeliver,
			MeterAssetPhysicalDevicePair pair) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcConsumer, asset, srcDeliver, pair);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcConsumer, asset, srcDeliver, pair };
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumer_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnergyConsumer_0_2_SolveCSP_bindingAndBlackFBBBBBB(EnergyConsumer _this,
			Match match, gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer, MeterAsset asset,
			ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair) {
		Object[] result_pattern_EnergyConsumer_0_2_SolveCSP_binding = pattern_EnergyConsumer_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, srcConsumer, asset, srcDeliver, pair);
		if (result_pattern_EnergyConsumer_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnergyConsumer_0_2_SolveCSP_binding[0];

			Object[] result_pattern_EnergyConsumer_0_2_SolveCSP_black = pattern_EnergyConsumer_0_2_SolveCSP_blackB(csp);
			if (result_pattern_EnergyConsumer_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcConsumer, asset, srcDeliver, pair };
			}
		}
		return null;
	}

	public static final boolean pattern_EnergyConsumer_0_3_CheckCSP_expressionFBB(EnergyConsumer _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnergyConsumer_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer, MeterAsset asset, ServiceDeliveryPoint srcDeliver,
			MeterAssetPhysicalDevicePair pair) {
		return new Object[] { match, srcConsumer, asset, srcDeliver, pair };
	}

	public static final Object[] pattern_EnergyConsumer_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer, ServiceDeliveryPoint srcDeliver) {
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

	public static final Object[] pattern_EnergyConsumer_0_5_collectcontextelements_blackBBBBB(Match match,
			gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer, MeterAsset asset, ServiceDeliveryPoint srcDeliver,
			MeterAssetPhysicalDevicePair pair) {
		return new Object[] { match, srcConsumer, asset, srcDeliver, pair };
	}

	public static final Object[] pattern_EnergyConsumer_0_5_collectcontextelements_greenBBBBFFF(Match match,
			MeterAsset asset, ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair) {
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(asset);
		match.getContextNodes().add(srcDeliver);
		match.getContextNodes().add(pair);
		String pair__asset____a_name_prime = "a";
		String asset__srcDeliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String srcDeliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		match.getContextEdges().add(pair__asset____a);
		asset__srcDeliver____ServiceDeliveryPoint.setSrc(asset);
		asset__srcDeliver____ServiceDeliveryPoint.setTrg(srcDeliver);
		match.getContextEdges().add(asset__srcDeliver____ServiceDeliveryPoint);
		srcDeliver__asset____EndDeviceAssets.setSrc(srcDeliver);
		srcDeliver__asset____EndDeviceAssets.setTrg(asset);
		match.getContextEdges().add(srcDeliver__asset____EndDeviceAssets);
		pair__asset____a.setName(pair__asset____a_name_prime);
		asset__srcDeliver____ServiceDeliveryPoint.setName(asset__srcDeliver____ServiceDeliveryPoint_name_prime);
		srcDeliver__asset____EndDeviceAssets.setName(srcDeliver__asset____EndDeviceAssets_name_prime);
		return new Object[] { match, asset, srcDeliver, pair, pair__asset____a,
				asset__srcDeliver____ServiceDeliveryPoint, srcDeliver__asset____EndDeviceAssets };
	}

	public static final void pattern_EnergyConsumer_0_6_registerobjectstomatch_expressionBBBBBB(EnergyConsumer _this,
			Match match, gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer, MeterAsset asset,
			ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair) {
		_this.registerObjectsToMatch_FWD(match, srcConsumer, asset, srcDeliver, pair);

	}

	public static final boolean pattern_EnergyConsumer_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EnergyConsumer_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_EnergyConsumer_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("srcConsumer");
		EObject _localVariable_1 = isApplicableMatch.getObject("asset");
		EObject _localVariable_2 = isApplicableMatch.getObject("trgDeliver");
		EObject _localVariable_3 = isApplicableMatch.getObject("srcDeliver");
		EObject _localVariable_4 = isApplicableMatch.getObject("pair");
		EObject _localVariable_5 = isApplicableMatch.getObject("deliverToDeliver");
		EObject tmpSrcConsumer = _localVariable_0;
		EObject tmpAsset = _localVariable_1;
		EObject tmpTrgDeliver = _localVariable_2;
		EObject tmpSrcDeliver = _localVariable_3;
		EObject tmpPair = _localVariable_4;
		EObject tmpDeliverToDeliver = _localVariable_5;
		if (tmpSrcConsumer instanceof gluemodel.CIM.IEC61970.Wires.EnergyConsumer) {
			gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer = (gluemodel.CIM.IEC61970.Wires.EnergyConsumer) tmpSrcConsumer;
			if (tmpAsset instanceof MeterAsset) {
				MeterAsset asset = (MeterAsset) tmpAsset;
				if (tmpTrgDeliver instanceof outagePreventionJointarget.ServiceDeliveryPoint) {
					outagePreventionJointarget.ServiceDeliveryPoint trgDeliver = (outagePreventionJointarget.ServiceDeliveryPoint) tmpTrgDeliver;
					if (tmpSrcDeliver instanceof ServiceDeliveryPoint) {
						ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) tmpSrcDeliver;
						if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
							MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
							if (tmpDeliverToDeliver instanceof ServiceDeliveryPointToServiceDeliveryPoint) {
								ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver = (ServiceDeliveryPointToServiceDeliveryPoint) tmpDeliverToDeliver;
								return new Object[] { srcConsumer, asset, trgDeliver, srcDeliver, pair,
										deliverToDeliver, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumer_1_1_performtransformation_blackBBBBBBFBB(
			gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer, MeterAsset asset,
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver, ServiceDeliveryPoint srcDeliver,
			MeterAssetPhysicalDevicePair pair, ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver,
			EnergyConsumer _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { srcConsumer, asset, trgDeliver, srcDeliver, pair, deliverToDeliver, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumer_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			EnergyConsumer _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EnergyConsumer_1_1_performtransformation_binding = pattern_EnergyConsumer_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_EnergyConsumer_1_1_performtransformation_binding != null) {
			gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer = (gluemodel.CIM.IEC61970.Wires.EnergyConsumer) result_pattern_EnergyConsumer_1_1_performtransformation_binding[0];
			MeterAsset asset = (MeterAsset) result_pattern_EnergyConsumer_1_1_performtransformation_binding[1];
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver = (outagePreventionJointarget.ServiceDeliveryPoint) result_pattern_EnergyConsumer_1_1_performtransformation_binding[2];
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result_pattern_EnergyConsumer_1_1_performtransformation_binding[3];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result_pattern_EnergyConsumer_1_1_performtransformation_binding[4];
			ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver = (ServiceDeliveryPointToServiceDeliveryPoint) result_pattern_EnergyConsumer_1_1_performtransformation_binding[5];

			Object[] result_pattern_EnergyConsumer_1_1_performtransformation_black = pattern_EnergyConsumer_1_1_performtransformation_blackBBBBBBFBB(
					srcConsumer, asset, trgDeliver, srcDeliver, pair, deliverToDeliver, _this, isApplicableMatch);
			if (result_pattern_EnergyConsumer_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_EnergyConsumer_1_1_performtransformation_black[6];

				return new Object[] { srcConsumer, asset, trgDeliver, srcDeliver, pair, deliverToDeliver, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumer_1_1_performtransformation_greenBBFFB(
			gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer,
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver, CSP csp) {
		outagePreventionJointarget.EnergyConsumer trgConsumer = OutagePreventionJointargetFactory.eINSTANCE
				.createEnergyConsumer();
		EnergyConsumerToEnergyConsumer consumerToConsumer = Task2Factory.eINSTANCE
				.createEnergyConsumerToEnergyConsumer();
		Object _localVariable_0 = csp.getValue("trgConsumer", "mRID");
		trgDeliver.setEnergyConsumer(trgConsumer);
		consumerToConsumer.setTarget(trgConsumer);
		consumerToConsumer.setSource(srcConsumer);
		String trgConsumer_mRID_prime = (String) _localVariable_0;
		trgConsumer.setMRID(trgConsumer_mRID_prime);
		return new Object[] { srcConsumer, trgDeliver, trgConsumer, consumerToConsumer, csp };
	}

	public static final Object[] pattern_EnergyConsumer_1_2_collecttranslatedelements_blackBBB(
			gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer,
			outagePreventionJointarget.EnergyConsumer trgConsumer, EnergyConsumerToEnergyConsumer consumerToConsumer) {
		return new Object[] { srcConsumer, trgConsumer, consumerToConsumer };
	}

	public static final Object[] pattern_EnergyConsumer_1_2_collecttranslatedelements_greenFBBB(
			gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer,
			outagePreventionJointarget.EnergyConsumer trgConsumer, EnergyConsumerToEnergyConsumer consumerToConsumer) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(srcConsumer);
		ruleresult.getCreatedElements().add(trgConsumer);
		ruleresult.getCreatedLinkElements().add(consumerToConsumer);
		return new Object[] { ruleresult, srcConsumer, trgConsumer, consumerToConsumer };
	}

	public static final Object[] pattern_EnergyConsumer_1_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject srcConsumer, EObject asset, EObject trgDeliver, EObject trgConsumer,
			EObject srcDeliver, EObject pair, EObject deliverToDeliver, EObject consumerToConsumer) {
		if (!srcConsumer.equals(trgDeliver)) {
			if (!srcConsumer.equals(trgConsumer)) {
				if (!srcConsumer.equals(srcDeliver)) {
					if (!asset.equals(srcConsumer)) {
						if (!asset.equals(trgDeliver)) {
							if (!asset.equals(trgConsumer)) {
								if (!asset.equals(srcDeliver)) {
									if (!asset.equals(pair)) {
										if (!asset.equals(deliverToDeliver)) {
											if (!asset.equals(consumerToConsumer)) {
												if (!trgConsumer.equals(trgDeliver)) {
													if (!srcDeliver.equals(trgDeliver)) {
														if (!srcDeliver.equals(trgConsumer)) {
															if (!pair.equals(srcConsumer)) {
																if (!pair.equals(trgDeliver)) {
																	if (!pair.equals(trgConsumer)) {
																		if (!pair.equals(srcDeliver)) {
																			if (!deliverToDeliver.equals(srcConsumer)) {
																				if (!deliverToDeliver
																						.equals(trgDeliver)) {
																					if (!deliverToDeliver
																							.equals(trgConsumer)) {
																						if (!deliverToDeliver
																								.equals(srcDeliver)) {
																							if (!deliverToDeliver
																									.equals(pair)) {
																								if (!consumerToConsumer
																										.equals(srcConsumer)) {
																									if (!consumerToConsumer
																											.equals(trgDeliver)) {
																										if (!consumerToConsumer
																												.equals(trgConsumer)) {
																											if (!consumerToConsumer
																													.equals(srcDeliver)) {
																												if (!consumerToConsumer
																														.equals(pair)) {
																													if (!consumerToConsumer
																															.equals(deliverToDeliver)) {
																														return new Object[] {
																																ruleresult,
																																srcConsumer,
																																asset,
																																trgDeliver,
																																trgConsumer,
																																srcDeliver,
																																pair,
																																deliverToDeliver,
																																consumerToConsumer };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_EnergyConsumer_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject srcConsumer, EObject trgDeliver, EObject trgConsumer,
			EObject srcDeliver, EObject consumerToConsumer) {
		EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge consumerToConsumer__trgConsumer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge consumerToConsumer__srcConsumer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgDeliver__trgConsumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EnergyConsumer";
		String srcDeliver__srcConsumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime = "ServiceDeliveryPoints";
		String consumerToConsumer__trgConsumer____target_name_prime = "target";
		String consumerToConsumer__srcConsumer____source_name_prime = "source";
		String trgDeliver__trgConsumer____EnergyConsumer_name_prime = "EnergyConsumer";
		srcDeliver__srcConsumer____EnergyConsumer.setSrc(srcDeliver);
		srcDeliver__srcConsumer____EnergyConsumer.setTrg(srcConsumer);
		ruleresult.getTranslatedEdges().add(srcDeliver__srcConsumer____EnergyConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setSrc(srcConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setTrg(srcDeliver);
		ruleresult.getTranslatedEdges().add(srcConsumer__srcDeliver____ServiceDeliveryPoints);
		consumerToConsumer__trgConsumer____target.setSrc(consumerToConsumer);
		consumerToConsumer__trgConsumer____target.setTrg(trgConsumer);
		ruleresult.getCreatedEdges().add(consumerToConsumer__trgConsumer____target);
		consumerToConsumer__srcConsumer____source.setSrc(consumerToConsumer);
		consumerToConsumer__srcConsumer____source.setTrg(srcConsumer);
		ruleresult.getCreatedEdges().add(consumerToConsumer__srcConsumer____source);
		trgDeliver__trgConsumer____EnergyConsumer.setSrc(trgDeliver);
		trgDeliver__trgConsumer____EnergyConsumer.setTrg(trgConsumer);
		ruleresult.getCreatedEdges().add(trgDeliver__trgConsumer____EnergyConsumer);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		srcDeliver__srcConsumer____EnergyConsumer.setName(srcDeliver__srcConsumer____EnergyConsumer_name_prime);
		srcConsumer__srcDeliver____ServiceDeliveryPoints
				.setName(srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime);
		consumerToConsumer__trgConsumer____target.setName(consumerToConsumer__trgConsumer____target_name_prime);
		consumerToConsumer__srcConsumer____source.setName(consumerToConsumer__srcConsumer____source_name_prime);
		trgDeliver__trgConsumer____EnergyConsumer.setName(trgDeliver__trgConsumer____EnergyConsumer_name_prime);
		return new Object[] { ruleresult, srcConsumer, trgDeliver, trgConsumer, srcDeliver, consumerToConsumer,
				srcDeliver__srcConsumer____EnergyConsumer, srcConsumer__srcDeliver____ServiceDeliveryPoints,
				consumerToConsumer__trgConsumer____target, consumerToConsumer__srcConsumer____source,
				trgDeliver__trgConsumer____EnergyConsumer };
	}

	public static final void pattern_EnergyConsumer_1_5_registerobjects_expressionBBBBBBBBBB(EnergyConsumer _this,
			PerformRuleResult ruleresult, EObject srcConsumer, EObject asset, EObject trgDeliver, EObject trgConsumer,
			EObject srcDeliver, EObject pair, EObject deliverToDeliver, EObject consumerToConsumer) {
		_this.registerObjects_FWD(ruleresult, srcConsumer, asset, trgDeliver, trgConsumer, srcDeliver, pair,
				deliverToDeliver, consumerToConsumer);

	}

	public static final PerformRuleResult pattern_EnergyConsumer_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EnergyConsumer_2_1_preparereturnvalue_bindingFB(EnergyConsumer _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumer_2_1_preparereturnvalue_blackFBB(EClass eClass,
			EnergyConsumer _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumer_2_1_preparereturnvalue_bindingAndBlackFFB(
			EnergyConsumer _this) {
		Object[] result_pattern_EnergyConsumer_2_1_preparereturnvalue_binding = pattern_EnergyConsumer_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_EnergyConsumer_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_EnergyConsumer_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_EnergyConsumer_2_1_preparereturnvalue_black = pattern_EnergyConsumer_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_EnergyConsumer_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EnergyConsumer_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumer_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "EnergyConsumer";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EnergyConsumer_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("srcConsumer");
		EObject _localVariable_1 = match.getObject("asset");
		EObject _localVariable_2 = match.getObject("srcDeliver");
		EObject _localVariable_3 = match.getObject("pair");
		EObject tmpSrcConsumer = _localVariable_0;
		EObject tmpAsset = _localVariable_1;
		EObject tmpSrcDeliver = _localVariable_2;
		EObject tmpPair = _localVariable_3;
		if (tmpSrcConsumer instanceof gluemodel.CIM.IEC61970.Wires.EnergyConsumer) {
			gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer = (gluemodel.CIM.IEC61970.Wires.EnergyConsumer) tmpSrcConsumer;
			if (tmpAsset instanceof MeterAsset) {
				MeterAsset asset = (MeterAsset) tmpAsset;
				if (tmpSrcDeliver instanceof ServiceDeliveryPoint) {
					ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) tmpSrcDeliver;
					if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
						MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
						return new Object[] { srcConsumer, asset, srcDeliver, pair, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EnergyConsumer_2_2_corematch_blackBBFBBFB(
			gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer, MeterAsset asset, ServiceDeliveryPoint srcDeliver,
			MeterAssetPhysicalDevicePair pair, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcDeliver, ServiceDeliveryPointToServiceDeliveryPoint.class, "source")) {
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver = deliverToDeliver.getTarget();
			if (trgDeliver != null) {
				_result.add(new Object[] { srcConsumer, asset, trgDeliver, srcDeliver, pair, deliverToDeliver, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EnergyConsumer_2_3_findcontext_blackBBBBBB(
			gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer, MeterAsset asset,
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver, ServiceDeliveryPoint srcDeliver,
			MeterAssetPhysicalDevicePair pair, ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (asset.equals(pair.getA())) {
			if (trgDeliver.equals(deliverToDeliver.getTarget())) {
				if (srcConsumer.equals(srcDeliver.getEnergyConsumer())) {
					if (srcDeliver.equals(asset.getServiceDeliveryPoint())) {
						if (srcDeliver.equals(deliverToDeliver.getSource())) {
							_result.add(new Object[] { srcConsumer, asset, trgDeliver, srcDeliver, pair,
									deliverToDeliver });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EnergyConsumer_2_3_findcontext_greenBBBBBBFFFFFFFF(
			gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer, MeterAsset asset,
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver, ServiceDeliveryPoint srcDeliver,
			MeterAssetPhysicalDevicePair pair, ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge deliverToDeliver__trgDeliver____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge deliverToDeliver__srcDeliver____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pair__asset____a_name_prime = "a";
		String deliverToDeliver__trgDeliver____target_name_prime = "target";
		String srcDeliver__srcConsumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime = "ServiceDeliveryPoints";
		String asset__srcDeliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String srcDeliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		String deliverToDeliver__srcDeliver____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(srcConsumer);
		isApplicableMatch.getAllContextElements().add(asset);
		isApplicableMatch.getAllContextElements().add(trgDeliver);
		isApplicableMatch.getAllContextElements().add(srcDeliver);
		isApplicableMatch.getAllContextElements().add(pair);
		isApplicableMatch.getAllContextElements().add(deliverToDeliver);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(pair__asset____a);
		deliverToDeliver__trgDeliver____target.setSrc(deliverToDeliver);
		deliverToDeliver__trgDeliver____target.setTrg(trgDeliver);
		isApplicableMatch.getAllContextElements().add(deliverToDeliver__trgDeliver____target);
		srcDeliver__srcConsumer____EnergyConsumer.setSrc(srcDeliver);
		srcDeliver__srcConsumer____EnergyConsumer.setTrg(srcConsumer);
		isApplicableMatch.getAllContextElements().add(srcDeliver__srcConsumer____EnergyConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setSrc(srcConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setTrg(srcDeliver);
		isApplicableMatch.getAllContextElements().add(srcConsumer__srcDeliver____ServiceDeliveryPoints);
		asset__srcDeliver____ServiceDeliveryPoint.setSrc(asset);
		asset__srcDeliver____ServiceDeliveryPoint.setTrg(srcDeliver);
		isApplicableMatch.getAllContextElements().add(asset__srcDeliver____ServiceDeliveryPoint);
		srcDeliver__asset____EndDeviceAssets.setSrc(srcDeliver);
		srcDeliver__asset____EndDeviceAssets.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(srcDeliver__asset____EndDeviceAssets);
		deliverToDeliver__srcDeliver____source.setSrc(deliverToDeliver);
		deliverToDeliver__srcDeliver____source.setTrg(srcDeliver);
		isApplicableMatch.getAllContextElements().add(deliverToDeliver__srcDeliver____source);
		pair__asset____a.setName(pair__asset____a_name_prime);
		deliverToDeliver__trgDeliver____target.setName(deliverToDeliver__trgDeliver____target_name_prime);
		srcDeliver__srcConsumer____EnergyConsumer.setName(srcDeliver__srcConsumer____EnergyConsumer_name_prime);
		srcConsumer__srcDeliver____ServiceDeliveryPoints
				.setName(srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime);
		asset__srcDeliver____ServiceDeliveryPoint.setName(asset__srcDeliver____ServiceDeliveryPoint_name_prime);
		srcDeliver__asset____EndDeviceAssets.setName(srcDeliver__asset____EndDeviceAssets_name_prime);
		deliverToDeliver__srcDeliver____source.setName(deliverToDeliver__srcDeliver____source_name_prime);
		return new Object[] { srcConsumer, asset, trgDeliver, srcDeliver, pair, deliverToDeliver, isApplicableMatch,
				pair__asset____a, deliverToDeliver__trgDeliver____target, srcDeliver__srcConsumer____EnergyConsumer,
				srcConsumer__srcDeliver____ServiceDeliveryPoints, asset__srcDeliver____ServiceDeliveryPoint,
				srcDeliver__asset____EndDeviceAssets, deliverToDeliver__srcDeliver____source };
	}

	public static final Object[] pattern_EnergyConsumer_2_4_solveCSP_bindingFBBBBBBBB(EnergyConsumer _this,
			IsApplicableMatch isApplicableMatch, gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer,
			MeterAsset asset, outagePreventionJointarget.ServiceDeliveryPoint trgDeliver,
			ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, srcConsumer, asset, trgDeliver,
				srcDeliver, pair, deliverToDeliver);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, srcConsumer, asset, trgDeliver, srcDeliver, pair,
					deliverToDeliver };
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumer_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnergyConsumer_2_4_solveCSP_bindingAndBlackFBBBBBBBB(EnergyConsumer _this,
			IsApplicableMatch isApplicableMatch, gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer,
			MeterAsset asset, outagePreventionJointarget.ServiceDeliveryPoint trgDeliver,
			ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver) {
		Object[] result_pattern_EnergyConsumer_2_4_solveCSP_binding = pattern_EnergyConsumer_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, srcConsumer, asset, trgDeliver, srcDeliver, pair, deliverToDeliver);
		if (result_pattern_EnergyConsumer_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnergyConsumer_2_4_solveCSP_binding[0];

			Object[] result_pattern_EnergyConsumer_2_4_solveCSP_black = pattern_EnergyConsumer_2_4_solveCSP_blackB(csp);
			if (result_pattern_EnergyConsumer_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, srcConsumer, asset, trgDeliver, srcDeliver, pair,
						deliverToDeliver };
			}
		}
		return null;
	}

	public static final boolean pattern_EnergyConsumer_2_5_checkCSP_expressionFBB(EnergyConsumer _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnergyConsumer_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EnergyConsumer_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EnergyConsumer";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EnergyConsumer_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EnergyConsumer_10_1_preparereturnvalue_bindingFB(EnergyConsumer _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumer_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			EnergyConsumer _this) {
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

	public static final Object[] pattern_EnergyConsumer_10_1_preparereturnvalue_bindingAndBlackFFBF(
			EnergyConsumer _this) {
		Object[] result_pattern_EnergyConsumer_10_1_preparereturnvalue_binding = pattern_EnergyConsumer_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_EnergyConsumer_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_EnergyConsumer_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_EnergyConsumer_10_1_preparereturnvalue_black = pattern_EnergyConsumer_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_EnergyConsumer_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EnergyConsumer_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_EnergyConsumer_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumer_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EnergyConsumer_10_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_EnergyConsumer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcDeliver = _edge_EnergyConsumer.getSrc();
		if (tmpSrcDeliver instanceof ServiceDeliveryPoint) {
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) tmpSrcDeliver;
			EObject tmpSrcConsumer = _edge_EnergyConsumer.getTrg();
			if (tmpSrcConsumer instanceof gluemodel.CIM.IEC61970.Wires.EnergyConsumer) {
				gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer = (gluemodel.CIM.IEC61970.Wires.EnergyConsumer) tmpSrcConsumer;
				if (srcConsumer.equals(srcDeliver.getEnergyConsumer())) {
					for (EndDeviceAsset tmpAsset : srcDeliver.getEndDeviceAssets()) {
						if (tmpAsset instanceof MeterAsset) {
							MeterAsset asset = (MeterAsset) tmpAsset;
							for (MeterAssetPhysicalDevicePair pair : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(asset, MeterAssetPhysicalDevicePair.class, "a")) {
								_result.add(
										new Object[] { srcConsumer, asset, srcDeliver, pair, _edge_EnergyConsumer });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EnergyConsumer_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EnergyConsumer_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			EnergyConsumer _this, Match match, gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer,
			MeterAsset asset, ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcConsumer, asset, srcDeliver, pair);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EnergyConsumer_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			EnergyConsumer _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnergyConsumer_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumer_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_EnergyConsumer_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EnergyConsumer_13_1_matchtggpattern_blackBBBB(
			gluemodel.CIM.IEC61970.Wires.EnergyConsumer srcConsumer, MeterAsset asset, ServiceDeliveryPoint srcDeliver,
			MeterAssetPhysicalDevicePair pair) {
		if (asset.equals(pair.getA())) {
			if (srcConsumer.equals(srcDeliver.getEnergyConsumer())) {
				if (srcDeliver.equals(asset.getServiceDeliveryPoint())) {
					return new Object[] { srcConsumer, asset, srcDeliver, pair };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_EnergyConsumer_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EnergyConsumer_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EnergyConsumerImpl
