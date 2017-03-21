/**
 */
package CIM.IEC61970.Wires.impl;

import CIM.IEC61970.Core.CorePackage;
import CIM.IEC61970.Core.Terminal;

import CIM.IEC61970.Core.impl.PowerSystemResourceImpl;

import CIM.IEC61970.Wires.RegulatingCondEq;
import CIM.IEC61970.Wires.RegulatingControl;
import CIM.IEC61970.Wires.RegulatingControlModeKind;
import CIM.IEC61970.Wires.RegulationSchedule;
import CIM.IEC61970.Wires.TapChanger;
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
 * An implementation of the model object '<em><b>Regulating Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.impl.RegulatingControlImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.RegulatingControlImpl#getTapChanger <em>Tap Changer</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.RegulatingControlImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.RegulatingControlImpl#getRegulatingCondEq <em>Regulating Cond Eq</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.RegulatingControlImpl#getTargetRange <em>Target Range</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.RegulatingControlImpl#getTargetValue <em>Target Value</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.RegulatingControlImpl#getRegulationSchedule <em>Regulation Schedule</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.RegulatingControlImpl#isDiscrete <em>Discrete</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegulatingControlImpl extends PowerSystemResourceImpl implements RegulatingControl {
	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final RegulatingControlModeKind MODE_EDEFAULT = RegulatingControlModeKind.REACTIVE_POWER;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected RegulatingControlModeKind mode = MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTapChanger() <em>Tap Changer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapChanger()
	 * @generated
	 * @ordered
	 */
	protected EList<TapChanger> tapChanger;

	/**
	 * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal()
	 * @generated
	 * @ordered
	 */
	protected Terminal terminal;

	/**
	 * The cached value of the '{@link #getRegulatingCondEq() <em>Regulating Cond Eq</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatingCondEq()
	 * @generated
	 * @ordered
	 */
	protected EList<RegulatingCondEq> regulatingCondEq;

	/**
	 * The default value of the '{@link #getTargetRange() <em>Target Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRange()
	 * @generated
	 * @ordered
	 */
	protected static final float TARGET_RANGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTargetRange() <em>Target Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRange()
	 * @generated
	 * @ordered
	 */
	protected float targetRange = TARGET_RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetValue() <em>Target Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetValue()
	 * @generated
	 * @ordered
	 */
	protected static final float TARGET_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTargetValue() <em>Target Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetValue()
	 * @generated
	 * @ordered
	 */
	protected float targetValue = TARGET_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRegulationSchedule() <em>Regulation Schedule</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulationSchedule()
	 * @generated
	 * @ordered
	 */
	protected EList<RegulationSchedule> regulationSchedule;

	/**
	 * The default value of the '{@link #isDiscrete() <em>Discrete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDiscrete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISCRETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDiscrete() <em>Discrete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDiscrete()
	 * @generated
	 * @ordered
	 */
	protected boolean discrete = DISCRETE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegulatingControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.REGULATING_CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulatingControlModeKind getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(RegulatingControlModeKind newMode) {
		RegulatingControlModeKind oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.REGULATING_CONTROL__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TapChanger> getTapChanger() {
		if (tapChanger == null) {
			tapChanger = new EObjectWithInverseResolvingEList<TapChanger>(TapChanger.class, this, WiresPackage.REGULATING_CONTROL__TAP_CHANGER, WiresPackage.TAP_CHANGER__REGULATING_CONTROL);
		}
		return tapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal getTerminal() {
		if (terminal != null && terminal.eIsProxy()) {
			InternalEObject oldTerminal = (InternalEObject)terminal;
			terminal = (Terminal)eResolveProxy(oldTerminal);
			if (terminal != oldTerminal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.REGULATING_CONTROL__TERMINAL, oldTerminal, terminal));
			}
		}
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal basicGetTerminal() {
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminal(Terminal newTerminal, NotificationChain msgs) {
		Terminal oldTerminal = terminal;
		terminal = newTerminal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.REGULATING_CONTROL__TERMINAL, oldTerminal, newTerminal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminal(Terminal newTerminal) {
		if (newTerminal != terminal) {
			NotificationChain msgs = null;
			if (terminal != null)
				msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__REGULATING_CONTROL, Terminal.class, msgs);
			if (newTerminal != null)
				msgs = ((InternalEObject)newTerminal).eInverseAdd(this, CorePackage.TERMINAL__REGULATING_CONTROL, Terminal.class, msgs);
			msgs = basicSetTerminal(newTerminal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.REGULATING_CONTROL__TERMINAL, newTerminal, newTerminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegulatingCondEq> getRegulatingCondEq() {
		if (regulatingCondEq == null) {
			regulatingCondEq = new EObjectWithInverseResolvingEList<RegulatingCondEq>(RegulatingCondEq.class, this, WiresPackage.REGULATING_CONTROL__REGULATING_COND_EQ, WiresPackage.REGULATING_COND_EQ__REGULATING_CONTROL);
		}
		return regulatingCondEq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTargetRange() {
		return targetRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRange(float newTargetRange) {
		float oldTargetRange = targetRange;
		targetRange = newTargetRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.REGULATING_CONTROL__TARGET_RANGE, oldTargetRange, targetRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTargetValue() {
		return targetValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetValue(float newTargetValue) {
		float oldTargetValue = targetValue;
		targetValue = newTargetValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.REGULATING_CONTROL__TARGET_VALUE, oldTargetValue, targetValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegulationSchedule> getRegulationSchedule() {
		if (regulationSchedule == null) {
			regulationSchedule = new EObjectWithInverseResolvingEList<RegulationSchedule>(RegulationSchedule.class, this, WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE, WiresPackage.REGULATION_SCHEDULE__REGULATING_CONTROL);
		}
		return regulationSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDiscrete() {
		return discrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscrete(boolean newDiscrete) {
		boolean oldDiscrete = discrete;
		discrete = newDiscrete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.REGULATING_CONTROL__DISCRETE, oldDiscrete, discrete));
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
			case WiresPackage.REGULATING_CONTROL__TAP_CHANGER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTapChanger()).basicAdd(otherEnd, msgs);
			case WiresPackage.REGULATING_CONTROL__TERMINAL:
				if (terminal != null)
					msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__REGULATING_CONTROL, Terminal.class, msgs);
				return basicSetTerminal((Terminal)otherEnd, msgs);
			case WiresPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegulatingCondEq()).basicAdd(otherEnd, msgs);
			case WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegulationSchedule()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.REGULATING_CONTROL__TAP_CHANGER:
				return ((InternalEList<?>)getTapChanger()).basicRemove(otherEnd, msgs);
			case WiresPackage.REGULATING_CONTROL__TERMINAL:
				return basicSetTerminal(null, msgs);
			case WiresPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
				return ((InternalEList<?>)getRegulatingCondEq()).basicRemove(otherEnd, msgs);
			case WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
				return ((InternalEList<?>)getRegulationSchedule()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.REGULATING_CONTROL__MODE:
				return getMode();
			case WiresPackage.REGULATING_CONTROL__TAP_CHANGER:
				return getTapChanger();
			case WiresPackage.REGULATING_CONTROL__TERMINAL:
				if (resolve) return getTerminal();
				return basicGetTerminal();
			case WiresPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
				return getRegulatingCondEq();
			case WiresPackage.REGULATING_CONTROL__TARGET_RANGE:
				return getTargetRange();
			case WiresPackage.REGULATING_CONTROL__TARGET_VALUE:
				return getTargetValue();
			case WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
				return getRegulationSchedule();
			case WiresPackage.REGULATING_CONTROL__DISCRETE:
				return isDiscrete();
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
			case WiresPackage.REGULATING_CONTROL__MODE:
				setMode((RegulatingControlModeKind)newValue);
				return;
			case WiresPackage.REGULATING_CONTROL__TAP_CHANGER:
				getTapChanger().clear();
				getTapChanger().addAll((Collection<? extends TapChanger>)newValue);
				return;
			case WiresPackage.REGULATING_CONTROL__TERMINAL:
				setTerminal((Terminal)newValue);
				return;
			case WiresPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
				getRegulatingCondEq().clear();
				getRegulatingCondEq().addAll((Collection<? extends RegulatingCondEq>)newValue);
				return;
			case WiresPackage.REGULATING_CONTROL__TARGET_RANGE:
				setTargetRange((Float)newValue);
				return;
			case WiresPackage.REGULATING_CONTROL__TARGET_VALUE:
				setTargetValue((Float)newValue);
				return;
			case WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
				getRegulationSchedule().clear();
				getRegulationSchedule().addAll((Collection<? extends RegulationSchedule>)newValue);
				return;
			case WiresPackage.REGULATING_CONTROL__DISCRETE:
				setDiscrete((Boolean)newValue);
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
			case WiresPackage.REGULATING_CONTROL__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case WiresPackage.REGULATING_CONTROL__TAP_CHANGER:
				getTapChanger().clear();
				return;
			case WiresPackage.REGULATING_CONTROL__TERMINAL:
				setTerminal((Terminal)null);
				return;
			case WiresPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
				getRegulatingCondEq().clear();
				return;
			case WiresPackage.REGULATING_CONTROL__TARGET_RANGE:
				setTargetRange(TARGET_RANGE_EDEFAULT);
				return;
			case WiresPackage.REGULATING_CONTROL__TARGET_VALUE:
				setTargetValue(TARGET_VALUE_EDEFAULT);
				return;
			case WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
				getRegulationSchedule().clear();
				return;
			case WiresPackage.REGULATING_CONTROL__DISCRETE:
				setDiscrete(DISCRETE_EDEFAULT);
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
			case WiresPackage.REGULATING_CONTROL__MODE:
				return mode != MODE_EDEFAULT;
			case WiresPackage.REGULATING_CONTROL__TAP_CHANGER:
				return tapChanger != null && !tapChanger.isEmpty();
			case WiresPackage.REGULATING_CONTROL__TERMINAL:
				return terminal != null;
			case WiresPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
				return regulatingCondEq != null && !regulatingCondEq.isEmpty();
			case WiresPackage.REGULATING_CONTROL__TARGET_RANGE:
				return targetRange != TARGET_RANGE_EDEFAULT;
			case WiresPackage.REGULATING_CONTROL__TARGET_VALUE:
				return targetValue != TARGET_VALUE_EDEFAULT;
			case WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
				return regulationSchedule != null && !regulationSchedule.isEmpty();
			case WiresPackage.REGULATING_CONTROL__DISCRETE:
				return discrete != DISCRETE_EDEFAULT;
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
		result.append(" (mode: ");
		result.append(mode);
		result.append(", targetRange: ");
		result.append(targetRange);
		result.append(", targetValue: ");
		result.append(targetValue);
		result.append(", discrete: ");
		result.append(discrete);
		result.append(')');
		return result.toString();
	}

} //RegulatingControlImpl
