/**
 */
package CIM.IEC61970.Wires.impl;

import CIM.IEC61970.Core.impl.CurveImpl;

import CIM.IEC61970.Wires.RatioTapChanger;
import CIM.IEC61970.Wires.RatioVariationCurve;
import CIM.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ratio Variation Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.impl.RatioVariationCurveImpl#getRatioTapChanger <em>Ratio Tap Changer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RatioVariationCurveImpl extends CurveImpl implements RatioVariationCurve {
	/**
	 * The cached value of the '{@link #getRatioTapChanger() <em>Ratio Tap Changer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatioTapChanger()
	 * @generated
	 * @ordered
	 */
	protected RatioTapChanger ratioTapChanger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RatioVariationCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.RATIO_VARIATION_CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RatioTapChanger getRatioTapChanger() {
		if (ratioTapChanger != null && ratioTapChanger.eIsProxy()) {
			InternalEObject oldRatioTapChanger = (InternalEObject)ratioTapChanger;
			ratioTapChanger = (RatioTapChanger)eResolveProxy(oldRatioTapChanger);
			if (ratioTapChanger != oldRatioTapChanger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.RATIO_VARIATION_CURVE__RATIO_TAP_CHANGER, oldRatioTapChanger, ratioTapChanger));
			}
		}
		return ratioTapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RatioTapChanger basicGetRatioTapChanger() {
		return ratioTapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRatioTapChanger(RatioTapChanger newRatioTapChanger, NotificationChain msgs) {
		RatioTapChanger oldRatioTapChanger = ratioTapChanger;
		ratioTapChanger = newRatioTapChanger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.RATIO_VARIATION_CURVE__RATIO_TAP_CHANGER, oldRatioTapChanger, newRatioTapChanger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatioTapChanger(RatioTapChanger newRatioTapChanger) {
		if (newRatioTapChanger != ratioTapChanger) {
			NotificationChain msgs = null;
			if (ratioTapChanger != null)
				msgs = ((InternalEObject)ratioTapChanger).eInverseRemove(this, WiresPackage.RATIO_TAP_CHANGER__RATIO_VARIATION_CURVE, RatioTapChanger.class, msgs);
			if (newRatioTapChanger != null)
				msgs = ((InternalEObject)newRatioTapChanger).eInverseAdd(this, WiresPackage.RATIO_TAP_CHANGER__RATIO_VARIATION_CURVE, RatioTapChanger.class, msgs);
			msgs = basicSetRatioTapChanger(newRatioTapChanger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.RATIO_VARIATION_CURVE__RATIO_TAP_CHANGER, newRatioTapChanger, newRatioTapChanger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.RATIO_VARIATION_CURVE__RATIO_TAP_CHANGER:
				if (ratioTapChanger != null)
					msgs = ((InternalEObject)ratioTapChanger).eInverseRemove(this, WiresPackage.RATIO_TAP_CHANGER__RATIO_VARIATION_CURVE, RatioTapChanger.class, msgs);
				return basicSetRatioTapChanger((RatioTapChanger)otherEnd, msgs);
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
			case WiresPackage.RATIO_VARIATION_CURVE__RATIO_TAP_CHANGER:
				return basicSetRatioTapChanger(null, msgs);
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
			case WiresPackage.RATIO_VARIATION_CURVE__RATIO_TAP_CHANGER:
				if (resolve) return getRatioTapChanger();
				return basicGetRatioTapChanger();
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
			case WiresPackage.RATIO_VARIATION_CURVE__RATIO_TAP_CHANGER:
				setRatioTapChanger((RatioTapChanger)newValue);
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
			case WiresPackage.RATIO_VARIATION_CURVE__RATIO_TAP_CHANGER:
				setRatioTapChanger((RatioTapChanger)null);
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
			case WiresPackage.RATIO_VARIATION_CURVE__RATIO_TAP_CHANGER:
				return ratioTapChanger != null;
		}
		return super.eIsSet(featureID);
	}

} //RatioVariationCurveImpl
