/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupM.impl;

import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.DPL;
import gluemodel.substationStandard.Dataclasses.HMV;
import gluemodel.substationStandard.Dataclasses.ING;
import gluemodel.substationStandard.Dataclasses.MV;

import gluemodel.substationStandard.Enumerations.HealthStateKind;

import gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage;
import gluemodel.substationStandard.LNNodes.LNGroupM.MHAN;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MHAN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getEEName <em>EE Name</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getEEHealth <em>EE Health</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getHz <em>Hz</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getHaAmp <em>Ha Amp</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getHaVol <em>Ha Vol</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getHaWatt <em>Ha Watt</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getHaVolAmpr <em>Ha Vol Ampr</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getHaVolAmp <em>Ha Vol Amp</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getHaRmsAmp <em>Ha Rms Amp</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getHaRmsVol <em>Ha Rms Vol</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getHaTuWatt <em>Ha Tu Watt</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getHaTsWatt <em>Ha Ts Watt</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getHaAmpTm <em>Ha Amp Tm</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getHaKFact <em>Ha KFact</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getHaTdFact <em>Ha Td Fact</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getThdAmp <em>Thd Amp</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getThdOddAmp <em>Thd Odd Amp</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getThdEvnAmp <em>Thd Evn Amp</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getTddAmp <em>Tdd Amp</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getTddOddAmp <em>Tdd Odd Amp</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getTddEvnAmp <em>Tdd Evn Amp</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getThdVol <em>Thd Vol</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getThdOddVol <em>Thd Odd Vol</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getThdEvnVol <em>Thd Evn Vol</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getHaCfAmp <em>Ha Cf Amp</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getHaCfVol <em>Ha Cf Vol</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getHaTiFact <em>Ha Ti Fact</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getHzSet <em>Hz Set</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getEvTmms <em>Ev Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getNumCyc <em>Num Cyc</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getThdAVal <em>Thd AVal</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getThdVVal <em>Thd VVal</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getThdATmms <em>Thd ATmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getThdVTmms <em>Thd VTmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MHANImpl#getNomA <em>Nom A</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MHANImpl extends GroupMImpl implements MHAN {
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
	 * The cached value of the '{@link #getHz() <em>Hz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHz()
	 * @generated
	 * @ordered
	 */
	protected MV hz;

	/**
	 * The cached value of the '{@link #getHaAmp() <em>Ha Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaAmp()
	 * @generated
	 * @ordered
	 */
	protected HMV haAmp;

	/**
	 * The cached value of the '{@link #getHaVol() <em>Ha Vol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaVol()
	 * @generated
	 * @ordered
	 */
	protected HMV haVol;

	/**
	 * The cached value of the '{@link #getHaWatt() <em>Ha Watt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaWatt()
	 * @generated
	 * @ordered
	 */
	protected HMV haWatt;

	/**
	 * The cached value of the '{@link #getHaVolAmpr() <em>Ha Vol Ampr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaVolAmpr()
	 * @generated
	 * @ordered
	 */
	protected HMV haVolAmpr;

	/**
	 * The cached value of the '{@link #getHaVolAmp() <em>Ha Vol Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaVolAmp()
	 * @generated
	 * @ordered
	 */
	protected HMV haVolAmp;

	/**
	 * The cached value of the '{@link #getHaRmsAmp() <em>Ha Rms Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaRmsAmp()
	 * @generated
	 * @ordered
	 */
	protected MV haRmsAmp;

	/**
	 * The cached value of the '{@link #getHaRmsVol() <em>Ha Rms Vol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaRmsVol()
	 * @generated
	 * @ordered
	 */
	protected MV haRmsVol;

	/**
	 * The cached value of the '{@link #getHaTuWatt() <em>Ha Tu Watt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaTuWatt()
	 * @generated
	 * @ordered
	 */
	protected MV haTuWatt;

	/**
	 * The cached value of the '{@link #getHaTsWatt() <em>Ha Ts Watt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaTsWatt()
	 * @generated
	 * @ordered
	 */
	protected MV haTsWatt;

	/**
	 * The cached value of the '{@link #getHaAmpTm() <em>Ha Amp Tm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaAmpTm()
	 * @generated
	 * @ordered
	 */
	protected MV haAmpTm;

	/**
	 * The cached value of the '{@link #getHaKFact() <em>Ha KFact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaKFact()
	 * @generated
	 * @ordered
	 */
	protected MV haKFact;

	/**
	 * The cached value of the '{@link #getHaTdFact() <em>Ha Td Fact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaTdFact()
	 * @generated
	 * @ordered
	 */
	protected MV haTdFact;

	/**
	 * The cached value of the '{@link #getThdAmp() <em>Thd Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThdAmp()
	 * @generated
	 * @ordered
	 */
	protected MV thdAmp;

	/**
	 * The cached value of the '{@link #getThdOddAmp() <em>Thd Odd Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThdOddAmp()
	 * @generated
	 * @ordered
	 */
	protected MV thdOddAmp;

	/**
	 * The cached value of the '{@link #getThdEvnAmp() <em>Thd Evn Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThdEvnAmp()
	 * @generated
	 * @ordered
	 */
	protected MV thdEvnAmp;

	/**
	 * The cached value of the '{@link #getTddAmp() <em>Tdd Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTddAmp()
	 * @generated
	 * @ordered
	 */
	protected MV tddAmp;

	/**
	 * The cached value of the '{@link #getTddOddAmp() <em>Tdd Odd Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTddOddAmp()
	 * @generated
	 * @ordered
	 */
	protected MV tddOddAmp;

	/**
	 * The cached value of the '{@link #getTddEvnAmp() <em>Tdd Evn Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTddEvnAmp()
	 * @generated
	 * @ordered
	 */
	protected MV tddEvnAmp;

	/**
	 * The cached value of the '{@link #getThdVol() <em>Thd Vol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThdVol()
	 * @generated
	 * @ordered
	 */
	protected MV thdVol;

	/**
	 * The cached value of the '{@link #getThdOddVol() <em>Thd Odd Vol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThdOddVol()
	 * @generated
	 * @ordered
	 */
	protected MV thdOddVol;

	/**
	 * The cached value of the '{@link #getThdEvnVol() <em>Thd Evn Vol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThdEvnVol()
	 * @generated
	 * @ordered
	 */
	protected MV thdEvnVol;

	/**
	 * The cached value of the '{@link #getHaCfAmp() <em>Ha Cf Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaCfAmp()
	 * @generated
	 * @ordered
	 */
	protected MV haCfAmp;

	/**
	 * The cached value of the '{@link #getHaCfVol() <em>Ha Cf Vol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaCfVol()
	 * @generated
	 * @ordered
	 */
	protected MV haCfVol;

	/**
	 * The cached value of the '{@link #getHaTiFact() <em>Ha Ti Fact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaTiFact()
	 * @generated
	 * @ordered
	 */
	protected MV haTiFact;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MHANImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupMPackage.Literals.MHAN;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__EE_NAME, oldEEName, eeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__EE_NAME, oldEEName, eeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__EE_HEALTH, oldEEHealth, eeHealth));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__HZ, oldHz, hz));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__HZ, oldHz, hz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMV getHaAmp() {
		if (haAmp != null && haAmp.eIsProxy()) {
			InternalEObject oldHaAmp = (InternalEObject)haAmp;
			haAmp = (HMV)eResolveProxy(oldHaAmp);
			if (haAmp != oldHaAmp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__HA_AMP, oldHaAmp, haAmp));
			}
		}
		return haAmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMV basicGetHaAmp() {
		return haAmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHaAmp(HMV newHaAmp) {
		HMV oldHaAmp = haAmp;
		haAmp = newHaAmp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__HA_AMP, oldHaAmp, haAmp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMV getHaVol() {
		if (haVol != null && haVol.eIsProxy()) {
			InternalEObject oldHaVol = (InternalEObject)haVol;
			haVol = (HMV)eResolveProxy(oldHaVol);
			if (haVol != oldHaVol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__HA_VOL, oldHaVol, haVol));
			}
		}
		return haVol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMV basicGetHaVol() {
		return haVol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHaVol(HMV newHaVol) {
		HMV oldHaVol = haVol;
		haVol = newHaVol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__HA_VOL, oldHaVol, haVol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMV getHaWatt() {
		if (haWatt != null && haWatt.eIsProxy()) {
			InternalEObject oldHaWatt = (InternalEObject)haWatt;
			haWatt = (HMV)eResolveProxy(oldHaWatt);
			if (haWatt != oldHaWatt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__HA_WATT, oldHaWatt, haWatt));
			}
		}
		return haWatt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMV basicGetHaWatt() {
		return haWatt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHaWatt(HMV newHaWatt) {
		HMV oldHaWatt = haWatt;
		haWatt = newHaWatt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__HA_WATT, oldHaWatt, haWatt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMV getHaVolAmpr() {
		if (haVolAmpr != null && haVolAmpr.eIsProxy()) {
			InternalEObject oldHaVolAmpr = (InternalEObject)haVolAmpr;
			haVolAmpr = (HMV)eResolveProxy(oldHaVolAmpr);
			if (haVolAmpr != oldHaVolAmpr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__HA_VOL_AMPR, oldHaVolAmpr, haVolAmpr));
			}
		}
		return haVolAmpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMV basicGetHaVolAmpr() {
		return haVolAmpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHaVolAmpr(HMV newHaVolAmpr) {
		HMV oldHaVolAmpr = haVolAmpr;
		haVolAmpr = newHaVolAmpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__HA_VOL_AMPR, oldHaVolAmpr, haVolAmpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMV getHaVolAmp() {
		if (haVolAmp != null && haVolAmp.eIsProxy()) {
			InternalEObject oldHaVolAmp = (InternalEObject)haVolAmp;
			haVolAmp = (HMV)eResolveProxy(oldHaVolAmp);
			if (haVolAmp != oldHaVolAmp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__HA_VOL_AMP, oldHaVolAmp, haVolAmp));
			}
		}
		return haVolAmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMV basicGetHaVolAmp() {
		return haVolAmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHaVolAmp(HMV newHaVolAmp) {
		HMV oldHaVolAmp = haVolAmp;
		haVolAmp = newHaVolAmp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__HA_VOL_AMP, oldHaVolAmp, haVolAmp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getHaRmsAmp() {
		if (haRmsAmp != null && haRmsAmp.eIsProxy()) {
			InternalEObject oldHaRmsAmp = (InternalEObject)haRmsAmp;
			haRmsAmp = (MV)eResolveProxy(oldHaRmsAmp);
			if (haRmsAmp != oldHaRmsAmp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__HA_RMS_AMP, oldHaRmsAmp, haRmsAmp));
			}
		}
		return haRmsAmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetHaRmsAmp() {
		return haRmsAmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHaRmsAmp(MV newHaRmsAmp) {
		MV oldHaRmsAmp = haRmsAmp;
		haRmsAmp = newHaRmsAmp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__HA_RMS_AMP, oldHaRmsAmp, haRmsAmp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getHaRmsVol() {
		if (haRmsVol != null && haRmsVol.eIsProxy()) {
			InternalEObject oldHaRmsVol = (InternalEObject)haRmsVol;
			haRmsVol = (MV)eResolveProxy(oldHaRmsVol);
			if (haRmsVol != oldHaRmsVol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__HA_RMS_VOL, oldHaRmsVol, haRmsVol));
			}
		}
		return haRmsVol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetHaRmsVol() {
		return haRmsVol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHaRmsVol(MV newHaRmsVol) {
		MV oldHaRmsVol = haRmsVol;
		haRmsVol = newHaRmsVol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__HA_RMS_VOL, oldHaRmsVol, haRmsVol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getHaTuWatt() {
		if (haTuWatt != null && haTuWatt.eIsProxy()) {
			InternalEObject oldHaTuWatt = (InternalEObject)haTuWatt;
			haTuWatt = (MV)eResolveProxy(oldHaTuWatt);
			if (haTuWatt != oldHaTuWatt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__HA_TU_WATT, oldHaTuWatt, haTuWatt));
			}
		}
		return haTuWatt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetHaTuWatt() {
		return haTuWatt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHaTuWatt(MV newHaTuWatt) {
		MV oldHaTuWatt = haTuWatt;
		haTuWatt = newHaTuWatt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__HA_TU_WATT, oldHaTuWatt, haTuWatt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getHaTsWatt() {
		if (haTsWatt != null && haTsWatt.eIsProxy()) {
			InternalEObject oldHaTsWatt = (InternalEObject)haTsWatt;
			haTsWatt = (MV)eResolveProxy(oldHaTsWatt);
			if (haTsWatt != oldHaTsWatt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__HA_TS_WATT, oldHaTsWatt, haTsWatt));
			}
		}
		return haTsWatt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetHaTsWatt() {
		return haTsWatt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHaTsWatt(MV newHaTsWatt) {
		MV oldHaTsWatt = haTsWatt;
		haTsWatt = newHaTsWatt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__HA_TS_WATT, oldHaTsWatt, haTsWatt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getHaAmpTm() {
		if (haAmpTm != null && haAmpTm.eIsProxy()) {
			InternalEObject oldHaAmpTm = (InternalEObject)haAmpTm;
			haAmpTm = (MV)eResolveProxy(oldHaAmpTm);
			if (haAmpTm != oldHaAmpTm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__HA_AMP_TM, oldHaAmpTm, haAmpTm));
			}
		}
		return haAmpTm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetHaAmpTm() {
		return haAmpTm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHaAmpTm(MV newHaAmpTm) {
		MV oldHaAmpTm = haAmpTm;
		haAmpTm = newHaAmpTm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__HA_AMP_TM, oldHaAmpTm, haAmpTm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getHaKFact() {
		if (haKFact != null && haKFact.eIsProxy()) {
			InternalEObject oldHaKFact = (InternalEObject)haKFact;
			haKFact = (MV)eResolveProxy(oldHaKFact);
			if (haKFact != oldHaKFact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__HA_KFACT, oldHaKFact, haKFact));
			}
		}
		return haKFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetHaKFact() {
		return haKFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHaKFact(MV newHaKFact) {
		MV oldHaKFact = haKFact;
		haKFact = newHaKFact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__HA_KFACT, oldHaKFact, haKFact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getHaTdFact() {
		if (haTdFact != null && haTdFact.eIsProxy()) {
			InternalEObject oldHaTdFact = (InternalEObject)haTdFact;
			haTdFact = (MV)eResolveProxy(oldHaTdFact);
			if (haTdFact != oldHaTdFact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__HA_TD_FACT, oldHaTdFact, haTdFact));
			}
		}
		return haTdFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetHaTdFact() {
		return haTdFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHaTdFact(MV newHaTdFact) {
		MV oldHaTdFact = haTdFact;
		haTdFact = newHaTdFact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__HA_TD_FACT, oldHaTdFact, haTdFact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getThdAmp() {
		if (thdAmp != null && thdAmp.eIsProxy()) {
			InternalEObject oldThdAmp = (InternalEObject)thdAmp;
			thdAmp = (MV)eResolveProxy(oldThdAmp);
			if (thdAmp != oldThdAmp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__THD_AMP, oldThdAmp, thdAmp));
			}
		}
		return thdAmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetThdAmp() {
		return thdAmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThdAmp(MV newThdAmp) {
		MV oldThdAmp = thdAmp;
		thdAmp = newThdAmp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__THD_AMP, oldThdAmp, thdAmp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getThdOddAmp() {
		if (thdOddAmp != null && thdOddAmp.eIsProxy()) {
			InternalEObject oldThdOddAmp = (InternalEObject)thdOddAmp;
			thdOddAmp = (MV)eResolveProxy(oldThdOddAmp);
			if (thdOddAmp != oldThdOddAmp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__THD_ODD_AMP, oldThdOddAmp, thdOddAmp));
			}
		}
		return thdOddAmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetThdOddAmp() {
		return thdOddAmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThdOddAmp(MV newThdOddAmp) {
		MV oldThdOddAmp = thdOddAmp;
		thdOddAmp = newThdOddAmp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__THD_ODD_AMP, oldThdOddAmp, thdOddAmp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getThdEvnAmp() {
		if (thdEvnAmp != null && thdEvnAmp.eIsProxy()) {
			InternalEObject oldThdEvnAmp = (InternalEObject)thdEvnAmp;
			thdEvnAmp = (MV)eResolveProxy(oldThdEvnAmp);
			if (thdEvnAmp != oldThdEvnAmp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__THD_EVN_AMP, oldThdEvnAmp, thdEvnAmp));
			}
		}
		return thdEvnAmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetThdEvnAmp() {
		return thdEvnAmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThdEvnAmp(MV newThdEvnAmp) {
		MV oldThdEvnAmp = thdEvnAmp;
		thdEvnAmp = newThdEvnAmp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__THD_EVN_AMP, oldThdEvnAmp, thdEvnAmp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getTddAmp() {
		if (tddAmp != null && tddAmp.eIsProxy()) {
			InternalEObject oldTddAmp = (InternalEObject)tddAmp;
			tddAmp = (MV)eResolveProxy(oldTddAmp);
			if (tddAmp != oldTddAmp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__TDD_AMP, oldTddAmp, tddAmp));
			}
		}
		return tddAmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetTddAmp() {
		return tddAmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTddAmp(MV newTddAmp) {
		MV oldTddAmp = tddAmp;
		tddAmp = newTddAmp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__TDD_AMP, oldTddAmp, tddAmp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getTddOddAmp() {
		if (tddOddAmp != null && tddOddAmp.eIsProxy()) {
			InternalEObject oldTddOddAmp = (InternalEObject)tddOddAmp;
			tddOddAmp = (MV)eResolveProxy(oldTddOddAmp);
			if (tddOddAmp != oldTddOddAmp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__TDD_ODD_AMP, oldTddOddAmp, tddOddAmp));
			}
		}
		return tddOddAmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetTddOddAmp() {
		return tddOddAmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTddOddAmp(MV newTddOddAmp) {
		MV oldTddOddAmp = tddOddAmp;
		tddOddAmp = newTddOddAmp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__TDD_ODD_AMP, oldTddOddAmp, tddOddAmp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getTddEvnAmp() {
		if (tddEvnAmp != null && tddEvnAmp.eIsProxy()) {
			InternalEObject oldTddEvnAmp = (InternalEObject)tddEvnAmp;
			tddEvnAmp = (MV)eResolveProxy(oldTddEvnAmp);
			if (tddEvnAmp != oldTddEvnAmp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__TDD_EVN_AMP, oldTddEvnAmp, tddEvnAmp));
			}
		}
		return tddEvnAmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetTddEvnAmp() {
		return tddEvnAmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTddEvnAmp(MV newTddEvnAmp) {
		MV oldTddEvnAmp = tddEvnAmp;
		tddEvnAmp = newTddEvnAmp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__TDD_EVN_AMP, oldTddEvnAmp, tddEvnAmp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getThdVol() {
		if (thdVol != null && thdVol.eIsProxy()) {
			InternalEObject oldThdVol = (InternalEObject)thdVol;
			thdVol = (MV)eResolveProxy(oldThdVol);
			if (thdVol != oldThdVol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__THD_VOL, oldThdVol, thdVol));
			}
		}
		return thdVol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetThdVol() {
		return thdVol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThdVol(MV newThdVol) {
		MV oldThdVol = thdVol;
		thdVol = newThdVol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__THD_VOL, oldThdVol, thdVol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getThdOddVol() {
		if (thdOddVol != null && thdOddVol.eIsProxy()) {
			InternalEObject oldThdOddVol = (InternalEObject)thdOddVol;
			thdOddVol = (MV)eResolveProxy(oldThdOddVol);
			if (thdOddVol != oldThdOddVol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__THD_ODD_VOL, oldThdOddVol, thdOddVol));
			}
		}
		return thdOddVol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetThdOddVol() {
		return thdOddVol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThdOddVol(MV newThdOddVol) {
		MV oldThdOddVol = thdOddVol;
		thdOddVol = newThdOddVol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__THD_ODD_VOL, oldThdOddVol, thdOddVol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getThdEvnVol() {
		if (thdEvnVol != null && thdEvnVol.eIsProxy()) {
			InternalEObject oldThdEvnVol = (InternalEObject)thdEvnVol;
			thdEvnVol = (MV)eResolveProxy(oldThdEvnVol);
			if (thdEvnVol != oldThdEvnVol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__THD_EVN_VOL, oldThdEvnVol, thdEvnVol));
			}
		}
		return thdEvnVol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetThdEvnVol() {
		return thdEvnVol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThdEvnVol(MV newThdEvnVol) {
		MV oldThdEvnVol = thdEvnVol;
		thdEvnVol = newThdEvnVol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__THD_EVN_VOL, oldThdEvnVol, thdEvnVol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getHaCfAmp() {
		if (haCfAmp != null && haCfAmp.eIsProxy()) {
			InternalEObject oldHaCfAmp = (InternalEObject)haCfAmp;
			haCfAmp = (MV)eResolveProxy(oldHaCfAmp);
			if (haCfAmp != oldHaCfAmp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__HA_CF_AMP, oldHaCfAmp, haCfAmp));
			}
		}
		return haCfAmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetHaCfAmp() {
		return haCfAmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHaCfAmp(MV newHaCfAmp) {
		MV oldHaCfAmp = haCfAmp;
		haCfAmp = newHaCfAmp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__HA_CF_AMP, oldHaCfAmp, haCfAmp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getHaCfVol() {
		if (haCfVol != null && haCfVol.eIsProxy()) {
			InternalEObject oldHaCfVol = (InternalEObject)haCfVol;
			haCfVol = (MV)eResolveProxy(oldHaCfVol);
			if (haCfVol != oldHaCfVol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__HA_CF_VOL, oldHaCfVol, haCfVol));
			}
		}
		return haCfVol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetHaCfVol() {
		return haCfVol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHaCfVol(MV newHaCfVol) {
		MV oldHaCfVol = haCfVol;
		haCfVol = newHaCfVol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__HA_CF_VOL, oldHaCfVol, haCfVol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getHaTiFact() {
		if (haTiFact != null && haTiFact.eIsProxy()) {
			InternalEObject oldHaTiFact = (InternalEObject)haTiFact;
			haTiFact = (MV)eResolveProxy(oldHaTiFact);
			if (haTiFact != oldHaTiFact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__HA_TI_FACT, oldHaTiFact, haTiFact));
			}
		}
		return haTiFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetHaTiFact() {
		return haTiFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHaTiFact(MV newHaTiFact) {
		MV oldHaTiFact = haTiFact;
		haTiFact = newHaTiFact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__HA_TI_FACT, oldHaTiFact, haTiFact));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__HZ_SET, oldHzSet, hzSet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__HZ_SET, oldHzSet, hzSet));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__EV_TMMS, oldEvTmms, evTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__EV_TMMS, oldEvTmms, evTmms));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__NUM_CYC, oldNumCyc, numCyc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__NUM_CYC, oldNumCyc, numCyc));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__THD_AVAL, oldThdAVal, thdAVal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__THD_AVAL, oldThdAVal, thdAVal));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__THD_VVAL, oldThdVVal, thdVVal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__THD_VVAL, oldThdVVal, thdVVal));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__THD_ATMMS, oldThdATmms, thdATmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__THD_ATMMS, oldThdATmms, thdATmms));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__THD_VTMMS, oldThdVTmms, thdVTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__THD_VTMMS, oldThdVTmms, thdVTmms));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MHAN__NOM_A, oldNomA, nomA));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MHAN__NOM_A, oldNomA, nomA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupMPackage.MHAN__EE_NAME:
				if (resolve) return getEEName();
				return basicGetEEName();
			case LNGroupMPackage.MHAN__EE_HEALTH:
				return getEEHealth();
			case LNGroupMPackage.MHAN__HZ:
				if (resolve) return getHz();
				return basicGetHz();
			case LNGroupMPackage.MHAN__HA_AMP:
				if (resolve) return getHaAmp();
				return basicGetHaAmp();
			case LNGroupMPackage.MHAN__HA_VOL:
				if (resolve) return getHaVol();
				return basicGetHaVol();
			case LNGroupMPackage.MHAN__HA_WATT:
				if (resolve) return getHaWatt();
				return basicGetHaWatt();
			case LNGroupMPackage.MHAN__HA_VOL_AMPR:
				if (resolve) return getHaVolAmpr();
				return basicGetHaVolAmpr();
			case LNGroupMPackage.MHAN__HA_VOL_AMP:
				if (resolve) return getHaVolAmp();
				return basicGetHaVolAmp();
			case LNGroupMPackage.MHAN__HA_RMS_AMP:
				if (resolve) return getHaRmsAmp();
				return basicGetHaRmsAmp();
			case LNGroupMPackage.MHAN__HA_RMS_VOL:
				if (resolve) return getHaRmsVol();
				return basicGetHaRmsVol();
			case LNGroupMPackage.MHAN__HA_TU_WATT:
				if (resolve) return getHaTuWatt();
				return basicGetHaTuWatt();
			case LNGroupMPackage.MHAN__HA_TS_WATT:
				if (resolve) return getHaTsWatt();
				return basicGetHaTsWatt();
			case LNGroupMPackage.MHAN__HA_AMP_TM:
				if (resolve) return getHaAmpTm();
				return basicGetHaAmpTm();
			case LNGroupMPackage.MHAN__HA_KFACT:
				if (resolve) return getHaKFact();
				return basicGetHaKFact();
			case LNGroupMPackage.MHAN__HA_TD_FACT:
				if (resolve) return getHaTdFact();
				return basicGetHaTdFact();
			case LNGroupMPackage.MHAN__THD_AMP:
				if (resolve) return getThdAmp();
				return basicGetThdAmp();
			case LNGroupMPackage.MHAN__THD_ODD_AMP:
				if (resolve) return getThdOddAmp();
				return basicGetThdOddAmp();
			case LNGroupMPackage.MHAN__THD_EVN_AMP:
				if (resolve) return getThdEvnAmp();
				return basicGetThdEvnAmp();
			case LNGroupMPackage.MHAN__TDD_AMP:
				if (resolve) return getTddAmp();
				return basicGetTddAmp();
			case LNGroupMPackage.MHAN__TDD_ODD_AMP:
				if (resolve) return getTddOddAmp();
				return basicGetTddOddAmp();
			case LNGroupMPackage.MHAN__TDD_EVN_AMP:
				if (resolve) return getTddEvnAmp();
				return basicGetTddEvnAmp();
			case LNGroupMPackage.MHAN__THD_VOL:
				if (resolve) return getThdVol();
				return basicGetThdVol();
			case LNGroupMPackage.MHAN__THD_ODD_VOL:
				if (resolve) return getThdOddVol();
				return basicGetThdOddVol();
			case LNGroupMPackage.MHAN__THD_EVN_VOL:
				if (resolve) return getThdEvnVol();
				return basicGetThdEvnVol();
			case LNGroupMPackage.MHAN__HA_CF_AMP:
				if (resolve) return getHaCfAmp();
				return basicGetHaCfAmp();
			case LNGroupMPackage.MHAN__HA_CF_VOL:
				if (resolve) return getHaCfVol();
				return basicGetHaCfVol();
			case LNGroupMPackage.MHAN__HA_TI_FACT:
				if (resolve) return getHaTiFact();
				return basicGetHaTiFact();
			case LNGroupMPackage.MHAN__HZ_SET:
				if (resolve) return getHzSet();
				return basicGetHzSet();
			case LNGroupMPackage.MHAN__EV_TMMS:
				if (resolve) return getEvTmms();
				return basicGetEvTmms();
			case LNGroupMPackage.MHAN__NUM_CYC:
				if (resolve) return getNumCyc();
				return basicGetNumCyc();
			case LNGroupMPackage.MHAN__THD_AVAL:
				if (resolve) return getThdAVal();
				return basicGetThdAVal();
			case LNGroupMPackage.MHAN__THD_VVAL:
				if (resolve) return getThdVVal();
				return basicGetThdVVal();
			case LNGroupMPackage.MHAN__THD_ATMMS:
				if (resolve) return getThdATmms();
				return basicGetThdATmms();
			case LNGroupMPackage.MHAN__THD_VTMMS:
				if (resolve) return getThdVTmms();
				return basicGetThdVTmms();
			case LNGroupMPackage.MHAN__NOM_A:
				if (resolve) return getNomA();
				return basicGetNomA();
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
			case LNGroupMPackage.MHAN__EE_NAME:
				setEEName((DPL)newValue);
				return;
			case LNGroupMPackage.MHAN__EE_HEALTH:
				setEEHealth((HealthStateKind)newValue);
				return;
			case LNGroupMPackage.MHAN__HZ:
				setHz((MV)newValue);
				return;
			case LNGroupMPackage.MHAN__HA_AMP:
				setHaAmp((HMV)newValue);
				return;
			case LNGroupMPackage.MHAN__HA_VOL:
				setHaVol((HMV)newValue);
				return;
			case LNGroupMPackage.MHAN__HA_WATT:
				setHaWatt((HMV)newValue);
				return;
			case LNGroupMPackage.MHAN__HA_VOL_AMPR:
				setHaVolAmpr((HMV)newValue);
				return;
			case LNGroupMPackage.MHAN__HA_VOL_AMP:
				setHaVolAmp((HMV)newValue);
				return;
			case LNGroupMPackage.MHAN__HA_RMS_AMP:
				setHaRmsAmp((MV)newValue);
				return;
			case LNGroupMPackage.MHAN__HA_RMS_VOL:
				setHaRmsVol((MV)newValue);
				return;
			case LNGroupMPackage.MHAN__HA_TU_WATT:
				setHaTuWatt((MV)newValue);
				return;
			case LNGroupMPackage.MHAN__HA_TS_WATT:
				setHaTsWatt((MV)newValue);
				return;
			case LNGroupMPackage.MHAN__HA_AMP_TM:
				setHaAmpTm((MV)newValue);
				return;
			case LNGroupMPackage.MHAN__HA_KFACT:
				setHaKFact((MV)newValue);
				return;
			case LNGroupMPackage.MHAN__HA_TD_FACT:
				setHaTdFact((MV)newValue);
				return;
			case LNGroupMPackage.MHAN__THD_AMP:
				setThdAmp((MV)newValue);
				return;
			case LNGroupMPackage.MHAN__THD_ODD_AMP:
				setThdOddAmp((MV)newValue);
				return;
			case LNGroupMPackage.MHAN__THD_EVN_AMP:
				setThdEvnAmp((MV)newValue);
				return;
			case LNGroupMPackage.MHAN__TDD_AMP:
				setTddAmp((MV)newValue);
				return;
			case LNGroupMPackage.MHAN__TDD_ODD_AMP:
				setTddOddAmp((MV)newValue);
				return;
			case LNGroupMPackage.MHAN__TDD_EVN_AMP:
				setTddEvnAmp((MV)newValue);
				return;
			case LNGroupMPackage.MHAN__THD_VOL:
				setThdVol((MV)newValue);
				return;
			case LNGroupMPackage.MHAN__THD_ODD_VOL:
				setThdOddVol((MV)newValue);
				return;
			case LNGroupMPackage.MHAN__THD_EVN_VOL:
				setThdEvnVol((MV)newValue);
				return;
			case LNGroupMPackage.MHAN__HA_CF_AMP:
				setHaCfAmp((MV)newValue);
				return;
			case LNGroupMPackage.MHAN__HA_CF_VOL:
				setHaCfVol((MV)newValue);
				return;
			case LNGroupMPackage.MHAN__HA_TI_FACT:
				setHaTiFact((MV)newValue);
				return;
			case LNGroupMPackage.MHAN__HZ_SET:
				setHzSet((ASG)newValue);
				return;
			case LNGroupMPackage.MHAN__EV_TMMS:
				setEvTmms((ASG)newValue);
				return;
			case LNGroupMPackage.MHAN__NUM_CYC:
				setNumCyc((ING)newValue);
				return;
			case LNGroupMPackage.MHAN__THD_AVAL:
				setThdAVal((ASG)newValue);
				return;
			case LNGroupMPackage.MHAN__THD_VVAL:
				setThdVVal((ASG)newValue);
				return;
			case LNGroupMPackage.MHAN__THD_ATMMS:
				setThdATmms((ING)newValue);
				return;
			case LNGroupMPackage.MHAN__THD_VTMMS:
				setThdVTmms((ING)newValue);
				return;
			case LNGroupMPackage.MHAN__NOM_A:
				setNomA((ASG)newValue);
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
			case LNGroupMPackage.MHAN__EE_NAME:
				setEEName((DPL)null);
				return;
			case LNGroupMPackage.MHAN__EE_HEALTH:
				setEEHealth(EE_HEALTH_EDEFAULT);
				return;
			case LNGroupMPackage.MHAN__HZ:
				setHz((MV)null);
				return;
			case LNGroupMPackage.MHAN__HA_AMP:
				setHaAmp((HMV)null);
				return;
			case LNGroupMPackage.MHAN__HA_VOL:
				setHaVol((HMV)null);
				return;
			case LNGroupMPackage.MHAN__HA_WATT:
				setHaWatt((HMV)null);
				return;
			case LNGroupMPackage.MHAN__HA_VOL_AMPR:
				setHaVolAmpr((HMV)null);
				return;
			case LNGroupMPackage.MHAN__HA_VOL_AMP:
				setHaVolAmp((HMV)null);
				return;
			case LNGroupMPackage.MHAN__HA_RMS_AMP:
				setHaRmsAmp((MV)null);
				return;
			case LNGroupMPackage.MHAN__HA_RMS_VOL:
				setHaRmsVol((MV)null);
				return;
			case LNGroupMPackage.MHAN__HA_TU_WATT:
				setHaTuWatt((MV)null);
				return;
			case LNGroupMPackage.MHAN__HA_TS_WATT:
				setHaTsWatt((MV)null);
				return;
			case LNGroupMPackage.MHAN__HA_AMP_TM:
				setHaAmpTm((MV)null);
				return;
			case LNGroupMPackage.MHAN__HA_KFACT:
				setHaKFact((MV)null);
				return;
			case LNGroupMPackage.MHAN__HA_TD_FACT:
				setHaTdFact((MV)null);
				return;
			case LNGroupMPackage.MHAN__THD_AMP:
				setThdAmp((MV)null);
				return;
			case LNGroupMPackage.MHAN__THD_ODD_AMP:
				setThdOddAmp((MV)null);
				return;
			case LNGroupMPackage.MHAN__THD_EVN_AMP:
				setThdEvnAmp((MV)null);
				return;
			case LNGroupMPackage.MHAN__TDD_AMP:
				setTddAmp((MV)null);
				return;
			case LNGroupMPackage.MHAN__TDD_ODD_AMP:
				setTddOddAmp((MV)null);
				return;
			case LNGroupMPackage.MHAN__TDD_EVN_AMP:
				setTddEvnAmp((MV)null);
				return;
			case LNGroupMPackage.MHAN__THD_VOL:
				setThdVol((MV)null);
				return;
			case LNGroupMPackage.MHAN__THD_ODD_VOL:
				setThdOddVol((MV)null);
				return;
			case LNGroupMPackage.MHAN__THD_EVN_VOL:
				setThdEvnVol((MV)null);
				return;
			case LNGroupMPackage.MHAN__HA_CF_AMP:
				setHaCfAmp((MV)null);
				return;
			case LNGroupMPackage.MHAN__HA_CF_VOL:
				setHaCfVol((MV)null);
				return;
			case LNGroupMPackage.MHAN__HA_TI_FACT:
				setHaTiFact((MV)null);
				return;
			case LNGroupMPackage.MHAN__HZ_SET:
				setHzSet((ASG)null);
				return;
			case LNGroupMPackage.MHAN__EV_TMMS:
				setEvTmms((ASG)null);
				return;
			case LNGroupMPackage.MHAN__NUM_CYC:
				setNumCyc((ING)null);
				return;
			case LNGroupMPackage.MHAN__THD_AVAL:
				setThdAVal((ASG)null);
				return;
			case LNGroupMPackage.MHAN__THD_VVAL:
				setThdVVal((ASG)null);
				return;
			case LNGroupMPackage.MHAN__THD_ATMMS:
				setThdATmms((ING)null);
				return;
			case LNGroupMPackage.MHAN__THD_VTMMS:
				setThdVTmms((ING)null);
				return;
			case LNGroupMPackage.MHAN__NOM_A:
				setNomA((ASG)null);
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
			case LNGroupMPackage.MHAN__EE_NAME:
				return eeName != null;
			case LNGroupMPackage.MHAN__EE_HEALTH:
				return eeHealth != EE_HEALTH_EDEFAULT;
			case LNGroupMPackage.MHAN__HZ:
				return hz != null;
			case LNGroupMPackage.MHAN__HA_AMP:
				return haAmp != null;
			case LNGroupMPackage.MHAN__HA_VOL:
				return haVol != null;
			case LNGroupMPackage.MHAN__HA_WATT:
				return haWatt != null;
			case LNGroupMPackage.MHAN__HA_VOL_AMPR:
				return haVolAmpr != null;
			case LNGroupMPackage.MHAN__HA_VOL_AMP:
				return haVolAmp != null;
			case LNGroupMPackage.MHAN__HA_RMS_AMP:
				return haRmsAmp != null;
			case LNGroupMPackage.MHAN__HA_RMS_VOL:
				return haRmsVol != null;
			case LNGroupMPackage.MHAN__HA_TU_WATT:
				return haTuWatt != null;
			case LNGroupMPackage.MHAN__HA_TS_WATT:
				return haTsWatt != null;
			case LNGroupMPackage.MHAN__HA_AMP_TM:
				return haAmpTm != null;
			case LNGroupMPackage.MHAN__HA_KFACT:
				return haKFact != null;
			case LNGroupMPackage.MHAN__HA_TD_FACT:
				return haTdFact != null;
			case LNGroupMPackage.MHAN__THD_AMP:
				return thdAmp != null;
			case LNGroupMPackage.MHAN__THD_ODD_AMP:
				return thdOddAmp != null;
			case LNGroupMPackage.MHAN__THD_EVN_AMP:
				return thdEvnAmp != null;
			case LNGroupMPackage.MHAN__TDD_AMP:
				return tddAmp != null;
			case LNGroupMPackage.MHAN__TDD_ODD_AMP:
				return tddOddAmp != null;
			case LNGroupMPackage.MHAN__TDD_EVN_AMP:
				return tddEvnAmp != null;
			case LNGroupMPackage.MHAN__THD_VOL:
				return thdVol != null;
			case LNGroupMPackage.MHAN__THD_ODD_VOL:
				return thdOddVol != null;
			case LNGroupMPackage.MHAN__THD_EVN_VOL:
				return thdEvnVol != null;
			case LNGroupMPackage.MHAN__HA_CF_AMP:
				return haCfAmp != null;
			case LNGroupMPackage.MHAN__HA_CF_VOL:
				return haCfVol != null;
			case LNGroupMPackage.MHAN__HA_TI_FACT:
				return haTiFact != null;
			case LNGroupMPackage.MHAN__HZ_SET:
				return hzSet != null;
			case LNGroupMPackage.MHAN__EV_TMMS:
				return evTmms != null;
			case LNGroupMPackage.MHAN__NUM_CYC:
				return numCyc != null;
			case LNGroupMPackage.MHAN__THD_AVAL:
				return thdAVal != null;
			case LNGroupMPackage.MHAN__THD_VVAL:
				return thdVVal != null;
			case LNGroupMPackage.MHAN__THD_ATMMS:
				return thdATmms != null;
			case LNGroupMPackage.MHAN__THD_VTMMS:
				return thdVTmms != null;
			case LNGroupMPackage.MHAN__NOM_A:
				return nomA != null;
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

} //MHANImpl
