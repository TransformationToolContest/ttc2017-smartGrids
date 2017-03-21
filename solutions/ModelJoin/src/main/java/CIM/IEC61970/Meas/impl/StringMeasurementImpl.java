/**
 */
package CIM.IEC61970.Meas.impl;

import CIM.IEC61970.Meas.MeasPackage;
import CIM.IEC61970.Meas.StringMeasurement;
import CIM.IEC61970.Meas.StringMeasurementValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Meas.impl.StringMeasurementImpl#getStringMeasurementValues <em>String Measurement Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringMeasurementImpl extends MeasurementImpl implements StringMeasurement {
	/**
	 * The cached value of the '{@link #getStringMeasurementValues() <em>String Measurement Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringMeasurementValues()
	 * @generated
	 * @ordered
	 */
	protected EList<StringMeasurementValue> stringMeasurementValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringMeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.STRING_MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StringMeasurementValue> getStringMeasurementValues() {
		if (stringMeasurementValues == null) {
			stringMeasurementValues = new EObjectWithInverseResolvingEList<StringMeasurementValue>(StringMeasurementValue.class, this, MeasPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES, MeasPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT);
		}
		return stringMeasurementValues;
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
			case MeasPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStringMeasurementValues()).basicAdd(otherEnd, msgs);
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
			case MeasPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES:
				return ((InternalEList<?>)getStringMeasurementValues()).basicRemove(otherEnd, msgs);
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
			case MeasPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES:
				return getStringMeasurementValues();
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
			case MeasPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES:
				getStringMeasurementValues().clear();
				getStringMeasurementValues().addAll((Collection<? extends StringMeasurementValue>)newValue);
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
			case MeasPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES:
				getStringMeasurementValues().clear();
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
			case MeasPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES:
				return stringMeasurementValues != null && !stringMeasurementValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StringMeasurementImpl
