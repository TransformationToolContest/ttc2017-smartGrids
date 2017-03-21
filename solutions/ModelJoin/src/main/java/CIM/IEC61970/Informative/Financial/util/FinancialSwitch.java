/**
 */
package CIM.IEC61970.Informative.Financial.util;

import CIM.Element;

import CIM.IEC61968.Common.Agreement;
import CIM.IEC61968.Common.Document;
import CIM.IEC61968.Common.Organisation;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.Financial.*;

import CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;

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
 * @see CIM.IEC61970.Informative.Financial.FinancialPackage
 * @generated
 */
public class FinancialSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FinancialPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinancialSwitch() {
		if (modelPackage == null) {
			modelPackage = FinancialPackage.eINSTANCE;
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
			case FinancialPackage.FINANCIAL_VERSION: {
				FinancialVersion financialVersion = (FinancialVersion)theEObject;
				T result = caseFinancialVersion(financialVersion);
				if (result == null) result = caseElement(financialVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancialPackage.MARKETER: {
				Marketer marketer = (Marketer)theEObject;
				T result = caseMarketer(marketer);
				if (result == null) result = caseErpOrganisation(marketer);
				if (result == null) result = caseOrganisation(marketer);
				if (result == null) result = caseIdentifiedObject(marketer);
				if (result == null) result = caseElement(marketer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancialPackage.INT_SCHED_AGREEMENT: {
				IntSchedAgreement intSchedAgreement = (IntSchedAgreement)theEObject;
				T result = caseIntSchedAgreement(intSchedAgreement);
				if (result == null) result = caseAgreement(intSchedAgreement);
				if (result == null) result = caseDocument(intSchedAgreement);
				if (result == null) result = caseIdentifiedObject(intSchedAgreement);
				if (result == null) result = caseElement(intSchedAgreement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancialPackage.TRANSMISSION_PROVIDER: {
				TransmissionProvider transmissionProvider = (TransmissionProvider)theEObject;
				T result = caseTransmissionProvider(transmissionProvider);
				if (result == null) result = caseErpOrganisation(transmissionProvider);
				if (result == null) result = caseOrganisation(transmissionProvider);
				if (result == null) result = caseIdentifiedObject(transmissionProvider);
				if (result == null) result = caseElement(transmissionProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancialPackage.TRANSMISSION_PRODUCT: {
				TransmissionProduct transmissionProduct = (TransmissionProduct)theEObject;
				T result = caseTransmissionProduct(transmissionProduct);
				if (result == null) result = caseIdentifiedObject(transmissionProduct);
				if (result == null) result = caseElement(transmissionProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancialPackage.GENERATION_PROVIDER: {
				GenerationProvider generationProvider = (GenerationProvider)theEObject;
				T result = caseGenerationProvider(generationProvider);
				if (result == null) result = caseErpOrganisation(generationProvider);
				if (result == null) result = caseOrganisation(generationProvider);
				if (result == null) result = caseIdentifiedObject(generationProvider);
				if (result == null) result = caseElement(generationProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancialPackage.CUSTOMER_CONSUMER: {
				CustomerConsumer customerConsumer = (CustomerConsumer)theEObject;
				T result = caseCustomerConsumer(customerConsumer);
				if (result == null) result = caseErpOrganisation(customerConsumer);
				if (result == null) result = caseOrganisation(customerConsumer);
				if (result == null) result = caseIdentifiedObject(customerConsumer);
				if (result == null) result = caseElement(customerConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancialPackage.OPEN_ACCESS_PRODUCT: {
				OpenAccessProduct openAccessProduct = (OpenAccessProduct)theEObject;
				T result = caseOpenAccessProduct(openAccessProduct);
				if (result == null) result = caseAgreement(openAccessProduct);
				if (result == null) result = caseDocument(openAccessProduct);
				if (result == null) result = caseIdentifiedObject(openAccessProduct);
				if (result == null) result = caseElement(openAccessProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancialPackage.CONTROL_AREA_OPERATOR: {
				ControlAreaOperator controlAreaOperator = (ControlAreaOperator)theEObject;
				T result = caseControlAreaOperator(controlAreaOperator);
				if (result == null) result = caseErpOrganisation(controlAreaOperator);
				if (result == null) result = caseOrganisation(controlAreaOperator);
				if (result == null) result = caseIdentifiedObject(controlAreaOperator);
				if (result == null) result = caseElement(controlAreaOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinancialVersion(FinancialVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marketer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marketer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarketer(Marketer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Sched Agreement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Sched Agreement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntSchedAgreement(IntSchedAgreement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transmission Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transmission Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransmissionProvider(TransmissionProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transmission Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transmission Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransmissionProduct(TransmissionProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generation Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generation Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerationProvider(GenerationProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerConsumer(CustomerConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Access Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Access Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenAccessProduct(OpenAccessProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Area Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Area Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlAreaOperator(ControlAreaOperator object) {
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

} //FinancialSwitch
