/**
 */
package substationStandard.Dataclasses.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import substationStandard.Dataclasses.DataclassesPackage;
import substationStandard.Dataclasses.ING;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ING</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.impl.INGImpl#getSetVal <em>Set Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.INGImpl#getMinVal <em>Min Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.INGImpl#getMaxVal <em>Max Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.INGImpl#getStepSize <em>Step Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class INGImpl extends MinimalEObjectImpl.Container implements ING {
	/**
	 * The default value of the '{@link #getSetVal() <em>Set Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetVal()
	 * @generated
	 * @ordered
	 */
	protected static final int SET_VAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSetVal() <em>Set Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetVal()
	 * @generated
	 * @ordered
	 */
	protected int setVal = SET_VAL_EDEFAULT;

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
	protected INGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.ING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSetVal() {
		return setVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetVal(int newSetVal) {
		int oldSetVal = setVal;
		setVal = newSetVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ING__SET_VAL, oldSetVal, setVal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ING__MIN_VAL, oldMinVal, minVal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ING__MAX_VAL, oldMaxVal, maxVal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ING__STEP_SIZE, oldStepSize, stepSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.ING__SET_VAL:
				return getSetVal();
			case DataclassesPackage.ING__MIN_VAL:
				return getMinVal();
			case DataclassesPackage.ING__MAX_VAL:
				return getMaxVal();
			case DataclassesPackage.ING__STEP_SIZE:
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
			case DataclassesPackage.ING__SET_VAL:
				setSetVal((Integer)newValue);
				return;
			case DataclassesPackage.ING__MIN_VAL:
				setMinVal((Integer)newValue);
				return;
			case DataclassesPackage.ING__MAX_VAL:
				setMaxVal((Integer)newValue);
				return;
			case DataclassesPackage.ING__STEP_SIZE:
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
			case DataclassesPackage.ING__SET_VAL:
				setSetVal(SET_VAL_EDEFAULT);
				return;
			case DataclassesPackage.ING__MIN_VAL:
				setMinVal(MIN_VAL_EDEFAULT);
				return;
			case DataclassesPackage.ING__MAX_VAL:
				setMaxVal(MAX_VAL_EDEFAULT);
				return;
			case DataclassesPackage.ING__STEP_SIZE:
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
			case DataclassesPackage.ING__SET_VAL:
				return setVal != SET_VAL_EDEFAULT;
			case DataclassesPackage.ING__MIN_VAL:
				return minVal != MIN_VAL_EDEFAULT;
			case DataclassesPackage.ING__MAX_VAL:
				return maxVal != MAX_VAL_EDEFAULT;
			case DataclassesPackage.ING__STEP_SIZE:
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
		result.append(" (setVal: ");
		result.append(setVal);
		result.append(", minVal: ");
		result.append(minVal);
		result.append(", maxVal: ");
		result.append(maxVal);
		result.append(", stepSize: ");
		result.append(stepSize);
		result.append(')');
		return result.toString();
	}

} //INGImpl
