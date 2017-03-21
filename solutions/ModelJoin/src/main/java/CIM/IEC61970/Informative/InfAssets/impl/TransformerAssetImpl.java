/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61968.AssetModels.AssetModelsPackage;
import CIM.IEC61968.AssetModels.TransformerInfo;

import CIM.IEC61968.Assets.impl.AssetImpl;

import CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage;
import CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel;

import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.PowerRating;
import CIM.IEC61970.Informative.InfAssets.TransformerAsset;
import CIM.IEC61970.Informative.InfAssets.TransformerObservation;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Transformer Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.TransformerAssetImpl#getPowerRatings <em>Power Ratings</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.TransformerAssetImpl#getTransformerObservations <em>Transformer Observations</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.TransformerAssetImpl#getReconditionedDateTime <em>Reconditioned Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.TransformerAssetImpl#getTransformerAssetModel <em>Transformer Asset Model</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.TransformerAssetImpl#getTransformerInfo <em>Transformer Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformerAssetImpl extends AssetImpl implements TransformerAsset {
	/**
	 * The cached value of the '{@link #getPowerRatings() <em>Power Ratings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerRatings()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerRating> powerRatings;

	/**
	 * The cached value of the '{@link #getTransformerObservations() <em>Transformer Observations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerObservations()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerObservation> transformerObservations;

	/**
	 * The default value of the '{@link #getReconditionedDateTime() <em>Reconditioned Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconditionedDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date RECONDITIONED_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReconditionedDateTime() <em>Reconditioned Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconditionedDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date reconditionedDateTime = RECONDITIONED_DATE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransformerAssetModel() <em>Transformer Asset Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerAssetModel()
	 * @generated
	 * @ordered
	 */
	protected TransformerAssetModel transformerAssetModel;

	/**
	 * The cached value of the '{@link #getTransformerInfo() <em>Transformer Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerInfo()
	 * @generated
	 * @ordered
	 */
	protected TransformerInfo transformerInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformerAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getTransformerAsset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerRating> getPowerRatings() {
		if (powerRatings == null) {
			powerRatings = new EObjectWithInverseResolvingEList.ManyInverse<PowerRating>(PowerRating.class, this, InfAssetsPackage.TRANSFORMER_ASSET__POWER_RATINGS, InfAssetsPackage.POWER_RATING__TRANSFORMER_ASSETS);
		}
		return powerRatings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformerObservation> getTransformerObservations() {
		if (transformerObservations == null) {
			transformerObservations = new EObjectWithInverseResolvingEList<TransformerObservation>(TransformerObservation.class, this, InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_OBSERVATIONS, InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER_ASSET);
		}
		return transformerObservations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getReconditionedDateTime() {
		return reconditionedDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconditionedDateTime(Date newReconditionedDateTime) {
		Date oldReconditionedDateTime = reconditionedDateTime;
		reconditionedDateTime = newReconditionedDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TRANSFORMER_ASSET__RECONDITIONED_DATE_TIME, oldReconditionedDateTime, reconditionedDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerAssetModel getTransformerAssetModel() {
		if (transformerAssetModel != null && transformerAssetModel.eIsProxy()) {
			InternalEObject oldTransformerAssetModel = (InternalEObject)transformerAssetModel;
			transformerAssetModel = (TransformerAssetModel)eResolveProxy(oldTransformerAssetModel);
			if (transformerAssetModel != oldTransformerAssetModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_ASSET_MODEL, oldTransformerAssetModel, transformerAssetModel));
			}
		}
		return transformerAssetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerAssetModel basicGetTransformerAssetModel() {
		return transformerAssetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerAssetModel(TransformerAssetModel newTransformerAssetModel, NotificationChain msgs) {
		TransformerAssetModel oldTransformerAssetModel = transformerAssetModel;
		transformerAssetModel = newTransformerAssetModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_ASSET_MODEL, oldTransformerAssetModel, newTransformerAssetModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerAssetModel(TransformerAssetModel newTransformerAssetModel) {
		if (newTransformerAssetModel != transformerAssetModel) {
			NotificationChain msgs = null;
			if (transformerAssetModel != null)
				msgs = ((InternalEObject)transformerAssetModel).eInverseRemove(this, InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_ASSETS, TransformerAssetModel.class, msgs);
			if (newTransformerAssetModel != null)
				msgs = ((InternalEObject)newTransformerAssetModel).eInverseAdd(this, InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_ASSETS, TransformerAssetModel.class, msgs);
			msgs = basicSetTransformerAssetModel(newTransformerAssetModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_ASSET_MODEL, newTransformerAssetModel, newTransformerAssetModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerInfo getTransformerInfo() {
		if (transformerInfo != null && transformerInfo.eIsProxy()) {
			InternalEObject oldTransformerInfo = (InternalEObject)transformerInfo;
			transformerInfo = (TransformerInfo)eResolveProxy(oldTransformerInfo);
			if (transformerInfo != oldTransformerInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_INFO, oldTransformerInfo, transformerInfo));
			}
		}
		return transformerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerInfo basicGetTransformerInfo() {
		return transformerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerInfo(TransformerInfo newTransformerInfo, NotificationChain msgs) {
		TransformerInfo oldTransformerInfo = transformerInfo;
		transformerInfo = newTransformerInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_INFO, oldTransformerInfo, newTransformerInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerInfo(TransformerInfo newTransformerInfo) {
		if (newTransformerInfo != transformerInfo) {
			NotificationChain msgs = null;
			if (transformerInfo != null)
				msgs = ((InternalEObject)transformerInfo).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMER_ASSETS, TransformerInfo.class, msgs);
			if (newTransformerInfo != null)
				msgs = ((InternalEObject)newTransformerInfo).eInverseAdd(this, AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMER_ASSETS, TransformerInfo.class, msgs);
			msgs = basicSetTransformerInfo(newTransformerInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_INFO, newTransformerInfo, newTransformerInfo));
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
			case InfAssetsPackage.TRANSFORMER_ASSET__POWER_RATINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerRatings()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_OBSERVATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformerObservations()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_ASSET_MODEL:
				if (transformerAssetModel != null)
					msgs = ((InternalEObject)transformerAssetModel).eInverseRemove(this, InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_ASSETS, TransformerAssetModel.class, msgs);
				return basicSetTransformerAssetModel((TransformerAssetModel)otherEnd, msgs);
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_INFO:
				if (transformerInfo != null)
					msgs = ((InternalEObject)transformerInfo).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMER_ASSETS, TransformerInfo.class, msgs);
				return basicSetTransformerInfo((TransformerInfo)otherEnd, msgs);
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
			case InfAssetsPackage.TRANSFORMER_ASSET__POWER_RATINGS:
				return ((InternalEList<?>)getPowerRatings()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_OBSERVATIONS:
				return ((InternalEList<?>)getTransformerObservations()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_ASSET_MODEL:
				return basicSetTransformerAssetModel(null, msgs);
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_INFO:
				return basicSetTransformerInfo(null, msgs);
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
			case InfAssetsPackage.TRANSFORMER_ASSET__POWER_RATINGS:
				return getPowerRatings();
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_OBSERVATIONS:
				return getTransformerObservations();
			case InfAssetsPackage.TRANSFORMER_ASSET__RECONDITIONED_DATE_TIME:
				return getReconditionedDateTime();
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_ASSET_MODEL:
				if (resolve) return getTransformerAssetModel();
				return basicGetTransformerAssetModel();
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_INFO:
				if (resolve) return getTransformerInfo();
				return basicGetTransformerInfo();
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
			case InfAssetsPackage.TRANSFORMER_ASSET__POWER_RATINGS:
				getPowerRatings().clear();
				getPowerRatings().addAll((Collection<? extends PowerRating>)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_OBSERVATIONS:
				getTransformerObservations().clear();
				getTransformerObservations().addAll((Collection<? extends TransformerObservation>)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_ASSET__RECONDITIONED_DATE_TIME:
				setReconditionedDateTime((Date)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_ASSET_MODEL:
				setTransformerAssetModel((TransformerAssetModel)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_INFO:
				setTransformerInfo((TransformerInfo)newValue);
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
			case InfAssetsPackage.TRANSFORMER_ASSET__POWER_RATINGS:
				getPowerRatings().clear();
				return;
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_OBSERVATIONS:
				getTransformerObservations().clear();
				return;
			case InfAssetsPackage.TRANSFORMER_ASSET__RECONDITIONED_DATE_TIME:
				setReconditionedDateTime(RECONDITIONED_DATE_TIME_EDEFAULT);
				return;
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_ASSET_MODEL:
				setTransformerAssetModel((TransformerAssetModel)null);
				return;
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_INFO:
				setTransformerInfo((TransformerInfo)null);
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
			case InfAssetsPackage.TRANSFORMER_ASSET__POWER_RATINGS:
				return powerRatings != null && !powerRatings.isEmpty();
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_OBSERVATIONS:
				return transformerObservations != null && !transformerObservations.isEmpty();
			case InfAssetsPackage.TRANSFORMER_ASSET__RECONDITIONED_DATE_TIME:
				return RECONDITIONED_DATE_TIME_EDEFAULT == null ? reconditionedDateTime != null : !RECONDITIONED_DATE_TIME_EDEFAULT.equals(reconditionedDateTime);
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_ASSET_MODEL:
				return transformerAssetModel != null;
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_INFO:
				return transformerInfo != null;
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
		result.append(" (reconditionedDateTime: ");
		result.append(reconditionedDateTime);
		result.append(')');
		return result.toString();
	}

} //TransformerAssetImpl
