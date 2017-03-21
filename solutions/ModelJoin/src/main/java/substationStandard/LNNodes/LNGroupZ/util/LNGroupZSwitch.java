/**
 */
package substationStandard.LNNodes.LNGroupZ.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import substationStandard.LNNodes.DomainLNs.DomainLN;

import substationStandard.LNNodes.LNGroupZ.*;

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
 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage
 * @generated
 */
public class LNGroupZSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LNGroupZPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupZSwitch() {
		if (modelPackage == null) {
			modelPackage = LNGroupZPackage.eINSTANCE;
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
			case LNGroupZPackage.GROUP_Z: {
				GroupZ groupZ = (GroupZ)theEObject;
				T result = caseGroupZ(groupZ);
				if (result == null) result = caseDomainLN(groupZ);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupZPackage.ZAXN: {
				ZAXN zaxn = (ZAXN)theEObject;
				T result = caseZAXN(zaxn);
				if (result == null) result = caseGroupZ(zaxn);
				if (result == null) result = caseDomainLN(zaxn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupZPackage.ZGIL: {
				ZGIL zgil = (ZGIL)theEObject;
				T result = caseZGIL(zgil);
				if (result == null) result = caseGroupZ(zgil);
				if (result == null) result = caseDomainLN(zgil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupZPackage.ZBAT: {
				ZBAT zbat = (ZBAT)theEObject;
				T result = caseZBAT(zbat);
				if (result == null) result = caseGroupZ(zbat);
				if (result == null) result = caseDomainLN(zbat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupZPackage.ZLIN: {
				ZLIN zlin = (ZLIN)theEObject;
				T result = caseZLIN(zlin);
				if (result == null) result = caseGroupZ(zlin);
				if (result == null) result = caseDomainLN(zlin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupZPackage.ZMOT: {
				ZMOT zmot = (ZMOT)theEObject;
				T result = caseZMOT(zmot);
				if (result == null) result = caseGroupZ(zmot);
				if (result == null) result = caseDomainLN(zmot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupZPackage.ZREA: {
				ZREA zrea = (ZREA)theEObject;
				T result = caseZREA(zrea);
				if (result == null) result = caseGroupZ(zrea);
				if (result == null) result = caseDomainLN(zrea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupZPackage.ZBSH: {
				ZBSH zbsh = (ZBSH)theEObject;
				T result = caseZBSH(zbsh);
				if (result == null) result = caseGroupZ(zbsh);
				if (result == null) result = caseDomainLN(zbsh);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupZPackage.ZRRC: {
				ZRRC zrrc = (ZRRC)theEObject;
				T result = caseZRRC(zrrc);
				if (result == null) result = caseGroupZ(zrrc);
				if (result == null) result = caseDomainLN(zrrc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupZPackage.ZSAR: {
				ZSAR zsar = (ZSAR)theEObject;
				T result = caseZSAR(zsar);
				if (result == null) result = caseGroupZ(zsar);
				if (result == null) result = caseDomainLN(zsar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupZPackage.ZTCF: {
				ZTCF ztcf = (ZTCF)theEObject;
				T result = caseZTCF(ztcf);
				if (result == null) result = caseGroupZ(ztcf);
				if (result == null) result = caseDomainLN(ztcf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupZPackage.ZTCR: {
				ZTCR ztcr = (ZTCR)theEObject;
				T result = caseZTCR(ztcr);
				if (result == null) result = caseGroupZ(ztcr);
				if (result == null) result = caseDomainLN(ztcr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupZPackage.ZCAB: {
				ZCAB zcab = (ZCAB)theEObject;
				T result = caseZCAB(zcab);
				if (result == null) result = caseGroupZ(zcab);
				if (result == null) result = caseDomainLN(zcab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupZPackage.ZCAP: {
				ZCAP zcap = (ZCAP)theEObject;
				T result = caseZCAP(zcap);
				if (result == null) result = caseGroupZ(zcap);
				if (result == null) result = caseDomainLN(zcap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupZPackage.ZCON: {
				ZCON zcon = (ZCON)theEObject;
				T result = caseZCON(zcon);
				if (result == null) result = caseGroupZ(zcon);
				if (result == null) result = caseDomainLN(zcon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupZPackage.ZGEN: {
				ZGEN zgen = (ZGEN)theEObject;
				T result = caseZGEN(zgen);
				if (result == null) result = caseGroupZ(zgen);
				if (result == null) result = caseDomainLN(zgen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Z</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Z</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupZ(GroupZ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZAXN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZAXN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZAXN(ZAXN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZGIL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZGIL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZGIL(ZGIL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZBAT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZBAT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZBAT(ZBAT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZLIN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZLIN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZLIN(ZLIN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZMOT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZMOT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZMOT(ZMOT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZREA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZREA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZREA(ZREA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZBSH</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZBSH</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZBSH(ZBSH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZRRC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZRRC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZRRC(ZRRC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZSAR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZSAR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZSAR(ZSAR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZTCF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZTCF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZTCF(ZTCF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZTCR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZTCR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZTCR(ZTCR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZCAB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZCAB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZCAB(ZCAB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZCAP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZCAP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZCAP(ZCAP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZCON</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZCON</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZCON(ZCON object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZGEN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZGEN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZGEN(ZGEN object) {
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

} //LNGroupZSwitch
