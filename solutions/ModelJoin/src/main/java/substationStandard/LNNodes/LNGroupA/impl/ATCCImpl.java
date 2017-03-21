/**
 */
package substationStandard.LNNodes.LNGroupA.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.BSC;
import substationStandard.Dataclasses.DPC;
import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.ISC;
import substationStandard.Dataclasses.MV;
import substationStandard.Dataclasses.SPC;
import substationStandard.Dataclasses.SPG;

import substationStandard.LNNodes.LNGroupA.ATCC;
import substationStandard.LNNodes.LNGroupA.LNGroupAPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATCC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getTapChg <em>Tap Chg</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getTapPos <em>Tap Pos</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getParOp <em>Par Op</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getLTCBlk <em>LTC Blk</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getLTCDragRs <em>LTC Drag Rs</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getVRed1 <em>VRed1</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getVRed2 <em>VRed2</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getCtlV <em>Ctl V</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getLodA <em>Lod A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getCircA <em>Circ A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getPhAng <em>Ph Ang</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getHiCtlV <em>Hi Ctl V</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getLoCtlV <em>Lo Ctl V</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getHiDmdA <em>Hi Dmd A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getHiTapPos <em>Hi Tap Pos</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getLoTapPos <em>Lo Tap Pos</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getBndCtr <em>Bnd Ctr</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getBndWid <em>Bnd Wid</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getCtlDlTmms <em>Ctl Dl Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getLDCR <em>LDCR</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getLDCX <em>LDCX</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getBlkLV <em>Blk LV</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getBlkRV <em>Blk RV</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getRnbkRV <em>Rnbk RV</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getLimLodA <em>Lim Lod A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getLDC <em>LDC</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getTmDlChr <em>Tm Dl Chr</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getLDCZ <em>LDCZ</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getVRedVal <em>VRed Val</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getTapBlkR <em>Tap Blk R</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ATCCImpl#getTapBlkL <em>Tap Blk L</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ATCCImpl extends GroupAImpl implements ATCC {
	/**
	 * The cached value of the '{@link #getTapChg() <em>Tap Chg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapChg()
	 * @generated
	 * @ordered
	 */
	protected BSC tapChg;

	/**
	 * The cached value of the '{@link #getTapPos() <em>Tap Pos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapPos()
	 * @generated
	 * @ordered
	 */
	protected ISC tapPos;

	/**
	 * The cached value of the '{@link #getParOp() <em>Par Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParOp()
	 * @generated
	 * @ordered
	 */
	protected DPC parOp;

	/**
	 * The cached value of the '{@link #getLTCBlk() <em>LTC Blk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLTCBlk()
	 * @generated
	 * @ordered
	 */
	protected SPC ltcBlk;

	/**
	 * The cached value of the '{@link #getLTCDragRs() <em>LTC Drag Rs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLTCDragRs()
	 * @generated
	 * @ordered
	 */
	protected SPC ltcDragRs;

	/**
	 * The cached value of the '{@link #getVRed1() <em>VRed1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVRed1()
	 * @generated
	 * @ordered
	 */
	protected SPC vRed1;

	/**
	 * The cached value of the '{@link #getVRed2() <em>VRed2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVRed2()
	 * @generated
	 * @ordered
	 */
	protected SPC vRed2;

	/**
	 * The cached value of the '{@link #getCtlV() <em>Ctl V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtlV()
	 * @generated
	 * @ordered
	 */
	protected MV ctlV;

	/**
	 * The cached value of the '{@link #getLodA() <em>Lod A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLodA()
	 * @generated
	 * @ordered
	 */
	protected MV lodA;

	/**
	 * The cached value of the '{@link #getCircA() <em>Circ A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircA()
	 * @generated
	 * @ordered
	 */
	protected MV circA;

	/**
	 * The cached value of the '{@link #getPhAng() <em>Ph Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhAng()
	 * @generated
	 * @ordered
	 */
	protected MV phAng;

	/**
	 * The cached value of the '{@link #getHiCtlV() <em>Hi Ctl V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiCtlV()
	 * @generated
	 * @ordered
	 */
	protected MV hiCtlV;

	/**
	 * The cached value of the '{@link #getLoCtlV() <em>Lo Ctl V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoCtlV()
	 * @generated
	 * @ordered
	 */
	protected MV loCtlV;

	/**
	 * The cached value of the '{@link #getHiDmdA() <em>Hi Dmd A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiDmdA()
	 * @generated
	 * @ordered
	 */
	protected MV hiDmdA;

	/**
	 * The cached value of the '{@link #getHiTapPos() <em>Hi Tap Pos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiTapPos()
	 * @generated
	 * @ordered
	 */
	protected INS hiTapPos;

	/**
	 * The cached value of the '{@link #getLoTapPos() <em>Lo Tap Pos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoTapPos()
	 * @generated
	 * @ordered
	 */
	protected INS loTapPos;

	/**
	 * The cached value of the '{@link #getBndCtr() <em>Bnd Ctr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBndCtr()
	 * @generated
	 * @ordered
	 */
	protected ASG bndCtr;

	/**
	 * The cached value of the '{@link #getBndWid() <em>Bnd Wid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBndWid()
	 * @generated
	 * @ordered
	 */
	protected ASG bndWid;

	/**
	 * The cached value of the '{@link #getCtlDlTmms() <em>Ctl Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtlDlTmms()
	 * @generated
	 * @ordered
	 */
	protected ASG ctlDlTmms;

	/**
	 * The cached value of the '{@link #getLDCR() <em>LDCR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLDCR()
	 * @generated
	 * @ordered
	 */
	protected ASG ldcr;

	/**
	 * The cached value of the '{@link #getLDCX() <em>LDCX</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLDCX()
	 * @generated
	 * @ordered
	 */
	protected ASG ldcx;

	/**
	 * The cached value of the '{@link #getBlkLV() <em>Blk LV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlkLV()
	 * @generated
	 * @ordered
	 */
	protected ASG blkLV;

	/**
	 * The cached value of the '{@link #getBlkRV() <em>Blk RV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlkRV()
	 * @generated
	 * @ordered
	 */
	protected ASG blkRV;

	/**
	 * The cached value of the '{@link #getRnbkRV() <em>Rnbk RV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRnbkRV()
	 * @generated
	 * @ordered
	 */
	protected ASG rnbkRV;

	/**
	 * The cached value of the '{@link #getLimLodA() <em>Lim Lod A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimLodA()
	 * @generated
	 * @ordered
	 */
	protected ASG limLodA;

	/**
	 * The cached value of the '{@link #getLDC() <em>LDC</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLDC()
	 * @generated
	 * @ordered
	 */
	protected SPG ldc;

	/**
	 * The cached value of the '{@link #getTmDlChr() <em>Tm Dl Chr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmDlChr()
	 * @generated
	 * @ordered
	 */
	protected SPG tmDlChr;

	/**
	 * The cached value of the '{@link #getLDCZ() <em>LDCZ</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLDCZ()
	 * @generated
	 * @ordered
	 */
	protected ASG ldcz;

	/**
	 * The cached value of the '{@link #getVRedVal() <em>VRed Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVRedVal()
	 * @generated
	 * @ordered
	 */
	protected ASG vRedVal;

	/**
	 * The cached value of the '{@link #getTapBlkR() <em>Tap Blk R</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapBlkR()
	 * @generated
	 * @ordered
	 */
	protected ASG tapBlkR;

	/**
	 * The cached value of the '{@link #getTapBlkL() <em>Tap Blk L</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapBlkL()
	 * @generated
	 * @ordered
	 */
	protected ASG tapBlkL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATCCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupAPackage.Literals.ATCC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSC getTapChg() {
		if (tapChg != null && tapChg.eIsProxy()) {
			InternalEObject oldTapChg = (InternalEObject)tapChg;
			tapChg = (BSC)eResolveProxy(oldTapChg);
			if (tapChg != oldTapChg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__TAP_CHG, oldTapChg, tapChg));
			}
		}
		return tapChg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSC basicGetTapChg() {
		return tapChg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTapChg(BSC newTapChg) {
		BSC oldTapChg = tapChg;
		tapChg = newTapChg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__TAP_CHG, oldTapChg, tapChg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISC getTapPos() {
		if (tapPos != null && tapPos.eIsProxy()) {
			InternalEObject oldTapPos = (InternalEObject)tapPos;
			tapPos = (ISC)eResolveProxy(oldTapPos);
			if (tapPos != oldTapPos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__TAP_POS, oldTapPos, tapPos));
			}
		}
		return tapPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISC basicGetTapPos() {
		return tapPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTapPos(ISC newTapPos) {
		ISC oldTapPos = tapPos;
		tapPos = newTapPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__TAP_POS, oldTapPos, tapPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPC getParOp() {
		if (parOp != null && parOp.eIsProxy()) {
			InternalEObject oldParOp = (InternalEObject)parOp;
			parOp = (DPC)eResolveProxy(oldParOp);
			if (parOp != oldParOp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__PAR_OP, oldParOp, parOp));
			}
		}
		return parOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPC basicGetParOp() {
		return parOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParOp(DPC newParOp) {
		DPC oldParOp = parOp;
		parOp = newParOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__PAR_OP, oldParOp, parOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getLTCBlk() {
		if (ltcBlk != null && ltcBlk.eIsProxy()) {
			InternalEObject oldLTCBlk = (InternalEObject)ltcBlk;
			ltcBlk = (SPC)eResolveProxy(oldLTCBlk);
			if (ltcBlk != oldLTCBlk) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__LTC_BLK, oldLTCBlk, ltcBlk));
			}
		}
		return ltcBlk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetLTCBlk() {
		return ltcBlk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLTCBlk(SPC newLTCBlk) {
		SPC oldLTCBlk = ltcBlk;
		ltcBlk = newLTCBlk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__LTC_BLK, oldLTCBlk, ltcBlk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getLTCDragRs() {
		if (ltcDragRs != null && ltcDragRs.eIsProxy()) {
			InternalEObject oldLTCDragRs = (InternalEObject)ltcDragRs;
			ltcDragRs = (SPC)eResolveProxy(oldLTCDragRs);
			if (ltcDragRs != oldLTCDragRs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__LTC_DRAG_RS, oldLTCDragRs, ltcDragRs));
			}
		}
		return ltcDragRs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetLTCDragRs() {
		return ltcDragRs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLTCDragRs(SPC newLTCDragRs) {
		SPC oldLTCDragRs = ltcDragRs;
		ltcDragRs = newLTCDragRs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__LTC_DRAG_RS, oldLTCDragRs, ltcDragRs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getVRed1() {
		if (vRed1 != null && vRed1.eIsProxy()) {
			InternalEObject oldVRed1 = (InternalEObject)vRed1;
			vRed1 = (SPC)eResolveProxy(oldVRed1);
			if (vRed1 != oldVRed1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__VRED1, oldVRed1, vRed1));
			}
		}
		return vRed1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetVRed1() {
		return vRed1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVRed1(SPC newVRed1) {
		SPC oldVRed1 = vRed1;
		vRed1 = newVRed1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__VRED1, oldVRed1, vRed1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getVRed2() {
		if (vRed2 != null && vRed2.eIsProxy()) {
			InternalEObject oldVRed2 = (InternalEObject)vRed2;
			vRed2 = (SPC)eResolveProxy(oldVRed2);
			if (vRed2 != oldVRed2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__VRED2, oldVRed2, vRed2));
			}
		}
		return vRed2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetVRed2() {
		return vRed2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVRed2(SPC newVRed2) {
		SPC oldVRed2 = vRed2;
		vRed2 = newVRed2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__VRED2, oldVRed2, vRed2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getCtlV() {
		if (ctlV != null && ctlV.eIsProxy()) {
			InternalEObject oldCtlV = (InternalEObject)ctlV;
			ctlV = (MV)eResolveProxy(oldCtlV);
			if (ctlV != oldCtlV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__CTL_V, oldCtlV, ctlV));
			}
		}
		return ctlV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetCtlV() {
		return ctlV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCtlV(MV newCtlV) {
		MV oldCtlV = ctlV;
		ctlV = newCtlV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__CTL_V, oldCtlV, ctlV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getLodA() {
		if (lodA != null && lodA.eIsProxy()) {
			InternalEObject oldLodA = (InternalEObject)lodA;
			lodA = (MV)eResolveProxy(oldLodA);
			if (lodA != oldLodA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__LOD_A, oldLodA, lodA));
			}
		}
		return lodA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetLodA() {
		return lodA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLodA(MV newLodA) {
		MV oldLodA = lodA;
		lodA = newLodA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__LOD_A, oldLodA, lodA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getCircA() {
		if (circA != null && circA.eIsProxy()) {
			InternalEObject oldCircA = (InternalEObject)circA;
			circA = (MV)eResolveProxy(oldCircA);
			if (circA != oldCircA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__CIRC_A, oldCircA, circA));
			}
		}
		return circA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetCircA() {
		return circA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircA(MV newCircA) {
		MV oldCircA = circA;
		circA = newCircA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__CIRC_A, oldCircA, circA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getPhAng() {
		if (phAng != null && phAng.eIsProxy()) {
			InternalEObject oldPhAng = (InternalEObject)phAng;
			phAng = (MV)eResolveProxy(oldPhAng);
			if (phAng != oldPhAng) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__PH_ANG, oldPhAng, phAng));
			}
		}
		return phAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetPhAng() {
		return phAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhAng(MV newPhAng) {
		MV oldPhAng = phAng;
		phAng = newPhAng;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__PH_ANG, oldPhAng, phAng));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getHiCtlV() {
		if (hiCtlV != null && hiCtlV.eIsProxy()) {
			InternalEObject oldHiCtlV = (InternalEObject)hiCtlV;
			hiCtlV = (MV)eResolveProxy(oldHiCtlV);
			if (hiCtlV != oldHiCtlV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__HI_CTL_V, oldHiCtlV, hiCtlV));
			}
		}
		return hiCtlV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetHiCtlV() {
		return hiCtlV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHiCtlV(MV newHiCtlV) {
		MV oldHiCtlV = hiCtlV;
		hiCtlV = newHiCtlV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__HI_CTL_V, oldHiCtlV, hiCtlV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getLoCtlV() {
		if (loCtlV != null && loCtlV.eIsProxy()) {
			InternalEObject oldLoCtlV = (InternalEObject)loCtlV;
			loCtlV = (MV)eResolveProxy(oldLoCtlV);
			if (loCtlV != oldLoCtlV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__LO_CTL_V, oldLoCtlV, loCtlV));
			}
		}
		return loCtlV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetLoCtlV() {
		return loCtlV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoCtlV(MV newLoCtlV) {
		MV oldLoCtlV = loCtlV;
		loCtlV = newLoCtlV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__LO_CTL_V, oldLoCtlV, loCtlV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getHiDmdA() {
		if (hiDmdA != null && hiDmdA.eIsProxy()) {
			InternalEObject oldHiDmdA = (InternalEObject)hiDmdA;
			hiDmdA = (MV)eResolveProxy(oldHiDmdA);
			if (hiDmdA != oldHiDmdA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__HI_DMD_A, oldHiDmdA, hiDmdA));
			}
		}
		return hiDmdA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetHiDmdA() {
		return hiDmdA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHiDmdA(MV newHiDmdA) {
		MV oldHiDmdA = hiDmdA;
		hiDmdA = newHiDmdA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__HI_DMD_A, oldHiDmdA, hiDmdA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS getHiTapPos() {
		if (hiTapPos != null && hiTapPos.eIsProxy()) {
			InternalEObject oldHiTapPos = (InternalEObject)hiTapPos;
			hiTapPos = (INS)eResolveProxy(oldHiTapPos);
			if (hiTapPos != oldHiTapPos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__HI_TAP_POS, oldHiTapPos, hiTapPos));
			}
		}
		return hiTapPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS basicGetHiTapPos() {
		return hiTapPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHiTapPos(INS newHiTapPos) {
		INS oldHiTapPos = hiTapPos;
		hiTapPos = newHiTapPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__HI_TAP_POS, oldHiTapPos, hiTapPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS getLoTapPos() {
		if (loTapPos != null && loTapPos.eIsProxy()) {
			InternalEObject oldLoTapPos = (InternalEObject)loTapPos;
			loTapPos = (INS)eResolveProxy(oldLoTapPos);
			if (loTapPos != oldLoTapPos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__LO_TAP_POS, oldLoTapPos, loTapPos));
			}
		}
		return loTapPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS basicGetLoTapPos() {
		return loTapPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoTapPos(INS newLoTapPos) {
		INS oldLoTapPos = loTapPos;
		loTapPos = newLoTapPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__LO_TAP_POS, oldLoTapPos, loTapPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getBndCtr() {
		if (bndCtr != null && bndCtr.eIsProxy()) {
			InternalEObject oldBndCtr = (InternalEObject)bndCtr;
			bndCtr = (ASG)eResolveProxy(oldBndCtr);
			if (bndCtr != oldBndCtr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__BND_CTR, oldBndCtr, bndCtr));
			}
		}
		return bndCtr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetBndCtr() {
		return bndCtr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBndCtr(ASG newBndCtr) {
		ASG oldBndCtr = bndCtr;
		bndCtr = newBndCtr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__BND_CTR, oldBndCtr, bndCtr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getBndWid() {
		if (bndWid != null && bndWid.eIsProxy()) {
			InternalEObject oldBndWid = (InternalEObject)bndWid;
			bndWid = (ASG)eResolveProxy(oldBndWid);
			if (bndWid != oldBndWid) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__BND_WID, oldBndWid, bndWid));
			}
		}
		return bndWid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetBndWid() {
		return bndWid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBndWid(ASG newBndWid) {
		ASG oldBndWid = bndWid;
		bndWid = newBndWid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__BND_WID, oldBndWid, bndWid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getCtlDlTmms() {
		if (ctlDlTmms != null && ctlDlTmms.eIsProxy()) {
			InternalEObject oldCtlDlTmms = (InternalEObject)ctlDlTmms;
			ctlDlTmms = (ASG)eResolveProxy(oldCtlDlTmms);
			if (ctlDlTmms != oldCtlDlTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__CTL_DL_TMMS, oldCtlDlTmms, ctlDlTmms));
			}
		}
		return ctlDlTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetCtlDlTmms() {
		return ctlDlTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCtlDlTmms(ASG newCtlDlTmms) {
		ASG oldCtlDlTmms = ctlDlTmms;
		ctlDlTmms = newCtlDlTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__CTL_DL_TMMS, oldCtlDlTmms, ctlDlTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getLDCR() {
		if (ldcr != null && ldcr.eIsProxy()) {
			InternalEObject oldLDCR = (InternalEObject)ldcr;
			ldcr = (ASG)eResolveProxy(oldLDCR);
			if (ldcr != oldLDCR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__LDCR, oldLDCR, ldcr));
			}
		}
		return ldcr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetLDCR() {
		return ldcr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLDCR(ASG newLDCR) {
		ASG oldLDCR = ldcr;
		ldcr = newLDCR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__LDCR, oldLDCR, ldcr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getLDCX() {
		if (ldcx != null && ldcx.eIsProxy()) {
			InternalEObject oldLDCX = (InternalEObject)ldcx;
			ldcx = (ASG)eResolveProxy(oldLDCX);
			if (ldcx != oldLDCX) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__LDCX, oldLDCX, ldcx));
			}
		}
		return ldcx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetLDCX() {
		return ldcx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLDCX(ASG newLDCX) {
		ASG oldLDCX = ldcx;
		ldcx = newLDCX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__LDCX, oldLDCX, ldcx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getBlkLV() {
		if (blkLV != null && blkLV.eIsProxy()) {
			InternalEObject oldBlkLV = (InternalEObject)blkLV;
			blkLV = (ASG)eResolveProxy(oldBlkLV);
			if (blkLV != oldBlkLV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__BLK_LV, oldBlkLV, blkLV));
			}
		}
		return blkLV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetBlkLV() {
		return blkLV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlkLV(ASG newBlkLV) {
		ASG oldBlkLV = blkLV;
		blkLV = newBlkLV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__BLK_LV, oldBlkLV, blkLV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getBlkRV() {
		if (blkRV != null && blkRV.eIsProxy()) {
			InternalEObject oldBlkRV = (InternalEObject)blkRV;
			blkRV = (ASG)eResolveProxy(oldBlkRV);
			if (blkRV != oldBlkRV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__BLK_RV, oldBlkRV, blkRV));
			}
		}
		return blkRV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetBlkRV() {
		return blkRV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlkRV(ASG newBlkRV) {
		ASG oldBlkRV = blkRV;
		blkRV = newBlkRV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__BLK_RV, oldBlkRV, blkRV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getRnbkRV() {
		if (rnbkRV != null && rnbkRV.eIsProxy()) {
			InternalEObject oldRnbkRV = (InternalEObject)rnbkRV;
			rnbkRV = (ASG)eResolveProxy(oldRnbkRV);
			if (rnbkRV != oldRnbkRV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__RNBK_RV, oldRnbkRV, rnbkRV));
			}
		}
		return rnbkRV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetRnbkRV() {
		return rnbkRV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRnbkRV(ASG newRnbkRV) {
		ASG oldRnbkRV = rnbkRV;
		rnbkRV = newRnbkRV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__RNBK_RV, oldRnbkRV, rnbkRV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getLimLodA() {
		if (limLodA != null && limLodA.eIsProxy()) {
			InternalEObject oldLimLodA = (InternalEObject)limLodA;
			limLodA = (ASG)eResolveProxy(oldLimLodA);
			if (limLodA != oldLimLodA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__LIM_LOD_A, oldLimLodA, limLodA));
			}
		}
		return limLodA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetLimLodA() {
		return limLodA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimLodA(ASG newLimLodA) {
		ASG oldLimLodA = limLodA;
		limLodA = newLimLodA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__LIM_LOD_A, oldLimLodA, limLodA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPG getLDC() {
		if (ldc != null && ldc.eIsProxy()) {
			InternalEObject oldLDC = (InternalEObject)ldc;
			ldc = (SPG)eResolveProxy(oldLDC);
			if (ldc != oldLDC) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__LDC, oldLDC, ldc));
			}
		}
		return ldc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPG basicGetLDC() {
		return ldc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLDC(SPG newLDC) {
		SPG oldLDC = ldc;
		ldc = newLDC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__LDC, oldLDC, ldc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPG getTmDlChr() {
		if (tmDlChr != null && tmDlChr.eIsProxy()) {
			InternalEObject oldTmDlChr = (InternalEObject)tmDlChr;
			tmDlChr = (SPG)eResolveProxy(oldTmDlChr);
			if (tmDlChr != oldTmDlChr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__TM_DL_CHR, oldTmDlChr, tmDlChr));
			}
		}
		return tmDlChr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPG basicGetTmDlChr() {
		return tmDlChr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmDlChr(SPG newTmDlChr) {
		SPG oldTmDlChr = tmDlChr;
		tmDlChr = newTmDlChr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__TM_DL_CHR, oldTmDlChr, tmDlChr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getLDCZ() {
		if (ldcz != null && ldcz.eIsProxy()) {
			InternalEObject oldLDCZ = (InternalEObject)ldcz;
			ldcz = (ASG)eResolveProxy(oldLDCZ);
			if (ldcz != oldLDCZ) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__LDCZ, oldLDCZ, ldcz));
			}
		}
		return ldcz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetLDCZ() {
		return ldcz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLDCZ(ASG newLDCZ) {
		ASG oldLDCZ = ldcz;
		ldcz = newLDCZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__LDCZ, oldLDCZ, ldcz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getVRedVal() {
		if (vRedVal != null && vRedVal.eIsProxy()) {
			InternalEObject oldVRedVal = (InternalEObject)vRedVal;
			vRedVal = (ASG)eResolveProxy(oldVRedVal);
			if (vRedVal != oldVRedVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__VRED_VAL, oldVRedVal, vRedVal));
			}
		}
		return vRedVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetVRedVal() {
		return vRedVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVRedVal(ASG newVRedVal) {
		ASG oldVRedVal = vRedVal;
		vRedVal = newVRedVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__VRED_VAL, oldVRedVal, vRedVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getTapBlkR() {
		if (tapBlkR != null && tapBlkR.eIsProxy()) {
			InternalEObject oldTapBlkR = (InternalEObject)tapBlkR;
			tapBlkR = (ASG)eResolveProxy(oldTapBlkR);
			if (tapBlkR != oldTapBlkR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__TAP_BLK_R, oldTapBlkR, tapBlkR));
			}
		}
		return tapBlkR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetTapBlkR() {
		return tapBlkR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTapBlkR(ASG newTapBlkR) {
		ASG oldTapBlkR = tapBlkR;
		tapBlkR = newTapBlkR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__TAP_BLK_R, oldTapBlkR, tapBlkR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getTapBlkL() {
		if (tapBlkL != null && tapBlkL.eIsProxy()) {
			InternalEObject oldTapBlkL = (InternalEObject)tapBlkL;
			tapBlkL = (ASG)eResolveProxy(oldTapBlkL);
			if (tapBlkL != oldTapBlkL) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ATCC__TAP_BLK_L, oldTapBlkL, tapBlkL));
			}
		}
		return tapBlkL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetTapBlkL() {
		return tapBlkL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTapBlkL(ASG newTapBlkL) {
		ASG oldTapBlkL = tapBlkL;
		tapBlkL = newTapBlkL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ATCC__TAP_BLK_L, oldTapBlkL, tapBlkL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupAPackage.ATCC__TAP_CHG:
				if (resolve) return getTapChg();
				return basicGetTapChg();
			case LNGroupAPackage.ATCC__TAP_POS:
				if (resolve) return getTapPos();
				return basicGetTapPos();
			case LNGroupAPackage.ATCC__PAR_OP:
				if (resolve) return getParOp();
				return basicGetParOp();
			case LNGroupAPackage.ATCC__LTC_BLK:
				if (resolve) return getLTCBlk();
				return basicGetLTCBlk();
			case LNGroupAPackage.ATCC__LTC_DRAG_RS:
				if (resolve) return getLTCDragRs();
				return basicGetLTCDragRs();
			case LNGroupAPackage.ATCC__VRED1:
				if (resolve) return getVRed1();
				return basicGetVRed1();
			case LNGroupAPackage.ATCC__VRED2:
				if (resolve) return getVRed2();
				return basicGetVRed2();
			case LNGroupAPackage.ATCC__CTL_V:
				if (resolve) return getCtlV();
				return basicGetCtlV();
			case LNGroupAPackage.ATCC__LOD_A:
				if (resolve) return getLodA();
				return basicGetLodA();
			case LNGroupAPackage.ATCC__CIRC_A:
				if (resolve) return getCircA();
				return basicGetCircA();
			case LNGroupAPackage.ATCC__PH_ANG:
				if (resolve) return getPhAng();
				return basicGetPhAng();
			case LNGroupAPackage.ATCC__HI_CTL_V:
				if (resolve) return getHiCtlV();
				return basicGetHiCtlV();
			case LNGroupAPackage.ATCC__LO_CTL_V:
				if (resolve) return getLoCtlV();
				return basicGetLoCtlV();
			case LNGroupAPackage.ATCC__HI_DMD_A:
				if (resolve) return getHiDmdA();
				return basicGetHiDmdA();
			case LNGroupAPackage.ATCC__HI_TAP_POS:
				if (resolve) return getHiTapPos();
				return basicGetHiTapPos();
			case LNGroupAPackage.ATCC__LO_TAP_POS:
				if (resolve) return getLoTapPos();
				return basicGetLoTapPos();
			case LNGroupAPackage.ATCC__BND_CTR:
				if (resolve) return getBndCtr();
				return basicGetBndCtr();
			case LNGroupAPackage.ATCC__BND_WID:
				if (resolve) return getBndWid();
				return basicGetBndWid();
			case LNGroupAPackage.ATCC__CTL_DL_TMMS:
				if (resolve) return getCtlDlTmms();
				return basicGetCtlDlTmms();
			case LNGroupAPackage.ATCC__LDCR:
				if (resolve) return getLDCR();
				return basicGetLDCR();
			case LNGroupAPackage.ATCC__LDCX:
				if (resolve) return getLDCX();
				return basicGetLDCX();
			case LNGroupAPackage.ATCC__BLK_LV:
				if (resolve) return getBlkLV();
				return basicGetBlkLV();
			case LNGroupAPackage.ATCC__BLK_RV:
				if (resolve) return getBlkRV();
				return basicGetBlkRV();
			case LNGroupAPackage.ATCC__RNBK_RV:
				if (resolve) return getRnbkRV();
				return basicGetRnbkRV();
			case LNGroupAPackage.ATCC__LIM_LOD_A:
				if (resolve) return getLimLodA();
				return basicGetLimLodA();
			case LNGroupAPackage.ATCC__LDC:
				if (resolve) return getLDC();
				return basicGetLDC();
			case LNGroupAPackage.ATCC__TM_DL_CHR:
				if (resolve) return getTmDlChr();
				return basicGetTmDlChr();
			case LNGroupAPackage.ATCC__LDCZ:
				if (resolve) return getLDCZ();
				return basicGetLDCZ();
			case LNGroupAPackage.ATCC__VRED_VAL:
				if (resolve) return getVRedVal();
				return basicGetVRedVal();
			case LNGroupAPackage.ATCC__TAP_BLK_R:
				if (resolve) return getTapBlkR();
				return basicGetTapBlkR();
			case LNGroupAPackage.ATCC__TAP_BLK_L:
				if (resolve) return getTapBlkL();
				return basicGetTapBlkL();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LNGroupAPackage.ATCC__TAP_CHG:
				setTapChg((BSC)newValue);
				return;
			case LNGroupAPackage.ATCC__TAP_POS:
				setTapPos((ISC)newValue);
				return;
			case LNGroupAPackage.ATCC__PAR_OP:
				setParOp((DPC)newValue);
				return;
			case LNGroupAPackage.ATCC__LTC_BLK:
				setLTCBlk((SPC)newValue);
				return;
			case LNGroupAPackage.ATCC__LTC_DRAG_RS:
				setLTCDragRs((SPC)newValue);
				return;
			case LNGroupAPackage.ATCC__VRED1:
				setVRed1((SPC)newValue);
				return;
			case LNGroupAPackage.ATCC__VRED2:
				setVRed2((SPC)newValue);
				return;
			case LNGroupAPackage.ATCC__CTL_V:
				setCtlV((MV)newValue);
				return;
			case LNGroupAPackage.ATCC__LOD_A:
				setLodA((MV)newValue);
				return;
			case LNGroupAPackage.ATCC__CIRC_A:
				setCircA((MV)newValue);
				return;
			case LNGroupAPackage.ATCC__PH_ANG:
				setPhAng((MV)newValue);
				return;
			case LNGroupAPackage.ATCC__HI_CTL_V:
				setHiCtlV((MV)newValue);
				return;
			case LNGroupAPackage.ATCC__LO_CTL_V:
				setLoCtlV((MV)newValue);
				return;
			case LNGroupAPackage.ATCC__HI_DMD_A:
				setHiDmdA((MV)newValue);
				return;
			case LNGroupAPackage.ATCC__HI_TAP_POS:
				setHiTapPos((INS)newValue);
				return;
			case LNGroupAPackage.ATCC__LO_TAP_POS:
				setLoTapPos((INS)newValue);
				return;
			case LNGroupAPackage.ATCC__BND_CTR:
				setBndCtr((ASG)newValue);
				return;
			case LNGroupAPackage.ATCC__BND_WID:
				setBndWid((ASG)newValue);
				return;
			case LNGroupAPackage.ATCC__CTL_DL_TMMS:
				setCtlDlTmms((ASG)newValue);
				return;
			case LNGroupAPackage.ATCC__LDCR:
				setLDCR((ASG)newValue);
				return;
			case LNGroupAPackage.ATCC__LDCX:
				setLDCX((ASG)newValue);
				return;
			case LNGroupAPackage.ATCC__BLK_LV:
				setBlkLV((ASG)newValue);
				return;
			case LNGroupAPackage.ATCC__BLK_RV:
				setBlkRV((ASG)newValue);
				return;
			case LNGroupAPackage.ATCC__RNBK_RV:
				setRnbkRV((ASG)newValue);
				return;
			case LNGroupAPackage.ATCC__LIM_LOD_A:
				setLimLodA((ASG)newValue);
				return;
			case LNGroupAPackage.ATCC__LDC:
				setLDC((SPG)newValue);
				return;
			case LNGroupAPackage.ATCC__TM_DL_CHR:
				setTmDlChr((SPG)newValue);
				return;
			case LNGroupAPackage.ATCC__LDCZ:
				setLDCZ((ASG)newValue);
				return;
			case LNGroupAPackage.ATCC__VRED_VAL:
				setVRedVal((ASG)newValue);
				return;
			case LNGroupAPackage.ATCC__TAP_BLK_R:
				setTapBlkR((ASG)newValue);
				return;
			case LNGroupAPackage.ATCC__TAP_BLK_L:
				setTapBlkL((ASG)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LNGroupAPackage.ATCC__TAP_CHG:
				setTapChg((BSC)null);
				return;
			case LNGroupAPackage.ATCC__TAP_POS:
				setTapPos((ISC)null);
				return;
			case LNGroupAPackage.ATCC__PAR_OP:
				setParOp((DPC)null);
				return;
			case LNGroupAPackage.ATCC__LTC_BLK:
				setLTCBlk((SPC)null);
				return;
			case LNGroupAPackage.ATCC__LTC_DRAG_RS:
				setLTCDragRs((SPC)null);
				return;
			case LNGroupAPackage.ATCC__VRED1:
				setVRed1((SPC)null);
				return;
			case LNGroupAPackage.ATCC__VRED2:
				setVRed2((SPC)null);
				return;
			case LNGroupAPackage.ATCC__CTL_V:
				setCtlV((MV)null);
				return;
			case LNGroupAPackage.ATCC__LOD_A:
				setLodA((MV)null);
				return;
			case LNGroupAPackage.ATCC__CIRC_A:
				setCircA((MV)null);
				return;
			case LNGroupAPackage.ATCC__PH_ANG:
				setPhAng((MV)null);
				return;
			case LNGroupAPackage.ATCC__HI_CTL_V:
				setHiCtlV((MV)null);
				return;
			case LNGroupAPackage.ATCC__LO_CTL_V:
				setLoCtlV((MV)null);
				return;
			case LNGroupAPackage.ATCC__HI_DMD_A:
				setHiDmdA((MV)null);
				return;
			case LNGroupAPackage.ATCC__HI_TAP_POS:
				setHiTapPos((INS)null);
				return;
			case LNGroupAPackage.ATCC__LO_TAP_POS:
				setLoTapPos((INS)null);
				return;
			case LNGroupAPackage.ATCC__BND_CTR:
				setBndCtr((ASG)null);
				return;
			case LNGroupAPackage.ATCC__BND_WID:
				setBndWid((ASG)null);
				return;
			case LNGroupAPackage.ATCC__CTL_DL_TMMS:
				setCtlDlTmms((ASG)null);
				return;
			case LNGroupAPackage.ATCC__LDCR:
				setLDCR((ASG)null);
				return;
			case LNGroupAPackage.ATCC__LDCX:
				setLDCX((ASG)null);
				return;
			case LNGroupAPackage.ATCC__BLK_LV:
				setBlkLV((ASG)null);
				return;
			case LNGroupAPackage.ATCC__BLK_RV:
				setBlkRV((ASG)null);
				return;
			case LNGroupAPackage.ATCC__RNBK_RV:
				setRnbkRV((ASG)null);
				return;
			case LNGroupAPackage.ATCC__LIM_LOD_A:
				setLimLodA((ASG)null);
				return;
			case LNGroupAPackage.ATCC__LDC:
				setLDC((SPG)null);
				return;
			case LNGroupAPackage.ATCC__TM_DL_CHR:
				setTmDlChr((SPG)null);
				return;
			case LNGroupAPackage.ATCC__LDCZ:
				setLDCZ((ASG)null);
				return;
			case LNGroupAPackage.ATCC__VRED_VAL:
				setVRedVal((ASG)null);
				return;
			case LNGroupAPackage.ATCC__TAP_BLK_R:
				setTapBlkR((ASG)null);
				return;
			case LNGroupAPackage.ATCC__TAP_BLK_L:
				setTapBlkL((ASG)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LNGroupAPackage.ATCC__TAP_CHG:
				return tapChg != null;
			case LNGroupAPackage.ATCC__TAP_POS:
				return tapPos != null;
			case LNGroupAPackage.ATCC__PAR_OP:
				return parOp != null;
			case LNGroupAPackage.ATCC__LTC_BLK:
				return ltcBlk != null;
			case LNGroupAPackage.ATCC__LTC_DRAG_RS:
				return ltcDragRs != null;
			case LNGroupAPackage.ATCC__VRED1:
				return vRed1 != null;
			case LNGroupAPackage.ATCC__VRED2:
				return vRed2 != null;
			case LNGroupAPackage.ATCC__CTL_V:
				return ctlV != null;
			case LNGroupAPackage.ATCC__LOD_A:
				return lodA != null;
			case LNGroupAPackage.ATCC__CIRC_A:
				return circA != null;
			case LNGroupAPackage.ATCC__PH_ANG:
				return phAng != null;
			case LNGroupAPackage.ATCC__HI_CTL_V:
				return hiCtlV != null;
			case LNGroupAPackage.ATCC__LO_CTL_V:
				return loCtlV != null;
			case LNGroupAPackage.ATCC__HI_DMD_A:
				return hiDmdA != null;
			case LNGroupAPackage.ATCC__HI_TAP_POS:
				return hiTapPos != null;
			case LNGroupAPackage.ATCC__LO_TAP_POS:
				return loTapPos != null;
			case LNGroupAPackage.ATCC__BND_CTR:
				return bndCtr != null;
			case LNGroupAPackage.ATCC__BND_WID:
				return bndWid != null;
			case LNGroupAPackage.ATCC__CTL_DL_TMMS:
				return ctlDlTmms != null;
			case LNGroupAPackage.ATCC__LDCR:
				return ldcr != null;
			case LNGroupAPackage.ATCC__LDCX:
				return ldcx != null;
			case LNGroupAPackage.ATCC__BLK_LV:
				return blkLV != null;
			case LNGroupAPackage.ATCC__BLK_RV:
				return blkRV != null;
			case LNGroupAPackage.ATCC__RNBK_RV:
				return rnbkRV != null;
			case LNGroupAPackage.ATCC__LIM_LOD_A:
				return limLodA != null;
			case LNGroupAPackage.ATCC__LDC:
				return ldc != null;
			case LNGroupAPackage.ATCC__TM_DL_CHR:
				return tmDlChr != null;
			case LNGroupAPackage.ATCC__LDCZ:
				return ldcz != null;
			case LNGroupAPackage.ATCC__VRED_VAL:
				return vRedVal != null;
			case LNGroupAPackage.ATCC__TAP_BLK_R:
				return tapBlkR != null;
			case LNGroupAPackage.ATCC__TAP_BLK_L:
				return tapBlkL != null;
		}
		return super.eIsSet(featureID);
	}

} //ATCCImpl
