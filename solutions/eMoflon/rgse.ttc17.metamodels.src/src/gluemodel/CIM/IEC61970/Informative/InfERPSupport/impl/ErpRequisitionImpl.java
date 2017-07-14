/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRequisition;
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
 * An implementation of the model object '<em><b>Erp Requisition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpRequisitionImpl#getErpReqLineItems <em>Erp Req Line Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpRequisitionImpl extends DocumentImpl implements ErpRequisition {
	/**
	 * The cached value of the '{@link #getErpReqLineItems() <em>Erp Req Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpReqLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpReqLineItem> erpReqLineItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpRequisitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_REQUISITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpReqLineItem> getErpReqLineItems() {
		if (erpReqLineItems == null) {
			erpReqLineItems = new EObjectWithInverseResolvingEList<ErpReqLineItem>(ErpReqLineItem.class, this, InfERPSupportPackage.ERP_REQUISITION__ERP_REQ_LINE_ITEMS, InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_REQUISITION);
		}
		return erpReqLineItems;
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
			case InfERPSupportPackage.ERP_REQUISITION__ERP_REQ_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpReqLineItems()).basicAdd(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_REQUISITION__ERP_REQ_LINE_ITEMS:
				return ((InternalEList<?>)getErpReqLineItems()).basicRemove(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_REQUISITION__ERP_REQ_LINE_ITEMS:
				return getErpReqLineItems();
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
			case InfERPSupportPackage.ERP_REQUISITION__ERP_REQ_LINE_ITEMS:
				getErpReqLineItems().clear();
				getErpReqLineItems().addAll((Collection<? extends ErpReqLineItem>)newValue);
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
			case InfERPSupportPackage.ERP_REQUISITION__ERP_REQ_LINE_ITEMS:
				getErpReqLineItems().clear();
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
			case InfERPSupportPackage.ERP_REQUISITION__ERP_REQ_LINE_ITEMS:
				return erpReqLineItems != null && !erpReqLineItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErpRequisitionImpl
