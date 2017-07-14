/**
 */
package gluemodel.impl;

import gluemodel.CIM.CIMRoot;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;

import gluemodel.COSEM.COSEMRoot;

import gluemodel.GluemodelPackage;
import gluemodel.MeterAssetMMXUPair;
import gluemodel.MeterAssetPhysicalDevicePair;
import gluemodel.Root;

import gluemodel.substationStandard.LNNodes.LNGroupM.MMXU;
import gluemodel.substationStandard.Substandard;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.impl.RootImpl#getCim <em>Cim</em>}</li>
 *   <li>{@link gluemodel.impl.RootImpl#getCosem <em>Cosem</em>}</li>
 *   <li>{@link gluemodel.impl.RootImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link gluemodel.impl.RootImpl#getSubstandard <em>Substandard</em>}</li>
 *   <li>{@link gluemodel.impl.RootImpl#getMmxus <em>Mmxus</em>}</li>
 *   <li>{@link gluemodel.impl.RootImpl#getMeterAssetToPhysicalDevice <em>Meter Asset To Physical Device</em>}</li>
 *   <li>{@link gluemodel.impl.RootImpl#getMeterAssetToMXXU <em>Meter Asset To MXXU</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root {
	/**
	 * The cached value of the '{@link #getCim() <em>Cim</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCim()
	 * @generated
	 * @ordered
	 */
	protected CIMRoot cim;

	/**
	 * The cached value of the '{@link #getCosem() <em>Cosem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCosem()
	 * @generated
	 * @ordered
	 */
	protected COSEMRoot cosem;

	/**
	 * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<MeterAsset> assets;

	/**
	 * The cached value of the '{@link #getSubstandard() <em>Substandard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstandard()
	 * @generated
	 * @ordered
	 */
	protected Substandard substandard;

	/**
	 * The cached value of the '{@link #getMmxus() <em>Mmxus</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMmxus()
	 * @generated
	 * @ordered
	 */
	protected EList<MMXU> mmxus;

	/**
	 * The cached value of the '{@link #getMeterAssetToPhysicalDevice() <em>Meter Asset To Physical Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterAssetToPhysicalDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<MeterAssetPhysicalDevicePair> meterAssetToPhysicalDevice;

	/**
	 * The cached value of the '{@link #getMeterAssetToMXXU() <em>Meter Asset To MXXU</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterAssetToMXXU()
	 * @generated
	 * @ordered
	 */
	protected EList<MeterAssetMMXUPair> meterAssetToMXXU;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GluemodelPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIMRoot getCim() {
		return cim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCim(CIMRoot newCim, NotificationChain msgs) {
		CIMRoot oldCim = cim;
		cim = newCim;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GluemodelPackage.ROOT__CIM, oldCim, newCim);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCim(CIMRoot newCim) {
		if (newCim != cim) {
			NotificationChain msgs = null;
			if (cim != null)
				msgs = ((InternalEObject)cim).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GluemodelPackage.ROOT__CIM, null, msgs);
			if (newCim != null)
				msgs = ((InternalEObject)newCim).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GluemodelPackage.ROOT__CIM, null, msgs);
			msgs = basicSetCim(newCim, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GluemodelPackage.ROOT__CIM, newCim, newCim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COSEMRoot getCosem() {
		return cosem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCosem(COSEMRoot newCosem, NotificationChain msgs) {
		COSEMRoot oldCosem = cosem;
		cosem = newCosem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GluemodelPackage.ROOT__COSEM, oldCosem, newCosem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCosem(COSEMRoot newCosem) {
		if (newCosem != cosem) {
			NotificationChain msgs = null;
			if (cosem != null)
				msgs = ((InternalEObject)cosem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GluemodelPackage.ROOT__COSEM, null, msgs);
			if (newCosem != null)
				msgs = ((InternalEObject)newCosem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GluemodelPackage.ROOT__COSEM, null, msgs);
			msgs = basicSetCosem(newCosem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GluemodelPackage.ROOT__COSEM, newCosem, newCosem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeterAsset> getAssets() {
		if (assets == null) {
			assets = new EObjectResolvingEList<MeterAsset>(MeterAsset.class, this, GluemodelPackage.ROOT__ASSETS);
		}
		return assets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substandard getSubstandard() {
		return substandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstandard(Substandard newSubstandard, NotificationChain msgs) {
		Substandard oldSubstandard = substandard;
		substandard = newSubstandard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GluemodelPackage.ROOT__SUBSTANDARD, oldSubstandard, newSubstandard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstandard(Substandard newSubstandard) {
		if (newSubstandard != substandard) {
			NotificationChain msgs = null;
			if (substandard != null)
				msgs = ((InternalEObject)substandard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GluemodelPackage.ROOT__SUBSTANDARD, null, msgs);
			if (newSubstandard != null)
				msgs = ((InternalEObject)newSubstandard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GluemodelPackage.ROOT__SUBSTANDARD, null, msgs);
			msgs = basicSetSubstandard(newSubstandard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GluemodelPackage.ROOT__SUBSTANDARD, newSubstandard, newSubstandard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MMXU> getMmxus() {
		if (mmxus == null) {
			mmxus = new EObjectResolvingEList<MMXU>(MMXU.class, this, GluemodelPackage.ROOT__MMXUS);
		}
		return mmxus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeterAssetPhysicalDevicePair> getMeterAssetToPhysicalDevice() {
		if (meterAssetToPhysicalDevice == null) {
			meterAssetToPhysicalDevice = new EObjectContainmentEList<MeterAssetPhysicalDevicePair>(MeterAssetPhysicalDevicePair.class, this, GluemodelPackage.ROOT__METER_ASSET_TO_PHYSICAL_DEVICE);
		}
		return meterAssetToPhysicalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeterAssetMMXUPair> getMeterAssetToMXXU() {
		if (meterAssetToMXXU == null) {
			meterAssetToMXXU = new EObjectContainmentEList<MeterAssetMMXUPair>(MeterAssetMMXUPair.class, this, GluemodelPackage.ROOT__METER_ASSET_TO_MXXU);
		}
		return meterAssetToMXXU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GluemodelPackage.ROOT__CIM:
				return basicSetCim(null, msgs);
			case GluemodelPackage.ROOT__COSEM:
				return basicSetCosem(null, msgs);
			case GluemodelPackage.ROOT__SUBSTANDARD:
				return basicSetSubstandard(null, msgs);
			case GluemodelPackage.ROOT__METER_ASSET_TO_PHYSICAL_DEVICE:
				return ((InternalEList<?>)getMeterAssetToPhysicalDevice()).basicRemove(otherEnd, msgs);
			case GluemodelPackage.ROOT__METER_ASSET_TO_MXXU:
				return ((InternalEList<?>)getMeterAssetToMXXU()).basicRemove(otherEnd, msgs);
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
			case GluemodelPackage.ROOT__CIM:
				return getCim();
			case GluemodelPackage.ROOT__COSEM:
				return getCosem();
			case GluemodelPackage.ROOT__ASSETS:
				return getAssets();
			case GluemodelPackage.ROOT__SUBSTANDARD:
				return getSubstandard();
			case GluemodelPackage.ROOT__MMXUS:
				return getMmxus();
			case GluemodelPackage.ROOT__METER_ASSET_TO_PHYSICAL_DEVICE:
				return getMeterAssetToPhysicalDevice();
			case GluemodelPackage.ROOT__METER_ASSET_TO_MXXU:
				return getMeterAssetToMXXU();
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
			case GluemodelPackage.ROOT__CIM:
				setCim((CIMRoot)newValue);
				return;
			case GluemodelPackage.ROOT__COSEM:
				setCosem((COSEMRoot)newValue);
				return;
			case GluemodelPackage.ROOT__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends MeterAsset>)newValue);
				return;
			case GluemodelPackage.ROOT__SUBSTANDARD:
				setSubstandard((Substandard)newValue);
				return;
			case GluemodelPackage.ROOT__MMXUS:
				getMmxus().clear();
				getMmxus().addAll((Collection<? extends MMXU>)newValue);
				return;
			case GluemodelPackage.ROOT__METER_ASSET_TO_PHYSICAL_DEVICE:
				getMeterAssetToPhysicalDevice().clear();
				getMeterAssetToPhysicalDevice().addAll((Collection<? extends MeterAssetPhysicalDevicePair>)newValue);
				return;
			case GluemodelPackage.ROOT__METER_ASSET_TO_MXXU:
				getMeterAssetToMXXU().clear();
				getMeterAssetToMXXU().addAll((Collection<? extends MeterAssetMMXUPair>)newValue);
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
			case GluemodelPackage.ROOT__CIM:
				setCim((CIMRoot)null);
				return;
			case GluemodelPackage.ROOT__COSEM:
				setCosem((COSEMRoot)null);
				return;
			case GluemodelPackage.ROOT__ASSETS:
				getAssets().clear();
				return;
			case GluemodelPackage.ROOT__SUBSTANDARD:
				setSubstandard((Substandard)null);
				return;
			case GluemodelPackage.ROOT__MMXUS:
				getMmxus().clear();
				return;
			case GluemodelPackage.ROOT__METER_ASSET_TO_PHYSICAL_DEVICE:
				getMeterAssetToPhysicalDevice().clear();
				return;
			case GluemodelPackage.ROOT__METER_ASSET_TO_MXXU:
				getMeterAssetToMXXU().clear();
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
			case GluemodelPackage.ROOT__CIM:
				return cim != null;
			case GluemodelPackage.ROOT__COSEM:
				return cosem != null;
			case GluemodelPackage.ROOT__ASSETS:
				return assets != null && !assets.isEmpty();
			case GluemodelPackage.ROOT__SUBSTANDARD:
				return substandard != null;
			case GluemodelPackage.ROOT__MMXUS:
				return mmxus != null && !mmxus.isEmpty();
			case GluemodelPackage.ROOT__METER_ASSET_TO_PHYSICAL_DEVICE:
				return meterAssetToPhysicalDevice != null && !meterAssetToPhysicalDevice.isEmpty();
			case GluemodelPackage.ROOT__METER_ASSET_TO_MXXU:
				return meterAssetToMXXU != null && !meterAssetToMXXU.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RootImpl
