/**
 */
package CIM.IEC61970.Wires.impl;

import CIM.IEC61968.WiresExt.DistributionTransformerWinding;
import CIM.IEC61968.WiresExt.WiresExtPackage;

import CIM.IEC61970.Wires.PhaseTapChanger;
import CIM.IEC61970.Wires.PhaseTapChangerKind;
import CIM.IEC61970.Wires.PhaseVariationCurve;
import CIM.IEC61970.Wires.TransformerWinding;
import CIM.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phase Tap Changer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.impl.PhaseTapChangerImpl#getTransformerWinding <em>Transformer Winding</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.PhaseTapChangerImpl#getWindingConnectionAngle <em>Winding Connection Angle</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.PhaseTapChangerImpl#getWinding <em>Winding</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.PhaseTapChangerImpl#getPhaseTapChangerType <em>Phase Tap Changer Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.PhaseTapChangerImpl#getStepPhaseShiftIncrement <em>Step Phase Shift Increment</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.PhaseTapChangerImpl#getPhaseVariationCurve <em>Phase Variation Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.PhaseTapChangerImpl#getVoltageStepIncrementOutOfPhase <em>Voltage Step Increment Out Of Phase</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.PhaseTapChangerImpl#getNominalVoltageOutOfPhase <em>Nominal Voltage Out Of Phase</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.PhaseTapChangerImpl#getXStepMax <em>XStep Max</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.PhaseTapChangerImpl#getXStepMin <em>XStep Min</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhaseTapChangerImpl extends TapChangerImpl implements PhaseTapChanger {
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
	 * The default value of the '{@link #getWindingConnectionAngle() <em>Winding Connection Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindingConnectionAngle()
	 * @generated
	 * @ordered
	 */
	protected static final float WINDING_CONNECTION_ANGLE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWindingConnectionAngle() <em>Winding Connection Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindingConnectionAngle()
	 * @generated
	 * @ordered
	 */
	protected float windingConnectionAngle = WINDING_CONNECTION_ANGLE_EDEFAULT;

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
	 * The default value of the '{@link #getPhaseTapChangerType() <em>Phase Tap Changer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseTapChangerType()
	 * @generated
	 * @ordered
	 */
	protected static final PhaseTapChangerKind PHASE_TAP_CHANGER_TYPE_EDEFAULT = PhaseTapChangerKind.ASYMMETRICAL;

	/**
	 * The cached value of the '{@link #getPhaseTapChangerType() <em>Phase Tap Changer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseTapChangerType()
	 * @generated
	 * @ordered
	 */
	protected PhaseTapChangerKind phaseTapChangerType = PHASE_TAP_CHANGER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStepPhaseShiftIncrement() <em>Step Phase Shift Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepPhaseShiftIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final float STEP_PHASE_SHIFT_INCREMENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStepPhaseShiftIncrement() <em>Step Phase Shift Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepPhaseShiftIncrement()
	 * @generated
	 * @ordered
	 */
	protected float stepPhaseShiftIncrement = STEP_PHASE_SHIFT_INCREMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPhaseVariationCurve() <em>Phase Variation Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseVariationCurve()
	 * @generated
	 * @ordered
	 */
	protected PhaseVariationCurve phaseVariationCurve;

	/**
	 * The default value of the '{@link #getVoltageStepIncrementOutOfPhase() <em>Voltage Step Increment Out Of Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageStepIncrementOutOfPhase()
	 * @generated
	 * @ordered
	 */
	protected static final float VOLTAGE_STEP_INCREMENT_OUT_OF_PHASE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVoltageStepIncrementOutOfPhase() <em>Voltage Step Increment Out Of Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageStepIncrementOutOfPhase()
	 * @generated
	 * @ordered
	 */
	protected float voltageStepIncrementOutOfPhase = VOLTAGE_STEP_INCREMENT_OUT_OF_PHASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNominalVoltageOutOfPhase() <em>Nominal Voltage Out Of Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalVoltageOutOfPhase()
	 * @generated
	 * @ordered
	 */
	protected static final float NOMINAL_VOLTAGE_OUT_OF_PHASE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNominalVoltageOutOfPhase() <em>Nominal Voltage Out Of Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalVoltageOutOfPhase()
	 * @generated
	 * @ordered
	 */
	protected float nominalVoltageOutOfPhase = NOMINAL_VOLTAGE_OUT_OF_PHASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXStepMax() <em>XStep Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXStepMax()
	 * @generated
	 * @ordered
	 */
	protected static final float XSTEP_MAX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXStepMax() <em>XStep Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXStepMax()
	 * @generated
	 * @ordered
	 */
	protected float xStepMax = XSTEP_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getXStepMin() <em>XStep Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXStepMin()
	 * @generated
	 * @ordered
	 */
	protected static final float XSTEP_MIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXStepMin() <em>XStep Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXStepMin()
	 * @generated
	 * @ordered
	 */
	protected float xStepMin = XSTEP_MIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhaseTapChangerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.PHASE_TAP_CHANGER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.PHASE_TAP_CHANGER__TRANSFORMER_WINDING, oldTransformerWinding, transformerWinding));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.PHASE_TAP_CHANGER__TRANSFORMER_WINDING, oldTransformerWinding, newTransformerWinding);
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
				msgs = ((InternalEObject)transformerWinding).eInverseRemove(this, WiresPackage.TRANSFORMER_WINDING__PHASE_TAP_CHANGER, TransformerWinding.class, msgs);
			if (newTransformerWinding != null)
				msgs = ((InternalEObject)newTransformerWinding).eInverseAdd(this, WiresPackage.TRANSFORMER_WINDING__PHASE_TAP_CHANGER, TransformerWinding.class, msgs);
			msgs = basicSetTransformerWinding(newTransformerWinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.PHASE_TAP_CHANGER__TRANSFORMER_WINDING, newTransformerWinding, newTransformerWinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWindingConnectionAngle() {
		return windingConnectionAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindingConnectionAngle(float newWindingConnectionAngle) {
		float oldWindingConnectionAngle = windingConnectionAngle;
		windingConnectionAngle = newWindingConnectionAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.PHASE_TAP_CHANGER__WINDING_CONNECTION_ANGLE, oldWindingConnectionAngle, windingConnectionAngle));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.PHASE_TAP_CHANGER__WINDING, oldWinding, winding));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.PHASE_TAP_CHANGER__WINDING, oldWinding, newWinding);
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
				msgs = ((InternalEObject)winding).eInverseRemove(this, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__PHASE_TAP_CHANGER, DistributionTransformerWinding.class, msgs);
			if (newWinding != null)
				msgs = ((InternalEObject)newWinding).eInverseAdd(this, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__PHASE_TAP_CHANGER, DistributionTransformerWinding.class, msgs);
			msgs = basicSetWinding(newWinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.PHASE_TAP_CHANGER__WINDING, newWinding, newWinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseTapChangerKind getPhaseTapChangerType() {
		return phaseTapChangerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseTapChangerType(PhaseTapChangerKind newPhaseTapChangerType) {
		PhaseTapChangerKind oldPhaseTapChangerType = phaseTapChangerType;
		phaseTapChangerType = newPhaseTapChangerType == null ? PHASE_TAP_CHANGER_TYPE_EDEFAULT : newPhaseTapChangerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.PHASE_TAP_CHANGER__PHASE_TAP_CHANGER_TYPE, oldPhaseTapChangerType, phaseTapChangerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getStepPhaseShiftIncrement() {
		return stepPhaseShiftIncrement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepPhaseShiftIncrement(float newStepPhaseShiftIncrement) {
		float oldStepPhaseShiftIncrement = stepPhaseShiftIncrement;
		stepPhaseShiftIncrement = newStepPhaseShiftIncrement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.PHASE_TAP_CHANGER__STEP_PHASE_SHIFT_INCREMENT, oldStepPhaseShiftIncrement, stepPhaseShiftIncrement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseVariationCurve getPhaseVariationCurve() {
		if (phaseVariationCurve != null && phaseVariationCurve.eIsProxy()) {
			InternalEObject oldPhaseVariationCurve = (InternalEObject)phaseVariationCurve;
			phaseVariationCurve = (PhaseVariationCurve)eResolveProxy(oldPhaseVariationCurve);
			if (phaseVariationCurve != oldPhaseVariationCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.PHASE_TAP_CHANGER__PHASE_VARIATION_CURVE, oldPhaseVariationCurve, phaseVariationCurve));
			}
		}
		return phaseVariationCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseVariationCurve basicGetPhaseVariationCurve() {
		return phaseVariationCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhaseVariationCurve(PhaseVariationCurve newPhaseVariationCurve, NotificationChain msgs) {
		PhaseVariationCurve oldPhaseVariationCurve = phaseVariationCurve;
		phaseVariationCurve = newPhaseVariationCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.PHASE_TAP_CHANGER__PHASE_VARIATION_CURVE, oldPhaseVariationCurve, newPhaseVariationCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseVariationCurve(PhaseVariationCurve newPhaseVariationCurve) {
		if (newPhaseVariationCurve != phaseVariationCurve) {
			NotificationChain msgs = null;
			if (phaseVariationCurve != null)
				msgs = ((InternalEObject)phaseVariationCurve).eInverseRemove(this, WiresPackage.PHASE_VARIATION_CURVE__PHASE_TAP_CHANGER, PhaseVariationCurve.class, msgs);
			if (newPhaseVariationCurve != null)
				msgs = ((InternalEObject)newPhaseVariationCurve).eInverseAdd(this, WiresPackage.PHASE_VARIATION_CURVE__PHASE_TAP_CHANGER, PhaseVariationCurve.class, msgs);
			msgs = basicSetPhaseVariationCurve(newPhaseVariationCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.PHASE_TAP_CHANGER__PHASE_VARIATION_CURVE, newPhaseVariationCurve, newPhaseVariationCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVoltageStepIncrementOutOfPhase() {
		return voltageStepIncrementOutOfPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageStepIncrementOutOfPhase(float newVoltageStepIncrementOutOfPhase) {
		float oldVoltageStepIncrementOutOfPhase = voltageStepIncrementOutOfPhase;
		voltageStepIncrementOutOfPhase = newVoltageStepIncrementOutOfPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.PHASE_TAP_CHANGER__VOLTAGE_STEP_INCREMENT_OUT_OF_PHASE, oldVoltageStepIncrementOutOfPhase, voltageStepIncrementOutOfPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNominalVoltageOutOfPhase() {
		return nominalVoltageOutOfPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalVoltageOutOfPhase(float newNominalVoltageOutOfPhase) {
		float oldNominalVoltageOutOfPhase = nominalVoltageOutOfPhase;
		nominalVoltageOutOfPhase = newNominalVoltageOutOfPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.PHASE_TAP_CHANGER__NOMINAL_VOLTAGE_OUT_OF_PHASE, oldNominalVoltageOutOfPhase, nominalVoltageOutOfPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXStepMax() {
		return xStepMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXStepMax(float newXStepMax) {
		float oldXStepMax = xStepMax;
		xStepMax = newXStepMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.PHASE_TAP_CHANGER__XSTEP_MAX, oldXStepMax, xStepMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXStepMin() {
		return xStepMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXStepMin(float newXStepMin) {
		float oldXStepMin = xStepMin;
		xStepMin = newXStepMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.PHASE_TAP_CHANGER__XSTEP_MIN, oldXStepMin, xStepMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.PHASE_TAP_CHANGER__TRANSFORMER_WINDING:
				if (transformerWinding != null)
					msgs = ((InternalEObject)transformerWinding).eInverseRemove(this, WiresPackage.TRANSFORMER_WINDING__PHASE_TAP_CHANGER, TransformerWinding.class, msgs);
				return basicSetTransformerWinding((TransformerWinding)otherEnd, msgs);
			case WiresPackage.PHASE_TAP_CHANGER__WINDING:
				if (winding != null)
					msgs = ((InternalEObject)winding).eInverseRemove(this, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__PHASE_TAP_CHANGER, DistributionTransformerWinding.class, msgs);
				return basicSetWinding((DistributionTransformerWinding)otherEnd, msgs);
			case WiresPackage.PHASE_TAP_CHANGER__PHASE_VARIATION_CURVE:
				if (phaseVariationCurve != null)
					msgs = ((InternalEObject)phaseVariationCurve).eInverseRemove(this, WiresPackage.PHASE_VARIATION_CURVE__PHASE_TAP_CHANGER, PhaseVariationCurve.class, msgs);
				return basicSetPhaseVariationCurve((PhaseVariationCurve)otherEnd, msgs);
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
			case WiresPackage.PHASE_TAP_CHANGER__TRANSFORMER_WINDING:
				return basicSetTransformerWinding(null, msgs);
			case WiresPackage.PHASE_TAP_CHANGER__WINDING:
				return basicSetWinding(null, msgs);
			case WiresPackage.PHASE_TAP_CHANGER__PHASE_VARIATION_CURVE:
				return basicSetPhaseVariationCurve(null, msgs);
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
			case WiresPackage.PHASE_TAP_CHANGER__TRANSFORMER_WINDING:
				if (resolve) return getTransformerWinding();
				return basicGetTransformerWinding();
			case WiresPackage.PHASE_TAP_CHANGER__WINDING_CONNECTION_ANGLE:
				return getWindingConnectionAngle();
			case WiresPackage.PHASE_TAP_CHANGER__WINDING:
				if (resolve) return getWinding();
				return basicGetWinding();
			case WiresPackage.PHASE_TAP_CHANGER__PHASE_TAP_CHANGER_TYPE:
				return getPhaseTapChangerType();
			case WiresPackage.PHASE_TAP_CHANGER__STEP_PHASE_SHIFT_INCREMENT:
				return getStepPhaseShiftIncrement();
			case WiresPackage.PHASE_TAP_CHANGER__PHASE_VARIATION_CURVE:
				if (resolve) return getPhaseVariationCurve();
				return basicGetPhaseVariationCurve();
			case WiresPackage.PHASE_TAP_CHANGER__VOLTAGE_STEP_INCREMENT_OUT_OF_PHASE:
				return getVoltageStepIncrementOutOfPhase();
			case WiresPackage.PHASE_TAP_CHANGER__NOMINAL_VOLTAGE_OUT_OF_PHASE:
				return getNominalVoltageOutOfPhase();
			case WiresPackage.PHASE_TAP_CHANGER__XSTEP_MAX:
				return getXStepMax();
			case WiresPackage.PHASE_TAP_CHANGER__XSTEP_MIN:
				return getXStepMin();
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
			case WiresPackage.PHASE_TAP_CHANGER__TRANSFORMER_WINDING:
				setTransformerWinding((TransformerWinding)newValue);
				return;
			case WiresPackage.PHASE_TAP_CHANGER__WINDING_CONNECTION_ANGLE:
				setWindingConnectionAngle((Float)newValue);
				return;
			case WiresPackage.PHASE_TAP_CHANGER__WINDING:
				setWinding((DistributionTransformerWinding)newValue);
				return;
			case WiresPackage.PHASE_TAP_CHANGER__PHASE_TAP_CHANGER_TYPE:
				setPhaseTapChangerType((PhaseTapChangerKind)newValue);
				return;
			case WiresPackage.PHASE_TAP_CHANGER__STEP_PHASE_SHIFT_INCREMENT:
				setStepPhaseShiftIncrement((Float)newValue);
				return;
			case WiresPackage.PHASE_TAP_CHANGER__PHASE_VARIATION_CURVE:
				setPhaseVariationCurve((PhaseVariationCurve)newValue);
				return;
			case WiresPackage.PHASE_TAP_CHANGER__VOLTAGE_STEP_INCREMENT_OUT_OF_PHASE:
				setVoltageStepIncrementOutOfPhase((Float)newValue);
				return;
			case WiresPackage.PHASE_TAP_CHANGER__NOMINAL_VOLTAGE_OUT_OF_PHASE:
				setNominalVoltageOutOfPhase((Float)newValue);
				return;
			case WiresPackage.PHASE_TAP_CHANGER__XSTEP_MAX:
				setXStepMax((Float)newValue);
				return;
			case WiresPackage.PHASE_TAP_CHANGER__XSTEP_MIN:
				setXStepMin((Float)newValue);
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
			case WiresPackage.PHASE_TAP_CHANGER__TRANSFORMER_WINDING:
				setTransformerWinding((TransformerWinding)null);
				return;
			case WiresPackage.PHASE_TAP_CHANGER__WINDING_CONNECTION_ANGLE:
				setWindingConnectionAngle(WINDING_CONNECTION_ANGLE_EDEFAULT);
				return;
			case WiresPackage.PHASE_TAP_CHANGER__WINDING:
				setWinding((DistributionTransformerWinding)null);
				return;
			case WiresPackage.PHASE_TAP_CHANGER__PHASE_TAP_CHANGER_TYPE:
				setPhaseTapChangerType(PHASE_TAP_CHANGER_TYPE_EDEFAULT);
				return;
			case WiresPackage.PHASE_TAP_CHANGER__STEP_PHASE_SHIFT_INCREMENT:
				setStepPhaseShiftIncrement(STEP_PHASE_SHIFT_INCREMENT_EDEFAULT);
				return;
			case WiresPackage.PHASE_TAP_CHANGER__PHASE_VARIATION_CURVE:
				setPhaseVariationCurve((PhaseVariationCurve)null);
				return;
			case WiresPackage.PHASE_TAP_CHANGER__VOLTAGE_STEP_INCREMENT_OUT_OF_PHASE:
				setVoltageStepIncrementOutOfPhase(VOLTAGE_STEP_INCREMENT_OUT_OF_PHASE_EDEFAULT);
				return;
			case WiresPackage.PHASE_TAP_CHANGER__NOMINAL_VOLTAGE_OUT_OF_PHASE:
				setNominalVoltageOutOfPhase(NOMINAL_VOLTAGE_OUT_OF_PHASE_EDEFAULT);
				return;
			case WiresPackage.PHASE_TAP_CHANGER__XSTEP_MAX:
				setXStepMax(XSTEP_MAX_EDEFAULT);
				return;
			case WiresPackage.PHASE_TAP_CHANGER__XSTEP_MIN:
				setXStepMin(XSTEP_MIN_EDEFAULT);
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
			case WiresPackage.PHASE_TAP_CHANGER__TRANSFORMER_WINDING:
				return transformerWinding != null;
			case WiresPackage.PHASE_TAP_CHANGER__WINDING_CONNECTION_ANGLE:
				return windingConnectionAngle != WINDING_CONNECTION_ANGLE_EDEFAULT;
			case WiresPackage.PHASE_TAP_CHANGER__WINDING:
				return winding != null;
			case WiresPackage.PHASE_TAP_CHANGER__PHASE_TAP_CHANGER_TYPE:
				return phaseTapChangerType != PHASE_TAP_CHANGER_TYPE_EDEFAULT;
			case WiresPackage.PHASE_TAP_CHANGER__STEP_PHASE_SHIFT_INCREMENT:
				return stepPhaseShiftIncrement != STEP_PHASE_SHIFT_INCREMENT_EDEFAULT;
			case WiresPackage.PHASE_TAP_CHANGER__PHASE_VARIATION_CURVE:
				return phaseVariationCurve != null;
			case WiresPackage.PHASE_TAP_CHANGER__VOLTAGE_STEP_INCREMENT_OUT_OF_PHASE:
				return voltageStepIncrementOutOfPhase != VOLTAGE_STEP_INCREMENT_OUT_OF_PHASE_EDEFAULT;
			case WiresPackage.PHASE_TAP_CHANGER__NOMINAL_VOLTAGE_OUT_OF_PHASE:
				return nominalVoltageOutOfPhase != NOMINAL_VOLTAGE_OUT_OF_PHASE_EDEFAULT;
			case WiresPackage.PHASE_TAP_CHANGER__XSTEP_MAX:
				return xStepMax != XSTEP_MAX_EDEFAULT;
			case WiresPackage.PHASE_TAP_CHANGER__XSTEP_MIN:
				return xStepMin != XSTEP_MIN_EDEFAULT;
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
		result.append(" (windingConnectionAngle: ");
		result.append(windingConnectionAngle);
		result.append(", phaseTapChangerType: ");
		result.append(phaseTapChangerType);
		result.append(", stepPhaseShiftIncrement: ");
		result.append(stepPhaseShiftIncrement);
		result.append(", voltageStepIncrementOutOfPhase: ");
		result.append(voltageStepIncrementOutOfPhase);
		result.append(", nominalVoltageOutOfPhase: ");
		result.append(nominalVoltageOutOfPhase);
		result.append(", xStepMax: ");
		result.append(xStepMax);
		result.append(", xStepMin: ");
		result.append(xStepMin);
		result.append(')');
		return result.toString();
	}

} //PhaseTapChangerImpl
