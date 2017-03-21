/**
 */
package substationStandard.Dataclasses.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import substationStandard.Dataclasses.DataclassesPackage;
import substationStandard.Dataclasses.HMV;
import substationStandard.Dataclasses.MagReference;
import substationStandard.Dataclasses.Quality;
import substationStandard.Dataclasses.TimeStamp;
import substationStandard.Dataclasses.Units;
import substationStandard.Dataclasses.VectorArray;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HMV</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.impl.HMVImpl#getQ <em>Q</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.HMVImpl#getT <em>T</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.HMVImpl#getHar <em>Har</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.HMVImpl#getNumHar <em>Num Har</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.HMVImpl#getNumCyc <em>Num Cyc</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.HMVImpl#getEvalTm <em>Eval Tm</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.HMVImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.HMVImpl#getSmpRate <em>Smp Rate</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.HMVImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.HMVImpl#getHvRef <em>Hv Ref</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.HMVImpl#getRmsCyc <em>Rms Cyc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HMVImpl extends MinimalEObjectImpl.Container implements HMV {
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
	 * The cached value of the '{@link #getHar() <em>Har</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHar()
	 * @generated
	 * @ordered
	 */
	protected VectorArray har;

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
	protected HMVImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.HMV;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.HMV__Q, oldQ, q));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HMV__Q, oldQ, q));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.HMV__T, oldT, t));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HMV__T, oldT, t));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorArray getHar() {
		if (har != null && har.eIsProxy()) {
			InternalEObject oldHar = (InternalEObject)har;
			har = (VectorArray)eResolveProxy(oldHar);
			if (har != oldHar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.HMV__HAR, oldHar, har));
			}
		}
		return har;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorArray basicGetHar() {
		return har;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHar(VectorArray newHar) {
		VectorArray oldHar = har;
		har = newHar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HMV__HAR, oldHar, har));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HMV__NUM_HAR, oldNumHar, numHar));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HMV__NUM_CYC, oldNumCyc, numCyc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HMV__EVAL_TM, oldEvalTm, evalTm));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.HMV__UNITS, oldUnits, units));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HMV__UNITS, oldUnits, units));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HMV__SMP_RATE, oldSmpRate, smpRate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HMV__FREQUENCY, oldFrequency, frequency));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.HMV__HV_REF, oldHvRef, hvRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HMV__HV_REF, oldHvRef, hvRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.HMV__RMS_CYC, oldRmsCyc, rmsCyc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.HMV__Q:
				if (resolve) return getQ();
				return basicGetQ();
			case DataclassesPackage.HMV__T:
				if (resolve) return getT();
				return basicGetT();
			case DataclassesPackage.HMV__HAR:
				if (resolve) return getHar();
				return basicGetHar();
			case DataclassesPackage.HMV__NUM_HAR:
				return getNumHar();
			case DataclassesPackage.HMV__NUM_CYC:
				return getNumCyc();
			case DataclassesPackage.HMV__EVAL_TM:
				return getEvalTm();
			case DataclassesPackage.HMV__UNITS:
				if (resolve) return getUnits();
				return basicGetUnits();
			case DataclassesPackage.HMV__SMP_RATE:
				return getSmpRate();
			case DataclassesPackage.HMV__FREQUENCY:
				return getFrequency();
			case DataclassesPackage.HMV__HV_REF:
				if (resolve) return getHvRef();
				return basicGetHvRef();
			case DataclassesPackage.HMV__RMS_CYC:
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
			case DataclassesPackage.HMV__Q:
				setQ((Quality)newValue);
				return;
			case DataclassesPackage.HMV__T:
				setT((TimeStamp)newValue);
				return;
			case DataclassesPackage.HMV__HAR:
				setHar((VectorArray)newValue);
				return;
			case DataclassesPackage.HMV__NUM_HAR:
				setNumHar((Integer)newValue);
				return;
			case DataclassesPackage.HMV__NUM_CYC:
				setNumCyc((Integer)newValue);
				return;
			case DataclassesPackage.HMV__EVAL_TM:
				setEvalTm((Integer)newValue);
				return;
			case DataclassesPackage.HMV__UNITS:
				setUnits((Units)newValue);
				return;
			case DataclassesPackage.HMV__SMP_RATE:
				setSmpRate((Integer)newValue);
				return;
			case DataclassesPackage.HMV__FREQUENCY:
				setFrequency((Float)newValue);
				return;
			case DataclassesPackage.HMV__HV_REF:
				setHvRef((MagReference)newValue);
				return;
			case DataclassesPackage.HMV__RMS_CYC:
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
			case DataclassesPackage.HMV__Q:
				setQ((Quality)null);
				return;
			case DataclassesPackage.HMV__T:
				setT((TimeStamp)null);
				return;
			case DataclassesPackage.HMV__HAR:
				setHar((VectorArray)null);
				return;
			case DataclassesPackage.HMV__NUM_HAR:
				setNumHar(NUM_HAR_EDEFAULT);
				return;
			case DataclassesPackage.HMV__NUM_CYC:
				setNumCyc(NUM_CYC_EDEFAULT);
				return;
			case DataclassesPackage.HMV__EVAL_TM:
				setEvalTm(EVAL_TM_EDEFAULT);
				return;
			case DataclassesPackage.HMV__UNITS:
				setUnits((Units)null);
				return;
			case DataclassesPackage.HMV__SMP_RATE:
				setSmpRate(SMP_RATE_EDEFAULT);
				return;
			case DataclassesPackage.HMV__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case DataclassesPackage.HMV__HV_REF:
				setHvRef((MagReference)null);
				return;
			case DataclassesPackage.HMV__RMS_CYC:
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
			case DataclassesPackage.HMV__Q:
				return q != null;
			case DataclassesPackage.HMV__T:
				return t != null;
			case DataclassesPackage.HMV__HAR:
				return har != null;
			case DataclassesPackage.HMV__NUM_HAR:
				return numHar != NUM_HAR_EDEFAULT;
			case DataclassesPackage.HMV__NUM_CYC:
				return numCyc != NUM_CYC_EDEFAULT;
			case DataclassesPackage.HMV__EVAL_TM:
				return evalTm != EVAL_TM_EDEFAULT;
			case DataclassesPackage.HMV__UNITS:
				return units != null;
			case DataclassesPackage.HMV__SMP_RATE:
				return smpRate != SMP_RATE_EDEFAULT;
			case DataclassesPackage.HMV__FREQUENCY:
				return frequency != FREQUENCY_EDEFAULT;
			case DataclassesPackage.HMV__HV_REF:
				return hvRef != null;
			case DataclassesPackage.HMV__RMS_CYC:
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

} //HMVImpl
