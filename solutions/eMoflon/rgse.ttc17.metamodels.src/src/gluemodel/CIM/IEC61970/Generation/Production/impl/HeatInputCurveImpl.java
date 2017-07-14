/**
 */
package gluemodel.CIM.IEC61970.Generation.Production.impl;

import gluemodel.CIM.IEC61970.Core.impl.CurveImpl;

import gluemodel.CIM.IEC61970.Generation.Production.HeatInputCurve;
import gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage;
import gluemodel.CIM.IEC61970.Generation.Production.ThermalGeneratingUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Heat Input Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.HeatInputCurveImpl#getHeatInputOffset <em>Heat Input Offset</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.HeatInputCurveImpl#isIsNetGrossP <em>Is Net Gross P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.HeatInputCurveImpl#getHeatInputEff <em>Heat Input Eff</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.HeatInputCurveImpl#getAuxPowerMult <em>Aux Power Mult</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.HeatInputCurveImpl#getAuxPowerOffset <em>Aux Power Offset</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.HeatInputCurveImpl#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeatInputCurveImpl extends CurveImpl implements HeatInputCurve {
	/**
	 * The default value of the '{@link #getHeatInputOffset() <em>Heat Input Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatInputOffset()
	 * @generated
	 * @ordered
	 */
	protected static final float HEAT_INPUT_OFFSET_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHeatInputOffset() <em>Heat Input Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatInputOffset()
	 * @generated
	 * @ordered
	 */
	protected float heatInputOffset = HEAT_INPUT_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNetGrossP() <em>Is Net Gross P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNetGrossP()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NET_GROSS_P_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNetGrossP() <em>Is Net Gross P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNetGrossP()
	 * @generated
	 * @ordered
	 */
	protected boolean isNetGrossP = IS_NET_GROSS_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeatInputEff() <em>Heat Input Eff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatInputEff()
	 * @generated
	 * @ordered
	 */
	protected static final float HEAT_INPUT_EFF_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHeatInputEff() <em>Heat Input Eff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatInputEff()
	 * @generated
	 * @ordered
	 */
	protected float heatInputEff = HEAT_INPUT_EFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuxPowerMult() <em>Aux Power Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxPowerMult()
	 * @generated
	 * @ordered
	 */
	protected static final float AUX_POWER_MULT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAuxPowerMult() <em>Aux Power Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxPowerMult()
	 * @generated
	 * @ordered
	 */
	protected float auxPowerMult = AUX_POWER_MULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuxPowerOffset() <em>Aux Power Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxPowerOffset()
	 * @generated
	 * @ordered
	 */
	protected static final float AUX_POWER_OFFSET_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAuxPowerOffset() <em>Aux Power Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxPowerOffset()
	 * @generated
	 * @ordered
	 */
	protected float auxPowerOffset = AUX_POWER_OFFSET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getThermalGeneratingUnit() <em>Thermal Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected ThermalGeneratingUnit thermalGeneratingUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeatInputCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.HEAT_INPUT_CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHeatInputOffset() {
		return heatInputOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeatInputOffset(float newHeatInputOffset) {
		float oldHeatInputOffset = heatInputOffset;
		heatInputOffset = newHeatInputOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HEAT_INPUT_CURVE__HEAT_INPUT_OFFSET, oldHeatInputOffset, heatInputOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNetGrossP() {
		return isNetGrossP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNetGrossP(boolean newIsNetGrossP) {
		boolean oldIsNetGrossP = isNetGrossP;
		isNetGrossP = newIsNetGrossP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HEAT_INPUT_CURVE__IS_NET_GROSS_P, oldIsNetGrossP, isNetGrossP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHeatInputEff() {
		return heatInputEff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeatInputEff(float newHeatInputEff) {
		float oldHeatInputEff = heatInputEff;
		heatInputEff = newHeatInputEff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HEAT_INPUT_CURVE__HEAT_INPUT_EFF, oldHeatInputEff, heatInputEff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAuxPowerMult() {
		return auxPowerMult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuxPowerMult(float newAuxPowerMult) {
		float oldAuxPowerMult = auxPowerMult;
		auxPowerMult = newAuxPowerMult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HEAT_INPUT_CURVE__AUX_POWER_MULT, oldAuxPowerMult, auxPowerMult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAuxPowerOffset() {
		return auxPowerOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuxPowerOffset(float newAuxPowerOffset) {
		float oldAuxPowerOffset = auxPowerOffset;
		auxPowerOffset = newAuxPowerOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HEAT_INPUT_CURVE__AUX_POWER_OFFSET, oldAuxPowerOffset, auxPowerOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThermalGeneratingUnit getThermalGeneratingUnit() {
		if (thermalGeneratingUnit != null && thermalGeneratingUnit.eIsProxy()) {
			InternalEObject oldThermalGeneratingUnit = (InternalEObject)thermalGeneratingUnit;
			thermalGeneratingUnit = (ThermalGeneratingUnit)eResolveProxy(oldThermalGeneratingUnit);
			if (thermalGeneratingUnit != oldThermalGeneratingUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit, thermalGeneratingUnit));
			}
		}
		return thermalGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThermalGeneratingUnit basicGetThermalGeneratingUnit() {
		return thermalGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThermalGeneratingUnit(ThermalGeneratingUnit newThermalGeneratingUnit, NotificationChain msgs) {
		ThermalGeneratingUnit oldThermalGeneratingUnit = thermalGeneratingUnit;
		thermalGeneratingUnit = newThermalGeneratingUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit, newThermalGeneratingUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalGeneratingUnit(ThermalGeneratingUnit newThermalGeneratingUnit) {
		if (newThermalGeneratingUnit != thermalGeneratingUnit) {
			NotificationChain msgs = null;
			if (thermalGeneratingUnit != null)
				msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE, ThermalGeneratingUnit.class, msgs);
			if (newThermalGeneratingUnit != null)
				msgs = ((InternalEObject)newThermalGeneratingUnit).eInverseAdd(this, ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE, ThermalGeneratingUnit.class, msgs);
			msgs = basicSetThermalGeneratingUnit(newThermalGeneratingUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT, newThermalGeneratingUnit, newThermalGeneratingUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT:
				if (thermalGeneratingUnit != null)
					msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE, ThermalGeneratingUnit.class, msgs);
				return basicSetThermalGeneratingUnit((ThermalGeneratingUnit)otherEnd, msgs);
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
			case ProductionPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT:
				return basicSetThermalGeneratingUnit(null, msgs);
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
			case ProductionPackage.HEAT_INPUT_CURVE__HEAT_INPUT_OFFSET:
				return getHeatInputOffset();
			case ProductionPackage.HEAT_INPUT_CURVE__IS_NET_GROSS_P:
				return isIsNetGrossP();
			case ProductionPackage.HEAT_INPUT_CURVE__HEAT_INPUT_EFF:
				return getHeatInputEff();
			case ProductionPackage.HEAT_INPUT_CURVE__AUX_POWER_MULT:
				return getAuxPowerMult();
			case ProductionPackage.HEAT_INPUT_CURVE__AUX_POWER_OFFSET:
				return getAuxPowerOffset();
			case ProductionPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT:
				if (resolve) return getThermalGeneratingUnit();
				return basicGetThermalGeneratingUnit();
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
			case ProductionPackage.HEAT_INPUT_CURVE__HEAT_INPUT_OFFSET:
				setHeatInputOffset((Float)newValue);
				return;
			case ProductionPackage.HEAT_INPUT_CURVE__IS_NET_GROSS_P:
				setIsNetGrossP((Boolean)newValue);
				return;
			case ProductionPackage.HEAT_INPUT_CURVE__HEAT_INPUT_EFF:
				setHeatInputEff((Float)newValue);
				return;
			case ProductionPackage.HEAT_INPUT_CURVE__AUX_POWER_MULT:
				setAuxPowerMult((Float)newValue);
				return;
			case ProductionPackage.HEAT_INPUT_CURVE__AUX_POWER_OFFSET:
				setAuxPowerOffset((Float)newValue);
				return;
			case ProductionPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)newValue);
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
			case ProductionPackage.HEAT_INPUT_CURVE__HEAT_INPUT_OFFSET:
				setHeatInputOffset(HEAT_INPUT_OFFSET_EDEFAULT);
				return;
			case ProductionPackage.HEAT_INPUT_CURVE__IS_NET_GROSS_P:
				setIsNetGrossP(IS_NET_GROSS_P_EDEFAULT);
				return;
			case ProductionPackage.HEAT_INPUT_CURVE__HEAT_INPUT_EFF:
				setHeatInputEff(HEAT_INPUT_EFF_EDEFAULT);
				return;
			case ProductionPackage.HEAT_INPUT_CURVE__AUX_POWER_MULT:
				setAuxPowerMult(AUX_POWER_MULT_EDEFAULT);
				return;
			case ProductionPackage.HEAT_INPUT_CURVE__AUX_POWER_OFFSET:
				setAuxPowerOffset(AUX_POWER_OFFSET_EDEFAULT);
				return;
			case ProductionPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)null);
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
			case ProductionPackage.HEAT_INPUT_CURVE__HEAT_INPUT_OFFSET:
				return heatInputOffset != HEAT_INPUT_OFFSET_EDEFAULT;
			case ProductionPackage.HEAT_INPUT_CURVE__IS_NET_GROSS_P:
				return isNetGrossP != IS_NET_GROSS_P_EDEFAULT;
			case ProductionPackage.HEAT_INPUT_CURVE__HEAT_INPUT_EFF:
				return heatInputEff != HEAT_INPUT_EFF_EDEFAULT;
			case ProductionPackage.HEAT_INPUT_CURVE__AUX_POWER_MULT:
				return auxPowerMult != AUX_POWER_MULT_EDEFAULT;
			case ProductionPackage.HEAT_INPUT_CURVE__AUX_POWER_OFFSET:
				return auxPowerOffset != AUX_POWER_OFFSET_EDEFAULT;
			case ProductionPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT:
				return thermalGeneratingUnit != null;
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
		result.append(" (heatInputOffset: ");
		result.append(heatInputOffset);
		result.append(", isNetGrossP: ");
		result.append(isNetGrossP);
		result.append(", heatInputEff: ");
		result.append(heatInputEff);
		result.append(", auxPowerMult: ");
		result.append(auxPowerMult);
		result.append(", auxPowerOffset: ");
		result.append(auxPowerOffset);
		result.append(')');
		return result.toString();
	}

} //HeatInputCurveImpl
