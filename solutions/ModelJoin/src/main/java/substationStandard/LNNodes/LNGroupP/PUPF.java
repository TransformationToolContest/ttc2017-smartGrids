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
 * A representation of the model object '<em><b>PUPF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PUPF#getStr <em>Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PUPF#getOp <em>Op</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PUPF#getBlkA <em>Blk A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PUPF#getBlkV <em>Blk V</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PUPF#getStrVal <em>Str Val</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PUPF#getOpDlTmms <em>Op Dl Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PUPF#getRsDlTmms <em>Rs Dl Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PUPF#getBlkValA <em>Blk Val A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.PUPF#getBlkValV <em>Blk Val V</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPUPF()
 * @model
 * @generated
 */
public interface PUPF extends GroupP {
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPUPF_Str()
	 * @model required="true"
	 * @generated
	 */
	ACD getStr();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PUPF#getStr <em>Str</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPUPF_Op()
	 * @model required="true"
	 * @generated
	 */
	ACT getOp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PUPF#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(ACT value);

	/**
	 * Returns the value of the '<em><b>Blk A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blk A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blk A</em>' reference.
	 * @see #setBlkA(SPS)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPUPF_BlkA()
	 * @model required="true"
	 * @generated
	 */
	SPS getBlkA();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PUPF#getBlkA <em>Blk A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blk A</em>' reference.
	 * @see #getBlkA()
	 * @generated
	 */
	void setBlkA(SPS value);

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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPUPF_BlkV()
	 * @model required="true"
	 * @generated
	 */
	SPS getBlkV();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PUPF#getBlkV <em>Blk V</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPUPF_StrVal()
	 * @model required="true"
	 * @generated
	 */
	ASG getStrVal();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PUPF#getStrVal <em>Str Val</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPUPF_OpDlTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getOpDlTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PUPF#getOpDlTmms <em>Op Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Dl Tmms</em>' reference.
	 * @see #getOpDlTmms()
	 * @generated
	 */
	void setOpDlTmms(ING value);

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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPUPF_RsDlTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getRsDlTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PUPF#getRsDlTmms <em>Rs Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rs Dl Tmms</em>' reference.
	 * @see #getRsDlTmms()
	 * @generated
	 */
	void setRsDlTmms(ING value);

	/**
	 * Returns the value of the '<em><b>Blk Val A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blk Val A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blk Val A</em>' reference.
	 * @see #setBlkValA(ASG)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPUPF_BlkValA()
	 * @model required="true"
	 * @generated
	 */
	ASG getBlkValA();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PUPF#getBlkValA <em>Blk Val A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blk Val A</em>' reference.
	 * @see #getBlkValA()
	 * @generated
	 */
	void setBlkValA(ASG value);

	/**
	 * Returns the value of the '<em><b>Blk Val V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blk Val V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blk Val V</em>' reference.
	 * @see #setBlkValV(ASG)
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPUPF_BlkValV()
	 * @model required="true"
	 * @generated
	 */
	ASG getBlkValV();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupP.PUPF#getBlkValV <em>Blk Val V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blk Val V</em>' reference.
	 * @see #getBlkValV()
	 * @generated
	 */
	void setBlkValV(ASG value);

} // PUPF
