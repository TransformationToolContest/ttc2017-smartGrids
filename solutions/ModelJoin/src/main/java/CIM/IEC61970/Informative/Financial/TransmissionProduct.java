/**
 */
package CIM.IEC61970.Informative.Financial;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.Reservation.TransmissionPath;
import CIM.IEC61970.Informative.Reservation.TransmissionService;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmission Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.Financial.TransmissionProduct#getTransmissionProductType <em>Transmission Product Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Financial.TransmissionProduct#getLocationFor <em>Location For</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Financial.TransmissionProduct#getTransmissionProvider <em>Transmission Provider</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Financial.TransmissionProduct#getOffers <em>Offers</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getTransmissionProduct()
 * @model
 * @generated
 */
public interface TransmissionProduct extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Transmission Product Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Product Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Product Type</em>' attribute.
	 * @see #setTransmissionProductType(Object)
	 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getTransmissionProduct_TransmissionProductType()
	 * @model dataType="CIM.EnumeratedType" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type of the transmission product. This could be a transmission service class (firm, total transmission capability, or non-firm), transmission service period (on-peak, full-period, off-peak), transmission service increments (yearly extended, hourly fixed, monthly sliding, etc.), transmission service type (network, available transmission capability, or point-to-point, or a transmission service window (fixed hourly, sliding weekly, extended monthly, etc.).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type of the transmission product. This could be a transmission service class (firm, total transmission capability, or non-firm), transmission service period (on-peak, full-period, off-peak), transmission service increments (yearly extended, hourly fixed, monthly sliding, etc.), transmission service type (network, available transmission capability, or point-to-point, or a transmission service window (fixed hourly, sliding weekly, extended monthly, etc.).'"
	 * @generated
	 */
	Object getTransmissionProductType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.Financial.TransmissionProduct#getTransmissionProductType <em>Transmission Product Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Product Type</em>' attribute.
	 * @see #getTransmissionProductType()
	 * @generated
	 */
	void setTransmissionProductType(Object value);

	/**
	 * Returns the value of the '<em><b>Location For</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.Reservation.TransmissionPath}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.Reservation.TransmissionPath#getLocatedOn <em>Located On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location For</em>' reference list.
	 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getTransmissionProduct_LocationFor()
	 * @see CIM.IEC61970.Informative.Reservation.TransmissionPath#getLocatedOn
	 * @model opposite="LocatedOn"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A transmission product is located on a transmission path.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transmission product is located on a transmission path.'"
	 * @generated
	 */
	EList<TransmissionPath> getLocationFor();

	/**
	 * Returns the value of the '<em><b>Transmission Provider</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.Financial.TransmissionProvider#getTransmissionProducts <em>Transmission Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Provider</em>' reference.
	 * @see #setTransmissionProvider(TransmissionProvider)
	 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getTransmissionProduct_TransmissionProvider()
	 * @see CIM.IEC61970.Informative.Financial.TransmissionProvider#getTransmissionProducts
	 * @model opposite="TransmissionProducts"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A TransmissionProvider offers a TransmissionProduct.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A TransmissionProvider offers a TransmissionProduct.'"
	 * @generated
	 */
	TransmissionProvider getTransmissionProvider();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.Financial.TransmissionProduct#getTransmissionProvider <em>Transmission Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Provider</em>' reference.
	 * @see #getTransmissionProvider()
	 * @generated
	 */
	void setTransmissionProvider(TransmissionProvider value);

	/**
	 * Returns the value of the '<em><b>Offers</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.Reservation.TransmissionService}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.Reservation.TransmissionService#getOfferedAs <em>Offered As</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offers</em>' reference list.
	 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getTransmissionProduct_Offers()
	 * @see CIM.IEC61970.Informative.Reservation.TransmissionService#getOfferedAs
	 * @model opposite="OfferedAs"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A transmission product is offered as a transmission service along a transmission path.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transmission product is offered as a transmission service along a transmission path.'"
	 * @generated
	 */
	EList<TransmissionService> getOffers();

} // TransmissionProduct
