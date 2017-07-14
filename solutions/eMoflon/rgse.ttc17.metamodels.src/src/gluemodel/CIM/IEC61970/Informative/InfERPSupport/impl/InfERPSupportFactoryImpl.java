/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfERPSupportFactoryImpl extends EFactoryImpl implements InfERPSupportFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfERPSupportFactory init() {
		try {
			InfERPSupportFactory theInfERPSupportFactory = (InfERPSupportFactory)EPackage.Registry.INSTANCE.getEFactory(InfERPSupportPackage.eNS_URI);
			if (theInfERPSupportFactory != null) {
				return theInfERPSupportFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfERPSupportFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfERPSupportFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InfERPSupportPackage.ERP_INVENTORY_COUNT: return createErpInventoryCount();
			case InfERPSupportPackage.ERP_PERSONNEL: return createErpPersonnel();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM: return createErpInvoiceLineItem();
			case InfERPSupportPackage.ERP_CHART_OF_ACCOUNTS: return createErpChartOfAccounts();
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING: return createErpProjectAccounting();
			case InfERPSupportPackage.ERP_RECEIVE_DELIVERY: return createErpReceiveDelivery();
			case InfERPSupportPackage.ERP_ENG_CHANGE_ORDER: return createErpEngChangeOrder();
			case InfERPSupportPackage.ERP_JOURNAL: return createErpJournal();
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM: return createErpReqLineItem();
			case InfERPSupportPackage.ERP_ORGANISATION: return createErpOrganisation();
			case InfERPSupportPackage.DOC_ORG_ROLE: return createDocOrgRole();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY: return createErpLedgerEntry();
			case InfERPSupportPackage.ERP_RECEIVABLE: return createErpReceivable();
			case InfERPSupportPackage.ERP_PERSON: return createErpPerson();
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE: return createOrgErpPersonRole();
			case InfERPSupportPackage.ERP_COMPETENCY: return createErpCompetency();
			case InfERPSupportPackage.ERP_LEDGER: return createErpLedger();
			case InfERPSupportPackage.ERP_SALES_ORDER: return createErpSalesOrder();
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM: return createErpQuoteLineItem();
			case InfERPSupportPackage.ERP_PURCHASE_ORDER: return createErpPurchaseOrder();
			case InfERPSupportPackage.ERP_PAYABLE_LINE_ITEM: return createErpPayableLineItem();
			case InfERPSupportPackage.ERP_LEDGER_BUDGET: return createErpLedgerBudget();
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA: return createErpBomItemData();
			case InfERPSupportPackage.ERP_INVENTORY: return createErpInventory();
			case InfERPSupportPackage.DOC_ERP_PERSON_ROLE: return createDocErpPersonRole();
			case InfERPSupportPackage.ERP_ITEM_MASTER: return createErpItemMaster();
			case InfERPSupportPackage.ERP_BANK_ACCOUNT: return createErpBankAccount();
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM: return createErpRecDelvLineItem();
			case InfERPSupportPackage.ORG_ORG_ROLE: return createOrgOrgRole();
			case InfERPSupportPackage.ERP_SITE_LEVEL_DATA: return createErpSiteLevelData();
			case InfERPSupportPackage.ERP_PO_LINE_ITEM: return createErpPOLineItem();
			case InfERPSupportPackage.ERP_ISSUE_INVENTORY: return createErpIssueInventory();
			case InfERPSupportPackage.ERP_PAYMENT: return createErpPayment();
			case InfERPSupportPackage.ERP_QUOTE: return createErpQuote();
			case InfERPSupportPackage.ERP_PAYABLE: return createErpPayable();
			case InfERPSupportPackage.ERP_REQUISITION: return createErpRequisition();
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM: return createErpLedBudLineItem();
			case InfERPSupportPackage.ERP_INVOICE: return createErpInvoice();
			case InfERPSupportPackage.ERP_TIME_ENTRY: return createErpTimeEntry();
			case InfERPSupportPackage.ERP_BOM: return createErpBOM();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY: return createErpJournalEntry();
			case InfERPSupportPackage.ERP_REC_LINE_ITEM: return createErpRecLineItem();
			case InfERPSupportPackage.ERP_TIME_SHEET: return createErpTimeSheet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM_KIND:
				return createErpInvoiceLineItemKindFromString(eDataType, initialValue);
			case InfERPSupportPackage.ERP_ACCOUNT_KIND:
				return createErpAccountKindFromString(eDataType, initialValue);
			case InfERPSupportPackage.ERP_INVOICE_KIND:
				return createErpInvoiceKindFromString(eDataType, initialValue);
			case InfERPSupportPackage.BILL_MEDIA_KIND:
				return createBillMediaKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM_KIND:
				return convertErpInvoiceLineItemKindToString(eDataType, instanceValue);
			case InfERPSupportPackage.ERP_ACCOUNT_KIND:
				return convertErpAccountKindToString(eDataType, instanceValue);
			case InfERPSupportPackage.ERP_INVOICE_KIND:
				return convertErpInvoiceKindToString(eDataType, instanceValue);
			case InfERPSupportPackage.BILL_MEDIA_KIND:
				return convertBillMediaKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInventoryCount createErpInventoryCount() {
		ErpInventoryCountImpl erpInventoryCount = new ErpInventoryCountImpl();
		return erpInventoryCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPersonnel createErpPersonnel() {
		ErpPersonnelImpl erpPersonnel = new ErpPersonnelImpl();
		return erpPersonnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInvoiceLineItem createErpInvoiceLineItem() {
		ErpInvoiceLineItemImpl erpInvoiceLineItem = new ErpInvoiceLineItemImpl();
		return erpInvoiceLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpChartOfAccounts createErpChartOfAccounts() {
		ErpChartOfAccountsImpl erpChartOfAccounts = new ErpChartOfAccountsImpl();
		return erpChartOfAccounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpProjectAccounting createErpProjectAccounting() {
		ErpProjectAccountingImpl erpProjectAccounting = new ErpProjectAccountingImpl();
		return erpProjectAccounting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpReceiveDelivery createErpReceiveDelivery() {
		ErpReceiveDeliveryImpl erpReceiveDelivery = new ErpReceiveDeliveryImpl();
		return erpReceiveDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpEngChangeOrder createErpEngChangeOrder() {
		ErpEngChangeOrderImpl erpEngChangeOrder = new ErpEngChangeOrderImpl();
		return erpEngChangeOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpJournal createErpJournal() {
		ErpJournalImpl erpJournal = new ErpJournalImpl();
		return erpJournal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpReqLineItem createErpReqLineItem() {
		ErpReqLineItemImpl erpReqLineItem = new ErpReqLineItemImpl();
		return erpReqLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpOrganisation createErpOrganisation() {
		ErpOrganisationImpl erpOrganisation = new ErpOrganisationImpl();
		return erpOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocOrgRole createDocOrgRole() {
		DocOrgRoleImpl docOrgRole = new DocOrgRoleImpl();
		return docOrgRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpLedgerEntry createErpLedgerEntry() {
		ErpLedgerEntryImpl erpLedgerEntry = new ErpLedgerEntryImpl();
		return erpLedgerEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpReceivable createErpReceivable() {
		ErpReceivableImpl erpReceivable = new ErpReceivableImpl();
		return erpReceivable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPerson createErpPerson() {
		ErpPersonImpl erpPerson = new ErpPersonImpl();
		return erpPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgErpPersonRole createOrgErpPersonRole() {
		OrgErpPersonRoleImpl orgErpPersonRole = new OrgErpPersonRoleImpl();
		return orgErpPersonRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpCompetency createErpCompetency() {
		ErpCompetencyImpl erpCompetency = new ErpCompetencyImpl();
		return erpCompetency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpLedger createErpLedger() {
		ErpLedgerImpl erpLedger = new ErpLedgerImpl();
		return erpLedger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpSalesOrder createErpSalesOrder() {
		ErpSalesOrderImpl erpSalesOrder = new ErpSalesOrderImpl();
		return erpSalesOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpQuoteLineItem createErpQuoteLineItem() {
		ErpQuoteLineItemImpl erpQuoteLineItem = new ErpQuoteLineItemImpl();
		return erpQuoteLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPurchaseOrder createErpPurchaseOrder() {
		ErpPurchaseOrderImpl erpPurchaseOrder = new ErpPurchaseOrderImpl();
		return erpPurchaseOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPayableLineItem createErpPayableLineItem() {
		ErpPayableLineItemImpl erpPayableLineItem = new ErpPayableLineItemImpl();
		return erpPayableLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpLedgerBudget createErpLedgerBudget() {
		ErpLedgerBudgetImpl erpLedgerBudget = new ErpLedgerBudgetImpl();
		return erpLedgerBudget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpBomItemData createErpBomItemData() {
		ErpBomItemDataImpl erpBomItemData = new ErpBomItemDataImpl();
		return erpBomItemData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInventory createErpInventory() {
		ErpInventoryImpl erpInventory = new ErpInventoryImpl();
		return erpInventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocErpPersonRole createDocErpPersonRole() {
		DocErpPersonRoleImpl docErpPersonRole = new DocErpPersonRoleImpl();
		return docErpPersonRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpItemMaster createErpItemMaster() {
		ErpItemMasterImpl erpItemMaster = new ErpItemMasterImpl();
		return erpItemMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpBankAccount createErpBankAccount() {
		ErpBankAccountImpl erpBankAccount = new ErpBankAccountImpl();
		return erpBankAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpRecDelvLineItem createErpRecDelvLineItem() {
		ErpRecDelvLineItemImpl erpRecDelvLineItem = new ErpRecDelvLineItemImpl();
		return erpRecDelvLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgOrgRole createOrgOrgRole() {
		OrgOrgRoleImpl orgOrgRole = new OrgOrgRoleImpl();
		return orgOrgRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpSiteLevelData createErpSiteLevelData() {
		ErpSiteLevelDataImpl erpSiteLevelData = new ErpSiteLevelDataImpl();
		return erpSiteLevelData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPOLineItem createErpPOLineItem() {
		ErpPOLineItemImpl erpPOLineItem = new ErpPOLineItemImpl();
		return erpPOLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpIssueInventory createErpIssueInventory() {
		ErpIssueInventoryImpl erpIssueInventory = new ErpIssueInventoryImpl();
		return erpIssueInventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPayment createErpPayment() {
		ErpPaymentImpl erpPayment = new ErpPaymentImpl();
		return erpPayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpQuote createErpQuote() {
		ErpQuoteImpl erpQuote = new ErpQuoteImpl();
		return erpQuote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPayable createErpPayable() {
		ErpPayableImpl erpPayable = new ErpPayableImpl();
		return erpPayable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpRequisition createErpRequisition() {
		ErpRequisitionImpl erpRequisition = new ErpRequisitionImpl();
		return erpRequisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpLedBudLineItem createErpLedBudLineItem() {
		ErpLedBudLineItemImpl erpLedBudLineItem = new ErpLedBudLineItemImpl();
		return erpLedBudLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInvoice createErpInvoice() {
		ErpInvoiceImpl erpInvoice = new ErpInvoiceImpl();
		return erpInvoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpTimeEntry createErpTimeEntry() {
		ErpTimeEntryImpl erpTimeEntry = new ErpTimeEntryImpl();
		return erpTimeEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpBOM createErpBOM() {
		ErpBOMImpl erpBOM = new ErpBOMImpl();
		return erpBOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpJournalEntry createErpJournalEntry() {
		ErpJournalEntryImpl erpJournalEntry = new ErpJournalEntryImpl();
		return erpJournalEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpRecLineItem createErpRecLineItem() {
		ErpRecLineItemImpl erpRecLineItem = new ErpRecLineItemImpl();
		return erpRecLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpTimeSheet createErpTimeSheet() {
		ErpTimeSheetImpl erpTimeSheet = new ErpTimeSheetImpl();
		return erpTimeSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInvoiceLineItemKind createErpInvoiceLineItemKindFromString(EDataType eDataType, String initialValue) {
		ErpInvoiceLineItemKind result = ErpInvoiceLineItemKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertErpInvoiceLineItemKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpAccountKind createErpAccountKindFromString(EDataType eDataType, String initialValue) {
		ErpAccountKind result = ErpAccountKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertErpAccountKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInvoiceKind createErpInvoiceKindFromString(EDataType eDataType, String initialValue) {
		ErpInvoiceKind result = ErpInvoiceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertErpInvoiceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillMediaKind createBillMediaKindFromString(EDataType eDataType, String initialValue) {
		BillMediaKind result = BillMediaKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBillMediaKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfERPSupportPackage getInfERPSupportPackage() {
		return (InfERPSupportPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfERPSupportPackage getPackage() {
		return InfERPSupportPackage.eINSTANCE;
	}

} //InfERPSupportFactoryImpl
