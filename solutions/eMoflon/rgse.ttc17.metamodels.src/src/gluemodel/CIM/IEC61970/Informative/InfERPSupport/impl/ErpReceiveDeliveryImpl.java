/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReceiveDelivery;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Erp Receive Delivery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpReceiveDeliveryImpl#getErpRecDelvLineItems <em>Erp Rec Delv Line Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpReceiveDeliveryImpl extends DocumentImpl implements ErpReceiveDelivery {
	/**
	 * The cached value of the '{@link #getErpRecDelvLineItems() <em>Erp Rec Delv Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpRecDelvLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpRecDelvLineItem> erpRecDelvLineItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpReceiveDeliveryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_RECEIVE_DELIVERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpRecDelvLineItem> getErpRecDelvLineItems() {
		if (erpRecDelvLineItems == null) {
			erpRecDelvLineItems = new EObjectWithInverseResolvingEList<ErpRecDelvLineItem>(ErpRecDelvLineItem.class, this, InfERPSupportPackage.ERP_RECEIVE_DELIVERY__ERP_REC_DELV_LINE_ITEMS, InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_RECEIVE_DELIVERY);
		}
		return erpRecDelvLineItems;
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
			case InfERPSupportPackage.ERP_RECEIVE_DELIVERY__ERP_REC_DELV_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpRecDelvLineItems()).basicAdd(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_RECEIVE_DELIVERY__ERP_REC_DELV_LINE_ITEMS:
				return ((InternalEList<?>)getErpRecDelvLineItems()).basicRemove(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_RECEIVE_DELIVERY__ERP_REC_DELV_LINE_ITEMS:
				return getErpRecDelvLineItems();
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
			case InfERPSupportPackage.ERP_RECEIVE_DELIVERY__ERP_REC_DELV_LINE_ITEMS:
				getErpRecDelvLineItems().clear();
				getErpRecDelvLineItems().addAll((Collection<? extends ErpRecDelvLineItem>)newValue);
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
			case InfERPSupportPackage.ERP_RECEIVE_DELIVERY__ERP_REC_DELV_LINE_ITEMS:
				getErpRecDelvLineItems().clear();
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
			case InfERPSupportPackage.ERP_RECEIVE_DELIVERY__ERP_REC_DELV_LINE_ITEMS:
				return erpRecDelvLineItems != null && !erpRecDelvLineItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErpReceiveDeliveryImpl
