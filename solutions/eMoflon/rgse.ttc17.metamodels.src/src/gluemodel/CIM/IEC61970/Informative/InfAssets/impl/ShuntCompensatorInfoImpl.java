/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets.impl;

import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntCompensatorInfo;
import gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shunt Compensator Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ShuntCompensatorInfoImpl#getShuntImpedanceInfo <em>Shunt Impedance Info</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ShuntCompensatorInfoImpl#getMaxPowerLoss <em>Max Power Loss</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShuntCompensatorInfoImpl extends ElectricalInfoImpl implements ShuntCompensatorInfo {
	/**
	 * The cached value of the '{@link #getShuntImpedanceInfo() <em>Shunt Impedance Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 * @ordered
	 */
	protected ShuntImpedanceInfo shuntImpedanceInfo;

	/**
	 * The default value of the '{@link #getMaxPowerLoss() <em>Max Power Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPowerLoss()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_POWER_LOSS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxPowerLoss() <em>Max Power Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPowerLoss()
	 * @generated
	 * @ordered
	 */
	protected float maxPowerLoss = MAX_POWER_LOSS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShuntCompensatorInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getShuntCompensatorInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShuntImpedanceInfo getShuntImpedanceInfo() {
		if (shuntImpedanceInfo != null && shuntImpedanceInfo.eIsProxy()) {
			InternalEObject oldShuntImpedanceInfo = (InternalEObject)shuntImpedanceInfo;
			shuntImpedanceInfo = (ShuntImpedanceInfo)eResolveProxy(oldShuntImpedanceInfo);
			if (shuntImpedanceInfo != oldShuntImpedanceInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.SHUNT_COMPENSATOR_INFO__SHUNT_IMPEDANCE_INFO, oldShuntImpedanceInfo, shuntImpedanceInfo));
			}
		}
		return shuntImpedanceInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShuntImpedanceInfo basicGetShuntImpedanceInfo() {
		return shuntImpedanceInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShuntImpedanceInfo(ShuntImpedanceInfo newShuntImpedanceInfo, NotificationChain msgs) {
		ShuntImpedanceInfo oldShuntImpedanceInfo = shuntImpedanceInfo;
		shuntImpedanceInfo = newShuntImpedanceInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SHUNT_COMPENSATOR_INFO__SHUNT_IMPEDANCE_INFO, oldShuntImpedanceInfo, newShuntImpedanceInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShuntImpedanceInfo(ShuntImpedanceInfo newShuntImpedanceInfo) {
		if (newShuntImpedanceInfo != shuntImpedanceInfo) {
			NotificationChain msgs = null;
			if (shuntImpedanceInfo != null)
				msgs = ((InternalEObject)shuntImpedanceInfo).eInverseRemove(this, InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SHUNT_COMPENSATOR_INFOS, ShuntImpedanceInfo.class, msgs);
			if (newShuntImpedanceInfo != null)
				msgs = ((InternalEObject)newShuntImpedanceInfo).eInverseAdd(this, InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SHUNT_COMPENSATOR_INFOS, ShuntImpedanceInfo.class, msgs);
			msgs = basicSetShuntImpedanceInfo(newShuntImpedanceInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SHUNT_COMPENSATOR_INFO__SHUNT_IMPEDANCE_INFO, newShuntImpedanceInfo, newShuntImpedanceInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxPowerLoss() {
		return maxPowerLoss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxPowerLoss(float newMaxPowerLoss) {
		float oldMaxPowerLoss = maxPowerLoss;
		maxPowerLoss = newMaxPowerLoss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SHUNT_COMPENSATOR_INFO__MAX_POWER_LOSS, oldMaxPowerLoss, maxPowerLoss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfAssetsPackage.SHUNT_COMPENSATOR_INFO__SHUNT_IMPEDANCE_INFO:
				if (shuntImpedanceInfo != null)
					msgs = ((InternalEObject)shuntImpedanceInfo).eInverseRemove(this, InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SHUNT_COMPENSATOR_INFOS, ShuntImpedanceInfo.class, msgs);
				return basicSetShuntImpedanceInfo((ShuntImpedanceInfo)otherEnd, msgs);
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
			case InfAssetsPackage.SHUNT_COMPENSATOR_INFO__SHUNT_IMPEDANCE_INFO:
				return basicSetShuntImpedanceInfo(null, msgs);
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
			case InfAssetsPackage.SHUNT_COMPENSATOR_INFO__SHUNT_IMPEDANCE_INFO:
				if (resolve) return getShuntImpedanceInfo();
				return basicGetShuntImpedanceInfo();
			case InfAssetsPackage.SHUNT_COMPENSATOR_INFO__MAX_POWER_LOSS:
				return getMaxPowerLoss();
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
			case InfAssetsPackage.SHUNT_COMPENSATOR_INFO__SHUNT_IMPEDANCE_INFO:
				setShuntImpedanceInfo((ShuntImpedanceInfo)newValue);
				return;
			case InfAssetsPackage.SHUNT_COMPENSATOR_INFO__MAX_POWER_LOSS:
				setMaxPowerLoss((Float)newValue);
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
			case InfAssetsPackage.SHUNT_COMPENSATOR_INFO__SHUNT_IMPEDANCE_INFO:
				setShuntImpedanceInfo((ShuntImpedanceInfo)null);
				return;
			case InfAssetsPackage.SHUNT_COMPENSATOR_INFO__MAX_POWER_LOSS:
				setMaxPowerLoss(MAX_POWER_LOSS_EDEFAULT);
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
			case InfAssetsPackage.SHUNT_COMPENSATOR_INFO__SHUNT_IMPEDANCE_INFO:
				return shuntImpedanceInfo != null;
			case InfAssetsPackage.SHUNT_COMPENSATOR_INFO__MAX_POWER_LOSS:
				return maxPowerLoss != MAX_POWER_LOSS_EDEFAULT;
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
		result.append(" (maxPowerLoss: ");
		result.append(maxPowerLoss);
		result.append(')');
		return result.toString();
	}

} //ShuntCompensatorInfoImpl
