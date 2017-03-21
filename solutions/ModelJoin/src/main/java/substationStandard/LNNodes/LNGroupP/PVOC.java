/**
 */
package substationStandard.LNNodes.LNGroupP;

import substationStandard.Dataclasses.ACD;
import substationStandard.Dataclasses.ACT;
import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.CSD;
import substationStandard.Dataclasses.CURVE;
import substationStandard.Dataclasses.ING;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PVOC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PVOC#getStr <em>Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PVOC#getOp <em>Op</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PVOC#getAVSt <em>AV St</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PVOC#getTmASt <em>Tm ASt</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PVOC#getTmMult <em>Tm Mult</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PVOC#getAVCrv <em>AV Crv</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PVOC#getTmACrv <em>Tm ACrv</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PVOC#getMinOpTmms <em>Min Op Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PVOC#getMaxOpTmms <em>Max Op Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PVOC#getOpDlTmms <em>Op Dl Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PVOC#getTypRsCrv <em>Typ Rs Crv</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PVOC#getRsDlTmms <em>Rs Dl Tmms</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPVOC()
 * @model
 * @generated
 */
public interface PVOC extends GroupP {
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPVOC_Str()
	 * @model required="true"
	 * @generated
	 */
	ACD getStr();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PVOC#getStr <em>Str</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPVOC_Op()
	 * @model required="true"
	 * @generated
	 */
	ACT getOp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PVOC#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(ACT value);

	/**
	 * Returns the value of the '<em><b>AV St</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AV St</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AV St</em>' reference.
	 * @see #setAVSt(CSD)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPVOC_AVSt()
	 * @model required="true"
	 * @generated
	 */
	CSD getAVSt();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PVOC#getAVSt <em>AV St</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AV St</em>' reference.
	 * @see #getAVSt()
	 * @generated
	 */
	void setAVSt(CSD value);

	/**
	 * Returns the value of the '<em><b>Tm ASt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tm ASt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tm ASt</em>' reference.
	 * @see #setTmASt(CSD)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPVOC_TmASt()
	 * @model required="true"
	 * @generated
	 */
	CSD getTmASt();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PVOC#getTmASt <em>Tm ASt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tm ASt</em>' reference.
	 * @see #getTmASt()
	 * @generated
	 */
	void setTmASt(CSD value);

	/**
	 * Returns the value of the '<em><b>Tm Mult</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tm Mult</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tm Mult</em>' reference.
	 * @see #setTmMult(ASG)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPVOC_TmMult()
	 * @model required="true"
	 * @generated
	 */
	ASG getTmMult();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PVOC#getTmMult <em>Tm Mult</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tm Mult</em>' reference.
	 * @see #getTmMult()
	 * @generated
	 */
	void setTmMult(ASG value);

	/**
	 * Returns the value of the '<em><b>AV Crv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AV Crv</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AV Crv</em>' reference.
	 * @see #setAVCrv(CURVE)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPVOC_AVCrv()
	 * @model required="true"
	 * @generated
	 */
	CURVE getAVCrv();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PVOC#getAVCrv <em>AV Crv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AV Crv</em>' reference.
	 * @see #getAVCrv()
	 * @generated
	 */
	void setAVCrv(CURVE value);

	/**
	 * Returns the value of the '<em><b>Tm ACrv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tm ACrv</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tm ACrv</em>' reference.
	 * @see #setTmACrv(CURVE)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPVOC_TmACrv()
	 * @model required="true"
	 * @generated
	 */
	CURVE getTmACrv();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PVOC#getTmACrv <em>Tm ACrv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tm ACrv</em>' reference.
	 * @see #getTmACrv()
	 * @generated
	 */
	void setTmACrv(CURVE value);

	/**
	 * Returns the value of the '<em><b>Min Op Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Op Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Op Tmms</em>' reference.
	 * @see #setMinOpTmms(ING)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPVOC_MinOpTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getMinOpTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PVOC#getMinOpTmms <em>Min Op Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Op Tmms</em>' reference.
	 * @see #getMinOpTmms()
	 * @generated
	 */
	void setMinOpTmms(ING value);

	/**
	 * Returns the value of the '<em><b>Max Op Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Op Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Op Tmms</em>' reference.
	 * @see #setMaxOpTmms(ING)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPVOC_MaxOpTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getMaxOpTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PVOC#getMaxOpTmms <em>Max Op Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Op Tmms</em>' reference.
	 * @see #getMaxOpTmms()
	 * @generated
	 */
	void setMaxOpTmms(ING value);

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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPVOC_OpDlTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getOpDlTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PVOC#getOpDlTmms <em>Op Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Dl Tmms</em>' reference.
	 * @see #getOpDlTmms()
	 * @generated
	 */
	void setOpDlTmms(ING value);

	/**
	 * Returns the value of the '<em><b>Typ Rs Crv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typ Rs Crv</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typ Rs Crv</em>' reference.
	 * @see #setTypRsCrv(ING)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPVOC_TypRsCrv()
	 * @model required="true"
	 * @generated
	 */
	ING getTypRsCrv();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PVOC#getTypRsCrv <em>Typ Rs Crv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typ Rs Crv</em>' reference.
	 * @see #getTypRsCrv()
	 * @generated
	 */
	void setTypRsCrv(ING value);

	/**
	 * Returns the value of the '<em><b>Rs Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rs Dl Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rs Dl Tmms</em>' reference.
	 * @see #setRsDlTmms(ING)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPVOC_RsDlTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getRsDlTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PVOC#getRsDlTmms <em>Rs Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rs Dl Tmms</em>' reference.
	 * @see #getRsDlTmms()
	 * @generated
	 */
	void setRsDlTmms(ING value);

} // PVOC
