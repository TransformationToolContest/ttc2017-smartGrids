/**
 */
package gluemodel.CIM.IEC61968.Metering.impl;

import gluemodel.CIM.IEC61968.Metering.IntervalBlock;
import gluemodel.CIM.IEC61968.Metering.IntervalReading;
import gluemodel.CIM.IEC61968.Metering.MeteringPackage;
import gluemodel.CIM.IEC61968.Metering.ReadingQuality;

import gluemodel.CIM.IEC61970.Meas.impl.MeasurementValueImpl;

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
 * An implementation of the model object '<em><b>Interval Reading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.IntervalReadingImpl#getValue <em>Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.IntervalReadingImpl#getReadingQualities <em>Reading Qualities</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.IntervalReadingImpl#getIntervalBlocks <em>Interval Blocks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntervalReadingImpl extends MeasurementValueImpl implements IntervalReading {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected float value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReadingQualities() <em>Reading Qualities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingQualities()
	 * @generated
	 * @ordered
	 */
	protected EList<ReadingQuality> readingQualities;

	/**
	 * The cached value of the '{@link #getIntervalBlocks() <em>Interval Blocks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<IntervalBlock> intervalBlocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervalReadingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.INTERVAL_READING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(float newValue) {
		float oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.INTERVAL_READING__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReadingQuality> getReadingQualities() {
		if (readingQualities == null) {
			readingQualities = new EObjectWithInverseResolvingEList<ReadingQuality>(ReadingQuality.class, this, MeteringPackage.INTERVAL_READING__READING_QUALITIES, MeteringPackage.READING_QUALITY__INTERVAL_READING);
		}
		return readingQualities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntervalBlock> getIntervalBlocks() {
		if (intervalBlocks == null) {
			intervalBlocks = new EObjectWithInverseResolvingEList.ManyInverse<IntervalBlock>(IntervalBlock.class, this, MeteringPackage.INTERVAL_READING__INTERVAL_BLOCKS, MeteringPackage.INTERVAL_BLOCK__INTERVAL_READINGS);
		}
		return intervalBlocks;
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
			case MeteringPackage.INTERVAL_READING__READING_QUALITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReadingQualities()).basicAdd(otherEnd, msgs);
			case MeteringPackage.INTERVAL_READING__INTERVAL_BLOCKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntervalBlocks()).basicAdd(otherEnd, msgs);
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
			case MeteringPackage.INTERVAL_READING__READING_QUALITIES:
				return ((InternalEList<?>)getReadingQualities()).basicRemove(otherEnd, msgs);
			case MeteringPackage.INTERVAL_READING__INTERVAL_BLOCKS:
				return ((InternalEList<?>)getIntervalBlocks()).basicRemove(otherEnd, msgs);
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
			case MeteringPackage.INTERVAL_READING__VALUE:
				return getValue();
			case MeteringPackage.INTERVAL_READING__READING_QUALITIES:
				return getReadingQualities();
			case MeteringPackage.INTERVAL_READING__INTERVAL_BLOCKS:
				return getIntervalBlocks();
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
			case MeteringPackage.INTERVAL_READING__VALUE:
				setValue((Float)newValue);
				return;
			case MeteringPackage.INTERVAL_READING__READING_QUALITIES:
				getReadingQualities().clear();
				getReadingQualities().addAll((Collection<? extends ReadingQuality>)newValue);
				return;
			case MeteringPackage.INTERVAL_READING__INTERVAL_BLOCKS:
				getIntervalBlocks().clear();
				getIntervalBlocks().addAll((Collection<? extends IntervalBlock>)newValue);
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
			case MeteringPackage.INTERVAL_READING__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MeteringPackage.INTERVAL_READING__READING_QUALITIES:
				getReadingQualities().clear();
				return;
			case MeteringPackage.INTERVAL_READING__INTERVAL_BLOCKS:
				getIntervalBlocks().clear();
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
			case MeteringPackage.INTERVAL_READING__VALUE:
				return value != VALUE_EDEFAULT;
			case MeteringPackage.INTERVAL_READING__READING_QUALITIES:
				return readingQualities != null && !readingQualities.isEmpty();
			case MeteringPackage.INTERVAL_READING__INTERVAL_BLOCKS:
				return intervalBlocks != null && !intervalBlocks.isEmpty();
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //IntervalReadingImpl
