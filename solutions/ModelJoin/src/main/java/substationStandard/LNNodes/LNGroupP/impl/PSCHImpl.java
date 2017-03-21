/**
 */
package substationStandard.LNNodes.LNGroupP.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.ACD;
import substationStandard.Dataclasses.ACT;
import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.ING;
import substationStandard.Dataclasses.SPS;

import substationStandard.LNNodes.LNGroupP.LNGroupPPackage;
import substationStandard.LNNodes.LNGroupP.PSCH;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PSCH</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PSCHImpl#getProTx <em>Pro Tx</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PSCHImpl#getProRx <em>Pro Rx</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PSCHImpl#getStr <em>Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PSCHImpl#getOp <em>Op</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PSCHImpl#getCarRx <em>Car Rx</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PSCHImpl#getLosOfGrd <em>Los Of Grd</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PSCHImpl#getEcho <em>Echo</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PSCHImpl#getWeiOp <em>Wei Op</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PSCHImpl#getRvABlk <em>Rv ABlk</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PSCHImpl#getGrdRx <em>Grd Rx</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PSCHImpl#getSchTyp <em>Sch Typ</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PSCHImpl#getOpDlTmms <em>Op Dl Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PSCHImpl#getCrdTmms <em>Crd Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PSCHImpl#getDurTmms <em>Dur Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PSCHImpl#getUnBlkMod <em>Un Blk Mod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PSCHImpl#getSecTmms <em>Sec Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PSCHImpl#getWeiMod <em>Wei Mod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PSCHImpl#getWeiTmms <em>Wei Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PSCHImpl#getPPVVal <em>PPV Val</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PSCHImpl#getPhGndVal <em>Ph Gnd Val</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PSCHImpl#getRvAMod <em>Rv AMod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PSCHImpl#getRvATmms <em>Rv ATmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PSCHImpl#getRvRsTmms <em>Rv Rs Tmms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PSCHImpl extends GroupPImpl implements PSCH {
	/**
	 * The cached value of the '{@link #getProTx() <em>Pro Tx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProTx()
	 * @generated
	 * @ordered
	 */
	protected SPS proTx;

	/**
	 * The cached value of the '{@link #getProRx() <em>Pro Rx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProRx()
	 * @generated
	 * @ordered
	 */
	protected SPS proRx;

	/**
	 * The cached value of the '{@link #getStr() <em>Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStr()
	 * @generated
	 * @ordered
	 */
	protected ACD str;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected ACT op;

	/**
	 * The cached value of the '{@link #getCarRx() <em>Car Rx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarRx()
	 * @generated
	 * @ordered
	 */
	protected ACT carRx;

	/**
	 * The cached value of the '{@link #getLosOfGrd() <em>Los Of Grd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLosOfGrd()
	 * @generated
	 * @ordered
	 */
	protected SPS losOfGrd;

	/**
	 * The cached value of the '{@link #getEcho() <em>Echo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcho()
	 * @generated
	 * @ordered
	 */
	protected ACT echo;

	/**
	 * The cached value of the '{@link #getWeiOp() <em>Wei Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeiOp()
	 * @generated
	 * @ordered
	 */
	protected ACT weiOp;

	/**
	 * The cached value of the '{@link #getRvABlk() <em>Rv ABlk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRvABlk()
	 * @generated
	 * @ordered
	 */
	protected ACT rvABlk;

	/**
	 * The cached value of the '{@link #getGrdRx() <em>Grd Rx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrdRx()
	 * @generated
	 * @ordered
	 */
	protected SPS grdRx;

	/**
	 * The cached value of the '{@link #getSchTyp() <em>Sch Typ</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchTyp()
	 * @generated
	 * @ordered
	 */
	protected ING schTyp;

	/**
	 * The cached value of the '{@link #getOpDlTmms() <em>Op Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpDlTmms()
	 * @generated
	 * @ordered
	 */
	protected ING opDlTmms;

	/**
	 * The cached value of the '{@link #getCrdTmms() <em>Crd Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrdTmms()
	 * @generated
	 * @ordered
	 */
	protected ING crdTmms;

	/**
	 * The cached value of the '{@link #getDurTmms() <em>Dur Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurTmms()
	 * @generated
	 * @ordered
	 */
	protected ING durTmms;

	/**
	 * The cached value of the '{@link #getUnBlkMod() <em>Un Blk Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnBlkMod()
	 * @generated
	 * @ordered
	 */
	protected ING unBlkMod;

	/**
	 * The cached value of the '{@link #getSecTmms() <em>Sec Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecTmms()
	 * @generated
	 * @ordered
	 */
	protected ING secTmms;

	/**
	 * The cached value of the '{@link #getWeiMod() <em>Wei Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeiMod()
	 * @generated
	 * @ordered
	 */
	protected ING weiMod;

	/**
	 * The cached value of the '{@link #getWeiTmms() <em>Wei Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeiTmms()
	 * @generated
	 * @ordered
	 */
	protected ING weiTmms;

	/**
	 * The cached value of the '{@link #getPPVVal() <em>PPV Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPPVVal()
	 * @generated
	 * @ordered
	 */
	protected ASG ppvVal;

	/**
	 * The cached value of the '{@link #getPhGndVal() <em>Ph Gnd Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhGndVal()
	 * @generated
	 * @ordered
	 */
	protected ASG phGndVal;

	/**
	 * The cached value of the '{@link #getRvAMod() <em>Rv AMod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRvAMod()
	 * @generated
	 * @ordered
	 */
	protected ING rvAMod;

	/**
	 * The cached value of the '{@link #getRvATmms() <em>Rv ATmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRvATmms()
	 * @generated
	 * @ordered
	 */
	protected ING rvATmms;

	/**
	 * The cached value of the '{@link #getRvRsTmms() <em>Rv Rs Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRvRsTmms()
	 * @generated
	 * @ordered
	 */
	protected ING rvRsTmms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSCHImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupPPackage.Literals.PSCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getProTx() {
		if (proTx != null && proTx.eIsProxy()) {
			InternalEObject oldProTx = (InternalEObject)proTx;
			proTx = (SPS)eResolveProxy(oldProTx);
			if (proTx != oldProTx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSCH__PRO_TX, oldProTx, proTx));
			}
		}
		return proTx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetProTx() {
		return proTx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProTx(SPS newProTx) {
		SPS oldProTx = proTx;
		proTx = newProTx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSCH__PRO_TX, oldProTx, proTx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getProRx() {
		if (proRx != null && proRx.eIsProxy()) {
			InternalEObject oldProRx = (InternalEObject)proRx;
			proRx = (SPS)eResolveProxy(oldProRx);
			if (proRx != oldProRx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSCH__PRO_RX, oldProRx, proRx));
			}
		}
		return proRx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetProRx() {
		return proRx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProRx(SPS newProRx) {
		SPS oldProRx = proRx;
		proRx = newProRx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSCH__PRO_RX, oldProRx, proRx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACD getStr() {
		if (str != null && str.eIsProxy()) {
			InternalEObject oldStr = (InternalEObject)str;
			str = (ACD)eResolveProxy(oldStr);
			if (str != oldStr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSCH__STR, oldStr, str));
			}
		}
		return str;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACD basicGetStr() {
		return str;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStr(ACD newStr) {
		ACD oldStr = str;
		str = newStr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSCH__STR, oldStr, str));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT getOp() {
		if (op != null && op.eIsProxy()) {
			InternalEObject oldOp = (InternalEObject)op;
			op = (ACT)eResolveProxy(oldOp);
			if (op != oldOp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSCH__OP, oldOp, op));
			}
		}
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT basicGetOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp(ACT newOp) {
		ACT oldOp = op;
		op = newOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSCH__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT getCarRx() {
		if (carRx != null && carRx.eIsProxy()) {
			InternalEObject oldCarRx = (InternalEObject)carRx;
			carRx = (ACT)eResolveProxy(oldCarRx);
			if (carRx != oldCarRx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSCH__CAR_RX, oldCarRx, carRx));
			}
		}
		return carRx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT basicGetCarRx() {
		return carRx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarRx(ACT newCarRx) {
		ACT oldCarRx = carRx;
		carRx = newCarRx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSCH__CAR_RX, oldCarRx, carRx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getLosOfGrd() {
		if (losOfGrd != null && losOfGrd.eIsProxy()) {
			InternalEObject oldLosOfGrd = (InternalEObject)losOfGrd;
			losOfGrd = (SPS)eResolveProxy(oldLosOfGrd);
			if (losOfGrd != oldLosOfGrd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSCH__LOS_OF_GRD, oldLosOfGrd, losOfGrd));
			}
		}
		return losOfGrd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetLosOfGrd() {
		return losOfGrd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLosOfGrd(SPS newLosOfGrd) {
		SPS oldLosOfGrd = losOfGrd;
		losOfGrd = newLosOfGrd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSCH__LOS_OF_GRD, oldLosOfGrd, losOfGrd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT getEcho() {
		if (echo != null && echo.eIsProxy()) {
			InternalEObject oldEcho = (InternalEObject)echo;
			echo = (ACT)eResolveProxy(oldEcho);
			if (echo != oldEcho) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSCH__ECHO, oldEcho, echo));
			}
		}
		return echo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT basicGetEcho() {
		return echo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcho(ACT newEcho) {
		ACT oldEcho = echo;
		echo = newEcho;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSCH__ECHO, oldEcho, echo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT getWeiOp() {
		if (weiOp != null && weiOp.eIsProxy()) {
			InternalEObject oldWeiOp = (InternalEObject)weiOp;
			weiOp = (ACT)eResolveProxy(oldWeiOp);
			if (weiOp != oldWeiOp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSCH__WEI_OP, oldWeiOp, weiOp));
			}
		}
		return weiOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT basicGetWeiOp() {
		return weiOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeiOp(ACT newWeiOp) {
		ACT oldWeiOp = weiOp;
		weiOp = newWeiOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSCH__WEI_OP, oldWeiOp, weiOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT getRvABlk() {
		if (rvABlk != null && rvABlk.eIsProxy()) {
			InternalEObject oldRvABlk = (InternalEObject)rvABlk;
			rvABlk = (ACT)eResolveProxy(oldRvABlk);
			if (rvABlk != oldRvABlk) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSCH__RV_ABLK, oldRvABlk, rvABlk));
			}
		}
		return rvABlk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT basicGetRvABlk() {
		return rvABlk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRvABlk(ACT newRvABlk) {
		ACT oldRvABlk = rvABlk;
		rvABlk = newRvABlk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSCH__RV_ABLK, oldRvABlk, rvABlk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getGrdRx() {
		if (grdRx != null && grdRx.eIsProxy()) {
			InternalEObject oldGrdRx = (InternalEObject)grdRx;
			grdRx = (SPS)eResolveProxy(oldGrdRx);
			if (grdRx != oldGrdRx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSCH__GRD_RX, oldGrdRx, grdRx));
			}
		}
		return grdRx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetGrdRx() {
		return grdRx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrdRx(SPS newGrdRx) {
		SPS oldGrdRx = grdRx;
		grdRx = newGrdRx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSCH__GRD_RX, oldGrdRx, grdRx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getSchTyp() {
		if (schTyp != null && schTyp.eIsProxy()) {
			InternalEObject oldSchTyp = (InternalEObject)schTyp;
			schTyp = (ING)eResolveProxy(oldSchTyp);
			if (schTyp != oldSchTyp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSCH__SCH_TYP, oldSchTyp, schTyp));
			}
		}
		return schTyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetSchTyp() {
		return schTyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchTyp(ING newSchTyp) {
		ING oldSchTyp = schTyp;
		schTyp = newSchTyp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSCH__SCH_TYP, oldSchTyp, schTyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getOpDlTmms() {
		if (opDlTmms != null && opDlTmms.eIsProxy()) {
			InternalEObject oldOpDlTmms = (InternalEObject)opDlTmms;
			opDlTmms = (ING)eResolveProxy(oldOpDlTmms);
			if (opDlTmms != oldOpDlTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSCH__OP_DL_TMMS, oldOpDlTmms, opDlTmms));
			}
		}
		return opDlTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetOpDlTmms() {
		return opDlTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpDlTmms(ING newOpDlTmms) {
		ING oldOpDlTmms = opDlTmms;
		opDlTmms = newOpDlTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSCH__OP_DL_TMMS, oldOpDlTmms, opDlTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getCrdTmms() {
		if (crdTmms != null && crdTmms.eIsProxy()) {
			InternalEObject oldCrdTmms = (InternalEObject)crdTmms;
			crdTmms = (ING)eResolveProxy(oldCrdTmms);
			if (crdTmms != oldCrdTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSCH__CRD_TMMS, oldCrdTmms, crdTmms));
			}
		}
		return crdTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetCrdTmms() {
		return crdTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrdTmms(ING newCrdTmms) {
		ING oldCrdTmms = crdTmms;
		crdTmms = newCrdTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSCH__CRD_TMMS, oldCrdTmms, crdTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getDurTmms() {
		if (durTmms != null && durTmms.eIsProxy()) {
			InternalEObject oldDurTmms = (InternalEObject)durTmms;
			durTmms = (ING)eResolveProxy(oldDurTmms);
			if (durTmms != oldDurTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSCH__DUR_TMMS, oldDurTmms, durTmms));
			}
		}
		return durTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetDurTmms() {
		return durTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurTmms(ING newDurTmms) {
		ING oldDurTmms = durTmms;
		durTmms = newDurTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSCH__DUR_TMMS, oldDurTmms, durTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getUnBlkMod() {
		if (unBlkMod != null && unBlkMod.eIsProxy()) {
			InternalEObject oldUnBlkMod = (InternalEObject)unBlkMod;
			unBlkMod = (ING)eResolveProxy(oldUnBlkMod);
			if (unBlkMod != oldUnBlkMod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSCH__UN_BLK_MOD, oldUnBlkMod, unBlkMod));
			}
		}
		return unBlkMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetUnBlkMod() {
		return unBlkMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnBlkMod(ING newUnBlkMod) {
		ING oldUnBlkMod = unBlkMod;
		unBlkMod = newUnBlkMod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSCH__UN_BLK_MOD, oldUnBlkMod, unBlkMod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getSecTmms() {
		if (secTmms != null && secTmms.eIsProxy()) {
			InternalEObject oldSecTmms = (InternalEObject)secTmms;
			secTmms = (ING)eResolveProxy(oldSecTmms);
			if (secTmms != oldSecTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSCH__SEC_TMMS, oldSecTmms, secTmms));
			}
		}
		return secTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetSecTmms() {
		return secTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecTmms(ING newSecTmms) {
		ING oldSecTmms = secTmms;
		secTmms = newSecTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSCH__SEC_TMMS, oldSecTmms, secTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getWeiMod() {
		if (weiMod != null && weiMod.eIsProxy()) {
			InternalEObject oldWeiMod = (InternalEObject)weiMod;
			weiMod = (ING)eResolveProxy(oldWeiMod);
			if (weiMod != oldWeiMod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSCH__WEI_MOD, oldWeiMod, weiMod));
			}
		}
		return weiMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetWeiMod() {
		return weiMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeiMod(ING newWeiMod) {
		ING oldWeiMod = weiMod;
		weiMod = newWeiMod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSCH__WEI_MOD, oldWeiMod, weiMod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getWeiTmms() {
		if (weiTmms != null && weiTmms.eIsProxy()) {
			InternalEObject oldWeiTmms = (InternalEObject)weiTmms;
			weiTmms = (ING)eResolveProxy(oldWeiTmms);
			if (weiTmms != oldWeiTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSCH__WEI_TMMS, oldWeiTmms, weiTmms));
			}
		}
		return weiTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetWeiTmms() {
		return weiTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeiTmms(ING newWeiTmms) {
		ING oldWeiTmms = weiTmms;
		weiTmms = newWeiTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSCH__WEI_TMMS, oldWeiTmms, weiTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getPPVVal() {
		if (ppvVal != null && ppvVal.eIsProxy()) {
			InternalEObject oldPPVVal = (InternalEObject)ppvVal;
			ppvVal = (ASG)eResolveProxy(oldPPVVal);
			if (ppvVal != oldPPVVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSCH__PPV_VAL, oldPPVVal, ppvVal));
			}
		}
		return ppvVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetPPVVal() {
		return ppvVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPPVVal(ASG newPPVVal) {
		ASG oldPPVVal = ppvVal;
		ppvVal = newPPVVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSCH__PPV_VAL, oldPPVVal, ppvVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getPhGndVal() {
		if (phGndVal != null && phGndVal.eIsProxy()) {
			InternalEObject oldPhGndVal = (InternalEObject)phGndVal;
			phGndVal = (ASG)eResolveProxy(oldPhGndVal);
			if (phGndVal != oldPhGndVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSCH__PH_GND_VAL, oldPhGndVal, phGndVal));
			}
		}
		return phGndVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetPhGndVal() {
		return phGndVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhGndVal(ASG newPhGndVal) {
		ASG oldPhGndVal = phGndVal;
		phGndVal = newPhGndVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSCH__PH_GND_VAL, oldPhGndVal, phGndVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getRvAMod() {
		if (rvAMod != null && rvAMod.eIsProxy()) {
			InternalEObject oldRvAMod = (InternalEObject)rvAMod;
			rvAMod = (ING)eResolveProxy(oldRvAMod);
			if (rvAMod != oldRvAMod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSCH__RV_AMOD, oldRvAMod, rvAMod));
			}
		}
		return rvAMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetRvAMod() {
		return rvAMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRvAMod(ING newRvAMod) {
		ING oldRvAMod = rvAMod;
		rvAMod = newRvAMod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSCH__RV_AMOD, oldRvAMod, rvAMod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getRvATmms() {
		if (rvATmms != null && rvATmms.eIsProxy()) {
			InternalEObject oldRvATmms = (InternalEObject)rvATmms;
			rvATmms = (ING)eResolveProxy(oldRvATmms);
			if (rvATmms != oldRvATmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSCH__RV_ATMMS, oldRvATmms, rvATmms));
			}
		}
		return rvATmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetRvATmms() {
		return rvATmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRvATmms(ING newRvATmms) {
		ING oldRvATmms = rvATmms;
		rvATmms = newRvATmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSCH__RV_ATMMS, oldRvATmms, rvATmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getRvRsTmms() {
		if (rvRsTmms != null && rvRsTmms.eIsProxy()) {
			InternalEObject oldRvRsTmms = (InternalEObject)rvRsTmms;
			rvRsTmms = (ING)eResolveProxy(oldRvRsTmms);
			if (rvRsTmms != oldRvRsTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSCH__RV_RS_TMMS, oldRvRsTmms, rvRsTmms));
			}
		}
		return rvRsTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetRvRsTmms() {
		return rvRsTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRvRsTmms(ING newRvRsTmms) {
		ING oldRvRsTmms = rvRsTmms;
		rvRsTmms = newRvRsTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSCH__RV_RS_TMMS, oldRvRsTmms, rvRsTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupPPackage.PSCH__PRO_TX:
				if (resolve) return getProTx();
				return basicGetProTx();
			case LNGroupPPackage.PSCH__PRO_RX:
				if (resolve) return getProRx();
				return basicGetProRx();
			case LNGroupPPackage.PSCH__STR:
				if (resolve) return getStr();
				return basicGetStr();
			case LNGroupPPackage.PSCH__OP:
				if (resolve) return getOp();
				return basicGetOp();
			case LNGroupPPackage.PSCH__CAR_RX:
				if (resolve) return getCarRx();
				return basicGetCarRx();
			case LNGroupPPackage.PSCH__LOS_OF_GRD:
				if (resolve) return getLosOfGrd();
				return basicGetLosOfGrd();
			case LNGroupPPackage.PSCH__ECHO:
				if (resolve) return getEcho();
				return basicGetEcho();
			case LNGroupPPackage.PSCH__WEI_OP:
				if (resolve) return getWeiOp();
				return basicGetWeiOp();
			case LNGroupPPackage.PSCH__RV_ABLK:
				if (resolve) return getRvABlk();
				return basicGetRvABlk();
			case LNGroupPPackage.PSCH__GRD_RX:
				if (resolve) return getGrdRx();
				return basicGetGrdRx();
			case LNGroupPPackage.PSCH__SCH_TYP:
				if (resolve) return getSchTyp();
				return basicGetSchTyp();
			case LNGroupPPackage.PSCH__OP_DL_TMMS:
				if (resolve) return getOpDlTmms();
				return basicGetOpDlTmms();
			case LNGroupPPackage.PSCH__CRD_TMMS:
				if (resolve) return getCrdTmms();
				return basicGetCrdTmms();
			case LNGroupPPackage.PSCH__DUR_TMMS:
				if (resolve) return getDurTmms();
				return basicGetDurTmms();
			case LNGroupPPackage.PSCH__UN_BLK_MOD:
				if (resolve) return getUnBlkMod();
				return basicGetUnBlkMod();
			case LNGroupPPackage.PSCH__SEC_TMMS:
				if (resolve) return getSecTmms();
				return basicGetSecTmms();
			case LNGroupPPackage.PSCH__WEI_MOD:
				if (resolve) return getWeiMod();
				return basicGetWeiMod();
			case LNGroupPPackage.PSCH__WEI_TMMS:
				if (resolve) return getWeiTmms();
				return basicGetWeiTmms();
			case LNGroupPPackage.PSCH__PPV_VAL:
				if (resolve) return getPPVVal();
				return basicGetPPVVal();
			case LNGroupPPackage.PSCH__PH_GND_VAL:
				if (resolve) return getPhGndVal();
				return basicGetPhGndVal();
			case LNGroupPPackage.PSCH__RV_AMOD:
				if (resolve) return getRvAMod();
				return basicGetRvAMod();
			case LNGroupPPackage.PSCH__RV_ATMMS:
				if (resolve) return getRvATmms();
				return basicGetRvATmms();
			case LNGroupPPackage.PSCH__RV_RS_TMMS:
				if (resolve) return getRvRsTmms();
				return basicGetRvRsTmms();
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
			case LNGroupPPackage.PSCH__PRO_TX:
				setProTx((SPS)newValue);
				return;
			case LNGroupPPackage.PSCH__PRO_RX:
				setProRx((SPS)newValue);
				return;
			case LNGroupPPackage.PSCH__STR:
				setStr((ACD)newValue);
				return;
			case LNGroupPPackage.PSCH__OP:
				setOp((ACT)newValue);
				return;
			case LNGroupPPackage.PSCH__CAR_RX:
				setCarRx((ACT)newValue);
				return;
			case LNGroupPPackage.PSCH__LOS_OF_GRD:
				setLosOfGrd((SPS)newValue);
				return;
			case LNGroupPPackage.PSCH__ECHO:
				setEcho((ACT)newValue);
				return;
			case LNGroupPPackage.PSCH__WEI_OP:
				setWeiOp((ACT)newValue);
				return;
			case LNGroupPPackage.PSCH__RV_ABLK:
				setRvABlk((ACT)newValue);
				return;
			case LNGroupPPackage.PSCH__GRD_RX:
				setGrdRx((SPS)newValue);
				return;
			case LNGroupPPackage.PSCH__SCH_TYP:
				setSchTyp((ING)newValue);
				return;
			case LNGroupPPackage.PSCH__OP_DL_TMMS:
				setOpDlTmms((ING)newValue);
				return;
			case LNGroupPPackage.PSCH__CRD_TMMS:
				setCrdTmms((ING)newValue);
				return;
			case LNGroupPPackage.PSCH__DUR_TMMS:
				setDurTmms((ING)newValue);
				return;
			case LNGroupPPackage.PSCH__UN_BLK_MOD:
				setUnBlkMod((ING)newValue);
				return;
			case LNGroupPPackage.PSCH__SEC_TMMS:
				setSecTmms((ING)newValue);
				return;
			case LNGroupPPackage.PSCH__WEI_MOD:
				setWeiMod((ING)newValue);
				return;
			case LNGroupPPackage.PSCH__WEI_TMMS:
				setWeiTmms((ING)newValue);
				return;
			case LNGroupPPackage.PSCH__PPV_VAL:
				setPPVVal((ASG)newValue);
				return;
			case LNGroupPPackage.PSCH__PH_GND_VAL:
				setPhGndVal((ASG)newValue);
				return;
			case LNGroupPPackage.PSCH__RV_AMOD:
				setRvAMod((ING)newValue);
				return;
			case LNGroupPPackage.PSCH__RV_ATMMS:
				setRvATmms((ING)newValue);
				return;
			case LNGroupPPackage.PSCH__RV_RS_TMMS:
				setRvRsTmms((ING)newValue);
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
			case LNGroupPPackage.PSCH__PRO_TX:
				setProTx((SPS)null);
				return;
			case LNGroupPPackage.PSCH__PRO_RX:
				setProRx((SPS)null);
				return;
			case LNGroupPPackage.PSCH__STR:
				setStr((ACD)null);
				return;
			case LNGroupPPackage.PSCH__OP:
				setOp((ACT)null);
				return;
			case LNGroupPPackage.PSCH__CAR_RX:
				setCarRx((ACT)null);
				return;
			case LNGroupPPackage.PSCH__LOS_OF_GRD:
				setLosOfGrd((SPS)null);
				return;
			case LNGroupPPackage.PSCH__ECHO:
				setEcho((ACT)null);
				return;
			case LNGroupPPackage.PSCH__WEI_OP:
				setWeiOp((ACT)null);
				return;
			case LNGroupPPackage.PSCH__RV_ABLK:
				setRvABlk((ACT)null);
				return;
			case LNGroupPPackage.PSCH__GRD_RX:
				setGrdRx((SPS)null);
				return;
			case LNGroupPPackage.PSCH__SCH_TYP:
				setSchTyp((ING)null);
				return;
			case LNGroupPPackage.PSCH__OP_DL_TMMS:
				setOpDlTmms((ING)null);
				return;
			case LNGroupPPackage.PSCH__CRD_TMMS:
				setCrdTmms((ING)null);
				return;
			case LNGroupPPackage.PSCH__DUR_TMMS:
				setDurTmms((ING)null);
				return;
			case LNGroupPPackage.PSCH__UN_BLK_MOD:
				setUnBlkMod((ING)null);
				return;
			case LNGroupPPackage.PSCH__SEC_TMMS:
				setSecTmms((ING)null);
				return;
			case LNGroupPPackage.PSCH__WEI_MOD:
				setWeiMod((ING)null);
				return;
			case LNGroupPPackage.PSCH__WEI_TMMS:
				setWeiTmms((ING)null);
				return;
			case LNGroupPPackage.PSCH__PPV_VAL:
				setPPVVal((ASG)null);
				return;
			case LNGroupPPackage.PSCH__PH_GND_VAL:
				setPhGndVal((ASG)null);
				return;
			case LNGroupPPackage.PSCH__RV_AMOD:
				setRvAMod((ING)null);
				return;
			case LNGroupPPackage.PSCH__RV_ATMMS:
				setRvATmms((ING)null);
				return;
			case LNGroupPPackage.PSCH__RV_RS_TMMS:
				setRvRsTmms((ING)null);
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
			case LNGroupPPackage.PSCH__PRO_TX:
				return proTx != null;
			case LNGroupPPackage.PSCH__PRO_RX:
				return proRx != null;
			case LNGroupPPackage.PSCH__STR:
				return str != null;
			case LNGroupPPackage.PSCH__OP:
				return op != null;
			case LNGroupPPackage.PSCH__CAR_RX:
				return carRx != null;
			case LNGroupPPackage.PSCH__LOS_OF_GRD:
				return losOfGrd != null;
			case LNGroupPPackage.PSCH__ECHO:
				return echo != null;
			case LNGroupPPackage.PSCH__WEI_OP:
				return weiOp != null;
			case LNGroupPPackage.PSCH__RV_ABLK:
				return rvABlk != null;
			case LNGroupPPackage.PSCH__GRD_RX:
				return grdRx != null;
			case LNGroupPPackage.PSCH__SCH_TYP:
				return schTyp != null;
			case LNGroupPPackage.PSCH__OP_DL_TMMS:
				return opDlTmms != null;
			case LNGroupPPackage.PSCH__CRD_TMMS:
				return crdTmms != null;
			case LNGroupPPackage.PSCH__DUR_TMMS:
				return durTmms != null;
			case LNGroupPPackage.PSCH__UN_BLK_MOD:
				return unBlkMod != null;
			case LNGroupPPackage.PSCH__SEC_TMMS:
				return secTmms != null;
			case LNGroupPPackage.PSCH__WEI_MOD:
				return weiMod != null;
			case LNGroupPPackage.PSCH__WEI_TMMS:
				return weiTmms != null;
			case LNGroupPPackage.PSCH__PPV_VAL:
				return ppvVal != null;
			case LNGroupPPackage.PSCH__PH_GND_VAL:
				return phGndVal != null;
			case LNGroupPPackage.PSCH__RV_AMOD:
				return rvAMod != null;
			case LNGroupPPackage.PSCH__RV_ATMMS:
				return rvATmms != null;
			case LNGroupPPackage.PSCH__RV_RS_TMMS:
				return rvRsTmms != null;
		}
		return super.eIsSet(featureID);
	}

} //PSCHImpl
