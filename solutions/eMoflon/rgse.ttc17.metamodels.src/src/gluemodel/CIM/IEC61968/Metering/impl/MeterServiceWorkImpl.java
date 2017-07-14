/**
 */
package gluemodel.CIM.IEC61968.Metering.impl;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;
import gluemodel.CIM.IEC61968.Metering.MeterServiceWork;
import gluemodel.CIM.IEC61968.Metering.MeteringPackage;

import gluemodel.CIM.IEC61968.Work.impl.WorkImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meter Service Work</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.MeterServiceWorkImpl#getOldMeterAsset <em>Old Meter Asset</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.MeterServiceWorkImpl#getMeterAsset <em>Meter Asset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeterServiceWorkImpl extends WorkImpl implements MeterServiceWork {
	/**
	 * The cached value of the '{@link #getOldMeterAsset() <em>Old Meter Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldMeterAsset()
	 * @generated
	 * @ordered
	 */
	protected MeterAsset oldMeterAsset;

	/**
	 * The cached value of the '{@link #getMeterAsset() <em>Meter Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterAsset()
	 * @generated
	 * @ordered
	 */
	protected MeterAsset meterAsset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeterServiceWorkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.METER_SERVICE_WORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterAsset getOldMeterAsset() {
		if (oldMeterAsset != null && oldMeterAsset.eIsProxy()) {
			InternalEObject oldOldMeterAsset = (InternalEObject)oldMeterAsset;
			oldMeterAsset = (MeterAsset)eResolveProxy(oldOldMeterAsset);
			if (oldMeterAsset != oldOldMeterAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.METER_SERVICE_WORK__OLD_METER_ASSET, oldOldMeterAsset, oldMeterAsset));
			}
		}
		return oldMeterAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterAsset basicGetOldMeterAsset() {
		return oldMeterAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOldMeterAsset(MeterAsset newOldMeterAsset, NotificationChain msgs) {
		MeterAsset oldOldMeterAsset = oldMeterAsset;
		oldMeterAsset = newOldMeterAsset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.METER_SERVICE_WORK__OLD_METER_ASSET, oldOldMeterAsset, newOldMeterAsset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldMeterAsset(MeterAsset newOldMeterAsset) {
		if (newOldMeterAsset != oldMeterAsset) {
			NotificationChain msgs = null;
			if (oldMeterAsset != null)
				msgs = ((InternalEObject)oldMeterAsset).eInverseRemove(this, MeteringPackage.METER_ASSET__METER_REPLACEMENT_WORKS, MeterAsset.class, msgs);
			if (newOldMeterAsset != null)
				msgs = ((InternalEObject)newOldMeterAsset).eInverseAdd(this, MeteringPackage.METER_ASSET__METER_REPLACEMENT_WORKS, MeterAsset.class, msgs);
			msgs = basicSetOldMeterAsset(newOldMeterAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.METER_SERVICE_WORK__OLD_METER_ASSET, newOldMeterAsset, newOldMeterAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterAsset getMeterAsset() {
		if (meterAsset != null && meterAsset.eIsProxy()) {
			InternalEObject oldMeterAsset = (InternalEObject)meterAsset;
			meterAsset = (MeterAsset)eResolveProxy(oldMeterAsset);
			if (meterAsset != oldMeterAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.METER_SERVICE_WORK__METER_ASSET, oldMeterAsset, meterAsset));
			}
		}
		return meterAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterAsset basicGetMeterAsset() {
		return meterAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeterAsset(MeterAsset newMeterAsset, NotificationChain msgs) {
		MeterAsset oldMeterAsset = meterAsset;
		meterAsset = newMeterAsset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.METER_SERVICE_WORK__METER_ASSET, oldMeterAsset, newMeterAsset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeterAsset(MeterAsset newMeterAsset) {
		if (newMeterAsset != meterAsset) {
			NotificationChain msgs = null;
			if (meterAsset != null)
				msgs = ((InternalEObject)meterAsset).eInverseRemove(this, MeteringPackage.METER_ASSET__METER_SERVICE_WORKS, MeterAsset.class, msgs);
			if (newMeterAsset != null)
				msgs = ((InternalEObject)newMeterAsset).eInverseAdd(this, MeteringPackage.METER_ASSET__METER_SERVICE_WORKS, MeterAsset.class, msgs);
			msgs = basicSetMeterAsset(newMeterAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.METER_SERVICE_WORK__METER_ASSET, newMeterAsset, newMeterAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeteringPackage.METER_SERVICE_WORK__OLD_METER_ASSET:
				if (oldMeterAsset != null)
					msgs = ((InternalEObject)oldMeterAsset).eInverseRemove(this, MeteringPackage.METER_ASSET__METER_REPLACEMENT_WORKS, MeterAsset.class, msgs);
				return basicSetOldMeterAsset((MeterAsset)otherEnd, msgs);
			case MeteringPackage.METER_SERVICE_WORK__METER_ASSET:
				if (meterAsset != null)
					msgs = ((InternalEObject)meterAsset).eInverseRemove(this, MeteringPackage.METER_ASSET__METER_SERVICE_WORKS, MeterAsset.class, msgs);
				return basicSetMeterAsset((MeterAsset)otherEnd, msgs);
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
			case MeteringPackage.METER_SERVICE_WORK__OLD_METER_ASSET:
				return basicSetOldMeterAsset(null, msgs);
			case MeteringPackage.METER_SERVICE_WORK__METER_ASSET:
				return basicSetMeterAsset(null, msgs);
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
			case MeteringPackage.METER_SERVICE_WORK__OLD_METER_ASSET:
				if (resolve) return getOldMeterAsset();
				return basicGetOldMeterAsset();
			case MeteringPackage.METER_SERVICE_WORK__METER_ASSET:
				if (resolve) return getMeterAsset();
				return basicGetMeterAsset();
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
			case MeteringPackage.METER_SERVICE_WORK__OLD_METER_ASSET:
				setOldMeterAsset((MeterAsset)newValue);
				return;
			case MeteringPackage.METER_SERVICE_WORK__METER_ASSET:
				setMeterAsset((MeterAsset)newValue);
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
			case MeteringPackage.METER_SERVICE_WORK__OLD_METER_ASSET:
				setOldMeterAsset((MeterAsset)null);
				return;
			case MeteringPackage.METER_SERVICE_WORK__METER_ASSET:
				setMeterAsset((MeterAsset)null);
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
			case MeteringPackage.METER_SERVICE_WORK__OLD_METER_ASSET:
				return oldMeterAsset != null;
			case MeteringPackage.METER_SERVICE_WORK__METER_ASSET:
				return meterAsset != null;
		}
		return super.eIsSet(featureID);
	}

} //MeterServiceWorkImpl
