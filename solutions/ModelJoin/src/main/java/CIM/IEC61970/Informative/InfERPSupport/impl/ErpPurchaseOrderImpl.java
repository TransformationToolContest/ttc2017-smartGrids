/**
 */
package CIM.IEC61970.Informative.InfERPSupport.impl;

import CIM.IEC61968.Common.impl.DocumentImpl;

import CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem;
import CIM.IEC61970.Informative.InfERPSupport.ErpPurchaseOrder;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Erp Purchase Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpPurchaseOrderImpl#getErpPOLineItems <em>Erp PO Line Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpPurchaseOrderImpl extends DocumentImpl implements ErpPurchaseOrder {
	/**
	 * The cached value of the '{@link #getErpPOLineItems() <em>Erp PO Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPOLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpPOLineItem> erpPOLineItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpPurchaseOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_PURCHASE_ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpPOLineItem> getErpPOLineItems() {
		if (erpPOLineItems == null) {
			erpPOLineItems = new EObjectWithInverseResolvingEList<ErpPOLineItem>(ErpPOLineItem.class, this, InfERPSupportPackage.ERP_PURCHASE_ORDER__ERP_PO_LINE_ITEMS, InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_PURCHASE_ORDER);
		}
		return erpPOLineItems;
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
			case InfERPSupportPackage.ERP_PURCHASE_ORDER__ERP_PO_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPOLineItems()).basicAdd(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_PURCHASE_ORDER__ERP_PO_LINE_ITEMS:
				return ((InternalEList<?>)getErpPOLineItems()).basicRemove(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_PURCHASE_ORDER__ERP_PO_LINE_ITEMS:
				return getErpPOLineItems();
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
			case InfERPSupportPackage.ERP_PURCHASE_ORDER__ERP_PO_LINE_ITEMS:
				getErpPOLineItems().clear();
				getErpPOLineItems().addAll((Collection<? extends ErpPOLineItem>)newValue);
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
			case InfERPSupportPackage.ERP_PURCHASE_ORDER__ERP_PO_LINE_ITEMS:
				getErpPOLineItems().clear();
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
			case InfERPSupportPackage.ERP_PURCHASE_ORDER__ERP_PO_LINE_ITEMS:
				return erpPOLineItems != null && !erpPOLineItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErpPurchaseOrderImpl
