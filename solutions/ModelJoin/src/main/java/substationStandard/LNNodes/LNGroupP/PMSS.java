/**
 */
package substationStandard.LNNodes.LNGroupP;

import substationStandard.Dataclasses.ACD;
import substationStandard.Dataclasses.ACT;
import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.ING;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PMSS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PMSS#getStr <em>Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PMSS#getOp <em>Op</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PMSS#getSetA <em>Set A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PMSS#getSetTms <em>Set Tms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PMSS#getMotStr <em>Mot Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PMSS#getLokRotTms <em>Lok Rot Tms</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPMSS()
 * @model
 * @generated
 */
public interface PMSS extends GroupP {
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPMSS_Str()
	 * @model required="true"
	 * @generated
	 */
	ACD getStr();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PMSS#getStr <em>Str</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPMSS_Op()
	 * @model required="true"
	 * @generated
	 */
	ACT getOp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PMSS#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(ACT value);

	/**
	 * Returns the value of the '<em><b>Set A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set A</em>' reference.
	 * @see #setSetA(ASG)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPMSS_SetA()
	 * @model required="true"
	 * @generated
	 */
	ASG getSetA();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PMSS#getSetA <em>Set A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set A</em>' reference.
	 * @see #getSetA()
	 * @generated
	 */
	void setSetA(ASG value);

	/**
	 * Returns the value of the '<em><b>Set Tms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Tms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Tms</em>' reference.
	 * @see #setSetTms(ING)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPMSS_SetTms()
	 * @model required="true"
	 * @generated
	 */
	ING getSetTms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PMSS#getSetTms <em>Set Tms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Tms</em>' reference.
	 * @see #getSetTms()
	 * @generated
	 */
	void setSetTms(ING value);

	/**
	 * Returns the value of the '<em><b>Mot Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mot Str</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mot Str</em>' reference.
	 * @see #setMotStr(ASG)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPMSS_MotStr()
	 * @model required="true"
	 * @generated
	 */
	ASG getMotStr();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PMSS#getMotStr <em>Mot Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mot Str</em>' reference.
	 * @see #getMotStr()
	 * @generated
	 */
	void setMotStr(ASG value);

	/**
	 * Returns the value of the '<em><b>Lok Rot Tms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lok Rot Tms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lok Rot Tms</em>' reference.
	 * @see #setLokRotTms(ING)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPMSS_LokRotTms()
	 * @model required="true"
	 * @generated
	 */
	ING getLokRotTms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PMSS#getLokRotTms <em>Lok Rot Tms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lok Rot Tms</em>' reference.
	 * @see #getLokRotTms()
	 * @generated
	 */
	void setLokRotTms(ING value);

} // PMSS
