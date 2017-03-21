/**
 */
package substationStandard.LNNodes.LNGroupA;

import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.BSC;
import substationStandard.Dataclasses.DPC;
import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.ISC;
import substationStandard.Dataclasses.MV;
import substationStandard.Dataclasses.SPC;
import substationStandard.Dataclasses.SPG;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ATCC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getTapChg <em>Tap Chg</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getTapPos <em>Tap Pos</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getParOp <em>Par Op</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getLTCBlk <em>LTC Blk</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getLTCDragRs <em>LTC Drag Rs</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getVRed1 <em>VRed1</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getVRed2 <em>VRed2</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getCtlV <em>Ctl V</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getLodA <em>Lod A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getCircA <em>Circ A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getPhAng <em>Ph Ang</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getHiCtlV <em>Hi Ctl V</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getLoCtlV <em>Lo Ctl V</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getHiDmdA <em>Hi Dmd A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getHiTapPos <em>Hi Tap Pos</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getLoTapPos <em>Lo Tap Pos</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getBndCtr <em>Bnd Ctr</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getBndWid <em>Bnd Wid</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getCtlDlTmms <em>Ctl Dl Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getLDCR <em>LDCR</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getLDCX <em>LDCX</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getBlkLV <em>Blk LV</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getBlkRV <em>Blk RV</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getRnbkRV <em>Rnbk RV</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getLimLodA <em>Lim Lod A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getLDC <em>LDC</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getTmDlChr <em>Tm Dl Chr</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getLDCZ <em>LDCZ</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getVRedVal <em>VRed Val</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getTapBlkR <em>Tap Blk R</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.ATCC#getTapBlkL <em>Tap Blk L</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC()
 * @model
 * @generated
 */
public interface ATCC extends GroupA {
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
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_TapChg()
	 * @model required="true"
	 * @generated
	 */
	BSC getTapChg();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getTapChg <em>Tap Chg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tap Chg</em>' reference.
	 * @see #getTapChg()
	 * @generated
	 */
	void setTapChg(BSC value);

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
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_TapPos()
	 * @model required="true"
	 * @generated
	 */
	ISC getTapPos();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getTapPos <em>Tap Pos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tap Pos</em>' reference.
	 * @see #getTapPos()
	 * @generated
	 */
	void setTapPos(ISC value);

	/**
	 * Returns the value of the '<em><b>Par Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Par Op</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Par Op</em>' reference.
	 * @see #setParOp(DPC)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_ParOp()
	 * @model required="true"
	 * @generated
	 */
	DPC getParOp();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getParOp <em>Par Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Par Op</em>' reference.
	 * @see #getParOp()
	 * @generated
	 */
	void setParOp(DPC value);

	/**
	 * Returns the value of the '<em><b>LTC Blk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LTC Blk</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LTC Blk</em>' reference.
	 * @see #setLTCBlk(SPC)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_LTCBlk()
	 * @model required="true"
	 * @generated
	 */
	SPC getLTCBlk();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getLTCBlk <em>LTC Blk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LTC Blk</em>' reference.
	 * @see #getLTCBlk()
	 * @generated
	 */
	void setLTCBlk(SPC value);

	/**
	 * Returns the value of the '<em><b>LTC Drag Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LTC Drag Rs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LTC Drag Rs</em>' reference.
	 * @see #setLTCDragRs(SPC)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_LTCDragRs()
	 * @model required="true"
	 * @generated
	 */
	SPC getLTCDragRs();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getLTCDragRs <em>LTC Drag Rs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LTC Drag Rs</em>' reference.
	 * @see #getLTCDragRs()
	 * @generated
	 */
	void setLTCDragRs(SPC value);

	/**
	 * Returns the value of the '<em><b>VRed1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VRed1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VRed1</em>' reference.
	 * @see #setVRed1(SPC)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_VRed1()
	 * @model required="true"
	 * @generated
	 */
	SPC getVRed1();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getVRed1 <em>VRed1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VRed1</em>' reference.
	 * @see #getVRed1()
	 * @generated
	 */
	void setVRed1(SPC value);

	/**
	 * Returns the value of the '<em><b>VRed2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VRed2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VRed2</em>' reference.
	 * @see #setVRed2(SPC)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_VRed2()
	 * @model required="true"
	 * @generated
	 */
	SPC getVRed2();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getVRed2 <em>VRed2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VRed2</em>' reference.
	 * @see #getVRed2()
	 * @generated
	 */
	void setVRed2(SPC value);

	/**
	 * Returns the value of the '<em><b>Ctl V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ctl V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctl V</em>' reference.
	 * @see #setCtlV(MV)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_CtlV()
	 * @model required="true"
	 * @generated
	 */
	MV getCtlV();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getCtlV <em>Ctl V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctl V</em>' reference.
	 * @see #getCtlV()
	 * @generated
	 */
	void setCtlV(MV value);

	/**
	 * Returns the value of the '<em><b>Lod A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod A</em>' reference.
	 * @see #setLodA(MV)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_LodA()
	 * @model required="true"
	 * @generated
	 */
	MV getLodA();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getLodA <em>Lod A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod A</em>' reference.
	 * @see #getLodA()
	 * @generated
	 */
	void setLodA(MV value);

