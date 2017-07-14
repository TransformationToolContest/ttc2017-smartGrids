/**
 */
package gluemodel.CIM.IEC61968.WiresExt.impl;

import gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage;
import gluemodel.CIM.IEC61968.AssetModels.TransformerInfo;

import gluemodel.CIM.IEC61968.Metering.MeteringPackage;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer;
import gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding;
import gluemodel.CIM.IEC61968.WiresExt.TransformerBank;
import gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage;

import gluemodel.CIM.IEC61970.Core.impl.EquipmentImpl;

import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation;

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
 * An implementation of the model object '<em><b>Distribution Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTransformerImpl#getTransformerBank <em>Transformer Bank</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTransformerImpl#getTransformerObservations <em>Transformer Observations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTransformerImpl#getTransformerInfo <em>Transformer Info</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTransformerImpl#getServiceDeliveryPoints <em>Service Delivery Points</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.DistributionTransformerImpl#getWindings <em>Windings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistributionTransformerImpl extends EquipmentImpl implements DistributionTransformer {
	/**
	 * The cached value of the '{@link #getTransformerBank() <em>Transformer Bank</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerBank()
	 * @generated
	 * @ordered
	 */
	protected TransformerBank transformerBank;

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
	 * The cached value of the '{@link #getTransformerInfo() <em>Transformer Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerInfo()
	 * @generated
	 * @ordered
	 */
	protected TransformerInfo transformerInfo;

	/**
	 * The cached value of the '{@link #getServiceDeliveryPoints() <em>Service Delivery Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDeliveryPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceDeliveryPoint> serviceDeliveryPoints;

	/**
	 * The cached value of the '{@link #getWindings() <em>Windings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindings()
	 * @generated
	 * @ordered
	 */
	protected EList<DistributionTransformerWinding> windings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistributionTransformerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresExtPackage.Literals.DISTRIBUTION_TRANSFORMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerBank getTransformerBank() {
		if (transformerBank != null && transformerBank.eIsProxy()) {
			InternalEObject oldTransformerBank = (InternalEObject)transformerBank;
			transformerBank = (TransformerBank)eResolveProxy(oldTransformerBank);
			if (transformerBank != oldTransformerBank) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_BANK, oldTransformerBank, transformerBank));
			}
		}
		return transformerBank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerBank basicGetTransformerBank() {
		return transformerBank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerBank(TransformerBank newTransformerBank, NotificationChain msgs) {
		TransformerBank oldTransformerBank = transformerBank;
		transformerBank = newTransformerBank;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_BANK, oldTransformerBank, newTransformerBank);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerBank(TransformerBank newTransformerBank) {
		if (newTransformerBank != transformerBank) {
			NotificationChain msgs = null;
			if (transformerBank != null)
				msgs = ((InternalEObject)transformerBank).eInverseRemove(this, WiresExtPackage.TRANSFORMER_BANK__TRANSFORMERS, TransformerBank.class, msgs);
			if (newTransformerBank != null)
				msgs = ((InternalEObject)newTransformerBank).eInverseAdd(this, WiresExtPackage.TRANSFORMER_BANK__TRANSFORMERS, TransformerBank.class, msgs);
			msgs = basicSetTransformerBank(newTransformerBank, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_BANK, newTransformerBank, newTransformerBank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformerObservation> getTransformerObservations() {
		if (transformerObservations == null) {
			transformerObservations = new EObjectWithInverseResolvingEList<TransformerObservation>(TransformerObservation.class, this, WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_OBSERVATIONS, InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER);
		}
		return transformerObservations;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_INFO, oldTransformerInfo, transformerInfo));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_INFO, oldTransformerInfo, newTransformerInfo);
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
				msgs = ((InternalEObject)transformerInfo).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMERS, TransformerInfo.class, msgs);
			if (newTransformerInfo != null)
				msgs = ((InternalEObject)newTransformerInfo).eInverseAdd(this, AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMERS, TransformerInfo.class, msgs);
			msgs = basicSetTransformerInfo(newTransformerInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_INFO, newTransformerInfo, newTransformerInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDeliveryPoint> getServiceDeliveryPoints() {
		if (serviceDeliveryPoints == null) {
			serviceDeliveryPoints = new EObjectWithInverseResolvingEList<ServiceDeliveryPoint>(ServiceDeliveryPoint.class, this, WiresExtPackage.DISTRIBUTION_TRANSFORMER__SERVICE_DELIVERY_POINTS, MeteringPackage.SERVICE_DELIVERY_POINT__TRANSFORMER);
		}
		return serviceDeliveryPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DistributionTransformerWinding> getWindings() {
		if (windings == null) {
			windings = new EObjectWithInverseResolvingEList<DistributionTransformerWinding>(DistributionTransformerWinding.class, this, WiresExtPackage.DISTRIBUTION_TRANSFORMER__WINDINGS, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__TRANSFORMER);
		}
		return windings;
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
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_BANK:
				if (transformerBank != null)
					msgs = ((InternalEObject)transformerBank).eInverseRemove(this, WiresExtPackage.TRANSFORMER_BANK__TRANSFORMERS, TransformerBank.class, msgs);
				return basicSetTransformerBank((TransformerBank)otherEnd, msgs);
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_OBSERVATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformerObservations()).basicAdd(otherEnd, msgs);
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_INFO:
				if (transformerInfo != null)
					msgs = ((InternalEObject)transformerInfo).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMERS, TransformerInfo.class, msgs);
				return basicSetTransformerInfo((TransformerInfo)otherEnd, msgs);
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceDeliveryPoints()).basicAdd(otherEnd, msgs);
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__WINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWindings()).basicAdd(otherEnd, msgs);
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
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_BANK:
				return basicSetTransformerBank(null, msgs);
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_OBSERVATIONS:
				return ((InternalEList<?>)getTransformerObservations()).basicRemove(otherEnd, msgs);
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_INFO:
				return basicSetTransformerInfo(null, msgs);
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<?>)getServiceDeliveryPoints()).basicRemove(otherEnd, msgs);
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__WINDINGS:
				return ((InternalEList<?>)getWindings()).basicRemove(otherEnd, msgs);
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
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_BANK:
				if (resolve) return getTransformerBank();
				return basicGetTransformerBank();
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_OBSERVATIONS:
				return getTransformerObservations();
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_INFO:
				if (resolve) return getTransformerInfo();
				return basicGetTransformerInfo();
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__SERVICE_DELIVERY_POINTS:
				return getServiceDeliveryPoints();
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__WINDINGS:
				return getWindings();
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
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_BANK:
				setTransformerBank((TransformerBank)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_OBSERVATIONS:
				getTransformerObservations().clear();
				getTransformerObservations().addAll((Collection<? extends TransformerObservation>)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_INFO:
				setTransformerInfo((TransformerInfo)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				getServiceDeliveryPoints().addAll((Collection<? extends ServiceDeliveryPoint>)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__WINDINGS:
				getWindings().clear();
				getWindings().addAll((Collection<? extends DistributionTransformerWinding>)newValue);
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
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_BANK:
				setTransformerBank((TransformerBank)null);
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_OBSERVATIONS:
				getTransformerObservations().clear();
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_INFO:
				setTransformerInfo((TransformerInfo)null);
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__WINDINGS:
				getWindings().clear();
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
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_BANK:
				return transformerBank != null;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_OBSERVATIONS:
				return transformerObservations != null && !transformerObservations.isEmpty();
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_INFO:
				return transformerInfo != null;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__SERVICE_DELIVERY_POINTS:
				return serviceDeliveryPoints != null && !serviceDeliveryPoints.isEmpty();
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER__WINDINGS:
				return windings != null && !windings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DistributionTransformerImpl
