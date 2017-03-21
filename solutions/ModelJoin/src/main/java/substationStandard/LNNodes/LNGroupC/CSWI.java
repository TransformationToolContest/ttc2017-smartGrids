/**
 */
package substationStandard.LNNodes.LNGroupC;

import substationStandard.Dataclasses.ACT;
import substationStandard.Dataclasses.DPC;
import substationStandard.Dataclasses.INC;
import substationStandard.Dataclasses.SPS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSWI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.CSWI#getLoc <em>Loc</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.CSWI#getOpCntRs <em>Op Cnt Rs</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.CSWI#getPos <em>Pos</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.CSWI#getPosA <em>Pos A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.CSWI#getPosB <em>Pos B</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.CSWI#getPosC <em>Pos C</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.CSWI#getOpOpn <em>Op Opn</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.CSWI#getOpCls <em>Op Cls</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCSWI()
 * @model
 * @generated
 */
public interface CSWI extends GroupC {
	/**
	 * Returns the value of the '<em><b>Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loc</em>' reference.
	 * @see #setLoc(SPS)
	 * @see substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCSWI_Loc()
	 * @model required="true"
	 * @generated
	 */
	SPS getLoc();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupC.CSWI#getLoc <em>Loc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc</em>' reference.
	 * @see #getLoc()
	 * @generated
	 */
	void setLoc(SPS value);

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
	 * @see substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCSWI_OpCntRs()
	 * @model required="true"
	 * @generated
	 */
	INC getOpCntRs();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupC.CSWI#getOpCntRs <em>Op Cnt Rs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Cnt Rs</em>' reference.
	 * @see #getOpCntRs()
	 * @generated
	 */
	void setOpCntRs(INC value);

	/**
	 * Returns the value of the '<em><b>Pos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' reference.
	 * @see #setPos(DPC)
	 * @see substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCSWI_Pos()
	 * @model required="true"
	 * @generated
	 */
	DPC getPos();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupC.CSWI#getPos <em>Pos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' reference.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(DPC value);

	/**
	 * Returns the value of the '<em><b>Pos A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos A</em>' reference.
	 * @see #setPosA(DPC)
	 * @see substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCSWI_PosA()
	 * @model required="true"
	 * @generated
	 */
	DPC getPosA();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupC.CSWI#getPosA <em>Pos A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos A</em>' reference.
	 * @see #getPosA()
	 * @generated
	 */
	void setPosA(DPC value);

	/**
	 * Returns the value of the '<em><b>Pos B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos B</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos B</em>' reference.
	 * @see #setPosB(DPC)
	 * @see substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCSWI_PosB()
	 * @model required="true"
	 * @generated
	 */
	DPC getPosB();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupC.CSWI#getPosB <em>Pos B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos B</em>' reference.
	 * @see #getPosB()
	 * @generated
	 */
	void setPosB(DPC value);

	/**
	 * Returns the value of the '<em><b>Pos C</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos C</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos C</em>' reference.
	 * @see #setPosC(DPC)
	 * @see substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCSWI_PosC()
	 * @model required="true"
	 * @generated
	 */
	DPC getPosC();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupC.CSWI#getPosC <em>Pos C</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos C</em>' reference.
	 * @see #getPosC()
	 * @generated
	 */
	void setPosC(DPC value);

	/**
	 * Returns the value of the '<em><b>Op Opn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Opn</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Opn</em>' reference.
	 * @see #setOpOpn(ACT)
	 * @see substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCSWI_OpOpn()
	 * @model required="true"
	 * @generated
	 */
	ACT getOpOpn();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupC.CSWI#getOpOpn <em>Op Opn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Opn</em>' reference.
	 * @see #getOpOpn()
	 * @generated
	 */
	void setOpOpn(ACT value);

	/**
	 * Returns the value of the '<em><b>Op Cls</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Cls</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Cls</em>' reference.
	 * @see #setOpCls(ACT)
	 * @see substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCSWI_OpCls()
	 * @model required="true"
	 * @generated
	 */
	ACT getOpCls();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupC.CSWI#getOpCls <em>Op Cls</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Cls</em>' reference.
	 * @see #getOpCls()
	 * @generated
	 */
	void setOpCls(ACT value);

} // CSWI
