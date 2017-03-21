/**
 */
package substationStandard.LNNodes.LNGroupP;

import substationStandard.Dataclasses.ACD;
import substationStandard.Dataclasses.ACT;
import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.CSD;
import substationStandard.Dataclasses.CURVE;
import substationStandard.Dataclasses.ING;
import substationStandard.Dataclasses.WYE;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PDIF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PDIF#getStr <em>Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PDIF#getOp <em>Op</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PDIF#getTmASt <em>Tm ASt</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PDIF#getDifAClc <em>Dif AClc</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PDIF#getRstA <em>Rst A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PDIF#getLinCapac <em>Lin Capac</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PDIF#getLoSet <em>Lo Set</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PDIF#getHiSet <em>Hi Set</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PDIF#getMinOpTmms <em>Min Op Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PDIF#getMaxOpTmms <em>Max Op Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PDIF#getRstMod <em>Rst Mod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PDIF#getRsDiTmms <em>Rs Di Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PDIF#getTmACrv <em>Tm ACrv</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIF()
 * @model
 * @generated
 */
public interface PDIF extends GroupP {
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIF_Str()
	 * @model required="true"
	 * @generated
	 */
	ACD getStr();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PDIF#getStr <em>Str</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIF_Op()
	 * @model required="true"
	 * @generated
	 */
	ACT getOp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PDIF#getOp <em>Op</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIF_TmASt()
	 * @model required="true"
	 * @generated
	 */
	CSD getTmASt();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PDIF#getTmASt <em>Tm ASt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tm ASt</em>' reference.
	 * @see #getTmASt()
	 * @generated
	 */
	void setTmASt(CSD value);

	/**
	 * Returns the value of the '<em><b>Dif AClc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dif AClc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dif AClc</em>' reference.
	 * @see #setDifAClc(WYE)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIF_DifAClc()
	 * @model required="true"
	 * @generated
	 */
	WYE getDifAClc();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PDIF#getDifAClc <em>Dif AClc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dif AClc</em>' reference.
	 * @see #getDifAClc()
	 * @generated
	 */
	void setDifAClc(WYE value);

	/**
	 * Returns the value of the '<em><b>Rst A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rst A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rst A</em>' reference.
	 * @see #setRstA(WYE)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIF_RstA()
	 * @model required="true"
	 * @generated
	 */
	WYE getRstA();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PDIF#getRstA <em>Rst A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rst A</em>' reference.
	 * @see #getRstA()
	 * @generated
	 */
	void setRstA(WYE value);

	/**
	 * Returns the value of the '<em><b>Lin Capac</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lin Capac</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lin Capac</em>' reference.
	 * @see #setLinCapac(ASG)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIF_LinCapac()
	 * @model required="true"
	 * @generated
	 */
	ASG getLinCapac();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PDIF#getLinCapac <em>Lin Capac</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lin Capac</em>' reference.
	 * @see #getLinCapac()
	 * @generated
	 */
	void setLinCapac(ASG value);

	/**
	 * Returns the value of the '<em><b>Lo Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lo Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lo Set</em>' reference.
	 * @see #setLoSet(ING)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIF_LoSet()
	 * @model required="true"
	 * @generated
	 */
	ING getLoSet();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PDIF#getLoSet <em>Lo Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lo Set</em>' reference.
	 * @see #getLoSet()
	 * @generated
	 */
	void setLoSet(ING value);

	/**
	 * Returns the value of the '<em><b>Hi Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hi Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hi Set</em>' reference.
	 * @see #setHiSet(ING)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIF_HiSet()
	 * @model required="true"
	 * @generated
	 */
	ING getHiSet();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PDIF#getHiSet <em>Hi Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hi Set</em>' reference.
	 * @see #getHiSet()
	 * @generated
	 */
	void setHiSet(ING value);

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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIF_MinOpTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getMinOpTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PDIF#getMinOpTmms <em>Min Op Tmms</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIF_MaxOpTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getMaxOpTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PDIF#getMaxOpTmms <em>Max Op Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Op Tmms</em>' reference.
	 * @see #getMaxOpTmms()
	 * @generated
	 */
	void setMaxOpTmms(ING value);

	/**
	 * Returns the value of the '<em><b>Rst Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rst Mod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rst Mod</em>' reference.
	 * @see #setRstMod(ING)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIF_RstMod()
	 * @model required="true"
	 * @generated
	 */
	ING getRstMod();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PDIF#getRstMod <em>Rst Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rst Mod</em>' reference.
	 * @see #getRstMod()
	 * @generated
	 */
	void setRstMod(ING value);

	/**
	 * Returns the value of the '<em><b>Rs Di Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rs Di Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rs Di Tmms</em>' reference.
	 * @see #setRsDiTmms(ING)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIF_RsDiTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getRsDiTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PDIF#getRsDiTmms <em>Rs Di Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rs Di Tmms</em>' reference.
	 * @see #getRsDiTmms()
	 * @generated
	 */
	void setRsDiTmms(ING value);

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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPDIF_TmACrv()
	 * @model required="true"
	 * @generated
	 */
	CURVE getTmACrv();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PDIF#getTmACrv <em>Tm ACrv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tm ACrv</em>' reference.
	 * @see #getTmACrv()
	 * @generated
	 */
	void setTmACrv(CURVE value);

} // PDIF
