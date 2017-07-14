/**
 */
package gluemodel.CIM.IEC61968.Common;

import gluemodel.CIM.Element;

import gluemodel.CIM.IEC61968.Assets.Asset;

import gluemodel.CIM.IEC61968.PaymentMetering.Transaction;

import gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure;
import gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet;
import gluemodel.CIM.IEC61970.Informative.InfAssets.Specification;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getPropertySpecification <em>Property Specification</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getPassThroughBills <em>Pass Through Bills</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getRatingAssets <em>Rating Assets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getErpLedgerEntries <em>Erp Ledger Entries</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getPropertyAssets <em>Property Assets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getErpStatementLineItems <em>Erp Statement Line Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getProcedureDataSets <em>Procedure Data Sets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getName <em>Name</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getRatingSpecification <em>Rating Specification</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getBillDeterminants <em>Bill Determinants</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getUserAttribute()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Generic name-value pair class, with optional sequence number and units for value; can be used to model parts of information exchange when concrete types are not known in advance.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Generic name-value pair class, with optional sequence number and units for value; can be used to model parts of information exchange when concrete types are not known in advance.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Generic name-value pair class, with optional sequence number and units for value; can be used to model parts of information exchange when concrete types are not known in advance.' Profile\040documentation='Generic name-value pair class, with optional sequence number and units for value; can be used to model parts of information exchange when concrete types are not known in advance.'"
 * @generated
 */
public interface UserAttribute extends Element {
	/**
	 * Returns the value of the '<em><b>Property Specification</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getAssetProperites <em>Asset Properites</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Specification</em>' reference.
	 * @see #setPropertySpecification(Specification)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getUserAttribute_PropertySpecification()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getAssetProperites
	 * @model opposite="AssetProperites"
	 * @generated
	 */
	Specification getPropertySpecification();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getPropertySpecification <em>Property Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Specification</em>' reference.
	 * @see #getPropertySpecification()
	 * @generated
	 */
	void setPropertySpecification(Specification value);

	/**
	 * Returns the value of the '<em><b>Pass Through Bills</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getUserAttributes <em>User Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pass Through Bills</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pass Through Bills</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getUserAttribute_PassThroughBills()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getUserAttributes
	 * @model opposite="UserAttributes"
	 * @generated
	 */
	EList<PassThroughBill> getPassThroughBills();

	/**
	 * Returns the value of the '<em><b>Transaction</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.Transaction#getUserAttributes <em>User Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction</em>' reference.
	 * @see #setTransaction(Transaction)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getUserAttribute_Transaction()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.Transaction#getUserAttributes
	 * @model opposite="UserAttributes"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Transaction for which this snapshot has been recorded.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Transaction for which this snapshot has been recorded.'"
	 * @generated
	 */
	Transaction getTransaction();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getTransaction <em>Transaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction</em>' reference.
	 * @see #getTransaction()
	 * @generated
	 */
	void setTransaction(Transaction value);

	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #setSequenceNumber(int)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getUserAttribute_SequenceNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Sequence number for this attribute in a list of attributes.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Sequence number for this attribute in a list of attributes.'"
	 * @generated
	 */
	int getSequenceNumber();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #getSequenceNumber()
	 * @generated
	 */
	void setSequenceNumber(int value);

	/**
	 * Returns the value of the '<em><b>Rating Assets</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Assets.Asset}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Assets.Asset#getRatings <em>Ratings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rating Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rating Assets</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getUserAttribute_RatingAssets()
	 * @see gluemodel.CIM.IEC61968.Assets.Asset#getRatings
	 * @model opposite="Ratings"
	 * @generated
	 */
	EList<Asset> getRatingAssets();

	/**
	 * Returns the value of the '<em><b>Erp Ledger Entries</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getUserAttributes <em>User Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Ledger Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Ledger Entries</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getUserAttribute_ErpLedgerEntries()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getUserAttributes
	 * @model opposite="UserAttributes"
	 * @generated
	 */
	EList<ErpLedgerEntry> getErpLedgerEntries();

	/**
	 * Returns the value of the '<em><b>Property Assets</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Assets.Asset}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Assets.Asset#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Assets</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getUserAttribute_PropertyAssets()
	 * @see gluemodel.CIM.IEC61968.Assets.Asset#getProperties
	 * @model opposite="Properties"
	 * @generated
	 */
	EList<Asset> getPropertyAssets();

	/**
	 * Returns the value of the '<em><b>Erp Statement Line Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getUserAttributes <em>User Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Statement Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Statement Line Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getUserAttribute_ErpStatementLineItems()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getUserAttributes
	 * @model opposite="UserAttributes"
	 * @generated
	 */
	EList<MarketStatementLineItem> getErpStatementLineItems();

	/**
	 * Returns the value of the '<em><b>Erp Invoice Line Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getUserAttributes <em>User Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Invoice Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Invoice Line Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getUserAttribute_ErpInvoiceLineItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getUserAttributes
	 * @model opposite="UserAttributes"
	 * @generated
	 */
	EList<ErpInvoiceLineItem> getErpInvoiceLineItems();

	/**
	 * Returns the value of the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure Data Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure Data Sets</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getUserAttribute_ProcedureDataSets()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet#getProperties
	 * @model opposite="Properties"
	 * @generated
	 */
	EList<ProcedureDataSet> getProcedureDataSets();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getUserAttribute_Name()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Name of an attribute.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Name of an attribute.'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rating Specification</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getRatings <em>Ratings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rating Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rating Specification</em>' reference.
	 * @see #setRatingSpecification(Specification)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getUserAttribute_RatingSpecification()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getRatings
	 * @model opposite="Ratings"
	 * @generated
	 */
	Specification getRatingSpecification();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getRatingSpecification <em>Rating Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rating Specification</em>' reference.
	 * @see #getRatingSpecification()
	 * @generated
	 */
	void setRatingSpecification(Specification value);

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure#getProcedureValues <em>Procedure Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure</em>' reference.
	 * @see #setProcedure(Procedure)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getUserAttribute_Procedure()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure#getProcedureValues
	 * @model opposite="ProcedureValues"
	 * @generated
	 */
	Procedure getProcedure();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getProcedure <em>Procedure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure</em>' reference.
	 * @see #getProcedure()
	 * @generated
	 */
	void setProcedure(Procedure value);

	/**
	 * Returns the value of the '<em><b>Bill Determinants</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getUserAttributes <em>User Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill Determinants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill Determinants</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getUserAttribute_BillDeterminants()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getUserAttributes
	 * @model opposite="UserAttributes"
	 * @generated
	 */
	EList<BillDeterminant> getBillDeterminants();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getUserAttribute_Value()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.StringQuantity" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Value of an attribute, including unit information.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Value of an attribute, including unit information.'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // UserAttribute
