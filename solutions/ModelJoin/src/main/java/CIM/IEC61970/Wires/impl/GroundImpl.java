/**
 */
package CIM.IEC61970.Wires.impl;

import CIM.IEC61970.Core.impl.ConductingEquipmentImpl;

import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.WindingInsulation;

import CIM.IEC61970.Wires.Ground;
import CIM.IEC61970.Wires.WiresPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ground</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.impl.GroundImpl#getWindingInsulations <em>Winding Insulations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroundImpl extends ConductingEquipmentImpl implements Ground {
	/**
	 * The cached value of the '{@link #getWindingInsulations() <em>Winding Insulations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindingInsulations()
	 * @generated
	 * @ordered
	 */
	protected EList<WindingInsulation> windingInsulations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroundImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.GROUND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WindingInsulation> getWindingInsulations() {
		if (windingInsulations == null) {
			windingInsulations = new EObjectWithInverseResolvingEList<WindingInsulation>(WindingInsulation.class, this, WiresPackage.GROUND__WINDING_INSULATIONS, InfAssetsPackage.WINDING_INSULATION__GROUND);
		}
		return windingInsulations;
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
			case WiresPackage.GROUND__WINDING_INSULATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWindingInsulations()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.GROUND__WINDING_INSULATIONS:
				return ((InternalEList<?>)getWindingInsulations()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.GROUND__WINDING_INSULATIONS:
				return getWindingInsulations();
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
			case WiresPackage.GROUND__WINDING_INSULATIONS:
				getWindingInsulations().clear();
				getWindingInsulations().addAll((Collection<? extends WindingInsulation>)newValue);
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
			case WiresPackage.GROUND__WINDING_INSULATIONS:
				getWindingInsulations().clear();
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
			case WiresPackage.GROUND__WINDING_INSULATIONS:
				return windingInsulations != null && !windingInsulations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroundImpl
