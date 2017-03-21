/**
 */
package CIM.IEC61970.Contingency.impl;

import CIM.IEC61970.Contingency.ContingencyEquipment;
import CIM.IEC61970.Contingency.ContingencyEquipmentStatusKind;
import CIM.IEC61970.Contingency.ContingencyPackage;

import CIM.IEC61970.Core.CorePackage;
import CIM.IEC61970.Core.Equipment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Contingency.impl.ContingencyEquipmentImpl#getEquipment <em>Equipment</em>}</li>
 *   <li>{@link CIM.IEC61970.Contingency.impl.ContingencyEquipmentImpl#getContingentStatus <em>Contingent Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContingencyEquipmentImpl extends ContingencyElementImpl implements ContingencyEquipment {
	/**
	 * The cached value of the '{@link #getEquipment() <em>Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipment()
	 * @generated
	 * @ordered
	 */
	protected Equipment equipment;

	/**
	 * The default value of the '{@link #getContingentStatus() <em>Contingent Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContingentStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ContingencyEquipmentStatusKind CONTINGENT_STATUS_EDEFAULT = ContingencyEquipmentStatusKind.OUT_OF_SERVICE;

	/**
	 * The cached value of the '{@link #getContingentStatus() <em>Contingent Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContingentStatus()
	 * @generated
	 * @ordered
	 */
	protected ContingencyEquipmentStatusKind contingentStatus = CONTINGENT_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContingencyEquipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContingencyPackage.Literals.CONTINGENCY_EQUIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipment getEquipment() {
		if (equipment != null && equipment.eIsProxy()) {
			InternalEObject oldEquipment = (InternalEObject)equipment;
			equipment = (Equipment)eResolveProxy(oldEquipment);
			if (equipment != oldEquipment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContingencyPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT, oldEquipment, equipment));
			}
		}
		return equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipment basicGetEquipment() {
		return equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquipment(Equipment newEquipment, NotificationChain msgs) {
		Equipment oldEquipment = equipment;
		equipment = newEquipment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContingencyPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT, oldEquipment, newEquipment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquipment(Equipment newEquipment) {
		if (newEquipment != equipment) {
			NotificationChain msgs = null;
			if (equipment != null)
				msgs = ((InternalEObject)equipment).eInverseRemove(this, CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT, Equipment.class, msgs);
			if (newEquipment != null)
				msgs = ((InternalEObject)newEquipment).eInverseAdd(this, CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT, Equipment.class, msgs);
			msgs = basicSetEquipment(newEquipment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContingencyPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT, newEquipment, newEquipment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContingencyEquipmentStatusKind getContingentStatus() {
		return contingentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContingentStatus(ContingencyEquipmentStatusKind newContingentStatus) {
		ContingencyEquipmentStatusKind oldContingentStatus = contingentStatus;
		contingentStatus = newContingentStatus == null ? CONTINGENT_STATUS_EDEFAULT : newContingentStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContingencyPackage.CONTINGENCY_EQUIPMENT__CONTINGENT_STATUS, oldContingentStatus, contingentStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContingencyPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT:
				if (equipment != null)
					msgs = ((InternalEObject)equipment).eInverseRemove(this, CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT, Equipment.class, msgs);
				return basicSetEquipment((Equipment)otherEnd, msgs);
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
			case ContingencyPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT:
				return basicSetEquipment(null, msgs);
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
			case ContingencyPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT:
				if (resolve) return getEquipment();
				return basicGetEquipment();
			case ContingencyPackage.CONTINGENCY_EQUIPMENT__CONTINGENT_STATUS:
				return getContingentStatus();
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
			case ContingencyPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT:
				setEquipment((Equipment)newValue);
				return;
			case ContingencyPackage.CONTINGENCY_EQUIPMENT__CONTINGENT_STATUS:
				setContingentStatus((ContingencyEquipmentStatusKind)newValue);
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
			case ContingencyPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT:
				setEquipment((Equipment)null);
				return;
			case ContingencyPackage.CONTINGENCY_EQUIPMENT__CONTINGENT_STATUS:
				setContingentStatus(CONTINGENT_STATUS_EDEFAULT);
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
			case ContingencyPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT:
				return equipment != null;
			case ContingencyPackage.CONTINGENCY_EQUIPMENT__CONTINGENT_STATUS:
				return contingentStatus != CONTINGENT_STATUS_EDEFAULT;
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
		result.append(" (contingentStatus: ");
		result.append(contingentStatus);
		result.append(')');
		return result.toString();
	}

} //ContingencyEquipmentImpl
