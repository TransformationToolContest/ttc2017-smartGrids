/**
 */
package CIM.IEC61970.Informative.MarketOperations.impl;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.RegisteredResource;
import CIM.IEC61970.Informative.MarketOperations.ResourceGroup;
import CIM.IEC61970.Informative.MarketOperations.ResourceGroupReq;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ResourceGroupImpl#getResourceGroupReqs <em>Resource Group Reqs</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ResourceGroupImpl#getRegisteredResources <em>Registered Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceGroupImpl extends IdentifiedObjectImpl implements ResourceGroup {
	/**
	 * The cached value of the '{@link #getResourceGroupReqs() <em>Resource Group Reqs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceGroupReqs()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceGroupReq> resourceGroupReqs;

	/**
	 * The cached value of the '{@link #getRegisteredResources() <em>Registered Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredResources()
	 * @generated
	 * @ordered
	 */
	protected EList<RegisteredResource> registeredResources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.RESOURCE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceGroupReq> getResourceGroupReqs() {
		if (resourceGroupReqs == null) {
			resourceGroupReqs = new EObjectWithInverseResolvingEList<ResourceGroupReq>(ResourceGroupReq.class, this, MarketOperationsPackage.RESOURCE_GROUP__RESOURCE_GROUP_REQS, MarketOperationsPackage.RESOURCE_GROUP_REQ__RESOURCE_GROUP);
		}
		return resourceGroupReqs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegisteredResource> getRegisteredResources() {
		if (registeredResources == null) {
			registeredResources = new EObjectWithInverseResolvingEList.ManyInverse<RegisteredResource>(RegisteredResource.class, this, MarketOperationsPackage.RESOURCE_GROUP__REGISTERED_RESOURCES, MarketOperationsPackage.REGISTERED_RESOURCE__RESOURCE_GROUPS);
		}
		return registeredResources;
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
			case MarketOperationsPackage.RESOURCE_GROUP__RESOURCE_GROUP_REQS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceGroupReqs()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.RESOURCE_GROUP__REGISTERED_RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegisteredResources()).basicAdd(otherEnd, msgs);
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
			case MarketOperationsPackage.RESOURCE_GROUP__RESOURCE_GROUP_REQS:
				return ((InternalEList<?>)getResourceGroupReqs()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.RESOURCE_GROUP__REGISTERED_RESOURCES:
				return ((InternalEList<?>)getRegisteredResources()).basicRemove(otherEnd, msgs);
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
			case MarketOperationsPackage.RESOURCE_GROUP__RESOURCE_GROUP_REQS:
				return getResourceGroupReqs();
			case MarketOperationsPackage.RESOURCE_GROUP__REGISTERED_RESOURCES:
				return getRegisteredResources();
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
			case MarketOperationsPackage.RESOURCE_GROUP__RESOURCE_GROUP_REQS:
				getResourceGroupReqs().clear();
				getResourceGroupReqs().addAll((Collection<? extends ResourceGroupReq>)newValue);
				return;
			case MarketOperationsPackage.RESOURCE_GROUP__REGISTERED_RESOURCES:
				getRegisteredResources().clear();
				getRegisteredResources().addAll((Collection<? extends RegisteredResource>)newValue);
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
			case MarketOperationsPackage.RESOURCE_GROUP__RESOURCE_GROUP_REQS:
				getResourceGroupReqs().clear();
				return;
			case MarketOperationsPackage.RESOURCE_GROUP__REGISTERED_RESOURCES:
				getRegisteredResources().clear();
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
			case MarketOperationsPackage.RESOURCE_GROUP__RESOURCE_GROUP_REQS:
				return resourceGroupReqs != null && !resourceGroupReqs.isEmpty();
			case MarketOperationsPackage.RESOURCE_GROUP__REGISTERED_RESOURCES:
				return registeredResources != null && !registeredResources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceGroupImpl
