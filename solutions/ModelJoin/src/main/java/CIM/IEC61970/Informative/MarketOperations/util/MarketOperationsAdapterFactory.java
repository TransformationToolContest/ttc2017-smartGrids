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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage
 * @generated
 */
public class MarketOperationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MarketOperationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketOperationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MarketOperationsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarketOperationsSwitch<Adapter> modelSwitch =
		new MarketOperationsSwitch<Adapter>() {
			@Override
			public Adapter caseNotificationTimeCurve(NotificationTimeCurve object) {
				return createNotificationTimeCurveAdapter();
			}
			@Override
			public Adapter caseEnergyPriceCurve(EnergyPriceCurve object) {
				return createEnergyPriceCurveAdapter();
			}
			@Override
			public Adapter caseMeter(Meter object) {
				return createMeterAdapter();
			}
			@Override
			public Adapter caseMarketStatement(MarketStatement object) {
				return createMarketStatementAdapter();
			}
			@Override
			public Adapter caseContingencyConstraintLimit(ContingencyConstraintLimit object) {
				return createContingencyConstraintLimitAdapter();
			}
			@Override
			public Adapter caseRegisteredGenerator(RegisteredGenerator object) {
				return createRegisteredGeneratorAdapter();
			}
			@Override
			public Adapter caseTransactionBid(TransactionBid object) {
				return createTransactionBidAdapter();
			}
			@Override
			public Adapter caseSecurityConstraints(SecurityConstraints object) {
				return createSecurityConstraintsAdapter();
			}
			@Override
			public Adapter caseViolationLimit(ViolationLimit object) {
				return createViolationLimitAdapter();
			}
			@Override
			public Adapter caseStartUpCostCurve(StartUpCostCurve object) {
				return createStartUpCostCurveAdapter();
			}
			@Override
			public Adapter caseDefaultConstraintLimit(DefaultConstraintLimit object) {
				return createDefaultConstraintLimitAdapter();
			}
			@Override
			public Adapter caseBillDeterminant(BillDeterminant object) {
				return createBillDeterminantAdapter();
			}
			@Override
			public Adapter caseLoadReductionPriceCurve(LoadReductionPriceCurve object) {
				return createLoadReductionPriceCurveAdapter();
			}
			@Override
			public Adapter caseChargeProfile(ChargeProfile object) {
				return createChargeProfileAdapter();
			}
			@Override
			public Adapter caseSettlement(Settlement object) {
				return createSettlementAdapter();
			}
			@Override
			public Adapter caseMarket(Market object) {
				return createMarketAdapter();
			}
			@Override
			public Adapter caseReserveReq(ReserveReq object) {
				return createReserveReqAdapter();
			}
			@Override
			public Adapter caseRegisteredResource(RegisteredResource object) {
				return createRegisteredResourceAdapter();
			}
			@Override
			public Adapter caseMarketProduct(MarketProduct object) {
				return createMarketProductAdapter();
			}
			@Override
			public Adapter caseGeneratingBid(GeneratingBid object) {
				return createGeneratingBidAdapter();
			}
			@Override
			public Adapter caseTerminalConstraintTerm(TerminalConstraintTerm object) {
				return createTerminalConstraintTermAdapter();
			}
			@Override
			public Adapter caseRTO(RTO object) {
				return createRTOAdapter();
			}
			@Override
			public Adapter caseConstraintTerm(ConstraintTerm object) {
				return createConstraintTermAdapter();
			}
			@Override
			public Adapter casePassThroughBill(PassThroughBill object) {
				return createPassThroughBillAdapter();
			}
			@Override
			public Adapter casePnode(Pnode object) {
				return createPnodeAdapter();
			}
			@Override
			public Adapter casePnodeClearing(PnodeClearing object) {
				return createPnodeClearingAdapter();
			}
			@Override
			public Adapter caseStartUpTimeCurve(StartUpTimeCurve object) {
				return createStartUpTimeCurveAdapter();
			}
			@Override
			public Adapter caseSecurityConstraintSum(SecurityConstraintSum object) {
				return createSecurityConstraintSumAdapter();
			}
			@Override
			public Adapter caseBaseCaseConstraintLimit(BaseCaseConstraintLimit object) {
				return createBaseCaseConstraintLimitAdapter();
			}
			@Override
			public Adapter caseProductBid(ProductBid object) {
				return createProductBidAdapter();
			}
			@Override
			public Adapter caseMWLimitSchedule(MWLimitSchedule object) {
				return createMWLimitScheduleAdapter();
			}
			@Override
			public Adapter caseMarketStatementLineItem(MarketStatementLineItem object) {
				return createMarketStatementLineItemAdapter();
			}
			@Override
			public Adapter caseAncillaryServiceClearing(AncillaryServiceClearing object) {
				return createAncillaryServiceClearingAdapter();
			}
			@Override
			public Adapter caseBidSet(BidSet object) {
				return createBidSetAdapter();
			}
			@Override
			public Adapter caseSecurityConstraintsClearing(SecurityConstraintsClearing object) {
				return createSecurityConstraintsClearingAdapter();
			}
			@Override
			public Adapter caseProductBidClearing(ProductBidClearing object) {
				return createProductBidClearingAdapter();
			}
			@Override
			public Adapter caseResourceBid(ResourceBid object) {
				return createResourceBidAdapter();
			}
			@Override
			public Adapter caseCapacityBenefitMargin(CapacityBenefitMargin object) {
				return createCapacityBenefitMarginAdapter();
			}
			@Override
			public Adapter caseSchedulingCoordinator(SchedulingCoordinator object) {
				return createSchedulingCoordinatorAdapter();
			}
			@Override
			public Adapter caseRampRateCurve(RampRateCurve object) {
				return createRampRateCurveAdapter();
			}
			@Override
			public Adapter caseBidClearing(BidClearing object) {
				return createBidClearingAdapter();
			}
			@Override
			public Adapter caseLoadBid(LoadBid object) {
				return createLoadBidAdapter();
			}
			@Override
			public Adapter caseBid(Bid object) {
				return createBidAdapter();
			}
			@Override
			public Adapter caseFlowgate(Flowgate object) {
				return createFlowgateAdapter();
			}
			@Override
			public Adapter caseMarketFactors(MarketFactors object) {
				return createMarketFactorsAdapter();
			}
			@Override
			public Adapter caseFTR(FTR object) {
				return createFTRAdapter();
			}
			@Override
			public Adapter caseLossPenaltyFactor(LossPenaltyFactor object) {
				return createLossPenaltyFactorAdapter();
			}
			@Override
			public Adapter caseResourceGroup(ResourceGroup object) {
				return createResourceGroupAdapter();
			}
			@Override
			public Adapter caseUnitInitialConditions(UnitInitialConditions object) {
				return createUnitInitialConditionsAdapter();
			}
			@Override
			public Adapter caseRegisteredLoad(RegisteredLoad object) {
				return createRegisteredLoadAdapter();
			}
			@Override
			public Adapter caseReserveReqCurve(ReserveReqCurve object) {
				return createReserveReqCurveAdapter();
			}
			@Override
			public Adapter caseBilateralTransaction(BilateralTransaction object) {
				return createBilateralTransactionAdapter();
			}
			@Override
			public Adapter caseSensitivityPriceCurve(SensitivityPriceCurve object) {
				return createSensitivityPriceCurveAdapter();
			}
			@Override
			public Adapter caseTransmissionReliabilityMargin(TransmissionReliabilityMargin object) {
				return createTransmissionReliabilityMarginAdapter();
			}
			@Override
			public Adapter caseBidPriceCurve(BidPriceCurve object) {
				return createBidPriceCurveAdapter();
			}
			@Override
			public Adapter caseResourceGroupReq(ResourceGroupReq object) {
				return createResourceGroupReqAdapter();
			}
			@Override
			public Adapter caseChargeProfileData(ChargeProfileData object) {
				return createChargeProfileDataAdapter();
			}
			@Override
			public Adapter caseMarketCaseClearing(MarketCaseClearing object) {
				return createMarketCaseClearingAdapter();
			}
			@Override
			public Adapter caseNodeConstraintTerm(NodeConstraintTerm object) {
				return createNodeConstraintTermAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseIdentifiedObject(IdentifiedObject object) {
				return createIdentifiedObjectAdapter();
			}
			@Override
			public Adapter caseCurve(Curve object) {
				return createCurveAdapter();
			}
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
			}
			@Override
			public Adapter caseLimit(Limit object) {
				return createLimitAdapter();
			}
			@Override
			public Adapter caseProfile(Profile object) {
				return createProfileAdapter();
			}
			@Override
			public Adapter caseOrganisation(Organisation object) {
				return createOrganisationAdapter();
			}
			@Override
			public Adapter caseErpOrganisation(ErpOrganisation object) {
				return createErpOrganisationAdapter();
			}
			@Override
			public Adapter casePowerSystemResource(PowerSystemResource object) {
				return createPowerSystemResourceAdapter();
			}
			@Override
			public Adapter caseAgreement(Agreement object) {
				return createAgreementAdapter();
			}
			@Override
			public Adapter caseBasicIntervalSchedule(BasicIntervalSchedule object) {
				return createBasicIntervalScheduleAdapter();
			}
			@Override
			public Adapter caseRegularIntervalSchedule(RegularIntervalSchedule object) {
				return createRegularIntervalScheduleAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.NotificationTimeCurve <em>Notification Time Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.NotificationTimeCurve
	 * @generated
	 */
	public Adapter createNotificationTimeCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.EnergyPriceCurve <em>Energy Price Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.EnergyPriceCurve
	 * @generated
	 */
	public Adapter createEnergyPriceCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.Meter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.Meter
	 * @generated
	 */
	public Adapter createMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatement <em>Market Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketStatement
	 * @generated
	 */
	public Adapter createMarketStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit <em>Contingency Constraint Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit
	 * @generated
	 */
	public Adapter createContingencyConstraintLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator <em>Registered Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator
	 * @generated
	 */
	public Adapter createRegisteredGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.TransactionBid <em>Transaction Bid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.TransactionBid
	 * @generated
	 */
	public Adapter createTransactionBidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.SecurityConstraints <em>Security Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.SecurityConstraints
	 * @generated
	 */
	public Adapter createSecurityConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.ViolationLimit <em>Violation Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.ViolationLimit
	 * @generated
	 */
	public Adapter createViolationLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.StartUpCostCurve <em>Start Up Cost Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.StartUpCostCurve
	 * @generated
	 */
	public Adapter createStartUpCostCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.DefaultConstraintLimit <em>Default Constraint Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.DefaultConstraintLimit
	 * @generated
	 */
	public Adapter createDefaultConstraintLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.BillDeterminant <em>Bill Determinant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.BillDeterminant
	 * @generated
	 */
	public Adapter createBillDeterminantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.LoadReductionPriceCurve <em>Load Reduction Price Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.LoadReductionPriceCurve
	 * @generated
	 */
	public Adapter createLoadReductionPriceCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.ChargeProfile <em>Charge Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.ChargeProfile
	 * @generated
	 */
	public Adapter createChargeProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.Settlement <em>Settlement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.Settlement
	 * @generated
	 */
	public Adapter createSettlementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.Market <em>Market</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.Market
	 * @generated
	 */
	public Adapter createMarketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.ReserveReq <em>Reserve Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.ReserveReq
	 * @generated
	 */
	public Adapter createReserveReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.RegisteredResource <em>Registered Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.RegisteredResource
	 * @generated
	 */
	public Adapter createRegisteredResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.MarketProduct <em>Market Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketProduct
	 * @generated
	 */
	public Adapter createMarketProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid <em>Generating Bid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.GeneratingBid
	 * @generated
	 */
	public Adapter createGeneratingBidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.TerminalConstraintTerm <em>Terminal Constraint Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.TerminalConstraintTerm
	 * @generated
	 */
	public Adapter createTerminalConstraintTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.RTO <em>RTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.RTO
	 * @generated
	 */
	public Adapter createRTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.ConstraintTerm <em>Constraint Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.ConstraintTerm
	 * @generated
	 */
	public Adapter createConstraintTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill <em>Pass Through Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.PassThroughBill
	 * @generated
	 */
	public Adapter createPassThroughBillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.Pnode <em>Pnode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.Pnode
	 * @generated
	 */
	public Adapter createPnodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.PnodeClearing <em>Pnode Clearing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.PnodeClearing
	 * @generated
	 */
	public Adapter createPnodeClearingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.StartUpTimeCurve <em>Start Up Time Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.StartUpTimeCurve
	 * @generated
	 */
	public Adapter createStartUpTimeCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum <em>Security Constraint Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum
	 * @generated
	 */
	public Adapter createSecurityConstraintSumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.BaseCaseConstraintLimit <em>Base Case Constraint Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.BaseCaseConstraintLimit
	 * @generated
	 */
	public Adapter createBaseCaseConstraintLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.ProductBid <em>Product Bid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.ProductBid
	 * @generated
	 */
	public Adapter createProductBidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.MWLimitSchedule <em>MW Limit Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.MWLimitSchedule
	 * @generated
	 */
	public Adapter createMWLimitScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem <em>Market Statement Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem
	 * @generated
	 */
	public Adapter createMarketStatementLineItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.AncillaryServiceClearing <em>Ancillary Service Clearing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.AncillaryServiceClearing
	 * @generated
	 */
	public Adapter createAncillaryServiceClearingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.BidSet <em>Bid Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.BidSet
	 * @generated
	 */
	public Adapter createBidSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.SecurityConstraintsClearing <em>Security Constraints Clearing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.SecurityConstraintsClearing
	 * @generated
	 */
	public Adapter createSecurityConstraintsClearingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.ProductBidClearing <em>Product Bid Clearing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.ProductBidClearing
	 * @generated
	 */
	public Adapter createProductBidClearingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.ResourceBid <em>Resource Bid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.ResourceBid
	 * @generated
	 */
	public Adapter createResourceBidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.CapacityBenefitMargin <em>Capacity Benefit Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.CapacityBenefitMargin
	 * @generated
	 */
	public Adapter createCapacityBenefitMarginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.SchedulingCoordinator <em>Scheduling Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.SchedulingCoordinator
	 * @generated
	 */
	public Adapter createSchedulingCoordinatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.RampRateCurve <em>Ramp Rate Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.RampRateCurve
	 * @generated
	 */
	public Adapter createRampRateCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.BidClearing <em>Bid Clearing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.BidClearing
	 * @generated
	 */
	public Adapter createBidClearingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.LoadBid <em>Load Bid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.LoadBid
	 * @generated
	 */
	public Adapter createLoadBidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.Bid <em>Bid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.Bid
	 * @generated
	 */
	public Adapter createBidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.Flowgate <em>Flowgate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.Flowgate
	 * @generated
	 */
	public Adapter createFlowgateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.MarketFactors <em>Market Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketFactors
	 * @generated
	 */
	public Adapter createMarketFactorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.FTR <em>FTR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.FTR
	 * @generated
	 */
	public Adapter createFTRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.LossPenaltyFactor <em>Loss Penalty Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.LossPenaltyFactor
	 * @generated
	 */
	public Adapter createLossPenaltyFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.ResourceGroup <em>Resource Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.ResourceGroup
	 * @generated
	 */
	public Adapter createResourceGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions <em>Unit Initial Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions
	 * @generated
	 */
	public Adapter createUnitInitialConditionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.RegisteredLoad <em>Registered Load</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.RegisteredLoad
	 * @generated
	 */
	public Adapter createRegisteredLoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.ReserveReqCurve <em>Reserve Req Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.ReserveReqCurve
	 * @generated
	 */
	public Adapter createReserveReqCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.BilateralTransaction <em>Bilateral Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.BilateralTransaction
	 * @generated
	 */
	public Adapter createBilateralTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.SensitivityPriceCurve <em>Sensitivity Price Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.SensitivityPriceCurve
	 * @generated
	 */
	public Adapter createSensitivityPriceCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.TransmissionReliabilityMargin <em>Transmission Reliability Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.TransmissionReliabilityMargin
	 * @generated
	 */
	public Adapter createTransmissionReliabilityMarginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.BidPriceCurve <em>Bid Price Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.BidPriceCurve
	 * @generated
	 */
	public Adapter createBidPriceCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.ResourceGroupReq <em>Resource Group Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.ResourceGroupReq
	 * @generated
	 */
	public Adapter createResourceGroupReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.ChargeProfileData <em>Charge Profile Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.ChargeProfileData
	 * @generated
	 */
	public Adapter createChargeProfileDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.MarketCaseClearing <em>Market Case Clearing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketCaseClearing
	 * @generated
	 */
	public Adapter createMarketCaseClearingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.MarketOperations.NodeConstraintTerm <em>Node Constraint Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.MarketOperations.NodeConstraintTerm
	 * @generated
	 */
	public Adapter createNodeConstraintTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Core.IdentifiedObject <em>Identified Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Core.IdentifiedObject
	 * @generated
	 */
	public Adapter createIdentifiedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Core.Curve <em>Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Core.Curve
	 * @generated
	 */
	public Adapter createCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61968.Common.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61968.Common.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Meas.Limit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Meas.Limit
	 * @generated
	 */
	public Adapter createLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.EnergyScheduling.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.Profile
	 * @generated
	 */
	public Adapter createProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61968.Common.Organisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61968.Common.Organisation
	 * @generated
	 */
	public Adapter createOrganisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation <em>Erp Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation
	 * @generated
	 */
	public Adapter createErpOrganisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Core.PowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Core.PowerSystemResource
	 * @generated
	 */
	public Adapter createPowerSystemResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61968.Common.Agreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61968.Common.Agreement
	 * @generated
	 */
	public Adapter createAgreementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Core.BasicIntervalSchedule <em>Basic Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Core.BasicIntervalSchedule
	 * @generated
	 */
	public Adapter createBasicIntervalScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM.IEC61970.Core.RegularIntervalSchedule <em>Regular Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM.IEC61970.Core.RegularIntervalSchedule
	 * @generated
	 */
	public Adapter createRegularIntervalScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MarketOperationsAdapterFactory
