/**
 */
package gluemodel.substationStandard.Dataclasses.impl;

import gluemodel.substationStandard.Dataclasses.AngleReference;
import gluemodel.substationStandard.Dataclasses.DataclassesPackage;
import gluemodel.substationStandard.Dataclasses.HDEL;
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
 * An implementation of the model object '<em><b>HDEL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HDELImpl#getQ <em>Q</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HDELImpl#getT <em>T</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HDELImpl#getPhsABHar <em>Phs AB Har</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HDELImpl#getPhsBCHar <em>Phs BC Har</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HDELImpl#getPhsCAHar <em>Phs CA Har</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HDELImpl#getNumHar <em>Num Har</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HDELImpl#getNumCyc <em>Num Cyc</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HDELImpl#getEvalTm <em>Eval Tm</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HDELImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HDELImpl#getAngRef <em>Ang Ref</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HDELImpl#getSmpRate <em>Smp Rate</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HDELImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HDELImpl#getHvRef <em>Hv Ref</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.HDELImpl#getRmsCyc <em>Rms Cyc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HDELImpl extends MinimalEObjectImpl.Container implements HDEL {
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
	 * The cached value of the '{@link #getPhsABHar() <em>Phs AB Har</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhsABHar()
	 * @generated
	 * @ordered
	 */
	protected VectorArray phsABHar;

	/**
	 * The cached value of the '{@link #getPhsBCHar() <em>Phs BC Har</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhsBCHar()
	 * @generated
	 * @ordered
	 */
	protected VectorArray phsBCHar;

	/**
	 * The cached value of the '{@link #getPhsCAHar() <em>Phs CA Har</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhsCAHar()
	 * @generated
	 * @ordered
	 */
	protected VectorArray phsCAHar;

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
	protected HDELImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.HDEL;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.HDEL__Q, oldQ, q));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HDEL__Q, oldQ, q));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.HDEL__T, oldT, t));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HDEL__T, oldT, t));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorArray getPhsABHar() {
		if (phsABHar != null && phsABHar.eIsProxy()) {
			InternalEObject oldPhsABHar = (InternalEObject)phsABHar;
			phsABHar = (VectorArray)eResolveProxy(oldPhsABHar);
			if (phsABHar != oldPhsABHar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.HDEL__PHS_AB_HAR, oldPhsABHar, phsABHar));
			}
		}
		return phsABHar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorArray basicGetPhsABHar() {
		return phsABHar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhsABHar(VectorArray newPhsABHar) {
		VectorArray oldPhsABHar = phsABHar;
		phsABHar = newPhsABHar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HDEL__PHS_AB_HAR, oldPhsABHar, phsABHar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorArray getPhsBCHar() {
		if (phsBCHar != null && phsBCHar.eIsProxy()) {
			InternalEObject oldPhsBCHar = (InternalEObject)phsBCHar;
			phsBCHar = (VectorArray)eResolveProxy(oldPhsBCHar);
			if (phsBCHar != oldPhsBCHar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.HDEL__PHS_BC_HAR, oldPhsBCHar, phsBCHar));
			}
		}
		return phsBCHar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorArray basicGetPhsBCHar() {
		return phsBCHar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhsBCHar(VectorArray newPhsBCHar) {
		VectorArray oldPhsBCHar = phsBCHar;
		phsBCHar = newPhsBCHar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HDEL__PHS_BC_HAR, oldPhsBCHar, phsBCHar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorArray getPhsCAHar() {
		if (phsCAHar != null && phsCAHar.eIsProxy()) {
			InternalEObject oldPhsCAHar = (InternalEObject)phsCAHar;
			phsCAHar = (VectorArray)eResolveProxy(oldPhsCAHar);
			if (phsCAHar != oldPhsCAHar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.HDEL__PHS_CA_HAR, oldPhsCAHar, phsCAHar));
			}
		}
		return phsCAHar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorArray basicGetPhsCAHar() {
		return phsCAHar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhsCAHar(VectorArray newPhsCAHar) {
		VectorArray oldPhsCAHar = phsCAHar;
		phsCAHar = newPhsCAHar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HDEL__PHS_CA_HAR, oldPhsCAHar, phsCAHar));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HDEL__NUM_HAR, oldNumHar, numHar));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HDEL__NUM_CYC, oldNumCyc, numCyc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HDEL__EVAL_TM, oldEvalTm, evalTm));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.HDEL__UNITS, oldUnits, units));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HDEL__UNITS, oldUnits, units));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.HDEL__ANG_REF, oldAngRef, angRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HDEL__ANG_REF, oldAngRef, angRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HDEL__SMP_RATE, oldSmpRate, smpRate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HDEL__FREQUENCY, oldFrequency, frequency));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.HDEL__HV_REF, oldHvRef, hvRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HDEL__HV_REF, oldHvRef, hvRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HDEL__RMS_CYC, oldRmsCyc, rmsCyc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.HDEL__Q:
				if (resolve) return getQ();
				return basicGetQ();
			case DataclassesPackage.HDEL__T:
				if (resolve) return getT();
				return basicGetT();
			case DataclassesPackage.HDEL__PHS_AB_HAR:
				if (resolve) return getPhsABHar();
				return basicGetPhsABHar();
			case DataclassesPackage.HDEL__PHS_BC_HAR:
				if (resolve) return getPhsBCHar();
				return basicGetPhsBCHar();
			case DataclassesPackage.HDEL__PHS_CA_HAR:
				if (resolve) return getPhsCAHar();
				return basicGetPhsCAHar();
			case DataclassesPackage.HDEL__NUM_HAR:
				return getNumHar();
			case DataclassesPackage.HDEL__NUM_CYC:
				return getNumCyc();
			case DataclassesPackage.HDEL__EVAL_TM:
				return getEvalTm();
			case DataclassesPackage.HDEL__UNITS:
				if (resolve) return getUnits();
				return basicGetUnits();
			case DataclassesPackage.HDEL__ANG_REF:
				if (resolve) return getAngRef();
				return basicGetAngRef();
			case DataclassesPackage.HDEL__SMP_RATE:
				return getSmpRate();
			case DataclassesPackage.HDEL__FREQUENCY:
				return getFrequency();
			case DataclassesPackage.HDEL__HV_REF:
				if (resolve) return getHvRef();
				return basicGetHvRef();
			case DataclassesPackage.HDEL__RMS_CYC:
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
			case DataclassesPackage.HDEL__Q:
				setQ((Quality)newValue);
				return;
			case DataclassesPackage.HDEL__T:
				setT((TimeStamp)newValue);
				return;
			case DataclassesPackage.HDEL__PHS_AB_HAR:
				setPhsABHar((VectorArray)newValue);
				return;
			case DataclassesPackage.HDEL__PHS_BC_HAR:
				setPhsBCHar((VectorArray)newValue);
				return;
			case DataclassesPackage.HDEL__PHS_CA_HAR:
				setPhsCAHar((VectorArray)newValue);
				return;
			case DataclassesPackage.HDEL__NUM_HAR:
				setNumHar((Integer)newValue);
				return;
			case DataclassesPackage.HDEL__NUM_CYC:
				setNumCyc((Integer)newValue);
				return;
			case DataclassesPackage.HDEL__EVAL_TM:
				setEvalTm((Integer)newValue);
				return;
			case DataclassesPackage.HDEL__UNITS:
				setUnits((Units)newValue);
				return;
			case DataclassesPackage.HDEL__ANG_REF:
				setAngRef((AngleReference)newValue);
				return;
			case DataclassesPackage.HDEL__SMP_RATE:
				setSmpRate((Integer)newValue);
				return;
			case DataclassesPackage.HDEL__FREQUENCY:
				setFrequency((Float)newValue);
				return;
			case DataclassesPackage.HDEL__HV_REF:
				setHvRef((MagReference)newValue);
				return;
			case DataclassesPackage.HDEL__RMS_CYC:
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
			case DataclassesPackage.HDEL__Q:
				setQ((Quality)null);
				return;
			case DataclassesPackage.HDEL__T:
				setT((TimeStamp)null);
				return;
			case DataclassesPackage.HDEL__PHS_AB_HAR:
				setPhsABHar((VectorArray)null);
				return;
			case DataclassesPackage.HDEL__PHS_BC_HAR:
				setPhsBCHar((VectorArray)null);
				return;
			case DataclassesPackage.HDEL__PHS_CA_HAR:
				setPhsCAHar((VectorArray)null);
				return;
			case DataclassesPackage.HDEL__NUM_HAR:
				setNumHar(NUM_HAR_EDEFAULT);
				return;
			case DataclassesPackage.HDEL__NUM_CYC:
				setNumCyc(NUM_CYC_EDEFAULT);
				return;
			case DataclassesPackage.HDEL__EVAL_TM:
				setEvalTm(EVAL_TM_EDEFAULT);
				return;
			case DataclassesPackage.HDEL__UNITS:
				setUnits((Units)null);
				return;
			case DataclassesPackage.HDEL__ANG_REF:
				setAngRef((AngleReference)null);
				return;
			case DataclassesPackage.HDEL__SMP_RATE:
				setSmpRate(SMP_RATE_EDEFAULT);
				return;
			case DataclassesPackage.HDEL__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case DataclassesPackage.HDEL__HV_REF:
				setHvRef((MagReference)null);
				return;
			case DataclassesPackage.HDEL__RMS_CYC:
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
			case DataclassesPackage.HDEL__Q:
				return q != null;
			case DataclassesPackage.HDEL__T:
				return t != null;
			case DataclassesPackage.HDEL__PHS_AB_HAR:
				return phsABHar != null;
			case DataclassesPackage.HDEL__PHS_BC_HAR:
				return phsBCHar != null;
			case DataclassesPackage.HDEL__PHS_CA_HAR:
				return phsCAHar != null;
			case DataclassesPackage.HDEL__NUM_HAR:
				return numHar != NUM_HAR_EDEFAULT;
			case DataclassesPackage.HDEL__NUM_CYC:
				return numCyc != NUM_CYC_EDEFAULT;
			case DataclassesPackage.HDEL__EVAL_TM:
				return evalTm != EVAL_TM_EDEFAULT;
			case DataclassesPackage.HDEL__UNITS:
				return units != null;
			case DataclassesPackage.HDEL__ANG_REF:
				return angRef != null;
			case DataclassesPackage.HDEL__SMP_RATE:
				return smpRate != SMP_RATE_EDEFAULT;
			case DataclassesPackage.HDEL__FREQUENCY:
				return frequency != FREQUENCY_EDEFAULT;
			case DataclassesPackage.HDEL__HV_REF:
				return hvRef != null;
			case DataclassesPackage.HDEL__RMS_CYC:
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

} //HDELImpl
