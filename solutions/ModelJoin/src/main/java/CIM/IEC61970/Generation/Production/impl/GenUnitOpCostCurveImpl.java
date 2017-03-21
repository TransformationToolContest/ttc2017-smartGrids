/**
 */
package CIM.IEC61970.Generation.Production.impl;

import CIM.IEC61970.Core.impl.CurveImpl;

import CIM.IEC61970.Generation.Production.GenUnitOpCostCurve;
import CIM.IEC61970.Generation.Production.GeneratingUnit;
import CIM.IEC61970.Generation.Production.ProductionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Unit Op Cost Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GenUnitOpCostCurveImpl#isIsNetGrossP <em>Is Net Gross P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GenUnitOpCostCurveImpl#getGeneratingUnit <em>Generating Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenUnitOpCostCurveImpl extends CurveImpl implements GenUnitOpCostCurve {
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
	 * The cached value of the '{@link #getGeneratingUnit() <em>Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected GeneratingUnit generatingUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenUnitOpCostCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.GEN_UNIT_OP_COST_CURVE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GEN_UNIT_OP_COST_CURVE__IS_NET_GROSS_P, oldIsNetGrossP, isNetGrossP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratingUnit getGeneratingUnit() {
		if (generatingUnit != null && generatingUnit.eIsProxy()) {
			InternalEObject oldGeneratingUnit = (InternalEObject)generatingUnit;
			generatingUnit = (GeneratingUnit)eResolveProxy(oldGeneratingUnit);
			if (generatingUnit != oldGeneratingUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.GEN_UNIT_OP_COST_CURVE__GENERATING_UNIT, oldGeneratingUnit, generatingUnit));
			}
		}
		return generatingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratingUnit basicGetGeneratingUnit() {
		return generatingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratingUnit(GeneratingUnit newGeneratingUnit, NotificationChain msgs) {
		GeneratingUnit oldGeneratingUnit = generatingUnit;
		generatingUnit = newGeneratingUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.GEN_UNIT_OP_COST_CURVE__GENERATING_UNIT, oldGeneratingUnit, newGeneratingUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratingUnit(GeneratingUnit newGeneratingUnit) {
		if (newGeneratingUnit != generatingUnit) {
			NotificationChain msgs = null;
			if (generatingUnit != null)
				msgs = ((InternalEObject)generatingUnit).eInverseRemove(this, ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES, GeneratingUnit.class, msgs);
			if (newGeneratingUnit != null)
				msgs = ((InternalEObject)newGeneratingUnit).eInverseAdd(this, ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES, GeneratingUnit.class, msgs);
			msgs = basicSetGeneratingUnit(newGeneratingUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GEN_UNIT_OP_COST_CURVE__GENERATING_UNIT, newGeneratingUnit, newGeneratingUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.GEN_UNIT_OP_COST_CURVE__GENERATING_UNIT:
				if (generatingUnit != null)
					msgs = ((InternalEObject)generatingUnit).eInverseRemove(this, ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES, GeneratingUnit.class, msgs);
				return basicSetGeneratingUnit((GeneratingUnit)otherEnd, msgs);
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
			case ProductionPackage.GEN_UNIT_OP_COST_CURVE__GENERATING_UNIT:
				return basicSetGeneratingUnit(null, msgs);
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
			case ProductionPackage.GEN_UNIT_OP_COST_CURVE__IS_NET_GROSS_P:
				return isIsNetGrossP();
			case ProductionPackage.GEN_UNIT_OP_COST_CURVE__GENERATING_UNIT:
				if (resolve) return getGeneratingUnit();
				return basicGetGeneratingUnit();
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
			case ProductionPackage.GEN_UNIT_OP_COST_CURVE__IS_NET_GROSS_P:
				setIsNetGrossP((Boolean)newValue);
				return;
			case ProductionPackage.GEN_UNIT_OP_COST_CURVE__GENERATING_UNIT:
				setGeneratingUnit((GeneratingUnit)newValue);
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
			case ProductionPackage.GEN_UNIT_OP_COST_CURVE__IS_NET_GROSS_P:
				setIsNetGrossP(IS_NET_GROSS_P_EDEFAULT);
				return;
			case ProductionPackage.GEN_UNIT_OP_COST_CURVE__GENERATING_UNIT:
				setGeneratingUnit((GeneratingUnit)null);
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
			case ProductionPackage.GEN_UNIT_OP_COST_CURVE__IS_NET_GROSS_P:
				return isNetGrossP != IS_NET_GROSS_P_EDEFAULT;
			case ProductionPackage.GEN_UNIT_OP_COST_CURVE__GENERATING_UNIT:
				return generatingUnit != null;
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
		result.append(" (isNetGrossP: ");
		result.append(isNetGrossP);
		result.append(')');
		return result.toString();
	}

} //GenUnitOpCostCurveImpl
