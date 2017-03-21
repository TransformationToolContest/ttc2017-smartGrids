/**
 */
package CIM.IEC61970.Informative.EnergyScheduling.impl;

import CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec;
import CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;
import CIM.IEC61970.Informative.EnergyScheduling.Reserve;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reserve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.ReserveImpl#getAreaReserveSpec <em>Area Reserve Spec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReserveImpl extends EnergyTransactionImpl implements Reserve {
	/**
	 * The cached value of the '{@link #getAreaReserveSpec() <em>Area Reserve Spec</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaReserveSpec()
	 * @generated
	 * @ordered
	 */
	protected EList<AreaReserveSpec> areaReserveSpec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReserveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnergySchedulingPackage.Literals.RESERVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AreaReserveSpec> getAreaReserveSpec() {
		if (areaReserveSpec == null) {
			areaReserveSpec = new EObjectWithInverseResolvingEList<AreaReserveSpec>(AreaReserveSpec.class, this, EnergySchedulingPackage.RESERVE__AREA_RESERVE_SPEC, EnergySchedulingPackage.AREA_RESERVE_SPEC__RESERVE_ENERGY_TRANSACTION);
		}
		return areaReserveSpec;
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
			case EnergySchedulingPackage.RESERVE__AREA_RESERVE_SPEC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAreaReserveSpec()).basicAdd(otherEnd, msgs);
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
			case EnergySchedulingPackage.RESERVE__AREA_RESERVE_SPEC:
				return ((InternalEList<?>)getAreaReserveSpec()).basicRemove(otherEnd, msgs);
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
			case EnergySchedulingPackage.RESERVE__AREA_RESERVE_SPEC:
				return getAreaReserveSpec();
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
			case EnergySchedulingPackage.RESERVE__AREA_RESERVE_SPEC:
				getAreaReserveSpec().clear();
				getAreaReserveSpec().addAll((Collection<? extends AreaReserveSpec>)newValue);
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
			case EnergySchedulingPackage.RESERVE__AREA_RESERVE_SPEC:
				getAreaReserveSpec().clear();
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
			case EnergySchedulingPackage.RESERVE__AREA_RESERVE_SPEC:
				return areaReserveSpec != null && !areaReserveSpec.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReserveImpl
