/**
 */
package CIM.IEC61970.Wires.impl;

import CIM.IEC61970.Core.impl.CurveImpl;

import CIM.IEC61970.Wires.PhaseTapChanger;
import CIM.IEC61970.Wires.PhaseVariationCurve;
import CIM.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phase Variation Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.impl.PhaseVariationCurveImpl#getPhaseTapChanger <em>Phase Tap Changer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhaseVariationCurveImpl extends CurveImpl implements PhaseVariationCurve {
	/**
	 * The cached value of the '{@link #getPhaseTapChanger() <em>Phase Tap Changer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseTapChanger()
	 * @generated
	 * @ordered
	 */
	protected PhaseTapChanger phaseTapChanger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhaseVariationCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.PHASE_VARIATION_CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseTapChanger getPhaseTapChanger() {
		if (phaseTapChanger != null && phaseTapChanger.eIsProxy()) {
			InternalEObject oldPhaseTapChanger = (InternalEObject)phaseTapChanger;
			phaseTapChanger = (PhaseTapChanger)eResolveProxy(oldPhaseTapChanger);
			if (phaseTapChanger != oldPhaseTapChanger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.PHASE_VARIATION_CURVE__PHASE_TAP_CHANGER, oldPhaseTapChanger, phaseTapChanger));
			}
		}
		return phaseTapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseTapChanger basicGetPhaseTapChanger() {
		return phaseTapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhaseTapChanger(PhaseTapChanger newPhaseTapChanger, NotificationChain msgs) {
		PhaseTapChanger oldPhaseTapChanger = phaseTapChanger;
		phaseTapChanger = newPhaseTapChanger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.PHASE_VARIATION_CURVE__PHASE_TAP_CHANGER, oldPhaseTapChanger, newPhaseTapChanger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseTapChanger(PhaseTapChanger newPhaseTapChanger) {
		if (newPhaseTapChanger != phaseTapChanger) {
			NotificationChain msgs = null;
			if (phaseTapChanger != null)
				msgs = ((InternalEObject)phaseTapChanger).eInverseRemove(this, WiresPackage.PHASE_TAP_CHANGER__PHASE_VARIATION_CURVE, PhaseTapChanger.class, msgs);
			if (newPhaseTapChanger != null)
				msgs = ((InternalEObject)newPhaseTapChanger).eInverseAdd(this, WiresPackage.PHASE_TAP_CHANGER__PHASE_VARIATION_CURVE, PhaseTapChanger.class, msgs);
			msgs = basicSetPhaseTapChanger(newPhaseTapChanger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.PHASE_VARIATION_CURVE__PHASE_TAP_CHANGER, newPhaseTapChanger, newPhaseTapChanger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.PHASE_VARIATION_CURVE__PHASE_TAP_CHANGER:
				if (phaseTapChanger != null)
					msgs = ((InternalEObject)phaseTapChanger).eInverseRemove(this, WiresPackage.PHASE_TAP_CHANGER__PHASE_VARIATION_CURVE, PhaseTapChanger.class, msgs);
				return basicSetPhaseTapChanger((PhaseTapChanger)otherEnd, msgs);
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
			case WiresPackage.PHASE_VARIATION_CURVE__PHASE_TAP_CHANGER:
				return basicSetPhaseTapChanger(null, msgs);
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
			case WiresPackage.PHASE_VARIATION_CURVE__PHASE_TAP_CHANGER:
				if (resolve) return getPhaseTapChanger();
				return basicGetPhaseTapChanger();
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
			case WiresPackage.PHASE_VARIATION_CURVE__PHASE_TAP_CHANGER:
				setPhaseTapChanger((PhaseTapChanger)newValue);
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
			case WiresPackage.PHASE_VARIATION_CURVE__PHASE_TAP_CHANGER:
				setPhaseTapChanger((PhaseTapChanger)null);
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
			case WiresPackage.PHASE_VARIATION_CURVE__PHASE_TAP_CHANGER:
				return phaseTapChanger != null;
		}
		return super.eIsSet(featureID);
	}

} //PhaseVariationCurveImpl
