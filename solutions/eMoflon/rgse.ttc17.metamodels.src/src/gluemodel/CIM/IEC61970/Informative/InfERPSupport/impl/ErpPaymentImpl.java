/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayment;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

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
 * An implementation of the model object '<em><b>Erp Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPaymentImpl#getErpPayableLineItems <em>Erp Payable Line Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPaymentImpl#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPaymentImpl#getTermsPayment <em>Terms Payment</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPaymentImpl#getErpRecLineItems <em>Erp Rec Line Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpPaymentImpl extends DocumentImpl implements ErpPayment {
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
	 * The cached value of the '{@link #getErpInvoiceLineItems() <em>Erp Invoice Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpInvoiceLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpInvoiceLineItem> erpInvoiceLineItems;

	/**
	 * The default value of the '{@link #getTermsPayment() <em>Terms Payment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermsPayment()
	 * @generated
	 * @ordered
	 */
	protected static final String TERMS_PAYMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTermsPayment() <em>Terms Payment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermsPayment()
	 * @generated
	 * @ordered
	 */
	protected String termsPayment = TERMS_PAYMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErpRecLineItems() <em>Erp Rec Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpRecLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpRecLineItem> erpRecLineItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpPaymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_PAYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpPayableLineItem> getErpPayableLineItems() {
		if (erpPayableLineItems == null) {
			erpPayableLineItems = new EObjectWithInverseResolvingEList.ManyInverse<ErpPayableLineItem>(ErpPayableLineItem.class, this, InfERPSupportPackage.ERP_PAYMENT__ERP_PAYABLE_LINE_ITEMS, InfERPSupportPackage.ERP_PAYABLE_LINE_ITEM__ERP_PAYMENTS);
		}
		return erpPayableLineItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpInvoiceLineItem> getErpInvoiceLineItems() {
		if (erpInvoiceLineItems == null) {
			erpInvoiceLineItems = new EObjectWithInverseResolvingEList.ManyInverse<ErpInvoiceLineItem>(ErpInvoiceLineItem.class, this, InfERPSupportPackage.ERP_PAYMENT__ERP_INVOICE_LINE_ITEMS, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYMENTS);
		}
		return erpInvoiceLineItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTermsPayment() {
		return termsPayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTermsPayment(String newTermsPayment) {
		String oldTermsPayment = termsPayment;
		termsPayment = newTermsPayment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PAYMENT__TERMS_PAYMENT, oldTermsPayment, termsPayment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpRecLineItem> getErpRecLineItems() {
		if (erpRecLineItems == null) {
			erpRecLineItems = new EObjectWithInverseResolvingEList.ManyInverse<ErpRecLineItem>(ErpRecLineItem.class, this, InfERPSupportPackage.ERP_PAYMENT__ERP_REC_LINE_ITEMS, InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_PAYMENTS);
		}
		return erpRecLineItems;
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
			case InfERPSupportPackage.ERP_PAYMENT__ERP_PAYABLE_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPayableLineItems()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PAYMENT__ERP_INVOICE_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpInvoiceLineItems()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PAYMENT__ERP_REC_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpRecLineItems()).basicAdd(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_PAYMENT__ERP_PAYABLE_LINE_ITEMS:
				return ((InternalEList<?>)getErpPayableLineItems()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PAYMENT__ERP_INVOICE_LINE_ITEMS:
				return ((InternalEList<?>)getErpInvoiceLineItems()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PAYMENT__ERP_REC_LINE_ITEMS:
				return ((InternalEList<?>)getErpRecLineItems()).basicRemove(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_PAYMENT__ERP_PAYABLE_LINE_ITEMS:
				return getErpPayableLineItems();
			case InfERPSupportPackage.ERP_PAYMENT__ERP_INVOICE_LINE_ITEMS:
				return getErpInvoiceLineItems();
			case InfERPSupportPackage.ERP_PAYMENT__TERMS_PAYMENT:
				return getTermsPayment();
			case InfERPSupportPackage.ERP_PAYMENT__ERP_REC_LINE_ITEMS:
				return getErpRecLineItems();
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
			case InfERPSupportPackage.ERP_PAYMENT__ERP_PAYABLE_LINE_ITEMS:
				getErpPayableLineItems().clear();
				getErpPayableLineItems().addAll((Collection<? extends ErpPayableLineItem>)newValue);
				return;
			case InfERPSupportPackage.ERP_PAYMENT__ERP_INVOICE_LINE_ITEMS:
				getErpInvoiceLineItems().clear();
				getErpInvoiceLineItems().addAll((Collection<? extends ErpInvoiceLineItem>)newValue);
				return;
			case InfERPSupportPackage.ERP_PAYMENT__TERMS_PAYMENT:
				setTermsPayment((String)newValue);
				return;
			case InfERPSupportPackage.ERP_PAYMENT__ERP_REC_LINE_ITEMS:
				getErpRecLineItems().clear();
				getErpRecLineItems().addAll((Collection<? extends ErpRecLineItem>)newValue);
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
			case InfERPSupportPackage.ERP_PAYMENT__ERP_PAYABLE_LINE_ITEMS:
				getErpPayableLineItems().clear();
				return;
			case InfERPSupportPackage.ERP_PAYMENT__ERP_INVOICE_LINE_ITEMS:
				getErpInvoiceLineItems().clear();
				return;
			case InfERPSupportPackage.ERP_PAYMENT__TERMS_PAYMENT:
				setTermsPayment(TERMS_PAYMENT_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_PAYMENT__ERP_REC_LINE_ITEMS:
				getErpRecLineItems().clear();
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
			case InfERPSupportPackage.ERP_PAYMENT__ERP_PAYABLE_LINE_ITEMS:
				return erpPayableLineItems != null && !erpPayableLineItems.isEmpty();
			case InfERPSupportPackage.ERP_PAYMENT__ERP_INVOICE_LINE_ITEMS:
				return erpInvoiceLineItems != null && !erpInvoiceLineItems.isEmpty();
			case InfERPSupportPackage.ERP_PAYMENT__TERMS_PAYMENT:
				return TERMS_PAYMENT_EDEFAULT == null ? termsPayment != null : !TERMS_PAYMENT_EDEFAULT.equals(termsPayment);
			case InfERPSupportPackage.ERP_PAYMENT__ERP_REC_LINE_ITEMS:
				return erpRecLineItems != null && !erpRecLineItems.isEmpty();
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
		result.append(" (termsPayment: ");
		result.append(termsPayment);
		result.append(')');
		return result.toString();
	}

} //ErpPaymentImpl
