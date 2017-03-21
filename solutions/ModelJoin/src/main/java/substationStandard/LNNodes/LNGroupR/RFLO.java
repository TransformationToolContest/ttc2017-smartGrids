/**
 */
package substationStandard.LNNodes.LNGroupR;

import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.CMV;
import substationStandard.Dataclasses.INC;
import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.MV;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RFLO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RFLO#getOpCntRs <em>Op Cnt Rs</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RFLO#getFltZ <em>Flt Z</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RFLO#getFltDiskm <em>Flt Diskm</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RFLO#getFltLoop <em>Flt Loop</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RFLO#getLinLenKm <em>Lin Len Km</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RFLO#getR1 <em>R1</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RFLO#getX1 <em>X1</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RFLO#getR0 <em>R0</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RFLO#getX0 <em>X0</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RFLO#getZ1Mod <em>Z1 Mod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RFLO#getZ1Ang <em>Z1 Ang</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RFLO#getZ0Mod <em>Z0 Mod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RFLO#getZ0Ang <em>Z0 Ang</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RFLO#getRm0 <em>Rm0</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RFLO#getXm0 <em>Xm0</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RFLO#getZm0Mod <em>Zm0 Mod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RFLO#getZm0Ang <em>Zm0 Ang</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRFLO()
 * @model
 * @generated
 */
public interface RFLO extends GroupR {
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
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRFLO_OpCntRs()
	 * @model required="true"
	 * @generated
	 */
	INC getOpCntRs();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RFLO#getOpCntRs <em>Op Cnt Rs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Cnt Rs</em>' reference.
	 * @see #getOpCntRs()
	 * @generated
	 */
	void setOpCntRs(INC value);

	/**
	 * Returns the value of the '<em><b>Flt Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flt Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flt Z</em>' reference.
	 * @see #setFltZ(CMV)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRFLO_FltZ()
	 * @model required="true"
	 * @generated
	 */
	CMV getFltZ();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RFLO#getFltZ <em>Flt Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flt Z</em>' reference.
	 * @see #getFltZ()
	 * @generated
	 */
	void setFltZ(CMV value);

	/**
	 * Returns the value of the '<em><b>Flt Diskm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flt Diskm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flt Diskm</em>' reference.
	 * @see #setFltDiskm(MV)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRFLO_FltDiskm()
	 * @model required="true"
	 * @generated
	 */
	MV getFltDiskm();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RFLO#getFltDiskm <em>Flt Diskm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flt Diskm</em>' reference.
	 * @see #getFltDiskm()
	 * @generated
	 */
	void setFltDiskm(MV value);

	/**
	 * Returns the value of the '<em><b>Flt Loop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flt Loop</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flt Loop</em>' reference.
	 * @see #setFltLoop(INS)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRFLO_FltLoop()
	 * @model required="true"
	 * @generated
	 */
	INS getFltLoop();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RFLO#getFltLoop <em>Flt Loop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flt Loop</em>' reference.
	 * @see #getFltLoop()
	 * @generated
	 */
	void setFltLoop(INS value);

	/**
	 * Returns the value of the '<em><b>Lin Len Km</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lin Len Km</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lin Len Km</em>' reference.
	 * @see #setLinLenKm(ASG)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRFLO_LinLenKm()
	 * @model required="true"
	 * @generated
	 */
	ASG getLinLenKm();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RFLO#getLinLenKm <em>Lin Len Km</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lin Len Km</em>' reference.
	 * @see #getLinLenKm()
	 * @generated
	 */
	void setLinLenKm(ASG value);

	/**
	 * Returns the value of the '<em><b>R1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R1</em>' reference.
	 * @see #setR1(ASG)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRFLO_R1()
	 * @model required="true"
	 * @generated
	 */
	ASG getR1();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RFLO#getR1 <em>R1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R1</em>' reference.
	 * @see #getR1()
	 * @generated
	 */
	void setR1(ASG value);

	/**
	 * Returns the value of the '<em><b>X1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X1</em>' reference.
	 * @see #setX1(ASG)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRFLO_X1()
	 * @model required="true"
	 * @generated
	 */
	ASG getX1();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RFLO#getX1 <em>X1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X1</em>' reference.
	 * @see #getX1()
	 * @generated
	 */
	void setX1(ASG value);

