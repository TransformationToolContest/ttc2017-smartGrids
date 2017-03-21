/**
 */
package CIM.IEC61970.Wires.impl;

import CIM.IEC61968.WiresExt.DistributionTransformerWinding;
import CIM.IEC61968.WiresExt.WiresExtPackage;

import CIM.IEC61970.Wires.RatioTapChanger;
import CIM.IEC61970.Wires.RatioVariationCurve;
import CIM.IEC61970.Wires.TransformerControlMode;
import CIM.IEC61970.Wires.TransformerWinding;
import CIM.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ratio Tap Changer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.impl.RatioTapChangerImpl#getRatioVariationCurve <em>Ratio Variation Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.RatioTapChangerImpl#getTransformerWinding <em>Transformer Winding</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.RatioTapChangerImpl#getWinding <em>Winding</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.RatioTapChangerImpl#getTculControlMode <em>Tcul Control Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RatioTapChangerImpl extends TapChangerImpl implements RatioTapChanger {
	/**
	 * The cached value of the '{@link #getRatioVariationCurve() <em>Ratio Variation Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatioVariationCurve()
	 * @generated
	 * @ordered
	 */
	protected RatioVariationCurve ratioVariationCurve;

	/**
	 * The cached value of the '{@link #getTransformerWinding() <em>Transformer Winding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerWinding()
	 * @generated
	 * @ordered
	 */
	protected TransformerWinding transformerWinding;

	/**
	 * The cached value of the '{@link #getWinding() <em>Winding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinding()
	 * @generated
	 * @ordered
	 */
	protected DistributionTransformerWinding winding;

	/**
	 * The default value of the '{@link #getTculControlMode() <em>Tcul Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTculControlMode()
	 * @generated
	 * @ordered
	 */
	protected static final TransformerControlMode TCUL_CONTROL_MODE_EDEFAULT = TransformerControlMode.REACTIVE;

	/**
	 * The cached value of the '{@link #getTculControlMode() <em>Tcul Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTculControlMode()
	 * @generated
	 * @ordered
	 */
	protected TransformerControlMode tculControlMode = TCUL_CONTROL_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RatioTapChangerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.RATIO_TAP_CHANGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RatioVariationCurve getRatioVariationCurve() {
		if (ratioVariationCurve != null && ratioVariationCurve.eIsProxy()) {
			InternalEObject oldRatioVariationCurve = (InternalEObject)ratioVariationCurve;
			ratioVariationCurve = (RatioVariationCurve)eResolveProxy(oldRatioVariationCurve);
			if (ratioVariationCurve != oldRatioVariationCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.RATIO_TAP_CHANGER__RATIO_VARIATION_CURVE, oldRatioVariationCurve, ratioVariationCurve));
			}
		}
		return ratioVariationCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RatioVariationCurve basicGetRatioVariationCurve() {
		return ratioVariationCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRatioVariationCurve(RatioVariationCurve newRatioVariationCurve, NotificationChain msgs) {
		RatioVariationCurve oldRatioVariationCurve = ratioVariationCurve;
		ratioVariationCurve = newRatioVariationCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.RATIO_TAP_CHANGER__RATIO_VARIATION_CURVE, oldRatioVariationCurve, newRatioVariationCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatioVariationCurve(RatioVariationCurve newRatioVariationCurve) {
		if (newRatioVariationCurve != ratioVariationCurve) {
			NotificationChain msgs = null;
			if (ratioVariationCurve != null)
				msgs = ((InternalEObject)ratioVariationCurve).eInverseRemove(this, WiresPackage.RATIO_VARIATION_CURVE__RATIO_TAP_CHANGER, RatioVariationCurve.class, msgs);
			if (newRatioVariationCurve != null)
				msgs = ((InternalEObject)newRatioVariationCurve).eInverseAdd(this, WiresPackage.RATIO_VARIATION_CURVE__RATIO_TAP_CHANGER, RatioVariationCurve.class, msgs);
			msgs = basicSetRatioVariationCurve(newRatioVariationCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.RATIO_TAP_CHANGER__RATIO_VARIATION_CURVE, newRatioVariationCurve, newRatioVariationCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerWinding getTransformerWinding() {
		if (transformerWinding != null && transformerWinding.eIsProxy()) {
			InternalEObject oldTransformerWinding = (InternalEObject)transformerWinding;
			transformerWinding = (TransformerWinding)eResolveProxy(oldTransformerWinding);
			if (transformerWinding != oldTransformerWinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.RATIO_TAP_CHANGER__TRANSFORMER_WINDING, oldTransformerWinding, transformerWinding));
			}
		}
		return transformerWinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerWinding basicGetTransformerWinding() {
		return transformerWinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerWinding(TransformerWinding newTransformerWinding, NotificationChain msgs) {
		TransformerWinding oldTransformerWinding = transformerWinding;
		transformerWinding = newTransformerWinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.RATIO_TAP_CHANGER__TRANSFORMER_WINDING, oldTransformerWinding, newTransformerWinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerWinding(TransformerWinding newTransformerWinding) {
		if (newTransformerWinding != transformerWinding) {
			NotificationChain msgs = null;
			if (transformerWinding != null)
				msgs = ((InternalEObject)transformerWinding).eInverseRemove(this, WiresPackage.TRANSFORMER_WINDING__RATIO_TAP_CHANGER, TransformerWinding.class, msgs);
			if (newTransformerWinding != null)
				msgs = ((InternalEObject)newTransformerWinding).eInverseAdd(this, WiresPackage.TRANSFORMER_WINDING__RATIO_TAP_CHANGER, TransformerWinding.class, msgs);
			msgs = basicSetTransformerWinding(newTransformerWinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.RATIO_TAP_CHANGER__TRANSFORMER_WINDING, newTransformerWinding, newTransformerWinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionTransformerWinding getWinding() {
		if (winding != null && winding.eIsProxy()) {
			InternalEObject oldWinding = (InternalEObject)winding;
			winding = (DistributionTransformerWinding)eResolveProxy(oldWinding);
			if (winding != oldWinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.RATIO_TAP_CHANGER__WINDING, oldWinding, winding));
			}
		}
		return winding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionTransformerWinding basicGetWinding() {
		return winding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWinding(DistributionTransformerWinding newWinding, NotificationChain msgs) {
		DistributionTransformerWinding oldWinding = winding;
		winding = newWinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.RATIO_TAP_CHANGER__WINDING, oldWinding, newWinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWinding(DistributionTransformerWinding newWinding) {
		if (newWinding != winding) {
			NotificationChain msgs = null;
			if (winding != null)
				msgs = ((InternalEObject)winding).eInverseRemove(this, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__RATIO_TAP_CHANGER, DistributionTransformerWinding.class, msgs);
			if (newWinding != null)
				msgs = ((InternalEObject)newWinding).eInverseAdd(this, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__RATIO_TAP_CHANGER, DistributionTransformerWinding.class, msgs);
			msgs = basicSetWinding(newWinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.RATIO_TAP_CHANGER__WINDING, newWinding, newWinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerControlMode getTculControlMode() {
		return tculControlMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTculControlMode(TransformerControlMode newTculControlMode) {
		TransformerControlMode oldTculControlMode = tculControlMode;
		tculControlMode = newTculControlMode == null ? TCUL_CONTROL_MODE_EDEFAULT : newTculControlMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.RATIO_TAP_CHANGER__TCUL_CONTROL_MODE, oldTculControlMode, tculControlMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.RATIO_TAP_CHANGER__RATIO_VARIATION_CURVE:
				if (ratioVariationCurve != null)
					msgs = ((InternalEObject)ratioVariationCurve).eInverseRemove(this, WiresPackage.RATIO_VARIATION_CURVE__RATIO_TAP_CHANGER, RatioVariationCurve.class, msgs);
				return basicSetRatioVariationCurve((RatioVariationCurve)otherEnd, msgs);
			case WiresPackage.RATIO_TAP_CHANGER__TRANSFORMER_WINDING:
				if (transformerWinding != null)
					msgs = ((InternalEObject)transformerWinding).eInverseRemove(this, WiresPackage.TRANSFORMER_WINDING__RATIO_TAP_CHANGER, TransformerWinding.class, msgs);
				return basicSetTransformerWinding((TransformerWinding)otherEnd, msgs);
			case WiresPackage.RATIO_TAP_CHANGER__WINDING:
				if (winding != null)
					msgs = ((InternalEObject)winding).eInverseRemove(this, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__RATIO_TAP_CHANGER, DistributionTransformerWinding.class, msgs);
				return basicSetWinding((DistributionTransformerWinding)otherEnd, msgs);
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
			case WiresPackage.RATIO_TAP_CHANGER__RATIO_VARIATION_CURVE:
				return basicSetRatioVariationCurve(null, msgs);
			case WiresPackage.RATIO_TAP_CHANGER__TRANSFORMER_WINDING:
				return basicSetTransformerWinding(null, msgs);
			case WiresPackage.RATIO_TAP_CHANGER__WINDING:
				return basicSetWinding(null, msgs);
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
			case WiresPackage.RATIO_TAP_CHANGER__RATIO_VARIATION_CURVE:
				if (resolve) return getRatioVariationCurve();
				return basicGetRatioVariationCurve();
			case WiresPackage.RATIO_TAP_CHANGER__TRANSFORMER_WINDING:
				if (resolve) return getTransformerWinding();
				return basicGetTransformerWinding();
			case WiresPackage.RATIO_TAP_CHANGER__WINDING:
				if (resolve) return getWinding();
				return basicGetWinding();
			case WiresPackage.RATIO_TAP_CHANGER__TCUL_CONTROL_MODE:
				return getTculControlMode();
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
			case WiresPackage.RATIO_TAP_CHANGER__RATIO_VARIATION_CURVE:
				setRatioVariationCurve((RatioVariationCurve)newValue);
				return;
			case WiresPackage.RATIO_TAP_CHANGER__TRANSFORMER_WINDING:
				setTransformerWinding((TransformerWinding)newValue);
				return;
			case WiresPackage.RATIO_TAP_CHANGER__WINDING:
				setWinding((DistributionTransformerWinding)newValue);
				return;
			case WiresPackage.RATIO_TAP_CHANGER__TCUL_CONTROL_MODE:
				setTculControlMode((TransformerControlMode)newValue);
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
			case WiresPackage.RATIO_TAP_CHANGER__RATIO_VARIATION_CURVE:
				setRatioVariationCurve((RatioVariationCurve)null);
				return;
			case WiresPackage.RATIO_TAP_CHANGER__TRANSFORMER_WINDING:
				setTransformerWinding((TransformerWinding)null);
				return;
			case WiresPackage.RATIO_TAP_CHANGER__WINDING:
				setWinding((DistributionTransformerWinding)null);
				return;
			case WiresPackage.RATIO_TAP_CHANGER__TCUL_CONTROL_MODE:
				setTculControlMode(TCUL_CONTROL_MODE_EDEFAULT);
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
			case WiresPackage.RATIO_TAP_CHANGER__RATIO_VARIATION_CURVE:
				return ratioVariationCurve != null;
			case WiresPackage.RATIO_TAP_CHANGER__TRANSFORMER_WINDING:
				return transformerWinding != null;
			case WiresPackage.RATIO_TAP_CHANGER__WINDING:
				return winding != null;
			case WiresPackage.RATIO_TAP_CHANGER__TCUL_CONTROL_MODE:
				return tculControlMode != TCUL_CONTROL_MODE_EDEFAULT;
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
		result.append(" (tculControlMode: ");
		result.append(tculControlMode);
		result.append(')');
		return result.toString();
	}

} //RatioTapChangerImpl
