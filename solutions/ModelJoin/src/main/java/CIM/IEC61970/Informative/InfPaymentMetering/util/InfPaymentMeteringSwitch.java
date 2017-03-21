/**
 */
package CIM.IEC61970.Informative.InfPaymentMetering.util;

import CIM.Element;

import CIM.IEC61968.Assets.AssetFunction;

import CIM.IEC61968.Common.Agreement;
import CIM.IEC61968.Common.Document;
import CIM.IEC61968.Common.Organisation;

import CIM.IEC61968.Metering.DeviceFunction;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfPaymentMetering.*;

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
 * @see CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage
 * @generated
 */
public class InfPaymentMeteringSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InfPaymentMeteringPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfPaymentMeteringSwitch() {
		if (modelPackage == null) {
			modelPackage = InfPaymentMeteringPackage.eINSTANCE;
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
			case InfPaymentMeteringPackage.TSP_AGREEMENT: {
				TSPAgreement tspAgreement = (TSPAgreement)theEObject;
				T result = caseTSPAgreement(tspAgreement);
				if (result == null) result = caseAgreement(tspAgreement);
				if (result == null) result = caseDocument(tspAgreement);
				if (result == null) result = caseIdentifiedObject(tspAgreement);
				if (result == null) result = caseElement(tspAgreement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfPaymentMeteringPackage.RECEIPT_SUMMARY: {
				ReceiptSummary receiptSummary = (ReceiptSummary)theEObject;
				T result = caseReceiptSummary(receiptSummary);
				if (result == null) result = caseElement(receiptSummary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfPaymentMeteringPackage.TRANSACTION_SUMMARY: {
				TransactionSummary transactionSummary = (TransactionSummary)theEObject;
				T result = caseTransactionSummary(transactionSummary);
				if (result == null) result = caseElement(transactionSummary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfPaymentMeteringPackage.BANK_STATEMENT: {
				BankStatement bankStatement = (BankStatement)theEObject;
				T result = caseBankStatement(bankStatement);
				if (result == null) result = caseDocument(bankStatement);
				if (result == null) result = caseIdentifiedObject(bankStatement);
				if (result == null) result = caseElement(bankStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION: {
				SDPAccountingFunction sdpAccountingFunction = (SDPAccountingFunction)theEObject;
				T result = caseSDPAccountingFunction(sdpAccountingFunction);
				if (result == null) result = caseDeviceFunction(sdpAccountingFunction);
				if (result == null) result = caseAssetFunction(sdpAccountingFunction);
				if (result == null) result = caseIdentifiedObject(sdpAccountingFunction);
				if (result == null) result = caseElement(sdpAccountingFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfPaymentMeteringPackage.CREDIT_REGISTER: {
				CreditRegister creditRegister = (CreditRegister)theEObject;
				T result = caseCreditRegister(creditRegister);
				if (result == null) result = caseIdentifiedObject(creditRegister);
				if (result == null) result = caseElement(creditRegister);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfPaymentMeteringPackage.CHARGE_REGISTER: {
				ChargeRegister chargeRegister = (ChargeRegister)theEObject;
				T result = caseChargeRegister(chargeRegister);
				if (result == null) result = caseIdentifiedObject(chargeRegister);
				if (result == null) result = caseElement(chargeRegister);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfPaymentMeteringPackage.BANK: {
				Bank bank = (Bank)theEObject;
				T result = caseBank(bank);
				if (result == null) result = caseOrganisation(bank);
				if (result == null) result = caseIdentifiedObject(bank);
				if (result == null) result = caseElement(bank);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfPaymentMeteringPackage.TOKEN: {
				Token token = (Token)theEObject;
				T result = caseToken(token);
				if (result == null) result = caseIdentifiedObject(token);
				if (result == null) result = caseElement(token);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSP Agreement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSP Agreement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSPAgreement(TSPAgreement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receipt Summary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receipt Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiptSummary(ReceiptSummary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Summary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionSummary(TransactionSummary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bank Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bank Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBankStatement(BankStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDP Accounting Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDP Accounting Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDPAccountingFunction(SDPAccountingFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Credit Register</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Credit Register</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreditRegister(CreditRegister object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Charge Register</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Charge Register</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChargeRegister(ChargeRegister object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bank</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bank</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBank(Bank object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToken(Token object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Asset Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetFunction(AssetFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceFunction(DeviceFunction object) {
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

} //InfPaymentMeteringSwitch
