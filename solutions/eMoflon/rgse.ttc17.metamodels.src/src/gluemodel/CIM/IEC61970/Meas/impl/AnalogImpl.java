/**
 */
package gluemodel.CIM.IEC61970.Meas.impl;

import gluemodel.CIM.IEC61970.Meas.Analog;
import gluemodel.CIM.IEC61970.Meas.AnalogLimitSet;
import gluemodel.CIM.IEC61970.Meas.AnalogValue;
import gluemodel.CIM.IEC61970.Meas.MeasPackage;
import gluemodel.CIM.IEC61970.Meas.SetPoint;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.AnalogImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.AnalogImpl#getNormalValue <em>Normal Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.AnalogImpl#isPositiveFlowIn <em>Positive Flow In</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.AnalogImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.AnalogImpl#getLimitSets <em>Limit Sets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.AnalogImpl#getSetPoint <em>Set Point</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.AnalogImpl#getAnalogValues <em>Analog Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalogImpl extends MeasurementImpl implements Analog {
	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected float minValue = MIN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNormalValue() <em>Normal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalValue()
	 * @generated
	 * @ordered
	 */
	protected static final float NORMAL_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNormalValue() <em>Normal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalValue()
	 * @generated
	 * @ordered
	 */
	protected float normalValue = NORMAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPositiveFlowIn() <em>Positive Flow In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPositiveFlowIn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POSITIVE_FLOW_IN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPositiveFlowIn() <em>Positive Flow In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPositiveFlowIn()
	 * @generated
	 * @ordered
	 */
	protected boolean positiveFlowIn = POSITIVE_FLOW_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected float maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLimitSets() <em>Limit Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitSets()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalogLimitSet> limitSets;

	/**
	 * The cached value of the '{@link #getSetPoint() <em>Set Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetPoint()
	 * @generated
	 * @ordered
	 */
	protected SetPoint setPoint;

	/**
	 * The cached value of the '{@link #getAnalogValues() <em>Analog Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalogValues()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalogValue> analogValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.ANALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinValue() {
		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValue(float newMinValue) {
		float oldMinValue = minValue;
		minValue = newMinValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.ANALOG__MIN_VALUE, oldMinValue, minValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNormalValue() {
		return normalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalValue(float newNormalValue) {
		float oldNormalValue = normalValue;
		normalValue = newNormalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.ANALOG__NORMAL_VALUE, oldNormalValue, normalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPositiveFlowIn() {
		return positiveFlowIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositiveFlowIn(boolean newPositiveFlowIn) {
		boolean oldPositiveFlowIn = positiveFlowIn;
		positiveFlowIn = newPositiveFlowIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.ANALOG__POSITIVE_FLOW_IN, oldPositiveFlowIn, positiveFlowIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValue(float newMaxValue) {
		float oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.ANALOG__MAX_VALUE, oldMaxValue, maxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnalogLimitSet> getLimitSets() {
		if (limitSets == null) {
			limitSets = new EObjectWithInverseResolvingEList.ManyInverse<AnalogLimitSet>(AnalogLimitSet.class, this, MeasPackage.ANALOG__LIMIT_SETS, MeasPackage.ANALOG_LIMIT_SET__MEASUREMENTS);
		}
		return limitSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetPoint getSetPoint() {
		if (setPoint != null && setPoint.eIsProxy()) {
			InternalEObject oldSetPoint = (InternalEObject)setPoint;
			setPoint = (SetPoint)eResolveProxy(oldSetPoint);
			if (setPoint != oldSetPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.ANALOG__SET_POINT, oldSetPoint, setPoint));
			}
		}
		return setPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetPoint basicGetSetPoint() {
		return setPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetPoint(SetPoint newSetPoint, NotificationChain msgs) {
		SetPoint oldSetPoint = setPoint;
		setPoint = newSetPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.ANALOG__SET_POINT, oldSetPoint, newSetPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetPoint(SetPoint newSetPoint) {
		if (newSetPoint != setPoint) {
			NotificationChain msgs = null;
			if (setPoint != null)
				msgs = ((InternalEObject)setPoint).eInverseRemove(this, MeasPackage.SET_POINT__ANALOG, SetPoint.class, msgs);
			if (newSetPoint != null)
				msgs = ((InternalEObject)newSetPoint).eInverseAdd(this, MeasPackage.SET_POINT__ANALOG, SetPoint.class, msgs);
			msgs = basicSetSetPoint(newSetPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.ANALOG__SET_POINT, newSetPoint, newSetPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnalogValue> getAnalogValues() {
		if (analogValues == null) {
			analogValues = new EObjectWithInverseResolvingEList<AnalogValue>(AnalogValue.class, this, MeasPackage.ANALOG__ANALOG_VALUES, MeasPackage.ANALOG_VALUE__ANALOG);
		}
		return analogValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeasPackage.ANALOG__LIMIT_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLimitSets()).basicAdd(otherEnd, msgs);
			case MeasPackage.ANALOG__SET_POINT:
				if (setPoint != null)
					msgs = ((InternalEObject)setPoint).eInverseRemove(this, MeasPackage.SET_POINT__ANALOG, SetPoint.class, msgs);
				return basicSetSetPoint((SetPoint)otherEnd, msgs);
			case MeasPackage.ANALOG__ANALOG_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnalogValues()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeasPackage.ANALOG__LIMIT_SETS:
				return ((InternalEList<?>)getLimitSets()).basicRemove(otherEnd, msgs);
			case MeasPackage.ANALOG__SET_POINT:
				return basicSetSetPoint(null, msgs);
			case MeasPackage.ANALOG__ANALOG_VALUES:
				return ((InternalEList<?>)getAnalogValues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeasPackage.ANALOG__MIN_VALUE:
				return getMinValue();
			case MeasPackage.ANALOG__NORMAL_VALUE:
				return getNormalValue();
			case MeasPackage.ANALOG__POSITIVE_FLOW_IN:
				return isPositiveFlowIn();
			case MeasPackage.ANALOG__MAX_VALUE:
				return getMaxValue();
			case MeasPackage.ANALOG__LIMIT_SETS:
				return getLimitSets();
			case MeasPackage.ANALOG__SET_POINT:
				if (resolve) return getSetPoint();
				return basicGetSetPoint();
			case MeasPackage.ANALOG__ANALOG_VALUES:
				return getAnalogValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MeasPackage.ANALOG__MIN_VALUE:
				setMinValue((Float)newValue);
				return;
			case MeasPackage.ANALOG__NORMAL_VALUE:
				setNormalValue((Float)newValue);
				return;
			case MeasPackage.ANALOG__POSITIVE_FLOW_IN:
				setPositiveFlowIn((Boolean)newValue);
				return;
			case MeasPackage.ANALOG__MAX_VALUE:
				setMaxValue((Float)newValue);
				return;
			case MeasPackage.ANALOG__LIMIT_SETS:
				getLimitSets().clear();
				getLimitSets().addAll((Collection<? extends AnalogLimitSet>)newValue);
				return;
			case MeasPackage.ANALOG__SET_POINT:
				setSetPoint((SetPoint)newValue);
				return;
			case MeasPackage.ANALOG__ANALOG_VALUES:
				getAnalogValues().clear();
				getAnalogValues().addAll((Collection<? extends AnalogValue>)newValue);
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
			case MeasPackage.ANALOG__MIN_VALUE:
				setMinValue(MIN_VALUE_EDEFAULT);
				return;
			case MeasPackage.ANALOG__NORMAL_VALUE:
				setNormalValue(NORMAL_VALUE_EDEFAULT);
				return;
			case MeasPackage.ANALOG__POSITIVE_FLOW_IN:
				setPositiveFlowIn(POSITIVE_FLOW_IN_EDEFAULT);
				return;
			case MeasPackage.ANALOG__MAX_VALUE:
				setMaxValue(MAX_VALUE_EDEFAULT);
				return;
			case MeasPackage.ANALOG__LIMIT_SETS:
				getLimitSets().clear();
				return;
			case MeasPackage.ANALOG__SET_POINT:
				setSetPoint((SetPoint)null);
				return;
			case MeasPackage.ANALOG__ANALOG_VALUES:
				getAnalogValues().clear();
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
			case MeasPackage.ANALOG__MIN_VALUE:
				return minValue != MIN_VALUE_EDEFAULT;
			case MeasPackage.ANALOG__NORMAL_VALUE:
				return normalValue != NORMAL_VALUE_EDEFAULT;
			case MeasPackage.ANALOG__POSITIVE_FLOW_IN:
				return positiveFlowIn != POSITIVE_FLOW_IN_EDEFAULT;
			case MeasPackage.ANALOG__MAX_VALUE:
				return maxValue != MAX_VALUE_EDEFAULT;
			case MeasPackage.ANALOG__LIMIT_SETS:
				return limitSets != null && !limitSets.isEmpty();
			case MeasPackage.ANALOG__SET_POINT:
				return setPoint != null;
			case MeasPackage.ANALOG__ANALOG_VALUES:
				return analogValues != null && !analogValues.isEmpty();
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
		result.append(" (minValue: ");
		result.append(minValue);
		result.append(", normalValue: ");
		result.append(normalValue);
		result.append(", positiveFlowIn: ");
		result.append(positiveFlowIn);
		result.append(", maxValue: ");
		result.append(maxValue);
		result.append(')');
		return result.toString();
	}

} //AnalogImpl
