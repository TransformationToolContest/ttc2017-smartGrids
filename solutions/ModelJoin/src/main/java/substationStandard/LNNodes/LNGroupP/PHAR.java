/**
 */
package substationStandard.LNNodes.LNGroupP;

import substationStandard.Dataclasses.ACD;
import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.ING;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PHAR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PHAR#getStr <em>Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PHAR#getHaRst <em>Ha Rst</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PHAR#getPhStr <em>Ph Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PHAR#getPhStop <em>Ph Stop</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PHAR#getOpDiTmms <em>Op Di Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PHAR#getRsDiTmms <em>Rs Di Tmms</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPHAR()
 * @model
 * @generated
 */
public interface PHAR extends GroupP {
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPHAR_Str()
	 * @model required="true"
	 * @generated
	 */
	ACD getStr();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PHAR#getStr <em>Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str</em>' reference.
	 * @see #getStr()
	 * @generated
	 */
	void setStr(ACD value);

	/**
	 * Returns the value of the '<em><b>Ha Rst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ha Rst</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ha Rst</em>' reference.
	 * @see #setHaRst(ING)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPHAR_HaRst()
	 * @model required="true"
	 * @generated
	 */
	ING getHaRst();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PHAR#getHaRst <em>Ha Rst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ha Rst</em>' reference.
	 * @see #getHaRst()
	 * @generated
	 */
	void setHaRst(ING value);

	/**
	 * Returns the value of the '<em><b>Ph Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ph Str</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ph Str</em>' reference.
	 * @see #setPhStr(ASG)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPHAR_PhStr()
	 * @model required="true"
	 * @generated
	 */
	ASG getPhStr();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PHAR#getPhStr <em>Ph Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ph Str</em>' reference.
	 * @see #getPhStr()
	 * @generated
	 */
	void setPhStr(ASG value);

	/**
	 * Returns the value of the '<em><b>Ph Stop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ph Stop</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ph Stop</em>' reference.
	 * @see #setPhStop(ASG)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPHAR_PhStop()
	 * @model required="true"
	 * @generated
	 */
	ASG getPhStop();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PHAR#getPhStop <em>Ph Stop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ph Stop</em>' reference.
	 * @see #getPhStop()
	 * @generated
	 */
	void setPhStop(ASG value);

	/**
	 * Returns the value of the '<em><b>Op Di Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Di Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Di Tmms</em>' reference.
	 * @see #setOpDiTmms(ING)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPHAR_OpDiTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getOpDiTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PHAR#getOpDiTmms <em>Op Di Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Di Tmms</em>' reference.
	 * @see #getOpDiTmms()
	 * @generated
	 */
	void setOpDiTmms(ING value);

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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPHAR_RsDiTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getRsDiTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PHAR#getRsDiTmms <em>Rs Di Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rs Di Tmms</em>' reference.
	 * @see #getRsDiTmms()
	 * @generated
	 */
	void setRsDiTmms(ING value);

} // PHAR
