/**
 */
package CIM.IEC61970.Informative.MarketOperations.util;

import CIM.Element;

import CIM.IEC61968.Common.Agreement;
import CIM.IEC61968.Common.Document;
import CIM.IEC61968.Common.Organisation;

import CIM.IEC61970.Core.BasicIntervalSchedule;
import CIM.IEC61970.Core.Curve;
import CIM.IEC61970.Core.IdentifiedObject;
import CIM.IEC61970.Core.PowerSystemResource;
import CIM.IEC61970.Core.RegularIntervalSchedule;

import CIM.IEC61970.Informative.EnergyScheduling.Profile;

import CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;

import CIM.IEC61970.Informative.MarketOperations.*;

import CIM.IEC61970.Meas.Limit;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage
 * @generated
 */
public class MarketOperationsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MarketOperationsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketOperationsSwitch() {
		if (modelPackage == null) {
			modelPackage = MarketOperationsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MarketOperationsPackage.NOTIFICATION_TIME_CURVE: {
				NotificationTimeCurve notificationTimeCurve = (NotificationTimeCurve)theEObject;
				T result = caseNotificationTimeCurve(notificationTimeCurve);
				if (result == null) result = caseCurve(notificationTimeCurve);
				if (result == null) result = caseIdentifiedObject(notificationTimeCurve);
				if (result == null) result = caseElement(notificationTimeCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.ENERGY_PRICE_CURVE: {
				EnergyPriceCurve energyPriceCurve = (EnergyPriceCurve)theEObject;
				T result = caseEnergyPriceCurve(energyPriceCurve);
				if (result == null) result = caseCurve(energyPriceCurve);
				if (result == null) result = caseIdentifiedObject(energyPriceCurve);
				if (result == null) result = caseElement(energyPriceCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.METER: {
				Meter meter = (Meter)theEObject;
				T result = caseMeter(meter);
				if (result == null) result = caseIdentifiedObject(meter);
				if (result == null) result = caseElement(meter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.MARKET_STATEMENT: {
				MarketStatement marketStatement = (MarketStatement)theEObject;
				T result = caseMarketStatement(marketStatement);
				if (result == null) result = caseDocument(marketStatement);
				if (result == null) result = caseIdentifiedObject(marketStatement);
				if (result == null) result = caseElement(marketStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT: {
				ContingencyConstraintLimit contingencyConstraintLimit = (ContingencyConstraintLimit)theEObject;
				T result = caseContingencyConstraintLimit(contingencyConstraintLimit);
				if (result == null) result = caseCurve(contingencyConstraintLimit);
				if (result == null) result = caseIdentifiedObject(contingencyConstraintLimit);
				if (result == null) result = caseElement(contingencyConstraintLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.REGISTERED_GENERATOR: {
				RegisteredGenerator registeredGenerator = (RegisteredGenerator)theEObject;
				T result = caseRegisteredGenerator(registeredGenerator);
				if (result == null) result = caseRegisteredResource(registeredGenerator);
				if (result == null) result = caseIdentifiedObject(registeredGenerator);
				if (result == null) result = caseElement(registeredGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.TRANSACTION_BID: {
				TransactionBid transactionBid = (TransactionBid)theEObject;
				T result = caseTransactionBid(transactionBid);
				if (result == null) result = caseBid(transactionBid);
				if (result == null) result = caseDocument(transactionBid);
				if (result == null) result = caseIdentifiedObject(transactionBid);
				if (result == null) result = caseElement(transactionBid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.SECURITY_CONSTRAINTS: {
				SecurityConstraints securityConstraints = (SecurityConstraints)theEObject;
				T result = caseSecurityConstraints(securityConstraints);
				if (result == null) result = caseIdentifiedObject(securityConstraints);
				if (result == null) result = caseElement(securityConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.VIOLATION_LIMIT: {
				ViolationLimit violationLimit = (ViolationLimit)theEObject;
				T result = caseViolationLimit(violationLimit);
				if (result == null) result = caseLimit(violationLimit);
				if (result == null) result = caseIdentifiedObject(violationLimit);
				if (result == null) result = caseElement(violationLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.START_UP_COST_CURVE: {
				StartUpCostCurve startUpCostCurve = (StartUpCostCurve)theEObject;
				T result = caseStartUpCostCurve(startUpCostCurve);
				if (result == null) result = caseCurve(startUpCostCurve);
				if (result == null) result = caseIdentifiedObject(startUpCostCurve);
				if (result == null) result = caseElement(startUpCostCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.DEFAULT_CONSTRAINT_LIMIT: {
				DefaultConstraintLimit defaultConstraintLimit = (DefaultConstraintLimit)theEObject;
				T result = caseDefaultConstraintLimit(defaultConstraintLimit);
				if (result == null) result = caseCurve(defaultConstraintLimit);
				if (result == null) result = caseIdentifiedObject(defaultConstraintLimit);
				if (result == null) result = caseElement(defaultConstraintLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.BILL_DETERMINANT: {
				BillDeterminant billDeterminant = (BillDeterminant)theEObject;
				T result = caseBillDeterminant(billDeterminant);
				if (result == null) result = caseDocument(billDeterminant);
				if (result == null) result = caseIdentifiedObject(billDeterminant);
				if (result == null) result = caseElement(billDeterminant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.LOAD_REDUCTION_PRICE_CURVE: {
				LoadReductionPriceCurve loadReductionPriceCurve = (LoadReductionPriceCurve)theEObject;
				T result = caseLoadReductionPriceCurve(loadReductionPriceCurve);
				if (result == null) result = caseCurve(loadReductionPriceCurve);
				if (result == null) result = caseIdentifiedObject(loadReductionPriceCurve);
				if (result == null) result = caseElement(loadReductionPriceCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.CHARGE_PROFILE: {
				ChargeProfile chargeProfile = (ChargeProfile)theEObject;
				T result = caseChargeProfile(chargeProfile);
				if (result == null) result = caseProfile(chargeProfile);
				if (result == null) result = caseIdentifiedObject(chargeProfile);
				if (result == null) result = caseElement(chargeProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.SETTLEMENT: {
				Settlement settlement = (Settlement)theEObject;
				T result = caseSettlement(settlement);
				if (result == null) result = caseDocument(settlement);
				if (result == null) result = caseIdentifiedObject(settlement);
				if (result == null) result = caseElement(settlement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.MARKET: {
				Market market = (Market)theEObject;
				T result = caseMarket(market);
				if (result == null) result = caseIdentifiedObject(market);
				if (result == null) result = caseElement(market);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.RESERVE_REQ: {
				ReserveReq reserveReq = (ReserveReq)theEObject;
				T result = caseReserveReq(reserveReq);
				if (result == null) result = caseResourceGroupReq(reserveReq);
				if (result == null) result = caseIdentifiedObject(reserveReq);
				if (result == null) result = caseElement(reserveReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.REGISTERED_RESOURCE: {
				RegisteredResource registeredResource = (RegisteredResource)theEObject;
				T result = caseRegisteredResource(registeredResource);
				if (result == null) result = caseIdentifiedObject(registeredResource);
				if (result == null) result = caseElement(registeredResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.MARKET_PRODUCT: {
				MarketProduct marketProduct = (MarketProduct)theEObject;
				T result = caseMarketProduct(marketProduct);
				if (result == null) result = caseIdentifiedObject(marketProduct);
				if (result == null) result = caseElement(marketProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.GENERATING_BID: {
				GeneratingBid generatingBid = (GeneratingBid)theEObject;
				T result = caseGeneratingBid(generatingBid);
				if (result == null) result = caseResourceBid(generatingBid);
				if (result == null) result = caseBid(generatingBid);
				if (result == null) result = caseDocument(generatingBid);
				if (result == null) result = caseIdentifiedObject(generatingBid);
				if (result == null) result = caseElement(generatingBid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.TERMINAL_CONSTRAINT_TERM: {
				TerminalConstraintTerm terminalConstraintTerm = (TerminalConstraintTerm)theEObject;
				T result = caseTerminalConstraintTerm(terminalConstraintTerm);
				if (result == null) result = caseConstraintTerm(terminalConstraintTerm);
				if (result == null) result = caseIdentifiedObject(terminalConstraintTerm);
				if (result == null) result = caseElement(terminalConstraintTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.RTO: {
				RTO rto = (RTO)theEObject;
				T result = caseRTO(rto);
				if (result == null) result = caseErpOrganisation(rto);
				if (result == null) result = caseOrganisation(rto);
				if (result == null) result = caseIdentifiedObject(rto);
				if (result == null) result = caseElement(rto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.CONSTRAINT_TERM: {
				ConstraintTerm constraintTerm = (ConstraintTerm)theEObject;
				T result = caseConstraintTerm(constraintTerm);
				if (result == null) result = caseIdentifiedObject(constraintTerm);
				if (result == null) result = caseElement(constraintTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.PASS_THROUGH_BILL: {
				PassThroughBill passThroughBill = (PassThroughBill)theEObject;
				T result = casePassThroughBill(passThroughBill);
				if (result == null) result = caseDocument(passThroughBill);
				if (result == null) result = caseIdentifiedObject(passThroughBill);
				if (result == null) result = caseElement(passThroughBill);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.PNODE: {
				Pnode pnode = (Pnode)theEObject;
				T result = casePnode(pnode);
				if (result == null) result = caseIdentifiedObject(pnode);
				if (result == null) result = caseElement(pnode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.PNODE_CLEARING: {
				PnodeClearing pnodeClearing = (PnodeClearing)theEObject;
				T result = casePnodeClearing(pnodeClearing);
				if (result == null) result = caseMarketFactors(pnodeClearing);
				if (result == null) result = caseDocument(pnodeClearing);
				if (result == null) result = caseIdentifiedObject(pnodeClearing);
				if (result == null) result = caseElement(pnodeClearing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.START_UP_TIME_CURVE: {
				StartUpTimeCurve startUpTimeCurve = (StartUpTimeCurve)theEObject;
				T result = caseStartUpTimeCurve(startUpTimeCurve);
				if (result == null) result = caseCurve(startUpTimeCurve);
				if (result == null) result = caseIdentifiedObject(startUpTimeCurve);
				if (result == null) result = caseElement(startUpTimeCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM: {
				SecurityConstraintSum securityConstraintSum = (SecurityConstraintSum)theEObject;
				T result = caseSecurityConstraintSum(securityConstraintSum);
				if (result == null) result = caseMarketFactors(securityConstraintSum);
				if (result == null) result = caseDocument(securityConstraintSum);
				if (result == null) result = caseIdentifiedObject(securityConstraintSum);
				if (result == null) result = caseElement(securityConstraintSum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.BASE_CASE_CONSTRAINT_LIMIT: {
				BaseCaseConstraintLimit baseCaseConstraintLimit = (BaseCaseConstraintLimit)theEObject;
				T result = caseBaseCaseConstraintLimit(baseCaseConstraintLimit);
				if (result == null) result = caseCurve(baseCaseConstraintLimit);
				if (result == null) result = caseIdentifiedObject(baseCaseConstraintLimit);
				if (result == null) result = caseElement(baseCaseConstraintLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.PRODUCT_BID: {
				ProductBid productBid = (ProductBid)theEObject;
				T result = caseProductBid(productBid);
				if (result == null) result = caseIdentifiedObject(productBid);
				if (result == null) result = caseElement(productBid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.MW_LIMIT_SCHEDULE: {
				MWLimitSchedule mwLimitSchedule = (MWLimitSchedule)theEObject;
				T result = caseMWLimitSchedule(mwLimitSchedule);
				if (result == null) result = caseCurve(mwLimitSchedule);
				if (result == null) result = caseIdentifiedObject(mwLimitSchedule);
				if (result == null) result = caseElement(mwLimitSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM: {
				MarketStatementLineItem marketStatementLineItem = (MarketStatementLineItem)theEObject;
				T result = caseMarketStatementLineItem(marketStatementLineItem);
				if (result == null) result = caseIdentifiedObject(marketStatementLineItem);
				if (result == null) result = caseElement(marketStatementLineItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING: {
				AncillaryServiceClearing ancillaryServiceClearing = (AncillaryServiceClearing)theEObject;
				T result = caseAncillaryServiceClearing(ancillaryServiceClearing);
				if (result == null) result = caseMarketFactors(ancillaryServiceClearing);
				if (result == null) result = caseDocument(ancillaryServiceClearing);
				if (result == null) result = caseIdentifiedObject(ancillaryServiceClearing);
				if (result == null) result = caseElement(ancillaryServiceClearing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.BID_SET: {
				BidSet bidSet = (BidSet)theEObject;
				T result = caseBidSet(bidSet);
				if (result == null) result = caseIdentifiedObject(bidSet);
				if (result == null) result = caseElement(bidSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.SECURITY_CONSTRAINTS_CLEARING: {
				SecurityConstraintsClearing securityConstraintsClearing = (SecurityConstraintsClearing)theEObject;
				T result = caseSecurityConstraintsClearing(securityConstraintsClearing);
				if (result == null) result = caseMarketFactors(securityConstraintsClearing);
				if (result == null) result = caseDocument(securityConstraintsClearing);
				if (result == null) result = caseIdentifiedObject(securityConstraintsClearing);
				if (result == null) result = caseElement(securityConstraintsClearing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.PRODUCT_BID_CLEARING: {
				ProductBidClearing productBidClearing = (ProductBidClearing)theEObject;
				T result = caseProductBidClearing(productBidClearing);
				if (result == null) result = caseMarketFactors(productBidClearing);
				if (result == null) result = caseDocument(productBidClearing);
				if (result == null) result = caseIdentifiedObject(productBidClearing);
				if (result == null) result = caseElement(productBidClearing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.RESOURCE_BID: {
				ResourceBid resourceBid = (ResourceBid)theEObject;
				T result = caseResourceBid(resourceBid);
				if (result == null) result = caseBid(resourceBid);
				if (result == null) result = caseDocument(resourceBid);
				if (result == null) result = caseIdentifiedObject(resourceBid);
				if (result == null) result = caseElement(resourceBid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.CAPACITY_BENEFIT_MARGIN: {
				CapacityBenefitMargin capacityBenefitMargin = (CapacityBenefitMargin)theEObject;
				T result = caseCapacityBenefitMargin(capacityBenefitMargin);
				if (result == null) result = caseProfile(capacityBenefitMargin);
				if (result == null) result = caseIdentifiedObject(capacityBenefitMargin);
				if (result == null) result = caseElement(capacityBenefitMargin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.SCHEDULING_COORDINATOR: {
				SchedulingCoordinator schedulingCoordinator = (SchedulingCoordinator)theEObject;
				T result = caseSchedulingCoordinator(schedulingCoordinator);
				if (result == null) result = caseErpOrganisation(schedulingCoordinator);
				if (result == null) result = caseOrganisation(schedulingCoordinator);
				if (result == null) result = caseIdentifiedObject(schedulingCoordinator);
				if (result == null) result = caseElement(schedulingCoordinator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.RAMP_RATE_CURVE: {
				RampRateCurve rampRateCurve = (RampRateCurve)theEObject;
				T result = caseRampRateCurve(rampRateCurve);
				if (result == null) result = caseCurve(rampRateCurve);
				if (result == null) result = caseIdentifiedObject(rampRateCurve);
				if (result == null) result = caseElement(rampRateCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.BID_CLEARING: {
				BidClearing bidClearing = (BidClearing)theEObject;
				T result = caseBidClearing(bidClearing);
				if (result == null) result = caseElement(bidClearing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.LOAD_BID: {
				LoadBid loadBid = (LoadBid)theEObject;
				T result = caseLoadBid(loadBid);
				if (result == null) result = caseResourceBid(loadBid);
				if (result == null) result = caseBid(loadBid);
				if (result == null) result = caseDocument(loadBid);
				if (result == null) result = caseIdentifiedObject(loadBid);
				if (result == null) result = caseElement(loadBid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.BID: {
				Bid bid = (Bid)theEObject;
				T result = caseBid(bid);
				if (result == null) result = caseDocument(bid);
				if (result == null) result = caseIdentifiedObject(bid);
				if (result == null) result = caseElement(bid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.FLOWGATE: {
				Flowgate flowgate = (Flowgate)theEObject;
				T result = caseFlowgate(flowgate);
				if (result == null) result = casePowerSystemResource(flowgate);
				if (result == null) result = caseIdentifiedObject(flowgate);
				if (result == null) result = caseElement(flowgate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.MARKET_FACTORS: {
				MarketFactors marketFactors = (MarketFactors)theEObject;
				T result = caseMarketFactors(marketFactors);
				if (result == null) result = caseDocument(marketFactors);
				if (result == null) result = caseIdentifiedObject(marketFactors);
				if (result == null) result = caseElement(marketFactors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.FTR: {
				FTR ftr = (FTR)theEObject;
				T result = caseFTR(ftr);
				if (result == null) result = caseAgreement(ftr);
				if (result == null) result = caseDocument(ftr);
				if (result == null) result = caseIdentifiedObject(ftr);
				if (result == null) result = caseElement(ftr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.LOSS_PENALTY_FACTOR: {
				LossPenaltyFactor lossPenaltyFactor = (LossPenaltyFactor)theEObject;
				T result = caseLossPenaltyFactor(lossPenaltyFactor);
				if (result == null) result = caseMarketFactors(lossPenaltyFactor);
				if (result == null) result = caseDocument(lossPenaltyFactor);
				if (result == null) result = caseIdentifiedObject(lossPenaltyFactor);
				if (result == null) result = caseElement(lossPenaltyFactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.RESOURCE_GROUP: {
				ResourceGroup resourceGroup = (ResourceGroup)theEObject;
				T result = caseResourceGroup(resourceGroup);
				if (result == null) result = caseIdentifiedObject(resourceGroup);
				if (result == null) result = caseElement(resourceGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS: {
				UnitInitialConditions unitInitialConditions = (UnitInitialConditions)theEObject;
				T result = caseUnitInitialConditions(unitInitialConditions);
				if (result == null) result = caseIdentifiedObject(unitInitialConditions);
				if (result == null) result = caseElement(unitInitialConditions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.REGISTERED_LOAD: {
				RegisteredLoad registeredLoad = (RegisteredLoad)theEObject;
				T result = caseRegisteredLoad(registeredLoad);
				if (result == null) result = caseRegisteredResource(registeredLoad);
				if (result == null) result = caseIdentifiedObject(registeredLoad);
				if (result == null) result = caseElement(registeredLoad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.RESERVE_REQ_CURVE: {
				ReserveReqCurve reserveReqCurve = (ReserveReqCurve)theEObject;
				T result = caseReserveReqCurve(reserveReqCurve);
				if (result == null) result = caseRegularIntervalSchedule(reserveReqCurve);
				if (result == null) result = caseBasicIntervalSchedule(reserveReqCurve);
				if (result == null) result = caseIdentifiedObject(reserveReqCurve);
				if (result == null) result = caseElement(reserveReqCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.BILATERAL_TRANSACTION: {
				BilateralTransaction bilateralTransaction = (BilateralTransaction)theEObject;
				T result = caseBilateralTransaction(bilateralTransaction);
				if (result == null) result = caseElement(bilateralTransaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.SENSITIVITY_PRICE_CURVE: {
				SensitivityPriceCurve sensitivityPriceCurve = (SensitivityPriceCurve)theEObject;
				T result = caseSensitivityPriceCurve(sensitivityPriceCurve);
				if (result == null) result = caseCurve(sensitivityPriceCurve);
				if (result == null) result = caseIdentifiedObject(sensitivityPriceCurve);
				if (result == null) result = caseElement(sensitivityPriceCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN: {
				TransmissionReliabilityMargin transmissionReliabilityMargin = (TransmissionReliabilityMargin)theEObject;
				T result = caseTransmissionReliabilityMargin(transmissionReliabilityMargin);
				if (result == null) result = caseIdentifiedObject(transmissionReliabilityMargin);
				if (result == null) result = caseElement(transmissionReliabilityMargin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.BID_PRICE_CURVE: {
				BidPriceCurve bidPriceCurve = (BidPriceCurve)theEObject;
				T result = caseBidPriceCurve(bidPriceCurve);
				if (result == null) result = caseCurve(bidPriceCurve);
				if (result == null) result = caseIdentifiedObject(bidPriceCurve);
				if (result == null) result = caseElement(bidPriceCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.RESOURCE_GROUP_REQ: {
				ResourceGroupReq resourceGroupReq = (ResourceGroupReq)theEObject;
				T result = caseResourceGroupReq(resourceGroupReq);
				if (result == null) result = caseIdentifiedObject(resourceGroupReq);
				if (result == null) result = caseElement(resourceGroupReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.CHARGE_PROFILE_DATA: {
				ChargeProfileData chargeProfileData = (ChargeProfileData)theEObject;
				T result = caseChargeProfileData(chargeProfileData);
				if (result == null) result = caseElement(chargeProfileData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.MARKET_CASE_CLEARING: {
				MarketCaseClearing marketCaseClearing = (MarketCaseClearing)theEObject;
				T result = caseMarketCaseClearing(marketCaseClearing);
				if (result == null) result = caseMarketFactors(marketCaseClearing);
				if (result == null) result = caseDocument(marketCaseClearing);
				if (result == null) result = caseIdentifiedObject(marketCaseClearing);
				if (result == null) result = caseElement(marketCaseClearing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarketOperationsPackage.NODE_CONSTRAINT_TERM: {
				NodeConstraintTerm nodeConstraintTerm = (NodeConstraintTerm)theEObject;
				T result = caseNodeConstraintTerm(nodeConstraintTerm);
				if (result == null) result = caseConstraintTerm(nodeConstraintTerm);
				if (result == null) result = caseIdentifiedObject(nodeConstraintTerm);
				if (result == null) result = caseElement(nodeConstraintTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notification Time Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notification Time Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotificationTimeCurve(NotificationTimeCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energy Price Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energy Price Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergyPriceCurve(EnergyPriceCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeter(Meter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Market Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Market Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarketStatement(MarketStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contingency Constraint Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contingency Constraint Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContingencyConstraintLimit(ContingencyConstraintLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registered Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registered Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisteredGenerator(RegisteredGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Bid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Bid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionBid(TransactionBid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityConstraints(SecurityConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Violation Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Violation Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViolationLimit(ViolationLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Up Cost Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Up Cost Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartUpCostCurve(StartUpCostCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Constraint Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Constraint Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultConstraintLimit(DefaultConstraintLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bill Determinant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bill Determinant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBillDeterminant(BillDeterminant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Reduction Price Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Reduction Price Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadReductionPriceCurve(LoadReductionPriceCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Charge Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Charge Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChargeProfile(ChargeProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Settlement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Settlement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSettlement(Settlement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Market</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Market</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarket(Market object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reserve Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reserve Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReserveReq(ReserveReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registered Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registered Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisteredResource(RegisteredResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Market Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Market Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarketProduct(MarketProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generating Bid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generating Bid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratingBid(GeneratingBid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminal Constraint Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminal Constraint Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminalConstraintTerm(TerminalConstraintTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTO(RTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintTerm(ConstraintTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pass Through Bill</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pass Through Bill</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassThroughBill(PassThroughBill object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pnode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pnode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePnode(Pnode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pnode Clearing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pnode Clearing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePnodeClearing(PnodeClearing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Up Time Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Up Time Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartUpTimeCurve(StartUpTimeCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Constraint Sum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Constraint Sum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityConstraintSum(SecurityConstraintSum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Case Constraint Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Case Constraint Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseCaseConstraintLimit(BaseCaseConstraintLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Bid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Bid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductBid(ProductBid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MW Limit Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MW Limit Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMWLimitSchedule(MWLimitSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Market Statement Line Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Market Statement Line Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarketStatementLineItem(MarketStatementLineItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ancillary Service Clearing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ancillary Service Clearing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAncillaryServiceClearing(AncillaryServiceClearing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bid Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bid Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBidSet(BidSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Constraints Clearing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Constraints Clearing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityConstraintsClearing(SecurityConstraintsClearing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Bid Clearing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Bid Clearing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductBidClearing(ProductBidClearing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Bid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Bid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceBid(ResourceBid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capacity Benefit Margin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capacity Benefit Margin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapacityBenefitMargin(CapacityBenefitMargin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduling Coordinator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduling Coordinator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedulingCoordinator(SchedulingCoordinator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ramp Rate Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ramp Rate Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRampRateCurve(RampRateCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bid Clearing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bid Clearing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBidClearing(BidClearing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Bid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Bid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadBid(LoadBid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBid(Bid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flowgate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flowgate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowgate(Flowgate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Market Factors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Market Factors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarketFactors(MarketFactors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FTR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FTR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFTR(FTR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loss Penalty Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loss Penalty Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLossPenaltyFactor(LossPenaltyFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceGroup(ResourceGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Initial Conditions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Initial Conditions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitInitialConditions(UnitInitialConditions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registered Load</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registered Load</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisteredLoad(RegisteredLoad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reserve Req Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reserve Req Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReserveReqCurve(ReserveReqCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bilateral Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bilateral Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBilateralTransaction(BilateralTransaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensitivity Price Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensitivity Price Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensitivityPriceCurve(SensitivityPriceCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transmission Reliability Margin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transmission Reliability Margin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransmissionReliabilityMargin(TransmissionReliabilityMargin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bid Price Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bid Price Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBidPriceCurve(BidPriceCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Group Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Group Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceGroupReq(ResourceGroupReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Charge Profile Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Charge Profile Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChargeProfileData(ChargeProfileData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Market Case Clearing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Market Case Clearing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarketCaseClearing(MarketCaseClearing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Constraint Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Constraint Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeConstraintTerm(NodeConstraintTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedObject(IdentifiedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurve(Curve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLimit(Limit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfile(Profile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganisation(Organisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Organisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Organisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpOrganisation(ErpOrganisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power System Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power System Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerSystemResource(PowerSystemResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agreement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agreement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgreement(Agreement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Interval Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Interval Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicIntervalSchedule(BasicIntervalSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Interval Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Interval Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularIntervalSchedule(RegularIntervalSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MarketOperationsSwitch
