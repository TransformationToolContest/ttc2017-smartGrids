/**
 */
package substationStandard.LNNodes.LNGroupY;

import substationStandard.Dataclasses.APC;
import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.ISC;
import substationStandard.Dataclasses.MV;
import substationStandard.Dataclasses.SPS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YEFN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YEFN#getLoc <em>Loc</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YEFN#getOpTmh <em>Op Tmh</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YEFN#getECA <em>ECA</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YEFN#getColTapPos <em>Col Tap Pos</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.YEFN#getColPos <em>Col Pos</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYEFN()
 * @model
 * @generated
 */
public interface YEFN extends GroupY {
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
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYEFN_Loc()
	 * @model required="true"
	 * @generated
	 */
	SPS getLoc();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YEFN#getLoc <em>Loc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc</em>' reference.
	 * @see #getLoc()
	 * @generated
	 */
	void setLoc(SPS value);

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
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYEFN_OpTmh()
	 * @model required="true"
	 * @generated
	 */
	INS getOpTmh();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YEFN#getOpTmh <em>Op Tmh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Tmh</em>' reference.
	 * @see #getOpTmh()
	 * @generated
	 */
	void setOpTmh(INS value);

	/**
	 * Returns the value of the '<em><b>ECA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ECA</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ECA</em>' reference.
	 * @see #setECA(MV)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYEFN_ECA()
	 * @model required="true"
	 * @generated
	 */
	MV getECA();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YEFN#getECA <em>ECA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ECA</em>' reference.
	 * @see #getECA()
	 * @generated
	 */
	void setECA(MV value);

	/**
	 * Returns the value of the '<em><b>Col Tap Pos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col Tap Pos</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Tap Pos</em>' reference.
	 * @see #setColTapPos(ISC)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYEFN_ColTapPos()
	 * @model required="true"
	 * @generated
	 */
	ISC getColTapPos();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YEFN#getColTapPos <em>Col Tap Pos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Tap Pos</em>' reference.
	 * @see #getColTapPos()
	 * @generated
	 */
	void setColTapPos(ISC value);

	/**
	 * Returns the value of the '<em><b>Col Pos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col Pos</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Pos</em>' reference.
	 * @see #setColPos(APC)
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#getYEFN_ColPos()
	 * @model required="true"
	 * @generated
	 */
	APC getColPos();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupY.YEFN#getColPos <em>Col Pos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Pos</em>' reference.
	 * @see #getColPos()
	 * @generated
	 */
	void setColPos(APC value);

} // YEFN
