/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.MountingConnection;
import CIM.IEC61970.Informative.InfAssets.MountingPoint;
import CIM.IEC61970.Informative.InfAssets.StructureInfo;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mounting Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.MountingConnectionImpl#getStructureInfos <em>Structure Infos</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.MountingConnectionImpl#getMountingPoints <em>Mounting Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MountingConnectionImpl extends IdentifiedObjectImpl implements MountingConnection {
	/**
	 * The cached value of the '{@link #getStructureInfos() <em>Structure Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureInfo> structureInfos;

	/**
	 * The cached value of the '{@link #getMountingPoints() <em>Mounting Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountingPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<MountingPoint> mountingPoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MountingConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getMountingConnection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureInfo> getStructureInfos() {
		if (structureInfos == null) {
			structureInfos = new EObjectWithInverseResolvingEList.ManyInverse<StructureInfo>(StructureInfo.class, this, InfAssetsPackage.MOUNTING_CONNECTION__STRUCTURE_INFOS, InfAssetsPackage.STRUCTURE_INFO__MOUNTING_CONNECTIONS);
		}
		return structureInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MountingPoint> getMountingPoints() {
		if (mountingPoints == null) {
			mountingPoints = new EObjectWithInverseResolvingEList.ManyInverse<MountingPoint>(MountingPoint.class, this, InfAssetsPackage.MOUNTING_CONNECTION__MOUNTING_POINTS, InfAssetsPackage.MOUNTING_POINT__CONNECTIONS);
		}
		return mountingPoints;
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
			case InfAssetsPackage.MOUNTING_CONNECTION__STRUCTURE_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStructureInfos()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.MOUNTING_CONNECTION__MOUNTING_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMountingPoints()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.MOUNTING_CONNECTION__STRUCTURE_INFOS:
				return ((InternalEList<?>)getStructureInfos()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.MOUNTING_CONNECTION__MOUNTING_POINTS:
				return ((InternalEList<?>)getMountingPoints()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.MOUNTING_CONNECTION__STRUCTURE_INFOS:
				return getStructureInfos();
			case InfAssetsPackage.MOUNTING_CONNECTION__MOUNTING_POINTS:
				return getMountingPoints();
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
			case InfAssetsPackage.MOUNTING_CONNECTION__STRUCTURE_INFOS:
				getStructureInfos().clear();
				getStructureInfos().addAll((Collection<? extends StructureInfo>)newValue);
				return;
			case InfAssetsPackage.MOUNTING_CONNECTION__MOUNTING_POINTS:
				getMountingPoints().clear();
				getMountingPoints().addAll((Collection<? extends MountingPoint>)newValue);
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
			case InfAssetsPackage.MOUNTING_CONNECTION__STRUCTURE_INFOS:
				getStructureInfos().clear();
				return;
			case InfAssetsPackage.MOUNTING_CONNECTION__MOUNTING_POINTS:
				getMountingPoints().clear();
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
			case InfAssetsPackage.MOUNTING_CONNECTION__STRUCTURE_INFOS:
				return structureInfos != null && !structureInfos.isEmpty();
			case InfAssetsPackage.MOUNTING_CONNECTION__MOUNTING_POINTS:
				return mountingPoints != null && !mountingPoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MountingConnectionImpl
