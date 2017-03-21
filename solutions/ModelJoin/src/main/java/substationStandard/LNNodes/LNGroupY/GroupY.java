/**
 */
package substationStandard.LNNodes.LNGroupY;

import substationStandard.Dataclasses.DPL;

import substationStandard.Enumerations.HealthStateKind;

import substationStandard.LNNodes.DomainLNs.DomainLN;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Y</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.GroupY#getEEName <em>EE Name</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.GroupY#getEEHealth <em>EE Health</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getGroupY()
 * @model
 * @generated
 */
public interface GroupY extends DomainLN {
	/**
	 * Returns the value of the '<em><b>EE Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EE Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EE Name</em>' reference.
	 * @see #setEEName(DPL)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getGroupY_EEName()
	 * @model required="true"
	 * @generated
	 */
	DPL getEEName();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.GroupY#getEEName <em>EE Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EE Name</em>' reference.
	 * @see #getEEName()
	 * @generated
	 */
	void setEEName(DPL value);

	/**
	 * Returns the value of the '<em><b>EE Health</b></em>' attribute.
	 * The literals are from the enumeration {@link substationStandard.Enumerations.HealthStateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EE Health</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EE Health</em>' attribute.
	 * @see substationStandard.Enumerations.HealthStateKind
	 * @see #setEEHealth(HealthStateKind)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getGroupY_EEHealth()
	 * @model
	 * @generated
	 */
	HealthStateKind getEEHealth();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.GroupY#getEEHealth <em>EE Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EE Health</em>' attribute.
	 * @see substationStandard.Enumerations.HealthStateKind
	 * @see #getEEHealth()
	 * @generated
	 */
	void setEEHealth(HealthStateKind value);

} // GroupY
