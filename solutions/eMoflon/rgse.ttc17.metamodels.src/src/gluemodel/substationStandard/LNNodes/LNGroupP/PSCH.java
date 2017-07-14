/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupP;

import gluemodel.substationStandard.Dataclasses.ACD;
import gluemodel.substationStandard.Dataclasses.ACT;
import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.ING;
import gluemodel.substationStandard.Dataclasses.SPS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PSCH</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getProTx <em>Pro Tx</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getProRx <em>Pro Rx</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getStr <em>Str</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getOp <em>Op</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getCarRx <em>Car Rx</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getLosOfGrd <em>Los Of Grd</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getEcho <em>Echo</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getWeiOp <em>Wei Op</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getRvABlk <em>Rv ABlk</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getGrdRx <em>Grd Rx</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getSchTyp <em>Sch Typ</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getOpDlTmms <em>Op Dl Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getCrdTmms <em>Crd Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getDurTmms <em>Dur Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getUnBlkMod <em>Un Blk Mod</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getSecTmms <em>Sec Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getWeiMod <em>Wei Mod</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getWeiTmms <em>Wei Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getPPVVal <em>PPV Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getPhGndVal <em>Ph Gnd Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getRvAMod <em>Rv AMod</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getRvATmms <em>Rv ATmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getRvRsTmms <em>Rv Rs Tmms</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSCH()
 * @model
 * @generated
 */
public interface PSCH extends GroupP {
	/**
	 * Returns the value of the '<em><b>Pro Tx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pro Tx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pro Tx</em>' reference.
	 * @see #setProTx(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSCH_ProTx()
	 * @model required="true"
	 * @generated
	 */
	SPS getProTx();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getProTx <em>Pro Tx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pro Tx</em>' reference.
	 * @see #getProTx()
	 * @generated
	 */
	void setProTx(SPS value);

	/**
	 * Returns the value of the '<em><b>Pro Rx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pro Rx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pro Rx</em>' reference.
	 * @see #setProRx(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSCH_ProRx()
	 * @model required="true"
	 * @generated
	 */
	SPS getProRx();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getProRx <em>Pro Rx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pro Rx</em>' reference.
	 * @see #getProRx()
	 * @generated
	 */
	void setProRx(SPS value);

	/**
	 * Returns the value of the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Str</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str</em>' reference.
	 * @see #setStr(ACD)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSCH_Str()
	 * @model required="true"
	 * @generated
	 */
	ACD getStr();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getStr <em>Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str</em>' reference.
	 * @see #getStr()
	 * @generated
	 */
	void setStr(ACD value);

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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSCH_Op()
	 * @model required="true"
	 * @generated
	 */
	ACT getOp();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(ACT value);

	/**
	 * Returns the value of the '<em><b>Car Rx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Car Rx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Car Rx</em>' reference.
	 * @see #setCarRx(ACT)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSCH_CarRx()
	 * @model required="true"
	 * @generated
	 */
	ACT getCarRx();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getCarRx <em>Car Rx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Car Rx</em>' reference.
	 * @see #getCarRx()
	 * @generated
	 */
	void setCarRx(ACT value);

	/**
	 * Returns the value of the '<em><b>Los Of Grd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Los Of Grd</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Los Of Grd</em>' reference.
	 * @see #setLosOfGrd(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSCH_LosOfGrd()
	 * @model required="true"
	 * @generated
	 */
	SPS getLosOfGrd();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getLosOfGrd <em>Los Of Grd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Los Of Grd</em>' reference.
	 * @see #getLosOfGrd()
	 * @generated
	 */
	void setLosOfGrd(SPS value);

	/**
	 * Returns the value of the '<em><b>Echo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Echo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Echo</em>' reference.
	 * @see #setEcho(ACT)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSCH_Echo()
	 * @model required="true"
	 * @generated
	 */
	ACT getEcho();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getEcho <em>Echo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Echo</em>' reference.
	 * @see #getEcho()
	 * @generated
	 */
	void setEcho(ACT value);

	/**
	 * Returns the value of the '<em><b>Wei Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wei Op</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wei Op</em>' reference.
	 * @see #setWeiOp(ACT)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSCH_WeiOp()
	 * @model required="true"
	 * @generated
	 */
	ACT getWeiOp();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getWeiOp <em>Wei Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wei Op</em>' reference.
	 * @see #getWeiOp()
	 * @generated
	 */
	void setWeiOp(ACT value);

	/**
	 * Returns the value of the '<em><b>Rv ABlk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rv ABlk</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rv ABlk</em>' reference.
	 * @see #setRvABlk(ACT)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSCH_RvABlk()
	 * @model required="true"
	 * @generated
	 */
	ACT getRvABlk();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getRvABlk <em>Rv ABlk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rv ABlk</em>' reference.
	 * @see #getRvABlk()
	 * @generated
	 */
	void setRvABlk(ACT value);

	/**
	 * Returns the value of the '<em><b>Grd Rx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grd Rx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grd Rx</em>' reference.
	 * @see #setGrdRx(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSCH_GrdRx()
	 * @model required="true"
	 * @generated
	 */
	SPS getGrdRx();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getGrdRx <em>Grd Rx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grd Rx</em>' reference.
	 * @see #getGrdRx()
	 * @generated
	 */
	void setGrdRx(SPS value);

