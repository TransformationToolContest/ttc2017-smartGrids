/**
 */
package substationStandard.Dataclasses.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import substationStandard.Dataclasses.AnalogueValue;
import substationStandard.Dataclasses.DataclassesPackage;
import substationStandard.Dataclasses.Quality;
import substationStandard.Dataclasses.SAV;
import substationStandard.Dataclasses.ScaledValueConfig;
import substationStandard.Dataclasses.TimeStamp;
import substationStandard.Dataclasses.Units;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SAV</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.impl.SAVImpl#getInstMag <em>Inst Mag</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.SAVImpl#getQ <em>Q</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.SAVImpl#getT <em>T</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.SAVImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.SAVImpl#getSVC <em>SVC</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.SAVImpl#getMin <em>Min</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.SAVImpl#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SAVImpl extends MinimalEObjectImpl.Container implements SAV {
	/**
	 * The cached value of the '{@link #getInstMag() <em>Inst Mag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstMag()
	 * @generated
	 * @ordered
	 */
	protected AnalogueValue instMag;

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
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected Units units;

	/**
	 * The cached value of the '{@link #getSVC() <em>SVC</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVC()
	 * @generated
	 * @ordered
	 */
	protected ScaledValueConfig sVC;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected AnalogueValue min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected AnalogueValue max;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SAVImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.SAV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue getInstMag() {
		if (instMag != null && instMag.eIsProxy()) {
			InternalEObject oldInstMag = (InternalEObject)instMag;
			instMag = (AnalogueValue)eResolveProxy(oldInstMag);
			if (instMag != oldInstMag) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.SAV__INST_MAG, oldInstMag, instMag));
			}
		}
		return instMag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue basicGetInstMag() {
		return instMag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstMag(AnalogueValue newInstMag) {
		AnalogueValue oldInstMag = instMag;
		instMag = newInstMag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SAV__INST_MAG, oldInstMag, instMag));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.SAV__Q, oldQ, q));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SAV__Q, oldQ, q));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.SAV__T, oldT, t));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SAV__T, oldT, t));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.SAV__UNITS, oldUnits, units));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SAV__UNITS, oldUnits, units));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaledValueConfig getSVC() {
		if (sVC != null && sVC.eIsProxy()) {
			InternalEObject oldSVC = (InternalEObject)sVC;
			sVC = (ScaledValueConfig)eResolveProxy(oldSVC);
			if (sVC != oldSVC) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.SAV__SVC, oldSVC, sVC));
			}
		}
		return sVC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaledValueConfig basicGetSVC() {
		return sVC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSVC(ScaledValueConfig newSVC) {
		ScaledValueConfig oldSVC = sVC;
		sVC = newSVC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SAV__SVC, oldSVC, sVC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue getMin() {
		if (min != null && min.eIsProxy()) {
			InternalEObject oldMin = (InternalEObject)min;
			min = (AnalogueValue)eResolveProxy(oldMin);
			if (min != oldMin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.SAV__MIN, oldMin, min));
			}
		}
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue basicGetMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(AnalogueValue newMin) {
		AnalogueValue oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SAV__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue getMax() {
		if (max != null && max.eIsProxy()) {
			InternalEObject oldMax = (InternalEObject)max;
			max = (AnalogueValue)eResolveProxy(oldMax);
			if (max != oldMax) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.SAV__MAX, oldMax, max));
			}
		}
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue basicGetMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(AnalogueValue newMax) {
		AnalogueValue oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SAV__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.SAV__INST_MAG:
				if (resolve) return getInstMag();
				return basicGetInstMag();
			case DataclassesPackage.SAV__Q:
				if (resolve) return getQ();
				return basicGetQ();
			case DataclassesPackage.SAV__T:
				if (resolve) return getT();
				return basicGetT();
			case DataclassesPackage.SAV__UNITS:
				if (resolve) return getUnits();
				return basicGetUnits();
			case DataclassesPackage.SAV__SVC:
				if (resolve) return getSVC();
				return basicGetSVC();
			case DataclassesPackage.SAV__MIN:
				if (resolve) return getMin();
				return basicGetMin();
			case DataclassesPackage.SAV__MAX:
				if (resolve) return getMax();
				return basicGetMax();
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
			case DataclassesPackage.SAV__INST_MAG:
				setInstMag((AnalogueValue)newValue);
				return;
			case DataclassesPackage.SAV__Q:
				setQ((Quality)newValue);
				return;
			case DataclassesPackage.SAV__T:
				setT((TimeStamp)newValue);
				return;
			case DataclassesPackage.SAV__UNITS:
				setUnits((Units)newValue);
				return;
			case DataclassesPackage.SAV__SVC:
				setSVC((ScaledValueConfig)newValue);
				return;
			case DataclassesPackage.SAV__MIN:
				setMin((AnalogueValue)newValue);
				return;
			case DataclassesPackage.SAV__MAX:
				setMax((AnalogueValue)newValue);
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
			case DataclassesPackage.SAV__INST_MAG:
				setInstMag((AnalogueValue)null);
				return;
			case DataclassesPackage.SAV__Q:
				setQ((Quality)null);
				return;
			case DataclassesPackage.SAV__T:
				setT((TimeStamp)null);
				return;
			case DataclassesPackage.SAV__UNITS:
				setUnits((Units)null);
				return;
			case DataclassesPackage.SAV__SVC:
				setSVC((ScaledValueConfig)null);
				return;
			case DataclassesPackage.SAV__MIN:
				setMin((AnalogueValue)null);
				return;
			case DataclassesPackage.SAV__MAX:
				setMax((AnalogueValue)null);
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
			case DataclassesPackage.SAV__INST_MAG:
				return instMag != null;
			case DataclassesPackage.SAV__Q:
				return q != null;
			case DataclassesPackage.SAV__T:
				return t != null;
			case DataclassesPackage.SAV__UNITS:
				return units != null;
			case DataclassesPackage.SAV__SVC:
				return sVC != null;
			case DataclassesPackage.SAV__MIN:
				return min != null;
			case DataclassesPackage.SAV__MAX:
				return max != null;
		}
		return super.eIsSet(featureID);
	}

} //SAVImpl
