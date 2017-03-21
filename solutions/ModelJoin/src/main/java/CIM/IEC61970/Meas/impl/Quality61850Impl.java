/**
 */
package CIM.IEC61970.Meas.impl;

import CIM.IEC61970.Meas.MeasPackage;
import CIM.IEC61970.Meas.Quality61850;
import CIM.IEC61970.Meas.Validity;

import CIM.IEC61970.SCADA.Source;

import CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality61850</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Meas.impl.Quality61850Impl#isSuspect <em>Suspect</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.Quality61850Impl#isEstimatorReplaced <em>Estimator Replaced</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.Quality61850Impl#getValidity <em>Validity</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.Quality61850Impl#isBadReference <em>Bad Reference</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.Quality61850Impl#isOldData <em>Old Data</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.Quality61850Impl#isFailure <em>Failure</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.Quality61850Impl#isOverFlow <em>Over Flow</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.Quality61850Impl#getSource <em>Source</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.Quality61850Impl#isOperatorBlocked <em>Operator Blocked</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.Quality61850Impl#isTest <em>Test</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.Quality61850Impl#isOscillatory <em>Oscillatory</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.Quality61850Impl#isOutOfRange <em>Out Of Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Quality61850Impl extends ElementImpl implements Quality61850 {
	/**
	 * The default value of the '{@link #isSuspect() <em>Suspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuspect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUSPECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSuspect() <em>Suspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuspect()
	 * @generated
	 * @ordered
	 */
	protected boolean suspect = SUSPECT_EDEFAULT;

	/**
	 * The default value of the '{@link #isEstimatorReplaced() <em>Estimator Replaced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEstimatorReplaced()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ESTIMATOR_REPLACED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEstimatorReplaced() <em>Estimator Replaced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEstimatorReplaced()
	 * @generated
	 * @ordered
	 */
	protected boolean estimatorReplaced = ESTIMATOR_REPLACED_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidity() <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidity()
	 * @generated
	 * @ordered
	 */
	protected static final Validity VALIDITY_EDEFAULT = Validity.INVALID;

	/**
	 * The cached value of the '{@link #getValidity() <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidity()
	 * @generated
	 * @ordered
	 */
	protected Validity validity = VALIDITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isBadReference() <em>Bad Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBadReference()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BAD_REFERENCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBadReference() <em>Bad Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBadReference()
	 * @generated
	 * @ordered
	 */
	protected boolean badReference = BAD_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOldData() <em>Old Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOldData()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OLD_DATA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOldData() <em>Old Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOldData()
	 * @generated
	 * @ordered
	 */
	protected boolean oldData = OLD_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #isFailure() <em>Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFailure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FAILURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFailure() <em>Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFailure()
	 * @generated
	 * @ordered
	 */
	protected boolean failure = FAILURE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOverFlow() <em>Over Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverFlow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVER_FLOW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOverFlow() <em>Over Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverFlow()
	 * @generated
	 * @ordered
	 */
	protected boolean overFlow = OVER_FLOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final Source SOURCE_EDEFAULT = Source.PROCESS;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Source source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOperatorBlocked() <em>Operator Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOperatorBlocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPERATOR_BLOCKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOperatorBlocked() <em>Operator Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOperatorBlocked()
	 * @generated
	 * @ordered
	 */
	protected boolean operatorBlocked = OPERATOR_BLOCKED_EDEFAULT;

	/**
	 * The default value of the '{@link #isTest() <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTest()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTest() <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTest()
	 * @generated
	 * @ordered
	 */
	protected boolean test = TEST_EDEFAULT;

	/**
	 * The default value of the '{@link #isOscillatory() <em>Oscillatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOscillatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OSCILLATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOscillatory() <em>Oscillatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOscillatory()
	 * @generated
	 * @ordered
	 */
	protected boolean oscillatory = OSCILLATORY_EDEFAULT;

	/**
	 * The default value of the '{@link #isOutOfRange() <em>Out Of Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutOfRange()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUT_OF_RANGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOutOfRange() <em>Out Of Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutOfRange()
	 * @generated
	 * @ordered
	 */
	protected boolean outOfRange = OUT_OF_RANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Quality61850Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.QUALITY61850;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSuspect() {
		return suspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuspect(boolean newSuspect) {
		boolean oldSuspect = suspect;
		suspect = newSuspect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.QUALITY61850__SUSPECT, oldSuspect, suspect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEstimatorReplaced() {
		return estimatorReplaced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatorReplaced(boolean newEstimatorReplaced) {
		boolean oldEstimatorReplaced = estimatorReplaced;
		estimatorReplaced = newEstimatorReplaced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.QUALITY61850__ESTIMATOR_REPLACED, oldEstimatorReplaced, estimatorReplaced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Validity getValidity() {
		return validity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidity(Validity newValidity) {
		Validity oldValidity = validity;
		validity = newValidity == null ? VALIDITY_EDEFAULT : newValidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.QUALITY61850__VALIDITY, oldValidity, validity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBadReference() {
		return badReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBadReference(boolean newBadReference) {
		boolean oldBadReference = badReference;
		badReference = newBadReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.QUALITY61850__BAD_REFERENCE, oldBadReference, badReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOldData() {
		return oldData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldData(boolean newOldData) {
		boolean oldOldData = oldData;
		oldData = newOldData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.QUALITY61850__OLD_DATA, oldOldData, oldData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFailure() {
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailure(boolean newFailure) {
		boolean oldFailure = failure;
		failure = newFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.QUALITY61850__FAILURE, oldFailure, failure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOverFlow() {
		return overFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverFlow(boolean newOverFlow) {
		boolean oldOverFlow = overFlow;
		overFlow = newOverFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.QUALITY61850__OVER_FLOW, oldOverFlow, overFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Source newSource) {
		Source oldSource = source;
		source = newSource == null ? SOURCE_EDEFAULT : newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.QUALITY61850__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOperatorBlocked() {
		return operatorBlocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatorBlocked(boolean newOperatorBlocked) {
		boolean oldOperatorBlocked = operatorBlocked;
		operatorBlocked = newOperatorBlocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.QUALITY61850__OPERATOR_BLOCKED, oldOperatorBlocked, operatorBlocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTest() {
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTest(boolean newTest) {
		boolean oldTest = test;
		test = newTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.QUALITY61850__TEST, oldTest, test));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOscillatory() {
		return oscillatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOscillatory(boolean newOscillatory) {
		boolean oldOscillatory = oscillatory;
		oscillatory = newOscillatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.QUALITY61850__OSCILLATORY, oldOscillatory, oscillatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOutOfRange() {
		return outOfRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutOfRange(boolean newOutOfRange) {
		boolean oldOutOfRange = outOfRange;
		outOfRange = newOutOfRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.QUALITY61850__OUT_OF_RANGE, oldOutOfRange, outOfRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeasPackage.QUALITY61850__SUSPECT:
				return isSuspect();
			case MeasPackage.QUALITY61850__ESTIMATOR_REPLACED:
				return isEstimatorReplaced();
			case MeasPackage.QUALITY61850__VALIDITY:
				return getValidity();
			case MeasPackage.QUALITY61850__BAD_REFERENCE:
				return isBadReference();
			case MeasPackage.QUALITY61850__OLD_DATA:
				return isOldData();
			case MeasPackage.QUALITY61850__FAILURE:
				return isFailure();
			case MeasPackage.QUALITY61850__OVER_FLOW:
				return isOverFlow();
			case MeasPackage.QUALITY61850__SOURCE:
				return getSource();
			case MeasPackage.QUALITY61850__OPERATOR_BLOCKED:
				return isOperatorBlocked();
			case MeasPackage.QUALITY61850__TEST:
				return isTest();
			case MeasPackage.QUALITY61850__OSCILLATORY:
				return isOscillatory();
			case MeasPackage.QUALITY61850__OUT_OF_RANGE:
				return isOutOfRange();
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
			case MeasPackage.QUALITY61850__SUSPECT:
				setSuspect((Boolean)newValue);
				return;
			case MeasPackage.QUALITY61850__ESTIMATOR_REPLACED:
				setEstimatorReplaced((Boolean)newValue);
				return;
			case MeasPackage.QUALITY61850__VALIDITY:
				setValidity((Validity)newValue);
				return;
			case MeasPackage.QUALITY61850__BAD_REFERENCE:
				setBadReference((Boolean)newValue);
				return;
			case MeasPackage.QUALITY61850__OLD_DATA:
				setOldData((Boolean)newValue);
				return;
			case MeasPackage.QUALITY61850__FAILURE:
				setFailure((Boolean)newValue);
				return;
			case MeasPackage.QUALITY61850__OVER_FLOW:
				setOverFlow((Boolean)newValue);
				return;
			case MeasPackage.QUALITY61850__SOURCE:
				setSource((Source)newValue);
				return;
			case MeasPackage.QUALITY61850__OPERATOR_BLOCKED:
				setOperatorBlocked((Boolean)newValue);
				return;
			case MeasPackage.QUALITY61850__TEST:
				setTest((Boolean)newValue);
				return;
			case MeasPackage.QUALITY61850__OSCILLATORY:
				setOscillatory((Boolean)newValue);
				return;
			case MeasPackage.QUALITY61850__OUT_OF_RANGE:
				setOutOfRange((Boolean)newValue);
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
			case MeasPackage.QUALITY61850__SUSPECT:
				setSuspect(SUSPECT_EDEFAULT);
				return;
			case MeasPackage.QUALITY61850__ESTIMATOR_REPLACED:
				setEstimatorReplaced(ESTIMATOR_REPLACED_EDEFAULT);
				return;
			case MeasPackage.QUALITY61850__VALIDITY:
				setValidity(VALIDITY_EDEFAULT);
				return;
			case MeasPackage.QUALITY61850__BAD_REFERENCE:
				setBadReference(BAD_REFERENCE_EDEFAULT);
				return;
			case MeasPackage.QUALITY61850__OLD_DATA:
				setOldData(OLD_DATA_EDEFAULT);
				return;
			case MeasPackage.QUALITY61850__FAILURE:
				setFailure(FAILURE_EDEFAULT);
				return;
			case MeasPackage.QUALITY61850__OVER_FLOW:
				setOverFlow(OVER_FLOW_EDEFAULT);
				return;
			case MeasPackage.QUALITY61850__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case MeasPackage.QUALITY61850__OPERATOR_BLOCKED:
				setOperatorBlocked(OPERATOR_BLOCKED_EDEFAULT);
				return;
			case MeasPackage.QUALITY61850__TEST:
				setTest(TEST_EDEFAULT);
				return;
			case MeasPackage.QUALITY61850__OSCILLATORY:
				setOscillatory(OSCILLATORY_EDEFAULT);
				return;
			case MeasPackage.QUALITY61850__OUT_OF_RANGE:
				setOutOfRange(OUT_OF_RANGE_EDEFAULT);
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
			case MeasPackage.QUALITY61850__SUSPECT:
				return suspect != SUSPECT_EDEFAULT;
			case MeasPackage.QUALITY61850__ESTIMATOR_REPLACED:
				return estimatorReplaced != ESTIMATOR_REPLACED_EDEFAULT;
			case MeasPackage.QUALITY61850__VALIDITY:
				return validity != VALIDITY_EDEFAULT;
			case MeasPackage.QUALITY61850__BAD_REFERENCE:
				return badReference != BAD_REFERENCE_EDEFAULT;
			case MeasPackage.QUALITY61850__OLD_DATA:
				return oldData != OLD_DATA_EDEFAULT;
			case MeasPackage.QUALITY61850__FAILURE:
				return failure != FAILURE_EDEFAULT;
			case MeasPackage.QUALITY61850__OVER_FLOW:
				return overFlow != OVER_FLOW_EDEFAULT;
			case MeasPackage.QUALITY61850__SOURCE:
				return source != SOURCE_EDEFAULT;
			case MeasPackage.QUALITY61850__OPERATOR_BLOCKED:
				return operatorBlocked != OPERATOR_BLOCKED_EDEFAULT;
			case MeasPackage.QUALITY61850__TEST:
				return test != TEST_EDEFAULT;
			case MeasPackage.QUALITY61850__OSCILLATORY:
				return oscillatory != OSCILLATORY_EDEFAULT;
			case MeasPackage.QUALITY61850__OUT_OF_RANGE:
				return outOfRange != OUT_OF_RANGE_EDEFAULT;
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
		result.append(" (suspect: ");
		result.append(suspect);
		result.append(", estimatorReplaced: ");
		result.append(estimatorReplaced);
		result.append(", validity: ");
		result.append(validity);
		result.append(", badReference: ");
		result.append(badReference);
		result.append(", oldData: ");
		result.append(oldData);
		result.append(", failure: ");
		result.append(failure);
		result.append(", overFlow: ");
		result.append(overFlow);
		result.append(", source: ");
		result.append(source);
		result.append(", operatorBlocked: ");
		result.append(operatorBlocked);
		result.append(", test: ");
		result.append(test);
		result.append(", oscillatory: ");
		result.append(oscillatory);
		result.append(", outOfRange: ");
		result.append(outOfRange);
		result.append(')');
		return result.toString();
	}

} //Quality61850Impl
