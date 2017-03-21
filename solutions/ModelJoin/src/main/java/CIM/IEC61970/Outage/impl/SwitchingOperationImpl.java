/**
 */
package CIM.IEC61970.Outage.impl;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Outage.OutagePackage;
import CIM.IEC61970.Outage.OutageSchedule;
import CIM.IEC61970.Outage.SwitchState;
import CIM.IEC61970.Outage.SwitchingOperation;

import CIM.IEC61970.Wires.Switch;
import CIM.IEC61970.Wires.WiresPackage;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Switching Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Outage.impl.SwitchingOperationImpl#getSwitches <em>Switches</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.impl.SwitchingOperationImpl#getOperationTime <em>Operation Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.impl.SwitchingOperationImpl#getOutageSchedule <em>Outage Schedule</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.impl.SwitchingOperationImpl#getNewState <em>New State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchingOperationImpl extends IdentifiedObjectImpl implements SwitchingOperation {
	/**
	 * The cached value of the '{@link #getSwitches() <em>Switches</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitches()
	 * @generated
	 * @ordered
	 */
	protected EList<Switch> switches;

	/**
	 * The default value of the '{@link #getOperationTime() <em>Operation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date OPERATION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationTime() <em>Operation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationTime()
	 * @generated
	 * @ordered
	 */
	protected Date operationTime = OPERATION_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutageSchedule() <em>Outage Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageSchedule()
	 * @generated
	 * @ordered
	 */
	protected OutageSchedule outageSchedule;

	/**
	 * The default value of the '{@link #getNewState() <em>New State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewState()
	 * @generated
	 * @ordered
	 */
	protected static final SwitchState NEW_STATE_EDEFAULT = SwitchState.OPEN;

	/**
	 * The cached value of the '{@link #getNewState() <em>New State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewState()
	 * @generated
	 * @ordered
	 */
	protected SwitchState newState = NEW_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchingOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePackage.Literals.SWITCHING_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Switch> getSwitches() {
		if (switches == null) {
			switches = new EObjectWithInverseResolvingEList.ManyInverse<Switch>(Switch.class, this, OutagePackage.SWITCHING_OPERATION__SWITCHES, WiresPackage.SWITCH__SWITCHING_OPERATIONS);
		}
		return switches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getOperationTime() {
		return operationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationTime(Date newOperationTime) {
		Date oldOperationTime = operationTime;
		operationTime = newOperationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePackage.SWITCHING_OPERATION__OPERATION_TIME, oldOperationTime, operationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageSchedule getOutageSchedule() {
		if (outageSchedule != null && outageSchedule.eIsProxy()) {
			InternalEObject oldOutageSchedule = (InternalEObject)outageSchedule;
			outageSchedule = (OutageSchedule)eResolveProxy(oldOutageSchedule);
			if (outageSchedule != oldOutageSchedule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePackage.SWITCHING_OPERATION__OUTAGE_SCHEDULE, oldOutageSchedule, outageSchedule));
			}
		}
		return outageSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageSchedule basicGetOutageSchedule() {
		return outageSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutageSchedule(OutageSchedule newOutageSchedule, NotificationChain msgs) {
		OutageSchedule oldOutageSchedule = outageSchedule;
		outageSchedule = newOutageSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OutagePackage.SWITCHING_OPERATION__OUTAGE_SCHEDULE, oldOutageSchedule, newOutageSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutageSchedule(OutageSchedule newOutageSchedule) {
		if (newOutageSchedule != outageSchedule) {
			NotificationChain msgs = null;
			if (outageSchedule != null)
				msgs = ((InternalEObject)outageSchedule).eInverseRemove(this, OutagePackage.OUTAGE_SCHEDULE__SWITCHING_OPERATIONS, OutageSchedule.class, msgs);
			if (newOutageSchedule != null)
				msgs = ((InternalEObject)newOutageSchedule).eInverseAdd(this, OutagePackage.OUTAGE_SCHEDULE__SWITCHING_OPERATIONS, OutageSchedule.class, msgs);
			msgs = basicSetOutageSchedule(newOutageSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePackage.SWITCHING_OPERATION__OUTAGE_SCHEDULE, newOutageSchedule, newOutageSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchState getNewState() {
		return newState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewState(SwitchState newNewState) {
		SwitchState oldNewState = newState;
		newState = newNewState == null ? NEW_STATE_EDEFAULT : newNewState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePackage.SWITCHING_OPERATION__NEW_STATE, oldNewState, newState));
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
			case OutagePackage.SWITCHING_OPERATION__SWITCHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSwitches()).basicAdd(otherEnd, msgs);
			case OutagePackage.SWITCHING_OPERATION__OUTAGE_SCHEDULE:
				if (outageSchedule != null)
					msgs = ((InternalEObject)outageSchedule).eInverseRemove(this, OutagePackage.OUTAGE_SCHEDULE__SWITCHING_OPERATIONS, OutageSchedule.class, msgs);
				return basicSetOutageSchedule((OutageSchedule)otherEnd, msgs);
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
			case OutagePackage.SWITCHING_OPERATION__SWITCHES:
				return ((InternalEList<?>)getSwitches()).basicRemove(otherEnd, msgs);
			case OutagePackage.SWITCHING_OPERATION__OUTAGE_SCHEDULE:
				return basicSetOutageSchedule(null, msgs);
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
			case OutagePackage.SWITCHING_OPERATION__SWITCHES:
				return getSwitches();
			case OutagePackage.SWITCHING_OPERATION__OPERATION_TIME:
				return getOperationTime();
			case OutagePackage.SWITCHING_OPERATION__OUTAGE_SCHEDULE:
				if (resolve) return getOutageSchedule();
				return basicGetOutageSchedule();
			case OutagePackage.SWITCHING_OPERATION__NEW_STATE:
				return getNewState();
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
			case OutagePackage.SWITCHING_OPERATION__SWITCHES:
				getSwitches().clear();
				getSwitches().addAll((Collection<? extends Switch>)newValue);
				return;
			case OutagePackage.SWITCHING_OPERATION__OPERATION_TIME:
				setOperationTime((Date)newValue);
				return;
			case OutagePackage.SWITCHING_OPERATION__OUTAGE_SCHEDULE:
				setOutageSchedule((OutageSchedule)newValue);
				return;
			case OutagePackage.SWITCHING_OPERATION__NEW_STATE:
				setNewState((SwitchState)newValue);
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
			case OutagePackage.SWITCHING_OPERATION__SWITCHES:
				getSwitches().clear();
				return;
			case OutagePackage.SWITCHING_OPERATION__OPERATION_TIME:
				setOperationTime(OPERATION_TIME_EDEFAULT);
				return;
			case OutagePackage.SWITCHING_OPERATION__OUTAGE_SCHEDULE:
				setOutageSchedule((OutageSchedule)null);
				return;
			case OutagePackage.SWITCHING_OPERATION__NEW_STATE:
				setNewState(NEW_STATE_EDEFAULT);
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
			case OutagePackage.SWITCHING_OPERATION__SWITCHES:
				return switches != null && !switches.isEmpty();
			case OutagePackage.SWITCHING_OPERATION__OPERATION_TIME:
				return OPERATION_TIME_EDEFAULT == null ? operationTime != null : !OPERATION_TIME_EDEFAULT.equals(operationTime);
			case OutagePackage.SWITCHING_OPERATION__OUTAGE_SCHEDULE:
				return outageSchedule != null;
			case OutagePackage.SWITCHING_OPERATION__NEW_STATE:
				return newState != NEW_STATE_EDEFAULT;
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
		result.append(" (operationTime: ");
		result.append(operationTime);
		result.append(", newState: ");
		result.append(newState);
		result.append(')');
		return result.toString();
	}

} //SwitchingOperationImpl
