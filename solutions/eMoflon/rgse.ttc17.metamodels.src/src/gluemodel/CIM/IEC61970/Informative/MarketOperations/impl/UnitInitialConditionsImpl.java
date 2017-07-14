/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Initial Conditions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.UnitInitialConditionsImpl#getResourceStatus <em>Resource Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.UnitInitialConditionsImpl#getTimeInStatus <em>Time In Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.UnitInitialConditionsImpl#getResourceMW <em>Resource MW</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.UnitInitialConditionsImpl#getGeneratingUnit <em>Generating Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.UnitInitialConditionsImpl#getCumEnergy <em>Cum Energy</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.UnitInitialConditionsImpl#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.UnitInitialConditionsImpl#getCumStatusChanges <em>Cum Status Changes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitInitialConditionsImpl extends IdentifiedObjectImpl implements UnitInitialConditions {
	/**
	 * The default value of the '{@link #getResourceStatus() <em>Resource Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceStatus()
	 * @generated
	 * @ordered
	 */
	protected static final int RESOURCE_STATUS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResourceStatus() <em>Resource Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceStatus()
	 * @generated
	 * @ordered
	 */
	protected int resourceStatus = RESOURCE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeInStatus() <em>Time In Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeInStatus()
	 * @generated
	 * @ordered
	 */
	protected static final float TIME_IN_STATUS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTimeInStatus() <em>Time In Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeInStatus()
	 * @generated
	 * @ordered
	 */
	protected float timeInStatus = TIME_IN_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceMW() <em>Resource MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceMW()
	 * @generated
	 * @ordered
	 */
	protected static final float RESOURCE_MW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getResourceMW() <em>Resource MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceMW()
	 * @generated
	 * @ordered
	 */
	protected float resourceMW = RESOURCE_MW_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeneratingUnit() <em>Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected RegisteredGenerator generatingUnit;

	/**
	 * The default value of the '{@link #getCumEnergy() <em>Cum Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCumEnergy()
	 * @generated
	 * @ordered
	 */
	protected static final Object CUM_ENERGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCumEnergy() <em>Cum Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCumEnergy()
	 * @generated
	 * @ordered
	 */
	protected Object cumEnergy = CUM_ENERGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatusDate() <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date STATUS_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusDate() <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected Date statusDate = STATUS_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCumStatusChanges() <em>Cum Status Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCumStatusChanges()
	 * @generated
	 * @ordered
	 */
	protected static final int CUM_STATUS_CHANGES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCumStatusChanges() <em>Cum Status Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCumStatusChanges()
	 * @generated
	 * @ordered
	 */
	protected int cumStatusChanges = CUM_STATUS_CHANGES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitInitialConditionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.UNIT_INITIAL_CONDITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResourceStatus() {
		return resourceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceStatus(int newResourceStatus) {
		int oldResourceStatus = resourceStatus;
		resourceStatus = newResourceStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__RESOURCE_STATUS, oldResourceStatus, resourceStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTimeInStatus() {
		return timeInStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeInStatus(float newTimeInStatus) {
		float oldTimeInStatus = timeInStatus;
		timeInStatus = newTimeInStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__TIME_IN_STATUS, oldTimeInStatus, timeInStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getResourceMW() {
		return resourceMW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceMW(float newResourceMW) {
		float oldResourceMW = resourceMW;
		resourceMW = newResourceMW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__RESOURCE_MW, oldResourceMW, resourceMW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredGenerator getGeneratingUnit() {
		if (generatingUnit != null && generatingUnit.eIsProxy()) {
			InternalEObject oldGeneratingUnit = (InternalEObject)generatingUnit;
			generatingUnit = (RegisteredGenerator)eResolveProxy(oldGeneratingUnit);
			if (generatingUnit != oldGeneratingUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__GENERATING_UNIT, oldGeneratingUnit, generatingUnit));
			}
		}
		return generatingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredGenerator basicGetGeneratingUnit() {
		return generatingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratingUnit(RegisteredGenerator newGeneratingUnit, NotificationChain msgs) {
		RegisteredGenerator oldGeneratingUnit = generatingUnit;
		generatingUnit = newGeneratingUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__GENERATING_UNIT, oldGeneratingUnit, newGeneratingUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratingUnit(RegisteredGenerator newGeneratingUnit) {
		if (newGeneratingUnit != generatingUnit) {
			NotificationChain msgs = null;
			if (generatingUnit != null)
				msgs = ((InternalEObject)generatingUnit).eInverseRemove(this, MarketOperationsPackage.REGISTERED_GENERATOR__UNIT_INITIAL_CONDITIONS, RegisteredGenerator.class, msgs);
			if (newGeneratingUnit != null)
				msgs = ((InternalEObject)newGeneratingUnit).eInverseAdd(this, MarketOperationsPackage.REGISTERED_GENERATOR__UNIT_INITIAL_CONDITIONS, RegisteredGenerator.class, msgs);
			msgs = basicSetGeneratingUnit(newGeneratingUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__GENERATING_UNIT, newGeneratingUnit, newGeneratingUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCumEnergy() {
		return cumEnergy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCumEnergy(Object newCumEnergy) {
		Object oldCumEnergy = cumEnergy;
		cumEnergy = newCumEnergy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__CUM_ENERGY, oldCumEnergy, cumEnergy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStatusDate() {
		return statusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusDate(Date newStatusDate) {
		Date oldStatusDate = statusDate;
		statusDate = newStatusDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__STATUS_DATE, oldStatusDate, statusDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCumStatusChanges() {
		return cumStatusChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCumStatusChanges(int newCumStatusChanges) {
		int oldCumStatusChanges = cumStatusChanges;
		cumStatusChanges = newCumStatusChanges;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__CUM_STATUS_CHANGES, oldCumStatusChanges, cumStatusChanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__GENERATING_UNIT:
				if (generatingUnit != null)
					msgs = ((InternalEObject)generatingUnit).eInverseRemove(this, MarketOperationsPackage.REGISTERED_GENERATOR__UNIT_INITIAL_CONDITIONS, RegisteredGenerator.class, msgs);
				return basicSetGeneratingUnit((RegisteredGenerator)otherEnd, msgs);
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
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__GENERATING_UNIT:
				return basicSetGeneratingUnit(null, msgs);
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
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__RESOURCE_STATUS:
				return getResourceStatus();
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__TIME_IN_STATUS:
				return getTimeInStatus();
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__RESOURCE_MW:
				return getResourceMW();
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__GENERATING_UNIT:
				if (resolve) return getGeneratingUnit();
				return basicGetGeneratingUnit();
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__CUM_ENERGY:
				return getCumEnergy();
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__STATUS_DATE:
				return getStatusDate();
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__CUM_STATUS_CHANGES:
				return getCumStatusChanges();
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
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__RESOURCE_STATUS:
				setResourceStatus((Integer)newValue);
				return;
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__TIME_IN_STATUS:
				setTimeInStatus((Float)newValue);
				return;
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__RESOURCE_MW:
				setResourceMW((Float)newValue);
				return;
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__GENERATING_UNIT:
				setGeneratingUnit((RegisteredGenerator)newValue);
				return;
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__CUM_ENERGY:
				setCumEnergy(newValue);
				return;
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__STATUS_DATE:
				setStatusDate((Date)newValue);
				return;
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__CUM_STATUS_CHANGES:
				setCumStatusChanges((Integer)newValue);
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
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__RESOURCE_STATUS:
				setResourceStatus(RESOURCE_STATUS_EDEFAULT);
				return;
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__TIME_IN_STATUS:
				setTimeInStatus(TIME_IN_STATUS_EDEFAULT);
				return;
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__RESOURCE_MW:
				setResourceMW(RESOURCE_MW_EDEFAULT);
				return;
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__GENERATING_UNIT:
				setGeneratingUnit((RegisteredGenerator)null);
				return;
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__CUM_ENERGY:
				setCumEnergy(CUM_ENERGY_EDEFAULT);
				return;
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__STATUS_DATE:
				setStatusDate(STATUS_DATE_EDEFAULT);
				return;
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__CUM_STATUS_CHANGES:
				setCumStatusChanges(CUM_STATUS_CHANGES_EDEFAULT);
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
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__RESOURCE_STATUS:
				return resourceStatus != RESOURCE_STATUS_EDEFAULT;
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__TIME_IN_STATUS:
				return timeInStatus != TIME_IN_STATUS_EDEFAULT;
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__RESOURCE_MW:
				return resourceMW != RESOURCE_MW_EDEFAULT;
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__GENERATING_UNIT:
				return generatingUnit != null;
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__CUM_ENERGY:
				return CUM_ENERGY_EDEFAULT == null ? cumEnergy != null : !CUM_ENERGY_EDEFAULT.equals(cumEnergy);
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__STATUS_DATE:
				return STATUS_DATE_EDEFAULT == null ? statusDate != null : !STATUS_DATE_EDEFAULT.equals(statusDate);
			case MarketOperationsPackage.UNIT_INITIAL_CONDITIONS__CUM_STATUS_CHANGES:
				return cumStatusChanges != CUM_STATUS_CHANGES_EDEFAULT;
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
		result.append(" (resourceStatus: ");
		result.append(resourceStatus);
		result.append(", timeInStatus: ");
		result.append(timeInStatus);
		result.append(", resourceMW: ");
		result.append(resourceMW);
		result.append(", cumEnergy: ");
		result.append(cumEnergy);
		result.append(", statusDate: ");
		result.append(statusDate);
		result.append(", cumStatusChanges: ");
		result.append(cumStatusChanges);
		result.append(')');
		return result.toString();
	}

} //UnitInitialConditionsImpl
