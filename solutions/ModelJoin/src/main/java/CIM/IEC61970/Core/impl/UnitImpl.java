/**
 */
package CIM.IEC61970.Core.impl;

import CIM.IEC61970.Core.CorePackage;
import CIM.IEC61970.Core.Unit;

import CIM.IEC61970.Meas.Control;
import CIM.IEC61970.Meas.MeasPackage;
import CIM.IEC61970.Meas.Measurement;

import CIM.IEC61970.Protection.ProtectionEquipment;
import CIM.IEC61970.Protection.ProtectionPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Core.impl.UnitImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.UnitImpl#getProtectionEquipments <em>Protection Equipments</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.UnitImpl#getMeasurements <em>Measurements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitImpl extends IdentifiedObjectImpl implements Unit {
	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> controls;

	/**
	 * The cached value of the '{@link #getProtectionEquipments() <em>Protection Equipments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionEquipments()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtectionEquipment> protectionEquipments;

	/**
	 * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurements()
	 * @generated
	 * @ordered
	 */
	protected EList<Measurement> measurements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Control> getControls() {
		if (controls == null) {
			controls = new EObjectWithInverseResolvingEList<Control>(Control.class, this, CorePackage.UNIT__CONTROLS, MeasPackage.CONTROL__UNIT);
		}
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtectionEquipment> getProtectionEquipments() {
		if (protectionEquipments == null) {
			protectionEquipments = new EObjectWithInverseResolvingEList<ProtectionEquipment>(ProtectionEquipment.class, this, CorePackage.UNIT__PROTECTION_EQUIPMENTS, ProtectionPackage.PROTECTION_EQUIPMENT__UNIT);
		}
		return protectionEquipments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measurement> getMeasurements() {
		if (measurements == null) {
			measurements = new EObjectWithInverseResolvingEList<Measurement>(Measurement.class, this, CorePackage.UNIT__MEASUREMENTS, MeasPackage.MEASUREMENT__UNIT);
		}
		return measurements;
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
			case CorePackage.UNIT__CONTROLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControls()).basicAdd(otherEnd, msgs);
			case CorePackage.UNIT__PROTECTION_EQUIPMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProtectionEquipments()).basicAdd(otherEnd, msgs);
			case CorePackage.UNIT__MEASUREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurements()).basicAdd(otherEnd, msgs);
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
			case CorePackage.UNIT__CONTROLS:
				return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
			case CorePackage.UNIT__PROTECTION_EQUIPMENTS:
				return ((InternalEList<?>)getProtectionEquipments()).basicRemove(otherEnd, msgs);
			case CorePackage.UNIT__MEASUREMENTS:
				return ((InternalEList<?>)getMeasurements()).basicRemove(otherEnd, msgs);
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
			case CorePackage.UNIT__CONTROLS:
				return getControls();
			case CorePackage.UNIT__PROTECTION_EQUIPMENTS:
				return getProtectionEquipments();
			case CorePackage.UNIT__MEASUREMENTS:
				return getMeasurements();
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
			case CorePackage.UNIT__CONTROLS:
				getControls().clear();
				getControls().addAll((Collection<? extends Control>)newValue);
				return;
			case CorePackage.UNIT__PROTECTION_EQUIPMENTS:
				getProtectionEquipments().clear();
				getProtectionEquipments().addAll((Collection<? extends ProtectionEquipment>)newValue);
				return;
			case CorePackage.UNIT__MEASUREMENTS:
				getMeasurements().clear();
				getMeasurements().addAll((Collection<? extends Measurement>)newValue);
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
			case CorePackage.UNIT__CONTROLS:
				getControls().clear();
				return;
			case CorePackage.UNIT__PROTECTION_EQUIPMENTS:
				getProtectionEquipments().clear();
				return;
			case CorePackage.UNIT__MEASUREMENTS:
				getMeasurements().clear();
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
			case CorePackage.UNIT__CONTROLS:
				return controls != null && !controls.isEmpty();
			case CorePackage.UNIT__PROTECTION_EQUIPMENTS:
				return protectionEquipments != null && !protectionEquipments.isEmpty();
			case CorePackage.UNIT__MEASUREMENTS:
				return measurements != null && !measurements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UnitImpl
