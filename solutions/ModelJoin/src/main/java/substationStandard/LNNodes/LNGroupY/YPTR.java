/**
 */
package substationStandard.LNNodes.LNGroupY;

import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.MV;
import substationStandard.Dataclasses.SPS;

import substationStandard.LNNodes.LNGroupA.ATCC;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YPTR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YPTR#getOpTmh <em>Op Tmh</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YPTR#getHPTmp <em>HP Tmp</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YPTR#getHPZmpAlm <em>HP Zmp Alm</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YPTR#getHPTmpTr <em>HP Tmp Tr</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YPTR#getOANL <em>OANL</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YPTR#getOpOvA <em>Op Ov A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YPTR#getOpOvV <em>Op Ov V</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YPTR#getOpUnV <em>Op Un V</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YPTR#getCGAlm <em>CG Alm</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YPTR#getHiVRtg <em>Hi VRtg</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YPTR#getLoVRtg <em>Lo VRtg</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YPTR#getPwrRtg <em>Pwr Rtg</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YPTR#getTransformerControl <em>Transformer Control</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYPTR()
 * @model
 * @generated
 */
public interface YPTR extends GroupY {
	/**
	 * Returns the value of the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Tmh</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Tmh</em>' reference.
	 * @see #setOpTmh(INS)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYPTR_OpTmh()
	 * @model required="true"
	 * @generated
	 */
	INS getOpTmh();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YPTR#getOpTmh <em>Op Tmh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Tmh</em>' reference.
	 * @see #getOpTmh()
	 * @generated
	 */
	void setOpTmh(INS value);

	/**
	 * Returns the value of the '<em><b>HP Tmp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HP Tmp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HP Tmp</em>' reference.
	 * @see #setHPTmp(MV)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYPTR_HPTmp()
	 * @model required="true"
	 * @generated
	 */
	MV getHPTmp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YPTR#getHPTmp <em>HP Tmp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HP Tmp</em>' reference.
	 * @see #getHPTmp()
	 * @generated
	 */
	void setHPTmp(MV value);

	/**
	 * Returns the value of the '<em><b>HP Zmp Alm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HP Zmp Alm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HP Zmp Alm</em>' reference.
	 * @see #setHPZmpAlm(SPS)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYPTR_HPZmpAlm()
	 * @model required="true"
	 * @generated
	 */
	SPS getHPZmpAlm();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YPTR#getHPZmpAlm <em>HP Zmp Alm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HP Zmp Alm</em>' reference.
	 * @see #getHPZmpAlm()
	 * @generated
	 */
	void setHPZmpAlm(SPS value);

	/**
	 * Returns the value of the '<em><b>HP Tmp Tr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HP Tmp Tr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HP Tmp Tr</em>' reference.
	 * @see #setHPTmpTr(SPS)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYPTR_HPTmpTr()
	 * @model required="true"
	 * @generated
	 */
	SPS getHPTmpTr();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YPTR#getHPTmpTr <em>HP Tmp Tr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HP Tmp Tr</em>' reference.
	 * @see #getHPTmpTr()
	 * @generated
	 */
	void setHPTmpTr(SPS value);

	/**
	 * Returns the value of the '<em><b>OANL</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OANL</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OANL</em>' reference.
	 * @see #setOANL(SPS)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYPTR_OANL()
	 * @model required="true"
	 * @generated
	 */
	SPS getOANL();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YPTR#getOANL <em>OANL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OANL</em>' reference.
	 * @see #getOANL()
	 * @generated
	 */
	void setOANL(SPS value);

	/**
	 * Returns the value of the '<em><b>Op Ov A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Ov A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Ov A</em>' reference.
	 * @see #setOpOvA(SPS)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYPTR_OpOvA()
	 * @model required="true"
	 * @generated
	 */
	SPS getOpOvA();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YPTR#getOpOvA <em>Op Ov A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Ov A</em>' reference.
	 * @see #getOpOvA()
	 * @generated
	 */
	void setOpOvA(SPS value);

	/**
	 * Returns the value of the '<em><b>Op Ov V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Ov V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Ov V</em>' reference.
	 * @see #setOpOvV(SPS)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYPTR_OpOvV()
	 * @model required="true"
	 * @generated
	 */
	SPS getOpOvV();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YPTR#getOpOvV <em>Op Ov V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Ov V</em>' reference.
	 * @see #getOpOvV()
	 * @generated
	 */
	void setOpOvV(SPS value);

	/**
	 * Returns the value of the '<em><b>Op Un V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Un V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Un V</em>' reference.
	 * @see #setOpUnV(SPS)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYPTR_OpUnV()
	 * @model required="true"
	 * @generated
	 */
	SPS getOpUnV();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YPTR#getOpUnV <em>Op Un V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Un V</em>' reference.
	 * @see #getOpUnV()
	 * @generated
	 */
	void setOpUnV(SPS value);

	/**
	 * Returns the value of the '<em><b>CG Alm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CG Alm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CG Alm</em>' reference.
	 * @see #setCGAlm(SPS)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYPTR_CGAlm()
	 * @model required="true"
	 * @generated
	 */
	SPS getCGAlm();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YPTR#getCGAlm <em>CG Alm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CG Alm</em>' reference.
	 * @see #getCGAlm()
	 * @generated
	 */
	void setCGAlm(SPS value);

	/**
	 * Returns the value of the '<em><b>Hi VRtg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hi VRtg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hi VRtg</em>' reference.
	 * @see #setHiVRtg(ASG)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYPTR_HiVRtg()
	 * @model required="true"
	 * @generated
	 */
	ASG getHiVRtg();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YPTR#getHiVRtg <em>Hi VRtg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hi VRtg</em>' reference.
	 * @see #getHiVRtg()
	 * @generated
	 */
	void setHiVRtg(ASG value);

	/**
	 * Returns the value of the '<em><b>Lo VRtg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lo VRtg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lo VRtg</em>' reference.
	 * @see #setLoVRtg(ASG)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYPTR_LoVRtg()
	 * @model required="true"
	 * @generated
	 */
	ASG getLoVRtg();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YPTR#getLoVRtg <em>Lo VRtg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lo VRtg</em>' reference.
	 * @see #getLoVRtg()
	 * @generated
	 */
	void setLoVRtg(ASG value);

	/**
	 * Returns the value of the '<em><b>Pwr Rtg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pwr Rtg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pwr Rtg</em>' reference.
	 * @see #setPwrRtg(ASG)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYPTR_PwrRtg()
	 * @model required="true"
	 * @generated
	 */
	ASG getPwrRtg();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YPTR#getPwrRtg <em>Pwr Rtg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pwr Rtg</em>' reference.
	 * @see #getPwrRtg()
	 * @generated
	 */
	void setPwrRtg(ASG value);

	/**
	 * Returns the value of the '<em><b>Transformer Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Control</em>' reference.
	 * @see #setTransformerControl(ATCC)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYPTR_TransformerControl()
	 * @model
	 * @generated
	 */
	ATCC getTransformerControl();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YPTR#getTransformerControl <em>Transformer Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Control</em>' reference.
	 * @see #getTransformerControl()
	 * @generated
	 */
	void setTransformerControl(ATCC value);

} // YPTR
