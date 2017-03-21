/**
 */
package CIM.IEC61970.Informative.MarketOperations.impl;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.RTO;
import CIM.IEC61970.Informative.MarketOperations.ResourceGroup;
import CIM.IEC61970.Informative.MarketOperations.ResourceGroupReq;

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
 * An implementation of the model object '<em><b>Resource Group Req</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ResourceGroupReqImpl#getResourceGroup <em>Resource Group</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ResourceGroupReqImpl#getRTOs <em>RT Os</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceGroupReqImpl extends IdentifiedObjectImpl implements ResourceGroupReq {
	/**
	 * The cached value of the '{@link #getResourceGroup() <em>Resource Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceGroup()
	 * @generated
	 * @ordered
	 */
	protected ResourceGroup resourceGroup;

	/**
	 * The cached value of the '{@link #getRTOs() <em>RT Os</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRTOs()
	 * @generated
	 * @ordered
	 */
	protected EList<RTO> rtOs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceGroupReqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.RESOURCE_GROUP_REQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceGroup getResourceGroup() {
		if (resourceGroup != null && resourceGroup.eIsProxy()) {
			InternalEObject oldResourceGroup = (InternalEObject)resourceGroup;
			resourceGroup = (ResourceGroup)eResolveProxy(oldResourceGroup);
			if (resourceGroup != oldResourceGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.RESOURCE_GROUP_REQ__RESOURCE_GROUP, oldResourceGroup, resourceGroup));
			}
		}
		return resourceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceGroup basicGetResourceGroup() {
		return resourceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceGroup(ResourceGroup newResourceGroup, NotificationChain msgs) {
		ResourceGroup oldResourceGroup = resourceGroup;
		resourceGroup = newResourceGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.RESOURCE_GROUP_REQ__RESOURCE_GROUP, oldResourceGroup, newResourceGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceGroup(ResourceGroup newResourceGroup) {
		if (newResourceGroup != resourceGroup) {
			NotificationChain msgs = null;
			if (resourceGroup != null)
				msgs = ((InternalEObject)resourceGroup).eInverseRemove(this, MarketOperationsPackage.RESOURCE_GROUP__RESOURCE_GROUP_REQS, ResourceGroup.class, msgs);
			if (newResourceGroup != null)
				msgs = ((InternalEObject)newResourceGroup).eInverseAdd(this, MarketOperationsPackage.RESOURCE_GROUP__RESOURCE_GROUP_REQS, ResourceGroup.class, msgs);
			msgs = basicSetResourceGroup(newResourceGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.RESOURCE_GROUP_REQ__RESOURCE_GROUP, newResourceGroup, newResourceGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RTO> getRTOs() {
		if (rtOs == null) {
			rtOs = new EObjectWithInverseResolvingEList.ManyInverse<RTO>(RTO.class, this, MarketOperationsPackage.RESOURCE_GROUP_REQ__RT_OS, MarketOperationsPackage.RTO__RESOURCE_GROUP_REQS);
		}
		return rtOs;
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
			case MarketOperationsPackage.RESOURCE_GROUP_REQ__RESOURCE_GROUP:
				if (resourceGroup != null)
					msgs = ((InternalEObject)resourceGroup).eInverseRemove(this, MarketOperationsPackage.RESOURCE_GROUP__RESOURCE_GROUP_REQS, ResourceGroup.class, msgs);
				return basicSetResourceGroup((ResourceGroup)otherEnd, msgs);
			case MarketOperationsPackage.RESOURCE_GROUP_REQ__RT_OS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRTOs()).basicAdd(otherEnd, msgs);
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
			case MarketOperationsPackage.RESOURCE_GROUP_REQ__RESOURCE_GROUP:
				return basicSetResourceGroup(null, msgs);
			case MarketOperationsPackage.RESOURCE_GROUP_REQ__RT_OS:
				return ((InternalEList<?>)getRTOs()).basicRemove(otherEnd, msgs);
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
			case MarketOperationsPackage.RESOURCE_GROUP_REQ__RESOURCE_GROUP:
				if (resolve) return getResourceGroup();
				return basicGetResourceGroup();
			case MarketOperationsPackage.RESOURCE_GROUP_REQ__RT_OS:
				return getRTOs();
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
			case MarketOperationsPackage.RESOURCE_GROUP_REQ__RESOURCE_GROUP:
				setResourceGroup((ResourceGroup)newValue);
				return;
			case MarketOperationsPackage.RESOURCE_GROUP_REQ__RT_OS:
				getRTOs().clear();
				getRTOs().addAll((Collection<? extends RTO>)newValue);
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
			case MarketOperationsPackage.RESOURCE_GROUP_REQ__RESOURCE_GROUP:
				setResourceGroup((ResourceGroup)null);
				return;
			case MarketOperationsPackage.RESOURCE_GROUP_REQ__RT_OS:
				getRTOs().clear();
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
			case MarketOperationsPackage.RESOURCE_GROUP_REQ__RESOURCE_GROUP:
				return resourceGroup != null;
			case MarketOperationsPackage.RESOURCE_GROUP_REQ__RT_OS:
				return rtOs != null && !rtOs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceGroupReqImpl
