/**
 */
package substationStandard.LNNodes.LNGroupP;

import substationStandard.Dataclasses.ACD;
import substationStandard.Dataclasses.ACT;
import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.CSD;
import substationStandard.Dataclasses.CURVE;
import substationStandard.Dataclasses.ING;
import substationStandard.Dataclasses.MV;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PTTR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTTR#getAmp <em>Amp</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTTR#getTmp <em>Tmp</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTTR#getTmpRl <em>Tmp Rl</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTTR#getLodRsvAlm <em>Lod Rsv Alm</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTTR#getLodRsvTr <em>Lod Rsv Tr</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTTR#getAgeRat <em>Age Rat</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTTR#getStr <em>Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTTR#getOp <em>Op</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTTR#getAlmThm <em>Alm Thm</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTTR#getTmTmpSt <em>Tm Tmp St</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTTR#getTmASt <em>Tm ASt</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTTR#getTmTmpCrv <em>Tm Tmp Crv</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTTR#getTmACrv <em>Tm ACrv</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTTR#getTmpMax <em>Tmp Max</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTTR#getStrVal <em>Str Val</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTTR#getOpDlTmms <em>Op Dl Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTTR#getMinOpTmms <em>Min Op Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTTR#getMaxOpTmms <em>Max Op Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTTR#getRsDlTmms <em>Rs Dl Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTTR#getConsTms <em>Cons Tms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTTR#getAlmVal <em>Alm Val</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTTR()
 * @model
 * @generated
 */
public interface PTTR extends GroupP {
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTTR_Amp()
	 * @model required="true"
	 * @generated
	 */
	MV getAmp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTTR#getAmp <em>Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amp</em>' reference.
	 * @see #getAmp()
	 * @generated
	 */
	void setAmp(MV value);

	/**
	 * Returns the value of the '<em><b>Tmp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmp</em>' reference.
	 * @see #setTmp(MV)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTTR_Tmp()
	 * @model required="true"
	 * @generated
	 */
	MV getTmp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTTR#getTmp <em>Tmp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmp</em>' reference.
	 * @see #getTmp()
	 * @generated
	 */
	void setTmp(MV value);

	/**
	 * Returns the value of the '<em><b>Tmp Rl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmp Rl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmp Rl</em>' reference.
	 * @see #setTmpRl(MV)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTTR_TmpRl()
	 * @model required="true"
	 * @generated
	 */
	MV getTmpRl();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTTR#getTmpRl <em>Tmp Rl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmp Rl</em>' reference.
	 * @see #getTmpRl()
	 * @generated
	 */
	void setTmpRl(MV value);

	/**
	 * Returns the value of the '<em><b>Lod Rsv Alm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod Rsv Alm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod Rsv Alm</em>' reference.
	 * @see #setLodRsvAlm(MV)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTTR_LodRsvAlm()
	 * @model required="true"
	 * @generated
	 */
	MV getLodRsvAlm();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTTR#getLodRsvAlm <em>Lod Rsv Alm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod Rsv Alm</em>' reference.
	 * @see #getLodRsvAlm()
	 * @generated
	 */
	void setLodRsvAlm(MV value);

	/**
	 * Returns the value of the '<em><b>Lod Rsv Tr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod Rsv Tr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod Rsv Tr</em>' reference.
	 * @see #setLodRsvTr(MV)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTTR_LodRsvTr()
	 * @model required="true"
	 * @generated
	 */
	MV getLodRsvTr();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTTR#getLodRsvTr <em>Lod Rsv Tr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod Rsv Tr</em>' reference.
	 * @see #getLodRsvTr()
	 * @generated
	 */
	void setLodRsvTr(MV value);

	/**
	 * Returns the value of the '<em><b>Age Rat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age Rat</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age Rat</em>' reference.
	 * @see #setAgeRat(MV)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTTR_AgeRat()
	 * @model required="true"
	 * @generated
	 */
	MV getAgeRat();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTTR#getAgeRat <em>Age Rat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age Rat</em>' reference.
	 * @see #getAgeRat()
	 * @generated
	 */
	void setAgeRat(MV value);

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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTTR_Str()
	 * @model required="true"
	 * @generated
	 */
	ACD getStr();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTTR#getStr <em>Str</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTTR_Op()
	 * @model required="true"
	 * @generated
	 */
	ACT getOp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTTR#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(ACT value);

	/**
	 * Returns the value of the '<em><b>Alm Thm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Thm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Thm</em>' reference.
	 * @see #setAlmThm(ACT)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTTR_AlmThm()
	 * @model required="true"
	 * @generated
	 */
	ACT getAlmThm();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTTR#getAlmThm <em>Alm Thm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Thm</em>' reference.
	 * @see #getAlmThm()
	 * @generated
	 */
	void setAlmThm(ACT value);

	/**
	 * Returns the value of the '<em><b>Tm Tmp St</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tm Tmp St</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tm Tmp St</em>' reference.
	 * @see #setTmTmpSt(CSD)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTTR_TmTmpSt()
	 * @model required="true"
	 * @generated
	 */
	CSD getTmTmpSt();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTTR#getTmTmpSt <em>Tm Tmp St</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tm Tmp St</em>' reference.
	 * @see #getTmTmpSt()
	 * @generated
	 */
	void setTmTmpSt(CSD value);

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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTTR_TmASt()
	 * @model required="true"
	 * @generated
	 */
	CSD getTmASt();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTTR#getTmASt <em>Tm ASt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tm ASt</em>' reference.
	 * @see #getTmASt()
	 * @generated
	 */
	void setTmASt(CSD value);

	/**
	 * Returns the value of the '<em><b>Tm Tmp Crv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tm Tmp Crv</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tm Tmp Crv</em>' reference.
	 * @see #setTmTmpCrv(CURVE)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTTR_TmTmpCrv()
	 * @model required="true"
	 * @generated
	 */
	CURVE getTmTmpCrv();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTTR#getTmTmpCrv <em>Tm Tmp Crv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tm Tmp Crv</em>' reference.
	 * @see #getTmTmpCrv()
	 * @generated
	 */
	void setTmTmpCrv(CURVE value);

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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTTR_TmACrv()
	 * @model required="true"
	 * @generated
	 */
	CURVE getTmACrv();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTTR#getTmACrv <em>Tm ACrv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tm ACrv</em>' reference.
	 * @see #getTmACrv()
	 * @generated
	 */
	void setTmACrv(CURVE value);

	/**
	 * Returns the value of the '<em><b>Tmp Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmp Max</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmp Max</em>' reference.
	 * @see #setTmpMax(ASG)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTTR_TmpMax()
	 * @model required="true"
	 * @generated
	 */
	ASG getTmpMax();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTTR#getTmpMax <em>Tmp Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmp Max</em>' reference.
	 * @see #getTmpMax()
	 * @generated
	 */
	void setTmpMax(ASG value);

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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTTR_StrVal()
	 * @model required="true"
	 * @generated
	 */
	ASG getStrVal();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTTR#getStrVal <em>Str Val</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTTR_OpDlTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getOpDlTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTTR#getOpDlTmms <em>Op Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Dl Tmms</em>' reference.
	 * @see #getOpDlTmms()
	 * @generated
	 */
	void setOpDlTmms(ING value);

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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTTR_MinOpTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getMinOpTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTTR#getMinOpTmms <em>Min Op Tmms</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTTR_MaxOpTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getMaxOpTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTTR#getMaxOpTmms <em>Max Op Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Op Tmms</em>' reference.
	 * @see #getMaxOpTmms()
	 * @generated
	 */
	void setMaxOpTmms(ING value);

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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTTR_RsDlTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getRsDlTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTTR#getRsDlTmms <em>Rs Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rs Dl Tmms</em>' reference.
	 * @see #getRsDlTmms()
	 * @generated
	 */
	void setRsDlTmms(ING value);

	/**
	 * Returns the value of the '<em><b>Cons Tms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cons Tms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cons Tms</em>' reference.
	 * @see #setConsTms(ING)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTTR_ConsTms()
	 * @model required="true"
	 * @generated
	 */
	ING getConsTms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTTR#getConsTms <em>Cons Tms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cons Tms</em>' reference.
	 * @see #getConsTms()
	 * @generated
	 */
	void setConsTms(ING value);

	/**
	 * Returns the value of the '<em><b>Alm Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Val</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Val</em>' reference.
	 * @see #setAlmVal(ASG)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTTR_AlmVal()
	 * @model required="true"
	 * @generated
	 */
	ASG getAlmVal();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTTR#getAlmVal <em>Alm Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Val</em>' reference.
	 * @see #getAlmVal()
	 * @generated
	 */
	void setAlmVal(ASG value);

} // PTTR
