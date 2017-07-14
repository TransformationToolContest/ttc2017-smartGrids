/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupR;

import gluemodel.substationStandard.Dataclasses.ACD;
import gluemodel.substationStandard.Dataclasses.ACT;
import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.INC;
import gluemodel.substationStandard.Dataclasses.ING;
import gluemodel.substationStandard.Dataclasses.SPG;
import gluemodel.substationStandard.Dataclasses.SPS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RPSB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getOpCntRs <em>Op Cnt Rs</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getStr <em>Str</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getOp <em>Op</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getBlkZn <em>Blk Zn</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getZeroEna <em>Zero Ena</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getNgEna <em>Ng Ena</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getMaxEna <em>Max Ena</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getSwgVal <em>Swg Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getSwgRis <em>Swg Ris</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getSwgReact <em>Swg React</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getSwgTmms <em>Swg Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getUnBlkTmms <em>Un Blk Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getMaxNumSlp <em>Max Num Slp</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getEvTmms <em>Ev Tmms</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRPSB()
 * @model
 * @generated
 */
public interface RPSB extends GroupR {
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRPSB_OpCntRs()
	 * @model required="true"
	 * @generated
	 */
	INC getOpCntRs();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getOpCntRs <em>Op Cnt Rs</em>}' reference.
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRPSB_Str()
	 * @model required="true"
	 * @generated
	 */
	ACD getStr();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getStr <em>Str</em>}' reference.
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
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRPSB_Op()
	 * @model required="true"
	 * @generated
	 */
	ACT getOp();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(ACT value);

	/**
	 * Returns the value of the '<em><b>Blk Zn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blk Zn</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blk Zn</em>' reference.
	 * @see #setBlkZn(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRPSB_BlkZn()
	 * @model required="true"
	 * @generated
	 */
	SPS getBlkZn();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getBlkZn <em>Blk Zn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blk Zn</em>' reference.
	 * @see #getBlkZn()
	 * @generated
	 */
	void setBlkZn(SPS value);

	/**
	 * Returns the value of the '<em><b>Zero Ena</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zero Ena</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zero Ena</em>' reference.
	 * @see #setZeroEna(SPG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRPSB_ZeroEna()
	 * @model required="true"
	 * @generated
	 */
	SPG getZeroEna();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getZeroEna <em>Zero Ena</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zero Ena</em>' reference.
	 * @see #getZeroEna()
	 * @generated
	 */
	void setZeroEna(SPG value);

	/**
	 * Returns the value of the '<em><b>Ng Ena</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ng Ena</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ng Ena</em>' reference.
	 * @see #setNgEna(SPG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRPSB_NgEna()
	 * @model required="true"
	 * @generated
	 */
	SPG getNgEna();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getNgEna <em>Ng Ena</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ng Ena</em>' reference.
	 * @see #getNgEna()
	 * @generated
	 */
	void setNgEna(SPG value);

	/**
	 * Returns the value of the '<em><b>Max Ena</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Ena</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Ena</em>' reference.
	 * @see #setMaxEna(SPG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRPSB_MaxEna()
	 * @model required="true"
	 * @generated
	 */
	SPG getMaxEna();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getMaxEna <em>Max Ena</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Ena</em>' reference.
	 * @see #getMaxEna()
	 * @generated
	 */
	void setMaxEna(SPG value);

	/**
	 * Returns the value of the '<em><b>Swg Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swg Val</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swg Val</em>' reference.
	 * @see #setSwgVal(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRPSB_SwgVal()
	 * @model required="true"
	 * @generated
	 */
	ASG getSwgVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getSwgVal <em>Swg Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swg Val</em>' reference.
	 * @see #getSwgVal()
	 * @generated
	 */
	void setSwgVal(ASG value);

	/**
	 * Returns the value of the '<em><b>Swg Ris</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swg Ris</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swg Ris</em>' reference.
	 * @see #setSwgRis(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRPSB_SwgRis()
	 * @model required="true"
	 * @generated
	 */
	ASG getSwgRis();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getSwgRis <em>Swg Ris</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swg Ris</em>' reference.
	 * @see #getSwgRis()
	 * @generated
	 */
	void setSwgRis(ASG value);

	/**
	 * Returns the value of the '<em><b>Swg React</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swg React</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swg React</em>' reference.
	 * @see #setSwgReact(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRPSB_SwgReact()
	 * @model required="true"
	 * @generated
	 */
	ASG getSwgReact();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getSwgReact <em>Swg React</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swg React</em>' reference.
	 * @see #getSwgReact()
	 * @generated
	 */
	void setSwgReact(ASG value);

	/**
	 * Returns the value of the '<em><b>Swg Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swg Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swg Tmms</em>' reference.
	 * @see #setSwgTmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRPSB_SwgTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getSwgTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getSwgTmms <em>Swg Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swg Tmms</em>' reference.
	 * @see #getSwgTmms()
	 * @generated
	 */
	void setSwgTmms(ING value);

	/**
	 * Returns the value of the '<em><b>Un Blk Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Un Blk Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Un Blk Tmms</em>' reference.
	 * @see #setUnBlkTmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRPSB_UnBlkTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getUnBlkTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getUnBlkTmms <em>Un Blk Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Un Blk Tmms</em>' reference.
	 * @see #getUnBlkTmms()
	 * @generated
	 */
	void setUnBlkTmms(ING value);

	/**
	 * Returns the value of the '<em><b>Max Num Slp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Num Slp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Num Slp</em>' reference.
	 * @see #setMaxNumSlp(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRPSB_MaxNumSlp()
	 * @model required="true"
	 * @generated
	 */
	ING getMaxNumSlp();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getMaxNumSlp <em>Max Num Slp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Num Slp</em>' reference.
	 * @see #getMaxNumSlp()
	 * @generated
	 */
	void setMaxNumSlp(ING value);

	/**
	 * Returns the value of the '<em><b>Ev Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ev Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ev Tmms</em>' reference.
	 * @see #setEvTmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRPSB_EvTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getEvTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getEvTmms <em>Ev Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ev Tmms</em>' reference.
	 * @see #getEvTmms()
	 * @generated
	 */
	void setEvTmms(ING value);

} // RPSB
