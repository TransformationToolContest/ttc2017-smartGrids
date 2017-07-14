/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupZ.impl;

import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.DPC;
import gluemodel.substationStandard.Dataclasses.INS;
import gluemodel.substationStandard.Dataclasses.MV;
import gluemodel.substationStandard.Dataclasses.SPC;
import gluemodel.substationStandard.Dataclasses.SPS;

import gluemodel.substationStandard.Enumerations.GeneratorStateKind;

import gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage;
import gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZGEN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGENImpl#getOpTmh <em>Op Tmh</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGENImpl#getGnCtl <em>Gn Ctl</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGENImpl#getDExt <em>DExt</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGENImpl#getAuxSCO <em>Aux SCO</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGENImpl#getStopVlv <em>Stop Vlv</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGENImpl#getReactPwrR <em>React Pwr R</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGENImpl#getReactPwrL <em>React Pwr L</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGENImpl#getGnSpd <em>Gn Spd</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGENImpl#getOANL <em>OANL</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGENImpl#getGnSt <em>Gn St</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGENImpl#getClkRot <em>Clk Rot</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGENImpl#getCntClkRot <em>Cnt Clk Rot</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGENImpl#getOpUnExt <em>Op Un Ext</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGENImpl#getOpOvExt <em>Op Ov Ext</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGENImpl#getLosOil <em>Los Oil</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGENImpl#getLosVac <em>Los Vac</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGENImpl#getPresAlm <em>Pres Alm</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGENImpl#getDmdPwr <em>Dmd Pwr</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGENImpl#getPwrRtg <em>Pwr Rtg</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGENImpl#getVRtg <em>VRtg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZGENImpl extends GroupZImpl implements ZGEN {
	/**
	 * The cached value of the '{@link #getOpTmh() <em>Op Tmh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpTmh()
	 * @generated
	 * @ordered
	 */
	protected INS opTmh;

	/**
	 * The cached value of the '{@link #getGnCtl() <em>Gn Ctl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGnCtl()
	 * @generated
	 * @ordered
	 */
	protected DPC gnCtl;

	/**
	 * The cached value of the '{@link #getDExt() <em>DExt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDExt()
	 * @generated
	 * @ordered
	 */
	protected SPC dExt;

	/**
	 * The cached value of the '{@link #getAuxSCO() <em>Aux SCO</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxSCO()
	 * @generated
	 * @ordered
	 */
	protected SPC auxSCO;

	/**
	 * The cached value of the '{@link #getStopVlv() <em>Stop Vlv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopVlv()
	 * @generated
	 * @ordered
	 */
	protected SPC stopVlv;

	/**
	 * The cached value of the '{@link #getReactPwrR() <em>React Pwr R</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactPwrR()
	 * @generated
	 * @ordered
	 */
	protected SPC reactPwrR;

	/**
	 * The cached value of the '{@link #getReactPwrL() <em>React Pwr L</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactPwrL()
	 * @generated
	 * @ordered
	 */
	protected SPC reactPwrL;

	/**
	 * The cached value of the '{@link #getGnSpd() <em>Gn Spd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGnSpd()
	 * @generated
	 * @ordered
	 */
	protected MV gnSpd;

	/**
	 * The cached value of the '{@link #getOANL() <em>OANL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOANL()
	 * @generated
	 * @ordered
	 */
	protected SPS oanl;

	/**
	 * The default value of the '{@link #getGnSt() <em>Gn St</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGnSt()
	 * @generated
	 * @ordered
	 */
	protected static final GeneratorStateKind GN_ST_EDEFAULT = GeneratorStateKind.STOPPED;

	/**
	 * The cached value of the '{@link #getGnSt() <em>Gn St</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGnSt()
	 * @generated
	 * @ordered
	 */
	protected GeneratorStateKind gnSt = GN_ST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClkRot() <em>Clk Rot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClkRot()
	 * @generated
	 * @ordered
	 */
	protected SPS clkRot;

	/**
	 * The cached value of the '{@link #getCntClkRot() <em>Cnt Clk Rot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCntClkRot()
	 * @generated
	 * @ordered
	 */
	protected SPS cntClkRot;

	/**
	 * The cached value of the '{@link #getOpUnExt() <em>Op Un Ext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpUnExt()
	 * @generated
	 * @ordered
	 */
	protected SPS opUnExt;

	/**
	 * The cached value of the '{@link #getOpOvExt() <em>Op Ov Ext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpOvExt()
	 * @generated
	 * @ordered
	 */
	protected SPS opOvExt;

	/**
	 * The cached value of the '{@link #getLosOil() <em>Los Oil</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLosOil()
	 * @generated
	 * @ordered
	 */
	protected SPS losOil;

	/**
	 * The cached value of the '{@link #getLosVac() <em>Los Vac</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLosVac()
	 * @generated
	 * @ordered
	 */
	protected SPS losVac;

	/**
	 * The cached value of the '{@link #getPresAlm() <em>Pres Alm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresAlm()
	 * @generated
	 * @ordered
	 */
	protected SPS presAlm;

	/**
	 * The cached value of the '{@link #getDmdPwr() <em>Dmd Pwr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmdPwr()
	 * @generated
	 * @ordered
	 */
	protected ASG dmdPwr;

	/**
	 * The cached value of the '{@link #getPwrRtg() <em>Pwr Rtg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwrRtg()
	 * @generated
	 * @ordered
	 */
	protected ASG pwrRtg;

	/**
	 * The cached value of the '{@link #getVRtg() <em>VRtg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVRtg()
	 * @generated
	 * @ordered
	 */
	protected ASG vRtg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZGENImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupZPackage.Literals.ZGEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS getOpTmh() {
		if (opTmh != null && opTmh.eIsProxy()) {
			InternalEObject oldOpTmh = (InternalEObject)opTmh;
			opTmh = (INS)eResolveProxy(oldOpTmh);
			if (opTmh != oldOpTmh) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZGEN__OP_TMH, oldOpTmh, opTmh));
			}
		}
		return opTmh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS basicGetOpTmh() {
		return opTmh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpTmh(INS newOpTmh) {
		INS oldOpTmh = opTmh;
		opTmh = newOpTmh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZGEN__OP_TMH, oldOpTmh, opTmh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPC getGnCtl() {
		if (gnCtl != null && gnCtl.eIsProxy()) {
			InternalEObject oldGnCtl = (InternalEObject)gnCtl;
			gnCtl = (DPC)eResolveProxy(oldGnCtl);
			if (gnCtl != oldGnCtl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZGEN__GN_CTL, oldGnCtl, gnCtl));
			}
		}
		return gnCtl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPC basicGetGnCtl() {
		return gnCtl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGnCtl(DPC newGnCtl) {
		DPC oldGnCtl = gnCtl;
		gnCtl = newGnCtl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZGEN__GN_CTL, oldGnCtl, gnCtl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getDExt() {
		if (dExt != null && dExt.eIsProxy()) {
			InternalEObject oldDExt = (InternalEObject)dExt;
			dExt = (SPC)eResolveProxy(oldDExt);
			if (dExt != oldDExt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZGEN__DEXT, oldDExt, dExt));
			}
		}
		return dExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetDExt() {
		return dExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDExt(SPC newDExt) {
		SPC oldDExt = dExt;
		dExt = newDExt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZGEN__DEXT, oldDExt, dExt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getAuxSCO() {
		if (auxSCO != null && auxSCO.eIsProxy()) {
			InternalEObject oldAuxSCO = (InternalEObject)auxSCO;
			auxSCO = (SPC)eResolveProxy(oldAuxSCO);
			if (auxSCO != oldAuxSCO) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZGEN__AUX_SCO, oldAuxSCO, auxSCO));
			}
		}
		return auxSCO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetAuxSCO() {
		return auxSCO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuxSCO(SPC newAuxSCO) {
		SPC oldAuxSCO = auxSCO;
		auxSCO = newAuxSCO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZGEN__AUX_SCO, oldAuxSCO, auxSCO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getStopVlv() {
		if (stopVlv != null && stopVlv.eIsProxy()) {
			InternalEObject oldStopVlv = (InternalEObject)stopVlv;
			stopVlv = (SPC)eResolveProxy(oldStopVlv);
			if (stopVlv != oldStopVlv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZGEN__STOP_VLV, oldStopVlv, stopVlv));
			}
		}
		return stopVlv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetStopVlv() {
		return stopVlv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopVlv(SPC newStopVlv) {
		SPC oldStopVlv = stopVlv;
		stopVlv = newStopVlv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZGEN__STOP_VLV, oldStopVlv, stopVlv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getReactPwrR() {
		if (reactPwrR != null && reactPwrR.eIsProxy()) {
			InternalEObject oldReactPwrR = (InternalEObject)reactPwrR;
			reactPwrR = (SPC)eResolveProxy(oldReactPwrR);
			if (reactPwrR != oldReactPwrR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZGEN__REACT_PWR_R, oldReactPwrR, reactPwrR));
			}
		}
		return reactPwrR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetReactPwrR() {
		return reactPwrR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactPwrR(SPC newReactPwrR) {
		SPC oldReactPwrR = reactPwrR;
		reactPwrR = newReactPwrR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZGEN__REACT_PWR_R, oldReactPwrR, reactPwrR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getReactPwrL() {
		if (reactPwrL != null && reactPwrL.eIsProxy()) {
			InternalEObject oldReactPwrL = (InternalEObject)reactPwrL;
			reactPwrL = (SPC)eResolveProxy(oldReactPwrL);
			if (reactPwrL != oldReactPwrL) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZGEN__REACT_PWR_L, oldReactPwrL, reactPwrL));
			}
		}
		return reactPwrL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetReactPwrL() {
		return reactPwrL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactPwrL(SPC newReactPwrL) {
		SPC oldReactPwrL = reactPwrL;
		reactPwrL = newReactPwrL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZGEN__REACT_PWR_L, oldReactPwrL, reactPwrL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getGnSpd() {
		if (gnSpd != null && gnSpd.eIsProxy()) {
			InternalEObject oldGnSpd = (InternalEObject)gnSpd;
			gnSpd = (MV)eResolveProxy(oldGnSpd);
			if (gnSpd != oldGnSpd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZGEN__GN_SPD, oldGnSpd, gnSpd));
			}
		}
		return gnSpd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetGnSpd() {
		return gnSpd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGnSpd(MV newGnSpd) {
		MV oldGnSpd = gnSpd;
		gnSpd = newGnSpd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZGEN__GN_SPD, oldGnSpd, gnSpd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getOANL() {
		if (oanl != null && oanl.eIsProxy()) {
			InternalEObject oldOANL = (InternalEObject)oanl;
			oanl = (SPS)eResolveProxy(oldOANL);
			if (oanl != oldOANL) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZGEN__OANL, oldOANL, oanl));
			}
		}
		return oanl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetOANL() {
		return oanl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOANL(SPS newOANL) {
		SPS oldOANL = oanl;
		oanl = newOANL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZGEN__OANL, oldOANL, oanl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorStateKind getGnSt() {
		return gnSt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGnSt(GeneratorStateKind newGnSt) {
		GeneratorStateKind oldGnSt = gnSt;
		gnSt = newGnSt == null ? GN_ST_EDEFAULT : newGnSt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZGEN__GN_ST, oldGnSt, gnSt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getClkRot() {
		if (clkRot != null && clkRot.eIsProxy()) {
			InternalEObject oldClkRot = (InternalEObject)clkRot;
			clkRot = (SPS)eResolveProxy(oldClkRot);
			if (clkRot != oldClkRot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZGEN__CLK_ROT, oldClkRot, clkRot));
			}
		}
		return clkRot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetClkRot() {
		return clkRot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClkRot(SPS newClkRot) {
		SPS oldClkRot = clkRot;
		clkRot = newClkRot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZGEN__CLK_ROT, oldClkRot, clkRot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getCntClkRot() {
		if (cntClkRot != null && cntClkRot.eIsProxy()) {
			InternalEObject oldCntClkRot = (InternalEObject)cntClkRot;
			cntClkRot = (SPS)eResolveProxy(oldCntClkRot);
			if (cntClkRot != oldCntClkRot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZGEN__CNT_CLK_ROT, oldCntClkRot, cntClkRot));
			}
		}
		return cntClkRot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetCntClkRot() {
		return cntClkRot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCntClkRot(SPS newCntClkRot) {
		SPS oldCntClkRot = cntClkRot;
		cntClkRot = newCntClkRot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZGEN__CNT_CLK_ROT, oldCntClkRot, cntClkRot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getOpUnExt() {
		if (opUnExt != null && opUnExt.eIsProxy()) {
			InternalEObject oldOpUnExt = (InternalEObject)opUnExt;
			opUnExt = (SPS)eResolveProxy(oldOpUnExt);
			if (opUnExt != oldOpUnExt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZGEN__OP_UN_EXT, oldOpUnExt, opUnExt));
			}
		}
		return opUnExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetOpUnExt() {
		return opUnExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpUnExt(SPS newOpUnExt) {
		SPS oldOpUnExt = opUnExt;
		opUnExt = newOpUnExt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZGEN__OP_UN_EXT, oldOpUnExt, opUnExt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getOpOvExt() {
		if (opOvExt != null && opOvExt.eIsProxy()) {
			InternalEObject oldOpOvExt = (InternalEObject)opOvExt;
			opOvExt = (SPS)eResolveProxy(oldOpOvExt);
			if (opOvExt != oldOpOvExt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZGEN__OP_OV_EXT, oldOpOvExt, opOvExt));
			}
		}
		return opOvExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetOpOvExt() {
		return opOvExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpOvExt(SPS newOpOvExt) {
		SPS oldOpOvExt = opOvExt;
		opOvExt = newOpOvExt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZGEN__OP_OV_EXT, oldOpOvExt, opOvExt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getLosOil() {
		if (losOil != null && losOil.eIsProxy()) {
			InternalEObject oldLosOil = (InternalEObject)losOil;
			losOil = (SPS)eResolveProxy(oldLosOil);
			if (losOil != oldLosOil) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZGEN__LOS_OIL, oldLosOil, losOil));
			}
		}
		return losOil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetLosOil() {
		return losOil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLosOil(SPS newLosOil) {
		SPS oldLosOil = losOil;
		losOil = newLosOil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZGEN__LOS_OIL, oldLosOil, losOil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getLosVac() {
		if (losVac != null && losVac.eIsProxy()) {
			InternalEObject oldLosVac = (InternalEObject)losVac;
			losVac = (SPS)eResolveProxy(oldLosVac);
			if (losVac != oldLosVac) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZGEN__LOS_VAC, oldLosVac, losVac));
			}
		}
		return losVac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetLosVac() {
		return losVac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLosVac(SPS newLosVac) {
		SPS oldLosVac = losVac;
		losVac = newLosVac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZGEN__LOS_VAC, oldLosVac, losVac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getPresAlm() {
		if (presAlm != null && presAlm.eIsProxy()) {
			InternalEObject oldPresAlm = (InternalEObject)presAlm;
			presAlm = (SPS)eResolveProxy(oldPresAlm);
			if (presAlm != oldPresAlm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZGEN__PRES_ALM, oldPresAlm, presAlm));
			}
		}
		return presAlm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetPresAlm() {
		return presAlm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresAlm(SPS newPresAlm) {
		SPS oldPresAlm = presAlm;
		presAlm = newPresAlm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZGEN__PRES_ALM, oldPresAlm, presAlm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getDmdPwr() {
		if (dmdPwr != null && dmdPwr.eIsProxy()) {
			InternalEObject oldDmdPwr = (InternalEObject)dmdPwr;
			dmdPwr = (ASG)eResolveProxy(oldDmdPwr);
			if (dmdPwr != oldDmdPwr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZGEN__DMD_PWR, oldDmdPwr, dmdPwr));
			}
		}
		return dmdPwr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetDmdPwr() {
		return dmdPwr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDmdPwr(ASG newDmdPwr) {
		ASG oldDmdPwr = dmdPwr;
		dmdPwr = newDmdPwr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZGEN__DMD_PWR, oldDmdPwr, dmdPwr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getPwrRtg() {
		if (pwrRtg != null && pwrRtg.eIsProxy()) {
			InternalEObject oldPwrRtg = (InternalEObject)pwrRtg;
			pwrRtg = (ASG)eResolveProxy(oldPwrRtg);
			if (pwrRtg != oldPwrRtg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZGEN__PWR_RTG, oldPwrRtg, pwrRtg));
			}
		}
		return pwrRtg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetPwrRtg() {
		return pwrRtg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPwrRtg(ASG newPwrRtg) {
		ASG oldPwrRtg = pwrRtg;
		pwrRtg = newPwrRtg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZGEN__PWR_RTG, oldPwrRtg, pwrRtg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getVRtg() {
		if (vRtg != null && vRtg.eIsProxy()) {
			InternalEObject oldVRtg = (InternalEObject)vRtg;
			vRtg = (ASG)eResolveProxy(oldVRtg);
			if (vRtg != oldVRtg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZGEN__VRTG, oldVRtg, vRtg));
			}
		}
		return vRtg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetVRtg() {
		return vRtg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVRtg(ASG newVRtg) {
		ASG oldVRtg = vRtg;
		vRtg = newVRtg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZGEN__VRTG, oldVRtg, vRtg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupZPackage.ZGEN__OP_TMH:
				if (resolve) return getOpTmh();
				return basicGetOpTmh();
			case LNGroupZPackage.ZGEN__GN_CTL:
				if (resolve) return getGnCtl();
				return basicGetGnCtl();
			case LNGroupZPackage.ZGEN__DEXT:
				if (resolve) return getDExt();
				return basicGetDExt();
			case LNGroupZPackage.ZGEN__AUX_SCO:
				if (resolve) return getAuxSCO();
				return basicGetAuxSCO();
			case LNGroupZPackage.ZGEN__STOP_VLV:
				if (resolve) return getStopVlv();
				return basicGetStopVlv();
			case LNGroupZPackage.ZGEN__REACT_PWR_R:
				if (resolve) return getReactPwrR();
				return basicGetReactPwrR();
			case LNGroupZPackage.ZGEN__REACT_PWR_L:
				if (resolve) return getReactPwrL();
				return basicGetReactPwrL();
			case LNGroupZPackage.ZGEN__GN_SPD:
				if (resolve) return getGnSpd();
				return basicGetGnSpd();
			case LNGroupZPackage.ZGEN__OANL:
				if (resolve) return getOANL();
				return basicGetOANL();
			case LNGroupZPackage.ZGEN__GN_ST:
				return getGnSt();
			case LNGroupZPackage.ZGEN__CLK_ROT:
				if (resolve) return getClkRot();
				return basicGetClkRot();
			case LNGroupZPackage.ZGEN__CNT_CLK_ROT:
				if (resolve) return getCntClkRot();
				return basicGetCntClkRot();
			case LNGroupZPackage.ZGEN__OP_UN_EXT:
				if (resolve) return getOpUnExt();
				return basicGetOpUnExt();
			case LNGroupZPackage.ZGEN__OP_OV_EXT:
				if (resolve) return getOpOvExt();
				return basicGetOpOvExt();
			case LNGroupZPackage.ZGEN__LOS_OIL:
				if (resolve) return getLosOil();
				return basicGetLosOil();
			case LNGroupZPackage.ZGEN__LOS_VAC:
				if (resolve) return getLosVac();
				return basicGetLosVac();
			case LNGroupZPackage.ZGEN__PRES_ALM:
				if (resolve) return getPresAlm();
				return basicGetPresAlm();
			case LNGroupZPackage.ZGEN__DMD_PWR:
				if (resolve) return getDmdPwr();
				return basicGetDmdPwr();
			case LNGroupZPackage.ZGEN__PWR_RTG:
				if (resolve) return getPwrRtg();
				return basicGetPwrRtg();
			case LNGroupZPackage.ZGEN__VRTG:
				if (resolve) return getVRtg();
				return basicGetVRtg();
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
			case LNGroupZPackage.ZGEN__OP_TMH:
				setOpTmh((INS)newValue);
				return;
			case LNGroupZPackage.ZGEN__GN_CTL:
				setGnCtl((DPC)newValue);
				return;
			case LNGroupZPackage.ZGEN__DEXT:
				setDExt((SPC)newValue);
				return;
			case LNGroupZPackage.ZGEN__AUX_SCO:
				setAuxSCO((SPC)newValue);
				return;
			case LNGroupZPackage.ZGEN__STOP_VLV:
				setStopVlv((SPC)newValue);
				return;
			case LNGroupZPackage.ZGEN__REACT_PWR_R:
				setReactPwrR((SPC)newValue);
				return;
			case LNGroupZPackage.ZGEN__REACT_PWR_L:
				setReactPwrL((SPC)newValue);
				return;
			case LNGroupZPackage.ZGEN__GN_SPD:
				setGnSpd((MV)newValue);
				return;
			case LNGroupZPackage.ZGEN__OANL:
				setOANL((SPS)newValue);
				return;
			case LNGroupZPackage.ZGEN__GN_ST:
				setGnSt((GeneratorStateKind)newValue);
				return;
			case LNGroupZPackage.ZGEN__CLK_ROT:
				setClkRot((SPS)newValue);
				return;
			case LNGroupZPackage.ZGEN__CNT_CLK_ROT:
				setCntClkRot((SPS)newValue);
				return;
			case LNGroupZPackage.ZGEN__OP_UN_EXT:
				setOpUnExt((SPS)newValue);
				return;
			case LNGroupZPackage.ZGEN__OP_OV_EXT:
				setOpOvExt((SPS)newValue);
				return;
			case LNGroupZPackage.ZGEN__LOS_OIL:
				setLosOil((SPS)newValue);
				return;
			case LNGroupZPackage.ZGEN__LOS_VAC:
				setLosVac((SPS)newValue);
				return;
			case LNGroupZPackage.ZGEN__PRES_ALM:
				setPresAlm((SPS)newValue);
				return;
			case LNGroupZPackage.ZGEN__DMD_PWR:
				setDmdPwr((ASG)newValue);
				return;
			case LNGroupZPackage.ZGEN__PWR_RTG:
				setPwrRtg((ASG)newValue);
				return;
			case LNGroupZPackage.ZGEN__VRTG:
				setVRtg((ASG)newValue);
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
			case LNGroupZPackage.ZGEN__OP_TMH:
				setOpTmh((INS)null);
				return;
			case LNGroupZPackage.ZGEN__GN_CTL:
				setGnCtl((DPC)null);
				return;
			case LNGroupZPackage.ZGEN__DEXT:
				setDExt((SPC)null);
				return;
			case LNGroupZPackage.ZGEN__AUX_SCO:
				setAuxSCO((SPC)null);
				return;
			case LNGroupZPackage.ZGEN__STOP_VLV:
				setStopVlv((SPC)null);
				return;
			case LNGroupZPackage.ZGEN__REACT_PWR_R:
				setReactPwrR((SPC)null);
				return;
			case LNGroupZPackage.ZGEN__REACT_PWR_L:
				setReactPwrL((SPC)null);
				return;
			case LNGroupZPackage.ZGEN__GN_SPD:
				setGnSpd((MV)null);
				return;
			case LNGroupZPackage.ZGEN__OANL:
				setOANL((SPS)null);
				return;
			case LNGroupZPackage.ZGEN__GN_ST:
				setGnSt(GN_ST_EDEFAULT);
				return;
			case LNGroupZPackage.ZGEN__CLK_ROT:
				setClkRot((SPS)null);
				return;
			case LNGroupZPackage.ZGEN__CNT_CLK_ROT:
				setCntClkRot((SPS)null);
				return;
			case LNGroupZPackage.ZGEN__OP_UN_EXT:
				setOpUnExt((SPS)null);
				return;
			case LNGroupZPackage.ZGEN__OP_OV_EXT:
				setOpOvExt((SPS)null);
				return;
			case LNGroupZPackage.ZGEN__LOS_OIL:
				setLosOil((SPS)null);
				return;
			case LNGroupZPackage.ZGEN__LOS_VAC:
				setLosVac((SPS)null);
				return;
			case LNGroupZPackage.ZGEN__PRES_ALM:
				setPresAlm((SPS)null);
				return;
			case LNGroupZPackage.ZGEN__DMD_PWR:
				setDmdPwr((ASG)null);
				return;
			case LNGroupZPackage.ZGEN__PWR_RTG:
				setPwrRtg((ASG)null);
				return;
			case LNGroupZPackage.ZGEN__VRTG:
				setVRtg((ASG)null);
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
			case LNGroupZPackage.ZGEN__OP_TMH:
				return opTmh != null;
			case LNGroupZPackage.ZGEN__GN_CTL:
				return gnCtl != null;
			case LNGroupZPackage.ZGEN__DEXT:
				return dExt != null;
			case LNGroupZPackage.ZGEN__AUX_SCO:
				return auxSCO != null;
			case LNGroupZPackage.ZGEN__STOP_VLV:
				return stopVlv != null;
			case LNGroupZPackage.ZGEN__REACT_PWR_R:
				return reactPwrR != null;
			case LNGroupZPackage.ZGEN__REACT_PWR_L:
				return reactPwrL != null;
			case LNGroupZPackage.ZGEN__GN_SPD:
				return gnSpd != null;
			case LNGroupZPackage.ZGEN__OANL:
				return oanl != null;
			case LNGroupZPackage.ZGEN__GN_ST:
				return gnSt != GN_ST_EDEFAULT;
			case LNGroupZPackage.ZGEN__CLK_ROT:
				return clkRot != null;
			case LNGroupZPackage.ZGEN__CNT_CLK_ROT:
				return cntClkRot != null;
			case LNGroupZPackage.ZGEN__OP_UN_EXT:
				return opUnExt != null;
			case LNGroupZPackage.ZGEN__OP_OV_EXT:
				return opOvExt != null;
			case LNGroupZPackage.ZGEN__LOS_OIL:
				return losOil != null;
			case LNGroupZPackage.ZGEN__LOS_VAC:
				return losVac != null;
			case LNGroupZPackage.ZGEN__PRES_ALM:
				return presAlm != null;
			case LNGroupZPackage.ZGEN__DMD_PWR:
				return dmdPwr != null;
			case LNGroupZPackage.ZGEN__PWR_RTG:
				return pwrRtg != null;
			case LNGroupZPackage.ZGEN__VRTG:
				return vRtg != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (GnSt: ");
		result.append(gnSt);
		result.append(')');
		return result.toString();
	}

} //ZGENImpl
