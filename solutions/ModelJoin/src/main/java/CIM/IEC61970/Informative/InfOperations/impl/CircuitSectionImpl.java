/**
 */
package CIM.IEC61970.Informative.InfOperations.impl;

import CIM.IEC61970.Core.CorePackage;
import CIM.IEC61970.Core.PowerSystemResource;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfAssets.ConductorAsset;
import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

import CIM.IEC61970.Informative.InfOperations.Circuit;
import CIM.IEC61970.Informative.InfOperations.CircuitConnectionKind;
import CIM.IEC61970.Informative.InfOperations.CircuitSection;
import CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import CIM.IEC61970.Informative.InfOperations.NetworkDataSet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circuit Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.CircuitSectionImpl#getCircuits <em>Circuits</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.CircuitSectionImpl#getNetworkDataSets <em>Network Data Sets</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.CircuitSectionImpl#getPowerSystemResources <em>Power System Resources</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.CircuitSectionImpl#getConnectionKind <em>Connection Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.CircuitSectionImpl#getConductorAssets <em>Conductor Assets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CircuitSectionImpl extends IdentifiedObjectImpl implements CircuitSection {
	/**
	 * The cached value of the '{@link #getCircuits() <em>Circuits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuits()
	 * @generated
	 * @ordered
	 */
	protected EList<Circuit> circuits;

	/**
	 * The cached value of the '{@link #getNetworkDataSets() <em>Network Data Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkDataSets()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkDataSet> networkDataSets;

	/**
	 * The cached value of the '{@link #getPowerSystemResources() <em>Power System Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSystemResources()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerSystemResource> powerSystemResources;

	/**
	 * The default value of the '{@link #getConnectionKind() <em>Connection Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionKind()
	 * @generated
	 * @ordered
	 */
	protected static final CircuitConnectionKind CONNECTION_KIND_EDEFAULT = CircuitConnectionKind.OTHER;

	/**
	 * The cached value of the '{@link #getConnectionKind() <em>Connection Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionKind()
	 * @generated
	 * @ordered
	 */
	protected CircuitConnectionKind connectionKind = CONNECTION_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConductorAssets() <em>Conductor Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductorAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<ConductorAsset> conductorAssets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircuitSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.CIRCUIT_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Circuit> getCircuits() {
		if (circuits == null) {
			circuits = new EObjectResolvingEList<Circuit>(Circuit.class, this, InfOperationsPackage.CIRCUIT_SECTION__CIRCUITS);
		}
		return circuits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkDataSet> getNetworkDataSets() {
		if (networkDataSets == null) {
			networkDataSets = new EObjectWithInverseResolvingEList.ManyInverse<NetworkDataSet>(NetworkDataSet.class, this, InfOperationsPackage.CIRCUIT_SECTION__NETWORK_DATA_SETS, InfOperationsPackage.NETWORK_DATA_SET__CIRCUIT_SECTIONS);
		}
		return networkDataSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerSystemResource> getPowerSystemResources() {
		if (powerSystemResources == null) {
			powerSystemResources = new EObjectWithInverseResolvingEList.ManyInverse<PowerSystemResource>(PowerSystemResource.class, this, InfOperationsPackage.CIRCUIT_SECTION__POWER_SYSTEM_RESOURCES, CorePackage.POWER_SYSTEM_RESOURCE__CIRCUIT_SECTIONS);
		}
		return powerSystemResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitConnectionKind getConnectionKind() {
		return connectionKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionKind(CircuitConnectionKind newConnectionKind) {
		CircuitConnectionKind oldConnectionKind = connectionKind;
		connectionKind = newConnectionKind == null ? CONNECTION_KIND_EDEFAULT : newConnectionKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.CIRCUIT_SECTION__CONNECTION_KIND, oldConnectionKind, connectionKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConductorAsset> getConductorAssets() {
		if (conductorAssets == null) {
			conductorAssets = new EObjectWithInverseResolvingEList<ConductorAsset>(ConductorAsset.class, this, InfOperationsPackage.CIRCUIT_SECTION__CONDUCTOR_ASSETS, InfAssetsPackage.CONDUCTOR_ASSET__CIRCUIT_SECTION);
		}
		return conductorAssets;
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
			case InfOperationsPackage.CIRCUIT_SECTION__NETWORK_DATA_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNetworkDataSets()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.CIRCUIT_SECTION__POWER_SYSTEM_RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerSystemResources()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.CIRCUIT_SECTION__CONDUCTOR_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConductorAssets()).basicAdd(otherEnd, msgs);
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
			case InfOperationsPackage.CIRCUIT_SECTION__NETWORK_DATA_SETS:
				return ((InternalEList<?>)getNetworkDataSets()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.CIRCUIT_SECTION__POWER_SYSTEM_RESOURCES:
				return ((InternalEList<?>)getPowerSystemResources()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.CIRCUIT_SECTION__CONDUCTOR_ASSETS:
				return ((InternalEList<?>)getConductorAssets()).basicRemove(otherEnd, msgs);
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
			case InfOperationsPackage.CIRCUIT_SECTION__CIRCUITS:
				return getCircuits();
			case InfOperationsPackage.CIRCUIT_SECTION__NETWORK_DATA_SETS:
				return getNetworkDataSets();
			case InfOperationsPackage.CIRCUIT_SECTION__POWER_SYSTEM_RESOURCES:
				return getPowerSystemResources();
			case InfOperationsPackage.CIRCUIT_SECTION__CONNECTION_KIND:
				return getConnectionKind();
			case InfOperationsPackage.CIRCUIT_SECTION__CONDUCTOR_ASSETS:
				return getConductorAssets();
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
			case InfOperationsPackage.CIRCUIT_SECTION__CIRCUITS:
				getCircuits().clear();
				getCircuits().addAll((Collection<? extends Circuit>)newValue);
				return;
			case InfOperationsPackage.CIRCUIT_SECTION__NETWORK_DATA_SETS:
				getNetworkDataSets().clear();
				getNetworkDataSets().addAll((Collection<? extends NetworkDataSet>)newValue);
				return;
			case InfOperationsPackage.CIRCUIT_SECTION__POWER_SYSTEM_RESOURCES:
				getPowerSystemResources().clear();
				getPowerSystemResources().addAll((Collection<? extends PowerSystemResource>)newValue);
				return;
			case InfOperationsPackage.CIRCUIT_SECTION__CONNECTION_KIND:
				setConnectionKind((CircuitConnectionKind)newValue);
				return;
			case InfOperationsPackage.CIRCUIT_SECTION__CONDUCTOR_ASSETS:
				getConductorAssets().clear();
				getConductorAssets().addAll((Collection<? extends ConductorAsset>)newValue);
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
			case InfOperationsPackage.CIRCUIT_SECTION__CIRCUITS:
				getCircuits().clear();
				return;
			case InfOperationsPackage.CIRCUIT_SECTION__NETWORK_DATA_SETS:
				getNetworkDataSets().clear();
				return;
			case InfOperationsPackage.CIRCUIT_SECTION__POWER_SYSTEM_RESOURCES:
				getPowerSystemResources().clear();
				return;
			case InfOperationsPackage.CIRCUIT_SECTION__CONNECTION_KIND:
				setConnectionKind(CONNECTION_KIND_EDEFAULT);
				return;
			case InfOperationsPackage.CIRCUIT_SECTION__CONDUCTOR_ASSETS:
				getConductorAssets().clear();
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
			case InfOperationsPackage.CIRCUIT_SECTION__CIRCUITS:
				return circuits != null && !circuits.isEmpty();
			case InfOperationsPackage.CIRCUIT_SECTION__NETWORK_DATA_SETS:
				return networkDataSets != null && !networkDataSets.isEmpty();
			case InfOperationsPackage.CIRCUIT_SECTION__POWER_SYSTEM_RESOURCES:
				return powerSystemResources != null && !powerSystemResources.isEmpty();
			case InfOperationsPackage.CIRCUIT_SECTION__CONNECTION_KIND:
				return connectionKind != CONNECTION_KIND_EDEFAULT;
			case InfOperationsPackage.CIRCUIT_SECTION__CONDUCTOR_ASSETS:
				return conductorAssets != null && !conductorAssets.isEmpty();
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
		result.append(" (connectionKind: ");
		result.append(connectionKind);
		result.append(')');
		return result.toString();
	}

} //CircuitSectionImpl
