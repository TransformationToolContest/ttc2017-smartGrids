/**
 */
package gluemodel.CIM.IEC61970.Equivalents.impl;

import gluemodel.CIM.IEC61970.Core.impl.ConnectivityNodeContainerImpl;

import gluemodel.CIM.IEC61970.Equivalents.EquivalentEquipment;
import gluemodel.CIM.IEC61970.Equivalents.EquivalentNetwork;
import gluemodel.CIM.IEC61970.Equivalents.EquivalentsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equivalent Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Equivalents.impl.EquivalentNetworkImpl#getEquivalentEquipments <em>Equivalent Equipments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquivalentNetworkImpl extends ConnectivityNodeContainerImpl implements EquivalentNetwork {
	/**
	 * The cached value of the '{@link #getEquivalentEquipments() <em>Equivalent Equipments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentEquipments()
	 * @generated
	 * @ordered
	 */
	protected EList<EquivalentEquipment> equivalentEquipments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquivalentNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EquivalentsPackage.Literals.EQUIVALENT_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EquivalentEquipment> getEquivalentEquipments() {
		if (equivalentEquipments == null) {
			equivalentEquipments = new EObjectWithInverseResolvingEList<EquivalentEquipment>(EquivalentEquipment.class, this, EquivalentsPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS, EquivalentsPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK);
		}
		return equivalentEquipments;
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
			case EquivalentsPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEquivalentEquipments()).basicAdd(otherEnd, msgs);
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
			case EquivalentsPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS:
				return ((InternalEList<?>)getEquivalentEquipments()).basicRemove(otherEnd, msgs);
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
			case EquivalentsPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS:
				return getEquivalentEquipments();
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
			case EquivalentsPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS:
				getEquivalentEquipments().clear();
				getEquivalentEquipments().addAll((Collection<? extends EquivalentEquipment>)newValue);
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
			case EquivalentsPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS:
				getEquivalentEquipments().clear();
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
			case EquivalentsPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS:
				return equivalentEquipments != null && !equivalentEquipments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EquivalentNetworkImpl
