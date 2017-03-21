/**
 */
package substationStandard.LNNodes.LNGroupR.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import substationStandard.LNNodes.DomainLNs.DomainLN;

import substationStandard.LNNodes.LNGroupR.*;

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
 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage
 * @generated
 */
public class LNGroupRSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LNGroupRPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupRSwitch() {
		if (modelPackage == null) {
			modelPackage = LNGroupRPackage.eINSTANCE;
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
			case LNGroupRPackage.GROUP_R: {
				GroupR groupR = (GroupR)theEObject;
				T result = caseGroupR(groupR);
				if (result == null) result = caseDomainLN(groupR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupRPackage.RDRE: {
				RDRE rdre = (RDRE)theEObject;
				T result = caseRDRE(rdre);
				if (result == null) result = caseGroupR(rdre);
				if (result == null) result = caseDomainLN(rdre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupRPackage.RDRS: {
				RDRS rdrs = (RDRS)theEObject;
				T result = caseRDRS(rdrs);
				if (result == null) result = caseGroupR(rdrs);
				if (result == null) result = caseDomainLN(rdrs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupRPackage.RPSB: {
				RPSB rpsb = (RPSB)theEObject;
				T result = caseRPSB(rpsb);
				if (result == null) result = caseGroupR(rpsb);
				if (result == null) result = caseDomainLN(rpsb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupRPackage.RBRF: {
				RBRF rbrf = (RBRF)theEObject;
				T result = caseRBRF(rbrf);
				if (result == null) result = caseGroupR(rbrf);
				if (result == null) result = caseDomainLN(rbrf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupRPackage.RADR: {
				RADR radr = (RADR)theEObject;
				T result = caseRADR(radr);
				if (result == null) result = caseGroupR(radr);
				if (result == null) result = caseDomainLN(radr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupRPackage.RBDR: {
				RBDR rbdr = (RBDR)theEObject;
				T result = caseRBDR(rbdr);
				if (result == null) result = caseGroupR(rbdr);
				if (result == null) result = caseDomainLN(rbdr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupRPackage.RDIR: {
				RDIR rdir = (RDIR)theEObject;
				T result = caseRDIR(rdir);
				if (result == null) result = caseGroupR(rdir);
				if (result == null) result = caseDomainLN(rdir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupRPackage.RFLO: {
				RFLO rflo = (RFLO)theEObject;
				T result = caseRFLO(rflo);
				if (result == null) result = caseGroupR(rflo);
				if (result == null) result = caseDomainLN(rflo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupRPackage.RREC: {
				RREC rrec = (RREC)theEObject;
				T result = caseRREC(rrec);
				if (result == null) result = caseGroupR(rrec);
				if (result == null) result = caseDomainLN(rrec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupRPackage.RSYN: {
				RSYN rsyn = (RSYN)theEObject;
				T result = caseRSYN(rsyn);
				if (result == null) result = caseGroupR(rsyn);
				if (result == null) result = caseDomainLN(rsyn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group R</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group R</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupR(GroupR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDRE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDRE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDRE(RDRE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDRS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDRS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDRS(RDRS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPSB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPSB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPSB(RPSB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RBRF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RBRF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRBRF(RBRF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RADR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RADR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRADR(RADR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RBDR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RBDR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRBDR(RBDR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDIR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDIR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDIR(RDIR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RFLO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RFLO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRFLO(RFLO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RREC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RREC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRREC(RREC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RSYN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RSYN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRSYN(RSYN object) {
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

} //LNGroupRSwitch
