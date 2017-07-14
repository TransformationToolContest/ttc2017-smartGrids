/**
 */
package gluemodel.CIM.IEC61968.WiresExt.impl;

import gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger;
import gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage;

import gluemodel.CIM.IEC61970.Core.PhaseCode;

import gluemodel.CIM.IEC61970.Wires.impl.RatioTapChangerImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distribution Tap Changer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTapChangerImpl#getPtRatio <em>Pt Ratio</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTapChangerImpl#getLimitVoltage <em>Limit Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTapChangerImpl#getReverseLineDropR <em>Reverse Line Drop R</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTapChangerImpl#getReverseLineDropX <em>Reverse Line Drop X</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTapChangerImpl#getCtRating <em>Ct Rating</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTapChangerImpl#getLineDropR <em>Line Drop R</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTapChangerImpl#getBandVoltage <em>Band Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTapChangerImpl#getLineDropX <em>Line Drop X</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTapChangerImpl#getCtRatio <em>Ct Ratio</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTapChangerImpl#isLineDropCompensation <em>Line Drop Compensation</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTapChangerImpl#getMonitoredPhase <em>Monitored Phase</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTapChangerImpl#getTargetVoltage <em>Target Voltage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistributionTapChangerImpl extends RatioTapChangerImpl implements DistributionTapChanger {
	/**
	 * The default value of the '{@link #getPtRatio() <em>Pt Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPtRatio()
	 * @generated
	 * @ordered
	 */
	protected static final float PT_RATIO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPtRatio() <em>Pt Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPtRatio()
	 * @generated
	 * @ordered
	 */
	protected float ptRatio = PT_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getLimitVoltage() <em>Limit Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float LIMIT_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLimitVoltage() <em>Limit Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitVoltage()
	 * @generated
	 * @ordered
	 */
	protected float limitVoltage = LIMIT_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReverseLineDropR() <em>Reverse Line Drop R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverseLineDropR()
	 * @generated
	 * @ordered
	 */
	protected static final float REVERSE_LINE_DROP_R_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReverseLineDropR() <em>Reverse Line Drop R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverseLineDropR()
	 * @generated
	 * @ordered
	 */
	protected float reverseLineDropR = REVERSE_LINE_DROP_R_EDEFAULT;

	/**
	 * The default value of the '{@link #getReverseLineDropX() <em>Reverse Line Drop X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverseLineDropX()
	 * @generated
	 * @ordered
	 */
	protected static final float REVERSE_LINE_DROP_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReverseLineDropX() <em>Reverse Line Drop X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverseLineDropX()
	 * @generated
	 * @ordered
	 */
	protected float reverseLineDropX = REVERSE_LINE_DROP_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getCtRating() <em>Ct Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtRating()
	 * @generated
	 * @ordered
	 */
	protected static final float CT_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCtRating() <em>Ct Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtRating()
	 * @generated
	 * @ordered
	 */
	protected float ctRating = CT_RATING_EDEFAULT;

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
	 * The default value of the '{@link #getBandVoltage() <em>Band Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float BAND_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBandVoltage() <em>Band Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandVoltage()
	 * @generated
	 * @ordered
	 */
	protected float bandVoltage = BAND_VOLTAGE_EDEFAULT;

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
	 * The default value of the '{@link #getCtRatio() <em>Ct Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtRatio()
	 * @generated
	 * @ordered
	 */
	protected static final float CT_RATIO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCtRatio() <em>Ct Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtRatio()
	 * @generated
	 * @ordered
	 */
	protected float ctRatio = CT_RATIO_EDEFAULT;

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
	 * The default value of the '{@link #getMonitoredPhase() <em>Monitored Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredPhase()
	 * @generated
	 * @ordered
	 */
	protected static final PhaseCode MONITORED_PHASE_EDEFAULT = PhaseCode.ABC;

	/**
	 * The cached value of the '{@link #getMonitoredPhase() <em>Monitored Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredPhase()
	 * @generated
	 * @ordered
	 */
	protected PhaseCode monitoredPhase = MONITORED_PHASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetVoltage() <em>Target Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float TARGET_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTargetVoltage() <em>Target Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetVoltage()
	 * @generated
	 * @ordered
	 */
	protected float targetVoltage = TARGET_VOLTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistributionTapChangerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresExtPackage.Literals.DISTRIBUTION_TAP_CHANGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPtRatio() {
		return ptRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPtRatio(float newPtRatio) {
		float oldPtRatio = ptRatio;
		ptRatio = newPtRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TAP_CHANGER__PT_RATIO, oldPtRatio, ptRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLimitVoltage() {
		return limitVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimitVoltage(float newLimitVoltage) {
		float oldLimitVoltage = limitVoltage;
		limitVoltage = newLimitVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TAP_CHANGER__LIMIT_VOLTAGE, oldLimitVoltage, limitVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getReverseLineDropR() {
		return reverseLineDropR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReverseLineDropR(float newReverseLineDropR) {
		float oldReverseLineDropR = reverseLineDropR;
		reverseLineDropR = newReverseLineDropR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TAP_CHANGER__REVERSE_LINE_DROP_R, oldReverseLineDropR, reverseLineDropR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getReverseLineDropX() {
		return reverseLineDropX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReverseLineDropX(float newReverseLineDropX) {
		float oldReverseLineDropX = reverseLineDropX;
		reverseLineDropX = newReverseLineDropX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TAP_CHANGER__REVERSE_LINE_DROP_X, oldReverseLineDropX, reverseLineDropX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCtRating() {
		return ctRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCtRating(float newCtRating) {
		float oldCtRating = ctRating;
		ctRating = newCtRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TAP_CHANGER__CT_RATING, oldCtRating, ctRating));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TAP_CHANGER__LINE_DROP_R, oldLineDropR, lineDropR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBandVoltage() {
		return bandVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBandVoltage(float newBandVoltage) {
		float oldBandVoltage = bandVoltage;
		bandVoltage = newBandVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TAP_CHANGER__BAND_VOLTAGE, oldBandVoltage, bandVoltage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TAP_CHANGER__LINE_DROP_X, oldLineDropX, lineDropX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCtRatio() {
		return ctRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCtRatio(float newCtRatio) {
		float oldCtRatio = ctRatio;
		ctRatio = newCtRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TAP_CHANGER__CT_RATIO, oldCtRatio, ctRatio));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TAP_CHANGER__LINE_DROP_COMPENSATION, oldLineDropCompensation, lineDropCompensation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseCode getMonitoredPhase() {
		return monitoredPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoredPhase(PhaseCode newMonitoredPhase) {
		PhaseCode oldMonitoredPhase = monitoredPhase;
		monitoredPhase = newMonitoredPhase == null ? MONITORED_PHASE_EDEFAULT : newMonitoredPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TAP_CHANGER__MONITORED_PHASE, oldMonitoredPhase, monitoredPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTargetVoltage() {
		return targetVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetVoltage(float newTargetVoltage) {
		float oldTargetVoltage = targetVoltage;
		targetVoltage = newTargetVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TAP_CHANGER__TARGET_VOLTAGE, oldTargetVoltage, targetVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__PT_RATIO:
				return getPtRatio();
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__LIMIT_VOLTAGE:
				return getLimitVoltage();
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__REVERSE_LINE_DROP_R:
				return getReverseLineDropR();
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__REVERSE_LINE_DROP_X:
				return getReverseLineDropX();
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__CT_RATING:
				return getCtRating();
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__LINE_DROP_R:
				return getLineDropR();
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__BAND_VOLTAGE:
				return getBandVoltage();
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__LINE_DROP_X:
				return getLineDropX();
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__CT_RATIO:
				return getCtRatio();
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__LINE_DROP_COMPENSATION:
				return isLineDropCompensation();
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__MONITORED_PHASE:
				return getMonitoredPhase();
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__TARGET_VOLTAGE:
				return getTargetVoltage();
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
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__PT_RATIO:
				setPtRatio((Float)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__LIMIT_VOLTAGE:
				setLimitVoltage((Float)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__REVERSE_LINE_DROP_R:
				setReverseLineDropR((Float)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__REVERSE_LINE_DROP_X:
				setReverseLineDropX((Float)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__CT_RATING:
				setCtRating((Float)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__LINE_DROP_R:
				setLineDropR((Float)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__BAND_VOLTAGE:
				setBandVoltage((Float)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__LINE_DROP_X:
				setLineDropX((Float)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__CT_RATIO:
				setCtRatio((Float)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__LINE_DROP_COMPENSATION:
				setLineDropCompensation((Boolean)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__MONITORED_PHASE:
				setMonitoredPhase((PhaseCode)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__TARGET_VOLTAGE:
				setTargetVoltage((Float)newValue);
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
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__PT_RATIO:
				setPtRatio(PT_RATIO_EDEFAULT);
				return;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__LIMIT_VOLTAGE:
				setLimitVoltage(LIMIT_VOLTAGE_EDEFAULT);
				return;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__REVERSE_LINE_DROP_R:
				setReverseLineDropR(REVERSE_LINE_DROP_R_EDEFAULT);
				return;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__REVERSE_LINE_DROP_X:
				setReverseLineDropX(REVERSE_LINE_DROP_X_EDEFAULT);
				return;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__CT_RATING:
				setCtRating(CT_RATING_EDEFAULT);
				return;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__LINE_DROP_R:
				setLineDropR(LINE_DROP_R_EDEFAULT);
				return;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__BAND_VOLTAGE:
				setBandVoltage(BAND_VOLTAGE_EDEFAULT);
				return;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__LINE_DROP_X:
				setLineDropX(LINE_DROP_X_EDEFAULT);
				return;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__CT_RATIO:
				setCtRatio(CT_RATIO_EDEFAULT);
				return;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__LINE_DROP_COMPENSATION:
				setLineDropCompensation(LINE_DROP_COMPENSATION_EDEFAULT);
				return;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__MONITORED_PHASE:
				setMonitoredPhase(MONITORED_PHASE_EDEFAULT);
				return;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__TARGET_VOLTAGE:
				setTargetVoltage(TARGET_VOLTAGE_EDEFAULT);
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
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__PT_RATIO:
				return ptRatio != PT_RATIO_EDEFAULT;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__LIMIT_VOLTAGE:
				return limitVoltage != LIMIT_VOLTAGE_EDEFAULT;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__REVERSE_LINE_DROP_R:
				return reverseLineDropR != REVERSE_LINE_DROP_R_EDEFAULT;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__REVERSE_LINE_DROP_X:
				return reverseLineDropX != REVERSE_LINE_DROP_X_EDEFAULT;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__CT_RATING:
				return ctRating != CT_RATING_EDEFAULT;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__LINE_DROP_R:
				return lineDropR != LINE_DROP_R_EDEFAULT;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__BAND_VOLTAGE:
				return bandVoltage != BAND_VOLTAGE_EDEFAULT;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__LINE_DROP_X:
				return lineDropX != LINE_DROP_X_EDEFAULT;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__CT_RATIO:
				return ctRatio != CT_RATIO_EDEFAULT;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__LINE_DROP_COMPENSATION:
				return lineDropCompensation != LINE_DROP_COMPENSATION_EDEFAULT;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__MONITORED_PHASE:
				return monitoredPhase != MONITORED_PHASE_EDEFAULT;
			case WiresExtPackage.DISTRIBUTION_TAP_CHANGER__TARGET_VOLTAGE:
				return targetVoltage != TARGET_VOLTAGE_EDEFAULT;
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
		result.append(" (ptRatio: ");
		result.append(ptRatio);
		result.append(", limitVoltage: ");
		result.append(limitVoltage);
		result.append(", reverseLineDropR: ");
		result.append(reverseLineDropR);
		result.append(", reverseLineDropX: ");
		result.append(reverseLineDropX);
		result.append(", ctRating: ");
		result.append(ctRating);
		result.append(", lineDropR: ");
		result.append(lineDropR);
		result.append(", bandVoltage: ");
		result.append(bandVoltage);
		result.append(", lineDropX: ");
		result.append(lineDropX);
		result.append(", ctRatio: ");
		result.append(ctRatio);
		result.append(", lineDropCompensation: ");
		result.append(lineDropCompensation);
		result.append(", monitoredPhase: ");
		result.append(monitoredPhase);
		result.append(", targetVoltage: ");
		result.append(targetVoltage);
		result.append(')');
		return result.toString();
	}

} //DistributionTapChangerImpl