	/**
	 * Returns the value of the '<em><b>Circ A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circ A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circ A</em>' reference.
	 * @see #setCircA(MV)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_CircA()
	 * @model required="true"
	 * @generated
	 */
	MV getCircA();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getCircA <em>Circ A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circ A</em>' reference.
	 * @see #getCircA()
	 * @generated
	 */
	void setCircA(MV value);

	/**
	 * Returns the value of the '<em><b>Ph Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ph Ang</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ph Ang</em>' reference.
	 * @see #setPhAng(MV)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_PhAng()
	 * @model required="true"
	 * @generated
	 */
	MV getPhAng();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getPhAng <em>Ph Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ph Ang</em>' reference.
	 * @see #getPhAng()
	 * @generated
	 */
	void setPhAng(MV value);

	/**
	 * Returns the value of the '<em><b>Hi Ctl V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hi Ctl V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hi Ctl V</em>' reference.
	 * @see #setHiCtlV(MV)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_HiCtlV()
	 * @model required="true"
	 * @generated
	 */
	MV getHiCtlV();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getHiCtlV <em>Hi Ctl V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hi Ctl V</em>' reference.
	 * @see #getHiCtlV()
	 * @generated
	 */
	void setHiCtlV(MV value);

	/**
	 * Returns the value of the '<em><b>Lo Ctl V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lo Ctl V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lo Ctl V</em>' reference.
	 * @see #setLoCtlV(MV)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_LoCtlV()
	 * @model required="true"
	 * @generated
	 */
	MV getLoCtlV();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getLoCtlV <em>Lo Ctl V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lo Ctl V</em>' reference.
	 * @see #getLoCtlV()
	 * @generated
	 */
	void setLoCtlV(MV value);

	/**
	 * Returns the value of the '<em><b>Hi Dmd A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hi Dmd A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hi Dmd A</em>' reference.
	 * @see #setHiDmdA(MV)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_HiDmdA()
	 * @model required="true"
	 * @generated
	 */
	MV getHiDmdA();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getHiDmdA <em>Hi Dmd A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hi Dmd A</em>' reference.
	 * @see #getHiDmdA()
	 * @generated
	 */
	void setHiDmdA(MV value);

	/**
	 * Returns the value of the '<em><b>Hi Tap Pos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hi Tap Pos</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hi Tap Pos</em>' reference.
	 * @see #setHiTapPos(INS)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_HiTapPos()
	 * @model required="true"
	 * @generated
	 */
	INS getHiTapPos();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getHiTapPos <em>Hi Tap Pos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hi Tap Pos</em>' reference.
	 * @see #getHiTapPos()
	 * @generated
	 */
	void setHiTapPos(INS value);

	/**
	 * Returns the value of the '<em><b>Lo Tap Pos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lo Tap Pos</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lo Tap Pos</em>' reference.
	 * @see #setLoTapPos(INS)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_LoTapPos()
	 * @model required="true"
	 * @generated
	 */
	INS getLoTapPos();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getLoTapPos <em>Lo Tap Pos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lo Tap Pos</em>' reference.
	 * @see #getLoTapPos()
	 * @generated
	 */
	void setLoTapPos(INS value);

	/**
	 * Returns the value of the '<em><b>Bnd Ctr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bnd Ctr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bnd Ctr</em>' reference.
	 * @see #setBndCtr(ASG)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_BndCtr()
	 * @model required="true"
	 * @generated
	 */
	ASG getBndCtr();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getBndCtr <em>Bnd Ctr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bnd Ctr</em>' reference.
	 * @see #getBndCtr()
	 * @generated
	 */
	void setBndCtr(ASG value);

	/**
	 * Returns the value of the '<em><b>Bnd Wid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bnd Wid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bnd Wid</em>' reference.
	 * @see #setBndWid(ASG)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_BndWid()
	 * @model required="true"
	 * @generated
	 */
	ASG getBndWid();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getBndWid <em>Bnd Wid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bnd Wid</em>' reference.
	 * @see #getBndWid()
	 * @generated
	 */
	void setBndWid(ASG value);

	/**
	 * Returns the value of the '<em><b>Ctl Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ctl Dl Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctl Dl Tmms</em>' reference.
	 * @see #setCtlDlTmms(ASG)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_CtlDlTmms()
	 * @model required="true"
	 * @generated
	 */
	ASG getCtlDlTmms();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getCtlDlTmms <em>Ctl Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctl Dl Tmms</em>' reference.
	 * @see #getCtlDlTmms()
	 * @generated
	 */
	void setCtlDlTmms(ASG value);

	/**
	 * Returns the value of the '<em><b>LDCR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LDCR</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LDCR</em>' reference.
	 * @see #setLDCR(ASG)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_LDCR()
	 * @model required="true"
	 * @generated
	 */
	ASG getLDCR();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getLDCR <em>LDCR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LDCR</em>' reference.
	 * @see #getLDCR()
	 * @generated
	 */
	void setLDCR(ASG value);

