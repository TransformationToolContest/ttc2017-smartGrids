/**
 */
package substationStandard.LNNodes.LNGroupM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.DPL;
import substationStandard.Dataclasses.MV;
import substationStandard.Dataclasses.SPC;

import substationStandard.Enumerations.HealthStateKind;

import substationStandard.LNNodes.LNGroupM.LNGroupMPackage;
import substationStandard.LNNodes.LNGroupM.MSTA;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MSTA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSTAImpl#getEEName <em>EE Name</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSTAImpl#getEEHealth <em>EE Health</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSTAImpl#getAvAmps <em>Av Amps</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSTAImpl#getMaxAmps <em>Max Amps</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSTAImpl#getMinAmps <em>Min Amps</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSTAImpl#getAvVolts <em>Av Volts</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSTAImpl#getMaxVolts <em>Max Volts</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSTAImpl#getMinVolts <em>Min Volts</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSTAImpl#getAvVA <em>Av VA</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSTAImpl#getMaxVA <em>Max VA</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSTAImpl#getMinVA <em>Min VA</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSTAImpl#getAvW <em>Av W</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSTAImpl#getMaxW <em>Max W</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSTAImpl#getMinW <em>Min W</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSTAImpl#getAvVAr <em>Av VAr</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSTAImpl#getMaxVAr <em>Max VAr</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSTAImpl#getMinVAr <em>Min VAr</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSTAImpl#getEvStr <em>Ev Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSTAImpl#getEvTmms <em>Ev Tmms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MSTAImpl extends GroupMImpl implements MSTA {
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
	 * The cached value of the '{@link #getAvAmps() <em>Av Amps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvAmps()
	 * @generated
	 * @ordered
	 */
	protected MV avAmps;

	/**
	 * The cached value of the '{@link #getMaxAmps() <em>Max Amps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAmps()
	 * @generated
	 * @ordered
	 */
	protected MV maxAmps;

	/**
	 * The cached value of the '{@link #getMinAmps() <em>Min Amps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAmps()
	 * @generated
	 * @ordered
	 */
	protected MV minAmps;

	/**
	 * The cached value of the '{@link #getAvVolts() <em>Av Volts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvVolts()
	 * @generated
	 * @ordered
	 */
	protected MV avVolts;

	/**
	 * The cached value of the '{@link #getMaxVolts() <em>Max Volts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVolts()
	 * @generated
	 * @ordered
	 */
	protected MV maxVolts;

	/**
	 * The cached value of the '{@link #getMinVolts() <em>Min Volts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVolts()
	 * @generated
	 * @ordered
	 */
	protected MV minVolts;

	/**
	 * The cached value of the '{@link #getAvVA() <em>Av VA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvVA()
	 * @generated
	 * @ordered
	 */
	protected MV avVA;

	/**
	 * The cached value of the '{@link #getMaxVA() <em>Max VA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVA()
	 * @generated
	 * @ordered
	 */
	protected MV maxVA;

	/**
	 * The cached value of the '{@link #getMinVA() <em>Min VA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVA()
	 * @generated
	 * @ordered
	 */
	protected MV minVA;

	/**
	 * The cached value of the '{@link #getAvW() <em>Av W</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvW()
	 * @generated
	 * @ordered
	 */
	protected MV avW;

	/**
	 * The cached value of the '{@link #getMaxW() <em>Max W</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxW()
	 * @generated
	 * @ordered
	 */
	protected MV maxW;

	/**
	 * The cached value of the '{@link #getMinW() <em>Min W</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinW()
	 * @generated
	 * @ordered
	 */
	protected MV minW;

	/**
	 * The cached value of the '{@link #getAvVAr() <em>Av VAr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvVAr()
	 * @generated
	 * @ordered
	 */
	protected MV avVAr;

	/**
	 * The cached value of the '{@link #getMaxVAr() <em>Max VAr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVAr()
	 * @generated
	 * @ordered
	 */
	protected MV maxVAr;

	/**
	 * The cached value of the '{@link #getMinVAr() <em>Min VAr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVAr()
	 * @generated
	 * @ordered
	 */
	protected MV minVAr;

	/**
	 * The cached value of the '{@link #getEvStr() <em>Ev Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvStr()
	 * @generated
	 * @ordered
	 */
	protected SPC evStr;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MSTAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupMPackage.Literals.MSTA;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSTA__EE_NAME, oldEEName, eeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSTA__EE_NAME, oldEEName, eeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSTA__EE_HEALTH, oldEEHealth, eeHealth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getAvAmps() {
		if (avAmps != null && avAmps.eIsProxy()) {
			InternalEObject oldAvAmps = (InternalEObject)avAmps;
			avAmps = (MV)eResolveProxy(oldAvAmps);
			if (avAmps != oldAvAmps) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSTA__AV_AMPS, oldAvAmps, avAmps));
			}
		}
		return avAmps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetAvAmps() {
		return avAmps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvAmps(MV newAvAmps) {
		MV oldAvAmps = avAmps;
		avAmps = newAvAmps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSTA__AV_AMPS, oldAvAmps, avAmps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getMaxAmps() {
		if (maxAmps != null && maxAmps.eIsProxy()) {
			InternalEObject oldMaxAmps = (InternalEObject)maxAmps;
			maxAmps = (MV)eResolveProxy(oldMaxAmps);
			if (maxAmps != oldMaxAmps) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSTA__MAX_AMPS, oldMaxAmps, maxAmps));
			}
		}
		return maxAmps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetMaxAmps() {
		return maxAmps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxAmps(MV newMaxAmps) {
		MV oldMaxAmps = maxAmps;
		maxAmps = newMaxAmps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSTA__MAX_AMPS, oldMaxAmps, maxAmps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getMinAmps() {
		if (minAmps != null && minAmps.eIsProxy()) {
			InternalEObject oldMinAmps = (InternalEObject)minAmps;
			minAmps = (MV)eResolveProxy(oldMinAmps);
			if (minAmps != oldMinAmps) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSTA__MIN_AMPS, oldMinAmps, minAmps));
			}
		}
		return minAmps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetMinAmps() {
		return minAmps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinAmps(MV newMinAmps) {
		MV oldMinAmps = minAmps;
		minAmps = newMinAmps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSTA__MIN_AMPS, oldMinAmps, minAmps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getAvVolts() {
		if (avVolts != null && avVolts.eIsProxy()) {
			InternalEObject oldAvVolts = (InternalEObject)avVolts;
			avVolts = (MV)eResolveProxy(oldAvVolts);
			if (avVolts != oldAvVolts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSTA__AV_VOLTS, oldAvVolts, avVolts));
			}
		}
		return avVolts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetAvVolts() {
		return avVolts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvVolts(MV newAvVolts) {
		MV oldAvVolts = avVolts;
		avVolts = newAvVolts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSTA__AV_VOLTS, oldAvVolts, avVolts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getMaxVolts() {
		if (maxVolts != null && maxVolts.eIsProxy()) {
			InternalEObject oldMaxVolts = (InternalEObject)maxVolts;
			maxVolts = (MV)eResolveProxy(oldMaxVolts);
			if (maxVolts != oldMaxVolts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSTA__MAX_VOLTS, oldMaxVolts, maxVolts));
			}
		}
		return maxVolts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetMaxVolts() {
		return maxVolts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxVolts(MV newMaxVolts) {
		MV oldMaxVolts = maxVolts;
		maxVolts = newMaxVolts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSTA__MAX_VOLTS, oldMaxVolts, maxVolts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getMinVolts() {
		if (minVolts != null && minVolts.eIsProxy()) {
			InternalEObject oldMinVolts = (InternalEObject)minVolts;
			minVolts = (MV)eResolveProxy(oldMinVolts);
			if (minVolts != oldMinVolts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSTA__MIN_VOLTS, oldMinVolts, minVolts));
			}
		}
		return minVolts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetMinVolts() {
		return minVolts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinVolts(MV newMinVolts) {
		MV oldMinVolts = minVolts;
		minVolts = newMinVolts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSTA__MIN_VOLTS, oldMinVolts, minVolts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getAvVA() {
		if (avVA != null && avVA.eIsProxy()) {
			InternalEObject oldAvVA = (InternalEObject)avVA;
			avVA = (MV)eResolveProxy(oldAvVA);
			if (avVA != oldAvVA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSTA__AV_VA, oldAvVA, avVA));
			}
		}
		return avVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetAvVA() {
		return avVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvVA(MV newAvVA) {
		MV oldAvVA = avVA;
		avVA = newAvVA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSTA__AV_VA, oldAvVA, avVA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getMaxVA() {
		if (maxVA != null && maxVA.eIsProxy()) {
			InternalEObject oldMaxVA = (InternalEObject)maxVA;
			maxVA = (MV)eResolveProxy(oldMaxVA);
			if (maxVA != oldMaxVA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSTA__MAX_VA, oldMaxVA, maxVA));
			}
		}
		return maxVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetMaxVA() {
		return maxVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxVA(MV newMaxVA) {
		MV oldMaxVA = maxVA;
		maxVA = newMaxVA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSTA__MAX_VA, oldMaxVA, maxVA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getMinVA() {
		if (minVA != null && minVA.eIsProxy()) {
			InternalEObject oldMinVA = (InternalEObject)minVA;
			minVA = (MV)eResolveProxy(oldMinVA);
			if (minVA != oldMinVA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSTA__MIN_VA, oldMinVA, minVA));
			}
		}
		return minVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetMinVA() {
		return minVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinVA(MV newMinVA) {
		MV oldMinVA = minVA;
		minVA = newMinVA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSTA__MIN_VA, oldMinVA, minVA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getAvW() {
		if (avW != null && avW.eIsProxy()) {
			InternalEObject oldAvW = (InternalEObject)avW;
			avW = (MV)eResolveProxy(oldAvW);
			if (avW != oldAvW) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSTA__AV_W, oldAvW, avW));
			}
		}
		return avW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetAvW() {
		return avW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvW(MV newAvW) {
		MV oldAvW = avW;
		avW = newAvW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSTA__AV_W, oldAvW, avW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getMaxW() {
		if (maxW != null && maxW.eIsProxy()) {
			InternalEObject oldMaxW = (InternalEObject)maxW;
			maxW = (MV)eResolveProxy(oldMaxW);
			if (maxW != oldMaxW) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSTA__MAX_W, oldMaxW, maxW));
			}
		}
		return maxW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetMaxW() {
		return maxW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxW(MV newMaxW) {
		MV oldMaxW = maxW;
		maxW = newMaxW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSTA__MAX_W, oldMaxW, maxW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getMinW() {
		if (minW != null && minW.eIsProxy()) {
			InternalEObject oldMinW = (InternalEObject)minW;
			minW = (MV)eResolveProxy(oldMinW);
			if (minW != oldMinW) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSTA__MIN_W, oldMinW, minW));
			}
		}
		return minW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetMinW() {
		return minW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinW(MV newMinW) {
		MV oldMinW = minW;
		minW = newMinW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSTA__MIN_W, oldMinW, minW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getAvVAr() {
		if (avVAr != null && avVAr.eIsProxy()) {
			InternalEObject oldAvVAr = (InternalEObject)avVAr;
			avVAr = (MV)eResolveProxy(oldAvVAr);
			if (avVAr != oldAvVAr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSTA__AV_VAR, oldAvVAr, avVAr));
			}
		}
		return avVAr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetAvVAr() {
		return avVAr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvVAr(MV newAvVAr) {
		MV oldAvVAr = avVAr;
		avVAr = newAvVAr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSTA__AV_VAR, oldAvVAr, avVAr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getMaxVAr() {
		if (maxVAr != null && maxVAr.eIsProxy()) {
			InternalEObject oldMaxVAr = (InternalEObject)maxVAr;
			maxVAr = (MV)eResolveProxy(oldMaxVAr);
			if (maxVAr != oldMaxVAr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSTA__MAX_VAR, oldMaxVAr, maxVAr));
			}
		}
		return maxVAr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetMaxVAr() {
		return maxVAr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxVAr(MV newMaxVAr) {
		MV oldMaxVAr = maxVAr;
		maxVAr = newMaxVAr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSTA__MAX_VAR, oldMaxVAr, maxVAr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getMinVAr() {
		if (minVAr != null && minVAr.eIsProxy()) {
			InternalEObject oldMinVAr = (InternalEObject)minVAr;
			minVAr = (MV)eResolveProxy(oldMinVAr);
			if (minVAr != oldMinVAr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSTA__MIN_VAR, oldMinVAr, minVAr));
			}
		}
		return minVAr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetMinVAr() {
		return minVAr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinVAr(MV newMinVAr) {
		MV oldMinVAr = minVAr;
		minVAr = newMinVAr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSTA__MIN_VAR, oldMinVAr, minVAr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getEvStr() {
		if (evStr != null && evStr.eIsProxy()) {
			InternalEObject oldEvStr = (InternalEObject)evStr;
			evStr = (SPC)eResolveProxy(oldEvStr);
			if (evStr != oldEvStr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSTA__EV_STR, oldEvStr, evStr));
			}
		}
		return evStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetEvStr() {
		return evStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvStr(SPC newEvStr) {
		SPC oldEvStr = evStr;
		evStr = newEvStr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSTA__EV_STR, oldEvStr, evStr));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSTA__EV_TMMS, oldEvTmms, evTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSTA__EV_TMMS, oldEvTmms, evTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupMPackage.MSTA__EE_NAME:
				if (resolve) return getEEName();
				return basicGetEEName();
			case LNGroupMPackage.MSTA__EE_HEALTH:
				return getEEHealth();
			case LNGroupMPackage.MSTA__AV_AMPS:
				if (resolve) return getAvAmps();
				return basicGetAvAmps();
			case LNGroupMPackage.MSTA__MAX_AMPS:
				if (resolve) return getMaxAmps();
				return basicGetMaxAmps();
			case LNGroupMPackage.MSTA__MIN_AMPS:
				if (resolve) return getMinAmps();
				return basicGetMinAmps();
			case LNGroupMPackage.MSTA__AV_VOLTS:
				if (resolve) return getAvVolts();
				return basicGetAvVolts();
			case LNGroupMPackage.MSTA__MAX_VOLTS:
				if (resolve) return getMaxVolts();
				return basicGetMaxVolts();
			case LNGroupMPackage.MSTA__MIN_VOLTS:
				if (resolve) return getMinVolts();
				return basicGetMinVolts();
			case LNGroupMPackage.MSTA__AV_VA:
				if (resolve) return getAvVA();
				return basicGetAvVA();
			case LNGroupMPackage.MSTA__MAX_VA:
				if (resolve) return getMaxVA();
				return basicGetMaxVA();
			case LNGroupMPackage.MSTA__MIN_VA:
				if (resolve) return getMinVA();
				return basicGetMinVA();
			case LNGroupMPackage.MSTA__AV_W:
				if (resolve) return getAvW();
				return basicGetAvW();
			case LNGroupMPackage.MSTA__MAX_W:
				if (resolve) return getMaxW();
				return basicGetMaxW();
			case LNGroupMPackage.MSTA__MIN_W:
				if (resolve) return getMinW();
				return basicGetMinW();
			case LNGroupMPackage.MSTA__AV_VAR:
				if (resolve) return getAvVAr();
				return basicGetAvVAr();
			case LNGroupMPackage.MSTA__MAX_VAR:
				if (resolve) return getMaxVAr();
				return basicGetMaxVAr();
			case LNGroupMPackage.MSTA__MIN_VAR:
				if (resolve) return getMinVAr();
				return basicGetMinVAr();
			case LNGroupMPackage.MSTA__EV_STR:
				if (resolve) return getEvStr();
				return basicGetEvStr();
			case LNGroupMPackage.MSTA__EV_TMMS:
				if (resolve) return getEvTmms();
				return basicGetEvTmms();
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
			case LNGroupMPackage.MSTA__EE_NAME:
				setEEName((DPL)newValue);
				return;
			case LNGroupMPackage.MSTA__EE_HEALTH:
				setEEHealth((HealthStateKind)newValue);
				return;
			case LNGroupMPackage.MSTA__AV_AMPS:
				setAvAmps((MV)newValue);
				return;
			case LNGroupMPackage.MSTA__MAX_AMPS:
				setMaxAmps((MV)newValue);
				return;
			case LNGroupMPackage.MSTA__MIN_AMPS:
				setMinAmps((MV)newValue);
				return;
			case LNGroupMPackage.MSTA__AV_VOLTS:
				setAvVolts((MV)newValue);
				return;
			case LNGroupMPackage.MSTA__MAX_VOLTS:
				setMaxVolts((MV)newValue);
				return;
			case LNGroupMPackage.MSTA__MIN_VOLTS:
				setMinVolts((MV)newValue);
				return;
			case LNGroupMPackage.MSTA__AV_VA:
				setAvVA((MV)newValue);
				return;
			case LNGroupMPackage.MSTA__MAX_VA:
				setMaxVA((MV)newValue);
				return;
			case LNGroupMPackage.MSTA__MIN_VA:
				setMinVA((MV)newValue);
				return;
			case LNGroupMPackage.MSTA__AV_W:
				setAvW((MV)newValue);
				return;
			case LNGroupMPackage.MSTA__MAX_W:
				setMaxW((MV)newValue);
				return;
			case LNGroupMPackage.MSTA__MIN_W:
				setMinW((MV)newValue);
				return;
			case LNGroupMPackage.MSTA__AV_VAR:
				setAvVAr((MV)newValue);
				return;
			case LNGroupMPackage.MSTA__MAX_VAR:
				setMaxVAr((MV)newValue);
				return;
			case LNGroupMPackage.MSTA__MIN_VAR:
				setMinVAr((MV)newValue);
				return;
			case LNGroupMPackage.MSTA__EV_STR:
				setEvStr((SPC)newValue);
				return;
			case LNGroupMPackage.MSTA__EV_TMMS:
				setEvTmms((ASG)newValue);
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
			case LNGroupMPackage.MSTA__EE_NAME:
				setEEName((DPL)null);
				return;
			case LNGroupMPackage.MSTA__EE_HEALTH:
				setEEHealth(EE_HEALTH_EDEFAULT);
				return;
			case LNGroupMPackage.MSTA__AV_AMPS:
				setAvAmps((MV)null);
				return;
			case LNGroupMPackage.MSTA__MAX_AMPS:
				setMaxAmps((MV)null);
				return;
			case LNGroupMPackage.MSTA__MIN_AMPS:
				setMinAmps((MV)null);
				return;
			case LNGroupMPackage.MSTA__AV_VOLTS:
				setAvVolts((MV)null);
				return;
			case LNGroupMPackage.MSTA__MAX_VOLTS:
				setMaxVolts((MV)null);
				return;
			case LNGroupMPackage.MSTA__MIN_VOLTS:
				setMinVolts((MV)null);
				return;
			case LNGroupMPackage.MSTA__AV_VA:
				setAvVA((MV)null);
				return;
			case LNGroupMPackage.MSTA__MAX_VA:
				setMaxVA((MV)null);
				return;
			case LNGroupMPackage.MSTA__MIN_VA:
				setMinVA((MV)null);
				return;
			case LNGroupMPackage.MSTA__AV_W:
				setAvW((MV)null);
				return;
			case LNGroupMPackage.MSTA__MAX_W:
				setMaxW((MV)null);
				return;
			case LNGroupMPackage.MSTA__MIN_W:
				setMinW((MV)null);
				return;
			case LNGroupMPackage.MSTA__AV_VAR:
				setAvVAr((MV)null);
				return;
			case LNGroupMPackage.MSTA__MAX_VAR:
				setMaxVAr((MV)null);
				return;
			case LNGroupMPackage.MSTA__MIN_VAR:
				setMinVAr((MV)null);
				return;
			case LNGroupMPackage.MSTA__EV_STR:
				setEvStr((SPC)null);
				return;
			case LNGroupMPackage.MSTA__EV_TMMS:
				setEvTmms((ASG)null);
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
			case LNGroupMPackage.MSTA__EE_NAME:
				return eeName != null;
			case LNGroupMPackage.MSTA__EE_HEALTH:
				return eeHealth != EE_HEALTH_EDEFAULT;
			case LNGroupMPackage.MSTA__AV_AMPS:
				return avAmps != null;
			case LNGroupMPackage.MSTA__MAX_AMPS:
				return maxAmps != null;
			case LNGroupMPackage.MSTA__MIN_AMPS:
				return minAmps != null;
			case LNGroupMPackage.MSTA__AV_VOLTS:
				return avVolts != null;
			case LNGroupMPackage.MSTA__MAX_VOLTS:
				return maxVolts != null;
			case LNGroupMPackage.MSTA__MIN_VOLTS:
				return minVolts != null;
			case LNGroupMPackage.MSTA__AV_VA:
				return avVA != null;
			case LNGroupMPackage.MSTA__MAX_VA:
				return maxVA != null;
			case LNGroupMPackage.MSTA__MIN_VA:
				return minVA != null;
			case LNGroupMPackage.MSTA__AV_W:
				return avW != null;
			case LNGroupMPackage.MSTA__MAX_W:
				return maxW != null;
			case LNGroupMPackage.MSTA__MIN_W:
				return minW != null;
			case LNGroupMPackage.MSTA__AV_VAR:
				return avVAr != null;
			case LNGroupMPackage.MSTA__MAX_VAR:
				return maxVAr != null;
			case LNGroupMPackage.MSTA__MIN_VAR:
				return minVAr != null;
			case LNGroupMPackage.MSTA__EV_STR:
				return evStr != null;
			case LNGroupMPackage.MSTA__EV_TMMS:
				return evTmms != null;
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

} //MSTAImpl
