/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfAssets.CoolingKind;
import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.PowerRating;
import CIM.IEC61970.Informative.InfAssets.TransformerAsset;

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
 * An implementation of the model object '<em><b>Power Rating</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.PowerRatingImpl#getCoolingKind <em>Cooling Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.PowerRatingImpl#getPowerRating <em>Power Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.PowerRatingImpl#getTransformerAssets <em>Transformer Assets</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.PowerRatingImpl#getStage <em>Stage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerRatingImpl extends IdentifiedObjectImpl implements PowerRating {
	/**
	 * The default value of the '{@link #getCoolingKind() <em>Cooling Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolingKind()
	 * @generated
	 * @ordered
	 */
	protected static final CoolingKind COOLING_KIND_EDEFAULT = CoolingKind.SELF_COOLING;

	/**
	 * The cached value of the '{@link #getCoolingKind() <em>Cooling Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolingKind()
	 * @generated
	 * @ordered
	 */
	protected CoolingKind coolingKind = COOLING_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerRating() <em>Power Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerRating()
	 * @generated
	 * @ordered
	 */
	protected static final float POWER_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPowerRating() <em>Power Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerRating()
	 * @generated
	 * @ordered
	 */
	protected float powerRating = POWER_RATING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransformerAssets() <em>Transformer Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerAsset> transformerAssets;

	/**
	 * The default value of the '{@link #getStage() <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected static final int STAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected int stage = STAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerRatingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getPowerRating();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoolingKind getCoolingKind() {
		return coolingKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoolingKind(CoolingKind newCoolingKind) {
		CoolingKind oldCoolingKind = coolingKind;
		coolingKind = newCoolingKind == null ? COOLING_KIND_EDEFAULT : newCoolingKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.POWER_RATING__COOLING_KIND, oldCoolingKind, coolingKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPowerRating() {
		return powerRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerRating(float newPowerRating) {
		float oldPowerRating = powerRating;
		powerRating = newPowerRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.POWER_RATING__POWER_RATING, oldPowerRating, powerRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformerAsset> getTransformerAssets() {
		if (transformerAssets == null) {
			transformerAssets = new EObjectWithInverseResolvingEList.ManyInverse<TransformerAsset>(TransformerAsset.class, this, InfAssetsPackage.POWER_RATING__TRANSFORMER_ASSETS, InfAssetsPackage.TRANSFORMER_ASSET__POWER_RATINGS);
		}
		return transformerAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStage() {
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStage(int newStage) {
		int oldStage = stage;
		stage = newStage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.POWER_RATING__STAGE, oldStage, stage));
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
			case InfAssetsPackage.POWER_RATING__TRANSFORMER_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformerAssets()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.POWER_RATING__TRANSFORMER_ASSETS:
				return ((InternalEList<?>)getTransformerAssets()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.POWER_RATING__COOLING_KIND:
				return getCoolingKind();
			case InfAssetsPackage.POWER_RATING__POWER_RATING:
				return getPowerRating();
			case InfAssetsPackage.POWER_RATING__TRANSFORMER_ASSETS:
				return getTransformerAssets();
			case InfAssetsPackage.POWER_RATING__STAGE:
				return getStage();
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
			case InfAssetsPackage.POWER_RATING__COOLING_KIND:
				setCoolingKind((CoolingKind)newValue);
				return;
			case InfAssetsPackage.POWER_RATING__POWER_RATING:
				setPowerRating((Float)newValue);
				return;
			case InfAssetsPackage.POWER_RATING__TRANSFORMER_ASSETS:
				getTransformerAssets().clear();
				getTransformerAssets().addAll((Collection<? extends TransformerAsset>)newValue);
				return;
			case InfAssetsPackage.POWER_RATING__STAGE:
				setStage((Integer)newValue);
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
			case InfAssetsPackage.POWER_RATING__COOLING_KIND:
				setCoolingKind(COOLING_KIND_EDEFAULT);
				return;
			case InfAssetsPackage.POWER_RATING__POWER_RATING:
				setPowerRating(POWER_RATING_EDEFAULT);
				return;
			case InfAssetsPackage.POWER_RATING__TRANSFORMER_ASSETS:
				getTransformerAssets().clear();
				return;
			case InfAssetsPackage.POWER_RATING__STAGE:
				setStage(STAGE_EDEFAULT);
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
			case InfAssetsPackage.POWER_RATING__COOLING_KIND:
				return coolingKind != COOLING_KIND_EDEFAULT;
			case InfAssetsPackage.POWER_RATING__POWER_RATING:
				return powerRating != POWER_RATING_EDEFAULT;
			case InfAssetsPackage.POWER_RATING__TRANSFORMER_ASSETS:
				return transformerAssets != null && !transformerAssets.isEmpty();
			case InfAssetsPackage.POWER_RATING__STAGE:
				return stage != STAGE_EDEFAULT;
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
		result.append(" (coolingKind: ");
		result.append(coolingKind);
		result.append(", powerRating: ");
		result.append(powerRating);
		result.append(", stage: ");
		result.append(stage);
		result.append(')');
		return result.toString();
	}

} //PowerRatingImpl
