/**
 */
package gluemodel.CIM.IEC61970.Core.impl;

import gluemodel.CIM.IEC61970.Core.BaseVoltage;
import gluemodel.CIM.IEC61970.Core.Bay;
import gluemodel.CIM.IEC61970.Core.CorePackage;
import gluemodel.CIM.IEC61970.Core.Substation;
import gluemodel.CIM.IEC61970.Core.VoltageLevel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voltage Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.VoltageLevelImpl#getBays <em>Bays</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.VoltageLevelImpl#getLowVoltageLimit <em>Low Voltage Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.VoltageLevelImpl#getHighVoltageLimit <em>High Voltage Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.VoltageLevelImpl#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.VoltageLevelImpl#getSubstation <em>Substation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VoltageLevelImpl extends EquipmentContainerImpl implements VoltageLevel {
	/**
	 * The cached value of the '{@link #getBays() <em>Bays</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBays()
	 * @generated
	 * @ordered
	 */
	protected EList<Bay> bays;

	/**
	 * The default value of the '{@link #getLowVoltageLimit() <em>Low Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowVoltageLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float LOW_VOLTAGE_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowVoltageLimit() <em>Low Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowVoltageLimit()
	 * @generated
	 * @ordered
	 */
	protected float lowVoltageLimit = LOW_VOLTAGE_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHighVoltageLimit() <em>High Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighVoltageLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float HIGH_VOLTAGE_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHighVoltageLimit() <em>High Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighVoltageLimit()
	 * @generated
	 * @ordered
	 */
	protected float highVoltageLimit = HIGH_VOLTAGE_LIMIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBaseVoltage() <em>Base Voltage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseVoltage()
	 * @generated
	 * @ordered
	 */
	protected BaseVoltage baseVoltage;

	/**
	 * The cached value of the '{@link #getSubstation() <em>Substation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstation()
	 * @generated
	 * @ordered
	 */
	protected Substation substation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoltageLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.VOLTAGE_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bay> getBays() {
		if (bays == null) {
			bays = new EObjectWithInverseResolvingEList<Bay>(Bay.class, this, CorePackage.VOLTAGE_LEVEL__BAYS, CorePackage.BAY__VOLTAGE_LEVEL);
		}
		return bays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLowVoltageLimit() {
		return lowVoltageLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowVoltageLimit(float newLowVoltageLimit) {
		float oldLowVoltageLimit = lowVoltageLimit;
		lowVoltageLimit = newLowVoltageLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT, oldLowVoltageLimit, lowVoltageLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHighVoltageLimit() {
		return highVoltageLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighVoltageLimit(float newHighVoltageLimit) {
		float oldHighVoltageLimit = highVoltageLimit;
		highVoltageLimit = newHighVoltageLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT, oldHighVoltageLimit, highVoltageLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseVoltage getBaseVoltage() {
		if (baseVoltage != null && baseVoltage.eIsProxy()) {
			InternalEObject oldBaseVoltage = (InternalEObject)baseVoltage;
			baseVoltage = (BaseVoltage)eResolveProxy(oldBaseVoltage);
			if (baseVoltage != oldBaseVoltage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.VOLTAGE_LEVEL__BASE_VOLTAGE, oldBaseVoltage, baseVoltage));
			}
		}
		return baseVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseVoltage basicGetBaseVoltage() {
		return baseVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseVoltage(BaseVoltage newBaseVoltage, NotificationChain msgs) {
		BaseVoltage oldBaseVoltage = baseVoltage;
		baseVoltage = newBaseVoltage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.VOLTAGE_LEVEL__BASE_VOLTAGE, oldBaseVoltage, newBaseVoltage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseVoltage(BaseVoltage newBaseVoltage) {
		if (newBaseVoltage != baseVoltage) {
			NotificationChain msgs = null;
			if (baseVoltage != null)
				msgs = ((InternalEObject)baseVoltage).eInverseRemove(this, CorePackage.BASE_VOLTAGE__VOLTAGE_LEVEL, BaseVoltage.class, msgs);
			if (newBaseVoltage != null)
				msgs = ((InternalEObject)newBaseVoltage).eInverseAdd(this, CorePackage.BASE_VOLTAGE__VOLTAGE_LEVEL, BaseVoltage.class, msgs);
			msgs = basicSetBaseVoltage(newBaseVoltage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VOLTAGE_LEVEL__BASE_VOLTAGE, newBaseVoltage, newBaseVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substation getSubstation() {
		if (substation != null && substation.eIsProxy()) {
			InternalEObject oldSubstation = (InternalEObject)substation;
			substation = (Substation)eResolveProxy(oldSubstation);
			if (substation != oldSubstation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.VOLTAGE_LEVEL__SUBSTATION, oldSubstation, substation));
			}
		}
		return substation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substation basicGetSubstation() {
		return substation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstation(Substation newSubstation, NotificationChain msgs) {
		Substation oldSubstation = substation;
		substation = newSubstation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.VOLTAGE_LEVEL__SUBSTATION, oldSubstation, newSubstation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstation(Substation newSubstation) {
		if (newSubstation != substation) {
			NotificationChain msgs = null;
			if (substation != null)
				msgs = ((InternalEObject)substation).eInverseRemove(this, CorePackage.SUBSTATION__VOLTAGE_LEVELS, Substation.class, msgs);
			if (newSubstation != null)
				msgs = ((InternalEObject)newSubstation).eInverseAdd(this, CorePackage.SUBSTATION__VOLTAGE_LEVELS, Substation.class, msgs);
			msgs = basicSetSubstation(newSubstation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VOLTAGE_LEVEL__SUBSTATION, newSubstation, newSubstation));
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
			case CorePackage.VOLTAGE_LEVEL__BAYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBays()).basicAdd(otherEnd, msgs);
			case CorePackage.VOLTAGE_LEVEL__BASE_VOLTAGE:
				if (baseVoltage != null)
					msgs = ((InternalEObject)baseVoltage).eInverseRemove(this, CorePackage.BASE_VOLTAGE__VOLTAGE_LEVEL, BaseVoltage.class, msgs);
				return basicSetBaseVoltage((BaseVoltage)otherEnd, msgs);
			case CorePackage.VOLTAGE_LEVEL__SUBSTATION:
				if (substation != null)
					msgs = ((InternalEObject)substation).eInverseRemove(this, CorePackage.SUBSTATION__VOLTAGE_LEVELS, Substation.class, msgs);
				return basicSetSubstation((Substation)otherEnd, msgs);
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
			case CorePackage.VOLTAGE_LEVEL__BAYS:
				return ((InternalEList<?>)getBays()).basicRemove(otherEnd, msgs);
			case CorePackage.VOLTAGE_LEVEL__BASE_VOLTAGE:
				return basicSetBaseVoltage(null, msgs);
			case CorePackage.VOLTAGE_LEVEL__SUBSTATION:
				return basicSetSubstation(null, msgs);
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
			case CorePackage.VOLTAGE_LEVEL__BAYS:
				return getBays();
			case CorePackage.VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT:
				return getLowVoltageLimit();
			case CorePackage.VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT:
				return getHighVoltageLimit();
			case CorePackage.VOLTAGE_LEVEL__BASE_VOLTAGE:
				if (resolve) return getBaseVoltage();
				return basicGetBaseVoltage();
			case CorePackage.VOLTAGE_LEVEL__SUBSTATION:
				if (resolve) return getSubstation();
				return basicGetSubstation();
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
			case CorePackage.VOLTAGE_LEVEL__BAYS:
				getBays().clear();
				getBays().addAll((Collection<? extends Bay>)newValue);
				return;
			case CorePackage.VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT:
				setLowVoltageLimit((Float)newValue);
				return;
			case CorePackage.VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT:
				setHighVoltageLimit((Float)newValue);
				return;
			case CorePackage.VOLTAGE_LEVEL__BASE_VOLTAGE:
				setBaseVoltage((BaseVoltage)newValue);
				return;
			case CorePackage.VOLTAGE_LEVEL__SUBSTATION:
				setSubstation((Substation)newValue);
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
			case CorePackage.VOLTAGE_LEVEL__BAYS:
				getBays().clear();
				return;
			case CorePackage.VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT:
				setLowVoltageLimit(LOW_VOLTAGE_LIMIT_EDEFAULT);
				return;
			case CorePackage.VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT:
				setHighVoltageLimit(HIGH_VOLTAGE_LIMIT_EDEFAULT);
				return;
			case CorePackage.VOLTAGE_LEVEL__BASE_VOLTAGE:
				setBaseVoltage((BaseVoltage)null);
				return;
			case CorePackage.VOLTAGE_LEVEL__SUBSTATION:
				setSubstation((Substation)null);
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
			case CorePackage.VOLTAGE_LEVEL__BAYS:
				return bays != null && !bays.isEmpty();
			case CorePackage.VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT:
				return lowVoltageLimit != LOW_VOLTAGE_LIMIT_EDEFAULT;
			case CorePackage.VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT:
				return highVoltageLimit != HIGH_VOLTAGE_LIMIT_EDEFAULT;
			case CorePackage.VOLTAGE_LEVEL__BASE_VOLTAGE:
				return baseVoltage != null;
			case CorePackage.VOLTAGE_LEVEL__SUBSTATION:
				return substation != null;
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
		result.append(" (lowVoltageLimit: ");
		result.append(lowVoltageLimit);
		result.append(", highVoltageLimit: ");
		result.append(highVoltageLimit);
		result.append(')');
		return result.toString();
	}

} //VoltageLevelImpl
