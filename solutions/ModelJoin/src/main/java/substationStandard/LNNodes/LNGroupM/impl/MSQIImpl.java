/**
 */
package substationStandard.LNNodes.LNGroupM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.DEL;
import substationStandard.Dataclasses.DPL;
import substationStandard.Dataclasses.MV;
import substationStandard.Dataclasses.SEQ;
import substationStandard.Dataclasses.WYE;

import substationStandard.Enumerations.HealthStateKind;

import substationStandard.LNNodes.LNGroupM.LNGroupMPackage;
import substationStandard.LNNodes.LNGroupM.MSQI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MSQI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSQIImpl#getEEName <em>EE Name</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSQIImpl#getEEHealth <em>EE Health</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSQIImpl#getSeqA <em>Seq A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSQIImpl#getSeqV <em>Seq V</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSQIImpl#getDQ0Seq <em>DQ0 Seq</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSQIImpl#getImbA <em>Imb A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSQIImpl#getImbNgA <em>Imb Ng A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSQIImpl#getImbNgV <em>Imb Ng V</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSQIImpl#getImbPPV <em>Imb PPV</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSQIImpl#getImbV <em>Imb V</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSQIImpl#getImbZroA <em>Imb Zro A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSQIImpl#getImbZroV <em>Imb Zro V</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSQIImpl#getMaxImbA <em>Max Imb A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSQIImpl#getMaxImbPPV <em>Max Imb PPV</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupM.impl.MSQIImpl#getMaxImbV <em>Max Imb V</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MSQIImpl extends GroupMImpl implements MSQI {
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
	 * The cached value of the '{@link #getSeqA() <em>Seq A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeqA()
	 * @generated
	 * @ordered
	 */
	protected SEQ seqA;

	/**
	 * The cached value of the '{@link #getSeqV() <em>Seq V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeqV()
	 * @generated
	 * @ordered
	 */
	protected SEQ seqV;

	/**
	 * The cached value of the '{@link #getDQ0Seq() <em>DQ0 Seq</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDQ0Seq()
	 * @generated
	 * @ordered
	 */
	protected SEQ dq0Seq;

	/**
	 * The cached value of the '{@link #getImbA() <em>Imb A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImbA()
	 * @generated
	 * @ordered
	 */
	protected WYE imbA;

	/**
	 * The cached value of the '{@link #getImbNgA() <em>Imb Ng A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImbNgA()
	 * @generated
	 * @ordered
	 */
	protected MV imbNgA;

	/**
	 * The cached value of the '{@link #getImbNgV() <em>Imb Ng V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImbNgV()
	 * @generated
	 * @ordered
	 */
	protected MV imbNgV;

	/**
	 * The cached value of the '{@link #getImbPPV() <em>Imb PPV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImbPPV()
	 * @generated
	 * @ordered
	 */
	protected DEL imbPPV;

	/**
	 * The cached value of the '{@link #getImbV() <em>Imb V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImbV()
	 * @generated
	 * @ordered
	 */
	protected MV imbV;

	/**
	 * The cached value of the '{@link #getImbZroA() <em>Imb Zro A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImbZroA()
	 * @generated
	 * @ordered
	 */
	protected MV imbZroA;

	/**
	 * The cached value of the '{@link #getImbZroV() <em>Imb Zro V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImbZroV()
	 * @generated
	 * @ordered
	 */
	protected MV imbZroV;

	/**
	 * The cached value of the '{@link #getMaxImbA() <em>Max Imb A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxImbA()
	 * @generated
	 * @ordered
	 */
	protected WYE maxImbA;

	/**
	 * The cached value of the '{@link #getMaxImbPPV() <em>Max Imb PPV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxImbPPV()
	 * @generated
	 * @ordered
	 */
	protected WYE maxImbPPV;

	/**
	 * The cached value of the '{@link #getMaxImbV() <em>Max Imb V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxImbV()
	 * @generated
	 * @ordered
	 */
	protected WYE maxImbV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MSQIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupMPackage.Literals.MSQI;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSQI__EE_NAME, oldEEName, eeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSQI__EE_NAME, oldEEName, eeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSQI__EE_HEALTH, oldEEHealth, eeHealth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEQ getSeqA() {
		if (seqA != null && seqA.eIsProxy()) {
			InternalEObject oldSeqA = (InternalEObject)seqA;
			seqA = (SEQ)eResolveProxy(oldSeqA);
			if (seqA != oldSeqA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSQI__SEQ_A, oldSeqA, seqA));
			}
		}
		return seqA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEQ basicGetSeqA() {
		return seqA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeqA(SEQ newSeqA) {
		SEQ oldSeqA = seqA;
		seqA = newSeqA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSQI__SEQ_A, oldSeqA, seqA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEQ getSeqV() {
		if (seqV != null && seqV.eIsProxy()) {
			InternalEObject oldSeqV = (InternalEObject)seqV;
			seqV = (SEQ)eResolveProxy(oldSeqV);
			if (seqV != oldSeqV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSQI__SEQ_V, oldSeqV, seqV));
			}
		}
		return seqV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEQ basicGetSeqV() {
		return seqV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeqV(SEQ newSeqV) {
		SEQ oldSeqV = seqV;
		seqV = newSeqV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSQI__SEQ_V, oldSeqV, seqV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEQ getDQ0Seq() {
		if (dq0Seq != null && dq0Seq.eIsProxy()) {
			InternalEObject oldDQ0Seq = (InternalEObject)dq0Seq;
			dq0Seq = (SEQ)eResolveProxy(oldDQ0Seq);
			if (dq0Seq != oldDQ0Seq) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSQI__DQ0_SEQ, oldDQ0Seq, dq0Seq));
			}
		}
		return dq0Seq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEQ basicGetDQ0Seq() {
		return dq0Seq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDQ0Seq(SEQ newDQ0Seq) {
		SEQ oldDQ0Seq = dq0Seq;
		dq0Seq = newDQ0Seq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSQI__DQ0_SEQ, oldDQ0Seq, dq0Seq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getImbA() {
		if (imbA != null && imbA.eIsProxy()) {
			InternalEObject oldImbA = (InternalEObject)imbA;
			imbA = (WYE)eResolveProxy(oldImbA);
			if (imbA != oldImbA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSQI__IMB_A, oldImbA, imbA));
			}
		}
		return imbA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetImbA() {
		return imbA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImbA(WYE newImbA) {
		WYE oldImbA = imbA;
		imbA = newImbA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSQI__IMB_A, oldImbA, imbA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getImbNgA() {
		if (imbNgA != null && imbNgA.eIsProxy()) {
			InternalEObject oldImbNgA = (InternalEObject)imbNgA;
			imbNgA = (MV)eResolveProxy(oldImbNgA);
			if (imbNgA != oldImbNgA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSQI__IMB_NG_A, oldImbNgA, imbNgA));
			}
		}
		return imbNgA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetImbNgA() {
		return imbNgA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImbNgA(MV newImbNgA) {
		MV oldImbNgA = imbNgA;
		imbNgA = newImbNgA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSQI__IMB_NG_A, oldImbNgA, imbNgA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getImbNgV() {
		if (imbNgV != null && imbNgV.eIsProxy()) {
			InternalEObject oldImbNgV = (InternalEObject)imbNgV;
			imbNgV = (MV)eResolveProxy(oldImbNgV);
			if (imbNgV != oldImbNgV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSQI__IMB_NG_V, oldImbNgV, imbNgV));
			}
		}
		return imbNgV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetImbNgV() {
		return imbNgV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImbNgV(MV newImbNgV) {
		MV oldImbNgV = imbNgV;
		imbNgV = newImbNgV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSQI__IMB_NG_V, oldImbNgV, imbNgV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEL getImbPPV() {
		if (imbPPV != null && imbPPV.eIsProxy()) {
			InternalEObject oldImbPPV = (InternalEObject)imbPPV;
			imbPPV = (DEL)eResolveProxy(oldImbPPV);
			if (imbPPV != oldImbPPV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSQI__IMB_PPV, oldImbPPV, imbPPV));
			}
		}
		return imbPPV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEL basicGetImbPPV() {
		return imbPPV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImbPPV(DEL newImbPPV) {
		DEL oldImbPPV = imbPPV;
		imbPPV = newImbPPV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSQI__IMB_PPV, oldImbPPV, imbPPV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getImbV() {
		if (imbV != null && imbV.eIsProxy()) {
			InternalEObject oldImbV = (InternalEObject)imbV;
			imbV = (MV)eResolveProxy(oldImbV);
			if (imbV != oldImbV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSQI__IMB_V, oldImbV, imbV));
			}
		}
		return imbV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetImbV() {
		return imbV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImbV(MV newImbV) {
		MV oldImbV = imbV;
		imbV = newImbV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSQI__IMB_V, oldImbV, imbV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getImbZroA() {
		if (imbZroA != null && imbZroA.eIsProxy()) {
			InternalEObject oldImbZroA = (InternalEObject)imbZroA;
			imbZroA = (MV)eResolveProxy(oldImbZroA);
			if (imbZroA != oldImbZroA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSQI__IMB_ZRO_A, oldImbZroA, imbZroA));
			}
		}
		return imbZroA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetImbZroA() {
		return imbZroA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImbZroA(MV newImbZroA) {
		MV oldImbZroA = imbZroA;
		imbZroA = newImbZroA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSQI__IMB_ZRO_A, oldImbZroA, imbZroA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getImbZroV() {
		if (imbZroV != null && imbZroV.eIsProxy()) {
			InternalEObject oldImbZroV = (InternalEObject)imbZroV;
			imbZroV = (MV)eResolveProxy(oldImbZroV);
			if (imbZroV != oldImbZroV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSQI__IMB_ZRO_V, oldImbZroV, imbZroV));
			}
		}
		return imbZroV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetImbZroV() {
		return imbZroV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImbZroV(MV newImbZroV) {
		MV oldImbZroV = imbZroV;
		imbZroV = newImbZroV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSQI__IMB_ZRO_V, oldImbZroV, imbZroV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getMaxImbA() {
		if (maxImbA != null && maxImbA.eIsProxy()) {
			InternalEObject oldMaxImbA = (InternalEObject)maxImbA;
			maxImbA = (WYE)eResolveProxy(oldMaxImbA);
			if (maxImbA != oldMaxImbA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSQI__MAX_IMB_A, oldMaxImbA, maxImbA));
			}
		}
		return maxImbA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetMaxImbA() {
		return maxImbA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxImbA(WYE newMaxImbA) {
		WYE oldMaxImbA = maxImbA;
		maxImbA = newMaxImbA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSQI__MAX_IMB_A, oldMaxImbA, maxImbA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getMaxImbPPV() {
		if (maxImbPPV != null && maxImbPPV.eIsProxy()) {
			InternalEObject oldMaxImbPPV = (InternalEObject)maxImbPPV;
			maxImbPPV = (WYE)eResolveProxy(oldMaxImbPPV);
			if (maxImbPPV != oldMaxImbPPV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSQI__MAX_IMB_PPV, oldMaxImbPPV, maxImbPPV));
			}
		}
		return maxImbPPV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetMaxImbPPV() {
		return maxImbPPV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxImbPPV(WYE newMaxImbPPV) {
		WYE oldMaxImbPPV = maxImbPPV;
		maxImbPPV = newMaxImbPPV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSQI__MAX_IMB_PPV, oldMaxImbPPV, maxImbPPV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getMaxImbV() {
		if (maxImbV != null && maxImbV.eIsProxy()) {
			InternalEObject oldMaxImbV = (InternalEObject)maxImbV;
			maxImbV = (WYE)eResolveProxy(oldMaxImbV);
			if (maxImbV != oldMaxImbV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MSQI__MAX_IMB_V, oldMaxImbV, maxImbV));
			}
		}
		return maxImbV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetMaxImbV() {
		return maxImbV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxImbV(WYE newMaxImbV) {
		WYE oldMaxImbV = maxImbV;
		maxImbV = newMaxImbV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MSQI__MAX_IMB_V, oldMaxImbV, maxImbV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupMPackage.MSQI__EE_NAME:
				if (resolve) return getEEName();
				return basicGetEEName();
			case LNGroupMPackage.MSQI__EE_HEALTH:
				return getEEHealth();
			case LNGroupMPackage.MSQI__SEQ_A:
				if (resolve) return getSeqA();
				return basicGetSeqA();
			case LNGroupMPackage.MSQI__SEQ_V:
				if (resolve) return getSeqV();
				return basicGetSeqV();
			case LNGroupMPackage.MSQI__DQ0_SEQ:
				if (resolve) return getDQ0Seq();
				return basicGetDQ0Seq();
			case LNGroupMPackage.MSQI__IMB_A:
				if (resolve) return getImbA();
				return basicGetImbA();
			case LNGroupMPackage.MSQI__IMB_NG_A:
				if (resolve) return getImbNgA();
				return basicGetImbNgA();
			case LNGroupMPackage.MSQI__IMB_NG_V:
				if (resolve) return getImbNgV();
				return basicGetImbNgV();
			case LNGroupMPackage.MSQI__IMB_PPV:
				if (resolve) return getImbPPV();
				return basicGetImbPPV();
			case LNGroupMPackage.MSQI__IMB_V:
				if (resolve) return getImbV();
				return basicGetImbV();
			case LNGroupMPackage.MSQI__IMB_ZRO_A:
				if (resolve) return getImbZroA();
				return basicGetImbZroA();
			case LNGroupMPackage.MSQI__IMB_ZRO_V:
				if (resolve) return getImbZroV();
				return basicGetImbZroV();
			case LNGroupMPackage.MSQI__MAX_IMB_A:
				if (resolve) return getMaxImbA();
				return basicGetMaxImbA();
			case LNGroupMPackage.MSQI__MAX_IMB_PPV:
				if (resolve) return getMaxImbPPV();
				return basicGetMaxImbPPV();
			case LNGroupMPackage.MSQI__MAX_IMB_V:
				if (resolve) return getMaxImbV();
				return basicGetMaxImbV();
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
			case LNGroupMPackage.MSQI__EE_NAME:
				setEEName((DPL)newValue);
				return;
			case LNGroupMPackage.MSQI__EE_HEALTH:
				setEEHealth((HealthStateKind)newValue);
				return;
			case LNGroupMPackage.MSQI__SEQ_A:
				setSeqA((SEQ)newValue);
				return;
			case LNGroupMPackage.MSQI__SEQ_V:
				setSeqV((SEQ)newValue);
				return;
			case LNGroupMPackage.MSQI__DQ0_SEQ:
				setDQ0Seq((SEQ)newValue);
				return;
			case LNGroupMPackage.MSQI__IMB_A:
				setImbA((WYE)newValue);
				return;
			case LNGroupMPackage.MSQI__IMB_NG_A:
				setImbNgA((MV)newValue);
				return;
			case LNGroupMPackage.MSQI__IMB_NG_V:
				setImbNgV((MV)newValue);
				return;
			case LNGroupMPackage.MSQI__IMB_PPV:
				setImbPPV((DEL)newValue);
				return;
			case LNGroupMPackage.MSQI__IMB_V:
				setImbV((MV)newValue);
				return;
			case LNGroupMPackage.MSQI__IMB_ZRO_A:
				setImbZroA((MV)newValue);
				return;
			case LNGroupMPackage.MSQI__IMB_ZRO_V:
				setImbZroV((MV)newValue);
				return;
			case LNGroupMPackage.MSQI__MAX_IMB_A:
				setMaxImbA((WYE)newValue);
				return;
			case LNGroupMPackage.MSQI__MAX_IMB_PPV:
				setMaxImbPPV((WYE)newValue);
				return;
			case LNGroupMPackage.MSQI__MAX_IMB_V:
				setMaxImbV((WYE)newValue);
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
			case LNGroupMPackage.MSQI__EE_NAME:
				setEEName((DPL)null);
				return;
			case LNGroupMPackage.MSQI__EE_HEALTH:
				setEEHealth(EE_HEALTH_EDEFAULT);
				return;
			case LNGroupMPackage.MSQI__SEQ_A:
				setSeqA((SEQ)null);
				return;
			case LNGroupMPackage.MSQI__SEQ_V:
				setSeqV((SEQ)null);
				return;
			case LNGroupMPackage.MSQI__DQ0_SEQ:
				setDQ0Seq((SEQ)null);
				return;
			case LNGroupMPackage.MSQI__IMB_A:
				setImbA((WYE)null);
				return;
			case LNGroupMPackage.MSQI__IMB_NG_A:
				setImbNgA((MV)null);
				return;
			case LNGroupMPackage.MSQI__IMB_NG_V:
				setImbNgV((MV)null);
				return;
			case LNGroupMPackage.MSQI__IMB_PPV:
				setImbPPV((DEL)null);
				return;
			case LNGroupMPackage.MSQI__IMB_V:
				setImbV((MV)null);
				return;
			case LNGroupMPackage.MSQI__IMB_ZRO_A:
				setImbZroA((MV)null);
				return;
			case LNGroupMPackage.MSQI__IMB_ZRO_V:
				setImbZroV((MV)null);
				return;
			case LNGroupMPackage.MSQI__MAX_IMB_A:
				setMaxImbA((WYE)null);
				return;
			case LNGroupMPackage.MSQI__MAX_IMB_PPV:
				setMaxImbPPV((WYE)null);
				return;
			case LNGroupMPackage.MSQI__MAX_IMB_V:
				setMaxImbV((WYE)null);
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
			case LNGroupMPackage.MSQI__EE_NAME:
				return eeName != null;
			case LNGroupMPackage.MSQI__EE_HEALTH:
				return eeHealth != EE_HEALTH_EDEFAULT;
			case LNGroupMPackage.MSQI__SEQ_A:
				return seqA != null;
			case LNGroupMPackage.MSQI__SEQ_V:
				return seqV != null;
			case LNGroupMPackage.MSQI__DQ0_SEQ:
				return dq0Seq != null;
			case LNGroupMPackage.MSQI__IMB_A:
				return imbA != null;
			case LNGroupMPackage.MSQI__IMB_NG_A:
				return imbNgA != null;
			case LNGroupMPackage.MSQI__IMB_NG_V:
				return imbNgV != null;
			case LNGroupMPackage.MSQI__IMB_PPV:
				return imbPPV != null;
			case LNGroupMPackage.MSQI__IMB_V:
				return imbV != null;
			case LNGroupMPackage.MSQI__IMB_ZRO_A:
				return imbZroA != null;
			case LNGroupMPackage.MSQI__IMB_ZRO_V:
				return imbZroV != null;
			case LNGroupMPackage.MSQI__MAX_IMB_A:
				return maxImbA != null;
			case LNGroupMPackage.MSQI__MAX_IMB_PPV:
				return maxImbPPV != null;
			case LNGroupMPackage.MSQI__MAX_IMB_V:
				return maxImbV != null;
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

} //MSQIImpl
