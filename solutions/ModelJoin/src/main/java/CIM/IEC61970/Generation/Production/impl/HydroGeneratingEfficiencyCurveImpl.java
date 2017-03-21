/**
 */
package CIM.IEC61970.Generation.Production.impl;

import CIM.IEC61970.Core.impl.CurveImpl;

import CIM.IEC61970.Generation.Production.HydroGeneratingEfficiencyCurve;
import CIM.IEC61970.Generation.Production.HydroGeneratingUnit;
import CIM.IEC61970.Generation.Production.ProductionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hydro Generating Efficiency Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroGeneratingEfficiencyCurveImpl#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HydroGeneratingEfficiencyCurveImpl extends CurveImpl implements HydroGeneratingEfficiencyCurve {
	/**
	 * The cached value of the '{@link #getHydroGeneratingUnit() <em>Hydro Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected HydroGeneratingUnit hydroGeneratingUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HydroGeneratingEfficiencyCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.HYDRO_GENERATING_EFFICIENCY_CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroGeneratingUnit getHydroGeneratingUnit() {
		if (hydroGeneratingUnit != null && hydroGeneratingUnit.eIsProxy()) {
			InternalEObject oldHydroGeneratingUnit = (InternalEObject)hydroGeneratingUnit;
			hydroGeneratingUnit = (HydroGeneratingUnit)eResolveProxy(oldHydroGeneratingUnit);
			if (hydroGeneratingUnit != oldHydroGeneratingUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.HYDRO_GENERATING_EFFICIENCY_CURVE__HYDRO_GENERATING_UNIT, oldHydroGeneratingUnit, hydroGeneratingUnit));
			}
		}
		return hydroGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroGeneratingUnit basicGetHydroGeneratingUnit() {
		return hydroGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHydroGeneratingUnit(HydroGeneratingUnit newHydroGeneratingUnit, NotificationChain msgs) {
		HydroGeneratingUnit oldHydroGeneratingUnit = hydroGeneratingUnit;
		hydroGeneratingUnit = newHydroGeneratingUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_GENERATING_EFFICIENCY_CURVE__HYDRO_GENERATING_UNIT, oldHydroGeneratingUnit, newHydroGeneratingUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHydroGeneratingUnit(HydroGeneratingUnit newHydroGeneratingUnit) {
		if (newHydroGeneratingUnit != hydroGeneratingUnit) {
			NotificationChain msgs = null;
			if (hydroGeneratingUnit != null)
				msgs = ((InternalEObject)hydroGeneratingUnit).eInverseRemove(this, ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES, HydroGeneratingUnit.class, msgs);
			if (newHydroGeneratingUnit != null)
				msgs = ((InternalEObject)newHydroGeneratingUnit).eInverseAdd(this, ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES, HydroGeneratingUnit.class, msgs);
			msgs = basicSetHydroGeneratingUnit(newHydroGeneratingUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_GENERATING_EFFICIENCY_CURVE__HYDRO_GENERATING_UNIT, newHydroGeneratingUnit, newHydroGeneratingUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.HYDRO_GENERATING_EFFICIENCY_CURVE__HYDRO_GENERATING_UNIT:
				if (hydroGeneratingUnit != null)
					msgs = ((InternalEObject)hydroGeneratingUnit).eInverseRemove(this, ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES, HydroGeneratingUnit.class, msgs);
				return basicSetHydroGeneratingUnit((HydroGeneratingUnit)otherEnd, msgs);
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
			case ProductionPackage.HYDRO_GENERATING_EFFICIENCY_CURVE__HYDRO_GENERATING_UNIT:
				return basicSetHydroGeneratingUnit(null, msgs);
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
			case ProductionPackage.HYDRO_GENERATING_EFFICIENCY_CURVE__HYDRO_GENERATING_UNIT:
				if (resolve) return getHydroGeneratingUnit();
				return basicGetHydroGeneratingUnit();
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
			case ProductionPackage.HYDRO_GENERATING_EFFICIENCY_CURVE__HYDRO_GENERATING_UNIT:
				setHydroGeneratingUnit((HydroGeneratingUnit)newValue);
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
			case ProductionPackage.HYDRO_GENERATING_EFFICIENCY_CURVE__HYDRO_GENERATING_UNIT:
				setHydroGeneratingUnit((HydroGeneratingUnit)null);
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
			case ProductionPackage.HYDRO_GENERATING_EFFICIENCY_CURVE__HYDRO_GENERATING_UNIT:
				return hydroGeneratingUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //HydroGeneratingEfficiencyCurveImpl
