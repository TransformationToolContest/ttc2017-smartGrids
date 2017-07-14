/**
 */
package gluemodel.CIM.IEC61970.Meas.impl;

import gluemodel.CIM.IEC61970.Meas.Accumulator;
import gluemodel.CIM.IEC61970.Meas.AccumulatorLimitSet;
import gluemodel.CIM.IEC61970.Meas.AccumulatorValue;
import gluemodel.CIM.IEC61970.Meas.MeasPackage;

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
 * An implementation of the model object '<em><b>Accumulator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.AccumulatorImpl#getAccumulatorValues <em>Accumulator Values</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.AccumulatorImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.AccumulatorImpl#getLimitSets <em>Limit Sets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccumulatorImpl extends MeasurementImpl implements Accumulator {
	/**
	 * The cached value of the '{@link #getAccumulatorValues() <em>Accumulator Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccumulatorValues()
	 * @generated
	 * @ordered
	 */
	protected EList<AccumulatorValue> accumulatorValues;

	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected int maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLimitSets() <em>Limit Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitSets()
	 * @generated
	 * @ordered
	 */
	protected EList<AccumulatorLimitSet> limitSets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccumulatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.ACCUMULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AccumulatorValue> getAccumulatorValues() {
		if (accumulatorValues == null) {
			accumulatorValues = new EObjectWithInverseResolvingEList<AccumulatorValue>(AccumulatorValue.class, this, MeasPackage.ACCUMULATOR__ACCUMULATOR_VALUES, MeasPackage.ACCUMULATOR_VALUE__ACCUMULATOR);
		}
		return accumulatorValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValue(int newMaxValue) {
		int oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.ACCUMULATOR__MAX_VALUE, oldMaxValue, maxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AccumulatorLimitSet> getLimitSets() {
		if (limitSets == null) {
			limitSets = new EObjectWithInverseResolvingEList.ManyInverse<AccumulatorLimitSet>(AccumulatorLimitSet.class, this, MeasPackage.ACCUMULATOR__LIMIT_SETS, MeasPackage.ACCUMULATOR_LIMIT_SET__MEASUREMENTS);
		}
		return limitSets;
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
			case MeasPackage.ACCUMULATOR__ACCUMULATOR_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccumulatorValues()).basicAdd(otherEnd, msgs);
			case MeasPackage.ACCUMULATOR__LIMIT_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLimitSets()).basicAdd(otherEnd, msgs);
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
			case MeasPackage.ACCUMULATOR__ACCUMULATOR_VALUES:
				return ((InternalEList<?>)getAccumulatorValues()).basicRemove(otherEnd, msgs);
			case MeasPackage.ACCUMULATOR__LIMIT_SETS:
				return ((InternalEList<?>)getLimitSets()).basicRemove(otherEnd, msgs);
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
			case MeasPackage.ACCUMULATOR__ACCUMULATOR_VALUES:
				return getAccumulatorValues();
			case MeasPackage.ACCUMULATOR__MAX_VALUE:
				return getMaxValue();
			case MeasPackage.ACCUMULATOR__LIMIT_SETS:
				return getLimitSets();
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
			case MeasPackage.ACCUMULATOR__ACCUMULATOR_VALUES:
				getAccumulatorValues().clear();
				getAccumulatorValues().addAll((Collection<? extends AccumulatorValue>)newValue);
				return;
			case MeasPackage.ACCUMULATOR__MAX_VALUE:
				setMaxValue((Integer)newValue);
				return;
			case MeasPackage.ACCUMULATOR__LIMIT_SETS:
				getLimitSets().clear();
				getLimitSets().addAll((Collection<? extends AccumulatorLimitSet>)newValue);
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
			case MeasPackage.ACCUMULATOR__ACCUMULATOR_VALUES:
				getAccumulatorValues().clear();
				return;
			case MeasPackage.ACCUMULATOR__MAX_VALUE:
				setMaxValue(MAX_VALUE_EDEFAULT);
				return;
			case MeasPackage.ACCUMULATOR__LIMIT_SETS:
				getLimitSets().clear();
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
			case MeasPackage.ACCUMULATOR__ACCUMULATOR_VALUES:
				return accumulatorValues != null && !accumulatorValues.isEmpty();
			case MeasPackage.ACCUMULATOR__MAX_VALUE:
				return maxValue != MAX_VALUE_EDEFAULT;
			case MeasPackage.ACCUMULATOR__LIMIT_SETS:
				return limitSets != null && !limitSets.isEmpty();
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
		result.append(" (maxValue: ");
		result.append(maxValue);
		result.append(')');
		return result.toString();
	}

} //AccumulatorImpl
