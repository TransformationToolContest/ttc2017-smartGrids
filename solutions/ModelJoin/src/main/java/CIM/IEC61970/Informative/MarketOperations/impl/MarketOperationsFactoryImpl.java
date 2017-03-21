/**
 */
package CIM.IEC61970.Informative.MarketOperations.impl;

import CIM.IEC61970.Informative.MarketOperations.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MarketOperationsFactoryImpl extends EFactoryImpl implements MarketOperationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MarketOperationsFactory init() {
		try {
			MarketOperationsFactory theMarketOperationsFactory = (MarketOperationsFactory)EPackage.Registry.INSTANCE.getEFactory(MarketOperationsPackage.eNS_URI);
			if (theMarketOperationsFactory != null) {
				return theMarketOperationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MarketOperationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketOperationsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MarketOperationsPackage.NOTIFICATION_TIME_CURVE: return createNotificationTimeCurve();
			case MarketOperationsPackage.ENERGY_PRICE_CURVE: return createEnergyPriceCurve();
			case MarketOperationsPackage.METER: return createMeter();
			case MarketOperationsPackage.MARKET_STATEMENT: return createMarketStatement();
			case MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT: return createContingencyConstraintLimit();
			case MarketOperationsPackage.REGISTERED_GENERATOR: return createRegisteredGenerator();
			case MarketOperationsPackage.TRANSACTION_BID: return createTransactionBid();
			case MarketOperationsPackage.SECURITY_CONSTRAINTS: return createSecurityConstraints();
			case MarketOperationsPackage.VIOLATION_LIMIT: return createViolationLimit();
			case MarketOperationsPackage.START_UP_COST_CURVE: return createStartUpCostCurve();
			case MarketOperationsPackage.DEFAULT_CONSTRAINT_LIMIT: return createDefaultConstraintLimit();
			case MarketOperationsPackage.BILL_DETERMINANT: return createBillDeterminant();
			case MarketOperationsPackage.LOAD_REDUCTION_PRICE_CURVE: return createLoadReductionPriceCurve();
			case MarketOperationsPackage.CHARGE_PROFILE: return createChargeProfile();
			case MarketOperationsPackage.SETTLEMENT: return createSettlement();
			case MarketOperationsPackage.MARKET: return createMarket();
			case MarketOperationsPackage.RESERVE_REQ: return createReserveReq();
			case MarketOperationsPackage.REGISTERED_RESOURCE: return createRegisteredResource();
			case MarketOperationsPackage.MARKET_PRODUCT: return createMarketProduct();
			case MarketOperationsPackage.GENERATING_BID: return createGeneratingBid();
			case MarketOperationsPackage.TERMINAL_CONSTRAINT_TERM: return createTerminalConstraintTerm();
			case MarketOperationsPackage.RTO: return createRTO();
			case MarketOperationsPackage.CONSTRAINT_TERM: return createConstraintTerm();
			case MarketOperationsPackage.PASS_THROUGH_BILL: return createPassThroughBill();
			case MarketOperationsPackage.PNODE: return createPnode();
			case MarketOperationsPackage.PNODE_CLEARING: return createPnodeClearing();
			case MarketOperationsPackage.START_UP_TIME_CURVE: return createStartUpTimeCurve();
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM: return createSecurityConstraintSum();
			case MarketOperationsPackage.BASE_CASE_CONSTRAINT_LIMIT: return createBaseCaseConstraintLimit();
			case MarketOperationsPackage.PRODUCT_BID: return createProductBid();
			case MarketOperationsPackage.MW_LIMIT_SCHEDULE: return createMWLimitSchedule();
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM: return createMarketStatementLineItem();
			case MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING: return createAncillaryServiceClearing();
			case MarketOperationsPackage.BID_SET: return createBidSet();
			case MarketOperationsPackage.SECURITY_CONSTRAINTS_CLEARING: return createSecurityConstraintsClearing();
			case MarketOperationsPackage.PRODUCT_BID_CLEARING: return createProductBidClearing();
			case MarketOperationsPackage.RESOURCE_BID: return createResourceBid();
			case MarketOperationsPackage.CAPACITY_BENEFIT_MARGIN: return createCapacityBenefitMargin();
			case MarketOperationsPackage.SCHEDULING_COORDINATOR: return createSchedulingCoordinator();
			case MarketOperationsPackage.RAMP_RATE_CURVE: return createRampRateCurve();
			case MarketOperationsPackage.BID_CLEARING: return createBidClearing();
			case MarketOperationsPackage.LOAD_BID: return createLoadBid();
			case MarketOperationsPackage.BID: return createBid();
			case MarketOperationsPackage.FLOWGATE: return createFlowgate();
			case MarketOperationsPackage.MARKET_FACTORS: return createMarketFactors();
			case MarketOperationsPackage.FTR: return createFTR();
			case MarketOperationsPackage.LOSS_PENALTY_FACTOR: return createLossPenaltyFactor();
			case MarketOperationsPackage.RESOURCE_GROUP: return createResourceGroup();
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS: return createUnitInitialConditions();
			case MarketOperationsPackage.REGISTERED_LOAD: return createRegisteredLoad();
			case MarketOperationsPackage.RESERVE_REQ_CURVE: return createReserveReqCurve();
			case MarketOperationsPackage.BILATERAL_TRANSACTION: return createBilateralTransaction();
			case MarketOperationsPackage.SENSITIVITY_PRICE_CURVE: return createSensitivityPriceCurve();
			case MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN: return createTransmissionReliabilityMargin();
			case MarketOperationsPackage.BID_PRICE_CURVE: return createBidPriceCurve();
			case MarketOperationsPackage.RESOURCE_GROUP_REQ: return createResourceGroupReq();
			case MarketOperationsPackage.CHARGE_PROFILE_DATA: return createChargeProfileData();
			case MarketOperationsPackage.MARKET_CASE_CLEARING: return createMarketCaseClearing();
			case MarketOperationsPackage.NODE_CONSTRAINT_TERM: return createNodeConstraintTerm();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationTimeCurve createNotificationTimeCurve() {
		NotificationTimeCurveImpl notificationTimeCurve = new NotificationTimeCurveImpl();
		return notificationTimeCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyPriceCurve createEnergyPriceCurve() {
		EnergyPriceCurveImpl energyPriceCurve = new EnergyPriceCurveImpl();
		return energyPriceCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meter createMeter() {
		MeterImpl meter = new MeterImpl();
		return meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketStatement createMarketStatement() {
		MarketStatementImpl marketStatement = new MarketStatementImpl();
		return marketStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContingencyConstraintLimit createContingencyConstraintLimit() {
		ContingencyConstraintLimitImpl contingencyConstraintLimit = new ContingencyConstraintLimitImpl();
		return contingencyConstraintLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredGenerator createRegisteredGenerator() {
		RegisteredGeneratorImpl registeredGenerator = new RegisteredGeneratorImpl();
		return registeredGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionBid createTransactionBid() {
		TransactionBidImpl transactionBid = new TransactionBidImpl();
		return transactionBid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConstraints createSecurityConstraints() {
		SecurityConstraintsImpl securityConstraints = new SecurityConstraintsImpl();
		return securityConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViolationLimit createViolationLimit() {
		ViolationLimitImpl violationLimit = new ViolationLimitImpl();
		return violationLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartUpCostCurve createStartUpCostCurve() {
		StartUpCostCurveImpl startUpCostCurve = new StartUpCostCurveImpl();
		return startUpCostCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultConstraintLimit createDefaultConstraintLimit() {
		DefaultConstraintLimitImpl defaultConstraintLimit = new DefaultConstraintLimitImpl();
		return defaultConstraintLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillDeterminant createBillDeterminant() {
		BillDeterminantImpl billDeterminant = new BillDeterminantImpl();
		return billDeterminant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadReductionPriceCurve createLoadReductionPriceCurve() {
		LoadReductionPriceCurveImpl loadReductionPriceCurve = new LoadReductionPriceCurveImpl();
		return loadReductionPriceCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeProfile createChargeProfile() {
		ChargeProfileImpl chargeProfile = new ChargeProfileImpl();
		return chargeProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Settlement createSettlement() {
		SettlementImpl settlement = new SettlementImpl();
		return settlement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Market createMarket() {
		MarketImpl market = new MarketImpl();
		return market;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReserveReq createReserveReq() {
		ReserveReqImpl reserveReq = new ReserveReqImpl();
		return reserveReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredResource createRegisteredResource() {
		RegisteredResourceImpl registeredResource = new RegisteredResourceImpl();
		return registeredResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketProduct createMarketProduct() {
		MarketProductImpl marketProduct = new MarketProductImpl();
		return marketProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratingBid createGeneratingBid() {
		GeneratingBidImpl generatingBid = new GeneratingBidImpl();
		return generatingBid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminalConstraintTerm createTerminalConstraintTerm() {
		TerminalConstraintTermImpl terminalConstraintTerm = new TerminalConstraintTermImpl();
		return terminalConstraintTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTO createRTO() {
		RTOImpl rto = new RTOImpl();
		return rto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintTerm createConstraintTerm() {
		ConstraintTermImpl constraintTerm = new ConstraintTermImpl();
		return constraintTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassThroughBill createPassThroughBill() {
		PassThroughBillImpl passThroughBill = new PassThroughBillImpl();
		return passThroughBill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pnode createPnode() {
		PnodeImpl pnode = new PnodeImpl();
		return pnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PnodeClearing createPnodeClearing() {
		PnodeClearingImpl pnodeClearing = new PnodeClearingImpl();
		return pnodeClearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartUpTimeCurve createStartUpTimeCurve() {
		StartUpTimeCurveImpl startUpTimeCurve = new StartUpTimeCurveImpl();
		return startUpTimeCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConstraintSum createSecurityConstraintSum() {
		SecurityConstraintSumImpl securityConstraintSum = new SecurityConstraintSumImpl();
		return securityConstraintSum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseCaseConstraintLimit createBaseCaseConstraintLimit() {
		BaseCaseConstraintLimitImpl baseCaseConstraintLimit = new BaseCaseConstraintLimitImpl();
		return baseCaseConstraintLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductBid createProductBid() {
		ProductBidImpl productBid = new ProductBidImpl();
		return productBid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MWLimitSchedule createMWLimitSchedule() {
		MWLimitScheduleImpl mwLimitSchedule = new MWLimitScheduleImpl();
		return mwLimitSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketStatementLineItem createMarketStatementLineItem() {
		MarketStatementLineItemImpl marketStatementLineItem = new MarketStatementLineItemImpl();
		return marketStatementLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AncillaryServiceClearing createAncillaryServiceClearing() {
		AncillaryServiceClearingImpl ancillaryServiceClearing = new AncillaryServiceClearingImpl();
		return ancillaryServiceClearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BidSet createBidSet() {
		BidSetImpl bidSet = new BidSetImpl();
		return bidSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConstraintsClearing createSecurityConstraintsClearing() {
		SecurityConstraintsClearingImpl securityConstraintsClearing = new SecurityConstraintsClearingImpl();
		return securityConstraintsClearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductBidClearing createProductBidClearing() {
		ProductBidClearingImpl productBidClearing = new ProductBidClearingImpl();
		return productBidClearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceBid createResourceBid() {
		ResourceBidImpl resourceBid = new ResourceBidImpl();
		return resourceBid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapacityBenefitMargin createCapacityBenefitMargin() {
		CapacityBenefitMarginImpl capacityBenefitMargin = new CapacityBenefitMarginImpl();
		return capacityBenefitMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingCoordinator createSchedulingCoordinator() {
		SchedulingCoordinatorImpl schedulingCoordinator = new SchedulingCoordinatorImpl();
		return schedulingCoordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampRateCurve createRampRateCurve() {
		RampRateCurveImpl rampRateCurve = new RampRateCurveImpl();
		return rampRateCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BidClearing createBidClearing() {
		BidClearingImpl bidClearing = new BidClearingImpl();
		return bidClearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBid createLoadBid() {
		LoadBidImpl loadBid = new LoadBidImpl();
		return loadBid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bid createBid() {
		BidImpl bid = new BidImpl();
		return bid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flowgate createFlowgate() {
		FlowgateImpl flowgate = new FlowgateImpl();
		return flowgate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketFactors createMarketFactors() {
		MarketFactorsImpl marketFactors = new MarketFactorsImpl();
		return marketFactors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FTR createFTR() {
		FTRImpl ftr = new FTRImpl();
		return ftr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LossPenaltyFactor createLossPenaltyFactor() {
		LossPenaltyFactorImpl lossPenaltyFactor = new LossPenaltyFactorImpl();
		return lossPenaltyFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceGroup createResourceGroup() {
		ResourceGroupImpl resourceGroup = new ResourceGroupImpl();
		return resourceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitInitialConditions createUnitInitialConditions() {
		UnitInitialConditionsImpl unitInitialConditions = new UnitInitialConditionsImpl();
		return unitInitialConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredLoad createRegisteredLoad() {
		RegisteredLoadImpl registeredLoad = new RegisteredLoadImpl();
		return registeredLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReserveReqCurve createReserveReqCurve() {
		ReserveReqCurveImpl reserveReqCurve = new ReserveReqCurveImpl();
		return reserveReqCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BilateralTransaction createBilateralTransaction() {
		BilateralTransactionImpl bilateralTransaction = new BilateralTransactionImpl();
		return bilateralTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensitivityPriceCurve createSensitivityPriceCurve() {
		SensitivityPriceCurveImpl sensitivityPriceCurve = new SensitivityPriceCurveImpl();
		return sensitivityPriceCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionReliabilityMargin createTransmissionReliabilityMargin() {
		TransmissionReliabilityMarginImpl transmissionReliabilityMargin = new TransmissionReliabilityMarginImpl();
		return transmissionReliabilityMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BidPriceCurve createBidPriceCurve() {
		BidPriceCurveImpl bidPriceCurve = new BidPriceCurveImpl();
		return bidPriceCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceGroupReq createResourceGroupReq() {
		ResourceGroupReqImpl resourceGroupReq = new ResourceGroupReqImpl();
		return resourceGroupReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeProfileData createChargeProfileData() {
		ChargeProfileDataImpl chargeProfileData = new ChargeProfileDataImpl();
		return chargeProfileData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketCaseClearing createMarketCaseClearing() {
		MarketCaseClearingImpl marketCaseClearing = new MarketCaseClearingImpl();
		return marketCaseClearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeConstraintTerm createNodeConstraintTerm() {
		NodeConstraintTermImpl nodeConstraintTerm = new NodeConstraintTermImpl();
		return nodeConstraintTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketOperationsPackage getMarketOperationsPackage() {
		return (MarketOperationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MarketOperationsPackage getPackage() {
		return MarketOperationsPackage.eINSTANCE;
	}

} //MarketOperationsFactoryImpl
