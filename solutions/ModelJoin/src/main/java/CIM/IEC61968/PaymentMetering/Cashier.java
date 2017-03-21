/**
 */
package CIM.IEC61968.PaymentMetering;

import CIM.IEC61968.Common.ElectronicAddress;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cashier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Cashier#getCashierShifts <em>Cashier Shifts</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Cashier#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Cashier#getVendor <em>Vendor</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCashier()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The operator of the point of sale for the duration of CashierShift. Cashier is under the exclusive management control of Vendor.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The operator of the point of sale for the duration of CashierShift. Cashier is under the exclusive management control of Vendor.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The operator of the point of sale for the duration of CashierShift. Cashier is under the exclusive management control of Vendor.' Profile\040documentation='The operator of the point of sale for the duration of CashierShift. Cashier is under the exclusive management control of Vendor.'"
 * @generated
 */
public interface Cashier extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Cashier Shifts</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.PaymentMetering.CashierShift}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.CashierShift#getCashier <em>Cashier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cashier Shifts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cashier Shifts</em>' reference list.
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCashier_CashierShifts()
	 * @see CIM.IEC61968.PaymentMetering.CashierShift#getCashier
	 * @model opposite="Cashier"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All shifts operated by this cashier.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All shifts operated by this cashier.'"
	 * @generated
	 */
	EList<CashierShift> getCashierShifts();

	/**
	 * Returns the value of the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electronic Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electronic Address</em>' reference.
	 * @see #setElectronicAddress(ElectronicAddress)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCashier_ElectronicAddress()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Electronic address.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Electronic address.'"
	 * @generated
	 */
	ElectronicAddress getElectronicAddress();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Cashier#getElectronicAddress <em>Electronic Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electronic Address</em>' reference.
	 * @see #getElectronicAddress()
	 * @generated
	 */
	void setElectronicAddress(ElectronicAddress value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.Vendor#getCashiers <em>Cashiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' reference.
	 * @see #setVendor(Vendor)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCashier_Vendor()
	 * @see CIM.IEC61968.PaymentMetering.Vendor#getCashiers
	 * @model opposite="Cashiers"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Vendor that manages this Cachier.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Vendor that manages this Cachier.'"
	 * @generated
	 */
	Vendor getVendor();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Cashier#getVendor <em>Vendor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' reference.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(Vendor value);

} // Cashier
