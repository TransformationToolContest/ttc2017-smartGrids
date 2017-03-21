/**
 */
package substationStandard.LNNodes.LNGroupA;

import substationStandard.Dataclasses.INC;
import substationStandard.Dataclasses.SPS;

import substationStandard.LNNodes.DomainLNs.DomainLN;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.GroupA#getLoc <em>Loc</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.GroupA#getOpCntRs <em>Op Cnt Rs</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.GroupA#getAuto <em>Auto</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getGroupA()
 * @model
 * @generated
 */
public interface GroupA extends DomainLN {
	/**
	 * Returns the value of the '<em><b>Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loc</em>' reference.
	 * @see #setLoc(SPS)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getGroupA_Loc()
	 * @model required="true"
	 * @generated
	 */
	SPS getLoc();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.GroupA#getLoc <em>Loc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc</em>' reference.
	 * @see #getLoc()
	 * @generated
	 */
	void setLoc(SPS value);

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
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getGroupA_OpCntRs()
	 * @model required="true"
	 * @generated
	 */
	INC getOpCntRs();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.GroupA#getOpCntRs <em>Op Cnt Rs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Cnt Rs</em>' reference.
	 * @see #getOpCntRs()
	 * @generated
	 */
	void setOpCntRs(INC value);

	/**
	 * Returns the value of the '<em><b>Auto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto</em>' reference.
	 * @see #setAuto(SPS)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getGroupA_Auto()
	 * @model required="true"
	 * @generated
	 */
	SPS getAuto();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.GroupA#getAuto <em>Auto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto</em>' reference.
	 * @see #getAuto()
	 * @generated
	 */
	void setAuto(SPS value);

} // GroupA
