/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering.impl;

import gluemodel.CIM.IEC61968.PaymentMetering.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class PaymentMeteringFactoryImpl extends EFactoryImpl implements PaymentMeteringFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PaymentMeteringFactory init() {
		try {
			PaymentMeteringFactory thePaymentMeteringFactory = (PaymentMeteringFactory)EPackage.Registry.INSTANCE.getEFactory(PaymentMeteringPackage.eNS_URI);
			if (thePaymentMeteringFactory != null) {
				return thePaymentMeteringFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PaymentMeteringFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMeteringFactoryImpl() {
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
			case PaymentMeteringPackage.CASHIER: return createCashier();
			case PaymentMeteringPackage.TRANSACTOR: return createTransactor();
			case PaymentMeteringPackage.TARIFF_PROFILE: return createTariffProfile();
			case PaymentMeteringPackage.MERCHANT_AGREEMENT: return createMerchantAgreement();
			case PaymentMeteringPackage.VENDOR_SHIFT: return createVendorShift();
			case PaymentMeteringPackage.TRANSACTION: return createTransaction();
			case PaymentMeteringPackage.CHEQUE: return createCheque();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT: return createAuxiliaryAgreement();
			case PaymentMeteringPackage.SHIFT: return createShift();
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL: return createConsumptionTariffInterval();
			case PaymentMeteringPackage.RECEIPT: return createReceipt();
			case PaymentMeteringPackage.DUE: return createDue();
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL: return createBankAccountDetail();
			case PaymentMeteringPackage.LINE_DETAIL: return createLineDetail();
			case PaymentMeteringPackage.SERVICE_SUPPLIER: return createServiceSupplier();
			case PaymentMeteringPackage.ACCOUNT_MOVEMENT: return createAccountMovement();
			case PaymentMeteringPackage.POINT_OF_SALE: return createPointOfSale();
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT: return createAuxiliaryAccount();
			case PaymentMeteringPackage.CHARGE: return createCharge();
			case PaymentMeteringPackage.ACCOUNTING_UNIT: return createAccountingUnit();
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL: return createTimeTariffInterval();
			case PaymentMeteringPackage.CASHIER_SHIFT: return createCashierShift();
			case PaymentMeteringPackage.MERCHANT_ACCOUNT: return createMerchantAccount();
			case PaymentMeteringPackage.TENDER: return createTender();
			case PaymentMeteringPackage.VENDOR: return createVendor();
			case PaymentMeteringPackage.CARD: return createCard();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PaymentMeteringPackage.TRANSACTION_KIND:
				return createTransactionKindFromString(eDataType, initialValue);
			case PaymentMeteringPackage.SUPPLIER_KIND:
				return createSupplierKindFromString(eDataType, initialValue);
			case PaymentMeteringPackage.CHARGE_KIND:
				return createChargeKindFromString(eDataType, initialValue);
			case PaymentMeteringPackage.TENDER_KIND:
				return createTenderKindFromString(eDataType, initialValue);
			case PaymentMeteringPackage.CREDIT_KIND:
				return createCreditKindFromString(eDataType, initialValue);
			case PaymentMeteringPackage.CHEQUE_KIND:
				return createChequeKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PaymentMeteringPackage.TRANSACTION_KIND:
				return convertTransactionKindToString(eDataType, instanceValue);
			case PaymentMeteringPackage.SUPPLIER_KIND:
				return convertSupplierKindToString(eDataType, instanceValue);
			case PaymentMeteringPackage.CHARGE_KIND:
				return convertChargeKindToString(eDataType, instanceValue);
			case PaymentMeteringPackage.TENDER_KIND:
				return convertTenderKindToString(eDataType, instanceValue);
			case PaymentMeteringPackage.CREDIT_KIND:
				return convertCreditKindToString(eDataType, instanceValue);
			case PaymentMeteringPackage.CHEQUE_KIND:
				return convertChequeKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cashier createCashier() {
		CashierImpl cashier = new CashierImpl();
		return cashier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transactor createTransactor() {
		TransactorImpl transactor = new TransactorImpl();
		return transactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TariffProfile createTariffProfile() {
		TariffProfileImpl tariffProfile = new TariffProfileImpl();
		return tariffProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MerchantAgreement createMerchantAgreement() {
		MerchantAgreementImpl merchantAgreement = new MerchantAgreementImpl();
		return merchantAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendorShift createVendorShift() {
		VendorShiftImpl vendorShift = new VendorShiftImpl();
		return vendorShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction createTransaction() {
		TransactionImpl transaction = new TransactionImpl();
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cheque createCheque() {
		ChequeImpl cheque = new ChequeImpl();
		return cheque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryAgreement createAuxiliaryAgreement() {
		AuxiliaryAgreementImpl auxiliaryAgreement = new AuxiliaryAgreementImpl();
		return auxiliaryAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shift createShift() {
		ShiftImpl shift = new ShiftImpl();
		return shift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsumptionTariffInterval createConsumptionTariffInterval() {
		ConsumptionTariffIntervalImpl consumptionTariffInterval = new ConsumptionTariffIntervalImpl();
		return consumptionTariffInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receipt createReceipt() {
		ReceiptImpl receipt = new ReceiptImpl();
		return receipt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Due createDue() {
		DueImpl due = new DueImpl();
		return due;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankAccountDetail createBankAccountDetail() {
		BankAccountDetailImpl bankAccountDetail = new BankAccountDetailImpl();
		return bankAccountDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineDetail createLineDetail() {
		LineDetailImpl lineDetail = new LineDetailImpl();
		return lineDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceSupplier createServiceSupplier() {
		ServiceSupplierImpl serviceSupplier = new ServiceSupplierImpl();
		return serviceSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountMovement createAccountMovement() {
		AccountMovementImpl accountMovement = new AccountMovementImpl();
		return accountMovement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointOfSale createPointOfSale() {
		PointOfSaleImpl pointOfSale = new PointOfSaleImpl();
		return pointOfSale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryAccount createAuxiliaryAccount() {
		AuxiliaryAccountImpl auxiliaryAccount = new AuxiliaryAccountImpl();
		return auxiliaryAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Charge createCharge() {
		ChargeImpl charge = new ChargeImpl();
		return charge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingUnit createAccountingUnit() {
		AccountingUnitImpl accountingUnit = new AccountingUnitImpl();
		return accountingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeTariffInterval createTimeTariffInterval() {
		TimeTariffIntervalImpl timeTariffInterval = new TimeTariffIntervalImpl();
		return timeTariffInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CashierShift createCashierShift() {
		CashierShiftImpl cashierShift = new CashierShiftImpl();
		return cashierShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MerchantAccount createMerchantAccount() {
		MerchantAccountImpl merchantAccount = new MerchantAccountImpl();
		return merchantAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tender createTender() {
		TenderImpl tender = new TenderImpl();
		return tender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vendor createVendor() {
		VendorImpl vendor = new VendorImpl();
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Card createCard() {
		CardImpl card = new CardImpl();
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionKind createTransactionKindFromString(EDataType eDataType, String initialValue) {
		TransactionKind result = TransactionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransactionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplierKind createSupplierKindFromString(EDataType eDataType, String initialValue) {
		SupplierKind result = SupplierKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplierKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeKind createChargeKindFromString(EDataType eDataType, String initialValue) {
		ChargeKind result = ChargeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChargeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TenderKind createTenderKindFromString(EDataType eDataType, String initialValue) {
		TenderKind result = TenderKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTenderKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditKind createCreditKindFromString(EDataType eDataType, String initialValue) {
		CreditKind result = CreditKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCreditKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChequeKind createChequeKindFromString(EDataType eDataType, String initialValue) {
		ChequeKind result = ChequeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChequeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMeteringPackage getPaymentMeteringPackage() {
		return (PaymentMeteringPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PaymentMeteringPackage getPackage() {
		return PaymentMeteringPackage.eINSTANCE;
	}

} //PaymentMeteringFactoryImpl
