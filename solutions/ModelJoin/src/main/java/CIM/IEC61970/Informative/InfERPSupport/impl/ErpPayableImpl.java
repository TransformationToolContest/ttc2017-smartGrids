/**
 */
package CIM.IEC61970.Informative.InfERPSupport.impl;

import CIM.IEC61968.Common.impl.DocumentImpl;

import CIM.IEC61970.Informative.InfERPSupport.ErpPayable;
import CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM.IEC61970.Informative.InfWork.ContractorItem;
import CIM.IEC61970.Informative.InfWork.InfWorkPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Erp Payable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpPayableImpl#getContractorItems <em>Contractor Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpPayableImpl#getErpPayableLineItems <em>Erp Payable Line Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpPayableImpl extends DocumentImpl implements ErpPayable {
	/**
	 * The cached value of the '{@link #getContractorItems() <em>Contractor Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractorItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractorItem> contractorItems;

	/**
	 * The cached value of the '{@link #getErpPayableLineItems() <em>Erp Payable Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPayableLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpPayableLineItem> erpPayableLineItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpPayableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_PAYABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractorItem> getContractorItems() {
		if (contractorItems == null) {
			contractorItems = new EObjectWithInverseResolvingEList.ManyInverse<ContractorItem>(ContractorItem.class, this, InfERPSupportPackage.ERP_PAYABLE__CONTRACTOR_ITEMS, InfWorkPackage.CONTRACTOR_ITEM__ERP_PAYABLES);
		}
		return contractorItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpPayableLineItem> getErpPayableLineItems() {
		if (erpPayableLineItems == null) {
			erpPayableLineItems = new EObjectWithInverseResolvingEList<ErpPayableLineItem>(ErpPayableLineItem.class, this, InfERPSupportPackage.ERP_PAYABLE__ERP_PAYABLE_LINE_ITEMS, InfERPSupportPackage.ERP_PAYABLE_LINE_ITEM__ERP_PAYABLE);
		}
		return erpPayableLineItems;
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
			case InfERPSupportPackage.ERP_PAYABLE__CONTRACTOR_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContractorItems()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PAYABLE__ERP_PAYABLE_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPayableLineItems()).basicAdd(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_PAYABLE__CONTRACTOR_ITEMS:
				return ((InternalEList<?>)getContractorItems()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PAYABLE__ERP_PAYABLE_LINE_ITEMS:
				return ((InternalEList<?>)getErpPayableLineItems()).basicRemove(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_PAYABLE__CONTRACTOR_ITEMS:
				return getContractorItems();
			case InfERPSupportPackage.ERP_PAYABLE__ERP_PAYABLE_LINE_ITEMS:
				return getErpPayableLineItems();
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
			case InfERPSupportPackage.ERP_PAYABLE__CONTRACTOR_ITEMS:
				getContractorItems().clear();
				getContractorItems().addAll((Collection<? extends ContractorItem>)newValue);
				return;
			case InfERPSupportPackage.ERP_PAYABLE__ERP_PAYABLE_LINE_ITEMS:
				getErpPayableLineItems().clear();
				getErpPayableLineItems().addAll((Collection<? extends ErpPayableLineItem>)newValue);
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
			case InfERPSupportPackage.ERP_PAYABLE__CONTRACTOR_ITEMS:
				getContractorItems().clear();
				return;
			case InfERPSupportPackage.ERP_PAYABLE__ERP_PAYABLE_LINE_ITEMS:
				getErpPayableLineItems().clear();
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
			case InfERPSupportPackage.ERP_PAYABLE__CONTRACTOR_ITEMS:
				return contractorItems != null && !contractorItems.isEmpty();
			case InfERPSupportPackage.ERP_PAYABLE__ERP_PAYABLE_LINE_ITEMS:
				return erpPayableLineItems != null && !erpPayableLineItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErpPayableImpl
