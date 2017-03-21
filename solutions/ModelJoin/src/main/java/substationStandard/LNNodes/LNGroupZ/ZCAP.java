/**
 */
package substationStandard.LNNodes.LNGroupZ;

import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.SPC;
import substationStandard.Dataclasses.SPS;

import substationStandard.LNNodes.LNGroupA.ARCO;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZCAP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZCAP#getOpTmh <em>Op Tmh</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZCAP#getCapDS <em>Cap DS</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZCAP#getDschBlk <em>Dsch Blk</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZCAP#getCapControl <em>Cap Control</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZCAP()
 * @model
 * @generated
 */
public interface ZCAP extends GroupZ {
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
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZCAP_OpTmh()
	 * @model required="true"
	 * @generated
	 */
	INS getOpTmh();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZCAP#getOpTmh <em>Op Tmh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Tmh</em>' reference.
	 * @see #getOpTmh()
	 * @generated
	 */
	void setOpTmh(INS value);

	/**
	 * Returns the value of the '<em><b>Cap DS</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cap DS</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cap DS</em>' reference.
	 * @see #setCapDS(SPC)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZCAP_CapDS()
	 * @model required="true"
	 * @generated
	 */
	SPC getCapDS();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZCAP#getCapDS <em>Cap DS</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cap DS</em>' reference.
	 * @see #getCapDS()
	 * @generated
	 */
	void setCapDS(SPC value);

	/**
	 * Returns the value of the '<em><b>Dsch Blk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsch Blk</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsch Blk</em>' reference.
	 * @see #setDschBlk(SPS)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZCAP_DschBlk()
	 * @model required="true"
	 * @generated
	 */
	SPS getDschBlk();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZCAP#getDschBlk <em>Dsch Blk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsch Blk</em>' reference.
	 * @see #getDschBlk()
	 * @generated
	 */
	void setDschBlk(SPS value);

	/**
	 * Returns the value of the '<em><b>Cap Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cap Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cap Control</em>' reference.
	 * @see #setCapControl(ARCO)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZCAP_CapControl()
	 * @model
	 * @generated
	 */
	ARCO getCapControl();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZCAP#getCapControl <em>Cap Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cap Control</em>' reference.
	 * @see #getCapControl()
	 * @generated
	 */
	void setCapControl(ARCO value);

} // ZCAP
