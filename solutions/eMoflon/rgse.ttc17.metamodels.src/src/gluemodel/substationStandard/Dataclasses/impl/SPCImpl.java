/**
 */
package gluemodel.substationStandard.Dataclasses.impl;

import gluemodel.substationStandard.Dataclasses.DataclassesPackage;
import gluemodel.substationStandard.Dataclasses.PulseConfig;
import gluemodel.substationStandard.Dataclasses.Quality;
import gluemodel.substationStandard.Dataclasses.SPC;
import gluemodel.substationStandard.Dataclasses.TimeStamp;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.SPCImpl#isCtlVal <em>Ctl Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.SPCImpl#isStVal <em>St Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.SPCImpl#getQ <em>Q</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.SPCImpl#getT <em>T</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.SPCImpl#isSubVal <em>Sub Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.SPCImpl#getPulseConfig <em>Pulse Config</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SPCImpl extends MinimalEObjectImpl.Container implements SPC {
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
	 * The default value of the '{@link #isStVal() <em>St Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStVal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ST_VAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStVal() <em>St Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStVal()
	 * @generated
	 * @ordered
	 */
	protected boolean stVal = ST_VAL_EDEFAULT;

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
	 * The default value of the '{@link #isSubVal() <em>Sub Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubVal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUB_VAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSubVal() <em>Sub Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubVal()
	 * @generated
	 * @ordered
	 */
	protected boolean subVal = SUB_VAL_EDEFAULT;

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
	protected SPCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.SPC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SPC__CTL_VAL, oldCtlVal, ctlVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStVal() {
		return stVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStVal(boolean newStVal) {
		boolean oldStVal = stVal;
		stVal = newStVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SPC__ST_VAL, oldStVal, stVal));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.SPC__Q, oldQ, q));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SPC__Q, oldQ, q));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.SPC__T, oldT, t));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SPC__T, oldT, t));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSubVal() {
		return subVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubVal(boolean newSubVal) {
		boolean oldSubVal = subVal;
		subVal = newSubVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SPC__SUB_VAL, oldSubVal, subVal));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.SPC__PULSE_CONFIG, oldPulseConfig, pulseConfig));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SPC__PULSE_CONFIG, oldPulseConfig, pulseConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.SPC__CTL_VAL:
				return isCtlVal();
			case DataclassesPackage.SPC__ST_VAL:
				return isStVal();
			case DataclassesPackage.SPC__Q:
				if (resolve) return getQ();
				return basicGetQ();
			case DataclassesPackage.SPC__T:
				if (resolve) return getT();
				return basicGetT();
			case DataclassesPackage.SPC__SUB_VAL:
				return isSubVal();
			case DataclassesPackage.SPC__PULSE_CONFIG:
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
			case DataclassesPackage.SPC__CTL_VAL:
				setCtlVal((Boolean)newValue);
				return;
			case DataclassesPackage.SPC__ST_VAL:
				setStVal((Boolean)newValue);
				return;
			case DataclassesPackage.SPC__Q:
				setQ((Quality)newValue);
				return;
			case DataclassesPackage.SPC__T:
				setT((TimeStamp)newValue);
				return;
			case DataclassesPackage.SPC__SUB_VAL:
				setSubVal((Boolean)newValue);
				return;
			case DataclassesPackage.SPC__PULSE_CONFIG:
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
			case DataclassesPackage.SPC__CTL_VAL:
				setCtlVal(CTL_VAL_EDEFAULT);
				return;
			case DataclassesPackage.SPC__ST_VAL:
				setStVal(ST_VAL_EDEFAULT);
				return;
			case DataclassesPackage.SPC__Q:
				setQ((Quality)null);
				return;
			case DataclassesPackage.SPC__T:
				setT((TimeStamp)null);
				return;
			case DataclassesPackage.SPC__SUB_VAL:
				setSubVal(SUB_VAL_EDEFAULT);
				return;
			case DataclassesPackage.SPC__PULSE_CONFIG:
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
			case DataclassesPackage.SPC__CTL_VAL:
				return ctlVal != CTL_VAL_EDEFAULT;
			case DataclassesPackage.SPC__ST_VAL:
				return stVal != ST_VAL_EDEFAULT;
			case DataclassesPackage.SPC__Q:
				return q != null;
			case DataclassesPackage.SPC__T:
				return t != null;
			case DataclassesPackage.SPC__SUB_VAL:
				return subVal != SUB_VAL_EDEFAULT;
			case DataclassesPackage.SPC__PULSE_CONFIG:
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
		result.append(", stVal: ");
		result.append(stVal);
		result.append(", subVal: ");
		result.append(subVal);
		result.append(')');
		return result.toString();
	}

} //SPCImpl
