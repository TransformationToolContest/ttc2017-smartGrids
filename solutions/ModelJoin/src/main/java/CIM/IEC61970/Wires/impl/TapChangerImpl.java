/**
 */
package CIM.IEC61970.Wires.impl;

import CIM.IEC61970.Core.impl.PowerSystemResourceImpl;

import CIM.IEC61970.StateVariables.StateVariablesPackage;
import CIM.IEC61970.StateVariables.SvTapStep;

import CIM.IEC61970.Wires.ImpedanceVariationCurve;
import CIM.IEC61970.Wires.RegulatingControl;
import CIM.IEC61970.Wires.TapChanger;
import CIM.IEC61970.Wires.TapSchedule;
import CIM.IEC61970.Wires.WiresPackage;

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
 * An implementation of the model object '<em><b>Tap Changer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.impl.TapChangerImpl#getInitialDelay <em>Initial Delay</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.TapChangerImpl#getSubsequentDelay <em>Subsequent Delay</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.TapChangerImpl#getTapSchedules <em>Tap Schedules</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.TapChangerImpl#isLtcFlag <em>Ltc Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.TapChangerImpl#isRegulationStatus <em>Regulation Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.TapChangerImpl#getRegulatingControl <em>Regulating Control</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.TapChangerImpl#getNeutralStep <em>Neutral Step</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.TapChangerImpl#getNeutralU <em>Neutral U</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.TapChangerImpl#getLowStep <em>Low Step</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.TapChangerImpl#getHighStep <em>High Step</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.TapChangerImpl#getStepVoltageIncrement <em>Step Voltage Increment</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.TapChangerImpl#getImpedanceVariationCurve <em>Impedance Variation Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.TapChangerImpl#getSvTapStep <em>Sv Tap Step</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.TapChangerImpl#getNormalStep <em>Normal Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TapChangerImpl extends PowerSystemResourceImpl implements TapChanger {
	/**
	 * The default value of the '{@link #getInitialDelay() <em>Initial Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialDelay()
	 * @generated
	 * @ordered
	 */
	protected static final float INITIAL_DELAY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInitialDelay() <em>Initial Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialDelay()
	 * @generated
	 * @ordered
	 */
	protected float initialDelay = INITIAL_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubsequentDelay() <em>Subsequent Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsequentDelay()
	 * @generated
	 * @ordered
	 */
	protected static final float SUBSEQUENT_DELAY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSubsequentDelay() <em>Subsequent Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsequentDelay()
	 * @generated
	 * @ordered
	 */
	protected float subsequentDelay = SUBSEQUENT_DELAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTapSchedules() <em>Tap Schedules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<TapSchedule> tapSchedules;

	/**
	 * The default value of the '{@link #isLtcFlag() <em>Ltc Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLtcFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LTC_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLtcFlag() <em>Ltc Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLtcFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean ltcFlag = LTC_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #isRegulationStatus() <em>Regulation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegulationStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REGULATION_STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRegulationStatus() <em>Regulation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegulationStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean regulationStatus = REGULATION_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRegulatingControl() <em>Regulating Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatingControl()
	 * @generated
	 * @ordered
	 */
	protected RegulatingControl regulatingControl;

	/**
	 * The default value of the '{@link #getNeutralStep() <em>Neutral Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralStep()
	 * @generated
	 * @ordered
	 */
	protected static final int NEUTRAL_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNeutralStep() <em>Neutral Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralStep()
	 * @generated
	 * @ordered
	 */
	protected int neutralStep = NEUTRAL_STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeutralU() <em>Neutral U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralU()
	 * @generated
	 * @ordered
	 */
	protected static final float NEUTRAL_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNeutralU() <em>Neutral U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralU()
	 * @generated
	 * @ordered
	 */
	protected float neutralU = NEUTRAL_U_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowStep() <em>Low Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowStep()
	 * @generated
	 * @ordered
	 */
	protected static final int LOW_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowStep() <em>Low Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowStep()
	 * @generated
	 * @ordered
	 */
	protected int lowStep = LOW_STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getHighStep() <em>High Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighStep()
	 * @generated
	 * @ordered
	 */
	protected static final int HIGH_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHighStep() <em>High Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighStep()
	 * @generated
	 * @ordered
	 */
	protected int highStep = HIGH_STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getStepVoltageIncrement() <em>Step Voltage Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepVoltageIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final float STEP_VOLTAGE_INCREMENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStepVoltageIncrement() <em>Step Voltage Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepVoltageIncrement()
	 * @generated
	 * @ordered
	 */
	protected float stepVoltageIncrement = STEP_VOLTAGE_INCREMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImpedanceVariationCurve() <em>Impedance Variation Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedanceVariationCurve()
	 * @generated
	 * @ordered
	 */
	protected ImpedanceVariationCurve impedanceVariationCurve;

	/**
	 * The cached value of the '{@link #getSvTapStep() <em>Sv Tap Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvTapStep()
	 * @generated
	 * @ordered
	 */
	protected SvTapStep svTapStep;

	/**
	 * The default value of the '{@link #getNormalStep() <em>Normal Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalStep()
	 * @generated
	 * @ordered
	 */
	protected static final int NORMAL_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNormalStep() <em>Normal Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalStep()
	 * @generated
	 * @ordered
	 */
	protected int normalStep = NORMAL_STEP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TapChangerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.TAP_CHANGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getInitialDelay() {
		return initialDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialDelay(float newInitialDelay) {
		float oldInitialDelay = initialDelay;
		initialDelay = newInitialDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__INITIAL_DELAY, oldInitialDelay, initialDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSubsequentDelay() {
		return subsequentDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubsequentDelay(float newSubsequentDelay) {
		float oldSubsequentDelay = subsequentDelay;
		subsequentDelay = newSubsequentDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__SUBSEQUENT_DELAY, oldSubsequentDelay, subsequentDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TapSchedule> getTapSchedules() {
		if (tapSchedules == null) {
			tapSchedules = new EObjectWithInverseResolvingEList<TapSchedule>(TapSchedule.class, this, WiresPackage.TAP_CHANGER__TAP_SCHEDULES, WiresPackage.TAP_SCHEDULE__TAP_CHANGER);
		}
		return tapSchedules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLtcFlag() {
		return ltcFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLtcFlag(boolean newLtcFlag) {
		boolean oldLtcFlag = ltcFlag;
		ltcFlag = newLtcFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__LTC_FLAG, oldLtcFlag, ltcFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRegulationStatus() {
		return regulationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegulationStatus(boolean newRegulationStatus) {
		boolean oldRegulationStatus = regulationStatus;
		regulationStatus = newRegulationStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__REGULATION_STATUS, oldRegulationStatus, regulationStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulatingControl getRegulatingControl() {
		if (regulatingControl != null && regulatingControl.eIsProxy()) {
			InternalEObject oldRegulatingControl = (InternalEObject)regulatingControl;
			regulatingControl = (RegulatingControl)eResolveProxy(oldRegulatingControl);
			if (regulatingControl != oldRegulatingControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.TAP_CHANGER__REGULATING_CONTROL, oldRegulatingControl, regulatingControl));
			}
		}
		return regulatingControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulatingControl basicGetRegulatingControl() {
		return regulatingControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegulatingControl(RegulatingControl newRegulatingControl, NotificationChain msgs) {
		RegulatingControl oldRegulatingControl = regulatingControl;
		regulatingControl = newRegulatingControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__REGULATING_CONTROL, oldRegulatingControl, newRegulatingControl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegulatingControl(RegulatingControl newRegulatingControl) {
		if (newRegulatingControl != regulatingControl) {
			NotificationChain msgs = null;
			if (regulatingControl != null)
				msgs = ((InternalEObject)regulatingControl).eInverseRemove(this, WiresPackage.REGULATING_CONTROL__TAP_CHANGER, RegulatingControl.class, msgs);
			if (newRegulatingControl != null)
				msgs = ((InternalEObject)newRegulatingControl).eInverseAdd(this, WiresPackage.REGULATING_CONTROL__TAP_CHANGER, RegulatingControl.class, msgs);
			msgs = basicSetRegulatingControl(newRegulatingControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__REGULATING_CONTROL, newRegulatingControl, newRegulatingControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNeutralStep() {
		return neutralStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeutralStep(int newNeutralStep) {
		int oldNeutralStep = neutralStep;
		neutralStep = newNeutralStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__NEUTRAL_STEP, oldNeutralStep, neutralStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNeutralU() {
		return neutralU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeutralU(float newNeutralU) {
		float oldNeutralU = neutralU;
		neutralU = newNeutralU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__NEUTRAL_U, oldNeutralU, neutralU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowStep() {
		return lowStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowStep(int newLowStep) {
		int oldLowStep = lowStep;
		lowStep = newLowStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__LOW_STEP, oldLowStep, lowStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHighStep() {
		return highStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighStep(int newHighStep) {
		int oldHighStep = highStep;
		highStep = newHighStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__HIGH_STEP, oldHighStep, highStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getStepVoltageIncrement() {
		return stepVoltageIncrement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepVoltageIncrement(float newStepVoltageIncrement) {
		float oldStepVoltageIncrement = stepVoltageIncrement;
		stepVoltageIncrement = newStepVoltageIncrement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__STEP_VOLTAGE_INCREMENT, oldStepVoltageIncrement, stepVoltageIncrement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpedanceVariationCurve getImpedanceVariationCurve() {
		if (impedanceVariationCurve != null && impedanceVariationCurve.eIsProxy()) {
			InternalEObject oldImpedanceVariationCurve = (InternalEObject)impedanceVariationCurve;
			impedanceVariationCurve = (ImpedanceVariationCurve)eResolveProxy(oldImpedanceVariationCurve);
			if (impedanceVariationCurve != oldImpedanceVariationCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.TAP_CHANGER__IMPEDANCE_VARIATION_CURVE, oldImpedanceVariationCurve, impedanceVariationCurve));
			}
		}
		return impedanceVariationCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpedanceVariationCurve basicGetImpedanceVariationCurve() {
		return impedanceVariationCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImpedanceVariationCurve(ImpedanceVariationCurve newImpedanceVariationCurve, NotificationChain msgs) {
		ImpedanceVariationCurve oldImpedanceVariationCurve = impedanceVariationCurve;
		impedanceVariationCurve = newImpedanceVariationCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__IMPEDANCE_VARIATION_CURVE, oldImpedanceVariationCurve, newImpedanceVariationCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpedanceVariationCurve(ImpedanceVariationCurve newImpedanceVariationCurve) {
		if (newImpedanceVariationCurve != impedanceVariationCurve) {
			NotificationChain msgs = null;
			if (impedanceVariationCurve != null)
				msgs = ((InternalEObject)impedanceVariationCurve).eInverseRemove(this, WiresPackage.IMPEDANCE_VARIATION_CURVE__TAP_CHANGER, ImpedanceVariationCurve.class, msgs);
			if (newImpedanceVariationCurve != null)
				msgs = ((InternalEObject)newImpedanceVariationCurve).eInverseAdd(this, WiresPackage.IMPEDANCE_VARIATION_CURVE__TAP_CHANGER, ImpedanceVariationCurve.class, msgs);
			msgs = basicSetImpedanceVariationCurve(newImpedanceVariationCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__IMPEDANCE_VARIATION_CURVE, newImpedanceVariationCurve, newImpedanceVariationCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvTapStep getSvTapStep() {
		if (svTapStep != null && svTapStep.eIsProxy()) {
			InternalEObject oldSvTapStep = (InternalEObject)svTapStep;
			svTapStep = (SvTapStep)eResolveProxy(oldSvTapStep);
			if (svTapStep != oldSvTapStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.TAP_CHANGER__SV_TAP_STEP, oldSvTapStep, svTapStep));
			}
		}
		return svTapStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvTapStep basicGetSvTapStep() {
		return svTapStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSvTapStep(SvTapStep newSvTapStep, NotificationChain msgs) {
		SvTapStep oldSvTapStep = svTapStep;
		svTapStep = newSvTapStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__SV_TAP_STEP, oldSvTapStep, newSvTapStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSvTapStep(SvTapStep newSvTapStep) {
		if (newSvTapStep != svTapStep) {
			NotificationChain msgs = null;
			if (svTapStep != null)
				msgs = ((InternalEObject)svTapStep).eInverseRemove(this, StateVariablesPackage.SV_TAP_STEP__TAP_CHANGER, SvTapStep.class, msgs);
			if (newSvTapStep != null)
				msgs = ((InternalEObject)newSvTapStep).eInverseAdd(this, StateVariablesPackage.SV_TAP_STEP__TAP_CHANGER, SvTapStep.class, msgs);
			msgs = basicSetSvTapStep(newSvTapStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__SV_TAP_STEP, newSvTapStep, newSvTapStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNormalStep() {
		return normalStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalStep(int newNormalStep) {
		int oldNormalStep = normalStep;
		normalStep = newNormalStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__NORMAL_STEP, oldNormalStep, normalStep));
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
			case WiresPackage.TAP_CHANGER__TAP_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTapSchedules()).basicAdd(otherEnd, msgs);
			case WiresPackage.TAP_CHANGER__REGULATING_CONTROL:
				if (regulatingControl != null)
					msgs = ((InternalEObject)regulatingControl).eInverseRemove(this, WiresPackage.REGULATING_CONTROL__TAP_CHANGER, RegulatingControl.class, msgs);
				return basicSetRegulatingControl((RegulatingControl)otherEnd, msgs);
			case WiresPackage.TAP_CHANGER__IMPEDANCE_VARIATION_CURVE:
				if (impedanceVariationCurve != null)
					msgs = ((InternalEObject)impedanceVariationCurve).eInverseRemove(this, WiresPackage.IMPEDANCE_VARIATION_CURVE__TAP_CHANGER, ImpedanceVariationCurve.class, msgs);
				return basicSetImpedanceVariationCurve((ImpedanceVariationCurve)otherEnd, msgs);
			case WiresPackage.TAP_CHANGER__SV_TAP_STEP:
				if (svTapStep != null)
					msgs = ((InternalEObject)svTapStep).eInverseRemove(this, StateVariablesPackage.SV_TAP_STEP__TAP_CHANGER, SvTapStep.class, msgs);
				return basicSetSvTapStep((SvTapStep)otherEnd, msgs);
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
			case WiresPackage.TAP_CHANGER__TAP_SCHEDULES:
				return ((InternalEList<?>)getTapSchedules()).basicRemove(otherEnd, msgs);
			case WiresPackage.TAP_CHANGER__REGULATING_CONTROL:
				return basicSetRegulatingControl(null, msgs);
			case WiresPackage.TAP_CHANGER__IMPEDANCE_VARIATION_CURVE:
				return basicSetImpedanceVariationCurve(null, msgs);
			case WiresPackage.TAP_CHANGER__SV_TAP_STEP:
				return basicSetSvTapStep(null, msgs);
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
			case WiresPackage.TAP_CHANGER__INITIAL_DELAY:
				return getInitialDelay();
			case WiresPackage.TAP_CHANGER__SUBSEQUENT_DELAY:
				return getSubsequentDelay();
			case WiresPackage.TAP_CHANGER__TAP_SCHEDULES:
				return getTapSchedules();
			case WiresPackage.TAP_CHANGER__LTC_FLAG:
				return isLtcFlag();
			case WiresPackage.TAP_CHANGER__REGULATION_STATUS:
				return isRegulationStatus();
			case WiresPackage.TAP_CHANGER__REGULATING_CONTROL:
				if (resolve) return getRegulatingControl();
				return basicGetRegulatingControl();
			case WiresPackage.TAP_CHANGER__NEUTRAL_STEP:
				return getNeutralStep();
			case WiresPackage.TAP_CHANGER__NEUTRAL_U:
				return getNeutralU();
			case WiresPackage.TAP_CHANGER__LOW_STEP:
				return getLowStep();
			case WiresPackage.TAP_CHANGER__HIGH_STEP:
				return getHighStep();
			case WiresPackage.TAP_CHANGER__STEP_VOLTAGE_INCREMENT:
				return getStepVoltageIncrement();
			case WiresPackage.TAP_CHANGER__IMPEDANCE_VARIATION_CURVE:
				if (resolve) return getImpedanceVariationCurve();
				return basicGetImpedanceVariationCurve();
			case WiresPackage.TAP_CHANGER__SV_TAP_STEP:
				if (resolve) return getSvTapStep();
				return basicGetSvTapStep();
			case WiresPackage.TAP_CHANGER__NORMAL_STEP:
				return getNormalStep();
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
			case WiresPackage.TAP_CHANGER__INITIAL_DELAY:
				setInitialDelay((Float)newValue);
				return;
			case WiresPackage.TAP_CHANGER__SUBSEQUENT_DELAY:
				setSubsequentDelay((Float)newValue);
				return;
			case WiresPackage.TAP_CHANGER__TAP_SCHEDULES:
				getTapSchedules().clear();
				getTapSchedules().addAll((Collection<? extends TapSchedule>)newValue);
				return;
			case WiresPackage.TAP_CHANGER__LTC_FLAG:
				setLtcFlag((Boolean)newValue);
				return;
			case WiresPackage.TAP_CHANGER__REGULATION_STATUS:
				setRegulationStatus((Boolean)newValue);
				return;
			case WiresPackage.TAP_CHANGER__REGULATING_CONTROL:
				setRegulatingControl((RegulatingControl)newValue);
				return;
			case WiresPackage.TAP_CHANGER__NEUTRAL_STEP:
				setNeutralStep((Integer)newValue);
				return;
			case WiresPackage.TAP_CHANGER__NEUTRAL_U:
				setNeutralU((Float)newValue);
				return;
			case WiresPackage.TAP_CHANGER__LOW_STEP:
				setLowStep((Integer)newValue);
				return;
			case WiresPackage.TAP_CHANGER__HIGH_STEP:
				setHighStep((Integer)newValue);
				return;
			case WiresPackage.TAP_CHANGER__STEP_VOLTAGE_INCREMENT:
				setStepVoltageIncrement((Float)newValue);
				return;
			case WiresPackage.TAP_CHANGER__IMPEDANCE_VARIATION_CURVE:
				setImpedanceVariationCurve((ImpedanceVariationCurve)newValue);
				return;
			case WiresPackage.TAP_CHANGER__SV_TAP_STEP:
				setSvTapStep((SvTapStep)newValue);
				return;
			case WiresPackage.TAP_CHANGER__NORMAL_STEP:
				setNormalStep((Integer)newValue);
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
			case WiresPackage.TAP_CHANGER__INITIAL_DELAY:
				setInitialDelay(INITIAL_DELAY_EDEFAULT);
				return;
			case WiresPackage.TAP_CHANGER__SUBSEQUENT_DELAY:
				setSubsequentDelay(SUBSEQUENT_DELAY_EDEFAULT);
				return;
			case WiresPackage.TAP_CHANGER__TAP_SCHEDULES:
				getTapSchedules().clear();
				return;
			case WiresPackage.TAP_CHANGER__LTC_FLAG:
				setLtcFlag(LTC_FLAG_EDEFAULT);
				return;
			case WiresPackage.TAP_CHANGER__REGULATION_STATUS:
				setRegulationStatus(REGULATION_STATUS_EDEFAULT);
				return;
			case WiresPackage.TAP_CHANGER__REGULATING_CONTROL:
				setRegulatingControl((RegulatingControl)null);
				return;
			case WiresPackage.TAP_CHANGER__NEUTRAL_STEP:
				setNeutralStep(NEUTRAL_STEP_EDEFAULT);
				return;
			case WiresPackage.TAP_CHANGER__NEUTRAL_U:
				setNeutralU(NEUTRAL_U_EDEFAULT);
				return;
			case WiresPackage.TAP_CHANGER__LOW_STEP:
				setLowStep(LOW_STEP_EDEFAULT);
				return;
			case WiresPackage.TAP_CHANGER__HIGH_STEP:
				setHighStep(HIGH_STEP_EDEFAULT);
				return;
			case WiresPackage.TAP_CHANGER__STEP_VOLTAGE_INCREMENT:
				setStepVoltageIncrement(STEP_VOLTAGE_INCREMENT_EDEFAULT);
				return;
			case WiresPackage.TAP_CHANGER__IMPEDANCE_VARIATION_CURVE:
				setImpedanceVariationCurve((ImpedanceVariationCurve)null);
				return;
			case WiresPackage.TAP_CHANGER__SV_TAP_STEP:
				setSvTapStep((SvTapStep)null);
				return;
			case WiresPackage.TAP_CHANGER__NORMAL_STEP:
				setNormalStep(NORMAL_STEP_EDEFAULT);
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
			case WiresPackage.TAP_CHANGER__INITIAL_DELAY:
				return initialDelay != INITIAL_DELAY_EDEFAULT;
			case WiresPackage.TAP_CHANGER__SUBSEQUENT_DELAY:
				return subsequentDelay != SUBSEQUENT_DELAY_EDEFAULT;
			case WiresPackage.TAP_CHANGER__TAP_SCHEDULES:
				return tapSchedules != null && !tapSchedules.isEmpty();
			case WiresPackage.TAP_CHANGER__LTC_FLAG:
				return ltcFlag != LTC_FLAG_EDEFAULT;
			case WiresPackage.TAP_CHANGER__REGULATION_STATUS:
				return regulationStatus != REGULATION_STATUS_EDEFAULT;
			case WiresPackage.TAP_CHANGER__REGULATING_CONTROL:
				return regulatingControl != null;
			case WiresPackage.TAP_CHANGER__NEUTRAL_STEP:
				return neutralStep != NEUTRAL_STEP_EDEFAULT;
			case WiresPackage.TAP_CHANGER__NEUTRAL_U:
				return neutralU != NEUTRAL_U_EDEFAULT;
			case WiresPackage.TAP_CHANGER__LOW_STEP:
				return lowStep != LOW_STEP_EDEFAULT;
			case WiresPackage.TAP_CHANGER__HIGH_STEP:
				return highStep != HIGH_STEP_EDEFAULT;
			case WiresPackage.TAP_CHANGER__STEP_VOLTAGE_INCREMENT:
				return stepVoltageIncrement != STEP_VOLTAGE_INCREMENT_EDEFAULT;
			case WiresPackage.TAP_CHANGER__IMPEDANCE_VARIATION_CURVE:
				return impedanceVariationCurve != null;
			case WiresPackage.TAP_CHANGER__SV_TAP_STEP:
				return svTapStep != null;
			case WiresPackage.TAP_CHANGER__NORMAL_STEP:
				return normalStep != NORMAL_STEP_EDEFAULT;
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
		result.append(" (initialDelay: ");
		result.append(initialDelay);
		result.append(", subsequentDelay: ");
		result.append(subsequentDelay);
		result.append(", ltcFlag: ");
		result.append(ltcFlag);
		result.append(", regulationStatus: ");
		result.append(regulationStatus);
		result.append(", neutralStep: ");
		result.append(neutralStep);
		result.append(", neutralU: ");
		result.append(neutralU);
		result.append(", lowStep: ");
		result.append(lowStep);
		result.append(", highStep: ");
		result.append(highStep);
		result.append(", stepVoltageIncrement: ");
		result.append(stepVoltageIncrement);
		result.append(", normalStep: ");
		result.append(normalStep);
		result.append(')');
		return result.toString();
	}

} //TapChangerImpl
