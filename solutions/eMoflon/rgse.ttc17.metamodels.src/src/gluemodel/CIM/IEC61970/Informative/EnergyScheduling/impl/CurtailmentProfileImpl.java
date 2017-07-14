/**
 */
package gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.CurtailmentProfile;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curtailment Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.CurtailmentProfileImpl#getEnergyTransaction <em>Energy Transaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurtailmentProfileImpl extends ProfileImpl implements CurtailmentProfile {
	/**
	 * The cached value of the '{@link #getEnergyTransaction() <em>Energy Transaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyTransaction()
	 * @generated
	 * @ordered
	 */
	protected EnergyTransaction energyTransaction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurtailmentProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnergySchedulingPackage.Literals.CURTAILMENT_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyTransaction getEnergyTransaction() {
		if (energyTransaction != null && energyTransaction.eIsProxy()) {
			InternalEObject oldEnergyTransaction = (InternalEObject)energyTransaction;
			energyTransaction = (EnergyTransaction)eResolveProxy(oldEnergyTransaction);
			if (energyTransaction != oldEnergyTransaction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnergySchedulingPackage.CURTAILMENT_PROFILE__ENERGY_TRANSACTION, oldEnergyTransaction, energyTransaction));
			}
		}
		return energyTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyTransaction basicGetEnergyTransaction() {
		return energyTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnergyTransaction(EnergyTransaction newEnergyTransaction, NotificationChain msgs) {
		EnergyTransaction oldEnergyTransaction = energyTransaction;
		energyTransaction = newEnergyTransaction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.CURTAILMENT_PROFILE__ENERGY_TRANSACTION, oldEnergyTransaction, newEnergyTransaction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergyTransaction(EnergyTransaction newEnergyTransaction) {
		if (newEnergyTransaction != energyTransaction) {
			NotificationChain msgs = null;
			if (energyTransaction != null)
				msgs = ((InternalEObject)energyTransaction).eInverseRemove(this, EnergySchedulingPackage.ENERGY_TRANSACTION__CURTAILMENT_PROFILES, EnergyTransaction.class, msgs);
			if (newEnergyTransaction != null)
				msgs = ((InternalEObject)newEnergyTransaction).eInverseAdd(this, EnergySchedulingPackage.ENERGY_TRANSACTION__CURTAILMENT_PROFILES, EnergyTransaction.class, msgs);
			msgs = basicSetEnergyTransaction(newEnergyTransaction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.CURTAILMENT_PROFILE__ENERGY_TRANSACTION, newEnergyTransaction, newEnergyTransaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnergySchedulingPackage.CURTAILMENT_PROFILE__ENERGY_TRANSACTION:
				if (energyTransaction != null)
					msgs = ((InternalEObject)energyTransaction).eInverseRemove(this, EnergySchedulingPackage.ENERGY_TRANSACTION__CURTAILMENT_PROFILES, EnergyTransaction.class, msgs);
				return basicSetEnergyTransaction((EnergyTransaction)otherEnd, msgs);
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
			case EnergySchedulingPackage.CURTAILMENT_PROFILE__ENERGY_TRANSACTION:
				return basicSetEnergyTransaction(null, msgs);
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
			case EnergySchedulingPackage.CURTAILMENT_PROFILE__ENERGY_TRANSACTION:
				if (resolve) return getEnergyTransaction();
				return basicGetEnergyTransaction();
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
			case EnergySchedulingPackage.CURTAILMENT_PROFILE__ENERGY_TRANSACTION:
				setEnergyTransaction((EnergyTransaction)newValue);
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
			case EnergySchedulingPackage.CURTAILMENT_PROFILE__ENERGY_TRANSACTION:
				setEnergyTransaction((EnergyTransaction)null);
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
			case EnergySchedulingPackage.CURTAILMENT_PROFILE__ENERGY_TRANSACTION:
				return energyTransaction != null;
		}
		return super.eIsSet(featureID);
	}

} //CurtailmentProfileImpl
