/**
 */
package substationStandard.LNNodes.LNGroupM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.DEL;
import substationStandard.Dataclasses.DPL;
import substationStandard.Dataclasses.HDEL;
import substationStandard.Dataclasses.HYWE;
import substationStandard.Dataclasses.ING;
import substationStandard.Dataclasses.MV;
import substationStandard.Dataclasses.WYE;

import substationStandard.Enumerations.HealthStateKind;

import substationStandard.LNNodes.LNGroupM.LNGroupMPackage;
import substationStandard.LNNodes.LNGroupM.MHAI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MHAI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getEEName <em>EE Name</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getHz <em>Hz</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getHA <em>HA</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getHPhV <em>HPh V</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getHPPV <em>HPPV</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getHW <em>HW</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getHVAr <em>HV Ar</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getHVA <em>HVA</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getHRmsA <em>HRms A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getHRmsPhV <em>HRms Ph V</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getHRmsPPV <em>HRms PPV</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getHTuW <em>HTu W</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getHTsW <em>HTs W</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getHATm <em>HA Tm</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getHKf <em>HKf</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getHTdf <em>HTdf</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getThdA <em>Thd A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getThdOddA <em>Thd Odd A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getThdEvnA <em>Thd Evn A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getThdPhV <em>Thd Ph V</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getThdOddPhV <em>Thd Odd Ph V</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getThdEvnV <em>Thd Evn V</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getThdPPV <em>Thd PPV</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getThdOddPPV <em>Thd Odd PPV</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getThdEvnPPV <em>Thd Evn PPV</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getHCfPhV <em>HCf Ph V</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getHCfPPV <em>HCf PPV</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getHCfA <em>HCf A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getHTif <em>HTif</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getHzSet <em>Hz Set</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getEvTmms <em>Ev Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getNumCyc <em>Num Cyc</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getThdAVal <em>Thd AVal</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getThdVVal <em>Thd VVal</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getThdATmms <em>Thd ATmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getThdVTmms <em>Thd VTmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getNomA <em>Nom A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl#getEEHealth <em>EE Health</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MHAIImpl extends GroupMImpl implements MHAI {
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
	 * The cached value of the '{@link #getHz() <em>Hz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHz()
	 * @generated
	 * @ordered
	 */
	protected MV hz;

	/**
	 * The cached value of the '{@link #getHA() <em>HA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHA()
	 * @generated
	 * @ordered
	 */
	protected HYWE ha;

	/**
	 * The cached value of the '{@link #getHPhV() <em>HPh V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHPhV()
	 * @generated
	 * @ordered
	 */
	protected HYWE hPhV;

	/**
	 * The cached value of the '{@link #getHPPV() <em>HPPV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHPPV()
	 * @generated
	 * @ordered
	 */
	protected HDEL hppv;

	/**
	 * The cached value of the '{@link #getHW() <em>HW</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHW()
	 * @generated
	 * @ordered
	 */
	protected HYWE hw;

	/**
	 * The cached value of the '{@link #getHVAr() <em>HV Ar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHVAr()
	 * @generated
	 * @ordered
	 */
	protected HYWE hvAr;

	/**
	 * The cached value of the '{@link #getHVA() <em>HVA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHVA()
	 * @generated
	 * @ordered
	 */
	protected HYWE hva;

	/**
	 * The cached value of the '{@link #getHRmsA() <em>HRms A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHRmsA()
	 * @generated
	 * @ordered
	 */
	protected WYE hRmsA;

	/**
	 * The cached value of the '{@link #getHRmsPhV() <em>HRms Ph V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHRmsPhV()
	 * @generated
	 * @ordered
	 */
	protected WYE hRmsPhV;

	/**
	 * The cached value of the '{@link #getHRmsPPV() <em>HRms PPV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHRmsPPV()
	 * @generated
	 * @ordered
	 */
	protected DEL hRmsPPV;

	/**
	 * The cached value of the '{@link #getHTuW() <em>HTu W</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHTuW()
	 * @generated
	 * @ordered
	 */
	protected WYE hTuW;

	/**
	 * The cached value of the '{@link #getHTsW() <em>HTs W</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHTsW()
	 * @generated
	 * @ordered
	 */
	protected WYE hTsW;

	/**
	 * The cached value of the '{@link #getHATm() <em>HA Tm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHATm()
	 * @generated
	 * @ordered
	 */
	protected WYE haTm;

	/**
	 * The cached value of the '{@link #getHKf() <em>HKf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHKf()
	 * @generated
	 * @ordered
	 */
	protected WYE hKf;

	/**
	 * The cached value of the '{@link #getHTdf() <em>HTdf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHTdf()
	 * @generated
	 * @ordered
	 */
	protected WYE hTdf;

	/**
	 * The cached value of the '{@link #getThdA() <em>Thd A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThdA()
	 * @generated
	 * @ordered
	 */
	protected WYE thdA;

	/**
	 * The cached value of the '{@link #getThdOddA() <em>Thd Odd A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThdOddA()
	 * @generated
	 * @ordered
	 */
	protected WYE thdOddA;

	/**
	 * The cached value of the '{@link #getThdEvnA() <em>Thd Evn A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThdEvnA()
	 * @generated
	 * @ordered
	 */
	protected WYE thdEvnA;

	/**
	 * The cached value of the '{@link #getThdPhV() <em>Thd Ph V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThdPhV()
	 * @generated
	 * @ordered
	 */
	protected WYE thdPhV;

	/**
	 * The cached value of the '{@link #getThdOddPhV() <em>Thd Odd Ph V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThdOddPhV()
	 * @generated
	 * @ordered
	 */
	protected WYE thdOddPhV;

	/**
	 * The cached value of the '{@link #getThdEvnV() <em>Thd Evn V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThdEvnV()
	 * @generated
	 * @ordered
	 */
	protected WYE thdEvnV;

	/**
	 * The cached value of the '{@link #getThdPPV() <em>Thd PPV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThdPPV()
	 * @generated
	 * @ordered
	 */
	protected DEL thdPPV;

	/**
	 * The cached value of the '{@link #getThdOddPPV() <em>Thd Odd PPV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThdOddPPV()
	 * @generated
	 * @ordered
	 */
	protected DEL thdOddPPV;

	/**
	 * The cached value of the '{@link #getThdEvnPPV() <em>Thd Evn PPV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThdEvnPPV()
	 * @generated
	 * @ordered
	 */
	protected DEL thdEvnPPV;

	/**
	 * The cached value of the '{@link #getHCfPhV() <em>HCf Ph V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHCfPhV()
	 * @generated
	 * @ordered
	 */
	protected WYE hCfPhV;

	/**
	 * The cached value of the '{@link #getHCfPPV() <em>HCf PPV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHCfPPV()
	 * @generated
	 * @ordered
	 */
	protected DEL hCfPPV;

	/**
	 * The cached value of the '{@link #getHCfA() <em>HCf A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHCfA()
	 * @generated
	 * @ordered
	 */
	protected WYE hCfA;

	/**
	 * The cached value of the '{@link #getHTif() <em>HTif</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHTif()
	 * @generated
	 * @ordered
	 */
	protected WYE hTif;

	/**
	 * The cached value of the '{@link #getHzSet() <em>Hz Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHzSet()
	 * @generated
	 * @ordered
	 */
	protected ASG hzSet;

	/**
	 * The cached value of the '{@link #getEvTmms() <em>Ev Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvTmms()
	 * @generated
	 * @ordered
	 */
	protected ASG evTmms;

	/**
	 * The cached value of the '{@link #getNumCyc() <em>Num Cyc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCyc()
	 * @generated
	 * @ordered
	 */
	protected ING numCyc;

	/**
	 * The cached value of the '{@link #getThdAVal() <em>Thd AVal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThdAVal()
	 * @generated
	 * @ordered
	 */
	protected ASG thdAVal;

	/**
	 * The cached value of the '{@link #getThdVVal() <em>Thd VVal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThdVVal()
	 * @generated
	 * @ordered
	 */
	protected ASG thdVVal;

	/**
	 * The cached value of the '{@link #getThdATmms() <em>Thd ATmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThdATmms()
	 * @generated
	 * @ordered
	 */
	protected ING thdATmms;

	/**
	 * The cached value of the '{@link #getThdVTmms() <em>Thd VTmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThdVTmms()
	 * @generated
	 * @ordered
	 */
	protected ING thdVTmms;

	/**
	 * The cached value of the '{@link #getNomA() <em>Nom A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomA()
	 * @generated
	 * @ordered
	 */
	protected ASG nomA;

	/**
	 * The default value of the '{@link #getEEHealth() <em>EE Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEEHealth()
	 * @generated
	 * @ordered
	 */
	protected static final HealthStateKind EE_HEALTH_EDEFAULT = HealthStateKind.OK;

	/**
	 * The cached value of the '{@link #getEEHealth() <em>EE Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEEHealth()
	 * @generated
	 * @ordered
	 */
	protected HealthStateKind eeHealth = EE_HEALTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MHAIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupMPackage.Literals.MHAI;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__EE_NAME, oldEEName, eeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__EE_NAME, oldEEName, eeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getHz() {
		if (hz != null && hz.eIsProxy()) {
			InternalEObject oldHz = (InternalEObject)hz;
			hz = (MV)eResolveProxy(oldHz);
			if (hz != oldHz) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__HZ, oldHz, hz));
			}
		}
		return hz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetHz() {
		return hz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHz(MV newHz) {
		MV oldHz = hz;
		hz = newHz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__HZ, oldHz, hz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HYWE getHA() {
		if (ha != null && ha.eIsProxy()) {
			InternalEObject oldHA = (InternalEObject)ha;
			ha = (HYWE)eResolveProxy(oldHA);
			if (ha != oldHA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__HA, oldHA, ha));
			}
		}
		return ha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HYWE basicGetHA() {
		return ha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHA(HYWE newHA) {
		HYWE oldHA = ha;
		ha = newHA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__HA, oldHA, ha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HYWE getHPhV() {
		if (hPhV != null && hPhV.eIsProxy()) {
			InternalEObject oldHPhV = (InternalEObject)hPhV;
			hPhV = (HYWE)eResolveProxy(oldHPhV);
			if (hPhV != oldHPhV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__HPH_V, oldHPhV, hPhV));
			}
		}
		return hPhV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HYWE basicGetHPhV() {
		return hPhV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHPhV(HYWE newHPhV) {
		HYWE oldHPhV = hPhV;
		hPhV = newHPhV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__HPH_V, oldHPhV, hPhV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDEL getHPPV() {
		if (hppv != null && hppv.eIsProxy()) {
			InternalEObject oldHPPV = (InternalEObject)hppv;
			hppv = (HDEL)eResolveProxy(oldHPPV);
			if (hppv != oldHPPV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__HPPV, oldHPPV, hppv));
			}
		}
		return hppv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDEL basicGetHPPV() {
		return hppv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHPPV(HDEL newHPPV) {
		HDEL oldHPPV = hppv;
		hppv = newHPPV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__HPPV, oldHPPV, hppv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HYWE getHW() {
		if (hw != null && hw.eIsProxy()) {
			InternalEObject oldHW = (InternalEObject)hw;
			hw = (HYWE)eResolveProxy(oldHW);
			if (hw != oldHW) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__HW, oldHW, hw));
			}
		}
		return hw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HYWE basicGetHW() {
		return hw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHW(HYWE newHW) {
		HYWE oldHW = hw;
		hw = newHW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__HW, oldHW, hw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HYWE getHVAr() {
		if (hvAr != null && hvAr.eIsProxy()) {
			InternalEObject oldHVAr = (InternalEObject)hvAr;
			hvAr = (HYWE)eResolveProxy(oldHVAr);
			if (hvAr != oldHVAr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__HV_AR, oldHVAr, hvAr));
			}
		}
		return hvAr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HYWE basicGetHVAr() {
		return hvAr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHVAr(HYWE newHVAr) {
		HYWE oldHVAr = hvAr;
		hvAr = newHVAr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__HV_AR, oldHVAr, hvAr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HYWE getHVA() {
		if (hva != null && hva.eIsProxy()) {
			InternalEObject oldHVA = (InternalEObject)hva;
			hva = (HYWE)eResolveProxy(oldHVA);
			if (hva != oldHVA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__HVA, oldHVA, hva));
			}
		}
		return hva;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HYWE basicGetHVA() {
		return hva;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHVA(HYWE newHVA) {
		HYWE oldHVA = hva;
		hva = newHVA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__HVA, oldHVA, hva));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getHRmsA() {
		if (hRmsA != null && hRmsA.eIsProxy()) {
			InternalEObject oldHRmsA = (InternalEObject)hRmsA;
			hRmsA = (WYE)eResolveProxy(oldHRmsA);
			if (hRmsA != oldHRmsA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__HRMS_A, oldHRmsA, hRmsA));
			}
		}
		return hRmsA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetHRmsA() {
		return hRmsA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHRmsA(WYE newHRmsA) {
		WYE oldHRmsA = hRmsA;
		hRmsA = newHRmsA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__HRMS_A, oldHRmsA, hRmsA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getHRmsPhV() {
		if (hRmsPhV != null && hRmsPhV.eIsProxy()) {
			InternalEObject oldHRmsPhV = (InternalEObject)hRmsPhV;
			hRmsPhV = (WYE)eResolveProxy(oldHRmsPhV);
			if (hRmsPhV != oldHRmsPhV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__HRMS_PH_V, oldHRmsPhV, hRmsPhV));
			}
		}
		return hRmsPhV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetHRmsPhV() {
		return hRmsPhV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHRmsPhV(WYE newHRmsPhV) {
		WYE oldHRmsPhV = hRmsPhV;
		hRmsPhV = newHRmsPhV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__HRMS_PH_V, oldHRmsPhV, hRmsPhV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEL getHRmsPPV() {
		if (hRmsPPV != null && hRmsPPV.eIsProxy()) {
			InternalEObject oldHRmsPPV = (InternalEObject)hRmsPPV;
			hRmsPPV = (DEL)eResolveProxy(oldHRmsPPV);
			if (hRmsPPV != oldHRmsPPV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__HRMS_PPV, oldHRmsPPV, hRmsPPV));
			}
		}
		return hRmsPPV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEL basicGetHRmsPPV() {
		return hRmsPPV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHRmsPPV(DEL newHRmsPPV) {
		DEL oldHRmsPPV = hRmsPPV;
		hRmsPPV = newHRmsPPV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__HRMS_PPV, oldHRmsPPV, hRmsPPV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getHTuW() {
		if (hTuW != null && hTuW.eIsProxy()) {
			InternalEObject oldHTuW = (InternalEObject)hTuW;
			hTuW = (WYE)eResolveProxy(oldHTuW);
			if (hTuW != oldHTuW) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__HTU_W, oldHTuW, hTuW));
			}
		}
		return hTuW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetHTuW() {
		return hTuW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHTuW(WYE newHTuW) {
		WYE oldHTuW = hTuW;
		hTuW = newHTuW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__HTU_W, oldHTuW, hTuW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getHTsW() {
		if (hTsW != null && hTsW.eIsProxy()) {
			InternalEObject oldHTsW = (InternalEObject)hTsW;
			hTsW = (WYE)eResolveProxy(oldHTsW);
			if (hTsW != oldHTsW) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__HTS_W, oldHTsW, hTsW));
			}
		}
		return hTsW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetHTsW() {
		return hTsW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHTsW(WYE newHTsW) {
		WYE oldHTsW = hTsW;
		hTsW = newHTsW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__HTS_W, oldHTsW, hTsW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getHATm() {
		if (haTm != null && haTm.eIsProxy()) {
			InternalEObject oldHATm = (InternalEObject)haTm;
			haTm = (WYE)eResolveProxy(oldHATm);
			if (haTm != oldHATm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__HA_TM, oldHATm, haTm));
			}
		}
		return haTm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetHATm() {
		return haTm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHATm(WYE newHATm) {
		WYE oldHATm = haTm;
		haTm = newHATm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__HA_TM, oldHATm, haTm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getHKf() {
		if (hKf != null && hKf.eIsProxy()) {
			InternalEObject oldHKf = (InternalEObject)hKf;
			hKf = (WYE)eResolveProxy(oldHKf);
			if (hKf != oldHKf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__HKF, oldHKf, hKf));
			}
		}
		return hKf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetHKf() {
		return hKf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHKf(WYE newHKf) {
		WYE oldHKf = hKf;
		hKf = newHKf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__HKF, oldHKf, hKf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getHTdf() {
		if (hTdf != null && hTdf.eIsProxy()) {
			InternalEObject oldHTdf = (InternalEObject)hTdf;
			hTdf = (WYE)eResolveProxy(oldHTdf);
			if (hTdf != oldHTdf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__HTDF, oldHTdf, hTdf));
			}
		}
		return hTdf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetHTdf() {
		return hTdf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHTdf(WYE newHTdf) {
		WYE oldHTdf = hTdf;
		hTdf = newHTdf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__HTDF, oldHTdf, hTdf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getThdA() {
		if (thdA != null && thdA.eIsProxy()) {
			InternalEObject oldThdA = (InternalEObject)thdA;
			thdA = (WYE)eResolveProxy(oldThdA);
			if (thdA != oldThdA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__THD_A, oldThdA, thdA));
			}
		}
		return thdA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetThdA() {
		return thdA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThdA(WYE newThdA) {
		WYE oldThdA = thdA;
		thdA = newThdA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__THD_A, oldThdA, thdA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getThdOddA() {
		if (thdOddA != null && thdOddA.eIsProxy()) {
			InternalEObject oldThdOddA = (InternalEObject)thdOddA;
			thdOddA = (WYE)eResolveProxy(oldThdOddA);
			if (thdOddA != oldThdOddA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__THD_ODD_A, oldThdOddA, thdOddA));
			}
		}
		return thdOddA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetThdOddA() {
		return thdOddA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThdOddA(WYE newThdOddA) {
		WYE oldThdOddA = thdOddA;
		thdOddA = newThdOddA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__THD_ODD_A, oldThdOddA, thdOddA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getThdEvnA() {
		if (thdEvnA != null && thdEvnA.eIsProxy()) {
			InternalEObject oldThdEvnA = (InternalEObject)thdEvnA;
			thdEvnA = (WYE)eResolveProxy(oldThdEvnA);
			if (thdEvnA != oldThdEvnA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__THD_EVN_A, oldThdEvnA, thdEvnA));
			}
		}
		return thdEvnA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetThdEvnA() {
		return thdEvnA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThdEvnA(WYE newThdEvnA) {
		WYE oldThdEvnA = thdEvnA;
		thdEvnA = newThdEvnA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__THD_EVN_A, oldThdEvnA, thdEvnA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getThdPhV() {
		if (thdPhV != null && thdPhV.eIsProxy()) {
			InternalEObject oldThdPhV = (InternalEObject)thdPhV;
			thdPhV = (WYE)eResolveProxy(oldThdPhV);
			if (thdPhV != oldThdPhV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__THD_PH_V, oldThdPhV, thdPhV));
			}
		}
		return thdPhV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetThdPhV() {
		return thdPhV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThdPhV(WYE newThdPhV) {
		WYE oldThdPhV = thdPhV;
		thdPhV = newThdPhV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__THD_PH_V, oldThdPhV, thdPhV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getThdOddPhV() {
		if (thdOddPhV != null && thdOddPhV.eIsProxy()) {
			InternalEObject oldThdOddPhV = (InternalEObject)thdOddPhV;
			thdOddPhV = (WYE)eResolveProxy(oldThdOddPhV);
			if (thdOddPhV != oldThdOddPhV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__THD_ODD_PH_V, oldThdOddPhV, thdOddPhV));
			}
		}
		return thdOddPhV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetThdOddPhV() {
		return thdOddPhV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThdOddPhV(WYE newThdOddPhV) {
		WYE oldThdOddPhV = thdOddPhV;
		thdOddPhV = newThdOddPhV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__THD_ODD_PH_V, oldThdOddPhV, thdOddPhV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getThdEvnV() {
		if (thdEvnV != null && thdEvnV.eIsProxy()) {
			InternalEObject oldThdEvnV = (InternalEObject)thdEvnV;
			thdEvnV = (WYE)eResolveProxy(oldThdEvnV);
			if (thdEvnV != oldThdEvnV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__THD_EVN_V, oldThdEvnV, thdEvnV));
			}
		}
		return thdEvnV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetThdEvnV() {
		return thdEvnV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThdEvnV(WYE newThdEvnV) {
		WYE oldThdEvnV = thdEvnV;
		thdEvnV = newThdEvnV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__THD_EVN_V, oldThdEvnV, thdEvnV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEL getThdPPV() {
		if (thdPPV != null && thdPPV.eIsProxy()) {
			InternalEObject oldThdPPV = (InternalEObject)thdPPV;
			thdPPV = (DEL)eResolveProxy(oldThdPPV);
			if (thdPPV != oldThdPPV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__THD_PPV, oldThdPPV, thdPPV));
			}
		}
		return thdPPV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEL basicGetThdPPV() {
		return thdPPV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThdPPV(DEL newThdPPV) {
		DEL oldThdPPV = thdPPV;
		thdPPV = newThdPPV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__THD_PPV, oldThdPPV, thdPPV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEL getThdOddPPV() {
		if (thdOddPPV != null && thdOddPPV.eIsProxy()) {
			InternalEObject oldThdOddPPV = (InternalEObject)thdOddPPV;
			thdOddPPV = (DEL)eResolveProxy(oldThdOddPPV);
			if (thdOddPPV != oldThdOddPPV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__THD_ODD_PPV, oldThdOddPPV, thdOddPPV));
			}
		}
		return thdOddPPV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEL basicGetThdOddPPV() {
		return thdOddPPV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThdOddPPV(DEL newThdOddPPV) {
		DEL oldThdOddPPV = thdOddPPV;
		thdOddPPV = newThdOddPPV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__THD_ODD_PPV, oldThdOddPPV, thdOddPPV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEL getThdEvnPPV() {
		if (thdEvnPPV != null && thdEvnPPV.eIsProxy()) {
			InternalEObject oldThdEvnPPV = (InternalEObject)thdEvnPPV;
			thdEvnPPV = (DEL)eResolveProxy(oldThdEvnPPV);
			if (thdEvnPPV != oldThdEvnPPV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__THD_EVN_PPV, oldThdEvnPPV, thdEvnPPV));
			}
		}
		return thdEvnPPV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEL basicGetThdEvnPPV() {
		return thdEvnPPV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThdEvnPPV(DEL newThdEvnPPV) {
		DEL oldThdEvnPPV = thdEvnPPV;
		thdEvnPPV = newThdEvnPPV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__THD_EVN_PPV, oldThdEvnPPV, thdEvnPPV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getHCfPhV() {
		if (hCfPhV != null && hCfPhV.eIsProxy()) {
			InternalEObject oldHCfPhV = (InternalEObject)hCfPhV;
			hCfPhV = (WYE)eResolveProxy(oldHCfPhV);
			if (hCfPhV != oldHCfPhV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__HCF_PH_V, oldHCfPhV, hCfPhV));
			}
		}
		return hCfPhV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetHCfPhV() {
		return hCfPhV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHCfPhV(WYE newHCfPhV) {
		WYE oldHCfPhV = hCfPhV;
		hCfPhV = newHCfPhV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__HCF_PH_V, oldHCfPhV, hCfPhV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEL getHCfPPV() {
		if (hCfPPV != null && hCfPPV.eIsProxy()) {
			InternalEObject oldHCfPPV = (InternalEObject)hCfPPV;
			hCfPPV = (DEL)eResolveProxy(oldHCfPPV);
			if (hCfPPV != oldHCfPPV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__HCF_PPV, oldHCfPPV, hCfPPV));
			}
		}
		return hCfPPV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEL basicGetHCfPPV() {
		return hCfPPV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHCfPPV(DEL newHCfPPV) {
		DEL oldHCfPPV = hCfPPV;
		hCfPPV = newHCfPPV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__HCF_PPV, oldHCfPPV, hCfPPV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getHCfA() {
		if (hCfA != null && hCfA.eIsProxy()) {
			InternalEObject oldHCfA = (InternalEObject)hCfA;
			hCfA = (WYE)eResolveProxy(oldHCfA);
			if (hCfA != oldHCfA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__HCF_A, oldHCfA, hCfA));
			}
		}
		return hCfA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetHCfA() {
		return hCfA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHCfA(WYE newHCfA) {
		WYE oldHCfA = hCfA;
		hCfA = newHCfA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__HCF_A, oldHCfA, hCfA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getHTif() {
		if (hTif != null && hTif.eIsProxy()) {
			InternalEObject oldHTif = (InternalEObject)hTif;
			hTif = (WYE)eResolveProxy(oldHTif);
			if (hTif != oldHTif) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__HTIF, oldHTif, hTif));
			}
		}
		return hTif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetHTif() {
		return hTif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHTif(WYE newHTif) {
		WYE oldHTif = hTif;
		hTif = newHTif;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__HTIF, oldHTif, hTif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getHzSet() {
		if (hzSet != null && hzSet.eIsProxy()) {
			InternalEObject oldHzSet = (InternalEObject)hzSet;
			hzSet = (ASG)eResolveProxy(oldHzSet);
			if (hzSet != oldHzSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__HZ_SET, oldHzSet, hzSet));
			}
		}
		return hzSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetHzSet() {
		return hzSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHzSet(ASG newHzSet) {
		ASG oldHzSet = hzSet;
		hzSet = newHzSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__HZ_SET, oldHzSet, hzSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getEvTmms() {
		if (evTmms != null && evTmms.eIsProxy()) {
			InternalEObject oldEvTmms = (InternalEObject)evTmms;
			evTmms = (ASG)eResolveProxy(oldEvTmms);
			if (evTmms != oldEvTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__EV_TMMS, oldEvTmms, evTmms));
			}
		}
		return evTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetEvTmms() {
		return evTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvTmms(ASG newEvTmms) {
		ASG oldEvTmms = evTmms;
		evTmms = newEvTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__EV_TMMS, oldEvTmms, evTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getNumCyc() {
		if (numCyc != null && numCyc.eIsProxy()) {
			InternalEObject oldNumCyc = (InternalEObject)numCyc;
			numCyc = (ING)eResolveProxy(oldNumCyc);
			if (numCyc != oldNumCyc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__NUM_CYC, oldNumCyc, numCyc));
			}
		}
		return numCyc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetNumCyc() {
		return numCyc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumCyc(ING newNumCyc) {
		ING oldNumCyc = numCyc;
		numCyc = newNumCyc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__NUM_CYC, oldNumCyc, numCyc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getThdAVal() {
		if (thdAVal != null && thdAVal.eIsProxy()) {
			InternalEObject oldThdAVal = (InternalEObject)thdAVal;
			thdAVal = (ASG)eResolveProxy(oldThdAVal);
			if (thdAVal != oldThdAVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__THD_AVAL, oldThdAVal, thdAVal));
			}
		}
		return thdAVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetThdAVal() {
		return thdAVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThdAVal(ASG newThdAVal) {
		ASG oldThdAVal = thdAVal;
		thdAVal = newThdAVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__THD_AVAL, oldThdAVal, thdAVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getThdVVal() {
		if (thdVVal != null && thdVVal.eIsProxy()) {
			InternalEObject oldThdVVal = (InternalEObject)thdVVal;
			thdVVal = (ASG)eResolveProxy(oldThdVVal);
			if (thdVVal != oldThdVVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__THD_VVAL, oldThdVVal, thdVVal));
			}
		}
		return thdVVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetThdVVal() {
		return thdVVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThdVVal(ASG newThdVVal) {
		ASG oldThdVVal = thdVVal;
		thdVVal = newThdVVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__THD_VVAL, oldThdVVal, thdVVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getThdATmms() {
		if (thdATmms != null && thdATmms.eIsProxy()) {
			InternalEObject oldThdATmms = (InternalEObject)thdATmms;
			thdATmms = (ING)eResolveProxy(oldThdATmms);
			if (thdATmms != oldThdATmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__THD_ATMMS, oldThdATmms, thdATmms));
			}
		}
		return thdATmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetThdATmms() {
		return thdATmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThdATmms(ING newThdATmms) {
		ING oldThdATmms = thdATmms;
		thdATmms = newThdATmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__THD_ATMMS, oldThdATmms, thdATmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getThdVTmms() {
		if (thdVTmms != null && thdVTmms.eIsProxy()) {
			InternalEObject oldThdVTmms = (InternalEObject)thdVTmms;
			thdVTmms = (ING)eResolveProxy(oldThdVTmms);
			if (thdVTmms != oldThdVTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__THD_VTMMS, oldThdVTmms, thdVTmms));
			}
		}
		return thdVTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetThdVTmms() {
		return thdVTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThdVTmms(ING newThdVTmms) {
		ING oldThdVTmms = thdVTmms;
		thdVTmms = newThdVTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__THD_VTMMS, oldThdVTmms, thdVTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getNomA() {
		if (nomA != null && nomA.eIsProxy()) {
			InternalEObject oldNomA = (InternalEObject)nomA;
			nomA = (ASG)eResolveProxy(oldNomA);
			if (nomA != oldNomA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAI__NOM_A, oldNomA, nomA));
			}
		}
		return nomA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetNomA() {
		return nomA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomA(ASG newNomA) {
		ASG oldNomA = nomA;
		nomA = newNomA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__NOM_A, oldNomA, nomA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthStateKind getEEHealth() {
		return eeHealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEEHealth(HealthStateKind newEEHealth) {
		HealthStateKind oldEEHealth = eeHealth;
		eeHealth = newEEHealth == null ? EE_HEALTH_EDEFAULT : newEEHealth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAI__EE_HEALTH, oldEEHealth, eeHealth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupMPackage.MHAI__EE_NAME:
				if (resolve) return getEEName();
				return basicGetEEName();
			case LNGroupMPackage.MHAI__HZ:
				if (resolve) return getHz();
				return basicGetHz();
			case LNGroupMPackage.MHAI__HA:
				if (resolve) return getHA();
				return basicGetHA();
			case LNGroupMPackage.MHAI__HPH_V:
				if (resolve) return getHPhV();
				return basicGetHPhV();
			case LNGroupMPackage.MHAI__HPPV:
				if (resolve) return getHPPV();
				return basicGetHPPV();
			case LNGroupMPackage.MHAI__HW:
				if (resolve) return getHW();
				return basicGetHW();
			case LNGroupMPackage.MHAI__HV_AR:
				if (resolve) return getHVAr();
				return basicGetHVAr();
			case LNGroupMPackage.MHAI__HVA:
				if (resolve) return getHVA();
				return basicGetHVA();
			case LNGroupMPackage.MHAI__HRMS_A:
				if (resolve) return getHRmsA();
				return basicGetHRmsA();
			case LNGroupMPackage.MHAI__HRMS_PH_V:
				if (resolve) return getHRmsPhV();
				return basicGetHRmsPhV();
			case LNGroupMPackage.MHAI__HRMS_PPV:
				if (resolve) return getHRmsPPV();
				return basicGetHRmsPPV();
			case LNGroupMPackage.MHAI__HTU_W:
				if (resolve) return getHTuW();
				return basicGetHTuW();
			case LNGroupMPackage.MHAI__HTS_W:
				if (resolve) return getHTsW();
				return basicGetHTsW();
			case LNGroupMPackage.MHAI__HA_TM:
				if (resolve) return getHATm();
				return basicGetHATm();
			case LNGroupMPackage.MHAI__HKF:
				if (resolve) return getHKf();
				return basicGetHKf();
			case LNGroupMPackage.MHAI__HTDF:
				if (resolve) return getHTdf();
				return basicGetHTdf();
			case LNGroupMPackage.MHAI__THD_A:
				if (resolve) return getThdA();
				return basicGetThdA();
			case LNGroupMPackage.MHAI__THD_ODD_A:
				if (resolve) return getThdOddA();
				return basicGetThdOddA();
			case LNGroupMPackage.MHAI__THD_EVN_A:
				if (resolve) return getThdEvnA();
				return basicGetThdEvnA();
			case LNGroupMPackage.MHAI__THD_PH_V:
				if (resolve) return getThdPhV();
				return basicGetThdPhV();
			case LNGroupMPackage.MHAI__THD_ODD_PH_V:
				if (resolve) return getThdOddPhV();
				return basicGetThdOddPhV();
			case LNGroupMPackage.MHAI__THD_EVN_V:
				if (resolve) return getThdEvnV();
				return basicGetThdEvnV();
			case LNGroupMPackage.MHAI__THD_PPV:
				if (resolve) return getThdPPV();
				return basicGetThdPPV();
			case LNGroupMPackage.MHAI__THD_ODD_PPV:
				if (resolve) return getThdOddPPV();
				return basicGetThdOddPPV();
			case LNGroupMPackage.MHAI__THD_EVN_PPV:
				if (resolve) return getThdEvnPPV();
				return basicGetThdEvnPPV();
			case LNGroupMPackage.MHAI__HCF_PH_V:
				if (resolve) return getHCfPhV();
				return basicGetHCfPhV();
			case LNGroupMPackage.MHAI__HCF_PPV:
				if (resolve) return getHCfPPV();
				return basicGetHCfPPV();
			case LNGroupMPackage.MHAI__HCF_A:
				if (resolve) return getHCfA();
				return basicGetHCfA();
			case LNGroupMPackage.MHAI__HTIF:
				if (resolve) return getHTif();
				return basicGetHTif();
			case LNGroupMPackage.MHAI__HZ_SET:
				if (resolve) return getHzSet();
				return basicGetHzSet();
			case LNGroupMPackage.MHAI__EV_TMMS:
				if (resolve) return getEvTmms();
				return basicGetEvTmms();
			case LNGroupMPackage.MHAI__NUM_CYC:
				if (resolve) return getNumCyc();
				return basicGetNumCyc();
			case LNGroupMPackage.MHAI__THD_AVAL:
				if (resolve) return getThdAVal();
				return basicGetThdAVal();
			case LNGroupMPackage.MHAI__THD_VVAL:
				if (resolve) return getThdVVal();
				return basicGetThdVVal();
			case LNGroupMPackage.MHAI__THD_ATMMS:
				if (resolve) return getThdATmms();
				return basicGetThdATmms();
			case LNGroupMPackage.MHAI__THD_VTMMS:
				if (resolve) return getThdVTmms();
				return basicGetThdVTmms();
			case LNGroupMPackage.MHAI__NOM_A:
				if (resolve) return getNomA();
				return basicGetNomA();
			case LNGroupMPackage.MHAI__EE_HEALTH:
				return getEEHealth();
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
			case LNGroupMPackage.MHAI__EE_NAME:
				setEEName((DPL)newValue);
				return;
			case LNGroupMPackage.MHAI__HZ:
				setHz((MV)newValue);
				return;
			case LNGroupMPackage.MHAI__HA:
				setHA((HYWE)newValue);
				return;
			case LNGroupMPackage.MHAI__HPH_V:
				setHPhV((HYWE)newValue);
				return;
			case LNGroupMPackage.MHAI__HPPV:
				setHPPV((HDEL)newValue);
				return;
			case LNGroupMPackage.MHAI__HW:
				setHW((HYWE)newValue);
				return;
			case LNGroupMPackage.MHAI__HV_AR:
				setHVAr((HYWE)newValue);
				return;
			case LNGroupMPackage.MHAI__HVA:
				setHVA((HYWE)newValue);
				return;
			case LNGroupMPackage.MHAI__HRMS_A:
				setHRmsA((WYE)newValue);
				return;
			case LNGroupMPackage.MHAI__HRMS_PH_V:
				setHRmsPhV((WYE)newValue);
				return;
			case LNGroupMPackage.MHAI__HRMS_PPV:
				setHRmsPPV((DEL)newValue);
				return;
			case LNGroupMPackage.MHAI__HTU_W:
				setHTuW((WYE)newValue);
				return;
			case LNGroupMPackage.MHAI__HTS_W:
				setHTsW((WYE)newValue);
				return;
			case LNGroupMPackage.MHAI__HA_TM:
				setHATm((WYE)newValue);
				return;
			case LNGroupMPackage.MHAI__HKF:
				setHKf((WYE)newValue);
				return;
			case LNGroupMPackage.MHAI__HTDF:
				setHTdf((WYE)newValue);
				return;
			case LNGroupMPackage.MHAI__THD_A:
				setThdA((WYE)newValue);
				return;
			case LNGroupMPackage.MHAI__THD_ODD_A:
				setThdOddA((WYE)newValue);
				return;
			case LNGroupMPackage.MHAI__THD_EVN_A:
				setThdEvnA((WYE)newValue);
				return;
			case LNGroupMPackage.MHAI__THD_PH_V:
				setThdPhV((WYE)newValue);
				return;
			case LNGroupMPackage.MHAI__THD_ODD_PH_V:
				setThdOddPhV((WYE)newValue);
				return;
			case LNGroupMPackage.MHAI__THD_EVN_V:
				setThdEvnV((WYE)newValue);
				return;
			case LNGroupMPackage.MHAI__THD_PPV:
				setThdPPV((DEL)newValue);
				return;
			case LNGroupMPackage.MHAI__THD_ODD_PPV:
				setThdOddPPV((DEL)newValue);
				return;
			case LNGroupMPackage.MHAI__THD_EVN_PPV:
				setThdEvnPPV((DEL)newValue);
				return;
			case LNGroupMPackage.MHAI__HCF_PH_V:
				setHCfPhV((WYE)newValue);
				return;
			case LNGroupMPackage.MHAI__HCF_PPV:
				setHCfPPV((DEL)newValue);
				return;
			case LNGroupMPackage.MHAI__HCF_A:
				setHCfA((WYE)newValue);
				return;
			case LNGroupMPackage.MHAI__HTIF:
				setHTif((WYE)newValue);
				return;
			case LNGroupMPackage.MHAI__HZ_SET:
				setHzSet((ASG)newValue);
				return;
			case LNGroupMPackage.MHAI__EV_TMMS:
				setEvTmms((ASG)newValue);
				return;
			case LNGroupMPackage.MHAI__NUM_CYC:
				setNumCyc((ING)newValue);
				return;
			case LNGroupMPackage.MHAI__THD_AVAL:
				setThdAVal((ASG)newValue);
				return;
			case LNGroupMPackage.MHAI__THD_VVAL:
				setThdVVal((ASG)newValue);
				return;
			case LNGroupMPackage.MHAI__THD_ATMMS:
				setThdATmms((ING)newValue);
				return;
			case LNGroupMPackage.MHAI__THD_VTMMS:
				setThdVTmms((ING)newValue);
				return;
			case LNGroupMPackage.MHAI__NOM_A:
				setNomA((ASG)newValue);
				return;
			case LNGroupMPackage.MHAI__EE_HEALTH:
				setEEHealth((HealthStateKind)newValue);
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
			case LNGroupMPackage.MHAI__EE_NAME:
				setEEName((DPL)null);
				return;
			case LNGroupMPackage.MHAI__HZ:
				setHz((MV)null);
				return;
			case LNGroupMPackage.MHAI__HA:
				setHA((HYWE)null);
				return;
			case LNGroupMPackage.MHAI__HPH_V:
				setHPhV((HYWE)null);
				return;
			case LNGroupMPackage.MHAI__HPPV:
				setHPPV((HDEL)null);
				return;
			case LNGroupMPackage.MHAI__HW:
				setHW((HYWE)null);
				return;
			case LNGroupMPackage.MHAI__HV_AR:
				setHVAr((HYWE)null);
				return;
			case LNGroupMPackage.MHAI__HVA:
				setHVA((HYWE)null);
				return;
			case LNGroupMPackage.MHAI__HRMS_A:
				setHRmsA((WYE)null);
				return;
			case LNGroupMPackage.MHAI__HRMS_PH_V:
				setHRmsPhV((WYE)null);
				return;
			case LNGroupMPackage.MHAI__HRMS_PPV:
				setHRmsPPV((DEL)null);
				return;
			case LNGroupMPackage.MHAI__HTU_W:
				setHTuW((WYE)null);
				return;
			case LNGroupMPackage.MHAI__HTS_W:
				setHTsW((WYE)null);
				return;
			case LNGroupMPackage.MHAI__HA_TM:
				setHATm((WYE)null);
				return;
			case LNGroupMPackage.MHAI__HKF:
				setHKf((WYE)null);
				return;
			case LNGroupMPackage.MHAI__HTDF:
				setHTdf((WYE)null);
				return;
			case LNGroupMPackage.MHAI__THD_A:
				setThdA((WYE)null);
				return;
			case LNGroupMPackage.MHAI__THD_ODD_A:
				setThdOddA((WYE)null);
				return;
			case LNGroupMPackage.MHAI__THD_EVN_A:
				setThdEvnA((WYE)null);
				return;
			case LNGroupMPackage.MHAI__THD_PH_V:
				setThdPhV((WYE)null);
				return;
			case LNGroupMPackage.MHAI__THD_ODD_PH_V:
				setThdOddPhV((WYE)null);
				return;
			case LNGroupMPackage.MHAI__THD_EVN_V:
				setThdEvnV((WYE)null);
				return;
			case LNGroupMPackage.MHAI__THD_PPV:
				setThdPPV((DEL)null);
				return;
			case LNGroupMPackage.MHAI__THD_ODD_PPV:
				setThdOddPPV((DEL)null);
				return;
			case LNGroupMPackage.MHAI__THD_EVN_PPV:
				setThdEvnPPV((DEL)null);
				return;
			case LNGroupMPackage.MHAI__HCF_PH_V:
				setHCfPhV((WYE)null);
				return;
			case LNGroupMPackage.MHAI__HCF_PPV:
				setHCfPPV((DEL)null);
				return;
			case LNGroupMPackage.MHAI__HCF_A:
				setHCfA((WYE)null);
				return;
			case LNGroupMPackage.MHAI__HTIF:
				setHTif((WYE)null);
				return;
			case LNGroupMPackage.MHAI__HZ_SET:
				setHzSet((ASG)null);
				return;
			case LNGroupMPackage.MHAI__EV_TMMS:
				setEvTmms((ASG)null);
				return;
			case LNGroupMPackage.MHAI__NUM_CYC:
				setNumCyc((ING)null);
				return;
			case LNGroupMPackage.MHAI__THD_AVAL:
				setThdAVal((ASG)null);
				return;
			case LNGroupMPackage.MHAI__THD_VVAL:
				setThdVVal((ASG)null);
				return;
			case LNGroupMPackage.MHAI__THD_ATMMS:
				setThdATmms((ING)null);
				return;
			case LNGroupMPackage.MHAI__THD_VTMMS:
				setThdVTmms((ING)null);
				return;
			case LNGroupMPackage.MHAI__NOM_A:
				setNomA((ASG)null);
				return;
			case LNGroupMPackage.MHAI__EE_HEALTH:
				setEEHealth(EE_HEALTH_EDEFAULT);
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
			case LNGroupMPackage.MHAI__EE_NAME:
				return eeName != null;
			case LNGroupMPackage.MHAI__HZ:
				return hz != null;
			case LNGroupMPackage.MHAI__HA:
				return ha != null;
			case LNGroupMPackage.MHAI__HPH_V:
				return hPhV != null;
			case LNGroupMPackage.MHAI__HPPV:
				return hppv != null;
			case LNGroupMPackage.MHAI__HW:
				return hw != null;
			case LNGroupMPackage.MHAI__HV_AR:
				return hvAr != null;
			case LNGroupMPackage.MHAI__HVA:
				return hva != null;
			case LNGroupMPackage.MHAI__HRMS_A:
				return hRmsA != null;
			case LNGroupMPackage.MHAI__HRMS_PH_V:
				return hRmsPhV != null;
			case LNGroupMPackage.MHAI__HRMS_PPV:
				return hRmsPPV != null;
			case LNGroupMPackage.MHAI__HTU_W:
				return hTuW != null;
			case LNGroupMPackage.MHAI__HTS_W:
				return hTsW != null;
			case LNGroupMPackage.MHAI__HA_TM:
				return haTm != null;
			case LNGroupMPackage.MHAI__HKF:
				return hKf != null;
			case LNGroupMPackage.MHAI__HTDF:
				return hTdf != null;
			case LNGroupMPackage.MHAI__THD_A:
				return thdA != null;
			case LNGroupMPackage.MHAI__THD_ODD_A:
				return thdOddA != null;
			case LNGroupMPackage.MHAI__THD_EVN_A:
				return thdEvnA != null;
			case LNGroupMPackage.MHAI__THD_PH_V:
				return thdPhV != null;
			case LNGroupMPackage.MHAI__THD_ODD_PH_V:
				return thdOddPhV != null;
			case LNGroupMPackage.MHAI__THD_EVN_V:
				return thdEvnV != null;
			case LNGroupMPackage.MHAI__THD_PPV:
				return thdPPV != null;
			case LNGroupMPackage.MHAI__THD_ODD_PPV:
				return thdOddPPV != null;
			case LNGroupMPackage.MHAI__THD_EVN_PPV:
				return thdEvnPPV != null;
			case LNGroupMPackage.MHAI__HCF_PH_V:
				return hCfPhV != null;
			case LNGroupMPackage.MHAI__HCF_PPV:
				return hCfPPV != null;
			case LNGroupMPackage.MHAI__HCF_A:
				return hCfA != null;
			case LNGroupMPackage.MHAI__HTIF:
				return hTif != null;
			case LNGroupMPackage.MHAI__HZ_SET:
				return hzSet != null;
			case LNGroupMPackage.MHAI__EV_TMMS:
				return evTmms != null;
			case LNGroupMPackage.MHAI__NUM_CYC:
				return numCyc != null;
			case LNGroupMPackage.MHAI__THD_AVAL:
				return thdAVal != null;
			case LNGroupMPackage.MHAI__THD_VVAL:
				return thdVVal != null;
			case LNGroupMPackage.MHAI__THD_ATMMS:
				return thdATmms != null;
			case LNGroupMPackage.MHAI__THD_VTMMS:
				return thdVTmms != null;
			case LNGroupMPackage.MHAI__NOM_A:
				return nomA != null;
			case LNGroupMPackage.MHAI__EE_HEALTH:
				return eeHealth != EE_HEALTH_EDEFAULT;
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
		result.append(" (EEHealth: ");
		result.append(eeHealth);
		result.append(')');
		return result.toString();
	}

} //MHAIImpl
