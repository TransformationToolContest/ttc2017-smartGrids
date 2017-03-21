/**
 */
package CIM.IEC61970.Informative.InfWork.impl;

import CIM.IEC61970.Core.PhaseCode;

import CIM.IEC61970.Informative.InfAssets.impl.ProcedureDataSetImpl;

import CIM.IEC61970.Informative.InfWork.DiagnosisDataSet;
import CIM.IEC61970.Informative.InfWork.InfWorkPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnosis Data Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DiagnosisDataSetImpl#getPhaseCode <em>Phase Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DiagnosisDataSetImpl#getFinalCode <em>Final Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DiagnosisDataSetImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DiagnosisDataSetImpl#getFailureMode <em>Failure Mode</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DiagnosisDataSetImpl#getRootOrigin <em>Root Origin</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DiagnosisDataSetImpl#getFinalCause <em>Final Cause</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DiagnosisDataSetImpl#getRootRemark <em>Root Remark</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DiagnosisDataSetImpl#getRootCause <em>Root Cause</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DiagnosisDataSetImpl#getPreliminaryRemark <em>Preliminary Remark</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DiagnosisDataSetImpl#getPreliminaryCode <em>Preliminary Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DiagnosisDataSetImpl#getPreliminaryDateTime <em>Preliminary Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DiagnosisDataSetImpl#getFinalRemark <em>Final Remark</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DiagnosisDataSetImpl#getFinalOrigin <em>Final Origin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagnosisDataSetImpl extends ProcedureDataSetImpl implements DiagnosisDataSet {
	/**
	 * The default value of the '{@link #getPhaseCode() <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCode()
	 * @generated
	 * @ordered
	 */
	protected static final PhaseCode PHASE_CODE_EDEFAULT = PhaseCode.ABC;

	/**
	 * The cached value of the '{@link #getPhaseCode() <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCode()
	 * @generated
	 * @ordered
	 */
	protected PhaseCode phaseCode = PHASE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalCode() <em>Final Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String FINAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinalCode() <em>Final Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalCode()
	 * @generated
	 * @ordered
	 */
	protected String finalCode = FINAL_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected String effect = EFFECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailureMode() <em>Failure Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureMode()
	 * @generated
	 * @ordered
	 */
	protected static final String FAILURE_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFailureMode() <em>Failure Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureMode()
	 * @generated
	 * @ordered
	 */
	protected String failureMode = FAILURE_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRootOrigin() <em>Root Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_ORIGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootOrigin() <em>Root Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootOrigin()
	 * @generated
	 * @ordered
	 */
	protected String rootOrigin = ROOT_ORIGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalCause() <em>Final Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalCause()
	 * @generated
	 * @ordered
	 */
	protected static final String FINAL_CAUSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinalCause() <em>Final Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalCause()
	 * @generated
	 * @ordered
	 */
	protected String finalCause = FINAL_CAUSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRootRemark() <em>Root Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootRemark()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_REMARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootRemark() <em>Root Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootRemark()
	 * @generated
	 * @ordered
	 */
	protected String rootRemark = ROOT_REMARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getRootCause() <em>Root Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootCause()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_CAUSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootCause() <em>Root Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootCause()
	 * @generated
	 * @ordered
	 */
	protected String rootCause = ROOT_CAUSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreliminaryRemark() <em>Preliminary Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreliminaryRemark()
	 * @generated
	 * @ordered
	 */
	protected static final String PRELIMINARY_REMARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreliminaryRemark() <em>Preliminary Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreliminaryRemark()
	 * @generated
	 * @ordered
	 */
	protected String preliminaryRemark = PRELIMINARY_REMARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreliminaryCode() <em>Preliminary Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreliminaryCode()
	 * @generated
	 * @ordered
	 */
	protected static final String PRELIMINARY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreliminaryCode() <em>Preliminary Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreliminaryCode()
	 * @generated
	 * @ordered
	 */
	protected String preliminaryCode = PRELIMINARY_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreliminaryDateTime() <em>Preliminary Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreliminaryDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date PRELIMINARY_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreliminaryDateTime() <em>Preliminary Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreliminaryDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date preliminaryDateTime = PRELIMINARY_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalRemark() <em>Final Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalRemark()
	 * @generated
	 * @ordered
	 */
	protected static final String FINAL_REMARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinalRemark() <em>Final Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalRemark()
	 * @generated
	 * @ordered
	 */
	protected String finalRemark = FINAL_REMARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalOrigin() <em>Final Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final String FINAL_ORIGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinalOrigin() <em>Final Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalOrigin()
	 * @generated
	 * @ordered
	 */
	protected String finalOrigin = FINAL_ORIGIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosisDataSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.DIAGNOSIS_DATA_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseCode getPhaseCode() {
		return phaseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseCode(PhaseCode newPhaseCode) {
		PhaseCode oldPhaseCode = phaseCode;
		phaseCode = newPhaseCode == null ? PHASE_CODE_EDEFAULT : newPhaseCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DIAGNOSIS_DATA_SET__PHASE_CODE, oldPhaseCode, phaseCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFinalCode() {
		return finalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalCode(String newFinalCode) {
		String oldFinalCode = finalCode;
		finalCode = newFinalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_CODE, oldFinalCode, finalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(String newEffect) {
		String oldEffect = effect;
		effect = newEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DIAGNOSIS_DATA_SET__EFFECT, oldEffect, effect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFailureMode() {
		return failureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureMode(String newFailureMode) {
		String oldFailureMode = failureMode;
		failureMode = newFailureMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DIAGNOSIS_DATA_SET__FAILURE_MODE, oldFailureMode, failureMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRootOrigin() {
		return rootOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootOrigin(String newRootOrigin) {
		String oldRootOrigin = rootOrigin;
		rootOrigin = newRootOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_ORIGIN, oldRootOrigin, rootOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFinalCause() {
		return finalCause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalCause(String newFinalCause) {
		String oldFinalCause = finalCause;
		finalCause = newFinalCause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_CAUSE, oldFinalCause, finalCause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRootRemark() {
		return rootRemark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootRemark(String newRootRemark) {
		String oldRootRemark = rootRemark;
		rootRemark = newRootRemark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_REMARK, oldRootRemark, rootRemark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRootCause() {
		return rootCause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootCause(String newRootCause) {
		String oldRootCause = rootCause;
		rootCause = newRootCause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_CAUSE, oldRootCause, rootCause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreliminaryRemark() {
		return preliminaryRemark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreliminaryRemark(String newPreliminaryRemark) {
		String oldPreliminaryRemark = preliminaryRemark;
		preliminaryRemark = newPreliminaryRemark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_REMARK, oldPreliminaryRemark, preliminaryRemark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreliminaryCode() {
		return preliminaryCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreliminaryCode(String newPreliminaryCode) {
		String oldPreliminaryCode = preliminaryCode;
		preliminaryCode = newPreliminaryCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_CODE, oldPreliminaryCode, preliminaryCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPreliminaryDateTime() {
		return preliminaryDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreliminaryDateTime(Date newPreliminaryDateTime) {
		Date oldPreliminaryDateTime = preliminaryDateTime;
		preliminaryDateTime = newPreliminaryDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_DATE_TIME, oldPreliminaryDateTime, preliminaryDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFinalRemark() {
		return finalRemark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalRemark(String newFinalRemark) {
		String oldFinalRemark = finalRemark;
		finalRemark = newFinalRemark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_REMARK, oldFinalRemark, finalRemark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFinalOrigin() {
		return finalOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalOrigin(String newFinalOrigin) {
		String oldFinalOrigin = finalOrigin;
		finalOrigin = newFinalOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_ORIGIN, oldFinalOrigin, finalOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PHASE_CODE:
				return getPhaseCode();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_CODE:
				return getFinalCode();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__EFFECT:
				return getEffect();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FAILURE_MODE:
				return getFailureMode();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_ORIGIN:
				return getRootOrigin();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_CAUSE:
				return getFinalCause();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_REMARK:
				return getRootRemark();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_CAUSE:
				return getRootCause();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_REMARK:
				return getPreliminaryRemark();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_CODE:
				return getPreliminaryCode();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_DATE_TIME:
				return getPreliminaryDateTime();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_REMARK:
				return getFinalRemark();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_ORIGIN:
				return getFinalOrigin();
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
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PHASE_CODE:
				setPhaseCode((PhaseCode)newValue);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_CODE:
				setFinalCode((String)newValue);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__EFFECT:
				setEffect((String)newValue);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FAILURE_MODE:
				setFailureMode((String)newValue);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_ORIGIN:
				setRootOrigin((String)newValue);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_CAUSE:
				setFinalCause((String)newValue);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_REMARK:
				setRootRemark((String)newValue);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_CAUSE:
				setRootCause((String)newValue);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_REMARK:
				setPreliminaryRemark((String)newValue);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_CODE:
				setPreliminaryCode((String)newValue);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_DATE_TIME:
				setPreliminaryDateTime((Date)newValue);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_REMARK:
				setFinalRemark((String)newValue);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_ORIGIN:
				setFinalOrigin((String)newValue);
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
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PHASE_CODE:
				setPhaseCode(PHASE_CODE_EDEFAULT);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_CODE:
				setFinalCode(FINAL_CODE_EDEFAULT);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FAILURE_MODE:
				setFailureMode(FAILURE_MODE_EDEFAULT);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_ORIGIN:
				setRootOrigin(ROOT_ORIGIN_EDEFAULT);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_CAUSE:
				setFinalCause(FINAL_CAUSE_EDEFAULT);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_REMARK:
				setRootRemark(ROOT_REMARK_EDEFAULT);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_CAUSE:
				setRootCause(ROOT_CAUSE_EDEFAULT);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_REMARK:
				setPreliminaryRemark(PRELIMINARY_REMARK_EDEFAULT);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_CODE:
				setPreliminaryCode(PRELIMINARY_CODE_EDEFAULT);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_DATE_TIME:
				setPreliminaryDateTime(PRELIMINARY_DATE_TIME_EDEFAULT);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_REMARK:
				setFinalRemark(FINAL_REMARK_EDEFAULT);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_ORIGIN:
				setFinalOrigin(FINAL_ORIGIN_EDEFAULT);
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
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PHASE_CODE:
				return phaseCode != PHASE_CODE_EDEFAULT;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_CODE:
				return FINAL_CODE_EDEFAULT == null ? finalCode != null : !FINAL_CODE_EDEFAULT.equals(finalCode);
			case InfWorkPackage.DIAGNOSIS_DATA_SET__EFFECT:
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FAILURE_MODE:
				return FAILURE_MODE_EDEFAULT == null ? failureMode != null : !FAILURE_MODE_EDEFAULT.equals(failureMode);
			case InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_ORIGIN:
				return ROOT_ORIGIN_EDEFAULT == null ? rootOrigin != null : !ROOT_ORIGIN_EDEFAULT.equals(rootOrigin);
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_CAUSE:
				return FINAL_CAUSE_EDEFAULT == null ? finalCause != null : !FINAL_CAUSE_EDEFAULT.equals(finalCause);
			case InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_REMARK:
				return ROOT_REMARK_EDEFAULT == null ? rootRemark != null : !ROOT_REMARK_EDEFAULT.equals(rootRemark);
			case InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_CAUSE:
				return ROOT_CAUSE_EDEFAULT == null ? rootCause != null : !ROOT_CAUSE_EDEFAULT.equals(rootCause);
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_REMARK:
				return PRELIMINARY_REMARK_EDEFAULT == null ? preliminaryRemark != null : !PRELIMINARY_REMARK_EDEFAULT.equals(preliminaryRemark);
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_CODE:
				return PRELIMINARY_CODE_EDEFAULT == null ? preliminaryCode != null : !PRELIMINARY_CODE_EDEFAULT.equals(preliminaryCode);
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_DATE_TIME:
				return PRELIMINARY_DATE_TIME_EDEFAULT == null ? preliminaryDateTime != null : !PRELIMINARY_DATE_TIME_EDEFAULT.equals(preliminaryDateTime);
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_REMARK:
				return FINAL_REMARK_EDEFAULT == null ? finalRemark != null : !FINAL_REMARK_EDEFAULT.equals(finalRemark);
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_ORIGIN:
				return FINAL_ORIGIN_EDEFAULT == null ? finalOrigin != null : !FINAL_ORIGIN_EDEFAULT.equals(finalOrigin);
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
		result.append(" (phaseCode: ");
		result.append(phaseCode);
		result.append(", finalCode: ");
		result.append(finalCode);
		result.append(", effect: ");
		result.append(effect);
		result.append(", failureMode: ");
		result.append(failureMode);
		result.append(", rootOrigin: ");
		result.append(rootOrigin);
		result.append(", finalCause: ");
		result.append(finalCause);
		result.append(", rootRemark: ");
		result.append(rootRemark);
		result.append(", rootCause: ");
		result.append(rootCause);
		result.append(", preliminaryRemark: ");
		result.append(preliminaryRemark);
		result.append(", preliminaryCode: ");
		result.append(preliminaryCode);
		result.append(", preliminaryDateTime: ");
		result.append(preliminaryDateTime);
		result.append(", finalRemark: ");
		result.append(finalRemark);
		result.append(", finalOrigin: ");
		result.append(finalOrigin);
		result.append(')');
		return result.toString();
	}

} //DiagnosisDataSetImpl
