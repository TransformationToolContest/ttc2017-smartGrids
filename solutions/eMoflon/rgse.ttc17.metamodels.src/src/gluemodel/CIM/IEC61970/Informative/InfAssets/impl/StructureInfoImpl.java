/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets.impl;

import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import gluemodel.CIM.IEC61970.Informative.InfAssets.MountingConnection;
import gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo;
import gluemodel.CIM.IEC61970.Informative.InfAssets.StructureMaterialKind;
import gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo;

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
 * An implementation of the model object '<em><b>Structure Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.StructureInfoImpl#getStructureSupportInfos <em>Structure Support Infos</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.StructureInfoImpl#getWeedRemovedDate <em>Weed Removed Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.StructureInfoImpl#getFumigantName <em>Fumigant Name</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.StructureInfoImpl#getFumigantAppliedDate <em>Fumigant Applied Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.StructureInfoImpl#isRemoveWeed <em>Remove Weed</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.StructureInfoImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.StructureInfoImpl#getMaterialKind <em>Material Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.StructureInfoImpl#getRatedVoltage <em>Rated Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.StructureInfoImpl#getMountingConnections <em>Mounting Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureInfoImpl extends AssetInfoImpl implements StructureInfo {
	/**
	 * The cached value of the '{@link #getStructureSupportInfos() <em>Structure Support Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureSupportInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureSupportInfo> structureSupportInfos;

	/**
	 * The default value of the '{@link #getWeedRemovedDate() <em>Weed Removed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeedRemovedDate()
	 * @generated
	 * @ordered
	 */
	protected static final String WEED_REMOVED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeedRemovedDate() <em>Weed Removed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeedRemovedDate()
	 * @generated
	 * @ordered
	 */
	protected String weedRemovedDate = WEED_REMOVED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFumigantName() <em>Fumigant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFumigantName()
	 * @generated
	 * @ordered
	 */
	protected static final String FUMIGANT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFumigantName() <em>Fumigant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFumigantName()
	 * @generated
	 * @ordered
	 */
	protected String fumigantName = FUMIGANT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFumigantAppliedDate() <em>Fumigant Applied Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFumigantAppliedDate()
	 * @generated
	 * @ordered
	 */
	protected static final String FUMIGANT_APPLIED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFumigantAppliedDate() <em>Fumigant Applied Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFumigantAppliedDate()
	 * @generated
	 * @ordered
	 */
	protected String fumigantAppliedDate = FUMIGANT_APPLIED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemoveWeed() <em>Remove Weed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveWeed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOVE_WEED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemoveWeed() <em>Remove Weed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveWeed()
	 * @generated
	 * @ordered
	 */
	protected boolean removeWeed = REMOVE_WEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final float HEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected float height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaterialKind() <em>Material Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialKind()
	 * @generated
	 * @ordered
	 */
	protected static final StructureMaterialKind MATERIAL_KIND_EDEFAULT = StructureMaterialKind.STEEL;

	/**
	 * The cached value of the '{@link #getMaterialKind() <em>Material Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialKind()
	 * @generated
	 * @ordered
	 */
	protected StructureMaterialKind materialKind = MATERIAL_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatedVoltage() <em>Rated Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedVoltage() <em>Rated Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedVoltage()
	 * @generated
	 * @ordered
	 */
	protected float ratedVoltage = RATED_VOLTAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMountingConnections() <em>Mounting Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountingConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<MountingConnection> mountingConnections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getStructureInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureSupportInfo> getStructureSupportInfos() {
		if (structureSupportInfos == null) {
			structureSupportInfos = new EObjectWithInverseResolvingEList<StructureSupportInfo>(StructureSupportInfo.class, this, InfAssetsPackage.STRUCTURE_INFO__STRUCTURE_SUPPORT_INFOS, InfAssetsPackage.STRUCTURE_SUPPORT_INFO__SECURED_STRUCTURE);
		}
		return structureSupportInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWeedRemovedDate() {
		return weedRemovedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeedRemovedDate(String newWeedRemovedDate) {
		String oldWeedRemovedDate = weedRemovedDate;
		weedRemovedDate = newWeedRemovedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.STRUCTURE_INFO__WEED_REMOVED_DATE, oldWeedRemovedDate, weedRemovedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFumigantName() {
		return fumigantName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFumigantName(String newFumigantName) {
		String oldFumigantName = fumigantName;
		fumigantName = newFumigantName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.STRUCTURE_INFO__FUMIGANT_NAME, oldFumigantName, fumigantName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFumigantAppliedDate() {
		return fumigantAppliedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFumigantAppliedDate(String newFumigantAppliedDate) {
		String oldFumigantAppliedDate = fumigantAppliedDate;
		fumigantAppliedDate = newFumigantAppliedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.STRUCTURE_INFO__FUMIGANT_APPLIED_DATE, oldFumigantAppliedDate, fumigantAppliedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemoveWeed() {
		return removeWeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoveWeed(boolean newRemoveWeed) {
		boolean oldRemoveWeed = removeWeed;
		removeWeed = newRemoveWeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.STRUCTURE_INFO__REMOVE_WEED, oldRemoveWeed, removeWeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(float newHeight) {
		float oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.STRUCTURE_INFO__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMaterialKind getMaterialKind() {
		return materialKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterialKind(StructureMaterialKind newMaterialKind) {
		StructureMaterialKind oldMaterialKind = materialKind;
		materialKind = newMaterialKind == null ? MATERIAL_KIND_EDEFAULT : newMaterialKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.STRUCTURE_INFO__MATERIAL_KIND, oldMaterialKind, materialKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRatedVoltage() {
		return ratedVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedVoltage(float newRatedVoltage) {
		float oldRatedVoltage = ratedVoltage;
		ratedVoltage = newRatedVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.STRUCTURE_INFO__RATED_VOLTAGE, oldRatedVoltage, ratedVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MountingConnection> getMountingConnections() {
		if (mountingConnections == null) {
			mountingConnections = new EObjectWithInverseResolvingEList.ManyInverse<MountingConnection>(MountingConnection.class, this, InfAssetsPackage.STRUCTURE_INFO__MOUNTING_CONNECTIONS, InfAssetsPackage.MOUNTING_CONNECTION__STRUCTURE_INFOS);
		}
		return mountingConnections;
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
			case InfAssetsPackage.STRUCTURE_INFO__STRUCTURE_SUPPORT_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStructureSupportInfos()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.STRUCTURE_INFO__MOUNTING_CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMountingConnections()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.STRUCTURE_INFO__STRUCTURE_SUPPORT_INFOS:
				return ((InternalEList<?>)getStructureSupportInfos()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.STRUCTURE_INFO__MOUNTING_CONNECTIONS:
				return ((InternalEList<?>)getMountingConnections()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.STRUCTURE_INFO__STRUCTURE_SUPPORT_INFOS:
				return getStructureSupportInfos();
			case InfAssetsPackage.STRUCTURE_INFO__WEED_REMOVED_DATE:
				return getWeedRemovedDate();
			case InfAssetsPackage.STRUCTURE_INFO__FUMIGANT_NAME:
				return getFumigantName();
			case InfAssetsPackage.STRUCTURE_INFO__FUMIGANT_APPLIED_DATE:
				return getFumigantAppliedDate();
			case InfAssetsPackage.STRUCTURE_INFO__REMOVE_WEED:
				return isRemoveWeed();
			case InfAssetsPackage.STRUCTURE_INFO__HEIGHT:
				return getHeight();
			case InfAssetsPackage.STRUCTURE_INFO__MATERIAL_KIND:
				return getMaterialKind();
			case InfAssetsPackage.STRUCTURE_INFO__RATED_VOLTAGE:
				return getRatedVoltage();
			case InfAssetsPackage.STRUCTURE_INFO__MOUNTING_CONNECTIONS:
				return getMountingConnections();
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
			case InfAssetsPackage.STRUCTURE_INFO__STRUCTURE_SUPPORT_INFOS:
				getStructureSupportInfos().clear();
				getStructureSupportInfos().addAll((Collection<? extends StructureSupportInfo>)newValue);
				return;
			case InfAssetsPackage.STRUCTURE_INFO__WEED_REMOVED_DATE:
				setWeedRemovedDate((String)newValue);
				return;
			case InfAssetsPackage.STRUCTURE_INFO__FUMIGANT_NAME:
				setFumigantName((String)newValue);
				return;
			case InfAssetsPackage.STRUCTURE_INFO__FUMIGANT_APPLIED_DATE:
				setFumigantAppliedDate((String)newValue);
				return;
			case InfAssetsPackage.STRUCTURE_INFO__REMOVE_WEED:
				setRemoveWeed((Boolean)newValue);
				return;
			case InfAssetsPackage.STRUCTURE_INFO__HEIGHT:
				setHeight((Float)newValue);
				return;
			case InfAssetsPackage.STRUCTURE_INFO__MATERIAL_KIND:
				setMaterialKind((StructureMaterialKind)newValue);
				return;
			case InfAssetsPackage.STRUCTURE_INFO__RATED_VOLTAGE:
				setRatedVoltage((Float)newValue);
				return;
			case InfAssetsPackage.STRUCTURE_INFO__MOUNTING_CONNECTIONS:
				getMountingConnections().clear();
				getMountingConnections().addAll((Collection<? extends MountingConnection>)newValue);
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
			case InfAssetsPackage.STRUCTURE_INFO__STRUCTURE_SUPPORT_INFOS:
				getStructureSupportInfos().clear();
				return;
			case InfAssetsPackage.STRUCTURE_INFO__WEED_REMOVED_DATE:
				setWeedRemovedDate(WEED_REMOVED_DATE_EDEFAULT);
				return;
			case InfAssetsPackage.STRUCTURE_INFO__FUMIGANT_NAME:
				setFumigantName(FUMIGANT_NAME_EDEFAULT);
				return;
			case InfAssetsPackage.STRUCTURE_INFO__FUMIGANT_APPLIED_DATE:
				setFumigantAppliedDate(FUMIGANT_APPLIED_DATE_EDEFAULT);
				return;
			case InfAssetsPackage.STRUCTURE_INFO__REMOVE_WEED:
				setRemoveWeed(REMOVE_WEED_EDEFAULT);
				return;
			case InfAssetsPackage.STRUCTURE_INFO__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case InfAssetsPackage.STRUCTURE_INFO__MATERIAL_KIND:
				setMaterialKind(MATERIAL_KIND_EDEFAULT);
				return;
			case InfAssetsPackage.STRUCTURE_INFO__RATED_VOLTAGE:
				setRatedVoltage(RATED_VOLTAGE_EDEFAULT);
				return;
			case InfAssetsPackage.STRUCTURE_INFO__MOUNTING_CONNECTIONS:
				getMountingConnections().clear();
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
			case InfAssetsPackage.STRUCTURE_INFO__STRUCTURE_SUPPORT_INFOS:
				return structureSupportInfos != null && !structureSupportInfos.isEmpty();
			case InfAssetsPackage.STRUCTURE_INFO__WEED_REMOVED_DATE:
				return WEED_REMOVED_DATE_EDEFAULT == null ? weedRemovedDate != null : !WEED_REMOVED_DATE_EDEFAULT.equals(weedRemovedDate);
			case InfAssetsPackage.STRUCTURE_INFO__FUMIGANT_NAME:
				return FUMIGANT_NAME_EDEFAULT == null ? fumigantName != null : !FUMIGANT_NAME_EDEFAULT.equals(fumigantName);
			case InfAssetsPackage.STRUCTURE_INFO__FUMIGANT_APPLIED_DATE:
				return FUMIGANT_APPLIED_DATE_EDEFAULT == null ? fumigantAppliedDate != null : !FUMIGANT_APPLIED_DATE_EDEFAULT.equals(fumigantAppliedDate);
			case InfAssetsPackage.STRUCTURE_INFO__REMOVE_WEED:
				return removeWeed != REMOVE_WEED_EDEFAULT;
			case InfAssetsPackage.STRUCTURE_INFO__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case InfAssetsPackage.STRUCTURE_INFO__MATERIAL_KIND:
				return materialKind != MATERIAL_KIND_EDEFAULT;
			case InfAssetsPackage.STRUCTURE_INFO__RATED_VOLTAGE:
				return ratedVoltage != RATED_VOLTAGE_EDEFAULT;
			case InfAssetsPackage.STRUCTURE_INFO__MOUNTING_CONNECTIONS:
				return mountingConnections != null && !mountingConnections.isEmpty();
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
		result.append(" (weedRemovedDate: ");
		result.append(weedRemovedDate);
		result.append(", fumigantName: ");
		result.append(fumigantName);
		result.append(", fumigantAppliedDate: ");
		result.append(fumigantAppliedDate);
		result.append(", removeWeed: ");
		result.append(removeWeed);
		result.append(", height: ");
		result.append(height);
		result.append(", materialKind: ");
		result.append(materialKind);
		result.append(", ratedVoltage: ");
		result.append(ratedVoltage);
		result.append(')');
		return result.toString();
	}

} //StructureInfoImpl
