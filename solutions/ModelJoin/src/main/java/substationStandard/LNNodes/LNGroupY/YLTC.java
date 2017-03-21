/**
 */
package substationStandard.LNNodes.LNGroupY;

import substationStandard.Dataclasses.BSC;
import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.ISC;
import substationStandard.Dataclasses.MV;
import substationStandard.Dataclasses.SPS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YLTC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YLTC#getOpCnt <em>Op Cnt</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YLTC#getTorq <em>Torq</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YLTC#getMotDrvA <em>Mot Drv A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YLTC#getTapPos <em>Tap Pos</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YLTC#getTapChg <em>Tap Chg</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YLTC#getEndPosR <em>End Pos R</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YLTC#getEndPosL <em>End Pos L</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YLTC#getOilFil <em>Oil Fil</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYLTC()
 * @model
 * @generated
 */
public interface YLTC extends GroupY {
	/**
	 * Returns the value of the '<em><b>Op Cnt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Cnt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Cnt</em>' reference.
	 * @see #setOpCnt(INS)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYLTC_OpCnt()
	 * @model required="true"
	 * @generated
	 */
	INS getOpCnt();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YLTC#getOpCnt <em>Op Cnt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Cnt</em>' reference.
	 * @see #getOpCnt()
	 * @generated
	 */
	void setOpCnt(INS value);

	/**
	 * Returns the value of the '<em><b>Torq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Torq</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Torq</em>' reference.
	 * @see #setTorq(MV)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYLTC_Torq()
	 * @model required="true"
	 * @generated
	 */
	MV getTorq();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YLTC#getTorq <em>Torq</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Torq</em>' reference.
	 * @see #getTorq()
	 * @generated
	 */
	void setTorq(MV value);

	/**
	 * Returns the value of the '<em><b>Mot Drv A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mot Drv A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mot Drv A</em>' reference.
	 * @see #setMotDrvA(MV)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYLTC_MotDrvA()
	 * @model required="true"
	 * @generated
	 */
	MV getMotDrvA();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YLTC#getMotDrvA <em>Mot Drv A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mot Drv A</em>' reference.
	 * @see #getMotDrvA()
	 * @generated
	 */
	void setMotDrvA(MV value);

	/**
	 * Returns the value of the '<em><b>Tap Pos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tap Pos</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tap Pos</em>' reference.
	 * @see #setTapPos(ISC)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYLTC_TapPos()
	 * @model required="true"
	 * @generated
	 */
	ISC getTapPos();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YLTC#getTapPos <em>Tap Pos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tap Pos</em>' reference.
	 * @see #getTapPos()
	 * @generated
	 */
	void setTapPos(ISC value);

	/**
	 * Returns the value of the '<em><b>Tap Chg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tap Chg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tap Chg</em>' reference.
	 * @see #setTapChg(BSC)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYLTC_TapChg()
	 * @model required="true"
	 * @generated
	 */
	BSC getTapChg();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YLTC#getTapChg <em>Tap Chg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tap Chg</em>' reference.
	 * @see #getTapChg()
	 * @generated
	 */
	void setTapChg(BSC value);

	/**
	 * Returns the value of the '<em><b>End Pos R</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Pos R</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Pos R</em>' reference.
	 * @see #setEndPosR(SPS)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYLTC_EndPosR()
	 * @model required="true"
	 * @generated
	 */
	SPS getEndPosR();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YLTC#getEndPosR <em>End Pos R</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Pos R</em>' reference.
	 * @see #getEndPosR()
	 * @generated
	 */
	void setEndPosR(SPS value);

	/**
	 * Returns the value of the '<em><b>End Pos L</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Pos L</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Pos L</em>' reference.
	 * @see #setEndPosL(SPS)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYLTC_EndPosL()
	 * @model required="true"
	 * @generated
	 */
	SPS getEndPosL();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YLTC#getEndPosL <em>End Pos L</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Pos L</em>' reference.
	 * @see #getEndPosL()
	 * @generated
	 */
	void setEndPosL(SPS value);

	/**
	 * Returns the value of the '<em><b>Oil Fil</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oil Fil</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oil Fil</em>' reference.
	 * @see #setOilFil(SPS)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYLTC_OilFil()
	 * @model required="true"
	 * @generated
	 */
	SPS getOilFil();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YLTC#getOilFil <em>Oil Fil</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oil Fil</em>' reference.
	 * @see #getOilFil()
	 * @generated
	 */
	void setOilFil(SPS value);

} // YLTC
