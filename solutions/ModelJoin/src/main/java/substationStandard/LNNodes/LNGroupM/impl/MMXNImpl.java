/**
 */
package substationStandard.LNNodes.LNGroupM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.CMV;
import substationStandard.Dataclasses.DPL;
import substationStandard.Dataclasses.MV;

import substationStandard.Enumerations.HealthStateKind;

import substationStandard.LNNodes.LNGroupM.LNGroupMPackage;
import substationStandard.LNNodes.LNGroupM.MMXN;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MMXN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MMXNImpl#getEEName <em>EE Name</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MMXNImpl#getEEHealth <em>EE Health</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MMXNImpl#getAmp <em>Amp</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MMXNImpl#getVol <em>Vol</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MMXNImpl#getWatt <em>Watt</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MMXNImpl#getVolAmpr <em>Vol Ampr</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MMXNImpl#getVolAmp <em>Vol Amp</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MMXNImpl#getPwrFact <em>Pwr Fact</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MMXNImpl#getImp <em>Imp</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MMXNImpl#getHz <em>Hz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MMXNImpl extends GroupMImpl implements MMXN {
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
	 * The cached value of the '{@link #getAmp() <em>Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmp()
	 * @generated
	 * @ordered
	 */
	protected MV amp;

	/**
	 * The cached value of the '{@link #getVol() <em>Vol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVol()
	 * @generated
	 * @ordered
	 */
	protected MV vol;

	/**
	 * The cached value of the '{@link #getWatt() <em>Watt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWatt()
	 * @generated
	 * @ordered
	 */
	protected MV watt;

	/**
	 * The cached value of the '{@link #getVolAmpr() <em>Vol Ampr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolAmpr()
	 * @generated
	 * @ordered
	 */
	protected MV volAmpr;

	/**
	 * The cached value of the '{@link #getVolAmp() <em>Vol Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolAmp()
	 * @generated
	 * @ordered
	 */
	protected MV volAmp;

	/**
	 * The cached value of the '{@link #getPwrFact() <em>Pwr Fact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwrFact()
	 * @generated
	 * @ordered
	 */
	protected MV pwrFact;

	/**
	 * The cached value of the '{@link #getImp() <em>Imp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImp()
	 * @generated
	 * @ordered
	 */
	protected CMV imp;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MMXNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupMPackage.Literals.MMXN;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMXN__EE_NAME, oldEEName, eeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMXN__EE_NAME, oldEEName, eeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMXN__EE_HEALTH, oldEEHealth, eeHealth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getAmp() {
		if (amp != null && amp.eIsProxy()) {
			InternalEObject oldAmp = (InternalEObject)amp;
			amp = (MV)eResolveProxy(oldAmp);
			if (amp != oldAmp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMXN__AMP, oldAmp, amp));
			}
		}
		return amp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetAmp() {
		return amp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmp(MV newAmp) {
		MV oldAmp = amp;
		amp = newAmp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMXN__AMP, oldAmp, amp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getVol() {
		if (vol != null && vol.eIsProxy()) {
			InternalEObject oldVol = (InternalEObject)vol;
			vol = (MV)eResolveProxy(oldVol);
			if (vol != oldVol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMXN__VOL, oldVol, vol));
			}
		}
		return vol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetVol() {
		return vol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVol(MV newVol) {
		MV oldVol = vol;
		vol = newVol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMXN__VOL, oldVol, vol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getWatt() {
		if (watt != null && watt.eIsProxy()) {
			InternalEObject oldWatt = (InternalEObject)watt;
			watt = (MV)eResolveProxy(oldWatt);
			if (watt != oldWatt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMXN__WATT, oldWatt, watt));
			}
		}
		return watt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetWatt() {
		return watt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWatt(MV newWatt) {
		MV oldWatt = watt;
		watt = newWatt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMXN__WATT, oldWatt, watt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getVolAmpr() {
		if (volAmpr != null && volAmpr.eIsProxy()) {
			InternalEObject oldVolAmpr = (InternalEObject)volAmpr;
			volAmpr = (MV)eResolveProxy(oldVolAmpr);
			if (volAmpr != oldVolAmpr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMXN__VOL_AMPR, oldVolAmpr, volAmpr));
			}
		}
		return volAmpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetVolAmpr() {
		return volAmpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolAmpr(MV newVolAmpr) {
		MV oldVolAmpr = volAmpr;
		volAmpr = newVolAmpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMXN__VOL_AMPR, oldVolAmpr, volAmpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getVolAmp() {
		if (volAmp != null && volAmp.eIsProxy()) {
			InternalEObject oldVolAmp = (InternalEObject)volAmp;
			volAmp = (MV)eResolveProxy(oldVolAmp);
			if (volAmp != oldVolAmp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMXN__VOL_AMP, oldVolAmp, volAmp));
			}
		}
		return volAmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetVolAmp() {
		return volAmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolAmp(MV newVolAmp) {
		MV oldVolAmp = volAmp;
		volAmp = newVolAmp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMXN__VOL_AMP, oldVolAmp, volAmp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getPwrFact() {
		if (pwrFact != null && pwrFact.eIsProxy()) {
			InternalEObject oldPwrFact = (InternalEObject)pwrFact;
			pwrFact = (MV)eResolveProxy(oldPwrFact);
			if (pwrFact != oldPwrFact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMXN__PWR_FACT, oldPwrFact, pwrFact));
			}
		}
		return pwrFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetPwrFact() {
		return pwrFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPwrFact(MV newPwrFact) {
		MV oldPwrFact = pwrFact;
		pwrFact = newPwrFact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMXN__PWR_FACT, oldPwrFact, pwrFact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV getImp() {
		if (imp != null && imp.eIsProxy()) {
			InternalEObject oldImp = (InternalEObject)imp;
			imp = (CMV)eResolveProxy(oldImp);
			if (imp != oldImp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMXN__IMP, oldImp, imp));
			}
		}
		return imp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV basicGetImp() {
		return imp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImp(CMV newImp) {
		CMV oldImp = imp;
		imp = newImp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMXN__IMP, oldImp, imp));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMXN__HZ, oldHz, hz));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMXN__HZ, oldHz, hz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupMPackage.MMXN__EE_NAME:
				if (resolve) return getEEName();
				return basicGetEEName();
			case LNGroupMPackage.MMXN__EE_HEALTH:
				return getEEHealth();
			case LNGroupMPackage.MMXN__AMP:
				if (resolve) return getAmp();
				return basicGetAmp();
			case LNGroupMPackage.MMXN__VOL:
				if (resolve) return getVol();
				return basicGetVol();
			case LNGroupMPackage.MMXN__WATT:
				if (resolve) return getWatt();
				return basicGetWatt();
			case LNGroupMPackage.MMXN__VOL_AMPR:
				if (resolve) return getVolAmpr();
				return basicGetVolAmpr();
			case LNGroupMPackage.MMXN__VOL_AMP:
				if (resolve) return getVolAmp();
				return basicGetVolAmp();
			case LNGroupMPackage.MMXN__PWR_FACT:
				if (resolve) return getPwrFact();
				return basicGetPwrFact();
			case LNGroupMPackage.MMXN__IMP:
				if (resolve) return getImp();
				return basicGetImp();
			case LNGroupMPackage.MMXN__HZ:
				if (resolve) return getHz();
				return basicGetHz();
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
			case LNGroupMPackage.MMXN__EE_NAME:
				setEEName((DPL)newValue);
				return;
			case LNGroupMPackage.MMXN__EE_HEALTH:
				setEEHealth((HealthStateKind)newValue);
				return;
			case LNGroupMPackage.MMXN__AMP:
				setAmp((MV)newValue);
				return;
			case LNGroupMPackage.MMXN__VOL:
				setVol((MV)newValue);
				return;
			case LNGroupMPackage.MMXN__WATT:
				setWatt((MV)newValue);
				return;
			case LNGroupMPackage.MMXN__VOL_AMPR:
				setVolAmpr((MV)newValue);
				return;
			case LNGroupMPackage.MMXN__VOL_AMP:
				setVolAmp((MV)newValue);
				return;
			case LNGroupMPackage.MMXN__PWR_FACT:
				setPwrFact((MV)newValue);
				return;
			case LNGroupMPackage.MMXN__IMP:
				setImp((CMV)newValue);
				return;
			case LNGroupMPackage.MMXN__HZ:
				setHz((MV)newValue);
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
			case LNGroupMPackage.MMXN__EE_NAME:
				setEEName((DPL)null);
				return;
			case LNGroupMPackage.MMXN__EE_HEALTH:
				setEEHealth(EE_HEALTH_EDEFAULT);
				return;
			case LNGroupMPackage.MMXN__AMP:
				setAmp((MV)null);
				return;
			case LNGroupMPackage.MMXN__VOL:
				setVol((MV)null);
				return;
			case LNGroupMPackage.MMXN__WATT:
				setWatt((MV)null);
				return;
			case LNGroupMPackage.MMXN__VOL_AMPR:
				setVolAmpr((MV)null);
				return;
			case LNGroupMPackage.MMXN__VOL_AMP:
				setVolAmp((MV)null);
				return;
			case LNGroupMPackage.MMXN__PWR_FACT:
				setPwrFact((MV)null);
				return;
			case LNGroupMPackage.MMXN__IMP:
				setImp((CMV)null);
				return;
			case LNGroupMPackage.MMXN__HZ:
				setHz((MV)null);
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
			case LNGroupMPackage.MMXN__EE_NAME:
				return eeName != null;
			case LNGroupMPackage.MMXN__EE_HEALTH:
				return eeHealth != EE_HEALTH_EDEFAULT;
			case LNGroupMPackage.MMXN__AMP:
				return amp != null;
			case LNGroupMPackage.MMXN__VOL:
				return vol != null;
			case LNGroupMPackage.MMXN__WATT:
				return watt != null;
			case LNGroupMPackage.MMXN__VOL_AMPR:
				return volAmpr != null;
			case LNGroupMPackage.MMXN__VOL_AMP:
				return volAmp != null;
			case LNGroupMPackage.MMXN__PWR_FACT:
				return pwrFact != null;
			case LNGroupMPackage.MMXN__IMP:
				return imp != null;
			case LNGroupMPackage.MMXN__HZ:
				return hz != null;
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

} //MMXNImpl
