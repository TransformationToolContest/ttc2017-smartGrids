/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupC.util;

import gluemodel.substationStandard.LNNodes.DomainLNs.DomainLN;

import gluemodel.substationStandard.LNNodes.LNGroupC.*;

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
 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage
 * @generated
 */
public class LNGroupCSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LNGroupCPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupCSwitch() {
		if (modelPackage == null) {
			modelPackage = LNGroupCPackage.eINSTANCE;
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
			case LNGroupCPackage.GROUP_C: {
				GroupC groupC = (GroupC)theEObject;
				T result = caseGroupC(groupC);
				if (result == null) result = caseDomainLN(groupC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupCPackage.CALH: {
				CALH calh = (CALH)theEObject;
				T result = caseCALH(calh);
				if (result == null) result = caseGroupC(calh);
				if (result == null) result = caseDomainLN(calh);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupCPackage.CILO: {
				CILO cilo = (CILO)theEObject;
				T result = caseCILO(cilo);
				if (result == null) result = caseGroupC(cilo);
				if (result == null) result = caseDomainLN(cilo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupCPackage.CCGR: {
				CCGR ccgr = (CCGR)theEObject;
				T result = caseCCGR(ccgr);
				if (result == null) result = caseGroupC(ccgr);
				if (result == null) result = caseDomainLN(ccgr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupCPackage.CPOW: {
				CPOW cpow = (CPOW)theEObject;
				T result = caseCPOW(cpow);
				if (result == null) result = caseGroupC(cpow);
				if (result == null) result = caseDomainLN(cpow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupCPackage.CSWI: {
				CSWI cswi = (CSWI)theEObject;
				T result = caseCSWI(cswi);
				if (result == null) result = caseGroupC(cswi);
				if (result == null) result = caseDomainLN(cswi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group C</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group C</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupC(GroupC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CALH</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CALH</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCALH(CALH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CILO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CILO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCILO(CILO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CCGR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CCGR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCCGR(CCGR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CPOW</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CPOW</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCPOW(CPOW object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSWI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSWI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSWI(CSWI object) {
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

} //LNGroupCSwitch
