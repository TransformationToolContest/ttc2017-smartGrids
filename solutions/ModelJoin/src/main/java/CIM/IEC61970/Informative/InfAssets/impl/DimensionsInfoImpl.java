/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61968.Common.CommonPackage;
import CIM.IEC61968.Common.Location;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfAssets.AssetInfo;
import CIM.IEC61970.Informative.InfAssets.DimensionsInfo;
import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.Specification;

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
 * An implementation of the model object '<em><b>Dimensions Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.DimensionsInfoImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.DimensionsInfoImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.DimensionsInfoImpl#getSizeWidth <em>Size Width</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.DimensionsInfoImpl#getSpecifications <em>Specifications</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.DimensionsInfoImpl#getSizeDepth <em>Size Depth</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.DimensionsInfoImpl#getSizeDiameter <em>Size Diameter</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.DimensionsInfoImpl#getAssetInfos <em>Asset Infos</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.DimensionsInfoImpl#getSizeLength <em>Size Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionsInfoImpl extends IdentifiedObjectImpl implements DimensionsInfo {
	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected String orientation = ORIENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The default value of the '{@link #getSizeWidth() <em>Size Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeWidth()
	 * @generated
	 * @ordered
	 */
	protected static final float SIZE_WIDTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSizeWidth() <em>Size Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeWidth()
	 * @generated
	 * @ordered
	 */
	protected float sizeWidth = SIZE_WIDTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecifications() <em>Specifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Specification> specifications;

	/**
	 * The default value of the '{@link #getSizeDepth() <em>Size Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeDepth()
	 * @generated
	 * @ordered
	 */
	protected static final float SIZE_DEPTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSizeDepth() <em>Size Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeDepth()
	 * @generated
	 * @ordered
	 */
	protected float sizeDepth = SIZE_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSizeDiameter() <em>Size Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeDiameter()
	 * @generated
	 * @ordered
	 */
	protected static final float SIZE_DIAMETER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSizeDiameter() <em>Size Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeDiameter()
	 * @generated
	 * @ordered
	 */
	protected float sizeDiameter = SIZE_DIAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssetInfos() <em>Asset Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<AssetInfo> assetInfos;

	/**
	 * The default value of the '{@link #getSizeLength() <em>Size Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeLength()
	 * @generated
	 * @ordered
	 */
	protected static final float SIZE_LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSizeLength() <em>Size Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeLength()
	 * @generated
	 * @ordered
	 */
	protected float sizeLength = SIZE_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionsInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getDimensionsInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(String newOrientation) {
		String oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.DIMENSIONS_INFO__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectWithInverseResolvingEList<Location>(Location.class, this, InfAssetsPackage.DIMENSIONS_INFO__LOCATIONS, CommonPackage.LOCATION__DIMENSIONS_INFO);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSizeWidth() {
		return sizeWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeWidth(float newSizeWidth) {
		float oldSizeWidth = sizeWidth;
		sizeWidth = newSizeWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.DIMENSIONS_INFO__SIZE_WIDTH, oldSizeWidth, sizeWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specification> getSpecifications() {
		if (specifications == null) {
			specifications = new EObjectWithInverseResolvingEList.ManyInverse<Specification>(Specification.class, this, InfAssetsPackage.DIMENSIONS_INFO__SPECIFICATIONS, InfAssetsPackage.SPECIFICATION__DIMENSIONS_INFOS);
		}
		return specifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSizeDepth() {
		return sizeDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeDepth(float newSizeDepth) {
		float oldSizeDepth = sizeDepth;
		sizeDepth = newSizeDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.DIMENSIONS_INFO__SIZE_DEPTH, oldSizeDepth, sizeDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSizeDiameter() {
		return sizeDiameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeDiameter(float newSizeDiameter) {
		float oldSizeDiameter = sizeDiameter;
		sizeDiameter = newSizeDiameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.DIMENSIONS_INFO__SIZE_DIAMETER, oldSizeDiameter, sizeDiameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssetInfo> getAssetInfos() {
		if (assetInfos == null) {
			assetInfos = new EObjectWithInverseResolvingEList<AssetInfo>(AssetInfo.class, this, InfAssetsPackage.DIMENSIONS_INFO__ASSET_INFOS, InfAssetsPackage.ASSET_INFO__DIMENSIONS_INFO);
		}
		return assetInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSizeLength() {
		return sizeLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeLength(float newSizeLength) {
		float oldSizeLength = sizeLength;
		sizeLength = newSizeLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.DIMENSIONS_INFO__SIZE_LENGTH, oldSizeLength, sizeLength));
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
			case InfAssetsPackage.DIMENSIONS_INFO__LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocations()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.DIMENSIONS_INFO__SPECIFICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecifications()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.DIMENSIONS_INFO__ASSET_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssetInfos()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.DIMENSIONS_INFO__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.DIMENSIONS_INFO__SPECIFICATIONS:
				return ((InternalEList<?>)getSpecifications()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.DIMENSIONS_INFO__ASSET_INFOS:
				return ((InternalEList<?>)getAssetInfos()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.DIMENSIONS_INFO__ORIENTATION:
				return getOrientation();
			case InfAssetsPackage.DIMENSIONS_INFO__LOCATIONS:
				return getLocations();
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_WIDTH:
				return getSizeWidth();
			case InfAssetsPackage.DIMENSIONS_INFO__SPECIFICATIONS:
				return getSpecifications();
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_DEPTH:
				return getSizeDepth();
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_DIAMETER:
				return getSizeDiameter();
			case InfAssetsPackage.DIMENSIONS_INFO__ASSET_INFOS:
				return getAssetInfos();
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_LENGTH:
				return getSizeLength();
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
			case InfAssetsPackage.DIMENSIONS_INFO__ORIENTATION:
				setOrientation((String)newValue);
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_WIDTH:
				setSizeWidth((Float)newValue);
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__SPECIFICATIONS:
				getSpecifications().clear();
				getSpecifications().addAll((Collection<? extends Specification>)newValue);
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_DEPTH:
				setSizeDepth((Float)newValue);
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_DIAMETER:
				setSizeDiameter((Float)newValue);
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__ASSET_INFOS:
				getAssetInfos().clear();
				getAssetInfos().addAll((Collection<? extends AssetInfo>)newValue);
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_LENGTH:
				setSizeLength((Float)newValue);
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
			case InfAssetsPackage.DIMENSIONS_INFO__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__LOCATIONS:
				getLocations().clear();
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_WIDTH:
				setSizeWidth(SIZE_WIDTH_EDEFAULT);
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__SPECIFICATIONS:
				getSpecifications().clear();
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_DEPTH:
				setSizeDepth(SIZE_DEPTH_EDEFAULT);
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_DIAMETER:
				setSizeDiameter(SIZE_DIAMETER_EDEFAULT);
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__ASSET_INFOS:
				getAssetInfos().clear();
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_LENGTH:
				setSizeLength(SIZE_LENGTH_EDEFAULT);
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
			case InfAssetsPackage.DIMENSIONS_INFO__ORIENTATION:
				return ORIENTATION_EDEFAULT == null ? orientation != null : !ORIENTATION_EDEFAULT.equals(orientation);
			case InfAssetsPackage.DIMENSIONS_INFO__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_WIDTH:
				return sizeWidth != SIZE_WIDTH_EDEFAULT;
			case InfAssetsPackage.DIMENSIONS_INFO__SPECIFICATIONS:
				return specifications != null && !specifications.isEmpty();
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_DEPTH:
				return sizeDepth != SIZE_DEPTH_EDEFAULT;
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_DIAMETER:
				return sizeDiameter != SIZE_DIAMETER_EDEFAULT;
			case InfAssetsPackage.DIMENSIONS_INFO__ASSET_INFOS:
				return assetInfos != null && !assetInfos.isEmpty();
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_LENGTH:
				return sizeLength != SIZE_LENGTH_EDEFAULT;
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
		result.append(" (orientation: ");
		result.append(orientation);
		result.append(", sizeWidth: ");
		result.append(sizeWidth);
		result.append(", sizeDepth: ");
		result.append(sizeDepth);
		result.append(", sizeDiameter: ");
		result.append(sizeDiameter);
		result.append(", sizeLength: ");
		result.append(sizeLength);
		result.append(')');
		return result.toString();
	}

} //DimensionsInfoImpl
