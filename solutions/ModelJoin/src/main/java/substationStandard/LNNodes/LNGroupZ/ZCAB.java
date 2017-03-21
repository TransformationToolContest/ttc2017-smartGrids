/**
 */
package substationStandard.LNNodes.LNGroupZ;

import substationStandard.Dataclasses.INS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZCAB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZCAB#getOpTmh <em>Op Tmh</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZCAB()
 * @model
 * @generated
 */
public interface ZCAB extends GroupZ {
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
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZCAB_OpTmh()
	 * @model required="true"
	 * @generated
	 */
	INS getOpTmh();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZCAB#getOpTmh <em>Op Tmh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Tmh</em>' reference.
	 * @see #getOpTmh()
	 * @generated
	 */
	void setOpTmh(INS value);

} // ZCAB
