/**
 */
package CIM.IEC61970.Informative.InfERPSupport.impl;

import CIM.IEC61968.Common.impl.DocumentImpl;

import CIM.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem;
import CIM.IEC61970.Informative.InfERPSupport.ErpLedgerBudget;
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
 * An implementation of the model object '<em><b>Erp Ledger Budget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedgerBudgetImpl#getErpLedBudLineItems <em>Erp Led Bud Line Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpLedgerBudgetImpl extends DocumentImpl implements ErpLedgerBudget {
	/**
	 * The cached value of the '{@link #getErpLedBudLineItems() <em>Erp Led Bud Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpLedBudLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpLedBudLineItem> erpLedBudLineItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpLedgerBudgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_LEDGER_BUDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpLedBudLineItem> getErpLedBudLineItems() {
		if (erpLedBudLineItems == null) {
			erpLedBudLineItems = new EObjectWithInverseResolvingEList<ErpLedBudLineItem>(ErpLedBudLineItem.class, this, InfERPSupportPackage.ERP_LEDGER_BUDGET__ERP_LED_BUD_LINE_ITEMS, InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LEDGER_BUDGET);
		}
		return erpLedBudLineItems;
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
			case InfERPSupportPackage.ERP_LEDGER_BUDGET__ERP_LED_BUD_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpLedBudLineItems()).basicAdd(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_LEDGER_BUDGET__ERP_LED_BUD_LINE_ITEMS:
				return ((InternalEList<?>)getErpLedBudLineItems()).basicRemove(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_LEDGER_BUDGET__ERP_LED_BUD_LINE_ITEMS:
				return getErpLedBudLineItems();
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
			case InfERPSupportPackage.ERP_LEDGER_BUDGET__ERP_LED_BUD_LINE_ITEMS:
				getErpLedBudLineItems().clear();
				getErpLedBudLineItems().addAll((Collection<? extends ErpLedBudLineItem>)newValue);
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
			case InfERPSupportPackage.ERP_LEDGER_BUDGET__ERP_LED_BUD_LINE_ITEMS:
				getErpLedBudLineItems().clear();
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
			case InfERPSupportPackage.ERP_LEDGER_BUDGET__ERP_LED_BUD_LINE_ITEMS:
				return erpLedBudLineItems != null && !erpLedBudLineItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErpLedgerBudgetImpl
