/**
 */
package substationStandard.LNNodes.LNGroupZ;

import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.INS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZTCF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZTCF#getOpTmh <em>Op Tmh</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZTCF#getPwrFrq <em>Pwr Frq</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZTCF()
 * @model
 * @generated
 */
public interface ZTCF extends GroupZ {
	/**
	 * Returns the value of the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Tmh</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Tmh</em>' reference.
	 * @see #setOpTmh(INS)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZTCF_OpTmh()
	 * @model required="true"
	 * @generated
	 */
	INS getOpTmh();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZTCF#getOpTmh <em>Op Tmh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Tmh</em>' reference.
	 * @see #getOpTmh()
	 * @generated
	 */
	void setOpTmh(INS value);

	/**
	 * Returns the value of the '<em><b>Pwr Frq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pwr Frq</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pwr Frq</em>' reference.
	 * @see #setPwrFrq(ASG)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZTCF_PwrFrq()
	 * @model required="true"
	 * @generated
	 */
	ASG getPwrFrq();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZTCF#getPwrFrq <em>Pwr Frq</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pwr Frq</em>' reference.
	 * @see #getPwrFrq()
	 * @generated
	 */
	void setPwrFrq(ASG value);

} // ZTCF
