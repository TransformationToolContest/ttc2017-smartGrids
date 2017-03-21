/**
 */
package substationStandard.Dataclasses.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import substationStandard.Dataclasses.DataclassesPackage;
import substationStandard.Dataclasses.DetailQual;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Detail Qual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.impl.DetailQualImpl#isOverflow <em>Overflow</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.DetailQualImpl#isOutOfRange <em>Out Of Range</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.DetailQualImpl#isBadReference <em>Bad Reference</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.DetailQualImpl#isOscillatory <em>Oscillatory</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.DetailQualImpl#isFailure <em>Failure</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.DetailQualImpl#isOldData <em>Old Data</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.DetailQualImpl#isInconsistent <em>Inconsistent</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.DetailQualImpl#isInaccurate <em>Inaccurate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DetailQualImpl extends MinimalEObjectImpl.Container implements DetailQual {
	/**
	 * The default value of the '{@link #isOverflow() <em>Overflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverflow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVERFLOW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOverflow() <em>Overflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverflow()
	 * @generated
	 * @ordered
	 */
	protected boolean overflow = OVERFLOW_EDEFAULT;

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
	 * The default value of the '{@link #isInconsistent() <em>Inconsistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInconsistent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCONSISTENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInconsistent() <em>Inconsistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInconsistent()
	 * @generated
	 * @ordered
	 */
	protected boolean inconsistent = INCONSISTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isInaccurate() <em>Inaccurate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInaccurate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INACCURATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInaccurate() <em>Inaccurate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInaccurate()
	 * @generated
	 * @ordered
	 */
	protected boolean inaccurate = INACCURATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetailQualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.DETAIL_QUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOverflow() {
		return overflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverflow(boolean newOverflow) {
		boolean oldOverflow = overflow;
		overflow = newOverflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.DETAIL_QUAL__OVERFLOW, oldOverflow, overflow));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.DETAIL_QUAL__OUT_OF_RANGE, oldOutOfRange, outOfRange));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.DETAIL_QUAL__BAD_REFERENCE, oldBadReference, badReference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.DETAIL_QUAL__OSCILLATORY, oldOscillatory, oscillatory));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.DETAIL_QUAL__FAILURE, oldFailure, failure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.DETAIL_QUAL__OLD_DATA, oldOldData, oldData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInconsistent() {
		return inconsistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInconsistent(boolean newInconsistent) {
		boolean oldInconsistent = inconsistent;
		inconsistent = newInconsistent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.DETAIL_QUAL__INCONSISTENT, oldInconsistent, inconsistent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInaccurate() {
		return inaccurate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInaccurate(boolean newInaccurate) {
		boolean oldInaccurate = inaccurate;
		inaccurate = newInaccurate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.DETAIL_QUAL__INACCURATE, oldInaccurate, inaccurate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.DETAIL_QUAL__OVERFLOW:
				return isOverflow();
			case DataclassesPackage.DETAIL_QUAL__OUT_OF_RANGE:
				return isOutOfRange();
			case DataclassesPackage.DETAIL_QUAL__BAD_REFERENCE:
				return isBadReference();
			case DataclassesPackage.DETAIL_QUAL__OSCILLATORY:
				return isOscillatory();
			case DataclassesPackage.DETAIL_QUAL__FAILURE:
				return isFailure();
			case DataclassesPackage.DETAIL_QUAL__OLD_DATA:
				return isOldData();
			case DataclassesPackage.DETAIL_QUAL__INCONSISTENT:
				return isInconsistent();
			case DataclassesPackage.DETAIL_QUAL__INACCURATE:
				return isInaccurate();
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
			case DataclassesPackage.DETAIL_QUAL__OVERFLOW:
				setOverflow((Boolean)newValue);
				return;
			case DataclassesPackage.DETAIL_QUAL__OUT_OF_RANGE:
				setOutOfRange((Boolean)newValue);
				return;
			case DataclassesPackage.DETAIL_QUAL__BAD_REFERENCE:
				setBadReference((Boolean)newValue);
				return;
			case DataclassesPackage.DETAIL_QUAL__OSCILLATORY:
				setOscillatory((Boolean)newValue);
				return;
			case DataclassesPackage.DETAIL_QUAL__FAILURE:
				setFailure((Boolean)newValue);
				return;
			case DataclassesPackage.DETAIL_QUAL__OLD_DATA:
				setOldData((Boolean)newValue);
				return;
			case DataclassesPackage.DETAIL_QUAL__INCONSISTENT:
				setInconsistent((Boolean)newValue);
				return;
			case DataclassesPackage.DETAIL_QUAL__INACCURATE:
				setInaccurate((Boolean)newValue);
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
			case DataclassesPackage.DETAIL_QUAL__OVERFLOW:
				setOverflow(OVERFLOW_EDEFAULT);
				return;
			case DataclassesPackage.DETAIL_QUAL__OUT_OF_RANGE:
				setOutOfRange(OUT_OF_RANGE_EDEFAULT);
				return;
			case DataclassesPackage.DETAIL_QUAL__BAD_REFERENCE:
				setBadReference(BAD_REFERENCE_EDEFAULT);
				return;
			case DataclassesPackage.DETAIL_QUAL__OSCILLATORY:
				setOscillatory(OSCILLATORY_EDEFAULT);
				return;
			case DataclassesPackage.DETAIL_QUAL__FAILURE:
				setFailure(FAILURE_EDEFAULT);
				return;
			case DataclassesPackage.DETAIL_QUAL__OLD_DATA:
				setOldData(OLD_DATA_EDEFAULT);
				return;
			case DataclassesPackage.DETAIL_QUAL__INCONSISTENT:
				setInconsistent(INCONSISTENT_EDEFAULT);
				return;
			case DataclassesPackage.DETAIL_QUAL__INACCURATE:
				setInaccurate(INACCURATE_EDEFAULT);
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
			case DataclassesPackage.DETAIL_QUAL__OVERFLOW:
				return overflow != OVERFLOW_EDEFAULT;
			case DataclassesPackage.DETAIL_QUAL__OUT_OF_RANGE:
				return outOfRange != OUT_OF_RANGE_EDEFAULT;
			case DataclassesPackage.DETAIL_QUAL__BAD_REFERENCE:
				return badReference != BAD_REFERENCE_EDEFAULT;
			case DataclassesPackage.DETAIL_QUAL__OSCILLATORY:
				return oscillatory != OSCILLATORY_EDEFAULT;
			case DataclassesPackage.DETAIL_QUAL__FAILURE:
				return failure != FAILURE_EDEFAULT;
			case DataclassesPackage.DETAIL_QUAL__OLD_DATA:
				return oldData != OLD_DATA_EDEFAULT;
			case DataclassesPackage.DETAIL_QUAL__INCONSISTENT:
				return inconsistent != INCONSISTENT_EDEFAULT;
			case DataclassesPackage.DETAIL_QUAL__INACCURATE:
				return inaccurate != INACCURATE_EDEFAULT;
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
		result.append(" (overflow: ");
		result.append(overflow);
		result.append(", outOfRange: ");
		result.append(outOfRange);
		result.append(", badReference: ");
		result.append(badReference);
		result.append(", oscillatory: ");
		result.append(oscillatory);
		result.append(", failure: ");
		result.append(failure);
		result.append(", oldData: ");
		result.append(oldData);
		result.append(", inconsistent: ");
		result.append(inconsistent);
		result.append(", inaccurate: ");
		result.append(inaccurate);
		result.append(')');
		return result.toString();
	}

} //DetailQualImpl
