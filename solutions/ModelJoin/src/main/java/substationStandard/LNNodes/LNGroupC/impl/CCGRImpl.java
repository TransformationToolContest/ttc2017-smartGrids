/**
 */
package substationStandard.LNNodes.LNGroupC.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.DPL;
import substationStandard.Dataclasses.INC;
import substationStandard.Dataclasses.ING;
import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.MV;
import substationStandard.Dataclasses.SPC;
import substationStandard.Dataclasses.SPS;

import substationStandard.LNNodes.LNGroupC.CCGR;
import substationStandard.LNNodes.LNGroupC.LNGroupCPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CCGR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.impl.CCGRImpl#getEEHealth <em>EE Health</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.impl.CCGRImpl#getEEName <em>EE Name</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.impl.CCGRImpl#getOpTmh <em>Op Tmh</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.impl.CCGRImpl#getEnvTmp <em>Env Tmp</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.impl.CCGRImpl#getOilTmpIn <em>Oil Tmp In</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.impl.CCGRImpl#getOilTmpOut <em>Oil Tmp Out</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.impl.CCGRImpl#getOilMotA <em>Oil Mot A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.impl.CCGRImpl#getFanFlw <em>Fan Flw</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.impl.CCGRImpl#getFanA <em>Fan A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.impl.CCGRImpl#getCECtl <em>CE Ctl</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.impl.CCGRImpl#getPmpCtlGen <em>Pmp Ctl Gen</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.impl.CCGRImpl#getPmpCtl <em>Pmp Ctl</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.impl.CCGRImpl#getFanCtlGen <em>Fan Ctl Gen</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.impl.CCGRImpl#getFanCtl <em>Fan Ctl</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.impl.CCGRImpl#getAuto <em>Auto</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.impl.CCGRImpl#getFanOvCur <em>Fan Ov Cur</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.impl.CCGRImpl#getPmpOvCur <em>Pmp Ov Cur</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.impl.CCGRImpl#getPmpAlm <em>Pmp Alm</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.impl.CCGRImpl#getOilTmpSet <em>Oil Tmp Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CCGRImpl extends GroupCImpl implements CCGR {
	/**
	 * The cached value of the '{@link #getEEHealth() <em>EE Health</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEEHealth()
	 * @generated
	 * @ordered
	 */
	protected ING eeHealth;

	/**
	 * The cached value of the '{@link #getEEName() <em>EE Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEEName()
	 * @generated
	 * @ordered
	 */
	protected DPL eeName;

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
	 * The cached value of the '{@link #getEnvTmp() <em>Env Tmp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvTmp()
	 * @generated
	 * @ordered
	 */
	protected MV envTmp;

	/**
	 * The cached value of the '{@link #getOilTmpIn() <em>Oil Tmp In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilTmpIn()
	 * @generated
	 * @ordered
	 */
	protected MV oilTmpIn;

	/**
	 * The cached value of the '{@link #getOilTmpOut() <em>Oil Tmp Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilTmpOut()
	 * @generated
	 * @ordered
	 */
	protected MV oilTmpOut;

	/**
	 * The cached value of the '{@link #getOilMotA() <em>Oil Mot A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilMotA()
	 * @generated
	 * @ordered
	 */
	protected MV oilMotA;

	/**
	 * The cached value of the '{@link #getFanFlw() <em>Fan Flw</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFanFlw()
	 * @generated
	 * @ordered
	 */
	protected MV fanFlw;

	/**
	 * The cached value of the '{@link #getFanA() <em>Fan A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFanA()
	 * @generated
	 * @ordered
	 */
	protected MV fanA;

	/**
	 * The cached value of the '{@link #getCECtl() <em>CE Ctl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCECtl()
	 * @generated
	 * @ordered
	 */
	protected SPC ceCtl;

	/**
	 * The cached value of the '{@link #getPmpCtlGen() <em>Pmp Ctl Gen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPmpCtlGen()
	 * @generated
	 * @ordered
	 */
	protected INC pmpCtlGen;

	/**
	 * The cached value of the '{@link #getPmpCtl() <em>Pmp Ctl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPmpCtl()
	 * @generated
	 * @ordered
	 */
	protected INC pmpCtl;

	/**
	 * The cached value of the '{@link #getFanCtlGen() <em>Fan Ctl Gen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFanCtlGen()
	 * @generated
	 * @ordered
	 */
	protected INC fanCtlGen;

	/**
	 * The cached value of the '{@link #getFanCtl() <em>Fan Ctl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFanCtl()
	 * @generated
	 * @ordered
	 */
	protected INC fanCtl;

	/**
	 * The cached value of the '{@link #getAuto() <em>Auto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuto()
	 * @generated
	 * @ordered
	 */
	protected SPS auto;

	/**
	 * The cached value of the '{@link #getFanOvCur() <em>Fan Ov Cur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFanOvCur()
	 * @generated
	 * @ordered
	 */
	protected SPS fanOvCur;

	/**
	 * The cached value of the '{@link #getPmpOvCur() <em>Pmp Ov Cur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPmpOvCur()
	 * @generated
	 * @ordered
	 */
	protected SPS pmpOvCur;

	/**
	 * The cached value of the '{@link #getPmpAlm() <em>Pmp Alm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPmpAlm()
	 * @generated
	 * @ordered
	 */
	protected SPS pmpAlm;

	/**
	 * The cached value of the '{@link #getOilTmpSet() <em>Oil Tmp Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilTmpSet()
	 * @generated
	 * @ordered
	 */
	protected ASG oilTmpSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CCGRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupCPackage.Literals.CCGR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getEEHealth() {
		if (eeHealth != null && eeHealth.eIsProxy()) {
			InternalEObject oldEEHealth = (InternalEObject)eeHealth;
			eeHealth = (ING)eResolveProxy(oldEEHealth);
			if (eeHealth != oldEEHealth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CCGR__EE_HEALTH, oldEEHealth, eeHealth));
			}
		}
		return eeHealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetEEHealth() {
		return eeHealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEEHealth(ING newEEHealth) {
		ING oldEEHealth = eeHealth;
		eeHealth = newEEHealth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CCGR__EE_HEALTH, oldEEHealth, eeHealth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPL getEEName() {
		if (eeName != null && eeName.eIsProxy()) {
			InternalEObject oldEEName = (InternalEObject)eeName;
			eeName = (DPL)eResolveProxy(oldEEName);
			if (eeName != oldEEName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CCGR__EE_NAME, oldEEName, eeName));
			}
		}
		return eeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPL basicGetEEName() {
		return eeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEEName(DPL newEEName) {
		DPL oldEEName = eeName;
		eeName = newEEName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CCGR__EE_NAME, oldEEName, eeName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CCGR__OP_TMH, oldOpTmh, opTmh));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CCGR__OP_TMH, oldOpTmh, opTmh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getEnvTmp() {
		if (envTmp != null && envTmp.eIsProxy()) {
			InternalEObject oldEnvTmp = (InternalEObject)envTmp;
			envTmp = (MV)eResolveProxy(oldEnvTmp);
			if (envTmp != oldEnvTmp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CCGR__ENV_TMP, oldEnvTmp, envTmp));
			}
		}
		return envTmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetEnvTmp() {
		return envTmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvTmp(MV newEnvTmp) {
		MV oldEnvTmp = envTmp;
		envTmp = newEnvTmp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CCGR__ENV_TMP, oldEnvTmp, envTmp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getOilTmpIn() {
		if (oilTmpIn != null && oilTmpIn.eIsProxy()) {
			InternalEObject oldOilTmpIn = (InternalEObject)oilTmpIn;
			oilTmpIn = (MV)eResolveProxy(oldOilTmpIn);
			if (oilTmpIn != oldOilTmpIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CCGR__OIL_TMP_IN, oldOilTmpIn, oilTmpIn));
			}
		}
		return oilTmpIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetOilTmpIn() {
		return oilTmpIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOilTmpIn(MV newOilTmpIn) {
		MV oldOilTmpIn = oilTmpIn;
		oilTmpIn = newOilTmpIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CCGR__OIL_TMP_IN, oldOilTmpIn, oilTmpIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getOilTmpOut() {
		if (oilTmpOut != null && oilTmpOut.eIsProxy()) {
			InternalEObject oldOilTmpOut = (InternalEObject)oilTmpOut;
			oilTmpOut = (MV)eResolveProxy(oldOilTmpOut);
			if (oilTmpOut != oldOilTmpOut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CCGR__OIL_TMP_OUT, oldOilTmpOut, oilTmpOut));
			}
		}
		return oilTmpOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetOilTmpOut() {
		return oilTmpOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOilTmpOut(MV newOilTmpOut) {
		MV oldOilTmpOut = oilTmpOut;
		oilTmpOut = newOilTmpOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CCGR__OIL_TMP_OUT, oldOilTmpOut, oilTmpOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getOilMotA() {
		if (oilMotA != null && oilMotA.eIsProxy()) {
			InternalEObject oldOilMotA = (InternalEObject)oilMotA;
			oilMotA = (MV)eResolveProxy(oldOilMotA);
			if (oilMotA != oldOilMotA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CCGR__OIL_MOT_A, oldOilMotA, oilMotA));
			}
		}
		return oilMotA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetOilMotA() {
		return oilMotA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOilMotA(MV newOilMotA) {
		MV oldOilMotA = oilMotA;
		oilMotA = newOilMotA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CCGR__OIL_MOT_A, oldOilMotA, oilMotA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getFanFlw() {
		if (fanFlw != null && fanFlw.eIsProxy()) {
			InternalEObject oldFanFlw = (InternalEObject)fanFlw;
			fanFlw = (MV)eResolveProxy(oldFanFlw);
			if (fanFlw != oldFanFlw) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CCGR__FAN_FLW, oldFanFlw, fanFlw));
			}
		}
		return fanFlw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetFanFlw() {
		return fanFlw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFanFlw(MV newFanFlw) {
		MV oldFanFlw = fanFlw;
		fanFlw = newFanFlw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CCGR__FAN_FLW, oldFanFlw, fanFlw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getFanA() {
		if (fanA != null && fanA.eIsProxy()) {
			InternalEObject oldFanA = (InternalEObject)fanA;
			fanA = (MV)eResolveProxy(oldFanA);
			if (fanA != oldFanA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CCGR__FAN_A, oldFanA, fanA));
			}
		}
		return fanA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetFanA() {
		return fanA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFanA(MV newFanA) {
		MV oldFanA = fanA;
		fanA = newFanA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CCGR__FAN_A, oldFanA, fanA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getCECtl() {
		if (ceCtl != null && ceCtl.eIsProxy()) {
			InternalEObject oldCECtl = (InternalEObject)ceCtl;
			ceCtl = (SPC)eResolveProxy(oldCECtl);
			if (ceCtl != oldCECtl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CCGR__CE_CTL, oldCECtl, ceCtl));
			}
		}
		return ceCtl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetCECtl() {
		return ceCtl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCECtl(SPC newCECtl) {
		SPC oldCECtl = ceCtl;
		ceCtl = newCECtl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CCGR__CE_CTL, oldCECtl, ceCtl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INC getPmpCtlGen() {
		if (pmpCtlGen != null && pmpCtlGen.eIsProxy()) {
			InternalEObject oldPmpCtlGen = (InternalEObject)pmpCtlGen;
			pmpCtlGen = (INC)eResolveProxy(oldPmpCtlGen);
			if (pmpCtlGen != oldPmpCtlGen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CCGR__PMP_CTL_GEN, oldPmpCtlGen, pmpCtlGen));
			}
		}
		return pmpCtlGen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INC basicGetPmpCtlGen() {
		return pmpCtlGen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPmpCtlGen(INC newPmpCtlGen) {
		INC oldPmpCtlGen = pmpCtlGen;
		pmpCtlGen = newPmpCtlGen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CCGR__PMP_CTL_GEN, oldPmpCtlGen, pmpCtlGen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INC getPmpCtl() {
		if (pmpCtl != null && pmpCtl.eIsProxy()) {
			InternalEObject oldPmpCtl = (InternalEObject)pmpCtl;
			pmpCtl = (INC)eResolveProxy(oldPmpCtl);
			if (pmpCtl != oldPmpCtl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CCGR__PMP_CTL, oldPmpCtl, pmpCtl));
			}
		}
		return pmpCtl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INC basicGetPmpCtl() {
		return pmpCtl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPmpCtl(INC newPmpCtl) {
		INC oldPmpCtl = pmpCtl;
		pmpCtl = newPmpCtl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CCGR__PMP_CTL, oldPmpCtl, pmpCtl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INC getFanCtlGen() {
		if (fanCtlGen != null && fanCtlGen.eIsProxy()) {
			InternalEObject oldFanCtlGen = (InternalEObject)fanCtlGen;
			fanCtlGen = (INC)eResolveProxy(oldFanCtlGen);
			if (fanCtlGen != oldFanCtlGen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CCGR__FAN_CTL_GEN, oldFanCtlGen, fanCtlGen));
			}
		}
		return fanCtlGen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INC basicGetFanCtlGen() {
		return fanCtlGen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFanCtlGen(INC newFanCtlGen) {
		INC oldFanCtlGen = fanCtlGen;
		fanCtlGen = newFanCtlGen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CCGR__FAN_CTL_GEN, oldFanCtlGen, fanCtlGen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INC getFanCtl() {
		if (fanCtl != null && fanCtl.eIsProxy()) {
			InternalEObject oldFanCtl = (InternalEObject)fanCtl;
			fanCtl = (INC)eResolveProxy(oldFanCtl);
			if (fanCtl != oldFanCtl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CCGR__FAN_CTL, oldFanCtl, fanCtl));
			}
		}
		return fanCtl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INC basicGetFanCtl() {
		return fanCtl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFanCtl(INC newFanCtl) {
		INC oldFanCtl = fanCtl;
		fanCtl = newFanCtl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CCGR__FAN_CTL, oldFanCtl, fanCtl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getAuto() {
		if (auto != null && auto.eIsProxy()) {
			InternalEObject oldAuto = (InternalEObject)auto;
			auto = (SPS)eResolveProxy(oldAuto);
			if (auto != oldAuto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CCGR__AUTO, oldAuto, auto));
			}
		}
		return auto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetAuto() {
		return auto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuto(SPS newAuto) {
		SPS oldAuto = auto;
		auto = newAuto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CCGR__AUTO, oldAuto, auto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getFanOvCur() {
		if (fanOvCur != null && fanOvCur.eIsProxy()) {
			InternalEObject oldFanOvCur = (InternalEObject)fanOvCur;
			fanOvCur = (SPS)eResolveProxy(oldFanOvCur);
			if (fanOvCur != oldFanOvCur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CCGR__FAN_OV_CUR, oldFanOvCur, fanOvCur));
			}
		}
		return fanOvCur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetFanOvCur() {
		return fanOvCur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFanOvCur(SPS newFanOvCur) {
		SPS oldFanOvCur = fanOvCur;
		fanOvCur = newFanOvCur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CCGR__FAN_OV_CUR, oldFanOvCur, fanOvCur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getPmpOvCur() {
		if (pmpOvCur != null && pmpOvCur.eIsProxy()) {
			InternalEObject oldPmpOvCur = (InternalEObject)pmpOvCur;
			pmpOvCur = (SPS)eResolveProxy(oldPmpOvCur);
			if (pmpOvCur != oldPmpOvCur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CCGR__PMP_OV_CUR, oldPmpOvCur, pmpOvCur));
			}
		}
		return pmpOvCur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetPmpOvCur() {
		return pmpOvCur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPmpOvCur(SPS newPmpOvCur) {
		SPS oldPmpOvCur = pmpOvCur;
		pmpOvCur = newPmpOvCur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CCGR__PMP_OV_CUR, oldPmpOvCur, pmpOvCur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getPmpAlm() {
		if (pmpAlm != null && pmpAlm.eIsProxy()) {
			InternalEObject oldPmpAlm = (InternalEObject)pmpAlm;
			pmpAlm = (SPS)eResolveProxy(oldPmpAlm);
			if (pmpAlm != oldPmpAlm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CCGR__PMP_ALM, oldPmpAlm, pmpAlm));
			}
		}
		return pmpAlm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetPmpAlm() {
		return pmpAlm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPmpAlm(SPS newPmpAlm) {
		SPS oldPmpAlm = pmpAlm;
		pmpAlm = newPmpAlm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CCGR__PMP_ALM, oldPmpAlm, pmpAlm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getOilTmpSet() {
		if (oilTmpSet != null && oilTmpSet.eIsProxy()) {
			InternalEObject oldOilTmpSet = (InternalEObject)oilTmpSet;
			oilTmpSet = (ASG)eResolveProxy(oldOilTmpSet);
			if (oilTmpSet != oldOilTmpSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CCGR__OIL_TMP_SET, oldOilTmpSet, oilTmpSet));
			}
		}
		return oilTmpSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetOilTmpSet() {
		return oilTmpSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOilTmpSet(ASG newOilTmpSet) {
		ASG oldOilTmpSet = oilTmpSet;
		oilTmpSet = newOilTmpSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CCGR__OIL_TMP_SET, oldOilTmpSet, oilTmpSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupCPackage.CCGR__EE_HEALTH:
				if (resolve) return getEEHealth();
				return basicGetEEHealth();
			case LNGroupCPackage.CCGR__EE_NAME:
				if (resolve) return getEEName();
				return basicGetEEName();
			case LNGroupCPackage.CCGR__OP_TMH:
				if (resolve) return getOpTmh();
				return basicGetOpTmh();
			case LNGroupCPackage.CCGR__ENV_TMP:
				if (resolve) return getEnvTmp();
				return basicGetEnvTmp();
			case LNGroupCPackage.CCGR__OIL_TMP_IN:
				if (resolve) return getOilTmpIn();
				return basicGetOilTmpIn();
			case LNGroupCPackage.CCGR__OIL_TMP_OUT:
				if (resolve) return getOilTmpOut();
				return basicGetOilTmpOut();
			case LNGroupCPackage.CCGR__OIL_MOT_A:
				if (resolve) return getOilMotA();
				return basicGetOilMotA();
			case LNGroupCPackage.CCGR__FAN_FLW:
				if (resolve) return getFanFlw();
				return basicGetFanFlw();
			case LNGroupCPackage.CCGR__FAN_A:
				if (resolve) return getFanA();
				return basicGetFanA();
			case LNGroupCPackage.CCGR__CE_CTL:
				if (resolve) return getCECtl();
				return basicGetCECtl();
			case LNGroupCPackage.CCGR__PMP_CTL_GEN:
				if (resolve) return getPmpCtlGen();
				return basicGetPmpCtlGen();
			case LNGroupCPackage.CCGR__PMP_CTL:
				if (resolve) return getPmpCtl();
				return basicGetPmpCtl();
			case LNGroupCPackage.CCGR__FAN_CTL_GEN:
				if (resolve) return getFanCtlGen();
				return basicGetFanCtlGen();
			case LNGroupCPackage.CCGR__FAN_CTL:
				if (resolve) return getFanCtl();
				return basicGetFanCtl();
			case LNGroupCPackage.CCGR__AUTO:
				if (resolve) return getAuto();
				return basicGetAuto();
			case LNGroupCPackage.CCGR__FAN_OV_CUR:
				if (resolve) return getFanOvCur();
				return basicGetFanOvCur();
			case LNGroupCPackage.CCGR__PMP_OV_CUR:
				if (resolve) return getPmpOvCur();
				return basicGetPmpOvCur();
			case LNGroupCPackage.CCGR__PMP_ALM:
				if (resolve) return getPmpAlm();
				return basicGetPmpAlm();
			case LNGroupCPackage.CCGR__OIL_TMP_SET:
				if (resolve) return getOilTmpSet();
				return basicGetOilTmpSet();
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
			case LNGroupCPackage.CCGR__EE_HEALTH:
				setEEHealth((ING)newValue);
				return;
			case LNGroupCPackage.CCGR__EE_NAME:
				setEEName((DPL)newValue);
				return;
			case LNGroupCPackage.CCGR__OP_TMH:
				setOpTmh((INS)newValue);
				return;
			case LNGroupCPackage.CCGR__ENV_TMP:
				setEnvTmp((MV)newValue);
				return;
			case LNGroupCPackage.CCGR__OIL_TMP_IN:
				setOilTmpIn((MV)newValue);
				return;
			case LNGroupCPackage.CCGR__OIL_TMP_OUT:
				setOilTmpOut((MV)newValue);
				return;
			case LNGroupCPackage.CCGR__OIL_MOT_A:
				setOilMotA((MV)newValue);
				return;
			case LNGroupCPackage.CCGR__FAN_FLW:
				setFanFlw((MV)newValue);
				return;
			case LNGroupCPackage.CCGR__FAN_A:
				setFanA((MV)newValue);
				return;
			case LNGroupCPackage.CCGR__CE_CTL:
				setCECtl((SPC)newValue);
				return;
			case LNGroupCPackage.CCGR__PMP_CTL_GEN:
				setPmpCtlGen((INC)newValue);
				return;
			case LNGroupCPackage.CCGR__PMP_CTL:
				setPmpCtl((INC)newValue);
				return;
			case LNGroupCPackage.CCGR__FAN_CTL_GEN:
				setFanCtlGen((INC)newValue);
				return;
			case LNGroupCPackage.CCGR__FAN_CTL:
				setFanCtl((INC)newValue);
				return;
			case LNGroupCPackage.CCGR__AUTO:
				setAuto((SPS)newValue);
				return;
			case LNGroupCPackage.CCGR__FAN_OV_CUR:
				setFanOvCur((SPS)newValue);
				return;
			case LNGroupCPackage.CCGR__PMP_OV_CUR:
				setPmpOvCur((SPS)newValue);
				return;
			case LNGroupCPackage.CCGR__PMP_ALM:
				setPmpAlm((SPS)newValue);
				return;
			case LNGroupCPackage.CCGR__OIL_TMP_SET:
				setOilTmpSet((ASG)newValue);
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
			case LNGroupCPackage.CCGR__EE_HEALTH:
				setEEHealth((ING)null);
				return;
			case LNGroupCPackage.CCGR__EE_NAME:
				setEEName((DPL)null);
				return;
			case LNGroupCPackage.CCGR__OP_TMH:
				setOpTmh((INS)null);
				return;
			case LNGroupCPackage.CCGR__ENV_TMP:
				setEnvTmp((MV)null);
				return;
			case LNGroupCPackage.CCGR__OIL_TMP_IN:
				setOilTmpIn((MV)null);
				return;
			case LNGroupCPackage.CCGR__OIL_TMP_OUT:
				setOilTmpOut((MV)null);
				return;
			case LNGroupCPackage.CCGR__OIL_MOT_A:
				setOilMotA((MV)null);
				return;
			case LNGroupCPackage.CCGR__FAN_FLW:
				setFanFlw((MV)null);
				return;
			case LNGroupCPackage.CCGR__FAN_A:
				setFanA((MV)null);
				return;
			case LNGroupCPackage.CCGR__CE_CTL:
				setCECtl((SPC)null);
				return;
			case LNGroupCPackage.CCGR__PMP_CTL_GEN:
				setPmpCtlGen((INC)null);
				return;
			case LNGroupCPackage.CCGR__PMP_CTL:
				setPmpCtl((INC)null);
				return;
			case LNGroupCPackage.CCGR__FAN_CTL_GEN:
				setFanCtlGen((INC)null);
				return;
			case LNGroupCPackage.CCGR__FAN_CTL:
				setFanCtl((INC)null);
				return;
			case LNGroupCPackage.CCGR__AUTO:
				setAuto((SPS)null);
				return;
			case LNGroupCPackage.CCGR__FAN_OV_CUR:
				setFanOvCur((SPS)null);
				return;
			case LNGroupCPackage.CCGR__PMP_OV_CUR:
				setPmpOvCur((SPS)null);
				return;
			case LNGroupCPackage.CCGR__PMP_ALM:
				setPmpAlm((SPS)null);
				return;
			case LNGroupCPackage.CCGR__OIL_TMP_SET:
				setOilTmpSet((ASG)null);
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
			case LNGroupCPackage.CCGR__EE_HEALTH:
				return eeHealth != null;
			case LNGroupCPackage.CCGR__EE_NAME:
				return eeName != null;
			case LNGroupCPackage.CCGR__OP_TMH:
				return opTmh != null;
			case LNGroupCPackage.CCGR__ENV_TMP:
				return envTmp != null;
			case LNGroupCPackage.CCGR__OIL_TMP_IN:
				return oilTmpIn != null;
			case LNGroupCPackage.CCGR__OIL_TMP_OUT:
				return oilTmpOut != null;
			case LNGroupCPackage.CCGR__OIL_MOT_A:
				return oilMotA != null;
			case LNGroupCPackage.CCGR__FAN_FLW:
				return fanFlw != null;
			case LNGroupCPackage.CCGR__FAN_A:
				return fanA != null;
			case LNGroupCPackage.CCGR__CE_CTL:
				return ceCtl != null;
			case LNGroupCPackage.CCGR__PMP_CTL_GEN:
				return pmpCtlGen != null;
			case LNGroupCPackage.CCGR__PMP_CTL:
				return pmpCtl != null;
			case LNGroupCPackage.CCGR__FAN_CTL_GEN:
				return fanCtlGen != null;
			case LNGroupCPackage.CCGR__FAN_CTL:
				return fanCtl != null;
			case LNGroupCPackage.CCGR__AUTO:
				return auto != null;
			case LNGroupCPackage.CCGR__FAN_OV_CUR:
				return fanOvCur != null;
			case LNGroupCPackage.CCGR__PMP_OV_CUR:
				return pmpOvCur != null;
			case LNGroupCPackage.CCGR__PMP_ALM:
				return pmpAlm != null;
			case LNGroupCPackage.CCGR__OIL_TMP_SET:
				return oilTmpSet != null;
		}
		return super.eIsSet(featureID);
	}

} //CCGRImpl
