/**
 */
package substationStandard.Dataclasses.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.AnalogueValue;
import substationStandard.Dataclasses.DataclassesPackage;
import substationStandard.Dataclasses.ScaledValueConfig;
import substationStandard.Dataclasses.Units;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ASG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.impl.ASGImpl#getSetMag <em>Set Mag</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.ASGImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.ASGImpl#getSVC <em>SVC</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.ASGImpl#getMinVal <em>Min Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.ASGImpl#getMaxVal <em>Max Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.ASGImpl#getStepSize <em>Step Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ASGImpl extends MinimalEObjectImpl.Container implements ASG {
	/**
	 * The cached value of the '{@link #getSetMag() <em>Set Mag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetMag()
	 * @generated
	 * @ordered
	 */
	protected AnalogueValue setMag;

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
	 * The cached value of the '{@link #getMinVal() <em>Min Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVal()
	 * @generated
	 * @ordered
	 */
	protected AnalogueValue minVal;

	/**
	 * The cached value of the '{@link #getMaxVal() <em>Max Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVal()
	 * @generated
	 * @ordered
	 */
	protected AnalogueValue maxVal;

	/**
	 * The cached value of the '{@link #getStepSize() <em>Step Size</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepSize()
	 * @generated
	 * @ordered
	 */
	protected AnalogueValue stepSize;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ASGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.ASG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue getSetMag() {
		if (setMag != null && setMag.eIsProxy()) {
			InternalEObject oldSetMag = (InternalEObject)setMag;
			setMag = (AnalogueValue)eResolveProxy(oldSetMag);
			if (setMag != oldSetMag) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.ASG__SET_MAG, oldSetMag, setMag));
			}
		}
		return setMag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue basicGetSetMag() {
		return setMag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetMag(AnalogueValue newSetMag) {
		AnalogueValue oldSetMag = setMag;
		setMag = newSetMag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ASG__SET_MAG, oldSetMag, setMag));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.ASG__UNITS, oldUnits, units));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ASG__UNITS, oldUnits, units));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.ASG__SVC, oldSVC, sVC));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ASG__SVC, oldSVC, sVC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue getMinVal() {
		if (minVal != null && minVal.eIsProxy()) {
			InternalEObject oldMinVal = (InternalEObject)minVal;
			minVal = (AnalogueValue)eResolveProxy(oldMinVal);
			if (minVal != oldMinVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.ASG__MIN_VAL, oldMinVal, minVal));
			}
		}
		return minVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue basicGetMinVal() {
		return minVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinVal(AnalogueValue newMinVal) {
		AnalogueValue oldMinVal = minVal;
		minVal = newMinVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ASG__MIN_VAL, oldMinVal, minVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue getMaxVal() {
		if (maxVal != null && maxVal.eIsProxy()) {
			InternalEObject oldMaxVal = (InternalEObject)maxVal;
			maxVal = (AnalogueValue)eResolveProxy(oldMaxVal);
			if (maxVal != oldMaxVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.ASG__MAX_VAL, oldMaxVal, maxVal));
			}
		}
		return maxVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue basicGetMaxVal() {
		return maxVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxVal(AnalogueValue newMaxVal) {
		AnalogueValue oldMaxVal = maxVal;
		maxVal = newMaxVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ASG__MAX_VAL, oldMaxVal, maxVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue getStepSize() {
		if (stepSize != null && stepSize.eIsProxy()) {
			InternalEObject oldStepSize = (InternalEObject)stepSize;
			stepSize = (AnalogueValue)eResolveProxy(oldStepSize);
			if (stepSize != oldStepSize) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.ASG__STEP_SIZE, oldStepSize, stepSize));
			}
		}
		return stepSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue basicGetStepSize() {
		return stepSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepSize(AnalogueValue newStepSize) {
		AnalogueValue oldStepSize = stepSize;
		stepSize = newStepSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ASG__STEP_SIZE, oldStepSize, stepSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.ASG__SET_MAG:
				if (resolve) return getSetMag();
				return basicGetSetMag();
			case DataclassesPackage.ASG__UNITS:
				if (resolve) return getUnits();
				return basicGetUnits();
			case DataclassesPackage.ASG__SVC:
				if (resolve) return getSVC();
				return basicGetSVC();
			case DataclassesPackage.ASG__MIN_VAL:
				if (resolve) return getMinVal();
				return basicGetMinVal();
			case DataclassesPackage.ASG__MAX_VAL:
				if (resolve) return getMaxVal();
				return basicGetMaxVal();
			case DataclassesPackage.ASG__STEP_SIZE:
				if (resolve) return getStepSize();
				return basicGetStepSize();
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
			case DataclassesPackage.ASG__SET_MAG:
				setSetMag((AnalogueValue)newValue);
				return;
			case DataclassesPackage.ASG__UNITS:
				setUnits((Units)newValue);
				return;
			case DataclassesPackage.ASG__SVC:
				setSVC((ScaledValueConfig)newValue);
				return;
			case DataclassesPackage.ASG__MIN_VAL:
				setMinVal((AnalogueValue)newValue);
				return;
			case DataclassesPackage.ASG__MAX_VAL:
				setMaxVal((AnalogueValue)newValue);
				return;
			case DataclassesPackage.ASG__STEP_SIZE:
				setStepSize((AnalogueValue)newValue);
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
			case DataclassesPackage.ASG__SET_MAG:
				setSetMag((AnalogueValue)null);
				return;
			case DataclassesPackage.ASG__UNITS:
				setUnits((Units)null);
				return;
			case DataclassesPackage.ASG__SVC:
				setSVC((ScaledValueConfig)null);
				return;
			case DataclassesPackage.ASG__MIN_VAL:
				setMinVal((AnalogueValue)null);
				return;
			case DataclassesPackage.ASG__MAX_VAL:
				setMaxVal((AnalogueValue)null);
				return;
			case DataclassesPackage.ASG__STEP_SIZE:
				setStepSize((AnalogueValue)null);
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
			case DataclassesPackage.ASG__SET_MAG:
				return setMag != null;
			case DataclassesPackage.ASG__UNITS:
				return units != null;
			case DataclassesPackage.ASG__SVC:
				return sVC != null;
			case DataclassesPackage.ASG__MIN_VAL:
				return minVal != null;
			case DataclassesPackage.ASG__MAX_VAL:
				return maxVal != null;
			case DataclassesPackage.ASG__STEP_SIZE:
				return stepSize != null;
		}
		return super.eIsSet(featureID);
	}

} //ASGImpl
