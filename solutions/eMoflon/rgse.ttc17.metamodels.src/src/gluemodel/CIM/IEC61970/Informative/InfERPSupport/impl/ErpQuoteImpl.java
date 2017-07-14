/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuote;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem;
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
 * An implementation of the model object '<em><b>Erp Quote</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpQuoteImpl#getErpQuoteLineItems <em>Erp Quote Line Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpQuoteImpl extends DocumentImpl implements ErpQuote {
	/**
	 * The cached value of the '{@link #getErpQuoteLineItems() <em>Erp Quote Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpQuoteLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpQuoteLineItem> erpQuoteLineItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpQuoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_QUOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpQuoteLineItem> getErpQuoteLineItems() {
		if (erpQuoteLineItems == null) {
			erpQuoteLineItems = new EObjectWithInverseResolvingEList<ErpQuoteLineItem>(ErpQuoteLineItem.class, this, InfERPSupportPackage.ERP_QUOTE__ERP_QUOTE_LINE_ITEMS, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_QUOTE);
		}
		return erpQuoteLineItems;
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
			case InfERPSupportPackage.ERP_QUOTE__ERP_QUOTE_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpQuoteLineItems()).basicAdd(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_QUOTE__ERP_QUOTE_LINE_ITEMS:
				return ((InternalEList<?>)getErpQuoteLineItems()).basicRemove(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_QUOTE__ERP_QUOTE_LINE_ITEMS:
				return getErpQuoteLineItems();
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
			case InfERPSupportPackage.ERP_QUOTE__ERP_QUOTE_LINE_ITEMS:
				getErpQuoteLineItems().clear();
				getErpQuoteLineItems().addAll((Collection<? extends ErpQuoteLineItem>)newValue);
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
			case InfERPSupportPackage.ERP_QUOTE__ERP_QUOTE_LINE_ITEMS:
				getErpQuoteLineItems().clear();
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
			case InfERPSupportPackage.ERP_QUOTE__ERP_QUOTE_LINE_ITEMS:
				return erpQuoteLineItems != null && !erpQuoteLineItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErpQuoteImpl
