/**
 */
package gluemodel.substationStandard.Dataclasses.impl;

import gluemodel.substationStandard.Dataclasses.DPC;
import gluemodel.substationStandard.Dataclasses.DPStatus;
import gluemodel.substationStandard.Dataclasses.DataclassesPackage;
import gluemodel.substationStandard.Dataclasses.PulseConfig;
import gluemodel.substationStandard.Dataclasses.Quality;
import gluemodel.substationStandard.Dataclasses.TimeStamp;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.DPCImpl#isCtlVal <em>Ctl Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.DPCImpl#getStVal <em>St Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.DPCImpl#getQ <em>Q</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.DPCImpl#getT <em>T</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.DPCImpl#getSubVal <em>Sub Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.DPCImpl#getPulseConfig <em>Pulse Config</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DPCImpl extends MinimalEObjectImpl.Container implements DPC {
	/**
	 * The default value of the '{@link #isCtlVal() <em>Ctl Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCtlVal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CTL_VAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCtlVal() <em>Ctl Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCtlVal()
	 * @generated
	 * @ordered
	 */
	protected boolean ctlVal = CTL_VAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStVal() <em>St Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStVal()
	 * @generated
	 * @ordered
	 */
	protected DPStatus stVal;

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
	 * The cached value of the '{@link #getSubVal() <em>Sub Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubVal()
	 * @generated
	 * @ordered
	 */
	protected DPStatus subVal;

	/**
	 * The cached value of the '{@link #getPulseConfig() <em>Pulse Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPulseConfig()
	 * @generated
	 * @ordered
	 */
	protected PulseConfig pulseConfig;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DPCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.DPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCtlVal() {
		return ctlVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCtlVal(boolean newCtlVal) {
		boolean oldCtlVal = ctlVal;
		ctlVal = newCtlVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.DPC__CTL_VAL, oldCtlVal, ctlVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPStatus getStVal() {
		if (stVal != null && stVal.eIsProxy()) {
			InternalEObject oldStVal = (InternalEObject)stVal;
			stVal = (DPStatus)eResolveProxy(oldStVal);
			if (stVal != oldStVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.DPC__ST_VAL, oldStVal, stVal));
			}
		}
		return stVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPStatus basicGetStVal() {
		return stVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStVal(DPStatus newStVal) {
		DPStatus oldStVal = stVal;
		stVal = newStVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.DPC__ST_VAL, oldStVal, stVal));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.DPC__Q, oldQ, q));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.DPC__Q, oldQ, q));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.DPC__T, oldT, t));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.DPC__T, oldT, t));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPStatus getSubVal() {
		if (subVal != null && subVal.eIsProxy()) {
			InternalEObject oldSubVal = (InternalEObject)subVal;
			subVal = (DPStatus)eResolveProxy(oldSubVal);
			if (subVal != oldSubVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.DPC__SUB_VAL, oldSubVal, subVal));
			}
		}
		return subVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPStatus basicGetSubVal() {
		return subVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubVal(DPStatus newSubVal) {
		DPStatus oldSubVal = subVal;
		subVal = newSubVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.DPC__SUB_VAL, oldSubVal, subVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PulseConfig getPulseConfig() {
		if (pulseConfig != null && pulseConfig.eIsProxy()) {
			InternalEObject oldPulseConfig = (InternalEObject)pulseConfig;
			pulseConfig = (PulseConfig)eResolveProxy(oldPulseConfig);
			if (pulseConfig != oldPulseConfig) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.DPC__PULSE_CONFIG, oldPulseConfig, pulseConfig));
			}
		}
		return pulseConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PulseConfig basicGetPulseConfig() {
		return pulseConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPulseConfig(PulseConfig newPulseConfig) {
		PulseConfig oldPulseConfig = pulseConfig;
		pulseConfig = newPulseConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.DPC__PULSE_CONFIG, oldPulseConfig, pulseConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.DPC__CTL_VAL:
				return isCtlVal();
			case DataclassesPackage.DPC__ST_VAL:
				if (resolve) return getStVal();
				return basicGetStVal();
			case DataclassesPackage.DPC__Q:
				if (resolve) return getQ();
				return basicGetQ();
			case DataclassesPackage.DPC__T:
				if (resolve) return getT();
				return basicGetT();
			case DataclassesPackage.DPC__SUB_VAL:
				if (resolve) return getSubVal();
				return basicGetSubVal();
			case DataclassesPackage.DPC__PULSE_CONFIG:
				if (resolve) return getPulseConfig();
				return basicGetPulseConfig();
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
			case DataclassesPackage.DPC__CTL_VAL:
				setCtlVal((Boolean)newValue);
				return;
			case DataclassesPackage.DPC__ST_VAL:
				setStVal((DPStatus)newValue);
				return;
			case DataclassesPackage.DPC__Q:
				setQ((Quality)newValue);
				return;
			case DataclassesPackage.DPC__T:
				setT((TimeStamp)newValue);
				return;
			case DataclassesPackage.DPC__SUB_VAL:
				setSubVal((DPStatus)newValue);
				return;
			case DataclassesPackage.DPC__PULSE_CONFIG:
				setPulseConfig((PulseConfig)newValue);
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
			case DataclassesPackage.DPC__CTL_VAL:
				setCtlVal(CTL_VAL_EDEFAULT);
				return;
			case DataclassesPackage.DPC__ST_VAL:
				setStVal((DPStatus)null);
				return;
			case DataclassesPackage.DPC__Q:
				setQ((Quality)null);
				return;
			case DataclassesPackage.DPC__T:
				setT((TimeStamp)null);
				return;
			case DataclassesPackage.DPC__SUB_VAL:
				setSubVal((DPStatus)null);
				return;
			case DataclassesPackage.DPC__PULSE_CONFIG:
				setPulseConfig((PulseConfig)null);
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
			case DataclassesPackage.DPC__CTL_VAL:
				return ctlVal != CTL_VAL_EDEFAULT;
			case DataclassesPackage.DPC__ST_VAL:
				return stVal != null;
			case DataclassesPackage.DPC__Q:
				return q != null;
			case DataclassesPackage.DPC__T:
				return t != null;
			case DataclassesPackage.DPC__SUB_VAL:
				return subVal != null;
			case DataclassesPackage.DPC__PULSE_CONFIG:
				return pulseConfig != null;
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
		result.append(" (ctlVal: ");
		result.append(ctlVal);
		result.append(')');
		return result.toString();
	}

} //DPCImpl
