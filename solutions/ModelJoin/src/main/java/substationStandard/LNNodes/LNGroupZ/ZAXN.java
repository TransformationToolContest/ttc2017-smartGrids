/**
 */
package substationStandard.LNNodes.LNGroupZ;

import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.MV;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZAXN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZAXN#getOpTmh <em>Op Tmh</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZAXN#getVol <em>Vol</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZAXN#getAmp <em>Amp</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZAXN()
 * @model
 * @generated
 */
public interface ZAXN extends GroupZ {
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
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZAXN_OpTmh()
	 * @model required="true"
	 * @generated
	 */
	INS getOpTmh();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZAXN#getOpTmh <em>Op Tmh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Tmh</em>' reference.
	 * @see #getOpTmh()
	 * @generated
	 */
	void setOpTmh(INS value);

	/**
	 * Returns the value of the '<em><b>Vol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vol</em>' reference.
	 * @see #setVol(MV)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZAXN_Vol()
	 * @model required="true"
	 * @generated
	 */
	MV getVol();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZAXN#getVol <em>Vol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vol</em>' reference.
	 * @see #getVol()
	 * @generated
	 */
	void setVol(MV value);

	/**
	 * Returns the value of the '<em><b>Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amp</em>' reference.
	 * @see #setAmp(MV)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZAXN_Amp()
	 * @model required="true"
	 * @generated
	 */
	MV getAmp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZAXN#getAmp <em>Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amp</em>' reference.
	 * @see #getAmp()
	 * @generated
	 */
	void setAmp(MV value);

} // ZAXN
