/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61970.Core.ConnectivityNode;
import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Meas.Measurement;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pnode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Pnode#getReceiptTransactionBids <em>Receipt Transaction Bids</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Pnode#getRTO <em>RTO</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Pnode#getRegisteredResources <em>Registered Resources</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Pnode#getBeginPeriod <em>Begin Period</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Pnode#getPnodeClearing <em>Pnode Clearing</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Pnode#getType <em>Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Pnode#getDeliveryTransactionBids <em>Delivery Transaction Bids</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Pnode#isIsPublic <em>Is Public</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Pnode#getConnectivityNode <em>Connectivity Node</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Pnode#getFTRs <em>FT Rs</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Pnode#getEndPeriod <em>End Period</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Pnode#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Pnode#getUsage <em>Usage</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPnode()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A pricing node is directly associated with a connectivity node.  It is a pricing location for which market participants submit their bids, offers, buy/sell CRRs, and settle.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A pricing node is directly associated with a connectivity node.  It is a pricing location for which market participants submit their bids, offers, buy/sell CRRs, and settle.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A pricing node is directly associated with a connectivity node.  It is a pricing location for which market participants submit their bids, offers, buy/sell CRRs, and settle.' Profile\040documentation='A pricing node is directly associated with a connectivity node.  It is a pricing location for which market participants submit their bids, offers, buy/sell CRRs, and settle.'"
 * @generated
 */
