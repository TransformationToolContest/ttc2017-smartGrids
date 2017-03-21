/**
 */
package substationStandard.LNNodes.DomainLNs;

import org.eclipse.emf.ecore.EObject;

import substationStandard.Dataclasses.INC;
import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.LPL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain LN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.DomainLNs.DomainLN#getMode <em>Mode</em>}</li>
 *   <li>{@link substationStandard.LNNodes.DomainLNs.DomainLN#getBehaviour <em>Behaviour</em>}</li>
 *   <li>{@link substationStandard.LNNodes.DomainLNs.DomainLN#getHealth <em>Health</em>}</li>
 *   <li>{@link substationStandard.LNNodes.DomainLNs.DomainLN#getNamePlt <em>Name Plt</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.DomainLNs.DomainLNsPackage#getDomainLN()
 * @model
 * @generated
 */
public interface DomainLN extends EObject {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' reference.
	 * @see #setMode(INC)
	 * @see substationStandard.LNNodes.DomainLNs.DomainLNsPackage#getDomainLN_Mode()
	 * @model required="true"
	 * @generated
	 */
	INC getMode();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.DomainLNs.DomainLN#getMode <em>Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(INC value);

	/**
	 * Returns the value of the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviour</em>' reference.
	 * @see #setBehaviour(INS)
	 * @see substationStandard.LNNodes.DomainLNs.DomainLNsPackage#getDomainLN_Behaviour()
	 * @model required="true"
	 * @generated
	 */
	INS getBehaviour();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.DomainLNs.DomainLN#getBehaviour <em>Behaviour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviour</em>' reference.
	 * @see #getBehaviour()
	 * @generated
	 */
	void setBehaviour(INS value);

	/**
	 * Returns the value of the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Health</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Health</em>' reference.
	 * @see #setHealth(INS)
	 * @see substationStandard.LNNodes.DomainLNs.DomainLNsPackage#getDomainLN_Health()
	 * @model required="true"
	 * @generated
	 */
	INS getHealth();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.DomainLNs.DomainLN#getHealth <em>Health</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health</em>' reference.
	 * @see #getHealth()
	 * @generated
	 */
	void setHealth(INS value);

	/**
	 * Returns the value of the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Plt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Plt</em>' reference.
	 * @see #setNamePlt(LPL)
	 * @see substationStandard.LNNodes.DomainLNs.DomainLNsPackage#getDomainLN_NamePlt()
	 * @model required="true"
	 * @generated
	 */
	LPL getNamePlt();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.DomainLNs.DomainLN#getNamePlt <em>Name Plt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Plt</em>' reference.
	 * @see #getNamePlt()
	 * @generated
	 */
	void setNamePlt(LPL value);

} // DomainLN
