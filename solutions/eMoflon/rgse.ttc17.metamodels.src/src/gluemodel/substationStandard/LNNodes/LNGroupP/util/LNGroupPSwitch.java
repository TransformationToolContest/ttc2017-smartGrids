/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupP.util;

import gluemodel.substationStandard.LNNodes.DomainLNs.DomainLN;

import gluemodel.substationStandard.LNNodes.LNGroupP.*;

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
 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage
 * @generated
 */
public class LNGroupPSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LNGroupPPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupPSwitch() {
		if (modelPackage == null) {
			modelPackage = LNGroupPPackage.eINSTANCE;
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
			case LNGroupPPackage.GROUP_P: {
				GroupP groupP = (GroupP)theEObject;
				T result = caseGroupP(groupP);
				if (result == null) result = caseDomainLN(groupP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PDIF: {
				PDIF pdif = (PDIF)theEObject;
				T result = casePDIF(pdif);
				if (result == null) result = caseGroupP(pdif);
				if (result == null) result = caseDomainLN(pdif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PDIR: {
				PDIR pdir = (PDIR)theEObject;
				T result = casePDIR(pdir);
				if (result == null) result = caseGroupP(pdir);
				if (result == null) result = caseDomainLN(pdir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PFRC: {
				PFRC pfrc = (PFRC)theEObject;
				T result = casePFRC(pfrc);
				if (result == null) result = caseGroupP(pfrc);
				if (result == null) result = caseDomainLN(pfrc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PHAR: {
				PHAR phar = (PHAR)theEObject;
				T result = casePHAR(phar);
				if (result == null) result = caseGroupP(phar);
				if (result == null) result = caseDomainLN(phar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.POPF: {
				POPF popf = (POPF)theEObject;
				T result = casePOPF(popf);
				if (result == null) result = caseGroupP(popf);
				if (result == null) result = caseDomainLN(popf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PPAM: {
				PPAM ppam = (PPAM)theEObject;
				T result = casePPAM(ppam);
				if (result == null) result = caseGroupP(ppam);
				if (result == null) result = caseDomainLN(ppam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PDIS: {
				PDIS pdis = (PDIS)theEObject;
				T result = casePDIS(pdis);
				if (result == null) result = caseGroupP(pdis);
				if (result == null) result = caseDomainLN(pdis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PDOP: {
				PDOP pdop = (PDOP)theEObject;
				T result = casePDOP(pdop);
				if (result == null) result = caseGroupP(pdop);
				if (result == null) result = caseDomainLN(pdop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PHIZ: {
				PHIZ phiz = (PHIZ)theEObject;
				T result = casePHIZ(phiz);
				if (result == null) result = caseGroupP(phiz);
				if (result == null) result = caseDomainLN(phiz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PIOC: {
				PIOC pioc = (PIOC)theEObject;
				T result = casePIOC(pioc);
				if (result == null) result = caseGroupP(pioc);
				if (result == null) result = caseDomainLN(pioc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PMRI: {
				PMRI pmri = (PMRI)theEObject;
				T result = casePMRI(pmri);
				if (result == null) result = caseGroupP(pmri);
				if (result == null) result = caseDomainLN(pmri);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PMSS: {
				PMSS pmss = (PMSS)theEObject;
				T result = casePMSS(pmss);
				if (result == null) result = caseGroupP(pmss);
				if (result == null) result = caseDomainLN(pmss);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PSCH: {
				PSCH psch = (PSCH)theEObject;
				T result = casePSCH(psch);
				if (result == null) result = caseGroupP(psch);
				if (result == null) result = caseDomainLN(psch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PSDE: {
				PSDE psde = (PSDE)theEObject;
				T result = casePSDE(psde);
				if (result == null) result = caseGroupP(psde);
				if (result == null) result = caseDomainLN(psde);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PDUP: {
				PDUP pdup = (PDUP)theEObject;
				T result = casePDUP(pdup);
				if (result == null) result = caseGroupP(pdup);
				if (result == null) result = caseDomainLN(pdup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PTEF: {
				PTEF ptef = (PTEF)theEObject;
				T result = casePTEF(ptef);
				if (result == null) result = caseGroupP(ptef);
				if (result == null) result = caseDomainLN(ptef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PTOC: {
				PTOC ptoc = (PTOC)theEObject;
				T result = casePTOC(ptoc);
				if (result == null) result = caseGroupP(ptoc);
				if (result == null) result = caseDomainLN(ptoc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PTOF: {
				PTOF ptof = (PTOF)theEObject;
				T result = casePTOF(ptof);
				if (result == null) result = caseGroupP(ptof);
				if (result == null) result = caseDomainLN(ptof);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PTOV: {
				PTOV ptov = (PTOV)theEObject;
				T result = casePTOV(ptov);
				if (result == null) result = caseGroupP(ptov);
				if (result == null) result = caseDomainLN(ptov);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PTTR: {
				PTTR pttr = (PTTR)theEObject;
				T result = casePTTR(pttr);
				if (result == null) result = caseGroupP(pttr);
				if (result == null) result = caseDomainLN(pttr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PTUC: {
				PTUC ptuc = (PTUC)theEObject;
				T result = casePTUC(ptuc);
				if (result == null) result = caseGroupP(ptuc);
				if (result == null) result = caseDomainLN(ptuc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PTUF: {
				PTUF ptuf = (PTUF)theEObject;
				T result = casePTUF(ptuf);
				if (result == null) result = caseGroupP(ptuf);
				if (result == null) result = caseDomainLN(ptuf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PVOC: {
				PVOC pvoc = (PVOC)theEObject;
				T result = casePVOC(pvoc);
				if (result == null) result = caseGroupP(pvoc);
				if (result == null) result = caseDomainLN(pvoc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PVPH: {
				PVPH pvph = (PVPH)theEObject;
				T result = casePVPH(pvph);
				if (result == null) result = caseGroupP(pvph);
				if (result == null) result = caseDomainLN(pvph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PTRC: {
				PTRC ptrc = (PTRC)theEObject;
				T result = casePTRC(ptrc);
				if (result == null) result = caseGroupP(ptrc);
				if (result == null) result = caseDomainLN(ptrc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PTUV: {
				PTUV ptuv = (PTUV)theEObject;
				T result = casePTUV(ptuv);
				if (result == null) result = caseGroupP(ptuv);
				if (result == null) result = caseDomainLN(ptuv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PUPF: {
				PUPF pupf = (PUPF)theEObject;
				T result = casePUPF(pupf);
				if (result == null) result = caseGroupP(pupf);
				if (result == null) result = caseDomainLN(pupf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupPPackage.PZSU: {
				PZSU pzsu = (PZSU)theEObject;
				T result = casePZSU(pzsu);
				if (result == null) result = caseGroupP(pzsu);
				if (result == null) result = caseDomainLN(pzsu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group P</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group P</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupP(GroupP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PDIF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PDIF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePDIF(PDIF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PDIR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PDIR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePDIR(PDIR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PFRC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PFRC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePFRC(PFRC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PHAR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PHAR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePHAR(PHAR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>POPF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>POPF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePOPF(POPF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PPAM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PPAM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePPAM(PPAM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PDIS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PDIS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePDIS(PDIS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PDOP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PDOP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePDOP(PDOP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PHIZ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PHIZ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePHIZ(PHIZ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PIOC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PIOC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePIOC(PIOC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PMRI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PMRI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePMRI(PMRI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PMSS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PMSS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePMSS(PMSS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PSCH</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PSCH</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSCH(PSCH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PSDE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PSDE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSDE(PSDE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PDUP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PDUP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePDUP(PDUP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PTEF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PTEF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTEF(PTEF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PTOC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PTOC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTOC(PTOC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PTOF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PTOF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTOF(PTOF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PTOV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PTOV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTOV(PTOV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PTTR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PTTR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTTR(PTTR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PTUC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PTUC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTUC(PTUC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PTUF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PTUF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTUF(PTUF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PVOC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PVOC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePVOC(PVOC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PVPH</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PVPH</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePVPH(PVPH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PTRC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PTRC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTRC(PTRC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PTUV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PTUV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTUV(PTUV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PUPF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PUPF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePUPF(PUPF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PZSU</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PZSU</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePZSU(PZSU object) {
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

} //LNGroupPSwitch