	/**
	 * Returns the value of the '<em><b>R0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R0</em>' reference.
	 * @see #setR0(ASG)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRFLO_R0()
	 * @model required="true"
	 * @generated
	 */
	ASG getR0();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RFLO#getR0 <em>R0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R0</em>' reference.
	 * @see #getR0()
	 * @generated
	 */
	void setR0(ASG value);

	/**
	 * Returns the value of the '<em><b>X0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X0</em>' reference.
	 * @see #setX0(ASG)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRFLO_X0()
	 * @model required="true"
	 * @generated
	 */
	ASG getX0();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RFLO#getX0 <em>X0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X0</em>' reference.
	 * @see #getX0()
	 * @generated
	 */
	void setX0(ASG value);

	/**
	 * Returns the value of the '<em><b>Z1 Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Z1 Mod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z1 Mod</em>' reference.
	 * @see #setZ1Mod(ASG)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRFLO_Z1Mod()
	 * @model required="true"
	 * @generated
	 */
	ASG getZ1Mod();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RFLO#getZ1Mod <em>Z1 Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z1 Mod</em>' reference.
	 * @see #getZ1Mod()
	 * @generated
	 */
	void setZ1Mod(ASG value);

	/**
	 * Returns the value of the '<em><b>Z1 Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Z1 Ang</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z1 Ang</em>' reference.
	 * @see #setZ1Ang(ASG)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRFLO_Z1Ang()
	 * @model required="true"
	 * @generated
	 */
	ASG getZ1Ang();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RFLO#getZ1Ang <em>Z1 Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z1 Ang</em>' reference.
	 * @see #getZ1Ang()
	 * @generated
	 */
	void setZ1Ang(ASG value);

	/**
	 * Returns the value of the '<em><b>Z0 Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Z0 Mod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z0 Mod</em>' reference.
	 * @see #setZ0Mod(ASG)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRFLO_Z0Mod()
	 * @model required="true"
	 * @generated
	 */
	ASG getZ0Mod();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RFLO#getZ0Mod <em>Z0 Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z0 Mod</em>' reference.
	 * @see #getZ0Mod()
	 * @generated
	 */
	void setZ0Mod(ASG value);

	/**
	 * Returns the value of the '<em><b>Z0 Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Z0 Ang</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z0 Ang</em>' reference.
	 * @see #setZ0Ang(ASG)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRFLO_Z0Ang()
	 * @model required="true"
	 * @generated
	 */
	ASG getZ0Ang();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RFLO#getZ0Ang <em>Z0 Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z0 Ang</em>' reference.
	 * @see #getZ0Ang()
	 * @generated
	 */
	void setZ0Ang(ASG value);

	/**
	 * Returns the value of the '<em><b>Rm0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rm0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rm0</em>' reference.
	 * @see #setRm0(ASG)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRFLO_Rm0()
	 * @model required="true"
	 * @generated
	 */
	ASG getRm0();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RFLO#getRm0 <em>Rm0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rm0</em>' reference.
	 * @see #getRm0()
	 * @generated
	 */
	void setRm0(ASG value);

	/**
	 * Returns the value of the '<em><b>Xm0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xm0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xm0</em>' reference.
	 * @see #setXm0(ASG)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRFLO_Xm0()
	 * @model required="true"
	 * @generated
	 */
	ASG getXm0();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RFLO#getXm0 <em>Xm0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xm0</em>' reference.
	 * @see #getXm0()
	 * @generated
	 */
	void setXm0(ASG value);

	/**
	 * Returns the value of the '<em><b>Zm0 Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zm0 Mod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zm0 Mod</em>' reference.
	 * @see #setZm0Mod(ASG)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRFLO_Zm0Mod()
	 * @model required="true"
	 * @generated
	 */
	ASG getZm0Mod();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RFLO#getZm0Mod <em>Zm0 Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zm0 Mod</em>' reference.
	 * @see #getZm0Mod()
	 * @generated
	 */
	void setZm0Mod(ASG value);

	/**
	 * Returns the value of the '<em><b>Zm0 Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zm0 Ang</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zm0 Ang</em>' reference.
	 * @see #setZm0Ang(ASG)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRFLO_Zm0Ang()
	 * @model required="true"
	 * @generated
	 */
	ASG getZm0Ang();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RFLO#getZm0Ang <em>Zm0 Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zm0 Ang</em>' reference.
	 * @see #getZm0Ang()
	 * @generated
	 */
	void setZm0Ang(ASG value);

} // RFLO
