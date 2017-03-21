/**
 */
package substationStandard.LNNodes.LNGroupZ;

import substationStandard.Dataclasses.INS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZCON</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZCON#getOpTmh <em>Op Tmh</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZCON()
 * @model
 * @generated
 */
public interface ZCON extends GroupZ {
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
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZCON_OpTmh()
	 * @model required="true"
	 * @generated
	 */
	INS getOpTmh();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZCON#getOpTmh <em>Op Tmh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Tmh</em>' reference.
	 * @see #getOpTmh()
	 * @generated
	 */
	void setOpTmh(INS value);

} // ZCON
