/**
 */
package substationStandard.Dataclasses.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import substationStandard.Dataclasses.DataclassesPackage;
import substationStandard.Dataclasses.Multiplier;
import substationStandard.Dataclasses.SlUnits;
import substationStandard.Dataclasses.Units;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Units</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.impl.UnitsImpl#getSlUnits <em>Sl Units</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.UnitsImpl#getMultiplier <em>Multiplier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitsImpl extends MinimalEObjectImpl.Container implements Units {
	/**
	 * The cached value of the '{@link #getSlUnits() <em>Sl Units</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlUnits()
	 * @generated
	 * @ordered
	 */
	protected SlUnits slUnits;

	/**
	 * The cached value of the '{@link #getMultiplier() <em>Multiplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplier()
	 * @generated
	 * @ordered
	 */
	protected Multiplier multiplier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.UNITS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlUnits getSlUnits() {
		if (slUnits != null && slUnits.eIsProxy()) {
			InternalEObject oldSlUnits = (InternalEObject)slUnits;
			slUnits = (SlUnits)eResolveProxy(oldSlUnits);
			if (slUnits != oldSlUnits) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.UNITS__SL_UNITS, oldSlUnits, slUnits));
			}
		}
		return slUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlUnits basicGetSlUnits() {
		return slUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlUnits(SlUnits newSlUnits) {
		SlUnits oldSlUnits = slUnits;
		slUnits = newSlUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.UNITS__SL_UNITS, oldSlUnits, slUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplier getMultiplier() {
		if (multiplier != null && multiplier.eIsProxy()) {
			InternalEObject oldMultiplier = (InternalEObject)multiplier;
			multiplier = (Multiplier)eResolveProxy(oldMultiplier);
			if (multiplier != oldMultiplier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.UNITS__MULTIPLIER, oldMultiplier, multiplier));
			}
		}
		return multiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplier basicGetMultiplier() {
		return multiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplier(Multiplier newMultiplier) {
		Multiplier oldMultiplier = multiplier;
		multiplier = newMultiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.UNITS__MULTIPLIER, oldMultiplier, multiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.UNITS__SL_UNITS:
				if (resolve) return getSlUnits();
				return basicGetSlUnits();
			case DataclassesPackage.UNITS__MULTIPLIER:
				if (resolve) return getMultiplier();
				return basicGetMultiplier();
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
			case DataclassesPackage.UNITS__SL_UNITS:
				setSlUnits((SlUnits)newValue);
				return;
			case DataclassesPackage.UNITS__MULTIPLIER:
				setMultiplier((Multiplier)newValue);
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
			case DataclassesPackage.UNITS__SL_UNITS:
				setSlUnits((SlUnits)null);
				return;
			case DataclassesPackage.UNITS__MULTIPLIER:
				setMultiplier((Multiplier)null);
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
			case DataclassesPackage.UNITS__SL_UNITS:
				return slUnits != null;
			case DataclassesPackage.UNITS__MULTIPLIER:
				return multiplier != null;
		}
		return super.eIsSet(featureID);
	}

} //UnitsImpl
