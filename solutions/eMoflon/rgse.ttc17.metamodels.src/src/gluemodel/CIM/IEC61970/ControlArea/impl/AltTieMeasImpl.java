/**
 */
package gluemodel.CIM.IEC61970.ControlArea.impl;

import gluemodel.CIM.IEC61970.ControlArea.AltTieMeas;
import gluemodel.CIM.IEC61970.ControlArea.ControlAreaPackage;
import gluemodel.CIM.IEC61970.ControlArea.TieFlow;

import gluemodel.CIM.IEC61970.Meas.AnalogValue;
import gluemodel.CIM.IEC61970.Meas.MeasPackage;

import gluemodel.CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alt Tie Meas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.ControlArea.impl.AltTieMeasImpl#getAnalogValue <em>Analog Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.ControlArea.impl.AltTieMeasImpl#getTieFlow <em>Tie Flow</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.ControlArea.impl.AltTieMeasImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AltTieMeasImpl extends ElementImpl implements AltTieMeas {
	/**
	 * The cached value of the '{@link #getAnalogValue() <em>Analog Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalogValue()
	 * @generated
	 * @ordered
	 */
	protected AnalogValue analogValue;

	/**
	 * The cached value of the '{@link #getTieFlow() <em>Tie Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTieFlow()
	 * @generated
	 * @ordered
	 */
	protected TieFlow tieFlow;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AltTieMeasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlAreaPackage.Literals.ALT_TIE_MEAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogValue getAnalogValue() {
		if (analogValue != null && analogValue.eIsProxy()) {
			InternalEObject oldAnalogValue = (InternalEObject)analogValue;
			analogValue = (AnalogValue)eResolveProxy(oldAnalogValue);
			if (analogValue != oldAnalogValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlAreaPackage.ALT_TIE_MEAS__ANALOG_VALUE, oldAnalogValue, analogValue));
			}
		}
		return analogValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogValue basicGetAnalogValue() {
		return analogValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalogValue(AnalogValue newAnalogValue, NotificationChain msgs) {
		AnalogValue oldAnalogValue = analogValue;
		analogValue = newAnalogValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlAreaPackage.ALT_TIE_MEAS__ANALOG_VALUE, oldAnalogValue, newAnalogValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalogValue(AnalogValue newAnalogValue) {
		if (newAnalogValue != analogValue) {
			NotificationChain msgs = null;
			if (analogValue != null)
				msgs = ((InternalEObject)analogValue).eInverseRemove(this, MeasPackage.ANALOG_VALUE__ALT_TIE_MEAS, AnalogValue.class, msgs);
			if (newAnalogValue != null)
				msgs = ((InternalEObject)newAnalogValue).eInverseAdd(this, MeasPackage.ANALOG_VALUE__ALT_TIE_MEAS, AnalogValue.class, msgs);
			msgs = basicSetAnalogValue(newAnalogValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlAreaPackage.ALT_TIE_MEAS__ANALOG_VALUE, newAnalogValue, newAnalogValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TieFlow getTieFlow() {
		if (tieFlow != null && tieFlow.eIsProxy()) {
			InternalEObject oldTieFlow = (InternalEObject)tieFlow;
			tieFlow = (TieFlow)eResolveProxy(oldTieFlow);
			if (tieFlow != oldTieFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlAreaPackage.ALT_TIE_MEAS__TIE_FLOW, oldTieFlow, tieFlow));
			}
		}
		return tieFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TieFlow basicGetTieFlow() {
		return tieFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTieFlow(TieFlow newTieFlow, NotificationChain msgs) {
		TieFlow oldTieFlow = tieFlow;
		tieFlow = newTieFlow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlAreaPackage.ALT_TIE_MEAS__TIE_FLOW, oldTieFlow, newTieFlow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTieFlow(TieFlow newTieFlow) {
		if (newTieFlow != tieFlow) {
			NotificationChain msgs = null;
			if (tieFlow != null)
				msgs = ((InternalEObject)tieFlow).eInverseRemove(this, ControlAreaPackage.TIE_FLOW__ALT_TIE_MEAS, TieFlow.class, msgs);
			if (newTieFlow != null)
				msgs = ((InternalEObject)newTieFlow).eInverseAdd(this, ControlAreaPackage.TIE_FLOW__ALT_TIE_MEAS, TieFlow.class, msgs);
			msgs = basicSetTieFlow(newTieFlow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlAreaPackage.ALT_TIE_MEAS__TIE_FLOW, newTieFlow, newTieFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlAreaPackage.ALT_TIE_MEAS__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ControlAreaPackage.ALT_TIE_MEAS__ANALOG_VALUE:
				if (analogValue != null)
					msgs = ((InternalEObject)analogValue).eInverseRemove(this, MeasPackage.ANALOG_VALUE__ALT_TIE_MEAS, AnalogValue.class, msgs);
				return basicSetAnalogValue((AnalogValue)otherEnd, msgs);
			case ControlAreaPackage.ALT_TIE_MEAS__TIE_FLOW:
				if (tieFlow != null)
					msgs = ((InternalEObject)tieFlow).eInverseRemove(this, ControlAreaPackage.TIE_FLOW__ALT_TIE_MEAS, TieFlow.class, msgs);
				return basicSetTieFlow((TieFlow)otherEnd, msgs);
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
			case ControlAreaPackage.ALT_TIE_MEAS__ANALOG_VALUE:
				return basicSetAnalogValue(null, msgs);
			case ControlAreaPackage.ALT_TIE_MEAS__TIE_FLOW:
				return basicSetTieFlow(null, msgs);
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
			case ControlAreaPackage.ALT_TIE_MEAS__ANALOG_VALUE:
				if (resolve) return getAnalogValue();
				return basicGetAnalogValue();
			case ControlAreaPackage.ALT_TIE_MEAS__TIE_FLOW:
				if (resolve) return getTieFlow();
				return basicGetTieFlow();
			case ControlAreaPackage.ALT_TIE_MEAS__PRIORITY:
				return getPriority();
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
			case ControlAreaPackage.ALT_TIE_MEAS__ANALOG_VALUE:
				setAnalogValue((AnalogValue)newValue);
				return;
			case ControlAreaPackage.ALT_TIE_MEAS__TIE_FLOW:
				setTieFlow((TieFlow)newValue);
				return;
			case ControlAreaPackage.ALT_TIE_MEAS__PRIORITY:
				setPriority((Integer)newValue);
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
			case ControlAreaPackage.ALT_TIE_MEAS__ANALOG_VALUE:
				setAnalogValue((AnalogValue)null);
				return;
			case ControlAreaPackage.ALT_TIE_MEAS__TIE_FLOW:
				setTieFlow((TieFlow)null);
				return;
			case ControlAreaPackage.ALT_TIE_MEAS__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
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
			case ControlAreaPackage.ALT_TIE_MEAS__ANALOG_VALUE:
				return analogValue != null;
			case ControlAreaPackage.ALT_TIE_MEAS__TIE_FLOW:
				return tieFlow != null;
			case ControlAreaPackage.ALT_TIE_MEAS__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
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
		result.append(" (priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //AltTieMeasImpl