public interface Pnode extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Receipt Transaction Bids</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.TransactionBid}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.TransactionBid#getReceipt_Pnode <em>Receipt Pnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipt Transaction Bids</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipt Transaction Bids</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPnode_ReceiptTransactionBids()
	 * @see CIM.IEC61970.Informative.MarketOperations.TransactionBid#getReceipt_Pnode
	 * @model opposite="Receipt_Pnode"
	 * @generated
	 */
	EList<TransactionBid> getReceiptTransactionBids();

	/**
	 * Returns the value of the '<em><b>RTO</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.RTO#getPnodes <em>Pnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RTO</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RTO</em>' reference.
	 * @see #setRTO(RTO)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPnode_RTO()
	 * @see CIM.IEC61970.Informative.MarketOperations.RTO#getPnodes
	 * @model opposite="Pnodes"
	 * @generated
	 */
	RTO getRTO();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Pnode#getRTO <em>RTO</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RTO</em>' reference.
	 * @see #getRTO()
	 * @generated
	 */
	void setRTO(RTO value);

	/**
	 * Returns the value of the '<em><b>Registered Resources</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.RegisteredResource}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getPnode <em>Pnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registered Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered Resources</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPnode_RegisteredResources()
	 * @see CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getPnode
	 * @model opposite="Pnode"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A registered resource injects power at one or more connectivity nodes related to a pnode'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A registered resource injects power at one or more connectivity nodes related to a pnode'"
	 * @generated
	 */
	EList<RegisteredResource> getRegisteredResources();

	/**
	 * Returns the value of the '<em><b>Begin Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begin Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin Period</em>' attribute.
	 * @see #setBeginPeriod(Date)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPnode_BeginPeriod()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Start date-time of the period in which the price node definition is valid.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Start date-time of the period in which the price node definition is valid.'"
	 * @generated
	 */
	Date getBeginPeriod();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Pnode#getBeginPeriod <em>Begin Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin Period</em>' attribute.
	 * @see #getBeginPeriod()
	 * @generated
	 */
	void setBeginPeriod(Date value);

	/**
	 * Returns the value of the '<em><b>Pnode Clearing</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.PnodeClearing#getPnode <em>Pnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pnode Clearing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pnode Clearing</em>' reference.
	 * @see #setPnodeClearing(PnodeClearing)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPnode_PnodeClearing()
	 * @see CIM.IEC61970.Informative.MarketOperations.PnodeClearing#getPnode
	 * @model opposite="Pnode"
	 * @generated
	 */
	PnodeClearing getPnodeClearing();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Pnode#getPnodeClearing <em>Pnode Clearing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pnode Clearing</em>' reference.
	 * @see #getPnodeClearing()
	 * @generated
	 */
	void setPnodeClearing(PnodeClearing value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPnode_Type()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Price node type: Hub (H), Zone (Z), Control Area (C), ?, Bus (B)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Price node type: Hub (H), Zone (Z), Control Area (C), ?, Bus (B)'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Pnode#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Delivery Transaction Bids</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.TransactionBid}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.TransactionBid#getDelivery_Pnode <em>Delivery Pnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Transaction Bids</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Transaction Bids</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPnode_DeliveryTransactionBids()
	 * @see CIM.IEC61970.Informative.MarketOperations.TransactionBid#getDelivery_Pnode
	 * @model opposite="Delivery_Pnode"
	 * @generated
	 */
	EList<TransactionBid> getDeliveryTransactionBids();

	/**
	 * Returns the value of the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Public</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Public</em>' attribute.
	 * @see #setIsPublic(boolean)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPnode_IsPublic()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True=Public; False=Private\nPublic Pnodes: Prices are published for DA/RT and FTR Markets.\nPrivate Pnodes: Location is not usable by Market for Bidding/FTRs/Transactions'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True=Public; False=Private\nPublic Pnodes: Prices are published for DA/RT and FTR Markets.\nPrivate Pnodes: Location is not usable by Market for Bidding/FTRs/Transactions'"
	 * @generated
	 */
	boolean isIsPublic();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Pnode#isIsPublic <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Public</em>' attribute.
	 * @see #isIsPublic()
	 * @generated
	 */
	void setIsPublic(boolean value);

	/**
	 * Returns the value of the '<em><b>Connectivity Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.ConnectivityNode#getPnode <em>Pnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectivity Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivity Node</em>' reference.
	 * @see #setConnectivityNode(ConnectivityNode)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPnode_ConnectivityNode()
	 * @see CIM.IEC61970.Core.ConnectivityNode#getPnode
	 * @model opposite="Pnode"
	 * @generated
	 */
	ConnectivityNode getConnectivityNode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Pnode#getConnectivityNode <em>Connectivity Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectivity Node</em>' reference.
	 * @see #getConnectivityNode()
	 * @generated
	 */
	void setConnectivityNode(ConnectivityNode value);

	/**
	 * Returns the value of the '<em><b>FT Rs</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.FTR}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.FTR#getPnodes <em>Pnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FT Rs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FT Rs</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPnode_FTRs()
	 * @see CIM.IEC61970.Informative.MarketOperations.FTR#getPnodes
	 * @model opposite="Pnodes"
	 * @generated
	 */
	EList<FTR> getFTRs();

	/**
	 * Returns the value of the '<em><b>End Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Period</em>' attribute.
	 * @see #setEndPeriod(Date)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPnode_EndPeriod()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='End date-time of the period in which the price node definition is valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='End date-time of the period in which the price node definition is valid'"
	 * @generated
	 */
	Date getEndPeriod();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Pnode#getEndPeriod <em>End Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Period</em>' attribute.
	 * @see #getEndPeriod()
	 * @generated
	 */
	void setEndPeriod(Date value);

	/**
	 * Returns the value of the '<em><b>Measurements</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Meas.Measurement}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.Measurement#getPnode <em>Pnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPnode_Measurements()
	 * @see CIM.IEC61970.Meas.Measurement#getPnode
	 * @model opposite="Pnode"
	 * @generated
	 */
	EList<Measurement> getMeasurements();

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see #setUsage(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPnode_Usage()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Price node usage: \n\'Control Area\'\n\'Regulation Region\'\n\'Price Zone\'\n\'Spin Region\'\n\'Non-Spin Region\'\n\'Price Hub\''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Price node usage: \n\'Control Area\'\n\'Regulation Region\'\n\'Price Zone\'\n\'Spin Region\'\n\'Non-Spin Region\'\n\'Price Hub\''"
	 * @generated
	 */
	String getUsage();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Pnode#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(String value);

} // Pnode
