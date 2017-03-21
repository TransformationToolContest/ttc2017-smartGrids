/**
 */
package substationStandard.LNNodes.LNGroupY;

import substationStandard.Dataclasses.DPC;
import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.SPC;

import substationStandard.Enumerations.SwitchingCapabilityKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YPSH</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YPSH#getOpTmh <em>Op Tmh</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YPSH#getPos <em>Pos</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YPSH#getBlkOpn <em>Blk Opn</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YPSH#getBlkCls <em>Blk Cls</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YPSH#getChaMotEna <em>Cha Mot Ena</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YPSH#getShOpCap <em>Sh Op Cap</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YPSH#getMaxOpCap <em>Max Op Cap</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYPSH()
 * @model
 * @generated
 */
public interface YPSH extends GroupY {
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
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYPSH_OpTmh()
	 * @model required="true"
	 * @generated
	 */
	INS getOpTmh();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YPSH#getOpTmh <em>Op Tmh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Tmh</em>' reference.
	 * @see #getOpTmh()
	 * @generated
	 */
	void setOpTmh(INS value);

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
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYPSH_Pos()
	 * @model required="true"
	 * @generated
	 */
	DPC getPos();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YPSH#getPos <em>Pos</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYPSH_BlkOpn()
	 * @model required="true"
	 * @generated
	 */
	SPC getBlkOpn();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YPSH#getBlkOpn <em>Blk Opn</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYPSH_BlkCls()
	 * @model required="true"
	 * @generated
	 */
	SPC getBlkCls();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YPSH#getBlkCls <em>Blk Cls</em>}' reference.
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
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYPSH_ChaMotEna()
	 * @model required="true"
	 * @generated
	 */
	SPC getChaMotEna();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YPSH#getChaMotEna <em>Cha Mot Ena</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cha Mot Ena</em>' reference.
	 * @see #getChaMotEna()
	 * @generated
	 */
	void setChaMotEna(SPC value);

	/**
	 * Returns the value of the '<em><b>Sh Op Cap</b></em>' attribute.
	 * The literals are from the enumeration {@link substationStandard.Enumerations.SwitchingCapabilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sh Op Cap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sh Op Cap</em>' attribute.
	 * @see substationStandard.Enumerations.SwitchingCapabilityKind
	 * @see #setShOpCap(SwitchingCapabilityKind)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYPSH_ShOpCap()
	 * @model
	 * @generated
	 */
	SwitchingCapabilityKind getShOpCap();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YPSH#getShOpCap <em>Sh Op Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sh Op Cap</em>' attribute.
	 * @see substationStandard.Enumerations.SwitchingCapabilityKind
	 * @see #getShOpCap()
	 * @generated
	 */
	void setShOpCap(SwitchingCapabilityKind value);

	/**
	 * Returns the value of the '<em><b>Max Op Cap</b></em>' attribute.
	 * The literals are from the enumeration {@link substationStandard.Enumerations.SwitchingCapabilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Op Cap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Op Cap</em>' attribute.
	 * @see substationStandard.Enumerations.SwitchingCapabilityKind
	 * @see #setMaxOpCap(SwitchingCapabilityKind)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYPSH_MaxOpCap()
	 * @model
	 * @generated
	 */
	SwitchingCapabilityKind getMaxOpCap();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YPSH#getMaxOpCap <em>Max Op Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Op Cap</em>' attribute.
	 * @see substationStandard.Enumerations.SwitchingCapabilityKind
	 * @see #getMaxOpCap()
	 * @generated
	 */
	void setMaxOpCap(SwitchingCapabilityKind value);

} // YPSH
