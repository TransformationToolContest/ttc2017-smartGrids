/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupP;

import gluemodel.substationStandard.Dataclasses.ACD;
import gluemodel.substationStandard.Dataclasses.ACT;
import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.CSD;
import gluemodel.substationStandard.Dataclasses.CURVE;
import gluemodel.substationStandard.Dataclasses.ING;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PTOC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getStr <em>Str</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getOp <em>Op</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getTmASt <em>Tm ASt</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getTmACrv <em>Tm ACrv</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getStrVal <em>Str Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getTmMult <em>Tm Mult</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getMinOpTmms <em>Min Op Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getMaxOpTmms <em>Max Op Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getOpDlTmms <em>Op Dl Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getTypRsCrv <em>Typ Rs Crv</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getRsDlTmms <em>Rs Dl Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getDirMod <em>Dir Mod</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTOC()
 * @model
 * @generated
 */
public interface PTOC extends GroupP {
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTOC_Str()
	 * @model required="true"
	 * @generated
	 */
	ACD getStr();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getStr <em>Str</em>}' reference.
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTOC_Op()
	 * @model required="true"
	 * @generated
	 */
	ACT getOp();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(ACT value);

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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTOC_TmASt()
	 * @model required="true"
	 * @generated
	 */
	CSD getTmASt();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getTmASt <em>Tm ASt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tm ASt</em>' reference.
	 * @see #getTmASt()
	 * @generated
	 */
	void setTmASt(CSD value);

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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTOC_TmACrv()
	 * @model required="true"
	 * @generated
	 */
	CURVE getTmACrv();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getTmACrv <em>Tm ACrv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tm ACrv</em>' reference.
	 * @see #getTmACrv()
	 * @generated
	 */
	void setTmACrv(CURVE value);

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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTOC_StrVal()
	 * @model required="true"
	 * @generated
	 */
	ASG getStrVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getStrVal <em>Str Val</em>}' reference.
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTOC_TmMult()
	 * @model required="true"
	 * @generated
	 */
	ASG getTmMult();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getTmMult <em>Tm Mult</em>}' reference.
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTOC_MinOpTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getMinOpTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getMinOpTmms <em>Min Op Tmms</em>}' reference.
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTOC_MaxOpTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getMaxOpTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getMaxOpTmms <em>Max Op Tmms</em>}' reference.
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTOC_OpDlTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getOpDlTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getOpDlTmms <em>Op Dl Tmms</em>}' reference.
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTOC_TypRsCrv()
	 * @model required="true"
	 * @generated
	 */
	ING getTypRsCrv();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getTypRsCrv <em>Typ Rs Crv</em>}' reference.
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTOC_RsDlTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getRsDlTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getRsDlTmms <em>Rs Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rs Dl Tmms</em>' reference.
	 * @see #getRsDlTmms()
	 * @generated
	 */
	void setRsDlTmms(ING value);

	/**
	 * Returns the value of the '<em><b>Dir Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir Mod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir Mod</em>' reference.
	 * @see #setDirMod(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTOC_DirMod()
	 * @model required="true"
	 * @generated
	 */
	ING getDirMod();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getDirMod <em>Dir Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir Mod</em>' reference.
	 * @see #getDirMod()
	 * @generated
	 */
	void setDirMod(ING value);

} // PTOC
