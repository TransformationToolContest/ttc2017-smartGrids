/**
 */
package gluemodel.CIM.IEC61970.Meas.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Meas.MeasPackage;
import gluemodel.CIM.IEC61970.Meas.MeasurementValue;
import gluemodel.CIM.IEC61970.Meas.MeasurementValueSource;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Value Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.MeasurementValueSourceImpl#getMeasurementValues <em>Measurement Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementValueSourceImpl extends IdentifiedObjectImpl implements MeasurementValueSource {
	/**
	 * The cached value of the '{@link #getMeasurementValues() <em>Measurement Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementValues()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasurementValue> measurementValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementValueSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.MEASUREMENT_VALUE_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasurementValue> getMeasurementValues() {
		if (measurementValues == null) {
			measurementValues = new EObjectWithInverseResolvingEList<MeasurementValue>(MeasurementValue.class, this, MeasPackage.MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES, MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE);
		}
		return measurementValues;
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
			case MeasPackage.MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurementValues()).basicAdd(otherEnd, msgs);
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
			case MeasPackage.MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES:
				return ((InternalEList<?>)getMeasurementValues()).basicRemove(otherEnd, msgs);
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
			case MeasPackage.MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES:
				return getMeasurementValues();
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
			case MeasPackage.MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES:
				getMeasurementValues().clear();
				getMeasurementValues().addAll((Collection<? extends MeasurementValue>)newValue);
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
			case MeasPackage.MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES:
				getMeasurementValues().clear();
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
			case MeasPackage.MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES:
				return measurementValues != null && !measurementValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasurementValueSourceImpl
