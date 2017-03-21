/**
 */
package CIM.IEC61970.Wires.impl;

import CIM.IEC61970.LoadModel.impl.SeasonDayTypeScheduleImpl;

import CIM.IEC61970.Wires.TapChanger;
import CIM.IEC61970.Wires.TapSchedule;
import CIM.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tap Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.impl.TapScheduleImpl#isLineDropCompensation <em>Line Drop Compensation</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.TapScheduleImpl#getTapChanger <em>Tap Changer</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.TapScheduleImpl#getLineDropX <em>Line Drop X</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.TapScheduleImpl#getLineDropR <em>Line Drop R</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TapScheduleImpl extends SeasonDayTypeScheduleImpl implements TapSchedule {
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
	 * The cached value of the '{@link #getTapChanger() <em>Tap Changer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapChanger()
	 * @generated
	 * @ordered
	 */
	protected TapChanger tapChanger;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TapScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.TAP_SCHEDULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_SCHEDULE__LINE_DROP_COMPENSATION, oldLineDropCompensation, lineDropCompensation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapChanger getTapChanger() {
		if (tapChanger != null && tapChanger.eIsProxy()) {
			InternalEObject oldTapChanger = (InternalEObject)tapChanger;
			tapChanger = (TapChanger)eResolveProxy(oldTapChanger);
			if (tapChanger != oldTapChanger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.TAP_SCHEDULE__TAP_CHANGER, oldTapChanger, tapChanger));
			}
		}
		return tapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapChanger basicGetTapChanger() {
		return tapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTapChanger(TapChanger newTapChanger, NotificationChain msgs) {
		TapChanger oldTapChanger = tapChanger;
		tapChanger = newTapChanger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_SCHEDULE__TAP_CHANGER, oldTapChanger, newTapChanger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTapChanger(TapChanger newTapChanger) {
		if (newTapChanger != tapChanger) {
			NotificationChain msgs = null;
			if (tapChanger != null)
				msgs = ((InternalEObject)tapChanger).eInverseRemove(this, WiresPackage.TAP_CHANGER__TAP_SCHEDULES, TapChanger.class, msgs);
			if (newTapChanger != null)
				msgs = ((InternalEObject)newTapChanger).eInverseAdd(this, WiresPackage.TAP_CHANGER__TAP_SCHEDULES, TapChanger.class, msgs);
			msgs = basicSetTapChanger(newTapChanger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_SCHEDULE__TAP_CHANGER, newTapChanger, newTapChanger));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_SCHEDULE__LINE_DROP_X, oldLineDropX, lineDropX));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_SCHEDULE__LINE_DROP_R, oldLineDropR, lineDropR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.TAP_SCHEDULE__TAP_CHANGER:
				if (tapChanger != null)
					msgs = ((InternalEObject)tapChanger).eInverseRemove(this, WiresPackage.TAP_CHANGER__TAP_SCHEDULES, TapChanger.class, msgs);
				return basicSetTapChanger((TapChanger)otherEnd, msgs);
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
			case WiresPackage.TAP_SCHEDULE__TAP_CHANGER:
				return basicSetTapChanger(null, msgs);
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
			case WiresPackage.TAP_SCHEDULE__LINE_DROP_COMPENSATION:
				return isLineDropCompensation();
			case WiresPackage.TAP_SCHEDULE__TAP_CHANGER:
				if (resolve) return getTapChanger();
				return basicGetTapChanger();
			case WiresPackage.TAP_SCHEDULE__LINE_DROP_X:
				return getLineDropX();
			case WiresPackage.TAP_SCHEDULE__LINE_DROP_R:
				return getLineDropR();
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
			case WiresPackage.TAP_SCHEDULE__LINE_DROP_COMPENSATION:
				setLineDropCompensation((Boolean)newValue);
				return;
			case WiresPackage.TAP_SCHEDULE__TAP_CHANGER:
				setTapChanger((TapChanger)newValue);
				return;
			case WiresPackage.TAP_SCHEDULE__LINE_DROP_X:
				setLineDropX((Float)newValue);
				return;
			case WiresPackage.TAP_SCHEDULE__LINE_DROP_R:
				setLineDropR((Float)newValue);
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
			case WiresPackage.TAP_SCHEDULE__LINE_DROP_COMPENSATION:
				setLineDropCompensation(LINE_DROP_COMPENSATION_EDEFAULT);
				return;
			case WiresPackage.TAP_SCHEDULE__TAP_CHANGER:
				setTapChanger((TapChanger)null);
				return;
			case WiresPackage.TAP_SCHEDULE__LINE_DROP_X:
				setLineDropX(LINE_DROP_X_EDEFAULT);
				return;
			case WiresPackage.TAP_SCHEDULE__LINE_DROP_R:
				setLineDropR(LINE_DROP_R_EDEFAULT);
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
			case WiresPackage.TAP_SCHEDULE__LINE_DROP_COMPENSATION:
				return lineDropCompensation != LINE_DROP_COMPENSATION_EDEFAULT;
			case WiresPackage.TAP_SCHEDULE__TAP_CHANGER:
				return tapChanger != null;
			case WiresPackage.TAP_SCHEDULE__LINE_DROP_X:
				return lineDropX != LINE_DROP_X_EDEFAULT;
			case WiresPackage.TAP_SCHEDULE__LINE_DROP_R:
				return lineDropR != LINE_DROP_R_EDEFAULT;
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
		result.append(" (lineDropCompensation: ");
		result.append(lineDropCompensation);
		result.append(", lineDropX: ");
		result.append(lineDropX);
		result.append(", lineDropR: ");
		result.append(lineDropR);
		result.append(')');
		return result.toString();
	}

} //TapScheduleImpl
