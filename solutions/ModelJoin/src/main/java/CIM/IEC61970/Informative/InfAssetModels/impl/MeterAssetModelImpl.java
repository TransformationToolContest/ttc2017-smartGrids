/**
 */
package CIM.IEC61970.Informative.InfAssetModels.impl;

import CIM.IEC61968.Metering.MeterAsset;
import CIM.IEC61968.Metering.MeteringPackage;

import CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage;
import CIM.IEC61970.Informative.InfAssetModels.MeterAssetModel;

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
 * An implementation of the model object '<em><b>Meter Asset Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.MeterAssetModelImpl#getKH <em>KH</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.MeterAssetModelImpl#isIntervalDataMeter <em>Interval Data Meter</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.MeterAssetModelImpl#getMaxRegisterCount <em>Max Register Count</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.MeterAssetModelImpl#getMeterAssets <em>Meter Assets</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.MeterAssetModelImpl#isKVAhMeter <em>KV Ah Meter</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.MeterAssetModelImpl#getWireCount <em>Wire Count</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.MeterAssetModelImpl#isTimeOfUseMeter <em>Time Of Use Meter</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.MeterAssetModelImpl#isDemandMeter <em>Demand Meter</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.MeterAssetModelImpl#isReactiveMeter <em>Reactive Meter</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.MeterAssetModelImpl#getForm <em>Form</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.MeterAssetModelImpl#getRegisterRatio <em>Register Ratio</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.MeterAssetModelImpl#isKwhMeter <em>Kwh Meter</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.MeterAssetModelImpl#isQMeter <em>QMeter</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.MeterAssetModelImpl#isLoadProfileMeter <em>Load Profile Meter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeterAssetModelImpl extends ElectricalAssetModelImpl implements MeterAssetModel {
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
	 * The default value of the '{@link #isIntervalDataMeter() <em>Interval Data Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIntervalDataMeter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERVAL_DATA_METER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIntervalDataMeter() <em>Interval Data Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIntervalDataMeter()
	 * @generated
	 * @ordered
	 */
	protected boolean intervalDataMeter = INTERVAL_DATA_METER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRegisterCount() <em>Max Register Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRegisterCount()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_REGISTER_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxRegisterCount() <em>Max Register Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRegisterCount()
	 * @generated
	 * @ordered
	 */
	protected int maxRegisterCount = MAX_REGISTER_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeterAssets() <em>Meter Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<MeterAsset> meterAssets;

	/**
	 * The default value of the '{@link #isKVAhMeter() <em>KV Ah Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKVAhMeter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KV_AH_METER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKVAhMeter() <em>KV Ah Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKVAhMeter()
	 * @generated
	 * @ordered
	 */
	protected boolean kVAhMeter = KV_AH_METER_EDEFAULT;

	/**
	 * The default value of the '{@link #getWireCount() <em>Wire Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWireCount()
	 * @generated
	 * @ordered
	 */
	protected static final int WIRE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWireCount() <em>Wire Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWireCount()
	 * @generated
	 * @ordered
	 */
	protected int wireCount = WIRE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #isTimeOfUseMeter() <em>Time Of Use Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTimeOfUseMeter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TIME_OF_USE_METER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTimeOfUseMeter() <em>Time Of Use Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTimeOfUseMeter()
	 * @generated
	 * @ordered
	 */
	protected boolean timeOfUseMeter = TIME_OF_USE_METER_EDEFAULT;

	/**
	 * The default value of the '{@link #isDemandMeter() <em>Demand Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDemandMeter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEMAND_METER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDemandMeter() <em>Demand Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDemandMeter()
	 * @generated
	 * @ordered
	 */
	protected boolean demandMeter = DEMAND_METER_EDEFAULT;

	/**
	 * The default value of the '{@link #isReactiveMeter() <em>Reactive Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReactiveMeter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REACTIVE_METER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReactiveMeter() <em>Reactive Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReactiveMeter()
	 * @generated
	 * @ordered
	 */
	protected boolean reactiveMeter = REACTIVE_METER_EDEFAULT;

	/**
	 * The default value of the '{@link #getForm() <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected static final String FORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected String form = FORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegisterRatio() <em>Register Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterRatio()
	 * @generated
	 * @ordered
	 */
	protected static final float REGISTER_RATIO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRegisterRatio() <em>Register Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterRatio()
	 * @generated
	 * @ordered
	 */
	protected float registerRatio = REGISTER_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #isKwhMeter() <em>Kwh Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKwhMeter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KWH_METER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKwhMeter() <em>Kwh Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKwhMeter()
	 * @generated
	 * @ordered
	 */
	protected boolean kwhMeter = KWH_METER_EDEFAULT;

	/**
	 * The default value of the '{@link #isQMeter() <em>QMeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQMeter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean QMETER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isQMeter() <em>QMeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQMeter()
	 * @generated
	 * @ordered
	 */
	protected boolean qMeter = QMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #isLoadProfileMeter() <em>Load Profile Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoadProfileMeter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOAD_PROFILE_METER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLoadProfileMeter() <em>Load Profile Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoadProfileMeter()
	 * @generated
	 * @ordered
	 */
	protected boolean loadProfileMeter = LOAD_PROFILE_METER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeterAssetModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetModelsPackage.Literals.METER_ASSET_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.METER_ASSET_MODEL__KH, oldKH, kH));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIntervalDataMeter() {
		return intervalDataMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalDataMeter(boolean newIntervalDataMeter) {
		boolean oldIntervalDataMeter = intervalDataMeter;
		intervalDataMeter = newIntervalDataMeter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.METER_ASSET_MODEL__INTERVAL_DATA_METER, oldIntervalDataMeter, intervalDataMeter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxRegisterCount() {
		return maxRegisterCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRegisterCount(int newMaxRegisterCount) {
		int oldMaxRegisterCount = maxRegisterCount;
		maxRegisterCount = newMaxRegisterCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.METER_ASSET_MODEL__MAX_REGISTER_COUNT, oldMaxRegisterCount, maxRegisterCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeterAsset> getMeterAssets() {
		if (meterAssets == null) {
			meterAssets = new EObjectWithInverseResolvingEList<MeterAsset>(MeterAsset.class, this, InfAssetModelsPackage.METER_ASSET_MODEL__METER_ASSETS, MeteringPackage.METER_ASSET__METER_ASSET_MODEL);
		}
		return meterAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isKVAhMeter() {
		return kVAhMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKVAhMeter(boolean newKVAhMeter) {
		boolean oldKVAhMeter = kVAhMeter;
		kVAhMeter = newKVAhMeter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.METER_ASSET_MODEL__KV_AH_METER, oldKVAhMeter, kVAhMeter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWireCount() {
		return wireCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWireCount(int newWireCount) {
		int oldWireCount = wireCount;
		wireCount = newWireCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.METER_ASSET_MODEL__WIRE_COUNT, oldWireCount, wireCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTimeOfUseMeter() {
		return timeOfUseMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeOfUseMeter(boolean newTimeOfUseMeter) {
		boolean oldTimeOfUseMeter = timeOfUseMeter;
		timeOfUseMeter = newTimeOfUseMeter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.METER_ASSET_MODEL__TIME_OF_USE_METER, oldTimeOfUseMeter, timeOfUseMeter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDemandMeter() {
		return demandMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDemandMeter(boolean newDemandMeter) {
		boolean oldDemandMeter = demandMeter;
		demandMeter = newDemandMeter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.METER_ASSET_MODEL__DEMAND_METER, oldDemandMeter, demandMeter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReactiveMeter() {
		return reactiveMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactiveMeter(boolean newReactiveMeter) {
		boolean oldReactiveMeter = reactiveMeter;
		reactiveMeter = newReactiveMeter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.METER_ASSET_MODEL__REACTIVE_METER, oldReactiveMeter, reactiveMeter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(String newForm) {
		String oldForm = form;
		form = newForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.METER_ASSET_MODEL__FORM, oldForm, form));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRegisterRatio() {
		return registerRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterRatio(float newRegisterRatio) {
		float oldRegisterRatio = registerRatio;
		registerRatio = newRegisterRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.METER_ASSET_MODEL__REGISTER_RATIO, oldRegisterRatio, registerRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isKwhMeter() {
		return kwhMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKwhMeter(boolean newKwhMeter) {
		boolean oldKwhMeter = kwhMeter;
		kwhMeter = newKwhMeter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.METER_ASSET_MODEL__KWH_METER, oldKwhMeter, kwhMeter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isQMeter() {
		return qMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQMeter(boolean newQMeter) {
		boolean oldQMeter = qMeter;
		qMeter = newQMeter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.METER_ASSET_MODEL__QMETER, oldQMeter, qMeter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLoadProfileMeter() {
		return loadProfileMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadProfileMeter(boolean newLoadProfileMeter) {
		boolean oldLoadProfileMeter = loadProfileMeter;
		loadProfileMeter = newLoadProfileMeter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.METER_ASSET_MODEL__LOAD_PROFILE_METER, oldLoadProfileMeter, loadProfileMeter));
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
			case InfAssetModelsPackage.METER_ASSET_MODEL__METER_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeterAssets()).basicAdd(otherEnd, msgs);
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
			case InfAssetModelsPackage.METER_ASSET_MODEL__METER_ASSETS:
				return ((InternalEList<?>)getMeterAssets()).basicRemove(otherEnd, msgs);
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
			case InfAssetModelsPackage.METER_ASSET_MODEL__KH:
				return getKH();
			case InfAssetModelsPackage.METER_ASSET_MODEL__INTERVAL_DATA_METER:
				return isIntervalDataMeter();
			case InfAssetModelsPackage.METER_ASSET_MODEL__MAX_REGISTER_COUNT:
				return getMaxRegisterCount();
			case InfAssetModelsPackage.METER_ASSET_MODEL__METER_ASSETS:
				return getMeterAssets();
			case InfAssetModelsPackage.METER_ASSET_MODEL__KV_AH_METER:
				return isKVAhMeter();
			case InfAssetModelsPackage.METER_ASSET_MODEL__WIRE_COUNT:
				return getWireCount();
			case InfAssetModelsPackage.METER_ASSET_MODEL__TIME_OF_USE_METER:
				return isTimeOfUseMeter();
			case InfAssetModelsPackage.METER_ASSET_MODEL__DEMAND_METER:
				return isDemandMeter();
			case InfAssetModelsPackage.METER_ASSET_MODEL__REACTIVE_METER:
				return isReactiveMeter();
			case InfAssetModelsPackage.METER_ASSET_MODEL__FORM:
				return getForm();
			case InfAssetModelsPackage.METER_ASSET_MODEL__REGISTER_RATIO:
				return getRegisterRatio();
			case InfAssetModelsPackage.METER_ASSET_MODEL__KWH_METER:
				return isKwhMeter();
			case InfAssetModelsPackage.METER_ASSET_MODEL__QMETER:
				return isQMeter();
			case InfAssetModelsPackage.METER_ASSET_MODEL__LOAD_PROFILE_METER:
				return isLoadProfileMeter();
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
			case InfAssetModelsPackage.METER_ASSET_MODEL__KH:
				setKH((Float)newValue);
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__INTERVAL_DATA_METER:
				setIntervalDataMeter((Boolean)newValue);
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__MAX_REGISTER_COUNT:
				setMaxRegisterCount((Integer)newValue);
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__METER_ASSETS:
				getMeterAssets().clear();
				getMeterAssets().addAll((Collection<? extends MeterAsset>)newValue);
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__KV_AH_METER:
				setKVAhMeter((Boolean)newValue);
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__WIRE_COUNT:
				setWireCount((Integer)newValue);
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__TIME_OF_USE_METER:
				setTimeOfUseMeter((Boolean)newValue);
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__DEMAND_METER:
				setDemandMeter((Boolean)newValue);
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__REACTIVE_METER:
				setReactiveMeter((Boolean)newValue);
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__FORM:
				setForm((String)newValue);
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__REGISTER_RATIO:
				setRegisterRatio((Float)newValue);
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__KWH_METER:
				setKwhMeter((Boolean)newValue);
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__QMETER:
				setQMeter((Boolean)newValue);
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__LOAD_PROFILE_METER:
				setLoadProfileMeter((Boolean)newValue);
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
			case InfAssetModelsPackage.METER_ASSET_MODEL__KH:
				setKH(KH_EDEFAULT);
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__INTERVAL_DATA_METER:
				setIntervalDataMeter(INTERVAL_DATA_METER_EDEFAULT);
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__MAX_REGISTER_COUNT:
				setMaxRegisterCount(MAX_REGISTER_COUNT_EDEFAULT);
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__METER_ASSETS:
				getMeterAssets().clear();
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__KV_AH_METER:
				setKVAhMeter(KV_AH_METER_EDEFAULT);
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__WIRE_COUNT:
				setWireCount(WIRE_COUNT_EDEFAULT);
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__TIME_OF_USE_METER:
				setTimeOfUseMeter(TIME_OF_USE_METER_EDEFAULT);
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__DEMAND_METER:
				setDemandMeter(DEMAND_METER_EDEFAULT);
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__REACTIVE_METER:
				setReactiveMeter(REACTIVE_METER_EDEFAULT);
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__FORM:
				setForm(FORM_EDEFAULT);
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__REGISTER_RATIO:
				setRegisterRatio(REGISTER_RATIO_EDEFAULT);
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__KWH_METER:
				setKwhMeter(KWH_METER_EDEFAULT);
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__QMETER:
				setQMeter(QMETER_EDEFAULT);
				return;
			case InfAssetModelsPackage.METER_ASSET_MODEL__LOAD_PROFILE_METER:
				setLoadProfileMeter(LOAD_PROFILE_METER_EDEFAULT);
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
			case InfAssetModelsPackage.METER_ASSET_MODEL__KH:
				return kH != KH_EDEFAULT;
			case InfAssetModelsPackage.METER_ASSET_MODEL__INTERVAL_DATA_METER:
				return intervalDataMeter != INTERVAL_DATA_METER_EDEFAULT;
			case InfAssetModelsPackage.METER_ASSET_MODEL__MAX_REGISTER_COUNT:
				return maxRegisterCount != MAX_REGISTER_COUNT_EDEFAULT;
			case InfAssetModelsPackage.METER_ASSET_MODEL__METER_ASSETS:
				return meterAssets != null && !meterAssets.isEmpty();
			case InfAssetModelsPackage.METER_ASSET_MODEL__KV_AH_METER:
				return kVAhMeter != KV_AH_METER_EDEFAULT;
			case InfAssetModelsPackage.METER_ASSET_MODEL__WIRE_COUNT:
				return wireCount != WIRE_COUNT_EDEFAULT;
			case InfAssetModelsPackage.METER_ASSET_MODEL__TIME_OF_USE_METER:
				return timeOfUseMeter != TIME_OF_USE_METER_EDEFAULT;
			case InfAssetModelsPackage.METER_ASSET_MODEL__DEMAND_METER:
				return demandMeter != DEMAND_METER_EDEFAULT;
			case InfAssetModelsPackage.METER_ASSET_MODEL__REACTIVE_METER:
				return reactiveMeter != REACTIVE_METER_EDEFAULT;
			case InfAssetModelsPackage.METER_ASSET_MODEL__FORM:
				return FORM_EDEFAULT == null ? form != null : !FORM_EDEFAULT.equals(form);
			case InfAssetModelsPackage.METER_ASSET_MODEL__REGISTER_RATIO:
				return registerRatio != REGISTER_RATIO_EDEFAULT;
			case InfAssetModelsPackage.METER_ASSET_MODEL__KWH_METER:
				return kwhMeter != KWH_METER_EDEFAULT;
			case InfAssetModelsPackage.METER_ASSET_MODEL__QMETER:
				return qMeter != QMETER_EDEFAULT;
			case InfAssetModelsPackage.METER_ASSET_MODEL__LOAD_PROFILE_METER:
				return loadProfileMeter != LOAD_PROFILE_METER_EDEFAULT;
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
		result.append(" (kH: ");
		result.append(kH);
		result.append(", intervalDataMeter: ");
		result.append(intervalDataMeter);
		result.append(", maxRegisterCount: ");
		result.append(maxRegisterCount);
		result.append(", kVAhMeter: ");
		result.append(kVAhMeter);
		result.append(", wireCount: ");
		result.append(wireCount);
		result.append(", timeOfUseMeter: ");
		result.append(timeOfUseMeter);
		result.append(", demandMeter: ");
		result.append(demandMeter);
		result.append(", reactiveMeter: ");
		result.append(reactiveMeter);
		result.append(", form: ");
		result.append(form);
		result.append(", registerRatio: ");
		result.append(registerRatio);
		result.append(", kwhMeter: ");
		result.append(kwhMeter);
		result.append(", qMeter: ");
		result.append(qMeter);
		result.append(", loadProfileMeter: ");
		result.append(loadProfileMeter);
		result.append(')');
		return result.toString();
	}

} //MeterAssetModelImpl
