/**
 */
package gluemodel.CIM.IEC61970.Informative.Financial;

import gluemodel.CIM.IEC61968.Common.Agreement;

import gluemodel.CIM.IEC61970.Informative.Reservation.AncillaryService;
import gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Access Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Financial.OpenAccessProduct#getProvidedBy_TransmissionService <em>Provided By Transmission Service</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Financial.OpenAccessProduct#getAncillaryServices <em>Ancillary Services</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.Financial.FinancialPackage#getOpenAccessProduct()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Contracts for services offered commercially.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Contracts for services offered commercially.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Contracts for services offered commercially.' Profile\040documentation='Contracts for services offered commercially.'"
 * @generated
 */
public interface OpenAccessProduct extends Agreement {
	/**
	 * Returns the value of the '<em><b>Provided By Transmission Service</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getTransContractFor <em>Trans Contract For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided By Transmission Service</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided By Transmission Service</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.Financial.FinancialPackage#getOpenAccessProduct_ProvidedBy_TransmissionService()
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService#getTransContractFor
	 * @model opposite="TransContractFor"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A TransmissionService is sold according to the terms of a particular OpenAccessProduct agreement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A TransmissionService is sold according to the terms of a particular OpenAccessProduct agreement.'"
	 * @generated
	 */
	EList<TransmissionService> getProvidedBy_TransmissionService();

	/**
	 * Returns the value of the '<em><b>Ancillary Services</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.Reservation.AncillaryService}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Reservation.AncillaryService#getOpenAccessProduct <em>Open Access Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ancillary Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ancillary Services</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.Financial.FinancialPackage#getOpenAccessProduct_AncillaryServices()
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.AncillaryService#getOpenAccessProduct
	 * @model opposite="OpenAccessProduct"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='AncillaryServices are sold through a contract which offers a particular OpenAccessProduct.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='AncillaryServices are sold through a contract which offers a particular OpenAccessProduct.'"
	 * @generated
	 */
	EList<AncillaryService> getAncillaryServices();

} // OpenAccessProduct
