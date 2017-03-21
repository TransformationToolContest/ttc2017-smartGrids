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
 * A representation of the model object '<em><b>PTOV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTOV#getStr <em>Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTOV#getOp <em>Op</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTOV#getTmVst <em>Tm Vst</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTOV#getTmVCrv <em>Tm VCrv</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTOV#getStrVal <em>Str Val</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTOV#getTmMult <em>Tm Mult</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTOV#getMinOpTmms <em>Min Op Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTOV#getMaxOpTmms <em>Max Op Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTOV#getOpDlTmms <em>Op Dl Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTOV#getRsDlTmms <em>Rs Dl Tmms</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTOV()
 * @model
 * @generated
 */
public interface PTOV extends GroupP {
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTOV_Str()
	 * @model required="true"
	 * @generated
	 */
	ACD getStr();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTOV#getStr <em>Str</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTOV_Op()
	 * @model required="true"
	 * @generated
	 */
	ACT getOp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTOV#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(ACT value);

	/**
	 * Returns the value of the '<em><b>Tm Vst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tm Vst</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tm Vst</em>' reference.
	 * @see #setTmVst(CSD)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTOV_TmVst()
	 * @model required="true"
	 * @generated
	 */
	CSD getTmVst();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTOV#getTmVst <em>Tm Vst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tm Vst</em>' reference.
	 * @see #getTmVst()
	 * @generated
	 */
	void setTmVst(CSD value);

	/**
	 * Returns the value of the '<em><b>Tm VCrv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tm VCrv</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tm VCrv</em>' reference.
	 * @see #setTmVCrv(CURVE)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTOV_TmVCrv()
	 * @model required="true"
	 * @generated
	 */
	CURVE getTmVCrv();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTOV#getTmVCrv <em>Tm VCrv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tm VCrv</em>' reference.
	 * @see #getTmVCrv()
	 * @generated
	 */
	void setTmVCrv(CURVE value);

	/**
	 * Returns the value of the '<em><b>Str Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Str Val</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str Val</em>' reference.
	 * @see #setStrVal(ASG)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTOV_StrVal()
	 * @model required="true"
	 * @generated
	 */
	ASG getStrVal();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTOV#getStrVal <em>Str Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str Val</em>' reference.
	 * @see #getStrVal()
	 * @generated
	 */
	void setStrVal(ASG value);

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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTOV_TmMult()
	 * @model required="true"
	 * @generated
	 */
	ASG getTmMult();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTOV#getTmMult <em>Tm Mult</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tm Mult</em>' reference.
	 * @see #getTmMult()
	 * @generated
	 */
	void setTmMult(ASG value);

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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTOV_MinOpTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getMinOpTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTOV#getMinOpTmms <em>Min Op Tmms</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTOV_MaxOpTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getMaxOpTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTOV#getMaxOpTmms <em>Max Op Tmms</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTOV_OpDlTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getOpDlTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTOV#getOpDlTmms <em>Op Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Dl Tmms</em>' reference.
	 * @see #getOpDlTmms()
	 * @generated
	 */
	void setOpDlTmms(ING value);

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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTOV_RsDlTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getRsDlTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTOV#getRsDlTmms <em>Rs Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rs Dl Tmms</em>' reference.
	 * @see #getRsDlTmms()
	 * @generated
	 */
	void setRsDlTmms(ING value);

} // PTOV
