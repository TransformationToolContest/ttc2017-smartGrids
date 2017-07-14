/**
 */
package gluemodel.CIM.IEC61970.Equivalents.impl;

import gluemodel.CIM.IEC61970.Core.impl.ConductingEquipmentImpl;

import gluemodel.CIM.IEC61970.Equivalents.EquivalentEquipment;
import gluemodel.CIM.IEC61970.Equivalents.EquivalentNetwork;
import gluemodel.CIM.IEC61970.Equivalents.EquivalentsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equivalent Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Equivalents.impl.EquivalentEquipmentImpl#getEquivalentNetwork <em>Equivalent Network</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquivalentEquipmentImpl extends ConductingEquipmentImpl implements EquivalentEquipment {
	/**
	 * The cached value of the '{@link #getEquivalentNetwork() <em>Equivalent Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentNetwork()
	 * @generated
	 * @ordered
	 */
	protected EquivalentNetwork equivalentNetwork;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquivalentEquipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EquivalentsPackage.Literals.EQUIVALENT_EQUIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentNetwork getEquivalentNetwork() {
		if (equivalentNetwork != null && equivalentNetwork.eIsProxy()) {
			InternalEObject oldEquivalentNetwork = (InternalEObject)equivalentNetwork;
			equivalentNetwork = (EquivalentNetwork)eResolveProxy(oldEquivalentNetwork);
			if (equivalentNetwork != oldEquivalentNetwork) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EquivalentsPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK, oldEquivalentNetwork, equivalentNetwork));
			}
		}
		return equivalentNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentNetwork basicGetEquivalentNetwork() {
		return equivalentNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquivalentNetwork(EquivalentNetwork newEquivalentNetwork, NotificationChain msgs) {
		EquivalentNetwork oldEquivalentNetwork = equivalentNetwork;
		equivalentNetwork = newEquivalentNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EquivalentsPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK, oldEquivalentNetwork, newEquivalentNetwork);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquivalentNetwork(EquivalentNetwork newEquivalentNetwork) {
		if (newEquivalentNetwork != equivalentNetwork) {
			NotificationChain msgs = null;
			if (equivalentNetwork != null)
				msgs = ((InternalEObject)equivalentNetwork).eInverseRemove(this, EquivalentsPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS, EquivalentNetwork.class, msgs);
			if (newEquivalentNetwork != null)
				msgs = ((InternalEObject)newEquivalentNetwork).eInverseAdd(this, EquivalentsPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS, EquivalentNetwork.class, msgs);
			msgs = basicSetEquivalentNetwork(newEquivalentNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EquivalentsPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK, newEquivalentNetwork, newEquivalentNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EquivalentsPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK:
				if (equivalentNetwork != null)
					msgs = ((InternalEObject)equivalentNetwork).eInverseRemove(this, EquivalentsPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS, EquivalentNetwork.class, msgs);
				return basicSetEquivalentNetwork((EquivalentNetwork)otherEnd, msgs);
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
			case EquivalentsPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK:
				return basicSetEquivalentNetwork(null, msgs);
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
			case EquivalentsPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK:
				if (resolve) return getEquivalentNetwork();
				return basicGetEquivalentNetwork();
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
			case EquivalentsPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK:
				setEquivalentNetwork((EquivalentNetwork)newValue);
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
			case EquivalentsPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK:
				setEquivalentNetwork((EquivalentNetwork)null);
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
			case EquivalentsPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK:
				return equivalentNetwork != null;
		}
		return super.eIsSet(featureID);
	}

} //EquivalentEquipmentImpl
