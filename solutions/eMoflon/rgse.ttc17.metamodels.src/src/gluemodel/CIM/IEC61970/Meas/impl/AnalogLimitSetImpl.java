/**
 */
package gluemodel.CIM.IEC61970.Meas.impl;

import gluemodel.CIM.IEC61970.Meas.Analog;
import gluemodel.CIM.IEC61970.Meas.AnalogLimit;
import gluemodel.CIM.IEC61970.Meas.AnalogLimitSet;
import gluemodel.CIM.IEC61970.Meas.MeasPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analog Limit Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.AnalogLimitSetImpl#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.AnalogLimitSetImpl#getLimits <em>Limits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalogLimitSetImpl extends LimitSetImpl implements AnalogLimitSet {
	/**
	 * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurements()
	 * @generated
	 * @ordered
	 */
	protected EList<Analog> measurements;

	/**
	 * The cached value of the '{@link #getLimits() <em>Limits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimits()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalogLimit> limits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalogLimitSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.ANALOG_LIMIT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Analog> getMeasurements() {
		if (measurements == null) {
			measurements = new EObjectWithInverseResolvingEList.ManyInverse<Analog>(Analog.class, this, MeasPackage.ANALOG_LIMIT_SET__MEASUREMENTS, MeasPackage.ANALOG__LIMIT_SETS);
		}
		return measurements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnalogLimit> getLimits() {
		if (limits == null) {
			limits = new EObjectWithInverseResolvingEList<AnalogLimit>(AnalogLimit.class, this, MeasPackage.ANALOG_LIMIT_SET__LIMITS, MeasPackage.ANALOG_LIMIT__LIMIT_SET);
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
			case MeasPackage.ANALOG_LIMIT_SET__MEASUREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurements()).basicAdd(otherEnd, msgs);
			case MeasPackage.ANALOG_LIMIT_SET__LIMITS:
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
			case MeasPackage.ANALOG_LIMIT_SET__MEASUREMENTS:
				return ((InternalEList<?>)getMeasurements()).basicRemove(otherEnd, msgs);
			case MeasPackage.ANALOG_LIMIT_SET__LIMITS:
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
			case MeasPackage.ANALOG_LIMIT_SET__MEASUREMENTS:
				return getMeasurements();
			case MeasPackage.ANALOG_LIMIT_SET__LIMITS:
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
			case MeasPackage.ANALOG_LIMIT_SET__MEASUREMENTS:
				getMeasurements().clear();
				getMeasurements().addAll((Collection<? extends Analog>)newValue);
				return;
			case MeasPackage.ANALOG_LIMIT_SET__LIMITS:
				getLimits().clear();
				getLimits().addAll((Collection<? extends AnalogLimit>)newValue);
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
			case MeasPackage.ANALOG_LIMIT_SET__MEASUREMENTS:
				getMeasurements().clear();
				return;
			case MeasPackage.ANALOG_LIMIT_SET__LIMITS:
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
			case MeasPackage.ANALOG_LIMIT_SET__MEASUREMENTS:
				return measurements != null && !measurements.isEmpty();
			case MeasPackage.ANALOG_LIMIT_SET__LIMITS:
				return limits != null && !limits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnalogLimitSetImpl
