/**
 */
package CIM.IEC61970.Informative.MarketOperations.impl;

import CIM.IEC61970.Core.impl.CurveImpl;

import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.RampRateCurve;
import CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator;

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
 * An implementation of the model object '<em><b>Ramp Rate Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.RampRateCurveImpl#getGeneratingUnit <em>Generating Unit</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.RampRateCurveImpl#getRampRateType <em>Ramp Rate Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RampRateCurveImpl extends CurveImpl implements RampRateCurve {
	/**
	 * The cached value of the '{@link #getGeneratingUnit() <em>Generating Unit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<RegisteredGenerator> generatingUnit;

	/**
	 * The default value of the '{@link #getRampRateType() <em>Ramp Rate Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampRateType()
	 * @generated
	 * @ordered
	 */
	protected static final String RAMP_RATE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRampRateType() <em>Ramp Rate Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampRateType()
	 * @generated
	 * @ordered
	 */
	protected String rampRateType = RAMP_RATE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RampRateCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.RAMP_RATE_CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegisteredGenerator> getGeneratingUnit() {
		if (generatingUnit == null) {
			generatingUnit = new EObjectWithInverseResolvingEList.ManyInverse<RegisteredGenerator>(RegisteredGenerator.class, this, MarketOperationsPackage.RAMP_RATE_CURVE__GENERATING_UNIT, MarketOperationsPackage.REGISTERED_GENERATOR__RAMP_RATE_CURVES);
		}
		return generatingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRampRateType() {
		return rampRateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRampRateType(String newRampRateType) {
		String oldRampRateType = rampRateType;
		rampRateType = newRampRateType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.RAMP_RATE_CURVE__RAMP_RATE_TYPE, oldRampRateType, rampRateType));
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
			case MarketOperationsPackage.RAMP_RATE_CURVE__GENERATING_UNIT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneratingUnit()).basicAdd(otherEnd, msgs);
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
			case MarketOperationsPackage.RAMP_RATE_CURVE__GENERATING_UNIT:
				return ((InternalEList<?>)getGeneratingUnit()).basicRemove(otherEnd, msgs);
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
			case MarketOperationsPackage.RAMP_RATE_CURVE__GENERATING_UNIT:
				return getGeneratingUnit();
			case MarketOperationsPackage.RAMP_RATE_CURVE__RAMP_RATE_TYPE:
				return getRampRateType();
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
			case MarketOperationsPackage.RAMP_RATE_CURVE__GENERATING_UNIT:
				getGeneratingUnit().clear();
				getGeneratingUnit().addAll((Collection<? extends RegisteredGenerator>)newValue);
				return;
			case MarketOperationsPackage.RAMP_RATE_CURVE__RAMP_RATE_TYPE:
				setRampRateType((String)newValue);
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
			case MarketOperationsPackage.RAMP_RATE_CURVE__GENERATING_UNIT:
				getGeneratingUnit().clear();
				return;
			case MarketOperationsPackage.RAMP_RATE_CURVE__RAMP_RATE_TYPE:
				setRampRateType(RAMP_RATE_TYPE_EDEFAULT);
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
			case MarketOperationsPackage.RAMP_RATE_CURVE__GENERATING_UNIT:
				return generatingUnit != null && !generatingUnit.isEmpty();
			case MarketOperationsPackage.RAMP_RATE_CURVE__RAMP_RATE_TYPE:
				return RAMP_RATE_TYPE_EDEFAULT == null ? rampRateType != null : !RAMP_RATE_TYPE_EDEFAULT.equals(rampRateType);
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
		result.append(" (rampRateType: ");
		result.append(rampRateType);
		result.append(')');
		return result.toString();
	}

} //RampRateCurveImpl
