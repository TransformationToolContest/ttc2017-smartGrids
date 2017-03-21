/**
 */
package substationStandard.Dataclasses.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import substationStandard.Dataclasses.DataclassesPackage;
import substationStandard.Dataclasses.INC;
import substationStandard.Dataclasses.Quality;
import substationStandard.Dataclasses.TimeStamp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>INC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.impl.INCImpl#getCtlVal <em>Ctl Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.INCImpl#getStVal <em>St Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.INCImpl#getQ <em>Q</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.INCImpl#getT <em>T</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.INCImpl#getSubVal <em>Sub Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.INCImpl#getMinVal <em>Min Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.INCImpl#getMaxVal <em>Max Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.INCImpl#getStepSize <em>Step Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class INCImpl extends MinimalEObjectImpl.Container implements INC {
	/**
	 * The default value of the '{@link #getCtlVal() <em>Ctl Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtlVal()
	 * @generated
	 * @ordered
	 */
	protected static final int CTL_VAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCtlVal() <em>Ctl Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtlVal()
	 * @generated
	 * @ordered
	 */
	protected int ctlVal = CTL_VAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStVal() <em>St Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStVal()
	 * @generated
	 * @ordered
	 */
	protected static final int ST_VAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStVal() <em>St Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStVal()
	 * @generated
	 * @ordered
	 */
	protected int stVal = ST_VAL_EDEFAULT;

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
	 * The default value of the '{@link #getSubVal() <em>Sub Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubVal()
	 * @generated
	 * @ordered
	 */
	protected static final int SUB_VAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSubVal() <em>Sub Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubVal()
	 * @generated
	 * @ordered
	 */
	protected int subVal = SUB_VAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinVal() <em>Min Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVal()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_VAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinVal() <em>Min Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVal()
	 * @generated
	 * @ordered
	 */
	protected int minVal = MIN_VAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxVal() <em>Max Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVal()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_VAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxVal() <em>Max Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVal()
	 * @generated
	 * @ordered
	 */
	protected int maxVal = MAX_VAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStepSize() <em>Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepSize()
	 * @generated
	 * @ordered
	 */
	protected static final int STEP_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStepSize() <em>Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepSize()
	 * @generated
	 * @ordered
	 */
	protected int stepSize = STEP_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected INCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.INC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCtlVal() {
		return ctlVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCtlVal(int newCtlVal) {
		int oldCtlVal = ctlVal;
		ctlVal = newCtlVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.INC__CTL_VAL, oldCtlVal, ctlVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStVal() {
		return stVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStVal(int newStVal) {
		int oldStVal = stVal;
		stVal = newStVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.INC__ST_VAL, oldStVal, stVal));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.INC__Q, oldQ, q));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.INC__Q, oldQ, q));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.INC__T, oldT, t));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.INC__T, oldT, t));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSubVal() {
		return subVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubVal(int newSubVal) {
		int oldSubVal = subVal;
		subVal = newSubVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.INC__SUB_VAL, oldSubVal, subVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinVal() {
		return minVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinVal(int newMinVal) {
		int oldMinVal = minVal;
		minVal = newMinVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.INC__MIN_VAL, oldMinVal, minVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxVal() {
		return maxVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxVal(int newMaxVal) {
		int oldMaxVal = maxVal;
		maxVal = newMaxVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.INC__MAX_VAL, oldMaxVal, maxVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStepSize() {
		return stepSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepSize(int newStepSize) {
		int oldStepSize = stepSize;
		stepSize = newStepSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.INC__STEP_SIZE, oldStepSize, stepSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.INC__CTL_VAL:
				return getCtlVal();
			case DataclassesPackage.INC__ST_VAL:
				return getStVal();
			case DataclassesPackage.INC__Q:
				if (resolve) return getQ();
				return basicGetQ();
			case DataclassesPackage.INC__T:
				if (resolve) return getT();
				return basicGetT();
			case DataclassesPackage.INC__SUB_VAL:
				return getSubVal();
			case DataclassesPackage.INC__MIN_VAL:
				return getMinVal();
			case DataclassesPackage.INC__MAX_VAL:
				return getMaxVal();
			case DataclassesPackage.INC__STEP_SIZE:
				return getStepSize();
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
			case DataclassesPackage.INC__CTL_VAL:
				setCtlVal((Integer)newValue);
				return;
			case DataclassesPackage.INC__ST_VAL:
				setStVal((Integer)newValue);
				return;
			case DataclassesPackage.INC__Q:
				setQ((Quality)newValue);
				return;
			case DataclassesPackage.INC__T:
				setT((TimeStamp)newValue);
				return;
			case DataclassesPackage.INC__SUB_VAL:
				setSubVal((Integer)newValue);
				return;
			case DataclassesPackage.INC__MIN_VAL:
				setMinVal((Integer)newValue);
				return;
			case DataclassesPackage.INC__MAX_VAL:
				setMaxVal((Integer)newValue);
				return;
			case DataclassesPackage.INC__STEP_SIZE:
				setStepSize((Integer)newValue);
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
			case DataclassesPackage.INC__CTL_VAL:
				setCtlVal(CTL_VAL_EDEFAULT);
				return;
			case DataclassesPackage.INC__ST_VAL:
				setStVal(ST_VAL_EDEFAULT);
				return;
			case DataclassesPackage.INC__Q:
				setQ((Quality)null);
				return;
			case DataclassesPackage.INC__T:
				setT((TimeStamp)null);
				return;
			case DataclassesPackage.INC__SUB_VAL:
				setSubVal(SUB_VAL_EDEFAULT);
				return;
			case DataclassesPackage.INC__MIN_VAL:
				setMinVal(MIN_VAL_EDEFAULT);
				return;
			case DataclassesPackage.INC__MAX_VAL:
				setMaxVal(MAX_VAL_EDEFAULT);
				return;
			case DataclassesPackage.INC__STEP_SIZE:
				setStepSize(STEP_SIZE_EDEFAULT);
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
			case DataclassesPackage.INC__CTL_VAL:
				return ctlVal != CTL_VAL_EDEFAULT;
			case DataclassesPackage.INC__ST_VAL:
				return stVal != ST_VAL_EDEFAULT;
			case DataclassesPackage.INC__Q:
				return q != null;
			case DataclassesPackage.INC__T:
				return t != null;
			case DataclassesPackage.INC__SUB_VAL:
				return subVal != SUB_VAL_EDEFAULT;
			case DataclassesPackage.INC__MIN_VAL:
				return minVal != MIN_VAL_EDEFAULT;
			case DataclassesPackage.INC__MAX_VAL:
				return maxVal != MAX_VAL_EDEFAULT;
			case DataclassesPackage.INC__STEP_SIZE:
				return stepSize != STEP_SIZE_EDEFAULT;
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
		result.append(", minVal: ");
		result.append(minVal);
		result.append(", maxVal: ");
		result.append(maxVal);
		result.append(", stepSize: ");
		result.append(stepSize);
		result.append(')');
		return result.toString();
	}

} //INCImpl
