/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61970.Informative.EnergyScheduling.EnergyProfile;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction Bid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.TransactionBid#getEnergyTransId <em>Energy Trans Id</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.TransactionBid#getEnergyProfiles <em>Energy Profiles</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.TransactionBid#getDelivery_Pnode <em>Delivery Pnode</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.TransactionBid#getReceipt_Pnode <em>Receipt Pnode</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getTransactionBid()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Bilateral or scheduled transactions for energy and ancillary services considered by market clearing process'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Bilateral or scheduled transactions for energy and ancillary services considered by market clearing process'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Bilateral or scheduled transactions for energy and ancillary services considered by market clearing process' Profile\040documentation='Bilateral or scheduled transactions for energy and ancillary services considered by market clearing process'"
 * @generated
 */
public interface TransactionBid extends Bid {
	/**
	 * Returns the value of the '<em><b>Energy Trans Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Trans Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Trans Id</em>' attribute.
	 * @see #setEnergyTransId(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getTransactionBid_EnergyTransId()
	 * @model required="true"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Profile\040documentation=''"
	 * @generated
	 */
	String getEnergyTransId();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.TransactionBid#getEnergyTransId <em>Energy Trans Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Trans Id</em>' attribute.
	 * @see #getEnergyTransId()
	 * @generated
	 */
	void setEnergyTransId(String value);

	/**
	 * Returns the value of the '<em><b>Energy Profiles</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.EnergyScheduling.EnergyProfile}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyProfile#getTransactionBid <em>Transaction Bid</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Profiles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Profiles</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getTransactionBid_EnergyProfiles()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyProfile#getTransactionBid
	 * @model opposite="TransactionBid"
	 * @generated
	 */
	EList<EnergyProfile> getEnergyProfiles();

	/**
	 * Returns the value of the '<em><b>Delivery Pnode</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.Pnode#getDeliveryTransactionBids <em>Delivery Transaction Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Pnode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Pnode</em>' reference.
	 * @see #setDelivery_Pnode(Pnode)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getTransactionBid_Delivery_Pnode()
	 * @see CIM.IEC61970.Informative.MarketOperations.Pnode#getDeliveryTransactionBids
	 * @model opposite="DeliveryTransactionBids"
	 * @generated
	 */
	Pnode getDelivery_Pnode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.TransactionBid#getDelivery_Pnode <em>Delivery Pnode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Pnode</em>' reference.
	 * @see #getDelivery_Pnode()
	 * @generated
	 */
	void setDelivery_Pnode(Pnode value);

	/**
	 * Returns the value of the '<em><b>Receipt Pnode</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.Pnode#getReceiptTransactionBids <em>Receipt Transaction Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipt Pnode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipt Pnode</em>' reference.
	 * @see #setReceipt_Pnode(Pnode)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getTransactionBid_Receipt_Pnode()
	 * @see CIM.IEC61970.Informative.MarketOperations.Pnode#getReceiptTransactionBids
	 * @model opposite="ReceiptTransactionBids"
	 * @generated
	 */
	Pnode getReceipt_Pnode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.TransactionBid#getReceipt_Pnode <em>Receipt Pnode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receipt Pnode</em>' reference.
	 * @see #getReceipt_Pnode()
	 * @generated
	 */
	void setReceipt_Pnode(Pnode value);

} // TransactionBid
