/**
 */
package substationStandard.LNNodes.LNGroupP;

import substationStandard.Dataclasses.INC;

import substationStandard.LNNodes.DomainLNs.DomainLN;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.GroupP#getOpCntRs <em>Op Cnt Rs</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getGroupP()
 * @model
 * @generated
 */
public interface GroupP extends DomainLN {
	/**
	 * Returns the value of the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Cnt Rs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Cnt Rs</em>' reference.
	 * @see #setOpCntRs(INC)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getGroupP_OpCntRs()
	 * @model required="true"
	 * @generated
	 */
	INC getOpCntRs();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.GroupP#getOpCntRs <em>Op Cnt Rs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Cnt Rs</em>' reference.
	 * @see #getOpCntRs()
	 * @generated
	 */
	void setOpCntRs(INC value);

} // GroupP
