/**
 */
package gluemodel.CIM.IEC61970.Wires.impl;

import gluemodel.CIM.IEC61970.LoadModel.impl.SeasonDayTypeScheduleImpl;

import gluemodel.CIM.IEC61970.Wires.RegulatingControl;
import gluemodel.CIM.IEC61970.Wires.RegulationSchedule;
import gluemodel.CIM.IEC61970.Wires.VoltageControlZone;
import gluemodel.CIM.IEC61970.Wires.WiresPackage;

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
 * An implementation of the model object '<em><b>Regulation Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.RegulationScheduleImpl#getLineDropR <em>Line Drop R</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.RegulationScheduleImpl#getLineDropX <em>Line Drop X</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.RegulationScheduleImpl#isLineDropCompensation <em>Line Drop Compensation</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.RegulationScheduleImpl#getRegulatingControl <em>Regulating Control</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.RegulationScheduleImpl#getVoltageControlZones <em>Voltage Control Zones</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegulationScheduleImpl extends SeasonDayTypeScheduleImpl implements RegulationSchedule {
	/**
	 * The default value of the '{@link #getLineDropR() <em>Line Drop R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineDropR()
	 * @generated
	 * @ordered
	 */
	protected static final float LINE_DROP_R_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLineDropR() <em>Line Drop R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineDropR()
	 * @generated
	 * @ordered
	 */
	protected float lineDropR = LINE_DROP_R_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineDropX() <em>Line Drop X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineDropX()
	 * @generated
	 * @ordered
	 */
	protected static final float LINE_DROP_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLineDropX() <em>Line Drop X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineDropX()
	 * @generated
	 * @ordered
	 */
	protected float lineDropX = LINE_DROP_X_EDEFAULT;

	/**
	 * The default value of the '{@link #isLineDropCompensation() <em>Line Drop Compensation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLineDropCompensation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LINE_DROP_COMPENSATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLineDropCompensation() <em>Line Drop Compensation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLineDropCompensation()
	 * @generated
	 * @ordered
	 */
	protected boolean lineDropCompensation = LINE_DROP_COMPENSATION_EDEFAULT;

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
	 * The cached value of the '{@link #getVoltageControlZones() <em>Voltage Control Zones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageControlZones()
	 * @generated
	 * @ordered
	 */
	protected EList<VoltageControlZone> voltageControlZones;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegulationScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.REGULATION_SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLineDropR() {
		return lineDropR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineDropR(float newLineDropR) {
		float oldLineDropR = lineDropR;
		lineDropR = newLineDropR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.REGULATION_SCHEDULE__LINE_DROP_R, oldLineDropR, lineDropR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLineDropX() {
		return lineDropX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineDropX(float newLineDropX) {
		float oldLineDropX = lineDropX;
		lineDropX = newLineDropX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.REGULATION_SCHEDULE__LINE_DROP_X, oldLineDropX, lineDropX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLineDropCompensation() {
		return lineDropCompensation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineDropCompensation(boolean newLineDropCompensation) {
		boolean oldLineDropCompensation = lineDropCompensation;
		lineDropCompensation = newLineDropCompensation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.REGULATION_SCHEDULE__LINE_DROP_COMPENSATION, oldLineDropCompensation, lineDropCompensation));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.REGULATION_SCHEDULE__REGULATING_CONTROL, oldRegulatingControl, regulatingControl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.REGULATION_SCHEDULE__REGULATING_CONTROL, oldRegulatingControl, newRegulatingControl);
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
				msgs = ((InternalEObject)regulatingControl).eInverseRemove(this, WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE, RegulatingControl.class, msgs);
			if (newRegulatingControl != null)
				msgs = ((InternalEObject)newRegulatingControl).eInverseAdd(this, WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE, RegulatingControl.class, msgs);
			msgs = basicSetRegulatingControl(newRegulatingControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.REGULATION_SCHEDULE__REGULATING_CONTROL, newRegulatingControl, newRegulatingControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VoltageControlZone> getVoltageControlZones() {
		if (voltageControlZones == null) {
			voltageControlZones = new EObjectWithInverseResolvingEList<VoltageControlZone>(VoltageControlZone.class, this, WiresPackage.REGULATION_SCHEDULE__VOLTAGE_CONTROL_ZONES, WiresPackage.VOLTAGE_CONTROL_ZONE__REGULATION_SCHEDULE);
		}
		return voltageControlZones;
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
			case WiresPackage.REGULATION_SCHEDULE__REGULATING_CONTROL:
				if (regulatingControl != null)
					msgs = ((InternalEObject)regulatingControl).eInverseRemove(this, WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE, RegulatingControl.class, msgs);
				return basicSetRegulatingControl((RegulatingControl)otherEnd, msgs);
			case WiresPackage.REGULATION_SCHEDULE__VOLTAGE_CONTROL_ZONES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVoltageControlZones()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.REGULATION_SCHEDULE__REGULATING_CONTROL:
				return basicSetRegulatingControl(null, msgs);
			case WiresPackage.REGULATION_SCHEDULE__VOLTAGE_CONTROL_ZONES:
				return ((InternalEList<?>)getVoltageControlZones()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.REGULATION_SCHEDULE__LINE_DROP_R:
				return getLineDropR();
			case WiresPackage.REGULATION_SCHEDULE__LINE_DROP_X:
				return getLineDropX();
			case WiresPackage.REGULATION_SCHEDULE__LINE_DROP_COMPENSATION:
				return isLineDropCompensation();
			case WiresPackage.REGULATION_SCHEDULE__REGULATING_CONTROL:
				if (resolve) return getRegulatingControl();
				return basicGetRegulatingControl();
			case WiresPackage.REGULATION_SCHEDULE__VOLTAGE_CONTROL_ZONES:
				return getVoltageControlZones();
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
			case WiresPackage.REGULATION_SCHEDULE__LINE_DROP_R:
				setLineDropR((Float)newValue);
				return;
			case WiresPackage.REGULATION_SCHEDULE__LINE_DROP_X:
				setLineDropX((Float)newValue);
				return;
			case WiresPackage.REGULATION_SCHEDULE__LINE_DROP_COMPENSATION:
				setLineDropCompensation((Boolean)newValue);
				return;
			case WiresPackage.REGULATION_SCHEDULE__REGULATING_CONTROL:
				setRegulatingControl((RegulatingControl)newValue);
				return;
			case WiresPackage.REGULATION_SCHEDULE__VOLTAGE_CONTROL_ZONES:
				getVoltageControlZones().clear();
				getVoltageControlZones().addAll((Collection<? extends VoltageControlZone>)newValue);
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
			case WiresPackage.REGULATION_SCHEDULE__LINE_DROP_R:
				setLineDropR(LINE_DROP_R_EDEFAULT);
				return;
			case WiresPackage.REGULATION_SCHEDULE__LINE_DROP_X:
				setLineDropX(LINE_DROP_X_EDEFAULT);
				return;
			case WiresPackage.REGULATION_SCHEDULE__LINE_DROP_COMPENSATION:
				setLineDropCompensation(LINE_DROP_COMPENSATION_EDEFAULT);
				return;
			case WiresPackage.REGULATION_SCHEDULE__REGULATING_CONTROL:
				setRegulatingControl((RegulatingControl)null);
				return;
			case WiresPackage.REGULATION_SCHEDULE__VOLTAGE_CONTROL_ZONES:
				getVoltageControlZones().clear();
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
			case WiresPackage.REGULATION_SCHEDULE__LINE_DROP_R:
				return lineDropR != LINE_DROP_R_EDEFAULT;
			case WiresPackage.REGULATION_SCHEDULE__LINE_DROP_X:
				return lineDropX != LINE_DROP_X_EDEFAULT;
			case WiresPackage.REGULATION_SCHEDULE__LINE_DROP_COMPENSATION:
				return lineDropCompensation != LINE_DROP_COMPENSATION_EDEFAULT;
			case WiresPackage.REGULATION_SCHEDULE__REGULATING_CONTROL:
				return regulatingControl != null;
			case WiresPackage.REGULATION_SCHEDULE__VOLTAGE_CONTROL_ZONES:
				return voltageControlZones != null && !voltageControlZones.isEmpty();
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
		result.append(" (lineDropR: ");
		result.append(lineDropR);
		result.append(", lineDropX: ");
		result.append(lineDropX);
		result.append(", lineDropCompensation: ");
		result.append(lineDropCompensation);
		result.append(')');
		return result.toString();
	}

} //RegulationScheduleImpl
