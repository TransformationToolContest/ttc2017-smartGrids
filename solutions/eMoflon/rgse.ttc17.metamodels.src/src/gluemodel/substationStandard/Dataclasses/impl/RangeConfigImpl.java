/**
 */
package gluemodel.substationStandard.Dataclasses.impl;

import gluemodel.substationStandard.Dataclasses.AnalogueValue;
import gluemodel.substationStandard.Dataclasses.DataclassesPackage;
import gluemodel.substationStandard.Dataclasses.RangeConfig;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.RangeConfigImpl#getHhLim <em>Hh Lim</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.RangeConfigImpl#getHLim <em>HLim</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.RangeConfigImpl#getLLim <em>LLim</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.RangeConfigImpl#getLlLim <em>Ll Lim</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.RangeConfigImpl#getMin <em>Min</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.RangeConfigImpl#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeConfigImpl extends MinimalEObjectImpl.Container implements RangeConfig {
	/**
	 * The cached value of the '{@link #getHhLim() <em>Hh Lim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHhLim()
	 * @generated
	 * @ordered
	 */
	protected AnalogueValue hhLim;

	/**
	 * The cached value of the '{@link #getHLim() <em>HLim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHLim()
	 * @generated
	 * @ordered
	 */
	protected AnalogueValue hLim;

	/**
	 * The cached value of the '{@link #getLLim() <em>LLim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLLim()
	 * @generated
	 * @ordered
	 */
	protected AnalogueValue lLim;

	/**
	 * The cached value of the '{@link #getLlLim() <em>Ll Lim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLlLim()
	 * @generated
	 * @ordered
	 */
	protected AnalogueValue llLim;

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
	protected RangeConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.RANGE_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue getHhLim() {
		if (hhLim != null && hhLim.eIsProxy()) {
			InternalEObject oldHhLim = (InternalEObject)hhLim;
			hhLim = (AnalogueValue)eResolveProxy(oldHhLim);
			if (hhLim != oldHhLim) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.RANGE_CONFIG__HH_LIM, oldHhLim, hhLim));
			}
		}
		return hhLim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue basicGetHhLim() {
		return hhLim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHhLim(AnalogueValue newHhLim) {
		AnalogueValue oldHhLim = hhLim;
		hhLim = newHhLim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.RANGE_CONFIG__HH_LIM, oldHhLim, hhLim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue getHLim() {
		if (hLim != null && hLim.eIsProxy()) {
			InternalEObject oldHLim = (InternalEObject)hLim;
			hLim = (AnalogueValue)eResolveProxy(oldHLim);
			if (hLim != oldHLim) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.RANGE_CONFIG__HLIM, oldHLim, hLim));
			}
		}
		return hLim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue basicGetHLim() {
		return hLim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHLim(AnalogueValue newHLim) {
		AnalogueValue oldHLim = hLim;
		hLim = newHLim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.RANGE_CONFIG__HLIM, oldHLim, hLim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue getLLim() {
		if (lLim != null && lLim.eIsProxy()) {
			InternalEObject oldLLim = (InternalEObject)lLim;
			lLim = (AnalogueValue)eResolveProxy(oldLLim);
			if (lLim != oldLLim) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.RANGE_CONFIG__LLIM, oldLLim, lLim));
			}
		}
		return lLim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue basicGetLLim() {
		return lLim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLLim(AnalogueValue newLLim) {
		AnalogueValue oldLLim = lLim;
		lLim = newLLim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.RANGE_CONFIG__LLIM, oldLLim, lLim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue getLlLim() {
		if (llLim != null && llLim.eIsProxy()) {
			InternalEObject oldLlLim = (InternalEObject)llLim;
			llLim = (AnalogueValue)eResolveProxy(oldLlLim);
			if (llLim != oldLlLim) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.RANGE_CONFIG__LL_LIM, oldLlLim, llLim));
			}
		}
		return llLim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue basicGetLlLim() {
		return llLim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLlLim(AnalogueValue newLlLim) {
		AnalogueValue oldLlLim = llLim;
		llLim = newLlLim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.RANGE_CONFIG__LL_LIM, oldLlLim, llLim));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.RANGE_CONFIG__MIN, oldMin, min));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.RANGE_CONFIG__MIN, oldMin, min));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.RANGE_CONFIG__MAX, oldMax, max));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.RANGE_CONFIG__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.RANGE_CONFIG__HH_LIM:
				if (resolve) return getHhLim();
				return basicGetHhLim();
			case DataclassesPackage.RANGE_CONFIG__HLIM:
				if (resolve) return getHLim();
				return basicGetHLim();
			case DataclassesPackage.RANGE_CONFIG__LLIM:
				if (resolve) return getLLim();
				return basicGetLLim();
			case DataclassesPackage.RANGE_CONFIG__LL_LIM:
				if (resolve) return getLlLim();
				return basicGetLlLim();
			case DataclassesPackage.RANGE_CONFIG__MIN:
				if (resolve) return getMin();
				return basicGetMin();
			case DataclassesPackage.RANGE_CONFIG__MAX:
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
			case DataclassesPackage.RANGE_CONFIG__HH_LIM:
				setHhLim((AnalogueValue)newValue);
				return;
			case DataclassesPackage.RANGE_CONFIG__HLIM:
				setHLim((AnalogueValue)newValue);
				return;
			case DataclassesPackage.RANGE_CONFIG__LLIM:
				setLLim((AnalogueValue)newValue);
				return;
			case DataclassesPackage.RANGE_CONFIG__LL_LIM:
				setLlLim((AnalogueValue)newValue);
				return;
			case DataclassesPackage.RANGE_CONFIG__MIN:
				setMin((AnalogueValue)newValue);
				return;
			case DataclassesPackage.RANGE_CONFIG__MAX:
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
			case DataclassesPackage.RANGE_CONFIG__HH_LIM:
				setHhLim((AnalogueValue)null);
				return;
			case DataclassesPackage.RANGE_CONFIG__HLIM:
				setHLim((AnalogueValue)null);
				return;
			case DataclassesPackage.RANGE_CONFIG__LLIM:
				setLLim((AnalogueValue)null);
				return;
			case DataclassesPackage.RANGE_CONFIG__LL_LIM:
				setLlLim((AnalogueValue)null);
				return;
			case DataclassesPackage.RANGE_CONFIG__MIN:
				setMin((AnalogueValue)null);
				return;
			case DataclassesPackage.RANGE_CONFIG__MAX:
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
			case DataclassesPackage.RANGE_CONFIG__HH_LIM:
				return hhLim != null;
			case DataclassesPackage.RANGE_CONFIG__HLIM:
				return hLim != null;
			case DataclassesPackage.RANGE_CONFIG__LLIM:
				return lLim != null;
			case DataclassesPackage.RANGE_CONFIG__LL_LIM:
				return llLim != null;
			case DataclassesPackage.RANGE_CONFIG__MIN:
				return min != null;
			case DataclassesPackage.RANGE_CONFIG__MAX:
				return max != null;
		}
		return super.eIsSet(featureID);
	}

} //RangeConfigImpl
