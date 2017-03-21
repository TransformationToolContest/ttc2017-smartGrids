/**
 */
package substationStandard.LNNodes.LNGroupR;

import substationStandard.Dataclasses.ACD;
import substationStandard.Dataclasses.ACT;
import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.INC;
import substationStandard.Dataclasses.ING;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RBRF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RBRF#getOpCntRs <em>Op Cnt Rs</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RBRF#getStr <em>Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RBRF#getOpEx <em>Op Ex</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RBRF#getOpIn <em>Op In</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RBRF#getFailMod <em>Fail Mod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RBRF#getFailTmms <em>Fail Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RBRF#getSPlTrTmms <em>SPl Tr Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RBRF#getTPTrTmms <em>TP Tr Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RBRF#getDetValA <em>Det Val A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RBRF#getReTrMod <em>Re Tr Mod</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRBRF()
 * @model
 * @generated
 */
public interface RBRF extends GroupR {
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
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRBRF_OpCntRs()
	 * @model required="true"
	 * @generated
	 */
	INC getOpCntRs();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RBRF#getOpCntRs <em>Op Cnt Rs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Cnt Rs</em>' reference.
	 * @see #getOpCntRs()
	 * @generated
	 */
	void setOpCntRs(INC value);

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
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRBRF_Str()
	 * @model required="true"
	 * @generated
	 */
	ACD getStr();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RBRF#getStr <em>Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str</em>' reference.
	 * @see #getStr()
	 * @generated
	 */
	void setStr(ACD value);

	/**
	 * Returns the value of the '<em><b>Op Ex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Ex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Ex</em>' reference.
	 * @see #setOpEx(ACT)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRBRF_OpEx()
	 * @model required="true"
	 * @generated
	 */
	ACT getOpEx();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RBRF#getOpEx <em>Op Ex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Ex</em>' reference.
	 * @see #getOpEx()
	 * @generated
	 */
	void setOpEx(ACT value);

	/**
	 * Returns the value of the '<em><b>Op In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op In</em>' reference.
	 * @see #setOpIn(ACT)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRBRF_OpIn()
	 * @model required="true"
	 * @generated
	 */
	ACT getOpIn();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RBRF#getOpIn <em>Op In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op In</em>' reference.
	 * @see #getOpIn()
	 * @generated
	 */
	void setOpIn(ACT value);

	/**
	 * Returns the value of the '<em><b>Fail Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fail Mod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fail Mod</em>' reference.
	 * @see #setFailMod(ING)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRBRF_FailMod()
	 * @model required="true"
	 * @generated
	 */
	ING getFailMod();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RBRF#getFailMod <em>Fail Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fail Mod</em>' reference.
	 * @see #getFailMod()
	 * @generated
	 */
	void setFailMod(ING value);

	/**
	 * Returns the value of the '<em><b>Fail Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fail Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fail Tmms</em>' reference.
	 * @see #setFailTmms(ING)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRBRF_FailTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getFailTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RBRF#getFailTmms <em>Fail Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fail Tmms</em>' reference.
	 * @see #getFailTmms()
	 * @generated
	 */
	void setFailTmms(ING value);

	/**
	 * Returns the value of the '<em><b>SPl Tr Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPl Tr Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPl Tr Tmms</em>' reference.
	 * @see #setSPlTrTmms(ING)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRBRF_SPlTrTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getSPlTrTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RBRF#getSPlTrTmms <em>SPl Tr Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPl Tr Tmms</em>' reference.
	 * @see #getSPlTrTmms()
	 * @generated
	 */
	void setSPlTrTmms(ING value);

	/**
	 * Returns the value of the '<em><b>TP Tr Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TP Tr Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TP Tr Tmms</em>' reference.
	 * @see #setTPTrTmms(ING)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRBRF_TPTrTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getTPTrTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RBRF#getTPTrTmms <em>TP Tr Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TP Tr Tmms</em>' reference.
	 * @see #getTPTrTmms()
	 * @generated
	 */
	void setTPTrTmms(ING value);

	/**
	 * Returns the value of the '<em><b>Det Val A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Det Val A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Det Val A</em>' reference.
	 * @see #setDetValA(ASG)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRBRF_DetValA()
	 * @model required="true"
	 * @generated
	 */
	ASG getDetValA();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RBRF#getDetValA <em>Det Val A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Det Val A</em>' reference.
	 * @see #getDetValA()
	 * @generated
	 */
	void setDetValA(ASG value);

	/**
	 * Returns the value of the '<em><b>Re Tr Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Re Tr Mod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Re Tr Mod</em>' reference.
	 * @see #setReTrMod(ING)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRBRF_ReTrMod()
	 * @model required="true"
	 * @generated
	 */
	ING getReTrMod();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RBRF#getReTrMod <em>Re Tr Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Re Tr Mod</em>' reference.
	 * @see #getReTrMod()
	 * @generated
	 */
	void setReTrMod(ING value);

} // RBRF
