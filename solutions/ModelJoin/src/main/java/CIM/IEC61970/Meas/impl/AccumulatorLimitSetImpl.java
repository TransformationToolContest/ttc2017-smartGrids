/**
 */
package CIM.IEC61970.Meas.impl;

import CIM.IEC61970.Meas.Accumulator;
import CIM.IEC61970.Meas.AccumulatorLimit;
import CIM.IEC61970.Meas.AccumulatorLimitSet;
import CIM.IEC61970.Meas.MeasPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accumulator Limit Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Meas.impl.AccumulatorLimitSetImpl#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.AccumulatorLimitSetImpl#getLimits <em>Limits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccumulatorLimitSetImpl extends LimitSetImpl implements AccumulatorLimitSet {
	/**
	 * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurements()
	 * @generated
	 * @ordered
	 */
	protected EList<Accumulator> measurements;

	/**
	 * The cached value of the '{@link #getLimits() <em>Limits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimits()
	 * @generated
	 * @ordered
	 */
	protected EList<AccumulatorLimit> limits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccumulatorLimitSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.ACCUMULATOR_LIMIT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Accumulator> getMeasurements() {
		if (measurements == null) {
			measurements = new EObjectWithInverseResolvingEList.ManyInverse<Accumulator>(Accumulator.class, this, MeasPackage.ACCUMULATOR_LIMIT_SET__MEASUREMENTS, MeasPackage.ACCUMULATOR__LIMIT_SETS);
		}
		return measurements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AccumulatorLimit> getLimits() {
		if (limits == null) {
			limits = new EObjectWithInverseResolvingEList<AccumulatorLimit>(AccumulatorLimit.class, this, MeasPackage.ACCUMULATOR_LIMIT_SET__LIMITS, MeasPackage.ACCUMULATOR_LIMIT__LIMIT_SET);
		}
		return limits;
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
			case MeasPackage.ACCUMULATOR_LIMIT_SET__MEASUREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurements()).basicAdd(otherEnd, msgs);
			case MeasPackage.ACCUMULATOR_LIMIT_SET__LIMITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLimits()).basicAdd(otherEnd, msgs);
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
			case MeasPackage.ACCUMULATOR_LIMIT_SET__MEASUREMENTS:
				return ((InternalEList<?>)getMeasurements()).basicRemove(otherEnd, msgs);
			case MeasPackage.ACCUMULATOR_LIMIT_SET__LIMITS:
				return ((InternalEList<?>)getLimits()).basicRemove(otherEnd, msgs);
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
			case MeasPackage.ACCUMULATOR_LIMIT_SET__MEASUREMENTS:
				return getMeasurements();
			case MeasPackage.ACCUMULATOR_LIMIT_SET__LIMITS:
				return getLimits();
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
			case MeasPackage.ACCUMULATOR_LIMIT_SET__MEASUREMENTS:
				getMeasurements().clear();
				getMeasurements().addAll((Collection<? extends Accumulator>)newValue);
				return;
			case MeasPackage.ACCUMULATOR_LIMIT_SET__LIMITS:
				getLimits().clear();
				getLimits().addAll((Collection<? extends AccumulatorLimit>)newValue);
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
			case MeasPackage.ACCUMULATOR_LIMIT_SET__MEASUREMENTS:
				getMeasurements().clear();
				return;
			case MeasPackage.ACCUMULATOR_LIMIT_SET__LIMITS:
				getLimits().clear();
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
			case MeasPackage.ACCUMULATOR_LIMIT_SET__MEASUREMENTS:
				return measurements != null && !measurements.isEmpty();
			case MeasPackage.ACCUMULATOR_LIMIT_SET__LIMITS:
				return limits != null && !limits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AccumulatorLimitSetImpl
