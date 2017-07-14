/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupR;

import gluemodel.substationStandard.Dataclasses.ACT;
import gluemodel.substationStandard.Dataclasses.INC;
import gluemodel.substationStandard.Dataclasses.ING;
import gluemodel.substationStandard.Dataclasses.INS;
import gluemodel.substationStandard.Dataclasses.SPC;
import gluemodel.substationStandard.Dataclasses.SPS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RREC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getOpCntRs <em>Op Cnt Rs</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getBlkRec <em>Blk Rec</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getChkRec <em>Chk Rec</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getAuto <em>Auto</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getOp <em>Op</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getAutoRecSt <em>Auto Rec St</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getRec1Tmms <em>Rec1 Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getRec2Tmms <em>Rec2 Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getRec3Tmms <em>Rec3 Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getPlsTmms <em>Pls Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getRclTmms <em>Rcl Tmms</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRREC()
 * @model
 * @generated
 */
public interface RREC extends GroupR {
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRREC_OpCntRs()
	 * @model required="true"
	 * @generated
	 */
	INC getOpCntRs();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getOpCntRs <em>Op Cnt Rs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Cnt Rs</em>' reference.
	 * @see #getOpCntRs()
	 * @generated
	 */
	void setOpCntRs(INC value);

	/**
	 * Returns the value of the '<em><b>Blk Rec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blk Rec</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blk Rec</em>' reference.
	 * @see #setBlkRec(SPC)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRREC_BlkRec()
	 * @model required="true"
	 * @generated
	 */
	SPC getBlkRec();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getBlkRec <em>Blk Rec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blk Rec</em>' reference.
	 * @see #getBlkRec()
	 * @generated
	 */
	void setBlkRec(SPC value);

	/**
	 * Returns the value of the '<em><b>Chk Rec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chk Rec</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chk Rec</em>' reference.
	 * @see #setChkRec(SPC)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRREC_ChkRec()
	 * @model required="true"
	 * @generated
	 */
	SPC getChkRec();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getChkRec <em>Chk Rec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chk Rec</em>' reference.
	 * @see #getChkRec()
	 * @generated
	 */
	void setChkRec(SPC value);

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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRREC_Auto()
	 * @model required="true"
	 * @generated
	 */
	SPS getAuto();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getAuto <em>Auto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto</em>' reference.
	 * @see #getAuto()
	 * @generated
	 */
	void setAuto(SPS value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' reference.
	 * @see #setOp(ACT)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRREC_Op()
	 * @model required="true"
	 * @generated
	 */
	ACT getOp();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(ACT value);

	/**
	 * Returns the value of the '<em><b>Auto Rec St</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Rec St</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Rec St</em>' reference.
	 * @see #setAutoRecSt(INS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRREC_AutoRecSt()
	 * @model required="true"
	 * @generated
	 */
	INS getAutoRecSt();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getAutoRecSt <em>Auto Rec St</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Rec St</em>' reference.
	 * @see #getAutoRecSt()
	 * @generated
	 */
	void setAutoRecSt(INS value);

	/**
	 * Returns the value of the '<em><b>Rec1 Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rec1 Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rec1 Tmms</em>' reference.
	 * @see #setRec1Tmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRREC_Rec1Tmms()
	 * @model required="true"
	 * @generated
	 */
	ING getRec1Tmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getRec1Tmms <em>Rec1 Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rec1 Tmms</em>' reference.
	 * @see #getRec1Tmms()
	 * @generated
	 */
	void setRec1Tmms(ING value);

	/**
	 * Returns the value of the '<em><b>Rec2 Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rec2 Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rec2 Tmms</em>' reference.
	 * @see #setRec2Tmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRREC_Rec2Tmms()
	 * @model required="true"
	 * @generated
	 */
	ING getRec2Tmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getRec2Tmms <em>Rec2 Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rec2 Tmms</em>' reference.
	 * @see #getRec2Tmms()
	 * @generated
	 */
	void setRec2Tmms(ING value);

	/**
	 * Returns the value of the '<em><b>Rec3 Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rec3 Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rec3 Tmms</em>' reference.
	 * @see #setRec3Tmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRREC_Rec3Tmms()
	 * @model required="true"
	 * @generated
	 */
	ING getRec3Tmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getRec3Tmms <em>Rec3 Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rec3 Tmms</em>' reference.
	 * @see #getRec3Tmms()
	 * @generated
	 */
	void setRec3Tmms(ING value);

	/**
	 * Returns the value of the '<em><b>Pls Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pls Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pls Tmms</em>' reference.
	 * @see #setPlsTmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRREC_PlsTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getPlsTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getPlsTmms <em>Pls Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pls Tmms</em>' reference.
	 * @see #getPlsTmms()
	 * @generated
	 */
	void setPlsTmms(ING value);

	/**
	 * Returns the value of the '<em><b>Rcl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rcl Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rcl Tmms</em>' reference.
	 * @see #setRclTmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRREC_RclTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getRclTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getRclTmms <em>Rcl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rcl Tmms</em>' reference.
	 * @see #getRclTmms()
	 * @generated
	 */
	void setRclTmms(ING value);

} // RREC
