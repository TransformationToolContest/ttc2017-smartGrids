/**
 */
package CIM.IEC61970.Informative.InfPaymentMetering.impl;

import CIM.IEC61970.Informative.InfPaymentMetering.*;

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
public class InfPaymentMeteringFactoryImpl extends EFactoryImpl implements InfPaymentMeteringFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfPaymentMeteringFactory init() {
		try {
			InfPaymentMeteringFactory theInfPaymentMeteringFactory = (InfPaymentMeteringFactory)EPackage.Registry.INSTANCE.getEFactory(InfPaymentMeteringPackage.eNS_URI);
			if (theInfPaymentMeteringFactory != null) {
				return theInfPaymentMeteringFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfPaymentMeteringFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfPaymentMeteringFactoryImpl() {
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
			case InfPaymentMeteringPackage.TSP_AGREEMENT: return createTSPAgreement();
			case InfPaymentMeteringPackage.RECEIPT_SUMMARY: return createReceiptSummary();
			case InfPaymentMeteringPackage.TRANSACTION_SUMMARY: return createTransactionSummary();
			case InfPaymentMeteringPackage.BANK_STATEMENT: return createBankStatement();
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION: return createSDPAccountingFunction();
			case InfPaymentMeteringPackage.CREDIT_REGISTER: return createCreditRegister();
			case InfPaymentMeteringPackage.CHARGE_REGISTER: return createChargeRegister();
			case InfPaymentMeteringPackage.BANK: return createBank();
			case InfPaymentMeteringPackage.TOKEN: return createToken();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSPAgreement createTSPAgreement() {
		TSPAgreementImpl tspAgreement = new TSPAgreementImpl();
		return tspAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiptSummary createReceiptSummary() {
		ReceiptSummaryImpl receiptSummary = new ReceiptSummaryImpl();
		return receiptSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionSummary createTransactionSummary() {
		TransactionSummaryImpl transactionSummary = new TransactionSummaryImpl();
		return transactionSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankStatement createBankStatement() {
		BankStatementImpl bankStatement = new BankStatementImpl();
		return bankStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDPAccountingFunction createSDPAccountingFunction() {
		SDPAccountingFunctionImpl sdpAccountingFunction = new SDPAccountingFunctionImpl();
		return sdpAccountingFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditRegister createCreditRegister() {
		CreditRegisterImpl creditRegister = new CreditRegisterImpl();
		return creditRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeRegister createChargeRegister() {
		ChargeRegisterImpl chargeRegister = new ChargeRegisterImpl();
		return chargeRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bank createBank() {
		BankImpl bank = new BankImpl();
		return bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token createToken() {
		TokenImpl token = new TokenImpl();
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfPaymentMeteringPackage getInfPaymentMeteringPackage() {
		return (InfPaymentMeteringPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfPaymentMeteringPackage getPackage() {
		return InfPaymentMeteringPackage.eINSTANCE;
	}

} //InfPaymentMeteringFactoryImpl
