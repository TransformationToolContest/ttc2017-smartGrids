/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61968.Common.CommonPackage;
import CIM.IEC61968.Common.UserAttribute;

import CIM.IEC61968.Common.impl.DocumentImpl;

import CIM.IEC61970.Informative.InfAssets.AssetPropertyCurve;
import CIM.IEC61970.Informative.InfAssets.DimensionsInfo;
import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.Medium;
import CIM.IEC61970.Informative.InfAssets.ReliabilityInfo;
import CIM.IEC61970.Informative.InfAssets.Specification;

import CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM.IEC61970.Informative.InfWork.QualificationRequirement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.SpecificationImpl#getAssetProperites <em>Asset Properites</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.SpecificationImpl#getReliabilityInfos <em>Reliability Infos</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.SpecificationImpl#getRatings <em>Ratings</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.SpecificationImpl#getQualificationRequirements <em>Qualification Requirements</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.SpecificationImpl#getAssetPropertyCurves <em>Asset Property Curves</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.SpecificationImpl#getDimensionsInfos <em>Dimensions Infos</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.SpecificationImpl#getMediums <em>Mediums</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificationImpl extends DocumentImpl implements Specification {
	/**
	 * The cached value of the '{@link #getAssetProperites() <em>Asset Properites</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetProperites()
	 * @generated
	 * @ordered
	 */
	protected EList<UserAttribute> assetProperites;

	/**
	 * The cached value of the '{@link #getReliabilityInfos() <em>Reliability Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliabilityInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<ReliabilityInfo> reliabilityInfos;

	/**
	 * The cached value of the '{@link #getRatings() <em>Ratings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatings()
	 * @generated
	 * @ordered
	 */
	protected EList<UserAttribute> ratings;

	/**
	 * The cached value of the '{@link #getQualificationRequirements() <em>Qualification Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificationRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<QualificationRequirement> qualificationRequirements;

	/**
	 * The cached value of the '{@link #getAssetPropertyCurves() <em>Asset Property Curves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetPropertyCurves()
	 * @generated
	 * @ordered
	 */
	protected EList<AssetPropertyCurve> assetPropertyCurves;

	/**
	 * The cached value of the '{@link #getDimensionsInfos() <em>Dimensions Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionsInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<DimensionsInfo> dimensionsInfos;

	/**
	 * The cached value of the '{@link #getMediums() <em>Mediums</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediums()
	 * @generated
	 * @ordered
	 */
	protected EList<Medium> mediums;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getSpecification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserAttribute> getAssetProperites() {
		if (assetProperites == null) {
			assetProperites = new EObjectWithInverseResolvingEList<UserAttribute>(UserAttribute.class, this, InfAssetsPackage.SPECIFICATION__ASSET_PROPERITES, CommonPackage.USER_ATTRIBUTE__PROPERTY_SPECIFICATION);
		}
		return assetProperites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReliabilityInfo> getReliabilityInfos() {
		if (reliabilityInfos == null) {
			reliabilityInfos = new EObjectWithInverseResolvingEList<ReliabilityInfo>(ReliabilityInfo.class, this, InfAssetsPackage.SPECIFICATION__RELIABILITY_INFOS, InfAssetsPackage.RELIABILITY_INFO__SPECIFICATION);
		}
		return reliabilityInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserAttribute> getRatings() {
		if (ratings == null) {
			ratings = new EObjectWithInverseResolvingEList<UserAttribute>(UserAttribute.class, this, InfAssetsPackage.SPECIFICATION__RATINGS, CommonPackage.USER_ATTRIBUTE__RATING_SPECIFICATION);
		}
		return ratings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QualificationRequirement> getQualificationRequirements() {
		if (qualificationRequirements == null) {
			qualificationRequirements = new EObjectWithInverseResolvingEList.ManyInverse<QualificationRequirement>(QualificationRequirement.class, this, InfAssetsPackage.SPECIFICATION__QUALIFICATION_REQUIREMENTS, InfWorkPackage.QUALIFICATION_REQUIREMENT__SPECIFICATIONS);
		}
		return qualificationRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssetPropertyCurve> getAssetPropertyCurves() {
		if (assetPropertyCurves == null) {
			assetPropertyCurves = new EObjectWithInverseResolvingEList<AssetPropertyCurve>(AssetPropertyCurve.class, this, InfAssetsPackage.SPECIFICATION__ASSET_PROPERTY_CURVES, InfAssetsPackage.ASSET_PROPERTY_CURVE__SPECIFICATION);
		}
		return assetPropertyCurves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DimensionsInfo> getDimensionsInfos() {
		if (dimensionsInfos == null) {
			dimensionsInfos = new EObjectWithInverseResolvingEList.ManyInverse<DimensionsInfo>(DimensionsInfo.class, this, InfAssetsPackage.SPECIFICATION__DIMENSIONS_INFOS, InfAssetsPackage.DIMENSIONS_INFO__SPECIFICATIONS);
		}
		return dimensionsInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Medium> getMediums() {
		if (mediums == null) {
			mediums = new EObjectWithInverseResolvingEList<Medium>(Medium.class, this, InfAssetsPackage.SPECIFICATION__MEDIUMS, InfAssetsPackage.MEDIUM__SPECIFICATION);
		}
		return mediums;
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
			case InfAssetsPackage.SPECIFICATION__ASSET_PROPERITES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssetProperites()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.SPECIFICATION__RELIABILITY_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReliabilityInfos()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.SPECIFICATION__RATINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRatings()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.SPECIFICATION__QUALIFICATION_REQUIREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getQualificationRequirements()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.SPECIFICATION__ASSET_PROPERTY_CURVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssetPropertyCurves()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.SPECIFICATION__DIMENSIONS_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDimensionsInfos()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.SPECIFICATION__MEDIUMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMediums()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.SPECIFICATION__ASSET_PROPERITES:
				return ((InternalEList<?>)getAssetProperites()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.SPECIFICATION__RELIABILITY_INFOS:
				return ((InternalEList<?>)getReliabilityInfos()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.SPECIFICATION__RATINGS:
				return ((InternalEList<?>)getRatings()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.SPECIFICATION__QUALIFICATION_REQUIREMENTS:
				return ((InternalEList<?>)getQualificationRequirements()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.SPECIFICATION__ASSET_PROPERTY_CURVES:
				return ((InternalEList<?>)getAssetPropertyCurves()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.SPECIFICATION__DIMENSIONS_INFOS:
				return ((InternalEList<?>)getDimensionsInfos()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.SPECIFICATION__MEDIUMS:
				return ((InternalEList<?>)getMediums()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.SPECIFICATION__ASSET_PROPERITES:
				return getAssetProperites();
			case InfAssetsPackage.SPECIFICATION__RELIABILITY_INFOS:
				return getReliabilityInfos();
			case InfAssetsPackage.SPECIFICATION__RATINGS:
				return getRatings();
			case InfAssetsPackage.SPECIFICATION__QUALIFICATION_REQUIREMENTS:
				return getQualificationRequirements();
			case InfAssetsPackage.SPECIFICATION__ASSET_PROPERTY_CURVES:
				return getAssetPropertyCurves();
			case InfAssetsPackage.SPECIFICATION__DIMENSIONS_INFOS:
				return getDimensionsInfos();
			case InfAssetsPackage.SPECIFICATION__MEDIUMS:
				return getMediums();
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
			case InfAssetsPackage.SPECIFICATION__ASSET_PROPERITES:
				getAssetProperites().clear();
				getAssetProperites().addAll((Collection<? extends UserAttribute>)newValue);
				return;
			case InfAssetsPackage.SPECIFICATION__RELIABILITY_INFOS:
				getReliabilityInfos().clear();
				getReliabilityInfos().addAll((Collection<? extends ReliabilityInfo>)newValue);
				return;
			case InfAssetsPackage.SPECIFICATION__RATINGS:
				getRatings().clear();
				getRatings().addAll((Collection<? extends UserAttribute>)newValue);
				return;
			case InfAssetsPackage.SPECIFICATION__QUALIFICATION_REQUIREMENTS:
				getQualificationRequirements().clear();
				getQualificationRequirements().addAll((Collection<? extends QualificationRequirement>)newValue);
				return;
			case InfAssetsPackage.SPECIFICATION__ASSET_PROPERTY_CURVES:
				getAssetPropertyCurves().clear();
				getAssetPropertyCurves().addAll((Collection<? extends AssetPropertyCurve>)newValue);
				return;
			case InfAssetsPackage.SPECIFICATION__DIMENSIONS_INFOS:
				getDimensionsInfos().clear();
				getDimensionsInfos().addAll((Collection<? extends DimensionsInfo>)newValue);
				return;
			case InfAssetsPackage.SPECIFICATION__MEDIUMS:
				getMediums().clear();
				getMediums().addAll((Collection<? extends Medium>)newValue);
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
			case InfAssetsPackage.SPECIFICATION__ASSET_PROPERITES:
				getAssetProperites().clear();
				return;
			case InfAssetsPackage.SPECIFICATION__RELIABILITY_INFOS:
				getReliabilityInfos().clear();
				return;
			case InfAssetsPackage.SPECIFICATION__RATINGS:
				getRatings().clear();
				return;
			case InfAssetsPackage.SPECIFICATION__QUALIFICATION_REQUIREMENTS:
				getQualificationRequirements().clear();
				return;
			case InfAssetsPackage.SPECIFICATION__ASSET_PROPERTY_CURVES:
				getAssetPropertyCurves().clear();
				return;
			case InfAssetsPackage.SPECIFICATION__DIMENSIONS_INFOS:
				getDimensionsInfos().clear();
				return;
			case InfAssetsPackage.SPECIFICATION__MEDIUMS:
				getMediums().clear();
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
			case InfAssetsPackage.SPECIFICATION__ASSET_PROPERITES:
				return assetProperites != null && !assetProperites.isEmpty();
			case InfAssetsPackage.SPECIFICATION__RELIABILITY_INFOS:
				return reliabilityInfos != null && !reliabilityInfos.isEmpty();
			case InfAssetsPackage.SPECIFICATION__RATINGS:
				return ratings != null && !ratings.isEmpty();
			case InfAssetsPackage.SPECIFICATION__QUALIFICATION_REQUIREMENTS:
				return qualificationRequirements != null && !qualificationRequirements.isEmpty();
			case InfAssetsPackage.SPECIFICATION__ASSET_PROPERTY_CURVES:
				return assetPropertyCurves != null && !assetPropertyCurves.isEmpty();
			case InfAssetsPackage.SPECIFICATION__DIMENSIONS_INFOS:
				return dimensionsInfos != null && !dimensionsInfos.isEmpty();
			case InfAssetsPackage.SPECIFICATION__MEDIUMS:
				return mediums != null && !mediums.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecificationImpl
