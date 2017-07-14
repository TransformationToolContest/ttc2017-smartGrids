/**
 */
package gluemodel.CIM.IEC61968.Metering.impl;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;
import gluemodel.CIM.IEC61968.Metering.MeterReading;
import gluemodel.CIM.IEC61968.Metering.MeterServiceWork;
import gluemodel.CIM.IEC61968.Metering.MeteringPackage;

import gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import gluemodel.CIM.IEC61968.PaymentMetering.Transaction;

import gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage;
import gluemodel.CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel;

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
 * An implementation of the model object '<em><b>Meter Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.MeterAssetImpl#getMeterAssetModel <em>Meter Asset Model</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.MeterAssetImpl#getVendingTransactions <em>Vending Transactions</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.MeterAssetImpl#getKR <em>KR</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.MeterAssetImpl#getMeterServiceWorks <em>Meter Service Works</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.MeterAssetImpl#getKH <em>KH</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.MeterAssetImpl#getFormNumber <em>Form Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.MeterAssetImpl#getMeterReadings <em>Meter Readings</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.MeterAssetImpl#getMeterReplacementWorks <em>Meter Replacement Works</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeterAssetImpl extends EndDeviceAssetImpl implements MeterAsset {
	/**
	 * The cached value of the '{@link #getMeterAssetModel() <em>Meter Asset Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterAssetModel()
	 * @generated
	 * @ordered
	 */
	protected MeterAssetModel meterAssetModel;

	/**
	 * The cached value of the '{@link #getVendingTransactions() <em>Vending Transactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendingTransactions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transaction> vendingTransactions;

	/**
	 * The default value of the '{@link #getKR() <em>KR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKR()
	 * @generated
	 * @ordered
	 */
	protected static final float KR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getKR() <em>KR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKR()
	 * @generated
	 * @ordered
	 */
	protected float kR = KR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeterServiceWorks() <em>Meter Service Works</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterServiceWorks()
	 * @generated
	 * @ordered
	 */
	protected EList<MeterServiceWork> meterServiceWorks;

	/**
	 * The default value of the '{@link #getKH() <em>KH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKH()
	 * @generated
	 * @ordered
	 */
	protected static final float KH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getKH() <em>KH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKH()
	 * @generated
	 * @ordered
	 */
	protected float kH = KH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormNumber() <em>Form Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String FORM_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormNumber() <em>Form Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormNumber()
	 * @generated
	 * @ordered
	 */
	protected String formNumber = FORM_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeterReadings() <em>Meter Readings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterReadings()
	 * @generated
	 * @ordered
	 */
	protected EList<MeterReading> meterReadings;

	/**
	 * The cached value of the '{@link #getMeterReplacementWorks() <em>Meter Replacement Works</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterReplacementWorks()
	 * @generated
	 * @ordered
	 */
	protected EList<MeterServiceWork> meterReplacementWorks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeterAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.METER_ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterAssetModel getMeterAssetModel() {
		if (meterAssetModel != null && meterAssetModel.eIsProxy()) {
			InternalEObject oldMeterAssetModel = (InternalEObject)meterAssetModel;
			meterAssetModel = (MeterAssetModel)eResolveProxy(oldMeterAssetModel);
			if (meterAssetModel != oldMeterAssetModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.METER_ASSET__METER_ASSET_MODEL, oldMeterAssetModel, meterAssetModel));
			}
		}
		return meterAssetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterAssetModel basicGetMeterAssetModel() {
		return meterAssetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeterAssetModel(MeterAssetModel newMeterAssetModel, NotificationChain msgs) {
		MeterAssetModel oldMeterAssetModel = meterAssetModel;
		meterAssetModel = newMeterAssetModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.METER_ASSET__METER_ASSET_MODEL, oldMeterAssetModel, newMeterAssetModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeterAssetModel(MeterAssetModel newMeterAssetModel) {
		if (newMeterAssetModel != meterAssetModel) {
			NotificationChain msgs = null;
			if (meterAssetModel != null)
				msgs = ((InternalEObject)meterAssetModel).eInverseRemove(this, InfAssetModelsPackage.METER_ASSET_MODEL__METER_ASSETS, MeterAssetModel.class, msgs);
			if (newMeterAssetModel != null)
				msgs = ((InternalEObject)newMeterAssetModel).eInverseAdd(this, InfAssetModelsPackage.METER_ASSET_MODEL__METER_ASSETS, MeterAssetModel.class, msgs);
			msgs = basicSetMeterAssetModel(newMeterAssetModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.METER_ASSET__METER_ASSET_MODEL, newMeterAssetModel, newMeterAssetModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transaction> getVendingTransactions() {
		if (vendingTransactions == null) {
			vendingTransactions = new EObjectWithInverseResolvingEList<Transaction>(Transaction.class, this, MeteringPackage.METER_ASSET__VENDING_TRANSACTIONS, PaymentMeteringPackage.TRANSACTION__METER_ASSET);
		}
		return vendingTransactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getKR() {
		return kR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKR(float newKR) {
		float oldKR = kR;
		kR = newKR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.METER_ASSET__KR, oldKR, kR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeterServiceWork> getMeterServiceWorks() {
		if (meterServiceWorks == null) {
			meterServiceWorks = new EObjectWithInverseResolvingEList<MeterServiceWork>(MeterServiceWork.class, this, MeteringPackage.METER_ASSET__METER_SERVICE_WORKS, MeteringPackage.METER_SERVICE_WORK__METER_ASSET);
		}
		return meterServiceWorks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getKH() {
		return kH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKH(float newKH) {
		float oldKH = kH;
		kH = newKH;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.METER_ASSET__KH, oldKH, kH));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormNumber() {
		return formNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormNumber(String newFormNumber) {
		String oldFormNumber = formNumber;
		formNumber = newFormNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.METER_ASSET__FORM_NUMBER, oldFormNumber, formNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeterReading> getMeterReadings() {
		if (meterReadings == null) {
			meterReadings = new EObjectWithInverseResolvingEList<MeterReading>(MeterReading.class, this, MeteringPackage.METER_ASSET__METER_READINGS, MeteringPackage.METER_READING__METER_ASSET);
		}
		return meterReadings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeterServiceWork> getMeterReplacementWorks() {
		if (meterReplacementWorks == null) {
			meterReplacementWorks = new EObjectWithInverseResolvingEList<MeterServiceWork>(MeterServiceWork.class, this, MeteringPackage.METER_ASSET__METER_REPLACEMENT_WORKS, MeteringPackage.METER_SERVICE_WORK__OLD_METER_ASSET);
		}
		return meterReplacementWorks;
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
			case MeteringPackage.METER_ASSET__METER_ASSET_MODEL:
				if (meterAssetModel != null)
					msgs = ((InternalEObject)meterAssetModel).eInverseRemove(this, InfAssetModelsPackage.METER_ASSET_MODEL__METER_ASSETS, MeterAssetModel.class, msgs);
				return basicSetMeterAssetModel((MeterAssetModel)otherEnd, msgs);
			case MeteringPackage.METER_ASSET__VENDING_TRANSACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVendingTransactions()).basicAdd(otherEnd, msgs);
			case MeteringPackage.METER_ASSET__METER_SERVICE_WORKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeterServiceWorks()).basicAdd(otherEnd, msgs);
			case MeteringPackage.METER_ASSET__METER_READINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeterReadings()).basicAdd(otherEnd, msgs);
			case MeteringPackage.METER_ASSET__METER_REPLACEMENT_WORKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeterReplacementWorks()).basicAdd(otherEnd, msgs);
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
			case MeteringPackage.METER_ASSET__METER_ASSET_MODEL:
				return basicSetMeterAssetModel(null, msgs);
			case MeteringPackage.METER_ASSET__VENDING_TRANSACTIONS:
				return ((InternalEList<?>)getVendingTransactions()).basicRemove(otherEnd, msgs);
			case MeteringPackage.METER_ASSET__METER_SERVICE_WORKS:
				return ((InternalEList<?>)getMeterServiceWorks()).basicRemove(otherEnd, msgs);
			case MeteringPackage.METER_ASSET__METER_READINGS:
				return ((InternalEList<?>)getMeterReadings()).basicRemove(otherEnd, msgs);
			case MeteringPackage.METER_ASSET__METER_REPLACEMENT_WORKS:
				return ((InternalEList<?>)getMeterReplacementWorks()).basicRemove(otherEnd, msgs);
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
			case MeteringPackage.METER_ASSET__METER_ASSET_MODEL:
				if (resolve) return getMeterAssetModel();
				return basicGetMeterAssetModel();
			case MeteringPackage.METER_ASSET__VENDING_TRANSACTIONS:
				return getVendingTransactions();
			case MeteringPackage.METER_ASSET__KR:
				return getKR();
			case MeteringPackage.METER_ASSET__METER_SERVICE_WORKS:
				return getMeterServiceWorks();
			case MeteringPackage.METER_ASSET__KH:
				return getKH();
			case MeteringPackage.METER_ASSET__FORM_NUMBER:
				return getFormNumber();
			case MeteringPackage.METER_ASSET__METER_READINGS:
				return getMeterReadings();
			case MeteringPackage.METER_ASSET__METER_REPLACEMENT_WORKS:
				return getMeterReplacementWorks();
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
			case MeteringPackage.METER_ASSET__METER_ASSET_MODEL:
				setMeterAssetModel((MeterAssetModel)newValue);
				return;
			case MeteringPackage.METER_ASSET__VENDING_TRANSACTIONS:
				getVendingTransactions().clear();
				getVendingTransactions().addAll((Collection<? extends Transaction>)newValue);
				return;
			case MeteringPackage.METER_ASSET__KR:
				setKR((Float)newValue);
				return;
			case MeteringPackage.METER_ASSET__METER_SERVICE_WORKS:
				getMeterServiceWorks().clear();
				getMeterServiceWorks().addAll((Collection<? extends MeterServiceWork>)newValue);
				return;
			case MeteringPackage.METER_ASSET__KH:
				setKH((Float)newValue);
				return;
			case MeteringPackage.METER_ASSET__FORM_NUMBER:
				setFormNumber((String)newValue);
				return;
			case MeteringPackage.METER_ASSET__METER_READINGS:
				getMeterReadings().clear();
				getMeterReadings().addAll((Collection<? extends MeterReading>)newValue);
				return;
			case MeteringPackage.METER_ASSET__METER_REPLACEMENT_WORKS:
				getMeterReplacementWorks().clear();
				getMeterReplacementWorks().addAll((Collection<? extends MeterServiceWork>)newValue);
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
			case MeteringPackage.METER_ASSET__METER_ASSET_MODEL:
				setMeterAssetModel((MeterAssetModel)null);
				return;
			case MeteringPackage.METER_ASSET__VENDING_TRANSACTIONS:
				getVendingTransactions().clear();
				return;
			case MeteringPackage.METER_ASSET__KR:
				setKR(KR_EDEFAULT);
				return;
			case MeteringPackage.METER_ASSET__METER_SERVICE_WORKS:
				getMeterServiceWorks().clear();
				return;
			case MeteringPackage.METER_ASSET__KH:
				setKH(KH_EDEFAULT);
				return;
			case MeteringPackage.METER_ASSET__FORM_NUMBER:
				setFormNumber(FORM_NUMBER_EDEFAULT);
				return;
			case MeteringPackage.METER_ASSET__METER_READINGS:
				getMeterReadings().clear();
				return;
			case MeteringPackage.METER_ASSET__METER_REPLACEMENT_WORKS:
				getMeterReplacementWorks().clear();
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
			case MeteringPackage.METER_ASSET__METER_ASSET_MODEL:
				return meterAssetModel != null;
			case MeteringPackage.METER_ASSET__VENDING_TRANSACTIONS:
				return vendingTransactions != null && !vendingTransactions.isEmpty();
			case MeteringPackage.METER_ASSET__KR:
				return kR != KR_EDEFAULT;
			case MeteringPackage.METER_ASSET__METER_SERVICE_WORKS:
				return meterServiceWorks != null && !meterServiceWorks.isEmpty();
			case MeteringPackage.METER_ASSET__KH:
				return kH != KH_EDEFAULT;
			case MeteringPackage.METER_ASSET__FORM_NUMBER:
				return FORM_NUMBER_EDEFAULT == null ? formNumber != null : !FORM_NUMBER_EDEFAULT.equals(formNumber);
			case MeteringPackage.METER_ASSET__METER_READINGS:
				return meterReadings != null && !meterReadings.isEmpty();
			case MeteringPackage.METER_ASSET__METER_REPLACEMENT_WORKS:
				return meterReplacementWorks != null && !meterReplacementWorks.isEmpty();
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
		result.append(" (kR: ");
		result.append(kR);
		result.append(", kH: ");
		result.append(kH);
		result.append(", formNumber: ");
		result.append(formNumber);
		result.append(')');
		return result.toString();
	}

} //MeterAssetImpl
