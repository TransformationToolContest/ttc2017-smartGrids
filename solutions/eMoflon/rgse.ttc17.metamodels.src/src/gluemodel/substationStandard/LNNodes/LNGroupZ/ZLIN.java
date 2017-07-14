/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupZ;

import gluemodel.substationStandard.Dataclasses.INS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZLIN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZLIN#getOpTmh <em>Op Tmh</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZLIN()
 * @model
 * @generated
 */
public interface ZLIN extends GroupZ {
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZLIN_OpTmh()
	 * @model required="true"
	 * @generated
	 */
	INS getOpTmh();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZLIN#getOpTmh <em>Op Tmh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Tmh</em>' reference.
	 * @see #getOpTmh()
	 * @generated
	 */
	void setOpTmh(INS value);

} // ZLIN