	/**
	 * Returns the value of the '<em><b>LDCX</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LDCX</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LDCX</em>' reference.
	 * @see #setLDCX(ASG)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_LDCX()
	 * @model required="true"
	 * @generated
	 */
	ASG getLDCX();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getLDCX <em>LDCX</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LDCX</em>' reference.
	 * @see #getLDCX()
	 * @generated
	 */
	void setLDCX(ASG value);

	/**
	 * Returns the value of the '<em><b>Blk LV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blk LV</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blk LV</em>' reference.
	 * @see #setBlkLV(ASG)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_BlkLV()
	 * @model required="true"
	 * @generated
	 */
	ASG getBlkLV();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getBlkLV <em>Blk LV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blk LV</em>' reference.
	 * @see #getBlkLV()
	 * @generated
	 */
	void setBlkLV(ASG value);

	/**
	 * Returns the value of the '<em><b>Blk RV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blk RV</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blk RV</em>' reference.
	 * @see #setBlkRV(ASG)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_BlkRV()
	 * @model required="true"
	 * @generated
	 */
	ASG getBlkRV();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getBlkRV <em>Blk RV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blk RV</em>' reference.
	 * @see #getBlkRV()
	 * @generated
	 */
	void setBlkRV(ASG value);

	/**
	 * Returns the value of the '<em><b>Rnbk RV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rnbk RV</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rnbk RV</em>' reference.
	 * @see #setRnbkRV(ASG)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_RnbkRV()
	 * @model required="true"
	 * @generated
	 */
	ASG getRnbkRV();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getRnbkRV <em>Rnbk RV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rnbk RV</em>' reference.
	 * @see #getRnbkRV()
	 * @generated
	 */
	void setRnbkRV(ASG value);

	/**
	 * Returns the value of the '<em><b>Lim Lod A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lim Lod A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lim Lod A</em>' reference.
	 * @see #setLimLodA(ASG)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_LimLodA()
	 * @model required="true"
	 * @generated
	 */
	ASG getLimLodA();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getLimLodA <em>Lim Lod A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lim Lod A</em>' reference.
	 * @see #getLimLodA()
	 * @generated
	 */
	void setLimLodA(ASG value);

	/**
	 * Returns the value of the '<em><b>LDC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LDC</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LDC</em>' reference.
	 * @see #setLDC(SPG)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_LDC()
	 * @model required="true"
	 * @generated
	 */
	SPG getLDC();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getLDC <em>LDC</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LDC</em>' reference.
	 * @see #getLDC()
	 * @generated
	 */
	void setLDC(SPG value);

	/**
	 * Returns the value of the '<em><b>Tm Dl Chr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tm Dl Chr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tm Dl Chr</em>' reference.
	 * @see #setTmDlChr(SPG)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_TmDlChr()
	 * @model required="true"
	 * @generated
	 */
	SPG getTmDlChr();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getTmDlChr <em>Tm Dl Chr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tm Dl Chr</em>' reference.
	 * @see #getTmDlChr()
	 * @generated
	 */
	void setTmDlChr(SPG value);

	/**
	 * Returns the value of the '<em><b>LDCZ</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LDCZ</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LDCZ</em>' reference.
	 * @see #setLDCZ(ASG)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_LDCZ()
	 * @model required="true"
	 * @generated
	 */
	ASG getLDCZ();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getLDCZ <em>LDCZ</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LDCZ</em>' reference.
	 * @see #getLDCZ()
	 * @generated
	 */
	void setLDCZ(ASG value);

	/**
	 * Returns the value of the '<em><b>VRed Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VRed Val</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VRed Val</em>' reference.
	 * @see #setVRedVal(ASG)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_VRedVal()
	 * @model required="true"
	 * @generated
	 */
	ASG getVRedVal();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getVRedVal <em>VRed Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VRed Val</em>' reference.
	 * @see #getVRedVal()
	 * @generated
	 */
	void setVRedVal(ASG value);

	/**
	 * Returns the value of the '<em><b>Tap Blk R</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tap Blk R</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tap Blk R</em>' reference.
	 * @see #setTapBlkR(ASG)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_TapBlkR()
	 * @model required="true"
	 * @generated
	 */
	ASG getTapBlkR();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getTapBlkR <em>Tap Blk R</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tap Blk R</em>' reference.
	 * @see #getTapBlkR()
	 * @generated
	 */
	void setTapBlkR(ASG value);

	/**
	 * Returns the value of the '<em><b>Tap Blk L</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tap Blk L</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tap Blk L</em>' reference.
	 * @see #setTapBlkL(ASG)
	 * @see substationStandard.LNNodes.LNGroupA.LNGroupAPackage#getATCC_TapBlkL()
	 * @model required="true"
	 * @generated
	 */
	ASG getTapBlkL();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupA.ATCC#getTapBlkL <em>Tap Blk L</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tap Blk L</em>' reference.
	 * @see #getTapBlkL()
	 * @generated
	 */
	void setTapBlkL(ASG value);

} // ATCC
