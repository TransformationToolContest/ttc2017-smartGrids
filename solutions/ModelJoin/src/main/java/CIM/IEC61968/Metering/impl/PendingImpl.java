/**
 */
package CIM.IEC61968.Metering.impl;

import CIM.IEC61968.Metering.IntervalBlock;
import CIM.IEC61968.Metering.MeteringPackage;
import CIM.IEC61968.Metering.Pending;
import CIM.IEC61968.Metering.ReadingType;

import CIM.impl.ElementImpl;

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
 * An implementation of the model object '<em><b>Pending</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Metering.impl.PendingImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.PendingImpl#isMultiplyBeforeAdd <em>Multiply Before Add</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.PendingImpl#getScalarFloat <em>Scalar Float</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.PendingImpl#getReadingType <em>Reading Type</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.PendingImpl#getScalarDenominator <em>Scalar Denominator</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.PendingImpl#getIntervalBlocks <em>Interval Blocks</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.PendingImpl#getScalarNumerator <em>Scalar Numerator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PendingImpl extends ElementImpl implements Pending {
	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected int offset = OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #isMultiplyBeforeAdd() <em>Multiply Before Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiplyBeforeAdd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLY_BEFORE_ADD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultiplyBeforeAdd() <em>Multiply Before Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiplyBeforeAdd()
	 * @generated
	 * @ordered
	 */
	protected boolean multiplyBeforeAdd = MULTIPLY_BEFORE_ADD_EDEFAULT;

	/**
	 * The default value of the '{@link #getScalarFloat() <em>Scalar Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarFloat()
	 * @generated
	 * @ordered
	 */
	protected static final float SCALAR_FLOAT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getScalarFloat() <em>Scalar Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarFloat()
	 * @generated
	 * @ordered
	 */
	protected float scalarFloat = SCALAR_FLOAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReadingType() <em>Reading Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingType()
	 * @generated
	 * @ordered
	 */
	protected ReadingType readingType;

	/**
	 * The default value of the '{@link #getScalarDenominator() <em>Scalar Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarDenominator()
	 * @generated
	 * @ordered
	 */
	protected static final int SCALAR_DENOMINATOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScalarDenominator() <em>Scalar Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarDenominator()
	 * @generated
	 * @ordered
	 */
	protected int scalarDenominator = SCALAR_DENOMINATOR_EDEFAULT;

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
	 * The default value of the '{@link #getScalarNumerator() <em>Scalar Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarNumerator()
	 * @generated
	 * @ordered
	 */
	protected static final int SCALAR_NUMERATOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScalarNumerator() <em>Scalar Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarNumerator()
	 * @generated
	 * @ordered
	 */
	protected int scalarNumerator = SCALAR_NUMERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PendingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.PENDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(int newOffset) {
		int oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.PENDING__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiplyBeforeAdd() {
		return multiplyBeforeAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplyBeforeAdd(boolean newMultiplyBeforeAdd) {
		boolean oldMultiplyBeforeAdd = multiplyBeforeAdd;
		multiplyBeforeAdd = newMultiplyBeforeAdd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.PENDING__MULTIPLY_BEFORE_ADD, oldMultiplyBeforeAdd, multiplyBeforeAdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getScalarFloat() {
		return scalarFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalarFloat(float newScalarFloat) {
		float oldScalarFloat = scalarFloat;
		scalarFloat = newScalarFloat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.PENDING__SCALAR_FLOAT, oldScalarFloat, scalarFloat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingType getReadingType() {
		if (readingType != null && readingType.eIsProxy()) {
			InternalEObject oldReadingType = (InternalEObject)readingType;
			readingType = (ReadingType)eResolveProxy(oldReadingType);
			if (readingType != oldReadingType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.PENDING__READING_TYPE, oldReadingType, readingType));
			}
		}
		return readingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingType basicGetReadingType() {
		return readingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadingType(ReadingType newReadingType, NotificationChain msgs) {
		ReadingType oldReadingType = readingType;
		readingType = newReadingType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.PENDING__READING_TYPE, oldReadingType, newReadingType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadingType(ReadingType newReadingType) {
		if (newReadingType != readingType) {
			NotificationChain msgs = null;
			if (readingType != null)
				msgs = ((InternalEObject)readingType).eInverseRemove(this, MeteringPackage.READING_TYPE__PENDING, ReadingType.class, msgs);
			if (newReadingType != null)
				msgs = ((InternalEObject)newReadingType).eInverseAdd(this, MeteringPackage.READING_TYPE__PENDING, ReadingType.class, msgs);
			msgs = basicSetReadingType(newReadingType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.PENDING__READING_TYPE, newReadingType, newReadingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getScalarDenominator() {
		return scalarDenominator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalarDenominator(int newScalarDenominator) {
		int oldScalarDenominator = scalarDenominator;
		scalarDenominator = newScalarDenominator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.PENDING__SCALAR_DENOMINATOR, oldScalarDenominator, scalarDenominator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntervalBlock> getIntervalBlocks() {
		if (intervalBlocks == null) {
			intervalBlocks = new EObjectWithInverseResolvingEList<IntervalBlock>(IntervalBlock.class, this, MeteringPackage.PENDING__INTERVAL_BLOCKS, MeteringPackage.INTERVAL_BLOCK__PENDING);
		}
		return intervalBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getScalarNumerator() {
		return scalarNumerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalarNumerator(int newScalarNumerator) {
		int oldScalarNumerator = scalarNumerator;
		scalarNumerator = newScalarNumerator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.PENDING__SCALAR_NUMERATOR, oldScalarNumerator, scalarNumerator));
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
			case MeteringPackage.PENDING__READING_TYPE:
				if (readingType != null)
					msgs = ((InternalEObject)readingType).eInverseRemove(this, MeteringPackage.READING_TYPE__PENDING, ReadingType.class, msgs);
				return basicSetReadingType((ReadingType)otherEnd, msgs);
			case MeteringPackage.PENDING__INTERVAL_BLOCKS:
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
			case MeteringPackage.PENDING__READING_TYPE:
				return basicSetReadingType(null, msgs);
			case MeteringPackage.PENDING__INTERVAL_BLOCKS:
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
			case MeteringPackage.PENDING__OFFSET:
				return getOffset();
			case MeteringPackage.PENDING__MULTIPLY_BEFORE_ADD:
				return isMultiplyBeforeAdd();
			case MeteringPackage.PENDING__SCALAR_FLOAT:
				return getScalarFloat();
			case MeteringPackage.PENDING__READING_TYPE:
				if (resolve) return getReadingType();
				return basicGetReadingType();
			case MeteringPackage.PENDING__SCALAR_DENOMINATOR:
				return getScalarDenominator();
			case MeteringPackage.PENDING__INTERVAL_BLOCKS:
				return getIntervalBlocks();
			case MeteringPackage.PENDING__SCALAR_NUMERATOR:
				return getScalarNumerator();
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
			case MeteringPackage.PENDING__OFFSET:
				setOffset((Integer)newValue);
				return;
			case MeteringPackage.PENDING__MULTIPLY_BEFORE_ADD:
				setMultiplyBeforeAdd((Boolean)newValue);
				return;
			case MeteringPackage.PENDING__SCALAR_FLOAT:
				setScalarFloat((Float)newValue);
				return;
			case MeteringPackage.PENDING__READING_TYPE:
				setReadingType((ReadingType)newValue);
				return;
			case MeteringPackage.PENDING__SCALAR_DENOMINATOR:
				setScalarDenominator((Integer)newValue);
				return;
			case MeteringPackage.PENDING__INTERVAL_BLOCKS:
				getIntervalBlocks().clear();
				getIntervalBlocks().addAll((Collection<? extends IntervalBlock>)newValue);
				return;
			case MeteringPackage.PENDING__SCALAR_NUMERATOR:
				setScalarNumerator((Integer)newValue);
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
			case MeteringPackage.PENDING__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case MeteringPackage.PENDING__MULTIPLY_BEFORE_ADD:
				setMultiplyBeforeAdd(MULTIPLY_BEFORE_ADD_EDEFAULT);
				return;
			case MeteringPackage.PENDING__SCALAR_FLOAT:
				setScalarFloat(SCALAR_FLOAT_EDEFAULT);
				return;
			case MeteringPackage.PENDING__READING_TYPE:
				setReadingType((ReadingType)null);
				return;
			case MeteringPackage.PENDING__SCALAR_DENOMINATOR:
				setScalarDenominator(SCALAR_DENOMINATOR_EDEFAULT);
				return;
			case MeteringPackage.PENDING__INTERVAL_BLOCKS:
				getIntervalBlocks().clear();
				return;
			case MeteringPackage.PENDING__SCALAR_NUMERATOR:
				setScalarNumerator(SCALAR_NUMERATOR_EDEFAULT);
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
			case MeteringPackage.PENDING__OFFSET:
				return offset != OFFSET_EDEFAULT;
			case MeteringPackage.PENDING__MULTIPLY_BEFORE_ADD:
				return multiplyBeforeAdd != MULTIPLY_BEFORE_ADD_EDEFAULT;
			case MeteringPackage.PENDING__SCALAR_FLOAT:
				return scalarFloat != SCALAR_FLOAT_EDEFAULT;
			case MeteringPackage.PENDING__READING_TYPE:
				return readingType != null;
			case MeteringPackage.PENDING__SCALAR_DENOMINATOR:
				return scalarDenominator != SCALAR_DENOMINATOR_EDEFAULT;
			case MeteringPackage.PENDING__INTERVAL_BLOCKS:
				return intervalBlocks != null && !intervalBlocks.isEmpty();
			case MeteringPackage.PENDING__SCALAR_NUMERATOR:
				return scalarNumerator != SCALAR_NUMERATOR_EDEFAULT;
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
		result.append(" (offset: ");
		result.append(offset);
		result.append(", multiplyBeforeAdd: ");
		result.append(multiplyBeforeAdd);
		result.append(", scalarFloat: ");
		result.append(scalarFloat);
		result.append(", scalarDenominator: ");
		result.append(scalarDenominator);
		result.append(", scalarNumerator: ");
		result.append(scalarNumerator);
		result.append(')');
		return result.toString();
	}

} //PendingImpl
