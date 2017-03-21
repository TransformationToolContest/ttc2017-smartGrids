/**
 */
package substationStandard.LNNodes.LNGroupP;

import substationStandard.Dataclasses.ACD;
import substationStandard.Dataclasses.ACT;
import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.ING;
import substationStandard.Dataclasses.SPS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PFRC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PFRC#getStr <em>Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PFRC#getOp <em>Op</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PFRC#getBlkV <em>Blk V</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PFRC#getStrVal <em>Str Val</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PFRC#getBlkVal <em>Blk Val</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PFRC#getOpDiTmms <em>Op Di Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PFRC#getRsDiTmms <em>Rs Di Tmms</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPFRC()
 * @model
 * @generated
 */
public interface PFRC extends GroupP {
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPFRC_Str()
	 * @model required="true"
	 * @generated
	 */
	ACD getStr();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PFRC#getStr <em>Str</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPFRC_Op()
	 * @model required="true"
	 * @generated
	 */
	ACT getOp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PFRC#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(ACT value);

	/**
	 * Returns the value of the '<em><b>Blk V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blk V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blk V</em>' reference.
	 * @see #setBlkV(SPS)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPFRC_BlkV()
	 * @model required="true"
	 * @generated
	 */
	SPS getBlkV();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PFRC#getBlkV <em>Blk V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blk V</em>' reference.
	 * @see #getBlkV()
	 * @generated
	 */
	void setBlkV(SPS value);

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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPFRC_StrVal()
	 * @model required="true"
	 * @generated
	 */
	ASG getStrVal();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PFRC#getStrVal <em>Str Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str Val</em>' reference.
	 * @see #getStrVal()
	 * @generated
	 */
	void setStrVal(ASG value);

	/**
	 * Returns the value of the '<em><b>Blk Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blk Val</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blk Val</em>' reference.
	 * @see #setBlkVal(ASG)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPFRC_BlkVal()
	 * @model required="true"
	 * @generated
	 */
	ASG getBlkVal();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PFRC#getBlkVal <em>Blk Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blk Val</em>' reference.
	 * @see #getBlkVal()
	 * @generated
	 */
	void setBlkVal(ASG value);

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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPFRC_OpDiTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getOpDiTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PFRC#getOpDiTmms <em>Op Di Tmms</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPFRC_RsDiTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getRsDiTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PFRC#getRsDiTmms <em>Rs Di Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rs Di Tmms</em>' reference.
	 * @see #getRsDiTmms()
	 * @generated
	 */
	void setRsDiTmms(ING value);

} // PFRC
