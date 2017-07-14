/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupR;

import gluemodel.substationStandard.Dataclasses.INC;
import gluemodel.substationStandard.Dataclasses.ING;
import gluemodel.substationStandard.Dataclasses.SPS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RBDR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getOpCntRs <em>Op Cnt Rs</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getChTrg <em>Ch Trg</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getChNum <em>Ch Num</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getTrgMod <em>Trg Mod</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getLevMod <em>Lev Mod</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getPreTmms <em>Pre Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getPstTmms <em>Pst Tmms</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRBDR()
 * @model
 * @generated
 */
public interface RBDR extends GroupR {
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRBDR_OpCntRs()
	 * @model required="true"
	 * @generated
	 */
	INC getOpCntRs();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getOpCntRs <em>Op Cnt Rs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Cnt Rs</em>' reference.
	 * @see #getOpCntRs()
	 * @generated
	 */
	void setOpCntRs(INC value);

	/**
	 * Returns the value of the '<em><b>Ch Trg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ch Trg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ch Trg</em>' reference.
	 * @see #setChTrg(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRBDR_ChTrg()
	 * @model required="true"
	 * @generated
	 */
	SPS getChTrg();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getChTrg <em>Ch Trg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ch Trg</em>' reference.
	 * @see #getChTrg()
	 * @generated
	 */
	void setChTrg(SPS value);

	/**
	 * Returns the value of the '<em><b>Ch Num</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ch Num</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ch Num</em>' reference.
	 * @see #setChNum(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRBDR_ChNum()
	 * @model required="true"
	 * @generated
	 */
	ING getChNum();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getChNum <em>Ch Num</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ch Num</em>' reference.
	 * @see #getChNum()
	 * @generated
	 */
	void setChNum(ING value);

	/**
	 * Returns the value of the '<em><b>Trg Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trg Mod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trg Mod</em>' reference.
	 * @see #setTrgMod(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRBDR_TrgMod()
	 * @model required="true"
	 * @generated
	 */
	ING getTrgMod();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getTrgMod <em>Trg Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trg Mod</em>' reference.
	 * @see #getTrgMod()
	 * @generated
	 */
	void setTrgMod(ING value);

	/**
	 * Returns the value of the '<em><b>Lev Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lev Mod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lev Mod</em>' reference.
	 * @see #setLevMod(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRBDR_LevMod()
	 * @model required="true"
	 * @generated
	 */
	ING getLevMod();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getLevMod <em>Lev Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lev Mod</em>' reference.
	 * @see #getLevMod()
	 * @generated
	 */
	void setLevMod(ING value);

	/**
	 * Returns the value of the '<em><b>Pre Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Tmms</em>' reference.
	 * @see #setPreTmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRBDR_PreTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getPreTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getPreTmms <em>Pre Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Tmms</em>' reference.
	 * @see #getPreTmms()
	 * @generated
	 */
	void setPreTmms(ING value);

	/**
	 * Returns the value of the '<em><b>Pst Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pst Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pst Tmms</em>' reference.
	 * @see #setPstTmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRBDR_PstTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getPstTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getPstTmms <em>Pst Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pst Tmms</em>' reference.
	 * @see #getPstTmms()
	 * @generated
	 */
	void setPstTmms(ING value);

} // RBDR
