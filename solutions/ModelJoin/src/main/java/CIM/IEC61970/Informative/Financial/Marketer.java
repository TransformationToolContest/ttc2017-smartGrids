/**
 */
package CIM.IEC61970.Informative.Financial;

import CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct;

import CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;

import CIM.IEC61970.Informative.Reservation.ServiceReservation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marketer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.Financial.Marketer#getResells_EnergyProduct <em>Resells Energy Product</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Financial.Marketer#getHeldBy <em>Held By</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Financial.Marketer#getHoldsTitleTo_EnergyProducts <em>Holds Title To Energy Products</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Financial.Marketer#getResoldBy <em>Resold By</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getMarketer()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Matches buyers and sellers, and secures transmission (and other ancillary services) needed to complete the energy transaction.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Matches buyers and sellers, and secures transmission (and other ancillary services) needed to complete the energy transaction.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Matches buyers and sellers, and secures transmission (and other ancillary services) needed to complete the energy transaction.' Profile\040documentation='Matches buyers and sellers, and secures transmission (and other ancillary services) needed to complete the energy transaction.'"
 * @generated
 */
public interface Marketer extends ErpOrganisation {
	/**
	 * Returns the value of the '<em><b>Resells Energy Product</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getResoldBy_Marketers <em>Resold By Marketers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resells Energy Product</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resells Energy Product</em>' reference list.
	 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getMarketer_Resells_EnergyProduct()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getResoldBy_Marketers
	 * @model opposite="ResoldBy_Marketers"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Marketer may resell an EnergyProduct.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Marketer may resell an EnergyProduct.'"
	 * @generated
	 */
	EList<EnergyProduct> getResells_EnergyProduct();

	/**
	 * Returns the value of the '<em><b>Held By</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.Reservation.ServiceReservation}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.Reservation.ServiceReservation#getHolds <em>Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Held By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Held By</em>' reference list.
	 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getMarketer_HeldBy()
	 * @see CIM.IEC61970.Informative.Reservation.ServiceReservation#getHolds
	 * @model opposite="Holds"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Marketer holds title to a ServiceReservation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Marketer holds title to a ServiceReservation.'"
	 * @generated
	 */
	EList<ServiceReservation> getHeldBy();

	/**
	 * Returns the value of the '<em><b>Holds Title To Energy Products</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getTitleHeldBy_Marketer <em>Title Held By Marketer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holds Title To Energy Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holds Title To Energy Products</em>' reference list.
	 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getMarketer_HoldsTitleTo_EnergyProducts()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getTitleHeldBy_Marketer
	 * @model opposite="TitleHeldBy_Marketer"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Marketer holds title to an EnergyProduct.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Marketer holds title to an EnergyProduct.'"
	 * @generated
	 */
	EList<EnergyProduct> getHoldsTitleTo_EnergyProducts();

	/**
	 * Returns the value of the '<em><b>Resold By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.Reservation.ServiceReservation#getResells <em>Resells</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resold By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resold By</em>' reference.
	 * @see #setResoldBy(ServiceReservation)
	 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getMarketer_ResoldBy()
	 * @see CIM.IEC61970.Informative.Reservation.ServiceReservation#getResells
	 * @model opposite="Resells"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A ServiceReservation may be resold by a Marketer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A ServiceReservation may be resold by a Marketer.'"
	 * @generated
	 */
	ServiceReservation getResoldBy();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.Financial.Marketer#getResoldBy <em>Resold By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resold By</em>' reference.
	 * @see #getResoldBy()
	 * @generated
	 */
	void setResoldBy(ServiceReservation value);

} // Marketer
