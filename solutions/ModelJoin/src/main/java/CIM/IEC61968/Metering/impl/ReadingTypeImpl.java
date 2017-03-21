/**
 */
package CIM.IEC61968.Metering.impl;

import CIM.IEC61968.Metering.DynamicDemand;
import CIM.IEC61968.Metering.IntervalBlock;
import CIM.IEC61968.Metering.MeteringPackage;
import CIM.IEC61968.Metering.Pending;
import CIM.IEC61968.Metering.Reading;
import CIM.IEC61968.Metering.ReadingKind;
import CIM.IEC61968.Metering.ReadingType;
import CIM.IEC61968.Metering.Register;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Domain.UnitMultiplier;
import CIM.IEC61970.Domain.UnitSymbol;

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
 * An implementation of the model object '<em><b>Reading Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Metering.impl.ReadingTypeImpl#getIntervalLength <em>Interval Length</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.ReadingTypeImpl#getDynamicConfiguration <em>Dynamic Configuration</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.ReadingTypeImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.ReadingTypeImpl#getDefaultQuality <em>Default Quality</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.ReadingTypeImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.ReadingTypeImpl#getRegister <em>Register</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.ReadingTypeImpl#getIntervalBlocks <em>Interval Blocks</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.ReadingTypeImpl#getReadings <em>Readings</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.ReadingTypeImpl#getChannelNumber <em>Channel Number</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.ReadingTypeImpl#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.ReadingTypeImpl#getDefaultValueDataType <em>Default Value Data Type</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.ReadingTypeImpl#isReverseChronology <em>Reverse Chronology</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.ReadingTypeImpl#getPending <em>Pending</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadingTypeImpl extends IdentifiedObjectImpl implements ReadingType {
	/**
	 * The default value of the '{@link #getIntervalLength() <em>Interval Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalLength()
	 * @generated
	 * @ordered
	 */
	protected static final float INTERVAL_LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getIntervalLength() <em>Interval Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalLength()
	 * @generated
	 * @ordered
	 */
	protected float intervalLength = INTERVAL_LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDynamicConfiguration() <em>Dynamic Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicConfiguration()
	 * @generated
	 * @ordered
	 */
	protected DynamicDemand dynamicConfiguration;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitSymbol UNIT_EDEFAULT = UnitSymbol.A;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitSymbol unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultQuality() <em>Default Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultQuality()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_QUALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultQuality() <em>Default Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultQuality()
	 * @generated
	 * @ordered
	 */
	protected String defaultQuality = DEFAULT_QUALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ReadingKind KIND_EDEFAULT = ReadingKind.VOLTAGE_ANGLE;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ReadingKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRegister() <em>Register</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegister()
	 * @generated
	 * @ordered
	 */
	protected Register register;

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
	 * The cached value of the '{@link #getReadings() <em>Readings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadings()
	 * @generated
	 * @ordered
	 */
	protected EList<Reading> readings;

	/**
	 * The default value of the '{@link #getChannelNumber() <em>Channel Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int CHANNEL_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChannelNumber() <em>Channel Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelNumber()
	 * @generated
	 * @ordered
	 */
	protected int channelNumber = CHANNEL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final UnitMultiplier MULTIPLIER_EDEFAULT = UnitMultiplier.SMALL_M;

	/**
	 * The cached value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplier()
	 * @generated
	 * @ordered
	 */
	protected UnitMultiplier multiplier = MULTIPLIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValueDataType() <em>Default Value Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValueDataType() <em>Default Value Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueDataType()
	 * @generated
	 * @ordered
	 */
	protected String defaultValueDataType = DEFAULT_VALUE_DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isReverseChronology() <em>Reverse Chronology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReverseChronology()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REVERSE_CHRONOLOGY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReverseChronology() <em>Reverse Chronology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReverseChronology()
	 * @generated
	 * @ordered
	 */
	protected boolean reverseChronology = REVERSE_CHRONOLOGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPending() <em>Pending</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPending()
	 * @generated
	 * @ordered
	 */
	protected Pending pending;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.READING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getIntervalLength() {
		return intervalLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalLength(float newIntervalLength) {
		float oldIntervalLength = intervalLength;
		intervalLength = newIntervalLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.READING_TYPE__INTERVAL_LENGTH, oldIntervalLength, intervalLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicDemand getDynamicConfiguration() {
		if (dynamicConfiguration != null && dynamicConfiguration.eIsProxy()) {
			InternalEObject oldDynamicConfiguration = (InternalEObject)dynamicConfiguration;
			dynamicConfiguration = (DynamicDemand)eResolveProxy(oldDynamicConfiguration);
			if (dynamicConfiguration != oldDynamicConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.READING_TYPE__DYNAMIC_CONFIGURATION, oldDynamicConfiguration, dynamicConfiguration));
			}
		}
		return dynamicConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicDemand basicGetDynamicConfiguration() {
		return dynamicConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicConfiguration(DynamicDemand newDynamicConfiguration) {
		DynamicDemand oldDynamicConfiguration = dynamicConfiguration;
		dynamicConfiguration = newDynamicConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.READING_TYPE__DYNAMIC_CONFIGURATION, oldDynamicConfiguration, dynamicConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitSymbol getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(UnitSymbol newUnit) {
		UnitSymbol oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.READING_TYPE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultQuality() {
		return defaultQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultQuality(String newDefaultQuality) {
		String oldDefaultQuality = defaultQuality;
		defaultQuality = newDefaultQuality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.READING_TYPE__DEFAULT_QUALITY, oldDefaultQuality, defaultQuality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ReadingKind newKind) {
		ReadingKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.READING_TYPE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Register getRegister() {
		if (register != null && register.eIsProxy()) {
			InternalEObject oldRegister = (InternalEObject)register;
			register = (Register)eResolveProxy(oldRegister);
			if (register != oldRegister) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.READING_TYPE__REGISTER, oldRegister, register));
			}
		}
		return register;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Register basicGetRegister() {
		return register;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegister(Register newRegister, NotificationChain msgs) {
		Register oldRegister = register;
		register = newRegister;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.READING_TYPE__REGISTER, oldRegister, newRegister);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegister(Register newRegister) {
		if (newRegister != register) {
			NotificationChain msgs = null;
			if (register != null)
				msgs = ((InternalEObject)register).eInverseRemove(this, MeteringPackage.REGISTER__READING_TYPE, Register.class, msgs);
			if (newRegister != null)
				msgs = ((InternalEObject)newRegister).eInverseAdd(this, MeteringPackage.REGISTER__READING_TYPE, Register.class, msgs);
			msgs = basicSetRegister(newRegister, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.READING_TYPE__REGISTER, newRegister, newRegister));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntervalBlock> getIntervalBlocks() {
		if (intervalBlocks == null) {
			intervalBlocks = new EObjectWithInverseResolvingEList<IntervalBlock>(IntervalBlock.class, this, MeteringPackage.READING_TYPE__INTERVAL_BLOCKS, MeteringPackage.INTERVAL_BLOCK__READING_TYPE);
		}
		return intervalBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reading> getReadings() {
		if (readings == null) {
			readings = new EObjectWithInverseResolvingEList<Reading>(Reading.class, this, MeteringPackage.READING_TYPE__READINGS, MeteringPackage.READING__READING_TYPE);
		}
		return readings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChannelNumber() {
		return channelNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelNumber(int newChannelNumber) {
		int oldChannelNumber = channelNumber;
		channelNumber = newChannelNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.READING_TYPE__CHANNEL_NUMBER, oldChannelNumber, channelNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitMultiplier getMultiplier() {
		return multiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplier(UnitMultiplier newMultiplier) {
		UnitMultiplier oldMultiplier = multiplier;
		multiplier = newMultiplier == null ? MULTIPLIER_EDEFAULT : newMultiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.READING_TYPE__MULTIPLIER, oldMultiplier, multiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValueDataType() {
		return defaultValueDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueDataType(String newDefaultValueDataType) {
		String oldDefaultValueDataType = defaultValueDataType;
		defaultValueDataType = newDefaultValueDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.READING_TYPE__DEFAULT_VALUE_DATA_TYPE, oldDefaultValueDataType, defaultValueDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReverseChronology() {
		return reverseChronology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReverseChronology(boolean newReverseChronology) {
		boolean oldReverseChronology = reverseChronology;
		reverseChronology = newReverseChronology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.READING_TYPE__REVERSE_CHRONOLOGY, oldReverseChronology, reverseChronology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pending getPending() {
		if (pending != null && pending.eIsProxy()) {
			InternalEObject oldPending = (InternalEObject)pending;
			pending = (Pending)eResolveProxy(oldPending);
			if (pending != oldPending) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.READING_TYPE__PENDING, oldPending, pending));
			}
		}
		return pending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pending basicGetPending() {
		return pending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPending(Pending newPending, NotificationChain msgs) {
		Pending oldPending = pending;
		pending = newPending;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.READING_TYPE__PENDING, oldPending, newPending);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPending(Pending newPending) {
		if (newPending != pending) {
			NotificationChain msgs = null;
			if (pending != null)
				msgs = ((InternalEObject)pending).eInverseRemove(this, MeteringPackage.PENDING__READING_TYPE, Pending.class, msgs);
			if (newPending != null)
				msgs = ((InternalEObject)newPending).eInverseAdd(this, MeteringPackage.PENDING__READING_TYPE, Pending.class, msgs);
			msgs = basicSetPending(newPending, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.READING_TYPE__PENDING, newPending, newPending));
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
			case MeteringPackage.READING_TYPE__REGISTER:
				if (register != null)
					msgs = ((InternalEObject)register).eInverseRemove(this, MeteringPackage.REGISTER__READING_TYPE, Register.class, msgs);
				return basicSetRegister((Register)otherEnd, msgs);
			case MeteringPackage.READING_TYPE__INTERVAL_BLOCKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntervalBlocks()).basicAdd(otherEnd, msgs);
			case MeteringPackage.READING_TYPE__READINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReadings()).basicAdd(otherEnd, msgs);
			case MeteringPackage.READING_TYPE__PENDING:
				if (pending != null)
					msgs = ((InternalEObject)pending).eInverseRemove(this, MeteringPackage.PENDING__READING_TYPE, Pending.class, msgs);
				return basicSetPending((Pending)otherEnd, msgs);
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
			case MeteringPackage.READING_TYPE__REGISTER:
				return basicSetRegister(null, msgs);
			case MeteringPackage.READING_TYPE__INTERVAL_BLOCKS:
				return ((InternalEList<?>)getIntervalBlocks()).basicRemove(otherEnd, msgs);
			case MeteringPackage.READING_TYPE__READINGS:
				return ((InternalEList<?>)getReadings()).basicRemove(otherEnd, msgs);
			case MeteringPackage.READING_TYPE__PENDING:
				return basicSetPending(null, msgs);
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
			case MeteringPackage.READING_TYPE__INTERVAL_LENGTH:
				return getIntervalLength();
			case MeteringPackage.READING_TYPE__DYNAMIC_CONFIGURATION:
				if (resolve) return getDynamicConfiguration();
				return basicGetDynamicConfiguration();
			case MeteringPackage.READING_TYPE__UNIT:
				return getUnit();
			case MeteringPackage.READING_TYPE__DEFAULT_QUALITY:
				return getDefaultQuality();
			case MeteringPackage.READING_TYPE__KIND:
				return getKind();
			case MeteringPackage.READING_TYPE__REGISTER:
				if (resolve) return getRegister();
				return basicGetRegister();
			case MeteringPackage.READING_TYPE__INTERVAL_BLOCKS:
				return getIntervalBlocks();
			case MeteringPackage.READING_TYPE__READINGS:
				return getReadings();
			case MeteringPackage.READING_TYPE__CHANNEL_NUMBER:
				return getChannelNumber();
			case MeteringPackage.READING_TYPE__MULTIPLIER:
				return getMultiplier();
			case MeteringPackage.READING_TYPE__DEFAULT_VALUE_DATA_TYPE:
				return getDefaultValueDataType();
			case MeteringPackage.READING_TYPE__REVERSE_CHRONOLOGY:
				return isReverseChronology();
			case MeteringPackage.READING_TYPE__PENDING:
				if (resolve) return getPending();
				return basicGetPending();
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
			case MeteringPackage.READING_TYPE__INTERVAL_LENGTH:
				setIntervalLength((Float)newValue);
				return;
			case MeteringPackage.READING_TYPE__DYNAMIC_CONFIGURATION:
				setDynamicConfiguration((DynamicDemand)newValue);
				return;
			case MeteringPackage.READING_TYPE__UNIT:
				setUnit((UnitSymbol)newValue);
				return;
			case MeteringPackage.READING_TYPE__DEFAULT_QUALITY:
				setDefaultQuality((String)newValue);
				return;
			case MeteringPackage.READING_TYPE__KIND:
				setKind((ReadingKind)newValue);
				return;
			case MeteringPackage.READING_TYPE__REGISTER:
				setRegister((Register)newValue);
				return;
			case MeteringPackage.READING_TYPE__INTERVAL_BLOCKS:
				getIntervalBlocks().clear();
				getIntervalBlocks().addAll((Collection<? extends IntervalBlock>)newValue);
				return;
			case MeteringPackage.READING_TYPE__READINGS:
				getReadings().clear();
				getReadings().addAll((Collection<? extends Reading>)newValue);
				return;
			case MeteringPackage.READING_TYPE__CHANNEL_NUMBER:
				setChannelNumber((Integer)newValue);
				return;
			case MeteringPackage.READING_TYPE__MULTIPLIER:
				setMultiplier((UnitMultiplier)newValue);
				return;
			case MeteringPackage.READING_TYPE__DEFAULT_VALUE_DATA_TYPE:
				setDefaultValueDataType((String)newValue);
				return;
			case MeteringPackage.READING_TYPE__REVERSE_CHRONOLOGY:
				setReverseChronology((Boolean)newValue);
				return;
			case MeteringPackage.READING_TYPE__PENDING:
				setPending((Pending)newValue);
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
			case MeteringPackage.READING_TYPE__INTERVAL_LENGTH:
				setIntervalLength(INTERVAL_LENGTH_EDEFAULT);
				return;
			case MeteringPackage.READING_TYPE__DYNAMIC_CONFIGURATION:
				setDynamicConfiguration((DynamicDemand)null);
				return;
			case MeteringPackage.READING_TYPE__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case MeteringPackage.READING_TYPE__DEFAULT_QUALITY:
				setDefaultQuality(DEFAULT_QUALITY_EDEFAULT);
				return;
			case MeteringPackage.READING_TYPE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case MeteringPackage.READING_TYPE__REGISTER:
				setRegister((Register)null);
				return;
			case MeteringPackage.READING_TYPE__INTERVAL_BLOCKS:
				getIntervalBlocks().clear();
				return;
			case MeteringPackage.READING_TYPE__READINGS:
				getReadings().clear();
				return;
			case MeteringPackage.READING_TYPE__CHANNEL_NUMBER:
				setChannelNumber(CHANNEL_NUMBER_EDEFAULT);
				return;
			case MeteringPackage.READING_TYPE__MULTIPLIER:
				setMultiplier(MULTIPLIER_EDEFAULT);
				return;
			case MeteringPackage.READING_TYPE__DEFAULT_VALUE_DATA_TYPE:
				setDefaultValueDataType(DEFAULT_VALUE_DATA_TYPE_EDEFAULT);
				return;
			case MeteringPackage.READING_TYPE__REVERSE_CHRONOLOGY:
				setReverseChronology(REVERSE_CHRONOLOGY_EDEFAULT);
				return;
			case MeteringPackage.READING_TYPE__PENDING:
				setPending((Pending)null);
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
			case MeteringPackage.READING_TYPE__INTERVAL_LENGTH:
				return intervalLength != INTERVAL_LENGTH_EDEFAULT;
			case MeteringPackage.READING_TYPE__DYNAMIC_CONFIGURATION:
				return dynamicConfiguration != null;
			case MeteringPackage.READING_TYPE__UNIT:
				return unit != UNIT_EDEFAULT;
			case MeteringPackage.READING_TYPE__DEFAULT_QUALITY:
				return DEFAULT_QUALITY_EDEFAULT == null ? defaultQuality != null : !DEFAULT_QUALITY_EDEFAULT.equals(defaultQuality);
			case MeteringPackage.READING_TYPE__KIND:
				return kind != KIND_EDEFAULT;
			case MeteringPackage.READING_TYPE__REGISTER:
				return register != null;
			case MeteringPackage.READING_TYPE__INTERVAL_BLOCKS:
				return intervalBlocks != null && !intervalBlocks.isEmpty();
			case MeteringPackage.READING_TYPE__READINGS:
				return readings != null && !readings.isEmpty();
			case MeteringPackage.READING_TYPE__CHANNEL_NUMBER:
				return channelNumber != CHANNEL_NUMBER_EDEFAULT;
			case MeteringPackage.READING_TYPE__MULTIPLIER:
				return multiplier != MULTIPLIER_EDEFAULT;
			case MeteringPackage.READING_TYPE__DEFAULT_VALUE_DATA_TYPE:
				return DEFAULT_VALUE_DATA_TYPE_EDEFAULT == null ? defaultValueDataType != null : !DEFAULT_VALUE_DATA_TYPE_EDEFAULT.equals(defaultValueDataType);
			case MeteringPackage.READING_TYPE__REVERSE_CHRONOLOGY:
				return reverseChronology != REVERSE_CHRONOLOGY_EDEFAULT;
			case MeteringPackage.READING_TYPE__PENDING:
				return pending != null;
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
		result.append(" (intervalLength: ");
		result.append(intervalLength);
		result.append(", unit: ");
		result.append(unit);
		result.append(", defaultQuality: ");
		result.append(defaultQuality);
		result.append(", kind: ");
		result.append(kind);
		result.append(", channelNumber: ");
		result.append(channelNumber);
		result.append(", multiplier: ");
		result.append(multiplier);
		result.append(", defaultValueDataType: ");
		result.append(defaultValueDataType);
		result.append(", reverseChronology: ");
		result.append(reverseChronology);
		result.append(')');
		return result.toString();
	}

} //ReadingTypeImpl
