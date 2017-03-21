/**
 */
package substationStandard.LNNodes.LNGroupX;

import substationStandard.Dataclasses.DPC;
import substationStandard.Dataclasses.DPL;
import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.SPC;
import substationStandard.Dataclasses.SPS;

import substationStandard.Enumerations.HealthStateKind;

import substationStandard.LNNodes.DomainLNs.DomainLN;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group X</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupX.GroupX#getLoc <em>Loc</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupX.GroupX#getEEHealth <em>EE Health</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupX.GroupX#getEEName <em>EE Name</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupX.GroupX#getOpCnt <em>Op Cnt</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupX.GroupX#getPos <em>Pos</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupX.GroupX#getBlkOpn <em>Blk Opn</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupX.GroupX#getBlkCls <em>Blk Cls</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupX.GroupX#getChaMotEna <em>Cha Mot Ena</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupX.LNGroupXPackage#getGroupX()
 * @model
 * @generated
 */
public interface GroupX extends DomainLN {
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
	 * @see substationStandard.LNNodes.LNGroupX.LNGroupXPackage#getGroupX_Loc()
	 * @model required="true"
	 * @generated
	 */
	SPS getLoc();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupX.GroupX#getLoc <em>Loc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc</em>' reference.
	 * @see #getLoc()
	 * @generated
	 */
	void setLoc(SPS value);

	/**
	 * Returns the value of the '<em><b>EE Health</b></em>' attribute.
	 * The literals are from the enumeration {@link substationStandard.Enumerations.HealthStateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EE Health</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EE Health</em>' attribute.
	 * @see substationStandard.Enumerations.HealthStateKind
	 * @see #setEEHealth(HealthStateKind)
	 * @see substationStandard.LNNodes.LNGroupX.LNGroupXPackage#getGroupX_EEHealth()
	 * @model
	 * @generated
	 */
	HealthStateKind getEEHealth();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupX.GroupX#getEEHealth <em>EE Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EE Health</em>' attribute.
	 * @see substationStandard.Enumerations.HealthStateKind
	 * @see #getEEHealth()
	 * @generated
	 */
	void setEEHealth(HealthStateKind value);

	/**
	 * Returns the value of the '<em><b>EE Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EE Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EE Name</em>' reference.
	 * @see #setEEName(DPL)
	 * @see substationStandard.LNNodes.LNGroupX.LNGroupXPackage#getGroupX_EEName()
	 * @model required="true"
	 * @generated
	 */
	DPL getEEName();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupX.GroupX#getEEName <em>EE Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EE Name</em>' reference.
	 * @see #getEEName()
	 * @generated
	 */
	void setEEName(DPL value);

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
	 * @see substationStandard.LNNodes.LNGroupX.LNGroupXPackage#getGroupX_OpCnt()
	 * @model required="true"
	 * @generated
	 */
	INS getOpCnt();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupX.GroupX#getOpCnt <em>Op Cnt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Cnt</em>' reference.
	 * @see #getOpCnt()
	 * @generated
	 */
	void setOpCnt(INS value);

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
	 * @see substationStandard.LNNodes.LNGroupX.LNGroupXPackage#getGroupX_Pos()
	 * @model required="true"
	 * @generated
	 */
	DPC getPos();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupX.GroupX#getPos <em>Pos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' reference.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(DPC value);

	/**
	 * Returns the value of the '<em><b>Blk Opn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blk Opn</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blk Opn</em>' reference.
	 * @see #setBlkOpn(SPC)
	 * @see substationStandard.LNNodes.LNGroupX.LNGroupXPackage#getGroupX_BlkOpn()
	 * @model required="true"
	 * @generated
	 */
	SPC getBlkOpn();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupX.GroupX#getBlkOpn <em>Blk Opn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blk Opn</em>' reference.
	 * @see #getBlkOpn()
	 * @generated
	 */
	void setBlkOpn(SPC value);

	/**
	 * Returns the value of the '<em><b>Blk Cls</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blk Cls</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blk Cls</em>' reference.
	 * @see #setBlkCls(SPC)
	 * @see substationStandard.LNNodes.LNGroupX.LNGroupXPackage#getGroupX_BlkCls()
	 * @model required="true"
	 * @generated
	 */
	SPC getBlkCls();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupX.GroupX#getBlkCls <em>Blk Cls</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blk Cls</em>' reference.
	 * @see #getBlkCls()
	 * @generated
	 */
	void setBlkCls(SPC value);

	/**
	 * Returns the value of the '<em><b>Cha Mot Ena</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cha Mot Ena</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cha Mot Ena</em>' reference.
	 * @see #setChaMotEna(SPC)
	 * @see substationStandard.LNNodes.LNGroupX.LNGroupXPackage#getGroupX_ChaMotEna()
	 * @model required="true"
	 * @generated
	 */
	SPC getChaMotEna();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupX.GroupX#getChaMotEna <em>Cha Mot Ena</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cha Mot Ena</em>' reference.
	 * @see #getChaMotEna()
	 * @generated
	 */
	void setChaMotEna(SPC value);

} // GroupX
