/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.Token;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Of Sale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.PointOfSale#getTokens <em>Tokens</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.PointOfSale#getLocation <em>Location</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.PointOfSale#getCashierShifts <em>Cashier Shifts</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.PointOfSale#getVendor <em>Vendor</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getPointOfSale()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Logical point where transactions take place with operational interaction between Cashier and the payment system; in certain cases PointOfSale interacts directly with the end customer, in which case Cashier might not be a real person: for example a self-service kiosk or over the internet.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Logical point where transactions take place with operational interaction between Cashier and the payment system; in certain cases PointOfSale interacts directly with the end customer, in which case Cashier might not be a real person: for example a self-service kiosk or over the internet.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Logical point where transactions take place with operational interaction between Cashier and the payment system; in certain cases PointOfSale interacts directly with the end customer, in which case Cashier might not be a real person: for example a self-service kiosk or over the internet.' Profile\040documentation='Logical point where transactions take place with operational interaction between Cashier and the payment system; in certain cases PointOfSale interacts directly with the end customer, in which case Cashier might not be a real person: for example a self-service kiosk or over the internet.'"
 * @generated
 */
public interface PointOfSale extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.Token}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.Token#getPointOfSale <em>Point Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getPointOfSale_Tokens()
	 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.Token#getPointOfSale
	 * @model opposite="PointOfSale"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All Tokens sold or dispensed at this PointOfSale.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All Tokens sold or dispensed at this PointOfSale.'"
	 * @generated
	 */
	EList<Token> getTokens();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getPointOfSale_Location()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Local description for where this point of sale is physically located.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Local description for where this point of sale is physically located.'"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.PointOfSale#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Cashier Shifts</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.PaymentMetering.CashierShift}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.CashierShift#getPointOfSale <em>Point Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cashier Shifts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cashier Shifts</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getPointOfSale_CashierShifts()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.CashierShift#getPointOfSale
	 * @model opposite="PointOfSale"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All shifts this point of sale operated in.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All shifts this point of sale operated in.'"
	 * @generated
	 */
	EList<CashierShift> getCashierShifts();

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.Vendor#getPointOfSales <em>Point Of Sales</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' reference.
	 * @see #setVendor(Vendor)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getPointOfSale_Vendor()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.Vendor#getPointOfSales
	 * @model opposite="PointOfSales"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Vendor that controls this PointOfSale.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Vendor that controls this PointOfSale.'"
	 * @generated
	 */
	Vendor getVendor();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.PointOfSale#getVendor <em>Vendor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' reference.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(Vendor value);

} // PointOfSale