	/**
	 * Returns the value of the '<em><b>Sch Typ</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sch Typ</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sch Typ</em>' reference.
	 * @see #setSchTyp(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSCH_SchTyp()
	 * @model required="true"
	 * @generated
	 */
	ING getSchTyp();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getSchTyp <em>Sch Typ</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sch Typ</em>' reference.
	 * @see #getSchTyp()
	 * @generated
	 */
	void setSchTyp(ING value);

	/**
	 * Returns the value of the '<em><b>Op Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Dl Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Dl Tmms</em>' reference.
	 * @see #setOpDlTmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSCH_OpDlTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getOpDlTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getOpDlTmms <em>Op Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Dl Tmms</em>' reference.
	 * @see #getOpDlTmms()
	 * @generated
	 */
	void setOpDlTmms(ING value);

	/**
	 * Returns the value of the '<em><b>Crd Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crd Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crd Tmms</em>' reference.
	 * @see #setCrdTmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSCH_CrdTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getCrdTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getCrdTmms <em>Crd Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crd Tmms</em>' reference.
	 * @see #getCrdTmms()
	 * @generated
	 */
	void setCrdTmms(ING value);

	/**
	 * Returns the value of the '<em><b>Dur Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dur Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dur Tmms</em>' reference.
	 * @see #setDurTmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSCH_DurTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getDurTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getDurTmms <em>Dur Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dur Tmms</em>' reference.
	 * @see #getDurTmms()
	 * @generated
	 */
	void setDurTmms(ING value);

	/**
	 * Returns the value of the '<em><b>Un Blk Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Un Blk Mod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Un Blk Mod</em>' reference.
	 * @see #setUnBlkMod(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSCH_UnBlkMod()
	 * @model required="true"
	 * @generated
	 */
	ING getUnBlkMod();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getUnBlkMod <em>Un Blk Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Un Blk Mod</em>' reference.
	 * @see #getUnBlkMod()
	 * @generated
	 */
	void setUnBlkMod(ING value);

	/**
	 * Returns the value of the '<em><b>Sec Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sec Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sec Tmms</em>' reference.
	 * @see #setSecTmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSCH_SecTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getSecTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getSecTmms <em>Sec Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sec Tmms</em>' reference.
	 * @see #getSecTmms()
	 * @generated
	 */
	void setSecTmms(ING value);

	/**
	 * Returns the value of the '<em><b>Wei Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wei Mod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wei Mod</em>' reference.
	 * @see #setWeiMod(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSCH_WeiMod()
	 * @model required="true"
	 * @generated
	 */
	ING getWeiMod();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getWeiMod <em>Wei Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wei Mod</em>' reference.
	 * @see #getWeiMod()
	 * @generated
	 */
	void setWeiMod(ING value);

	/**
	 * Returns the value of the '<em><b>Wei Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wei Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wei Tmms</em>' reference.
	 * @see #setWeiTmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSCH_WeiTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getWeiTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getWeiTmms <em>Wei Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wei Tmms</em>' reference.
	 * @see #getWeiTmms()
	 * @generated
	 */
	void setWeiTmms(ING value);

	/**
	 * Returns the value of the '<em><b>PPV Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PPV Val</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PPV Val</em>' reference.
	 * @see #setPPVVal(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSCH_PPVVal()
	 * @model required="true"
	 * @generated
	 */
	ASG getPPVVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getPPVVal <em>PPV Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PPV Val</em>' reference.
	 * @see #getPPVVal()
	 * @generated
	 */
	void setPPVVal(ASG value);

	/**
	 * Returns the value of the '<em><b>Ph Gnd Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ph Gnd Val</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ph Gnd Val</em>' reference.
	 * @see #setPhGndVal(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSCH_PhGndVal()
	 * @model required="true"
	 * @generated
	 */
	ASG getPhGndVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getPhGndVal <em>Ph Gnd Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ph Gnd Val</em>' reference.
	 * @see #getPhGndVal()
	 * @generated
	 */
	void setPhGndVal(ASG value);

	/**
	 * Returns the value of the '<em><b>Rv AMod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rv AMod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rv AMod</em>' reference.
	 * @see #setRvAMod(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSCH_RvAMod()
	 * @model required="true"
	 * @generated
	 */
	ING getRvAMod();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getRvAMod <em>Rv AMod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rv AMod</em>' reference.
	 * @see #getRvAMod()
	 * @generated
	 */
	void setRvAMod(ING value);

	/**
	 * Returns the value of the '<em><b>Rv ATmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rv ATmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rv ATmms</em>' reference.
	 * @see #setRvATmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSCH_RvATmms()
	 * @model required="true"
	 * @generated
	 */
	ING getRvATmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getRvATmms <em>Rv ATmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rv ATmms</em>' reference.
	 * @see #getRvATmms()
	 * @generated
	 */
	void setRvATmms(ING value);

	/**
	 * Returns the value of the '<em><b>Rv Rs Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rv Rs Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rv Rs Tmms</em>' reference.
	 * @see #setRvRsTmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSCH_RvRsTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getRvRsTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getRvRsTmms <em>Rv Rs Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rv Rs Tmms</em>' reference.
	 * @see #getRvRsTmms()
	 * @generated
	 */
	void setRvRsTmms(ING value);

} // PSCH
