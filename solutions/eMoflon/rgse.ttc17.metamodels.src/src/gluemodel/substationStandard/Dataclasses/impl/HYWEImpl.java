/**
 */
package gluemodel.substationStandard.Dataclasses.impl;

import gluemodel.substationStandard.Dataclasses.AngleReference;
import gluemodel.substationStandard.Dataclasses.DataclassesPackage;
import gluemodel.substationStandard.Dataclasses.HYWE;
import gluemodel.substationStandard.Dataclasses.MagReference;
import gluemodel.substationStandard.Dataclasses.Quality;
import gluemodel.substationStandard.Dataclasses.TimeStamp;
import gluemodel.substationStandard.Dataclasses.Units;
import gluemodel.substationStandard.Dataclasses.VectorArray;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HYWE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HYWEImpl#getQ <em>Q</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HYWEImpl#getT <em>T</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HYWEImpl#getPhsAHar <em>Phs AHar</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HYWEImpl#getPhsBHar <em>Phs BHar</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HYWEImpl#getPhsCHar <em>Phs CHar</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HYWEImpl#getNeutHar <em>Neut Har</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HYWEImpl#getNetHar <em>Net Har</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HYWEImpl#getResHar <em>Res Har</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HYWEImpl#getNumHar <em>Num Har</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HYWEImpl#getNumCyc <em>Num Cyc</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HYWEImpl#getEvalTm <em>Eval Tm</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HYWEImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HYWEImpl#getAngRef <em>Ang Ref</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HYWEImpl#getSmpRate <em>Smp Rate</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HYWEImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HYWEImpl#getHvRef <em>Hv Ref</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HYWEImpl#getRmsCyc <em>Rms Cyc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HYWEImpl extends MinimalEObjectImpl.Container implements HYWE {
	/**
	 * The cached value of the '{@link #getQ() <em>Q</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ()
	 * @generated
	 * @ordered
	 */
	protected Quality q;

	/**
	 * The cached value of the '{@link #getT() <em>T</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT()
	 * @generated
	 * @ordered
	 */
	protected TimeStamp t;

	/**
	 * The cached value of the '{@link #getPhsAHar() <em>Phs AHar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhsAHar()
	 * @generated
	 * @ordered
	 */
	protected VectorArray phsAHar;

	/**
	 * The cached value of the '{@link #getPhsBHar() <em>Phs BHar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhsBHar()
	 * @generated
	 * @ordered
	 */
	protected VectorArray phsBHar;

	/**
	 * The cached value of the '{@link #getPhsCHar() <em>Phs CHar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhsCHar()
	 * @generated
	 * @ordered
	 */
	protected VectorArray phsCHar;

	/**
	 * The cached value of the '{@link #getNeutHar() <em>Neut Har</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutHar()
	 * @generated
	 * @ordered
	 */
	protected VectorArray neutHar;

	/**
	 * The cached value of the '{@link #getNetHar() <em>Net Har</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetHar()
	 * @generated
	 * @ordered
	 */
	protected VectorArray netHar;

	/**
	 * The cached value of the '{@link #getResHar() <em>Res Har</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResHar()
	 * @generated
	 * @ordered
	 */
	protected VectorArray resHar;

	/**
	 * The default value of the '{@link #getNumHar() <em>Num Har</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumHar()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_HAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumHar() <em>Num Har</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumHar()
	 * @generated
	 * @ordered
	 */
	protected int numHar = NUM_HAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumCyc() <em>Num Cyc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCyc()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_CYC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumCyc() <em>Num Cyc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCyc()
	 * @generated
	 * @ordered
	 */
	protected int numCyc = NUM_CYC_EDEFAULT;

	/**
	 * The default value of the '{@link #getEvalTm() <em>Eval Tm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvalTm()
	 * @generated
	 * @ordered
	 */
	protected static final int EVAL_TM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEvalTm() <em>Eval Tm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvalTm()
	 * @generated
	 * @ordered
	 */
	protected int evalTm = EVAL_TM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected Units units;

	/**
	 * The cached value of the '{@link #getAngRef() <em>Ang Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngRef()
	 * @generated
	 * @ordered
	 */
	protected AngleReference angRef;

	/**
	 * The default value of the '{@link #getSmpRate() <em>Smp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmpRate()
	 * @generated
	 * @ordered
	 */
	protected static final int SMP_RATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSmpRate() <em>Smp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmpRate()
	 * @generated
	 * @ordered
	 */
	protected int smpRate = SMP_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final float FREQUENCY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected float frequency = FREQUENCY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHvRef() <em>Hv Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvRef()
	 * @generated
	 * @ordered
	 */
	protected MagReference hvRef;

	/**
	 * The default value of the '{@link #getRmsCyc() <em>Rms Cyc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRmsCyc()
	 * @generated
	 * @ordered
	 */
	protected static final int RMS_CYC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRmsCyc() <em>Rms Cyc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRmsCyc()
	 * @generated
	 * @ordered
	 */
	protected int rmsCyc = RMS_CYC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HYWEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.HYWE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quality getQ() {
		if (q != null && q.eIsProxy()) {
			InternalEObject oldQ = (InternalEObject)q;
			q = (Quality)eResolveProxy(oldQ);
			if (q != oldQ) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.HYWE__Q, oldQ, q));
			}
		}
		return q;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quality basicGetQ() {
		return q;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQ(Quality newQ) {
		Quality oldQ = q;
		q = newQ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HYWE__Q, oldQ, q));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStamp getT() {
		if (t != null && t.eIsProxy()) {
			InternalEObject oldT = (InternalEObject)t;
			t = (TimeStamp)eResolveProxy(oldT);
			if (t != oldT) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.HYWE__T, oldT, t));
			}
		}
		return t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStamp basicGetT() {
		return t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT(TimeStamp newT) {
		TimeStamp oldT = t;
		t = newT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HYWE__T, oldT, t));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorArray getPhsAHar() {
		if (phsAHar != null && phsAHar.eIsProxy()) {
			InternalEObject oldPhsAHar = (InternalEObject)phsAHar;
			phsAHar = (VectorArray)eResolveProxy(oldPhsAHar);
			if (phsAHar != oldPhsAHar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.HYWE__PHS_AHAR, oldPhsAHar, phsAHar));
			}
		}
		return phsAHar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorArray basicGetPhsAHar() {
		return phsAHar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhsAHar(VectorArray newPhsAHar) {
		VectorArray oldPhsAHar = phsAHar;
		phsAHar = newPhsAHar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HYWE__PHS_AHAR, oldPhsAHar, phsAHar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorArray getPhsBHar() {
		if (phsBHar != null && phsBHar.eIsProxy()) {
			InternalEObject oldPhsBHar = (InternalEObject)phsBHar;
			phsBHar = (VectorArray)eResolveProxy(oldPhsBHar);
			if (phsBHar != oldPhsBHar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.HYWE__PHS_BHAR, oldPhsBHar, phsBHar));
			}
		}
		return phsBHar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorArray basicGetPhsBHar() {
		return phsBHar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhsBHar(VectorArray newPhsBHar) {
		VectorArray oldPhsBHar = phsBHar;
		phsBHar = newPhsBHar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HYWE__PHS_BHAR, oldPhsBHar, phsBHar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorArray getPhsCHar() {
		if (phsCHar != null && phsCHar.eIsProxy()) {
			InternalEObject oldPhsCHar = (InternalEObject)phsCHar;
			phsCHar = (VectorArray)eResolveProxy(oldPhsCHar);
			if (phsCHar != oldPhsCHar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.HYWE__PHS_CHAR, oldPhsCHar, phsCHar));
			}
		}
		return phsCHar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorArray basicGetPhsCHar() {
		return phsCHar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhsCHar(VectorArray newPhsCHar) {
		VectorArray oldPhsCHar = phsCHar;
		phsCHar = newPhsCHar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HYWE__PHS_CHAR, oldPhsCHar, phsCHar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorArray getNeutHar() {
		if (neutHar != null && neutHar.eIsProxy()) {
			InternalEObject oldNeutHar = (InternalEObject)neutHar;
			neutHar = (VectorArray)eResolveProxy(oldNeutHar);
			if (neutHar != oldNeutHar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.HYWE__NEUT_HAR, oldNeutHar, neutHar));
			}
		}
		return neutHar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorArray basicGetNeutHar() {
		return neutHar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeutHar(VectorArray newNeutHar) {
		VectorArray oldNeutHar = neutHar;
		neutHar = newNeutHar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HYWE__NEUT_HAR, oldNeutHar, neutHar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorArray getNetHar() {
		if (netHar != null && netHar.eIsProxy()) {
			InternalEObject oldNetHar = (InternalEObject)netHar;
			netHar = (VectorArray)eResolveProxy(oldNetHar);
			if (netHar != oldNetHar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.HYWE__NET_HAR, oldNetHar, netHar));
			}
		}
		return netHar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorArray basicGetNetHar() {
		return netHar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetHar(VectorArray newNetHar) {
		VectorArray oldNetHar = netHar;
		netHar = newNetHar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HYWE__NET_HAR, oldNetHar, netHar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorArray getResHar() {
		if (resHar != null && resHar.eIsProxy()) {
			InternalEObject oldResHar = (InternalEObject)resHar;
			resHar = (VectorArray)eResolveProxy(oldResHar);
			if (resHar != oldResHar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.HYWE__RES_HAR, oldResHar, resHar));
			}
		}
		return resHar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorArray basicGetResHar() {
		return resHar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResHar(VectorArray newResHar) {
		VectorArray oldResHar = resHar;
		resHar = newResHar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HYWE__RES_HAR, oldResHar, resHar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumHar() {
		return numHar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumHar(int newNumHar) {
		int oldNumHar = numHar;
		numHar = newNumHar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HYWE__NUM_HAR, oldNumHar, numHar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumCyc() {
		return numCyc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumCyc(int newNumCyc) {
		int oldNumCyc = numCyc;
		numCyc = newNumCyc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HYWE__NUM_CYC, oldNumCyc, numCyc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEvalTm() {
		return evalTm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvalTm(int newEvalTm) {
		int oldEvalTm = evalTm;
		evalTm = newEvalTm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HYWE__EVAL_TM, oldEvalTm, evalTm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Units getUnits() {
		if (units != null && units.eIsProxy()) {
			InternalEObject oldUnits = (InternalEObject)units;
			units = (Units)eResolveProxy(oldUnits);
			if (units != oldUnits) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.HYWE__UNITS, oldUnits, units));
			}
		}
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Units basicGetUnits() {
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnits(Units newUnits) {
		Units oldUnits = units;
		units = newUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HYWE__UNITS, oldUnits, units));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleReference getAngRef() {
		if (angRef != null && angRef.eIsProxy()) {
			InternalEObject oldAngRef = (InternalEObject)angRef;
			angRef = (AngleReference)eResolveProxy(oldAngRef);
			if (angRef != oldAngRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.HYWE__ANG_REF, oldAngRef, angRef));
			}
		}
		return angRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleReference basicGetAngRef() {
		return angRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngRef(AngleReference newAngRef) {
		AngleReference oldAngRef = angRef;
		angRef = newAngRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HYWE__ANG_REF, oldAngRef, angRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSmpRate() {
		return smpRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmpRate(int newSmpRate) {
		int oldSmpRate = smpRate;
		smpRate = newSmpRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HYWE__SMP_RATE, oldSmpRate, smpRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(float newFrequency) {
		float oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HYWE__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MagReference getHvRef() {
		if (hvRef != null && hvRef.eIsProxy()) {
			InternalEObject oldHvRef = (InternalEObject)hvRef;
			hvRef = (MagReference)eResolveProxy(oldHvRef);
			if (hvRef != oldHvRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.HYWE__HV_REF, oldHvRef, hvRef));
			}
		}
		return hvRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MagReference basicGetHvRef() {
		return hvRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHvRef(MagReference newHvRef) {
		MagReference oldHvRef = hvRef;
		hvRef = newHvRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HYWE__HV_REF, oldHvRef, hvRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRmsCyc() {
		return rmsCyc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRmsCyc(int newRmsCyc) {
		int oldRmsCyc = rmsCyc;
		rmsCyc = newRmsCyc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HYWE__RMS_CYC, oldRmsCyc, rmsCyc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.HYWE__Q:
				if (resolve) return getQ();
				return basicGetQ();
			case DataclassesPackage.HYWE__T:
				if (resolve) return getT();
				return basicGetT();
			case DataclassesPackage.HYWE__PHS_AHAR:
				if (resolve) return getPhsAHar();
				return basicGetPhsAHar();
			case DataclassesPackage.HYWE__PHS_BHAR:
				if (resolve) return getPhsBHar();
				return basicGetPhsBHar();
			case DataclassesPackage.HYWE__PHS_CHAR:
				if (resolve) return getPhsCHar();
				return basicGetPhsCHar();
			case DataclassesPackage.HYWE__NEUT_HAR:
				if (resolve) return getNeutHar();
				return basicGetNeutHar();
			case DataclassesPackage.HYWE__NET_HAR:
				if (resolve) return getNetHar();
				return basicGetNetHar();
			case DataclassesPackage.HYWE__RES_HAR:
				if (resolve) return getResHar();
				return basicGetResHar();
			case DataclassesPackage.HYWE__NUM_HAR:
				return getNumHar();
			case DataclassesPackage.HYWE__NUM_CYC:
				return getNumCyc();
			case DataclassesPackage.HYWE__EVAL_TM:
				return getEvalTm();
			case DataclassesPackage.HYWE__UNITS:
				if (resolve) return getUnits();
				return basicGetUnits();
			case DataclassesPackage.HYWE__ANG_REF:
				if (resolve) return getAngRef();
				return basicGetAngRef();
			case DataclassesPackage.HYWE__SMP_RATE:
				return getSmpRate();
			case DataclassesPackage.HYWE__FREQUENCY:
				return getFrequency();
			case DataclassesPackage.HYWE__HV_REF:
				if (resolve) return getHvRef();
				return basicGetHvRef();
			case DataclassesPackage.HYWE__RMS_CYC:
				return getRmsCyc();
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
			case DataclassesPackage.HYWE__Q:
				setQ((Quality)newValue);
				return;
			case DataclassesPackage.HYWE__T:
				setT((TimeStamp)newValue);
				return;
			case DataclassesPackage.HYWE__PHS_AHAR:
				setPhsAHar((VectorArray)newValue);
				return;
			case DataclassesPackage.HYWE__PHS_BHAR:
				setPhsBHar((VectorArray)newValue);
				return;
			case DataclassesPackage.HYWE__PHS_CHAR:
				setPhsCHar((VectorArray)newValue);
				return;
			case DataclassesPackage.HYWE__NEUT_HAR:
				setNeutHar((VectorArray)newValue);
				return;
			case DataclassesPackage.HYWE__NET_HAR:
				setNetHar((VectorArray)newValue);
				return;
			case DataclassesPackage.HYWE__RES_HAR:
				setResHar((VectorArray)newValue);
				return;
			case DataclassesPackage.HYWE__NUM_HAR:
				setNumHar((Integer)newValue);
				return;
			case DataclassesPackage.HYWE__NUM_CYC:
				setNumCyc((Integer)newValue);
				return;
			case DataclassesPackage.HYWE__EVAL_TM:
				setEvalTm((Integer)newValue);
				return;
			case DataclassesPackage.HYWE__UNITS:
				setUnits((Units)newValue);
				return;
			case DataclassesPackage.HYWE__ANG_REF:
				setAngRef((AngleReference)newValue);
				return;
			case DataclassesPackage.HYWE__SMP_RATE:
				setSmpRate((Integer)newValue);
				return;
			case DataclassesPackage.HYWE__FREQUENCY:
				setFrequency((Float)newValue);
				return;
			case DataclassesPackage.HYWE__HV_REF:
				setHvRef((MagReference)newValue);
				return;
			case DataclassesPackage.HYWE__RMS_CYC:
				setRmsCyc((Integer)newValue);
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
			case DataclassesPackage.HYWE__Q:
				setQ((Quality)null);
				return;
			case DataclassesPackage.HYWE__T:
				setT((TimeStamp)null);
				return;
			case DataclassesPackage.HYWE__PHS_AHAR:
				setPhsAHar((VectorArray)null);
				return;
			case DataclassesPackage.HYWE__PHS_BHAR:
				setPhsBHar((VectorArray)null);
				return;
			case DataclassesPackage.HYWE__PHS_CHAR:
				setPhsCHar((VectorArray)null);
				return;
			case DataclassesPackage.HYWE__NEUT_HAR:
				setNeutHar((VectorArray)null);
				return;
			case DataclassesPackage.HYWE__NET_HAR:
				setNetHar((VectorArray)null);
				return;
			case DataclassesPackage.HYWE__RES_HAR:
				setResHar((VectorArray)null);
				return;
			case DataclassesPackage.HYWE__NUM_HAR:
				setNumHar(NUM_HAR_EDEFAULT);
				return;
			case DataclassesPackage.HYWE__NUM_CYC:
				setNumCyc(NUM_CYC_EDEFAULT);
				return;
			case DataclassesPackage.HYWE__EVAL_TM:
				setEvalTm(EVAL_TM_EDEFAULT);
				return;
			case DataclassesPackage.HYWE__UNITS:
				setUnits((Units)null);
				return;
			case DataclassesPackage.HYWE__ANG_REF:
				setAngRef((AngleReference)null);
				return;
			case DataclassesPackage.HYWE__SMP_RATE:
				setSmpRate(SMP_RATE_EDEFAULT);
				return;
			case DataclassesPackage.HYWE__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case DataclassesPackage.HYWE__HV_REF:
				setHvRef((MagReference)null);
				return;
			case DataclassesPackage.HYWE__RMS_CYC:
				setRmsCyc(RMS_CYC_EDEFAULT);
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
			case DataclassesPackage.HYWE__Q:
				return q != null;
			case DataclassesPackage.HYWE__T:
				return t != null;
			case DataclassesPackage.HYWE__PHS_AHAR:
				return phsAHar != null;
			case DataclassesPackage.HYWE__PHS_BHAR:
				return phsBHar != null;
			case DataclassesPackage.HYWE__PHS_CHAR:
				return phsCHar != null;
			case DataclassesPackage.HYWE__NEUT_HAR:
				return neutHar != null;
			case DataclassesPackage.HYWE__NET_HAR:
				return netHar != null;
			case DataclassesPackage.HYWE__RES_HAR:
				return resHar != null;
			case DataclassesPackage.HYWE__NUM_HAR:
				return numHar != NUM_HAR_EDEFAULT;
			case DataclassesPackage.HYWE__NUM_CYC:
				return numCyc != NUM_CYC_EDEFAULT;
			case DataclassesPackage.HYWE__EVAL_TM:
				return evalTm != EVAL_TM_EDEFAULT;
			case DataclassesPackage.HYWE__UNITS:
				return units != null;
			case DataclassesPackage.HYWE__ANG_REF:
				return angRef != null;
			case DataclassesPackage.HYWE__SMP_RATE:
				return smpRate != SMP_RATE_EDEFAULT;
			case DataclassesPackage.HYWE__FREQUENCY:
				return frequency != FREQUENCY_EDEFAULT;
			case DataclassesPackage.HYWE__HV_REF:
				return hvRef != null;
			case DataclassesPackage.HYWE__RMS_CYC:
				return rmsCyc != RMS_CYC_EDEFAULT;
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
		result.append(" (numHar: ");
		result.append(numHar);
		result.append(", numCyc: ");
		result.append(numCyc);
		result.append(", evalTm: ");
		result.append(evalTm);
		result.append(", smpRate: ");
		result.append(smpRate);
		result.append(", frequency: ");
		result.append(frequency);
		result.append(", rmsCyc: ");
		result.append(rmsCyc);
		result.append(')');
		return result.toString();
	}

} //HYWEImpl
