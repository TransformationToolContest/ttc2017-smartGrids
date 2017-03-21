/**
 */
package CIM.IEC61970.Wires.impl;

import CIM.IEC61970.Core.impl.CurveImpl;

import CIM.IEC61970.Wires.ImpedanceVariationCurve;
import CIM.IEC61970.Wires.TapChanger;
import CIM.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Impedance Variation Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.impl.ImpedanceVariationCurveImpl#getTapChanger <em>Tap Changer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImpedanceVariationCurveImpl extends CurveImpl implements ImpedanceVariationCurve {
	/**
	 * The cached value of the '{@link #getTapChanger() <em>Tap Changer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapChanger()
	 * @generated
	 * @ordered
	 */
	protected TapChanger tapChanger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImpedanceVariationCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.IMPEDANCE_VARIATION_CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapChanger getTapChanger() {
		if (tapChanger != null && tapChanger.eIsProxy()) {
			InternalEObject oldTapChanger = (InternalEObject)tapChanger;
			tapChanger = (TapChanger)eResolveProxy(oldTapChanger);
			if (tapChanger != oldTapChanger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.IMPEDANCE_VARIATION_CURVE__TAP_CHANGER, oldTapChanger, tapChanger));
			}
		}
		return tapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapChanger basicGetTapChanger() {
		return tapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTapChanger(TapChanger newTapChanger, NotificationChain msgs) {
		TapChanger oldTapChanger = tapChanger;
		tapChanger = newTapChanger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.IMPEDANCE_VARIATION_CURVE__TAP_CHANGER, oldTapChanger, newTapChanger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTapChanger(TapChanger newTapChanger) {
		if (newTapChanger != tapChanger) {
			NotificationChain msgs = null;
			if (tapChanger != null)
				msgs = ((InternalEObject)tapChanger).eInverseRemove(this, WiresPackage.TAP_CHANGER__IMPEDANCE_VARIATION_CURVE, TapChanger.class, msgs);
			if (newTapChanger != null)
				msgs = ((InternalEObject)newTapChanger).eInverseAdd(this, WiresPackage.TAP_CHANGER__IMPEDANCE_VARIATION_CURVE, TapChanger.class, msgs);
			msgs = basicSetTapChanger(newTapChanger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.IMPEDANCE_VARIATION_CURVE__TAP_CHANGER, newTapChanger, newTapChanger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.IMPEDANCE_VARIATION_CURVE__TAP_CHANGER:
				if (tapChanger != null)
					msgs = ((InternalEObject)tapChanger).eInverseRemove(this, WiresPackage.TAP_CHANGER__IMPEDANCE_VARIATION_CURVE, TapChanger.class, msgs);
				return basicSetTapChanger((TapChanger)otherEnd, msgs);
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
			case WiresPackage.IMPEDANCE_VARIATION_CURVE__TAP_CHANGER:
				return basicSetTapChanger(null, msgs);
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
			case WiresPackage.IMPEDANCE_VARIATION_CURVE__TAP_CHANGER:
				if (resolve) return getTapChanger();
				return basicGetTapChanger();
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
			case WiresPackage.IMPEDANCE_VARIATION_CURVE__TAP_CHANGER:
				setTapChanger((TapChanger)newValue);
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
			case WiresPackage.IMPEDANCE_VARIATION_CURVE__TAP_CHANGER:
				setTapChanger((TapChanger)null);
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
			case WiresPackage.IMPEDANCE_VARIATION_CURVE__TAP_CHANGER:
				return tapChanger != null;
		}
		return super.eIsSet(featureID);
	}

} //ImpedanceVariationCurveImpl
