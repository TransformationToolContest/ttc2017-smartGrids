/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupM.impl;

import gluemodel.substationStandard.Dataclasses.DEL;
import gluemodel.substationStandard.Dataclasses.MV;
import gluemodel.substationStandard.Dataclasses.WYE;

import gluemodel.substationStandard.Enumerations.HealthStateKind;

import gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage;
import gluemodel.substationStandard.LNNodes.LNGroupM.MMXU;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MMXU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MMXUImpl#getTotW <em>Tot W</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MMXUImpl#getEEHealth <em>EE Health</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MMXUImpl#getTotVAr <em>Tot VAr</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MMXUImpl#getTotVA <em>Tot VA</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MMXUImpl#getTotPF <em>Tot PF</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MMXUImpl#getHz <em>Hz</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MMXUImpl#getPPV <em>PPV</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MMXUImpl#getPhV <em>Ph V</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MMXUImpl#getA <em>A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MMXUImpl#getW <em>W</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MMXUImpl#getVAr <em>VAr</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MMXUImpl#getVA <em>VA</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MMXUImpl#getPF <em>PF</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MMXUImpl#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MMXUImpl extends GroupMImpl implements MMXU {
	/**
	 * The cached value of the '{@link #getTotW() <em>Tot W</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotW()
	 * @generated
	 * @ordered
	 */
	protected MV totW;

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
	 * The cached value of the '{@link #getTotVAr() <em>Tot VAr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotVAr()
	 * @generated
	 * @ordered
	 */
	protected MV totVAr;

	/**
	 * The cached value of the '{@link #getTotVA() <em>Tot VA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotVA()
	 * @generated
	 * @ordered
	 */
	protected MV totVA;

	/**
	 * The cached value of the '{@link #getTotPF() <em>Tot PF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotPF()
	 * @generated
	 * @ordered
	 */
	protected MV totPF;

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
	 * The cached value of the '{@link #getPPV() <em>PPV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPPV()
	 * @generated
	 * @ordered
	 */
	protected DEL ppv;

	/**
	 * The cached value of the '{@link #getPhV() <em>Ph V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhV()
	 * @generated
	 * @ordered
	 */
	protected WYE phV;

	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected WYE a;

	/**
	 * The cached value of the '{@link #getW() <em>W</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW()
	 * @generated
	 * @ordered
	 */
	protected WYE w;

	/**
	 * The cached value of the '{@link #getVAr() <em>VAr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVAr()
	 * @generated
	 * @ordered
	 */
	protected WYE vAr;

	/**
	 * The cached value of the '{@link #getVA() <em>VA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVA()
	 * @generated
	 * @ordered
	 */
	protected WYE va;

	/**
	 * The cached value of the '{@link #getPF() <em>PF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPF()
	 * @generated
	 * @ordered
	 */
	protected WYE pf;

	/**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected WYE z;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MMXUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupMPackage.Literals.MMXU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getTotW() {
		if (totW != null && totW.eIsProxy()) {
			InternalEObject oldTotW = (InternalEObject)totW;
			totW = (MV)eResolveProxy(oldTotW);
			if (totW != oldTotW) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMXU__TOT_W, oldTotW, totW));
			}
		}
		return totW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetTotW() {
		return totW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotW(MV newTotW) {
		MV oldTotW = totW;
		totW = newTotW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMXU__TOT_W, oldTotW, totW));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMXU__EE_HEALTH, oldEEHealth, eeHealth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getTotVAr() {
		if (totVAr != null && totVAr.eIsProxy()) {
			InternalEObject oldTotVAr = (InternalEObject)totVAr;
			totVAr = (MV)eResolveProxy(oldTotVAr);
			if (totVAr != oldTotVAr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMXU__TOT_VAR, oldTotVAr, totVAr));
			}
		}
		return totVAr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetTotVAr() {
		return totVAr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotVAr(MV newTotVAr) {
		MV oldTotVAr = totVAr;
		totVAr = newTotVAr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMXU__TOT_VAR, oldTotVAr, totVAr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getTotVA() {
		if (totVA != null && totVA.eIsProxy()) {
			InternalEObject oldTotVA = (InternalEObject)totVA;
			totVA = (MV)eResolveProxy(oldTotVA);
			if (totVA != oldTotVA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMXU__TOT_VA, oldTotVA, totVA));
			}
		}
		return totVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetTotVA() {
		return totVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotVA(MV newTotVA) {
		MV oldTotVA = totVA;
		totVA = newTotVA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMXU__TOT_VA, oldTotVA, totVA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getTotPF() {
		if (totPF != null && totPF.eIsProxy()) {
			InternalEObject oldTotPF = (InternalEObject)totPF;
			totPF = (MV)eResolveProxy(oldTotPF);
			if (totPF != oldTotPF) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMXU__TOT_PF, oldTotPF, totPF));
			}
		}
		return totPF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetTotPF() {
		return totPF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotPF(MV newTotPF) {
		MV oldTotPF = totPF;
		totPF = newTotPF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMXU__TOT_PF, oldTotPF, totPF));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMXU__HZ, oldHz, hz));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMXU__HZ, oldHz, hz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEL getPPV() {
		if (ppv != null && ppv.eIsProxy()) {
			InternalEObject oldPPV = (InternalEObject)ppv;
			ppv = (DEL)eResolveProxy(oldPPV);
			if (ppv != oldPPV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMXU__PPV, oldPPV, ppv));
			}
		}
		return ppv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEL basicGetPPV() {
		return ppv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPPV(DEL newPPV) {
		DEL oldPPV = ppv;
		ppv = newPPV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMXU__PPV, oldPPV, ppv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getPhV() {
		if (phV != null && phV.eIsProxy()) {
			InternalEObject oldPhV = (InternalEObject)phV;
			phV = (WYE)eResolveProxy(oldPhV);
			if (phV != oldPhV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMXU__PH_V, oldPhV, phV));
			}
		}
		return phV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetPhV() {
		return phV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhV(WYE newPhV) {
		WYE oldPhV = phV;
		phV = newPhV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMXU__PH_V, oldPhV, phV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getA() {
		if (a != null && a.eIsProxy()) {
			InternalEObject oldA = (InternalEObject)a;
			a = (WYE)eResolveProxy(oldA);
			if (a != oldA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMXU__A, oldA, a));
			}
		}
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetA() {
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA(WYE newA) {
		WYE oldA = a;
		a = newA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMXU__A, oldA, a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getW() {
		if (w != null && w.eIsProxy()) {
			InternalEObject oldW = (InternalEObject)w;
			w = (WYE)eResolveProxy(oldW);
			if (w != oldW) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMXU__W, oldW, w));
			}
		}
		return w;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetW() {
		return w;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setW(WYE newW) {
		WYE oldW = w;
		w = newW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMXU__W, oldW, w));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getVAr() {
		if (vAr != null && vAr.eIsProxy()) {
			InternalEObject oldVAr = (InternalEObject)vAr;
			vAr = (WYE)eResolveProxy(oldVAr);
			if (vAr != oldVAr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMXU__VAR, oldVAr, vAr));
			}
		}
		return vAr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetVAr() {
		return vAr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVAr(WYE newVAr) {
		WYE oldVAr = vAr;
		vAr = newVAr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMXU__VAR, oldVAr, vAr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getVA() {
		if (va != null && va.eIsProxy()) {
			InternalEObject oldVA = (InternalEObject)va;
			va = (WYE)eResolveProxy(oldVA);
			if (va != oldVA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMXU__VA, oldVA, va));
			}
		}
		return va;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetVA() {
		return va;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVA(WYE newVA) {
		WYE oldVA = va;
		va = newVA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMXU__VA, oldVA, va));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getPF() {
		if (pf != null && pf.eIsProxy()) {
			InternalEObject oldPF = (InternalEObject)pf;
			pf = (WYE)eResolveProxy(oldPF);
			if (pf != oldPF) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMXU__PF, oldPF, pf));
			}
		}
		return pf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetPF() {
		return pf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPF(WYE newPF) {
		WYE oldPF = pf;
		pf = newPF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMXU__PF, oldPF, pf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getZ() {
		if (z != null && z.eIsProxy()) {
			InternalEObject oldZ = (InternalEObject)z;
			z = (WYE)eResolveProxy(oldZ);
			if (z != oldZ) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMXU__Z, oldZ, z));
			}
		}
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ(WYE newZ) {
		WYE oldZ = z;
		z = newZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMXU__Z, oldZ, z));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupMPackage.MMXU__TOT_W:
				if (resolve) return getTotW();
				return basicGetTotW();
			case LNGroupMPackage.MMXU__EE_HEALTH:
				return getEEHealth();
			case LNGroupMPackage.MMXU__TOT_VAR:
				if (resolve) return getTotVAr();
				return basicGetTotVAr();
			case LNGroupMPackage.MMXU__TOT_VA:
				if (resolve) return getTotVA();
				return basicGetTotVA();
			case LNGroupMPackage.MMXU__TOT_PF:
				if (resolve) return getTotPF();
				return basicGetTotPF();
			case LNGroupMPackage.MMXU__HZ:
				if (resolve) return getHz();
				return basicGetHz();
			case LNGroupMPackage.MMXU__PPV:
				if (resolve) return getPPV();
				return basicGetPPV();
			case LNGroupMPackage.MMXU__PH_V:
				if (resolve) return getPhV();
				return basicGetPhV();
			case LNGroupMPackage.MMXU__A:
				if (resolve) return getA();
				return basicGetA();
			case LNGroupMPackage.MMXU__W:
				if (resolve) return getW();
				return basicGetW();
			case LNGroupMPackage.MMXU__VAR:
				if (resolve) return getVAr();
				return basicGetVAr();
			case LNGroupMPackage.MMXU__VA:
				if (resolve) return getVA();
				return basicGetVA();
			case LNGroupMPackage.MMXU__PF:
				if (resolve) return getPF();
				return basicGetPF();
			case LNGroupMPackage.MMXU__Z:
				if (resolve) return getZ();
				return basicGetZ();
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
			case LNGroupMPackage.MMXU__TOT_W:
				setTotW((MV)newValue);
				return;
			case LNGroupMPackage.MMXU__EE_HEALTH:
				setEEHealth((HealthStateKind)newValue);
				return;
			case LNGroupMPackage.MMXU__TOT_VAR:
				setTotVAr((MV)newValue);
				return;
			case LNGroupMPackage.MMXU__TOT_VA:
				setTotVA((MV)newValue);
				return;
			case LNGroupMPackage.MMXU__TOT_PF:
				setTotPF((MV)newValue);
				return;
			case LNGroupMPackage.MMXU__HZ:
				setHz((MV)newValue);
				return;
			case LNGroupMPackage.MMXU__PPV:
				setPPV((DEL)newValue);
				return;
			case LNGroupMPackage.MMXU__PH_V:
				setPhV((WYE)newValue);
				return;
			case LNGroupMPackage.MMXU__A:
				setA((WYE)newValue);
				return;
			case LNGroupMPackage.MMXU__W:
				setW((WYE)newValue);
				return;
			case LNGroupMPackage.MMXU__VAR:
				setVAr((WYE)newValue);
				return;
			case LNGroupMPackage.MMXU__VA:
				setVA((WYE)newValue);
				return;
			case LNGroupMPackage.MMXU__PF:
				setPF((WYE)newValue);
				return;
			case LNGroupMPackage.MMXU__Z:
				setZ((WYE)newValue);
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
			case LNGroupMPackage.MMXU__TOT_W:
				setTotW((MV)null);
				return;
			case LNGroupMPackage.MMXU__EE_HEALTH:
				setEEHealth(EE_HEALTH_EDEFAULT);
				return;
			case LNGroupMPackage.MMXU__TOT_VAR:
				setTotVAr((MV)null);
				return;
			case LNGroupMPackage.MMXU__TOT_VA:
				setTotVA((MV)null);
				return;
			case LNGroupMPackage.MMXU__TOT_PF:
				setTotPF((MV)null);
				return;
			case LNGroupMPackage.MMXU__HZ:
				setHz((MV)null);
				return;
			case LNGroupMPackage.MMXU__PPV:
				setPPV((DEL)null);
				return;
			case LNGroupMPackage.MMXU__PH_V:
				setPhV((WYE)null);
				return;
			case LNGroupMPackage.MMXU__A:
				setA((WYE)null);
				return;
			case LNGroupMPackage.MMXU__W:
				setW((WYE)null);
				return;
			case LNGroupMPackage.MMXU__VAR:
				setVAr((WYE)null);
				return;
			case LNGroupMPackage.MMXU__VA:
				setVA((WYE)null);
				return;
			case LNGroupMPackage.MMXU__PF:
				setPF((WYE)null);
				return;
			case LNGroupMPackage.MMXU__Z:
				setZ((WYE)null);
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
			case LNGroupMPackage.MMXU__TOT_W:
				return totW != null;
			case LNGroupMPackage.MMXU__EE_HEALTH:
				return eeHealth != EE_HEALTH_EDEFAULT;
			case LNGroupMPackage.MMXU__TOT_VAR:
				return totVAr != null;
			case LNGroupMPackage.MMXU__TOT_VA:
				return totVA != null;
			case LNGroupMPackage.MMXU__TOT_PF:
				return totPF != null;
			case LNGroupMPackage.MMXU__HZ:
				return hz != null;
			case LNGroupMPackage.MMXU__PPV:
				return ppv != null;
			case LNGroupMPackage.MMXU__PH_V:
				return phV != null;
			case LNGroupMPackage.MMXU__A:
				return a != null;
			case LNGroupMPackage.MMXU__W:
				return w != null;
			case LNGroupMPackage.MMXU__VAR:
				return vAr != null;
			case LNGroupMPackage.MMXU__VA:
				return va != null;
			case LNGroupMPackage.MMXU__PF:
				return pf != null;
			case LNGroupMPackage.MMXU__Z:
				return z != null;
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

} //MMXUImpl
