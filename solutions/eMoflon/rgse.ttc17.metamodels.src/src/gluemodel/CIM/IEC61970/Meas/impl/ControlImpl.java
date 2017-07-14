/**
 */
package gluemodel.CIM.IEC61970.Meas.impl;

import gluemodel.CIM.IEC61970.Core.CorePackage;
import gluemodel.CIM.IEC61970.Core.Unit;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Meas.Control;
import gluemodel.CIM.IEC61970.Meas.ControlType;
import gluemodel.CIM.IEC61970.Meas.MeasPackage;

import gluemodel.CIM.IEC61970.SCADA.RemoteControl;
import gluemodel.CIM.IEC61970.SCADA.SCADAPackage;

import gluemodel.CIM.IEC61970.Wires.RegulatingCondEq;
import gluemodel.CIM.IEC61970.Wires.WiresPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.ControlImpl#isOperationInProgress <em>Operation In Progress</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.ControlImpl#getRegulatingCondEq <em>Regulating Cond Eq</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.ControlImpl#getControlType <em>Control Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.ControlImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.ControlImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.ControlImpl#getRemoteControl <em>Remote Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlImpl extends IdentifiedObjectImpl implements Control {
	/**
	 * The default value of the '{@link #isOperationInProgress() <em>Operation In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOperationInProgress()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPERATION_IN_PROGRESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOperationInProgress() <em>Operation In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOperationInProgress()
	 * @generated
	 * @ordered
	 */
	protected boolean operationInProgress = OPERATION_IN_PROGRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRegulatingCondEq() <em>Regulating Cond Eq</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatingCondEq()
	 * @generated
	 * @ordered
	 */
	protected RegulatingCondEq regulatingCondEq;

	/**
	 * The cached value of the '{@link #getControlType() <em>Control Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlType()
	 * @generated
	 * @ordered
	 */
	protected ControlType controlType;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit unit;

	/**
	 * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected Date timeStamp = TIME_STAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRemoteControl() <em>Remote Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteControl()
	 * @generated
	 * @ordered
	 */
	protected RemoteControl remoteControl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOperationInProgress() {
		return operationInProgress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationInProgress(boolean newOperationInProgress) {
		boolean oldOperationInProgress = operationInProgress;
		operationInProgress = newOperationInProgress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.CONTROL__OPERATION_IN_PROGRESS, oldOperationInProgress, operationInProgress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulatingCondEq getRegulatingCondEq() {
		if (regulatingCondEq != null && regulatingCondEq.eIsProxy()) {
			InternalEObject oldRegulatingCondEq = (InternalEObject)regulatingCondEq;
			regulatingCondEq = (RegulatingCondEq)eResolveProxy(oldRegulatingCondEq);
			if (regulatingCondEq != oldRegulatingCondEq) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.CONTROL__REGULATING_COND_EQ, oldRegulatingCondEq, regulatingCondEq));
			}
		}
		return regulatingCondEq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulatingCondEq basicGetRegulatingCondEq() {
		return regulatingCondEq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegulatingCondEq(RegulatingCondEq newRegulatingCondEq, NotificationChain msgs) {
		RegulatingCondEq oldRegulatingCondEq = regulatingCondEq;
		regulatingCondEq = newRegulatingCondEq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.CONTROL__REGULATING_COND_EQ, oldRegulatingCondEq, newRegulatingCondEq);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegulatingCondEq(RegulatingCondEq newRegulatingCondEq) {
		if (newRegulatingCondEq != regulatingCondEq) {
			NotificationChain msgs = null;
			if (regulatingCondEq != null)
				msgs = ((InternalEObject)regulatingCondEq).eInverseRemove(this, WiresPackage.REGULATING_COND_EQ__CONTROLS, RegulatingCondEq.class, msgs);
			if (newRegulatingCondEq != null)
				msgs = ((InternalEObject)newRegulatingCondEq).eInverseAdd(this, WiresPackage.REGULATING_COND_EQ__CONTROLS, RegulatingCondEq.class, msgs);
			msgs = basicSetRegulatingCondEq(newRegulatingCondEq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.CONTROL__REGULATING_COND_EQ, newRegulatingCondEq, newRegulatingCondEq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlType getControlType() {
		if (controlType != null && controlType.eIsProxy()) {
			InternalEObject oldControlType = (InternalEObject)controlType;
			controlType = (ControlType)eResolveProxy(oldControlType);
			if (controlType != oldControlType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.CONTROL__CONTROL_TYPE, oldControlType, controlType));
			}
		}
		return controlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlType basicGetControlType() {
		return controlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlType(ControlType newControlType, NotificationChain msgs) {
		ControlType oldControlType = controlType;
		controlType = newControlType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.CONTROL__CONTROL_TYPE, oldControlType, newControlType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlType(ControlType newControlType) {
		if (newControlType != controlType) {
			NotificationChain msgs = null;
			if (controlType != null)
				msgs = ((InternalEObject)controlType).eInverseRemove(this, MeasPackage.CONTROL_TYPE__CONTROLS, ControlType.class, msgs);
			if (newControlType != null)
				msgs = ((InternalEObject)newControlType).eInverseAdd(this, MeasPackage.CONTROL_TYPE__CONTROLS, ControlType.class, msgs);
			msgs = basicSetControlType(newControlType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.CONTROL__CONTROL_TYPE, newControlType, newControlType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getUnit() {
		if (unit != null && unit.eIsProxy()) {
			InternalEObject oldUnit = (InternalEObject)unit;
			unit = (Unit)eResolveProxy(oldUnit);
			if (unit != oldUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.CONTROL__UNIT, oldUnit, unit));
			}
		}
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(Unit newUnit, NotificationChain msgs) {
		Unit oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.CONTROL__UNIT, oldUnit, newUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(Unit newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, CorePackage.UNIT__CONTROLS, Unit.class, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, CorePackage.UNIT__CONTROLS, Unit.class, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.CONTROL__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStamp(Date newTimeStamp) {
		Date oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.CONTROL__TIME_STAMP, oldTimeStamp, timeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteControl getRemoteControl() {
		if (remoteControl != null && remoteControl.eIsProxy()) {
			InternalEObject oldRemoteControl = (InternalEObject)remoteControl;
			remoteControl = (RemoteControl)eResolveProxy(oldRemoteControl);
			if (remoteControl != oldRemoteControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.CONTROL__REMOTE_CONTROL, oldRemoteControl, remoteControl));
			}
		}
		return remoteControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteControl basicGetRemoteControl() {
		return remoteControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoteControl(RemoteControl newRemoteControl, NotificationChain msgs) {
		RemoteControl oldRemoteControl = remoteControl;
		remoteControl = newRemoteControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.CONTROL__REMOTE_CONTROL, oldRemoteControl, newRemoteControl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteControl(RemoteControl newRemoteControl) {
		if (newRemoteControl != remoteControl) {
			NotificationChain msgs = null;
			if (remoteControl != null)
				msgs = ((InternalEObject)remoteControl).eInverseRemove(this, SCADAPackage.REMOTE_CONTROL__CONTROL, RemoteControl.class, msgs);
			if (newRemoteControl != null)
				msgs = ((InternalEObject)newRemoteControl).eInverseAdd(this, SCADAPackage.REMOTE_CONTROL__CONTROL, RemoteControl.class, msgs);
			msgs = basicSetRemoteControl(newRemoteControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.CONTROL__REMOTE_CONTROL, newRemoteControl, newRemoteControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeasPackage.CONTROL__REGULATING_COND_EQ:
				if (regulatingCondEq != null)
					msgs = ((InternalEObject)regulatingCondEq).eInverseRemove(this, WiresPackage.REGULATING_COND_EQ__CONTROLS, RegulatingCondEq.class, msgs);
				return basicSetRegulatingCondEq((RegulatingCondEq)otherEnd, msgs);
			case MeasPackage.CONTROL__CONTROL_TYPE:
				if (controlType != null)
					msgs = ((InternalEObject)controlType).eInverseRemove(this, MeasPackage.CONTROL_TYPE__CONTROLS, ControlType.class, msgs);
				return basicSetControlType((ControlType)otherEnd, msgs);
			case MeasPackage.CONTROL__UNIT:
				if (unit != null)
					msgs = ((InternalEObject)unit).eInverseRemove(this, CorePackage.UNIT__CONTROLS, Unit.class, msgs);
				return basicSetUnit((Unit)otherEnd, msgs);
			case MeasPackage.CONTROL__REMOTE_CONTROL:
				if (remoteControl != null)
					msgs = ((InternalEObject)remoteControl).eInverseRemove(this, SCADAPackage.REMOTE_CONTROL__CONTROL, RemoteControl.class, msgs);
				return basicSetRemoteControl((RemoteControl)otherEnd, msgs);
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
			case MeasPackage.CONTROL__REGULATING_COND_EQ:
				return basicSetRegulatingCondEq(null, msgs);
			case MeasPackage.CONTROL__CONTROL_TYPE:
				return basicSetControlType(null, msgs);
			case MeasPackage.CONTROL__UNIT:
				return basicSetUnit(null, msgs);
			case MeasPackage.CONTROL__REMOTE_CONTROL:
				return basicSetRemoteControl(null, msgs);
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
			case MeasPackage.CONTROL__OPERATION_IN_PROGRESS:
				return isOperationInProgress();
			case MeasPackage.CONTROL__REGULATING_COND_EQ:
				if (resolve) return getRegulatingCondEq();
				return basicGetRegulatingCondEq();
			case MeasPackage.CONTROL__CONTROL_TYPE:
				if (resolve) return getControlType();
				return basicGetControlType();
			case MeasPackage.CONTROL__UNIT:
				if (resolve) return getUnit();
				return basicGetUnit();
			case MeasPackage.CONTROL__TIME_STAMP:
				return getTimeStamp();
			case MeasPackage.CONTROL__REMOTE_CONTROL:
				if (resolve) return getRemoteControl();
				return basicGetRemoteControl();
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
			case MeasPackage.CONTROL__OPERATION_IN_PROGRESS:
				setOperationInProgress((Boolean)newValue);
				return;
			case MeasPackage.CONTROL__REGULATING_COND_EQ:
				setRegulatingCondEq((RegulatingCondEq)newValue);
				return;
			case MeasPackage.CONTROL__CONTROL_TYPE:
				setControlType((ControlType)newValue);
				return;
			case MeasPackage.CONTROL__UNIT:
				setUnit((Unit)newValue);
				return;
			case MeasPackage.CONTROL__TIME_STAMP:
				setTimeStamp((Date)newValue);
				return;
			case MeasPackage.CONTROL__REMOTE_CONTROL:
				setRemoteControl((RemoteControl)newValue);
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
			case MeasPackage.CONTROL__OPERATION_IN_PROGRESS:
				setOperationInProgress(OPERATION_IN_PROGRESS_EDEFAULT);
				return;
			case MeasPackage.CONTROL__REGULATING_COND_EQ:
				setRegulatingCondEq((RegulatingCondEq)null);
				return;
			case MeasPackage.CONTROL__CONTROL_TYPE:
				setControlType((ControlType)null);
				return;
			case MeasPackage.CONTROL__UNIT:
				setUnit((Unit)null);
				return;
			case MeasPackage.CONTROL__TIME_STAMP:
				setTimeStamp(TIME_STAMP_EDEFAULT);
				return;
			case MeasPackage.CONTROL__REMOTE_CONTROL:
				setRemoteControl((RemoteControl)null);
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
			case MeasPackage.CONTROL__OPERATION_IN_PROGRESS:
				return operationInProgress != OPERATION_IN_PROGRESS_EDEFAULT;
			case MeasPackage.CONTROL__REGULATING_COND_EQ:
				return regulatingCondEq != null;
			case MeasPackage.CONTROL__CONTROL_TYPE:
				return controlType != null;
			case MeasPackage.CONTROL__UNIT:
				return unit != null;
			case MeasPackage.CONTROL__TIME_STAMP:
				return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
			case MeasPackage.CONTROL__REMOTE_CONTROL:
				return remoteControl != null;
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
		result.append(" (operationInProgress: ");
		result.append(operationInProgress);
		result.append(", timeStamp: ");
		result.append(timeStamp);
		result.append(')');
		return result.toString();
	}

} //ControlImpl
