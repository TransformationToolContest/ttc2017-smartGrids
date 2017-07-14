/**
 */
package gluemodel.COSEM.COSEMObjects.impl;

import gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage;
import gluemodel.COSEM.COSEMObjects.MeasurementPeriod_recordingInterval_billingPeriodDuration;

import gluemodel.COSEM.InterfaceClasses.impl.DataImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Period recording Interval billing Period Duration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeasurementPeriod_recordingInterval_billingPeriodDurationImpl#getMeasurement_period_1_for_averaging_scheme_1 <em>Measurement period 1for averaging scheme 1</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeasurementPeriod_recordingInterval_billingPeriodDurationImpl#getMeasurement_period_2_for_averagingscheme_2 <em>Measurement period 2for averagingscheme 2</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeasurementPeriod_recordingInterval_billingPeriodDurationImpl#getMeasurement_period_3_for_instantaneous_value <em>Measurement period 3for instantaneous value</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeasurementPeriod_recordingInterval_billingPeriodDurationImpl#getMeasurement_period_4_for_test_value <em>Measurement period 4for test value</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeasurementPeriod_recordingInterval_billingPeriodDurationImpl#getRecording_interval_1_for_loadprofile <em>Recording interval 1for loadprofile</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeasurementPeriod_recordingInterval_billingPeriodDurationImpl#getRecording_interval_2_for_loadprofile <em>Recording interval 2for loadprofile</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeasurementPeriod_recordingInterval_billingPeriodDurationImpl#getBillingperiod <em>Billingperiod</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementPeriod_recordingInterval_billingPeriodDurationImpl extends DataImpl implements MeasurementPeriod_recordingInterval_billingPeriodDuration {
	/**
	 * The default value of the '{@link #getMeasurement_period_1_for_averaging_scheme_1() <em>Measurement period 1for averaging scheme 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurement_period_1_for_averaging_scheme_1()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASUREMENT_PERIOD_1FOR_AVERAGING_SCHEME_1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasurement_period_1_for_averaging_scheme_1() <em>Measurement period 1for averaging scheme 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurement_period_1_for_averaging_scheme_1()
	 * @generated
	 * @ordered
	 */
	protected String measurement_period_1_for_averaging_scheme_1 = MEASUREMENT_PERIOD_1FOR_AVERAGING_SCHEME_1_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasurement_period_2_for_averagingscheme_2() <em>Measurement period 2for averagingscheme 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurement_period_2_for_averagingscheme_2()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASUREMENT_PERIOD_2FOR_AVERAGINGSCHEME_2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasurement_period_2_for_averagingscheme_2() <em>Measurement period 2for averagingscheme 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurement_period_2_for_averagingscheme_2()
	 * @generated
	 * @ordered
	 */
	protected String measurement_period_2_for_averagingscheme_2 = MEASUREMENT_PERIOD_2FOR_AVERAGINGSCHEME_2_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasurement_period_3_for_instantaneous_value() <em>Measurement period 3for instantaneous value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurement_period_3_for_instantaneous_value()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASUREMENT_PERIOD_3FOR_INSTANTANEOUS_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasurement_period_3_for_instantaneous_value() <em>Measurement period 3for instantaneous value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurement_period_3_for_instantaneous_value()
	 * @generated
	 * @ordered
	 */
	protected String measurement_period_3_for_instantaneous_value = MEASUREMENT_PERIOD_3FOR_INSTANTANEOUS_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasurement_period_4_for_test_value() <em>Measurement period 4for test value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurement_period_4_for_test_value()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASUREMENT_PERIOD_4FOR_TEST_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasurement_period_4_for_test_value() <em>Measurement period 4for test value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurement_period_4_for_test_value()
	 * @generated
	 * @ordered
	 */
	protected String measurement_period_4_for_test_value = MEASUREMENT_PERIOD_4FOR_TEST_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecording_interval_1_for_loadprofile() <em>Recording interval 1for loadprofile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecording_interval_1_for_loadprofile()
	 * @generated
	 * @ordered
	 */
	protected static final String RECORDING_INTERVAL_1FOR_LOADPROFILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecording_interval_1_for_loadprofile() <em>Recording interval 1for loadprofile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecording_interval_1_for_loadprofile()
	 * @generated
	 * @ordered
	 */
	protected String recording_interval_1_for_loadprofile = RECORDING_INTERVAL_1FOR_LOADPROFILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecording_interval_2_for_loadprofile() <em>Recording interval 2for loadprofile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecording_interval_2_for_loadprofile()
	 * @generated
	 * @ordered
	 */
	protected static final String RECORDING_INTERVAL_2FOR_LOADPROFILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecording_interval_2_for_loadprofile() <em>Recording interval 2for loadprofile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecording_interval_2_for_loadprofile()
	 * @generated
	 * @ordered
	 */
	protected String recording_interval_2_for_loadprofile = RECORDING_INTERVAL_2FOR_LOADPROFILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBillingperiod() <em>Billingperiod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingperiod()
	 * @generated
	 * @ordered
	 */
	protected static final String BILLINGPERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBillingperiod() <em>Billingperiod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingperiod()
	 * @generated
	 * @ordered
	 */
	protected String billingperiod = BILLINGPERIOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementPeriod_recordingInterval_billingPeriodDurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getMeasurementPeriod_recordingInterval_billingPeriodDuration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasurement_period_1_for_averaging_scheme_1() {
		return measurement_period_1_for_averaging_scheme_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurement_period_1_for_averaging_scheme_1(String newMeasurement_period_1_for_averaging_scheme_1) {
		String oldMeasurement_period_1_for_averaging_scheme_1 = measurement_period_1_for_averaging_scheme_1;
		measurement_period_1_for_averaging_scheme_1 = newMeasurement_period_1_for_averaging_scheme_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__MEASUREMENT_PERIOD_1FOR_AVERAGING_SCHEME_1, oldMeasurement_period_1_for_averaging_scheme_1, measurement_period_1_for_averaging_scheme_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasurement_period_2_for_averagingscheme_2() {
		return measurement_period_2_for_averagingscheme_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurement_period_2_for_averagingscheme_2(String newMeasurement_period_2_for_averagingscheme_2) {
		String oldMeasurement_period_2_for_averagingscheme_2 = measurement_period_2_for_averagingscheme_2;
		measurement_period_2_for_averagingscheme_2 = newMeasurement_period_2_for_averagingscheme_2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__MEASUREMENT_PERIOD_2FOR_AVERAGINGSCHEME_2, oldMeasurement_period_2_for_averagingscheme_2, measurement_period_2_for_averagingscheme_2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasurement_period_3_for_instantaneous_value() {
		return measurement_period_3_for_instantaneous_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurement_period_3_for_instantaneous_value(String newMeasurement_period_3_for_instantaneous_value) {
		String oldMeasurement_period_3_for_instantaneous_value = measurement_period_3_for_instantaneous_value;
		measurement_period_3_for_instantaneous_value = newMeasurement_period_3_for_instantaneous_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__MEASUREMENT_PERIOD_3FOR_INSTANTANEOUS_VALUE, oldMeasurement_period_3_for_instantaneous_value, measurement_period_3_for_instantaneous_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasurement_period_4_for_test_value() {
		return measurement_period_4_for_test_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurement_period_4_for_test_value(String newMeasurement_period_4_for_test_value) {
		String oldMeasurement_period_4_for_test_value = measurement_period_4_for_test_value;
		measurement_period_4_for_test_value = newMeasurement_period_4_for_test_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__MEASUREMENT_PERIOD_4FOR_TEST_VALUE, oldMeasurement_period_4_for_test_value, measurement_period_4_for_test_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecording_interval_1_for_loadprofile() {
		return recording_interval_1_for_loadprofile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecording_interval_1_for_loadprofile(String newRecording_interval_1_for_loadprofile) {
		String oldRecording_interval_1_for_loadprofile = recording_interval_1_for_loadprofile;
		recording_interval_1_for_loadprofile = newRecording_interval_1_for_loadprofile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__RECORDING_INTERVAL_1FOR_LOADPROFILE, oldRecording_interval_1_for_loadprofile, recording_interval_1_for_loadprofile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecording_interval_2_for_loadprofile() {
		return recording_interval_2_for_loadprofile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecording_interval_2_for_loadprofile(String newRecording_interval_2_for_loadprofile) {
		String oldRecording_interval_2_for_loadprofile = recording_interval_2_for_loadprofile;
		recording_interval_2_for_loadprofile = newRecording_interval_2_for_loadprofile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__RECORDING_INTERVAL_2FOR_LOADPROFILE, oldRecording_interval_2_for_loadprofile, recording_interval_2_for_loadprofile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBillingperiod() {
		return billingperiod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillingperiod(String newBillingperiod) {
		String oldBillingperiod = billingperiod;
		billingperiod = newBillingperiod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__BILLINGPERIOD, oldBillingperiod, billingperiod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__MEASUREMENT_PERIOD_1FOR_AVERAGING_SCHEME_1:
				return getMeasurement_period_1_for_averaging_scheme_1();
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__MEASUREMENT_PERIOD_2FOR_AVERAGINGSCHEME_2:
				return getMeasurement_period_2_for_averagingscheme_2();
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__MEASUREMENT_PERIOD_3FOR_INSTANTANEOUS_VALUE:
				return getMeasurement_period_3_for_instantaneous_value();
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__MEASUREMENT_PERIOD_4FOR_TEST_VALUE:
				return getMeasurement_period_4_for_test_value();
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__RECORDING_INTERVAL_1FOR_LOADPROFILE:
				return getRecording_interval_1_for_loadprofile();
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__RECORDING_INTERVAL_2FOR_LOADPROFILE:
				return getRecording_interval_2_for_loadprofile();
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__BILLINGPERIOD:
				return getBillingperiod();
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
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__MEASUREMENT_PERIOD_1FOR_AVERAGING_SCHEME_1:
				setMeasurement_period_1_for_averaging_scheme_1((String)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__MEASUREMENT_PERIOD_2FOR_AVERAGINGSCHEME_2:
				setMeasurement_period_2_for_averagingscheme_2((String)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__MEASUREMENT_PERIOD_3FOR_INSTANTANEOUS_VALUE:
				setMeasurement_period_3_for_instantaneous_value((String)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__MEASUREMENT_PERIOD_4FOR_TEST_VALUE:
				setMeasurement_period_4_for_test_value((String)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__RECORDING_INTERVAL_1FOR_LOADPROFILE:
				setRecording_interval_1_for_loadprofile((String)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__RECORDING_INTERVAL_2FOR_LOADPROFILE:
				setRecording_interval_2_for_loadprofile((String)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__BILLINGPERIOD:
				setBillingperiod((String)newValue);
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
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__MEASUREMENT_PERIOD_1FOR_AVERAGING_SCHEME_1:
				setMeasurement_period_1_for_averaging_scheme_1(MEASUREMENT_PERIOD_1FOR_AVERAGING_SCHEME_1_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__MEASUREMENT_PERIOD_2FOR_AVERAGINGSCHEME_2:
				setMeasurement_period_2_for_averagingscheme_2(MEASUREMENT_PERIOD_2FOR_AVERAGINGSCHEME_2_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__MEASUREMENT_PERIOD_3FOR_INSTANTANEOUS_VALUE:
				setMeasurement_period_3_for_instantaneous_value(MEASUREMENT_PERIOD_3FOR_INSTANTANEOUS_VALUE_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__MEASUREMENT_PERIOD_4FOR_TEST_VALUE:
				setMeasurement_period_4_for_test_value(MEASUREMENT_PERIOD_4FOR_TEST_VALUE_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__RECORDING_INTERVAL_1FOR_LOADPROFILE:
				setRecording_interval_1_for_loadprofile(RECORDING_INTERVAL_1FOR_LOADPROFILE_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__RECORDING_INTERVAL_2FOR_LOADPROFILE:
				setRecording_interval_2_for_loadprofile(RECORDING_INTERVAL_2FOR_LOADPROFILE_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__BILLINGPERIOD:
				setBillingperiod(BILLINGPERIOD_EDEFAULT);
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
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__MEASUREMENT_PERIOD_1FOR_AVERAGING_SCHEME_1:
				return MEASUREMENT_PERIOD_1FOR_AVERAGING_SCHEME_1_EDEFAULT == null ? measurement_period_1_for_averaging_scheme_1 != null : !MEASUREMENT_PERIOD_1FOR_AVERAGING_SCHEME_1_EDEFAULT.equals(measurement_period_1_for_averaging_scheme_1);
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__MEASUREMENT_PERIOD_2FOR_AVERAGINGSCHEME_2:
				return MEASUREMENT_PERIOD_2FOR_AVERAGINGSCHEME_2_EDEFAULT == null ? measurement_period_2_for_averagingscheme_2 != null : !MEASUREMENT_PERIOD_2FOR_AVERAGINGSCHEME_2_EDEFAULT.equals(measurement_period_2_for_averagingscheme_2);
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__MEASUREMENT_PERIOD_3FOR_INSTANTANEOUS_VALUE:
				return MEASUREMENT_PERIOD_3FOR_INSTANTANEOUS_VALUE_EDEFAULT == null ? measurement_period_3_for_instantaneous_value != null : !MEASUREMENT_PERIOD_3FOR_INSTANTANEOUS_VALUE_EDEFAULT.equals(measurement_period_3_for_instantaneous_value);
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__MEASUREMENT_PERIOD_4FOR_TEST_VALUE:
				return MEASUREMENT_PERIOD_4FOR_TEST_VALUE_EDEFAULT == null ? measurement_period_4_for_test_value != null : !MEASUREMENT_PERIOD_4FOR_TEST_VALUE_EDEFAULT.equals(measurement_period_4_for_test_value);
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__RECORDING_INTERVAL_1FOR_LOADPROFILE:
				return RECORDING_INTERVAL_1FOR_LOADPROFILE_EDEFAULT == null ? recording_interval_1_for_loadprofile != null : !RECORDING_INTERVAL_1FOR_LOADPROFILE_EDEFAULT.equals(recording_interval_1_for_loadprofile);
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__RECORDING_INTERVAL_2FOR_LOADPROFILE:
				return RECORDING_INTERVAL_2FOR_LOADPROFILE_EDEFAULT == null ? recording_interval_2_for_loadprofile != null : !RECORDING_INTERVAL_2FOR_LOADPROFILE_EDEFAULT.equals(recording_interval_2_for_loadprofile);
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__BILLINGPERIOD:
				return BILLINGPERIOD_EDEFAULT == null ? billingperiod != null : !BILLINGPERIOD_EDEFAULT.equals(billingperiod);
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
		result.append(" (Measurement_period_1_for_averaging_scheme_1: ");
		result.append(measurement_period_1_for_averaging_scheme_1);
		result.append(", Measurement_period_2_for_averagingscheme_2: ");
		result.append(measurement_period_2_for_averagingscheme_2);
		result.append(", Measurement_period_3_for_instantaneous_value: ");
		result.append(measurement_period_3_for_instantaneous_value);
		result.append(", Measurement_period_4_for_test_value: ");
		result.append(measurement_period_4_for_test_value);
		result.append(", Recording_interval_1_for_loadprofile: ");
		result.append(recording_interval_1_for_loadprofile);
		result.append(", Recording_interval_2_for_loadprofile: ");
		result.append(recording_interval_2_for_loadprofile);
		result.append(", Billingperiod: ");
		result.append(billingperiod);
		result.append(')');
		return result.toString();
	}

} //MeasurementPeriod_recordingInterval_billingPeriodDurationImpl
