/**
 */
package CIM.IEC61968.Common.impl;

import CIM.IEC61968.Assets.Asset;
import CIM.IEC61968.Assets.AssetsPackage;

import CIM.IEC61968.Common.CommonPackage;
import CIM.IEC61968.Common.UserAttribute;

import CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import CIM.IEC61968.PaymentMetering.Transaction;

import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.Procedure;
import CIM.IEC61970.Informative.InfAssets.ProcedureDataSet;
import CIM.IEC61970.Informative.InfAssets.Specification;

import CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem;
import CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM.IEC61970.Informative.MarketOperations.BillDeterminant;
import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem;
import CIM.IEC61970.Informative.MarketOperations.PassThroughBill;

import CIM.impl.ElementImpl;

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
 * An implementation of the model object '<em><b>User Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Common.impl.UserAttributeImpl#getPropertySpecification <em>Property Specification</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.UserAttributeImpl#getPassThroughBills <em>Pass Through Bills</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.UserAttributeImpl#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.UserAttributeImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.UserAttributeImpl#getRatingAssets <em>Rating Assets</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.UserAttributeImpl#getErpLedgerEntries <em>Erp Ledger Entries</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.UserAttributeImpl#getPropertyAssets <em>Property Assets</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.UserAttributeImpl#getErpStatementLineItems <em>Erp Statement Line Items</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.UserAttributeImpl#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.UserAttributeImpl#getProcedureDataSets <em>Procedure Data Sets</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.UserAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.UserAttributeImpl#getRatingSpecification <em>Rating Specification</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.UserAttributeImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.UserAttributeImpl#getBillDeterminants <em>Bill Determinants</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.UserAttributeImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserAttributeImpl extends ElementImpl implements UserAttribute {
	/**
	 * The cached value of the '{@link #getPropertySpecification() <em>Property Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertySpecification()
	 * @generated
	 * @ordered
	 */
	protected Specification propertySpecification;

	/**
	 * The cached value of the '{@link #getPassThroughBills() <em>Pass Through Bills</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassThroughBills()
	 * @generated
	 * @ordered
	 */
	protected EList<PassThroughBill> passThroughBills;

	/**
	 * The cached value of the '{@link #getTransaction() <em>Transaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransaction()
	 * @generated
	 * @ordered
	 */
	protected Transaction transaction;

	/**
	 * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected int sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRatingAssets() <em>Rating Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatingAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> ratingAssets;

	/**
	 * The cached value of the '{@link #getErpLedgerEntries() <em>Erp Ledger Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpLedgerEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpLedgerEntry> erpLedgerEntries;

	/**
	 * The cached value of the '{@link #getPropertyAssets() <em>Property Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> propertyAssets;

	/**
	 * The cached value of the '{@link #getErpStatementLineItems() <em>Erp Statement Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpStatementLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<MarketStatementLineItem> erpStatementLineItems;

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
	 * The cached value of the '{@link #getProcedureDataSets() <em>Procedure Data Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureDataSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedureDataSet> procedureDataSets;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRatingSpecification() <em>Rating Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatingSpecification()
	 * @generated
	 * @ordered
	 */
	protected Specification ratingSpecification;

	/**
	 * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected Procedure procedure;

	/**
	 * The cached value of the '{@link #getBillDeterminants() <em>Bill Determinants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillDeterminants()
	 * @generated
	 * @ordered
	 */
	protected EList<BillDeterminant> billDeterminants;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.USER_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification getPropertySpecification() {
		if (propertySpecification != null && propertySpecification.eIsProxy()) {
			InternalEObject oldPropertySpecification = (InternalEObject)propertySpecification;
			propertySpecification = (Specification)eResolveProxy(oldPropertySpecification);
			if (propertySpecification != oldPropertySpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.USER_ATTRIBUTE__PROPERTY_SPECIFICATION, oldPropertySpecification, propertySpecification));
			}
		}
		return propertySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification basicGetPropertySpecification() {
		return propertySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertySpecification(Specification newPropertySpecification, NotificationChain msgs) {
		Specification oldPropertySpecification = propertySpecification;
		propertySpecification = newPropertySpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.USER_ATTRIBUTE__PROPERTY_SPECIFICATION, oldPropertySpecification, newPropertySpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertySpecification(Specification newPropertySpecification) {
		if (newPropertySpecification != propertySpecification) {
			NotificationChain msgs = null;
			if (propertySpecification != null)
				msgs = ((InternalEObject)propertySpecification).eInverseRemove(this, InfAssetsPackage.SPECIFICATION__ASSET_PROPERITES, Specification.class, msgs);
			if (newPropertySpecification != null)
				msgs = ((InternalEObject)newPropertySpecification).eInverseAdd(this, InfAssetsPackage.SPECIFICATION__ASSET_PROPERITES, Specification.class, msgs);
			msgs = basicSetPropertySpecification(newPropertySpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.USER_ATTRIBUTE__PROPERTY_SPECIFICATION, newPropertySpecification, newPropertySpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PassThroughBill> getPassThroughBills() {
		if (passThroughBills == null) {
			passThroughBills = new EObjectWithInverseResolvingEList.ManyInverse<PassThroughBill>(PassThroughBill.class, this, CommonPackage.USER_ATTRIBUTE__PASS_THROUGH_BILLS, MarketOperationsPackage.PASS_THROUGH_BILL__USER_ATTRIBUTES);
		}
		return passThroughBills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction getTransaction() {
		if (transaction != null && transaction.eIsProxy()) {
			InternalEObject oldTransaction = (InternalEObject)transaction;
			transaction = (Transaction)eResolveProxy(oldTransaction);
			if (transaction != oldTransaction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.USER_ATTRIBUTE__TRANSACTION, oldTransaction, transaction));
			}
		}
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction basicGetTransaction() {
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransaction(Transaction newTransaction, NotificationChain msgs) {
		Transaction oldTransaction = transaction;
		transaction = newTransaction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.USER_ATTRIBUTE__TRANSACTION, oldTransaction, newTransaction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransaction(Transaction newTransaction) {
		if (newTransaction != transaction) {
			NotificationChain msgs = null;
			if (transaction != null)
				msgs = ((InternalEObject)transaction).eInverseRemove(this, PaymentMeteringPackage.TRANSACTION__USER_ATTRIBUTES, Transaction.class, msgs);
			if (newTransaction != null)
				msgs = ((InternalEObject)newTransaction).eInverseAdd(this, PaymentMeteringPackage.TRANSACTION__USER_ATTRIBUTES, Transaction.class, msgs);
			msgs = basicSetTransaction(newTransaction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.USER_ATTRIBUTE__TRANSACTION, newTransaction, newTransaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceNumber(int newSequenceNumber) {
		int oldSequenceNumber = sequenceNumber;
		sequenceNumber = newSequenceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.USER_ATTRIBUTE__SEQUENCE_NUMBER, oldSequenceNumber, sequenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getRatingAssets() {
		if (ratingAssets == null) {
			ratingAssets = new EObjectWithInverseResolvingEList.ManyInverse<Asset>(Asset.class, this, CommonPackage.USER_ATTRIBUTE__RATING_ASSETS, AssetsPackage.ASSET__RATINGS);
		}
		return ratingAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpLedgerEntry> getErpLedgerEntries() {
		if (erpLedgerEntries == null) {
			erpLedgerEntries = new EObjectWithInverseResolvingEList.ManyInverse<ErpLedgerEntry>(ErpLedgerEntry.class, this, CommonPackage.USER_ATTRIBUTE__ERP_LEDGER_ENTRIES, InfERPSupportPackage.ERP_LEDGER_ENTRY__USER_ATTRIBUTES);
		}
		return erpLedgerEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getPropertyAssets() {
		if (propertyAssets == null) {
			propertyAssets = new EObjectWithInverseResolvingEList.ManyInverse<Asset>(Asset.class, this, CommonPackage.USER_ATTRIBUTE__PROPERTY_ASSETS, AssetsPackage.ASSET__PROPERTIES);
		}
		return propertyAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MarketStatementLineItem> getErpStatementLineItems() {
		if (erpStatementLineItems == null) {
			erpStatementLineItems = new EObjectWithInverseResolvingEList.ManyInverse<MarketStatementLineItem>(MarketStatementLineItem.class, this, CommonPackage.USER_ATTRIBUTE__ERP_STATEMENT_LINE_ITEMS, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__USER_ATTRIBUTES);
		}
		return erpStatementLineItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpInvoiceLineItem> getErpInvoiceLineItems() {
		if (erpInvoiceLineItems == null) {
			erpInvoiceLineItems = new EObjectWithInverseResolvingEList.ManyInverse<ErpInvoiceLineItem>(ErpInvoiceLineItem.class, this, CommonPackage.USER_ATTRIBUTE__ERP_INVOICE_LINE_ITEMS, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__USER_ATTRIBUTES);
		}
		return erpInvoiceLineItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureDataSet> getProcedureDataSets() {
		if (procedureDataSets == null) {
			procedureDataSets = new EObjectWithInverseResolvingEList.ManyInverse<ProcedureDataSet>(ProcedureDataSet.class, this, CommonPackage.USER_ATTRIBUTE__PROCEDURE_DATA_SETS, InfAssetsPackage.PROCEDURE_DATA_SET__PROPERTIES);
		}
		return procedureDataSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.USER_ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification getRatingSpecification() {
		if (ratingSpecification != null && ratingSpecification.eIsProxy()) {
			InternalEObject oldRatingSpecification = (InternalEObject)ratingSpecification;
			ratingSpecification = (Specification)eResolveProxy(oldRatingSpecification);
			if (ratingSpecification != oldRatingSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.USER_ATTRIBUTE__RATING_SPECIFICATION, oldRatingSpecification, ratingSpecification));
			}
		}
		return ratingSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification basicGetRatingSpecification() {
		return ratingSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRatingSpecification(Specification newRatingSpecification, NotificationChain msgs) {
		Specification oldRatingSpecification = ratingSpecification;
		ratingSpecification = newRatingSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.USER_ATTRIBUTE__RATING_SPECIFICATION, oldRatingSpecification, newRatingSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatingSpecification(Specification newRatingSpecification) {
		if (newRatingSpecification != ratingSpecification) {
			NotificationChain msgs = null;
			if (ratingSpecification != null)
				msgs = ((InternalEObject)ratingSpecification).eInverseRemove(this, InfAssetsPackage.SPECIFICATION__RATINGS, Specification.class, msgs);
			if (newRatingSpecification != null)
				msgs = ((InternalEObject)newRatingSpecification).eInverseAdd(this, InfAssetsPackage.SPECIFICATION__RATINGS, Specification.class, msgs);
			msgs = basicSetRatingSpecification(newRatingSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.USER_ATTRIBUTE__RATING_SPECIFICATION, newRatingSpecification, newRatingSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure getProcedure() {
		if (procedure != null && procedure.eIsProxy()) {
			InternalEObject oldProcedure = (InternalEObject)procedure;
			procedure = (Procedure)eResolveProxy(oldProcedure);
			if (procedure != oldProcedure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.USER_ATTRIBUTE__PROCEDURE, oldProcedure, procedure));
			}
		}
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure basicGetProcedure() {
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedure(Procedure newProcedure, NotificationChain msgs) {
		Procedure oldProcedure = procedure;
		procedure = newProcedure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.USER_ATTRIBUTE__PROCEDURE, oldProcedure, newProcedure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedure(Procedure newProcedure) {
		if (newProcedure != procedure) {
			NotificationChain msgs = null;
			if (procedure != null)
				msgs = ((InternalEObject)procedure).eInverseRemove(this, InfAssetsPackage.PROCEDURE__PROCEDURE_VALUES, Procedure.class, msgs);
			if (newProcedure != null)
				msgs = ((InternalEObject)newProcedure).eInverseAdd(this, InfAssetsPackage.PROCEDURE__PROCEDURE_VALUES, Procedure.class, msgs);
			msgs = basicSetProcedure(newProcedure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.USER_ATTRIBUTE__PROCEDURE, newProcedure, newProcedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BillDeterminant> getBillDeterminants() {
		if (billDeterminants == null) {
			billDeterminants = new EObjectWithInverseResolvingEList.ManyInverse<BillDeterminant>(BillDeterminant.class, this, CommonPackage.USER_ATTRIBUTE__BILL_DETERMINANTS, MarketOperationsPackage.BILL_DETERMINANT__USER_ATTRIBUTES);
		}
		return billDeterminants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.USER_ATTRIBUTE__VALUE, oldValue, value));
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
			case CommonPackage.USER_ATTRIBUTE__PROPERTY_SPECIFICATION:
				if (propertySpecification != null)
					msgs = ((InternalEObject)propertySpecification).eInverseRemove(this, InfAssetsPackage.SPECIFICATION__ASSET_PROPERITES, Specification.class, msgs);
				return basicSetPropertySpecification((Specification)otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__PASS_THROUGH_BILLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassThroughBills()).basicAdd(otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__TRANSACTION:
				if (transaction != null)
					msgs = ((InternalEObject)transaction).eInverseRemove(this, PaymentMeteringPackage.TRANSACTION__USER_ATTRIBUTES, Transaction.class, msgs);
				return basicSetTransaction((Transaction)otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__RATING_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRatingAssets()).basicAdd(otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__ERP_LEDGER_ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpLedgerEntries()).basicAdd(otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__PROPERTY_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPropertyAssets()).basicAdd(otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__ERP_STATEMENT_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpStatementLineItems()).basicAdd(otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__ERP_INVOICE_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpInvoiceLineItems()).basicAdd(otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__PROCEDURE_DATA_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcedureDataSets()).basicAdd(otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__RATING_SPECIFICATION:
				if (ratingSpecification != null)
					msgs = ((InternalEObject)ratingSpecification).eInverseRemove(this, InfAssetsPackage.SPECIFICATION__RATINGS, Specification.class, msgs);
				return basicSetRatingSpecification((Specification)otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__PROCEDURE:
				if (procedure != null)
					msgs = ((InternalEObject)procedure).eInverseRemove(this, InfAssetsPackage.PROCEDURE__PROCEDURE_VALUES, Procedure.class, msgs);
				return basicSetProcedure((Procedure)otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__BILL_DETERMINANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBillDeterminants()).basicAdd(otherEnd, msgs);
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
			case CommonPackage.USER_ATTRIBUTE__PROPERTY_SPECIFICATION:
				return basicSetPropertySpecification(null, msgs);
			case CommonPackage.USER_ATTRIBUTE__PASS_THROUGH_BILLS:
				return ((InternalEList<?>)getPassThroughBills()).basicRemove(otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__TRANSACTION:
				return basicSetTransaction(null, msgs);
			case CommonPackage.USER_ATTRIBUTE__RATING_ASSETS:
				return ((InternalEList<?>)getRatingAssets()).basicRemove(otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__ERP_LEDGER_ENTRIES:
				return ((InternalEList<?>)getErpLedgerEntries()).basicRemove(otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__PROPERTY_ASSETS:
				return ((InternalEList<?>)getPropertyAssets()).basicRemove(otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__ERP_STATEMENT_LINE_ITEMS:
				return ((InternalEList<?>)getErpStatementLineItems()).basicRemove(otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__ERP_INVOICE_LINE_ITEMS:
				return ((InternalEList<?>)getErpInvoiceLineItems()).basicRemove(otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__PROCEDURE_DATA_SETS:
				return ((InternalEList<?>)getProcedureDataSets()).basicRemove(otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__RATING_SPECIFICATION:
				return basicSetRatingSpecification(null, msgs);
			case CommonPackage.USER_ATTRIBUTE__PROCEDURE:
				return basicSetProcedure(null, msgs);
			case CommonPackage.USER_ATTRIBUTE__BILL_DETERMINANTS:
				return ((InternalEList<?>)getBillDeterminants()).basicRemove(otherEnd, msgs);
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
			case CommonPackage.USER_ATTRIBUTE__PROPERTY_SPECIFICATION:
				if (resolve) return getPropertySpecification();
				return basicGetPropertySpecification();
			case CommonPackage.USER_ATTRIBUTE__PASS_THROUGH_BILLS:
				return getPassThroughBills();
			case CommonPackage.USER_ATTRIBUTE__TRANSACTION:
				if (resolve) return getTransaction();
				return basicGetTransaction();
			case CommonPackage.USER_ATTRIBUTE__SEQUENCE_NUMBER:
				return getSequenceNumber();
			case CommonPackage.USER_ATTRIBUTE__RATING_ASSETS:
				return getRatingAssets();
			case CommonPackage.USER_ATTRIBUTE__ERP_LEDGER_ENTRIES:
				return getErpLedgerEntries();
			case CommonPackage.USER_ATTRIBUTE__PROPERTY_ASSETS:
				return getPropertyAssets();
			case CommonPackage.USER_ATTRIBUTE__ERP_STATEMENT_LINE_ITEMS:
				return getErpStatementLineItems();
			case CommonPackage.USER_ATTRIBUTE__ERP_INVOICE_LINE_ITEMS:
				return getErpInvoiceLineItems();
			case CommonPackage.USER_ATTRIBUTE__PROCEDURE_DATA_SETS:
				return getProcedureDataSets();
			case CommonPackage.USER_ATTRIBUTE__NAME:
				return getName();
			case CommonPackage.USER_ATTRIBUTE__RATING_SPECIFICATION:
				if (resolve) return getRatingSpecification();
				return basicGetRatingSpecification();
			case CommonPackage.USER_ATTRIBUTE__PROCEDURE:
				if (resolve) return getProcedure();
				return basicGetProcedure();
			case CommonPackage.USER_ATTRIBUTE__BILL_DETERMINANTS:
				return getBillDeterminants();
			case CommonPackage.USER_ATTRIBUTE__VALUE:
				return getValue();
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
			case CommonPackage.USER_ATTRIBUTE__PROPERTY_SPECIFICATION:
				setPropertySpecification((Specification)newValue);
				return;
			case CommonPackage.USER_ATTRIBUTE__PASS_THROUGH_BILLS:
				getPassThroughBills().clear();
				getPassThroughBills().addAll((Collection<? extends PassThroughBill>)newValue);
				return;
			case CommonPackage.USER_ATTRIBUTE__TRANSACTION:
				setTransaction((Transaction)newValue);
				return;
			case CommonPackage.USER_ATTRIBUTE__SEQUENCE_NUMBER:
				setSequenceNumber((Integer)newValue);
				return;
			case CommonPackage.USER_ATTRIBUTE__RATING_ASSETS:
				getRatingAssets().clear();
				getRatingAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case CommonPackage.USER_ATTRIBUTE__ERP_LEDGER_ENTRIES:
				getErpLedgerEntries().clear();
				getErpLedgerEntries().addAll((Collection<? extends ErpLedgerEntry>)newValue);
				return;
			case CommonPackage.USER_ATTRIBUTE__PROPERTY_ASSETS:
				getPropertyAssets().clear();
				getPropertyAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case CommonPackage.USER_ATTRIBUTE__ERP_STATEMENT_LINE_ITEMS:
				getErpStatementLineItems().clear();
				getErpStatementLineItems().addAll((Collection<? extends MarketStatementLineItem>)newValue);
				return;
			case CommonPackage.USER_ATTRIBUTE__ERP_INVOICE_LINE_ITEMS:
				getErpInvoiceLineItems().clear();
				getErpInvoiceLineItems().addAll((Collection<? extends ErpInvoiceLineItem>)newValue);
				return;
			case CommonPackage.USER_ATTRIBUTE__PROCEDURE_DATA_SETS:
				getProcedureDataSets().clear();
				getProcedureDataSets().addAll((Collection<? extends ProcedureDataSet>)newValue);
				return;
			case CommonPackage.USER_ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case CommonPackage.USER_ATTRIBUTE__RATING_SPECIFICATION:
				setRatingSpecification((Specification)newValue);
				return;
			case CommonPackage.USER_ATTRIBUTE__PROCEDURE:
				setProcedure((Procedure)newValue);
				return;
			case CommonPackage.USER_ATTRIBUTE__BILL_DETERMINANTS:
				getBillDeterminants().clear();
				getBillDeterminants().addAll((Collection<? extends BillDeterminant>)newValue);
				return;
			case CommonPackage.USER_ATTRIBUTE__VALUE:
				setValue((String)newValue);
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
			case CommonPackage.USER_ATTRIBUTE__PROPERTY_SPECIFICATION:
				setPropertySpecification((Specification)null);
				return;
			case CommonPackage.USER_ATTRIBUTE__PASS_THROUGH_BILLS:
				getPassThroughBills().clear();
				return;
			case CommonPackage.USER_ATTRIBUTE__TRANSACTION:
				setTransaction((Transaction)null);
				return;
			case CommonPackage.USER_ATTRIBUTE__SEQUENCE_NUMBER:
				setSequenceNumber(SEQUENCE_NUMBER_EDEFAULT);
				return;
			case CommonPackage.USER_ATTRIBUTE__RATING_ASSETS:
				getRatingAssets().clear();
				return;
			case CommonPackage.USER_ATTRIBUTE__ERP_LEDGER_ENTRIES:
				getErpLedgerEntries().clear();
				return;
			case CommonPackage.USER_ATTRIBUTE__PROPERTY_ASSETS:
				getPropertyAssets().clear();
				return;
			case CommonPackage.USER_ATTRIBUTE__ERP_STATEMENT_LINE_ITEMS:
				getErpStatementLineItems().clear();
				return;
			case CommonPackage.USER_ATTRIBUTE__ERP_INVOICE_LINE_ITEMS:
				getErpInvoiceLineItems().clear();
				return;
			case CommonPackage.USER_ATTRIBUTE__PROCEDURE_DATA_SETS:
				getProcedureDataSets().clear();
				return;
			case CommonPackage.USER_ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CommonPackage.USER_ATTRIBUTE__RATING_SPECIFICATION:
				setRatingSpecification((Specification)null);
				return;
			case CommonPackage.USER_ATTRIBUTE__PROCEDURE:
				setProcedure((Procedure)null);
				return;
			case CommonPackage.USER_ATTRIBUTE__BILL_DETERMINANTS:
				getBillDeterminants().clear();
				return;
			case CommonPackage.USER_ATTRIBUTE__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case CommonPackage.USER_ATTRIBUTE__PROPERTY_SPECIFICATION:
				return propertySpecification != null;
			case CommonPackage.USER_ATTRIBUTE__PASS_THROUGH_BILLS:
				return passThroughBills != null && !passThroughBills.isEmpty();
			case CommonPackage.USER_ATTRIBUTE__TRANSACTION:
				return transaction != null;
			case CommonPackage.USER_ATTRIBUTE__SEQUENCE_NUMBER:
				return sequenceNumber != SEQUENCE_NUMBER_EDEFAULT;
			case CommonPackage.USER_ATTRIBUTE__RATING_ASSETS:
				return ratingAssets != null && !ratingAssets.isEmpty();
			case CommonPackage.USER_ATTRIBUTE__ERP_LEDGER_ENTRIES:
				return erpLedgerEntries != null && !erpLedgerEntries.isEmpty();
			case CommonPackage.USER_ATTRIBUTE__PROPERTY_ASSETS:
				return propertyAssets != null && !propertyAssets.isEmpty();
			case CommonPackage.USER_ATTRIBUTE__ERP_STATEMENT_LINE_ITEMS:
				return erpStatementLineItems != null && !erpStatementLineItems.isEmpty();
			case CommonPackage.USER_ATTRIBUTE__ERP_INVOICE_LINE_ITEMS:
				return erpInvoiceLineItems != null && !erpInvoiceLineItems.isEmpty();
			case CommonPackage.USER_ATTRIBUTE__PROCEDURE_DATA_SETS:
				return procedureDataSets != null && !procedureDataSets.isEmpty();
			case CommonPackage.USER_ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CommonPackage.USER_ATTRIBUTE__RATING_SPECIFICATION:
				return ratingSpecification != null;
			case CommonPackage.USER_ATTRIBUTE__PROCEDURE:
				return procedure != null;
			case CommonPackage.USER_ATTRIBUTE__BILL_DETERMINANTS:
				return billDeterminants != null && !billDeterminants.isEmpty();
			case CommonPackage.USER_ATTRIBUTE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (sequenceNumber: ");
		result.append(sequenceNumber);
		result.append(", name: ");
		result.append(name);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //UserAttributeImpl
