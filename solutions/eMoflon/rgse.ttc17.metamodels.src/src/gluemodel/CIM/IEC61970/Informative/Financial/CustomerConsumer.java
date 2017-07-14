/**
 */
package gluemodel.CIM.IEC61970.Informative.Financial;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TieLine;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;

import gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Financial.CustomerConsumer#getTieLines <em>Tie Lines</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Financial.CustomerConsumer#getServicePoint <em>Service Point</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.Financial.FinancialPackage#getCustomerConsumer()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The energy buyer in the energy marketplace.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The energy buyer in the energy marketplace.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The energy buyer in the energy marketplace.' Profile\040documentation='The energy buyer in the energy marketplace.'"
 * @generated
 */
public interface CustomerConsumer extends ErpOrganisation {
	/**
	 * Returns the value of the '<em><b>Tie Lines</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TieLine}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TieLine#getCustomerConsumer <em>Customer Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tie Lines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tie Lines</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.Financial.FinancialPackage#getCustomerConsumer_TieLines()
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TieLine#getCustomerConsumer
	 * @model opposite="CustomerConsumer"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A  ControlAreaOperator or CustomerConsumer may ring their perimeter with metering, which can create a unique SubControlArea at the collection of metering points, called a TieLine.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A  ControlAreaOperator or CustomerConsumer may ring their perimeter with metering, which can create a unique SubControlArea at the collection of metering points, called a TieLine.'"
	 * @generated
	 */
	EList<TieLine> getTieLines();

	/**
	 * Returns the value of the '<em><b>Service Point</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getCustomerConsumer <em>Customer Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Point</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Point</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.Financial.FinancialPackage#getCustomerConsumer_ServicePoint()
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getCustomerConsumer
	 * @model opposite="CustomerConsumer"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A CustomerConsumer may have one or more ServicePoints.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A CustomerConsumer may have one or more ServicePoints.'"
	 * @generated
	 */
	EList<ServicePoint> getServicePoint();

} // CustomerConsumer
