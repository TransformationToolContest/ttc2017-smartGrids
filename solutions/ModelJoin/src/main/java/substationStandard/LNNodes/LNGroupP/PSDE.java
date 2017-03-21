/**
 */
package substationStandard.LNNodes.LNGroupP;

import substationStandard.Dataclasses.ACD;
import substationStandard.Dataclasses.ACT;
import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.ING;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PSDE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PSDE#getStr <em>Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PSDE#getOp <em>Op</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PSDE#getAng <em>Ang</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PSDE#getGndStr <em>Gnd Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PSDE#getGndOp <em>Gnd Op</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PSDE#getStrDlTmms <em>Str Dl Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PSDE#getOpDlTmms <em>Op Dl Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PSDE#getDirMod <em>Dir Mod</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSDE()
 * @model
 * @generated
 */
public interface PSDE extends GroupP {
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSDE_Str()
	 * @model required="true"
	 * @generated
	 */
	ACD getStr();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PSDE#getStr <em>Str</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSDE_Op()
	 * @model required="true"
	 * @generated
	 */
	ACT getOp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PSDE#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(ACT value);

	/**
	 * Returns the value of the '<em><b>Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ang</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ang</em>' reference.
	 * @see #setAng(ASG)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSDE_Ang()
	 * @model required="true"
	 * @generated
	 */
	ASG getAng();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PSDE#getAng <em>Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ang</em>' reference.
	 * @see #getAng()
	 * @generated
	 */
	void setAng(ASG value);

	/**
	 * Returns the value of the '<em><b>Gnd Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gnd Str</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gnd Str</em>' reference.
	 * @see #setGndStr(ASG)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSDE_GndStr()
	 * @model required="true"
	 * @generated
	 */
	ASG getGndStr();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PSDE#getGndStr <em>Gnd Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gnd Str</em>' reference.
	 * @see #getGndStr()
	 * @generated
	 */
	void setGndStr(ASG value);

	/**
	 * Returns the value of the '<em><b>Gnd Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gnd Op</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gnd Op</em>' reference.
	 * @see #setGndOp(ASG)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSDE_GndOp()
	 * @model required="true"
	 * @generated
	 */
	ASG getGndOp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PSDE#getGndOp <em>Gnd Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gnd Op</em>' reference.
	 * @see #getGndOp()
	 * @generated
	 */
	void setGndOp(ASG value);

	/**
	 * Returns the value of the '<em><b>Str Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Str Dl Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str Dl Tmms</em>' reference.
	 * @see #setStrDlTmms(ING)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSDE_StrDlTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getStrDlTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PSDE#getStrDlTmms <em>Str Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str Dl Tmms</em>' reference.
	 * @see #getStrDlTmms()
	 * @generated
	 */
	void setStrDlTmms(ING value);

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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSDE_OpDlTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getOpDlTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PSDE#getOpDlTmms <em>Op Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Dl Tmms</em>' reference.
	 * @see #getOpDlTmms()
	 * @generated
	 */
	void setOpDlTmms(ING value);

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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPSDE_DirMod()
	 * @model required="true"
	 * @generated
	 */
	ING getDirMod();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PSDE#getDirMod <em>Dir Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir Mod</em>' reference.
	 * @see #getDirMod()
	 * @generated
	 */
	void setDirMod(ING value);

} // PSDE
