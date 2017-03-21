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
 * A representation of the model object '<em><b>PVPH</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PVPH#getStr <em>Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PVPH#getOp <em>Op</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PVPH#getVHzSt <em>VHz St</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PVPH#getVHzCrv <em>VHz Crv</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PVPH#getStrVal <em>Str Val</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PVPH#getOpDlTmms <em>Op Dl Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PVPH#getTypRsCrv <em>Typ Rs Crv</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PVPH#getRsDlTmms <em>Rs Dl Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PVPH#getTmMult <em>Tm Mult</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PVPH#getMinOpTmms <em>Min Op Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PVPH#getMaxOpTmms <em>Max Op Tmms</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPVPH()
 * @model
 * @generated
 */
public interface PVPH extends GroupP {
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPVPH_Str()
	 * @model required="true"
	 * @generated
	 */
	ACD getStr();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PVPH#getStr <em>Str</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPVPH_Op()
	 * @model required="true"
	 * @generated
	 */
	ACT getOp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PVPH#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(ACT value);

	/**
	 * Returns the value of the '<em><b>VHz St</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VHz St</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VHz St</em>' reference.
	 * @see #setVHzSt(CSD)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPVPH_VHzSt()
	 * @model required="true"
	 * @generated
	 */
	CSD getVHzSt();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PVPH#getVHzSt <em>VHz St</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VHz St</em>' reference.
	 * @see #getVHzSt()
	 * @generated
	 */
	void setVHzSt(CSD value);

	/**
	 * Returns the value of the '<em><b>VHz Crv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VHz Crv</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VHz Crv</em>' reference.
	 * @see #setVHzCrv(CURVE)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPVPH_VHzCrv()
	 * @model required="true"
	 * @generated
	 */
	CURVE getVHzCrv();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PVPH#getVHzCrv <em>VHz Crv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VHz Crv</em>' reference.
	 * @see #getVHzCrv()
	 * @generated
	 */
	void setVHzCrv(CURVE value);

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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPVPH_StrVal()
	 * @model required="true"
	 * @generated
	 */
	ASG getStrVal();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PVPH#getStrVal <em>Str Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str Val</em>' reference.
	 * @see #getStrVal()
	 * @generated
	 */
	void setStrVal(ASG value);

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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPVPH_OpDlTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getOpDlTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PVPH#getOpDlTmms <em>Op Dl Tmms</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPVPH_TypRsCrv()
	 * @model required="true"
	 * @generated
	 */
	ING getTypRsCrv();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PVPH#getTypRsCrv <em>Typ Rs Crv</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPVPH_RsDlTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getRsDlTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PVPH#getRsDlTmms <em>Rs Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rs Dl Tmms</em>' reference.
	 * @see #getRsDlTmms()
	 * @generated
	 */
	void setRsDlTmms(ING value);

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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPVPH_TmMult()
	 * @model required="true"
	 * @generated
	 */
	ASG getTmMult();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PVPH#getTmMult <em>Tm Mult</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPVPH_MinOpTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getMinOpTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PVPH#getMinOpTmms <em>Min Op Tmms</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPVPH_MaxOpTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getMaxOpTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PVPH#getMaxOpTmms <em>Max Op Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Op Tmms</em>' reference.
	 * @see #getMaxOpTmms()
	 * @generated
	 */
	void setMaxOpTmms(ING value);

} // PVPH
