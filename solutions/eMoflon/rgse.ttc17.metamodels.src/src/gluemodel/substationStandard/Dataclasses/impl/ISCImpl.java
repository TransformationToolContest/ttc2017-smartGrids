/**
 */
package gluemodel.substationStandard.Dataclasses.impl;

import gluemodel.substationStandard.Dataclasses.DataclassesPackage;
import gluemodel.substationStandard.Dataclasses.ISC;
import gluemodel.substationStandard.Dataclasses.Quality;
import gluemodel.substationStandard.Dataclasses.TimeStamp;
import gluemodel.substationStandard.Dataclasses.ValWithTrans;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ISC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ISCImpl#getCtlVal <em>Ctl Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ISCImpl#getValWTr <em>Val WTr</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ISCImpl#getT <em>T</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ISCImpl#getQ <em>Q</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ISCImpl#getSubVal <em>Sub Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ISCImpl#getMinVal <em>Min Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ISCImpl#getMaxVal <em>Max Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ISCImpl#getStepSize <em>Step Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISCImpl extends MinimalEObjectImpl.Container implements ISC {
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
	 * The cached value of the '{@link #getValWTr() <em>Val WTr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValWTr()
	 * @generated
	 * @ordered
	 */
	protected ValWithTrans valWTr;

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
	 * The cached value of the '{@link #getQ() <em>Q</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ()
	 * @generated
	 * @ordered
	 */
	protected Quality q;

	/**
	 * The cached value of the '{@link #getSubVal() <em>Sub Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubVal()
	 * @generated
	 * @ordered
	 */
	protected ValWithTrans subVal;

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
	protected ISCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.ISC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ISC__CTL_VAL, oldCtlVal, ctlVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValWithTrans getValWTr() {
		if (valWTr != null && valWTr.eIsProxy()) {
			InternalEObject oldValWTr = (InternalEObject)valWTr;
			valWTr = (ValWithTrans)eResolveProxy(oldValWTr);
			if (valWTr != oldValWTr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.ISC__VAL_WTR, oldValWTr, valWTr));
			}
		}
		return valWTr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValWithTrans basicGetValWTr() {
		return valWTr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValWTr(ValWithTrans newValWTr) {
		ValWithTrans oldValWTr = valWTr;
		valWTr = newValWTr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ISC__VAL_WTR, oldValWTr, valWTr));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.ISC__T, oldT, t));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ISC__T, oldT, t));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.ISC__Q, oldQ, q));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ISC__Q, oldQ, q));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValWithTrans getSubVal() {
		if (subVal != null && subVal.eIsProxy()) {
			InternalEObject oldSubVal = (InternalEObject)subVal;
			subVal = (ValWithTrans)eResolveProxy(oldSubVal);
			if (subVal != oldSubVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.ISC__SUB_VAL, oldSubVal, subVal));
			}
		}
		return subVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValWithTrans basicGetSubVal() {
		return subVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubVal(ValWithTrans newSubVal) {
		ValWithTrans oldSubVal = subVal;
		subVal = newSubVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ISC__SUB_VAL, oldSubVal, subVal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ISC__MIN_VAL, oldMinVal, minVal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ISC__MAX_VAL, oldMaxVal, maxVal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ISC__STEP_SIZE, oldStepSize, stepSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.ISC__CTL_VAL:
				return getCtlVal();
			case DataclassesPackage.ISC__VAL_WTR:
				if (resolve) return getValWTr();
				return basicGetValWTr();
			case DataclassesPackage.ISC__T:
				if (resolve) return getT();
				return basicGetT();
			case DataclassesPackage.ISC__Q:
				if (resolve) return getQ();
				return basicGetQ();
			case DataclassesPackage.ISC__SUB_VAL:
				if (resolve) return getSubVal();
				return basicGetSubVal();
			case DataclassesPackage.ISC__MIN_VAL:
				return getMinVal();
			case DataclassesPackage.ISC__MAX_VAL:
				return getMaxVal();
			case DataclassesPackage.ISC__STEP_SIZE:
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
			case DataclassesPackage.ISC__CTL_VAL:
				setCtlVal((Integer)newValue);
				return;
			case DataclassesPackage.ISC__VAL_WTR:
				setValWTr((ValWithTrans)newValue);
				return;
			case DataclassesPackage.ISC__T:
				setT((TimeStamp)newValue);
				return;
			case DataclassesPackage.ISC__Q:
				setQ((Quality)newValue);
				return;
			case DataclassesPackage.ISC__SUB_VAL:
				setSubVal((ValWithTrans)newValue);
				return;
			case DataclassesPackage.ISC__MIN_VAL:
				setMinVal((Integer)newValue);
				return;
			case DataclassesPackage.ISC__MAX_VAL:
				setMaxVal((Integer)newValue);
				return;
			case DataclassesPackage.ISC__STEP_SIZE:
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
			case DataclassesPackage.ISC__CTL_VAL:
				setCtlVal(CTL_VAL_EDEFAULT);
				return;
			case DataclassesPackage.ISC__VAL_WTR:
				setValWTr((ValWithTrans)null);
				return;
			case DataclassesPackage.ISC__T:
				setT((TimeStamp)null);
				return;
			case DataclassesPackage.ISC__Q:
				setQ((Quality)null);
				return;
			case DataclassesPackage.ISC__SUB_VAL:
				setSubVal((ValWithTrans)null);
				return;
			case DataclassesPackage.ISC__MIN_VAL:
				setMinVal(MIN_VAL_EDEFAULT);
				return;
			case DataclassesPackage.ISC__MAX_VAL:
				setMaxVal(MAX_VAL_EDEFAULT);
				return;
			case DataclassesPackage.ISC__STEP_SIZE:
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
			case DataclassesPackage.ISC__CTL_VAL:
				return ctlVal != CTL_VAL_EDEFAULT;
			case DataclassesPackage.ISC__VAL_WTR:
				return valWTr != null;
			case DataclassesPackage.ISC__T:
				return t != null;
			case DataclassesPackage.ISC__Q:
				return q != null;
			case DataclassesPackage.ISC__SUB_VAL:
				return subVal != null;
			case DataclassesPackage.ISC__MIN_VAL:
				return minVal != MIN_VAL_EDEFAULT;
			case DataclassesPackage.ISC__MAX_VAL:
				return maxVal != MAX_VAL_EDEFAULT;
			case DataclassesPackage.ISC__STEP_SIZE:
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
		result.append(", minVal: ");
		result.append(minVal);
		result.append(", maxVal: ");
		result.append(maxVal);
		result.append(", stepSize: ");
		result.append(stepSize);
		result.append(')');
		return result.toString();
	}

} //ISCImpl
