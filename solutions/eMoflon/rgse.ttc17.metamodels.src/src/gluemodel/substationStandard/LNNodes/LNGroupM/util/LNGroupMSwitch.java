/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupM.util;

import gluemodel.substationStandard.LNNodes.DomainLNs.DomainLN;

import gluemodel.substationStandard.LNNodes.LNGroupM.*;

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
 * @see gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage
 * @generated
 */
public class LNGroupMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LNGroupMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupMSwitch() {
		if (modelPackage == null) {
			modelPackage = LNGroupMPackage.eINSTANCE;
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
			case LNGroupMPackage.GROUP_M: {
				GroupM groupM = (GroupM)theEObject;
				T result = caseGroupM(groupM);
				if (result == null) result = caseDomainLN(groupM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupMPackage.MDIF: {
				MDIF mdif = (MDIF)theEObject;
				T result = caseMDIF(mdif);
				if (result == null) result = caseGroupM(mdif);
				if (result == null) result = caseDomainLN(mdif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupMPackage.MHAI: {
				MHAI mhai = (MHAI)theEObject;
				T result = caseMHAI(mhai);
				if (result == null) result = caseGroupM(mhai);
				if (result == null) result = caseDomainLN(mhai);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupMPackage.MHAN: {
				MHAN mhan = (MHAN)theEObject;
				T result = caseMHAN(mhan);
				if (result == null) result = caseGroupM(mhan);
				if (result == null) result = caseDomainLN(mhan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupMPackage.MMXU: {
				MMXU mmxu = (MMXU)theEObject;
				T result = caseMMXU(mmxu);
				if (result == null) result = caseGroupM(mmxu);
				if (result == null) result = caseDomainLN(mmxu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupMPackage.MSQI: {
				MSQI msqi = (MSQI)theEObject;
				T result = caseMSQI(msqi);
				if (result == null) result = caseGroupM(msqi);
				if (result == null) result = caseDomainLN(msqi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupMPackage.MMTR: {
				MMTR mmtr = (MMTR)theEObject;
				T result = caseMMTR(mmtr);
				if (result == null) result = caseGroupM(mmtr);
				if (result == null) result = caseDomainLN(mmtr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupMPackage.MMXN: {
				MMXN mmxn = (MMXN)theEObject;
				T result = caseMMXN(mmxn);
				if (result == null) result = caseGroupM(mmxn);
				if (result == null) result = caseDomainLN(mmxn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupMPackage.MSTA: {
				MSTA msta = (MSTA)theEObject;
				T result = caseMSTA(msta);
				if (result == null) result = caseGroupM(msta);
				if (result == null) result = caseDomainLN(msta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group M</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group M</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupM(GroupM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDIF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDIF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDIF(MDIF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MHAI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MHAI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMHAI(MHAI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MHAN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MHAN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMHAN(MHAN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMXU</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMXU</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMXU(MMXU object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSQI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSQI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSQI(MSQI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMTR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMTR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMTR(MMTR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMXN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMXN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMXN(MMXN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSTA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSTA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSTA(MSTA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain LN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain LN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainLN(DomainLN object) {
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

} //LNGroupMSwitch
