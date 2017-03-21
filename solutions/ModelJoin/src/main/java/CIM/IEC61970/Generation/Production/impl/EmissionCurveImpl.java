/**
 */
package CIM.IEC61970.Generation.Production.impl;

import CIM.IEC61970.Core.impl.CurveImpl;

import CIM.IEC61970.Generation.Production.EmissionCurve;
import CIM.IEC61970.Generation.Production.EmissionType;
import CIM.IEC61970.Generation.Production.ProductionPackage;
import CIM.IEC61970.Generation.Production.ThermalGeneratingUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emission Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.EmissionCurveImpl#getEmissionContent <em>Emission Content</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.EmissionCurveImpl#isIsNetGrossP <em>Is Net Gross P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.EmissionCurveImpl#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.EmissionCurveImpl#getEmissionType <em>Emission Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmissionCurveImpl extends CurveImpl implements EmissionCurve {
	/**
	 * The default value of the '{@link #getEmissionContent() <em>Emission Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissionContent()
	 * @generated
	 * @ordered
	 */
	protected static final float EMISSION_CONTENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEmissionContent() <em>Emission Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissionContent()
	 * @generated
	 * @ordered
	 */
	protected float emissionContent = EMISSION_CONTENT_EDEFAULT;

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
	 * The cached value of the '{@link #getThermalGeneratingUnit() <em>Thermal Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected ThermalGeneratingUnit thermalGeneratingUnit;

	/**
	 * The default value of the '{@link #getEmissionType() <em>Emission Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissionType()
	 * @generated
	 * @ordered
	 */
	protected static final EmissionType EMISSION_TYPE_EDEFAULT = EmissionType.CHLORINE;

	/**
	 * The cached value of the '{@link #getEmissionType() <em>Emission Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissionType()
	 * @generated
	 * @ordered
	 */
	protected EmissionType emissionType = EMISSION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmissionCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.EMISSION_CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEmissionContent() {
		return emissionContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmissionContent(float newEmissionContent) {
		float oldEmissionContent = emissionContent;
		emissionContent = newEmissionContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.EMISSION_CURVE__EMISSION_CONTENT, oldEmissionContent, emissionContent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.EMISSION_CURVE__IS_NET_GROSS_P, oldIsNetGrossP, isNetGrossP));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.EMISSION_CURVE__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit, thermalGeneratingUnit));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.EMISSION_CURVE__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit, newThermalGeneratingUnit);
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
				msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES, ThermalGeneratingUnit.class, msgs);
			if (newThermalGeneratingUnit != null)
				msgs = ((InternalEObject)newThermalGeneratingUnit).eInverseAdd(this, ProductionPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES, ThermalGeneratingUnit.class, msgs);
			msgs = basicSetThermalGeneratingUnit(newThermalGeneratingUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.EMISSION_CURVE__THERMAL_GENERATING_UNIT, newThermalGeneratingUnit, newThermalGeneratingUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmissionType getEmissionType() {
		return emissionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmissionType(EmissionType newEmissionType) {
		EmissionType oldEmissionType = emissionType;
		emissionType = newEmissionType == null ? EMISSION_TYPE_EDEFAULT : newEmissionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.EMISSION_CURVE__EMISSION_TYPE, oldEmissionType, emissionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.EMISSION_CURVE__THERMAL_GENERATING_UNIT:
				if (thermalGeneratingUnit != null)
					msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES, ThermalGeneratingUnit.class, msgs);
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
			case ProductionPackage.EMISSION_CURVE__THERMAL_GENERATING_UNIT:
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
			case ProductionPackage.EMISSION_CURVE__EMISSION_CONTENT:
				return getEmissionContent();
			case ProductionPackage.EMISSION_CURVE__IS_NET_GROSS_P:
				return isIsNetGrossP();
			case ProductionPackage.EMISSION_CURVE__THERMAL_GENERATING_UNIT:
				if (resolve) return getThermalGeneratingUnit();
				return basicGetThermalGeneratingUnit();
			case ProductionPackage.EMISSION_CURVE__EMISSION_TYPE:
				return getEmissionType();
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
			case ProductionPackage.EMISSION_CURVE__EMISSION_CONTENT:
				setEmissionContent((Float)newValue);
				return;
			case ProductionPackage.EMISSION_CURVE__IS_NET_GROSS_P:
				setIsNetGrossP((Boolean)newValue);
				return;
			case ProductionPackage.EMISSION_CURVE__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)newValue);
				return;
			case ProductionPackage.EMISSION_CURVE__EMISSION_TYPE:
				setEmissionType((EmissionType)newValue);
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
			case ProductionPackage.EMISSION_CURVE__EMISSION_CONTENT:
				setEmissionContent(EMISSION_CONTENT_EDEFAULT);
				return;
			case ProductionPackage.EMISSION_CURVE__IS_NET_GROSS_P:
				setIsNetGrossP(IS_NET_GROSS_P_EDEFAULT);
				return;
			case ProductionPackage.EMISSION_CURVE__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)null);
				return;
			case ProductionPackage.EMISSION_CURVE__EMISSION_TYPE:
				setEmissionType(EMISSION_TYPE_EDEFAULT);
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
			case ProductionPackage.EMISSION_CURVE__EMISSION_CONTENT:
				return emissionContent != EMISSION_CONTENT_EDEFAULT;
			case ProductionPackage.EMISSION_CURVE__IS_NET_GROSS_P:
				return isNetGrossP != IS_NET_GROSS_P_EDEFAULT;
			case ProductionPackage.EMISSION_CURVE__THERMAL_GENERATING_UNIT:
				return thermalGeneratingUnit != null;
			case ProductionPackage.EMISSION_CURVE__EMISSION_TYPE:
				return emissionType != EMISSION_TYPE_EDEFAULT;
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
		result.append(" (emissionContent: ");
		result.append(emissionContent);
		result.append(", isNetGrossP: ");
		result.append(isNetGrossP);
		result.append(", emissionType: ");
		result.append(emissionType);
		result.append(')');
		return result.toString();
	}

} //EmissionCurveImpl
