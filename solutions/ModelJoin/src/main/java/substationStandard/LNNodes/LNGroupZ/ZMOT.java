/**
 */
package substationStandard.LNNodes.LNGroupZ;

import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.SPC;
import substationStandard.Dataclasses.SPS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZMOT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZMOT#getOpTmh <em>Op Tmh</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZMOT#getDExt <em>DExt</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZMOT#getLosOil <em>Los Oil</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZMOT#getLosVac <em>Los Vac</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.ZMOT#getPresAlm <em>Pres Alm</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZMOT()
 * @model
 * @generated
 */
public interface ZMOT extends GroupZ {
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
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZMOT_OpTmh()
	 * @model required="true"
	 * @generated
	 */
	INS getOpTmh();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZMOT#getOpTmh <em>Op Tmh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Tmh</em>' reference.
	 * @see #getOpTmh()
	 * @generated
	 */
	void setOpTmh(INS value);

	/**
	 * Returns the value of the '<em><b>DExt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DExt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DExt</em>' reference.
	 * @see #setDExt(SPC)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZMOT_DExt()
	 * @model required="true"
	 * @generated
	 */
	SPC getDExt();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZMOT#getDExt <em>DExt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DExt</em>' reference.
	 * @see #getDExt()
	 * @generated
	 */
	void setDExt(SPC value);

	/**
	 * Returns the value of the '<em><b>Los Oil</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Los Oil</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Los Oil</em>' reference.
	 * @see #setLosOil(SPS)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZMOT_LosOil()
	 * @model required="true"
	 * @generated
	 */
	SPS getLosOil();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZMOT#getLosOil <em>Los Oil</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Los Oil</em>' reference.
	 * @see #getLosOil()
	 * @generated
	 */
	void setLosOil(SPS value);

	/**
	 * Returns the value of the '<em><b>Los Vac</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Los Vac</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Los Vac</em>' reference.
	 * @see #setLosVac(SPS)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZMOT_LosVac()
	 * @model required="true"
	 * @generated
	 */
	SPS getLosVac();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZMOT#getLosVac <em>Los Vac</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Los Vac</em>' reference.
	 * @see #getLosVac()
	 * @generated
	 */
	void setLosVac(SPS value);

	/**
	 * Returns the value of the '<em><b>Pres Alm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pres Alm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pres Alm</em>' reference.
	 * @see #setPresAlm(SPS)
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZMOT_PresAlm()
	 * @model required="true"
	 * @generated
	 */
	SPS getPresAlm();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupZ.ZMOT#getPresAlm <em>Pres Alm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pres Alm</em>' reference.
	 * @see #getPresAlm()
	 * @generated
	 */
	void setPresAlm(SPS value);

} // ZMOT
