/**
 */
package CIM.IEC61968.Metering.impl;

import CIM.IEC61968.Common.DateTimeInterval;

import CIM.IEC61968.Customers.CustomerAgreement;
import CIM.IEC61968.Customers.CustomersPackage;

import CIM.IEC61968.Metering.DemandResponseProgram;
import CIM.IEC61968.Metering.EndDeviceAsset;
import CIM.IEC61968.Metering.EndDeviceControl;
import CIM.IEC61968.Metering.EndDeviceGroup;
import CIM.IEC61968.Metering.MeteringPackage;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Device Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Metering.impl.EndDeviceControlImpl#getScheduledInterval <em>Scheduled Interval</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.EndDeviceControlImpl#isDrProgramMandatory <em>Dr Program Mandatory</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.EndDeviceControlImpl#getDrProgramLevel <em>Dr Program Level</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.EndDeviceControlImpl#getCustomerAgreement <em>Customer Agreement</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.EndDeviceControlImpl#getEndDeviceAsset <em>End Device Asset</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.EndDeviceControlImpl#getType <em>Type</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.EndDeviceControlImpl#getPriceSignal <em>Price Signal</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.EndDeviceControlImpl#getEndDeviceGroup <em>End Device Group</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.EndDeviceControlImpl#getDemandResponseProgram <em>Demand Response Program</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndDeviceControlImpl extends IdentifiedObjectImpl implements EndDeviceControl {
	/**
	 * The cached value of the '{@link #getScheduledInterval() <em>Scheduled Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledInterval()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval scheduledInterval;

	/**
	 * The default value of the '{@link #isDrProgramMandatory() <em>Dr Program Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDrProgramMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DR_PROGRAM_MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDrProgramMandatory() <em>Dr Program Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDrProgramMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean drProgramMandatory = DR_PROGRAM_MANDATORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDrProgramLevel() <em>Dr Program Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrProgramLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int DR_PROGRAM_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDrProgramLevel() <em>Dr Program Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrProgramLevel()
	 * @generated
	 * @ordered
	 */
	protected int drProgramLevel = DR_PROGRAM_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomerAgreement() <em>Customer Agreement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerAgreement()
	 * @generated
	 * @ordered
	 */
	protected CustomerAgreement customerAgreement;

	/**
	 * The cached value of the '{@link #getEndDeviceAsset() <em>End Device Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceAsset()
	 * @generated
	 * @ordered
	 */
	protected EndDeviceAsset endDeviceAsset;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriceSignal() <em>Price Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceSignal()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_SIGNAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPriceSignal() <em>Price Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceSignal()
	 * @generated
	 * @ordered
	 */
	protected float priceSignal = PRICE_SIGNAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEndDeviceGroup() <em>End Device Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceGroup()
	 * @generated
	 * @ordered
	 */
	protected EndDeviceGroup endDeviceGroup;

	/**
	 * The cached value of the '{@link #getDemandResponseProgram() <em>Demand Response Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemandResponseProgram()
	 * @generated
	 * @ordered
	 */
	protected DemandResponseProgram demandResponseProgram;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndDeviceControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.END_DEVICE_CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval getScheduledInterval() {
		if (scheduledInterval != null && scheduledInterval.eIsProxy()) {
			InternalEObject oldScheduledInterval = (InternalEObject)scheduledInterval;
			scheduledInterval = (DateTimeInterval)eResolveProxy(oldScheduledInterval);
			if (scheduledInterval != oldScheduledInterval) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL, oldScheduledInterval, scheduledInterval));
			}
		}
		return scheduledInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval basicGetScheduledInterval() {
		return scheduledInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledInterval(DateTimeInterval newScheduledInterval) {
		DateTimeInterval oldScheduledInterval = scheduledInterval;
		scheduledInterval = newScheduledInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL, oldScheduledInterval, scheduledInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDrProgramMandatory() {
		return drProgramMandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrProgramMandatory(boolean newDrProgramMandatory) {
		boolean oldDrProgramMandatory = drProgramMandatory;
		drProgramMandatory = newDrProgramMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_CONTROL__DR_PROGRAM_MANDATORY, oldDrProgramMandatory, drProgramMandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDrProgramLevel() {
		return drProgramLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrProgramLevel(int newDrProgramLevel) {
		int oldDrProgramLevel = drProgramLevel;
		drProgramLevel = newDrProgramLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_CONTROL__DR_PROGRAM_LEVEL, oldDrProgramLevel, drProgramLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerAgreement getCustomerAgreement() {
		if (customerAgreement != null && customerAgreement.eIsProxy()) {
			InternalEObject oldCustomerAgreement = (InternalEObject)customerAgreement;
			customerAgreement = (CustomerAgreement)eResolveProxy(oldCustomerAgreement);
			if (customerAgreement != oldCustomerAgreement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.END_DEVICE_CONTROL__CUSTOMER_AGREEMENT, oldCustomerAgreement, customerAgreement));
			}
		}
		return customerAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerAgreement basicGetCustomerAgreement() {
		return customerAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerAgreement(CustomerAgreement newCustomerAgreement, NotificationChain msgs) {
		CustomerAgreement oldCustomerAgreement = customerAgreement;
		customerAgreement = newCustomerAgreement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_CONTROL__CUSTOMER_AGREEMENT, oldCustomerAgreement, newCustomerAgreement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerAgreement(CustomerAgreement newCustomerAgreement) {
		if (newCustomerAgreement != customerAgreement) {
			NotificationChain msgs = null;
			if (customerAgreement != null)
				msgs = ((InternalEObject)customerAgreement).eInverseRemove(this, CustomersPackage.CUSTOMER_AGREEMENT__END_DEVICE_CONTROLS, CustomerAgreement.class, msgs);
			if (newCustomerAgreement != null)
				msgs = ((InternalEObject)newCustomerAgreement).eInverseAdd(this, CustomersPackage.CUSTOMER_AGREEMENT__END_DEVICE_CONTROLS, CustomerAgreement.class, msgs);
			msgs = basicSetCustomerAgreement(newCustomerAgreement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_CONTROL__CUSTOMER_AGREEMENT, newCustomerAgreement, newCustomerAgreement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceAsset getEndDeviceAsset() {
		if (endDeviceAsset != null && endDeviceAsset.eIsProxy()) {
			InternalEObject oldEndDeviceAsset = (InternalEObject)endDeviceAsset;
			endDeviceAsset = (EndDeviceAsset)eResolveProxy(oldEndDeviceAsset);
			if (endDeviceAsset != oldEndDeviceAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_ASSET, oldEndDeviceAsset, endDeviceAsset));
			}
		}
		return endDeviceAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceAsset basicGetEndDeviceAsset() {
		return endDeviceAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndDeviceAsset(EndDeviceAsset newEndDeviceAsset, NotificationChain msgs) {
		EndDeviceAsset oldEndDeviceAsset = endDeviceAsset;
		endDeviceAsset = newEndDeviceAsset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_ASSET, oldEndDeviceAsset, newEndDeviceAsset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDeviceAsset(EndDeviceAsset newEndDeviceAsset) {
		if (newEndDeviceAsset != endDeviceAsset) {
			NotificationChain msgs = null;
			if (endDeviceAsset != null)
				msgs = ((InternalEObject)endDeviceAsset).eInverseRemove(this, MeteringPackage.END_DEVICE_ASSET__END_DEVICE_CONTROLS, EndDeviceAsset.class, msgs);
			if (newEndDeviceAsset != null)
				msgs = ((InternalEObject)newEndDeviceAsset).eInverseAdd(this, MeteringPackage.END_DEVICE_ASSET__END_DEVICE_CONTROLS, EndDeviceAsset.class, msgs);
			msgs = basicSetEndDeviceAsset(newEndDeviceAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_ASSET, newEndDeviceAsset, newEndDeviceAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_CONTROL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPriceSignal() {
		return priceSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriceSignal(float newPriceSignal) {
		float oldPriceSignal = priceSignal;
		priceSignal = newPriceSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_CONTROL__PRICE_SIGNAL, oldPriceSignal, priceSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceGroup getEndDeviceGroup() {
		if (endDeviceGroup != null && endDeviceGroup.eIsProxy()) {
			InternalEObject oldEndDeviceGroup = (InternalEObject)endDeviceGroup;
			endDeviceGroup = (EndDeviceGroup)eResolveProxy(oldEndDeviceGroup);
			if (endDeviceGroup != oldEndDeviceGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_GROUP, oldEndDeviceGroup, endDeviceGroup));
			}
		}
		return endDeviceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceGroup basicGetEndDeviceGroup() {
		return endDeviceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndDeviceGroup(EndDeviceGroup newEndDeviceGroup, NotificationChain msgs) {
		EndDeviceGroup oldEndDeviceGroup = endDeviceGroup;
		endDeviceGroup = newEndDeviceGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_GROUP, oldEndDeviceGroup, newEndDeviceGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDeviceGroup(EndDeviceGroup newEndDeviceGroup) {
		if (newEndDeviceGroup != endDeviceGroup) {
			NotificationChain msgs = null;
			if (endDeviceGroup != null)
				msgs = ((InternalEObject)endDeviceGroup).eInverseRemove(this, MeteringPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS, EndDeviceGroup.class, msgs);
			if (newEndDeviceGroup != null)
				msgs = ((InternalEObject)newEndDeviceGroup).eInverseAdd(this, MeteringPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS, EndDeviceGroup.class, msgs);
			msgs = basicSetEndDeviceGroup(newEndDeviceGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_GROUP, newEndDeviceGroup, newEndDeviceGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemandResponseProgram getDemandResponseProgram() {
		if (demandResponseProgram != null && demandResponseProgram.eIsProxy()) {
			InternalEObject oldDemandResponseProgram = (InternalEObject)demandResponseProgram;
			demandResponseProgram = (DemandResponseProgram)eResolveProxy(oldDemandResponseProgram);
			if (demandResponseProgram != oldDemandResponseProgram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.END_DEVICE_CONTROL__DEMAND_RESPONSE_PROGRAM, oldDemandResponseProgram, demandResponseProgram));
			}
		}
		return demandResponseProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemandResponseProgram basicGetDemandResponseProgram() {
		return demandResponseProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDemandResponseProgram(DemandResponseProgram newDemandResponseProgram, NotificationChain msgs) {
		DemandResponseProgram oldDemandResponseProgram = demandResponseProgram;
		demandResponseProgram = newDemandResponseProgram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_CONTROL__DEMAND_RESPONSE_PROGRAM, oldDemandResponseProgram, newDemandResponseProgram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDemandResponseProgram(DemandResponseProgram newDemandResponseProgram) {
		if (newDemandResponseProgram != demandResponseProgram) {
			NotificationChain msgs = null;
			if (demandResponseProgram != null)
				msgs = ((InternalEObject)demandResponseProgram).eInverseRemove(this, MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_CONTROLS, DemandResponseProgram.class, msgs);
			if (newDemandResponseProgram != null)
				msgs = ((InternalEObject)newDemandResponseProgram).eInverseAdd(this, MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_CONTROLS, DemandResponseProgram.class, msgs);
			msgs = basicSetDemandResponseProgram(newDemandResponseProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_CONTROL__DEMAND_RESPONSE_PROGRAM, newDemandResponseProgram, newDemandResponseProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeteringPackage.END_DEVICE_CONTROL__CUSTOMER_AGREEMENT:
				if (customerAgreement != null)
					msgs = ((InternalEObject)customerAgreement).eInverseRemove(this, CustomersPackage.CUSTOMER_AGREEMENT__END_DEVICE_CONTROLS, CustomerAgreement.class, msgs);
				return basicSetCustomerAgreement((CustomerAgreement)otherEnd, msgs);
			case MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_ASSET:
				if (endDeviceAsset != null)
					msgs = ((InternalEObject)endDeviceAsset).eInverseRemove(this, MeteringPackage.END_DEVICE_ASSET__END_DEVICE_CONTROLS, EndDeviceAsset.class, msgs);
				return basicSetEndDeviceAsset((EndDeviceAsset)otherEnd, msgs);
			case MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_GROUP:
				if (endDeviceGroup != null)
					msgs = ((InternalEObject)endDeviceGroup).eInverseRemove(this, MeteringPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS, EndDeviceGroup.class, msgs);
				return basicSetEndDeviceGroup((EndDeviceGroup)otherEnd, msgs);
			case MeteringPackage.END_DEVICE_CONTROL__DEMAND_RESPONSE_PROGRAM:
				if (demandResponseProgram != null)
					msgs = ((InternalEObject)demandResponseProgram).eInverseRemove(this, MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_CONTROLS, DemandResponseProgram.class, msgs);
				return basicSetDemandResponseProgram((DemandResponseProgram)otherEnd, msgs);
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
			case MeteringPackage.END_DEVICE_CONTROL__CUSTOMER_AGREEMENT:
				return basicSetCustomerAgreement(null, msgs);
			case MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_ASSET:
				return basicSetEndDeviceAsset(null, msgs);
			case MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_GROUP:
				return basicSetEndDeviceGroup(null, msgs);
			case MeteringPackage.END_DEVICE_CONTROL__DEMAND_RESPONSE_PROGRAM:
				return basicSetDemandResponseProgram(null, msgs);
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
			case MeteringPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL:
				if (resolve) return getScheduledInterval();
				return basicGetScheduledInterval();
			case MeteringPackage.END_DEVICE_CONTROL__DR_PROGRAM_MANDATORY:
				return isDrProgramMandatory();
			case MeteringPackage.END_DEVICE_CONTROL__DR_PROGRAM_LEVEL:
				return getDrProgramLevel();
			case MeteringPackage.END_DEVICE_CONTROL__CUSTOMER_AGREEMENT:
				if (resolve) return getCustomerAgreement();
				return basicGetCustomerAgreement();
			case MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_ASSET:
				if (resolve) return getEndDeviceAsset();
				return basicGetEndDeviceAsset();
			case MeteringPackage.END_DEVICE_CONTROL__TYPE:
				return getType();
			case MeteringPackage.END_DEVICE_CONTROL__PRICE_SIGNAL:
				return getPriceSignal();
			case MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_GROUP:
				if (resolve) return getEndDeviceGroup();
				return basicGetEndDeviceGroup();
			case MeteringPackage.END_DEVICE_CONTROL__DEMAND_RESPONSE_PROGRAM:
				if (resolve) return getDemandResponseProgram();
				return basicGetDemandResponseProgram();
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
			case MeteringPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL:
				setScheduledInterval((DateTimeInterval)newValue);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__DR_PROGRAM_MANDATORY:
				setDrProgramMandatory((Boolean)newValue);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__DR_PROGRAM_LEVEL:
				setDrProgramLevel((Integer)newValue);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__CUSTOMER_AGREEMENT:
				setCustomerAgreement((CustomerAgreement)newValue);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_ASSET:
				setEndDeviceAsset((EndDeviceAsset)newValue);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__TYPE:
				setType((String)newValue);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__PRICE_SIGNAL:
				setPriceSignal((Float)newValue);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_GROUP:
				setEndDeviceGroup((EndDeviceGroup)newValue);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__DEMAND_RESPONSE_PROGRAM:
				setDemandResponseProgram((DemandResponseProgram)newValue);
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
			case MeteringPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL:
				setScheduledInterval((DateTimeInterval)null);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__DR_PROGRAM_MANDATORY:
				setDrProgramMandatory(DR_PROGRAM_MANDATORY_EDEFAULT);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__DR_PROGRAM_LEVEL:
				setDrProgramLevel(DR_PROGRAM_LEVEL_EDEFAULT);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__CUSTOMER_AGREEMENT:
				setCustomerAgreement((CustomerAgreement)null);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_ASSET:
				setEndDeviceAsset((EndDeviceAsset)null);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__PRICE_SIGNAL:
				setPriceSignal(PRICE_SIGNAL_EDEFAULT);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_GROUP:
				setEndDeviceGroup((EndDeviceGroup)null);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__DEMAND_RESPONSE_PROGRAM:
				setDemandResponseProgram((DemandResponseProgram)null);
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
			case MeteringPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL:
				return scheduledInterval != null;
			case MeteringPackage.END_DEVICE_CONTROL__DR_PROGRAM_MANDATORY:
				return drProgramMandatory != DR_PROGRAM_MANDATORY_EDEFAULT;
			case MeteringPackage.END_DEVICE_CONTROL__DR_PROGRAM_LEVEL:
				return drProgramLevel != DR_PROGRAM_LEVEL_EDEFAULT;
			case MeteringPackage.END_DEVICE_CONTROL__CUSTOMER_AGREEMENT:
				return customerAgreement != null;
			case MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_ASSET:
				return endDeviceAsset != null;
			case MeteringPackage.END_DEVICE_CONTROL__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case MeteringPackage.END_DEVICE_CONTROL__PRICE_SIGNAL:
				return priceSignal != PRICE_SIGNAL_EDEFAULT;
			case MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_GROUP:
				return endDeviceGroup != null;
			case MeteringPackage.END_DEVICE_CONTROL__DEMAND_RESPONSE_PROGRAM:
				return demandResponseProgram != null;
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
		result.append(" (drProgramMandatory: ");
		result.append(drProgramMandatory);
		result.append(", drProgramLevel: ");
		result.append(drProgramLevel);
		result.append(", type: ");
		result.append(type);
		result.append(", priceSignal: ");
		result.append(priceSignal);
		result.append(')');
		return result.toString();
	}

} //EndDeviceControlImpl
