/**
 */
package gluemodel.CIM.IEC61970.Core.impl;

import gluemodel.CIM.IEC61970.Core.CorePackage;
import gluemodel.CIM.IEC61970.Core.OperatingParticipant;
import gluemodel.CIM.IEC61970.Core.OperatingShare;
import gluemodel.CIM.IEC61970.Core.PowerSystemResource;

import gluemodel.CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operating Share</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.OperatingShareImpl#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.OperatingShareImpl#getPowerSystemResource <em>Power System Resource</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.OperatingShareImpl#getOperatingParticipant <em>Operating Participant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatingShareImpl extends ElementImpl implements OperatingShare {
	/**
	 * The default value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final float PERCENTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected float percentage = PERCENTAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPowerSystemResource() <em>Power System Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSystemResource()
	 * @generated
	 * @ordered
	 */
	protected PowerSystemResource powerSystemResource;

	/**
	 * The cached value of the '{@link #getOperatingParticipant() <em>Operating Participant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingParticipant()
	 * @generated
	 * @ordered
	 */
	protected OperatingParticipant operatingParticipant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatingShareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.OPERATING_SHARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPercentage() {
		return percentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentage(float newPercentage) {
		float oldPercentage = percentage;
		percentage = newPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OPERATING_SHARE__PERCENTAGE, oldPercentage, percentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSystemResource getPowerSystemResource() {
		if (powerSystemResource != null && powerSystemResource.eIsProxy()) {
			InternalEObject oldPowerSystemResource = (InternalEObject)powerSystemResource;
			powerSystemResource = (PowerSystemResource)eResolveProxy(oldPowerSystemResource);
			if (powerSystemResource != oldPowerSystemResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE, oldPowerSystemResource, powerSystemResource));
			}
		}
		return powerSystemResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSystemResource basicGetPowerSystemResource() {
		return powerSystemResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerSystemResource(PowerSystemResource newPowerSystemResource, NotificationChain msgs) {
		PowerSystemResource oldPowerSystemResource = powerSystemResource;
		powerSystemResource = newPowerSystemResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE, oldPowerSystemResource, newPowerSystemResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerSystemResource(PowerSystemResource newPowerSystemResource) {
		if (newPowerSystemResource != powerSystemResource) {
			NotificationChain msgs = null;
			if (powerSystemResource != null)
				msgs = ((InternalEObject)powerSystemResource).eInverseRemove(this, CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE, PowerSystemResource.class, msgs);
			if (newPowerSystemResource != null)
				msgs = ((InternalEObject)newPowerSystemResource).eInverseAdd(this, CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE, PowerSystemResource.class, msgs);
			msgs = basicSetPowerSystemResource(newPowerSystemResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE, newPowerSystemResource, newPowerSystemResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingParticipant getOperatingParticipant() {
		if (operatingParticipant != null && operatingParticipant.eIsProxy()) {
			InternalEObject oldOperatingParticipant = (InternalEObject)operatingParticipant;
			operatingParticipant = (OperatingParticipant)eResolveProxy(oldOperatingParticipant);
			if (operatingParticipant != oldOperatingParticipant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.OPERATING_SHARE__OPERATING_PARTICIPANT, oldOperatingParticipant, operatingParticipant));
			}
		}
		return operatingParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingParticipant basicGetOperatingParticipant() {
		return operatingParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperatingParticipant(OperatingParticipant newOperatingParticipant, NotificationChain msgs) {
		OperatingParticipant oldOperatingParticipant = operatingParticipant;
		operatingParticipant = newOperatingParticipant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.OPERATING_SHARE__OPERATING_PARTICIPANT, oldOperatingParticipant, newOperatingParticipant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatingParticipant(OperatingParticipant newOperatingParticipant) {
		if (newOperatingParticipant != operatingParticipant) {
			NotificationChain msgs = null;
			if (operatingParticipant != null)
				msgs = ((InternalEObject)operatingParticipant).eInverseRemove(this, CorePackage.OPERATING_PARTICIPANT__OPERATING_SHARE, OperatingParticipant.class, msgs);
			if (newOperatingParticipant != null)
				msgs = ((InternalEObject)newOperatingParticipant).eInverseAdd(this, CorePackage.OPERATING_PARTICIPANT__OPERATING_SHARE, OperatingParticipant.class, msgs);
			msgs = basicSetOperatingParticipant(newOperatingParticipant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OPERATING_SHARE__OPERATING_PARTICIPANT, newOperatingParticipant, newOperatingParticipant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE:
				if (powerSystemResource != null)
					msgs = ((InternalEObject)powerSystemResource).eInverseRemove(this, CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE, PowerSystemResource.class, msgs);
				return basicSetPowerSystemResource((PowerSystemResource)otherEnd, msgs);
			case CorePackage.OPERATING_SHARE__OPERATING_PARTICIPANT:
				if (operatingParticipant != null)
					msgs = ((InternalEObject)operatingParticipant).eInverseRemove(this, CorePackage.OPERATING_PARTICIPANT__OPERATING_SHARE, OperatingParticipant.class, msgs);
				return basicSetOperatingParticipant((OperatingParticipant)otherEnd, msgs);
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
			case CorePackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE:
				return basicSetPowerSystemResource(null, msgs);
			case CorePackage.OPERATING_SHARE__OPERATING_PARTICIPANT:
				return basicSetOperatingParticipant(null, msgs);
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
			case CorePackage.OPERATING_SHARE__PERCENTAGE:
				return getPercentage();
			case CorePackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE:
				if (resolve) return getPowerSystemResource();
				return basicGetPowerSystemResource();
			case CorePackage.OPERATING_SHARE__OPERATING_PARTICIPANT:
				if (resolve) return getOperatingParticipant();
				return basicGetOperatingParticipant();
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
			case CorePackage.OPERATING_SHARE__PERCENTAGE:
				setPercentage((Float)newValue);
				return;
			case CorePackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE:
				setPowerSystemResource((PowerSystemResource)newValue);
				return;
			case CorePackage.OPERATING_SHARE__OPERATING_PARTICIPANT:
				setOperatingParticipant((OperatingParticipant)newValue);
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
			case CorePackage.OPERATING_SHARE__PERCENTAGE:
				setPercentage(PERCENTAGE_EDEFAULT);
				return;
			case CorePackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE:
				setPowerSystemResource((PowerSystemResource)null);
				return;
			case CorePackage.OPERATING_SHARE__OPERATING_PARTICIPANT:
				setOperatingParticipant((OperatingParticipant)null);
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
			case CorePackage.OPERATING_SHARE__PERCENTAGE:
				return percentage != PERCENTAGE_EDEFAULT;
			case CorePackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE:
				return powerSystemResource != null;
			case CorePackage.OPERATING_SHARE__OPERATING_PARTICIPANT:
				return operatingParticipant != null;
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
		result.append(" (percentage: ");
		result.append(percentage);
		result.append(')');
		return result.toString();
	}

} //OperatingShareImpl
