/**
 */
package gluemodel.CIM.IEC61970.Wires.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Wires.TransformerWinding;
import gluemodel.CIM.IEC61970.Wires.WindingTest;
import gluemodel.CIM.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Winding Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.WindingTestImpl#getFromTapStep <em>From Tap Step</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.WindingTestImpl#getFrom_TransformerWinding <em>From Transformer Winding</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.WindingTestImpl#getLeakageImpedance <em>Leakage Impedance</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.WindingTestImpl#getNoLoadLoss <em>No Load Loss</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.WindingTestImpl#getPhaseShift <em>Phase Shift</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.WindingTestImpl#getTo_TransformerWinding <em>To Transformer Winding</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.WindingTestImpl#getLoadLoss <em>Load Loss</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.WindingTestImpl#getToTapStep <em>To Tap Step</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.WindingTestImpl#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.WindingTestImpl#getExcitingCurrent <em>Exciting Current</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindingTestImpl extends IdentifiedObjectImpl implements WindingTest {
	/**
	 * The default value of the '{@link #getFromTapStep() <em>From Tap Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTapStep()
	 * @generated
	 * @ordered
	 */
	protected static final int FROM_TAP_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFromTapStep() <em>From Tap Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTapStep()
	 * @generated
	 * @ordered
	 */
	protected int fromTapStep = FROM_TAP_STEP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFrom_TransformerWinding() <em>From Transformer Winding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom_TransformerWinding()
	 * @generated
	 * @ordered
	 */
	protected TransformerWinding from_TransformerWinding;

	/**
	 * The default value of the '{@link #getLeakageImpedance() <em>Leakage Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeakageImpedance()
	 * @generated
	 * @ordered
	 */
	protected static final float LEAKAGE_IMPEDANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLeakageImpedance() <em>Leakage Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeakageImpedance()
	 * @generated
	 * @ordered
	 */
	protected float leakageImpedance = LEAKAGE_IMPEDANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoLoadLoss() <em>No Load Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoLoadLoss()
	 * @generated
	 * @ordered
	 */
	protected static final float NO_LOAD_LOSS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNoLoadLoss() <em>No Load Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoLoadLoss()
	 * @generated
	 * @ordered
	 */
	protected float noLoadLoss = NO_LOAD_LOSS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhaseShift() <em>Phase Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseShift()
	 * @generated
	 * @ordered
	 */
	protected static final float PHASE_SHIFT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPhaseShift() <em>Phase Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseShift()
	 * @generated
	 * @ordered
	 */
	protected float phaseShift = PHASE_SHIFT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTo_TransformerWinding() <em>To Transformer Winding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo_TransformerWinding()
	 * @generated
	 * @ordered
	 */
	protected TransformerWinding to_TransformerWinding;

	/**
	 * The default value of the '{@link #getLoadLoss() <em>Load Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadLoss()
	 * @generated
	 * @ordered
	 */
	protected static final float LOAD_LOSS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLoadLoss() <em>Load Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadLoss()
	 * @generated
	 * @ordered
	 */
	protected float loadLoss = LOAD_LOSS_EDEFAULT;

	/**
	 * The default value of the '{@link #getToTapStep() <em>To Tap Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTapStep()
	 * @generated
	 * @ordered
	 */
	protected static final int TO_TAP_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getToTapStep() <em>To Tap Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTapStep()
	 * @generated
	 * @ordered
	 */
	protected int toTapStep = TO_TAP_STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected float voltage = VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExcitingCurrent() <em>Exciting Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcitingCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final float EXCITING_CURRENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getExcitingCurrent() <em>Exciting Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcitingCurrent()
	 * @generated
	 * @ordered
	 */
	protected float excitingCurrent = EXCITING_CURRENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WindingTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.WINDING_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFromTapStep() {
		return fromTapStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromTapStep(int newFromTapStep) {
		int oldFromTapStep = fromTapStep;
		fromTapStep = newFromTapStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.WINDING_TEST__FROM_TAP_STEP, oldFromTapStep, fromTapStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerWinding getFrom_TransformerWinding() {
		if (from_TransformerWinding != null && from_TransformerWinding.eIsProxy()) {
			InternalEObject oldFrom_TransformerWinding = (InternalEObject)from_TransformerWinding;
			from_TransformerWinding = (TransformerWinding)eResolveProxy(oldFrom_TransformerWinding);
			if (from_TransformerWinding != oldFrom_TransformerWinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.WINDING_TEST__FROM_TRANSFORMER_WINDING, oldFrom_TransformerWinding, from_TransformerWinding));
			}
		}
		return from_TransformerWinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerWinding basicGetFrom_TransformerWinding() {
		return from_TransformerWinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom_TransformerWinding(TransformerWinding newFrom_TransformerWinding, NotificationChain msgs) {
		TransformerWinding oldFrom_TransformerWinding = from_TransformerWinding;
		from_TransformerWinding = newFrom_TransformerWinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.WINDING_TEST__FROM_TRANSFORMER_WINDING, oldFrom_TransformerWinding, newFrom_TransformerWinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom_TransformerWinding(TransformerWinding newFrom_TransformerWinding) {
		if (newFrom_TransformerWinding != from_TransformerWinding) {
			NotificationChain msgs = null;
			if (from_TransformerWinding != null)
				msgs = ((InternalEObject)from_TransformerWinding).eInverseRemove(this, WiresPackage.TRANSFORMER_WINDING__FROM_WINDING_TEST, TransformerWinding.class, msgs);
			if (newFrom_TransformerWinding != null)
				msgs = ((InternalEObject)newFrom_TransformerWinding).eInverseAdd(this, WiresPackage.TRANSFORMER_WINDING__FROM_WINDING_TEST, TransformerWinding.class, msgs);
			msgs = basicSetFrom_TransformerWinding(newFrom_TransformerWinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.WINDING_TEST__FROM_TRANSFORMER_WINDING, newFrom_TransformerWinding, newFrom_TransformerWinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLeakageImpedance() {
		return leakageImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeakageImpedance(float newLeakageImpedance) {
		float oldLeakageImpedance = leakageImpedance;
		leakageImpedance = newLeakageImpedance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.WINDING_TEST__LEAKAGE_IMPEDANCE, oldLeakageImpedance, leakageImpedance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNoLoadLoss() {
		return noLoadLoss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoLoadLoss(float newNoLoadLoss) {
		float oldNoLoadLoss = noLoadLoss;
		noLoadLoss = newNoLoadLoss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.WINDING_TEST__NO_LOAD_LOSS, oldNoLoadLoss, noLoadLoss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPhaseShift() {
		return phaseShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseShift(float newPhaseShift) {
		float oldPhaseShift = phaseShift;
		phaseShift = newPhaseShift;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.WINDING_TEST__PHASE_SHIFT, oldPhaseShift, phaseShift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerWinding getTo_TransformerWinding() {
		if (to_TransformerWinding != null && to_TransformerWinding.eIsProxy()) {
			InternalEObject oldTo_TransformerWinding = (InternalEObject)to_TransformerWinding;
			to_TransformerWinding = (TransformerWinding)eResolveProxy(oldTo_TransformerWinding);
			if (to_TransformerWinding != oldTo_TransformerWinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.WINDING_TEST__TO_TRANSFORMER_WINDING, oldTo_TransformerWinding, to_TransformerWinding));
			}
		}
		return to_TransformerWinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerWinding basicGetTo_TransformerWinding() {
		return to_TransformerWinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo_TransformerWinding(TransformerWinding newTo_TransformerWinding, NotificationChain msgs) {
		TransformerWinding oldTo_TransformerWinding = to_TransformerWinding;
		to_TransformerWinding = newTo_TransformerWinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.WINDING_TEST__TO_TRANSFORMER_WINDING, oldTo_TransformerWinding, newTo_TransformerWinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo_TransformerWinding(TransformerWinding newTo_TransformerWinding) {
		if (newTo_TransformerWinding != to_TransformerWinding) {
			NotificationChain msgs = null;
			if (to_TransformerWinding != null)
				msgs = ((InternalEObject)to_TransformerWinding).eInverseRemove(this, WiresPackage.TRANSFORMER_WINDING__TO_WINDING_TEST, TransformerWinding.class, msgs);
			if (newTo_TransformerWinding != null)
				msgs = ((InternalEObject)newTo_TransformerWinding).eInverseAdd(this, WiresPackage.TRANSFORMER_WINDING__TO_WINDING_TEST, TransformerWinding.class, msgs);
			msgs = basicSetTo_TransformerWinding(newTo_TransformerWinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.WINDING_TEST__TO_TRANSFORMER_WINDING, newTo_TransformerWinding, newTo_TransformerWinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLoadLoss() {
		return loadLoss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadLoss(float newLoadLoss) {
		float oldLoadLoss = loadLoss;
		loadLoss = newLoadLoss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.WINDING_TEST__LOAD_LOSS, oldLoadLoss, loadLoss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getToTapStep() {
		return toTapStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToTapStep(int newToTapStep) {
		int oldToTapStep = toTapStep;
		toTapStep = newToTapStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.WINDING_TEST__TO_TAP_STEP, oldToTapStep, toTapStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVoltage() {
		return voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage(float newVoltage) {
		float oldVoltage = voltage;
		voltage = newVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.WINDING_TEST__VOLTAGE, oldVoltage, voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getExcitingCurrent() {
		return excitingCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcitingCurrent(float newExcitingCurrent) {
		float oldExcitingCurrent = excitingCurrent;
		excitingCurrent = newExcitingCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.WINDING_TEST__EXCITING_CURRENT, oldExcitingCurrent, excitingCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.WINDING_TEST__FROM_TRANSFORMER_WINDING:
				if (from_TransformerWinding != null)
					msgs = ((InternalEObject)from_TransformerWinding).eInverseRemove(this, WiresPackage.TRANSFORMER_WINDING__FROM_WINDING_TEST, TransformerWinding.class, msgs);
				return basicSetFrom_TransformerWinding((TransformerWinding)otherEnd, msgs);
			case WiresPackage.WINDING_TEST__TO_TRANSFORMER_WINDING:
				if (to_TransformerWinding != null)
					msgs = ((InternalEObject)to_TransformerWinding).eInverseRemove(this, WiresPackage.TRANSFORMER_WINDING__TO_WINDING_TEST, TransformerWinding.class, msgs);
				return basicSetTo_TransformerWinding((TransformerWinding)otherEnd, msgs);
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
			case WiresPackage.WINDING_TEST__FROM_TRANSFORMER_WINDING:
				return basicSetFrom_TransformerWinding(null, msgs);
			case WiresPackage.WINDING_TEST__TO_TRANSFORMER_WINDING:
				return basicSetTo_TransformerWinding(null, msgs);
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
			case WiresPackage.WINDING_TEST__FROM_TAP_STEP:
				return getFromTapStep();
			case WiresPackage.WINDING_TEST__FROM_TRANSFORMER_WINDING:
				if (resolve) return getFrom_TransformerWinding();
				return basicGetFrom_TransformerWinding();
			case WiresPackage.WINDING_TEST__LEAKAGE_IMPEDANCE:
				return getLeakageImpedance();
			case WiresPackage.WINDING_TEST__NO_LOAD_LOSS:
				return getNoLoadLoss();
			case WiresPackage.WINDING_TEST__PHASE_SHIFT:
				return getPhaseShift();
			case WiresPackage.WINDING_TEST__TO_TRANSFORMER_WINDING:
				if (resolve) return getTo_TransformerWinding();
				return basicGetTo_TransformerWinding();
			case WiresPackage.WINDING_TEST__LOAD_LOSS:
				return getLoadLoss();
			case WiresPackage.WINDING_TEST__TO_TAP_STEP:
				return getToTapStep();
			case WiresPackage.WINDING_TEST__VOLTAGE:
				return getVoltage();
			case WiresPackage.WINDING_TEST__EXCITING_CURRENT:
				return getExcitingCurrent();
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
			case WiresPackage.WINDING_TEST__FROM_TAP_STEP:
				setFromTapStep((Integer)newValue);
				return;
			case WiresPackage.WINDING_TEST__FROM_TRANSFORMER_WINDING:
				setFrom_TransformerWinding((TransformerWinding)newValue);
				return;
			case WiresPackage.WINDING_TEST__LEAKAGE_IMPEDANCE:
				setLeakageImpedance((Float)newValue);
				return;
			case WiresPackage.WINDING_TEST__NO_LOAD_LOSS:
				setNoLoadLoss((Float)newValue);
				return;
			case WiresPackage.WINDING_TEST__PHASE_SHIFT:
				setPhaseShift((Float)newValue);
				return;
			case WiresPackage.WINDING_TEST__TO_TRANSFORMER_WINDING:
				setTo_TransformerWinding((TransformerWinding)newValue);
				return;
			case WiresPackage.WINDING_TEST__LOAD_LOSS:
				setLoadLoss((Float)newValue);
				return;
			case WiresPackage.WINDING_TEST__TO_TAP_STEP:
				setToTapStep((Integer)newValue);
				return;
			case WiresPackage.WINDING_TEST__VOLTAGE:
				setVoltage((Float)newValue);
				return;
			case WiresPackage.WINDING_TEST__EXCITING_CURRENT:
				setExcitingCurrent((Float)newValue);
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
			case WiresPackage.WINDING_TEST__FROM_TAP_STEP:
				setFromTapStep(FROM_TAP_STEP_EDEFAULT);
				return;
			case WiresPackage.WINDING_TEST__FROM_TRANSFORMER_WINDING:
				setFrom_TransformerWinding((TransformerWinding)null);
				return;
			case WiresPackage.WINDING_TEST__LEAKAGE_IMPEDANCE:
				setLeakageImpedance(LEAKAGE_IMPEDANCE_EDEFAULT);
				return;
			case WiresPackage.WINDING_TEST__NO_LOAD_LOSS:
				setNoLoadLoss(NO_LOAD_LOSS_EDEFAULT);
				return;
			case WiresPackage.WINDING_TEST__PHASE_SHIFT:
				setPhaseShift(PHASE_SHIFT_EDEFAULT);
				return;
			case WiresPackage.WINDING_TEST__TO_TRANSFORMER_WINDING:
				setTo_TransformerWinding((TransformerWinding)null);
				return;
			case WiresPackage.WINDING_TEST__LOAD_LOSS:
				setLoadLoss(LOAD_LOSS_EDEFAULT);
				return;
			case WiresPackage.WINDING_TEST__TO_TAP_STEP:
				setToTapStep(TO_TAP_STEP_EDEFAULT);
				return;
			case WiresPackage.WINDING_TEST__VOLTAGE:
				setVoltage(VOLTAGE_EDEFAULT);
				return;
			case WiresPackage.WINDING_TEST__EXCITING_CURRENT:
				setExcitingCurrent(EXCITING_CURRENT_EDEFAULT);
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
			case WiresPackage.WINDING_TEST__FROM_TAP_STEP:
				return fromTapStep != FROM_TAP_STEP_EDEFAULT;
			case WiresPackage.WINDING_TEST__FROM_TRANSFORMER_WINDING:
				return from_TransformerWinding != null;
			case WiresPackage.WINDING_TEST__LEAKAGE_IMPEDANCE:
				return leakageImpedance != LEAKAGE_IMPEDANCE_EDEFAULT;
			case WiresPackage.WINDING_TEST__NO_LOAD_LOSS:
				return noLoadLoss != NO_LOAD_LOSS_EDEFAULT;
			case WiresPackage.WINDING_TEST__PHASE_SHIFT:
				return phaseShift != PHASE_SHIFT_EDEFAULT;
			case WiresPackage.WINDING_TEST__TO_TRANSFORMER_WINDING:
				return to_TransformerWinding != null;
			case WiresPackage.WINDING_TEST__LOAD_LOSS:
				return loadLoss != LOAD_LOSS_EDEFAULT;
			case WiresPackage.WINDING_TEST__TO_TAP_STEP:
				return toTapStep != TO_TAP_STEP_EDEFAULT;
			case WiresPackage.WINDING_TEST__VOLTAGE:
				return voltage != VOLTAGE_EDEFAULT;
			case WiresPackage.WINDING_TEST__EXCITING_CURRENT:
				return excitingCurrent != EXCITING_CURRENT_EDEFAULT;
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
		result.append(" (fromTapStep: ");
		result.append(fromTapStep);
		result.append(", leakageImpedance: ");
		result.append(leakageImpedance);
		result.append(", noLoadLoss: ");
		result.append(noLoadLoss);
		result.append(", phaseShift: ");
		result.append(phaseShift);
		result.append(", loadLoss: ");
		result.append(loadLoss);
		result.append(", toTapStep: ");
		result.append(toTapStep);
		result.append(", voltage: ");
		result.append(voltage);
		result.append(", excitingCurrent: ");
		result.append(excitingCurrent);
		result.append(')');
		return result.toString();
	}

} //WindingTestImpl
