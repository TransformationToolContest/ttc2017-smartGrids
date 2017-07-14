/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupY.util;

import gluemodel.substationStandard.LNNodes.DomainLNs.DomainLN;

import gluemodel.substationStandard.LNNodes.LNGroupY.*;

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
 * @see gluemodel.substationStandard.LNNodes.LNGroupY.LNGroupYPackage
 * @generated
 */
public class LNGroupYSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LNGroupYPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupYSwitch() {
		if (modelPackage == null) {
			modelPackage = LNGroupYPackage.eINSTANCE;
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
			case LNGroupYPackage.GROUP_Y: {
				GroupY groupY = (GroupY)theEObject;
				T result = caseGroupY(groupY);
				if (result == null) result = caseDomainLN(groupY);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupYPackage.YEFN: {
				YEFN yefn = (YEFN)theEObject;
				T result = caseYEFN(yefn);
				if (result == null) result = caseGroupY(yefn);
				if (result == null) result = caseDomainLN(yefn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupYPackage.YLTC: {
				YLTC yltc = (YLTC)theEObject;
				T result = caseYLTC(yltc);
				if (result == null) result = caseGroupY(yltc);
				if (result == null) result = caseDomainLN(yltc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupYPackage.YPSH: {
				YPSH ypsh = (YPSH)theEObject;
				T result = caseYPSH(ypsh);
				if (result == null) result = caseGroupY(ypsh);
				if (result == null) result = caseDomainLN(ypsh);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LNGroupYPackage.YPTR: {
				YPTR yptr = (YPTR)theEObject;
				T result = caseYPTR(yptr);
				if (result == null) result = caseGroupY(yptr);
				if (result == null) result = caseDomainLN(yptr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Y</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Y</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupY(GroupY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEFN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEFN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEFN(YEFN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YLTC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YLTC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYLTC(YLTC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YPSH</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YPSH</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYPSH(YPSH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YPTR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YPTR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYPTR(YPTR object) {
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

} //LNGroupYSwitch
