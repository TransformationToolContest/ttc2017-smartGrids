/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.PoleInfo;
import CIM.IEC61970.Informative.InfAssets.StreetlightInfo;
import CIM.IEC61970.Informative.InfAssets.StreetlightLampKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Streetlight Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.StreetlightInfoImpl#getLightRating <em>Light Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.StreetlightInfoImpl#getArmLength <em>Arm Length</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.StreetlightInfoImpl#getPole <em>Pole</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.StreetlightInfoImpl#getLampKind <em>Lamp Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StreetlightInfoImpl extends ElectricalInfoImpl implements StreetlightInfo {
	/**
	 * The default value of the '{@link #getLightRating() <em>Light Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightRating()
	 * @generated
	 * @ordered
	 */
	protected static final float LIGHT_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLightRating() <em>Light Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightRating()
	 * @generated
	 * @ordered
	 */
	protected float lightRating = LIGHT_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getArmLength() <em>Arm Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmLength()
	 * @generated
	 * @ordered
	 */
	protected static final float ARM_LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getArmLength() <em>Arm Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmLength()
	 * @generated
	 * @ordered
	 */
	protected float armLength = ARM_LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPole() <em>Pole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPole()
	 * @generated
	 * @ordered
	 */
	protected PoleInfo pole;

	/**
	 * The default value of the '{@link #getLampKind() <em>Lamp Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLampKind()
	 * @generated
	 * @ordered
	 */
	protected static final StreetlightLampKind LAMP_KIND_EDEFAULT = StreetlightLampKind.OTHER;

	/**
	 * The cached value of the '{@link #getLampKind() <em>Lamp Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLampKind()
	 * @generated
	 * @ordered
	 */
	protected StreetlightLampKind lampKind = LAMP_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreetlightInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getStreetlightInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLightRating() {
		return lightRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLightRating(float newLightRating) {
		float oldLightRating = lightRating;
		lightRating = newLightRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.STREETLIGHT_INFO__LIGHT_RATING, oldLightRating, lightRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getArmLength() {
		return armLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArmLength(float newArmLength) {
		float oldArmLength = armLength;
		armLength = newArmLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.STREETLIGHT_INFO__ARM_LENGTH, oldArmLength, armLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoleInfo getPole() {
		if (pole != null && pole.eIsProxy()) {
			InternalEObject oldPole = (InternalEObject)pole;
			pole = (PoleInfo)eResolveProxy(oldPole);
			if (pole != oldPole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.STREETLIGHT_INFO__POLE, oldPole, pole));
			}
		}
		return pole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoleInfo basicGetPole() {
		return pole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPole(PoleInfo newPole, NotificationChain msgs) {
		PoleInfo oldPole = pole;
		pole = newPole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.STREETLIGHT_INFO__POLE, oldPole, newPole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPole(PoleInfo newPole) {
		if (newPole != pole) {
			NotificationChain msgs = null;
			if (pole != null)
				msgs = ((InternalEObject)pole).eInverseRemove(this, InfAssetsPackage.POLE_INFO__STREETLIGHTS, PoleInfo.class, msgs);
			if (newPole != null)
				msgs = ((InternalEObject)newPole).eInverseAdd(this, InfAssetsPackage.POLE_INFO__STREETLIGHTS, PoleInfo.class, msgs);
			msgs = basicSetPole(newPole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.STREETLIGHT_INFO__POLE, newPole, newPole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreetlightLampKind getLampKind() {
		return lampKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLampKind(StreetlightLampKind newLampKind) {
		StreetlightLampKind oldLampKind = lampKind;
		lampKind = newLampKind == null ? LAMP_KIND_EDEFAULT : newLampKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.STREETLIGHT_INFO__LAMP_KIND, oldLampKind, lampKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfAssetsPackage.STREETLIGHT_INFO__POLE:
				if (pole != null)
					msgs = ((InternalEObject)pole).eInverseRemove(this, InfAssetsPackage.POLE_INFO__STREETLIGHTS, PoleInfo.class, msgs);
				return basicSetPole((PoleInfo)otherEnd, msgs);
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
			case InfAssetsPackage.STREETLIGHT_INFO__POLE:
				return basicSetPole(null, msgs);
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
			case InfAssetsPackage.STREETLIGHT_INFO__LIGHT_RATING:
				return getLightRating();
			case InfAssetsPackage.STREETLIGHT_INFO__ARM_LENGTH:
				return getArmLength();
			case InfAssetsPackage.STREETLIGHT_INFO__POLE:
				if (resolve) return getPole();
				return basicGetPole();
			case InfAssetsPackage.STREETLIGHT_INFO__LAMP_KIND:
				return getLampKind();
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
			case InfAssetsPackage.STREETLIGHT_INFO__LIGHT_RATING:
				setLightRating((Float)newValue);
				return;
			case InfAssetsPackage.STREETLIGHT_INFO__ARM_LENGTH:
				setArmLength((Float)newValue);
				return;
			case InfAssetsPackage.STREETLIGHT_INFO__POLE:
				setPole((PoleInfo)newValue);
				return;
			case InfAssetsPackage.STREETLIGHT_INFO__LAMP_KIND:
				setLampKind((StreetlightLampKind)newValue);
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
			case InfAssetsPackage.STREETLIGHT_INFO__LIGHT_RATING:
				setLightRating(LIGHT_RATING_EDEFAULT);
				return;
			case InfAssetsPackage.STREETLIGHT_INFO__ARM_LENGTH:
				setArmLength(ARM_LENGTH_EDEFAULT);
				return;
			case InfAssetsPackage.STREETLIGHT_INFO__POLE:
				setPole((PoleInfo)null);
				return;
			case InfAssetsPackage.STREETLIGHT_INFO__LAMP_KIND:
				setLampKind(LAMP_KIND_EDEFAULT);
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
			case InfAssetsPackage.STREETLIGHT_INFO__LIGHT_RATING:
				return lightRating != LIGHT_RATING_EDEFAULT;
			case InfAssetsPackage.STREETLIGHT_INFO__ARM_LENGTH:
				return armLength != ARM_LENGTH_EDEFAULT;
			case InfAssetsPackage.STREETLIGHT_INFO__POLE:
				return pole != null;
			case InfAssetsPackage.STREETLIGHT_INFO__LAMP_KIND:
				return lampKind != LAMP_KIND_EDEFAULT;
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
		result.append(" (lightRating: ");
		result.append(lightRating);
		result.append(", armLength: ");
		result.append(armLength);
		result.append(", lampKind: ");
		result.append(lampKind);
		result.append(')');
		return result.toString();
	}

} //StreetlightInfoImpl
