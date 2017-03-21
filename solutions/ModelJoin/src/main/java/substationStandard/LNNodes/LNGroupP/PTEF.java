/**
 */
package substationStandard.LNNodes.LNGroupP;

import substationStandard.Dataclasses.ACD;
import substationStandard.Dataclasses.ACT;
import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.ING;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PTEF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTEF#getStr <em>Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTEF#getOp <em>Op</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTEF#getGndStr <em>Gnd Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PTEF#getDirMod <em>Dir Mod</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTEF()
 * @model
 * @generated
 */
public interface PTEF extends GroupP {
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTEF_Str()
	 * @model required="true"
	 * @generated
	 */
	ACD getStr();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTEF#getStr <em>Str</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTEF_Op()
	 * @model required="true"
	 * @generated
	 */
	ACT getOp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTEF#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(ACT value);

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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTEF_GndStr()
	 * @model required="true"
	 * @generated
	 */
	ASG getGndStr();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTEF#getGndStr <em>Gnd Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gnd Str</em>' reference.
	 * @see #getGndStr()
	 * @generated
	 */
	void setGndStr(ASG value);

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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPTEF_DirMod()
	 * @model required="true"
	 * @generated
	 */
	ING getDirMod();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PTEF#getDirMod <em>Dir Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir Mod</em>' reference.
	 * @see #getDirMod()
	 * @generated
	 */
	void setDirMod(ING value);

} // PTEF
